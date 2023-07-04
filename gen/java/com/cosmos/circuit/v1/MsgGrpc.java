package com.cosmos.circuit.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the crisis Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/circuit/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmos.circuit.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuthorizeCircuitBreaker",
      requestType = com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker.class,
      responseType = com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> getAuthorizeCircuitBreakerMethod;
    if ((getAuthorizeCircuitBreakerMethod = MsgGrpc.getAuthorizeCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAuthorizeCircuitBreakerMethod = MsgGrpc.getAuthorizeCircuitBreakerMethod) == null) {
          MsgGrpc.getAuthorizeCircuitBreakerMethod = getAuthorizeCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuthorizeCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AuthorizeCircuitBreaker"))
              .build();
        }
      }
    }
    return getAuthorizeCircuitBreakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TripCircuitBreaker",
      requestType = com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker.class,
      responseType = com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> getTripCircuitBreakerMethod;
    if ((getTripCircuitBreakerMethod = MsgGrpc.getTripCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTripCircuitBreakerMethod = MsgGrpc.getTripCircuitBreakerMethod) == null) {
          MsgGrpc.getTripCircuitBreakerMethod = getTripCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TripCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TripCircuitBreaker"))
              .build();
        }
      }
    }
    return getTripCircuitBreakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetCircuitBreaker",
      requestType = com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker.class,
      responseType = com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker,
      com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod() {
    io.grpc.MethodDescriptor<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> getResetCircuitBreakerMethod;
    if ((getResetCircuitBreakerMethod = MsgGrpc.getResetCircuitBreakerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getResetCircuitBreakerMethod = MsgGrpc.getResetCircuitBreakerMethod) == null) {
          MsgGrpc.getResetCircuitBreakerMethod = getResetCircuitBreakerMethod =
              io.grpc.MethodDescriptor.<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker, com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetCircuitBreaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ResetCircuitBreaker"))
              .build();
        }
      }
    }
    return getResetCircuitBreakerMethod;
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
   * Msg defines the crisis Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    default void authorizeCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuthorizeCircuitBreakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    default void tripCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTripCircuitBreakerMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    default void resetCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetCircuitBreakerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the crisis Msg service.
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
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public void authorizeCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuthorizeCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public void tripCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTripCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public void resetCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker request,
        io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetCircuitBreakerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse authorizeCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuthorizeCircuitBreakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse tripCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTripCircuitBreakerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse resetCircuitBreaker(com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetCircuitBreakerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the crisis Msg service.
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
     * AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
     * account's circuit breaker permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse> authorizeCircuitBreaker(
        com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuthorizeCircuitBreakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TripCircuitBreaker pauses processing of Msg's in the state machine.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse> tripCircuitBreaker(
        com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTripCircuitBreakerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetCircuitBreaker resumes processing of Msg's in the state machine that
     * have been been paused using TripCircuitBreaker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse> resetCircuitBreaker(
        com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetCircuitBreakerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHORIZE_CIRCUIT_BREAKER = 0;
  private static final int METHODID_TRIP_CIRCUIT_BREAKER = 1;
  private static final int METHODID_RESET_CIRCUIT_BREAKER = 2;

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
        case METHODID_AUTHORIZE_CIRCUIT_BREAKER:
          serviceImpl.authorizeCircuitBreaker((com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse>) responseObserver);
          break;
        case METHODID_TRIP_CIRCUIT_BREAKER:
          serviceImpl.tripCircuitBreaker((com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse>) responseObserver);
          break;
        case METHODID_RESET_CIRCUIT_BREAKER:
          serviceImpl.resetCircuitBreaker((com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker) request,
              (io.grpc.stub.StreamObserver<com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse>) responseObserver);
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
          getAuthorizeCircuitBreakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreaker,
              com.cosmos.circuit.v1.TxProto.MsgAuthorizeCircuitBreakerResponse>(
                service, METHODID_AUTHORIZE_CIRCUIT_BREAKER)))
        .addMethod(
          getTripCircuitBreakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreaker,
              com.cosmos.circuit.v1.TxProto.MsgTripCircuitBreakerResponse>(
                service, METHODID_TRIP_CIRCUIT_BREAKER)))
        .addMethod(
          getResetCircuitBreakerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreaker,
              com.cosmos.circuit.v1.TxProto.MsgResetCircuitBreakerResponse>(
                service, METHODID_RESET_CIRCUIT_BREAKER)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.circuit.v1.TxProto.getDescriptor();
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
              .addMethod(getAuthorizeCircuitBreakerMethod())
              .addMethod(getTripCircuitBreakerMethod())
              .addMethod(getResetCircuitBreakerMethod())
              .build();
        }
      }
    }
    return result;
  }
}