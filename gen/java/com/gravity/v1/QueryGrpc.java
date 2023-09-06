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
  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryParamsRequest,
      com.gravity.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.gravity.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryParamsRequest,
      com.gravity.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryParamsRequest, com.gravity.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryParamsRequest, com.gravity.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryCurrentValsetRequest,
      com.gravity.v1.QueryProto.QueryCurrentValsetResponse> getCurrentValsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentValset",
      requestType = com.gravity.v1.QueryProto.QueryCurrentValsetRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryCurrentValsetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryCurrentValsetRequest,
      com.gravity.v1.QueryProto.QueryCurrentValsetResponse> getCurrentValsetMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryCurrentValsetRequest, com.gravity.v1.QueryProto.QueryCurrentValsetResponse> getCurrentValsetMethod;
    if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentValsetMethod = QueryGrpc.getCurrentValsetMethod) == null) {
          QueryGrpc.getCurrentValsetMethod = getCurrentValsetMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryCurrentValsetRequest, com.gravity.v1.QueryProto.QueryCurrentValsetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentValset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryCurrentValsetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryCurrentValsetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentValset"))
              .build();
        }
      }
    }
    return getCurrentValsetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetRequestRequest,
      com.gravity.v1.QueryProto.QueryValsetRequestResponse> getValsetRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetRequest",
      requestType = com.gravity.v1.QueryProto.QueryValsetRequestRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryValsetRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetRequestRequest,
      com.gravity.v1.QueryProto.QueryValsetRequestResponse> getValsetRequestMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetRequestRequest, com.gravity.v1.QueryProto.QueryValsetRequestResponse> getValsetRequestMethod;
    if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetRequestMethod = QueryGrpc.getValsetRequestMethod) == null) {
          QueryGrpc.getValsetRequestMethod = getValsetRequestMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryValsetRequestRequest, com.gravity.v1.QueryProto.QueryValsetRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetRequest"))
              .build();
        }
      }
    }
    return getValsetRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmRequest,
      com.gravity.v1.QueryProto.QueryValsetConfirmResponse> getValsetConfirmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirm",
      requestType = com.gravity.v1.QueryProto.QueryValsetConfirmRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryValsetConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmRequest,
      com.gravity.v1.QueryProto.QueryValsetConfirmResponse> getValsetConfirmMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmRequest, com.gravity.v1.QueryProto.QueryValsetConfirmResponse> getValsetConfirmMethod;
    if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmMethod = QueryGrpc.getValsetConfirmMethod) == null) {
          QueryGrpc.getValsetConfirmMethod = getValsetConfirmMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryValsetConfirmRequest, com.gravity.v1.QueryProto.QueryValsetConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetConfirmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirm"))
              .build();
        }
      }
    }
    return getValsetConfirmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest,
      com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValsetConfirmsByNonce",
      requestType = com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest,
      com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest, com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> getValsetConfirmsByNonceMethod;
    if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValsetConfirmsByNonceMethod = QueryGrpc.getValsetConfirmsByNonceMethod) == null) {
          QueryGrpc.getValsetConfirmsByNonceMethod = getValsetConfirmsByNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest, com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValsetConfirmsByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValsetConfirmsByNonce"))
              .build();
        }
      }
    }
    return getValsetConfirmsByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest,
      com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastValsetRequests",
      requestType = com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest,
      com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest, com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> getLastValsetRequestsMethod;
    if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastValsetRequestsMethod = QueryGrpc.getLastValsetRequestsMethod) == null) {
          QueryGrpc.getLastValsetRequestsMethod = getLastValsetRequestsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest, com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastValsetRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastValsetRequests"))
              .build();
        }
      }
    }
    return getLastValsetRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingValsetRequestByAddr",
      requestType = com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> getLastPendingValsetRequestByAddrMethod;
    if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingValsetRequestByAddrMethod = QueryGrpc.getLastPendingValsetRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingValsetRequestByAddrMethod = getLastPendingValsetRequestByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingValsetRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingValsetRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingValsetRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingBatchRequestByAddr",
      requestType = com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> getLastPendingBatchRequestByAddrMethod;
    if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingBatchRequestByAddrMethod = QueryGrpc.getLastPendingBatchRequestByAddrMethod) == null) {
          QueryGrpc.getLastPendingBatchRequestByAddrMethod = getLastPendingBatchRequestByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingBatchRequestByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingBatchRequestByAddr"))
              .build();
        }
      }
    }
    return getLastPendingBatchRequestByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastPendingLogicCallByAddr",
      requestType = com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> getLastPendingLogicCallByAddrMethod;
    if ((getLastPendingLogicCallByAddrMethod = QueryGrpc.getLastPendingLogicCallByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastPendingLogicCallByAddrMethod = QueryGrpc.getLastPendingLogicCallByAddrMethod) == null) {
          QueryGrpc.getLastPendingLogicCallByAddrMethod = getLastPendingLogicCallByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest, com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastPendingLogicCallByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastPendingLogicCallByAddr"))
              .build();
        }
      }
    }
    return getLastPendingLogicCallByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LastEventNonceByAddr",
      requestType = com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest,
      com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest, com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> getLastEventNonceByAddrMethod;
    if ((getLastEventNonceByAddrMethod = QueryGrpc.getLastEventNonceByAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLastEventNonceByAddrMethod = QueryGrpc.getLastEventNonceByAddrMethod) == null) {
          QueryGrpc.getLastEventNonceByAddrMethod = getLastEventNonceByAddrMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest, com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LastEventNonceByAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LastEventNonceByAddr"))
              .build();
        }
      }
    }
    return getLastEventNonceByAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchFeeRequest,
      com.gravity.v1.QueryProto.QueryBatchFeeResponse> getBatchFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchFees",
      requestType = com.gravity.v1.QueryProto.QueryBatchFeeRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryBatchFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchFeeRequest,
      com.gravity.v1.QueryProto.QueryBatchFeeResponse> getBatchFeesMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchFeeRequest, com.gravity.v1.QueryProto.QueryBatchFeeResponse> getBatchFeesMethod;
    if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchFeesMethod = QueryGrpc.getBatchFeesMethod) == null) {
          QueryGrpc.getBatchFeesMethod = getBatchFeesMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryBatchFeeRequest, com.gravity.v1.QueryProto.QueryBatchFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchFees"))
              .build();
        }
      }
    }
    return getBatchFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest,
      com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutgoingTxBatches",
      requestType = com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest,
      com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest, com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> getOutgoingTxBatchesMethod;
    if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutgoingTxBatchesMethod = QueryGrpc.getOutgoingTxBatchesMethod) == null) {
          QueryGrpc.getOutgoingTxBatchesMethod = getOutgoingTxBatchesMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest, com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutgoingTxBatches"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutgoingTxBatches"))
              .build();
        }
      }
    }
    return getOutgoingTxBatchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest,
      com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutgoingLogicCalls",
      requestType = com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest,
      com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest, com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> getOutgoingLogicCallsMethod;
    if ((getOutgoingLogicCallsMethod = QueryGrpc.getOutgoingLogicCallsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutgoingLogicCallsMethod = QueryGrpc.getOutgoingLogicCallsMethod) == null) {
          QueryGrpc.getOutgoingLogicCallsMethod = getOutgoingLogicCallsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest, com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutgoingLogicCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutgoingLogicCalls"))
              .build();
        }
      }
    }
    return getOutgoingLogicCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest,
      com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchRequestByNonce",
      requestType = com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest,
      com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest, com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> getBatchRequestByNonceMethod;
    if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchRequestByNonceMethod = QueryGrpc.getBatchRequestByNonceMethod) == null) {
          QueryGrpc.getBatchRequestByNonceMethod = getBatchRequestByNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest, com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchRequestByNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchRequestByNonce"))
              .build();
        }
      }
    }
    return getBatchRequestByNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchConfirmsRequest,
      com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> getBatchConfirmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchConfirms",
      requestType = com.gravity.v1.QueryProto.QueryBatchConfirmsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryBatchConfirmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchConfirmsRequest,
      com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> getBatchConfirmsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryBatchConfirmsRequest, com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> getBatchConfirmsMethod;
    if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBatchConfirmsMethod = QueryGrpc.getBatchConfirmsMethod) == null) {
          QueryGrpc.getBatchConfirmsMethod = getBatchConfirmsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryBatchConfirmsRequest, com.gravity.v1.QueryProto.QueryBatchConfirmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchConfirms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchConfirmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryBatchConfirmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BatchConfirms"))
              .build();
        }
      }
    }
    return getBatchConfirmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLogicConfirmsRequest,
      com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> getLogicConfirmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogicConfirms",
      requestType = com.gravity.v1.QueryProto.QueryLogicConfirmsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLogicConfirmsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLogicConfirmsRequest,
      com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> getLogicConfirmsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLogicConfirmsRequest, com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> getLogicConfirmsMethod;
    if ((getLogicConfirmsMethod = QueryGrpc.getLogicConfirmsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLogicConfirmsMethod = QueryGrpc.getLogicConfirmsMethod) == null) {
          QueryGrpc.getLogicConfirmsMethod = getLogicConfirmsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLogicConfirmsRequest, com.gravity.v1.QueryProto.QueryLogicConfirmsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogicConfirms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLogicConfirmsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLogicConfirmsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LogicConfirms"))
              .build();
        }
      }
    }
    return getLogicConfirmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryERC20ToDenomRequest,
      com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> getERC20ToDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ERC20ToDenom",
      requestType = com.gravity.v1.QueryProto.QueryERC20ToDenomRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryERC20ToDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryERC20ToDenomRequest,
      com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> getERC20ToDenomMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryERC20ToDenomRequest, com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> getERC20ToDenomMethod;
    if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getERC20ToDenomMethod = QueryGrpc.getERC20ToDenomMethod) == null) {
          QueryGrpc.getERC20ToDenomMethod = getERC20ToDenomMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryERC20ToDenomRequest, com.gravity.v1.QueryProto.QueryERC20ToDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ERC20ToDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryERC20ToDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryERC20ToDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ERC20ToDenom"))
              .build();
        }
      }
    }
    return getERC20ToDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDenomToERC20Request,
      com.gravity.v1.QueryProto.QueryDenomToERC20Response> getDenomToERC20Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomToERC20",
      requestType = com.gravity.v1.QueryProto.QueryDenomToERC20Request.class,
      responseType = com.gravity.v1.QueryProto.QueryDenomToERC20Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDenomToERC20Request,
      com.gravity.v1.QueryProto.QueryDenomToERC20Response> getDenomToERC20Method() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDenomToERC20Request, com.gravity.v1.QueryProto.QueryDenomToERC20Response> getDenomToERC20Method;
    if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomToERC20Method = QueryGrpc.getDenomToERC20Method) == null) {
          QueryGrpc.getDenomToERC20Method = getDenomToERC20Method =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryDenomToERC20Request, com.gravity.v1.QueryProto.QueryDenomToERC20Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomToERC20"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDenomToERC20Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDenomToERC20Response.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomToERC20"))
              .build();
        }
      }
    }
    return getDenomToERC20Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest,
      com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastObservedEthBlock",
      requestType = com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest,
      com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest, com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> getGetLastObservedEthBlockMethod;
    if ((getGetLastObservedEthBlockMethod = QueryGrpc.getGetLastObservedEthBlockMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetLastObservedEthBlockMethod = QueryGrpc.getGetLastObservedEthBlockMethod) == null) {
          QueryGrpc.getGetLastObservedEthBlockMethod = getGetLastObservedEthBlockMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest, com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastObservedEthBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetLastObservedEthBlock"))
              .build();
        }
      }
    }
    return getGetLastObservedEthBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest,
      com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastObservedEthNonce",
      requestType = com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest,
      com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest, com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> getGetLastObservedEthNonceMethod;
    if ((getGetLastObservedEthNonceMethod = QueryGrpc.getGetLastObservedEthNonceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetLastObservedEthNonceMethod = QueryGrpc.getGetLastObservedEthNonceMethod) == null) {
          QueryGrpc.getGetLastObservedEthNonceMethod = getGetLastObservedEthNonceMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest, com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastObservedEthNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetLastObservedEthNonce"))
              .build();
        }
      }
    }
    return getGetLastObservedEthNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryAttestationsRequest,
      com.gravity.v1.QueryProto.QueryAttestationsResponse> getGetAttestationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAttestations",
      requestType = com.gravity.v1.QueryProto.QueryAttestationsRequest.class,
      responseType = com.gravity.v1.QueryProto.QueryAttestationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryAttestationsRequest,
      com.gravity.v1.QueryProto.QueryAttestationsResponse> getGetAttestationsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryAttestationsRequest, com.gravity.v1.QueryProto.QueryAttestationsResponse> getGetAttestationsMethod;
    if ((getGetAttestationsMethod = QueryGrpc.getGetAttestationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetAttestationsMethod = QueryGrpc.getGetAttestationsMethod) == null) {
          QueryGrpc.getGetAttestationsMethod = getGetAttestationsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryAttestationsRequest, com.gravity.v1.QueryProto.QueryAttestationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAttestations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryAttestationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryAttestationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetAttestations"))
              .build();
        }
      }
    }
    return getGetAttestationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByValidator",
      requestType = com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress.class,
      responseType = com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> getGetDelegateKeyByValidatorMethod;
    if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByValidatorMethod = QueryGrpc.getGetDelegateKeyByValidatorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByValidatorMethod = getGetDelegateKeyByValidatorMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByValidator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByEth",
      requestType = com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress.class,
      responseType = com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> getGetDelegateKeyByEthMethod;
    if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByEthMethod = QueryGrpc.getGetDelegateKeyByEthMethod) == null) {
          QueryGrpc.getGetDelegateKeyByEthMethod = getGetDelegateKeyByEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByEth"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDelegateKeyByOrchestrator",
      requestType = com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress.class,
      responseType = com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress,
      com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> getGetDelegateKeyByOrchestratorMethod;
    if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDelegateKeyByOrchestratorMethod = QueryGrpc.getGetDelegateKeyByOrchestratorMethod) == null) {
          QueryGrpc.getGetDelegateKeyByOrchestratorMethod = getGetDelegateKeyByOrchestratorMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress, com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDelegateKeyByOrchestrator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDelegateKeyByOrchestrator"))
              .build();
        }
      }
    }
    return getGetDelegateKeyByOrchestratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingSendToEth,
      com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingSendToEth",
      requestType = com.gravity.v1.QueryProto.QueryPendingSendToEth.class,
      responseType = com.gravity.v1.QueryProto.QueryPendingSendToEthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingSendToEth,
      com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingSendToEth, com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> getGetPendingSendToEthMethod;
    if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPendingSendToEthMethod = QueryGrpc.getGetPendingSendToEthMethod) == null) {
          QueryGrpc.getGetPendingSendToEthMethod = getGetPendingSendToEthMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryPendingSendToEth, com.gravity.v1.QueryProto.QueryPendingSendToEthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingSendToEth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryPendingSendToEth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryPendingSendToEthResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetPendingSendToEth"))
              .build();
        }
      }
    }
    return getGetPendingSendToEthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards,
      com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingIbcAutoForwards",
      requestType = com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards.class,
      responseType = com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards,
      com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod() {
    io.grpc.MethodDescriptor<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards, com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> getGetPendingIbcAutoForwardsMethod;
    if ((getGetPendingIbcAutoForwardsMethod = QueryGrpc.getGetPendingIbcAutoForwardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetPendingIbcAutoForwardsMethod = QueryGrpc.getGetPendingIbcAutoForwardsMethod) == null) {
          QueryGrpc.getGetPendingIbcAutoForwardsMethod = getGetPendingIbcAutoForwardsMethod =
              io.grpc.MethodDescriptor.<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards, com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingIbcAutoForwards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse.getDefaultInstance()))
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
    default void params(com.gravity.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void currentValset(com.gravity.v1.QueryProto.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentValsetMethod(), responseObserver);
    }

    /**
     */
    default void valsetRequest(com.gravity.v1.QueryProto.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetRequestMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirm(com.gravity.v1.QueryProto.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmMethod(), responseObserver);
    }

    /**
     */
    default void valsetConfirmsByNonce(com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValsetConfirmsByNonceMethod(), responseObserver);
    }

    /**
     */
    default void lastValsetRequests(com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastValsetRequestsMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingValsetRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingValsetRequestByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingBatchRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingBatchRequestByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastPendingLogicCallByAddr(com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastPendingLogicCallByAddrMethod(), responseObserver);
    }

    /**
     */
    default void lastEventNonceByAddr(com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLastEventNonceByAddrMethod(), responseObserver);
    }

    /**
     */
    default void batchFees(com.gravity.v1.QueryProto.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchFeesMethod(), responseObserver);
    }

    /**
     */
    default void outgoingTxBatches(com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutgoingTxBatchesMethod(), responseObserver);
    }

    /**
     */
    default void outgoingLogicCalls(com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutgoingLogicCallsMethod(), responseObserver);
    }

    /**
     */
    default void batchRequestByNonce(com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchRequestByNonceMethod(), responseObserver);
    }

    /**
     */
    default void batchConfirms(com.gravity.v1.QueryProto.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchConfirmsMethod(), responseObserver);
    }

    /**
     */
    default void logicConfirms(com.gravity.v1.QueryProto.QueryLogicConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogicConfirmsMethod(), responseObserver);
    }

    /**
     */
    default void eRC20ToDenom(com.gravity.v1.QueryProto.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getERC20ToDenomMethod(), responseObserver);
    }

    /**
     */
    default void denomToERC20(com.gravity.v1.QueryProto.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomToERC20Method(), responseObserver);
    }

    /**
     */
    default void getLastObservedEthBlock(com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastObservedEthBlockMethod(), responseObserver);
    }

    /**
     */
    default void getLastObservedEthNonce(com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastObservedEthNonceMethod(), responseObserver);
    }

    /**
     */
    default void getAttestations(com.gravity.v1.QueryProto.QueryAttestationsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryAttestationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAttestationsMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByValidator(com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByValidatorMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByEth(com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByEthMethod(), responseObserver);
    }

    /**
     */
    default void getDelegateKeyByOrchestrator(com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDelegateKeyByOrchestratorMethod(), responseObserver);
    }

    /**
     */
    default void getPendingSendToEth(com.gravity.v1.QueryProto.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingSendToEthMethod(), responseObserver);
    }

    /**
     */
    default void getPendingIbcAutoForwards(com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> responseObserver) {
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
    public void params(com.gravity.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void currentValset(com.gravity.v1.QueryProto.QueryCurrentValsetRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryCurrentValsetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetRequest(com.gravity.v1.QueryProto.QueryValsetRequestRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirm(com.gravity.v1.QueryProto.QueryValsetConfirmRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void valsetConfirmsByNonce(com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastValsetRequests(com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingValsetRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingBatchRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastPendingLogicCallByAddr(com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastPendingLogicCallByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lastEventNonceByAddr(com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLastEventNonceByAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchFees(com.gravity.v1.QueryProto.QueryBatchFeeRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outgoingTxBatches(com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outgoingLogicCalls(com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutgoingLogicCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchRequestByNonce(com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchConfirms(com.gravity.v1.QueryProto.QueryBatchConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logicConfirms(com.gravity.v1.QueryProto.QueryLogicConfirmsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogicConfirmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void eRC20ToDenom(com.gravity.v1.QueryProto.QueryERC20ToDenomRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void denomToERC20(com.gravity.v1.QueryProto.QueryDenomToERC20Request request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDenomToERC20Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastObservedEthBlock(com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastObservedEthBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLastObservedEthNonce(com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastObservedEthNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAttestations(com.gravity.v1.QueryProto.QueryAttestationsRequest request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryAttestationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAttestationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByValidator(com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByEth(com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateKeyByOrchestrator(com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingSendToEth(com.gravity.v1.QueryProto.QueryPendingSendToEth request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPendingIbcAutoForwards(com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards request,
        io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> responseObserver) {
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
    public com.gravity.v1.QueryProto.QueryParamsResponse params(com.gravity.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryCurrentValsetResponse currentValset(com.gravity.v1.QueryProto.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentValsetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryValsetRequestResponse valsetRequest(com.gravity.v1.QueryProto.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryValsetConfirmResponse valsetConfirm(com.gravity.v1.QueryProto.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse valsetConfirmsByNonce(com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValsetConfirmsByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse lastValsetRequests(com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastValsetRequestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse lastPendingValsetRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingValsetRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse lastPendingBatchRequestByAddr(com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingBatchRequestByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse lastPendingLogicCallByAddr(com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastPendingLogicCallByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse lastEventNonceByAddr(com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLastEventNonceByAddrMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryBatchFeeResponse batchFees(com.gravity.v1.QueryProto.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchFeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse outgoingTxBatches(com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutgoingTxBatchesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse outgoingLogicCalls(com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutgoingLogicCallsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse batchRequestByNonce(com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchRequestByNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryBatchConfirmsResponse batchConfirms(com.gravity.v1.QueryProto.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchConfirmsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLogicConfirmsResponse logicConfirms(com.gravity.v1.QueryProto.QueryLogicConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogicConfirmsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryERC20ToDenomResponse eRC20ToDenom(com.gravity.v1.QueryProto.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getERC20ToDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryDenomToERC20Response denomToERC20(com.gravity.v1.QueryProto.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomToERC20Method(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse getLastObservedEthBlock(com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastObservedEthBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse getLastObservedEthNonce(com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastObservedEthNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryAttestationsResponse getAttestations(com.gravity.v1.QueryProto.QueryAttestationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAttestationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse getDelegateKeyByValidator(com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse getDelegateKeyByEth(com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse getDelegateKeyByOrchestrator(com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDelegateKeyByOrchestratorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryPendingSendToEthResponse getPendingSendToEth(com.gravity.v1.QueryProto.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingSendToEthMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse getPendingIbcAutoForwards(com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryParamsResponse> params(
        com.gravity.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryCurrentValsetResponse> currentValset(
        com.gravity.v1.QueryProto.QueryCurrentValsetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentValsetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryValsetRequestResponse> valsetRequest(
        com.gravity.v1.QueryProto.QueryValsetRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryValsetConfirmResponse> valsetConfirm(
        com.gravity.v1.QueryProto.QueryValsetConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse> valsetConfirmsByNonce(
        com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValsetConfirmsByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse> lastValsetRequests(
        com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastValsetRequestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse> lastPendingValsetRequestByAddr(
        com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingValsetRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse> lastPendingBatchRequestByAddr(
        com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingBatchRequestByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse> lastPendingLogicCallByAddr(
        com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastPendingLogicCallByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse> lastEventNonceByAddr(
        com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLastEventNonceByAddrMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryBatchFeeResponse> batchFees(
        com.gravity.v1.QueryProto.QueryBatchFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchFeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse> outgoingTxBatches(
        com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutgoingTxBatchesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse> outgoingLogicCalls(
        com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutgoingLogicCallsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse> batchRequestByNonce(
        com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchRequestByNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryBatchConfirmsResponse> batchConfirms(
        com.gravity.v1.QueryProto.QueryBatchConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchConfirmsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLogicConfirmsResponse> logicConfirms(
        com.gravity.v1.QueryProto.QueryLogicConfirmsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogicConfirmsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryERC20ToDenomResponse> eRC20ToDenom(
        com.gravity.v1.QueryProto.QueryERC20ToDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getERC20ToDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryDenomToERC20Response> denomToERC20(
        com.gravity.v1.QueryProto.QueryDenomToERC20Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomToERC20Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse> getLastObservedEthBlock(
        com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastObservedEthBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse> getLastObservedEthNonce(
        com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastObservedEthNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryAttestationsResponse> getAttestations(
        com.gravity.v1.QueryProto.QueryAttestationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAttestationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse> getDelegateKeyByValidator(
        com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse> getDelegateKeyByEth(
        com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse> getDelegateKeyByOrchestrator(
        com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDelegateKeyByOrchestratorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryPendingSendToEthResponse> getPendingSendToEth(
        com.gravity.v1.QueryProto.QueryPendingSendToEth request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingSendToEthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse> getPendingIbcAutoForwards(
        com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards request) {
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
          serviceImpl.params((com.gravity.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CURRENT_VALSET:
          serviceImpl.currentValset((com.gravity.v1.QueryProto.QueryCurrentValsetRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryCurrentValsetResponse>) responseObserver);
          break;
        case METHODID_VALSET_REQUEST:
          serviceImpl.valsetRequest((com.gravity.v1.QueryProto.QueryValsetRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetRequestResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRM:
          serviceImpl.valsetConfirm((com.gravity.v1.QueryProto.QueryValsetConfirmRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmResponse>) responseObserver);
          break;
        case METHODID_VALSET_CONFIRMS_BY_NONCE:
          serviceImpl.valsetConfirmsByNonce((com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse>) responseObserver);
          break;
        case METHODID_LAST_VALSET_REQUESTS:
          serviceImpl.lastValsetRequests((com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR:
          serviceImpl.lastPendingValsetRequestByAddr((com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR:
          serviceImpl.lastPendingBatchRequestByAddr((com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_PENDING_LOGIC_CALL_BY_ADDR:
          serviceImpl.lastPendingLogicCallByAddr((com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse>) responseObserver);
          break;
        case METHODID_LAST_EVENT_NONCE_BY_ADDR:
          serviceImpl.lastEventNonceByAddr((com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse>) responseObserver);
          break;
        case METHODID_BATCH_FEES:
          serviceImpl.batchFees((com.gravity.v1.QueryProto.QueryBatchFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchFeeResponse>) responseObserver);
          break;
        case METHODID_OUTGOING_TX_BATCHES:
          serviceImpl.outgoingTxBatches((com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse>) responseObserver);
          break;
        case METHODID_OUTGOING_LOGIC_CALLS:
          serviceImpl.outgoingLogicCalls((com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse>) responseObserver);
          break;
        case METHODID_BATCH_REQUEST_BY_NONCE:
          serviceImpl.batchRequestByNonce((com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse>) responseObserver);
          break;
        case METHODID_BATCH_CONFIRMS:
          serviceImpl.batchConfirms((com.gravity.v1.QueryProto.QueryBatchConfirmsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryBatchConfirmsResponse>) responseObserver);
          break;
        case METHODID_LOGIC_CONFIRMS:
          serviceImpl.logicConfirms((com.gravity.v1.QueryProto.QueryLogicConfirmsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLogicConfirmsResponse>) responseObserver);
          break;
        case METHODID_ERC20TO_DENOM:
          serviceImpl.eRC20ToDenom((com.gravity.v1.QueryProto.QueryERC20ToDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryERC20ToDenomResponse>) responseObserver);
          break;
        case METHODID_DENOM_TO_ERC20:
          serviceImpl.denomToERC20((com.gravity.v1.QueryProto.QueryDenomToERC20Request) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDenomToERC20Response>) responseObserver);
          break;
        case METHODID_GET_LAST_OBSERVED_ETH_BLOCK:
          serviceImpl.getLastObservedEthBlock((com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse>) responseObserver);
          break;
        case METHODID_GET_LAST_OBSERVED_ETH_NONCE:
          serviceImpl.getLastObservedEthNonce((com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse>) responseObserver);
          break;
        case METHODID_GET_ATTESTATIONS:
          serviceImpl.getAttestations((com.gravity.v1.QueryProto.QueryAttestationsRequest) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryAttestationsResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_VALIDATOR:
          serviceImpl.getDelegateKeyByValidator((com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ETH:
          serviceImpl.getDelegateKeyByEth((com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR:
          serviceImpl.getDelegateKeyByOrchestrator((com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_SEND_TO_ETH:
          serviceImpl.getPendingSendToEth((com.gravity.v1.QueryProto.QueryPendingSendToEth) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingSendToEthResponse>) responseObserver);
          break;
        case METHODID_GET_PENDING_IBC_AUTO_FORWARDS:
          serviceImpl.getPendingIbcAutoForwards((com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards) request,
              (io.grpc.stub.StreamObserver<com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse>) responseObserver);
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
              com.gravity.v1.QueryProto.QueryParamsRequest,
              com.gravity.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCurrentValsetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryCurrentValsetRequest,
              com.gravity.v1.QueryProto.QueryCurrentValsetResponse>(
                service, METHODID_CURRENT_VALSET)))
        .addMethod(
          getValsetRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryValsetRequestRequest,
              com.gravity.v1.QueryProto.QueryValsetRequestResponse>(
                service, METHODID_VALSET_REQUEST)))
        .addMethod(
          getValsetConfirmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryValsetConfirmRequest,
              com.gravity.v1.QueryProto.QueryValsetConfirmResponse>(
                service, METHODID_VALSET_CONFIRM)))
        .addMethod(
          getValsetConfirmsByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceRequest,
              com.gravity.v1.QueryProto.QueryValsetConfirmsByNonceResponse>(
                service, METHODID_VALSET_CONFIRMS_BY_NONCE)))
        .addMethod(
          getLastValsetRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastValsetRequestsRequest,
              com.gravity.v1.QueryProto.QueryLastValsetRequestsResponse>(
                service, METHODID_LAST_VALSET_REQUESTS)))
        .addMethod(
          getLastPendingValsetRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrRequest,
              com.gravity.v1.QueryProto.QueryLastPendingValsetRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_VALSET_REQUEST_BY_ADDR)))
        .addMethod(
          getLastPendingBatchRequestByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrRequest,
              com.gravity.v1.QueryProto.QueryLastPendingBatchRequestByAddrResponse>(
                service, METHODID_LAST_PENDING_BATCH_REQUEST_BY_ADDR)))
        .addMethod(
          getLastPendingLogicCallByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrRequest,
              com.gravity.v1.QueryProto.QueryLastPendingLogicCallByAddrResponse>(
                service, METHODID_LAST_PENDING_LOGIC_CALL_BY_ADDR)))
        .addMethod(
          getLastEventNonceByAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastEventNonceByAddrRequest,
              com.gravity.v1.QueryProto.QueryLastEventNonceByAddrResponse>(
                service, METHODID_LAST_EVENT_NONCE_BY_ADDR)))
        .addMethod(
          getBatchFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryBatchFeeRequest,
              com.gravity.v1.QueryProto.QueryBatchFeeResponse>(
                service, METHODID_BATCH_FEES)))
        .addMethod(
          getOutgoingTxBatchesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryOutgoingTxBatchesRequest,
              com.gravity.v1.QueryProto.QueryOutgoingTxBatchesResponse>(
                service, METHODID_OUTGOING_TX_BATCHES)))
        .addMethod(
          getOutgoingLogicCallsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryOutgoingLogicCallsRequest,
              com.gravity.v1.QueryProto.QueryOutgoingLogicCallsResponse>(
                service, METHODID_OUTGOING_LOGIC_CALLS)))
        .addMethod(
          getBatchRequestByNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryBatchRequestByNonceRequest,
              com.gravity.v1.QueryProto.QueryBatchRequestByNonceResponse>(
                service, METHODID_BATCH_REQUEST_BY_NONCE)))
        .addMethod(
          getBatchConfirmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryBatchConfirmsRequest,
              com.gravity.v1.QueryProto.QueryBatchConfirmsResponse>(
                service, METHODID_BATCH_CONFIRMS)))
        .addMethod(
          getLogicConfirmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLogicConfirmsRequest,
              com.gravity.v1.QueryProto.QueryLogicConfirmsResponse>(
                service, METHODID_LOGIC_CONFIRMS)))
        .addMethod(
          getERC20ToDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryERC20ToDenomRequest,
              com.gravity.v1.QueryProto.QueryERC20ToDenomResponse>(
                service, METHODID_ERC20TO_DENOM)))
        .addMethod(
          getDenomToERC20Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryDenomToERC20Request,
              com.gravity.v1.QueryProto.QueryDenomToERC20Response>(
                service, METHODID_DENOM_TO_ERC20)))
        .addMethod(
          getGetLastObservedEthBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastObservedEthBlockRequest,
              com.gravity.v1.QueryProto.QueryLastObservedEthBlockResponse>(
                service, METHODID_GET_LAST_OBSERVED_ETH_BLOCK)))
        .addMethod(
          getGetLastObservedEthNonceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryLastObservedEthNonceRequest,
              com.gravity.v1.QueryProto.QueryLastObservedEthNonceResponse>(
                service, METHODID_GET_LAST_OBSERVED_ETH_NONCE)))
        .addMethod(
          getGetAttestationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryAttestationsRequest,
              com.gravity.v1.QueryProto.QueryAttestationsResponse>(
                service, METHODID_GET_ATTESTATIONS)))
        .addMethod(
          getGetDelegateKeyByValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddress,
              com.gravity.v1.QueryProto.QueryDelegateKeysByValidatorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_VALIDATOR)))
        .addMethod(
          getGetDelegateKeyByEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddress,
              com.gravity.v1.QueryProto.QueryDelegateKeysByEthAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ETH)))
        .addMethod(
          getGetDelegateKeyByOrchestratorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddress,
              com.gravity.v1.QueryProto.QueryDelegateKeysByOrchestratorAddressResponse>(
                service, METHODID_GET_DELEGATE_KEY_BY_ORCHESTRATOR)))
        .addMethod(
          getGetPendingSendToEthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryPendingSendToEth,
              com.gravity.v1.QueryProto.QueryPendingSendToEthResponse>(
                service, METHODID_GET_PENDING_SEND_TO_ETH)))
        .addMethod(
          getGetPendingIbcAutoForwardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.gravity.v1.QueryProto.QueryPendingIbcAutoForwards,
              com.gravity.v1.QueryProto.QueryPendingIbcAutoForwardsResponse>(
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
