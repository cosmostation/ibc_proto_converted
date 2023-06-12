package com.cudoventures.cudosnode.marketplace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cudos/marketplace/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cudoventures.cudosnode.marketplace.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishCollection,
      com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> getPublishCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishCollection",
      requestType = com.cudoventures.cudosnode.marketplace.MsgPublishCollection.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishCollection,
      com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> getPublishCollectionMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishCollection, com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> getPublishCollectionMethod;
    if ((getPublishCollectionMethod = MsgGrpc.getPublishCollectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPublishCollectionMethod = MsgGrpc.getPublishCollectionMethod) == null) {
          MsgGrpc.getPublishCollectionMethod = getPublishCollectionMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgPublishCollection, com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgPublishCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PublishCollection"))
              .build();
        }
      }
    }
    return getPublishCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishNft,
      com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> getPublishNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishNft",
      requestType = com.cudoventures.cudosnode.marketplace.MsgPublishNft.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishNft,
      com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> getPublishNftMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgPublishNft, com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> getPublishNftMethod;
    if ((getPublishNftMethod = MsgGrpc.getPublishNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPublishNftMethod = MsgGrpc.getPublishNftMethod) == null) {
          MsgGrpc.getPublishNftMethod = getPublishNftMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgPublishNft, com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgPublishNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PublishNft"))
              .build();
        }
      }
    }
    return getPublishNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgBuyNft,
      com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> getBuyNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyNft",
      requestType = com.cudoventures.cudosnode.marketplace.MsgBuyNft.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgBuyNft,
      com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> getBuyNftMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgBuyNft, com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> getBuyNftMethod;
    if ((getBuyNftMethod = MsgGrpc.getBuyNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBuyNftMethod = MsgGrpc.getBuyNftMethod) == null) {
          MsgGrpc.getBuyNftMethod = getBuyNftMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgBuyNft, com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgBuyNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BuyNft"))
              .build();
        }
      }
    }
    return getBuyNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgMintNft,
      com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> getMintNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintNft",
      requestType = com.cudoventures.cudosnode.marketplace.MsgMintNft.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgMintNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgMintNft,
      com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> getMintNftMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgMintNft, com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> getMintNftMethod;
    if ((getMintNftMethod = MsgGrpc.getMintNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintNftMethod = MsgGrpc.getMintNftMethod) == null) {
          MsgGrpc.getMintNftMethod = getMintNftMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgMintNft, com.cudoventures.cudosnode.marketplace.MsgMintNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgMintNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgMintNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintNft"))
              .build();
        }
      }
    }
    return getMintNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveNft,
      com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> getRemoveNftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveNft",
      requestType = com.cudoventures.cudosnode.marketplace.MsgRemoveNft.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveNft,
      com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> getRemoveNftMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveNft, com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> getRemoveNftMethod;
    if ((getRemoveNftMethod = MsgGrpc.getRemoveNftMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveNftMethod = MsgGrpc.getRemoveNftMethod) == null) {
          MsgGrpc.getRemoveNftMethod = getRemoveNftMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgRemoveNft, com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveNft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgRemoveNft.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveNft"))
              .build();
        }
      }
    }
    return getRemoveNftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgVerifyCollection,
      com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> getVerifyCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyCollection",
      requestType = com.cudoventures.cudosnode.marketplace.MsgVerifyCollection.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgVerifyCollection,
      com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> getVerifyCollectionMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgVerifyCollection, com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> getVerifyCollectionMethod;
    if ((getVerifyCollectionMethod = MsgGrpc.getVerifyCollectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getVerifyCollectionMethod = MsgGrpc.getVerifyCollectionMethod) == null) {
          MsgGrpc.getVerifyCollectionMethod = getVerifyCollectionMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgVerifyCollection, com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgVerifyCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("VerifyCollection"))
              .build();
        }
      }
    }
    return getVerifyCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection,
      com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> getUnverifyCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnverifyCollection",
      requestType = com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection,
      com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> getUnverifyCollectionMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection, com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> getUnverifyCollectionMethod;
    if ((getUnverifyCollectionMethod = MsgGrpc.getUnverifyCollectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUnverifyCollectionMethod = MsgGrpc.getUnverifyCollectionMethod) == null) {
          MsgGrpc.getUnverifyCollectionMethod = getUnverifyCollectionMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection, com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnverifyCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UnverifyCollection"))
              .build();
        }
      }
    }
    return getUnverifyCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgCreateCollection,
      com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> getCreateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCollection",
      requestType = com.cudoventures.cudosnode.marketplace.MsgCreateCollection.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgCreateCollection,
      com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> getCreateCollectionMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgCreateCollection, com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> getCreateCollectionMethod;
    if ((getCreateCollectionMethod = MsgGrpc.getCreateCollectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateCollectionMethod = MsgGrpc.getCreateCollectionMethod) == null) {
          MsgGrpc.getCreateCollectionMethod = getCreateCollectionMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgCreateCollection, com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgCreateCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateCollection"))
              .build();
        }
      }
    }
    return getCreateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties,
      com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> getUpdateRoyaltiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoyalties",
      requestType = com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties,
      com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> getUpdateRoyaltiesMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties, com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> getUpdateRoyaltiesMethod;
    if ((getUpdateRoyaltiesMethod = MsgGrpc.getUpdateRoyaltiesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRoyaltiesMethod = MsgGrpc.getUpdateRoyaltiesMethod) == null) {
          MsgGrpc.getUpdateRoyaltiesMethod = getUpdateRoyaltiesMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties, com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoyalties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRoyalties"))
              .build();
        }
      }
    }
    return getUpdateRoyaltiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdatePrice,
      com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> getUpdatePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePrice",
      requestType = com.cudoventures.cudosnode.marketplace.MsgUpdatePrice.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdatePrice,
      com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgUpdatePrice, com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = MsgGrpc.getUpdatePriceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdatePriceMethod = MsgGrpc.getUpdatePriceMethod) == null) {
          MsgGrpc.getUpdatePriceMethod = getUpdatePriceMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgUpdatePrice, com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUpdatePrice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdatePrice"))
              .build();
        }
      }
    }
    return getUpdatePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgAddAdmin,
      com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> getAddAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAdmin",
      requestType = com.cudoventures.cudosnode.marketplace.MsgAddAdmin.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgAddAdmin,
      com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> getAddAdminMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgAddAdmin, com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> getAddAdminMethod;
    if ((getAddAdminMethod = MsgGrpc.getAddAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAdminMethod = MsgGrpc.getAddAdminMethod) == null) {
          MsgGrpc.getAddAdminMethod = getAddAdminMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgAddAdmin, com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgAddAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAdmin"))
              .build();
        }
      }
    }
    return getAddAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin,
      com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> getRemoveAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAdmin",
      requestType = com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin.class,
      responseType = com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin,
      com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> getRemoveAdminMethod() {
    io.grpc.MethodDescriptor<com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin, com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> getRemoveAdminMethod;
    if ((getRemoveAdminMethod = MsgGrpc.getRemoveAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveAdminMethod = MsgGrpc.getRemoveAdminMethod) == null) {
          MsgGrpc.getRemoveAdminMethod = getRemoveAdminMethod =
              io.grpc.MethodDescriptor.<com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin, com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveAdmin"))
              .build();
        }
      }
    }
    return getRemoveAdminMethod;
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
   * Msg defines the Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void publishCollection(com.cudoventures.cudosnode.marketplace.MsgPublishCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishCollectionMethod(), responseObserver);
    }

    /**
     */
    default void publishNft(com.cudoventures.cudosnode.marketplace.MsgPublishNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishNftMethod(), responseObserver);
    }

    /**
     */
    default void buyNft(com.cudoventures.cudosnode.marketplace.MsgBuyNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuyNftMethod(), responseObserver);
    }

    /**
     */
    default void mintNft(com.cudoventures.cudosnode.marketplace.MsgMintNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintNftMethod(), responseObserver);
    }

    /**
     */
    default void removeNft(com.cudoventures.cudosnode.marketplace.MsgRemoveNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveNftMethod(), responseObserver);
    }

    /**
     */
    default void verifyCollection(com.cudoventures.cudosnode.marketplace.MsgVerifyCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyCollectionMethod(), responseObserver);
    }

    /**
     */
    default void unverifyCollection(com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnverifyCollectionMethod(), responseObserver);
    }

    /**
     */
    default void createCollection(com.cudoventures.cudosnode.marketplace.MsgCreateCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCollectionMethod(), responseObserver);
    }

    /**
     */
    default void updateRoyalties(com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoyaltiesMethod(), responseObserver);
    }

    /**
     */
    default void updatePrice(com.cudoventures.cudosnode.marketplace.MsgUpdatePrice request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    /**
     */
    default void addAdmin(com.cudoventures.cudosnode.marketplace.MsgAddAdmin request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    default void removeAdmin(com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAdminMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Msg service.
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
   * Msg defines the Msg service.
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
     */
    public void publishCollection(com.cudoventures.cudosnode.marketplace.MsgPublishCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishNft(com.cudoventures.cudosnode.marketplace.MsgPublishNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void buyNft(com.cudoventures.cudosnode.marketplace.MsgBuyNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuyNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mintNft(com.cudoventures.cudosnode.marketplace.MsgMintNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeNft(com.cudoventures.cudosnode.marketplace.MsgRemoveNft request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveNftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyCollection(com.cudoventures.cudosnode.marketplace.MsgVerifyCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unverifyCollection(com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnverifyCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCollection(com.cudoventures.cudosnode.marketplace.MsgCreateCollection request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoyalties(com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoyaltiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePrice(com.cudoventures.cudosnode.marketplace.MsgUpdatePrice request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAdmin(com.cudoventures.cudosnode.marketplace.MsgAddAdmin request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public void removeAdmin(com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin request,
        io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAdminMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse publishCollection(com.cudoventures.cudosnode.marketplace.MsgPublishCollection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse publishNft(com.cudoventures.cudosnode.marketplace.MsgPublishNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishNftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse buyNft(com.cudoventures.cudosnode.marketplace.MsgBuyNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuyNftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgMintNftResponse mintNft(com.cudoventures.cudosnode.marketplace.MsgMintNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintNftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse removeNft(com.cudoventures.cudosnode.marketplace.MsgRemoveNft request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveNftMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse verifyCollection(com.cudoventures.cudosnode.marketplace.MsgVerifyCollection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse unverifyCollection(com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnverifyCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse createCollection(com.cudoventures.cudosnode.marketplace.MsgCreateCollection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse updateRoyalties(com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoyaltiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse updatePrice(com.cudoventures.cudosnode.marketplace.MsgUpdatePrice request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse addAdmin(com.cudoventures.cudosnode.marketplace.MsgAddAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse removeAdmin(com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAdminMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Msg service.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse> publishCollection(
        com.cudoventures.cudosnode.marketplace.MsgPublishCollection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse> publishNft(
        com.cudoventures.cudosnode.marketplace.MsgPublishNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishNftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse> buyNft(
        com.cudoventures.cudosnode.marketplace.MsgBuyNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuyNftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgMintNftResponse> mintNft(
        com.cudoventures.cudosnode.marketplace.MsgMintNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintNftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse> removeNft(
        com.cudoventures.cudosnode.marketplace.MsgRemoveNft request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveNftMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse> verifyCollection(
        com.cudoventures.cudosnode.marketplace.MsgVerifyCollection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse> unverifyCollection(
        com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnverifyCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse> createCollection(
        com.cudoventures.cudosnode.marketplace.MsgCreateCollection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse> updateRoyalties(
        com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoyaltiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse> updatePrice(
        com.cudoventures.cudosnode.marketplace.MsgUpdatePrice request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse> addAdmin(
        com.cudoventures.cudosnode.marketplace.MsgAddAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * this line is used by starport scaffolding # proto/tx/rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse> removeAdmin(
        com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAdminMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH_COLLECTION = 0;
  private static final int METHODID_PUBLISH_NFT = 1;
  private static final int METHODID_BUY_NFT = 2;
  private static final int METHODID_MINT_NFT = 3;
  private static final int METHODID_REMOVE_NFT = 4;
  private static final int METHODID_VERIFY_COLLECTION = 5;
  private static final int METHODID_UNVERIFY_COLLECTION = 6;
  private static final int METHODID_CREATE_COLLECTION = 7;
  private static final int METHODID_UPDATE_ROYALTIES = 8;
  private static final int METHODID_UPDATE_PRICE = 9;
  private static final int METHODID_ADD_ADMIN = 10;
  private static final int METHODID_REMOVE_ADMIN = 11;

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
        case METHODID_PUBLISH_COLLECTION:
          serviceImpl.publishCollection((com.cudoventures.cudosnode.marketplace.MsgPublishCollection) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_NFT:
          serviceImpl.publishNft((com.cudoventures.cudosnode.marketplace.MsgPublishNft) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse>) responseObserver);
          break;
        case METHODID_BUY_NFT:
          serviceImpl.buyNft((com.cudoventures.cudosnode.marketplace.MsgBuyNft) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse>) responseObserver);
          break;
        case METHODID_MINT_NFT:
          serviceImpl.mintNft((com.cudoventures.cudosnode.marketplace.MsgMintNft) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgMintNftResponse>) responseObserver);
          break;
        case METHODID_REMOVE_NFT:
          serviceImpl.removeNft((com.cudoventures.cudosnode.marketplace.MsgRemoveNft) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse>) responseObserver);
          break;
        case METHODID_VERIFY_COLLECTION:
          serviceImpl.verifyCollection((com.cudoventures.cudosnode.marketplace.MsgVerifyCollection) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse>) responseObserver);
          break;
        case METHODID_UNVERIFY_COLLECTION:
          serviceImpl.unverifyCollection((com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_COLLECTION:
          serviceImpl.createCollection((com.cudoventures.cudosnode.marketplace.MsgCreateCollection) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROYALTIES:
          serviceImpl.updateRoyalties((com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((com.cudoventures.cudosnode.marketplace.MsgUpdatePrice) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse>) responseObserver);
          break;
        case METHODID_ADD_ADMIN:
          serviceImpl.addAdmin((com.cudoventures.cudosnode.marketplace.MsgAddAdmin) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ADMIN:
          serviceImpl.removeAdmin((com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin) request,
              (io.grpc.stub.StreamObserver<com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse>) responseObserver);
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
          getPublishCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgPublishCollection,
              com.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse>(
                service, METHODID_PUBLISH_COLLECTION)))
        .addMethod(
          getPublishNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgPublishNft,
              com.cudoventures.cudosnode.marketplace.MsgPublishNftResponse>(
                service, METHODID_PUBLISH_NFT)))
        .addMethod(
          getBuyNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgBuyNft,
              com.cudoventures.cudosnode.marketplace.MsgBuyNftResponse>(
                service, METHODID_BUY_NFT)))
        .addMethod(
          getMintNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgMintNft,
              com.cudoventures.cudosnode.marketplace.MsgMintNftResponse>(
                service, METHODID_MINT_NFT)))
        .addMethod(
          getRemoveNftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgRemoveNft,
              com.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse>(
                service, METHODID_REMOVE_NFT)))
        .addMethod(
          getVerifyCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgVerifyCollection,
              com.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse>(
                service, METHODID_VERIFY_COLLECTION)))
        .addMethod(
          getUnverifyCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgUnverifyCollection,
              com.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse>(
                service, METHODID_UNVERIFY_COLLECTION)))
        .addMethod(
          getCreateCollectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgCreateCollection,
              com.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse>(
                service, METHODID_CREATE_COLLECTION)))
        .addMethod(
          getUpdateRoyaltiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties,
              com.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse>(
                service, METHODID_UPDATE_ROYALTIES)))
        .addMethod(
          getUpdatePriceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgUpdatePrice,
              com.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse>(
                service, METHODID_UPDATE_PRICE)))
        .addMethod(
          getAddAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgAddAdmin,
              com.cudoventures.cudosnode.marketplace.MsgAddAdminResponse>(
                service, METHODID_ADD_ADMIN)))
        .addMethod(
          getRemoveAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cudoventures.cudosnode.marketplace.MsgRemoveAdmin,
              com.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponse>(
                service, METHODID_REMOVE_ADMIN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cudoventures.cudosnode.marketplace.TxProto.getDescriptor();
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
              .addMethod(getPublishCollectionMethod())
              .addMethod(getPublishNftMethod())
              .addMethod(getBuyNftMethod())
              .addMethod(getMintNftMethod())
              .addMethod(getRemoveNftMethod())
              .addMethod(getVerifyCollectionMethod())
              .addMethod(getUnverifyCollectionMethod())
              .addMethod(getCreateCollectionMethod())
              .addMethod(getUpdateRoyaltiesMethod())
              .addMethod(getUpdatePriceMethod())
              .addMethod(getAddAdminMethod())
              .addMethod(getRemoveAdminMethod())
              .build();
        }
      }
    }
    return result;
  }
}
