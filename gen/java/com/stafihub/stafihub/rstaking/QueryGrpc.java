package com.stafihub.stafihub.rstaking;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/rstaking/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rstaking.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> getInflationBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InflationBase",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> getInflationBaseMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> getInflationBaseMethod;
    if ((getInflationBaseMethod = QueryGrpc.getInflationBaseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getInflationBaseMethod = QueryGrpc.getInflationBaseMethod) == null) {
          QueryGrpc.getInflationBaseMethod = getInflationBaseMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InflationBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("InflationBase"))
              .build();
        }
      }
    }
    return getInflationBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorWhitelist",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> getValidatorWhitelistMethod;
    if ((getValidatorWhitelistMethod = QueryGrpc.getValidatorWhitelistMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorWhitelistMethod = QueryGrpc.getValidatorWhitelistMethod) == null) {
          QueryGrpc.getValidatorWhitelistMethod = getValidatorWhitelistMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorWhitelist"))
              .build();
        }
      }
    }
    return getValidatorWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorWhitelistSwitch",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> getValidatorWhitelistSwitchMethod;
    if ((getValidatorWhitelistSwitchMethod = QueryGrpc.getValidatorWhitelistSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorWhitelistSwitchMethod = QueryGrpc.getValidatorWhitelistSwitchMethod) == null) {
          QueryGrpc.getValidatorWhitelistSwitchMethod = getValidatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getValidatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorWhitelist",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> getDelegatorWhitelistMethod;
    if ((getDelegatorWhitelistMethod = QueryGrpc.getDelegatorWhitelistMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorWhitelistMethod = QueryGrpc.getDelegatorWhitelistMethod) == null) {
          QueryGrpc.getDelegatorWhitelistMethod = getDelegatorWhitelistMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorWhitelist"))
              .build();
        }
      }
    }
    return getDelegatorWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorWhitelistSwitch",
      requestType = com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest.class,
      responseType = com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest,
      com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> getDelegatorWhitelistSwitchMethod;
    if ((getDelegatorWhitelistSwitchMethod = QueryGrpc.getDelegatorWhitelistSwitchMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorWhitelistSwitchMethod = QueryGrpc.getDelegatorWhitelistSwitchMethod) == null) {
          QueryGrpc.getDelegatorWhitelistSwitchMethod = getDelegatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest, com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getDelegatorWhitelistSwitchMethod;
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
    default void params(com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    default void inflationBase(com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInflationBaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    default void validatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    default void validatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    default void delegatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    default void delegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorWhitelistSwitchMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public void inflationBase(com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInflationBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public void validatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public void validatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public void delegatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public void delegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse params(com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse inflationBase(com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInflationBaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse validatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse validatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse delegatorWhitelist(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse delegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorWhitelistSwitchMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse> params(
        com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of InflationBase items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse> inflationBase(
        com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInflationBaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ValidatorWhitelist items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse> validatorWhitelist(
        com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of WhitelistSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse> validatorWhitelistSwitch(
        com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelist items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse> delegatorWhitelist(
        com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of DelegatorWhitelistSwitch items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse> delegatorWhitelistSwitch(
        com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorWhitelistSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_INFLATION_BASE = 1;
  private static final int METHODID_VALIDATOR_WHITELIST = 2;
  private static final int METHODID_VALIDATOR_WHITELIST_SWITCH = 3;
  private static final int METHODID_DELEGATOR_WHITELIST = 4;
  private static final int METHODID_DELEGATOR_WHITELIST_SWITCH = 5;

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
          serviceImpl.params((com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_INFLATION_BASE:
          serviceImpl.inflationBase((com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_WHITELIST:
          serviceImpl.validatorWhitelist((com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_WHITELIST_SWITCH:
          serviceImpl.validatorWhitelistSwitch((com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_WHITELIST:
          serviceImpl.delegatorWhitelist((com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_WHITELIST_SWITCH:
          serviceImpl.delegatorWhitelistSwitch((com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse>) responseObserver);
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
              com.stafihub.stafihub.rstaking.QueryProto.QueryParamsRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getInflationBaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryInflationBaseResponse>(
                service, METHODID_INFLATION_BASE)))
        .addMethod(
          getValidatorWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistResponse>(
                service, METHODID_VALIDATOR_WHITELIST)))
        .addMethod(
          getValidatorWhitelistSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryValidatorWhitelistSwitchResponse>(
                service, METHODID_VALIDATOR_WHITELIST_SWITCH)))
        .addMethod(
          getDelegatorWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistResponse>(
                service, METHODID_DELEGATOR_WHITELIST)))
        .addMethod(
          getDelegatorWhitelistSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchRequest,
              com.stafihub.stafihub.rstaking.QueryProto.QueryDelegatorWhitelistSwitchResponse>(
                service, METHODID_DELEGATOR_WHITELIST_SWITCH)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rstaking.QueryProto.getDescriptor();
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
              .addMethod(getInflationBaseMethod())
              .addMethod(getValidatorWhitelistMethod())
              .addMethod(getValidatorWhitelistSwitchMethod())
              .addMethod(getDelegatorWhitelistMethod())
              .addMethod(getDelegatorWhitelistSwitchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
