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
  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryCountsRequest,
      com.oracle.v1.QueryCountsResponse> getCountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Counts",
      requestType = com.oracle.v1.QueryCountsRequest.class,
      responseType = com.oracle.v1.QueryCountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryCountsRequest,
      com.oracle.v1.QueryCountsResponse> getCountsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryCountsRequest, com.oracle.v1.QueryCountsResponse> getCountsMethod;
    if ((getCountsMethod = QueryGrpc.getCountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCountsMethod = QueryGrpc.getCountsMethod) == null) {
          QueryGrpc.getCountsMethod = getCountsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryCountsRequest, com.oracle.v1.QueryCountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Counts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryCountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryCountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Counts"))
              .build();
        }
      }
    }
    return getCountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryDataRequest,
      com.oracle.v1.QueryDataResponse> getDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Data",
      requestType = com.oracle.v1.QueryDataRequest.class,
      responseType = com.oracle.v1.QueryDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryDataRequest,
      com.oracle.v1.QueryDataResponse> getDataMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryDataRequest, com.oracle.v1.QueryDataResponse> getDataMethod;
    if ((getDataMethod = QueryGrpc.getDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataMethod = QueryGrpc.getDataMethod) == null) {
          QueryGrpc.getDataMethod = getDataMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryDataRequest, com.oracle.v1.QueryDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Data"))
              .build();
        }
      }
    }
    return getDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryDataSourceRequest,
      com.oracle.v1.QueryDataSourceResponse> getDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataSource",
      requestType = com.oracle.v1.QueryDataSourceRequest.class,
      responseType = com.oracle.v1.QueryDataSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryDataSourceRequest,
      com.oracle.v1.QueryDataSourceResponse> getDataSourceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryDataSourceRequest, com.oracle.v1.QueryDataSourceResponse> getDataSourceMethod;
    if ((getDataSourceMethod = QueryGrpc.getDataSourceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataSourceMethod = QueryGrpc.getDataSourceMethod) == null) {
          QueryGrpc.getDataSourceMethod = getDataSourceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryDataSourceRequest, com.oracle.v1.QueryDataSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryDataSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryDataSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataSource"))
              .build();
        }
      }
    }
    return getDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryOracleScriptRequest,
      com.oracle.v1.QueryOracleScriptResponse> getOracleScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleScript",
      requestType = com.oracle.v1.QueryOracleScriptRequest.class,
      responseType = com.oracle.v1.QueryOracleScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryOracleScriptRequest,
      com.oracle.v1.QueryOracleScriptResponse> getOracleScriptMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryOracleScriptRequest, com.oracle.v1.QueryOracleScriptResponse> getOracleScriptMethod;
    if ((getOracleScriptMethod = QueryGrpc.getOracleScriptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleScriptMethod = QueryGrpc.getOracleScriptMethod) == null) {
          QueryGrpc.getOracleScriptMethod = getOracleScriptMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryOracleScriptRequest, com.oracle.v1.QueryOracleScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleScript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryOracleScriptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryOracleScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleScript"))
              .build();
        }
      }
    }
    return getOracleScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestRequest,
      com.oracle.v1.QueryRequestResponse> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Request",
      requestType = com.oracle.v1.QueryRequestRequest.class,
      responseType = com.oracle.v1.QueryRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestRequest,
      com.oracle.v1.QueryRequestResponse> getRequestMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestRequest, com.oracle.v1.QueryRequestResponse> getRequestMethod;
    if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
          QueryGrpc.getRequestMethod = getRequestMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryRequestRequest, com.oracle.v1.QueryRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Request"))
              .build();
        }
      }
    }
    return getRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryPendingRequestsRequest,
      com.oracle.v1.QueryPendingRequestsResponse> getPendingRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingRequests",
      requestType = com.oracle.v1.QueryPendingRequestsRequest.class,
      responseType = com.oracle.v1.QueryPendingRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryPendingRequestsRequest,
      com.oracle.v1.QueryPendingRequestsResponse> getPendingRequestsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryPendingRequestsRequest, com.oracle.v1.QueryPendingRequestsResponse> getPendingRequestsMethod;
    if ((getPendingRequestsMethod = QueryGrpc.getPendingRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingRequestsMethod = QueryGrpc.getPendingRequestsMethod) == null) {
          QueryGrpc.getPendingRequestsMethod = getPendingRequestsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryPendingRequestsRequest, com.oracle.v1.QueryPendingRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryPendingRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryPendingRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingRequests"))
              .build();
        }
      }
    }
    return getPendingRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryValidatorRequest,
      com.oracle.v1.QueryValidatorResponse> getValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validator",
      requestType = com.oracle.v1.QueryValidatorRequest.class,
      responseType = com.oracle.v1.QueryValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryValidatorRequest,
      com.oracle.v1.QueryValidatorResponse> getValidatorMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryValidatorRequest, com.oracle.v1.QueryValidatorResponse> getValidatorMethod;
    if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
          QueryGrpc.getValidatorMethod = getValidatorMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryValidatorRequest, com.oracle.v1.QueryValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validator"))
              .build();
        }
      }
    }
    return getValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryIsReporterRequest,
      com.oracle.v1.QueryIsReporterResponse> getIsReporterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsReporter",
      requestType = com.oracle.v1.QueryIsReporterRequest.class,
      responseType = com.oracle.v1.QueryIsReporterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryIsReporterRequest,
      com.oracle.v1.QueryIsReporterResponse> getIsReporterMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryIsReporterRequest, com.oracle.v1.QueryIsReporterResponse> getIsReporterMethod;
    if ((getIsReporterMethod = QueryGrpc.getIsReporterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIsReporterMethod = QueryGrpc.getIsReporterMethod) == null) {
          QueryGrpc.getIsReporterMethod = getIsReporterMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryIsReporterRequest, com.oracle.v1.QueryIsReporterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsReporter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryIsReporterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryIsReporterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IsReporter"))
              .build();
        }
      }
    }
    return getIsReporterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryReportersRequest,
      com.oracle.v1.QueryReportersResponse> getReportersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reporters",
      requestType = com.oracle.v1.QueryReportersRequest.class,
      responseType = com.oracle.v1.QueryReportersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryReportersRequest,
      com.oracle.v1.QueryReportersResponse> getReportersMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryReportersRequest, com.oracle.v1.QueryReportersResponse> getReportersMethod;
    if ((getReportersMethod = QueryGrpc.getReportersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReportersMethod = QueryGrpc.getReportersMethod) == null) {
          QueryGrpc.getReportersMethod = getReportersMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryReportersRequest, com.oracle.v1.QueryReportersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reporters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryReportersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryReportersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Reporters"))
              .build();
        }
      }
    }
    return getReportersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryActiveValidatorsRequest,
      com.oracle.v1.QueryActiveValidatorsResponse> getActiveValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveValidators",
      requestType = com.oracle.v1.QueryActiveValidatorsRequest.class,
      responseType = com.oracle.v1.QueryActiveValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryActiveValidatorsRequest,
      com.oracle.v1.QueryActiveValidatorsResponse> getActiveValidatorsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryActiveValidatorsRequest, com.oracle.v1.QueryActiveValidatorsResponse> getActiveValidatorsMethod;
    if ((getActiveValidatorsMethod = QueryGrpc.getActiveValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveValidatorsMethod = QueryGrpc.getActiveValidatorsMethod) == null) {
          QueryGrpc.getActiveValidatorsMethod = getActiveValidatorsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryActiveValidatorsRequest, com.oracle.v1.QueryActiveValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryActiveValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryActiveValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveValidators"))
              .build();
        }
      }
    }
    return getActiveValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryParamsRequest,
      com.oracle.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.oracle.v1.QueryParamsRequest.class,
      responseType = com.oracle.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryParamsRequest,
      com.oracle.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryParamsRequest, com.oracle.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryParamsRequest, com.oracle.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestSearchRequest,
      com.oracle.v1.QueryRequestSearchResponse> getRequestSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestSearch",
      requestType = com.oracle.v1.QueryRequestSearchRequest.class,
      responseType = com.oracle.v1.QueryRequestSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestSearchRequest,
      com.oracle.v1.QueryRequestSearchResponse> getRequestSearchMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestSearchRequest, com.oracle.v1.QueryRequestSearchResponse> getRequestSearchMethod;
    if ((getRequestSearchMethod = QueryGrpc.getRequestSearchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestSearchMethod = QueryGrpc.getRequestSearchMethod) == null) {
          QueryGrpc.getRequestSearchMethod = getRequestSearchMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryRequestSearchRequest, com.oracle.v1.QueryRequestSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestSearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestSearch"))
              .build();
        }
      }
    }
    return getRequestSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestPriceRequest,
      com.oracle.v1.QueryRequestPriceResponse> getRequestPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestPrice",
      requestType = com.oracle.v1.QueryRequestPriceRequest.class,
      responseType = com.oracle.v1.QueryRequestPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestPriceRequest,
      com.oracle.v1.QueryRequestPriceResponse> getRequestPriceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestPriceRequest, com.oracle.v1.QueryRequestPriceResponse> getRequestPriceMethod;
    if ((getRequestPriceMethod = QueryGrpc.getRequestPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestPriceMethod = QueryGrpc.getRequestPriceMethod) == null) {
          QueryGrpc.getRequestPriceMethod = getRequestPriceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryRequestPriceRequest, com.oracle.v1.QueryRequestPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestPrice"))
              .build();
        }
      }
    }
    return getRequestPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestVerificationRequest,
      com.oracle.v1.QueryRequestVerificationResponse> getRequestVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestVerification",
      requestType = com.oracle.v1.QueryRequestVerificationRequest.class,
      responseType = com.oracle.v1.QueryRequestVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestVerificationRequest,
      com.oracle.v1.QueryRequestVerificationResponse> getRequestVerificationMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.QueryRequestVerificationRequest, com.oracle.v1.QueryRequestVerificationResponse> getRequestVerificationMethod;
    if ((getRequestVerificationMethod = QueryGrpc.getRequestVerificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestVerificationMethod = QueryGrpc.getRequestVerificationMethod) == null) {
          QueryGrpc.getRequestVerificationMethod = getRequestVerificationMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.QueryRequestVerificationRequest, com.oracle.v1.QueryRequestVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.QueryRequestVerificationResponse.getDefaultInstance()))
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
    default void counts(com.oracle.v1.QueryCountsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryCountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    default void data(com.oracle.v1.QueryDataRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    default void dataSource(com.oracle.v1.QueryDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    default void oracleScript(com.oracle.v1.QueryOracleScriptRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryOracleScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    default void request(com.oracle.v1.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    default void pendingRequests(com.oracle.v1.QueryPendingRequestsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryPendingRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    default void validator(com.oracle.v1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    default void isReporter(com.oracle.v1.QueryIsReporterRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryIsReporterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsReporterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    default void reporters(com.oracle.v1.QueryReportersRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryReportersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    default void activeValidators(com.oracle.v1.QueryActiveValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryActiveValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    default void params(com.oracle.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    default void requestSearch(com.oracle.v1.QueryRequestSearchRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    default void requestPrice(com.oracle.v1.QueryRequestPriceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    default void requestVerification(com.oracle.v1.QueryRequestVerificationRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestVerificationResponse> responseObserver) {
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
    public void counts(com.oracle.v1.QueryCountsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryCountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public void data(com.oracle.v1.QueryDataRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public void dataSource(com.oracle.v1.QueryDataSourceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public void oracleScript(com.oracle.v1.QueryOracleScriptRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryOracleScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public void request(com.oracle.v1.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public void pendingRequests(com.oracle.v1.QueryPendingRequestsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryPendingRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public void validator(com.oracle.v1.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public void isReporter(com.oracle.v1.QueryIsReporterRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryIsReporterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsReporterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public void reporters(com.oracle.v1.QueryReportersRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryReportersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public void activeValidators(com.oracle.v1.QueryActiveValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryActiveValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public void params(com.oracle.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public void requestSearch(com.oracle.v1.QueryRequestSearchRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public void requestPrice(com.oracle.v1.QueryRequestPriceRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public void requestVerification(com.oracle.v1.QueryRequestVerificationRequest request,
        io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestVerificationResponse> responseObserver) {
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
    public com.oracle.v1.QueryCountsResponse counts(com.oracle.v1.QueryCountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public com.oracle.v1.QueryDataResponse data(com.oracle.v1.QueryDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public com.oracle.v1.QueryDataSourceResponse dataSource(com.oracle.v1.QueryDataSourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public com.oracle.v1.QueryOracleScriptResponse oracleScript(com.oracle.v1.QueryOracleScriptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public com.oracle.v1.QueryRequestResponse request(com.oracle.v1.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public com.oracle.v1.QueryPendingRequestsResponse pendingRequests(com.oracle.v1.QueryPendingRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public com.oracle.v1.QueryValidatorResponse validator(com.oracle.v1.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public com.oracle.v1.QueryIsReporterResponse isReporter(com.oracle.v1.QueryIsReporterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsReporterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public com.oracle.v1.QueryReportersResponse reporters(com.oracle.v1.QueryReportersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public com.oracle.v1.QueryActiveValidatorsResponse activeValidators(com.oracle.v1.QueryActiveValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public com.oracle.v1.QueryParamsResponse params(com.oracle.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public com.oracle.v1.QueryRequestSearchResponse requestSearch(com.oracle.v1.QueryRequestSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public com.oracle.v1.QueryRequestPriceResponse requestPrice(com.oracle.v1.QueryRequestPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public com.oracle.v1.QueryRequestVerificationResponse requestVerification(com.oracle.v1.QueryRequestVerificationRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryCountsResponse> counts(
        com.oracle.v1.QueryCountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Data queries content of the data source or oracle script for given SHA256
     * file hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryDataResponse> data(
        com.oracle.v1.QueryDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataSource queries data source summary info for given data source id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryDataSourceResponse> dataSource(
        com.oracle.v1.QueryDataSourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OracleScript queries oracle script summary info for given oracle script id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryOracleScriptResponse> oracleScript(
        com.oracle.v1.QueryOracleScriptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request queries request info for given request id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryRequestResponse> request(
        com.oracle.v1.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PendingRequests queries list of pending request IDs assigned to given
     * validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryPendingRequestsResponse> pendingRequests(
        com.oracle.v1.QueryPendingRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries properties of given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryValidatorResponse> validator(
        com.oracle.v1.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IsReporter queries grant of account on this validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryIsReporterResponse> isReporter(
        com.oracle.v1.QueryIsReporterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsReporterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reporters queries all reporters associated with given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryReportersResponse> reporters(
        com.oracle.v1.QueryReportersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveValidators queries all active oracle validators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryActiveValidatorsResponse> activeValidators(
        com.oracle.v1.QueryActiveValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries parameters used for runnning bandchain network.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryParamsResponse> params(
        com.oracle.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestSearch queries the latest request that match search criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryRequestSearchResponse> requestSearch(
        com.oracle.v1.QueryRequestSearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestPrice queries the latest price on standard price reference oracle
     * script.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryRequestPriceResponse> requestPrice(
        com.oracle.v1.QueryRequestPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestVerification verifies a request to make sure that
     * all information that will be used to report the data is valid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.QueryRequestVerificationResponse> requestVerification(
        com.oracle.v1.QueryRequestVerificationRequest request) {
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
          serviceImpl.counts((com.oracle.v1.QueryCountsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryCountsResponse>) responseObserver);
          break;
        case METHODID_DATA:
          serviceImpl.data((com.oracle.v1.QueryDataRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataResponse>) responseObserver);
          break;
        case METHODID_DATA_SOURCE:
          serviceImpl.dataSource((com.oracle.v1.QueryDataSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryDataSourceResponse>) responseObserver);
          break;
        case METHODID_ORACLE_SCRIPT:
          serviceImpl.oracleScript((com.oracle.v1.QueryOracleScriptRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryOracleScriptResponse>) responseObserver);
          break;
        case METHODID_REQUEST:
          serviceImpl.request((com.oracle.v1.QueryRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestResponse>) responseObserver);
          break;
        case METHODID_PENDING_REQUESTS:
          serviceImpl.pendingRequests((com.oracle.v1.QueryPendingRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryPendingRequestsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR:
          serviceImpl.validator((com.oracle.v1.QueryValidatorRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryValidatorResponse>) responseObserver);
          break;
        case METHODID_IS_REPORTER:
          serviceImpl.isReporter((com.oracle.v1.QueryIsReporterRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryIsReporterResponse>) responseObserver);
          break;
        case METHODID_REPORTERS:
          serviceImpl.reporters((com.oracle.v1.QueryReportersRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryReportersResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_VALIDATORS:
          serviceImpl.activeValidators((com.oracle.v1.QueryActiveValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryActiveValidatorsResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.oracle.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_REQUEST_SEARCH:
          serviceImpl.requestSearch((com.oracle.v1.QueryRequestSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestSearchResponse>) responseObserver);
          break;
        case METHODID_REQUEST_PRICE:
          serviceImpl.requestPrice((com.oracle.v1.QueryRequestPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestPriceResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VERIFICATION:
          serviceImpl.requestVerification((com.oracle.v1.QueryRequestVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.QueryRequestVerificationResponse>) responseObserver);
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
              com.oracle.v1.QueryCountsRequest,
              com.oracle.v1.QueryCountsResponse>(
                service, METHODID_COUNTS)))
        .addMethod(
          getDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryDataRequest,
              com.oracle.v1.QueryDataResponse>(
                service, METHODID_DATA)))
        .addMethod(
          getDataSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryDataSourceRequest,
              com.oracle.v1.QueryDataSourceResponse>(
                service, METHODID_DATA_SOURCE)))
        .addMethod(
          getOracleScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryOracleScriptRequest,
              com.oracle.v1.QueryOracleScriptResponse>(
                service, METHODID_ORACLE_SCRIPT)))
        .addMethod(
          getRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryRequestRequest,
              com.oracle.v1.QueryRequestResponse>(
                service, METHODID_REQUEST)))
        .addMethod(
          getPendingRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryPendingRequestsRequest,
              com.oracle.v1.QueryPendingRequestsResponse>(
                service, METHODID_PENDING_REQUESTS)))
        .addMethod(
          getValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryValidatorRequest,
              com.oracle.v1.QueryValidatorResponse>(
                service, METHODID_VALIDATOR)))
        .addMethod(
          getIsReporterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryIsReporterRequest,
              com.oracle.v1.QueryIsReporterResponse>(
                service, METHODID_IS_REPORTER)))
        .addMethod(
          getReportersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryReportersRequest,
              com.oracle.v1.QueryReportersResponse>(
                service, METHODID_REPORTERS)))
        .addMethod(
          getActiveValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryActiveValidatorsRequest,
              com.oracle.v1.QueryActiveValidatorsResponse>(
                service, METHODID_ACTIVE_VALIDATORS)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryParamsRequest,
              com.oracle.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRequestSearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryRequestSearchRequest,
              com.oracle.v1.QueryRequestSearchResponse>(
                service, METHODID_REQUEST_SEARCH)))
        .addMethod(
          getRequestPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryRequestPriceRequest,
              com.oracle.v1.QueryRequestPriceResponse>(
                service, METHODID_REQUEST_PRICE)))
        .addMethod(
          getRequestVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.QueryRequestVerificationRequest,
              com.oracle.v1.QueryRequestVerificationResponse>(
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
