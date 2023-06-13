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
  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest, com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest, com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryESMTriggerParams",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest, com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> getQueryESMTriggerParamsMethod;
    if ((getQueryESMTriggerParamsMethod = QueryGrpc.getQueryESMTriggerParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryESMTriggerParamsMethod = QueryGrpc.getQueryESMTriggerParamsMethod) == null) {
          QueryGrpc.getQueryESMTriggerParamsMethod = getQueryESMTriggerParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest, com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryESMTriggerParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryESMTriggerParams"))
              .build();
        }
      }
    }
    return getQueryESMTriggerParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> getQueryESMStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryESMStatus",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> getQueryESMStatusMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest, com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> getQueryESMStatusMethod;
    if ((getQueryESMStatusMethod = QueryGrpc.getQueryESMStatusMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryESMStatusMethod = QueryGrpc.getQueryESMStatusMethod) == null) {
          QueryGrpc.getQueryESMStatusMethod = getQueryESMStatusMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest, com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryESMStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryESMStatus"))
              .build();
        }
      }
    }
    return getQueryESMStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCurrentDepositStats",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest, com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> getQueryCurrentDepositStatsMethod;
    if ((getQueryCurrentDepositStatsMethod = QueryGrpc.getQueryCurrentDepositStatsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryCurrentDepositStatsMethod = QueryGrpc.getQueryCurrentDepositStatsMethod) == null) {
          QueryGrpc.getQueryCurrentDepositStatsMethod = getQueryCurrentDepositStatsMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest, com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryCurrentDepositStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryCurrentDepositStats"))
              .build();
        }
      }
    }
    return getQueryCurrentDepositStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryUsersDepositMapping",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest, com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> getQueryUsersDepositMappingMethod;
    if ((getQueryUsersDepositMappingMethod = QueryGrpc.getQueryUsersDepositMappingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryUsersDepositMappingMethod = QueryGrpc.getQueryUsersDepositMappingMethod) == null) {
          QueryGrpc.getQueryUsersDepositMappingMethod = getQueryUsersDepositMappingMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest, com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryUsersDepositMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryUsersDepositMapping"))
              .build();
        }
      }
    }
    return getQueryUsersDepositMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDataAfterCoolOff",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> getQueryDataAfterCoolOffMethod;
    if ((getQueryDataAfterCoolOffMethod = QueryGrpc.getQueryDataAfterCoolOffMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDataAfterCoolOffMethod = QueryGrpc.getQueryDataAfterCoolOffMethod) == null) {
          QueryGrpc.getQueryDataAfterCoolOffMethod = getQueryDataAfterCoolOffMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDataAfterCoolOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDataAfterCoolOff"))
              .build();
        }
      }
    }
    return getQueryDataAfterCoolOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest,
      com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySnapshotPrice",
      requestType = com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest,
      com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest, com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> getQuerySnapshotPriceMethod;
    if ((getQuerySnapshotPriceMethod = QueryGrpc.getQuerySnapshotPriceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySnapshotPriceMethod = QueryGrpc.getQuerySnapshotPriceMethod) == null) {
          QueryGrpc.getQuerySnapshotPriceMethod = getQuerySnapshotPriceMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest, com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySnapshotPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySnapshotPrice"))
              .build();
        }
      }
    }
    return getQuerySnapshotPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAssetDataAfterCoolOff",
      requestType = com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest.class,
      responseType = com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest,
      com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod() {
    io.grpc.MethodDescriptor<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> getQueryAssetDataAfterCoolOffMethod;
    if ((getQueryAssetDataAfterCoolOffMethod = QueryGrpc.getQueryAssetDataAfterCoolOffMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryAssetDataAfterCoolOffMethod = QueryGrpc.getQueryAssetDataAfterCoolOffMethod) == null) {
          QueryGrpc.getQueryAssetDataAfterCoolOffMethod = getQueryAssetDataAfterCoolOffMethod =
              io.grpc.MethodDescriptor.<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest, com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAssetDataAfterCoolOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse.getDefaultInstance()))
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
    default void params(com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryESMTriggerParams(com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryESMTriggerParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryESMStatus(com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryESMStatusMethod(), responseObserver);
    }

    /**
     */
    default void queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryCurrentDepositStatsMethod(), responseObserver);
    }

    /**
     */
    default void queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryUsersDepositMappingMethod(), responseObserver);
    }

    /**
     */
    default void queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDataAfterCoolOffMethod(), responseObserver);
    }

    /**
     */
    default void querySnapshotPrice(com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySnapshotPriceMethod(), responseObserver);
    }

    /**
     */
    default void queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> responseObserver) {
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
    public void params(com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryESMTriggerParams(com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryESMTriggerParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryESMStatus(com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryESMStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCurrentDepositStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryUsersDepositMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDataAfterCoolOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySnapshotPrice(com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySnapshotPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest request,
        io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> responseObserver) {
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
    public com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse params(com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse queryESMTriggerParams(com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryESMTriggerParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse queryESMStatus(com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryESMStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse queryCurrentDepositStats(com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCurrentDepositStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse queryUsersDepositMapping(com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryUsersDepositMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse queryDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDataAfterCoolOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse querySnapshotPrice(com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySnapshotPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse queryAssetDataAfterCoolOff(com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse> params(
        com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse> queryESMTriggerParams(
        com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryESMTriggerParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse> queryESMStatus(
        com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryESMStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse> queryCurrentDepositStats(
        com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCurrentDepositStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse> queryUsersDepositMapping(
        com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryUsersDepositMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse> queryDataAfterCoolOff(
        com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDataAfterCoolOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse> querySnapshotPrice(
        com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySnapshotPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse> queryAssetDataAfterCoolOff(
        com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest request) {
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
          serviceImpl.params((com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ESMTRIGGER_PARAMS:
          serviceImpl.queryESMTriggerParams((com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ESMSTATUS:
          serviceImpl.queryESMStatus((com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse>) responseObserver);
          break;
        case METHODID_QUERY_CURRENT_DEPOSIT_STATS:
          serviceImpl.queryCurrentDepositStats((com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse>) responseObserver);
          break;
        case METHODID_QUERY_USERS_DEPOSIT_MAPPING:
          serviceImpl.queryUsersDepositMapping((com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse>) responseObserver);
          break;
        case METHODID_QUERY_DATA_AFTER_COOL_OFF:
          serviceImpl.queryDataAfterCoolOff((com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse>) responseObserver);
          break;
        case METHODID_QUERY_SNAPSHOT_PRICE:
          serviceImpl.querySnapshotPrice((com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse>) responseObserver);
          break;
        case METHODID_QUERY_ASSET_DATA_AFTER_COOL_OFF:
          serviceImpl.queryAssetDataAfterCoolOff((com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse>) responseObserver);
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
              com.comdex.esm.v1beta1.QueryProto.QueryParamsRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryESMTriggerParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryESMTriggerParamsResponse>(
                service, METHODID_QUERY_ESMTRIGGER_PARAMS)))
        .addMethod(
          getQueryESMStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryESMStatusRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryESMStatusResponse>(
                service, METHODID_QUERY_ESMSTATUS)))
        .addMethod(
          getQueryCurrentDepositStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryCurrentDepositStatsResponse>(
                service, METHODID_QUERY_CURRENT_DEPOSIT_STATS)))
        .addMethod(
          getQueryUsersDepositMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryUsersDepositMappingResponse>(
                service, METHODID_QUERY_USERS_DEPOSIT_MAPPING)))
        .addMethod(
          getQueryDataAfterCoolOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryDataAfterCoolOffResponse>(
                service, METHODID_QUERY_DATA_AFTER_COOL_OFF)))
        .addMethod(
          getQuerySnapshotPriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceRequest,
              com.comdex.esm.v1beta1.QueryProto.QuerySnapshotPriceResponse>(
                service, METHODID_QUERY_SNAPSHOT_PRICE)))
        .addMethod(
          getQueryAssetDataAfterCoolOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffRequest,
              com.comdex.esm.v1beta1.QueryProto.QueryAssetDataAfterCoolOffResponse>(
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
