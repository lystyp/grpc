package com.learn;

import com.learn.RestaurantProto.*;
import com.learn.RestaurantServiceGrpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

import static com.learn.RestaurantServiceGrpc.newStub;

public class Chat {
    public static void main(String[] args) {
        // 創建 gRPC 通道
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8889)
                .usePlaintext()
                .build();

        // 創建存根
        RestaurantServiceStub asyncStub = newStub(channel);

        StreamObserver<ChatMessage> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(ChatMessage message) {
                System.out.println(message.getSender() + ": " + message.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Chat ended.");
            }
        };

        StreamObserver<ChatMessage> requestObserver = asyncStub.chat(responseObserver);

        System.out.println("Start chatting! Type 'exit' to end.");

        // 擷取terminal輸入
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) break;

            ChatMessage chatMessage = ChatMessage.newBuilder()
                    .setSender("Client")
                    .setMessage(message)
                    .build();
            requestObserver.onNext(chatMessage);
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
