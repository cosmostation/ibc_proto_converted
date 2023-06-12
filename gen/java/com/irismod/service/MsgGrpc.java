package com.irismod.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/service/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.service.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgDefineService,
      com.irismod.service.MsgDefineServiceResponse> getDefineServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefineService",
      requestType = com.irismod.service.MsgDefineService.class,
      responseType = com.irismod.service.MsgDefineServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgDefineService,
      com.irismod.service.MsgDefineServiceResponse> getDefineServiceMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgDefineService, com.irismod.service.MsgDefineServiceResponse> getDefineServiceMethod;
    if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
          MsgGrpc.getDefineServiceMethod = getDefineServiceMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgDefineService, com.irismod.service.MsgDefineServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefineService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgDefineService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgDefineServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DefineService"))
              .build();
        }
      }
    }
    return getDefineServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgBindService,
      com.irismod.service.MsgBindServiceResponse> getBindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindService",
      requestType = com.irismod.service.MsgBindService.class,
      responseType = com.irismod.service.MsgBindServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgBindService,
      com.irismod.service.MsgBindServiceResponse> getBindServiceMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgBindService, com.irismod.service.MsgBindServiceResponse> getBindServiceMethod;
    if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
          MsgGrpc.getBindServiceMethod = getBindServiceMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgBindService, com.irismod.service.MsgBindServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgBindService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgBindServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindService"))
              .build();
        }
      }
    }
    return getBindServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateServiceBinding,
      com.irismod.service.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceBinding",
      requestType = com.irismod.service.MsgUpdateServiceBinding.class,
      responseType = com.irismod.service.MsgUpdateServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateServiceBinding,
      com.irismod.service.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateServiceBinding, com.irismod.service.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;
    if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
          MsgGrpc.getUpdateServiceBindingMethod = getUpdateServiceBindingMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgUpdateServiceBinding, com.irismod.service.MsgUpdateServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgUpdateServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgUpdateServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateServiceBinding"))
              .build();
        }
      }
    }
    return getUpdateServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgSetWithdrawAddress,
      com.irismod.service.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawAddress",
      requestType = com.irismod.service.MsgSetWithdrawAddress.class,
      responseType = com.irismod.service.MsgSetWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgSetWithdrawAddress,
      com.irismod.service.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgSetWithdrawAddress, com.irismod.service.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;
    if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
          MsgGrpc.getSetWithdrawAddressMethod = getSetWithdrawAddressMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgSetWithdrawAddress, com.irismod.service.MsgSetWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgSetWithdrawAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgSetWithdrawAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawAddress"))
              .build();
        }
      }
    }
    return getSetWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgEnableServiceBinding,
      com.irismod.service.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableServiceBinding",
      requestType = com.irismod.service.MsgEnableServiceBinding.class,
      responseType = com.irismod.service.MsgEnableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgEnableServiceBinding,
      com.irismod.service.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgEnableServiceBinding, com.irismod.service.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;
    if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
          MsgGrpc.getEnableServiceBindingMethod = getEnableServiceBindingMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgEnableServiceBinding, com.irismod.service.MsgEnableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgEnableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgEnableServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnableServiceBinding"))
              .build();
        }
      }
    }
    return getEnableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgDisableServiceBinding,
      com.irismod.service.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableServiceBinding",
      requestType = com.irismod.service.MsgDisableServiceBinding.class,
      responseType = com.irismod.service.MsgDisableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgDisableServiceBinding,
      com.irismod.service.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgDisableServiceBinding, com.irismod.service.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;
    if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
          MsgGrpc.getDisableServiceBindingMethod = getDisableServiceBindingMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgDisableServiceBinding, com.irismod.service.MsgDisableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgDisableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgDisableServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisableServiceBinding"))
              .build();
        }
      }
    }
    return getDisableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgRefundServiceDeposit,
      com.irismod.service.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundServiceDeposit",
      requestType = com.irismod.service.MsgRefundServiceDeposit.class,
      responseType = com.irismod.service.MsgRefundServiceDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgRefundServiceDeposit,
      com.irismod.service.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgRefundServiceDeposit, com.irismod.service.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;
    if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
          MsgGrpc.getRefundServiceDepositMethod = getRefundServiceDepositMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgRefundServiceDeposit, com.irismod.service.MsgRefundServiceDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundServiceDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgRefundServiceDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgRefundServiceDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RefundServiceDeposit"))
              .build();
        }
      }
    }
    return getRefundServiceDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgCallService,
      com.irismod.service.MsgCallServiceResponse> getCallServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallService",
      requestType = com.irismod.service.MsgCallService.class,
      responseType = com.irismod.service.MsgCallServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgCallService,
      com.irismod.service.MsgCallServiceResponse> getCallServiceMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgCallService, com.irismod.service.MsgCallServiceResponse> getCallServiceMethod;
    if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
          MsgGrpc.getCallServiceMethod = getCallServiceMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgCallService, com.irismod.service.MsgCallServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgCallService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgCallServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CallService"))
              .build();
        }
      }
    }
    return getCallServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgRespondService,
      com.irismod.service.MsgRespondServiceResponse> getRespondServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondService",
      requestType = com.irismod.service.MsgRespondService.class,
      responseType = com.irismod.service.MsgRespondServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgRespondService,
      com.irismod.service.MsgRespondServiceResponse> getRespondServiceMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgRespondService, com.irismod.service.MsgRespondServiceResponse> getRespondServiceMethod;
    if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
          MsgGrpc.getRespondServiceMethod = getRespondServiceMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgRespondService, com.irismod.service.MsgRespondServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgRespondService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgRespondServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RespondService"))
              .build();
        }
      }
    }
    return getRespondServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgPauseRequestContext,
      com.irismod.service.MsgPauseRequestContextResponse> getPauseRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseRequestContext",
      requestType = com.irismod.service.MsgPauseRequestContext.class,
      responseType = com.irismod.service.MsgPauseRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgPauseRequestContext,
      com.irismod.service.MsgPauseRequestContextResponse> getPauseRequestContextMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgPauseRequestContext, com.irismod.service.MsgPauseRequestContextResponse> getPauseRequestContextMethod;
    if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
          MsgGrpc.getPauseRequestContextMethod = getPauseRequestContextMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgPauseRequestContext, com.irismod.service.MsgPauseRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgPauseRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgPauseRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseRequestContext"))
              .build();
        }
      }
    }
    return getPauseRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgStartRequestContext,
      com.irismod.service.MsgStartRequestContextResponse> getStartRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRequestContext",
      requestType = com.irismod.service.MsgStartRequestContext.class,
      responseType = com.irismod.service.MsgStartRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgStartRequestContext,
      com.irismod.service.MsgStartRequestContextResponse> getStartRequestContextMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgStartRequestContext, com.irismod.service.MsgStartRequestContextResponse> getStartRequestContextMethod;
    if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
          MsgGrpc.getStartRequestContextMethod = getStartRequestContextMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgStartRequestContext, com.irismod.service.MsgStartRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgStartRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgStartRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StartRequestContext"))
              .build();
        }
      }
    }
    return getStartRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgKillRequestContext,
      com.irismod.service.MsgKillRequestContextResponse> getKillRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KillRequestContext",
      requestType = com.irismod.service.MsgKillRequestContext.class,
      responseType = com.irismod.service.MsgKillRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgKillRequestContext,
      com.irismod.service.MsgKillRequestContextResponse> getKillRequestContextMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgKillRequestContext, com.irismod.service.MsgKillRequestContextResponse> getKillRequestContextMethod;
    if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
          MsgGrpc.getKillRequestContextMethod = getKillRequestContextMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgKillRequestContext, com.irismod.service.MsgKillRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KillRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgKillRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgKillRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("KillRequestContext"))
              .build();
        }
      }
    }
    return getKillRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateRequestContext,
      com.irismod.service.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRequestContext",
      requestType = com.irismod.service.MsgUpdateRequestContext.class,
      responseType = com.irismod.service.MsgUpdateRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateRequestContext,
      com.irismod.service.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgUpdateRequestContext, com.irismod.service.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;
    if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
          MsgGrpc.getUpdateRequestContextMethod = getUpdateRequestContextMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgUpdateRequestContext, com.irismod.service.MsgUpdateRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgUpdateRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgUpdateRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRequestContext"))
              .build();
        }
      }
    }
    return getUpdateRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.MsgWithdrawEarnedFees,
      com.irismod.service.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawEarnedFees",
      requestType = com.irismod.service.MsgWithdrawEarnedFees.class,
      responseType = com.irismod.service.MsgWithdrawEarnedFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.MsgWithdrawEarnedFees,
      com.irismod.service.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.MsgWithdrawEarnedFees, com.irismod.service.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;
    if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
          MsgGrpc.getWithdrawEarnedFeesMethod = getWithdrawEarnedFeesMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.MsgWithdrawEarnedFees, com.irismod.service.MsgWithdrawEarnedFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawEarnedFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgWithdrawEarnedFees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.MsgWithdrawEarnedFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawEarnedFees"))
              .build();
        }
      }
    }
    return getWithdrawEarnedFeesMethod;
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
   * Msg defines the oracle Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * DefineService defines a method for define a new service
     * </pre>
     */
    default void defineService(com.irismod.service.MsgDefineService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgDefineServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefineServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server
     * </pre>
     */
    default void bindService(com.irismod.service.MsgBindService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgBindServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding
     * </pre>
     */
    default void updateServiceBinding(com.irismod.service.MsgUpdateServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address
     * </pre>
     */
    default void setWithdrawAddress(com.irismod.service.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgSetWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding
     * </pre>
     */
    default void enableServiceBinding(com.irismod.service.MsgEnableServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgEnableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding
     * </pre>
     */
    default void disableServiceBinding(com.irismod.service.MsgDisableServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgDisableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee
     * </pre>
     */
    default void refundServiceDeposit(com.irismod.service.MsgRefundServiceDeposit request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgRefundServiceDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundServiceDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service
     * </pre>
     */
    default void callService(com.irismod.service.MsgCallService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgCallServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service
     * </pre>
     */
    default void respondService(com.irismod.service.MsgRespondService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgRespondServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call
     * </pre>
     */
    default void pauseRequestContext(com.irismod.service.MsgPauseRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgPauseRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call
     * </pre>
     */
    default void startRequestContext(com.irismod.service.MsgStartRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgStartRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call
     * </pre>
     */
    default void killRequestContext(com.irismod.service.MsgKillRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgKillRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKillRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call
     * </pre>
     */
    default void updateRequestContext(com.irismod.service.MsgUpdateRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees
     * </pre>
     */
    default void withdrawEarnedFees(com.irismod.service.MsgWithdrawEarnedFees request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgWithdrawEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawEarnedFeesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
   * Msg defines the oracle Msg service
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
     * DefineService defines a method for define a new service
     * </pre>
     */
    public void defineService(com.irismod.service.MsgDefineService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgDefineServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server
     * </pre>
     */
    public void bindService(com.irismod.service.MsgBindService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgBindServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding
     * </pre>
     */
    public void updateServiceBinding(com.irismod.service.MsgUpdateServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address
     * </pre>
     */
    public void setWithdrawAddress(com.irismod.service.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgSetWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding
     * </pre>
     */
    public void enableServiceBinding(com.irismod.service.MsgEnableServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgEnableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding
     * </pre>
     */
    public void disableServiceBinding(com.irismod.service.MsgDisableServiceBinding request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgDisableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee
     * </pre>
     */
    public void refundServiceDeposit(com.irismod.service.MsgRefundServiceDeposit request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgRefundServiceDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service
     * </pre>
     */
    public void callService(com.irismod.service.MsgCallService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgCallServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service
     * </pre>
     */
    public void respondService(com.irismod.service.MsgRespondService request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgRespondServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call
     * </pre>
     */
    public void pauseRequestContext(com.irismod.service.MsgPauseRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgPauseRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call
     * </pre>
     */
    public void startRequestContext(com.irismod.service.MsgStartRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgStartRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call
     * </pre>
     */
    public void killRequestContext(com.irismod.service.MsgKillRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgKillRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call
     * </pre>
     */
    public void updateRequestContext(com.irismod.service.MsgUpdateRequestContext request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees
     * </pre>
     */
    public void withdrawEarnedFees(com.irismod.service.MsgWithdrawEarnedFees request,
        io.grpc.stub.StreamObserver<com.irismod.service.MsgWithdrawEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawEarnedFeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
     * DefineService defines a method for define a new service
     * </pre>
     */
    public com.irismod.service.MsgDefineServiceResponse defineService(com.irismod.service.MsgDefineService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefineServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server
     * </pre>
     */
    public com.irismod.service.MsgBindServiceResponse bindService(com.irismod.service.MsgBindService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding
     * </pre>
     */
    public com.irismod.service.MsgUpdateServiceBindingResponse updateServiceBinding(com.irismod.service.MsgUpdateServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address
     * </pre>
     */
    public com.irismod.service.MsgSetWithdrawAddressResponse setWithdrawAddress(com.irismod.service.MsgSetWithdrawAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding
     * </pre>
     */
    public com.irismod.service.MsgEnableServiceBindingResponse enableServiceBinding(com.irismod.service.MsgEnableServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding
     * </pre>
     */
    public com.irismod.service.MsgDisableServiceBindingResponse disableServiceBinding(com.irismod.service.MsgDisableServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee
     * </pre>
     */
    public com.irismod.service.MsgRefundServiceDepositResponse refundServiceDeposit(com.irismod.service.MsgRefundServiceDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundServiceDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service
     * </pre>
     */
    public com.irismod.service.MsgCallServiceResponse callService(com.irismod.service.MsgCallService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service
     * </pre>
     */
    public com.irismod.service.MsgRespondServiceResponse respondService(com.irismod.service.MsgRespondService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call
     * </pre>
     */
    public com.irismod.service.MsgPauseRequestContextResponse pauseRequestContext(com.irismod.service.MsgPauseRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call
     * </pre>
     */
    public com.irismod.service.MsgStartRequestContextResponse startRequestContext(com.irismod.service.MsgStartRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call
     * </pre>
     */
    public com.irismod.service.MsgKillRequestContextResponse killRequestContext(com.irismod.service.MsgKillRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKillRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call
     * </pre>
     */
    public com.irismod.service.MsgUpdateRequestContextResponse updateRequestContext(com.irismod.service.MsgUpdateRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees
     * </pre>
     */
    public com.irismod.service.MsgWithdrawEarnedFeesResponse withdrawEarnedFees(com.irismod.service.MsgWithdrawEarnedFees request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawEarnedFeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service
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
     * DefineService defines a method for define a new service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgDefineServiceResponse> defineService(
        com.irismod.service.MsgDefineService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgBindServiceResponse> bindService(
        com.irismod.service.MsgBindService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgUpdateServiceBindingResponse> updateServiceBinding(
        com.irismod.service.MsgUpdateServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgSetWithdrawAddressResponse> setWithdrawAddress(
        com.irismod.service.MsgSetWithdrawAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgEnableServiceBindingResponse> enableServiceBinding(
        com.irismod.service.MsgEnableServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgDisableServiceBindingResponse> disableServiceBinding(
        com.irismod.service.MsgDisableServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgRefundServiceDepositResponse> refundServiceDeposit(
        com.irismod.service.MsgRefundServiceDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgCallServiceResponse> callService(
        com.irismod.service.MsgCallService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgRespondServiceResponse> respondService(
        com.irismod.service.MsgRespondService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgPauseRequestContextResponse> pauseRequestContext(
        com.irismod.service.MsgPauseRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgStartRequestContextResponse> startRequestContext(
        com.irismod.service.MsgStartRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgKillRequestContextResponse> killRequestContext(
        com.irismod.service.MsgKillRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgUpdateRequestContextResponse> updateRequestContext(
        com.irismod.service.MsgUpdateRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.MsgWithdrawEarnedFeesResponse> withdrawEarnedFees(
        com.irismod.service.MsgWithdrawEarnedFees request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawEarnedFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEFINE_SERVICE = 0;
  private static final int METHODID_BIND_SERVICE = 1;
  private static final int METHODID_UPDATE_SERVICE_BINDING = 2;
  private static final int METHODID_SET_WITHDRAW_ADDRESS = 3;
  private static final int METHODID_ENABLE_SERVICE_BINDING = 4;
  private static final int METHODID_DISABLE_SERVICE_BINDING = 5;
  private static final int METHODID_REFUND_SERVICE_DEPOSIT = 6;
  private static final int METHODID_CALL_SERVICE = 7;
  private static final int METHODID_RESPOND_SERVICE = 8;
  private static final int METHODID_PAUSE_REQUEST_CONTEXT = 9;
  private static final int METHODID_START_REQUEST_CONTEXT = 10;
  private static final int METHODID_KILL_REQUEST_CONTEXT = 11;
  private static final int METHODID_UPDATE_REQUEST_CONTEXT = 12;
  private static final int METHODID_WITHDRAW_EARNED_FEES = 13;

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
        case METHODID_DEFINE_SERVICE:
          serviceImpl.defineService((com.irismod.service.MsgDefineService) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgDefineServiceResponse>) responseObserver);
          break;
        case METHODID_BIND_SERVICE:
          serviceImpl.bindService((com.irismod.service.MsgBindService) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgBindServiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_BINDING:
          serviceImpl.updateServiceBinding((com.irismod.service.MsgUpdateServiceBinding) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateServiceBindingResponse>) responseObserver);
          break;
        case METHODID_SET_WITHDRAW_ADDRESS:
          serviceImpl.setWithdrawAddress((com.irismod.service.MsgSetWithdrawAddress) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgSetWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SERVICE_BINDING:
          serviceImpl.enableServiceBinding((com.irismod.service.MsgEnableServiceBinding) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgEnableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_DISABLE_SERVICE_BINDING:
          serviceImpl.disableServiceBinding((com.irismod.service.MsgDisableServiceBinding) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgDisableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_REFUND_SERVICE_DEPOSIT:
          serviceImpl.refundServiceDeposit((com.irismod.service.MsgRefundServiceDeposit) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgRefundServiceDepositResponse>) responseObserver);
          break;
        case METHODID_CALL_SERVICE:
          serviceImpl.callService((com.irismod.service.MsgCallService) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgCallServiceResponse>) responseObserver);
          break;
        case METHODID_RESPOND_SERVICE:
          serviceImpl.respondService((com.irismod.service.MsgRespondService) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgRespondServiceResponse>) responseObserver);
          break;
        case METHODID_PAUSE_REQUEST_CONTEXT:
          serviceImpl.pauseRequestContext((com.irismod.service.MsgPauseRequestContext) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgPauseRequestContextResponse>) responseObserver);
          break;
        case METHODID_START_REQUEST_CONTEXT:
          serviceImpl.startRequestContext((com.irismod.service.MsgStartRequestContext) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgStartRequestContextResponse>) responseObserver);
          break;
        case METHODID_KILL_REQUEST_CONTEXT:
          serviceImpl.killRequestContext((com.irismod.service.MsgKillRequestContext) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgKillRequestContextResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REQUEST_CONTEXT:
          serviceImpl.updateRequestContext((com.irismod.service.MsgUpdateRequestContext) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgUpdateRequestContextResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_EARNED_FEES:
          serviceImpl.withdrawEarnedFees((com.irismod.service.MsgWithdrawEarnedFees) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.MsgWithdrawEarnedFeesResponse>) responseObserver);
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
          getDefineServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgDefineService,
              com.irismod.service.MsgDefineServiceResponse>(
                service, METHODID_DEFINE_SERVICE)))
        .addMethod(
          getBindServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgBindService,
              com.irismod.service.MsgBindServiceResponse>(
                service, METHODID_BIND_SERVICE)))
        .addMethod(
          getUpdateServiceBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgUpdateServiceBinding,
              com.irismod.service.MsgUpdateServiceBindingResponse>(
                service, METHODID_UPDATE_SERVICE_BINDING)))
        .addMethod(
          getSetWithdrawAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgSetWithdrawAddress,
              com.irismod.service.MsgSetWithdrawAddressResponse>(
                service, METHODID_SET_WITHDRAW_ADDRESS)))
        .addMethod(
          getEnableServiceBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgEnableServiceBinding,
              com.irismod.service.MsgEnableServiceBindingResponse>(
                service, METHODID_ENABLE_SERVICE_BINDING)))
        .addMethod(
          getDisableServiceBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgDisableServiceBinding,
              com.irismod.service.MsgDisableServiceBindingResponse>(
                service, METHODID_DISABLE_SERVICE_BINDING)))
        .addMethod(
          getRefundServiceDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgRefundServiceDeposit,
              com.irismod.service.MsgRefundServiceDepositResponse>(
                service, METHODID_REFUND_SERVICE_DEPOSIT)))
        .addMethod(
          getCallServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgCallService,
              com.irismod.service.MsgCallServiceResponse>(
                service, METHODID_CALL_SERVICE)))
        .addMethod(
          getRespondServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgRespondService,
              com.irismod.service.MsgRespondServiceResponse>(
                service, METHODID_RESPOND_SERVICE)))
        .addMethod(
          getPauseRequestContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgPauseRequestContext,
              com.irismod.service.MsgPauseRequestContextResponse>(
                service, METHODID_PAUSE_REQUEST_CONTEXT)))
        .addMethod(
          getStartRequestContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgStartRequestContext,
              com.irismod.service.MsgStartRequestContextResponse>(
                service, METHODID_START_REQUEST_CONTEXT)))
        .addMethod(
          getKillRequestContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgKillRequestContext,
              com.irismod.service.MsgKillRequestContextResponse>(
                service, METHODID_KILL_REQUEST_CONTEXT)))
        .addMethod(
          getUpdateRequestContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgUpdateRequestContext,
              com.irismod.service.MsgUpdateRequestContextResponse>(
                service, METHODID_UPDATE_REQUEST_CONTEXT)))
        .addMethod(
          getWithdrawEarnedFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.MsgWithdrawEarnedFees,
              com.irismod.service.MsgWithdrawEarnedFeesResponse>(
                service, METHODID_WITHDRAW_EARNED_FEES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.service.TxProto.getDescriptor();
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
              .addMethod(getDefineServiceMethod())
              .addMethod(getBindServiceMethod())
              .addMethod(getUpdateServiceBindingMethod())
              .addMethod(getSetWithdrawAddressMethod())
              .addMethod(getEnableServiceBindingMethod())
              .addMethod(getDisableServiceBindingMethod())
              .addMethod(getRefundServiceDepositMethod())
              .addMethod(getCallServiceMethod())
              .addMethod(getRespondServiceMethod())
              .addMethod(getPauseRequestContextMethod())
              .addMethod(getStartRequestContextMethod())
              .addMethod(getKillRequestContextMethod())
              .addMethod(getUpdateRequestContextMethod())
              .addMethod(getWithdrawEarnedFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
