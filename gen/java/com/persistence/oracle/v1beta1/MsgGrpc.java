package com.persistence.oracle.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: persistence/oracle/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "persistence.oracle.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote,
      com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> getAggregateExchangeRatePrevoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateExchangeRatePrevote",
      requestType = com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote.class,
      responseType = com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote,
      com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> getAggregateExchangeRatePrevoteMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote, com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> getAggregateExchangeRatePrevoteMethod;
    if ((getAggregateExchangeRatePrevoteMethod = MsgGrpc.getAggregateExchangeRatePrevoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAggregateExchangeRatePrevoteMethod = MsgGrpc.getAggregateExchangeRatePrevoteMethod) == null) {
          MsgGrpc.getAggregateExchangeRatePrevoteMethod = getAggregateExchangeRatePrevoteMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote, com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateExchangeRatePrevote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AggregateExchangeRatePrevote"))
              .build();
        }
      }
    }
    return getAggregateExchangeRatePrevoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote,
      com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AggregateExchangeRateVote",
      requestType = com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote.class,
      responseType = com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote,
      com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote, com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> getAggregateExchangeRateVoteMethod;
    if ((getAggregateExchangeRateVoteMethod = MsgGrpc.getAggregateExchangeRateVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAggregateExchangeRateVoteMethod = MsgGrpc.getAggregateExchangeRateVoteMethod) == null) {
          MsgGrpc.getAggregateExchangeRateVoteMethod = getAggregateExchangeRateVoteMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote, com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AggregateExchangeRateVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AggregateExchangeRateVote"))
              .build();
        }
      }
    }
    return getAggregateExchangeRateVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgDelegateFeedConsent,
      com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegateFeedConsent",
      requestType = com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.class,
      responseType = com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgDelegateFeedConsent,
      com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgDelegateFeedConsent, com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> getDelegateFeedConsentMethod;
    if ((getDelegateFeedConsentMethod = MsgGrpc.getDelegateFeedConsentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelegateFeedConsentMethod = MsgGrpc.getDelegateFeedConsentMethod) == null) {
          MsgGrpc.getDelegateFeedConsentMethod = getDelegateFeedConsentMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.MsgDelegateFeedConsent, com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegateFeedConsent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgDelegateFeedConsent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DelegateFeedConsent"))
              .build();
        }
      }
    }
    return getDelegateFeedConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool,
      com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> getAddFundsToRewardPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddFundsToRewardPool",
      requestType = com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool.class,
      responseType = com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool,
      com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> getAddFundsToRewardPoolMethod() {
    io.grpc.MethodDescriptor<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool, com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> getAddFundsToRewardPoolMethod;
    if ((getAddFundsToRewardPoolMethod = MsgGrpc.getAddFundsToRewardPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddFundsToRewardPoolMethod = MsgGrpc.getAddFundsToRewardPoolMethod) == null) {
          MsgGrpc.getAddFundsToRewardPoolMethod = getAddFundsToRewardPoolMethod =
              io.grpc.MethodDescriptor.<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool, com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddFundsToRewardPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddFundsToRewardPool"))
              .build();
        }
      }
    }
    return getAddFundsToRewardPoolMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AggregateExchangeRatePrevote defines a method for submitting an aggregate
     * exchange rate prevote.
     * </pre>
     */
    default void aggregateExchangeRatePrevote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateExchangeRatePrevoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * AggregateExchangeRateVote defines a method for submitting an aggregate
     * exchange rate vote.
     * </pre>
     */
    default void aggregateExchangeRateVote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAggregateExchangeRateVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation.
     * </pre>
     */
    default void delegateFeedConsent(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegateFeedConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddFundsToRewardPool
     * </pre>
     */
    default void addFundsToRewardPool(com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddFundsToRewardPoolMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * AggregateExchangeRatePrevote defines a method for submitting an aggregate
     * exchange rate prevote.
     * </pre>
     */
    public void aggregateExchangeRatePrevote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateExchangeRatePrevoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AggregateExchangeRateVote defines a method for submitting an aggregate
     * exchange rate vote.
     * </pre>
     */
    public void aggregateExchangeRateVote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAggregateExchangeRateVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation.
     * </pre>
     */
    public void delegateFeedConsent(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegateFeedConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddFundsToRewardPool
     * </pre>
     */
    public void addFundsToRewardPool(com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool request,
        io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddFundsToRewardPoolMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * AggregateExchangeRatePrevote defines a method for submitting an aggregate
     * exchange rate prevote.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse aggregateExchangeRatePrevote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateExchangeRatePrevoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AggregateExchangeRateVote defines a method for submitting an aggregate
     * exchange rate vote.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse aggregateExchangeRateVote(com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAggregateExchangeRateVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation.
     * </pre>
     */
    public com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse delegateFeedConsent(com.persistence.oracle.v1beta1.MsgDelegateFeedConsent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegateFeedConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddFundsToRewardPool
     * </pre>
     */
    public com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse addFundsToRewardPool(com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddFundsToRewardPoolMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * AggregateExchangeRatePrevote defines a method for submitting an aggregate
     * exchange rate prevote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse> aggregateExchangeRatePrevote(
        com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateExchangeRatePrevoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AggregateExchangeRateVote defines a method for submitting an aggregate
     * exchange rate vote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse> aggregateExchangeRateVote(
        com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAggregateExchangeRateVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegateFeedConsent defines a method for setting the feeder delegation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse> delegateFeedConsent(
        com.persistence.oracle.v1beta1.MsgDelegateFeedConsent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegateFeedConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddFundsToRewardPool
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse> addFundsToRewardPool(
        com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddFundsToRewardPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AGGREGATE_EXCHANGE_RATE_PREVOTE = 0;
  private static final int METHODID_AGGREGATE_EXCHANGE_RATE_VOTE = 1;
  private static final int METHODID_DELEGATE_FEED_CONSENT = 2;
  private static final int METHODID_ADD_FUNDS_TO_REWARD_POOL = 3;

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
        case METHODID_AGGREGATE_EXCHANGE_RATE_PREVOTE:
          serviceImpl.aggregateExchangeRatePrevote((com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_EXCHANGE_RATE_VOTE:
          serviceImpl.aggregateExchangeRateVote((com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse>) responseObserver);
          break;
        case METHODID_DELEGATE_FEED_CONSENT:
          serviceImpl.delegateFeedConsent((com.persistence.oracle.v1beta1.MsgDelegateFeedConsent) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse>) responseObserver);
          break;
        case METHODID_ADD_FUNDS_TO_REWARD_POOL:
          serviceImpl.addFundsToRewardPool((com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool) request,
              (io.grpc.stub.StreamObserver<com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse>) responseObserver);
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
          getAggregateExchangeRatePrevoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote,
              com.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse>(
                service, METHODID_AGGREGATE_EXCHANGE_RATE_PREVOTE)))
        .addMethod(
          getAggregateExchangeRateVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote,
              com.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse>(
                service, METHODID_AGGREGATE_EXCHANGE_RATE_VOTE)))
        .addMethod(
          getDelegateFeedConsentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.MsgDelegateFeedConsent,
              com.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse>(
                service, METHODID_DELEGATE_FEED_CONSENT)))
        .addMethod(
          getAddFundsToRewardPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.persistence.oracle.v1beta1.MsgAddFundsToRewardPool,
              com.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse>(
                service, METHODID_ADD_FUNDS_TO_REWARD_POOL)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.persistence.oracle.v1beta1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getAggregateExchangeRatePrevoteMethod())
              .addMethod(getAggregateExchangeRateVoteMethod())
              .addMethod(getDelegateFeedConsentMethod())
              .addMethod(getAddFundsToRewardPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
