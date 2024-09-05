package com.osmosis.incentives;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: osmosis/incentives/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "osmosis.incentives.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest,
      com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModuleToDistributeCoins",
      requestType = com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest.class,
      responseType = com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest,
      com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest, com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> getModuleToDistributeCoinsMethod;
    if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getModuleToDistributeCoinsMethod = QueryGrpc.getModuleToDistributeCoinsMethod) == null) {
          QueryGrpc.getModuleToDistributeCoinsMethod = getModuleToDistributeCoinsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest, com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModuleToDistributeCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ModuleToDistributeCoins"))
              .build();
        }
      }
    }
    return getModuleToDistributeCoinsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugeByIDRequest,
      com.osmosis.incentives.QueryProto.GaugeByIDResponse> getGaugeByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GaugeByID",
      requestType = com.osmosis.incentives.QueryProto.GaugeByIDRequest.class,
      responseType = com.osmosis.incentives.QueryProto.GaugeByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugeByIDRequest,
      com.osmosis.incentives.QueryProto.GaugeByIDResponse> getGaugeByIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugeByIDRequest, com.osmosis.incentives.QueryProto.GaugeByIDResponse> getGaugeByIDMethod;
    if ((getGaugeByIDMethod = QueryGrpc.getGaugeByIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugeByIDMethod = QueryGrpc.getGaugeByIDMethod) == null) {
          QueryGrpc.getGaugeByIDMethod = getGaugeByIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.GaugeByIDRequest, com.osmosis.incentives.QueryProto.GaugeByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GaugeByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.GaugeByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.GaugeByIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GaugeByID"))
              .build();
        }
      }
    }
    return getGaugeByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugesRequest,
      com.osmosis.incentives.QueryProto.GaugesResponse> getGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Gauges",
      requestType = com.osmosis.incentives.QueryProto.GaugesRequest.class,
      responseType = com.osmosis.incentives.QueryProto.GaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugesRequest,
      com.osmosis.incentives.QueryProto.GaugesResponse> getGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.GaugesRequest, com.osmosis.incentives.QueryProto.GaugesResponse> getGaugesMethod;
    if ((getGaugesMethod = QueryGrpc.getGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGaugesMethod = QueryGrpc.getGaugesMethod) == null) {
          QueryGrpc.getGaugesMethod = getGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.GaugesRequest, com.osmosis.incentives.QueryProto.GaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Gauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.GaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.GaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Gauges"))
              .build();
        }
      }
    }
    return getGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesRequest,
      com.osmosis.incentives.QueryProto.ActiveGaugesResponse> getActiveGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveGauges",
      requestType = com.osmosis.incentives.QueryProto.ActiveGaugesRequest.class,
      responseType = com.osmosis.incentives.QueryProto.ActiveGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesRequest,
      com.osmosis.incentives.QueryProto.ActiveGaugesResponse> getActiveGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesRequest, com.osmosis.incentives.QueryProto.ActiveGaugesResponse> getActiveGaugesMethod;
    if ((getActiveGaugesMethod = QueryGrpc.getActiveGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveGaugesMethod = QueryGrpc.getActiveGaugesMethod) == null) {
          QueryGrpc.getActiveGaugesMethod = getActiveGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.ActiveGaugesRequest, com.osmosis.incentives.QueryProto.ActiveGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ActiveGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ActiveGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveGauges"))
              .build();
        }
      }
    }
    return getActiveGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest,
      com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActiveGaugesPerDenom",
      requestType = com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest.class,
      responseType = com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest,
      com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest, com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> getActiveGaugesPerDenomMethod;
    if ((getActiveGaugesPerDenomMethod = QueryGrpc.getActiveGaugesPerDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActiveGaugesPerDenomMethod = QueryGrpc.getActiveGaugesPerDenomMethod) == null) {
          QueryGrpc.getActiveGaugesPerDenomMethod = getActiveGaugesPerDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest, com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActiveGaugesPerDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActiveGaugesPerDenom"))
              .build();
        }
      }
    }
    return getActiveGaugesPerDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesRequest,
      com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> getUpcomingGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingGauges",
      requestType = com.osmosis.incentives.QueryProto.UpcomingGaugesRequest.class,
      responseType = com.osmosis.incentives.QueryProto.UpcomingGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesRequest,
      com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> getUpcomingGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesRequest, com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> getUpcomingGaugesMethod;
    if ((getUpcomingGaugesMethod = QueryGrpc.getUpcomingGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingGaugesMethod = QueryGrpc.getUpcomingGaugesMethod) == null) {
          QueryGrpc.getUpcomingGaugesMethod = getUpcomingGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.UpcomingGaugesRequest, com.osmosis.incentives.QueryProto.UpcomingGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.UpcomingGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.UpcomingGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingGauges"))
              .build();
        }
      }
    }
    return getUpcomingGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest,
      com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpcomingGaugesPerDenom",
      requestType = com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest.class,
      responseType = com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest,
      com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest, com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> getUpcomingGaugesPerDenomMethod;
    if ((getUpcomingGaugesPerDenomMethod = QueryGrpc.getUpcomingGaugesPerDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUpcomingGaugesPerDenomMethod = QueryGrpc.getUpcomingGaugesPerDenomMethod) == null) {
          QueryGrpc.getUpcomingGaugesPerDenomMethod = getUpcomingGaugesPerDenomMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest, com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpcomingGaugesPerDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UpcomingGaugesPerDenom"))
              .build();
        }
      }
    }
    return getUpcomingGaugesPerDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.RewardsEstRequest,
      com.osmosis.incentives.QueryProto.RewardsEstResponse> getRewardsEstMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewardsEst",
      requestType = com.osmosis.incentives.QueryProto.RewardsEstRequest.class,
      responseType = com.osmosis.incentives.QueryProto.RewardsEstResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.RewardsEstRequest,
      com.osmosis.incentives.QueryProto.RewardsEstResponse> getRewardsEstMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.RewardsEstRequest, com.osmosis.incentives.QueryProto.RewardsEstResponse> getRewardsEstMethod;
    if ((getRewardsEstMethod = QueryGrpc.getRewardsEstMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRewardsEstMethod = QueryGrpc.getRewardsEstMethod) == null) {
          QueryGrpc.getRewardsEstMethod = getRewardsEstMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.RewardsEstRequest, com.osmosis.incentives.QueryProto.RewardsEstResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewardsEst"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.RewardsEstRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.RewardsEstResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RewardsEst"))
              .build();
        }
      }
    }
    return getRewardsEstMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest,
      com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockableDurations",
      requestType = com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest,
      com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest, com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> getLockableDurationsMethod;
    if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLockableDurationsMethod = QueryGrpc.getLockableDurationsMethod) == null) {
          QueryGrpc.getLockableDurationsMethod = getLockableDurationsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest, com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockableDurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LockableDurations"))
              .build();
        }
      }
    }
    return getLockableDurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> getAllGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllGroups",
      requestType = com.osmosis.incentives.QueryProto.QueryAllGroupsRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryAllGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> getAllGroupsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> getAllGroupsMethod;
    if ((getAllGroupsMethod = QueryGrpc.getAllGroupsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllGroupsMethod = QueryGrpc.getAllGroupsMethod) == null) {
          QueryGrpc.getAllGroupsMethod = getAllGroupsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryAllGroupsRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllGroups"))
              .build();
        }
      }
    }
    return getAllGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> getAllGroupsGaugesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllGroupsGauges",
      requestType = com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> getAllGroupsGaugesMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> getAllGroupsGaugesMethod;
    if ((getAllGroupsGaugesMethod = QueryGrpc.getAllGroupsGaugesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllGroupsGaugesMethod = QueryGrpc.getAllGroupsGaugesMethod) == null) {
          QueryGrpc.getAllGroupsGaugesMethod = getAllGroupsGaugesMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllGroupsGauges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllGroupsGauges"))
              .build();
        }
      }
    }
    return getAllGroupsGaugesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> getAllGroupsWithGaugeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllGroupsWithGauge",
      requestType = com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest,
      com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> getAllGroupsWithGaugeMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> getAllGroupsWithGaugeMethod;
    if ((getAllGroupsWithGaugeMethod = QueryGrpc.getAllGroupsWithGaugeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllGroupsWithGaugeMethod = QueryGrpc.getAllGroupsWithGaugeMethod) == null) {
          QueryGrpc.getAllGroupsWithGaugeMethod = getAllGroupsWithGaugeMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest, com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllGroupsWithGauge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllGroupsWithGauge"))
              .build();
        }
      }
    }
    return getAllGroupsWithGaugeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest,
      com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> getGroupByGroupGaugeIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupByGroupGaugeID",
      requestType = com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest,
      com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> getGroupByGroupGaugeIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest, com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> getGroupByGroupGaugeIDMethod;
    if ((getGroupByGroupGaugeIDMethod = QueryGrpc.getGroupByGroupGaugeIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupByGroupGaugeIDMethod = QueryGrpc.getGroupByGroupGaugeIDMethod) == null) {
          QueryGrpc.getGroupByGroupGaugeIDMethod = getGroupByGroupGaugeIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest, com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupByGroupGaugeID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupByGroupGaugeID"))
              .build();
        }
      }
    }
    return getGroupByGroupGaugeIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest,
      com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> getCurrentWeightByGroupGaugeIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentWeightByGroupGaugeID",
      requestType = com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest.class,
      responseType = com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest,
      com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> getCurrentWeightByGroupGaugeIDMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest, com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> getCurrentWeightByGroupGaugeIDMethod;
    if ((getCurrentWeightByGroupGaugeIDMethod = QueryGrpc.getCurrentWeightByGroupGaugeIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCurrentWeightByGroupGaugeIDMethod = QueryGrpc.getCurrentWeightByGroupGaugeIDMethod) == null) {
          QueryGrpc.getCurrentWeightByGroupGaugeIDMethod = getCurrentWeightByGroupGaugeIDMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest, com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentWeightByGroupGaugeID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CurrentWeightByGroupGaugeID"))
              .build();
        }
      }
    }
    return getCurrentWeightByGroupGaugeIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ParamsRequest,
      com.osmosis.incentives.QueryProto.ParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.osmosis.incentives.QueryProto.ParamsRequest.class,
      responseType = com.osmosis.incentives.QueryProto.ParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ParamsRequest,
      com.osmosis.incentives.QueryProto.ParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.osmosis.incentives.QueryProto.ParamsRequest, com.osmosis.incentives.QueryProto.ParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.osmosis.incentives.QueryProto.ParamsRequest, com.osmosis.incentives.QueryProto.ParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.osmosis.incentives.QueryProto.ParamsResponse.getDefaultInstance()))
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
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    default void moduleToDistributeCoins(com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModuleToDistributeCoinsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    default void gaugeByID(com.osmosis.incentives.QueryProto.GaugeByIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugeByIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugeByIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    default void gauges(com.osmosis.incentives.QueryProto.GaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    default void activeGauges(com.osmosis.incentives.QueryProto.ActiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    default void activeGaugesPerDenom(com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActiveGaugesPerDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occurred
     * </pre>
     */
    default void upcomingGauges(com.osmosis.incentives.QueryProto.UpcomingGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occurred
     * by denom
     * </pre>
     */
    default void upcomingGaugesPerDenom(com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpcomingGaugesPerDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    default void rewardsEst(com.osmosis.incentives.QueryProto.RewardsEstRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.RewardsEstResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewardsEstMethod(), responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    default void lockableDurations(com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockableDurationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllGroups returns all groups
     * </pre>
     */
    default void allGroups(com.osmosis.incentives.QueryProto.QueryAllGroupsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllGroupsGauges returns all group gauges
     * </pre>
     */
    default void allGroupsGauges(com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllGroupsGaugesMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllGroupsWithGauge returns all groups with their group gauge
     * </pre>
     */
    default void allGroupsWithGauge(com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllGroupsWithGaugeMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupByGroupGaugeID returns a group given its group gauge ID
     * </pre>
     */
    default void groupByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupByGroupGaugeIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * CurrentWeightByGroupGaugeID returns the current weight since the
     * the last epoch given a group gauge ID
     * </pre>
     */
    default void currentWeightByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentWeightByGroupGaugeIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params returns incentives module params.
     * </pre>
     */
    default void params(com.osmosis.incentives.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
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
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public void moduleToDistributeCoins(com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public void gaugeByID(com.osmosis.incentives.QueryProto.GaugeByIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugeByIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugeByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public void gauges(com.osmosis.incentives.QueryProto.GaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public void activeGauges(com.osmosis.incentives.QueryProto.ActiveGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public void activeGaugesPerDenom(com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActiveGaugesPerDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occurred
     * </pre>
     */
    public void upcomingGauges(com.osmosis.incentives.QueryProto.UpcomingGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occurred
     * by denom
     * </pre>
     */
    public void upcomingGaugesPerDenom(com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpcomingGaugesPerDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public void rewardsEst(com.osmosis.incentives.QueryProto.RewardsEstRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.RewardsEstResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewardsEstMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public void lockableDurations(com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllGroups returns all groups
     * </pre>
     */
    public void allGroups(com.osmosis.incentives.QueryProto.QueryAllGroupsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllGroupsGauges returns all group gauges
     * </pre>
     */
    public void allGroupsGauges(com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllGroupsGaugesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllGroupsWithGauge returns all groups with their group gauge
     * </pre>
     */
    public void allGroupsWithGauge(com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllGroupsWithGaugeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupByGroupGaugeID returns a group given its group gauge ID
     * </pre>
     */
    public void groupByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupByGroupGaugeIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CurrentWeightByGroupGaugeID returns the current weight since the
     * the last epoch given a group gauge ID
     * </pre>
     */
    public void currentWeightByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentWeightByGroupGaugeIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params returns incentives module params.
     * </pre>
     */
    public void params(com.osmosis.incentives.QueryProto.ParamsRequest request,
        io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse moduleToDistributeCoins(com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModuleToDistributeCoinsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.GaugeByIDResponse gaugeByID(com.osmosis.incentives.QueryProto.GaugeByIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugeByIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.GaugesResponse gauges(com.osmosis.incentives.QueryProto.GaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.ActiveGaugesResponse activeGauges(com.osmosis.incentives.QueryProto.ActiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse activeGaugesPerDenom(com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActiveGaugesPerDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occurred
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.UpcomingGaugesResponse upcomingGauges(com.osmosis.incentives.QueryProto.UpcomingGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occurred
     * by denom
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse upcomingGaugesPerDenom(com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpcomingGaugesPerDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.RewardsEstResponse rewardsEst(com.osmosis.incentives.QueryProto.RewardsEstRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewardsEstMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse lockableDurations(com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockableDurationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllGroups returns all groups
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryAllGroupsResponse allGroups(com.osmosis.incentives.QueryProto.QueryAllGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllGroupsGauges returns all group gauges
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse allGroupsGauges(com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllGroupsGaugesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllGroupsWithGauge returns all groups with their group gauge
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse allGroupsWithGauge(com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllGroupsWithGaugeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupByGroupGaugeID returns a group given its group gauge ID
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse groupByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupByGroupGaugeIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CurrentWeightByGroupGaugeID returns the current weight since the
     * the last epoch given a group gauge ID
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse currentWeightByGroupGaugeID(com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentWeightByGroupGaugeIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params returns incentives module params.
     * </pre>
     */
    public com.osmosis.incentives.QueryProto.ParamsResponse params(com.osmosis.incentives.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
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
     * ModuleToDistributeCoins returns coins that are going to be distributed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse> moduleToDistributeCoins(
        com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModuleToDistributeCoinsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GaugeByID returns gauges by their respective ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.GaugeByIDResponse> gaugeByID(
        com.osmosis.incentives.QueryProto.GaugeByIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugeByIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gauges returns both upcoming and active gauges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.GaugesResponse> gauges(
        com.osmosis.incentives.QueryProto.GaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveGauges returns active gauges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.ActiveGaugesResponse> activeGauges(
        com.osmosis.incentives.QueryProto.ActiveGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ActiveGaugesPerDenom returns active gauges by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse> activeGaugesPerDenom(
        com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActiveGaugesPerDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns scheduled gauges that have not yet occurred
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.UpcomingGaugesResponse> upcomingGauges(
        com.osmosis.incentives.QueryProto.UpcomingGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpcomingGaugesPerDenom returns scheduled gauges that have not yet occurred
     * by denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse> upcomingGaugesPerDenom(
        com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpcomingGaugesPerDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RewardsEst returns an estimate of the rewards from now until a specified
     * time in the future The querier either provides an address or a set of locks
     * for which they want to find the associated rewards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.RewardsEstResponse> rewardsEst(
        com.osmosis.incentives.QueryProto.RewardsEstRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewardsEstMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LockableDurations returns lockable durations that are valid to distribute
     * incentives for
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse> lockableDurations(
        com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockableDurationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllGroups returns all groups
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryAllGroupsResponse> allGroups(
        com.osmosis.incentives.QueryProto.QueryAllGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllGroupsGauges returns all group gauges
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse> allGroupsGauges(
        com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllGroupsGaugesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllGroupsWithGauge returns all groups with their group gauge
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse> allGroupsWithGauge(
        com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllGroupsWithGaugeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupByGroupGaugeID returns a group given its group gauge ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse> groupByGroupGaugeID(
        com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupByGroupGaugeIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CurrentWeightByGroupGaugeID returns the current weight since the
     * the last epoch given a group gauge ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse> currentWeightByGroupGaugeID(
        com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentWeightByGroupGaugeIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params returns incentives module params.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.osmosis.incentives.QueryProto.ParamsResponse> params(
        com.osmosis.incentives.QueryProto.ParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MODULE_TO_DISTRIBUTE_COINS = 0;
  private static final int METHODID_GAUGE_BY_ID = 1;
  private static final int METHODID_GAUGES = 2;
  private static final int METHODID_ACTIVE_GAUGES = 3;
  private static final int METHODID_ACTIVE_GAUGES_PER_DENOM = 4;
  private static final int METHODID_UPCOMING_GAUGES = 5;
  private static final int METHODID_UPCOMING_GAUGES_PER_DENOM = 6;
  private static final int METHODID_REWARDS_EST = 7;
  private static final int METHODID_LOCKABLE_DURATIONS = 8;
  private static final int METHODID_ALL_GROUPS = 9;
  private static final int METHODID_ALL_GROUPS_GAUGES = 10;
  private static final int METHODID_ALL_GROUPS_WITH_GAUGE = 11;
  private static final int METHODID_GROUP_BY_GROUP_GAUGE_ID = 12;
  private static final int METHODID_CURRENT_WEIGHT_BY_GROUP_GAUGE_ID = 13;
  private static final int METHODID_PARAMS = 14;

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
        case METHODID_MODULE_TO_DISTRIBUTE_COINS:
          serviceImpl.moduleToDistributeCoins((com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse>) responseObserver);
          break;
        case METHODID_GAUGE_BY_ID:
          serviceImpl.gaugeByID((com.osmosis.incentives.QueryProto.GaugeByIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugeByIDResponse>) responseObserver);
          break;
        case METHODID_GAUGES:
          serviceImpl.gauges((com.osmosis.incentives.QueryProto.GaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.GaugesResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_GAUGES:
          serviceImpl.activeGauges((com.osmosis.incentives.QueryProto.ActiveGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesResponse>) responseObserver);
          break;
        case METHODID_ACTIVE_GAUGES_PER_DENOM:
          serviceImpl.activeGaugesPerDenom((com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_GAUGES:
          serviceImpl.upcomingGauges((com.osmosis.incentives.QueryProto.UpcomingGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesResponse>) responseObserver);
          break;
        case METHODID_UPCOMING_GAUGES_PER_DENOM:
          serviceImpl.upcomingGaugesPerDenom((com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse>) responseObserver);
          break;
        case METHODID_REWARDS_EST:
          serviceImpl.rewardsEst((com.osmosis.incentives.QueryProto.RewardsEstRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.RewardsEstResponse>) responseObserver);
          break;
        case METHODID_LOCKABLE_DURATIONS:
          serviceImpl.lockableDurations((com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse>) responseObserver);
          break;
        case METHODID_ALL_GROUPS:
          serviceImpl.allGroups((com.osmosis.incentives.QueryProto.QueryAllGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsResponse>) responseObserver);
          break;
        case METHODID_ALL_GROUPS_GAUGES:
          serviceImpl.allGroupsGauges((com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse>) responseObserver);
          break;
        case METHODID_ALL_GROUPS_WITH_GAUGE:
          serviceImpl.allGroupsWithGauge((com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse>) responseObserver);
          break;
        case METHODID_GROUP_BY_GROUP_GAUGE_ID:
          serviceImpl.groupByGroupGaugeID((com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse>) responseObserver);
          break;
        case METHODID_CURRENT_WEIGHT_BY_GROUP_GAUGE_ID:
          serviceImpl.currentWeightByGroupGaugeID((com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.osmosis.incentives.QueryProto.ParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.osmosis.incentives.QueryProto.ParamsResponse>) responseObserver);
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
          getModuleToDistributeCoinsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsRequest,
              com.osmosis.incentives.QueryProto.ModuleToDistributeCoinsResponse>(
                service, METHODID_MODULE_TO_DISTRIBUTE_COINS)))
        .addMethod(
          getGaugeByIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.GaugeByIDRequest,
              com.osmosis.incentives.QueryProto.GaugeByIDResponse>(
                service, METHODID_GAUGE_BY_ID)))
        .addMethod(
          getGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.GaugesRequest,
              com.osmosis.incentives.QueryProto.GaugesResponse>(
                service, METHODID_GAUGES)))
        .addMethod(
          getActiveGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.ActiveGaugesRequest,
              com.osmosis.incentives.QueryProto.ActiveGaugesResponse>(
                service, METHODID_ACTIVE_GAUGES)))
        .addMethod(
          getActiveGaugesPerDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomRequest,
              com.osmosis.incentives.QueryProto.ActiveGaugesPerDenomResponse>(
                service, METHODID_ACTIVE_GAUGES_PER_DENOM)))
        .addMethod(
          getUpcomingGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.UpcomingGaugesRequest,
              com.osmosis.incentives.QueryProto.UpcomingGaugesResponse>(
                service, METHODID_UPCOMING_GAUGES)))
        .addMethod(
          getUpcomingGaugesPerDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomRequest,
              com.osmosis.incentives.QueryProto.UpcomingGaugesPerDenomResponse>(
                service, METHODID_UPCOMING_GAUGES_PER_DENOM)))
        .addMethod(
          getRewardsEstMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.RewardsEstRequest,
              com.osmosis.incentives.QueryProto.RewardsEstResponse>(
                service, METHODID_REWARDS_EST)))
        .addMethod(
          getLockableDurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryLockableDurationsRequest,
              com.osmosis.incentives.QueryProto.QueryLockableDurationsResponse>(
                service, METHODID_LOCKABLE_DURATIONS)))
        .addMethod(
          getAllGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryAllGroupsRequest,
              com.osmosis.incentives.QueryProto.QueryAllGroupsResponse>(
                service, METHODID_ALL_GROUPS)))
        .addMethod(
          getAllGroupsGaugesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesRequest,
              com.osmosis.incentives.QueryProto.QueryAllGroupsGaugesResponse>(
                service, METHODID_ALL_GROUPS_GAUGES)))
        .addMethod(
          getAllGroupsWithGaugeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeRequest,
              com.osmosis.incentives.QueryProto.QueryAllGroupsWithGaugeResponse>(
                service, METHODID_ALL_GROUPS_WITH_GAUGE)))
        .addMethod(
          getGroupByGroupGaugeIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDRequest,
              com.osmosis.incentives.QueryProto.QueryGroupByGroupGaugeIDResponse>(
                service, METHODID_GROUP_BY_GROUP_GAUGE_ID)))
        .addMethod(
          getCurrentWeightByGroupGaugeIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDRequest,
              com.osmosis.incentives.QueryProto.QueryCurrentWeightByGroupGaugeIDResponse>(
                service, METHODID_CURRENT_WEIGHT_BY_GROUP_GAUGE_ID)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.osmosis.incentives.QueryProto.ParamsRequest,
              com.osmosis.incentives.QueryProto.ParamsResponse>(
                service, METHODID_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.osmosis.incentives.QueryProto.getDescriptor();
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
              .addMethod(getModuleToDistributeCoinsMethod())
              .addMethod(getGaugeByIDMethod())
              .addMethod(getGaugesMethod())
              .addMethod(getActiveGaugesMethod())
              .addMethod(getActiveGaugesPerDenomMethod())
              .addMethod(getUpcomingGaugesMethod())
              .addMethod(getUpcomingGaugesPerDenomMethod())
              .addMethod(getRewardsEstMethod())
              .addMethod(getLockableDurationsMethod())
              .addMethod(getAllGroupsMethod())
              .addMethod(getAllGroupsGaugesMethod())
              .addMethod(getAllGroupsWithGaugeMethod())
              .addMethod(getGroupByGroupGaugeIDMethod())
              .addMethod(getCurrentWeightByGroupGaugeIDMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
