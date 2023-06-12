package com.stafihub.stafihub.rstaking;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/rstaking/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rstaking.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgSetInflationBase,
      com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> getSetInflationBaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInflationBase",
      requestType = com.stafihub.stafihub.rstaking.MsgSetInflationBase.class,
      responseType = com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgSetInflationBase,
      com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> getSetInflationBaseMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgSetInflationBase, com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> getSetInflationBaseMethod;
    if ((getSetInflationBaseMethod = MsgGrpc.getSetInflationBaseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetInflationBaseMethod = MsgGrpc.getSetInflationBaseMethod) == null) {
          MsgGrpc.getSetInflationBaseMethod = getSetInflationBaseMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgSetInflationBase, com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInflationBase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgSetInflationBase.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetInflationBase"))
              .build();
        }
      }
    }
    return getSetInflationBaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddValToWhitelist,
      com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValToWhitelist",
      requestType = com.stafihub.stafihub.rstaking.MsgAddValToWhitelist.class,
      responseType = com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddValToWhitelist,
      com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddValToWhitelist, com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> getAddValToWhitelistMethod;
    if ((getAddValToWhitelistMethod = MsgGrpc.getAddValToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddValToWhitelistMethod = MsgGrpc.getAddValToWhitelistMethod) == null) {
          MsgGrpc.getAddValToWhitelistMethod = getAddValToWhitelistMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgAddValToWhitelist, com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgAddValToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddValToWhitelist"))
              .build();
        }
      }
    }
    return getAddValToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch,
      com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleValidatorWhitelistSwitch",
      requestType = com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch.class,
      responseType = com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch,
      com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch, com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> getToggleValidatorWhitelistSwitchMethod;
    if ((getToggleValidatorWhitelistSwitchMethod = MsgGrpc.getToggleValidatorWhitelistSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleValidatorWhitelistSwitchMethod = MsgGrpc.getToggleValidatorWhitelistSwitchMethod) == null) {
          MsgGrpc.getToggleValidatorWhitelistSwitchMethod = getToggleValidatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch, com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleValidatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleValidatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getToggleValidatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgWithdraw,
      com.stafihub.stafihub.rstaking.MsgWithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = com.stafihub.stafihub.rstaking.MsgWithdraw.class,
      responseType = com.stafihub.stafihub.rstaking.MsgWithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgWithdraw,
      com.stafihub.stafihub.rstaking.MsgWithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgWithdraw, com.stafihub.stafihub.rstaking.MsgWithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawMethod = MsgGrpc.getWithdrawMethod) == null) {
          MsgGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgWithdraw, com.stafihub.stafihub.rstaking.MsgWithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgWithdraw.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgWithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist,
      com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddDelegatorToWhitelist",
      requestType = com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist.class,
      responseType = com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist,
      com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist, com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> getAddDelegatorToWhitelistMethod;
    if ((getAddDelegatorToWhitelistMethod = MsgGrpc.getAddDelegatorToWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddDelegatorToWhitelistMethod = MsgGrpc.getAddDelegatorToWhitelistMethod) == null) {
          MsgGrpc.getAddDelegatorToWhitelistMethod = getAddDelegatorToWhitelistMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist, com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddDelegatorToWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddDelegatorToWhitelist"))
              .build();
        }
      }
    }
    return getAddDelegatorToWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch,
      com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ToggleDelegatorWhitelistSwitch",
      requestType = com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch.class,
      responseType = com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch,
      com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch, com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> getToggleDelegatorWhitelistSwitchMethod;
    if ((getToggleDelegatorWhitelistSwitchMethod = MsgGrpc.getToggleDelegatorWhitelistSwitchMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getToggleDelegatorWhitelistSwitchMethod = MsgGrpc.getToggleDelegatorWhitelistSwitchMethod) == null) {
          MsgGrpc.getToggleDelegatorWhitelistSwitchMethod = getToggleDelegatorWhitelistSwitchMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch, com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ToggleDelegatorWhitelistSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ToggleDelegatorWhitelistSwitch"))
              .build();
        }
      }
    }
    return getToggleDelegatorWhitelistSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgProvideToken,
      com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> getProvideTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideToken",
      requestType = com.stafihub.stafihub.rstaking.MsgProvideToken.class,
      responseType = com.stafihub.stafihub.rstaking.MsgProvideTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgProvideToken,
      com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> getProvideTokenMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgProvideToken, com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> getProvideTokenMethod;
    if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getProvideTokenMethod = MsgGrpc.getProvideTokenMethod) == null) {
          MsgGrpc.getProvideTokenMethod = getProvideTokenMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgProvideToken, com.stafihub.stafihub.rstaking.MsgProvideTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgProvideToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgProvideTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ProvideToken"))
              .build();
        }
      }
    }
    return getProvideTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist,
      com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RmDelegatorFromWhitelist",
      requestType = com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist.class,
      responseType = com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist,
      com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist, com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> getRmDelegatorFromWhitelistMethod;
    if ((getRmDelegatorFromWhitelistMethod = MsgGrpc.getRmDelegatorFromWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRmDelegatorFromWhitelistMethod = MsgGrpc.getRmDelegatorFromWhitelistMethod) == null) {
          MsgGrpc.getRmDelegatorFromWhitelistMethod = getRmDelegatorFromWhitelistMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist, com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RmDelegatorFromWhitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RmDelegatorFromWhitelist"))
              .build();
        }
      }
    }
    return getRmDelegatorFromWhitelistMethod;
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
    default void setInflationBase(com.stafihub.stafihub.rstaking.MsgSetInflationBase request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInflationBaseMethod(), responseObserver);
    }

    /**
     */
    default void addValToWhitelist(com.stafihub.stafihub.rstaking.MsgAddValToWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddValToWhitelistMethod(), responseObserver);
    }

    /**
     */
    default void toggleValidatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleValidatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     */
    default void withdraw(com.stafihub.stafihub.rstaking.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    default void addDelegatorToWhitelist(com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddDelegatorToWhitelistMethod(), responseObserver);
    }

    /**
     */
    default void toggleDelegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleDelegatorWhitelistSwitchMethod(), responseObserver);
    }

    /**
     */
    default void provideToken(com.stafihub.stafihub.rstaking.MsgProvideToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void rmDelegatorFromWhitelist(com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRmDelegatorFromWhitelistMethod(), responseObserver);
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
    public void setInflationBase(com.stafihub.stafihub.rstaking.MsgSetInflationBase request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInflationBaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addValToWhitelist(com.stafihub.stafihub.rstaking.MsgAddValToWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddValToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleValidatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleValidatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(com.stafihub.stafihub.rstaking.MsgWithdraw request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgWithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDelegatorToWhitelist(com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddDelegatorToWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void toggleDelegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleDelegatorWhitelistSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void provideToken(com.stafihub.stafihub.rstaking.MsgProvideToken request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void rmDelegatorFromWhitelist(com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRmDelegatorFromWhitelistMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse setInflationBase(com.stafihub.stafihub.rstaking.MsgSetInflationBase request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInflationBaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse addValToWhitelist(com.stafihub.stafihub.rstaking.MsgAddValToWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddValToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse toggleValidatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleValidatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgWithdrawResponse withdraw(com.stafihub.stafihub.rstaking.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse addDelegatorToWhitelist(com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddDelegatorToWhitelistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse toggleDelegatorWhitelistSwitch(com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleDelegatorWhitelistSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stafihub.stafihub.rstaking.MsgProvideTokenResponse provideToken(com.stafihub.stafihub.rstaking.MsgProvideToken request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse rmDelegatorFromWhitelist(com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRmDelegatorFromWhitelistMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse> setInflationBase(
        com.stafihub.stafihub.rstaking.MsgSetInflationBase request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInflationBaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse> addValToWhitelist(
        com.stafihub.stafihub.rstaking.MsgAddValToWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddValToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse> toggleValidatorWhitelistSwitch(
        com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleValidatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgWithdrawResponse> withdraw(
        com.stafihub.stafihub.rstaking.MsgWithdraw request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse> addDelegatorToWhitelist(
        com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddDelegatorToWhitelistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse> toggleDelegatorWhitelistSwitch(
        com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleDelegatorWhitelistSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgProvideTokenResponse> provideToken(
        com.stafihub.stafihub.rstaking.MsgProvideToken request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse> rmDelegatorFromWhitelist(
        com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRmDelegatorFromWhitelistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_INFLATION_BASE = 0;
  private static final int METHODID_ADD_VAL_TO_WHITELIST = 1;
  private static final int METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH = 2;
  private static final int METHODID_WITHDRAW = 3;
  private static final int METHODID_ADD_DELEGATOR_TO_WHITELIST = 4;
  private static final int METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH = 5;
  private static final int METHODID_PROVIDE_TOKEN = 6;
  private static final int METHODID_RM_DELEGATOR_FROM_WHITELIST = 7;

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
        case METHODID_SET_INFLATION_BASE:
          serviceImpl.setInflationBase((com.stafihub.stafihub.rstaking.MsgSetInflationBase) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse>) responseObserver);
          break;
        case METHODID_ADD_VAL_TO_WHITELIST:
          serviceImpl.addValToWhitelist((com.stafihub.stafihub.rstaking.MsgAddValToWhitelist) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH:
          serviceImpl.toggleValidatorWhitelistSwitch((com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((com.stafihub.stafihub.rstaking.MsgWithdraw) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgWithdrawResponse>) responseObserver);
          break;
        case METHODID_ADD_DELEGATOR_TO_WHITELIST:
          serviceImpl.addDelegatorToWhitelist((com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse>) responseObserver);
          break;
        case METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH:
          serviceImpl.toggleDelegatorWhitelistSwitch((com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_TOKEN:
          serviceImpl.provideToken((com.stafihub.stafihub.rstaking.MsgProvideToken) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgProvideTokenResponse>) responseObserver);
          break;
        case METHODID_RM_DELEGATOR_FROM_WHITELIST:
          serviceImpl.rmDelegatorFromWhitelist((com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse>) responseObserver);
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
          getSetInflationBaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgSetInflationBase,
              com.stafihub.stafihub.rstaking.MsgSetInflationBaseResponse>(
                service, METHODID_SET_INFLATION_BASE)))
        .addMethod(
          getAddValToWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgAddValToWhitelist,
              com.stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse>(
                service, METHODID_ADD_VAL_TO_WHITELIST)))
        .addMethod(
          getToggleValidatorWhitelistSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch,
              com.stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse>(
                service, METHODID_TOGGLE_VALIDATOR_WHITELIST_SWITCH)))
        .addMethod(
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgWithdraw,
              com.stafihub.stafihub.rstaking.MsgWithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .addMethod(
          getAddDelegatorToWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist,
              com.stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse>(
                service, METHODID_ADD_DELEGATOR_TO_WHITELIST)))
        .addMethod(
          getToggleDelegatorWhitelistSwitchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch,
              com.stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse>(
                service, METHODID_TOGGLE_DELEGATOR_WHITELIST_SWITCH)))
        .addMethod(
          getProvideTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgProvideToken,
              com.stafihub.stafihub.rstaking.MsgProvideTokenResponse>(
                service, METHODID_PROVIDE_TOKEN)))
        .addMethod(
          getRmDelegatorFromWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist,
              com.stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse>(
                service, METHODID_RM_DELEGATOR_FROM_WHITELIST)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rstaking.TxProto.getDescriptor();
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
              .addMethod(getSetInflationBaseMethod())
              .addMethod(getAddValToWhitelistMethod())
              .addMethod(getToggleValidatorWhitelistSwitchMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getAddDelegatorToWhitelistMethod())
              .addMethod(getToggleDelegatorWhitelistSwitchMethod())
              .addMethod(getProvideTokenMethod())
              .addMethod(getRmDelegatorFromWhitelistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
