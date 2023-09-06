package com.likechain.iscn;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Usage:
 * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
 * Example:
 * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: likechain/iscn/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "likechain.iscn.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByIdRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> getRecordsByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordsById",
      requestType = com.likechain.iscn.QueryProto.QueryRecordsByIdRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryRecordsByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByIdRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> getRecordsByIdMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByIdRequest, com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> getRecordsByIdMethod;
    if ((getRecordsByIdMethod = QueryGrpc.getRecordsByIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordsByIdMethod = QueryGrpc.getRecordsByIdMethod) == null) {
          QueryGrpc.getRecordsByIdMethod = getRecordsByIdMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryRecordsByIdRequest, com.likechain.iscn.QueryProto.QueryRecordsByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordsById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordsById"))
              .build();
        }
      }
    }
    return getRecordsByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> getRecordsByFingerprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordsByFingerprint",
      requestType = com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> getRecordsByFingerprintMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest, com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> getRecordsByFingerprintMethod;
    if ((getRecordsByFingerprintMethod = QueryGrpc.getRecordsByFingerprintMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordsByFingerprintMethod = QueryGrpc.getRecordsByFingerprintMethod) == null) {
          QueryGrpc.getRecordsByFingerprintMethod = getRecordsByFingerprintMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest, com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordsByFingerprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordsByFingerprint"))
              .build();
        }
      }
    }
    return getRecordsByFingerprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> getRecordsByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordsByOwner",
      requestType = com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest,
      com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> getRecordsByOwnerMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest, com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> getRecordsByOwnerMethod;
    if ((getRecordsByOwnerMethod = QueryGrpc.getRecordsByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRecordsByOwnerMethod = QueryGrpc.getRecordsByOwnerMethod) == null) {
          QueryGrpc.getRecordsByOwnerMethod = getRecordsByOwnerMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest, com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordsByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RecordsByOwner"))
              .build();
        }
      }
    }
    return getRecordsByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryParamsRequest,
      com.likechain.iscn.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.likechain.iscn.QueryProto.QueryParamsRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryParamsRequest,
      com.likechain.iscn.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryParamsRequest, com.likechain.iscn.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryParamsRequest, com.likechain.iscn.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidRequest,
      com.likechain.iscn.QueryProto.QueryGetCidResponse> getGetCidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCid",
      requestType = com.likechain.iscn.QueryProto.QueryGetCidRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryGetCidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidRequest,
      com.likechain.iscn.QueryProto.QueryGetCidResponse> getGetCidMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidRequest, com.likechain.iscn.QueryProto.QueryGetCidResponse> getGetCidMethod;
    if ((getGetCidMethod = QueryGrpc.getGetCidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetCidMethod = QueryGrpc.getGetCidMethod) == null) {
          QueryGrpc.getGetCidMethod = getGetCidMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryGetCidRequest, com.likechain.iscn.QueryProto.QueryGetCidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryGetCidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryGetCidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetCid"))
              .build();
        }
      }
    }
    return getGetCidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryHasCidRequest,
      com.likechain.iscn.QueryProto.QueryHasCidResponse> getHasCidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HasCid",
      requestType = com.likechain.iscn.QueryProto.QueryHasCidRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryHasCidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryHasCidRequest,
      com.likechain.iscn.QueryProto.QueryHasCidResponse> getHasCidMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryHasCidRequest, com.likechain.iscn.QueryProto.QueryHasCidResponse> getHasCidMethod;
    if ((getHasCidMethod = QueryGrpc.getHasCidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHasCidMethod = QueryGrpc.getHasCidMethod) == null) {
          QueryGrpc.getHasCidMethod = getHasCidMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryHasCidRequest, com.likechain.iscn.QueryProto.QueryHasCidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasCid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryHasCidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryHasCidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HasCid"))
              .build();
        }
      }
    }
    return getHasCidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidSizeRequest,
      com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> getGetCidSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCidSize",
      requestType = com.likechain.iscn.QueryProto.QueryGetCidSizeRequest.class,
      responseType = com.likechain.iscn.QueryProto.QueryGetCidSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidSizeRequest,
      com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> getGetCidSizeMethod() {
    io.grpc.MethodDescriptor<com.likechain.iscn.QueryProto.QueryGetCidSizeRequest, com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> getGetCidSizeMethod;
    if ((getGetCidSizeMethod = QueryGrpc.getGetCidSizeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetCidSizeMethod = QueryGrpc.getGetCidSizeMethod) == null) {
          QueryGrpc.getGetCidSizeMethod = getGetCidSizeMethod =
              io.grpc.MethodDescriptor.<com.likechain.iscn.QueryProto.QueryGetCidSizeRequest, com.likechain.iscn.QueryProto.QueryGetCidSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCidSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryGetCidSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.likechain.iscn.QueryProto.QueryGetCidSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetCidSize"))
              .build();
        }
      }
    }
    return getGetCidSizeMethod;
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
   * Usage:
   * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
   * Example:
   * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void recordsById(com.likechain.iscn.QueryProto.QueryRecordsByIdRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsByIdMethod(), responseObserver);
    }

    /**
     */
    default void recordsByFingerprint(com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsByFingerprintMethod(), responseObserver);
    }

    /**
     */
    default void recordsByOwner(com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordsByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void params(com.likechain.iscn.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void getCid(com.likechain.iscn.QueryProto.QueryGetCidRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCidMethod(), responseObserver);
    }

    /**
     */
    default void hasCid(com.likechain.iscn.QueryProto.QueryHasCidRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryHasCidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasCidMethod(), responseObserver);
    }

    /**
     */
    default void getCidSize(com.likechain.iscn.QueryProto.QueryGetCidSizeRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCidSizeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Usage:
   * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
   * Example:
   * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
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
   * Usage:
   * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
   * Example:
   * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
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
     */
    public void recordsById(com.likechain.iscn.QueryProto.QueryRecordsByIdRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordsByFingerprint(com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsByFingerprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordsByOwner(com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordsByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void params(com.likechain.iscn.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCid(com.likechain.iscn.QueryProto.QueryGetCidRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasCid(com.likechain.iscn.QueryProto.QueryHasCidRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryHasCidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHasCidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCidSize(com.likechain.iscn.QueryProto.QueryGetCidSizeRequest request,
        io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCidSizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Usage:
   * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
   * Example:
   * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
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
     */
    public com.likechain.iscn.QueryProto.QueryRecordsByIdResponse recordsById(com.likechain.iscn.QueryProto.QueryRecordsByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse recordsByFingerprint(com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsByFingerprintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse recordsByOwner(com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordsByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryParamsResponse params(com.likechain.iscn.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryGetCidResponse getCid(com.likechain.iscn.QueryProto.QueryGetCidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryHasCidResponse hasCid(com.likechain.iscn.QueryProto.QueryHasCidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHasCidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.likechain.iscn.QueryProto.QueryGetCidSizeResponse getCidSize(com.likechain.iscn.QueryProto.QueryGetCidSizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCidSizeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Usage:
   * /iscn/api/endpoint?param1=blablabla&amp;param2=blablabla...
   * Example:
   * /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&amp;from_version=2
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryRecordsByIdResponse> recordsById(
        com.likechain.iscn.QueryProto.QueryRecordsByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse> recordsByFingerprint(
        com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsByFingerprintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse> recordsByOwner(
        com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordsByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryParamsResponse> params(
        com.likechain.iscn.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryGetCidResponse> getCid(
        com.likechain.iscn.QueryProto.QueryGetCidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryHasCidResponse> hasCid(
        com.likechain.iscn.QueryProto.QueryHasCidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHasCidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.likechain.iscn.QueryProto.QueryGetCidSizeResponse> getCidSize(
        com.likechain.iscn.QueryProto.QueryGetCidSizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCidSizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORDS_BY_ID = 0;
  private static final int METHODID_RECORDS_BY_FINGERPRINT = 1;
  private static final int METHODID_RECORDS_BY_OWNER = 2;
  private static final int METHODID_PARAMS = 3;
  private static final int METHODID_GET_CID = 4;
  private static final int METHODID_HAS_CID = 5;
  private static final int METHODID_GET_CID_SIZE = 6;

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
        case METHODID_RECORDS_BY_ID:
          serviceImpl.recordsById((com.likechain.iscn.QueryProto.QueryRecordsByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByIdResponse>) responseObserver);
          break;
        case METHODID_RECORDS_BY_FINGERPRINT:
          serviceImpl.recordsByFingerprint((com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse>) responseObserver);
          break;
        case METHODID_RECORDS_BY_OWNER:
          serviceImpl.recordsByOwner((com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.likechain.iscn.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_GET_CID:
          serviceImpl.getCid((com.likechain.iscn.QueryProto.QueryGetCidRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidResponse>) responseObserver);
          break;
        case METHODID_HAS_CID:
          serviceImpl.hasCid((com.likechain.iscn.QueryProto.QueryHasCidRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryHasCidResponse>) responseObserver);
          break;
        case METHODID_GET_CID_SIZE:
          serviceImpl.getCidSize((com.likechain.iscn.QueryProto.QueryGetCidSizeRequest) request,
              (io.grpc.stub.StreamObserver<com.likechain.iscn.QueryProto.QueryGetCidSizeResponse>) responseObserver);
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
          getRecordsByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryRecordsByIdRequest,
              com.likechain.iscn.QueryProto.QueryRecordsByIdResponse>(
                service, METHODID_RECORDS_BY_ID)))
        .addMethod(
          getRecordsByFingerprintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryRecordsByFingerprintRequest,
              com.likechain.iscn.QueryProto.QueryRecordsByFingerprintResponse>(
                service, METHODID_RECORDS_BY_FINGERPRINT)))
        .addMethod(
          getRecordsByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryRecordsByOwnerRequest,
              com.likechain.iscn.QueryProto.QueryRecordsByOwnerResponse>(
                service, METHODID_RECORDS_BY_OWNER)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryParamsRequest,
              com.likechain.iscn.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getGetCidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryGetCidRequest,
              com.likechain.iscn.QueryProto.QueryGetCidResponse>(
                service, METHODID_GET_CID)))
        .addMethod(
          getHasCidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryHasCidRequest,
              com.likechain.iscn.QueryProto.QueryHasCidResponse>(
                service, METHODID_HAS_CID)))
        .addMethod(
          getGetCidSizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.likechain.iscn.QueryProto.QueryGetCidSizeRequest,
              com.likechain.iscn.QueryProto.QueryGetCidSizeResponse>(
                service, METHODID_GET_CID_SIZE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.likechain.iscn.QueryProto.getDescriptor();
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
              .addMethod(getRecordsByIdMethod())
              .addMethod(getRecordsByFingerprintMethod())
              .addMethod(getRecordsByOwnerMethod())
              .addMethod(getParamsMethod())
              .addMethod(getGetCidMethod())
              .addMethod(getHasCidMethod())
              .addMethod(getGetCidSizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
