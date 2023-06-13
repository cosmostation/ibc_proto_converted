package com.ixo.claims.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/claims/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ixo.claims.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgCreateCollection,
      com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> getCreateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCollection",
      requestType = com.ixo.claims.v1beta1.TxProto.MsgCreateCollection.class,
      responseType = com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgCreateCollection,
      com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> getCreateCollectionMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgCreateCollection, com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> getCreateCollectionMethod;
    if ((getCreateCollectionMethod = MsgGrpc.getCreateCollectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateCollectionMethod = MsgGrpc.getCreateCollectionMethod) == null) {
          MsgGrpc.getCreateCollectionMethod = getCreateCollectionMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.TxProto.MsgCreateCollection, com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgCreateCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateCollection"))
              .build();
        }
      }
    }
    return getCreateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim,
      com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> getSubmitClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitClaim",
      requestType = com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim.class,
      responseType = com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim,
      com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> getSubmitClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim, com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> getSubmitClaimMethod;
    if ((getSubmitClaimMethod = MsgGrpc.getSubmitClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitClaimMethod = MsgGrpc.getSubmitClaimMethod) == null) {
          MsgGrpc.getSubmitClaimMethod = getSubmitClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim, com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitClaim"))
              .build();
        }
      }
    }
    return getSubmitClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim,
      com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> getEvaluateClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EvaluateClaim",
      requestType = com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim.class,
      responseType = com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim,
      com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> getEvaluateClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim, com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> getEvaluateClaimMethod;
    if ((getEvaluateClaimMethod = MsgGrpc.getEvaluateClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEvaluateClaimMethod = MsgGrpc.getEvaluateClaimMethod) == null) {
          MsgGrpc.getEvaluateClaimMethod = getEvaluateClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim, com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EvaluateClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EvaluateClaim"))
              .build();
        }
      }
    }
    return getEvaluateClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim,
      com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> getDisputeClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisputeClaim",
      requestType = com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim.class,
      responseType = com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim,
      com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> getDisputeClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim, com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> getDisputeClaimMethod;
    if ((getDisputeClaimMethod = MsgGrpc.getDisputeClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisputeClaimMethod = MsgGrpc.getDisputeClaimMethod) == null) {
          MsgGrpc.getDisputeClaimMethod = getDisputeClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim, com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisputeClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisputeClaim"))
              .build();
        }
      }
    }
    return getDisputeClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment,
      com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> getWithdrawPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawPayment",
      requestType = com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment.class,
      responseType = com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment,
      com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> getWithdrawPaymentMethod() {
    io.grpc.MethodDescriptor<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment, com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> getWithdrawPaymentMethod;
    if ((getWithdrawPaymentMethod = MsgGrpc.getWithdrawPaymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawPaymentMethod = MsgGrpc.getWithdrawPaymentMethod) == null) {
          MsgGrpc.getWithdrawPaymentMethod = getWithdrawPaymentMethod =
              io.grpc.MethodDescriptor.<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment, com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawPayment"))
              .build();
        }
      }
    }
    return getWithdrawPaymentMethod;
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
     */
    default void createCollection(com.ixo.claims.v1beta1.TxProto.MsgCreateCollection request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCollectionMethod(), responseObserver);
    }

    /**
     */
    default void submitClaim(com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitClaimMethod(), responseObserver);
    }

    /**
     */
    default void evaluateClaim(com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEvaluateClaimMethod(), responseObserver);
    }

    /**
     */
    default void disputeClaim(com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisputeClaimMethod(), responseObserver);
    }

    /**
     */
    default void withdrawPayment(com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawPaymentMethod(), responseObserver);
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
     */
    public void createCollection(com.ixo.claims.v1beta1.TxProto.MsgCreateCollection request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitClaim(com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void evaluateClaim(com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEvaluateClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disputeClaim(com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisputeClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdrawPayment(com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment request,
        io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawPaymentMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse createCollection(com.ixo.claims.v1beta1.TxProto.MsgCreateCollection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse submitClaim(com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse evaluateClaim(com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEvaluateClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse disputeClaim(com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisputeClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse withdrawPayment(com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawPaymentMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse> createCollection(
        com.ixo.claims.v1beta1.TxProto.MsgCreateCollection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse> submitClaim(
        com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse> evaluateClaim(
        com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEvaluateClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse> disputeClaim(
        com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisputeClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse> withdrawPayment(
        com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COLLECTION = 0;
  private static final int METHODID_SUBMIT_CLAIM = 1;
  private static final int METHODID_EVALUATE_CLAIM = 2;
  private static final int METHODID_DISPUTE_CLAIM = 3;
  private static final int METHODID_WITHDRAW_PAYMENT = 4;

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
        case METHODID_CREATE_COLLECTION:
          serviceImpl.createCollection((com.ixo.claims.v1beta1.TxProto.MsgCreateCollection) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_CLAIM:
          serviceImpl.submitClaim((com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse>) responseObserver);
          break;
        case METHODID_EVALUATE_CLAIM:
          serviceImpl.evaluateClaim((com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse>) responseObserver);
          break;
        case METHODID_DISPUTE_CLAIM:
          serviceImpl.disputeClaim((com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_PAYMENT:
          serviceImpl.withdrawPayment((com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment) request,
              (io.grpc.stub.StreamObserver<com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse>) responseObserver);
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
          getCreateCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.TxProto.MsgCreateCollection,
              com.ixo.claims.v1beta1.TxProto.MsgCreateCollectionResponse>(
                service, METHODID_CREATE_COLLECTION)))
        .addMethod(
          getSubmitClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.TxProto.MsgSubmitClaim,
              com.ixo.claims.v1beta1.TxProto.MsgSubmitClaimResponse>(
                service, METHODID_SUBMIT_CLAIM)))
        .addMethod(
          getEvaluateClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaim,
              com.ixo.claims.v1beta1.TxProto.MsgEvaluateClaimResponse>(
                service, METHODID_EVALUATE_CLAIM)))
        .addMethod(
          getDisputeClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.TxProto.MsgDisputeClaim,
              com.ixo.claims.v1beta1.TxProto.MsgDisputeClaimResponse>(
                service, METHODID_DISPUTE_CLAIM)))
        .addMethod(
          getWithdrawPaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.claims.v1beta1.TxProto.MsgWithdrawPayment,
              com.ixo.claims.v1beta1.TxProto.MsgWithdrawPaymentResponse>(
                service, METHODID_WITHDRAW_PAYMENT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.claims.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateCollectionMethod())
              .addMethod(getSubmitClaimMethod())
              .addMethod(getEvaluateClaimMethod())
              .addMethod(getDisputeClaimMethod())
              .addMethod(getWithdrawPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
