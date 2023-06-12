package com.comdex.lend.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/lend/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.lend.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendsRequest,
      com.comdex.lend.v1beta1.QueryLendsResponse> getQueryLendsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLends",
      requestType = com.comdex.lend.v1beta1.QueryLendsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryLendsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendsRequest,
      com.comdex.lend.v1beta1.QueryLendsResponse> getQueryLendsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendsRequest, com.comdex.lend.v1beta1.QueryLendsResponse> getQueryLendsMethod;
    if ((getQueryLendsMethod = QueryGrpc.getQueryLendsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLendsMethod = QueryGrpc.getQueryLendsMethod) == null) {
          QueryGrpc.getQueryLendsMethod = getQueryLendsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryLendsRequest, com.comdex.lend.v1beta1.QueryLendsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLends"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLends"))
              .build();
        }
      }
    }
    return getQueryLendsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendRequest,
      com.comdex.lend.v1beta1.QueryLendResponse> getQueryLendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLend",
      requestType = com.comdex.lend.v1beta1.QueryLendRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryLendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendRequest,
      com.comdex.lend.v1beta1.QueryLendResponse> getQueryLendMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendRequest, com.comdex.lend.v1beta1.QueryLendResponse> getQueryLendMethod;
    if ((getQueryLendMethod = QueryGrpc.getQueryLendMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLendMethod = QueryGrpc.getQueryLendMethod) == null) {
          QueryGrpc.getQueryLendMethod = getQueryLendMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryLendRequest, com.comdex.lend.v1beta1.QueryLendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLend"))
              .build();
        }
      }
    }
    return getQueryLendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest,
      com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> getQueryAllLendByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllLendByOwner",
      requestType = com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest,
      com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> getQueryAllLendByOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest, com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> getQueryAllLendByOwnerMethod;
    if ((getQueryAllLendByOwnerMethod = QueryGrpc.getQueryAllLendByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllLendByOwnerMethod = QueryGrpc.getQueryAllLendByOwnerMethod) == null) {
          QueryGrpc.getQueryAllLendByOwnerMethod = getQueryAllLendByOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest, com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllLendByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllLendByOwner"))
              .build();
        }
      }
    }
    return getQueryAllLendByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest,
      com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> getQueryAllLendByOwnerAndPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllLendByOwnerAndPool",
      requestType = com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest,
      com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> getQueryAllLendByOwnerAndPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest, com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> getQueryAllLendByOwnerAndPoolMethod;
    if ((getQueryAllLendByOwnerAndPoolMethod = QueryGrpc.getQueryAllLendByOwnerAndPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllLendByOwnerAndPoolMethod = QueryGrpc.getQueryAllLendByOwnerAndPoolMethod) == null) {
          QueryGrpc.getQueryAllLendByOwnerAndPoolMethod = getQueryAllLendByOwnerAndPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest, com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllLendByOwnerAndPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllLendByOwnerAndPool"))
              .build();
        }
      }
    }
    return getQueryAllLendByOwnerAndPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryParamsRequest,
      com.comdex.lend.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.lend.v1beta1.QueryParamsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryParamsRequest,
      com.comdex.lend.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryParamsRequest, com.comdex.lend.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryParamsRequest, com.comdex.lend.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairsRequest,
      com.comdex.lend.v1beta1.QueryPairsResponse> getQueryPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPairs",
      requestType = com.comdex.lend.v1beta1.QueryPairsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryPairsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairsRequest,
      com.comdex.lend.v1beta1.QueryPairsResponse> getQueryPairsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairsRequest, com.comdex.lend.v1beta1.QueryPairsResponse> getQueryPairsMethod;
    if ((getQueryPairsMethod = QueryGrpc.getQueryPairsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPairsMethod = QueryGrpc.getQueryPairsMethod) == null) {
          QueryGrpc.getQueryPairsMethod = getQueryPairsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryPairsRequest, com.comdex.lend.v1beta1.QueryPairsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPairsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPairsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPairs"))
              .build();
        }
      }
    }
    return getQueryPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairRequest,
      com.comdex.lend.v1beta1.QueryPairResponse> getQueryPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPair",
      requestType = com.comdex.lend.v1beta1.QueryPairRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairRequest,
      com.comdex.lend.v1beta1.QueryPairResponse> getQueryPairMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPairRequest, com.comdex.lend.v1beta1.QueryPairResponse> getQueryPairMethod;
    if ((getQueryPairMethod = QueryGrpc.getQueryPairMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPairMethod = QueryGrpc.getQueryPairMethod) == null) {
          QueryGrpc.getQueryPairMethod = getQueryPairMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryPairRequest, com.comdex.lend.v1beta1.QueryPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPair"))
              .build();
        }
      }
    }
    return getQueryPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest,
      com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> getQueryAssetRatesParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetRatesParams",
      requestType = com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest,
      com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> getQueryAssetRatesParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest, com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> getQueryAssetRatesParamsMethod;
    if ((getQueryAssetRatesParamsMethod = QueryGrpc.getQueryAssetRatesParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetRatesParamsMethod = QueryGrpc.getQueryAssetRatesParamsMethod) == null) {
          QueryGrpc.getQueryAssetRatesParamsMethod = getQueryAssetRatesParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest, com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetRatesParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetRatesParams"))
              .build();
        }
      }
    }
    return getQueryAssetRatesParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamRequest,
      com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> getQueryAssetRatesParamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetRatesParam",
      requestType = com.comdex.lend.v1beta1.QueryAssetRatesParamRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAssetRatesParamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamRequest,
      com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> getQueryAssetRatesParamMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetRatesParamRequest, com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> getQueryAssetRatesParamMethod;
    if ((getQueryAssetRatesParamMethod = QueryGrpc.getQueryAssetRatesParamMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetRatesParamMethod = QueryGrpc.getQueryAssetRatesParamMethod) == null) {
          QueryGrpc.getQueryAssetRatesParamMethod = getQueryAssetRatesParamMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAssetRatesParamRequest, com.comdex.lend.v1beta1.QueryAssetRatesParamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetRatesParam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetRatesParamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetRatesParamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetRatesParam"))
              .build();
        }
      }
    }
    return getQueryAssetRatesParamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolsRequest,
      com.comdex.lend.v1beta1.QueryPoolsResponse> getQueryPoolsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPools",
      requestType = com.comdex.lend.v1beta1.QueryPoolsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryPoolsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolsRequest,
      com.comdex.lend.v1beta1.QueryPoolsResponse> getQueryPoolsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolsRequest, com.comdex.lend.v1beta1.QueryPoolsResponse> getQueryPoolsMethod;
    if ((getQueryPoolsMethod = QueryGrpc.getQueryPoolsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPoolsMethod = QueryGrpc.getQueryPoolsMethod) == null) {
          QueryGrpc.getQueryPoolsMethod = getQueryPoolsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryPoolsRequest, com.comdex.lend.v1beta1.QueryPoolsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPools"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPools"))
              .build();
        }
      }
    }
    return getQueryPoolsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolRequest,
      com.comdex.lend.v1beta1.QueryPoolResponse> getQueryPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPool",
      requestType = com.comdex.lend.v1beta1.QueryPoolRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolRequest,
      com.comdex.lend.v1beta1.QueryPoolResponse> getQueryPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolRequest, com.comdex.lend.v1beta1.QueryPoolResponse> getQueryPoolMethod;
    if ((getQueryPoolMethod = QueryGrpc.getQueryPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPoolMethod = QueryGrpc.getQueryPoolMethod) == null) {
          QueryGrpc.getQueryPoolMethod = getQueryPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryPoolRequest, com.comdex.lend.v1beta1.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPool"))
              .build();
        }
      }
    }
    return getQueryPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest,
      com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> getQueryAssetToPairMappingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetToPairMappings",
      requestType = com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest,
      com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> getQueryAssetToPairMappingsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest, com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> getQueryAssetToPairMappingsMethod;
    if ((getQueryAssetToPairMappingsMethod = QueryGrpc.getQueryAssetToPairMappingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetToPairMappingsMethod = QueryGrpc.getQueryAssetToPairMappingsMethod) == null) {
          QueryGrpc.getQueryAssetToPairMappingsMethod = getQueryAssetToPairMappingsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest, com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetToPairMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetToPairMappings"))
              .build();
        }
      }
    }
    return getQueryAssetToPairMappingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest,
      com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> getQueryAssetToPairMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetToPairMapping",
      requestType = com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest,
      com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> getQueryAssetToPairMappingMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest, com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> getQueryAssetToPairMappingMethod;
    if ((getQueryAssetToPairMappingMethod = QueryGrpc.getQueryAssetToPairMappingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetToPairMappingMethod = QueryGrpc.getQueryAssetToPairMappingMethod) == null) {
          QueryGrpc.getQueryAssetToPairMappingMethod = getQueryAssetToPairMappingMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest, com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetToPairMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetToPairMapping"))
              .build();
        }
      }
    }
    return getQueryAssetToPairMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowsRequest,
      com.comdex.lend.v1beta1.QueryBorrowsResponse> getQueryBorrowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryBorrows",
      requestType = com.comdex.lend.v1beta1.QueryBorrowsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryBorrowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowsRequest,
      com.comdex.lend.v1beta1.QueryBorrowsResponse> getQueryBorrowsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowsRequest, com.comdex.lend.v1beta1.QueryBorrowsResponse> getQueryBorrowsMethod;
    if ((getQueryBorrowsMethod = QueryGrpc.getQueryBorrowsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryBorrowsMethod = QueryGrpc.getQueryBorrowsMethod) == null) {
          QueryGrpc.getQueryBorrowsMethod = getQueryBorrowsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryBorrowsRequest, com.comdex.lend.v1beta1.QueryBorrowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryBorrows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryBorrows"))
              .build();
        }
      }
    }
    return getQueryBorrowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowRequest,
      com.comdex.lend.v1beta1.QueryBorrowResponse> getQueryBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryBorrow",
      requestType = com.comdex.lend.v1beta1.QueryBorrowRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowRequest,
      com.comdex.lend.v1beta1.QueryBorrowResponse> getQueryBorrowMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowRequest, com.comdex.lend.v1beta1.QueryBorrowResponse> getQueryBorrowMethod;
    if ((getQueryBorrowMethod = QueryGrpc.getQueryBorrowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryBorrowMethod = QueryGrpc.getQueryBorrowMethod) == null) {
          QueryGrpc.getQueryBorrowMethod = getQueryBorrowMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryBorrowRequest, com.comdex.lend.v1beta1.QueryBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryBorrow"))
              .build();
        }
      }
    }
    return getQueryBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest,
      com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> getQueryAllBorrowByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllBorrowByOwner",
      requestType = com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest,
      com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> getQueryAllBorrowByOwnerMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest, com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> getQueryAllBorrowByOwnerMethod;
    if ((getQueryAllBorrowByOwnerMethod = QueryGrpc.getQueryAllBorrowByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllBorrowByOwnerMethod = QueryGrpc.getQueryAllBorrowByOwnerMethod) == null) {
          QueryGrpc.getQueryAllBorrowByOwnerMethod = getQueryAllBorrowByOwnerMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest, com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllBorrowByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllBorrowByOwner"))
              .build();
        }
      }
    }
    return getQueryAllBorrowByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest,
      com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> getQueryAllBorrowByOwnerAndPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllBorrowByOwnerAndPool",
      requestType = com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest,
      com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> getQueryAllBorrowByOwnerAndPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest, com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> getQueryAllBorrowByOwnerAndPoolMethod;
    if ((getQueryAllBorrowByOwnerAndPoolMethod = QueryGrpc.getQueryAllBorrowByOwnerAndPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllBorrowByOwnerAndPoolMethod = QueryGrpc.getQueryAllBorrowByOwnerAndPoolMethod) == null) {
          QueryGrpc.getQueryAllBorrowByOwnerAndPoolMethod = getQueryAllBorrowByOwnerAndPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest, com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllBorrowByOwnerAndPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllBorrowByOwnerAndPool"))
              .build();
        }
      }
    }
    return getQueryAllBorrowByOwnerAndPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest,
      com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> getQueryPoolAssetLBMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPoolAssetLBMapping",
      requestType = com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest,
      com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> getQueryPoolAssetLBMappingMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest, com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> getQueryPoolAssetLBMappingMethod;
    if ((getQueryPoolAssetLBMappingMethod = QueryGrpc.getQueryPoolAssetLBMappingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPoolAssetLBMappingMethod = QueryGrpc.getQueryPoolAssetLBMappingMethod) == null) {
          QueryGrpc.getQueryPoolAssetLBMappingMethod = getQueryPoolAssetLBMappingMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest, com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPoolAssetLBMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPoolAssetLBMapping"))
              .build();
        }
      }
    }
    return getQueryPoolAssetLBMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest,
      com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> getQueryReserveBuybackAssetDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryReserveBuybackAssetData",
      requestType = com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest,
      com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> getQueryReserveBuybackAssetDataMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest, com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> getQueryReserveBuybackAssetDataMethod;
    if ((getQueryReserveBuybackAssetDataMethod = QueryGrpc.getQueryReserveBuybackAssetDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryReserveBuybackAssetDataMethod = QueryGrpc.getQueryReserveBuybackAssetDataMethod) == null) {
          QueryGrpc.getQueryReserveBuybackAssetDataMethod = getQueryReserveBuybackAssetDataMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest, com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryReserveBuybackAssetData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryReserveBuybackAssetData"))
              .build();
        }
      }
    }
    return getQueryReserveBuybackAssetDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAuctionParamRequest,
      com.comdex.lend.v1beta1.QueryAuctionParamResponse> getQueryAuctionParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAuctionParams",
      requestType = com.comdex.lend.v1beta1.QueryAuctionParamRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAuctionParamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAuctionParamRequest,
      com.comdex.lend.v1beta1.QueryAuctionParamResponse> getQueryAuctionParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAuctionParamRequest, com.comdex.lend.v1beta1.QueryAuctionParamResponse> getQueryAuctionParamsMethod;
    if ((getQueryAuctionParamsMethod = QueryGrpc.getQueryAuctionParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAuctionParamsMethod = QueryGrpc.getQueryAuctionParamsMethod) == null) {
          QueryGrpc.getQueryAuctionParamsMethod = getQueryAuctionParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAuctionParamRequest, com.comdex.lend.v1beta1.QueryAuctionParamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAuctionParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAuctionParamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAuctionParamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAuctionParams"))
              .build();
        }
      }
    }
    return getQueryAuctionParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryModuleBalanceRequest,
      com.comdex.lend.v1beta1.QueryModuleBalanceResponse> getQueryModuleBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryModuleBalance",
      requestType = com.comdex.lend.v1beta1.QueryModuleBalanceRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryModuleBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryModuleBalanceRequest,
      com.comdex.lend.v1beta1.QueryModuleBalanceResponse> getQueryModuleBalanceMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryModuleBalanceRequest, com.comdex.lend.v1beta1.QueryModuleBalanceResponse> getQueryModuleBalanceMethod;
    if ((getQueryModuleBalanceMethod = QueryGrpc.getQueryModuleBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryModuleBalanceMethod = QueryGrpc.getQueryModuleBalanceMethod) == null) {
          QueryGrpc.getQueryModuleBalanceMethod = getQueryModuleBalanceMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryModuleBalanceRequest, com.comdex.lend.v1beta1.QueryModuleBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryModuleBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryModuleBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryModuleBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryModuleBalance"))
              .build();
        }
      }
    }
    return getQueryModuleBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalRequest,
      com.comdex.lend.v1beta1.QueryFundModBalResponse> getQueryFundModBalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFundModBal",
      requestType = com.comdex.lend.v1beta1.QueryFundModBalRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryFundModBalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalRequest,
      com.comdex.lend.v1beta1.QueryFundModBalResponse> getQueryFundModBalMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalRequest, com.comdex.lend.v1beta1.QueryFundModBalResponse> getQueryFundModBalMethod;
    if ((getQueryFundModBalMethod = QueryGrpc.getQueryFundModBalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryFundModBalMethod = QueryGrpc.getQueryFundModBalMethod) == null) {
          QueryGrpc.getQueryFundModBalMethod = getQueryFundModBalMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryFundModBalRequest, com.comdex.lend.v1beta1.QueryFundModBalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFundModBal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundModBalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundModBalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryFundModBal"))
              .build();
        }
      }
    }
    return getQueryFundModBalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundReserveBalRequest,
      com.comdex.lend.v1beta1.QueryFundReserveBalResponse> getQueryFundReserveBalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFundReserveBal",
      requestType = com.comdex.lend.v1beta1.QueryFundReserveBalRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryFundReserveBalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundReserveBalRequest,
      com.comdex.lend.v1beta1.QueryFundReserveBalResponse> getQueryFundReserveBalMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundReserveBalRequest, com.comdex.lend.v1beta1.QueryFundReserveBalResponse> getQueryFundReserveBalMethod;
    if ((getQueryFundReserveBalMethod = QueryGrpc.getQueryFundReserveBalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryFundReserveBalMethod = QueryGrpc.getQueryFundReserveBalMethod) == null) {
          QueryGrpc.getQueryFundReserveBalMethod = getQueryFundReserveBalMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryFundReserveBalRequest, com.comdex.lend.v1beta1.QueryFundReserveBalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFundReserveBal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundReserveBalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundReserveBalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryFundReserveBal"))
              .build();
        }
      }
    }
    return getQueryFundReserveBalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllReserveStatsRequest,
      com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> getQueryAllReserveStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllReserveStats",
      requestType = com.comdex.lend.v1beta1.QueryAllReserveStatsRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryAllReserveStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllReserveStatsRequest,
      com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> getQueryAllReserveStatsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryAllReserveStatsRequest, com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> getQueryAllReserveStatsMethod;
    if ((getQueryAllReserveStatsMethod = QueryGrpc.getQueryAllReserveStatsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAllReserveStatsMethod = QueryGrpc.getQueryAllReserveStatsMethod) == null) {
          QueryGrpc.getQueryAllReserveStatsMethod = getQueryAllReserveStatsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryAllReserveStatsRequest, com.comdex.lend.v1beta1.QueryAllReserveStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllReserveStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllReserveStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryAllReserveStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAllReserveStats"))
              .build();
        }
      }
    }
    return getQueryAllReserveStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest,
      com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> getQueryFundModBalByAssetPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFundModBalByAssetPool",
      requestType = com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest,
      com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> getQueryFundModBalByAssetPoolMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest, com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> getQueryFundModBalByAssetPoolMethod;
    if ((getQueryFundModBalByAssetPoolMethod = QueryGrpc.getQueryFundModBalByAssetPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryFundModBalByAssetPoolMethod = QueryGrpc.getQueryFundModBalByAssetPoolMethod) == null) {
          QueryGrpc.getQueryFundModBalByAssetPoolMethod = getQueryFundModBalByAssetPoolMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest, com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFundModBalByAssetPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryFundModBalByAssetPool"))
              .build();
        }
      }
    }
    return getQueryFundModBalByAssetPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendInterestRequest,
      com.comdex.lend.v1beta1.QueryLendInterestResponse> getQueryLendInterestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryLendInterest",
      requestType = com.comdex.lend.v1beta1.QueryLendInterestRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryLendInterestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendInterestRequest,
      com.comdex.lend.v1beta1.QueryLendInterestResponse> getQueryLendInterestMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryLendInterestRequest, com.comdex.lend.v1beta1.QueryLendInterestResponse> getQueryLendInterestMethod;
    if ((getQueryLendInterestMethod = QueryGrpc.getQueryLendInterestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryLendInterestMethod = QueryGrpc.getQueryLendInterestMethod) == null) {
          QueryGrpc.getQueryLendInterestMethod = getQueryLendInterestMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryLendInterestRequest, com.comdex.lend.v1beta1.QueryLendInterestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryLendInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryLendInterestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryLendInterest"))
              .build();
        }
      }
    }
    return getQueryLendInterestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowInterestRequest,
      com.comdex.lend.v1beta1.QueryBorrowInterestResponse> getQueryBorrowInterestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryBorrowInterest",
      requestType = com.comdex.lend.v1beta1.QueryBorrowInterestRequest.class,
      responseType = com.comdex.lend.v1beta1.QueryBorrowInterestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowInterestRequest,
      com.comdex.lend.v1beta1.QueryBorrowInterestResponse> getQueryBorrowInterestMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.QueryBorrowInterestRequest, com.comdex.lend.v1beta1.QueryBorrowInterestResponse> getQueryBorrowInterestMethod;
    if ((getQueryBorrowInterestMethod = QueryGrpc.getQueryBorrowInterestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryBorrowInterestMethod = QueryGrpc.getQueryBorrowInterestMethod) == null) {
          QueryGrpc.getQueryBorrowInterestMethod = getQueryBorrowInterestMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.QueryBorrowInterestRequest, com.comdex.lend.v1beta1.QueryBorrowInterestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryBorrowInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.QueryBorrowInterestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryBorrowInterest"))
              .build();
        }
      }
    }
    return getQueryBorrowInterestMethod;
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
    default void queryLends(com.comdex.lend.v1beta1.QueryLendsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLendsMethod(), responseObserver);
    }

    /**
     */
    default void queryLend(com.comdex.lend.v1beta1.QueryLendRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLendMethod(), responseObserver);
    }

    /**
     */
    default void queryAllLendByOwner(com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllLendByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryAllLendByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllLendByOwnerAndPoolMethod(), responseObserver);
    }

    /**
     */
    default void params(com.comdex.lend.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryPairs(com.comdex.lend.v1beta1.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPairsMethod(), responseObserver);
    }

    /**
     */
    default void queryPair(com.comdex.lend.v1beta1.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPairMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetRatesParams(com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetRatesParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetRatesParam(com.comdex.lend.v1beta1.QueryAssetRatesParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetRatesParamMethod(), responseObserver);
    }

    /**
     */
    default void queryPools(com.comdex.lend.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPoolsMethod(), responseObserver);
    }

    /**
     */
    default void queryPool(com.comdex.lend.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPoolMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetToPairMappings(com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetToPairMappingsMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetToPairMapping(com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetToPairMappingMethod(), responseObserver);
    }

    /**
     */
    default void queryBorrows(com.comdex.lend.v1beta1.QueryBorrowsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryBorrowsMethod(), responseObserver);
    }

    /**
     */
    default void queryBorrow(com.comdex.lend.v1beta1.QueryBorrowRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryBorrowMethod(), responseObserver);
    }

    /**
     */
    default void queryAllBorrowByOwner(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllBorrowByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void queryAllBorrowByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllBorrowByOwnerAndPoolMethod(), responseObserver);
    }

    /**
     */
    default void queryPoolAssetLBMapping(com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPoolAssetLBMappingMethod(), responseObserver);
    }

    /**
     */
    default void queryReserveBuybackAssetData(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryReserveBuybackAssetDataMethod(), responseObserver);
    }

    /**
     */
    default void queryAuctionParams(com.comdex.lend.v1beta1.QueryAuctionParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAuctionParamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAuctionParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryModuleBalance(com.comdex.lend.v1beta1.QueryModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryModuleBalanceMethod(), responseObserver);
    }

    /**
     */
    default void queryFundModBal(com.comdex.lend.v1beta1.QueryFundModBalRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFundModBalMethod(), responseObserver);
    }

    /**
     */
    default void queryFundReserveBal(com.comdex.lend.v1beta1.QueryFundReserveBalRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundReserveBalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFundReserveBalMethod(), responseObserver);
    }

    /**
     */
    default void queryAllReserveStats(com.comdex.lend.v1beta1.QueryAllReserveStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllReserveStatsMethod(), responseObserver);
    }

    /**
     */
    default void queryFundModBalByAssetPool(com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFundModBalByAssetPoolMethod(), responseObserver);
    }

    /**
     */
    default void queryLendInterest(com.comdex.lend.v1beta1.QueryLendInterestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendInterestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryLendInterestMethod(), responseObserver);
    }

    /**
     */
    default void queryBorrowInterest(com.comdex.lend.v1beta1.QueryBorrowInterestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowInterestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryBorrowInterestMethod(), responseObserver);
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
    public void queryLends(com.comdex.lend.v1beta1.QueryLendsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLendsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLend(com.comdex.lend.v1beta1.QueryLendRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllLendByOwner(com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllLendByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllLendByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllLendByOwnerAndPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.comdex.lend.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPairs(com.comdex.lend.v1beta1.QueryPairsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPair(com.comdex.lend.v1beta1.QueryPairRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetRatesParams(com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetRatesParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetRatesParam(com.comdex.lend.v1beta1.QueryAssetRatesParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetRatesParamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPools(com.comdex.lend.v1beta1.QueryPoolsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPoolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPool(com.comdex.lend.v1beta1.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetToPairMappings(com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetToPairMappingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetToPairMapping(com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetToPairMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBorrows(com.comdex.lend.v1beta1.QueryBorrowsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryBorrowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBorrow(com.comdex.lend.v1beta1.QueryBorrowRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllBorrowByOwner(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllBorrowByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllBorrowByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllBorrowByOwnerAndPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPoolAssetLBMapping(com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPoolAssetLBMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryReserveBuybackAssetData(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryReserveBuybackAssetDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAuctionParams(com.comdex.lend.v1beta1.QueryAuctionParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAuctionParamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAuctionParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryModuleBalance(com.comdex.lend.v1beta1.QueryModuleBalanceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryModuleBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryModuleBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFundModBal(com.comdex.lend.v1beta1.QueryFundModBalRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFundModBalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFundReserveBal(com.comdex.lend.v1beta1.QueryFundReserveBalRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundReserveBalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFundReserveBalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllReserveStats(com.comdex.lend.v1beta1.QueryAllReserveStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllReserveStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFundModBalByAssetPool(com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFundModBalByAssetPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryLendInterest(com.comdex.lend.v1beta1.QueryLendInterestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendInterestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryLendInterestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBorrowInterest(com.comdex.lend.v1beta1.QueryBorrowInterestRequest request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowInterestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryBorrowInterestMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.lend.v1beta1.QueryLendsResponse queryLends(com.comdex.lend.v1beta1.QueryLendsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLendsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryLendResponse queryLend(com.comdex.lend.v1beta1.QueryLendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLendMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse queryAllLendByOwner(com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllLendByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse queryAllLendByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllLendByOwnerAndPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryParamsResponse params(com.comdex.lend.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryPairsResponse queryPairs(com.comdex.lend.v1beta1.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryPairResponse queryPair(com.comdex.lend.v1beta1.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPairMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse queryAssetRatesParams(com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetRatesParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAssetRatesParamResponse queryAssetRatesParam(com.comdex.lend.v1beta1.QueryAssetRatesParamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetRatesParamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryPoolsResponse queryPools(com.comdex.lend.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPoolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryPoolResponse queryPool(com.comdex.lend.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse queryAssetToPairMappings(com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetToPairMappingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse queryAssetToPairMapping(com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetToPairMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryBorrowsResponse queryBorrows(com.comdex.lend.v1beta1.QueryBorrowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryBorrowsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryBorrowResponse queryBorrow(com.comdex.lend.v1beta1.QueryBorrowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryBorrowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse queryAllBorrowByOwner(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllBorrowByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse queryAllBorrowByOwnerAndPool(com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllBorrowByOwnerAndPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse queryPoolAssetLBMapping(com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPoolAssetLBMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse queryReserveBuybackAssetData(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryReserveBuybackAssetDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAuctionParamResponse queryAuctionParams(com.comdex.lend.v1beta1.QueryAuctionParamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAuctionParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryModuleBalanceResponse queryModuleBalance(com.comdex.lend.v1beta1.QueryModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryModuleBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryFundModBalResponse queryFundModBal(com.comdex.lend.v1beta1.QueryFundModBalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFundModBalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryFundReserveBalResponse queryFundReserveBal(com.comdex.lend.v1beta1.QueryFundReserveBalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFundReserveBalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryAllReserveStatsResponse queryAllReserveStats(com.comdex.lend.v1beta1.QueryAllReserveStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllReserveStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse queryFundModBalByAssetPool(com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFundModBalByAssetPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryLendInterestResponse queryLendInterest(com.comdex.lend.v1beta1.QueryLendInterestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryLendInterestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.QueryBorrowInterestResponse queryBorrowInterest(com.comdex.lend.v1beta1.QueryBorrowInterestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryBorrowInterestMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryLendsResponse> queryLends(
        com.comdex.lend.v1beta1.QueryLendsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLendsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryLendResponse> queryLend(
        com.comdex.lend.v1beta1.QueryLendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse> queryAllLendByOwner(
        com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllLendByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse> queryAllLendByOwnerAndPool(
        com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllLendByOwnerAndPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryParamsResponse> params(
        com.comdex.lend.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryPairsResponse> queryPairs(
        com.comdex.lend.v1beta1.QueryPairsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryPairResponse> queryPair(
        com.comdex.lend.v1beta1.QueryPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPairMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse> queryAssetRatesParams(
        com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetRatesParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAssetRatesParamResponse> queryAssetRatesParam(
        com.comdex.lend.v1beta1.QueryAssetRatesParamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetRatesParamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryPoolsResponse> queryPools(
        com.comdex.lend.v1beta1.QueryPoolsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPoolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryPoolResponse> queryPool(
        com.comdex.lend.v1beta1.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse> queryAssetToPairMappings(
        com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetToPairMappingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse> queryAssetToPairMapping(
        com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetToPairMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryBorrowsResponse> queryBorrows(
        com.comdex.lend.v1beta1.QueryBorrowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryBorrowsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryBorrowResponse> queryBorrow(
        com.comdex.lend.v1beta1.QueryBorrowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryBorrowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse> queryAllBorrowByOwner(
        com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllBorrowByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse> queryAllBorrowByOwnerAndPool(
        com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllBorrowByOwnerAndPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse> queryPoolAssetLBMapping(
        com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPoolAssetLBMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse> queryReserveBuybackAssetData(
        com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryReserveBuybackAssetDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAuctionParamResponse> queryAuctionParams(
        com.comdex.lend.v1beta1.QueryAuctionParamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAuctionParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryModuleBalanceResponse> queryModuleBalance(
        com.comdex.lend.v1beta1.QueryModuleBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryModuleBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryFundModBalResponse> queryFundModBal(
        com.comdex.lend.v1beta1.QueryFundModBalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFundModBalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryFundReserveBalResponse> queryFundReserveBal(
        com.comdex.lend.v1beta1.QueryFundReserveBalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFundReserveBalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryAllReserveStatsResponse> queryAllReserveStats(
        com.comdex.lend.v1beta1.QueryAllReserveStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllReserveStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse> queryFundModBalByAssetPool(
        com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFundModBalByAssetPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryLendInterestResponse> queryLendInterest(
        com.comdex.lend.v1beta1.QueryLendInterestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryLendInterestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.QueryBorrowInterestResponse> queryBorrowInterest(
        com.comdex.lend.v1beta1.QueryBorrowInterestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryBorrowInterestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_LENDS = 0;
  private static final int METHODID_QUERY_LEND = 1;
  private static final int METHODID_QUERY_ALL_LEND_BY_OWNER = 2;
  private static final int METHODID_QUERY_ALL_LEND_BY_OWNER_AND_POOL = 3;
  private static final int METHODID_PARAMS = 4;
  private static final int METHODID_QUERY_PAIRS = 5;
  private static final int METHODID_QUERY_PAIR = 6;
  private static final int METHODID_QUERY_ASSET_RATES_PARAMS = 7;
  private static final int METHODID_QUERY_ASSET_RATES_PARAM = 8;
  private static final int METHODID_QUERY_POOLS = 9;
  private static final int METHODID_QUERY_POOL = 10;
  private static final int METHODID_QUERY_ASSET_TO_PAIR_MAPPINGS = 11;
  private static final int METHODID_QUERY_ASSET_TO_PAIR_MAPPING = 12;
  private static final int METHODID_QUERY_BORROWS = 13;
  private static final int METHODID_QUERY_BORROW = 14;
  private static final int METHODID_QUERY_ALL_BORROW_BY_OWNER = 15;
  private static final int METHODID_QUERY_ALL_BORROW_BY_OWNER_AND_POOL = 16;
  private static final int METHODID_QUERY_POOL_ASSET_LBMAPPING = 17;
  private static final int METHODID_QUERY_RESERVE_BUYBACK_ASSET_DATA = 18;
  private static final int METHODID_QUERY_AUCTION_PARAMS = 19;
  private static final int METHODID_QUERY_MODULE_BALANCE = 20;
  private static final int METHODID_QUERY_FUND_MOD_BAL = 21;
  private static final int METHODID_QUERY_FUND_RESERVE_BAL = 22;
  private static final int METHODID_QUERY_ALL_RESERVE_STATS = 23;
  private static final int METHODID_QUERY_FUND_MOD_BAL_BY_ASSET_POOL = 24;
  private static final int METHODID_QUERY_LEND_INTEREST = 25;
  private static final int METHODID_QUERY_BORROW_INTEREST = 26;

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
        case METHODID_QUERY_LENDS:
          serviceImpl.queryLends((com.comdex.lend.v1beta1.QueryLendsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendsResponse>) responseObserver);
          break;
        case METHODID_QUERY_LEND:
          serviceImpl.queryLend((com.comdex.lend.v1beta1.QueryLendRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_LEND_BY_OWNER:
          serviceImpl.queryAllLendByOwner((com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_LEND_BY_OWNER_AND_POOL:
          serviceImpl.queryAllLendByOwnerAndPool((com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.comdex.lend.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAIRS:
          serviceImpl.queryPairs((com.comdex.lend.v1beta1.QueryPairsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAIR:
          serviceImpl.queryPair((com.comdex.lend.v1beta1.QueryPairRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPairResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_RATES_PARAMS:
          serviceImpl.queryAssetRatesParams((com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_RATES_PARAM:
          serviceImpl.queryAssetRatesParam((com.comdex.lend.v1beta1.QueryAssetRatesParamRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetRatesParamResponse>) responseObserver);
          break;
        case METHODID_QUERY_POOLS:
          serviceImpl.queryPools((com.comdex.lend.v1beta1.QueryPoolsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolsResponse>) responseObserver);
          break;
        case METHODID_QUERY_POOL:
          serviceImpl.queryPool((com.comdex.lend.v1beta1.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_TO_PAIR_MAPPINGS:
          serviceImpl.queryAssetToPairMappings((com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_TO_PAIR_MAPPING:
          serviceImpl.queryAssetToPairMapping((com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse>) responseObserver);
          break;
        case METHODID_QUERY_BORROWS:
          serviceImpl.queryBorrows((com.comdex.lend.v1beta1.QueryBorrowsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowsResponse>) responseObserver);
          break;
        case METHODID_QUERY_BORROW:
          serviceImpl.queryBorrow((com.comdex.lend.v1beta1.QueryBorrowRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_BORROW_BY_OWNER:
          serviceImpl.queryAllBorrowByOwner((com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_BORROW_BY_OWNER_AND_POOL:
          serviceImpl.queryAllBorrowByOwnerAndPool((com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse>) responseObserver);
          break;
        case METHODID_QUERY_POOL_ASSET_LBMAPPING:
          serviceImpl.queryPoolAssetLBMapping((com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse>) responseObserver);
          break;
        case METHODID_QUERY_RESERVE_BUYBACK_ASSET_DATA:
          serviceImpl.queryReserveBuybackAssetData((com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse>) responseObserver);
          break;
        case METHODID_QUERY_AUCTION_PARAMS:
          serviceImpl.queryAuctionParams((com.comdex.lend.v1beta1.QueryAuctionParamRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAuctionParamResponse>) responseObserver);
          break;
        case METHODID_QUERY_MODULE_BALANCE:
          serviceImpl.queryModuleBalance((com.comdex.lend.v1beta1.QueryModuleBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryModuleBalanceResponse>) responseObserver);
          break;
        case METHODID_QUERY_FUND_MOD_BAL:
          serviceImpl.queryFundModBal((com.comdex.lend.v1beta1.QueryFundModBalRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalResponse>) responseObserver);
          break;
        case METHODID_QUERY_FUND_RESERVE_BAL:
          serviceImpl.queryFundReserveBal((com.comdex.lend.v1beta1.QueryFundReserveBalRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundReserveBalResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALL_RESERVE_STATS:
          serviceImpl.queryAllReserveStats((com.comdex.lend.v1beta1.QueryAllReserveStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryAllReserveStatsResponse>) responseObserver);
          break;
        case METHODID_QUERY_FUND_MOD_BAL_BY_ASSET_POOL:
          serviceImpl.queryFundModBalByAssetPool((com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse>) responseObserver);
          break;
        case METHODID_QUERY_LEND_INTEREST:
          serviceImpl.queryLendInterest((com.comdex.lend.v1beta1.QueryLendInterestRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryLendInterestResponse>) responseObserver);
          break;
        case METHODID_QUERY_BORROW_INTEREST:
          serviceImpl.queryBorrowInterest((com.comdex.lend.v1beta1.QueryBorrowInterestRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.QueryBorrowInterestResponse>) responseObserver);
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
          getQueryLendsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryLendsRequest,
              com.comdex.lend.v1beta1.QueryLendsResponse>(
                service, METHODID_QUERY_LENDS)))
        .addMethod(
          getQueryLendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryLendRequest,
              com.comdex.lend.v1beta1.QueryLendResponse>(
                service, METHODID_QUERY_LEND)))
        .addMethod(
          getQueryAllLendByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAllLendByOwnerRequest,
              com.comdex.lend.v1beta1.QueryAllLendByOwnerResponse>(
                service, METHODID_QUERY_ALL_LEND_BY_OWNER)))
        .addMethod(
          getQueryAllLendByOwnerAndPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolRequest,
              com.comdex.lend.v1beta1.QueryAllLendByOwnerAndPoolResponse>(
                service, METHODID_QUERY_ALL_LEND_BY_OWNER_AND_POOL)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryParamsRequest,
              com.comdex.lend.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryPairsRequest,
              com.comdex.lend.v1beta1.QueryPairsResponse>(
                service, METHODID_QUERY_PAIRS)))
        .addMethod(
          getQueryPairMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryPairRequest,
              com.comdex.lend.v1beta1.QueryPairResponse>(
                service, METHODID_QUERY_PAIR)))
        .addMethod(
          getQueryAssetRatesParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAssetRatesParamsRequest,
              com.comdex.lend.v1beta1.QueryAssetRatesParamsResponse>(
                service, METHODID_QUERY_ASSET_RATES_PARAMS)))
        .addMethod(
          getQueryAssetRatesParamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAssetRatesParamRequest,
              com.comdex.lend.v1beta1.QueryAssetRatesParamResponse>(
                service, METHODID_QUERY_ASSET_RATES_PARAM)))
        .addMethod(
          getQueryPoolsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryPoolsRequest,
              com.comdex.lend.v1beta1.QueryPoolsResponse>(
                service, METHODID_QUERY_POOLS)))
        .addMethod(
          getQueryPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryPoolRequest,
              com.comdex.lend.v1beta1.QueryPoolResponse>(
                service, METHODID_QUERY_POOL)))
        .addMethod(
          getQueryAssetToPairMappingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAssetToPairMappingsRequest,
              com.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse>(
                service, METHODID_QUERY_ASSET_TO_PAIR_MAPPINGS)))
        .addMethod(
          getQueryAssetToPairMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAssetToPairMappingRequest,
              com.comdex.lend.v1beta1.QueryAssetToPairMappingResponse>(
                service, METHODID_QUERY_ASSET_TO_PAIR_MAPPING)))
        .addMethod(
          getQueryBorrowsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryBorrowsRequest,
              com.comdex.lend.v1beta1.QueryBorrowsResponse>(
                service, METHODID_QUERY_BORROWS)))
        .addMethod(
          getQueryBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryBorrowRequest,
              com.comdex.lend.v1beta1.QueryBorrowResponse>(
                service, METHODID_QUERY_BORROW)))
        .addMethod(
          getQueryAllBorrowByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAllBorrowByOwnerRequest,
              com.comdex.lend.v1beta1.QueryAllBorrowByOwnerResponse>(
                service, METHODID_QUERY_ALL_BORROW_BY_OWNER)))
        .addMethod(
          getQueryAllBorrowByOwnerAndPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolRequest,
              com.comdex.lend.v1beta1.QueryAllBorrowByOwnerAndPoolResponse>(
                service, METHODID_QUERY_ALL_BORROW_BY_OWNER_AND_POOL)))
        .addMethod(
          getQueryPoolAssetLBMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryPoolAssetLBMappingRequest,
              com.comdex.lend.v1beta1.QueryPoolAssetLBMappingResponse>(
                service, METHODID_QUERY_POOL_ASSET_LBMAPPING)))
        .addMethod(
          getQueryReserveBuybackAssetDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataRequest,
              com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse>(
                service, METHODID_QUERY_RESERVE_BUYBACK_ASSET_DATA)))
        .addMethod(
          getQueryAuctionParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAuctionParamRequest,
              com.comdex.lend.v1beta1.QueryAuctionParamResponse>(
                service, METHODID_QUERY_AUCTION_PARAMS)))
        .addMethod(
          getQueryModuleBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryModuleBalanceRequest,
              com.comdex.lend.v1beta1.QueryModuleBalanceResponse>(
                service, METHODID_QUERY_MODULE_BALANCE)))
        .addMethod(
          getQueryFundModBalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryFundModBalRequest,
              com.comdex.lend.v1beta1.QueryFundModBalResponse>(
                service, METHODID_QUERY_FUND_MOD_BAL)))
        .addMethod(
          getQueryFundReserveBalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryFundReserveBalRequest,
              com.comdex.lend.v1beta1.QueryFundReserveBalResponse>(
                service, METHODID_QUERY_FUND_RESERVE_BAL)))
        .addMethod(
          getQueryAllReserveStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryAllReserveStatsRequest,
              com.comdex.lend.v1beta1.QueryAllReserveStatsResponse>(
                service, METHODID_QUERY_ALL_RESERVE_STATS)))
        .addMethod(
          getQueryFundModBalByAssetPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolRequest,
              com.comdex.lend.v1beta1.QueryFundModBalByAssetPoolResponse>(
                service, METHODID_QUERY_FUND_MOD_BAL_BY_ASSET_POOL)))
        .addMethod(
          getQueryLendInterestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryLendInterestRequest,
              com.comdex.lend.v1beta1.QueryLendInterestResponse>(
                service, METHODID_QUERY_LEND_INTEREST)))
        .addMethod(
          getQueryBorrowInterestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.QueryBorrowInterestRequest,
              com.comdex.lend.v1beta1.QueryBorrowInterestResponse>(
                service, METHODID_QUERY_BORROW_INTEREST)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.lend.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQueryLendsMethod())
              .addMethod(getQueryLendMethod())
              .addMethod(getQueryAllLendByOwnerMethod())
              .addMethod(getQueryAllLendByOwnerAndPoolMethod())
              .addMethod(getParamsMethod())
              .addMethod(getQueryPairsMethod())
              .addMethod(getQueryPairMethod())
              .addMethod(getQueryAssetRatesParamsMethod())
              .addMethod(getQueryAssetRatesParamMethod())
              .addMethod(getQueryPoolsMethod())
              .addMethod(getQueryPoolMethod())
              .addMethod(getQueryAssetToPairMappingsMethod())
              .addMethod(getQueryAssetToPairMappingMethod())
              .addMethod(getQueryBorrowsMethod())
              .addMethod(getQueryBorrowMethod())
              .addMethod(getQueryAllBorrowByOwnerMethod())
              .addMethod(getQueryAllBorrowByOwnerAndPoolMethod())
              .addMethod(getQueryPoolAssetLBMappingMethod())
              .addMethod(getQueryReserveBuybackAssetDataMethod())
              .addMethod(getQueryAuctionParamsMethod())
              .addMethod(getQueryModuleBalanceMethod())
              .addMethod(getQueryFundModBalMethod())
              .addMethod(getQueryFundReserveBalMethod())
              .addMethod(getQueryAllReserveStatsMethod())
              .addMethod(getQueryFundModBalByAssetPoolMethod())
              .addMethod(getQueryLendInterestMethod())
              .addMethod(getQueryBorrowInterestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
