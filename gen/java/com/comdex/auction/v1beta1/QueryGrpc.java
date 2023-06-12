package com.comdex.auction.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/auction/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "comdex.auction.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionRequest,
      com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> getQuerySurplusAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySurplusAuction",
      requestType = com.comdex.auction.v1beta1.QuerySurplusAuctionRequest.class,
      responseType = com.comdex.auction.v1beta1.QuerySurplusAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionRequest,
      com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> getQuerySurplusAuctionMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionRequest, com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> getQuerySurplusAuctionMethod;
    if ((getQuerySurplusAuctionMethod = QueryGrpc.getQuerySurplusAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySurplusAuctionMethod = QueryGrpc.getQuerySurplusAuctionMethod) == null) {
          QueryGrpc.getQuerySurplusAuctionMethod = getQuerySurplusAuctionMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QuerySurplusAuctionRequest, com.comdex.auction.v1beta1.QuerySurplusAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySurplusAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySurplusAuction"))
              .build();
        }
      }
    }
    return getQuerySurplusAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest,
      com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> getQuerySurplusAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySurplusAuctions",
      requestType = com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest.class,
      responseType = com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest,
      com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> getQuerySurplusAuctionsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest, com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> getQuerySurplusAuctionsMethod;
    if ((getQuerySurplusAuctionsMethod = QueryGrpc.getQuerySurplusAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySurplusAuctionsMethod = QueryGrpc.getQuerySurplusAuctionsMethod) == null) {
          QueryGrpc.getQuerySurplusAuctionsMethod = getQuerySurplusAuctionsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest, com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySurplusAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySurplusAuctions"))
              .build();
        }
      }
    }
    return getQuerySurplusAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest,
      com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> getQuerySurplusBiddingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QuerySurplusBiddings",
      requestType = com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest.class,
      responseType = com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest,
      com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> getQuerySurplusBiddingsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest, com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> getQuerySurplusBiddingsMethod;
    if ((getQuerySurplusBiddingsMethod = QueryGrpc.getQuerySurplusBiddingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQuerySurplusBiddingsMethod = QueryGrpc.getQuerySurplusBiddingsMethod) == null) {
          QueryGrpc.getQuerySurplusBiddingsMethod = getQuerySurplusBiddingsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest, com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QuerySurplusBiddings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QuerySurplusBiddings"))
              .build();
        }
      }
    }
    return getQuerySurplusBiddingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionRequest,
      com.comdex.auction.v1beta1.QueryDebtAuctionResponse> getQueryDebtAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDebtAuction",
      requestType = com.comdex.auction.v1beta1.QueryDebtAuctionRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDebtAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionRequest,
      com.comdex.auction.v1beta1.QueryDebtAuctionResponse> getQueryDebtAuctionMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionRequest, com.comdex.auction.v1beta1.QueryDebtAuctionResponse> getQueryDebtAuctionMethod;
    if ((getQueryDebtAuctionMethod = QueryGrpc.getQueryDebtAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDebtAuctionMethod = QueryGrpc.getQueryDebtAuctionMethod) == null) {
          QueryGrpc.getQueryDebtAuctionMethod = getQueryDebtAuctionMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDebtAuctionRequest, com.comdex.auction.v1beta1.QueryDebtAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDebtAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDebtAuction"))
              .build();
        }
      }
    }
    return getQueryDebtAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> getQueryDebtAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDebtAuctions",
      requestType = com.comdex.auction.v1beta1.QueryDebtAuctionsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDebtAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> getQueryDebtAuctionsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtAuctionsRequest, com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> getQueryDebtAuctionsMethod;
    if ((getQueryDebtAuctionsMethod = QueryGrpc.getQueryDebtAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDebtAuctionsMethod = QueryGrpc.getQueryDebtAuctionsMethod) == null) {
          QueryGrpc.getQueryDebtAuctionsMethod = getQueryDebtAuctionsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDebtAuctionsRequest, com.comdex.auction.v1beta1.QueryDebtAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDebtAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDebtAuctions"))
              .build();
        }
      }
    }
    return getQueryDebtAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> getQueryDebtBiddingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDebtBiddings",
      requestType = com.comdex.auction.v1beta1.QueryDebtBiddingsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDebtBiddingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> getQueryDebtBiddingsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDebtBiddingsRequest, com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> getQueryDebtBiddingsMethod;
    if ((getQueryDebtBiddingsMethod = QueryGrpc.getQueryDebtBiddingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDebtBiddingsMethod = QueryGrpc.getQueryDebtBiddingsMethod) == null) {
          QueryGrpc.getQueryDebtBiddingsMethod = getQueryDebtBiddingsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDebtBiddingsRequest, com.comdex.auction.v1beta1.QueryDebtBiddingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDebtBiddings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtBiddingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDebtBiddingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDebtBiddings"))
              .build();
        }
      }
    }
    return getQueryDebtBiddingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionRequest,
      com.comdex.auction.v1beta1.QueryDutchAuctionResponse> getQueryDutchAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchAuction",
      requestType = com.comdex.auction.v1beta1.QueryDutchAuctionRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionRequest,
      com.comdex.auction.v1beta1.QueryDutchAuctionResponse> getQueryDutchAuctionMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionRequest, com.comdex.auction.v1beta1.QueryDutchAuctionResponse> getQueryDutchAuctionMethod;
    if ((getQueryDutchAuctionMethod = QueryGrpc.getQueryDutchAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchAuctionMethod = QueryGrpc.getQueryDutchAuctionMethod) == null) {
          QueryGrpc.getQueryDutchAuctionMethod = getQueryDutchAuctionMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchAuctionRequest, com.comdex.auction.v1beta1.QueryDutchAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchAuction"))
              .build();
        }
      }
    }
    return getQueryDutchAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> getQueryDutchAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchAuctions",
      requestType = com.comdex.auction.v1beta1.QueryDutchAuctionsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> getQueryDutchAuctionsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchAuctionsRequest, com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> getQueryDutchAuctionsMethod;
    if ((getQueryDutchAuctionsMethod = QueryGrpc.getQueryDutchAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchAuctionsMethod = QueryGrpc.getQueryDutchAuctionsMethod) == null) {
          QueryGrpc.getQueryDutchAuctionsMethod = getQueryDutchAuctionsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchAuctionsRequest, com.comdex.auction.v1beta1.QueryDutchAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchAuctions"))
              .build();
        }
      }
    }
    return getQueryDutchAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> getQueryDutchBiddingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchBiddings",
      requestType = com.comdex.auction.v1beta1.QueryDutchBiddingsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchBiddingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> getQueryDutchBiddingsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchBiddingsRequest, com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> getQueryDutchBiddingsMethod;
    if ((getQueryDutchBiddingsMethod = QueryGrpc.getQueryDutchBiddingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchBiddingsMethod = QueryGrpc.getQueryDutchBiddingsMethod) == null) {
          QueryGrpc.getQueryDutchBiddingsMethod = getQueryDutchBiddingsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchBiddingsRequest, com.comdex.auction.v1beta1.QueryDutchBiddingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchBiddings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchBiddingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchBiddingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchBiddings"))
              .build();
        }
      }
    }
    return getQueryDutchBiddingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest,
      com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> getQueryProtocolStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryProtocolStatistics",
      requestType = com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest,
      com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> getQueryProtocolStatisticsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest, com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> getQueryProtocolStatisticsMethod;
    if ((getQueryProtocolStatisticsMethod = QueryGrpc.getQueryProtocolStatisticsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryProtocolStatisticsMethod = QueryGrpc.getQueryProtocolStatisticsMethod) == null) {
          QueryGrpc.getQueryProtocolStatisticsMethod = getQueryProtocolStatisticsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest, com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryProtocolStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryProtocolStatistics"))
              .build();
        }
      }
    }
    return getQueryProtocolStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest,
      com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> getQueryGenericAuctionParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryGenericAuctionParams",
      requestType = com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest,
      com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> getQueryGenericAuctionParamsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest, com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> getQueryGenericAuctionParamsMethod;
    if ((getQueryGenericAuctionParamsMethod = QueryGrpc.getQueryGenericAuctionParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryGenericAuctionParamsMethod = QueryGrpc.getQueryGenericAuctionParamsMethod) == null) {
          QueryGrpc.getQueryGenericAuctionParamsMethod = getQueryGenericAuctionParamsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest, com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryGenericAuctionParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryGenericAuctionParams"))
              .build();
        }
      }
    }
    return getQueryGenericAuctionParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest,
      com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> getQueryDutchLendAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchLendAuction",
      requestType = com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest,
      com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> getQueryDutchLendAuctionMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest, com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> getQueryDutchLendAuctionMethod;
    if ((getQueryDutchLendAuctionMethod = QueryGrpc.getQueryDutchLendAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchLendAuctionMethod = QueryGrpc.getQueryDutchLendAuctionMethod) == null) {
          QueryGrpc.getQueryDutchLendAuctionMethod = getQueryDutchLendAuctionMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest, com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchLendAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchLendAuction"))
              .build();
        }
      }
    }
    return getQueryDutchLendAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> getQueryDutchLendAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchLendAuctions",
      requestType = com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest,
      com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> getQueryDutchLendAuctionsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest, com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> getQueryDutchLendAuctionsMethod;
    if ((getQueryDutchLendAuctionsMethod = QueryGrpc.getQueryDutchLendAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchLendAuctionsMethod = QueryGrpc.getQueryDutchLendAuctionsMethod) == null) {
          QueryGrpc.getQueryDutchLendAuctionsMethod = getQueryDutchLendAuctionsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest, com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchLendAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchLendAuctions"))
              .build();
        }
      }
    }
    return getQueryDutchLendAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> getQueryDutchLendBiddingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDutchLendBiddings",
      requestType = com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest,
      com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> getQueryDutchLendBiddingsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest, com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> getQueryDutchLendBiddingsMethod;
    if ((getQueryDutchLendBiddingsMethod = QueryGrpc.getQueryDutchLendBiddingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryDutchLendBiddingsMethod = QueryGrpc.getQueryDutchLendBiddingsMethod) == null) {
          QueryGrpc.getQueryDutchLendBiddingsMethod = getQueryDutchLendBiddingsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest, com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDutchLendBiddings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryDutchLendBiddings"))
              .build();
        }
      }
    }
    return getQueryDutchLendBiddingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest,
      com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> getQueryFilterDutchAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryFilterDutchAuctions",
      requestType = com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest.class,
      responseType = com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest,
      com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> getQueryFilterDutchAuctionsMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest, com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> getQueryFilterDutchAuctionsMethod;
    if ((getQueryFilterDutchAuctionsMethod = QueryGrpc.getQueryFilterDutchAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getQueryFilterDutchAuctionsMethod = QueryGrpc.getQueryFilterDutchAuctionsMethod) == null) {
          QueryGrpc.getQueryFilterDutchAuctionsMethod = getQueryFilterDutchAuctionsMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest, com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryFilterDutchAuctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("QueryFilterDutchAuctions"))
              .build();
        }
      }
    }
    return getQueryFilterDutchAuctionsMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void querySurplusAuction(com.comdex.auction.v1beta1.QuerySurplusAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySurplusAuctionMethod(), responseObserver);
    }

    /**
     */
    default void querySurplusAuctions(com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySurplusAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void querySurplusBiddings(com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQuerySurplusBiddingsMethod(), responseObserver);
    }

    /**
     */
    default void queryDebtAuction(com.comdex.auction.v1beta1.QueryDebtAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDebtAuctionMethod(), responseObserver);
    }

    /**
     */
    default void queryDebtAuctions(com.comdex.auction.v1beta1.QueryDebtAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDebtAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void queryDebtBiddings(com.comdex.auction.v1beta1.QueryDebtBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDebtBiddingsMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchAuction(com.comdex.auction.v1beta1.QueryDutchAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchAuctionMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchAuctions(com.comdex.auction.v1beta1.QueryDutchAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchBiddings(com.comdex.auction.v1beta1.QueryDutchBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchBiddingsMethod(), responseObserver);
    }

    /**
     */
    default void queryProtocolStatistics(com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryProtocolStatisticsMethod(), responseObserver);
    }

    /**
     */
    default void queryGenericAuctionParams(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryGenericAuctionParamsMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchLendAuction(com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchLendAuctionMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchLendAuctions(com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchLendAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void queryDutchLendBiddings(com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDutchLendBiddingsMethod(), responseObserver);
    }

    /**
     */
    default void queryFilterDutchAuctions(com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryFilterDutchAuctionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
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
     */
    public void querySurplusAuction(com.comdex.auction.v1beta1.QuerySurplusAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySurplusAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySurplusAuctions(com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySurplusAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querySurplusBiddings(com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQuerySurplusBiddingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDebtAuction(com.comdex.auction.v1beta1.QueryDebtAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDebtAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDebtAuctions(com.comdex.auction.v1beta1.QueryDebtAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDebtAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDebtBiddings(com.comdex.auction.v1beta1.QueryDebtBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDebtBiddingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchAuction(com.comdex.auction.v1beta1.QueryDutchAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchAuctions(com.comdex.auction.v1beta1.QueryDutchAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchBiddings(com.comdex.auction.v1beta1.QueryDutchBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchBiddingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryProtocolStatistics(com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryProtocolStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryGenericAuctionParams(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryGenericAuctionParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchLendAuction(com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchLendAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchLendAuctions(com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchLendAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDutchLendBiddings(com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDutchLendBiddingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryFilterDutchAuctions(com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryFilterDutchAuctionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
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
     */
    public com.comdex.auction.v1beta1.QuerySurplusAuctionResponse querySurplusAuction(com.comdex.auction.v1beta1.QuerySurplusAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySurplusAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse querySurplusAuctions(com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySurplusAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse querySurplusBiddings(com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQuerySurplusBiddingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDebtAuctionResponse queryDebtAuction(com.comdex.auction.v1beta1.QueryDebtAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDebtAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDebtAuctionsResponse queryDebtAuctions(com.comdex.auction.v1beta1.QueryDebtAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDebtAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDebtBiddingsResponse queryDebtBiddings(com.comdex.auction.v1beta1.QueryDebtBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDebtBiddingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchAuctionResponse queryDutchAuction(com.comdex.auction.v1beta1.QueryDutchAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchAuctionsResponse queryDutchAuctions(com.comdex.auction.v1beta1.QueryDutchAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchBiddingsResponse queryDutchBiddings(com.comdex.auction.v1beta1.QueryDutchBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchBiddingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse queryProtocolStatistics(com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryProtocolStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse queryGenericAuctionParams(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryGenericAuctionParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse queryDutchLendAuction(com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchLendAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse queryDutchLendAuctions(com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchLendAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse queryDutchLendBiddings(com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDutchLendBiddingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse queryFilterDutchAuctions(com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryFilterDutchAuctionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QuerySurplusAuctionResponse> querySurplusAuction(
        com.comdex.auction.v1beta1.QuerySurplusAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySurplusAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse> querySurplusAuctions(
        com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySurplusAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse> querySurplusBiddings(
        com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQuerySurplusBiddingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDebtAuctionResponse> queryDebtAuction(
        com.comdex.auction.v1beta1.QueryDebtAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDebtAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDebtAuctionsResponse> queryDebtAuctions(
        com.comdex.auction.v1beta1.QueryDebtAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDebtAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDebtBiddingsResponse> queryDebtBiddings(
        com.comdex.auction.v1beta1.QueryDebtBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDebtBiddingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchAuctionResponse> queryDutchAuction(
        com.comdex.auction.v1beta1.QueryDutchAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchAuctionsResponse> queryDutchAuctions(
        com.comdex.auction.v1beta1.QueryDutchAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchBiddingsResponse> queryDutchBiddings(
        com.comdex.auction.v1beta1.QueryDutchBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchBiddingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse> queryProtocolStatistics(
        com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryProtocolStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse> queryGenericAuctionParams(
        com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryGenericAuctionParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse> queryDutchLendAuction(
        com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchLendAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse> queryDutchLendAuctions(
        com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchLendAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse> queryDutchLendBiddings(
        com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDutchLendBiddingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse> queryFilterDutchAuctions(
        com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryFilterDutchAuctionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_SURPLUS_AUCTION = 0;
  private static final int METHODID_QUERY_SURPLUS_AUCTIONS = 1;
  private static final int METHODID_QUERY_SURPLUS_BIDDINGS = 2;
  private static final int METHODID_QUERY_DEBT_AUCTION = 3;
  private static final int METHODID_QUERY_DEBT_AUCTIONS = 4;
  private static final int METHODID_QUERY_DEBT_BIDDINGS = 5;
  private static final int METHODID_QUERY_DUTCH_AUCTION = 6;
  private static final int METHODID_QUERY_DUTCH_AUCTIONS = 7;
  private static final int METHODID_QUERY_DUTCH_BIDDINGS = 8;
  private static final int METHODID_QUERY_PROTOCOL_STATISTICS = 9;
  private static final int METHODID_QUERY_GENERIC_AUCTION_PARAMS = 10;
  private static final int METHODID_QUERY_DUTCH_LEND_AUCTION = 11;
  private static final int METHODID_QUERY_DUTCH_LEND_AUCTIONS = 12;
  private static final int METHODID_QUERY_DUTCH_LEND_BIDDINGS = 13;
  private static final int METHODID_QUERY_FILTER_DUTCH_AUCTIONS = 14;

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
        case METHODID_QUERY_SURPLUS_AUCTION:
          serviceImpl.querySurplusAuction((com.comdex.auction.v1beta1.QuerySurplusAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_SURPLUS_AUCTIONS:
          serviceImpl.querySurplusAuctions((com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_SURPLUS_BIDDINGS:
          serviceImpl.querySurplusBiddings((com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEBT_AUCTION:
          serviceImpl.queryDebtAuction((com.comdex.auction.v1beta1.QueryDebtAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEBT_AUCTIONS:
          serviceImpl.queryDebtAuctions((com.comdex.auction.v1beta1.QueryDebtAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_DEBT_BIDDINGS:
          serviceImpl.queryDebtBiddings((com.comdex.auction.v1beta1.QueryDebtBiddingsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDebtBiddingsResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_AUCTION:
          serviceImpl.queryDutchAuction((com.comdex.auction.v1beta1.QueryDutchAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_AUCTIONS:
          serviceImpl.queryDutchAuctions((com.comdex.auction.v1beta1.QueryDutchAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_BIDDINGS:
          serviceImpl.queryDutchBiddings((com.comdex.auction.v1beta1.QueryDutchBiddingsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchBiddingsResponse>) responseObserver);
          break;
        case METHODID_QUERY_PROTOCOL_STATISTICS:
          serviceImpl.queryProtocolStatistics((com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse>) responseObserver);
          break;
        case METHODID_QUERY_GENERIC_AUCTION_PARAMS:
          serviceImpl.queryGenericAuctionParams((com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_LEND_AUCTION:
          serviceImpl.queryDutchLendAuction((com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_LEND_AUCTIONS:
          serviceImpl.queryDutchLendAuctions((com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse>) responseObserver);
          break;
        case METHODID_QUERY_DUTCH_LEND_BIDDINGS:
          serviceImpl.queryDutchLendBiddings((com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse>) responseObserver);
          break;
        case METHODID_QUERY_FILTER_DUTCH_AUCTIONS:
          serviceImpl.queryFilterDutchAuctions((com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse>) responseObserver);
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
          getQuerySurplusAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QuerySurplusAuctionRequest,
              com.comdex.auction.v1beta1.QuerySurplusAuctionResponse>(
                service, METHODID_QUERY_SURPLUS_AUCTION)))
        .addMethod(
          getQuerySurplusAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QuerySurplusAuctionsRequest,
              com.comdex.auction.v1beta1.QuerySurplusAuctionsResponse>(
                service, METHODID_QUERY_SURPLUS_AUCTIONS)))
        .addMethod(
          getQuerySurplusBiddingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QuerySurplusBiddingsRequest,
              com.comdex.auction.v1beta1.QuerySurplusBiddingsResponse>(
                service, METHODID_QUERY_SURPLUS_BIDDINGS)))
        .addMethod(
          getQueryDebtAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDebtAuctionRequest,
              com.comdex.auction.v1beta1.QueryDebtAuctionResponse>(
                service, METHODID_QUERY_DEBT_AUCTION)))
        .addMethod(
          getQueryDebtAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDebtAuctionsRequest,
              com.comdex.auction.v1beta1.QueryDebtAuctionsResponse>(
                service, METHODID_QUERY_DEBT_AUCTIONS)))
        .addMethod(
          getQueryDebtBiddingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDebtBiddingsRequest,
              com.comdex.auction.v1beta1.QueryDebtBiddingsResponse>(
                service, METHODID_QUERY_DEBT_BIDDINGS)))
        .addMethod(
          getQueryDutchAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchAuctionRequest,
              com.comdex.auction.v1beta1.QueryDutchAuctionResponse>(
                service, METHODID_QUERY_DUTCH_AUCTION)))
        .addMethod(
          getQueryDutchAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchAuctionsRequest,
              com.comdex.auction.v1beta1.QueryDutchAuctionsResponse>(
                service, METHODID_QUERY_DUTCH_AUCTIONS)))
        .addMethod(
          getQueryDutchBiddingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchBiddingsRequest,
              com.comdex.auction.v1beta1.QueryDutchBiddingsResponse>(
                service, METHODID_QUERY_DUTCH_BIDDINGS)))
        .addMethod(
          getQueryProtocolStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryProtocolStatisticsRequest,
              com.comdex.auction.v1beta1.QueryProtocolStatisticsResponse>(
                service, METHODID_QUERY_PROTOCOL_STATISTICS)))
        .addMethod(
          getQueryGenericAuctionParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest,
              com.comdex.auction.v1beta1.QueryGenericAuctionParamResponse>(
                service, METHODID_QUERY_GENERIC_AUCTION_PARAMS)))
        .addMethod(
          getQueryDutchLendAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchLendAuctionRequest,
              com.comdex.auction.v1beta1.QueryDutchLendAuctionResponse>(
                service, METHODID_QUERY_DUTCH_LEND_AUCTION)))
        .addMethod(
          getQueryDutchLendAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchLendAuctionsRequest,
              com.comdex.auction.v1beta1.QueryDutchLendAuctionsResponse>(
                service, METHODID_QUERY_DUTCH_LEND_AUCTIONS)))
        .addMethod(
          getQueryDutchLendBiddingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryDutchLendBiddingsRequest,
              com.comdex.auction.v1beta1.QueryDutchLendBiddingsResponse>(
                service, METHODID_QUERY_DUTCH_LEND_BIDDINGS)))
        .addMethod(
          getQueryFilterDutchAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.QueryFilterDutchAuctionsRequest,
              com.comdex.auction.v1beta1.QueryFilterDutchAuctionsResponse>(
                service, METHODID_QUERY_FILTER_DUTCH_AUCTIONS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.auction.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getQuerySurplusAuctionMethod())
              .addMethod(getQuerySurplusAuctionsMethod())
              .addMethod(getQuerySurplusBiddingsMethod())
              .addMethod(getQueryDebtAuctionMethod())
              .addMethod(getQueryDebtAuctionsMethod())
              .addMethod(getQueryDebtBiddingsMethod())
              .addMethod(getQueryDutchAuctionMethod())
              .addMethod(getQueryDutchAuctionsMethod())
              .addMethod(getQueryDutchBiddingsMethod())
              .addMethod(getQueryProtocolStatisticsMethod())
              .addMethod(getQueryGenericAuctionParamsMethod())
              .addMethod(getQueryDutchLendAuctionMethod())
              .addMethod(getQueryDutchLendAuctionsMethod())
              .addMethod(getQueryDutchLendBiddingsMethod())
              .addMethod(getQueryFilterDutchAuctionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
