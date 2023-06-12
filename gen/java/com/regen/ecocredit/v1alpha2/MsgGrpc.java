package com.regen.ecocredit.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the regen.ecocredit.v1alpha1 Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/ecocredit/v1alpha2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "regen.ecocredit.v1alpha2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateClass,
      com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> getCreateClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClass",
      requestType = com.regen.ecocredit.v1alpha2.MsgCreateClass.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgCreateClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateClass,
      com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> getCreateClassMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateClass, com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> getCreateClassMethod;
    if ((getCreateClassMethod = MsgGrpc.getCreateClassMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateClassMethod = MsgGrpc.getCreateClassMethod) == null) {
          MsgGrpc.getCreateClassMethod = getCreateClassMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgCreateClass, com.regen.ecocredit.v1alpha2.MsgCreateClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateClass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateClass"))
              .build();
        }
      }
    }
    return getCreateClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateProject,
      com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.regen.ecocredit.v1alpha2.MsgCreateProject.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateProject,
      com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateProject, com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> getCreateProjectMethod;
    if ((getCreateProjectMethod = MsgGrpc.getCreateProjectMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateProjectMethod = MsgGrpc.getCreateProjectMethod) == null) {
          MsgGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgCreateProject, com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateProject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBatch,
      com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> getCreateBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBatch",
      requestType = com.regen.ecocredit.v1alpha2.MsgCreateBatch.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBatch,
      com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> getCreateBatchMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBatch, com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> getCreateBatchMethod;
    if ((getCreateBatchMethod = MsgGrpc.getCreateBatchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBatchMethod = MsgGrpc.getCreateBatchMethod) == null) {
          MsgGrpc.getCreateBatchMethod = getCreateBatchMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgCreateBatch, com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBatch"))
              .build();
        }
      }
    }
    return getCreateBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSend,
      com.regen.ecocredit.v1alpha2.MsgSendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = com.regen.ecocredit.v1alpha2.MsgSend.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSend,
      com.regen.ecocredit.v1alpha2.MsgSendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSend, com.regen.ecocredit.v1alpha2.MsgSendResponse> getSendMethod;
    if ((getSendMethod = MsgGrpc.getSendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSendMethod = MsgGrpc.getSendMethod) == null) {
          MsgGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgSend, com.regen.ecocredit.v1alpha2.MsgSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgSend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgSendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgRetire,
      com.regen.ecocredit.v1alpha2.MsgRetireResponse> getRetireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retire",
      requestType = com.regen.ecocredit.v1alpha2.MsgRetire.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgRetireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgRetire,
      com.regen.ecocredit.v1alpha2.MsgRetireResponse> getRetireMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgRetire, com.regen.ecocredit.v1alpha2.MsgRetireResponse> getRetireMethod;
    if ((getRetireMethod = MsgGrpc.getRetireMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRetireMethod = MsgGrpc.getRetireMethod) == null) {
          MsgGrpc.getRetireMethod = getRetireMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgRetire, com.regen.ecocredit.v1alpha2.MsgRetireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgRetire.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgRetireResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Retire"))
              .build();
        }
      }
    }
    return getRetireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCancel,
      com.regen.ecocredit.v1alpha2.MsgCancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.regen.ecocredit.v1alpha2.MsgCancel.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgCancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCancel,
      com.regen.ecocredit.v1alpha2.MsgCancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCancel, com.regen.ecocredit.v1alpha2.MsgCancelResponse> getCancelMethod;
    if ((getCancelMethod = MsgGrpc.getCancelMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelMethod = MsgGrpc.getCancelMethod) == null) {
          MsgGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgCancel, com.regen.ecocredit.v1alpha2.MsgCancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCancel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCancelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> getUpdateClassAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClassAdmin",
      requestType = com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> getUpdateClassAdminMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin, com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> getUpdateClassAdminMethod;
    if ((getUpdateClassAdminMethod = MsgGrpc.getUpdateClassAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateClassAdminMethod = MsgGrpc.getUpdateClassAdminMethod) == null) {
          MsgGrpc.getUpdateClassAdminMethod = getUpdateClassAdminMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin, com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClassAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateClassAdmin"))
              .build();
        }
      }
    }
    return getUpdateClassAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> getUpdateClassIssuersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClassIssuers",
      requestType = com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> getUpdateClassIssuersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers, com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> getUpdateClassIssuersMethod;
    if ((getUpdateClassIssuersMethod = MsgGrpc.getUpdateClassIssuersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateClassIssuersMethod = MsgGrpc.getUpdateClassIssuersMethod) == null) {
          MsgGrpc.getUpdateClassIssuersMethod = getUpdateClassIssuersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers, com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClassIssuers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateClassIssuers"))
              .build();
        }
      }
    }
    return getUpdateClassIssuersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> getUpdateClassMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClassMetadata",
      requestType = com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata,
      com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> getUpdateClassMetadataMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata, com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> getUpdateClassMetadataMethod;
    if ((getUpdateClassMetadataMethod = MsgGrpc.getUpdateClassMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateClassMetadataMethod = MsgGrpc.getUpdateClassMetadataMethod) == null) {
          MsgGrpc.getUpdateClassMetadataMethod = getUpdateClassMetadataMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata, com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClassMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateClassMetadata"))
              .build();
        }
      }
    }
    return getUpdateClassMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSell,
      com.regen.ecocredit.v1alpha2.MsgSellResponse> getSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sell",
      requestType = com.regen.ecocredit.v1alpha2.MsgSell.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgSellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSell,
      com.regen.ecocredit.v1alpha2.MsgSellResponse> getSellMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgSell, com.regen.ecocredit.v1alpha2.MsgSellResponse> getSellMethod;
    if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
          MsgGrpc.getSellMethod = getSellMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgSell, com.regen.ecocredit.v1alpha2.MsgSellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgSell.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgSellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Sell"))
              .build();
        }
      }
    }
    return getSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders,
      com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> getUpdateSellOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSellOrders",
      requestType = com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders,
      com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> getUpdateSellOrdersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders, com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> getUpdateSellOrdersMethod;
    if ((getUpdateSellOrdersMethod = MsgGrpc.getUpdateSellOrdersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateSellOrdersMethod = MsgGrpc.getUpdateSellOrdersMethod) == null) {
          MsgGrpc.getUpdateSellOrdersMethod = getUpdateSellOrdersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders, com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSellOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateSellOrders"))
              .build();
        }
      }
    }
    return getUpdateSellOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgBuy,
      com.regen.ecocredit.v1alpha2.MsgBuyResponse> getBuyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Buy",
      requestType = com.regen.ecocredit.v1alpha2.MsgBuy.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgBuyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgBuy,
      com.regen.ecocredit.v1alpha2.MsgBuyResponse> getBuyMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgBuy, com.regen.ecocredit.v1alpha2.MsgBuyResponse> getBuyMethod;
    if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
          MsgGrpc.getBuyMethod = getBuyMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgBuy, com.regen.ecocredit.v1alpha2.MsgBuyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Buy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgBuy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgBuyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Buy"))
              .build();
        }
      }
    }
    return getBuyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAllowAskDenom,
      com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> getAllowAskDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllowAskDenom",
      requestType = com.regen.ecocredit.v1alpha2.MsgAllowAskDenom.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAllowAskDenom,
      com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> getAllowAskDenomMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAllowAskDenom, com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> getAllowAskDenomMethod;
    if ((getAllowAskDenomMethod = MsgGrpc.getAllowAskDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAllowAskDenomMethod = MsgGrpc.getAllowAskDenomMethod) == null) {
          MsgGrpc.getAllowAskDenomMethod = getAllowAskDenomMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgAllowAskDenom, com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllowAskDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgAllowAskDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AllowAskDenom"))
              .build();
        }
      }
    }
    return getAllowAskDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBasket,
      com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> getCreateBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBasket",
      requestType = com.regen.ecocredit.v1alpha2.MsgCreateBasket.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBasket,
      com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> getCreateBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgCreateBasket, com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> getCreateBasketMethod;
    if ((getCreateBasketMethod = MsgGrpc.getCreateBasketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBasketMethod = MsgGrpc.getCreateBasketMethod) == null) {
          MsgGrpc.getCreateBasketMethod = getCreateBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgCreateBasket, com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBasket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateBasket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBasket"))
              .build();
        }
      }
    }
    return getCreateBasketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAddToBasket,
      com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> getAddToBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToBasket",
      requestType = com.regen.ecocredit.v1alpha2.MsgAddToBasket.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAddToBasket,
      com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> getAddToBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgAddToBasket, com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> getAddToBasketMethod;
    if ((getAddToBasketMethod = MsgGrpc.getAddToBasketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddToBasketMethod = MsgGrpc.getAddToBasketMethod) == null) {
          MsgGrpc.getAddToBasketMethod = getAddToBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgAddToBasket, com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToBasket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgAddToBasket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddToBasket"))
              .build();
        }
      }
    }
    return getAddToBasketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgTakeFromBasket,
      com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> getTakeFromBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakeFromBasket",
      requestType = com.regen.ecocredit.v1alpha2.MsgTakeFromBasket.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgTakeFromBasket,
      com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> getTakeFromBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgTakeFromBasket, com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> getTakeFromBasketMethod;
    if ((getTakeFromBasketMethod = MsgGrpc.getTakeFromBasketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTakeFromBasketMethod = MsgGrpc.getTakeFromBasketMethod) == null) {
          MsgGrpc.getTakeFromBasketMethod = getTakeFromBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgTakeFromBasket, com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakeFromBasket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgTakeFromBasket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TakeFromBasket"))
              .build();
        }
      }
    }
    return getTakeFromBasketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgPickFromBasket,
      com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> getPickFromBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PickFromBasket",
      requestType = com.regen.ecocredit.v1alpha2.MsgPickFromBasket.class,
      responseType = com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgPickFromBasket,
      com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> getPickFromBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.MsgPickFromBasket, com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> getPickFromBasketMethod;
    if ((getPickFromBasketMethod = MsgGrpc.getPickFromBasketMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPickFromBasketMethod = MsgGrpc.getPickFromBasketMethod) == null) {
          MsgGrpc.getPickFromBasketMethod = getPickFromBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.MsgPickFromBasket, com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PickFromBasket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgPickFromBasket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PickFromBasket"))
              .build();
        }
      }
    }
    return getPickFromBasketMethod;
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
   * Msg is the regen.ecocredit.v1alpha1 Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateClass creates a new credit class with an approved list of issuers and
     * optional metadata.
     * </pre>
     */
    default void createClass(com.regen.ecocredit.v1alpha2.MsgCreateClass request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateProject creates a new project within a credit class.
     * </pre>
     */
    default void createProject(com.regen.ecocredit.v1alpha2.MsgCreateProject request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateBatch creates a new batch of credits for an existing project.
     * This will create a new batch denom with a fixed supply. Issued credits can
     * be distributed to recipients in either tradable or retired form.
     * </pre>
     */
    default void createBatch(com.regen.ecocredit.v1alpha2.MsgCreateBatch request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send sends tradable credits from one account to another account. Sent
     * credits can either be tradable or retired on receipt.
     * </pre>
     */
    default void send(com.regen.ecocredit.v1alpha2.MsgSend request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retire retires a specified number of credits in the holder's account.
     * </pre>
     */
    default void retire(com.regen.ecocredit.v1alpha2.MsgRetire request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgRetireResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetireMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel removes a number of credits from the holder's account and also
     * deducts them from the tradable supply, effectively cancelling their
     * issuance on Regen Ledger
     * </pre>
     */
    default void cancel(com.regen.ecocredit.v1alpha2.MsgCancel request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateClassAdmin updates the credit class admin
     * </pre>
     */
    default void updateClassAdmin(com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClassAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateClassIssuers updates the credit class issuer list
     * </pre>
     */
    default void updateClassIssuers(com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClassIssuersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateClassMetadata updates the credit class metadata
     * </pre>
     */
    default void updateClassMetadata(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClassMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sell creates new sell orders.
     * </pre>
     */
    default void sell(com.regen.ecocredit.v1alpha2.MsgSell request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSellResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSellOrders updates existing sell orders.
     * </pre>
     */
    default void updateSellOrders(com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSellOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Buy creates credit buy orders.
     * </pre>
     */
    default void buy(com.regen.ecocredit.v1alpha2.MsgBuy request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgBuyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllowAskDenom is a governance operation which authorizes a new ask denom to be used in sell orders
     * </pre>
     */
    default void allowAskDenom(com.regen.ecocredit.v1alpha2.MsgAllowAskDenom request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllowAskDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateBasket creates a bank denom which wraps credits.
     * </pre>
     */
    default void createBasket(com.regen.ecocredit.v1alpha2.MsgCreateBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBasketMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddToBasket adds credits to a basket in return for basket tokens.
     * </pre>
     */
    default void addToBasket(com.regen.ecocredit.v1alpha2.MsgAddToBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToBasketMethod(), responseObserver);
    }

    /**
     * <pre>
     * TakeFromBasket takes credits from a basket without regard for which
     * credits they are. The credits will be auto-retired if disable_auto_retire
     * is false. Credits will be chosen randomly using the previous block hash
     * as a consensus source of randomness.
     * More concretely, the implementation is as follows:
     * - take the previous block hash and convert it into an uint64,
     * - given the total number of different credits within the basket `n`, the
     *   first credits that will get picked correspond to: hash modulo n (in
     *   terms of order),
     * - then if we need to take more credits, we get some from the next one and
     *   so on.
     * </pre>
     */
    default void takeFromBasket(com.regen.ecocredit.v1alpha2.MsgTakeFromBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeFromBasketMethod(), responseObserver);
    }

    /**
     * <pre>
     * PickFromBasket picks specific credits from a basket. If allow_picking is
     * set to false, then only an address which deposited credits in the basket
     * can pick those credits. All other addresses will be blocked from picking
     * those credits. The credits will be auto-retired if disable_auto_retire is
     * false unless the credits were previously put into the basket by the
     * address picking them from the basket, in which case they will remain
     * tradable. This functionality allows the owner of a credit to have more
     * control over the credits they are putting in baskets then ordinary users
     * to deal with the scenario where basket tokens end up being worth
     * significantly less than the credits on their own.
     * </pre>
     */
    default void pickFromBasket(com.regen.ecocredit.v1alpha2.MsgPickFromBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPickFromBasketMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha1 Msg service.
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
   * Msg is the regen.ecocredit.v1alpha1 Msg service.
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
     * CreateClass creates a new credit class with an approved list of issuers and
     * optional metadata.
     * </pre>
     */
    public void createClass(com.regen.ecocredit.v1alpha2.MsgCreateClass request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateProject creates a new project within a credit class.
     * </pre>
     */
    public void createProject(com.regen.ecocredit.v1alpha2.MsgCreateProject request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateBatch creates a new batch of credits for an existing project.
     * This will create a new batch denom with a fixed supply. Issued credits can
     * be distributed to recipients in either tradable or retired form.
     * </pre>
     */
    public void createBatch(com.regen.ecocredit.v1alpha2.MsgCreateBatch request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send sends tradable credits from one account to another account. Sent
     * credits can either be tradable or retired on receipt.
     * </pre>
     */
    public void send(com.regen.ecocredit.v1alpha2.MsgSend request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retire retires a specified number of credits in the holder's account.
     * </pre>
     */
    public void retire(com.regen.ecocredit.v1alpha2.MsgRetire request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgRetireResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel removes a number of credits from the holder's account and also
     * deducts them from the tradable supply, effectively cancelling their
     * issuance on Regen Ledger
     * </pre>
     */
    public void cancel(com.regen.ecocredit.v1alpha2.MsgCancel request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateClassAdmin updates the credit class admin
     * </pre>
     */
    public void updateClassAdmin(com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClassAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateClassIssuers updates the credit class issuer list
     * </pre>
     */
    public void updateClassIssuers(com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClassIssuersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateClassMetadata updates the credit class metadata
     * </pre>
     */
    public void updateClassMetadata(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClassMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sell creates new sell orders.
     * </pre>
     */
    public void sell(com.regen.ecocredit.v1alpha2.MsgSell request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSellResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSellOrders updates existing sell orders.
     * </pre>
     */
    public void updateSellOrders(com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSellOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Buy creates credit buy orders.
     * </pre>
     */
    public void buy(com.regen.ecocredit.v1alpha2.MsgBuy request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgBuyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllowAskDenom is a governance operation which authorizes a new ask denom to be used in sell orders
     * </pre>
     */
    public void allowAskDenom(com.regen.ecocredit.v1alpha2.MsgAllowAskDenom request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllowAskDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateBasket creates a bank denom which wraps credits.
     * </pre>
     */
    public void createBasket(com.regen.ecocredit.v1alpha2.MsgCreateBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBasketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddToBasket adds credits to a basket in return for basket tokens.
     * </pre>
     */
    public void addToBasket(com.regen.ecocredit.v1alpha2.MsgAddToBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToBasketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TakeFromBasket takes credits from a basket without regard for which
     * credits they are. The credits will be auto-retired if disable_auto_retire
     * is false. Credits will be chosen randomly using the previous block hash
     * as a consensus source of randomness.
     * More concretely, the implementation is as follows:
     * - take the previous block hash and convert it into an uint64,
     * - given the total number of different credits within the basket `n`, the
     *   first credits that will get picked correspond to: hash modulo n (in
     *   terms of order),
     * - then if we need to take more credits, we get some from the next one and
     *   so on.
     * </pre>
     */
    public void takeFromBasket(com.regen.ecocredit.v1alpha2.MsgTakeFromBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeFromBasketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PickFromBasket picks specific credits from a basket. If allow_picking is
     * set to false, then only an address which deposited credits in the basket
     * can pick those credits. All other addresses will be blocked from picking
     * those credits. The credits will be auto-retired if disable_auto_retire is
     * false unless the credits were previously put into the basket by the
     * address picking them from the basket, in which case they will remain
     * tradable. This functionality allows the owner of a credit to have more
     * control over the credits they are putting in baskets then ordinary users
     * to deal with the scenario where basket tokens end up being worth
     * significantly less than the credits on their own.
     * </pre>
     */
    public void pickFromBasket(com.regen.ecocredit.v1alpha2.MsgPickFromBasket request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPickFromBasketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha1 Msg service.
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
     * CreateClass creates a new credit class with an approved list of issuers and
     * optional metadata.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgCreateClassResponse createClass(com.regen.ecocredit.v1alpha2.MsgCreateClass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateProject creates a new project within a credit class.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse createProject(com.regen.ecocredit.v1alpha2.MsgCreateProject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateBatch creates a new batch of credits for an existing project.
     * This will create a new batch denom with a fixed supply. Issued credits can
     * be distributed to recipients in either tradable or retired form.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse createBatch(com.regen.ecocredit.v1alpha2.MsgCreateBatch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send sends tradable credits from one account to another account. Sent
     * credits can either be tradable or retired on receipt.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgSendResponse send(com.regen.ecocredit.v1alpha2.MsgSend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retire retires a specified number of credits in the holder's account.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgRetireResponse retire(com.regen.ecocredit.v1alpha2.MsgRetire request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetireMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel removes a number of credits from the holder's account and also
     * deducts them from the tradable supply, effectively cancelling their
     * issuance on Regen Ledger
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgCancelResponse cancel(com.regen.ecocredit.v1alpha2.MsgCancel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateClassAdmin updates the credit class admin
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse updateClassAdmin(com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClassAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateClassIssuers updates the credit class issuer list
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse updateClassIssuers(com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClassIssuersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateClassMetadata updates the credit class metadata
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse updateClassMetadata(com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClassMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sell creates new sell orders.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgSellResponse sell(com.regen.ecocredit.v1alpha2.MsgSell request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSellOrders updates existing sell orders.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse updateSellOrders(com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSellOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Buy creates credit buy orders.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgBuyResponse buy(com.regen.ecocredit.v1alpha2.MsgBuy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllowAskDenom is a governance operation which authorizes a new ask denom to be used in sell orders
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse allowAskDenom(com.regen.ecocredit.v1alpha2.MsgAllowAskDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllowAskDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateBasket creates a bank denom which wraps credits.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse createBasket(com.regen.ecocredit.v1alpha2.MsgCreateBasket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBasketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddToBasket adds credits to a basket in return for basket tokens.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse addToBasket(com.regen.ecocredit.v1alpha2.MsgAddToBasket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToBasketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TakeFromBasket takes credits from a basket without regard for which
     * credits they are. The credits will be auto-retired if disable_auto_retire
     * is false. Credits will be chosen randomly using the previous block hash
     * as a consensus source of randomness.
     * More concretely, the implementation is as follows:
     * - take the previous block hash and convert it into an uint64,
     * - given the total number of different credits within the basket `n`, the
     *   first credits that will get picked correspond to: hash modulo n (in
     *   terms of order),
     * - then if we need to take more credits, we get some from the next one and
     *   so on.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse takeFromBasket(com.regen.ecocredit.v1alpha2.MsgTakeFromBasket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeFromBasketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PickFromBasket picks specific credits from a basket. If allow_picking is
     * set to false, then only an address which deposited credits in the basket
     * can pick those credits. All other addresses will be blocked from picking
     * those credits. The credits will be auto-retired if disable_auto_retire is
     * false unless the credits were previously put into the basket by the
     * address picking them from the basket, in which case they will remain
     * tradable. This functionality allows the owner of a credit to have more
     * control over the credits they are putting in baskets then ordinary users
     * to deal with the scenario where basket tokens end up being worth
     * significantly less than the credits on their own.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse pickFromBasket(com.regen.ecocredit.v1alpha2.MsgPickFromBasket request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPickFromBasketMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha1 Msg service.
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
     * CreateClass creates a new credit class with an approved list of issuers and
     * optional metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgCreateClassResponse> createClass(
        com.regen.ecocredit.v1alpha2.MsgCreateClass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateProject creates a new project within a credit class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse> createProject(
        com.regen.ecocredit.v1alpha2.MsgCreateProject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateBatch creates a new batch of credits for an existing project.
     * This will create a new batch denom with a fixed supply. Issued credits can
     * be distributed to recipients in either tradable or retired form.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse> createBatch(
        com.regen.ecocredit.v1alpha2.MsgCreateBatch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send sends tradable credits from one account to another account. Sent
     * credits can either be tradable or retired on receipt.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgSendResponse> send(
        com.regen.ecocredit.v1alpha2.MsgSend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retire retires a specified number of credits in the holder's account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgRetireResponse> retire(
        com.regen.ecocredit.v1alpha2.MsgRetire request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetireMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel removes a number of credits from the holder's account and also
     * deducts them from the tradable supply, effectively cancelling their
     * issuance on Regen Ledger
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgCancelResponse> cancel(
        com.regen.ecocredit.v1alpha2.MsgCancel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateClassAdmin updates the credit class admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse> updateClassAdmin(
        com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClassAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateClassIssuers updates the credit class issuer list
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse> updateClassIssuers(
        com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClassIssuersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateClassMetadata updates the credit class metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse> updateClassMetadata(
        com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClassMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sell creates new sell orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgSellResponse> sell(
        com.regen.ecocredit.v1alpha2.MsgSell request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSellOrders updates existing sell orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse> updateSellOrders(
        com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSellOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Buy creates credit buy orders.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgBuyResponse> buy(
        com.regen.ecocredit.v1alpha2.MsgBuy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllowAskDenom is a governance operation which authorizes a new ask denom to be used in sell orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse> allowAskDenom(
        com.regen.ecocredit.v1alpha2.MsgAllowAskDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllowAskDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateBasket creates a bank denom which wraps credits.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse> createBasket(
        com.regen.ecocredit.v1alpha2.MsgCreateBasket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBasketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddToBasket adds credits to a basket in return for basket tokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse> addToBasket(
        com.regen.ecocredit.v1alpha2.MsgAddToBasket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToBasketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TakeFromBasket takes credits from a basket without regard for which
     * credits they are. The credits will be auto-retired if disable_auto_retire
     * is false. Credits will be chosen randomly using the previous block hash
     * as a consensus source of randomness.
     * More concretely, the implementation is as follows:
     * - take the previous block hash and convert it into an uint64,
     * - given the total number of different credits within the basket `n`, the
     *   first credits that will get picked correspond to: hash modulo n (in
     *   terms of order),
     * - then if we need to take more credits, we get some from the next one and
     *   so on.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse> takeFromBasket(
        com.regen.ecocredit.v1alpha2.MsgTakeFromBasket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeFromBasketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PickFromBasket picks specific credits from a basket. If allow_picking is
     * set to false, then only an address which deposited credits in the basket
     * can pick those credits. All other addresses will be blocked from picking
     * those credits. The credits will be auto-retired if disable_auto_retire is
     * false unless the credits were previously put into the basket by the
     * address picking them from the basket, in which case they will remain
     * tradable. This functionality allows the owner of a credit to have more
     * control over the credits they are putting in baskets then ordinary users
     * to deal with the scenario where basket tokens end up being worth
     * significantly less than the credits on their own.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse> pickFromBasket(
        com.regen.ecocredit.v1alpha2.MsgPickFromBasket request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPickFromBasketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLASS = 0;
  private static final int METHODID_CREATE_PROJECT = 1;
  private static final int METHODID_CREATE_BATCH = 2;
  private static final int METHODID_SEND = 3;
  private static final int METHODID_RETIRE = 4;
  private static final int METHODID_CANCEL = 5;
  private static final int METHODID_UPDATE_CLASS_ADMIN = 6;
  private static final int METHODID_UPDATE_CLASS_ISSUERS = 7;
  private static final int METHODID_UPDATE_CLASS_METADATA = 8;
  private static final int METHODID_SELL = 9;
  private static final int METHODID_UPDATE_SELL_ORDERS = 10;
  private static final int METHODID_BUY = 11;
  private static final int METHODID_ALLOW_ASK_DENOM = 12;
  private static final int METHODID_CREATE_BASKET = 13;
  private static final int METHODID_ADD_TO_BASKET = 14;
  private static final int METHODID_TAKE_FROM_BASKET = 15;
  private static final int METHODID_PICK_FROM_BASKET = 16;

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
        case METHODID_CREATE_CLASS:
          serviceImpl.createClass((com.regen.ecocredit.v1alpha2.MsgCreateClass) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateClassResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.regen.ecocredit.v1alpha2.MsgCreateProject) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse>) responseObserver);
          break;
        case METHODID_CREATE_BATCH:
          serviceImpl.createBatch((com.regen.ecocredit.v1alpha2.MsgCreateBatch) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse>) responseObserver);
          break;
        case METHODID_SEND:
          serviceImpl.send((com.regen.ecocredit.v1alpha2.MsgSend) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSendResponse>) responseObserver);
          break;
        case METHODID_RETIRE:
          serviceImpl.retire((com.regen.ecocredit.v1alpha2.MsgRetire) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgRetireResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.regen.ecocredit.v1alpha2.MsgCancel) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCancelResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS_ADMIN:
          serviceImpl.updateClassAdmin((com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS_ISSUERS:
          serviceImpl.updateClassIssuers((com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLASS_METADATA:
          serviceImpl.updateClassMetadata((com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse>) responseObserver);
          break;
        case METHODID_SELL:
          serviceImpl.sell((com.regen.ecocredit.v1alpha2.MsgSell) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgSellResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SELL_ORDERS:
          serviceImpl.updateSellOrders((com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse>) responseObserver);
          break;
        case METHODID_BUY:
          serviceImpl.buy((com.regen.ecocredit.v1alpha2.MsgBuy) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgBuyResponse>) responseObserver);
          break;
        case METHODID_ALLOW_ASK_DENOM:
          serviceImpl.allowAskDenom((com.regen.ecocredit.v1alpha2.MsgAllowAskDenom) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse>) responseObserver);
          break;
        case METHODID_CREATE_BASKET:
          serviceImpl.createBasket((com.regen.ecocredit.v1alpha2.MsgCreateBasket) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_BASKET:
          serviceImpl.addToBasket((com.regen.ecocredit.v1alpha2.MsgAddToBasket) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse>) responseObserver);
          break;
        case METHODID_TAKE_FROM_BASKET:
          serviceImpl.takeFromBasket((com.regen.ecocredit.v1alpha2.MsgTakeFromBasket) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse>) responseObserver);
          break;
        case METHODID_PICK_FROM_BASKET:
          serviceImpl.pickFromBasket((com.regen.ecocredit.v1alpha2.MsgPickFromBasket) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse>) responseObserver);
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
          getCreateClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgCreateClass,
              com.regen.ecocredit.v1alpha2.MsgCreateClassResponse>(
                service, METHODID_CREATE_CLASS)))
        .addMethod(
          getCreateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgCreateProject,
              com.regen.ecocredit.v1alpha2.MsgCreateProjectResponse>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getCreateBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgCreateBatch,
              com.regen.ecocredit.v1alpha2.MsgCreateBatchResponse>(
                service, METHODID_CREATE_BATCH)))
        .addMethod(
          getSendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgSend,
              com.regen.ecocredit.v1alpha2.MsgSendResponse>(
                service, METHODID_SEND)))
        .addMethod(
          getRetireMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgRetire,
              com.regen.ecocredit.v1alpha2.MsgRetireResponse>(
                service, METHODID_RETIRE)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgCancel,
              com.regen.ecocredit.v1alpha2.MsgCancelResponse>(
                service, METHODID_CANCEL)))
        .addMethod(
          getUpdateClassAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgUpdateClassAdmin,
              com.regen.ecocredit.v1alpha2.MsgUpdateClassAdminResponse>(
                service, METHODID_UPDATE_CLASS_ADMIN)))
        .addMethod(
          getUpdateClassIssuersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuers,
              com.regen.ecocredit.v1alpha2.MsgUpdateClassIssuersResponse>(
                service, METHODID_UPDATE_CLASS_ISSUERS)))
        .addMethod(
          getUpdateClassMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadata,
              com.regen.ecocredit.v1alpha2.MsgUpdateClassMetadataResponse>(
                service, METHODID_UPDATE_CLASS_METADATA)))
        .addMethod(
          getSellMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgSell,
              com.regen.ecocredit.v1alpha2.MsgSellResponse>(
                service, METHODID_SELL)))
        .addMethod(
          getUpdateSellOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgUpdateSellOrders,
              com.regen.ecocredit.v1alpha2.MsgUpdateSellOrdersResponse>(
                service, METHODID_UPDATE_SELL_ORDERS)))
        .addMethod(
          getBuyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgBuy,
              com.regen.ecocredit.v1alpha2.MsgBuyResponse>(
                service, METHODID_BUY)))
        .addMethod(
          getAllowAskDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgAllowAskDenom,
              com.regen.ecocredit.v1alpha2.MsgAllowAskDenomResponse>(
                service, METHODID_ALLOW_ASK_DENOM)))
        .addMethod(
          getCreateBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgCreateBasket,
              com.regen.ecocredit.v1alpha2.MsgCreateBasketResponse>(
                service, METHODID_CREATE_BASKET)))
        .addMethod(
          getAddToBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgAddToBasket,
              com.regen.ecocredit.v1alpha2.MsgAddToBasketResponse>(
                service, METHODID_ADD_TO_BASKET)))
        .addMethod(
          getTakeFromBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgTakeFromBasket,
              com.regen.ecocredit.v1alpha2.MsgTakeFromBasketResponse>(
                service, METHODID_TAKE_FROM_BASKET)))
        .addMethod(
          getPickFromBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.MsgPickFromBasket,
              com.regen.ecocredit.v1alpha2.MsgPickFromBasketResponse>(
                service, METHODID_PICK_FROM_BASKET)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.ecocredit.v1alpha2.TxProto.getDescriptor();
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
              .addMethod(getCreateClassMethod())
              .addMethod(getCreateProjectMethod())
              .addMethod(getCreateBatchMethod())
              .addMethod(getSendMethod())
              .addMethod(getRetireMethod())
              .addMethod(getCancelMethod())
              .addMethod(getUpdateClassAdminMethod())
              .addMethod(getUpdateClassIssuersMethod())
              .addMethod(getUpdateClassMetadataMethod())
              .addMethod(getSellMethod())
              .addMethod(getUpdateSellOrdersMethod())
              .addMethod(getBuyMethod())
              .addMethod(getAllowAskDenomMethod())
              .addMethod(getCreateBasketMethod())
              .addMethod(getAddToBasketMethod())
              .addMethod(getTakeFromBasketMethod())
              .addMethod(getPickFromBasketMethod())
              .build();
        }
      }
    }
    return result;
  }
}
