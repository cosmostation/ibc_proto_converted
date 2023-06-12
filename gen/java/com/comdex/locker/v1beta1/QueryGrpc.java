package com.comdex.locker.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/locker/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.locker.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoRequest,
      com.comdex.locker.v1beta1.QueryLockerInfoResponse> getQueryLockerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerInfo",
      requestType = com.comdex.locker.v1beta1.QueryLockerInfoRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoRequest,
      com.comdex.locker.v1beta1.QueryLockerInfoResponse> getQueryLockerInfoMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoRequest, com.comdex.locker.v1beta1.QueryLockerInfoResponse> getQueryLockerInfoMethod;
    if ((getQueryLockerInfoMethod = QueryGrpc.getQueryLockerInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerInfoMethod = QueryGrpc.getQueryLockerInfoMethod) == null) {
          QueryGrpc.getQueryLockerInfoMethod = getQueryLockerInfoMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerInfoRequest, com.comdex.locker.v1beta1.QueryLockerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerInfo"))
              .build();
        }
      }
    }
    return getQueryLockerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> getQueryLockersByAppToAssetIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockersByAppToAssetID",
      requestType = com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> getQueryLockersByAppToAssetIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest, com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> getQueryLockersByAppToAssetIDMethod;
    if ((getQueryLockersByAppToAssetIDMethod = QueryGrpc.getQueryLockersByAppToAssetIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockersByAppToAssetIDMethod = QueryGrpc.getQueryLockersByAppToAssetIDMethod) == null) {
          QueryGrpc.getQueryLockersByAppToAssetIDMethod = getQueryLockersByAppToAssetIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest, com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockersByAppToAssetID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockersByAppToAssetID"))
              .build();
        }
      }
    }
    return getQueryLockersByAppToAssetIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest,
      com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> getQueryLockerInfoByAppIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerInfoByAppID",
      requestType = com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest,
      com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> getQueryLockerInfoByAppIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest, com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> getQueryLockerInfoByAppIDMethod;
    if ((getQueryLockerInfoByAppIDMethod = QueryGrpc.getQueryLockerInfoByAppIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerInfoByAppIDMethod = QueryGrpc.getQueryLockerInfoByAppIDMethod) == null) {
          QueryGrpc.getQueryLockerInfoByAppIDMethod = getQueryLockerInfoByAppIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest, com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerInfoByAppID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerInfoByAppID"))
              .build();
        }
      }
    }
    return getQueryLockerInfoByAppIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest,
      com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> getQueryTotalDepositByAppAndAssetIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryTotalDepositByAppAndAssetID",
      requestType = com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest,
      com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> getQueryTotalDepositByAppAndAssetIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest, com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> getQueryTotalDepositByAppAndAssetIDMethod;
    if ((getQueryTotalDepositByAppAndAssetIDMethod = QueryGrpc.getQueryTotalDepositByAppAndAssetIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryTotalDepositByAppAndAssetIDMethod = QueryGrpc.getQueryTotalDepositByAppAndAssetIDMethod) == null) {
          QueryGrpc.getQueryTotalDepositByAppAndAssetIDMethod = getQueryTotalDepositByAppAndAssetIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest, com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryTotalDepositByAppAndAssetID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryTotalDepositByAppAndAssetID"))
              .build();
        }
      }
    }
    return getQueryTotalDepositByAppAndAssetIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> getQueryOwnerLockerByAppIDbyOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryOwnerLockerByAppIDbyOwner",
      requestType = com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> getQueryOwnerLockerByAppIDbyOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> getQueryOwnerLockerByAppIDbyOwnerMethod;
    if ((getQueryOwnerLockerByAppIDbyOwnerMethod = QueryGrpc.getQueryOwnerLockerByAppIDbyOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryOwnerLockerByAppIDbyOwnerMethod = QueryGrpc.getQueryOwnerLockerByAppIDbyOwnerMethod) == null) {
          QueryGrpc.getQueryOwnerLockerByAppIDbyOwnerMethod = getQueryOwnerLockerByAppIDbyOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryOwnerLockerByAppIDbyOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryOwnerLockerByAppIDbyOwner"))
              .build();
        }
      }
    }
    return getQueryOwnerLockerByAppIDbyOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> getQueryOwnerLockerOfAllAppsByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryOwnerLockerOfAllAppsByOwner",
      requestType = com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> getQueryOwnerLockerOfAllAppsByOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> getQueryOwnerLockerOfAllAppsByOwnerMethod;
    if ((getQueryOwnerLockerOfAllAppsByOwnerMethod = QueryGrpc.getQueryOwnerLockerOfAllAppsByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryOwnerLockerOfAllAppsByOwnerMethod = QueryGrpc.getQueryOwnerLockerOfAllAppsByOwnerMethod) == null) {
          QueryGrpc.getQueryOwnerLockerOfAllAppsByOwnerMethod = getQueryOwnerLockerOfAllAppsByOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryOwnerLockerOfAllAppsByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryOwnerLockerOfAllAppsByOwner"))
              .build();
        }
      }
    }
    return getQueryOwnerLockerOfAllAppsByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
      com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryOwnerTxDetailsLockerOfAppByOwnerByAsset",
      requestType = com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
      com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest, com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod;
    if ((getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod = QueryGrpc.getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod = QueryGrpc.getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod) == null) {
          QueryGrpc.getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod = getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest, com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryOwnerTxDetailsLockerOfAppByOwnerByAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryOwnerTxDetailsLockerOfAppByOwnerByAsset"))
              .build();
        }
      }
    }
    return getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> getQueryOwnerLockerByAppToAssetIDbyOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryOwnerLockerByAppToAssetIDbyOwner",
      requestType = com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
      com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> getQueryOwnerLockerByAppToAssetIDbyOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> getQueryOwnerLockerByAppToAssetIDbyOwnerMethod;
    if ((getQueryOwnerLockerByAppToAssetIDbyOwnerMethod = QueryGrpc.getQueryOwnerLockerByAppToAssetIDbyOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryOwnerLockerByAppToAssetIDbyOwnerMethod = QueryGrpc.getQueryOwnerLockerByAppToAssetIDbyOwnerMethod) == null) {
          QueryGrpc.getQueryOwnerLockerByAppToAssetIDbyOwnerMethod = getQueryOwnerLockerByAppToAssetIDbyOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest, com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryOwnerLockerByAppToAssetIDbyOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryOwnerLockerByAppToAssetIDbyOwner"))
              .build();
        }
      }
    }
    return getQueryOwnerLockerByAppToAssetIDbyOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest,
      com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> getQueryLockerByAppByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerByAppByOwner",
      requestType = com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest,
      com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> getQueryLockerByAppByOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest, com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> getQueryLockerByAppByOwnerMethod;
    if ((getQueryLockerByAppByOwnerMethod = QueryGrpc.getQueryLockerByAppByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerByAppByOwnerMethod = QueryGrpc.getQueryLockerByAppByOwnerMethod) == null) {
          QueryGrpc.getQueryLockerByAppByOwnerMethod = getQueryLockerByAppByOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest, com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerByAppByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerByAppByOwner"))
              .build();
        }
      }
    }
    return getQueryLockerByAppByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest,
      com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> getQueryLockerCountByAppIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerCountByAppID",
      requestType = com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest,
      com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> getQueryLockerCountByAppIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest, com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> getQueryLockerCountByAppIDMethod;
    if ((getQueryLockerCountByAppIDMethod = QueryGrpc.getQueryLockerCountByAppIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerCountByAppIDMethod = QueryGrpc.getQueryLockerCountByAppIDMethod) == null) {
          QueryGrpc.getQueryLockerCountByAppIDMethod = getQueryLockerCountByAppIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest, com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerCountByAppID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerCountByAppID"))
              .build();
        }
      }
    }
    return getQueryLockerCountByAppIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> getQueryLockerCountByAppToAssetIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerCountByAppToAssetID",
      requestType = com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> getQueryLockerCountByAppToAssetIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest, com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> getQueryLockerCountByAppToAssetIDMethod;
    if ((getQueryLockerCountByAppToAssetIDMethod = QueryGrpc.getQueryLockerCountByAppToAssetIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerCountByAppToAssetIDMethod = QueryGrpc.getQueryLockerCountByAppToAssetIDMethod) == null) {
          QueryGrpc.getQueryLockerCountByAppToAssetIDMethod = getQueryLockerCountByAppToAssetIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest, com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerCountByAppToAssetID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerCountByAppToAssetID"))
              .build();
        }
      }
    }
    return getQueryLockerCountByAppToAssetIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest,
      com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> getQueryWhiteListedAssetIDsByAppIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWhiteListedAssetIDsByAppID",
      requestType = com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest,
      com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> getQueryWhiteListedAssetIDsByAppIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest, com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> getQueryWhiteListedAssetIDsByAppIDMethod;
    if ((getQueryWhiteListedAssetIDsByAppIDMethod = QueryGrpc.getQueryWhiteListedAssetIDsByAppIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryWhiteListedAssetIDsByAppIDMethod = QueryGrpc.getQueryWhiteListedAssetIDsByAppIDMethod) == null) {
          QueryGrpc.getQueryWhiteListedAssetIDsByAppIDMethod = getQueryWhiteListedAssetIDsByAppIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest, com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryWhiteListedAssetIDsByAppID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryWhiteListedAssetIDsByAppID"))
              .build();
        }
      }
    }
    return getQueryWhiteListedAssetIDsByAppIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest,
      com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> getQueryWhiteListedAssetByAllAppsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWhiteListedAssetByAllApps",
      requestType = com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest,
      com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> getQueryWhiteListedAssetByAllAppsMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest, com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> getQueryWhiteListedAssetByAllAppsMethod;
    if ((getQueryWhiteListedAssetByAllAppsMethod = QueryGrpc.getQueryWhiteListedAssetByAllAppsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryWhiteListedAssetByAllAppsMethod = QueryGrpc.getQueryWhiteListedAssetByAllAppsMethod) == null) {
          QueryGrpc.getQueryWhiteListedAssetByAllAppsMethod = getQueryWhiteListedAssetByAllAppsMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest, com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryWhiteListedAssetByAllApps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryWhiteListedAssetByAllApps"))
              .build();
        }
      }
    }
    return getQueryWhiteListedAssetByAllAppsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest,
      com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> getQueryLockerLookupTableByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerLookupTableByApp",
      requestType = com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest,
      com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> getQueryLockerLookupTableByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest, com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> getQueryLockerLookupTableByAppMethod;
    if ((getQueryLockerLookupTableByAppMethod = QueryGrpc.getQueryLockerLookupTableByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerLookupTableByAppMethod = QueryGrpc.getQueryLockerLookupTableByAppMethod) == null) {
          QueryGrpc.getQueryLockerLookupTableByAppMethod = getQueryLockerLookupTableByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest, com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerLookupTableByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerLookupTableByApp"))
              .build();
        }
      }
    }
    return getQueryLockerLookupTableByAppMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> getQueryLockerLookupTableByAppAndAssetIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerLookupTableByAppAndAssetID",
      requestType = com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest,
      com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> getQueryLockerLookupTableByAppAndAssetIDMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest, com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> getQueryLockerLookupTableByAppAndAssetIDMethod;
    if ((getQueryLockerLookupTableByAppAndAssetIDMethod = QueryGrpc.getQueryLockerLookupTableByAppAndAssetIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerLookupTableByAppAndAssetIDMethod = QueryGrpc.getQueryLockerLookupTableByAppAndAssetIDMethod) == null) {
          QueryGrpc.getQueryLockerLookupTableByAppAndAssetIDMethod = getQueryLockerLookupTableByAppAndAssetIDMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest, com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerLookupTableByAppAndAssetID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerLookupTableByAppAndAssetID"))
              .build();
        }
      }
    }
    return getQueryLockerLookupTableByAppAndAssetIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest,
      com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> getQueryLockerTotalRewardsByAssetAppWiseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerTotalRewardsByAssetAppWise",
      requestType = com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest,
      com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> getQueryLockerTotalRewardsByAssetAppWiseMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest, com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> getQueryLockerTotalRewardsByAssetAppWiseMethod;
    if ((getQueryLockerTotalRewardsByAssetAppWiseMethod = QueryGrpc.getQueryLockerTotalRewardsByAssetAppWiseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerTotalRewardsByAssetAppWiseMethod = QueryGrpc.getQueryLockerTotalRewardsByAssetAppWiseMethod) == null) {
          QueryGrpc.getQueryLockerTotalRewardsByAssetAppWiseMethod = getQueryLockerTotalRewardsByAssetAppWiseMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest, com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerTotalRewardsByAssetAppWise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerTotalRewardsByAssetAppWise"))
              .build();
        }
      }
    }
    return getQueryLockerTotalRewardsByAssetAppWiseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest,
      com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> getQueryLockerTotalDepositedByAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLockerTotalDepositedByApp",
      requestType = com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest.class,
      responseType = com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest,
      com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> getQueryLockerTotalDepositedByAppMethod() {
    io.grpc.MethodDescriptor<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest, com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> getQueryLockerTotalDepositedByAppMethod;
    if ((getQueryLockerTotalDepositedByAppMethod = QueryGrpc.getQueryLockerTotalDepositedByAppMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLockerTotalDepositedByAppMethod = QueryGrpc.getQueryLockerTotalDepositedByAppMethod) == null) {
          QueryGrpc.getQueryLockerTotalDepositedByAppMethod = getQueryLockerTotalDepositedByAppMethod =
              io.grpc.MethodDescriptor.<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest, com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLockerTotalDepositedByApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLockerTotalDepositedByApp"))
              .build();
        }
      }
    }
    return getQueryLockerTotalDepositedByAppMethod;
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
    default void queryLockerInfo(com.comdex.locker.v1beta1.QueryLockerInfoRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerInfoMethod(), responseObserver);
    }

    /**
     */
    default void queryLockersByAppToAssetID(com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockersByAppToAssetIDMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerInfoByAppID(com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerInfoByAppIDMethod(), responseObserver);
    }

    /**
     */
    default void queryTotalDepositByAppAndAssetID(com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryTotalDepositByAppAndAssetIDMethod(), responseObserver);
    }

    /**
     */
    default void queryOwnerLockerByAppIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryOwnerLockerByAppIDbyOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryOwnerLockerOfAllAppsByOwner(com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryOwnerLockerOfAllAppsByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryOwnerTxDetailsLockerOfAppByOwnerByAsset(com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod(), responseObserver);
    }

    /**
     */
    default void queryOwnerLockerByAppToAssetIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryOwnerLockerByAppToAssetIDbyOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerByAppByOwner(com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerByAppByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerCountByAppID(com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerCountByAppIDMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerCountByAppToAssetID(com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerCountByAppToAssetIDMethod(), responseObserver);
    }

    /**
     */
    default void queryWhiteListedAssetIDsByAppID(com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryWhiteListedAssetIDsByAppIDMethod(), responseObserver);
    }

    /**
     */
    default void queryWhiteListedAssetByAllApps(com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryWhiteListedAssetByAllAppsMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerLookupTableByApp(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerLookupTableByAppMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerLookupTableByAppAndAssetID(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerLookupTableByAppAndAssetIDMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerTotalRewardsByAssetAppWise(com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerTotalRewardsByAssetAppWiseMethod(), responseObserver);
    }

    /**
     */
    default void queryLockerTotalDepositedByApp(com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLockerTotalDepositedByAppMethod(), responseObserver);
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
    public void queryLockerInfo(com.comdex.locker.v1beta1.QueryLockerInfoRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockersByAppToAssetID(com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockersByAppToAssetIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerInfoByAppID(com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerInfoByAppIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryTotalDepositByAppAndAssetID(com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryTotalDepositByAppAndAssetIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryOwnerLockerByAppIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryOwnerLockerByAppIDbyOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryOwnerLockerOfAllAppsByOwner(com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryOwnerLockerOfAllAppsByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryOwnerTxDetailsLockerOfAppByOwnerByAsset(com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryOwnerLockerByAppToAssetIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryOwnerLockerByAppToAssetIDbyOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerByAppByOwner(com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerByAppByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerCountByAppID(com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerCountByAppIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerCountByAppToAssetID(com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerCountByAppToAssetIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryWhiteListedAssetIDsByAppID(com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryWhiteListedAssetIDsByAppIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryWhiteListedAssetByAllApps(com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryWhiteListedAssetByAllAppsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerLookupTableByApp(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerLookupTableByAppMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerLookupTableByAppAndAssetID(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerLookupTableByAppAndAssetIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerTotalRewardsByAssetAppWise(com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerTotalRewardsByAssetAppWiseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLockerTotalDepositedByApp(com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest request,
        io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLockerTotalDepositedByAppMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.locker.v1beta1.QueryLockerInfoResponse queryLockerInfo(com.comdex.locker.v1beta1.QueryLockerInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse queryLockersByAppToAssetID(com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockersByAppToAssetIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse queryLockerInfoByAppID(com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerInfoByAppIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse queryTotalDepositByAppAndAssetID(com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryTotalDepositByAppAndAssetIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse queryOwnerLockerByAppIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryOwnerLockerByAppIDbyOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse queryOwnerLockerOfAllAppsByOwner(com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryOwnerLockerOfAllAppsByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse queryOwnerTxDetailsLockerOfAppByOwnerByAsset(com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse queryOwnerLockerByAppToAssetIDbyOwner(com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryOwnerLockerByAppToAssetIDbyOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse queryLockerByAppByOwner(com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerByAppByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse queryLockerCountByAppID(com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerCountByAppIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse queryLockerCountByAppToAssetID(com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerCountByAppToAssetIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse queryWhiteListedAssetIDsByAppID(com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryWhiteListedAssetIDsByAppIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse queryWhiteListedAssetByAllApps(com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryWhiteListedAssetByAllAppsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse queryLockerLookupTableByApp(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerLookupTableByAppMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse queryLockerLookupTableByAppAndAssetID(com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerLookupTableByAppAndAssetIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse queryLockerTotalRewardsByAssetAppWise(com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerTotalRewardsByAssetAppWiseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse queryLockerTotalDepositedByApp(com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLockerTotalDepositedByAppMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerInfoResponse> queryLockerInfo(
        com.comdex.locker.v1beta1.QueryLockerInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse> queryLockersByAppToAssetID(
        com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockersByAppToAssetIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse> queryLockerInfoByAppID(
        com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerInfoByAppIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse> queryTotalDepositByAppAndAssetID(
        com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryTotalDepositByAppAndAssetIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse> queryOwnerLockerByAppIDbyOwner(
        com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryOwnerLockerByAppIDbyOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse> queryOwnerLockerOfAllAppsByOwner(
        com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryOwnerLockerOfAllAppsByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse> queryOwnerTxDetailsLockerOfAppByOwnerByAsset(
        com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse> queryOwnerLockerByAppToAssetIDbyOwner(
        com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryOwnerLockerByAppToAssetIDbyOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse> queryLockerByAppByOwner(
        com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerByAppByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse> queryLockerCountByAppID(
        com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerCountByAppIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse> queryLockerCountByAppToAssetID(
        com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerCountByAppToAssetIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse> queryWhiteListedAssetIDsByAppID(
        com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryWhiteListedAssetIDsByAppIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse> queryWhiteListedAssetByAllApps(
        com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryWhiteListedAssetByAllAppsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse> queryLockerLookupTableByApp(
        com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerLookupTableByAppMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse> queryLockerLookupTableByAppAndAssetID(
        com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerLookupTableByAppAndAssetIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse> queryLockerTotalRewardsByAssetAppWise(
        com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerTotalRewardsByAssetAppWiseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse> queryLockerTotalDepositedByApp(
        com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLockerTotalDepositedByAppMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_LOCKER_INFO = 0;
  private static final int METHODID_QUERY_LOCKERS_BY_APP_TO_ASSET_ID = 1;
  private static final int METHODID_QUERY_LOCKER_INFO_BY_APP_ID = 2;
  private static final int METHODID_QUERY_TOTAL_DEPOSIT_BY_APP_AND_ASSET_ID = 3;
  private static final int METHODID_QUERY_OWNER_LOCKER_BY_APP_IDBY_OWNER = 4;
  private static final int METHODID_QUERY_OWNER_LOCKER_OF_ALL_APPS_BY_OWNER = 5;
  private static final int METHODID_QUERY_OWNER_TX_DETAILS_LOCKER_OF_APP_BY_OWNER_BY_ASSET = 6;
  private static final int METHODID_QUERY_OWNER_LOCKER_BY_APP_TO_ASSET_IDBY_OWNER = 7;
  private static final int METHODID_QUERY_LOCKER_BY_APP_BY_OWNER = 8;
  private static final int METHODID_QUERY_LOCKER_COUNT_BY_APP_ID = 9;
  private static final int METHODID_QUERY_LOCKER_COUNT_BY_APP_TO_ASSET_ID = 10;
  private static final int METHODID_QUERY_WHITE_LISTED_ASSET_IDS_BY_APP_ID = 11;
  private static final int METHODID_QUERY_WHITE_LISTED_ASSET_BY_ALL_APPS = 12;
  private static final int METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP = 13;
  private static final int METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP_AND_ASSET_ID = 14;
  private static final int METHODID_QUERY_LOCKER_TOTAL_REWARDS_BY_ASSET_APP_WISE = 15;
  private static final int METHODID_QUERY_LOCKER_TOTAL_DEPOSITED_BY_APP = 16;

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
        case METHODID_QUERY_LOCKER_INFO:
          serviceImpl.queryLockerInfo((com.comdex.locker.v1beta1.QueryLockerInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKERS_BY_APP_TO_ASSET_ID:
          serviceImpl.queryLockersByAppToAssetID((com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_INFO_BY_APP_ID:
          serviceImpl.queryLockerInfoByAppID((com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_TOTAL_DEPOSIT_BY_APP_AND_ASSET_ID:
          serviceImpl.queryTotalDepositByAppAndAssetID((com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_OWNER_LOCKER_BY_APP_IDBY_OWNER:
          serviceImpl.queryOwnerLockerByAppIDbyOwner((com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_OWNER_LOCKER_OF_ALL_APPS_BY_OWNER:
          serviceImpl.queryOwnerLockerOfAllAppsByOwner((com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_OWNER_TX_DETAILS_LOCKER_OF_APP_BY_OWNER_BY_ASSET:
          serviceImpl.queryOwnerTxDetailsLockerOfAppByOwnerByAsset((com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse>) responseObserver);
          break;
        case METHODID_QUERY_OWNER_LOCKER_BY_APP_TO_ASSET_IDBY_OWNER:
          serviceImpl.queryOwnerLockerByAppToAssetIDbyOwner((com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_BY_APP_BY_OWNER:
          serviceImpl.queryLockerByAppByOwner((com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_COUNT_BY_APP_ID:
          serviceImpl.queryLockerCountByAppID((com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_COUNT_BY_APP_TO_ASSET_ID:
          serviceImpl.queryLockerCountByAppToAssetID((com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_WHITE_LISTED_ASSET_IDS_BY_APP_ID:
          serviceImpl.queryWhiteListedAssetIDsByAppID((com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_WHITE_LISTED_ASSET_BY_ALL_APPS:
          serviceImpl.queryWhiteListedAssetByAllApps((com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP:
          serviceImpl.queryLockerLookupTableByApp((com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP_AND_ASSET_ID:
          serviceImpl.queryLockerLookupTableByAppAndAssetID((com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_TOTAL_REWARDS_BY_ASSET_APP_WISE:
          serviceImpl.queryLockerTotalRewardsByAssetAppWise((com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse>) responseObserver);
          break;
        case METHODID_QUERY_LOCKER_TOTAL_DEPOSITED_BY_APP:
          serviceImpl.queryLockerTotalDepositedByApp((com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse>) responseObserver);
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
          getQueryLockerInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerInfoRequest,
              com.comdex.locker.v1beta1.QueryLockerInfoResponse>(
                service, METHODID_QUERY_LOCKER_INFO)))
        .addMethod(
          getQueryLockersByAppToAssetIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDRequest,
              com.comdex.locker.v1beta1.QueryLockersByAppToAssetIDResponse>(
                service, METHODID_QUERY_LOCKERS_BY_APP_TO_ASSET_ID)))
        .addMethod(
          getQueryLockerInfoByAppIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerInfoByAppIDRequest,
              com.comdex.locker.v1beta1.QueryLockerInfoByAppIDResponse>(
                service, METHODID_QUERY_LOCKER_INFO_BY_APP_ID)))
        .addMethod(
          getQueryTotalDepositByAppAndAssetIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDRequest,
              com.comdex.locker.v1beta1.QueryTotalDepositByAppAndAssetIDResponse>(
                service, METHODID_QUERY_TOTAL_DEPOSIT_BY_APP_AND_ASSET_ID)))
        .addMethod(
          getQueryOwnerLockerByAppIDbyOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerRequest,
              com.comdex.locker.v1beta1.QueryOwnerLockerByAppIDbyOwnerResponse>(
                service, METHODID_QUERY_OWNER_LOCKER_BY_APP_IDBY_OWNER)))
        .addMethod(
          getQueryOwnerLockerOfAllAppsByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerRequest,
              com.comdex.locker.v1beta1.QueryOwnerLockerOfAllAppsByOwnerResponse>(
                service, METHODID_QUERY_OWNER_LOCKER_OF_ALL_APPS_BY_OWNER)))
        .addMethod(
          getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetRequest,
              com.comdex.locker.v1beta1.QueryOwnerTxDetailsLockerOfAppByOwnerByAssetResponse>(
                service, METHODID_QUERY_OWNER_TX_DETAILS_LOCKER_OF_APP_BY_OWNER_BY_ASSET)))
        .addMethod(
          getQueryOwnerLockerByAppToAssetIDbyOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerRequest,
              com.comdex.locker.v1beta1.QueryOwnerLockerByAppToAssetIDbyOwnerResponse>(
                service, METHODID_QUERY_OWNER_LOCKER_BY_APP_TO_ASSET_IDBY_OWNER)))
        .addMethod(
          getQueryLockerByAppByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerByAppByOwnerRequest,
              com.comdex.locker.v1beta1.QueryLockerByAppByOwnerResponse>(
                service, METHODID_QUERY_LOCKER_BY_APP_BY_OWNER)))
        .addMethod(
          getQueryLockerCountByAppIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerCountByAppIDRequest,
              com.comdex.locker.v1beta1.QueryLockerCountByAppIDResponse>(
                service, METHODID_QUERY_LOCKER_COUNT_BY_APP_ID)))
        .addMethod(
          getQueryLockerCountByAppToAssetIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDRequest,
              com.comdex.locker.v1beta1.QueryLockerCountByAppToAssetIDResponse>(
                service, METHODID_QUERY_LOCKER_COUNT_BY_APP_TO_ASSET_ID)))
        .addMethod(
          getQueryWhiteListedAssetIDsByAppIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDRequest,
              com.comdex.locker.v1beta1.QueryWhiteListedAssetIDsByAppIDResponse>(
                service, METHODID_QUERY_WHITE_LISTED_ASSET_IDS_BY_APP_ID)))
        .addMethod(
          getQueryWhiteListedAssetByAllAppsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsRequest,
              com.comdex.locker.v1beta1.QueryWhiteListedAssetByAllAppsResponse>(
                service, METHODID_QUERY_WHITE_LISTED_ASSET_BY_ALL_APPS)))
        .addMethod(
          getQueryLockerLookupTableByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerLookupTableByAppRequest,
              com.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse>(
                service, METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP)))
        .addMethod(
          getQueryLockerLookupTableByAppAndAssetIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDRequest,
              com.comdex.locker.v1beta1.QueryLockerLookupTableByAppAndAssetIDResponse>(
                service, METHODID_QUERY_LOCKER_LOOKUP_TABLE_BY_APP_AND_ASSET_ID)))
        .addMethod(
          getQueryLockerTotalRewardsByAssetAppWiseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseRequest,
              com.comdex.locker.v1beta1.QueryLockerTotalRewardsByAssetAppWiseResponse>(
                service, METHODID_QUERY_LOCKER_TOTAL_REWARDS_BY_ASSET_APP_WISE)))
        .addMethod(
          getQueryLockerTotalDepositedByAppMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppRequest,
              com.comdex.locker.v1beta1.QueryLockerTotalDepositedByAppResponse>(
                service, METHODID_QUERY_LOCKER_TOTAL_DEPOSITED_BY_APP)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.locker.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQueryLockerInfoMethod())
              .addMethod(getQueryLockersByAppToAssetIDMethod())
              .addMethod(getQueryLockerInfoByAppIDMethod())
              .addMethod(getQueryTotalDepositByAppAndAssetIDMethod())
              .addMethod(getQueryOwnerLockerByAppIDbyOwnerMethod())
              .addMethod(getQueryOwnerLockerOfAllAppsByOwnerMethod())
              .addMethod(getQueryOwnerTxDetailsLockerOfAppByOwnerByAssetMethod())
              .addMethod(getQueryOwnerLockerByAppToAssetIDbyOwnerMethod())
              .addMethod(getQueryLockerByAppByOwnerMethod())
              .addMethod(getQueryLockerCountByAppIDMethod())
              .addMethod(getQueryLockerCountByAppToAssetIDMethod())
              .addMethod(getQueryWhiteListedAssetIDsByAppIDMethod())
              .addMethod(getQueryWhiteListedAssetByAllAppsMethod())
              .addMethod(getQueryLockerLookupTableByAppMethod())
              .addMethod(getQueryLockerLookupTableByAppAndAssetIDMethod())
              .addMethod(getQueryLockerTotalRewardsByAssetAppWiseMethod())
              .addMethod(getQueryLockerTotalDepositedByAppMethod())
              .build();
        }
      }
    }
    return result;
  }
}
