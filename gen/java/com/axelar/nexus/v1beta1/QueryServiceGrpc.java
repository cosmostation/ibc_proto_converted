package com.axelar.nexus.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryService defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: axelar/nexus/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "axelar.nexus.v1beta1.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest,
      com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> getLatestDepositAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestDepositAddress",
      requestType = com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest,
      com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> getLatestDepositAddressMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest, com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> getLatestDepositAddressMethod;
    if ((getLatestDepositAddressMethod = QueryServiceGrpc.getLatestDepositAddressMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getLatestDepositAddressMethod = QueryServiceGrpc.getLatestDepositAddressMethod) == null) {
          QueryServiceGrpc.getLatestDepositAddressMethod = getLatestDepositAddressMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest, com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestDepositAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("LatestDepositAddress"))
              .build();
        }
      }
    }
    return getLatestDepositAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> getTransfersForChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransfersForChain",
      requestType = com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> getTransfersForChainMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest, com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> getTransfersForChainMethod;
    if ((getTransfersForChainMethod = QueryServiceGrpc.getTransfersForChainMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getTransfersForChainMethod = QueryServiceGrpc.getTransfersForChainMethod) == null) {
          QueryServiceGrpc.getTransfersForChainMethod = getTransfersForChainMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest, com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransfersForChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("TransfersForChain"))
              .build();
        }
      }
    }
    return getTransfersForChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest,
      com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> getFeeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeInfo",
      requestType = com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest,
      com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> getFeeInfoMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest, com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> getFeeInfoMethod;
    if ((getFeeInfoMethod = QueryServiceGrpc.getFeeInfoMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getFeeInfoMethod = QueryServiceGrpc.getFeeInfoMethod) == null) {
          QueryServiceGrpc.getFeeInfoMethod = getFeeInfoMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest, com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("FeeInfo"))
              .build();
        }
      }
    }
    return getFeeInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> getTransferFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferFee",
      requestType = com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> getTransferFeeMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest, com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> getTransferFeeMethod;
    if ((getTransferFeeMethod = QueryServiceGrpc.getTransferFeeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getTransferFeeMethod = QueryServiceGrpc.getTransferFeeMethod) == null) {
          QueryServiceGrpc.getTransferFeeMethod = getTransferFeeMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest, com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("TransferFee"))
              .build();
        }
      }
    }
    return getTransferFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> getChainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chains",
      requestType = com.axelar.nexus.v1beta1.QueryProto.ChainsRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.ChainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> getChainsMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsRequest, com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> getChainsMethod;
    if ((getChainsMethod = QueryServiceGrpc.getChainsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getChainsMethod = QueryServiceGrpc.getChainsMethod) == null) {
          QueryServiceGrpc.getChainsMethod = getChainsMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.ChainsRequest, com.axelar.nexus.v1beta1.QueryProto.ChainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Chains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Chains"))
              .build();
        }
      }
    }
    return getChainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.AssetsRequest,
      com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> getAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Assets",
      requestType = com.axelar.nexus.v1beta1.QueryProto.AssetsRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.AssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.AssetsRequest,
      com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> getAssetsMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.AssetsRequest, com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> getAssetsMethod;
    if ((getAssetsMethod = QueryServiceGrpc.getAssetsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getAssetsMethod = QueryServiceGrpc.getAssetsMethod) == null) {
          QueryServiceGrpc.getAssetsMethod = getAssetsMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.AssetsRequest, com.axelar.nexus.v1beta1.QueryProto.AssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Assets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.AssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.AssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Assets"))
              .build();
        }
      }
    }
    return getAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> getChainStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainState",
      requestType = com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> getChainStateMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest, com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> getChainStateMethod;
    if ((getChainStateMethod = QueryServiceGrpc.getChainStateMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getChainStateMethod = QueryServiceGrpc.getChainStateMethod) == null) {
          QueryServiceGrpc.getChainStateMethod = getChainStateMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest, com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("ChainState"))
              .build();
        }
      }
    }
    return getChainStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> getChainsByAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainsByAsset",
      requestType = com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> getChainsByAssetMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest, com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> getChainsByAssetMethod;
    if ((getChainsByAssetMethod = QueryServiceGrpc.getChainsByAssetMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getChainsByAssetMethod = QueryServiceGrpc.getChainsByAssetMethod) == null) {
          QueryServiceGrpc.getChainsByAssetMethod = getChainsByAssetMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest, com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainsByAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("ChainsByAsset"))
              .build();
        }
      }
    }
    return getChainsByAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest,
      com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> getRecipientAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecipientAddress",
      requestType = com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest,
      com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> getRecipientAddressMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest, com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> getRecipientAddressMethod;
    if ((getRecipientAddressMethod = QueryServiceGrpc.getRecipientAddressMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getRecipientAddressMethod = QueryServiceGrpc.getRecipientAddressMethod) == null) {
          QueryServiceGrpc.getRecipientAddressMethod = getRecipientAddressMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest, com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecipientAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("RecipientAddress"))
              .build();
        }
      }
    }
    return getRecipientAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> getChainMaintainersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChainMaintainers",
      requestType = com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest,
      com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> getChainMaintainersMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest, com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> getChainMaintainersMethod;
    if ((getChainMaintainersMethod = QueryServiceGrpc.getChainMaintainersMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getChainMaintainersMethod = QueryServiceGrpc.getChainMaintainersMethod) == null) {
          QueryServiceGrpc.getChainMaintainersMethod = getChainMaintainersMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest, com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChainMaintainers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("ChainMaintainers"))
              .build();
        }
      }
    }
    return getChainMaintainersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> getTransferRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferRateLimit",
      requestType = com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest,
      com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> getTransferRateLimitMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest, com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> getTransferRateLimitMethod;
    if ((getTransferRateLimitMethod = QueryServiceGrpc.getTransferRateLimitMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getTransferRateLimitMethod = QueryServiceGrpc.getTransferRateLimitMethod) == null) {
          QueryServiceGrpc.getTransferRateLimitMethod = getTransferRateLimitMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest, com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("TransferRateLimit"))
              .build();
        }
      }
    }
    return getTransferRateLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.MessageRequest,
      com.axelar.nexus.v1beta1.QueryProto.MessageResponse> getMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Message",
      requestType = com.axelar.nexus.v1beta1.QueryProto.MessageRequest.class,
      responseType = com.axelar.nexus.v1beta1.QueryProto.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.MessageRequest,
      com.axelar.nexus.v1beta1.QueryProto.MessageResponse> getMessageMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.QueryProto.MessageRequest, com.axelar.nexus.v1beta1.QueryProto.MessageResponse> getMessageMethod;
    if ((getMessageMethod = QueryServiceGrpc.getMessageMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getMessageMethod = QueryServiceGrpc.getMessageMethod) == null) {
          QueryServiceGrpc.getMessageMethod = getMessageMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.QueryProto.MessageRequest, com.axelar.nexus.v1beta1.QueryProto.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Message"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.QueryProto.MessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Message"))
              .build();
        }
      }
    }
    return getMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * LatestDepositAddress queries the a deposit address by recipient
     * </pre>
     */
    default void latestDepositAddress(com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestDepositAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransfersForChain queries transfers by chain
     * </pre>
     */
    default void transfersForChain(com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransfersForChainMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeeInfo queries the fee info by chain and asset
     * </pre>
     */
    default void feeInfo(com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferFee queries the transfer fee by the source, destination chain,
     * and amount. If amount is 0, the min fee is returned
     * </pre>
     */
    default void transferFee(com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Chains queries the chains registered on the network
     * </pre>
     */
    default void chains(com.axelar.nexus.v1beta1.QueryProto.ChainsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assets queries the assets registered for a chain
     * </pre>
     */
    default void assets(com.axelar.nexus.v1beta1.QueryProto.AssetsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChainState queries the state of a registered chain on the network
     * </pre>
     */
    default void chainState(com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChainsByAsset queries the chains that support an asset on the network
     * </pre>
     */
    default void chainsByAsset(com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainsByAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecipientAddress queries the recipient address for a given deposit address
     * </pre>
     */
    default void recipientAddress(com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecipientAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChainMaintainers queries the chain maintainers for a given chain
     * </pre>
     */
    default void chainMaintainers(com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainMaintainersMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferRateLimit queries the transfer rate limit for a given chain and
     * asset. If a rate limit is not set, nil is returned.
     * </pre>
     */
    default void transferRateLimit(com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferRateLimitMethod(), responseObserver);
    }

    /**
     */
    default void message(com.axelar.nexus.v1beta1.QueryProto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.MessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMessageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * LatestDepositAddress queries the a deposit address by recipient
     * </pre>
     */
    public void latestDepositAddress(com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestDepositAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransfersForChain queries transfers by chain
     * </pre>
     */
    public void transfersForChain(com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransfersForChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeeInfo queries the fee info by chain and asset
     * </pre>
     */
    public void feeInfo(com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferFee queries the transfer fee by the source, destination chain,
     * and amount. If amount is 0, the min fee is returned
     * </pre>
     */
    public void transferFee(com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Chains queries the chains registered on the network
     * </pre>
     */
    public void chains(com.axelar.nexus.v1beta1.QueryProto.ChainsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assets queries the assets registered for a chain
     * </pre>
     */
    public void assets(com.axelar.nexus.v1beta1.QueryProto.AssetsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChainState queries the state of a registered chain on the network
     * </pre>
     */
    public void chainState(com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChainsByAsset queries the chains that support an asset on the network
     * </pre>
     */
    public void chainsByAsset(com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainsByAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecipientAddress queries the recipient address for a given deposit address
     * </pre>
     */
    public void recipientAddress(com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecipientAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChainMaintainers queries the chain maintainers for a given chain
     * </pre>
     */
    public void chainMaintainers(com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainMaintainersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferRateLimit queries the transfer rate limit for a given chain and
     * asset. If a rate limit is not set, nil is returned.
     * </pre>
     */
    public void transferRateLimit(com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferRateLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void message(com.axelar.nexus.v1beta1.QueryProto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.MessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * LatestDepositAddress queries the a deposit address by recipient
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse latestDepositAddress(com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestDepositAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransfersForChain queries transfers by chain
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse transfersForChain(com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransfersForChainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeeInfo queries the fee info by chain and asset
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse feeInfo(com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferFee queries the transfer fee by the source, destination chain,
     * and amount. If amount is 0, the min fee is returned
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse transferFee(com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Chains queries the chains registered on the network
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.ChainsResponse chains(com.axelar.nexus.v1beta1.QueryProto.ChainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assets queries the assets registered for a chain
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.AssetsResponse assets(com.axelar.nexus.v1beta1.QueryProto.AssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChainState queries the state of a registered chain on the network
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse chainState(com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChainsByAsset queries the chains that support an asset on the network
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse chainsByAsset(com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainsByAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecipientAddress queries the recipient address for a given deposit address
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse recipientAddress(com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecipientAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChainMaintainers queries the chain maintainers for a given chain
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse chainMaintainers(com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainMaintainersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferRateLimit queries the transfer rate limit for a given chain and
     * asset. If a rate limit is not set, nil is returned.
     * </pre>
     */
    public com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse transferRateLimit(com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferRateLimitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.QueryProto.MessageResponse message(com.axelar.nexus.v1beta1.QueryProto.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * LatestDepositAddress queries the a deposit address by recipient
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse> latestDepositAddress(
        com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestDepositAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransfersForChain queries transfers by chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse> transfersForChain(
        com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransfersForChainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeeInfo queries the fee info by chain and asset
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse> feeInfo(
        com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferFee queries the transfer fee by the source, destination chain,
     * and amount. If amount is 0, the min fee is returned
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse> transferFee(
        com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Chains queries the chains registered on the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.ChainsResponse> chains(
        com.axelar.nexus.v1beta1.QueryProto.ChainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assets queries the assets registered for a chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.AssetsResponse> assets(
        com.axelar.nexus.v1beta1.QueryProto.AssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChainState queries the state of a registered chain on the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse> chainState(
        com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChainsByAsset queries the chains that support an asset on the network
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse> chainsByAsset(
        com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainsByAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecipientAddress queries the recipient address for a given deposit address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse> recipientAddress(
        com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecipientAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChainMaintainers queries the chain maintainers for a given chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse> chainMaintainers(
        com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainMaintainersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferRateLimit queries the transfer rate limit for a given chain and
     * asset. If a rate limit is not set, nil is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse> transferRateLimit(
        com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferRateLimitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.QueryProto.MessageResponse> message(
        com.axelar.nexus.v1beta1.QueryProto.MessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LATEST_DEPOSIT_ADDRESS = 0;
  private static final int METHODID_TRANSFERS_FOR_CHAIN = 1;
  private static final int METHODID_FEE_INFO = 2;
  private static final int METHODID_TRANSFER_FEE = 3;
  private static final int METHODID_CHAINS = 4;
  private static final int METHODID_ASSETS = 5;
  private static final int METHODID_CHAIN_STATE = 6;
  private static final int METHODID_CHAINS_BY_ASSET = 7;
  private static final int METHODID_RECIPIENT_ADDRESS = 8;
  private static final int METHODID_CHAIN_MAINTAINERS = 9;
  private static final int METHODID_TRANSFER_RATE_LIMIT = 10;
  private static final int METHODID_MESSAGE = 11;

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
        case METHODID_LATEST_DEPOSIT_ADDRESS:
          serviceImpl.latestDepositAddress((com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse>) responseObserver);
          break;
        case METHODID_TRANSFERS_FOR_CHAIN:
          serviceImpl.transfersForChain((com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse>) responseObserver);
          break;
        case METHODID_FEE_INFO:
          serviceImpl.feeInfo((com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_FEE:
          serviceImpl.transferFee((com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse>) responseObserver);
          break;
        case METHODID_CHAINS:
          serviceImpl.chains((com.axelar.nexus.v1beta1.QueryProto.ChainsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsResponse>) responseObserver);
          break;
        case METHODID_ASSETS:
          serviceImpl.assets((com.axelar.nexus.v1beta1.QueryProto.AssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.AssetsResponse>) responseObserver);
          break;
        case METHODID_CHAIN_STATE:
          serviceImpl.chainState((com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse>) responseObserver);
          break;
        case METHODID_CHAINS_BY_ASSET:
          serviceImpl.chainsByAsset((com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse>) responseObserver);
          break;
        case METHODID_RECIPIENT_ADDRESS:
          serviceImpl.recipientAddress((com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse>) responseObserver);
          break;
        case METHODID_CHAIN_MAINTAINERS:
          serviceImpl.chainMaintainers((com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_RATE_LIMIT:
          serviceImpl.transferRateLimit((com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse>) responseObserver);
          break;
        case METHODID_MESSAGE:
          serviceImpl.message((com.axelar.nexus.v1beta1.QueryProto.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.QueryProto.MessageResponse>) responseObserver);
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
          getLatestDepositAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressRequest,
              com.axelar.nexus.v1beta1.QueryProto.LatestDepositAddressResponse>(
                service, METHODID_LATEST_DEPOSIT_ADDRESS)))
        .addMethod(
          getTransfersForChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.TransfersForChainRequest,
              com.axelar.nexus.v1beta1.QueryProto.TransfersForChainResponse>(
                service, METHODID_TRANSFERS_FOR_CHAIN)))
        .addMethod(
          getFeeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.FeeInfoRequest,
              com.axelar.nexus.v1beta1.QueryProto.FeeInfoResponse>(
                service, METHODID_FEE_INFO)))
        .addMethod(
          getTransferFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.TransferFeeRequest,
              com.axelar.nexus.v1beta1.QueryProto.TransferFeeResponse>(
                service, METHODID_TRANSFER_FEE)))
        .addMethod(
          getChainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.ChainsRequest,
              com.axelar.nexus.v1beta1.QueryProto.ChainsResponse>(
                service, METHODID_CHAINS)))
        .addMethod(
          getAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.AssetsRequest,
              com.axelar.nexus.v1beta1.QueryProto.AssetsResponse>(
                service, METHODID_ASSETS)))
        .addMethod(
          getChainStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.ChainStateRequest,
              com.axelar.nexus.v1beta1.QueryProto.ChainStateResponse>(
                service, METHODID_CHAIN_STATE)))
        .addMethod(
          getChainsByAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetRequest,
              com.axelar.nexus.v1beta1.QueryProto.ChainsByAssetResponse>(
                service, METHODID_CHAINS_BY_ASSET)))
        .addMethod(
          getRecipientAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.RecipientAddressRequest,
              com.axelar.nexus.v1beta1.QueryProto.RecipientAddressResponse>(
                service, METHODID_RECIPIENT_ADDRESS)))
        .addMethod(
          getChainMaintainersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersRequest,
              com.axelar.nexus.v1beta1.QueryProto.ChainMaintainersResponse>(
                service, METHODID_CHAIN_MAINTAINERS)))
        .addMethod(
          getTransferRateLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitRequest,
              com.axelar.nexus.v1beta1.QueryProto.TransferRateLimitResponse>(
                service, METHODID_TRANSFER_RATE_LIMIT)))
        .addMethod(
          getMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.QueryProto.MessageRequest,
              com.axelar.nexus.v1beta1.QueryProto.MessageResponse>(
                service, METHODID_MESSAGE)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.nexus.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getLatestDepositAddressMethod())
              .addMethod(getTransfersForChainMethod())
              .addMethod(getFeeInfoMethod())
              .addMethod(getTransferFeeMethod())
              .addMethod(getChainsMethod())
              .addMethod(getAssetsMethod())
              .addMethod(getChainStateMethod())
              .addMethod(getChainsByAssetMethod())
              .addMethod(getRecipientAddressMethod())
              .addMethod(getChainMaintainersMethod())
              .addMethod(getTransferRateLimitMethod())
              .addMethod(getMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
