package com.ibc.core.channel.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ibc/core/channel/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "ibc.core.channel.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelRequest,
      com.ibc.core.channel.v1.QueryChannelResponse> getChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channel",
      requestType = com.ibc.core.channel.v1.QueryChannelRequest.class,
      responseType = com.ibc.core.channel.v1.QueryChannelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelRequest,
      com.ibc.core.channel.v1.QueryChannelResponse> getChannelMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelRequest, com.ibc.core.channel.v1.QueryChannelResponse> getChannelMethod;
    if ((getChannelMethod = QueryGrpc.getChannelMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChannelMethod = QueryGrpc.getChannelMethod) == null) {
          QueryGrpc.getChannelMethod = getChannelMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryChannelRequest, com.ibc.core.channel.v1.QueryChannelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Channel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Channel"))
              .build();
        }
      }
    }
    return getChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelsRequest,
      com.ibc.core.channel.v1.QueryChannelsResponse> getChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Channels",
      requestType = com.ibc.core.channel.v1.QueryChannelsRequest.class,
      responseType = com.ibc.core.channel.v1.QueryChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelsRequest,
      com.ibc.core.channel.v1.QueryChannelsResponse> getChannelsMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelsRequest, com.ibc.core.channel.v1.QueryChannelsResponse> getChannelsMethod;
    if ((getChannelsMethod = QueryGrpc.getChannelsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChannelsMethod = QueryGrpc.getChannelsMethod) == null) {
          QueryGrpc.getChannelsMethod = getChannelsMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryChannelsRequest, com.ibc.core.channel.v1.QueryChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Channels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Channels"))
              .build();
        }
      }
    }
    return getChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryConnectionChannelsRequest,
      com.ibc.core.channel.v1.QueryConnectionChannelsResponse> getConnectionChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConnectionChannels",
      requestType = com.ibc.core.channel.v1.QueryConnectionChannelsRequest.class,
      responseType = com.ibc.core.channel.v1.QueryConnectionChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryConnectionChannelsRequest,
      com.ibc.core.channel.v1.QueryConnectionChannelsResponse> getConnectionChannelsMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryConnectionChannelsRequest, com.ibc.core.channel.v1.QueryConnectionChannelsResponse> getConnectionChannelsMethod;
    if ((getConnectionChannelsMethod = QueryGrpc.getConnectionChannelsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getConnectionChannelsMethod = QueryGrpc.getConnectionChannelsMethod) == null) {
          QueryGrpc.getConnectionChannelsMethod = getConnectionChannelsMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryConnectionChannelsRequest, com.ibc.core.channel.v1.QueryConnectionChannelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConnectionChannels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryConnectionChannelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryConnectionChannelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ConnectionChannels"))
              .build();
        }
      }
    }
    return getConnectionChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelClientStateRequest,
      com.ibc.core.channel.v1.QueryChannelClientStateResponse> getChannelClientStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelClientState",
      requestType = com.ibc.core.channel.v1.QueryChannelClientStateRequest.class,
      responseType = com.ibc.core.channel.v1.QueryChannelClientStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelClientStateRequest,
      com.ibc.core.channel.v1.QueryChannelClientStateResponse> getChannelClientStateMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelClientStateRequest, com.ibc.core.channel.v1.QueryChannelClientStateResponse> getChannelClientStateMethod;
    if ((getChannelClientStateMethod = QueryGrpc.getChannelClientStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChannelClientStateMethod = QueryGrpc.getChannelClientStateMethod) == null) {
          QueryGrpc.getChannelClientStateMethod = getChannelClientStateMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryChannelClientStateRequest, com.ibc.core.channel.v1.QueryChannelClientStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelClientState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelClientStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelClientStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChannelClientState"))
              .build();
        }
      }
    }
    return getChannelClientStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelConsensusStateRequest,
      com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> getChannelConsensusStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChannelConsensusState",
      requestType = com.ibc.core.channel.v1.QueryChannelConsensusStateRequest.class,
      responseType = com.ibc.core.channel.v1.QueryChannelConsensusStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelConsensusStateRequest,
      com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> getChannelConsensusStateMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryChannelConsensusStateRequest, com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> getChannelConsensusStateMethod;
    if ((getChannelConsensusStateMethod = QueryGrpc.getChannelConsensusStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getChannelConsensusStateMethod = QueryGrpc.getChannelConsensusStateMethod) == null) {
          QueryGrpc.getChannelConsensusStateMethod = getChannelConsensusStateMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryChannelConsensusStateRequest, com.ibc.core.channel.v1.QueryChannelConsensusStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChannelConsensusState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelConsensusStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryChannelConsensusStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ChannelConsensusState"))
              .build();
        }
      }
    }
    return getChannelConsensusStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentRequest,
      com.ibc.core.channel.v1.QueryPacketCommitmentResponse> getPacketCommitmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitment",
      requestType = com.ibc.core.channel.v1.QueryPacketCommitmentRequest.class,
      responseType = com.ibc.core.channel.v1.QueryPacketCommitmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentRequest,
      com.ibc.core.channel.v1.QueryPacketCommitmentResponse> getPacketCommitmentMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentRequest, com.ibc.core.channel.v1.QueryPacketCommitmentResponse> getPacketCommitmentMethod;
    if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentMethod = QueryGrpc.getPacketCommitmentMethod) == null) {
          QueryGrpc.getPacketCommitmentMethod = getPacketCommitmentMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryPacketCommitmentRequest, com.ibc.core.channel.v1.QueryPacketCommitmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketCommitment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketCommitmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketCommitmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitment"))
              .build();
        }
      }
    }
    return getPacketCommitmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentsRequest,
      com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketCommitments",
      requestType = com.ibc.core.channel.v1.QueryPacketCommitmentsRequest.class,
      responseType = com.ibc.core.channel.v1.QueryPacketCommitmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentsRequest,
      com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketCommitmentsRequest, com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> getPacketCommitmentsMethod;
    if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketCommitmentsMethod = QueryGrpc.getPacketCommitmentsMethod) == null) {
          QueryGrpc.getPacketCommitmentsMethod = getPacketCommitmentsMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryPacketCommitmentsRequest, com.ibc.core.channel.v1.QueryPacketCommitmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketCommitments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketCommitmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketCommitmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketCommitments"))
              .build();
        }
      }
    }
    return getPacketCommitmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketReceiptRequest,
      com.ibc.core.channel.v1.QueryPacketReceiptResponse> getPacketReceiptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketReceipt",
      requestType = com.ibc.core.channel.v1.QueryPacketReceiptRequest.class,
      responseType = com.ibc.core.channel.v1.QueryPacketReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketReceiptRequest,
      com.ibc.core.channel.v1.QueryPacketReceiptResponse> getPacketReceiptMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketReceiptRequest, com.ibc.core.channel.v1.QueryPacketReceiptResponse> getPacketReceiptMethod;
    if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketReceiptMethod = QueryGrpc.getPacketReceiptMethod) == null) {
          QueryGrpc.getPacketReceiptMethod = getPacketReceiptMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryPacketReceiptRequest, com.ibc.core.channel.v1.QueryPacketReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketReceipt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketReceiptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketReceiptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketReceipt"))
              .build();
        }
      }
    }
    return getPacketReceiptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest,
      com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgement",
      requestType = com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest.class,
      responseType = com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest,
      com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest, com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> getPacketAcknowledgementMethod;
    if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementMethod = QueryGrpc.getPacketAcknowledgementMethod) == null) {
          QueryGrpc.getPacketAcknowledgementMethod = getPacketAcknowledgementMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest, com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketAcknowledgement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgement"))
              .build();
        }
      }
    }
    return getPacketAcknowledgementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest,
      com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PacketAcknowledgements",
      requestType = com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest.class,
      responseType = com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest,
      com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest, com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> getPacketAcknowledgementsMethod;
    if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getPacketAcknowledgementsMethod = QueryGrpc.getPacketAcknowledgementsMethod) == null) {
          QueryGrpc.getPacketAcknowledgementsMethod = getPacketAcknowledgementsMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest, com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PacketAcknowledgements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("PacketAcknowledgements"))
              .build();
        }
      }
    }
    return getPacketAcknowledgementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest,
      com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedPackets",
      requestType = com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest.class,
      responseType = com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest,
      com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest, com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> getUnreceivedPacketsMethod;
    if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedPacketsMethod = QueryGrpc.getUnreceivedPacketsMethod) == null) {
          QueryGrpc.getUnreceivedPacketsMethod = getUnreceivedPacketsMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest, com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnreceivedPackets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedPackets"))
              .build();
        }
      }
    }
    return getUnreceivedPacketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedAcksRequest,
      com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnreceivedAcks",
      requestType = com.ibc.core.channel.v1.QueryUnreceivedAcksRequest.class,
      responseType = com.ibc.core.channel.v1.QueryUnreceivedAcksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedAcksRequest,
      com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryUnreceivedAcksRequest, com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> getUnreceivedAcksMethod;
    if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnreceivedAcksMethod = QueryGrpc.getUnreceivedAcksMethod) == null) {
          QueryGrpc.getUnreceivedAcksMethod = getUnreceivedAcksMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryUnreceivedAcksRequest, com.ibc.core.channel.v1.QueryUnreceivedAcksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnreceivedAcks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryUnreceivedAcksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryUnreceivedAcksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnreceivedAcks"))
              .build();
        }
      }
    }
    return getUnreceivedAcksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest,
      com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> getNextSequenceReceiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextSequenceReceive",
      requestType = com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest.class,
      responseType = com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest,
      com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> getNextSequenceReceiveMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest, com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> getNextSequenceReceiveMethod;
    if ((getNextSequenceReceiveMethod = QueryGrpc.getNextSequenceReceiveMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNextSequenceReceiveMethod = QueryGrpc.getNextSequenceReceiveMethod) == null) {
          QueryGrpc.getNextSequenceReceiveMethod = getNextSequenceReceiveMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest, com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextSequenceReceive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NextSequenceReceive"))
              .build();
        }
      }
    }
    return getNextSequenceReceiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceSendRequest,
      com.ibc.core.channel.v1.QueryNextSequenceSendResponse> getNextSequenceSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NextSequenceSend",
      requestType = com.ibc.core.channel.v1.QueryNextSequenceSendRequest.class,
      responseType = com.ibc.core.channel.v1.QueryNextSequenceSendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceSendRequest,
      com.ibc.core.channel.v1.QueryNextSequenceSendResponse> getNextSequenceSendMethod() {
    io.grpc.MethodDescriptor<com.ibc.core.channel.v1.QueryNextSequenceSendRequest, com.ibc.core.channel.v1.QueryNextSequenceSendResponse> getNextSequenceSendMethod;
    if ((getNextSequenceSendMethod = QueryGrpc.getNextSequenceSendMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getNextSequenceSendMethod = QueryGrpc.getNextSequenceSendMethod) == null) {
          QueryGrpc.getNextSequenceSendMethod = getNextSequenceSendMethod =
              io.grpc.MethodDescriptor.<com.ibc.core.channel.v1.QueryNextSequenceSendRequest, com.ibc.core.channel.v1.QueryNextSequenceSendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NextSequenceSend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryNextSequenceSendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibc.core.channel.v1.QueryNextSequenceSendResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("NextSequenceSend"))
              .build();
        }
      }
    }
    return getNextSequenceSendMethod;
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
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Channel queries an IBC Channel.
     * </pre>
     */
    default void channel(com.ibc.core.channel.v1.QueryChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Channels queries all the IBC channels of a chain.
     * </pre>
     */
    default void channels(com.ibc.core.channel.v1.QueryChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConnectionChannels queries all the channels associated with a connection
     * end.
     * </pre>
     */
    default void connectionChannels(com.ibc.core.channel.v1.QueryConnectionChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryConnectionChannelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectionChannelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelClientState queries for the client state for the channel associated
     * with the provided channel identifiers.
     * </pre>
     */
    default void channelClientState(com.ibc.core.channel.v1.QueryChannelClientStateRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelClientStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelClientStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * ChannelConsensusState queries for the consensus state for the channel
     * associated with the provided channel identifiers.
     * </pre>
     */
    default void channelConsensusState(com.ibc.core.channel.v1.QueryChannelConsensusStateRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChannelConsensusStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    default void packetCommitment(com.ibc.core.channel.v1.QueryPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketCommitmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * with a channel.
     * </pre>
     */
    default void packetCommitments(com.ibc.core.channel.v1.QueryPacketCommitmentsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketCommitmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the
     * queried chain
     * </pre>
     */
    default void packetReceipt(com.ibc.core.channel.v1.QueryPacketReceiptRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketReceiptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketReceiptMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    default void packetAcknowledgement(com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketAcknowledgementMethod(), responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * with a channel.
     * </pre>
     */
    default void packetAcknowledgements(com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPacketAcknowledgementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived IBC packets associated with a
     * channel and sequences.
     * </pre>
     */
    default void unreceivedPackets(com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnreceivedPacketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived IBC acknowledgements associated
     * with a channel and sequences.
     * </pre>
     */
    default void unreceivedAcks(com.ibc.core.channel.v1.QueryUnreceivedAcksRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnreceivedAcksMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextSequenceReceive returns the next receive sequence for a given channel.
     * </pre>
     */
    default void nextSequenceReceive(com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextSequenceReceiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * NextSequenceSend returns the next send sequence for a given channel.
     * </pre>
     */
    default void nextSequenceSend(com.ibc.core.channel.v1.QueryNextSequenceSendRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceSendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNextSequenceSendMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
   * Query provides defines the gRPC querier service
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
     * Channel queries an IBC Channel.
     * </pre>
     */
    public void channel(com.ibc.core.channel.v1.QueryChannelRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Channels queries all the IBC channels of a chain.
     * </pre>
     */
    public void channels(com.ibc.core.channel.v1.QueryChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConnectionChannels queries all the channels associated with a connection
     * end.
     * </pre>
     */
    public void connectionChannels(com.ibc.core.channel.v1.QueryConnectionChannelsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryConnectionChannelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConnectionChannelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelClientState queries for the client state for the channel associated
     * with the provided channel identifiers.
     * </pre>
     */
    public void channelClientState(com.ibc.core.channel.v1.QueryChannelClientStateRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelClientStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelClientStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ChannelConsensusState queries for the consensus state for the channel
     * associated with the provided channel identifiers.
     * </pre>
     */
    public void channelConsensusState(com.ibc.core.channel.v1.QueryChannelConsensusStateRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChannelConsensusStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public void packetCommitment(com.ibc.core.channel.v1.QueryPacketCommitmentRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * with a channel.
     * </pre>
     */
    public void packetCommitments(com.ibc.core.channel.v1.QueryPacketCommitmentsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the
     * queried chain
     * </pre>
     */
    public void packetReceipt(com.ibc.core.channel.v1.QueryPacketReceiptRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketReceiptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public void packetAcknowledgement(com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * with a channel.
     * </pre>
     */
    public void packetAcknowledgements(com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived IBC packets associated with a
     * channel and sequences.
     * </pre>
     */
    public void unreceivedPackets(com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived IBC acknowledgements associated
     * with a channel and sequences.
     * </pre>
     */
    public void unreceivedAcks(com.ibc.core.channel.v1.QueryUnreceivedAcksRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextSequenceReceive returns the next receive sequence for a given channel.
     * </pre>
     */
    public void nextSequenceReceive(com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextSequenceReceiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NextSequenceSend returns the next send sequence for a given channel.
     * </pre>
     */
    public void nextSequenceSend(com.ibc.core.channel.v1.QueryNextSequenceSendRequest request,
        io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceSendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNextSequenceSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Channel queries an IBC Channel.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryChannelResponse channel(com.ibc.core.channel.v1.QueryChannelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Channels queries all the IBC channels of a chain.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryChannelsResponse channels(com.ibc.core.channel.v1.QueryChannelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConnectionChannels queries all the channels associated with a connection
     * end.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryConnectionChannelsResponse connectionChannels(com.ibc.core.channel.v1.QueryConnectionChannelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConnectionChannelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelClientState queries for the client state for the channel associated
     * with the provided channel identifiers.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryChannelClientStateResponse channelClientState(com.ibc.core.channel.v1.QueryChannelClientStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelClientStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ChannelConsensusState queries for the consensus state for the channel
     * associated with the provided channel identifiers.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryChannelConsensusStateResponse channelConsensusState(com.ibc.core.channel.v1.QueryChannelConsensusStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChannelConsensusStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryPacketCommitmentResponse packetCommitment(com.ibc.core.channel.v1.QueryPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketCommitmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * with a channel.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryPacketCommitmentsResponse packetCommitments(com.ibc.core.channel.v1.QueryPacketCommitmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketCommitmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the
     * queried chain
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryPacketReceiptResponse packetReceipt(com.ibc.core.channel.v1.QueryPacketReceiptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketReceiptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse packetAcknowledgement(com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketAcknowledgementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * with a channel.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse packetAcknowledgements(com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPacketAcknowledgementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived IBC packets associated with a
     * channel and sequences.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse unreceivedPackets(com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnreceivedPacketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived IBC acknowledgements associated
     * with a channel and sequences.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryUnreceivedAcksResponse unreceivedAcks(com.ibc.core.channel.v1.QueryUnreceivedAcksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnreceivedAcksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextSequenceReceive returns the next receive sequence for a given channel.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse nextSequenceReceive(com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextSequenceReceiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NextSequenceSend returns the next send sequence for a given channel.
     * </pre>
     */
    public com.ibc.core.channel.v1.QueryNextSequenceSendResponse nextSequenceSend(com.ibc.core.channel.v1.QueryNextSequenceSendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNextSequenceSendMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query provides defines the gRPC querier service
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
     * Channel queries an IBC Channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryChannelResponse> channel(
        com.ibc.core.channel.v1.QueryChannelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Channels queries all the IBC channels of a chain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryChannelsResponse> channels(
        com.ibc.core.channel.v1.QueryChannelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConnectionChannels queries all the channels associated with a connection
     * end.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryConnectionChannelsResponse> connectionChannels(
        com.ibc.core.channel.v1.QueryConnectionChannelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConnectionChannelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelClientState queries for the client state for the channel associated
     * with the provided channel identifiers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryChannelClientStateResponse> channelClientState(
        com.ibc.core.channel.v1.QueryChannelClientStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelClientStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ChannelConsensusState queries for the consensus state for the channel
     * associated with the provided channel identifiers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryChannelConsensusStateResponse> channelConsensusState(
        com.ibc.core.channel.v1.QueryChannelConsensusStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChannelConsensusStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketCommitment queries a stored packet commitment hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryPacketCommitmentResponse> packetCommitment(
        com.ibc.core.channel.v1.QueryPacketCommitmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketCommitmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketCommitments returns all the packet commitments hashes associated
     * with a channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryPacketCommitmentsResponse> packetCommitments(
        com.ibc.core.channel.v1.QueryPacketCommitmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketCommitmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketReceipt queries if a given packet sequence has been received on the
     * queried chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryPacketReceiptResponse> packetReceipt(
        com.ibc.core.channel.v1.QueryPacketReceiptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketReceiptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgement queries a stored packet acknowledgement hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse> packetAcknowledgement(
        com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PacketAcknowledgements returns all the packet acknowledgements associated
     * with a channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse> packetAcknowledgements(
        com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPacketAcknowledgementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedPackets returns all the unreceived IBC packets associated with a
     * channel and sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse> unreceivedPackets(
        com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnreceivedPacketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnreceivedAcks returns all the unreceived IBC acknowledgements associated
     * with a channel and sequences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryUnreceivedAcksResponse> unreceivedAcks(
        com.ibc.core.channel.v1.QueryUnreceivedAcksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnreceivedAcksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextSequenceReceive returns the next receive sequence for a given channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse> nextSequenceReceive(
        com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextSequenceReceiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NextSequenceSend returns the next send sequence for a given channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibc.core.channel.v1.QueryNextSequenceSendResponse> nextSequenceSend(
        com.ibc.core.channel.v1.QueryNextSequenceSendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNextSequenceSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHANNEL = 0;
  private static final int METHODID_CHANNELS = 1;
  private static final int METHODID_CONNECTION_CHANNELS = 2;
  private static final int METHODID_CHANNEL_CLIENT_STATE = 3;
  private static final int METHODID_CHANNEL_CONSENSUS_STATE = 4;
  private static final int METHODID_PACKET_COMMITMENT = 5;
  private static final int METHODID_PACKET_COMMITMENTS = 6;
  private static final int METHODID_PACKET_RECEIPT = 7;
  private static final int METHODID_PACKET_ACKNOWLEDGEMENT = 8;
  private static final int METHODID_PACKET_ACKNOWLEDGEMENTS = 9;
  private static final int METHODID_UNRECEIVED_PACKETS = 10;
  private static final int METHODID_UNRECEIVED_ACKS = 11;
  private static final int METHODID_NEXT_SEQUENCE_RECEIVE = 12;
  private static final int METHODID_NEXT_SEQUENCE_SEND = 13;

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
        case METHODID_CHANNEL:
          serviceImpl.channel((com.ibc.core.channel.v1.QueryChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelResponse>) responseObserver);
          break;
        case METHODID_CHANNELS:
          serviceImpl.channels((com.ibc.core.channel.v1.QueryChannelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelsResponse>) responseObserver);
          break;
        case METHODID_CONNECTION_CHANNELS:
          serviceImpl.connectionChannels((com.ibc.core.channel.v1.QueryConnectionChannelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryConnectionChannelsResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CLIENT_STATE:
          serviceImpl.channelClientState((com.ibc.core.channel.v1.QueryChannelClientStateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelClientStateResponse>) responseObserver);
          break;
        case METHODID_CHANNEL_CONSENSUS_STATE:
          serviceImpl.channelConsensusState((com.ibc.core.channel.v1.QueryChannelConsensusStateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryChannelConsensusStateResponse>) responseObserver);
          break;
        case METHODID_PACKET_COMMITMENT:
          serviceImpl.packetCommitment((com.ibc.core.channel.v1.QueryPacketCommitmentRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentResponse>) responseObserver);
          break;
        case METHODID_PACKET_COMMITMENTS:
          serviceImpl.packetCommitments((com.ibc.core.channel.v1.QueryPacketCommitmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketCommitmentsResponse>) responseObserver);
          break;
        case METHODID_PACKET_RECEIPT:
          serviceImpl.packetReceipt((com.ibc.core.channel.v1.QueryPacketReceiptRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketReceiptResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENT:
          serviceImpl.packetAcknowledgement((com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse>) responseObserver);
          break;
        case METHODID_PACKET_ACKNOWLEDGEMENTS:
          serviceImpl.packetAcknowledgements((com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_PACKETS:
          serviceImpl.unreceivedPackets((com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse>) responseObserver);
          break;
        case METHODID_UNRECEIVED_ACKS:
          serviceImpl.unreceivedAcks((com.ibc.core.channel.v1.QueryUnreceivedAcksRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryUnreceivedAcksResponse>) responseObserver);
          break;
        case METHODID_NEXT_SEQUENCE_RECEIVE:
          serviceImpl.nextSequenceReceive((com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse>) responseObserver);
          break;
        case METHODID_NEXT_SEQUENCE_SEND:
          serviceImpl.nextSequenceSend((com.ibc.core.channel.v1.QueryNextSequenceSendRequest) request,
              (io.grpc.stub.StreamObserver<com.ibc.core.channel.v1.QueryNextSequenceSendResponse>) responseObserver);
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
          getChannelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryChannelRequest,
              com.ibc.core.channel.v1.QueryChannelResponse>(
                service, METHODID_CHANNEL)))
        .addMethod(
          getChannelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryChannelsRequest,
              com.ibc.core.channel.v1.QueryChannelsResponse>(
                service, METHODID_CHANNELS)))
        .addMethod(
          getConnectionChannelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryConnectionChannelsRequest,
              com.ibc.core.channel.v1.QueryConnectionChannelsResponse>(
                service, METHODID_CONNECTION_CHANNELS)))
        .addMethod(
          getChannelClientStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryChannelClientStateRequest,
              com.ibc.core.channel.v1.QueryChannelClientStateResponse>(
                service, METHODID_CHANNEL_CLIENT_STATE)))
        .addMethod(
          getChannelConsensusStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryChannelConsensusStateRequest,
              com.ibc.core.channel.v1.QueryChannelConsensusStateResponse>(
                service, METHODID_CHANNEL_CONSENSUS_STATE)))
        .addMethod(
          getPacketCommitmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryPacketCommitmentRequest,
              com.ibc.core.channel.v1.QueryPacketCommitmentResponse>(
                service, METHODID_PACKET_COMMITMENT)))
        .addMethod(
          getPacketCommitmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryPacketCommitmentsRequest,
              com.ibc.core.channel.v1.QueryPacketCommitmentsResponse>(
                service, METHODID_PACKET_COMMITMENTS)))
        .addMethod(
          getPacketReceiptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryPacketReceiptRequest,
              com.ibc.core.channel.v1.QueryPacketReceiptResponse>(
                service, METHODID_PACKET_RECEIPT)))
        .addMethod(
          getPacketAcknowledgementMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryPacketAcknowledgementRequest,
              com.ibc.core.channel.v1.QueryPacketAcknowledgementResponse>(
                service, METHODID_PACKET_ACKNOWLEDGEMENT)))
        .addMethod(
          getPacketAcknowledgementsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryPacketAcknowledgementsRequest,
              com.ibc.core.channel.v1.QueryPacketAcknowledgementsResponse>(
                service, METHODID_PACKET_ACKNOWLEDGEMENTS)))
        .addMethod(
          getUnreceivedPacketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryUnreceivedPacketsRequest,
              com.ibc.core.channel.v1.QueryUnreceivedPacketsResponse>(
                service, METHODID_UNRECEIVED_PACKETS)))
        .addMethod(
          getUnreceivedAcksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryUnreceivedAcksRequest,
              com.ibc.core.channel.v1.QueryUnreceivedAcksResponse>(
                service, METHODID_UNRECEIVED_ACKS)))
        .addMethod(
          getNextSequenceReceiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryNextSequenceReceiveRequest,
              com.ibc.core.channel.v1.QueryNextSequenceReceiveResponse>(
                service, METHODID_NEXT_SEQUENCE_RECEIVE)))
        .addMethod(
          getNextSequenceSendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ibc.core.channel.v1.QueryNextSequenceSendRequest,
              com.ibc.core.channel.v1.QueryNextSequenceSendResponse>(
                service, METHODID_NEXT_SEQUENCE_SEND)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ibc.core.channel.v1.QueryProto.getDescriptor();
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
              .addMethod(getChannelMethod())
              .addMethod(getChannelsMethod())
              .addMethod(getConnectionChannelsMethod())
              .addMethod(getChannelClientStateMethod())
              .addMethod(getChannelConsensusStateMethod())
              .addMethod(getPacketCommitmentMethod())
              .addMethod(getPacketCommitmentsMethod())
              .addMethod(getPacketReceiptMethod())
              .addMethod(getPacketAcknowledgementMethod())
              .addMethod(getPacketAcknowledgementsMethod())
              .addMethod(getUnreceivedPacketsMethod())
              .addMethod(getUnreceivedAcksMethod())
              .addMethod(getNextSequenceReceiveMethod())
              .addMethod(getNextSequenceSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
