package com.bandchain.v1.node;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: band/bandchain/v1/node/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "bandchain.v1.node.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryChainIDRequest,
      com.bandchain.v1.node.QueryChainIDResponse> getChainIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainID",
      requestType = com.bandchain.v1.node.QueryChainIDRequest.class,
      responseType = com.bandchain.v1.node.QueryChainIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryChainIDRequest,
      com.bandchain.v1.node.QueryChainIDResponse> getChainIDMethod() {
    io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryChainIDRequest, com.bandchain.v1.node.QueryChainIDResponse> getChainIDMethod;
    if ((getChainIDMethod = ServiceGrpc.getChainIDMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getChainIDMethod = ServiceGrpc.getChainIDMethod) == null) {
          ServiceGrpc.getChainIDMethod = getChainIDMethod =
              io.grpc.MethodDescriptor.<com.bandchain.v1.node.QueryChainIDRequest, com.bandchain.v1.node.QueryChainIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.node.QueryChainIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.node.QueryChainIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ChainID"))
              .build();
        }
      }
    }
    return getChainIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryEVMValidatorsRequest,
      com.bandchain.v1.node.QueryEVMValidatorsResponse> getEVMValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EVMValidators",
      requestType = com.bandchain.v1.node.QueryEVMValidatorsRequest.class,
      responseType = com.bandchain.v1.node.QueryEVMValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryEVMValidatorsRequest,
      com.bandchain.v1.node.QueryEVMValidatorsResponse> getEVMValidatorsMethod() {
    io.grpc.MethodDescriptor<com.bandchain.v1.node.QueryEVMValidatorsRequest, com.bandchain.v1.node.QueryEVMValidatorsResponse> getEVMValidatorsMethod;
    if ((getEVMValidatorsMethod = ServiceGrpc.getEVMValidatorsMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getEVMValidatorsMethod = ServiceGrpc.getEVMValidatorsMethod) == null) {
          ServiceGrpc.getEVMValidatorsMethod = getEVMValidatorsMethod =
              io.grpc.MethodDescriptor.<com.bandchain.v1.node.QueryEVMValidatorsRequest, com.bandchain.v1.node.QueryEVMValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EVMValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.node.QueryEVMValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bandchain.v1.node.QueryEVMValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("EVMValidators"))
              .build();
        }
      }
    }
    return getEVMValidatorsMethod;
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
     * ChainID queries the chain ID of this node
     * </pre>
     */
    default void chainID(com.bandchain.v1.node.QueryChainIDRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryChainIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * EVMValidators queries current list of validator's address and power
     * </pre>
     */
    default void eVMValidators(com.bandchain.v1.node.QueryEVMValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryEVMValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEVMValidatorsMethod(), responseObserver);
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
     * ChainID queries the chain ID of this node
     * </pre>
     */
    public void chainID(com.bandchain.v1.node.QueryChainIDRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryChainIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EVMValidators queries current list of validator's address and power
     * </pre>
     */
    public void eVMValidators(com.bandchain.v1.node.QueryEVMValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryEVMValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEVMValidatorsMethod(), getCallOptions()), request, responseObserver);
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
     * ChainID queries the chain ID of this node
     * </pre>
     */
    public com.bandchain.v1.node.QueryChainIDResponse chainID(com.bandchain.v1.node.QueryChainIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EVMValidators queries current list of validator's address and power
     * </pre>
     */
    public com.bandchain.v1.node.QueryEVMValidatorsResponse eVMValidators(com.bandchain.v1.node.QueryEVMValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEVMValidatorsMethod(), getCallOptions(), request);
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
     * ChainID queries the chain ID of this node
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bandchain.v1.node.QueryChainIDResponse> chainID(
        com.bandchain.v1.node.QueryChainIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EVMValidators queries current list of validator's address and power
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bandchain.v1.node.QueryEVMValidatorsResponse> eVMValidators(
        com.bandchain.v1.node.QueryEVMValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEVMValidatorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHAIN_ID = 0;
  private static final int METHODID_EVMVALIDATORS = 1;

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
        case METHODID_CHAIN_ID:
          serviceImpl.chainID((com.bandchain.v1.node.QueryChainIDRequest) request,
              (io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryChainIDResponse>) responseObserver);
          break;
        case METHODID_EVMVALIDATORS:
          serviceImpl.eVMValidators((com.bandchain.v1.node.QueryEVMValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.bandchain.v1.node.QueryEVMValidatorsResponse>) responseObserver);
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
          getChainIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bandchain.v1.node.QueryChainIDRequest,
              com.bandchain.v1.node.QueryChainIDResponse>(
                service, METHODID_CHAIN_ID)))
        .addMethod(
          getEVMValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bandchain.v1.node.QueryEVMValidatorsRequest,
              com.bandchain.v1.node.QueryEVMValidatorsResponse>(
                service, METHODID_EVMVALIDATORS)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bandchain.v1.node.QueryProto.getDescriptor();
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
              .addMethod(getChainIDMethod())
              .addMethod(getEVMValidatorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
