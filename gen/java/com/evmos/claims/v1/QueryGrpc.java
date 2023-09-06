package com.evmos.claims.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: evmos/claims/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "evmos.claims.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest,
      com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> getTotalUnclaimedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalUnclaimed",
      requestType = com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest.class,
      responseType = com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest,
      com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> getTotalUnclaimedMethod() {
    io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest, com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> getTotalUnclaimedMethod;
    if ((getTotalUnclaimedMethod = QueryGrpc.getTotalUnclaimedMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalUnclaimedMethod = QueryGrpc.getTotalUnclaimedMethod) == null) {
          QueryGrpc.getTotalUnclaimedMethod = getTotalUnclaimedMethod =
              io.grpc.MethodDescriptor.<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest, com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalUnclaimed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalUnclaimed"))
              .build();
        }
      }
    }
    return getTotalUnclaimedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryParamsRequest,
      com.evmos.claims.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.evmos.claims.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.evmos.claims.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryParamsRequest,
      com.evmos.claims.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryParamsRequest, com.evmos.claims.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.evmos.claims.v1.QueryProto.QueryParamsRequest, com.evmos.claims.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest,
      com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> getClaimsRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimsRecords",
      requestType = com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest.class,
      responseType = com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest,
      com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> getClaimsRecordsMethod() {
    io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest, com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> getClaimsRecordsMethod;
    if ((getClaimsRecordsMethod = QueryGrpc.getClaimsRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimsRecordsMethod = QueryGrpc.getClaimsRecordsMethod) == null) {
          QueryGrpc.getClaimsRecordsMethod = getClaimsRecordsMethod =
              io.grpc.MethodDescriptor.<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest, com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimsRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimsRecords"))
              .build();
        }
      }
    }
    return getClaimsRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest,
      com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> getClaimsRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimsRecord",
      requestType = com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest.class,
      responseType = com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest,
      com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> getClaimsRecordMethod() {
    io.grpc.MethodDescriptor<com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest, com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> getClaimsRecordMethod;
    if ((getClaimsRecordMethod = QueryGrpc.getClaimsRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimsRecordMethod = QueryGrpc.getClaimsRecordMethod) == null) {
          QueryGrpc.getClaimsRecordMethod = getClaimsRecordMethod =
              io.grpc.MethodDescriptor.<com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest, com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimsRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimsRecord"))
              .build();
        }
      }
    }
    return getClaimsRecordMethod;
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
     * TotalUnclaimed queries the total unclaimed tokens from the airdrop
     * </pre>
     */
    default void totalUnclaimed(com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalUnclaimedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns the claims module parameters
     * </pre>
     */
    default void params(com.evmos.claims.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimsRecords returns all claims records
     * </pre>
     */
    default void claimsRecords(com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimsRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimsRecord returns the claims record for a given address
     * </pre>
     */
    default void claimsRecord(com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimsRecordMethod(), responseObserver);
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
     * TotalUnclaimed queries the total unclaimed tokens from the airdrop
     * </pre>
     */
    public void totalUnclaimed(com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalUnclaimedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns the claims module parameters
     * </pre>
     */
    public void params(com.evmos.claims.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimsRecords returns all claims records
     * </pre>
     */
    public void claimsRecords(com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimsRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimsRecord returns the claims record for a given address
     * </pre>
     */
    public void claimsRecord(com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest request,
        io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimsRecordMethod(), getCallOptions()), request, responseObserver);
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
     * TotalUnclaimed queries the total unclaimed tokens from the airdrop
     * </pre>
     */
    public com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse totalUnclaimed(com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalUnclaimedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns the claims module parameters
     * </pre>
     */
    public com.evmos.claims.v1.QueryProto.QueryParamsResponse params(com.evmos.claims.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimsRecords returns all claims records
     * </pre>
     */
    public com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse claimsRecords(com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimsRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimsRecord returns the claims record for a given address
     * </pre>
     */
    public com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse claimsRecord(com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimsRecordMethod(), getCallOptions(), request);
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
     * TotalUnclaimed queries the total unclaimed tokens from the airdrop
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse> totalUnclaimed(
        com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalUnclaimedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns the claims module parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.claims.v1.QueryProto.QueryParamsResponse> params(
        com.evmos.claims.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimsRecords returns all claims records
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse> claimsRecords(
        com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimsRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimsRecord returns the claims record for a given address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse> claimsRecord(
        com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimsRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOTAL_UNCLAIMED = 0;
  private static final int METHODID_PARAMS = 1;
  private static final int METHODID_CLAIMS_RECORDS = 2;
  private static final int METHODID_CLAIMS_RECORD = 3;

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
        case METHODID_TOTAL_UNCLAIMED:
          serviceImpl.totalUnclaimed((com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.evmos.claims.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CLAIMS_RECORDS:
          serviceImpl.claimsRecords((com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse>) responseObserver);
          break;
        case METHODID_CLAIMS_RECORD:
          serviceImpl.claimsRecord((com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse>) responseObserver);
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
          getTotalUnclaimedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedRequest,
              com.evmos.claims.v1.QueryProto.QueryTotalUnclaimedResponse>(
                service, METHODID_TOTAL_UNCLAIMED)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.claims.v1.QueryProto.QueryParamsRequest,
              com.evmos.claims.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getClaimsRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.claims.v1.QueryProto.QueryClaimsRecordsRequest,
              com.evmos.claims.v1.QueryProto.QueryClaimsRecordsResponse>(
                service, METHODID_CLAIMS_RECORDS)))
        .addMethod(
          getClaimsRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.claims.v1.QueryProto.QueryClaimsRecordRequest,
              com.evmos.claims.v1.QueryProto.QueryClaimsRecordResponse>(
                service, METHODID_CLAIMS_RECORD)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evmos.claims.v1.QueryProto.getDescriptor();
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
              .addMethod(getTotalUnclaimedMethod())
              .addMethod(getParamsMethod())
              .addMethod(getClaimsRecordsMethod())
              .addMethod(getClaimsRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
