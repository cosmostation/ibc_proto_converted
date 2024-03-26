package com.OmniFlix.onft.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: OmniFlix/onft/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "OmniFlix.onft.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> getCreateDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDenom",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> getCreateDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> getCreateDenomMethod;
    if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateDenomMethod = MsgGrpc.getCreateDenomMethod) == null) {
          MsgGrpc.getCreateDenomMethod = getCreateDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateDenom"))
              .build();
        }
      }
    }
    return getCreateDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> getUpdateDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDenom",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> getUpdateDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> getUpdateDenomMethod;
    if ((getUpdateDenomMethod = MsgGrpc.getUpdateDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateDenomMethod = MsgGrpc.getUpdateDenomMethod) == null) {
          MsgGrpc.getUpdateDenomMethod = getUpdateDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateDenom"))
              .build();
        }
      }
    }
    return getUpdateDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> getTransferDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferDenom",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> getTransferDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> getTransferDenomMethod;
    if ((getTransferDenomMethod = MsgGrpc.getTransferDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferDenomMethod = MsgGrpc.getTransferDenomMethod) == null) {
          MsgGrpc.getTransferDenomMethod = getTransferDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferDenom"))
              .build();
        }
      }
    }
    return getTransferDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> getPurgeDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PurgeDenom",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom,
      com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> getPurgeDenomMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> getPurgeDenomMethod;
    if ((getPurgeDenomMethod = MsgGrpc.getPurgeDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPurgeDenomMethod = MsgGrpc.getPurgeDenomMethod) == null) {
          MsgGrpc.getPurgeDenomMethod = getPurgeDenomMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom, com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PurgeDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PurgeDenom"))
              .build();
        }
      }
    }
    return getPurgeDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> getMintONFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintONFT",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> getMintONFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> getMintONFTMethod;
    if ((getMintONFTMethod = MsgGrpc.getMintONFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintONFTMethod = MsgGrpc.getMintONFTMethod) == null) {
          MsgGrpc.getMintONFTMethod = getMintONFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintONFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintONFT"))
              .build();
        }
      }
    }
    return getMintONFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> getTransferONFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferONFT",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> getTransferONFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> getTransferONFTMethod;
    if ((getTransferONFTMethod = MsgGrpc.getTransferONFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferONFTMethod = MsgGrpc.getTransferONFTMethod) == null) {
          MsgGrpc.getTransferONFTMethod = getTransferONFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferONFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferONFT"))
              .build();
        }
      }
    }
    return getTransferONFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> getBurnONFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnONFT",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT,
      com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> getBurnONFTMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> getBurnONFTMethod;
    if ((getBurnONFTMethod = MsgGrpc.getBurnONFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnONFTMethod = MsgGrpc.getBurnONFTMethod) == null) {
          MsgGrpc.getBurnONFTMethod = getBurnONFTMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT, com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnONFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnONFT"))
              .build();
        }
      }
    }
    return getBurnONFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams,
      com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams.class,
      responseType = com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams,
      com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams, com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams, com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
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
    default void createDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDenomMethod(), responseObserver);
    }

    /**
     */
    default void updateDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDenomMethod(), responseObserver);
    }

    /**
     */
    default void transferDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferDenomMethod(), responseObserver);
    }

    /**
     */
    default void purgeDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurgeDenomMethod(), responseObserver);
    }

    /**
     */
    default void mintONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintONFTMethod(), responseObserver);
    }

    /**
     */
    default void transferONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferONFTMethod(), responseObserver);
    }

    /**
     */
    default void burnONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnONFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the onft module
     * parameters. The authority is hard-coded to the onft module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    default void updateParams(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
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
    public void createDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purgeDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurgeDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mintONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintONFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transferONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferONFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void burnONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnONFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the onft module
     * parameters. The authority is hard-coded to the onft module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public void updateParams(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> responseObserver) {
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
    public com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse createDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse updateDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse transferDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse purgeDenom(com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurgeDenomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse mintONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintONFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse transferONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferONFTMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse burnONFT(com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnONFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the onft module
     * parameters. The authority is hard-coded to the onft module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse updateParams(com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse> createDenom(
        com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse> updateDenom(
        com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse> transferDenom(
        com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse> purgeDenom(
        com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurgeDenomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse> mintONFT(
        com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintONFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse> transferONFT(
        com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferONFTMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse> burnONFT(
        com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnONFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a governance operation for updating the onft module
     * parameters. The authority is hard-coded to the onft module account.
     * Since: cosmos-sdk 0.47
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DENOM = 0;
  private static final int METHODID_UPDATE_DENOM = 1;
  private static final int METHODID_TRANSFER_DENOM = 2;
  private static final int METHODID_PURGE_DENOM = 3;
  private static final int METHODID_MINT_ONFT = 4;
  private static final int METHODID_TRANSFER_ONFT = 5;
  private static final int METHODID_BURN_ONFT = 6;
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
        case METHODID_CREATE_DENOM:
          serviceImpl.createDenom((com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DENOM:
          serviceImpl.updateDenom((com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_DENOM:
          serviceImpl.transferDenom((com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse>) responseObserver);
          break;
        case METHODID_PURGE_DENOM:
          serviceImpl.purgeDenom((com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse>) responseObserver);
          break;
        case METHODID_MINT_ONFT:
          serviceImpl.mintONFT((com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_ONFT:
          serviceImpl.transferONFT((com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse>) responseObserver);
          break;
        case METHODID_BURN_ONFT:
          serviceImpl.burnONFT((com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getCreateDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenom,
              com.OmniFlix.onft.v1beta1.TxProto.MsgCreateDenomResponse>(
                service, METHODID_CREATE_DENOM)))
        .addMethod(
          getUpdateDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenom,
              com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateDenomResponse>(
                service, METHODID_UPDATE_DENOM)))
        .addMethod(
          getTransferDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenom,
              com.OmniFlix.onft.v1beta1.TxProto.MsgTransferDenomResponse>(
                service, METHODID_TRANSFER_DENOM)))
        .addMethod(
          getPurgeDenomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenom,
              com.OmniFlix.onft.v1beta1.TxProto.MsgPurgeDenomResponse>(
                service, METHODID_PURGE_DENOM)))
        .addMethod(
          getMintONFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFT,
              com.OmniFlix.onft.v1beta1.TxProto.MsgMintONFTResponse>(
                service, METHODID_MINT_ONFT)))
        .addMethod(
          getTransferONFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFT,
              com.OmniFlix.onft.v1beta1.TxProto.MsgTransferONFTResponse>(
                service, METHODID_TRANSFER_ONFT)))
        .addMethod(
          getBurnONFTMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFT,
              com.OmniFlix.onft.v1beta1.TxProto.MsgBurnONFTResponse>(
                service, METHODID_BURN_ONFT)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParams,
              com.OmniFlix.onft.v1beta1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.OmniFlix.onft.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateDenomMethod())
              .addMethod(getUpdateDenomMethod())
              .addMethod(getTransferDenomMethod())
              .addMethod(getPurgeDenomMethod())
              .addMethod(getMintONFTMethod())
              .addMethod(getTransferONFTMethod())
              .addMethod(getBurnONFTMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
