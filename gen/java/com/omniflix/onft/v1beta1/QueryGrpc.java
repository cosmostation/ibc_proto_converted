package com.OmniFlix.onft.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/onft/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.onft.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getIBCCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCCollection",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getIBCCollectionMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> getIBCCollectionMethod;
    if ((getIBCCollectionMethod = QueryGrpc.getIBCCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCCollectionMethod = QueryGrpc.getIBCCollectionMethod) == null) {
          QueryGrpc.getIBCCollectionMethod = getIBCCollectionMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCCollection"))
              .build();
        }
      }
    }
    return getIBCCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
              .build();
        }
      }
    }
    return getDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getIBCDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCDenom",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getIBCDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> getIBCDenomMethod;
    if ((getIBCDenomMethod = QueryGrpc.getIBCDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCDenomMethod = QueryGrpc.getIBCDenomMethod) == null) {
          QueryGrpc.getIBCDenomMethod = getIBCDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCDenom"))
              .build();
        }
      }
    }
    return getIBCDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> getDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denoms",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> getDenomsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> getDenomsMethod;
    if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
          QueryGrpc.getDenomsMethod = getDenomsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denoms"))
              .build();
        }
      }
    }
    return getDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getONFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ONFT",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getONFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getONFTMethod;
    if ((getONFTMethod = QueryGrpc.getONFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getONFTMethod = QueryGrpc.getONFTMethod) == null) {
          QueryGrpc.getONFTMethod = getONFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ONFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ONFT"))
              .build();
        }
      }
    }
    return getONFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getIBCDenomONFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCDenomONFT",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getIBCDenomONFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> getIBCDenomONFTMethod;
    if ((getIBCDenomONFTMethod = QueryGrpc.getIBCDenomONFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCDenomONFTMethod = QueryGrpc.getIBCDenomONFTMethod) == null) {
          QueryGrpc.getIBCDenomONFTMethod = getIBCDenomONFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCDenomONFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCDenomONFT"))
              .build();
        }
      }
    }
    return getIBCDenomONFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerONFTsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OwnerONFTs",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerONFTsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerONFTsMethod;
    if ((getOwnerONFTsMethod = QueryGrpc.getOwnerONFTsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerONFTsMethod = QueryGrpc.getOwnerONFTsMethod) == null) {
          QueryGrpc.getOwnerONFTsMethod = getOwnerONFTsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OwnerONFTs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OwnerONFTs"))
              .build();
        }
      }
    }
    return getOwnerONFTsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerIBCDenomONFTsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OwnerIBCDenomONFTs",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerIBCDenomONFTsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> getOwnerIBCDenomONFTsMethod;
    if ((getOwnerIBCDenomONFTsMethod = QueryGrpc.getOwnerIBCDenomONFTsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerIBCDenomONFTsMethod = QueryGrpc.getOwnerIBCDenomONFTsMethod) == null) {
          QueryGrpc.getOwnerIBCDenomONFTsMethod = getOwnerIBCDenomONFTsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OwnerIBCDenomONFTs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OwnerIBCDenomONFTs"))
              .build();
        }
      }
    }
    return getOwnerIBCDenomONFTsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest, com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest, com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getIBCDenomSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IBCDenomSupply",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getIBCDenomSupplyMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest, com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> getIBCDenomSupplyMethod;
    if ((getIBCDenomSupplyMethod = QueryGrpc.getIBCDenomSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIBCDenomSupplyMethod = QueryGrpc.getIBCDenomSupplyMethod) == null) {
          QueryGrpc.getIBCDenomSupplyMethod = getIBCDenomSupplyMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest, com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IBCDenomSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IBCDenomSupply"))
              .build();
        }
      }
    }
    return getIBCDenomSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest,
      com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest, com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
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
   */
  public interface AsyncService {

    /**
     */
    default void collection(com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     */
    default void iBCCollection(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCCollectionMethod(), responseObserver);
    }

    /**
     */
    default void denom(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }

    /**
     */
    default void iBCDenom(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCDenomMethod(), responseObserver);
    }

    /**
     */
    default void denoms(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsMethod(), responseObserver);
    }

    /**
     */
    default void oNFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getONFTMethod(), responseObserver);
    }

    /**
     */
    default void iBCDenomONFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCDenomONFTMethod(), responseObserver);
    }

    /**
     */
    default void ownerONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerONFTsMethod(), responseObserver);
    }

    /**
     */
    default void ownerIBCDenomONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerIBCDenomONFTsMethod(), responseObserver);
    }

    /**
     */
    default void supply(com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     */
    default void iBCDenomSupply(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIBCDenomSupplyMethod(), responseObserver);
    }

    /**
     */
    default void params(com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     */
    public void collection(com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iBCCollection(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void denom(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iBCDenom(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void denoms(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void oNFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getONFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iBCDenomONFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCDenomONFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ownerONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerONFTsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ownerIBCDenomONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerIBCDenomONFTsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void supply(com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void iBCDenomSupply(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIBCDenomSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse collection(com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse iBCCollection(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse denom(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse iBCDenom(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse denoms(com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse oNFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getONFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse iBCDenomONFT(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCDenomONFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse ownerONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerONFTsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse ownerIBCDenomONFTs(com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerIBCDenomONFTsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse supply(com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse iBCDenomSupply(com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIBCDenomSupplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse params(com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> collection(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse> iBCCollection(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> denom(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse> iBCDenom(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse> denoms(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> oNFT(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getONFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse> iBCDenomONFT(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCDenomONFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> ownerONFTs(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerONFTsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse> ownerIBCDenomONFTs(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerIBCDenomONFTsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> supply(
        com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse> iBCDenomSupply(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIBCDenomSupplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse> params(
        com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECTION = 0;
  private static final int METHODID_IBCCOLLECTION = 1;
  private static final int METHODID_DENOM = 2;
  private static final int METHODID_IBCDENOM = 3;
  private static final int METHODID_DENOMS = 4;
  private static final int METHODID_ONFT = 5;
  private static final int METHODID_IBCDENOM_ONFT = 6;
  private static final int METHODID_OWNER_ONFTS = 7;
  private static final int METHODID_OWNER_IBCDENOM_ONFTS = 8;
  private static final int METHODID_SUPPLY = 9;
  private static final int METHODID_IBCDENOM_SUPPLY = 10;
  private static final int METHODID_PARAMS = 11;

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
        case METHODID_COLLECTION:
          serviceImpl.collection((com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_IBCCOLLECTION:
          serviceImpl.iBCCollection((com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_IBCDENOM:
          serviceImpl.iBCDenom((com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_DENOMS:
          serviceImpl.denoms((com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse>) responseObserver);
          break;
        case METHODID_ONFT:
          serviceImpl.oNFT((com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>) responseObserver);
          break;
        case METHODID_IBCDENOM_ONFT:
          serviceImpl.iBCDenomONFT((com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>) responseObserver);
          break;
        case METHODID_OWNER_ONFTS:
          serviceImpl.ownerONFTs((com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>) responseObserver);
          break;
        case METHODID_OWNER_IBCDENOM_ONFTS:
          serviceImpl.ownerIBCDenomONFTs((com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>) responseObserver);
          break;
        case METHODID_SUPPLY:
          serviceImpl.supply((com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_IBCDENOM_SUPPLY:
          serviceImpl.iBCDenomSupply((com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>(
                service, METHODID_COLLECTION)))
        .addMethod(
          getIBCCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCCollectionRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryCollectionResponse>(
                service, METHODID_IBCCOLLECTION)))
        .addMethod(
          getDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>(
                service, METHODID_DENOM)))
        .addMethod(
          getIBCDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomResponse>(
                service, METHODID_IBCDENOM)))
        .addMethod(
          getDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryDenomsResponse>(
                service, METHODID_DENOMS)))
        .addMethod(
          getONFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>(
                service, METHODID_ONFT)))
        .addMethod(
          getIBCDenomONFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomONFTRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryONFTResponse>(
                service, METHODID_IBCDENOM_ONFT)))
        .addMethod(
          getOwnerONFTsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>(
                service, METHODID_OWNER_ONFTS)))
        .addMethod(
          getOwnerIBCDenomONFTsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerIBCDenomONFTsRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryOwnerONFTsResponse>(
                service, METHODID_OWNER_IBCDENOM_ONFTS)))
        .addMethod(
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getIBCDenomSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryIBCDenomSupplyRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QuerySupplyResponse>(
                service, METHODID_IBCDENOM_SUPPLY)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsRequest,
              com.OmniFlix.onft.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.onft.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getCollectionMethod())
              .addMethod(getIBCCollectionMethod())
              .addMethod(getDenomMethod())
              .addMethod(getIBCDenomMethod())
              .addMethod(getDenomsMethod())
              .addMethod(getONFTMethod())
              .addMethod(getIBCDenomONFTMethod())
              .addMethod(getOwnerONFTsMethod())
              .addMethod(getOwnerIBCDenomONFTsMethod())
              .addMethod(getSupplyMethod())
              .addMethod(getIBCDenomSupplyMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
