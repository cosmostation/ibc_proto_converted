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
  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> getQueryVaultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVault",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> getQueryVaultMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> getQueryVaultMethod;
    if ((getQueryVaultMethod = QueryGrpc.getQueryVaultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultMethod = QueryGrpc.getQueryVaultMethod) == null) {
          QueryGrpc.getQueryVaultMethod = getQueryVaultMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVault"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVault"))
              .build();
        }
      }
    }
    return getQueryVaultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserExtendedPairTotalData",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest, com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> getQueryUserExtendedPairTotalDataMethod;
    if ((getQueryUserExtendedPairTotalDataMethod = QueryGrpc.getQueryUserExtendedPairTotalDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserExtendedPairTotalDataMethod = QueryGrpc.getQueryUserExtendedPairTotalDataMethod) == null) {
          QueryGrpc.getQueryUserExtendedPairTotalDataMethod = getQueryUserExtendedPairTotalDataMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest, com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserExtendedPairTotalData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserExtendedPairTotalData"))
              .build();
        }
      }
    }
    return getQueryUserExtendedPairTotalDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultInfoByVaultID",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> getQueryVaultInfoByVaultIDMethod;
    if ((getQueryVaultInfoByVaultIDMethod = QueryGrpc.getQueryVaultInfoByVaultIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultInfoByVaultIDMethod = QueryGrpc.getQueryVaultInfoByVaultIDMethod) == null) {
          QueryGrpc.getQueryVaultInfoByVaultIDMethod = getQueryVaultInfoByVaultIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultInfoByVaultID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultInfoByVaultID"))
              .build();
        }
      }
    }
    return getQueryVaultInfoByVaultIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultInfoOfOwnerByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> getQueryVaultInfoOfOwnerByAppMethod;
    if ((getQueryVaultInfoOfOwnerByAppMethod = QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultInfoOfOwnerByAppMethod = QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod) == null) {
          QueryGrpc.getQueryVaultInfoOfOwnerByAppMethod = getQueryVaultInfoOfOwnerByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultInfoOfOwnerByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultInfoOfOwnerByApp"))
              .build();
        }
      }
    }
    return getQueryVaultInfoOfOwnerByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> getQueryAllVaultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaults",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> getQueryAllVaultsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> getQueryAllVaultsMethod;
    if ((getQueryAllVaultsMethod = QueryGrpc.getQueryAllVaultsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsMethod = QueryGrpc.getQueryAllVaultsMethod) == null) {
          QueryGrpc.getQueryAllVaultsMethod = getQueryAllVaultsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaults"))
              .build();
        }
      }
    }
    return getQueryAllVaultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultsByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> getQueryAllVaultsByAppMethod;
    if ((getQueryAllVaultsByAppMethod = QueryGrpc.getQueryAllVaultsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsByAppMethod = QueryGrpc.getQueryAllVaultsByAppMethod) == null) {
          QueryGrpc.getQueryAllVaultsByAppMethod = getQueryAllVaultsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultsByApp"))
              .build();
        }
      }
    }
    return getQueryAllVaultsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultsByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> getQueryAllVaultsByAppAndExtendedPairMethod;
    if ((getQueryAllVaultsByAppAndExtendedPairMethod = QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultsByAppAndExtendedPairMethod = QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryAllVaultsByAppAndExtendedPairMethod = getQueryAllVaultsByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultsByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultsByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryAllVaultsByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultIDOfOwnerByExtendedPairAndApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;
    if ((getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod) == null) {
          QueryGrpc.getQueryVaultIDOfOwnerByExtendedPairAndAppMethod = getQueryVaultIDOfOwnerByExtendedPairAndAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultIDOfOwnerByExtendedPairAndApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultIDOfOwnerByExtendedPairAndApp"))
              .build();
        }
      }
    }
    return getQueryVaultIDOfOwnerByExtendedPairAndAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultIdsByAppInAllExtendedPairs",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> getQueryVaultIdsByAppInAllExtendedPairsMethod;
    if ((getQueryVaultIdsByAppInAllExtendedPairsMethod = QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultIdsByAppInAllExtendedPairsMethod = QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod) == null) {
          QueryGrpc.getQueryVaultIdsByAppInAllExtendedPairsMethod = getQueryVaultIdsByAppInAllExtendedPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultIdsByAppInAllExtendedPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultIdsByAppInAllExtendedPairs"))
              .build();
        }
      }
    }
    return getQueryVaultIdsByAppInAllExtendedPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllVaultIdsByAnOwner",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> getQueryAllVaultIdsByAnOwnerMethod;
    if ((getQueryAllVaultIdsByAnOwnerMethod = QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllVaultIdsByAnOwnerMethod = QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod) == null) {
          QueryGrpc.getQueryAllVaultIdsByAnOwnerMethod = getQueryAllVaultIdsByAnOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllVaultIdsByAnOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllVaultIdsByAnOwner"))
              .build();
        }
      }
    }
    return getQueryAllVaultIdsByAnOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> getQueryTokenMintedByAppAndExtendedPairMethod;
    if ((getQueryTokenMintedByAppAndExtendedPairMethod = QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedByAppAndExtendedPairMethod = QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryTokenMintedByAppAndExtendedPairMethod = getQueryTokenMintedByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryTokenMintedByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTokenMintedAssetWiseByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> getQueryTokenMintedAssetWiseByAppMethod;
    if ((getQueryTokenMintedAssetWiseByAppMethod = QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTokenMintedAssetWiseByAppMethod = QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod) == null) {
          QueryGrpc.getQueryTokenMintedAssetWiseByAppMethod = getQueryTokenMintedAssetWiseByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTokenMintedAssetWiseByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTokenMintedAssetWiseByApp"))
              .build();
        }
      }
    }
    return getQueryTokenMintedAssetWiseByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultCountByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> getQueryVaultCountByAppMethod;
    if ((getQueryVaultCountByAppMethod = QueryGrpc.getQueryVaultCountByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultCountByAppMethod = QueryGrpc.getQueryVaultCountByAppMethod) == null) {
          QueryGrpc.getQueryVaultCountByAppMethod = getQueryVaultCountByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultCountByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultCountByApp"))
              .build();
        }
      }
    }
    return getQueryVaultCountByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryVaultCountByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> getQueryVaultCountByAppAndExtendedPairMethod;
    if ((getQueryVaultCountByAppAndExtendedPairMethod = QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryVaultCountByAppAndExtendedPairMethod = QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryVaultCountByAppAndExtendedPairMethod = getQueryVaultCountByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryVaultCountByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryVaultCountByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryVaultCountByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTotalValueLockedByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> getQueryTotalValueLockedByAppAndExtendedPairMethod;
    if ((getQueryTotalValueLockedByAppAndExtendedPairMethod = QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTotalValueLockedByAppAndExtendedPairMethod = QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryTotalValueLockedByAppAndExtendedPairMethod = getQueryTotalValueLockedByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTotalValueLockedByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTotalValueLockedByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryTotalValueLockedByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairIDsByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> getQueryExtendedPairIDsByAppMethod;
    if ((getQueryExtendedPairIDsByAppMethod = QueryGrpc.getQueryExtendedPairIDsByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairIDsByAppMethod = QueryGrpc.getQueryExtendedPairIDsByAppMethod) == null) {
          QueryGrpc.getQueryExtendedPairIDsByAppMethod = getQueryExtendedPairIDsByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairIDsByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairIDsByApp"))
              .build();
        }
      }
    }
    return getQueryExtendedPairIDsByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByVaultID",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> getQueryStableVaultByVaultIDMethod;
    if ((getQueryStableVaultByVaultIDMethod = QueryGrpc.getQueryStableVaultByVaultIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByVaultIDMethod = QueryGrpc.getQueryStableVaultByVaultIDMethod) == null) {
          QueryGrpc.getQueryStableVaultByVaultIDMethod = getQueryStableVaultByVaultIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByVaultID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByVaultID"))
              .build();
        }
      }
    }
    return getQueryStableVaultByVaultIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> getQueryStableVaultByAppMethod;
    if ((getQueryStableVaultByAppMethod = QueryGrpc.getQueryStableVaultByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByAppMethod = QueryGrpc.getQueryStableVaultByAppMethod) == null) {
          QueryGrpc.getQueryStableVaultByAppMethod = getQueryStableVaultByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByApp"))
              .build();
        }
      }
    }
    return getQueryStableVaultByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStableVaultByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> getQueryStableVaultByAppAndExtendedPairMethod;
    if ((getQueryStableVaultByAppAndExtendedPairMethod = QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryStableVaultByAppAndExtendedPairMethod = QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryStableVaultByAppAndExtendedPairMethod = getQueryStableVaultByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStableVaultByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryStableVaultByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryStableVaultByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVaultMappingByAppAndExtendedPair",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;
    if ((getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod = getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVaultMappingByAppAndExtendedPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVaultMappingByAppAndExtendedPair"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryExtendedPairVaultMappingByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> getQueryExtendedPairVaultMappingByAppMethod;
    if ((getQueryExtendedPairVaultMappingByAppMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryExtendedPairVaultMappingByAppMethod = QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod) == null) {
          QueryGrpc.getQueryExtendedPairVaultMappingByAppMethod = getQueryExtendedPairVaultMappingByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryExtendedPairVaultMappingByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryExtendedPairVaultMappingByApp"))
              .build();
        }
      }
    }
    return getQueryExtendedPairVaultMappingByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTVLByAppOfAllExtendedPairs",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> getQueryTVLByAppOfAllExtendedPairsMethod;
    if ((getQueryTVLByAppOfAllExtendedPairsMethod = QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTVLByAppOfAllExtendedPairsMethod = QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod) == null) {
          QueryGrpc.getQueryTVLByAppOfAllExtendedPairsMethod = getQueryTVLByAppOfAllExtendedPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest, com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTVLByAppOfAllExtendedPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTVLByAppOfAllExtendedPairs"))
              .build();
        }
      }
    }
    return getQueryTVLByAppOfAllExtendedPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> getQueryTVLByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTVLByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> getQueryTVLByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> getQueryTVLByAppMethod;
    if ((getQueryTVLByAppMethod = QueryGrpc.getQueryTVLByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTVLByAppMethod = QueryGrpc.getQueryTVLByAppMethod) == null) {
          QueryGrpc.getQueryTVLByAppMethod = getQueryTVLByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTVLByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTVLByApp"))
              .build();
        }
      }
    }
    return getQueryTVLByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUserMyPositionByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> getQueryUserMyPositionByAppMethod;
    if ((getQueryUserMyPositionByAppMethod = QueryGrpc.getQueryUserMyPositionByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUserMyPositionByAppMethod = QueryGrpc.getQueryUserMyPositionByAppMethod) == null) {
          QueryGrpc.getQueryUserMyPositionByAppMethod = getQueryUserMyPositionByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUserMyPositionByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUserMyPositionByApp"))
              .build();
        }
      }
    }
    return getQueryUserMyPositionByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPairsLockedAndMintedStatisticByApp",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> getQueryPairsLockedAndMintedStatisticByAppMethod;
    if ((getQueryPairsLockedAndMintedStatisticByAppMethod = QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPairsLockedAndMintedStatisticByAppMethod = QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod) == null) {
          QueryGrpc.getQueryPairsLockedAndMintedStatisticByAppMethod = getQueryPairsLockedAndMintedStatisticByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest, com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPairsLockedAndMintedStatisticByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPairsLockedAndMintedStatisticByApp"))
              .build();
        }
      }
    }
    return getQueryPairsLockedAndMintedStatisticByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllStableMintVaultRewards",
      requestType = com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest.class,
      responseType = com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest,
      com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> getQueryAllStableMintVaultRewardsMethod;
    if ((getQueryAllStableMintVaultRewardsMethod = QueryGrpc.getQueryAllStableMintVaultRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllStableMintVaultRewardsMethod = QueryGrpc.getQueryAllStableMintVaultRewardsMethod) == null) {
          QueryGrpc.getQueryAllStableMintVaultRewardsMethod = getQueryAllStableMintVaultRewardsMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest, com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllStableMintVaultRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse.getDefaultInstance()))
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
    default void queryVault(com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultMethod(), responseObserver);
    }

    /**
     */
    default void queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserExtendedPairTotalDataMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultInfoByVaultIDMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultInfoOfOwnerByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaults(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultsByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllVaultIdsByAnOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTokenMintedAssetWiseByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultCountByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultCountByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryVaultCountByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairIDsByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByVaultIDMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByApp(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStableVaultByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), responseObserver);
    }

    /**
     */
    default void queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryExtendedPairVaultMappingByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTVLByAppOfAllExtendedPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryTVLByApp(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTVLByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUserMyPositionByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> responseObserver) {
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
    public void queryVault(com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserExtendedPairTotalDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultInfoByVaultIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaults(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultCountByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairIDsByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByVaultIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByApp(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTVLByApp(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTVLByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUserMyPositionByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> responseObserver) {
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
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse queryVault(com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse queryUserExtendedPairTotalData(com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserExtendedPairTotalDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse queryVaultInfoByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultInfoByVaultIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse queryVaultInfoOfOwnerByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse queryAllVaults(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse queryAllVaultsByApp(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse queryAllVaultsByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse queryVaultIDOfOwnerByExtendedPairAndApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse queryVaultIdsByAppInAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse queryAllVaultIdsByAnOwner(com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse queryTokenMintedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse queryTokenMintedAssetWiseByApp(com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse queryVaultCountByApp(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultCountByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse queryVaultCountByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse queryTotalValueLockedByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse queryExtendedPairIDsByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairIDsByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse queryStableVaultByVaultID(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByVaultIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse queryStableVaultByApp(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse queryStableVaultByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse queryExtendedPairVaultMappingByAppAndExtendedPair(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse queryExtendedPairVaultMappingByApp(com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse queryTVLByAppOfAllExtendedPairs(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse queryTVLByApp(com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTVLByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse queryUserMyPositionByApp(com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUserMyPositionByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse queryPairsLockedAndMintedStatisticByApp(com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse queryAllStableMintVaultRewards(com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse> queryVault(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse> queryUserExtendedPairTotalData(
        com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserExtendedPairTotalDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse> queryVaultInfoByVaultID(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultInfoByVaultIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse> queryVaultInfoOfOwnerByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultInfoOfOwnerByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse> queryAllVaults(
        com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse> queryAllVaultsByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse> queryAllVaultsByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultsByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse> queryVaultIDOfOwnerByExtendedPairAndApp(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse> queryVaultIdsByAppInAllExtendedPairs(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultIdsByAppInAllExtendedPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse> queryAllVaultIdsByAnOwner(
        com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllVaultIdsByAnOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse> queryTokenMintedByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse> queryTokenMintedAssetWiseByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTokenMintedAssetWiseByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse> queryVaultCountByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse> queryVaultCountByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryVaultCountByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse> queryTotalValueLockedByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTotalValueLockedByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse> queryExtendedPairIDsByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairIDsByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse> queryStableVaultByVaultID(
        com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByVaultIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse> queryStableVaultByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse> queryStableVaultByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStableVaultByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse> queryExtendedPairVaultMappingByAppAndExtendedPair(
        com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse> queryExtendedPairVaultMappingByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryExtendedPairVaultMappingByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse> queryTVLByAppOfAllExtendedPairs(
        com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTVLByAppOfAllExtendedPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse> queryTVLByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTVLByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse> queryUserMyPositionByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUserMyPositionByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse> queryPairsLockedAndMintedStatisticByApp(
        com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPairsLockedAndMintedStatisticByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse> queryAllStableMintVaultRewards(
        com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest request) {
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
          serviceImpl.queryVault((com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_EXTENDED_PAIR_TOTAL_DATA:
          serviceImpl.queryUserExtendedPairTotalData((com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_INFO_BY_VAULT_ID:
          serviceImpl.queryVaultInfoByVaultID((com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_INFO_OF_OWNER_BY_APP:
          serviceImpl.queryVaultInfoOfOwnerByApp((com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS:
          serviceImpl.queryAllVaults((com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS_BY_APP:
          serviceImpl.queryAllVaultsByApp((com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULTS_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryAllVaultsByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_IDOF_OWNER_BY_EXTENDED_PAIR_AND_APP:
          serviceImpl.queryVaultIDOfOwnerByExtendedPairAndApp((com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_IDS_BY_APP_IN_ALL_EXTENDED_PAIRS:
          serviceImpl.queryVaultIdsByAppInAllExtendedPairs((com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_VAULT_IDS_BY_AN_OWNER:
          serviceImpl.queryAllVaultIdsByAnOwner((com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryTokenMintedByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOKEN_MINTED_ASSET_WISE_BY_APP:
          serviceImpl.queryTokenMintedAssetWiseByApp((com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_COUNT_BY_APP:
          serviceImpl.queryVaultCountByApp((com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_VAULT_COUNT_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryVaultCountByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOTAL_VALUE_LOCKED_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryTotalValueLockedByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_IDS_BY_APP:
          serviceImpl.queryExtendedPairIDsByApp((com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_VAULT_ID:
          serviceImpl.queryStableVaultByVaultID((com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_APP:
          serviceImpl.queryStableVaultByApp((com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_STABLE_VAULT_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryStableVaultByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP_AND_EXTENDED_PAIR:
          serviceImpl.queryExtendedPairVaultMappingByAppAndExtendedPair((com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP:
          serviceImpl.queryExtendedPairVaultMappingByApp((com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_TVLBY_APP_OF_ALL_EXTENDED_PAIRS:
          serviceImpl.queryTVLByAppOfAllExtendedPairs((com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_TVLBY_APP:
          serviceImpl.queryTVLByApp((com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_MY_POSITION_BY_APP:
          serviceImpl.queryUserMyPositionByApp((com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAIRS_LOCKED_AND_MINTED_STATISTIC_BY_APP:
          serviceImpl.queryPairsLockedAndMintedStatisticByApp((com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_STABLE_MINT_VAULT_REWARDS:
          serviceImpl.queryAllStableMintVaultRewards((com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse>) responseObserver);
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
              com.comdex.vault.v1beta1.QueryProto.QueryVaultRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultResponse>(
                service, METHODID_QUERY_VAULT)))
        .addMethod(
          getQueryUserExtendedPairTotalDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryUserExtendedPairTotalDataResponse>(
                service, METHODID_QUERY_USER_EXTENDED_PAIR_TOTAL_DATA)))
        .addMethod(
          getQueryVaultInfoByVaultIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoByVaultIDResponse>(
                service, METHODID_QUERY_VAULT_INFO_BY_VAULT_ID)))
        .addMethod(
          getQueryVaultInfoOfOwnerByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultInfoOfOwnerByAppResponse>(
                service, METHODID_QUERY_VAULT_INFO_OF_OWNER_BY_APP)))
        .addMethod(
          getQueryAllVaultsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsResponse>(
                service, METHODID_QUERY_ALL_VAULTS)))
        .addMethod(
          getQueryAllVaultsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppResponse>(
                service, METHODID_QUERY_ALL_VAULTS_BY_APP)))
        .addMethod(
          getQueryAllVaultsByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultsByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_ALL_VAULTS_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryVaultIDOfOwnerByExtendedPairAndAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultIDOfOwnerByExtendedPairAndAppResponse>(
                service, METHODID_QUERY_VAULT_IDOF_OWNER_BY_EXTENDED_PAIR_AND_APP)))
        .addMethod(
          getQueryVaultIdsByAppInAllExtendedPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultIdsByAppInAllExtendedPairsResponse>(
                service, METHODID_QUERY_VAULT_IDS_BY_APP_IN_ALL_EXTENDED_PAIRS)))
        .addMethod(
          getQueryAllVaultIdsByAnOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryAllVaultIdsByAnOwnerResponse>(
                service, METHODID_QUERY_ALL_VAULT_IDS_BY_AN_OWNER)))
        .addMethod(
          getQueryTokenMintedByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryTokenMintedAssetWiseByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryTokenMintedAssetWiseByAppResponse>(
                service, METHODID_QUERY_TOKEN_MINTED_ASSET_WISE_BY_APP)))
        .addMethod(
          getQueryVaultCountByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppResponse>(
                service, METHODID_QUERY_VAULT_COUNT_BY_APP)))
        .addMethod(
          getQueryVaultCountByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryVaultCountByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_VAULT_COUNT_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryTotalValueLockedByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryTotalValueLockedByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_TOTAL_VALUE_LOCKED_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairIDsByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairIDsByAppResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_IDS_BY_APP)))
        .addMethod(
          getQueryStableVaultByVaultIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByVaultIDResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_VAULT_ID)))
        .addMethod(
          getQueryStableVaultByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_APP)))
        .addMethod(
          getQueryStableVaultByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryStableVaultByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_STABLE_VAULT_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairVaultMappingByAppAndExtendedPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP_AND_EXTENDED_PAIR)))
        .addMethod(
          getQueryExtendedPairVaultMappingByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryExtendedPairVaultMappingByAppResponse>(
                service, METHODID_QUERY_EXTENDED_PAIR_VAULT_MAPPING_BY_APP)))
        .addMethod(
          getQueryTVLByAppOfAllExtendedPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppOfAllExtendedPairsResponse>(
                service, METHODID_QUERY_TVLBY_APP_OF_ALL_EXTENDED_PAIRS)))
        .addMethod(
          getQueryTVLByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryTVLByAppResponse>(
                service, METHODID_QUERY_TVLBY_APP)))
        .addMethod(
          getQueryUserMyPositionByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryUserMyPositionByAppResponse>(
                service, METHODID_QUERY_USER_MY_POSITION_BY_APP)))
        .addMethod(
          getQueryPairsLockedAndMintedStatisticByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryPairsLockedAndMintedStatisticByAppResponse>(
                service, METHODID_QUERY_PAIRS_LOCKED_AND_MINTED_STATISTIC_BY_APP)))
        .addMethod(
          getQueryAllStableMintVaultRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsRequest,
              com.comdex.vault.v1beta1.QueryProto.QueryAllStableMintVaultRewardsResponse>(
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
