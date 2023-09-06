package com.panacea.datapool.v2alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: panacea/datapool/v2alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "panacea.datapool.v2alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> getPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Pool",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> getPoolMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> getPoolMethod;
    if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoolMethod = QueryGrpc.getPoolMethod) == null) {
          QueryGrpc.getPoolMethod = getPoolMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Pool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Pool"))
              .build();
        }
      }
    }
    return getPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> getDataPoolParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataPoolParams",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> getDataPoolParamsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> getDataPoolParamsMethod;
    if ((getDataPoolParamsMethod = QueryGrpc.getDataPoolParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataPoolParamsMethod = QueryGrpc.getDataPoolParamsMethod) == null) {
          QueryGrpc.getDataPoolParamsMethod = getDataPoolParamsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataPoolParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataPoolParams"))
              .build();
        }
      }
    }
    return getDataPoolParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> getDataPoolModuleAddrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataPoolModuleAddr",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> getDataPoolModuleAddrMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> getDataPoolModuleAddrMethod;
    if ((getDataPoolModuleAddrMethod = QueryGrpc.getDataPoolModuleAddrMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataPoolModuleAddrMethod = QueryGrpc.getDataPoolModuleAddrMethod) == null) {
          QueryGrpc.getDataPoolModuleAddrMethod = getDataPoolModuleAddrMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataPoolModuleAddr"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataPoolModuleAddr"))
              .build();
        }
      }
    }
    return getDataPoolModuleAddrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataCerts",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> getDataCertsMethod;
    if ((getDataCertsMethod = QueryGrpc.getDataCertsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataCertsMethod = QueryGrpc.getDataCertsMethod) == null) {
          QueryGrpc.getDataCertsMethod = getDataCertsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataCerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataCerts"))
              .build();
        }
      }
    }
    return getDataCertsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> getDataPassRedeemReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataPassRedeemReceipt",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> getDataPassRedeemReceiptMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> getDataPassRedeemReceiptMethod;
    if ((getDataPassRedeemReceiptMethod = QueryGrpc.getDataPassRedeemReceiptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataPassRedeemReceiptMethod = QueryGrpc.getDataPassRedeemReceiptMethod) == null) {
          QueryGrpc.getDataPassRedeemReceiptMethod = getDataPassRedeemReceiptMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataPassRedeemReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataPassRedeemReceipt"))
              .build();
        }
      }
    }
    return getDataPassRedeemReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> getDataPassRedeemReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataPassRedeemReceipts",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> getDataPassRedeemReceiptsMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> getDataPassRedeemReceiptsMethod;
    if ((getDataPassRedeemReceiptsMethod = QueryGrpc.getDataPassRedeemReceiptsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataPassRedeemReceiptsMethod = QueryGrpc.getDataPassRedeemReceiptsMethod) == null) {
          QueryGrpc.getDataPassRedeemReceiptsMethod = getDataPassRedeemReceiptsMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataPassRedeemReceipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataPassRedeemReceipts"))
              .build();
        }
      }
    }
    return getDataPassRedeemReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> getDataPassRedeemHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataPassRedeemHistory",
      requestType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest.class,
      responseType = com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest,
      com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> getDataPassRedeemHistoryMethod() {
    io.grpc.MethodDescriptor<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> getDataPassRedeemHistoryMethod;
    if ((getDataPassRedeemHistoryMethod = QueryGrpc.getDataPassRedeemHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDataPassRedeemHistoryMethod = QueryGrpc.getDataPassRedeemHistoryMethod) == null) {
          QueryGrpc.getDataPassRedeemHistoryMethod = getDataPassRedeemHistoryMethod =
              io.grpc.MethodDescriptor.<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest, com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataPassRedeemHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DataPassRedeemHistory"))
              .build();
        }
      }
    }
    return getDataPassRedeemHistoryMethod;
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
     * Pool returns a Pool.
     * </pre>
     */
    default void pool(com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataPoolParams returns params of x/datapool module.
     * </pre>
     */
    default void dataPoolParams(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataPoolParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataPoolModuleAddr returns x/datapool module address.
     * </pre>
     */
    default void dataPoolModuleAddr(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataPoolModuleAddrMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataCert returns DataCerts
     * </pre>
     */
    default void dataCerts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataCertsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemReceipt returns DataPassRedeemReceipt
     * </pre>
     */
    default void dataPassRedeemReceipt(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataPassRedeemReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemReceipts returns DataPassRedeemReceipts
     * </pre>
     */
    default void dataPassRedeemReceipts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataPassRedeemReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemHistory returns a list of DataPassRedeemHistories
     * </pre>
     */
    default void dataPassRedeemHistory(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataPassRedeemHistoryMethod(), responseObserver);
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
     * Pool returns a Pool.
     * </pre>
     */
    public void pool(com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataPoolParams returns params of x/datapool module.
     * </pre>
     */
    public void dataPoolParams(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataPoolParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataPoolModuleAddr returns x/datapool module address.
     * </pre>
     */
    public void dataPoolModuleAddr(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataPoolModuleAddrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataCert returns DataCerts
     * </pre>
     */
    public void dataCerts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataCertsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemReceipt returns DataPassRedeemReceipt
     * </pre>
     */
    public void dataPassRedeemReceipt(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataPassRedeemReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemReceipts returns DataPassRedeemReceipts
     * </pre>
     */
    public void dataPassRedeemReceipts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataPassRedeemReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DataPassRedeemHistory returns a list of DataPassRedeemHistories
     * </pre>
     */
    public void dataPassRedeemHistory(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest request,
        io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataPassRedeemHistoryMethod(), getCallOptions()), request, responseObserver);
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
     * Pool returns a Pool.
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse pool(com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataPoolParams returns params of x/datapool module.
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse dataPoolParams(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataPoolParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataPoolModuleAddr returns x/datapool module address.
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse dataPoolModuleAddr(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataPoolModuleAddrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataCert returns DataCerts
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse dataCerts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataCertsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataPassRedeemReceipt returns DataPassRedeemReceipt
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse dataPassRedeemReceipt(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataPassRedeemReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataPassRedeemReceipts returns DataPassRedeemReceipts
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse dataPassRedeemReceipts(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataPassRedeemReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DataPassRedeemHistory returns a list of DataPassRedeemHistories
     * </pre>
     */
    public com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse dataPassRedeemHistory(com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataPassRedeemHistoryMethod(), getCallOptions(), request);
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
     * Pool returns a Pool.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse> pool(
        com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataPoolParams returns params of x/datapool module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse> dataPoolParams(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataPoolParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataPoolModuleAddr returns x/datapool module address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse> dataPoolModuleAddr(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataPoolModuleAddrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataCert returns DataCerts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse> dataCerts(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataCertsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataPassRedeemReceipt returns DataPassRedeemReceipt
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse> dataPassRedeemReceipt(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataPassRedeemReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataPassRedeemReceipts returns DataPassRedeemReceipts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse> dataPassRedeemReceipts(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataPassRedeemReceiptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DataPassRedeemHistory returns a list of DataPassRedeemHistories
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse> dataPassRedeemHistory(
        com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataPassRedeemHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POOL = 0;
  private static final int METHODID_DATA_POOL_PARAMS = 1;
  private static final int METHODID_DATA_POOL_MODULE_ADDR = 2;
  private static final int METHODID_DATA_CERTS = 3;
  private static final int METHODID_DATA_PASS_REDEEM_RECEIPT = 4;
  private static final int METHODID_DATA_PASS_REDEEM_RECEIPTS = 5;
  private static final int METHODID_DATA_PASS_REDEEM_HISTORY = 6;

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
        case METHODID_POOL:
          serviceImpl.pool((com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse>) responseObserver);
          break;
        case METHODID_DATA_POOL_PARAMS:
          serviceImpl.dataPoolParams((com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse>) responseObserver);
          break;
        case METHODID_DATA_POOL_MODULE_ADDR:
          serviceImpl.dataPoolModuleAddr((com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse>) responseObserver);
          break;
        case METHODID_DATA_CERTS:
          serviceImpl.dataCerts((com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse>) responseObserver);
          break;
        case METHODID_DATA_PASS_REDEEM_RECEIPT:
          serviceImpl.dataPassRedeemReceipt((com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse>) responseObserver);
          break;
        case METHODID_DATA_PASS_REDEEM_RECEIPTS:
          serviceImpl.dataPassRedeemReceipts((com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse>) responseObserver);
          break;
        case METHODID_DATA_PASS_REDEEM_HISTORY:
          serviceImpl.dataPassRedeemHistory((com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse>) responseObserver);
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
          getPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryPoolRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryPoolResponse>(
                service, METHODID_POOL)))
        .addMethod(
          getDataPoolParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolParamsResponse>(
                service, METHODID_DATA_POOL_PARAMS)))
        .addMethod(
          getDataPoolModuleAddrMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPoolModuleAddrResponse>(
                service, METHODID_DATA_POOL_MODULE_ADDR)))
        .addMethod(
          getDataCertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataCertsResponse>(
                service, METHODID_DATA_CERTS)))
        .addMethod(
          getDataPassRedeemReceiptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptResponse>(
                service, METHODID_DATA_PASS_REDEEM_RECEIPT)))
        .addMethod(
          getDataPassRedeemReceiptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemReceiptsResponse>(
                service, METHODID_DATA_PASS_REDEEM_RECEIPTS)))
        .addMethod(
          getDataPassRedeemHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryRequest,
              com.panacea.datapool.v2alpha1.QueryProto.QueryDataPassRedeemHistoryResponse>(
                service, METHODID_DATA_PASS_REDEEM_HISTORY)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.panacea.datapool.v2alpha1.QueryProto.getDescriptor();
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
              .addMethod(getPoolMethod())
              .addMethod(getDataPoolParamsMethod())
              .addMethod(getDataPoolModuleAddrMethod())
              .addMethod(getDataCertsMethod())
              .addMethod(getDataPassRedeemReceiptMethod())
              .addMethod(getDataPassRedeemReceiptsMethod())
              .addMethod(getDataPassRedeemHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
