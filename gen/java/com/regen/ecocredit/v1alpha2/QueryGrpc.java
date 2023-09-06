package com.regen.ecocredit.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the regen.ecocredit.v1alpha2 Query service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: regen/ecocredit/v1alpha2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "regen.ecocredit.v1alpha2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> getClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Classes",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> getClassesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> getClassesMethod;
    if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
          QueryGrpc.getClassesMethod = getClassesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Classes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Classes"))
              .build();
        }
      }
    }
    return getClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> getClassInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> getClassInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> getClassInfoMethod;
    if ((getClassInfoMethod = QueryGrpc.getClassInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassInfoMethod = QueryGrpc.getClassInfoMethod) == null) {
          QueryGrpc.getClassInfoMethod = getClassInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassInfo"))
              .build();
        }
      }
    }
    return getClassInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> getProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Projects",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> getProjectsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> getProjectsMethod;
    if ((getProjectsMethod = QueryGrpc.getProjectsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProjectsMethod = QueryGrpc.getProjectsMethod) == null) {
          QueryGrpc.getProjectsMethod = getProjectsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Projects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Projects"))
              .build();
        }
      }
    }
    return getProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> getProjectInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProjectInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> getProjectInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> getProjectInfoMethod;
    if ((getProjectInfoMethod = QueryGrpc.getProjectInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProjectInfoMethod = QueryGrpc.getProjectInfoMethod) == null) {
          QueryGrpc.getProjectInfoMethod = getProjectInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProjectInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProjectInfo"))
              .build();
        }
      }
    }
    return getProjectInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> getBatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Batches",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> getBatchesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> getBatchesMethod;
    if ((getBatchesMethod = QueryGrpc.getBatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchesMethod = QueryGrpc.getBatchesMethod) == null) {
          QueryGrpc.getBatchesMethod = getBatchesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Batches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Batches"))
              .build();
        }
      }
    }
    return getBatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> getBatchInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchInfo",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> getBatchInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> getBatchInfoMethod;
    if ((getBatchInfoMethod = QueryGrpc.getBatchInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchInfoMethod = QueryGrpc.getBatchInfoMethod) == null) {
          QueryGrpc.getBatchInfoMethod = getBatchInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchInfo"))
              .build();
        }
      }
    }
    return getBatchInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBalanceMethod = QueryGrpc.getBalanceMethod) == null) {
          QueryGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> getCreditTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreditTypes",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> getCreditTypesMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> getCreditTypesMethod;
    if ((getCreditTypesMethod = QueryGrpc.getCreditTypesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCreditTypesMethod = QueryGrpc.getCreditTypesMethod) == null) {
          QueryGrpc.getCreditTypesMethod = getCreditTypesMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreditTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CreditTypes"))
              .build();
        }
      }
    }
    return getCreditTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> getSellOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrder",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> getSellOrderMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> getSellOrderMethod;
    if ((getSellOrderMethod = QueryGrpc.getSellOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrderMethod = QueryGrpc.getSellOrderMethod) == null) {
          QueryGrpc.getSellOrderMethod = getSellOrderMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrder"))
              .build();
        }
      }
    }
    return getSellOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> getSellOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrders",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> getSellOrdersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> getSellOrdersMethod;
    if ((getSellOrdersMethod = QueryGrpc.getSellOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersMethod = QueryGrpc.getSellOrdersMethod) == null) {
          QueryGrpc.getSellOrdersMethod = getSellOrdersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrders"))
              .build();
        }
      }
    }
    return getSellOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrdersByBatchDenom",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> getSellOrdersByBatchDenomMethod;
    if ((getSellOrdersByBatchDenomMethod = QueryGrpc.getSellOrdersByBatchDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersByBatchDenomMethod = QueryGrpc.getSellOrdersByBatchDenomMethod) == null) {
          QueryGrpc.getSellOrdersByBatchDenomMethod = getSellOrdersByBatchDenomMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrdersByBatchDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrdersByBatchDenom"))
              .build();
        }
      }
    }
    return getSellOrdersByBatchDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellOrdersByAddress",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> getSellOrdersByAddressMethod;
    if ((getSellOrdersByAddressMethod = QueryGrpc.getSellOrdersByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSellOrdersByAddressMethod = QueryGrpc.getSellOrdersByAddressMethod) == null) {
          QueryGrpc.getSellOrdersByAddressMethod = getSellOrdersByAddressMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellOrdersByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SellOrdersByAddress"))
              .build();
        }
      }
    }
    return getSellOrdersByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> getBuyOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrder",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> getBuyOrderMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> getBuyOrderMethod;
    if ((getBuyOrderMethod = QueryGrpc.getBuyOrderMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrderMethod = QueryGrpc.getBuyOrderMethod) == null) {
          QueryGrpc.getBuyOrderMethod = getBuyOrderMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrder"))
              .build();
        }
      }
    }
    return getBuyOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> getBuyOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrders",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> getBuyOrdersMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> getBuyOrdersMethod;
    if ((getBuyOrdersMethod = QueryGrpc.getBuyOrdersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrdersMethod = QueryGrpc.getBuyOrdersMethod) == null) {
          QueryGrpc.getBuyOrdersMethod = getBuyOrdersMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrders"))
              .build();
        }
      }
    }
    return getBuyOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyOrdersByAddress",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> getBuyOrdersByAddressMethod;
    if ((getBuyOrdersByAddressMethod = QueryGrpc.getBuyOrdersByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBuyOrdersByAddressMethod = QueryGrpc.getBuyOrdersByAddressMethod) == null) {
          QueryGrpc.getBuyOrdersByAddressMethod = getBuyOrdersByAddressMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyOrdersByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BuyOrdersByAddress"))
              .build();
        }
      }
    }
    return getBuyOrdersByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllowedAskDenoms",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> getAllowedAskDenomsMethod;
    if ((getAllowedAskDenomsMethod = QueryGrpc.getAllowedAskDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllowedAskDenomsMethod = QueryGrpc.getAllowedAskDenomsMethod) == null) {
          QueryGrpc.getAllowedAskDenomsMethod = getAllowedAskDenomsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllowedAskDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllowedAskDenoms"))
              .build();
        }
      }
    }
    return getAllowedAskDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> getBasketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Basket",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> getBasketMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> getBasketMethod;
    if ((getBasketMethod = QueryGrpc.getBasketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketMethod = QueryGrpc.getBasketMethod) == null) {
          QueryGrpc.getBasketMethod = getBasketMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Basket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Basket"))
              .build();
        }
      }
    }
    return getBasketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> getBasketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Baskets",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> getBasketsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> getBasketsMethod;
    if ((getBasketsMethod = QueryGrpc.getBasketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketsMethod = QueryGrpc.getBasketsMethod) == null) {
          QueryGrpc.getBasketsMethod = getBasketsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Baskets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Baskets"))
              .build();
        }
      }
    }
    return getBasketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> getBasketCreditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BasketCredits",
      requestType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest.class,
      responseType = com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest,
      com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> getBasketCreditsMethod() {
    io.grpc.MethodDescriptor<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> getBasketCreditsMethod;
    if ((getBasketCreditsMethod = QueryGrpc.getBasketCreditsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBasketCreditsMethod = QueryGrpc.getBasketCreditsMethod) == null) {
          QueryGrpc.getBasketCreditsMethod = getBasketCreditsMethod =
              io.grpc.MethodDescriptor.<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest, com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BasketCredits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse.getDefaultInstance()))
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
    default void classes(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    default void classInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    default void projects(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    default void projectInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProjectInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    default void batches(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    default void batchInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    default void balance(com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    default void supply(com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    default void creditTypes(com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreditTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    default void params(com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    default void sellOrder(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    default void sellOrders(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    default void sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersByBatchDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    default void sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellOrdersByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    default void buyOrder(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    default void buyOrders(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    default void buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyOrdersByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    default void allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllowedAskDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    default void basket(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    default void baskets(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBasketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    default void basketCredits(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> responseObserver) {
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
    public void classes(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public void classInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public void projects(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public void projectInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProjectInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public void batches(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public void batchInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public void balance(com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public void supply(com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public void creditTypes(com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreditTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public void params(com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public void sellOrder(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public void sellOrders(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public void sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersByBatchDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public void sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellOrdersByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public void buyOrder(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public void buyOrders(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public void buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyOrdersByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public void allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllowedAskDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public void basket(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public void baskets(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBasketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public void basketCredits(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest request,
        io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> responseObserver) {
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
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse classes(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse classInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse projects(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse projectInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProjectInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse batches(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse batchInfo(com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse balance(com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse supply(com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse creditTypes(com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreditTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse params(com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse sellOrder(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse sellOrders(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse sellOrdersByBatchDenom(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersByBatchDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse sellOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellOrdersByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse buyOrder(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse buyOrders(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse buyOrdersByAddress(com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyOrdersByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse allowedAskDenoms(com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllowedAskDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse basket(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse baskets(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBasketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse basketCredits(com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse> classes(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a credit class.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse> classInfo(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Projects queries for all projects within a class with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse> projects(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClassInfo queries for information on a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse> projectInfo(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProjectInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batches queries for all batches in the given project with pagination.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse> batches(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BatchInfo queries for information on a credit batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse> batchInfo(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Balance queries the balance (both tradable and retired) of a given credit
     * batch for a given account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse> balance(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supply queries the tradable and retired supply of a credit batch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse> supply(
        com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreditTypes returns the list of allowed types that credit classes can have.
     * See Types/CreditType for more details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse> creditTypes(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreditTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the ecocredit module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse> params(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrder queries a sell order by its ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse> sellOrder(
        com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrders queries a paginated list of all sell orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse> sellOrders(
        com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrdersByDenom queries a paginated list of all sell orders of a specific ecocredit denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse> sellOrdersByBatchDenom(
        com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersByBatchDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellOrdersByAddress queries a paginated list of all sell orders from a specific address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse> sellOrdersByAddress(
        com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellOrdersByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrder queries a buy order by its id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse> buyOrder(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrders queries a paginated list of all buy orders
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse> buyOrders(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrdersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BuyOrdersByAddress queries a paginated list of buy orders by creator address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse> buyOrdersByAddress(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyOrdersByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllowedAskDenoms queries all denoms allowed to be set in the AskPrice of a sell order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse> allowedAskDenoms(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllowedAskDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Basket queries one basket by denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse> basket(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Baskets lists all baskets in the ecocredit module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse> baskets(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBasketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BasketCredits lists all ecocredits inside a given basket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse> basketCredits(
        com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest request) {
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
          serviceImpl.classes((com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse>) responseObserver);
          break;
        case METHODID_CLASS_INFO:
          serviceImpl.classInfo((com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse>) responseObserver);
          break;
        case METHODID_PROJECTS:
          serviceImpl.projects((com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse>) responseObserver);
          break;
        case METHODID_PROJECT_INFO:
          serviceImpl.projectInfo((com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse>) responseObserver);
          break;
        case METHODID_BATCHES:
          serviceImpl.batches((com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse>) responseObserver);
          break;
        case METHODID_BATCH_INFO:
          serviceImpl.batchInfo((com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse>) responseObserver);
          break;
        case METHODID_SUPPLY:
          serviceImpl.supply((com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_CREDIT_TYPES:
          serviceImpl.creditTypes((com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDER:
          serviceImpl.sellOrder((com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS:
          serviceImpl.sellOrders((com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS_BY_BATCH_DENOM:
          serviceImpl.sellOrdersByBatchDenom((com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse>) responseObserver);
          break;
        case METHODID_SELL_ORDERS_BY_ADDRESS:
          serviceImpl.sellOrdersByAddress((com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDER:
          serviceImpl.buyOrder((com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDERS:
          serviceImpl.buyOrders((com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse>) responseObserver);
          break;
        case METHODID_BUY_ORDERS_BY_ADDRESS:
          serviceImpl.buyOrdersByAddress((com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse>) responseObserver);
          break;
        case METHODID_ALLOWED_ASK_DENOMS:
          serviceImpl.allowedAskDenoms((com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse>) responseObserver);
          break;
        case METHODID_BASKET:
          serviceImpl.basket((com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse>) responseObserver);
          break;
        case METHODID_BASKETS:
          serviceImpl.baskets((com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse>) responseObserver);
          break;
        case METHODID_BASKET_CREDITS:
          serviceImpl.basketCredits((com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse>) responseObserver);
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
              com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryClassesResponse>(
                service, METHODID_CLASSES)))
        .addMethod(
          getClassInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryClassInfoResponse>(
                service, METHODID_CLASS_INFO)))
        .addMethod(
          getProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectsResponse>(
                service, METHODID_PROJECTS)))
        .addMethod(
          getProjectInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryProjectInfoResponse>(
                service, METHODID_PROJECT_INFO)))
        .addMethod(
          getBatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchesResponse>(
                service, METHODID_BATCHES)))
        .addMethod(
          getBatchInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBatchInfoResponse>(
                service, METHODID_BATCH_INFO)))
        .addMethod(
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getCreditTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryCreditTypesResponse>(
                service, METHODID_CREDIT_TYPES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getSellOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrderResponse>(
                service, METHODID_SELL_ORDER)))
        .addMethod(
          getSellOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersResponse>(
                service, METHODID_SELL_ORDERS)))
        .addMethod(
          getSellOrdersByBatchDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByBatchDenomResponse>(
                service, METHODID_SELL_ORDERS_BY_BATCH_DENOM)))
        .addMethod(
          getSellOrdersByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QuerySellOrdersByAddressResponse>(
                service, METHODID_SELL_ORDERS_BY_ADDRESS)))
        .addMethod(
          getBuyOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrderResponse>(
                service, METHODID_BUY_ORDER)))
        .addMethod(
          getBuyOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersResponse>(
                service, METHODID_BUY_ORDERS)))
        .addMethod(
          getBuyOrdersByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBuyOrdersByAddressResponse>(
                service, METHODID_BUY_ORDERS_BY_ADDRESS)))
        .addMethod(
          getAllowedAskDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryAllowedAskDenomsResponse>(
                service, METHODID_ALLOWED_ASK_DENOMS)))
        .addMethod(
          getBasketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketResponse>(
                service, METHODID_BASKET)))
        .addMethod(
          getBasketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketsResponse>(
                service, METHODID_BASKETS)))
        .addMethod(
          getBasketCreditsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsRequest,
              com.regen.ecocredit.v1alpha2.QueryProto.QueryBasketCreditsResponse>(
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
