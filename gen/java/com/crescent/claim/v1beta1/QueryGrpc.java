package com.crescent.claim.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: crescent/claim/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "crescent.claim.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> getAirdropsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Airdrops",
      requestType = com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest.class,
      responseType = com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> getAirdropsMethod() {
    io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest, com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> getAirdropsMethod;
    if ((getAirdropsMethod = QueryGrpc.getAirdropsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAirdropsMethod = QueryGrpc.getAirdropsMethod) == null) {
          QueryGrpc.getAirdropsMethod = getAirdropsMethod =
              io.grpc.MethodDescriptor.<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest, com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Airdrops"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Airdrops"))
              .build();
        }
      }
    }
    return getAirdropsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> getAirdropMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Airdrop",
      requestType = com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest.class,
      responseType = com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> getAirdropMethod() {
    io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest, com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> getAirdropMethod;
    if ((getAirdropMethod = QueryGrpc.getAirdropMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAirdropMethod = QueryGrpc.getAirdropMethod) == null) {
          QueryGrpc.getAirdropMethod = getAirdropMethod =
              io.grpc.MethodDescriptor.<com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest, com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Airdrop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Airdrop"))
              .build();
        }
      }
    }
    return getAirdropMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClaimRecord",
      requestType = com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest.class,
      responseType = com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest,
      com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod() {
    io.grpc.MethodDescriptor<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest, com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> getClaimRecordMethod;
    if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getClaimRecordMethod = QueryGrpc.getClaimRecordMethod) == null) {
          QueryGrpc.getClaimRecordMethod = getClaimRecordMethod =
              io.grpc.MethodDescriptor.<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest, com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClaimRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ClaimRecord"))
              .build();
        }
      }
    }
    return getClaimRecordMethod;
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
     * Airdrops returns all airdrops.
     * </pre>
     */
    default void airdrops(com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAirdropsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Airdrop returns the specific airdrop.
     * </pre>
     */
    default void airdrop(com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAirdropMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record for the recipient address.
     * </pre>
     */
    default void claimRecord(com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClaimRecordMethod(), responseObserver);
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
     * Airdrops returns all airdrops.
     * </pre>
     */
    public void airdrops(com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAirdropsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Airdrop returns the specific airdrop.
     * </pre>
     */
    public void airdrop(com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAirdropMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record for the recipient address.
     * </pre>
     */
    public void claimRecord(com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest request,
        io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request, responseObserver);
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
     * Airdrops returns all airdrops.
     * </pre>
     */
    public com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse airdrops(com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAirdropsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Airdrop returns the specific airdrop.
     * </pre>
     */
    public com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse airdrop(com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAirdropMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record for the recipient address.
     * </pre>
     */
    public com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse claimRecord(com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClaimRecordMethod(), getCallOptions(), request);
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
     * Airdrops returns all airdrops.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse> airdrops(
        com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAirdropsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Airdrop returns the specific airdrop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse> airdrop(
        com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAirdropMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClaimRecord returns the claim record for the recipient address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse> claimRecord(
        com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClaimRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AIRDROPS = 0;
  private static final int METHODID_AIRDROP = 1;
  private static final int METHODID_CLAIM_RECORD = 2;

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
        case METHODID_AIRDROPS:
          serviceImpl.airdrops((com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse>) responseObserver);
          break;
        case METHODID_AIRDROP:
          serviceImpl.airdrop((com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse>) responseObserver);
          break;
        case METHODID_CLAIM_RECORD:
          serviceImpl.claimRecord((com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse>) responseObserver);
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
          getAirdropsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.claim.v1beta1.QueryProto.QueryAirdropsRequest,
              com.crescent.claim.v1beta1.QueryProto.QueryAirdropsResponse>(
                service, METHODID_AIRDROPS)))
        .addMethod(
          getAirdropMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.claim.v1beta1.QueryProto.QueryAirdropRequest,
              com.crescent.claim.v1beta1.QueryProto.QueryAirdropResponse>(
                service, METHODID_AIRDROP)))
        .addMethod(
          getClaimRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordRequest,
              com.crescent.claim.v1beta1.QueryProto.QueryClaimRecordResponse>(
                service, METHODID_CLAIM_RECORD)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crescent.claim.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getAirdropsMethod())
              .addMethod(getAirdropMethod())
              .addMethod(getClaimRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
