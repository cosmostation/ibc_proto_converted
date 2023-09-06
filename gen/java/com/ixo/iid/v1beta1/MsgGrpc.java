package com.ixo.iid.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the identity Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ixo/iid/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "ixo.iid.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument,
      com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> getCreateIidDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIidDocument",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument,
      com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> getCreateIidDocumentMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument, com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> getCreateIidDocumentMethod;
    if ((getCreateIidDocumentMethod = MsgGrpc.getCreateIidDocumentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateIidDocumentMethod = MsgGrpc.getCreateIidDocumentMethod) == null) {
          MsgGrpc.getCreateIidDocumentMethod = getCreateIidDocumentMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument, com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIidDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateIidDocument"))
              .build();
        }
      }
    }
    return getCreateIidDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument,
      com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> getUpdateIidDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIidDocument",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument,
      com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> getUpdateIidDocumentMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument, com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> getUpdateIidDocumentMethod;
    if ((getUpdateIidDocumentMethod = MsgGrpc.getUpdateIidDocumentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateIidDocumentMethod = MsgGrpc.getUpdateIidDocumentMethod) == null) {
          MsgGrpc.getUpdateIidDocumentMethod = getUpdateIidDocumentMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument, com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIidDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateIidDocument"))
              .build();
        }
      }
    }
    return getUpdateIidDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddVerification,
      com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> getAddVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddVerification",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddVerification.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddVerification,
      com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> getAddVerificationMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddVerification, com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> getAddVerificationMethod;
    if ((getAddVerificationMethod = MsgGrpc.getAddVerificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddVerificationMethod = MsgGrpc.getAddVerificationMethod) == null) {
          MsgGrpc.getAddVerificationMethod = getAddVerificationMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddVerification, com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddVerification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddVerification"))
              .build();
        }
      }
    }
    return getAddVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification,
      com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> getRevokeVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeVerification",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification,
      com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> getRevokeVerificationMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification, com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> getRevokeVerificationMethod;
    if ((getRevokeVerificationMethod = MsgGrpc.getRevokeVerificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeVerificationMethod = MsgGrpc.getRevokeVerificationMethod) == null) {
          MsgGrpc.getRevokeVerificationMethod = getRevokeVerificationMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification, com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeVerification"))
              .build();
        }
      }
    }
    return getRevokeVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships,
      com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> getSetVerificationRelationshipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVerificationRelationships",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships,
      com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> getSetVerificationRelationshipsMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships, com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> getSetVerificationRelationshipsMethod;
    if ((getSetVerificationRelationshipsMethod = MsgGrpc.getSetVerificationRelationshipsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetVerificationRelationshipsMethod = MsgGrpc.getSetVerificationRelationshipsMethod) == null) {
          MsgGrpc.getSetVerificationRelationshipsMethod = getSetVerificationRelationshipsMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships, com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVerificationRelationships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetVerificationRelationships"))
              .build();
        }
      }
    }
    return getSetVerificationRelationshipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddService,
      com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> getAddServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddService",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddService.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddService,
      com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> getAddServiceMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddService, com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> getAddServiceMethod;
    if ((getAddServiceMethod = MsgGrpc.getAddServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddServiceMethod = MsgGrpc.getAddServiceMethod) == null) {
          MsgGrpc.getAddServiceMethod = getAddServiceMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddService, com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddService"))
              .build();
        }
      }
    }
    return getAddServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteService,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> getDeleteServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteService",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteService.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteService,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> getDeleteServiceMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteService, com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> getDeleteServiceMethod;
    if ((getDeleteServiceMethod = MsgGrpc.getDeleteServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteServiceMethod = MsgGrpc.getDeleteServiceMethod) == null) {
          MsgGrpc.getDeleteServiceMethod = getDeleteServiceMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteService, com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteService"))
              .build();
        }
      }
    }
    return getDeleteServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddController,
      com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> getAddControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddController",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddController.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddController,
      com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> getAddControllerMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddController, com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> getAddControllerMethod;
    if ((getAddControllerMethod = MsgGrpc.getAddControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddControllerMethod = MsgGrpc.getAddControllerMethod) == null) {
          MsgGrpc.getAddControllerMethod = getAddControllerMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddController, com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddController"))
              .build();
        }
      }
    }
    return getAddControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteController,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> getDeleteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteController",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteController.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteController,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> getDeleteControllerMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteController, com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> getDeleteControllerMethod;
    if ((getDeleteControllerMethod = MsgGrpc.getDeleteControllerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteControllerMethod = MsgGrpc.getDeleteControllerMethod) == null) {
          MsgGrpc.getDeleteControllerMethod = getDeleteControllerMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteController, com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteController.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteController"))
              .build();
        }
      }
    }
    return getDeleteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> getAddLinkedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLinkedResource",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> getAddLinkedResourceMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> getAddLinkedResourceMethod;
    if ((getAddLinkedResourceMethod = MsgGrpc.getAddLinkedResourceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLinkedResourceMethod = MsgGrpc.getAddLinkedResourceMethod) == null) {
          MsgGrpc.getAddLinkedResourceMethod = getAddLinkedResourceMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLinkedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLinkedResource"))
              .build();
        }
      }
    }
    return getAddLinkedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> getDeleteLinkedResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLinkedResource",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> getDeleteLinkedResourceMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> getDeleteLinkedResourceMethod;
    if ((getDeleteLinkedResourceMethod = MsgGrpc.getDeleteLinkedResourceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteLinkedResourceMethod = MsgGrpc.getDeleteLinkedResourceMethod) == null) {
          MsgGrpc.getDeleteLinkedResourceMethod = getDeleteLinkedResourceMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLinkedResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteLinkedResource"))
              .build();
        }
      }
    }
    return getDeleteLinkedResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> getAddLinkedClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLinkedClaim",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> getAddLinkedClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> getAddLinkedClaimMethod;
    if ((getAddLinkedClaimMethod = MsgGrpc.getAddLinkedClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLinkedClaimMethod = MsgGrpc.getAddLinkedClaimMethod) == null) {
          MsgGrpc.getAddLinkedClaimMethod = getAddLinkedClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLinkedClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLinkedClaim"))
              .build();
        }
      }
    }
    return getAddLinkedClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> getDeleteLinkedClaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLinkedClaim",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> getDeleteLinkedClaimMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> getDeleteLinkedClaimMethod;
    if ((getDeleteLinkedClaimMethod = MsgGrpc.getDeleteLinkedClaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteLinkedClaimMethod = MsgGrpc.getDeleteLinkedClaimMethod) == null) {
          MsgGrpc.getDeleteLinkedClaimMethod = getDeleteLinkedClaimMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLinkedClaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteLinkedClaim"))
              .build();
        }
      }
    }
    return getDeleteLinkedClaimMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> getAddLinkedEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLinkedEntity",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity,
      com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> getAddLinkedEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> getAddLinkedEntityMethod;
    if ((getAddLinkedEntityMethod = MsgGrpc.getAddLinkedEntityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddLinkedEntityMethod = MsgGrpc.getAddLinkedEntityMethod) == null) {
          MsgGrpc.getAddLinkedEntityMethod = getAddLinkedEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity, com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddLinkedEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddLinkedEntity"))
              .build();
        }
      }
    }
    return getAddLinkedEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> getDeleteLinkedEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLinkedEntity",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> getDeleteLinkedEntityMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> getDeleteLinkedEntityMethod;
    if ((getDeleteLinkedEntityMethod = MsgGrpc.getDeleteLinkedEntityMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteLinkedEntityMethod = MsgGrpc.getDeleteLinkedEntityMethod) == null) {
          MsgGrpc.getDeleteLinkedEntityMethod = getDeleteLinkedEntityMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity, com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLinkedEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteLinkedEntity"))
              .build();
        }
      }
    }
    return getDeleteLinkedEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight,
      com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> getAddAccordedRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAccordedRight",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight,
      com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> getAddAccordedRightMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight, com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> getAddAccordedRightMethod;
    if ((getAddAccordedRightMethod = MsgGrpc.getAddAccordedRightMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAccordedRightMethod = MsgGrpc.getAddAccordedRightMethod) == null) {
          MsgGrpc.getAddAccordedRightMethod = getAddAccordedRightMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight, com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAccordedRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAccordedRight"))
              .build();
        }
      }
    }
    return getAddAccordedRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> getDeleteAccordedRightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccordedRight",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> getDeleteAccordedRightMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight, com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> getDeleteAccordedRightMethod;
    if ((getDeleteAccordedRightMethod = MsgGrpc.getDeleteAccordedRightMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteAccordedRightMethod = MsgGrpc.getDeleteAccordedRightMethod) == null) {
          MsgGrpc.getDeleteAccordedRightMethod = getDeleteAccordedRightMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight, com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccordedRight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteAccordedRight"))
              .build();
        }
      }
    }
    return getDeleteAccordedRightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddIidContext,
      com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> getAddIidContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddIidContext",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgAddIidContext.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddIidContext,
      com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> getAddIidContextMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgAddIidContext, com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> getAddIidContextMethod;
    if ((getAddIidContextMethod = MsgGrpc.getAddIidContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddIidContextMethod = MsgGrpc.getAddIidContextMethod) == null) {
          MsgGrpc.getAddIidContextMethod = getAddIidContextMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgAddIidContext, com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddIidContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddIidContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddIidContext"))
              .build();
        }
      }
    }
    return getAddIidContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID,
      com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> getDeactivateIIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateIID",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID,
      com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> getDeactivateIIDMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID, com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> getDeactivateIIDMethod;
    if ((getDeactivateIIDMethod = MsgGrpc.getDeactivateIIDMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeactivateIIDMethod = MsgGrpc.getDeactivateIIDMethod) == null) {
          MsgGrpc.getDeactivateIIDMethod = getDeactivateIIDMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID, com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateIID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeactivateIID"))
              .build();
        }
      }
    }
    return getDeactivateIIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> getDeleteIidContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIidContext",
      requestType = com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext.class,
      responseType = com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext,
      com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> getDeleteIidContextMethod() {
    io.grpc.MethodDescriptor<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext, com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> getDeleteIidContextMethod;
    if ((getDeleteIidContextMethod = MsgGrpc.getDeleteIidContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteIidContextMethod = MsgGrpc.getDeleteIidContextMethod) == null) {
          MsgGrpc.getDeleteIidContextMethod = getDeleteIidContextMethod =
              io.grpc.MethodDescriptor.<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext, com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIidContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteIidContext"))
              .build();
        }
      }
    }
    return getDeleteIidContextMethod;
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
   * Msg defines the identity Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateDidDocument defines a method for creating a new identity.
     * </pre>
     */
    default void createIidDocument(com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIidDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDidDocument defines a method for updating an identity.
     * </pre>
     */
    default void updateIidDocument(com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIidDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddVerificationMethod adds a new verification method
     * </pre>
     */
    default void addVerification(com.ixo.iid.v1beta1.TxProto.MsgAddVerification request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeVerification remove the verification method and all associated
     * verification Relations
     * </pre>
     */
    default void revokeVerification(com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetVerificationRelationships overwrite current verification relationships
     * </pre>
     */
    default void setVerificationRelationships(com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVerificationRelationshipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    default void addService(com.ixo.iid.v1beta1.TxProto.MsgAddService request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    default void deleteService(com.ixo.iid.v1beta1.TxProto.MsgDeleteService request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    default void addController(com.ixo.iid.v1beta1.TxProto.MsgAddController request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    default void deleteController(com.ixo.iid.v1beta1.TxProto.MsgDeleteController request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Resource
     * </pre>
     */
    default void addLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLinkedResourceMethod(), responseObserver);
    }

    /**
     */
    default void deleteLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLinkedResourceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Claims
     * </pre>
     */
    default void addLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLinkedClaimMethod(), responseObserver);
    }

    /**
     */
    default void deleteLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLinkedClaimMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Entity
     * </pre>
     */
    default void addLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddLinkedEntityMethod(), responseObserver);
    }

    /**
     */
    default void deleteLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLinkedEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Accorded Right
     * </pre>
     */
    default void addAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAccordedRightMethod(), responseObserver);
    }

    /**
     */
    default void deleteAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccordedRightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Context
     * </pre>
     */
    default void addIidContext(com.ixo.iid.v1beta1.TxProto.MsgAddIidContext request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddIidContextMethod(), responseObserver);
    }

    /**
     */
    default void deactivateIID(com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateIIDMethod(), responseObserver);
    }

    /**
     */
    default void deleteIidContext(com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIidContextMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the identity Msg service.
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
   * Msg defines the identity Msg service.
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
     * CreateDidDocument defines a method for creating a new identity.
     * </pre>
     */
    public void createIidDocument(com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIidDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDidDocument defines a method for updating an identity.
     * </pre>
     */
    public void updateIidDocument(com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIidDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddVerificationMethod adds a new verification method
     * </pre>
     */
    public void addVerification(com.ixo.iid.v1beta1.TxProto.MsgAddVerification request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeVerification remove the verification method and all associated
     * verification Relations
     * </pre>
     */
    public void revokeVerification(com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetVerificationRelationships overwrite current verification relationships
     * </pre>
     */
    public void setVerificationRelationships(com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVerificationRelationshipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public void addService(com.ixo.iid.v1beta1.TxProto.MsgAddService request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public void deleteService(com.ixo.iid.v1beta1.TxProto.MsgDeleteService request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public void addController(com.ixo.iid.v1beta1.TxProto.MsgAddController request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public void deleteController(com.ixo.iid.v1beta1.TxProto.MsgDeleteController request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Resource
     * </pre>
     */
    public void addLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLinkedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLinkedResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Claims
     * </pre>
     */
    public void addLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLinkedClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLinkedClaimMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Linked Entity
     * </pre>
     */
    public void addLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddLinkedEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLinkedEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Accorded Right
     * </pre>
     */
    public void addAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAccordedRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccordedRightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add / Delete Context
     * </pre>
     */
    public void addIidContext(com.ixo.iid.v1beta1.TxProto.MsgAddIidContext request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddIidContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateIID(com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateIIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIidContext(com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext request,
        io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIidContextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the identity Msg service.
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
     * CreateDidDocument defines a method for creating a new identity.
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse createIidDocument(com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIidDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDidDocument defines a method for updating an identity.
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse updateIidDocument(com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIidDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddVerificationMethod adds a new verification method
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse addVerification(com.ixo.iid.v1beta1.TxProto.MsgAddVerification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeVerification remove the verification method and all associated
     * verification Relations
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse revokeVerification(com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetVerificationRelationships overwrite current verification relationships
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse setVerificationRelationships(com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVerificationRelationshipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse addService(com.ixo.iid.v1beta1.TxProto.MsgAddService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse deleteService(com.ixo.iid.v1beta1.TxProto.MsgDeleteService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse addController(com.ixo.iid.v1beta1.TxProto.MsgAddController request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse deleteController(com.ixo.iid.v1beta1.TxProto.MsgDeleteController request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Resource
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse addLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLinkedResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse deleteLinkedResource(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLinkedResourceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Claims
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse addLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLinkedClaimMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse deleteLinkedClaim(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLinkedClaimMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Entity
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse addLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddLinkedEntityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse deleteLinkedEntity(com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLinkedEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add / Delete Accorded Right
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse addAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAccordedRightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse deleteAccordedRight(com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccordedRightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add / Delete Context
     * </pre>
     */
    public com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse addIidContext(com.ixo.iid.v1beta1.TxProto.MsgAddIidContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddIidContextMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse deactivateIID(com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateIIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse deleteIidContext(com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIidContextMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the identity Msg service.
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
     * CreateDidDocument defines a method for creating a new identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse> createIidDocument(
        com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIidDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDidDocument defines a method for updating an identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse> updateIidDocument(
        com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIidDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddVerificationMethod adds a new verification method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse> addVerification(
        com.ixo.iid.v1beta1.TxProto.MsgAddVerification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeVerification remove the verification method and all associated
     * verification Relations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse> revokeVerification(
        com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetVerificationRelationships overwrite current verification relationships
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse> setVerificationRelationships(
        com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVerificationRelationshipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse> addService(
        com.ixo.iid.v1beta1.TxProto.MsgAddService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse> deleteService(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddService add a new service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse> addController(
        com.ixo.iid.v1beta1.TxProto.MsgAddController request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteService delete an existing service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse> deleteController(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteController request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Resource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse> addLinkedResource(
        com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLinkedResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse> deleteLinkedResource(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLinkedResourceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Claims
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse> addLinkedClaim(
        com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLinkedClaimMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse> deleteLinkedClaim(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLinkedClaimMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add / Delete Linked Entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse> addLinkedEntity(
        com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddLinkedEntityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse> deleteLinkedEntity(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLinkedEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add / Delete Accorded Right
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse> addAccordedRight(
        com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAccordedRightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse> deleteAccordedRight(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccordedRightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add / Delete Context
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse> addIidContext(
        com.ixo.iid.v1beta1.TxProto.MsgAddIidContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddIidContextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse> deactivateIID(
        com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateIIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse> deleteIidContext(
        com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIidContextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_IID_DOCUMENT = 0;
  private static final int METHODID_UPDATE_IID_DOCUMENT = 1;
  private static final int METHODID_ADD_VERIFICATION = 2;
  private static final int METHODID_REVOKE_VERIFICATION = 3;
  private static final int METHODID_SET_VERIFICATION_RELATIONSHIPS = 4;
  private static final int METHODID_ADD_SERVICE = 5;
  private static final int METHODID_DELETE_SERVICE = 6;
  private static final int METHODID_ADD_CONTROLLER = 7;
  private static final int METHODID_DELETE_CONTROLLER = 8;
  private static final int METHODID_ADD_LINKED_RESOURCE = 9;
  private static final int METHODID_DELETE_LINKED_RESOURCE = 10;
  private static final int METHODID_ADD_LINKED_CLAIM = 11;
  private static final int METHODID_DELETE_LINKED_CLAIM = 12;
  private static final int METHODID_ADD_LINKED_ENTITY = 13;
  private static final int METHODID_DELETE_LINKED_ENTITY = 14;
  private static final int METHODID_ADD_ACCORDED_RIGHT = 15;
  private static final int METHODID_DELETE_ACCORDED_RIGHT = 16;
  private static final int METHODID_ADD_IID_CONTEXT = 17;
  private static final int METHODID_DEACTIVATE_IID = 18;
  private static final int METHODID_DELETE_IID_CONTEXT = 19;

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
        case METHODID_CREATE_IID_DOCUMENT:
          serviceImpl.createIidDocument((com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IID_DOCUMENT:
          serviceImpl.updateIidDocument((com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse>) responseObserver);
          break;
        case METHODID_ADD_VERIFICATION:
          serviceImpl.addVerification((com.ixo.iid.v1beta1.TxProto.MsgAddVerification) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse>) responseObserver);
          break;
        case METHODID_REVOKE_VERIFICATION:
          serviceImpl.revokeVerification((com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse>) responseObserver);
          break;
        case METHODID_SET_VERIFICATION_RELATIONSHIPS:
          serviceImpl.setVerificationRelationships((com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse>) responseObserver);
          break;
        case METHODID_ADD_SERVICE:
          serviceImpl.addService((com.ixo.iid.v1beta1.TxProto.MsgAddService) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVICE:
          serviceImpl.deleteService((com.ixo.iid.v1beta1.TxProto.MsgDeleteService) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse>) responseObserver);
          break;
        case METHODID_ADD_CONTROLLER:
          serviceImpl.addController((com.ixo.iid.v1beta1.TxProto.MsgAddController) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTROLLER:
          serviceImpl.deleteController((com.ixo.iid.v1beta1.TxProto.MsgDeleteController) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse>) responseObserver);
          break;
        case METHODID_ADD_LINKED_RESOURCE:
          serviceImpl.addLinkedResource((com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse>) responseObserver);
          break;
        case METHODID_DELETE_LINKED_RESOURCE:
          serviceImpl.deleteLinkedResource((com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse>) responseObserver);
          break;
        case METHODID_ADD_LINKED_CLAIM:
          serviceImpl.addLinkedClaim((com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse>) responseObserver);
          break;
        case METHODID_DELETE_LINKED_CLAIM:
          serviceImpl.deleteLinkedClaim((com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse>) responseObserver);
          break;
        case METHODID_ADD_LINKED_ENTITY:
          serviceImpl.addLinkedEntity((com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse>) responseObserver);
          break;
        case METHODID_DELETE_LINKED_ENTITY:
          serviceImpl.deleteLinkedEntity((com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse>) responseObserver);
          break;
        case METHODID_ADD_ACCORDED_RIGHT:
          serviceImpl.addAccordedRight((com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse>) responseObserver);
          break;
        case METHODID_DELETE_ACCORDED_RIGHT:
          serviceImpl.deleteAccordedRight((com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse>) responseObserver);
          break;
        case METHODID_ADD_IID_CONTEXT:
          serviceImpl.addIidContext((com.ixo.iid.v1beta1.TxProto.MsgAddIidContext) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_IID:
          serviceImpl.deactivateIID((com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse>) responseObserver);
          break;
        case METHODID_DELETE_IID_CONTEXT:
          serviceImpl.deleteIidContext((com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext) request,
              (io.grpc.stub.StreamObserver<com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse>) responseObserver);
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
          getCreateIidDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocument,
              com.ixo.iid.v1beta1.TxProto.MsgCreateIidDocumentResponse>(
                service, METHODID_CREATE_IID_DOCUMENT)))
        .addMethod(
          getUpdateIidDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocument,
              com.ixo.iid.v1beta1.TxProto.MsgUpdateIidDocumentResponse>(
                service, METHODID_UPDATE_IID_DOCUMENT)))
        .addMethod(
          getAddVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddVerification,
              com.ixo.iid.v1beta1.TxProto.MsgAddVerificationResponse>(
                service, METHODID_ADD_VERIFICATION)))
        .addMethod(
          getRevokeVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgRevokeVerification,
              com.ixo.iid.v1beta1.TxProto.MsgRevokeVerificationResponse>(
                service, METHODID_REVOKE_VERIFICATION)))
        .addMethod(
          getSetVerificationRelationshipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationships,
              com.ixo.iid.v1beta1.TxProto.MsgSetVerificationRelationshipsResponse>(
                service, METHODID_SET_VERIFICATION_RELATIONSHIPS)))
        .addMethod(
          getAddServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddService,
              com.ixo.iid.v1beta1.TxProto.MsgAddServiceResponse>(
                service, METHODID_ADD_SERVICE)))
        .addMethod(
          getDeleteServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteService,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteServiceResponse>(
                service, METHODID_DELETE_SERVICE)))
        .addMethod(
          getAddControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddController,
              com.ixo.iid.v1beta1.TxProto.MsgAddControllerResponse>(
                service, METHODID_ADD_CONTROLLER)))
        .addMethod(
          getDeleteControllerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteController,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteControllerResponse>(
                service, METHODID_DELETE_CONTROLLER)))
        .addMethod(
          getAddLinkedResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResource,
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedResourceResponse>(
                service, METHODID_ADD_LINKED_RESOURCE)))
        .addMethod(
          getDeleteLinkedResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResource,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedResourceResponse>(
                service, METHODID_DELETE_LINKED_RESOURCE)))
        .addMethod(
          getAddLinkedClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaim,
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedClaimResponse>(
                service, METHODID_ADD_LINKED_CLAIM)))
        .addMethod(
          getDeleteLinkedClaimMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaim,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedClaimResponse>(
                service, METHODID_DELETE_LINKED_CLAIM)))
        .addMethod(
          getAddLinkedEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntity,
              com.ixo.iid.v1beta1.TxProto.MsgAddLinkedEntityResponse>(
                service, METHODID_ADD_LINKED_ENTITY)))
        .addMethod(
          getDeleteLinkedEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntity,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteLinkedEntityResponse>(
                service, METHODID_DELETE_LINKED_ENTITY)))
        .addMethod(
          getAddAccordedRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRight,
              com.ixo.iid.v1beta1.TxProto.MsgAddAccordedRightResponse>(
                service, METHODID_ADD_ACCORDED_RIGHT)))
        .addMethod(
          getDeleteAccordedRightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRight,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteAccordedRightResponse>(
                service, METHODID_DELETE_ACCORDED_RIGHT)))
        .addMethod(
          getAddIidContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgAddIidContext,
              com.ixo.iid.v1beta1.TxProto.MsgAddIidContextResponse>(
                service, METHODID_ADD_IID_CONTEXT)))
        .addMethod(
          getDeactivateIIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeactivateIID,
              com.ixo.iid.v1beta1.TxProto.MsgDeactivateIIDResponse>(
                service, METHODID_DEACTIVATE_IID)))
        .addMethod(
          getDeleteIidContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContext,
              com.ixo.iid.v1beta1.TxProto.MsgDeleteIidContextResponse>(
                service, METHODID_DELETE_IID_CONTEXT)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ixo.iid.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getCreateIidDocumentMethod())
              .addMethod(getUpdateIidDocumentMethod())
              .addMethod(getAddVerificationMethod())
              .addMethod(getRevokeVerificationMethod())
              .addMethod(getSetVerificationRelationshipsMethod())
              .addMethod(getAddServiceMethod())
              .addMethod(getDeleteServiceMethod())
              .addMethod(getAddControllerMethod())
              .addMethod(getDeleteControllerMethod())
              .addMethod(getAddLinkedResourceMethod())
              .addMethod(getDeleteLinkedResourceMethod())
              .addMethod(getAddLinkedClaimMethod())
              .addMethod(getDeleteLinkedClaimMethod())
              .addMethod(getAddLinkedEntityMethod())
              .addMethod(getDeleteLinkedEntityMethod())
              .addMethod(getAddAccordedRightMethod())
              .addMethod(getDeleteAccordedRightMethod())
              .addMethod(getAddIidContextMethod())
              .addMethod(getDeactivateIIDMethod())
              .addMethod(getDeleteIidContextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
