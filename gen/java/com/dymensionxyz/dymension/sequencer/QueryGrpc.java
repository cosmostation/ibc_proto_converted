package com.dymensionxyz.dymension.sequencer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: dymension/sequencer/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "dymensionxyz.dymension.sequencer.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> getSequencerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sequencer",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> getSequencerMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> getSequencerMethod;
    if ((getSequencerMethod = QueryGrpc.getSequencerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSequencerMethod = QueryGrpc.getSequencerMethod) == null) {
          QueryGrpc.getSequencerMethod = getSequencerMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sequencer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Sequencer"))
              .build();
        }
      }
    }
    return getSequencerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> getSequencerAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SequencerAll",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> getSequencerAllMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> getSequencerAllMethod;
    if ((getSequencerAllMethod = QueryGrpc.getSequencerAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSequencerAllMethod = QueryGrpc.getSequencerAllMethod) == null) {
          QueryGrpc.getSequencerAllMethod = getSequencerAllMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SequencerAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SequencerAll"))
              .build();
        }
      }
    }
    return getSequencerAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> getSequencersByRollappMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SequencersByRollapp",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> getSequencersByRollappMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> getSequencersByRollappMethod;
    if ((getSequencersByRollappMethod = QueryGrpc.getSequencersByRollappMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSequencersByRollappMethod = QueryGrpc.getSequencersByRollappMethod) == null) {
          QueryGrpc.getSequencersByRollappMethod = getSequencersByRollappMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SequencersByRollapp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SequencersByRollapp"))
              .build();
        }
      }
    }
    return getSequencersByRollappMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> getSequencersByRollappAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SequencersByRollappAll",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> getSequencersByRollappAllMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> getSequencersByRollappAllMethod;
    if ((getSequencersByRollappAllMethod = QueryGrpc.getSequencersByRollappAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSequencersByRollappAllMethod = QueryGrpc.getSequencersByRollappAllMethod) == null) {
          QueryGrpc.getSequencersByRollappAllMethod = getSequencersByRollappAllMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SequencersByRollappAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SequencersByRollappAll"))
              .build();
        }
      }
    }
    return getSequencersByRollappAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> getSchedulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Scheduler",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> getSchedulerMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> getSchedulerMethod;
    if ((getSchedulerMethod = QueryGrpc.getSchedulerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchedulerMethod = QueryGrpc.getSchedulerMethod) == null) {
          QueryGrpc.getSchedulerMethod = getSchedulerMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Scheduler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Scheduler"))
              .build();
        }
      }
    }
    return getSchedulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> getSchedulerAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SchedulerAll",
      requestType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest.class,
      responseType = com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest,
      com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> getSchedulerAllMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> getSchedulerAllMethod;
    if ((getSchedulerAllMethod = QueryGrpc.getSchedulerAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchedulerAllMethod = QueryGrpc.getSchedulerAllMethod) == null) {
          QueryGrpc.getSchedulerAllMethod = getSchedulerAllMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest, com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SchedulerAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SchedulerAll"))
              .build();
        }
      }
    }
    return getSchedulerAllMethod;
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
    default void params(com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Sequencer by index.
     * </pre>
     */
    default void sequencer(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSequencerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Sequencer items.
     * </pre>
     */
    default void sequencerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSequencerAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a SequencersByRollapp by index.
     * </pre>
     */
    default void sequencersByRollapp(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSequencersByRollappMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SequencersByRollapp items.
     * </pre>
     */
    default void sequencersByRollappAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSequencersByRollappAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Scheduler by index.
     * </pre>
     */
    default void scheduler(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Scheduler items.
     * </pre>
     */
    default void schedulerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulerAllMethod(), responseObserver);
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
    public void params(com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Sequencer by index.
     * </pre>
     */
    public void sequencer(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSequencerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Sequencer items.
     * </pre>
     */
    public void sequencerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSequencerAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a SequencersByRollapp by index.
     * </pre>
     */
    public void sequencersByRollapp(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSequencersByRollappMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of SequencersByRollapp items.
     * </pre>
     */
    public void sequencersByRollappAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSequencersByRollappAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Scheduler by index.
     * </pre>
     */
    public void scheduler(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Scheduler items.
     * </pre>
     */
    public void schedulerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulerAllMethod(), getCallOptions()), request, responseObserver);
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
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse params(com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Sequencer by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse sequencer(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSequencerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Sequencer items.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse sequencerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSequencerAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a SequencersByRollapp by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse sequencersByRollapp(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSequencersByRollappMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of SequencersByRollapp items.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse sequencersByRollappAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSequencersByRollappAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Scheduler by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse scheduler(com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Scheduler items.
     * </pre>
     */
    public com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse schedulerAll(com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulerAllMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse> params(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Sequencer by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse> sequencer(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSequencerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Sequencer items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse> sequencerAll(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSequencerAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a SequencersByRollapp by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse> sequencersByRollapp(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSequencersByRollappMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of SequencersByRollapp items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse> sequencersByRollappAll(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSequencersByRollappAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Scheduler by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse> scheduler(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Scheduler items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse> schedulerAll(
        com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulerAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_SEQUENCER = 1;
  private static final int METHODID_SEQUENCER_ALL = 2;
  private static final int METHODID_SEQUENCERS_BY_ROLLAPP = 3;
  private static final int METHODID_SEQUENCERS_BY_ROLLAPP_ALL = 4;
  private static final int METHODID_SCHEDULER = 5;
  private static final int METHODID_SCHEDULER_ALL = 6;

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
          serviceImpl.params((com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_SEQUENCER:
          serviceImpl.sequencer((com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse>) responseObserver);
          break;
        case METHODID_SEQUENCER_ALL:
          serviceImpl.sequencerAll((com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse>) responseObserver);
          break;
        case METHODID_SEQUENCERS_BY_ROLLAPP:
          serviceImpl.sequencersByRollapp((com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse>) responseObserver);
          break;
        case METHODID_SEQUENCERS_BY_ROLLAPP_ALL:
          serviceImpl.sequencersByRollappAll((com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse>) responseObserver);
          break;
        case METHODID_SCHEDULER:
          serviceImpl.scheduler((com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse>) responseObserver);
          break;
        case METHODID_SCHEDULER_ALL:
          serviceImpl.schedulerAll((com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse>) responseObserver);
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
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getSequencerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencerResponse>(
                service, METHODID_SEQUENCER)))
        .addMethod(
          getSequencerAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencerResponse>(
                service, METHODID_SEQUENCER_ALL)))
        .addMethod(
          getSequencersByRollappMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSequencersByRollappResponse>(
                service, METHODID_SEQUENCERS_BY_ROLLAPP)))
        .addMethod(
          getSequencersByRollappAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSequencersByRollappResponse>(
                service, METHODID_SEQUENCERS_BY_ROLLAPP_ALL)))
        .addMethod(
          getSchedulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryGetSchedulerResponse>(
                service, METHODID_SCHEDULER)))
        .addMethod(
          getSchedulerAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerRequest,
              com.dymensionxyz.dymension.sequencer.QueryProto.QueryAllSchedulerResponse>(
                service, METHODID_SCHEDULER_ALL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dymensionxyz.dymension.sequencer.QueryProto.getDescriptor();
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
              .addMethod(getSequencerMethod())
              .addMethod(getSequencerAllMethod())
              .addMethod(getSequencersByRollappMethod())
              .addMethod(getSequencersByRollappAllMethod())
              .addMethod(getSchedulerMethod())
              .addMethod(getSchedulerAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
