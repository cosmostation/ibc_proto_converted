package com.shentu.shield.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for shield module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: shentu/shield/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "shentu.shield.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest,
      com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> getSponsorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sponsor",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest,
      com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> getSponsorMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest, com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> getSponsorMethod;
    if ((getSponsorMethod = QueryGrpc.getSponsorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSponsorMethod = QueryGrpc.getSponsorMethod) == null) {
          QueryGrpc.getSponsorMethod = getSponsorMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest, com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sponsor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Sponsor"))
              .build();
        }
      }
    }
    return getSponsorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> getPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pools",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> getPoolsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> getPoolsMethod;
    if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolsMethod = QueryGrpc.getPoolsMethod) == null) {
          QueryGrpc.getPoolsMethod = getPoolsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pools"))
              .build();
        }
      }
    }
    return getPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPoolPurchaseListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolPurchaseLists",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPoolPurchaseListsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPoolPurchaseListsMethod;
    if ((getPoolPurchaseListsMethod = QueryGrpc.getPoolPurchaseListsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolPurchaseListsMethod = QueryGrpc.getPoolPurchaseListsMethod) == null) {
          QueryGrpc.getPoolPurchaseListsMethod = getPoolPurchaseListsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolPurchaseLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolPurchaseLists"))
              .build();
        }
      }
    }
    return getPoolPurchaseListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPurchaseListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseLists",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPurchaseListsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> getPurchaseListsMethod;
    if ((getPurchaseListsMethod = QueryGrpc.getPurchaseListsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPurchaseListsMethod = QueryGrpc.getPurchaseListsMethod) == null) {
          QueryGrpc.getPurchaseListsMethod = getPurchaseListsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PurchaseLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PurchaseLists"))
              .build();
        }
      }
    }
    return getPurchaseListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> getPurchaseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurchaseList",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> getPurchaseListMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> getPurchaseListMethod;
    if ((getPurchaseListMethod = QueryGrpc.getPurchaseListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPurchaseListMethod = QueryGrpc.getPurchaseListMethod) == null) {
          QueryGrpc.getPurchaseListMethod = getPurchaseListMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PurchaseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PurchaseList"))
              .build();
        }
      }
    }
    return getPurchaseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> getPurchasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Purchases",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> getPurchasesMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> getPurchasesMethod;
    if ((getPurchasesMethod = QueryGrpc.getPurchasesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPurchasesMethod = QueryGrpc.getPurchasesMethod) == null) {
          QueryGrpc.getPurchasesMethod = getPurchasesMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Purchases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Purchases"))
              .build();
        }
      }
    }
    return getPurchasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Provider",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> getProviderMethod;
    if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProviderMethod = QueryGrpc.getProviderMethod) == null) {
          QueryGrpc.getProviderMethod = getProviderMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Provider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Provider"))
              .build();
        }
      }
    }
    return getProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Providers",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> getProvidersMethod;
    if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProvidersMethod = QueryGrpc.getProvidersMethod) == null) {
          QueryGrpc.getProvidersMethod = getProvidersMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest, com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Providers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Providers"))
              .build();
        }
      }
    }
    return getProvidersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoolParams",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> getPoolParamsMethod;
    if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolParamsMethod = QueryGrpc.getPoolParamsMethod) == null) {
          QueryGrpc.getPoolParamsMethod = getPoolParamsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoolParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoolParams"))
              .build();
        }
      }
    }
    return getPoolParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> getClaimParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimParams",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> getClaimParamsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> getClaimParamsMethod;
    if ((getClaimParamsMethod = QueryGrpc.getClaimParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimParamsMethod = QueryGrpc.getClaimParamsMethod) == null) {
          QueryGrpc.getClaimParamsMethod = getClaimParamsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimParams"))
              .build();
        }
      }
    }
    return getClaimParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> getDistrParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DistrParams",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> getDistrParamsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> getDistrParamsMethod;
    if ((getDistrParamsMethod = QueryGrpc.getDistrParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDistrParamsMethod = QueryGrpc.getDistrParamsMethod) == null) {
          QueryGrpc.getDistrParamsMethod = getDistrParamsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DistrParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DistrParams"))
              .build();
        }
      }
    }
    return getDistrParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShieldStatus",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> getShieldStatusMethod;
    if ((getShieldStatusMethod = QueryGrpc.getShieldStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShieldStatusMethod = QueryGrpc.getShieldStatusMethod) == null) {
          QueryGrpc.getShieldStatusMethod = getShieldStatusMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShieldStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShieldStatus"))
              .build();
        }
      }
    }
    return getShieldStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> getShieldStakingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShieldStaking",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> getShieldStakingMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> getShieldStakingMethod;
    if ((getShieldStakingMethod = QueryGrpc.getShieldStakingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShieldStakingMethod = QueryGrpc.getShieldStakingMethod) == null) {
          QueryGrpc.getShieldStakingMethod = getShieldStakingMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShieldStaking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShieldStaking"))
              .build();
        }
      }
    }
    return getShieldStakingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> getShieldStakingRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShieldStakingRate",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> getShieldStakingRateMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> getShieldStakingRateMethod;
    if ((getShieldStakingRateMethod = QueryGrpc.getShieldStakingRateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getShieldStakingRateMethod = QueryGrpc.getShieldStakingRateMethod) == null) {
          QueryGrpc.getShieldStakingRateMethod = getShieldStakingRateMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest, com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShieldStakingRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ShieldStakingRate"))
              .build();
        }
      }
    }
    return getShieldStakingRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> getReimbursementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reimbursement",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> getReimbursementMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest, com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> getReimbursementMethod;
    if ((getReimbursementMethod = QueryGrpc.getReimbursementMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReimbursementMethod = QueryGrpc.getReimbursementMethod) == null) {
          QueryGrpc.getReimbursementMethod = getReimbursementMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest, com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reimbursement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reimbursement"))
              .build();
        }
      }
    }
    return getReimbursementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> getReimbursementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reimbursements",
      requestType = com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest.class,
      responseType = com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest,
      com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> getReimbursementsMethod() {
    io.grpc.MethodDescriptor<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> getReimbursementsMethod;
    if ((getReimbursementsMethod = QueryGrpc.getReimbursementsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReimbursementsMethod = QueryGrpc.getReimbursementsMethod) == null) {
          QueryGrpc.getReimbursementsMethod = getReimbursementsMethod =
              io.grpc.MethodDescriptor.<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest, com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reimbursements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reimbursements"))
              .build();
        }
      }
    }
    return getReimbursementsMethod;
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
   * <pre>
   * Query defines the gRPC querier service for shield module
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void pool(com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     */
    default void sponsor(com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSponsorMethod(), responseObserver);
    }

    /**
     */
    default void pools(com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolsMethod(), responseObserver);
    }

    /**
     */
    default void poolPurchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolPurchaseListsMethod(), responseObserver);
    }

    /**
     */
    default void purchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseListsMethod(), responseObserver);
    }

    /**
     */
    default void purchaseList(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseListMethod(), responseObserver);
    }

    /**
     */
    default void purchases(com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchasesMethod(), responseObserver);
    }

    /**
     */
    default void provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProviderMethod(), responseObserver);
    }

    /**
     */
    default void providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvidersMethod(), responseObserver);
    }

    /**
     */
    default void poolParams(com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolParamsMethod(), responseObserver);
    }

    /**
     */
    default void claimParams(com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimParamsMethod(), responseObserver);
    }

    /**
     */
    default void distrParams(com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDistrParamsMethod(), responseObserver);
    }

    /**
     */
    default void shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShieldStatusMethod(), responseObserver);
    }

    /**
     */
    default void shieldStaking(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShieldStakingMethod(), responseObserver);
    }

    /**
     */
    default void shieldStakingRate(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShieldStakingRateMethod(), responseObserver);
    }

    /**
     */
    default void reimbursement(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReimbursementMethod(), responseObserver);
    }

    /**
     */
    default void reimbursements(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReimbursementsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
   * </pre>
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
    public void pool(com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sponsor(com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSponsorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pools(com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolPurchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolPurchaseListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchaseList(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchases(com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poolParams(com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimParams(com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void distrParams(com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDistrParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShieldStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shieldStaking(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShieldStakingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shieldStakingRate(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShieldStakingRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reimbursement(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReimbursementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reimbursements(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReimbursementsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
   * </pre>
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
    public com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse pool(com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse sponsor(com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSponsorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse pools(com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse poolPurchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolPurchaseListsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse purchaseLists(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseListsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse purchaseList(com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse purchases(com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchasesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse provider(com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse providers(com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvidersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse poolParams(com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse claimParams(com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse distrParams(com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDistrParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse shieldStatus(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShieldStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse shieldStaking(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShieldStakingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse shieldStakingRate(com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShieldStakingRateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse reimbursement(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReimbursementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse reimbursements(com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReimbursementsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for shield module
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse> pool(
        com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse> sponsor(
        com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSponsorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse> pools(
        com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> poolPurchaseLists(
        com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolPurchaseListsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse> purchaseLists(
        com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseListsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse> purchaseList(
        com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse> purchases(
        com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchasesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse> provider(
        com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse> providers(
        com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvidersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse> poolParams(
        com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse> claimParams(
        com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse> distrParams(
        com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDistrParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse> shieldStatus(
        com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShieldStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse> shieldStaking(
        com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShieldStakingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse> shieldStakingRate(
        com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShieldStakingRateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse> reimbursement(
        com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReimbursementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse> reimbursements(
        com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReimbursementsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOL = 0;
  private static final int METHODID_SPONSOR = 1;
  private static final int METHODID_POOLS = 2;
  private static final int METHODID_POOL_PURCHASE_LISTS = 3;
  private static final int METHODID_PURCHASE_LISTS = 4;
  private static final int METHODID_PURCHASE_LIST = 5;
  private static final int METHODID_PURCHASES = 6;
  private static final int METHODID_PROVIDER = 7;
  private static final int METHODID_PROVIDERS = 8;
  private static final int METHODID_POOL_PARAMS = 9;
  private static final int METHODID_CLAIM_PARAMS = 10;
  private static final int METHODID_DISTR_PARAMS = 11;
  private static final int METHODID_SHIELD_STATUS = 12;
  private static final int METHODID_SHIELD_STAKING = 13;
  private static final int METHODID_SHIELD_STAKING_RATE = 14;
  private static final int METHODID_REIMBURSEMENT = 15;
  private static final int METHODID_REIMBURSEMENTS = 16;

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
        case METHODID_POOL:
          serviceImpl.pool((com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_SPONSOR:
          serviceImpl.sponsor((com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse>) responseObserver);
          break;
        case METHODID_POOLS:
          serviceImpl.pools((com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_POOL_PURCHASE_LISTS:
          serviceImpl.poolPurchaseLists((com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>) responseObserver);
          break;
        case METHODID_PURCHASE_LISTS:
          serviceImpl.purchaseLists((com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>) responseObserver);
          break;
        case METHODID_PURCHASE_LIST:
          serviceImpl.purchaseList((com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse>) responseObserver);
          break;
        case METHODID_PURCHASES:
          serviceImpl.purchases((com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse>) responseObserver);
          break;
        case METHODID_PROVIDER:
          serviceImpl.provider((com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>) responseObserver);
          break;
        case METHODID_PROVIDERS:
          serviceImpl.providers((com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>) responseObserver);
          break;
        case METHODID_POOL_PARAMS:
          serviceImpl.poolParams((com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_PARAMS:
          serviceImpl.claimParams((com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse>) responseObserver);
          break;
        case METHODID_DISTR_PARAMS:
          serviceImpl.distrParams((com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse>) responseObserver);
          break;
        case METHODID_SHIELD_STATUS:
          serviceImpl.shieldStatus((com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>) responseObserver);
          break;
        case METHODID_SHIELD_STAKING:
          serviceImpl.shieldStaking((com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse>) responseObserver);
          break;
        case METHODID_SHIELD_STAKING_RATE:
          serviceImpl.shieldStakingRate((com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse>) responseObserver);
          break;
        case METHODID_REIMBURSEMENT:
          serviceImpl.reimbursement((com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse>) responseObserver);
          break;
        case METHODID_REIMBURSEMENTS:
          serviceImpl.reimbursements((com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse>) responseObserver);
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
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getSponsorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QuerySponsorRequest,
              com.shentu.shield.v1alpha1.QueryProto.QuerySponsorResponse>(
                service, METHODID_SPONSOR)))
        .addMethod(
          getPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolsResponse>(
                service, METHODID_POOLS)))
        .addMethod(
          getPoolPurchaseListsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolPurchaseListsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>(
                service, METHODID_POOL_PURCHASE_LISTS)))
        .addMethod(
          getPurchaseListsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListsResponse>(
                service, METHODID_PURCHASE_LISTS)))
        .addMethod(
          getPurchaseListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchaseListResponse>(
                service, METHODID_PURCHASE_LIST)))
        .addMethod(
          getPurchasesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPurchasesResponse>(
                service, METHODID_PURCHASES)))
        .addMethod(
          getProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryProviderRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryProviderResponse>(
                service, METHODID_PROVIDER)))
        .addMethod(
          getProvidersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryProvidersRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryProvidersResponse>(
                service, METHODID_PROVIDERS)))
        .addMethod(
          getPoolParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryPoolParamsResponse>(
                service, METHODID_POOL_PARAMS)))
        .addMethod(
          getClaimParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryClaimParamsResponse>(
                service, METHODID_CLAIM_PARAMS)))
        .addMethod(
          getDistrParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryDistrParamsResponse>(
                service, METHODID_DISTR_PARAMS)))
        .addMethod(
          getShieldStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStatusResponse>(
                service, METHODID_SHIELD_STATUS)))
        .addMethod(
          getShieldStakingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingResponse>(
                service, METHODID_SHIELD_STAKING)))
        .addMethod(
          getShieldStakingRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryShieldStakingRateResponse>(
                service, METHODID_SHIELD_STAKING_RATE)))
        .addMethod(
          getReimbursementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementResponse>(
                service, METHODID_REIMBURSEMENT)))
        .addMethod(
          getReimbursementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsRequest,
              com.shentu.shield.v1alpha1.QueryProto.QueryReimbursementsResponse>(
                service, METHODID_REIMBURSEMENTS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.shield.v1alpha1.QueryProto.getDescriptor();
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
    private final java.lang.String methodName;

    QueryMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getPoolMethod())
              .addMethod(getSponsorMethod())
              .addMethod(getPoolsMethod())
              .addMethod(getPoolPurchaseListsMethod())
              .addMethod(getPurchaseListsMethod())
              .addMethod(getPurchaseListMethod())
              .addMethod(getPurchasesMethod())
              .addMethod(getProviderMethod())
              .addMethod(getProvidersMethod())
              .addMethod(getPoolParamsMethod())
              .addMethod(getClaimParamsMethod())
              .addMethod(getDistrParamsMethod())
              .addMethod(getShieldStatusMethod())
              .addMethod(getShieldStakingMethod())
              .addMethod(getShieldStakingRateMethod())
              .addMethod(getReimbursementMethod())
              .addMethod(getReimbursementsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
