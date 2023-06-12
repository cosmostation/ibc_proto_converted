package com.kyve.query.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryDelegation contains all rpc requests related to direct delegation data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kyve/query/v1beta1/bundles.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryBundlesGrpc {

  private QueryBundlesGrpc() {}

  public static final String SERVICE_NAME = "kyve.query.v1beta1.QueryBundles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundles",
      requestType = com.kyve.query.v1beta1.QueryFinalizedBundlesRequest.class,
      responseType = com.kyve.query.v1beta1.QueryFinalizedBundlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesRequest, com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> getFinalizedBundlesMethod;
    if ((getFinalizedBundlesMethod = QueryBundlesGrpc.getFinalizedBundlesMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundlesMethod = QueryBundlesGrpc.getFinalizedBundlesMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundlesMethod = getFinalizedBundlesMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryFinalizedBundlesRequest, com.kyve.query.v1beta1.QueryFinalizedBundlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundlesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundles"))
              .build();
        }
      }
    }
    return getFinalizedBundlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundleRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundleResponse> getFinalizedBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundle",
      requestType = com.kyve.query.v1beta1.QueryFinalizedBundleRequest.class,
      responseType = com.kyve.query.v1beta1.QueryFinalizedBundleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundleRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundleResponse> getFinalizedBundleMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundleRequest, com.kyve.query.v1beta1.QueryFinalizedBundleResponse> getFinalizedBundleMethod;
    if ((getFinalizedBundleMethod = QueryBundlesGrpc.getFinalizedBundleMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundleMethod = QueryBundlesGrpc.getFinalizedBundleMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundleMethod = getFinalizedBundleMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryFinalizedBundleRequest, com.kyve.query.v1beta1.QueryFinalizedBundleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundle"))
              .build();
        }
      }
    }
    return getFinalizedBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinalizedBundlesByHeight",
      requestType = com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest.class,
      responseType = com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest,
      com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest, com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> getFinalizedBundlesByHeightMethod;
    if ((getFinalizedBundlesByHeightMethod = QueryBundlesGrpc.getFinalizedBundlesByHeightMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getFinalizedBundlesByHeightMethod = QueryBundlesGrpc.getFinalizedBundlesByHeightMethod) == null) {
          QueryBundlesGrpc.getFinalizedBundlesByHeightMethod = getFinalizedBundlesByHeightMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest, com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinalizedBundlesByHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("FinalizedBundlesByHeight"))
              .build();
        }
      }
    }
    return getFinalizedBundlesByHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest,
      com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentVoteStatus",
      requestType = com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest.class,
      responseType = com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest,
      com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest, com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> getCurrentVoteStatusMethod;
    if ((getCurrentVoteStatusMethod = QueryBundlesGrpc.getCurrentVoteStatusMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCurrentVoteStatusMethod = QueryBundlesGrpc.getCurrentVoteStatusMethod) == null) {
          QueryBundlesGrpc.getCurrentVoteStatusMethod = getCurrentVoteStatusMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest, com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentVoteStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CurrentVoteStatus"))
              .build();
        }
      }
    }
    return getCurrentVoteStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanValidateRequest,
      com.kyve.query.v1beta1.QueryCanValidateResponse> getCanValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanValidate",
      requestType = com.kyve.query.v1beta1.QueryCanValidateRequest.class,
      responseType = com.kyve.query.v1beta1.QueryCanValidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanValidateRequest,
      com.kyve.query.v1beta1.QueryCanValidateResponse> getCanValidateMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanValidateRequest, com.kyve.query.v1beta1.QueryCanValidateResponse> getCanValidateMethod;
    if ((getCanValidateMethod = QueryBundlesGrpc.getCanValidateMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanValidateMethod = QueryBundlesGrpc.getCanValidateMethod) == null) {
          QueryBundlesGrpc.getCanValidateMethod = getCanValidateMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryCanValidateRequest, com.kyve.query.v1beta1.QueryCanValidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanValidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanValidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanValidate"))
              .build();
        }
      }
    }
    return getCanValidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanProposeRequest,
      com.kyve.query.v1beta1.QueryCanProposeResponse> getCanProposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanPropose",
      requestType = com.kyve.query.v1beta1.QueryCanProposeRequest.class,
      responseType = com.kyve.query.v1beta1.QueryCanProposeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanProposeRequest,
      com.kyve.query.v1beta1.QueryCanProposeResponse> getCanProposeMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanProposeRequest, com.kyve.query.v1beta1.QueryCanProposeResponse> getCanProposeMethod;
    if ((getCanProposeMethod = QueryBundlesGrpc.getCanProposeMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanProposeMethod = QueryBundlesGrpc.getCanProposeMethod) == null) {
          QueryBundlesGrpc.getCanProposeMethod = getCanProposeMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryCanProposeRequest, com.kyve.query.v1beta1.QueryCanProposeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanPropose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanProposeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanProposeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanPropose"))
              .build();
        }
      }
    }
    return getCanProposeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanVoteRequest,
      com.kyve.query.v1beta1.QueryCanVoteResponse> getCanVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanVote",
      requestType = com.kyve.query.v1beta1.QueryCanVoteRequest.class,
      responseType = com.kyve.query.v1beta1.QueryCanVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanVoteRequest,
      com.kyve.query.v1beta1.QueryCanVoteResponse> getCanVoteMethod() {
    io.grpc.MethodDescriptor<com.kyve.query.v1beta1.QueryCanVoteRequest, com.kyve.query.v1beta1.QueryCanVoteResponse> getCanVoteMethod;
    if ((getCanVoteMethod = QueryBundlesGrpc.getCanVoteMethod) == null) {
      synchronized (QueryBundlesGrpc.class) {
        if ((getCanVoteMethod = QueryBundlesGrpc.getCanVoteMethod) == null) {
          QueryBundlesGrpc.getCanVoteMethod = getCanVoteMethod =
              io.grpc.MethodDescriptor.<com.kyve.query.v1beta1.QueryCanVoteRequest, com.kyve.query.v1beta1.QueryCanVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CanVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kyve.query.v1beta1.QueryCanVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryBundlesMethodDescriptorSupplier("CanVote"))
              .build();
        }
      }
    }
    return getCanVoteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryBundlesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesStub>() {
        @java.lang.Override
        public QueryBundlesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesStub(channel, callOptions);
        }
      };
    return QueryBundlesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBundlesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesBlockingStub>() {
        @java.lang.Override
        public QueryBundlesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesBlockingStub(channel, callOptions);
        }
      };
    return QueryBundlesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryBundlesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBundlesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBundlesFutureStub>() {
        @java.lang.Override
        public QueryBundlesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBundlesFutureStub(channel, callOptions);
        }
      };
    return QueryBundlesFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    default void finalizedBundles(com.kyve.query.v1beta1.QueryFinalizedBundlesRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizedBundlesMethod(), responseObserver);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    default void finalizedBundle(com.kyve.query.v1beta1.QueryFinalizedBundleRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizedBundleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    default void finalizedBundlesByHeight(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinalizedBundlesByHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    default void currentVoteStatus(com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentVoteStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    default void canValidate(com.kyve.query.v1beta1.QueryCanValidateRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanValidateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCanValidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    default void canPropose(com.kyve.query.v1beta1.QueryCanProposeRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanProposeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCanProposeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    default void canVote(com.kyve.query.v1beta1.QueryCanVoteRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCanVoteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryBundles.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static abstract class QueryBundlesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryBundlesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryBundles.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesStub
      extends io.grpc.stub.AbstractAsyncStub<QueryBundlesStub> {
    private QueryBundlesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public void finalizedBundles(com.kyve.query.v1beta1.QueryFinalizedBundlesRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizedBundlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public void finalizedBundle(com.kyve.query.v1beta1.QueryFinalizedBundleRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizedBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public void finalizedBundlesByHeight(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinalizedBundlesByHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public void currentVoteStatus(com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentVoteStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public void canValidate(com.kyve.query.v1beta1.QueryCanValidateRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanValidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCanValidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public void canPropose(com.kyve.query.v1beta1.QueryCanProposeRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanProposeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCanProposeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public void canVote(com.kyve.query.v1beta1.QueryCanVoteRequest request,
        io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCanVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryBundles.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBundlesBlockingStub> {
    private QueryBundlesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryFinalizedBundlesResponse finalizedBundles(com.kyve.query.v1beta1.QueryFinalizedBundlesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizedBundlesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryFinalizedBundleResponse finalizedBundle(com.kyve.query.v1beta1.QueryFinalizedBundleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizedBundleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse finalizedBundlesByHeight(com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinalizedBundlesByHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse currentVoteStatus(com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentVoteStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryCanValidateResponse canValidate(com.kyve.query.v1beta1.QueryCanValidateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCanValidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryCanProposeResponse canPropose(com.kyve.query.v1beta1.QueryCanProposeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCanProposeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public com.kyve.query.v1beta1.QueryCanVoteResponse canVote(com.kyve.query.v1beta1.QueryCanVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCanVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryBundles.
   * <pre>
   * QueryDelegation contains all rpc requests related to direct delegation data
   * </pre>
   */
  public static final class QueryBundlesFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryBundlesFutureStub> {
    private QueryBundlesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBundlesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBundlesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * FinalizedBundles ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryFinalizedBundlesResponse> finalizedBundles(
        com.kyve.query.v1beta1.QueryFinalizedBundlesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizedBundlesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FinalizedBundle ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryFinalizedBundleResponse> finalizedBundle(
        com.kyve.query.v1beta1.QueryFinalizedBundleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizedBundleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries the bundle which contains the data given height
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse> finalizedBundlesByHeight(
        com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinalizedBundlesByHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentVoteStatus ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse> currentVoteStatus(
        com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentVoteStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanValidate ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryCanValidateResponse> canValidate(
        com.kyve.query.v1beta1.QueryCanValidateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCanValidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanPropose ...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryCanProposeResponse> canPropose(
        com.kyve.query.v1beta1.QueryCanProposeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCanProposeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CanVote checks if voter on pool can still vote for the given bundle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kyve.query.v1beta1.QueryCanVoteResponse> canVote(
        com.kyve.query.v1beta1.QueryCanVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCanVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FINALIZED_BUNDLES = 0;
  private static final int METHODID_FINALIZED_BUNDLE = 1;
  private static final int METHODID_FINALIZED_BUNDLES_BY_HEIGHT = 2;
  private static final int METHODID_CURRENT_VOTE_STATUS = 3;
  private static final int METHODID_CAN_VALIDATE = 4;
  private static final int METHODID_CAN_PROPOSE = 5;
  private static final int METHODID_CAN_VOTE = 6;

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
        case METHODID_FINALIZED_BUNDLES:
          serviceImpl.finalizedBundles((com.kyve.query.v1beta1.QueryFinalizedBundlesRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesResponse>) responseObserver);
          break;
        case METHODID_FINALIZED_BUNDLE:
          serviceImpl.finalizedBundle((com.kyve.query.v1beta1.QueryFinalizedBundleRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundleResponse>) responseObserver);
          break;
        case METHODID_FINALIZED_BUNDLES_BY_HEIGHT:
          serviceImpl.finalizedBundlesByHeight((com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse>) responseObserver);
          break;
        case METHODID_CURRENT_VOTE_STATUS:
          serviceImpl.currentVoteStatus((com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse>) responseObserver);
          break;
        case METHODID_CAN_VALIDATE:
          serviceImpl.canValidate((com.kyve.query.v1beta1.QueryCanValidateRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanValidateResponse>) responseObserver);
          break;
        case METHODID_CAN_PROPOSE:
          serviceImpl.canPropose((com.kyve.query.v1beta1.QueryCanProposeRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanProposeResponse>) responseObserver);
          break;
        case METHODID_CAN_VOTE:
          serviceImpl.canVote((com.kyve.query.v1beta1.QueryCanVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.kyve.query.v1beta1.QueryCanVoteResponse>) responseObserver);
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
          getFinalizedBundlesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryFinalizedBundlesRequest,
              com.kyve.query.v1beta1.QueryFinalizedBundlesResponse>(
                service, METHODID_FINALIZED_BUNDLES)))
        .addMethod(
          getFinalizedBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryFinalizedBundleRequest,
              com.kyve.query.v1beta1.QueryFinalizedBundleResponse>(
                service, METHODID_FINALIZED_BUNDLE)))
        .addMethod(
          getFinalizedBundlesByHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest,
              com.kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse>(
                service, METHODID_FINALIZED_BUNDLES_BY_HEIGHT)))
        .addMethod(
          getCurrentVoteStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryCurrentVoteStatusRequest,
              com.kyve.query.v1beta1.QueryCurrentVoteStatusResponse>(
                service, METHODID_CURRENT_VOTE_STATUS)))
        .addMethod(
          getCanValidateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryCanValidateRequest,
              com.kyve.query.v1beta1.QueryCanValidateResponse>(
                service, METHODID_CAN_VALIDATE)))
        .addMethod(
          getCanProposeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryCanProposeRequest,
              com.kyve.query.v1beta1.QueryCanProposeResponse>(
                service, METHODID_CAN_PROPOSE)))
        .addMethod(
          getCanVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kyve.query.v1beta1.QueryCanVoteRequest,
              com.kyve.query.v1beta1.QueryCanVoteResponse>(
                service, METHODID_CAN_VOTE)))
        .build();
  }

  private static abstract class QueryBundlesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBundlesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kyve.query.v1beta1.BundlesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryBundles");
    }
  }

  private static final class QueryBundlesFileDescriptorSupplier
      extends QueryBundlesBaseDescriptorSupplier {
    QueryBundlesFileDescriptorSupplier() {}
  }

  private static final class QueryBundlesMethodDescriptorSupplier
      extends QueryBundlesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryBundlesMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryBundlesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryBundlesFileDescriptorSupplier())
              .addMethod(getFinalizedBundlesMethod())
              .addMethod(getFinalizedBundleMethod())
              .addMethod(getFinalizedBundlesByHeightMethod())
              .addMethod(getCurrentVoteStatusMethod())
              .addMethod(getCanValidateMethod())
              .addMethod(getCanProposeMethod())
              .addMethod(getCanVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
