package com.zrchain.treasury;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/treasury/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "zrchain.treasury.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryParamsRequest,
      com.zrchain.treasury.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.zrchain.treasury.QueryProto.QueryParamsRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryParamsRequest,
      com.zrchain.treasury.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryParamsRequest, com.zrchain.treasury.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryParamsRequest, com.zrchain.treasury.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest,
      com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> getKeyRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyRequests",
      requestType = com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest,
      com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> getKeyRequestsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest, com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> getKeyRequestsMethod;
    if ((getKeyRequestsMethod = QueryGrpc.getKeyRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyRequestsMethod = QueryGrpc.getKeyRequestsMethod) == null) {
          QueryGrpc.getKeyRequestsMethod = getKeyRequestsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest, com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("KeyRequests"))
              .build();
        }
      }
    }
    return getKeyRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> getKeyRequestByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyRequestByID",
      requestType = com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> getKeyRequestByIDMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest, com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> getKeyRequestByIDMethod;
    if ((getKeyRequestByIDMethod = QueryGrpc.getKeyRequestByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyRequestByIDMethod = QueryGrpc.getKeyRequestByIDMethod) == null) {
          QueryGrpc.getKeyRequestByIDMethod = getKeyRequestByIDMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest, com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyRequestByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("KeyRequestByID"))
              .build();
        }
      }
    }
    return getKeyRequestByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeysRequest,
      com.zrchain.treasury.QueryProto.QueryKeysResponse> getKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Keys",
      requestType = com.zrchain.treasury.QueryProto.QueryKeysRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeysRequest,
      com.zrchain.treasury.QueryProto.QueryKeysResponse> getKeysMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeysRequest, com.zrchain.treasury.QueryProto.QueryKeysResponse> getKeysMethod;
    if ((getKeysMethod = QueryGrpc.getKeysMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeysMethod = QueryGrpc.getKeysMethod) == null) {
          QueryGrpc.getKeysMethod = getKeysMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryKeysRequest, com.zrchain.treasury.QueryProto.QueryKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Keys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Keys"))
              .build();
        }
      }
    }
    return getKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByIDRequest,
      com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> getKeyByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyByID",
      requestType = com.zrchain.treasury.QueryProto.QueryKeyByIDRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryKeyByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByIDRequest,
      com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> getKeyByIDMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByIDRequest, com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> getKeyByIDMethod;
    if ((getKeyByIDMethod = QueryGrpc.getKeyByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyByIDMethod = QueryGrpc.getKeyByIDMethod) == null) {
          QueryGrpc.getKeyByIDMethod = getKeyByIDMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryKeyByIDRequest, com.zrchain.treasury.QueryProto.QueryKeyByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("KeyByID"))
              .build();
        }
      }
    }
    return getKeyByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest,
      com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> getSignatureRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignatureRequests",
      requestType = com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest,
      com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> getSignatureRequestsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest, com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> getSignatureRequestsMethod;
    if ((getSignatureRequestsMethod = QueryGrpc.getSignatureRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignatureRequestsMethod = QueryGrpc.getSignatureRequestsMethod) == null) {
          QueryGrpc.getSignatureRequestsMethod = getSignatureRequestsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest, com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignatureRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SignatureRequests"))
              .build();
        }
      }
    }
    return getSignatureRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> getSignatureRequestByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignatureRequestByID",
      requestType = com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> getSignatureRequestByIDMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest, com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> getSignatureRequestByIDMethod;
    if ((getSignatureRequestByIDMethod = QueryGrpc.getSignatureRequestByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignatureRequestByIDMethod = QueryGrpc.getSignatureRequestByIDMethod) == null) {
          QueryGrpc.getSignatureRequestByIDMethod = getSignatureRequestByIDMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest, com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignatureRequestByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SignatureRequestByID"))
              .build();
        }
      }
    }
    return getSignatureRequestByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest,
      com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> getSignTransactionRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignTransactionRequests",
      requestType = com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest,
      com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> getSignTransactionRequestsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest, com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> getSignTransactionRequestsMethod;
    if ((getSignTransactionRequestsMethod = QueryGrpc.getSignTransactionRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignTransactionRequestsMethod = QueryGrpc.getSignTransactionRequestsMethod) == null) {
          QueryGrpc.getSignTransactionRequestsMethod = getSignTransactionRequestsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest, com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransactionRequests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SignTransactionRequests"))
              .build();
        }
      }
    }
    return getSignTransactionRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> getSignTransactionRequestByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignTransactionRequestByID",
      requestType = com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest,
      com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> getSignTransactionRequestByIDMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest, com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> getSignTransactionRequestByIDMethod;
    if ((getSignTransactionRequestByIDMethod = QueryGrpc.getSignTransactionRequestByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignTransactionRequestByIDMethod = QueryGrpc.getSignTransactionRequestByIDMethod) == null) {
          QueryGrpc.getSignTransactionRequestByIDMethod = getSignTransactionRequestByIDMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest, com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignTransactionRequestByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SignTransactionRequestByID"))
              .build();
        }
      }
    }
    return getSignTransactionRequestByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest,
      com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> getZrSignKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZrSignKeys",
      requestType = com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest,
      com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> getZrSignKeysMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest, com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> getZrSignKeysMethod;
    if ((getZrSignKeysMethod = QueryGrpc.getZrSignKeysMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZrSignKeysMethod = QueryGrpc.getZrSignKeysMethod) == null) {
          QueryGrpc.getZrSignKeysMethod = getZrSignKeysMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest, com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZrSignKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZrSignKeys"))
              .build();
        }
      }
    }
    return getZrSignKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest,
      com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> getKeyByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyByAddress",
      requestType = com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest,
      com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> getKeyByAddressMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest, com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> getKeyByAddressMethod;
    if ((getKeyByAddressMethod = QueryGrpc.getKeyByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getKeyByAddressMethod = QueryGrpc.getKeyByAddressMethod) == null) {
          QueryGrpc.getKeyByAddressMethod = getKeyByAddressMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest, com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("KeyByAddress"))
              .build();
        }
      }
    }
    return getKeyByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest,
      com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> getZenbtcWalletsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZenbtcWallets",
      requestType = com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest.class,
      responseType = com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest,
      com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> getZenbtcWalletsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest, com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> getZenbtcWalletsMethod;
    if ((getZenbtcWalletsMethod = QueryGrpc.getZenbtcWalletsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZenbtcWalletsMethod = QueryGrpc.getZenbtcWalletsMethod) == null) {
          QueryGrpc.getZenbtcWalletsMethod = getZenbtcWalletsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest, com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZenbtcWallets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZenbtcWallets"))
              .build();
        }
      }
    }
    return getZenbtcWalletsMethod;
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
    default void params(com.zrchain.treasury.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyRequests items.
     * </pre>
     */
    default void keyRequests(com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyRequestByID items.
     * </pre>
     */
    default void keyRequestByID(com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyRequestByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Keys items.
     * </pre>
     */
    default void keys(com.zrchain.treasury.QueryProto.QueryKeysRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyByID items.
     * </pre>
     */
    default void keyByID(com.zrchain.treasury.QueryProto.QueryKeyByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequests items.
     * </pre>
     */
    default void signatureRequests(com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignatureRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequestByID items.
     * </pre>
     */
    default void signatureRequestByID(com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignatureRequestByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequests items.
     * </pre>
     */
    default void signTransactionRequests(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTransactionRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequestByID items.
     * </pre>
     */
    default void signTransactionRequestByID(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignTransactionRequestByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ZrSignKeys items.
     * </pre>
     */
    default void zrSignKeys(com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZrSignKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyByAddress items.
     * </pre>
     */
    default void keyByAddress(com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ZenbtcWallets items.
     * </pre>
     */
    default void zenbtcWallets(com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZenbtcWalletsMethod(), responseObserver);
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
    public void params(com.zrchain.treasury.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyRequests items.
     * </pre>
     */
    public void keyRequests(com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyRequestByID items.
     * </pre>
     */
    public void keyRequestByID(com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyRequestByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Keys items.
     * </pre>
     */
    public void keys(com.zrchain.treasury.QueryProto.QueryKeysRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyByID items.
     * </pre>
     */
    public void keyByID(com.zrchain.treasury.QueryProto.QueryKeyByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequests items.
     * </pre>
     */
    public void signatureRequests(com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignatureRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequestByID items.
     * </pre>
     */
    public void signatureRequestByID(com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignatureRequestByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequests items.
     * </pre>
     */
    public void signTransactionRequests(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTransactionRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequestByID items.
     * </pre>
     */
    public void signTransactionRequestByID(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignTransactionRequestByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ZrSignKeys items.
     * </pre>
     */
    public void zrSignKeys(com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZrSignKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of KeyByAddress items.
     * </pre>
     */
    public void keyByAddress(com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ZenbtcWallets items.
     * </pre>
     */
    public void zenbtcWallets(com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZenbtcWalletsMethod(), getCallOptions()), request, responseObserver);
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
    public com.zrchain.treasury.QueryProto.QueryParamsResponse params(com.zrchain.treasury.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of KeyRequests items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse keyRequests(com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of KeyRequestByID items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse keyRequestByID(com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyRequestByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Keys items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryKeysResponse keys(com.zrchain.treasury.QueryProto.QueryKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of KeyByID items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryKeyByIDResponse keyByID(com.zrchain.treasury.QueryProto.QueryKeyByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequests items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse signatureRequests(com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignatureRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequestByID items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse signatureRequestByID(com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignatureRequestByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequests items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse signTransactionRequests(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTransactionRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequestByID items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse signTransactionRequestByID(com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignTransactionRequestByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ZrSignKeys items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse zrSignKeys(com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZrSignKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of KeyByAddress items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse keyByAddress(com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ZenbtcWallets items.
     * </pre>
     */
    public com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse zenbtcWallets(com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZenbtcWalletsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryParamsResponse> params(
        com.zrchain.treasury.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of KeyRequests items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse> keyRequests(
        com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of KeyRequestByID items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse> keyRequestByID(
        com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyRequestByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Keys items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryKeysResponse> keys(
        com.zrchain.treasury.QueryProto.QueryKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of KeyByID items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryKeyByIDResponse> keyByID(
        com.zrchain.treasury.QueryProto.QueryKeyByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequests items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse> signatureRequests(
        com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignatureRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SignatureRequestByID items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse> signatureRequestByID(
        com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignatureRequestByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequests items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse> signTransactionRequests(
        com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTransactionRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SignTransactionRequestByID items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse> signTransactionRequestByID(
        com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignTransactionRequestByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ZrSignKeys items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse> zrSignKeys(
        com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZrSignKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of KeyByAddress items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse> keyByAddress(
        com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ZenbtcWallets items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse> zenbtcWallets(
        com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZenbtcWalletsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_KEY_REQUESTS = 1;
  private static final int METHODID_KEY_REQUEST_BY_ID = 2;
  private static final int METHODID_KEYS = 3;
  private static final int METHODID_KEY_BY_ID = 4;
  private static final int METHODID_SIGNATURE_REQUESTS = 5;
  private static final int METHODID_SIGNATURE_REQUEST_BY_ID = 6;
  private static final int METHODID_SIGN_TRANSACTION_REQUESTS = 7;
  private static final int METHODID_SIGN_TRANSACTION_REQUEST_BY_ID = 8;
  private static final int METHODID_ZR_SIGN_KEYS = 9;
  private static final int METHODID_KEY_BY_ADDRESS = 10;
  private static final int METHODID_ZENBTC_WALLETS = 11;

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
          serviceImpl.params((com.zrchain.treasury.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_KEY_REQUESTS:
          serviceImpl.keyRequests((com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse>) responseObserver);
          break;
        case METHODID_KEY_REQUEST_BY_ID:
          serviceImpl.keyRequestByID((com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse>) responseObserver);
          break;
        case METHODID_KEYS:
          serviceImpl.keys((com.zrchain.treasury.QueryProto.QueryKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeysResponse>) responseObserver);
          break;
        case METHODID_KEY_BY_ID:
          serviceImpl.keyByID((com.zrchain.treasury.QueryProto.QueryKeyByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByIDResponse>) responseObserver);
          break;
        case METHODID_SIGNATURE_REQUESTS:
          serviceImpl.signatureRequests((com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse>) responseObserver);
          break;
        case METHODID_SIGNATURE_REQUEST_BY_ID:
          serviceImpl.signatureRequestByID((com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION_REQUESTS:
          serviceImpl.signTransactionRequests((com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse>) responseObserver);
          break;
        case METHODID_SIGN_TRANSACTION_REQUEST_BY_ID:
          serviceImpl.signTransactionRequestByID((com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse>) responseObserver);
          break;
        case METHODID_ZR_SIGN_KEYS:
          serviceImpl.zrSignKeys((com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse>) responseObserver);
          break;
        case METHODID_KEY_BY_ADDRESS:
          serviceImpl.keyByAddress((com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse>) responseObserver);
          break;
        case METHODID_ZENBTC_WALLETS:
          serviceImpl.zenbtcWallets((com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse>) responseObserver);
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
              com.zrchain.treasury.QueryProto.QueryParamsRequest,
              com.zrchain.treasury.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getKeyRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryKeyRequestsRequest,
              com.zrchain.treasury.QueryProto.QueryKeyRequestsResponse>(
                service, METHODID_KEY_REQUESTS)))
        .addMethod(
          getKeyRequestByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryKeyRequestByIDRequest,
              com.zrchain.treasury.QueryProto.QueryKeyRequestByIDResponse>(
                service, METHODID_KEY_REQUEST_BY_ID)))
        .addMethod(
          getKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryKeysRequest,
              com.zrchain.treasury.QueryProto.QueryKeysResponse>(
                service, METHODID_KEYS)))
        .addMethod(
          getKeyByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryKeyByIDRequest,
              com.zrchain.treasury.QueryProto.QueryKeyByIDResponse>(
                service, METHODID_KEY_BY_ID)))
        .addMethod(
          getSignatureRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QuerySignatureRequestsRequest,
              com.zrchain.treasury.QueryProto.QuerySignatureRequestsResponse>(
                service, METHODID_SIGNATURE_REQUESTS)))
        .addMethod(
          getSignatureRequestByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDRequest,
              com.zrchain.treasury.QueryProto.QuerySignatureRequestByIDResponse>(
                service, METHODID_SIGNATURE_REQUEST_BY_ID)))
        .addMethod(
          getSignTransactionRequestsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsRequest,
              com.zrchain.treasury.QueryProto.QuerySignTransactionRequestsResponse>(
                service, METHODID_SIGN_TRANSACTION_REQUESTS)))
        .addMethod(
          getSignTransactionRequestByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDRequest,
              com.zrchain.treasury.QueryProto.QuerySignTransactionRequestByIDResponse>(
                service, METHODID_SIGN_TRANSACTION_REQUEST_BY_ID)))
        .addMethod(
          getZrSignKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryZrSignKeysRequest,
              com.zrchain.treasury.QueryProto.QueryZrSignKeysResponse>(
                service, METHODID_ZR_SIGN_KEYS)))
        .addMethod(
          getKeyByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryKeyByAddressRequest,
              com.zrchain.treasury.QueryProto.QueryKeyByAddressResponse>(
                service, METHODID_KEY_BY_ADDRESS)))
        .addMethod(
          getZenbtcWalletsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.QueryProto.QueryZenbtcWalletsRequest,
              com.zrchain.treasury.QueryProto.QueryZenbtcWalletsResponse>(
                service, METHODID_ZENBTC_WALLETS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.treasury.QueryProto.getDescriptor();
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
              .addMethod(getKeyRequestsMethod())
              .addMethod(getKeyRequestByIDMethod())
              .addMethod(getKeysMethod())
              .addMethod(getKeyByIDMethod())
              .addMethod(getSignatureRequestsMethod())
              .addMethod(getSignatureRequestByIDMethod())
              .addMethod(getSignTransactionRequestsMethod())
              .addMethod(getSignTransactionRequestByIDMethod())
              .addMethod(getZrSignKeysMethod())
              .addMethod(getKeyByAddressMethod())
              .addMethod(getZenbtcWalletsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
