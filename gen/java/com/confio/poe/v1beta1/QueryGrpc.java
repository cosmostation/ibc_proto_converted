package com.confio.poe.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: confio/poe/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "confio.poe.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest,
      com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> getContractAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractAddress",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest,
      com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> getContractAddressMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest, com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> getContractAddressMethod;
    if ((getContractAddressMethod = QueryGrpc.getContractAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractAddressMethod = QueryGrpc.getContractAddressMethod) == null) {
          QueryGrpc.getContractAddressMethod = getContractAddressMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest, com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractAddress"))
              .build();
        }
      }
    }
    return getContractAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> getValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validators",
      requestType = com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> getValidatorsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest, com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> getValidatorsMethod;
    if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorsMethod = QueryGrpc.getValidatorsMethod) == null) {
          QueryGrpc.getValidatorsMethod = getValidatorsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest, com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validators"))
              .build();
        }
      }
    }
    return getValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> getValidatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validator",
      requestType = com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> getValidatorMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest, com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> getValidatorMethod;
    if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorMethod = QueryGrpc.getValidatorMethod) == null) {
          QueryGrpc.getValidatorMethod = getValidatorMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest, com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Validator"))
              .build();
        }
      }
    }
    return getValidatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest,
      com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> getUnbondingPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingPeriod",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest,
      com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> getUnbondingPeriodMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest, com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> getUnbondingPeriodMethod;
    if ((getUnbondingPeriodMethod = QueryGrpc.getUnbondingPeriodMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingPeriodMethod = QueryGrpc.getUnbondingPeriodMethod) == null) {
          QueryGrpc.getUnbondingPeriodMethod = getUnbondingPeriodMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest, com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondingPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingPeriod"))
              .build();
        }
      }
    }
    return getUnbondingPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> getValidatorDelegationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorDelegation",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> getValidatorDelegationMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> getValidatorDelegationMethod;
    if ((getValidatorDelegationMethod = QueryGrpc.getValidatorDelegationMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorDelegationMethod = QueryGrpc.getValidatorDelegationMethod) == null) {
          QueryGrpc.getValidatorDelegationMethod = getValidatorDelegationMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorDelegation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorDelegation"))
              .build();
        }
      }
    }
    return getValidatorDelegationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorUnbondingDelegations",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> getValidatorUnbondingDelegationsMethod;
    if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorUnbondingDelegationsMethod = QueryGrpc.getValidatorUnbondingDelegationsMethod) == null) {
          QueryGrpc.getValidatorUnbondingDelegationsMethod = getValidatorUnbondingDelegationsMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorUnbondingDelegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorUnbondingDelegations"))
              .build();
        }
      }
    }
    return getValidatorUnbondingDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> getHistoricalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HistoricalInfo",
      requestType = com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest.class,
      responseType = com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest,
      com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> getHistoricalInfoMethod() {
    io.grpc.MethodDescriptor<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest, com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> getHistoricalInfoMethod;
    if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHistoricalInfoMethod = QueryGrpc.getHistoricalInfoMethod) == null) {
          QueryGrpc.getHistoricalInfoMethod = getHistoricalInfoMethod =
              io.grpc.MethodDescriptor.<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest, com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HistoricalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("HistoricalInfo"))
              .build();
        }
      }
    }
    return getHistoricalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> getValidatorOutstandingRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorOutstandingReward",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> getValidatorOutstandingRewardMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> getValidatorOutstandingRewardMethod;
    if ((getValidatorOutstandingRewardMethod = QueryGrpc.getValidatorOutstandingRewardMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorOutstandingRewardMethod = QueryGrpc.getValidatorOutstandingRewardMethod) == null) {
          QueryGrpc.getValidatorOutstandingRewardMethod = getValidatorOutstandingRewardMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorOutstandingReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorOutstandingReward"))
              .build();
        }
      }
    }
    return getValidatorOutstandingRewardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> getValidatorEngagementRewardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidatorEngagementReward",
      requestType = com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest.class,
      responseType = com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest,
      com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> getValidatorEngagementRewardMethod() {
    io.grpc.MethodDescriptor<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> getValidatorEngagementRewardMethod;
    if ((getValidatorEngagementRewardMethod = QueryGrpc.getValidatorEngagementRewardMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getValidatorEngagementRewardMethod = QueryGrpc.getValidatorEngagementRewardMethod) == null) {
          QueryGrpc.getValidatorEngagementRewardMethod = getValidatorEngagementRewardMethod =
              io.grpc.MethodDescriptor.<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest, com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidatorEngagementReward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ValidatorEngagementReward"))
              .build();
        }
      }
    }
    return getValidatorEngagementRewardMethod;
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
     * ContractAddress queries the address for one of the PoE contracts
     * </pre>
     */
    default void contractAddress(com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    default void validators(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    default void validator(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    default void unbondingPeriod(com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingPeriodMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegation queries self delegated amount for given validator.
     * </pre>
     */
    default void validatorDelegation(com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorDelegationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    default void validatorUnbondingDelegations(com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorUnbondingDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    default void historicalInfo(com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHistoricalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    default void validatorOutstandingReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorOutstandingRewardMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidatorEngagementReward queries rewards of a validator address.
     * </pre>
     */
    default void validatorEngagementReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidatorEngagementRewardMethod(), responseObserver);
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
     * ContractAddress queries the address for one of the PoE contracts
     * </pre>
     */
    public void contractAddress(com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public void validators(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public void validator(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public void unbondingPeriod(com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingPeriodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorDelegation queries self delegated amount for given validator.
     * </pre>
     */
    public void validatorDelegation(com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorDelegationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public void validatorUnbondingDelegations(com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public void historicalInfo(com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public void validatorOutstandingReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidatorEngagementReward queries rewards of a validator address.
     * </pre>
     */
    public void validatorEngagementReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest request,
        io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidatorEngagementRewardMethod(), getCallOptions()), request, responseObserver);
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
     * ContractAddress queries the address for one of the PoE contracts
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse contractAddress(com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse validators(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse validator(com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse unbondingPeriod(com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingPeriodMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorDelegation queries self delegated amount for given validator.
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse validatorDelegation(com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorDelegationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse validatorUnbondingDelegations(com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorUnbondingDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse historicalInfo(com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHistoricalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse validatorOutstandingReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorOutstandingRewardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidatorEngagementReward queries rewards of a validator address.
     * </pre>
     */
    public com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse validatorEngagementReward(com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidatorEngagementRewardMethod(), getCallOptions(), request);
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
     * ContractAddress queries the address for one of the PoE contracts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse> contractAddress(
        com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validators queries all validators that match the given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse> validators(
        com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse> validator(
        com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validator queries validator info for given validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse> unbondingPeriod(
        com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingPeriodMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorDelegation queries self delegated amount for given validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse> validatorDelegation(
        com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorDelegationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorUnbondingDelegations queries unbonding delegations of a validator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse> validatorUnbondingDelegations(
        com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorUnbondingDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * HistoricalInfo queries the historical info for given height.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse> historicalInfo(
        com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHistoricalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorOutstandingRewards queries rewards of a validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse> validatorOutstandingReward(
        com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorOutstandingRewardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidatorEngagementReward queries rewards of a validator address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse> validatorEngagementReward(
        com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidatorEngagementRewardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTRACT_ADDRESS = 0;
  private static final int METHODID_VALIDATORS = 1;
  private static final int METHODID_VALIDATOR = 2;
  private static final int METHODID_UNBONDING_PERIOD = 3;
  private static final int METHODID_VALIDATOR_DELEGATION = 4;
  private static final int METHODID_VALIDATOR_UNBONDING_DELEGATIONS = 5;
  private static final int METHODID_HISTORICAL_INFO = 6;
  private static final int METHODID_VALIDATOR_OUTSTANDING_REWARD = 7;
  private static final int METHODID_VALIDATOR_ENGAGEMENT_REWARD = 8;

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
        case METHODID_CONTRACT_ADDRESS:
          serviceImpl.contractAddress((com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse>) responseObserver);
          break;
        case METHODID_VALIDATORS:
          serviceImpl.validators((com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR:
          serviceImpl.validator((com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_PERIOD:
          serviceImpl.unbondingPeriod((com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_DELEGATION:
          serviceImpl.validatorDelegation((com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_UNBONDING_DELEGATIONS:
          serviceImpl.validatorUnbondingDelegations((com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse>) responseObserver);
          break;
        case METHODID_HISTORICAL_INFO:
          serviceImpl.historicalInfo((com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_OUTSTANDING_REWARD:
          serviceImpl.validatorOutstandingReward((com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse>) responseObserver);
          break;
        case METHODID_VALIDATOR_ENGAGEMENT_REWARD:
          serviceImpl.validatorEngagementReward((com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest) request,
              (io.grpc.stub.StreamObserver<com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse>) responseObserver);
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
          getContractAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryContractAddressRequest,
              com.confio.poe.v1beta1.QueryProto.QueryContractAddressResponse>(
                service, METHODID_CONTRACT_ADDRESS)))
        .addMethod(
          getValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsRequest,
              com.cosmos.staking.v1beta1.QueryProto.QueryValidatorsResponse>(
                service, METHODID_VALIDATORS)))
        .addMethod(
          getValidatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryProto.QueryValidatorRequest,
              com.cosmos.staking.v1beta1.QueryProto.QueryValidatorResponse>(
                service, METHODID_VALIDATOR)))
        .addMethod(
          getUnbondingPeriodMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodRequest,
              com.confio.poe.v1beta1.QueryProto.QueryUnbondingPeriodResponse>(
                service, METHODID_UNBONDING_PERIOD)))
        .addMethod(
          getValidatorDelegationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationRequest,
              com.confio.poe.v1beta1.QueryProto.QueryValidatorDelegationResponse>(
                service, METHODID_VALIDATOR_DELEGATION)))
        .addMethod(
          getValidatorUnbondingDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsRequest,
              com.confio.poe.v1beta1.QueryProto.QueryValidatorUnbondingDelegationsResponse>(
                service, METHODID_VALIDATOR_UNBONDING_DELEGATIONS)))
        .addMethod(
          getHistoricalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoRequest,
              com.cosmos.staking.v1beta1.QueryProto.QueryHistoricalInfoResponse>(
                service, METHODID_HISTORICAL_INFO)))
        .addMethod(
          getValidatorOutstandingRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardRequest,
              com.confio.poe.v1beta1.QueryProto.QueryValidatorOutstandingRewardResponse>(
                service, METHODID_VALIDATOR_OUTSTANDING_REWARD)))
        .addMethod(
          getValidatorEngagementRewardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardRequest,
              com.confio.poe.v1beta1.QueryProto.QueryValidatorEngagementRewardResponse>(
                service, METHODID_VALIDATOR_ENGAGEMENT_REWARD)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.confio.poe.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getContractAddressMethod())
              .addMethod(getValidatorsMethod())
              .addMethod(getValidatorMethod())
              .addMethod(getUnbondingPeriodMethod())
              .addMethod(getValidatorDelegationMethod())
              .addMethod(getValidatorUnbondingDelegationsMethod())
              .addMethod(getHistoricalInfoMethod())
              .addMethod(getValidatorOutstandingRewardMethod())
              .addMethod(getValidatorEngagementRewardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
