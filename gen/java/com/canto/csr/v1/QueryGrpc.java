package com.canto.csr.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: canto/csr/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "canto.csr.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryParamsRequest,
      com.canto.csr.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.canto.csr.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.canto.csr.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryParamsRequest,
      com.canto.csr.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryParamsRequest, com.canto.csr.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.canto.csr.v1.QueryProto.QueryParamsRequest, com.canto.csr.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRsRequest,
      com.canto.csr.v1.QueryProto.QueryCSRsResponse> getCSRsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRs",
      requestType = com.canto.csr.v1.QueryProto.QueryCSRsRequest.class,
      responseType = com.canto.csr.v1.QueryProto.QueryCSRsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRsRequest,
      com.canto.csr.v1.QueryProto.QueryCSRsResponse> getCSRsMethod() {
    io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRsRequest, com.canto.csr.v1.QueryProto.QueryCSRsResponse> getCSRsMethod;
    if ((getCSRsMethod = QueryGrpc.getCSRsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRsMethod = QueryGrpc.getCSRsMethod) == null) {
          QueryGrpc.getCSRsMethod = getCSRsMethod =
              io.grpc.MethodDescriptor.<com.canto.csr.v1.QueryProto.QueryCSRsRequest, com.canto.csr.v1.QueryProto.QueryCSRsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRs"))
              .build();
        }
      }
    }
    return getCSRsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest,
      com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> getCSRByNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRByNFT",
      requestType = com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest.class,
      responseType = com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest,
      com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> getCSRByNFTMethod() {
    io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest, com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> getCSRByNFTMethod;
    if ((getCSRByNFTMethod = QueryGrpc.getCSRByNFTMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRByNFTMethod = QueryGrpc.getCSRByNFTMethod) == null) {
          QueryGrpc.getCSRByNFTMethod = getCSRByNFTMethod =
              io.grpc.MethodDescriptor.<com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest, com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRByNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRByNFT"))
              .build();
        }
      }
    }
    return getCSRByNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByContractRequest,
      com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> getCSRByContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSRByContract",
      requestType = com.canto.csr.v1.QueryProto.QueryCSRByContractRequest.class,
      responseType = com.canto.csr.v1.QueryProto.QueryCSRByContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByContractRequest,
      com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> getCSRByContractMethod() {
    io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryCSRByContractRequest, com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> getCSRByContractMethod;
    if ((getCSRByContractMethod = QueryGrpc.getCSRByContractMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCSRByContractMethod = QueryGrpc.getCSRByContractMethod) == null) {
          QueryGrpc.getCSRByContractMethod = getCSRByContractMethod =
              io.grpc.MethodDescriptor.<com.canto.csr.v1.QueryProto.QueryCSRByContractRequest, com.canto.csr.v1.QueryProto.QueryCSRByContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CSRByContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRByContractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryCSRByContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CSRByContract"))
              .build();
        }
      }
    }
    return getCSRByContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryTurnstileRequest,
      com.canto.csr.v1.QueryProto.QueryTurnstileResponse> getTurnstileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Turnstile",
      requestType = com.canto.csr.v1.QueryProto.QueryTurnstileRequest.class,
      responseType = com.canto.csr.v1.QueryProto.QueryTurnstileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryTurnstileRequest,
      com.canto.csr.v1.QueryProto.QueryTurnstileResponse> getTurnstileMethod() {
    io.grpc.MethodDescriptor<com.canto.csr.v1.QueryProto.QueryTurnstileRequest, com.canto.csr.v1.QueryProto.QueryTurnstileResponse> getTurnstileMethod;
    if ((getTurnstileMethod = QueryGrpc.getTurnstileMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTurnstileMethod = QueryGrpc.getTurnstileMethod) == null) {
          QueryGrpc.getTurnstileMethod = getTurnstileMethod =
              io.grpc.MethodDescriptor.<com.canto.csr.v1.QueryProto.QueryTurnstileRequest, com.canto.csr.v1.QueryProto.QueryTurnstileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Turnstile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryTurnstileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.canto.csr.v1.QueryProto.QueryTurnstileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Turnstile"))
              .build();
        }
      }
    }
    return getTurnstileMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.canto.csr.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    default void cSRs(com.canto.csr.v1.QueryProto.QueryCSRsRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCSRsMethod(), responseObserver);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    default void cSRByNFT(com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCSRByNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    default void cSRByContract(com.canto.csr.v1.QueryProto.QueryCSRByContractRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCSRByContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    default void turnstile(com.canto.csr.v1.QueryProto.QueryTurnstileRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryTurnstileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnstileMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.canto.csr.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public void cSRs(com.canto.csr.v1.QueryProto.QueryCSRsRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCSRsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public void cSRByNFT(com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCSRByNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public void cSRByContract(com.canto.csr.v1.QueryProto.QueryCSRByContractRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCSRByContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public void turnstile(com.canto.csr.v1.QueryProto.QueryTurnstileRequest request,
        io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryTurnstileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnstileMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.canto.csr.v1.QueryProto.QueryParamsResponse params(com.canto.csr.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public com.canto.csr.v1.QueryProto.QueryCSRsResponse cSRs(com.canto.csr.v1.QueryProto.QueryCSRsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCSRsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse cSRByNFT(com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCSRByNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public com.canto.csr.v1.QueryProto.QueryCSRByContractResponse cSRByContract(com.canto.csr.v1.QueryProto.QueryCSRByContractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCSRByContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public com.canto.csr.v1.QueryProto.QueryTurnstileResponse turnstile(com.canto.csr.v1.QueryProto.QueryTurnstileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnstileMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.csr.v1.QueryProto.QueryParamsResponse> params(
        com.canto.csr.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query all registered CSRs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.csr.v1.QueryProto.QueryCSRsResponse> cSRs(
        com.canto.csr.v1.QueryProto.QueryCSRsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCSRsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query a specific CSR by the nftId 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse> cSRByNFT(
        com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCSRByNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query a CSR by smart contract address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.csr.v1.QueryProto.QueryCSRByContractResponse> cSRByContract(
        com.canto.csr.v1.QueryProto.QueryCSRByContractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCSRByContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query the turnstile address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.canto.csr.v1.QueryProto.QueryTurnstileResponse> turnstile(
        com.canto.csr.v1.QueryProto.QueryTurnstileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnstileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CSRS = 1;
  private static final int METHODID_CSRBY_NFT = 2;
  private static final int METHODID_CSRBY_CONTRACT = 3;
  private static final int METHODID_TURNSTILE = 4;

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
          serviceImpl.params((com.canto.csr.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CSRS:
          serviceImpl.cSRs((com.canto.csr.v1.QueryProto.QueryCSRsRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRsResponse>) responseObserver);
          break;
        case METHODID_CSRBY_NFT:
          serviceImpl.cSRByNFT((com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse>) responseObserver);
          break;
        case METHODID_CSRBY_CONTRACT:
          serviceImpl.cSRByContract((com.canto.csr.v1.QueryProto.QueryCSRByContractRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryCSRByContractResponse>) responseObserver);
          break;
        case METHODID_TURNSTILE:
          serviceImpl.turnstile((com.canto.csr.v1.QueryProto.QueryTurnstileRequest) request,
              (io.grpc.stub.StreamObserver<com.canto.csr.v1.QueryProto.QueryTurnstileResponse>) responseObserver);
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
              com.canto.csr.v1.QueryProto.QueryParamsRequest,
              com.canto.csr.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCSRsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.csr.v1.QueryProto.QueryCSRsRequest,
              com.canto.csr.v1.QueryProto.QueryCSRsResponse>(
                service, METHODID_CSRS)))
        .addMethod(
          getCSRByNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.csr.v1.QueryProto.QueryCSRByNFTRequest,
              com.canto.csr.v1.QueryProto.QueryCSRByNFTResponse>(
                service, METHODID_CSRBY_NFT)))
        .addMethod(
          getCSRByContractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.csr.v1.QueryProto.QueryCSRByContractRequest,
              com.canto.csr.v1.QueryProto.QueryCSRByContractResponse>(
                service, METHODID_CSRBY_CONTRACT)))
        .addMethod(
          getTurnstileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.canto.csr.v1.QueryProto.QueryTurnstileRequest,
              com.canto.csr.v1.QueryProto.QueryTurnstileResponse>(
                service, METHODID_TURNSTILE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.canto.csr.v1.QueryProto.getDescriptor();
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
              .addMethod(getCSRsMethod())
              .addMethod(getCSRByNFTMethod())
              .addMethod(getCSRByContractMethod())
              .addMethod(getTurnstileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
