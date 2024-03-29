package com.axelar.evm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the evm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/evm/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.evm.v1beta1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SetGatewayRequest,
      com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> getSetGatewayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGateway",
      requestType = com.axelar.evm.v1beta1.TxProto.SetGatewayRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.SetGatewayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SetGatewayRequest,
      com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> getSetGatewayMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SetGatewayRequest, com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> getSetGatewayMethod;
    if ((getSetGatewayMethod = MsgServiceGrpc.getSetGatewayMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getSetGatewayMethod = MsgServiceGrpc.getSetGatewayMethod) == null) {
          MsgServiceGrpc.getSetGatewayMethod = getSetGatewayMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.SetGatewayRequest, com.axelar.evm.v1beta1.TxProto.SetGatewayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGateway"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.SetGatewayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.SetGatewayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("SetGateway"))
              .build();
        }
      }
    }
    return getSetGatewayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> getConfirmGatewayTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmGatewayTx",
      requestType = com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> getConfirmGatewayTxMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest, com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> getConfirmGatewayTxMethod;
    if ((getConfirmGatewayTxMethod = MsgServiceGrpc.getConfirmGatewayTxMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmGatewayTxMethod = MsgServiceGrpc.getConfirmGatewayTxMethod) == null) {
          MsgServiceGrpc.getConfirmGatewayTxMethod = getConfirmGatewayTxMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest, com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmGatewayTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmGatewayTx"))
              .build();
        }
      }
    }
    return getConfirmGatewayTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> getConfirmGatewayTxsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmGatewayTxs",
      requestType = com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> getConfirmGatewayTxsMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest, com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> getConfirmGatewayTxsMethod;
    if ((getConfirmGatewayTxsMethod = MsgServiceGrpc.getConfirmGatewayTxsMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmGatewayTxsMethod = MsgServiceGrpc.getConfirmGatewayTxsMethod) == null) {
          MsgServiceGrpc.getConfirmGatewayTxsMethod = getConfirmGatewayTxsMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest, com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmGatewayTxs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmGatewayTxs"))
              .build();
        }
      }
    }
    return getConfirmGatewayTxsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.LinkRequest,
      com.axelar.evm.v1beta1.TxProto.LinkResponse> getLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Link",
      requestType = com.axelar.evm.v1beta1.TxProto.LinkRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.LinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.LinkRequest,
      com.axelar.evm.v1beta1.TxProto.LinkResponse> getLinkMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.LinkRequest, com.axelar.evm.v1beta1.TxProto.LinkResponse> getLinkMethod;
    if ((getLinkMethod = MsgServiceGrpc.getLinkMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getLinkMethod = MsgServiceGrpc.getLinkMethod) == null) {
          MsgServiceGrpc.getLinkMethod = getLinkMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.LinkRequest, com.axelar.evm.v1beta1.TxProto.LinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Link"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.LinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.LinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("Link"))
              .build();
        }
      }
    }
    return getLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> getConfirmTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmToken",
      requestType = com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> getConfirmTokenMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest, com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> getConfirmTokenMethod;
    if ((getConfirmTokenMethod = MsgServiceGrpc.getConfirmTokenMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmTokenMethod = MsgServiceGrpc.getConfirmTokenMethod) == null) {
          MsgServiceGrpc.getConfirmTokenMethod = getConfirmTokenMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest, com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmToken"))
              .build();
        }
      }
    }
    return getConfirmTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> getConfirmDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmDeposit",
      requestType = com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> getConfirmDepositMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest, com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> getConfirmDepositMethod;
    if ((getConfirmDepositMethod = MsgServiceGrpc.getConfirmDepositMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmDepositMethod = MsgServiceGrpc.getConfirmDepositMethod) == null) {
          MsgServiceGrpc.getConfirmDepositMethod = getConfirmDepositMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest, com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmDeposit"))
              .build();
        }
      }
    }
    return getConfirmDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> getConfirmTransferKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmTransferKey",
      requestType = com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest,
      com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> getConfirmTransferKeyMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest, com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> getConfirmTransferKeyMethod;
    if ((getConfirmTransferKeyMethod = MsgServiceGrpc.getConfirmTransferKeyMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getConfirmTransferKeyMethod = MsgServiceGrpc.getConfirmTransferKeyMethod) == null) {
          MsgServiceGrpc.getConfirmTransferKeyMethod = getConfirmTransferKeyMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest, com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmTransferKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ConfirmTransferKey"))
              .build();
        }
      }
    }
    return getConfirmTransferKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest,
      com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> getCreateDeployTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeployToken",
      requestType = com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest,
      com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> getCreateDeployTokenMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest, com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> getCreateDeployTokenMethod;
    if ((getCreateDeployTokenMethod = MsgServiceGrpc.getCreateDeployTokenMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getCreateDeployTokenMethod = MsgServiceGrpc.getCreateDeployTokenMethod) == null) {
          MsgServiceGrpc.getCreateDeployTokenMethod = getCreateDeployTokenMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest, com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeployToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("CreateDeployToken"))
              .build();
        }
      }
    }
    return getCreateDeployTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest,
      com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> getCreateBurnTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBurnTokens",
      requestType = com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest,
      com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> getCreateBurnTokensMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest, com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> getCreateBurnTokensMethod;
    if ((getCreateBurnTokensMethod = MsgServiceGrpc.getCreateBurnTokensMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getCreateBurnTokensMethod = MsgServiceGrpc.getCreateBurnTokensMethod) == null) {
          MsgServiceGrpc.getCreateBurnTokensMethod = getCreateBurnTokensMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest, com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBurnTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("CreateBurnTokens"))
              .build();
        }
      }
    }
    return getCreateBurnTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest,
      com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> getCreatePendingTransfersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePendingTransfers",
      requestType = com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest,
      com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> getCreatePendingTransfersMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest, com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> getCreatePendingTransfersMethod;
    if ((getCreatePendingTransfersMethod = MsgServiceGrpc.getCreatePendingTransfersMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getCreatePendingTransfersMethod = MsgServiceGrpc.getCreatePendingTransfersMethod) == null) {
          MsgServiceGrpc.getCreatePendingTransfersMethod = getCreatePendingTransfersMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest, com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePendingTransfers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("CreatePendingTransfers"))
              .build();
        }
      }
    }
    return getCreatePendingTransfersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest,
      com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> getCreateTransferOperatorshipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransferOperatorship",
      requestType = com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest,
      com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> getCreateTransferOperatorshipMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest, com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> getCreateTransferOperatorshipMethod;
    if ((getCreateTransferOperatorshipMethod = MsgServiceGrpc.getCreateTransferOperatorshipMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getCreateTransferOperatorshipMethod = MsgServiceGrpc.getCreateTransferOperatorshipMethod) == null) {
          MsgServiceGrpc.getCreateTransferOperatorshipMethod = getCreateTransferOperatorshipMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest, com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransferOperatorship"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("CreateTransferOperatorship"))
              .build();
        }
      }
    }
    return getCreateTransferOperatorshipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SignCommandsRequest,
      com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> getSignCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignCommands",
      requestType = com.axelar.evm.v1beta1.TxProto.SignCommandsRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.SignCommandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SignCommandsRequest,
      com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> getSignCommandsMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.SignCommandsRequest, com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> getSignCommandsMethod;
    if ((getSignCommandsMethod = MsgServiceGrpc.getSignCommandsMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getSignCommandsMethod = MsgServiceGrpc.getSignCommandsMethod) == null) {
          MsgServiceGrpc.getSignCommandsMethod = getSignCommandsMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.SignCommandsRequest, com.axelar.evm.v1beta1.TxProto.SignCommandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.SignCommandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.SignCommandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("SignCommands"))
              .build();
        }
      }
    }
    return getSignCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.AddChainRequest,
      com.axelar.evm.v1beta1.TxProto.AddChainResponse> getAddChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddChain",
      requestType = com.axelar.evm.v1beta1.TxProto.AddChainRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.AddChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.AddChainRequest,
      com.axelar.evm.v1beta1.TxProto.AddChainResponse> getAddChainMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.AddChainRequest, com.axelar.evm.v1beta1.TxProto.AddChainResponse> getAddChainMethod;
    if ((getAddChainMethod = MsgServiceGrpc.getAddChainMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getAddChainMethod = MsgServiceGrpc.getAddChainMethod) == null) {
          MsgServiceGrpc.getAddChainMethod = getAddChainMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.AddChainRequest, com.axelar.evm.v1beta1.TxProto.AddChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.AddChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.AddChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("AddChain"))
              .build();
        }
      }
    }
    return getAddChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest,
      com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> getRetryFailedEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetryFailedEvent",
      requestType = com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest.class,
      responseType = com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest,
      com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> getRetryFailedEventMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest, com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> getRetryFailedEventMethod;
    if ((getRetryFailedEventMethod = MsgServiceGrpc.getRetryFailedEventMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRetryFailedEventMethod = MsgServiceGrpc.getRetryFailedEventMethod) == null) {
          MsgServiceGrpc.getRetryFailedEventMethod = getRetryFailedEventMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest, com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetryFailedEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RetryFailedEvent"))
              .build();
        }
      }
    }
    return getRetryFailedEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the evm Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void setGateway(com.axelar.evm.v1beta1.TxProto.SetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGatewayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: use ConfirmGatewayTxs instead
     * </pre>
     */
    default void confirmGatewayTx(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmGatewayTxMethod(), responseObserver);
    }

    /**
     */
    default void confirmGatewayTxs(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmGatewayTxsMethod(), responseObserver);
    }

    /**
     */
    default void link(com.axelar.evm.v1beta1.TxProto.LinkRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.LinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLinkMethod(), responseObserver);
    }

    /**
     */
    default void confirmToken(com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmTokenMethod(), responseObserver);
    }

    /**
     */
    default void confirmDeposit(com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmDepositMethod(), responseObserver);
    }

    /**
     */
    default void confirmTransferKey(com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmTransferKeyMethod(), responseObserver);
    }

    /**
     */
    default void createDeployToken(com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeployTokenMethod(), responseObserver);
    }

    /**
     */
    default void createBurnTokens(com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBurnTokensMethod(), responseObserver);
    }

    /**
     */
    default void createPendingTransfers(com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePendingTransfersMethod(), responseObserver);
    }

    /**
     */
    default void createTransferOperatorship(com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransferOperatorshipMethod(), responseObserver);
    }

    /**
     */
    default void signCommands(com.axelar.evm.v1beta1.TxProto.SignCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignCommandsMethod(), responseObserver);
    }

    /**
     */
    default void addChain(com.axelar.evm.v1beta1.TxProto.AddChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.AddChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddChainMethod(), responseObserver);
    }

    /**
     */
    default void retryFailedEvent(com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetryFailedEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   * <pre>
   * Msg defines the evm Msg service.
   * </pre>
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the evm Msg service.
   * </pre>
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void setGateway(com.axelar.evm.v1beta1.TxProto.SetGatewayRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGatewayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: use ConfirmGatewayTxs instead
     * </pre>
     */
    public void confirmGatewayTx(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmGatewayTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmGatewayTxs(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmGatewayTxsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void link(com.axelar.evm.v1beta1.TxProto.LinkRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.LinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmToken(com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmDeposit(com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmTransferKey(com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmTransferKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDeployToken(com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeployTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBurnTokens(com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBurnTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPendingTransfers(com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePendingTransfersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTransferOperatorship(com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransferOperatorshipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signCommands(com.axelar.evm.v1beta1.TxProto.SignCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignCommandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addChain(com.axelar.evm.v1beta1.TxProto.AddChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.AddChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retryFailedEvent(com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetryFailedEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the evm Msg service.
   * </pre>
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.SetGatewayResponse setGateway(com.axelar.evm.v1beta1.TxProto.SetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGatewayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: use ConfirmGatewayTxs instead
     * </pre>
     */
    public com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse confirmGatewayTx(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmGatewayTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse confirmGatewayTxs(com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmGatewayTxsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.LinkResponse link(com.axelar.evm.v1beta1.TxProto.LinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse confirmToken(com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse confirmDeposit(com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse confirmTransferKey(com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmTransferKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse createDeployToken(com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeployTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse createBurnTokens(com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBurnTokensMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse createPendingTransfers(com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePendingTransfersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse createTransferOperatorship(com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransferOperatorshipMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.SignCommandsResponse signCommands(com.axelar.evm.v1beta1.TxProto.SignCommandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignCommandsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.AddChainResponse addChain(com.axelar.evm.v1beta1.TxProto.AddChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse retryFailedEvent(com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetryFailedEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   * <pre>
   * Msg defines the evm Msg service.
   * </pre>
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.SetGatewayResponse> setGateway(
        com.axelar.evm.v1beta1.TxProto.SetGatewayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGatewayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: use ConfirmGatewayTxs instead
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse> confirmGatewayTx(
        com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmGatewayTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse> confirmGatewayTxs(
        com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmGatewayTxsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.LinkResponse> link(
        com.axelar.evm.v1beta1.TxProto.LinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse> confirmToken(
        com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse> confirmDeposit(
        com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse> confirmTransferKey(
        com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmTransferKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse> createDeployToken(
        com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeployTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse> createBurnTokens(
        com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBurnTokensMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse> createPendingTransfers(
        com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePendingTransfersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse> createTransferOperatorship(
        com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransferOperatorshipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.SignCommandsResponse> signCommands(
        com.axelar.evm.v1beta1.TxProto.SignCommandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignCommandsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.AddChainResponse> addChain(
        com.axelar.evm.v1beta1.TxProto.AddChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse> retryFailedEvent(
        com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetryFailedEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_GATEWAY = 0;
  private static final int METHODID_CONFIRM_GATEWAY_TX = 1;
  private static final int METHODID_CONFIRM_GATEWAY_TXS = 2;
  private static final int METHODID_LINK = 3;
  private static final int METHODID_CONFIRM_TOKEN = 4;
  private static final int METHODID_CONFIRM_DEPOSIT = 5;
  private static final int METHODID_CONFIRM_TRANSFER_KEY = 6;
  private static final int METHODID_CREATE_DEPLOY_TOKEN = 7;
  private static final int METHODID_CREATE_BURN_TOKENS = 8;
  private static final int METHODID_CREATE_PENDING_TRANSFERS = 9;
  private static final int METHODID_CREATE_TRANSFER_OPERATORSHIP = 10;
  private static final int METHODID_SIGN_COMMANDS = 11;
  private static final int METHODID_ADD_CHAIN = 12;
  private static final int METHODID_RETRY_FAILED_EVENT = 13;

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
        case METHODID_SET_GATEWAY:
          serviceImpl.setGateway((com.axelar.evm.v1beta1.TxProto.SetGatewayRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SetGatewayResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_GATEWAY_TX:
          serviceImpl.confirmGatewayTx((com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_GATEWAY_TXS:
          serviceImpl.confirmGatewayTxs((com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse>) responseObserver);
          break;
        case METHODID_LINK:
          serviceImpl.link((com.axelar.evm.v1beta1.TxProto.LinkRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.LinkResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_TOKEN:
          serviceImpl.confirmToken((com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_DEPOSIT:
          serviceImpl.confirmDeposit((com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_TRANSFER_KEY:
          serviceImpl.confirmTransferKey((com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEPLOY_TOKEN:
          serviceImpl.createDeployToken((com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse>) responseObserver);
          break;
        case METHODID_CREATE_BURN_TOKENS:
          serviceImpl.createBurnTokens((com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse>) responseObserver);
          break;
        case METHODID_CREATE_PENDING_TRANSFERS:
          serviceImpl.createPendingTransfers((com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSFER_OPERATORSHIP:
          serviceImpl.createTransferOperatorship((com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse>) responseObserver);
          break;
        case METHODID_SIGN_COMMANDS:
          serviceImpl.signCommands((com.axelar.evm.v1beta1.TxProto.SignCommandsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.SignCommandsResponse>) responseObserver);
          break;
        case METHODID_ADD_CHAIN:
          serviceImpl.addChain((com.axelar.evm.v1beta1.TxProto.AddChainRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.AddChainResponse>) responseObserver);
          break;
        case METHODID_RETRY_FAILED_EVENT:
          serviceImpl.retryFailedEvent((com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse>) responseObserver);
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
          getSetGatewayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.SetGatewayRequest,
              com.axelar.evm.v1beta1.TxProto.SetGatewayResponse>(
                service, METHODID_SET_GATEWAY)))
        .addMethod(
          getConfirmGatewayTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxRequest,
              com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxResponse>(
                service, METHODID_CONFIRM_GATEWAY_TX)))
        .addMethod(
          getConfirmGatewayTxsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsRequest,
              com.axelar.evm.v1beta1.TxProto.ConfirmGatewayTxsResponse>(
                service, METHODID_CONFIRM_GATEWAY_TXS)))
        .addMethod(
          getLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.LinkRequest,
              com.axelar.evm.v1beta1.TxProto.LinkResponse>(
                service, METHODID_LINK)))
        .addMethod(
          getConfirmTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.ConfirmTokenRequest,
              com.axelar.evm.v1beta1.TxProto.ConfirmTokenResponse>(
                service, METHODID_CONFIRM_TOKEN)))
        .addMethod(
          getConfirmDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.ConfirmDepositRequest,
              com.axelar.evm.v1beta1.TxProto.ConfirmDepositResponse>(
                service, METHODID_CONFIRM_DEPOSIT)))
        .addMethod(
          getConfirmTransferKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyRequest,
              com.axelar.evm.v1beta1.TxProto.ConfirmTransferKeyResponse>(
                service, METHODID_CONFIRM_TRANSFER_KEY)))
        .addMethod(
          getCreateDeployTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.CreateDeployTokenRequest,
              com.axelar.evm.v1beta1.TxProto.CreateDeployTokenResponse>(
                service, METHODID_CREATE_DEPLOY_TOKEN)))
        .addMethod(
          getCreateBurnTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.CreateBurnTokensRequest,
              com.axelar.evm.v1beta1.TxProto.CreateBurnTokensResponse>(
                service, METHODID_CREATE_BURN_TOKENS)))
        .addMethod(
          getCreatePendingTransfersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersRequest,
              com.axelar.evm.v1beta1.TxProto.CreatePendingTransfersResponse>(
                service, METHODID_CREATE_PENDING_TRANSFERS)))
        .addMethod(
          getCreateTransferOperatorshipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipRequest,
              com.axelar.evm.v1beta1.TxProto.CreateTransferOperatorshipResponse>(
                service, METHODID_CREATE_TRANSFER_OPERATORSHIP)))
        .addMethod(
          getSignCommandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.SignCommandsRequest,
              com.axelar.evm.v1beta1.TxProto.SignCommandsResponse>(
                service, METHODID_SIGN_COMMANDS)))
        .addMethod(
          getAddChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.AddChainRequest,
              com.axelar.evm.v1beta1.TxProto.AddChainResponse>(
                service, METHODID_ADD_CHAIN)))
        .addMethod(
          getRetryFailedEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TxProto.RetryFailedEventRequest,
              com.axelar.evm.v1beta1.TxProto.RetryFailedEventResponse>(
                service, METHODID_RETRY_FAILED_EVENT)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.evm.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getSetGatewayMethod())
              .addMethod(getConfirmGatewayTxMethod())
              .addMethod(getConfirmGatewayTxsMethod())
              .addMethod(getLinkMethod())
              .addMethod(getConfirmTokenMethod())
              .addMethod(getConfirmDepositMethod())
              .addMethod(getConfirmTransferKeyMethod())
              .addMethod(getCreateDeployTokenMethod())
              .addMethod(getCreateBurnTokensMethod())
              .addMethod(getCreatePendingTransfersMethod())
              .addMethod(getCreateTransferOperatorshipMethod())
              .addMethod(getSignCommandsMethod())
              .addMethod(getAddChainMethod())
              .addMethod(getRetryFailedEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
