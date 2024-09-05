package com.osmosis.txfees.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/txfees/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.txfees.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> getFeeTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeTokens",
      requestType = com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest.class,
      responseType = com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> getFeeTokensMethod() {
    io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> getFeeTokensMethod;
    if ((getFeeTokensMethod = QueryGrpc.getFeeTokensMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeTokensMethod = QueryGrpc.getFeeTokensMethod) == null) {
          QueryGrpc.getFeeTokensMethod = getFeeTokensMethod =
              io.grpc.MethodDescriptor.<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeTokens"))
              .build();
        }
      }
    }
    return getFeeTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> getDenomSpotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomSpotPrice",
      requestType = com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest.class,
      responseType = com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> getDenomSpotPriceMethod() {
    io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> getDenomSpotPriceMethod;
    if ((getDenomSpotPriceMethod = QueryGrpc.getDenomSpotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomSpotPriceMethod = QueryGrpc.getDenomSpotPriceMethod) == null) {
          QueryGrpc.getDenomSpotPriceMethod = getDenomSpotPriceMethod =
              io.grpc.MethodDescriptor.<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomSpotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomSpotPrice"))
              .build();
        }
      }
    }
    return getDenomSpotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> getDenomPoolIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomPoolId",
      requestType = com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest.class,
      responseType = com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> getDenomPoolIdMethod() {
    io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> getDenomPoolIdMethod;
    if ((getDenomPoolIdMethod = QueryGrpc.getDenomPoolIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomPoolIdMethod = QueryGrpc.getDenomPoolIdMethod) == null) {
          QueryGrpc.getDenomPoolIdMethod = getDenomPoolIdMethod =
              io.grpc.MethodDescriptor.<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomPoolId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomPoolId"))
              .build();
        }
      }
    }
    return getDenomPoolIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> getBaseDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BaseDenom",
      requestType = com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest.class,
      responseType = com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> getBaseDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> getBaseDenomMethod;
    if ((getBaseDenomMethod = QueryGrpc.getBaseDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBaseDenomMethod = QueryGrpc.getBaseDenomMethod) == null) {
          QueryGrpc.getBaseDenomMethod = getBaseDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BaseDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BaseDenom"))
              .build();
        }
      }
    }
    return getBaseDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> getGetEipBaseFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEipBaseFee",
      requestType = com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest.class,
      responseType = com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest,
      com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> getGetEipBaseFeeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> getGetEipBaseFeeMethod;
    if ((getGetEipBaseFeeMethod = QueryGrpc.getGetEipBaseFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetEipBaseFeeMethod = QueryGrpc.getGetEipBaseFeeMethod) == null) {
          QueryGrpc.getGetEipBaseFeeMethod = getGetEipBaseFeeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest, com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEipBaseFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetEipBaseFee"))
              .build();
        }
      }
    }
    return getGetEipBaseFeeMethod;
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
     * <pre>
     * FeeTokens returns a list of all the whitelisted fee tokens and their
     * corresponding pools. It does not include the BaseDenom, which has its own
     * query endpoint
     * </pre>
     */
    default void feeTokens(com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * DenomSpotPrice returns all spot prices by each registered token denom.
     * </pre>
     */
    default void denomSpotPrice(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomSpotPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the poolID for a specified denom input.
     * </pre>
     */
    default void denomPoolId(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomPoolIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    default void baseDenom(com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBaseDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    default void getEipBaseFee(com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEipBaseFeeMethod(), responseObserver);
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
     * <pre>
     * FeeTokens returns a list of all the whitelisted fee tokens and their
     * corresponding pools. It does not include the BaseDenom, which has its own
     * query endpoint
     * </pre>
     */
    public void feeTokens(com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DenomSpotPrice returns all spot prices by each registered token denom.
     * </pre>
     */
    public void denomSpotPrice(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomSpotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the poolID for a specified denom input.
     * </pre>
     */
    public void denomPoolId(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomPoolIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public void baseDenom(com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBaseDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public void getEipBaseFee(com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEipBaseFeeMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * FeeTokens returns a list of all the whitelisted fee tokens and their
     * corresponding pools. It does not include the BaseDenom, which has its own
     * query endpoint
     * </pre>
     */
    public com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse feeTokens(com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DenomSpotPrice returns all spot prices by each registered token denom.
     * </pre>
     */
    public com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse denomSpotPrice(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomSpotPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the poolID for a specified denom input.
     * </pre>
     */
    public com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse denomPoolId(com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomPoolIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse baseDenom(com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBaseDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse getEipBaseFee(com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEipBaseFeeMethod(), getCallOptions(), request);
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
     * <pre>
     * FeeTokens returns a list of all the whitelisted fee tokens and their
     * corresponding pools. It does not include the BaseDenom, which has its own
     * query endpoint
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse> feeTokens(
        com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DenomSpotPrice returns all spot prices by each registered token denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse> denomSpotPrice(
        com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomSpotPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the poolID for a specified denom input.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse> denomPoolId(
        com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomPoolIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse> baseDenom(
        com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBaseDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of all base denom tokens and their corresponding pools.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse> getEipBaseFee(
        com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEipBaseFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEE_TOKENS = 0;
  private static final int METHODID_DENOM_SPOT_PRICE = 1;
  private static final int METHODID_DENOM_POOL_ID = 2;
  private static final int METHODID_BASE_DENOM = 3;
  private static final int METHODID_GET_EIP_BASE_FEE = 4;

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
        case METHODID_FEE_TOKENS:
          serviceImpl.feeTokens((com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse>) responseObserver);
          break;
        case METHODID_DENOM_SPOT_PRICE:
          serviceImpl.denomSpotPrice((com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse>) responseObserver);
          break;
        case METHODID_DENOM_POOL_ID:
          serviceImpl.denomPoolId((com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse>) responseObserver);
          break;
        case METHODID_BASE_DENOM:
          serviceImpl.baseDenom((com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse>) responseObserver);
          break;
        case METHODID_GET_EIP_BASE_FEE:
          serviceImpl.getEipBaseFee((com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse>) responseObserver);
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
          getFeeTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensRequest,
              com.osmosis.txfees.v1beta1.QueryProto.QueryFeeTokensResponse>(
                service, METHODID_FEE_TOKENS)))
        .addMethod(
          getDenomSpotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceRequest,
              com.osmosis.txfees.v1beta1.QueryProto.QueryDenomSpotPriceResponse>(
                service, METHODID_DENOM_SPOT_PRICE)))
        .addMethod(
          getDenomPoolIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdRequest,
              com.osmosis.txfees.v1beta1.QueryProto.QueryDenomPoolIdResponse>(
                service, METHODID_DENOM_POOL_ID)))
        .addMethod(
          getBaseDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomRequest,
              com.osmosis.txfees.v1beta1.QueryProto.QueryBaseDenomResponse>(
                service, METHODID_BASE_DENOM)))
        .addMethod(
          getGetEipBaseFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeRequest,
              com.osmosis.txfees.v1beta1.QueryProto.QueryEipBaseFeeResponse>(
                service, METHODID_GET_EIP_BASE_FEE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.txfees.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getFeeTokensMethod())
              .addMethod(getDenomSpotPriceMethod())
              .addMethod(getDenomPoolIdMethod())
              .addMethod(getBaseDenomMethod())
              .addMethod(getGetEipBaseFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
