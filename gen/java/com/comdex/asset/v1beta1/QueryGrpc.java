package com.comdex.asset.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/asset/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.asset.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest, com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest, com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> getQueryAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssets",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> getQueryAssetsMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> getQueryAssetsMethod;
    if ((getQueryAssetsMethod = QueryGrpc.getQueryAssetsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetsMethod = QueryGrpc.getQueryAssetsMethod) == null) {
          QueryGrpc.getQueryAssetsMethod = getQueryAssetsMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssets"))
              .build();
        }
      }
    }
    return getQueryAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> getQueryAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAsset",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> getQueryAssetMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> getQueryAssetMethod;
    if ((getQueryAssetMethod = QueryGrpc.getQueryAssetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetMethod = QueryGrpc.getQueryAssetMethod) == null) {
          QueryGrpc.getQueryAssetMethod = getQueryAssetMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAsset"))
              .build();
        }
      }
    }
    return getQueryAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> getQueryAssetPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetPairs",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> getQueryAssetPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> getQueryAssetPairsMethod;
    if ((getQueryAssetPairsMethod = QueryGrpc.getQueryAssetPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetPairsMethod = QueryGrpc.getQueryAssetPairsMethod) == null) {
          QueryGrpc.getQueryAssetPairsMethod = getQueryAssetPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetPairs"))
              .build();
        }
      }
    }
    return getQueryAssetPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> getQueryAssetPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetPair",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> getQueryAssetPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> getQueryAssetPairMethod;
    if ((getQueryAssetPairMethod = QueryGrpc.getQueryAssetPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetPairMethod = QueryGrpc.getQueryAssetPairMethod) == null) {
          QueryGrpc.getQueryAssetPairMethod = getQueryAssetPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest, com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetPair"))
              .build();
        }
      }
    }
    return getQueryAssetPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> getQueryAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryApps",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> getQueryAppsMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> getQueryAppsMethod;
    if ((getQueryAppsMethod = QueryGrpc.getQueryAppsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAppsMethod = QueryGrpc.getQueryAppsMethod) == null) {
          QueryGrpc.getQueryAppsMethod = getQueryAppsMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryApps"))
              .build();
        }
      }
    }
    return getQueryAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> getQueryAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryApp",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAppRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> getQueryAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> getQueryAppMethod;
    if ((getQueryAppMethod = QueryGrpc.getQueryAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAppMethod = QueryGrpc.getQueryAppMethod) == null) {
          QueryGrpc.getQueryAppMethod = getQueryAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryApp"))
              .build();
        }
      }
    }
    return getQueryAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> getQueryExtendedPairVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVault",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> getQueryExtendedPairVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest, com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> getQueryExtendedPairVaultMethod;
    if ((getQueryExtendedPairVaultMethod = QueryGrpc.getQueryExtendedPairVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultMethod = QueryGrpc.getQueryExtendedPairVaultMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultMethod = getQueryExtendedPairVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest, com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVault"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> getQueryAllExtendedPairVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllExtendedPairVaults",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> getQueryAllExtendedPairVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> getQueryAllExtendedPairVaultsMethod;
    if ((getQueryAllExtendedPairVaultsMethod = QueryGrpc.getQueryAllExtendedPairVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllExtendedPairVaultsMethod = QueryGrpc.getQueryAllExtendedPairVaultsMethod) == null) {
          QueryGrpc.getQueryAllExtendedPairVaultsMethod = getQueryAllExtendedPairVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllExtendedPairVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllExtendedPairVaults"))
              .build();
        }
      }
    }
    return getQueryAllExtendedPairVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> getQueryAllExtendedPairVaultsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllExtendedPairVaultsByApp",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> getQueryAllExtendedPairVaultsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> getQueryAllExtendedPairVaultsByAppMethod;
    if ((getQueryAllExtendedPairVaultsByAppMethod = QueryGrpc.getQueryAllExtendedPairVaultsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllExtendedPairVaultsByAppMethod = QueryGrpc.getQueryAllExtendedPairVaultsByAppMethod) == null) {
          QueryGrpc.getQueryAllExtendedPairVaultsByAppMethod = getQueryAllExtendedPairVaultsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllExtendedPairVaultsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllExtendedPairVaultsByApp"))
              .build();
        }
      }
    }
    return getQueryAllExtendedPairVaultsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> getQueryAllExtendedPairStableVaultsIDByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllExtendedPairStableVaultsIDByApp",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> getQueryAllExtendedPairStableVaultsIDByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> getQueryAllExtendedPairStableVaultsIDByAppMethod;
    if ((getQueryAllExtendedPairStableVaultsIDByAppMethod = QueryGrpc.getQueryAllExtendedPairStableVaultsIDByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllExtendedPairStableVaultsIDByAppMethod = QueryGrpc.getQueryAllExtendedPairStableVaultsIDByAppMethod) == null) {
          QueryGrpc.getQueryAllExtendedPairStableVaultsIDByAppMethod = getQueryAllExtendedPairStableVaultsIDByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllExtendedPairStableVaultsIDByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllExtendedPairStableVaultsIDByApp"))
              .build();
        }
      }
    }
    return getQueryAllExtendedPairStableVaultsIDByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> getQueryGovTokenByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryGovTokenByApp",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> getQueryGovTokenByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> getQueryGovTokenByAppMethod;
    if ((getQueryGovTokenByAppMethod = QueryGrpc.getQueryGovTokenByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryGovTokenByAppMethod = QueryGrpc.getQueryGovTokenByAppMethod) == null) {
          QueryGrpc.getQueryGovTokenByAppMethod = getQueryGovTokenByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryGovTokenByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryGovTokenByApp"))
              .build();
        }
      }
    }
    return getQueryGovTokenByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> getQueryAllExtendedPairStableVaultsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllExtendedPairStableVaultsByApp",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> getQueryAllExtendedPairStableVaultsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> getQueryAllExtendedPairStableVaultsByAppMethod;
    if ((getQueryAllExtendedPairStableVaultsByAppMethod = QueryGrpc.getQueryAllExtendedPairStableVaultsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllExtendedPairStableVaultsByAppMethod = QueryGrpc.getQueryAllExtendedPairStableVaultsByAppMethod) == null) {
          QueryGrpc.getQueryAllExtendedPairStableVaultsByAppMethod = getQueryAllExtendedPairStableVaultsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest, com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllExtendedPairStableVaultsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllExtendedPairStableVaultsByApp"))
              .build();
        }
      }
    }
    return getQueryAllExtendedPairStableVaultsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> getQueryExtendedPairVaultsByAppWithoutStableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVaultsByAppWithoutStable",
      requestType = com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest.class,
      responseType = com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest,
      com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> getQueryExtendedPairVaultsByAppWithoutStableMethod() {
    io.grpc.MethodDescriptor<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest, com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> getQueryExtendedPairVaultsByAppWithoutStableMethod;
    if ((getQueryExtendedPairVaultsByAppWithoutStableMethod = QueryGrpc.getQueryExtendedPairVaultsByAppWithoutStableMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultsByAppWithoutStableMethod = QueryGrpc.getQueryExtendedPairVaultsByAppWithoutStableMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultsByAppWithoutStableMethod = getQueryExtendedPairVaultsByAppWithoutStableMethod =
              io.grpc.MethodDescriptor.<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest, com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVaultsByAppWithoutStable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVaultsByAppWithoutStable"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultsByAppWithoutStableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns parameters of the module.
     * </pre>
     */
    default void params(com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryAssets(com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetsMethod(), responseObserver);
    }

    /**
     */
    default void queryAsset(com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetPairs(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetPair(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetPairMethod(), responseObserver);
    }

    /**
     */
    default void queryApps(com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAppsMethod(), responseObserver);
    }

    /**
     */
    default void queryApp(com.comdex.asset.v1beta1.QueryProto.QueryAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAppMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVault(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultMethod(), responseObserver);
    }

    /**
     */
    default void queryAllExtendedPairVaults(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllExtendedPairVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllExtendedPairVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllExtendedPairVaultsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllExtendedPairStableVaultsIDByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllExtendedPairStableVaultsIDByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryGovTokenByApp(com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryGovTokenByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllExtendedPairStableVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllExtendedPairStableVaultsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVaultsByAppWithoutStable(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultsByAppWithoutStableMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns parameters of the module.
     * </pre>
     */
    public void params(com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssets(com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAsset(com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetPairs(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetPair(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryApps(com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryApp(com.comdex.asset.v1beta1.QueryProto.QueryAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVault(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllExtendedPairVaults(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllExtendedPairVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairVaultsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllExtendedPairStableVaultsIDByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairStableVaultsIDByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryGovTokenByApp(com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryGovTokenByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllExtendedPairStableVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairStableVaultsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVaultsByAppWithoutStable(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest request,
        io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultsByAppWithoutStableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns parameters of the module.
     * </pre>
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse params(com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse queryAssets(com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse queryAsset(com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse queryAssetPairs(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse queryAssetPair(com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse queryApps(com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAppsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAppResponse queryApp(com.comdex.asset.v1beta1.QueryProto.QueryAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse queryExtendedPairVault(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse queryAllExtendedPairVaults(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllExtendedPairVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse queryAllExtendedPairVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllExtendedPairVaultsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse queryAllExtendedPairStableVaultsIDByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllExtendedPairStableVaultsIDByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse queryGovTokenByApp(com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryGovTokenByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse queryAllExtendedPairStableVaultsByApp(com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllExtendedPairStableVaultsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse queryExtendedPairVaultsByAppWithoutStable(com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultsByAppWithoutStableMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Params returns parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse> params(
        com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse> queryAssets(
        com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse> queryAsset(
        com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse> queryAssetPairs(
        com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse> queryAssetPair(
        com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse> queryApps(
        com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAppsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAppResponse> queryApp(
        com.comdex.asset.v1beta1.QueryProto.QueryAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse> queryExtendedPairVault(
        com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse> queryAllExtendedPairVaults(
        com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse> queryAllExtendedPairVaultsByApp(
        com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairVaultsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse> queryAllExtendedPairStableVaultsIDByApp(
        com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairStableVaultsIDByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse> queryGovTokenByApp(
        com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryGovTokenByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse> queryAllExtendedPairStableVaultsByApp(
        com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllExtendedPairStableVaultsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse> queryExtendedPairVaultsByAppWithoutStable(
        com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultsByAppWithoutStableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_QUERY_ASSETS = 1;
  private static final int METHODID_QUERY_ASSET = 2;
  private static final int METHODID_QUERY_ASSET_PAIRS = 3;
  private static final int METHODID_QUERY_ASSET_PAIR = 4;
  private static final int METHODID_QUERY_APPS = 5;
  private static final int METHODID_QUERY_APP = 6;
  private static final int METHODID_QUERY_EXTENDED_PAIR_VAULT = 7;
  private static final int METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS = 8;
  private static final int METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS_BY_APP = 9;
  private static final int METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_IDBY_APP = 10;
  private static final int METHODID_QUERY_GOV_TOKEN_BY_APP = 11;
  private static final int METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_BY_APP = 12;
  private static final int METHODID_QUERY_EXTENDED_PAIR_VAULTS_BY_APP_WITHOUT_STABLE = 13;

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
        case METHODID_PARAMS:
          serviceImpl.params((com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSETS:
          serviceImpl.queryAssets((com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET:
          serviceImpl.queryAsset((com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_PAIRS:
          serviceImpl.queryAssetPairs((com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_PAIR:
          serviceImpl.queryAssetPair((com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_APPS:
          serviceImpl.queryApps((com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse>) responseObserver);
          break;
        case METHODID_QUERY_APP:
          serviceImpl.queryApp((com.comdex.asset.v1beta1.QueryProto.QueryAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULT:
          serviceImpl.queryExtendedPairVault((com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS:
          serviceImpl.queryAllExtendedPairVaults((com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS_BY_APP:
          serviceImpl.queryAllExtendedPairVaultsByApp((com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_IDBY_APP:
          serviceImpl.queryAllExtendedPairStableVaultsIDByApp((com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_GOV_TOKEN_BY_APP:
          serviceImpl.queryGovTokenByApp((com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_BY_APP:
          serviceImpl.queryAllExtendedPairStableVaultsByApp((com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULTS_BY_APP_WITHOUT_STABLE:
          serviceImpl.queryExtendedPairVaultsByAppWithoutStable((com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryParamsRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAssetsRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAssetsResponse>(
                service, METHODID_QUERY_ASSETS)))
        .addMethod(
          getQueryAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAssetRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAssetResponse>(
                service, METHODID_QUERY_ASSET)))
        .addMethod(
          getQueryAssetPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAssetPairsResponse>(
                service, METHODID_QUERY_ASSET_PAIRS)))
        .addMethod(
          getQueryAssetPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAssetPairRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAssetPairResponse>(
                service, METHODID_QUERY_ASSET_PAIR)))
        .addMethod(
          getQueryAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAppsRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAppsResponse>(
                service, METHODID_QUERY_APPS)))
        .addMethod(
          getQueryAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAppRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAppResponse>(
                service, METHODID_QUERY_APP)))
        .addMethod(
          getQueryExtendedPairVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULT)))
        .addMethod(
          getQueryAllExtendedPairVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsResponse>(
                service, METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS)))
        .addMethod(
          getQueryAllExtendedPairVaultsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairVaultsByAppResponse>(
                service, METHODID_QUERY_ALL_EXTENDED_PAIR_VAULTS_BY_APP)))
        .addMethod(
          getQueryAllExtendedPairStableVaultsIDByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsIDByAppResponse>(
                service, METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_IDBY_APP)))
        .addMethod(
          getQueryGovTokenByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryGovTokenByAppResponse>(
                service, METHODID_QUERY_GOV_TOKEN_BY_APP)))
        .addMethod(
          getQueryAllExtendedPairStableVaultsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryAllExtendedPairStableVaultsByAppResponse>(
                service, METHODID_QUERY_ALL_EXTENDED_PAIR_STABLE_VAULTS_BY_APP)))
        .addMethod(
          getQueryExtendedPairVaultsByAppWithoutStableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableRequest,
              com.comdex.asset.v1beta1.QueryProto.QueryExtendedPairVaultsByAppWithoutStableResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULTS_BY_APP_WITHOUT_STABLE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.asset.v1beta1.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getParamsMethod())
              .addMethod(getQueryAssetsMethod())
              .addMethod(getQueryAssetMethod())
              .addMethod(getQueryAssetPairsMethod())
              .addMethod(getQueryAssetPairMethod())
              .addMethod(getQueryAppsMethod())
              .addMethod(getQueryAppMethod())
              .addMethod(getQueryExtendedPairVaultMethod())
              .addMethod(getQueryAllExtendedPairVaultsMethod())
              .addMethod(getQueryAllExtendedPairVaultsByAppMethod())
              .addMethod(getQueryAllExtendedPairStableVaultsIDByAppMethod())
              .addMethod(getQueryGovTokenByAppMethod())
              .addMethod(getQueryAllExtendedPairStableVaultsByAppMethod())
              .addMethod(getQueryExtendedPairVaultsByAppWithoutStableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
