package com.kava.committee.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for committee module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: kava/committee/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "kava.committee.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteesRequest,
      com.kava.committee.v1beta1.QueryCommitteesResponse> getCommitteesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Committees",
      requestType = com.kava.committee.v1beta1.QueryCommitteesRequest.class,
      responseType = com.kava.committee.v1beta1.QueryCommitteesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteesRequest,
      com.kava.committee.v1beta1.QueryCommitteesResponse> getCommitteesMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteesRequest, com.kava.committee.v1beta1.QueryCommitteesResponse> getCommitteesMethod;
    if ((getCommitteesMethod = QueryGrpc.getCommitteesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCommitteesMethod = QueryGrpc.getCommitteesMethod) == null) {
          QueryGrpc.getCommitteesMethod = getCommitteesMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryCommitteesRequest, com.kava.committee.v1beta1.QueryCommitteesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Committees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryCommitteesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryCommitteesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Committees"))
              .build();
        }
      }
    }
    return getCommitteesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteeRequest,
      com.kava.committee.v1beta1.QueryCommitteeResponse> getCommitteeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Committee",
      requestType = com.kava.committee.v1beta1.QueryCommitteeRequest.class,
      responseType = com.kava.committee.v1beta1.QueryCommitteeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteeRequest,
      com.kava.committee.v1beta1.QueryCommitteeResponse> getCommitteeMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryCommitteeRequest, com.kava.committee.v1beta1.QueryCommitteeResponse> getCommitteeMethod;
    if ((getCommitteeMethod = QueryGrpc.getCommitteeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCommitteeMethod = QueryGrpc.getCommitteeMethod) == null) {
          QueryGrpc.getCommitteeMethod = getCommitteeMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryCommitteeRequest, com.kava.committee.v1beta1.QueryCommitteeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Committee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryCommitteeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryCommitteeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Committee"))
              .build();
        }
      }
    }
    return getCommitteeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalsRequest,
      com.kava.committee.v1beta1.QueryProposalsResponse> getProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposals",
      requestType = com.kava.committee.v1beta1.QueryProposalsRequest.class,
      responseType = com.kava.committee.v1beta1.QueryProposalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalsRequest,
      com.kava.committee.v1beta1.QueryProposalsResponse> getProposalsMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalsRequest, com.kava.committee.v1beta1.QueryProposalsResponse> getProposalsMethod;
    if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
          QueryGrpc.getProposalsMethod = getProposalsMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryProposalsRequest, com.kava.committee.v1beta1.QueryProposalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryProposalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryProposalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposals"))
              .build();
        }
      }
    }
    return getProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalRequest,
      com.kava.committee.v1beta1.QueryProposalResponse> getProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposal",
      requestType = com.kava.committee.v1beta1.QueryProposalRequest.class,
      responseType = com.kava.committee.v1beta1.QueryProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalRequest,
      com.kava.committee.v1beta1.QueryProposalResponse> getProposalMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryProposalRequest, com.kava.committee.v1beta1.QueryProposalResponse> getProposalMethod;
    if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
          QueryGrpc.getProposalMethod = getProposalMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryProposalRequest, com.kava.committee.v1beta1.QueryProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposal"))
              .build();
        }
      }
    }
    return getProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryNextProposalIDRequest,
      com.kava.committee.v1beta1.QueryNextProposalIDResponse> getNextProposalIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextProposalID",
      requestType = com.kava.committee.v1beta1.QueryNextProposalIDRequest.class,
      responseType = com.kava.committee.v1beta1.QueryNextProposalIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryNextProposalIDRequest,
      com.kava.committee.v1beta1.QueryNextProposalIDResponse> getNextProposalIDMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryNextProposalIDRequest, com.kava.committee.v1beta1.QueryNextProposalIDResponse> getNextProposalIDMethod;
    if ((getNextProposalIDMethod = QueryGrpc.getNextProposalIDMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNextProposalIDMethod = QueryGrpc.getNextProposalIDMethod) == null) {
          QueryGrpc.getNextProposalIDMethod = getNextProposalIDMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryNextProposalIDRequest, com.kava.committee.v1beta1.QueryNextProposalIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextProposalID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryNextProposalIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryNextProposalIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NextProposalID"))
              .build();
        }
      }
    }
    return getNextProposalIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVotesRequest,
      com.kava.committee.v1beta1.QueryVotesResponse> getVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Votes",
      requestType = com.kava.committee.v1beta1.QueryVotesRequest.class,
      responseType = com.kava.committee.v1beta1.QueryVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVotesRequest,
      com.kava.committee.v1beta1.QueryVotesResponse> getVotesMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVotesRequest, com.kava.committee.v1beta1.QueryVotesResponse> getVotesMethod;
    if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
          QueryGrpc.getVotesMethod = getVotesMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryVotesRequest, com.kava.committee.v1beta1.QueryVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Votes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Votes"))
              .build();
        }
      }
    }
    return getVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVoteRequest,
      com.kava.committee.v1beta1.QueryVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = com.kava.committee.v1beta1.QueryVoteRequest.class,
      responseType = com.kava.committee.v1beta1.QueryVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVoteRequest,
      com.kava.committee.v1beta1.QueryVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryVoteRequest, com.kava.committee.v1beta1.QueryVoteResponse> getVoteMethod;
    if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
          QueryGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryVoteRequest, com.kava.committee.v1beta1.QueryVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryTallyRequest,
      com.kava.committee.v1beta1.QueryTallyResponse> getTallyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Tally",
      requestType = com.kava.committee.v1beta1.QueryTallyRequest.class,
      responseType = com.kava.committee.v1beta1.QueryTallyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryTallyRequest,
      com.kava.committee.v1beta1.QueryTallyResponse> getTallyMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryTallyRequest, com.kava.committee.v1beta1.QueryTallyResponse> getTallyMethod;
    if ((getTallyMethod = QueryGrpc.getTallyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTallyMethod = QueryGrpc.getTallyMethod) == null) {
          QueryGrpc.getTallyMethod = getTallyMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryTallyRequest, com.kava.committee.v1beta1.QueryTallyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Tally"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryTallyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryTallyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Tally"))
              .build();
        }
      }
    }
    return getTallyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryRawParamsRequest,
      com.kava.committee.v1beta1.QueryRawParamsResponse> getRawParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawParams",
      requestType = com.kava.committee.v1beta1.QueryRawParamsRequest.class,
      responseType = com.kava.committee.v1beta1.QueryRawParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryRawParamsRequest,
      com.kava.committee.v1beta1.QueryRawParamsResponse> getRawParamsMethod() {
    io.grpc.MethodDescriptor<com.kava.committee.v1beta1.QueryRawParamsRequest, com.kava.committee.v1beta1.QueryRawParamsResponse> getRawParamsMethod;
    if ((getRawParamsMethod = QueryGrpc.getRawParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRawParamsMethod = QueryGrpc.getRawParamsMethod) == null) {
          QueryGrpc.getRawParamsMethod = getRawParamsMethod =
              io.grpc.MethodDescriptor.<com.kava.committee.v1beta1.QueryRawParamsRequest, com.kava.committee.v1beta1.QueryRawParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryRawParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kava.committee.v1beta1.QueryRawParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RawParams"))
              .build();
        }
      }
    }
    return getRawParamsMethod;
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
   * Query defines the gRPC querier service for committee module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Committees queries all committess of the committee module.
     * </pre>
     */
    default void committees(com.kava.committee.v1beta1.QueryCommitteesRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitteesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Committee queries a committee based on committee ID.
     * </pre>
     */
    default void committee(com.kava.committee.v1beta1.QueryCommitteeRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitteeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposals queries proposals based on committee ID.
     * </pre>
     */
    default void proposals(com.kava.committee.v1beta1.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposits queries a proposal based on proposal ID.
     * </pre>
     */
    default void proposal(com.kava.committee.v1beta1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextProposalID queries the next proposal ID of the committee module.
     * </pre>
     */
    default void nextProposalID(com.kava.committee.v1beta1.QueryNextProposalIDRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryNextProposalIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextProposalIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Votes queries all votes for a single proposal ID.
     * </pre>
     */
    default void votes(com.kava.committee.v1beta1.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote queries the vote of a single voter for a single proposal ID.
     * </pre>
     */
    default void vote(com.kava.committee.v1beta1.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tally queries the tally of a single proposal ID.
     * </pre>
     */
    default void tally(com.kava.committee.v1beta1.QueryTallyRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryTallyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTallyMethod(), responseObserver);
    }

    /**
     * <pre>
     * RawParams queries the raw params data of any subspace and key.
     * </pre>
     */
    default void rawParams(com.kava.committee.v1beta1.QueryRawParamsRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryRawParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for committee module
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
   * Query defines the gRPC querier service for committee module
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
     * Committees queries all committess of the committee module.
     * </pre>
     */
    public void committees(com.kava.committee.v1beta1.QueryCommitteesRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitteesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Committee queries a committee based on committee ID.
     * </pre>
     */
    public void committee(com.kava.committee.v1beta1.QueryCommitteeRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitteeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposals queries proposals based on committee ID.
     * </pre>
     */
    public void proposals(com.kava.committee.v1beta1.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposits queries a proposal based on proposal ID.
     * </pre>
     */
    public void proposal(com.kava.committee.v1beta1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextProposalID queries the next proposal ID of the committee module.
     * </pre>
     */
    public void nextProposalID(com.kava.committee.v1beta1.QueryNextProposalIDRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryNextProposalIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextProposalIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Votes queries all votes for a single proposal ID.
     * </pre>
     */
    public void votes(com.kava.committee.v1beta1.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote queries the vote of a single voter for a single proposal ID.
     * </pre>
     */
    public void vote(com.kava.committee.v1beta1.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tally queries the tally of a single proposal ID.
     * </pre>
     */
    public void tally(com.kava.committee.v1beta1.QueryTallyRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryTallyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTallyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RawParams queries the raw params data of any subspace and key.
     * </pre>
     */
    public void rawParams(com.kava.committee.v1beta1.QueryRawParamsRequest request,
        io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryRawParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for committee module
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
     * Committees queries all committess of the committee module.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryCommitteesResponse committees(com.kava.committee.v1beta1.QueryCommitteesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitteesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Committee queries a committee based on committee ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryCommitteeResponse committee(com.kava.committee.v1beta1.QueryCommitteeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitteeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposals queries proposals based on committee ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryProposalsResponse proposals(com.kava.committee.v1beta1.QueryProposalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposits queries a proposal based on proposal ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryProposalResponse proposal(com.kava.committee.v1beta1.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextProposalID queries the next proposal ID of the committee module.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryNextProposalIDResponse nextProposalID(com.kava.committee.v1beta1.QueryNextProposalIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextProposalIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Votes queries all votes for a single proposal ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryVotesResponse votes(com.kava.committee.v1beta1.QueryVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote queries the vote of a single voter for a single proposal ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryVoteResponse vote(com.kava.committee.v1beta1.QueryVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tally queries the tally of a single proposal ID.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryTallyResponse tally(com.kava.committee.v1beta1.QueryTallyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTallyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RawParams queries the raw params data of any subspace and key.
     * </pre>
     */
    public com.kava.committee.v1beta1.QueryRawParamsResponse rawParams(com.kava.committee.v1beta1.QueryRawParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for committee module
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
     * Committees queries all committess of the committee module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryCommitteesResponse> committees(
        com.kava.committee.v1beta1.QueryCommitteesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitteesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Committee queries a committee based on committee ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryCommitteeResponse> committee(
        com.kava.committee.v1beta1.QueryCommitteeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitteeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposals queries proposals based on committee ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryProposalsResponse> proposals(
        com.kava.committee.v1beta1.QueryProposalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposits queries a proposal based on proposal ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryProposalResponse> proposal(
        com.kava.committee.v1beta1.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextProposalID queries the next proposal ID of the committee module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryNextProposalIDResponse> nextProposalID(
        com.kava.committee.v1beta1.QueryNextProposalIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextProposalIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Votes queries all votes for a single proposal ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryVotesResponse> votes(
        com.kava.committee.v1beta1.QueryVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote queries the vote of a single voter for a single proposal ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryVoteResponse> vote(
        com.kava.committee.v1beta1.QueryVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tally queries the tally of a single proposal ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryTallyResponse> tally(
        com.kava.committee.v1beta1.QueryTallyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTallyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RawParams queries the raw params data of any subspace and key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kava.committee.v1beta1.QueryRawParamsResponse> rawParams(
        com.kava.committee.v1beta1.QueryRawParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMITTEES = 0;
  private static final int METHODID_COMMITTEE = 1;
  private static final int METHODID_PROPOSALS = 2;
  private static final int METHODID_PROPOSAL = 3;
  private static final int METHODID_NEXT_PROPOSAL_ID = 4;
  private static final int METHODID_VOTES = 5;
  private static final int METHODID_VOTE = 6;
  private static final int METHODID_TALLY = 7;
  private static final int METHODID_RAW_PARAMS = 8;

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
        case METHODID_COMMITTEES:
          serviceImpl.committees((com.kava.committee.v1beta1.QueryCommitteesRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteesResponse>) responseObserver);
          break;
        case METHODID_COMMITTEE:
          serviceImpl.committee((com.kava.committee.v1beta1.QueryCommitteeRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryCommitteeResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS:
          serviceImpl.proposals((com.kava.committee.v1beta1.QueryProposalsRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalsResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL:
          serviceImpl.proposal((com.kava.committee.v1beta1.QueryProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryProposalResponse>) responseObserver);
          break;
        case METHODID_NEXT_PROPOSAL_ID:
          serviceImpl.nextProposalID((com.kava.committee.v1beta1.QueryNextProposalIDRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryNextProposalIDResponse>) responseObserver);
          break;
        case METHODID_VOTES:
          serviceImpl.votes((com.kava.committee.v1beta1.QueryVotesRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVotesResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((com.kava.committee.v1beta1.QueryVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryVoteResponse>) responseObserver);
          break;
        case METHODID_TALLY:
          serviceImpl.tally((com.kava.committee.v1beta1.QueryTallyRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryTallyResponse>) responseObserver);
          break;
        case METHODID_RAW_PARAMS:
          serviceImpl.rawParams((com.kava.committee.v1beta1.QueryRawParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.kava.committee.v1beta1.QueryRawParamsResponse>) responseObserver);
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
          getCommitteesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryCommitteesRequest,
              com.kava.committee.v1beta1.QueryCommitteesResponse>(
                service, METHODID_COMMITTEES)))
        .addMethod(
          getCommitteeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryCommitteeRequest,
              com.kava.committee.v1beta1.QueryCommitteeResponse>(
                service, METHODID_COMMITTEE)))
        .addMethod(
          getProposalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryProposalsRequest,
              com.kava.committee.v1beta1.QueryProposalsResponse>(
                service, METHODID_PROPOSALS)))
        .addMethod(
          getProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryProposalRequest,
              com.kava.committee.v1beta1.QueryProposalResponse>(
                service, METHODID_PROPOSAL)))
        .addMethod(
          getNextProposalIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryNextProposalIDRequest,
              com.kava.committee.v1beta1.QueryNextProposalIDResponse>(
                service, METHODID_NEXT_PROPOSAL_ID)))
        .addMethod(
          getVotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryVotesRequest,
              com.kava.committee.v1beta1.QueryVotesResponse>(
                service, METHODID_VOTES)))
        .addMethod(
          getVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryVoteRequest,
              com.kava.committee.v1beta1.QueryVoteResponse>(
                service, METHODID_VOTE)))
        .addMethod(
          getTallyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryTallyRequest,
              com.kava.committee.v1beta1.QueryTallyResponse>(
                service, METHODID_TALLY)))
        .addMethod(
          getRawParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.kava.committee.v1beta1.QueryRawParamsRequest,
              com.kava.committee.v1beta1.QueryRawParamsResponse>(
                service, METHODID_RAW_PARAMS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kava.committee.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getCommitteesMethod())
              .addMethod(getCommitteeMethod())
              .addMethod(getProposalsMethod())
              .addMethod(getProposalMethod())
              .addMethod(getNextProposalIDMethod())
              .addMethod(getVotesMethod())
              .addMethod(getVoteMethod())
              .addMethod(getTallyMethod())
              .addMethod(getRawParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
