package com.osmosis.concentratedliquidity.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/concentratedliquidity/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.concentratedliquidity.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> getCreatePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePosition",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> getCreatePositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> getCreatePositionMethod;
    if ((getCreatePositionMethod = MsgGrpc.getCreatePositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePositionMethod = MsgGrpc.getCreatePositionMethod) == null) {
          MsgGrpc.getCreatePositionMethod = getCreatePositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePosition"))
              .build();
        }
      }
    }
    return getCreatePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> getWithdrawPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawPosition",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> getWithdrawPositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> getWithdrawPositionMethod;
    if ((getWithdrawPositionMethod = MsgGrpc.getWithdrawPositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawPositionMethod = MsgGrpc.getWithdrawPositionMethod) == null) {
          MsgGrpc.getWithdrawPositionMethod = getWithdrawPositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawPosition"))
              .build();
        }
      }
    }
    return getWithdrawPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> getAddToPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToPosition",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> getAddToPositionMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> getAddToPositionMethod;
    if ((getAddToPositionMethod = MsgGrpc.getAddToPositionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToPositionMethod = MsgGrpc.getAddToPositionMethod) == null) {
          MsgGrpc.getAddToPositionMethod = getAddToPositionMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToPosition"))
              .build();
        }
      }
    }
    return getAddToPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> getCollectSpreadRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectSpreadRewards",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> getCollectSpreadRewardsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> getCollectSpreadRewardsMethod;
    if ((getCollectSpreadRewardsMethod = MsgGrpc.getCollectSpreadRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCollectSpreadRewardsMethod = MsgGrpc.getCollectSpreadRewardsMethod) == null) {
          MsgGrpc.getCollectSpreadRewardsMethod = getCollectSpreadRewardsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CollectSpreadRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CollectSpreadRewards"))
              .build();
        }
      }
    }
    return getCollectSpreadRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> getCollectIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectIncentives",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> getCollectIncentivesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> getCollectIncentivesMethod;
    if ((getCollectIncentivesMethod = MsgGrpc.getCollectIncentivesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCollectIncentivesMethod = MsgGrpc.getCollectIncentivesMethod) == null) {
          MsgGrpc.getCollectIncentivesMethod = getCollectIncentivesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CollectIncentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CollectIncentives"))
              .build();
        }
      }
    }
    return getCollectIncentivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> getTransferPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferPositions",
      requestType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions.class,
      responseType = com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions,
      com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> getTransferPositionsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> getTransferPositionsMethod;
    if ((getTransferPositionsMethod = MsgGrpc.getTransferPositionsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferPositionsMethod = MsgGrpc.getTransferPositionsMethod) == null) {
          MsgGrpc.getTransferPositionsMethod = getTransferPositionsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions, com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferPositions"))
              .build();
        }
      }
    }
    return getTransferPositionsMethod;
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
    default void createPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePositionMethod(), responseObserver);
    }

    /**
     */
    default void withdrawPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToPosition attempts to add amount0 and amount1 to a position
     * with the given position id.
     * To maintain backwards-compatibility with future implementations of
     * charging, this function deletes the old position and creates a new one with
     * the resulting amount after addition.
     * </pre>
     */
    default void addToPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToPositionMethod(), responseObserver);
    }

    /**
     */
    default void collectSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectSpreadRewardsMethod(), responseObserver);
    }

    /**
     */
    default void collectIncentives(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectIncentivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferPositions transfers ownership of a set of one or more positions
     * from a sender to a recipient.
     * </pre>
     */
    default void transferPositions(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferPositionsMethod(), responseObserver);
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
    public void createPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToPosition attempts to add amount0 and amount1 to a position
     * with the given position id.
     * To maintain backwards-compatibility with future implementations of
     * charging, this function deletes the old position and creates a new one with
     * the resulting amount after addition.
     * </pre>
     */
    public void addToPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void collectSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectSpreadRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void collectIncentives(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectIncentivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferPositions transfers ownership of a set of one or more positions
     * from a sender to a recipient.
     * </pre>
     */
    public void transferPositions(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions request,
        io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferPositionsMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse createPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse withdrawPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToPosition attempts to add amount0 and amount1 to a position
     * with the given position id.
     * To maintain backwards-compatibility with future implementations of
     * charging, this function deletes the old position and creates a new one with
     * the resulting amount after addition.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse addToPosition(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToPositionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse collectSpreadRewards(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectSpreadRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse collectIncentives(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectIncentivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferPositions transfers ownership of a set of one or more positions
     * from a sender to a recipient.
     * </pre>
     */
    public com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse transferPositions(com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferPositionsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse> createPosition(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse> withdrawPosition(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToPosition attempts to add amount0 and amount1 to a position
     * with the given position id.
     * To maintain backwards-compatibility with future implementations of
     * charging, this function deletes the old position and creates a new one with
     * the resulting amount after addition.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse> addToPosition(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToPositionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse> collectSpreadRewards(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectSpreadRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse> collectIncentives(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectIncentivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferPositions transfers ownership of a set of one or more positions
     * from a sender to a recipient.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse> transferPositions(
        com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferPositionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POSITION = 0;
  private static final int METHODID_WITHDRAW_POSITION = 1;
  private static final int METHODID_ADD_TO_POSITION = 2;
  private static final int METHODID_COLLECT_SPREAD_REWARDS = 3;
  private static final int METHODID_COLLECT_INCENTIVES = 4;
  private static final int METHODID_TRANSFER_POSITIONS = 5;

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
        case METHODID_CREATE_POSITION:
          serviceImpl.createPosition((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_POSITION:
          serviceImpl.withdrawPosition((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_POSITION:
          serviceImpl.addToPosition((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse>) responseObserver);
          break;
        case METHODID_COLLECT_SPREAD_REWARDS:
          serviceImpl.collectSpreadRewards((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse>) responseObserver);
          break;
        case METHODID_COLLECT_INCENTIVES:
          serviceImpl.collectIncentives((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_POSITIONS:
          serviceImpl.transferPositions((com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions) request,
              (io.grpc.stub.StreamObserver<com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse>) responseObserver);
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
          getCreatePositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePosition,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCreatePositionResponse>(
                service, METHODID_CREATE_POSITION)))
        .addMethod(
          getWithdrawPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPosition,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgWithdrawPositionResponse>(
                service, METHODID_WITHDRAW_POSITION)))
        .addMethod(
          getAddToPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPosition,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgAddToPositionResponse>(
                service, METHODID_ADD_TO_POSITION)))
        .addMethod(
          getCollectSpreadRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewards,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectSpreadRewardsResponse>(
                service, METHODID_COLLECT_SPREAD_REWARDS)))
        .addMethod(
          getCollectIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentives,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgCollectIncentivesResponse>(
                service, METHODID_COLLECT_INCENTIVES)))
        .addMethod(
          getTransferPositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositions,
              com.osmosis.concentratedliquidity.v1beta1.TxProto.MsgTransferPositionsResponse>(
                service, METHODID_TRANSFER_POSITIONS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.concentratedliquidity.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreatePositionMethod())
              .addMethod(getWithdrawPositionMethod())
              .addMethod(getAddToPositionMethod())
              .addMethod(getCollectSpreadRewardsMethod())
              .addMethod(getCollectIncentivesMethod())
              .addMethod(getTransferPositionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
