package com.osmosis.poolmanager.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/poolmanager/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.poolmanager.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapExactAmountIn",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn, com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> getSwapExactAmountInMethod;
    if ((getSwapExactAmountInMethod = MsgGrpc.getSwapExactAmountInMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapExactAmountInMethod = MsgGrpc.getSwapExactAmountInMethod) == null) {
          MsgGrpc.getSwapExactAmountInMethod = getSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn, com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapExactAmountIn"))
              .build();
        }
      }
    }
    return getSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapExactAmountOut",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut, com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> getSwapExactAmountOutMethod;
    if ((getSwapExactAmountOutMethod = MsgGrpc.getSwapExactAmountOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapExactAmountOutMethod = MsgGrpc.getSwapExactAmountOutMethod) == null) {
          MsgGrpc.getSwapExactAmountOutMethod = getSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut, com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SwapExactAmountOut"))
              .build();
        }
      }
    }
    return getSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> getSplitRouteSwapExactAmountInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SplitRouteSwapExactAmountIn",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> getSplitRouteSwapExactAmountInMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn, com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> getSplitRouteSwapExactAmountInMethod;
    if ((getSplitRouteSwapExactAmountInMethod = MsgGrpc.getSplitRouteSwapExactAmountInMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSplitRouteSwapExactAmountInMethod = MsgGrpc.getSplitRouteSwapExactAmountInMethod) == null) {
          MsgGrpc.getSplitRouteSwapExactAmountInMethod = getSplitRouteSwapExactAmountInMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn, com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SplitRouteSwapExactAmountIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SplitRouteSwapExactAmountIn"))
              .build();
        }
      }
    }
    return getSplitRouteSwapExactAmountInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> getSplitRouteSwapExactAmountOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SplitRouteSwapExactAmountOut",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> getSplitRouteSwapExactAmountOutMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut, com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> getSplitRouteSwapExactAmountOutMethod;
    if ((getSplitRouteSwapExactAmountOutMethod = MsgGrpc.getSplitRouteSwapExactAmountOutMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSplitRouteSwapExactAmountOutMethod = MsgGrpc.getSplitRouteSwapExactAmountOutMethod) == null) {
          MsgGrpc.getSplitRouteSwapExactAmountOutMethod = getSplitRouteSwapExactAmountOutMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut, com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SplitRouteSwapExactAmountOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SplitRouteSwapExactAmountOut"))
              .build();
        }
      }
    }
    return getSplitRouteSwapExactAmountOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> getSetDenomPairTakerFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDenomPairTakerFee",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> getSetDenomPairTakerFeeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> getSetDenomPairTakerFeeMethod;
    if ((getSetDenomPairTakerFeeMethod = MsgGrpc.getSetDenomPairTakerFeeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetDenomPairTakerFeeMethod = MsgGrpc.getSetDenomPairTakerFeeMethod) == null) {
          MsgGrpc.getSetDenomPairTakerFeeMethod = getSetDenomPairTakerFeeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDenomPairTakerFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetDenomPairTakerFee"))
              .build();
        }
      }
    }
    return getSetDenomPairTakerFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> getSetTakerFeeShareAgreementForDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTakerFeeShareAgreementForDenom",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> getSetTakerFeeShareAgreementForDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> getSetTakerFeeShareAgreementForDenomMethod;
    if ((getSetTakerFeeShareAgreementForDenomMethod = MsgGrpc.getSetTakerFeeShareAgreementForDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetTakerFeeShareAgreementForDenomMethod = MsgGrpc.getSetTakerFeeShareAgreementForDenomMethod) == null) {
          MsgGrpc.getSetTakerFeeShareAgreementForDenomMethod = getSetTakerFeeShareAgreementForDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTakerFeeShareAgreementForDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetTakerFeeShareAgreementForDenom"))
              .build();
        }
      }
    }
    return getSetTakerFeeShareAgreementForDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> getSetRegisteredAlloyedPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRegisteredAlloyedPool",
      requestType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool.class,
      responseType = com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool,
      com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> getSetRegisteredAlloyedPoolMethod() {
    io.grpc.MethodDescriptor<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> getSetRegisteredAlloyedPoolMethod;
    if ((getSetRegisteredAlloyedPoolMethod = MsgGrpc.getSetRegisteredAlloyedPoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetRegisteredAlloyedPoolMethod = MsgGrpc.getSetRegisteredAlloyedPoolMethod) == null) {
          MsgGrpc.getSetRegisteredAlloyedPoolMethod = getSetRegisteredAlloyedPoolMethod =
              io.grpc.MethodDescriptor.<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool, com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRegisteredAlloyedPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetRegisteredAlloyedPool"))
              .build();
        }
      }
    }
    return getSetRegisteredAlloyedPoolMethod;
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
    default void swapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapExactAmountInMethod(), responseObserver);
    }

    /**
     */
    default void swapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void splitRouteSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitRouteSwapExactAmountInMethod(), responseObserver);
    }

    /**
     */
    default void splitRouteSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitRouteSwapExactAmountOutMethod(), responseObserver);
    }

    /**
     */
    default void setDenomPairTakerFee(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDenomPairTakerFeeMethod(), responseObserver);
    }

    /**
     */
    default void setTakerFeeShareAgreementForDenom(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTakerFeeShareAgreementForDenomMethod(), responseObserver);
    }

    /**
     */
    default void setRegisteredAlloyedPool(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRegisteredAlloyedPoolMethod(), responseObserver);
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
    public void swapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void swapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void splitRouteSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSplitRouteSwapExactAmountInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void splitRouteSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSplitRouteSwapExactAmountOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDenomPairTakerFee(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDenomPairTakerFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTakerFeeShareAgreementForDenom(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTakerFeeShareAgreementForDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setRegisteredAlloyedPool(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool request,
        io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRegisteredAlloyedPoolMethod(), getCallOptions()), request, responseObserver);
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
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse swapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse swapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse splitRouteSwapExactAmountIn(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSplitRouteSwapExactAmountInMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse splitRouteSwapExactAmountOut(com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSplitRouteSwapExactAmountOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse setDenomPairTakerFee(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDenomPairTakerFeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse setTakerFeeShareAgreementForDenom(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTakerFeeShareAgreementForDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse setRegisteredAlloyedPool(com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRegisteredAlloyedPoolMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse> swapExactAmountIn(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse> swapExactAmountOut(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse> splitRouteSwapExactAmountIn(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSplitRouteSwapExactAmountInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse> splitRouteSwapExactAmountOut(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSplitRouteSwapExactAmountOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse> setDenomPairTakerFee(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDenomPairTakerFeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse> setTakerFeeShareAgreementForDenom(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTakerFeeShareAgreementForDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse> setRegisteredAlloyedPool(
        com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRegisteredAlloyedPoolMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SWAP_EXACT_AMOUNT_IN = 0;
  private static final int METHODID_SWAP_EXACT_AMOUNT_OUT = 1;
  private static final int METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_IN = 2;
  private static final int METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_OUT = 3;
  private static final int METHODID_SET_DENOM_PAIR_TAKER_FEE = 4;
  private static final int METHODID_SET_TAKER_FEE_SHARE_AGREEMENT_FOR_DENOM = 5;
  private static final int METHODID_SET_REGISTERED_ALLOYED_POOL = 6;

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
        case METHODID_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.swapExactAmountIn((com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.swapExactAmountOut((com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_IN:
          serviceImpl.splitRouteSwapExactAmountIn((com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse>) responseObserver);
          break;
        case METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_OUT:
          serviceImpl.splitRouteSwapExactAmountOut((com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse>) responseObserver);
          break;
        case METHODID_SET_DENOM_PAIR_TAKER_FEE:
          serviceImpl.setDenomPairTakerFee((com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse>) responseObserver);
          break;
        case METHODID_SET_TAKER_FEE_SHARE_AGREEMENT_FOR_DENOM:
          serviceImpl.setTakerFeeShareAgreementForDenom((com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse>) responseObserver);
          break;
        case METHODID_SET_REGISTERED_ALLOYED_POOL:
          serviceImpl.setRegisteredAlloyedPool((com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool) request,
              (io.grpc.stub.StreamObserver<com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse>) responseObserver);
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
          getSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountIn,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountInResponse>(
                service, METHODID_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOut,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSwapExactAmountOutResponse>(
                service, METHODID_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getSplitRouteSwapExactAmountInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountIn,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountInResponse>(
                service, METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_IN)))
        .addMethod(
          getSplitRouteSwapExactAmountOutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOut,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSplitRouteSwapExactAmountOutResponse>(
                service, METHODID_SPLIT_ROUTE_SWAP_EXACT_AMOUNT_OUT)))
        .addMethod(
          getSetDenomPairTakerFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFee,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetDenomPairTakerFeeResponse>(
                service, METHODID_SET_DENOM_PAIR_TAKER_FEE)))
        .addMethod(
          getSetTakerFeeShareAgreementForDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenom,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetTakerFeeShareAgreementForDenomResponse>(
                service, METHODID_SET_TAKER_FEE_SHARE_AGREEMENT_FOR_DENOM)))
        .addMethod(
          getSetRegisteredAlloyedPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPool,
              com.osmosis.poolmanager.v1beta1.TxProto.MsgSetRegisteredAlloyedPoolResponse>(
                service, METHODID_SET_REGISTERED_ALLOYED_POOL)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.poolmanager.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getSwapExactAmountInMethod())
              .addMethod(getSwapExactAmountOutMethod())
              .addMethod(getSplitRouteSwapExactAmountInMethod())
              .addMethod(getSplitRouteSwapExactAmountOutMethod())
              .addMethod(getSetDenomPairTakerFeeMethod())
              .addMethod(getSetTakerFeeShareAgreementForDenomMethod())
              .addMethod(getSetRegisteredAlloyedPoolMethod())
              .build();
        }
      }
    }
    return result;
  }
}
