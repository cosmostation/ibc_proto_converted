package com.panacea.aol.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/aol/v2/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.aol.v2.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgCreateTopic,
      com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> getCreateTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTopic",
      requestType = com.panacea.aol.v2.TxProto.MsgCreateTopic.class,
      responseType = com.panacea.aol.v2.TxProto.MsgCreateTopicResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgCreateTopic,
      com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> getCreateTopicMethod() {
    io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgCreateTopic, com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> getCreateTopicMethod;
    if ((getCreateTopicMethod = MsgGrpc.getCreateTopicMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateTopicMethod = MsgGrpc.getCreateTopicMethod) == null) {
          MsgGrpc.getCreateTopicMethod = getCreateTopicMethod =
              io.grpc.MethodDescriptor.<com.panacea.aol.v2.TxProto.MsgCreateTopic, com.panacea.aol.v2.TxProto.MsgCreateTopicResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgCreateTopic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgCreateTopicResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateTopic"))
              .build();
        }
      }
    }
    return getCreateTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddWriter,
      com.panacea.aol.v2.TxProto.MsgAddWriterResponse> getAddWriterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddWriter",
      requestType = com.panacea.aol.v2.TxProto.MsgAddWriter.class,
      responseType = com.panacea.aol.v2.TxProto.MsgAddWriterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddWriter,
      com.panacea.aol.v2.TxProto.MsgAddWriterResponse> getAddWriterMethod() {
    io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddWriter, com.panacea.aol.v2.TxProto.MsgAddWriterResponse> getAddWriterMethod;
    if ((getAddWriterMethod = MsgGrpc.getAddWriterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddWriterMethod = MsgGrpc.getAddWriterMethod) == null) {
          MsgGrpc.getAddWriterMethod = getAddWriterMethod =
              io.grpc.MethodDescriptor.<com.panacea.aol.v2.TxProto.MsgAddWriter, com.panacea.aol.v2.TxProto.MsgAddWriterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddWriter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgAddWriter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgAddWriterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddWriter"))
              .build();
        }
      }
    }
    return getAddWriterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgDeleteWriter,
      com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> getDeleteWriterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWriter",
      requestType = com.panacea.aol.v2.TxProto.MsgDeleteWriter.class,
      responseType = com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgDeleteWriter,
      com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> getDeleteWriterMethod() {
    io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgDeleteWriter, com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> getDeleteWriterMethod;
    if ((getDeleteWriterMethod = MsgGrpc.getDeleteWriterMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteWriterMethod = MsgGrpc.getDeleteWriterMethod) == null) {
          MsgGrpc.getDeleteWriterMethod = getDeleteWriterMethod =
              io.grpc.MethodDescriptor.<com.panacea.aol.v2.TxProto.MsgDeleteWriter, com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWriter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgDeleteWriter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteWriter"))
              .build();
        }
      }
    }
    return getDeleteWriterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddRecord,
      com.panacea.aol.v2.TxProto.MsgAddRecordResponse> getAddRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRecord",
      requestType = com.panacea.aol.v2.TxProto.MsgAddRecord.class,
      responseType = com.panacea.aol.v2.TxProto.MsgAddRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddRecord,
      com.panacea.aol.v2.TxProto.MsgAddRecordResponse> getAddRecordMethod() {
    io.grpc.MethodDescriptor<com.panacea.aol.v2.TxProto.MsgAddRecord, com.panacea.aol.v2.TxProto.MsgAddRecordResponse> getAddRecordMethod;
    if ((getAddRecordMethod = MsgGrpc.getAddRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddRecordMethod = MsgGrpc.getAddRecordMethod) == null) {
          MsgGrpc.getAddRecordMethod = getAddRecordMethod =
              io.grpc.MethodDescriptor.<com.panacea.aol.v2.TxProto.MsgAddRecord, com.panacea.aol.v2.TxProto.MsgAddRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgAddRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.aol.v2.TxProto.MsgAddRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddRecord"))
              .build();
        }
      }
    }
    return getAddRecordMethod;
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
     * <pre>
     * CreateTopic defines a method for creating a topic.
     * </pre>
     */
    default void createTopic(com.panacea.aol.v2.TxProto.MsgCreateTopic request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddWriter defines a method for adding a writer to the topic.
     * </pre>
     */
    default void addWriter(com.panacea.aol.v2.TxProto.MsgAddWriter request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddWriterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddWriterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWriter defines a method for deleting a writer to the topic.
     * </pre>
     */
    default void deleteWriter(com.panacea.aol.v2.TxProto.MsgDeleteWriter request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWriterMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddRecord defines a method for adding a record to the topic with the writer.
     * </pre>
     */
    default void addRecord(com.panacea.aol.v2.TxProto.MsgAddRecord request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRecordMethod(), responseObserver);
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
     * <pre>
     * CreateTopic defines a method for creating a topic.
     * </pre>
     */
    public void createTopic(com.panacea.aol.v2.TxProto.MsgCreateTopic request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddWriter defines a method for adding a writer to the topic.
     * </pre>
     */
    public void addWriter(com.panacea.aol.v2.TxProto.MsgAddWriter request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddWriterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddWriterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWriter defines a method for deleting a writer to the topic.
     * </pre>
     */
    public void deleteWriter(com.panacea.aol.v2.TxProto.MsgDeleteWriter request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWriterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddRecord defines a method for adding a record to the topic with the writer.
     * </pre>
     */
    public void addRecord(com.panacea.aol.v2.TxProto.MsgAddRecord request,
        io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRecordMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * CreateTopic defines a method for creating a topic.
     * </pre>
     */
    public com.panacea.aol.v2.TxProto.MsgCreateTopicResponse createTopic(com.panacea.aol.v2.TxProto.MsgCreateTopic request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddWriter defines a method for adding a writer to the topic.
     * </pre>
     */
    public com.panacea.aol.v2.TxProto.MsgAddWriterResponse addWriter(com.panacea.aol.v2.TxProto.MsgAddWriter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddWriterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWriter defines a method for deleting a writer to the topic.
     * </pre>
     */
    public com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse deleteWriter(com.panacea.aol.v2.TxProto.MsgDeleteWriter request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWriterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddRecord defines a method for adding a record to the topic with the writer.
     * </pre>
     */
    public com.panacea.aol.v2.TxProto.MsgAddRecordResponse addRecord(com.panacea.aol.v2.TxProto.MsgAddRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRecordMethod(), getCallOptions(), request);
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
     * <pre>
     * CreateTopic defines a method for creating a topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.aol.v2.TxProto.MsgCreateTopicResponse> createTopic(
        com.panacea.aol.v2.TxProto.MsgCreateTopic request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddWriter defines a method for adding a writer to the topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.aol.v2.TxProto.MsgAddWriterResponse> addWriter(
        com.panacea.aol.v2.TxProto.MsgAddWriter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddWriterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWriter defines a method for deleting a writer to the topic.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse> deleteWriter(
        com.panacea.aol.v2.TxProto.MsgDeleteWriter request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWriterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddRecord defines a method for adding a record to the topic with the writer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.aol.v2.TxProto.MsgAddRecordResponse> addRecord(
        com.panacea.aol.v2.TxProto.MsgAddRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TOPIC = 0;
  private static final int METHODID_ADD_WRITER = 1;
  private static final int METHODID_DELETE_WRITER = 2;
  private static final int METHODID_ADD_RECORD = 3;

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
        case METHODID_CREATE_TOPIC:
          serviceImpl.createTopic((com.panacea.aol.v2.TxProto.MsgCreateTopic) request,
              (io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgCreateTopicResponse>) responseObserver);
          break;
        case METHODID_ADD_WRITER:
          serviceImpl.addWriter((com.panacea.aol.v2.TxProto.MsgAddWriter) request,
              (io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddWriterResponse>) responseObserver);
          break;
        case METHODID_DELETE_WRITER:
          serviceImpl.deleteWriter((com.panacea.aol.v2.TxProto.MsgDeleteWriter) request,
              (io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse>) responseObserver);
          break;
        case METHODID_ADD_RECORD:
          serviceImpl.addRecord((com.panacea.aol.v2.TxProto.MsgAddRecord) request,
              (io.grpc.stub.StreamObserver<com.panacea.aol.v2.TxProto.MsgAddRecordResponse>) responseObserver);
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
          getCreateTopicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.aol.v2.TxProto.MsgCreateTopic,
              com.panacea.aol.v2.TxProto.MsgCreateTopicResponse>(
                service, METHODID_CREATE_TOPIC)))
        .addMethod(
          getAddWriterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.aol.v2.TxProto.MsgAddWriter,
              com.panacea.aol.v2.TxProto.MsgAddWriterResponse>(
                service, METHODID_ADD_WRITER)))
        .addMethod(
          getDeleteWriterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.aol.v2.TxProto.MsgDeleteWriter,
              com.panacea.aol.v2.TxProto.MsgDeleteWriterResponse>(
                service, METHODID_DELETE_WRITER)))
        .addMethod(
          getAddRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.aol.v2.TxProto.MsgAddRecord,
              com.panacea.aol.v2.TxProto.MsgAddRecordResponse>(
                service, METHODID_ADD_RECORD)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.aol.v2.TxProto.getDescriptor();
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
              .addMethod(getCreateTopicMethod())
              .addMethod(getAddWriterMethod())
              .addMethod(getDeleteWriterMethod())
              .addMethod(getAddRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
