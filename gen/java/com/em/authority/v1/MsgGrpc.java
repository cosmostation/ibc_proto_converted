package com.em.authority.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: em/authority/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "em.authority.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgCreateIssuer,
      com.em.authority.v1.TxProto.MsgCreateIssuerResponse> getCreateIssuerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIssuer",
      requestType = com.em.authority.v1.TxProto.MsgCreateIssuer.class,
      responseType = com.em.authority.v1.TxProto.MsgCreateIssuerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgCreateIssuer,
      com.em.authority.v1.TxProto.MsgCreateIssuerResponse> getCreateIssuerMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgCreateIssuer, com.em.authority.v1.TxProto.MsgCreateIssuerResponse> getCreateIssuerMethod;
    if ((getCreateIssuerMethod = MsgGrpc.getCreateIssuerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateIssuerMethod = MsgGrpc.getCreateIssuerMethod) == null) {
          MsgGrpc.getCreateIssuerMethod = getCreateIssuerMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgCreateIssuer, com.em.authority.v1.TxProto.MsgCreateIssuerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIssuer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgCreateIssuer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgCreateIssuerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateIssuer"))
              .build();
        }
      }
    }
    return getCreateIssuerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgDestroyIssuer,
      com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> getDestroyIssuerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyIssuer",
      requestType = com.em.authority.v1.TxProto.MsgDestroyIssuer.class,
      responseType = com.em.authority.v1.TxProto.MsgDestroyIssuerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgDestroyIssuer,
      com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> getDestroyIssuerMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgDestroyIssuer, com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> getDestroyIssuerMethod;
    if ((getDestroyIssuerMethod = MsgGrpc.getDestroyIssuerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDestroyIssuerMethod = MsgGrpc.getDestroyIssuerMethod) == null) {
          MsgGrpc.getDestroyIssuerMethod = getDestroyIssuerMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgDestroyIssuer, com.em.authority.v1.TxProto.MsgDestroyIssuerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyIssuer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgDestroyIssuer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgDestroyIssuerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DestroyIssuer"))
              .build();
        }
      }
    }
    return getDestroyIssuerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetGasPrices,
      com.em.authority.v1.TxProto.MsgSetGasPricesResponse> getSetGasPricesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetGasPrices",
      requestType = com.em.authority.v1.TxProto.MsgSetGasPrices.class,
      responseType = com.em.authority.v1.TxProto.MsgSetGasPricesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetGasPrices,
      com.em.authority.v1.TxProto.MsgSetGasPricesResponse> getSetGasPricesMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetGasPrices, com.em.authority.v1.TxProto.MsgSetGasPricesResponse> getSetGasPricesMethod;
    if ((getSetGasPricesMethod = MsgGrpc.getSetGasPricesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetGasPricesMethod = MsgGrpc.getSetGasPricesMethod) == null) {
          MsgGrpc.getSetGasPricesMethod = getSetGasPricesMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgSetGasPrices, com.em.authority.v1.TxProto.MsgSetGasPricesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetGasPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgSetGasPrices.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgSetGasPricesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetGasPrices"))
              .build();
        }
      }
    }
    return getSetGasPricesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgReplaceAuthority,
      com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> getReplaceAuthorityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceAuthority",
      requestType = com.em.authority.v1.TxProto.MsgReplaceAuthority.class,
      responseType = com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgReplaceAuthority,
      com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> getReplaceAuthorityMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgReplaceAuthority, com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> getReplaceAuthorityMethod;
    if ((getReplaceAuthorityMethod = MsgGrpc.getReplaceAuthorityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReplaceAuthorityMethod = MsgGrpc.getReplaceAuthorityMethod) == null) {
          MsgGrpc.getReplaceAuthorityMethod = getReplaceAuthorityMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgReplaceAuthority, com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceAuthority"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgReplaceAuthority.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReplaceAuthority"))
              .build();
        }
      }
    }
    return getReplaceAuthorityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgScheduleUpgrade,
      com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> getScheduleUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleUpgrade",
      requestType = com.em.authority.v1.TxProto.MsgScheduleUpgrade.class,
      responseType = com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgScheduleUpgrade,
      com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> getScheduleUpgradeMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgScheduleUpgrade, com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> getScheduleUpgradeMethod;
    if ((getScheduleUpgradeMethod = MsgGrpc.getScheduleUpgradeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScheduleUpgradeMethod = MsgGrpc.getScheduleUpgradeMethod) == null) {
          MsgGrpc.getScheduleUpgradeMethod = getScheduleUpgradeMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgScheduleUpgrade, com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgScheduleUpgrade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ScheduleUpgrade"))
              .build();
        }
      }
    }
    return getScheduleUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetParameters,
      com.em.authority.v1.TxProto.MsgSetParametersResponse> getSetParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParameters",
      requestType = com.em.authority.v1.TxProto.MsgSetParameters.class,
      responseType = com.em.authority.v1.TxProto.MsgSetParametersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetParameters,
      com.em.authority.v1.TxProto.MsgSetParametersResponse> getSetParametersMethod() {
    io.grpc.MethodDescriptor<com.em.authority.v1.TxProto.MsgSetParameters, com.em.authority.v1.TxProto.MsgSetParametersResponse> getSetParametersMethod;
    if ((getSetParametersMethod = MsgGrpc.getSetParametersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetParametersMethod = MsgGrpc.getSetParametersMethod) == null) {
          MsgGrpc.getSetParametersMethod = getSetParametersMethod =
              io.grpc.MethodDescriptor.<com.em.authority.v1.TxProto.MsgSetParameters, com.em.authority.v1.TxProto.MsgSetParametersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgSetParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.em.authority.v1.TxProto.MsgSetParametersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetParameters"))
              .build();
        }
      }
    }
    return getSetParametersMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void createIssuer(com.em.authority.v1.TxProto.MsgCreateIssuer request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgCreateIssuerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIssuerMethod(), responseObserver);
    }

    /**
     */
    default void destroyIssuer(com.em.authority.v1.TxProto.MsgDestroyIssuer request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDestroyIssuerMethod(), responseObserver);
    }

    /**
     */
    default void setGasPrices(com.em.authority.v1.TxProto.MsgSetGasPrices request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetGasPricesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetGasPricesMethod(), responseObserver);
    }

    /**
     */
    default void replaceAuthority(com.em.authority.v1.TxProto.MsgReplaceAuthority request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceAuthorityMethod(), responseObserver);
    }

    /**
     */
    default void scheduleUpgrade(com.em.authority.v1.TxProto.MsgScheduleUpgrade request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleUpgradeMethod(), responseObserver);
    }

    /**
     */
    default void setParameters(com.em.authority.v1.TxProto.MsgSetParameters request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetParametersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetParametersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
    public void createIssuer(com.em.authority.v1.TxProto.MsgCreateIssuer request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgCreateIssuerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIssuerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyIssuer(com.em.authority.v1.TxProto.MsgDestroyIssuer request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDestroyIssuerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setGasPrices(com.em.authority.v1.TxProto.MsgSetGasPrices request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetGasPricesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetGasPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replaceAuthority(com.em.authority.v1.TxProto.MsgReplaceAuthority request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceAuthorityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scheduleUpgrade(com.em.authority.v1.TxProto.MsgScheduleUpgrade request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setParameters(com.em.authority.v1.TxProto.MsgSetParameters request,
        io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetParametersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetParametersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
    public com.em.authority.v1.TxProto.MsgCreateIssuerResponse createIssuer(com.em.authority.v1.TxProto.MsgCreateIssuer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIssuerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.TxProto.MsgDestroyIssuerResponse destroyIssuer(com.em.authority.v1.TxProto.MsgDestroyIssuer request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDestroyIssuerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.TxProto.MsgSetGasPricesResponse setGasPrices(com.em.authority.v1.TxProto.MsgSetGasPrices request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetGasPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse replaceAuthority(com.em.authority.v1.TxProto.MsgReplaceAuthority request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceAuthorityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse scheduleUpgrade(com.em.authority.v1.TxProto.MsgScheduleUpgrade request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleUpgradeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.em.authority.v1.TxProto.MsgSetParametersResponse setParameters(com.em.authority.v1.TxProto.MsgSetParameters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetParametersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgCreateIssuerResponse> createIssuer(
        com.em.authority.v1.TxProto.MsgCreateIssuer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIssuerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgDestroyIssuerResponse> destroyIssuer(
        com.em.authority.v1.TxProto.MsgDestroyIssuer request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDestroyIssuerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgSetGasPricesResponse> setGasPrices(
        com.em.authority.v1.TxProto.MsgSetGasPrices request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetGasPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse> replaceAuthority(
        com.em.authority.v1.TxProto.MsgReplaceAuthority request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceAuthorityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse> scheduleUpgrade(
        com.em.authority.v1.TxProto.MsgScheduleUpgrade request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleUpgradeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.em.authority.v1.TxProto.MsgSetParametersResponse> setParameters(
        com.em.authority.v1.TxProto.MsgSetParameters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ISSUER = 0;
  private static final int METHODID_DESTROY_ISSUER = 1;
  private static final int METHODID_SET_GAS_PRICES = 2;
  private static final int METHODID_REPLACE_AUTHORITY = 3;
  private static final int METHODID_SCHEDULE_UPGRADE = 4;
  private static final int METHODID_SET_PARAMETERS = 5;

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
        case METHODID_CREATE_ISSUER:
          serviceImpl.createIssuer((com.em.authority.v1.TxProto.MsgCreateIssuer) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgCreateIssuerResponse>) responseObserver);
          break;
        case METHODID_DESTROY_ISSUER:
          serviceImpl.destroyIssuer((com.em.authority.v1.TxProto.MsgDestroyIssuer) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgDestroyIssuerResponse>) responseObserver);
          break;
        case METHODID_SET_GAS_PRICES:
          serviceImpl.setGasPrices((com.em.authority.v1.TxProto.MsgSetGasPrices) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetGasPricesResponse>) responseObserver);
          break;
        case METHODID_REPLACE_AUTHORITY:
          serviceImpl.replaceAuthority((com.em.authority.v1.TxProto.MsgReplaceAuthority) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse>) responseObserver);
          break;
        case METHODID_SCHEDULE_UPGRADE:
          serviceImpl.scheduleUpgrade((com.em.authority.v1.TxProto.MsgScheduleUpgrade) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse>) responseObserver);
          break;
        case METHODID_SET_PARAMETERS:
          serviceImpl.setParameters((com.em.authority.v1.TxProto.MsgSetParameters) request,
              (io.grpc.stub.StreamObserver<com.em.authority.v1.TxProto.MsgSetParametersResponse>) responseObserver);
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
          getCreateIssuerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgCreateIssuer,
              com.em.authority.v1.TxProto.MsgCreateIssuerResponse>(
                service, METHODID_CREATE_ISSUER)))
        .addMethod(
          getDestroyIssuerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgDestroyIssuer,
              com.em.authority.v1.TxProto.MsgDestroyIssuerResponse>(
                service, METHODID_DESTROY_ISSUER)))
        .addMethod(
          getSetGasPricesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgSetGasPrices,
              com.em.authority.v1.TxProto.MsgSetGasPricesResponse>(
                service, METHODID_SET_GAS_PRICES)))
        .addMethod(
          getReplaceAuthorityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgReplaceAuthority,
              com.em.authority.v1.TxProto.MsgReplaceAuthorityResponse>(
                service, METHODID_REPLACE_AUTHORITY)))
        .addMethod(
          getScheduleUpgradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgScheduleUpgrade,
              com.em.authority.v1.TxProto.MsgScheduleUpgradeResponse>(
                service, METHODID_SCHEDULE_UPGRADE)))
        .addMethod(
          getSetParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.em.authority.v1.TxProto.MsgSetParameters,
              com.em.authority.v1.TxProto.MsgSetParametersResponse>(
                service, METHODID_SET_PARAMETERS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.em.authority.v1.TxProto.getDescriptor();
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
              .addMethod(getCreateIssuerMethod())
              .addMethod(getDestroyIssuerMethod())
              .addMethod(getSetGasPricesMethod())
              .addMethod(getReplaceAuthorityMethod())
              .addMethod(getScheduleUpgradeMethod())
              .addMethod(getSetParametersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
