package com.canto.erc20.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the erc20 Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: canto/erc20/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "canto.erc20.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertCoin,
      com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> getConvertCoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertCoin",
      requestType = com.canto.erc20.v1.TxProto.MsgConvertCoin.class,
      responseType = com.canto.erc20.v1.TxProto.MsgConvertCoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertCoin,
      com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> getConvertCoinMethod() {
    io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertCoin, com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> getConvertCoinMethod;
    if ((getConvertCoinMethod = MsgGrpc.getConvertCoinMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConvertCoinMethod = MsgGrpc.getConvertCoinMethod) == null) {
          MsgGrpc.getConvertCoinMethod = getConvertCoinMethod =
              io.grpc.MethodDescriptor.<com.canto.erc20.v1.TxProto.MsgConvertCoin, com.canto.erc20.v1.TxProto.MsgConvertCoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertCoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.erc20.v1.TxProto.MsgConvertCoin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.erc20.v1.TxProto.MsgConvertCoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConvertCoin"))
              .build();
        }
      }
    }
    return getConvertCoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertERC20,
      com.canto.erc20.v1.TxProto.MsgConvertERC20Response> getConvertERC20Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertERC20",
      requestType = com.canto.erc20.v1.TxProto.MsgConvertERC20.class,
      responseType = com.canto.erc20.v1.TxProto.MsgConvertERC20Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertERC20,
      com.canto.erc20.v1.TxProto.MsgConvertERC20Response> getConvertERC20Method() {
    io.grpc.MethodDescriptor<com.canto.erc20.v1.TxProto.MsgConvertERC20, com.canto.erc20.v1.TxProto.MsgConvertERC20Response> getConvertERC20Method;
    if ((getConvertERC20Method = MsgGrpc.getConvertERC20Method) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConvertERC20Method = MsgGrpc.getConvertERC20Method) == null) {
          MsgGrpc.getConvertERC20Method = getConvertERC20Method =
              io.grpc.MethodDescriptor.<com.canto.erc20.v1.TxProto.MsgConvertERC20, com.canto.erc20.v1.TxProto.MsgConvertERC20Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertERC20"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.erc20.v1.TxProto.MsgConvertERC20.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.erc20.v1.TxProto.MsgConvertERC20Response.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConvertERC20"))
              .build();
        }
      }
    }
    return getConvertERC20Method;
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
   * Msg defines the erc20 Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
     * that is registered on the token mapping.
     * </pre>
     */
    default void convertCoin(com.canto.erc20.v1.TxProto.MsgConvertCoin request,
        io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertCoinMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
     * contract that is registered on the token mapping.
     * </pre>
     */
    default void convertERC20(com.canto.erc20.v1.TxProto.MsgConvertERC20 request,
        io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertERC20Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertERC20Method(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the erc20 Msg service.
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
   * Msg defines the erc20 Msg service.
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
     * ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
     * that is registered on the token mapping.
     * </pre>
     */
    public void convertCoin(com.canto.erc20.v1.TxProto.MsgConvertCoin request,
        io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertCoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
     * contract that is registered on the token mapping.
     * </pre>
     */
    public void convertERC20(com.canto.erc20.v1.TxProto.MsgConvertERC20 request,
        io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertERC20Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertERC20Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the erc20 Msg service.
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
     * ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
     * that is registered on the token mapping.
     * </pre>
     */
    public com.canto.erc20.v1.TxProto.MsgConvertCoinResponse convertCoin(com.canto.erc20.v1.TxProto.MsgConvertCoin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertCoinMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
     * contract that is registered on the token mapping.
     * </pre>
     */
    public com.canto.erc20.v1.TxProto.MsgConvertERC20Response convertERC20(com.canto.erc20.v1.TxProto.MsgConvertERC20 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertERC20Method(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the erc20 Msg service.
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
     * ConvertCoin mints a ERC20 representation of the native Cosmos coin denom
     * that is registered on the token mapping.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.erc20.v1.TxProto.MsgConvertCoinResponse> convertCoin(
        com.canto.erc20.v1.TxProto.MsgConvertCoin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertCoinMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConvertERC20 mints a native Cosmos coin representation of the ERC20 token
     * contract that is registered on the token mapping.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.erc20.v1.TxProto.MsgConvertERC20Response> convertERC20(
        com.canto.erc20.v1.TxProto.MsgConvertERC20 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertERC20Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT_COIN = 0;
  private static final int METHODID_CONVERT_ERC20 = 1;

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
        case METHODID_CONVERT_COIN:
          serviceImpl.convertCoin((com.canto.erc20.v1.TxProto.MsgConvertCoin) request,
              (io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertCoinResponse>) responseObserver);
          break;
        case METHODID_CONVERT_ERC20:
          serviceImpl.convertERC20((com.canto.erc20.v1.TxProto.MsgConvertERC20) request,
              (io.grpc.stub.StreamObserver<com.canto.erc20.v1.TxProto.MsgConvertERC20Response>) responseObserver);
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
          getConvertCoinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.erc20.v1.TxProto.MsgConvertCoin,
              com.canto.erc20.v1.TxProto.MsgConvertCoinResponse>(
                service, METHODID_CONVERT_COIN)))
        .addMethod(
          getConvertERC20Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.erc20.v1.TxProto.MsgConvertERC20,
              com.canto.erc20.v1.TxProto.MsgConvertERC20Response>(
                service, METHODID_CONVERT_ERC20)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.erc20.v1.TxProto.getDescriptor();
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
              .addMethod(getConvertCoinMethod())
              .addMethod(getConvertERC20Method())
              .build();
        }
      }
    }
    return result;
  }
}
