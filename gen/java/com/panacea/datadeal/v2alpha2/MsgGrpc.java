package com.panacea.datadeal.v2alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: panacea/datadeal/v2alpha2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "panacea.datadeal.v2alpha2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal,
      com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> getCreateDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeal",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal,
      com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> getCreateDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal, com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> getCreateDealMethod;
    if ((getCreateDealMethod = MsgGrpc.getCreateDealMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDealMethod = MsgGrpc.getCreateDealMethod) == null) {
          MsgGrpc.getCreateDealMethod = getCreateDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal, com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDeal"))
              .build();
        }
      }
    }
    return getCreateDealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgSellData,
      com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> getSellDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SellData",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgSellData.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgSellData,
      com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> getSellDataMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgSellData, com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> getSellDataMethod;
    if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellDataMethod = MsgGrpc.getSellDataMethod) == null) {
          MsgGrpc.getSellDataMethod = getSellDataMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgSellData, com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SellData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgSellData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SellData"))
              .build();
        }
      }
    }
    return getSellDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification,
      com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> getVoteDataVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteDataVerification",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification,
      com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> getVoteDataVerificationMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification, com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> getVoteDataVerificationMethod;
    if ((getVoteDataVerificationMethod = MsgGrpc.getVoteDataVerificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteDataVerificationMethod = MsgGrpc.getVoteDataVerificationMethod) == null) {
          MsgGrpc.getVoteDataVerificationMethod = getVoteDataVerificationMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification, com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteDataVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteDataVerification"))
              .build();
        }
      }
    }
    return getVoteDataVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery,
      com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> getVoteDataDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteDataDelivery",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery,
      com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> getVoteDataDeliveryMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery, com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> getVoteDataDeliveryMethod;
    if ((getVoteDataDeliveryMethod = MsgGrpc.getVoteDataDeliveryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVoteDataDeliveryMethod = MsgGrpc.getVoteDataDeliveryMethod) == null) {
          MsgGrpc.getVoteDataDeliveryMethod = getVoteDataDeliveryMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery, com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteDataDelivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VoteDataDelivery"))
              .build();
        }
      }
    }
    return getVoteDataDeliveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal,
      com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateDeal",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal,
      com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal, com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> getDeactivateDealMethod;
    if ((getDeactivateDealMethod = MsgGrpc.getDeactivateDealMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateDealMethod = MsgGrpc.getDeactivateDealMethod) == null) {
          MsgGrpc.getDeactivateDealMethod = getDeactivateDealMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal, com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateDeal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateDeal"))
              .build();
        }
      }
    }
    return getDeactivateDealMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote,
      com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> getReRequestDataDeliveryVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReRequestDataDeliveryVote",
      requestType = com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote.class,
      responseType = com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote,
      com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> getReRequestDataDeliveryVoteMethod() {
    io.grpc.MethodDescriptor<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote, com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> getReRequestDataDeliveryVoteMethod;
    if ((getReRequestDataDeliveryVoteMethod = MsgGrpc.getReRequestDataDeliveryVoteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReRequestDataDeliveryVoteMethod = MsgGrpc.getReRequestDataDeliveryVoteMethod) == null) {
          MsgGrpc.getReRequestDataDeliveryVoteMethod = getReRequestDataDeliveryVoteMethod =
              io.grpc.MethodDescriptor.<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote, com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReRequestDataDeliveryVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReRequestDataDeliveryVote"))
              .build();
        }
      }
    }
    return getReRequestDataDeliveryVoteMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    default void createDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDealMethod(), responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    default void sellData(com.panacea.datadeal.v2alpha2.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteDataVerification defines a method for voting data verification.
     * </pre>
     */
    default void voteDataVerification(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteDataVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteDataDelivery defines a method for voting data delivery.
     * </pre>
     */
    default void voteDataDelivery(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteDataDeliveryMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating the deal.
     * </pre>
     */
    default void deactivateDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateDealMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
     * </pre>
     */
    default void reRequestDataDeliveryVote(com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReRequestDataDeliveryVoteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public void createDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public void sellData(com.panacea.datadeal.v2alpha2.TxProto.MsgSellData request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteDataVerification defines a method for voting data verification.
     * </pre>
     */
    public void voteDataVerification(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteDataVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteDataDelivery defines a method for voting data delivery.
     * </pre>
     */
    public void voteDataDelivery(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteDataDeliveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating the deal.
     * </pre>
     */
    public void deactivateDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateDealMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
     * </pre>
     */
    public void reRequestDataDeliveryVote(com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote request,
        io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReRequestDataDeliveryVoteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse createDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse sellData(com.panacea.datadeal.v2alpha2.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteDataVerification defines a method for voting data verification.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse voteDataVerification(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteDataVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteDataDelivery defines a method for voting data delivery.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse voteDataDelivery(com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteDataDeliveryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating the deal.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse deactivateDeal(com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateDealMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
     * </pre>
     */
    public com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse reRequestDataDeliveryVote(com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReRequestDataDeliveryVoteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     * CreateDeal defines a method for creating a deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse> createDeal(
        com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SellData defines a method for selling a data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse> sellData(
        com.panacea.datadeal.v2alpha2.TxProto.MsgSellData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteDataVerification defines a method for voting data verification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse> voteDataVerification(
        com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteDataVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteDataDelivery defines a method for voting data delivery.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse> voteDataDelivery(
        com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteDataDeliveryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeactivateDeal defines a method for deactivating the deal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse> deactivateDeal(
        com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateDealMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse> reRequestDataDeliveryVote(
        com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReRequestDataDeliveryVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEAL = 0;
  private static final int METHODID_SELL_DATA = 1;
  private static final int METHODID_VOTE_DATA_VERIFICATION = 2;
  private static final int METHODID_VOTE_DATA_DELIVERY = 3;
  private static final int METHODID_DEACTIVATE_DEAL = 4;
  private static final int METHODID_RE_REQUEST_DATA_DELIVERY_VOTE = 5;

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
        case METHODID_CREATE_DEAL:
          serviceImpl.createDeal((com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse>) responseObserver);
          break;
        case METHODID_SELL_DATA:
          serviceImpl.sellData((com.panacea.datadeal.v2alpha2.TxProto.MsgSellData) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse>) responseObserver);
          break;
        case METHODID_VOTE_DATA_VERIFICATION:
          serviceImpl.voteDataVerification((com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse>) responseObserver);
          break;
        case METHODID_VOTE_DATA_DELIVERY:
          serviceImpl.voteDataDelivery((com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_DEAL:
          serviceImpl.deactivateDeal((com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse>) responseObserver);
          break;
        case METHODID_RE_REQUEST_DATA_DELIVERY_VOTE:
          serviceImpl.reRequestDataDeliveryVote((com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote) request,
              (io.grpc.stub.StreamObserver<com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse>) responseObserver);
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
          getCreateDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDeal,
              com.panacea.datadeal.v2alpha2.TxProto.MsgCreateDealResponse>(
                service, METHODID_CREATE_DEAL)))
        .addMethod(
          getSellDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgSellData,
              com.panacea.datadeal.v2alpha2.TxProto.MsgSellDataResponse>(
                service, METHODID_SELL_DATA)))
        .addMethod(
          getVoteDataVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerification,
              com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataVerificationResponse>(
                service, METHODID_VOTE_DATA_VERIFICATION)))
        .addMethod(
          getVoteDataDeliveryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDelivery,
              com.panacea.datadeal.v2alpha2.TxProto.MsgVoteDataDeliveryResponse>(
                service, METHODID_VOTE_DATA_DELIVERY)))
        .addMethod(
          getDeactivateDealMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDeal,
              com.panacea.datadeal.v2alpha2.TxProto.MsgDeactivateDealResponse>(
                service, METHODID_DEACTIVATE_DEAL)))
        .addMethod(
          getReRequestDataDeliveryVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVote,
              com.panacea.datadeal.v2alpha2.TxProto.MsgReRequestDataDeliveryVoteResponse>(
                service, METHODID_RE_REQUEST_DATA_DELIVERY_VOTE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datadeal.v2alpha2.TxProto.getDescriptor();
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
              .addMethod(getCreateDealMethod())
              .addMethod(getSellDataMethod())
              .addMethod(getVoteDataVerificationMethod())
              .addMethod(getVoteDataDeliveryMethod())
              .addMethod(getDeactivateDealMethod())
              .addMethod(getReRequestDataDeliveryVoteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
