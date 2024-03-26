package com.OmniFlix.marketplace.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/marketplace/v1beta1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.marketplace.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> getListingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Listings",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> getListingsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> getListingsMethod;
    if ((getListingsMethod = QueryGrpc.getListingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsMethod = QueryGrpc.getListingsMethod) == null) {
          QueryGrpc.getListingsMethod = getListingsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Listings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Listings"))
              .build();
        }
      }
    }
    return getListingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Listing",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingMethod;
    if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingMethod = QueryGrpc.getListingMethod) == null) {
          QueryGrpc.getListingMethod = getListingMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Listing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Listing"))
              .build();
        }
      }
    }
    return getListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> getListingsByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByOwner",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> getListingsByOwnerMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> getListingsByOwnerMethod;
    if ((getListingsByOwnerMethod = QueryGrpc.getListingsByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByOwnerMethod = QueryGrpc.getListingsByOwnerMethod) == null) {
          QueryGrpc.getListingsByOwnerMethod = getListingsByOwnerMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByOwner"))
              .build();
        }
      }
    }
    return getListingsByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> getListingsByPriceDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingsByPriceDenom",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> getListingsByPriceDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> getListingsByPriceDenomMethod;
    if ((getListingsByPriceDenomMethod = QueryGrpc.getListingsByPriceDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingsByPriceDenomMethod = QueryGrpc.getListingsByPriceDenomMethod) == null) {
          QueryGrpc.getListingsByPriceDenomMethod = getListingsByPriceDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingsByPriceDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingsByPriceDenom"))
              .build();
        }
      }
    }
    return getListingsByPriceDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingByNftIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListingByNftId",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingByNftIdMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> getListingByNftIdMethod;
    if ((getListingByNftIdMethod = QueryGrpc.getListingByNftIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getListingByNftIdMethod = QueryGrpc.getListingByNftIdMethod) == null) {
          QueryGrpc.getListingByNftIdMethod = getListingByNftIdMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListingByNftId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ListingByNftId"))
              .build();
        }
      }
    }
    return getListingByNftIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auctions",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsMethod;
    if ((getAuctionsMethod = QueryGrpc.getAuctionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuctionsMethod = QueryGrpc.getAuctionsMethod) == null) {
          QueryGrpc.getAuctionsMethod = getAuctionsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auctions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Auctions"))
              .build();
        }
      }
    }
    return getAuctionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Auction",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionMethod;
    if ((getAuctionMethod = QueryGrpc.getAuctionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuctionMethod = QueryGrpc.getAuctionMethod) == null) {
          QueryGrpc.getAuctionMethod = getAuctionMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Auction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Auction"))
              .build();
        }
      }
    }
    return getAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuctionsByOwner",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByOwnerMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByOwnerMethod;
    if ((getAuctionsByOwnerMethod = QueryGrpc.getAuctionsByOwnerMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuctionsByOwnerMethod = QueryGrpc.getAuctionsByOwnerMethod) == null) {
          QueryGrpc.getAuctionsByOwnerMethod = getAuctionsByOwnerMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuctionsByOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AuctionsByOwner"))
              .build();
        }
      }
    }
    return getAuctionsByOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByPriceDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuctionsByPriceDenom",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByPriceDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> getAuctionsByPriceDenomMethod;
    if ((getAuctionsByPriceDenomMethod = QueryGrpc.getAuctionsByPriceDenomMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuctionsByPriceDenomMethod = QueryGrpc.getAuctionsByPriceDenomMethod) == null) {
          QueryGrpc.getAuctionsByPriceDenomMethod = getAuctionsByPriceDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuctionsByPriceDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AuctionsByPriceDenom"))
              .build();
        }
      }
    }
    return getAuctionsByPriceDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionByNftIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AuctionByNftId",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionByNftIdMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> getAuctionByNftIdMethod;
    if ((getAuctionByNftIdMethod = QueryGrpc.getAuctionByNftIdMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAuctionByNftIdMethod = QueryGrpc.getAuctionByNftIdMethod) == null) {
          QueryGrpc.getAuctionByNftIdMethod = getAuctionByNftIdMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AuctionByNftId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AuctionByNftId"))
              .build();
        }
      }
    }
    return getAuctionByNftIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bids",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> getBidsMethod;
    if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBidsMethod = QueryGrpc.getBidsMethod) == null) {
          QueryGrpc.getBidsMethod = getBidsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bids"))
              .build();
        }
      }
    }
    return getBidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> getBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bid",
      requestType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest.class,
      responseType = com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest,
      com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> getBidMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> getBidMethod;
    if ((getBidMethod = QueryGrpc.getBidMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBidMethod = QueryGrpc.getBidMethod) == null) {
          QueryGrpc.getBidMethod = getBidMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest, com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bid"))
              .build();
        }
      }
    }
    return getBidMethod;
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
     * <pre>
     * Params queries params of the marketplace module.
     * </pre>
     */
    default void params(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    /**
     */
    default void listings(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingsMethod(), responseObserver);
    }

    /**
     */
    default void listing(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingMethod(), responseObserver);
    }

    /**
     */
    default void listingsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingsByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void listingsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingsByPriceDenomMethod(), responseObserver);
    }

    /**
     */
    default void listingByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListingByNftIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * auction queries
     * </pre>
     */
    default void auctions(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuctionsMethod(), responseObserver);
    }

    /**
     */
    default void auction(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuctionMethod(), responseObserver);
    }

    /**
     */
    default void auctionsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuctionsByOwnerMethod(), responseObserver);
    }

    /**
     */
    default void auctionsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuctionsByPriceDenomMethod(), responseObserver);
    }

    /**
     */
    default void auctionByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAuctionByNftIdMethod(), responseObserver);
    }

    /**
     */
    default void bids(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBidsMethod(), responseObserver);
    }

    /**
     */
    default void bid(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBidMethod(), responseObserver);
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
     * <pre>
     * Params queries params of the marketplace module.
     * </pre>
     */
    public void params(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listings(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listing(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listingsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingsByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listingsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingsByPriceDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listingByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListingByNftIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * auction queries
     * </pre>
     */
    public void auctions(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuctionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void auction(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void auctionsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuctionsByOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void auctionsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuctionsByPriceDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void auctionByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAuctionByNftIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bids(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bid(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBidMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * Params queries params of the marketplace module.
     * </pre>
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse params(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse listings(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse listing(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse listingsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingsByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse listingsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingsByPriceDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse listingByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListingByNftIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * auction queries
     * </pre>
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse auctions(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuctionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse auction(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse auctionsByOwner(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuctionsByOwnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse auctionsByPriceDenom(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuctionsByPriceDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse auctionByNftId(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAuctionByNftIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse bids(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBidsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse bid(com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBidMethod(), getCallOptions(), request);
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
     * <pre>
     * Params queries params of the marketplace module.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse> params(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse> listings(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> listing(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse> listingsByOwner(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingsByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse> listingsByPriceDenom(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingsByPriceDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse> listingByNftId(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListingByNftIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * auction queries
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> auctions(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuctionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> auction(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> auctionsByOwner(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuctionsByOwnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse> auctionsByPriceDenom(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuctionsByPriceDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse> auctionByNftId(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAuctionByNftIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse> bids(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBidsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse> bid(
        com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARAMS = 0;
  private static final int METHODID_LISTINGS = 1;
  private static final int METHODID_LISTING = 2;
  private static final int METHODID_LISTINGS_BY_OWNER = 3;
  private static final int METHODID_LISTINGS_BY_PRICE_DENOM = 4;
  private static final int METHODID_LISTING_BY_NFT_ID = 5;
  private static final int METHODID_AUCTIONS = 6;
  private static final int METHODID_AUCTION = 7;
  private static final int METHODID_AUCTIONS_BY_OWNER = 8;
  private static final int METHODID_AUCTIONS_BY_PRICE_DENOM = 9;
  private static final int METHODID_AUCTION_BY_NFT_ID = 10;
  private static final int METHODID_BIDS = 11;
  private static final int METHODID_BID = 12;

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
          serviceImpl.params((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse>) responseObserver);
          break;
        case METHODID_LISTINGS:
          serviceImpl.listings((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse>) responseObserver);
          break;
        case METHODID_LISTING:
          serviceImpl.listing((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_OWNER:
          serviceImpl.listingsByOwner((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse>) responseObserver);
          break;
        case METHODID_LISTINGS_BY_PRICE_DENOM:
          serviceImpl.listingsByPriceDenom((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse>) responseObserver);
          break;
        case METHODID_LISTING_BY_NFT_ID:
          serviceImpl.listingByNftId((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>) responseObserver);
          break;
        case METHODID_AUCTIONS:
          serviceImpl.auctions((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>) responseObserver);
          break;
        case METHODID_AUCTION:
          serviceImpl.auction((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>) responseObserver);
          break;
        case METHODID_AUCTIONS_BY_OWNER:
          serviceImpl.auctionsByOwner((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>) responseObserver);
          break;
        case METHODID_AUCTIONS_BY_PRICE_DENOM:
          serviceImpl.auctionsByPriceDenom((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>) responseObserver);
          break;
        case METHODID_AUCTION_BY_NFT_ID:
          serviceImpl.auctionByNftId((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>) responseObserver);
          break;
        case METHODID_BIDS:
          serviceImpl.bids((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse>) responseObserver);
          break;
        case METHODID_BID:
          serviceImpl.bid((com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse>) responseObserver);
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
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryParamsResponse>(
                service, METHODID_PARAMS)))
        .addMethod(
          getListingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsResponse>(
                service, METHODID_LISTINGS)))
        .addMethod(
          getListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>(
                service, METHODID_LISTING)))
        .addMethod(
          getListingsByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByOwnerResponse>(
                service, METHODID_LISTINGS_BY_OWNER)))
        .addMethod(
          getListingsByPriceDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingsByPriceDenomResponse>(
                service, METHODID_LISTINGS_BY_PRICE_DENOM)))
        .addMethod(
          getListingByNftIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingByNFTIDRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryListingResponse>(
                service, METHODID_LISTING_BY_NFT_ID)))
        .addMethod(
          getAuctionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>(
                service, METHODID_AUCTIONS)))
        .addMethod(
          getAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>(
                service, METHODID_AUCTION)))
        .addMethod(
          getAuctionsByOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByOwnerRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>(
                service, METHODID_AUCTIONS_BY_OWNER)))
        .addMethod(
          getAuctionsByPriceDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsByPriceDenomRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionsResponse>(
                service, METHODID_AUCTIONS_BY_PRICE_DENOM)))
        .addMethod(
          getAuctionByNftIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionByNFTIDRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryAuctionResponse>(
                service, METHODID_AUCTION_BY_NFT_ID)))
        .addMethod(
          getBidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidsResponse>(
                service, METHODID_BIDS)))
        .addMethod(
          getBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidRequest,
              com.OmniFlix.marketplace.v1beta1.QueryProto.QueryBidResponse>(
                service, METHODID_BID)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.marketplace.v1beta1.QueryProto.getDescriptor();
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
              .addMethod(getListingsMethod())
              .addMethod(getListingMethod())
              .addMethod(getListingsByOwnerMethod())
              .addMethod(getListingsByPriceDenomMethod())
              .addMethod(getListingByNftIdMethod())
              .addMethod(getAuctionsMethod())
              .addMethod(getAuctionMethod())
              .addMethod(getAuctionsByOwnerMethod())
              .addMethod(getAuctionsByPriceDenomMethod())
              .addMethod(getAuctionByNftIdMethod())
              .addMethod(getBidsMethod())
              .addMethod(getBidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
