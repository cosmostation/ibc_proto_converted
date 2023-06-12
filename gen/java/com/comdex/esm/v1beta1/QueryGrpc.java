package com.comdex.esm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/esm/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.esm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryParamsRequest,
      com.comdex.esm.v1beta1.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.esm.v1beta1.QueryParamsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryParamsRequest,
      com.comdex.esm.v1beta1.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryParamsRequest, com.comdex.esm.v1beta1.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryParamsRequest, com.comdex.esm.v1beta1.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest,
      com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryESMTriggerParams",
      requestType = com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest,
      com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest, com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod;
    if ((getQueryESMTriggerParamsMethod = QueryGrpc.getQueryESMTriggerParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryESMTriggerParamsMethod = QueryGrpc.getQueryESMTriggerParamsMethod) == null) {
          QueryGrpc.getQueryESMTriggerParamsMethod = getQueryESMTriggerParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest, com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryESMTriggerParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryESMTriggerParams"))
              .build();
        }
      }
    }
    return getQueryESMTriggerParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMStatusRequest,
      com.comdex.esm.v1beta1.QueryESMStatusResponse> getQueryESMStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryESMStatus",
      requestType = com.comdex.esm.v1beta1.QueryESMStatusRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryESMStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMStatusRequest,
      com.comdex.esm.v1beta1.QueryESMStatusResponse> getQueryESMStatusMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryESMStatusRequest, com.comdex.esm.v1beta1.QueryESMStatusResponse> getQueryESMStatusMethod;
    if ((getQueryESMStatusMethod = QueryGrpc.getQueryESMStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryESMStatusMethod = QueryGrpc.getQueryESMStatusMethod) == null) {
          QueryGrpc.getQueryESMStatusMethod = getQueryESMStatusMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryESMStatusRequest, com.comdex.esm.v1beta1.QueryESMStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryESMStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryESMStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryESMStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryESMStatus"))
              .build();
        }
      }
    }
    return getQueryESMStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest,
      com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCurrentDepositStats",
      requestType = com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest,
      com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest, com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod;
    if ((getQueryCurrentDepositStatsMethod = QueryGrpc.getQueryCurrentDepositStatsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCurrentDepositStatsMethod = QueryGrpc.getQueryCurrentDepositStatsMethod) == null) {
          QueryGrpc.getQueryCurrentDepositStatsMethod = getQueryCurrentDepositStatsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest, com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCurrentDepositStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCurrentDepositStats"))
              .build();
        }
      }
    }
    return getQueryCurrentDepositStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest,
      com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUsersDepositMapping",
      requestType = com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest,
      com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest, com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod;
    if ((getQueryUsersDepositMappingMethod = QueryGrpc.getQueryUsersDepositMappingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUsersDepositMappingMethod = QueryGrpc.getQueryUsersDepositMappingMethod) == null) {
          QueryGrpc.getQueryUsersDepositMappingMethod = getQueryUsersDepositMappingMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest, com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUsersDepositMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUsersDepositMapping"))
              .build();
        }
      }
    }
    return getQueryUsersDepositMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDataAfterCoolOff",
      requestType = com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod;
    if ((getQueryDataAfterCoolOffMethod = QueryGrpc.getQueryDataAfterCoolOffMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDataAfterCoolOffMethod = QueryGrpc.getQueryDataAfterCoolOffMethod) == null) {
          QueryGrpc.getQueryDataAfterCoolOffMethod = getQueryDataAfterCoolOffMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDataAfterCoolOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDataAfterCoolOff"))
              .build();
        }
      }
    }
    return getQueryDataAfterCoolOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QuerySnapshotPriceRequest,
      com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySnapshotPrice",
      requestType = com.comdex.esm.v1beta1.QuerySnapshotPriceRequest.class,
      responseType = com.comdex.esm.v1beta1.QuerySnapshotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QuerySnapshotPriceRequest,
      com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QuerySnapshotPriceRequest, com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod;
    if ((getQuerySnapshotPriceMethod = QueryGrpc.getQuerySnapshotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySnapshotPriceMethod = QueryGrpc.getQuerySnapshotPriceMethod) == null) {
          QueryGrpc.getQuerySnapshotPriceMethod = getQuerySnapshotPriceMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QuerySnapshotPriceRequest, com.comdex.esm.v1beta1.QuerySnapshotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySnapshotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QuerySnapshotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QuerySnapshotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySnapshotPrice"))
              .build();
        }
      }
    }
    return getQuerySnapshotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetDataAfterCoolOff",
      requestType = com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod;
    if ((getQueryAssetDataAfterCoolOffMethod = QueryGrpc.getQueryAssetDataAfterCoolOffMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetDataAfterCoolOffMethod = QueryGrpc.getQueryAssetDataAfterCoolOffMethod) == null) {
          QueryGrpc.getQueryAssetDataAfterCoolOffMethod = getQueryAssetDataAfterCoolOffMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetDataAfterCoolOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryAssetDataAfterCoolOff"))
              .build();
        }
      }
    }
    return getQueryAssetDataAfterCoolOffMethod;
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
    default void params(com.comdex.esm.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryESMTriggerParams(com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryESMTriggerParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryESMStatus(com.comdex.esm.v1beta1.QueryESMStatusRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryESMStatusMethod(), responseObserver);
    }

    /**
     */
    default void queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCurrentDepositStatsMethod(), responseObserver);
    }

    /**
     */
    default void queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUsersDepositMappingMethod(), responseObserver);
    }

    /**
     */
    default void queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDataAfterCoolOffMethod(), responseObserver);
    }

    /**
     */
    default void querySnapshotPrice(com.comdex.esm.v1beta1.QuerySnapshotPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySnapshotPriceMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAssetDataAfterCoolOffMethod(), responseObserver);
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
    public void params(com.comdex.esm.v1beta1.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryESMTriggerParams(com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryESMTriggerParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryESMStatus(com.comdex.esm.v1beta1.QueryESMStatusRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryESMStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCurrentDepositStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUsersDepositMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDataAfterCoolOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySnapshotPrice(com.comdex.esm.v1beta1.QuerySnapshotPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySnapshotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAssetDataAfterCoolOffMethod(), getCallOptions()), request, responseObserver);
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
    public com.comdex.esm.v1beta1.QueryParamsResponse params(com.comdex.esm.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse queryESMTriggerParams(com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryESMTriggerParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryESMStatusResponse queryESMStatus(com.comdex.esm.v1beta1.QueryESMStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryESMStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCurrentDepositStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUsersDepositMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDataAfterCoolOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QuerySnapshotPriceResponse querySnapshotPrice(com.comdex.esm.v1beta1.QuerySnapshotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySnapshotPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAssetDataAfterCoolOffMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryParamsResponse> params(
        com.comdex.esm.v1beta1.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse> queryESMTriggerParams(
        com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryESMTriggerParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryESMStatusResponse> queryESMStatus(
        com.comdex.esm.v1beta1.QueryESMStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryESMStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse> queryCurrentDepositStats(
        com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCurrentDepositStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse> queryUsersDepositMapping(
        com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUsersDepositMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse> queryDataAfterCoolOff(
        com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDataAfterCoolOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QuerySnapshotPriceResponse> querySnapshotPrice(
        com.comdex.esm.v1beta1.QuerySnapshotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySnapshotPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse> queryAssetDataAfterCoolOff(
        com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAssetDataAfterCoolOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_QUERY_ESMTRIGGER_PARAMS = 1;
  private static final int METHODID_QUERY_ESMSTATUS = 2;
  private static final int METHODID_QUERY_CURRENT_DEPOSIT_STATS = 3;
  private static final int METHODID_QUERY_USERS_DEPOSIT_MAPPING = 4;
  private static final int METHODID_QUERY_DATA_AFTER_COOL_OFF = 5;
  private static final int METHODID_QUERY_SNAPSHOT_PRICE = 6;
  private static final int METHODID_QUERY_ASSET_DATA_AFTER_COOL_OFF = 7;

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
          serviceImpl.params((com.comdex.esm.v1beta1.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ESMTRIGGER_PARAMS:
          serviceImpl.queryESMTriggerParams((com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ESMSTATUS:
          serviceImpl.queryESMStatus((com.comdex.esm.v1beta1.QueryESMStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryESMStatusResponse>) responseObserver);
          break;
        case METHODID_QUERY_CURRENT_DEPOSIT_STATS:
          serviceImpl.queryCurrentDepositStats((com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse>) responseObserver);
          break;
        case METHODID_QUERY_USERS_DEPOSIT_MAPPING:
          serviceImpl.queryUsersDepositMapping((com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse>) responseObserver);
          break;
        case METHODID_QUERY_DATA_AFTER_COOL_OFF:
          serviceImpl.queryDataAfterCoolOff((com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse>) responseObserver);
          break;
        case METHODID_QUERY_SNAPSHOT_PRICE:
          serviceImpl.querySnapshotPrice((com.comdex.esm.v1beta1.QuerySnapshotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QuerySnapshotPriceResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_DATA_AFTER_COOL_OFF:
          serviceImpl.queryAssetDataAfterCoolOff((com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse>) responseObserver);
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
              com.comdex.esm.v1beta1.QueryParamsRequest,
              com.comdex.esm.v1beta1.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryESMTriggerParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryESMTriggerParamsRequest,
              com.comdex.esm.v1beta1.QueryESMTriggerParamsResponse>(
                service, METHODID_QUERY_ESMTRIGGER_PARAMS)))
        .addMethod(
          getQueryESMStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryESMStatusRequest,
              com.comdex.esm.v1beta1.QueryESMStatusResponse>(
                service, METHODID_QUERY_ESMSTATUS)))
        .addMethod(
          getQueryCurrentDepositStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryCurrentDepositStatsRequest,
              com.comdex.esm.v1beta1.QueryCurrentDepositStatsResponse>(
                service, METHODID_QUERY_CURRENT_DEPOSIT_STATS)))
        .addMethod(
          getQueryUsersDepositMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryUsersDepositMappingRequest,
              com.comdex.esm.v1beta1.QueryUsersDepositMappingResponse>(
                service, METHODID_QUERY_USERS_DEPOSIT_MAPPING)))
        .addMethod(
          getQueryDataAfterCoolOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryDataAfterCoolOffRequest,
              com.comdex.esm.v1beta1.QueryDataAfterCoolOffResponse>(
                service, METHODID_QUERY_DATA_AFTER_COOL_OFF)))
        .addMethod(
          getQuerySnapshotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QuerySnapshotPriceRequest,
              com.comdex.esm.v1beta1.QuerySnapshotPriceResponse>(
                service, METHODID_QUERY_SNAPSHOT_PRICE)))
        .addMethod(
          getQueryAssetDataAfterCoolOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffRequest,
              com.comdex.esm.v1beta1.QueryAssetDataAfterCoolOffResponse>(
                service, METHODID_QUERY_ASSET_DATA_AFTER_COOL_OFF)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.esm.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getQueryESMTriggerParamsMethod())
              .addMethod(getQueryESMStatusMethod())
              .addMethod(getQueryCurrentDepositStatsMethod())
              .addMethod(getQueryUsersDepositMappingMethod())
              .addMethod(getQueryDataAfterCoolOffMethod())
              .addMethod(getQuerySnapshotPriceMethod())
              .addMethod(getQueryAssetDataAfterCoolOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
