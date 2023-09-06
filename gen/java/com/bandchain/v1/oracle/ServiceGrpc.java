package com.bandchain.v1.oracle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: band/bandchain/v1/oracle/proof.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "bandchain.v1.oracle.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryProofResponse> getProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proof",
      requestType = com.bandchain.v1.oracle.ProofProto.QueryProofRequest.class,
      responseType = com.bandchain.v1.oracle.ProofProto.QueryProofResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryProofResponse> getProofMethod() {
    io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryProofRequest, com.bandchain.v1.oracle.ProofProto.QueryProofResponse> getProofMethod;
    if ((getProofMethod = ServiceGrpc.getProofMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getProofMethod = ServiceGrpc.getProofMethod) == null) {
          ServiceGrpc.getProofMethod = getProofMethod =
              io.grpc.MethodDescriptor.<com.bandchain.v1.oracle.ProofProto.QueryProofRequest, com.bandchain.v1.oracle.ProofProto.QueryProofResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryProofRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryProofResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Proof"))
              .build();
        }
      }
    }
    return getProofMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> getMultiProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiProof",
      requestType = com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest.class,
      responseType = com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> getMultiProofMethod() {
    io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest, com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> getMultiProofMethod;
    if ((getMultiProofMethod = ServiceGrpc.getMultiProofMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getMultiProofMethod = ServiceGrpc.getMultiProofMethod) == null) {
          ServiceGrpc.getMultiProofMethod = getMultiProofMethod =
              io.grpc.MethodDescriptor.<com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest, com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiProof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("MultiProof"))
              .build();
        }
      }
    }
    return getMultiProofMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> getRequestCountProofMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestCountProof",
      requestType = com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest.class,
      responseType = com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest,
      com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> getRequestCountProofMethod() {
    io.grpc.MethodDescriptor<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest, com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> getRequestCountProofMethod;
    if ((getRequestCountProofMethod = ServiceGrpc.getRequestCountProofMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRequestCountProofMethod = ServiceGrpc.getRequestCountProofMethod) == null) {
          ServiceGrpc.getRequestCountProofMethod = getRequestCountProofMethod =
              io.grpc.MethodDescriptor.<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest, com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestCountProof"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("RequestCountProof"))
              .build();
        }
      }
    }
    return getRequestCountProofMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Proof queries the proof for given request ID
     * </pre>
     */
    default void proof(com.bandchain.v1.oracle.ProofProto.QueryProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryProofResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProofMethod(), responseObserver);
    }

    /**
     * <pre>
     * MultiProof queries multiple proofs for given list of request IDs
     * </pre>
     */
    default void multiProof(com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiProofMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestCountProof queries the count proof
     * </pre>
     */
    default void requestCountProof(com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestCountProofMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   * <pre>
   * Service defines the gRPC querier service.
   * </pre>
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   * <pre>
   * Service defines the gRPC querier service.
   * </pre>
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proof queries the proof for given request ID
     * </pre>
     */
    public void proof(com.bandchain.v1.oracle.ProofProto.QueryProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryProofResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProofMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MultiProof queries multiple proofs for given list of request IDs
     * </pre>
     */
    public void multiProof(com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiProofMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestCountProof queries the count proof
     * </pre>
     */
    public void requestCountProof(com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestCountProofMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   * <pre>
   * Service defines the gRPC querier service.
   * </pre>
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proof queries the proof for given request ID
     * </pre>
     */
    public com.bandchain.v1.oracle.ProofProto.QueryProofResponse proof(com.bandchain.v1.oracle.ProofProto.QueryProofRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProofMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MultiProof queries multiple proofs for given list of request IDs
     * </pre>
     */
    public com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse multiProof(com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiProofMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestCountProof queries the count proof
     * </pre>
     */
    public com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse requestCountProof(com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestCountProofMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   * <pre>
   * Service defines the gRPC querier service.
   * </pre>
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Proof queries the proof for given request ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bandchain.v1.oracle.ProofProto.QueryProofResponse> proof(
        com.bandchain.v1.oracle.ProofProto.QueryProofRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProofMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MultiProof queries multiple proofs for given list of request IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse> multiProof(
        com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiProofMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestCountProof queries the count proof
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse> requestCountProof(
        com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestCountProofMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROOF = 0;
  private static final int METHODID_MULTI_PROOF = 1;
  private static final int METHODID_REQUEST_COUNT_PROOF = 2;

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
        case METHODID_PROOF:
          serviceImpl.proof((com.bandchain.v1.oracle.ProofProto.QueryProofRequest) request,
              (io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryProofResponse>) responseObserver);
          break;
        case METHODID_MULTI_PROOF:
          serviceImpl.multiProof((com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest) request,
              (io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse>) responseObserver);
          break;
        case METHODID_REQUEST_COUNT_PROOF:
          serviceImpl.requestCountProof((com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest) request,
              (io.grpc.stub.StreamObserver<com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse>) responseObserver);
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
          getProofMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bandchain.v1.oracle.ProofProto.QueryProofRequest,
              com.bandchain.v1.oracle.ProofProto.QueryProofResponse>(
                service, METHODID_PROOF)))
        .addMethod(
          getMultiProofMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bandchain.v1.oracle.ProofProto.QueryMultiProofRequest,
              com.bandchain.v1.oracle.ProofProto.QueryMultiProofResponse>(
                service, METHODID_MULTI_PROOF)))
        .addMethod(
          getRequestCountProofMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofRequest,
              com.bandchain.v1.oracle.ProofProto.QueryRequestCountProofResponse>(
                service, METHODID_REQUEST_COUNT_PROOF)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bandchain.v1.oracle.ProofProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getProofMethod())
              .addMethod(getMultiProofMethod())
              .addMethod(getRequestCountProofMethod())
              .build();
        }
      }
    }
    return result;
  }
}
