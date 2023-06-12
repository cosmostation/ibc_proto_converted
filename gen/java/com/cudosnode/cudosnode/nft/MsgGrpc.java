package com.cudosnode.cudosnode.nft;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the NFT Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cudos/nft/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cudosnode.cudosnode.nft.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgIssueDenom,
      com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> getIssueDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueDenom",
      requestType = com.cudosnode.cudosnode.nft.MsgIssueDenom.class,
      responseType = com.cudosnode.cudosnode.nft.MsgIssueDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgIssueDenom,
      com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> getIssueDenomMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgIssueDenom, com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> getIssueDenomMethod;
    if ((getIssueDenomMethod = MsgGrpc.getIssueDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueDenomMethod = MsgGrpc.getIssueDenomMethod) == null) {
          MsgGrpc.getIssueDenomMethod = getIssueDenomMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgIssueDenom, com.cudosnode.cudosnode.nft.MsgIssueDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgIssueDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgIssueDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueDenom"))
              .build();
        }
      }
    }
    return getIssueDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgMintNFT,
      com.cudosnode.cudosnode.nft.MsgMintNFTResponse> getMintNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintNFT",
      requestType = com.cudosnode.cudosnode.nft.MsgMintNFT.class,
      responseType = com.cudosnode.cudosnode.nft.MsgMintNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgMintNFT,
      com.cudosnode.cudosnode.nft.MsgMintNFTResponse> getMintNFTMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgMintNFT, com.cudosnode.cudosnode.nft.MsgMintNFTResponse> getMintNFTMethod;
    if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
          MsgGrpc.getMintNFTMethod = getMintNFTMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgMintNFT, com.cudosnode.cudosnode.nft.MsgMintNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgMintNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgMintNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintNFT"))
              .build();
        }
      }
    }
    return getMintNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgEditNFT,
      com.cudosnode.cudosnode.nft.MsgEditNFTResponse> getEditNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditNFT",
      requestType = com.cudosnode.cudosnode.nft.MsgEditNFT.class,
      responseType = com.cudosnode.cudosnode.nft.MsgEditNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgEditNFT,
      com.cudosnode.cudosnode.nft.MsgEditNFTResponse> getEditNFTMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgEditNFT, com.cudosnode.cudosnode.nft.MsgEditNFTResponse> getEditNFTMethod;
    if ((getEditNFTMethod = MsgGrpc.getEditNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditNFTMethod = MsgGrpc.getEditNFTMethod) == null) {
          MsgGrpc.getEditNFTMethod = getEditNFTMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgEditNFT, com.cudosnode.cudosnode.nft.MsgEditNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgEditNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgEditNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditNFT"))
              .build();
        }
      }
    }
    return getEditNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferNft,
      com.cudosnode.cudosnode.nft.MsgTransferNftResponse> getTransferNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferNft",
      requestType = com.cudosnode.cudosnode.nft.MsgTransferNft.class,
      responseType = com.cudosnode.cudosnode.nft.MsgTransferNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferNft,
      com.cudosnode.cudosnode.nft.MsgTransferNftResponse> getTransferNftMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferNft, com.cudosnode.cudosnode.nft.MsgTransferNftResponse> getTransferNftMethod;
    if ((getTransferNftMethod = MsgGrpc.getTransferNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferNftMethod = MsgGrpc.getTransferNftMethod) == null) {
          MsgGrpc.getTransferNftMethod = getTransferNftMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgTransferNft, com.cudosnode.cudosnode.nft.MsgTransferNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgTransferNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgTransferNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferNft"))
              .build();
        }
      }
    }
    return getTransferNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveNft,
      com.cudosnode.cudosnode.nft.MsgApproveNftResponse> getApproveNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveNft",
      requestType = com.cudosnode.cudosnode.nft.MsgApproveNft.class,
      responseType = com.cudosnode.cudosnode.nft.MsgApproveNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveNft,
      com.cudosnode.cudosnode.nft.MsgApproveNftResponse> getApproveNftMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveNft, com.cudosnode.cudosnode.nft.MsgApproveNftResponse> getApproveNftMethod;
    if ((getApproveNftMethod = MsgGrpc.getApproveNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getApproveNftMethod = MsgGrpc.getApproveNftMethod) == null) {
          MsgGrpc.getApproveNftMethod = getApproveNftMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgApproveNft, com.cudosnode.cudosnode.nft.MsgApproveNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgApproveNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgApproveNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ApproveNft"))
              .build();
        }
      }
    }
    return getApproveNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveAllNft,
      com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> getApproveAllNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveAllNft",
      requestType = com.cudosnode.cudosnode.nft.MsgApproveAllNft.class,
      responseType = com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveAllNft,
      com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> getApproveAllNftMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgApproveAllNft, com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> getApproveAllNftMethod;
    if ((getApproveAllNftMethod = MsgGrpc.getApproveAllNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getApproveAllNftMethod = MsgGrpc.getApproveAllNftMethod) == null) {
          MsgGrpc.getApproveAllNftMethod = getApproveAllNftMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgApproveAllNft, com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveAllNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgApproveAllNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ApproveAllNft"))
              .build();
        }
      }
    }
    return getApproveAllNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgRevokeNft,
      com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> getRevokeNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeNft",
      requestType = com.cudosnode.cudosnode.nft.MsgRevokeNft.class,
      responseType = com.cudosnode.cudosnode.nft.MsgRevokeNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgRevokeNft,
      com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> getRevokeNftMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgRevokeNft, com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> getRevokeNftMethod;
    if ((getRevokeNftMethod = MsgGrpc.getRevokeNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeNftMethod = MsgGrpc.getRevokeNftMethod) == null) {
          MsgGrpc.getRevokeNftMethod = getRevokeNftMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgRevokeNft, com.cudosnode.cudosnode.nft.MsgRevokeNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgRevokeNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgRevokeNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeNft"))
              .build();
        }
      }
    }
    return getRevokeNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgBurnNFT,
      com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> getBurnNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnNFT",
      requestType = com.cudosnode.cudosnode.nft.MsgBurnNFT.class,
      responseType = com.cudosnode.cudosnode.nft.MsgBurnNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgBurnNFT,
      com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> getBurnNFTMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgBurnNFT, com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> getBurnNFTMethod;
    if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
          MsgGrpc.getBurnNFTMethod = getBurnNFTMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgBurnNFT, com.cudosnode.cudosnode.nft.MsgBurnNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgBurnNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgBurnNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnNFT"))
              .build();
        }
      }
    }
    return getBurnNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferDenom,
      com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> getTransferDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferDenom",
      requestType = com.cudosnode.cudosnode.nft.MsgTransferDenom.class,
      responseType = com.cudosnode.cudosnode.nft.MsgTransferDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferDenom,
      com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> getTransferDenomMethod() {
    io.grpc.MethodDescriptor<com.cudosnode.cudosnode.nft.MsgTransferDenom, com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> getTransferDenomMethod;
    if ((getTransferDenomMethod = MsgGrpc.getTransferDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferDenomMethod = MsgGrpc.getTransferDenomMethod) == null) {
          MsgGrpc.getTransferDenomMethod = getTransferDenomMethod =
              io.grpc.MethodDescriptor.<com.cudosnode.cudosnode.nft.MsgTransferDenom, com.cudosnode.cudosnode.nft.MsgTransferDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgTransferDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudosnode.cudosnode.nft.MsgTransferDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferDenom"))
              .build();
        }
      }
    }
    return getTransferDenomMethod;
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
   * <pre>
   * Msg defines the NFT Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    default void issueDenom(com.cudosnode.cudosnode.nft.MsgIssueDenom request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    default void mintNFT(com.cudosnode.cudosnode.nft.MsgMintNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditNFT defines a method for editing a nft.
     * </pre>
     */
    default void editNFT(com.cudosnode.cudosnode.nft.MsgEditNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgEditNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferNft transfers ownership of the token to recipient account.
     * </pre>
     */
    default void transferNft(com.cudosnode.cudosnode.nft.MsgTransferNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferNftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    default void approveNft(com.cudosnode.cudosnode.nft.MsgApproveNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveNftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    default void approveAllNft(com.cudosnode.cudosnode.nft.MsgApproveAllNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveAllNftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revokes permission to spender to transfer or send the given token.
     * </pre>
     */
    default void revokeNft(com.cudosnode.cudosnode.nft.MsgRevokeNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeNftMethod(), responseObserver);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    default void burnNFT(com.cudosnode.cudosnode.nft.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferDenom defines a method for transferring a denom.
     * </pre>
     */
    default void transferDenom(com.cudosnode.cudosnode.nft.MsgTransferDenom request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferDenomMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the NFT Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the NFT Msg service.
   * </pre>
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
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public void issueDenom(com.cudosnode.cudosnode.nft.MsgIssueDenom request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public void mintNFT(com.cudosnode.cudosnode.nft.MsgMintNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditNFT defines a method for editing a nft.
     * </pre>
     */
    public void editNFT(com.cudosnode.cudosnode.nft.MsgEditNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgEditNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferNft transfers ownership of the token to recipient account.
     * </pre>
     */
    public void transferNft(com.cudosnode.cudosnode.nft.MsgTransferNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public void approveNft(com.cudosnode.cudosnode.nft.MsgApproveNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public void approveAllNft(com.cudosnode.cudosnode.nft.MsgApproveAllNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveAllNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revokes permission to spender to transfer or send the given token.
     * </pre>
     */
    public void revokeNft(com.cudosnode.cudosnode.nft.MsgRevokeNft request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public void burnNFT(com.cudosnode.cudosnode.nft.MsgBurnNFT request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferDenom defines a method for transferring a denom.
     * </pre>
     */
    public void transferDenom(com.cudosnode.cudosnode.nft.MsgTransferDenom request,
        io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferDenomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the NFT Msg service.
   * </pre>
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
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgIssueDenomResponse issueDenom(com.cudosnode.cudosnode.nft.MsgIssueDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgMintNFTResponse mintNFT(com.cudosnode.cudosnode.nft.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditNFT defines a method for editing a nft.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgEditNFTResponse editNFT(com.cudosnode.cudosnode.nft.MsgEditNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferNft transfers ownership of the token to recipient account.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgTransferNftResponse transferNft(com.cudosnode.cudosnode.nft.MsgTransferNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferNftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgApproveNftResponse approveNft(com.cudosnode.cudosnode.nft.MsgApproveNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveNftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse approveAllNft(com.cudosnode.cudosnode.nft.MsgApproveAllNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveAllNftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revokes permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgRevokeNftResponse revokeNft(com.cudosnode.cudosnode.nft.MsgRevokeNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeNftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgBurnNFTResponse burnNFT(com.cudosnode.cudosnode.nft.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferDenom defines a method for transferring a denom.
     * </pre>
     */
    public com.cudosnode.cudosnode.nft.MsgTransferDenomResponse transferDenom(com.cudosnode.cudosnode.nft.MsgTransferDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferDenomMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the NFT Msg service.
   * </pre>
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
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgIssueDenomResponse> issueDenom(
        com.cudosnode.cudosnode.nft.MsgIssueDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgMintNFTResponse> mintNFT(
        com.cudosnode.cudosnode.nft.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditNFT defines a method for editing a nft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgEditNFTResponse> editNFT(
        com.cudosnode.cudosnode.nft.MsgEditNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferNft transfers ownership of the token to recipient account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgTransferNftResponse> transferNft(
        com.cudosnode.cudosnode.nft.MsgTransferNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferNftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgApproveNftResponse> approveNft(
        com.cudosnode.cudosnode.nft.MsgApproveNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveNftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Approve grants permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse> approveAllNft(
        com.cudosnode.cudosnode.nft.MsgApproveAllNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveAllNftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revokes permission to spender to transfer or send the given token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgRevokeNftResponse> revokeNft(
        com.cudosnode.cudosnode.nft.MsgRevokeNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeNftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgBurnNFTResponse> burnNFT(
        com.cudosnode.cudosnode.nft.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferDenom defines a method for transferring a denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudosnode.cudosnode.nft.MsgTransferDenomResponse> transferDenom(
        com.cudosnode.cudosnode.nft.MsgTransferDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferDenomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_DENOM = 0;
  private static final int METHODID_MINT_NFT = 1;
  private static final int METHODID_EDIT_NFT = 2;
  private static final int METHODID_TRANSFER_NFT = 3;
  private static final int METHODID_APPROVE_NFT = 4;
  private static final int METHODID_APPROVE_ALL_NFT = 5;
  private static final int METHODID_REVOKE_NFT = 6;
  private static final int METHODID_BURN_NFT = 7;
  private static final int METHODID_TRANSFER_DENOM = 8;

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
        case METHODID_ISSUE_DENOM:
          serviceImpl.issueDenom((com.cudosnode.cudosnode.nft.MsgIssueDenom) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgIssueDenomResponse>) responseObserver);
          break;
        case METHODID_MINT_NFT:
          serviceImpl.mintNFT((com.cudosnode.cudosnode.nft.MsgMintNFT) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgMintNFTResponse>) responseObserver);
          break;
        case METHODID_EDIT_NFT:
          serviceImpl.editNFT((com.cudosnode.cudosnode.nft.MsgEditNFT) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgEditNFTResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_NFT:
          serviceImpl.transferNft((com.cudosnode.cudosnode.nft.MsgTransferNft) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferNftResponse>) responseObserver);
          break;
        case METHODID_APPROVE_NFT:
          serviceImpl.approveNft((com.cudosnode.cudosnode.nft.MsgApproveNft) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveNftResponse>) responseObserver);
          break;
        case METHODID_APPROVE_ALL_NFT:
          serviceImpl.approveAllNft((com.cudosnode.cudosnode.nft.MsgApproveAllNft) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse>) responseObserver);
          break;
        case METHODID_REVOKE_NFT:
          serviceImpl.revokeNft((com.cudosnode.cudosnode.nft.MsgRevokeNft) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgRevokeNftResponse>) responseObserver);
          break;
        case METHODID_BURN_NFT:
          serviceImpl.burnNFT((com.cudosnode.cudosnode.nft.MsgBurnNFT) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgBurnNFTResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_DENOM:
          serviceImpl.transferDenom((com.cudosnode.cudosnode.nft.MsgTransferDenom) request,
              (io.grpc.stub.StreamObserver<com.cudosnode.cudosnode.nft.MsgTransferDenomResponse>) responseObserver);
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
          getIssueDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgIssueDenom,
              com.cudosnode.cudosnode.nft.MsgIssueDenomResponse>(
                service, METHODID_ISSUE_DENOM)))
        .addMethod(
          getMintNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgMintNFT,
              com.cudosnode.cudosnode.nft.MsgMintNFTResponse>(
                service, METHODID_MINT_NFT)))
        .addMethod(
          getEditNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgEditNFT,
              com.cudosnode.cudosnode.nft.MsgEditNFTResponse>(
                service, METHODID_EDIT_NFT)))
        .addMethod(
          getTransferNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgTransferNft,
              com.cudosnode.cudosnode.nft.MsgTransferNftResponse>(
                service, METHODID_TRANSFER_NFT)))
        .addMethod(
          getApproveNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgApproveNft,
              com.cudosnode.cudosnode.nft.MsgApproveNftResponse>(
                service, METHODID_APPROVE_NFT)))
        .addMethod(
          getApproveAllNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgApproveAllNft,
              com.cudosnode.cudosnode.nft.MsgApproveAllNftResponse>(
                service, METHODID_APPROVE_ALL_NFT)))
        .addMethod(
          getRevokeNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgRevokeNft,
              com.cudosnode.cudosnode.nft.MsgRevokeNftResponse>(
                service, METHODID_REVOKE_NFT)))
        .addMethod(
          getBurnNFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgBurnNFT,
              com.cudosnode.cudosnode.nft.MsgBurnNFTResponse>(
                service, METHODID_BURN_NFT)))
        .addMethod(
          getTransferDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudosnode.cudosnode.nft.MsgTransferDenom,
              com.cudosnode.cudosnode.nft.MsgTransferDenomResponse>(
                service, METHODID_TRANSFER_DENOM)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cudosnode.cudosnode.nft.TxProto.getDescriptor();
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
              .addMethod(getIssueDenomMethod())
              .addMethod(getMintNFTMethod())
              .addMethod(getEditNFTMethod())
              .addMethod(getTransferNftMethod())
              .addMethod(getApproveNftMethod())
              .addMethod(getApproveAllNftMethod())
              .addMethod(getRevokeNftMethod())
              .addMethod(getBurnNFTMethod())
              .addMethod(getTransferDenomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
