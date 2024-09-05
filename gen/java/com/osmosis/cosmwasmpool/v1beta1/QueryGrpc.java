package com.osmosis.cosmwasmpool.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/cosmwasmpool/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.cosmwasmpool.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest.class,
      responseType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest.class,
      responseType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> getContractInfoByPoolIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractInfoByPoolId",
      requestType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest.class,
      responseType = com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest,
      com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> getContractInfoByPoolIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> getContractInfoByPoolIdMethod;
    if ((getContractInfoByPoolIdMethod = QueryGrpc.getContractInfoByPoolIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractInfoByPoolIdMethod = QueryGrpc.getContractInfoByPoolIdMethod) == null) {
          QueryGrpc.getContractInfoByPoolIdMethod = getContractInfoByPoolIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest, com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractInfoByPoolId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractInfoByPoolId"))
              .build();
        }
      }
    }
    return getContractInfoByPoolIdMethod;
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
     * Pools returns all cosmwasm pools
     * </pre>
     */
    default void pools(com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns the parameters of the x/cosmwasmpool module.
     * </pre>
     */
    default void params(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void contractInfoByPoolId(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractInfoByPoolIdMethod(), responseObserver);
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
     * Pools returns all cosmwasm pools
     * </pre>
     */
    public void pools(com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns the parameters of the x/cosmwasmpool module.
     * </pre>
     */
    public void params(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contractInfoByPoolId(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractInfoByPoolIdMethod(), getCallOptions()), request, responseObserver);
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
     * Pools returns all cosmwasm pools
     * </pre>
     */
    public com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse pools(com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns the parameters of the x/cosmwasmpool module.
     * </pre>
     */
    public com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse params(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse contractInfoByPoolId(com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractInfoByPoolIdMethod(), getCallOptions(), request);
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
     * Pools returns all cosmwasm pools
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse> pools(
        com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns the parameters of the x/cosmwasmpool module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse> params(
        com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse> contractInfoByPoolId(
        com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractInfoByPoolIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOLS = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_CONTRACT_INFO_BY_POOL_ID = 2;

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
          serviceImpl.pools((com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_INFO_BY_POOL_ID:
          serviceImpl.contractInfoByPoolId((com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse>) responseObserver);
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
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsRequest,
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.PoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsRequest,
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.ParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getContractInfoByPoolIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdRequest,
              com.osmosis.cosmwasmpool.v1beta1.QueryProto.ContractInfoByPoolIdResponse>(
                service, METHODID_CONTRACT_INFO_BY_POOL_ID)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.cosmwasmpool.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getContractInfoByPoolIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
