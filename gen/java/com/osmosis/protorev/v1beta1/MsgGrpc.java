package com.osmosis.protorev.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/protorev/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "osmosis.protorev.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetHotRoutes,
      com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> getSetHotRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetHotRoutes",
      requestType = com.osmosis.protorev.v1beta1.MsgSetHotRoutes.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetHotRoutes,
      com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> getSetHotRoutesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetHotRoutes, com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> getSetHotRoutesMethod;
    if ((getSetHotRoutesMethod = MsgGrpc.getSetHotRoutesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetHotRoutesMethod = MsgGrpc.getSetHotRoutesMethod) == null) {
          MsgGrpc.getSetHotRoutesMethod = getSetHotRoutesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetHotRoutes, com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetHotRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetHotRoutes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetHotRoutes"))
              .build();
        }
      }
    }
    return getSetHotRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount,
      com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> getSetDeveloperAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDeveloperAccount",
      requestType = com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount,
      com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> getSetDeveloperAccountMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount, com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> getSetDeveloperAccountMethod;
    if ((getSetDeveloperAccountMethod = MsgGrpc.getSetDeveloperAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetDeveloperAccountMethod = MsgGrpc.getSetDeveloperAccountMethod) == null) {
          MsgGrpc.getSetDeveloperAccountMethod = getSetDeveloperAccountMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount, com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDeveloperAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetDeveloperAccount"))
              .build();
        }
      }
    }
    return getSetDeveloperAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx,
      com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> getSetMaxPoolPointsPerTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxPoolPointsPerTx",
      requestType = com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx,
      com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> getSetMaxPoolPointsPerTxMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx, com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> getSetMaxPoolPointsPerTxMethod;
    if ((getSetMaxPoolPointsPerTxMethod = MsgGrpc.getSetMaxPoolPointsPerTxMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxPoolPointsPerTxMethod = MsgGrpc.getSetMaxPoolPointsPerTxMethod) == null) {
          MsgGrpc.getSetMaxPoolPointsPerTxMethod = getSetMaxPoolPointsPerTxMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx, com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxPoolPointsPerTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxPoolPointsPerTx"))
              .build();
        }
      }
    }
    return getSetMaxPoolPointsPerTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock,
      com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> getSetMaxPoolPointsPerBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaxPoolPointsPerBlock",
      requestType = com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock,
      com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> getSetMaxPoolPointsPerBlockMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock, com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> getSetMaxPoolPointsPerBlockMethod;
    if ((getSetMaxPoolPointsPerBlockMethod = MsgGrpc.getSetMaxPoolPointsPerBlockMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetMaxPoolPointsPerBlockMethod = MsgGrpc.getSetMaxPoolPointsPerBlockMethod) == null) {
          MsgGrpc.getSetMaxPoolPointsPerBlockMethod = getSetMaxPoolPointsPerBlockMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock, com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaxPoolPointsPerBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetMaxPoolPointsPerBlock"))
              .build();
        }
      }
    }
    return getSetMaxPoolPointsPerBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetPoolWeights,
      com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> getSetPoolWeightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPoolWeights",
      requestType = com.osmosis.protorev.v1beta1.MsgSetPoolWeights.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetPoolWeights,
      com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> getSetPoolWeightsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetPoolWeights, com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> getSetPoolWeightsMethod;
    if ((getSetPoolWeightsMethod = MsgGrpc.getSetPoolWeightsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetPoolWeightsMethod = MsgGrpc.getSetPoolWeightsMethod) == null) {
          MsgGrpc.getSetPoolWeightsMethod = getSetPoolWeightsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetPoolWeights, com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPoolWeights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetPoolWeights.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetPoolWeights"))
              .build();
        }
      }
    }
    return getSetPoolWeightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetBaseDenoms,
      com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> getSetBaseDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetBaseDenoms",
      requestType = com.osmosis.protorev.v1beta1.MsgSetBaseDenoms.class,
      responseType = com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetBaseDenoms,
      com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> getSetBaseDenomsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.protorev.v1beta1.MsgSetBaseDenoms, com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> getSetBaseDenomsMethod;
    if ((getSetBaseDenomsMethod = MsgGrpc.getSetBaseDenomsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetBaseDenomsMethod = MsgGrpc.getSetBaseDenomsMethod) == null) {
          MsgGrpc.getSetBaseDenomsMethod = getSetBaseDenomsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.protorev.v1beta1.MsgSetBaseDenoms, com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetBaseDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetBaseDenoms.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetBaseDenoms"))
              .build();
        }
      }
    }
    return getSetBaseDenomsMethod;
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
     * SetHotRoutes sets the hot routes that will be explored when creating
     * cyclic arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    default void setHotRoutes(com.osmosis.protorev.v1beta1.MsgSetHotRoutes request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetHotRoutesMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetDeveloperAccount sets the account that can withdraw a portion of the
     * profits from the protorev module. This will be Skip's address.
     * </pre>
     */
    default void setDeveloperAccount(com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDeveloperAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
     * consumed per transaction. Can only be called by the admin account.
     * </pre>
     */
    default void setMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxPoolPointsPerTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
     * consumed per block. Can only be called by the admin account.
     * </pre>
     */
    default void setMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaxPoolPointsPerBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetPoolWeights sets the weights of each pool type in the store. Can only be
     * called by the admin account.
     * </pre>
     */
    default void setPoolWeights(com.osmosis.protorev.v1beta1.MsgSetPoolWeights request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPoolWeightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetBaseDenoms sets the base denoms that will be used to create cyclic
     * arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    default void setBaseDenoms(com.osmosis.protorev.v1beta1.MsgSetBaseDenoms request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetBaseDenomsMethod(), responseObserver);
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
     * SetHotRoutes sets the hot routes that will be explored when creating
     * cyclic arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public void setHotRoutes(com.osmosis.protorev.v1beta1.MsgSetHotRoutes request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetHotRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetDeveloperAccount sets the account that can withdraw a portion of the
     * profits from the protorev module. This will be Skip's address.
     * </pre>
     */
    public void setDeveloperAccount(com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDeveloperAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
     * consumed per transaction. Can only be called by the admin account.
     * </pre>
     */
    public void setMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxPoolPointsPerTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
     * consumed per block. Can only be called by the admin account.
     * </pre>
     */
    public void setMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaxPoolPointsPerBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetPoolWeights sets the weights of each pool type in the store. Can only be
     * called by the admin account.
     * </pre>
     */
    public void setPoolWeights(com.osmosis.protorev.v1beta1.MsgSetPoolWeights request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPoolWeightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetBaseDenoms sets the base denoms that will be used to create cyclic
     * arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public void setBaseDenoms(com.osmosis.protorev.v1beta1.MsgSetBaseDenoms request,
        io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetBaseDenomsMethod(), getCallOptions()), request, responseObserver);
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
     * SetHotRoutes sets the hot routes that will be explored when creating
     * cyclic arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse setHotRoutes(com.osmosis.protorev.v1beta1.MsgSetHotRoutes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetHotRoutesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetDeveloperAccount sets the account that can withdraw a portion of the
     * profits from the protorev module. This will be Skip's address.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse setDeveloperAccount(com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDeveloperAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
     * consumed per transaction. Can only be called by the admin account.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse setMaxPoolPointsPerTx(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxPoolPointsPerTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
     * consumed per block. Can only be called by the admin account.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse setMaxPoolPointsPerBlock(com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaxPoolPointsPerBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetPoolWeights sets the weights of each pool type in the store. Can only be
     * called by the admin account.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse setPoolWeights(com.osmosis.protorev.v1beta1.MsgSetPoolWeights request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPoolWeightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetBaseDenoms sets the base denoms that will be used to create cyclic
     * arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse setBaseDenoms(com.osmosis.protorev.v1beta1.MsgSetBaseDenoms request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetBaseDenomsMethod(), getCallOptions(), request);
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
     * SetHotRoutes sets the hot routes that will be explored when creating
     * cyclic arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse> setHotRoutes(
        com.osmosis.protorev.v1beta1.MsgSetHotRoutes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetHotRoutesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetDeveloperAccount sets the account that can withdraw a portion of the
     * profits from the protorev module. This will be Skip's address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse> setDeveloperAccount(
        com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDeveloperAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
     * consumed per transaction. Can only be called by the admin account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse> setMaxPoolPointsPerTx(
        com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxPoolPointsPerTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
     * consumed per block. Can only be called by the admin account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse> setMaxPoolPointsPerBlock(
        com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaxPoolPointsPerBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetPoolWeights sets the weights of each pool type in the store. Can only be
     * called by the admin account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse> setPoolWeights(
        com.osmosis.protorev.v1beta1.MsgSetPoolWeights request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPoolWeightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetBaseDenoms sets the base denoms that will be used to create cyclic
     * arbitrage routes. Can only be called by the admin account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse> setBaseDenoms(
        com.osmosis.protorev.v1beta1.MsgSetBaseDenoms request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetBaseDenomsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_HOT_ROUTES = 0;
  private static final int METHODID_SET_DEVELOPER_ACCOUNT = 1;
  private static final int METHODID_SET_MAX_POOL_POINTS_PER_TX = 2;
  private static final int METHODID_SET_MAX_POOL_POINTS_PER_BLOCK = 3;
  private static final int METHODID_SET_POOL_WEIGHTS = 4;
  private static final int METHODID_SET_BASE_DENOMS = 5;

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
        case METHODID_SET_HOT_ROUTES:
          serviceImpl.setHotRoutes((com.osmosis.protorev.v1beta1.MsgSetHotRoutes) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse>) responseObserver);
          break;
        case METHODID_SET_DEVELOPER_ACCOUNT:
          serviceImpl.setDeveloperAccount((com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_POOL_POINTS_PER_TX:
          serviceImpl.setMaxPoolPointsPerTx((com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse>) responseObserver);
          break;
        case METHODID_SET_MAX_POOL_POINTS_PER_BLOCK:
          serviceImpl.setMaxPoolPointsPerBlock((com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse>) responseObserver);
          break;
        case METHODID_SET_POOL_WEIGHTS:
          serviceImpl.setPoolWeights((com.osmosis.protorev.v1beta1.MsgSetPoolWeights) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse>) responseObserver);
          break;
        case METHODID_SET_BASE_DENOMS:
          serviceImpl.setBaseDenoms((com.osmosis.protorev.v1beta1.MsgSetBaseDenoms) request,
              (io.grpc.stub.StreamObserver<com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse>) responseObserver);
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
          getSetHotRoutesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetHotRoutes,
              com.osmosis.protorev.v1beta1.MsgSetHotRoutesResponse>(
                service, METHODID_SET_HOT_ROUTES)))
        .addMethod(
          getSetDeveloperAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetDeveloperAccount,
              com.osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse>(
                service, METHODID_SET_DEVELOPER_ACCOUNT)))
        .addMethod(
          getSetMaxPoolPointsPerTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx,
              com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse>(
                service, METHODID_SET_MAX_POOL_POINTS_PER_TX)))
        .addMethod(
          getSetMaxPoolPointsPerBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock,
              com.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse>(
                service, METHODID_SET_MAX_POOL_POINTS_PER_BLOCK)))
        .addMethod(
          getSetPoolWeightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetPoolWeights,
              com.osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse>(
                service, METHODID_SET_POOL_WEIGHTS)))
        .addMethod(
          getSetBaseDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.protorev.v1beta1.MsgSetBaseDenoms,
              com.osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse>(
                service, METHODID_SET_BASE_DENOMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.protorev.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getSetHotRoutesMethod())
              .addMethod(getSetDeveloperAccountMethod())
              .addMethod(getSetMaxPoolPointsPerTxMethod())
              .addMethod(getSetMaxPoolPointsPerBlockMethod())
              .addMethod(getSetPoolWeightsMethod())
              .addMethod(getSetBaseDenomsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
