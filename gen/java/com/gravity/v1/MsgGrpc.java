package com.gravity.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the state transitions possible within gravity
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: gravity/v1/msgs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "gravity.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetConfirm,
      com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> getValsetConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirm",
      requestType = com.gravity.v1.MsgsProto.MsgValsetConfirm.class,
      responseType = com.gravity.v1.MsgsProto.MsgValsetConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetConfirm,
      com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> getValsetConfirmMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetConfirm, com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> getValsetConfirmMethod;
    if ((getValsetConfirmMethod = MsgGrpc.getValsetConfirmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getValsetConfirmMethod = MsgGrpc.getValsetConfirmMethod) == null) {
          MsgGrpc.getValsetConfirmMethod = getValsetConfirmMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgValsetConfirm, com.gravity.v1.MsgsProto.MsgValsetConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgValsetConfirm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgValsetConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ValsetConfirm"))
              .build();
        }
      }
    }
    return getValsetConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToEth,
      com.gravity.v1.MsgsProto.MsgSendToEthResponse> getSendToEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToEth",
      requestType = com.gravity.v1.MsgsProto.MsgSendToEth.class,
      responseType = com.gravity.v1.MsgsProto.MsgSendToEthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToEth,
      com.gravity.v1.MsgsProto.MsgSendToEthResponse> getSendToEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToEth, com.gravity.v1.MsgsProto.MsgSendToEthResponse> getSendToEthMethod;
    if ((getSendToEthMethod = MsgGrpc.getSendToEthMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendToEthMethod = MsgGrpc.getSendToEthMethod) == null) {
          MsgGrpc.getSendToEthMethod = getSendToEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgSendToEth, com.gravity.v1.MsgsProto.MsgSendToEthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSendToEth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSendToEthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendToEth"))
              .build();
        }
      }
    }
    return getSendToEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgRequestBatch,
      com.gravity.v1.MsgsProto.MsgRequestBatchResponse> getRequestBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestBatch",
      requestType = com.gravity.v1.MsgsProto.MsgRequestBatch.class,
      responseType = com.gravity.v1.MsgsProto.MsgRequestBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgRequestBatch,
      com.gravity.v1.MsgsProto.MsgRequestBatchResponse> getRequestBatchMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgRequestBatch, com.gravity.v1.MsgsProto.MsgRequestBatchResponse> getRequestBatchMethod;
    if ((getRequestBatchMethod = MsgGrpc.getRequestBatchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestBatchMethod = MsgGrpc.getRequestBatchMethod) == null) {
          MsgGrpc.getRequestBatchMethod = getRequestBatchMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgRequestBatch, com.gravity.v1.MsgsProto.MsgRequestBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgRequestBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgRequestBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestBatch"))
              .build();
        }
      }
    }
    return getRequestBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmBatch,
      com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> getConfirmBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmBatch",
      requestType = com.gravity.v1.MsgsProto.MsgConfirmBatch.class,
      responseType = com.gravity.v1.MsgsProto.MsgConfirmBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmBatch,
      com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> getConfirmBatchMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmBatch, com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> getConfirmBatchMethod;
    if ((getConfirmBatchMethod = MsgGrpc.getConfirmBatchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfirmBatchMethod = MsgGrpc.getConfirmBatchMethod) == null) {
          MsgGrpc.getConfirmBatchMethod = getConfirmBatchMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgConfirmBatch, com.gravity.v1.MsgsProto.MsgConfirmBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgConfirmBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgConfirmBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfirmBatch"))
              .build();
        }
      }
    }
    return getConfirmBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmLogicCall,
      com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> getConfirmLogicCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmLogicCall",
      requestType = com.gravity.v1.MsgsProto.MsgConfirmLogicCall.class,
      responseType = com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmLogicCall,
      com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> getConfirmLogicCallMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgConfirmLogicCall, com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> getConfirmLogicCallMethod;
    if ((getConfirmLogicCallMethod = MsgGrpc.getConfirmLogicCallMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getConfirmLogicCallMethod = MsgGrpc.getConfirmLogicCallMethod) == null) {
          MsgGrpc.getConfirmLogicCallMethod = getConfirmLogicCallMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgConfirmLogicCall, com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmLogicCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgConfirmLogicCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ConfirmLogicCall"))
              .build();
        }
      }
    }
    return getConfirmLogicCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToCosmosClaim,
      com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> getSendToCosmosClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendToCosmosClaim",
      requestType = com.gravity.v1.MsgsProto.MsgSendToCosmosClaim.class,
      responseType = com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToCosmosClaim,
      com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> getSendToCosmosClaimMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSendToCosmosClaim, com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> getSendToCosmosClaimMethod;
    if ((getSendToCosmosClaimMethod = MsgGrpc.getSendToCosmosClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendToCosmosClaimMethod = MsgGrpc.getSendToCosmosClaimMethod) == null) {
          MsgGrpc.getSendToCosmosClaimMethod = getSendToCosmosClaimMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgSendToCosmosClaim, com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendToCosmosClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSendToCosmosClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SendToCosmosClaim"))
              .build();
        }
      }
    }
    return getSendToCosmosClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards,
      com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> getExecuteIbcAutoForwardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteIbcAutoForwards",
      requestType = com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards.class,
      responseType = com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards,
      com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> getExecuteIbcAutoForwardsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards, com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> getExecuteIbcAutoForwardsMethod;
    if ((getExecuteIbcAutoForwardsMethod = MsgGrpc.getExecuteIbcAutoForwardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteIbcAutoForwardsMethod = MsgGrpc.getExecuteIbcAutoForwardsMethod) == null) {
          MsgGrpc.getExecuteIbcAutoForwardsMethod = getExecuteIbcAutoForwardsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards, com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteIbcAutoForwards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteIbcAutoForwards"))
              .build();
        }
      }
    }
    return getExecuteIbcAutoForwardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim,
      com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> getBatchSendToEthClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchSendToEthClaim",
      requestType = com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim.class,
      responseType = com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim,
      com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> getBatchSendToEthClaimMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim, com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> getBatchSendToEthClaimMethod;
    if ((getBatchSendToEthClaimMethod = MsgGrpc.getBatchSendToEthClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBatchSendToEthClaimMethod = MsgGrpc.getBatchSendToEthClaimMethod) == null) {
          MsgGrpc.getBatchSendToEthClaimMethod = getBatchSendToEthClaimMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim, com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchSendToEthClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BatchSendToEthClaim"))
              .build();
        }
      }
    }
    return getBatchSendToEthClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim,
      com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> getValsetUpdateClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetUpdateClaim",
      requestType = com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim.class,
      responseType = com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim,
      com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> getValsetUpdateClaimMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim, com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> getValsetUpdateClaimMethod;
    if ((getValsetUpdateClaimMethod = MsgGrpc.getValsetUpdateClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getValsetUpdateClaimMethod = MsgGrpc.getValsetUpdateClaimMethod) == null) {
          MsgGrpc.getValsetUpdateClaimMethod = getValsetUpdateClaimMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim, com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetUpdateClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ValsetUpdateClaim"))
              .build();
        }
      }
    }
    return getValsetUpdateClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgERC20DeployedClaim,
      com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> getERC20DeployedClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ERC20DeployedClaim",
      requestType = com.gravity.v1.MsgsProto.MsgERC20DeployedClaim.class,
      responseType = com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgERC20DeployedClaim,
      com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> getERC20DeployedClaimMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgERC20DeployedClaim, com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> getERC20DeployedClaimMethod;
    if ((getERC20DeployedClaimMethod = MsgGrpc.getERC20DeployedClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getERC20DeployedClaimMethod = MsgGrpc.getERC20DeployedClaimMethod) == null) {
          MsgGrpc.getERC20DeployedClaimMethod = getERC20DeployedClaimMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgERC20DeployedClaim, com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ERC20DeployedClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgERC20DeployedClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ERC20DeployedClaim"))
              .build();
        }
      }
    }
    return getERC20DeployedClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim,
      com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> getLogicCallExecutedClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogicCallExecutedClaim",
      requestType = com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim.class,
      responseType = com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim,
      com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> getLogicCallExecutedClaimMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim, com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> getLogicCallExecutedClaimMethod;
    if ((getLogicCallExecutedClaimMethod = MsgGrpc.getLogicCallExecutedClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLogicCallExecutedClaimMethod = MsgGrpc.getLogicCallExecutedClaimMethod) == null) {
          MsgGrpc.getLogicCallExecutedClaimMethod = getLogicCallExecutedClaimMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim, com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogicCallExecutedClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LogicCallExecutedClaim"))
              .build();
        }
      }
    }
    return getLogicCallExecutedClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress,
      com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> getSetOrchestratorAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOrchestratorAddress",
      requestType = com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress.class,
      responseType = com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress,
      com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> getSetOrchestratorAddressMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress, com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> getSetOrchestratorAddressMethod;
    if ((getSetOrchestratorAddressMethod = MsgGrpc.getSetOrchestratorAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetOrchestratorAddressMethod = MsgGrpc.getSetOrchestratorAddressMethod) == null) {
          MsgGrpc.getSetOrchestratorAddressMethod = getSetOrchestratorAddressMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress, com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOrchestratorAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetOrchestratorAddress"))
              .build();
        }
      }
    }
    return getSetOrchestratorAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgCancelSendToEth,
      com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> getCancelSendToEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelSendToEth",
      requestType = com.gravity.v1.MsgsProto.MsgCancelSendToEth.class,
      responseType = com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgCancelSendToEth,
      com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> getCancelSendToEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgCancelSendToEth, com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> getCancelSendToEthMethod;
    if ((getCancelSendToEthMethod = MsgGrpc.getCancelSendToEthMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelSendToEthMethod = MsgGrpc.getCancelSendToEthMethod) == null) {
          MsgGrpc.getCancelSendToEthMethod = getCancelSendToEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgCancelSendToEth, com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelSendToEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgCancelSendToEth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelSendToEth"))
              .build();
        }
      }
    }
    return getCancelSendToEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence,
      com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> getSubmitBadSignatureEvidenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitBadSignatureEvidence",
      requestType = com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence.class,
      responseType = com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence,
      com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> getSubmitBadSignatureEvidenceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence, com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> getSubmitBadSignatureEvidenceMethod;
    if ((getSubmitBadSignatureEvidenceMethod = MsgGrpc.getSubmitBadSignatureEvidenceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitBadSignatureEvidenceMethod = MsgGrpc.getSubmitBadSignatureEvidenceMethod) == null) {
          MsgGrpc.getSubmitBadSignatureEvidenceMethod = getSubmitBadSignatureEvidenceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence, com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitBadSignatureEvidence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitBadSignatureEvidence"))
              .build();
        }
      }
    }
    return getSubmitBadSignatureEvidenceMethod;
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
   * Msg defines the state transitions possible within gravity
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void valsetConfirm(com.gravity.v1.MsgsProto.MsgValsetConfirm request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmMethod(), responseObserver);
    }

    /**
     */
    default void sendToEth(com.gravity.v1.MsgsProto.MsgSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToEthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendToEthMethod(), responseObserver);
    }

    /**
     */
    default void requestBatch(com.gravity.v1.MsgsProto.MsgRequestBatch request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgRequestBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestBatchMethod(), responseObserver);
    }

    /**
     */
    default void confirmBatch(com.gravity.v1.MsgsProto.MsgConfirmBatch request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmBatchMethod(), responseObserver);
    }

    /**
     */
    default void confirmLogicCall(com.gravity.v1.MsgsProto.MsgConfirmLogicCall request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmLogicCallMethod(), responseObserver);
    }

    /**
     */
    default void sendToCosmosClaim(com.gravity.v1.MsgsProto.MsgSendToCosmosClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendToCosmosClaimMethod(), responseObserver);
    }

    /**
     */
    default void executeIbcAutoForwards(com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteIbcAutoForwardsMethod(), responseObserver);
    }

    /**
     */
    default void batchSendToEthClaim(com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchSendToEthClaimMethod(), responseObserver);
    }

    /**
     */
    default void valsetUpdateClaim(com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetUpdateClaimMethod(), responseObserver);
    }

    /**
     */
    default void eRC20DeployedClaim(com.gravity.v1.MsgsProto.MsgERC20DeployedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getERC20DeployedClaimMethod(), responseObserver);
    }

    /**
     */
    default void logicCallExecutedClaim(com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogicCallExecutedClaimMethod(), responseObserver);
    }

    /**
     */
    default void setOrchestratorAddress(com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOrchestratorAddressMethod(), responseObserver);
    }

    /**
     */
    default void cancelSendToEth(com.gravity.v1.MsgsProto.MsgCancelSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelSendToEthMethod(), responseObserver);
    }

    /**
     */
    default void submitBadSignatureEvidence(com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitBadSignatureEvidenceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the state transitions possible within gravity
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
   * Msg defines the state transitions possible within gravity
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
    public void valsetConfirm(com.gravity.v1.MsgsProto.MsgValsetConfirm request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendToEth(com.gravity.v1.MsgsProto.MsgSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToEthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendToEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestBatch(com.gravity.v1.MsgsProto.MsgRequestBatch request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgRequestBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmBatch(com.gravity.v1.MsgsProto.MsgConfirmBatch request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmLogicCall(com.gravity.v1.MsgsProto.MsgConfirmLogicCall request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmLogicCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendToCosmosClaim(com.gravity.v1.MsgsProto.MsgSendToCosmosClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendToCosmosClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeIbcAutoForwards(com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteIbcAutoForwardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchSendToEthClaim(com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchSendToEthClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetUpdateClaim(com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetUpdateClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eRC20DeployedClaim(com.gravity.v1.MsgsProto.MsgERC20DeployedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getERC20DeployedClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logicCallExecutedClaim(com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogicCallExecutedClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOrchestratorAddress(com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOrchestratorAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelSendToEth(com.gravity.v1.MsgsProto.MsgCancelSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelSendToEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitBadSignatureEvidence(com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence request,
        io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitBadSignatureEvidenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the state transitions possible within gravity
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
    public com.gravity.v1.MsgsProto.MsgValsetConfirmResponse valsetConfirm(com.gravity.v1.MsgsProto.MsgValsetConfirm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgSendToEthResponse sendToEth(com.gravity.v1.MsgsProto.MsgSendToEth request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendToEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgRequestBatchResponse requestBatch(com.gravity.v1.MsgsProto.MsgRequestBatch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgConfirmBatchResponse confirmBatch(com.gravity.v1.MsgsProto.MsgConfirmBatch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmBatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse confirmLogicCall(com.gravity.v1.MsgsProto.MsgConfirmLogicCall request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmLogicCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse sendToCosmosClaim(com.gravity.v1.MsgsProto.MsgSendToCosmosClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendToCosmosClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse executeIbcAutoForwards(com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteIbcAutoForwardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse batchSendToEthClaim(com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchSendToEthClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse valsetUpdateClaim(com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetUpdateClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse eRC20DeployedClaim(com.gravity.v1.MsgsProto.MsgERC20DeployedClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getERC20DeployedClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse logicCallExecutedClaim(com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogicCallExecutedClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse setOrchestratorAddress(com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOrchestratorAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse cancelSendToEth(com.gravity.v1.MsgsProto.MsgCancelSendToEth request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelSendToEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse submitBadSignatureEvidence(com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitBadSignatureEvidenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the state transitions possible within gravity
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
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgValsetConfirmResponse> valsetConfirm(
        com.gravity.v1.MsgsProto.MsgValsetConfirm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgSendToEthResponse> sendToEth(
        com.gravity.v1.MsgsProto.MsgSendToEth request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendToEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgRequestBatchResponse> requestBatch(
        com.gravity.v1.MsgsProto.MsgRequestBatch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgConfirmBatchResponse> confirmBatch(
        com.gravity.v1.MsgsProto.MsgConfirmBatch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmBatchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse> confirmLogicCall(
        com.gravity.v1.MsgsProto.MsgConfirmLogicCall request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmLogicCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse> sendToCosmosClaim(
        com.gravity.v1.MsgsProto.MsgSendToCosmosClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendToCosmosClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse> executeIbcAutoForwards(
        com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteIbcAutoForwardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse> batchSendToEthClaim(
        com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchSendToEthClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse> valsetUpdateClaim(
        com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetUpdateClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse> eRC20DeployedClaim(
        com.gravity.v1.MsgsProto.MsgERC20DeployedClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getERC20DeployedClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse> logicCallExecutedClaim(
        com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogicCallExecutedClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse> setOrchestratorAddress(
        com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOrchestratorAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse> cancelSendToEth(
        com.gravity.v1.MsgsProto.MsgCancelSendToEth request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelSendToEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse> submitBadSignatureEvidence(
        com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitBadSignatureEvidenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALSET_CONFIRM = 0;
  private static final int METHODID_SEND_TO_ETH = 1;
  private static final int METHODID_REQUEST_BATCH = 2;
  private static final int METHODID_CONFIRM_BATCH = 3;
  private static final int METHODID_CONFIRM_LOGIC_CALL = 4;
  private static final int METHODID_SEND_TO_COSMOS_CLAIM = 5;
  private static final int METHODID_EXECUTE_IBC_AUTO_FORWARDS = 6;
  private static final int METHODID_BATCH_SEND_TO_ETH_CLAIM = 7;
  private static final int METHODID_VALSET_UPDATE_CLAIM = 8;
  private static final int METHODID_ERC20DEPLOYED_CLAIM = 9;
  private static final int METHODID_LOGIC_CALL_EXECUTED_CLAIM = 10;
  private static final int METHODID_SET_ORCHESTRATOR_ADDRESS = 11;
  private static final int METHODID_CANCEL_SEND_TO_ETH = 12;
  private static final int METHODID_SUBMIT_BAD_SIGNATURE_EVIDENCE = 13;

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
        case METHODID_VALSET_CONFIRM:
          serviceImpl.valsetConfirm((com.gravity.v1.MsgsProto.MsgValsetConfirm) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetConfirmResponse>) responseObserver);
          break;
        case METHODID_SEND_TO_ETH:
          serviceImpl.sendToEth((com.gravity.v1.MsgsProto.MsgSendToEth) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToEthResponse>) responseObserver);
          break;
        case METHODID_REQUEST_BATCH:
          serviceImpl.requestBatch((com.gravity.v1.MsgsProto.MsgRequestBatch) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgRequestBatchResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_BATCH:
          serviceImpl.confirmBatch((com.gravity.v1.MsgsProto.MsgConfirmBatch) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmBatchResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_LOGIC_CALL:
          serviceImpl.confirmLogicCall((com.gravity.v1.MsgsProto.MsgConfirmLogicCall) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse>) responseObserver);
          break;
        case METHODID_SEND_TO_COSMOS_CLAIM:
          serviceImpl.sendToCosmosClaim((com.gravity.v1.MsgsProto.MsgSendToCosmosClaim) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_IBC_AUTO_FORWARDS:
          serviceImpl.executeIbcAutoForwards((com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse>) responseObserver);
          break;
        case METHODID_BATCH_SEND_TO_ETH_CLAIM:
          serviceImpl.batchSendToEthClaim((com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse>) responseObserver);
          break;
        case METHODID_VALSET_UPDATE_CLAIM:
          serviceImpl.valsetUpdateClaim((com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse>) responseObserver);
          break;
        case METHODID_ERC20DEPLOYED_CLAIM:
          serviceImpl.eRC20DeployedClaim((com.gravity.v1.MsgsProto.MsgERC20DeployedClaim) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse>) responseObserver);
          break;
        case METHODID_LOGIC_CALL_EXECUTED_CLAIM:
          serviceImpl.logicCallExecutedClaim((com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse>) responseObserver);
          break;
        case METHODID_SET_ORCHESTRATOR_ADDRESS:
          serviceImpl.setOrchestratorAddress((com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse>) responseObserver);
          break;
        case METHODID_CANCEL_SEND_TO_ETH:
          serviceImpl.cancelSendToEth((com.gravity.v1.MsgsProto.MsgCancelSendToEth) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_BAD_SIGNATURE_EVIDENCE:
          serviceImpl.submitBadSignatureEvidence((com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse>) responseObserver);
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
          getValsetConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgValsetConfirm,
              com.gravity.v1.MsgsProto.MsgValsetConfirmResponse>(
                service, METHODID_VALSET_CONFIRM)))
        .addMethod(
          getSendToEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgSendToEth,
              com.gravity.v1.MsgsProto.MsgSendToEthResponse>(
                service, METHODID_SEND_TO_ETH)))
        .addMethod(
          getRequestBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgRequestBatch,
              com.gravity.v1.MsgsProto.MsgRequestBatchResponse>(
                service, METHODID_REQUEST_BATCH)))
        .addMethod(
          getConfirmBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgConfirmBatch,
              com.gravity.v1.MsgsProto.MsgConfirmBatchResponse>(
                service, METHODID_CONFIRM_BATCH)))
        .addMethod(
          getConfirmLogicCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgConfirmLogicCall,
              com.gravity.v1.MsgsProto.MsgConfirmLogicCallResponse>(
                service, METHODID_CONFIRM_LOGIC_CALL)))
        .addMethod(
          getSendToCosmosClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgSendToCosmosClaim,
              com.gravity.v1.MsgsProto.MsgSendToCosmosClaimResponse>(
                service, METHODID_SEND_TO_COSMOS_CLAIM)))
        .addMethod(
          getExecuteIbcAutoForwardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwards,
              com.gravity.v1.MsgsProto.MsgExecuteIbcAutoForwardsResponse>(
                service, METHODID_EXECUTE_IBC_AUTO_FORWARDS)))
        .addMethod(
          getBatchSendToEthClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgBatchSendToEthClaim,
              com.gravity.v1.MsgsProto.MsgBatchSendToEthClaimResponse>(
                service, METHODID_BATCH_SEND_TO_ETH_CLAIM)))
        .addMethod(
          getValsetUpdateClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgValsetUpdatedClaim,
              com.gravity.v1.MsgsProto.MsgValsetUpdatedClaimResponse>(
                service, METHODID_VALSET_UPDATE_CLAIM)))
        .addMethod(
          getERC20DeployedClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgERC20DeployedClaim,
              com.gravity.v1.MsgsProto.MsgERC20DeployedClaimResponse>(
                service, METHODID_ERC20DEPLOYED_CLAIM)))
        .addMethod(
          getLogicCallExecutedClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaim,
              com.gravity.v1.MsgsProto.MsgLogicCallExecutedClaimResponse>(
                service, METHODID_LOGIC_CALL_EXECUTED_CLAIM)))
        .addMethod(
          getSetOrchestratorAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgSetOrchestratorAddress,
              com.gravity.v1.MsgsProto.MsgSetOrchestratorAddressResponse>(
                service, METHODID_SET_ORCHESTRATOR_ADDRESS)))
        .addMethod(
          getCancelSendToEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgCancelSendToEth,
              com.gravity.v1.MsgsProto.MsgCancelSendToEthResponse>(
                service, METHODID_CANCEL_SEND_TO_ETH)))
        .addMethod(
          getSubmitBadSignatureEvidenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidence,
              com.gravity.v1.MsgsProto.MsgSubmitBadSignatureEvidenceResponse>(
                service, METHODID_SUBMIT_BAD_SIGNATURE_EVIDENCE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gravity.v1.MsgsProto.getDescriptor();
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
              .addMethod(getValsetConfirmMethod())
              .addMethod(getSendToEthMethod())
              .addMethod(getRequestBatchMethod())
              .addMethod(getConfirmBatchMethod())
              .addMethod(getConfirmLogicCallMethod())
              .addMethod(getSendToCosmosClaimMethod())
              .addMethod(getExecuteIbcAutoForwardsMethod())
              .addMethod(getBatchSendToEthClaimMethod())
              .addMethod(getValsetUpdateClaimMethod())
              .addMethod(getERC20DeployedClaimMethod())
              .addMethod(getLogicCallExecutedClaimMethod())
              .addMethod(getSetOrchestratorAddressMethod())
              .addMethod(getCancelSendToEthMethod())
              .addMethod(getSubmitBadSignatureEvidenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
