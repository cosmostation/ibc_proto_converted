package com.atomone.gov.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for gov module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: atomone/gov/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "atomone.gov.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryConstitutionRequest,
      com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> getConstitutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Constitution",
      requestType = com.atomone.gov.v1.QueryProto.QueryConstitutionRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryConstitutionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryConstitutionRequest,
      com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> getConstitutionMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryConstitutionRequest, com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> getConstitutionMethod;
    if ((getConstitutionMethod = QueryGrpc.getConstitutionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConstitutionMethod = QueryGrpc.getConstitutionMethod) == null) {
          QueryGrpc.getConstitutionMethod = getConstitutionMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryConstitutionRequest, com.atomone.gov.v1.QueryProto.QueryConstitutionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Constitution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryConstitutionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryConstitutionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Constitution"))
              .build();
        }
      }
    }
    return getConstitutionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalRequest,
      com.atomone.gov.v1.QueryProto.QueryProposalResponse> getProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposal",
      requestType = com.atomone.gov.v1.QueryProto.QueryProposalRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalRequest,
      com.atomone.gov.v1.QueryProto.QueryProposalResponse> getProposalMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalRequest, com.atomone.gov.v1.QueryProto.QueryProposalResponse> getProposalMethod;
    if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
          QueryGrpc.getProposalMethod = getProposalMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryProposalRequest, com.atomone.gov.v1.QueryProto.QueryProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposal"))
              .build();
        }
      }
    }
    return getProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalsRequest,
      com.atomone.gov.v1.QueryProto.QueryProposalsResponse> getProposalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposals",
      requestType = com.atomone.gov.v1.QueryProto.QueryProposalsRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryProposalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalsRequest,
      com.atomone.gov.v1.QueryProto.QueryProposalsResponse> getProposalsMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryProposalsRequest, com.atomone.gov.v1.QueryProto.QueryProposalsResponse> getProposalsMethod;
    if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalsMethod = QueryGrpc.getProposalsMethod) == null) {
          QueryGrpc.getProposalsMethod = getProposalsMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryProposalsRequest, com.atomone.gov.v1.QueryProto.QueryProposalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryProposalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryProposalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposals"))
              .build();
        }
      }
    }
    return getProposalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVoteRequest,
      com.atomone.gov.v1.QueryProto.QueryVoteResponse> getVoteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Vote",
      requestType = com.atomone.gov.v1.QueryProto.QueryVoteRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryVoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVoteRequest,
      com.atomone.gov.v1.QueryProto.QueryVoteResponse> getVoteMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVoteRequest, com.atomone.gov.v1.QueryProto.QueryVoteResponse> getVoteMethod;
    if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteMethod = QueryGrpc.getVoteMethod) == null) {
          QueryGrpc.getVoteMethod = getVoteMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryVoteRequest, com.atomone.gov.v1.QueryProto.QueryVoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Vote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryVoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryVoteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Vote"))
              .build();
        }
      }
    }
    return getVoteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVotesRequest,
      com.atomone.gov.v1.QueryProto.QueryVotesResponse> getVotesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Votes",
      requestType = com.atomone.gov.v1.QueryProto.QueryVotesRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryVotesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVotesRequest,
      com.atomone.gov.v1.QueryProto.QueryVotesResponse> getVotesMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryVotesRequest, com.atomone.gov.v1.QueryProto.QueryVotesResponse> getVotesMethod;
    if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesMethod = QueryGrpc.getVotesMethod) == null) {
          QueryGrpc.getVotesMethod = getVotesMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryVotesRequest, com.atomone.gov.v1.QueryProto.QueryVotesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Votes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryVotesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryVotesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Votes"))
              .build();
        }
      }
    }
    return getVotesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryParamsRequest,
      com.atomone.gov.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.atomone.gov.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryParamsRequest,
      com.atomone.gov.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryParamsRequest, com.atomone.gov.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryParamsRequest, com.atomone.gov.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryDepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = com.atomone.gov.v1.QueryProto.QueryDepositRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryDepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositRequest, com.atomone.gov.v1.QueryProto.QueryDepositResponse> getDepositMethod;
    if ((getDepositMethod = QueryGrpc.getDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositMethod = QueryGrpc.getDepositMethod) == null) {
          QueryGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryDepositRequest, com.atomone.gov.v1.QueryProto.QueryDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositsRequest,
      com.atomone.gov.v1.QueryProto.QueryDepositsResponse> getDepositsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposits",
      requestType = com.atomone.gov.v1.QueryProto.QueryDepositsRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryDepositsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositsRequest,
      com.atomone.gov.v1.QueryProto.QueryDepositsResponse> getDepositsMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryDepositsRequest, com.atomone.gov.v1.QueryProto.QueryDepositsResponse> getDepositsMethod;
    if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositsMethod = QueryGrpc.getDepositsMethod) == null) {
          QueryGrpc.getDepositsMethod = getDepositsMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryDepositsRequest, com.atomone.gov.v1.QueryProto.QueryDepositsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryDepositsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryDepositsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Deposits"))
              .build();
        }
      }
    }
    return getDepositsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryTallyResultRequest,
      com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> getTallyResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TallyResult",
      requestType = com.atomone.gov.v1.QueryProto.QueryTallyResultRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryTallyResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryTallyResultRequest,
      com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> getTallyResultMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryTallyResultRequest, com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> getTallyResultMethod;
    if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
          QueryGrpc.getTallyResultMethod = getTallyResultMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryTallyResultRequest, com.atomone.gov.v1.QueryProto.QueryTallyResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TallyResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryTallyResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryTallyResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TallyResult"))
              .build();
        }
      }
    }
    return getTallyResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> getMinDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinDeposit",
      requestType = com.atomone.gov.v1.QueryProto.QueryMinDepositRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryMinDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> getMinDepositMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinDepositRequest, com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> getMinDepositMethod;
    if ((getMinDepositMethod = QueryGrpc.getMinDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinDepositMethod = QueryGrpc.getMinDepositMethod) == null) {
          QueryGrpc.getMinDepositMethod = getMinDepositMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryMinDepositRequest, com.atomone.gov.v1.QueryProto.QueryMinDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryMinDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryMinDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinDeposit"))
              .build();
        }
      }
    }
    return getMinDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> getMinInitialDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MinInitialDeposit",
      requestType = com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest.class,
      responseType = com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest,
      com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> getMinInitialDepositMethod() {
    io.grpc.MethodDescriptor<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest, com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> getMinInitialDepositMethod;
    if ((getMinInitialDepositMethod = QueryGrpc.getMinInitialDepositMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMinInitialDepositMethod = QueryGrpc.getMinInitialDepositMethod) == null) {
          QueryGrpc.getMinInitialDepositMethod = getMinInitialDepositMethod =
              io.grpc.MethodDescriptor.<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest, com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MinInitialDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MinInitialDeposit"))
              .build();
        }
      }
    }
    return getMinInitialDepositMethod;
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
   * Query defines the gRPC querier service for gov module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Constitution queries the chain's constitution.
     * </pre>
     */
    default void constitution(com.atomone.gov.v1.QueryProto.QueryConstitutionRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConstitutionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    default void proposal(com.atomone.gov.v1.QueryProto.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    default void proposals(com.atomone.gov.v1.QueryProto.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    default void vote(com.atomone.gov.v1.QueryProto.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVoteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    default void votes(com.atomone.gov.v1.QueryProto.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVotesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    default void params(com.atomone.gov.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    default void deposit(com.atomone.gov.v1.QueryProto.QueryDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    default void deposits(com.atomone.gov.v1.QueryProto.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    default void tallyResult(com.atomone.gov.v1.QueryProto.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTallyResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * MinDeposit queries the minimum deposit currently
     * required for a proposal to enter voting period.
     * </pre>
     */
    default void minDeposit(com.atomone.gov.v1.QueryProto.QueryMinDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * MinInitialDeposit queries the minimum initial deposit
     * currently required for a proposal to be submitted.
     * </pre>
     */
    default void minInitialDeposit(com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMinInitialDepositMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for gov module
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
   * Query defines the gRPC querier service for gov module
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
     * Constitution queries the chain's constitution.
     * </pre>
     */
    public void constitution(com.atomone.gov.v1.QueryProto.QueryConstitutionRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConstitutionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public void proposal(com.atomone.gov.v1.QueryProto.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public void proposals(com.atomone.gov.v1.QueryProto.QueryProposalsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public void vote(com.atomone.gov.v1.QueryProto.QueryVoteRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVoteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public void votes(com.atomone.gov.v1.QueryProto.QueryVotesRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVotesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public void params(com.atomone.gov.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public void deposit(com.atomone.gov.v1.QueryProto.QueryDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public void deposits(com.atomone.gov.v1.QueryProto.QueryDepositsRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public void tallyResult(com.atomone.gov.v1.QueryProto.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MinDeposit queries the minimum deposit currently
     * required for a proposal to enter voting period.
     * </pre>
     */
    public void minDeposit(com.atomone.gov.v1.QueryProto.QueryMinDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MinInitialDeposit queries the minimum initial deposit
     * currently required for a proposal to be submitted.
     * </pre>
     */
    public void minInitialDeposit(com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest request,
        io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMinInitialDepositMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for gov module
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
     * Constitution queries the chain's constitution.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryConstitutionResponse constitution(com.atomone.gov.v1.QueryProto.QueryConstitutionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConstitutionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryProposalResponse proposal(com.atomone.gov.v1.QueryProto.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryProposalsResponse proposals(com.atomone.gov.v1.QueryProto.QueryProposalsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryVoteResponse vote(com.atomone.gov.v1.QueryProto.QueryVoteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryVotesResponse votes(com.atomone.gov.v1.QueryProto.QueryVotesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryParamsResponse params(com.atomone.gov.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryDepositResponse deposit(com.atomone.gov.v1.QueryProto.QueryDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryDepositsResponse deposits(com.atomone.gov.v1.QueryProto.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryTallyResultResponse tallyResult(com.atomone.gov.v1.QueryProto.QueryTallyResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTallyResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MinDeposit queries the minimum deposit currently
     * required for a proposal to enter voting period.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryMinDepositResponse minDeposit(com.atomone.gov.v1.QueryProto.QueryMinDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MinInitialDeposit queries the minimum initial deposit
     * currently required for a proposal to be submitted.
     * </pre>
     */
    public com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse minInitialDeposit(com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMinInitialDepositMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for gov module
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
     * Constitution queries the chain's constitution.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryConstitutionResponse> constitution(
        com.atomone.gov.v1.QueryProto.QueryConstitutionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConstitutionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposal queries proposal details based on ProposalID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryProposalResponse> proposal(
        com.atomone.gov.v1.QueryProto.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposals queries all proposals based on given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryProposalsResponse> proposals(
        com.atomone.gov.v1.QueryProto.QueryProposalsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Vote queries voted information based on proposalID, voterAddr.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryVoteResponse> vote(
        com.atomone.gov.v1.QueryProto.QueryVoteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Votes queries votes of a given proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryVotesResponse> votes(
        com.atomone.gov.v1.QueryProto.QueryVotesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries all parameters of the gov module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryParamsResponse> params(
        com.atomone.gov.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposit queries single deposit information based proposalID, depositAddr.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryDepositResponse> deposit(
        com.atomone.gov.v1.QueryProto.QueryDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deposits queries all deposits of a single proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryDepositsResponse> deposits(
        com.atomone.gov.v1.QueryProto.QueryDepositsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TallyResult queries the tally of a proposal vote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryTallyResultResponse> tallyResult(
        com.atomone.gov.v1.QueryProto.QueryTallyResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MinDeposit queries the minimum deposit currently
     * required for a proposal to enter voting period.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryMinDepositResponse> minDeposit(
        com.atomone.gov.v1.QueryProto.QueryMinDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MinInitialDeposit queries the minimum initial deposit
     * currently required for a proposal to be submitted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse> minInitialDeposit(
        com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMinInitialDepositMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSTITUTION = 0;
  private static final int METHODID_PROPOSAL = 1;
  private static final int METHODID_PROPOSALS = 2;
  private static final int METHODID_VOTE = 3;
  private static final int METHODID_VOTES = 4;
  private static final int METHODID_PARAMS = 5;
  private static final int METHODID_DEPOSIT = 6;
  private static final int METHODID_DEPOSITS = 7;
  private static final int METHODID_TALLY_RESULT = 8;
  private static final int METHODID_MIN_DEPOSIT = 9;
  private static final int METHODID_MIN_INITIAL_DEPOSIT = 10;

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
        case METHODID_CONSTITUTION:
          serviceImpl.constitution((com.atomone.gov.v1.QueryProto.QueryConstitutionRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryConstitutionResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL:
          serviceImpl.proposal((com.atomone.gov.v1.QueryProto.QueryProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS:
          serviceImpl.proposals((com.atomone.gov.v1.QueryProto.QueryProposalsRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryProposalsResponse>) responseObserver);
          break;
        case METHODID_VOTE:
          serviceImpl.vote((com.atomone.gov.v1.QueryProto.QueryVoteRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVoteResponse>) responseObserver);
          break;
        case METHODID_VOTES:
          serviceImpl.votes((com.atomone.gov.v1.QueryProto.QueryVotesRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryVotesResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.atomone.gov.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT:
          serviceImpl.deposit((com.atomone.gov.v1.QueryProto.QueryDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositResponse>) responseObserver);
          break;
        case METHODID_DEPOSITS:
          serviceImpl.deposits((com.atomone.gov.v1.QueryProto.QueryDepositsRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryDepositsResponse>) responseObserver);
          break;
        case METHODID_TALLY_RESULT:
          serviceImpl.tallyResult((com.atomone.gov.v1.QueryProto.QueryTallyResultRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryTallyResultResponse>) responseObserver);
          break;
        case METHODID_MIN_DEPOSIT:
          serviceImpl.minDeposit((com.atomone.gov.v1.QueryProto.QueryMinDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinDepositResponse>) responseObserver);
          break;
        case METHODID_MIN_INITIAL_DEPOSIT:
          serviceImpl.minInitialDeposit((com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest) request,
              (io.grpc.stub.StreamObserver<com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse>) responseObserver);
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
          getConstitutionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryConstitutionRequest,
              com.atomone.gov.v1.QueryProto.QueryConstitutionResponse>(
                service, METHODID_CONSTITUTION)))
        .addMethod(
          getProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryProposalRequest,
              com.atomone.gov.v1.QueryProto.QueryProposalResponse>(
                service, METHODID_PROPOSAL)))
        .addMethod(
          getProposalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryProposalsRequest,
              com.atomone.gov.v1.QueryProto.QueryProposalsResponse>(
                service, METHODID_PROPOSALS)))
        .addMethod(
          getVoteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryVoteRequest,
              com.atomone.gov.v1.QueryProto.QueryVoteResponse>(
                service, METHODID_VOTE)))
        .addMethod(
          getVotesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryVotesRequest,
              com.atomone.gov.v1.QueryProto.QueryVotesResponse>(
                service, METHODID_VOTES)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryParamsRequest,
              com.atomone.gov.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryDepositRequest,
              com.atomone.gov.v1.QueryProto.QueryDepositResponse>(
                service, METHODID_DEPOSIT)))
        .addMethod(
          getDepositsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryDepositsRequest,
              com.atomone.gov.v1.QueryProto.QueryDepositsResponse>(
                service, METHODID_DEPOSITS)))
        .addMethod(
          getTallyResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryTallyResultRequest,
              com.atomone.gov.v1.QueryProto.QueryTallyResultResponse>(
                service, METHODID_TALLY_RESULT)))
        .addMethod(
          getMinDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryMinDepositRequest,
              com.atomone.gov.v1.QueryProto.QueryMinDepositResponse>(
                service, METHODID_MIN_DEPOSIT)))
        .addMethod(
          getMinInitialDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.atomone.gov.v1.QueryProto.QueryMinInitialDepositRequest,
              com.atomone.gov.v1.QueryProto.QueryMinInitialDepositResponse>(
                service, METHODID_MIN_INITIAL_DEPOSIT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.atomone.gov.v1.QueryProto.getDescriptor();
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
              .addMethod(getConstitutionMethod())
              .addMethod(getProposalMethod())
              .addMethod(getProposalsMethod())
              .addMethod(getVoteMethod())
              .addMethod(getVotesMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDepositMethod())
              .addMethod(getDepositsMethod())
              .addMethod(getTallyResultMethod())
              .addMethod(getMinDepositMethod())
              .addMethod(getMinInitialDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}
