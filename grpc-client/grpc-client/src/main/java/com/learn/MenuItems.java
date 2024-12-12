package com.learn;

import com.learn.RestaurantProto.ChatMessage;
import com.learn.RestaurantProto.EmptyRequest;
import com.learn.RestaurantProto.OrderItem;
import com.learn.RestaurantProto.OrderSummary;
import com.learn.RestaurantServiceGrpc.RestaurantServiceBlockingStub;
import com.learn.RestaurantServiceGrpc.RestaurantServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class MenuItems {

    public static void main(String[] args) {
        // 創建 gRPC 通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8889)
                .usePlaintext()
                .build();

        // 創建存根
        RestaurantServiceBlockingStub blockingStub = RestaurantServiceGrpc.newBlockingStub(channel);

        EmptyRequest request = EmptyRequest.newBuilder().build();
        System.out.println("Menu Items:\n");
        blockingStub.getMenuItems(request).forEachRemaining(
                menuItem -> {
                    System.out.println(menuItem);
                }
        );

        channel.shutdown();
    }
}
