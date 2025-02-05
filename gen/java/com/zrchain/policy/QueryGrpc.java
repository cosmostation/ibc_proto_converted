package com.zrchain.policy;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/policy/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "zrchain.policy.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryParamsRequest,
      com.zrchain.policy.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.zrchain.policy.QueryProto.QueryParamsRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryParamsRequest,
      com.zrchain.policy.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryParamsRequest, com.zrchain.policy.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryParamsRequest, com.zrchain.policy.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionsRequest,
      com.zrchain.policy.QueryProto.QueryActionsResponse> getActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Actions",
      requestType = com.zrchain.policy.QueryProto.QueryActionsRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionsRequest,
      com.zrchain.policy.QueryProto.QueryActionsResponse> getActionsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionsRequest, com.zrchain.policy.QueryProto.QueryActionsResponse> getActionsMethod;
    if ((getActionsMethod = QueryGrpc.getActionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActionsMethod = QueryGrpc.getActionsMethod) == null) {
          QueryGrpc.getActionsMethod = getActionsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryActionsRequest, com.zrchain.policy.QueryProto.QueryActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Actions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryActionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Actions"))
              .build();
        }
      }
    }
    return getActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesRequest,
      com.zrchain.policy.QueryProto.QueryPoliciesResponse> getPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Policies",
      requestType = com.zrchain.policy.QueryProto.QueryPoliciesRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesRequest,
      com.zrchain.policy.QueryProto.QueryPoliciesResponse> getPoliciesMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesRequest, com.zrchain.policy.QueryProto.QueryPoliciesResponse> getPoliciesMethod;
    if ((getPoliciesMethod = QueryGrpc.getPoliciesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoliciesMethod = QueryGrpc.getPoliciesMethod) == null) {
          QueryGrpc.getPoliciesMethod = getPoliciesMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryPoliciesRequest, com.zrchain.policy.QueryProto.QueryPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Policies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Policies"))
              .build();
        }
      }
    }
    return getPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPolicyByIdRequest,
      com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> getPolicyByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PolicyById",
      requestType = com.zrchain.policy.QueryProto.QueryPolicyByIdRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryPolicyByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPolicyByIdRequest,
      com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> getPolicyByIdMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPolicyByIdRequest, com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> getPolicyByIdMethod;
    if ((getPolicyByIdMethod = QueryGrpc.getPolicyByIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPolicyByIdMethod = QueryGrpc.getPolicyByIdMethod) == null) {
          QueryGrpc.getPolicyByIdMethod = getPolicyByIdMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryPolicyByIdRequest, com.zrchain.policy.QueryProto.QueryPolicyByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PolicyById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPolicyByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPolicyByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PolicyById"))
              .build();
        }
      }
    }
    return getPolicyByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest,
      com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> getSignMethodsByAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignMethodsByAddress",
      requestType = com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest.class,
      responseType = com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest,
      com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> getSignMethodsByAddressMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest, com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> getSignMethodsByAddressMethod;
    if ((getSignMethodsByAddressMethod = QueryGrpc.getSignMethodsByAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSignMethodsByAddressMethod = QueryGrpc.getSignMethodsByAddressMethod) == null) {
          QueryGrpc.getSignMethodsByAddressMethod = getSignMethodsByAddressMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest, com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignMethodsByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SignMethodsByAddress"))
              .build();
        }
      }
    }
    return getSignMethodsByAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest,
      com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> getPoliciesByCreatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PoliciesByCreator",
      requestType = com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest,
      com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> getPoliciesByCreatorMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest, com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> getPoliciesByCreatorMethod;
    if ((getPoliciesByCreatorMethod = QueryGrpc.getPoliciesByCreatorMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPoliciesByCreatorMethod = QueryGrpc.getPoliciesByCreatorMethod) == null) {
          QueryGrpc.getPoliciesByCreatorMethod = getPoliciesByCreatorMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest, com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PoliciesByCreator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PoliciesByCreator"))
              .build();
        }
      }
    }
    return getPoliciesByCreatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest,
      com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> getActionDetailsByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActionDetailsById",
      requestType = com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest.class,
      responseType = com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest,
      com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> getActionDetailsByIdMethod() {
    io.grpc.MethodDescriptor<com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest, com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> getActionDetailsByIdMethod;
    if ((getActionDetailsByIdMethod = QueryGrpc.getActionDetailsByIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getActionDetailsByIdMethod = QueryGrpc.getActionDetailsByIdMethod) == null) {
          QueryGrpc.getActionDetailsByIdMethod = getActionDetailsByIdMethod =
              io.grpc.MethodDescriptor.<com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest, com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActionDetailsById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ActionDetailsById"))
              .build();
        }
      }
    }
    return getActionDetailsByIdMethod;
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    default void params(com.zrchain.policy.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Actions items.
     * </pre>
     */
    default void actions(com.zrchain.policy.QueryProto.QueryActionsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Policies items.
     * </pre>
     */
    default void policies(com.zrchain.policy.QueryProto.QueryPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PolicyById items.
     * </pre>
     */
    default void policyById(com.zrchain.policy.QueryProto.QueryPolicyByIdRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPolicyByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignMethodsByAddress items.
     * </pre>
     */
    default void signMethodsByAddress(com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMethodsByAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoliciesByCreator items.
     * </pre>
     */
    default void policiesByCreator(com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPoliciesByCreatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActionDetailsById items.
     * </pre>
     */
    default void actionDetailsById(com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActionDetailsByIdMethod(), responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public void params(com.zrchain.policy.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Actions items.
     * </pre>
     */
    public void actions(com.zrchain.policy.QueryProto.QueryActionsRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Policies items.
     * </pre>
     */
    public void policies(com.zrchain.policy.QueryProto.QueryPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PolicyById items.
     * </pre>
     */
    public void policyById(com.zrchain.policy.QueryProto.QueryPolicyByIdRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPolicyByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SignMethodsByAddress items.
     * </pre>
     */
    public void signMethodsByAddress(com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMethodsByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of PoliciesByCreator items.
     * </pre>
     */
    public void policiesByCreator(com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPoliciesByCreatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ActionDetailsById items.
     * </pre>
     */
    public void actionDetailsById(com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActionDetailsByIdMethod(), getCallOptions()), request, responseObserver);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryParamsResponse params(com.zrchain.policy.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Actions items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryActionsResponse actions(com.zrchain.policy.QueryProto.QueryActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Policies items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryPoliciesResponse policies(com.zrchain.policy.QueryProto.QueryPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PolicyById items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryPolicyByIdResponse policyById(com.zrchain.policy.QueryProto.QueryPolicyByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPolicyByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SignMethodsByAddress items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse signMethodsByAddress(com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethodsByAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of PoliciesByCreator items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse policiesByCreator(com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPoliciesByCreatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ActionDetailsById items.
     * </pre>
     */
    public com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse actionDetailsById(com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActionDetailsByIdMethod(), getCallOptions(), request);
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
     * Parameters queries the parameters of the module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryParamsResponse> params(
        com.zrchain.policy.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Actions items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryActionsResponse> actions(
        com.zrchain.policy.QueryProto.QueryActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Policies items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryPoliciesResponse> policies(
        com.zrchain.policy.QueryProto.QueryPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PolicyById items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryPolicyByIdResponse> policyById(
        com.zrchain.policy.QueryProto.QueryPolicyByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPolicyByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SignMethodsByAddress items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse> signMethodsByAddress(
        com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMethodsByAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of PoliciesByCreator items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse> policiesByCreator(
        com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPoliciesByCreatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ActionDetailsById items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse> actionDetailsById(
        com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActionDetailsByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ACTIONS = 1;
  private static final int METHODID_POLICIES = 2;
  private static final int METHODID_POLICY_BY_ID = 3;
  private static final int METHODID_SIGN_METHODS_BY_ADDRESS = 4;
  private static final int METHODID_POLICIES_BY_CREATOR = 5;
  private static final int METHODID_ACTION_DETAILS_BY_ID = 6;

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
          serviceImpl.params((com.zrchain.policy.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ACTIONS:
          serviceImpl.actions((com.zrchain.policy.QueryProto.QueryActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionsResponse>) responseObserver);
          break;
        case METHODID_POLICIES:
          serviceImpl.policies((com.zrchain.policy.QueryProto.QueryPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesResponse>) responseObserver);
          break;
        case METHODID_POLICY_BY_ID:
          serviceImpl.policyById((com.zrchain.policy.QueryProto.QueryPolicyByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPolicyByIdResponse>) responseObserver);
          break;
        case METHODID_SIGN_METHODS_BY_ADDRESS:
          serviceImpl.signMethodsByAddress((com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse>) responseObserver);
          break;
        case METHODID_POLICIES_BY_CREATOR:
          serviceImpl.policiesByCreator((com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse>) responseObserver);
          break;
        case METHODID_ACTION_DETAILS_BY_ID:
          serviceImpl.actionDetailsById((com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse>) responseObserver);
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
              com.zrchain.policy.QueryProto.QueryParamsRequest,
              com.zrchain.policy.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getActionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QueryActionsRequest,
              com.zrchain.policy.QueryProto.QueryActionsResponse>(
                service, METHODID_ACTIONS)))
        .addMethod(
          getPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QueryPoliciesRequest,
              com.zrchain.policy.QueryProto.QueryPoliciesResponse>(
                service, METHODID_POLICIES)))
        .addMethod(
          getPolicyByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QueryPolicyByIdRequest,
              com.zrchain.policy.QueryProto.QueryPolicyByIdResponse>(
                service, METHODID_POLICY_BY_ID)))
        .addMethod(
          getSignMethodsByAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QuerySignMethodsByAddressRequest,
              com.zrchain.policy.QueryProto.QuerySignMethodsByAddressResponse>(
                service, METHODID_SIGN_METHODS_BY_ADDRESS)))
        .addMethod(
          getPoliciesByCreatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QueryPoliciesByCreatorRequest,
              com.zrchain.policy.QueryProto.QueryPoliciesByCreatorResponse>(
                service, METHODID_POLICIES_BY_CREATOR)))
        .addMethod(
          getActionDetailsByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.policy.QueryProto.QueryActionDetailsByIdRequest,
              com.zrchain.policy.QueryProto.QueryActionDetailsByIdResponse>(
                service, METHODID_ACTION_DETAILS_BY_ID)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.policy.QueryProto.getDescriptor();
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
              .addMethod(getActionsMethod())
              .addMethod(getPoliciesMethod())
              .addMethod(getPolicyByIdMethod())
              .addMethod(getSignMethodsByAddressMethod())
              .addMethod(getPoliciesByCreatorMethod())
              .addMethod(getActionDetailsByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
