package com.shentu.cert.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the shield Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/cert/v1alpha1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "shentu.cert.v1alpha1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier,
      com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> getProposeCertifierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposeCertifier",
      requestType = com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier.class,
      responseType = com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier,
      com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> getProposeCertifierMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier, com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> getProposeCertifierMethod;
    if ((getProposeCertifierMethod = MsgGrpc.getProposeCertifierMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProposeCertifierMethod = MsgGrpc.getProposeCertifierMethod) == null) {
          MsgGrpc.getProposeCertifierMethod = getProposeCertifierMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier, com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposeCertifier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProposeCertifier"))
              .build();
        }
      }
    }
    return getProposeCertifierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate,
      com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> getIssueCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueCertificate",
      requestType = com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate.class,
      responseType = com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate,
      com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> getIssueCertificateMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate, com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> getIssueCertificateMethod;
    if ((getIssueCertificateMethod = MsgGrpc.getIssueCertificateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueCertificateMethod = MsgGrpc.getIssueCertificateMethod) == null) {
          MsgGrpc.getIssueCertificateMethod = getIssueCertificateMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate, com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueCertificate"))
              .build();
        }
      }
    }
    return getIssueCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate,
      com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> getRevokeCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeCertificate",
      requestType = com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate.class,
      responseType = com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate,
      com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> getRevokeCertificateMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate, com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> getRevokeCertificateMethod;
    if ((getRevokeCertificateMethod = MsgGrpc.getRevokeCertificateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeCertificateMethod = MsgGrpc.getRevokeCertificateMethod) == null) {
          MsgGrpc.getRevokeCertificateMethod = getRevokeCertificateMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate, com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeCertificate"))
              .build();
        }
      }
    }
    return getRevokeCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform,
      com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> getCertifyPlatformMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CertifyPlatform",
      requestType = com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform.class,
      responseType = com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform,
      com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> getCertifyPlatformMethod() {
    io.grpc.MethodDescriptor<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform, com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> getCertifyPlatformMethod;
    if ((getCertifyPlatformMethod = MsgGrpc.getCertifyPlatformMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCertifyPlatformMethod = MsgGrpc.getCertifyPlatformMethod) == null) {
          MsgGrpc.getCertifyPlatformMethod = getCertifyPlatformMethod =
              io.grpc.MethodDescriptor.<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform, com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CertifyPlatform"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CertifyPlatform"))
              .build();
        }
      }
    }
    return getCertifyPlatformMethod;
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
   * Msg defines the shield Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void proposeCertifier(com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposeCertifierMethod(), responseObserver);
    }

    /**
     */
    default void issueCertificate(com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueCertificateMethod(), responseObserver);
    }

    /**
     */
    default void revokeCertificate(com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeCertificateMethod(), responseObserver);
    }

    /**
     */
    default void certifyPlatform(com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCertifyPlatformMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
   * Msg defines the shield Msg service.
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
    public void proposeCertifier(com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposeCertifierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void issueCertificate(com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeCertificate(com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void certifyPlatform(com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform request,
        io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCertifyPlatformMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse proposeCertifier(com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposeCertifierMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse issueCertificate(com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse revokeCertificate(com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse certifyPlatform(com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCertifyPlatformMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the shield Msg service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse> proposeCertifier(
        com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposeCertifierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse> issueCertificate(
        com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse> revokeCertificate(
        com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse> certifyPlatform(
        com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCertifyPlatformMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROPOSE_CERTIFIER = 0;
  private static final int METHODID_ISSUE_CERTIFICATE = 1;
  private static final int METHODID_REVOKE_CERTIFICATE = 2;
  private static final int METHODID_CERTIFY_PLATFORM = 3;

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
        case METHODID_PROPOSE_CERTIFIER:
          serviceImpl.proposeCertifier((com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse>) responseObserver);
          break;
        case METHODID_ISSUE_CERTIFICATE:
          serviceImpl.issueCertificate((com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse>) responseObserver);
          break;
        case METHODID_REVOKE_CERTIFICATE:
          serviceImpl.revokeCertificate((com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse>) responseObserver);
          break;
        case METHODID_CERTIFY_PLATFORM:
          serviceImpl.certifyPlatform((com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform) request,
              (io.grpc.stub.StreamObserver<com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse>) responseObserver);
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
          getProposeCertifierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifier,
              com.shentu.cert.v1alpha1.TxProto.MsgProposeCertifierResponse>(
                service, METHODID_PROPOSE_CERTIFIER)))
        .addMethod(
          getIssueCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificate,
              com.shentu.cert.v1alpha1.TxProto.MsgIssueCertificateResponse>(
                service, METHODID_ISSUE_CERTIFICATE)))
        .addMethod(
          getRevokeCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificate,
              com.shentu.cert.v1alpha1.TxProto.MsgRevokeCertificateResponse>(
                service, METHODID_REVOKE_CERTIFICATE)))
        .addMethod(
          getCertifyPlatformMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatform,
              com.shentu.cert.v1alpha1.TxProto.MsgCertifyPlatformResponse>(
                service, METHODID_CERTIFY_PLATFORM)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.cert.v1alpha1.TxProto.getDescriptor();
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
              .addMethod(getProposeCertifierMethod())
              .addMethod(getIssueCertificateMethod())
              .addMethod(getRevokeCertificateMethod())
              .addMethod(getCertifyPlatformMethod())
              .build();
        }
      }
    }
    return result;
  }
}
