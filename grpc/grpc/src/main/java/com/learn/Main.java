package com.learn;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 創建 gRPC 伺服器
        Server server = ServerBuilder.forPort(8889)
                .addService(new RestaurantServiceImpl())
                .build();

        // 啟動伺服器
        System.out.println("Server is starting...");
        server.start();
        System.out.println("Server started on port 8888");

        // 阻塞運行
        server.awaitTermination();
    }



}