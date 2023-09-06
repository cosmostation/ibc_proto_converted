package com.evmos.incentives.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: evmos/incentives/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "evmos.incentives.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest,
      com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> getIncentivesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Incentives",
      requestType = com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest,
      com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> getIncentivesMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest, com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> getIncentivesMethod;
    if ((getIncentivesMethod = QueryGrpc.getIncentivesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivesMethod = QueryGrpc.getIncentivesMethod) == null) {
          QueryGrpc.getIncentivesMethod = getIncentivesMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest, com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Incentives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Incentives"))
              .build();
        }
      }
    }
    return getIncentivesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest,
      com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> getIncentiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Incentive",
      requestType = com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest,
      com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> getIncentiveMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest, com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> getIncentiveMethod;
    if ((getIncentiveMethod = QueryGrpc.getIncentiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentiveMethod = QueryGrpc.getIncentiveMethod) == null) {
          QueryGrpc.getIncentiveMethod = getIncentiveMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest, com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Incentive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Incentive"))
              .build();
        }
      }
    }
    return getIncentiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest,
      com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> getGasMetersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GasMeters",
      requestType = com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest,
      com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> getGasMetersMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest, com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> getGasMetersMethod;
    if ((getGasMetersMethod = QueryGrpc.getGasMetersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGasMetersMethod = QueryGrpc.getGasMetersMethod) == null) {
          QueryGrpc.getGasMetersMethod = getGasMetersMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest, com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GasMeters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GasMeters"))
              .build();
        }
      }
    }
    return getGasMetersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest,
      com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> getGasMeterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GasMeter",
      requestType = com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest,
      com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> getGasMeterMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest, com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> getGasMeterMethod;
    if ((getGasMeterMethod = QueryGrpc.getGasMeterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGasMeterMethod = QueryGrpc.getGasMeterMethod) == null) {
          QueryGrpc.getGasMeterMethod = getGasMeterMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest, com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GasMeter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GasMeter"))
              .build();
        }
      }
    }
    return getGasMeterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest,
      com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> getAllocationMetersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllocationMeters",
      requestType = com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest,
      com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> getAllocationMetersMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest, com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> getAllocationMetersMethod;
    if ((getAllocationMetersMethod = QueryGrpc.getAllocationMetersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllocationMetersMethod = QueryGrpc.getAllocationMetersMethod) == null) {
          QueryGrpc.getAllocationMetersMethod = getAllocationMetersMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest, com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllocationMeters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllocationMeters"))
              .build();
        }
      }
    }
    return getAllocationMetersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest,
      com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> getAllocationMeterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllocationMeter",
      requestType = com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest,
      com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> getAllocationMeterMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest, com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> getAllocationMeterMethod;
    if ((getAllocationMeterMethod = QueryGrpc.getAllocationMeterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllocationMeterMethod = QueryGrpc.getAllocationMeterMethod) == null) {
          QueryGrpc.getAllocationMeterMethod = getAllocationMeterMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest, com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllocationMeter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllocationMeter"))
              .build();
        }
      }
    }
    return getAllocationMeterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryParamsRequest,
      com.evmos.incentives.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.evmos.incentives.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.evmos.incentives.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryParamsRequest,
      com.evmos.incentives.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.evmos.incentives.v1.QueryProto.QueryParamsRequest, com.evmos.incentives.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.evmos.incentives.v1.QueryProto.QueryParamsRequest, com.evmos.incentives.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evmos.incentives.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
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
     * Incentives retrieves registered incentives
     * </pre>
     */
    default void incentives(com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Incentive retrieves a registered incentive
     * </pre>
     */
    default void incentive(com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * GasMeters retrieves active gas meters for a given contract
     * </pre>
     */
    default void gasMeters(com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGasMetersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GasMeter retrieves a active gas meter
     * </pre>
     */
    default void gasMeter(com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGasMeterMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllocationMeters retrieves active allocation meters for a given
     * denomination
     * </pre>
     */
    default void allocationMeters(com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllocationMetersMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllocationMeter retrieves a active gas meter
     * </pre>
     */
    default void allocationMeter(com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllocationMeterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the incentives module params
     * </pre>
     */
    default void params(com.evmos.incentives.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryParamsResponse> responseObserver) {
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
     * Incentives retrieves registered incentives
     * </pre>
     */
    public void incentives(com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Incentive retrieves a registered incentive
     * </pre>
     */
    public void incentive(com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GasMeters retrieves active gas meters for a given contract
     * </pre>
     */
    public void gasMeters(com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGasMetersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GasMeter retrieves a active gas meter
     * </pre>
     */
    public void gasMeter(com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGasMeterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllocationMeters retrieves active allocation meters for a given
     * denomination
     * </pre>
     */
    public void allocationMeters(com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllocationMetersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllocationMeter retrieves a active gas meter
     * </pre>
     */
    public void allocationMeter(com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllocationMeterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params retrieves the incentives module params
     * </pre>
     */
    public void params(com.evmos.incentives.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryParamsResponse> responseObserver) {
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
     * Incentives retrieves registered incentives
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse incentives(com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Incentive retrieves a registered incentive
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse incentive(com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GasMeters retrieves active gas meters for a given contract
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse gasMeters(com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGasMetersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GasMeter retrieves a active gas meter
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse gasMeter(com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGasMeterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllocationMeters retrieves active allocation meters for a given
     * denomination
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse allocationMeters(com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllocationMetersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllocationMeter retrieves a active gas meter
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse allocationMeter(com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllocationMeterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params retrieves the incentives module params
     * </pre>
     */
    public com.evmos.incentives.v1.QueryProto.QueryParamsResponse params(com.evmos.incentives.v1.QueryProto.QueryParamsRequest request) {
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
     * Incentives retrieves registered incentives
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse> incentives(
        com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Incentive retrieves a registered incentive
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse> incentive(
        com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GasMeters retrieves active gas meters for a given contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse> gasMeters(
        com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGasMetersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GasMeter retrieves a active gas meter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse> gasMeter(
        com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGasMeterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllocationMeters retrieves active allocation meters for a given
     * denomination
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse> allocationMeters(
        com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllocationMetersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllocationMeter retrieves a active gas meter
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse> allocationMeter(
        com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllocationMeterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params retrieves the incentives module params
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evmos.incentives.v1.QueryProto.QueryParamsResponse> params(
        com.evmos.incentives.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCENTIVES = 0;
  private static final int METHODID_INCENTIVE = 1;
  private static final int METHODID_GAS_METERS = 2;
  private static final int METHODID_GAS_METER = 3;
  private static final int METHODID_ALLOCATION_METERS = 4;
  private static final int METHODID_ALLOCATION_METER = 5;
  private static final int METHODID_PARAMS = 6;

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
        case METHODID_INCENTIVES:
          serviceImpl.incentives((com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse>) responseObserver);
          break;
        case METHODID_INCENTIVE:
          serviceImpl.incentive((com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse>) responseObserver);
          break;
        case METHODID_GAS_METERS:
          serviceImpl.gasMeters((com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse>) responseObserver);
          break;
        case METHODID_GAS_METER:
          serviceImpl.gasMeter((com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse>) responseObserver);
          break;
        case METHODID_ALLOCATION_METERS:
          serviceImpl.allocationMeters((com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse>) responseObserver);
          break;
        case METHODID_ALLOCATION_METER:
          serviceImpl.allocationMeter((com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.evmos.incentives.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.evmos.incentives.v1.QueryProto.QueryParamsResponse>) responseObserver);
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
          getIncentivesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryIncentivesRequest,
              com.evmos.incentives.v1.QueryProto.QueryIncentivesResponse>(
                service, METHODID_INCENTIVES)))
        .addMethod(
          getIncentiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryIncentiveRequest,
              com.evmos.incentives.v1.QueryProto.QueryIncentiveResponse>(
                service, METHODID_INCENTIVE)))
        .addMethod(
          getGasMetersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryGasMetersRequest,
              com.evmos.incentives.v1.QueryProto.QueryGasMetersResponse>(
                service, METHODID_GAS_METERS)))
        .addMethod(
          getGasMeterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryGasMeterRequest,
              com.evmos.incentives.v1.QueryProto.QueryGasMeterResponse>(
                service, METHODID_GAS_METER)))
        .addMethod(
          getAllocationMetersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryAllocationMetersRequest,
              com.evmos.incentives.v1.QueryProto.QueryAllocationMetersResponse>(
                service, METHODID_ALLOCATION_METERS)))
        .addMethod(
          getAllocationMeterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryAllocationMeterRequest,
              com.evmos.incentives.v1.QueryProto.QueryAllocationMeterResponse>(
                service, METHODID_ALLOCATION_METER)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.evmos.incentives.v1.QueryProto.QueryParamsRequest,
              com.evmos.incentives.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evmos.incentives.v1.QueryProto.getDescriptor();
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
              .addMethod(getIncentivesMethod())
              .addMethod(getIncentiveMethod())
              .addMethod(getGasMetersMethod())
              .addMethod(getGasMeterMethod())
              .addMethod(getAllocationMetersMethod())
              .addMethod(getAllocationMeterMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
