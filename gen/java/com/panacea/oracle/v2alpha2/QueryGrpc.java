package com.panacea.oracle.v2alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: panacea/oracle/v2alpha2/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "panacea.oracle.v2alpha2.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOraclesRequest,
      com.panacea.oracle.v2alpha2.QueryOraclesResponse> getOraclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Oracles",
      requestType = com.panacea.oracle.v2alpha2.QueryOraclesRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryOraclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOraclesRequest,
      com.panacea.oracle.v2alpha2.QueryOraclesResponse> getOraclesMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOraclesRequest, com.panacea.oracle.v2alpha2.QueryOraclesResponse> getOraclesMethod;
    if ((getOraclesMethod = QueryGrpc.getOraclesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOraclesMethod = QueryGrpc.getOraclesMethod) == null) {
          QueryGrpc.getOraclesMethod = getOraclesMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOraclesRequest, com.panacea.oracle.v2alpha2.QueryOraclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Oracles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOraclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOraclesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Oracles"))
              .build();
        }
      }
    }
    return getOraclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRequest,
      com.panacea.oracle.v2alpha2.QueryOracleResponse> getOracleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Oracle",
      requestType = com.panacea.oracle.v2alpha2.QueryOracleRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryOracleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRequest,
      com.panacea.oracle.v2alpha2.QueryOracleResponse> getOracleMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRequest, com.panacea.oracle.v2alpha2.QueryOracleResponse> getOracleMethod;
    if ((getOracleMethod = QueryGrpc.getOracleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleMethod = QueryGrpc.getOracleMethod) == null) {
          QueryGrpc.getOracleMethod = getOracleMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOracleRequest, com.panacea.oracle.v2alpha2.QueryOracleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Oracle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Oracle"))
              .build();
        }
      }
    }
    return getOracleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest,
      com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> getOracleRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleRegistration",
      requestType = com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest,
      com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> getOracleRegistrationMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest, com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> getOracleRegistrationMethod;
    if ((getOracleRegistrationMethod = QueryGrpc.getOracleRegistrationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleRegistrationMethod = QueryGrpc.getOracleRegistrationMethod) == null) {
          QueryGrpc.getOracleRegistrationMethod = getOracleRegistrationMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest, com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleRegistration"))
              .build();
        }
      }
    }
    return getOracleRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest,
      com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> getOracleRegistrationVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleRegistrationVote",
      requestType = com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest,
      com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> getOracleRegistrationVoteMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest, com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> getOracleRegistrationVoteMethod;
    if ((getOracleRegistrationVoteMethod = QueryGrpc.getOracleRegistrationVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleRegistrationVoteMethod = QueryGrpc.getOracleRegistrationVoteMethod) == null) {
          QueryGrpc.getOracleRegistrationVoteMethod = getOracleRegistrationVoteMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest, com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleRegistrationVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleRegistrationVote"))
              .build();
        }
      }
    }
    return getOracleRegistrationVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleParamsRequest,
      com.panacea.oracle.v2alpha2.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.panacea.oracle.v2alpha2.QueryOracleParamsRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleParamsRequest,
      com.panacea.oracle.v2alpha2.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleParamsRequest, com.panacea.oracle.v2alpha2.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOracleParamsRequest, com.panacea.oracle.v2alpha2.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest,
      com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> getOracleUpgradeInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OracleUpgradeInfo",
      requestType = com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest.class,
      responseType = com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest,
      com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> getOracleUpgradeInfoMethod() {
    io.grpc.MethodDescriptor<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest, com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> getOracleUpgradeInfoMethod;
    if ((getOracleUpgradeInfoMethod = QueryGrpc.getOracleUpgradeInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOracleUpgradeInfoMethod = QueryGrpc.getOracleUpgradeInfoMethod) == null) {
          QueryGrpc.getOracleUpgradeInfoMethod = getOracleUpgradeInfoMethod =
              io.grpc.MethodDescriptor.<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest, com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OracleUpgradeInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OracleUpgradeInfo"))
              .build();
        }
      }
    }
    return getOracleUpgradeInfoMethod;
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
     * Oracles returns a list of oracles.
     * </pre>
     */
    default void oracles(com.panacea.oracle.v2alpha2.QueryOraclesRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOraclesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOraclesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Oracle returns a oracle.
     * </pre>
     */
    default void oracle(com.panacea.oracle.v2alpha2.QueryOracleRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleMethod(), responseObserver);
    }

    /**
     * <pre>
     * OracleRegistration returns a OracleRegistration details.
     * </pre>
     */
    default void oracleRegistration(com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * OracleRegistrationVote a OracleRegistrationVote details.
     * </pre>
     */
    default void oracleRegistrationVote(com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleRegistrationVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns params of oracle module.
     * </pre>
     */
    default void params(com.panacea.oracle.v2alpha2.QueryOracleParamsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
     * </pre>
     */
    default void oracleUpgradeInfo(com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOracleUpgradeInfoMethod(), responseObserver);
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
     * Oracles returns a list of oracles.
     * </pre>
     */
    public void oracles(com.panacea.oracle.v2alpha2.QueryOraclesRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOraclesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOraclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Oracle returns a oracle.
     * </pre>
     */
    public void oracle(com.panacea.oracle.v2alpha2.QueryOracleRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OracleRegistration returns a OracleRegistration details.
     * </pre>
     */
    public void oracleRegistration(com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OracleRegistrationVote a OracleRegistrationVote details.
     * </pre>
     */
    public void oracleRegistrationVote(com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleRegistrationVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns params of oracle module.
     * </pre>
     */
    public void params(com.panacea.oracle.v2alpha2.QueryOracleParamsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
     * </pre>
     */
    public void oracleUpgradeInfo(com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest request,
        io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOracleUpgradeInfoMethod(), getCallOptions()), request, responseObserver);
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
     * Oracles returns a list of oracles.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryOraclesResponse oracles(com.panacea.oracle.v2alpha2.QueryOraclesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOraclesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Oracle returns a oracle.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryOracleResponse oracle(com.panacea.oracle.v2alpha2.QueryOracleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OracleRegistration returns a OracleRegistration details.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse oracleRegistration(com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OracleRegistrationVote a OracleRegistrationVote details.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse oracleRegistrationVote(com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleRegistrationVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns params of oracle module.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryParamsResponse params(com.panacea.oracle.v2alpha2.QueryOracleParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
     * </pre>
     */
    public com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse oracleUpgradeInfo(com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOracleUpgradeInfoMethod(), getCallOptions(), request);
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
     * Oracles returns a list of oracles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryOraclesResponse> oracles(
        com.panacea.oracle.v2alpha2.QueryOraclesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOraclesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Oracle returns a oracle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryOracleResponse> oracle(
        com.panacea.oracle.v2alpha2.QueryOracleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OracleRegistration returns a OracleRegistration details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse> oracleRegistration(
        com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OracleRegistrationVote a OracleRegistrationVote details.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse> oracleRegistrationVote(
        com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleRegistrationVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns params of oracle module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryParamsResponse> params(
        com.panacea.oracle.v2alpha2.QueryOracleParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse> oracleUpgradeInfo(
        com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOracleUpgradeInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORACLES = 0;
  private static final int METHODID_ORACLE = 1;
  private static final int METHODID_ORACLE_REGISTRATION = 2;
  private static final int METHODID_ORACLE_REGISTRATION_VOTE = 3;
  private static final int METHODID_PARAMS = 4;
  private static final int METHODID_ORACLE_UPGRADE_INFO = 5;

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
        case METHODID_ORACLES:
          serviceImpl.oracles((com.panacea.oracle.v2alpha2.QueryOraclesRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOraclesResponse>) responseObserver);
          break;
        case METHODID_ORACLE:
          serviceImpl.oracle((com.panacea.oracle.v2alpha2.QueryOracleRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleResponse>) responseObserver);
          break;
        case METHODID_ORACLE_REGISTRATION:
          serviceImpl.oracleRegistration((com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse>) responseObserver);
          break;
        case METHODID_ORACLE_REGISTRATION_VOTE:
          serviceImpl.oracleRegistrationVote((com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.panacea.oracle.v2alpha2.QueryOracleParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ORACLE_UPGRADE_INFO:
          serviceImpl.oracleUpgradeInfo((com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse>) responseObserver);
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
          getOraclesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOraclesRequest,
              com.panacea.oracle.v2alpha2.QueryOraclesResponse>(
                service, METHODID_ORACLES)))
        .addMethod(
          getOracleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOracleRequest,
              com.panacea.oracle.v2alpha2.QueryOracleResponse>(
                service, METHODID_ORACLE)))
        .addMethod(
          getOracleRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOracleRegistrationRequest,
              com.panacea.oracle.v2alpha2.QueryOracleRegistrationResponse>(
                service, METHODID_ORACLE_REGISTRATION)))
        .addMethod(
          getOracleRegistrationVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteRequest,
              com.panacea.oracle.v2alpha2.QueryOracleRegistrationVoteResponse>(
                service, METHODID_ORACLE_REGISTRATION_VOTE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOracleParamsRequest,
              com.panacea.oracle.v2alpha2.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getOracleUpgradeInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoRequest,
              com.panacea.oracle.v2alpha2.QueryOracleUpgradeInfoResponse>(
                service, METHODID_ORACLE_UPGRADE_INFO)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.oracle.v2alpha2.QueryProto.getDescriptor();
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
              .addMethod(getOraclesMethod())
              .addMethod(getOracleMethod())
              .addMethod(getOracleRegistrationMethod())
              .addMethod(getOracleRegistrationVoteMethod())
              .addMethod(getParamsMethod())
              .addMethod(getOracleUpgradeInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
