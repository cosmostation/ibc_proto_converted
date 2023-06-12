package com.osmosis.cosmwasmpool.v1beta1.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/cosmwasmpool/v1beta1/model/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgCreatorGrpc {

  private MsgCreatorGrpc() {}

  public static final String SERVICE_NAME = "osmosis.cosmwasmpool.v1beta1.model.MsgCreator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool,
      com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> getCreateCosmWasmPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCosmWasmPool",
      requestType = com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool.class,
      responseType = com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool,
      com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> getCreateCosmWasmPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool, com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> getCreateCosmWasmPoolMethod;
    if ((getCreateCosmWasmPoolMethod = MsgCreatorGrpc.getCreateCosmWasmPoolMethod) == null) {
      synchronized (MsgCreatorGrpc.class) {
        if ((getCreateCosmWasmPoolMethod = MsgCreatorGrpc.getCreateCosmWasmPoolMethod) == null) {
          MsgCreatorGrpc.getCreateCosmWasmPoolMethod = getCreateCosmWasmPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool, com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCosmWasmPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgCreatorMethodDescriptorSupplier("CreateCosmWasmPool"))
              .build();
        }
      }
    }
    return getCreateCosmWasmPoolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgCreatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgCreatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgCreatorStub>() {
        @java.lang.Override
        public MsgCreatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgCreatorStub(channel, callOptions);
        }
      };
    return MsgCreatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgCreatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgCreatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgCreatorBlockingStub>() {
        @java.lang.Override
        public MsgCreatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgCreatorBlockingStub(channel, callOptions);
        }
      };
    return MsgCreatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgCreatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgCreatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgCreatorFutureStub>() {
        @java.lang.Override
        public MsgCreatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgCreatorFutureStub(channel, callOptions);
        }
      };
    return MsgCreatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCosmWasmPool(com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCosmWasmPoolMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgCreator.
   */
  public static abstract class MsgCreatorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgCreatorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgCreator.
   */
  public static final class MsgCreatorStub
      extends io.grpc.stub.AbstractAsyncStub<MsgCreatorStub> {
    private MsgCreatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgCreatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgCreatorStub(channel, callOptions);
    }

    /**
     */
    public void createCosmWasmPool(com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool request,
        io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCosmWasmPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgCreator.
   */
  public static final class MsgCreatorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgCreatorBlockingStub> {
    private MsgCreatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgCreatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgCreatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse createCosmWasmPool(com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCosmWasmPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgCreator.
   */
  public static final class MsgCreatorFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgCreatorFutureStub> {
    private MsgCreatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgCreatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgCreatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse> createCosmWasmPool(
        com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCosmWasmPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COSM_WASM_POOL = 0;

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
        case METHODID_CREATE_COSM_WASM_POOL:
          serviceImpl.createCosmWasmPool((com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse>) responseObserver);
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
          getCreateCosmWasmPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPool,
              com.osmosis.cosmwasmpool.v1beta1.model.MsgCreateCosmWasmPoolResponse>(
                service, METHODID_CREATE_COSM_WASM_POOL)))
        .build();
  }

  private static abstract class MsgCreatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgCreatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.cosmwasmpool.v1beta1.model.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgCreator");
    }
  }

  private static final class MsgCreatorFileDescriptorSupplier
      extends MsgCreatorBaseDescriptorSupplier {
    MsgCreatorFileDescriptorSupplier() {}
  }

  private static final class MsgCreatorMethodDescriptorSupplier
      extends MsgCreatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgCreatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgCreatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgCreatorFileDescriptorSupplier())
              .addMethod(getCreateCosmWasmPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
