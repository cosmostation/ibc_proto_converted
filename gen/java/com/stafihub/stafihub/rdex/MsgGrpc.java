package com.stafihub.stafihub.rdex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: stafihub/rdex/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "stafihub.stafihub.rdex.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgCreatePool,
      com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePool",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgCreatePool.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgCreatePool,
      com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> getCreatePoolMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgCreatePool, com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> getCreatePoolMethod;
    if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePoolMethod = MsgGrpc.getCreatePoolMethod) == null) {
          MsgGrpc.getCreatePoolMethod = getCreatePoolMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgCreatePool, com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgCreatePool.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePool"))
              .build();
        }
      }
    }
    return getCreatePoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity,
      com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLiquidity",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity,
      com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity, com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> getAddLiquidityMethod;
    if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLiquidityMethod = MsgGrpc.getAddLiquidityMethod) == null) {
          MsgGrpc.getAddLiquidityMethod = getAddLiquidityMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity, com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLiquidity"))
              .build();
        }
      }
    }
    return getAddLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgSwap,
      com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgSwap.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgSwap,
      com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgSwap, com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> getSwapMethod;
    if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
          MsgGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgSwap, com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgSwap.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity,
      com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveLiquidity",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity,
      com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity, com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> getRemoveLiquidityMethod;
    if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveLiquidityMethod = MsgGrpc.getRemoveLiquidityMethod) == null) {
          MsgGrpc.getRemoveLiquidityMethod = getRemoveLiquidityMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity, com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveLiquidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveLiquidity"))
              .build();
        }
      }
    }
    return getRemoveLiquidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch,
      com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleProviderSwitch",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch,
      com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch, com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> getToggleProviderSwitchMethod;
    if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleProviderSwitchMethod = MsgGrpc.getToggleProviderSwitchMethod) == null) {
          MsgGrpc.getToggleProviderSwitchMethod = getToggleProviderSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch, com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleProviderSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleProviderSwitch"))
              .build();
        }
      }
    }
    return getToggleProviderSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddProvider,
      com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> getAddProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProvider",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgAddProvider.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddProvider,
      com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> getAddProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddProvider, com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> getAddProviderMethod;
    if ((getAddProviderMethod = MsgGrpc.getAddProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddProviderMethod = MsgGrpc.getAddProviderMethod) == null) {
          MsgGrpc.getAddProviderMethod = getAddProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgAddProvider, com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddProvider"))
              .build();
        }
      }
    }
    return getAddProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmProvider,
      com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> getRmProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmProvider",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgRmProvider.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmProvider,
      com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> getRmProviderMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmProvider, com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> getRmProviderMethod;
    if ((getRmProviderMethod = MsgGrpc.getRmProviderMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmProviderMethod = MsgGrpc.getRmProviderMethod) == null) {
          MsgGrpc.getRmProviderMethod = getRmProviderMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgRmProvider, com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRmProvider.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmProvider"))
              .build();
        }
      }
    }
    return getRmProviderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator,
      com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPoolCreator",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator,
      com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator, com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> getAddPoolCreatorMethod;
    if ((getAddPoolCreatorMethod = MsgGrpc.getAddPoolCreatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPoolCreatorMethod = MsgGrpc.getAddPoolCreatorMethod) == null) {
          MsgGrpc.getAddPoolCreatorMethod = getAddPoolCreatorMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator, com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPoolCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPoolCreator"))
              .build();
        }
      }
    }
    return getAddPoolCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator,
      com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmPoolCreator",
      requestType = com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator.class,
      responseType = com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator,
      com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator, com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> getRmPoolCreatorMethod;
    if ((getRmPoolCreatorMethod = MsgGrpc.getRmPoolCreatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmPoolCreatorMethod = MsgGrpc.getRmPoolCreatorMethod) == null) {
          MsgGrpc.getRmPoolCreatorMethod = getRmPoolCreatorMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator, com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmPoolCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmPoolCreator"))
              .build();
        }
      }
    }
    return getRmPoolCreatorMethod;
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
    default void createPool(com.stafihub.stafihub.rdex.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePoolMethod(), responseObserver);
    }

    /**
     */
    default void addLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLiquidityMethod(), responseObserver);
    }

    /**
     */
    default void swap(com.stafihub.stafihub.rdex.TxProto.MsgSwap request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     */
    default void removeLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveLiquidityMethod(), responseObserver);
    }

    /**
     */
    default void toggleProviderSwitch(com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleProviderSwitchMethod(), responseObserver);
    }

    /**
     */
    default void addProvider(com.stafihub.stafihub.rdex.TxProto.MsgAddProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProviderMethod(), responseObserver);
    }

    /**
     */
    default void rmProvider(com.stafihub.stafihub.rdex.TxProto.MsgRmProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmProviderMethod(), responseObserver);
    }

    /**
     */
    default void addPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPoolCreatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void rmPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmPoolCreatorMethod(), responseObserver);
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
    public void createPool(com.stafihub.stafihub.rdex.TxProto.MsgCreatePool request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void swap(com.stafihub.stafihub.rdex.TxProto.MsgSwap request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleProviderSwitch(com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addProvider(com.stafihub.stafihub.rdex.TxProto.MsgAddProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rmProvider(com.stafihub.stafihub.rdex.TxProto.MsgRmProvider request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmProviderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPoolCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmPoolCreatorMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse createPool(com.stafihub.stafihub.rdex.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePoolMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse addLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse swap(com.stafihub.stafihub.rdex.TxProto.MsgSwap request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse removeLiquidity(com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveLiquidityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse toggleProviderSwitch(com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleProviderSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse addProvider(com.stafihub.stafihub.rdex.TxProto.MsgAddProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse rmProvider(com.stafihub.stafihub.rdex.TxProto.MsgRmProvider request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmProviderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse addPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPoolCreatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse rmPoolCreator(com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmPoolCreatorMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse> createPool(
        com.stafihub.stafihub.rdex.TxProto.MsgCreatePool request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePoolMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse> addLiquidity(
        com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse> swap(
        com.stafihub.stafihub.rdex.TxProto.MsgSwap request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse> removeLiquidity(
        com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveLiquidityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse> toggleProviderSwitch(
        com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleProviderSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse> addProvider(
        com.stafihub.stafihub.rdex.TxProto.MsgAddProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse> rmProvider(
        com.stafihub.stafihub.rdex.TxProto.MsgRmProvider request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmProviderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse> addPoolCreator(
        com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPoolCreatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse> rmPoolCreator(
        com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmPoolCreatorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POOL = 0;
  private static final int METHODID_ADD_LIQUIDITY = 1;
  private static final int METHODID_SWAP = 2;
  private static final int METHODID_REMOVE_LIQUIDITY = 3;
  private static final int METHODID_TOGGLE_PROVIDER_SWITCH = 4;
  private static final int METHODID_ADD_PROVIDER = 5;
  private static final int METHODID_RM_PROVIDER = 6;
  private static final int METHODID_ADD_POOL_CREATOR = 7;
  private static final int METHODID_RM_POOL_CREATOR = 8;

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
        case METHODID_CREATE_POOL:
          serviceImpl.createPool((com.stafihub.stafihub.rdex.TxProto.MsgCreatePool) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse>) responseObserver);
          break;
        case METHODID_ADD_LIQUIDITY:
          serviceImpl.addLiquidity((com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse>) responseObserver);
          break;
        case METHODID_SWAP:
          serviceImpl.swap((com.stafihub.stafihub.rdex.TxProto.MsgSwap) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse>) responseObserver);
          break;
        case METHODID_REMOVE_LIQUIDITY:
          serviceImpl.removeLiquidity((com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_PROVIDER_SWITCH:
          serviceImpl.toggleProviderSwitch((com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse>) responseObserver);
          break;
        case METHODID_ADD_PROVIDER:
          serviceImpl.addProvider((com.stafihub.stafihub.rdex.TxProto.MsgAddProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse>) responseObserver);
          break;
        case METHODID_RM_PROVIDER:
          serviceImpl.rmProvider((com.stafihub.stafihub.rdex.TxProto.MsgRmProvider) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse>) responseObserver);
          break;
        case METHODID_ADD_POOL_CREATOR:
          serviceImpl.addPoolCreator((com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse>) responseObserver);
          break;
        case METHODID_RM_POOL_CREATOR:
          serviceImpl.rmPoolCreator((com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse>) responseObserver);
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
          getCreatePoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgCreatePool,
              com.stafihub.stafihub.rdex.TxProto.MsgCreatePoolResponse>(
                service, METHODID_CREATE_POOL)))
        .addMethod(
          getAddLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidity,
              com.stafihub.stafihub.rdex.TxProto.MsgAddLiquidityResponse>(
                service, METHODID_ADD_LIQUIDITY)))
        .addMethod(
          getSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgSwap,
              com.stafihub.stafihub.rdex.TxProto.MsgSwapResponse>(
                service, METHODID_SWAP)))
        .addMethod(
          getRemoveLiquidityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidity,
              com.stafihub.stafihub.rdex.TxProto.MsgRemoveLiquidityResponse>(
                service, METHODID_REMOVE_LIQUIDITY)))
        .addMethod(
          getToggleProviderSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitch,
              com.stafihub.stafihub.rdex.TxProto.MsgToggleProviderSwitchResponse>(
                service, METHODID_TOGGLE_PROVIDER_SWITCH)))
        .addMethod(
          getAddProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgAddProvider,
              com.stafihub.stafihub.rdex.TxProto.MsgAddProviderResponse>(
                service, METHODID_ADD_PROVIDER)))
        .addMethod(
          getRmProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgRmProvider,
              com.stafihub.stafihub.rdex.TxProto.MsgRmProviderResponse>(
                service, METHODID_RM_PROVIDER)))
        .addMethod(
          getAddPoolCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreator,
              com.stafihub.stafihub.rdex.TxProto.MsgAddPoolCreatorResponse>(
                service, METHODID_ADD_POOL_CREATOR)))
        .addMethod(
          getRmPoolCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreator,
              com.stafihub.stafihub.rdex.TxProto.MsgRmPoolCreatorResponse>(
                service, METHODID_RM_POOL_CREATOR)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rdex.TxProto.getDescriptor();
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
              .addMethod(getCreatePoolMethod())
              .addMethod(getAddLiquidityMethod())
              .addMethod(getSwapMethod())
              .addMethod(getRemoveLiquidityMethod())
              .addMethod(getToggleProviderSwitchMethod())
              .addMethod(getAddProviderMethod())
              .addMethod(getRmProviderMethod())
              .addMethod(getAddPoolCreatorMethod())
              .addMethod(getRmPoolCreatorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
