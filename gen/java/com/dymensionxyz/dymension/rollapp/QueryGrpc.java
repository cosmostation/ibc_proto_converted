package com.dymensionxyz.dymension.rollapp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: dymension/rollapp/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "dymensionxyz.dymension.rollapp.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rollapp",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappMethod;
    if ((getRollappMethod = QueryGrpc.getRollappMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRollappMethod = QueryGrpc.getRollappMethod) == null) {
          QueryGrpc.getRollappMethod = getRollappMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rollapp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Rollapp"))
              .build();
        }
      }
    }
    return getRollappMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappByEIP155Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RollappByEIP155",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappByEIP155Method() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> getRollappByEIP155Method;
    if ((getRollappByEIP155Method = QueryGrpc.getRollappByEIP155Method) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRollappByEIP155Method = QueryGrpc.getRollappByEIP155Method) == null) {
          QueryGrpc.getRollappByEIP155Method = getRollappByEIP155Method =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RollappByEIP155"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RollappByEIP155"))
              .build();
        }
      }
    }
    return getRollappByEIP155Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> getRollappAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RollappAll",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> getRollappAllMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> getRollappAllMethod;
    if ((getRollappAllMethod = QueryGrpc.getRollappAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRollappAllMethod = QueryGrpc.getRollappAllMethod) == null) {
          QueryGrpc.getRollappAllMethod = getRollappAllMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RollappAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RollappAll"))
              .build();
        }
      }
    }
    return getRollappAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> getLatestStateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LatestStateIndex",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> getLatestStateIndexMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> getLatestStateIndexMethod;
    if ((getLatestStateIndexMethod = QueryGrpc.getLatestStateIndexMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getLatestStateIndexMethod = QueryGrpc.getLatestStateIndexMethod) == null) {
          QueryGrpc.getLatestStateIndexMethod = getLatestStateIndexMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LatestStateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("LatestStateIndex"))
              .build();
        }
      }
    }
    return getLatestStateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> getStateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StateInfo",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> getStateInfoMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> getStateInfoMethod;
    if ((getStateInfoMethod = QueryGrpc.getStateInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStateInfoMethod = QueryGrpc.getStateInfoMethod) == null) {
          QueryGrpc.getStateInfoMethod = getStateInfoMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StateInfo"))
              .build();
        }
      }
    }
    return getStateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> getStateInfoAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StateInfoAll",
      requestType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest.class,
      responseType = com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest,
      com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> getStateInfoAllMethod() {
    io.grpc.MethodDescriptor<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> getStateInfoAllMethod;
    if ((getStateInfoAllMethod = QueryGrpc.getStateInfoAllMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getStateInfoAllMethod = QueryGrpc.getStateInfoAllMethod) == null) {
          QueryGrpc.getStateInfoAllMethod = getStateInfoAllMethod =
              io.grpc.MethodDescriptor.<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest, com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StateInfoAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("StateInfoAll"))
              .build();
        }
      }
    }
    return getStateInfoAllMethod;
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
    default void params(com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    default void rollapp(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRollappMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    default void rollappByEIP155(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRollappByEIP155Method(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Rollapp items.
     * </pre>
     */
    default void rollappAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRollappAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a LatestStateIndex by rollapp-id.
     * </pre>
     */
    default void latestStateIndex(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLatestStateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a StateInfo by index.
     * </pre>
     */
    default void stateInfo(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StateInfo items.
     * </pre>
     */
    default void stateInfoAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStateInfoAllMethod(), responseObserver);
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
    public void params(com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public void rollapp(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRollappMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public void rollappByEIP155(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRollappByEIP155Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of Rollapp items.
     * </pre>
     */
    public void rollappAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRollappAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a LatestStateIndex by rollapp-id.
     * </pre>
     */
    public void latestStateIndex(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLatestStateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a StateInfo by index.
     * </pre>
     */
    public void stateInfo(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries a list of StateInfo items.
     * </pre>
     */
    public void stateInfoAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest request,
        io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStateInfoAllMethod(), getCallOptions()), request, responseObserver);
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
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse params(com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse rollapp(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRollappMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse rollappByEIP155(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRollappByEIP155Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of Rollapp items.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse rollappAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRollappAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a LatestStateIndex by rollapp-id.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse latestStateIndex(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLatestStateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a StateInfo by index.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse stateInfo(com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries a list of StateInfo items.
     * </pre>
     */
    public com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse stateInfoAll(com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStateInfoAllMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse> params(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> rollapp(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRollappMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a Rollapp by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse> rollappByEIP155(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRollappByEIP155Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of Rollapp items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse> rollappAll(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRollappAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a LatestStateIndex by rollapp-id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse> latestStateIndex(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLatestStateIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a StateInfo by index.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse> stateInfo(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries a list of StateInfo items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse> stateInfoAll(
        com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStateInfoAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ROLLAPP = 1;
  private static final int METHODID_ROLLAPP_BY_EIP155 = 2;
  private static final int METHODID_ROLLAPP_ALL = 3;
  private static final int METHODID_LATEST_STATE_INDEX = 4;
  private static final int METHODID_STATE_INFO = 5;
  private static final int METHODID_STATE_INFO_ALL = 6;

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
          serviceImpl.params((com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ROLLAPP:
          serviceImpl.rollapp((com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>) responseObserver);
          break;
        case METHODID_ROLLAPP_BY_EIP155:
          serviceImpl.rollappByEIP155((com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>) responseObserver);
          break;
        case METHODID_ROLLAPP_ALL:
          serviceImpl.rollappAll((com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse>) responseObserver);
          break;
        case METHODID_LATEST_STATE_INDEX:
          serviceImpl.latestStateIndex((com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse>) responseObserver);
          break;
        case METHODID_STATE_INFO:
          serviceImpl.stateInfo((com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse>) responseObserver);
          break;
        case METHODID_STATE_INFO_ALL:
          serviceImpl.stateInfoAll((com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse>) responseObserver);
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
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getRollappMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>(
                service, METHODID_ROLLAPP)))
        .addMethod(
          getRollappByEIP155Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappByEIP155Request,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetRollappResponse>(
                service, METHODID_ROLLAPP_BY_EIP155)))
        .addMethod(
          getRollappAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllRollappResponse>(
                service, METHODID_ROLLAPP_ALL)))
        .addMethod(
          getLatestStateIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetLatestStateIndexResponse>(
                service, METHODID_LATEST_STATE_INDEX)))
        .addMethod(
          getStateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryGetStateInfoResponse>(
                service, METHODID_STATE_INFO)))
        .addMethod(
          getStateInfoAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoRequest,
              com.dymensionxyz.dymension.rollapp.QueryProto.QueryAllStateInfoResponse>(
                service, METHODID_STATE_INFO_ALL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dymensionxyz.dymension.rollapp.QueryProto.getDescriptor();
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
              .addMethod(getRollappMethod())
              .addMethod(getRollappByEIP155Method())
              .addMethod(getRollappAllMethod())
              .addMethod(getLatestStateIndexMethod())
              .addMethod(getStateInfoMethod())
              .addMethod(getStateInfoAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
