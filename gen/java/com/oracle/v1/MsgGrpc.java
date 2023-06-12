package com.oracle.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: band/oracle/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "oracle.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgRequestData,
      com.oracle.v1.MsgRequestDataResponse> getRequestDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestData",
      requestType = com.oracle.v1.MsgRequestData.class,
      responseType = com.oracle.v1.MsgRequestDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgRequestData,
      com.oracle.v1.MsgRequestDataResponse> getRequestDataMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgRequestData, com.oracle.v1.MsgRequestDataResponse> getRequestDataMethod;
    if ((getRequestDataMethod = MsgGrpc.getRequestDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRequestDataMethod = MsgGrpc.getRequestDataMethod) == null) {
          MsgGrpc.getRequestDataMethod = getRequestDataMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgRequestData, com.oracle.v1.MsgRequestDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgRequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgRequestDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RequestData"))
              .build();
        }
      }
    }
    return getRequestDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgReportData,
      com.oracle.v1.MsgReportDataResponse> getReportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportData",
      requestType = com.oracle.v1.MsgReportData.class,
      responseType = com.oracle.v1.MsgReportDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgReportData,
      com.oracle.v1.MsgReportDataResponse> getReportDataMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgReportData, com.oracle.v1.MsgReportDataResponse> getReportDataMethod;
    if ((getReportDataMethod = MsgGrpc.getReportDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReportDataMethod = MsgGrpc.getReportDataMethod) == null) {
          MsgGrpc.getReportDataMethod = getReportDataMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgReportData, com.oracle.v1.MsgReportDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgReportData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgReportDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReportData"))
              .build();
        }
      }
    }
    return getReportDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateDataSource,
      com.oracle.v1.MsgCreateDataSourceResponse> getCreateDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataSource",
      requestType = com.oracle.v1.MsgCreateDataSource.class,
      responseType = com.oracle.v1.MsgCreateDataSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateDataSource,
      com.oracle.v1.MsgCreateDataSourceResponse> getCreateDataSourceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateDataSource, com.oracle.v1.MsgCreateDataSourceResponse> getCreateDataSourceMethod;
    if ((getCreateDataSourceMethod = MsgGrpc.getCreateDataSourceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDataSourceMethod = MsgGrpc.getCreateDataSourceMethod) == null) {
          MsgGrpc.getCreateDataSourceMethod = getCreateDataSourceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgCreateDataSource, com.oracle.v1.MsgCreateDataSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgCreateDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgCreateDataSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDataSource"))
              .build();
        }
      }
    }
    return getCreateDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgEditDataSource,
      com.oracle.v1.MsgEditDataSourceResponse> getEditDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditDataSource",
      requestType = com.oracle.v1.MsgEditDataSource.class,
      responseType = com.oracle.v1.MsgEditDataSourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgEditDataSource,
      com.oracle.v1.MsgEditDataSourceResponse> getEditDataSourceMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgEditDataSource, com.oracle.v1.MsgEditDataSourceResponse> getEditDataSourceMethod;
    if ((getEditDataSourceMethod = MsgGrpc.getEditDataSourceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditDataSourceMethod = MsgGrpc.getEditDataSourceMethod) == null) {
          MsgGrpc.getEditDataSourceMethod = getEditDataSourceMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgEditDataSource, com.oracle.v1.MsgEditDataSourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgEditDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgEditDataSourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditDataSource"))
              .build();
        }
      }
    }
    return getEditDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateOracleScript,
      com.oracle.v1.MsgCreateOracleScriptResponse> getCreateOracleScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOracleScript",
      requestType = com.oracle.v1.MsgCreateOracleScript.class,
      responseType = com.oracle.v1.MsgCreateOracleScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateOracleScript,
      com.oracle.v1.MsgCreateOracleScriptResponse> getCreateOracleScriptMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgCreateOracleScript, com.oracle.v1.MsgCreateOracleScriptResponse> getCreateOracleScriptMethod;
    if ((getCreateOracleScriptMethod = MsgGrpc.getCreateOracleScriptMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateOracleScriptMethod = MsgGrpc.getCreateOracleScriptMethod) == null) {
          MsgGrpc.getCreateOracleScriptMethod = getCreateOracleScriptMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgCreateOracleScript, com.oracle.v1.MsgCreateOracleScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOracleScript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgCreateOracleScript.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgCreateOracleScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateOracleScript"))
              .build();
        }
      }
    }
    return getCreateOracleScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgEditOracleScript,
      com.oracle.v1.MsgEditOracleScriptResponse> getEditOracleScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditOracleScript",
      requestType = com.oracle.v1.MsgEditOracleScript.class,
      responseType = com.oracle.v1.MsgEditOracleScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgEditOracleScript,
      com.oracle.v1.MsgEditOracleScriptResponse> getEditOracleScriptMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgEditOracleScript, com.oracle.v1.MsgEditOracleScriptResponse> getEditOracleScriptMethod;
    if ((getEditOracleScriptMethod = MsgGrpc.getEditOracleScriptMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditOracleScriptMethod = MsgGrpc.getEditOracleScriptMethod) == null) {
          MsgGrpc.getEditOracleScriptMethod = getEditOracleScriptMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgEditOracleScript, com.oracle.v1.MsgEditOracleScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditOracleScript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgEditOracleScript.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgEditOracleScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditOracleScript"))
              .build();
        }
      }
    }
    return getEditOracleScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oracle.v1.MsgActivate,
      com.oracle.v1.MsgActivateResponse> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Activate",
      requestType = com.oracle.v1.MsgActivate.class,
      responseType = com.oracle.v1.MsgActivateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oracle.v1.MsgActivate,
      com.oracle.v1.MsgActivateResponse> getActivateMethod() {
    io.grpc.MethodDescriptor<com.oracle.v1.MsgActivate, com.oracle.v1.MsgActivateResponse> getActivateMethod;
    if ((getActivateMethod = MsgGrpc.getActivateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getActivateMethod = MsgGrpc.getActivateMethod) == null) {
          MsgGrpc.getActivateMethod = getActivateMethod =
              io.grpc.MethodDescriptor.<com.oracle.v1.MsgActivate, com.oracle.v1.MsgActivateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgActivate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oracle.v1.MsgActivateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Activate"))
              .build();
        }
      }
    }
    return getActivateMethod;
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
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RequestData defines a method for submitting a new request.
     * </pre>
     */
    default void requestData(com.oracle.v1.MsgRequestData request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgRequestDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReportData defines a method for reporting a data to resolve the request.
     * </pre>
     */
    default void reportData(com.oracle.v1.MsgReportData request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgReportDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReportDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDataSource defines a method for creating a new data source.
     * </pre>
     */
    default void createDataSource(com.oracle.v1.MsgCreateDataSource request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateDataSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditDataSource defines a method for editing an existing data source.
     * </pre>
     */
    default void editDataSource(com.oracle.v1.MsgEditDataSource request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditDataSourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditDataSourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateOracleScript defines a method for creating a new oracle script.
     * </pre>
     */
    default void createOracleScript(com.oracle.v1.MsgCreateOracleScript request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateOracleScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOracleScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditOracleScript defines a method for editing an existing oracle script.
     * </pre>
     */
    default void editOracleScript(com.oracle.v1.MsgEditOracleScript request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditOracleScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditOracleScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate defines a method for applying to be an oracle validator.
     * </pre>
     */
    default void activate(com.oracle.v1.MsgActivate request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgActivateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
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
   * Msg defines the oracle Msg service.
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
     * RequestData defines a method for submitting a new request.
     * </pre>
     */
    public void requestData(com.oracle.v1.MsgRequestData request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgRequestDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReportData defines a method for reporting a data to resolve the request.
     * </pre>
     */
    public void reportData(com.oracle.v1.MsgReportData request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgReportDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDataSource defines a method for creating a new data source.
     * </pre>
     */
    public void createDataSource(com.oracle.v1.MsgCreateDataSource request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateDataSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditDataSource defines a method for editing an existing data source.
     * </pre>
     */
    public void editDataSource(com.oracle.v1.MsgEditDataSource request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditDataSourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateOracleScript defines a method for creating a new oracle script.
     * </pre>
     */
    public void createOracleScript(com.oracle.v1.MsgCreateOracleScript request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateOracleScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOracleScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditOracleScript defines a method for editing an existing oracle script.
     * </pre>
     */
    public void editOracleScript(com.oracle.v1.MsgEditOracleScript request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditOracleScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditOracleScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate defines a method for applying to be an oracle validator.
     * </pre>
     */
    public void activate(com.oracle.v1.MsgActivate request,
        io.grpc.stub.StreamObserver<com.oracle.v1.MsgActivateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
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
     * RequestData defines a method for submitting a new request.
     * </pre>
     */
    public com.oracle.v1.MsgRequestDataResponse requestData(com.oracle.v1.MsgRequestData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReportData defines a method for reporting a data to resolve the request.
     * </pre>
     */
    public com.oracle.v1.MsgReportDataResponse reportData(com.oracle.v1.MsgReportData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReportDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDataSource defines a method for creating a new data source.
     * </pre>
     */
    public com.oracle.v1.MsgCreateDataSourceResponse createDataSource(com.oracle.v1.MsgCreateDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditDataSource defines a method for editing an existing data source.
     * </pre>
     */
    public com.oracle.v1.MsgEditDataSourceResponse editDataSource(com.oracle.v1.MsgEditDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditDataSourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateOracleScript defines a method for creating a new oracle script.
     * </pre>
     */
    public com.oracle.v1.MsgCreateOracleScriptResponse createOracleScript(com.oracle.v1.MsgCreateOracleScript request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOracleScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditOracleScript defines a method for editing an existing oracle script.
     * </pre>
     */
    public com.oracle.v1.MsgEditOracleScriptResponse editOracleScript(com.oracle.v1.MsgEditOracleScript request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditOracleScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate defines a method for applying to be an oracle validator.
     * </pre>
     */
    public com.oracle.v1.MsgActivateResponse activate(com.oracle.v1.MsgActivate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the oracle Msg service.
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
     * RequestData defines a method for submitting a new request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgRequestDataResponse> requestData(
        com.oracle.v1.MsgRequestData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReportData defines a method for reporting a data to resolve the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgReportDataResponse> reportData(
        com.oracle.v1.MsgReportData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReportDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDataSource defines a method for creating a new data source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgCreateDataSourceResponse> createDataSource(
        com.oracle.v1.MsgCreateDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditDataSource defines a method for editing an existing data source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgEditDataSourceResponse> editDataSource(
        com.oracle.v1.MsgEditDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditDataSourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateOracleScript defines a method for creating a new oracle script.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgCreateOracleScriptResponse> createOracleScript(
        com.oracle.v1.MsgCreateOracleScript request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOracleScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditOracleScript defines a method for editing an existing oracle script.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgEditOracleScriptResponse> editOracleScript(
        com.oracle.v1.MsgEditOracleScript request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditOracleScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate defines a method for applying to be an oracle validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oracle.v1.MsgActivateResponse> activate(
        com.oracle.v1.MsgActivate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_DATA = 0;
  private static final int METHODID_REPORT_DATA = 1;
  private static final int METHODID_CREATE_DATA_SOURCE = 2;
  private static final int METHODID_EDIT_DATA_SOURCE = 3;
  private static final int METHODID_CREATE_ORACLE_SCRIPT = 4;
  private static final int METHODID_EDIT_ORACLE_SCRIPT = 5;
  private static final int METHODID_ACTIVATE = 6;

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
        case METHODID_REQUEST_DATA:
          serviceImpl.requestData((com.oracle.v1.MsgRequestData) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgRequestDataResponse>) responseObserver);
          break;
        case METHODID_REPORT_DATA:
          serviceImpl.reportData((com.oracle.v1.MsgReportData) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgReportDataResponse>) responseObserver);
          break;
        case METHODID_CREATE_DATA_SOURCE:
          serviceImpl.createDataSource((com.oracle.v1.MsgCreateDataSource) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateDataSourceResponse>) responseObserver);
          break;
        case METHODID_EDIT_DATA_SOURCE:
          serviceImpl.editDataSource((com.oracle.v1.MsgEditDataSource) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditDataSourceResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORACLE_SCRIPT:
          serviceImpl.createOracleScript((com.oracle.v1.MsgCreateOracleScript) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgCreateOracleScriptResponse>) responseObserver);
          break;
        case METHODID_EDIT_ORACLE_SCRIPT:
          serviceImpl.editOracleScript((com.oracle.v1.MsgEditOracleScript) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgEditOracleScriptResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((com.oracle.v1.MsgActivate) request,
              (io.grpc.stub.StreamObserver<com.oracle.v1.MsgActivateResponse>) responseObserver);
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
          getRequestDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgRequestData,
              com.oracle.v1.MsgRequestDataResponse>(
                service, METHODID_REQUEST_DATA)))
        .addMethod(
          getReportDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgReportData,
              com.oracle.v1.MsgReportDataResponse>(
                service, METHODID_REPORT_DATA)))
        .addMethod(
          getCreateDataSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgCreateDataSource,
              com.oracle.v1.MsgCreateDataSourceResponse>(
                service, METHODID_CREATE_DATA_SOURCE)))
        .addMethod(
          getEditDataSourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgEditDataSource,
              com.oracle.v1.MsgEditDataSourceResponse>(
                service, METHODID_EDIT_DATA_SOURCE)))
        .addMethod(
          getCreateOracleScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgCreateOracleScript,
              com.oracle.v1.MsgCreateOracleScriptResponse>(
                service, METHODID_CREATE_ORACLE_SCRIPT)))
        .addMethod(
          getEditOracleScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgEditOracleScript,
              com.oracle.v1.MsgEditOracleScriptResponse>(
                service, METHODID_EDIT_ORACLE_SCRIPT)))
        .addMethod(
          getActivateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oracle.v1.MsgActivate,
              com.oracle.v1.MsgActivateResponse>(
                service, METHODID_ACTIVATE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.oracle.v1.TxProto.getDescriptor();
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
              .addMethod(getRequestDataMethod())
              .addMethod(getReportDataMethod())
              .addMethod(getCreateDataSourceMethod())
              .addMethod(getEditDataSourceMethod())
              .addMethod(getCreateOracleScriptMethod())
              .addMethod(getEditOracleScriptMethod())
              .addMethod(getActivateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
