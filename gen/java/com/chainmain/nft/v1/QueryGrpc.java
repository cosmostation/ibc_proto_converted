package com.chainmain.nft.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for NFT module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cryptoorg/nft/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "chainmain.nft.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QuerySupplyRequest,
      com.chainmain.nft.v1.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.chainmain.nft.v1.QuerySupplyRequest.class,
      responseType = com.chainmain.nft.v1.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QuerySupplyRequest,
      com.chainmain.nft.v1.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QuerySupplyRequest, com.chainmain.nft.v1.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QuerySupplyRequest, com.chainmain.nft.v1.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryOwnerRequest,
      com.chainmain.nft.v1.QueryOwnerResponse> getOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Owner",
      requestType = com.chainmain.nft.v1.QueryOwnerRequest.class,
      responseType = com.chainmain.nft.v1.QueryOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryOwnerRequest,
      com.chainmain.nft.v1.QueryOwnerResponse> getOwnerMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryOwnerRequest, com.chainmain.nft.v1.QueryOwnerResponse> getOwnerMethod;
    if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOwnerMethod = QueryGrpc.getOwnerMethod) == null) {
          QueryGrpc.getOwnerMethod = getOwnerMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryOwnerRequest, com.chainmain.nft.v1.QueryOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Owner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Owner"))
              .build();
        }
      }
    }
    return getOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryCollectionRequest,
      com.chainmain.nft.v1.QueryCollectionResponse> getCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collection",
      requestType = com.chainmain.nft.v1.QueryCollectionRequest.class,
      responseType = com.chainmain.nft.v1.QueryCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryCollectionRequest,
      com.chainmain.nft.v1.QueryCollectionResponse> getCollectionMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryCollectionRequest, com.chainmain.nft.v1.QueryCollectionResponse> getCollectionMethod;
    if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCollectionMethod = QueryGrpc.getCollectionMethod) == null) {
          QueryGrpc.getCollectionMethod = getCollectionMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryCollectionRequest, com.chainmain.nft.v1.QueryCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryCollectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Collection"))
              .build();
        }
      }
    }
    return getCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomRequest,
      com.chainmain.nft.v1.QueryDenomResponse> getDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denom",
      requestType = com.chainmain.nft.v1.QueryDenomRequest.class,
      responseType = com.chainmain.nft.v1.QueryDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomRequest,
      com.chainmain.nft.v1.QueryDenomResponse> getDenomMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomRequest, com.chainmain.nft.v1.QueryDenomResponse> getDenomMethod;
    if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMethod = QueryGrpc.getDenomMethod) == null) {
          QueryGrpc.getDenomMethod = getDenomMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryDenomRequest, com.chainmain.nft.v1.QueryDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denom"))
              .build();
        }
      }
    }
    return getDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomByNameRequest,
      com.chainmain.nft.v1.QueryDenomByNameResponse> getDenomByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomByName",
      requestType = com.chainmain.nft.v1.QueryDenomByNameRequest.class,
      responseType = com.chainmain.nft.v1.QueryDenomByNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomByNameRequest,
      com.chainmain.nft.v1.QueryDenomByNameResponse> getDenomByNameMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomByNameRequest, com.chainmain.nft.v1.QueryDenomByNameResponse> getDenomByNameMethod;
    if ((getDenomByNameMethod = QueryGrpc.getDenomByNameMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomByNameMethod = QueryGrpc.getDenomByNameMethod) == null) {
          QueryGrpc.getDenomByNameMethod = getDenomByNameMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryDenomByNameRequest, com.chainmain.nft.v1.QueryDenomByNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomByNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomByName"))
              .build();
        }
      }
    }
    return getDenomByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomsRequest,
      com.chainmain.nft.v1.QueryDenomsResponse> getDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Denoms",
      requestType = com.chainmain.nft.v1.QueryDenomsRequest.class,
      responseType = com.chainmain.nft.v1.QueryDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomsRequest,
      com.chainmain.nft.v1.QueryDenomsResponse> getDenomsMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryDenomsRequest, com.chainmain.nft.v1.QueryDenomsResponse> getDenomsMethod;
    if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsMethod = QueryGrpc.getDenomsMethod) == null) {
          QueryGrpc.getDenomsMethod = getDenomsMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryDenomsRequest, com.chainmain.nft.v1.QueryDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Denoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Denoms"))
              .build();
        }
      }
    }
    return getDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryNFTRequest,
      com.chainmain.nft.v1.QueryNFTResponse> getNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NFT",
      requestType = com.chainmain.nft.v1.QueryNFTRequest.class,
      responseType = com.chainmain.nft.v1.QueryNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryNFTRequest,
      com.chainmain.nft.v1.QueryNFTResponse> getNFTMethod() {
    io.grpc.MethodDescriptor<com.chainmain.nft.v1.QueryNFTRequest, com.chainmain.nft.v1.QueryNFTResponse> getNFTMethod;
    if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNFTMethod = QueryGrpc.getNFTMethod) == null) {
          QueryGrpc.getNFTMethod = getNFTMethod =
              io.grpc.MethodDescriptor.<com.chainmain.nft.v1.QueryNFTRequest, com.chainmain.nft.v1.QueryNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chainmain.nft.v1.QueryNFTResponse.getDefaultInstance()))
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
    default void supply(com.chainmain.nft.v1.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    default void owner(com.chainmain.nft.v1.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    default void collection(com.chainmain.nft.v1.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    default void denom(com.chainmain.nft.v1.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomByName queries the definition of a given denom by name
     * </pre>
     */
    default void denomByName(com.chainmain.nft.v1.QueryDenomByNameRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomByNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomByNameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    default void denoms(com.chainmain.nft.v1.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    default void nFT(com.chainmain.nft.v1.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryNFTResponse> responseObserver) {
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
    public void supply(com.chainmain.nft.v1.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public void owner(com.chainmain.nft.v1.QueryOwnerRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public void collection(com.chainmain.nft.v1.QueryCollectionRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public void denom(com.chainmain.nft.v1.QueryDenomRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomByName queries the definition of a given denom by name
     * </pre>
     */
    public void denomByName(com.chainmain.nft.v1.QueryDenomByNameRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomByNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public void denoms(com.chainmain.nft.v1.QueryDenomsRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public void nFT(com.chainmain.nft.v1.QueryNFTRequest request,
        io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryNFTResponse> responseObserver) {
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
    public com.chainmain.nft.v1.QuerySupplyResponse supply(com.chainmain.nft.v1.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.chainmain.nft.v1.QueryOwnerResponse owner(com.chainmain.nft.v1.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.chainmain.nft.v1.QueryCollectionResponse collection(com.chainmain.nft.v1.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.chainmain.nft.v1.QueryDenomResponse denom(com.chainmain.nft.v1.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomByName queries the definition of a given denom by name
     * </pre>
     */
    public com.chainmain.nft.v1.QueryDenomByNameResponse denomByName(com.chainmain.nft.v1.QueryDenomByNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomByNameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.chainmain.nft.v1.QueryDenomsResponse denoms(com.chainmain.nft.v1.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.chainmain.nft.v1.QueryNFTResponse nFT(com.chainmain.nft.v1.QueryNFTRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QuerySupplyResponse> supply(
        com.chainmain.nft.v1.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Owner queries the NFTs of the specified owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryOwnerResponse> owner(
        com.chainmain.nft.v1.QueryOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collection queries the NFTs of the specified denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryCollectionResponse> collection(
        com.chainmain.nft.v1.QueryCollectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denom queries the definition of a given denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryDenomResponse> denom(
        com.chainmain.nft.v1.QueryDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomByName queries the definition of a given denom by name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryDenomByNameResponse> denomByName(
        com.chainmain.nft.v1.QueryDenomByNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomByNameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Denoms queries all the denoms
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryDenomsResponse> denoms(
        com.chainmain.nft.v1.QueryDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NFT queries the NFT for the given denom and token ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chainmain.nft.v1.QueryNFTResponse> nFT(
        com.chainmain.nft.v1.QueryNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPPLY = 0;
  private static final int METHODID_OWNER = 1;
  private static final int METHODID_COLLECTION = 2;
  private static final int METHODID_DENOM = 3;
  private static final int METHODID_DENOM_BY_NAME = 4;
  private static final int METHODID_DENOMS = 5;
  private static final int METHODID_NFT = 6;

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
          serviceImpl.supply((com.chainmain.nft.v1.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_OWNER:
          serviceImpl.owner((com.chainmain.nft.v1.QueryOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryOwnerResponse>) responseObserver);
          break;
        case METHODID_COLLECTION:
          serviceImpl.collection((com.chainmain.nft.v1.QueryCollectionRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryCollectionResponse>) responseObserver);
          break;
        case METHODID_DENOM:
          serviceImpl.denom((com.chainmain.nft.v1.QueryDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomResponse>) responseObserver);
          break;
        case METHODID_DENOM_BY_NAME:
          serviceImpl.denomByName((com.chainmain.nft.v1.QueryDenomByNameRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomByNameResponse>) responseObserver);
          break;
        case METHODID_DENOMS:
          serviceImpl.denoms((com.chainmain.nft.v1.QueryDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryDenomsResponse>) responseObserver);
          break;
        case METHODID_NFT:
          serviceImpl.nFT((com.chainmain.nft.v1.QueryNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.chainmain.nft.v1.QueryNFTResponse>) responseObserver);
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
              com.chainmain.nft.v1.QuerySupplyRequest,
              com.chainmain.nft.v1.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryOwnerRequest,
              com.chainmain.nft.v1.QueryOwnerResponse>(
                service, METHODID_OWNER)))
        .addMethod(
          getCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryCollectionRequest,
              com.chainmain.nft.v1.QueryCollectionResponse>(
                service, METHODID_COLLECTION)))
        .addMethod(
          getDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryDenomRequest,
              com.chainmain.nft.v1.QueryDenomResponse>(
                service, METHODID_DENOM)))
        .addMethod(
          getDenomByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryDenomByNameRequest,
              com.chainmain.nft.v1.QueryDenomByNameResponse>(
                service, METHODID_DENOM_BY_NAME)))
        .addMethod(
          getDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryDenomsRequest,
              com.chainmain.nft.v1.QueryDenomsResponse>(
                service, METHODID_DENOMS)))
        .addMethod(
          getNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.chainmain.nft.v1.QueryNFTRequest,
              com.chainmain.nft.v1.QueryNFTResponse>(
                service, METHODID_NFT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.chainmain.nft.v1.QueryProto.getDescriptor();
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
              .addMethod(getDenomByNameMethod())
              .addMethod(getDenomsMethod())
              .addMethod(getNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
