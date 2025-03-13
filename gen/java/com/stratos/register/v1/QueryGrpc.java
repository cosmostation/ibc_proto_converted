package com.stratos.register.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: stratos/register/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "stratos.register.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryResourceNodeRequest,
      com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> getResourceNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResourceNode",
      requestType = com.stratos.register.v1.QueryProto.QueryResourceNodeRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryResourceNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryResourceNodeRequest,
      com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> getResourceNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryResourceNodeRequest, com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> getResourceNodeMethod;
    if ((getResourceNodeMethod = QueryGrpc.getResourceNodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResourceNodeMethod = QueryGrpc.getResourceNodeMethod) == null) {
          QueryGrpc.getResourceNodeMethod = getResourceNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryResourceNodeRequest, com.stratos.register.v1.QueryProto.QueryResourceNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResourceNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryResourceNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryResourceNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ResourceNode"))
              .build();
        }
      }
    }
    return getResourceNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryMetaNodeRequest,
      com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> getMetaNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MetaNode",
      requestType = com.stratos.register.v1.QueryProto.QueryMetaNodeRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryMetaNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryMetaNodeRequest,
      com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> getMetaNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryMetaNodeRequest, com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> getMetaNodeMethod;
    if ((getMetaNodeMethod = QueryGrpc.getMetaNodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMetaNodeMethod = QueryGrpc.getMetaNodeMethod) == null) {
          QueryGrpc.getMetaNodeMethod = getMetaNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryMetaNodeRequest, com.stratos.register.v1.QueryProto.QueryMetaNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MetaNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryMetaNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryMetaNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MetaNode"))
              .build();
        }
      }
    }
    return getMetaNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryParamsRequest,
      com.stratos.register.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.stratos.register.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryParamsRequest,
      com.stratos.register.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryParamsRequest, com.stratos.register.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryParamsRequest, com.stratos.register.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest,
      com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> getDepositByNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositByNode",
      requestType = com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest,
      com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> getDepositByNodeMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest, com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> getDepositByNodeMethod;
    if ((getDepositByNodeMethod = QueryGrpc.getDepositByNodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositByNodeMethod = QueryGrpc.getDepositByNodeMethod) == null) {
          QueryGrpc.getDepositByNodeMethod = getDepositByNodeMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest, com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositByNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositByNode"))
              .build();
        }
      }
    }
    return getDepositByNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest,
      com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> getDepositByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositByOwner",
      requestType = com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest,
      com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> getDepositByOwnerMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest, com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> getDepositByOwnerMethod;
    if ((getDepositByOwnerMethod = QueryGrpc.getDepositByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositByOwnerMethod = QueryGrpc.getDepositByOwnerMethod) == null) {
          QueryGrpc.getDepositByOwnerMethod = getDepositByOwnerMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest, com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositByOwner"))
              .build();
        }
      }
    }
    return getDepositByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositTotalRequest,
      com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> getDepositTotalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositTotal",
      requestType = com.stratos.register.v1.QueryProto.QueryDepositTotalRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryDepositTotalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositTotalRequest,
      com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> getDepositTotalMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryDepositTotalRequest, com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> getDepositTotalMethod;
    if ((getDepositTotalMethod = QueryGrpc.getDepositTotalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositTotalMethod = QueryGrpc.getDepositTotalMethod) == null) {
          QueryGrpc.getDepositTotalMethod = getDepositTotalMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryDepositTotalRequest, com.stratos.register.v1.QueryProto.QueryDepositTotalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositTotal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositTotalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryDepositTotalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositTotal"))
              .build();
        }
      }
    }
    return getDepositTotalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest,
      com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> getBondedResourceNodeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondedResourceNodeCount",
      requestType = com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest,
      com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> getBondedResourceNodeCountMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest, com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> getBondedResourceNodeCountMethod;
    if ((getBondedResourceNodeCountMethod = QueryGrpc.getBondedResourceNodeCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondedResourceNodeCountMethod = QueryGrpc.getBondedResourceNodeCountMethod) == null) {
          QueryGrpc.getBondedResourceNodeCountMethod = getBondedResourceNodeCountMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest, com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondedResourceNodeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondedResourceNodeCount"))
              .build();
        }
      }
    }
    return getBondedResourceNodeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest,
      com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> getBondedMetaNodeCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BondedMetaNodeCount",
      requestType = com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest,
      com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> getBondedMetaNodeCountMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest, com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> getBondedMetaNodeCountMethod;
    if ((getBondedMetaNodeCountMethod = QueryGrpc.getBondedMetaNodeCountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBondedMetaNodeCountMethod = QueryGrpc.getBondedMetaNodeCountMethod) == null) {
          QueryGrpc.getBondedMetaNodeCountMethod = getBondedMetaNodeCountMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest, com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BondedMetaNodeCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("BondedMetaNodeCount"))
              .build();
        }
      }
    }
    return getBondedMetaNodeCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest,
      com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> getRemainingOzoneLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemainingOzoneLimit",
      requestType = com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest.class,
      responseType = com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest,
      com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> getRemainingOzoneLimitMethod() {
    io.grpc.MethodDescriptor<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest, com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> getRemainingOzoneLimitMethod;
    if ((getRemainingOzoneLimitMethod = QueryGrpc.getRemainingOzoneLimitMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRemainingOzoneLimitMethod = QueryGrpc.getRemainingOzoneLimitMethod) == null) {
          QueryGrpc.getRemainingOzoneLimitMethod = getRemainingOzoneLimitMethod =
              io.grpc.MethodDescriptor.<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest, com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemainingOzoneLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RemainingOzoneLimit"))
              .build();
        }
      }
    }
    return getRemainingOzoneLimitMethod;
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
     * ResourceNode queries ResourceNode info for given ResourceNode address.
     * </pre>
     */
    default void resourceNode(com.stratos.register.v1.QueryProto.QueryResourceNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResourceNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * MetaNode queries MetaNode info for given MetaNode address.
     * </pre>
     */
    default void metaNode(com.stratos.register.v1.QueryProto.QueryMetaNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMetaNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries Register module Params info.
     * </pre>
     */
    default void params(com.stratos.register.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositByNode queries all deposit info for given node network address.
     * </pre>
     */
    default void depositByNode(com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositByNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositByOwner queries all deposit info for given owner address.
     * </pre>
     */
    default void depositByOwner(com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositByOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositTotal queries all deposit info.
     * </pre>
     */
    default void depositTotal(com.stratos.register.v1.QueryProto.QueryDepositTotalRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositTotalMethod(), responseObserver);
    }

    /**
     * <pre>
     * BondedResourceNodeCount queries total number of ResourceNodes.
     * </pre>
     */
    default void bondedResourceNodeCount(com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondedResourceNodeCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * BondedMetaNodeCount queries total number of MetaNodes.
     * </pre>
     */
    default void bondedMetaNodeCount(com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBondedMetaNodeCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemainingOzoneLimit returns the current remaining ozone limit.
     * </pre>
     */
    default void remainingOzoneLimit(com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemainingOzoneLimitMethod(), responseObserver);
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
     * ResourceNode queries ResourceNode info for given ResourceNode address.
     * </pre>
     */
    public void resourceNode(com.stratos.register.v1.QueryProto.QueryResourceNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResourceNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MetaNode queries MetaNode info for given MetaNode address.
     * </pre>
     */
    public void metaNode(com.stratos.register.v1.QueryProto.QueryMetaNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMetaNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries Register module Params info.
     * </pre>
     */
    public void params(com.stratos.register.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositByNode queries all deposit info for given node network address.
     * </pre>
     */
    public void depositByNode(com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositByNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositByOwner queries all deposit info for given owner address.
     * </pre>
     */
    public void depositByOwner(com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositTotal queries all deposit info.
     * </pre>
     */
    public void depositTotal(com.stratos.register.v1.QueryProto.QueryDepositTotalRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositTotalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BondedResourceNodeCount queries total number of ResourceNodes.
     * </pre>
     */
    public void bondedResourceNodeCount(com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondedResourceNodeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BondedMetaNodeCount queries total number of MetaNodes.
     * </pre>
     */
    public void bondedMetaNodeCount(com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBondedMetaNodeCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemainingOzoneLimit returns the current remaining ozone limit.
     * </pre>
     */
    public void remainingOzoneLimit(com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest request,
        io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemainingOzoneLimitMethod(), getCallOptions()), request, responseObserver);
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
     * ResourceNode queries ResourceNode info for given ResourceNode address.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryResourceNodeResponse resourceNode(com.stratos.register.v1.QueryProto.QueryResourceNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResourceNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MetaNode queries MetaNode info for given MetaNode address.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryMetaNodeResponse metaNode(com.stratos.register.v1.QueryProto.QueryMetaNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMetaNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries Register module Params info.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryParamsResponse params(com.stratos.register.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositByNode queries all deposit info for given node network address.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse depositByNode(com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositByNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositByOwner queries all deposit info for given owner address.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse depositByOwner(com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositByOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositTotal queries all deposit info.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryDepositTotalResponse depositTotal(com.stratos.register.v1.QueryProto.QueryDepositTotalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositTotalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BondedResourceNodeCount queries total number of ResourceNodes.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse bondedResourceNodeCount(com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondedResourceNodeCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BondedMetaNodeCount queries total number of MetaNodes.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse bondedMetaNodeCount(com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBondedMetaNodeCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemainingOzoneLimit returns the current remaining ozone limit.
     * </pre>
     */
    public com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse remainingOzoneLimit(com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemainingOzoneLimitMethod(), getCallOptions(), request);
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
     * ResourceNode queries ResourceNode info for given ResourceNode address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryResourceNodeResponse> resourceNode(
        com.stratos.register.v1.QueryProto.QueryResourceNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResourceNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MetaNode queries MetaNode info for given MetaNode address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryMetaNodeResponse> metaNode(
        com.stratos.register.v1.QueryProto.QueryMetaNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMetaNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries Register module Params info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryParamsResponse> params(
        com.stratos.register.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositByNode queries all deposit info for given node network address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse> depositByNode(
        com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositByNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositByOwner queries all deposit info for given owner address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse> depositByOwner(
        com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositByOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositTotal queries all deposit info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryDepositTotalResponse> depositTotal(
        com.stratos.register.v1.QueryProto.QueryDepositTotalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositTotalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BondedResourceNodeCount queries total number of ResourceNodes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse> bondedResourceNodeCount(
        com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondedResourceNodeCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BondedMetaNodeCount queries total number of MetaNodes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse> bondedMetaNodeCount(
        com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBondedMetaNodeCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemainingOzoneLimit returns the current remaining ozone limit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse> remainingOzoneLimit(
        com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemainingOzoneLimitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESOURCE_NODE = 0;
  private static final int METHODID_META_NODE = 1;
  private static final int METHODID_PARAMS = 2;
  private static final int METHODID_DEPOSIT_BY_NODE = 3;
  private static final int METHODID_DEPOSIT_BY_OWNER = 4;
  private static final int METHODID_DEPOSIT_TOTAL = 5;
  private static final int METHODID_BONDED_RESOURCE_NODE_COUNT = 6;
  private static final int METHODID_BONDED_META_NODE_COUNT = 7;
  private static final int METHODID_REMAINING_OZONE_LIMIT = 8;

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
        case METHODID_RESOURCE_NODE:
          serviceImpl.resourceNode((com.stratos.register.v1.QueryProto.QueryResourceNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryResourceNodeResponse>) responseObserver);
          break;
        case METHODID_META_NODE:
          serviceImpl.metaNode((com.stratos.register.v1.QueryProto.QueryMetaNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryMetaNodeResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((com.stratos.register.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_BY_NODE:
          serviceImpl.depositByNode((com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_BY_OWNER:
          serviceImpl.depositByOwner((com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_TOTAL:
          serviceImpl.depositTotal((com.stratos.register.v1.QueryProto.QueryDepositTotalRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryDepositTotalResponse>) responseObserver);
          break;
        case METHODID_BONDED_RESOURCE_NODE_COUNT:
          serviceImpl.bondedResourceNodeCount((com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse>) responseObserver);
          break;
        case METHODID_BONDED_META_NODE_COUNT:
          serviceImpl.bondedMetaNodeCount((com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse>) responseObserver);
          break;
        case METHODID_REMAINING_OZONE_LIMIT:
          serviceImpl.remainingOzoneLimit((com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest) request,
              (io.grpc.stub.StreamObserver<com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse>) responseObserver);
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
          getResourceNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryResourceNodeRequest,
              com.stratos.register.v1.QueryProto.QueryResourceNodeResponse>(
                service, METHODID_RESOURCE_NODE)))
        .addMethod(
          getMetaNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryMetaNodeRequest,
              com.stratos.register.v1.QueryProto.QueryMetaNodeResponse>(
                service, METHODID_META_NODE)))
        .addMethod(
          getParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryParamsRequest,
              com.stratos.register.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getDepositByNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryDepositByNodeRequest,
              com.stratos.register.v1.QueryProto.QueryDepositByNodeResponse>(
                service, METHODID_DEPOSIT_BY_NODE)))
        .addMethod(
          getDepositByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryDepositByOwnerRequest,
              com.stratos.register.v1.QueryProto.QueryDepositByOwnerResponse>(
                service, METHODID_DEPOSIT_BY_OWNER)))
        .addMethod(
          getDepositTotalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryDepositTotalRequest,
              com.stratos.register.v1.QueryProto.QueryDepositTotalResponse>(
                service, METHODID_DEPOSIT_TOTAL)))
        .addMethod(
          getBondedResourceNodeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountRequest,
              com.stratos.register.v1.QueryProto.QueryBondedResourceNodeCountResponse>(
                service, METHODID_BONDED_RESOURCE_NODE_COUNT)))
        .addMethod(
          getBondedMetaNodeCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountRequest,
              com.stratos.register.v1.QueryProto.QueryBondedMetaNodeCountResponse>(
                service, METHODID_BONDED_META_NODE_COUNT)))
        .addMethod(
          getRemainingOzoneLimitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitRequest,
              com.stratos.register.v1.QueryProto.QueryRemainingOzoneLimitResponse>(
                service, METHODID_REMAINING_OZONE_LIMIT)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stratos.register.v1.QueryProto.getDescriptor();
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
              .addMethod(getResourceNodeMethod())
              .addMethod(getMetaNodeMethod())
              .addMethod(getParamsMethod())
              .addMethod(getDepositByNodeMethod())
              .addMethod(getDepositByOwnerMethod())
              .addMethod(getDepositTotalMethod())
              .addMethod(getBondedResourceNodeCountMethod())
              .addMethod(getBondedMetaNodeCountMethod())
              .addMethod(getRemainingOzoneLimitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
