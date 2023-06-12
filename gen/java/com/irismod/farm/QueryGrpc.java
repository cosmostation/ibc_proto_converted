package com.irismod.farm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/farm/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.farm.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolsRequest,
      com.irismod.farm.QueryFarmPoolsResponse> getFarmPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FarmPools",
      requestType = com.irismod.farm.QueryFarmPoolsRequest.class,
      responseType = com.irismod.farm.QueryFarmPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolsRequest,
      com.irismod.farm.QueryFarmPoolsResponse> getFarmPoolsMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolsRequest, com.irismod.farm.QueryFarmPoolsResponse> getFarmPoolsMethod;
    if ((getFarmPoolsMethod = QueryGrpc.getFarmPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmPoolsMethod = QueryGrpc.getFarmPoolsMethod) == null) {
          QueryGrpc.getFarmPoolsMethod = getFarmPoolsMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.QueryFarmPoolsRequest, com.irismod.farm.QueryFarmPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FarmPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FarmPools"))
              .build();
        }
      }
    }
    return getFarmPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolRequest,
      com.irismod.farm.QueryFarmPoolResponse> getFarmPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FarmPool",
      requestType = com.irismod.farm.QueryFarmPoolRequest.class,
      responseType = com.irismod.farm.QueryFarmPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolRequest,
      com.irismod.farm.QueryFarmPoolResponse> getFarmPoolMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmPoolRequest, com.irismod.farm.QueryFarmPoolResponse> getFarmPoolMethod;
    if ((getFarmPoolMethod = QueryGrpc.getFarmPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmPoolMethod = QueryGrpc.getFarmPoolMethod) == null) {
          QueryGrpc.getFarmPoolMethod = getFarmPoolMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.QueryFarmPoolRequest, com.irismod.farm.QueryFarmPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FarmPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FarmPool"))
              .build();
        }
      }
    }
    return getFarmPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmerRequest,
      com.irismod.farm.QueryFarmerResponse> getFarmerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Farmer",
      requestType = com.irismod.farm.QueryFarmerRequest.class,
      responseType = com.irismod.farm.QueryFarmerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmerRequest,
      com.irismod.farm.QueryFarmerResponse> getFarmerMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.QueryFarmerRequest, com.irismod.farm.QueryFarmerResponse> getFarmerMethod;
    if ((getFarmerMethod = QueryGrpc.getFarmerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFarmerMethod = QueryGrpc.getFarmerMethod) == null) {
          QueryGrpc.getFarmerMethod = getFarmerMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.QueryFarmerRequest, com.irismod.farm.QueryFarmerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Farmer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryFarmerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Farmer"))
              .build();
        }
      }
    }
    return getFarmerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.farm.QueryParamsRequest,
      com.irismod.farm.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.irismod.farm.QueryParamsRequest.class,
      responseType = com.irismod.farm.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.farm.QueryParamsRequest,
      com.irismod.farm.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.irismod.farm.QueryParamsRequest, com.irismod.farm.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.irismod.farm.QueryParamsRequest, com.irismod.farm.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.farm.QueryParamsResponse.getDefaultInstance()))
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
   */
  public interface AsyncService {

    /**
     */
    default void farmPools(com.irismod.farm.QueryFarmPoolsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmPoolsMethod(), responseObserver);
    }

    /**
     */
    default void farmPool(com.irismod.farm.QueryFarmPoolRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmPoolMethod(), responseObserver);
    }

    /**
     */
    default void farmer(com.irismod.farm.QueryFarmerRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    default void params(com.irismod.farm.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
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
    public void farmPools(com.irismod.farm.QueryFarmPoolsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void farmPool(com.irismod.farm.QueryFarmPoolRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void farmer(com.irismod.farm.QueryFarmerRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public void params(com.irismod.farm.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.farm.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.irismod.farm.QueryFarmPoolsResponse farmPools(com.irismod.farm.QueryFarmPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.irismod.farm.QueryFarmPoolResponse farmPool(com.irismod.farm.QueryFarmPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.irismod.farm.QueryFarmerResponse farmer(com.irismod.farm.QueryFarmerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public com.irismod.farm.QueryParamsResponse params(com.irismod.farm.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.QueryFarmPoolsResponse> farmPools(
        com.irismod.farm.QueryFarmPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.QueryFarmPoolResponse> farmPool(
        com.irismod.farm.QueryFarmPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.QueryFarmerResponse> farmer(
        com.irismod.farm.QueryFarmerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the htlc parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.farm.QueryParamsResponse> params(
        com.irismod.farm.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FARM_POOLS = 0;
  private static final int METHODID_FARM_POOL = 1;
  private static final int METHODID_FARMER = 2;
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
        case METHODID_FARM_POOLS:
          serviceImpl.farmPools((com.irismod.farm.QueryFarmPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolsResponse>) responseObserver);
          break;
        case METHODID_FARM_POOL:
          serviceImpl.farmPool((com.irismod.farm.QueryFarmPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmPoolResponse>) responseObserver);
          break;
        case METHODID_FARMER:
          serviceImpl.farmer((com.irismod.farm.QueryFarmerRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.QueryFarmerResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.irismod.farm.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.farm.QueryParamsResponse>) responseObserver);
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
          getFarmPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.QueryFarmPoolsRequest,
              com.irismod.farm.QueryFarmPoolsResponse>(
                service, METHODID_FARM_POOLS)))
        .addMethod(
          getFarmPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.QueryFarmPoolRequest,
              com.irismod.farm.QueryFarmPoolResponse>(
                service, METHODID_FARM_POOL)))
        .addMethod(
          getFarmerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.QueryFarmerRequest,
              com.irismod.farm.QueryFarmerResponse>(
                service, METHODID_FARMER)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.farm.QueryParamsRequest,
              com.irismod.farm.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.farm.QueryProto.getDescriptor();
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
              .addMethod(getFarmPoolsMethod())
              .addMethod(getFarmPoolMethod())
              .addMethod(getFarmerMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
