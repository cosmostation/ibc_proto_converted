package com.stafihub.stafihub.bridge;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/bridge/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.bridge.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetResourceidToDenom",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom, com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> getSetResourceidToDenomMethod;
    if ((getSetResourceidToDenomMethod = MsgGrpc.getSetResourceidToDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetResourceidToDenomMethod = MsgGrpc.getSetResourceidToDenomMethod) == null) {
          MsgGrpc.getSetResourceidToDenomMethod = getSetResourceidToDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom, com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetResourceidToDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetResourceidToDenom"))
              .build();
        }
      }
    }
    return getSetResourceidToDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgDeposit,
      com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgDeposit.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgDeposit,
      com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgDeposit, com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgDeposit, com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddChainId,
      com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> getAddChainIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddChainId",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgAddChainId.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddChainId,
      com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> getAddChainIdMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddChainId, com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> getAddChainIdMethod;
    if ((getAddChainIdMethod = MsgGrpc.getAddChainIdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddChainIdMethod = MsgGrpc.getAddChainIdMethod) == null) {
          MsgGrpc.getAddChainIdMethod = getAddChainIdMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgAddChainId, com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddChainId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgAddChainId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddChainId"))
              .build();
        }
      }
    }
    return getAddChainIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal,
      com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> getVoteProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteProposal",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal,
      com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> getVoteProposalMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal, com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> getVoteProposalMethod;
    if ((getVoteProposalMethod = MsgGrpc.getVoteProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteProposalMethod = MsgGrpc.getVoteProposalMethod) == null) {
          MsgGrpc.getVoteProposalMethod = getVoteProposalMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal, com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteProposal"))
              .build();
        }
      }
    }
    return getVoteProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmChainId,
      com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> getRmChainIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmChainId",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgRmChainId.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmChainId,
      com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> getRmChainIdMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmChainId, com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> getRmChainIdMethod;
    if ((getRmChainIdMethod = MsgGrpc.getRmChainIdMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmChainIdMethod = MsgGrpc.getRmChainIdMethod) == null) {
          MsgGrpc.getRmChainIdMethod = getRmChainIdMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgRmChainId, com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmChainId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgRmChainId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmChainId"))
              .build();
        }
      }
    }
    return getRmChainIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver,
      com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFeeReceiver",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver,
      com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver, com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> getSetRelayFeeReceiverMethod;
    if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeReceiverMethod = MsgGrpc.getSetRelayFeeReceiverMethod) == null) {
          MsgGrpc.getSetRelayFeeReceiverMethod = getSetRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver, com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFeeReceiver"))
              .build();
        }
      }
    }
    return getSetRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee,
      com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> getSetRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelayFee",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee,
      com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> getSetRelayFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee, com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> getSetRelayFeeMethod;
    if ((getSetRelayFeeMethod = MsgGrpc.getSetRelayFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRelayFeeMethod = MsgGrpc.getSetRelayFeeMethod) == null) {
          MsgGrpc.getSetRelayFeeMethod = getSetRelayFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee, com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRelayFee"))
              .build();
        }
      }
    }
    return getSetRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> getAddBannedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBannedDenom",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> getAddBannedDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom, com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> getAddBannedDenomMethod;
    if ((getAddBannedDenomMethod = MsgGrpc.getAddBannedDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddBannedDenomMethod = MsgGrpc.getAddBannedDenomMethod) == null) {
          MsgGrpc.getAddBannedDenomMethod = getAddBannedDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom, com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddBannedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddBannedDenom"))
              .build();
        }
      }
    }
    return getAddBannedDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> getRmBannedDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmBannedDenom",
      requestType = com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom.class,
      responseType = com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom,
      com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> getRmBannedDenomMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom, com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> getRmBannedDenomMethod;
    if ((getRmBannedDenomMethod = MsgGrpc.getRmBannedDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmBannedDenomMethod = MsgGrpc.getRmBannedDenomMethod) == null) {
          MsgGrpc.getRmBannedDenomMethod = getRmBannedDenomMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom, com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmBannedDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmBannedDenom"))
              .build();
        }
      }
    }
    return getRmBannedDenomMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void setResourceidToDenom(com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetResourceidToDenomMethod(), responseObserver);
    }

    /**
     */
    default void deposit(com.stafihub.stafihub.bridge.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    default void addChainId(com.stafihub.stafihub.bridge.TxProto.MsgAddChainId request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddChainIdMethod(), responseObserver);
    }

    /**
     */
    default void voteProposal(com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteProposalMethod(), responseObserver);
    }

    /**
     */
    default void rmChainId(com.stafihub.stafihub.bridge.TxProto.MsgRmChainId request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmChainIdMethod(), responseObserver);
    }

    /**
     */
    default void setRelayFeeReceiver(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     */
    default void setRelayFee(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelayFeeMethod(), responseObserver);
    }

    /**
     */
    default void addBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBannedDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void rmBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmBannedDenomMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     */
    public void setResourceidToDenom(com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetResourceidToDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposit(com.stafihub.stafihub.bridge.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addChainId(com.stafihub.stafihub.bridge.TxProto.MsgAddChainId request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddChainIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voteProposal(com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmChainId(com.stafihub.stafihub.bridge.TxProto.MsgRmChainId request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmChainIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFeeReceiver(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRelayFee(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBannedDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmBannedDenomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse setResourceidToDenom(com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetResourceidToDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse deposit(com.stafihub.stafihub.bridge.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse addChainId(com.stafihub.stafihub.bridge.TxProto.MsgAddChainId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddChainIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse voteProposal(com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse rmChainId(com.stafihub.stafihub.bridge.TxProto.MsgRmChainId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmChainIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse setRelayFeeReceiver(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse setRelayFee(com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse addBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBannedDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse rmBannedDenom(com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmBannedDenomMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse> setResourceidToDenom(
        com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetResourceidToDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse> deposit(
        com.stafihub.stafihub.bridge.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse> addChainId(
        com.stafihub.stafihub.bridge.TxProto.MsgAddChainId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddChainIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse> voteProposal(
        com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse> rmChainId(
        com.stafihub.stafihub.bridge.TxProto.MsgRmChainId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmChainIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse> setRelayFeeReceiver(
        com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse> setRelayFee(
        com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse> addBannedDenom(
        com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBannedDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse> rmBannedDenom(
        com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmBannedDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_RESOURCEID_TO_DENOM = 0;
  private static final int METHODID_DEPOSIT = 1;
  private static final int METHODID_ADD_CHAIN_ID = 2;
  private static final int METHODID_VOTE_PROPOSAL = 3;
  private static final int METHODID_RM_CHAIN_ID = 4;
  private static final int METHODID_SET_RELAY_FEE_RECEIVER = 5;
  private static final int METHODID_SET_RELAY_FEE = 6;
  private static final int METHODID_ADD_BANNED_DENOM = 7;
  private static final int METHODID_RM_BANNED_DENOM = 8;

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
        case METHODID_SET_RESOURCEID_TO_DENOM:
          serviceImpl.setResourceidToDenom((com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.stafihub.stafihub.bridge.TxProto.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_ADD_CHAIN_ID:
          serviceImpl.addChainId((com.stafihub.stafihub.bridge.TxProto.MsgAddChainId) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse>) responseObserver);
          break;
        case METHODID_VOTE_PROPOSAL:
          serviceImpl.voteProposal((com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse>) responseObserver);
          break;
        case METHODID_RM_CHAIN_ID:
          serviceImpl.rmChainId((com.stafihub.stafihub.bridge.TxProto.MsgRmChainId) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE_RECEIVER:
          serviceImpl.setRelayFeeReceiver((com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_SET_RELAY_FEE:
          serviceImpl.setRelayFee((com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse>) responseObserver);
          break;
        case METHODID_ADD_BANNED_DENOM:
          serviceImpl.addBannedDenom((com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse>) responseObserver);
          break;
        case METHODID_RM_BANNED_DENOM:
          serviceImpl.rmBannedDenom((com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse>) responseObserver);
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
          getSetResourceidToDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenom,
              com.stafihub.stafihub.bridge.TxProto.MsgSetResourceidToDenomResponse>(
                service, METHODID_SET_RESOURCEID_TO_DENOM)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgDeposit,
              com.stafihub.stafihub.bridge.TxProto.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getAddChainIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgAddChainId,
              com.stafihub.stafihub.bridge.TxProto.MsgAddChainIdResponse>(
                service, METHODID_ADD_CHAIN_ID)))
        .addMethod(
          getVoteProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgVoteProposal,
              com.stafihub.stafihub.bridge.TxProto.MsgVoteProposalResponse>(
                service, METHODID_VOTE_PROPOSAL)))
        .addMethod(
          getRmChainIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgRmChainId,
              com.stafihub.stafihub.bridge.TxProto.MsgRmChainIdResponse>(
                service, METHODID_RM_CHAIN_ID)))
        .addMethod(
          getSetRelayFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiver,
              com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeReceiverResponse>(
                service, METHODID_SET_RELAY_FEE_RECEIVER)))
        .addMethod(
          getSetRelayFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFee,
              com.stafihub.stafihub.bridge.TxProto.MsgSetRelayFeeResponse>(
                service, METHODID_SET_RELAY_FEE)))
        .addMethod(
          getAddBannedDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenom,
              com.stafihub.stafihub.bridge.TxProto.MsgAddBannedDenomResponse>(
                service, METHODID_ADD_BANNED_DENOM)))
        .addMethod(
          getRmBannedDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenom,
              com.stafihub.stafihub.bridge.TxProto.MsgRmBannedDenomResponse>(
                service, METHODID_RM_BANNED_DENOM)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.bridge.TxProto.getDescriptor();
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
              .addMethod(getSetResourceidToDenomMethod())
              .addMethod(getDepositMethod())
              .addMethod(getAddChainIdMethod())
              .addMethod(getVoteProposalMethod())
              .addMethod(getRmChainIdMethod())
              .addMethod(getSetRelayFeeReceiverMethod())
              .addMethod(getSetRelayFeeMethod())
              .addMethod(getAddBannedDenomMethod())
              .addMethod(getRmBannedDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
