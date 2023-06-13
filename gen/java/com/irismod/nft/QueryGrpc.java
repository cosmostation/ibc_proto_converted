package com.irismod.nft;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for NFT module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: irismod/nft/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.nft.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QuerySupplyRequest,
      com.irismod.nft.QueryProto.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.irismod.nft.QueryProto.QuerySupplyRequest.class,
      responseType = com.irismod.nft.QueryProto.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QuerySupplyRequest,
      com.irismod.nft.QueryProto.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QuerySupplyRequest, com.irismod.nft.QueryProto.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QuerySupplyRequest, com.irismod.nft.QueryProto.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryOwnerRequest,
      com.irismod.nft.QueryProto.QueryOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = com.irismod.nft.QueryProto.QueryOwnerRequest.class,
      responseType = com.irismod.nft.QueryProto.QueryOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryOwnerRequest,
      com.irismod.nft.QueryProto.QueryOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryOwnerRequest, com.irismod.nft.QueryProto.QueryOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QueryOwnerRequest, com.irismod.nft.QueryProto.QueryOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryCollectionRequest,
      com.irismod.nft.QueryProto.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = com.irismod.nft.QueryProto.QueryCollectionRequest.class,
      responseType = com.irismod.nft.QueryProto.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryCollectionRequest,
      com.irismod.nft.QueryProto.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryCollectionRequest, com.irismod.nft.QueryProto.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QueryCollectionRequest, com.irismod.nft.QueryProto.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomRequest,
      com.irismod.nft.QueryProto.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = com.irismod.nft.QueryProto.QueryDenomRequest.class,
      responseType = com.irismod.nft.QueryProto.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomRequest,
      com.irismod.nft.QueryProto.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomRequest, com.irismod.nft.QueryProto.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QueryDenomRequest, com.irismod.nft.QueryProto.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
              .build();
        }
      }
    }
    return getDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomsRequest,
      com.irismod.nft.QueryProto.QueryDenomsResponse> getDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denoms",
      requestType = com.irismod.nft.QueryProto.QueryDenomsRequest.class,
      responseType = com.irismod.nft.QueryProto.QueryDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomsRequest,
      com.irismod.nft.QueryProto.QueryDenomsResponse> getDenomsMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryDenomsRequest, com.irismod.nft.QueryProto.QueryDenomsResponse> getDenomsMethod;
    if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
          QueryGrpc.getDenomsMethod = getDenomsMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QueryDenomsRequest, com.irismod.nft.QueryProto.QueryDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denoms"))
              .build();
        }
      }
    }
    return getDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryNFTRequest,
      com.irismod.nft.QueryProto.QueryNFTResponse> getNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFT",
      requestType = com.irismod.nft.QueryProto.QueryNFTRequest.class,
      responseType = com.irismod.nft.QueryProto.QueryNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryNFTRequest,
      com.irismod.nft.QueryProto.QueryNFTResponse> getNFTMethod() {
    io.grpc.MethodDescriptor<com.irismod.nft.QueryProto.QueryNFTRequest, com.irismod.nft.QueryProto.QueryNFTResponse> getNFTMethod;
    if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
          QueryGrpc.getNFTMethod = getNFTMethod =
              io.grpc.MethodDescriptor.<com.irismod.nft.QueryProto.QueryNFTRequest, com.irismod.nft.QueryProto.QueryNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.nft.QueryProto.QueryNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NFT"))
              .build();
        }
      }
    }
    return getNFTMethod;
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
   * Query defines the gRPC querier service for NFT module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    default void supply(com.irismod.nft.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    default void owner(com.irismod.nft.QueryProto.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    default void collection(com.irismod.nft.QueryProto.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    default void denom(com.irismod.nft.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    default void denoms(com.irismod.nft.QueryProto.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    default void nFT(com.irismod.nft.QueryProto.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNFTMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public void supply(com.irismod.nft.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(com.irismod.nft.QueryProto.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(com.irismod.nft.QueryProto.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(com.irismod.nft.QueryProto.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(com.irismod.nft.QueryProto.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(com.irismod.nft.QueryProto.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public com.irismod.nft.QueryProto.QuerySupplyResponse supply(com.irismod.nft.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.irismod.nft.QueryProto.QueryOwnerResponse owner(com.irismod.nft.QueryProto.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.irismod.nft.QueryProto.QueryCollectionResponse collection(com.irismod.nft.QueryProto.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.irismod.nft.QueryProto.QueryDenomResponse denom(com.irismod.nft.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.irismod.nft.QueryProto.QueryDenomsResponse denoms(com.irismod.nft.QueryProto.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.irismod.nft.QueryProto.QueryNFTResponse nFT(com.irismod.nft.QueryProto.QueryNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNFTMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for NFT module
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
     * Supply queries the total supply of a given denom or owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QuerySupplyResponse> supply(
        com.irismod.nft.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QueryOwnerResponse> owner(
        com.irismod.nft.QueryProto.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QueryCollectionResponse> collection(
        com.irismod.nft.QueryProto.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QueryDenomResponse> denom(
        com.irismod.nft.QueryProto.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QueryDenomsResponse> denoms(
        com.irismod.nft.QueryProto.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.nft.QueryProto.QueryNFTResponse> nFT(
        com.irismod.nft.QueryProto.QueryNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPPLY = 0;
  private static final int METHODID_OWNER = 1;
  private static final int METHODID_COLLECTION = 2;
  private static final int METHODID_DENOM = 3;
  private static final int METHODID_DENOMS = 4;
  private static final int METHODID_NFT = 5;

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
        case METHODID_SUPPLY:
          serviceImpl.supply((com.irismod.nft.QueryProto.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((com.irismod.nft.QueryProto.QueryOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryOwnerResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((com.irismod.nft.QueryProto.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((com.irismod.nft.QueryProto.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_DENOMS:
          serviceImpl.denoms((com.irismod.nft.QueryProto.QueryDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryDenomsResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nFT((com.irismod.nft.QueryProto.QueryNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.irismod.nft.QueryProto.QueryNFTResponse>) responseObserver);
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
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QuerySupplyRequest,
              com.irismod.nft.QueryProto.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QueryOwnerRequest,
              com.irismod.nft.QueryProto.QueryOwnerResponse>(
                service, METHODID_OWNER)))
        .addMethod(
          getCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QueryCollectionRequest,
              com.irismod.nft.QueryProto.QueryCollectionResponse>(
                service, METHODID_COLLECTION)))
        .addMethod(
          getDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QueryDenomRequest,
              com.irismod.nft.QueryProto.QueryDenomResponse>(
                service, METHODID_DENOM)))
        .addMethod(
          getDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QueryDenomsRequest,
              com.irismod.nft.QueryProto.QueryDenomsResponse>(
                service, METHODID_DENOMS)))
        .addMethod(
          getNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.nft.QueryProto.QueryNFTRequest,
              com.irismod.nft.QueryProto.QueryNFTResponse>(
                service, METHODID_NFT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.nft.QueryProto.getDescriptor();
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
              .addMethod(getSupplyMethod())
              .addMethod(getOwnerMethod())
              .addMethod(getCollectionMethod())
              .addMethod(getDenomMethod())
              .addMethod(getDenomsMethod())
              .addMethod(getNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
