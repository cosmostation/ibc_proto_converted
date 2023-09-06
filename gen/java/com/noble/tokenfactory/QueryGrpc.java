package com.noble.tokenfactory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: noble/tokenfactory/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "noble.tokenfactory.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryParamsRequest,
      com.noble.tokenfactory.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.noble.tokenfactory.QueryProto.QueryParamsRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryParamsRequest,
      com.noble.tokenfactory.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryParamsRequest, com.noble.tokenfactory.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryParamsRequest, com.noble.tokenfactory.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest,
      com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> getBlacklistedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklisted",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest,
      com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> getBlacklistedMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest, com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> getBlacklistedMethod;
    if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedMethod = QueryGrpc.getBlacklistedMethod) == null) {
          QueryGrpc.getBlacklistedMethod = getBlacklistedMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest, com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklisted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklisted"))
              .build();
        }
      }
    }
    return getBlacklistedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest,
      com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> getBlacklistedAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlacklistedAll",
      requestType = com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest,
      com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> getBlacklistedAllMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest, com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> getBlacklistedAllMethod;
    if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklistedAllMethod = QueryGrpc.getBlacklistedAllMethod) == null) {
          QueryGrpc.getBlacklistedAllMethod = getBlacklistedAllMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest, com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlacklistedAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlacklistedAll"))
              .build();
        }
      }
    }
    return getBlacklistedAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPausedRequest,
      com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> getPausedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Paused",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetPausedRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetPausedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPausedRequest,
      com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> getPausedMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPausedRequest, com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> getPausedMethod;
    if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPausedMethod = QueryGrpc.getPausedMethod) == null) {
          QueryGrpc.getPausedMethod = getPausedMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetPausedRequest, com.noble.tokenfactory.QueryProto.QueryGetPausedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Paused"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetPausedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetPausedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Paused"))
              .build();
        }
      }
    }
    return getPausedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> getMasterMinterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MasterMinter",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> getMasterMinterMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest, com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> getMasterMinterMethod;
    if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMasterMinterMethod = QueryGrpc.getMasterMinterMethod) == null) {
          QueryGrpc.getMasterMinterMethod = getMasterMinterMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest, com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MasterMinter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MasterMinter"))
              .build();
        }
      }
    }
    return getMasterMinterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintersRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> getMintersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Minters",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetMintersRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintersRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> getMintersMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintersRequest, com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> getMintersMethod;
    if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersMethod = QueryGrpc.getMintersMethod) == null) {
          QueryGrpc.getMintersMethod = getMintersMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetMintersRequest, com.noble.tokenfactory.QueryProto.QueryGetMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Minters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Minters"))
              .build();
        }
      }
    }
    return getMintersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMintersRequest,
      com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> getMintersAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintersAll",
      requestType = com.noble.tokenfactory.QueryProto.QueryAllMintersRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryAllMintersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMintersRequest,
      com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> getMintersAllMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMintersRequest, com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> getMintersAllMethod;
    if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintersAllMethod = QueryGrpc.getMintersAllMethod) == null) {
          QueryGrpc.getMintersAllMethod = getMintersAllMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryAllMintersRequest, com.noble.tokenfactory.QueryProto.QueryAllMintersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintersAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllMintersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllMintersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MintersAll"))
              .build();
        }
      }
    }
    return getMintersAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPauserRequest,
      com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> getPauserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pauser",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetPauserRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetPauserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPauserRequest,
      com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> getPauserMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetPauserRequest, com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> getPauserMethod;
    if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPauserMethod = QueryGrpc.getPauserMethod) == null) {
          QueryGrpc.getPauserMethod = getPauserMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetPauserRequest, com.noble.tokenfactory.QueryProto.QueryGetPauserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pauser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetPauserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetPauserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pauser"))
              .build();
        }
      }
    }
    return getPauserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest,
      com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> getBlacklisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Blacklister",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest,
      com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> getBlacklisterMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest, com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> getBlacklisterMethod;
    if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlacklisterMethod = QueryGrpc.getBlacklisterMethod) == null) {
          QueryGrpc.getBlacklisterMethod = getBlacklisterMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest, com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Blacklister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Blacklister"))
              .build();
        }
      }
    }
    return getBlacklisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest,
      com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest,
      com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest, com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest, com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> getMinterControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterController",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> getMinterControllerMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest, com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> getMinterControllerMethod;
    if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerMethod = QueryGrpc.getMinterControllerMethod) == null) {
          QueryGrpc.getMinterControllerMethod = getMinterControllerMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest, com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterController"))
              .build();
        }
      }
    }
    return getMinterControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest,
      com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> getMinterControllerAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinterControllerAll",
      requestType = com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest,
      com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> getMinterControllerAllMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest, com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> getMinterControllerAllMethod;
    if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinterControllerAllMethod = QueryGrpc.getMinterControllerAllMethod) == null) {
          QueryGrpc.getMinterControllerAllMethod = getMinterControllerAllMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest, com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinterControllerAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinterControllerAll"))
              .build();
        }
      }
    }
    return getMinterControllerAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> getMintingDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintingDenom",
      requestType = com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest.class,
      responseType = com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest,
      com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> getMintingDenomMethod() {
    io.grpc.MethodDescriptor<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest, com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> getMintingDenomMethod;
    if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMintingDenomMethod = QueryGrpc.getMintingDenomMethod) == null) {
          QueryGrpc.getMintingDenomMethod = getMintingDenomMethod =
              io.grpc.MethodDescriptor.<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest, com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintingDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MintingDenom"))
              .build();
        }
      }
    }
    return getMintingDenomMethod;
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
    default void params(com.noble.tokenfactory.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    default void blacklisted(com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlacklistedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    default void blacklistedAll(com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlacklistedAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    default void paused(com.noble.tokenfactory.QueryProto.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPausedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    default void masterMinter(com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMasterMinterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    default void minters(com.noble.tokenfactory.QueryProto.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    default void mintersAll(com.noble.tokenfactory.QueryProto.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintersAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    default void pauser(com.noble.tokenfactory.QueryProto.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    default void blacklister(com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlacklisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    default void owner(com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    default void minterController(com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinterControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    default void minterControllerAll(com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinterControllerAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    default void mintingDenom(com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintingDenomMethod(), responseObserver);
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
    public void params(com.noble.tokenfactory.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public void blacklisted(com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public void blacklistedAll(com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public void paused(com.noble.tokenfactory.QueryProto.QueryGetPausedRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public void masterMinter(com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public void minters(com.noble.tokenfactory.QueryProto.QueryGetMintersRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public void mintersAll(com.noble.tokenfactory.QueryProto.QueryAllMintersRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public void pauser(com.noble.tokenfactory.QueryProto.QueryGetPauserRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public void blacklister(com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public void owner(com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public void minterController(com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public void minterControllerAll(com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public void mintingDenom(com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest request,
        io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintingDenomMethod(), getCallOptions()), request, responseObserver);
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
    public com.noble.tokenfactory.QueryProto.QueryParamsResponse params(com.noble.tokenfactory.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse blacklisted(com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlacklistedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse blacklistedAll(com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlacklistedAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetPausedResponse paused(com.noble.tokenfactory.QueryProto.QueryGetPausedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPausedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse masterMinter(com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMasterMinterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetMintersResponse minters(com.noble.tokenfactory.QueryProto.QueryGetMintersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryAllMintersResponse mintersAll(com.noble.tokenfactory.QueryProto.QueryAllMintersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintersAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetPauserResponse pauser(com.noble.tokenfactory.QueryProto.QueryGetPauserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse blacklister(com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlacklisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse owner(com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse minterController(com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinterControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse minterControllerAll(com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinterControllerAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse mintingDenom(com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintingDenomMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryParamsResponse> params(
        com.noble.tokenfactory.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklisted by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse> blacklisted(
        com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlacklistedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Blacklisted items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse> blacklistedAll(
        com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlacklistedAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Paused by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetPausedResponse> paused(
        com.noble.tokenfactory.QueryProto.QueryGetPausedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPausedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MasterMinter by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse> masterMinter(
        com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMasterMinterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Minters by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetMintersResponse> minters(
        com.noble.tokenfactory.QueryProto.QueryGetMintersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Minters items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryAllMintersResponse> mintersAll(
        com.noble.tokenfactory.QueryProto.QueryAllMintersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintersAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Pauser by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetPauserResponse> pauser(
        com.noble.tokenfactory.QueryProto.QueryGetPauserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Blacklister by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse> blacklister(
        com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlacklisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Owner by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse> owner(
        com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MinterController by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse> minterController(
        com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinterControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of MinterController items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse> minterControllerAll(
        com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinterControllerAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a MintingDenom by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse> mintingDenom(
        com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintingDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_BLACKLISTED = 1;
  private static final int METHODID_BLACKLISTED_ALL = 2;
  private static final int METHODID_PAUSED = 3;
  private static final int METHODID_MASTER_MINTER = 4;
  private static final int METHODID_MINTERS = 5;
  private static final int METHODID_MINTERS_ALL = 6;
  private static final int METHODID_PAUSER = 7;
  private static final int METHODID_BLACKLISTER = 8;
  private static final int METHODID_OWNER = 9;
  private static final int METHODID_MINTER_CONTROLLER = 10;
  private static final int METHODID_MINTER_CONTROLLER_ALL = 11;
  private static final int METHODID_MINTING_DENOM = 12;

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
          serviceImpl.params((com.noble.tokenfactory.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED:
          serviceImpl.blacklisted((com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTED_ALL:
          serviceImpl.blacklistedAll((com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse>) responseObserver);
          break;
        case METHODID_PAUSED:
          serviceImpl.paused((com.noble.tokenfactory.QueryProto.QueryGetPausedRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPausedResponse>) responseObserver);
          break;
        case METHODID_MASTER_MINTER:
          serviceImpl.masterMinter((com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse>) responseObserver);
          break;
        case METHODID_MINTERS:
          serviceImpl.minters((com.noble.tokenfactory.QueryProto.QueryGetMintersRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintersResponse>) responseObserver);
          break;
        case METHODID_MINTERS_ALL:
          serviceImpl.mintersAll((com.noble.tokenfactory.QueryProto.QueryAllMintersRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMintersResponse>) responseObserver);
          break;
        case METHODID_PAUSER:
          serviceImpl.pauser((com.noble.tokenfactory.QueryProto.QueryGetPauserRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetPauserResponse>) responseObserver);
          break;
        case METHODID_BLACKLISTER:
          serviceImpl.blacklister((com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER:
          serviceImpl.minterController((com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTER_CONTROLLER_ALL:
          serviceImpl.minterControllerAll((com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse>) responseObserver);
          break;
        case METHODID_MINTING_DENOM:
          serviceImpl.mintingDenom((com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse>) responseObserver);
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
              com.noble.tokenfactory.QueryProto.QueryParamsRequest,
              com.noble.tokenfactory.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getBlacklistedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetBlacklistedRequest,
              com.noble.tokenfactory.QueryProto.QueryGetBlacklistedResponse>(
                service, METHODID_BLACKLISTED)))
        .addMethod(
          getBlacklistedAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryAllBlacklistedRequest,
              com.noble.tokenfactory.QueryProto.QueryAllBlacklistedResponse>(
                service, METHODID_BLACKLISTED_ALL)))
        .addMethod(
          getPausedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetPausedRequest,
              com.noble.tokenfactory.QueryProto.QueryGetPausedResponse>(
                service, METHODID_PAUSED)))
        .addMethod(
          getMasterMinterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetMasterMinterRequest,
              com.noble.tokenfactory.QueryProto.QueryGetMasterMinterResponse>(
                service, METHODID_MASTER_MINTER)))
        .addMethod(
          getMintersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetMintersRequest,
              com.noble.tokenfactory.QueryProto.QueryGetMintersResponse>(
                service, METHODID_MINTERS)))
        .addMethod(
          getMintersAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryAllMintersRequest,
              com.noble.tokenfactory.QueryProto.QueryAllMintersResponse>(
                service, METHODID_MINTERS_ALL)))
        .addMethod(
          getPauserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetPauserRequest,
              com.noble.tokenfactory.QueryProto.QueryGetPauserResponse>(
                service, METHODID_PAUSER)))
        .addMethod(
          getBlacklisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetBlacklisterRequest,
              com.noble.tokenfactory.QueryProto.QueryGetBlacklisterResponse>(
                service, METHODID_BLACKLISTER)))
        .addMethod(
          getOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetOwnerRequest,
              com.noble.tokenfactory.QueryProto.QueryGetOwnerResponse>(
                service, METHODID_OWNER)))
        .addMethod(
          getMinterControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetMinterControllerRequest,
              com.noble.tokenfactory.QueryProto.QueryGetMinterControllerResponse>(
                service, METHODID_MINTER_CONTROLLER)))
        .addMethod(
          getMinterControllerAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryAllMinterControllerRequest,
              com.noble.tokenfactory.QueryProto.QueryAllMinterControllerResponse>(
                service, METHODID_MINTER_CONTROLLER_ALL)))
        .addMethod(
          getMintingDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.noble.tokenfactory.QueryProto.QueryGetMintingDenomRequest,
              com.noble.tokenfactory.QueryProto.QueryGetMintingDenomResponse>(
                service, METHODID_MINTING_DENOM)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.noble.tokenfactory.QueryProto.getDescriptor();
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
              .addMethod(getBlacklistedMethod())
              .addMethod(getBlacklistedAllMethod())
              .addMethod(getPausedMethod())
              .addMethod(getMasterMinterMethod())
              .addMethod(getMintersMethod())
              .addMethod(getMintersAllMethod())
              .addMethod(getPauserMethod())
              .addMethod(getBlacklisterMethod())
              .addMethod(getOwnerMethod())
              .addMethod(getMinterControllerMethod())
              .addMethod(getMinterControllerAllMethod())
              .addMethod(getMintingDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
