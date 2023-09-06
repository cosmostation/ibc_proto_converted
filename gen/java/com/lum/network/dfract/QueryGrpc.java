package com.lum.network.dfract;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: lum-network/dfract/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "lum.network.dfract.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest,
      com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleAccountBalance",
      requestType = com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest.class,
      responseType = com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest,
      com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod() {
    io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest, com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> getModuleAccountBalanceMethod;
    if ((getModuleAccountBalanceMethod = QueryGrpc.getModuleAccountBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleAccountBalanceMethod = QueryGrpc.getModuleAccountBalanceMethod) == null) {
          QueryGrpc.getModuleAccountBalanceMethod = getModuleAccountBalanceMethod =
              io.grpc.MethodDescriptor.<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest, com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleAccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleAccountBalance"))
              .build();
        }
      }
    }
    return getModuleAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryParamsRequest,
      com.lum.network.dfract.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.lum.network.dfract.QueryProto.QueryParamsRequest.class,
      responseType = com.lum.network.dfract.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryParamsRequest,
      com.lum.network.dfract.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryParamsRequest, com.lum.network.dfract.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.dfract.QueryProto.QueryParamsRequest, com.lum.network.dfract.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest,
      com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> getGetDepositsForAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepositsForAddress",
      requestType = com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest.class,
      responseType = com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest,
      com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> getGetDepositsForAddressMethod() {
    io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest, com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> getGetDepositsForAddressMethod;
    if ((getGetDepositsForAddressMethod = QueryGrpc.getGetDepositsForAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDepositsForAddressMethod = QueryGrpc.getGetDepositsForAddressMethod) == null) {
          QueryGrpc.getGetDepositsForAddressMethod = getGetDepositsForAddressMethod =
              io.grpc.MethodDescriptor.<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest, com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepositsForAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDepositsForAddress"))
              .build();
        }
      }
    }
    return getGetDepositsForAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest,
      com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> getFetchDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchDeposits",
      requestType = com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest.class,
      responseType = com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest,
      com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> getFetchDepositsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest, com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> getFetchDepositsMethod;
    if ((getFetchDepositsMethod = QueryGrpc.getFetchDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFetchDepositsMethod = QueryGrpc.getFetchDepositsMethod) == null) {
          QueryGrpc.getFetchDepositsMethod = getFetchDepositsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest, com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchDeposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FetchDeposits"))
              .build();
        }
      }
    }
    return getFetchDepositsMethod;
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
    default void moduleAccountBalance(com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleAccountBalanceMethod(), responseObserver);
    }

    /**
     */
    default void params(com.lum.network.dfract.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void getDepositsForAddress(com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepositsForAddressMethod(), responseObserver);
    }

    /**
     */
    default void fetchDeposits(com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFetchDepositsMethod(), responseObserver);
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
    public void moduleAccountBalance(com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.lum.network.dfract.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDepositsForAddress(com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepositsForAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchDeposits(com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest request,
        io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchDepositsMethod(), getCallOptions()), request, responseObserver);
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
    public com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse moduleAccountBalance(com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.dfract.QueryProto.QueryParamsResponse params(com.lum.network.dfract.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse getDepositsForAddress(com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepositsForAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse fetchDeposits(com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchDepositsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse> moduleAccountBalance(
        com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.dfract.QueryProto.QueryParamsResponse> params(
        com.lum.network.dfract.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse> getDepositsForAddress(
        com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepositsForAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse> fetchDeposits(
        com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchDepositsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_ACCOUNT_BALANCE = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_GET_DEPOSITS_FOR_ADDRESS = 2;
  private static final int METHODID_FETCH_DEPOSITS = 3;

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
        case METHODID_MODULE_ACCOUNT_BALANCE:
          serviceImpl.moduleAccountBalance((com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.lum.network.dfract.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_GET_DEPOSITS_FOR_ADDRESS:
          serviceImpl.getDepositsForAddress((com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse>) responseObserver);
          break;
        case METHODID_FETCH_DEPOSITS:
          serviceImpl.fetchDeposits((com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse>) responseObserver);
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
          getModuleAccountBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceRequest,
              com.lum.network.dfract.QueryProto.QueryModuleAccountBalanceResponse>(
                service, METHODID_MODULE_ACCOUNT_BALANCE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.dfract.QueryProto.QueryParamsRequest,
              com.lum.network.dfract.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getGetDepositsForAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressRequest,
              com.lum.network.dfract.QueryProto.QueryGetDepositsForAddressResponse>(
                service, METHODID_GET_DEPOSITS_FOR_ADDRESS)))
        .addMethod(
          getFetchDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.dfract.QueryProto.QueryFetchDepositsRequest,
              com.lum.network.dfract.QueryProto.QueryFetchDepositsResponse>(
                service, METHODID_FETCH_DEPOSITS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.dfract.QueryProto.getDescriptor();
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
              .addMethod(getModuleAccountBalanceMethod())
              .addMethod(getParamsMethod())
              .addMethod(getGetDepositsForAddressMethod())
              .addMethod(getFetchDepositsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
