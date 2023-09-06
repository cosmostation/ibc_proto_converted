package com.archway.rewards.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query service for the tracking module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: archway/rewards/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "archway.rewards.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryParamsRequest,
      com.archway.rewards.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.archway.rewards.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryParamsRequest,
      com.archway.rewards.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryParamsRequest, com.archway.rewards.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryParamsRequest, com.archway.rewards.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest,
      com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> getContractMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractMetadata",
      requestType = com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest,
      com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> getContractMetadataMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest, com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> getContractMetadataMethod;
    if ((getContractMetadataMethod = QueryGrpc.getContractMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractMetadataMethod = QueryGrpc.getContractMetadataMethod) == null) {
          QueryGrpc.getContractMetadataMethod = getContractMetadataMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest, com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractMetadata"))
              .build();
        }
      }
    }
    return getContractMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest,
      com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> getBlockRewardsTrackingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockRewardsTracking",
      requestType = com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest,
      com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> getBlockRewardsTrackingMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest, com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> getBlockRewardsTrackingMethod;
    if ((getBlockRewardsTrackingMethod = QueryGrpc.getBlockRewardsTrackingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBlockRewardsTrackingMethod = QueryGrpc.getBlockRewardsTrackingMethod) == null) {
          QueryGrpc.getBlockRewardsTrackingMethod = getBlockRewardsTrackingMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest, com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BlockRewardsTracking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BlockRewardsTracking"))
              .build();
        }
      }
    }
    return getBlockRewardsTrackingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest,
      com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> getRewardsPoolMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsPool",
      requestType = com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest,
      com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> getRewardsPoolMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest, com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> getRewardsPoolMethod;
    if ((getRewardsPoolMethod = QueryGrpc.getRewardsPoolMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsPoolMethod = QueryGrpc.getRewardsPoolMethod) == null) {
          QueryGrpc.getRewardsPoolMethod = getRewardsPoolMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest, com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsPool"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsPool"))
              .build();
        }
      }
    }
    return getRewardsPoolMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest,
      com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> getEstimateTxFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstimateTxFees",
      requestType = com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest,
      com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> getEstimateTxFeesMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest, com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> getEstimateTxFeesMethod;
    if ((getEstimateTxFeesMethod = QueryGrpc.getEstimateTxFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEstimateTxFeesMethod = QueryGrpc.getEstimateTxFeesMethod) == null) {
          QueryGrpc.getEstimateTxFeesMethod = getEstimateTxFeesMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest, com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstimateTxFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EstimateTxFees"))
              .build();
        }
      }
    }
    return getEstimateTxFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest,
      com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> getRewardsRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsRecords",
      requestType = com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest,
      com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> getRewardsRecordsMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest, com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> getRewardsRecordsMethod;
    if ((getRewardsRecordsMethod = QueryGrpc.getRewardsRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsRecordsMethod = QueryGrpc.getRewardsRecordsMethod) == null) {
          QueryGrpc.getRewardsRecordsMethod = getRewardsRecordsMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest, com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsRecords"))
              .build();
        }
      }
    }
    return getRewardsRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest,
      com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> getOutstandingRewardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutstandingRewards",
      requestType = com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest,
      com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> getOutstandingRewardsMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest, com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> getOutstandingRewardsMethod;
    if ((getOutstandingRewardsMethod = QueryGrpc.getOutstandingRewardsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getOutstandingRewardsMethod = QueryGrpc.getOutstandingRewardsMethod) == null) {
          QueryGrpc.getOutstandingRewardsMethod = getOutstandingRewardsMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest, com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutstandingRewards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("OutstandingRewards"))
              .build();
        }
      }
    }
    return getOutstandingRewardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest,
      com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> getFlatFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlatFee",
      requestType = com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest.class,
      responseType = com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest,
      com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> getFlatFeeMethod() {
    io.grpc.MethodDescriptor<com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest, com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> getFlatFeeMethod;
    if ((getFlatFeeMethod = QueryGrpc.getFlatFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFlatFeeMethod = QueryGrpc.getFlatFeeMethod) == null) {
          QueryGrpc.getFlatFeeMethod = getFlatFeeMethod =
              io.grpc.MethodDescriptor.<com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest, com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlatFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FlatFee"))
              .build();
        }
      }
    }
    return getFlatFeeMethod;
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
   * Query service for the tracking module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params returns module parameters.
     * </pre>
     */
    default void params(com.archway.rewards.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractMetadata returns the contract rewards parameters (metadata).
     * </pre>
     */
    default void contractMetadata(com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * BlockRewardsTracking returns block rewards tracking for the current block.
     * </pre>
     */
    default void blockRewardsTracking(com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBlockRewardsTrackingMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsPool returns the current undistributed rewards pool funds.
     * </pre>
     */
    default void rewardsPool(com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsPoolMethod(), responseObserver);
    }

    /**
     * <pre>
     * EstimateTxFees returns the estimated transaction fees for the given
     * transaction gas limit using the minimum consensus fee value for the current
     * block.
     * </pre>
     */
    default void estimateTxFees(com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEstimateTxFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsRecords returns the paginated list of RewardsRecord objects stored
     * for the provided rewards_address.
     * </pre>
     */
    default void rewardsRecords(com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * OutstandingRewards returns total rewards credited from different contracts
     * for the provided rewards_address.
     * </pre>
     */
    default void outstandingRewards(com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutstandingRewardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * FlatFee returns the flat fee set by the contract owner for the provided
     * contract_address
     * </pre>
     */
    default void flatFee(com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlatFeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query service for the tracking module.
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
   * Query service for the tracking module.
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
     * Params returns module parameters.
     * </pre>
     */
    public void params(com.archway.rewards.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractMetadata returns the contract rewards parameters (metadata).
     * </pre>
     */
    public void contractMetadata(com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BlockRewardsTracking returns block rewards tracking for the current block.
     * </pre>
     */
    public void blockRewardsTracking(com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBlockRewardsTrackingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsPool returns the current undistributed rewards pool funds.
     * </pre>
     */
    public void rewardsPool(com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsPoolMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EstimateTxFees returns the estimated transaction fees for the given
     * transaction gas limit using the minimum consensus fee value for the current
     * block.
     * </pre>
     */
    public void estimateTxFees(com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEstimateTxFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsRecords returns the paginated list of RewardsRecord objects stored
     * for the provided rewards_address.
     * </pre>
     */
    public void rewardsRecords(com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OutstandingRewards returns total rewards credited from different contracts
     * for the provided rewards_address.
     * </pre>
     */
    public void outstandingRewards(com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutstandingRewardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FlatFee returns the flat fee set by the contract owner for the provided
     * contract_address
     * </pre>
     */
    public void flatFee(com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest request,
        io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlatFeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query service for the tracking module.
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
     * Params returns module parameters.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryParamsResponse params(com.archway.rewards.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractMetadata returns the contract rewards parameters (metadata).
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse contractMetadata(com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BlockRewardsTracking returns block rewards tracking for the current block.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse blockRewardsTracking(com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBlockRewardsTrackingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsPool returns the current undistributed rewards pool funds.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse rewardsPool(com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsPoolMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EstimateTxFees returns the estimated transaction fees for the given
     * transaction gas limit using the minimum consensus fee value for the current
     * block.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse estimateTxFees(com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEstimateTxFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsRecords returns the paginated list of RewardsRecord objects stored
     * for the provided rewards_address.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse rewardsRecords(com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OutstandingRewards returns total rewards credited from different contracts
     * for the provided rewards_address.
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse outstandingRewards(com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutstandingRewardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FlatFee returns the flat fee set by the contract owner for the provided
     * contract_address
     * </pre>
     */
    public com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse flatFee(com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlatFeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query service for the tracking module.
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
     * Params returns module parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryParamsResponse> params(
        com.archway.rewards.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractMetadata returns the contract rewards parameters (metadata).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse> contractMetadata(
        com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BlockRewardsTracking returns block rewards tracking for the current block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse> blockRewardsTracking(
        com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBlockRewardsTrackingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsPool returns the current undistributed rewards pool funds.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse> rewardsPool(
        com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsPoolMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EstimateTxFees returns the estimated transaction fees for the given
     * transaction gas limit using the minimum consensus fee value for the current
     * block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse> estimateTxFees(
        com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEstimateTxFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsRecords returns the paginated list of RewardsRecord objects stored
     * for the provided rewards_address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse> rewardsRecords(
        com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OutstandingRewards returns total rewards credited from different contracts
     * for the provided rewards_address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse> outstandingRewards(
        com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutstandingRewardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FlatFee returns the flat fee set by the contract owner for the provided
     * contract_address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse> flatFee(
        com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlatFeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CONTRACT_METADATA = 1;
  private static final int METHODID_BLOCK_REWARDS_TRACKING = 2;
  private static final int METHODID_REWARDS_POOL = 3;
  private static final int METHODID_ESTIMATE_TX_FEES = 4;
  private static final int METHODID_REWARDS_RECORDS = 5;
  private static final int METHODID_OUTSTANDING_REWARDS = 6;
  private static final int METHODID_FLAT_FEE = 7;

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
          serviceImpl.params((com.archway.rewards.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_METADATA:
          serviceImpl.contractMetadata((com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse>) responseObserver);
          break;
        case METHODID_BLOCK_REWARDS_TRACKING:
          serviceImpl.blockRewardsTracking((com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse>) responseObserver);
          break;
        case METHODID_REWARDS_POOL:
          serviceImpl.rewardsPool((com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse>) responseObserver);
          break;
        case METHODID_ESTIMATE_TX_FEES:
          serviceImpl.estimateTxFees((com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse>) responseObserver);
          break;
        case METHODID_REWARDS_RECORDS:
          serviceImpl.rewardsRecords((com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse>) responseObserver);
          break;
        case METHODID_OUTSTANDING_REWARDS:
          serviceImpl.outstandingRewards((com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse>) responseObserver);
          break;
        case METHODID_FLAT_FEE:
          serviceImpl.flatFee((com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse>) responseObserver);
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
              com.archway.rewards.v1.QueryProto.QueryParamsRequest,
              com.archway.rewards.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getContractMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryContractMetadataRequest,
              com.archway.rewards.v1.QueryProto.QueryContractMetadataResponse>(
                service, METHODID_CONTRACT_METADATA)))
        .addMethod(
          getBlockRewardsTrackingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingRequest,
              com.archway.rewards.v1.QueryProto.QueryBlockRewardsTrackingResponse>(
                service, METHODID_BLOCK_REWARDS_TRACKING)))
        .addMethod(
          getRewardsPoolMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryRewardsPoolRequest,
              com.archway.rewards.v1.QueryProto.QueryRewardsPoolResponse>(
                service, METHODID_REWARDS_POOL)))
        .addMethod(
          getEstimateTxFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesRequest,
              com.archway.rewards.v1.QueryProto.QueryEstimateTxFeesResponse>(
                service, METHODID_ESTIMATE_TX_FEES)))
        .addMethod(
          getRewardsRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryRewardsRecordsRequest,
              com.archway.rewards.v1.QueryProto.QueryRewardsRecordsResponse>(
                service, METHODID_REWARDS_RECORDS)))
        .addMethod(
          getOutstandingRewardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsRequest,
              com.archway.rewards.v1.QueryProto.QueryOutstandingRewardsResponse>(
                service, METHODID_OUTSTANDING_REWARDS)))
        .addMethod(
          getFlatFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.archway.rewards.v1.QueryProto.QueryFlatFeeRequest,
              com.archway.rewards.v1.QueryProto.QueryFlatFeeResponse>(
                service, METHODID_FLAT_FEE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.archway.rewards.v1.QueryProto.getDescriptor();
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
              .addMethod(getContractMetadataMethod())
              .addMethod(getBlockRewardsTrackingMethod())
              .addMethod(getRewardsPoolMethod())
              .addMethod(getEstimateTxFeesMethod())
              .addMethod(getRewardsRecordsMethod())
              .addMethod(getOutstandingRewardsMethod())
              .addMethod(getFlatFeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
