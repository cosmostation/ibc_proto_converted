package com.irismod.htlc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the HTLC Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: irismod/htlc/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "irismod.htlc.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgCreateHTLC,
      com.irismod.htlc.TxProto.MsgCreateHTLCResponse> getCreateHTLCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHTLC",
      requestType = com.irismod.htlc.TxProto.MsgCreateHTLC.class,
      responseType = com.irismod.htlc.TxProto.MsgCreateHTLCResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgCreateHTLC,
      com.irismod.htlc.TxProto.MsgCreateHTLCResponse> getCreateHTLCMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgCreateHTLC, com.irismod.htlc.TxProto.MsgCreateHTLCResponse> getCreateHTLCMethod;
    if ((getCreateHTLCMethod = MsgGrpc.getCreateHTLCMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateHTLCMethod = MsgGrpc.getCreateHTLCMethod) == null) {
          MsgGrpc.getCreateHTLCMethod = getCreateHTLCMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.TxProto.MsgCreateHTLC, com.irismod.htlc.TxProto.MsgCreateHTLCResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHTLC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.TxProto.MsgCreateHTLC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.TxProto.MsgCreateHTLCResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateHTLC"))
              .build();
        }
      }
    }
    return getCreateHTLCMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgClaimHTLC,
      com.irismod.htlc.TxProto.MsgClaimHTLCResponse> getClaimHTLCMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimHTLC",
      requestType = com.irismod.htlc.TxProto.MsgClaimHTLC.class,
      responseType = com.irismod.htlc.TxProto.MsgClaimHTLCResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgClaimHTLC,
      com.irismod.htlc.TxProto.MsgClaimHTLCResponse> getClaimHTLCMethod() {
    io.grpc.MethodDescriptor<com.irismod.htlc.TxProto.MsgClaimHTLC, com.irismod.htlc.TxProto.MsgClaimHTLCResponse> getClaimHTLCMethod;
    if ((getClaimHTLCMethod = MsgGrpc.getClaimHTLCMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimHTLCMethod = MsgGrpc.getClaimHTLCMethod) == null) {
          MsgGrpc.getClaimHTLCMethod = getClaimHTLCMethod =
              io.grpc.MethodDescriptor.<com.irismod.htlc.TxProto.MsgClaimHTLC, com.irismod.htlc.TxProto.MsgClaimHTLCResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimHTLC"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.TxProto.MsgClaimHTLC.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.irismod.htlc.TxProto.MsgClaimHTLCResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClaimHTLC"))
              .build();
        }
      }
    }
    return getClaimHTLCMethod;
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
   * Msg defines the HTLC Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateHTLC defines a method for creating a HTLC
     * </pre>
     */
    default void createHTLC(com.irismod.htlc.TxProto.MsgCreateHTLC request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgCreateHTLCResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHTLCMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimHTLC defines a method for claiming a HTLC
     * </pre>
     */
    default void claimHTLC(com.irismod.htlc.TxProto.MsgClaimHTLC request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgClaimHTLCResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimHTLCMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the HTLC Msg service
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
   * Msg defines the HTLC Msg service
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
     * CreateHTLC defines a method for creating a HTLC
     * </pre>
     */
    public void createHTLC(com.irismod.htlc.TxProto.MsgCreateHTLC request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgCreateHTLCResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHTLCMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimHTLC defines a method for claiming a HTLC
     * </pre>
     */
    public void claimHTLC(com.irismod.htlc.TxProto.MsgClaimHTLC request,
        io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgClaimHTLCResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimHTLCMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the HTLC Msg service
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
     * CreateHTLC defines a method for creating a HTLC
     * </pre>
     */
    public com.irismod.htlc.TxProto.MsgCreateHTLCResponse createHTLC(com.irismod.htlc.TxProto.MsgCreateHTLC request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHTLCMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimHTLC defines a method for claiming a HTLC
     * </pre>
     */
    public com.irismod.htlc.TxProto.MsgClaimHTLCResponse claimHTLC(com.irismod.htlc.TxProto.MsgClaimHTLC request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimHTLCMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the HTLC Msg service
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
     * CreateHTLC defines a method for creating a HTLC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.TxProto.MsgCreateHTLCResponse> createHTLC(
        com.irismod.htlc.TxProto.MsgCreateHTLC request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHTLCMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimHTLC defines a method for claiming a HTLC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.irismod.htlc.TxProto.MsgClaimHTLCResponse> claimHTLC(
        com.irismod.htlc.TxProto.MsgClaimHTLC request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimHTLCMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HTLC = 0;
  private static final int METHODID_CLAIM_HTLC = 1;

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
        case METHODID_CREATE_HTLC:
          serviceImpl.createHTLC((com.irismod.htlc.TxProto.MsgCreateHTLC) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgCreateHTLCResponse>) responseObserver);
          break;
        case METHODID_CLAIM_HTLC:
          serviceImpl.claimHTLC((com.irismod.htlc.TxProto.MsgClaimHTLC) request,
              (io.grpc.stub.StreamObserver<com.irismod.htlc.TxProto.MsgClaimHTLCResponse>) responseObserver);
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
          getCreateHTLCMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.TxProto.MsgCreateHTLC,
              com.irismod.htlc.TxProto.MsgCreateHTLCResponse>(
                service, METHODID_CREATE_HTLC)))
        .addMethod(
          getClaimHTLCMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.irismod.htlc.TxProto.MsgClaimHTLC,
              com.irismod.htlc.TxProto.MsgClaimHTLCResponse>(
                service, METHODID_CLAIM_HTLC)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.irismod.htlc.TxProto.getDescriptor();
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
              .addMethod(getCreateHTLCMethod())
              .addMethod(getClaimHTLCMethod())
              .build();
        }
      }
    }
    return result;
  }
}
