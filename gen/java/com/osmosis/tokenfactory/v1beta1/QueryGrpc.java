package com.osmosis.tokenfactory.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/tokenfactory/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.tokenfactory.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> getDenomAuthorityMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomAuthorityMetadata",
      requestType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest.class,
      responseType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> getDenomAuthorityMetadataMethod() {
    io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> getDenomAuthorityMetadataMethod;
    if ((getDenomAuthorityMetadataMethod = QueryGrpc.getDenomAuthorityMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomAuthorityMetadataMethod = QueryGrpc.getDenomAuthorityMetadataMethod) == null) {
          QueryGrpc.getDenomAuthorityMetadataMethod = getDenomAuthorityMetadataMethod =
              io.grpc.MethodDescriptor.<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomAuthorityMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomAuthorityMetadata"))
              .build();
        }
      }
    }
    return getDenomAuthorityMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> getDenomsFromCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomsFromCreator",
      requestType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest.class,
      responseType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> getDenomsFromCreatorMethod() {
    io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> getDenomsFromCreatorMethod;
    if ((getDenomsFromCreatorMethod = QueryGrpc.getDenomsFromCreatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomsFromCreatorMethod = QueryGrpc.getDenomsFromCreatorMethod) == null) {
          QueryGrpc.getDenomsFromCreatorMethod = getDenomsFromCreatorMethod =
              io.grpc.MethodDescriptor.<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomsFromCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomsFromCreator"))
              .build();
        }
      }
    }
    return getDenomsFromCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> getBeforeSendHookAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeforeSendHookAddress",
      requestType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest.class,
      responseType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> getBeforeSendHookAddressMethod() {
    io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> getBeforeSendHookAddressMethod;
    if ((getBeforeSendHookAddressMethod = QueryGrpc.getBeforeSendHookAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBeforeSendHookAddressMethod = QueryGrpc.getBeforeSendHookAddressMethod) == null) {
          QueryGrpc.getBeforeSendHookAddressMethod = getBeforeSendHookAddressMethod =
              io.grpc.MethodDescriptor.<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeforeSendHookAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BeforeSendHookAddress"))
              .build();
        }
      }
    }
    return getBeforeSendHookAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> getAllBeforeSendHooksAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllBeforeSendHooksAddresses",
      requestType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest.class,
      responseType = com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest,
      com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> getAllBeforeSendHooksAddressesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> getAllBeforeSendHooksAddressesMethod;
    if ((getAllBeforeSendHooksAddressesMethod = QueryGrpc.getAllBeforeSendHooksAddressesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllBeforeSendHooksAddressesMethod = QueryGrpc.getAllBeforeSendHooksAddressesMethod) == null) {
          QueryGrpc.getAllBeforeSendHooksAddressesMethod = getAllBeforeSendHooksAddressesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest, com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllBeforeSendHooksAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllBeforeSendHooksAddresses"))
              .build();
        }
      }
    }
    return getAllBeforeSendHooksAddressesMethod;
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
     * Params defines a gRPC query method that returns the tokenfactory module's
     * parameters.
     * </pre>
     */
    default void params(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomAuthorityMetadata defines a gRPC query method for fetching
     * DenomAuthorityMetadata for a particular denom.
     * </pre>
     */
    default void denomAuthorityMetadata(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomAuthorityMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomsFromCreator defines a gRPC query method for fetching all
     * denominations created by a specific admin/creator.
     * </pre>
     */
    default void denomsFromCreator(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomsFromCreatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeforeSendHookAddress defines a gRPC query method for
     * getting the address registered for the before send hook.
     * </pre>
     */
    default void beforeSendHookAddress(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeforeSendHookAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllBeforeSendHooksAddresses defines a gRPC query method for
     * getting all addresses with before send hook registered.
     * The response returns two arrays, an array with a list of denom and an array
     * of before send hook addresses. The idx of denom corresponds to before send
     * hook addresse's idx.
     * </pre>
     */
    default void allBeforeSendHooksAddresses(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllBeforeSendHooksAddressesMethod(), responseObserver);
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
     * Params defines a gRPC query method that returns the tokenfactory module's
     * parameters.
     * </pre>
     */
    public void params(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomAuthorityMetadata defines a gRPC query method for fetching
     * DenomAuthorityMetadata for a particular denom.
     * </pre>
     */
    public void denomAuthorityMetadata(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomAuthorityMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomsFromCreator defines a gRPC query method for fetching all
     * denominations created by a specific admin/creator.
     * </pre>
     */
    public void denomsFromCreator(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomsFromCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeforeSendHookAddress defines a gRPC query method for
     * getting the address registered for the before send hook.
     * </pre>
     */
    public void beforeSendHookAddress(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeforeSendHookAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllBeforeSendHooksAddresses defines a gRPC query method for
     * getting all addresses with before send hook registered.
     * The response returns two arrays, an array with a list of denom and an array
     * of before send hook addresses. The idx of denom corresponds to before send
     * hook addresse's idx.
     * </pre>
     */
    public void allBeforeSendHooksAddresses(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllBeforeSendHooksAddressesMethod(), getCallOptions()), request, responseObserver);
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
     * Params defines a gRPC query method that returns the tokenfactory module's
     * parameters.
     * </pre>
     */
    public com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse params(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomAuthorityMetadata defines a gRPC query method for fetching
     * DenomAuthorityMetadata for a particular denom.
     * </pre>
     */
    public com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse denomAuthorityMetadata(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomAuthorityMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomsFromCreator defines a gRPC query method for fetching all
     * denominations created by a specific admin/creator.
     * </pre>
     */
    public com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse denomsFromCreator(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomsFromCreatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeforeSendHookAddress defines a gRPC query method for
     * getting the address registered for the before send hook.
     * </pre>
     */
    public com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse beforeSendHookAddress(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeforeSendHookAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllBeforeSendHooksAddresses defines a gRPC query method for
     * getting all addresses with before send hook registered.
     * The response returns two arrays, an array with a list of denom and an array
     * of before send hook addresses. The idx of denom corresponds to before send
     * hook addresse's idx.
     * </pre>
     */
    public com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse allBeforeSendHooksAddresses(com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllBeforeSendHooksAddressesMethod(), getCallOptions(), request);
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
     * Params defines a gRPC query method that returns the tokenfactory module's
     * parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse> params(
        com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomAuthorityMetadata defines a gRPC query method for fetching
     * DenomAuthorityMetadata for a particular denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse> denomAuthorityMetadata(
        com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomAuthorityMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomsFromCreator defines a gRPC query method for fetching all
     * denominations created by a specific admin/creator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse> denomsFromCreator(
        com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomsFromCreatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeforeSendHookAddress defines a gRPC query method for
     * getting the address registered for the before send hook.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse> beforeSendHookAddress(
        com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeforeSendHookAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllBeforeSendHooksAddresses defines a gRPC query method for
     * getting all addresses with before send hook registered.
     * The response returns two arrays, an array with a list of denom and an array
     * of before send hook addresses. The idx of denom corresponds to before send
     * hook addresse's idx.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse> allBeforeSendHooksAddresses(
        com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllBeforeSendHooksAddressesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_DENOM_AUTHORITY_METADATA = 1;
  private static final int METHODID_DENOMS_FROM_CREATOR = 2;
  private static final int METHODID_BEFORE_SEND_HOOK_ADDRESS = 3;
  private static final int METHODID_ALL_BEFORE_SEND_HOOKS_ADDRESSES = 4;

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
          serviceImpl.params((com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DENOM_AUTHORITY_METADATA:
          serviceImpl.denomAuthorityMetadata((com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse>) responseObserver);
          break;
        case METHODID_DENOMS_FROM_CREATOR:
          serviceImpl.denomsFromCreator((com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse>) responseObserver);
          break;
        case METHODID_BEFORE_SEND_HOOK_ADDRESS:
          serviceImpl.beforeSendHookAddress((com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse>) responseObserver);
          break;
        case METHODID_ALL_BEFORE_SEND_HOOKS_ADDRESSES:
          serviceImpl.allBeforeSendHooksAddresses((com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse>) responseObserver);
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
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsRequest,
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDenomAuthorityMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataRequest,
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomAuthorityMetadataResponse>(
                service, METHODID_DENOM_AUTHORITY_METADATA)))
        .addMethod(
          getDenomsFromCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorRequest,
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryDenomsFromCreatorResponse>(
                service, METHODID_DENOMS_FROM_CREATOR)))
        .addMethod(
          getBeforeSendHookAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressRequest,
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryBeforeSendHookAddressResponse>(
                service, METHODID_BEFORE_SEND_HOOK_ADDRESS)))
        .addMethod(
          getAllBeforeSendHooksAddressesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesRequest,
              com.osmosis.tokenfactory.v1beta1.QueryProto.QueryAllBeforeSendHooksAddressesResponse>(
                service, METHODID_ALL_BEFORE_SEND_HOOKS_ADDRESSES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.tokenfactory.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getDenomAuthorityMetadataMethod())
              .addMethod(getDenomsFromCreatorMethod())
              .addMethod(getBeforeSendHookAddressMethod())
              .addMethod(getAllBeforeSendHooksAddressesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
