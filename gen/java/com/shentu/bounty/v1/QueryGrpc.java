package com.shentu.bounty.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for bounty module
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: shentu/bounty/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "shentu.bounty.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramsRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> getProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Programs",
      requestType = com.shentu.bounty.v1.QueryProto.QueryProgramsRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryProgramsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramsRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> getProgramsMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramsRequest, com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> getProgramsMethod;
    if ((getProgramsMethod = QueryGrpc.getProgramsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProgramsMethod = QueryGrpc.getProgramsMethod) == null) {
          QueryGrpc.getProgramsMethod = getProgramsMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryProgramsRequest, com.shentu.bounty.v1.QueryProto.QueryProgramsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Programs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Programs"))
              .build();
        }
      }
    }
    return getProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramResponse> getProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Program",
      requestType = com.shentu.bounty.v1.QueryProto.QueryProgramRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryProgramResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramResponse> getProgramMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramRequest, com.shentu.bounty.v1.QueryProto.QueryProgramResponse> getProgramMethod;
    if ((getProgramMethod = QueryGrpc.getProgramMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProgramMethod = QueryGrpc.getProgramMethod) == null) {
          QueryGrpc.getProgramMethod = getProgramMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryProgramRequest, com.shentu.bounty.v1.QueryProto.QueryProgramResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Program"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Program"))
              .build();
        }
      }
    }
    return getProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingsRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> getFindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Findings",
      requestType = com.shentu.bounty.v1.QueryProto.QueryFindingsRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryFindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingsRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> getFindingsMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingsRequest, com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> getFindingsMethod;
    if ((getFindingsMethod = QueryGrpc.getFindingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFindingsMethod = QueryGrpc.getFindingsMethod) == null) {
          QueryGrpc.getFindingsMethod = getFindingsMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryFindingsRequest, com.shentu.bounty.v1.QueryProto.QueryFindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Findings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Findings"))
              .build();
        }
      }
    }
    return getFindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingResponse> getFindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Finding",
      requestType = com.shentu.bounty.v1.QueryProto.QueryFindingRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryFindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingResponse> getFindingMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingRequest, com.shentu.bounty.v1.QueryProto.QueryFindingResponse> getFindingMethod;
    if ((getFindingMethod = QueryGrpc.getFindingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFindingMethod = QueryGrpc.getFindingMethod) == null) {
          QueryGrpc.getFindingMethod = getFindingMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryFindingRequest, com.shentu.bounty.v1.QueryProto.QueryFindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Finding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Finding"))
              .build();
        }
      }
    }
    return getFindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> getFindingFingerprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindingFingerprint",
      requestType = com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest,
      com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> getFindingFingerprintMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest, com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> getFindingFingerprintMethod;
    if ((getFindingFingerprintMethod = QueryGrpc.getFindingFingerprintMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFindingFingerprintMethod = QueryGrpc.getFindingFingerprintMethod) == null) {
          QueryGrpc.getFindingFingerprintMethod = getFindingFingerprintMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest, com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindingFingerprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FindingFingerprint"))
              .build();
        }
      }
    }
    return getFindingFingerprintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> getProgramFingerprintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProgramFingerprint",
      requestType = com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest.class,
      responseType = com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest,
      com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> getProgramFingerprintMethod() {
    io.grpc.MethodDescriptor<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest, com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> getProgramFingerprintMethod;
    if ((getProgramFingerprintMethod = QueryGrpc.getProgramFingerprintMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProgramFingerprintMethod = QueryGrpc.getProgramFingerprintMethod) == null) {
          QueryGrpc.getProgramFingerprintMethod = getProgramFingerprintMethod =
              io.grpc.MethodDescriptor.<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest, com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProgramFingerprint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProgramFingerprint"))
              .build();
        }
      }
    }
    return getProgramFingerprintMethod;
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
   * Query defines the gRPC querier service for bounty module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Programs queries all programs based on given status.
     * </pre>
     */
    default void programs(com.shentu.bounty.v1.QueryProto.QueryProgramsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Program queries program details based on ProgramId.
     * </pre>
     */
    default void program(com.shentu.bounty.v1.QueryProto.QueryProgramRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Findings queries findings of a given program.
     * </pre>
     */
    default void findings(com.shentu.bounty.v1.QueryProto.QueryFindingsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finding queries Finding information based on programID, FindingId.
     * </pre>
     */
    default void finding(com.shentu.bounty.v1.QueryProto.QueryFindingRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * FindingFingerprint queries finding fingerprint based on findingId.
     * </pre>
     */
    default void findingFingerprint(com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindingFingerprintMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProgramFingerprint queries program fingerprint based on programId.
     * </pre>
     */
    default void programFingerprint(com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProgramFingerprintMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for bounty module
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
   * Query defines the gRPC querier service for bounty module
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
     * Programs queries all programs based on given status.
     * </pre>
     */
    public void programs(com.shentu.bounty.v1.QueryProto.QueryProgramsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Program queries program details based on ProgramId.
     * </pre>
     */
    public void program(com.shentu.bounty.v1.QueryProto.QueryProgramRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Findings queries findings of a given program.
     * </pre>
     */
    public void findings(com.shentu.bounty.v1.QueryProto.QueryFindingsRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finding queries Finding information based on programID, FindingId.
     * </pre>
     */
    public void finding(com.shentu.bounty.v1.QueryProto.QueryFindingRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FindingFingerprint queries finding fingerprint based on findingId.
     * </pre>
     */
    public void findingFingerprint(com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindingFingerprintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProgramFingerprint queries program fingerprint based on programId.
     * </pre>
     */
    public void programFingerprint(com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest request,
        io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProgramFingerprintMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for bounty module
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
     * Programs queries all programs based on given status.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryProgramsResponse programs(com.shentu.bounty.v1.QueryProto.QueryProgramsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Program queries program details based on ProgramId.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryProgramResponse program(com.shentu.bounty.v1.QueryProto.QueryProgramRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Findings queries findings of a given program.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryFindingsResponse findings(com.shentu.bounty.v1.QueryProto.QueryFindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finding queries Finding information based on programID, FindingId.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryFindingResponse finding(com.shentu.bounty.v1.QueryProto.QueryFindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FindingFingerprint queries finding fingerprint based on findingId.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse findingFingerprint(com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindingFingerprintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProgramFingerprint queries program fingerprint based on programId.
     * </pre>
     */
    public com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse programFingerprint(com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProgramFingerprintMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for bounty module
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
     * Programs queries all programs based on given status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryProgramsResponse> programs(
        com.shentu.bounty.v1.QueryProto.QueryProgramsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgramsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Program queries program details based on ProgramId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryProgramResponse> program(
        com.shentu.bounty.v1.QueryProto.QueryProgramRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Findings queries findings of a given program.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryFindingsResponse> findings(
        com.shentu.bounty.v1.QueryProto.QueryFindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finding queries Finding information based on programID, FindingId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryFindingResponse> finding(
        com.shentu.bounty.v1.QueryProto.QueryFindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FindingFingerprint queries finding fingerprint based on findingId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse> findingFingerprint(
        com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindingFingerprintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProgramFingerprint queries program fingerprint based on programId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse> programFingerprint(
        com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProgramFingerprintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROGRAMS = 0;
  private static final int METHODID_PROGRAM = 1;
  private static final int METHODID_FINDINGS = 2;
  private static final int METHODID_FINDING = 3;
  private static final int METHODID_FINDING_FINGERPRINT = 4;
  private static final int METHODID_PROGRAM_FINGERPRINT = 5;

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
        case METHODID_PROGRAMS:
          serviceImpl.programs((com.shentu.bounty.v1.QueryProto.QueryProgramsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramsResponse>) responseObserver);
          break;
        case METHODID_PROGRAM:
          serviceImpl.program((com.shentu.bounty.v1.QueryProto.QueryProgramRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramResponse>) responseObserver);
          break;
        case METHODID_FINDINGS:
          serviceImpl.findings((com.shentu.bounty.v1.QueryProto.QueryFindingsRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingsResponse>) responseObserver);
          break;
        case METHODID_FINDING:
          serviceImpl.finding((com.shentu.bounty.v1.QueryProto.QueryFindingRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingResponse>) responseObserver);
          break;
        case METHODID_FINDING_FINGERPRINT:
          serviceImpl.findingFingerprint((com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse>) responseObserver);
          break;
        case METHODID_PROGRAM_FINGERPRINT:
          serviceImpl.programFingerprint((com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest) request,
              (io.grpc.stub.StreamObserver<com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse>) responseObserver);
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
          getProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryProgramsRequest,
              com.shentu.bounty.v1.QueryProto.QueryProgramsResponse>(
                service, METHODID_PROGRAMS)))
        .addMethod(
          getProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryProgramRequest,
              com.shentu.bounty.v1.QueryProto.QueryProgramResponse>(
                service, METHODID_PROGRAM)))
        .addMethod(
          getFindingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryFindingsRequest,
              com.shentu.bounty.v1.QueryProto.QueryFindingsResponse>(
                service, METHODID_FINDINGS)))
        .addMethod(
          getFindingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryFindingRequest,
              com.shentu.bounty.v1.QueryProto.QueryFindingResponse>(
                service, METHODID_FINDING)))
        .addMethod(
          getFindingFingerprintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintRequest,
              com.shentu.bounty.v1.QueryProto.QueryFindingFingerprintResponse>(
                service, METHODID_FINDING_FINGERPRINT)))
        .addMethod(
          getProgramFingerprintMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintRequest,
              com.shentu.bounty.v1.QueryProto.QueryProgramFingerprintResponse>(
                service, METHODID_PROGRAM_FINGERPRINT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.shentu.bounty.v1.QueryProto.getDescriptor();
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
              .addMethod(getProgramsMethod())
              .addMethod(getProgramMethod())
              .addMethod(getFindingsMethod())
              .addMethod(getFindingMethod())
              .addMethod(getFindingFingerprintMethod())
              .addMethod(getProgramFingerprintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
