package com.stafihub.stafihub.rmintreward;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: stafihub/rmintreward/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stafihub.stafihub.rmintreward.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> getActLatestCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActLatestCycle",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> getActLatestCycleMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> getActLatestCycleMethod;
    if ((getActLatestCycleMethod = QueryGrpc.getActLatestCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActLatestCycleMethod = QueryGrpc.getActLatestCycleMethod) == null) {
          QueryGrpc.getActLatestCycleMethod = getActLatestCycleMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActLatestCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActLatestCycle"))
              .build();
        }
      }
    }
    return getActLatestCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> getActDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActDetail",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> getActDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> getActDetailMethod;
    if ((getActDetailMethod = QueryGrpc.getActDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActDetailMethod = QueryGrpc.getActDetailMethod) == null) {
          QueryGrpc.getActDetailMethod = getActDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActDetail"))
              .build();
        }
      }
    }
    return getActDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> getUserMintCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserMintCount",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> getUserMintCountMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> getUserMintCountMethod;
    if ((getUserMintCountMethod = QueryGrpc.getUserMintCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserMintCountMethod = QueryGrpc.getUserMintCountMethod) == null) {
          QueryGrpc.getUserMintCountMethod = getUserMintCountMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserMintCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserMintCount"))
              .build();
        }
      }
    }
    return getUserMintCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> getUserActsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserActs",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> getUserActsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> getUserActsMethod;
    if ((getUserActsMethod = QueryGrpc.getUserActsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserActsMethod = QueryGrpc.getUserActsMethod) == null) {
          QueryGrpc.getUserActsMethod = getUserActsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserActs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserActs"))
              .build();
        }
      }
    }
    return getUserActsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> getActCurrentCycleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActCurrentCycle",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> getActCurrentCycleMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> getActCurrentCycleMethod;
    if ((getActCurrentCycleMethod = QueryGrpc.getActCurrentCycleMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActCurrentCycleMethod = QueryGrpc.getActCurrentCycleMethod) == null) {
          QueryGrpc.getActCurrentCycleMethod = getActCurrentCycleMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActCurrentCycle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActCurrentCycle"))
              .build();
        }
      }
    }
    return getActCurrentCycleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimInfoDetail",
      requestType = com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest.class,
      responseType = com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest,
      com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> getClaimInfoDetailMethod;
    if ((getClaimInfoDetailMethod = QueryGrpc.getClaimInfoDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimInfoDetailMethod = QueryGrpc.getClaimInfoDetailMethod) == null) {
          QueryGrpc.getClaimInfoDetailMethod = getClaimInfoDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest, com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimInfoDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimInfoDetail"))
              .build();
        }
      }
    }
    return getClaimInfoDetailMethod;
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
    default void params(com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    default void actLatestCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActLatestCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    default void actDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    default void userMintCount(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserMintCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    default void userActs(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserActsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    default void actCurrentCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActCurrentCycleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    default void claimInfoDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimInfoDetailMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public void actLatestCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActLatestCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public void actDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public void userMintCount(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserMintCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public void userActs(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserActsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public void actCurrentCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActCurrentCycleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public void claimInfoDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimInfoDetailMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse params(com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse actLatestCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActLatestCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse actDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse userMintCount(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserMintCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse userActs(com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserActsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse actCurrentCycle(com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActCurrentCycleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse claimInfoDetail(com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimInfoDetailMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse> params(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActLatestCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse> actLatestCycle(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActLatestCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse> actDetail(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UserMintCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse> userMintCount(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserMintCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of UserActs items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse> userActs(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserActsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActCurrentCycle items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse> actCurrentCycle(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActCurrentCycleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ClaimInfoDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse> claimInfoDetail(
        com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimInfoDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ACT_LATEST_CYCLE = 1;
  private static final int METHODID_ACT_DETAIL = 2;
  private static final int METHODID_USER_MINT_COUNT = 3;
  private static final int METHODID_USER_ACTS = 4;
  private static final int METHODID_ACT_CURRENT_CYCLE = 5;
  private static final int METHODID_CLAIM_INFO_DETAIL = 6;

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
          serviceImpl.params((com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ACT_LATEST_CYCLE:
          serviceImpl.actLatestCycle((com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse>) responseObserver);
          break;
        case METHODID_ACT_DETAIL:
          serviceImpl.actDetail((com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse>) responseObserver);
          break;
        case METHODID_USER_MINT_COUNT:
          serviceImpl.userMintCount((com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse>) responseObserver);
          break;
        case METHODID_USER_ACTS:
          serviceImpl.userActs((com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse>) responseObserver);
          break;
        case METHODID_ACT_CURRENT_CYCLE:
          serviceImpl.actCurrentCycle((com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse>) responseObserver);
          break;
        case METHODID_CLAIM_INFO_DETAIL:
          serviceImpl.claimInfoDetail((com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse>) responseObserver);
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
              com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getActLatestCycleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActLatestCycleResponse>(
                service, METHODID_ACT_LATEST_CYCLE)))
        .addMethod(
          getActDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActDetailResponse>(
                service, METHODID_ACT_DETAIL)))
        .addMethod(
          getUserMintCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryUserMintCountResponse>(
                service, METHODID_USER_MINT_COUNT)))
        .addMethod(
          getUserActsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryUserActsResponse>(
                service, METHODID_USER_ACTS)))
        .addMethod(
          getActCurrentCycleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryActCurrentCycleResponse>(
                service, METHODID_ACT_CURRENT_CYCLE)))
        .addMethod(
          getClaimInfoDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailRequest,
              com.stafihub.stafihub.rmintreward.QueryProto.QueryClaimInfoDetailResponse>(
                service, METHODID_CLAIM_INFO_DETAIL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rmintreward.QueryProto.getDescriptor();
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
              .addMethod(getActLatestCycleMethod())
              .addMethod(getActDetailMethod())
              .addMethod(getUserMintCountMethod())
              .addMethod(getUserActsMethod())
              .addMethod(getActCurrentCycleMethod())
              .addMethod(getClaimInfoDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
