package com.stafihub.stafihub.rvalidator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: stafihub/rvalidator/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stafihub.stafihub.rvalidator.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> getInitRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitRValidator",
      requestType = com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator.class,
      responseType = com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> getInitRValidatorMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> getInitRValidatorMethod;
    if ((getInitRValidatorMethod = MsgGrpc.getInitRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInitRValidatorMethod = MsgGrpc.getInitRValidatorMethod) == null) {
          MsgGrpc.getInitRValidatorMethod = getInitRValidatorMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InitRValidator"))
              .build();
        }
      }
    }
    return getInitRValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds,
      com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCycleSeconds",
      requestType = com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds.class,
      responseType = com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds,
      com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds, com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> getSetCycleSecondsMethod;
    if ((getSetCycleSecondsMethod = MsgGrpc.getSetCycleSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetCycleSecondsMethod = MsgGrpc.getSetCycleSecondsMethod) == null) {
          MsgGrpc.getSetCycleSecondsMethod = getSetCycleSecondsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds, com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCycleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetCycleSeconds"))
              .build();
        }
      }
    }
    return getSetCycleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds,
      com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetShuffleSeconds",
      requestType = com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds.class,
      responseType = com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds,
      com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds, com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> getSetShuffleSecondsMethod;
    if ((getSetShuffleSecondsMethod = MsgGrpc.getSetShuffleSecondsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetShuffleSecondsMethod = MsgGrpc.getSetShuffleSecondsMethod) == null) {
          MsgGrpc.getSetShuffleSecondsMethod = getSetShuffleSecondsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds, com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetShuffleSeconds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetShuffleSeconds"))
              .build();
        }
      }
    }
    return getSetShuffleSecondsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> getAddRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRValidator",
      requestType = com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator.class,
      responseType = com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> getAddRValidatorMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> getAddRValidatorMethod;
    if ((getAddRValidatorMethod = MsgGrpc.getAddRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRValidatorMethod = MsgGrpc.getAddRValidatorMethod) == null) {
          MsgGrpc.getAddRValidatorMethod = getAddRValidatorMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRValidator"))
              .build();
        }
      }
    }
    return getAddRValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> getRmRValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmRValidator",
      requestType = com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator.class,
      responseType = com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator,
      com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> getRmRValidatorMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> getRmRValidatorMethod;
    if ((getRmRValidatorMethod = MsgGrpc.getRmRValidatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmRValidatorMethod = MsgGrpc.getRmRValidatorMethod) == null) {
          MsgGrpc.getRmRValidatorMethod = getRmRValidatorMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator, com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmRValidator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmRValidator"))
              .build();
        }
      }
    }
    return getRmRValidatorMethod;
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
    default void initRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitRValidatorMethod(), responseObserver);
    }

    /**
     */
    default void setCycleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCycleSecondsMethod(), responseObserver);
    }

    /**
     */
    default void setShuffleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetShuffleSecondsMethod(), responseObserver);
    }

    /**
     */
    default void addRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void rmRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmRValidatorMethod(), responseObserver);
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
    public void initRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitRValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setCycleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCycleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setShuffleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetShuffleSecondsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmRValidatorMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse initRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitRValidatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse setCycleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCycleSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse setShuffleSeconds(com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetShuffleSecondsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse addRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse rmRValidator(com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmRValidatorMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse> initRValidator(
        com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitRValidatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse> setCycleSeconds(
        com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCycleSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse> setShuffleSeconds(
        com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetShuffleSecondsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse> addRValidator(
        com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse> rmRValidator(
        com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmRValidatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_RVALIDATOR = 0;
  private static final int METHODID_SET_CYCLE_SECONDS = 1;
  private static final int METHODID_SET_SHUFFLE_SECONDS = 2;
  private static final int METHODID_ADD_RVALIDATOR = 3;
  private static final int METHODID_RM_RVALIDATOR = 4;

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
        case METHODID_INIT_RVALIDATOR:
          serviceImpl.initRValidator((com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse>) responseObserver);
          break;
        case METHODID_SET_CYCLE_SECONDS:
          serviceImpl.setCycleSeconds((com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse>) responseObserver);
          break;
        case METHODID_SET_SHUFFLE_SECONDS:
          serviceImpl.setShuffleSeconds((com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse>) responseObserver);
          break;
        case METHODID_ADD_RVALIDATOR:
          serviceImpl.addRValidator((com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse>) responseObserver);
          break;
        case METHODID_RM_RVALIDATOR:
          serviceImpl.rmRValidator((com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse>) responseObserver);
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
          getInitRValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidator,
              com.stafihub.stafihub.rvalidator.TxProto.MsgInitRValidatorResponse>(
                service, METHODID_INIT_RVALIDATOR)))
        .addMethod(
          getSetCycleSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSeconds,
              com.stafihub.stafihub.rvalidator.TxProto.MsgSetCycleSecondsResponse>(
                service, METHODID_SET_CYCLE_SECONDS)))
        .addMethod(
          getSetShuffleSecondsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSeconds,
              com.stafihub.stafihub.rvalidator.TxProto.MsgSetShuffleSecondsResponse>(
                service, METHODID_SET_SHUFFLE_SECONDS)))
        .addMethod(
          getAddRValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidator,
              com.stafihub.stafihub.rvalidator.TxProto.MsgAddRValidatorResponse>(
                service, METHODID_ADD_RVALIDATOR)))
        .addMethod(
          getRmRValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidator,
              com.stafihub.stafihub.rvalidator.TxProto.MsgRmRValidatorResponse>(
                service, METHODID_RM_RVALIDATOR)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rvalidator.TxProto.getDescriptor();
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
              .addMethod(getInitRValidatorMethod())
              .addMethod(getSetCycleSecondsMethod())
              .addMethod(getSetShuffleSecondsMethod())
              .addMethod(getAddRValidatorMethod())
              .addMethod(getRmRValidatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
