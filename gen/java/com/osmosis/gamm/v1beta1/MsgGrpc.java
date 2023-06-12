package com.osmosis.gamm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/gamm/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.gamm.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinPool,
      com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinPool",
      requestType = com.osmosis.gamm.v1beta1.MsgJoinPool.class,
      responseType = com.osmosis.gamm.v1beta1.MsgJoinPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinPool,
      com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinPool, com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> getJoinPoolMethod;
    if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJoinPoolMethod = MsgGrpc.getJoinPoolMethod) == null) {
          MsgGrpc.getJoinPoolMethod = getJoinPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgJoinPool, com.osmosis.gamm.v1beta1.MsgJoinPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JoinPool"))
              .build();
        }
      }
    }
    return getJoinPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitPool,
      com.osmosis.gamm.v1beta1.MsgExitPoolResponse> getExitPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitPool",
      requestType = com.osmosis.gamm.v1beta1.MsgExitPool.class,
      responseType = com.osmosis.gamm.v1beta1.MsgExitPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitPool,
      com.osmosis.gamm.v1beta1.MsgExitPoolResponse> getExitPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitPool, com.osmosis.gamm.v1beta1.MsgExitPoolResponse> getExitPoolMethod;
    if ((getExitPoolMethod = MsgGrpc.getExitPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExitPoolMethod = MsgGrpc.getExitPoolMethod) == null) {
          MsgGrpc.getExitPoolMethod = getExitPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgExitPool, com.osmosis.gamm.v1beta1.MsgExitPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExitPool"))
              .build();
        }
      }
    }
    return getExitPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn,
      com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapExactAmountIn",
      requestType = com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn.class,
      responseType = com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn,
      com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn, com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod;
    if ((getSwapExactAmountInMethod = MsgGrpc.getSwapExactAmountInMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapExactAmountInMethod = MsgGrpc.getSwapExactAmountInMethod) == null) {
          MsgGrpc.getSwapExactAmountInMethod = getSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn, com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapExactAmountIn"))
              .build();
        }
      }
    }
    return getSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut,
      com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapExactAmountOut",
      requestType = com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.class,
      responseType = com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut,
      com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut, com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod;
    if ((getSwapExactAmountOutMethod = MsgGrpc.getSwapExactAmountOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapExactAmountOutMethod = MsgGrpc.getSwapExactAmountOutMethod) == null) {
          MsgGrpc.getSwapExactAmountOutMethod = getSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut, com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapExactAmountOut"))
              .build();
        }
      }
    }
    return getSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn,
      com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> getJoinSwapExternAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinSwapExternAmountIn",
      requestType = com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn.class,
      responseType = com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn,
      com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> getJoinSwapExternAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn, com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> getJoinSwapExternAmountInMethod;
    if ((getJoinSwapExternAmountInMethod = MsgGrpc.getJoinSwapExternAmountInMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJoinSwapExternAmountInMethod = MsgGrpc.getJoinSwapExternAmountInMethod) == null) {
          MsgGrpc.getJoinSwapExternAmountInMethod = getJoinSwapExternAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn, com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinSwapExternAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JoinSwapExternAmountIn"))
              .build();
        }
      }
    }
    return getJoinSwapExternAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut,
      com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> getJoinSwapShareAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinSwapShareAmountOut",
      requestType = com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut.class,
      responseType = com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut,
      com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> getJoinSwapShareAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut, com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> getJoinSwapShareAmountOutMethod;
    if ((getJoinSwapShareAmountOutMethod = MsgGrpc.getJoinSwapShareAmountOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJoinSwapShareAmountOutMethod = MsgGrpc.getJoinSwapShareAmountOutMethod) == null) {
          MsgGrpc.getJoinSwapShareAmountOutMethod = getJoinSwapShareAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut, com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinSwapShareAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JoinSwapShareAmountOut"))
              .build();
        }
      }
    }
    return getJoinSwapShareAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut,
      com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> getExitSwapExternAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitSwapExternAmountOut",
      requestType = com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut.class,
      responseType = com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut,
      com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> getExitSwapExternAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut, com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> getExitSwapExternAmountOutMethod;
    if ((getExitSwapExternAmountOutMethod = MsgGrpc.getExitSwapExternAmountOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExitSwapExternAmountOutMethod = MsgGrpc.getExitSwapExternAmountOutMethod) == null) {
          MsgGrpc.getExitSwapExternAmountOutMethod = getExitSwapExternAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut, com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitSwapExternAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExitSwapExternAmountOut"))
              .build();
        }
      }
    }
    return getExitSwapExternAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn,
      com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> getExitSwapShareAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExitSwapShareAmountIn",
      requestType = com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn.class,
      responseType = com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn,
      com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> getExitSwapShareAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn, com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> getExitSwapShareAmountInMethod;
    if ((getExitSwapShareAmountInMethod = MsgGrpc.getExitSwapShareAmountInMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExitSwapShareAmountInMethod = MsgGrpc.getExitSwapShareAmountInMethod) == null) {
          MsgGrpc.getExitSwapShareAmountInMethod = getExitSwapShareAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn, com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExitSwapShareAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExitSwapShareAmountIn"))
              .build();
        }
      }
    }
    return getExitSwapShareAmountInMethod;
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
    default void joinPool(com.osmosis.gamm.v1beta1.MsgJoinPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinPoolMethod(), responseObserver);
    }

    /**
     */
    default void exitPool(com.osmosis.gamm.v1beta1.MsgExitPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitPoolMethod(), responseObserver);
    }

    /**
     */
    default void swapExactAmountIn(com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapExactAmountInMethod(), responseObserver);
    }

    /**
     */
    default void swapExactAmountOut(com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void joinSwapExternAmountIn(com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinSwapExternAmountInMethod(), responseObserver);
    }

    /**
     */
    default void joinSwapShareAmountOut(com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinSwapShareAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void exitSwapExternAmountOut(com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitSwapExternAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void exitSwapShareAmountIn(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExitSwapShareAmountInMethod(), responseObserver);
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
    public void joinPool(com.osmosis.gamm.v1beta1.MsgJoinPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitPool(com.osmosis.gamm.v1beta1.MsgExitPool request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void swapExactAmountIn(com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void swapExactAmountOut(com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinSwapExternAmountIn(com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinSwapExternAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinSwapShareAmountOut(com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinSwapShareAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitSwapExternAmountOut(com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitSwapExternAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exitSwapShareAmountIn(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExitSwapShareAmountInMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.gamm.v1beta1.MsgJoinPoolResponse joinPool(com.osmosis.gamm.v1beta1.MsgJoinPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgExitPoolResponse exitPool(com.osmosis.gamm.v1beta1.MsgExitPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitPoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse swapExactAmountIn(com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse swapExactAmountOut(com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse joinSwapExternAmountIn(com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinSwapExternAmountInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse joinSwapShareAmountOut(com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinSwapShareAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse exitSwapExternAmountOut(com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitSwapExternAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse exitSwapShareAmountIn(com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExitSwapShareAmountInMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgJoinPoolResponse> joinPool(
        com.osmosis.gamm.v1beta1.MsgJoinPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgExitPoolResponse> exitPool(
        com.osmosis.gamm.v1beta1.MsgExitPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitPoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse> swapExactAmountIn(
        com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse> swapExactAmountOut(
        com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse> joinSwapExternAmountIn(
        com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinSwapExternAmountInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse> joinSwapShareAmountOut(
        com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinSwapShareAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse> exitSwapExternAmountOut(
        com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitSwapExternAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse> exitSwapShareAmountIn(
        com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExitSwapShareAmountInMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOIN_POOL = 0;
  private static final int METHODID_EXIT_POOL = 1;
  private static final int METHODID_SWAP_EXACT_AMOUNT_IN = 2;
  private static final int METHODID_SWAP_EXACT_AMOUNT_OUT = 3;
  private static final int METHODID_JOIN_SWAP_EXTERN_AMOUNT_IN = 4;
  private static final int METHODID_JOIN_SWAP_SHARE_AMOUNT_OUT = 5;
  private static final int METHODID_EXIT_SWAP_EXTERN_AMOUNT_OUT = 6;
  private static final int METHODID_EXIT_SWAP_SHARE_AMOUNT_IN = 7;

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
        case METHODID_JOIN_POOL:
          serviceImpl.joinPool((com.osmosis.gamm.v1beta1.MsgJoinPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinPoolResponse>) responseObserver);
          break;
        case METHODID_EXIT_POOL:
          serviceImpl.exitPool((com.osmosis.gamm.v1beta1.MsgExitPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitPoolResponse>) responseObserver);
          break;
        case METHODID_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.swapExactAmountIn((com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.swapExactAmountOut((com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_JOIN_SWAP_EXTERN_AMOUNT_IN:
          serviceImpl.joinSwapExternAmountIn((com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse>) responseObserver);
          break;
        case METHODID_JOIN_SWAP_SHARE_AMOUNT_OUT:
          serviceImpl.joinSwapShareAmountOut((com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse>) responseObserver);
          break;
        case METHODID_EXIT_SWAP_EXTERN_AMOUNT_OUT:
          serviceImpl.exitSwapExternAmountOut((com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse>) responseObserver);
          break;
        case METHODID_EXIT_SWAP_SHARE_AMOUNT_IN:
          serviceImpl.exitSwapShareAmountIn((com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn) request,
              (io.grpc.stub.StreamObserver<com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse>) responseObserver);
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
          getJoinPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgJoinPool,
              com.osmosis.gamm.v1beta1.MsgJoinPoolResponse>(
                service, METHODID_JOIN_POOL)))
        .addMethod(
          getExitPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgExitPool,
              com.osmosis.gamm.v1beta1.MsgExitPoolResponse>(
                service, METHODID_EXIT_POOL)))
        .addMethod(
          getSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgSwapExactAmountIn,
              com.osmosis.gamm.v1beta1.MsgSwapExactAmountInResponse>(
                service, METHODID_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgSwapExactAmountOut,
              com.osmosis.gamm.v1beta1.MsgSwapExactAmountOutResponse>(
                service, METHODID_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getJoinSwapExternAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountIn,
              com.osmosis.gamm.v1beta1.MsgJoinSwapExternAmountInResponse>(
                service, METHODID_JOIN_SWAP_EXTERN_AMOUNT_IN)))
        .addMethod(
          getJoinSwapShareAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOut,
              com.osmosis.gamm.v1beta1.MsgJoinSwapShareAmountOutResponse>(
                service, METHODID_JOIN_SWAP_SHARE_AMOUNT_OUT)))
        .addMethod(
          getExitSwapExternAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOut,
              com.osmosis.gamm.v1beta1.MsgExitSwapExternAmountOutResponse>(
                service, METHODID_EXIT_SWAP_EXTERN_AMOUNT_OUT)))
        .addMethod(
          getExitSwapShareAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountIn,
              com.osmosis.gamm.v1beta1.MsgExitSwapShareAmountInResponse>(
                service, METHODID_EXIT_SWAP_SHARE_AMOUNT_IN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.gamm.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getJoinPoolMethod())
              .addMethod(getExitPoolMethod())
              .addMethod(getSwapExactAmountInMethod())
              .addMethod(getSwapExactAmountOutMethod())
              .addMethod(getJoinSwapExternAmountInMethod())
              .addMethod(getJoinSwapShareAmountOutMethod())
              .addMethod(getExitSwapExternAmountOutMethod())
              .addMethod(getExitSwapShareAmountInMethod())
              .build();
        }
      }
    }
    return result;
  }
}
