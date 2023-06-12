package com.provenance.marker.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Marker Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: provenance/marker/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "provenance.marker.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgFinalizeRequest,
      com.provenance.marker.v1.MsgFinalizeResponse> getFinalizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Finalize",
      requestType = com.provenance.marker.v1.MsgFinalizeRequest.class,
      responseType = com.provenance.marker.v1.MsgFinalizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgFinalizeRequest,
      com.provenance.marker.v1.MsgFinalizeResponse> getFinalizeMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgFinalizeRequest, com.provenance.marker.v1.MsgFinalizeResponse> getFinalizeMethod;
    if ((getFinalizeMethod = MsgGrpc.getFinalizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFinalizeMethod = MsgGrpc.getFinalizeMethod) == null) {
          MsgGrpc.getFinalizeMethod = getFinalizeMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgFinalizeRequest, com.provenance.marker.v1.MsgFinalizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Finalize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgFinalizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgFinalizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Finalize"))
              .build();
        }
      }
    }
    return getFinalizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgActivateRequest,
      com.provenance.marker.v1.MsgActivateResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = com.provenance.marker.v1.MsgActivateRequest.class,
      responseType = com.provenance.marker.v1.MsgActivateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgActivateRequest,
      com.provenance.marker.v1.MsgActivateResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgActivateRequest, com.provenance.marker.v1.MsgActivateResponse> getActivateMethod;
    if ((getActivateMethod = MsgGrpc.getActivateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getActivateMethod = MsgGrpc.getActivateMethod) == null) {
          MsgGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgActivateRequest, com.provenance.marker.v1.MsgActivateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgActivateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgActivateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgCancelRequest,
      com.provenance.marker.v1.MsgCancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.provenance.marker.v1.MsgCancelRequest.class,
      responseType = com.provenance.marker.v1.MsgCancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgCancelRequest,
      com.provenance.marker.v1.MsgCancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgCancelRequest, com.provenance.marker.v1.MsgCancelResponse> getCancelMethod;
    if ((getCancelMethod = MsgGrpc.getCancelMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelMethod = MsgGrpc.getCancelMethod) == null) {
          MsgGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgCancelRequest, com.provenance.marker.v1.MsgCancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgCancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteRequest,
      com.provenance.marker.v1.MsgDeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.provenance.marker.v1.MsgDeleteRequest.class,
      responseType = com.provenance.marker.v1.MsgDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteRequest,
      com.provenance.marker.v1.MsgDeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteRequest, com.provenance.marker.v1.MsgDeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = MsgGrpc.getDeleteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteMethod = MsgGrpc.getDeleteMethod) == null) {
          MsgGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgDeleteRequest, com.provenance.marker.v1.MsgDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgMintRequest,
      com.provenance.marker.v1.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = com.provenance.marker.v1.MsgMintRequest.class,
      responseType = com.provenance.marker.v1.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgMintRequest,
      com.provenance.marker.v1.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgMintRequest, com.provenance.marker.v1.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgMintRequest, com.provenance.marker.v1.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
              .build();
        }
      }
    }
    return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgBurnRequest,
      com.provenance.marker.v1.MsgBurnResponse> getBurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Burn",
      requestType = com.provenance.marker.v1.MsgBurnRequest.class,
      responseType = com.provenance.marker.v1.MsgBurnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgBurnRequest,
      com.provenance.marker.v1.MsgBurnResponse> getBurnMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgBurnRequest, com.provenance.marker.v1.MsgBurnResponse> getBurnMethod;
    if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnMethod = MsgGrpc.getBurnMethod) == null) {
          MsgGrpc.getBurnMethod = getBurnMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgBurnRequest, com.provenance.marker.v1.MsgBurnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Burn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgBurnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgBurnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Burn"))
              .build();
        }
      }
    }
    return getBurnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddAccessRequest,
      com.provenance.marker.v1.MsgAddAccessResponse> getAddAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAccess",
      requestType = com.provenance.marker.v1.MsgAddAccessRequest.class,
      responseType = com.provenance.marker.v1.MsgAddAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddAccessRequest,
      com.provenance.marker.v1.MsgAddAccessResponse> getAddAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddAccessRequest, com.provenance.marker.v1.MsgAddAccessResponse> getAddAccessMethod;
    if ((getAddAccessMethod = MsgGrpc.getAddAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAccessMethod = MsgGrpc.getAddAccessMethod) == null) {
          MsgGrpc.getAddAccessMethod = getAddAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgAddAccessRequest, com.provenance.marker.v1.MsgAddAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAccess"))
              .build();
        }
      }
    }
    return getAddAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteAccessRequest,
      com.provenance.marker.v1.MsgDeleteAccessResponse> getDeleteAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccess",
      requestType = com.provenance.marker.v1.MsgDeleteAccessRequest.class,
      responseType = com.provenance.marker.v1.MsgDeleteAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteAccessRequest,
      com.provenance.marker.v1.MsgDeleteAccessResponse> getDeleteAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgDeleteAccessRequest, com.provenance.marker.v1.MsgDeleteAccessResponse> getDeleteAccessMethod;
    if ((getDeleteAccessMethod = MsgGrpc.getDeleteAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteAccessMethod = MsgGrpc.getDeleteAccessMethod) == null) {
          MsgGrpc.getDeleteAccessMethod = getDeleteAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgDeleteAccessRequest, com.provenance.marker.v1.MsgDeleteAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgDeleteAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgDeleteAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteAccess"))
              .build();
        }
      }
    }
    return getDeleteAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgWithdrawRequest,
      com.provenance.marker.v1.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.provenance.marker.v1.MsgWithdrawRequest.class,
      responseType = com.provenance.marker.v1.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgWithdrawRequest,
      com.provenance.marker.v1.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgWithdrawRequest, com.provenance.marker.v1.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgWithdrawRequest, com.provenance.marker.v1.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgWithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddMarkerRequest,
      com.provenance.marker.v1.MsgAddMarkerResponse> getAddMarkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMarker",
      requestType = com.provenance.marker.v1.MsgAddMarkerRequest.class,
      responseType = com.provenance.marker.v1.MsgAddMarkerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddMarkerRequest,
      com.provenance.marker.v1.MsgAddMarkerResponse> getAddMarkerMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddMarkerRequest, com.provenance.marker.v1.MsgAddMarkerResponse> getAddMarkerMethod;
    if ((getAddMarkerMethod = MsgGrpc.getAddMarkerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddMarkerMethod = MsgGrpc.getAddMarkerMethod) == null) {
          MsgGrpc.getAddMarkerMethod = getAddMarkerMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgAddMarkerRequest, com.provenance.marker.v1.MsgAddMarkerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMarker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddMarkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddMarkerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddMarker"))
              .build();
        }
      }
    }
    return getAddMarkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgTransferRequest,
      com.provenance.marker.v1.MsgTransferResponse> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transfer",
      requestType = com.provenance.marker.v1.MsgTransferRequest.class,
      responseType = com.provenance.marker.v1.MsgTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgTransferRequest,
      com.provenance.marker.v1.MsgTransferResponse> getTransferMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgTransferRequest, com.provenance.marker.v1.MsgTransferResponse> getTransferMethod;
    if ((getTransferMethod = MsgGrpc.getTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferMethod = MsgGrpc.getTransferMethod) == null) {
          MsgGrpc.getTransferMethod = getTransferMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgTransferRequest, com.provenance.marker.v1.MsgTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Transfer"))
              .build();
        }
      }
    }
    return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgIbcTransferRequest,
      com.provenance.marker.v1.MsgIbcTransferResponse> getIbcTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IbcTransfer",
      requestType = com.provenance.marker.v1.MsgIbcTransferRequest.class,
      responseType = com.provenance.marker.v1.MsgIbcTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgIbcTransferRequest,
      com.provenance.marker.v1.MsgIbcTransferResponse> getIbcTransferMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgIbcTransferRequest, com.provenance.marker.v1.MsgIbcTransferResponse> getIbcTransferMethod;
    if ((getIbcTransferMethod = MsgGrpc.getIbcTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIbcTransferMethod = MsgGrpc.getIbcTransferMethod) == null) {
          MsgGrpc.getIbcTransferMethod = getIbcTransferMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgIbcTransferRequest, com.provenance.marker.v1.MsgIbcTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IbcTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgIbcTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgIbcTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IbcTransfer"))
              .build();
        }
      }
    }
    return getIbcTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetDenomMetadataRequest,
      com.provenance.marker.v1.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDenomMetadata",
      requestType = com.provenance.marker.v1.MsgSetDenomMetadataRequest.class,
      responseType = com.provenance.marker.v1.MsgSetDenomMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetDenomMetadataRequest,
      com.provenance.marker.v1.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetDenomMetadataRequest, com.provenance.marker.v1.MsgSetDenomMetadataResponse> getSetDenomMetadataMethod;
    if ((getSetDenomMetadataMethod = MsgGrpc.getSetDenomMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetDenomMetadataMethod = MsgGrpc.getSetDenomMetadataMethod) == null) {
          MsgGrpc.getSetDenomMetadataMethod = getSetDenomMetadataMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgSetDenomMetadataRequest, com.provenance.marker.v1.MsgSetDenomMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDenomMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSetDenomMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSetDenomMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetDenomMetadata"))
              .build();
        }
      }
    }
    return getSetDenomMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgGrantAllowanceRequest,
      com.provenance.marker.v1.MsgGrantAllowanceResponse> getGrantAllowanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantAllowance",
      requestType = com.provenance.marker.v1.MsgGrantAllowanceRequest.class,
      responseType = com.provenance.marker.v1.MsgGrantAllowanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgGrantAllowanceRequest,
      com.provenance.marker.v1.MsgGrantAllowanceResponse> getGrantAllowanceMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgGrantAllowanceRequest, com.provenance.marker.v1.MsgGrantAllowanceResponse> getGrantAllowanceMethod;
    if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
          MsgGrpc.getGrantAllowanceMethod = getGrantAllowanceMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgGrantAllowanceRequest, com.provenance.marker.v1.MsgGrantAllowanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantAllowance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgGrantAllowanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgGrantAllowanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GrantAllowance"))
              .build();
        }
      }
    }
    return getGrantAllowanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest,
      com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> getAddFinalizeActivateMarkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFinalizeActivateMarker",
      requestType = com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest.class,
      responseType = com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest,
      com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> getAddFinalizeActivateMarkerMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest, com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> getAddFinalizeActivateMarkerMethod;
    if ((getAddFinalizeActivateMarkerMethod = MsgGrpc.getAddFinalizeActivateMarkerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddFinalizeActivateMarkerMethod = MsgGrpc.getAddFinalizeActivateMarkerMethod) == null) {
          MsgGrpc.getAddFinalizeActivateMarkerMethod = getAddFinalizeActivateMarkerMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest, com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFinalizeActivateMarker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddFinalizeActivateMarker"))
              .build();
        }
      }
    }
    return getAddFinalizeActivateMarkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest,
      com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> getSupplyIncreaseProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyIncreaseProposal",
      requestType = com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest.class,
      responseType = com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest,
      com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> getSupplyIncreaseProposalMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest, com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> getSupplyIncreaseProposalMethod;
    if ((getSupplyIncreaseProposalMethod = MsgGrpc.getSupplyIncreaseProposalMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSupplyIncreaseProposalMethod = MsgGrpc.getSupplyIncreaseProposalMethod) == null) {
          MsgGrpc.getSupplyIncreaseProposalMethod = getSupplyIncreaseProposalMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest, com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupplyIncreaseProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SupplyIncreaseProposal"))
              .build();
        }
      }
    }
    return getSupplyIncreaseProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest,
      com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> getUpdateRequiredAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRequiredAttributes",
      requestType = com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest.class,
      responseType = com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest,
      com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> getUpdateRequiredAttributesMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest, com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> getUpdateRequiredAttributesMethod;
    if ((getUpdateRequiredAttributesMethod = MsgGrpc.getUpdateRequiredAttributesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRequiredAttributesMethod = MsgGrpc.getUpdateRequiredAttributesMethod) == null) {
          MsgGrpc.getUpdateRequiredAttributesMethod = getUpdateRequiredAttributesMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest, com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRequiredAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRequiredAttributes"))
              .build();
        }
      }
    }
    return getUpdateRequiredAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateForcedTransferRequest,
      com.provenance.marker.v1.MsgUpdateForcedTransferResponse> getUpdateForcedTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateForcedTransfer",
      requestType = com.provenance.marker.v1.MsgUpdateForcedTransferRequest.class,
      responseType = com.provenance.marker.v1.MsgUpdateForcedTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateForcedTransferRequest,
      com.provenance.marker.v1.MsgUpdateForcedTransferResponse> getUpdateForcedTransferMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgUpdateForcedTransferRequest, com.provenance.marker.v1.MsgUpdateForcedTransferResponse> getUpdateForcedTransferMethod;
    if ((getUpdateForcedTransferMethod = MsgGrpc.getUpdateForcedTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateForcedTransferMethod = MsgGrpc.getUpdateForcedTransferMethod) == null) {
          MsgGrpc.getUpdateForcedTransferMethod = getUpdateForcedTransferMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgUpdateForcedTransferRequest, com.provenance.marker.v1.MsgUpdateForcedTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateForcedTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgUpdateForcedTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgUpdateForcedTransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateForcedTransfer"))
              .build();
        }
      }
    }
    return getUpdateForcedTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetAccountDataRequest,
      com.provenance.marker.v1.MsgSetAccountDataResponse> getSetAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountData",
      requestType = com.provenance.marker.v1.MsgSetAccountDataRequest.class,
      responseType = com.provenance.marker.v1.MsgSetAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetAccountDataRequest,
      com.provenance.marker.v1.MsgSetAccountDataResponse> getSetAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.MsgSetAccountDataRequest, com.provenance.marker.v1.MsgSetAccountDataResponse> getSetAccountDataMethod;
    if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
          MsgGrpc.getSetAccountDataMethod = getSetAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.MsgSetAccountDataRequest, com.provenance.marker.v1.MsgSetAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSetAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.MsgSetAccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAccountData"))
              .build();
        }
      }
    }
    return getSetAccountDataMethod;
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
   * Msg defines the Marker Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Finalize
     * </pre>
     */
    default void finalize(com.provenance.marker.v1.MsgFinalizeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgFinalizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate
     * </pre>
     */
    default void activate(com.provenance.marker.v1.MsgActivateRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgActivateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    default void cancel(com.provenance.marker.v1.MsgCancelRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete
     * </pre>
     */
    default void delete(com.provenance.marker.v1.MsgDeleteRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mint
     * </pre>
     */
    default void mint(com.provenance.marker.v1.MsgMintRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Burn
     * </pre>
     */
    default void burn(com.provenance.marker.v1.MsgBurnRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddAccess
     * </pre>
     */
    default void addAccess(com.provenance.marker.v1.MsgAddAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAccess
     * </pre>
     */
    default void deleteAccess(com.provenance.marker.v1.MsgDeleteAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw
     * </pre>
     */
    default void withdraw(com.provenance.marker.v1.MsgWithdrawRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddMarker
     * </pre>
     */
    default void addMarker(com.provenance.marker.v1.MsgAddMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddMarkerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMarkerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer marker denominated coin between accounts
     * </pre>
     */
    default void transfer(com.provenance.marker.v1.MsgTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Transfer over ibc any marker(including restricted markers) between ibc accounts.
     * The relayer is still needed to accomplish ibc middleware relays.
     * </pre>
     */
    default void ibcTransfer(com.provenance.marker.v1.MsgIbcTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgIbcTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIbcTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allows Denom Metadata (see bank module) to be set for the Marker's Denom
     * </pre>
     */
    default void setDenomMetadata(com.provenance.marker.v1.MsgSetDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDenomMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    default void grantAllowance(com.provenance.marker.v1.MsgGrantAllowanceRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantAllowanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddFinalizeActivateMarker
     * </pre>
     */
    default void addFinalizeActivateMarker(com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFinalizeActivateMarkerMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupplyIncreaseProposal can only be called via gov proposal
     * </pre>
     */
    default void supplyIncreaseProposal(com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyIncreaseProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRequiredAttributes will only succeed if signer has transfer authority
     * </pre>
     */
    default void updateRequiredAttributes(com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRequiredAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateForcedTransfer updates the allow_forced_transfer field of a marker via governance proposal.
     * </pre>
     */
    default void updateForcedTransfer(com.provenance.marker.v1.MsgUpdateForcedTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateForcedTransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateForcedTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAccountData sets the accountdata for a denom. Signer must have deposit authority.
     * </pre>
     */
    default void setAccountData(com.provenance.marker.v1.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Marker Msg service.
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
   * Msg defines the Marker Msg service.
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
     * Finalize
     * </pre>
     */
    public void finalize(com.provenance.marker.v1.MsgFinalizeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgFinalizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate
     * </pre>
     */
    public void activate(com.provenance.marker.v1.MsgActivateRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgActivateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public void cancel(com.provenance.marker.v1.MsgCancelRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete
     * </pre>
     */
    public void delete(com.provenance.marker.v1.MsgDeleteRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mint
     * </pre>
     */
    public void mint(com.provenance.marker.v1.MsgMintRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Burn
     * </pre>
     */
    public void burn(com.provenance.marker.v1.MsgBurnRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgBurnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddAccess
     * </pre>
     */
    public void addAccess(com.provenance.marker.v1.MsgAddAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAccess
     * </pre>
     */
    public void deleteAccess(com.provenance.marker.v1.MsgDeleteAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw
     * </pre>
     */
    public void withdraw(com.provenance.marker.v1.MsgWithdrawRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddMarker
     * </pre>
     */
    public void addMarker(com.provenance.marker.v1.MsgAddMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddMarkerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMarkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer marker denominated coin between accounts
     * </pre>
     */
    public void transfer(com.provenance.marker.v1.MsgTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Transfer over ibc any marker(including restricted markers) between ibc accounts.
     * The relayer is still needed to accomplish ibc middleware relays.
     * </pre>
     */
    public void ibcTransfer(com.provenance.marker.v1.MsgIbcTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgIbcTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIbcTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allows Denom Metadata (see bank module) to be set for the Marker's Denom
     * </pre>
     */
    public void setDenomMetadata(com.provenance.marker.v1.MsgSetDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDenomMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public void grantAllowance(com.provenance.marker.v1.MsgGrantAllowanceRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddFinalizeActivateMarker
     * </pre>
     */
    public void addFinalizeActivateMarker(com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFinalizeActivateMarkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupplyIncreaseProposal can only be called via gov proposal
     * </pre>
     */
    public void supplyIncreaseProposal(com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyIncreaseProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRequiredAttributes will only succeed if signer has transfer authority
     * </pre>
     */
    public void updateRequiredAttributes(com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRequiredAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateForcedTransfer updates the allow_forced_transfer field of a marker via governance proposal.
     * </pre>
     */
    public void updateForcedTransfer(com.provenance.marker.v1.MsgUpdateForcedTransferRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateForcedTransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateForcedTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAccountData sets the accountdata for a denom. Signer must have deposit authority.
     * </pre>
     */
    public void setAccountData(com.provenance.marker.v1.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Marker Msg service.
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
     * Finalize
     * </pre>
     */
    public com.provenance.marker.v1.MsgFinalizeResponse finalize(com.provenance.marker.v1.MsgFinalizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate
     * </pre>
     */
    public com.provenance.marker.v1.MsgActivateResponse activate(com.provenance.marker.v1.MsgActivateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.provenance.marker.v1.MsgCancelResponse cancel(com.provenance.marker.v1.MsgCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete
     * </pre>
     */
    public com.provenance.marker.v1.MsgDeleteResponse delete(com.provenance.marker.v1.MsgDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mint
     * </pre>
     */
    public com.provenance.marker.v1.MsgMintResponse mint(com.provenance.marker.v1.MsgMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Burn
     * </pre>
     */
    public com.provenance.marker.v1.MsgBurnResponse burn(com.provenance.marker.v1.MsgBurnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddAccess
     * </pre>
     */
    public com.provenance.marker.v1.MsgAddAccessResponse addAccess(com.provenance.marker.v1.MsgAddAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAccess
     * </pre>
     */
    public com.provenance.marker.v1.MsgDeleteAccessResponse deleteAccess(com.provenance.marker.v1.MsgDeleteAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw
     * </pre>
     */
    public com.provenance.marker.v1.MsgWithdrawResponse withdraw(com.provenance.marker.v1.MsgWithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddMarker
     * </pre>
     */
    public com.provenance.marker.v1.MsgAddMarkerResponse addMarker(com.provenance.marker.v1.MsgAddMarkerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMarkerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer marker denominated coin between accounts
     * </pre>
     */
    public com.provenance.marker.v1.MsgTransferResponse transfer(com.provenance.marker.v1.MsgTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Transfer over ibc any marker(including restricted markers) between ibc accounts.
     * The relayer is still needed to accomplish ibc middleware relays.
     * </pre>
     */
    public com.provenance.marker.v1.MsgIbcTransferResponse ibcTransfer(com.provenance.marker.v1.MsgIbcTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIbcTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allows Denom Metadata (see bank module) to be set for the Marker's Denom
     * </pre>
     */
    public com.provenance.marker.v1.MsgSetDenomMetadataResponse setDenomMetadata(com.provenance.marker.v1.MsgSetDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDenomMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public com.provenance.marker.v1.MsgGrantAllowanceResponse grantAllowance(com.provenance.marker.v1.MsgGrantAllowanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantAllowanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddFinalizeActivateMarker
     * </pre>
     */
    public com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse addFinalizeActivateMarker(com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFinalizeActivateMarkerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupplyIncreaseProposal can only be called via gov proposal
     * </pre>
     */
    public com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse supplyIncreaseProposal(com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyIncreaseProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRequiredAttributes will only succeed if signer has transfer authority
     * </pre>
     */
    public com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse updateRequiredAttributes(com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRequiredAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateForcedTransfer updates the allow_forced_transfer field of a marker via governance proposal.
     * </pre>
     */
    public com.provenance.marker.v1.MsgUpdateForcedTransferResponse updateForcedTransfer(com.provenance.marker.v1.MsgUpdateForcedTransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateForcedTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAccountData sets the accountdata for a denom. Signer must have deposit authority.
     * </pre>
     */
    public com.provenance.marker.v1.MsgSetAccountDataResponse setAccountData(com.provenance.marker.v1.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Marker Msg service.
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
     * Finalize
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgFinalizeResponse> finalize(
        com.provenance.marker.v1.MsgFinalizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgActivateResponse> activate(
        com.provenance.marker.v1.MsgActivateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgCancelResponse> cancel(
        com.provenance.marker.v1.MsgCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgDeleteResponse> delete(
        com.provenance.marker.v1.MsgDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgMintResponse> mint(
        com.provenance.marker.v1.MsgMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Burn
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgBurnResponse> burn(
        com.provenance.marker.v1.MsgBurnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddAccess
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgAddAccessResponse> addAccess(
        com.provenance.marker.v1.MsgAddAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAccess
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgDeleteAccessResponse> deleteAccess(
        com.provenance.marker.v1.MsgDeleteAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgWithdrawResponse> withdraw(
        com.provenance.marker.v1.MsgWithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddMarker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgAddMarkerResponse> addMarker(
        com.provenance.marker.v1.MsgAddMarkerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMarkerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer marker denominated coin between accounts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgTransferResponse> transfer(
        com.provenance.marker.v1.MsgTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Transfer over ibc any marker(including restricted markers) between ibc accounts.
     * The relayer is still needed to accomplish ibc middleware relays.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgIbcTransferResponse> ibcTransfer(
        com.provenance.marker.v1.MsgIbcTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIbcTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Allows Denom Metadata (see bank module) to be set for the Marker's Denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgSetDenomMetadataResponse> setDenomMetadata(
        com.provenance.marker.v1.MsgSetDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDenomMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GrantAllowance grants fee allowance to the grantee on the granter's
     * account with the provided expiration time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgGrantAllowanceResponse> grantAllowance(
        com.provenance.marker.v1.MsgGrantAllowanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddFinalizeActivateMarker
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse> addFinalizeActivateMarker(
        com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFinalizeActivateMarkerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupplyIncreaseProposal can only be called via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse> supplyIncreaseProposal(
        com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyIncreaseProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRequiredAttributes will only succeed if signer has transfer authority
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse> updateRequiredAttributes(
        com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRequiredAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateForcedTransfer updates the allow_forced_transfer field of a marker via governance proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgUpdateForcedTransferResponse> updateForcedTransfer(
        com.provenance.marker.v1.MsgUpdateForcedTransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateForcedTransferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAccountData sets the accountdata for a denom. Signer must have deposit authority.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.MsgSetAccountDataResponse> setAccountData(
        com.provenance.marker.v1.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FINALIZE = 0;
  private static final int METHODID_ACTIVATE = 1;
  private static final int METHODID_CANCEL = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_MINT = 4;
  private static final int METHODID_BURN = 5;
  private static final int METHODID_ADD_ACCESS = 6;
  private static final int METHODID_DELETE_ACCESS = 7;
  private static final int METHODID_WITHDRAW = 8;
  private static final int METHODID_ADD_MARKER = 9;
  private static final int METHODID_TRANSFER = 10;
  private static final int METHODID_IBC_TRANSFER = 11;
  private static final int METHODID_SET_DENOM_METADATA = 12;
  private static final int METHODID_GRANT_ALLOWANCE = 13;
  private static final int METHODID_ADD_FINALIZE_ACTIVATE_MARKER = 14;
  private static final int METHODID_SUPPLY_INCREASE_PROPOSAL = 15;
  private static final int METHODID_UPDATE_REQUIRED_ATTRIBUTES = 16;
  private static final int METHODID_UPDATE_FORCED_TRANSFER = 17;
  private static final int METHODID_SET_ACCOUNT_DATA = 18;

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
        case METHODID_FINALIZE:
          serviceImpl.finalize((com.provenance.marker.v1.MsgFinalizeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgFinalizeResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((com.provenance.marker.v1.MsgActivateRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgActivateResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.provenance.marker.v1.MsgCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgCancelResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.provenance.marker.v1.MsgDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteResponse>) responseObserver);
          break;
        case METHODID_MINT:
          serviceImpl.mint((com.provenance.marker.v1.MsgMintRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgMintResponse>) responseObserver);
          break;
        case METHODID_BURN:
          serviceImpl.burn((com.provenance.marker.v1.MsgBurnRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgBurnResponse>) responseObserver);
          break;
        case METHODID_ADD_ACCESS:
          serviceImpl.addAccess((com.provenance.marker.v1.MsgAddAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddAccessResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS:
          serviceImpl.deleteAccess((com.provenance.marker.v1.MsgDeleteAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgDeleteAccessResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.provenance.marker.v1.MsgWithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_MARKER:
          serviceImpl.addMarker((com.provenance.marker.v1.MsgAddMarkerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddMarkerResponse>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((com.provenance.marker.v1.MsgTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgTransferResponse>) responseObserver);
          break;
        case METHODID_IBC_TRANSFER:
          serviceImpl.ibcTransfer((com.provenance.marker.v1.MsgIbcTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgIbcTransferResponse>) responseObserver);
          break;
        case METHODID_SET_DENOM_METADATA:
          serviceImpl.setDenomMetadata((com.provenance.marker.v1.MsgSetDenomMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetDenomMetadataResponse>) responseObserver);
          break;
        case METHODID_GRANT_ALLOWANCE:
          serviceImpl.grantAllowance((com.provenance.marker.v1.MsgGrantAllowanceRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgGrantAllowanceResponse>) responseObserver);
          break;
        case METHODID_ADD_FINALIZE_ACTIVATE_MARKER:
          serviceImpl.addFinalizeActivateMarker((com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse>) responseObserver);
          break;
        case METHODID_SUPPLY_INCREASE_PROPOSAL:
          serviceImpl.supplyIncreaseProposal((com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REQUIRED_ATTRIBUTES:
          serviceImpl.updateRequiredAttributes((com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FORCED_TRANSFER:
          serviceImpl.updateForcedTransfer((com.provenance.marker.v1.MsgUpdateForcedTransferRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgUpdateForcedTransferResponse>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_DATA:
          serviceImpl.setAccountData((com.provenance.marker.v1.MsgSetAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.MsgSetAccountDataResponse>) responseObserver);
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
          getFinalizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgFinalizeRequest,
              com.provenance.marker.v1.MsgFinalizeResponse>(
                service, METHODID_FINALIZE)))
        .addMethod(
          getActivateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgActivateRequest,
              com.provenance.marker.v1.MsgActivateResponse>(
                service, METHODID_ACTIVATE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgCancelRequest,
              com.provenance.marker.v1.MsgCancelResponse>(
                service, METHODID_CANCEL)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgDeleteRequest,
              com.provenance.marker.v1.MsgDeleteResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgMintRequest,
              com.provenance.marker.v1.MsgMintResponse>(
                service, METHODID_MINT)))
        .addMethod(
          getBurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgBurnRequest,
              com.provenance.marker.v1.MsgBurnResponse>(
                service, METHODID_BURN)))
        .addMethod(
          getAddAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgAddAccessRequest,
              com.provenance.marker.v1.MsgAddAccessResponse>(
                service, METHODID_ADD_ACCESS)))
        .addMethod(
          getDeleteAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgDeleteAccessRequest,
              com.provenance.marker.v1.MsgDeleteAccessResponse>(
                service, METHODID_DELETE_ACCESS)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgWithdrawRequest,
              com.provenance.marker.v1.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getAddMarkerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgAddMarkerRequest,
              com.provenance.marker.v1.MsgAddMarkerResponse>(
                service, METHODID_ADD_MARKER)))
        .addMethod(
          getTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgTransferRequest,
              com.provenance.marker.v1.MsgTransferResponse>(
                service, METHODID_TRANSFER)))
        .addMethod(
          getIbcTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgIbcTransferRequest,
              com.provenance.marker.v1.MsgIbcTransferResponse>(
                service, METHODID_IBC_TRANSFER)))
        .addMethod(
          getSetDenomMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgSetDenomMetadataRequest,
              com.provenance.marker.v1.MsgSetDenomMetadataResponse>(
                service, METHODID_SET_DENOM_METADATA)))
        .addMethod(
          getGrantAllowanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgGrantAllowanceRequest,
              com.provenance.marker.v1.MsgGrantAllowanceResponse>(
                service, METHODID_GRANT_ALLOWANCE)))
        .addMethod(
          getAddFinalizeActivateMarkerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgAddFinalizeActivateMarkerRequest,
              com.provenance.marker.v1.MsgAddFinalizeActivateMarkerResponse>(
                service, METHODID_ADD_FINALIZE_ACTIVATE_MARKER)))
        .addMethod(
          getSupplyIncreaseProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgSupplyIncreaseProposalRequest,
              com.provenance.marker.v1.MsgSupplyIncreaseProposalResponse>(
                service, METHODID_SUPPLY_INCREASE_PROPOSAL)))
        .addMethod(
          getUpdateRequiredAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgUpdateRequiredAttributesRequest,
              com.provenance.marker.v1.MsgUpdateRequiredAttributesResponse>(
                service, METHODID_UPDATE_REQUIRED_ATTRIBUTES)))
        .addMethod(
          getUpdateForcedTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgUpdateForcedTransferRequest,
              com.provenance.marker.v1.MsgUpdateForcedTransferResponse>(
                service, METHODID_UPDATE_FORCED_TRANSFER)))
        .addMethod(
          getSetAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.MsgSetAccountDataRequest,
              com.provenance.marker.v1.MsgSetAccountDataResponse>(
                service, METHODID_SET_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.marker.v1.TxProto.getDescriptor();
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
              .addMethod(getFinalizeMethod())
              .addMethod(getActivateMethod())
              .addMethod(getCancelMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getMintMethod())
              .addMethod(getBurnMethod())
              .addMethod(getAddAccessMethod())
              .addMethod(getDeleteAccessMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getAddMarkerMethod())
              .addMethod(getTransferMethod())
              .addMethod(getIbcTransferMethod())
              .addMethod(getSetDenomMetadataMethod())
              .addMethod(getGrantAllowanceMethod())
              .addMethod(getAddFinalizeActivateMarkerMethod())
              .addMethod(getSupplyIncreaseProposalMethod())
              .addMethod(getUpdateRequiredAttributesMethod())
              .addMethod(getUpdateForcedTransferMethod())
              .addMethod(getSetAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
