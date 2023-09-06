package com.coreum.asset.nft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: coreum/asset/nft/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "coreum.asset.nft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest, com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest, com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> getClassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Class",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryClassRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryClassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> getClassMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassRequest, com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> getClassMethod;
    if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassMethod = QueryGrpc.getClassMethod) == null) {
          QueryGrpc.getClassMethod = getClassMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryClassRequest, com.coreum.asset.nft.v1.QueryProto.QueryClassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Class"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryClassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryClassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Class"))
              .build();
        }
      }
    }
    return getClassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> getClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Classes",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> getClassesMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest, com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> getClassesMethod;
    if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClassesMethod = QueryGrpc.getClassesMethod) == null) {
          QueryGrpc.getClassesMethod = getClassesMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest, com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Classes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Classes"))
              .build();
        }
      }
    }
    return getClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> getFrozenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Frozen",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> getFrozenMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest, com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> getFrozenMethod;
    if ((getFrozenMethod = QueryGrpc.getFrozenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFrozenMethod = QueryGrpc.getFrozenMethod) == null) {
          QueryGrpc.getFrozenMethod = getFrozenMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest, com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Frozen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Frozen"))
              .build();
        }
      }
    }
    return getFrozenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> getWhitelistedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Whitelisted",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> getWhitelistedMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest, com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> getWhitelistedMethod;
    if ((getWhitelistedMethod = QueryGrpc.getWhitelistedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedMethod = QueryGrpc.getWhitelistedMethod) == null) {
          QueryGrpc.getWhitelistedMethod = getWhitelistedMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest, com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Whitelisted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Whitelisted"))
              .build();
        }
      }
    }
    return getWhitelistedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WhitelistedAccountsForNFT",
      requestType = com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest.class,
      responseType = com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest,
      com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod() {
    io.grpc.MethodDescriptor<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest, com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> getWhitelistedAccountsForNFTMethod;
    if ((getWhitelistedAccountsForNFTMethod = QueryGrpc.getWhitelistedAccountsForNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWhitelistedAccountsForNFTMethod = QueryGrpc.getWhitelistedAccountsForNFTMethod) == null) {
          QueryGrpc.getWhitelistedAccountsForNFTMethod = getWhitelistedAccountsForNFTMethod =
              io.grpc.MethodDescriptor.<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest, com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WhitelistedAccountsForNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WhitelistedAccountsForNFT"))
              .build();
        }
      }
    }
    return getWhitelistedAccountsForNFTMethod;
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    default void params(com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    default void class_(com.coreum.asset.nft.v1.QueryProto.QueryClassRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Classes queries the non-fungible token classes of the module.
     * </pre>
     */
    default void classes(com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    default void frozen(com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFrozenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    default void whitelisted(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhitelistedMethod(), responseObserver);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    default void whitelistedAccountsForNFT(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhitelistedAccountsForNFTMethod(), responseObserver);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public void params(com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public void class_(com.coreum.asset.nft.v1.QueryProto.QueryClassRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Classes queries the non-fungible token classes of the module.
     * </pre>
     */
    public void classes(com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public void frozen(com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public void whitelisted(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhitelistedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public void whitelistedAccountsForNFT(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest request,
        io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhitelistedAccountsForNFTMethod(), getCallOptions()), request, responseObserver);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse params(com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryClassResponse class_(com.coreum.asset.nft.v1.QueryProto.QueryClassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Classes queries the non-fungible token classes of the module.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse classes(com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClassesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse frozen(com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFrozenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse whitelisted(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhitelistedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse whitelistedAccountsForNFT(com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhitelistedAccountsForNFTMethod(), getCallOptions(), request);
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
     * Params queries the parameters of x/asset/ft module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse> params(
        com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Class queries the non-fungible token class of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryClassResponse> class_(
        com.coreum.asset.nft.v1.QueryProto.QueryClassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Classes queries the non-fungible token classes of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse> classes(
        com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClassesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Frozen queries to check if an NFT is frozen or not.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse> frozen(
        com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFrozenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Whitelisted queries to check if an account is whitelited to hold an NFT or not.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse> whitelisted(
        com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhitelistedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse> whitelistedAccountsForNFT(
        com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhitelistedAccountsForNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CLASS = 1;
  private static final int METHODID_CLASSES = 2;
  private static final int METHODID_FROZEN = 3;
  private static final int METHODID_WHITELISTED = 4;
  private static final int METHODID_WHITELISTED_ACCOUNTS_FOR_NFT = 5;

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
          serviceImpl.params((com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLASS:
          serviceImpl.class_((com.coreum.asset.nft.v1.QueryProto.QueryClassRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassResponse>) responseObserver);
          break;
        case METHODID_CLASSES:
          serviceImpl.classes((com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse>) responseObserver);
          break;
        case METHODID_FROZEN:
          serviceImpl.frozen((com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED:
          serviceImpl.whitelisted((com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse>) responseObserver);
          break;
        case METHODID_WHITELISTED_ACCOUNTS_FOR_NFT:
          serviceImpl.whitelistedAccountsForNFT((com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse>) responseObserver);
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
              com.coreum.asset.nft.v1.QueryProto.QueryParamsRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getClassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.QueryProto.QueryClassRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryClassResponse>(
                service, METHODID_CLASS)))
        .addMethod(
          getClassesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.QueryProto.QueryClassesRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryClassesResponse>(
                service, METHODID_CLASSES)))
        .addMethod(
          getFrozenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.QueryProto.QueryFrozenRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryFrozenResponse>(
                service, METHODID_FROZEN)))
        .addMethod(
          getWhitelistedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedResponse>(
                service, METHODID_WHITELISTED)))
        .addMethod(
          getWhitelistedAccountsForNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTRequest,
              com.coreum.asset.nft.v1.QueryProto.QueryWhitelistedAccountsForNFTResponse>(
                service, METHODID_WHITELISTED_ACCOUNTS_FOR_NFT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coreum.asset.nft.v1.QueryProto.getDescriptor();
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
              .addMethod(getClassMethod())
              .addMethod(getClassesMethod())
              .addMethod(getFrozenMethod())
              .addMethod(getWhitelistedMethod())
              .addMethod(getWhitelistedAccountsForNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
