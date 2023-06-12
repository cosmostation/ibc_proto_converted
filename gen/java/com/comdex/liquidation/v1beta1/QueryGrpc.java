package com.comdex.liquidation.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/liquidation/v1beta1/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.liquidation.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> getQueryLockedVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockedVault",
      requestType = com.comdex.liquidation.v1beta1.QueryLockedVaultRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryLockedVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> getQueryLockedVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> getQueryLockedVaultMethod;
    if ((getQueryLockedVaultMethod = QueryGrpc.getQueryLockedVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockedVaultMethod = QueryGrpc.getQueryLockedVaultMethod) == null) {
          QueryGrpc.getQueryLockedVaultMethod = getQueryLockedVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryLockedVaultRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockedVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockedVault"))
              .build();
        }
      }
    }
    return getQueryLockedVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> getQueryLockedVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockedVaults",
      requestType = com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> getQueryLockedVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> getQueryLockedVaultsMethod;
    if ((getQueryLockedVaultsMethod = QueryGrpc.getQueryLockedVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockedVaultsMethod = QueryGrpc.getQueryLockedVaultsMethod) == null) {
          QueryGrpc.getQueryLockedVaultsMethod = getQueryLockedVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockedVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockedVaults"))
              .build();
        }
      }
    }
    return getQueryLockedVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest,
      com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> getQueryLiquidationParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLiquidationParams",
      requestType = com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest,
      com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> getQueryLiquidationParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest, com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> getQueryLiquidationParamsMethod;
    if ((getQueryLiquidationParamsMethod = QueryGrpc.getQueryLiquidationParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLiquidationParamsMethod = QueryGrpc.getQueryLiquidationParamsMethod) == null) {
          QueryGrpc.getQueryLiquidationParamsMethod = getQueryLiquidationParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest, com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLiquidationParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLiquidationParams"))
              .build();
        }
      }
    }
    return getQueryLiquidationParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> getQueryLockedVaultsHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockedVaultsHistory",
      requestType = com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> getQueryLockedVaultsHistoryMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> getQueryLockedVaultsHistoryMethod;
    if ((getQueryLockedVaultsHistoryMethod = QueryGrpc.getQueryLockedVaultsHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockedVaultsHistoryMethod = QueryGrpc.getQueryLockedVaultsHistoryMethod) == null) {
          QueryGrpc.getQueryLockedVaultsHistoryMethod = getQueryLockedVaultsHistoryMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockedVaultsHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockedVaultsHistory"))
              .build();
        }
      }
    }
    return getQueryLockedVaultsHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest,
      com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> getQueryUserLockedVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserLockedVaults",
      requestType = com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest,
      com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> getQueryUserLockedVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest, com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> getQueryUserLockedVaultsMethod;
    if ((getQueryUserLockedVaultsMethod = QueryGrpc.getQueryUserLockedVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserLockedVaultsMethod = QueryGrpc.getQueryUserLockedVaultsMethod) == null) {
          QueryGrpc.getQueryUserLockedVaultsMethod = getQueryUserLockedVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest, com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserLockedVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserLockedVaults"))
              .build();
        }
      }
    }
    return getQueryUserLockedVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest,
      com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> getQueryUserLockedVaultsHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserLockedVaultsHistory",
      requestType = com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest,
      com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> getQueryUserLockedVaultsHistoryMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest, com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> getQueryUserLockedVaultsHistoryMethod;
    if ((getQueryUserLockedVaultsHistoryMethod = QueryGrpc.getQueryUserLockedVaultsHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserLockedVaultsHistoryMethod = QueryGrpc.getQueryUserLockedVaultsHistoryMethod) == null) {
          QueryGrpc.getQueryUserLockedVaultsHistoryMethod = getQueryUserLockedVaultsHistoryMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest, com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserLockedVaultsHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserLockedVaultsHistory"))
              .build();
        }
      }
    }
    return getQueryUserLockedVaultsHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> getQueryLockedVaultsPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockedVaultsPair",
      requestType = com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest,
      com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> getQueryLockedVaultsPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> getQueryLockedVaultsPairMethod;
    if ((getQueryLockedVaultsPairMethod = QueryGrpc.getQueryLockedVaultsPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockedVaultsPairMethod = QueryGrpc.getQueryLockedVaultsPairMethod) == null) {
          QueryGrpc.getQueryLockedVaultsPairMethod = getQueryLockedVaultsPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest, com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockedVaultsPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockedVaultsPair"))
              .build();
        }
      }
    }
    return getQueryLockedVaultsPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryAppIdsRequest,
      com.comdex.liquidation.v1beta1.QueryAppIdsResponse> getQueryAppIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAppIds",
      requestType = com.comdex.liquidation.v1beta1.QueryAppIdsRequest.class,
      responseType = com.comdex.liquidation.v1beta1.QueryAppIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryAppIdsRequest,
      com.comdex.liquidation.v1beta1.QueryAppIdsResponse> getQueryAppIdsMethod() {
    io.grpc.MethodDescriptor<com.comdex.liquidation.v1beta1.QueryAppIdsRequest, com.comdex.liquidation.v1beta1.QueryAppIdsResponse> getQueryAppIdsMethod;
    if ((getQueryAppIdsMethod = QueryGrpc.getQueryAppIdsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAppIdsMethod = QueryGrpc.getQueryAppIdsMethod) == null) {
          QueryGrpc.getQueryAppIdsMethod = getQueryAppIdsMethod =
              io.grpc.MethodDescriptor.<com.comdex.liquidation.v1beta1.QueryAppIdsRequest, com.comdex.liquidation.v1beta1.QueryAppIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAppIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryAppIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.liquidation.v1beta1.QueryAppIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAppIds"))
              .build();
        }
      }
    }
    return getQueryAppIdsMethod;
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
    default void queryLockedVault(com.comdex.liquidation.v1beta1.QueryLockedVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockedVaultMethod(), responseObserver);
    }

    /**
     */
    default void queryLockedVaults(com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockedVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryLiquidationParams(com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLiquidationParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockedVaultsHistoryMethod(), responseObserver);
    }

    /**
     */
    default void queryUserLockedVaults(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserLockedVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryUserLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserLockedVaultsHistoryMethod(), responseObserver);
    }

    /**
     */
    default void queryLockedVaultsPair(com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockedVaultsPairMethod(), responseObserver);
    }

    /**
     */
    default void queryAppIds(com.comdex.liquidation.v1beta1.QueryAppIdsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryAppIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAppIdsMethod(), responseObserver);
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
    public void queryLockedVault(com.comdex.liquidation.v1beta1.QueryLockedVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockedVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockedVaults(com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockedVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLiquidationParams(com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLiquidationParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockedVaultsHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserLockedVaults(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserLockedVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserLockedVaultsHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockedVaultsPair(com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockedVaultsPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAppIds(com.comdex.liquidation.v1beta1.QueryAppIdsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryAppIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAppIdsMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.liquidation.v1beta1.QueryLockedVaultResponse queryLockedVault(com.comdex.liquidation.v1beta1.QueryLockedVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockedVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse queryLockedVaults(com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockedVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse queryLiquidationParams(com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLiquidationParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse queryLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockedVaultsHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse queryUserLockedVaults(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserLockedVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse queryUserLockedVaultsHistory(com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserLockedVaultsHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse queryLockedVaultsPair(com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockedVaultsPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.liquidation.v1beta1.QueryAppIdsResponse queryAppIds(com.comdex.liquidation.v1beta1.QueryAppIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAppIdsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryLockedVaultResponse> queryLockedVault(
        com.comdex.liquidation.v1beta1.QueryLockedVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockedVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse> queryLockedVaults(
        com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockedVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse> queryLiquidationParams(
        com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLiquidationParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse> queryLockedVaultsHistory(
        com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockedVaultsHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse> queryUserLockedVaults(
        com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserLockedVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse> queryUserLockedVaultsHistory(
        com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserLockedVaultsHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse> queryLockedVaultsPair(
        com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockedVaultsPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.liquidation.v1beta1.QueryAppIdsResponse> queryAppIds(
        com.comdex.liquidation.v1beta1.QueryAppIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAppIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_LOCKED_VAULT = 0;
  private static final int METHODID_QUERY_LOCKED_VAULTS = 1;
  private static final int METHODID_QUERY_LIQUIDATION_PARAMS = 2;
  private static final int METHODID_QUERY_LOCKED_VAULTS_HISTORY = 3;
  private static final int METHODID_QUERY_USER_LOCKED_VAULTS = 4;
  private static final int METHODID_QUERY_USER_LOCKED_VAULTS_HISTORY = 5;
  private static final int METHODID_QUERY_LOCKED_VAULTS_PAIR = 6;
  private static final int METHODID_QUERY_APP_IDS = 7;

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
        case METHODID_QUERY_LOCKED_VAULT:
          serviceImpl.queryLockedVault((com.comdex.liquidation.v1beta1.QueryLockedVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKED_VAULTS:
          serviceImpl.queryLockedVaults((com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_LIQUIDATION_PARAMS:
          serviceImpl.queryLiquidationParams((com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKED_VAULTS_HISTORY:
          serviceImpl.queryLockedVaultsHistory((com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_LOCKED_VAULTS:
          serviceImpl.queryUserLockedVaults((com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_LOCKED_VAULTS_HISTORY:
          serviceImpl.queryUserLockedVaultsHistory((com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKED_VAULTS_PAIR:
          serviceImpl.queryLockedVaultsPair((com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_APP_IDS:
          serviceImpl.queryAppIds((com.comdex.liquidation.v1beta1.QueryAppIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.liquidation.v1beta1.QueryAppIdsResponse>) responseObserver);
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
          getQueryLockedVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryLockedVaultRequest,
              com.comdex.liquidation.v1beta1.QueryLockedVaultResponse>(
                service, METHODID_QUERY_LOCKED_VAULT)))
        .addMethod(
          getQueryLockedVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryLockedVaultsRequest,
              com.comdex.liquidation.v1beta1.QueryLockedVaultsResponse>(
                service, METHODID_QUERY_LOCKED_VAULTS)))
        .addMethod(
          getQueryLiquidationParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryLiquidationParamsRequest,
              com.comdex.liquidation.v1beta1.QueryLiquidationParamsResponse>(
                service, METHODID_QUERY_LIQUIDATION_PARAMS)))
        .addMethod(
          getQueryLockedVaultsHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryRequest,
              com.comdex.liquidation.v1beta1.QueryLockedVaultsHistoryResponse>(
                service, METHODID_QUERY_LOCKED_VAULTS_HISTORY)))
        .addMethod(
          getQueryUserLockedVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryUserLockedVaultsRequest,
              com.comdex.liquidation.v1beta1.QueryUserLockedVaultsResponse>(
                service, METHODID_QUERY_USER_LOCKED_VAULTS)))
        .addMethod(
          getQueryUserLockedVaultsHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryRequest,
              com.comdex.liquidation.v1beta1.QueryUserLockedVaultsHistoryResponse>(
                service, METHODID_QUERY_USER_LOCKED_VAULTS_HISTORY)))
        .addMethod(
          getQueryLockedVaultsPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryLockedVaultsPairRequest,
              com.comdex.liquidation.v1beta1.QueryLockedVaultsPairResponse>(
                service, METHODID_QUERY_LOCKED_VAULTS_PAIR)))
        .addMethod(
          getQueryAppIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.liquidation.v1beta1.QueryAppIdsRequest,
              com.comdex.liquidation.v1beta1.QueryAppIdsResponse>(
                service, METHODID_QUERY_APP_IDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.liquidation.v1beta1.QuerierProto.getDescriptor();
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
              .addMethod(getQueryLockedVaultMethod())
              .addMethod(getQueryLockedVaultsMethod())
              .addMethod(getQueryLiquidationParamsMethod())
              .addMethod(getQueryLockedVaultsHistoryMethod())
              .addMethod(getQueryUserLockedVaultsMethod())
              .addMethod(getQueryUserLockedVaultsHistoryMethod())
              .addMethod(getQueryLockedVaultsPairMethod())
              .addMethod(getQueryAppIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
