package com.crescent.liquidfarming.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/liquidfarming/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.liquidfarming.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> getLiquidFarmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidFarms",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> getLiquidFarmsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> getLiquidFarmsMethod;
    if ((getLiquidFarmsMethod = QueryGrpc.getLiquidFarmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidFarmsMethod = QueryGrpc.getLiquidFarmsMethod) == null) {
          QueryGrpc.getLiquidFarmsMethod = getLiquidFarmsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidFarms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidFarms"))
              .build();
        }
      }
    }
    return getLiquidFarmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> getLiquidFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidFarm",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> getLiquidFarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> getLiquidFarmMethod;
    if ((getLiquidFarmMethod = QueryGrpc.getLiquidFarmMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidFarmMethod = QueryGrpc.getLiquidFarmMethod) == null) {
          QueryGrpc.getLiquidFarmMethod = getLiquidFarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidFarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidFarm"))
              .build();
        }
      }
    }
    return getLiquidFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> getRewardsAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsAuctions",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> getRewardsAuctionsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> getRewardsAuctionsMethod;
    if ((getRewardsAuctionsMethod = QueryGrpc.getRewardsAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsAuctionsMethod = QueryGrpc.getRewardsAuctionsMethod) == null) {
          QueryGrpc.getRewardsAuctionsMethod = getRewardsAuctionsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsAuctions"))
              .build();
        }
      }
    }
    return getRewardsAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> getRewardsAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsAuction",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> getRewardsAuctionMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> getRewardsAuctionMethod;
    if ((getRewardsAuctionMethod = QueryGrpc.getRewardsAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsAuctionMethod = QueryGrpc.getRewardsAuctionMethod) == null) {
          QueryGrpc.getRewardsAuctionMethod = getRewardsAuctionMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsAuction"))
              .build();
        }
      }
    }
    return getRewardsAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bids",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod;
    if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
          QueryGrpc.getBidsMethod = getBidsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bids"))
              .build();
        }
      }
    }
    return getBidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rewards",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> getRewardsMethod;
    if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsMethod = QueryGrpc.getRewardsMethod) == null) {
          QueryGrpc.getRewardsMethod = getRewardsMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Rewards"))
              .build();
        }
      }
    }
    return getRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExchangeRate",
      requestType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest.class,
      responseType = com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest,
      com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod() {
    io.grpc.MethodDescriptor<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> getExchangeRateMethod;
    if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getExchangeRateMethod = QueryGrpc.getExchangeRateMethod) == null) {
          QueryGrpc.getExchangeRateMethod = getExchangeRateMethod =
              io.grpc.MethodDescriptor.<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest, com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExchangeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ExchangeRate"))
              .build();
        }
      }
    }
    return getExchangeRateMethod;
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
     * Params returns parameters of the module
     * </pre>
     */
    default void params(com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidFarms returns all liquid farms registered in params
     * </pre>
     */
    default void liquidFarms(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidFarmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidFarm returns the specific liquid farm
     * </pre>
     */
    default void liquidFarm(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidFarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsAuctions returns all rewards auctions that correspond to the given pool id
     * </pre>
     */
    default void rewardsAuctions(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsAuctionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsAuction returns the specific rewards auction
     * </pre>
     */
    default void rewardsAuction(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsAuctionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bids returns all bids for the liquid farm
     * </pre>
     */
    default void bids(com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rewards returns all accumulated farming rewards for the liquid farm
     * </pre>
     */
    default void rewards(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
     * </pre>
     */
    default void exchangeRate(com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeRateMethod(), responseObserver);
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
     * Params returns parameters of the module
     * </pre>
     */
    public void params(com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidFarms returns all liquid farms registered in params
     * </pre>
     */
    public void liquidFarms(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidFarmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidFarm returns the specific liquid farm
     * </pre>
     */
    public void liquidFarm(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsAuctions returns all rewards auctions that correspond to the given pool id
     * </pre>
     */
    public void rewardsAuctions(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsAuction returns the specific rewards auction
     * </pre>
     */
    public void rewardsAuction(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bids returns all bids for the liquid farm
     * </pre>
     */
    public void bids(com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rewards returns all accumulated farming rewards for the liquid farm
     * </pre>
     */
    public void rewards(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
     * </pre>
     */
    public void exchangeRate(com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest request,
        io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request, responseObserver);
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
     * Params returns parameters of the module
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse params(com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidFarms returns all liquid farms registered in params
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse liquidFarms(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidFarmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidFarm returns the specific liquid farm
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse liquidFarm(com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidFarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsAuctions returns all rewards auctions that correspond to the given pool id
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse rewardsAuctions(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsAuctionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsAuction returns the specific rewards auction
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse rewardsAuction(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsAuctionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bids returns all bids for the liquid farm
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse bids(com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rewards returns all accumulated farming rewards for the liquid farm
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse rewards(com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
     * </pre>
     */
    public com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse exchangeRate(com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeRateMethod(), getCallOptions(), request);
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
     * Params returns parameters of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse> params(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidFarms returns all liquid farms registered in params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse> liquidFarms(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidFarmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidFarm returns the specific liquid farm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse> liquidFarm(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidFarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsAuctions returns all rewards auctions that correspond to the given pool id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse> rewardsAuctions(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsAuctionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsAuction returns the specific rewards auction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse> rewardsAuction(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsAuctionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bids returns all bids for the liquid farm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse> bids(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rewards returns all accumulated farming rewards for the liquid farm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse> rewards(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse> exchangeRate(
        com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_LIQUID_FARMS = 1;
  private static final int METHODID_LIQUID_FARM = 2;
  private static final int METHODID_REWARDS_AUCTIONS = 3;
  private static final int METHODID_REWARDS_AUCTION = 4;
  private static final int METHODID_BIDS = 5;
  private static final int METHODID_REWARDS = 6;
  private static final int METHODID_EXCHANGE_RATE = 7;

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
        case METHODID_PARAMS:
          serviceImpl.params((com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LIQUID_FARMS:
          serviceImpl.liquidFarms((com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse>) responseObserver);
          break;
        case METHODID_LIQUID_FARM:
          serviceImpl.liquidFarm((com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse>) responseObserver);
          break;
        case METHODID_REWARDS_AUCTIONS:
          serviceImpl.rewardsAuctions((com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse>) responseObserver);
          break;
        case METHODID_REWARDS_AUCTION:
          serviceImpl.rewardsAuction((com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse>) responseObserver);
          break;
        case METHODID_BIDS:
          serviceImpl.bids((com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse>) responseObserver);
          break;
        case METHODID_REWARDS:
          serviceImpl.rewards((com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse>) responseObserver);
          break;
        case METHODID_EXCHANGE_RATE:
          serviceImpl.exchangeRate((com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getLiquidFarmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmsResponse>(
                service, METHODID_LIQUID_FARMS)))
        .addMethod(
          getLiquidFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryLiquidFarmResponse>(
                service, METHODID_LIQUID_FARM)))
        .addMethod(
          getRewardsAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionsResponse>(
                service, METHODID_REWARDS_AUCTIONS)))
        .addMethod(
          getRewardsAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsAuctionResponse>(
                service, METHODID_REWARDS_AUCTION)))
        .addMethod(
          getBidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryBidsResponse>(
                service, METHODID_BIDS)))
        .addMethod(
          getRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryRewardsResponse>(
                service, METHODID_REWARDS)))
        .addMethod(
          getExchangeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateRequest,
              com.crescent.liquidfarming.v1beta1.QueryProto.QueryExchangeRateResponse>(
                service, METHODID_EXCHANGE_RATE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.liquidfarming.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getLiquidFarmsMethod())
              .addMethod(getLiquidFarmMethod())
              .addMethod(getRewardsAuctionsMethod())
              .addMethod(getRewardsAuctionMethod())
              .addMethod(getBidsMethod())
              .addMethod(getRewardsMethod())
              .addMethod(getExchangeRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
