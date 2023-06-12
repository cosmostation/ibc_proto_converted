package com.provenance.reward.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for reward module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: provenance/reward/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "provenance.reward.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramByIDRequest,
      com.provenance.reward.v1.QueryRewardProgramByIDResponse> getRewardProgramByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardProgramByID",
      requestType = com.provenance.reward.v1.QueryRewardProgramByIDRequest.class,
      responseType = com.provenance.reward.v1.QueryRewardProgramByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramByIDRequest,
      com.provenance.reward.v1.QueryRewardProgramByIDResponse> getRewardProgramByIDMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramByIDRequest, com.provenance.reward.v1.QueryRewardProgramByIDResponse> getRewardProgramByIDMethod;
    if ((getRewardProgramByIDMethod = QueryGrpc.getRewardProgramByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardProgramByIDMethod = QueryGrpc.getRewardProgramByIDMethod) == null) {
          QueryGrpc.getRewardProgramByIDMethod = getRewardProgramByIDMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.QueryRewardProgramByIDRequest, com.provenance.reward.v1.QueryRewardProgramByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardProgramByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardProgramByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardProgramByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardProgramByID"))
              .build();
        }
      }
    }
    return getRewardProgramByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramsRequest,
      com.provenance.reward.v1.QueryRewardProgramsResponse> getRewardProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardPrograms",
      requestType = com.provenance.reward.v1.QueryRewardProgramsRequest.class,
      responseType = com.provenance.reward.v1.QueryRewardProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramsRequest,
      com.provenance.reward.v1.QueryRewardProgramsResponse> getRewardProgramsMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardProgramsRequest, com.provenance.reward.v1.QueryRewardProgramsResponse> getRewardProgramsMethod;
    if ((getRewardProgramsMethod = QueryGrpc.getRewardProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardProgramsMethod = QueryGrpc.getRewardProgramsMethod) == null) {
          QueryGrpc.getRewardProgramsMethod = getRewardProgramsMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.QueryRewardProgramsRequest, com.provenance.reward.v1.QueryRewardProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardPrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardProgramsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardPrograms"))
              .build();
        }
      }
    }
    return getRewardProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest,
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> getClaimPeriodRewardDistributionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimPeriodRewardDistributions",
      requestType = com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest.class,
      responseType = com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest,
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> getClaimPeriodRewardDistributionsMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> getClaimPeriodRewardDistributionsMethod;
    if ((getClaimPeriodRewardDistributionsMethod = QueryGrpc.getClaimPeriodRewardDistributionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimPeriodRewardDistributionsMethod = QueryGrpc.getClaimPeriodRewardDistributionsMethod) == null) {
          QueryGrpc.getClaimPeriodRewardDistributionsMethod = getClaimPeriodRewardDistributionsMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimPeriodRewardDistributions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimPeriodRewardDistributions"))
              .build();
        }
      }
    }
    return getClaimPeriodRewardDistributionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest,
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> getClaimPeriodRewardDistributionsByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimPeriodRewardDistributionsByID",
      requestType = com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.class,
      responseType = com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest,
      com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> getClaimPeriodRewardDistributionsByIDMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> getClaimPeriodRewardDistributionsByIDMethod;
    if ((getClaimPeriodRewardDistributionsByIDMethod = QueryGrpc.getClaimPeriodRewardDistributionsByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimPeriodRewardDistributionsByIDMethod = QueryGrpc.getClaimPeriodRewardDistributionsByIDMethod) == null) {
          QueryGrpc.getClaimPeriodRewardDistributionsByIDMethod = getClaimPeriodRewardDistributionsByIDMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest, com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimPeriodRewardDistributionsByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimPeriodRewardDistributionsByID"))
              .build();
        }
      }
    }
    return getClaimPeriodRewardDistributionsByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest,
      com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> getRewardDistributionsByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardDistributionsByAddress",
      requestType = com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest.class,
      responseType = com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest,
      com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> getRewardDistributionsByAddressMethod() {
    io.grpc.MethodDescriptor<com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest, com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> getRewardDistributionsByAddressMethod;
    if ((getRewardDistributionsByAddressMethod = QueryGrpc.getRewardDistributionsByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardDistributionsByAddressMethod = QueryGrpc.getRewardDistributionsByAddressMethod) == null) {
          QueryGrpc.getRewardDistributionsByAddressMethod = getRewardDistributionsByAddressMethod =
              io.grpc.MethodDescriptor.<com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest, com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardDistributionsByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardDistributionsByAddress"))
              .build();
        }
      }
    }
    return getRewardDistributionsByAddressMethod;
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
   * Query defines the gRPC querier service for reward module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RewardProgramByID returns a reward program matching the ID.
     * </pre>
     */
    default void rewardProgramByID(com.provenance.reward.v1.QueryRewardProgramByIDRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardProgramByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardPrograms returns a list of reward programs matching the query type.
     * </pre>
     */
    default void rewardPrograms(com.provenance.reward.v1.QueryRewardProgramsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
     * </pre>
     */
    default void claimPeriodRewardDistributions(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimPeriodRewardDistributionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
     * </pre>
     */
    default void claimPeriodRewardDistributionsByID(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimPeriodRewardDistributionsByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
     * status.
     * </pre>
     */
    default void rewardDistributionsByAddress(com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardDistributionsByAddressMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for reward module.
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
   * Query defines the gRPC querier service for reward module.
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
     * RewardProgramByID returns a reward program matching the ID.
     * </pre>
     */
    public void rewardProgramByID(com.provenance.reward.v1.QueryRewardProgramByIDRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardProgramByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardPrograms returns a list of reward programs matching the query type.
     * </pre>
     */
    public void rewardPrograms(com.provenance.reward.v1.QueryRewardProgramsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
     * </pre>
     */
    public void claimPeriodRewardDistributions(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimPeriodRewardDistributionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
     * </pre>
     */
    public void claimPeriodRewardDistributionsByID(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimPeriodRewardDistributionsByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
     * status.
     * </pre>
     */
    public void rewardDistributionsByAddress(com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest request,
        io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardDistributionsByAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for reward module.
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
     * RewardProgramByID returns a reward program matching the ID.
     * </pre>
     */
    public com.provenance.reward.v1.QueryRewardProgramByIDResponse rewardProgramByID(com.provenance.reward.v1.QueryRewardProgramByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardProgramByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardPrograms returns a list of reward programs matching the query type.
     * </pre>
     */
    public com.provenance.reward.v1.QueryRewardProgramsResponse rewardPrograms(com.provenance.reward.v1.QueryRewardProgramsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
     * </pre>
     */
    public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse claimPeriodRewardDistributions(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimPeriodRewardDistributionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
     * </pre>
     */
    public com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse claimPeriodRewardDistributionsByID(com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimPeriodRewardDistributionsByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
     * status.
     * </pre>
     */
    public com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse rewardDistributionsByAddress(com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardDistributionsByAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for reward module.
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
     * RewardProgramByID returns a reward program matching the ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.QueryRewardProgramByIDResponse> rewardProgramByID(
        com.provenance.reward.v1.QueryRewardProgramByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardProgramByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardPrograms returns a list of reward programs matching the query type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.QueryRewardProgramsResponse> rewardPrograms(
        com.provenance.reward.v1.QueryRewardProgramsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributions returns a list of claim period reward distributions matching the claim_status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse> claimPeriodRewardDistributions(
        com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimPeriodRewardDistributionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimPeriodRewardDistributionsByID returns a claim period reward distribution matching the ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse> claimPeriodRewardDistributionsByID(
        com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimPeriodRewardDistributionsByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardDistributionsByAddress returns a list of reward claims belonging to the account and matching the claim
     * status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse> rewardDistributionsByAddress(
        com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardDistributionsByAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REWARD_PROGRAM_BY_ID = 0;
  private static final int METHODID_REWARD_PROGRAMS = 1;
  private static final int METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS = 2;
  private static final int METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS_BY_ID = 3;
  private static final int METHODID_REWARD_DISTRIBUTIONS_BY_ADDRESS = 4;

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
        case METHODID_REWARD_PROGRAM_BY_ID:
          serviceImpl.rewardProgramByID((com.provenance.reward.v1.QueryRewardProgramByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramByIDResponse>) responseObserver);
          break;
        case METHODID_REWARD_PROGRAMS:
          serviceImpl.rewardPrograms((com.provenance.reward.v1.QueryRewardProgramsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardProgramsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS:
          serviceImpl.claimPeriodRewardDistributions((com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS_BY_ID:
          serviceImpl.claimPeriodRewardDistributionsByID((com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse>) responseObserver);
          break;
        case METHODID_REWARD_DISTRIBUTIONS_BY_ADDRESS:
          serviceImpl.rewardDistributionsByAddress((com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse>) responseObserver);
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
          getRewardProgramByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.QueryRewardProgramByIDRequest,
              com.provenance.reward.v1.QueryRewardProgramByIDResponse>(
                service, METHODID_REWARD_PROGRAM_BY_ID)))
        .addMethod(
          getRewardProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.QueryRewardProgramsRequest,
              com.provenance.reward.v1.QueryRewardProgramsResponse>(
                service, METHODID_REWARD_PROGRAMS)))
        .addMethod(
          getClaimPeriodRewardDistributionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsRequest,
              com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsResponse>(
                service, METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS)))
        .addMethod(
          getClaimPeriodRewardDistributionsByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDRequest,
              com.provenance.reward.v1.QueryClaimPeriodRewardDistributionsByIDResponse>(
                service, METHODID_CLAIM_PERIOD_REWARD_DISTRIBUTIONS_BY_ID)))
        .addMethod(
          getRewardDistributionsByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.reward.v1.QueryRewardDistributionsByAddressRequest,
              com.provenance.reward.v1.QueryRewardDistributionsByAddressResponse>(
                service, METHODID_REWARD_DISTRIBUTIONS_BY_ADDRESS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.reward.v1.QueryProto.getDescriptor();
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
              .addMethod(getRewardProgramByIDMethod())
              .addMethod(getRewardProgramsMethod())
              .addMethod(getClaimPeriodRewardDistributionsMethod())
              .addMethod(getClaimPeriodRewardDistributionsByIDMethod())
              .addMethod(getRewardDistributionsByAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
