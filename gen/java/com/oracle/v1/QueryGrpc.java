package com.oracle.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: band/oracle/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "oracle.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryCountsRequest,
      com.oracle.v1.QueryProto.QueryCountsResponse> getCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Counts",
      requestType = com.oracle.v1.QueryProto.QueryCountsRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryCountsRequest,
      com.oracle.v1.QueryProto.QueryCountsResponse> getCountsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryCountsRequest, com.oracle.v1.QueryProto.QueryCountsResponse> getCountsMethod;
    if ((getCountsMethod = QueryGrpc.getCountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCountsMethod = QueryGrpc.getCountsMethod) == null) {
          QueryGrpc.getCountsMethod = getCountsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryCountsRequest, com.oracle.v1.QueryProto.QueryCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Counts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryCountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Counts"))
              .build();
        }
      }
    }
    return getCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataRequest,
      com.oracle.v1.QueryProto.QueryDataResponse> getDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Data",
      requestType = com.oracle.v1.QueryProto.QueryDataRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataRequest,
      com.oracle.v1.QueryProto.QueryDataResponse> getDataMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataRequest, com.oracle.v1.QueryProto.QueryDataResponse> getDataMethod;
    if ((getDataMethod = QueryGrpc.getDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataMethod = QueryGrpc.getDataMethod) == null) {
          QueryGrpc.getDataMethod = getDataMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryDataRequest, com.oracle.v1.QueryProto.QueryDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Data"))
              .build();
        }
      }
    }
    return getDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataSourceRequest,
      com.oracle.v1.QueryProto.QueryDataSourceResponse> getDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataSource",
      requestType = com.oracle.v1.QueryProto.QueryDataSourceRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryDataSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataSourceRequest,
      com.oracle.v1.QueryProto.QueryDataSourceResponse> getDataSourceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryDataSourceRequest, com.oracle.v1.QueryProto.QueryDataSourceResponse> getDataSourceMethod;
    if ((getDataSourceMethod = QueryGrpc.getDataSourceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataSourceMethod = QueryGrpc.getDataSourceMethod) == null) {
          QueryGrpc.getDataSourceMethod = getDataSourceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryDataSourceRequest, com.oracle.v1.QueryProto.QueryDataSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryDataSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryDataSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataSource"))
              .build();
        }
      }
    }
    return getDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryOracleScriptRequest,
      com.oracle.v1.QueryProto.QueryOracleScriptResponse> getOracleScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleScript",
      requestType = com.oracle.v1.QueryProto.QueryOracleScriptRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryOracleScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryOracleScriptRequest,
      com.oracle.v1.QueryProto.QueryOracleScriptResponse> getOracleScriptMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryOracleScriptRequest, com.oracle.v1.QueryProto.QueryOracleScriptResponse> getOracleScriptMethod;
    if ((getOracleScriptMethod = QueryGrpc.getOracleScriptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleScriptMethod = QueryGrpc.getOracleScriptMethod) == null) {
          QueryGrpc.getOracleScriptMethod = getOracleScriptMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryOracleScriptRequest, com.oracle.v1.QueryProto.QueryOracleScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleScript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryOracleScriptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryOracleScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleScript"))
              .build();
        }
      }
    }
    return getOracleScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestRequest,
      com.oracle.v1.QueryProto.QueryRequestResponse> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Request",
      requestType = com.oracle.v1.QueryProto.QueryRequestRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestRequest,
      com.oracle.v1.QueryProto.QueryRequestResponse> getRequestMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestRequest, com.oracle.v1.QueryProto.QueryRequestResponse> getRequestMethod;
    if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
          QueryGrpc.getRequestMethod = getRequestMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryRequestRequest, com.oracle.v1.QueryProto.QueryRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Request"))
              .build();
        }
      }
    }
    return getRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryPendingRequestsRequest,
      com.oracle.v1.QueryProto.QueryPendingRequestsResponse> getPendingRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingRequests",
      requestType = com.oracle.v1.QueryProto.QueryPendingRequestsRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryPendingRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryPendingRequestsRequest,
      com.oracle.v1.QueryProto.QueryPendingRequestsResponse> getPendingRequestsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryPendingRequestsRequest, com.oracle.v1.QueryProto.QueryPendingRequestsResponse> getPendingRequestsMethod;
    if ((getPendingRequestsMethod = QueryGrpc.getPendingRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingRequestsMethod = QueryGrpc.getPendingRequestsMethod) == null) {
          QueryGrpc.getPendingRequestsMethod = getPendingRequestsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryPendingRequestsRequest, com.oracle.v1.QueryProto.QueryPendingRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryPendingRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryPendingRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingRequests"))
              .build();
        }
      }
    }
    return getPendingRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryValidatorRequest,
      com.oracle.v1.QueryProto.QueryValidatorResponse> getValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validator",
      requestType = com.oracle.v1.QueryProto.QueryValidatorRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryValidatorRequest,
      com.oracle.v1.QueryProto.QueryValidatorResponse> getValidatorMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryValidatorRequest, com.oracle.v1.QueryProto.QueryValidatorResponse> getValidatorMethod;
    if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
          QueryGrpc.getValidatorMethod = getValidatorMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryValidatorRequest, com.oracle.v1.QueryProto.QueryValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validator"))
              .build();
        }
      }
    }
    return getValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryIsReporterRequest,
      com.oracle.v1.QueryProto.QueryIsReporterResponse> getIsReporterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsReporter",
      requestType = com.oracle.v1.QueryProto.QueryIsReporterRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryIsReporterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryIsReporterRequest,
      com.oracle.v1.QueryProto.QueryIsReporterResponse> getIsReporterMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryIsReporterRequest, com.oracle.v1.QueryProto.QueryIsReporterResponse> getIsReporterMethod;
    if ((getIsReporterMethod = QueryGrpc.getIsReporterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsReporterMethod = QueryGrpc.getIsReporterMethod) == null) {
          QueryGrpc.getIsReporterMethod = getIsReporterMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryIsReporterRequest, com.oracle.v1.QueryProto.QueryIsReporterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsReporter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryIsReporterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryIsReporterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsReporter"))
              .build();
        }
      }
    }
    return getIsReporterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryReportersRequest,
      com.oracle.v1.QueryProto.QueryReportersResponse> getReportersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reporters",
      requestType = com.oracle.v1.QueryProto.QueryReportersRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryReportersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryReportersRequest,
      com.oracle.v1.QueryProto.QueryReportersResponse> getReportersMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryReportersRequest, com.oracle.v1.QueryProto.QueryReportersResponse> getReportersMethod;
    if ((getReportersMethod = QueryGrpc.getReportersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReportersMethod = QueryGrpc.getReportersMethod) == null) {
          QueryGrpc.getReportersMethod = getReportersMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryReportersRequest, com.oracle.v1.QueryProto.QueryReportersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reporters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryReportersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryReportersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reporters"))
              .build();
        }
      }
    }
    return getReportersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryActiveValidatorsRequest,
      com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> getActiveValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveValidators",
      requestType = com.oracle.v1.QueryProto.QueryActiveValidatorsRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryActiveValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryActiveValidatorsRequest,
      com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> getActiveValidatorsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryActiveValidatorsRequest, com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> getActiveValidatorsMethod;
    if ((getActiveValidatorsMethod = QueryGrpc.getActiveValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveValidatorsMethod = QueryGrpc.getActiveValidatorsMethod) == null) {
          QueryGrpc.getActiveValidatorsMethod = getActiveValidatorsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryActiveValidatorsRequest, com.oracle.v1.QueryProto.QueryActiveValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryActiveValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryActiveValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveValidators"))
              .build();
        }
      }
    }
    return getActiveValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryParamsRequest,
      com.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.oracle.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryParamsRequest,
      com.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryParamsRequest, com.oracle.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryParamsRequest, com.oracle.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestSearchRequest,
      com.oracle.v1.QueryProto.QueryRequestSearchResponse> getRequestSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestSearch",
      requestType = com.oracle.v1.QueryProto.QueryRequestSearchRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryRequestSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestSearchRequest,
      com.oracle.v1.QueryProto.QueryRequestSearchResponse> getRequestSearchMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestSearchRequest, com.oracle.v1.QueryProto.QueryRequestSearchResponse> getRequestSearchMethod;
    if ((getRequestSearchMethod = QueryGrpc.getRequestSearchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestSearchMethod = QueryGrpc.getRequestSearchMethod) == null) {
          QueryGrpc.getRequestSearchMethod = getRequestSearchMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryRequestSearchRequest, com.oracle.v1.QueryProto.QueryRequestSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestSearch"))
              .build();
        }
      }
    }
    return getRequestSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestPriceRequest,
      com.oracle.v1.QueryProto.QueryRequestPriceResponse> getRequestPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestPrice",
      requestType = com.oracle.v1.QueryProto.QueryRequestPriceRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryRequestPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestPriceRequest,
      com.oracle.v1.QueryProto.QueryRequestPriceResponse> getRequestPriceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestPriceRequest, com.oracle.v1.QueryProto.QueryRequestPriceResponse> getRequestPriceMethod;
    if ((getRequestPriceMethod = QueryGrpc.getRequestPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestPriceMethod = QueryGrpc.getRequestPriceMethod) == null) {
          QueryGrpc.getRequestPriceMethod = getRequestPriceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryRequestPriceRequest, com.oracle.v1.QueryProto.QueryRequestPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestPrice"))
              .build();
        }
      }
    }
    return getRequestPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestVerificationRequest,
      com.oracle.v1.QueryProto.QueryRequestVerificationResponse> getRequestVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestVerification",
      requestType = com.oracle.v1.QueryProto.QueryRequestVerificationRequest.class,
      responseType = com.oracle.v1.QueryProto.QueryRequestVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestVerificationRequest,
      com.oracle.v1.QueryProto.QueryRequestVerificationResponse> getRequestVerificationMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryProto.QueryRequestVerificationRequest, com.oracle.v1.QueryProto.QueryRequestVerificationResponse> getRequestVerificationMethod;
    if ((getRequestVerificationMethod = QueryGrpc.getRequestVerificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestVerificationMethod = QueryGrpc.getRequestVerificationMethod) == null) {
          QueryGrpc.getRequestVerificationMethod = getRequestVerificationMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryProto.QueryRequestVerificationRequest, com.oracle.v1.QueryProto.QueryRequestVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryProto.QueryRequestVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestVerification"))
              .build();
        }
      }
    }
    return getRequestVerificationMethod;
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
     * Counts queries the number of existing data sources, oracle scripts, and
     * requests.
     * </pre>
     */
    default void counts(com.oracle.v1.QueryProto.QueryCountsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryCountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    default void data(com.oracle.v1.QueryProto.QueryDataRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    default void dataSource(com.oracle.v1.QueryProto.QueryDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    default void oracleScript(com.oracle.v1.QueryProto.QueryOracleScriptRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryOracleScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    default void request(com.oracle.v1.QueryProto.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    default void pendingRequests(com.oracle.v1.QueryProto.QueryPendingRequestsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryPendingRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    default void validator(com.oracle.v1.QueryProto.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    default void isReporter(com.oracle.v1.QueryProto.QueryIsReporterRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryIsReporterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsReporterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    default void reporters(com.oracle.v1.QueryProto.QueryReportersRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryReportersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    default void activeValidators(com.oracle.v1.QueryProto.QueryActiveValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    default void params(com.oracle.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    default void requestSearch(com.oracle.v1.QueryProto.QueryRequestSearchRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    default void requestPrice(com.oracle.v1.QueryProto.QueryRequestPriceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    default void requestVerification(com.oracle.v1.QueryProto.QueryRequestVerificationRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestVerificationMethod(), responseObserver);
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
     * Counts queries the number of existing data sources, oracle scripts, and
     * requests.
     * </pre>
     */
    public void counts(com.oracle.v1.QueryProto.QueryCountsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryCountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public void data(com.oracle.v1.QueryProto.QueryDataRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public void dataSource(com.oracle.v1.QueryProto.QueryDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public void oracleScript(com.oracle.v1.QueryProto.QueryOracleScriptRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryOracleScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public void request(com.oracle.v1.QueryProto.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public void pendingRequests(com.oracle.v1.QueryProto.QueryPendingRequestsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryPendingRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public void validator(com.oracle.v1.QueryProto.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public void isReporter(com.oracle.v1.QueryProto.QueryIsReporterRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryIsReporterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsReporterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public void reporters(com.oracle.v1.QueryProto.QueryReportersRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryReportersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public void activeValidators(com.oracle.v1.QueryProto.QueryActiveValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public void params(com.oracle.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public void requestSearch(com.oracle.v1.QueryProto.QueryRequestSearchRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public void requestPrice(com.oracle.v1.QueryProto.QueryRequestPriceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public void requestVerification(com.oracle.v1.QueryProto.QueryRequestVerificationRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestVerificationMethod(), getCallOptions()), request, responseObserver);
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
     * Counts queries the number of existing data sources, oracle scripts, and
     * requests.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryCountsResponse counts(com.oracle.v1.QueryProto.QueryCountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryDataResponse data(com.oracle.v1.QueryProto.QueryDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryDataSourceResponse dataSource(com.oracle.v1.QueryProto.QueryDataSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryOracleScriptResponse oracleScript(com.oracle.v1.QueryProto.QueryOracleScriptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryRequestResponse request(com.oracle.v1.QueryProto.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryPendingRequestsResponse pendingRequests(com.oracle.v1.QueryProto.QueryPendingRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryValidatorResponse validator(com.oracle.v1.QueryProto.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryIsReporterResponse isReporter(com.oracle.v1.QueryProto.QueryIsReporterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsReporterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryReportersResponse reporters(com.oracle.v1.QueryProto.QueryReportersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryActiveValidatorsResponse activeValidators(com.oracle.v1.QueryProto.QueryActiveValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryParamsResponse params(com.oracle.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryRequestSearchResponse requestSearch(com.oracle.v1.QueryProto.QueryRequestSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryRequestPriceResponse requestPrice(com.oracle.v1.QueryProto.QueryRequestPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public com.oracle.v1.QueryProto.QueryRequestVerificationResponse requestVerification(com.oracle.v1.QueryProto.QueryRequestVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestVerificationMethod(), getCallOptions(), request);
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
     * Counts queries the number of existing data sources, oracle scripts, and
     * requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryCountsResponse> counts(
        com.oracle.v1.QueryProto.QueryCountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryDataResponse> data(
        com.oracle.v1.QueryProto.QueryDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryDataSourceResponse> dataSource(
        com.oracle.v1.QueryProto.QueryDataSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryOracleScriptResponse> oracleScript(
        com.oracle.v1.QueryProto.QueryOracleScriptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryRequestResponse> request(
        com.oracle.v1.QueryProto.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryPendingRequestsResponse> pendingRequests(
        com.oracle.v1.QueryProto.QueryPendingRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryValidatorResponse> validator(
        com.oracle.v1.QueryProto.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryIsReporterResponse> isReporter(
        com.oracle.v1.QueryProto.QueryIsReporterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsReporterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryReportersResponse> reporters(
        com.oracle.v1.QueryProto.QueryReportersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryActiveValidatorsResponse> activeValidators(
        com.oracle.v1.QueryProto.QueryActiveValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryParamsResponse> params(
        com.oracle.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryRequestSearchResponse> requestSearch(
        com.oracle.v1.QueryProto.QueryRequestSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryRequestPriceResponse> requestPrice(
        com.oracle.v1.QueryProto.QueryRequestPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryProto.QueryRequestVerificationResponse> requestVerification(
        com.oracle.v1.QueryProto.QueryRequestVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestVerificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNTS = 0;
  private static final int METHODID_DATA = 1;
  private static final int METHODID_DATA_SOURCE = 2;
  private static final int METHODID_ORACLE_SCRIPT = 3;
  private static final int METHODID_REQUEST = 4;
  private static final int METHODID_PENDING_REQUESTS = 5;
  private static final int METHODID_VALIDATOR = 6;
  private static final int METHODID_IS_REPORTER = 7;
  private static final int METHODID_REPORTERS = 8;
  private static final int METHODID_ACTIVE_VALIDATORS = 9;
  private static final int METHODID_PARAMS = 10;
  private static final int METHODID_REQUEST_SEARCH = 11;
  private static final int METHODID_REQUEST_PRICE = 12;
  private static final int METHODID_REQUEST_VERIFICATION = 13;

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
        case METHODID_COUNTS:
          serviceImpl.counts((com.oracle.v1.QueryProto.QueryCountsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryCountsResponse>) responseObserver);
          break;
        case METHODID_DATA:
          serviceImpl.data((com.oracle.v1.QueryProto.QueryDataRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataResponse>) responseObserver);
          break;
        case METHODID_DATA_SOURCE:
          serviceImpl.dataSource((com.oracle.v1.QueryProto.QueryDataSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryDataSourceResponse>) responseObserver);
          break;
        case METHODID_ORACLE_SCRIPT:
          serviceImpl.oracleScript((com.oracle.v1.QueryProto.QueryOracleScriptRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryOracleScriptResponse>) responseObserver);
          break;
        case METHODID_REQUEST:
          serviceImpl.request((com.oracle.v1.QueryProto.QueryRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestResponse>) responseObserver);
          break;
        case METHODID_PENDING_REQUESTS:
          serviceImpl.pendingRequests((com.oracle.v1.QueryProto.QueryPendingRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryPendingRequestsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR:
          serviceImpl.validator((com.oracle.v1.QueryProto.QueryValidatorRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryValidatorResponse>) responseObserver);
          break;
        case METHODID_IS_REPORTER:
          serviceImpl.isReporter((com.oracle.v1.QueryProto.QueryIsReporterRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryIsReporterResponse>) responseObserver);
          break;
        case METHODID_REPORTERS:
          serviceImpl.reporters((com.oracle.v1.QueryProto.QueryReportersRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryReportersResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_VALIDATORS:
          serviceImpl.activeValidators((com.oracle.v1.QueryProto.QueryActiveValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryActiveValidatorsResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.oracle.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_REQUEST_SEARCH:
          serviceImpl.requestSearch((com.oracle.v1.QueryProto.QueryRequestSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestSearchResponse>) responseObserver);
          break;
        case METHODID_REQUEST_PRICE:
          serviceImpl.requestPrice((com.oracle.v1.QueryProto.QueryRequestPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestPriceResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VERIFICATION:
          serviceImpl.requestVerification((com.oracle.v1.QueryProto.QueryRequestVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryProto.QueryRequestVerificationResponse>) responseObserver);
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
          getCountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryCountsRequest,
              com.oracle.v1.QueryProto.QueryCountsResponse>(
                service, METHODID_COUNTS)))
        .addMethod(
          getDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryDataRequest,
              com.oracle.v1.QueryProto.QueryDataResponse>(
                service, METHODID_DATA)))
        .addMethod(
          getDataSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryDataSourceRequest,
              com.oracle.v1.QueryProto.QueryDataSourceResponse>(
                service, METHODID_DATA_SOURCE)))
        .addMethod(
          getOracleScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryOracleScriptRequest,
              com.oracle.v1.QueryProto.QueryOracleScriptResponse>(
                service, METHODID_ORACLE_SCRIPT)))
        .addMethod(
          getRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryRequestRequest,
              com.oracle.v1.QueryProto.QueryRequestResponse>(
                service, METHODID_REQUEST)))
        .addMethod(
          getPendingRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryPendingRequestsRequest,
              com.oracle.v1.QueryProto.QueryPendingRequestsResponse>(
                service, METHODID_PENDING_REQUESTS)))
        .addMethod(
          getValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryValidatorRequest,
              com.oracle.v1.QueryProto.QueryValidatorResponse>(
                service, METHODID_VALIDATOR)))
        .addMethod(
          getIsReporterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryIsReporterRequest,
              com.oracle.v1.QueryProto.QueryIsReporterResponse>(
                service, METHODID_IS_REPORTER)))
        .addMethod(
          getReportersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryReportersRequest,
              com.oracle.v1.QueryProto.QueryReportersResponse>(
                service, METHODID_REPORTERS)))
        .addMethod(
          getActiveValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryActiveValidatorsRequest,
              com.oracle.v1.QueryProto.QueryActiveValidatorsResponse>(
                service, METHODID_ACTIVE_VALIDATORS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryParamsRequest,
              com.oracle.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRequestSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryRequestSearchRequest,
              com.oracle.v1.QueryProto.QueryRequestSearchResponse>(
                service, METHODID_REQUEST_SEARCH)))
        .addMethod(
          getRequestPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryRequestPriceRequest,
              com.oracle.v1.QueryProto.QueryRequestPriceResponse>(
                service, METHODID_REQUEST_PRICE)))
        .addMethod(
          getRequestVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryProto.QueryRequestVerificationRequest,
              com.oracle.v1.QueryProto.QueryRequestVerificationResponse>(
                service, METHODID_REQUEST_VERIFICATION)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.oracle.v1.QueryProto.getDescriptor();
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
              .addMethod(getCountsMethod())
              .addMethod(getDataMethod())
              .addMethod(getDataSourceMethod())
              .addMethod(getOracleScriptMethod())
              .addMethod(getRequestMethod())
              .addMethod(getPendingRequestsMethod())
              .addMethod(getValidatorMethod())
              .addMethod(getIsReporterMethod())
              .addMethod(getReportersMethod())
              .addMethod(getActiveValidatorsMethod())
              .addMethod(getParamsMethod())
              .addMethod(getRequestSearchMethod())
              .addMethod(getRequestPriceMethod())
              .addMethod(getRequestVerificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
