package com.akash.provider.v1beta2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the provider Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: akash/provider/v1beta2/provider.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "akash.provider.v1beta2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> getCreateProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProvider",
      requestType = com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider.class,
      responseType = com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> getCreateProviderMethod() {
    io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider, com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> getCreateProviderMethod;
    if ((getCreateProviderMethod = MsgGrpc.getCreateProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateProviderMethod = MsgGrpc.getCreateProviderMethod) == null) {
          MsgGrpc.getCreateProviderMethod = getCreateProviderMethod =
              io.grpc.MethodDescriptor.<com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider, com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateProvider"))
              .build();
        }
      }
    }
    return getCreateProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> getUpdateProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProvider",
      requestType = com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider.class,
      responseType = com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> getUpdateProviderMethod() {
    io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider, com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> getUpdateProviderMethod;
    if ((getUpdateProviderMethod = MsgGrpc.getUpdateProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateProviderMethod = MsgGrpc.getUpdateProviderMethod) == null) {
          MsgGrpc.getUpdateProviderMethod = getUpdateProviderMethod =
              io.grpc.MethodDescriptor.<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider, com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateProvider"))
              .build();
        }
      }
    }
    return getUpdateProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> getDeleteProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProvider",
      requestType = com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider.class,
      responseType = com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider,
      com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> getDeleteProviderMethod() {
    io.grpc.MethodDescriptor<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider, com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> getDeleteProviderMethod;
    if ((getDeleteProviderMethod = MsgGrpc.getDeleteProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteProviderMethod = MsgGrpc.getDeleteProviderMethod) == null) {
          MsgGrpc.getDeleteProviderMethod = getDeleteProviderMethod =
              io.grpc.MethodDescriptor.<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider, com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteProvider"))
              .build();
        }
      }
    }
    return getDeleteProviderMethod;
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
     * CreateProvider defines a method that creates a provider given the proper inputs
     * </pre>
     */
    default void createProvider(com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProvider defines a method that updates a provider given the proper inputs
     * </pre>
     */
    default void updateProvider(com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProviderMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteProvider defines a method that deletes a provider given the proper inputs
     * </pre>
     */
    default void deleteProvider(com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProviderMethod(), responseObserver);
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
     * CreateProvider defines a method that creates a provider given the proper inputs
     * </pre>
     */
    public void createProvider(com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProvider defines a method that updates a provider given the proper inputs
     * </pre>
     */
    public void updateProvider(com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteProvider defines a method that deletes a provider given the proper inputs
     * </pre>
     */
    public void deleteProvider(com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider request,
        io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request, responseObserver);
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
     * CreateProvider defines a method that creates a provider given the proper inputs
     * </pre>
     */
    public com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse createProvider(com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProvider defines a method that updates a provider given the proper inputs
     * </pre>
     */
    public com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse updateProvider(com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProviderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteProvider defines a method that deletes a provider given the proper inputs
     * </pre>
     */
    public com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse deleteProvider(com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProviderMethod(), getCallOptions(), request);
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
     * CreateProvider defines a method that creates a provider given the proper inputs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse> createProvider(
        com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProvider defines a method that updates a provider given the proper inputs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse> updateProvider(
        com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProviderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteProvider defines a method that deletes a provider given the proper inputs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse> deleteProvider(
        com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROVIDER = 0;
  private static final int METHODID_UPDATE_PROVIDER = 1;
  private static final int METHODID_DELETE_PROVIDER = 2;

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
        case METHODID_CREATE_PROVIDER:
          serviceImpl.createProvider((com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider) request,
              (io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROVIDER:
          serviceImpl.updateProvider((com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider) request,
              (io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROVIDER:
          serviceImpl.deleteProvider((com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider) request,
              (io.grpc.stub.StreamObserver<com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse>) responseObserver);
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
          getCreateProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.provider.v1beta2.ProviderProto.MsgCreateProvider,
              com.akash.provider.v1beta2.ProviderProto.MsgCreateProviderResponse>(
                service, METHODID_CREATE_PROVIDER)))
        .addMethod(
          getUpdateProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.provider.v1beta2.ProviderProto.MsgUpdateProvider,
              com.akash.provider.v1beta2.ProviderProto.MsgUpdateProviderResponse>(
                service, METHODID_UPDATE_PROVIDER)))
        .addMethod(
          getDeleteProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.provider.v1beta2.ProviderProto.MsgDeleteProvider,
              com.akash.provider.v1beta2.ProviderProto.MsgDeleteProviderResponse>(
                service, METHODID_DELETE_PROVIDER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.provider.v1beta2.ProviderProto.getDescriptor();
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
              .addMethod(getCreateProviderMethod())
              .addMethod(getUpdateProviderMethod())
              .addMethod(getDeleteProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
