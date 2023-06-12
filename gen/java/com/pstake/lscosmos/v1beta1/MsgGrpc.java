package com.pstake.lscosmos.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the lsCosmos services.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: pstake/lscosmos/v1beta1/msgs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "pstake.lscosmos.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidStake,
      com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidStake",
      requestType = com.pstake.lscosmos.v1beta1.MsgLiquidStake.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidStake,
      com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidStake, com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> getLiquidStakeMethod;
    if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidStakeMethod = MsgGrpc.getLiquidStakeMethod) == null) {
          MsgGrpc.getLiquidStakeMethod = getLiquidStakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgLiquidStake, com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidStake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgLiquidStake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidStake"))
              .build();
        }
      }
    }
    return getLiquidStakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidUnstake,
      com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiquidUnstake",
      requestType = com.pstake.lscosmos.v1beta1.MsgLiquidUnstake.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidUnstake,
      com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgLiquidUnstake, com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> getLiquidUnstakeMethod;
    if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getLiquidUnstakeMethod = MsgGrpc.getLiquidUnstakeMethod) == null) {
          MsgGrpc.getLiquidUnstakeMethod = getLiquidUnstakeMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgLiquidUnstake, com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiquidUnstake"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgLiquidUnstake.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("LiquidUnstake"))
              .build();
        }
      }
    }
    return getLiquidUnstakeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRedeem,
      com.pstake.lscosmos.v1beta1.MsgRedeemResponse> getRedeemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Redeem",
      requestType = com.pstake.lscosmos.v1beta1.MsgRedeem.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgRedeemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRedeem,
      com.pstake.lscosmos.v1beta1.MsgRedeemResponse> getRedeemMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRedeem, com.pstake.lscosmos.v1beta1.MsgRedeemResponse> getRedeemMethod;
    if ((getRedeemMethod = MsgGrpc.getRedeemMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRedeemMethod = MsgGrpc.getRedeemMethod) == null) {
          MsgGrpc.getRedeemMethod = getRedeemMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgRedeem, com.pstake.lscosmos.v1beta1.MsgRedeemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Redeem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgRedeem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgRedeemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Redeem"))
              .build();
        }
      }
    }
    return getRedeemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgClaim,
      com.pstake.lscosmos.v1beta1.MsgClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = com.pstake.lscosmos.v1beta1.MsgClaim.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgClaim,
      com.pstake.lscosmos.v1beta1.MsgClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgClaim, com.pstake.lscosmos.v1beta1.MsgClaimResponse> getClaimMethod;
    if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
          MsgGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgClaim, com.pstake.lscosmos.v1beta1.MsgClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRecreateICA,
      com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> getRecreateICAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecreateICA",
      requestType = com.pstake.lscosmos.v1beta1.MsgRecreateICA.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRecreateICA,
      com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> getRecreateICAMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgRecreateICA, com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> getRecreateICAMethod;
    if ((getRecreateICAMethod = MsgGrpc.getRecreateICAMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRecreateICAMethod = MsgGrpc.getRecreateICAMethod) == null) {
          MsgGrpc.getRecreateICAMethod = getRecreateICAMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgRecreateICA, com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecreateICA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgRecreateICA.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RecreateICA"))
              .build();
        }
      }
    }
    return getRecreateICAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgJumpStart,
      com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> getJumpStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JumpStart",
      requestType = com.pstake.lscosmos.v1beta1.MsgJumpStart.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgJumpStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgJumpStart,
      com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> getJumpStartMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgJumpStart, com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> getJumpStartMethod;
    if ((getJumpStartMethod = MsgGrpc.getJumpStartMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getJumpStartMethod = MsgGrpc.getJumpStartMethod) == null) {
          MsgGrpc.getJumpStartMethod = getJumpStartMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgJumpStart, com.pstake.lscosmos.v1beta1.MsgJumpStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JumpStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgJumpStart.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgJumpStartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("JumpStart"))
              .build();
        }
      }
    }
    return getJumpStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgChangeModuleState,
      com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> getChangeModuleStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeModuleState",
      requestType = com.pstake.lscosmos.v1beta1.MsgChangeModuleState.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgChangeModuleState,
      com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> getChangeModuleStateMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgChangeModuleState, com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> getChangeModuleStateMethod;
    if ((getChangeModuleStateMethod = MsgGrpc.getChangeModuleStateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getChangeModuleStateMethod = MsgGrpc.getChangeModuleStateMethod) == null) {
          MsgGrpc.getChangeModuleStateMethod = getChangeModuleStateMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgChangeModuleState, com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeModuleState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgChangeModuleState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ChangeModuleState"))
              .build();
        }
      }
    }
    return getChangeModuleStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgReportSlashing,
      com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> getReportSlashingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportSlashing",
      requestType = com.pstake.lscosmos.v1beta1.MsgReportSlashing.class,
      responseType = com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgReportSlashing,
      com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> getReportSlashingMethod() {
    io.grpc.MethodDescriptor<com.pstake.lscosmos.v1beta1.MsgReportSlashing, com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> getReportSlashingMethod;
    if ((getReportSlashingMethod = MsgGrpc.getReportSlashingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReportSlashingMethod = MsgGrpc.getReportSlashingMethod) == null) {
          MsgGrpc.getReportSlashingMethod = getReportSlashingMethod =
              io.grpc.MethodDescriptor.<com.pstake.lscosmos.v1beta1.MsgReportSlashing, com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportSlashing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgReportSlashing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReportSlashing"))
              .build();
        }
      }
    }
    return getReportSlashingMethod;
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
   * Msg defines the lsCosmos services.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void liquidStake(com.pstake.lscosmos.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidStakeMethod(), responseObserver);
    }

    /**
     */
    default void liquidUnstake(com.pstake.lscosmos.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLiquidUnstakeMethod(), responseObserver);
    }

    /**
     */
    default void redeem(com.pstake.lscosmos.v1beta1.MsgRedeem request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRedeemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedeemMethod(), responseObserver);
    }

    /**
     */
    default void claim(com.pstake.lscosmos.v1beta1.MsgClaim request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     */
    default void recreateICA(com.pstake.lscosmos.v1beta1.MsgRecreateICA request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecreateICAMethod(), responseObserver);
    }

    /**
     */
    default void jumpStart(com.pstake.lscosmos.v1beta1.MsgJumpStart request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJumpStartMethod(), responseObserver);
    }

    /**
     */
    default void changeModuleState(com.pstake.lscosmos.v1beta1.MsgChangeModuleState request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeModuleStateMethod(), responseObserver);
    }

    /**
     */
    default void reportSlashing(com.pstake.lscosmos.v1beta1.MsgReportSlashing request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportSlashingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the lsCosmos services.
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
   * Msg defines the lsCosmos services.
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
    public void liquidStake(com.pstake.lscosmos.v1beta1.MsgLiquidStake request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void liquidUnstake(com.pstake.lscosmos.v1beta1.MsgLiquidUnstake request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeem(com.pstake.lscosmos.v1beta1.MsgRedeem request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRedeemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedeemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claim(com.pstake.lscosmos.v1beta1.MsgClaim request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recreateICA(com.pstake.lscosmos.v1beta1.MsgRecreateICA request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecreateICAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void jumpStart(com.pstake.lscosmos.v1beta1.MsgJumpStart request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJumpStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeModuleState(com.pstake.lscosmos.v1beta1.MsgChangeModuleState request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeModuleStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reportSlashing(com.pstake.lscosmos.v1beta1.MsgReportSlashing request,
        io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportSlashingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the lsCosmos services.
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
    public com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse liquidStake(com.pstake.lscosmos.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidStakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse liquidUnstake(com.pstake.lscosmos.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLiquidUnstakeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgRedeemResponse redeem(com.pstake.lscosmos.v1beta1.MsgRedeem request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedeemMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgClaimResponse claim(com.pstake.lscosmos.v1beta1.MsgClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse recreateICA(com.pstake.lscosmos.v1beta1.MsgRecreateICA request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecreateICAMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgJumpStartResponse jumpStart(com.pstake.lscosmos.v1beta1.MsgJumpStart request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJumpStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse changeModuleState(com.pstake.lscosmos.v1beta1.MsgChangeModuleState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeModuleStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse reportSlashing(com.pstake.lscosmos.v1beta1.MsgReportSlashing request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportSlashingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the lsCosmos services.
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
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse> liquidStake(
        com.pstake.lscosmos.v1beta1.MsgLiquidStake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidStakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse> liquidUnstake(
        com.pstake.lscosmos.v1beta1.MsgLiquidUnstake request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLiquidUnstakeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgRedeemResponse> redeem(
        com.pstake.lscosmos.v1beta1.MsgRedeem request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedeemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgClaimResponse> claim(
        com.pstake.lscosmos.v1beta1.MsgClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse> recreateICA(
        com.pstake.lscosmos.v1beta1.MsgRecreateICA request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecreateICAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgJumpStartResponse> jumpStart(
        com.pstake.lscosmos.v1beta1.MsgJumpStart request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJumpStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse> changeModuleState(
        com.pstake.lscosmos.v1beta1.MsgChangeModuleState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeModuleStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse> reportSlashing(
        com.pstake.lscosmos.v1beta1.MsgReportSlashing request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportSlashingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIQUID_STAKE = 0;
  private static final int METHODID_LIQUID_UNSTAKE = 1;
  private static final int METHODID_REDEEM = 2;
  private static final int METHODID_CLAIM = 3;
  private static final int METHODID_RECREATE_ICA = 4;
  private static final int METHODID_JUMP_START = 5;
  private static final int METHODID_CHANGE_MODULE_STATE = 6;
  private static final int METHODID_REPORT_SLASHING = 7;

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
        case METHODID_LIQUID_STAKE:
          serviceImpl.liquidStake((com.pstake.lscosmos.v1beta1.MsgLiquidStake) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse>) responseObserver);
          break;
        case METHODID_LIQUID_UNSTAKE:
          serviceImpl.liquidUnstake((com.pstake.lscosmos.v1beta1.MsgLiquidUnstake) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse>) responseObserver);
          break;
        case METHODID_REDEEM:
          serviceImpl.redeem((com.pstake.lscosmos.v1beta1.MsgRedeem) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRedeemResponse>) responseObserver);
          break;
        case METHODID_CLAIM:
          serviceImpl.claim((com.pstake.lscosmos.v1beta1.MsgClaim) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgClaimResponse>) responseObserver);
          break;
        case METHODID_RECREATE_ICA:
          serviceImpl.recreateICA((com.pstake.lscosmos.v1beta1.MsgRecreateICA) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse>) responseObserver);
          break;
        case METHODID_JUMP_START:
          serviceImpl.jumpStart((com.pstake.lscosmos.v1beta1.MsgJumpStart) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgJumpStartResponse>) responseObserver);
          break;
        case METHODID_CHANGE_MODULE_STATE:
          serviceImpl.changeModuleState((com.pstake.lscosmos.v1beta1.MsgChangeModuleState) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse>) responseObserver);
          break;
        case METHODID_REPORT_SLASHING:
          serviceImpl.reportSlashing((com.pstake.lscosmos.v1beta1.MsgReportSlashing) request,
              (io.grpc.stub.StreamObserver<com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse>) responseObserver);
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
          getLiquidStakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgLiquidStake,
              com.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse>(
                service, METHODID_LIQUID_STAKE)))
        .addMethod(
          getLiquidUnstakeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgLiquidUnstake,
              com.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse>(
                service, METHODID_LIQUID_UNSTAKE)))
        .addMethod(
          getRedeemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgRedeem,
              com.pstake.lscosmos.v1beta1.MsgRedeemResponse>(
                service, METHODID_REDEEM)))
        .addMethod(
          getClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgClaim,
              com.pstake.lscosmos.v1beta1.MsgClaimResponse>(
                service, METHODID_CLAIM)))
        .addMethod(
          getRecreateICAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgRecreateICA,
              com.pstake.lscosmos.v1beta1.MsgRecreateICAResponse>(
                service, METHODID_RECREATE_ICA)))
        .addMethod(
          getJumpStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgJumpStart,
              com.pstake.lscosmos.v1beta1.MsgJumpStartResponse>(
                service, METHODID_JUMP_START)))
        .addMethod(
          getChangeModuleStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgChangeModuleState,
              com.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse>(
                service, METHODID_CHANGE_MODULE_STATE)))
        .addMethod(
          getReportSlashingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pstake.lscosmos.v1beta1.MsgReportSlashing,
              com.pstake.lscosmos.v1beta1.MsgReportSlashingResponse>(
                service, METHODID_REPORT_SLASHING)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pstake.lscosmos.v1beta1.MsgsProto.getDescriptor();
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
              .addMethod(getLiquidStakeMethod())
              .addMethod(getLiquidUnstakeMethod())
              .addMethod(getRedeemMethod())
              .addMethod(getClaimMethod())
              .addMethod(getRecreateICAMethod())
              .addMethod(getJumpStartMethod())
              .addMethod(getChangeModuleStateMethod())
              .addMethod(getReportSlashingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
