package com.neutron.interchainqueries;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: neutron/interchainqueries/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "neutron.interchainqueries.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery,
      com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterInterchainQuery",
      requestType = com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery.class,
      responseType = com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery,
      com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery, com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> getRegisterInterchainQueryMethod;
    if ((getRegisterInterchainQueryMethod = MsgGrpc.getRegisterInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterInterchainQueryMethod = MsgGrpc.getRegisterInterchainQueryMethod) == null) {
          MsgGrpc.getRegisterInterchainQueryMethod = getRegisterInterchainQueryMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery, com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterInterchainQuery"))
              .build();
        }
      }
    }
    return getRegisterInterchainQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult,
      com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitQueryResult",
      requestType = com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult.class,
      responseType = com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult,
      com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult, com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> getSubmitQueryResultMethod;
    if ((getSubmitQueryResultMethod = MsgGrpc.getSubmitQueryResultMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSubmitQueryResultMethod = MsgGrpc.getSubmitQueryResultMethod) == null) {
          MsgGrpc.getSubmitQueryResultMethod = getSubmitQueryResultMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult, com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitQueryResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SubmitQueryResult"))
              .build();
        }
      }
    }
    return getSubmitQueryResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest,
      com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveInterchainQuery",
      requestType = com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest.class,
      responseType = com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest,
      com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest, com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> getRemoveInterchainQueryMethod;
    if ((getRemoveInterchainQueryMethod = MsgGrpc.getRemoveInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveInterchainQueryMethod = MsgGrpc.getRemoveInterchainQueryMethod) == null) {
          MsgGrpc.getRemoveInterchainQueryMethod = getRemoveInterchainQueryMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest, com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveInterchainQuery"))
              .build();
        }
      }
    }
    return getRemoveInterchainQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest,
      com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInterchainQuery",
      requestType = com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest.class,
      responseType = com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest,
      com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest, com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> getUpdateInterchainQueryMethod;
    if ((getUpdateInterchainQueryMethod = MsgGrpc.getUpdateInterchainQueryMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateInterchainQueryMethod = MsgGrpc.getUpdateInterchainQueryMethod) == null) {
          MsgGrpc.getUpdateInterchainQueryMethod = getUpdateInterchainQueryMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest, com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInterchainQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateInterchainQuery"))
              .build();
        }
      }
    }
    return getUpdateInterchainQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateParams,
      com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.neutron.interchainqueries.TxProto.MsgUpdateParams.class,
      responseType = com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateParams,
      com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.neutron.interchainqueries.TxProto.MsgUpdateParams, com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.neutron.interchainqueries.TxProto.MsgUpdateParams, com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
    default void registerInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterInterchainQueryMethod(), responseObserver);
    }

    /**
     */
    default void submitQueryResult(com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitQueryResultMethod(), responseObserver);
    }

    /**
     */
    default void removeInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveInterchainQueryMethod(), responseObserver);
    }

    /**
     */
    default void updateInterchainQuery(com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInterchainQueryMethod(), responseObserver);
    }

    /**
     */
    default void updateParams(com.neutron.interchainqueries.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
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
    public void registerInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterInterchainQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitQueryResult(com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitQueryResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveInterchainQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInterchainQuery(com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInterchainQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateParams(com.neutron.interchainqueries.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
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
    public com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse registerInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterInterchainQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse submitQueryResult(com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitQueryResultMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse removeInterchainQuery(com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveInterchainQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse updateInterchainQuery(com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInterchainQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse updateParams(com.neutron.interchainqueries.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse> registerInterchainQuery(
        com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterInterchainQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse> submitQueryResult(
        com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitQueryResultMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse> removeInterchainQuery(
        com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveInterchainQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse> updateInterchainQuery(
        com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInterchainQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse> updateParams(
        com.neutron.interchainqueries.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_INTERCHAIN_QUERY = 0;
  private static final int METHODID_SUBMIT_QUERY_RESULT = 1;
  private static final int METHODID_REMOVE_INTERCHAIN_QUERY = 2;
  private static final int METHODID_UPDATE_INTERCHAIN_QUERY = 3;
  private static final int METHODID_UPDATE_PARAMS = 4;

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
        case METHODID_REGISTER_INTERCHAIN_QUERY:
          serviceImpl.registerInterchainQuery((com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse>) responseObserver);
          break;
        case METHODID_SUBMIT_QUERY_RESULT:
          serviceImpl.submitQueryResult((com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse>) responseObserver);
          break;
        case METHODID_REMOVE_INTERCHAIN_QUERY:
          serviceImpl.removeInterchainQuery((com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INTERCHAIN_QUERY:
          serviceImpl.updateInterchainQuery((com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.neutron.interchainqueries.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getRegisterInterchainQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQuery,
              com.neutron.interchainqueries.TxProto.MsgRegisterInterchainQueryResponse>(
                service, METHODID_REGISTER_INTERCHAIN_QUERY)))
        .addMethod(
          getSubmitQueryResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.TxProto.MsgSubmitQueryResult,
              com.neutron.interchainqueries.TxProto.MsgSubmitQueryResultResponse>(
                service, METHODID_SUBMIT_QUERY_RESULT)))
        .addMethod(
          getRemoveInterchainQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryRequest,
              com.neutron.interchainqueries.TxProto.MsgRemoveInterchainQueryResponse>(
                service, METHODID_REMOVE_INTERCHAIN_QUERY)))
        .addMethod(
          getUpdateInterchainQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryRequest,
              com.neutron.interchainqueries.TxProto.MsgUpdateInterchainQueryResponse>(
                service, METHODID_UPDATE_INTERCHAIN_QUERY)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.neutron.interchainqueries.TxProto.MsgUpdateParams,
              com.neutron.interchainqueries.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neutron.interchainqueries.TxProto.getDescriptor();
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
              .addMethod(getRegisterInterchainQueryMethod())
              .addMethod(getSubmitQueryResultMethod())
              .addMethod(getRemoveInterchainQueryMethod())
              .addMethod(getUpdateInterchainQueryMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
