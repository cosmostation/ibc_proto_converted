package com.starnamed.x.starname.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the starname Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: iov/starname/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "starnamed.x.starname.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate,
      com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> getAddAccountCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAccountCertificate",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate,
      com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> getAddAccountCertificateMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate, com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> getAddAccountCertificateMethod;
    if ((getAddAccountCertificateMethod = MsgGrpc.getAddAccountCertificateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAccountCertificateMethod = MsgGrpc.getAddAccountCertificateMethod) == null) {
          MsgGrpc.getAddAccountCertificateMethod = getAddAccountCertificateMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate, com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAccountCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAccountCertificate"))
              .build();
        }
      }
    }
    return getAddAccountCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccount",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = MsgGrpc.getDeleteAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteAccountMethod = MsgGrpc.getDeleteAccountMethod) == null) {
          MsgGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> getDeleteAccountCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccountCertificate",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> getDeleteAccountCertificateMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> getDeleteAccountCertificateMethod;
    if ((getDeleteAccountCertificateMethod = MsgGrpc.getDeleteAccountCertificateMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteAccountCertificateMethod = MsgGrpc.getDeleteAccountCertificateMethod) == null) {
          MsgGrpc.getDeleteAccountCertificateMethod = getDeleteAccountCertificateMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccountCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteAccountCertificate"))
              .build();
        }
      }
    }
    return getDeleteAccountCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> getDeleteDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomain",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> getDeleteDomainMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> getDeleteDomainMethod;
    if ((getDeleteDomainMethod = MsgGrpc.getDeleteDomainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteDomainMethod = MsgGrpc.getDeleteDomainMethod) == null) {
          MsgGrpc.getDeleteDomainMethod = getDeleteDomainMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteDomain"))
              .build();
        }
      }
    }
    return getDeleteDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAccount",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterAccountMethod = MsgGrpc.getRegisterAccountMethod) == null) {
          MsgGrpc.getRegisterAccountMethod = getRegisterAccountMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterAccount"))
              .build();
        }
      }
    }
    return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> getRegisterDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterDomain",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> getRegisterDomainMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> getRegisterDomainMethod;
    if ((getRegisterDomainMethod = MsgGrpc.getRegisterDomainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRegisterDomainMethod = MsgGrpc.getRegisterDomainMethod) == null) {
          MsgGrpc.getRegisterDomainMethod = getRegisterDomainMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RegisterDomain"))
              .build();
        }
      }
    }
    return getRegisterDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> getRenewAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewAccount",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> getRenewAccountMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> getRenewAccountMethod;
    if ((getRenewAccountMethod = MsgGrpc.getRenewAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRenewAccountMethod = MsgGrpc.getRenewAccountMethod) == null) {
          MsgGrpc.getRenewAccountMethod = getRenewAccountMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RenewAccount"))
              .build();
        }
      }
    }
    return getRenewAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> getRenewDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewDomain",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> getRenewDomainMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> getRenewDomainMethod;
    if ((getRenewDomainMethod = MsgGrpc.getRenewDomainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRenewDomainMethod = MsgGrpc.getRenewDomainMethod) == null) {
          MsgGrpc.getRenewDomainMethod = getRenewDomainMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RenewDomain"))
              .build();
        }
      }
    }
    return getRenewDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata,
      com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> getReplaceAccountMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceAccountMetadata",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata,
      com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> getReplaceAccountMetadataMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata, com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> getReplaceAccountMetadataMethod;
    if ((getReplaceAccountMetadataMethod = MsgGrpc.getReplaceAccountMetadataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReplaceAccountMetadataMethod = MsgGrpc.getReplaceAccountMetadataMethod) == null) {
          MsgGrpc.getReplaceAccountMetadataMethod = getReplaceAccountMetadataMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata, com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceAccountMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReplaceAccountMetadata"))
              .build();
        }
      }
    }
    return getReplaceAccountMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources,
      com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> getReplaceAccountResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplaceAccountResources",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources,
      com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> getReplaceAccountResourcesMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources, com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> getReplaceAccountResourcesMethod;
    if ((getReplaceAccountResourcesMethod = MsgGrpc.getReplaceAccountResourcesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReplaceAccountResourcesMethod = MsgGrpc.getReplaceAccountResourcesMethod) == null) {
          MsgGrpc.getReplaceAccountResourcesMethod = getReplaceAccountResourcesMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources, com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplaceAccountResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ReplaceAccountResources"))
              .build();
        }
      }
    }
    return getReplaceAccountResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> getTransferAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferAccount",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount,
      com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> getTransferAccountMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> getTransferAccountMethod;
    if ((getTransferAccountMethod = MsgGrpc.getTransferAccountMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferAccountMethod = MsgGrpc.getTransferAccountMethod) == null) {
          MsgGrpc.getTransferAccountMethod = getTransferAccountMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount, com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferAccount"))
              .build();
        }
      }
    }
    return getTransferAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> getTransferDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferDomain",
      requestType = com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain.class,
      responseType = com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain,
      com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> getTransferDomainMethod() {
    io.grpc.MethodDescriptor<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> getTransferDomainMethod;
    if ((getTransferDomainMethod = MsgGrpc.getTransferDomainMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferDomainMethod = MsgGrpc.getTransferDomainMethod) == null) {
          MsgGrpc.getTransferDomainMethod = getTransferDomainMethod =
              io.grpc.MethodDescriptor.<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain, com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferDomain"))
              .build();
        }
      }
    }
    return getTransferDomainMethod;
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
   * Msg defines the starname Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AddAccountCertificate adds a certificate to an Account
     * </pre>
     */
    default void addAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAccountCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAccount registers a Domain
     * </pre>
     */
    default void deleteAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAccountCertificate deletes a certificate from an account
     * </pre>
     */
    default void deleteAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountCertificateMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDomain registers a Domain
     * </pre>
     */
    default void deleteDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisterAccount registers an Account
     * </pre>
     */
    default void registerAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * RegisterDomain registers a Domain
     * </pre>
     */
    default void registerDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenewAccount registers a Domain
     * </pre>
     */
    default void renewAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * RenewDomain registers a Domain
     * </pre>
     */
    default void renewDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewDomainMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReplaceAccountMetadata registers a Domain
     * </pre>
     */
    default void replaceAccountMetadata(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceAccountMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReplaceAccountResources registers a Domain
     * </pre>
     */
    default void replaceAccountResources(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceAccountResourcesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferAccount registers a Domain
     * </pre>
     */
    default void transferAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferDomain registers a Domain
     * </pre>
     */
    default void transferDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferDomainMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the starname Msg service.
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
   * Msg defines the starname Msg service.
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
     * AddAccountCertificate adds a certificate to an Account
     * </pre>
     */
    public void addAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAccountCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAccount registers a Domain
     * </pre>
     */
    public void deleteAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAccountCertificate deletes a certificate from an account
     * </pre>
     */
    public void deleteAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDomain registers a Domain
     * </pre>
     */
    public void deleteDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisterAccount registers an Account
     * </pre>
     */
    public void registerAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RegisterDomain registers a Domain
     * </pre>
     */
    public void registerDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenewAccount registers a Domain
     * </pre>
     */
    public void renewAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RenewDomain registers a Domain
     * </pre>
     */
    public void renewDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReplaceAccountMetadata registers a Domain
     * </pre>
     */
    public void replaceAccountMetadata(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceAccountMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReplaceAccountResources registers a Domain
     * </pre>
     */
    public void replaceAccountResources(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceAccountResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferAccount registers a Domain
     * </pre>
     */
    public void transferAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferDomain registers a Domain
     * </pre>
     */
    public void transferDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain request,
        io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferDomainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the starname Msg service.
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
     * AddAccountCertificate adds a certificate to an Account
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse addAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAccountCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAccount registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse deleteAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAccountCertificate deletes a certificate from an account
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse deleteAccountCertificate(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountCertificateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDomain registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse deleteDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisterAccount registers an Account
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse registerAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RegisterDomain registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse registerDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenewAccount registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse renewAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RenewDomain registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse renewDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewDomainMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReplaceAccountMetadata registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse replaceAccountMetadata(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceAccountMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReplaceAccountResources registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse replaceAccountResources(com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceAccountResourcesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferAccount registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse transferAccount(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferDomain registers a Domain
     * </pre>
     */
    public com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse transferDomain(com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferDomainMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the starname Msg service.
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
     * AddAccountCertificate adds a certificate to an Account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse> addAccountCertificate(
        com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAccountCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAccount registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse> deleteAccount(
        com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAccountCertificate deletes a certificate from an account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse> deleteAccountCertificate(
        com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountCertificateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDomain registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse> deleteDomain(
        com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisterAccount registers an Account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse> registerAccount(
        com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RegisterDomain registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse> registerDomain(
        com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenewAccount registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse> renewAccount(
        com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RenewDomain registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse> renewDomain(
        com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewDomainMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReplaceAccountMetadata registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse> replaceAccountMetadata(
        com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceAccountMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReplaceAccountResources registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse> replaceAccountResources(
        com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceAccountResourcesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferAccount registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse> transferAccount(
        com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferDomain registers a Domain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse> transferDomain(
        com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferDomainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ACCOUNT_CERTIFICATE = 0;
  private static final int METHODID_DELETE_ACCOUNT = 1;
  private static final int METHODID_DELETE_ACCOUNT_CERTIFICATE = 2;
  private static final int METHODID_DELETE_DOMAIN = 3;
  private static final int METHODID_REGISTER_ACCOUNT = 4;
  private static final int METHODID_REGISTER_DOMAIN = 5;
  private static final int METHODID_RENEW_ACCOUNT = 6;
  private static final int METHODID_RENEW_DOMAIN = 7;
  private static final int METHODID_REPLACE_ACCOUNT_METADATA = 8;
  private static final int METHODID_REPLACE_ACCOUNT_RESOURCES = 9;
  private static final int METHODID_TRANSFER_ACCOUNT = 10;
  private static final int METHODID_TRANSFER_DOMAIN = 11;

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
        case METHODID_ADD_ACCOUNT_CERTIFICATE:
          serviceImpl.addAccountCertificate((com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT_CERTIFICATE:
          serviceImpl.deleteAccountCertificate((com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN:
          serviceImpl.deleteDomain((com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse>) responseObserver);
          break;
        case METHODID_REGISTER_ACCOUNT:
          serviceImpl.registerAccount((com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse>) responseObserver);
          break;
        case METHODID_REGISTER_DOMAIN:
          serviceImpl.registerDomain((com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse>) responseObserver);
          break;
        case METHODID_RENEW_ACCOUNT:
          serviceImpl.renewAccount((com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse>) responseObserver);
          break;
        case METHODID_RENEW_DOMAIN:
          serviceImpl.renewDomain((com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse>) responseObserver);
          break;
        case METHODID_REPLACE_ACCOUNT_METADATA:
          serviceImpl.replaceAccountMetadata((com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse>) responseObserver);
          break;
        case METHODID_REPLACE_ACCOUNT_RESOURCES:
          serviceImpl.replaceAccountResources((com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_ACCOUNT:
          serviceImpl.transferAccount((com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_DOMAIN:
          serviceImpl.transferDomain((com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain) request,
              (io.grpc.stub.StreamObserver<com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse>) responseObserver);
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
          getAddAccountCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificate,
              com.starnamed.x.starname.v1beta1.TxProto.MsgAddAccountCertificateResponse>(
                service, METHODID_ADD_ACCOUNT_CERTIFICATE)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccount,
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountResponse>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getDeleteAccountCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificate,
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteAccountCertificateResponse>(
                service, METHODID_DELETE_ACCOUNT_CERTIFICATE)))
        .addMethod(
          getDeleteDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomain,
              com.starnamed.x.starname.v1beta1.TxProto.MsgDeleteDomainResponse>(
                service, METHODID_DELETE_DOMAIN)))
        .addMethod(
          getRegisterAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccount,
              com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterAccountResponse>(
                service, METHODID_REGISTER_ACCOUNT)))
        .addMethod(
          getRegisterDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomain,
              com.starnamed.x.starname.v1beta1.TxProto.MsgRegisterDomainResponse>(
                service, METHODID_REGISTER_DOMAIN)))
        .addMethod(
          getRenewAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccount,
              com.starnamed.x.starname.v1beta1.TxProto.MsgRenewAccountResponse>(
                service, METHODID_RENEW_ACCOUNT)))
        .addMethod(
          getRenewDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomain,
              com.starnamed.x.starname.v1beta1.TxProto.MsgRenewDomainResponse>(
                service, METHODID_RENEW_DOMAIN)))
        .addMethod(
          getReplaceAccountMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadata,
              com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountMetadataResponse>(
                service, METHODID_REPLACE_ACCOUNT_METADATA)))
        .addMethod(
          getReplaceAccountResourcesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResources,
              com.starnamed.x.starname.v1beta1.TxProto.MsgReplaceAccountResourcesResponse>(
                service, METHODID_REPLACE_ACCOUNT_RESOURCES)))
        .addMethod(
          getTransferAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccount,
              com.starnamed.x.starname.v1beta1.TxProto.MsgTransferAccountResponse>(
                service, METHODID_TRANSFER_ACCOUNT)))
        .addMethod(
          getTransferDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomain,
              com.starnamed.x.starname.v1beta1.TxProto.MsgTransferDomainResponse>(
                service, METHODID_TRANSFER_DOMAIN)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.starnamed.x.starname.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getAddAccountCertificateMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getDeleteAccountCertificateMethod())
              .addMethod(getDeleteDomainMethod())
              .addMethod(getRegisterAccountMethod())
              .addMethod(getRegisterDomainMethod())
              .addMethod(getRenewAccountMethod())
              .addMethod(getRenewDomainMethod())
              .addMethod(getReplaceAccountMetadataMethod())
              .addMethod(getReplaceAccountResourcesMethod())
              .addMethod(getTransferAccountMethod())
              .addMethod(getTransferDomainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
