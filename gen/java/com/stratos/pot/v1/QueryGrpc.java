package com.stratos.pot.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/pot/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stratos.pot.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest,
      com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> getVolumeReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VolumeReport",
      requestType = com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest,
      com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> getVolumeReportMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest, com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> getVolumeReportMethod;
    if ((getVolumeReportMethod = QueryGrpc.getVolumeReportMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVolumeReportMethod = QueryGrpc.getVolumeReportMethod) == null) {
          QueryGrpc.getVolumeReportMethod = getVolumeReportMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest, com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VolumeReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VolumeReport"))
              .build();
        }
      }
    }
    return getVolumeReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> getRewardsByEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsByEpoch",
      requestType = com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> getRewardsByEpochMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> getRewardsByEpochMethod;
    if ((getRewardsByEpochMethod = QueryGrpc.getRewardsByEpochMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsByEpochMethod = QueryGrpc.getRewardsByEpochMethod) == null) {
          QueryGrpc.getRewardsByEpochMethod = getRewardsByEpochMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsByEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsByEpoch"))
              .build();
        }
      }
    }
    return getRewardsByEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> getRewardsByWalletMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsByWallet",
      requestType = com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> getRewardsByWalletMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> getRewardsByWalletMethod;
    if ((getRewardsByWalletMethod = QueryGrpc.getRewardsByWalletMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsByWalletMethod = QueryGrpc.getRewardsByWalletMethod) == null) {
          QueryGrpc.getRewardsByWalletMethod = getRewardsByWalletMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsByWallet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsByWallet"))
              .build();
        }
      }
    }
    return getRewardsByWalletMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> getRewardsByWalletAndEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsByWalletAndEpoch",
      requestType = com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> getRewardsByWalletAndEpochMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> getRewardsByWalletAndEpochMethod;
    if ((getRewardsByWalletAndEpochMethod = QueryGrpc.getRewardsByWalletAndEpochMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsByWalletAndEpochMethod = QueryGrpc.getRewardsByWalletAndEpochMethod) == null) {
          QueryGrpc.getRewardsByWalletAndEpochMethod = getRewardsByWalletAndEpochMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest, com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsByWalletAndEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsByWalletAndEpoch"))
              .build();
        }
      }
    }
    return getRewardsByWalletAndEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest,
      com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> getSlashingByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SlashingByOwner",
      requestType = com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest,
      com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> getSlashingByOwnerMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest, com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> getSlashingByOwnerMethod;
    if ((getSlashingByOwnerMethod = QueryGrpc.getSlashingByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSlashingByOwnerMethod = QueryGrpc.getSlashingByOwnerMethod) == null) {
          QueryGrpc.getSlashingByOwnerMethod = getSlashingByOwnerMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest, com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SlashingByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SlashingByOwner"))
              .build();
        }
      }
    }
    return getSlashingByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryParamsRequest,
      com.stratos.pot.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stratos.pot.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryParamsRequest,
      com.stratos.pot.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryParamsRequest, com.stratos.pot.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryParamsRequest, com.stratos.pot.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest,
      com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> getTotalMinedTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalMinedToken",
      requestType = com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest,
      com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> getTotalMinedTokenMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest, com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> getTotalMinedTokenMethod;
    if ((getTotalMinedTokenMethod = QueryGrpc.getTotalMinedTokenMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalMinedTokenMethod = QueryGrpc.getTotalMinedTokenMethod) == null) {
          QueryGrpc.getTotalMinedTokenMethod = getTotalMinedTokenMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest, com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalMinedToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalMinedToken"))
              .build();
        }
      }
    }
    return getTotalMinedTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest,
      com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> getCirculationSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CirculationSupply",
      requestType = com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest,
      com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> getCirculationSupplyMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest, com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> getCirculationSupplyMethod;
    if ((getCirculationSupplyMethod = QueryGrpc.getCirculationSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCirculationSupplyMethod = QueryGrpc.getCirculationSupplyMethod) == null) {
          QueryGrpc.getCirculationSupplyMethod = getCirculationSupplyMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest, com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CirculationSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CirculationSupply"))
              .build();
        }
      }
    }
    return getCirculationSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> getTotalRewardByEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalRewardByEpoch",
      requestType = com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest,
      com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> getTotalRewardByEpochMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest, com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> getTotalRewardByEpochMethod;
    if ((getTotalRewardByEpochMethod = QueryGrpc.getTotalRewardByEpochMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalRewardByEpochMethod = QueryGrpc.getTotalRewardByEpochMethod) == null) {
          QueryGrpc.getTotalRewardByEpochMethod = getTotalRewardByEpochMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest, com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalRewardByEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalRewardByEpoch"))
              .build();
        }
      }
    }
    return getTotalRewardByEpochMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryMetricsRequest,
      com.stratos.pot.v1.QueryProto.QueryMetricsResponse> getMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Metrics",
      requestType = com.stratos.pot.v1.QueryProto.QueryMetricsRequest.class,
      responseType = com.stratos.pot.v1.QueryProto.QueryMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryMetricsRequest,
      com.stratos.pot.v1.QueryProto.QueryMetricsResponse> getMetricsMethod() {
    io.grpc.MethodDescriptor<com.stratos.pot.v1.QueryProto.QueryMetricsRequest, com.stratos.pot.v1.QueryProto.QueryMetricsResponse> getMetricsMethod;
    if ((getMetricsMethod = QueryGrpc.getMetricsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMetricsMethod = QueryGrpc.getMetricsMethod) == null) {
          QueryGrpc.getMetricsMethod = getMetricsMethod =
              io.grpc.MethodDescriptor.<com.stratos.pot.v1.QueryProto.QueryMetricsRequest, com.stratos.pot.v1.QueryProto.QueryMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Metrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.pot.v1.QueryProto.QueryMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Metrics"))
              .build();
        }
      }
    }
    return getMetricsMethod;
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
     * VolumeReport queries VolumeReport info for given epoch.
     * </pre>
     */
    default void volumeReport(com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVolumeReportMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsByEpoch queries Pot rewards by a given epoch.
     * </pre>
     */
    default void rewardsByEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsByEpochMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsByOwner queries Pot rewards by a given beneficiary address.
     * </pre>
     */
    default void rewardsByWallet(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsByWalletMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsByWalletAndEpoch queries Pot rewards by a given beneficiary address at the specific epoch.
     * </pre>
     */
    default void rewardsByWalletAndEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsByWalletAndEpochMethod(), responseObserver);
    }

    /**
     * <pre>
     * SlashingByOwner queries Pot slashing by owner wallet address.
     * </pre>
     */
    default void slashingByOwner(com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSlashingByOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries POT module Params info.
     * </pre>
     */
    default void params(com.stratos.pot.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void totalMinedToken(com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalMinedTokenMethod(), responseObserver);
    }

    /**
     */
    default void circulationSupply(com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCirculationSupplyMethod(), responseObserver);
    }

    /**
     */
    default void totalRewardByEpoch(com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalRewardByEpochMethod(), responseObserver);
    }

    /**
     */
    default void metrics(com.stratos.pot.v1.QueryProto.QueryMetricsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetricsMethod(), responseObserver);
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
     * VolumeReport queries VolumeReport info for given epoch.
     * </pre>
     */
    public void volumeReport(com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVolumeReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsByEpoch queries Pot rewards by a given epoch.
     * </pre>
     */
    public void rewardsByEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsByEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsByOwner queries Pot rewards by a given beneficiary address.
     * </pre>
     */
    public void rewardsByWallet(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsByWalletMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsByWalletAndEpoch queries Pot rewards by a given beneficiary address at the specific epoch.
     * </pre>
     */
    public void rewardsByWalletAndEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsByWalletAndEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SlashingByOwner queries Pot slashing by owner wallet address.
     * </pre>
     */
    public void slashingByOwner(com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSlashingByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries POT module Params info.
     * </pre>
     */
    public void params(com.stratos.pot.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalMinedToken(com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalMinedTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void circulationSupply(com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCirculationSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void totalRewardByEpoch(com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalRewardByEpochMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void metrics(com.stratos.pot.v1.QueryProto.QueryMetricsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetricsMethod(), getCallOptions()), request, responseObserver);
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
     * VolumeReport queries VolumeReport info for given epoch.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse volumeReport(com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVolumeReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsByEpoch queries Pot rewards by a given epoch.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse rewardsByEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsByEpochMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsByOwner queries Pot rewards by a given beneficiary address.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse rewardsByWallet(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsByWalletMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsByWalletAndEpoch queries Pot rewards by a given beneficiary address at the specific epoch.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse rewardsByWalletAndEpoch(com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsByWalletAndEpochMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SlashingByOwner queries Pot slashing by owner wallet address.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse slashingByOwner(com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSlashingByOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries POT module Params info.
     * </pre>
     */
    public com.stratos.pot.v1.QueryProto.QueryParamsResponse params(com.stratos.pot.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse totalMinedToken(com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalMinedTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse circulationSupply(com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCirculationSupplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse totalRewardByEpoch(com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalRewardByEpochMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stratos.pot.v1.QueryProto.QueryMetricsResponse metrics(com.stratos.pot.v1.QueryProto.QueryMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetricsMethod(), getCallOptions(), request);
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
     * VolumeReport queries VolumeReport info for given epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse> volumeReport(
        com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVolumeReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsByEpoch queries Pot rewards by a given epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse> rewardsByEpoch(
        com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsByEpochMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsByOwner queries Pot rewards by a given beneficiary address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse> rewardsByWallet(
        com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsByWalletMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsByWalletAndEpoch queries Pot rewards by a given beneficiary address at the specific epoch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse> rewardsByWalletAndEpoch(
        com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsByWalletAndEpochMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SlashingByOwner queries Pot slashing by owner wallet address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse> slashingByOwner(
        com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSlashingByOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries POT module Params info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryParamsResponse> params(
        com.stratos.pot.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse> totalMinedToken(
        com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalMinedTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse> circulationSupply(
        com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCirculationSupplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse> totalRewardByEpoch(
        com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalRewardByEpochMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.pot.v1.QueryProto.QueryMetricsResponse> metrics(
        com.stratos.pot.v1.QueryProto.QueryMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VOLUME_REPORT = 0;
  private static final int METHODID_REWARDS_BY_EPOCH = 1;
  private static final int METHODID_REWARDS_BY_WALLET = 2;
  private static final int METHODID_REWARDS_BY_WALLET_AND_EPOCH = 3;
  private static final int METHODID_SLASHING_BY_OWNER = 4;
  private static final int METHODID_PARAMS = 5;
  private static final int METHODID_TOTAL_MINED_TOKEN = 6;
  private static final int METHODID_CIRCULATION_SUPPLY = 7;
  private static final int METHODID_TOTAL_REWARD_BY_EPOCH = 8;
  private static final int METHODID_METRICS = 9;

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
        case METHODID_VOLUME_REPORT:
          serviceImpl.volumeReport((com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse>) responseObserver);
          break;
        case METHODID_REWARDS_BY_EPOCH:
          serviceImpl.rewardsByEpoch((com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse>) responseObserver);
          break;
        case METHODID_REWARDS_BY_WALLET:
          serviceImpl.rewardsByWallet((com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse>) responseObserver);
          break;
        case METHODID_REWARDS_BY_WALLET_AND_EPOCH:
          serviceImpl.rewardsByWalletAndEpoch((com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse>) responseObserver);
          break;
        case METHODID_SLASHING_BY_OWNER:
          serviceImpl.slashingByOwner((com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.stratos.pot.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_TOTAL_MINED_TOKEN:
          serviceImpl.totalMinedToken((com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse>) responseObserver);
          break;
        case METHODID_CIRCULATION_SUPPLY:
          serviceImpl.circulationSupply((com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse>) responseObserver);
          break;
        case METHODID_TOTAL_REWARD_BY_EPOCH:
          serviceImpl.totalRewardByEpoch((com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse>) responseObserver);
          break;
        case METHODID_METRICS:
          serviceImpl.metrics((com.stratos.pot.v1.QueryProto.QueryMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.pot.v1.QueryProto.QueryMetricsResponse>) responseObserver);
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
          getVolumeReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryVolumeReportRequest,
              com.stratos.pot.v1.QueryProto.QueryVolumeReportResponse>(
                service, METHODID_VOLUME_REPORT)))
        .addMethod(
          getRewardsByEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryRewardsByEpochRequest,
              com.stratos.pot.v1.QueryProto.QueryRewardsByEpochResponse>(
                service, METHODID_REWARDS_BY_EPOCH)))
        .addMethod(
          getRewardsByWalletMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryRewardsByWalletRequest,
              com.stratos.pot.v1.QueryProto.QueryRewardsByWalletResponse>(
                service, METHODID_REWARDS_BY_WALLET)))
        .addMethod(
          getRewardsByWalletAndEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochRequest,
              com.stratos.pot.v1.QueryProto.QueryRewardsByWalletAndEpochResponse>(
                service, METHODID_REWARDS_BY_WALLET_AND_EPOCH)))
        .addMethod(
          getSlashingByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerRequest,
              com.stratos.pot.v1.QueryProto.QuerySlashingByOwnerResponse>(
                service, METHODID_SLASHING_BY_OWNER)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryParamsRequest,
              com.stratos.pot.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getTotalMinedTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenRequest,
              com.stratos.pot.v1.QueryProto.QueryTotalMinedTokenResponse>(
                service, METHODID_TOTAL_MINED_TOKEN)))
        .addMethod(
          getCirculationSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryCirculationSupplyRequest,
              com.stratos.pot.v1.QueryProto.QueryCirculationSupplyResponse>(
                service, METHODID_CIRCULATION_SUPPLY)))
        .addMethod(
          getTotalRewardByEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochRequest,
              com.stratos.pot.v1.QueryProto.QueryTotalRewardByEpochResponse>(
                service, METHODID_TOTAL_REWARD_BY_EPOCH)))
        .addMethod(
          getMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.pot.v1.QueryProto.QueryMetricsRequest,
              com.stratos.pot.v1.QueryProto.QueryMetricsResponse>(
                service, METHODID_METRICS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.pot.v1.QueryProto.getDescriptor();
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
              .addMethod(getVolumeReportMethod())
              .addMethod(getRewardsByEpochMethod())
              .addMethod(getRewardsByWalletMethod())
              .addMethod(getRewardsByWalletAndEpochMethod())
              .addMethod(getSlashingByOwnerMethod())
              .addMethod(getParamsMethod())
              .addMethod(getTotalMinedTokenMethod())
              .addMethod(getCirculationSupplyMethod())
              .addMethod(getTotalRewardByEpochMethod())
              .addMethod(getMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
