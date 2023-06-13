package com.umee.leverage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: umee/leverage/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "umee.leverage.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryParams,
      com.umee.leverage.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.umee.leverage.v1.QueryProto.QueryParams.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryParams,
      com.umee.leverage.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryParams, com.umee.leverage.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryParams, com.umee.leverage.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryRegisteredTokens,
      com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> getRegisteredTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredTokens",
      requestType = com.umee.leverage.v1.QueryProto.QueryRegisteredTokens.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryRegisteredTokens,
      com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> getRegisteredTokensMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryRegisteredTokens, com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> getRegisteredTokensMethod;
    if ((getRegisteredTokensMethod = QueryGrpc.getRegisteredTokensMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRegisteredTokensMethod = QueryGrpc.getRegisteredTokensMethod) == null) {
          QueryGrpc.getRegisteredTokensMethod = getRegisteredTokensMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryRegisteredTokens, com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisteredTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryRegisteredTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RegisteredTokens"))
              .build();
        }
      }
    }
    return getRegisteredTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMarketSummary,
      com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> getMarketSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarketSummary",
      requestType = com.umee.leverage.v1.QueryProto.QueryMarketSummary.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMarketSummary,
      com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> getMarketSummaryMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMarketSummary, com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> getMarketSummaryMethod;
    if ((getMarketSummaryMethod = QueryGrpc.getMarketSummaryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarketSummaryMethod = QueryGrpc.getMarketSummaryMethod) == null) {
          QueryGrpc.getMarketSummaryMethod = getMarketSummaryMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryMarketSummary, com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarketSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMarketSummary.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MarketSummary"))
              .build();
        }
      }
    }
    return getMarketSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountBalances,
      com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> getAccountBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBalances",
      requestType = com.umee.leverage.v1.QueryProto.QueryAccountBalances.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountBalances,
      com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> getAccountBalancesMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountBalances, com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> getAccountBalancesMethod;
    if ((getAccountBalancesMethod = QueryGrpc.getAccountBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBalancesMethod = QueryGrpc.getAccountBalancesMethod) == null) {
          QueryGrpc.getAccountBalancesMethod = getAccountBalancesMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryAccountBalances, com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryAccountBalances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBalances"))
              .build();
        }
      }
    }
    return getAccountBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountSummary,
      com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> getAccountSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountSummary",
      requestType = com.umee.leverage.v1.QueryProto.QueryAccountSummary.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountSummary,
      com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> getAccountSummaryMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryAccountSummary, com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> getAccountSummaryMethod;
    if ((getAccountSummaryMethod = QueryGrpc.getAccountSummaryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountSummaryMethod = QueryGrpc.getAccountSummaryMethod) == null) {
          QueryGrpc.getAccountSummaryMethod = getAccountSummaryMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryAccountSummary, com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryAccountSummary.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountSummary"))
              .build();
        }
      }
    }
    return getAccountSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryLiquidationTargets,
      com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> getLiquidationTargetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidationTargets",
      requestType = com.umee.leverage.v1.QueryProto.QueryLiquidationTargets.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryLiquidationTargets,
      com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> getLiquidationTargetsMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryLiquidationTargets, com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> getLiquidationTargetsMethod;
    if ((getLiquidationTargetsMethod = QueryGrpc.getLiquidationTargetsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLiquidationTargetsMethod = QueryGrpc.getLiquidationTargetsMethod) == null) {
          QueryGrpc.getLiquidationTargetsMethod = getLiquidationTargetsMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryLiquidationTargets, com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidationTargets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryLiquidationTargets.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LiquidationTargets"))
              .build();
        }
      }
    }
    return getLiquidationTargetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryBadDebts,
      com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> getBadDebtsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BadDebts",
      requestType = com.umee.leverage.v1.QueryProto.QueryBadDebts.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryBadDebts,
      com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> getBadDebtsMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryBadDebts, com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> getBadDebtsMethod;
    if ((getBadDebtsMethod = QueryGrpc.getBadDebtsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBadDebtsMethod = QueryGrpc.getBadDebtsMethod) == null) {
          QueryGrpc.getBadDebtsMethod = getBadDebtsMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryBadDebts, com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BadDebts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryBadDebts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BadDebts"))
              .build();
        }
      }
    }
    return getBadDebtsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxWithdraw,
      com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> getMaxWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxWithdraw",
      requestType = com.umee.leverage.v1.QueryProto.QueryMaxWithdraw.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxWithdraw,
      com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> getMaxWithdrawMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxWithdraw, com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> getMaxWithdrawMethod;
    if ((getMaxWithdrawMethod = QueryGrpc.getMaxWithdrawMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxWithdrawMethod = QueryGrpc.getMaxWithdrawMethod) == null) {
          QueryGrpc.getMaxWithdrawMethod = getMaxWithdrawMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryMaxWithdraw, com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMaxWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxWithdraw"))
              .build();
        }
      }
    }
    return getMaxWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxBorrow,
      com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> getMaxBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxBorrow",
      requestType = com.umee.leverage.v1.QueryProto.QueryMaxBorrow.class,
      responseType = com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxBorrow,
      com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> getMaxBorrowMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.QueryProto.QueryMaxBorrow, com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> getMaxBorrowMethod;
    if ((getMaxBorrowMethod = QueryGrpc.getMaxBorrowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMaxBorrowMethod = QueryGrpc.getMaxBorrowMethod) == null) {
          QueryGrpc.getMaxBorrowMethod = getMaxBorrowMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.QueryProto.QueryMaxBorrow, com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMaxBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MaxBorrow"))
              .build();
        }
      }
    }
    return getMaxBorrowMethod;
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
     * Params queries the parameters of the x/leverage module.
     * </pre>
     */
    default void params(com.umee.leverage.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisteredTokens queries for all the registered tokens.
     * </pre>
     */
    default void registeredTokens(com.umee.leverage.v1.QueryProto.QueryRegisteredTokens request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisteredTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * MarketSummary queries a base asset's current borrowing and supplying conditions.
     * </pre>
     */
    default void marketSummary(com.umee.leverage.v1.QueryProto.QueryMarketSummary request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarketSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountBalances queries an account's current supply, collateral, and borrow positions.
     * </pre>
     */
    default void accountBalances(com.umee.leverage.v1.QueryProto.QueryAccountBalances request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountSummary queries USD values representing an account's total positions and borrowing limits. It requires oracle prices to return successfully.
     * </pre>
     */
    default void accountSummary(com.umee.leverage.v1.QueryProto.QueryAccountSummary request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * LiquidationTargets queries a list of all borrower account addresses eligible for liquidation.
     * </pre>
     */
    default void liquidationTargets(com.umee.leverage.v1.QueryProto.QueryLiquidationTargets request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidationTargetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BadDebts queries a list of borrow positions that have been marked for bad debt repayment.
     * </pre>
     */
    default void badDebts(com.umee.leverage.v1.QueryProto.QueryBadDebts request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBadDebtsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxWithdraw queries the maximum amount of a given token an address can withdraw.
     * </pre>
     */
    default void maxWithdraw(com.umee.leverage.v1.QueryProto.QueryMaxWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxBorrow queries the maximum amount of a given token an address can borrow.
     * </pre>
     */
    default void maxBorrow(com.umee.leverage.v1.QueryProto.QueryMaxBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxBorrowMethod(), responseObserver);
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
     * Params queries the parameters of the x/leverage module.
     * </pre>
     */
    public void params(com.umee.leverage.v1.QueryProto.QueryParams request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisteredTokens queries for all the registered tokens.
     * </pre>
     */
    public void registeredTokens(com.umee.leverage.v1.QueryProto.QueryRegisteredTokens request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisteredTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MarketSummary queries a base asset's current borrowing and supplying conditions.
     * </pre>
     */
    public void marketSummary(com.umee.leverage.v1.QueryProto.QueryMarketSummary request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarketSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountBalances queries an account's current supply, collateral, and borrow positions.
     * </pre>
     */
    public void accountBalances(com.umee.leverage.v1.QueryProto.QueryAccountBalances request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountSummary queries USD values representing an account's total positions and borrowing limits. It requires oracle prices to return successfully.
     * </pre>
     */
    public void accountSummary(com.umee.leverage.v1.QueryProto.QueryAccountSummary request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LiquidationTargets queries a list of all borrower account addresses eligible for liquidation.
     * </pre>
     */
    public void liquidationTargets(com.umee.leverage.v1.QueryProto.QueryLiquidationTargets request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidationTargetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BadDebts queries a list of borrow positions that have been marked for bad debt repayment.
     * </pre>
     */
    public void badDebts(com.umee.leverage.v1.QueryProto.QueryBadDebts request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBadDebtsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxWithdraw queries the maximum amount of a given token an address can withdraw.
     * </pre>
     */
    public void maxWithdraw(com.umee.leverage.v1.QueryProto.QueryMaxWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxBorrow queries the maximum amount of a given token an address can borrow.
     * </pre>
     */
    public void maxBorrow(com.umee.leverage.v1.QueryProto.QueryMaxBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxBorrowMethod(), getCallOptions()), request, responseObserver);
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
     * Params queries the parameters of the x/leverage module.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryParamsResponse params(com.umee.leverage.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisteredTokens queries for all the registered tokens.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse registeredTokens(com.umee.leverage.v1.QueryProto.QueryRegisteredTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisteredTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MarketSummary queries a base asset's current borrowing and supplying conditions.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse marketSummary(com.umee.leverage.v1.QueryProto.QueryMarketSummary request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarketSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountBalances queries an account's current supply, collateral, and borrow positions.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse accountBalances(com.umee.leverage.v1.QueryProto.QueryAccountBalances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountSummary queries USD values representing an account's total positions and borrowing limits. It requires oracle prices to return successfully.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse accountSummary(com.umee.leverage.v1.QueryProto.QueryAccountSummary request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LiquidationTargets queries a list of all borrower account addresses eligible for liquidation.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse liquidationTargets(com.umee.leverage.v1.QueryProto.QueryLiquidationTargets request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidationTargetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BadDebts queries a list of borrow positions that have been marked for bad debt repayment.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse badDebts(com.umee.leverage.v1.QueryProto.QueryBadDebts request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBadDebtsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxWithdraw queries the maximum amount of a given token an address can withdraw.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse maxWithdraw(com.umee.leverage.v1.QueryProto.QueryMaxWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxBorrow queries the maximum amount of a given token an address can borrow.
     * </pre>
     */
    public com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse maxBorrow(com.umee.leverage.v1.QueryProto.QueryMaxBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxBorrowMethod(), getCallOptions(), request);
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
     * Params queries the parameters of the x/leverage module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryParamsResponse> params(
        com.umee.leverage.v1.QueryProto.QueryParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisteredTokens queries for all the registered tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse> registeredTokens(
        com.umee.leverage.v1.QueryProto.QueryRegisteredTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisteredTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MarketSummary queries a base asset's current borrowing and supplying conditions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse> marketSummary(
        com.umee.leverage.v1.QueryProto.QueryMarketSummary request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarketSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountBalances queries an account's current supply, collateral, and borrow positions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse> accountBalances(
        com.umee.leverage.v1.QueryProto.QueryAccountBalances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountSummary queries USD values representing an account's total positions and borrowing limits. It requires oracle prices to return successfully.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse> accountSummary(
        com.umee.leverage.v1.QueryProto.QueryAccountSummary request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LiquidationTargets queries a list of all borrower account addresses eligible for liquidation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse> liquidationTargets(
        com.umee.leverage.v1.QueryProto.QueryLiquidationTargets request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidationTargetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BadDebts queries a list of borrow positions that have been marked for bad debt repayment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse> badDebts(
        com.umee.leverage.v1.QueryProto.QueryBadDebts request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBadDebtsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxWithdraw queries the maximum amount of a given token an address can withdraw.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse> maxWithdraw(
        com.umee.leverage.v1.QueryProto.QueryMaxWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxBorrow queries the maximum amount of a given token an address can borrow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse> maxBorrow(
        com.umee.leverage.v1.QueryProto.QueryMaxBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxBorrowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_REGISTERED_TOKENS = 1;
  private static final int METHODID_MARKET_SUMMARY = 2;
  private static final int METHODID_ACCOUNT_BALANCES = 3;
  private static final int METHODID_ACCOUNT_SUMMARY = 4;
  private static final int METHODID_LIQUIDATION_TARGETS = 5;
  private static final int METHODID_BAD_DEBTS = 6;
  private static final int METHODID_MAX_WITHDRAW = 7;
  private static final int METHODID_MAX_BORROW = 8;

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
          serviceImpl.params((com.umee.leverage.v1.QueryProto.QueryParams) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_REGISTERED_TOKENS:
          serviceImpl.registeredTokens((com.umee.leverage.v1.QueryProto.QueryRegisteredTokens) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse>) responseObserver);
          break;
        case METHODID_MARKET_SUMMARY:
          serviceImpl.marketSummary((com.umee.leverage.v1.QueryProto.QueryMarketSummary) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BALANCES:
          serviceImpl.accountBalances((com.umee.leverage.v1.QueryProto.QueryAccountBalances) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_SUMMARY:
          serviceImpl.accountSummary((com.umee.leverage.v1.QueryProto.QueryAccountSummary) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse>) responseObserver);
          break;
        case METHODID_LIQUIDATION_TARGETS:
          serviceImpl.liquidationTargets((com.umee.leverage.v1.QueryProto.QueryLiquidationTargets) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse>) responseObserver);
          break;
        case METHODID_BAD_DEBTS:
          serviceImpl.badDebts((com.umee.leverage.v1.QueryProto.QueryBadDebts) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse>) responseObserver);
          break;
        case METHODID_MAX_WITHDRAW:
          serviceImpl.maxWithdraw((com.umee.leverage.v1.QueryProto.QueryMaxWithdraw) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse>) responseObserver);
          break;
        case METHODID_MAX_BORROW:
          serviceImpl.maxBorrow((com.umee.leverage.v1.QueryProto.QueryMaxBorrow) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse>) responseObserver);
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
              com.umee.leverage.v1.QueryProto.QueryParams,
              com.umee.leverage.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRegisteredTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryRegisteredTokens,
              com.umee.leverage.v1.QueryProto.QueryRegisteredTokensResponse>(
                service, METHODID_REGISTERED_TOKENS)))
        .addMethod(
          getMarketSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryMarketSummary,
              com.umee.leverage.v1.QueryProto.QueryMarketSummaryResponse>(
                service, METHODID_MARKET_SUMMARY)))
        .addMethod(
          getAccountBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryAccountBalances,
              com.umee.leverage.v1.QueryProto.QueryAccountBalancesResponse>(
                service, METHODID_ACCOUNT_BALANCES)))
        .addMethod(
          getAccountSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryAccountSummary,
              com.umee.leverage.v1.QueryProto.QueryAccountSummaryResponse>(
                service, METHODID_ACCOUNT_SUMMARY)))
        .addMethod(
          getLiquidationTargetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryLiquidationTargets,
              com.umee.leverage.v1.QueryProto.QueryLiquidationTargetsResponse>(
                service, METHODID_LIQUIDATION_TARGETS)))
        .addMethod(
          getBadDebtsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryBadDebts,
              com.umee.leverage.v1.QueryProto.QueryBadDebtsResponse>(
                service, METHODID_BAD_DEBTS)))
        .addMethod(
          getMaxWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryMaxWithdraw,
              com.umee.leverage.v1.QueryProto.QueryMaxWithdrawResponse>(
                service, METHODID_MAX_WITHDRAW)))
        .addMethod(
          getMaxBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.QueryProto.QueryMaxBorrow,
              com.umee.leverage.v1.QueryProto.QueryMaxBorrowResponse>(
                service, METHODID_MAX_BORROW)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.leverage.v1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getRegisteredTokensMethod())
              .addMethod(getMarketSummaryMethod())
              .addMethod(getAccountBalancesMethod())
              .addMethod(getAccountSummaryMethod())
              .addMethod(getLiquidationTargetsMethod())
              .addMethod(getBadDebtsMethod())
              .addMethod(getMaxWithdrawMethod())
              .addMethod(getMaxBorrowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
