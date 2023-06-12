package com.secret.compute.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the wasm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: secret/compute/v1beta1/msg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "secret.compute.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgStoreCode,
      com.secret.compute.v1beta1.MsgStoreCodeResponse> getStoreCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreCode",
      requestType = com.secret.compute.v1beta1.MsgStoreCode.class,
      responseType = com.secret.compute.v1beta1.MsgStoreCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgStoreCode,
      com.secret.compute.v1beta1.MsgStoreCodeResponse> getStoreCodeMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgStoreCode, com.secret.compute.v1beta1.MsgStoreCodeResponse> getStoreCodeMethod;
    if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
          MsgGrpc.getStoreCodeMethod = getStoreCodeMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.MsgStoreCode, com.secret.compute.v1beta1.MsgStoreCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgStoreCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgStoreCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StoreCode"))
              .build();
        }
      }
    }
    return getStoreCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgInstantiateContract,
      com.secret.compute.v1beta1.MsgInstantiateContractResponse> getInstantiateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantiateContract",
      requestType = com.secret.compute.v1beta1.MsgInstantiateContract.class,
      responseType = com.secret.compute.v1beta1.MsgInstantiateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgInstantiateContract,
      com.secret.compute.v1beta1.MsgInstantiateContractResponse> getInstantiateContractMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgInstantiateContract, com.secret.compute.v1beta1.MsgInstantiateContractResponse> getInstantiateContractMethod;
    if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
          MsgGrpc.getInstantiateContractMethod = getInstantiateContractMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.MsgInstantiateContract, com.secret.compute.v1beta1.MsgInstantiateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantiateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgInstantiateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgInstantiateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantiateContract"))
              .build();
        }
      }
    }
    return getInstantiateContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgExecuteContract,
      com.secret.compute.v1beta1.MsgExecuteContractResponse> getExecuteContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteContract",
      requestType = com.secret.compute.v1beta1.MsgExecuteContract.class,
      responseType = com.secret.compute.v1beta1.MsgExecuteContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgExecuteContract,
      com.secret.compute.v1beta1.MsgExecuteContractResponse> getExecuteContractMethod() {
    io.grpc.MethodDescriptor<com.secret.compute.v1beta1.MsgExecuteContract, com.secret.compute.v1beta1.MsgExecuteContractResponse> getExecuteContractMethod;
    if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
          MsgGrpc.getExecuteContractMethod = getExecuteContractMethod =
              io.grpc.MethodDescriptor.<com.secret.compute.v1beta1.MsgExecuteContract, com.secret.compute.v1beta1.MsgExecuteContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgExecuteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secret.compute.v1beta1.MsgExecuteContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteContract"))
              .build();
        }
      }
    }
    return getExecuteContractMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    default void storeCode(com.secret.compute.v1beta1.MsgStoreCode request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    default void instantiateContract(com.secret.compute.v1beta1.MsgInstantiateContract request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantiateContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    default void executeContract(com.secret.compute.v1beta1.MsgExecuteContract request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteContractMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public void storeCode(com.secret.compute.v1beta1.MsgStoreCode request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public void instantiateContract(com.secret.compute.v1beta1.MsgInstantiateContract request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public void executeContract(com.secret.compute.v1beta1.MsgExecuteContract request,
        io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public com.secret.compute.v1beta1.MsgStoreCodeResponse storeCode(com.secret.compute.v1beta1.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public com.secret.compute.v1beta1.MsgInstantiateContractResponse instantiateContract(com.secret.compute.v1beta1.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantiateContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public com.secret.compute.v1beta1.MsgExecuteContractResponse executeContract(com.secret.compute.v1beta1.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteContractMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.MsgStoreCodeResponse> storeCode(
        com.secret.compute.v1beta1.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.MsgInstantiateContractResponse> instantiateContract(
        com.secret.compute.v1beta1.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secret.compute.v1beta1.MsgExecuteContractResponse> executeContract(
        com.secret.compute.v1beta1.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_CODE = 0;
  private static final int METHODID_INSTANTIATE_CONTRACT = 1;
  private static final int METHODID_EXECUTE_CONTRACT = 2;

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
        case METHODID_STORE_CODE:
          serviceImpl.storeCode((com.secret.compute.v1beta1.MsgStoreCode) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgStoreCodeResponse>) responseObserver);
          break;
        case METHODID_INSTANTIATE_CONTRACT:
          serviceImpl.instantiateContract((com.secret.compute.v1beta1.MsgInstantiateContract) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgInstantiateContractResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_CONTRACT:
          serviceImpl.executeContract((com.secret.compute.v1beta1.MsgExecuteContract) request,
              (io.grpc.stub.StreamObserver<com.secret.compute.v1beta1.MsgExecuteContractResponse>) responseObserver);
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
          getStoreCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.MsgStoreCode,
              com.secret.compute.v1beta1.MsgStoreCodeResponse>(
                service, METHODID_STORE_CODE)))
        .addMethod(
          getInstantiateContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.MsgInstantiateContract,
              com.secret.compute.v1beta1.MsgInstantiateContractResponse>(
                service, METHODID_INSTANTIATE_CONTRACT)))
        .addMethod(
          getExecuteContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.secret.compute.v1beta1.MsgExecuteContract,
              com.secret.compute.v1beta1.MsgExecuteContractResponse>(
                service, METHODID_EXECUTE_CONTRACT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.secret.compute.v1beta1.MsgProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getStoreCodeMethod())
              .addMethod(getInstantiateContractMethod())
              .addMethod(getExecuteContractMethod())
              .build();
        }
      }
    }
    return result;
  }
}
