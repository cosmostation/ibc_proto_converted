package com.OmniFlix.itc.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/itc/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.itc.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest, com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest, com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> getCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Campaigns",
      requestType = com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest.class,
      responseType = com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> getCampaignsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest, com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> getCampaignsMethod;
    if ((getCampaignsMethod = QueryGrpc.getCampaignsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCampaignsMethod = QueryGrpc.getCampaignsMethod) == null) {
          QueryGrpc.getCampaignsMethod = getCampaignsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest, com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Campaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Campaigns"))
              .build();
        }
      }
    }
    return getCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> getCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Campaign",
      requestType = com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest.class,
      responseType = com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> getCampaignMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest, com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> getCampaignMethod;
    if ((getCampaignMethod = QueryGrpc.getCampaignMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCampaignMethod = QueryGrpc.getCampaignMethod) == null) {
          QueryGrpc.getCampaignMethod = getCampaignMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest, com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Campaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Campaign"))
              .build();
        }
      }
    }
    return getCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> getClaimsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Claims",
      requestType = com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest.class,
      responseType = com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest,
      com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> getClaimsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest, com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> getClaimsMethod;
    if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimsMethod = QueryGrpc.getClaimsMethod) == null) {
          QueryGrpc.getClaimsMethod = getClaimsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest, com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Claims"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Claims"))
              .build();
        }
      }
    }
    return getClaimsMethod;
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
     */
    default void params(com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void campaigns(com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampaignsMethod(), responseObserver);
    }

    /**
     */
    default void campaign(com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCampaignMethod(), responseObserver);
    }

    /**
     */
    default void claims(com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimsMethod(), responseObserver);
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
     */
    public void params(com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void campaigns(com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void campaign(com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claims(com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse params(com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse campaigns(com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampaignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse campaign(com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse claims(com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimsMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse> params(
        com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse> campaigns(
        com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampaignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse> campaign(
        com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse> claims(
        com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CAMPAIGNS = 1;
  private static final int METHODID_CAMPAIGN = 2;
  private static final int METHODID_CLAIMS = 3;

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
          serviceImpl.params((com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CAMPAIGNS:
          serviceImpl.campaigns((com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse>) responseObserver);
          break;
        case METHODID_CAMPAIGN:
          serviceImpl.campaign((com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse>) responseObserver);
          break;
        case METHODID_CLAIMS:
          serviceImpl.claims((com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse>) responseObserver);
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
              com.OmniFlix.itc.v1.QueryProto.QueryParamsRequest,
              com.OmniFlix.itc.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.QueryProto.QueryCampaignsRequest,
              com.OmniFlix.itc.v1.QueryProto.QueryCampaignsResponse>(
                service, METHODID_CAMPAIGNS)))
        .addMethod(
          getCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.QueryProto.QueryCampaignRequest,
              com.OmniFlix.itc.v1.QueryProto.QueryCampaignResponse>(
                service, METHODID_CAMPAIGN)))
        .addMethod(
          getClaimsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.itc.v1.QueryProto.QueryClaimsRequest,
              com.OmniFlix.itc.v1.QueryProto.QueryClaimsResponse>(
                service, METHODID_CLAIMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.itc.v1.QueryProto.getDescriptor();
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
              .addMethod(getCampaignsMethod())
              .addMethod(getCampaignMethod())
              .addMethod(getClaimsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
