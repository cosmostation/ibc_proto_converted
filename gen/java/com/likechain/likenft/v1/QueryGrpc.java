package com.likechain.likenft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: likechain/likenft/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "likechain.likenft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryParamsRequest,
      com.likechain.likenft.v1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.likechain.likenft.v1.QueryParamsRequest.class,
      responseType = com.likechain.likenft.v1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryParamsRequest,
      com.likechain.likenft.v1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryParamsRequest, com.likechain.likenft.v1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryParamsRequest, com.likechain.likenft.v1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNRequest,
      com.likechain.likenft.v1.QueryClassesByISCNResponse> getClassesByISCNMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByISCN",
      requestType = com.likechain.likenft.v1.QueryClassesByISCNRequest.class,
      responseType = com.likechain.likenft.v1.QueryClassesByISCNResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNRequest,
      com.likechain.likenft.v1.QueryClassesByISCNResponse> getClassesByISCNMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNRequest, com.likechain.likenft.v1.QueryClassesByISCNResponse> getClassesByISCNMethod;
    if ((getClassesByISCNMethod = QueryGrpc.getClassesByISCNMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByISCNMethod = QueryGrpc.getClassesByISCNMethod) == null) {
          QueryGrpc.getClassesByISCNMethod = getClassesByISCNMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryClassesByISCNRequest, com.likechain.likenft.v1.QueryClassesByISCNResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByISCN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByISCNRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByISCNResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByISCN"))
              .build();
        }
      }
    }
    return getClassesByISCNMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNIndexRequest,
      com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByISCNIndex",
      requestType = com.likechain.likenft.v1.QueryClassesByISCNIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNIndexRequest,
      com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByISCNIndexRequest, com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> getClassesByISCNIndexMethod;
    if ((getClassesByISCNIndexMethod = QueryGrpc.getClassesByISCNIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByISCNIndexMethod = QueryGrpc.getClassesByISCNIndexMethod) == null) {
          QueryGrpc.getClassesByISCNIndexMethod = getClassesByISCNIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryClassesByISCNIndexRequest, com.likechain.likenft.v1.QueryClassesByISCNIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByISCNIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByISCNIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByISCNIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByISCNIndex"))
              .build();
        }
      }
    }
    return getClassesByISCNIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryISCNByClassRequest,
      com.likechain.likenft.v1.QueryISCNByClassResponse> getISCNByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ISCNByClass",
      requestType = com.likechain.likenft.v1.QueryISCNByClassRequest.class,
      responseType = com.likechain.likenft.v1.QueryISCNByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryISCNByClassRequest,
      com.likechain.likenft.v1.QueryISCNByClassResponse> getISCNByClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryISCNByClassRequest, com.likechain.likenft.v1.QueryISCNByClassResponse> getISCNByClassMethod;
    if ((getISCNByClassMethod = QueryGrpc.getISCNByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getISCNByClassMethod = QueryGrpc.getISCNByClassMethod) == null) {
          QueryGrpc.getISCNByClassMethod = getISCNByClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryISCNByClassRequest, com.likechain.likenft.v1.QueryISCNByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ISCNByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryISCNByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryISCNByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ISCNByClass"))
              .build();
        }
      }
    }
    return getISCNByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountRequest,
      com.likechain.likenft.v1.QueryClassesByAccountResponse> getClassesByAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByAccount",
      requestType = com.likechain.likenft.v1.QueryClassesByAccountRequest.class,
      responseType = com.likechain.likenft.v1.QueryClassesByAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountRequest,
      com.likechain.likenft.v1.QueryClassesByAccountResponse> getClassesByAccountMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountRequest, com.likechain.likenft.v1.QueryClassesByAccountResponse> getClassesByAccountMethod;
    if ((getClassesByAccountMethod = QueryGrpc.getClassesByAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByAccountMethod = QueryGrpc.getClassesByAccountMethod) == null) {
          QueryGrpc.getClassesByAccountMethod = getClassesByAccountMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryClassesByAccountRequest, com.likechain.likenft.v1.QueryClassesByAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByAccount"))
              .build();
        }
      }
    }
    return getClassesByAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountIndexRequest,
      com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClassesByAccountIndex",
      requestType = com.likechain.likenft.v1.QueryClassesByAccountIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryClassesByAccountIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountIndexRequest,
      com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryClassesByAccountIndexRequest, com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> getClassesByAccountIndexMethod;
    if ((getClassesByAccountIndexMethod = QueryGrpc.getClassesByAccountIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesByAccountIndexMethod = QueryGrpc.getClassesByAccountIndexMethod) == null) {
          QueryGrpc.getClassesByAccountIndexMethod = getClassesByAccountIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryClassesByAccountIndexRequest, com.likechain.likenft.v1.QueryClassesByAccountIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClassesByAccountIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByAccountIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryClassesByAccountIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClassesByAccountIndex"))
              .build();
        }
      }
    }
    return getClassesByAccountIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryAccountByClassRequest,
      com.likechain.likenft.v1.QueryAccountByClassResponse> getAccountByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountByClass",
      requestType = com.likechain.likenft.v1.QueryAccountByClassRequest.class,
      responseType = com.likechain.likenft.v1.QueryAccountByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryAccountByClassRequest,
      com.likechain.likenft.v1.QueryAccountByClassResponse> getAccountByClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryAccountByClassRequest, com.likechain.likenft.v1.QueryAccountByClassResponse> getAccountByClassMethod;
    if ((getAccountByClassMethod = QueryGrpc.getAccountByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountByClassMethod = QueryGrpc.getAccountByClassMethod) == null) {
          QueryGrpc.getAccountByClassMethod = getAccountByClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryAccountByClassRequest, com.likechain.likenft.v1.QueryAccountByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryAccountByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryAccountByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountByClass"))
              .build();
        }
      }
    }
    return getAccountByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentResponse> getBlindBoxContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContent",
      requestType = com.likechain.likenft.v1.QueryBlindBoxContentRequest.class,
      responseType = com.likechain.likenft.v1.QueryBlindBoxContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentResponse> getBlindBoxContentMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentRequest, com.likechain.likenft.v1.QueryBlindBoxContentResponse> getBlindBoxContentMethod;
    if ((getBlindBoxContentMethod = QueryGrpc.getBlindBoxContentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentMethod = QueryGrpc.getBlindBoxContentMethod) == null) {
          QueryGrpc.getBlindBoxContentMethod = getBlindBoxContentMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryBlindBoxContentRequest, com.likechain.likenft.v1.QueryBlindBoxContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContent"))
              .build();
        }
      }
    }
    return getBlindBoxContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContentIndex",
      requestType = com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest, com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> getBlindBoxContentIndexMethod;
    if ((getBlindBoxContentIndexMethod = QueryGrpc.getBlindBoxContentIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentIndexMethod = QueryGrpc.getBlindBoxContentIndexMethod) == null) {
          QueryGrpc.getBlindBoxContentIndexMethod = getBlindBoxContentIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest, com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContentIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContentIndex"))
              .build();
        }
      }
    }
    return getBlindBoxContentIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentsRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlindBoxContents",
      requestType = com.likechain.likenft.v1.QueryBlindBoxContentsRequest.class,
      responseType = com.likechain.likenft.v1.QueryBlindBoxContentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentsRequest,
      com.likechain.likenft.v1.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryBlindBoxContentsRequest, com.likechain.likenft.v1.QueryBlindBoxContentsResponse> getBlindBoxContentsMethod;
    if ((getBlindBoxContentsMethod = QueryGrpc.getBlindBoxContentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlindBoxContentsMethod = QueryGrpc.getBlindBoxContentsMethod) == null) {
          QueryGrpc.getBlindBoxContentsMethod = getBlindBoxContentsMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryBlindBoxContentsRequest, com.likechain.likenft.v1.QueryBlindBoxContentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlindBoxContents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryBlindBoxContentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlindBoxContents"))
              .build();
        }
      }
    }
    return getBlindBoxContentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferRequest,
      com.likechain.likenft.v1.QueryOfferResponse> getOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Offer",
      requestType = com.likechain.likenft.v1.QueryOfferRequest.class,
      responseType = com.likechain.likenft.v1.QueryOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferRequest,
      com.likechain.likenft.v1.QueryOfferResponse> getOfferMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferRequest, com.likechain.likenft.v1.QueryOfferResponse> getOfferMethod;
    if ((getOfferMethod = QueryGrpc.getOfferMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOfferMethod = QueryGrpc.getOfferMethod) == null) {
          QueryGrpc.getOfferMethod = getOfferMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryOfferRequest, com.likechain.likenft.v1.QueryOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Offer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Offer"))
              .build();
        }
      }
    }
    return getOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferIndexRequest,
      com.likechain.likenft.v1.QueryOfferIndexResponse> getOfferIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferIndex",
      requestType = com.likechain.likenft.v1.QueryOfferIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryOfferIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferIndexRequest,
      com.likechain.likenft.v1.QueryOfferIndexResponse> getOfferIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOfferIndexRequest, com.likechain.likenft.v1.QueryOfferIndexResponse> getOfferIndexMethod;
    if ((getOfferIndexMethod = QueryGrpc.getOfferIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOfferIndexMethod = QueryGrpc.getOfferIndexMethod) == null) {
          QueryGrpc.getOfferIndexMethod = getOfferIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryOfferIndexRequest, com.likechain.likenft.v1.QueryOfferIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfferIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOfferIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOfferIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OfferIndex"))
              .build();
        }
      }
    }
    return getOfferIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByClassRequest,
      com.likechain.likenft.v1.QueryOffersByClassResponse> getOffersByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OffersByClass",
      requestType = com.likechain.likenft.v1.QueryOffersByClassRequest.class,
      responseType = com.likechain.likenft.v1.QueryOffersByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByClassRequest,
      com.likechain.likenft.v1.QueryOffersByClassResponse> getOffersByClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByClassRequest, com.likechain.likenft.v1.QueryOffersByClassResponse> getOffersByClassMethod;
    if ((getOffersByClassMethod = QueryGrpc.getOffersByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOffersByClassMethod = QueryGrpc.getOffersByClassMethod) == null) {
          QueryGrpc.getOffersByClassMethod = getOffersByClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryOffersByClassRequest, com.likechain.likenft.v1.QueryOffersByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OffersByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOffersByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOffersByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OffersByClass"))
              .build();
        }
      }
    }
    return getOffersByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByNFTRequest,
      com.likechain.likenft.v1.QueryOffersByNFTResponse> getOffersByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OffersByNFT",
      requestType = com.likechain.likenft.v1.QueryOffersByNFTRequest.class,
      responseType = com.likechain.likenft.v1.QueryOffersByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByNFTRequest,
      com.likechain.likenft.v1.QueryOffersByNFTResponse> getOffersByNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryOffersByNFTRequest, com.likechain.likenft.v1.QueryOffersByNFTResponse> getOffersByNFTMethod;
    if ((getOffersByNFTMethod = QueryGrpc.getOffersByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOffersByNFTMethod = QueryGrpc.getOffersByNFTMethod) == null) {
          QueryGrpc.getOffersByNFTMethod = getOffersByNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryOffersByNFTRequest, com.likechain.likenft.v1.QueryOffersByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OffersByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOffersByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryOffersByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OffersByNFT"))
              .build();
        }
      }
    }
    return getOffersByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingRequest,
      com.likechain.likenft.v1.QueryListingResponse> getListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Listing",
      requestType = com.likechain.likenft.v1.QueryListingRequest.class,
      responseType = com.likechain.likenft.v1.QueryListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingRequest,
      com.likechain.likenft.v1.QueryListingResponse> getListingMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingRequest, com.likechain.likenft.v1.QueryListingResponse> getListingMethod;
    if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
          QueryGrpc.getListingMethod = getListingMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryListingRequest, com.likechain.likenft.v1.QueryListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Listing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Listing"))
              .build();
        }
      }
    }
    return getListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingIndexRequest,
      com.likechain.likenft.v1.QueryListingIndexResponse> getListingIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingIndex",
      requestType = com.likechain.likenft.v1.QueryListingIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryListingIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingIndexRequest,
      com.likechain.likenft.v1.QueryListingIndexResponse> getListingIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingIndexRequest, com.likechain.likenft.v1.QueryListingIndexResponse> getListingIndexMethod;
    if ((getListingIndexMethod = QueryGrpc.getListingIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingIndexMethod = QueryGrpc.getListingIndexMethod) == null) {
          QueryGrpc.getListingIndexMethod = getListingIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryListingIndexRequest, com.likechain.likenft.v1.QueryListingIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingIndex"))
              .build();
        }
      }
    }
    return getListingIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByClassRequest,
      com.likechain.likenft.v1.QueryListingsByClassResponse> getListingsByClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByClass",
      requestType = com.likechain.likenft.v1.QueryListingsByClassRequest.class,
      responseType = com.likechain.likenft.v1.QueryListingsByClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByClassRequest,
      com.likechain.likenft.v1.QueryListingsByClassResponse> getListingsByClassMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByClassRequest, com.likechain.likenft.v1.QueryListingsByClassResponse> getListingsByClassMethod;
    if ((getListingsByClassMethod = QueryGrpc.getListingsByClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByClassMethod = QueryGrpc.getListingsByClassMethod) == null) {
          QueryGrpc.getListingsByClassMethod = getListingsByClassMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryListingsByClassRequest, com.likechain.likenft.v1.QueryListingsByClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByClass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingsByClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingsByClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByClass"))
              .build();
        }
      }
    }
    return getListingsByClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByNFTRequest,
      com.likechain.likenft.v1.QueryListingsByNFTResponse> getListingsByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByNFT",
      requestType = com.likechain.likenft.v1.QueryListingsByNFTRequest.class,
      responseType = com.likechain.likenft.v1.QueryListingsByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByNFTRequest,
      com.likechain.likenft.v1.QueryListingsByNFTResponse> getListingsByNFTMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryListingsByNFTRequest, com.likechain.likenft.v1.QueryListingsByNFTResponse> getListingsByNFTMethod;
    if ((getListingsByNFTMethod = QueryGrpc.getListingsByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByNFTMethod = QueryGrpc.getListingsByNFTMethod) == null) {
          QueryGrpc.getListingsByNFTMethod = getListingsByNFTMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryListingsByNFTRequest, com.likechain.likenft.v1.QueryListingsByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingsByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryListingsByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByNFT"))
              .build();
        }
      }
    }
    return getListingsByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigRequest,
      com.likechain.likenft.v1.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoyaltyConfig",
      requestType = com.likechain.likenft.v1.QueryRoyaltyConfigRequest.class,
      responseType = com.likechain.likenft.v1.QueryRoyaltyConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigRequest,
      com.likechain.likenft.v1.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigRequest, com.likechain.likenft.v1.QueryRoyaltyConfigResponse> getRoyaltyConfigMethod;
    if ((getRoyaltyConfigMethod = QueryGrpc.getRoyaltyConfigMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRoyaltyConfigMethod = QueryGrpc.getRoyaltyConfigMethod) == null) {
          QueryGrpc.getRoyaltyConfigMethod = getRoyaltyConfigMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryRoyaltyConfigRequest, com.likechain.likenft.v1.QueryRoyaltyConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoyaltyConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryRoyaltyConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryRoyaltyConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RoyaltyConfig"))
              .build();
        }
      }
    }
    return getRoyaltyConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest,
      com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RoyaltyConfigIndex",
      requestType = com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest.class,
      responseType = com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest,
      com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod() {
    io.grpc.MethodDescriptor<com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest, com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> getRoyaltyConfigIndexMethod;
    if ((getRoyaltyConfigIndexMethod = QueryGrpc.getRoyaltyConfigIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRoyaltyConfigIndexMethod = QueryGrpc.getRoyaltyConfigIndexMethod) == null) {
          QueryGrpc.getRoyaltyConfigIndexMethod = getRoyaltyConfigIndexMethod =
              io.grpc.MethodDescriptor.<com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest, com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RoyaltyConfigIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RoyaltyConfigIndex"))
              .build();
        }
      }
    }
    return getRoyaltyConfigIndexMethod;
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
    default void params(com.likechain.likenft.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    default void classesByISCN(com.likechain.likenft.v1.QueryClassesByISCNRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesByISCNMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    default void classesByISCNIndex(com.likechain.likenft.v1.QueryClassesByISCNIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesByISCNIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    default void iSCNByClass(com.likechain.likenft.v1.QueryISCNByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryISCNByClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getISCNByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    default void classesByAccount(com.likechain.likenft.v1.QueryClassesByAccountRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesByAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    default void classesByAccountIndex(com.likechain.likenft.v1.QueryClassesByAccountIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesByAccountIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    default void accountByClass(com.likechain.likenft.v1.QueryAccountByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryAccountByClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    default void blindBoxContent(com.likechain.likenft.v1.QueryBlindBoxContentRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlindBoxContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    default void blindBoxContentIndex(com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlindBoxContentIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    default void blindBoxContents(com.likechain.likenft.v1.QueryBlindBoxContentsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlindBoxContentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    default void offer(com.likechain.likenft.v1.QueryOfferRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    default void offerIndex(com.likechain.likenft.v1.QueryOfferIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfferIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    default void offersByClass(com.likechain.likenft.v1.QueryOffersByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOffersByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    default void offersByNFT(com.likechain.likenft.v1.QueryOffersByNFTRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOffersByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    default void listing(com.likechain.likenft.v1.QueryListingRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    default void listingIndex(com.likechain.likenft.v1.QueryListingIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    default void listingsByClass(com.likechain.likenft.v1.QueryListingsByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingsByClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    default void listingsByNFT(com.likechain.likenft.v1.QueryListingsByNFTRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingsByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    default void royaltyConfig(com.likechain.likenft.v1.QueryRoyaltyConfigRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRoyaltyConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    default void royaltyConfigIndex(com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRoyaltyConfigIndexMethod(), responseObserver);
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
    public void params(com.likechain.likenft.v1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public void classesByISCN(com.likechain.likenft.v1.QueryClassesByISCNRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesByISCNMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public void classesByISCNIndex(com.likechain.likenft.v1.QueryClassesByISCNIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesByISCNIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public void iSCNByClass(com.likechain.likenft.v1.QueryISCNByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryISCNByClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getISCNByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public void classesByAccount(com.likechain.likenft.v1.QueryClassesByAccountRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesByAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public void classesByAccountIndex(com.likechain.likenft.v1.QueryClassesByAccountIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesByAccountIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public void accountByClass(com.likechain.likenft.v1.QueryAccountByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryAccountByClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public void blindBoxContent(com.likechain.likenft.v1.QueryBlindBoxContentRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public void blindBoxContentIndex(com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public void blindBoxContents(com.likechain.likenft.v1.QueryBlindBoxContentsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlindBoxContentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public void offer(com.likechain.likenft.v1.QueryOfferRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public void offerIndex(com.likechain.likenft.v1.QueryOfferIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfferIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public void offersByClass(com.likechain.likenft.v1.QueryOffersByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOffersByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public void offersByNFT(com.likechain.likenft.v1.QueryOffersByNFTRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOffersByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public void listing(com.likechain.likenft.v1.QueryListingRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public void listingIndex(com.likechain.likenft.v1.QueryListingIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public void listingsByClass(com.likechain.likenft.v1.QueryListingsByClassRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingsByClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public void listingsByNFT(com.likechain.likenft.v1.QueryListingsByNFTRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingsByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public void royaltyConfig(com.likechain.likenft.v1.QueryRoyaltyConfigRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRoyaltyConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public void royaltyConfigIndex(com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest request,
        io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRoyaltyConfigIndexMethod(), getCallOptions()), request, responseObserver);
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
    public com.likechain.likenft.v1.QueryParamsResponse params(com.likechain.likenft.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryClassesByISCNResponse classesByISCN(com.likechain.likenft.v1.QueryClassesByISCNRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesByISCNMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryClassesByISCNIndexResponse classesByISCNIndex(com.likechain.likenft.v1.QueryClassesByISCNIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesByISCNIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryISCNByClassResponse iSCNByClass(com.likechain.likenft.v1.QueryISCNByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getISCNByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryClassesByAccountResponse classesByAccount(com.likechain.likenft.v1.QueryClassesByAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesByAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryClassesByAccountIndexResponse classesByAccountIndex(com.likechain.likenft.v1.QueryClassesByAccountIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesByAccountIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryAccountByClassResponse accountByClass(com.likechain.likenft.v1.QueryAccountByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryBlindBoxContentResponse blindBoxContent(com.likechain.likenft.v1.QueryBlindBoxContentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlindBoxContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse blindBoxContentIndex(com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlindBoxContentIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public com.likechain.likenft.v1.QueryBlindBoxContentsResponse blindBoxContents(com.likechain.likenft.v1.QueryBlindBoxContentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlindBoxContentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryOfferResponse offer(com.likechain.likenft.v1.QueryOfferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryOfferIndexResponse offerIndex(com.likechain.likenft.v1.QueryOfferIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfferIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryOffersByClassResponse offersByClass(com.likechain.likenft.v1.QueryOffersByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOffersByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryOffersByNFTResponse offersByNFT(com.likechain.likenft.v1.QueryOffersByNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOffersByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryListingResponse listing(com.likechain.likenft.v1.QueryListingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public com.likechain.likenft.v1.QueryListingIndexResponse listingIndex(com.likechain.likenft.v1.QueryListingIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public com.likechain.likenft.v1.QueryListingsByClassResponse listingsByClass(com.likechain.likenft.v1.QueryListingsByClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingsByClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public com.likechain.likenft.v1.QueryListingsByNFTResponse listingsByNFT(com.likechain.likenft.v1.QueryListingsByNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingsByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public com.likechain.likenft.v1.QueryRoyaltyConfigResponse royaltyConfig(com.likechain.likenft.v1.QueryRoyaltyConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRoyaltyConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse royaltyConfigIndex(com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRoyaltyConfigIndexMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryParamsResponse> params(
        com.likechain.likenft.v1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a ClassesByISCN by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryClassesByISCNResponse> classesByISCN(
        com.likechain.likenft.v1.QueryClassesByISCNRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesByISCNMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByISCN items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryClassesByISCNIndexResponse> classesByISCNIndex(
        com.likechain.likenft.v1.QueryClassesByISCNIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesByISCNIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ISCNByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryISCNByClassResponse> iSCNByClass(
        com.likechain.likenft.v1.QueryISCNByClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getISCNByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a ClassesByAccount by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryClassesByAccountResponse> classesByAccount(
        com.likechain.likenft.v1.QueryClassesByAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesByAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClassesByAccount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryClassesByAccountIndexResponse> classesByAccountIndex(
        com.likechain.likenft.v1.QueryClassesByAccountIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesByAccountIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of AccountByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryAccountByClassResponse> accountByClass(
        com.likechain.likenft.v1.QueryAccountByClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a BlindBoxContent by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryBlindBoxContentResponse> blindBoxContent(
        com.likechain.likenft.v1.QueryBlindBoxContentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlindBoxContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContent items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse> blindBoxContentIndex(
        com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlindBoxContentIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BlindBoxContents by class_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryBlindBoxContentsResponse> blindBoxContents(
        com.likechain.likenft.v1.QueryBlindBoxContentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlindBoxContentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Offer by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryOfferResponse> offer(
        com.likechain.likenft.v1.QueryOfferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Offer items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryOfferIndexResponse> offerIndex(
        com.likechain.likenft.v1.QueryOfferIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfferIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByClass items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryOffersByClassResponse> offersByClass(
        com.likechain.likenft.v1.QueryOffersByClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOffersByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of OffersByNFT items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryOffersByNFTResponse> offersByNFT(
        com.likechain.likenft.v1.QueryOffersByNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOffersByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Listing by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryListingResponse> listing(
        com.likechain.likenft.v1.QueryListingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryListingIndexResponse> listingIndex(
        com.likechain.likenft.v1.QueryListingIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by class
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryListingsByClassResponse> listingsByClass(
        com.likechain.likenft.v1.QueryListingsByClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingsByClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Listing items by nft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryListingsByNFTResponse> listingsByNFT(
        com.likechain.likenft.v1.QueryListingsByNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingsByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a RoyaltyConfig by class
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryRoyaltyConfigResponse> royaltyConfig(
        com.likechain.likenft.v1.QueryRoyaltyConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRoyaltyConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries index of RoyaltyConfig of all classes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse> royaltyConfigIndex(
        com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRoyaltyConfigIndexMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CLASSES_BY_ISCN = 1;
  private static final int METHODID_CLASSES_BY_ISCNINDEX = 2;
  private static final int METHODID_ISCNBY_CLASS = 3;
  private static final int METHODID_CLASSES_BY_ACCOUNT = 4;
  private static final int METHODID_CLASSES_BY_ACCOUNT_INDEX = 5;
  private static final int METHODID_ACCOUNT_BY_CLASS = 6;
  private static final int METHODID_BLIND_BOX_CONTENT = 7;
  private static final int METHODID_BLIND_BOX_CONTENT_INDEX = 8;
  private static final int METHODID_BLIND_BOX_CONTENTS = 9;
  private static final int METHODID_OFFER = 10;
  private static final int METHODID_OFFER_INDEX = 11;
  private static final int METHODID_OFFERS_BY_CLASS = 12;
  private static final int METHODID_OFFERS_BY_NFT = 13;
  private static final int METHODID_LISTING = 14;
  private static final int METHODID_LISTING_INDEX = 15;
  private static final int METHODID_LISTINGS_BY_CLASS = 16;
  private static final int METHODID_LISTINGS_BY_NFT = 17;
  private static final int METHODID_ROYALTY_CONFIG = 18;
  private static final int METHODID_ROYALTY_CONFIG_INDEX = 19;

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
          serviceImpl.params((com.likechain.likenft.v1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ISCN:
          serviceImpl.classesByISCN((com.likechain.likenft.v1.QueryClassesByISCNRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ISCNINDEX:
          serviceImpl.classesByISCNIndex((com.likechain.likenft.v1.QueryClassesByISCNIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByISCNIndexResponse>) responseObserver);
          break;
        case METHODID_ISCNBY_CLASS:
          serviceImpl.iSCNByClass((com.likechain.likenft.v1.QueryISCNByClassRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryISCNByClassResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ACCOUNT:
          serviceImpl.classesByAccount((com.likechain.likenft.v1.QueryClassesByAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountResponse>) responseObserver);
          break;
        case METHODID_CLASSES_BY_ACCOUNT_INDEX:
          serviceImpl.classesByAccountIndex((com.likechain.likenft.v1.QueryClassesByAccountIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryClassesByAccountIndexResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BY_CLASS:
          serviceImpl.accountByClass((com.likechain.likenft.v1.QueryAccountByClassRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryAccountByClassResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENT:
          serviceImpl.blindBoxContent((com.likechain.likenft.v1.QueryBlindBoxContentRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENT_INDEX:
          serviceImpl.blindBoxContentIndex((com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse>) responseObserver);
          break;
        case METHODID_BLIND_BOX_CONTENTS:
          serviceImpl.blindBoxContents((com.likechain.likenft.v1.QueryBlindBoxContentsRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryBlindBoxContentsResponse>) responseObserver);
          break;
        case METHODID_OFFER:
          serviceImpl.offer((com.likechain.likenft.v1.QueryOfferRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferResponse>) responseObserver);
          break;
        case METHODID_OFFER_INDEX:
          serviceImpl.offerIndex((com.likechain.likenft.v1.QueryOfferIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOfferIndexResponse>) responseObserver);
          break;
        case METHODID_OFFERS_BY_CLASS:
          serviceImpl.offersByClass((com.likechain.likenft.v1.QueryOffersByClassRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByClassResponse>) responseObserver);
          break;
        case METHODID_OFFERS_BY_NFT:
          serviceImpl.offersByNFT((com.likechain.likenft.v1.QueryOffersByNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryOffersByNFTResponse>) responseObserver);
          break;
        case METHODID_LISTING:
          serviceImpl.listing((com.likechain.likenft.v1.QueryListingRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingResponse>) responseObserver);
          break;
        case METHODID_LISTING_INDEX:
          serviceImpl.listingIndex((com.likechain.likenft.v1.QueryListingIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingIndexResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_CLASS:
          serviceImpl.listingsByClass((com.likechain.likenft.v1.QueryListingsByClassRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByClassResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_NFT:
          serviceImpl.listingsByNFT((com.likechain.likenft.v1.QueryListingsByNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryListingsByNFTResponse>) responseObserver);
          break;
        case METHODID_ROYALTY_CONFIG:
          serviceImpl.royaltyConfig((com.likechain.likenft.v1.QueryRoyaltyConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigResponse>) responseObserver);
          break;
        case METHODID_ROYALTY_CONFIG_INDEX:
          serviceImpl.royaltyConfigIndex((com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse>) responseObserver);
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
              com.likechain.likenft.v1.QueryParamsRequest,
              com.likechain.likenft.v1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getClassesByISCNMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryClassesByISCNRequest,
              com.likechain.likenft.v1.QueryClassesByISCNResponse>(
                service, METHODID_CLASSES_BY_ISCN)))
        .addMethod(
          getClassesByISCNIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryClassesByISCNIndexRequest,
              com.likechain.likenft.v1.QueryClassesByISCNIndexResponse>(
                service, METHODID_CLASSES_BY_ISCNINDEX)))
        .addMethod(
          getISCNByClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryISCNByClassRequest,
              com.likechain.likenft.v1.QueryISCNByClassResponse>(
                service, METHODID_ISCNBY_CLASS)))
        .addMethod(
          getClassesByAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryClassesByAccountRequest,
              com.likechain.likenft.v1.QueryClassesByAccountResponse>(
                service, METHODID_CLASSES_BY_ACCOUNT)))
        .addMethod(
          getClassesByAccountIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryClassesByAccountIndexRequest,
              com.likechain.likenft.v1.QueryClassesByAccountIndexResponse>(
                service, METHODID_CLASSES_BY_ACCOUNT_INDEX)))
        .addMethod(
          getAccountByClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryAccountByClassRequest,
              com.likechain.likenft.v1.QueryAccountByClassResponse>(
                service, METHODID_ACCOUNT_BY_CLASS)))
        .addMethod(
          getBlindBoxContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryBlindBoxContentRequest,
              com.likechain.likenft.v1.QueryBlindBoxContentResponse>(
                service, METHODID_BLIND_BOX_CONTENT)))
        .addMethod(
          getBlindBoxContentIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryBlindBoxContentIndexRequest,
              com.likechain.likenft.v1.QueryBlindBoxContentIndexResponse>(
                service, METHODID_BLIND_BOX_CONTENT_INDEX)))
        .addMethod(
          getBlindBoxContentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryBlindBoxContentsRequest,
              com.likechain.likenft.v1.QueryBlindBoxContentsResponse>(
                service, METHODID_BLIND_BOX_CONTENTS)))
        .addMethod(
          getOfferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryOfferRequest,
              com.likechain.likenft.v1.QueryOfferResponse>(
                service, METHODID_OFFER)))
        .addMethod(
          getOfferIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryOfferIndexRequest,
              com.likechain.likenft.v1.QueryOfferIndexResponse>(
                service, METHODID_OFFER_INDEX)))
        .addMethod(
          getOffersByClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryOffersByClassRequest,
              com.likechain.likenft.v1.QueryOffersByClassResponse>(
                service, METHODID_OFFERS_BY_CLASS)))
        .addMethod(
          getOffersByNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryOffersByNFTRequest,
              com.likechain.likenft.v1.QueryOffersByNFTResponse>(
                service, METHODID_OFFERS_BY_NFT)))
        .addMethod(
          getListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryListingRequest,
              com.likechain.likenft.v1.QueryListingResponse>(
                service, METHODID_LISTING)))
        .addMethod(
          getListingIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryListingIndexRequest,
              com.likechain.likenft.v1.QueryListingIndexResponse>(
                service, METHODID_LISTING_INDEX)))
        .addMethod(
          getListingsByClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryListingsByClassRequest,
              com.likechain.likenft.v1.QueryListingsByClassResponse>(
                service, METHODID_LISTINGS_BY_CLASS)))
        .addMethod(
          getListingsByNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryListingsByNFTRequest,
              com.likechain.likenft.v1.QueryListingsByNFTResponse>(
                service, METHODID_LISTINGS_BY_NFT)))
        .addMethod(
          getRoyaltyConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryRoyaltyConfigRequest,
              com.likechain.likenft.v1.QueryRoyaltyConfigResponse>(
                service, METHODID_ROYALTY_CONFIG)))
        .addMethod(
          getRoyaltyConfigIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest,
              com.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse>(
                service, METHODID_ROYALTY_CONFIG_INDEX)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.likechain.likenft.v1.QueryProto.getDescriptor();
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
              .addMethod(getClassesByISCNMethod())
              .addMethod(getClassesByISCNIndexMethod())
              .addMethod(getISCNByClassMethod())
              .addMethod(getClassesByAccountMethod())
              .addMethod(getClassesByAccountIndexMethod())
              .addMethod(getAccountByClassMethod())
              .addMethod(getBlindBoxContentMethod())
              .addMethod(getBlindBoxContentIndexMethod())
              .addMethod(getBlindBoxContentsMethod())
              .addMethod(getOfferMethod())
              .addMethod(getOfferIndexMethod())
              .addMethod(getOffersByClassMethod())
              .addMethod(getOffersByNFTMethod())
              .addMethod(getListingMethod())
              .addMethod(getListingIndexMethod())
              .addMethod(getListingsByClassMethod())
              .addMethod(getListingsByNFTMethod())
              .addMethod(getRoyaltyConfigMethod())
              .addMethod(getRoyaltyConfigIndexMethod())
              .build();
        }
      }
    }
    return result;
  }
}
