package com.akash.deployment.v1beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the deployment Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: akash/deployment/v1beta3/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "akash.deployment.v1beta3.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> getCreateDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeployment",
      requestType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment.class,
      responseType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> getCreateDeploymentMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> getCreateDeploymentMethod;
    if ((getCreateDeploymentMethod = MsgGrpc.getCreateDeploymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDeploymentMethod = MsgGrpc.getCreateDeploymentMethod) == null) {
          MsgGrpc.getCreateDeploymentMethod = getCreateDeploymentMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDeployment"))
              .build();
        }
      }
    }
    return getCreateDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> getDepositDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositDeployment",
      requestType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment.class,
      responseType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> getDepositDeploymentMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> getDepositDeploymentMethod;
    if ((getDepositDeploymentMethod = MsgGrpc.getDepositDeploymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDepositDeploymentMethod = MsgGrpc.getDepositDeploymentMethod) == null) {
          MsgGrpc.getDepositDeploymentMethod = getDepositDeploymentMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DepositDeployment"))
              .build();
        }
      }
    }
    return getDepositDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> getUpdateDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDeployment",
      requestType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment.class,
      responseType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> getUpdateDeploymentMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> getUpdateDeploymentMethod;
    if ((getUpdateDeploymentMethod = MsgGrpc.getUpdateDeploymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateDeploymentMethod = MsgGrpc.getUpdateDeploymentMethod) == null) {
          MsgGrpc.getUpdateDeploymentMethod = getUpdateDeploymentMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateDeployment"))
              .build();
        }
      }
    }
    return getUpdateDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> getCloseDeploymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseDeployment",
      requestType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment.class,
      responseType = com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment,
      com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> getCloseDeploymentMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> getCloseDeploymentMethod;
    if ((getCloseDeploymentMethod = MsgGrpc.getCloseDeploymentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseDeploymentMethod = MsgGrpc.getCloseDeploymentMethod) == null) {
          MsgGrpc.getCloseDeploymentMethod = getCloseDeploymentMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment, com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseDeployment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseDeployment"))
              .build();
        }
      }
    }
    return getCloseDeploymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> getCloseGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseGroup",
      requestType = com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup.class,
      responseType = com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> getCloseGroupMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> getCloseGroupMethod;
    if ((getCloseGroupMethod = MsgGrpc.getCloseGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseGroupMethod = MsgGrpc.getCloseGroupMethod) == null) {
          MsgGrpc.getCloseGroupMethod = getCloseGroupMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseGroup"))
              .build();
        }
      }
    }
    return getCloseGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> getPauseGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseGroup",
      requestType = com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup.class,
      responseType = com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> getPauseGroupMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> getPauseGroupMethod;
    if ((getPauseGroupMethod = MsgGrpc.getPauseGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseGroupMethod = MsgGrpc.getPauseGroupMethod) == null) {
          MsgGrpc.getPauseGroupMethod = getPauseGroupMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseGroup"))
              .build();
        }
      }
    }
    return getPauseGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> getStartGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGroup",
      requestType = com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup.class,
      responseType = com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup,
      com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> getStartGroupMethod() {
    io.grpc.MethodDescriptor<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> getStartGroupMethod;
    if ((getStartGroupMethod = MsgGrpc.getStartGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStartGroupMethod = MsgGrpc.getStartGroupMethod) == null) {
          MsgGrpc.getStartGroupMethod = getStartGroupMethod =
              io.grpc.MethodDescriptor.<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup, com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StartGroup"))
              .build();
        }
      }
    }
    return getStartGroupMethod;
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
   * Msg defines the deployment Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDeployment defines a method to create new deployment given proper inputs.
     * </pre>
     */
    default void createDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositDeployment deposits more funds into the deployment account
     * </pre>
     */
    default void depositDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDeployment defines a method to update a deployment given proper inputs.
     * </pre>
     */
    default void updateDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseDeployment defines a method to close a deployment given proper inputs.
     * </pre>
     */
    default void closeDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseDeploymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    default void closeGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * PauseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    default void pauseGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    default void startGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the deployment Msg service.
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
   * Msg defines the deployment Msg service.
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
     * CreateDeployment defines a method to create new deployment given proper inputs.
     * </pre>
     */
    public void createDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositDeployment deposits more funds into the deployment account
     * </pre>
     */
    public void depositDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDeployment defines a method to update a deployment given proper inputs.
     * </pre>
     */
    public void updateDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseDeployment defines a method to close a deployment given proper inputs.
     * </pre>
     */
    public void closeDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseDeploymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public void closeGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PauseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public void pauseGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public void startGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup request,
        io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the deployment Msg service.
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
     * CreateDeployment defines a method to create new deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse createDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositDeployment deposits more funds into the deployment account
     * </pre>
     */
    public com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse depositDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDeployment defines a method to update a deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse updateDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseDeployment defines a method to close a deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse closeDeployment(com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseDeploymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse closeGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PauseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse pauseGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse startGroup(com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the deployment Msg service.
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
     * CreateDeployment defines a method to create new deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse> createDeployment(
        com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositDeployment deposits more funds into the deployment account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse> depositDeployment(
        com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDeployment defines a method to update a deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse> updateDeployment(
        com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseDeployment defines a method to close a deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse> closeDeployment(
        com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseDeploymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse> closeGroup(
        com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PauseGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse> pauseGroup(
        com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartGroup defines a method to close a group of a deployment given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse> startGroup(
        com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEPLOYMENT = 0;
  private static final int METHODID_DEPOSIT_DEPLOYMENT = 1;
  private static final int METHODID_UPDATE_DEPLOYMENT = 2;
  private static final int METHODID_CLOSE_DEPLOYMENT = 3;
  private static final int METHODID_CLOSE_GROUP = 4;
  private static final int METHODID_PAUSE_GROUP = 5;
  private static final int METHODID_START_GROUP = 6;

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
        case METHODID_CREATE_DEPLOYMENT:
          serviceImpl.createDeployment((com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_DEPLOYMENT:
          serviceImpl.depositDeployment((com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEPLOYMENT:
          serviceImpl.updateDeployment((com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse>) responseObserver);
          break;
        case METHODID_CLOSE_DEPLOYMENT:
          serviceImpl.closeDeployment((com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse>) responseObserver);
          break;
        case METHODID_CLOSE_GROUP:
          serviceImpl.closeGroup((com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse>) responseObserver);
          break;
        case METHODID_PAUSE_GROUP:
          serviceImpl.pauseGroup((com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse>) responseObserver);
          break;
        case METHODID_START_GROUP:
          serviceImpl.startGroup((com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup) request,
              (io.grpc.stub.StreamObserver<com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse>) responseObserver);
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
          getCreateDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeployment,
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCreateDeploymentResponse>(
                service, METHODID_CREATE_DEPLOYMENT)))
        .addMethod(
          getDepositDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeployment,
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgDepositDeploymentResponse>(
                service, METHODID_DEPOSIT_DEPLOYMENT)))
        .addMethod(
          getUpdateDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeployment,
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgUpdateDeploymentResponse>(
                service, METHODID_UPDATE_DEPLOYMENT)))
        .addMethod(
          getCloseDeploymentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeployment,
              com.akash.deployment.v1beta3.DeploymentmsgProto.MsgCloseDeploymentResponse>(
                service, METHODID_CLOSE_DEPLOYMENT)))
        .addMethod(
          getCloseGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroup,
              com.akash.deployment.v1beta3.GroupmsgProto.MsgCloseGroupResponse>(
                service, METHODID_CLOSE_GROUP)))
        .addMethod(
          getPauseGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroup,
              com.akash.deployment.v1beta3.GroupmsgProto.MsgPauseGroupResponse>(
                service, METHODID_PAUSE_GROUP)))
        .addMethod(
          getStartGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroup,
              com.akash.deployment.v1beta3.GroupmsgProto.MsgStartGroupResponse>(
                service, METHODID_START_GROUP)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.deployment.v1beta3.ServiceProto.getDescriptor();
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
              .addMethod(getCreateDeploymentMethod())
              .addMethod(getDepositDeploymentMethod())
              .addMethod(getUpdateDeploymentMethod())
              .addMethod(getCloseDeploymentMethod())
              .addMethod(getCloseGroupMethod())
              .addMethod(getPauseGroupMethod())
              .addMethod(getStartGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
