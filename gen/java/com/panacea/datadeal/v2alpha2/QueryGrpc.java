package com.panacea.datadeal.v2alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/datadeal/v2alpha2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.datadeal.v2alpha2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> getDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deal",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> getDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> getDealMethod;
    if ((getDealMethod = QueryGrpc.getDealMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDealMethod = QueryGrpc.getDealMethod) == null) {
          QueryGrpc.getDealMethod = getDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deal"))
              .build();
        }
      }
    }
    return getDealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> getDealsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deals",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> getDealsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> getDealsMethod;
    if ((getDealsMethod = QueryGrpc.getDealsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDealsMethod = QueryGrpc.getDealsMethod) == null) {
          QueryGrpc.getDealsMethod = getDealsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deals"))
              .build();
        }
      }
    }
    return getDealsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> getDataSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataSale",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> getDataSaleMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> getDataSaleMethod;
    if ((getDataSaleMethod = QueryGrpc.getDataSaleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataSaleMethod = QueryGrpc.getDataSaleMethod) == null) {
          QueryGrpc.getDataSaleMethod = getDataSaleMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataSale"))
              .build();
        }
      }
    }
    return getDataSaleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> getDataSalesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataSales",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> getDataSalesMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> getDataSalesMethod;
    if ((getDataSalesMethod = QueryGrpc.getDataSalesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataSalesMethod = QueryGrpc.getDataSalesMethod) == null) {
          QueryGrpc.getDataSalesMethod = getDataSalesMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataSales"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataSales"))
              .build();
        }
      }
    }
    return getDataSalesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> getDataVerificationVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataVerificationVote",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> getDataVerificationVoteMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> getDataVerificationVoteMethod;
    if ((getDataVerificationVoteMethod = QueryGrpc.getDataVerificationVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataVerificationVoteMethod = QueryGrpc.getDataVerificationVoteMethod) == null) {
          QueryGrpc.getDataVerificationVoteMethod = getDataVerificationVoteMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataVerificationVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataVerificationVote"))
              .build();
        }
      }
    }
    return getDataVerificationVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> getDataDeliveryVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataDeliveryVote",
      requestType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest.class,
      responseType = com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest,
      com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> getDataDeliveryVoteMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> getDataDeliveryVoteMethod;
    if ((getDataDeliveryVoteMethod = QueryGrpc.getDataDeliveryVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataDeliveryVoteMethod = QueryGrpc.getDataDeliveryVoteMethod) == null) {
          QueryGrpc.getDataDeliveryVoteMethod = getDataDeliveryVoteMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest, com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataDeliveryVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataDeliveryVote"))
              .build();
        }
      }
    }
    return getDataDeliveryVoteMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deal returns a Deal.
     * </pre>
     */
    default void deal(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDealMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deals return a list of Deal.
     * </pre>
     */
    default void deals(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDealsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataSale returns a DataSale.
     * </pre>
     */
    default void dataSale(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataSaleMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataSales returns a list of DataSale.
     * </pre>
     */
    default void dataSales(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataSalesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataVerificationVote returns a DataVerificationVote.
     * </pre>
     */
    default void dataVerificationVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataVerificationVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataDeliveryVote returns a DataDeliveryVote.
     * </pre>
     */
    default void dataDeliveryVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataDeliveryVoteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     * Deal returns a Deal.
     * </pre>
     */
    public void deal(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deals return a list of Deal.
     * </pre>
     */
    public void deals(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDealsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataSale returns a DataSale.
     * </pre>
     */
    public void dataSale(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataSaleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataSales returns a list of DataSale.
     * </pre>
     */
    public void dataSales(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataSalesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataVerificationVote returns a DataVerificationVote.
     * </pre>
     */
    public void dataVerificationVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataVerificationVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataDeliveryVote returns a DataDeliveryVote.
     * </pre>
     */
    public void dataDeliveryVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataDeliveryVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Deal returns a Deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse deal(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deals return a list of Deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse deals(com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDealsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataSale returns a DataSale.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse dataSale(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataSaleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataSales returns a list of DataSale.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse dataSales(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataSalesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataVerificationVote returns a DataVerificationVote.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse dataVerificationVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataVerificationVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataDeliveryVote returns a DataDeliveryVote.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse dataDeliveryVote(com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataDeliveryVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Deal returns a Deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse> deal(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deals return a list of Deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse> deals(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDealsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataSale returns a DataSale.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse> dataSale(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataSaleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataSales returns a list of DataSale.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse> dataSales(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataSalesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataVerificationVote returns a DataVerificationVote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse> dataVerificationVote(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataVerificationVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataDeliveryVote returns a DataDeliveryVote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse> dataDeliveryVote(
        com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataDeliveryVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEAL = 0;
  private static final int METHODID_DEALS = 1;
  private static final int METHODID_DATA_SALE = 2;
  private static final int METHODID_DATA_SALES = 3;
  private static final int METHODID_DATA_VERIFICATION_VOTE = 4;
  private static final int METHODID_DATA_DELIVERY_VOTE = 5;

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
        case METHODID_DEAL:
          serviceImpl.deal((com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse>) responseObserver);
          break;
        case METHODID_DEALS:
          serviceImpl.deals((com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse>) responseObserver);
          break;
        case METHODID_DATA_SALE:
          serviceImpl.dataSale((com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse>) responseObserver);
          break;
        case METHODID_DATA_SALES:
          serviceImpl.dataSales((com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse>) responseObserver);
          break;
        case METHODID_DATA_VERIFICATION_VOTE:
          serviceImpl.dataVerificationVote((com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse>) responseObserver);
          break;
        case METHODID_DATA_DELIVERY_VOTE:
          serviceImpl.dataDeliveryVote((com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse>) responseObserver);
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
          getDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDealRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDealResponse>(
                service, METHODID_DEAL)))
        .addMethod(
          getDealsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDealsResponse>(
                service, METHODID_DEALS)))
        .addMethod(
          getDataSaleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSaleResponse>(
                service, METHODID_DATA_SALE)))
        .addMethod(
          getDataSalesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataSalesResponse>(
                service, METHODID_DATA_SALES)))
        .addMethod(
          getDataVerificationVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataVerificationVoteResponse>(
                service, METHODID_DATA_VERIFICATION_VOTE)))
        .addMethod(
          getDataDeliveryVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteRequest,
              com.panacea.datadeal.v2alpha2.QueryProto.QueryDataDeliveryVoteResponse>(
                service, METHODID_DATA_DELIVERY_VOTE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datadeal.v2alpha2.QueryProto.getDescriptor();
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
    private final java.lang.String methodName;

    QueryMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getDealMethod())
              .addMethod(getDealsMethod())
              .addMethod(getDataSaleMethod())
              .addMethod(getDataSalesMethod())
              .addMethod(getDataVerificationVoteMethod())
              .addMethod(getDataDeliveryVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
