package com.regen.data.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg is the regen.data.v1alpha1 Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/data/v1alpha2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "regen.data.v1alpha2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgAnchorData,
      com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> getAnchorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnchorData",
      requestType = com.regen.data.v1alpha2.TxProto.MsgAnchorData.class,
      responseType = com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgAnchorData,
      com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> getAnchorDataMethod() {
    io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgAnchorData, com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> getAnchorDataMethod;
    if ((getAnchorDataMethod = MsgGrpc.getAnchorDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAnchorDataMethod = MsgGrpc.getAnchorDataMethod) == null) {
          MsgGrpc.getAnchorDataMethod = getAnchorDataMethod =
              io.grpc.MethodDescriptor.<com.regen.data.v1alpha2.TxProto.MsgAnchorData, com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnchorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.TxProto.MsgAnchorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AnchorData"))
              .build();
        }
      }
    }
    return getAnchorDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgSignData,
      com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> getSignDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignData",
      requestType = com.regen.data.v1alpha2.TxProto.MsgSignData.class,
      responseType = com.regen.data.v1alpha2.TxProto.MsgSignDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgSignData,
      com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> getSignDataMethod() {
    io.grpc.MethodDescriptor<com.regen.data.v1alpha2.TxProto.MsgSignData, com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> getSignDataMethod;
    if ((getSignDataMethod = MsgGrpc.getSignDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSignDataMethod = MsgGrpc.getSignDataMethod) == null) {
          MsgGrpc.getSignDataMethod = getSignDataMethod =
              io.grpc.MethodDescriptor.<com.regen.data.v1alpha2.TxProto.MsgSignData, com.regen.data.v1alpha2.TxProto.MsgSignDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.TxProto.MsgSignData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.data.v1alpha2.TxProto.MsgSignDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SignData"))
              .build();
        }
      }
    }
    return getSignDataMethod;
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
   * Msg is the regen.data.v1alpha1 Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AnchorData "anchors" a piece of data to the blockchain based on its secure
     * hash, effectively providing a tamper resistant timestamp.
     * The sender in AnchorData is not attesting to the veracity of the underlying
     * data. They can simply be a intermediary providing timestamp services.
     * SignData should be used to create a digital signature attesting to the
     * veracity of some piece of data.
     * </pre>
     */
    default void anchorData(com.regen.data.v1alpha2.TxProto.MsgAnchorData request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnchorDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * SignData allows for signing of an arbitrary piece of data on the
     * blockchain. By "signing" data the signers are making a statement about the
     * veracity of the data itself. It is like signing a legal document, meaning
     * that I agree to all conditions and to the best of my knowledge everything
     * is true. When anchoring data, the sender is not attesting to the veracity
     * of the data, they are simply communicating that it exists.
     * On-chain signatures have the following benefits:
     * - on-chain identities can be managed using different cryptographic keys
     *   that change over time through key rotation practices
     * - an on-chain identity may represent an organization and through delegation
     *   individual members may sign on behalf of the group
     * - the blockchain transaction envelope provides built-in replay protection
     *   and timestamping
     * SignData implicitly calls AnchorData if the data was not already anchored.
     * SignData can be called multiple times for the same content hash with different
     * signers and those signers will be appended to the list of signers.
     * </pre>
     */
    default void signData(com.regen.data.v1alpha2.TxProto.MsgSignData request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg is the regen.data.v1alpha1 Msg service
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
   * Msg is the regen.data.v1alpha1 Msg service
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
     * AnchorData "anchors" a piece of data to the blockchain based on its secure
     * hash, effectively providing a tamper resistant timestamp.
     * The sender in AnchorData is not attesting to the veracity of the underlying
     * data. They can simply be a intermediary providing timestamp services.
     * SignData should be used to create a digital signature attesting to the
     * veracity of some piece of data.
     * </pre>
     */
    public void anchorData(com.regen.data.v1alpha2.TxProto.MsgAnchorData request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnchorDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SignData allows for signing of an arbitrary piece of data on the
     * blockchain. By "signing" data the signers are making a statement about the
     * veracity of the data itself. It is like signing a legal document, meaning
     * that I agree to all conditions and to the best of my knowledge everything
     * is true. When anchoring data, the sender is not attesting to the veracity
     * of the data, they are simply communicating that it exists.
     * On-chain signatures have the following benefits:
     * - on-chain identities can be managed using different cryptographic keys
     *   that change over time through key rotation practices
     * - an on-chain identity may represent an organization and through delegation
     *   individual members may sign on behalf of the group
     * - the blockchain transaction envelope provides built-in replay protection
     *   and timestamping
     * SignData implicitly calls AnchorData if the data was not already anchored.
     * SignData can be called multiple times for the same content hash with different
     * signers and those signers will be appended to the list of signers.
     * </pre>
     */
    public void signData(com.regen.data.v1alpha2.TxProto.MsgSignData request,
        io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg is the regen.data.v1alpha1 Msg service
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
     * AnchorData "anchors" a piece of data to the blockchain based on its secure
     * hash, effectively providing a tamper resistant timestamp.
     * The sender in AnchorData is not attesting to the veracity of the underlying
     * data. They can simply be a intermediary providing timestamp services.
     * SignData should be used to create a digital signature attesting to the
     * veracity of some piece of data.
     * </pre>
     */
    public com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse anchorData(com.regen.data.v1alpha2.TxProto.MsgAnchorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnchorDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SignData allows for signing of an arbitrary piece of data on the
     * blockchain. By "signing" data the signers are making a statement about the
     * veracity of the data itself. It is like signing a legal document, meaning
     * that I agree to all conditions and to the best of my knowledge everything
     * is true. When anchoring data, the sender is not attesting to the veracity
     * of the data, they are simply communicating that it exists.
     * On-chain signatures have the following benefits:
     * - on-chain identities can be managed using different cryptographic keys
     *   that change over time through key rotation practices
     * - an on-chain identity may represent an organization and through delegation
     *   individual members may sign on behalf of the group
     * - the blockchain transaction envelope provides built-in replay protection
     *   and timestamping
     * SignData implicitly calls AnchorData if the data was not already anchored.
     * SignData can be called multiple times for the same content hash with different
     * signers and those signers will be appended to the list of signers.
     * </pre>
     */
    public com.regen.data.v1alpha2.TxProto.MsgSignDataResponse signData(com.regen.data.v1alpha2.TxProto.MsgSignData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg is the regen.data.v1alpha1 Msg service
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
     * AnchorData "anchors" a piece of data to the blockchain based on its secure
     * hash, effectively providing a tamper resistant timestamp.
     * The sender in AnchorData is not attesting to the veracity of the underlying
     * data. They can simply be a intermediary providing timestamp services.
     * SignData should be used to create a digital signature attesting to the
     * veracity of some piece of data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse> anchorData(
        com.regen.data.v1alpha2.TxProto.MsgAnchorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnchorDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SignData allows for signing of an arbitrary piece of data on the
     * blockchain. By "signing" data the signers are making a statement about the
     * veracity of the data itself. It is like signing a legal document, meaning
     * that I agree to all conditions and to the best of my knowledge everything
     * is true. When anchoring data, the sender is not attesting to the veracity
     * of the data, they are simply communicating that it exists.
     * On-chain signatures have the following benefits:
     * - on-chain identities can be managed using different cryptographic keys
     *   that change over time through key rotation practices
     * - an on-chain identity may represent an organization and through delegation
     *   individual members may sign on behalf of the group
     * - the blockchain transaction envelope provides built-in replay protection
     *   and timestamping
     * SignData implicitly calls AnchorData if the data was not already anchored.
     * SignData can be called multiple times for the same content hash with different
     * signers and those signers will be appended to the list of signers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.data.v1alpha2.TxProto.MsgSignDataResponse> signData(
        com.regen.data.v1alpha2.TxProto.MsgSignData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANCHOR_DATA = 0;
  private static final int METHODID_SIGN_DATA = 1;

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
        case METHODID_ANCHOR_DATA:
          serviceImpl.anchorData((com.regen.data.v1alpha2.TxProto.MsgAnchorData) request,
              (io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse>) responseObserver);
          break;
        case METHODID_SIGN_DATA:
          serviceImpl.signData((com.regen.data.v1alpha2.TxProto.MsgSignData) request,
              (io.grpc.stub.StreamObserver<com.regen.data.v1alpha2.TxProto.MsgSignDataResponse>) responseObserver);
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
          getAnchorDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.data.v1alpha2.TxProto.MsgAnchorData,
              com.regen.data.v1alpha2.TxProto.MsgAnchorDataResponse>(
                service, METHODID_ANCHOR_DATA)))
        .addMethod(
          getSignDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.data.v1alpha2.TxProto.MsgSignData,
              com.regen.data.v1alpha2.TxProto.MsgSignDataResponse>(
                service, METHODID_SIGN_DATA)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.data.v1alpha2.TxProto.getDescriptor();
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
              .addMethod(getAnchorDataMethod())
              .addMethod(getSignDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
