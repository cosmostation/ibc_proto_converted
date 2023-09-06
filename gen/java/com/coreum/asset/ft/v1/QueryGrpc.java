package com.coreum.asset.ft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: coreum/asset/ft/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "coreum.asset.ft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest, com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest, com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> getTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tokens",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> getTokensMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest, com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> getTokensMethod;
    if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokensMethod = QueryGrpc.getTokensMethod) == null) {
          QueryGrpc.getTokensMethod = getTokensMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest, com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Tokens"))
              .build();
        }
      }
    }
    return getTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> getTokenMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest, com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> getTokenMethod;
    if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTokenMethod = QueryGrpc.getTokenMethod) == null) {
          QueryGrpc.getTokenMethod = getTokenMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest, com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Token"))
              .build();
        }
      }
    }
    return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> getFrozenBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrozenBalances",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> getFrozenBalancesMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest, com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> getFrozenBalancesMethod;
    if ((getFrozenBalancesMethod = QueryGrpc.getFrozenBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenBalancesMethod = QueryGrpc.getFrozenBalancesMethod) == null) {
          QueryGrpc.getFrozenBalancesMethod = getFrozenBalancesMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest, com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrozenBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FrozenBalances"))
              .build();
        }
      }
    }
    return getFrozenBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> getFrozenBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FrozenBalance",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> getFrozenBalanceMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> getFrozenBalanceMethod;
    if ((getFrozenBalanceMethod = QueryGrpc.getFrozenBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenBalanceMethod = QueryGrpc.getFrozenBalanceMethod) == null) {
          QueryGrpc.getFrozenBalanceMethod = getFrozenBalanceMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FrozenBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FrozenBalance"))
              .build();
        }
      }
    }
    return getFrozenBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedBalances",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest, com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> getWhitelistedBalancesMethod;
    if ((getWhitelistedBalancesMethod = QueryGrpc.getWhitelistedBalancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedBalancesMethod = QueryGrpc.getWhitelistedBalancesMethod) == null) {
          QueryGrpc.getWhitelistedBalancesMethod = getWhitelistedBalancesMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest, com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedBalances"))
              .build();
        }
      }
    }
    return getWhitelistedBalancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedBalance",
      requestType = com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest.class,
      responseType = com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest,
      com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> getWhitelistedBalanceMethod;
    if ((getWhitelistedBalanceMethod = QueryGrpc.getWhitelistedBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedBalanceMethod = QueryGrpc.getWhitelistedBalanceMethod) == null) {
          QueryGrpc.getWhitelistedBalanceMethod = getWhitelistedBalanceMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest, com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedBalance"))
              .build();
        }
      }
    }
    return getWhitelistedBalanceMethod;
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    default void params(com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    default void tokens(com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    default void token(com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Balance returns balance of the denom for the account.
     * </pre>
     */
    default void balance(com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    default void frozenBalances(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    default void frozenBalance(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    default void whitelistedBalances(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhitelistedBalancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    default void whitelistedBalance(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhitelistedBalanceMethod(), responseObserver);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public void params(com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public void tokens(com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public void token(com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Balance returns balance of the denom for the account.
     * </pre>
     */
    public void balance(com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public void frozenBalances(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public void frozenBalance(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public void whitelistedBalances(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhitelistedBalancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public void whitelistedBalance(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhitelistedBalanceMethod(), getCallOptions()), request, responseObserver);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse params(com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse tokens(com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse token(com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Balance returns balance of the denom for the account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse balance(com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse frozenBalances(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse frozenBalance(com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse whitelistedBalances(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhitelistedBalancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse whitelistedBalance(com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhitelistedBalanceMethod(), getCallOptions(), request);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse> params(
        com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tokens queries the fungible tokens of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse> tokens(
        com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Token queries the fungible token of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse> token(
        com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Balance returns balance of the denom for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse> balance(
        com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FrozenBalances returns all the frozen balances for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse> frozenBalances(
        com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FrozenBalance returns frozen balance of the denom for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse> frozenBalance(
        com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedBalances returns all the whitelisted balances for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse> whitelistedBalances(
        com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhitelistedBalancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedBalance returns whitelisted balance of the denom for the account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse> whitelistedBalance(
        com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhitelistedBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_TOKENS = 1;
  private static final int METHODID_TOKEN = 2;
  private static final int METHODID_BALANCE = 3;
  private static final int METHODID_FROZEN_BALANCES = 4;
  private static final int METHODID_FROZEN_BALANCE = 5;
  private static final int METHODID_WHITELISTED_BALANCES = 6;
  private static final int METHODID_WHITELISTED_BALANCE = 7;

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
          serviceImpl.params((com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOKENS:
          serviceImpl.tokens((com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse>) responseObserver);
          break;
        case METHODID_TOKEN:
          serviceImpl.token((com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_FROZEN_BALANCES:
          serviceImpl.frozenBalances((com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse>) responseObserver);
          break;
        case METHODID_FROZEN_BALANCE:
          serviceImpl.frozenBalance((com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_BALANCES:
          serviceImpl.whitelistedBalances((com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_BALANCE:
          serviceImpl.whitelistedBalance((com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse>) responseObserver);
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
              com.coreum.asset.ft.v1.QueryProto.QueryParamsRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryTokensRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryTokensResponse>(
                service, METHODID_TOKENS)))
        .addMethod(
          getTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryTokenRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryTokenResponse>(
                service, METHODID_TOKEN)))
        .addMethod(
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryBalanceRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getFrozenBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalancesResponse>(
                service, METHODID_FROZEN_BALANCES)))
        .addMethod(
          getFrozenBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryFrozenBalanceResponse>(
                service, METHODID_FROZEN_BALANCE)))
        .addMethod(
          getWhitelistedBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalancesResponse>(
                service, METHODID_WHITELISTED_BALANCES)))
        .addMethod(
          getWhitelistedBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceRequest,
              com.coreum.asset.ft.v1.QueryProto.QueryWhitelistedBalanceResponse>(
                service, METHODID_WHITELISTED_BALANCE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coreum.asset.ft.v1.QueryProto.getDescriptor();
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
              .addMethod(getTokensMethod())
              .addMethod(getTokenMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getFrozenBalancesMethod())
              .addMethod(getFrozenBalanceMethod())
              .addMethod(getWhitelistedBalancesMethod())
              .addMethod(getWhitelistedBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
