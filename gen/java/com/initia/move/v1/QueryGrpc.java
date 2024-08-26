package com.initia.move.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: initia/move/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "initia.move.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModuleRequest,
      com.initia.move.v1.QueryProto.QueryModuleResponse> getModuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Module",
      requestType = com.initia.move.v1.QueryProto.QueryModuleRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryModuleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModuleRequest,
      com.initia.move.v1.QueryProto.QueryModuleResponse> getModuleMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModuleRequest, com.initia.move.v1.QueryProto.QueryModuleResponse> getModuleMethod;
    if ((getModuleMethod = QueryGrpc.getModuleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleMethod = QueryGrpc.getModuleMethod) == null) {
          QueryGrpc.getModuleMethod = getModuleMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryModuleRequest, com.initia.move.v1.QueryProto.QueryModuleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Module"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryModuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryModuleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Module"))
              .build();
        }
      }
    }
    return getModuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModulesRequest,
      com.initia.move.v1.QueryProto.QueryModulesResponse> getModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Modules",
      requestType = com.initia.move.v1.QueryProto.QueryModulesRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryModulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModulesRequest,
      com.initia.move.v1.QueryProto.QueryModulesResponse> getModulesMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryModulesRequest, com.initia.move.v1.QueryProto.QueryModulesResponse> getModulesMethod;
    if ((getModulesMethod = QueryGrpc.getModulesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModulesMethod = QueryGrpc.getModulesMethod) == null) {
          QueryGrpc.getModulesMethod = getModulesMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryModulesRequest, com.initia.move.v1.QueryProto.QueryModulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Modules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryModulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Modules"))
              .build();
        }
      }
    }
    return getModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourceRequest,
      com.initia.move.v1.QueryProto.QueryResourceResponse> getResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resource",
      requestType = com.initia.move.v1.QueryProto.QueryResourceRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourceRequest,
      com.initia.move.v1.QueryProto.QueryResourceResponse> getResourceMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourceRequest, com.initia.move.v1.QueryProto.QueryResourceResponse> getResourceMethod;
    if ((getResourceMethod = QueryGrpc.getResourceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourceMethod = QueryGrpc.getResourceMethod) == null) {
          QueryGrpc.getResourceMethod = getResourceMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryResourceRequest, com.initia.move.v1.QueryProto.QueryResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryResourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Resource"))
              .build();
        }
      }
    }
    return getResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourcesRequest,
      com.initia.move.v1.QueryProto.QueryResourcesResponse> getResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resources",
      requestType = com.initia.move.v1.QueryProto.QueryResourcesRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourcesRequest,
      com.initia.move.v1.QueryProto.QueryResourcesResponse> getResourcesMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryResourcesRequest, com.initia.move.v1.QueryProto.QueryResourcesResponse> getResourcesMethod;
    if ((getResourcesMethod = QueryGrpc.getResourcesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourcesMethod = QueryGrpc.getResourcesMethod) == null) {
          QueryGrpc.getResourcesMethod = getResourcesMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryResourcesRequest, com.initia.move.v1.QueryProto.QueryResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Resources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Resources"))
              .build();
        }
      }
    }
    return getResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableInfoRequest,
      com.initia.move.v1.QueryProto.QueryTableInfoResponse> getTableInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableInfo",
      requestType = com.initia.move.v1.QueryProto.QueryTableInfoRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryTableInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableInfoRequest,
      com.initia.move.v1.QueryProto.QueryTableInfoResponse> getTableInfoMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableInfoRequest, com.initia.move.v1.QueryProto.QueryTableInfoResponse> getTableInfoMethod;
    if ((getTableInfoMethod = QueryGrpc.getTableInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTableInfoMethod = QueryGrpc.getTableInfoMethod) == null) {
          QueryGrpc.getTableInfoMethod = getTableInfoMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryTableInfoRequest, com.initia.move.v1.QueryProto.QueryTableInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TableInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TableInfo"))
              .build();
        }
      }
    }
    return getTableInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntryRequest,
      com.initia.move.v1.QueryProto.QueryTableEntryResponse> getTableEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableEntry",
      requestType = com.initia.move.v1.QueryProto.QueryTableEntryRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryTableEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntryRequest,
      com.initia.move.v1.QueryProto.QueryTableEntryResponse> getTableEntryMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntryRequest, com.initia.move.v1.QueryProto.QueryTableEntryResponse> getTableEntryMethod;
    if ((getTableEntryMethod = QueryGrpc.getTableEntryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTableEntryMethod = QueryGrpc.getTableEntryMethod) == null) {
          QueryGrpc.getTableEntryMethod = getTableEntryMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryTableEntryRequest, com.initia.move.v1.QueryProto.QueryTableEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TableEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TableEntry"))
              .build();
        }
      }
    }
    return getTableEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntriesRequest,
      com.initia.move.v1.QueryProto.QueryTableEntriesResponse> getTableEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableEntries",
      requestType = com.initia.move.v1.QueryProto.QueryTableEntriesRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryTableEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntriesRequest,
      com.initia.move.v1.QueryProto.QueryTableEntriesResponse> getTableEntriesMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryTableEntriesRequest, com.initia.move.v1.QueryProto.QueryTableEntriesResponse> getTableEntriesMethod;
    if ((getTableEntriesMethod = QueryGrpc.getTableEntriesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTableEntriesMethod = QueryGrpc.getTableEntriesMethod) == null) {
          QueryGrpc.getTableEntriesMethod = getTableEntriesMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryTableEntriesRequest, com.initia.move.v1.QueryProto.QueryTableEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TableEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryTableEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TableEntries"))
              .build();
        }
      }
    }
    return getTableEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryLegacyViewRequest,
      com.initia.move.v1.QueryProto.QueryLegacyViewResponse> getLegacyViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LegacyView",
      requestType = com.initia.move.v1.QueryProto.QueryLegacyViewRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryLegacyViewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryLegacyViewRequest,
      com.initia.move.v1.QueryProto.QueryLegacyViewResponse> getLegacyViewMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryLegacyViewRequest, com.initia.move.v1.QueryProto.QueryLegacyViewResponse> getLegacyViewMethod;
    if ((getLegacyViewMethod = QueryGrpc.getLegacyViewMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLegacyViewMethod = QueryGrpc.getLegacyViewMethod) == null) {
          QueryGrpc.getLegacyViewMethod = getLegacyViewMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryLegacyViewRequest, com.initia.move.v1.QueryProto.QueryLegacyViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LegacyView"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryLegacyViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryLegacyViewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LegacyView"))
              .build();
        }
      }
    }
    return getLegacyViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewRequest,
      com.initia.move.v1.QueryProto.QueryViewResponse> getViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "View",
      requestType = com.initia.move.v1.QueryProto.QueryViewRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryViewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewRequest,
      com.initia.move.v1.QueryProto.QueryViewResponse> getViewMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewRequest, com.initia.move.v1.QueryProto.QueryViewResponse> getViewMethod;
    if ((getViewMethod = QueryGrpc.getViewMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getViewMethod = QueryGrpc.getViewMethod) == null) {
          QueryGrpc.getViewMethod = getViewMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryViewRequest, com.initia.move.v1.QueryProto.QueryViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "View"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("View"))
              .build();
        }
      }
    }
    return getViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewBatchRequest,
      com.initia.move.v1.QueryProto.QueryViewBatchResponse> getViewBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewBatch",
      requestType = com.initia.move.v1.QueryProto.QueryViewBatchRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryViewBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewBatchRequest,
      com.initia.move.v1.QueryProto.QueryViewBatchResponse> getViewBatchMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewBatchRequest, com.initia.move.v1.QueryProto.QueryViewBatchResponse> getViewBatchMethod;
    if ((getViewBatchMethod = QueryGrpc.getViewBatchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getViewBatchMethod = QueryGrpc.getViewBatchMethod) == null) {
          QueryGrpc.getViewBatchMethod = getViewBatchMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryViewBatchRequest, com.initia.move.v1.QueryProto.QueryViewBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ViewBatch"))
              .build();
        }
      }
    }
    return getViewBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONRequest,
      com.initia.move.v1.QueryProto.QueryViewJSONResponse> getViewJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewJSON",
      requestType = com.initia.move.v1.QueryProto.QueryViewJSONRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryViewJSONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONRequest,
      com.initia.move.v1.QueryProto.QueryViewJSONResponse> getViewJSONMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONRequest, com.initia.move.v1.QueryProto.QueryViewJSONResponse> getViewJSONMethod;
    if ((getViewJSONMethod = QueryGrpc.getViewJSONMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getViewJSONMethod = QueryGrpc.getViewJSONMethod) == null) {
          QueryGrpc.getViewJSONMethod = getViewJSONMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryViewJSONRequest, com.initia.move.v1.QueryProto.QueryViewJSONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewJSONRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewJSONResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ViewJSON"))
              .build();
        }
      }
    }
    return getViewJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest,
      com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> getViewJSONBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewJSONBatch",
      requestType = com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest,
      com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> getViewJSONBatchMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest, com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> getViewJSONBatchMethod;
    if ((getViewJSONBatchMethod = QueryGrpc.getViewJSONBatchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getViewJSONBatchMethod = QueryGrpc.getViewJSONBatchMethod) == null) {
          QueryGrpc.getViewJSONBatchMethod = getViewJSONBatchMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest, com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewJSONBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ViewJSONBatch"))
              .build();
        }
      }
    }
    return getViewJSONBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryScriptABIRequest,
      com.initia.move.v1.QueryProto.QueryScriptABIResponse> getScriptABIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScriptABI",
      requestType = com.initia.move.v1.QueryProto.QueryScriptABIRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryScriptABIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryScriptABIRequest,
      com.initia.move.v1.QueryProto.QueryScriptABIResponse> getScriptABIMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryScriptABIRequest, com.initia.move.v1.QueryProto.QueryScriptABIResponse> getScriptABIMethod;
    if ((getScriptABIMethod = QueryGrpc.getScriptABIMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScriptABIMethod = QueryGrpc.getScriptABIMethod) == null) {
          QueryGrpc.getScriptABIMethod = getScriptABIMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryScriptABIRequest, com.initia.move.v1.QueryProto.QueryScriptABIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScriptABI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryScriptABIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryScriptABIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ScriptABI"))
              .build();
        }
      }
    }
    return getScriptABIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryParamsRequest,
      com.initia.move.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.initia.move.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryParamsRequest,
      com.initia.move.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryParamsRequest, com.initia.move.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryParamsRequest, com.initia.move.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryMetadataRequest,
      com.initia.move.v1.QueryProto.QueryMetadataResponse> getMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Metadata",
      requestType = com.initia.move.v1.QueryProto.QueryMetadataRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryMetadataRequest,
      com.initia.move.v1.QueryProto.QueryMetadataResponse> getMetadataMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryMetadataRequest, com.initia.move.v1.QueryProto.QueryMetadataResponse> getMetadataMethod;
    if ((getMetadataMethod = QueryGrpc.getMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMetadataMethod = QueryGrpc.getMetadataMethod) == null) {
          QueryGrpc.getMetadataMethod = getMetadataMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryMetadataRequest, com.initia.move.v1.QueryProto.QueryMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Metadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Metadata"))
              .build();
        }
      }
    }
    return getMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryDenomRequest,
      com.initia.move.v1.QueryProto.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = com.initia.move.v1.QueryProto.QueryDenomRequest.class,
      responseType = com.initia.move.v1.QueryProto.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryDenomRequest,
      com.initia.move.v1.QueryProto.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.QueryProto.QueryDenomRequest, com.initia.move.v1.QueryProto.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.QueryProto.QueryDenomRequest, com.initia.move.v1.QueryProto.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.QueryProto.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
              .build();
        }
      }
    }
    return getDenomMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Module gets the module info
     * </pre>
     */
    default void module(com.initia.move.v1.QueryProto.QueryModuleRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModuleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Modules gets the module infos
     * </pre>
     */
    default void modules(com.initia.move.v1.QueryProto.QueryModulesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resource gets the module info
     * </pre>
     */
    default void resource(com.initia.move.v1.QueryProto.QueryResourceRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resources gets the module infos
     * </pre>
     */
    default void resources(com.initia.move.v1.QueryProto.QueryResourcesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query table info of the given address
     * </pre>
     */
    default void tableInfo(com.initia.move.v1.QueryProto.QueryTableInfoRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTableInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query table entry of the given key
     * </pre>
     */
    default void tableEntry(com.initia.move.v1.QueryProto.QueryTableEntryRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTableEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query table entries with pagination
     * </pre>
     */
    default void tableEntries(com.initia.move.v1.QueryProto.QueryTableEntriesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTableEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * LegacyView execute view function and return the view result.
     * </pre>
     */
    @java.lang.Deprecated
    default void legacyView(com.initia.move.v1.QueryProto.QueryLegacyViewRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryLegacyViewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLegacyViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * View execute view function and return the view result
     * </pre>
     */
    default void view(com.initia.move.v1.QueryProto.QueryViewRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * ViewBatch execute multiple view functions and return the view results
     * </pre>
     */
    default void viewBatch(com.initia.move.v1.QueryProto.QueryViewBatchRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * ViewJSON execute view function with json arguemtns and return the view result
     * </pre>
     */
    default void viewJSON(com.initia.move.v1.QueryProto.QueryViewJSONRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewJSONMethod(), responseObserver);
    }

    /**
     * <pre>
     * ViewJSONBatch execute multiple view functions with json arguemtns and return the view results
     * </pre>
     */
    default void viewJSONBatch(com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewJSONBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScriptABI decode script bytes into ABI
     * </pre>
     */
    default void scriptABI(com.initia.move.v1.QueryProto.QueryScriptABIRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryScriptABIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScriptABIMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    default void params(com.initia.move.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Metadata converts metadata to denom
     * </pre>
     */
    default void metadata(com.initia.move.v1.QueryProto.QueryMetadataRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denom converts denom to metadata
     * </pre>
     */
    default void denom(com.initia.move.v1.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * Module gets the module info
     * </pre>
     */
    public void module(com.initia.move.v1.QueryProto.QueryModuleRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModuleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Modules gets the module infos
     * </pre>
     */
    public void modules(com.initia.move.v1.QueryProto.QueryModulesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resource gets the module info
     * </pre>
     */
    public void resource(com.initia.move.v1.QueryProto.QueryResourceRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resources gets the module infos
     * </pre>
     */
    public void resources(com.initia.move.v1.QueryProto.QueryResourcesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query table info of the given address
     * </pre>
     */
    public void tableInfo(com.initia.move.v1.QueryProto.QueryTableInfoRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTableInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query table entry of the given key
     * </pre>
     */
    public void tableEntry(com.initia.move.v1.QueryProto.QueryTableEntryRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTableEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query table entries with pagination
     * </pre>
     */
    public void tableEntries(com.initia.move.v1.QueryProto.QueryTableEntriesRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTableEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * LegacyView execute view function and return the view result.
     * </pre>
     */
    @java.lang.Deprecated
    public void legacyView(com.initia.move.v1.QueryProto.QueryLegacyViewRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryLegacyViewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLegacyViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * View execute view function and return the view result
     * </pre>
     */
    public void view(com.initia.move.v1.QueryProto.QueryViewRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * ViewBatch execute multiple view functions and return the view results
     * </pre>
     */
    public void viewBatch(com.initia.move.v1.QueryProto.QueryViewBatchRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ViewJSON execute view function with json arguemtns and return the view result
     * </pre>
     */
    public void viewJSON(com.initia.move.v1.QueryProto.QueryViewJSONRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ViewJSONBatch execute multiple view functions with json arguemtns and return the view results
     * </pre>
     */
    public void viewJSONBatch(com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewJSONBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScriptABI decode script bytes into ABI
     * </pre>
     */
    public void scriptABI(com.initia.move.v1.QueryProto.QueryScriptABIRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryScriptABIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScriptABIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public void params(com.initia.move.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Metadata converts metadata to denom
     * </pre>
     */
    public void metadata(com.initia.move.v1.QueryProto.QueryMetadataRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denom converts denom to metadata
     * </pre>
     */
    public void denom(com.initia.move.v1.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Module gets the module info
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryModuleResponse module(com.initia.move.v1.QueryProto.QueryModuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Modules gets the module infos
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryModulesResponse modules(com.initia.move.v1.QueryProto.QueryModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resource gets the module info
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryResourceResponse resource(com.initia.move.v1.QueryProto.QueryResourceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resources gets the module infos
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryResourcesResponse resources(com.initia.move.v1.QueryProto.QueryResourcesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query table info of the given address
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryTableInfoResponse tableInfo(com.initia.move.v1.QueryProto.QueryTableInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTableInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query table entry of the given key
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryTableEntryResponse tableEntry(com.initia.move.v1.QueryProto.QueryTableEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTableEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query table entries with pagination
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryTableEntriesResponse tableEntries(com.initia.move.v1.QueryProto.QueryTableEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTableEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * LegacyView execute view function and return the view result.
     * </pre>
     */
    @java.lang.Deprecated
    public com.initia.move.v1.QueryProto.QueryLegacyViewResponse legacyView(com.initia.move.v1.QueryProto.QueryLegacyViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLegacyViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * View execute view function and return the view result
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryViewResponse view(com.initia.move.v1.QueryProto.QueryViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * ViewBatch execute multiple view functions and return the view results
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryViewBatchResponse viewBatch(com.initia.move.v1.QueryProto.QueryViewBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ViewJSON execute view function with json arguemtns and return the view result
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryViewJSONResponse viewJSON(com.initia.move.v1.QueryProto.QueryViewJSONRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewJSONMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ViewJSONBatch execute multiple view functions with json arguemtns and return the view results
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse viewJSONBatch(com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewJSONBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScriptABI decode script bytes into ABI
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryScriptABIResponse scriptABI(com.initia.move.v1.QueryProto.QueryScriptABIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScriptABIMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryParamsResponse params(com.initia.move.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Metadata converts metadata to denom
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryMetadataResponse metadata(com.initia.move.v1.QueryProto.QueryMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denom converts denom to metadata
     * </pre>
     */
    public com.initia.move.v1.QueryProto.QueryDenomResponse denom(com.initia.move.v1.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Module gets the module info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryModuleResponse> module(
        com.initia.move.v1.QueryProto.QueryModuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Modules gets the module infos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryModulesResponse> modules(
        com.initia.move.v1.QueryProto.QueryModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resource gets the module info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryResourceResponse> resource(
        com.initia.move.v1.QueryProto.QueryResourceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resources gets the module infos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryResourcesResponse> resources(
        com.initia.move.v1.QueryProto.QueryResourcesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query table info of the given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryTableInfoResponse> tableInfo(
        com.initia.move.v1.QueryProto.QueryTableInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTableInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query table entry of the given key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryTableEntryResponse> tableEntry(
        com.initia.move.v1.QueryProto.QueryTableEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTableEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query table entries with pagination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryTableEntriesResponse> tableEntries(
        com.initia.move.v1.QueryProto.QueryTableEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTableEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * LegacyView execute view function and return the view result.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryLegacyViewResponse> legacyView(
        com.initia.move.v1.QueryProto.QueryLegacyViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLegacyViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * View execute view function and return the view result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryViewResponse> view(
        com.initia.move.v1.QueryProto.QueryViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use Query/ViewJSON or Query/ViewJSONBatch
     * ViewBatch execute multiple view functions and return the view results
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryViewBatchResponse> viewBatch(
        com.initia.move.v1.QueryProto.QueryViewBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ViewJSON execute view function with json arguemtns and return the view result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryViewJSONResponse> viewJSON(
        com.initia.move.v1.QueryProto.QueryViewJSONRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewJSONMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ViewJSONBatch execute multiple view functions with json arguemtns and return the view results
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse> viewJSONBatch(
        com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewJSONBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScriptABI decode script bytes into ABI
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryScriptABIResponse> scriptABI(
        com.initia.move.v1.QueryProto.QueryScriptABIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScriptABIMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryParamsResponse> params(
        com.initia.move.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Metadata converts metadata to denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryMetadataResponse> metadata(
        com.initia.move.v1.QueryProto.QueryMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denom converts denom to metadata
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.QueryProto.QueryDenomResponse> denom(
        com.initia.move.v1.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE = 0;
  private static final int METHODID_MODULES = 1;
  private static final int METHODID_RESOURCE = 2;
  private static final int METHODID_RESOURCES = 3;
  private static final int METHODID_TABLE_INFO = 4;
  private static final int METHODID_TABLE_ENTRY = 5;
  private static final int METHODID_TABLE_ENTRIES = 6;
  private static final int METHODID_LEGACY_VIEW = 7;
  private static final int METHODID_VIEW = 8;
  private static final int METHODID_VIEW_BATCH = 9;
  private static final int METHODID_VIEW_JSON = 10;
  private static final int METHODID_VIEW_JSONBATCH = 11;
  private static final int METHODID_SCRIPT_ABI = 12;
  private static final int METHODID_PARAMS = 13;
  private static final int METHODID_METADATA = 14;
  private static final int METHODID_DENOM = 15;

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
        case METHODID_MODULE:
          serviceImpl.module((com.initia.move.v1.QueryProto.QueryModuleRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModuleResponse>) responseObserver);
          break;
        case METHODID_MODULES:
          serviceImpl.modules((com.initia.move.v1.QueryProto.QueryModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryModulesResponse>) responseObserver);
          break;
        case METHODID_RESOURCE:
          serviceImpl.resource((com.initia.move.v1.QueryProto.QueryResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourceResponse>) responseObserver);
          break;
        case METHODID_RESOURCES:
          serviceImpl.resources((com.initia.move.v1.QueryProto.QueryResourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryResourcesResponse>) responseObserver);
          break;
        case METHODID_TABLE_INFO:
          serviceImpl.tableInfo((com.initia.move.v1.QueryProto.QueryTableInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableInfoResponse>) responseObserver);
          break;
        case METHODID_TABLE_ENTRY:
          serviceImpl.tableEntry((com.initia.move.v1.QueryProto.QueryTableEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntryResponse>) responseObserver);
          break;
        case METHODID_TABLE_ENTRIES:
          serviceImpl.tableEntries((com.initia.move.v1.QueryProto.QueryTableEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryTableEntriesResponse>) responseObserver);
          break;
        case METHODID_LEGACY_VIEW:
          serviceImpl.legacyView((com.initia.move.v1.QueryProto.QueryLegacyViewRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryLegacyViewResponse>) responseObserver);
          break;
        case METHODID_VIEW:
          serviceImpl.view((com.initia.move.v1.QueryProto.QueryViewRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewResponse>) responseObserver);
          break;
        case METHODID_VIEW_BATCH:
          serviceImpl.viewBatch((com.initia.move.v1.QueryProto.QueryViewBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewBatchResponse>) responseObserver);
          break;
        case METHODID_VIEW_JSON:
          serviceImpl.viewJSON((com.initia.move.v1.QueryProto.QueryViewJSONRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONResponse>) responseObserver);
          break;
        case METHODID_VIEW_JSONBATCH:
          serviceImpl.viewJSONBatch((com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse>) responseObserver);
          break;
        case METHODID_SCRIPT_ABI:
          serviceImpl.scriptABI((com.initia.move.v1.QueryProto.QueryScriptABIRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryScriptABIResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.initia.move.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_METADATA:
          serviceImpl.metadata((com.initia.move.v1.QueryProto.QueryMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryMetadataResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((com.initia.move.v1.QueryProto.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.QueryProto.QueryDenomResponse>) responseObserver);
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
          getModuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryModuleRequest,
              com.initia.move.v1.QueryProto.QueryModuleResponse>(
                service, METHODID_MODULE)))
        .addMethod(
          getModulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryModulesRequest,
              com.initia.move.v1.QueryProto.QueryModulesResponse>(
                service, METHODID_MODULES)))
        .addMethod(
          getResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryResourceRequest,
              com.initia.move.v1.QueryProto.QueryResourceResponse>(
                service, METHODID_RESOURCE)))
        .addMethod(
          getResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryResourcesRequest,
              com.initia.move.v1.QueryProto.QueryResourcesResponse>(
                service, METHODID_RESOURCES)))
        .addMethod(
          getTableInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryTableInfoRequest,
              com.initia.move.v1.QueryProto.QueryTableInfoResponse>(
                service, METHODID_TABLE_INFO)))
        .addMethod(
          getTableEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryTableEntryRequest,
              com.initia.move.v1.QueryProto.QueryTableEntryResponse>(
                service, METHODID_TABLE_ENTRY)))
        .addMethod(
          getTableEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryTableEntriesRequest,
              com.initia.move.v1.QueryProto.QueryTableEntriesResponse>(
                service, METHODID_TABLE_ENTRIES)))
        .addMethod(
          getLegacyViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryLegacyViewRequest,
              com.initia.move.v1.QueryProto.QueryLegacyViewResponse>(
                service, METHODID_LEGACY_VIEW)))
        .addMethod(
          getViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryViewRequest,
              com.initia.move.v1.QueryProto.QueryViewResponse>(
                service, METHODID_VIEW)))
        .addMethod(
          getViewBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryViewBatchRequest,
              com.initia.move.v1.QueryProto.QueryViewBatchResponse>(
                service, METHODID_VIEW_BATCH)))
        .addMethod(
          getViewJSONMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryViewJSONRequest,
              com.initia.move.v1.QueryProto.QueryViewJSONResponse>(
                service, METHODID_VIEW_JSON)))
        .addMethod(
          getViewJSONBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryViewJSONBatchRequest,
              com.initia.move.v1.QueryProto.QueryViewJSONBatchResponse>(
                service, METHODID_VIEW_JSONBATCH)))
        .addMethod(
          getScriptABIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryScriptABIRequest,
              com.initia.move.v1.QueryProto.QueryScriptABIResponse>(
                service, METHODID_SCRIPT_ABI)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryParamsRequest,
              com.initia.move.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryMetadataRequest,
              com.initia.move.v1.QueryProto.QueryMetadataResponse>(
                service, METHODID_METADATA)))
        .addMethod(
          getDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.QueryProto.QueryDenomRequest,
              com.initia.move.v1.QueryProto.QueryDenomResponse>(
                service, METHODID_DENOM)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.initia.move.v1.QueryProto.getDescriptor();
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
              .addMethod(getModuleMethod())
              .addMethod(getModulesMethod())
              .addMethod(getResourceMethod())
              .addMethod(getResourcesMethod())
              .addMethod(getTableInfoMethod())
              .addMethod(getTableEntryMethod())
              .addMethod(getTableEntriesMethod())
              .addMethod(getLegacyViewMethod())
              .addMethod(getViewMethod())
              .addMethod(getViewBatchMethod())
              .addMethod(getViewJSONMethod())
              .addMethod(getViewJSONBatchMethod())
              .addMethod(getScriptABIMethod())
              .addMethod(getParamsMethod())
              .addMethod(getMetadataMethod())
              .addMethod(getDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
