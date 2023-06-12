package com.ixo.claims.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/claims/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ixo.claims.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryParamsRequest,
      com.ixo.claims.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.ixo.claims.v1beta1.QueryParamsRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryParamsRequest,
      com.ixo.claims.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryParamsRequest, com.ixo.claims.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryParamsRequest, com.ixo.claims.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionRequest,
      com.ixo.claims.v1beta1.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = com.ixo.claims.v1beta1.QueryCollectionRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionRequest,
      com.ixo.claims.v1beta1.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionRequest, com.ixo.claims.v1beta1.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryCollectionRequest, com.ixo.claims.v1beta1.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionListRequest,
      com.ixo.claims.v1beta1.QueryCollectionListResponse> getCollectionListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectionList",
      requestType = com.ixo.claims.v1beta1.QueryCollectionListRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryCollectionListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionListRequest,
      com.ixo.claims.v1beta1.QueryCollectionListResponse> getCollectionListMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryCollectionListRequest, com.ixo.claims.v1beta1.QueryCollectionListResponse> getCollectionListMethod;
    if ((getCollectionListMethod = QueryGrpc.getCollectionListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionListMethod = QueryGrpc.getCollectionListMethod) == null) {
          QueryGrpc.getCollectionListMethod = getCollectionListMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryCollectionListRequest, com.ixo.claims.v1beta1.QueryCollectionListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CollectionList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryCollectionListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryCollectionListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CollectionList"))
              .build();
        }
      }
    }
    return getCollectionListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimRequest,
      com.ixo.claims.v1beta1.QueryClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = com.ixo.claims.v1beta1.QueryClaimRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimRequest,
      com.ixo.claims.v1beta1.QueryClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimRequest, com.ixo.claims.v1beta1.QueryClaimResponse> getClaimMethod;
    if ((getClaimMethod = QueryGrpc.getClaimMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimMethod = QueryGrpc.getClaimMethod) == null) {
          QueryGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryClaimRequest, com.ixo.claims.v1beta1.QueryClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryClaimRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimListRequest,
      com.ixo.claims.v1beta1.QueryClaimListResponse> getClaimListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimList",
      requestType = com.ixo.claims.v1beta1.QueryClaimListRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryClaimListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimListRequest,
      com.ixo.claims.v1beta1.QueryClaimListResponse> getClaimListMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryClaimListRequest, com.ixo.claims.v1beta1.QueryClaimListResponse> getClaimListMethod;
    if ((getClaimListMethod = QueryGrpc.getClaimListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimListMethod = QueryGrpc.getClaimListMethod) == null) {
          QueryGrpc.getClaimListMethod = getClaimListMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryClaimListRequest, com.ixo.claims.v1beta1.QueryClaimListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryClaimListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryClaimListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimList"))
              .build();
        }
      }
    }
    return getClaimListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeRequest,
      com.ixo.claims.v1beta1.QueryDisputeResponse> getDisputeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Dispute",
      requestType = com.ixo.claims.v1beta1.QueryDisputeRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryDisputeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeRequest,
      com.ixo.claims.v1beta1.QueryDisputeResponse> getDisputeMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeRequest, com.ixo.claims.v1beta1.QueryDisputeResponse> getDisputeMethod;
    if ((getDisputeMethod = QueryGrpc.getDisputeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDisputeMethod = QueryGrpc.getDisputeMethod) == null) {
          QueryGrpc.getDisputeMethod = getDisputeMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryDisputeRequest, com.ixo.claims.v1beta1.QueryDisputeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Dispute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryDisputeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryDisputeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Dispute"))
              .build();
        }
      }
    }
    return getDisputeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeListRequest,
      com.ixo.claims.v1beta1.QueryDisputeListResponse> getDisputeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisputeList",
      requestType = com.ixo.claims.v1beta1.QueryDisputeListRequest.class,
      responseType = com.ixo.claims.v1beta1.QueryDisputeListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeListRequest,
      com.ixo.claims.v1beta1.QueryDisputeListResponse> getDisputeListMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.QueryDisputeListRequest, com.ixo.claims.v1beta1.QueryDisputeListResponse> getDisputeListMethod;
    if ((getDisputeListMethod = QueryGrpc.getDisputeListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDisputeListMethod = QueryGrpc.getDisputeListMethod) == null) {
          QueryGrpc.getDisputeListMethod = getDisputeListMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.QueryDisputeListRequest, com.ixo.claims.v1beta1.QueryDisputeListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisputeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryDisputeListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.QueryDisputeListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DisputeList"))
              .build();
        }
      }
    }
    return getDisputeListMethod;
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
    default void params(com.ixo.claims.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void collection(com.ixo.claims.v1beta1.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     */
    default void collectionList(com.ixo.claims.v1beta1.QueryCollectionListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionListMethod(), responseObserver);
    }

    /**
     */
    default void claim(com.ixo.claims.v1beta1.QueryClaimRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     */
    default void claimList(com.ixo.claims.v1beta1.QueryClaimListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimListMethod(), responseObserver);
    }

    /**
     */
    default void dispute(com.ixo.claims.v1beta1.QueryDisputeRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisputeMethod(), responseObserver);
    }

    /**
     */
    default void disputeList(com.ixo.claims.v1beta1.QueryDisputeListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisputeListMethod(), responseObserver);
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
    public void params(com.ixo.claims.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void collection(com.ixo.claims.v1beta1.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void collectionList(com.ixo.claims.v1beta1.QueryCollectionListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(com.ixo.claims.v1beta1.QueryClaimRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimList(com.ixo.claims.v1beta1.QueryClaimListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dispute(com.ixo.claims.v1beta1.QueryDisputeRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisputeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disputeList(com.ixo.claims.v1beta1.QueryDisputeListRequest request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisputeListMethod(), getCallOptions()), request, responseObserver);
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
    public com.ixo.claims.v1beta1.QueryParamsResponse params(com.ixo.claims.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryCollectionResponse collection(com.ixo.claims.v1beta1.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryCollectionListResponse collectionList(com.ixo.claims.v1beta1.QueryCollectionListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryClaimResponse claim(com.ixo.claims.v1beta1.QueryClaimRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryClaimListResponse claimList(com.ixo.claims.v1beta1.QueryClaimListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryDisputeResponse dispute(com.ixo.claims.v1beta1.QueryDisputeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisputeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.QueryDisputeListResponse disputeList(com.ixo.claims.v1beta1.QueryDisputeListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisputeListMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryParamsResponse> params(
        com.ixo.claims.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryCollectionResponse> collection(
        com.ixo.claims.v1beta1.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryCollectionListResponse> collectionList(
        com.ixo.claims.v1beta1.QueryCollectionListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryClaimResponse> claim(
        com.ixo.claims.v1beta1.QueryClaimRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryClaimListResponse> claimList(
        com.ixo.claims.v1beta1.QueryClaimListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryDisputeResponse> dispute(
        com.ixo.claims.v1beta1.QueryDisputeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisputeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.QueryDisputeListResponse> disputeList(
        com.ixo.claims.v1beta1.QueryDisputeListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisputeListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_COLLECTION = 1;
  private static final int METHODID_COLLECTION_LIST = 2;
  private static final int METHODID_CLAIM = 3;
  private static final int METHODID_CLAIM_LIST = 4;
  private static final int METHODID_DISPUTE = 5;
  private static final int METHODID_DISPUTE_LIST = 6;

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
          serviceImpl.params((com.ixo.claims.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((com.ixo.claims.v1beta1.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_COLLECTION_LIST:
          serviceImpl.collectionList((com.ixo.claims.v1beta1.QueryCollectionListRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryCollectionListResponse>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((com.ixo.claims.v1beta1.QueryClaimRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimResponse>) responseObserver);
          break;
        case METHODID_CLAIM_LIST:
          serviceImpl.claimList((com.ixo.claims.v1beta1.QueryClaimListRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryClaimListResponse>) responseObserver);
          break;
        case METHODID_DISPUTE:
          serviceImpl.dispute((com.ixo.claims.v1beta1.QueryDisputeRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeResponse>) responseObserver);
          break;
        case METHODID_DISPUTE_LIST:
          serviceImpl.disputeList((com.ixo.claims.v1beta1.QueryDisputeListRequest) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.QueryDisputeListResponse>) responseObserver);
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
              com.ixo.claims.v1beta1.QueryParamsRequest,
              com.ixo.claims.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryCollectionRequest,
              com.ixo.claims.v1beta1.QueryCollectionResponse>(
                service, METHODID_COLLECTION)))
        .addMethod(
          getCollectionListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryCollectionListRequest,
              com.ixo.claims.v1beta1.QueryCollectionListResponse>(
                service, METHODID_COLLECTION_LIST)))
        .addMethod(
          getClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryClaimRequest,
              com.ixo.claims.v1beta1.QueryClaimResponse>(
                service, METHODID_CLAIM)))
        .addMethod(
          getClaimListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryClaimListRequest,
              com.ixo.claims.v1beta1.QueryClaimListResponse>(
                service, METHODID_CLAIM_LIST)))
        .addMethod(
          getDisputeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryDisputeRequest,
              com.ixo.claims.v1beta1.QueryDisputeResponse>(
                service, METHODID_DISPUTE)))
        .addMethod(
          getDisputeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.QueryDisputeListRequest,
              com.ixo.claims.v1beta1.QueryDisputeListResponse>(
                service, METHODID_DISPUTE_LIST)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.claims.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getCollectionMethod())
              .addMethod(getCollectionListMethod())
              .addMethod(getClaimMethod())
              .addMethod(getClaimListMethod())
              .addMethod(getDisputeMethod())
              .addMethod(getDisputeListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
