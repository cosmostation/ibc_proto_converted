package com.regen.ecocredit.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the regen.ecocredit.v1alpha2 Query service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/ecocredit/v1alpha2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "regen.ecocredit.v1alpha2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassesRequest,
      com.regen.ecocredit.v1alpha2.QueryClassesResponse> getClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Classes",
      requestType = com.regen.ecocredit.v1alpha2.QueryClassesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassesRequest,
      com.regen.ecocredit.v1alpha2.QueryClassesResponse> getClassesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassesRequest, com.regen.ecocredit.v1alpha2.QueryClassesResponse> getClassesMethod;
    if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
          QueryGrpc.getClassesMethod = getClassesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryClassesRequest, com.regen.ecocredit.v1alpha2.QueryClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Classes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Classes"))
              .build();
        }
      }
    }
    return getClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> getClassInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryClassInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryClassInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> getClassInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryClassInfoRequest, com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> getClassInfoMethod;
    if ((getClassInfoMethod = QueryGrpc.getClassInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassInfoMethod = QueryGrpc.getClassInfoMethod) == null) {
          QueryGrpc.getClassInfoMethod = getClassInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryClassInfoRequest, com.regen.ecocredit.v1alpha2.QueryClassInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryClassInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryClassInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassInfo"))
              .build();
        }
      }
    }
    return getClassInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectsRequest,
      com.regen.ecocredit.v1alpha2.QueryProjectsResponse> getProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Projects",
      requestType = com.regen.ecocredit.v1alpha2.QueryProjectsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectsRequest,
      com.regen.ecocredit.v1alpha2.QueryProjectsResponse> getProjectsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectsRequest, com.regen.ecocredit.v1alpha2.QueryProjectsResponse> getProjectsMethod;
    if ((getProjectsMethod = QueryGrpc.getProjectsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProjectsMethod = QueryGrpc.getProjectsMethod) == null) {
          QueryGrpc.getProjectsMethod = getProjectsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProjectsRequest, com.regen.ecocredit.v1alpha2.QueryProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Projects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Projects"))
              .build();
        }
      }
    }
    return getProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> getProjectInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProjectInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> getProjectInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest, com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> getProjectInfoMethod;
    if ((getProjectInfoMethod = QueryGrpc.getProjectInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProjectInfoMethod = QueryGrpc.getProjectInfoMethod) == null) {
          QueryGrpc.getProjectInfoMethod = getProjectInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest, com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProjectInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProjectInfo"))
              .build();
        }
      }
    }
    return getProjectInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchesRequest,
      com.regen.ecocredit.v1alpha2.QueryBatchesResponse> getBatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Batches",
      requestType = com.regen.ecocredit.v1alpha2.QueryBatchesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchesRequest,
      com.regen.ecocredit.v1alpha2.QueryBatchesResponse> getBatchesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchesRequest, com.regen.ecocredit.v1alpha2.QueryBatchesResponse> getBatchesMethod;
    if ((getBatchesMethod = QueryGrpc.getBatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchesMethod = QueryGrpc.getBatchesMethod) == null) {
          QueryGrpc.getBatchesMethod = getBatchesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBatchesRequest, com.regen.ecocredit.v1alpha2.QueryBatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Batches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Batches"))
              .build();
        }
      }
    }
    return getBatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> getBatchInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> getBatchInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest, com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> getBatchInfoMethod;
    if ((getBatchInfoMethod = QueryGrpc.getBatchInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchInfoMethod = QueryGrpc.getBatchInfoMethod) == null) {
          QueryGrpc.getBatchInfoMethod = getBatchInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest, com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchInfo"))
              .build();
        }
      }
    }
    return getBatchInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBalanceRequest,
      com.regen.ecocredit.v1alpha2.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.regen.ecocredit.v1alpha2.QueryBalanceRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBalanceRequest,
      com.regen.ecocredit.v1alpha2.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBalanceRequest, com.regen.ecocredit.v1alpha2.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBalanceRequest, com.regen.ecocredit.v1alpha2.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySupplyRequest,
      com.regen.ecocredit.v1alpha2.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.regen.ecocredit.v1alpha2.QuerySupplyRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySupplyRequest,
      com.regen.ecocredit.v1alpha2.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySupplyRequest, com.regen.ecocredit.v1alpha2.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QuerySupplyRequest, com.regen.ecocredit.v1alpha2.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest,
      com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> getCreditTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreditTypes",
      requestType = com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest,
      com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> getCreditTypesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest, com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> getCreditTypesMethod;
    if ((getCreditTypesMethod = QueryGrpc.getCreditTypesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCreditTypesMethod = QueryGrpc.getCreditTypesMethod) == null) {
          QueryGrpc.getCreditTypesMethod = getCreditTypesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest, com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreditTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CreditTypes"))
              .build();
        }
      }
    }
    return getCreditTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryParamsRequest,
      com.regen.ecocredit.v1alpha2.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.regen.ecocredit.v1alpha2.QueryParamsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryParamsRequest,
      com.regen.ecocredit.v1alpha2.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryParamsRequest, com.regen.ecocredit.v1alpha2.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryParamsRequest, com.regen.ecocredit.v1alpha2.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrderRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> getSellOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrder",
      requestType = com.regen.ecocredit.v1alpha2.QuerySellOrderRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QuerySellOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrderRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> getSellOrderMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrderRequest, com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> getSellOrderMethod;
    if ((getSellOrderMethod = QueryGrpc.getSellOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrderMethod = QueryGrpc.getSellOrderMethod) == null) {
          QueryGrpc.getSellOrderMethod = getSellOrderMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QuerySellOrderRequest, com.regen.ecocredit.v1alpha2.QuerySellOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrder"))
              .build();
        }
      }
    }
    return getSellOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> getSellOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrders",
      requestType = com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> getSellOrdersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> getSellOrdersMethod;
    if ((getSellOrdersMethod = QueryGrpc.getSellOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersMethod = QueryGrpc.getSellOrdersMethod) == null) {
          QueryGrpc.getSellOrdersMethod = getSellOrdersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrders"))
              .build();
        }
      }
    }
    return getSellOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrdersByBatchDenom",
      requestType = com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod;
    if ((getSellOrdersByBatchDenomMethod = QueryGrpc.getSellOrdersByBatchDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersByBatchDenomMethod = QueryGrpc.getSellOrdersByBatchDenomMethod) == null) {
          QueryGrpc.getSellOrdersByBatchDenomMethod = getSellOrdersByBatchDenomMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrdersByBatchDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrdersByBatchDenom"))
              .build();
        }
      }
    }
    return getSellOrdersByBatchDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrdersByAddress",
      requestType = com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod;
    if ((getSellOrdersByAddressMethod = QueryGrpc.getSellOrdersByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersByAddressMethod = QueryGrpc.getSellOrdersByAddressMethod) == null) {
          QueryGrpc.getSellOrdersByAddressMethod = getSellOrdersByAddressMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrdersByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrdersByAddress"))
              .build();
        }
      }
    }
    return getSellOrdersByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> getBuyOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrder",
      requestType = com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> getBuyOrderMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> getBuyOrderMethod;
    if ((getBuyOrderMethod = QueryGrpc.getBuyOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrderMethod = QueryGrpc.getBuyOrderMethod) == null) {
          QueryGrpc.getBuyOrderMethod = getBuyOrderMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrder"))
              .build();
        }
      }
    }
    return getBuyOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> getBuyOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrders",
      requestType = com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> getBuyOrdersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> getBuyOrdersMethod;
    if ((getBuyOrdersMethod = QueryGrpc.getBuyOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrdersMethod = QueryGrpc.getBuyOrdersMethod) == null) {
          QueryGrpc.getBuyOrdersMethod = getBuyOrdersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrders"))
              .build();
        }
      }
    }
    return getBuyOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrdersByAddress",
      requestType = com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod;
    if ((getBuyOrdersByAddressMethod = QueryGrpc.getBuyOrdersByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrdersByAddressMethod = QueryGrpc.getBuyOrdersByAddressMethod) == null) {
          QueryGrpc.getBuyOrdersByAddressMethod = getBuyOrdersByAddressMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrdersByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrdersByAddress"))
              .build();
        }
      }
    }
    return getBuyOrdersByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest,
      com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllowedAskDenoms",
      requestType = com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest,
      com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest, com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod;
    if ((getAllowedAskDenomsMethod = QueryGrpc.getAllowedAskDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllowedAskDenomsMethod = QueryGrpc.getAllowedAskDenomsMethod) == null) {
          QueryGrpc.getAllowedAskDenomsMethod = getAllowedAskDenomsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest, com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllowedAskDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllowedAskDenoms"))
              .build();
        }
      }
    }
    return getAllowedAskDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketResponse> getBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Basket",
      requestType = com.regen.ecocredit.v1alpha2.QueryBasketRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketResponse> getBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketRequest, com.regen.ecocredit.v1alpha2.QueryBasketResponse> getBasketMethod;
    if ((getBasketMethod = QueryGrpc.getBasketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketMethod = QueryGrpc.getBasketMethod) == null) {
          QueryGrpc.getBasketMethod = getBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBasketRequest, com.regen.ecocredit.v1alpha2.QueryBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Basket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Basket"))
              .build();
        }
      }
    }
    return getBasketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketsRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketsResponse> getBasketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Baskets",
      requestType = com.regen.ecocredit.v1alpha2.QueryBasketsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBasketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketsRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketsResponse> getBasketsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketsRequest, com.regen.ecocredit.v1alpha2.QueryBasketsResponse> getBasketsMethod;
    if ((getBasketsMethod = QueryGrpc.getBasketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketsMethod = QueryGrpc.getBasketsMethod) == null) {
          QueryGrpc.getBasketsMethod = getBasketsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBasketsRequest, com.regen.ecocredit.v1alpha2.QueryBasketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Baskets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Baskets"))
              .build();
        }
      }
    }
    return getBasketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> getBasketCreditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BasketCredits",
      requestType = com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest,
      com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> getBasketCreditsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest, com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> getBasketCreditsMethod;
    if ((getBasketCreditsMethod = QueryGrpc.getBasketCreditsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketCreditsMethod = QueryGrpc.getBasketCreditsMethod) == null) {
          QueryGrpc.getBasketCreditsMethod = getBasketCreditsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest, com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BasketCredits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BasketCredits"))
              .build();
        }
      }
    }
    return getBasketCreditsMethod;
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
   * Msg is the regen.ecocredit.v1alpha2 Query service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Classes queries for all credit classes with pagination.
     * </pre>
     */
    default void classes(com.regen.ecocredit.v1alpha2.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    default void classInfo(com.regen.ecocredit.v1alpha2.QueryClassInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    default void projects(com.regen.ecocredit.v1alpha2.QueryProjectsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    default void projectInfo(com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    default void batches(com.regen.ecocredit.v1alpha2.QueryBatchesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    default void batchInfo(com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    default void balance(com.regen.ecocredit.v1alpha2.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    default void supply(com.regen.ecocredit.v1alpha2.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    default void creditTypes(com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreditTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    default void params(com.regen.ecocredit.v1alpha2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    default void sellOrder(com.regen.ecocredit.v1alpha2.QuerySellOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    default void sellOrders(com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    default void sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersByBatchDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    default void sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    default void buyOrder(com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    default void buyOrders(com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    default void buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrdersByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    default void allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllowedAskDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    default void basket(com.regen.ecocredit.v1alpha2.QueryBasketRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    default void baskets(com.regen.ecocredit.v1alpha2.QueryBasketsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    default void basketCredits(com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasketCreditsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha2 Query service.
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
   * Msg is the regen.ecocredit.v1alpha2 Query service.
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
     * Classes queries for all credit classes with pagination.
     * </pre>
     */
    public void classes(com.regen.ecocredit.v1alpha2.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public void classInfo(com.regen.ecocredit.v1alpha2.QueryClassInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public void projects(com.regen.ecocredit.v1alpha2.QueryProjectsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public void projectInfo(com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public void batches(com.regen.ecocredit.v1alpha2.QueryBatchesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public void batchInfo(com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public void balance(com.regen.ecocredit.v1alpha2.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public void supply(com.regen.ecocredit.v1alpha2.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public void creditTypes(com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreditTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public void params(com.regen.ecocredit.v1alpha2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public void sellOrder(com.regen.ecocredit.v1alpha2.QuerySellOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public void sellOrders(com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public void sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersByBatchDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public void sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public void buyOrder(com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public void buyOrders(com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public void buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrdersByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public void allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllowedAskDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public void basket(com.regen.ecocredit.v1alpha2.QueryBasketRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public void baskets(com.regen.ecocredit.v1alpha2.QueryBasketsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public void basketCredits(com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasketCreditsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha2 Query service.
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
     * Classes queries for all credit classes with pagination.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryClassesResponse classes(com.regen.ecocredit.v1alpha2.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryClassInfoResponse classInfo(com.regen.ecocredit.v1alpha2.QueryClassInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProjectsResponse projects(com.regen.ecocredit.v1alpha2.QueryProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse projectInfo(com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBatchesResponse batches(com.regen.ecocredit.v1alpha2.QueryBatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse batchInfo(com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBalanceResponse balance(com.regen.ecocredit.v1alpha2.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QuerySupplyResponse supply(com.regen.ecocredit.v1alpha2.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse creditTypes(com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreditTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryParamsResponse params(com.regen.ecocredit.v1alpha2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QuerySellOrderResponse sellOrder(com.regen.ecocredit.v1alpha2.QuerySellOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse sellOrders(com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersByBatchDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse buyOrder(com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse buyOrders(com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrdersByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllowedAskDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBasketResponse basket(com.regen.ecocredit.v1alpha2.QueryBasketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBasketsResponse baskets(com.regen.ecocredit.v1alpha2.QueryBasketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse basketCredits(com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasketCreditsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Msg is the regen.ecocredit.v1alpha2 Query service.
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
     * Classes queries for all credit classes with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryClassesResponse> classes(
        com.regen.ecocredit.v1alpha2.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryClassInfoResponse> classInfo(
        com.regen.ecocredit.v1alpha2.QueryClassInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProjectsResponse> projects(
        com.regen.ecocredit.v1alpha2.QueryProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse> projectInfo(
        com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBatchesResponse> batches(
        com.regen.ecocredit.v1alpha2.QueryBatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse> batchInfo(
        com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBalanceResponse> balance(
        com.regen.ecocredit.v1alpha2.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QuerySupplyResponse> supply(
        com.regen.ecocredit.v1alpha2.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse> creditTypes(
        com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreditTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryParamsResponse> params(
        com.regen.ecocredit.v1alpha2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QuerySellOrderResponse> sellOrder(
        com.regen.ecocredit.v1alpha2.QuerySellOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse> sellOrders(
        com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse> sellOrdersByBatchDenom(
        com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersByBatchDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse> sellOrdersByAddress(
        com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse> buyOrder(
        com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse> buyOrders(
        com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse> buyOrdersByAddress(
        com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrdersByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse> allowedAskDenoms(
        com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllowedAskDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBasketResponse> basket(
        com.regen.ecocredit.v1alpha2.QueryBasketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBasketsResponse> baskets(
        com.regen.ecocredit.v1alpha2.QueryBasketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse> basketCredits(
        com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasketCreditsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLASSES = 0;
  private static final int METHODID_CLASS_INFO = 1;
  private static final int METHODID_PROJECTS = 2;
  private static final int METHODID_PROJECT_INFO = 3;
  private static final int METHODID_BATCHES = 4;
  private static final int METHODID_BATCH_INFO = 5;
  private static final int METHODID_BALANCE = 6;
  private static final int METHODID_SUPPLY = 7;
  private static final int METHODID_CREDIT_TYPES = 8;
  private static final int METHODID_PARAMS = 9;
  private static final int METHODID_SELL_ORDER = 10;
  private static final int METHODID_SELL_ORDERS = 11;
  private static final int METHODID_SELL_ORDERS_BY_BATCH_DENOM = 12;
  private static final int METHODID_SELL_ORDERS_BY_ADDRESS = 13;
  private static final int METHODID_BUY_ORDER = 14;
  private static final int METHODID_BUY_ORDERS = 15;
  private static final int METHODID_BUY_ORDERS_BY_ADDRESS = 16;
  private static final int METHODID_ALLOWED_ASK_DENOMS = 17;
  private static final int METHODID_BASKET = 18;
  private static final int METHODID_BASKETS = 19;
  private static final int METHODID_BASKET_CREDITS = 20;

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
        case METHODID_CLASSES:
          serviceImpl.classes((com.regen.ecocredit.v1alpha2.QueryClassesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassesResponse>) responseObserver);
          break;
        case METHODID_CLASS_INFO:
          serviceImpl.classInfo((com.regen.ecocredit.v1alpha2.QueryClassInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryClassInfoResponse>) responseObserver);
          break;
        case METHODID_PROJECTS:
          serviceImpl.projects((com.regen.ecocredit.v1alpha2.QueryProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectsResponse>) responseObserver);
          break;
        case METHODID_PROJECT_INFO:
          serviceImpl.projectInfo((com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse>) responseObserver);
          break;
        case METHODID_BATCHES:
          serviceImpl.batches((com.regen.ecocredit.v1alpha2.QueryBatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchesResponse>) responseObserver);
          break;
        case METHODID_BATCH_INFO:
          serviceImpl.batchInfo((com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((com.regen.ecocredit.v1alpha2.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_SUPPLY:
          serviceImpl.supply((com.regen.ecocredit.v1alpha2.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_CREDIT_TYPES:
          serviceImpl.creditTypes((com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.regen.ecocredit.v1alpha2.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDER:
          serviceImpl.sellOrder((com.regen.ecocredit.v1alpha2.QuerySellOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrderResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS:
          serviceImpl.sellOrders((com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS_BY_BATCH_DENOM:
          serviceImpl.sellOrdersByBatchDenom((com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS_BY_ADDRESS:
          serviceImpl.sellOrdersByAddress((com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDER:
          serviceImpl.buyOrder((com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDERS:
          serviceImpl.buyOrders((com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDERS_BY_ADDRESS:
          serviceImpl.buyOrdersByAddress((com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse>) responseObserver);
          break;
        case METHODID_ALLOWED_ASK_DENOMS:
          serviceImpl.allowedAskDenoms((com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse>) responseObserver);
          break;
        case METHODID_BASKET:
          serviceImpl.basket((com.regen.ecocredit.v1alpha2.QueryBasketRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketResponse>) responseObserver);
          break;
        case METHODID_BASKETS:
          serviceImpl.baskets((com.regen.ecocredit.v1alpha2.QueryBasketsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketsResponse>) responseObserver);
          break;
        case METHODID_BASKET_CREDITS:
          serviceImpl.basketCredits((com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse>) responseObserver);
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
          getClassesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryClassesRequest,
              com.regen.ecocredit.v1alpha2.QueryClassesResponse>(
                service, METHODID_CLASSES)))
        .addMethod(
          getClassInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryClassInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryClassInfoResponse>(
                service, METHODID_CLASS_INFO)))
        .addMethod(
          getProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProjectsRequest,
              com.regen.ecocredit.v1alpha2.QueryProjectsResponse>(
                service, METHODID_PROJECTS)))
        .addMethod(
          getProjectInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProjectInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryProjectInfoResponse>(
                service, METHODID_PROJECT_INFO)))
        .addMethod(
          getBatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBatchesRequest,
              com.regen.ecocredit.v1alpha2.QueryBatchesResponse>(
                service, METHODID_BATCHES)))
        .addMethod(
          getBatchInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBatchInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryBatchInfoResponse>(
                service, METHODID_BATCH_INFO)))
        .addMethod(
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBalanceRequest,
              com.regen.ecocredit.v1alpha2.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QuerySupplyRequest,
              com.regen.ecocredit.v1alpha2.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getCreditTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryCreditTypesRequest,
              com.regen.ecocredit.v1alpha2.QueryCreditTypesResponse>(
                service, METHODID_CREDIT_TYPES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryParamsRequest,
              com.regen.ecocredit.v1alpha2.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getSellOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QuerySellOrderRequest,
              com.regen.ecocredit.v1alpha2.QuerySellOrderResponse>(
                service, METHODID_SELL_ORDER)))
        .addMethod(
          getSellOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QuerySellOrdersRequest,
              com.regen.ecocredit.v1alpha2.QuerySellOrdersResponse>(
                service, METHODID_SELL_ORDERS)))
        .addMethod(
          getSellOrdersByBatchDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomRequest,
              com.regen.ecocredit.v1alpha2.QuerySellOrdersByBatchDenomResponse>(
                service, METHODID_SELL_ORDERS_BY_BATCH_DENOM)))
        .addMethod(
          getSellOrdersByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressRequest,
              com.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse>(
                service, METHODID_SELL_ORDERS_BY_ADDRESS)))
        .addMethod(
          getBuyOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBuyOrderRequest,
              com.regen.ecocredit.v1alpha2.QueryBuyOrderResponse>(
                service, METHODID_BUY_ORDER)))
        .addMethod(
          getBuyOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBuyOrdersRequest,
              com.regen.ecocredit.v1alpha2.QueryBuyOrdersResponse>(
                service, METHODID_BUY_ORDERS)))
        .addMethod(
          getBuyOrdersByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressRequest,
              com.regen.ecocredit.v1alpha2.QueryBuyOrdersByAddressResponse>(
                service, METHODID_BUY_ORDERS_BY_ADDRESS)))
        .addMethod(
          getAllowedAskDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsRequest,
              com.regen.ecocredit.v1alpha2.QueryAllowedAskDenomsResponse>(
                service, METHODID_ALLOWED_ASK_DENOMS)))
        .addMethod(
          getBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBasketRequest,
              com.regen.ecocredit.v1alpha2.QueryBasketResponse>(
                service, METHODID_BASKET)))
        .addMethod(
          getBasketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBasketsRequest,
              com.regen.ecocredit.v1alpha2.QueryBasketsResponse>(
                service, METHODID_BASKETS)))
        .addMethod(
          getBasketCreditsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryBasketCreditsRequest,
              com.regen.ecocredit.v1alpha2.QueryBasketCreditsResponse>(
                service, METHODID_BASKET_CREDITS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.ecocredit.v1alpha2.QueryProto.getDescriptor();
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
              .addMethod(getClassesMethod())
              .addMethod(getClassInfoMethod())
              .addMethod(getProjectsMethod())
              .addMethod(getProjectInfoMethod())
              .addMethod(getBatchesMethod())
              .addMethod(getBatchInfoMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getSupplyMethod())
              .addMethod(getCreditTypesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getSellOrderMethod())
              .addMethod(getSellOrdersMethod())
              .addMethod(getSellOrdersByBatchDenomMethod())
              .addMethod(getSellOrdersByAddressMethod())
              .addMethod(getBuyOrderMethod())
              .addMethod(getBuyOrdersMethod())
              .addMethod(getBuyOrdersByAddressMethod())
              .addMethod(getAllowedAskDenomsMethod())
              .addMethod(getBasketMethod())
              .addMethod(getBasketsMethod())
              .addMethod(getBasketCreditsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
