package com.sentinel.session.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: sentinel/session/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sentinel.session.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> getQuerySessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySessions",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionsRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> getQuerySessionsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> getQuerySessionsMethod;
    if ((getQuerySessionsMethod = QueryServiceGrpc.getQuerySessionsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionsMethod = QueryServiceGrpc.getQuerySessionsMethod) == null) {
          QueryServiceGrpc.getQuerySessionsMethod = getQuerySessionsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionsRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySessions"))
              .build();
        }
      }
    }
    return getQuerySessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> getQuerySessionsForAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySessionsForAccount",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> getQuerySessionsForAccountMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> getQuerySessionsForAccountMethod;
    if ((getQuerySessionsForAccountMethod = QueryServiceGrpc.getQuerySessionsForAccountMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionsForAccountMethod = QueryServiceGrpc.getQuerySessionsForAccountMethod) == null) {
          QueryServiceGrpc.getQuerySessionsForAccountMethod = getQuerySessionsForAccountMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySessionsForAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySessionsForAccount"))
              .build();
        }
      }
    }
    return getQuerySessionsForAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> getQuerySessionsForNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySessionsForNode",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> getQuerySessionsForNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> getQuerySessionsForNodeMethod;
    if ((getQuerySessionsForNodeMethod = QueryServiceGrpc.getQuerySessionsForNodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionsForNodeMethod = QueryServiceGrpc.getQuerySessionsForNodeMethod) == null) {
          QueryServiceGrpc.getQuerySessionsForNodeMethod = getQuerySessionsForNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySessionsForNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySessionsForNode"))
              .build();
        }
      }
    }
    return getQuerySessionsForNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> getQuerySessionsForSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySessionsForSubscription",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> getQuerySessionsForSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> getQuerySessionsForSubscriptionMethod;
    if ((getQuerySessionsForSubscriptionMethod = QueryServiceGrpc.getQuerySessionsForSubscriptionMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionsForSubscriptionMethod = QueryServiceGrpc.getQuerySessionsForSubscriptionMethod) == null) {
          QueryServiceGrpc.getQuerySessionsForSubscriptionMethod = getQuerySessionsForSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySessionsForSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySessionsForSubscription"))
              .build();
        }
      }
    }
    return getQuerySessionsForSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> getQuerySessionsForAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySessionsForAllocation",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> getQuerySessionsForAllocationMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> getQuerySessionsForAllocationMethod;
    if ((getQuerySessionsForAllocationMethod = QueryServiceGrpc.getQuerySessionsForAllocationMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionsForAllocationMethod = QueryServiceGrpc.getQuerySessionsForAllocationMethod) == null) {
          QueryServiceGrpc.getQuerySessionsForAllocationMethod = getQuerySessionsForAllocationMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest, com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySessionsForAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySessionsForAllocation"))
              .build();
        }
      }
    }
    return getQuerySessionsForAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionResponse> getQuerySessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySession",
      requestType = com.sentinel.session.v2.QuerierProto.QuerySessionRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QuerySessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionRequest,
      com.sentinel.session.v2.QuerierProto.QuerySessionResponse> getQuerySessionMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QuerySessionRequest, com.sentinel.session.v2.QuerierProto.QuerySessionResponse> getQuerySessionMethod;
    if ((getQuerySessionMethod = QueryServiceGrpc.getQuerySessionMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySessionMethod = QueryServiceGrpc.getQuerySessionMethod) == null) {
          QueryServiceGrpc.getQuerySessionMethod = getQuerySessionMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QuerySessionRequest, com.sentinel.session.v2.QuerierProto.QuerySessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QuerySessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySession"))
              .build();
        }
      }
    }
    return getQuerySessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QueryParamsRequest,
      com.sentinel.session.v2.QuerierProto.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.sentinel.session.v2.QuerierProto.QueryParamsRequest.class,
      responseType = com.sentinel.session.v2.QuerierProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QueryParamsRequest,
      com.sentinel.session.v2.QuerierProto.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.session.v2.QuerierProto.QueryParamsRequest, com.sentinel.session.v2.QuerierProto.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
          QueryServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.session.v2.QuerierProto.QueryParamsRequest, com.sentinel.session.v2.QuerierProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.session.v2.QuerierProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void querySessions(com.sentinel.session.v2.QuerierProto.QuerySessionsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionsMethod(), responseObserver);
    }

    /**
     */
    default void querySessionsForAccount(com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionsForAccountMethod(), responseObserver);
    }

    /**
     */
    default void querySessionsForNode(com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionsForNodeMethod(), responseObserver);
    }

    /**
     */
    default void querySessionsForSubscription(com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionsForSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void querySessionsForAllocation(com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionsForAllocationMethod(), responseObserver);
    }

    /**
     */
    default void querySession(com.sentinel.session.v2.QuerierProto.QuerySessionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySessionMethod(), responseObserver);
    }

    /**
     */
    default void queryParams(com.sentinel.session.v2.QuerierProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void querySessions(com.sentinel.session.v2.QuerierProto.QuerySessionsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySessionsForAccount(com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionsForAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySessionsForNode(com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionsForNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySessionsForSubscription(com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionsForSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySessionsForAllocation(com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionsForAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySession(com.sentinel.session.v2.QuerierProto.QuerySessionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParams(com.sentinel.session.v2.QuerierProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionsResponse querySessions(com.sentinel.session.v2.QuerierProto.QuerySessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse querySessionsForAccount(com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionsForAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse querySessionsForNode(com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionsForNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse querySessionsForSubscription(com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionsForSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse querySessionsForAllocation(com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionsForAllocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QuerySessionResponse querySession(com.sentinel.session.v2.QuerierProto.QuerySessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.session.v2.QuerierProto.QueryParamsResponse queryParams(com.sentinel.session.v2.QuerierProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionsResponse> querySessions(
        com.sentinel.session.v2.QuerierProto.QuerySessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse> querySessionsForAccount(
        com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionsForAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse> querySessionsForNode(
        com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionsForNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse> querySessionsForSubscription(
        com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionsForSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse> querySessionsForAllocation(
        com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionsForAllocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QuerySessionResponse> querySession(
        com.sentinel.session.v2.QuerierProto.QuerySessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.session.v2.QuerierProto.QueryParamsResponse> queryParams(
        com.sentinel.session.v2.QuerierProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_SESSIONS = 0;
  private static final int METHODID_QUERY_SESSIONS_FOR_ACCOUNT = 1;
  private static final int METHODID_QUERY_SESSIONS_FOR_NODE = 2;
  private static final int METHODID_QUERY_SESSIONS_FOR_SUBSCRIPTION = 3;
  private static final int METHODID_QUERY_SESSIONS_FOR_ALLOCATION = 4;
  private static final int METHODID_QUERY_SESSION = 5;
  private static final int METHODID_QUERY_PARAMS = 6;

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
        case METHODID_QUERY_SESSIONS:
          serviceImpl.querySessions((com.sentinel.session.v2.QuerierProto.QuerySessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SESSIONS_FOR_ACCOUNT:
          serviceImpl.querySessionsForAccount((com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse>) responseObserver);
          break;
        case METHODID_QUERY_SESSIONS_FOR_NODE:
          serviceImpl.querySessionsForNode((com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse>) responseObserver);
          break;
        case METHODID_QUERY_SESSIONS_FOR_SUBSCRIPTION:
          serviceImpl.querySessionsForSubscription((com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse>) responseObserver);
          break;
        case METHODID_QUERY_SESSIONS_FOR_ALLOCATION:
          serviceImpl.querySessionsForAllocation((com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse>) responseObserver);
          break;
        case METHODID_QUERY_SESSION:
          serviceImpl.querySession((com.sentinel.session.v2.QuerierProto.QuerySessionRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QuerySessionResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((com.sentinel.session.v2.QuerierProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.session.v2.QuerierProto.QueryParamsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getQuerySessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionsRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionsResponse>(
                service, METHODID_QUERY_SESSIONS)))
        .addMethod(
          getQuerySessionsForAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionsForAccountResponse>(
                service, METHODID_QUERY_SESSIONS_FOR_ACCOUNT)))
        .addMethod(
          getQuerySessionsForNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionsForNodeResponse>(
                service, METHODID_QUERY_SESSIONS_FOR_NODE)))
        .addMethod(
          getQuerySessionsForSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionsForSubscriptionResponse>(
                service, METHODID_QUERY_SESSIONS_FOR_SUBSCRIPTION)))
        .addMethod(
          getQuerySessionsForAllocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionsForAllocationResponse>(
                service, METHODID_QUERY_SESSIONS_FOR_ALLOCATION)))
        .addMethod(
          getQuerySessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QuerySessionRequest,
              com.sentinel.session.v2.QuerierProto.QuerySessionResponse>(
                service, METHODID_QUERY_SESSION)))
        .addMethod(
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.session.v2.QuerierProto.QueryParamsRequest,
              com.sentinel.session.v2.QuerierProto.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.session.v2.QuerierProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getQuerySessionsMethod())
              .addMethod(getQuerySessionsForAccountMethod())
              .addMethod(getQuerySessionsForNodeMethod())
              .addMethod(getQuerySessionsForSubscriptionMethod())
              .addMethod(getQuerySessionsForAllocationMethod())
              .addMethod(getQuerySessionMethod())
              .addMethod(getQueryParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
