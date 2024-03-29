package com.pubsub.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: sommelier/pubsub/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "pubsub.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryParamsRequest,
      com.pubsub.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.pubsub.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryParamsRequest,
      com.pubsub.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryParamsRequest, com.pubsub.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryParamsRequest, com.pubsub.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherRequest,
      com.pubsub.v1.QueryProto.QueryPublisherResponse> getQueryPublisherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublisher",
      requestType = com.pubsub.v1.QueryProto.QueryPublisherRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublisherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherRequest,
      com.pubsub.v1.QueryProto.QueryPublisherResponse> getQueryPublisherMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherRequest, com.pubsub.v1.QueryProto.QueryPublisherResponse> getQueryPublisherMethod;
    if ((getQueryPublisherMethod = QueryGrpc.getQueryPublisherMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublisherMethod = QueryGrpc.getQueryPublisherMethod) == null) {
          QueryGrpc.getQueryPublisherMethod = getQueryPublisherMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublisherRequest, com.pubsub.v1.QueryProto.QueryPublisherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublisher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublisher"))
              .build();
        }
      }
    }
    return getQueryPublisherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublishersRequest,
      com.pubsub.v1.QueryProto.QueryPublishersResponse> getQueryPublishersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublishers",
      requestType = com.pubsub.v1.QueryProto.QueryPublishersRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublishersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublishersRequest,
      com.pubsub.v1.QueryProto.QueryPublishersResponse> getQueryPublishersMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublishersRequest, com.pubsub.v1.QueryProto.QueryPublishersResponse> getQueryPublishersMethod;
    if ((getQueryPublishersMethod = QueryGrpc.getQueryPublishersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublishersMethod = QueryGrpc.getQueryPublishersMethod) == null) {
          QueryGrpc.getQueryPublishersMethod = getQueryPublishersMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublishersRequest, com.pubsub.v1.QueryProto.QueryPublishersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublishers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublishersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublishersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublishers"))
              .build();
        }
      }
    }
    return getQueryPublishersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberResponse> getQuerySubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriber",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberResponse> getQuerySubscriberMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberRequest, com.pubsub.v1.QueryProto.QuerySubscriberResponse> getQuerySubscriberMethod;
    if ((getQuerySubscriberMethod = QueryGrpc.getQuerySubscriberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberMethod = QueryGrpc.getQuerySubscriberMethod) == null) {
          QueryGrpc.getQuerySubscriberMethod = getQuerySubscriberMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberRequest, com.pubsub.v1.QueryProto.QuerySubscriberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriber"))
              .build();
        }
      }
    }
    return getQuerySubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscribersRequest,
      com.pubsub.v1.QueryProto.QuerySubscribersResponse> getQuerySubscribersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscribers",
      requestType = com.pubsub.v1.QueryProto.QuerySubscribersRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscribersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscribersRequest,
      com.pubsub.v1.QueryProto.QuerySubscribersResponse> getQuerySubscribersMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscribersRequest, com.pubsub.v1.QueryProto.QuerySubscribersResponse> getQuerySubscribersMethod;
    if ((getQuerySubscribersMethod = QueryGrpc.getQuerySubscribersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscribersMethod = QueryGrpc.getQuerySubscribersMethod) == null) {
          QueryGrpc.getQuerySubscribersMethod = getQuerySubscribersMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscribersRequest, com.pubsub.v1.QueryProto.QuerySubscribersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscribers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscribersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscribersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscribers"))
              .build();
        }
      }
    }
    return getQuerySubscribersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> getQueryPublisherIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublisherIntent",
      requestType = com.pubsub.v1.QueryProto.QueryPublisherIntentRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublisherIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> getQueryPublisherIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> getQueryPublisherIntentMethod;
    if ((getQueryPublisherIntentMethod = QueryGrpc.getQueryPublisherIntentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublisherIntentMethod = QueryGrpc.getQueryPublisherIntentMethod) == null) {
          QueryGrpc.getQueryPublisherIntentMethod = getQueryPublisherIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublisherIntentRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublisherIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublisherIntent"))
              .build();
        }
      }
    }
    return getQueryPublisherIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> getQueryPublisherIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublisherIntents",
      requestType = com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> getQueryPublisherIntentsMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> getQueryPublisherIntentsMethod;
    if ((getQueryPublisherIntentsMethod = QueryGrpc.getQueryPublisherIntentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublisherIntentsMethod = QueryGrpc.getQueryPublisherIntentsMethod) == null) {
          QueryGrpc.getQueryPublisherIntentsMethod = getQueryPublisherIntentsMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublisherIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublisherIntents"))
              .build();
        }
      }
    }
    return getQueryPublisherIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> getQueryPublisherIntentsByPublisherDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublisherIntentsByPublisherDomain",
      requestType = com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> getQueryPublisherIntentsByPublisherDomainMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> getQueryPublisherIntentsByPublisherDomainMethod;
    if ((getQueryPublisherIntentsByPublisherDomainMethod = QueryGrpc.getQueryPublisherIntentsByPublisherDomainMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublisherIntentsByPublisherDomainMethod = QueryGrpc.getQueryPublisherIntentsByPublisherDomainMethod) == null) {
          QueryGrpc.getQueryPublisherIntentsByPublisherDomainMethod = getQueryPublisherIntentsByPublisherDomainMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublisherIntentsByPublisherDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublisherIntentsByPublisherDomain"))
              .build();
        }
      }
    }
    return getQueryPublisherIntentsByPublisherDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> getQueryPublisherIntentsBySubscriptionIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPublisherIntentsBySubscriptionID",
      requestType = com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest,
      com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> getQueryPublisherIntentsBySubscriptionIDMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> getQueryPublisherIntentsBySubscriptionIDMethod;
    if ((getQueryPublisherIntentsBySubscriptionIDMethod = QueryGrpc.getQueryPublisherIntentsBySubscriptionIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryPublisherIntentsBySubscriptionIDMethod = QueryGrpc.getQueryPublisherIntentsBySubscriptionIDMethod) == null) {
          QueryGrpc.getQueryPublisherIntentsBySubscriptionIDMethod = getQueryPublisherIntentsBySubscriptionIDMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest, com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPublisherIntentsBySubscriptionID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryPublisherIntentsBySubscriptionID"))
              .build();
        }
      }
    }
    return getQueryPublisherIntentsBySubscriptionIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> getQuerySubscriberIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriberIntent",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> getQuerySubscriberIntentMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> getQuerySubscriberIntentMethod;
    if ((getQuerySubscriberIntentMethod = QueryGrpc.getQuerySubscriberIntentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberIntentMethod = QueryGrpc.getQuerySubscriberIntentMethod) == null) {
          QueryGrpc.getQuerySubscriberIntentMethod = getQuerySubscriberIntentMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriberIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriberIntent"))
              .build();
        }
      }
    }
    return getQuerySubscriberIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> getQuerySubscriberIntentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriberIntents",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> getQuerySubscriberIntentsMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> getQuerySubscriberIntentsMethod;
    if ((getQuerySubscriberIntentsMethod = QueryGrpc.getQuerySubscriberIntentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberIntentsMethod = QueryGrpc.getQuerySubscriberIntentsMethod) == null) {
          QueryGrpc.getQuerySubscriberIntentsMethod = getQuerySubscriberIntentsMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriberIntents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriberIntents"))
              .build();
        }
      }
    }
    return getQuerySubscriberIntentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> getQuerySubscriberIntentsBySubscriberAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriberIntentsBySubscriberAddress",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> getQuerySubscriberIntentsBySubscriberAddressMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> getQuerySubscriberIntentsBySubscriberAddressMethod;
    if ((getQuerySubscriberIntentsBySubscriberAddressMethod = QueryGrpc.getQuerySubscriberIntentsBySubscriberAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberIntentsBySubscriberAddressMethod = QueryGrpc.getQuerySubscriberIntentsBySubscriberAddressMethod) == null) {
          QueryGrpc.getQuerySubscriberIntentsBySubscriberAddressMethod = getQuerySubscriberIntentsBySubscriberAddressMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriberIntentsBySubscriberAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriberIntentsBySubscriberAddress"))
              .build();
        }
      }
    }
    return getQuerySubscriberIntentsBySubscriberAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> getQuerySubscriberIntentsBySubscriptionIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriberIntentsBySubscriptionID",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> getQuerySubscriberIntentsBySubscriptionIDMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> getQuerySubscriberIntentsBySubscriptionIDMethod;
    if ((getQuerySubscriberIntentsBySubscriptionIDMethod = QueryGrpc.getQuerySubscriberIntentsBySubscriptionIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberIntentsBySubscriptionIDMethod = QueryGrpc.getQuerySubscriberIntentsBySubscriptionIDMethod) == null) {
          QueryGrpc.getQuerySubscriberIntentsBySubscriptionIDMethod = getQuerySubscriberIntentsBySubscriptionIDMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriberIntentsBySubscriptionID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriberIntentsBySubscriptionID"))
              .build();
        }
      }
    }
    return getQuerySubscriberIntentsBySubscriptionIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> getQuerySubscriberIntentsByPublisherDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySubscriberIntentsByPublisherDomain",
      requestType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest.class,
      responseType = com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest,
      com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> getQuerySubscriberIntentsByPublisherDomainMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> getQuerySubscriberIntentsByPublisherDomainMethod;
    if ((getQuerySubscriberIntentsByPublisherDomainMethod = QueryGrpc.getQuerySubscriberIntentsByPublisherDomainMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySubscriberIntentsByPublisherDomainMethod = QueryGrpc.getQuerySubscriberIntentsByPublisherDomainMethod) == null) {
          QueryGrpc.getQuerySubscriberIntentsByPublisherDomainMethod = getQuerySubscriberIntentsByPublisherDomainMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest, com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySubscriberIntentsByPublisherDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySubscriberIntentsByPublisherDomain"))
              .build();
        }
      }
    }
    return getQuerySubscriberIntentsByPublisherDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest,
      com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> getQueryDefaultSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDefaultSubscription",
      requestType = com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest,
      com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> getQueryDefaultSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest, com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> getQueryDefaultSubscriptionMethod;
    if ((getQueryDefaultSubscriptionMethod = QueryGrpc.getQueryDefaultSubscriptionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDefaultSubscriptionMethod = QueryGrpc.getQueryDefaultSubscriptionMethod) == null) {
          QueryGrpc.getQueryDefaultSubscriptionMethod = getQueryDefaultSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest, com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDefaultSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDefaultSubscription"))
              .build();
        }
      }
    }
    return getQueryDefaultSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest,
      com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> getQueryDefaultSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDefaultSubscriptions",
      requestType = com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest.class,
      responseType = com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest,
      com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> getQueryDefaultSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest, com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> getQueryDefaultSubscriptionsMethod;
    if ((getQueryDefaultSubscriptionsMethod = QueryGrpc.getQueryDefaultSubscriptionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDefaultSubscriptionsMethod = QueryGrpc.getQueryDefaultSubscriptionsMethod) == null) {
          QueryGrpc.getQueryDefaultSubscriptionsMethod = getQueryDefaultSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest, com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDefaultSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDefaultSubscriptions"))
              .build();
        }
      }
    }
    return getQueryDefaultSubscriptionsMethod;
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
    default void params(com.pubsub.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryPublisher(com.pubsub.v1.QueryProto.QueryPublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublisherMethod(), responseObserver);
    }

    /**
     */
    default void queryPublishers(com.pubsub.v1.QueryProto.QueryPublishersRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublishersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublishersMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriber(com.pubsub.v1.QueryProto.QuerySubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberMethod(), responseObserver);
    }

    /**
     */
    default void querySubscribers(com.pubsub.v1.QueryProto.QuerySubscribersRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscribersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscribersMethod(), responseObserver);
    }

    /**
     */
    default void queryPublisherIntent(com.pubsub.v1.QueryProto.QueryPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublisherIntentMethod(), responseObserver);
    }

    /**
     */
    default void queryPublisherIntents(com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublisherIntentsMethod(), responseObserver);
    }

    /**
     */
    default void queryPublisherIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublisherIntentsByPublisherDomainMethod(), responseObserver);
    }

    /**
     */
    default void queryPublisherIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPublisherIntentsBySubscriptionIDMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriberIntent(com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberIntentMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriberIntents(com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberIntentsMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriberIntentsBySubscriberAddress(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberIntentsBySubscriberAddressMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriberIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberIntentsBySubscriptionIDMethod(), responseObserver);
    }

    /**
     */
    default void querySubscriberIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySubscriberIntentsByPublisherDomainMethod(), responseObserver);
    }

    /**
     */
    default void queryDefaultSubscription(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDefaultSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void queryDefaultSubscriptions(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDefaultSubscriptionsMethod(), responseObserver);
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
    public void params(com.pubsub.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublisher(com.pubsub.v1.QueryProto.QueryPublisherRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublisherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublishers(com.pubsub.v1.QueryProto.QueryPublishersRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublishersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublishersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriber(com.pubsub.v1.QueryProto.QuerySubscriberRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscribers(com.pubsub.v1.QueryProto.QuerySubscribersRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscribersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscribersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublisherIntent(com.pubsub.v1.QueryProto.QueryPublisherIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublisherIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublisherIntents(com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublisherIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsByPublisherDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryPublisherIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsBySubscriptionIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriberIntent(com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriberIntents(com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriberIntentsBySubscriberAddress(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsBySubscriberAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriberIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsBySubscriptionIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySubscriberIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsByPublisherDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDefaultSubscription(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDefaultSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDefaultSubscriptions(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDefaultSubscriptionsMethod(), getCallOptions()), request, responseObserver);
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
    public com.pubsub.v1.QueryProto.QueryParamsResponse params(com.pubsub.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublisherResponse queryPublisher(com.pubsub.v1.QueryProto.QueryPublisherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublisherMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublishersResponse queryPublishers(com.pubsub.v1.QueryProto.QueryPublishersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublishersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberResponse querySubscriber(com.pubsub.v1.QueryProto.QuerySubscriberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscribersResponse querySubscribers(com.pubsub.v1.QueryProto.QuerySubscribersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscribersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublisherIntentResponse queryPublisherIntent(com.pubsub.v1.QueryProto.QueryPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublisherIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse queryPublisherIntents(com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublisherIntentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse queryPublisherIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublisherIntentsByPublisherDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse queryPublisherIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPublisherIntentsBySubscriptionIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse querySubscriberIntent(com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberIntentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse querySubscriberIntents(com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberIntentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse querySubscriberIntentsBySubscriberAddress(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberIntentsBySubscriberAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse querySubscriberIntentsBySubscriptionID(com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberIntentsBySubscriptionIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse querySubscriberIntentsByPublisherDomain(com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySubscriberIntentsByPublisherDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse queryDefaultSubscription(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDefaultSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse queryDefaultSubscriptions(com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDefaultSubscriptionsMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryParamsResponse> params(
        com.pubsub.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublisherResponse> queryPublisher(
        com.pubsub.v1.QueryProto.QueryPublisherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublisherMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublishersResponse> queryPublishers(
        com.pubsub.v1.QueryProto.QueryPublishersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublishersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberResponse> querySubscriber(
        com.pubsub.v1.QueryProto.QuerySubscriberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscribersResponse> querySubscribers(
        com.pubsub.v1.QueryProto.QuerySubscribersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscribersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublisherIntentResponse> queryPublisherIntent(
        com.pubsub.v1.QueryProto.QueryPublisherIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublisherIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse> queryPublisherIntents(
        com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse> queryPublisherIntentsByPublisherDomain(
        com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsByPublisherDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse> queryPublisherIntentsBySubscriptionID(
        com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPublisherIntentsBySubscriptionIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse> querySubscriberIntent(
        com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse> querySubscriberIntents(
        com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse> querySubscriberIntentsBySubscriberAddress(
        com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsBySubscriberAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse> querySubscriberIntentsBySubscriptionID(
        com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsBySubscriptionIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse> querySubscriberIntentsByPublisherDomain(
        com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySubscriberIntentsByPublisherDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse> queryDefaultSubscription(
        com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDefaultSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse> queryDefaultSubscriptions(
        com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDefaultSubscriptionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_QUERY_PUBLISHER = 1;
  private static final int METHODID_QUERY_PUBLISHERS = 2;
  private static final int METHODID_QUERY_SUBSCRIBER = 3;
  private static final int METHODID_QUERY_SUBSCRIBERS = 4;
  private static final int METHODID_QUERY_PUBLISHER_INTENT = 5;
  private static final int METHODID_QUERY_PUBLISHER_INTENTS = 6;
  private static final int METHODID_QUERY_PUBLISHER_INTENTS_BY_PUBLISHER_DOMAIN = 7;
  private static final int METHODID_QUERY_PUBLISHER_INTENTS_BY_SUBSCRIPTION_ID = 8;
  private static final int METHODID_QUERY_SUBSCRIBER_INTENT = 9;
  private static final int METHODID_QUERY_SUBSCRIBER_INTENTS = 10;
  private static final int METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIBER_ADDRESS = 11;
  private static final int METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIPTION_ID = 12;
  private static final int METHODID_QUERY_SUBSCRIBER_INTENTS_BY_PUBLISHER_DOMAIN = 13;
  private static final int METHODID_QUERY_DEFAULT_SUBSCRIPTION = 14;
  private static final int METHODID_QUERY_DEFAULT_SUBSCRIPTIONS = 15;

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
          serviceImpl.params((com.pubsub.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHER:
          serviceImpl.queryPublisher((com.pubsub.v1.QueryProto.QueryPublisherRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHERS:
          serviceImpl.queryPublishers((com.pubsub.v1.QueryProto.QueryPublishersRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublishersResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER:
          serviceImpl.querySubscriber((com.pubsub.v1.QueryProto.QuerySubscriberRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBERS:
          serviceImpl.querySubscribers((com.pubsub.v1.QueryProto.QuerySubscribersRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscribersResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHER_INTENT:
          serviceImpl.queryPublisherIntent((com.pubsub.v1.QueryProto.QueryPublisherIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHER_INTENTS:
          serviceImpl.queryPublisherIntents((com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHER_INTENTS_BY_PUBLISHER_DOMAIN:
          serviceImpl.queryPublisherIntentsByPublisherDomain((com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse>) responseObserver);
          break;
        case METHODID_QUERY_PUBLISHER_INTENTS_BY_SUBSCRIPTION_ID:
          serviceImpl.queryPublisherIntentsBySubscriptionID((com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER_INTENT:
          serviceImpl.querySubscriberIntent((com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER_INTENTS:
          serviceImpl.querySubscriberIntents((com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIBER_ADDRESS:
          serviceImpl.querySubscriberIntentsBySubscriberAddress((com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIPTION_ID:
          serviceImpl.querySubscriberIntentsBySubscriptionID((com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse>) responseObserver);
          break;
        case METHODID_QUERY_SUBSCRIBER_INTENTS_BY_PUBLISHER_DOMAIN:
          serviceImpl.querySubscriberIntentsByPublisherDomain((com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEFAULT_SUBSCRIPTION:
          serviceImpl.queryDefaultSubscription((com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEFAULT_SUBSCRIPTIONS:
          serviceImpl.queryDefaultSubscriptions((com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse>) responseObserver);
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
              com.pubsub.v1.QueryProto.QueryParamsRequest,
              com.pubsub.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getQueryPublisherMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublisherRequest,
              com.pubsub.v1.QueryProto.QueryPublisherResponse>(
                service, METHODID_QUERY_PUBLISHER)))
        .addMethod(
          getQueryPublishersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublishersRequest,
              com.pubsub.v1.QueryProto.QueryPublishersResponse>(
                service, METHODID_QUERY_PUBLISHERS)))
        .addMethod(
          getQuerySubscriberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberResponse>(
                service, METHODID_QUERY_SUBSCRIBER)))
        .addMethod(
          getQuerySubscribersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscribersRequest,
              com.pubsub.v1.QueryProto.QuerySubscribersResponse>(
                service, METHODID_QUERY_SUBSCRIBERS)))
        .addMethod(
          getQueryPublisherIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublisherIntentRequest,
              com.pubsub.v1.QueryProto.QueryPublisherIntentResponse>(
                service, METHODID_QUERY_PUBLISHER_INTENT)))
        .addMethod(
          getQueryPublisherIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublisherIntentsRequest,
              com.pubsub.v1.QueryProto.QueryPublisherIntentsResponse>(
                service, METHODID_QUERY_PUBLISHER_INTENTS)))
        .addMethod(
          getQueryPublisherIntentsByPublisherDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainRequest,
              com.pubsub.v1.QueryProto.QueryPublisherIntentsByPublisherDomainResponse>(
                service, METHODID_QUERY_PUBLISHER_INTENTS_BY_PUBLISHER_DOMAIN)))
        .addMethod(
          getQueryPublisherIntentsBySubscriptionIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDRequest,
              com.pubsub.v1.QueryProto.QueryPublisherIntentsBySubscriptionIDResponse>(
                service, METHODID_QUERY_PUBLISHER_INTENTS_BY_SUBSCRIPTION_ID)))
        .addMethod(
          getQuerySubscriberIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberIntentRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberIntentResponse>(
                service, METHODID_QUERY_SUBSCRIBER_INTENT)))
        .addMethod(
          getQuerySubscriberIntentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsResponse>(
                service, METHODID_QUERY_SUBSCRIBER_INTENTS)))
        .addMethod(
          getQuerySubscriberIntentsBySubscriberAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriberAddressResponse>(
                service, METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIBER_ADDRESS)))
        .addMethod(
          getQuerySubscriberIntentsBySubscriptionIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsBySubscriptionIDResponse>(
                service, METHODID_QUERY_SUBSCRIBER_INTENTS_BY_SUBSCRIPTION_ID)))
        .addMethod(
          getQuerySubscriberIntentsByPublisherDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainRequest,
              com.pubsub.v1.QueryProto.QuerySubscriberIntentsByPublisherDomainResponse>(
                service, METHODID_QUERY_SUBSCRIBER_INTENTS_BY_PUBLISHER_DOMAIN)))
        .addMethod(
          getQueryDefaultSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryDefaultSubscriptionRequest,
              com.pubsub.v1.QueryProto.QueryDefaultSubscriptionResponse>(
                service, METHODID_QUERY_DEFAULT_SUBSCRIPTION)))
        .addMethod(
          getQueryDefaultSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsRequest,
              com.pubsub.v1.QueryProto.QueryDefaultSubscriptionsResponse>(
                service, METHODID_QUERY_DEFAULT_SUBSCRIPTIONS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pubsub.v1.QueryProto.getDescriptor();
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
              .addMethod(getQueryPublisherMethod())
              .addMethod(getQueryPublishersMethod())
              .addMethod(getQuerySubscriberMethod())
              .addMethod(getQuerySubscribersMethod())
              .addMethod(getQueryPublisherIntentMethod())
              .addMethod(getQueryPublisherIntentsMethod())
              .addMethod(getQueryPublisherIntentsByPublisherDomainMethod())
              .addMethod(getQueryPublisherIntentsBySubscriptionIDMethod())
              .addMethod(getQuerySubscriberIntentMethod())
              .addMethod(getQuerySubscriberIntentsMethod())
              .addMethod(getQuerySubscriberIntentsBySubscriberAddressMethod())
              .addMethod(getQuerySubscriberIntentsBySubscriptionIDMethod())
              .addMethod(getQuerySubscriberIntentsByPublisherDomainMethod())
              .addMethod(getQueryDefaultSubscriptionMethod())
              .addMethod(getQueryDefaultSubscriptionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
