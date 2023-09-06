package com.quicksilver.airdrop.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: quicksilver/airdrop/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "quicksilver.airdrop.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> getZoneDropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneDrop",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> getZoneDropMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest, com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> getZoneDropMethod;
    if ((getZoneDropMethod = QueryGrpc.getZoneDropMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneDropMethod = QueryGrpc.getZoneDropMethod) == null) {
          QueryGrpc.getZoneDropMethod = getZoneDropMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest, com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneDrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneDrop"))
              .build();
        }
      }
    }
    return getZoneDropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> getAccountBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountBalance",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> getAccountBalanceMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest, com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> getAccountBalanceMethod;
    if ((getAccountBalanceMethod = QueryGrpc.getAccountBalanceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountBalanceMethod = QueryGrpc.getAccountBalanceMethod) == null) {
          QueryGrpc.getAccountBalanceMethod = getAccountBalanceMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest, com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountBalance"))
              .build();
        }
      }
    }
    return getAccountBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> getZoneDropsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneDrops",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> getZoneDropsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> getZoneDropsMethod;
    if ((getZoneDropsMethod = QueryGrpc.getZoneDropsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneDropsMethod = QueryGrpc.getZoneDropsMethod) == null) {
          QueryGrpc.getZoneDropsMethod = getZoneDropsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneDrops"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneDrops"))
              .build();
        }
      }
    }
    return getZoneDropsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecord",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest, com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod;
    if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
          QueryGrpc.getClaimRecordMethod = getClaimRecordMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest, com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecord"))
              .build();
        }
      }
    }
    return getClaimRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> getClaimRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecords",
      requestType = com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest.class,
      responseType = com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest,
      com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> getClaimRecordsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> getClaimRecordsMethod;
    if ((getClaimRecordsMethod = QueryGrpc.getClaimRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordsMethod = QueryGrpc.getClaimRecordsMethod) == null) {
          QueryGrpc.getClaimRecordsMethod = getClaimRecordsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest, com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecords"))
              .build();
        }
      }
    }
    return getClaimRecordsMethod;
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
   * Query provides defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    default void params(com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    default void zoneDrop(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoneDropMethod(), responseObserver);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    default void accountBalance(com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    default void zoneDrops(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoneDropsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    default void claimRecord(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    default void claimRecords(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRecordsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
   * Query provides defines the gRPC querier service.
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public void params(com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public void zoneDrop(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoneDropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public void accountBalance(com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public void zoneDrops(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoneDropsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public void claimRecord(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public void claimRecords(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse params(com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse zoneDrop(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoneDropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse accountBalance(com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse zoneDrops(com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoneDropsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse claimRecord(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse claimRecords(com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service.
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
     * Params returns the total set of airdrop parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse> params(
        com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ZoneDrop returns the details of the specified zone airdrop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse> zoneDrop(
        com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoneDropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AccountBalance returns the module account balance of the specified zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse> accountBalance(
        com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountBalanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ZoneDrops returns all zone airdrops of the specified status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse> zoneDrops(
        com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoneDropsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record that corresponds to the given zone and
     * address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse> claimRecord(
        com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRecords returns all the claim records of the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse> claimRecords(
        com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ZONE_DROP = 1;
  private static final int METHODID_ACCOUNT_BALANCE = 2;
  private static final int METHODID_ZONE_DROPS = 3;
  private static final int METHODID_CLAIM_RECORD = 4;
  private static final int METHODID_CLAIM_RECORDS = 5;

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
          serviceImpl.params((com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ZONE_DROP:
          serviceImpl.zoneDrop((com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_BALANCE:
          serviceImpl.accountBalance((com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse>) responseObserver);
          break;
        case METHODID_ZONE_DROPS:
          serviceImpl.zoneDrops((com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORD:
          serviceImpl.claimRecord((com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORDS:
          serviceImpl.claimRecords((com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse>) responseObserver);
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
              com.quicksilver.airdrop.v1.QueryProto.QueryParamsRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getZoneDropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropResponse>(
                service, METHODID_ZONE_DROP)))
        .addMethod(
          getAccountBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryAccountBalanceResponse>(
                service, METHODID_ACCOUNT_BALANCE)))
        .addMethod(
          getZoneDropsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryZoneDropsResponse>(
                service, METHODID_ZONE_DROPS)))
        .addMethod(
          getClaimRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordResponse>(
                service, METHODID_CLAIM_RECORD)))
        .addMethod(
          getClaimRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsRequest,
              com.quicksilver.airdrop.v1.QueryProto.QueryClaimRecordsResponse>(
                service, METHODID_CLAIM_RECORDS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.quicksilver.airdrop.v1.QueryProto.getDescriptor();
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
              .addMethod(getZoneDropMethod())
              .addMethod(getAccountBalanceMethod())
              .addMethod(getZoneDropsMethod())
              .addMethod(getClaimRecordMethod())
              .addMethod(getClaimRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
