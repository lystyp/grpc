package com.learn;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.learn.RestaurantProto.*;
import com.learn.RestaurantServiceGrpc.*;

import java.util.Scanner;

public class RestaurantInfo {

    public static void main(String[] args) {
        // 創建 gRPC 通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8889)
                .usePlaintext()
                .build();

        // 創建存根
        RestaurantServiceBlockingStub blockingStub = RestaurantServiceGrpc.newBlockingStub(channel);

        EmptyRequest request = EmptyRequest.newBuilder().build();
        RestaurantProto.RestaurantInfo response = blockingStub.getRestaurantInfo(request);
        System.out.println("Restaurant Info:\n" + response);

        channel.shutdown();
    }
}
