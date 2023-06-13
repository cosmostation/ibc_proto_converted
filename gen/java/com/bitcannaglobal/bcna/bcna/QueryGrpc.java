package com.bitcannaglobal.bcna.bcna;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: bcna/bcna/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "bitcannaglobal.bcna.bcna.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> getBitcannaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bitcannaid",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> getBitcannaidMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> getBitcannaidMethod;
    if ((getBitcannaidMethod = QueryGrpc.getBitcannaidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBitcannaidMethod = QueryGrpc.getBitcannaidMethod) == null) {
          QueryGrpc.getBitcannaidMethod = getBitcannaidMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bitcannaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bitcannaid"))
              .build();
        }
      }
    }
    return getBitcannaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> getBitcannaidAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BitcannaidAll",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> getBitcannaidAllMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> getBitcannaidAllMethod;
    if ((getBitcannaidAllMethod = QueryGrpc.getBitcannaidAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBitcannaidAllMethod = QueryGrpc.getBitcannaidAllMethod) == null) {
          QueryGrpc.getBitcannaidAllMethod = getBitcannaidAllMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BitcannaidAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BitcannaidAll"))
              .build();
        }
      }
    }
    return getBitcannaidAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> getBitcannaidByBcnaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BitcannaidByBcnaid",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> getBitcannaidByBcnaidMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> getBitcannaidByBcnaidMethod;
    if ((getBitcannaidByBcnaidMethod = QueryGrpc.getBitcannaidByBcnaidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBitcannaidByBcnaidMethod = QueryGrpc.getBitcannaidByBcnaidMethod) == null) {
          QueryGrpc.getBitcannaidByBcnaidMethod = getBitcannaidByBcnaidMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BitcannaidByBcnaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BitcannaidByBcnaid"))
              .build();
        }
      }
    }
    return getBitcannaidByBcnaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> getSupplychainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supplychain",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> getSupplychainMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> getSupplychainMethod;
    if ((getSupplychainMethod = QueryGrpc.getSupplychainMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplychainMethod = QueryGrpc.getSupplychainMethod) == null) {
          QueryGrpc.getSupplychainMethod = getSupplychainMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supplychain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supplychain"))
              .build();
        }
      }
    }
    return getSupplychainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> getSupplychainAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplychainAll",
      requestType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest.class,
      responseType = com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest,
      com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> getSupplychainAllMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> getSupplychainAllMethod;
    if ((getSupplychainAllMethod = QueryGrpc.getSupplychainAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplychainAllMethod = QueryGrpc.getSupplychainAllMethod) == null) {
          QueryGrpc.getSupplychainAllMethod = getSupplychainAllMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest, com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupplychainAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SupplychainAll"))
              .build();
        }
      }
    }
    return getSupplychainAllMethod;
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
    default void params(com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by id.
     * </pre>
     */
    default void bitcannaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBitcannaidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Bitcannaid items.
     * </pre>
     */
    default void bitcannaidAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBitcannaidAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by bcnaid.
     * </pre>
     */
    default void bitcannaidByBcnaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBitcannaidByBcnaidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Supplychain by id.
     * </pre>
     */
    default void supplychain(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplychainMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Supplychain items.
     * </pre>
     */
    default void supplychainAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplychainAllMethod(), responseObserver);
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
    public void params(com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by id.
     * </pre>
     */
    public void bitcannaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBitcannaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Bitcannaid items.
     * </pre>
     */
    public void bitcannaidAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBitcannaidAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by bcnaid.
     * </pre>
     */
    public void bitcannaidByBcnaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBitcannaidByBcnaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Supplychain by id.
     * </pre>
     */
    public void supplychain(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplychainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Supplychain items.
     * </pre>
     */
    public void supplychainAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplychainAllMethod(), getCallOptions()), request, responseObserver);
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
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse params(com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by id.
     * </pre>
     */
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse bitcannaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBitcannaidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Bitcannaid items.
     * </pre>
     */
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse bitcannaidAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBitcannaidAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by bcnaid.
     * </pre>
     */
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse bitcannaidByBcnaid(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBitcannaidByBcnaidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Supplychain by id.
     * </pre>
     */
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse supplychain(com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplychainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Supplychain items.
     * </pre>
     */
    public com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse supplychainAll(com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplychainAllMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse> params(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse> bitcannaid(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBitcannaidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Bitcannaid items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse> bitcannaidAll(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBitcannaidAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Bitcannaid by bcnaid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse> bitcannaidByBcnaid(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBitcannaidByBcnaidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Supplychain by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse> supplychain(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplychainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Supplychain items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse> supplychainAll(
        com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplychainAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_BITCANNAID = 1;
  private static final int METHODID_BITCANNAID_ALL = 2;
  private static final int METHODID_BITCANNAID_BY_BCNAID = 3;
  private static final int METHODID_SUPPLYCHAIN = 4;
  private static final int METHODID_SUPPLYCHAIN_ALL = 5;

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
          serviceImpl.params((com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_BITCANNAID:
          serviceImpl.bitcannaid((com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse>) responseObserver);
          break;
        case METHODID_BITCANNAID_ALL:
          serviceImpl.bitcannaidAll((com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse>) responseObserver);
          break;
        case METHODID_BITCANNAID_BY_BCNAID:
          serviceImpl.bitcannaidByBcnaid((com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse>) responseObserver);
          break;
        case METHODID_SUPPLYCHAIN:
          serviceImpl.supplychain((com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse>) responseObserver);
          break;
        case METHODID_SUPPLYCHAIN_ALL:
          serviceImpl.supplychainAll((com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse>) responseObserver);
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
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getBitcannaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidResponse>(
                service, METHODID_BITCANNAID)))
        .addMethod(
          getBitcannaidAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllBitcannaidResponse>(
                service, METHODID_BITCANNAID_ALL)))
        .addMethod(
          getBitcannaidByBcnaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetBitcannaidByBcnaidResponse>(
                service, METHODID_BITCANNAID_BY_BCNAID)))
        .addMethod(
          getSupplychainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryGetSupplychainResponse>(
                service, METHODID_SUPPLYCHAIN)))
        .addMethod(
          getSupplychainAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainRequest,
              com.bitcannaglobal.bcna.bcna.QueryProto.QueryAllSupplychainResponse>(
                service, METHODID_SUPPLYCHAIN_ALL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bitcannaglobal.bcna.bcna.QueryProto.getDescriptor();
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
              .addMethod(getBitcannaidMethod())
              .addMethod(getBitcannaidAllMethod())
              .addMethod(getBitcannaidByBcnaidMethod())
              .addMethod(getSupplychainMethod())
              .addMethod(getSupplychainAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
