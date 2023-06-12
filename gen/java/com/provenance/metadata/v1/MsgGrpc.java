package com.provenance.metadata.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Metadata Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: provenance/metadata/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "provenance.metadata.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeRequest,
      com.provenance.metadata.v1.MsgWriteScopeResponse> getWriteScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteScope",
      requestType = com.provenance.metadata.v1.MsgWriteScopeRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeRequest,
      com.provenance.metadata.v1.MsgWriteScopeResponse> getWriteScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeRequest, com.provenance.metadata.v1.MsgWriteScopeResponse> getWriteScopeMethod;
    if ((getWriteScopeMethod = MsgGrpc.getWriteScopeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteScopeMethod = MsgGrpc.getWriteScopeMethod) == null) {
          MsgGrpc.getWriteScopeMethod = getWriteScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteScopeRequest, com.provenance.metadata.v1.MsgWriteScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteScope"))
              .build();
        }
      }
    }
    return getWriteScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeRequest,
      com.provenance.metadata.v1.MsgDeleteScopeResponse> getDeleteScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScope",
      requestType = com.provenance.metadata.v1.MsgDeleteScopeRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeRequest,
      com.provenance.metadata.v1.MsgDeleteScopeResponse> getDeleteScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeRequest, com.provenance.metadata.v1.MsgDeleteScopeResponse> getDeleteScopeMethod;
    if ((getDeleteScopeMethod = MsgGrpc.getDeleteScopeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeMethod = MsgGrpc.getDeleteScopeMethod) == null) {
          MsgGrpc.getDeleteScopeMethod = getDeleteScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteScopeRequest, com.provenance.metadata.v1.MsgDeleteScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScope"))
              .build();
        }
      }
    }
    return getDeleteScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeDataAccessRequest,
      com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScopeDataAccess",
      requestType = com.provenance.metadata.v1.MsgAddScopeDataAccessRequest.class,
      responseType = com.provenance.metadata.v1.MsgAddScopeDataAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeDataAccessRequest,
      com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeDataAccessRequest, com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod;
    if ((getAddScopeDataAccessMethod = MsgGrpc.getAddScopeDataAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddScopeDataAccessMethod = MsgGrpc.getAddScopeDataAccessMethod) == null) {
          MsgGrpc.getAddScopeDataAccessMethod = getAddScopeDataAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgAddScopeDataAccessRequest, com.provenance.metadata.v1.MsgAddScopeDataAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScopeDataAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddScopeDataAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddScopeDataAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddScopeDataAccess"))
              .build();
        }
      }
    }
    return getAddScopeDataAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest,
      com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeDataAccess",
      requestType = com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest,
      com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest, com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod;
    if ((getDeleteScopeDataAccessMethod = MsgGrpc.getDeleteScopeDataAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeDataAccessMethod = MsgGrpc.getDeleteScopeDataAccessMethod) == null) {
          MsgGrpc.getDeleteScopeDataAccessMethod = getDeleteScopeDataAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest, com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeDataAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeDataAccess"))
              .build();
        }
      }
    }
    return getDeleteScopeDataAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeOwnerRequest,
      com.provenance.metadata.v1.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScopeOwner",
      requestType = com.provenance.metadata.v1.MsgAddScopeOwnerRequest.class,
      responseType = com.provenance.metadata.v1.MsgAddScopeOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeOwnerRequest,
      com.provenance.metadata.v1.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddScopeOwnerRequest, com.provenance.metadata.v1.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod;
    if ((getAddScopeOwnerMethod = MsgGrpc.getAddScopeOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddScopeOwnerMethod = MsgGrpc.getAddScopeOwnerMethod) == null) {
          MsgGrpc.getAddScopeOwnerMethod = getAddScopeOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgAddScopeOwnerRequest, com.provenance.metadata.v1.MsgAddScopeOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScopeOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddScopeOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddScopeOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddScopeOwner"))
              .build();
        }
      }
    }
    return getAddScopeOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest,
      com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeOwner",
      requestType = com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest,
      com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest, com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod;
    if ((getDeleteScopeOwnerMethod = MsgGrpc.getDeleteScopeOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeOwnerMethod = MsgGrpc.getDeleteScopeOwnerMethod) == null) {
          MsgGrpc.getDeleteScopeOwnerMethod = getDeleteScopeOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest, com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeOwner"))
              .build();
        }
      }
    }
    return getDeleteScopeOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgUpdateValueOwnersRequest,
      com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateValueOwners",
      requestType = com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.class,
      responseType = com.provenance.metadata.v1.MsgUpdateValueOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgUpdateValueOwnersRequest,
      com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgUpdateValueOwnersRequest, com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod;
    if ((getUpdateValueOwnersMethod = MsgGrpc.getUpdateValueOwnersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateValueOwnersMethod = MsgGrpc.getUpdateValueOwnersMethod) == null) {
          MsgGrpc.getUpdateValueOwnersMethod = getUpdateValueOwnersMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgUpdateValueOwnersRequest, com.provenance.metadata.v1.MsgUpdateValueOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateValueOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgUpdateValueOwnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateValueOwners"))
              .build();
        }
      }
    }
    return getUpdateValueOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgMigrateValueOwnerRequest,
      com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateValueOwner",
      requestType = com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.class,
      responseType = com.provenance.metadata.v1.MsgMigrateValueOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgMigrateValueOwnerRequest,
      com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgMigrateValueOwnerRequest, com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod;
    if ((getMigrateValueOwnerMethod = MsgGrpc.getMigrateValueOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateValueOwnerMethod = MsgGrpc.getMigrateValueOwnerMethod) == null) {
          MsgGrpc.getMigrateValueOwnerMethod = getMigrateValueOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgMigrateValueOwnerRequest, com.provenance.metadata.v1.MsgMigrateValueOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateValueOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgMigrateValueOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateValueOwner"))
              .build();
        }
      }
    }
    return getMigrateValueOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteSessionRequest,
      com.provenance.metadata.v1.MsgWriteSessionResponse> getWriteSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteSession",
      requestType = com.provenance.metadata.v1.MsgWriteSessionRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteSessionRequest,
      com.provenance.metadata.v1.MsgWriteSessionResponse> getWriteSessionMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteSessionRequest, com.provenance.metadata.v1.MsgWriteSessionResponse> getWriteSessionMethod;
    if ((getWriteSessionMethod = MsgGrpc.getWriteSessionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteSessionMethod = MsgGrpc.getWriteSessionMethod) == null) {
          MsgGrpc.getWriteSessionMethod = getWriteSessionMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteSessionRequest, com.provenance.metadata.v1.MsgWriteSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteSession"))
              .build();
        }
      }
    }
    return getWriteSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordRequest,
      com.provenance.metadata.v1.MsgWriteRecordResponse> getWriteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecord",
      requestType = com.provenance.metadata.v1.MsgWriteRecordRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordRequest,
      com.provenance.metadata.v1.MsgWriteRecordResponse> getWriteRecordMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordRequest, com.provenance.metadata.v1.MsgWriteRecordResponse> getWriteRecordMethod;
    if ((getWriteRecordMethod = MsgGrpc.getWriteRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteRecordMethod = MsgGrpc.getWriteRecordMethod) == null) {
          MsgGrpc.getWriteRecordMethod = getWriteRecordMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteRecordRequest, com.provenance.metadata.v1.MsgWriteRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteRecord"))
              .build();
        }
      }
    }
    return getWriteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordRequest,
      com.provenance.metadata.v1.MsgDeleteRecordResponse> getDeleteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRecord",
      requestType = com.provenance.metadata.v1.MsgDeleteRecordRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordRequest,
      com.provenance.metadata.v1.MsgDeleteRecordResponse> getDeleteRecordMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordRequest, com.provenance.metadata.v1.MsgDeleteRecordResponse> getDeleteRecordMethod;
    if ((getDeleteRecordMethod = MsgGrpc.getDeleteRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRecordMethod = MsgGrpc.getDeleteRecordMethod) == null) {
          MsgGrpc.getDeleteRecordMethod = getDeleteRecordMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteRecordRequest, com.provenance.metadata.v1.MsgDeleteRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRecord"))
              .build();
        }
      }
    }
    return getDeleteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteScopeSpecification",
      requestType = com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest, com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod;
    if ((getWriteScopeSpecificationMethod = MsgGrpc.getWriteScopeSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteScopeSpecificationMethod = MsgGrpc.getWriteScopeSpecificationMethod) == null) {
          MsgGrpc.getWriteScopeSpecificationMethod = getWriteScopeSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest, com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteScopeSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteScopeSpecification"))
              .build();
        }
      }
    }
    return getWriteScopeSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeSpecification",
      requestType = com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest, com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod;
    if ((getDeleteScopeSpecificationMethod = MsgGrpc.getDeleteScopeSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeSpecificationMethod = MsgGrpc.getDeleteScopeSpecificationMethod) == null) {
          MsgGrpc.getDeleteScopeSpecificationMethod = getDeleteScopeSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest, com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeSpecification"))
              .build();
        }
      }
    }
    return getDeleteScopeSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteContractSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteContractSpecification",
      requestType = com.provenance.metadata.v1.MsgWriteContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteContractSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteContractSpecificationRequest, com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod;
    if ((getWriteContractSpecificationMethod = MsgGrpc.getWriteContractSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteContractSpecificationMethod = MsgGrpc.getWriteContractSpecificationMethod) == null) {
          MsgGrpc.getWriteContractSpecificationMethod = getWriteContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteContractSpecificationRequest, com.provenance.metadata.v1.MsgWriteContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteContractSpecification"))
              .build();
        }
      }
    }
    return getWriteContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContractSpecification",
      requestType = com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest, com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod;
    if ((getDeleteContractSpecificationMethod = MsgGrpc.getDeleteContractSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteContractSpecificationMethod = MsgGrpc.getDeleteContractSpecificationMethod) == null) {
          MsgGrpc.getDeleteContractSpecificationMethod = getDeleteContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest, com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteContractSpecification"))
              .build();
        }
      }
    }
    return getDeleteContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest,
      com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContractSpecToScopeSpec",
      requestType = com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.class,
      responseType = com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest,
      com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest, com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod;
    if ((getAddContractSpecToScopeSpecMethod = MsgGrpc.getAddContractSpecToScopeSpecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddContractSpecToScopeSpecMethod = MsgGrpc.getAddContractSpecToScopeSpecMethod) == null) {
          MsgGrpc.getAddContractSpecToScopeSpecMethod = getAddContractSpecToScopeSpecMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest, com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContractSpecToScopeSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddContractSpecToScopeSpec"))
              .build();
        }
      }
    }
    return getAddContractSpecToScopeSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest,
      com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContractSpecFromScopeSpec",
      requestType = com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest,
      com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest, com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod;
    if ((getDeleteContractSpecFromScopeSpecMethod = MsgGrpc.getDeleteContractSpecFromScopeSpecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteContractSpecFromScopeSpecMethod = MsgGrpc.getDeleteContractSpecFromScopeSpecMethod) == null) {
          MsgGrpc.getDeleteContractSpecFromScopeSpecMethod = getDeleteContractSpecFromScopeSpecMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest, com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContractSpecFromScopeSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteContractSpecFromScopeSpec"))
              .build();
        }
      }
    }
    return getDeleteContractSpecFromScopeSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecordSpecification",
      requestType = com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest,
      com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest, com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod;
    if ((getWriteRecordSpecificationMethod = MsgGrpc.getWriteRecordSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteRecordSpecificationMethod = MsgGrpc.getWriteRecordSpecificationMethod) == null) {
          MsgGrpc.getWriteRecordSpecificationMethod = getWriteRecordSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest, com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteRecordSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteRecordSpecification"))
              .build();
        }
      }
    }
    return getWriteRecordSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRecordSpecification",
      requestType = com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest,
      com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest, com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod;
    if ((getDeleteRecordSpecificationMethod = MsgGrpc.getDeleteRecordSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRecordSpecificationMethod = MsgGrpc.getDeleteRecordSpecificationMethod) == null) {
          MsgGrpc.getDeleteRecordSpecificationMethod = getDeleteRecordSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest, com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRecordSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRecordSpecification"))
              .build();
        }
      }
    }
    return getDeleteRecordSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgBindOSLocatorRequest,
      com.provenance.metadata.v1.MsgBindOSLocatorResponse> getBindOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindOSLocator",
      requestType = com.provenance.metadata.v1.MsgBindOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.MsgBindOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgBindOSLocatorRequest,
      com.provenance.metadata.v1.MsgBindOSLocatorResponse> getBindOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgBindOSLocatorRequest, com.provenance.metadata.v1.MsgBindOSLocatorResponse> getBindOSLocatorMethod;
    if ((getBindOSLocatorMethod = MsgGrpc.getBindOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindOSLocatorMethod = MsgGrpc.getBindOSLocatorMethod) == null) {
          MsgGrpc.getBindOSLocatorMethod = getBindOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgBindOSLocatorRequest, com.provenance.metadata.v1.MsgBindOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgBindOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgBindOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindOSLocator"))
              .build();
        }
      }
    }
    return getBindOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteOSLocatorRequest,
      com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOSLocator",
      requestType = com.provenance.metadata.v1.MsgDeleteOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.MsgDeleteOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteOSLocatorRequest,
      com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgDeleteOSLocatorRequest, com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod;
    if ((getDeleteOSLocatorMethod = MsgGrpc.getDeleteOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteOSLocatorMethod = MsgGrpc.getDeleteOSLocatorMethod) == null) {
          MsgGrpc.getDeleteOSLocatorMethod = getDeleteOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgDeleteOSLocatorRequest, com.provenance.metadata.v1.MsgDeleteOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgDeleteOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteOSLocator"))
              .build();
        }
      }
    }
    return getDeleteOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgModifyOSLocatorRequest,
      com.provenance.metadata.v1.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyOSLocator",
      requestType = com.provenance.metadata.v1.MsgModifyOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.MsgModifyOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgModifyOSLocatorRequest,
      com.provenance.metadata.v1.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgModifyOSLocatorRequest, com.provenance.metadata.v1.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod;
    if ((getModifyOSLocatorMethod = MsgGrpc.getModifyOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getModifyOSLocatorMethod = MsgGrpc.getModifyOSLocatorMethod) == null) {
          MsgGrpc.getModifyOSLocatorMethod = getModifyOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgModifyOSLocatorRequest, com.provenance.metadata.v1.MsgModifyOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgModifyOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgModifyOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ModifyOSLocator"))
              .build();
        }
      }
    }
    return getModifyOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgSetAccountDataRequest,
      com.provenance.metadata.v1.MsgSetAccountDataResponse> getSetAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountData",
      requestType = com.provenance.metadata.v1.MsgSetAccountDataRequest.class,
      responseType = com.provenance.metadata.v1.MsgSetAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgSetAccountDataRequest,
      com.provenance.metadata.v1.MsgSetAccountDataResponse> getSetAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.MsgSetAccountDataRequest, com.provenance.metadata.v1.MsgSetAccountDataResponse> getSetAccountDataMethod;
    if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
          MsgGrpc.getSetAccountDataMethod = getSetAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.MsgSetAccountDataRequest, com.provenance.metadata.v1.MsgSetAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgSetAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.MsgSetAccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAccountData"))
              .build();
        }
      }
    }
    return getSetAccountDataMethod;
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
   * Msg defines the Metadata Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * WriteScope adds or updates a scope.
     * </pre>
     */
    default void writeScope(com.provenance.metadata.v1.MsgWriteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    default void deleteScope(com.provenance.metadata.v1.MsgDeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    default void addScopeDataAccess(com.provenance.metadata.v1.MsgAddScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScopeDataAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    default void deleteScopeDataAccess(com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeDataAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    default void addScopeOwner(com.provenance.metadata.v1.MsgAddScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScopeOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    default void deleteScopeOwner(com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    default void updateValueOwners(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateValueOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    default void migrateValueOwner(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateValueOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    default void writeSession(com.provenance.metadata.v1.MsgWriteSessionRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    default void writeRecord(com.provenance.metadata.v1.MsgWriteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    default void deleteRecord(com.provenance.metadata.v1.MsgDeleteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    default void writeScopeSpecification(com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteScopeSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    default void deleteScopeSpecification(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    default void writeContractSpecification(com.provenance.metadata.v1.MsgWriteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    default void deleteContractSpecification(com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    default void addContractSpecToScopeSpec(com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContractSpecToScopeSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    default void deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteContractSpecFromScopeSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    default void writeRecordSpecification(com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteRecordSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    default void deleteRecordSpecification(com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecordSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    default void bindOSLocator(com.provenance.metadata.v1.MsgBindOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgBindOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    default void deleteOSLocator(com.provenance.metadata.v1.MsgDeleteOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    default void modifyOSLocator(com.provenance.metadata.v1.MsgModifyOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgModifyOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    default void setAccountData(com.provenance.metadata.v1.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the Metadata Msg service.
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
   * Msg defines the Metadata Msg service.
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
     * WriteScope adds or updates a scope.
     * </pre>
     */
    public void writeScope(com.provenance.metadata.v1.MsgWriteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public void deleteScope(com.provenance.metadata.v1.MsgDeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public void addScopeDataAccess(com.provenance.metadata.v1.MsgAddScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScopeDataAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public void deleteScopeDataAccess(com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeDataAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public void addScopeOwner(com.provenance.metadata.v1.MsgAddScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScopeOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public void deleteScopeOwner(com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public void updateValueOwners(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateValueOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public void migrateValueOwner(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateValueOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public void writeSession(com.provenance.metadata.v1.MsgWriteSessionRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public void writeRecord(com.provenance.metadata.v1.MsgWriteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public void deleteRecord(com.provenance.metadata.v1.MsgDeleteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public void writeScopeSpecification(com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteScopeSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public void deleteScopeSpecification(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public void writeContractSpecification(com.provenance.metadata.v1.MsgWriteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public void deleteContractSpecification(com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public void addContractSpecToScopeSpec(com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContractSpecToScopeSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public void deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteContractSpecFromScopeSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public void writeRecordSpecification(com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteRecordSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public void deleteRecordSpecification(com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecordSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public void bindOSLocator(com.provenance.metadata.v1.MsgBindOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgBindOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public void deleteOSLocator(com.provenance.metadata.v1.MsgDeleteOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public void modifyOSLocator(com.provenance.metadata.v1.MsgModifyOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgModifyOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public void setAccountData(com.provenance.metadata.v1.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the Metadata Msg service.
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
     * WriteScope adds or updates a scope.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteScopeResponse writeScope(com.provenance.metadata.v1.MsgWriteScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteScopeResponse deleteScope(com.provenance.metadata.v1.MsgDeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public com.provenance.metadata.v1.MsgAddScopeDataAccessResponse addScopeDataAccess(com.provenance.metadata.v1.MsgAddScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScopeDataAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse deleteScopeDataAccess(com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeDataAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public com.provenance.metadata.v1.MsgAddScopeOwnerResponse addScopeOwner(com.provenance.metadata.v1.MsgAddScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScopeOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse deleteScopeOwner(com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgUpdateValueOwnersResponse updateValueOwners(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateValueOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgMigrateValueOwnerResponse migrateValueOwner(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateValueOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteSessionResponse writeSession(com.provenance.metadata.v1.MsgWriteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteRecordResponse writeRecord(com.provenance.metadata.v1.MsgWriteRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteRecordResponse deleteRecord(com.provenance.metadata.v1.MsgDeleteRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse writeScopeSpecification(com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteScopeSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse deleteScopeSpecification(com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteContractSpecificationResponse writeContractSpecification(com.provenance.metadata.v1.MsgWriteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse deleteContractSpecification(com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse addContractSpecToScopeSpec(com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContractSpecToScopeSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteContractSpecFromScopeSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse writeRecordSpecification(com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteRecordSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse deleteRecordSpecification(com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecordSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgBindOSLocatorResponse bindOSLocator(com.provenance.metadata.v1.MsgBindOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgDeleteOSLocatorResponse deleteOSLocator(com.provenance.metadata.v1.MsgDeleteOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgModifyOSLocatorResponse modifyOSLocator(com.provenance.metadata.v1.MsgModifyOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.provenance.metadata.v1.MsgSetAccountDataResponse setAccountData(com.provenance.metadata.v1.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the Metadata Msg service.
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
     * WriteScope adds or updates a scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteScopeResponse> writeScope(
        com.provenance.metadata.v1.MsgWriteScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteScopeResponse> deleteScope(
        com.provenance.metadata.v1.MsgDeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgAddScopeDataAccessResponse> addScopeDataAccess(
        com.provenance.metadata.v1.MsgAddScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScopeDataAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse> deleteScopeDataAccess(
        com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeDataAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgAddScopeOwnerResponse> addScopeOwner(
        com.provenance.metadata.v1.MsgAddScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScopeOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse> deleteScopeOwner(
        com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgUpdateValueOwnersResponse> updateValueOwners(
        com.provenance.metadata.v1.MsgUpdateValueOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateValueOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgMigrateValueOwnerResponse> migrateValueOwner(
        com.provenance.metadata.v1.MsgMigrateValueOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateValueOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteSessionResponse> writeSession(
        com.provenance.metadata.v1.MsgWriteSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteRecordResponse> writeRecord(
        com.provenance.metadata.v1.MsgWriteRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteRecordResponse> deleteRecord(
        com.provenance.metadata.v1.MsgDeleteRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse> writeScopeSpecification(
        com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteScopeSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse> deleteScopeSpecification(
        com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteContractSpecificationResponse> writeContractSpecification(
        com.provenance.metadata.v1.MsgWriteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse> deleteContractSpecification(
        com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse> addContractSpecToScopeSpec(
        com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContractSpecToScopeSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse> deleteContractSpecFromScopeSpec(
        com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteContractSpecFromScopeSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse> writeRecordSpecification(
        com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteRecordSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse> deleteRecordSpecification(
        com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecordSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgBindOSLocatorResponse> bindOSLocator(
        com.provenance.metadata.v1.MsgBindOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgDeleteOSLocatorResponse> deleteOSLocator(
        com.provenance.metadata.v1.MsgDeleteOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgModifyOSLocatorResponse> modifyOSLocator(
        com.provenance.metadata.v1.MsgModifyOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.MsgSetAccountDataResponse> setAccountData(
        com.provenance.metadata.v1.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE_SCOPE = 0;
  private static final int METHODID_DELETE_SCOPE = 1;
  private static final int METHODID_ADD_SCOPE_DATA_ACCESS = 2;
  private static final int METHODID_DELETE_SCOPE_DATA_ACCESS = 3;
  private static final int METHODID_ADD_SCOPE_OWNER = 4;
  private static final int METHODID_DELETE_SCOPE_OWNER = 5;
  private static final int METHODID_UPDATE_VALUE_OWNERS = 6;
  private static final int METHODID_MIGRATE_VALUE_OWNER = 7;
  private static final int METHODID_WRITE_SESSION = 8;
  private static final int METHODID_WRITE_RECORD = 9;
  private static final int METHODID_DELETE_RECORD = 10;
  private static final int METHODID_WRITE_SCOPE_SPECIFICATION = 11;
  private static final int METHODID_DELETE_SCOPE_SPECIFICATION = 12;
  private static final int METHODID_WRITE_CONTRACT_SPECIFICATION = 13;
  private static final int METHODID_DELETE_CONTRACT_SPECIFICATION = 14;
  private static final int METHODID_ADD_CONTRACT_SPEC_TO_SCOPE_SPEC = 15;
  private static final int METHODID_DELETE_CONTRACT_SPEC_FROM_SCOPE_SPEC = 16;
  private static final int METHODID_WRITE_RECORD_SPECIFICATION = 17;
  private static final int METHODID_DELETE_RECORD_SPECIFICATION = 18;
  private static final int METHODID_BIND_OSLOCATOR = 19;
  private static final int METHODID_DELETE_OSLOCATOR = 20;
  private static final int METHODID_MODIFY_OSLOCATOR = 21;
  private static final int METHODID_SET_ACCOUNT_DATA = 22;

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
        case METHODID_WRITE_SCOPE:
          serviceImpl.writeScope((com.provenance.metadata.v1.MsgWriteScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE:
          serviceImpl.deleteScope((com.provenance.metadata.v1.MsgDeleteScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeResponse>) responseObserver);
          break;
        case METHODID_ADD_SCOPE_DATA_ACCESS:
          serviceImpl.addScopeDataAccess((com.provenance.metadata.v1.MsgAddScopeDataAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeDataAccessResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_DATA_ACCESS:
          serviceImpl.deleteScopeDataAccess((com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse>) responseObserver);
          break;
        case METHODID_ADD_SCOPE_OWNER:
          serviceImpl.addScopeOwner((com.provenance.metadata.v1.MsgAddScopeOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddScopeOwnerResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_OWNER:
          serviceImpl.deleteScopeOwner((com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VALUE_OWNERS:
          serviceImpl.updateValueOwners((com.provenance.metadata.v1.MsgUpdateValueOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgUpdateValueOwnersResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_VALUE_OWNER:
          serviceImpl.migrateValueOwner((com.provenance.metadata.v1.MsgMigrateValueOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgMigrateValueOwnerResponse>) responseObserver);
          break;
        case METHODID_WRITE_SESSION:
          serviceImpl.writeSession((com.provenance.metadata.v1.MsgWriteSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteSessionResponse>) responseObserver);
          break;
        case METHODID_WRITE_RECORD:
          serviceImpl.writeRecord((com.provenance.metadata.v1.MsgWriteRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordResponse>) responseObserver);
          break;
        case METHODID_DELETE_RECORD:
          serviceImpl.deleteRecord((com.provenance.metadata.v1.MsgDeleteRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordResponse>) responseObserver);
          break;
        case METHODID_WRITE_SCOPE_SPECIFICATION:
          serviceImpl.writeScopeSpecification((com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_SPECIFICATION:
          serviceImpl.deleteScopeSpecification((com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse>) responseObserver);
          break;
        case METHODID_WRITE_CONTRACT_SPECIFICATION:
          serviceImpl.writeContractSpecification((com.provenance.metadata.v1.MsgWriteContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTRACT_SPECIFICATION:
          serviceImpl.deleteContractSpecification((com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_ADD_CONTRACT_SPEC_TO_SCOPE_SPEC:
          serviceImpl.addContractSpecToScopeSpec((com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTRACT_SPEC_FROM_SCOPE_SPEC:
          serviceImpl.deleteContractSpecFromScopeSpec((com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse>) responseObserver);
          break;
        case METHODID_WRITE_RECORD_SPECIFICATION:
          serviceImpl.writeRecordSpecification((com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RECORD_SPECIFICATION:
          serviceImpl.deleteRecordSpecification((com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse>) responseObserver);
          break;
        case METHODID_BIND_OSLOCATOR:
          serviceImpl.bindOSLocator((com.provenance.metadata.v1.MsgBindOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgBindOSLocatorResponse>) responseObserver);
          break;
        case METHODID_DELETE_OSLOCATOR:
          serviceImpl.deleteOSLocator((com.provenance.metadata.v1.MsgDeleteOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgDeleteOSLocatorResponse>) responseObserver);
          break;
        case METHODID_MODIFY_OSLOCATOR:
          serviceImpl.modifyOSLocator((com.provenance.metadata.v1.MsgModifyOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgModifyOSLocatorResponse>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_DATA:
          serviceImpl.setAccountData((com.provenance.metadata.v1.MsgSetAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.MsgSetAccountDataResponse>) responseObserver);
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
          getWriteScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteScopeRequest,
              com.provenance.metadata.v1.MsgWriteScopeResponse>(
                service, METHODID_WRITE_SCOPE)))
        .addMethod(
          getDeleteScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteScopeRequest,
              com.provenance.metadata.v1.MsgDeleteScopeResponse>(
                service, METHODID_DELETE_SCOPE)))
        .addMethod(
          getAddScopeDataAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgAddScopeDataAccessRequest,
              com.provenance.metadata.v1.MsgAddScopeDataAccessResponse>(
                service, METHODID_ADD_SCOPE_DATA_ACCESS)))
        .addMethod(
          getDeleteScopeDataAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteScopeDataAccessRequest,
              com.provenance.metadata.v1.MsgDeleteScopeDataAccessResponse>(
                service, METHODID_DELETE_SCOPE_DATA_ACCESS)))
        .addMethod(
          getAddScopeOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgAddScopeOwnerRequest,
              com.provenance.metadata.v1.MsgAddScopeOwnerResponse>(
                service, METHODID_ADD_SCOPE_OWNER)))
        .addMethod(
          getDeleteScopeOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteScopeOwnerRequest,
              com.provenance.metadata.v1.MsgDeleteScopeOwnerResponse>(
                service, METHODID_DELETE_SCOPE_OWNER)))
        .addMethod(
          getUpdateValueOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgUpdateValueOwnersRequest,
              com.provenance.metadata.v1.MsgUpdateValueOwnersResponse>(
                service, METHODID_UPDATE_VALUE_OWNERS)))
        .addMethod(
          getMigrateValueOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgMigrateValueOwnerRequest,
              com.provenance.metadata.v1.MsgMigrateValueOwnerResponse>(
                service, METHODID_MIGRATE_VALUE_OWNER)))
        .addMethod(
          getWriteSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteSessionRequest,
              com.provenance.metadata.v1.MsgWriteSessionResponse>(
                service, METHODID_WRITE_SESSION)))
        .addMethod(
          getWriteRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteRecordRequest,
              com.provenance.metadata.v1.MsgWriteRecordResponse>(
                service, METHODID_WRITE_RECORD)))
        .addMethod(
          getDeleteRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteRecordRequest,
              com.provenance.metadata.v1.MsgDeleteRecordResponse>(
                service, METHODID_DELETE_RECORD)))
        .addMethod(
          getWriteScopeSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteScopeSpecificationRequest,
              com.provenance.metadata.v1.MsgWriteScopeSpecificationResponse>(
                service, METHODID_WRITE_SCOPE_SPECIFICATION)))
        .addMethod(
          getDeleteScopeSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteScopeSpecificationRequest,
              com.provenance.metadata.v1.MsgDeleteScopeSpecificationResponse>(
                service, METHODID_DELETE_SCOPE_SPECIFICATION)))
        .addMethod(
          getWriteContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteContractSpecificationRequest,
              com.provenance.metadata.v1.MsgWriteContractSpecificationResponse>(
                service, METHODID_WRITE_CONTRACT_SPECIFICATION)))
        .addMethod(
          getDeleteContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteContractSpecificationRequest,
              com.provenance.metadata.v1.MsgDeleteContractSpecificationResponse>(
                service, METHODID_DELETE_CONTRACT_SPECIFICATION)))
        .addMethod(
          getAddContractSpecToScopeSpecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest,
              com.provenance.metadata.v1.MsgAddContractSpecToScopeSpecResponse>(
                service, METHODID_ADD_CONTRACT_SPEC_TO_SCOPE_SPEC)))
        .addMethod(
          getDeleteContractSpecFromScopeSpecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecRequest,
              com.provenance.metadata.v1.MsgDeleteContractSpecFromScopeSpecResponse>(
                service, METHODID_DELETE_CONTRACT_SPEC_FROM_SCOPE_SPEC)))
        .addMethod(
          getWriteRecordSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgWriteRecordSpecificationRequest,
              com.provenance.metadata.v1.MsgWriteRecordSpecificationResponse>(
                service, METHODID_WRITE_RECORD_SPECIFICATION)))
        .addMethod(
          getDeleteRecordSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteRecordSpecificationRequest,
              com.provenance.metadata.v1.MsgDeleteRecordSpecificationResponse>(
                service, METHODID_DELETE_RECORD_SPECIFICATION)))
        .addMethod(
          getBindOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgBindOSLocatorRequest,
              com.provenance.metadata.v1.MsgBindOSLocatorResponse>(
                service, METHODID_BIND_OSLOCATOR)))
        .addMethod(
          getDeleteOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgDeleteOSLocatorRequest,
              com.provenance.metadata.v1.MsgDeleteOSLocatorResponse>(
                service, METHODID_DELETE_OSLOCATOR)))
        .addMethod(
          getModifyOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgModifyOSLocatorRequest,
              com.provenance.metadata.v1.MsgModifyOSLocatorResponse>(
                service, METHODID_MODIFY_OSLOCATOR)))
        .addMethod(
          getSetAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.MsgSetAccountDataRequest,
              com.provenance.metadata.v1.MsgSetAccountDataResponse>(
                service, METHODID_SET_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.metadata.v1.TxProto.getDescriptor();
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
              .addMethod(getWriteScopeMethod())
              .addMethod(getDeleteScopeMethod())
              .addMethod(getAddScopeDataAccessMethod())
              .addMethod(getDeleteScopeDataAccessMethod())
              .addMethod(getAddScopeOwnerMethod())
              .addMethod(getDeleteScopeOwnerMethod())
              .addMethod(getUpdateValueOwnersMethod())
              .addMethod(getMigrateValueOwnerMethod())
              .addMethod(getWriteSessionMethod())
              .addMethod(getWriteRecordMethod())
              .addMethod(getDeleteRecordMethod())
              .addMethod(getWriteScopeSpecificationMethod())
              .addMethod(getDeleteScopeSpecificationMethod())
              .addMethod(getWriteContractSpecificationMethod())
              .addMethod(getDeleteContractSpecificationMethod())
              .addMethod(getAddContractSpecToScopeSpecMethod())
              .addMethod(getDeleteContractSpecFromScopeSpecMethod())
              .addMethod(getWriteRecordSpecificationMethod())
              .addMethod(getDeleteRecordSpecificationMethod())
              .addMethod(getBindOSLocatorMethod())
              .addMethod(getDeleteOSLocatorMethod())
              .addMethod(getModifyOSLocatorMethod())
              .addMethod(getSetAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
