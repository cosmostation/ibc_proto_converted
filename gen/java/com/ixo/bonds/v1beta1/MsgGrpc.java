package com.ixo.bonds.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the bonds Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/bonds/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ixo.bonds.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgCreateBond,
      com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> getCreateBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBond",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgCreateBond.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgCreateBond,
      com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> getCreateBondMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgCreateBond, com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> getCreateBondMethod;
    if ((getCreateBondMethod = MsgGrpc.getCreateBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBondMethod = MsgGrpc.getCreateBondMethod) == null) {
          MsgGrpc.getCreateBondMethod = getCreateBondMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgCreateBond, com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgCreateBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBond"))
              .build();
        }
      }
    }
    return getCreateBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgEditBond,
      com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> getEditBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditBond",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgEditBond.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgEditBond,
      com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> getEditBondMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgEditBond, com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> getEditBondMethod;
    if ((getEditBondMethod = MsgGrpc.getEditBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditBondMethod = MsgGrpc.getEditBondMethod) == null) {
          MsgGrpc.getEditBondMethod = getEditBondMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgEditBond, com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditBond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgEditBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditBond"))
              .build();
        }
      }
    }
    return getEditBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha,
      com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> getSetNextAlphaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetNextAlpha",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha,
      com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> getSetNextAlphaMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha, com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> getSetNextAlphaMethod;
    if ((getSetNextAlphaMethod = MsgGrpc.getSetNextAlphaMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetNextAlphaMethod = MsgGrpc.getSetNextAlphaMethod) == null) {
          MsgGrpc.getSetNextAlphaMethod = getSetNextAlphaMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha, com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetNextAlpha"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetNextAlpha"))
              .build();
        }
      }
    }
    return getSetNextAlphaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState,
      com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> getUpdateBondStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBondState",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState,
      com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> getUpdateBondStateMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState, com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> getUpdateBondStateMethod;
    if ((getUpdateBondStateMethod = MsgGrpc.getUpdateBondStateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateBondStateMethod = MsgGrpc.getUpdateBondStateMethod) == null) {
          MsgGrpc.getUpdateBondStateMethod = getUpdateBondStateMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState, com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBondState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateBondState"))
              .build();
        }
      }
    }
    return getUpdateBondStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgBuy,
      com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> getBuyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Buy",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgBuy.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgBuy,
      com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> getBuyMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgBuy, com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> getBuyMethod;
    if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyMethod = MsgGrpc.getBuyMethod) == null) {
          MsgGrpc.getBuyMethod = getBuyMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgBuy, com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Buy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgBuy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Buy"))
              .build();
        }
      }
    }
    return getBuyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSell,
      com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> getSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sell",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgSell.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgSellResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSell,
      com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> getSellMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSell, com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> getSellMethod;
    if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSellMethod = MsgGrpc.getSellMethod) == null) {
          MsgGrpc.getSellMethod = getSellMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgSell, com.ixo.bonds.v1beta1.TxProto.MsgSellResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSell.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSellResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Sell"))
              .build();
        }
      }
    }
    return getSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSwap,
      com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> getSwapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Swap",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgSwap.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSwap,
      com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> getSwapMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgSwap, com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> getSwapMethod;
    if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSwapMethod = MsgGrpc.getSwapMethod) == null) {
          MsgGrpc.getSwapMethod = getSwapMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgSwap, com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Swap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSwap.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Swap"))
              .build();
        }
      }
    }
    return getSwapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment,
      com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeOutcomePayment",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment,
      com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment, com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> getMakeOutcomePaymentMethod;
    if ((getMakeOutcomePaymentMethod = MsgGrpc.getMakeOutcomePaymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMakeOutcomePaymentMethod = MsgGrpc.getMakeOutcomePaymentMethod) == null) {
          MsgGrpc.getMakeOutcomePaymentMethod = getMakeOutcomePaymentMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment, com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeOutcomePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MakeOutcomePayment"))
              .build();
        }
      }
    }
    return getMakeOutcomePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare,
      com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> getWithdrawShareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawShare",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare,
      com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> getWithdrawShareMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare, com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> getWithdrawShareMethod;
    if ((getWithdrawShareMethod = MsgGrpc.getWithdrawShareMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawShareMethod = MsgGrpc.getWithdrawShareMethod) == null) {
          MsgGrpc.getWithdrawShareMethod = getWithdrawShareMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare, com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawShare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawShare"))
              .build();
        }
      }
    }
    return getWithdrawShareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve,
      com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> getWithdrawReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawReserve",
      requestType = com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve.class,
      responseType = com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve,
      com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> getWithdrawReserveMethod() {
    io.grpc.MethodDescriptor<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve, com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> getWithdrawReserveMethod;
    if ((getWithdrawReserveMethod = MsgGrpc.getWithdrawReserveMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawReserveMethod = MsgGrpc.getWithdrawReserveMethod) == null) {
          MsgGrpc.getWithdrawReserveMethod = getWithdrawReserveMethod =
              io.grpc.MethodDescriptor.<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve, com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawReserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawReserve"))
              .build();
        }
      }
    }
    return getWithdrawReserveMethod;
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
   * Msg defines the bonds Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    default void createBond(com.ixo.bonds.v1beta1.TxProto.MsgCreateBond request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    default void editBond(com.ixo.bonds.v1beta1.TxProto.MsgEditBond request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    default void setNextAlpha(com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetNextAlphaMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    default void updateBondState(com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBondStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    default void buy(com.ixo.bonds.v1beta1.TxProto.MsgBuy request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    default void sell(com.ixo.bonds.v1beta1.TxProto.MsgSell request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellMethod(), responseObserver);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    default void swap(com.ixo.bonds.v1beta1.TxProto.MsgSwap request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapMethod(), responseObserver);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a
     * bond.
     * </pre>
     */
    default void makeOutcomePayment(com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakeOutcomePaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is
     * in the SETTLE stage.
     * </pre>
     */
    default void withdrawShare(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawShareMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    default void withdrawReserve(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawReserveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the bonds Msg service.
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
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public void createBond(com.ixo.bonds.v1beta1.TxProto.MsgCreateBond request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public void editBond(com.ixo.bonds.v1beta1.TxProto.MsgEditBond request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public void setNextAlpha(com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetNextAlphaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public void updateBondState(com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBondStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public void buy(com.ixo.bonds.v1beta1.TxProto.MsgBuy request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public void sell(com.ixo.bonds.v1beta1.TxProto.MsgSell request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public void swap(com.ixo.bonds.v1beta1.TxProto.MsgSwap request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a
     * bond.
     * </pre>
     */
    public void makeOutcomePayment(com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeOutcomePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is
     * in the SETTLE stage.
     * </pre>
     */
    public void withdrawShare(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawShareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public void withdrawReserve(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve request,
        io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawReserveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse createBond(com.ixo.bonds.v1beta1.TxProto.MsgCreateBond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse editBond(com.ixo.bonds.v1beta1.TxProto.MsgEditBond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse setNextAlpha(com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetNextAlphaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse updateBondState(com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBondStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse buy(com.ixo.bonds.v1beta1.TxProto.MsgBuy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgSellResponse sell(com.ixo.bonds.v1beta1.TxProto.MsgSell request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse swap(com.ixo.bonds.v1beta1.TxProto.MsgSwap request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a
     * bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse makeOutcomePayment(com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeOutcomePaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is
     * in the SETTLE stage.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse withdrawShare(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawShareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse withdrawReserve(com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawReserveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the bonds Msg service.
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
     * CreateBond defines a method for creating a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse> createBond(
        com.ixo.bonds.v1beta1.TxProto.MsgCreateBond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditBond defines a method for editing a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse> editBond(
        com.ixo.bonds.v1beta1.TxProto.MsgEditBond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetNextAlpha defines a method for editing a bond's alpha parameter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse> setNextAlpha(
        com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetNextAlphaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBondState defines a method for updating a bond's current state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse> updateBondState(
        com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBondStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Buy defines a method for buying from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse> buy(
        com.ixo.bonds.v1beta1.TxProto.MsgBuy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sell defines a method for selling from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgSellResponse> sell(
        com.ixo.bonds.v1beta1.TxProto.MsgSell request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Swap defines a method for swapping from one reserve bond token to another.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse> swap(
        com.ixo.bonds.v1beta1.TxProto.MsgSwap request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MakeOutcomePayment defines a method for making an outcome payment to a
     * bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse> makeOutcomePayment(
        com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeOutcomePaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawShare defines a method for withdrawing a share from a bond that is
     * in the SETTLE stage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse> withdrawShare(
        com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawShareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawReserve defines a method for withdrawing reserve from a bond.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse> withdrawReserve(
        com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawReserveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOND = 0;
  private static final int METHODID_EDIT_BOND = 1;
  private static final int METHODID_SET_NEXT_ALPHA = 2;
  private static final int METHODID_UPDATE_BOND_STATE = 3;
  private static final int METHODID_BUY = 4;
  private static final int METHODID_SELL = 5;
  private static final int METHODID_SWAP = 6;
  private static final int METHODID_MAKE_OUTCOME_PAYMENT = 7;
  private static final int METHODID_WITHDRAW_SHARE = 8;
  private static final int METHODID_WITHDRAW_RESERVE = 9;

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
        case METHODID_CREATE_BOND:
          serviceImpl.createBond((com.ixo.bonds.v1beta1.TxProto.MsgCreateBond) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse>) responseObserver);
          break;
        case METHODID_EDIT_BOND:
          serviceImpl.editBond((com.ixo.bonds.v1beta1.TxProto.MsgEditBond) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse>) responseObserver);
          break;
        case METHODID_SET_NEXT_ALPHA:
          serviceImpl.setNextAlpha((com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOND_STATE:
          serviceImpl.updateBondState((com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse>) responseObserver);
          break;
        case METHODID_BUY:
          serviceImpl.buy((com.ixo.bonds.v1beta1.TxProto.MsgBuy) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse>) responseObserver);
          break;
        case METHODID_SELL:
          serviceImpl.sell((com.ixo.bonds.v1beta1.TxProto.MsgSell) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSellResponse>) responseObserver);
          break;
        case METHODID_SWAP:
          serviceImpl.swap((com.ixo.bonds.v1beta1.TxProto.MsgSwap) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse>) responseObserver);
          break;
        case METHODID_MAKE_OUTCOME_PAYMENT:
          serviceImpl.makeOutcomePayment((com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_SHARE:
          serviceImpl.withdrawShare((com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_RESERVE:
          serviceImpl.withdrawReserve((com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve) request,
              (io.grpc.stub.StreamObserver<com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse>) responseObserver);
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
          getCreateBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgCreateBond,
              com.ixo.bonds.v1beta1.TxProto.MsgCreateBondResponse>(
                service, METHODID_CREATE_BOND)))
        .addMethod(
          getEditBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgEditBond,
              com.ixo.bonds.v1beta1.TxProto.MsgEditBondResponse>(
                service, METHODID_EDIT_BOND)))
        .addMethod(
          getSetNextAlphaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlpha,
              com.ixo.bonds.v1beta1.TxProto.MsgSetNextAlphaResponse>(
                service, METHODID_SET_NEXT_ALPHA)))
        .addMethod(
          getUpdateBondStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondState,
              com.ixo.bonds.v1beta1.TxProto.MsgUpdateBondStateResponse>(
                service, METHODID_UPDATE_BOND_STATE)))
        .addMethod(
          getBuyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgBuy,
              com.ixo.bonds.v1beta1.TxProto.MsgBuyResponse>(
                service, METHODID_BUY)))
        .addMethod(
          getSellMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgSell,
              com.ixo.bonds.v1beta1.TxProto.MsgSellResponse>(
                service, METHODID_SELL)))
        .addMethod(
          getSwapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgSwap,
              com.ixo.bonds.v1beta1.TxProto.MsgSwapResponse>(
                service, METHODID_SWAP)))
        .addMethod(
          getMakeOutcomePaymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePayment,
              com.ixo.bonds.v1beta1.TxProto.MsgMakeOutcomePaymentResponse>(
                service, METHODID_MAKE_OUTCOME_PAYMENT)))
        .addMethod(
          getWithdrawShareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShare,
              com.ixo.bonds.v1beta1.TxProto.MsgWithdrawShareResponse>(
                service, METHODID_WITHDRAW_SHARE)))
        .addMethod(
          getWithdrawReserveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserve,
              com.ixo.bonds.v1beta1.TxProto.MsgWithdrawReserveResponse>(
                service, METHODID_WITHDRAW_RESERVE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.bonds.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateBondMethod())
              .addMethod(getEditBondMethod())
              .addMethod(getSetNextAlphaMethod())
              .addMethod(getUpdateBondStateMethod())
              .addMethod(getBuyMethod())
              .addMethod(getSellMethod())
              .addMethod(getSwapMethod())
              .addMethod(getMakeOutcomePaymentMethod())
              .addMethod(getWithdrawShareMethod())
              .addMethod(getWithdrawReserveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
