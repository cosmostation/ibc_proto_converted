package com.stratos.sds.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/sds/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stratos.sds.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryFileUploadRequest,
      com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> getFileuploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Fileupload",
      requestType = com.stratos.sds.v1.QueryProto.QueryFileUploadRequest.class,
      responseType = com.stratos.sds.v1.QueryProto.QueryFileUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryFileUploadRequest,
      com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> getFileuploadMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryFileUploadRequest, com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> getFileuploadMethod;
    if ((getFileuploadMethod = QueryGrpc.getFileuploadMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFileuploadMethod = QueryGrpc.getFileuploadMethod) == null) {
          QueryGrpc.getFileuploadMethod = getFileuploadMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.QueryProto.QueryFileUploadRequest, com.stratos.sds.v1.QueryProto.QueryFileUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Fileupload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryFileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryFileUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Fileupload"))
              .build();
        }
      }
    }
    return getFileuploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest,
      com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> getSimPrepayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimPrepay",
      requestType = com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest.class,
      responseType = com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest,
      com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> getSimPrepayMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest, com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> getSimPrepayMethod;
    if ((getSimPrepayMethod = QueryGrpc.getSimPrepayMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSimPrepayMethod = QueryGrpc.getSimPrepayMethod) == null) {
          QueryGrpc.getSimPrepayMethod = getSimPrepayMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest, com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimPrepay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SimPrepay"))
              .build();
        }
      }
    }
    return getSimPrepayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozPriceRequest,
      com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> getNozPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NozPrice",
      requestType = com.stratos.sds.v1.QueryProto.QueryNozPriceRequest.class,
      responseType = com.stratos.sds.v1.QueryProto.QueryNozPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozPriceRequest,
      com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> getNozPriceMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozPriceRequest, com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> getNozPriceMethod;
    if ((getNozPriceMethod = QueryGrpc.getNozPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNozPriceMethod = QueryGrpc.getNozPriceMethod) == null) {
          QueryGrpc.getNozPriceMethod = getNozPriceMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.QueryProto.QueryNozPriceRequest, com.stratos.sds.v1.QueryProto.QueryNozPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NozPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryNozPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryNozPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NozPrice"))
              .build();
        }
      }
    }
    return getNozPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest,
      com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> getNozSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NozSupply",
      requestType = com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest.class,
      responseType = com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest,
      com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> getNozSupplyMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest, com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> getNozSupplyMethod;
    if ((getNozSupplyMethod = QueryGrpc.getNozSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNozSupplyMethod = QueryGrpc.getNozSupplyMethod) == null) {
          QueryGrpc.getNozSupplyMethod = getNozSupplyMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest, com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NozSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NozSupply"))
              .build();
        }
      }
    }
    return getNozSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryParamsRequest,
      com.stratos.sds.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stratos.sds.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.stratos.sds.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryParamsRequest,
      com.stratos.sds.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.sds.v1.QueryProto.QueryParamsRequest, com.stratos.sds.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.sds.v1.QueryProto.QueryParamsRequest, com.stratos.sds.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.sds.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Query uploaded file info by hash
     * </pre>
     */
    default void fileupload(com.stratos.sds.v1.QueryProto.QueryFileUploadRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileuploadMethod(), responseObserver);
    }

    /**
     */
    default void simPrepay(com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimPrepayMethod(), responseObserver);
    }

    /**
     */
    default void nozPrice(com.stratos.sds.v1.QueryProto.QueryNozPriceRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNozPriceMethod(), responseObserver);
    }

    /**
     */
    default void nozSupply(com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNozSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries SDS module Params info.
     * </pre>
     */
    default void params(com.stratos.sds.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     * Query uploaded file info by hash
     * </pre>
     */
    public void fileupload(com.stratos.sds.v1.QueryProto.QueryFileUploadRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFileuploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simPrepay(com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimPrepayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nozPrice(com.stratos.sds.v1.QueryProto.QueryNozPriceRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNozPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void nozSupply(com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNozSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries SDS module Params info.
     * </pre>
     */
    public void params(com.stratos.sds.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Query uploaded file info by hash
     * </pre>
     */
    public com.stratos.sds.v1.QueryProto.QueryFileUploadResponse fileupload(com.stratos.sds.v1.QueryProto.QueryFileUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFileuploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse simPrepay(com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimPrepayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.sds.v1.QueryProto.QueryNozPriceResponse nozPrice(com.stratos.sds.v1.QueryProto.QueryNozPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNozPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse nozSupply(com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNozSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries SDS module Params info.
     * </pre>
     */
    public com.stratos.sds.v1.QueryProto.QueryParamsResponse params(com.stratos.sds.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Query uploaded file info by hash
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.QueryProto.QueryFileUploadResponse> fileupload(
        com.stratos.sds.v1.QueryProto.QueryFileUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFileuploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse> simPrepay(
        com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimPrepayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.QueryProto.QueryNozPriceResponse> nozPrice(
        com.stratos.sds.v1.QueryProto.QueryNozPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNozPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse> nozSupply(
        com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNozSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries SDS module Params info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.sds.v1.QueryProto.QueryParamsResponse> params(
        com.stratos.sds.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FILEUPLOAD = 0;
  private static final int METHODID_SIM_PREPAY = 1;
  private static final int METHODID_NOZ_PRICE = 2;
  private static final int METHODID_NOZ_SUPPLY = 3;
  private static final int METHODID_PARAMS = 4;

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
        case METHODID_FILEUPLOAD:
          serviceImpl.fileupload((com.stratos.sds.v1.QueryProto.QueryFileUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryFileUploadResponse>) responseObserver);
          break;
        case METHODID_SIM_PREPAY:
          serviceImpl.simPrepay((com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse>) responseObserver);
          break;
        case METHODID_NOZ_PRICE:
          serviceImpl.nozPrice((com.stratos.sds.v1.QueryProto.QueryNozPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozPriceResponse>) responseObserver);
          break;
        case METHODID_NOZ_SUPPLY:
          serviceImpl.nozSupply((com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.stratos.sds.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.sds.v1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getFileuploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.QueryProto.QueryFileUploadRequest,
              com.stratos.sds.v1.QueryProto.QueryFileUploadResponse>(
                service, METHODID_FILEUPLOAD)))
        .addMethod(
          getSimPrepayMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.QueryProto.QuerySimPrepayRequest,
              com.stratos.sds.v1.QueryProto.QuerySimPrepayResponse>(
                service, METHODID_SIM_PREPAY)))
        .addMethod(
          getNozPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.QueryProto.QueryNozPriceRequest,
              com.stratos.sds.v1.QueryProto.QueryNozPriceResponse>(
                service, METHODID_NOZ_PRICE)))
        .addMethod(
          getNozSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.QueryProto.QueryNozSupplyRequest,
              com.stratos.sds.v1.QueryProto.QueryNozSupplyResponse>(
                service, METHODID_NOZ_SUPPLY)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.sds.v1.QueryProto.QueryParamsRequest,
              com.stratos.sds.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.sds.v1.QueryProto.getDescriptor();
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
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getFileuploadMethod())
              .addMethod(getSimPrepayMethod())
              .addMethod(getNozPriceMethod())
              .addMethod(getNozSupplyMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
