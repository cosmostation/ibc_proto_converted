package com.gravity.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: gravity/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "gravity.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryParamsRequest,
      com.gravity.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.gravity.v1.QueryParamsRequest.class,
      responseType = com.gravity.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryParamsRequest,
      com.gravity.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryParamsRequest, com.gravity.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryParamsRequest, com.gravity.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryCurrentValsetRequest,
      com.gravity.v1.QueryCurrentValsetResponse> getCurrentValsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentValset",
      requestType = com.gravity.v1.QueryCurrentValsetRequest.class,
      responseType = com.gravity.v1.QueryCurrentValsetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryCurrentValsetRequest,
      com.gravity.v1.QueryCurrentValsetResponse> getCurrentValsetMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryCurrentValsetRequest, com.gravity.v1.QueryCurrentValsetResponse> getCurrentValsetMethod;
    if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
          QueryGrpc.getCurrentValsetMethod = getCurrentValsetMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryCurrentValsetRequest, com.gravity.v1.QueryCurrentValsetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentValset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryCurrentValsetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryCurrentValsetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentValset"))
              .build();
        }
      }
    }
    return getCurrentValsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetRequestRequest,
      com.gravity.v1.QueryValsetRequestResponse> getValsetRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetRequest",
      requestType = com.gravity.v1.QueryValsetRequestRequest.class,
      responseType = com.gravity.v1.QueryValsetRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetRequestRequest,
      com.gravity.v1.QueryValsetRequestResponse> getValsetRequestMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetRequestRequest, com.gravity.v1.QueryValsetRequestResponse> getValsetRequestMethod;
    if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
          QueryGrpc.getValsetRequestMethod = getValsetRequestMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryValsetRequestRequest, com.gravity.v1.QueryValsetRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetRequest"))
              .build();
        }
      }
    }
    return getValsetRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmRequest,
      com.gravity.v1.QueryValsetConfirmResponse> getValsetConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirm",
      requestType = com.gravity.v1.QueryValsetConfirmRequest.class,
      responseType = com.gravity.v1.QueryValsetConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmRequest,
      com.gravity.v1.QueryValsetConfirmResponse> getValsetConfirmMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmRequest, com.gravity.v1.QueryValsetConfirmResponse> getValsetConfirmMethod;
    if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
          QueryGrpc.getValsetConfirmMethod = getValsetConfirmMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryValsetConfirmRequest, com.gravity.v1.QueryValsetConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetConfirmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirm"))
              .build();
        }
      }
    }
    return getValsetConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmsByNonceRequest,
      com.gravity.v1.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirmsByNonce",
      requestType = com.gravity.v1.QueryValsetConfirmsByNonceRequest.class,
      responseType = com.gravity.v1.QueryValsetConfirmsByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmsByNonceRequest,
      com.gravity.v1.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryValsetConfirmsByNonceRequest, com.gravity.v1.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;
    if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
          QueryGrpc.getValsetConfirmsByNonceMethod = getValsetConfirmsByNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryValsetConfirmsByNonceRequest, com.gravity.v1.QueryValsetConfirmsByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirmsByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetConfirmsByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryValsetConfirmsByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirmsByNonce"))
              .build();
        }
      }
    }
    return getValsetConfirmsByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastValsetRequestsRequest,
      com.gravity.v1.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastValsetRequests",
      requestType = com.gravity.v1.QueryLastValsetRequestsRequest.class,
      responseType = com.gravity.v1.QueryLastValsetRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastValsetRequestsRequest,
      com.gravity.v1.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastValsetRequestsRequest, com.gravity.v1.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;
    if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
          QueryGrpc.getLastValsetRequestsMethod = getLastValsetRequestsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastValsetRequestsRequest, com.gravity.v1.QueryLastValsetRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastValsetRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastValsetRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastValsetRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastValsetRequests"))
              .build();
        }
      }
    }
    return getLastValsetRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest,
      com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingValsetRequestByAddr",
      requestType = com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest.class,
      responseType = com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest,
      com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest, com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;
    if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingValsetRequestByAddrMethod = getLastPendingValsetRequestByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest, com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingValsetRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingValsetRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingValsetRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest,
      com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingBatchRequestByAddr",
      requestType = com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest.class,
      responseType = com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest,
      com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest, com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;
    if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingBatchRequestByAddrMethod = getLastPendingBatchRequestByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest, com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingBatchRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingBatchRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingBatchRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingLogicCallByAddrRequest,
      com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingLogicCallByAddr",
      requestType = com.gravity.v1.QueryLastPendingLogicCallByAddrRequest.class,
      responseType = com.gravity.v1.QueryLastPendingLogicCallByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingLogicCallByAddrRequest,
      com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastPendingLogicCallByAddrRequest, com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod;
    if ((getLastPendingLogicCallByAddrMethod = QueryGrpc.getLastPendingLogicCallByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingLogicCallByAddrMethod = QueryGrpc.getLastPendingLogicCallByAddrMethod) == null) {
          QueryGrpc.getLastPendingLogicCallByAddrMethod = getLastPendingLogicCallByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastPendingLogicCallByAddrRequest, com.gravity.v1.QueryLastPendingLogicCallByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingLogicCallByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingLogicCallByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastPendingLogicCallByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingLogicCallByAddr"))
              .build();
        }
      }
    }
    return getLastPendingLogicCallByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastEventNonceByAddrRequest,
      com.gravity.v1.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEventNonceByAddr",
      requestType = com.gravity.v1.QueryLastEventNonceByAddrRequest.class,
      responseType = com.gravity.v1.QueryLastEventNonceByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastEventNonceByAddrRequest,
      com.gravity.v1.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastEventNonceByAddrRequest, com.gravity.v1.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod;
    if ((getLastEventNonceByAddrMethod = QueryGrpc.getLastEventNonceByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastEventNonceByAddrMethod = QueryGrpc.getLastEventNonceByAddrMethod) == null) {
          QueryGrpc.getLastEventNonceByAddrMethod = getLastEventNonceByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastEventNonceByAddrRequest, com.gravity.v1.QueryLastEventNonceByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEventNonceByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastEventNonceByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastEventNonceByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastEventNonceByAddr"))
              .build();
        }
      }
    }
    return getLastEventNonceByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchFeeRequest,
      com.gravity.v1.QueryBatchFeeResponse> getBatchFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchFees",
      requestType = com.gravity.v1.QueryBatchFeeRequest.class,
      responseType = com.gravity.v1.QueryBatchFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchFeeRequest,
      com.gravity.v1.QueryBatchFeeResponse> getBatchFeesMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchFeeRequest, com.gravity.v1.QueryBatchFeeResponse> getBatchFeesMethod;
    if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
          QueryGrpc.getBatchFeesMethod = getBatchFeesMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryBatchFeeRequest, com.gravity.v1.QueryBatchFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchFees"))
              .build();
        }
      }
    }
    return getBatchFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingTxBatchesRequest,
      com.gravity.v1.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutgoingTxBatches",
      requestType = com.gravity.v1.QueryOutgoingTxBatchesRequest.class,
      responseType = com.gravity.v1.QueryOutgoingTxBatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingTxBatchesRequest,
      com.gravity.v1.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingTxBatchesRequest, com.gravity.v1.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;
    if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
          QueryGrpc.getOutgoingTxBatchesMethod = getOutgoingTxBatchesMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryOutgoingTxBatchesRequest, com.gravity.v1.QueryOutgoingTxBatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutgoingTxBatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryOutgoingTxBatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryOutgoingTxBatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutgoingTxBatches"))
              .build();
        }
      }
    }
    return getOutgoingTxBatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingLogicCallsRequest,
      com.gravity.v1.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutgoingLogicCalls",
      requestType = com.gravity.v1.QueryOutgoingLogicCallsRequest.class,
      responseType = com.gravity.v1.QueryOutgoingLogicCallsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingLogicCallsRequest,
      com.gravity.v1.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryOutgoingLogicCallsRequest, com.gravity.v1.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod;
    if ((getOutgoingLogicCallsMethod = QueryGrpc.getOutgoingLogicCallsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutgoingLogicCallsMethod = QueryGrpc.getOutgoingLogicCallsMethod) == null) {
          QueryGrpc.getOutgoingLogicCallsMethod = getOutgoingLogicCallsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryOutgoingLogicCallsRequest, com.gravity.v1.QueryOutgoingLogicCallsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutgoingLogicCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryOutgoingLogicCallsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryOutgoingLogicCallsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutgoingLogicCalls"))
              .build();
        }
      }
    }
    return getOutgoingLogicCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchRequestByNonceRequest,
      com.gravity.v1.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchRequestByNonce",
      requestType = com.gravity.v1.QueryBatchRequestByNonceRequest.class,
      responseType = com.gravity.v1.QueryBatchRequestByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchRequestByNonceRequest,
      com.gravity.v1.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchRequestByNonceRequest, com.gravity.v1.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;
    if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
          QueryGrpc.getBatchRequestByNonceMethod = getBatchRequestByNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryBatchRequestByNonceRequest, com.gravity.v1.QueryBatchRequestByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchRequestByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchRequestByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchRequestByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchRequestByNonce"))
              .build();
        }
      }
    }
    return getBatchRequestByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchConfirmsRequest,
      com.gravity.v1.QueryBatchConfirmsResponse> getBatchConfirmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchConfirms",
      requestType = com.gravity.v1.QueryBatchConfirmsRequest.class,
      responseType = com.gravity.v1.QueryBatchConfirmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchConfirmsRequest,
      com.gravity.v1.QueryBatchConfirmsResponse> getBatchConfirmsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryBatchConfirmsRequest, com.gravity.v1.QueryBatchConfirmsResponse> getBatchConfirmsMethod;
    if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
          QueryGrpc.getBatchConfirmsMethod = getBatchConfirmsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryBatchConfirmsRequest, com.gravity.v1.QueryBatchConfirmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchConfirms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchConfirmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryBatchConfirmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchConfirms"))
              .build();
        }
      }
    }
    return getBatchConfirmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLogicConfirmsRequest,
      com.gravity.v1.QueryLogicConfirmsResponse> getLogicConfirmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogicConfirms",
      requestType = com.gravity.v1.QueryLogicConfirmsRequest.class,
      responseType = com.gravity.v1.QueryLogicConfirmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLogicConfirmsRequest,
      com.gravity.v1.QueryLogicConfirmsResponse> getLogicConfirmsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLogicConfirmsRequest, com.gravity.v1.QueryLogicConfirmsResponse> getLogicConfirmsMethod;
    if ((getLogicConfirmsMethod = QueryGrpc.getLogicConfirmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLogicConfirmsMethod = QueryGrpc.getLogicConfirmsMethod) == null) {
          QueryGrpc.getLogicConfirmsMethod = getLogicConfirmsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLogicConfirmsRequest, com.gravity.v1.QueryLogicConfirmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogicConfirms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLogicConfirmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLogicConfirmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LogicConfirms"))
              .build();
        }
      }
    }
    return getLogicConfirmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryERC20ToDenomRequest,
      com.gravity.v1.QueryERC20ToDenomResponse> getERC20ToDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ERC20ToDenom",
      requestType = com.gravity.v1.QueryERC20ToDenomRequest.class,
      responseType = com.gravity.v1.QueryERC20ToDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryERC20ToDenomRequest,
      com.gravity.v1.QueryERC20ToDenomResponse> getERC20ToDenomMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryERC20ToDenomRequest, com.gravity.v1.QueryERC20ToDenomResponse> getERC20ToDenomMethod;
    if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
          QueryGrpc.getERC20ToDenomMethod = getERC20ToDenomMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryERC20ToDenomRequest, com.gravity.v1.QueryERC20ToDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ERC20ToDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryERC20ToDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryERC20ToDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ERC20ToDenom"))
              .build();
        }
      }
    }
    return getERC20ToDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryDenomToERC20Request,
      com.gravity.v1.QueryDenomToERC20Response> getDenomToERC20Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomToERC20",
      requestType = com.gravity.v1.QueryDenomToERC20Request.class,
      responseType = com.gravity.v1.QueryDenomToERC20Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryDenomToERC20Request,
      com.gravity.v1.QueryDenomToERC20Response> getDenomToERC20Method() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryDenomToERC20Request, com.gravity.v1.QueryDenomToERC20Response> getDenomToERC20Method;
    if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
          QueryGrpc.getDenomToERC20Method = getDenomToERC20Method =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryDenomToERC20Request, com.gravity.v1.QueryDenomToERC20Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomToERC20"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDenomToERC20Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDenomToERC20Response.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomToERC20"))
              .build();
        }
      }
    }
    return getDenomToERC20Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthBlockRequest,
      com.gravity.v1.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastObservedEthBlock",
      requestType = com.gravity.v1.QueryLastObservedEthBlockRequest.class,
      responseType = com.gravity.v1.QueryLastObservedEthBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthBlockRequest,
      com.gravity.v1.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthBlockRequest, com.gravity.v1.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod;
    if ((getGetLastObservedEthBlockMethod = QueryGrpc.getGetLastObservedEthBlockMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetLastObservedEthBlockMethod = QueryGrpc.getGetLastObservedEthBlockMethod) == null) {
          QueryGrpc.getGetLastObservedEthBlockMethod = getGetLastObservedEthBlockMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastObservedEthBlockRequest, com.gravity.v1.QueryLastObservedEthBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastObservedEthBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastObservedEthBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastObservedEthBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetLastObservedEthBlock"))
              .build();
        }
      }
    }
    return getGetLastObservedEthBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthNonceRequest,
      com.gravity.v1.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastObservedEthNonce",
      requestType = com.gravity.v1.QueryLastObservedEthNonceRequest.class,
      responseType = com.gravity.v1.QueryLastObservedEthNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthNonceRequest,
      com.gravity.v1.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryLastObservedEthNonceRequest, com.gravity.v1.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod;
    if ((getGetLastObservedEthNonceMethod = QueryGrpc.getGetLastObservedEthNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetLastObservedEthNonceMethod = QueryGrpc.getGetLastObservedEthNonceMethod) == null) {
          QueryGrpc.getGetLastObservedEthNonceMethod = getGetLastObservedEthNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryLastObservedEthNonceRequest, com.gravity.v1.QueryLastObservedEthNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastObservedEthNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastObservedEthNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryLastObservedEthNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetLastObservedEthNonce"))
              .build();
        }
      }
    }
    return getGetLastObservedEthNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryAttestationsRequest,
      com.gravity.v1.QueryAttestationsResponse> getGetAttestationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAttestations",
      requestType = com.gravity.v1.QueryAttestationsRequest.class,
      responseType = com.gravity.v1.QueryAttestationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryAttestationsRequest,
      com.gravity.v1.QueryAttestationsResponse> getGetAttestationsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryAttestationsRequest, com.gravity.v1.QueryAttestationsResponse> getGetAttestationsMethod;
    if ((getGetAttestationsMethod = QueryGrpc.getGetAttestationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetAttestationsMethod = QueryGrpc.getGetAttestationsMethod) == null) {
          QueryGrpc.getGetAttestationsMethod = getGetAttestationsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryAttestationsRequest, com.gravity.v1.QueryAttestationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAttestations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryAttestationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryAttestationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetAttestations"))
              .build();
        }
      }
    }
    return getGetAttestationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByValidatorAddress,
      com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByValidator",
      requestType = com.gravity.v1.QueryDelegateKeysByValidatorAddress.class,
      responseType = com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByValidatorAddress,
      com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByValidatorAddress, com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;
    if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByValidatorMethod = getGetDelegateKeyByValidatorMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryDelegateKeysByValidatorAddress, com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByValidatorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByValidator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByEthAddress,
      com.gravity.v1.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByEth",
      requestType = com.gravity.v1.QueryDelegateKeysByEthAddress.class,
      responseType = com.gravity.v1.QueryDelegateKeysByEthAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByEthAddress,
      com.gravity.v1.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByEthAddress, com.gravity.v1.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;
    if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
          QueryGrpc.getGetDelegateKeyByEthMethod = getGetDelegateKeyByEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryDelegateKeysByEthAddress, com.gravity.v1.QueryDelegateKeysByEthAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByEthAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByEthAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByEth"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByOrchestratorAddress,
      com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByOrchestrator",
      requestType = com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.class,
      responseType = com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByOrchestratorAddress,
      com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryDelegateKeysByOrchestratorAddress, com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;
    if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByOrchestratorMethod = getGetDelegateKeyByOrchestratorMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryDelegateKeysByOrchestratorAddress, com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByOrchestrator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByOrchestratorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByOrchestrator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByOrchestratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingSendToEth,
      com.gravity.v1.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSendToEth",
      requestType = com.gravity.v1.QueryPendingSendToEth.class,
      responseType = com.gravity.v1.QueryPendingSendToEthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingSendToEth,
      com.gravity.v1.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingSendToEth, com.gravity.v1.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;
    if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
          QueryGrpc.getGetPendingSendToEthMethod = getGetPendingSendToEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryPendingSendToEth, com.gravity.v1.QueryPendingSendToEthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSendToEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryPendingSendToEth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryPendingSendToEthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPendingSendToEth"))
              .build();
        }
      }
    }
    return getGetPendingSendToEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingIbcAutoForwards,
      com.gravity.v1.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingIbcAutoForwards",
      requestType = com.gravity.v1.QueryPendingIbcAutoForwards.class,
      responseType = com.gravity.v1.QueryPendingIbcAutoForwardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingIbcAutoForwards,
      com.gravity.v1.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryPendingIbcAutoForwards, com.gravity.v1.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod;
    if ((getGetPendingIbcAutoForwardsMethod = QueryGrpc.getGetPendingIbcAutoForwardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPendingIbcAutoForwardsMethod = QueryGrpc.getGetPendingIbcAutoForwardsMethod) == null) {
          QueryGrpc.getGetPendingIbcAutoForwardsMethod = getGetPendingIbcAutoForwardsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryPendingIbcAutoForwards, com.gravity.v1.QueryPendingIbcAutoForwardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingIbcAutoForwards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryPendingIbcAutoForwards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryPendingIbcAutoForwardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPendingIbcAutoForwards"))
              .build();
        }
      }
    }
    return getGetPendingIbcAutoForwardsMethod;
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Deployments queries deployments
     * </pre>
     */
    default void params(com.gravity.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void currentValset(com.gravity.v1.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentValsetMethod(), responseObserver);
    }

    /**
     */
    default void valsetRequest(com.gravity.v1.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetRequestMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirm(com.gravity.v1.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirmsByNonce(com.gravity.v1.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmsByNonceMethod(), responseObserver);
    }

    /**
     */
    default void lastValsetRequests(com.gravity.v1.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastValsetRequestsMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingValsetRequestByAddr(com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingValsetRequestByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingBatchRequestByAddr(com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingBatchRequestByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingLogicCallByAddr(com.gravity.v1.QueryLastPendingLogicCallByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingLogicCallByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastEventNonceByAddr(com.gravity.v1.QueryLastEventNonceByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastEventNonceByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEventNonceByAddrMethod(), responseObserver);
    }

    /**
     */
    default void batchFees(com.gravity.v1.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchFeesMethod(), responseObserver);
    }

    /**
     */
    default void outgoingTxBatches(com.gravity.v1.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutgoingTxBatchesMethod(), responseObserver);
    }

    /**
     */
    default void outgoingLogicCalls(com.gravity.v1.QueryOutgoingLogicCallsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingLogicCallsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutgoingLogicCallsMethod(), responseObserver);
    }

    /**
     */
    default void batchRequestByNonce(com.gravity.v1.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchRequestByNonceMethod(), responseObserver);
    }

    /**
     */
    default void batchConfirms(com.gravity.v1.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchConfirmsMethod(), responseObserver);
    }

    /**
     */
    default void logicConfirms(com.gravity.v1.QueryLogicConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLogicConfirmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogicConfirmsMethod(), responseObserver);
    }

    /**
     */
    default void eRC20ToDenom(com.gravity.v1.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getERC20ToDenomMethod(), responseObserver);
    }

    /**
     */
    default void denomToERC20(com.gravity.v1.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomToERC20Method(), responseObserver);
    }

    /**
     */
    default void getLastObservedEthBlock(com.gravity.v1.QueryLastObservedEthBlockRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastObservedEthBlockMethod(), responseObserver);
    }

    /**
     */
    default void getLastObservedEthNonce(com.gravity.v1.QueryLastObservedEthNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastObservedEthNonceMethod(), responseObserver);
    }

    /**
     */
    default void getAttestations(com.gravity.v1.QueryAttestationsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryAttestationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAttestationsMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByValidator(com.gravity.v1.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByValidatorMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByEth(com.gravity.v1.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByEthMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByOrchestrator(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByOrchestratorMethod(), responseObserver);
    }

    /**
     */
    default void getPendingSendToEth(com.gravity.v1.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingSendToEthMethod(), responseObserver);
    }

    /**
     */
    default void getPendingIbcAutoForwards(com.gravity.v1.QueryPendingIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingIbcAutoForwardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingIbcAutoForwardsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public void params(com.gravity.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentValset(com.gravity.v1.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetRequest(com.gravity.v1.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirm(com.gravity.v1.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirmsByNonce(com.gravity.v1.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastValsetRequests(com.gravity.v1.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingValsetRequestByAddr(com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingBatchRequestByAddr(com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingLogicCallByAddr(com.gravity.v1.QueryLastPendingLogicCallByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingLogicCallByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastEventNonceByAddr(com.gravity.v1.QueryLastEventNonceByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastEventNonceByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEventNonceByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchFees(com.gravity.v1.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outgoingTxBatches(com.gravity.v1.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outgoingLogicCalls(com.gravity.v1.QueryOutgoingLogicCallsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingLogicCallsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutgoingLogicCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchRequestByNonce(com.gravity.v1.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchConfirms(com.gravity.v1.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logicConfirms(com.gravity.v1.QueryLogicConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLogicConfirmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogicConfirmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eRC20ToDenom(com.gravity.v1.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void denomToERC20(com.gravity.v1.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastObservedEthBlock(com.gravity.v1.QueryLastObservedEthBlockRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastObservedEthBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastObservedEthNonce(com.gravity.v1.QueryLastObservedEthNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastObservedEthNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAttestations(com.gravity.v1.QueryAttestationsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryAttestationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAttestationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByValidator(com.gravity.v1.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByEth(com.gravity.v1.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByOrchestrator(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingSendToEth(com.gravity.v1.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingIbcAutoForwards(com.gravity.v1.QueryPendingIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingIbcAutoForwardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingIbcAutoForwardsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public com.gravity.v1.QueryParamsResponse params(com.gravity.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryCurrentValsetResponse currentValset(com.gravity.v1.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentValsetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryValsetRequestResponse valsetRequest(com.gravity.v1.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryValsetConfirmResponse valsetConfirm(com.gravity.v1.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryValsetConfirmsByNonceResponse valsetConfirmsByNonce(com.gravity.v1.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmsByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastValsetRequestsResponse lastValsetRequests(com.gravity.v1.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastValsetRequestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse lastPendingValsetRequestByAddr(com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingValsetRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse lastPendingBatchRequestByAddr(com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingBatchRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastPendingLogicCallByAddrResponse lastPendingLogicCallByAddr(com.gravity.v1.QueryLastPendingLogicCallByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingLogicCallByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastEventNonceByAddrResponse lastEventNonceByAddr(com.gravity.v1.QueryLastEventNonceByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEventNonceByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryBatchFeeResponse batchFees(com.gravity.v1.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchFeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryOutgoingTxBatchesResponse outgoingTxBatches(com.gravity.v1.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutgoingTxBatchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryOutgoingLogicCallsResponse outgoingLogicCalls(com.gravity.v1.QueryOutgoingLogicCallsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutgoingLogicCallsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryBatchRequestByNonceResponse batchRequestByNonce(com.gravity.v1.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchRequestByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryBatchConfirmsResponse batchConfirms(com.gravity.v1.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchConfirmsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLogicConfirmsResponse logicConfirms(com.gravity.v1.QueryLogicConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogicConfirmsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryERC20ToDenomResponse eRC20ToDenom(com.gravity.v1.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getERC20ToDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryDenomToERC20Response denomToERC20(com.gravity.v1.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomToERC20Method(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastObservedEthBlockResponse getLastObservedEthBlock(com.gravity.v1.QueryLastObservedEthBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastObservedEthBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryLastObservedEthNonceResponse getLastObservedEthNonce(com.gravity.v1.QueryLastObservedEthNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastObservedEthNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryAttestationsResponse getAttestations(com.gravity.v1.QueryAttestationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAttestationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse getDelegateKeyByValidator(com.gravity.v1.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryDelegateKeysByEthAddressResponse getDelegateKeyByEth(com.gravity.v1.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse getDelegateKeyByOrchestrator(com.gravity.v1.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByOrchestratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryPendingSendToEthResponse getPendingSendToEth(com.gravity.v1.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingSendToEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryPendingIbcAutoForwardsResponse getPendingIbcAutoForwards(com.gravity.v1.QueryPendingIbcAutoForwards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingIbcAutoForwardsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * Deployments queries deployments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryParamsResponse> params(
        com.gravity.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryCurrentValsetResponse> currentValset(
        com.gravity.v1.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryValsetRequestResponse> valsetRequest(
        com.gravity.v1.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryValsetConfirmResponse> valsetConfirm(
        com.gravity.v1.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryValsetConfirmsByNonceResponse> valsetConfirmsByNonce(
        com.gravity.v1.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastValsetRequestsResponse> lastValsetRequests(
        com.gravity.v1.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse> lastPendingValsetRequestByAddr(
        com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse> lastPendingBatchRequestByAddr(
        com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastPendingLogicCallByAddrResponse> lastPendingLogicCallByAddr(
        com.gravity.v1.QueryLastPendingLogicCallByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingLogicCallByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastEventNonceByAddrResponse> lastEventNonceByAddr(
        com.gravity.v1.QueryLastEventNonceByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEventNonceByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryBatchFeeResponse> batchFees(
        com.gravity.v1.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryOutgoingTxBatchesResponse> outgoingTxBatches(
        com.gravity.v1.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryOutgoingLogicCallsResponse> outgoingLogicCalls(
        com.gravity.v1.QueryOutgoingLogicCallsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutgoingLogicCallsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryBatchRequestByNonceResponse> batchRequestByNonce(
        com.gravity.v1.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryBatchConfirmsResponse> batchConfirms(
        com.gravity.v1.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLogicConfirmsResponse> logicConfirms(
        com.gravity.v1.QueryLogicConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogicConfirmsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryERC20ToDenomResponse> eRC20ToDenom(
        com.gravity.v1.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryDenomToERC20Response> denomToERC20(
        com.gravity.v1.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastObservedEthBlockResponse> getLastObservedEthBlock(
        com.gravity.v1.QueryLastObservedEthBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastObservedEthBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryLastObservedEthNonceResponse> getLastObservedEthNonce(
        com.gravity.v1.QueryLastObservedEthNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastObservedEthNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryAttestationsResponse> getAttestations(
        com.gravity.v1.QueryAttestationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAttestationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse> getDelegateKeyByValidator(
        com.gravity.v1.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryDelegateKeysByEthAddressResponse> getDelegateKeyByEth(
        com.gravity.v1.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse> getDelegateKeyByOrchestrator(
        com.gravity.v1.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryPendingSendToEthResponse> getPendingSendToEth(
        com.gravity.v1.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryPendingIbcAutoForwardsResponse> getPendingIbcAutoForwards(
        com.gravity.v1.QueryPendingIbcAutoForwards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingIbcAutoForwardsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CURRENT_VALSET = 1;
  private static final int METHODID_VALSET_REQUEST = 2;
  private static final int METHODID_VALSET_CONFIRM = 3;
  private static final int METHODID_VALSET_CONFIRMS_BY_NONCE = 4;
  private static final int METHODID_LAST_VALSET_REQUESTS = 5;
  private static final int METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR = 6;
  private static final int METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR = 7;
  private static final int METHODID_LAST_PENDING_LOGIC_CALL_BY_ADDR = 8;
  private static final int METHODID_LAST_EVENT_NONCE_BY_ADDR = 9;
  private static final int METHODID_BATCH_FEES = 10;
  private static final int METHODID_OUTGOING_TX_BATCHES = 11;
  private static final int METHODID_OUTGOING_LOGIC_CALLS = 12;
  private static final int METHODID_BATCH_REQUEST_BY_NONCE = 13;
  private static final int METHODID_BATCH_CONFIRMS = 14;
  private static final int METHODID_LOGIC_CONFIRMS = 15;
  private static final int METHODID_ERC20TO_DENOM = 16;
  private static final int METHODID_DENOM_TO_ERC20 = 17;
  private static final int METHODID_GET_LAST_OBSERVED_ETH_BLOCK = 18;
  private static final int METHODID_GET_LAST_OBSERVED_ETH_NONCE = 19;
  private static final int METHODID_GET_ATTESTATIONS = 20;
  private static final int METHODID_GET_DELEGATE_KEY_BY_VALIDATOR = 21;
  private static final int METHODID_GET_DELEGATE_KEY_BY_ETH = 22;
  private static final int METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR = 23;
  private static final int METHODID_GET_PENDING_SEND_TO_ETH = 24;
  private static final int METHODID_GET_PENDING_IBC_AUTO_FORWARDS = 25;

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
          serviceImpl.params((com.gravity.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_VALSET:
          serviceImpl.currentValset((com.gravity.v1.QueryCurrentValsetRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryCurrentValsetResponse>) responseObserver);
          break;
        case METHODID_VALSET_REQUEST:
          serviceImpl.valsetRequest((com.gravity.v1.QueryValsetRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetRequestResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRM:
          serviceImpl.valsetConfirm((com.gravity.v1.QueryValsetConfirmRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRMS_BY_NONCE:
          serviceImpl.valsetConfirmsByNonce((com.gravity.v1.QueryValsetConfirmsByNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryValsetConfirmsByNonceResponse>) responseObserver);
          break;
        case METHODID_LAST_VALSET_REQUESTS:
          serviceImpl.lastValsetRequests((com.gravity.v1.QueryLastValsetRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastValsetRequestsResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR:
          serviceImpl.lastPendingValsetRequestByAddr((com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR:
          serviceImpl.lastPendingBatchRequestByAddr((com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_LOGIC_CALL_BY_ADDR:
          serviceImpl.lastPendingLogicCallByAddr((com.gravity.v1.QueryLastPendingLogicCallByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastPendingLogicCallByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_EVENT_NONCE_BY_ADDR:
          serviceImpl.lastEventNonceByAddr((com.gravity.v1.QueryLastEventNonceByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastEventNonceByAddrResponse>) responseObserver);
          break;
        case METHODID_BATCH_FEES:
          serviceImpl.batchFees((com.gravity.v1.QueryBatchFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchFeeResponse>) responseObserver);
          break;
        case METHODID_OUTGOING_TX_BATCHES:
          serviceImpl.outgoingTxBatches((com.gravity.v1.QueryOutgoingTxBatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingTxBatchesResponse>) responseObserver);
          break;
        case METHODID_OUTGOING_LOGIC_CALLS:
          serviceImpl.outgoingLogicCalls((com.gravity.v1.QueryOutgoingLogicCallsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryOutgoingLogicCallsResponse>) responseObserver);
          break;
        case METHODID_BATCH_REQUEST_BY_NONCE:
          serviceImpl.batchRequestByNonce((com.gravity.v1.QueryBatchRequestByNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchRequestByNonceResponse>) responseObserver);
          break;
        case METHODID_BATCH_CONFIRMS:
          serviceImpl.batchConfirms((com.gravity.v1.QueryBatchConfirmsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryBatchConfirmsResponse>) responseObserver);
          break;
        case METHODID_LOGIC_CONFIRMS:
          serviceImpl.logicConfirms((com.gravity.v1.QueryLogicConfirmsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLogicConfirmsResponse>) responseObserver);
          break;
        case METHODID_ERC20TO_DENOM:
          serviceImpl.eRC20ToDenom((com.gravity.v1.QueryERC20ToDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryERC20ToDenomResponse>) responseObserver);
          break;
        case METHODID_DENOM_TO_ERC20:
          serviceImpl.denomToERC20((com.gravity.v1.QueryDenomToERC20Request) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryDenomToERC20Response>) responseObserver);
          break;
        case METHODID_GET_LAST_OBSERVED_ETH_BLOCK:
          serviceImpl.getLastObservedEthBlock((com.gravity.v1.QueryLastObservedEthBlockRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthBlockResponse>) responseObserver);
          break;
        case METHODID_GET_LAST_OBSERVED_ETH_NONCE:
          serviceImpl.getLastObservedEthNonce((com.gravity.v1.QueryLastObservedEthNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryLastObservedEthNonceResponse>) responseObserver);
          break;
        case METHODID_GET_ATTESTATIONS:
          serviceImpl.getAttestations((com.gravity.v1.QueryAttestationsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryAttestationsResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_VALIDATOR:
          serviceImpl.getDelegateKeyByValidator((com.gravity.v1.QueryDelegateKeysByValidatorAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ETH:
          serviceImpl.getDelegateKeyByEth((com.gravity.v1.QueryDelegateKeysByEthAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByEthAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR:
          serviceImpl.getDelegateKeyByOrchestrator((com.gravity.v1.QueryDelegateKeysByOrchestratorAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_SEND_TO_ETH:
          serviceImpl.getPendingSendToEth((com.gravity.v1.QueryPendingSendToEth) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingSendToEthResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_IBC_AUTO_FORWARDS:
          serviceImpl.getPendingIbcAutoForwards((com.gravity.v1.QueryPendingIbcAutoForwards) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryPendingIbcAutoForwardsResponse>) responseObserver);
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
              com.gravity.v1.QueryParamsRequest,
              com.gravity.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCurrentValsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryCurrentValsetRequest,
              com.gravity.v1.QueryCurrentValsetResponse>(
                service, METHODID_CURRENT_VALSET)))
        .addMethod(
          getValsetRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryValsetRequestRequest,
              com.gravity.v1.QueryValsetRequestResponse>(
                service, METHODID_VALSET_REQUEST)))
        .addMethod(
          getValsetConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryValsetConfirmRequest,
              com.gravity.v1.QueryValsetConfirmResponse>(
                service, METHODID_VALSET_CONFIRM)))
        .addMethod(
          getValsetConfirmsByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryValsetConfirmsByNonceRequest,
              com.gravity.v1.QueryValsetConfirmsByNonceResponse>(
                service, METHODID_VALSET_CONFIRMS_BY_NONCE)))
        .addMethod(
          getLastValsetRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastValsetRequestsRequest,
              com.gravity.v1.QueryLastValsetRequestsResponse>(
                service, METHODID_LAST_VALSET_REQUESTS)))
        .addMethod(
          getLastPendingValsetRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastPendingValsetRequestByAddrRequest,
              com.gravity.v1.QueryLastPendingValsetRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR)))
        .addMethod(
          getLastPendingBatchRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastPendingBatchRequestByAddrRequest,
              com.gravity.v1.QueryLastPendingBatchRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR)))
        .addMethod(
          getLastPendingLogicCallByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastPendingLogicCallByAddrRequest,
              com.gravity.v1.QueryLastPendingLogicCallByAddrResponse>(
                service, METHODID_LAST_PENDING_LOGIC_CALL_BY_ADDR)))
        .addMethod(
          getLastEventNonceByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastEventNonceByAddrRequest,
              com.gravity.v1.QueryLastEventNonceByAddrResponse>(
                service, METHODID_LAST_EVENT_NONCE_BY_ADDR)))
        .addMethod(
          getBatchFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryBatchFeeRequest,
              com.gravity.v1.QueryBatchFeeResponse>(
                service, METHODID_BATCH_FEES)))
        .addMethod(
          getOutgoingTxBatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryOutgoingTxBatchesRequest,
              com.gravity.v1.QueryOutgoingTxBatchesResponse>(
                service, METHODID_OUTGOING_TX_BATCHES)))
        .addMethod(
          getOutgoingLogicCallsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryOutgoingLogicCallsRequest,
              com.gravity.v1.QueryOutgoingLogicCallsResponse>(
                service, METHODID_OUTGOING_LOGIC_CALLS)))
        .addMethod(
          getBatchRequestByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryBatchRequestByNonceRequest,
              com.gravity.v1.QueryBatchRequestByNonceResponse>(
                service, METHODID_BATCH_REQUEST_BY_NONCE)))
        .addMethod(
          getBatchConfirmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryBatchConfirmsRequest,
              com.gravity.v1.QueryBatchConfirmsResponse>(
                service, METHODID_BATCH_CONFIRMS)))
        .addMethod(
          getLogicConfirmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLogicConfirmsRequest,
              com.gravity.v1.QueryLogicConfirmsResponse>(
                service, METHODID_LOGIC_CONFIRMS)))
        .addMethod(
          getERC20ToDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryERC20ToDenomRequest,
              com.gravity.v1.QueryERC20ToDenomResponse>(
                service, METHODID_ERC20TO_DENOM)))
        .addMethod(
          getDenomToERC20Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryDenomToERC20Request,
              com.gravity.v1.QueryDenomToERC20Response>(
                service, METHODID_DENOM_TO_ERC20)))
        .addMethod(
          getGetLastObservedEthBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastObservedEthBlockRequest,
              com.gravity.v1.QueryLastObservedEthBlockResponse>(
                service, METHODID_GET_LAST_OBSERVED_ETH_BLOCK)))
        .addMethod(
          getGetLastObservedEthNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryLastObservedEthNonceRequest,
              com.gravity.v1.QueryLastObservedEthNonceResponse>(
                service, METHODID_GET_LAST_OBSERVED_ETH_NONCE)))
        .addMethod(
          getGetAttestationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryAttestationsRequest,
              com.gravity.v1.QueryAttestationsResponse>(
                service, METHODID_GET_ATTESTATIONS)))
        .addMethod(
          getGetDelegateKeyByValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryDelegateKeysByValidatorAddress,
              com.gravity.v1.QueryDelegateKeysByValidatorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_VALIDATOR)))
        .addMethod(
          getGetDelegateKeyByEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryDelegateKeysByEthAddress,
              com.gravity.v1.QueryDelegateKeysByEthAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ETH)))
        .addMethod(
          getGetDelegateKeyByOrchestratorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryDelegateKeysByOrchestratorAddress,
              com.gravity.v1.QueryDelegateKeysByOrchestratorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR)))
        .addMethod(
          getGetPendingSendToEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryPendingSendToEth,
              com.gravity.v1.QueryPendingSendToEthResponse>(
                service, METHODID_GET_PENDING_SEND_TO_ETH)))
        .addMethod(
          getGetPendingIbcAutoForwardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryPendingIbcAutoForwards,
              com.gravity.v1.QueryPendingIbcAutoForwardsResponse>(
                service, METHODID_GET_PENDING_IBC_AUTO_FORWARDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gravity.v1.QueryProto.getDescriptor();
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
              .addMethod(getCurrentValsetMethod())
              .addMethod(getValsetRequestMethod())
              .addMethod(getValsetConfirmMethod())
              .addMethod(getValsetConfirmsByNonceMethod())
              .addMethod(getLastValsetRequestsMethod())
              .addMethod(getLastPendingValsetRequestByAddrMethod())
              .addMethod(getLastPendingBatchRequestByAddrMethod())
              .addMethod(getLastPendingLogicCallByAddrMethod())
              .addMethod(getLastEventNonceByAddrMethod())
              .addMethod(getBatchFeesMethod())
              .addMethod(getOutgoingTxBatchesMethod())
              .addMethod(getOutgoingLogicCallsMethod())
              .addMethod(getBatchRequestByNonceMethod())
              .addMethod(getBatchConfirmsMethod())
              .addMethod(getLogicConfirmsMethod())
              .addMethod(getERC20ToDenomMethod())
              .addMethod(getDenomToERC20Method())
              .addMethod(getGetLastObservedEthBlockMethod())
              .addMethod(getGetLastObservedEthNonceMethod())
              .addMethod(getGetAttestationsMethod())
              .addMethod(getGetDelegateKeyByValidatorMethod())
              .addMethod(getGetDelegateKeyByEthMethod())
              .addMethod(getGetDelegateKeyByOrchestratorMethod())
              .addMethod(getGetPendingSendToEthMethod())
              .addMethod(getGetPendingIbcAutoForwardsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
