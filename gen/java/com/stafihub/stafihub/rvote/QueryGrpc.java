package com.stafihub.stafihub.rvote;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/rvote/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.rvote.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalRequest,
      com.stafihub.stafihub.rvote.QueryGetProposalResponse> getGetProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposal",
      requestType = com.stafihub.stafihub.rvote.QueryGetProposalRequest.class,
      responseType = com.stafihub.stafihub.rvote.QueryGetProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalRequest,
      com.stafihub.stafihub.rvote.QueryGetProposalResponse> getGetProposalMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalRequest, com.stafihub.stafihub.rvote.QueryGetProposalResponse> getGetProposalMethod;
    if ((getGetProposalMethod = QueryGrpc.getGetProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProposalMethod = QueryGrpc.getGetProposalMethod) == null) {
          QueryGrpc.getGetProposalMethod = getGetProposalMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvote.QueryGetProposalRequest, com.stafihub.stafihub.rvote.QueryGetProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvote.QueryGetProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvote.QueryGetProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProposal"))
              .build();
        }
      }
    }
    return getGetProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest,
      com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> getGetProposalLifeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProposalLife",
      requestType = com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest.class,
      responseType = com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest,
      com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> getGetProposalLifeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest, com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> getGetProposalLifeMethod;
    if ((getGetProposalLifeMethod = QueryGrpc.getGetProposalLifeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetProposalLifeMethod = QueryGrpc.getGetProposalLifeMethod) == null) {
          QueryGrpc.getGetProposalLifeMethod = getGetProposalLifeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest, com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProposalLife"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetProposalLife"))
              .build();
        }
      }
    }
    return getGetProposalLifeMethod;
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
     * Queries a list of getProposal items.
     * </pre>
     */
    default void getProposal(com.stafihub.stafihub.rvote.QueryGetProposalRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    default void getProposalLife(com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProposalLifeMethod(), responseObserver);
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public void getProposal(com.stafihub.stafihub.rvote.QueryGetProposalRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public void getProposalLife(com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProposalLifeMethod(), getCallOptions()), request, responseObserver);
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public com.stafihub.stafihub.rvote.QueryGetProposalResponse getProposal(com.stafihub.stafihub.rvote.QueryGetProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse getProposalLife(com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProposalLifeMethod(), getCallOptions(), request);
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
     * Queries a list of getProposal items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvote.QueryGetProposalResponse> getProposal(
        com.stafihub.stafihub.rvote.QueryGetProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of getProposalLife items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse> getProposalLife(
        com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProposalLifeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPOSAL = 0;
  private static final int METHODID_GET_PROPOSAL_LIFE = 1;

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
        case METHODID_GET_PROPOSAL:
          serviceImpl.getProposal((com.stafihub.stafihub.rvote.QueryGetProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalResponse>) responseObserver);
          break;
        case METHODID_GET_PROPOSAL_LIFE:
          serviceImpl.getProposalLife((com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse>) responseObserver);
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
          getGetProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvote.QueryGetProposalRequest,
              com.stafihub.stafihub.rvote.QueryGetProposalResponse>(
                service, METHODID_GET_PROPOSAL)))
        .addMethod(
          getGetProposalLifeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.rvote.QueryGetProposalLifeRequest,
              com.stafihub.stafihub.rvote.QueryGetProposalLifeResponse>(
                service, METHODID_GET_PROPOSAL_LIFE)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.rvote.QueryProto.getDescriptor();
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
              .addMethod(getGetProposalMethod())
              .addMethod(getGetProposalLifeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
