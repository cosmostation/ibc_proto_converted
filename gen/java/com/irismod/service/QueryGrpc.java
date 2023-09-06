package com.irismod.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query creates service with iservice as rpc
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: irismod/service/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "irismod.service.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryDefinitionRequest,
      com.irismod.service.QueryProto.QueryDefinitionResponse> getDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Definition",
      requestType = com.irismod.service.QueryProto.QueryDefinitionRequest.class,
      responseType = com.irismod.service.QueryProto.QueryDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryDefinitionRequest,
      com.irismod.service.QueryProto.QueryDefinitionResponse> getDefinitionMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryDefinitionRequest, com.irismod.service.QueryProto.QueryDefinitionResponse> getDefinitionMethod;
    if ((getDefinitionMethod = QueryGrpc.getDefinitionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDefinitionMethod = QueryGrpc.getDefinitionMethod) == null) {
          QueryGrpc.getDefinitionMethod = getDefinitionMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryDefinitionRequest, com.irismod.service.QueryProto.QueryDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Definition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Definition"))
              .build();
        }
      }
    }
    return getDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingRequest,
      com.irismod.service.QueryProto.QueryBindingResponse> getBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Binding",
      requestType = com.irismod.service.QueryProto.QueryBindingRequest.class,
      responseType = com.irismod.service.QueryProto.QueryBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingRequest,
      com.irismod.service.QueryProto.QueryBindingResponse> getBindingMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingRequest, com.irismod.service.QueryProto.QueryBindingResponse> getBindingMethod;
    if ((getBindingMethod = QueryGrpc.getBindingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBindingMethod = QueryGrpc.getBindingMethod) == null) {
          QueryGrpc.getBindingMethod = getBindingMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryBindingRequest, com.irismod.service.QueryProto.QueryBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Binding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Binding"))
              .build();
        }
      }
    }
    return getBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingsRequest,
      com.irismod.service.QueryProto.QueryBindingsResponse> getBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bindings",
      requestType = com.irismod.service.QueryProto.QueryBindingsRequest.class,
      responseType = com.irismod.service.QueryProto.QueryBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingsRequest,
      com.irismod.service.QueryProto.QueryBindingsResponse> getBindingsMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryBindingsRequest, com.irismod.service.QueryProto.QueryBindingsResponse> getBindingsMethod;
    if ((getBindingsMethod = QueryGrpc.getBindingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBindingsMethod = QueryGrpc.getBindingsMethod) == null) {
          QueryGrpc.getBindingsMethod = getBindingsMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryBindingsRequest, com.irismod.service.QueryProto.QueryBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bindings"))
              .build();
        }
      }
    }
    return getBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryWithdrawAddressRequest,
      com.irismod.service.QueryProto.QueryWithdrawAddressResponse> getWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawAddress",
      requestType = com.irismod.service.QueryProto.QueryWithdrawAddressRequest.class,
      responseType = com.irismod.service.QueryProto.QueryWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryWithdrawAddressRequest,
      com.irismod.service.QueryProto.QueryWithdrawAddressResponse> getWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryWithdrawAddressRequest, com.irismod.service.QueryProto.QueryWithdrawAddressResponse> getWithdrawAddressMethod;
    if ((getWithdrawAddressMethod = QueryGrpc.getWithdrawAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawAddressMethod = QueryGrpc.getWithdrawAddressMethod) == null) {
          QueryGrpc.getWithdrawAddressMethod = getWithdrawAddressMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryWithdrawAddressRequest, com.irismod.service.QueryProto.QueryWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryWithdrawAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryWithdrawAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawAddress"))
              .build();
        }
      }
    }
    return getWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestContextRequest,
      com.irismod.service.QueryProto.QueryRequestContextResponse> getRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestContext",
      requestType = com.irismod.service.QueryProto.QueryRequestContextRequest.class,
      responseType = com.irismod.service.QueryProto.QueryRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestContextRequest,
      com.irismod.service.QueryProto.QueryRequestContextResponse> getRequestContextMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestContextRequest, com.irismod.service.QueryProto.QueryRequestContextResponse> getRequestContextMethod;
    if ((getRequestContextMethod = QueryGrpc.getRequestContextMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestContextMethod = QueryGrpc.getRequestContextMethod) == null) {
          QueryGrpc.getRequestContextMethod = getRequestContextMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryRequestContextRequest, com.irismod.service.QueryProto.QueryRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestContext"))
              .build();
        }
      }
    }
    return getRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestRequest,
      com.irismod.service.QueryProto.QueryRequestResponse> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Request",
      requestType = com.irismod.service.QueryProto.QueryRequestRequest.class,
      responseType = com.irismod.service.QueryProto.QueryRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestRequest,
      com.irismod.service.QueryProto.QueryRequestResponse> getRequestMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestRequest, com.irismod.service.QueryProto.QueryRequestResponse> getRequestMethod;
    if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
          QueryGrpc.getRequestMethod = getRequestMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryRequestRequest, com.irismod.service.QueryProto.QueryRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Request"))
              .build();
        }
      }
    }
    return getRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsRequest,
      com.irismod.service.QueryProto.QueryRequestsResponse> getRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Requests",
      requestType = com.irismod.service.QueryProto.QueryRequestsRequest.class,
      responseType = com.irismod.service.QueryProto.QueryRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsRequest,
      com.irismod.service.QueryProto.QueryRequestsResponse> getRequestsMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsRequest, com.irismod.service.QueryProto.QueryRequestsResponse> getRequestsMethod;
    if ((getRequestsMethod = QueryGrpc.getRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestsMethod = QueryGrpc.getRequestsMethod) == null) {
          QueryGrpc.getRequestsMethod = getRequestsMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryRequestsRequest, com.irismod.service.QueryProto.QueryRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Requests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Requests"))
              .build();
        }
      }
    }
    return getRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest,
      com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestsByReqCtx",
      requestType = com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest.class,
      responseType = com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest,
      com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest, com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod;
    if ((getRequestsByReqCtxMethod = QueryGrpc.getRequestsByReqCtxMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestsByReqCtxMethod = QueryGrpc.getRequestsByReqCtxMethod) == null) {
          QueryGrpc.getRequestsByReqCtxMethod = getRequestsByReqCtxMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest, com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestsByReqCtx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestsByReqCtx"))
              .build();
        }
      }
    }
    return getRequestsByReqCtxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponseRequest,
      com.irismod.service.QueryProto.QueryResponseResponse> getResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Response",
      requestType = com.irismod.service.QueryProto.QueryResponseRequest.class,
      responseType = com.irismod.service.QueryProto.QueryResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponseRequest,
      com.irismod.service.QueryProto.QueryResponseResponse> getResponseMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponseRequest, com.irismod.service.QueryProto.QueryResponseResponse> getResponseMethod;
    if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
          QueryGrpc.getResponseMethod = getResponseMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryResponseRequest, com.irismod.service.QueryProto.QueryResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Response"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryResponseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Response"))
              .build();
        }
      }
    }
    return getResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponsesRequest,
      com.irismod.service.QueryProto.QueryResponsesResponse> getResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Responses",
      requestType = com.irismod.service.QueryProto.QueryResponsesRequest.class,
      responseType = com.irismod.service.QueryProto.QueryResponsesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponsesRequest,
      com.irismod.service.QueryProto.QueryResponsesResponse> getResponsesMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryResponsesRequest, com.irismod.service.QueryProto.QueryResponsesResponse> getResponsesMethod;
    if ((getResponsesMethod = QueryGrpc.getResponsesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResponsesMethod = QueryGrpc.getResponsesMethod) == null) {
          QueryGrpc.getResponsesMethod = getResponsesMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryResponsesRequest, com.irismod.service.QueryProto.QueryResponsesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Responses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryResponsesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryResponsesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Responses"))
              .build();
        }
      }
    }
    return getResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryEarnedFeesRequest,
      com.irismod.service.QueryProto.QueryEarnedFeesResponse> getEarnedFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EarnedFees",
      requestType = com.irismod.service.QueryProto.QueryEarnedFeesRequest.class,
      responseType = com.irismod.service.QueryProto.QueryEarnedFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryEarnedFeesRequest,
      com.irismod.service.QueryProto.QueryEarnedFeesResponse> getEarnedFeesMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryEarnedFeesRequest, com.irismod.service.QueryProto.QueryEarnedFeesResponse> getEarnedFeesMethod;
    if ((getEarnedFeesMethod = QueryGrpc.getEarnedFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEarnedFeesMethod = QueryGrpc.getEarnedFeesMethod) == null) {
          QueryGrpc.getEarnedFeesMethod = getEarnedFeesMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryEarnedFeesRequest, com.irismod.service.QueryProto.QueryEarnedFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EarnedFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryEarnedFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryEarnedFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EarnedFees"))
              .build();
        }
      }
    }
    return getEarnedFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QuerySchemaRequest,
      com.irismod.service.QueryProto.QuerySchemaResponse> getSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schema",
      requestType = com.irismod.service.QueryProto.QuerySchemaRequest.class,
      responseType = com.irismod.service.QueryProto.QuerySchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QuerySchemaRequest,
      com.irismod.service.QueryProto.QuerySchemaResponse> getSchemaMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QuerySchemaRequest, com.irismod.service.QueryProto.QuerySchemaResponse> getSchemaMethod;
    if ((getSchemaMethod = QueryGrpc.getSchemaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchemaMethod = QueryGrpc.getSchemaMethod) == null) {
          QueryGrpc.getSchemaMethod = getSchemaMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QuerySchemaRequest, com.irismod.service.QueryProto.QuerySchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QuerySchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QuerySchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schema"))
              .build();
        }
      }
    }
    return getSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryParamsRequest,
      com.irismod.service.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.irismod.service.QueryProto.QueryParamsRequest.class,
      responseType = com.irismod.service.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryParamsRequest,
      com.irismod.service.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.irismod.service.QueryProto.QueryParamsRequest, com.irismod.service.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.irismod.service.QueryProto.QueryParamsRequest, com.irismod.service.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.service.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query creates service with iservice as rpc
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Definition returns service definition
     * </pre>
     */
    default void definition(com.irismod.service.QueryProto.QueryDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    default void binding(com.irismod.service.QueryProto.QueryBindingRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    default void bindings(com.irismod.service.QueryProto.QueryBindingsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    default void withdrawAddress(com.irismod.service.QueryProto.QueryWithdrawAddressRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    default void requestContext(com.irismod.service.QueryProto.QueryRequestContextRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    default void request(com.irismod.service.QueryProto.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    default void requests(com.irismod.service.QueryProto.QueryRequestsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    default void requestsByReqCtx(com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestsByReqCtxMethod(), responseObserver);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    default void response(com.irismod.service.QueryProto.QueryResponseRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    default void responses(com.irismod.service.QueryProto.QueryResponsesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponsesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponsesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    default void earnedFees(com.irismod.service.QueryProto.QueryEarnedFeesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEarnedFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    default void schema(com.irismod.service.QueryProto.QuerySchemaRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QuerySchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    default void params(com.irismod.service.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query creates service with iservice as rpc
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
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public void definition(com.irismod.service.QueryProto.QueryDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public void binding(com.irismod.service.QueryProto.QueryBindingRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public void bindings(com.irismod.service.QueryProto.QueryBindingsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public void withdrawAddress(com.irismod.service.QueryProto.QueryWithdrawAddressRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public void requestContext(com.irismod.service.QueryProto.QueryRequestContextRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public void request(com.irismod.service.QueryProto.QueryRequestRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public void requests(com.irismod.service.QueryProto.QueryRequestsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public void requestsByReqCtx(com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestsByReqCtxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public void response(com.irismod.service.QueryProto.QueryResponseRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public void responses(com.irismod.service.QueryProto.QueryResponsesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponsesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public void earnedFees(com.irismod.service.QueryProto.QueryEarnedFeesRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEarnedFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public void schema(com.irismod.service.QueryProto.QuerySchemaRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QuerySchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public void params(com.irismod.service.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryDefinitionResponse definition(com.irismod.service.QueryProto.QueryDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryBindingResponse binding(com.irismod.service.QueryProto.QueryBindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryBindingsResponse bindings(com.irismod.service.QueryProto.QueryBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryWithdrawAddressResponse withdrawAddress(com.irismod.service.QueryProto.QueryWithdrawAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryRequestContextResponse requestContext(com.irismod.service.QueryProto.QueryRequestContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryRequestResponse request(com.irismod.service.QueryProto.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryRequestsResponse requests(com.irismod.service.QueryProto.QueryRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse requestsByReqCtx(com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestsByReqCtxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryResponseResponse response(com.irismod.service.QueryProto.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryResponsesResponse responses(com.irismod.service.QueryProto.QueryResponsesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponsesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryEarnedFeesResponse earnedFees(com.irismod.service.QueryProto.QueryEarnedFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEarnedFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public com.irismod.service.QueryProto.QuerySchemaResponse schema(com.irismod.service.QueryProto.QuerySchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public com.irismod.service.QueryProto.QueryParamsResponse params(com.irismod.service.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryDefinitionResponse> definition(
        com.irismod.service.QueryProto.QueryDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryBindingResponse> binding(
        com.irismod.service.QueryProto.QueryBindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryBindingsResponse> bindings(
        com.irismod.service.QueryProto.QueryBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryWithdrawAddressResponse> withdrawAddress(
        com.irismod.service.QueryProto.QueryWithdrawAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryRequestContextResponse> requestContext(
        com.irismod.service.QueryProto.QueryRequestContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryRequestResponse> request(
        com.irismod.service.QueryProto.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryRequestsResponse> requests(
        com.irismod.service.QueryProto.QueryRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse> requestsByReqCtx(
        com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestsByReqCtxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryResponseResponse> response(
        com.irismod.service.QueryProto.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryResponsesResponse> responses(
        com.irismod.service.QueryProto.QueryResponsesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponsesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryEarnedFeesResponse> earnedFees(
        com.irismod.service.QueryProto.QueryEarnedFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEarnedFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QuerySchemaResponse> schema(
        com.irismod.service.QueryProto.QuerySchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.service.QueryProto.QueryParamsResponse> params(
        com.irismod.service.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEFINITION = 0;
  private static final int METHODID_BINDING = 1;
  private static final int METHODID_BINDINGS = 2;
  private static final int METHODID_WITHDRAW_ADDRESS = 3;
  private static final int METHODID_REQUEST_CONTEXT = 4;
  private static final int METHODID_REQUEST = 5;
  private static final int METHODID_REQUESTS = 6;
  private static final int METHODID_REQUESTS_BY_REQ_CTX = 7;
  private static final int METHODID_RESPONSE = 8;
  private static final int METHODID_RESPONSES = 9;
  private static final int METHODID_EARNED_FEES = 10;
  private static final int METHODID_SCHEMA = 11;
  private static final int METHODID_PARAMS = 12;

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
        case METHODID_DEFINITION:
          serviceImpl.definition((com.irismod.service.QueryProto.QueryDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryDefinitionResponse>) responseObserver);
          break;
        case METHODID_BINDING:
          serviceImpl.binding((com.irismod.service.QueryProto.QueryBindingRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingResponse>) responseObserver);
          break;
        case METHODID_BINDINGS:
          serviceImpl.bindings((com.irismod.service.QueryProto.QueryBindingsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryBindingsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_ADDRESS:
          serviceImpl.withdrawAddress((com.irismod.service.QueryProto.QueryWithdrawAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_REQUEST_CONTEXT:
          serviceImpl.requestContext((com.irismod.service.QueryProto.QueryRequestContextRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestContextResponse>) responseObserver);
          break;
        case METHODID_REQUEST:
          serviceImpl.request((com.irismod.service.QueryProto.QueryRequestRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestResponse>) responseObserver);
          break;
        case METHODID_REQUESTS:
          serviceImpl.requests((com.irismod.service.QueryProto.QueryRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsResponse>) responseObserver);
          break;
        case METHODID_REQUESTS_BY_REQ_CTX:
          serviceImpl.requestsByReqCtx((com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse>) responseObserver);
          break;
        case METHODID_RESPONSE:
          serviceImpl.response((com.irismod.service.QueryProto.QueryResponseRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponseResponse>) responseObserver);
          break;
        case METHODID_RESPONSES:
          serviceImpl.responses((com.irismod.service.QueryProto.QueryResponsesRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryResponsesResponse>) responseObserver);
          break;
        case METHODID_EARNED_FEES:
          serviceImpl.earnedFees((com.irismod.service.QueryProto.QueryEarnedFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryEarnedFeesResponse>) responseObserver);
          break;
        case METHODID_SCHEMA:
          serviceImpl.schema((com.irismod.service.QueryProto.QuerySchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QuerySchemaResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.irismod.service.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.service.QueryProto.QueryParamsResponse>) responseObserver);
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
          getDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryDefinitionRequest,
              com.irismod.service.QueryProto.QueryDefinitionResponse>(
                service, METHODID_DEFINITION)))
        .addMethod(
          getBindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryBindingRequest,
              com.irismod.service.QueryProto.QueryBindingResponse>(
                service, METHODID_BINDING)))
        .addMethod(
          getBindingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryBindingsRequest,
              com.irismod.service.QueryProto.QueryBindingsResponse>(
                service, METHODID_BINDINGS)))
        .addMethod(
          getWithdrawAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryWithdrawAddressRequest,
              com.irismod.service.QueryProto.QueryWithdrawAddressResponse>(
                service, METHODID_WITHDRAW_ADDRESS)))
        .addMethod(
          getRequestContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryRequestContextRequest,
              com.irismod.service.QueryProto.QueryRequestContextResponse>(
                service, METHODID_REQUEST_CONTEXT)))
        .addMethod(
          getRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryRequestRequest,
              com.irismod.service.QueryProto.QueryRequestResponse>(
                service, METHODID_REQUEST)))
        .addMethod(
          getRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryRequestsRequest,
              com.irismod.service.QueryProto.QueryRequestsResponse>(
                service, METHODID_REQUESTS)))
        .addMethod(
          getRequestsByReqCtxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryRequestsByReqCtxRequest,
              com.irismod.service.QueryProto.QueryRequestsByReqCtxResponse>(
                service, METHODID_REQUESTS_BY_REQ_CTX)))
        .addMethod(
          getResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryResponseRequest,
              com.irismod.service.QueryProto.QueryResponseResponse>(
                service, METHODID_RESPONSE)))
        .addMethod(
          getResponsesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryResponsesRequest,
              com.irismod.service.QueryProto.QueryResponsesResponse>(
                service, METHODID_RESPONSES)))
        .addMethod(
          getEarnedFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryEarnedFeesRequest,
              com.irismod.service.QueryProto.QueryEarnedFeesResponse>(
                service, METHODID_EARNED_FEES)))
        .addMethod(
          getSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QuerySchemaRequest,
              com.irismod.service.QueryProto.QuerySchemaResponse>(
                service, METHODID_SCHEMA)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.service.QueryProto.QueryParamsRequest,
              com.irismod.service.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.service.QueryProto.getDescriptor();
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
              .addMethod(getDefinitionMethod())
              .addMethod(getBindingMethod())
              .addMethod(getBindingsMethod())
              .addMethod(getWithdrawAddressMethod())
              .addMethod(getRequestContextMethod())
              .addMethod(getRequestMethod())
              .addMethod(getRequestsMethod())
              .addMethod(getRequestsByReqCtxMethod())
              .addMethod(getResponseMethod())
              .addMethod(getResponsesMethod())
              .addMethod(getEarnedFeesMethod())
              .addMethod(getSchemaMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
