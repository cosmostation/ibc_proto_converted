package com.osmosis.protorev.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/protorev/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.protorev.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> getGetProtoRevNumberOfTradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevNumberOfTrades",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> getGetProtoRevNumberOfTradesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> getGetProtoRevNumberOfTradesMethod;
    if ((getGetProtoRevNumberOfTradesMethod = QueryGrpc.getGetProtoRevNumberOfTradesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevNumberOfTradesMethod = QueryGrpc.getGetProtoRevNumberOfTradesMethod) == null) {
          QueryGrpc.getGetProtoRevNumberOfTradesMethod = getGetProtoRevNumberOfTradesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevNumberOfTrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevNumberOfTrades"))
              .build();
        }
      }
    }
    return getGetProtoRevNumberOfTradesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> getGetProtoRevProfitsByDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevProfitsByDenom",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> getGetProtoRevProfitsByDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> getGetProtoRevProfitsByDenomMethod;
    if ((getGetProtoRevProfitsByDenomMethod = QueryGrpc.getGetProtoRevProfitsByDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevProfitsByDenomMethod = QueryGrpc.getGetProtoRevProfitsByDenomMethod) == null) {
          QueryGrpc.getGetProtoRevProfitsByDenomMethod = getGetProtoRevProfitsByDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevProfitsByDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevProfitsByDenom"))
              .build();
        }
      }
    }
    return getGetProtoRevProfitsByDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> getGetProtoRevAllProfitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevAllProfits",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> getGetProtoRevAllProfitsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> getGetProtoRevAllProfitsMethod;
    if ((getGetProtoRevAllProfitsMethod = QueryGrpc.getGetProtoRevAllProfitsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevAllProfitsMethod = QueryGrpc.getGetProtoRevAllProfitsMethod) == null) {
          QueryGrpc.getGetProtoRevAllProfitsMethod = getGetProtoRevAllProfitsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevAllProfits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevAllProfits"))
              .build();
        }
      }
    }
    return getGetProtoRevAllProfitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> getGetProtoRevStatisticsByRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevStatisticsByRoute",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> getGetProtoRevStatisticsByRouteMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> getGetProtoRevStatisticsByRouteMethod;
    if ((getGetProtoRevStatisticsByRouteMethod = QueryGrpc.getGetProtoRevStatisticsByRouteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevStatisticsByRouteMethod = QueryGrpc.getGetProtoRevStatisticsByRouteMethod) == null) {
          QueryGrpc.getGetProtoRevStatisticsByRouteMethod = getGetProtoRevStatisticsByRouteMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevStatisticsByRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevStatisticsByRoute"))
              .build();
        }
      }
    }
    return getGetProtoRevStatisticsByRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> getGetProtoRevAllRouteStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevAllRouteStatistics",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> getGetProtoRevAllRouteStatisticsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> getGetProtoRevAllRouteStatisticsMethod;
    if ((getGetProtoRevAllRouteStatisticsMethod = QueryGrpc.getGetProtoRevAllRouteStatisticsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevAllRouteStatisticsMethod = QueryGrpc.getGetProtoRevAllRouteStatisticsMethod) == null) {
          QueryGrpc.getGetProtoRevAllRouteStatisticsMethod = getGetProtoRevAllRouteStatisticsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevAllRouteStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevAllRouteStatistics"))
              .build();
        }
      }
    }
    return getGetProtoRevAllRouteStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> getGetProtoRevTokenPairArbRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevTokenPairArbRoutes",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> getGetProtoRevTokenPairArbRoutesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> getGetProtoRevTokenPairArbRoutesMethod;
    if ((getGetProtoRevTokenPairArbRoutesMethod = QueryGrpc.getGetProtoRevTokenPairArbRoutesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevTokenPairArbRoutesMethod = QueryGrpc.getGetProtoRevTokenPairArbRoutesMethod) == null) {
          QueryGrpc.getGetProtoRevTokenPairArbRoutesMethod = getGetProtoRevTokenPairArbRoutesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevTokenPairArbRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevTokenPairArbRoutes"))
              .build();
        }
      }
    }
    return getGetProtoRevTokenPairArbRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> getGetProtoRevAdminAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevAdminAccount",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> getGetProtoRevAdminAccountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> getGetProtoRevAdminAccountMethod;
    if ((getGetProtoRevAdminAccountMethod = QueryGrpc.getGetProtoRevAdminAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevAdminAccountMethod = QueryGrpc.getGetProtoRevAdminAccountMethod) == null) {
          QueryGrpc.getGetProtoRevAdminAccountMethod = getGetProtoRevAdminAccountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevAdminAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevAdminAccount"))
              .build();
        }
      }
    }
    return getGetProtoRevAdminAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> getGetProtoRevDeveloperAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevDeveloperAccount",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> getGetProtoRevDeveloperAccountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> getGetProtoRevDeveloperAccountMethod;
    if ((getGetProtoRevDeveloperAccountMethod = QueryGrpc.getGetProtoRevDeveloperAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevDeveloperAccountMethod = QueryGrpc.getGetProtoRevDeveloperAccountMethod) == null) {
          QueryGrpc.getGetProtoRevDeveloperAccountMethod = getGetProtoRevDeveloperAccountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevDeveloperAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevDeveloperAccount"))
              .build();
        }
      }
    }
    return getGetProtoRevDeveloperAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> getGetProtoRevPoolWeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevPoolWeights",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> getGetProtoRevPoolWeightsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> getGetProtoRevPoolWeightsMethod;
    if ((getGetProtoRevPoolWeightsMethod = QueryGrpc.getGetProtoRevPoolWeightsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevPoolWeightsMethod = QueryGrpc.getGetProtoRevPoolWeightsMethod) == null) {
          QueryGrpc.getGetProtoRevPoolWeightsMethod = getGetProtoRevPoolWeightsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevPoolWeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevPoolWeights"))
              .build();
        }
      }
    }
    return getGetProtoRevPoolWeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> getGetProtoRevMaxPoolPointsPerTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevMaxPoolPointsPerTx",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> getGetProtoRevMaxPoolPointsPerTxMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> getGetProtoRevMaxPoolPointsPerTxMethod;
    if ((getGetProtoRevMaxPoolPointsPerTxMethod = QueryGrpc.getGetProtoRevMaxPoolPointsPerTxMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevMaxPoolPointsPerTxMethod = QueryGrpc.getGetProtoRevMaxPoolPointsPerTxMethod) == null) {
          QueryGrpc.getGetProtoRevMaxPoolPointsPerTxMethod = getGetProtoRevMaxPoolPointsPerTxMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevMaxPoolPointsPerTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevMaxPoolPointsPerTx"))
              .build();
        }
      }
    }
    return getGetProtoRevMaxPoolPointsPerTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> getGetProtoRevMaxPoolPointsPerBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevMaxPoolPointsPerBlock",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> getGetProtoRevMaxPoolPointsPerBlockMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> getGetProtoRevMaxPoolPointsPerBlockMethod;
    if ((getGetProtoRevMaxPoolPointsPerBlockMethod = QueryGrpc.getGetProtoRevMaxPoolPointsPerBlockMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevMaxPoolPointsPerBlockMethod = QueryGrpc.getGetProtoRevMaxPoolPointsPerBlockMethod) == null) {
          QueryGrpc.getGetProtoRevMaxPoolPointsPerBlockMethod = getGetProtoRevMaxPoolPointsPerBlockMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevMaxPoolPointsPerBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevMaxPoolPointsPerBlock"))
              .build();
        }
      }
    }
    return getGetProtoRevMaxPoolPointsPerBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> getGetProtoRevBaseDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevBaseDenoms",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> getGetProtoRevBaseDenomsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> getGetProtoRevBaseDenomsMethod;
    if ((getGetProtoRevBaseDenomsMethod = QueryGrpc.getGetProtoRevBaseDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevBaseDenomsMethod = QueryGrpc.getGetProtoRevBaseDenomsMethod) == null) {
          QueryGrpc.getGetProtoRevBaseDenomsMethod = getGetProtoRevBaseDenomsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevBaseDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevBaseDenoms"))
              .build();
        }
      }
    }
    return getGetProtoRevBaseDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> getGetProtoRevEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevEnabled",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> getGetProtoRevEnabledMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> getGetProtoRevEnabledMethod;
    if ((getGetProtoRevEnabledMethod = QueryGrpc.getGetProtoRevEnabledMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevEnabledMethod = QueryGrpc.getGetProtoRevEnabledMethod) == null) {
          QueryGrpc.getGetProtoRevEnabledMethod = getGetProtoRevEnabledMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevEnabled"))
              .build();
        }
      }
    }
    return getGetProtoRevEnabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> getGetProtoRevPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProtoRevPool",
      requestType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest.class,
      responseType = com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest,
      com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> getGetProtoRevPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> getGetProtoRevPoolMethod;
    if ((getGetProtoRevPoolMethod = QueryGrpc.getGetProtoRevPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProtoRevPoolMethod = QueryGrpc.getGetProtoRevPoolMethod) == null) {
          QueryGrpc.getGetProtoRevPoolMethod = getGetProtoRevPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest, com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProtoRevPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProtoRevPool"))
              .build();
        }
      }
    }
    return getGetProtoRevPoolMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries the parameters of the module.
     * </pre>
     */
    default void params(com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevNumberOfTrades queries the number of arbitrage trades the module
     * has executed
     * </pre>
     */
    default void getProtoRevNumberOfTrades(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevNumberOfTradesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevProfitsByDenom queries the profits of the module by denom
     * </pre>
     */
    default void getProtoRevProfitsByDenom(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevProfitsByDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAllProfits queries all of the profits from the module
     * </pre>
     */
    default void getProtoRevAllProfits(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevAllProfitsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevStatisticsByRoute queries the number of arbitrages and profits
     * that have been executed for a given route
     * </pre>
     */
    default void getProtoRevStatisticsByRoute(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevStatisticsByRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAllRouteStatistics queries all of routes that the module has
     * arbitraged against and the number of trades and profits that have been
     * accumulated for each route
     * </pre>
     */
    default void getProtoRevAllRouteStatistics(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevAllRouteStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevTokenPairArbRoutes queries all of the hot routes that the module
     * is currently arbitraging
     * </pre>
     */
    default void getProtoRevTokenPairArbRoutes(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevTokenPairArbRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAdminAccount queries the admin account of the module
     * </pre>
     */
    default void getProtoRevAdminAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevAdminAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevDeveloperAccount queries the developer account of the module
     * </pre>
     */
    default void getProtoRevDeveloperAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevDeveloperAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevPoolWeights queries the weights of each pool type currently
     * being used by the module
     * </pre>
     */
    default void getProtoRevPoolWeights(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevPoolWeightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerTx queries the maximum number of pool points
     * that can be consumed per transaction
     * </pre>
     */
    default void getProtoRevMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevMaxPoolPointsPerTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerBlock queries the maximum number of pool points
     * that can consumed per block
     * </pre>
     */
    default void getProtoRevMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevMaxPoolPointsPerBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevBaseDenoms queries the base denoms that the module is currently
     * utilizing for arbitrage
     * </pre>
     */
    default void getProtoRevBaseDenoms(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevBaseDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevEnabled queries whether the module is enabled or not
     * </pre>
     */
    default void getProtoRevEnabled(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevEnabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevPool queries the pool id used via the highest liquidity method
     * for arbitrage route building given a pair of denominations
     * </pre>
     */
    default void getProtoRevPool(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProtoRevPoolMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     * <pre>
     * Params queries the parameters of the module.
     * </pre>
     */
    public void params(com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevNumberOfTrades queries the number of arbitrage trades the module
     * has executed
     * </pre>
     */
    public void getProtoRevNumberOfTrades(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevNumberOfTradesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevProfitsByDenom queries the profits of the module by denom
     * </pre>
     */
    public void getProtoRevProfitsByDenom(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevProfitsByDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAllProfits queries all of the profits from the module
     * </pre>
     */
    public void getProtoRevAllProfits(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevAllProfitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevStatisticsByRoute queries the number of arbitrages and profits
     * that have been executed for a given route
     * </pre>
     */
    public void getProtoRevStatisticsByRoute(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevStatisticsByRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAllRouteStatistics queries all of routes that the module has
     * arbitraged against and the number of trades and profits that have been
     * accumulated for each route
     * </pre>
     */
    public void getProtoRevAllRouteStatistics(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevAllRouteStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevTokenPairArbRoutes queries all of the hot routes that the module
     * is currently arbitraging
     * </pre>
     */
    public void getProtoRevTokenPairArbRoutes(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevTokenPairArbRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevAdminAccount queries the admin account of the module
     * </pre>
     */
    public void getProtoRevAdminAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevAdminAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevDeveloperAccount queries the developer account of the module
     * </pre>
     */
    public void getProtoRevDeveloperAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevDeveloperAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevPoolWeights queries the weights of each pool type currently
     * being used by the module
     * </pre>
     */
    public void getProtoRevPoolWeights(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevPoolWeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerTx queries the maximum number of pool points
     * that can be consumed per transaction
     * </pre>
     */
    public void getProtoRevMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevMaxPoolPointsPerTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerBlock queries the maximum number of pool points
     * that can consumed per block
     * </pre>
     */
    public void getProtoRevMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevMaxPoolPointsPerBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevBaseDenoms queries the base denoms that the module is currently
     * utilizing for arbitrage
     * </pre>
     */
    public void getProtoRevBaseDenoms(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevBaseDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevEnabled queries whether the module is enabled or not
     * </pre>
     */
    public void getProtoRevEnabled(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevEnabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProtoRevPool queries the pool id used via the highest liquidity method
     * for arbitrage route building given a pair of denominations
     * </pre>
     */
    public void getProtoRevPool(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProtoRevPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * <pre>
     * Params queries the parameters of the module.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse params(com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevNumberOfTrades queries the number of arbitrage trades the module
     * has executed
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse getProtoRevNumberOfTrades(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevNumberOfTradesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevProfitsByDenom queries the profits of the module by denom
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse getProtoRevProfitsByDenom(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevProfitsByDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevAllProfits queries all of the profits from the module
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse getProtoRevAllProfits(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevAllProfitsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevStatisticsByRoute queries the number of arbitrages and profits
     * that have been executed for a given route
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse getProtoRevStatisticsByRoute(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevStatisticsByRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevAllRouteStatistics queries all of routes that the module has
     * arbitraged against and the number of trades and profits that have been
     * accumulated for each route
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse getProtoRevAllRouteStatistics(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevAllRouteStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevTokenPairArbRoutes queries all of the hot routes that the module
     * is currently arbitraging
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse getProtoRevTokenPairArbRoutes(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevTokenPairArbRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevAdminAccount queries the admin account of the module
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse getProtoRevAdminAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevAdminAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevDeveloperAccount queries the developer account of the module
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse getProtoRevDeveloperAccount(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevDeveloperAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevPoolWeights queries the weights of each pool type currently
     * being used by the module
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse getProtoRevPoolWeights(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevPoolWeightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerTx queries the maximum number of pool points
     * that can be consumed per transaction
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse getProtoRevMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevMaxPoolPointsPerTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerBlock queries the maximum number of pool points
     * that can consumed per block
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse getProtoRevMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevMaxPoolPointsPerBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevBaseDenoms queries the base denoms that the module is currently
     * utilizing for arbitrage
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse getProtoRevBaseDenoms(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevBaseDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevEnabled queries whether the module is enabled or not
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse getProtoRevEnabled(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevEnabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProtoRevPool queries the pool id used via the highest liquidity method
     * for arbitrage route building given a pair of denominations
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse getProtoRevPool(com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProtoRevPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * <pre>
     * Params queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse> params(
        com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevNumberOfTrades queries the number of arbitrage trades the module
     * has executed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse> getProtoRevNumberOfTrades(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevNumberOfTradesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevProfitsByDenom queries the profits of the module by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse> getProtoRevProfitsByDenom(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevProfitsByDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevAllProfits queries all of the profits from the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse> getProtoRevAllProfits(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevAllProfitsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevStatisticsByRoute queries the number of arbitrages and profits
     * that have been executed for a given route
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse> getProtoRevStatisticsByRoute(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevStatisticsByRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevAllRouteStatistics queries all of routes that the module has
     * arbitraged against and the number of trades and profits that have been
     * accumulated for each route
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse> getProtoRevAllRouteStatistics(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevAllRouteStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevTokenPairArbRoutes queries all of the hot routes that the module
     * is currently arbitraging
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse> getProtoRevTokenPairArbRoutes(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevTokenPairArbRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevAdminAccount queries the admin account of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse> getProtoRevAdminAccount(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevAdminAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevDeveloperAccount queries the developer account of the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse> getProtoRevDeveloperAccount(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevDeveloperAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevPoolWeights queries the weights of each pool type currently
     * being used by the module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse> getProtoRevPoolWeights(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevPoolWeightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerTx queries the maximum number of pool points
     * that can be consumed per transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse> getProtoRevMaxPoolPointsPerTx(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevMaxPoolPointsPerTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevMaxPoolPointsPerBlock queries the maximum number of pool points
     * that can consumed per block
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse> getProtoRevMaxPoolPointsPerBlock(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevMaxPoolPointsPerBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevBaseDenoms queries the base denoms that the module is currently
     * utilizing for arbitrage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse> getProtoRevBaseDenoms(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevBaseDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevEnabled queries whether the module is enabled or not
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse> getProtoRevEnabled(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevEnabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProtoRevPool queries the pool id used via the highest liquidity method
     * for arbitrage route building given a pair of denominations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse> getProtoRevPool(
        com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProtoRevPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_GET_PROTO_REV_NUMBER_OF_TRADES = 1;
  private static final int METHODID_GET_PROTO_REV_PROFITS_BY_DENOM = 2;
  private static final int METHODID_GET_PROTO_REV_ALL_PROFITS = 3;
  private static final int METHODID_GET_PROTO_REV_STATISTICS_BY_ROUTE = 4;
  private static final int METHODID_GET_PROTO_REV_ALL_ROUTE_STATISTICS = 5;
  private static final int METHODID_GET_PROTO_REV_TOKEN_PAIR_ARB_ROUTES = 6;
  private static final int METHODID_GET_PROTO_REV_ADMIN_ACCOUNT = 7;
  private static final int METHODID_GET_PROTO_REV_DEVELOPER_ACCOUNT = 8;
  private static final int METHODID_GET_PROTO_REV_POOL_WEIGHTS = 9;
  private static final int METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_TX = 10;
  private static final int METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_BLOCK = 11;
  private static final int METHODID_GET_PROTO_REV_BASE_DENOMS = 12;
  private static final int METHODID_GET_PROTO_REV_ENABLED = 13;
  private static final int METHODID_GET_PROTO_REV_POOL = 14;

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
          serviceImpl.params((com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_NUMBER_OF_TRADES:
          serviceImpl.getProtoRevNumberOfTrades((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_PROFITS_BY_DENOM:
          serviceImpl.getProtoRevProfitsByDenom((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_ALL_PROFITS:
          serviceImpl.getProtoRevAllProfits((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_STATISTICS_BY_ROUTE:
          serviceImpl.getProtoRevStatisticsByRoute((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_ALL_ROUTE_STATISTICS:
          serviceImpl.getProtoRevAllRouteStatistics((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_TOKEN_PAIR_ARB_ROUTES:
          serviceImpl.getProtoRevTokenPairArbRoutes((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_ADMIN_ACCOUNT:
          serviceImpl.getProtoRevAdminAccount((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_DEVELOPER_ACCOUNT:
          serviceImpl.getProtoRevDeveloperAccount((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_POOL_WEIGHTS:
          serviceImpl.getProtoRevPoolWeights((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_TX:
          serviceImpl.getProtoRevMaxPoolPointsPerTx((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_BLOCK:
          serviceImpl.getProtoRevMaxPoolPointsPerBlock((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_BASE_DENOMS:
          serviceImpl.getProtoRevBaseDenoms((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_ENABLED:
          serviceImpl.getProtoRevEnabled((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse>) responseObserver);
          break;
        case METHODID_GET_PROTO_REV_POOL:
          serviceImpl.getProtoRevPool((com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse>) responseObserver);
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
              com.osmosis.protorev.v1beta1.QueryProto.QueryParamsRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getGetProtoRevNumberOfTradesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevNumberOfTradesResponse>(
                service, METHODID_GET_PROTO_REV_NUMBER_OF_TRADES)))
        .addMethod(
          getGetProtoRevProfitsByDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevProfitsByDenomResponse>(
                service, METHODID_GET_PROTO_REV_PROFITS_BY_DENOM)))
        .addMethod(
          getGetProtoRevAllProfitsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllProfitsResponse>(
                service, METHODID_GET_PROTO_REV_ALL_PROFITS)))
        .addMethod(
          getGetProtoRevStatisticsByRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevStatisticsByRouteResponse>(
                service, METHODID_GET_PROTO_REV_STATISTICS_BY_ROUTE)))
        .addMethod(
          getGetProtoRevAllRouteStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAllRouteStatisticsResponse>(
                service, METHODID_GET_PROTO_REV_ALL_ROUTE_STATISTICS)))
        .addMethod(
          getGetProtoRevTokenPairArbRoutesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevTokenPairArbRoutesResponse>(
                service, METHODID_GET_PROTO_REV_TOKEN_PAIR_ARB_ROUTES)))
        .addMethod(
          getGetProtoRevAdminAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevAdminAccountResponse>(
                service, METHODID_GET_PROTO_REV_ADMIN_ACCOUNT)))
        .addMethod(
          getGetProtoRevDeveloperAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevDeveloperAccountResponse>(
                service, METHODID_GET_PROTO_REV_DEVELOPER_ACCOUNT)))
        .addMethod(
          getGetProtoRevPoolWeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolWeightsResponse>(
                service, METHODID_GET_PROTO_REV_POOL_WEIGHTS)))
        .addMethod(
          getGetProtoRevMaxPoolPointsPerTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerTxResponse>(
                service, METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_TX)))
        .addMethod(
          getGetProtoRevMaxPoolPointsPerBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevMaxPoolPointsPerBlockResponse>(
                service, METHODID_GET_PROTO_REV_MAX_POOL_POINTS_PER_BLOCK)))
        .addMethod(
          getGetProtoRevBaseDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevBaseDenomsResponse>(
                service, METHODID_GET_PROTO_REV_BASE_DENOMS)))
        .addMethod(
          getGetProtoRevEnabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevEnabledResponse>(
                service, METHODID_GET_PROTO_REV_ENABLED)))
        .addMethod(
          getGetProtoRevPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolRequest,
              com.osmosis.protorev.v1beta1.QueryProto.QueryGetProtoRevPoolResponse>(
                service, METHODID_GET_PROTO_REV_POOL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.protorev.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getGetProtoRevNumberOfTradesMethod())
              .addMethod(getGetProtoRevProfitsByDenomMethod())
              .addMethod(getGetProtoRevAllProfitsMethod())
              .addMethod(getGetProtoRevStatisticsByRouteMethod())
              .addMethod(getGetProtoRevAllRouteStatisticsMethod())
              .addMethod(getGetProtoRevTokenPairArbRoutesMethod())
              .addMethod(getGetProtoRevAdminAccountMethod())
              .addMethod(getGetProtoRevDeveloperAccountMethod())
              .addMethod(getGetProtoRevPoolWeightsMethod())
              .addMethod(getGetProtoRevMaxPoolPointsPerTxMethod())
              .addMethod(getGetProtoRevMaxPoolPointsPerBlockMethod())
              .addMethod(getGetProtoRevBaseDenomsMethod())
              .addMethod(getGetProtoRevEnabledMethod())
              .addMethod(getGetProtoRevPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
