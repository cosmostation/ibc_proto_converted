package com.shentu.bounty.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the staking Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/bounty/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "shentu.bounty.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCreateProgram,
      com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> getCreateProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProgram",
      requestType = com.shentu.bounty.v1.TxProto.MsgCreateProgram.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCreateProgram,
      com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> getCreateProgramMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCreateProgram, com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> getCreateProgramMethod;
    if ((getCreateProgramMethod = MsgGrpc.getCreateProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateProgramMethod = MsgGrpc.getCreateProgramMethod) == null) {
          MsgGrpc.getCreateProgramMethod = getCreateProgramMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgCreateProgram, com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCreateProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateProgram"))
              .build();
        }
      }
    }
    return getCreateProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditProgram,
      com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> getEditProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditProgram",
      requestType = com.shentu.bounty.v1.TxProto.MsgEditProgram.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgEditProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditProgram,
      com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> getEditProgramMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditProgram, com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> getEditProgramMethod;
    if ((getEditProgramMethod = MsgGrpc.getEditProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditProgramMethod = MsgGrpc.getEditProgramMethod) == null) {
          MsgGrpc.getEditProgramMethod = getEditProgramMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgEditProgram, com.shentu.bounty.v1.TxProto.MsgEditProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgEditProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgEditProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditProgram"))
              .build();
        }
      }
    }
    return getEditProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateProgram,
      com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> getActivateProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateProgram",
      requestType = com.shentu.bounty.v1.TxProto.MsgActivateProgram.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateProgram,
      com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> getActivateProgramMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateProgram, com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> getActivateProgramMethod;
    if ((getActivateProgramMethod = MsgGrpc.getActivateProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getActivateProgramMethod = MsgGrpc.getActivateProgramMethod) == null) {
          MsgGrpc.getActivateProgramMethod = getActivateProgramMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgActivateProgram, com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgActivateProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ActivateProgram"))
              .build();
        }
      }
    }
    return getActivateProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseProgram,
      com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> getCloseProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseProgram",
      requestType = com.shentu.bounty.v1.TxProto.MsgCloseProgram.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseProgram,
      com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> getCloseProgramMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseProgram, com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> getCloseProgramMethod;
    if ((getCloseProgramMethod = MsgGrpc.getCloseProgramMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseProgramMethod = MsgGrpc.getCloseProgramMethod) == null) {
          MsgGrpc.getCloseProgramMethod = getCloseProgramMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgCloseProgram, com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCloseProgram.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseProgram"))
              .build();
        }
      }
    }
    return getCloseProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgSubmitFinding,
      com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> getSubmitFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgSubmitFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgSubmitFinding,
      com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> getSubmitFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgSubmitFinding, com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> getSubmitFindingMethod;
    if ((getSubmitFindingMethod = MsgGrpc.getSubmitFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitFindingMethod = MsgGrpc.getSubmitFindingMethod) == null) {
          MsgGrpc.getSubmitFindingMethod = getSubmitFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgSubmitFinding, com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgSubmitFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitFinding"))
              .build();
        }
      }
    }
    return getSubmitFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditFinding,
      com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> getEditFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgEditFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgEditFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditFinding,
      com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> getEditFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgEditFinding, com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> getEditFindingMethod;
    if ((getEditFindingMethod = MsgGrpc.getEditFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditFindingMethod = MsgGrpc.getEditFindingMethod) == null) {
          MsgGrpc.getEditFindingMethod = getEditFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgEditFinding, com.shentu.bounty.v1.TxProto.MsgEditFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgEditFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgEditFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditFinding"))
              .build();
        }
      }
    }
    return getEditFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateFinding,
      com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> getActivateFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgActivateFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateFinding,
      com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> getActivateFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgActivateFinding, com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> getActivateFindingMethod;
    if ((getActivateFindingMethod = MsgGrpc.getActivateFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getActivateFindingMethod = MsgGrpc.getActivateFindingMethod) == null) {
          MsgGrpc.getActivateFindingMethod = getActivateFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgActivateFinding, com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgActivateFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ActivateFinding"))
              .build();
        }
      }
    }
    return getActivateFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFinding,
      com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> getConfirmFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgConfirmFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFinding,
      com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> getConfirmFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFinding, com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> getConfirmFindingMethod;
    if ((getConfirmFindingMethod = MsgGrpc.getConfirmFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfirmFindingMethod = MsgGrpc.getConfirmFindingMethod) == null) {
          MsgGrpc.getConfirmFindingMethod = getConfirmFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgConfirmFinding, com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgConfirmFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfirmFinding"))
              .build();
        }
      }
    }
    return getConfirmFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid,
      com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> getConfirmFindingPaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmFindingPaid",
      requestType = com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid,
      com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> getConfirmFindingPaidMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid, com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> getConfirmFindingPaidMethod;
    if ((getConfirmFindingPaidMethod = MsgGrpc.getConfirmFindingPaidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfirmFindingPaidMethod = MsgGrpc.getConfirmFindingPaidMethod) == null) {
          MsgGrpc.getConfirmFindingPaidMethod = getConfirmFindingPaidMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid, com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmFindingPaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfirmFindingPaid"))
              .build();
        }
      }
    }
    return getConfirmFindingPaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseFinding,
      com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> getCloseFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgCloseFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseFinding,
      com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> getCloseFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgCloseFinding, com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> getCloseFindingMethod;
    if ((getCloseFindingMethod = MsgGrpc.getCloseFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseFindingMethod = MsgGrpc.getCloseFindingMethod) == null) {
          MsgGrpc.getCloseFindingMethod = getCloseFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgCloseFinding, com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCloseFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseFinding"))
              .build();
        }
      }
    }
    return getCloseFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgPublishFinding,
      com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> getPublishFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishFinding",
      requestType = com.shentu.bounty.v1.TxProto.MsgPublishFinding.class,
      responseType = com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgPublishFinding,
      com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> getPublishFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.TxProto.MsgPublishFinding, com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> getPublishFindingMethod;
    if ((getPublishFindingMethod = MsgGrpc.getPublishFindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPublishFindingMethod = MsgGrpc.getPublishFindingMethod) == null) {
          MsgGrpc.getPublishFindingMethod = getPublishFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.TxProto.MsgPublishFinding, com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishFinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgPublishFinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PublishFinding"))
              .build();
        }
      }
    }
    return getPublishFindingMethod;
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
   * Msg defines the staking Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateProgram defines a method for creating a new program.
     * </pre>
     */
    default void createProgram(com.shentu.bounty.v1.TxProto.MsgCreateProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditProgram defines a method for modifying a program.
     * </pre>
     */
    default void editProgram(com.shentu.bounty.v1.TxProto.MsgEditProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate a program status by program_id
     * </pre>
     */
    default void activateProgram(com.shentu.bounty.v1.TxProto.MsgActivateProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closed a program status by program_id
     * </pre>
     */
    default void closeProgram(com.shentu.bounty.v1.TxProto.MsgCloseProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * SubmitFinding defines a method for submitting a new finding.
     * </pre>
     */
    default void submitFinding(com.shentu.bounty.v1.TxProto.MsgSubmitFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditFinding defines a method for editing a new finding.
     * </pre>
     */
    default void editFinding(com.shentu.bounty.v1.TxProto.MsgEditFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActivateFinding defines a method for activate a new finding.
     * </pre>
     */
    default void activateFinding(com.shentu.bounty.v1.TxProto.MsgActivateFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfirmFinding defines a method for host confirm a finding.
     * </pre>
     */
    default void confirmFinding(com.shentu.bounty.v1.TxProto.MsgConfirmFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfirmFindingPaid defines a method for submitter confirm a finding paid
     * </pre>
     */
    default void confirmFindingPaid(com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmFindingPaidMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseFinding defines a method for submitter or certifier close a finding
     * </pre>
     */
    default void closeFinding(com.shentu.bounty.v1.TxProto.MsgCloseFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * PublishFinding defines a method for publish a finding.
     * </pre>
     */
    default void publishFinding(com.shentu.bounty.v1.TxProto.MsgPublishFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishFindingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
   * Msg defines the staking Msg service.
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
     * CreateProgram defines a method for creating a new program.
     * </pre>
     */
    public void createProgram(com.shentu.bounty.v1.TxProto.MsgCreateProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditProgram defines a method for modifying a program.
     * </pre>
     */
    public void editProgram(com.shentu.bounty.v1.TxProto.MsgEditProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate a program status by program_id
     * </pre>
     */
    public void activateProgram(com.shentu.bounty.v1.TxProto.MsgActivateProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closed a program status by program_id
     * </pre>
     */
    public void closeProgram(com.shentu.bounty.v1.TxProto.MsgCloseProgram request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SubmitFinding defines a method for submitting a new finding.
     * </pre>
     */
    public void submitFinding(com.shentu.bounty.v1.TxProto.MsgSubmitFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditFinding defines a method for editing a new finding.
     * </pre>
     */
    public void editFinding(com.shentu.bounty.v1.TxProto.MsgEditFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActivateFinding defines a method for activate a new finding.
     * </pre>
     */
    public void activateFinding(com.shentu.bounty.v1.TxProto.MsgActivateFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfirmFinding defines a method for host confirm a finding.
     * </pre>
     */
    public void confirmFinding(com.shentu.bounty.v1.TxProto.MsgConfirmFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfirmFindingPaid defines a method for submitter confirm a finding paid
     * </pre>
     */
    public void confirmFindingPaid(com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmFindingPaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseFinding defines a method for submitter or certifier close a finding
     * </pre>
     */
    public void closeFinding(com.shentu.bounty.v1.TxProto.MsgCloseFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PublishFinding defines a method for publish a finding.
     * </pre>
     */
    public void publishFinding(com.shentu.bounty.v1.TxProto.MsgPublishFinding request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishFindingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateProgram defines a method for creating a new program.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse createProgram(com.shentu.bounty.v1.TxProto.MsgCreateProgram request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditProgram defines a method for modifying a program.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgEditProgramResponse editProgram(com.shentu.bounty.v1.TxProto.MsgEditProgram request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate a program status by program_id
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse activateProgram(com.shentu.bounty.v1.TxProto.MsgActivateProgram request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closed a program status by program_id
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse closeProgram(com.shentu.bounty.v1.TxProto.MsgCloseProgram request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SubmitFinding defines a method for submitting a new finding.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse submitFinding(com.shentu.bounty.v1.TxProto.MsgSubmitFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditFinding defines a method for editing a new finding.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgEditFindingResponse editFinding(com.shentu.bounty.v1.TxProto.MsgEditFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActivateFinding defines a method for activate a new finding.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse activateFinding(com.shentu.bounty.v1.TxProto.MsgActivateFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfirmFinding defines a method for host confirm a finding.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse confirmFinding(com.shentu.bounty.v1.TxProto.MsgConfirmFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfirmFindingPaid defines a method for submitter confirm a finding paid
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse confirmFindingPaid(com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmFindingPaidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseFinding defines a method for submitter or certifier close a finding
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse closeFinding(com.shentu.bounty.v1.TxProto.MsgCloseFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PublishFinding defines a method for publish a finding.
     * </pre>
     */
    public com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse publishFinding(com.shentu.bounty.v1.TxProto.MsgPublishFinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishFindingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the staking Msg service.
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
     * CreateProgram defines a method for creating a new program.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse> createProgram(
        com.shentu.bounty.v1.TxProto.MsgCreateProgram request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditProgram defines a method for modifying a program.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgEditProgramResponse> editProgram(
        com.shentu.bounty.v1.TxProto.MsgEditProgram request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate a program status by program_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse> activateProgram(
        com.shentu.bounty.v1.TxProto.MsgActivateProgram request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closed a program status by program_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse> closeProgram(
        com.shentu.bounty.v1.TxProto.MsgCloseProgram request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SubmitFinding defines a method for submitting a new finding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse> submitFinding(
        com.shentu.bounty.v1.TxProto.MsgSubmitFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditFinding defines a method for editing a new finding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgEditFindingResponse> editFinding(
        com.shentu.bounty.v1.TxProto.MsgEditFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActivateFinding defines a method for activate a new finding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse> activateFinding(
        com.shentu.bounty.v1.TxProto.MsgActivateFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfirmFinding defines a method for host confirm a finding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse> confirmFinding(
        com.shentu.bounty.v1.TxProto.MsgConfirmFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfirmFindingPaid defines a method for submitter confirm a finding paid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse> confirmFindingPaid(
        com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmFindingPaidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseFinding defines a method for submitter or certifier close a finding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse> closeFinding(
        com.shentu.bounty.v1.TxProto.MsgCloseFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PublishFinding defines a method for publish a finding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse> publishFinding(
        com.shentu.bounty.v1.TxProto.MsgPublishFinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishFindingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROGRAM = 0;
  private static final int METHODID_EDIT_PROGRAM = 1;
  private static final int METHODID_ACTIVATE_PROGRAM = 2;
  private static final int METHODID_CLOSE_PROGRAM = 3;
  private static final int METHODID_SUBMIT_FINDING = 4;
  private static final int METHODID_EDIT_FINDING = 5;
  private static final int METHODID_ACTIVATE_FINDING = 6;
  private static final int METHODID_CONFIRM_FINDING = 7;
  private static final int METHODID_CONFIRM_FINDING_PAID = 8;
  private static final int METHODID_CLOSE_FINDING = 9;
  private static final int METHODID_PUBLISH_FINDING = 10;

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
        case METHODID_CREATE_PROGRAM:
          serviceImpl.createProgram((com.shentu.bounty.v1.TxProto.MsgCreateProgram) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse>) responseObserver);
          break;
        case METHODID_EDIT_PROGRAM:
          serviceImpl.editProgram((com.shentu.bounty.v1.TxProto.MsgEditProgram) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditProgramResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_PROGRAM:
          serviceImpl.activateProgram((com.shentu.bounty.v1.TxProto.MsgActivateProgram) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse>) responseObserver);
          break;
        case METHODID_CLOSE_PROGRAM:
          serviceImpl.closeProgram((com.shentu.bounty.v1.TxProto.MsgCloseProgram) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_FINDING:
          serviceImpl.submitFinding((com.shentu.bounty.v1.TxProto.MsgSubmitFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse>) responseObserver);
          break;
        case METHODID_EDIT_FINDING:
          serviceImpl.editFinding((com.shentu.bounty.v1.TxProto.MsgEditFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgEditFindingResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_FINDING:
          serviceImpl.activateFinding((com.shentu.bounty.v1.TxProto.MsgActivateFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_FINDING:
          serviceImpl.confirmFinding((com.shentu.bounty.v1.TxProto.MsgConfirmFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_FINDING_PAID:
          serviceImpl.confirmFindingPaid((com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse>) responseObserver);
          break;
        case METHODID_CLOSE_FINDING:
          serviceImpl.closeFinding((com.shentu.bounty.v1.TxProto.MsgCloseFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_FINDING:
          serviceImpl.publishFinding((com.shentu.bounty.v1.TxProto.MsgPublishFinding) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse>) responseObserver);
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
          getCreateProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgCreateProgram,
              com.shentu.bounty.v1.TxProto.MsgCreateProgramResponse>(
                service, METHODID_CREATE_PROGRAM)))
        .addMethod(
          getEditProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgEditProgram,
              com.shentu.bounty.v1.TxProto.MsgEditProgramResponse>(
                service, METHODID_EDIT_PROGRAM)))
        .addMethod(
          getActivateProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgActivateProgram,
              com.shentu.bounty.v1.TxProto.MsgActivateProgramResponse>(
                service, METHODID_ACTIVATE_PROGRAM)))
        .addMethod(
          getCloseProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgCloseProgram,
              com.shentu.bounty.v1.TxProto.MsgCloseProgramResponse>(
                service, METHODID_CLOSE_PROGRAM)))
        .addMethod(
          getSubmitFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgSubmitFinding,
              com.shentu.bounty.v1.TxProto.MsgSubmitFindingResponse>(
                service, METHODID_SUBMIT_FINDING)))
        .addMethod(
          getEditFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgEditFinding,
              com.shentu.bounty.v1.TxProto.MsgEditFindingResponse>(
                service, METHODID_EDIT_FINDING)))
        .addMethod(
          getActivateFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgActivateFinding,
              com.shentu.bounty.v1.TxProto.MsgActivateFindingResponse>(
                service, METHODID_ACTIVATE_FINDING)))
        .addMethod(
          getConfirmFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgConfirmFinding,
              com.shentu.bounty.v1.TxProto.MsgConfirmFindingResponse>(
                service, METHODID_CONFIRM_FINDING)))
        .addMethod(
          getConfirmFindingPaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaid,
              com.shentu.bounty.v1.TxProto.MsgConfirmFindingPaidResponse>(
                service, METHODID_CONFIRM_FINDING_PAID)))
        .addMethod(
          getCloseFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgCloseFinding,
              com.shentu.bounty.v1.TxProto.MsgCloseFindingResponse>(
                service, METHODID_CLOSE_FINDING)))
        .addMethod(
          getPublishFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.TxProto.MsgPublishFinding,
              com.shentu.bounty.v1.TxProto.MsgPublishFindingResponse>(
                service, METHODID_PUBLISH_FINDING)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.bounty.v1.TxProto.getDescriptor();
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
              .addMethod(getCreateProgramMethod())
              .addMethod(getEditProgramMethod())
              .addMethod(getActivateProgramMethod())
              .addMethod(getCloseProgramMethod())
              .addMethod(getSubmitFindingMethod())
              .addMethod(getEditFindingMethod())
              .addMethod(getActivateFindingMethod())
              .addMethod(getConfirmFindingMethod())
              .addMethod(getConfirmFindingPaidMethod())
              .addMethod(getCloseFindingMethod())
              .addMethod(getPublishFindingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
