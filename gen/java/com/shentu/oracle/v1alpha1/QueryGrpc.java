package com.shentu.oracle.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for oracle module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/oracle/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "shentu.oracle.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> getOperatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Operator",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> getOperatorMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> getOperatorMethod;
    if ((getOperatorMethod = QueryGrpc.getOperatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOperatorMethod = QueryGrpc.getOperatorMethod) == null) {
          QueryGrpc.getOperatorMethod = getOperatorMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Operator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Operator"))
              .build();
        }
      }
    }
    return getOperatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> getOperatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Operators",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> getOperatorsMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> getOperatorsMethod;
    if ((getOperatorsMethod = QueryGrpc.getOperatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOperatorsMethod = QueryGrpc.getOperatorsMethod) == null) {
          QueryGrpc.getOperatorsMethod = getOperatorsMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Operators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Operators"))
              .build();
        }
      }
    }
    return getOperatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> getWithdrawsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraws",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> getWithdrawsMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> getWithdrawsMethod;
    if ((getWithdrawsMethod = QueryGrpc.getWithdrawsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawsMethod = QueryGrpc.getWithdrawsMethod) == null) {
          QueryGrpc.getWithdrawsMethod = getWithdrawsMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraws"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Withdraws"))
              .build();
        }
      }
    }
    return getWithdrawsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> getTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Task",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> getTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> getTaskMethod;
    if ((getTaskMethod = QueryGrpc.getTaskMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTaskMethod = QueryGrpc.getTaskMethod) == null) {
          QueryGrpc.getTaskMethod = getTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Task"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Task"))
              .build();
        }
      }
    }
    return getTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> getTxTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TxTask",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> getTxTaskMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> getTxTaskMethod;
    if ((getTxTaskMethod = QueryGrpc.getTxTaskMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTxTaskMethod = QueryGrpc.getTxTaskMethod) == null) {
          QueryGrpc.getTxTaskMethod = getTxTaskMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TxTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TxTask"))
              .build();
        }
      }
    }
    return getTxTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> getResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Response",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> getResponseMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> getResponseMethod;
    if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
          QueryGrpc.getResponseMethod = getResponseMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Response"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Response"))
              .build();
        }
      }
    }
    return getResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> getTxResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TxResponse",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> getTxResponseMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> getTxResponseMethod;
    if ((getTxResponseMethod = QueryGrpc.getTxResponseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTxResponseMethod = QueryGrpc.getTxResponseMethod) == null) {
          QueryGrpc.getTxResponseMethod = getTxResponseMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TxResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TxResponse"))
              .build();
        }
      }
    }
    return getTxResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest.class,
      responseType = com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest,
      com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest, com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse.getDefaultInstance()))
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
   * Query defines the gRPC querier service for oracle module.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void operator(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperatorMethod(), responseObserver);
    }

    /**
     */
    default void operators(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperatorsMethod(), responseObserver);
    }

    /**
     */
    default void withdraws(com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawsMethod(), responseObserver);
    }

    /**
     */
    default void task(com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTaskMethod(), responseObserver);
    }

    /**
     */
    default void txTask(com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTxTaskMethod(), responseObserver);
    }

    /**
     */
    default void response(com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponseMethod(), responseObserver);
    }

    /**
     */
    default void txResponse(com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTxResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the oracle module.
     * </pre>
     */
    default void params(com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for oracle module.
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
   * Query defines the gRPC querier service for oracle module.
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
     */
    public void operator(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOperatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void operators(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOperatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraws(com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void task(com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void txTask(com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTxTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void response(com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void txResponse(com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTxResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the oracle module.
     * </pre>
     */
    public void params(com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for oracle module.
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
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse operator(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOperatorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse operators(com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOperatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse withdraws(com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse task(com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse txTask(com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTxTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse response(com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse txResponse(com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTxResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the oracle module.
     * </pre>
     */
    public com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse params(com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for oracle module.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse> operator(
        com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOperatorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse> operators(
        com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOperatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse> withdraws(
        com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse> task(
        com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse> txTask(
        com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTxTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse> response(
        com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse> txResponse(
        com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTxResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the oracle module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse> params(
        com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPERATOR = 0;
  private static final int METHODID_OPERATORS = 1;
  private static final int METHODID_WITHDRAWS = 2;
  private static final int METHODID_TASK = 3;
  private static final int METHODID_TX_TASK = 4;
  private static final int METHODID_RESPONSE = 5;
  private static final int METHODID_TX_RESPONSE = 6;
  private static final int METHODID_PARAMS = 7;

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
        case METHODID_OPERATOR:
          serviceImpl.operator((com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse>) responseObserver);
          break;
        case METHODID_OPERATORS:
          serviceImpl.operators((com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWS:
          serviceImpl.withdraws((com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse>) responseObserver);
          break;
        case METHODID_TASK:
          serviceImpl.task((com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse>) responseObserver);
          break;
        case METHODID_TX_TASK:
          serviceImpl.txTask((com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse>) responseObserver);
          break;
        case METHODID_RESPONSE:
          serviceImpl.response((com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse>) responseObserver);
          break;
        case METHODID_TX_RESPONSE:
          serviceImpl.txResponse((com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getOperatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorResponse>(
                service, METHODID_OPERATOR)))
        .addMethod(
          getOperatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryOperatorsResponse>(
                service, METHODID_OPERATORS)))
        .addMethod(
          getWithdrawsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryWithdrawsResponse>(
                service, METHODID_WITHDRAWS)))
        .addMethod(
          getTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryTaskRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryTaskResponse>(
                service, METHODID_TASK)))
        .addMethod(
          getTxTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryTxTaskResponse>(
                service, METHODID_TX_TASK)))
        .addMethod(
          getResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryResponseRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryResponseResponse>(
                service, METHODID_RESPONSE)))
        .addMethod(
          getTxResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryTxResponseResponse>(
                service, METHODID_TX_RESPONSE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.oracle.v1alpha1.QueryProto.QueryParamsRequest,
              com.shentu.oracle.v1alpha1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.oracle.v1alpha1.QueryProto.getDescriptor();
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
              .addMethod(getOperatorMethod())
              .addMethod(getOperatorsMethod())
              .addMethod(getWithdrawsMethod())
              .addMethod(getTaskMethod())
              .addMethod(getTxTaskMethod())
              .addMethod(getResponseMethod())
              .addMethod(getTxResponseMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
