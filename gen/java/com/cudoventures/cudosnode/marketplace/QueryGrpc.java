package com.cudoventures.cudosnode.marketplace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: cudos/marketplace/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cudoventures.cudosnode.marketplace.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> getCollectionAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectionAll",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> getCollectionAllMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> getCollectionAllMethod;
    if ((getCollectionAllMethod = QueryGrpc.getCollectionAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionAllMethod = QueryGrpc.getCollectionAllMethod) == null) {
          QueryGrpc.getCollectionAllMethod = getCollectionAllMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CollectionAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CollectionAll"))
              .build();
        }
      }
    }
    return getCollectionAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> getNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Nft",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> getNftMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> getNftMethod;
    if ((getNftMethod = QueryGrpc.getNftMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNftMethod = QueryGrpc.getNftMethod) == null) {
          QueryGrpc.getNftMethod = getNftMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Nft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Nft"))
              .build();
        }
      }
    }
    return getNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> getNftAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NftAll",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> getNftAllMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> getNftAllMethod;
    if ((getNftAllMethod = QueryGrpc.getNftAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNftAllMethod = QueryGrpc.getNftAllMethod) == null) {
          QueryGrpc.getNftAllMethod = getNftAllMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NftAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NftAll"))
              .build();
        }
      }
    }
    return getNftAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> getCollectionByDenomIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CollectionByDenomId",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> getCollectionByDenomIdMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> getCollectionByDenomIdMethod;
    if ((getCollectionByDenomIdMethod = QueryGrpc.getCollectionByDenomIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionByDenomIdMethod = QueryGrpc.getCollectionByDenomIdMethod) == null) {
          QueryGrpc.getCollectionByDenomIdMethod = getCollectionByDenomIdMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CollectionByDenomId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CollectionByDenomId"))
              .build();
        }
      }
    }
    return getCollectionByDenomIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> getListAdminsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAdmins",
      requestType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest.class,
      responseType = com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest,
      com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> getListAdminsMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> getListAdminsMethod;
    if ((getListAdminsMethod = QueryGrpc.getListAdminsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListAdminsMethod = QueryGrpc.getListAdminsMethod) == null) {
          QueryGrpc.getListAdminsMethod = getListAdminsMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest, com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAdmins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListAdmins"))
              .build();
        }
      }
    }
    return getListAdminsMethod;
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
    default void params(com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Collection for sale by id.
     * </pre>
     */
    default void collection(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries all Collection items for sale.
     * </pre>
     */
    default void collectionAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Nft for sale by id.
     * </pre>
     */
    default void nft(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries all Nft items for sale.
     * </pre>
     */
    default void nftAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNftAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CollectionByDenomId items.
     * </pre>
     */
    default void collectionByDenomId(com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionByDenomIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ListAdmins items.
     * </pre>
     */
    default void listAdmins(com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAdminsMethod(), responseObserver);
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
    public void params(com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Collection for sale by id.
     * </pre>
     */
    public void collection(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries all Collection items for sale.
     * </pre>
     */
    public void collectionAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Nft for sale by id.
     * </pre>
     */
    public void nft(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries all Nft items for sale.
     * </pre>
     */
    public void nftAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNftAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of CollectionByDenomId items.
     * </pre>
     */
    public void collectionByDenomId(com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionByDenomIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ListAdmins items.
     * </pre>
     */
    public void listAdmins(com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAdminsMethod(), getCallOptions()), request, responseObserver);
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
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse params(com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Collection for sale by id.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse collection(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries all Collection items for sale.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse collectionAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Nft for sale by id.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse nft(com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries all Nft items for sale.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse nftAll(com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNftAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of CollectionByDenomId items.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse collectionByDenomId(com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionByDenomIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ListAdmins items.
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse listAdmins(com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAdminsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse> params(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Collection for sale by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse> collection(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries all Collection items for sale.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse> collectionAll(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Nft for sale by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse> nft(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries all Nft items for sale.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse> nftAll(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNftAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of CollectionByDenomId items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse> collectionByDenomId(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionByDenomIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ListAdmins items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse> listAdmins(
        com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAdminsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_COLLECTION = 1;
  private static final int METHODID_COLLECTION_ALL = 2;
  private static final int METHODID_NFT = 3;
  private static final int METHODID_NFT_ALL = 4;
  private static final int METHODID_COLLECTION_BY_DENOM_ID = 5;
  private static final int METHODID_LIST_ADMINS = 6;

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
          serviceImpl.params((com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse>) responseObserver);
          break;
        case METHODID_COLLECTION_ALL:
          serviceImpl.collectionAll((com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nft((com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse>) responseObserver);
          break;
        case METHODID_NFT_ALL:
          serviceImpl.nftAll((com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse>) responseObserver);
          break;
        case METHODID_COLLECTION_BY_DENOM_ID:
          serviceImpl.collectionByDenomId((com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse>) responseObserver);
          break;
        case METHODID_LIST_ADMINS:
          serviceImpl.listAdmins((com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse>) responseObserver);
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
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetCollectionResponse>(
                service, METHODID_COLLECTION)))
        .addMethod(
          getCollectionAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllCollectionResponse>(
                service, METHODID_COLLECTION_ALL)))
        .addMethod(
          getNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryGetNftResponse>(
                service, METHODID_NFT)))
        .addMethod(
          getNftAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryAllNftResponse>(
                service, METHODID_NFT_ALL)))
        .addMethod(
          getCollectionByDenomIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryCollectionByDenomIdResponse>(
                service, METHODID_COLLECTION_BY_DENOM_ID)))
        .addMethod(
          getListAdminsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsRequest,
              com.cudoventures.cudosnode.marketplace.QueryProto.QueryListAdminsResponse>(
                service, METHODID_LIST_ADMINS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.getDescriptor();
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
              .addMethod(getCollectionMethod())
              .addMethod(getCollectionAllMethod())
              .addMethod(getNftMethod())
              .addMethod(getNftAllMethod())
              .addMethod(getCollectionByDenomIdMethod())
              .addMethod(getListAdminsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
