package com.lum.network.millions;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: lum-network/millions/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "lum.network.millions.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDeposit,
      com.lum.network.millions.TxProto.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.lum.network.millions.TxProto.MsgDeposit.class,
      responseType = com.lum.network.millions.TxProto.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDeposit,
      com.lum.network.millions.TxProto.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDeposit, com.lum.network.millions.TxProto.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgDeposit, com.lum.network.millions.TxProto.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDepositRetry,
      com.lum.network.millions.TxProto.MsgDepositRetryResponse> getDepositRetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositRetry",
      requestType = com.lum.network.millions.TxProto.MsgDepositRetry.class,
      responseType = com.lum.network.millions.TxProto.MsgDepositRetryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDepositRetry,
      com.lum.network.millions.TxProto.MsgDepositRetryResponse> getDepositRetryMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDepositRetry, com.lum.network.millions.TxProto.MsgDepositRetryResponse> getDepositRetryMethod;
    if ((getDepositRetryMethod = MsgGrpc.getDepositRetryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositRetryMethod = MsgGrpc.getDepositRetryMethod) == null) {
          MsgGrpc.getDepositRetryMethod = getDepositRetryMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgDepositRetry, com.lum.network.millions.TxProto.MsgDepositRetryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositRetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDepositRetry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDepositRetryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositRetry"))
              .build();
        }
      }
    }
    return getDepositRetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgClaimPrize,
      com.lum.network.millions.TxProto.MsgClaimPrizeResponse> getClaimPrizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimPrize",
      requestType = com.lum.network.millions.TxProto.MsgClaimPrize.class,
      responseType = com.lum.network.millions.TxProto.MsgClaimPrizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgClaimPrize,
      com.lum.network.millions.TxProto.MsgClaimPrizeResponse> getClaimPrizeMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgClaimPrize, com.lum.network.millions.TxProto.MsgClaimPrizeResponse> getClaimPrizeMethod;
    if ((getClaimPrizeMethod = MsgGrpc.getClaimPrizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimPrizeMethod = MsgGrpc.getClaimPrizeMethod) == null) {
          MsgGrpc.getClaimPrizeMethod = getClaimPrizeMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgClaimPrize, com.lum.network.millions.TxProto.MsgClaimPrizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimPrize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgClaimPrize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgClaimPrizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimPrize"))
              .build();
        }
      }
    }
    return getClaimPrizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDeposit,
      com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> getWithdrawDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawDeposit",
      requestType = com.lum.network.millions.TxProto.MsgWithdrawDeposit.class,
      responseType = com.lum.network.millions.TxProto.MsgWithdrawDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDeposit,
      com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> getWithdrawDepositMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDeposit, com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> getWithdrawDepositMethod;
    if ((getWithdrawDepositMethod = MsgGrpc.getWithdrawDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawDepositMethod = MsgGrpc.getWithdrawDepositMethod) == null) {
          MsgGrpc.getWithdrawDepositMethod = getWithdrawDepositMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgWithdrawDeposit, com.lum.network.millions.TxProto.MsgWithdrawDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgWithdrawDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgWithdrawDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawDeposit"))
              .build();
        }
      }
    }
    return getWithdrawDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDepositRetry,
      com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> getWithdrawDepositRetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawDepositRetry",
      requestType = com.lum.network.millions.TxProto.MsgWithdrawDepositRetry.class,
      responseType = com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDepositRetry,
      com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> getWithdrawDepositRetryMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgWithdrawDepositRetry, com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> getWithdrawDepositRetryMethod;
    if ((getWithdrawDepositRetryMethod = MsgGrpc.getWithdrawDepositRetryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawDepositRetryMethod = MsgGrpc.getWithdrawDepositRetryMethod) == null) {
          MsgGrpc.getWithdrawDepositRetryMethod = getWithdrawDepositRetryMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgWithdrawDepositRetry, com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawDepositRetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgWithdrawDepositRetry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawDepositRetry"))
              .build();
        }
      }
    }
    return getWithdrawDepositRetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDrawRetry,
      com.lum.network.millions.TxProto.MsgDrawRetryResponse> getDrawRetryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DrawRetry",
      requestType = com.lum.network.millions.TxProto.MsgDrawRetry.class,
      responseType = com.lum.network.millions.TxProto.MsgDrawRetryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDrawRetry,
      com.lum.network.millions.TxProto.MsgDrawRetryResponse> getDrawRetryMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgDrawRetry, com.lum.network.millions.TxProto.MsgDrawRetryResponse> getDrawRetryMethod;
    if ((getDrawRetryMethod = MsgGrpc.getDrawRetryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDrawRetryMethod = MsgGrpc.getDrawRetryMethod) == null) {
          MsgGrpc.getDrawRetryMethod = getDrawRetryMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgDrawRetry, com.lum.network.millions.TxProto.MsgDrawRetryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DrawRetry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDrawRetry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgDrawRetryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DrawRetry"))
              .build();
        }
      }
    }
    return getDrawRetryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts,
      com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> getRestoreInterchainAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreInterchainAccounts",
      requestType = com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts.class,
      responseType = com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts,
      com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> getRestoreInterchainAccountsMethod() {
    io.grpc.MethodDescriptor<com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts, com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> getRestoreInterchainAccountsMethod;
    if ((getRestoreInterchainAccountsMethod = MsgGrpc.getRestoreInterchainAccountsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRestoreInterchainAccountsMethod = MsgGrpc.getRestoreInterchainAccountsMethod) == null) {
          MsgGrpc.getRestoreInterchainAccountsMethod = getRestoreInterchainAccountsMethod =
              io.grpc.MethodDescriptor.<com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts, com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreInterchainAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RestoreInterchainAccounts"))
              .build();
        }
      }
    }
    return getRestoreInterchainAccountsMethod;
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
    default void deposit(com.lum.network.millions.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    default void depositRetry(com.lum.network.millions.TxProto.MsgDepositRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositRetryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositRetryMethod(), responseObserver);
    }

    /**
     */
    default void claimPrize(com.lum.network.millions.TxProto.MsgClaimPrize request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgClaimPrizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimPrizeMethod(), responseObserver);
    }

    /**
     */
    default void withdrawDeposit(com.lum.network.millions.TxProto.MsgWithdrawDeposit request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawDepositMethod(), responseObserver);
    }

    /**
     */
    default void withdrawDepositRetry(com.lum.network.millions.TxProto.MsgWithdrawDepositRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawDepositRetryMethod(), responseObserver);
    }

    /**
     */
    default void drawRetry(com.lum.network.millions.TxProto.MsgDrawRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDrawRetryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDrawRetryMethod(), responseObserver);
    }

    /**
     */
    default void restoreInterchainAccounts(com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreInterchainAccountsMethod(), responseObserver);
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
    public void deposit(com.lum.network.millions.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void depositRetry(com.lum.network.millions.TxProto.MsgDepositRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositRetryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositRetryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimPrize(com.lum.network.millions.TxProto.MsgClaimPrize request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgClaimPrizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimPrizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawDeposit(com.lum.network.millions.TxProto.MsgWithdrawDeposit request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawDepositRetry(com.lum.network.millions.TxProto.MsgWithdrawDepositRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawDepositRetryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drawRetry(com.lum.network.millions.TxProto.MsgDrawRetry request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDrawRetryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDrawRetryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restoreInterchainAccounts(com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts request,
        io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountsMethod(), getCallOptions()), request, responseObserver);
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
    public com.lum.network.millions.TxProto.MsgDepositResponse deposit(com.lum.network.millions.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgDepositRetryResponse depositRetry(com.lum.network.millions.TxProto.MsgDepositRetry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositRetryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgClaimPrizeResponse claimPrize(com.lum.network.millions.TxProto.MsgClaimPrize request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimPrizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgWithdrawDepositResponse withdrawDeposit(com.lum.network.millions.TxProto.MsgWithdrawDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse withdrawDepositRetry(com.lum.network.millions.TxProto.MsgWithdrawDepositRetry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawDepositRetryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgDrawRetryResponse drawRetry(com.lum.network.millions.TxProto.MsgDrawRetry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDrawRetryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse restoreInterchainAccounts(com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreInterchainAccountsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgDepositResponse> deposit(
        com.lum.network.millions.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgDepositRetryResponse> depositRetry(
        com.lum.network.millions.TxProto.MsgDepositRetry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositRetryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgClaimPrizeResponse> claimPrize(
        com.lum.network.millions.TxProto.MsgClaimPrize request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimPrizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgWithdrawDepositResponse> withdrawDeposit(
        com.lum.network.millions.TxProto.MsgWithdrawDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse> withdrawDepositRetry(
        com.lum.network.millions.TxProto.MsgWithdrawDepositRetry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawDepositRetryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgDrawRetryResponse> drawRetry(
        com.lum.network.millions.TxProto.MsgDrawRetry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDrawRetryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse> restoreInterchainAccounts(
        com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreInterchainAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_DEPOSIT_RETRY = 1;
  private static final int METHODID_CLAIM_PRIZE = 2;
  private static final int METHODID_WITHDRAW_DEPOSIT = 3;
  private static final int METHODID_WITHDRAW_DEPOSIT_RETRY = 4;
  private static final int METHODID_DRAW_RETRY = 5;
  private static final int METHODID_RESTORE_INTERCHAIN_ACCOUNTS = 6;

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
          serviceImpl.deposit((com.lum.network.millions.TxProto.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_RETRY:
          serviceImpl.depositRetry((com.lum.network.millions.TxProto.MsgDepositRetry) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDepositRetryResponse>) responseObserver);
          break;
        case METHODID_CLAIM_PRIZE:
          serviceImpl.claimPrize((com.lum.network.millions.TxProto.MsgClaimPrize) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgClaimPrizeResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_DEPOSIT:
          serviceImpl.withdrawDeposit((com.lum.network.millions.TxProto.MsgWithdrawDeposit) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_DEPOSIT_RETRY:
          serviceImpl.withdrawDepositRetry((com.lum.network.millions.TxProto.MsgWithdrawDepositRetry) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse>) responseObserver);
          break;
        case METHODID_DRAW_RETRY:
          serviceImpl.drawRetry((com.lum.network.millions.TxProto.MsgDrawRetry) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgDrawRetryResponse>) responseObserver);
          break;
        case METHODID_RESTORE_INTERCHAIN_ACCOUNTS:
          serviceImpl.restoreInterchainAccounts((com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts) request,
              (io.grpc.stub.StreamObserver<com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse>) responseObserver);
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
              com.lum.network.millions.TxProto.MsgDeposit,
              com.lum.network.millions.TxProto.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getDepositRetryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgDepositRetry,
              com.lum.network.millions.TxProto.MsgDepositRetryResponse>(
                service, METHODID_DEPOSIT_RETRY)))
        .addMethod(
          getClaimPrizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgClaimPrize,
              com.lum.network.millions.TxProto.MsgClaimPrizeResponse>(
                service, METHODID_CLAIM_PRIZE)))
        .addMethod(
          getWithdrawDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgWithdrawDeposit,
              com.lum.network.millions.TxProto.MsgWithdrawDepositResponse>(
                service, METHODID_WITHDRAW_DEPOSIT)))
        .addMethod(
          getWithdrawDepositRetryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgWithdrawDepositRetry,
              com.lum.network.millions.TxProto.MsgWithdrawDepositRetryResponse>(
                service, METHODID_WITHDRAW_DEPOSIT_RETRY)))
        .addMethod(
          getDrawRetryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgDrawRetry,
              com.lum.network.millions.TxProto.MsgDrawRetryResponse>(
                service, METHODID_DRAW_RETRY)))
        .addMethod(
          getRestoreInterchainAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lum.network.millions.TxProto.MsgRestoreInterchainAccounts,
              com.lum.network.millions.TxProto.MsgRestoreInterchainAccountsResponse>(
                service, METHODID_RESTORE_INTERCHAIN_ACCOUNTS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lum.network.millions.TxProto.getDescriptor();
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
              .addMethod(getDepositMethod())
              .addMethod(getDepositRetryMethod())
              .addMethod(getClaimPrizeMethod())
              .addMethod(getWithdrawDepositMethod())
              .addMethod(getWithdrawDepositRetryMethod())
              .addMethod(getDrawRetryMethod())
              .addMethod(getRestoreInterchainAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
