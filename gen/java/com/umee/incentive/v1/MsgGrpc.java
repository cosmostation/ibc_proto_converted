package com.umee.incentive.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the x/incentive module's Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: umee/incentive/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "umee.incentive.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgClaim,
      com.umee.incentive.v1.MsgClaimResponse> getClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claim",
      requestType = com.umee.incentive.v1.MsgClaim.class,
      responseType = com.umee.incentive.v1.MsgClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgClaim,
      com.umee.incentive.v1.MsgClaimResponse> getClaimMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgClaim, com.umee.incentive.v1.MsgClaimResponse> getClaimMethod;
    if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClaimMethod = MsgGrpc.getClaimMethod) == null) {
          MsgGrpc.getClaimMethod = getClaimMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgClaim, com.umee.incentive.v1.MsgClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Claim"))
              .build();
        }
      }
    }
    return getClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBond,
      com.umee.incentive.v1.MsgBondResponse> getBondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bond",
      requestType = com.umee.incentive.v1.MsgBond.class,
      responseType = com.umee.incentive.v1.MsgBondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBond,
      com.umee.incentive.v1.MsgBondResponse> getBondMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBond, com.umee.incentive.v1.MsgBondResponse> getBondMethod;
    if ((getBondMethod = MsgGrpc.getBondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBondMethod = MsgGrpc.getBondMethod) == null) {
          MsgGrpc.getBondMethod = getBondMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgBond, com.umee.incentive.v1.MsgBondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgBond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgBondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Bond"))
              .build();
        }
      }
    }
    return getBondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBeginUnbonding,
      com.umee.incentive.v1.MsgBeginUnbondingResponse> getBeginUnbondingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginUnbonding",
      requestType = com.umee.incentive.v1.MsgBeginUnbonding.class,
      responseType = com.umee.incentive.v1.MsgBeginUnbondingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBeginUnbonding,
      com.umee.incentive.v1.MsgBeginUnbondingResponse> getBeginUnbondingMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgBeginUnbonding, com.umee.incentive.v1.MsgBeginUnbondingResponse> getBeginUnbondingMethod;
    if ((getBeginUnbondingMethod = MsgGrpc.getBeginUnbondingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBeginUnbondingMethod = MsgGrpc.getBeginUnbondingMethod) == null) {
          MsgGrpc.getBeginUnbondingMethod = getBeginUnbondingMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgBeginUnbonding, com.umee.incentive.v1.MsgBeginUnbondingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginUnbonding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgBeginUnbonding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgBeginUnbondingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BeginUnbonding"))
              .build();
        }
      }
    }
    return getBeginUnbondingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgEmergencyUnbond,
      com.umee.incentive.v1.MsgEmergencyUnbondResponse> getEmergencyUnbondMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmergencyUnbond",
      requestType = com.umee.incentive.v1.MsgEmergencyUnbond.class,
      responseType = com.umee.incentive.v1.MsgEmergencyUnbondResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgEmergencyUnbond,
      com.umee.incentive.v1.MsgEmergencyUnbondResponse> getEmergencyUnbondMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgEmergencyUnbond, com.umee.incentive.v1.MsgEmergencyUnbondResponse> getEmergencyUnbondMethod;
    if ((getEmergencyUnbondMethod = MsgGrpc.getEmergencyUnbondMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEmergencyUnbondMethod = MsgGrpc.getEmergencyUnbondMethod) == null) {
          MsgGrpc.getEmergencyUnbondMethod = getEmergencyUnbondMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgEmergencyUnbond, com.umee.incentive.v1.MsgEmergencyUnbondResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EmergencyUnbond"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgEmergencyUnbond.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgEmergencyUnbondResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EmergencyUnbond"))
              .build();
        }
      }
    }
    return getEmergencyUnbondMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgSponsor,
      com.umee.incentive.v1.MsgSponsorResponse> getSponsorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sponsor",
      requestType = com.umee.incentive.v1.MsgSponsor.class,
      responseType = com.umee.incentive.v1.MsgSponsorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgSponsor,
      com.umee.incentive.v1.MsgSponsorResponse> getSponsorMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgSponsor, com.umee.incentive.v1.MsgSponsorResponse> getSponsorMethod;
    if ((getSponsorMethod = MsgGrpc.getSponsorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSponsorMethod = MsgGrpc.getSponsorMethod) == null) {
          MsgGrpc.getSponsorMethod = getSponsorMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgSponsor, com.umee.incentive.v1.MsgSponsorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sponsor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgSponsor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgSponsorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Sponsor"))
              .build();
        }
      }
    }
    return getSponsorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovSetParams,
      com.umee.incentive.v1.MsgGovSetParamsResponse> getGovSetParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovSetParams",
      requestType = com.umee.incentive.v1.MsgGovSetParams.class,
      responseType = com.umee.incentive.v1.MsgGovSetParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovSetParams,
      com.umee.incentive.v1.MsgGovSetParamsResponse> getGovSetParamsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovSetParams, com.umee.incentive.v1.MsgGovSetParamsResponse> getGovSetParamsMethod;
    if ((getGovSetParamsMethod = MsgGrpc.getGovSetParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovSetParamsMethod = MsgGrpc.getGovSetParamsMethod) == null) {
          MsgGrpc.getGovSetParamsMethod = getGovSetParamsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgGovSetParams, com.umee.incentive.v1.MsgGovSetParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovSetParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgGovSetParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgGovSetParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovSetParams"))
              .build();
        }
      }
    }
    return getGovSetParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovCreatePrograms,
      com.umee.incentive.v1.MsgGovCreateProgramsResponse> getGovCreateProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovCreatePrograms",
      requestType = com.umee.incentive.v1.MsgGovCreatePrograms.class,
      responseType = com.umee.incentive.v1.MsgGovCreateProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovCreatePrograms,
      com.umee.incentive.v1.MsgGovCreateProgramsResponse> getGovCreateProgramsMethod() {
    io.grpc.MethodDescriptor<com.umee.incentive.v1.MsgGovCreatePrograms, com.umee.incentive.v1.MsgGovCreateProgramsResponse> getGovCreateProgramsMethod;
    if ((getGovCreateProgramsMethod = MsgGrpc.getGovCreateProgramsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovCreateProgramsMethod = MsgGrpc.getGovCreateProgramsMethod) == null) {
          MsgGrpc.getGovCreateProgramsMethod = getGovCreateProgramsMethod =
              io.grpc.MethodDescriptor.<com.umee.incentive.v1.MsgGovCreatePrograms, com.umee.incentive.v1.MsgGovCreateProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovCreatePrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgGovCreatePrograms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.umee.incentive.v1.MsgGovCreateProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovCreatePrograms"))
              .build();
        }
      }
    }
    return getGovCreateProgramsMethod;
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
   * Msg defines the x/incentive module's Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Claim defines a method for claiming any pending incentive rewards.
     * </pre>
     */
    default void claim(com.umee.incentive.v1.MsgClaim request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bond defines a method for bonding uToken collateral.
     * </pre>
     */
    default void bond(com.umee.incentive.v1.MsgBond request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondMethod(), responseObserver);
    }

    /**
     * <pre>
     * BeginUnbonding defines a method for starting to unbond uToken collateral.
     * Only max_unbondings unbondings can be active at per user, per denom, at once.
     * </pre>
     */
    default void beginUnbonding(com.umee.incentive.v1.MsgBeginUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBeginUnbondingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginUnbondingMethod(), responseObserver);
    }

    /**
     * <pre>
     * EmergencyUnbond defines a method for instantly unbonding uToken collateral in exchange for a fee.
     * This can finish existing unbondings or unbond bonded tokens, and is not restricted by max_unbondings.
     * </pre>
     */
    default void emergencyUnbond(com.umee.incentive.v1.MsgEmergencyUnbond request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgEmergencyUnbondResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEmergencyUnbondMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sponsor defines a permissionless method for sponsoring an upcoming, not yet funded incentive program.
     * The sponsor must be a single account and the MsgSponsor must fully cover the expected program rewards.
     * </pre>
     */
    default void sponsor(com.umee.incentive.v1.MsgSponsor request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgSponsorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSponsorMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovSetParams is used by governance proposals to update parameters.
     * </pre>
     */
    default void govSetParams(com.umee.incentive.v1.MsgGovSetParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovSetParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovSetParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovCreatePrograms is used by governance proposals to create and optionally fund incentive programs.
     * </pre>
     */
    default void govCreatePrograms(com.umee.incentive.v1.MsgGovCreatePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovCreateProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovCreateProgramsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the x/incentive module's Msg service.
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
   * Msg defines the x/incentive module's Msg service.
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
     * Claim defines a method for claiming any pending incentive rewards.
     * </pre>
     */
    public void claim(com.umee.incentive.v1.MsgClaim request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bond defines a method for bonding uToken collateral.
     * </pre>
     */
    public void bond(com.umee.incentive.v1.MsgBond request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BeginUnbonding defines a method for starting to unbond uToken collateral.
     * Only max_unbondings unbondings can be active at per user, per denom, at once.
     * </pre>
     */
    public void beginUnbonding(com.umee.incentive.v1.MsgBeginUnbonding request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBeginUnbondingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginUnbondingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EmergencyUnbond defines a method for instantly unbonding uToken collateral in exchange for a fee.
     * This can finish existing unbondings or unbond bonded tokens, and is not restricted by max_unbondings.
     * </pre>
     */
    public void emergencyUnbond(com.umee.incentive.v1.MsgEmergencyUnbond request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgEmergencyUnbondResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEmergencyUnbondMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sponsor defines a permissionless method for sponsoring an upcoming, not yet funded incentive program.
     * The sponsor must be a single account and the MsgSponsor must fully cover the expected program rewards.
     * </pre>
     */
    public void sponsor(com.umee.incentive.v1.MsgSponsor request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgSponsorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSponsorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovSetParams is used by governance proposals to update parameters.
     * </pre>
     */
    public void govSetParams(com.umee.incentive.v1.MsgGovSetParams request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovSetParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovSetParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovCreatePrograms is used by governance proposals to create and optionally fund incentive programs.
     * </pre>
     */
    public void govCreatePrograms(com.umee.incentive.v1.MsgGovCreatePrograms request,
        io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovCreateProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovCreateProgramsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the x/incentive module's Msg service.
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
     * Claim defines a method for claiming any pending incentive rewards.
     * </pre>
     */
    public com.umee.incentive.v1.MsgClaimResponse claim(com.umee.incentive.v1.MsgClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bond defines a method for bonding uToken collateral.
     * </pre>
     */
    public com.umee.incentive.v1.MsgBondResponse bond(com.umee.incentive.v1.MsgBond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BeginUnbonding defines a method for starting to unbond uToken collateral.
     * Only max_unbondings unbondings can be active at per user, per denom, at once.
     * </pre>
     */
    public com.umee.incentive.v1.MsgBeginUnbondingResponse beginUnbonding(com.umee.incentive.v1.MsgBeginUnbonding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginUnbondingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EmergencyUnbond defines a method for instantly unbonding uToken collateral in exchange for a fee.
     * This can finish existing unbondings or unbond bonded tokens, and is not restricted by max_unbondings.
     * </pre>
     */
    public com.umee.incentive.v1.MsgEmergencyUnbondResponse emergencyUnbond(com.umee.incentive.v1.MsgEmergencyUnbond request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEmergencyUnbondMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sponsor defines a permissionless method for sponsoring an upcoming, not yet funded incentive program.
     * The sponsor must be a single account and the MsgSponsor must fully cover the expected program rewards.
     * </pre>
     */
    public com.umee.incentive.v1.MsgSponsorResponse sponsor(com.umee.incentive.v1.MsgSponsor request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSponsorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovSetParams is used by governance proposals to update parameters.
     * </pre>
     */
    public com.umee.incentive.v1.MsgGovSetParamsResponse govSetParams(com.umee.incentive.v1.MsgGovSetParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovSetParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovCreatePrograms is used by governance proposals to create and optionally fund incentive programs.
     * </pre>
     */
    public com.umee.incentive.v1.MsgGovCreateProgramsResponse govCreatePrograms(com.umee.incentive.v1.MsgGovCreatePrograms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovCreateProgramsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the x/incentive module's Msg service.
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
     * Claim defines a method for claiming any pending incentive rewards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgClaimResponse> claim(
        com.umee.incentive.v1.MsgClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bond defines a method for bonding uToken collateral.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgBondResponse> bond(
        com.umee.incentive.v1.MsgBond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BeginUnbonding defines a method for starting to unbond uToken collateral.
     * Only max_unbondings unbondings can be active at per user, per denom, at once.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgBeginUnbondingResponse> beginUnbonding(
        com.umee.incentive.v1.MsgBeginUnbonding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginUnbondingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EmergencyUnbond defines a method for instantly unbonding uToken collateral in exchange for a fee.
     * This can finish existing unbondings or unbond bonded tokens, and is not restricted by max_unbondings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgEmergencyUnbondResponse> emergencyUnbond(
        com.umee.incentive.v1.MsgEmergencyUnbond request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEmergencyUnbondMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sponsor defines a permissionless method for sponsoring an upcoming, not yet funded incentive program.
     * The sponsor must be a single account and the MsgSponsor must fully cover the expected program rewards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgSponsorResponse> sponsor(
        com.umee.incentive.v1.MsgSponsor request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSponsorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovSetParams is used by governance proposals to update parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgGovSetParamsResponse> govSetParams(
        com.umee.incentive.v1.MsgGovSetParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovSetParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovCreatePrograms is used by governance proposals to create and optionally fund incentive programs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.umee.incentive.v1.MsgGovCreateProgramsResponse> govCreatePrograms(
        com.umee.incentive.v1.MsgGovCreatePrograms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovCreateProgramsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLAIM = 0;
  private static final int METHODID_BOND = 1;
  private static final int METHODID_BEGIN_UNBONDING = 2;
  private static final int METHODID_EMERGENCY_UNBOND = 3;
  private static final int METHODID_SPONSOR = 4;
  private static final int METHODID_GOV_SET_PARAMS = 5;
  private static final int METHODID_GOV_CREATE_PROGRAMS = 6;

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
        case METHODID_CLAIM:
          serviceImpl.claim((com.umee.incentive.v1.MsgClaim) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgClaimResponse>) responseObserver);
          break;
        case METHODID_BOND:
          serviceImpl.bond((com.umee.incentive.v1.MsgBond) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBondResponse>) responseObserver);
          break;
        case METHODID_BEGIN_UNBONDING:
          serviceImpl.beginUnbonding((com.umee.incentive.v1.MsgBeginUnbonding) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgBeginUnbondingResponse>) responseObserver);
          break;
        case METHODID_EMERGENCY_UNBOND:
          serviceImpl.emergencyUnbond((com.umee.incentive.v1.MsgEmergencyUnbond) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgEmergencyUnbondResponse>) responseObserver);
          break;
        case METHODID_SPONSOR:
          serviceImpl.sponsor((com.umee.incentive.v1.MsgSponsor) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgSponsorResponse>) responseObserver);
          break;
        case METHODID_GOV_SET_PARAMS:
          serviceImpl.govSetParams((com.umee.incentive.v1.MsgGovSetParams) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovSetParamsResponse>) responseObserver);
          break;
        case METHODID_GOV_CREATE_PROGRAMS:
          serviceImpl.govCreatePrograms((com.umee.incentive.v1.MsgGovCreatePrograms) request,
              (io.grpc.stub.StreamObserver<com.umee.incentive.v1.MsgGovCreateProgramsResponse>) responseObserver);
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
          getClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgClaim,
              com.umee.incentive.v1.MsgClaimResponse>(
                service, METHODID_CLAIM)))
        .addMethod(
          getBondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgBond,
              com.umee.incentive.v1.MsgBondResponse>(
                service, METHODID_BOND)))
        .addMethod(
          getBeginUnbondingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgBeginUnbonding,
              com.umee.incentive.v1.MsgBeginUnbondingResponse>(
                service, METHODID_BEGIN_UNBONDING)))
        .addMethod(
          getEmergencyUnbondMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgEmergencyUnbond,
              com.umee.incentive.v1.MsgEmergencyUnbondResponse>(
                service, METHODID_EMERGENCY_UNBOND)))
        .addMethod(
          getSponsorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgSponsor,
              com.umee.incentive.v1.MsgSponsorResponse>(
                service, METHODID_SPONSOR)))
        .addMethod(
          getGovSetParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgGovSetParams,
              com.umee.incentive.v1.MsgGovSetParamsResponse>(
                service, METHODID_GOV_SET_PARAMS)))
        .addMethod(
          getGovCreateProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.umee.incentive.v1.MsgGovCreatePrograms,
              com.umee.incentive.v1.MsgGovCreateProgramsResponse>(
                service, METHODID_GOV_CREATE_PROGRAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.umee.incentive.v1.TxProto.getDescriptor();
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
              .addMethod(getClaimMethod())
              .addMethod(getBondMethod())
              .addMethod(getBeginUnbondingMethod())
              .addMethod(getEmergencyUnbondMethod())
              .addMethod(getSponsorMethod())
              .addMethod(getGovSetParamsMethod())
              .addMethod(getGovCreateProgramsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
