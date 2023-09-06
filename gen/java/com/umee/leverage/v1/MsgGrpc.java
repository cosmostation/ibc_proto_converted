package com.umee.leverage.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the x/leverage module's Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: umee/leverage/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "umee.leverage.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupply,
      com.umee.leverage.v1.TxProto.MsgSupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.umee.leverage.v1.TxProto.MsgSupply.class,
      responseType = com.umee.leverage.v1.TxProto.MsgSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupply,
      com.umee.leverage.v1.TxProto.MsgSupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupply, com.umee.leverage.v1.TxProto.MsgSupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = MsgGrpc.getSupplyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSupplyMethod = MsgGrpc.getSupplyMethod) == null) {
          MsgGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgSupply, com.umee.leverage.v1.TxProto.MsgSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgSupply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgWithdraw,
      com.umee.leverage.v1.TxProto.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.umee.leverage.v1.TxProto.MsgWithdraw.class,
      responseType = com.umee.leverage.v1.TxProto.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgWithdraw,
      com.umee.leverage.v1.TxProto.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgWithdraw, com.umee.leverage.v1.TxProto.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgWithdraw, com.umee.leverage.v1.TxProto.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxWithdraw,
      com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> getMaxWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxWithdraw",
      requestType = com.umee.leverage.v1.TxProto.MsgMaxWithdraw.class,
      responseType = com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxWithdraw,
      com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> getMaxWithdrawMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxWithdraw, com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> getMaxWithdrawMethod;
    if ((getMaxWithdrawMethod = MsgGrpc.getMaxWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMaxWithdrawMethod = MsgGrpc.getMaxWithdrawMethod) == null) {
          MsgGrpc.getMaxWithdrawMethod = getMaxWithdrawMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgMaxWithdraw, com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgMaxWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MaxWithdraw"))
              .build();
        }
      }
    }
    return getMaxWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgCollateralize,
      com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> getCollateralizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Collateralize",
      requestType = com.umee.leverage.v1.TxProto.MsgCollateralize.class,
      responseType = com.umee.leverage.v1.TxProto.MsgCollateralizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgCollateralize,
      com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> getCollateralizeMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgCollateralize, com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> getCollateralizeMethod;
    if ((getCollateralizeMethod = MsgGrpc.getCollateralizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCollateralizeMethod = MsgGrpc.getCollateralizeMethod) == null) {
          MsgGrpc.getCollateralizeMethod = getCollateralizeMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgCollateralize, com.umee.leverage.v1.TxProto.MsgCollateralizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Collateralize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgCollateralize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgCollateralizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Collateralize"))
              .build();
        }
      }
    }
    return getCollateralizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgDecollateralize,
      com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> getDecollateralizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decollateralize",
      requestType = com.umee.leverage.v1.TxProto.MsgDecollateralize.class,
      responseType = com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgDecollateralize,
      com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> getDecollateralizeMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgDecollateralize, com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> getDecollateralizeMethod;
    if ((getDecollateralizeMethod = MsgGrpc.getDecollateralizeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDecollateralizeMethod = MsgGrpc.getDecollateralizeMethod) == null) {
          MsgGrpc.getDecollateralizeMethod = getDecollateralizeMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgDecollateralize, com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decollateralize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgDecollateralize.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Decollateralize"))
              .build();
        }
      }
    }
    return getDecollateralizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgBorrow,
      com.umee.leverage.v1.TxProto.MsgBorrowResponse> getBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Borrow",
      requestType = com.umee.leverage.v1.TxProto.MsgBorrow.class,
      responseType = com.umee.leverage.v1.TxProto.MsgBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgBorrow,
      com.umee.leverage.v1.TxProto.MsgBorrowResponse> getBorrowMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgBorrow, com.umee.leverage.v1.TxProto.MsgBorrowResponse> getBorrowMethod;
    if ((getBorrowMethod = MsgGrpc.getBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBorrowMethod = MsgGrpc.getBorrowMethod) == null) {
          MsgGrpc.getBorrowMethod = getBorrowMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgBorrow, com.umee.leverage.v1.TxProto.MsgBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Borrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Borrow"))
              .build();
        }
      }
    }
    return getBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxBorrow,
      com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> getMaxBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MaxBorrow",
      requestType = com.umee.leverage.v1.TxProto.MsgMaxBorrow.class,
      responseType = com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxBorrow,
      com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> getMaxBorrowMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgMaxBorrow, com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> getMaxBorrowMethod;
    if ((getMaxBorrowMethod = MsgGrpc.getMaxBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMaxBorrowMethod = MsgGrpc.getMaxBorrowMethod) == null) {
          MsgGrpc.getMaxBorrowMethod = getMaxBorrowMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgMaxBorrow, com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MaxBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgMaxBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MaxBorrow"))
              .build();
        }
      }
    }
    return getMaxBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgRepay,
      com.umee.leverage.v1.TxProto.MsgRepayResponse> getRepayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Repay",
      requestType = com.umee.leverage.v1.TxProto.MsgRepay.class,
      responseType = com.umee.leverage.v1.TxProto.MsgRepayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgRepay,
      com.umee.leverage.v1.TxProto.MsgRepayResponse> getRepayMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgRepay, com.umee.leverage.v1.TxProto.MsgRepayResponse> getRepayMethod;
    if ((getRepayMethod = MsgGrpc.getRepayMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRepayMethod = MsgGrpc.getRepayMethod) == null) {
          MsgGrpc.getRepayMethod = getRepayMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgRepay, com.umee.leverage.v1.TxProto.MsgRepayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgRepay.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgRepayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Repay"))
              .build();
        }
      }
    }
    return getRepayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgLiquidate,
      com.umee.leverage.v1.TxProto.MsgLiquidateResponse> getLiquidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Liquidate",
      requestType = com.umee.leverage.v1.TxProto.MsgLiquidate.class,
      responseType = com.umee.leverage.v1.TxProto.MsgLiquidateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgLiquidate,
      com.umee.leverage.v1.TxProto.MsgLiquidateResponse> getLiquidateMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgLiquidate, com.umee.leverage.v1.TxProto.MsgLiquidateResponse> getLiquidateMethod;
    if ((getLiquidateMethod = MsgGrpc.getLiquidateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidateMethod = MsgGrpc.getLiquidateMethod) == null) {
          MsgGrpc.getLiquidateMethod = getLiquidateMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgLiquidate, com.umee.leverage.v1.TxProto.MsgLiquidateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Liquidate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgLiquidate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgLiquidateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Liquidate"))
              .build();
        }
      }
    }
    return getLiquidateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupplyCollateral,
      com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> getSupplyCollateralMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyCollateral",
      requestType = com.umee.leverage.v1.TxProto.MsgSupplyCollateral.class,
      responseType = com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupplyCollateral,
      com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> getSupplyCollateralMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgSupplyCollateral, com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> getSupplyCollateralMethod;
    if ((getSupplyCollateralMethod = MsgGrpc.getSupplyCollateralMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSupplyCollateralMethod = MsgGrpc.getSupplyCollateralMethod) == null) {
          MsgGrpc.getSupplyCollateralMethod = getSupplyCollateralMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgSupplyCollateral, com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SupplyCollateral"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgSupplyCollateral.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SupplyCollateral"))
              .build();
        }
      }
    }
    return getSupplyCollateralMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry,
      com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> getGovUpdateRegistryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovUpdateRegistry",
      requestType = com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry.class,
      responseType = com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry,
      com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> getGovUpdateRegistryMethod() {
    io.grpc.MethodDescriptor<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry, com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> getGovUpdateRegistryMethod;
    if ((getGovUpdateRegistryMethod = MsgGrpc.getGovUpdateRegistryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovUpdateRegistryMethod = MsgGrpc.getGovUpdateRegistryMethod) == null) {
          MsgGrpc.getGovUpdateRegistryMethod = getGovUpdateRegistryMethod =
              io.grpc.MethodDescriptor.<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry, com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovUpdateRegistry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovUpdateRegistry"))
              .build();
        }
      }
    }
    return getGovUpdateRegistryMethod;
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
   * Msg defines the x/leverage module's Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Supply moves tokens from user balance to the module for lending or collateral.
     * The user receives uTokens in return.
     * </pre>
     */
    default void supply(com.umee.leverage.v1.TxProto.MsgSupply request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Withdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens.
     * </pre>
     */
    default void withdraw(com.umee.leverage.v1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxWithdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens. It automatically calculates the maximum valid amount to withdraw.
     * Zero is returned if no more tokens can be withdrawn.
     * </pre>
     */
    default void maxWithdraw(com.umee.leverage.v1.TxProto.MsgMaxWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxWithdrawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collateralize enables selected uTokens as collateral, which moves them to the module.
     * </pre>
     */
    default void collateralize(com.umee.leverage.v1.TxProto.MsgCollateralize request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCollateralizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decollateralize disables selected uTokens as collateral. They are returned to the user's
     * balance from the module.
     * </pre>
     */
    default void decollateralize(com.umee.leverage.v1.TxProto.MsgDecollateralize request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecollateralizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Borrow allows a user to borrow tokens from the module if they have sufficient collateral.
     * </pre>
     */
    default void borrow(com.umee.leverage.v1.TxProto.MsgBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBorrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * MaxBorrow allows a user to borrow the maximum amount of tokens their collateral will allow.
     * Zero is returned if no more can be borrowed.
     * </pre>
     */
    default void maxBorrow(com.umee.leverage.v1.TxProto.MsgMaxBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMaxBorrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * Repay allows a user to repay previously borrowed tokens and interest.
     * </pre>
     */
    default void repay(com.umee.leverage.v1.TxProto.MsgRepay request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Liquidate allows a user to repay a different user's borrowed coins in exchange for some
     * of the target's collateral.
     * </pre>
     */
    default void liquidate(com.umee.leverage.v1.TxProto.MsgLiquidate request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgLiquidateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SupplyCollateral combines the Supply and Collateralize actions.
     * </pre>
     */
    default void supplyCollateral(com.umee.leverage.v1.TxProto.MsgSupplyCollateral request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyCollateralMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovUpdateRegistry adds new tokens to the token registry or
     * updates existing tokens with new settings.
     * </pre>
     */
    default void govUpdateRegistry(com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovUpdateRegistryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the x/leverage module's Msg service.
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
   * Msg defines the x/leverage module's Msg service.
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
     * Supply moves tokens from user balance to the module for lending or collateral.
     * The user receives uTokens in return.
     * </pre>
     */
    public void supply(com.umee.leverage.v1.TxProto.MsgSupply request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Withdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens.
     * </pre>
     */
    public void withdraw(com.umee.leverage.v1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxWithdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens. It automatically calculates the maximum valid amount to withdraw.
     * Zero is returned if no more tokens can be withdrawn.
     * </pre>
     */
    public void maxWithdraw(com.umee.leverage.v1.TxProto.MsgMaxWithdraw request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collateralize enables selected uTokens as collateral, which moves them to the module.
     * </pre>
     */
    public void collateralize(com.umee.leverage.v1.TxProto.MsgCollateralize request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCollateralizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decollateralize disables selected uTokens as collateral. They are returned to the user's
     * balance from the module.
     * </pre>
     */
    public void decollateralize(com.umee.leverage.v1.TxProto.MsgDecollateralize request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecollateralizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Borrow allows a user to borrow tokens from the module if they have sufficient collateral.
     * </pre>
     */
    public void borrow(com.umee.leverage.v1.TxProto.MsgBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MaxBorrow allows a user to borrow the maximum amount of tokens their collateral will allow.
     * Zero is returned if no more can be borrowed.
     * </pre>
     */
    public void maxBorrow(com.umee.leverage.v1.TxProto.MsgMaxBorrow request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMaxBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Repay allows a user to repay previously borrowed tokens and interest.
     * </pre>
     */
    public void repay(com.umee.leverage.v1.TxProto.MsgRepay request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Liquidate allows a user to repay a different user's borrowed coins in exchange for some
     * of the target's collateral.
     * </pre>
     */
    public void liquidate(com.umee.leverage.v1.TxProto.MsgLiquidate request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgLiquidateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SupplyCollateral combines the Supply and Collateralize actions.
     * </pre>
     */
    public void supplyCollateral(com.umee.leverage.v1.TxProto.MsgSupplyCollateral request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyCollateralMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovUpdateRegistry adds new tokens to the token registry or
     * updates existing tokens with new settings.
     * </pre>
     */
    public void govUpdateRegistry(com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry request,
        io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovUpdateRegistryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the x/leverage module's Msg service.
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
     * Supply moves tokens from user balance to the module for lending or collateral.
     * The user receives uTokens in return.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgSupplyResponse supply(com.umee.leverage.v1.TxProto.MsgSupply request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Withdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgWithdrawResponse withdraw(com.umee.leverage.v1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxWithdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens. It automatically calculates the maximum valid amount to withdraw.
     * Zero is returned if no more tokens can be withdrawn.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse maxWithdraw(com.umee.leverage.v1.TxProto.MsgMaxWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxWithdrawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collateralize enables selected uTokens as collateral, which moves them to the module.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgCollateralizeResponse collateralize(com.umee.leverage.v1.TxProto.MsgCollateralize request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCollateralizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decollateralize disables selected uTokens as collateral. They are returned to the user's
     * balance from the module.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse decollateralize(com.umee.leverage.v1.TxProto.MsgDecollateralize request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecollateralizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Borrow allows a user to borrow tokens from the module if they have sufficient collateral.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgBorrowResponse borrow(com.umee.leverage.v1.TxProto.MsgBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBorrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MaxBorrow allows a user to borrow the maximum amount of tokens their collateral will allow.
     * Zero is returned if no more can be borrowed.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse maxBorrow(com.umee.leverage.v1.TxProto.MsgMaxBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMaxBorrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Repay allows a user to repay previously borrowed tokens and interest.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgRepayResponse repay(com.umee.leverage.v1.TxProto.MsgRepay request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Liquidate allows a user to repay a different user's borrowed coins in exchange for some
     * of the target's collateral.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgLiquidateResponse liquidate(com.umee.leverage.v1.TxProto.MsgLiquidate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SupplyCollateral combines the Supply and Collateralize actions.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse supplyCollateral(com.umee.leverage.v1.TxProto.MsgSupplyCollateral request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyCollateralMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovUpdateRegistry adds new tokens to the token registry or
     * updates existing tokens with new settings.
     * </pre>
     */
    public com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse govUpdateRegistry(com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovUpdateRegistryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the x/leverage module's Msg service.
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
     * Supply moves tokens from user balance to the module for lending or collateral.
     * The user receives uTokens in return.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgSupplyResponse> supply(
        com.umee.leverage.v1.TxProto.MsgSupply request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Withdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgWithdrawResponse> withdraw(
        com.umee.leverage.v1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxWithdraw moves previously supplied tokens from the module back to the user balance in
     * exchange for burning uTokens. It automatically calculates the maximum valid amount to withdraw.
     * Zero is returned if no more tokens can be withdrawn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse> maxWithdraw(
        com.umee.leverage.v1.TxProto.MsgMaxWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxWithdrawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collateralize enables selected uTokens as collateral, which moves them to the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgCollateralizeResponse> collateralize(
        com.umee.leverage.v1.TxProto.MsgCollateralize request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCollateralizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decollateralize disables selected uTokens as collateral. They are returned to the user's
     * balance from the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse> decollateralize(
        com.umee.leverage.v1.TxProto.MsgDecollateralize request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecollateralizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Borrow allows a user to borrow tokens from the module if they have sufficient collateral.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgBorrowResponse> borrow(
        com.umee.leverage.v1.TxProto.MsgBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBorrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MaxBorrow allows a user to borrow the maximum amount of tokens their collateral will allow.
     * Zero is returned if no more can be borrowed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse> maxBorrow(
        com.umee.leverage.v1.TxProto.MsgMaxBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMaxBorrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Repay allows a user to repay previously borrowed tokens and interest.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgRepayResponse> repay(
        com.umee.leverage.v1.TxProto.MsgRepay request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Liquidate allows a user to repay a different user's borrowed coins in exchange for some
     * of the target's collateral.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgLiquidateResponse> liquidate(
        com.umee.leverage.v1.TxProto.MsgLiquidate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SupplyCollateral combines the Supply and Collateralize actions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse> supplyCollateral(
        com.umee.leverage.v1.TxProto.MsgSupplyCollateral request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyCollateralMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovUpdateRegistry adds new tokens to the token registry or
     * updates existing tokens with new settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse> govUpdateRegistry(
        com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovUpdateRegistryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPPLY = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_MAX_WITHDRAW = 2;
  private static final int METHODID_COLLATERALIZE = 3;
  private static final int METHODID_DECOLLATERALIZE = 4;
  private static final int METHODID_BORROW = 5;
  private static final int METHODID_MAX_BORROW = 6;
  private static final int METHODID_REPAY = 7;
  private static final int METHODID_LIQUIDATE = 8;
  private static final int METHODID_SUPPLY_COLLATERAL = 9;
  private static final int METHODID_GOV_UPDATE_REGISTRY = 10;

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
        case METHODID_SUPPLY:
          serviceImpl.supply((com.umee.leverage.v1.TxProto.MsgSupply) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.umee.leverage.v1.TxProto.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_MAX_WITHDRAW:
          serviceImpl.maxWithdraw((com.umee.leverage.v1.TxProto.MsgMaxWithdraw) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse>) responseObserver);
          break;
        case METHODID_COLLATERALIZE:
          serviceImpl.collateralize((com.umee.leverage.v1.TxProto.MsgCollateralize) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgCollateralizeResponse>) responseObserver);
          break;
        case METHODID_DECOLLATERALIZE:
          serviceImpl.decollateralize((com.umee.leverage.v1.TxProto.MsgDecollateralize) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse>) responseObserver);
          break;
        case METHODID_BORROW:
          serviceImpl.borrow((com.umee.leverage.v1.TxProto.MsgBorrow) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgBorrowResponse>) responseObserver);
          break;
        case METHODID_MAX_BORROW:
          serviceImpl.maxBorrow((com.umee.leverage.v1.TxProto.MsgMaxBorrow) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse>) responseObserver);
          break;
        case METHODID_REPAY:
          serviceImpl.repay((com.umee.leverage.v1.TxProto.MsgRepay) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgRepayResponse>) responseObserver);
          break;
        case METHODID_LIQUIDATE:
          serviceImpl.liquidate((com.umee.leverage.v1.TxProto.MsgLiquidate) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgLiquidateResponse>) responseObserver);
          break;
        case METHODID_SUPPLY_COLLATERAL:
          serviceImpl.supplyCollateral((com.umee.leverage.v1.TxProto.MsgSupplyCollateral) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse>) responseObserver);
          break;
        case METHODID_GOV_UPDATE_REGISTRY:
          serviceImpl.govUpdateRegistry((com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry) request,
              (io.grpc.stub.StreamObserver<com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse>) responseObserver);
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
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgSupply,
              com.umee.leverage.v1.TxProto.MsgSupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgWithdraw,
              com.umee.leverage.v1.TxProto.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getMaxWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgMaxWithdraw,
              com.umee.leverage.v1.TxProto.MsgMaxWithdrawResponse>(
                service, METHODID_MAX_WITHDRAW)))
        .addMethod(
          getCollateralizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgCollateralize,
              com.umee.leverage.v1.TxProto.MsgCollateralizeResponse>(
                service, METHODID_COLLATERALIZE)))
        .addMethod(
          getDecollateralizeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgDecollateralize,
              com.umee.leverage.v1.TxProto.MsgDecollateralizeResponse>(
                service, METHODID_DECOLLATERALIZE)))
        .addMethod(
          getBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgBorrow,
              com.umee.leverage.v1.TxProto.MsgBorrowResponse>(
                service, METHODID_BORROW)))
        .addMethod(
          getMaxBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgMaxBorrow,
              com.umee.leverage.v1.TxProto.MsgMaxBorrowResponse>(
                service, METHODID_MAX_BORROW)))
        .addMethod(
          getRepayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgRepay,
              com.umee.leverage.v1.TxProto.MsgRepayResponse>(
                service, METHODID_REPAY)))
        .addMethod(
          getLiquidateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgLiquidate,
              com.umee.leverage.v1.TxProto.MsgLiquidateResponse>(
                service, METHODID_LIQUIDATE)))
        .addMethod(
          getSupplyCollateralMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgSupplyCollateral,
              com.umee.leverage.v1.TxProto.MsgSupplyCollateralResponse>(
                service, METHODID_SUPPLY_COLLATERAL)))
        .addMethod(
          getGovUpdateRegistryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.leverage.v1.TxProto.MsgGovUpdateRegistry,
              com.umee.leverage.v1.TxProto.MsgGovUpdateRegistryResponse>(
                service, METHODID_GOV_UPDATE_REGISTRY)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.leverage.v1.TxProto.getDescriptor();
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
              .addMethod(getSupplyMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getMaxWithdrawMethod())
              .addMethod(getCollateralizeMethod())
              .addMethod(getDecollateralizeMethod())
              .addMethod(getBorrowMethod())
              .addMethod(getMaxBorrowMethod())
              .addMethod(getRepayMethod())
              .addMethod(getLiquidateMethod())
              .addMethod(getSupplyCollateralMethod())
              .addMethod(getGovUpdateRegistryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
