package com.comdex.lend.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: comdex/lend/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "comdex.lend.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgLend,
      com.comdex.lend.v1beta1.TxProto.MsgLendResponse> getLendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lend",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgLend.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgLendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgLend,
      com.comdex.lend.v1beta1.TxProto.MsgLendResponse> getLendMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgLend, com.comdex.lend.v1beta1.TxProto.MsgLendResponse> getLendMethod;
    if ((getLendMethod = MsgGrpc.getLendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLendMethod = MsgGrpc.getLendMethod) == null) {
          MsgGrpc.getLendMethod = getLendMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgLend, com.comdex.lend.v1beta1.TxProto.MsgLendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgLend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgLendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Lend"))
              .build();
        }
      }
    }
    return getLendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgWithdraw,
      com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgWithdraw.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgWithdraw,
      com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgWithdraw, com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgWithdraw, com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDeposit,
      com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgDeposit.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDeposit,
      com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDeposit, com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> getDepositMethod;
    if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositMethod = MsgGrpc.getDepositMethod) == null) {
          MsgGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgDeposit, com.comdex.lend.v1beta1.TxProto.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseLend,
      com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> getCloseLendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseLend",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgCloseLend.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseLend,
      com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> getCloseLendMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseLend, com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> getCloseLendMethod;
    if ((getCloseLendMethod = MsgGrpc.getCloseLendMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseLendMethod = MsgGrpc.getCloseLendMethod) == null) {
          MsgGrpc.getCloseLendMethod = getCloseLendMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgCloseLend, com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseLend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCloseLend.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseLend"))
              .build();
        }
      }
    }
    return getCloseLendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> getBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Borrow",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgBorrow.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> getBorrowMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrow, com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> getBorrowMethod;
    if ((getBorrowMethod = MsgGrpc.getBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBorrowMethod = MsgGrpc.getBorrowMethod) == null) {
          MsgGrpc.getBorrowMethod = getBorrowMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgBorrow, com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Borrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Borrow"))
              .build();
        }
      }
    }
    return getBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgRepay,
      com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> getRepayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Repay",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgRepay.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgRepayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgRepay,
      com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> getRepayMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgRepay, com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> getRepayMethod;
    if ((getRepayMethod = MsgGrpc.getRepayMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRepayMethod = MsgGrpc.getRepayMethod) == null) {
          MsgGrpc.getRepayMethod = getRepayMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgRepay, com.comdex.lend.v1beta1.TxProto.MsgRepayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Repay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgRepay.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgRepayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Repay"))
              .build();
        }
      }
    }
    return getRepayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> getDepositBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositBorrow",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> getDepositBorrowMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow, com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> getDepositBorrowMethod;
    if ((getDepositBorrowMethod = MsgGrpc.getDepositBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositBorrowMethod = MsgGrpc.getDepositBorrowMethod) == null) {
          MsgGrpc.getDepositBorrowMethod = getDepositBorrowMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow, com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositBorrow"))
              .build();
        }
      }
    }
    return getDepositBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDraw,
      com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> getDrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Draw",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgDraw.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgDrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDraw,
      com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> getDrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgDraw, com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> getDrawMethod;
    if ((getDrawMethod = MsgGrpc.getDrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDrawMethod = MsgGrpc.getDrawMethod) == null) {
          MsgGrpc.getDrawMethod = getDrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgDraw, com.comdex.lend.v1beta1.TxProto.MsgDrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Draw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgDrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Draw"))
              .build();
        }
      }
    }
    return getDrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> getCloseBorrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseBorrow",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow,
      com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> getCloseBorrowMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow, com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> getCloseBorrowMethod;
    if ((getCloseBorrowMethod = MsgGrpc.getCloseBorrowMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseBorrowMethod = MsgGrpc.getCloseBorrowMethod) == null) {
          MsgGrpc.getCloseBorrowMethod = getCloseBorrowMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow, com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseBorrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseBorrow"))
              .build();
        }
      }
    }
    return getCloseBorrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate,
      com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> getBorrowAlternateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BorrowAlternate",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate,
      com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> getBorrowAlternateMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate, com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> getBorrowAlternateMethod;
    if ((getBorrowAlternateMethod = MsgGrpc.getBorrowAlternateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBorrowAlternateMethod = MsgGrpc.getBorrowAlternateMethod) == null) {
          MsgGrpc.getBorrowAlternateMethod = getBorrowAlternateMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate, com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BorrowAlternate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BorrowAlternate"))
              .build();
        }
      }
    }
    return getBorrowAlternateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts,
      com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> getFundModuleAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundModuleAccounts",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts,
      com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> getFundModuleAccountsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts, com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> getFundModuleAccountsMethod;
    if ((getFundModuleAccountsMethod = MsgGrpc.getFundModuleAccountsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundModuleAccountsMethod = MsgGrpc.getFundModuleAccountsMethod) == null) {
          MsgGrpc.getFundModuleAccountsMethod = getFundModuleAccountsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts, com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundModuleAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundModuleAccounts"))
              .build();
        }
      }
    }
    return getFundModuleAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards,
      com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> getCalculateInterestAndRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateInterestAndRewards",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards,
      com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> getCalculateInterestAndRewardsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards, com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> getCalculateInterestAndRewardsMethod;
    if ((getCalculateInterestAndRewardsMethod = MsgGrpc.getCalculateInterestAndRewardsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCalculateInterestAndRewardsMethod = MsgGrpc.getCalculateInterestAndRewardsMethod) == null) {
          MsgGrpc.getCalculateInterestAndRewardsMethod = getCalculateInterestAndRewardsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards, com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateInterestAndRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CalculateInterestAndRewards"))
              .build();
        }
      }
    }
    return getCalculateInterestAndRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts,
      com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> getFundReserveAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FundReserveAccounts",
      requestType = com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts.class,
      responseType = com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts,
      com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> getFundReserveAccountsMethod() {
    io.grpc.MethodDescriptor<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts, com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> getFundReserveAccountsMethod;
    if ((getFundReserveAccountsMethod = MsgGrpc.getFundReserveAccountsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFundReserveAccountsMethod = MsgGrpc.getFundReserveAccountsMethod) == null) {
          MsgGrpc.getFundReserveAccountsMethod = getFundReserveAccountsMethod =
              io.grpc.MethodDescriptor.<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts, com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FundReserveAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FundReserveAccounts"))
              .build();
        }
      }
    }
    return getFundReserveAccountsMethod;
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
     * <pre>
     * LendAsset defines a method for lending coins to the ModuleAccount.
     * </pre>
     */
    default void lend(com.comdex.lend.v1beta1.TxProto.MsgLend request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgLendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLendMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawAsset defines a method for withdrawing previously loaned coins from
     * the ModuleAccount.
     * </pre>
     */
    default void withdraw(com.comdex.lend.v1beta1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void deposit(com.comdex.lend.v1beta1.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    default void closeLend(com.comdex.lend.v1beta1.TxProto.MsgCloseLend request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseLendMethod(), responseObserver);
    }

    /**
     * <pre>
     * BorrowAsset defines a method for borrowing coins from the ModuleAccount.
     * </pre>
     */
    default void borrow(com.comdex.lend.v1beta1.TxProto.MsgBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBorrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * RepayAsset defines a method for repaying borrowed coins to the ModuleAccount.
     * </pre>
     */
    default void repay(com.comdex.lend.v1beta1.TxProto.MsgRepay request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepayMethod(), responseObserver);
    }

    /**
     */
    default void depositBorrow(com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositBorrowMethod(), responseObserver);
    }

    /**
     */
    default void draw(com.comdex.lend.v1beta1.TxProto.MsgDraw request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDrawMethod(), responseObserver);
    }

    /**
     */
    default void closeBorrow(com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseBorrowMethod(), responseObserver);
    }

    /**
     */
    default void borrowAlternate(com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBorrowAlternateMethod(), responseObserver);
    }

    /**
     * <pre>
     * FundModuleAccounts funds an existing module account
     * </pre>
     */
    default void fundModuleAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFundModuleAccountsMethod(), responseObserver);
    }

    /**
     */
    default void calculateInterestAndRewards(com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateInterestAndRewardsMethod(), responseObserver);
    }

    /**
     */
    default void fundReserveAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFundReserveAccountsMethod(), responseObserver);
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
     * <pre>
     * LendAsset defines a method for lending coins to the ModuleAccount.
     * </pre>
     */
    public void lend(com.comdex.lend.v1beta1.TxProto.MsgLend request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgLendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawAsset defines a method for withdrawing previously loaned coins from
     * the ModuleAccount.
     * </pre>
     */
    public void withdraw(com.comdex.lend.v1beta1.TxProto.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deposit(com.comdex.lend.v1beta1.TxProto.MsgDeposit request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeLend(com.comdex.lend.v1beta1.TxProto.MsgCloseLend request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseLendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BorrowAsset defines a method for borrowing coins from the ModuleAccount.
     * </pre>
     */
    public void borrow(com.comdex.lend.v1beta1.TxProto.MsgBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RepayAsset defines a method for repaying borrowed coins to the ModuleAccount.
     * </pre>
     */
    public void repay(com.comdex.lend.v1beta1.TxProto.MsgRepay request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void depositBorrow(com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void draw(com.comdex.lend.v1beta1.TxProto.MsgDraw request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeBorrow(com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseBorrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void borrowAlternate(com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBorrowAlternateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FundModuleAccounts funds an existing module account
     * </pre>
     */
    public void fundModuleAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFundModuleAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateInterestAndRewards(com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateInterestAndRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fundReserveAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts request,
        io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFundReserveAccountsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * LendAsset defines a method for lending coins to the ModuleAccount.
     * </pre>
     */
    public com.comdex.lend.v1beta1.TxProto.MsgLendResponse lend(com.comdex.lend.v1beta1.TxProto.MsgLend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawAsset defines a method for withdrawing previously loaned coins from
     * the ModuleAccount.
     * </pre>
     */
    public com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse withdraw(com.comdex.lend.v1beta1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgDepositResponse deposit(com.comdex.lend.v1beta1.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse closeLend(com.comdex.lend.v1beta1.TxProto.MsgCloseLend request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseLendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BorrowAsset defines a method for borrowing coins from the ModuleAccount.
     * </pre>
     */
    public com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse borrow(com.comdex.lend.v1beta1.TxProto.MsgBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBorrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RepayAsset defines a method for repaying borrowed coins to the ModuleAccount.
     * </pre>
     */
    public com.comdex.lend.v1beta1.TxProto.MsgRepayResponse repay(com.comdex.lend.v1beta1.TxProto.MsgRepay request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse depositBorrow(com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositBorrowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgDrawResponse draw(com.comdex.lend.v1beta1.TxProto.MsgDraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse closeBorrow(com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseBorrowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse borrowAlternate(com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBorrowAlternateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FundModuleAccounts funds an existing module account
     * </pre>
     */
    public com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse fundModuleAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFundModuleAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse calculateInterestAndRewards(com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateInterestAndRewardsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse fundReserveAccounts(com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFundReserveAccountsMethod(), getCallOptions(), request);
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
     * <pre>
     * LendAsset defines a method for lending coins to the ModuleAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgLendResponse> lend(
        com.comdex.lend.v1beta1.TxProto.MsgLend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawAsset defines a method for withdrawing previously loaned coins from
     * the ModuleAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse> withdraw(
        com.comdex.lend.v1beta1.TxProto.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgDepositResponse> deposit(
        com.comdex.lend.v1beta1.TxProto.MsgDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse> closeLend(
        com.comdex.lend.v1beta1.TxProto.MsgCloseLend request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseLendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BorrowAsset defines a method for borrowing coins from the ModuleAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse> borrow(
        com.comdex.lend.v1beta1.TxProto.MsgBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBorrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RepayAsset defines a method for repaying borrowed coins to the ModuleAccount.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgRepayResponse> repay(
        com.comdex.lend.v1beta1.TxProto.MsgRepay request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse> depositBorrow(
        com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositBorrowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgDrawResponse> draw(
        com.comdex.lend.v1beta1.TxProto.MsgDraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse> closeBorrow(
        com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseBorrowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse> borrowAlternate(
        com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBorrowAlternateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FundModuleAccounts funds an existing module account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse> fundModuleAccounts(
        com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFundModuleAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse> calculateInterestAndRewards(
        com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateInterestAndRewardsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse> fundReserveAccounts(
        com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFundReserveAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LEND = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_DEPOSIT = 2;
  private static final int METHODID_CLOSE_LEND = 3;
  private static final int METHODID_BORROW = 4;
  private static final int METHODID_REPAY = 5;
  private static final int METHODID_DEPOSIT_BORROW = 6;
  private static final int METHODID_DRAW = 7;
  private static final int METHODID_CLOSE_BORROW = 8;
  private static final int METHODID_BORROW_ALTERNATE = 9;
  private static final int METHODID_FUND_MODULE_ACCOUNTS = 10;
  private static final int METHODID_CALCULATE_INTEREST_AND_REWARDS = 11;
  private static final int METHODID_FUND_RESERVE_ACCOUNTS = 12;

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
        case METHODID_LEND:
          serviceImpl.lend((com.comdex.lend.v1beta1.TxProto.MsgLend) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgLendResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.comdex.lend.v1beta1.TxProto.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.comdex.lend.v1beta1.TxProto.MsgDeposit) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_CLOSE_LEND:
          serviceImpl.closeLend((com.comdex.lend.v1beta1.TxProto.MsgCloseLend) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse>) responseObserver);
          break;
        case METHODID_BORROW:
          serviceImpl.borrow((com.comdex.lend.v1beta1.TxProto.MsgBorrow) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse>) responseObserver);
          break;
        case METHODID_REPAY:
          serviceImpl.repay((com.comdex.lend.v1beta1.TxProto.MsgRepay) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgRepayResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_BORROW:
          serviceImpl.depositBorrow((com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse>) responseObserver);
          break;
        case METHODID_DRAW:
          serviceImpl.draw((com.comdex.lend.v1beta1.TxProto.MsgDraw) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgDrawResponse>) responseObserver);
          break;
        case METHODID_CLOSE_BORROW:
          serviceImpl.closeBorrow((com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse>) responseObserver);
          break;
        case METHODID_BORROW_ALTERNATE:
          serviceImpl.borrowAlternate((com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse>) responseObserver);
          break;
        case METHODID_FUND_MODULE_ACCOUNTS:
          serviceImpl.fundModuleAccounts((com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_INTEREST_AND_REWARDS:
          serviceImpl.calculateInterestAndRewards((com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse>) responseObserver);
          break;
        case METHODID_FUND_RESERVE_ACCOUNTS:
          serviceImpl.fundReserveAccounts((com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts) request,
              (io.grpc.stub.StreamObserver<com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse>) responseObserver);
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
          getLendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgLend,
              com.comdex.lend.v1beta1.TxProto.MsgLendResponse>(
                service, METHODID_LEND)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgWithdraw,
              com.comdex.lend.v1beta1.TxProto.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgDeposit,
              com.comdex.lend.v1beta1.TxProto.MsgDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getCloseLendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgCloseLend,
              com.comdex.lend.v1beta1.TxProto.MsgCloseLendResponse>(
                service, METHODID_CLOSE_LEND)))
        .addMethod(
          getBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgBorrow,
              com.comdex.lend.v1beta1.TxProto.MsgBorrowResponse>(
                service, METHODID_BORROW)))
        .addMethod(
          getRepayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgRepay,
              com.comdex.lend.v1beta1.TxProto.MsgRepayResponse>(
                service, METHODID_REPAY)))
        .addMethod(
          getDepositBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgDepositBorrow,
              com.comdex.lend.v1beta1.TxProto.MsgDepositBorrowResponse>(
                service, METHODID_DEPOSIT_BORROW)))
        .addMethod(
          getDrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgDraw,
              com.comdex.lend.v1beta1.TxProto.MsgDrawResponse>(
                service, METHODID_DRAW)))
        .addMethod(
          getCloseBorrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgCloseBorrow,
              com.comdex.lend.v1beta1.TxProto.MsgCloseBorrowResponse>(
                service, METHODID_CLOSE_BORROW)))
        .addMethod(
          getBorrowAlternateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternate,
              com.comdex.lend.v1beta1.TxProto.MsgBorrowAlternateResponse>(
                service, METHODID_BORROW_ALTERNATE)))
        .addMethod(
          getFundModuleAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccounts,
              com.comdex.lend.v1beta1.TxProto.MsgFundModuleAccountsResponse>(
                service, METHODID_FUND_MODULE_ACCOUNTS)))
        .addMethod(
          getCalculateInterestAndRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewards,
              com.comdex.lend.v1beta1.TxProto.MsgCalculateInterestAndRewardsResponse>(
                service, METHODID_CALCULATE_INTEREST_AND_REWARDS)))
        .addMethod(
          getFundReserveAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccounts,
              com.comdex.lend.v1beta1.TxProto.MsgFundReserveAccountsResponse>(
                service, METHODID_FUND_RESERVE_ACCOUNTS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.lend.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getLendMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getDepositMethod())
              .addMethod(getCloseLendMethod())
              .addMethod(getBorrowMethod())
              .addMethod(getRepayMethod())
              .addMethod(getDepositBorrowMethod())
              .addMethod(getDrawMethod())
              .addMethod(getCloseBorrowMethod())
              .addMethod(getBorrowAlternateMethod())
              .addMethod(getFundModuleAccountsMethod())
              .addMethod(getCalculateInterestAndRewardsMethod())
              .addMethod(getFundReserveAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
