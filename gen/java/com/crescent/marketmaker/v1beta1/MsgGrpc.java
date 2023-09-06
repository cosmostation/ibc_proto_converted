package com.crescent.marketmaker.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the marketmaker Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/marketmaker/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.marketmaker.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker,
      com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> getApplyMarketMakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyMarketMaker",
      requestType = com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker.class,
      responseType = com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker,
      com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> getApplyMarketMakerMethod() {
    io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker, com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> getApplyMarketMakerMethod;
    if ((getApplyMarketMakerMethod = MsgGrpc.getApplyMarketMakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getApplyMarketMakerMethod = MsgGrpc.getApplyMarketMakerMethod) == null) {
          MsgGrpc.getApplyMarketMakerMethod = getApplyMarketMakerMethod =
              io.grpc.MethodDescriptor.<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker, com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyMarketMaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ApplyMarketMaker"))
              .build();
        }
      }
    }
    return getApplyMarketMakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives,
      com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> getClaimIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimIncentives",
      requestType = com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives.class,
      responseType = com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives,
      com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> getClaimIncentivesMethod() {
    io.grpc.MethodDescriptor<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives, com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> getClaimIncentivesMethod;
    if ((getClaimIncentivesMethod = MsgGrpc.getClaimIncentivesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimIncentivesMethod = MsgGrpc.getClaimIncentivesMethod) == null) {
          MsgGrpc.getClaimIncentivesMethod = getClaimIncentivesMethod =
              io.grpc.MethodDescriptor.<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives, com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimIncentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimIncentives"))
              .build();
        }
      }
    }
    return getClaimIncentivesMethod;
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
   * Msg defines the marketmaker Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void applyMarketMaker(com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyMarketMakerMethod(), responseObserver);
    }

    /**
     */
    default void claimIncentives(com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimIncentivesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the marketmaker Msg service.
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
   * Msg defines the marketmaker Msg service.
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
    public void applyMarketMaker(com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyMarketMakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimIncentives(com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives request,
        io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimIncentivesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the marketmaker Msg service.
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
    public com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse applyMarketMaker(com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyMarketMakerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse claimIncentives(com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimIncentivesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the marketmaker Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse> applyMarketMaker(
        com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyMarketMakerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse> claimIncentives(
        com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimIncentivesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY_MARKET_MAKER = 0;
  private static final int METHODID_CLAIM_INCENTIVES = 1;

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
        case METHODID_APPLY_MARKET_MAKER:
          serviceImpl.applyMarketMaker((com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker) request,
              (io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse>) responseObserver);
          break;
        case METHODID_CLAIM_INCENTIVES:
          serviceImpl.claimIncentives((com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives) request,
              (io.grpc.stub.StreamObserver<com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse>) responseObserver);
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
          getApplyMarketMakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMaker,
              com.crescent.marketmaker.v1beta1.TxProto.MsgApplyMarketMakerResponse>(
                service, METHODID_APPLY_MARKET_MAKER)))
        .addMethod(
          getClaimIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentives,
              com.crescent.marketmaker.v1beta1.TxProto.MsgClaimIncentivesResponse>(
                service, METHODID_CLAIM_INCENTIVES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.marketmaker.v1beta1.TxProto.getDescriptor();
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getApplyMarketMakerMethod())
              .addMethod(getClaimIncentivesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
