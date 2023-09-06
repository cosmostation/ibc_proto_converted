package com.em.liquidityprovider.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: em/liquidityprovider/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "em.liquidityprovider.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgMintTokens,
      com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> getMintTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintTokens",
      requestType = com.em.liquidityprovider.v1.TxProto.MsgMintTokens.class,
      responseType = com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgMintTokens,
      com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> getMintTokensMethod() {
    io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgMintTokens, com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> getMintTokensMethod;
    if ((getMintTokensMethod = MsgGrpc.getMintTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintTokensMethod = MsgGrpc.getMintTokensMethod) == null) {
          MsgGrpc.getMintTokensMethod = getMintTokensMethod =
              io.grpc.MethodDescriptor.<com.em.liquidityprovider.v1.TxProto.MsgMintTokens, com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.liquidityprovider.v1.TxProto.MsgMintTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintTokens"))
              .build();
        }
      }
    }
    return getMintTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgBurnTokens,
      com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> getBurnTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnTokens",
      requestType = com.em.liquidityprovider.v1.TxProto.MsgBurnTokens.class,
      responseType = com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgBurnTokens,
      com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> getBurnTokensMethod() {
    io.grpc.MethodDescriptor<com.em.liquidityprovider.v1.TxProto.MsgBurnTokens, com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> getBurnTokensMethod;
    if ((getBurnTokensMethod = MsgGrpc.getBurnTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnTokensMethod = MsgGrpc.getBurnTokensMethod) == null) {
          MsgGrpc.getBurnTokensMethod = getBurnTokensMethod =
              io.grpc.MethodDescriptor.<com.em.liquidityprovider.v1.TxProto.MsgBurnTokens, com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.liquidityprovider.v1.TxProto.MsgBurnTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnTokens"))
              .build();
        }
      }
    }
    return getBurnTokensMethod;
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
    default void mintTokens(com.em.liquidityprovider.v1.TxProto.MsgMintTokens request,
        io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintTokensMethod(), responseObserver);
    }

    /**
     */
    default void burnTokens(com.em.liquidityprovider.v1.TxProto.MsgBurnTokens request,
        io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnTokensMethod(), responseObserver);
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
    public void mintTokens(com.em.liquidityprovider.v1.TxProto.MsgMintTokens request,
        io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burnTokens(com.em.liquidityprovider.v1.TxProto.MsgBurnTokens request,
        io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnTokensMethod(), getCallOptions()), request, responseObserver);
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
    public com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse mintTokens(com.em.liquidityprovider.v1.TxProto.MsgMintTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintTokensMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse burnTokens(com.em.liquidityprovider.v1.TxProto.MsgBurnTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnTokensMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse> mintTokens(
        com.em.liquidityprovider.v1.TxProto.MsgMintTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintTokensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse> burnTokens(
        com.em.liquidityprovider.v1.TxProto.MsgBurnTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MINT_TOKENS = 0;
  private static final int METHODID_BURN_TOKENS = 1;

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
        case METHODID_MINT_TOKENS:
          serviceImpl.mintTokens((com.em.liquidityprovider.v1.TxProto.MsgMintTokens) request,
              (io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse>) responseObserver);
          break;
        case METHODID_BURN_TOKENS:
          serviceImpl.burnTokens((com.em.liquidityprovider.v1.TxProto.MsgBurnTokens) request,
              (io.grpc.stub.StreamObserver<com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse>) responseObserver);
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
          getMintTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.liquidityprovider.v1.TxProto.MsgMintTokens,
              com.em.liquidityprovider.v1.TxProto.MsgMintTokensResponse>(
                service, METHODID_MINT_TOKENS)))
        .addMethod(
          getBurnTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.liquidityprovider.v1.TxProto.MsgBurnTokens,
              com.em.liquidityprovider.v1.TxProto.MsgBurnTokensResponse>(
                service, METHODID_BURN_TOKENS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.liquidityprovider.v1.TxProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getMintTokensMethod())
              .addMethod(getBurnTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
