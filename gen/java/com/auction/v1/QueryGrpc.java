package com.auction.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sommelier/auction/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "auction.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryParamsRequest,
      com.auction.v1.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.auction.v1.QueryParamsRequest.class,
      responseType = com.auction.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryParamsRequest,
      com.auction.v1.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryParamsRequest, com.auction.v1.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryParamsMethod = QueryGrpc.getQueryParamsMethod) == null) {
          QueryGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryParamsRequest, com.auction.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionRequest,
      com.auction.v1.QueryActiveAuctionResponse> getQueryActiveAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryActiveAuction",
      requestType = com.auction.v1.QueryActiveAuctionRequest.class,
      responseType = com.auction.v1.QueryActiveAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionRequest,
      com.auction.v1.QueryActiveAuctionResponse> getQueryActiveAuctionMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionRequest, com.auction.v1.QueryActiveAuctionResponse> getQueryActiveAuctionMethod;
    if ((getQueryActiveAuctionMethod = QueryGrpc.getQueryActiveAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryActiveAuctionMethod = QueryGrpc.getQueryActiveAuctionMethod) == null) {
          QueryGrpc.getQueryActiveAuctionMethod = getQueryActiveAuctionMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryActiveAuctionRequest, com.auction.v1.QueryActiveAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryActiveAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryActiveAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryActiveAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryActiveAuction"))
              .build();
        }
      }
    }
    return getQueryActiveAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionRequest,
      com.auction.v1.QueryEndedAuctionResponse> getQueryEndedAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryEndedAuction",
      requestType = com.auction.v1.QueryEndedAuctionRequest.class,
      responseType = com.auction.v1.QueryEndedAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionRequest,
      com.auction.v1.QueryEndedAuctionResponse> getQueryEndedAuctionMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionRequest, com.auction.v1.QueryEndedAuctionResponse> getQueryEndedAuctionMethod;
    if ((getQueryEndedAuctionMethod = QueryGrpc.getQueryEndedAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryEndedAuctionMethod = QueryGrpc.getQueryEndedAuctionMethod) == null) {
          QueryGrpc.getQueryEndedAuctionMethod = getQueryEndedAuctionMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryEndedAuctionRequest, com.auction.v1.QueryEndedAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryEndedAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryEndedAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryEndedAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryEndedAuction"))
              .build();
        }
      }
    }
    return getQueryEndedAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionsRequest,
      com.auction.v1.QueryActiveAuctionsResponse> getQueryActiveAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryActiveAuctions",
      requestType = com.auction.v1.QueryActiveAuctionsRequest.class,
      responseType = com.auction.v1.QueryActiveAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionsRequest,
      com.auction.v1.QueryActiveAuctionsResponse> getQueryActiveAuctionsMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryActiveAuctionsRequest, com.auction.v1.QueryActiveAuctionsResponse> getQueryActiveAuctionsMethod;
    if ((getQueryActiveAuctionsMethod = QueryGrpc.getQueryActiveAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryActiveAuctionsMethod = QueryGrpc.getQueryActiveAuctionsMethod) == null) {
          QueryGrpc.getQueryActiveAuctionsMethod = getQueryActiveAuctionsMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryActiveAuctionsRequest, com.auction.v1.QueryActiveAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryActiveAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryActiveAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryActiveAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryActiveAuctions"))
              .build();
        }
      }
    }
    return getQueryActiveAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionsRequest,
      com.auction.v1.QueryEndedAuctionsResponse> getQueryEndedAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryEndedAuctions",
      requestType = com.auction.v1.QueryEndedAuctionsRequest.class,
      responseType = com.auction.v1.QueryEndedAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionsRequest,
      com.auction.v1.QueryEndedAuctionsResponse> getQueryEndedAuctionsMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryEndedAuctionsRequest, com.auction.v1.QueryEndedAuctionsResponse> getQueryEndedAuctionsMethod;
    if ((getQueryEndedAuctionsMethod = QueryGrpc.getQueryEndedAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryEndedAuctionsMethod = QueryGrpc.getQueryEndedAuctionsMethod) == null) {
          QueryGrpc.getQueryEndedAuctionsMethod = getQueryEndedAuctionsMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryEndedAuctionsRequest, com.auction.v1.QueryEndedAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryEndedAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryEndedAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryEndedAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryEndedAuctions"))
              .build();
        }
      }
    }
    return getQueryEndedAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryBidRequest,
      com.auction.v1.QueryBidResponse> getQueryBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryBid",
      requestType = com.auction.v1.QueryBidRequest.class,
      responseType = com.auction.v1.QueryBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryBidRequest,
      com.auction.v1.QueryBidResponse> getQueryBidMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryBidRequest, com.auction.v1.QueryBidResponse> getQueryBidMethod;
    if ((getQueryBidMethod = QueryGrpc.getQueryBidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryBidMethod = QueryGrpc.getQueryBidMethod) == null) {
          QueryGrpc.getQueryBidMethod = getQueryBidMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryBidRequest, com.auction.v1.QueryBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryBid"))
              .build();
        }
      }
    }
    return getQueryBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.auction.v1.QueryBidsByAuctionRequest,
      com.auction.v1.QueryBidsByAuctionResponse> getQueryBidsByAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryBidsByAuction",
      requestType = com.auction.v1.QueryBidsByAuctionRequest.class,
      responseType = com.auction.v1.QueryBidsByAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.auction.v1.QueryBidsByAuctionRequest,
      com.auction.v1.QueryBidsByAuctionResponse> getQueryBidsByAuctionMethod() {
    io.grpc.MethodDescriptor<com.auction.v1.QueryBidsByAuctionRequest, com.auction.v1.QueryBidsByAuctionResponse> getQueryBidsByAuctionMethod;
    if ((getQueryBidsByAuctionMethod = QueryGrpc.getQueryBidsByAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryBidsByAuctionMethod = QueryGrpc.getQueryBidsByAuctionMethod) == null) {
          QueryGrpc.getQueryBidsByAuctionMethod = getQueryBidsByAuctionMethod =
              io.grpc.MethodDescriptor.<com.auction.v1.QueryBidsByAuctionRequest, com.auction.v1.QueryBidsByAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryBidsByAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryBidsByAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.auction.v1.QueryBidsByAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryBidsByAuction"))
              .build();
        }
      }
    }
    return getQueryBidsByAuctionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void queryParams(com.auction.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryActiveAuction(com.auction.v1.QueryActiveAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryActiveAuctionMethod(), responseObserver);
    }

    /**
     */
    default void queryEndedAuction(com.auction.v1.QueryEndedAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryEndedAuctionMethod(), responseObserver);
    }

    /**
     */
    default void queryActiveAuctions(com.auction.v1.QueryActiveAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryActiveAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void queryEndedAuctions(com.auction.v1.QueryEndedAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryEndedAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void queryBid(com.auction.v1.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryBidMethod(), responseObserver);
    }

    /**
     */
    default void queryBidsByAuction(com.auction.v1.QueryBidsByAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryBidsByAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryBidsByAuctionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     */
    public void queryParams(com.auction.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryActiveAuction(com.auction.v1.QueryActiveAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryActiveAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryEndedAuction(com.auction.v1.QueryEndedAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryEndedAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryActiveAuctions(com.auction.v1.QueryActiveAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryActiveAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryEndedAuctions(com.auction.v1.QueryEndedAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryEndedAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBid(com.auction.v1.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBidsByAuction(com.auction.v1.QueryBidsByAuctionRequest request,
        io.grpc.stub.StreamObserver<com.auction.v1.QueryBidsByAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryBidsByAuctionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.auction.v1.QueryParamsResponse queryParams(com.auction.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryActiveAuctionResponse queryActiveAuction(com.auction.v1.QueryActiveAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryActiveAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryEndedAuctionResponse queryEndedAuction(com.auction.v1.QueryEndedAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryEndedAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryActiveAuctionsResponse queryActiveAuctions(com.auction.v1.QueryActiveAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryActiveAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryEndedAuctionsResponse queryEndedAuctions(com.auction.v1.QueryEndedAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryEndedAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryBidResponse queryBid(com.auction.v1.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryBidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.auction.v1.QueryBidsByAuctionResponse queryBidsByAuction(com.auction.v1.QueryBidsByAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryBidsByAuctionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryParamsResponse> queryParams(
        com.auction.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryActiveAuctionResponse> queryActiveAuction(
        com.auction.v1.QueryActiveAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryActiveAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryEndedAuctionResponse> queryEndedAuction(
        com.auction.v1.QueryEndedAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryEndedAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryActiveAuctionsResponse> queryActiveAuctions(
        com.auction.v1.QueryActiveAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryActiveAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryEndedAuctionsResponse> queryEndedAuctions(
        com.auction.v1.QueryEndedAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryEndedAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryBidResponse> queryBid(
        com.auction.v1.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryBidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.auction.v1.QueryBidsByAuctionResponse> queryBidsByAuction(
        com.auction.v1.QueryBidsByAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryBidsByAuctionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PARAMS = 0;
  private static final int METHODID_QUERY_ACTIVE_AUCTION = 1;
  private static final int METHODID_QUERY_ENDED_AUCTION = 2;
  private static final int METHODID_QUERY_ACTIVE_AUCTIONS = 3;
  private static final int METHODID_QUERY_ENDED_AUCTIONS = 4;
  private static final int METHODID_QUERY_BID = 5;
  private static final int METHODID_QUERY_BIDS_BY_AUCTION = 6;

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
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((com.auction.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ACTIVE_AUCTION:
          serviceImpl.queryActiveAuction((com.auction.v1.QueryActiveAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_ENDED_AUCTION:
          serviceImpl.queryEndedAuction((com.auction.v1.QueryEndedAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_ACTIVE_AUCTIONS:
          serviceImpl.queryActiveAuctions((com.auction.v1.QueryActiveAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryActiveAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ENDED_AUCTIONS:
          serviceImpl.queryEndedAuctions((com.auction.v1.QueryEndedAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryEndedAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_BID:
          serviceImpl.queryBid((com.auction.v1.QueryBidRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryBidResponse>) responseObserver);
          break;
        case METHODID_QUERY_BIDS_BY_AUCTION:
          serviceImpl.queryBidsByAuction((com.auction.v1.QueryBidsByAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.auction.v1.QueryBidsByAuctionResponse>) responseObserver);
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
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryParamsRequest,
              com.auction.v1.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .addMethod(
          getQueryActiveAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryActiveAuctionRequest,
              com.auction.v1.QueryActiveAuctionResponse>(
                service, METHODID_QUERY_ACTIVE_AUCTION)))
        .addMethod(
          getQueryEndedAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryEndedAuctionRequest,
              com.auction.v1.QueryEndedAuctionResponse>(
                service, METHODID_QUERY_ENDED_AUCTION)))
        .addMethod(
          getQueryActiveAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryActiveAuctionsRequest,
              com.auction.v1.QueryActiveAuctionsResponse>(
                service, METHODID_QUERY_ACTIVE_AUCTIONS)))
        .addMethod(
          getQueryEndedAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryEndedAuctionsRequest,
              com.auction.v1.QueryEndedAuctionsResponse>(
                service, METHODID_QUERY_ENDED_AUCTIONS)))
        .addMethod(
          getQueryBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryBidRequest,
              com.auction.v1.QueryBidResponse>(
                service, METHODID_QUERY_BID)))
        .addMethod(
          getQueryBidsByAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.auction.v1.QueryBidsByAuctionRequest,
              com.auction.v1.QueryBidsByAuctionResponse>(
                service, METHODID_QUERY_BIDS_BY_AUCTION)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.auction.v1.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getQueryParamsMethod())
              .addMethod(getQueryActiveAuctionMethod())
              .addMethod(getQueryEndedAuctionMethod())
              .addMethod(getQueryActiveAuctionsMethod())
              .addMethod(getQueryEndedAuctionsMethod())
              .addMethod(getQueryBidMethod())
              .addMethod(getQueryBidsByAuctionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
