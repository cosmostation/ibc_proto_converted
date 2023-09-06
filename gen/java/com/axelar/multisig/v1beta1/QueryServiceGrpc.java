package com.axelar.multisig.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/multisig/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.multisig.v1beta1.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> getKeyIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyID",
      requestType = com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest.class,
      responseType = com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> getKeyIDMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest, com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> getKeyIDMethod;
    if ((getKeyIDMethod = QueryServiceGrpc.getKeyIDMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getKeyIDMethod = QueryServiceGrpc.getKeyIDMethod) == null) {
          QueryServiceGrpc.getKeyIDMethod = getKeyIDMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest, com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("KeyID"))
              .build();
        }
      }
    }
    return getKeyIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest,
      com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> getNextKeyIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextKeyID",
      requestType = com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest.class,
      responseType = com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest,
      com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> getNextKeyIDMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest, com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> getNextKeyIDMethod;
    if ((getNextKeyIDMethod = QueryServiceGrpc.getNextKeyIDMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getNextKeyIDMethod = QueryServiceGrpc.getNextKeyIDMethod) == null) {
          QueryServiceGrpc.getNextKeyIDMethod = getNextKeyIDMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest, com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextKeyID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("NextKeyID"))
              .build();
        }
      }
    }
    return getNextKeyIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeyResponse> getKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Key",
      requestType = com.axelar.multisig.v1beta1.QueryProto.KeyRequest.class,
      responseType = com.axelar.multisig.v1beta1.QueryProto.KeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeyResponse> getKeyMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeyRequest, com.axelar.multisig.v1beta1.QueryProto.KeyResponse> getKeyMethod;
    if ((getKeyMethod = QueryServiceGrpc.getKeyMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getKeyMethod = QueryServiceGrpc.getKeyMethod) == null) {
          QueryServiceGrpc.getKeyMethod = getKeyMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.QueryProto.KeyRequest, com.axelar.multisig.v1beta1.QueryProto.KeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Key"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Key"))
              .build();
        }
      }
    }
    return getKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> getKeygenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeygenSession",
      requestType = com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest.class,
      responseType = com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest,
      com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> getKeygenSessionMethod() {
    io.grpc.MethodDescriptor<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest, com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> getKeygenSessionMethod;
    if ((getKeygenSessionMethod = QueryServiceGrpc.getKeygenSessionMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getKeygenSessionMethod = QueryServiceGrpc.getKeygenSessionMethod) == null) {
          QueryServiceGrpc.getKeygenSessionMethod = getKeygenSessionMethod =
              io.grpc.MethodDescriptor.<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest, com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeygenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("KeygenSession"))
              .build();
        }
      }
    }
    return getKeygenSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * KeyID returns the key ID of a key assigned to a given chain.
     * If no key is assigned, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    default void keyID(com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextKeyID returns the key ID assigned for the next rotation on a given
     * chain. If no key rotation is in progress, it returns the grpc NOT_FOUND
     * error.
     * </pre>
     */
    default void nextKeyID(com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextKeyIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Key returns the key corresponding to a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    default void key(com.axelar.multisig.v1beta1.QueryProto.KeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * KeygenSession returns the keygen session info for a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    default void keygenSession(com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeygenSessionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * KeyID returns the key ID of a key assigned to a given chain.
     * If no key is assigned, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public void keyID(com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextKeyID returns the key ID assigned for the next rotation on a given
     * chain. If no key rotation is in progress, it returns the grpc NOT_FOUND
     * error.
     * </pre>
     */
    public void nextKeyID(com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextKeyIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Key returns the key corresponding to a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public void key(com.axelar.multisig.v1beta1.QueryProto.KeyRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KeygenSession returns the keygen session info for a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public void keygenSession(com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest request,
        io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeygenSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * KeyID returns the key ID of a key assigned to a given chain.
     * If no key is assigned, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse keyID(com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextKeyID returns the key ID assigned for the next rotation on a given
     * chain. If no key rotation is in progress, it returns the grpc NOT_FOUND
     * error.
     * </pre>
     */
    public com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse nextKeyID(com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextKeyIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Key returns the key corresponding to a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.axelar.multisig.v1beta1.QueryProto.KeyResponse key(com.axelar.multisig.v1beta1.QueryProto.KeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KeygenSession returns the keygen session info for a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse keygenSession(com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeygenSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   * <pre>
   * Query defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * KeyID returns the key ID of a key assigned to a given chain.
     * If no key is assigned, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse> keyID(
        com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextKeyID returns the key ID assigned for the next rotation on a given
     * chain. If no key rotation is in progress, it returns the grpc NOT_FOUND
     * error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse> nextKeyID(
        com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextKeyIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Key returns the key corresponding to a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.QueryProto.KeyResponse> key(
        com.axelar.multisig.v1beta1.QueryProto.KeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KeygenSession returns the keygen session info for a given key ID.
     * If no key is found, it returns the grpc NOT_FOUND error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse> keygenSession(
        com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeygenSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KEY_ID = 0;
  private static final int METHODID_NEXT_KEY_ID = 1;
  private static final int METHODID_KEY = 2;
  private static final int METHODID_KEYGEN_SESSION = 3;

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
        case METHODID_KEY_ID:
          serviceImpl.keyID((com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse>) responseObserver);
          break;
        case METHODID_NEXT_KEY_ID:
          serviceImpl.nextKeyID((com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse>) responseObserver);
          break;
        case METHODID_KEY:
          serviceImpl.key((com.axelar.multisig.v1beta1.QueryProto.KeyRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeyResponse>) responseObserver);
          break;
        case METHODID_KEYGEN_SESSION:
          serviceImpl.keygenSession((com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse>) responseObserver);
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
          getKeyIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.QueryProto.KeyIDRequest,
              com.axelar.multisig.v1beta1.QueryProto.KeyIDResponse>(
                service, METHODID_KEY_ID)))
        .addMethod(
          getNextKeyIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.QueryProto.NextKeyIDRequest,
              com.axelar.multisig.v1beta1.QueryProto.NextKeyIDResponse>(
                service, METHODID_NEXT_KEY_ID)))
        .addMethod(
          getKeyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.QueryProto.KeyRequest,
              com.axelar.multisig.v1beta1.QueryProto.KeyResponse>(
                service, METHODID_KEY)))
        .addMethod(
          getKeygenSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.multisig.v1beta1.QueryProto.KeygenSessionRequest,
              com.axelar.multisig.v1beta1.QueryProto.KeygenSessionResponse>(
                service, METHODID_KEYGEN_SESSION)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.multisig.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getKeyIDMethod())
              .addMethod(getNextKeyIDMethod())
              .addMethod(getKeyMethod())
              .addMethod(getKeygenSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
