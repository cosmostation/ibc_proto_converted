package com.kava.swap.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the swap Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kava/swap/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "kava.swap.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgDeposit,
      com.kava.swap.v1beta1.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.kava.swap.v1beta1.MsgDeposit.class,
      responseType = com.kava.swap.v1beta1.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgDeposit,
      com.kava.swap.v1beta1.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgDeposit, com.kava.swap.v1beta1.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.kava.swap.v1beta1.MsgDeposit, com.kava.swap.v1beta1.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgWithdraw,
      com.kava.swap.v1beta1.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.kava.swap.v1beta1.MsgWithdraw.class,
      responseType = com.kava.swap.v1beta1.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgWithdraw,
      com.kava.swap.v1beta1.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgWithdraw, com.kava.swap.v1beta1.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.kava.swap.v1beta1.MsgWithdraw, com.kava.swap.v1beta1.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapExactForTokens,
      com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> getSwapExactForTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapExactForTokens",
      requestType = com.kava.swap.v1beta1.MsgSwapExactForTokens.class,
      responseType = com.kava.swap.v1beta1.MsgSwapExactForTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapExactForTokens,
      com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> getSwapExactForTokensMethod() {
    io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapExactForTokens, com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> getSwapExactForTokensMethod;
    if ((getSwapExactForTokensMethod = MsgGrpc.getSwapExactForTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapExactForTokensMethod = MsgGrpc.getSwapExactForTokensMethod) == null) {
          MsgGrpc.getSwapExactForTokensMethod = getSwapExactForTokensMethod =
              io.grpc.MethodDescriptor.<com.kava.swap.v1beta1.MsgSwapExactForTokens, com.kava.swap.v1beta1.MsgSwapExactForTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapExactForTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgSwapExactForTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgSwapExactForTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapExactForTokens"))
              .build();
        }
      }
    }
    return getSwapExactForTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapForExactTokens,
      com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> getSwapForExactTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapForExactTokens",
      requestType = com.kava.swap.v1beta1.MsgSwapForExactTokens.class,
      responseType = com.kava.swap.v1beta1.MsgSwapForExactTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapForExactTokens,
      com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> getSwapForExactTokensMethod() {
    io.grpc.MethodDescriptor<com.kava.swap.v1beta1.MsgSwapForExactTokens, com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> getSwapForExactTokensMethod;
    if ((getSwapForExactTokensMethod = MsgGrpc.getSwapForExactTokensMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapForExactTokensMethod = MsgGrpc.getSwapForExactTokensMethod) == null) {
          MsgGrpc.getSwapForExactTokensMethod = getSwapForExactTokensMethod =
              io.grpc.MethodDescriptor.<com.kava.swap.v1beta1.MsgSwapForExactTokens, com.kava.swap.v1beta1.MsgSwapForExactTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapForExactTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgSwapForExactTokens.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.swap.v1beta1.MsgSwapForExactTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapForExactTokens"))
              .build();
        }
      }
    }
    return getSwapForExactTokensMethod;
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
   * Msg defines the swap Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deposit defines a method for depositing liquidity into a pool
     * </pre>
     */
    default void deposit(com.kava.swap.v1beta1.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing liquidity into a pool
     * </pre>
     */
    default void withdraw(com.kava.swap.v1beta1.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapExactForTokens represents a message for trading exact coinA for coinB
     * </pre>
     */
    default void swapExactForTokens(com.kava.swap.v1beta1.MsgSwapExactForTokens request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapExactForTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * SwapForExactTokens represents a message for trading coinA for an exact coinB
     * </pre>
     */
    default void swapForExactTokens(com.kava.swap.v1beta1.MsgSwapForExactTokens request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapForExactTokensMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the swap Msg service.
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
   * Msg defines the swap Msg service.
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
     * Deposit defines a method for depositing liquidity into a pool
     * </pre>
     */
    public void deposit(com.kava.swap.v1beta1.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing liquidity into a pool
     * </pre>
     */
    public void withdraw(com.kava.swap.v1beta1.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapExactForTokens represents a message for trading exact coinA for coinB
     * </pre>
     */
    public void swapExactForTokens(com.kava.swap.v1beta1.MsgSwapExactForTokens request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapExactForTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SwapForExactTokens represents a message for trading coinA for an exact coinB
     * </pre>
     */
    public void swapForExactTokens(com.kava.swap.v1beta1.MsgSwapForExactTokens request,
        io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapForExactTokensMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the swap Msg service.
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
     * Deposit defines a method for depositing liquidity into a pool
     * </pre>
     */
    public com.kava.swap.v1beta1.MsgDepositResponse deposit(com.kava.swap.v1beta1.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing liquidity into a pool
     * </pre>
     */
    public com.kava.swap.v1beta1.MsgWithdrawResponse withdraw(com.kava.swap.v1beta1.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapExactForTokens represents a message for trading exact coinA for coinB
     * </pre>
     */
    public com.kava.swap.v1beta1.MsgSwapExactForTokensResponse swapExactForTokens(com.kava.swap.v1beta1.MsgSwapExactForTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapExactForTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SwapForExactTokens represents a message for trading coinA for an exact coinB
     * </pre>
     */
    public com.kava.swap.v1beta1.MsgSwapForExactTokensResponse swapForExactTokens(com.kava.swap.v1beta1.MsgSwapForExactTokens request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapForExactTokensMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the swap Msg service.
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
     * Deposit defines a method for depositing liquidity into a pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.swap.v1beta1.MsgDepositResponse> deposit(
        com.kava.swap.v1beta1.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw defines a method for withdrawing liquidity into a pool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.swap.v1beta1.MsgWithdrawResponse> withdraw(
        com.kava.swap.v1beta1.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapExactForTokens represents a message for trading exact coinA for coinB
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.swap.v1beta1.MsgSwapExactForTokensResponse> swapExactForTokens(
        com.kava.swap.v1beta1.MsgSwapExactForTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapExactForTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SwapForExactTokens represents a message for trading coinA for an exact coinB
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.swap.v1beta1.MsgSwapForExactTokensResponse> swapForExactTokens(
        com.kava.swap.v1beta1.MsgSwapForExactTokens request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapForExactTokensMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_SWAP_EXACT_FOR_TOKENS = 2;
  private static final int METHODID_SWAP_FOR_EXACT_TOKENS = 3;

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
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.kava.swap.v1beta1.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.kava.swap.v1beta1.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_SWAP_EXACT_FOR_TOKENS:
          serviceImpl.swapExactForTokens((com.kava.swap.v1beta1.MsgSwapExactForTokens) request,
              (io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapExactForTokensResponse>) responseObserver);
          break;
        case METHODID_SWAP_FOR_EXACT_TOKENS:
          serviceImpl.swapForExactTokens((com.kava.swap.v1beta1.MsgSwapForExactTokens) request,
              (io.grpc.stub.StreamObserver<com.kava.swap.v1beta1.MsgSwapForExactTokensResponse>) responseObserver);
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
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.swap.v1beta1.MsgDeposit,
              com.kava.swap.v1beta1.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.swap.v1beta1.MsgWithdraw,
              com.kava.swap.v1beta1.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getSwapExactForTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.swap.v1beta1.MsgSwapExactForTokens,
              com.kava.swap.v1beta1.MsgSwapExactForTokensResponse>(
                service, METHODID_SWAP_EXACT_FOR_TOKENS)))
        .addMethod(
          getSwapForExactTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.swap.v1beta1.MsgSwapForExactTokens,
              com.kava.swap.v1beta1.MsgSwapForExactTokensResponse>(
                service, METHODID_SWAP_FOR_EXACT_TOKENS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kava.swap.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getSwapExactForTokensMethod())
              .addMethod(getSwapForExactTokensMethod())
              .build();
        }
      }
    }
    return result;
  }
}
