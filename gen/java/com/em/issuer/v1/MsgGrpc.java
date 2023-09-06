package com.em.issuer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: em/issuer/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "em.issuer.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgIncreaseMintable,
      com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> getIncreaseMintableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncreaseMintable",
      requestType = com.em.issuer.v1.TxProto.MsgIncreaseMintable.class,
      responseType = com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgIncreaseMintable,
      com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> getIncreaseMintableMethod() {
    io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgIncreaseMintable, com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> getIncreaseMintableMethod;
    if ((getIncreaseMintableMethod = MsgGrpc.getIncreaseMintableMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIncreaseMintableMethod = MsgGrpc.getIncreaseMintableMethod) == null) {
          MsgGrpc.getIncreaseMintableMethod = getIncreaseMintableMethod =
              io.grpc.MethodDescriptor.<com.em.issuer.v1.TxProto.MsgIncreaseMintable, com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncreaseMintable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgIncreaseMintable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IncreaseMintable"))
              .build();
        }
      }
    }
    return getIncreaseMintableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgDecreaseMintable,
      com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> getDecreaseMintableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecreaseMintable",
      requestType = com.em.issuer.v1.TxProto.MsgDecreaseMintable.class,
      responseType = com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgDecreaseMintable,
      com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> getDecreaseMintableMethod() {
    io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgDecreaseMintable, com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> getDecreaseMintableMethod;
    if ((getDecreaseMintableMethod = MsgGrpc.getDecreaseMintableMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDecreaseMintableMethod = MsgGrpc.getDecreaseMintableMethod) == null) {
          MsgGrpc.getDecreaseMintableMethod = getDecreaseMintableMethod =
              io.grpc.MethodDescriptor.<com.em.issuer.v1.TxProto.MsgDecreaseMintable, com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecreaseMintable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgDecreaseMintable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DecreaseMintable"))
              .build();
        }
      }
    }
    return getDecreaseMintableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider,
      com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> getRevokeLiquidityProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeLiquidityProvider",
      requestType = com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider.class,
      responseType = com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider,
      com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> getRevokeLiquidityProviderMethod() {
    io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider, com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> getRevokeLiquidityProviderMethod;
    if ((getRevokeLiquidityProviderMethod = MsgGrpc.getRevokeLiquidityProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeLiquidityProviderMethod = MsgGrpc.getRevokeLiquidityProviderMethod) == null) {
          MsgGrpc.getRevokeLiquidityProviderMethod = getRevokeLiquidityProviderMethod =
              io.grpc.MethodDescriptor.<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider, com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeLiquidityProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeLiquidityProvider"))
              .build();
        }
      }
    }
    return getRevokeLiquidityProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgSetInflation,
      com.em.issuer.v1.TxProto.MsgSetInflationResponse> getSetInflationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInflation",
      requestType = com.em.issuer.v1.TxProto.MsgSetInflation.class,
      responseType = com.em.issuer.v1.TxProto.MsgSetInflationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgSetInflation,
      com.em.issuer.v1.TxProto.MsgSetInflationResponse> getSetInflationMethod() {
    io.grpc.MethodDescriptor<com.em.issuer.v1.TxProto.MsgSetInflation, com.em.issuer.v1.TxProto.MsgSetInflationResponse> getSetInflationMethod;
    if ((getSetInflationMethod = MsgGrpc.getSetInflationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetInflationMethod = MsgGrpc.getSetInflationMethod) == null) {
          MsgGrpc.getSetInflationMethod = getSetInflationMethod =
              io.grpc.MethodDescriptor.<com.em.issuer.v1.TxProto.MsgSetInflation, com.em.issuer.v1.TxProto.MsgSetInflationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInflation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgSetInflation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.issuer.v1.TxProto.MsgSetInflationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetInflation"))
              .build();
        }
      }
    }
    return getSetInflationMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void increaseMintable(com.em.issuer.v1.TxProto.MsgIncreaseMintable request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncreaseMintableMethod(), responseObserver);
    }

    /**
     */
    default void decreaseMintable(com.em.issuer.v1.TxProto.MsgDecreaseMintable request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecreaseMintableMethod(), responseObserver);
    }

    /**
     */
    default void revokeLiquidityProvider(com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeLiquidityProviderMethod(), responseObserver);
    }

    /**
     */
    default void setInflation(com.em.issuer.v1.TxProto.MsgSetInflation request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgSetInflationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInflationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
     */
    public void increaseMintable(com.em.issuer.v1.TxProto.MsgIncreaseMintable request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncreaseMintableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseMintable(com.em.issuer.v1.TxProto.MsgDecreaseMintable request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecreaseMintableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeLiquidityProvider(com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeLiquidityProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setInflation(com.em.issuer.v1.TxProto.MsgSetInflation request,
        io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgSetInflationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInflationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
     */
    public com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse increaseMintable(com.em.issuer.v1.TxProto.MsgIncreaseMintable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncreaseMintableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse decreaseMintable(com.em.issuer.v1.TxProto.MsgDecreaseMintable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecreaseMintableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse revokeLiquidityProvider(com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeLiquidityProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.issuer.v1.TxProto.MsgSetInflationResponse setInflation(com.em.issuer.v1.TxProto.MsgSetInflation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInflationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse> increaseMintable(
        com.em.issuer.v1.TxProto.MsgIncreaseMintable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncreaseMintableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse> decreaseMintable(
        com.em.issuer.v1.TxProto.MsgDecreaseMintable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecreaseMintableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse> revokeLiquidityProvider(
        com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeLiquidityProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.issuer.v1.TxProto.MsgSetInflationResponse> setInflation(
        com.em.issuer.v1.TxProto.MsgSetInflation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInflationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCREASE_MINTABLE = 0;
  private static final int METHODID_DECREASE_MINTABLE = 1;
  private static final int METHODID_REVOKE_LIQUIDITY_PROVIDER = 2;
  private static final int METHODID_SET_INFLATION = 3;

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
        case METHODID_INCREASE_MINTABLE:
          serviceImpl.increaseMintable((com.em.issuer.v1.TxProto.MsgIncreaseMintable) request,
              (io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse>) responseObserver);
          break;
        case METHODID_DECREASE_MINTABLE:
          serviceImpl.decreaseMintable((com.em.issuer.v1.TxProto.MsgDecreaseMintable) request,
              (io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse>) responseObserver);
          break;
        case METHODID_REVOKE_LIQUIDITY_PROVIDER:
          serviceImpl.revokeLiquidityProvider((com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider) request,
              (io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse>) responseObserver);
          break;
        case METHODID_SET_INFLATION:
          serviceImpl.setInflation((com.em.issuer.v1.TxProto.MsgSetInflation) request,
              (io.grpc.stub.StreamObserver<com.em.issuer.v1.TxProto.MsgSetInflationResponse>) responseObserver);
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
          getIncreaseMintableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.issuer.v1.TxProto.MsgIncreaseMintable,
              com.em.issuer.v1.TxProto.MsgIncreaseMintableResponse>(
                service, METHODID_INCREASE_MINTABLE)))
        .addMethod(
          getDecreaseMintableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.issuer.v1.TxProto.MsgDecreaseMintable,
              com.em.issuer.v1.TxProto.MsgDecreaseMintableResponse>(
                service, METHODID_DECREASE_MINTABLE)))
        .addMethod(
          getRevokeLiquidityProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.issuer.v1.TxProto.MsgRevokeLiquidityProvider,
              com.em.issuer.v1.TxProto.MsgRevokeLiquidityProviderResponse>(
                service, METHODID_REVOKE_LIQUIDITY_PROVIDER)))
        .addMethod(
          getSetInflationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.issuer.v1.TxProto.MsgSetInflation,
              com.em.issuer.v1.TxProto.MsgSetInflationResponse>(
                service, METHODID_SET_INFLATION)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.issuer.v1.TxProto.getDescriptor();
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
              .addMethod(getIncreaseMintableMethod())
              .addMethod(getDecreaseMintableMethod())
              .addMethod(getRevokeLiquidityProviderMethod())
              .addMethod(getSetInflationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
