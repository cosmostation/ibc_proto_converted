package com.shentu.cvm.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: shentu/cvm/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "shentu.cvm.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
              .build();
        }
      }
    }
    return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> getAbiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Abi",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> getAbiMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> getAbiMethod;
    if ((getAbiMethod = QueryGrpc.getAbiMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAbiMethod = QueryGrpc.getAbiMethod) == null) {
          QueryGrpc.getAbiMethod = getAbiMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Abi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Abi"))
              .build();
        }
      }
    }
    return getAbiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> getStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Storage",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> getStorageMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> getStorageMethod;
    if ((getStorageMethod = QueryGrpc.getStorageMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStorageMethod = QueryGrpc.getStorageMethod) == null) {
          QueryGrpc.getStorageMethod = getStorageMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Storage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Storage"))
              .build();
        }
      }
    }
    return getStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> getAddressMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddressMeta",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> getAddressMetaMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> getAddressMetaMethod;
    if ((getAddressMetaMethod = QueryGrpc.getAddressMetaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAddressMetaMethod = QueryGrpc.getAddressMetaMethod) == null) {
          QueryGrpc.getAddressMetaMethod = getAddressMetaMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddressMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AddressMeta"))
              .build();
        }
      }
    }
    return getAddressMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> getMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Meta",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> getMetaMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> getMetaMethod;
    if ((getMetaMethod = QueryGrpc.getMetaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMetaMethod = QueryGrpc.getMetaMethod) == null) {
          QueryGrpc.getMetaMethod = getMetaMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Meta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Meta"))
              .build();
        }
      }
    }
    return getMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest,
      com.acm.AcmProto.Account> getAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Account",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest.class,
      responseType = com.acm.AcmProto.Account.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest,
      com.acm.AcmProto.Account> getAccountMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest, com.acm.AcmProto.Account> getAccountMethod;
    if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountMethod = QueryGrpc.getAccountMethod) == null) {
          QueryGrpc.getAccountMethod = getAccountMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest, com.acm.AcmProto.Account>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Account"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.acm.AcmProto.Account.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Account"))
              .build();
        }
      }
    }
    return getAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> getViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "View",
      requestType = com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest.class,
      responseType = com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest,
      com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> getViewMethod() {
    io.grpc.MethodDescriptor<com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> getViewMethod;
    if ((getViewMethod = QueryGrpc.getViewMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getViewMethod = QueryGrpc.getViewMethod) == null) {
          QueryGrpc.getViewMethod = getViewMethod =
              io.grpc.MethodDescriptor.<com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest, com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "View"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("View"))
              .build();
        }
      }
    }
    return getViewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void code(com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     */
    default void abi(com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAbiMethod(), responseObserver);
    }

    /**
     */
    default void storage(com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStorageMethod(), responseObserver);
    }

    /**
     */
    default void addressMeta(com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddressMetaMethod(), responseObserver);
    }

    /**
     */
    default void meta(com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetaMethod(), responseObserver);
    }

    /**
     */
    default void account(com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<com.acm.AcmProto.Account> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountMethod(), responseObserver);
    }

    /**
     */
    default void view(com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     */
    public void code(com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void abi(com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void storage(com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addressMeta(com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddressMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void meta(com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void account(com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest request,
        io.grpc.stub.StreamObserver<com.acm.AcmProto.Account> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void view(com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest request,
        io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse code(com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse abi(com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse storage(com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStorageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse addressMeta(com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddressMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse meta(com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.acm.AcmProto.Account account(com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse view(com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse> code(
        com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse> abi(
        com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse> storage(
        com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStorageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse> addressMeta(
        com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddressMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse> meta(
        com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.acm.AcmProto.Account> account(
        com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse> view(
        com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CODE = 0;
  private static final int METHODID_ABI = 1;
  private static final int METHODID_STORAGE = 2;
  private static final int METHODID_ADDRESS_META = 3;
  private static final int METHODID_META = 4;
  private static final int METHODID_ACCOUNT = 5;
  private static final int METHODID_VIEW = 6;

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
        case METHODID_CODE:
          serviceImpl.code((com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_ABI:
          serviceImpl.abi((com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse>) responseObserver);
          break;
        case METHODID_STORAGE:
          serviceImpl.storage((com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse>) responseObserver);
          break;
        case METHODID_ADDRESS_META:
          serviceImpl.addressMeta((com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse>) responseObserver);
          break;
        case METHODID_META:
          serviceImpl.meta((com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT:
          serviceImpl.account((com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.acm.AcmProto.Account>) responseObserver);
          break;
        case METHODID_VIEW:
          serviceImpl.view((com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse>) responseObserver);
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
          getCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryCodeRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryCodeResponse>(
                service, METHODID_CODE)))
        .addMethod(
          getAbiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryAbiRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryAbiResponse>(
                service, METHODID_ABI)))
        .addMethod(
          getStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryStorageRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryStorageResponse>(
                service, METHODID_STORAGE)))
        .addMethod(
          getAddressMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryAddressMetaResponse>(
                service, METHODID_ADDRESS_META)))
        .addMethod(
          getMetaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryMetaRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryMetaResponse>(
                service, METHODID_META)))
        .addMethod(
          getAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryAccountRequest,
              com.acm.AcmProto.Account>(
                service, METHODID_ACCOUNT)))
        .addMethod(
          getViewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.cvm.v1alpha1.QueryProto.QueryViewRequest,
              com.shentu.cvm.v1alpha1.QueryProto.QueryViewResponse>(
                service, METHODID_VIEW)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.cvm.v1alpha1.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueryMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getCodeMethod())
              .addMethod(getAbiMethod())
              .addMethod(getStorageMethod())
              .addMethod(getAddressMetaMethod())
              .addMethod(getMetaMethod())
              .addMethod(getAccountMethod())
              .addMethod(getViewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
