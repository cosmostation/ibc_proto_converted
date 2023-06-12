package com.publicawesome.stargaze.globalfee.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stargaze/globalfee/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "publicawesome.stargaze.globalfee.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> getCodeAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CodeAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> getCodeAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest, com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> getCodeAuthorizationMethod;
    if ((getCodeAuthorizationMethod = QueryGrpc.getCodeAuthorizationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeAuthorizationMethod = QueryGrpc.getCodeAuthorizationMethod) == null) {
          QueryGrpc.getCodeAuthorizationMethod = getCodeAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest, com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CodeAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CodeAuthorization"))
              .build();
        }
      }
    }
    return getCodeAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> getContractAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractAuthorization",
      requestType = com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> getContractAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest, com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> getContractAuthorizationMethod;
    if ((getContractAuthorizationMethod = QueryGrpc.getContractAuthorizationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractAuthorizationMethod = QueryGrpc.getContractAuthorizationMethod) == null) {
          QueryGrpc.getContractAuthorizationMethod = getContractAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest, com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractAuthorization"))
              .build();
        }
      }
    }
    return getContractAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest, com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest, com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> getAuthorizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authorizations",
      requestType = com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest.class,
      responseType = com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest,
      com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> getAuthorizationsMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest, com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> getAuthorizationsMethod;
    if ((getAuthorizationsMethod = QueryGrpc.getAuthorizationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuthorizationsMethod = QueryGrpc.getAuthorizationsMethod) == null) {
          QueryGrpc.getAuthorizationsMethod = getAuthorizationsMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest, com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Authorizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Authorizations"))
              .build();
        }
      }
    }
    return getAuthorizationsMethod;
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
     */
    default void codeAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeAuthorizationMethod(), responseObserver);
    }

    /**
     */
    default void contractAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractAuthorizationMethod(), responseObserver);
    }

    /**
     */
    default void params(com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void authorizations(com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthorizationsMethod(), responseObserver);
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
     */
    public void codeAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contractAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authorizations(com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthorizationsMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse codeAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse contractAuthorization(com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse params(com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse authorizations(com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthorizationsMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse> codeAuthorization(
        com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse> contractAuthorization(
        com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse> params(
        com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse> authorizations(
        com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthorizationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CODE_AUTHORIZATION = 0;
  private static final int METHODID_CONTRACT_AUTHORIZATION = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_AUTHORIZATIONS = 3;

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
        case METHODID_CODE_AUTHORIZATION:
          serviceImpl.codeAuthorization((com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_AUTHORIZATION:
          serviceImpl.contractAuthorization((com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_AUTHORIZATIONS:
          serviceImpl.authorizations((com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse>) responseObserver);
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
          getCodeAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest,
              com.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse>(
                service, METHODID_CODE_AUTHORIZATION)))
        .addMethod(
          getContractAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest,
              com.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse>(
                service, METHODID_CONTRACT_AUTHORIZATION)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.QueryParamsRequest,
              com.publicawesome.stargaze.globalfee.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAuthorizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest,
              com.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse>(
                service, METHODID_AUTHORIZATIONS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.publicawesome.stargaze.globalfee.v1.QueryProto.getDescriptor();
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
              .addMethod(getCodeAuthorizationMethod())
              .addMethod(getContractAuthorizationMethod())
              .addMethod(getParamsMethod())
              .addMethod(getAuthorizationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
