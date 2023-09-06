package com.provenance.metadata.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the Metadata Query service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/metadata/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.metadata.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.QueryParamsRequest,
      com.provenance.metadata.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.provenance.metadata.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.QueryParamsRequest,
      com.provenance.metadata.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.QueryParamsRequest, com.provenance.metadata.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.QueryParamsRequest, com.provenance.metadata.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeRequest,
      com.provenance.metadata.v1.QueryProto.ScopeResponse> getScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scope",
      requestType = com.provenance.metadata.v1.QueryProto.ScopeRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeRequest,
      com.provenance.metadata.v1.QueryProto.ScopeResponse> getScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeRequest, com.provenance.metadata.v1.QueryProto.ScopeResponse> getScopeMethod;
    if ((getScopeMethod = QueryGrpc.getScopeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScopeMethod = QueryGrpc.getScopeMethod) == null) {
          QueryGrpc.getScopeMethod = getScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ScopeRequest, com.provenance.metadata.v1.QueryProto.ScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Scope"))
              .build();
        }
      }
    }
    return getScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopesAllRequest,
      com.provenance.metadata.v1.QueryProto.ScopesAllResponse> getScopesAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScopesAll",
      requestType = com.provenance.metadata.v1.QueryProto.ScopesAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ScopesAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopesAllRequest,
      com.provenance.metadata.v1.QueryProto.ScopesAllResponse> getScopesAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopesAllRequest, com.provenance.metadata.v1.QueryProto.ScopesAllResponse> getScopesAllMethod;
    if ((getScopesAllMethod = QueryGrpc.getScopesAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScopesAllMethod = QueryGrpc.getScopesAllMethod) == null) {
          QueryGrpc.getScopesAllMethod = getScopesAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ScopesAllRequest, com.provenance.metadata.v1.QueryProto.ScopesAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScopesAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopesAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopesAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ScopesAll"))
              .build();
        }
      }
    }
    return getScopesAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsRequest,
      com.provenance.metadata.v1.QueryProto.SessionsResponse> getSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sessions",
      requestType = com.provenance.metadata.v1.QueryProto.SessionsRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.SessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsRequest,
      com.provenance.metadata.v1.QueryProto.SessionsResponse> getSessionsMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsRequest, com.provenance.metadata.v1.QueryProto.SessionsResponse> getSessionsMethod;
    if ((getSessionsMethod = QueryGrpc.getSessionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSessionsMethod = QueryGrpc.getSessionsMethod) == null) {
          QueryGrpc.getSessionsMethod = getSessionsMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.SessionsRequest, com.provenance.metadata.v1.QueryProto.SessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.SessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.SessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Sessions"))
              .build();
        }
      }
    }
    return getSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsAllRequest,
      com.provenance.metadata.v1.QueryProto.SessionsAllResponse> getSessionsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionsAll",
      requestType = com.provenance.metadata.v1.QueryProto.SessionsAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.SessionsAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsAllRequest,
      com.provenance.metadata.v1.QueryProto.SessionsAllResponse> getSessionsAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.SessionsAllRequest, com.provenance.metadata.v1.QueryProto.SessionsAllResponse> getSessionsAllMethod;
    if ((getSessionsAllMethod = QueryGrpc.getSessionsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSessionsAllMethod = QueryGrpc.getSessionsAllMethod) == null) {
          QueryGrpc.getSessionsAllMethod = getSessionsAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.SessionsAllRequest, com.provenance.metadata.v1.QueryProto.SessionsAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.SessionsAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.SessionsAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SessionsAll"))
              .build();
        }
      }
    }
    return getSessionsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsRequest,
      com.provenance.metadata.v1.QueryProto.RecordsResponse> getRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Records",
      requestType = com.provenance.metadata.v1.QueryProto.RecordsRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.RecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsRequest,
      com.provenance.metadata.v1.QueryProto.RecordsResponse> getRecordsMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsRequest, com.provenance.metadata.v1.QueryProto.RecordsResponse> getRecordsMethod;
    if ((getRecordsMethod = QueryGrpc.getRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordsMethod = QueryGrpc.getRecordsMethod) == null) {
          QueryGrpc.getRecordsMethod = getRecordsMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.RecordsRequest, com.provenance.metadata.v1.QueryProto.RecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Records"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Records"))
              .build();
        }
      }
    }
    return getRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsAllRequest,
      com.provenance.metadata.v1.QueryProto.RecordsAllResponse> getRecordsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordsAll",
      requestType = com.provenance.metadata.v1.QueryProto.RecordsAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.RecordsAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsAllRequest,
      com.provenance.metadata.v1.QueryProto.RecordsAllResponse> getRecordsAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordsAllRequest, com.provenance.metadata.v1.QueryProto.RecordsAllResponse> getRecordsAllMethod;
    if ((getRecordsAllMethod = QueryGrpc.getRecordsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordsAllMethod = QueryGrpc.getRecordsAllMethod) == null) {
          QueryGrpc.getRecordsAllMethod = getRecordsAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.RecordsAllRequest, com.provenance.metadata.v1.QueryProto.RecordsAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordsAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordsAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordsAll"))
              .build();
        }
      }
    }
    return getRecordsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OwnershipRequest,
      com.provenance.metadata.v1.QueryProto.OwnershipResponse> getOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ownership",
      requestType = com.provenance.metadata.v1.QueryProto.OwnershipRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OwnershipRequest,
      com.provenance.metadata.v1.QueryProto.OwnershipResponse> getOwnershipMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OwnershipRequest, com.provenance.metadata.v1.QueryProto.OwnershipResponse> getOwnershipMethod;
    if ((getOwnershipMethod = QueryGrpc.getOwnershipMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnershipMethod = QueryGrpc.getOwnershipMethod) == null) {
          QueryGrpc.getOwnershipMethod = getOwnershipMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OwnershipRequest, com.provenance.metadata.v1.QueryProto.OwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ownership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OwnershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Ownership"))
              .build();
        }
      }
    }
    return getOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest,
      com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> getValueOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValueOwnership",
      requestType = com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest,
      com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> getValueOwnershipMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest, com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> getValueOwnershipMethod;
    if ((getValueOwnershipMethod = QueryGrpc.getValueOwnershipMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValueOwnershipMethod = QueryGrpc.getValueOwnershipMethod) == null) {
          QueryGrpc.getValueOwnershipMethod = getValueOwnershipMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest, com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValueOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValueOwnership"))
              .build();
        }
      }
    }
    return getValueOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> getScopeSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScopeSpecification",
      requestType = com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> getScopeSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest, com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> getScopeSpecificationMethod;
    if ((getScopeSpecificationMethod = QueryGrpc.getScopeSpecificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScopeSpecificationMethod = QueryGrpc.getScopeSpecificationMethod) == null) {
          QueryGrpc.getScopeSpecificationMethod = getScopeSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest, com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScopeSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ScopeSpecification"))
              .build();
        }
      }
    }
    return getScopeSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> getScopeSpecificationsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScopeSpecificationsAll",
      requestType = com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> getScopeSpecificationsAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> getScopeSpecificationsAllMethod;
    if ((getScopeSpecificationsAllMethod = QueryGrpc.getScopeSpecificationsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScopeSpecificationsAllMethod = QueryGrpc.getScopeSpecificationsAllMethod) == null) {
          QueryGrpc.getScopeSpecificationsAllMethod = getScopeSpecificationsAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScopeSpecificationsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ScopeSpecificationsAll"))
              .build();
        }
      }
    }
    return getScopeSpecificationsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> getContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractSpecification",
      requestType = com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> getContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest, com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> getContractSpecificationMethod;
    if ((getContractSpecificationMethod = QueryGrpc.getContractSpecificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractSpecificationMethod = QueryGrpc.getContractSpecificationMethod) == null) {
          QueryGrpc.getContractSpecificationMethod = getContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest, com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractSpecification"))
              .build();
        }
      }
    }
    return getContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> getContractSpecificationsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractSpecificationsAll",
      requestType = com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> getContractSpecificationsAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> getContractSpecificationsAllMethod;
    if ((getContractSpecificationsAllMethod = QueryGrpc.getContractSpecificationsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractSpecificationsAllMethod = QueryGrpc.getContractSpecificationsAllMethod) == null) {
          QueryGrpc.getContractSpecificationsAllMethod = getContractSpecificationsAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractSpecificationsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractSpecificationsAll"))
              .build();
        }
      }
    }
    return getContractSpecificationsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> getRecordSpecificationsForContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordSpecificationsForContractSpecification",
      requestType = com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> getRecordSpecificationsForContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> getRecordSpecificationsForContractSpecificationMethod;
    if ((getRecordSpecificationsForContractSpecificationMethod = QueryGrpc.getRecordSpecificationsForContractSpecificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordSpecificationsForContractSpecificationMethod = QueryGrpc.getRecordSpecificationsForContractSpecificationMethod) == null) {
          QueryGrpc.getRecordSpecificationsForContractSpecificationMethod = getRecordSpecificationsForContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordSpecificationsForContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordSpecificationsForContractSpecification"))
              .build();
        }
      }
    }
    return getRecordSpecificationsForContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> getRecordSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordSpecification",
      requestType = com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> getRecordSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> getRecordSpecificationMethod;
    if ((getRecordSpecificationMethod = QueryGrpc.getRecordSpecificationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordSpecificationMethod = QueryGrpc.getRecordSpecificationMethod) == null) {
          QueryGrpc.getRecordSpecificationMethod = getRecordSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordSpecification"))
              .build();
        }
      }
    }
    return getRecordSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> getRecordSpecificationsAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordSpecificationsAll",
      requestType = com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest,
      com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> getRecordSpecificationsAllMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> getRecordSpecificationsAllMethod;
    if ((getRecordSpecificationsAllMethod = QueryGrpc.getRecordSpecificationsAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordSpecificationsAllMethod = QueryGrpc.getRecordSpecificationsAllMethod) == null) {
          QueryGrpc.getRecordSpecificationsAllMethod = getRecordSpecificationsAllMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest, com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordSpecificationsAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordSpecificationsAll"))
              .build();
        }
      }
    }
    return getRecordSpecificationsAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> getOSLocatorParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OSLocatorParams",
      requestType = com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> getOSLocatorParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest, com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> getOSLocatorParamsMethod;
    if ((getOSLocatorParamsMethod = QueryGrpc.getOSLocatorParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOSLocatorParamsMethod = QueryGrpc.getOSLocatorParamsMethod) == null) {
          QueryGrpc.getOSLocatorParamsMethod = getOSLocatorParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest, com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OSLocatorParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OSLocatorParams"))
              .build();
        }
      }
    }
    return getOSLocatorParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorResponse> getOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OSLocator",
      requestType = com.provenance.metadata.v1.QueryProto.OSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorResponse> getOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorRequest, com.provenance.metadata.v1.QueryProto.OSLocatorResponse> getOSLocatorMethod;
    if ((getOSLocatorMethod = QueryGrpc.getOSLocatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOSLocatorMethod = QueryGrpc.getOSLocatorMethod) == null) {
          QueryGrpc.getOSLocatorMethod = getOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OSLocatorRequest, com.provenance.metadata.v1.QueryProto.OSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OSLocator"))
              .build();
        }
      }
    }
    return getOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> getOSLocatorsByURIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OSLocatorsByURI",
      requestType = com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> getOSLocatorsByURIMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest, com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> getOSLocatorsByURIMethod;
    if ((getOSLocatorsByURIMethod = QueryGrpc.getOSLocatorsByURIMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOSLocatorsByURIMethod = QueryGrpc.getOSLocatorsByURIMethod) == null) {
          QueryGrpc.getOSLocatorsByURIMethod = getOSLocatorsByURIMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest, com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OSLocatorsByURI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OSLocatorsByURI"))
              .build();
        }
      }
    }
    return getOSLocatorsByURIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> getOSLocatorsByScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OSLocatorsByScope",
      requestType = com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest,
      com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> getOSLocatorsByScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest, com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> getOSLocatorsByScopeMethod;
    if ((getOSLocatorsByScopeMethod = QueryGrpc.getOSLocatorsByScopeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOSLocatorsByScopeMethod = QueryGrpc.getOSLocatorsByScopeMethod) == null) {
          QueryGrpc.getOSLocatorsByScopeMethod = getOSLocatorsByScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest, com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OSLocatorsByScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OSLocatorsByScope"))
              .build();
        }
      }
    }
    return getOSLocatorsByScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest,
      com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> getOSAllLocatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OSAllLocators",
      requestType = com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest,
      com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> getOSAllLocatorsMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest, com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> getOSAllLocatorsMethod;
    if ((getOSAllLocatorsMethod = QueryGrpc.getOSAllLocatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOSAllLocatorsMethod = QueryGrpc.getOSAllLocatorsMethod) == null) {
          QueryGrpc.getOSAllLocatorsMethod = getOSAllLocatorsMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest, com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OSAllLocators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OSAllLocators"))
              .build();
        }
      }
    }
    return getOSAllLocatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.AccountDataRequest,
      com.provenance.metadata.v1.QueryProto.AccountDataResponse> getAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountData",
      requestType = com.provenance.metadata.v1.QueryProto.AccountDataRequest.class,
      responseType = com.provenance.metadata.v1.QueryProto.AccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.AccountDataRequest,
      com.provenance.metadata.v1.QueryProto.AccountDataResponse> getAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.QueryProto.AccountDataRequest, com.provenance.metadata.v1.QueryProto.AccountDataResponse> getAccountDataMethod;
    if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
          QueryGrpc.getAccountDataMethod = getAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.QueryProto.AccountDataRequest, com.provenance.metadata.v1.QueryProto.AccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.AccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.QueryProto.AccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountData"))
              .build();
        }
      }
    }
    return getAccountDataMethod;
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
   * Query defines the Metadata Query service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries the parameters of x/metadata module.
     * </pre>
     */
    default void params(com.provenance.metadata.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Scope searches for a scope.
     * The scope id, if provided, must either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address,
     * e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. The session addr, if provided, must be a bech32 session address,
     * e.g. session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, that scope is returned.
     * * If only a session_addr is provided, the scope containing that session is returned.
     * * If only a record_addr is provided, the scope containing that record is returned.
     * * If more than one of scope_id, session_addr, and record_addr are provided, and they don't refer to the same scope,
     * a bad request is returned.
     * Providing a session addr or record addr does not limit the sessions and records returned (if requested).
     * Those parameters are only used to find the scope.
     * By default, sessions and records are not included.
     * Set include_sessions and/or include_records to true to include sessions and/or records.
     * </pre>
     */
    default void scope(com.provenance.metadata.v1.QueryProto.ScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScopesAll retrieves all scopes.
     * </pre>
     */
    default void scopesAll(com.provenance.metadata.v1.QueryProto.ScopesAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopesAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScopesAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sessions searches for sessions.
     * The scope_id can either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g.
     * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly, the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, all sessions in that scope are returned.
     * * If only a session_id is provided, it must be an address, and that single session is returned.
     * * If the session_id is a uuid, then either a scope_id or record_addr must also be provided, and that single session
     * is returned.
     * * If only a record_addr is provided, the session containing that record will be returned.
     * * If a record_name is provided then either a scope_id, session_id as an address, or record_addr must also be
     * provided, and the session containing that record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and is provided without a scope_id or record_addr.
     * * A record_name is provided without any way to identify the scope (e.g. a scope_id, a session_id as an address, or
     * a record_addr).
     * * Two or more of scope_id, session_id as an address, and record_addr are provided and don't all refer to the same
     * scope.
     * * A record_addr (or scope_id and record_name) is provided with a session_id and that session does not contain such
     * a record.
     * * A record_addr and record_name are both provided, but reference different records.
     * By default, the scope and records are not included.
     * Set include_scope and/or include_records to true to include the scope and/or records.
     * </pre>
     */
    default void sessions(com.provenance.metadata.v1.QueryProto.SessionsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SessionsAll retrieves all sessions.
     * </pre>
     */
    default void sessionsAll(com.provenance.metadata.v1.QueryProto.SessionsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Records searches for records.
     * The record_addr, if provided, must be a bech32 record address, e.g.
     * record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3. The scope-id can either be scope uuid, e.g.
     * 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly,
     * the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The name is the name of the record you're
     * interested in.
     * * If only a record_addr is provided, that single record will be returned.
     * * If only a scope_id is provided, all records in that scope will be returned.
     * * If only a session_id (or scope_id/session_id), all records in that session will be returned.
     * * If a name is provided with a scope_id and/or session_id, that single record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and no scope_id is provided.
     * * There are two or more of record_addr, session_id, and scope_id, and they don't all refer to the same scope.
     * * A name is provided, but not a scope_id and/or a session_id.
     * * A name and record_addr are provided and the name doesn't match the record_addr.
     * By default, the scope and sessions are not included.
     * Set include_scope and/or include_sessions to true to include the scope and/or sessions.
     * </pre>
     */
    default void records(com.provenance.metadata.v1.QueryProto.RecordsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordsAll retrieves all records.
     * </pre>
     */
    default void recordsAll(com.provenance.metadata.v1.QueryProto.RecordsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ownership returns the scope identifiers that list the given address as either a data or value owner.
     * </pre>
     */
    default void ownership(com.provenance.metadata.v1.QueryProto.OwnershipRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValueOwnership returns the scope identifiers that list the given address as the value owner.
     * </pre>
     */
    default void valueOwnership(com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValueOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScopeSpecification returns a scope specification for the given specification id.
     * The specification_id can either be a uuid, e.g. dc83ea70-eacd-40fe-9adf-1cf6148bf8a2 or a bech32 scope
     * specification address, e.g. scopespec1qnwg86nsatx5pl56muw0v9ytlz3qu3jx6m.
     * By default, the contract and record specifications are not included.
     * Set include_contract_specs and/or include_record_specs to true to include contract and/or record specifications.
     * </pre>
     */
    default void scopeSpecification(com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScopeSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScopeSpecificationsAll retrieves all scope specifications.
     * </pre>
     */
    default void scopeSpecificationsAll(com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScopeSpecificationsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractSpecification returns a contract specification for the given specification id.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is looked up.
     * By default, the record specifications for this contract specification are not included.
     * Set include_record_specs to true to include them in the result.
     * </pre>
     */
    default void contractSpecification(com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractSpecificationsAll retrieves all contract specifications.
     * </pre>
     */
    default void contractSpecificationsAll(com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractSpecificationsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordSpecificationsForContractSpecification returns the record specifications for the given input.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is used.
     * </pre>
     */
    default void recordSpecificationsForContractSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSpecificationsForContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordSpecification returns a record specification for the given input.
     * </pre>
     */
    default void recordSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecordSpecificationsAll retrieves all record specifications.
     * </pre>
     */
    default void recordSpecificationsAll(com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSpecificationsAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * OSLocatorParams returns all parameters for the object store locator sub module.
     * </pre>
     */
    default void oSLocatorParams(com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOSLocatorParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OSLocator returns an ObjectStoreLocator by its owner's address.
     * </pre>
     */
    default void oSLocator(com.provenance.metadata.v1.QueryProto.OSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * OSLocatorsByURI returns all ObjectStoreLocator entries for a locator uri.
     * </pre>
     */
    default void oSLocatorsByURI(com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOSLocatorsByURIMethod(), responseObserver);
    }

    /**
     * <pre>
     * OSLocatorsByScope returns all ObjectStoreLocator entries for a for all signer's present in the specified scope.
     * </pre>
     */
    default void oSLocatorsByScope(com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOSLocatorsByScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * OSAllLocators returns all ObjectStoreLocator entries.
     * </pre>
     */
    default void oSAllLocators(com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOSAllLocatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountData gets the account data associated with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    default void accountData(com.provenance.metadata.v1.QueryProto.AccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.AccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the Metadata Query service.
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
   * Query defines the Metadata Query service.
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
     * Params queries the parameters of x/metadata module.
     * </pre>
     */
    public void params(com.provenance.metadata.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Scope searches for a scope.
     * The scope id, if provided, must either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address,
     * e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. The session addr, if provided, must be a bech32 session address,
     * e.g. session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, that scope is returned.
     * * If only a session_addr is provided, the scope containing that session is returned.
     * * If only a record_addr is provided, the scope containing that record is returned.
     * * If more than one of scope_id, session_addr, and record_addr are provided, and they don't refer to the same scope,
     * a bad request is returned.
     * Providing a session addr or record addr does not limit the sessions and records returned (if requested).
     * Those parameters are only used to find the scope.
     * By default, sessions and records are not included.
     * Set include_sessions and/or include_records to true to include sessions and/or records.
     * </pre>
     */
    public void scope(com.provenance.metadata.v1.QueryProto.ScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScopesAll retrieves all scopes.
     * </pre>
     */
    public void scopesAll(com.provenance.metadata.v1.QueryProto.ScopesAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopesAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScopesAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sessions searches for sessions.
     * The scope_id can either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g.
     * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly, the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, all sessions in that scope are returned.
     * * If only a session_id is provided, it must be an address, and that single session is returned.
     * * If the session_id is a uuid, then either a scope_id or record_addr must also be provided, and that single session
     * is returned.
     * * If only a record_addr is provided, the session containing that record will be returned.
     * * If a record_name is provided then either a scope_id, session_id as an address, or record_addr must also be
     * provided, and the session containing that record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and is provided without a scope_id or record_addr.
     * * A record_name is provided without any way to identify the scope (e.g. a scope_id, a session_id as an address, or
     * a record_addr).
     * * Two or more of scope_id, session_id as an address, and record_addr are provided and don't all refer to the same
     * scope.
     * * A record_addr (or scope_id and record_name) is provided with a session_id and that session does not contain such
     * a record.
     * * A record_addr and record_name are both provided, but reference different records.
     * By default, the scope and records are not included.
     * Set include_scope and/or include_records to true to include the scope and/or records.
     * </pre>
     */
    public void sessions(com.provenance.metadata.v1.QueryProto.SessionsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SessionsAll retrieves all sessions.
     * </pre>
     */
    public void sessionsAll(com.provenance.metadata.v1.QueryProto.SessionsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Records searches for records.
     * The record_addr, if provided, must be a bech32 record address, e.g.
     * record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3. The scope-id can either be scope uuid, e.g.
     * 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly,
     * the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The name is the name of the record you're
     * interested in.
     * * If only a record_addr is provided, that single record will be returned.
     * * If only a scope_id is provided, all records in that scope will be returned.
     * * If only a session_id (or scope_id/session_id), all records in that session will be returned.
     * * If a name is provided with a scope_id and/or session_id, that single record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and no scope_id is provided.
     * * There are two or more of record_addr, session_id, and scope_id, and they don't all refer to the same scope.
     * * A name is provided, but not a scope_id and/or a session_id.
     * * A name and record_addr are provided and the name doesn't match the record_addr.
     * By default, the scope and sessions are not included.
     * Set include_scope and/or include_sessions to true to include the scope and/or sessions.
     * </pre>
     */
    public void records(com.provenance.metadata.v1.QueryProto.RecordsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordsAll retrieves all records.
     * </pre>
     */
    public void recordsAll(com.provenance.metadata.v1.QueryProto.RecordsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ownership returns the scope identifiers that list the given address as either a data or value owner.
     * </pre>
     */
    public void ownership(com.provenance.metadata.v1.QueryProto.OwnershipRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValueOwnership returns the scope identifiers that list the given address as the value owner.
     * </pre>
     */
    public void valueOwnership(com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValueOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScopeSpecification returns a scope specification for the given specification id.
     * The specification_id can either be a uuid, e.g. dc83ea70-eacd-40fe-9adf-1cf6148bf8a2 or a bech32 scope
     * specification address, e.g. scopespec1qnwg86nsatx5pl56muw0v9ytlz3qu3jx6m.
     * By default, the contract and record specifications are not included.
     * Set include_contract_specs and/or include_record_specs to true to include contract and/or record specifications.
     * </pre>
     */
    public void scopeSpecification(com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScopeSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScopeSpecificationsAll retrieves all scope specifications.
     * </pre>
     */
    public void scopeSpecificationsAll(com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScopeSpecificationsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractSpecification returns a contract specification for the given specification id.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is looked up.
     * By default, the record specifications for this contract specification are not included.
     * Set include_record_specs to true to include them in the result.
     * </pre>
     */
    public void contractSpecification(com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractSpecificationsAll retrieves all contract specifications.
     * </pre>
     */
    public void contractSpecificationsAll(com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractSpecificationsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordSpecificationsForContractSpecification returns the record specifications for the given input.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is used.
     * </pre>
     */
    public void recordSpecificationsForContractSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSpecificationsForContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordSpecification returns a record specification for the given input.
     * </pre>
     */
    public void recordSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecordSpecificationsAll retrieves all record specifications.
     * </pre>
     */
    public void recordSpecificationsAll(com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSpecificationsAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OSLocatorParams returns all parameters for the object store locator sub module.
     * </pre>
     */
    public void oSLocatorParams(com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOSLocatorParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OSLocator returns an ObjectStoreLocator by its owner's address.
     * </pre>
     */
    public void oSLocator(com.provenance.metadata.v1.QueryProto.OSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OSLocatorsByURI returns all ObjectStoreLocator entries for a locator uri.
     * </pre>
     */
    public void oSLocatorsByURI(com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOSLocatorsByURIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OSLocatorsByScope returns all ObjectStoreLocator entries for a for all signer's present in the specified scope.
     * </pre>
     */
    public void oSLocatorsByScope(com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOSLocatorsByScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OSAllLocators returns all ObjectStoreLocator entries.
     * </pre>
     */
    public void oSAllLocators(com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOSAllLocatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountData gets the account data associated with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public void accountData(com.provenance.metadata.v1.QueryProto.AccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.AccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the Metadata Query service.
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
     * Params queries the parameters of x/metadata module.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.QueryParamsResponse params(com.provenance.metadata.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Scope searches for a scope.
     * The scope id, if provided, must either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address,
     * e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. The session addr, if provided, must be a bech32 session address,
     * e.g. session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, that scope is returned.
     * * If only a session_addr is provided, the scope containing that session is returned.
     * * If only a record_addr is provided, the scope containing that record is returned.
     * * If more than one of scope_id, session_addr, and record_addr are provided, and they don't refer to the same scope,
     * a bad request is returned.
     * Providing a session addr or record addr does not limit the sessions and records returned (if requested).
     * Those parameters are only used to find the scope.
     * By default, sessions and records are not included.
     * Set include_sessions and/or include_records to true to include sessions and/or records.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ScopeResponse scope(com.provenance.metadata.v1.QueryProto.ScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScopesAll retrieves all scopes.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ScopesAllResponse scopesAll(com.provenance.metadata.v1.QueryProto.ScopesAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScopesAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sessions searches for sessions.
     * The scope_id can either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g.
     * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly, the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, all sessions in that scope are returned.
     * * If only a session_id is provided, it must be an address, and that single session is returned.
     * * If the session_id is a uuid, then either a scope_id or record_addr must also be provided, and that single session
     * is returned.
     * * If only a record_addr is provided, the session containing that record will be returned.
     * * If a record_name is provided then either a scope_id, session_id as an address, or record_addr must also be
     * provided, and the session containing that record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and is provided without a scope_id or record_addr.
     * * A record_name is provided without any way to identify the scope (e.g. a scope_id, a session_id as an address, or
     * a record_addr).
     * * Two or more of scope_id, session_id as an address, and record_addr are provided and don't all refer to the same
     * scope.
     * * A record_addr (or scope_id and record_name) is provided with a session_id and that session does not contain such
     * a record.
     * * A record_addr and record_name are both provided, but reference different records.
     * By default, the scope and records are not included.
     * Set include_scope and/or include_records to true to include the scope and/or records.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.SessionsResponse sessions(com.provenance.metadata.v1.QueryProto.SessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SessionsAll retrieves all sessions.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.SessionsAllResponse sessionsAll(com.provenance.metadata.v1.QueryProto.SessionsAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Records searches for records.
     * The record_addr, if provided, must be a bech32 record address, e.g.
     * record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3. The scope-id can either be scope uuid, e.g.
     * 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly,
     * the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The name is the name of the record you're
     * interested in.
     * * If only a record_addr is provided, that single record will be returned.
     * * If only a scope_id is provided, all records in that scope will be returned.
     * * If only a session_id (or scope_id/session_id), all records in that session will be returned.
     * * If a name is provided with a scope_id and/or session_id, that single record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and no scope_id is provided.
     * * There are two or more of record_addr, session_id, and scope_id, and they don't all refer to the same scope.
     * * A name is provided, but not a scope_id and/or a session_id.
     * * A name and record_addr are provided and the name doesn't match the record_addr.
     * By default, the scope and sessions are not included.
     * Set include_scope and/or include_sessions to true to include the scope and/or sessions.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.RecordsResponse records(com.provenance.metadata.v1.QueryProto.RecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordsAll retrieves all records.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.RecordsAllResponse recordsAll(com.provenance.metadata.v1.QueryProto.RecordsAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ownership returns the scope identifiers that list the given address as either a data or value owner.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OwnershipResponse ownership(com.provenance.metadata.v1.QueryProto.OwnershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValueOwnership returns the scope identifiers that list the given address as the value owner.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse valueOwnership(com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValueOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScopeSpecification returns a scope specification for the given specification id.
     * The specification_id can either be a uuid, e.g. dc83ea70-eacd-40fe-9adf-1cf6148bf8a2 or a bech32 scope
     * specification address, e.g. scopespec1qnwg86nsatx5pl56muw0v9ytlz3qu3jx6m.
     * By default, the contract and record specifications are not included.
     * Set include_contract_specs and/or include_record_specs to true to include contract and/or record specifications.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse scopeSpecification(com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScopeSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScopeSpecificationsAll retrieves all scope specifications.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse scopeSpecificationsAll(com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScopeSpecificationsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractSpecification returns a contract specification for the given specification id.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is looked up.
     * By default, the record specifications for this contract specification are not included.
     * Set include_record_specs to true to include them in the result.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse contractSpecification(com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractSpecificationsAll retrieves all contract specifications.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse contractSpecificationsAll(com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractSpecificationsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordSpecificationsForContractSpecification returns the record specifications for the given input.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is used.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse recordSpecificationsForContractSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSpecificationsForContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordSpecification returns a record specification for the given input.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse recordSpecification(com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecordSpecificationsAll retrieves all record specifications.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse recordSpecificationsAll(com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSpecificationsAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OSLocatorParams returns all parameters for the object store locator sub module.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse oSLocatorParams(com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOSLocatorParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OSLocator returns an ObjectStoreLocator by its owner's address.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OSLocatorResponse oSLocator(com.provenance.metadata.v1.QueryProto.OSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OSLocatorsByURI returns all ObjectStoreLocator entries for a locator uri.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse oSLocatorsByURI(com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOSLocatorsByURIMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OSLocatorsByScope returns all ObjectStoreLocator entries for a for all signer's present in the specified scope.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse oSLocatorsByScope(com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOSLocatorsByScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OSAllLocators returns all ObjectStoreLocator entries.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse oSAllLocators(com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOSAllLocatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountData gets the account data associated with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.provenance.metadata.v1.QueryProto.AccountDataResponse accountData(com.provenance.metadata.v1.QueryProto.AccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the Metadata Query service.
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
     * Params queries the parameters of x/metadata module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.QueryParamsResponse> params(
        com.provenance.metadata.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Scope searches for a scope.
     * The scope id, if provided, must either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address,
     * e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. The session addr, if provided, must be a bech32 session address,
     * e.g. session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, that scope is returned.
     * * If only a session_addr is provided, the scope containing that session is returned.
     * * If only a record_addr is provided, the scope containing that record is returned.
     * * If more than one of scope_id, session_addr, and record_addr are provided, and they don't refer to the same scope,
     * a bad request is returned.
     * Providing a session addr or record addr does not limit the sessions and records returned (if requested).
     * Those parameters are only used to find the scope.
     * By default, sessions and records are not included.
     * Set include_sessions and/or include_records to true to include sessions and/or records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ScopeResponse> scope(
        com.provenance.metadata.v1.QueryProto.ScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScopesAll retrieves all scopes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ScopesAllResponse> scopesAll(
        com.provenance.metadata.v1.QueryProto.ScopesAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScopesAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sessions searches for sessions.
     * The scope_id can either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g.
     * scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly, the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
     * bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
     * * If only a scope_id is provided, all sessions in that scope are returned.
     * * If only a session_id is provided, it must be an address, and that single session is returned.
     * * If the session_id is a uuid, then either a scope_id or record_addr must also be provided, and that single session
     * is returned.
     * * If only a record_addr is provided, the session containing that record will be returned.
     * * If a record_name is provided then either a scope_id, session_id as an address, or record_addr must also be
     * provided, and the session containing that record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and is provided without a scope_id or record_addr.
     * * A record_name is provided without any way to identify the scope (e.g. a scope_id, a session_id as an address, or
     * a record_addr).
     * * Two or more of scope_id, session_id as an address, and record_addr are provided and don't all refer to the same
     * scope.
     * * A record_addr (or scope_id and record_name) is provided with a session_id and that session does not contain such
     * a record.
     * * A record_addr and record_name are both provided, but reference different records.
     * By default, the scope and records are not included.
     * Set include_scope and/or include_records to true to include the scope and/or records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.SessionsResponse> sessions(
        com.provenance.metadata.v1.QueryProto.SessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SessionsAll retrieves all sessions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.SessionsAllResponse> sessionsAll(
        com.provenance.metadata.v1.QueryProto.SessionsAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Records searches for records.
     * The record_addr, if provided, must be a bech32 record address, e.g.
     * record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3. The scope-id can either be scope uuid, e.g.
     * 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly,
     * the session_id can either be a uuid or session address, e.g.
     * session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The name is the name of the record you're
     * interested in.
     * * If only a record_addr is provided, that single record will be returned.
     * * If only a scope_id is provided, all records in that scope will be returned.
     * * If only a session_id (or scope_id/session_id), all records in that session will be returned.
     * * If a name is provided with a scope_id and/or session_id, that single record will be returned.
     * A bad request is returned if:
     * * The session_id is a uuid and no scope_id is provided.
     * * There are two or more of record_addr, session_id, and scope_id, and they don't all refer to the same scope.
     * * A name is provided, but not a scope_id and/or a session_id.
     * * A name and record_addr are provided and the name doesn't match the record_addr.
     * By default, the scope and sessions are not included.
     * Set include_scope and/or include_sessions to true to include the scope and/or sessions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.RecordsResponse> records(
        com.provenance.metadata.v1.QueryProto.RecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordsAll retrieves all records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.RecordsAllResponse> recordsAll(
        com.provenance.metadata.v1.QueryProto.RecordsAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ownership returns the scope identifiers that list the given address as either a data or value owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OwnershipResponse> ownership(
        com.provenance.metadata.v1.QueryProto.OwnershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValueOwnership returns the scope identifiers that list the given address as the value owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse> valueOwnership(
        com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValueOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScopeSpecification returns a scope specification for the given specification id.
     * The specification_id can either be a uuid, e.g. dc83ea70-eacd-40fe-9adf-1cf6148bf8a2 or a bech32 scope
     * specification address, e.g. scopespec1qnwg86nsatx5pl56muw0v9ytlz3qu3jx6m.
     * By default, the contract and record specifications are not included.
     * Set include_contract_specs and/or include_record_specs to true to include contract and/or record specifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse> scopeSpecification(
        com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScopeSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScopeSpecificationsAll retrieves all scope specifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse> scopeSpecificationsAll(
        com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScopeSpecificationsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractSpecification returns a contract specification for the given specification id.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is looked up.
     * By default, the record specifications for this contract specification are not included.
     * Set include_record_specs to true to include them in the result.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse> contractSpecification(
        com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractSpecificationsAll retrieves all contract specifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse> contractSpecificationsAll(
        com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractSpecificationsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordSpecificationsForContractSpecification returns the record specifications for the given input.
     * The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
     * specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
     * address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
     * address, then the contract specification that contains that record specification is used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse> recordSpecificationsForContractSpecification(
        com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSpecificationsForContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordSpecification returns a record specification for the given input.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse> recordSpecification(
        com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecordSpecificationsAll retrieves all record specifications.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse> recordSpecificationsAll(
        com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSpecificationsAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OSLocatorParams returns all parameters for the object store locator sub module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse> oSLocatorParams(
        com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOSLocatorParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OSLocator returns an ObjectStoreLocator by its owner's address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OSLocatorResponse> oSLocator(
        com.provenance.metadata.v1.QueryProto.OSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OSLocatorsByURI returns all ObjectStoreLocator entries for a locator uri.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse> oSLocatorsByURI(
        com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOSLocatorsByURIMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OSLocatorsByScope returns all ObjectStoreLocator entries for a for all signer's present in the specified scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse> oSLocatorsByScope(
        com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOSLocatorsByScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OSAllLocators returns all ObjectStoreLocator entries.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse> oSAllLocators(
        com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOSAllLocatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountData gets the account data associated with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.QueryProto.AccountDataResponse> accountData(
        com.provenance.metadata.v1.QueryProto.AccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SCOPE = 1;
  private static final int METHODID_SCOPES_ALL = 2;
  private static final int METHODID_SESSIONS = 3;
  private static final int METHODID_SESSIONS_ALL = 4;
  private static final int METHODID_RECORDS = 5;
  private static final int METHODID_RECORDS_ALL = 6;
  private static final int METHODID_OWNERSHIP = 7;
  private static final int METHODID_VALUE_OWNERSHIP = 8;
  private static final int METHODID_SCOPE_SPECIFICATION = 9;
  private static final int METHODID_SCOPE_SPECIFICATIONS_ALL = 10;
  private static final int METHODID_CONTRACT_SPECIFICATION = 11;
  private static final int METHODID_CONTRACT_SPECIFICATIONS_ALL = 12;
  private static final int METHODID_RECORD_SPECIFICATIONS_FOR_CONTRACT_SPECIFICATION = 13;
  private static final int METHODID_RECORD_SPECIFICATION = 14;
  private static final int METHODID_RECORD_SPECIFICATIONS_ALL = 15;
  private static final int METHODID_OSLOCATOR_PARAMS = 16;
  private static final int METHODID_OSLOCATOR = 17;
  private static final int METHODID_OSLOCATORS_BY_URI = 18;
  private static final int METHODID_OSLOCATORS_BY_SCOPE = 19;
  private static final int METHODID_OSALL_LOCATORS = 20;
  private static final int METHODID_ACCOUNT_DATA = 21;

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
          serviceImpl.params((com.provenance.metadata.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SCOPE:
          serviceImpl.scope((com.provenance.metadata.v1.QueryProto.ScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeResponse>) responseObserver);
          break;
        case METHODID_SCOPES_ALL:
          serviceImpl.scopesAll((com.provenance.metadata.v1.QueryProto.ScopesAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopesAllResponse>) responseObserver);
          break;
        case METHODID_SESSIONS:
          serviceImpl.sessions((com.provenance.metadata.v1.QueryProto.SessionsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsResponse>) responseObserver);
          break;
        case METHODID_SESSIONS_ALL:
          serviceImpl.sessionsAll((com.provenance.metadata.v1.QueryProto.SessionsAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.SessionsAllResponse>) responseObserver);
          break;
        case METHODID_RECORDS:
          serviceImpl.records((com.provenance.metadata.v1.QueryProto.RecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsResponse>) responseObserver);
          break;
        case METHODID_RECORDS_ALL:
          serviceImpl.recordsAll((com.provenance.metadata.v1.QueryProto.RecordsAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordsAllResponse>) responseObserver);
          break;
        case METHODID_OWNERSHIP:
          serviceImpl.ownership((com.provenance.metadata.v1.QueryProto.OwnershipRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OwnershipResponse>) responseObserver);
          break;
        case METHODID_VALUE_OWNERSHIP:
          serviceImpl.valueOwnership((com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse>) responseObserver);
          break;
        case METHODID_SCOPE_SPECIFICATION:
          serviceImpl.scopeSpecification((com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse>) responseObserver);
          break;
        case METHODID_SCOPE_SPECIFICATIONS_ALL:
          serviceImpl.scopeSpecificationsAll((com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_SPECIFICATION:
          serviceImpl.contractSpecification((com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_SPECIFICATIONS_ALL:
          serviceImpl.contractSpecificationsAll((com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse>) responseObserver);
          break;
        case METHODID_RECORD_SPECIFICATIONS_FOR_CONTRACT_SPECIFICATION:
          serviceImpl.recordSpecificationsForContractSpecification((com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_RECORD_SPECIFICATION:
          serviceImpl.recordSpecification((com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse>) responseObserver);
          break;
        case METHODID_RECORD_SPECIFICATIONS_ALL:
          serviceImpl.recordSpecificationsAll((com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse>) responseObserver);
          break;
        case METHODID_OSLOCATOR_PARAMS:
          serviceImpl.oSLocatorParams((com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse>) responseObserver);
          break;
        case METHODID_OSLOCATOR:
          serviceImpl.oSLocator((com.provenance.metadata.v1.QueryProto.OSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorResponse>) responseObserver);
          break;
        case METHODID_OSLOCATORS_BY_URI:
          serviceImpl.oSLocatorsByURI((com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse>) responseObserver);
          break;
        case METHODID_OSLOCATORS_BY_SCOPE:
          serviceImpl.oSLocatorsByScope((com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse>) responseObserver);
          break;
        case METHODID_OSALL_LOCATORS:
          serviceImpl.oSAllLocators((com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DATA:
          serviceImpl.accountData((com.provenance.metadata.v1.QueryProto.AccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.QueryProto.AccountDataResponse>) responseObserver);
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
              com.provenance.metadata.v1.QueryProto.QueryParamsRequest,
              com.provenance.metadata.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ScopeRequest,
              com.provenance.metadata.v1.QueryProto.ScopeResponse>(
                service, METHODID_SCOPE)))
        .addMethod(
          getScopesAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ScopesAllRequest,
              com.provenance.metadata.v1.QueryProto.ScopesAllResponse>(
                service, METHODID_SCOPES_ALL)))
        .addMethod(
          getSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.SessionsRequest,
              com.provenance.metadata.v1.QueryProto.SessionsResponse>(
                service, METHODID_SESSIONS)))
        .addMethod(
          getSessionsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.SessionsAllRequest,
              com.provenance.metadata.v1.QueryProto.SessionsAllResponse>(
                service, METHODID_SESSIONS_ALL)))
        .addMethod(
          getRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.RecordsRequest,
              com.provenance.metadata.v1.QueryProto.RecordsResponse>(
                service, METHODID_RECORDS)))
        .addMethod(
          getRecordsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.RecordsAllRequest,
              com.provenance.metadata.v1.QueryProto.RecordsAllResponse>(
                service, METHODID_RECORDS_ALL)))
        .addMethod(
          getOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OwnershipRequest,
              com.provenance.metadata.v1.QueryProto.OwnershipResponse>(
                service, METHODID_OWNERSHIP)))
        .addMethod(
          getValueOwnershipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ValueOwnershipRequest,
              com.provenance.metadata.v1.QueryProto.ValueOwnershipResponse>(
                service, METHODID_VALUE_OWNERSHIP)))
        .addMethod(
          getScopeSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ScopeSpecificationRequest,
              com.provenance.metadata.v1.QueryProto.ScopeSpecificationResponse>(
                service, METHODID_SCOPE_SPECIFICATION)))
        .addMethod(
          getScopeSpecificationsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllRequest,
              com.provenance.metadata.v1.QueryProto.ScopeSpecificationsAllResponse>(
                service, METHODID_SCOPE_SPECIFICATIONS_ALL)))
        .addMethod(
          getContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ContractSpecificationRequest,
              com.provenance.metadata.v1.QueryProto.ContractSpecificationResponse>(
                service, METHODID_CONTRACT_SPECIFICATION)))
        .addMethod(
          getContractSpecificationsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllRequest,
              com.provenance.metadata.v1.QueryProto.ContractSpecificationsAllResponse>(
                service, METHODID_CONTRACT_SPECIFICATIONS_ALL)))
        .addMethod(
          getRecordSpecificationsForContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationRequest,
              com.provenance.metadata.v1.QueryProto.RecordSpecificationsForContractSpecificationResponse>(
                service, METHODID_RECORD_SPECIFICATIONS_FOR_CONTRACT_SPECIFICATION)))
        .addMethod(
          getRecordSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.RecordSpecificationRequest,
              com.provenance.metadata.v1.QueryProto.RecordSpecificationResponse>(
                service, METHODID_RECORD_SPECIFICATION)))
        .addMethod(
          getRecordSpecificationsAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllRequest,
              com.provenance.metadata.v1.QueryProto.RecordSpecificationsAllResponse>(
                service, METHODID_RECORD_SPECIFICATIONS_ALL)))
        .addMethod(
          getOSLocatorParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OSLocatorParamsRequest,
              com.provenance.metadata.v1.QueryProto.OSLocatorParamsResponse>(
                service, METHODID_OSLOCATOR_PARAMS)))
        .addMethod(
          getOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OSLocatorRequest,
              com.provenance.metadata.v1.QueryProto.OSLocatorResponse>(
                service, METHODID_OSLOCATOR)))
        .addMethod(
          getOSLocatorsByURIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OSLocatorsByURIRequest,
              com.provenance.metadata.v1.QueryProto.OSLocatorsByURIResponse>(
                service, METHODID_OSLOCATORS_BY_URI)))
        .addMethod(
          getOSLocatorsByScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeRequest,
              com.provenance.metadata.v1.QueryProto.OSLocatorsByScopeResponse>(
                service, METHODID_OSLOCATORS_BY_SCOPE)))
        .addMethod(
          getOSAllLocatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.OSAllLocatorsRequest,
              com.provenance.metadata.v1.QueryProto.OSAllLocatorsResponse>(
                service, METHODID_OSALL_LOCATORS)))
        .addMethod(
          getAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.QueryProto.AccountDataRequest,
              com.provenance.metadata.v1.QueryProto.AccountDataResponse>(
                service, METHODID_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.metadata.v1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getScopeMethod())
              .addMethod(getScopesAllMethod())
              .addMethod(getSessionsMethod())
              .addMethod(getSessionsAllMethod())
              .addMethod(getRecordsMethod())
              .addMethod(getRecordsAllMethod())
              .addMethod(getOwnershipMethod())
              .addMethod(getValueOwnershipMethod())
              .addMethod(getScopeSpecificationMethod())
              .addMethod(getScopeSpecificationsAllMethod())
              .addMethod(getContractSpecificationMethod())
              .addMethod(getContractSpecificationsAllMethod())
              .addMethod(getRecordSpecificationsForContractSpecificationMethod())
              .addMethod(getRecordSpecificationMethod())
              .addMethod(getRecordSpecificationsAllMethod())
              .addMethod(getOSLocatorParamsMethod())
              .addMethod(getOSLocatorMethod())
              .addMethod(getOSLocatorsByURIMethod())
              .addMethod(getOSLocatorsByScopeMethod())
              .addMethod(getOSAllLocatorsMethod())
              .addMethod(getAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
