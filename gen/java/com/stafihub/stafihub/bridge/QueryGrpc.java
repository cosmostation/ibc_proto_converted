package com.stafihub.stafihub.bridge;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stafihub/bridge/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stafihub.stafihub.bridge.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> getChaindIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChaindIds",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> getChaindIdsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> getChaindIdsMethod;
    if ((getChaindIdsMethod = QueryGrpc.getChaindIdsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChaindIdsMethod = QueryGrpc.getChaindIdsMethod) == null) {
          QueryGrpc.getChaindIdsMethod = getChaindIdsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChaindIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChaindIds"))
              .build();
        }
      }
    }
    return getChaindIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> getProposalDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalDetail",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> getProposalDetailMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest, com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> getProposalDetailMethod;
    if ((getProposalDetailMethod = QueryGrpc.getProposalDetailMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalDetailMethod = QueryGrpc.getProposalDetailMethod) == null) {
          QueryGrpc.getProposalDetailMethod = getProposalDetailMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest, com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProposalDetail"))
              .build();
        }
      }
    }
    return getProposalDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceidToDenoms",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> getResourceidToDenomsMethod;
    if ((getResourceidToDenomsMethod = QueryGrpc.getResourceidToDenomsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourceidToDenomsMethod = QueryGrpc.getResourceidToDenomsMethod) == null) {
          QueryGrpc.getResourceidToDenomsMethod = getResourceidToDenomsMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest, com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceidToDenoms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ResourceidToDenoms"))
              .build();
        }
      }
    }
    return getResourceidToDenomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFeeReceiver",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> getRelayFeeReceiverMethod;
    if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeReceiverMethod = QueryGrpc.getRelayFeeReceiverMethod) == null) {
          QueryGrpc.getRelayFeeReceiverMethod = getRelayFeeReceiverMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest, com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFeeReceiver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFeeReceiver"))
              .build();
        }
      }
    }
    return getRelayFeeReceiverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> getRelayFeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelayFee",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> getRelayFeeMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest, com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> getRelayFeeMethod;
    if ((getRelayFeeMethod = QueryGrpc.getRelayFeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRelayFeeMethod = QueryGrpc.getRelayFeeMethod) == null) {
          QueryGrpc.getRelayFeeMethod = getRelayFeeMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest, com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelayFee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RelayFee"))
              .build();
        }
      }
    }
    return getRelayFeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> getBannedDenomListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BannedDenomList",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> getBannedDenomListMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest, com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> getBannedDenomListMethod;
    if ((getBannedDenomListMethod = QueryGrpc.getBannedDenomListMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBannedDenomListMethod = QueryGrpc.getBannedDenomListMethod) == null) {
          QueryGrpc.getBannedDenomListMethod = getBannedDenomListMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest, com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BannedDenomList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BannedDenomList"))
              .build();
        }
      }
    }
    return getBannedDenomListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> getGetDepositCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDepositCount",
      requestType = com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest.class,
      responseType = com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest,
      com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> getGetDepositCountMethod() {
    io.grpc.MethodDescriptor<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest, com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> getGetDepositCountMethod;
    if ((getGetDepositCountMethod = QueryGrpc.getGetDepositCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGetDepositCountMethod = QueryGrpc.getGetDepositCountMethod) == null) {
          QueryGrpc.getGetDepositCountMethod = getGetDepositCountMethod =
              io.grpc.MethodDescriptor.<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest, com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDepositCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GetDepositCount"))
              .build();
        }
      }
    }
    return getGetDepositCountMethod;
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
    default void params(com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    default void chaindIds(com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChaindIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    default void proposalDetail(com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    default void resourceidToDenoms(com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceidToDenomsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    default void relayFeeReceiver(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayFeeReceiverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    default void relayFee(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelayFeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    default void bannedDenomList(com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBannedDenomListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    default void getDepositCount(com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDepositCountMethod(), responseObserver);
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
    public void params(com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public void chaindIds(com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChaindIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public void proposalDetail(com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public void resourceidToDenoms(com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceidToDenomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public void relayFeeReceiver(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public void relayFee(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelayFeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public void bannedDenomList(com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBannedDenomListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public void getDepositCount(com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest request,
        io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDepositCountMethod(), getCallOptions()), request, responseObserver);
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
    public com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse params(com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse chaindIds(com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChaindIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse proposalDetail(com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse resourceidToDenoms(com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceidToDenomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse relayFeeReceiver(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayFeeReceiverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse relayFee(com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelayFeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse bannedDenomList(com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBannedDenomListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse getDepositCount(com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDepositCountMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse> params(
        com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ChaindIds items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse> chaindIds(
        com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChaindIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ProposalDetail items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse> proposalDetail(
        com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of ResourceidToDenoms items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse> resourceidToDenoms(
        com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceidToDenomsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFeeReceiver items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse> relayFeeReceiver(
        com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayFeeReceiverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of RelayFee items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse> relayFee(
        com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelayFeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of BannedDenomList items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse> bannedDenomList(
        com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBannedDenomListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of GetDepositCount items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse> getDepositCount(
        com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDepositCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_CHAIND_IDS = 1;
  private static final int METHODID_PROPOSAL_DETAIL = 2;
  private static final int METHODID_RESOURCEID_TO_DENOMS = 3;
  private static final int METHODID_RELAY_FEE_RECEIVER = 4;
  private static final int METHODID_RELAY_FEE = 5;
  private static final int METHODID_BANNED_DENOM_LIST = 6;
  private static final int METHODID_GET_DEPOSIT_COUNT = 7;

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
          serviceImpl.params((com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_CHAIND_IDS:
          serviceImpl.chaindIds((com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL_DETAIL:
          serviceImpl.proposalDetail((com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse>) responseObserver);
          break;
        case METHODID_RESOURCEID_TO_DENOMS:
          serviceImpl.resourceidToDenoms((com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE_RECEIVER:
          serviceImpl.relayFeeReceiver((com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse>) responseObserver);
          break;
        case METHODID_RELAY_FEE:
          serviceImpl.relayFee((com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse>) responseObserver);
          break;
        case METHODID_BANNED_DENOM_LIST:
          serviceImpl.bannedDenomList((com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse>) responseObserver);
          break;
        case METHODID_GET_DEPOSIT_COUNT:
          serviceImpl.getDepositCount((com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest) request,
              (io.grpc.stub.StreamObserver<com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse>) responseObserver);
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
              com.stafihub.stafihub.bridge.QueryProto.QueryParamsRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getChaindIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryChaindIdsResponse>(
                service, METHODID_CHAIND_IDS)))
        .addMethod(
          getProposalDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryProposalDetailResponse>(
                service, METHODID_PROPOSAL_DETAIL)))
        .addMethod(
          getResourceidToDenomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryResourceidToDenomsResponse>(
                service, METHODID_RESOURCEID_TO_DENOMS)))
        .addMethod(
          getRelayFeeReceiverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeReceiverResponse>(
                service, METHODID_RELAY_FEE_RECEIVER)))
        .addMethod(
          getRelayFeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryRelayFeeResponse>(
                service, METHODID_RELAY_FEE)))
        .addMethod(
          getBannedDenomListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryBannedDenomListResponse>(
                service, METHODID_BANNED_DENOM_LIST)))
        .addMethod(
          getGetDepositCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountRequest,
              com.stafihub.stafihub.bridge.QueryProto.QueryGetDepositCountResponse>(
                service, METHODID_GET_DEPOSIT_COUNT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stafihub.stafihub.bridge.QueryProto.getDescriptor();
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
              .addMethod(getChaindIdsMethod())
              .addMethod(getProposalDetailMethod())
              .addMethod(getResourceidToDenomsMethod())
              .addMethod(getRelayFeeReceiverMethod())
              .addMethod(getRelayFeeMethod())
              .addMethod(getBannedDenomListMethod())
              .addMethod(getGetDepositCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
