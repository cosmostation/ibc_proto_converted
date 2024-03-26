package com.OmniFlix.marketplace.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/marketplace/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.marketplace.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> getListNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNFT",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> getListNFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> getListNFTMethod;
    if ((getListNFTMethod = MsgGrpc.getListNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getListNFTMethod = MsgGrpc.getListNFTMethod) == null) {
          MsgGrpc.getListNFTMethod = getListNFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ListNFT"))
              .build();
        }
      }
    }
    return getListNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> getEditListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditListing",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> getEditListingMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing, com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> getEditListingMethod;
    if ((getEditListingMethod = MsgGrpc.getEditListingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditListingMethod = MsgGrpc.getEditListingMethod) == null) {
          MsgGrpc.getEditListingMethod = getEditListingMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing, com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditListing"))
              .build();
        }
      }
    }
    return getEditListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> getDeListNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeListNFT",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> getDeListNFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> getDeListNFTMethod;
    if ((getDeListNFTMethod = MsgGrpc.getDeListNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeListNFTMethod = MsgGrpc.getDeListNFTMethod) == null) {
          MsgGrpc.getDeListNFTMethod = getDeListNFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeListNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeListNFT"))
              .build();
        }
      }
    }
    return getDeListNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> getBuyNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyNFT",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> getBuyNFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> getBuyNFTMethod;
    if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyNFTMethod = MsgGrpc.getBuyNFTMethod) == null) {
          MsgGrpc.getBuyNFTMethod = getBuyNFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT, com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BuyNFT"))
              .build();
        }
      }
    }
    return getBuyNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> getCreateAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuction",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> getCreateAuctionMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction, com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> getCreateAuctionMethod;
    if ((getCreateAuctionMethod = MsgGrpc.getCreateAuctionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateAuctionMethod = MsgGrpc.getCreateAuctionMethod) == null) {
          MsgGrpc.getCreateAuctionMethod = getCreateAuctionMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction, com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateAuction"))
              .build();
        }
      }
    }
    return getCreateAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> getCancelAuctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelAuction",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> getCancelAuctionMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction, com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> getCancelAuctionMethod;
    if ((getCancelAuctionMethod = MsgGrpc.getCancelAuctionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCancelAuctionMethod = MsgGrpc.getCancelAuctionMethod) == null) {
          MsgGrpc.getCancelAuctionMethod = getCancelAuctionMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction, com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelAuction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CancelAuction"))
              .build();
        }
      }
    }
    return getCancelAuctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlaceBid",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid, com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> getPlaceBidMethod;
    if ((getPlaceBidMethod = MsgGrpc.getPlaceBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPlaceBidMethod = MsgGrpc.getPlaceBidMethod) == null) {
          MsgGrpc.getPlaceBidMethod = getPlaceBidMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid, com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlaceBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PlaceBid"))
              .build();
        }
      }
    }
    return getPlaceBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams.class,
      responseType = com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams,
      com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams, com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams, com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @java.lang.Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @java.lang.Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @java.lang.Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNFTMethod(), responseObserver);
    }

    /**
     */
    default void editListing(com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditListingMethod(), responseObserver);
    }

    /**
     */
    default void deListNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeListNFTMethod(), responseObserver);
    }

    /**
     */
    default void buyNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyNFTMethod(), responseObserver);
    }

    /**
     */
    default void createAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuctionMethod(), responseObserver);
    }

    /**
     */
    default void cancelAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelAuctionMethod(), responseObserver);
    }

    /**
     */
    default void placeBid(com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlaceBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/marketplace module
     * parameters. The authority is hard-coded to the x/marketplace module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   */
  public static final class MsgStub
      extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     */
    public void listNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editListing(com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deListNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeListNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelAuctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void placeBid(com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlaceBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/marketplace module
     * parameters. The authority is hard-coded to the x/marketplace module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   */
  public static final class MsgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse listNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse editListing(com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse deListNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeListNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse buyNFT(com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyNFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse createAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse cancelAuction(com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelAuctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse placeBid(com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlaceBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/marketplace module
     * parameters. The authority is hard-coded to the x/marketplace module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse updateParams(com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   */
  public static final class MsgFutureStub
      extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse> listNFT(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse> editListing(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse> deListNFT(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeListNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse> buyNFT(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyNFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse> createAuction(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse> cancelAuction(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelAuctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse> placeBid(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlaceBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the x/marketplace module
     * parameters. The authority is hard-coded to the x/marketplace module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NFT = 0;
  private static final int METHODID_EDIT_LISTING = 1;
  private static final int METHODID_DE_LIST_NFT = 2;
  private static final int METHODID_BUY_NFT = 3;
  private static final int METHODID_CREATE_AUCTION = 4;
  private static final int METHODID_CANCEL_AUCTION = 5;
  private static final int METHODID_PLACE_BID = 6;
  private static final int METHODID_UPDATE_PARAMS = 7;

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
        case METHODID_LIST_NFT:
          serviceImpl.listNFT((com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse>) responseObserver);
          break;
        case METHODID_EDIT_LISTING:
          serviceImpl.editListing((com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse>) responseObserver);
          break;
        case METHODID_DE_LIST_NFT:
          serviceImpl.deListNFT((com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse>) responseObserver);
          break;
        case METHODID_BUY_NFT:
          serviceImpl.buyNFT((com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUCTION:
          serviceImpl.createAuction((com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse>) responseObserver);
          break;
        case METHODID_CANCEL_AUCTION:
          serviceImpl.cancelAuction((com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse>) responseObserver);
          break;
        case METHODID_PLACE_BID:
          serviceImpl.placeBid((com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getListNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFT,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgListNFTResponse>(
                service, METHODID_LIST_NFT)))
        .addMethod(
          getEditListingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListing,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgEditListingResponse>(
                service, METHODID_EDIT_LISTING)))
        .addMethod(
          getDeListNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFT,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgDeListNFTResponse>(
                service, METHODID_DE_LIST_NFT)))
        .addMethod(
          getBuyNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFT,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgBuyNFTResponse>(
                service, METHODID_BUY_NFT)))
        .addMethod(
          getCreateAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuction,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgCreateAuctionResponse>(
                service, METHODID_CREATE_AUCTION)))
        .addMethod(
          getCancelAuctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuction,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgCancelAuctionResponse>(
                service, METHODID_CANCEL_AUCTION)))
        .addMethod(
          getPlaceBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBid,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgPlaceBidResponse>(
                service, METHODID_PLACE_BID)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParams,
              com.OmniFlix.marketplace.v1beta1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.marketplace.v1beta1.TxProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
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
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getListNFTMethod())
              .addMethod(getEditListingMethod())
              .addMethod(getDeListNFTMethod())
              .addMethod(getBuyNFTMethod())
              .addMethod(getCreateAuctionMethod())
              .addMethod(getCancelAuctionMethod())
              .addMethod(getPlaceBidMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
