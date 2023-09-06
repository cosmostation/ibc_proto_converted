package com.osmosis.superfluid;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: osmosis/superfluid/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "osmosis.superfluid.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryParamsRequest,
      com.osmosis.superfluid.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.superfluid.QueryProto.QueryParamsRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryParamsRequest,
      com.osmosis.superfluid.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryParamsRequest, com.osmosis.superfluid.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.QueryParamsRequest, com.osmosis.superfluid.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetTypeRequest,
      com.osmosis.superfluid.QueryProto.AssetTypeResponse> getAssetTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetType",
      requestType = com.osmosis.superfluid.QueryProto.AssetTypeRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.AssetTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetTypeRequest,
      com.osmosis.superfluid.QueryProto.AssetTypeResponse> getAssetTypeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetTypeRequest, com.osmosis.superfluid.QueryProto.AssetTypeResponse> getAssetTypeMethod;
    if ((getAssetTypeMethod = QueryGrpc.getAssetTypeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetTypeMethod = QueryGrpc.getAssetTypeMethod) == null) {
          QueryGrpc.getAssetTypeMethod = getAssetTypeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.AssetTypeRequest, com.osmosis.superfluid.QueryProto.AssetTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AssetTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AssetTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetType"))
              .build();
        }
      }
    }
    return getAssetTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllAssetsRequest,
      com.osmosis.superfluid.QueryProto.AllAssetsResponse> getAllAssetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllAssets",
      requestType = com.osmosis.superfluid.QueryProto.AllAssetsRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.AllAssetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllAssetsRequest,
      com.osmosis.superfluid.QueryProto.AllAssetsResponse> getAllAssetsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllAssetsRequest, com.osmosis.superfluid.QueryProto.AllAssetsResponse> getAllAssetsMethod;
    if ((getAllAssetsMethod = QueryGrpc.getAllAssetsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllAssetsMethod = QueryGrpc.getAllAssetsMethod) == null) {
          QueryGrpc.getAllAssetsMethod = getAllAssetsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.AllAssetsRequest, com.osmosis.superfluid.QueryProto.AllAssetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllAssets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AllAssetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AllAssetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllAssets"))
              .build();
        }
      }
    }
    return getAllAssetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetMultiplierRequest,
      com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> getAssetMultiplierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssetMultiplier",
      requestType = com.osmosis.superfluid.QueryProto.AssetMultiplierRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.AssetMultiplierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetMultiplierRequest,
      com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> getAssetMultiplierMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AssetMultiplierRequest, com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> getAssetMultiplierMethod;
    if ((getAssetMultiplierMethod = QueryGrpc.getAssetMultiplierMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAssetMultiplierMethod = QueryGrpc.getAssetMultiplierMethod) == null) {
          QueryGrpc.getAssetMultiplierMethod = getAssetMultiplierMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.AssetMultiplierRequest, com.osmosis.superfluid.QueryProto.AssetMultiplierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssetMultiplier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AssetMultiplierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AssetMultiplierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AssetMultiplier"))
              .build();
        }
      }
    }
    return getAssetMultiplierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest,
      com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> getAllIntermediaryAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllIntermediaryAccounts",
      requestType = com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest,
      com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> getAllIntermediaryAccountsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest, com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> getAllIntermediaryAccountsMethod;
    if ((getAllIntermediaryAccountsMethod = QueryGrpc.getAllIntermediaryAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllIntermediaryAccountsMethod = QueryGrpc.getAllIntermediaryAccountsMethod) == null) {
          QueryGrpc.getAllIntermediaryAccountsMethod = getAllIntermediaryAccountsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest, com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllIntermediaryAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllIntermediaryAccounts"))
              .build();
        }
      }
    }
    return getAllIntermediaryAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest,
      com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> getConnectedIntermediaryAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectedIntermediaryAccount",
      requestType = com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest,
      com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> getConnectedIntermediaryAccountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest, com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> getConnectedIntermediaryAccountMethod;
    if ((getConnectedIntermediaryAccountMethod = QueryGrpc.getConnectedIntermediaryAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectedIntermediaryAccountMethod = QueryGrpc.getConnectedIntermediaryAccountMethod) == null) {
          QueryGrpc.getConnectedIntermediaryAccountMethod = getConnectedIntermediaryAccountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest, com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConnectedIntermediaryAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConnectedIntermediaryAccount"))
              .build();
        }
      }
    }
    return getConnectedIntermediaryAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest,
      com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> getTotalDelegationByValidatorForDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalDelegationByValidatorForDenom",
      requestType = com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest,
      com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> getTotalDelegationByValidatorForDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest, com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> getTotalDelegationByValidatorForDenomMethod;
    if ((getTotalDelegationByValidatorForDenomMethod = QueryGrpc.getTotalDelegationByValidatorForDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalDelegationByValidatorForDenomMethod = QueryGrpc.getTotalDelegationByValidatorForDenomMethod) == null) {
          QueryGrpc.getTotalDelegationByValidatorForDenomMethod = getTotalDelegationByValidatorForDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest, com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalDelegationByValidatorForDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalDelegationByValidatorForDenom"))
              .build();
        }
      }
    }
    return getTotalDelegationByValidatorForDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest,
      com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> getTotalSuperfluidDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSuperfluidDelegations",
      requestType = com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest,
      com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> getTotalSuperfluidDelegationsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest, com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> getTotalSuperfluidDelegationsMethod;
    if ((getTotalSuperfluidDelegationsMethod = QueryGrpc.getTotalSuperfluidDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalSuperfluidDelegationsMethod = QueryGrpc.getTotalSuperfluidDelegationsMethod) == null) {
          QueryGrpc.getTotalSuperfluidDelegationsMethod = getTotalSuperfluidDelegationsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest, com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalSuperfluidDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalSuperfluidDelegations"))
              .build();
        }
      }
    }
    return getTotalSuperfluidDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> getSuperfluidDelegationAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidDelegationAmount",
      requestType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> getSuperfluidDelegationAmountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> getSuperfluidDelegationAmountMethod;
    if ((getSuperfluidDelegationAmountMethod = QueryGrpc.getSuperfluidDelegationAmountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSuperfluidDelegationAmountMethod = QueryGrpc.getSuperfluidDelegationAmountMethod) == null) {
          QueryGrpc.getSuperfluidDelegationAmountMethod = getSuperfluidDelegationAmountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidDelegationAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SuperfluidDelegationAmount"))
              .build();
        }
      }
    }
    return getSuperfluidDelegationAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> getSuperfluidDelegationsByDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidDelegationsByDelegator",
      requestType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> getSuperfluidDelegationsByDelegatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> getSuperfluidDelegationsByDelegatorMethod;
    if ((getSuperfluidDelegationsByDelegatorMethod = QueryGrpc.getSuperfluidDelegationsByDelegatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSuperfluidDelegationsByDelegatorMethod = QueryGrpc.getSuperfluidDelegationsByDelegatorMethod) == null) {
          QueryGrpc.getSuperfluidDelegationsByDelegatorMethod = getSuperfluidDelegationsByDelegatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidDelegationsByDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SuperfluidDelegationsByDelegator"))
              .build();
        }
      }
    }
    return getSuperfluidDelegationsByDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> getSuperfluidUndelegationsByDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidUndelegationsByDelegator",
      requestType = com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> getSuperfluidUndelegationsByDelegatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest, com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> getSuperfluidUndelegationsByDelegatorMethod;
    if ((getSuperfluidUndelegationsByDelegatorMethod = QueryGrpc.getSuperfluidUndelegationsByDelegatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSuperfluidUndelegationsByDelegatorMethod = QueryGrpc.getSuperfluidUndelegationsByDelegatorMethod) == null) {
          QueryGrpc.getSuperfluidUndelegationsByDelegatorMethod = getSuperfluidUndelegationsByDelegatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest, com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidUndelegationsByDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SuperfluidUndelegationsByDelegator"))
              .build();
        }
      }
    }
    return getSuperfluidUndelegationsByDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> getSuperfluidDelegationsByValidatorDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuperfluidDelegationsByValidatorDenom",
      requestType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest,
      com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> getSuperfluidDelegationsByValidatorDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> getSuperfluidDelegationsByValidatorDenomMethod;
    if ((getSuperfluidDelegationsByValidatorDenomMethod = QueryGrpc.getSuperfluidDelegationsByValidatorDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSuperfluidDelegationsByValidatorDenomMethod = QueryGrpc.getSuperfluidDelegationsByValidatorDenomMethod) == null) {
          QueryGrpc.getSuperfluidDelegationsByValidatorDenomMethod = getSuperfluidDelegationsByValidatorDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest, com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuperfluidDelegationsByValidatorDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SuperfluidDelegationsByValidatorDenom"))
              .build();
        }
      }
    }
    return getSuperfluidDelegationsByValidatorDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
      com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateSuperfluidDelegatedAmountByValidatorDenom",
      requestType = com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
      com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest, com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod;
    if ((getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod = QueryGrpc.getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod = QueryGrpc.getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod) == null) {
          QueryGrpc.getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod = getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest, com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateSuperfluidDelegatedAmountByValidatorDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateSuperfluidDelegatedAmountByValidatorDenom"))
              .build();
        }
      }
    }
    return getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> getTotalDelegationByDelegatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalDelegationByDelegator",
      requestType = com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest,
      com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> getTotalDelegationByDelegatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest, com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> getTotalDelegationByDelegatorMethod;
    if ((getTotalDelegationByDelegatorMethod = QueryGrpc.getTotalDelegationByDelegatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalDelegationByDelegatorMethod = QueryGrpc.getTotalDelegationByDelegatorMethod) == null) {
          QueryGrpc.getTotalDelegationByDelegatorMethod = getTotalDelegationByDelegatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest, com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalDelegationByDelegator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalDelegationByDelegator"))
              .build();
        }
      }
    }
    return getTotalDelegationByDelegatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest,
      com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> getUnpoolWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnpoolWhitelist",
      requestType = com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest.class,
      responseType = com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest,
      com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> getUnpoolWhitelistMethod() {
    io.grpc.MethodDescriptor<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest, com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> getUnpoolWhitelistMethod;
    if ((getUnpoolWhitelistMethod = QueryGrpc.getUnpoolWhitelistMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnpoolWhitelistMethod = QueryGrpc.getUnpoolWhitelistMethod) == null) {
          QueryGrpc.getUnpoolWhitelistMethod = getUnpoolWhitelistMethod =
              io.grpc.MethodDescriptor.<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest, com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnpoolWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnpoolWhitelist"))
              .build();
        }
      }
    }
    return getUnpoolWhitelistMethod;
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
     * Params returns the total set of superfluid parameters.
     * </pre>
     */
    default void params(com.osmosis.superfluid.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns superfluid asset type, whether if it's a native asset or an lp
     * share.
     * </pre>
     */
    default void assetType(com.osmosis.superfluid.QueryProto.AssetTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all registered superfluid assets.
     * </pre>
     */
    default void allAssets(com.osmosis.superfluid.QueryProto.AllAssetsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllAssetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllAssetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the osmo equivalent multiplier used in the most recent epoch.
     * </pre>
     */
    default void assetMultiplier(com.osmosis.superfluid.QueryProto.AssetMultiplierRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssetMultiplierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all superfluid intermediary accounts.
     * </pre>
     */
    default void allIntermediaryAccounts(com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllIntermediaryAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns intermediary account connected to a superfluid staked lock by id
     * </pre>
     */
    default void connectedIntermediaryAccount(com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectedIntermediaryAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the amount of delegations of specific denom for all validators
     * </pre>
     */
    default void totalDelegationByValidatorForDenom(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalDelegationByValidatorForDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the total amount of osmo superfluidly staked.
     * Response is denominated in uosmo.
     * </pre>
     */
    default void totalSuperfluidDelegations(com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalSuperfluidDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the coins superfluid delegated for the delegator, validator, denom
     * triplet
     * </pre>
     */
    default void superfluidDelegationAmount(com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidDelegationAmountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all the delegated superfluid poistions for a specific delegator.
     * </pre>
     */
    default void superfluidDelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidDelegationsByDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all the undelegating superfluid poistions for a specific delegator.
     * </pre>
     */
    default void superfluidUndelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidUndelegationsByDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns all the superfluid positions of a specific denom delegated to one
     * validator
     * </pre>
     */
    default void superfluidDelegationsByValidatorDenom(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuperfluidDelegationsByValidatorDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the amount of a specific denom delegated to a specific validator
     * This is labeled an estimate, because the way it calculates the amount can
     * lead rounding errors from the true delegated amount
     * </pre>
     */
    default void estimateSuperfluidDelegatedAmountByValidatorDenom(com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified delegations for a specific delegator
     * </pre>
     */
    default void totalDelegationByDelegator(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalDelegationByDelegatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of whitelisted pool ids to unpool.
     * </pre>
     */
    default void unpoolWhitelist(com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnpoolWhitelistMethod(), responseObserver);
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
     * Params returns the total set of superfluid parameters.
     * </pre>
     */
    public void params(com.osmosis.superfluid.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns superfluid asset type, whether if it's a native asset or an lp
     * share.
     * </pre>
     */
    public void assetType(com.osmosis.superfluid.QueryProto.AssetTypeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all registered superfluid assets.
     * </pre>
     */
    public void allAssets(com.osmosis.superfluid.QueryProto.AllAssetsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllAssetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllAssetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the osmo equivalent multiplier used in the most recent epoch.
     * </pre>
     */
    public void assetMultiplier(com.osmosis.superfluid.QueryProto.AssetMultiplierRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssetMultiplierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all superfluid intermediary accounts.
     * </pre>
     */
    public void allIntermediaryAccounts(com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllIntermediaryAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns intermediary account connected to a superfluid staked lock by id
     * </pre>
     */
    public void connectedIntermediaryAccount(com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectedIntermediaryAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the amount of delegations of specific denom for all validators
     * </pre>
     */
    public void totalDelegationByValidatorForDenom(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalDelegationByValidatorForDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the total amount of osmo superfluidly staked.
     * Response is denominated in uosmo.
     * </pre>
     */
    public void totalSuperfluidDelegations(com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalSuperfluidDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the coins superfluid delegated for the delegator, validator, denom
     * triplet
     * </pre>
     */
    public void superfluidDelegationAmount(com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidDelegationAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all the delegated superfluid poistions for a specific delegator.
     * </pre>
     */
    public void superfluidDelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidDelegationsByDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all the undelegating superfluid poistions for a specific delegator.
     * </pre>
     */
    public void superfluidUndelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidUndelegationsByDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns all the superfluid positions of a specific denom delegated to one
     * validator
     * </pre>
     */
    public void superfluidDelegationsByValidatorDenom(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuperfluidDelegationsByValidatorDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the amount of a specific denom delegated to a specific validator
     * This is labeled an estimate, because the way it calculates the amount can
     * lead rounding errors from the true delegated amount
     * </pre>
     */
    public void estimateSuperfluidDelegatedAmountByValidatorDenom(com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified delegations for a specific delegator
     * </pre>
     */
    public void totalDelegationByDelegator(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalDelegationByDelegatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of whitelisted pool ids to unpool.
     * </pre>
     */
    public void unpoolWhitelist(com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnpoolWhitelistMethod(), getCallOptions()), request, responseObserver);
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
     * Params returns the total set of superfluid parameters.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.QueryParamsResponse params(com.osmosis.superfluid.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns superfluid asset type, whether if it's a native asset or an lp
     * share.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.AssetTypeResponse assetType(com.osmosis.superfluid.QueryProto.AssetTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all registered superfluid assets.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.AllAssetsResponse allAssets(com.osmosis.superfluid.QueryProto.AllAssetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllAssetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the osmo equivalent multiplier used in the most recent epoch.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.AssetMultiplierResponse assetMultiplier(com.osmosis.superfluid.QueryProto.AssetMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssetMultiplierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all superfluid intermediary accounts.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse allIntermediaryAccounts(com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllIntermediaryAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns intermediary account connected to a superfluid staked lock by id
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse connectedIntermediaryAccount(com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectedIntermediaryAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the amount of delegations of specific denom for all validators
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse totalDelegationByValidatorForDenom(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalDelegationByValidatorForDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the total amount of osmo superfluidly staked.
     * Response is denominated in uosmo.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse totalSuperfluidDelegations(com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalSuperfluidDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the coins superfluid delegated for the delegator, validator, denom
     * triplet
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse superfluidDelegationAmount(com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidDelegationAmountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all the delegated superfluid poistions for a specific delegator.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse superfluidDelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidDelegationsByDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all the undelegating superfluid poistions for a specific delegator.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse superfluidUndelegationsByDelegator(com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidUndelegationsByDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns all the superfluid positions of a specific denom delegated to one
     * validator
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse superfluidDelegationsByValidatorDenom(com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuperfluidDelegationsByValidatorDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the amount of a specific denom delegated to a specific validator
     * This is labeled an estimate, because the way it calculates the amount can
     * lead rounding errors from the true delegated amount
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse estimateSuperfluidDelegatedAmountByValidatorDenom(com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified delegations for a specific delegator
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse totalDelegationByDelegator(com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalDelegationByDelegatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of whitelisted pool ids to unpool.
     * </pre>
     */
    public com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse unpoolWhitelist(com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnpoolWhitelistMethod(), getCallOptions(), request);
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
     * Params returns the total set of superfluid parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.QueryParamsResponse> params(
        com.osmosis.superfluid.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns superfluid asset type, whether if it's a native asset or an lp
     * share.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.AssetTypeResponse> assetType(
        com.osmosis.superfluid.QueryProto.AssetTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all registered superfluid assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.AllAssetsResponse> allAssets(
        com.osmosis.superfluid.QueryProto.AllAssetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllAssetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the osmo equivalent multiplier used in the most recent epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.AssetMultiplierResponse> assetMultiplier(
        com.osmosis.superfluid.QueryProto.AssetMultiplierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssetMultiplierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all superfluid intermediary accounts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse> allIntermediaryAccounts(
        com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllIntermediaryAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns intermediary account connected to a superfluid staked lock by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse> connectedIntermediaryAccount(
        com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectedIntermediaryAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the amount of delegations of specific denom for all validators
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse> totalDelegationByValidatorForDenom(
        com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalDelegationByValidatorForDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the total amount of osmo superfluidly staked.
     * Response is denominated in uosmo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse> totalSuperfluidDelegations(
        com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalSuperfluidDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the coins superfluid delegated for the delegator, validator, denom
     * triplet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse> superfluidDelegationAmount(
        com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidDelegationAmountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all the delegated superfluid poistions for a specific delegator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse> superfluidDelegationsByDelegator(
        com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidDelegationsByDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all the undelegating superfluid poistions for a specific delegator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse> superfluidUndelegationsByDelegator(
        com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidUndelegationsByDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns all the superfluid positions of a specific denom delegated to one
     * validator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse> superfluidDelegationsByValidatorDenom(
        com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuperfluidDelegationsByValidatorDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the amount of a specific denom delegated to a specific validator
     * This is labeled an estimate, because the way it calculates the amount can
     * lead rounding errors from the true delegated amount
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse> estimateSuperfluidDelegatedAmountByValidatorDenom(
        com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified delegations for a specific delegator
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse> totalDelegationByDelegator(
        com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalDelegationByDelegatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of whitelisted pool ids to unpool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse> unpoolWhitelist(
        com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnpoolWhitelistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ASSET_TYPE = 1;
  private static final int METHODID_ALL_ASSETS = 2;
  private static final int METHODID_ASSET_MULTIPLIER = 3;
  private static final int METHODID_ALL_INTERMEDIARY_ACCOUNTS = 4;
  private static final int METHODID_CONNECTED_INTERMEDIARY_ACCOUNT = 5;
  private static final int METHODID_TOTAL_DELEGATION_BY_VALIDATOR_FOR_DENOM = 6;
  private static final int METHODID_TOTAL_SUPERFLUID_DELEGATIONS = 7;
  private static final int METHODID_SUPERFLUID_DELEGATION_AMOUNT = 8;
  private static final int METHODID_SUPERFLUID_DELEGATIONS_BY_DELEGATOR = 9;
  private static final int METHODID_SUPERFLUID_UNDELEGATIONS_BY_DELEGATOR = 10;
  private static final int METHODID_SUPERFLUID_DELEGATIONS_BY_VALIDATOR_DENOM = 11;
  private static final int METHODID_ESTIMATE_SUPERFLUID_DELEGATED_AMOUNT_BY_VALIDATOR_DENOM = 12;
  private static final int METHODID_TOTAL_DELEGATION_BY_DELEGATOR = 13;
  private static final int METHODID_UNPOOL_WHITELIST = 14;

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
          serviceImpl.params((com.osmosis.superfluid.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ASSET_TYPE:
          serviceImpl.assetType((com.osmosis.superfluid.QueryProto.AssetTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetTypeResponse>) responseObserver);
          break;
        case METHODID_ALL_ASSETS:
          serviceImpl.allAssets((com.osmosis.superfluid.QueryProto.AllAssetsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllAssetsResponse>) responseObserver);
          break;
        case METHODID_ASSET_MULTIPLIER:
          serviceImpl.assetMultiplier((com.osmosis.superfluid.QueryProto.AssetMultiplierRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AssetMultiplierResponse>) responseObserver);
          break;
        case METHODID_ALL_INTERMEDIARY_ACCOUNTS:
          serviceImpl.allIntermediaryAccounts((com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse>) responseObserver);
          break;
        case METHODID_CONNECTED_INTERMEDIARY_ACCOUNT:
          serviceImpl.connectedIntermediaryAccount((com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse>) responseObserver);
          break;
        case METHODID_TOTAL_DELEGATION_BY_VALIDATOR_FOR_DENOM:
          serviceImpl.totalDelegationByValidatorForDenom((com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse>) responseObserver);
          break;
        case METHODID_TOTAL_SUPERFLUID_DELEGATIONS:
          serviceImpl.totalSuperfluidDelegations((com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_DELEGATION_AMOUNT:
          serviceImpl.superfluidDelegationAmount((com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_DELEGATIONS_BY_DELEGATOR:
          serviceImpl.superfluidDelegationsByDelegator((com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_UNDELEGATIONS_BY_DELEGATOR:
          serviceImpl.superfluidUndelegationsByDelegator((com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse>) responseObserver);
          break;
        case METHODID_SUPERFLUID_DELEGATIONS_BY_VALIDATOR_DENOM:
          serviceImpl.superfluidDelegationsByValidatorDenom((com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_SUPERFLUID_DELEGATED_AMOUNT_BY_VALIDATOR_DENOM:
          serviceImpl.estimateSuperfluidDelegatedAmountByValidatorDenom((com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse>) responseObserver);
          break;
        case METHODID_TOTAL_DELEGATION_BY_DELEGATOR:
          serviceImpl.totalDelegationByDelegator((com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse>) responseObserver);
          break;
        case METHODID_UNPOOL_WHITELIST:
          serviceImpl.unpoolWhitelist((com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse>) responseObserver);
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
              com.osmosis.superfluid.QueryProto.QueryParamsRequest,
              com.osmosis.superfluid.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAssetTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.AssetTypeRequest,
              com.osmosis.superfluid.QueryProto.AssetTypeResponse>(
                service, METHODID_ASSET_TYPE)))
        .addMethod(
          getAllAssetsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.AllAssetsRequest,
              com.osmosis.superfluid.QueryProto.AllAssetsResponse>(
                service, METHODID_ALL_ASSETS)))
        .addMethod(
          getAssetMultiplierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.AssetMultiplierRequest,
              com.osmosis.superfluid.QueryProto.AssetMultiplierResponse>(
                service, METHODID_ASSET_MULTIPLIER)))
        .addMethod(
          getAllIntermediaryAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsRequest,
              com.osmosis.superfluid.QueryProto.AllIntermediaryAccountsResponse>(
                service, METHODID_ALL_INTERMEDIARY_ACCOUNTS)))
        .addMethod(
          getConnectedIntermediaryAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountRequest,
              com.osmosis.superfluid.QueryProto.ConnectedIntermediaryAccountResponse>(
                service, METHODID_CONNECTED_INTERMEDIARY_ACCOUNT)))
        .addMethod(
          getTotalDelegationByValidatorForDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomRequest,
              com.osmosis.superfluid.QueryProto.QueryTotalDelegationByValidatorForDenomResponse>(
                service, METHODID_TOTAL_DELEGATION_BY_VALIDATOR_FOR_DENOM)))
        .addMethod(
          getTotalSuperfluidDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsRequest,
              com.osmosis.superfluid.QueryProto.TotalSuperfluidDelegationsResponse>(
                service, METHODID_TOTAL_SUPERFLUID_DELEGATIONS)))
        .addMethod(
          getSuperfluidDelegationAmountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountRequest,
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationAmountResponse>(
                service, METHODID_SUPERFLUID_DELEGATION_AMOUNT)))
        .addMethod(
          getSuperfluidDelegationsByDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorRequest,
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByDelegatorResponse>(
                service, METHODID_SUPERFLUID_DELEGATIONS_BY_DELEGATOR)))
        .addMethod(
          getSuperfluidUndelegationsByDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorRequest,
              com.osmosis.superfluid.QueryProto.SuperfluidUndelegationsByDelegatorResponse>(
                service, METHODID_SUPERFLUID_UNDELEGATIONS_BY_DELEGATOR)))
        .addMethod(
          getSuperfluidDelegationsByValidatorDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomRequest,
              com.osmosis.superfluid.QueryProto.SuperfluidDelegationsByValidatorDenomResponse>(
                service, METHODID_SUPERFLUID_DELEGATIONS_BY_VALIDATOR_DENOM)))
        .addMethod(
          getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
              com.osmosis.superfluid.QueryProto.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse>(
                service, METHODID_ESTIMATE_SUPERFLUID_DELEGATED_AMOUNT_BY_VALIDATOR_DENOM)))
        .addMethod(
          getTotalDelegationByDelegatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorRequest,
              com.osmosis.superfluid.QueryProto.QueryTotalDelegationByDelegatorResponse>(
                service, METHODID_TOTAL_DELEGATION_BY_DELEGATOR)))
        .addMethod(
          getUnpoolWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistRequest,
              com.osmosis.superfluid.QueryProto.QueryUnpoolWhitelistResponse>(
                service, METHODID_UNPOOL_WHITELIST)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.superfluid.QueryProto.getDescriptor();
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
              .addMethod(getAssetTypeMethod())
              .addMethod(getAllAssetsMethod())
              .addMethod(getAssetMultiplierMethod())
              .addMethod(getAllIntermediaryAccountsMethod())
              .addMethod(getConnectedIntermediaryAccountMethod())
              .addMethod(getTotalDelegationByValidatorForDenomMethod())
              .addMethod(getTotalSuperfluidDelegationsMethod())
              .addMethod(getSuperfluidDelegationAmountMethod())
              .addMethod(getSuperfluidDelegationsByDelegatorMethod())
              .addMethod(getSuperfluidUndelegationsByDelegatorMethod())
              .addMethod(getSuperfluidDelegationsByValidatorDenomMethod())
              .addMethod(getEstimateSuperfluidDelegatedAmountByValidatorDenomMethod())
              .addMethod(getTotalDelegationByDelegatorMethod())
              .addMethod(getUnpoolWhitelistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
