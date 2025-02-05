package com.zrchain.treasury;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: zrchain/treasury/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "zrchain.treasury.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateParams,
      com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.zrchain.treasury.TxProto.MsgUpdateParams.class,
      responseType = com.zrchain.treasury.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateParams,
      com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateParams, com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgUpdateParams, com.zrchain.treasury.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewKeyRequest,
      com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> getNewKeyRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewKeyRequest",
      requestType = com.zrchain.treasury.TxProto.MsgNewKeyRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewKeyRequest,
      com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> getNewKeyRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewKeyRequest, com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> getNewKeyRequestMethod;
    if ((getNewKeyRequestMethod = MsgGrpc.getNewKeyRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewKeyRequestMethod = MsgGrpc.getNewKeyRequestMethod) == null) {
          MsgGrpc.getNewKeyRequestMethod = getNewKeyRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgNewKeyRequest, com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewKeyRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewKeyRequest"))
              .build();
        }
      }
    }
    return getNewKeyRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilKeyRequest,
      com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> getFulfilKeyRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FulfilKeyRequest",
      requestType = com.zrchain.treasury.TxProto.MsgFulfilKeyRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilKeyRequest,
      com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> getFulfilKeyRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilKeyRequest, com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> getFulfilKeyRequestMethod;
    if ((getFulfilKeyRequestMethod = MsgGrpc.getFulfilKeyRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFulfilKeyRequestMethod = MsgGrpc.getFulfilKeyRequestMethod) == null) {
          MsgGrpc.getFulfilKeyRequestMethod = getFulfilKeyRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgFulfilKeyRequest, com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FulfilKeyRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FulfilKeyRequest"))
              .build();
        }
      }
    }
    return getFulfilKeyRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignatureRequest,
      com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> getNewSignatureRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewSignatureRequest",
      requestType = com.zrchain.treasury.TxProto.MsgNewSignatureRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignatureRequest,
      com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> getNewSignatureRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignatureRequest, com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> getNewSignatureRequestMethod;
    if ((getNewSignatureRequestMethod = MsgGrpc.getNewSignatureRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewSignatureRequestMethod = MsgGrpc.getNewSignatureRequestMethod) == null) {
          MsgGrpc.getNewSignatureRequestMethod = getNewSignatureRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgNewSignatureRequest, com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewSignatureRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewSignatureRequest"))
              .build();
        }
      }
    }
    return getNewSignatureRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest,
      com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> getFulfilSignatureRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FulfilSignatureRequest",
      requestType = com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest,
      com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> getFulfilSignatureRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest, com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> getFulfilSignatureRequestMethod;
    if ((getFulfilSignatureRequestMethod = MsgGrpc.getFulfilSignatureRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFulfilSignatureRequestMethod = MsgGrpc.getFulfilSignatureRequestMethod) == null) {
          MsgGrpc.getFulfilSignatureRequestMethod = getFulfilSignatureRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest, com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FulfilSignatureRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FulfilSignatureRequest"))
              .build();
        }
      }
    }
    return getFulfilSignatureRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest,
      com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> getNewSignTransactionRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewSignTransactionRequest",
      requestType = com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest,
      com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> getNewSignTransactionRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest, com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> getNewSignTransactionRequestMethod;
    if ((getNewSignTransactionRequestMethod = MsgGrpc.getNewSignTransactionRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewSignTransactionRequestMethod = MsgGrpc.getNewSignTransactionRequestMethod) == null) {
          MsgGrpc.getNewSignTransactionRequestMethod = getNewSignTransactionRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest, com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewSignTransactionRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewSignTransactionRequest"))
              .build();
        }
      }
    }
    return getNewSignTransactionRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgTransferFromKeyring,
      com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> getTransferFromKeyringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferFromKeyring",
      requestType = com.zrchain.treasury.TxProto.MsgTransferFromKeyring.class,
      responseType = com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgTransferFromKeyring,
      com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> getTransferFromKeyringMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgTransferFromKeyring, com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> getTransferFromKeyringMethod;
    if ((getTransferFromKeyringMethod = MsgGrpc.getTransferFromKeyringMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferFromKeyringMethod = MsgGrpc.getTransferFromKeyringMethod) == null) {
          MsgGrpc.getTransferFromKeyringMethod = getTransferFromKeyringMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgTransferFromKeyring, com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferFromKeyring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgTransferFromKeyring.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferFromKeyring"))
              .build();
        }
      }
    }
    return getTransferFromKeyringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewICATransactionRequest,
      com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> getNewICATransactionRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewICATransactionRequest",
      requestType = com.zrchain.treasury.TxProto.MsgNewICATransactionRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewICATransactionRequest,
      com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> getNewICATransactionRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewICATransactionRequest, com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> getNewICATransactionRequestMethod;
    if ((getNewICATransactionRequestMethod = MsgGrpc.getNewICATransactionRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewICATransactionRequestMethod = MsgGrpc.getNewICATransactionRequestMethod) == null) {
          MsgGrpc.getNewICATransactionRequestMethod = getNewICATransactionRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgNewICATransactionRequest, com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewICATransactionRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewICATransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewICATransactionRequest"))
              .build();
        }
      }
    }
    return getNewICATransactionRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest,
      com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> getFulfilICATransactionRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FulfilICATransactionRequest",
      requestType = com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest,
      com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> getFulfilICATransactionRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest, com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> getFulfilICATransactionRequestMethod;
    if ((getFulfilICATransactionRequestMethod = MsgGrpc.getFulfilICATransactionRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getFulfilICATransactionRequestMethod = MsgGrpc.getFulfilICATransactionRequestMethod) == null) {
          MsgGrpc.getFulfilICATransactionRequestMethod = getFulfilICATransactionRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest, com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FulfilICATransactionRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("FulfilICATransactionRequest"))
              .build();
        }
      }
    }
    return getFulfilICATransactionRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest,
      com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> getNewZrSignSignatureRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewZrSignSignatureRequest",
      requestType = com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest.class,
      responseType = com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest,
      com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> getNewZrSignSignatureRequestMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest, com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> getNewZrSignSignatureRequestMethod;
    if ((getNewZrSignSignatureRequestMethod = MsgGrpc.getNewZrSignSignatureRequestMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNewZrSignSignatureRequestMethod = MsgGrpc.getNewZrSignSignatureRequestMethod) == null) {
          MsgGrpc.getNewZrSignSignatureRequestMethod = getNewZrSignSignatureRequestMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest, com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewZrSignSignatureRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NewZrSignSignatureRequest"))
              .build();
        }
      }
    }
    return getNewZrSignSignatureRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy,
      com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> getUpdateKeyPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateKeyPolicy",
      requestType = com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy.class,
      responseType = com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy,
      com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> getUpdateKeyPolicyMethod() {
    io.grpc.MethodDescriptor<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy, com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> getUpdateKeyPolicyMethod;
    if ((getUpdateKeyPolicyMethod = MsgGrpc.getUpdateKeyPolicyMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateKeyPolicyMethod = MsgGrpc.getUpdateKeyPolicyMethod) == null) {
          MsgGrpc.getUpdateKeyPolicyMethod = getUpdateKeyPolicyMethod =
              io.grpc.MethodDescriptor.<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy, com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateKeyPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateKeyPolicy"))
              .build();
        }
      }
    }
    return getUpdateKeyPolicyMethod;
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
     * <pre>
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    default void updateParams(com.zrchain.treasury.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewKeyRequest defines an operation for creating a key request.
     * </pre>
     */
    default void newKeyRequest(com.zrchain.treasury.TxProto.MsgNewKeyRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewKeyRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * FulfilKeyRequest defines an operation for responding to a key request
     * </pre>
     */
    default void fulfilKeyRequest(com.zrchain.treasury.TxProto.MsgFulfilKeyRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFulfilKeyRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewSignatureRequest defines an operation for creating a signature request
     * </pre>
     */
    default void newSignatureRequest(com.zrchain.treasury.TxProto.MsgNewSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewSignatureRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * FulfilSignatureRequest defines an operation for returning a signature
     * response to a request
     * </pre>
     */
    default void fulfilSignatureRequest(com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFulfilSignatureRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewSignTransactionRequest defines an operation for creating a signature for
     * transaction request
     * </pre>
     */
    default void newSignTransactionRequest(com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewSignTransactionRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferFromKeyring defines an operation for transferring tokens from a
     * keyring
     * </pre>
     */
    default void transferFromKeyring(com.zrchain.treasury.TxProto.MsgTransferFromKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferFromKeyringMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewICATransactionRequest defines an operation for creating an interchain
     * account transaction request
     * </pre>
     */
    default void newICATransactionRequest(com.zrchain.treasury.TxProto.MsgNewICATransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewICATransactionRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * FulfilICATransactionRequest defines an operation for responding to an
     * interchain account transaction request
     * </pre>
     */
    default void fulfilICATransactionRequest(com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFulfilICATransactionRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewZrSignSignatureRequest defines an operation for creating a zrsign
     * signature request
     * </pre>
     */
    default void newZrSignSignatureRequest(com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewZrSignSignatureRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateKeyPolicy defines an operation for updating a key policy
     * </pre>
     */
    default void updateKeyPolicy(com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateKeyPolicyMethod(), responseObserver);
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
     * <pre>
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public void updateParams(com.zrchain.treasury.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewKeyRequest defines an operation for creating a key request.
     * </pre>
     */
    public void newKeyRequest(com.zrchain.treasury.TxProto.MsgNewKeyRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewKeyRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FulfilKeyRequest defines an operation for responding to a key request
     * </pre>
     */
    public void fulfilKeyRequest(com.zrchain.treasury.TxProto.MsgFulfilKeyRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFulfilKeyRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewSignatureRequest defines an operation for creating a signature request
     * </pre>
     */
    public void newSignatureRequest(com.zrchain.treasury.TxProto.MsgNewSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewSignatureRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FulfilSignatureRequest defines an operation for returning a signature
     * response to a request
     * </pre>
     */
    public void fulfilSignatureRequest(com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFulfilSignatureRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewSignTransactionRequest defines an operation for creating a signature for
     * transaction request
     * </pre>
     */
    public void newSignTransactionRequest(com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewSignTransactionRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferFromKeyring defines an operation for transferring tokens from a
     * keyring
     * </pre>
     */
    public void transferFromKeyring(com.zrchain.treasury.TxProto.MsgTransferFromKeyring request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferFromKeyringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewICATransactionRequest defines an operation for creating an interchain
     * account transaction request
     * </pre>
     */
    public void newICATransactionRequest(com.zrchain.treasury.TxProto.MsgNewICATransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewICATransactionRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * FulfilICATransactionRequest defines an operation for responding to an
     * interchain account transaction request
     * </pre>
     */
    public void fulfilICATransactionRequest(com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFulfilICATransactionRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewZrSignSignatureRequest defines an operation for creating a zrsign
     * signature request
     * </pre>
     */
    public void newZrSignSignatureRequest(com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewZrSignSignatureRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateKeyPolicy defines an operation for updating a key policy
     * </pre>
     */
    public void updateKeyPolicy(com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy request,
        io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateKeyPolicyMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgUpdateParamsResponse updateParams(com.zrchain.treasury.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewKeyRequest defines an operation for creating a key request.
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse newKeyRequest(com.zrchain.treasury.TxProto.MsgNewKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewKeyRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FulfilKeyRequest defines an operation for responding to a key request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse fulfilKeyRequest(com.zrchain.treasury.TxProto.MsgFulfilKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFulfilKeyRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewSignatureRequest defines an operation for creating a signature request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse newSignatureRequest(com.zrchain.treasury.TxProto.MsgNewSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewSignatureRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FulfilSignatureRequest defines an operation for returning a signature
     * response to a request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse fulfilSignatureRequest(com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFulfilSignatureRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewSignTransactionRequest defines an operation for creating a signature for
     * transaction request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse newSignTransactionRequest(com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewSignTransactionRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferFromKeyring defines an operation for transferring tokens from a
     * keyring
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse transferFromKeyring(com.zrchain.treasury.TxProto.MsgTransferFromKeyring request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferFromKeyringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewICATransactionRequest defines an operation for creating an interchain
     * account transaction request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse newICATransactionRequest(com.zrchain.treasury.TxProto.MsgNewICATransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewICATransactionRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * FulfilICATransactionRequest defines an operation for responding to an
     * interchain account transaction request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse fulfilICATransactionRequest(com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFulfilICATransactionRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewZrSignSignatureRequest defines an operation for creating a zrsign
     * signature request
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse newZrSignSignatureRequest(com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewZrSignSignatureRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateKeyPolicy defines an operation for updating a key policy
     * </pre>
     */
    public com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse updateKeyPolicy(com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateKeyPolicyMethod(), getCallOptions(), request);
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
     * <pre>
     * UpdateParams defines the operation for updating the module
     * parameters. The authority defaults to the x/gov module account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgUpdateParamsResponse> updateParams(
        com.zrchain.treasury.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewKeyRequest defines an operation for creating a key request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse> newKeyRequest(
        com.zrchain.treasury.TxProto.MsgNewKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewKeyRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FulfilKeyRequest defines an operation for responding to a key request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse> fulfilKeyRequest(
        com.zrchain.treasury.TxProto.MsgFulfilKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFulfilKeyRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewSignatureRequest defines an operation for creating a signature request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse> newSignatureRequest(
        com.zrchain.treasury.TxProto.MsgNewSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewSignatureRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FulfilSignatureRequest defines an operation for returning a signature
     * response to a request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse> fulfilSignatureRequest(
        com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFulfilSignatureRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewSignTransactionRequest defines an operation for creating a signature for
     * transaction request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse> newSignTransactionRequest(
        com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewSignTransactionRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferFromKeyring defines an operation for transferring tokens from a
     * keyring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse> transferFromKeyring(
        com.zrchain.treasury.TxProto.MsgTransferFromKeyring request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferFromKeyringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewICATransactionRequest defines an operation for creating an interchain
     * account transaction request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse> newICATransactionRequest(
        com.zrchain.treasury.TxProto.MsgNewICATransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewICATransactionRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * FulfilICATransactionRequest defines an operation for responding to an
     * interchain account transaction request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse> fulfilICATransactionRequest(
        com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFulfilICATransactionRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewZrSignSignatureRequest defines an operation for creating a zrsign
     * signature request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse> newZrSignSignatureRequest(
        com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewZrSignSignatureRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateKeyPolicy defines an operation for updating a key policy
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse> updateKeyPolicy(
        com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateKeyPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_PARAMS = 0;
  private static final int METHODID_NEW_KEY_REQUEST = 1;
  private static final int METHODID_FULFIL_KEY_REQUEST = 2;
  private static final int METHODID_NEW_SIGNATURE_REQUEST = 3;
  private static final int METHODID_FULFIL_SIGNATURE_REQUEST = 4;
  private static final int METHODID_NEW_SIGN_TRANSACTION_REQUEST = 5;
  private static final int METHODID_TRANSFER_FROM_KEYRING = 6;
  private static final int METHODID_NEW_ICATRANSACTION_REQUEST = 7;
  private static final int METHODID_FULFIL_ICATRANSACTION_REQUEST = 8;
  private static final int METHODID_NEW_ZR_SIGN_SIGNATURE_REQUEST = 9;
  private static final int METHODID_UPDATE_KEY_POLICY = 10;

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
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.zrchain.treasury.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateParamsResponse>) responseObserver);
          break;
        case METHODID_NEW_KEY_REQUEST:
          serviceImpl.newKeyRequest((com.zrchain.treasury.TxProto.MsgNewKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse>) responseObserver);
          break;
        case METHODID_FULFIL_KEY_REQUEST:
          serviceImpl.fulfilKeyRequest((com.zrchain.treasury.TxProto.MsgFulfilKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse>) responseObserver);
          break;
        case METHODID_NEW_SIGNATURE_REQUEST:
          serviceImpl.newSignatureRequest((com.zrchain.treasury.TxProto.MsgNewSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse>) responseObserver);
          break;
        case METHODID_FULFIL_SIGNATURE_REQUEST:
          serviceImpl.fulfilSignatureRequest((com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse>) responseObserver);
          break;
        case METHODID_NEW_SIGN_TRANSACTION_REQUEST:
          serviceImpl.newSignTransactionRequest((com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_FROM_KEYRING:
          serviceImpl.transferFromKeyring((com.zrchain.treasury.TxProto.MsgTransferFromKeyring) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse>) responseObserver);
          break;
        case METHODID_NEW_ICATRANSACTION_REQUEST:
          serviceImpl.newICATransactionRequest((com.zrchain.treasury.TxProto.MsgNewICATransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse>) responseObserver);
          break;
        case METHODID_FULFIL_ICATRANSACTION_REQUEST:
          serviceImpl.fulfilICATransactionRequest((com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse>) responseObserver);
          break;
        case METHODID_NEW_ZR_SIGN_SIGNATURE_REQUEST:
          serviceImpl.newZrSignSignatureRequest((com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse>) responseObserver);
          break;
        case METHODID_UPDATE_KEY_POLICY:
          serviceImpl.updateKeyPolicy((com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy) request,
              (io.grpc.stub.StreamObserver<com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse>) responseObserver);
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
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgUpdateParams,
              com.zrchain.treasury.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .addMethod(
          getNewKeyRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgNewKeyRequest,
              com.zrchain.treasury.TxProto.MsgNewKeyRequestResponse>(
                service, METHODID_NEW_KEY_REQUEST)))
        .addMethod(
          getFulfilKeyRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgFulfilKeyRequest,
              com.zrchain.treasury.TxProto.MsgFulfilKeyRequestResponse>(
                service, METHODID_FULFIL_KEY_REQUEST)))
        .addMethod(
          getNewSignatureRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgNewSignatureRequest,
              com.zrchain.treasury.TxProto.MsgNewSignatureRequestResponse>(
                service, METHODID_NEW_SIGNATURE_REQUEST)))
        .addMethod(
          getFulfilSignatureRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgFulfilSignatureRequest,
              com.zrchain.treasury.TxProto.MsgFulfilSignatureRequestResponse>(
                service, METHODID_FULFIL_SIGNATURE_REQUEST)))
        .addMethod(
          getNewSignTransactionRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgNewSignTransactionRequest,
              com.zrchain.treasury.TxProto.MsgNewSignTransactionRequestResponse>(
                service, METHODID_NEW_SIGN_TRANSACTION_REQUEST)))
        .addMethod(
          getTransferFromKeyringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgTransferFromKeyring,
              com.zrchain.treasury.TxProto.MsgTransferFromKeyringResponse>(
                service, METHODID_TRANSFER_FROM_KEYRING)))
        .addMethod(
          getNewICATransactionRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgNewICATransactionRequest,
              com.zrchain.treasury.TxProto.MsgNewICATransactionRequestResponse>(
                service, METHODID_NEW_ICATRANSACTION_REQUEST)))
        .addMethod(
          getFulfilICATransactionRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequest,
              com.zrchain.treasury.TxProto.MsgFulfilICATransactionRequestResponse>(
                service, METHODID_FULFIL_ICATRANSACTION_REQUEST)))
        .addMethod(
          getNewZrSignSignatureRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequest,
              com.zrchain.treasury.TxProto.MsgNewZrSignSignatureRequestResponse>(
                service, METHODID_NEW_ZR_SIGN_SIGNATURE_REQUEST)))
        .addMethod(
          getUpdateKeyPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.zrchain.treasury.TxProto.MsgUpdateKeyPolicy,
              com.zrchain.treasury.TxProto.MsgUpdateKeyPolicyResponse>(
                service, METHODID_UPDATE_KEY_POLICY)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zrchain.treasury.TxProto.getDescriptor();
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
              .addMethod(getUpdateParamsMethod())
              .addMethod(getNewKeyRequestMethod())
              .addMethod(getFulfilKeyRequestMethod())
              .addMethod(getNewSignatureRequestMethod())
              .addMethod(getFulfilSignatureRequestMethod())
              .addMethod(getNewSignTransactionRequestMethod())
              .addMethod(getTransferFromKeyringMethod())
              .addMethod(getNewICATransactionRequestMethod())
              .addMethod(getFulfilICATransactionRequestMethod())
              .addMethod(getNewZrSignSignatureRequestMethod())
              .addMethod(getUpdateKeyPolicyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
