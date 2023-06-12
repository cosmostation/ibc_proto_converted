package com.akash.market.v1beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/market/v1beta3/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "akash.market.v1beta3.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrdersRequest,
      com.akash.market.v1beta3.QueryOrdersResponse> getOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Orders",
      requestType = com.akash.market.v1beta3.QueryOrdersRequest.class,
      responseType = com.akash.market.v1beta3.QueryOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrdersRequest,
      com.akash.market.v1beta3.QueryOrdersResponse> getOrdersMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrdersRequest, com.akash.market.v1beta3.QueryOrdersResponse> getOrdersMethod;
    if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrdersMethod = QueryGrpc.getOrdersMethod) == null) {
          QueryGrpc.getOrdersMethod = getOrdersMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryOrdersRequest, com.akash.market.v1beta3.QueryOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Orders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Orders"))
              .build();
        }
      }
    }
    return getOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrderRequest,
      com.akash.market.v1beta3.QueryOrderResponse> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Order",
      requestType = com.akash.market.v1beta3.QueryOrderRequest.class,
      responseType = com.akash.market.v1beta3.QueryOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrderRequest,
      com.akash.market.v1beta3.QueryOrderResponse> getOrderMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryOrderRequest, com.akash.market.v1beta3.QueryOrderResponse> getOrderMethod;
    if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOrderMethod = QueryGrpc.getOrderMethod) == null) {
          QueryGrpc.getOrderMethod = getOrderMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryOrderRequest, com.akash.market.v1beta3.QueryOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Order"))
              .build();
        }
      }
    }
    return getOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidsRequest,
      com.akash.market.v1beta3.QueryBidsResponse> getBidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bids",
      requestType = com.akash.market.v1beta3.QueryBidsRequest.class,
      responseType = com.akash.market.v1beta3.QueryBidsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidsRequest,
      com.akash.market.v1beta3.QueryBidsResponse> getBidsMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidsRequest, com.akash.market.v1beta3.QueryBidsResponse> getBidsMethod;
    if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
          QueryGrpc.getBidsMethod = getBidsMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryBidsRequest, com.akash.market.v1beta3.QueryBidsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryBidsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryBidsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bids"))
              .build();
        }
      }
    }
    return getBidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidRequest,
      com.akash.market.v1beta3.QueryBidResponse> getBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bid",
      requestType = com.akash.market.v1beta3.QueryBidRequest.class,
      responseType = com.akash.market.v1beta3.QueryBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidRequest,
      com.akash.market.v1beta3.QueryBidResponse> getBidMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryBidRequest, com.akash.market.v1beta3.QueryBidResponse> getBidMethod;
    if ((getBidMethod = QueryGrpc.getBidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBidMethod = QueryGrpc.getBidMethod) == null) {
          QueryGrpc.getBidMethod = getBidMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryBidRequest, com.akash.market.v1beta3.QueryBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bid"))
              .build();
        }
      }
    }
    return getBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeasesRequest,
      com.akash.market.v1beta3.QueryLeasesResponse> getLeasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Leases",
      requestType = com.akash.market.v1beta3.QueryLeasesRequest.class,
      responseType = com.akash.market.v1beta3.QueryLeasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeasesRequest,
      com.akash.market.v1beta3.QueryLeasesResponse> getLeasesMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeasesRequest, com.akash.market.v1beta3.QueryLeasesResponse> getLeasesMethod;
    if ((getLeasesMethod = QueryGrpc.getLeasesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLeasesMethod = QueryGrpc.getLeasesMethod) == null) {
          QueryGrpc.getLeasesMethod = getLeasesMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryLeasesRequest, com.akash.market.v1beta3.QueryLeasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Leases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryLeasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryLeasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Leases"))
              .build();
        }
      }
    }
    return getLeasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeaseRequest,
      com.akash.market.v1beta3.QueryLeaseResponse> getLeaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lease",
      requestType = com.akash.market.v1beta3.QueryLeaseRequest.class,
      responseType = com.akash.market.v1beta3.QueryLeaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeaseRequest,
      com.akash.market.v1beta3.QueryLeaseResponse> getLeaseMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.QueryLeaseRequest, com.akash.market.v1beta3.QueryLeaseResponse> getLeaseMethod;
    if ((getLeaseMethod = QueryGrpc.getLeaseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLeaseMethod = QueryGrpc.getLeaseMethod) == null) {
          QueryGrpc.getLeaseMethod = getLeaseMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.QueryLeaseRequest, com.akash.market.v1beta3.QueryLeaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lease"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryLeaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.QueryLeaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Lease"))
              .build();
        }
      }
    }
    return getLeaseMethod;
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
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Orders queries orders with filters
     * </pre>
     */
    default void orders(com.akash.market.v1beta3.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Order queries order details
     * </pre>
     */
    default void order(com.akash.market.v1beta3.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bids queries bids with filters
     * </pre>
     */
    default void bids(com.akash.market.v1beta3.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bid queries bid details
     * </pre>
     */
    default void bid(com.akash.market.v1beta3.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Leases queries leases with filters
     * </pre>
     */
    default void leases(com.akash.market.v1beta3.QueryLeasesRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeasesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lease queries lease details
     * </pre>
     */
    default void lease(com.akash.market.v1beta3.QueryLeaseRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLeaseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
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
     * <pre>
     * Orders queries orders with filters
     * </pre>
     */
    public void orders(com.akash.market.v1beta3.QueryOrdersRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Order queries order details
     * </pre>
     */
    public void order(com.akash.market.v1beta3.QueryOrderRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bids queries bids with filters
     * </pre>
     */
    public void bids(com.akash.market.v1beta3.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bid queries bid details
     * </pre>
     */
    public void bid(com.akash.market.v1beta3.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Leases queries leases with filters
     * </pre>
     */
    public void leases(com.akash.market.v1beta3.QueryLeasesRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lease queries lease details
     * </pre>
     */
    public void lease(com.akash.market.v1beta3.QueryLeaseRequest request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLeaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
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
     * <pre>
     * Orders queries orders with filters
     * </pre>
     */
    public com.akash.market.v1beta3.QueryOrdersResponse orders(com.akash.market.v1beta3.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Order queries order details
     * </pre>
     */
    public com.akash.market.v1beta3.QueryOrderResponse order(com.akash.market.v1beta3.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bids queries bids with filters
     * </pre>
     */
    public com.akash.market.v1beta3.QueryBidsResponse bids(com.akash.market.v1beta3.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bid queries bid details
     * </pre>
     */
    public com.akash.market.v1beta3.QueryBidResponse bid(com.akash.market.v1beta3.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Leases queries leases with filters
     * </pre>
     */
    public com.akash.market.v1beta3.QueryLeasesResponse leases(com.akash.market.v1beta3.QueryLeasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lease queries lease details
     * </pre>
     */
    public com.akash.market.v1beta3.QueryLeaseResponse lease(com.akash.market.v1beta3.QueryLeaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLeaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
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
     * <pre>
     * Orders queries orders with filters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryOrdersResponse> orders(
        com.akash.market.v1beta3.QueryOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Order queries order details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryOrderResponse> order(
        com.akash.market.v1beta3.QueryOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bids queries bids with filters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryBidsResponse> bids(
        com.akash.market.v1beta3.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bid queries bid details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryBidResponse> bid(
        com.akash.market.v1beta3.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Leases queries leases with filters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryLeasesResponse> leases(
        com.akash.market.v1beta3.QueryLeasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lease queries lease details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.QueryLeaseResponse> lease(
        com.akash.market.v1beta3.QueryLeaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLeaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDERS = 0;
  private static final int METHODID_ORDER = 1;
  private static final int METHODID_BIDS = 2;
  private static final int METHODID_BID = 3;
  private static final int METHODID_LEASES = 4;
  private static final int METHODID_LEASE = 5;

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
        case METHODID_ORDERS:
          serviceImpl.orders((com.akash.market.v1beta3.QueryOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrdersResponse>) responseObserver);
          break;
        case METHODID_ORDER:
          serviceImpl.order((com.akash.market.v1beta3.QueryOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryOrderResponse>) responseObserver);
          break;
        case METHODID_BIDS:
          serviceImpl.bids((com.akash.market.v1beta3.QueryBidsRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidsResponse>) responseObserver);
          break;
        case METHODID_BID:
          serviceImpl.bid((com.akash.market.v1beta3.QueryBidRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryBidResponse>) responseObserver);
          break;
        case METHODID_LEASES:
          serviceImpl.leases((com.akash.market.v1beta3.QueryLeasesRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeasesResponse>) responseObserver);
          break;
        case METHODID_LEASE:
          serviceImpl.lease((com.akash.market.v1beta3.QueryLeaseRequest) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.QueryLeaseResponse>) responseObserver);
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
          getOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryOrdersRequest,
              com.akash.market.v1beta3.QueryOrdersResponse>(
                service, METHODID_ORDERS)))
        .addMethod(
          getOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryOrderRequest,
              com.akash.market.v1beta3.QueryOrderResponse>(
                service, METHODID_ORDER)))
        .addMethod(
          getBidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryBidsRequest,
              com.akash.market.v1beta3.QueryBidsResponse>(
                service, METHODID_BIDS)))
        .addMethod(
          getBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryBidRequest,
              com.akash.market.v1beta3.QueryBidResponse>(
                service, METHODID_BID)))
        .addMethod(
          getLeasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryLeasesRequest,
              com.akash.market.v1beta3.QueryLeasesResponse>(
                service, METHODID_LEASES)))
        .addMethod(
          getLeaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.QueryLeaseRequest,
              com.akash.market.v1beta3.QueryLeaseResponse>(
                service, METHODID_LEASE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.market.v1beta3.QueryProto.getDescriptor();
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
              .addMethod(getOrdersMethod())
              .addMethod(getOrderMethod())
              .addMethod(getBidsMethod())
              .addMethod(getBidMethod())
              .addMethod(getLeasesMethod())
              .addMethod(getLeaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
