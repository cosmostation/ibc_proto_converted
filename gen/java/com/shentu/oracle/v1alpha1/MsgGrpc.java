package com.shentu.oracle.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the shield Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/oracle/v1alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "shentu.oracle.v1alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateOperator,
      com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> getCreateOperatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOperator",
      requestType = com.shentu.oracle.v1alpha1.MsgCreateOperator.class,
      responseType = com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateOperator,
      com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> getCreateOperatorMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateOperator, com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> getCreateOperatorMethod;
    if ((getCreateOperatorMethod = MsgGrpc.getCreateOperatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateOperatorMethod = MsgGrpc.getCreateOperatorMethod) == null) {
          MsgGrpc.getCreateOperatorMethod = getCreateOperatorMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgCreateOperator, com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOperator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateOperator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateOperator"))
              .build();
        }
      }
    }
    return getCreateOperatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgRemoveOperator,
      com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> getRemoveOperatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveOperator",
      requestType = com.shentu.oracle.v1alpha1.MsgRemoveOperator.class,
      responseType = com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgRemoveOperator,
      com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> getRemoveOperatorMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgRemoveOperator, com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> getRemoveOperatorMethod;
    if ((getRemoveOperatorMethod = MsgGrpc.getRemoveOperatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveOperatorMethod = MsgGrpc.getRemoveOperatorMethod) == null) {
          MsgGrpc.getRemoveOperatorMethod = getRemoveOperatorMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgRemoveOperator, com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveOperator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgRemoveOperator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveOperator"))
              .build();
        }
      }
    }
    return getRemoveOperatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgAddCollateral,
      com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> getAddCollateralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCollateral",
      requestType = com.shentu.oracle.v1alpha1.MsgAddCollateral.class,
      responseType = com.shentu.oracle.v1alpha1.MsgAddCollateralResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgAddCollateral,
      com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> getAddCollateralMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgAddCollateral, com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> getAddCollateralMethod;
    if ((getAddCollateralMethod = MsgGrpc.getAddCollateralMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddCollateralMethod = MsgGrpc.getAddCollateralMethod) == null) {
          MsgGrpc.getAddCollateralMethod = getAddCollateralMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgAddCollateral, com.shentu.oracle.v1alpha1.MsgAddCollateralResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddCollateral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgAddCollateral.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgAddCollateralResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddCollateral"))
              .build();
        }
      }
    }
    return getAddCollateralMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgReduceCollateral,
      com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> getReduceCollateralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReduceCollateral",
      requestType = com.shentu.oracle.v1alpha1.MsgReduceCollateral.class,
      responseType = com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgReduceCollateral,
      com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> getReduceCollateralMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgReduceCollateral, com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> getReduceCollateralMethod;
    if ((getReduceCollateralMethod = MsgGrpc.getReduceCollateralMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReduceCollateralMethod = MsgGrpc.getReduceCollateralMethod) == null) {
          MsgGrpc.getReduceCollateralMethod = getReduceCollateralMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgReduceCollateral, com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReduceCollateral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgReduceCollateral.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReduceCollateral"))
              .build();
        }
      }
    }
    return getReduceCollateralMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgWithdrawReward,
      com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> getWithdrawRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawReward",
      requestType = com.shentu.oracle.v1alpha1.MsgWithdrawReward.class,
      responseType = com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgWithdrawReward,
      com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> getWithdrawRewardMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgWithdrawReward, com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> getWithdrawRewardMethod;
    if ((getWithdrawRewardMethod = MsgGrpc.getWithdrawRewardMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawRewardMethod = MsgGrpc.getWithdrawRewardMethod) == null) {
          MsgGrpc.getWithdrawRewardMethod = getWithdrawRewardMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgWithdrawReward, com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgWithdrawReward.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawReward"))
              .build();
        }
      }
    }
    return getWithdrawRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTask,
      com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> getCreateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTask",
      requestType = com.shentu.oracle.v1alpha1.MsgCreateTask.class,
      responseType = com.shentu.oracle.v1alpha1.MsgCreateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTask,
      com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> getCreateTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTask, com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> getCreateTaskMethod;
    if ((getCreateTaskMethod = MsgGrpc.getCreateTaskMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTaskMethod = MsgGrpc.getCreateTaskMethod) == null) {
          MsgGrpc.getCreateTaskMethod = getCreateTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgCreateTask, com.shentu.oracle.v1alpha1.MsgCreateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTask"))
              .build();
        }
      }
    }
    return getCreateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTaskResponse,
      com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> getTaskResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TaskResponse",
      requestType = com.shentu.oracle.v1alpha1.MsgTaskResponse.class,
      responseType = com.shentu.oracle.v1alpha1.MsgTaskResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTaskResponse,
      com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> getTaskResponseMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTaskResponse, com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> getTaskResponseMethod;
    if ((getTaskResponseMethod = MsgGrpc.getTaskResponseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTaskResponseMethod = MsgGrpc.getTaskResponseMethod) == null) {
          MsgGrpc.getTaskResponseMethod = getTaskResponseMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgTaskResponse, com.shentu.oracle.v1alpha1.MsgTaskResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TaskResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgTaskResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgTaskResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TaskResponse"))
              .build();
        }
      }
    }
    return getTaskResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTask,
      com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> getDeleteTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTask",
      requestType = com.shentu.oracle.v1alpha1.MsgDeleteTask.class,
      responseType = com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTask,
      com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> getDeleteTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTask, com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> getDeleteTaskMethod;
    if ((getDeleteTaskMethod = MsgGrpc.getDeleteTaskMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteTaskMethod = MsgGrpc.getDeleteTaskMethod) == null) {
          MsgGrpc.getDeleteTaskMethod = getDeleteTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgDeleteTask, com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgDeleteTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteTask"))
              .build();
        }
      }
    }
    return getDeleteTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTxTask,
      com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> getCreateTxTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTxTask",
      requestType = com.shentu.oracle.v1alpha1.MsgCreateTxTask.class,
      responseType = com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTxTask,
      com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> getCreateTxTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgCreateTxTask, com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> getCreateTxTaskMethod;
    if ((getCreateTxTaskMethod = MsgGrpc.getCreateTxTaskMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTxTaskMethod = MsgGrpc.getCreateTxTaskMethod) == null) {
          MsgGrpc.getCreateTxTaskMethod = getCreateTxTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgCreateTxTask, com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTxTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateTxTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTxTask"))
              .build();
        }
      }
    }
    return getCreateTxTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTxTaskResponse,
      com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> getTxTaskResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TxTaskResponse",
      requestType = com.shentu.oracle.v1alpha1.MsgTxTaskResponse.class,
      responseType = com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTxTaskResponse,
      com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> getTxTaskResponseMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgTxTaskResponse, com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> getTxTaskResponseMethod;
    if ((getTxTaskResponseMethod = MsgGrpc.getTxTaskResponseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTxTaskResponseMethod = MsgGrpc.getTxTaskResponseMethod) == null) {
          MsgGrpc.getTxTaskResponseMethod = getTxTaskResponseMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgTxTaskResponse, com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TxTaskResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgTxTaskResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TxTaskResponse"))
              .build();
        }
      }
    }
    return getTxTaskResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTxTask,
      com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> getDeleteTxTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTxTask",
      requestType = com.shentu.oracle.v1alpha1.MsgDeleteTxTask.class,
      responseType = com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTxTask,
      com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> getDeleteTxTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.MsgDeleteTxTask, com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> getDeleteTxTaskMethod;
    if ((getDeleteTxTaskMethod = MsgGrpc.getDeleteTxTaskMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteTxTaskMethod = MsgGrpc.getDeleteTxTaskMethod) == null) {
          MsgGrpc.getDeleteTxTaskMethod = getDeleteTxTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.MsgDeleteTxTask, com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTxTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgDeleteTxTask.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteTxTask"))
              .build();
        }
      }
    }
    return getDeleteTxTaskMethod;
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
   * Msg defines the shield Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void createOperator(com.shentu.oracle.v1alpha1.MsgCreateOperator request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOperatorMethod(), responseObserver);
    }

    /**
     */
    default void removeOperator(com.shentu.oracle.v1alpha1.MsgRemoveOperator request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveOperatorMethod(), responseObserver);
    }

    /**
     */
    default void addCollateral(com.shentu.oracle.v1alpha1.MsgAddCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCollateralMethod(), responseObserver);
    }

    /**
     */
    default void reduceCollateral(com.shentu.oracle.v1alpha1.MsgReduceCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReduceCollateralMethod(), responseObserver);
    }

    /**
     */
    default void withdrawReward(com.shentu.oracle.v1alpha1.MsgWithdrawReward request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawRewardMethod(), responseObserver);
    }

    /**
     */
    default void createTask(com.shentu.oracle.v1alpha1.MsgCreateTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTaskMethod(), responseObserver);
    }

    /**
     */
    default void taskResponse(com.shentu.oracle.v1alpha1.MsgTaskResponse request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTaskResponseMethod(), responseObserver);
    }

    /**
     */
    default void deleteTask(com.shentu.oracle.v1alpha1.MsgDeleteTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTaskMethod(), responseObserver);
    }

    /**
     */
    default void createTxTask(com.shentu.oracle.v1alpha1.MsgCreateTxTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTxTaskMethod(), responseObserver);
    }

    /**
     */
    default void txTaskResponse(com.shentu.oracle.v1alpha1.MsgTxTaskResponse request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTxTaskResponseMethod(), responseObserver);
    }

    /**
     */
    default void deleteTxTask(com.shentu.oracle.v1alpha1.MsgDeleteTxTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTxTaskMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
   * Msg defines the shield Msg service.
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
    public void createOperator(com.shentu.oracle.v1alpha1.MsgCreateOperator request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOperatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeOperator(com.shentu.oracle.v1alpha1.MsgRemoveOperator request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveOperatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCollateral(com.shentu.oracle.v1alpha1.MsgAddCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCollateralMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reduceCollateral(com.shentu.oracle.v1alpha1.MsgReduceCollateral request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReduceCollateralMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawReward(com.shentu.oracle.v1alpha1.MsgWithdrawReward request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTask(com.shentu.oracle.v1alpha1.MsgCreateTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void taskResponse(com.shentu.oracle.v1alpha1.MsgTaskResponse request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTaskResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTask(com.shentu.oracle.v1alpha1.MsgDeleteTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTxTask(com.shentu.oracle.v1alpha1.MsgCreateTxTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTxTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void txTaskResponse(com.shentu.oracle.v1alpha1.MsgTxTaskResponse request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTxTaskResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTxTask(com.shentu.oracle.v1alpha1.MsgDeleteTxTask request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTxTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse createOperator(com.shentu.oracle.v1alpha1.MsgCreateOperator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOperatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse removeOperator(com.shentu.oracle.v1alpha1.MsgRemoveOperator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveOperatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgAddCollateralResponse addCollateral(com.shentu.oracle.v1alpha1.MsgAddCollateral request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCollateralMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse reduceCollateral(com.shentu.oracle.v1alpha1.MsgReduceCollateral request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReduceCollateralMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse withdrawReward(com.shentu.oracle.v1alpha1.MsgWithdrawReward request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawRewardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgCreateTaskResponse createTask(com.shentu.oracle.v1alpha1.MsgCreateTask request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgTaskResponseResponse taskResponse(com.shentu.oracle.v1alpha1.MsgTaskResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTaskResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse deleteTask(com.shentu.oracle.v1alpha1.MsgDeleteTask request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse createTxTask(com.shentu.oracle.v1alpha1.MsgCreateTxTask request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTxTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse txTaskResponse(com.shentu.oracle.v1alpha1.MsgTxTaskResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTxTaskResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse deleteTxTask(com.shentu.oracle.v1alpha1.MsgDeleteTxTask request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTxTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse> createOperator(
        com.shentu.oracle.v1alpha1.MsgCreateOperator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOperatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse> removeOperator(
        com.shentu.oracle.v1alpha1.MsgRemoveOperator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveOperatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgAddCollateralResponse> addCollateral(
        com.shentu.oracle.v1alpha1.MsgAddCollateral request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCollateralMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse> reduceCollateral(
        com.shentu.oracle.v1alpha1.MsgReduceCollateral request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReduceCollateralMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse> withdrawReward(
        com.shentu.oracle.v1alpha1.MsgWithdrawReward request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawRewardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgCreateTaskResponse> createTask(
        com.shentu.oracle.v1alpha1.MsgCreateTask request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgTaskResponseResponse> taskResponse(
        com.shentu.oracle.v1alpha1.MsgTaskResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTaskResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse> deleteTask(
        com.shentu.oracle.v1alpha1.MsgDeleteTask request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse> createTxTask(
        com.shentu.oracle.v1alpha1.MsgCreateTxTask request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTxTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse> txTaskResponse(
        com.shentu.oracle.v1alpha1.MsgTxTaskResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTxTaskResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse> deleteTxTask(
        com.shentu.oracle.v1alpha1.MsgDeleteTxTask request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTxTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OPERATOR = 0;
  private static final int METHODID_REMOVE_OPERATOR = 1;
  private static final int METHODID_ADD_COLLATERAL = 2;
  private static final int METHODID_REDUCE_COLLATERAL = 3;
  private static final int METHODID_WITHDRAW_REWARD = 4;
  private static final int METHODID_CREATE_TASK = 5;
  private static final int METHODID_TASK_RESPONSE = 6;
  private static final int METHODID_DELETE_TASK = 7;
  private static final int METHODID_CREATE_TX_TASK = 8;
  private static final int METHODID_TX_TASK_RESPONSE = 9;
  private static final int METHODID_DELETE_TX_TASK = 10;

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
        case METHODID_CREATE_OPERATOR:
          serviceImpl.createOperator((com.shentu.oracle.v1alpha1.MsgCreateOperator) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse>) responseObserver);
          break;
        case METHODID_REMOVE_OPERATOR:
          serviceImpl.removeOperator((com.shentu.oracle.v1alpha1.MsgRemoveOperator) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse>) responseObserver);
          break;
        case METHODID_ADD_COLLATERAL:
          serviceImpl.addCollateral((com.shentu.oracle.v1alpha1.MsgAddCollateral) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgAddCollateralResponse>) responseObserver);
          break;
        case METHODID_REDUCE_COLLATERAL:
          serviceImpl.reduceCollateral((com.shentu.oracle.v1alpha1.MsgReduceCollateral) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_REWARD:
          serviceImpl.withdrawReward((com.shentu.oracle.v1alpha1.MsgWithdrawReward) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse>) responseObserver);
          break;
        case METHODID_CREATE_TASK:
          serviceImpl.createTask((com.shentu.oracle.v1alpha1.MsgCreateTask) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTaskResponse>) responseObserver);
          break;
        case METHODID_TASK_RESPONSE:
          serviceImpl.taskResponse((com.shentu.oracle.v1alpha1.MsgTaskResponse) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTaskResponseResponse>) responseObserver);
          break;
        case METHODID_DELETE_TASK:
          serviceImpl.deleteTask((com.shentu.oracle.v1alpha1.MsgDeleteTask) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse>) responseObserver);
          break;
        case METHODID_CREATE_TX_TASK:
          serviceImpl.createTxTask((com.shentu.oracle.v1alpha1.MsgCreateTxTask) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse>) responseObserver);
          break;
        case METHODID_TX_TASK_RESPONSE:
          serviceImpl.txTaskResponse((com.shentu.oracle.v1alpha1.MsgTxTaskResponse) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse>) responseObserver);
          break;
        case METHODID_DELETE_TX_TASK:
          serviceImpl.deleteTxTask((com.shentu.oracle.v1alpha1.MsgDeleteTxTask) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse>) responseObserver);
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
          getCreateOperatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgCreateOperator,
              com.shentu.oracle.v1alpha1.MsgCreateOperatorResponse>(
                service, METHODID_CREATE_OPERATOR)))
        .addMethod(
          getRemoveOperatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgRemoveOperator,
              com.shentu.oracle.v1alpha1.MsgRemoveOperatorResponse>(
                service, METHODID_REMOVE_OPERATOR)))
        .addMethod(
          getAddCollateralMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgAddCollateral,
              com.shentu.oracle.v1alpha1.MsgAddCollateralResponse>(
                service, METHODID_ADD_COLLATERAL)))
        .addMethod(
          getReduceCollateralMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgReduceCollateral,
              com.shentu.oracle.v1alpha1.MsgReduceCollateralResponse>(
                service, METHODID_REDUCE_COLLATERAL)))
        .addMethod(
          getWithdrawRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgWithdrawReward,
              com.shentu.oracle.v1alpha1.MsgWithdrawRewardResponse>(
                service, METHODID_WITHDRAW_REWARD)))
        .addMethod(
          getCreateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgCreateTask,
              com.shentu.oracle.v1alpha1.MsgCreateTaskResponse>(
                service, METHODID_CREATE_TASK)))
        .addMethod(
          getTaskResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgTaskResponse,
              com.shentu.oracle.v1alpha1.MsgTaskResponseResponse>(
                service, METHODID_TASK_RESPONSE)))
        .addMethod(
          getDeleteTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgDeleteTask,
              com.shentu.oracle.v1alpha1.MsgDeleteTaskResponse>(
                service, METHODID_DELETE_TASK)))
        .addMethod(
          getCreateTxTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgCreateTxTask,
              com.shentu.oracle.v1alpha1.MsgCreateTxTaskResponse>(
                service, METHODID_CREATE_TX_TASK)))
        .addMethod(
          getTxTaskResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgTxTaskResponse,
              com.shentu.oracle.v1alpha1.MsgTxTaskResponseResponse>(
                service, METHODID_TX_TASK_RESPONSE)))
        .addMethod(
          getDeleteTxTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.MsgDeleteTxTask,
              com.shentu.oracle.v1alpha1.MsgDeleteTxTaskResponse>(
                service, METHODID_DELETE_TX_TASK)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.oracle.v1alpha1.TxProto.getDescriptor();
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
              .addMethod(getCreateOperatorMethod())
              .addMethod(getRemoveOperatorMethod())
              .addMethod(getAddCollateralMethod())
              .addMethod(getReduceCollateralMethod())
              .addMethod(getWithdrawRewardMethod())
              .addMethod(getCreateTaskMethod())
              .addMethod(getTaskResponseMethod())
              .addMethod(getDeleteTaskMethod())
              .addMethod(getCreateTxTaskMethod())
              .addMethod(getTxTaskResponseMethod())
              .addMethod(getDeleteTxTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
