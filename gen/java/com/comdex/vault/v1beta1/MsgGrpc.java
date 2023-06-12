package com.comdex.vault.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/vault/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "comdex.vault.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateRequest,
      com.comdex.vault.v1beta1.MsgCreateResponse> getMsgCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCreate",
      requestType = com.comdex.vault.v1beta1.MsgCreateRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateRequest,
      com.comdex.vault.v1beta1.MsgCreateResponse> getMsgCreateMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateRequest, com.comdex.vault.v1beta1.MsgCreateResponse> getMsgCreateMethod;
    if ((getMsgCreateMethod = MsgGrpc.getMsgCreateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCreateMethod = MsgGrpc.getMsgCreateMethod) == null) {
          MsgGrpc.getMsgCreateMethod = getMsgCreateMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgCreateRequest, com.comdex.vault.v1beta1.MsgCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgCreate"))
              .build();
        }
      }
    }
    return getMsgCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositRequest,
      com.comdex.vault.v1beta1.MsgDepositResponse> getMsgDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgDeposit",
      requestType = com.comdex.vault.v1beta1.MsgDepositRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositRequest,
      com.comdex.vault.v1beta1.MsgDepositResponse> getMsgDepositMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositRequest, com.comdex.vault.v1beta1.MsgDepositResponse> getMsgDepositMethod;
    if ((getMsgDepositMethod = MsgGrpc.getMsgDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgDepositMethod = MsgGrpc.getMsgDepositMethod) == null) {
          MsgGrpc.getMsgDepositMethod = getMsgDepositMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgDepositRequest, com.comdex.vault.v1beta1.MsgDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgDeposit"))
              .build();
        }
      }
    }
    return getMsgDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawRequest,
      com.comdex.vault.v1beta1.MsgWithdrawResponse> getMsgWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgWithdraw",
      requestType = com.comdex.vault.v1beta1.MsgWithdrawRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawRequest,
      com.comdex.vault.v1beta1.MsgWithdrawResponse> getMsgWithdrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawRequest, com.comdex.vault.v1beta1.MsgWithdrawResponse> getMsgWithdrawMethod;
    if ((getMsgWithdrawMethod = MsgGrpc.getMsgWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgWithdrawMethod = MsgGrpc.getMsgWithdrawMethod) == null) {
          MsgGrpc.getMsgWithdrawMethod = getMsgWithdrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgWithdrawRequest, com.comdex.vault.v1beta1.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgWithdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgWithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgWithdraw"))
              .build();
        }
      }
    }
    return getMsgWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDrawRequest,
      com.comdex.vault.v1beta1.MsgDrawResponse> getMsgDrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgDraw",
      requestType = com.comdex.vault.v1beta1.MsgDrawRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgDrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDrawRequest,
      com.comdex.vault.v1beta1.MsgDrawResponse> getMsgDrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDrawRequest, com.comdex.vault.v1beta1.MsgDrawResponse> getMsgDrawMethod;
    if ((getMsgDrawMethod = MsgGrpc.getMsgDrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgDrawMethod = MsgGrpc.getMsgDrawMethod) == null) {
          MsgGrpc.getMsgDrawMethod = getMsgDrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgDrawRequest, com.comdex.vault.v1beta1.MsgDrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgDraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgDraw"))
              .build();
        }
      }
    }
    return getMsgDrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgRepayRequest,
      com.comdex.vault.v1beta1.MsgRepayResponse> getMsgRepayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgRepay",
      requestType = com.comdex.vault.v1beta1.MsgRepayRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgRepayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgRepayRequest,
      com.comdex.vault.v1beta1.MsgRepayResponse> getMsgRepayMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgRepayRequest, com.comdex.vault.v1beta1.MsgRepayResponse> getMsgRepayMethod;
    if ((getMsgRepayMethod = MsgGrpc.getMsgRepayMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgRepayMethod = MsgGrpc.getMsgRepayMethod) == null) {
          MsgGrpc.getMsgRepayMethod = getMsgRepayMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgRepayRequest, com.comdex.vault.v1beta1.MsgRepayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgRepay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgRepayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgRepayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgRepay"))
              .build();
        }
      }
    }
    return getMsgRepayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCloseRequest,
      com.comdex.vault.v1beta1.MsgCloseResponse> getMsgCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgClose",
      requestType = com.comdex.vault.v1beta1.MsgCloseRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgCloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCloseRequest,
      com.comdex.vault.v1beta1.MsgCloseResponse> getMsgCloseMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCloseRequest, com.comdex.vault.v1beta1.MsgCloseResponse> getMsgCloseMethod;
    if ((getMsgCloseMethod = MsgGrpc.getMsgCloseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCloseMethod = MsgGrpc.getMsgCloseMethod) == null) {
          MsgGrpc.getMsgCloseMethod = getMsgCloseMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgCloseRequest, com.comdex.vault.v1beta1.MsgCloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgClose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgClose"))
              .build();
        }
      }
    }
    return getMsgCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositAndDrawRequest,
      com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> getMsgDepositAndDrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgDepositAndDraw",
      requestType = com.comdex.vault.v1beta1.MsgDepositAndDrawRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgDepositAndDrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositAndDrawRequest,
      com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> getMsgDepositAndDrawMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositAndDrawRequest, com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> getMsgDepositAndDrawMethod;
    if ((getMsgDepositAndDrawMethod = MsgGrpc.getMsgDepositAndDrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgDepositAndDrawMethod = MsgGrpc.getMsgDepositAndDrawMethod) == null) {
          MsgGrpc.getMsgDepositAndDrawMethod = getMsgDepositAndDrawMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgDepositAndDrawRequest, com.comdex.vault.v1beta1.MsgDepositAndDrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgDepositAndDraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositAndDrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositAndDrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgDepositAndDraw"))
              .build();
        }
      }
    }
    return getMsgDepositAndDrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateStableMintRequest,
      com.comdex.vault.v1beta1.MsgCreateStableMintResponse> getMsgCreateStableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgCreateStableMint",
      requestType = com.comdex.vault.v1beta1.MsgCreateStableMintRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgCreateStableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateStableMintRequest,
      com.comdex.vault.v1beta1.MsgCreateStableMintResponse> getMsgCreateStableMintMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgCreateStableMintRequest, com.comdex.vault.v1beta1.MsgCreateStableMintResponse> getMsgCreateStableMintMethod;
    if ((getMsgCreateStableMintMethod = MsgGrpc.getMsgCreateStableMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgCreateStableMintMethod = MsgGrpc.getMsgCreateStableMintMethod) == null) {
          MsgGrpc.getMsgCreateStableMintMethod = getMsgCreateStableMintMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgCreateStableMintRequest, com.comdex.vault.v1beta1.MsgCreateStableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgCreateStableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCreateStableMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgCreateStableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgCreateStableMint"))
              .build();
        }
      }
    }
    return getMsgCreateStableMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositStableMintRequest,
      com.comdex.vault.v1beta1.MsgDepositStableMintResponse> getMsgDepositStableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgDepositStableMint",
      requestType = com.comdex.vault.v1beta1.MsgDepositStableMintRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgDepositStableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositStableMintRequest,
      com.comdex.vault.v1beta1.MsgDepositStableMintResponse> getMsgDepositStableMintMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgDepositStableMintRequest, com.comdex.vault.v1beta1.MsgDepositStableMintResponse> getMsgDepositStableMintMethod;
    if ((getMsgDepositStableMintMethod = MsgGrpc.getMsgDepositStableMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgDepositStableMintMethod = MsgGrpc.getMsgDepositStableMintMethod) == null) {
          MsgGrpc.getMsgDepositStableMintMethod = getMsgDepositStableMintMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgDepositStableMintRequest, com.comdex.vault.v1beta1.MsgDepositStableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgDepositStableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositStableMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgDepositStableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgDepositStableMint"))
              .build();
        }
      }
    }
    return getMsgDepositStableMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest,
      com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> getMsgWithdrawStableMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgWithdrawStableMint",
      requestType = com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest,
      com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> getMsgWithdrawStableMintMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest, com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> getMsgWithdrawStableMintMethod;
    if ((getMsgWithdrawStableMintMethod = MsgGrpc.getMsgWithdrawStableMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgWithdrawStableMintMethod = MsgGrpc.getMsgWithdrawStableMintMethod) == null) {
          MsgGrpc.getMsgWithdrawStableMintMethod = getMsgWithdrawStableMintMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest, com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgWithdrawStableMint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgWithdrawStableMint"))
              .build();
        }
      }
    }
    return getMsgWithdrawStableMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest,
      com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> getMsgVaultInterestCalcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgVaultInterestCalc",
      requestType = com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest.class,
      responseType = com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest,
      com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> getMsgVaultInterestCalcMethod() {
    io.grpc.MethodDescriptor<com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest, com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> getMsgVaultInterestCalcMethod;
    if ((getMsgVaultInterestCalcMethod = MsgGrpc.getMsgVaultInterestCalcMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgVaultInterestCalcMethod = MsgGrpc.getMsgVaultInterestCalcMethod) == null) {
          MsgGrpc.getMsgVaultInterestCalcMethod = getMsgVaultInterestCalcMethod =
              io.grpc.MethodDescriptor.<com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest, com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgVaultInterestCalc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgVaultInterestCalc"))
              .build();
        }
      }
    }
    return getMsgVaultInterestCalcMethod;
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
    default void msgCreate(com.comdex.vault.v1beta1.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCreateMethod(), responseObserver);
    }

    /**
     */
    default void msgDeposit(com.comdex.vault.v1beta1.MsgDepositRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgDepositMethod(), responseObserver);
    }

    /**
     */
    default void msgWithdraw(com.comdex.vault.v1beta1.MsgWithdrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void msgDraw(com.comdex.vault.v1beta1.MsgDrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgDrawMethod(), responseObserver);
    }

    /**
     */
    default void msgRepay(com.comdex.vault.v1beta1.MsgRepayRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgRepayMethod(), responseObserver);
    }

    /**
     */
    default void msgClose(com.comdex.vault.v1beta1.MsgCloseRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCloseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCloseMethod(), responseObserver);
    }

    /**
     */
    default void msgDepositAndDraw(com.comdex.vault.v1beta1.MsgDepositAndDrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgDepositAndDrawMethod(), responseObserver);
    }

    /**
     */
    default void msgCreateStableMint(com.comdex.vault.v1beta1.MsgCreateStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateStableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgCreateStableMintMethod(), responseObserver);
    }

    /**
     */
    default void msgDepositStableMint(com.comdex.vault.v1beta1.MsgDepositStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositStableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgDepositStableMintMethod(), responseObserver);
    }

    /**
     */
    default void msgWithdrawStableMint(com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgWithdrawStableMintMethod(), responseObserver);
    }

    /**
     */
    default void msgVaultInterestCalc(com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgVaultInterestCalcMethod(), responseObserver);
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
    public void msgCreate(com.comdex.vault.v1beta1.MsgCreateRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgDeposit(com.comdex.vault.v1beta1.MsgDepositRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgWithdraw(com.comdex.vault.v1beta1.MsgWithdrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgDraw(com.comdex.vault.v1beta1.MsgDrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgDrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgRepay(com.comdex.vault.v1beta1.MsgRepayRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgRepayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgRepayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgClose(com.comdex.vault.v1beta1.MsgCloseRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCloseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgDepositAndDraw(com.comdex.vault.v1beta1.MsgDepositAndDrawRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgDepositAndDrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgCreateStableMint(com.comdex.vault.v1beta1.MsgCreateStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateStableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgCreateStableMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgDepositStableMint(com.comdex.vault.v1beta1.MsgDepositStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositStableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgDepositStableMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgWithdrawStableMint(com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgWithdrawStableMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgVaultInterestCalc(com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest request,
        io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgVaultInterestCalcMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.vault.v1beta1.MsgCreateResponse msgCreate(com.comdex.vault.v1beta1.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgDepositResponse msgDeposit(com.comdex.vault.v1beta1.MsgDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgWithdrawResponse msgWithdraw(com.comdex.vault.v1beta1.MsgWithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgDrawResponse msgDraw(com.comdex.vault.v1beta1.MsgDrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgDrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgRepayResponse msgRepay(com.comdex.vault.v1beta1.MsgRepayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgRepayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgCloseResponse msgClose(com.comdex.vault.v1beta1.MsgCloseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgDepositAndDrawResponse msgDepositAndDraw(com.comdex.vault.v1beta1.MsgDepositAndDrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgDepositAndDrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgCreateStableMintResponse msgCreateStableMint(com.comdex.vault.v1beta1.MsgCreateStableMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgCreateStableMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgDepositStableMintResponse msgDepositStableMint(com.comdex.vault.v1beta1.MsgDepositStableMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgDepositStableMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse msgWithdrawStableMint(com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgWithdrawStableMintMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse msgVaultInterestCalc(com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgVaultInterestCalcMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgCreateResponse> msgCreate(
        com.comdex.vault.v1beta1.MsgCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgDepositResponse> msgDeposit(
        com.comdex.vault.v1beta1.MsgDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgDepositMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgWithdrawResponse> msgWithdraw(
        com.comdex.vault.v1beta1.MsgWithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgDrawResponse> msgDraw(
        com.comdex.vault.v1beta1.MsgDrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgDrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgRepayResponse> msgRepay(
        com.comdex.vault.v1beta1.MsgRepayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgRepayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgCloseResponse> msgClose(
        com.comdex.vault.v1beta1.MsgCloseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCloseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgDepositAndDrawResponse> msgDepositAndDraw(
        com.comdex.vault.v1beta1.MsgDepositAndDrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgDepositAndDrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgCreateStableMintResponse> msgCreateStableMint(
        com.comdex.vault.v1beta1.MsgCreateStableMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgCreateStableMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgDepositStableMintResponse> msgDepositStableMint(
        com.comdex.vault.v1beta1.MsgDepositStableMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgDepositStableMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse> msgWithdrawStableMint(
        com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgWithdrawStableMintMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse> msgVaultInterestCalc(
        com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgVaultInterestCalcMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_CREATE = 0;
  private static final int METHODID_MSG_DEPOSIT = 1;
  private static final int METHODID_MSG_WITHDRAW = 2;
  private static final int METHODID_MSG_DRAW = 3;
  private static final int METHODID_MSG_REPAY = 4;
  private static final int METHODID_MSG_CLOSE = 5;
  private static final int METHODID_MSG_DEPOSIT_AND_DRAW = 6;
  private static final int METHODID_MSG_CREATE_STABLE_MINT = 7;
  private static final int METHODID_MSG_DEPOSIT_STABLE_MINT = 8;
  private static final int METHODID_MSG_WITHDRAW_STABLE_MINT = 9;
  private static final int METHODID_MSG_VAULT_INTEREST_CALC = 10;

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
        case METHODID_MSG_CREATE:
          serviceImpl.msgCreate((com.comdex.vault.v1beta1.MsgCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateResponse>) responseObserver);
          break;
        case METHODID_MSG_DEPOSIT:
          serviceImpl.msgDeposit((com.comdex.vault.v1beta1.MsgDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositResponse>) responseObserver);
          break;
        case METHODID_MSG_WITHDRAW:
          serviceImpl.msgWithdraw((com.comdex.vault.v1beta1.MsgWithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_MSG_DRAW:
          serviceImpl.msgDraw((com.comdex.vault.v1beta1.MsgDrawRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDrawResponse>) responseObserver);
          break;
        case METHODID_MSG_REPAY:
          serviceImpl.msgRepay((com.comdex.vault.v1beta1.MsgRepayRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgRepayResponse>) responseObserver);
          break;
        case METHODID_MSG_CLOSE:
          serviceImpl.msgClose((com.comdex.vault.v1beta1.MsgCloseRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCloseResponse>) responseObserver);
          break;
        case METHODID_MSG_DEPOSIT_AND_DRAW:
          serviceImpl.msgDepositAndDraw((com.comdex.vault.v1beta1.MsgDepositAndDrawRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositAndDrawResponse>) responseObserver);
          break;
        case METHODID_MSG_CREATE_STABLE_MINT:
          serviceImpl.msgCreateStableMint((com.comdex.vault.v1beta1.MsgCreateStableMintRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgCreateStableMintResponse>) responseObserver);
          break;
        case METHODID_MSG_DEPOSIT_STABLE_MINT:
          serviceImpl.msgDepositStableMint((com.comdex.vault.v1beta1.MsgDepositStableMintRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgDepositStableMintResponse>) responseObserver);
          break;
        case METHODID_MSG_WITHDRAW_STABLE_MINT:
          serviceImpl.msgWithdrawStableMint((com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse>) responseObserver);
          break;
        case METHODID_MSG_VAULT_INTEREST_CALC:
          serviceImpl.msgVaultInterestCalc((com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse>) responseObserver);
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
          getMsgCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgCreateRequest,
              com.comdex.vault.v1beta1.MsgCreateResponse>(
                service, METHODID_MSG_CREATE)))
        .addMethod(
          getMsgDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgDepositRequest,
              com.comdex.vault.v1beta1.MsgDepositResponse>(
                service, METHODID_MSG_DEPOSIT)))
        .addMethod(
          getMsgWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgWithdrawRequest,
              com.comdex.vault.v1beta1.MsgWithdrawResponse>(
                service, METHODID_MSG_WITHDRAW)))
        .addMethod(
          getMsgDrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgDrawRequest,
              com.comdex.vault.v1beta1.MsgDrawResponse>(
                service, METHODID_MSG_DRAW)))
        .addMethod(
          getMsgRepayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgRepayRequest,
              com.comdex.vault.v1beta1.MsgRepayResponse>(
                service, METHODID_MSG_REPAY)))
        .addMethod(
          getMsgCloseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgCloseRequest,
              com.comdex.vault.v1beta1.MsgCloseResponse>(
                service, METHODID_MSG_CLOSE)))
        .addMethod(
          getMsgDepositAndDrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgDepositAndDrawRequest,
              com.comdex.vault.v1beta1.MsgDepositAndDrawResponse>(
                service, METHODID_MSG_DEPOSIT_AND_DRAW)))
        .addMethod(
          getMsgCreateStableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgCreateStableMintRequest,
              com.comdex.vault.v1beta1.MsgCreateStableMintResponse>(
                service, METHODID_MSG_CREATE_STABLE_MINT)))
        .addMethod(
          getMsgDepositStableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgDepositStableMintRequest,
              com.comdex.vault.v1beta1.MsgDepositStableMintResponse>(
                service, METHODID_MSG_DEPOSIT_STABLE_MINT)))
        .addMethod(
          getMsgWithdrawStableMintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgWithdrawStableMintRequest,
              com.comdex.vault.v1beta1.MsgWithdrawStableMintResponse>(
                service, METHODID_MSG_WITHDRAW_STABLE_MINT)))
        .addMethod(
          getMsgVaultInterestCalcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.vault.v1beta1.MsgVaultInterestCalcRequest,
              com.comdex.vault.v1beta1.MsgVaultInterestCalcResponse>(
                service, METHODID_MSG_VAULT_INTEREST_CALC)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.vault.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getMsgCreateMethod())
              .addMethod(getMsgDepositMethod())
              .addMethod(getMsgWithdrawMethod())
              .addMethod(getMsgDrawMethod())
              .addMethod(getMsgRepayMethod())
              .addMethod(getMsgCloseMethod())
              .addMethod(getMsgDepositAndDrawMethod())
              .addMethod(getMsgCreateStableMintMethod())
              .addMethod(getMsgDepositStableMintMethod())
              .addMethod(getMsgWithdrawStableMintMethod())
              .addMethod(getMsgVaultInterestCalcMethod())
              .build();
        }
      }
    }
    return result;
  }
}
