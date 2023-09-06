package com.bitcannaglobal.bcna.bcna;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: bcna/bcna/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bitcannaglobal.bcna.bcna.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> getCreateBitcannaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBitcannaid",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> getCreateBitcannaidMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> getCreateBitcannaidMethod;
    if ((getCreateBitcannaidMethod = MsgGrpc.getCreateBitcannaidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBitcannaidMethod = MsgGrpc.getCreateBitcannaidMethod) == null) {
          MsgGrpc.getCreateBitcannaidMethod = getCreateBitcannaidMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBitcannaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBitcannaid"))
              .build();
        }
      }
    }
    return getCreateBitcannaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> getUpdateBitcannaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBitcannaid",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> getUpdateBitcannaidMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> getUpdateBitcannaidMethod;
    if ((getUpdateBitcannaidMethod = MsgGrpc.getUpdateBitcannaidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBitcannaidMethod = MsgGrpc.getUpdateBitcannaidMethod) == null) {
          MsgGrpc.getUpdateBitcannaidMethod = getUpdateBitcannaidMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBitcannaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBitcannaid"))
              .build();
        }
      }
    }
    return getUpdateBitcannaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> getDeleteBitcannaidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBitcannaid",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> getDeleteBitcannaidMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> getDeleteBitcannaidMethod;
    if ((getDeleteBitcannaidMethod = MsgGrpc.getDeleteBitcannaidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteBitcannaidMethod = MsgGrpc.getDeleteBitcannaidMethod) == null) {
          MsgGrpc.getDeleteBitcannaidMethod = getDeleteBitcannaidMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid, com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBitcannaid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteBitcannaid"))
              .build();
        }
      }
    }
    return getDeleteBitcannaidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> getCreateSupplychainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSupplychain",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> getCreateSupplychainMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> getCreateSupplychainMethod;
    if ((getCreateSupplychainMethod = MsgGrpc.getCreateSupplychainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSupplychainMethod = MsgGrpc.getCreateSupplychainMethod) == null) {
          MsgGrpc.getCreateSupplychainMethod = getCreateSupplychainMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSupplychain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSupplychain"))
              .build();
        }
      }
    }
    return getCreateSupplychainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> getUpdateSupplychainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSupplychain",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> getUpdateSupplychainMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> getUpdateSupplychainMethod;
    if ((getUpdateSupplychainMethod = MsgGrpc.getUpdateSupplychainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateSupplychainMethod = MsgGrpc.getUpdateSupplychainMethod) == null) {
          MsgGrpc.getUpdateSupplychainMethod = getUpdateSupplychainMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSupplychain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateSupplychain"))
              .build();
        }
      }
    }
    return getUpdateSupplychainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> getDeleteSupplychainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSupplychain",
      requestType = com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain.class,
      responseType = com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain,
      com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> getDeleteSupplychainMethod() {
    io.grpc.MethodDescriptor<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> getDeleteSupplychainMethod;
    if ((getDeleteSupplychainMethod = MsgGrpc.getDeleteSupplychainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteSupplychainMethod = MsgGrpc.getDeleteSupplychainMethod) == null) {
          MsgGrpc.getDeleteSupplychainMethod = getDeleteSupplychainMethod =
              io.grpc.MethodDescriptor.<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain, com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSupplychain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteSupplychain"))
              .build();
        }
      }
    }
    return getDeleteSupplychainMethod;
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
    default void createBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBitcannaidMethod(), responseObserver);
    }

    /**
     */
    default void updateBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBitcannaidMethod(), responseObserver);
    }

    /**
     */
    default void deleteBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBitcannaidMethod(), responseObserver);
    }

    /**
     */
    default void createSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSupplychainMethod(), responseObserver);
    }

    /**
     */
    default void updateSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSupplychainMethod(), responseObserver);
    }

    /**
     */
    default void deleteSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSupplychainMethod(), responseObserver);
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
    public void createBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBitcannaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBitcannaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBitcannaidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSupplychainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSupplychainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain request,
        io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSupplychainMethod(), getCallOptions()), request, responseObserver);
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
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse createBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBitcannaidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse updateBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBitcannaidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse deleteBitcannaid(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBitcannaidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse createSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSupplychainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse updateSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSupplychainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse deleteSupplychain(com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSupplychainMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse> createBitcannaid(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBitcannaidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse> updateBitcannaid(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBitcannaidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse> deleteBitcannaid(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBitcannaidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse> createSupplychain(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSupplychainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse> updateSupplychain(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSupplychainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse> deleteSupplychain(
        com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSupplychainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BITCANNAID = 0;
  private static final int METHODID_UPDATE_BITCANNAID = 1;
  private static final int METHODID_DELETE_BITCANNAID = 2;
  private static final int METHODID_CREATE_SUPPLYCHAIN = 3;
  private static final int METHODID_UPDATE_SUPPLYCHAIN = 4;
  private static final int METHODID_DELETE_SUPPLYCHAIN = 5;

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
        case METHODID_CREATE_BITCANNAID:
          serviceImpl.createBitcannaid((com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BITCANNAID:
          serviceImpl.updateBitcannaid((com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse>) responseObserver);
          break;
        case METHODID_DELETE_BITCANNAID:
          serviceImpl.deleteBitcannaid((com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse>) responseObserver);
          break;
        case METHODID_CREATE_SUPPLYCHAIN:
          serviceImpl.createSupplychain((com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SUPPLYCHAIN:
          serviceImpl.updateSupplychain((com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUPPLYCHAIN:
          serviceImpl.deleteSupplychain((com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain) request,
              (io.grpc.stub.StreamObserver<com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse>) responseObserver);
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
          getCreateBitcannaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaid,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateBitcannaidResponse>(
                service, METHODID_CREATE_BITCANNAID)))
        .addMethod(
          getUpdateBitcannaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaid,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateBitcannaidResponse>(
                service, METHODID_UPDATE_BITCANNAID)))
        .addMethod(
          getDeleteBitcannaidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaid,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteBitcannaidResponse>(
                service, METHODID_DELETE_BITCANNAID)))
        .addMethod(
          getCreateSupplychainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychain,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgCreateSupplychainResponse>(
                service, METHODID_CREATE_SUPPLYCHAIN)))
        .addMethod(
          getUpdateSupplychainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychain,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgUpdateSupplychainResponse>(
                service, METHODID_UPDATE_SUPPLYCHAIN)))
        .addMethod(
          getDeleteSupplychainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychain,
              com.bitcannaglobal.bcna.bcna.TxProto.MsgDeleteSupplychainResponse>(
                service, METHODID_DELETE_SUPPLYCHAIN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bitcannaglobal.bcna.bcna.TxProto.getDescriptor();
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
              .addMethod(getCreateBitcannaidMethod())
              .addMethod(getUpdateBitcannaidMethod())
              .addMethod(getDeleteBitcannaidMethod())
              .addMethod(getCreateSupplychainMethod())
              .addMethod(getUpdateSupplychainMethod())
              .addMethod(getDeleteSupplychainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
