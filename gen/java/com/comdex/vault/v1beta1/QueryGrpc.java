package com.comdex.vault.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/vault/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.vault.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultRequest,
      com.comdex.vault.v1beta1.QueryVaultResponse> getQueryVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVault",
      requestType = com.comdex.vault.v1beta1.QueryVaultRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultRequest,
      com.comdex.vault.v1beta1.QueryVaultResponse> getQueryVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultRequest, com.comdex.vault.v1beta1.QueryVaultResponse> getQueryVaultMethod;
    if ((getQueryVaultMethod = QueryGrpc.getQueryVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultMethod = QueryGrpc.getQueryVaultMethod) == null) {
          QueryGrpc.getQueryVaultMethod = getQueryVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultRequest, com.comdex.vault.v1beta1.QueryVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVault"))
              .build();
        }
      }
    }
    return getQueryVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest,
      com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserExtendedPairTotalData",
      requestType = com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest,
      com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest, com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod;
    if ((getQueryUserExtendedPairTotalDataMethod = QueryGrpc.getQueryUserExtendedPairTotalDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserExtendedPairTotalDataMethod = QueryGrpc.getQueryUserExtendedPairTotalDataMethod) == null) {
          QueryGrpc.getQueryUserExtendedPairTotalDataMethod = getQueryUserExtendedPairTotalDataMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest, com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserExtendedPairTotalData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserExtendedPairTotalData"))
              .build();
        }
      }
    }
    return getQueryUserExtendedPairTotalDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultInfoByVaultID",
      requestType = com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest, com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod;
    if ((getQueryVaultInfoByVaultIDMethod = QueryGrpc.getQueryVaultInfoByVaultIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultInfoByVaultIDMethod = QueryGrpc.getQueryVaultInfoByVaultIDMethod) == null) {
          QueryGrpc.getQueryVaultInfoByVaultIDMethod = getQueryVaultInfoByVaultIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest, com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultInfoByVaultID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultInfoByVaultID"))
              .build();
        }
      }
    }
    return getQueryVaultInfoByVaultIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest,
      com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultInfoOfOwnerByApp",
      requestType = com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest,
      com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest, com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod;
    if ((getQueryVaultInfoOfOwnerByAppMethod = QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultInfoOfOwnerByAppMethod = QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod) == null) {
          QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod = getQueryVaultInfoOfOwnerByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest, com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultInfoOfOwnerByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultInfoOfOwnerByApp"))
              .build();
        }
      }
    }
    return getQueryVaultInfoOfOwnerByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsResponse> getQueryAllVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaults",
      requestType = com.comdex.vault.v1beta1.QueryAllVaultsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryAllVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsResponse> getQueryAllVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsRequest, com.comdex.vault.v1beta1.QueryAllVaultsResponse> getQueryAllVaultsMethod;
    if ((getQueryAllVaultsMethod = QueryGrpc.getQueryAllVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsMethod = QueryGrpc.getQueryAllVaultsMethod) == null) {
          QueryGrpc.getQueryAllVaultsMethod = getQueryAllVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryAllVaultsRequest, com.comdex.vault.v1beta1.QueryAllVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaults"))
              .build();
        }
      }
    }
    return getQueryAllVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultsByApp",
      requestType = com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest, com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod;
    if ((getQueryAllVaultsByAppMethod = QueryGrpc.getQueryAllVaultsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsByAppMethod = QueryGrpc.getQueryAllVaultsByAppMethod) == null) {
          QueryGrpc.getQueryAllVaultsByAppMethod = getQueryAllVaultsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest, com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultsByApp"))
              .build();
        }
      }
    }
    return getQueryAllVaultsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultsByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod;
    if ((getQueryAllVaultsByAppAndExtendedPairMethod = QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsByAppAndExtendedPairMethod = QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod = getQueryAllVaultsByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultsByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultsByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryAllVaultsByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
      com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultIDOfOwnerByExtendedPairAndApp",
      requestType = com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
      com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest, com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;
    if ((getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod) == null) {
          QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = getQueryVaultIDOfOwnerByExtendedPairAndAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest, com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultIDOfOwnerByExtendedPairAndApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultIDOfOwnerByExtendedPairAndApp"))
              .build();
        }
      }
    }
    return getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultIdsByAppInAllExtendedPairs",
      requestType = com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod;
    if ((getQueryVaultIdsByAppInAllExtendedPairsMethod = QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultIdsByAppInAllExtendedPairsMethod = QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod) == null) {
          QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod = getQueryVaultIdsByAppInAllExtendedPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultIdsByAppInAllExtendedPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultIdsByAppInAllExtendedPairs"))
              .build();
        }
      }
    }
    return getQueryVaultIdsByAppInAllExtendedPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest,
      com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultIdsByAnOwner",
      requestType = com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest,
      com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest, com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod;
    if ((getQueryAllVaultIdsByAnOwnerMethod = QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultIdsByAnOwnerMethod = QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod) == null) {
          QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod = getQueryAllVaultIdsByAnOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest, com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultIdsByAnOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultIdsByAnOwner"))
              .build();
        }
      }
    }
    return getQueryAllVaultIdsByAnOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod;
    if ((getQueryTokenMintedByAppAndExtendedPairMethod = QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedByAppAndExtendedPairMethod = QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod = getQueryTokenMintedByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryTokenMintedByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest,
      com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedAssetWiseByApp",
      requestType = com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest,
      com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest, com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod;
    if ((getQueryTokenMintedAssetWiseByAppMethod = QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedAssetWiseByAppMethod = QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod) == null) {
          QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod = getQueryTokenMintedAssetWiseByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest, com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedAssetWiseByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedAssetWiseByApp"))
              .build();
        }
      }
    }
    return getQueryTokenMintedAssetWiseByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppRequest,
      com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultCountByApp",
      requestType = com.comdex.vault.v1beta1.QueryVaultCountByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultCountByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppRequest,
      com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppRequest, com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod;
    if ((getQueryVaultCountByAppMethod = QueryGrpc.getQueryVaultCountByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultCountByAppMethod = QueryGrpc.getQueryVaultCountByAppMethod) == null) {
          QueryGrpc.getQueryVaultCountByAppMethod = getQueryVaultCountByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultCountByAppRequest, com.comdex.vault.v1beta1.QueryVaultCountByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultCountByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultCountByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultCountByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultCountByApp"))
              .build();
        }
      }
    }
    return getQueryVaultCountByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultCountByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod;
    if ((getQueryVaultCountByAppAndExtendedPairMethod = QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultCountByAppAndExtendedPairMethod = QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod = getQueryVaultCountByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultCountByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultCountByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryVaultCountByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTotalValueLockedByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod;
    if ((getQueryTotalValueLockedByAppAndExtendedPairMethod = QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTotalValueLockedByAppAndExtendedPairMethod = QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod = getQueryTotalValueLockedByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTotalValueLockedByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTotalValueLockedByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryTotalValueLockedByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairIDsByApp",
      requestType = com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest, com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod;
    if ((getQueryExtendedPairIDsByAppMethod = QueryGrpc.getQueryExtendedPairIDsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairIDsByAppMethod = QueryGrpc.getQueryExtendedPairIDsByAppMethod) == null) {
          QueryGrpc.getQueryExtendedPairIDsByAppMethod = getQueryExtendedPairIDsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest, com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairIDsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairIDsByApp"))
              .build();
        }
      }
    }
    return getQueryExtendedPairIDsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByVaultID",
      requestType = com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest, com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod;
    if ((getQueryStableVaultByVaultIDMethod = QueryGrpc.getQueryStableVaultByVaultIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByVaultIDMethod = QueryGrpc.getQueryStableVaultByVaultIDMethod) == null) {
          QueryGrpc.getQueryStableVaultByVaultIDMethod = getQueryStableVaultByVaultIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest, com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByVaultID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByVaultID"))
              .build();
        }
      }
    }
    return getQueryStableVaultByVaultIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByApp",
      requestType = com.comdex.vault.v1beta1.QueryStableVaultByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryStableVaultByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppRequest, com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod;
    if ((getQueryStableVaultByAppMethod = QueryGrpc.getQueryStableVaultByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByAppMethod = QueryGrpc.getQueryStableVaultByAppMethod) == null) {
          QueryGrpc.getQueryStableVaultByAppMethod = getQueryStableVaultByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryStableVaultByAppRequest, com.comdex.vault.v1beta1.QueryStableVaultByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByApp"))
              .build();
        }
      }
    }
    return getQueryStableVaultByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod;
    if ((getQueryStableVaultByAppAndExtendedPairMethod = QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByAppAndExtendedPairMethod = QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod = getQueryStableVaultByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryStableVaultByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVaultMappingByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;
    if ((getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVaultMappingByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVaultMappingByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVaultMappingByApp",
      requestType = com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest,
      com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest, com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod;
    if ((getQueryExtendedPairVaultMappingByAppMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultMappingByAppMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod = getQueryExtendedPairVaultMappingByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest, com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVaultMappingByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVaultMappingByApp"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultMappingByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTVLByAppOfAllExtendedPairs",
      requestType = com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod;
    if ((getQueryTVLByAppOfAllExtendedPairsMethod = QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTVLByAppOfAllExtendedPairsMethod = QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod) == null) {
          QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod = getQueryTVLByAppOfAllExtendedPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTVLByAppOfAllExtendedPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTVLByAppOfAllExtendedPairs"))
              .build();
        }
      }
    }
    return getQueryTVLByAppOfAllExtendedPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppRequest,
      com.comdex.vault.v1beta1.QueryTVLByAppResponse> getQueryTVLByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTVLByApp",
      requestType = com.comdex.vault.v1beta1.QueryTVLByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryTVLByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppRequest,
      com.comdex.vault.v1beta1.QueryTVLByAppResponse> getQueryTVLByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryTVLByAppRequest, com.comdex.vault.v1beta1.QueryTVLByAppResponse> getQueryTVLByAppMethod;
    if ((getQueryTVLByAppMethod = QueryGrpc.getQueryTVLByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTVLByAppMethod = QueryGrpc.getQueryTVLByAppMethod) == null) {
          QueryGrpc.getQueryTVLByAppMethod = getQueryTVLByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryTVLByAppRequest, com.comdex.vault.v1beta1.QueryTVLByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTVLByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTVLByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryTVLByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTVLByApp"))
              .build();
        }
      }
    }
    return getQueryTVLByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest,
      com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserMyPositionByApp",
      requestType = com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest,
      com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest, com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod;
    if ((getQueryUserMyPositionByAppMethod = QueryGrpc.getQueryUserMyPositionByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserMyPositionByAppMethod = QueryGrpc.getQueryUserMyPositionByAppMethod) == null) {
          QueryGrpc.getQueryUserMyPositionByAppMethod = getQueryUserMyPositionByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest, com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserMyPositionByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserMyPositionByApp"))
              .build();
        }
      }
    }
    return getQueryUserMyPositionByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest,
      com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPairsLockedAndMintedStatisticByApp",
      requestType = com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest,
      com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest, com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod;
    if ((getQueryPairsLockedAndMintedStatisticByAppMethod = QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPairsLockedAndMintedStatisticByAppMethod = QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod) == null) {
          QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod = getQueryPairsLockedAndMintedStatisticByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest, com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPairsLockedAndMintedStatisticByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPairsLockedAndMintedStatisticByApp"))
              .build();
        }
      }
    }
    return getQueryPairsLockedAndMintedStatisticByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest,
      com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllStableMintVaultRewards",
      requestType = com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest,
      com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest, com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod;
    if ((getQueryAllStableMintVaultRewardsMethod = QueryGrpc.getQueryAllStableMintVaultRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllStableMintVaultRewardsMethod = QueryGrpc.getQueryAllStableMintVaultRewardsMethod) == null) {
          QueryGrpc.getQueryAllStableMintVaultRewardsMethod = getQueryAllStableMintVaultRewardsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest, com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllStableMintVaultRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllStableMintVaultRewards"))
              .build();
        }
      }
    }
    return getQueryAllStableMintVaultRewardsMethod;
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
     */
    default void queryVault(com.comdex.vault.v1beta1.QueryVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultMethod(), responseObserver);
    }

    /**
     */
    default void queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserExtendedPairTotalDataMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultInfoByVaultIDMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultInfoOfOwnerByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaults(com.comdex.vault.v1beta1.QueryAllVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultIdsByAnOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedAssetWiseByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultCountByApp(com.comdex.vault.v1beta1.QueryVaultCountByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultCountByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultCountByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairIDsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByVaultIDMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByApp(com.comdex.vault.v1beta1.QueryStableVaultByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultMappingByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTVLByAppOfAllExtendedPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryTVLByApp(com.comdex.vault.v1beta1.QueryTVLByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTVLByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserMyPositionByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllStableMintVaultRewardsMethod(), responseObserver);
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
     */
    public void queryVault(com.comdex.vault.v1beta1.QueryVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserExtendedPairTotalDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultInfoByVaultIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaults(com.comdex.vault.v1beta1.QueryAllVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultCountByApp(com.comdex.vault.v1beta1.QueryVaultCountByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairIDsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByVaultIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByApp(com.comdex.vault.v1beta1.QueryStableVaultByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTVLByApp(com.comdex.vault.v1beta1.QueryTVLByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTVLByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserMyPositionByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllStableMintVaultRewardsMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.comdex.vault.v1beta1.QueryVaultResponse queryVault(com.comdex.vault.v1beta1.QueryVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserExtendedPairTotalDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultInfoByVaultIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryAllVaultsResponse queryAllVaults(com.comdex.vault.v1beta1.QueryAllVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultCountByAppResponse queryVaultCountByApp(com.comdex.vault.v1beta1.QueryVaultCountByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultCountByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairIDsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByVaultIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryStableVaultByAppResponse queryStableVaultByApp(com.comdex.vault.v1beta1.QueryStableVaultByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryTVLByAppResponse queryTVLByApp(com.comdex.vault.v1beta1.QueryTVLByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTVLByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserMyPositionByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllStableMintVaultRewardsMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultResponse> queryVault(
        com.comdex.vault.v1beta1.QueryVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse> queryUserExtendedPairTotalData(
        com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserExtendedPairTotalDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse> queryVaultInfoByVaultID(
        com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultInfoByVaultIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse> queryVaultInfoOfOwnerByApp(
        com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryAllVaultsResponse> queryAllVaults(
        com.comdex.vault.v1beta1.QueryAllVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse> queryAllVaultsByApp(
        com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse> queryAllVaultsByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> queryVaultIDOfOwnerByExtendedPairAndApp(
        com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse> queryVaultIdsByAppInAllExtendedPairs(
        com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse> queryAllVaultIdsByAnOwner(
        com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse> queryTokenMintedByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse> queryTokenMintedAssetWiseByApp(
        com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultCountByAppResponse> queryVaultCountByApp(
        com.comdex.vault.v1beta1.QueryVaultCountByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse> queryVaultCountByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse> queryTotalValueLockedByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse> queryExtendedPairIDsByApp(
        com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairIDsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse> queryStableVaultByVaultID(
        com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByVaultIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryStableVaultByAppResponse> queryStableVaultByApp(
        com.comdex.vault.v1beta1.QueryStableVaultByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse> queryStableVaultByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> queryExtendedPairVaultMappingByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse> queryExtendedPairVaultMappingByApp(
        com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse> queryTVLByAppOfAllExtendedPairs(
        com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryTVLByAppResponse> queryTVLByApp(
        com.comdex.vault.v1beta1.QueryTVLByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTVLByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse> queryUserMyPositionByApp(
        com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserMyPositionByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse> queryPairsLockedAndMintedStatisticByApp(
        com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse> queryAllStableMintVaultRewards(
        com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllStableMintVaultRewardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_VAULT = 0;
  private static final int METHODID_QUERY_USER_EXTENDED_PAIR_TOTAL_DATA = 1;
  private static final int METHODID_QUERY_VAULT_INFO_BY_VAULT_ID = 2;
  private static final int METHODID_QUERY_VAULT_INFO_OF_OWNER_BY_APP = 3;
  private static final int METHODID_QUERY_ALL_VAULTS = 4;
  private static final int METHODID_QUERY_ALL_VAULTS_BY_APP = 5;
  private static final int METHODID_QUERY_ALL_VAULTS_BY_APP_AND_EXTENDED_PAIR = 6;
  private static final int METHODID_QUERY_VAULT_IDOF_OWNER_BY_EXTENDED_PAIR_AND_APP = 7;
  private static final int METHODID_QUERY_VAULT_IDS_BY_APP_IN_ALL_EXTENDED_PAIRS = 8;
  private static final int METHODID_QUERY_ALL_VAULT_IDS_BY_AN_OWNER = 9;
  private static final int METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_EXTENDED_PAIR = 10;
  private static final int METHODID_QUERY_TOKEN_MINTED_ASSET_WISE_BY_APP = 11;
  private static final int METHODID_QUERY_VAULT_COUNT_BY_APP = 12;
  private static final int METHODID_QUERY_VAULT_COUNT_BY_APP_AND_EXTENDED_PAIR = 13;
  private static final int METHODID_QUERY_TOTAL_VALUE_LOCKED_BY_APP_AND_EXTENDED_PAIR = 14;
  private static final int METHODID_QUERY_EXTENDED_PAIR_IDS_BY_APP = 15;
  private static final int METHODID_QUERY_STABLE_VAULT_BY_VAULT_ID = 16;
  private static final int METHODID_QUERY_STABLE_VAULT_BY_APP = 17;
  private static final int METHODID_QUERY_STABLE_VAULT_BY_APP_AND_EXTENDED_PAIR = 18;
  private static final int METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP_AND_EXTENDED_PAIR = 19;
  private static final int METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP = 20;
  private static final int METHODID_QUERY_TVLBY_APP_OF_ALL_EXTENDED_PAIRS = 21;
  private static final int METHODID_QUERY_TVLBY_APP = 22;
  private static final int METHODID_QUERY_USER_MY_POSITION_BY_APP = 23;
  private static final int METHODID_QUERY_PAIRS_LOCKED_AND_MINTED_STATISTIC_BY_APP = 24;
  private static final int METHODID_QUERY_ALL_STABLE_MINT_VAULT_REWARDS = 25;

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
        case METHODID_QUERY_VAULT:
          serviceImpl.queryVault((com.comdex.vault.v1beta1.QueryVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_EXTENDED_PAIR_TOTAL_DATA:
          serviceImpl.queryUserExtendedPairTotalData((com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_INFO_BY_VAULT_ID:
          serviceImpl.queryVaultInfoByVaultID((com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_INFO_OF_OWNER_BY_APP:
          serviceImpl.queryVaultInfoOfOwnerByApp((com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS:
          serviceImpl.queryAllVaults((com.comdex.vault.v1beta1.QueryAllVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS_BY_APP:
          serviceImpl.queryAllVaultsByApp((com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryAllVaultsByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_IDOF_OWNER_BY_EXTENDED_PAIR_AND_APP:
          serviceImpl.queryVaultIDOfOwnerByExtendedPairAndApp((com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_IDS_BY_APP_IN_ALL_EXTENDED_PAIRS:
          serviceImpl.queryVaultIdsByAppInAllExtendedPairs((com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULT_IDS_BY_AN_OWNER:
          serviceImpl.queryAllVaultIdsByAnOwner((com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryTokenMintedByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_ASSET_WISE_BY_APP:
          serviceImpl.queryTokenMintedAssetWiseByApp((com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_COUNT_BY_APP:
          serviceImpl.queryVaultCountByApp((com.comdex.vault.v1beta1.QueryVaultCountByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_COUNT_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryVaultCountByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOTAL_VALUE_LOCKED_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryTotalValueLockedByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_IDS_BY_APP:
          serviceImpl.queryExtendedPairIDsByApp((com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_VAULT_ID:
          serviceImpl.queryStableVaultByVaultID((com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_APP:
          serviceImpl.queryStableVaultByApp((com.comdex.vault.v1beta1.QueryStableVaultByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryStableVaultByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryExtendedPairVaultMappingByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP:
          serviceImpl.queryExtendedPairVaultMappingByApp((com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_TVLBY_APP_OF_ALL_EXTENDED_PAIRS:
          serviceImpl.queryTVLByAppOfAllExtendedPairs((com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_TVLBY_APP:
          serviceImpl.queryTVLByApp((com.comdex.vault.v1beta1.QueryTVLByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryTVLByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_MY_POSITION_BY_APP:
          serviceImpl.queryUserMyPositionByApp((com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAIRS_LOCKED_AND_MINTED_STATISTIC_BY_APP:
          serviceImpl.queryPairsLockedAndMintedStatisticByApp((com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_STABLE_MINT_VAULT_REWARDS:
          serviceImpl.queryAllStableMintVaultRewards((com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse>) responseObserver);
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
          getQueryVaultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultRequest,
              com.comdex.vault.v1beta1.QueryVaultResponse>(
                service, METHODID_QUERY_VAULT)))
        .addMethod(
          getQueryUserExtendedPairTotalDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest,
              com.comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse>(
                service, METHODID_QUERY_USER_EXTENDED_PAIR_TOTAL_DATA)))
        .addMethod(
          getQueryVaultInfoByVaultIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest,
              com.comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse>(
                service, METHODID_QUERY_VAULT_INFO_BY_VAULT_ID)))
        .addMethod(
          getQueryVaultInfoOfOwnerByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest,
              com.comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse>(
                service, METHODID_QUERY_VAULT_INFO_OF_OWNER_BY_APP)))
        .addMethod(
          getQueryAllVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryAllVaultsRequest,
              com.comdex.vault.v1beta1.QueryAllVaultsResponse>(
                service, METHODID_QUERY_ALL_VAULTS)))
        .addMethod(
          getQueryAllVaultsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryAllVaultsByAppRequest,
              com.comdex.vault.v1beta1.QueryAllVaultsByAppResponse>(
                service, METHODID_QUERY_ALL_VAULTS_BY_APP)))
        .addMethod(
          getQueryAllVaultsByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_ALL_VAULTS_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
              com.comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>(
                service, METHODID_QUERY_VAULT_IDOF_OWNER_BY_EXTENDED_PAIR_AND_APP)))
        .addMethod(
          getQueryVaultIdsByAppInAllExtendedPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest,
              com.comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse>(
                service, METHODID_QUERY_VAULT_IDS_BY_APP_IN_ALL_EXTENDED_PAIRS)))
        .addMethod(
          getQueryAllVaultIdsByAnOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest,
              com.comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse>(
                service, METHODID_QUERY_ALL_VAULT_IDS_BY_AN_OWNER)))
        .addMethod(
          getQueryTokenMintedByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryTokenMintedAssetWiseByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest,
              com.comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_ASSET_WISE_BY_APP)))
        .addMethod(
          getQueryVaultCountByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultCountByAppRequest,
              com.comdex.vault.v1beta1.QueryVaultCountByAppResponse>(
                service, METHODID_QUERY_VAULT_COUNT_BY_APP)))
        .addMethod(
          getQueryVaultCountByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_VAULT_COUNT_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryTotalValueLockedByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_TOTAL_VALUE_LOCKED_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairIDsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest,
              com.comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_IDS_BY_APP)))
        .addMethod(
          getQueryStableVaultByVaultIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest,
              com.comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_VAULT_ID)))
        .addMethod(
          getQueryStableVaultByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryStableVaultByAppRequest,
              com.comdex.vault.v1beta1.QueryStableVaultByAppResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_APP)))
        .addMethod(
          getQueryStableVaultByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairVaultMappingByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest,
              com.comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP)))
        .addMethod(
          getQueryTVLByAppOfAllExtendedPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest,
              com.comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse>(
                service, METHODID_QUERY_TVLBY_APP_OF_ALL_EXTENDED_PAIRS)))
        .addMethod(
          getQueryTVLByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryTVLByAppRequest,
              com.comdex.vault.v1beta1.QueryTVLByAppResponse>(
                service, METHODID_QUERY_TVLBY_APP)))
        .addMethod(
          getQueryUserMyPositionByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryUserMyPositionByAppRequest,
              com.comdex.vault.v1beta1.QueryUserMyPositionByAppResponse>(
                service, METHODID_QUERY_USER_MY_POSITION_BY_APP)))
        .addMethod(
          getQueryPairsLockedAndMintedStatisticByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest,
              com.comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse>(
                service, METHODID_QUERY_PAIRS_LOCKED_AND_MINTED_STATISTIC_BY_APP)))
        .addMethod(
          getQueryAllStableMintVaultRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest,
              com.comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse>(
                service, METHODID_QUERY_ALL_STABLE_MINT_VAULT_REWARDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.vault.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQueryVaultMethod())
              .addMethod(getQueryUserExtendedPairTotalDataMethod())
              .addMethod(getQueryVaultInfoByVaultIDMethod())
              .addMethod(getQueryVaultInfoOfOwnerByAppMethod())
              .addMethod(getQueryAllVaultsMethod())
              .addMethod(getQueryAllVaultsByAppMethod())
              .addMethod(getQueryAllVaultsByAppAndExtendedPairMethod())
              .addMethod(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod())
              .addMethod(getQueryVaultIdsByAppInAllExtendedPairsMethod())
              .addMethod(getQueryAllVaultIdsByAnOwnerMethod())
              .addMethod(getQueryTokenMintedByAppAndExtendedPairMethod())
              .addMethod(getQueryTokenMintedAssetWiseByAppMethod())
              .addMethod(getQueryVaultCountByAppMethod())
              .addMethod(getQueryVaultCountByAppAndExtendedPairMethod())
              .addMethod(getQueryTotalValueLockedByAppAndExtendedPairMethod())
              .addMethod(getQueryExtendedPairIDsByAppMethod())
              .addMethod(getQueryStableVaultByVaultIDMethod())
              .addMethod(getQueryStableVaultByAppMethod())
              .addMethod(getQueryStableVaultByAppAndExtendedPairMethod())
              .addMethod(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod())
              .addMethod(getQueryExtendedPairVaultMappingByAppMethod())
              .addMethod(getQueryTVLByAppOfAllExtendedPairsMethod())
              .addMethod(getQueryTVLByAppMethod())
              .addMethod(getQueryUserMyPositionByAppMethod())
              .addMethod(getQueryPairsLockedAndMintedStatisticByAppMethod())
              .addMethod(getQueryAllStableMintVaultRewardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
