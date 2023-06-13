package com.pstake.lscosmos.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: pstake/lscosmos/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "pstake.lscosmos.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> getHostChainParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HostChainParams",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> getHostChainParamsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> getHostChainParamsMethod;
    if ((getHostChainParamsMethod = QueryGrpc.getHostChainParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHostChainParamsMethod = QueryGrpc.getHostChainParamsMethod) == null) {
          QueryGrpc.getHostChainParamsMethod = getHostChainParamsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HostChainParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HostChainParams"))
              .build();
        }
      }
    }
    return getHostChainParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> getDelegationStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegationState",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> getDelegationStateMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> getDelegationStateMethod;
    if ((getDelegationStateMethod = QueryGrpc.getDelegationStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationStateMethod = QueryGrpc.getDelegationStateMethod) == null) {
          QueryGrpc.getDelegationStateMethod = getDelegationStateMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegationState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegationState"))
              .build();
        }
      }
    }
    return getDelegationStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> getAllowListedValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllowListedValidators",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> getAllowListedValidatorsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> getAllowListedValidatorsMethod;
    if ((getAllowListedValidatorsMethod = QueryGrpc.getAllowListedValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllowListedValidatorsMethod = QueryGrpc.getAllowListedValidatorsMethod) == null) {
          QueryGrpc.getAllowListedValidatorsMethod = getAllowListedValidatorsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllowListedValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllowListedValidators"))
              .build();
        }
      }
    }
    return getAllowListedValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> getCValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CValue",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> getCValueMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> getCValueMethod;
    if ((getCValueMethod = QueryGrpc.getCValueMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCValueMethod = QueryGrpc.getCValueMethod) == null) {
          QueryGrpc.getCValueMethod = getCValueMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CValue"))
              .build();
        }
      }
    }
    return getCValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> getModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleState",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> getModuleStateMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> getModuleStateMethod;
    if ((getModuleStateMethod = QueryGrpc.getModuleStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleStateMethod = QueryGrpc.getModuleStateMethod) == null) {
          QueryGrpc.getModuleStateMethod = getModuleStateMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleState"))
              .build();
        }
      }
    }
    return getModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> getIBCTransientStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCTransientStore",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> getIBCTransientStoreMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> getIBCTransientStoreMethod;
    if ((getIBCTransientStoreMethod = QueryGrpc.getIBCTransientStoreMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCTransientStoreMethod = QueryGrpc.getIBCTransientStoreMethod) == null) {
          QueryGrpc.getIBCTransientStoreMethod = getIBCTransientStoreMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCTransientStore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCTransientStore"))
              .build();
        }
      }
    }
    return getIBCTransientStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> getUnclaimedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unclaimed",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> getUnclaimedMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> getUnclaimedMethod;
    if ((getUnclaimedMethod = QueryGrpc.getUnclaimedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnclaimedMethod = QueryGrpc.getUnclaimedMethod) == null) {
          QueryGrpc.getUnclaimedMethod = getUnclaimedMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unclaimed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Unclaimed"))
              .build();
        }
      }
    }
    return getUnclaimedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> getFailedUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FailedUnbondings",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> getFailedUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> getFailedUnbondingsMethod;
    if ((getFailedUnbondingsMethod = QueryGrpc.getFailedUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFailedUnbondingsMethod = QueryGrpc.getFailedUnbondingsMethod) == null) {
          QueryGrpc.getFailedUnbondingsMethod = getFailedUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FailedUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FailedUnbondings"))
              .build();
        }
      }
    }
    return getFailedUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> getPendingUnbondingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingUnbondings",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> getPendingUnbondingsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> getPendingUnbondingsMethod;
    if ((getPendingUnbondingsMethod = QueryGrpc.getPendingUnbondingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPendingUnbondingsMethod = QueryGrpc.getPendingUnbondingsMethod) == null) {
          QueryGrpc.getPendingUnbondingsMethod = getPendingUnbondingsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingUnbondings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PendingUnbondings"))
              .build();
        }
      }
    }
    return getPendingUnbondingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> getUnbondingEpochCValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingEpochCValue",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> getUnbondingEpochCValueMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> getUnbondingEpochCValueMethod;
    if ((getUnbondingEpochCValueMethod = QueryGrpc.getUnbondingEpochCValueMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingEpochCValueMethod = QueryGrpc.getUnbondingEpochCValueMethod) == null) {
          QueryGrpc.getUnbondingEpochCValueMethod = getUnbondingEpochCValueMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondingEpochCValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingEpochCValue"))
              .build();
        }
      }
    }
    return getUnbondingEpochCValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> getHostAccountUndelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HostAccountUndelegation",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> getHostAccountUndelegationMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> getHostAccountUndelegationMethod;
    if ((getHostAccountUndelegationMethod = QueryGrpc.getHostAccountUndelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHostAccountUndelegationMethod = QueryGrpc.getHostAccountUndelegationMethod) == null) {
          QueryGrpc.getHostAccountUndelegationMethod = getHostAccountUndelegationMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HostAccountUndelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HostAccountUndelegation"))
              .build();
        }
      }
    }
    return getHostAccountUndelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> getDelegatorUnbondingEpochEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorUnbondingEpochEntry",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> getDelegatorUnbondingEpochEntryMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> getDelegatorUnbondingEpochEntryMethod;
    if ((getDelegatorUnbondingEpochEntryMethod = QueryGrpc.getDelegatorUnbondingEpochEntryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorUnbondingEpochEntryMethod = QueryGrpc.getDelegatorUnbondingEpochEntryMethod) == null) {
          QueryGrpc.getDelegatorUnbondingEpochEntryMethod = getDelegatorUnbondingEpochEntryMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorUnbondingEpochEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorUnbondingEpochEntry"))
              .build();
        }
      }
    }
    return getDelegatorUnbondingEpochEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> getHostAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HostAccounts",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> getHostAccountsMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> getHostAccountsMethod;
    if ((getHostAccountsMethod = QueryGrpc.getHostAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHostAccountsMethod = QueryGrpc.getHostAccountsMethod) == null) {
          QueryGrpc.getHostAccountsMethod = getHostAccountsMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HostAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HostAccounts"))
              .build();
        }
      }
    }
    return getHostAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> getDepositModuleAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositModuleAccount",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> getDepositModuleAccountMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> getDepositModuleAccountMethod;
    if ((getDepositModuleAccountMethod = QueryGrpc.getDepositModuleAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositModuleAccountMethod = QueryGrpc.getDepositModuleAccountMethod) == null) {
          QueryGrpc.getDepositModuleAccountMethod = getDepositModuleAccountMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositModuleAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositModuleAccount"))
              .build();
        }
      }
    }
    return getDepositModuleAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> getDelegatorUnbondingEpochEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorUnbondingEpochEntries",
      requestType = com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest.class,
      responseType = com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest,
      com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> getDelegatorUnbondingEpochEntriesMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> getDelegatorUnbondingEpochEntriesMethod;
    if ((getDelegatorUnbondingEpochEntriesMethod = QueryGrpc.getDelegatorUnbondingEpochEntriesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorUnbondingEpochEntriesMethod = QueryGrpc.getDelegatorUnbondingEpochEntriesMethod) == null) {
          QueryGrpc.getDelegatorUnbondingEpochEntriesMethod = getDelegatorUnbondingEpochEntriesMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest, com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorUnbondingEpochEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorUnbondingEpochEntries"))
              .build();
        }
      }
    }
    return getDelegatorUnbondingEpochEntriesMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void hostChainParams(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostChainParamsMethod(), responseObserver);
    }

    /**
     */
    default void delegationState(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegationStateMethod(), responseObserver);
    }

    /**
     */
    default void allowListedValidators(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllowListedValidatorsMethod(), responseObserver);
    }

    /**
     */
    default void cValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCValueMethod(), responseObserver);
    }

    /**
     */
    default void moduleState(com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleStateMethod(), responseObserver);
    }

    /**
     */
    default void iBCTransientStore(com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCTransientStoreMethod(), responseObserver);
    }

    /**
     */
    default void unclaimed(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnclaimedMethod(), responseObserver);
    }

    /**
     */
    default void failedUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFailedUnbondingsMethod(), responseObserver);
    }

    /**
     */
    default void pendingUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingUnbondingsMethod(), responseObserver);
    }

    /**
     */
    default void unbondingEpochCValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingEpochCValueMethod(), responseObserver);
    }

    /**
     */
    default void hostAccountUndelegation(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostAccountUndelegationMethod(), responseObserver);
    }

    /**
     */
    default void delegatorUnbondingEpochEntry(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorUnbondingEpochEntryMethod(), responseObserver);
    }

    /**
     */
    default void hostAccounts(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostAccountsMethod(), responseObserver);
    }

    /**
     */
    default void depositModuleAccount(com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositModuleAccountMethod(), responseObserver);
    }

    /**
     */
    default void delegatorUnbondingEpochEntries(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorUnbondingEpochEntriesMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hostChainParams(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostChainParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delegationState(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegationStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allowListedValidators(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllowListedValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moduleState(com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iBCTransientStore(com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCTransientStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unclaimed(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnclaimedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void failedUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFailedUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pendingUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingUnbondingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unbondingEpochCValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingEpochCValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hostAccountUndelegation(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostAccountUndelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delegatorUnbondingEpochEntry(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorUnbondingEpochEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hostAccounts(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void depositModuleAccount(com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositModuleAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delegatorUnbondingEpochEntries(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorUnbondingEpochEntriesMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse params(com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse hostChainParams(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostChainParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse delegationState(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegationStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse allowListedValidators(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllowListedValidatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse cValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse moduleState(com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse iBCTransientStore(com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCTransientStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse unclaimed(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnclaimedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse failedUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFailedUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse pendingUnbondings(com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingUnbondingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse unbondingEpochCValue(com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingEpochCValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse hostAccountUndelegation(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostAccountUndelegationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse delegatorUnbondingEpochEntry(com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorUnbondingEpochEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse hostAccounts(com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse depositModuleAccount(com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositModuleAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse delegatorUnbondingEpochEntries(com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorUnbondingEpochEntriesMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse> params(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse> hostChainParams(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostChainParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse> delegationState(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegationStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse> allowListedValidators(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllowListedValidatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse> cValue(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse> moduleState(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse> iBCTransientStore(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCTransientStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse> unclaimed(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnclaimedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse> failedUnbondings(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFailedUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse> pendingUnbondings(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingUnbondingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse> unbondingEpochCValue(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingEpochCValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse> hostAccountUndelegation(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostAccountUndelegationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse> delegatorUnbondingEpochEntry(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorUnbondingEpochEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse> hostAccounts(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse> depositModuleAccount(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositModuleAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse> delegatorUnbondingEpochEntries(
        com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorUnbondingEpochEntriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_HOST_CHAIN_PARAMS = 1;
  private static final int METHODID_DELEGATION_STATE = 2;
  private static final int METHODID_ALLOW_LISTED_VALIDATORS = 3;
  private static final int METHODID_CVALUE = 4;
  private static final int METHODID_MODULE_STATE = 5;
  private static final int METHODID_IBCTRANSIENT_STORE = 6;
  private static final int METHODID_UNCLAIMED = 7;
  private static final int METHODID_FAILED_UNBONDINGS = 8;
  private static final int METHODID_PENDING_UNBONDINGS = 9;
  private static final int METHODID_UNBONDING_EPOCH_CVALUE = 10;
  private static final int METHODID_HOST_ACCOUNT_UNDELEGATION = 11;
  private static final int METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRY = 12;
  private static final int METHODID_HOST_ACCOUNTS = 13;
  private static final int METHODID_DEPOSIT_MODULE_ACCOUNT = 14;
  private static final int METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRIES = 15;

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
          serviceImpl.params((com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_HOST_CHAIN_PARAMS:
          serviceImpl.hostChainParams((com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse>) responseObserver);
          break;
        case METHODID_DELEGATION_STATE:
          serviceImpl.delegationState((com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse>) responseObserver);
          break;
        case METHODID_ALLOW_LISTED_VALIDATORS:
          serviceImpl.allowListedValidators((com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse>) responseObserver);
          break;
        case METHODID_CVALUE:
          serviceImpl.cValue((com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse>) responseObserver);
          break;
        case METHODID_MODULE_STATE:
          serviceImpl.moduleState((com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse>) responseObserver);
          break;
        case METHODID_IBCTRANSIENT_STORE:
          serviceImpl.iBCTransientStore((com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse>) responseObserver);
          break;
        case METHODID_UNCLAIMED:
          serviceImpl.unclaimed((com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse>) responseObserver);
          break;
        case METHODID_FAILED_UNBONDINGS:
          serviceImpl.failedUnbondings((com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse>) responseObserver);
          break;
        case METHODID_PENDING_UNBONDINGS:
          serviceImpl.pendingUnbondings((com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_EPOCH_CVALUE:
          serviceImpl.unbondingEpochCValue((com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse>) responseObserver);
          break;
        case METHODID_HOST_ACCOUNT_UNDELEGATION:
          serviceImpl.hostAccountUndelegation((com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRY:
          serviceImpl.delegatorUnbondingEpochEntry((com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse>) responseObserver);
          break;
        case METHODID_HOST_ACCOUNTS:
          serviceImpl.hostAccounts((com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_MODULE_ACCOUNT:
          serviceImpl.depositModuleAccount((com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRIES:
          serviceImpl.delegatorUnbondingEpochEntries((com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse>) responseObserver);
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
              com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getHostChainParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostChainParamsResponse>(
                service, METHODID_HOST_CHAIN_PARAMS)))
        .addMethod(
          getDelegationStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegationStateResponse>(
                service, METHODID_DELEGATION_STATE)))
        .addMethod(
          getAllowListedValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryAllowListedValidatorsResponse>(
                service, METHODID_ALLOW_LISTED_VALIDATORS)))
        .addMethod(
          getCValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryCValueResponse>(
                service, METHODID_CVALUE)))
        .addMethod(
          getModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryModuleStateResponse>(
                service, METHODID_MODULE_STATE)))
        .addMethod(
          getIBCTransientStoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryIBCTransientStoreResponse>(
                service, METHODID_IBCTRANSIENT_STORE)))
        .addMethod(
          getUnclaimedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryUnclaimedResponse>(
                service, METHODID_UNCLAIMED)))
        .addMethod(
          getFailedUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryFailedUnbondingsResponse>(
                service, METHODID_FAILED_UNBONDINGS)))
        .addMethod(
          getPendingUnbondingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryPendingUnbondingsResponse>(
                service, METHODID_PENDING_UNBONDINGS)))
        .addMethod(
          getUnbondingEpochCValueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryUnbondingEpochCValueResponse>(
                service, METHODID_UNBONDING_EPOCH_CVALUE)))
        .addMethod(
          getHostAccountUndelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountUndelegationResponse>(
                service, METHODID_HOST_ACCOUNT_UNDELEGATION)))
        .addMethod(
          getDelegatorUnbondingEpochEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDelegatorUnbondingEpochEntryResponse>(
                service, METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRY)))
        .addMethod(
          getHostAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryHostAccountsResponse>(
                service, METHODID_HOST_ACCOUNTS)))
        .addMethod(
          getDepositModuleAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryDepositModuleAccountResponse>(
                service, METHODID_DEPOSIT_MODULE_ACCOUNT)))
        .addMethod(
          getDelegatorUnbondingEpochEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesRequest,
              com.pstake.lscosmos.v1beta1.QueryProto.QueryAllDelegatorUnbondingEpochEntriesResponse>(
                service, METHODID_DELEGATOR_UNBONDING_EPOCH_ENTRIES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.lscosmos.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getHostChainParamsMethod())
              .addMethod(getDelegationStateMethod())
              .addMethod(getAllowListedValidatorsMethod())
              .addMethod(getCValueMethod())
              .addMethod(getModuleStateMethod())
              .addMethod(getIBCTransientStoreMethod())
              .addMethod(getUnclaimedMethod())
              .addMethod(getFailedUnbondingsMethod())
              .addMethod(getPendingUnbondingsMethod())
              .addMethod(getUnbondingEpochCValueMethod())
              .addMethod(getHostAccountUndelegationMethod())
              .addMethod(getDelegatorUnbondingEpochEntryMethod())
              .addMethod(getHostAccountsMethod())
              .addMethod(getDepositModuleAccountMethod())
              .addMethod(getDelegatorUnbondingEpochEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
