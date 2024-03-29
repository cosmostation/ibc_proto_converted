package com.publicawesome.stargaze.claim.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stargaze/claim/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "publicawesome.stargaze.claim.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim,
      com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> getInitialClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitialClaim",
      requestType = com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim.class,
      responseType = com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim,
      com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> getInitialClaimMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim, com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> getInitialClaimMethod;
    if ((getInitialClaimMethod = MsgGrpc.getInitialClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInitialClaimMethod = MsgGrpc.getInitialClaimMethod) == null) {
          MsgGrpc.getInitialClaimMethod = getInitialClaimMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim, com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitialClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InitialClaim"))
              .build();
        }
      }
    }
    return getInitialClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor,
      com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> getClaimForMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimFor",
      requestType = com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor.class,
      responseType = com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor,
      com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> getClaimForMethod() {
    io.grpc.MethodDescriptor<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor, com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> getClaimForMethod;
    if ((getClaimForMethod = MsgGrpc.getClaimForMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimForMethod = MsgGrpc.getClaimForMethod) == null) {
          MsgGrpc.getClaimForMethod = getClaimForMethod =
              io.grpc.MethodDescriptor.<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor, com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimFor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimFor"))
              .build();
        }
      }
    }
    return getClaimForMethod;
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
    default void initialClaim(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitialClaimMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void claimFor(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimForMethod(), responseObserver);
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
    public void initialClaim(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitialClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void claimFor(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor request,
        io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimForMethod(), getCallOptions()), request, responseObserver);
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
    public com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse initialClaim(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitialClaimMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse claimFor(com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimForMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse> initialClaim(
        com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitialClaimMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse> claimFor(
        com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimForMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_CLAIM = 0;
  private static final int METHODID_CLAIM_FOR = 1;

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
        case METHODID_INITIAL_CLAIM:
          serviceImpl.initialClaim((com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse>) responseObserver);
          break;
        case METHODID_CLAIM_FOR:
          serviceImpl.claimFor((com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor) request,
              (io.grpc.stub.StreamObserver<com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse>) responseObserver);
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
          getInitialClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaim,
              com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgInitialClaimResponse>(
                service, METHODID_INITIAL_CLAIM)))
        .addMethod(
          getClaimForMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimFor,
              com.publicawesome.stargaze.claim.v1beta1.TxProto.MsgClaimForResponse>(
                service, METHODID_CLAIM_FOR)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.publicawesome.stargaze.claim.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getInitialClaimMethod())
              .addMethod(getClaimForMethod())
              .build();
        }
      }
    }
    return result;
  }
}
