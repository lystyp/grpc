package com.learn;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.2)",
    comments = "Source: restaurant.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RestaurantServiceGrpc {

  private RestaurantServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RestaurantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest,
      com.learn.RestaurantProto.RestaurantInfo> getGetRestaurantInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRestaurantInfo",
      requestType = com.learn.RestaurantProto.EmptyRequest.class,
      responseType = com.learn.RestaurantProto.RestaurantInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest,
      com.learn.RestaurantProto.RestaurantInfo> getGetRestaurantInfoMethod() {
    io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest, com.learn.RestaurantProto.RestaurantInfo> getGetRestaurantInfoMethod;
    if ((getGetRestaurantInfoMethod = RestaurantServiceGrpc.getGetRestaurantInfoMethod) == null) {
      synchronized (RestaurantServiceGrpc.class) {
        if ((getGetRestaurantInfoMethod = RestaurantServiceGrpc.getGetRestaurantInfoMethod) == null) {
          RestaurantServiceGrpc.getGetRestaurantInfoMethod = getGetRestaurantInfoMethod =
              io.grpc.MethodDescriptor.<com.learn.RestaurantProto.EmptyRequest, com.learn.RestaurantProto.RestaurantInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRestaurantInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.RestaurantInfo.getDefaultInstance()))
              .setSchemaDescriptor(new RestaurantServiceMethodDescriptorSupplier("GetRestaurantInfo"))
              .build();
        }
      }
    }
    return getGetRestaurantInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest,
      com.learn.RestaurantProto.MenuItem> getGetMenuItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMenuItems",
      requestType = com.learn.RestaurantProto.EmptyRequest.class,
      responseType = com.learn.RestaurantProto.MenuItem.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest,
      com.learn.RestaurantProto.MenuItem> getGetMenuItemsMethod() {
    io.grpc.MethodDescriptor<com.learn.RestaurantProto.EmptyRequest, com.learn.RestaurantProto.MenuItem> getGetMenuItemsMethod;
    if ((getGetMenuItemsMethod = RestaurantServiceGrpc.getGetMenuItemsMethod) == null) {
      synchronized (RestaurantServiceGrpc.class) {
        if ((getGetMenuItemsMethod = RestaurantServiceGrpc.getGetMenuItemsMethod) == null) {
          RestaurantServiceGrpc.getGetMenuItemsMethod = getGetMenuItemsMethod =
              io.grpc.MethodDescriptor.<com.learn.RestaurantProto.EmptyRequest, com.learn.RestaurantProto.MenuItem>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMenuItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.MenuItem.getDefaultInstance()))
              .setSchemaDescriptor(new RestaurantServiceMethodDescriptorSupplier("GetMenuItems"))
              .build();
        }
      }
    }
    return getGetMenuItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learn.RestaurantProto.OrderItem,
      com.learn.RestaurantProto.OrderSummary> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceOrder",
      requestType = com.learn.RestaurantProto.OrderItem.class,
      responseType = com.learn.RestaurantProto.OrderSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.learn.RestaurantProto.OrderItem,
      com.learn.RestaurantProto.OrderSummary> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.learn.RestaurantProto.OrderItem, com.learn.RestaurantProto.OrderSummary> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = RestaurantServiceGrpc.getPlaceOrderMethod) == null) {
      synchronized (RestaurantServiceGrpc.class) {
        if ((getPlaceOrderMethod = RestaurantServiceGrpc.getPlaceOrderMethod) == null) {
          RestaurantServiceGrpc.getPlaceOrderMethod = getPlaceOrderMethod =
              io.grpc.MethodDescriptor.<com.learn.RestaurantProto.OrderItem, com.learn.RestaurantProto.OrderSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.OrderItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.OrderSummary.getDefaultInstance()))
              .setSchemaDescriptor(new RestaurantServiceMethodDescriptorSupplier("PlaceOrder"))
              .build();
        }
      }
    }
    return getPlaceOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.learn.RestaurantProto.ChatMessage,
      com.learn.RestaurantProto.ChatMessage> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chat",
      requestType = com.learn.RestaurantProto.ChatMessage.class,
      responseType = com.learn.RestaurantProto.ChatMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.learn.RestaurantProto.ChatMessage,
      com.learn.RestaurantProto.ChatMessage> getChatMethod() {
    io.grpc.MethodDescriptor<com.learn.RestaurantProto.ChatMessage, com.learn.RestaurantProto.ChatMessage> getChatMethod;
    if ((getChatMethod = RestaurantServiceGrpc.getChatMethod) == null) {
      synchronized (RestaurantServiceGrpc.class) {
        if ((getChatMethod = RestaurantServiceGrpc.getChatMethod) == null) {
          RestaurantServiceGrpc.getChatMethod = getChatMethod =
              io.grpc.MethodDescriptor.<com.learn.RestaurantProto.ChatMessage, com.learn.RestaurantProto.ChatMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.learn.RestaurantProto.ChatMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RestaurantServiceMethodDescriptorSupplier("Chat"))
              .build();
        }
      }
    }
    return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RestaurantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceStub>() {
        @java.lang.Override
        public RestaurantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestaurantServiceStub(channel, callOptions);
        }
      };
    return RestaurantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RestaurantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceBlockingStub>() {
        @java.lang.Override
        public RestaurantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestaurantServiceBlockingStub(channel, callOptions);
        }
      };
    return RestaurantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RestaurantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RestaurantServiceFutureStub>() {
        @java.lang.Override
        public RestaurantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RestaurantServiceFutureStub(channel, callOptions);
        }
      };
    return RestaurantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 單次請求-回應
     * </pre>
     */
    default void getRestaurantInfo(com.learn.RestaurantProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.RestaurantInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRestaurantInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * 伺服器端串流
     * </pre>
     */
    default void getMenuItems(com.learn.RestaurantProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.MenuItem> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMenuItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客戶端串流
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.learn.RestaurantProto.OrderItem> placeOrder(
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.OrderSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPlaceOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * 雙向串流
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.learn.RestaurantProto.ChatMessage> chat(
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.ChatMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RestaurantService.
   */
  public static abstract class RestaurantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RestaurantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RestaurantService.
   */
  public static final class RestaurantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RestaurantServiceStub> {
    private RestaurantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestaurantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestaurantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 單次請求-回應
     * </pre>
     */
    public void getRestaurantInfo(com.learn.RestaurantProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.RestaurantInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRestaurantInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 伺服器端串流
     * </pre>
     */
    public void getMenuItems(com.learn.RestaurantProto.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.MenuItem> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMenuItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客戶端串流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.learn.RestaurantProto.OrderItem> placeOrder(
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.OrderSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 雙向串流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.learn.RestaurantProto.ChatMessage> chat(
        io.grpc.stub.StreamObserver<com.learn.RestaurantProto.ChatMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RestaurantService.
   */
  public static final class RestaurantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RestaurantServiceBlockingStub> {
    private RestaurantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestaurantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestaurantServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 單次請求-回應
     * </pre>
     */
    public com.learn.RestaurantProto.RestaurantInfo getRestaurantInfo(com.learn.RestaurantProto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRestaurantInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 伺服器端串流
     * </pre>
     */
    public java.util.Iterator<com.learn.RestaurantProto.MenuItem> getMenuItems(
        com.learn.RestaurantProto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMenuItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RestaurantService.
   */
  public static final class RestaurantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RestaurantServiceFutureStub> {
    private RestaurantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RestaurantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RestaurantServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 單次請求-回應
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.learn.RestaurantProto.RestaurantInfo> getRestaurantInfo(
        com.learn.RestaurantProto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRestaurantInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESTAURANT_INFO = 0;
  private static final int METHODID_GET_MENU_ITEMS = 1;
  private static final int METHODID_PLACE_ORDER = 2;
  private static final int METHODID_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESTAURANT_INFO:
          serviceImpl.getRestaurantInfo((com.learn.RestaurantProto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.learn.RestaurantProto.RestaurantInfo>) responseObserver);
          break;
        case METHODID_GET_MENU_ITEMS:
          serviceImpl.getMenuItems((com.learn.RestaurantProto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.learn.RestaurantProto.MenuItem>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.placeOrder(
              (io.grpc.stub.StreamObserver<com.learn.RestaurantProto.OrderSummary>) responseObserver);
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<com.learn.RestaurantProto.ChatMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetRestaurantInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.learn.RestaurantProto.EmptyRequest,
              com.learn.RestaurantProto.RestaurantInfo>(
                service, METHODID_GET_RESTAURANT_INFO)))
        .addMethod(
          getGetMenuItemsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.learn.RestaurantProto.EmptyRequest,
              com.learn.RestaurantProto.MenuItem>(
                service, METHODID_GET_MENU_ITEMS)))
        .addMethod(
          getPlaceOrderMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.learn.RestaurantProto.OrderItem,
              com.learn.RestaurantProto.OrderSummary>(
                service, METHODID_PLACE_ORDER)))
        .addMethod(
          getChatMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.learn.RestaurantProto.ChatMessage,
              com.learn.RestaurantProto.ChatMessage>(
                service, METHODID_CHAT)))
        .build();
  }

  private static abstract class RestaurantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RestaurantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.learn.RestaurantProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RestaurantService");
    }
  }

  private static final class RestaurantServiceFileDescriptorSupplier
      extends RestaurantServiceBaseDescriptorSupplier {
    RestaurantServiceFileDescriptorSupplier() {}
  }

  private static final class RestaurantServiceMethodDescriptorSupplier
      extends RestaurantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RestaurantServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RestaurantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RestaurantServiceFileDescriptorSupplier())
              .addMethod(getGetRestaurantInfoMethod())
              .addMethod(getGetMenuItemsMethod())
              .addMethod(getPlaceOrderMethod())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
