package com.sentinel.subscription.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sentinel/subscription/v2/querier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "sentinel.subscription.v2.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsResponse> getQuerySubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriptions",
      requestType = com.sentinel.subscription.v2.QuerySubscriptionsRequest.class,
      responseType = com.sentinel.subscription.v2.QuerySubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsResponse> getQuerySubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsRequest, com.sentinel.subscription.v2.QuerySubscriptionsResponse> getQuerySubscriptionsMethod;
    if ((getQuerySubscriptionsMethod = QueryServiceGrpc.getQuerySubscriptionsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySubscriptionsMethod = QueryServiceGrpc.getQuerySubscriptionsMethod) == null) {
          QueryServiceGrpc.getQuerySubscriptionsMethod = getQuerySubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QuerySubscriptionsRequest, com.sentinel.subscription.v2.QuerySubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySubscriptions"))
              .build();
        }
      }
    }
    return getQuerySubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> getQuerySubscriptionsForAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriptionsForAccount",
      requestType = com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest.class,
      responseType = com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> getQuerySubscriptionsForAccountMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest, com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> getQuerySubscriptionsForAccountMethod;
    if ((getQuerySubscriptionsForAccountMethod = QueryServiceGrpc.getQuerySubscriptionsForAccountMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySubscriptionsForAccountMethod = QueryServiceGrpc.getQuerySubscriptionsForAccountMethod) == null) {
          QueryServiceGrpc.getQuerySubscriptionsForAccountMethod = getQuerySubscriptionsForAccountMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest, com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriptionsForAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySubscriptionsForAccount"))
              .build();
        }
      }
    }
    return getQuerySubscriptionsForAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> getQuerySubscriptionsForNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriptionsForNode",
      requestType = com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest.class,
      responseType = com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> getQuerySubscriptionsForNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest, com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> getQuerySubscriptionsForNodeMethod;
    if ((getQuerySubscriptionsForNodeMethod = QueryServiceGrpc.getQuerySubscriptionsForNodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySubscriptionsForNodeMethod = QueryServiceGrpc.getQuerySubscriptionsForNodeMethod) == null) {
          QueryServiceGrpc.getQuerySubscriptionsForNodeMethod = getQuerySubscriptionsForNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest, com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriptionsForNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySubscriptionsForNode"))
              .build();
        }
      }
    }
    return getQuerySubscriptionsForNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> getQuerySubscriptionsForPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriptionsForPlan",
      requestType = com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest.class,
      responseType = com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest,
      com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> getQuerySubscriptionsForPlanMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest, com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> getQuerySubscriptionsForPlanMethod;
    if ((getQuerySubscriptionsForPlanMethod = QueryServiceGrpc.getQuerySubscriptionsForPlanMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySubscriptionsForPlanMethod = QueryServiceGrpc.getQuerySubscriptionsForPlanMethod) == null) {
          QueryServiceGrpc.getQuerySubscriptionsForPlanMethod = getQuerySubscriptionsForPlanMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest, com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriptionsForPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySubscriptionsForPlan"))
              .build();
        }
      }
    }
    return getQuerySubscriptionsForPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionRequest,
      com.sentinel.subscription.v2.QuerySubscriptionResponse> getQuerySubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscription",
      requestType = com.sentinel.subscription.v2.QuerySubscriptionRequest.class,
      responseType = com.sentinel.subscription.v2.QuerySubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionRequest,
      com.sentinel.subscription.v2.QuerySubscriptionResponse> getQuerySubscriptionMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QuerySubscriptionRequest, com.sentinel.subscription.v2.QuerySubscriptionResponse> getQuerySubscriptionMethod;
    if ((getQuerySubscriptionMethod = QueryServiceGrpc.getQuerySubscriptionMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQuerySubscriptionMethod = QueryServiceGrpc.getQuerySubscriptionMethod) == null) {
          QueryServiceGrpc.getQuerySubscriptionMethod = getQuerySubscriptionMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QuerySubscriptionRequest, com.sentinel.subscription.v2.QuerySubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QuerySubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QuerySubscription"))
              .build();
        }
      }
    }
    return getQuerySubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationsRequest,
      com.sentinel.subscription.v2.QueryAllocationsResponse> getQueryAllocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllocations",
      requestType = com.sentinel.subscription.v2.QueryAllocationsRequest.class,
      responseType = com.sentinel.subscription.v2.QueryAllocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationsRequest,
      com.sentinel.subscription.v2.QueryAllocationsResponse> getQueryAllocationsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationsRequest, com.sentinel.subscription.v2.QueryAllocationsResponse> getQueryAllocationsMethod;
    if ((getQueryAllocationsMethod = QueryServiceGrpc.getQueryAllocationsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryAllocationsMethod = QueryServiceGrpc.getQueryAllocationsMethod) == null) {
          QueryServiceGrpc.getQueryAllocationsMethod = getQueryAllocationsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryAllocationsRequest, com.sentinel.subscription.v2.QueryAllocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryAllocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryAllocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryAllocations"))
              .build();
        }
      }
    }
    return getQueryAllocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationRequest,
      com.sentinel.subscription.v2.QueryAllocationResponse> getQueryAllocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAllocation",
      requestType = com.sentinel.subscription.v2.QueryAllocationRequest.class,
      responseType = com.sentinel.subscription.v2.QueryAllocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationRequest,
      com.sentinel.subscription.v2.QueryAllocationResponse> getQueryAllocationMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryAllocationRequest, com.sentinel.subscription.v2.QueryAllocationResponse> getQueryAllocationMethod;
    if ((getQueryAllocationMethod = QueryServiceGrpc.getQueryAllocationMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryAllocationMethod = QueryServiceGrpc.getQueryAllocationMethod) == null) {
          QueryServiceGrpc.getQueryAllocationMethod = getQueryAllocationMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryAllocationRequest, com.sentinel.subscription.v2.QueryAllocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAllocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryAllocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryAllocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryAllocation"))
              .build();
        }
      }
    }
    return getQueryAllocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsRequest,
      com.sentinel.subscription.v2.QueryPayoutsResponse> getQueryPayoutsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPayouts",
      requestType = com.sentinel.subscription.v2.QueryPayoutsRequest.class,
      responseType = com.sentinel.subscription.v2.QueryPayoutsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsRequest,
      com.sentinel.subscription.v2.QueryPayoutsResponse> getQueryPayoutsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsRequest, com.sentinel.subscription.v2.QueryPayoutsResponse> getQueryPayoutsMethod;
    if ((getQueryPayoutsMethod = QueryServiceGrpc.getQueryPayoutsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPayoutsMethod = QueryServiceGrpc.getQueryPayoutsMethod) == null) {
          QueryServiceGrpc.getQueryPayoutsMethod = getQueryPayoutsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryPayoutsRequest, com.sentinel.subscription.v2.QueryPayoutsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPayouts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPayouts"))
              .build();
        }
      }
    }
    return getQueryPayoutsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForAccountRequest,
      com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> getQueryPayoutsForAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPayoutsForAccount",
      requestType = com.sentinel.subscription.v2.QueryPayoutsForAccountRequest.class,
      responseType = com.sentinel.subscription.v2.QueryPayoutsForAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForAccountRequest,
      com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> getQueryPayoutsForAccountMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForAccountRequest, com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> getQueryPayoutsForAccountMethod;
    if ((getQueryPayoutsForAccountMethod = QueryServiceGrpc.getQueryPayoutsForAccountMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPayoutsForAccountMethod = QueryServiceGrpc.getQueryPayoutsForAccountMethod) == null) {
          QueryServiceGrpc.getQueryPayoutsForAccountMethod = getQueryPayoutsForAccountMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryPayoutsForAccountRequest, com.sentinel.subscription.v2.QueryPayoutsForAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPayoutsForAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsForAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsForAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPayoutsForAccount"))
              .build();
        }
      }
    }
    return getQueryPayoutsForAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForNodeRequest,
      com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> getQueryPayoutsForNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPayoutsForNode",
      requestType = com.sentinel.subscription.v2.QueryPayoutsForNodeRequest.class,
      responseType = com.sentinel.subscription.v2.QueryPayoutsForNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForNodeRequest,
      com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> getQueryPayoutsForNodeMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutsForNodeRequest, com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> getQueryPayoutsForNodeMethod;
    if ((getQueryPayoutsForNodeMethod = QueryServiceGrpc.getQueryPayoutsForNodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPayoutsForNodeMethod = QueryServiceGrpc.getQueryPayoutsForNodeMethod) == null) {
          QueryServiceGrpc.getQueryPayoutsForNodeMethod = getQueryPayoutsForNodeMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryPayoutsForNodeRequest, com.sentinel.subscription.v2.QueryPayoutsForNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPayoutsForNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsForNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutsForNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPayoutsForNode"))
              .build();
        }
      }
    }
    return getQueryPayoutsForNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutRequest,
      com.sentinel.subscription.v2.QueryPayoutResponse> getQueryPayoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPayout",
      requestType = com.sentinel.subscription.v2.QueryPayoutRequest.class,
      responseType = com.sentinel.subscription.v2.QueryPayoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutRequest,
      com.sentinel.subscription.v2.QueryPayoutResponse> getQueryPayoutMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryPayoutRequest, com.sentinel.subscription.v2.QueryPayoutResponse> getQueryPayoutMethod;
    if ((getQueryPayoutMethod = QueryServiceGrpc.getQueryPayoutMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryPayoutMethod = QueryServiceGrpc.getQueryPayoutMethod) == null) {
          QueryServiceGrpc.getQueryPayoutMethod = getQueryPayoutMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryPayoutRequest, com.sentinel.subscription.v2.QueryPayoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPayout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryPayoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryPayout"))
              .build();
        }
      }
    }
    return getQueryPayoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryParamsRequest,
      com.sentinel.subscription.v2.QueryParamsResponse> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryParams",
      requestType = com.sentinel.subscription.v2.QueryParamsRequest.class,
      responseType = com.sentinel.subscription.v2.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryParamsRequest,
      com.sentinel.subscription.v2.QueryParamsResponse> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<com.sentinel.subscription.v2.QueryParamsRequest, com.sentinel.subscription.v2.QueryParamsResponse> getQueryParamsMethod;
    if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getQueryParamsMethod = QueryServiceGrpc.getQueryParamsMethod) == null) {
          QueryServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<com.sentinel.subscription.v2.QueryParamsRequest, com.sentinel.subscription.v2.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sentinel.subscription.v2.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("QueryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void querySubscriptions(com.sentinel.subscription.v2.QuerySubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriptionsMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriptionsForAccount(com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriptionsForAccountMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriptionsForNode(com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriptionsForNodeMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriptionsForPlan(com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriptionsForPlanMethod(), responseObserver);
    }

    /**
     */
    default void querySubscription(com.sentinel.subscription.v2.QuerySubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void queryAllocations(com.sentinel.subscription.v2.QueryAllocationsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllocationsMethod(), responseObserver);
    }

    /**
     */
    default void queryAllocation(com.sentinel.subscription.v2.QueryAllocationRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryAllocationMethod(), responseObserver);
    }

    /**
     */
    default void queryPayouts(com.sentinel.subscription.v2.QueryPayoutsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPayoutsMethod(), responseObserver);
    }

    /**
     */
    default void queryPayoutsForAccount(com.sentinel.subscription.v2.QueryPayoutsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPayoutsForAccountMethod(), responseObserver);
    }

    /**
     */
    default void queryPayoutsForNode(com.sentinel.subscription.v2.QueryPayoutsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPayoutsForNodeMethod(), responseObserver);
    }

    /**
     */
    default void queryPayout(com.sentinel.subscription.v2.QueryPayoutRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPayoutMethod(), responseObserver);
    }

    /**
     */
    default void queryParams(com.sentinel.subscription.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     */
    public void querySubscriptions(com.sentinel.subscription.v2.QuerySubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriptionsForAccount(com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriptionsForNode(com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriptionsForPlan(com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscription(com.sentinel.subscription.v2.QuerySubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllocations(com.sentinel.subscription.v2.QueryAllocationsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryAllocation(com.sentinel.subscription.v2.QueryAllocationRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAllocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPayouts(com.sentinel.subscription.v2.QueryPayoutsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPayoutsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPayoutsForAccount(com.sentinel.subscription.v2.QueryPayoutsForAccountRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPayoutsForAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPayoutsForNode(com.sentinel.subscription.v2.QueryPayoutsForNodeRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPayoutsForNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPayout(com.sentinel.subscription.v2.QueryPayoutRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPayoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryParams(com.sentinel.subscription.v2.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sentinel.subscription.v2.QuerySubscriptionsResponse querySubscriptions(com.sentinel.subscription.v2.QuerySubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse querySubscriptionsForAccount(com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriptionsForAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse querySubscriptionsForNode(com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriptionsForNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse querySubscriptionsForPlan(com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriptionsForPlanMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QuerySubscriptionResponse querySubscription(com.sentinel.subscription.v2.QuerySubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryAllocationsResponse queryAllocations(com.sentinel.subscription.v2.QueryAllocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryAllocationResponse queryAllocation(com.sentinel.subscription.v2.QueryAllocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAllocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryPayoutsResponse queryPayouts(com.sentinel.subscription.v2.QueryPayoutsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPayoutsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryPayoutsForAccountResponse queryPayoutsForAccount(com.sentinel.subscription.v2.QueryPayoutsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPayoutsForAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryPayoutsForNodeResponse queryPayoutsForNode(com.sentinel.subscription.v2.QueryPayoutsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPayoutsForNodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryPayoutResponse queryPayout(com.sentinel.subscription.v2.QueryPayoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPayoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sentinel.subscription.v2.QueryParamsResponse queryParams(com.sentinel.subscription.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QuerySubscriptionsResponse> querySubscriptions(
        com.sentinel.subscription.v2.QuerySubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse> querySubscriptionsForAccount(
        com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse> querySubscriptionsForNode(
        com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse> querySubscriptionsForPlan(
        com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriptionsForPlanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QuerySubscriptionResponse> querySubscription(
        com.sentinel.subscription.v2.QuerySubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryAllocationsResponse> queryAllocations(
        com.sentinel.subscription.v2.QueryAllocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllocationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryAllocationResponse> queryAllocation(
        com.sentinel.subscription.v2.QueryAllocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAllocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryPayoutsResponse> queryPayouts(
        com.sentinel.subscription.v2.QueryPayoutsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPayoutsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryPayoutsForAccountResponse> queryPayoutsForAccount(
        com.sentinel.subscription.v2.QueryPayoutsForAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPayoutsForAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryPayoutsForNodeResponse> queryPayoutsForNode(
        com.sentinel.subscription.v2.QueryPayoutsForNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPayoutsForNodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryPayoutResponse> queryPayout(
        com.sentinel.subscription.v2.QueryPayoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPayoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sentinel.subscription.v2.QueryParamsResponse> queryParams(
        com.sentinel.subscription.v2.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_SUBSCRIPTIONS = 0;
  private static final int METHODID_QUERY_SUBSCRIPTIONS_FOR_ACCOUNT = 1;
  private static final int METHODID_QUERY_SUBSCRIPTIONS_FOR_NODE = 2;
  private static final int METHODID_QUERY_SUBSCRIPTIONS_FOR_PLAN = 3;
  private static final int METHODID_QUERY_SUBSCRIPTION = 4;
  private static final int METHODID_QUERY_ALLOCATIONS = 5;
  private static final int METHODID_QUERY_ALLOCATION = 6;
  private static final int METHODID_QUERY_PAYOUTS = 7;
  private static final int METHODID_QUERY_PAYOUTS_FOR_ACCOUNT = 8;
  private static final int METHODID_QUERY_PAYOUTS_FOR_NODE = 9;
  private static final int METHODID_QUERY_PAYOUT = 10;
  private static final int METHODID_QUERY_PARAMS = 11;

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
        case METHODID_QUERY_SUBSCRIPTIONS:
          serviceImpl.querySubscriptions((com.sentinel.subscription.v2.QuerySubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIPTIONS_FOR_ACCOUNT:
          serviceImpl.querySubscriptionsForAccount((com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIPTIONS_FOR_NODE:
          serviceImpl.querySubscriptionsForNode((com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIPTIONS_FOR_PLAN:
          serviceImpl.querySubscriptionsForPlan((com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIPTION:
          serviceImpl.querySubscription((com.sentinel.subscription.v2.QuerySubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QuerySubscriptionResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALLOCATIONS:
          serviceImpl.queryAllocations((com.sentinel.subscription.v2.QueryAllocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationsResponse>) responseObserver);
          break;
        case METHODID_QUERY_ALLOCATION:
          serviceImpl.queryAllocation((com.sentinel.subscription.v2.QueryAllocationRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryAllocationResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAYOUTS:
          serviceImpl.queryPayouts((com.sentinel.subscription.v2.QueryPayoutsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAYOUTS_FOR_ACCOUNT:
          serviceImpl.queryPayoutsForAccount((com.sentinel.subscription.v2.QueryPayoutsForAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForAccountResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAYOUTS_FOR_NODE:
          serviceImpl.queryPayoutsForNode((com.sentinel.subscription.v2.QueryPayoutsForNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutsForNodeResponse>) responseObserver);
          break;
        case METHODID_QUERY_PAYOUT:
          serviceImpl.queryPayout((com.sentinel.subscription.v2.QueryPayoutRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryPayoutResponse>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((com.sentinel.subscription.v2.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.sentinel.subscription.v2.QueryParamsResponse>) responseObserver);
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
          getQuerySubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QuerySubscriptionsRequest,
              com.sentinel.subscription.v2.QuerySubscriptionsResponse>(
                service, METHODID_QUERY_SUBSCRIPTIONS)))
        .addMethod(
          getQuerySubscriptionsForAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest,
              com.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse>(
                service, METHODID_QUERY_SUBSCRIPTIONS_FOR_ACCOUNT)))
        .addMethod(
          getQuerySubscriptionsForNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest,
              com.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse>(
                service, METHODID_QUERY_SUBSCRIPTIONS_FOR_NODE)))
        .addMethod(
          getQuerySubscriptionsForPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest,
              com.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse>(
                service, METHODID_QUERY_SUBSCRIPTIONS_FOR_PLAN)))
        .addMethod(
          getQuerySubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QuerySubscriptionRequest,
              com.sentinel.subscription.v2.QuerySubscriptionResponse>(
                service, METHODID_QUERY_SUBSCRIPTION)))
        .addMethod(
          getQueryAllocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryAllocationsRequest,
              com.sentinel.subscription.v2.QueryAllocationsResponse>(
                service, METHODID_QUERY_ALLOCATIONS)))
        .addMethod(
          getQueryAllocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryAllocationRequest,
              com.sentinel.subscription.v2.QueryAllocationResponse>(
                service, METHODID_QUERY_ALLOCATION)))
        .addMethod(
          getQueryPayoutsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryPayoutsRequest,
              com.sentinel.subscription.v2.QueryPayoutsResponse>(
                service, METHODID_QUERY_PAYOUTS)))
        .addMethod(
          getQueryPayoutsForAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryPayoutsForAccountRequest,
              com.sentinel.subscription.v2.QueryPayoutsForAccountResponse>(
                service, METHODID_QUERY_PAYOUTS_FOR_ACCOUNT)))
        .addMethod(
          getQueryPayoutsForNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryPayoutsForNodeRequest,
              com.sentinel.subscription.v2.QueryPayoutsForNodeResponse>(
                service, METHODID_QUERY_PAYOUTS_FOR_NODE)))
        .addMethod(
          getQueryPayoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryPayoutRequest,
              com.sentinel.subscription.v2.QueryPayoutResponse>(
                service, METHODID_QUERY_PAYOUT)))
        .addMethod(
          getQueryParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.sentinel.subscription.v2.QueryParamsRequest,
              com.sentinel.subscription.v2.QueryParamsResponse>(
                service, METHODID_QUERY_PARAMS)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sentinel.subscription.v2.QuerierProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getQuerySubscriptionsMethod())
              .addMethod(getQuerySubscriptionsForAccountMethod())
              .addMethod(getQuerySubscriptionsForNodeMethod())
              .addMethod(getQuerySubscriptionsForPlanMethod())
              .addMethod(getQuerySubscriptionMethod())
              .addMethod(getQueryAllocationsMethod())
              .addMethod(getQueryAllocationMethod())
              .addMethod(getQueryPayoutsMethod())
              .addMethod(getQueryPayoutsForAccountMethod())
              .addMethod(getQueryPayoutsForNodeMethod())
              .addMethod(getQueryPayoutMethod())
              .addMethod(getQueryParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
