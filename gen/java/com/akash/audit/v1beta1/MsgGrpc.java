package com.akash.audit.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the provider Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/audit/v1beta1/audit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "akash.audit.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes,
      com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> getSignProviderAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignProviderAttributes",
      requestType = com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes.class,
      responseType = com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes,
      com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> getSignProviderAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes, com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> getSignProviderAttributesMethod;
    if ((getSignProviderAttributesMethod = MsgGrpc.getSignProviderAttributesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSignProviderAttributesMethod = MsgGrpc.getSignProviderAttributesMethod) == null) {
          MsgGrpc.getSignProviderAttributesMethod = getSignProviderAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes, com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignProviderAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SignProviderAttributes"))
              .build();
        }
      }
    }
    return getSignProviderAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes,
      com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> getDeleteProviderAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProviderAttributes",
      requestType = com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes.class,
      responseType = com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes,
      com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> getDeleteProviderAttributesMethod() {
    io.grpc.MethodDescriptor<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes, com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> getDeleteProviderAttributesMethod;
    if ((getDeleteProviderAttributesMethod = MsgGrpc.getDeleteProviderAttributesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteProviderAttributesMethod = MsgGrpc.getDeleteProviderAttributesMethod) == null) {
          MsgGrpc.getDeleteProviderAttributesMethod = getDeleteProviderAttributesMethod =
              io.grpc.MethodDescriptor.<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes, com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProviderAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteProviderAttributes"))
              .build();
        }
      }
    }
    return getDeleteProviderAttributesMethod;
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
   * Msg defines the provider Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * SignProviderAttributes defines a method that signs provider attributes
     * </pre>
     */
    default void signProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignProviderAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteProviderAttributes defines a method that deletes provider attributes
     * </pre>
     */
    default void deleteProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProviderAttributesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the provider Msg service
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
   * Msg defines the provider Msg service
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
     * SignProviderAttributes defines a method that signs provider attributes
     * </pre>
     */
    public void signProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignProviderAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteProviderAttributes defines a method that deletes provider attributes
     * </pre>
     */
    public void deleteProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes request,
        io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProviderAttributesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the provider Msg service
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
     * SignProviderAttributes defines a method that signs provider attributes
     * </pre>
     */
    public com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse signProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignProviderAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteProviderAttributes defines a method that deletes provider attributes
     * </pre>
     */
    public com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse deleteProviderAttributes(com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProviderAttributesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the provider Msg service
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
     * SignProviderAttributes defines a method that signs provider attributes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse> signProviderAttributes(
        com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignProviderAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteProviderAttributes defines a method that deletes provider attributes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse> deleteProviderAttributes(
        com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProviderAttributesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_PROVIDER_ATTRIBUTES = 0;
  private static final int METHODID_DELETE_PROVIDER_ATTRIBUTES = 1;

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
        case METHODID_SIGN_PROVIDER_ATTRIBUTES:
          serviceImpl.signProviderAttributes((com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROVIDER_ATTRIBUTES:
          serviceImpl.deleteProviderAttributes((com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes) request,
              (io.grpc.stub.StreamObserver<com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse>) responseObserver);
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
          getSignProviderAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributes,
              com.akash.audit.v1beta1.AuditProto.MsgSignProviderAttributesResponse>(
                service, METHODID_SIGN_PROVIDER_ATTRIBUTES)))
        .addMethod(
          getDeleteProviderAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributes,
              com.akash.audit.v1beta1.AuditProto.MsgDeleteProviderAttributesResponse>(
                service, METHODID_DELETE_PROVIDER_ATTRIBUTES)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.audit.v1beta1.AuditProto.getDescriptor();
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
              .addMethod(getSignProviderAttributesMethod())
              .addMethod(getDeleteProviderAttributesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
