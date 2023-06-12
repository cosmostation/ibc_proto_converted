package com.irismod.htlc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/htlc/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.htlc.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.QueryHTLCRequest,
      com.irismod.htlc.QueryHTLCResponse> getHTLCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HTLC",
      requestType = com.irismod.htlc.QueryHTLCRequest.class,
      responseType = com.irismod.htlc.QueryHTLCResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.QueryHTLCRequest,
      com.irismod.htlc.QueryHTLCResponse> getHTLCMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.QueryHTLCRequest, com.irismod.htlc.QueryHTLCResponse> getHTLCMethod;
    if ((getHTLCMethod = QueryGrpc.getHTLCMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHTLCMethod = QueryGrpc.getHTLCMethod) == null) {
          QueryGrpc.getHTLCMethod = getHTLCMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.QueryHTLCRequest, com.irismod.htlc.QueryHTLCResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HTLC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryHTLCRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryHTLCResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HTLC"))
              .build();
        }
      }
    }
    return getHTLCMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSupplyRequest,
      com.irismod.htlc.QueryAssetSupplyResponse> getAssetSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetSupply",
      requestType = com.irismod.htlc.QueryAssetSupplyRequest.class,
      responseType = com.irismod.htlc.QueryAssetSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSupplyRequest,
      com.irismod.htlc.QueryAssetSupplyResponse> getAssetSupplyMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSupplyRequest, com.irismod.htlc.QueryAssetSupplyResponse> getAssetSupplyMethod;
    if ((getAssetSupplyMethod = QueryGrpc.getAssetSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetSupplyMethod = QueryGrpc.getAssetSupplyMethod) == null) {
          QueryGrpc.getAssetSupplyMethod = getAssetSupplyMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.QueryAssetSupplyRequest, com.irismod.htlc.QueryAssetSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryAssetSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryAssetSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetSupply"))
              .build();
        }
      }
    }
    return getAssetSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSuppliesRequest,
      com.irismod.htlc.QueryAssetSuppliesResponse> getAssetSuppliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetSupplies",
      requestType = com.irismod.htlc.QueryAssetSuppliesRequest.class,
      responseType = com.irismod.htlc.QueryAssetSuppliesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSuppliesRequest,
      com.irismod.htlc.QueryAssetSuppliesResponse> getAssetSuppliesMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.QueryAssetSuppliesRequest, com.irismod.htlc.QueryAssetSuppliesResponse> getAssetSuppliesMethod;
    if ((getAssetSuppliesMethod = QueryGrpc.getAssetSuppliesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetSuppliesMethod = QueryGrpc.getAssetSuppliesMethod) == null) {
          QueryGrpc.getAssetSuppliesMethod = getAssetSuppliesMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.QueryAssetSuppliesRequest, com.irismod.htlc.QueryAssetSuppliesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetSupplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryAssetSuppliesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryAssetSuppliesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetSupplies"))
              .build();
        }
      }
    }
    return getAssetSuppliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.QueryParamsRequest,
      com.irismod.htlc.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.irismod.htlc.QueryParamsRequest.class,
      responseType = com.irismod.htlc.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.QueryParamsRequest,
      com.irismod.htlc.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.QueryParamsRequest, com.irismod.htlc.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.QueryParamsRequest, com.irismod.htlc.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * HTLC queries the HTLC by the specified hash lock
     * </pre>
     */
    default void hTLC(com.irismod.htlc.QueryHTLCRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryHTLCResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHTLCMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssetSupply queries the supply of an asset
     * </pre>
     */
    default void assetSupply(com.irismod.htlc.QueryAssetSupplyRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssetSupplies queries the supplies of all assets
     * </pre>
     */
    default void assetSupplies(com.irismod.htlc.QueryAssetSuppliesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSuppliesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetSuppliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    default void params(com.irismod.htlc.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * HTLC queries the HTLC by the specified hash lock
     * </pre>
     */
    public void hTLC(com.irismod.htlc.QueryHTLCRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryHTLCResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHTLCMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssetSupply queries the supply of an asset
     * </pre>
     */
    public void assetSupply(com.irismod.htlc.QueryAssetSupplyRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssetSupplies queries the supplies of all assets
     * </pre>
     */
    public void assetSupplies(com.irismod.htlc.QueryAssetSuppliesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSuppliesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetSuppliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public void params(com.irismod.htlc.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * HTLC queries the HTLC by the specified hash lock
     * </pre>
     */
    public com.irismod.htlc.QueryHTLCResponse hTLC(com.irismod.htlc.QueryHTLCRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHTLCMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssetSupply queries the supply of an asset
     * </pre>
     */
    public com.irismod.htlc.QueryAssetSupplyResponse assetSupply(com.irismod.htlc.QueryAssetSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssetSupplies queries the supplies of all assets
     * </pre>
     */
    public com.irismod.htlc.QueryAssetSuppliesResponse assetSupplies(com.irismod.htlc.QueryAssetSuppliesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetSuppliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public com.irismod.htlc.QueryParamsResponse params(com.irismod.htlc.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * HTLC queries the HTLC by the specified hash lock
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.QueryHTLCResponse> hTLC(
        com.irismod.htlc.QueryHTLCRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHTLCMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssetSupply queries the supply of an asset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.QueryAssetSupplyResponse> assetSupply(
        com.irismod.htlc.QueryAssetSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssetSupplies queries the supplies of all assets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.QueryAssetSuppliesResponse> assetSupplies(
        com.irismod.htlc.QueryAssetSuppliesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetSuppliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.QueryParamsResponse> params(
        com.irismod.htlc.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HTLC = 0;
  private static final int METHODID_ASSET_SUPPLY = 1;
  private static final int METHODID_ASSET_SUPPLIES = 2;
  private static final int METHODID_PARAMS = 3;

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
        case METHODID_HTLC:
          serviceImpl.hTLC((com.irismod.htlc.QueryHTLCRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.QueryHTLCResponse>) responseObserver);
          break;
        case METHODID_ASSET_SUPPLY:
          serviceImpl.assetSupply((com.irismod.htlc.QueryAssetSupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSupplyResponse>) responseObserver);
          break;
        case METHODID_ASSET_SUPPLIES:
          serviceImpl.assetSupplies((com.irismod.htlc.QueryAssetSuppliesRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.QueryAssetSuppliesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.irismod.htlc.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.QueryParamsResponse>) responseObserver);
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
          getHTLCMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.QueryHTLCRequest,
              com.irismod.htlc.QueryHTLCResponse>(
                service, METHODID_HTLC)))
        .addMethod(
          getAssetSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.QueryAssetSupplyRequest,
              com.irismod.htlc.QueryAssetSupplyResponse>(
                service, METHODID_ASSET_SUPPLY)))
        .addMethod(
          getAssetSuppliesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.QueryAssetSuppliesRequest,
              com.irismod.htlc.QueryAssetSuppliesResponse>(
                service, METHODID_ASSET_SUPPLIES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.QueryParamsRequest,
              com.irismod.htlc.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.htlc.QueryProto.getDescriptor();
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
              .addMethod(getHTLCMethod())
              .addMethod(getAssetSupplyMethod())
              .addMethod(getAssetSuppliesMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
