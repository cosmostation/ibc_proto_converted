package com.crescent.lpfarm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: crescent/lpfarm/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "crescent.lpfarm.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan,
      com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> getCreatePrivatePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePrivatePlan",
      requestType = com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.class,
      responseType = com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan,
      com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> getCreatePrivatePlanMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan, com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> getCreatePrivatePlanMethod;
    if ((getCreatePrivatePlanMethod = MsgGrpc.getCreatePrivatePlanMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePrivatePlanMethod = MsgGrpc.getCreatePrivatePlanMethod) == null) {
          MsgGrpc.getCreatePrivatePlanMethod = getCreatePrivatePlanMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan, com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePrivatePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePrivatePlan"))
              .build();
        }
      }
    }
    return getCreatePrivatePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgFarm,
      com.crescent.lpfarm.v1beta1.MsgFarmResponse> getFarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Farm",
      requestType = com.crescent.lpfarm.v1beta1.MsgFarm.class,
      responseType = com.crescent.lpfarm.v1beta1.MsgFarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgFarm,
      com.crescent.lpfarm.v1beta1.MsgFarmResponse> getFarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgFarm, com.crescent.lpfarm.v1beta1.MsgFarmResponse> getFarmMethod;
    if ((getFarmMethod = MsgGrpc.getFarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFarmMethod = MsgGrpc.getFarmMethod) == null) {
          MsgGrpc.getFarmMethod = getFarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.MsgFarm, com.crescent.lpfarm.v1beta1.MsgFarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Farm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgFarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgFarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Farm"))
              .build();
        }
      }
    }
    return getFarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgUnfarm,
      com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> getUnfarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unfarm",
      requestType = com.crescent.lpfarm.v1beta1.MsgUnfarm.class,
      responseType = com.crescent.lpfarm.v1beta1.MsgUnfarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgUnfarm,
      com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> getUnfarmMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgUnfarm, com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> getUnfarmMethod;
    if ((getUnfarmMethod = MsgGrpc.getUnfarmMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnfarmMethod = MsgGrpc.getUnfarmMethod) == null) {
          MsgGrpc.getUnfarmMethod = getUnfarmMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.MsgUnfarm, com.crescent.lpfarm.v1beta1.MsgUnfarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unfarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgUnfarm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgUnfarmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Unfarm"))
              .build();
        }
      }
    }
    return getUnfarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgHarvest,
      com.crescent.lpfarm.v1beta1.MsgHarvestResponse> getHarvestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Harvest",
      requestType = com.crescent.lpfarm.v1beta1.MsgHarvest.class,
      responseType = com.crescent.lpfarm.v1beta1.MsgHarvestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgHarvest,
      com.crescent.lpfarm.v1beta1.MsgHarvestResponse> getHarvestMethod() {
    io.grpc.MethodDescriptor<com.crescent.lpfarm.v1beta1.MsgHarvest, com.crescent.lpfarm.v1beta1.MsgHarvestResponse> getHarvestMethod;
    if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getHarvestMethod = MsgGrpc.getHarvestMethod) == null) {
          MsgGrpc.getHarvestMethod = getHarvestMethod =
              io.grpc.MethodDescriptor.<com.crescent.lpfarm.v1beta1.MsgHarvest, com.crescent.lpfarm.v1beta1.MsgHarvestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Harvest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgHarvest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.lpfarm.v1beta1.MsgHarvestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Harvest"))
              .build();
        }
      }
    }
    return getHarvestMethod;
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
    default void createPrivatePlan(com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePrivatePlanMethod(), responseObserver);
    }

    /**
     */
    default void farm(com.crescent.lpfarm.v1beta1.MsgFarm request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgFarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFarmMethod(), responseObserver);
    }

    /**
     */
    default void unfarm(com.crescent.lpfarm.v1beta1.MsgUnfarm request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnfarmMethod(), responseObserver);
    }

    /**
     */
    default void harvest(com.crescent.lpfarm.v1beta1.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHarvestMethod(), responseObserver);
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
    public void createPrivatePlan(com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePrivatePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void farm(com.crescent.lpfarm.v1beta1.MsgFarm request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgFarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfarm(com.crescent.lpfarm.v1beta1.MsgUnfarm request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnfarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void harvest(com.crescent.lpfarm.v1beta1.MsgHarvest request,
        io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgHarvestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request, responseObserver);
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
    public com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse createPrivatePlan(com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePrivatePlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.MsgFarmResponse farm(com.crescent.lpfarm.v1beta1.MsgFarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.MsgUnfarmResponse unfarm(com.crescent.lpfarm.v1beta1.MsgUnfarm request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnfarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.crescent.lpfarm.v1beta1.MsgHarvestResponse harvest(com.crescent.lpfarm.v1beta1.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHarvestMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse> createPrivatePlan(
        com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePrivatePlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.MsgFarmResponse> farm(
        com.crescent.lpfarm.v1beta1.MsgFarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.MsgUnfarmResponse> unfarm(
        com.crescent.lpfarm.v1beta1.MsgUnfarm request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnfarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.lpfarm.v1beta1.MsgHarvestResponse> harvest(
        com.crescent.lpfarm.v1beta1.MsgHarvest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHarvestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRIVATE_PLAN = 0;
  private static final int METHODID_FARM = 1;
  private static final int METHODID_UNFARM = 2;
  private static final int METHODID_HARVEST = 3;

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
        case METHODID_CREATE_PRIVATE_PLAN:
          serviceImpl.createPrivatePlan((com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse>) responseObserver);
          break;
        case METHODID_FARM:
          serviceImpl.farm((com.crescent.lpfarm.v1beta1.MsgFarm) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgFarmResponse>) responseObserver);
          break;
        case METHODID_UNFARM:
          serviceImpl.unfarm((com.crescent.lpfarm.v1beta1.MsgUnfarm) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgUnfarmResponse>) responseObserver);
          break;
        case METHODID_HARVEST:
          serviceImpl.harvest((com.crescent.lpfarm.v1beta1.MsgHarvest) request,
              (io.grpc.stub.StreamObserver<com.crescent.lpfarm.v1beta1.MsgHarvestResponse>) responseObserver);
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
          getCreatePrivatePlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan,
              com.crescent.lpfarm.v1beta1.MsgCreatePrivatePlanResponse>(
                service, METHODID_CREATE_PRIVATE_PLAN)))
        .addMethod(
          getFarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.MsgFarm,
              com.crescent.lpfarm.v1beta1.MsgFarmResponse>(
                service, METHODID_FARM)))
        .addMethod(
          getUnfarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.MsgUnfarm,
              com.crescent.lpfarm.v1beta1.MsgUnfarmResponse>(
                service, METHODID_UNFARM)))
        .addMethod(
          getHarvestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.lpfarm.v1beta1.MsgHarvest,
              com.crescent.lpfarm.v1beta1.MsgHarvestResponse>(
                service, METHODID_HARVEST)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.lpfarm.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreatePrivatePlanMethod())
              .addMethod(getFarmMethod())
              .addMethod(getUnfarmMethod())
              .addMethod(getHarvestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
