package com.provenance.attribute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for attribute module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/attribute/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.attribute.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryParamsRequest,
      com.provenance.attribute.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.provenance.attribute.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryParamsRequest,
      com.provenance.attribute.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryParamsRequest, com.provenance.attribute.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryParamsRequest, com.provenance.attribute.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> getAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attribute",
      requestType = com.provenance.attribute.v1.QueryProto.QueryAttributeRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> getAttributeMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeRequest, com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> getAttributeMethod;
    if ((getAttributeMethod = QueryGrpc.getAttributeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAttributeMethod = QueryGrpc.getAttributeMethod) == null) {
          QueryGrpc.getAttributeMethod = getAttributeMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryAttributeRequest, com.provenance.attribute.v1.QueryProto.QueryAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Attribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Attribute"))
              .build();
        }
      }
    }
    return getAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributesRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> getAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attributes",
      requestType = com.provenance.attribute.v1.QueryProto.QueryAttributesRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributesRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> getAttributesMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributesRequest, com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> getAttributesMethod;
    if ((getAttributesMethod = QueryGrpc.getAttributesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAttributesMethod = QueryGrpc.getAttributesMethod) == null) {
          QueryGrpc.getAttributesMethod = getAttributesMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryAttributesRequest, com.provenance.attribute.v1.QueryProto.QueryAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Attributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Attributes"))
              .build();
        }
      }
    }
    return getAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryScanRequest,
      com.provenance.attribute.v1.QueryProto.QueryScanResponse> getScanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scan",
      requestType = com.provenance.attribute.v1.QueryProto.QueryScanRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryScanRequest,
      com.provenance.attribute.v1.QueryProto.QueryScanResponse> getScanMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryScanRequest, com.provenance.attribute.v1.QueryProto.QueryScanResponse> getScanMethod;
    if ((getScanMethod = QueryGrpc.getScanMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getScanMethod = QueryGrpc.getScanMethod) == null) {
          QueryGrpc.getScanMethod = getScanMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryScanRequest, com.provenance.attribute.v1.QueryProto.QueryScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Scan"))
              .build();
        }
      }
    }
    return getScanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> getAttributeAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttributeAccounts",
      requestType = com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest,
      com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> getAttributeAccountsMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest, com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> getAttributeAccountsMethod;
    if ((getAttributeAccountsMethod = QueryGrpc.getAttributeAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAttributeAccountsMethod = QueryGrpc.getAttributeAccountsMethod) == null) {
          QueryGrpc.getAttributeAccountsMethod = getAttributeAccountsMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest, com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AttributeAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AttributeAccounts"))
              .build();
        }
      }
    }
    return getAttributeAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest,
      com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountData",
      requestType = com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest.class,
      responseType = com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest,
      com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest, com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod;
    if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
          QueryGrpc.getAccountDataMethod = getAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest, com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountData"))
              .build();
        }
      }
    }
    return getAccountDataMethod;
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
   * <pre>
   * Query defines the gRPC querier service for attribute module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries params of the attribute module.
     * </pre>
     */
    default void params(com.provenance.attribute.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attribute queries attributes on a given account (address) for one (or more) with the given name
     * </pre>
     */
    default void attribute(com.provenance.attribute.v1.QueryProto.QueryAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttributeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Attributes queries attributes on a given account (address) for any defined attributes
     * </pre>
     */
    default void attributes(com.provenance.attribute.v1.QueryProto.QueryAttributesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttributesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Scan queries attributes on a given account (address) for any that match the provided suffix
     * </pre>
     */
    default void scan(com.provenance.attribute.v1.QueryProto.QueryScanRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanMethod(), responseObserver);
    }

    /**
     * <pre>
     * AttributeAccounts queries accounts on a given attribute name
     * </pre>
     */
    default void attributeAccounts(com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAttributeAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountData returns the accountdata for a specified account.
     * </pre>
     */
    default void accountData(com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for attribute module.
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for attribute module.
   * </pre>
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
     * <pre>
     * Params queries params of the attribute module.
     * </pre>
     */
    public void params(com.provenance.attribute.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attribute queries attributes on a given account (address) for one (or more) with the given name
     * </pre>
     */
    public void attribute(com.provenance.attribute.v1.QueryProto.QueryAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Attributes queries attributes on a given account (address) for any defined attributes
     * </pre>
     */
    public void attributes(com.provenance.attribute.v1.QueryProto.QueryAttributesRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Scan queries attributes on a given account (address) for any that match the provided suffix
     * </pre>
     */
    public void scan(com.provenance.attribute.v1.QueryProto.QueryScanRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AttributeAccounts queries accounts on a given attribute name
     * </pre>
     */
    public void attributeAccounts(com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAttributeAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountData returns the accountdata for a specified account.
     * </pre>
     */
    public void accountData(com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for attribute module.
   * </pre>
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
     * <pre>
     * Params queries params of the attribute module.
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryParamsResponse params(com.provenance.attribute.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attribute queries attributes on a given account (address) for one (or more) with the given name
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryAttributeResponse attribute(com.provenance.attribute.v1.QueryProto.QueryAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttributeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Attributes queries attributes on a given account (address) for any defined attributes
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryAttributesResponse attributes(com.provenance.attribute.v1.QueryProto.QueryAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttributesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Scan queries attributes on a given account (address) for any that match the provided suffix
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryScanResponse scan(com.provenance.attribute.v1.QueryProto.QueryScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AttributeAccounts queries accounts on a given attribute name
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse attributeAccounts(com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAttributeAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountData returns the accountdata for a specified account.
     * </pre>
     */
    public com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse accountData(com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for attribute module.
   * </pre>
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
     * <pre>
     * Params queries params of the attribute module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryParamsResponse> params(
        com.provenance.attribute.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attribute queries attributes on a given account (address) for one (or more) with the given name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryAttributeResponse> attribute(
        com.provenance.attribute.v1.QueryProto.QueryAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttributeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Attributes queries attributes on a given account (address) for any defined attributes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryAttributesResponse> attributes(
        com.provenance.attribute.v1.QueryProto.QueryAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttributesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Scan queries attributes on a given account (address) for any that match the provided suffix
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryScanResponse> scan(
        com.provenance.attribute.v1.QueryProto.QueryScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AttributeAccounts queries accounts on a given attribute name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse> attributeAccounts(
        com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAttributeAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountData returns the accountdata for a specified account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse> accountData(
        com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ATTRIBUTE = 1;
  private static final int METHODID_ATTRIBUTES = 2;
  private static final int METHODID_SCAN = 3;
  private static final int METHODID_ATTRIBUTE_ACCOUNTS = 4;
  private static final int METHODID_ACCOUNT_DATA = 5;

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
        case METHODID_PARAMS:
          serviceImpl.params((com.provenance.attribute.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ATTRIBUTE:
          serviceImpl.attribute((com.provenance.attribute.v1.QueryProto.QueryAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeResponse>) responseObserver);
          break;
        case METHODID_ATTRIBUTES:
          serviceImpl.attributes((com.provenance.attribute.v1.QueryProto.QueryAttributesRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributesResponse>) responseObserver);
          break;
        case METHODID_SCAN:
          serviceImpl.scan((com.provenance.attribute.v1.QueryProto.QueryScanRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryScanResponse>) responseObserver);
          break;
        case METHODID_ATTRIBUTE_ACCOUNTS:
          serviceImpl.attributeAccounts((com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DATA:
          serviceImpl.accountData((com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse>) responseObserver);
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
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryParamsRequest,
              com.provenance.attribute.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryAttributeRequest,
              com.provenance.attribute.v1.QueryProto.QueryAttributeResponse>(
                service, METHODID_ATTRIBUTE)))
        .addMethod(
          getAttributesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryAttributesRequest,
              com.provenance.attribute.v1.QueryProto.QueryAttributesResponse>(
                service, METHODID_ATTRIBUTES)))
        .addMethod(
          getScanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryScanRequest,
              com.provenance.attribute.v1.QueryProto.QueryScanResponse>(
                service, METHODID_SCAN)))
        .addMethod(
          getAttributeAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsRequest,
              com.provenance.attribute.v1.QueryProto.QueryAttributeAccountsResponse>(
                service, METHODID_ATTRIBUTE_ACCOUNTS)))
        .addMethod(
          getAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.QueryProto.QueryAccountDataRequest,
              com.provenance.attribute.v1.QueryProto.QueryAccountDataResponse>(
                service, METHODID_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.attribute.v1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getAttributeMethod())
              .addMethod(getAttributesMethod())
              .addMethod(getScanMethod())
              .addMethod(getAttributeAccountsMethod())
              .addMethod(getAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
