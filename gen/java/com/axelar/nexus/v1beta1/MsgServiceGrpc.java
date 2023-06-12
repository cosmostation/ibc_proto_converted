package com.axelar.nexus.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the nexus Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/nexus/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgServiceGrpc {

  private MsgServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.nexus.v1beta1.MsgService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest,
      com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> getRegisterChainMaintainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterChainMaintainer",
      requestType = com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest.class,
      responseType = com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest,
      com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> getRegisterChainMaintainerMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest, com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> getRegisterChainMaintainerMethod;
    if ((getRegisterChainMaintainerMethod = MsgServiceGrpc.getRegisterChainMaintainerMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRegisterChainMaintainerMethod = MsgServiceGrpc.getRegisterChainMaintainerMethod) == null) {
          MsgServiceGrpc.getRegisterChainMaintainerMethod = getRegisterChainMaintainerMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest, com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterChainMaintainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RegisterChainMaintainer"))
              .build();
        }
      }
    }
    return getRegisterChainMaintainerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest,
      com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> getDeregisterChainMaintainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeregisterChainMaintainer",
      requestType = com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest.class,
      responseType = com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest,
      com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> getDeregisterChainMaintainerMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest, com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> getDeregisterChainMaintainerMethod;
    if ((getDeregisterChainMaintainerMethod = MsgServiceGrpc.getDeregisterChainMaintainerMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getDeregisterChainMaintainerMethod = MsgServiceGrpc.getDeregisterChainMaintainerMethod) == null) {
          MsgServiceGrpc.getDeregisterChainMaintainerMethod = getDeregisterChainMaintainerMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest, com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeregisterChainMaintainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("DeregisterChainMaintainer"))
              .build();
        }
      }
    }
    return getDeregisterChainMaintainerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.ActivateChainRequest,
      com.axelar.nexus.v1beta1.ActivateChainResponse> getActivateChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateChain",
      requestType = com.axelar.nexus.v1beta1.ActivateChainRequest.class,
      responseType = com.axelar.nexus.v1beta1.ActivateChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.ActivateChainRequest,
      com.axelar.nexus.v1beta1.ActivateChainResponse> getActivateChainMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.ActivateChainRequest, com.axelar.nexus.v1beta1.ActivateChainResponse> getActivateChainMethod;
    if ((getActivateChainMethod = MsgServiceGrpc.getActivateChainMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getActivateChainMethod = MsgServiceGrpc.getActivateChainMethod) == null) {
          MsgServiceGrpc.getActivateChainMethod = getActivateChainMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.ActivateChainRequest, com.axelar.nexus.v1beta1.ActivateChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.ActivateChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.ActivateChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("ActivateChain"))
              .build();
        }
      }
    }
    return getActivateChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeactivateChainRequest,
      com.axelar.nexus.v1beta1.DeactivateChainResponse> getDeactivateChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateChain",
      requestType = com.axelar.nexus.v1beta1.DeactivateChainRequest.class,
      responseType = com.axelar.nexus.v1beta1.DeactivateChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeactivateChainRequest,
      com.axelar.nexus.v1beta1.DeactivateChainResponse> getDeactivateChainMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.DeactivateChainRequest, com.axelar.nexus.v1beta1.DeactivateChainResponse> getDeactivateChainMethod;
    if ((getDeactivateChainMethod = MsgServiceGrpc.getDeactivateChainMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getDeactivateChainMethod = MsgServiceGrpc.getDeactivateChainMethod) == null) {
          MsgServiceGrpc.getDeactivateChainMethod = getDeactivateChainMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.DeactivateChainRequest, com.axelar.nexus.v1beta1.DeactivateChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.DeactivateChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.DeactivateChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("DeactivateChain"))
              .build();
        }
      }
    }
    return getDeactivateChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterAssetFeeRequest,
      com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> getRegisterAssetFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAssetFee",
      requestType = com.axelar.nexus.v1beta1.RegisterAssetFeeRequest.class,
      responseType = com.axelar.nexus.v1beta1.RegisterAssetFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterAssetFeeRequest,
      com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> getRegisterAssetFeeMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.RegisterAssetFeeRequest, com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> getRegisterAssetFeeMethod;
    if ((getRegisterAssetFeeMethod = MsgServiceGrpc.getRegisterAssetFeeMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getRegisterAssetFeeMethod = MsgServiceGrpc.getRegisterAssetFeeMethod) == null) {
          MsgServiceGrpc.getRegisterAssetFeeMethod = getRegisterAssetFeeMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.RegisterAssetFeeRequest, com.axelar.nexus.v1beta1.RegisterAssetFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAssetFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.RegisterAssetFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.RegisterAssetFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("RegisterAssetFee"))
              .build();
        }
      }
    }
    return getRegisterAssetFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.SetTransferRateLimitRequest,
      com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> getSetTransferRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTransferRateLimit",
      requestType = com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.class,
      responseType = com.axelar.nexus.v1beta1.SetTransferRateLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.SetTransferRateLimitRequest,
      com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> getSetTransferRateLimitMethod() {
    io.grpc.MethodDescriptor<com.axelar.nexus.v1beta1.SetTransferRateLimitRequest, com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> getSetTransferRateLimitMethod;
    if ((getSetTransferRateLimitMethod = MsgServiceGrpc.getSetTransferRateLimitMethod) == null) {
      synchronized (MsgServiceGrpc.class) {
        if ((getSetTransferRateLimitMethod = MsgServiceGrpc.getSetTransferRateLimitMethod) == null) {
          MsgServiceGrpc.getSetTransferRateLimitMethod = getSetTransferRateLimitMethod =
              io.grpc.MethodDescriptor.<com.axelar.nexus.v1beta1.SetTransferRateLimitRequest, com.axelar.nexus.v1beta1.SetTransferRateLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTransferRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.SetTransferRateLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.nexus.v1beta1.SetTransferRateLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgServiceMethodDescriptorSupplier("SetTransferRateLimit"))
              .build();
        }
      }
    }
    return getSetTransferRateLimitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceStub>() {
        @java.lang.Override
        public MsgServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceStub(channel, callOptions);
        }
      };
    return MsgServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceBlockingStub>() {
        @java.lang.Override
        public MsgServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceBlockingStub(channel, callOptions);
        }
      };
    return MsgServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgServiceFutureStub>() {
        @java.lang.Override
        public MsgServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgServiceFutureStub(channel, callOptions);
        }
      };
    return MsgServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the nexus Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void registerChainMaintainer(com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterChainMaintainerMethod(), responseObserver);
    }

    /**
     */
    default void deregisterChainMaintainer(com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeregisterChainMaintainerMethod(), responseObserver);
    }

    /**
     */
    default void activateChain(com.axelar.nexus.v1beta1.ActivateChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.ActivateChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateChainMethod(), responseObserver);
    }

    /**
     */
    default void deactivateChain(com.axelar.nexus.v1beta1.DeactivateChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeactivateChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateChainMethod(), responseObserver);
    }

    /**
     */
    default void registerAssetFee(com.axelar.nexus.v1beta1.RegisterAssetFeeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAssetFeeMethod(), responseObserver);
    }

    /**
     */
    default void setTransferRateLimit(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTransferRateLimitMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MsgService.
   * <pre>
   * Msg defines the nexus Msg service.
   * </pre>
   */
  public static abstract class MsgServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the nexus Msg service.
   * </pre>
   */
  public static final class MsgServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MsgServiceStub> {
    private MsgServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerChainMaintainer(com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterChainMaintainerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deregisterChainMaintainer(com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeregisterChainMaintainerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void activateChain(com.axelar.nexus.v1beta1.ActivateChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.ActivateChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateChain(com.axelar.nexus.v1beta1.DeactivateChainRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeactivateChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerAssetFee(com.axelar.nexus.v1beta1.RegisterAssetFeeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAssetFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTransferRateLimit(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest request,
        io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTransferRateLimitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MsgService.
   * <pre>
   * Msg defines the nexus Msg service.
   * </pre>
   */
  public static final class MsgServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgServiceBlockingStub> {
    private MsgServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse registerChainMaintainer(com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterChainMaintainerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse deregisterChainMaintainer(com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeregisterChainMaintainerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.ActivateChainResponse activateChain(com.axelar.nexus.v1beta1.ActivateChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.DeactivateChainResponse deactivateChain(com.axelar.nexus.v1beta1.DeactivateChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.RegisterAssetFeeResponse registerAssetFee(com.axelar.nexus.v1beta1.RegisterAssetFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAssetFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.axelar.nexus.v1beta1.SetTransferRateLimitResponse setTransferRateLimit(com.axelar.nexus.v1beta1.SetTransferRateLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTransferRateLimitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MsgService.
   * <pre>
   * Msg defines the nexus Msg service.
   * </pre>
   */
  public static final class MsgServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgServiceFutureStub> {
    private MsgServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse> registerChainMaintainer(
        com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterChainMaintainerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse> deregisterChainMaintainer(
        com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeregisterChainMaintainerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.ActivateChainResponse> activateChain(
        com.axelar.nexus.v1beta1.ActivateChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.DeactivateChainResponse> deactivateChain(
        com.axelar.nexus.v1beta1.DeactivateChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.RegisterAssetFeeResponse> registerAssetFee(
        com.axelar.nexus.v1beta1.RegisterAssetFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAssetFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.nexus.v1beta1.SetTransferRateLimitResponse> setTransferRateLimit(
        com.axelar.nexus.v1beta1.SetTransferRateLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTransferRateLimitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_CHAIN_MAINTAINER = 0;
  private static final int METHODID_DEREGISTER_CHAIN_MAINTAINER = 1;
  private static final int METHODID_ACTIVATE_CHAIN = 2;
  private static final int METHODID_DEACTIVATE_CHAIN = 3;
  private static final int METHODID_REGISTER_ASSET_FEE = 4;
  private static final int METHODID_SET_TRANSFER_RATE_LIMIT = 5;

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
        case METHODID_REGISTER_CHAIN_MAINTAINER:
          serviceImpl.registerChainMaintainer((com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse>) responseObserver);
          break;
        case METHODID_DEREGISTER_CHAIN_MAINTAINER:
          serviceImpl.deregisterChainMaintainer((com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_CHAIN:
          serviceImpl.activateChain((com.axelar.nexus.v1beta1.ActivateChainRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.ActivateChainResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_CHAIN:
          serviceImpl.deactivateChain((com.axelar.nexus.v1beta1.DeactivateChainRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.DeactivateChainResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ASSET_FEE:
          serviceImpl.registerAssetFee((com.axelar.nexus.v1beta1.RegisterAssetFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.RegisterAssetFeeResponse>) responseObserver);
          break;
        case METHODID_SET_TRANSFER_RATE_LIMIT:
          serviceImpl.setTransferRateLimit((com.axelar.nexus.v1beta1.SetTransferRateLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.nexus.v1beta1.SetTransferRateLimitResponse>) responseObserver);
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
          getRegisterChainMaintainerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.RegisterChainMaintainerRequest,
              com.axelar.nexus.v1beta1.RegisterChainMaintainerResponse>(
                service, METHODID_REGISTER_CHAIN_MAINTAINER)))
        .addMethod(
          getDeregisterChainMaintainerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.DeregisterChainMaintainerRequest,
              com.axelar.nexus.v1beta1.DeregisterChainMaintainerResponse>(
                service, METHODID_DEREGISTER_CHAIN_MAINTAINER)))
        .addMethod(
          getActivateChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.ActivateChainRequest,
              com.axelar.nexus.v1beta1.ActivateChainResponse>(
                service, METHODID_ACTIVATE_CHAIN)))
        .addMethod(
          getDeactivateChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.DeactivateChainRequest,
              com.axelar.nexus.v1beta1.DeactivateChainResponse>(
                service, METHODID_DEACTIVATE_CHAIN)))
        .addMethod(
          getRegisterAssetFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.RegisterAssetFeeRequest,
              com.axelar.nexus.v1beta1.RegisterAssetFeeResponse>(
                service, METHODID_REGISTER_ASSET_FEE)))
        .addMethod(
          getSetTransferRateLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.nexus.v1beta1.SetTransferRateLimitRequest,
              com.axelar.nexus.v1beta1.SetTransferRateLimitResponse>(
                service, METHODID_SET_TRANSFER_RATE_LIMIT)))
        .build();
  }

  private static abstract class MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.nexus.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MsgService");
    }
  }

  private static final class MsgServiceFileDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier {
    MsgServiceFileDescriptorSupplier() {}
  }

  private static final class MsgServiceMethodDescriptorSupplier
      extends MsgServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgServiceFileDescriptorSupplier())
              .addMethod(getRegisterChainMaintainerMethod())
              .addMethod(getDeregisterChainMaintainerMethod())
              .addMethod(getActivateChainMethod())
              .addMethod(getDeactivateChainMethod())
              .addMethod(getRegisterAssetFeeMethod())
              .addMethod(getSetTransferRateLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
