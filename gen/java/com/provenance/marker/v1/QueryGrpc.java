package com.provenance.marker.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service for marker module.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/marker/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.marker.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryParamsRequest,
      com.provenance.marker.v1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.provenance.marker.v1.QueryProto.QueryParamsRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryParamsRequest,
      com.provenance.marker.v1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryParamsRequest, com.provenance.marker.v1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryParamsRequest, com.provenance.marker.v1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest,
      com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> getAllMarkersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllMarkers",
      requestType = com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest,
      com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> getAllMarkersMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest, com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> getAllMarkersMethod;
    if ((getAllMarkersMethod = QueryGrpc.getAllMarkersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllMarkersMethod = QueryGrpc.getAllMarkersMethod) == null) {
          QueryGrpc.getAllMarkersMethod = getAllMarkersMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest, com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllMarkers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllMarkers"))
              .build();
        }
      }
    }
    return getAllMarkersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryMarkerRequest,
      com.provenance.marker.v1.QueryProto.QueryMarkerResponse> getMarkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Marker",
      requestType = com.provenance.marker.v1.QueryProto.QueryMarkerRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryMarkerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryMarkerRequest,
      com.provenance.marker.v1.QueryProto.QueryMarkerResponse> getMarkerMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryMarkerRequest, com.provenance.marker.v1.QueryProto.QueryMarkerResponse> getMarkerMethod;
    if ((getMarkerMethod = QueryGrpc.getMarkerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMarkerMethod = QueryGrpc.getMarkerMethod) == null) {
          QueryGrpc.getMarkerMethod = getMarkerMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryMarkerRequest, com.provenance.marker.v1.QueryProto.QueryMarkerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Marker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryMarkerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryMarkerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Marker"))
              .build();
        }
      }
    }
    return getMarkerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryHoldingRequest,
      com.provenance.marker.v1.QueryProto.QueryHoldingResponse> getHoldingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Holding",
      requestType = com.provenance.marker.v1.QueryProto.QueryHoldingRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryHoldingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryHoldingRequest,
      com.provenance.marker.v1.QueryProto.QueryHoldingResponse> getHoldingMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryHoldingRequest, com.provenance.marker.v1.QueryProto.QueryHoldingResponse> getHoldingMethod;
    if ((getHoldingMethod = QueryGrpc.getHoldingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getHoldingMethod = QueryGrpc.getHoldingMethod) == null) {
          QueryGrpc.getHoldingMethod = getHoldingMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryHoldingRequest, com.provenance.marker.v1.QueryProto.QueryHoldingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Holding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryHoldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryHoldingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Holding"))
              .build();
        }
      }
    }
    return getHoldingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QuerySupplyRequest,
      com.provenance.marker.v1.QueryProto.QuerySupplyResponse> getSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Supply",
      requestType = com.provenance.marker.v1.QueryProto.QuerySupplyRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QuerySupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QuerySupplyRequest,
      com.provenance.marker.v1.QueryProto.QuerySupplyResponse> getSupplyMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QuerySupplyRequest, com.provenance.marker.v1.QueryProto.QuerySupplyResponse> getSupplyMethod;
    if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSupplyMethod = QueryGrpc.getSupplyMethod) == null) {
          QueryGrpc.getSupplyMethod = getSupplyMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QuerySupplyRequest, com.provenance.marker.v1.QueryProto.QuerySupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Supply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QuerySupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QuerySupplyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Supply"))
              .build();
        }
      }
    }
    return getSupplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryEscrowRequest,
      com.provenance.marker.v1.QueryProto.QueryEscrowResponse> getEscrowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Escrow",
      requestType = com.provenance.marker.v1.QueryProto.QueryEscrowRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryEscrowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryEscrowRequest,
      com.provenance.marker.v1.QueryProto.QueryEscrowResponse> getEscrowMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryEscrowRequest, com.provenance.marker.v1.QueryProto.QueryEscrowResponse> getEscrowMethod;
    if ((getEscrowMethod = QueryGrpc.getEscrowMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEscrowMethod = QueryGrpc.getEscrowMethod) == null) {
          QueryGrpc.getEscrowMethod = getEscrowMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryEscrowRequest, com.provenance.marker.v1.QueryProto.QueryEscrowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Escrow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryEscrowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryEscrowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Escrow"))
              .build();
        }
      }
    }
    return getEscrowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccessRequest,
      com.provenance.marker.v1.QueryProto.QueryAccessResponse> getAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Access",
      requestType = com.provenance.marker.v1.QueryProto.QueryAccessRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccessRequest,
      com.provenance.marker.v1.QueryProto.QueryAccessResponse> getAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccessRequest, com.provenance.marker.v1.QueryProto.QueryAccessResponse> getAccessMethod;
    if ((getAccessMethod = QueryGrpc.getAccessMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccessMethod = QueryGrpc.getAccessMethod) == null) {
          QueryGrpc.getAccessMethod = getAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryAccessRequest, com.provenance.marker.v1.QueryProto.QueryAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Access"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Access"))
              .build();
        }
      }
    }
    return getAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest,
      com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> getDenomMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DenomMetadata",
      requestType = com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest,
      com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> getDenomMetadataMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest, com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> getDenomMetadataMethod;
    if ((getDenomMetadataMethod = QueryGrpc.getDenomMetadataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDenomMetadataMethod = QueryGrpc.getDenomMetadataMethod) == null) {
          QueryGrpc.getDenomMetadataMethod = getDenomMetadataMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest, com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DenomMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DenomMetadata"))
              .build();
        }
      }
    }
    return getDenomMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccountDataRequest,
      com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AccountData",
      requestType = com.provenance.marker.v1.QueryProto.QueryAccountDataRequest.class,
      responseType = com.provenance.marker.v1.QueryProto.QueryAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccountDataRequest,
      com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.marker.v1.QueryProto.QueryAccountDataRequest, com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> getAccountDataMethod;
    if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAccountDataMethod = QueryGrpc.getAccountDataMethod) == null) {
          QueryGrpc.getAccountDataMethod = getAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.marker.v1.QueryProto.QueryAccountDataRequest, com.provenance.marker.v1.QueryProto.QueryAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.marker.v1.QueryProto.QueryAccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AccountData"))
              .build();
        }
      }
    }
    return getAccountDataMethod;
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
   * Query defines the gRPC querier service for marker module.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    default void params(com.provenance.marker.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all markers on the blockchain
     * </pre>
     */
    default void allMarkers(com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllMarkersMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for a single marker by denom or address
     * </pre>
     */
    default void marker(com.provenance.marker.v1.QueryProto.QueryMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryMarkerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkerMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for all accounts holding the given marker coins
     * </pre>
     */
    default void holding(com.provenance.marker.v1.QueryProto.QueryHoldingRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryHoldingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldingMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for supply of coin on a marker account
     * </pre>
     */
    default void supply(com.provenance.marker.v1.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSupplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for coins on a marker account
     * </pre>
     */
    default void escrow(com.provenance.marker.v1.QueryProto.QueryEscrowRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryEscrowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEscrowMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    default void access(com.provenance.marker.v1.QueryProto.QueryAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    default void denomMetadata(com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDenomMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * query for account data associated with a denom
     * </pre>
     */
    default void accountData(com.provenance.marker.v1.QueryProto.QueryAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public void params(com.provenance.marker.v1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of all markers on the blockchain
     * </pre>
     */
    public void allMarkers(com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllMarkersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for a single marker by denom or address
     * </pre>
     */
    public void marker(com.provenance.marker.v1.QueryProto.QueryMarkerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryMarkerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for all accounts holding the given marker coins
     * </pre>
     */
    public void holding(com.provenance.marker.v1.QueryProto.QueryHoldingRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryHoldingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for supply of coin on a marker account
     * </pre>
     */
    public void supply(com.provenance.marker.v1.QueryProto.QuerySupplyRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QuerySupplyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for coins on a marker account
     * </pre>
     */
    public void escrow(com.provenance.marker.v1.QueryProto.QueryEscrowRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryEscrowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEscrowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public void access(com.provenance.marker.v1.QueryProto.QueryAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public void denomMetadata(com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDenomMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * query for account data associated with a denom
     * </pre>
     */
    public void accountData(com.provenance.marker.v1.QueryProto.QueryAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryParamsResponse params(com.provenance.marker.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of all markers on the blockchain
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse allMarkers(com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllMarkersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for a single marker by denom or address
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryMarkerResponse marker(com.provenance.marker.v1.QueryProto.QueryMarkerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for all accounts holding the given marker coins
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryHoldingResponse holding(com.provenance.marker.v1.QueryProto.QueryHoldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for supply of coin on a marker account
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QuerySupplyResponse supply(com.provenance.marker.v1.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSupplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for coins on a marker account
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryEscrowResponse escrow(com.provenance.marker.v1.QueryProto.QueryEscrowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEscrowMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryAccessResponse access(com.provenance.marker.v1.QueryProto.QueryAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse denomMetadata(com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDenomMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * query for account data associated with a denom
     * </pre>
     */
    public com.provenance.marker.v1.QueryProto.QueryAccountDataResponse accountData(com.provenance.marker.v1.QueryProto.QueryAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service for marker module.
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
     * Params queries the parameters of x/bank module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryParamsResponse> params(
        com.provenance.marker.v1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of all markers on the blockchain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse> allMarkers(
        com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllMarkersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for a single marker by denom or address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryMarkerResponse> marker(
        com.provenance.marker.v1.QueryProto.QueryMarkerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for all accounts holding the given marker coins
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryHoldingResponse> holding(
        com.provenance.marker.v1.QueryProto.QueryHoldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for supply of coin on a marker account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QuerySupplyResponse> supply(
        com.provenance.marker.v1.QueryProto.QuerySupplyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSupplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for coins on a marker account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryEscrowResponse> escrow(
        com.provenance.marker.v1.QueryProto.QueryEscrowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEscrowMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryAccessResponse> access(
        com.provenance.marker.v1.QueryProto.QueryAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for access records on an account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse> denomMetadata(
        com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDenomMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * query for account data associated with a denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.marker.v1.QueryProto.QueryAccountDataResponse> accountData(
        com.provenance.marker.v1.QueryProto.QueryAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_ALL_MARKERS = 1;
  private static final int METHODID_MARKER = 2;
  private static final int METHODID_HOLDING = 3;
  private static final int METHODID_SUPPLY = 4;
  private static final int METHODID_ESCROW = 5;
  private static final int METHODID_ACCESS = 6;
  private static final int METHODID_DENOM_METADATA = 7;
  private static final int METHODID_ACCOUNT_DATA = 8;

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
          serviceImpl.params((com.provenance.marker.v1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_ALL_MARKERS:
          serviceImpl.allMarkers((com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse>) responseObserver);
          break;
        case METHODID_MARKER:
          serviceImpl.marker((com.provenance.marker.v1.QueryProto.QueryMarkerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryMarkerResponse>) responseObserver);
          break;
        case METHODID_HOLDING:
          serviceImpl.holding((com.provenance.marker.v1.QueryProto.QueryHoldingRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryHoldingResponse>) responseObserver);
          break;
        case METHODID_SUPPLY:
          serviceImpl.supply((com.provenance.marker.v1.QueryProto.QuerySupplyRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QuerySupplyResponse>) responseObserver);
          break;
        case METHODID_ESCROW:
          serviceImpl.escrow((com.provenance.marker.v1.QueryProto.QueryEscrowRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryEscrowResponse>) responseObserver);
          break;
        case METHODID_ACCESS:
          serviceImpl.access((com.provenance.marker.v1.QueryProto.QueryAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccessResponse>) responseObserver);
          break;
        case METHODID_DENOM_METADATA:
          serviceImpl.denomMetadata((com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse>) responseObserver);
          break;
        case METHODID_ACCOUNT_DATA:
          serviceImpl.accountData((com.provenance.marker.v1.QueryProto.QueryAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.marker.v1.QueryProto.QueryAccountDataResponse>) responseObserver);
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
              com.provenance.marker.v1.QueryProto.QueryParamsRequest,
              com.provenance.marker.v1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getAllMarkersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryAllMarkersRequest,
              com.provenance.marker.v1.QueryProto.QueryAllMarkersResponse>(
                service, METHODID_ALL_MARKERS)))
        .addMethod(
          getMarkerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryMarkerRequest,
              com.provenance.marker.v1.QueryProto.QueryMarkerResponse>(
                service, METHODID_MARKER)))
        .addMethod(
          getHoldingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryHoldingRequest,
              com.provenance.marker.v1.QueryProto.QueryHoldingResponse>(
                service, METHODID_HOLDING)))
        .addMethod(
          getSupplyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QuerySupplyRequest,
              com.provenance.marker.v1.QueryProto.QuerySupplyResponse>(
                service, METHODID_SUPPLY)))
        .addMethod(
          getEscrowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryEscrowRequest,
              com.provenance.marker.v1.QueryProto.QueryEscrowResponse>(
                service, METHODID_ESCROW)))
        .addMethod(
          getAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryAccessRequest,
              com.provenance.marker.v1.QueryProto.QueryAccessResponse>(
                service, METHODID_ACCESS)))
        .addMethod(
          getDenomMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryDenomMetadataRequest,
              com.provenance.marker.v1.QueryProto.QueryDenomMetadataResponse>(
                service, METHODID_DENOM_METADATA)))
        .addMethod(
          getAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.marker.v1.QueryProto.QueryAccountDataRequest,
              com.provenance.marker.v1.QueryProto.QueryAccountDataResponse>(
                service, METHODID_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.marker.v1.QueryProto.getDescriptor();
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
              .addMethod(getParamsMethod())
              .addMethod(getAllMarkersMethod())
              .addMethod(getMarkerMethod())
              .addMethod(getHoldingMethod())
              .addMethod(getSupplyMethod())
              .addMethod(getEscrowMethod())
              .addMethod(getAccessMethod())
              .addMethod(getDenomMetadataMethod())
              .addMethod(getAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
