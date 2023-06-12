package com.ibc.applications.fee.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the ICS29 gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ibc/applications/fee/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ibc.applications.fee.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> getIncentivizedPacketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPackets",
      requestType = com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> getIncentivizedPacketsMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> getIncentivizedPacketsMethod;
    if ((getIncentivizedPacketsMethod = QueryGrpc.getIncentivizedPacketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPacketsMethod = QueryGrpc.getIncentivizedPacketsMethod) == null) {
          QueryGrpc.getIncentivizedPacketsMethod = getIncentivizedPacketsMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPackets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPackets"))
              .build();
        }
      }
    }
    return getIncentivizedPacketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> getIncentivizedPacketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPacket",
      requestType = com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> getIncentivizedPacketMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> getIncentivizedPacketMethod;
    if ((getIncentivizedPacketMethod = QueryGrpc.getIncentivizedPacketMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPacketMethod = QueryGrpc.getIncentivizedPacketMethod) == null) {
          QueryGrpc.getIncentivizedPacketMethod = getIncentivizedPacketMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPacket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPacket"))
              .build();
        }
      }
    }
    return getIncentivizedPacketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> getIncentivizedPacketsForChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IncentivizedPacketsForChannel",
      requestType = com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest,
      com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> getIncentivizedPacketsForChannelMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> getIncentivizedPacketsForChannelMethod;
    if ((getIncentivizedPacketsForChannelMethod = QueryGrpc.getIncentivizedPacketsForChannelMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getIncentivizedPacketsForChannelMethod = QueryGrpc.getIncentivizedPacketsForChannelMethod) == null) {
          QueryGrpc.getIncentivizedPacketsForChannelMethod = getIncentivizedPacketsForChannelMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest, com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IncentivizedPacketsForChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("IncentivizedPacketsForChannel"))
              .build();
        }
      }
    }
    return getIncentivizedPacketsForChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> getTotalRecvFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalRecvFees",
      requestType = com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> getTotalRecvFeesMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest, com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> getTotalRecvFeesMethod;
    if ((getTotalRecvFeesMethod = QueryGrpc.getTotalRecvFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalRecvFeesMethod = QueryGrpc.getTotalRecvFeesMethod) == null) {
          QueryGrpc.getTotalRecvFeesMethod = getTotalRecvFeesMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest, com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalRecvFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalRecvFees"))
              .build();
        }
      }
    }
    return getTotalRecvFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalAckFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> getTotalAckFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalAckFees",
      requestType = com.ibc.applications.fee.v1.QueryTotalAckFeesRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalAckFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> getTotalAckFeesMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalAckFeesRequest, com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> getTotalAckFeesMethod;
    if ((getTotalAckFeesMethod = QueryGrpc.getTotalAckFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalAckFeesMethod = QueryGrpc.getTotalAckFeesMethod) == null) {
          QueryGrpc.getTotalAckFeesMethod = getTotalAckFeesMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryTotalAckFeesRequest, com.ibc.applications.fee.v1.QueryTotalAckFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalAckFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalAckFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalAckFees"))
              .build();
        }
      }
    }
    return getTotalAckFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> getTotalTimeoutFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalTimeoutFees",
      requestType = com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest,
      com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> getTotalTimeoutFeesMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest, com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> getTotalTimeoutFeesMethod;
    if ((getTotalTimeoutFeesMethod = QueryGrpc.getTotalTimeoutFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTotalTimeoutFeesMethod = QueryGrpc.getTotalTimeoutFeesMethod) == null) {
          QueryGrpc.getTotalTimeoutFeesMethod = getTotalTimeoutFeesMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest, com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TotalTimeoutFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TotalTimeoutFees"))
              .build();
        }
      }
    }
    return getTotalTimeoutFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryPayeeRequest,
      com.ibc.applications.fee.v1.QueryPayeeResponse> getPayeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Payee",
      requestType = com.ibc.applications.fee.v1.QueryPayeeRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryPayeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryPayeeRequest,
      com.ibc.applications.fee.v1.QueryPayeeResponse> getPayeeMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryPayeeRequest, com.ibc.applications.fee.v1.QueryPayeeResponse> getPayeeMethod;
    if ((getPayeeMethod = QueryGrpc.getPayeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPayeeMethod = QueryGrpc.getPayeeMethod) == null) {
          QueryGrpc.getPayeeMethod = getPayeeMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryPayeeRequest, com.ibc.applications.fee.v1.QueryPayeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Payee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryPayeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryPayeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Payee"))
              .build();
        }
      }
    }
    return getPayeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest,
      com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> getCounterpartyPayeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CounterpartyPayee",
      requestType = com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest,
      com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> getCounterpartyPayeeMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest, com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> getCounterpartyPayeeMethod;
    if ((getCounterpartyPayeeMethod = QueryGrpc.getCounterpartyPayeeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCounterpartyPayeeMethod = QueryGrpc.getCounterpartyPayeeMethod) == null) {
          QueryGrpc.getCounterpartyPayeeMethod = getCounterpartyPayeeMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest, com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CounterpartyPayee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("CounterpartyPayee"))
              .build();
        }
      }
    }
    return getCounterpartyPayeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest,
      com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> getFeeEnabledChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeEnabledChannels",
      requestType = com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest,
      com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> getFeeEnabledChannelsMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest, com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> getFeeEnabledChannelsMethod;
    if ((getFeeEnabledChannelsMethod = QueryGrpc.getFeeEnabledChannelsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeEnabledChannelsMethod = QueryGrpc.getFeeEnabledChannelsMethod) == null) {
          QueryGrpc.getFeeEnabledChannelsMethod = getFeeEnabledChannelsMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest, com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeEnabledChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeEnabledChannels"))
              .build();
        }
      }
    }
    return getFeeEnabledChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest,
      com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> getFeeEnabledChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeeEnabledChannel",
      requestType = com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest.class,
      responseType = com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest,
      com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> getFeeEnabledChannelMethod() {
    io.grpc.MethodDescriptor<com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest, com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> getFeeEnabledChannelMethod;
    if ((getFeeEnabledChannelMethod = QueryGrpc.getFeeEnabledChannelMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getFeeEnabledChannelMethod = QueryGrpc.getFeeEnabledChannelMethod) == null) {
          QueryGrpc.getFeeEnabledChannelMethod = getFeeEnabledChannelMethod =
              io.grpc.MethodDescriptor.<com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest, com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeeEnabledChannel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("FeeEnabledChannel"))
              .build();
        }
      }
    }
    return getFeeEnabledChannelMethod;
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
   * Query defines the ICS29 gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * IncentivizedPackets returns all incentivized packets and their associated fees
     * </pre>
     */
    default void incentivizedPackets(com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPacketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPacket returns all packet fees for a packet given its identifier
     * </pre>
     */
    default void incentivizedPacket(com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPacketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all incentivized packets for a specific channel
     * </pre>
     */
    default void incentivizedPacketsForChannel(com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIncentivizedPacketsForChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalRecvFees returns the total receive fees for a packet given its identifier
     * </pre>
     */
    default void totalRecvFees(com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalRecvFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalAckFees returns the total acknowledgement fees for a packet given its identifier
     * </pre>
     */
    default void totalAckFees(com.ibc.applications.fee.v1.QueryTotalAckFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalAckFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TotalTimeoutFees returns the total timeout fees for a packet given its identifier
     * </pre>
     */
    default void totalTimeoutFees(com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTotalTimeoutFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Payee returns the registered payee address for a specific channel given the relayer address
     * </pre>
     */
    default void payee(com.ibc.applications.fee.v1.QueryPayeeRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryPayeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPayeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * CounterpartyPayee returns the registered counterparty payee for forward relaying
     * </pre>
     */
    default void counterpartyPayee(com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCounterpartyPayeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeeEnabledChannels returns a list of all fee enabled channels
     * </pre>
     */
    default void feeEnabledChannels(com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeEnabledChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * FeeEnabledChannel returns true if the provided port and channel identifiers belong to a fee enabled channel
     * </pre>
     */
    default void feeEnabledChannel(com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeeEnabledChannelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the ICS29 gRPC querier service.
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
   * Query defines the ICS29 gRPC querier service.
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
     * IncentivizedPackets returns all incentivized packets and their associated fees
     * </pre>
     */
    public void incentivizedPackets(com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPacketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * IncentivizedPacket returns all packet fees for a packet given its identifier
     * </pre>
     */
    public void incentivizedPacket(com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPacketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all incentivized packets for a specific channel
     * </pre>
     */
    public void incentivizedPacketsForChannel(com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIncentivizedPacketsForChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalRecvFees returns the total receive fees for a packet given its identifier
     * </pre>
     */
    public void totalRecvFees(com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalRecvFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalAckFees returns the total acknowledgement fees for a packet given its identifier
     * </pre>
     */
    public void totalAckFees(com.ibc.applications.fee.v1.QueryTotalAckFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalAckFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TotalTimeoutFees returns the total timeout fees for a packet given its identifier
     * </pre>
     */
    public void totalTimeoutFees(com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTotalTimeoutFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Payee returns the registered payee address for a specific channel given the relayer address
     * </pre>
     */
    public void payee(com.ibc.applications.fee.v1.QueryPayeeRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryPayeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPayeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CounterpartyPayee returns the registered counterparty payee for forward relaying
     * </pre>
     */
    public void counterpartyPayee(com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCounterpartyPayeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeeEnabledChannels returns a list of all fee enabled channels
     * </pre>
     */
    public void feeEnabledChannels(com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeEnabledChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FeeEnabledChannel returns true if the provided port and channel identifiers belong to a fee enabled channel
     * </pre>
     */
    public void feeEnabledChannel(com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeeEnabledChannelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the ICS29 gRPC querier service.
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
     * IncentivizedPackets returns all incentivized packets and their associated fees
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse incentivizedPackets(com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPacketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * IncentivizedPacket returns all packet fees for a packet given its identifier
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse incentivizedPacket(com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPacketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all incentivized packets for a specific channel
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse incentivizedPacketsForChannel(com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIncentivizedPacketsForChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalRecvFees returns the total receive fees for a packet given its identifier
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse totalRecvFees(com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalRecvFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalAckFees returns the total acknowledgement fees for a packet given its identifier
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryTotalAckFeesResponse totalAckFees(com.ibc.applications.fee.v1.QueryTotalAckFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalAckFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TotalTimeoutFees returns the total timeout fees for a packet given its identifier
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse totalTimeoutFees(com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTotalTimeoutFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Payee returns the registered payee address for a specific channel given the relayer address
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryPayeeResponse payee(com.ibc.applications.fee.v1.QueryPayeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPayeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CounterpartyPayee returns the registered counterparty payee for forward relaying
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse counterpartyPayee(com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCounterpartyPayeeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeeEnabledChannels returns a list of all fee enabled channels
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse feeEnabledChannels(com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeEnabledChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FeeEnabledChannel returns true if the provided port and channel identifiers belong to a fee enabled channel
     * </pre>
     */
    public com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse feeEnabledChannel(com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeeEnabledChannelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the ICS29 gRPC querier service.
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
     * IncentivizedPackets returns all incentivized packets and their associated fees
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse> incentivizedPackets(
        com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPacketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * IncentivizedPacket returns all packet fees for a packet given its identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse> incentivizedPacket(
        com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPacketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all incentivized packets for a specific channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse> incentivizedPacketsForChannel(
        com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIncentivizedPacketsForChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalRecvFees returns the total receive fees for a packet given its identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse> totalRecvFees(
        com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalRecvFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalAckFees returns the total acknowledgement fees for a packet given its identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryTotalAckFeesResponse> totalAckFees(
        com.ibc.applications.fee.v1.QueryTotalAckFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalAckFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TotalTimeoutFees returns the total timeout fees for a packet given its identifier
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse> totalTimeoutFees(
        com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTotalTimeoutFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Payee returns the registered payee address for a specific channel given the relayer address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryPayeeResponse> payee(
        com.ibc.applications.fee.v1.QueryPayeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPayeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CounterpartyPayee returns the registered counterparty payee for forward relaying
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse> counterpartyPayee(
        com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCounterpartyPayeeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeeEnabledChannels returns a list of all fee enabled channels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse> feeEnabledChannels(
        com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeEnabledChannelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FeeEnabledChannel returns true if the provided port and channel identifiers belong to a fee enabled channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse> feeEnabledChannel(
        com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeeEnabledChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCENTIVIZED_PACKETS = 0;
  private static final int METHODID_INCENTIVIZED_PACKET = 1;
  private static final int METHODID_INCENTIVIZED_PACKETS_FOR_CHANNEL = 2;
  private static final int METHODID_TOTAL_RECV_FEES = 3;
  private static final int METHODID_TOTAL_ACK_FEES = 4;
  private static final int METHODID_TOTAL_TIMEOUT_FEES = 5;
  private static final int METHODID_PAYEE = 6;
  private static final int METHODID_COUNTERPARTY_PAYEE = 7;
  private static final int METHODID_FEE_ENABLED_CHANNELS = 8;
  private static final int METHODID_FEE_ENABLED_CHANNEL = 9;

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
        case METHODID_INCENTIVIZED_PACKETS:
          serviceImpl.incentivizedPackets((com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_PACKET:
          serviceImpl.incentivizedPacket((com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse>) responseObserver);
          break;
        case METHODID_INCENTIVIZED_PACKETS_FOR_CHANNEL:
          serviceImpl.incentivizedPacketsForChannel((com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse>) responseObserver);
          break;
        case METHODID_TOTAL_RECV_FEES:
          serviceImpl.totalRecvFees((com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse>) responseObserver);
          break;
        case METHODID_TOTAL_ACK_FEES:
          serviceImpl.totalAckFees((com.ibc.applications.fee.v1.QueryTotalAckFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalAckFeesResponse>) responseObserver);
          break;
        case METHODID_TOTAL_TIMEOUT_FEES:
          serviceImpl.totalTimeoutFees((com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse>) responseObserver);
          break;
        case METHODID_PAYEE:
          serviceImpl.payee((com.ibc.applications.fee.v1.QueryPayeeRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryPayeeResponse>) responseObserver);
          break;
        case METHODID_COUNTERPARTY_PAYEE:
          serviceImpl.counterpartyPayee((com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse>) responseObserver);
          break;
        case METHODID_FEE_ENABLED_CHANNELS:
          serviceImpl.feeEnabledChannels((com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse>) responseObserver);
          break;
        case METHODID_FEE_ENABLED_CHANNEL:
          serviceImpl.feeEnabledChannel((com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse>) responseObserver);
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
          getIncentivizedPacketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryIncentivizedPacketsRequest,
              com.ibc.applications.fee.v1.QueryIncentivizedPacketsResponse>(
                service, METHODID_INCENTIVIZED_PACKETS)))
        .addMethod(
          getIncentivizedPacketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryIncentivizedPacketRequest,
              com.ibc.applications.fee.v1.QueryIncentivizedPacketResponse>(
                service, METHODID_INCENTIVIZED_PACKET)))
        .addMethod(
          getIncentivizedPacketsForChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest,
              com.ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse>(
                service, METHODID_INCENTIVIZED_PACKETS_FOR_CHANNEL)))
        .addMethod(
          getTotalRecvFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryTotalRecvFeesRequest,
              com.ibc.applications.fee.v1.QueryTotalRecvFeesResponse>(
                service, METHODID_TOTAL_RECV_FEES)))
        .addMethod(
          getTotalAckFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryTotalAckFeesRequest,
              com.ibc.applications.fee.v1.QueryTotalAckFeesResponse>(
                service, METHODID_TOTAL_ACK_FEES)))
        .addMethod(
          getTotalTimeoutFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest,
              com.ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse>(
                service, METHODID_TOTAL_TIMEOUT_FEES)))
        .addMethod(
          getPayeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryPayeeRequest,
              com.ibc.applications.fee.v1.QueryPayeeResponse>(
                service, METHODID_PAYEE)))
        .addMethod(
          getCounterpartyPayeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryCounterpartyPayeeRequest,
              com.ibc.applications.fee.v1.QueryCounterpartyPayeeResponse>(
                service, METHODID_COUNTERPARTY_PAYEE)))
        .addMethod(
          getFeeEnabledChannelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest,
              com.ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse>(
                service, METHODID_FEE_ENABLED_CHANNELS)))
        .addMethod(
          getFeeEnabledChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.applications.fee.v1.QueryFeeEnabledChannelRequest,
              com.ibc.applications.fee.v1.QueryFeeEnabledChannelResponse>(
                service, METHODID_FEE_ENABLED_CHANNEL)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ibc.applications.fee.v1.QueryProto.getDescriptor();
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
              .addMethod(getIncentivizedPacketsMethod())
              .addMethod(getIncentivizedPacketMethod())
              .addMethod(getIncentivizedPacketsForChannelMethod())
              .addMethod(getTotalRecvFeesMethod())
              .addMethod(getTotalAckFeesMethod())
              .addMethod(getTotalTimeoutFeesMethod())
              .addMethod(getPayeeMethod())
              .addMethod(getCounterpartyPayeeMethod())
              .addMethod(getFeeEnabledChannelsMethod())
              .addMethod(getFeeEnabledChannelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
