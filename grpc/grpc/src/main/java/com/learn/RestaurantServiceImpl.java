package com.learn;

import io.grpc.stub.StreamObserver;
import com.learn.RestaurantProto.*;
import com.learn.RestaurantServiceGrpc.*;

// 實現 RestaurantService 定義的所有 RPC 方法
class RestaurantServiceImpl extends RestaurantServiceImplBase {

    // 單次請求-回應：獲取餐廳資訊
    @Override
    public void getRestaurantInfo(EmptyRequest request, StreamObserver<RestaurantInfo> responseObserver) {
        RestaurantInfo info = RestaurantInfo.newBuilder()
                .setName("Delicious Eats")
                .setAddress("123 Main Street, Foodville")
                .setHours("9:00 AM - 9:00 PM")
                .build();

        responseObserver.onNext(info); // 發送回應
        responseObserver.onCompleted(); // 完成
    }


    // 伺服器端串流：返回菜單項目
    @Override
    public void getMenuItems(EmptyRequest request, StreamObserver<MenuItem> responseObserver) {
        String[] menuNames = {"pizza", "burger", "pasta", "salad"};
        float[] menuPrices = {12.5f, 8.0f, 10.0f, 6.5f};

        for (int i = 0; i < menuNames.length; i++) {
            MenuItem item = MenuItem.newBuilder()
                    .setName(menuNames[i])
                    .setPrice(menuPrices[i])
                    .build();
            responseObserver.onNext(item);
            try {
                Thread.sleep(1000);// 發送每條菜單項目
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted(); // 完成
    }

    // 客戶端串流：接收點餐訂單，計算總價
    @Override
    public StreamObserver<OrderItem> placeOrder(StreamObserver<OrderSummary> responseObserver) {
        return new StreamObserver<>() {
            float total = 0.0f;

            @Override
            public void onNext(OrderItem order) {
                System.out.println("Received order: " + order);
                float price = switch (order.getName().toLowerCase()) {
                    case "pizza" -> 12.5f;
                    case "burger" -> 8.0f;
                    case "pasta" -> 10.0f;
                    case "salad" -> 6.5f;
                    default -> 0.0f;

                };
                total += price * order.getQuantity(); // 計算總價
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                OrderSummary summary = OrderSummary.newBuilder()
                        .setTotalPrice(total)
                        .build();
                responseObserver.onNext(summary); // 發送總價
                responseObserver.onCompleted(); // 完成
            }
        };
    }

    // 雙向串流：聊天
    @Override
    public StreamObserver<ChatMessage> chat(StreamObserver<ChatMessage> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(ChatMessage message) {
                System.out.println("Received message: " + message.getSender() + ": " + message.getMessage());

                // 回應消息
                ChatMessage response = ChatMessage.newBuilder()
                        .setSender("Server")
                        .setMessage("You said: " + message.getMessage())
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Chat ended.");
                responseObserver.onCompleted(); // 完成
            }
        };
    }
}