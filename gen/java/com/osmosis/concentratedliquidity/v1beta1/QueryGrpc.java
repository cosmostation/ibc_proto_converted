package com.osmosis.concentratedliquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/concentrated-liquidity/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.concentratedliquidity.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PoolsRequest,
      com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.osmosis.concentratedliquidity.v1beta1.PoolsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.PoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PoolsRequest,
      com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PoolsRequest, com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.PoolsRequest, com.osmosis.concentratedliquidity.v1beta1.PoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.PoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.PoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ParamsRequest,
      com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.concentratedliquidity.v1beta1.ParamsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ParamsRequest,
      com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ParamsRequest, com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.ParamsRequest, com.osmosis.concentratedliquidity.v1beta1.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> getUserPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPositions",
      requestType = com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest,
      com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> getUserPositionsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> getUserPositionsMethod;
    if ((getUserPositionsMethod = QueryGrpc.getUserPositionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserPositionsMethod = QueryGrpc.getUserPositionsMethod) == null) {
          QueryGrpc.getUserPositionsMethod = getUserPositionsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest, com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserPositions"))
              .build();
        }
      }
    }
    return getUserPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest,
      com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityPerTickRange",
      requestType = com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest,
      com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest, com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> getLiquidityPerTickRangeMethod;
    if ((getLiquidityPerTickRangeMethod = QueryGrpc.getLiquidityPerTickRangeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityPerTickRangeMethod = QueryGrpc.getLiquidityPerTickRangeMethod) == null) {
          QueryGrpc.getLiquidityPerTickRangeMethod = getLiquidityPerTickRangeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest, com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityPerTickRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityPerTickRange"))
              .build();
        }
      }
    }
    return getLiquidityPerTickRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest,
      com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidityNetInDirection",
      requestType = com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest,
      com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest, com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> getLiquidityNetInDirectionMethod;
    if ((getLiquidityNetInDirectionMethod = QueryGrpc.getLiquidityNetInDirectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidityNetInDirectionMethod = QueryGrpc.getLiquidityNetInDirectionMethod) == null) {
          QueryGrpc.getLiquidityNetInDirectionMethod = getLiquidityNetInDirectionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest, com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidityNetInDirection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidityNetInDirection"))
              .build();
        }
      }
    }
    return getLiquidityNetInDirectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimableSpreadRewards",
      requestType = com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest,
      com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> getClaimableSpreadRewardsMethod;
    if ((getClaimableSpreadRewardsMethod = QueryGrpc.getClaimableSpreadRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimableSpreadRewardsMethod = QueryGrpc.getClaimableSpreadRewardsMethod) == null) {
          QueryGrpc.getClaimableSpreadRewardsMethod = getClaimableSpreadRewardsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest, com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimableSpreadRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimableSpreadRewards"))
              .build();
        }
      }
    }
    return getClaimableSpreadRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest,
      com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> getClaimableIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimableIncentives",
      requestType = com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest,
      com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> getClaimableIncentivesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest, com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> getClaimableIncentivesMethod;
    if ((getClaimableIncentivesMethod = QueryGrpc.getClaimableIncentivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimableIncentivesMethod = QueryGrpc.getClaimableIncentivesMethod) == null) {
          QueryGrpc.getClaimableIncentivesMethod = getClaimableIncentivesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest, com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimableIncentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimableIncentives"))
              .build();
        }
      }
    }
    return getClaimableIncentivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> getPositionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PositionById",
      requestType = com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest,
      com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> getPositionByIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest, com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> getPositionByIdMethod;
    if ((getPositionByIdMethod = QueryGrpc.getPositionByIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPositionByIdMethod = QueryGrpc.getPositionByIdMethod) == null) {
          QueryGrpc.getPositionByIdMethod = getPositionByIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest, com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PositionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PositionById"))
              .build();
        }
      }
    }
    return getPositionByIdMethod;
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
     * <pre>
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    default void pools(com.osmosis.concentratedliquidity.v1beta1.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    default void params(com.osmosis.concentratedliquidity.v1beta1.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated postitions of some address.
     * </pre>
     */
    default void userPositions(com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    default void liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityPerTickRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    default void liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidityNetInDirectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    default void claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimableSpreadRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    default void claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimableIncentivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    default void positionById(com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPositionByIdMethod(), responseObserver);
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
     * <pre>
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public void pools(com.osmosis.concentratedliquidity.v1beta1.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public void params(com.osmosis.concentratedliquidity.v1beta1.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated postitions of some address.
     * </pre>
     */
    public void userPositions(com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public void liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityPerTickRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public void liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidityNetInDirectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public void claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimableSpreadRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public void claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimableIncentivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public void positionById(com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPositionByIdMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.PoolsResponse pools(com.osmosis.concentratedliquidity.v1beta1.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.ParamsResponse params(com.osmosis.concentratedliquidity.v1beta1.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated postitions of some address.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse userPositions(com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse liquidityPerTickRange(com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityPerTickRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse liquidityNetInDirection(com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidityNetInDirectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse claimableSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimableSpreadRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse claimableIncentives(com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimableIncentivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse positionById(com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPositionByIdMethod(), getCallOptions(), request);
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
     * <pre>
     * Pools returns all concentrated liquidity pools
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.PoolsResponse> pools(
        com.osmosis.concentratedliquidity.v1beta1.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns concentrated liquidity module params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.ParamsResponse> params(
        com.osmosis.concentratedliquidity.v1beta1.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserPositions returns all concentrated postitions of some address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse> userPositions(
        com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidityPerTickRange returns the amount of liquidity per every tick range
     * existing within the given pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse> liquidityPerTickRange(
        com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityPerTickRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidityNetInDirection returns liquidity net in the direction given.
     * Uses the bound if specified, if not uses either min tick / max tick
     * depending on the direction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse> liquidityNetInDirection(
        com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidityNetInDirectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimableSpreadRewards returns the amount of spread rewards that can be
     * claimed by a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse> claimableSpreadRewards(
        com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimableSpreadRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimableIncentives returns the amount of incentives that can be claimed
     * and how many would be forfeited by a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse> claimableIncentives(
        com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimableIncentivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PositionById returns a position with the given id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse> positionById(
        com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPositionByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_USER_POSITIONS = 2;
  private static final int METHODID_LIQUIDITY_PER_TICK_RANGE = 3;
  private static final int METHODID_LIQUIDITY_NET_IN_DIRECTION = 4;
  private static final int METHODID_CLAIMABLE_SPREAD_REWARDS = 5;
  private static final int METHODID_CLAIMABLE_INCENTIVES = 6;
  private static final int METHODID_POSITION_BY_ID = 7;

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
        case METHODID_POOLS:
          serviceImpl.pools((com.osmosis.concentratedliquidity.v1beta1.PoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PoolsResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.concentratedliquidity.v1beta1.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ParamsResponse>) responseObserver);
          break;
        case METHODID_USER_POSITIONS:
          serviceImpl.userPositions((com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_PER_TICK_RANGE:
          serviceImpl.liquidityPerTickRange((com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse>) responseObserver);
          break;
        case METHODID_LIQUIDITY_NET_IN_DIRECTION:
          serviceImpl.liquidityNetInDirection((com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse>) responseObserver);
          break;
        case METHODID_CLAIMABLE_SPREAD_REWARDS:
          serviceImpl.claimableSpreadRewards((com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse>) responseObserver);
          break;
        case METHODID_CLAIMABLE_INCENTIVES:
          serviceImpl.claimableIncentives((com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse>) responseObserver);
          break;
        case METHODID_POSITION_BY_ID:
          serviceImpl.positionById((com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse>) responseObserver);
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
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.PoolsRequest,
              com.osmosis.concentratedliquidity.v1beta1.PoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.ParamsRequest,
              com.osmosis.concentratedliquidity.v1beta1.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getUserPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.UserPositionsRequest,
              com.osmosis.concentratedliquidity.v1beta1.UserPositionsResponse>(
                service, METHODID_USER_POSITIONS)))
        .addMethod(
          getLiquidityPerTickRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest,
              com.osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse>(
                service, METHODID_LIQUIDITY_PER_TICK_RANGE)))
        .addMethod(
          getLiquidityNetInDirectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest,
              com.osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse>(
                service, METHODID_LIQUIDITY_NET_IN_DIRECTION)))
        .addMethod(
          getClaimableSpreadRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest,
              com.osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse>(
                service, METHODID_CLAIMABLE_SPREAD_REWARDS)))
        .addMethod(
          getClaimableIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest,
              com.osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse>(
                service, METHODID_CLAIMABLE_INCENTIVES)))
        .addMethod(
          getPositionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.PositionByIdRequest,
              com.osmosis.concentratedliquidity.v1beta1.PositionByIdResponse>(
                service, METHODID_POSITION_BY_ID)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getPoolsMethod())
              .addMethod(getParamsMethod())
              .addMethod(getUserPositionsMethod())
              .addMethod(getLiquidityPerTickRangeMethod())
              .addMethod(getLiquidityNetInDirectionMethod())
              .addMethod(getClaimableSpreadRewardsMethod())
              .addMethod(getClaimableIncentivesMethod())
              .addMethod(getPositionByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
