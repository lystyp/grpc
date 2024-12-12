package com.learn;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.learn.RestaurantServiceGrpc.*;
import com.learn.RestaurantProto.*;

import static com.learn.RestaurantServiceGrpc.newStub;

public class PlaceOrder {
    public static void main(String[] args) {
        // 創建 gRPC 通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8889)
                .usePlaintext()
                .build();

        // 創建存根
        RestaurantServiceStub asyncStub = newStub(channel);
        StreamObserver<OrderItem> requestObserver = asyncStub.placeOrder(new StreamObserver<>() {
            float total = 0.0f;

            @Override
            public void onNext(OrderSummary summary) {
                System.out.println("Total price: $" + summary.getTotalPrice());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Order completed.");
            }
        });

        String[] items = {"pizza", "burger", "pasta"};
        for (String i : items) {
            OrderItem item = OrderItem.newBuilder()
                    .setName(i)
                    .setQuantity(2)
                    .build();
            requestObserver.onNext(item);
            System.out.println("Sending order: " + item.getName() + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        requestObserver.onCompleted();
        channel.shutdown();
        try {
            channel.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
