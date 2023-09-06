package com.provenance.metadata.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the Metadata Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: provenance/metadata/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "provenance.metadata.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> getWriteScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteScope",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> getWriteScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest, com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> getWriteScopeMethod;
    if ((getWriteScopeMethod = MsgGrpc.getWriteScopeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteScopeMethod = MsgGrpc.getWriteScopeMethod) == null) {
          MsgGrpc.getWriteScopeMethod = getWriteScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest, com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteScope"))
              .build();
        }
      }
    }
    return getWriteScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> getDeleteScopeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScope",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> getDeleteScopeMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> getDeleteScopeMethod;
    if ((getDeleteScopeMethod = MsgGrpc.getDeleteScopeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeMethod = MsgGrpc.getDeleteScopeMethod) == null) {
          MsgGrpc.getDeleteScopeMethod = getDeleteScopeMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScope"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScope"))
              .build();
        }
      }
    }
    return getDeleteScopeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest,
      com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScopeDataAccess",
      requestType = com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest,
      com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest, com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> getAddScopeDataAccessMethod;
    if ((getAddScopeDataAccessMethod = MsgGrpc.getAddScopeDataAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddScopeDataAccessMethod = MsgGrpc.getAddScopeDataAccessMethod) == null) {
          MsgGrpc.getAddScopeDataAccessMethod = getAddScopeDataAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest, com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScopeDataAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddScopeDataAccess"))
              .build();
        }
      }
    }
    return getAddScopeDataAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeDataAccess",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> getDeleteScopeDataAccessMethod;
    if ((getDeleteScopeDataAccessMethod = MsgGrpc.getDeleteScopeDataAccessMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeDataAccessMethod = MsgGrpc.getDeleteScopeDataAccessMethod) == null) {
          MsgGrpc.getDeleteScopeDataAccessMethod = getDeleteScopeDataAccessMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeDataAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeDataAccess"))
              .build();
        }
      }
    }
    return getDeleteScopeDataAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddScopeOwner",
      requestType = com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest, com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> getAddScopeOwnerMethod;
    if ((getAddScopeOwnerMethod = MsgGrpc.getAddScopeOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddScopeOwnerMethod = MsgGrpc.getAddScopeOwnerMethod) == null) {
          MsgGrpc.getAddScopeOwnerMethod = getAddScopeOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest, com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddScopeOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddScopeOwner"))
              .build();
        }
      }
    }
    return getAddScopeOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeOwner",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> getDeleteScopeOwnerMethod;
    if ((getDeleteScopeOwnerMethod = MsgGrpc.getDeleteScopeOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeOwnerMethod = MsgGrpc.getDeleteScopeOwnerMethod) == null) {
          MsgGrpc.getDeleteScopeOwnerMethod = getDeleteScopeOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeOwner"))
              .build();
        }
      }
    }
    return getDeleteScopeOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest,
      com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateValueOwners",
      requestType = com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest,
      com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest, com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> getUpdateValueOwnersMethod;
    if ((getUpdateValueOwnersMethod = MsgGrpc.getUpdateValueOwnersMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateValueOwnersMethod = MsgGrpc.getUpdateValueOwnersMethod) == null) {
          MsgGrpc.getUpdateValueOwnersMethod = getUpdateValueOwnersMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest, com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateValueOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateValueOwners"))
              .build();
        }
      }
    }
    return getUpdateValueOwnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateValueOwner",
      requestType = com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest,
      com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest, com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> getMigrateValueOwnerMethod;
    if ((getMigrateValueOwnerMethod = MsgGrpc.getMigrateValueOwnerMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateValueOwnerMethod = MsgGrpc.getMigrateValueOwnerMethod) == null) {
          MsgGrpc.getMigrateValueOwnerMethod = getMigrateValueOwnerMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest, com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateValueOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateValueOwner"))
              .build();
        }
      }
    }
    return getMigrateValueOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> getWriteSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteSession",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> getWriteSessionMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest, com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> getWriteSessionMethod;
    if ((getWriteSessionMethod = MsgGrpc.getWriteSessionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteSessionMethod = MsgGrpc.getWriteSessionMethod) == null) {
          MsgGrpc.getWriteSessionMethod = getWriteSessionMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest, com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteSession"))
              .build();
        }
      }
    }
    return getWriteSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> getWriteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecord",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> getWriteRecordMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest, com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> getWriteRecordMethod;
    if ((getWriteRecordMethod = MsgGrpc.getWriteRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteRecordMethod = MsgGrpc.getWriteRecordMethod) == null) {
          MsgGrpc.getWriteRecordMethod = getWriteRecordMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest, com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteRecord"))
              .build();
        }
      }
    }
    return getWriteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> getDeleteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRecord",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> getDeleteRecordMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest, com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> getDeleteRecordMethod;
    if ((getDeleteRecordMethod = MsgGrpc.getDeleteRecordMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRecordMethod = MsgGrpc.getDeleteRecordMethod) == null) {
          MsgGrpc.getDeleteRecordMethod = getDeleteRecordMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest, com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRecord"))
              .build();
        }
      }
    }
    return getDeleteRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteScopeSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> getWriteScopeSpecificationMethod;
    if ((getWriteScopeSpecificationMethod = MsgGrpc.getWriteScopeSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteScopeSpecificationMethod = MsgGrpc.getWriteScopeSpecificationMethod) == null) {
          MsgGrpc.getWriteScopeSpecificationMethod = getWriteScopeSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteScopeSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteScopeSpecification"))
              .build();
        }
      }
    }
    return getWriteScopeSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScopeSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> getDeleteScopeSpecificationMethod;
    if ((getDeleteScopeSpecificationMethod = MsgGrpc.getDeleteScopeSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteScopeSpecificationMethod = MsgGrpc.getDeleteScopeSpecificationMethod) == null) {
          MsgGrpc.getDeleteScopeSpecificationMethod = getDeleteScopeSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScopeSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteScopeSpecification"))
              .build();
        }
      }
    }
    return getDeleteScopeSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteContractSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> getWriteContractSpecificationMethod;
    if ((getWriteContractSpecificationMethod = MsgGrpc.getWriteContractSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteContractSpecificationMethod = MsgGrpc.getWriteContractSpecificationMethod) == null) {
          MsgGrpc.getWriteContractSpecificationMethod = getWriteContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteContractSpecification"))
              .build();
        }
      }
    }
    return getWriteContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContractSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> getDeleteContractSpecificationMethod;
    if ((getDeleteContractSpecificationMethod = MsgGrpc.getDeleteContractSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteContractSpecificationMethod = MsgGrpc.getDeleteContractSpecificationMethod) == null) {
          MsgGrpc.getDeleteContractSpecificationMethod = getDeleteContractSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContractSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteContractSpecification"))
              .build();
        }
      }
    }
    return getDeleteContractSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest,
      com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContractSpecToScopeSpec",
      requestType = com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest,
      com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest, com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> getAddContractSpecToScopeSpecMethod;
    if ((getAddContractSpecToScopeSpecMethod = MsgGrpc.getAddContractSpecToScopeSpecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddContractSpecToScopeSpecMethod = MsgGrpc.getAddContractSpecToScopeSpecMethod) == null) {
          MsgGrpc.getAddContractSpecToScopeSpecMethod = getAddContractSpecToScopeSpecMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest, com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContractSpecToScopeSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddContractSpecToScopeSpec"))
              .build();
        }
      }
    }
    return getAddContractSpecToScopeSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContractSpecFromScopeSpec",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest, com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> getDeleteContractSpecFromScopeSpecMethod;
    if ((getDeleteContractSpecFromScopeSpecMethod = MsgGrpc.getDeleteContractSpecFromScopeSpecMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteContractSpecFromScopeSpecMethod = MsgGrpc.getDeleteContractSpecFromScopeSpecMethod) == null) {
          MsgGrpc.getDeleteContractSpecFromScopeSpecMethod = getDeleteContractSpecFromScopeSpecMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest, com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContractSpecFromScopeSpec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteContractSpecFromScopeSpec"))
              .build();
        }
      }
    }
    return getDeleteContractSpecFromScopeSpecMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteRecordSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> getWriteRecordSpecificationMethod;
    if ((getWriteRecordSpecificationMethod = MsgGrpc.getWriteRecordSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWriteRecordSpecificationMethod = MsgGrpc.getWriteRecordSpecificationMethod) == null) {
          MsgGrpc.getWriteRecordSpecificationMethod = getWriteRecordSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteRecordSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WriteRecordSpecification"))
              .build();
        }
      }
    }
    return getWriteRecordSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRecordSpecification",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> getDeleteRecordSpecificationMethod;
    if ((getDeleteRecordSpecificationMethod = MsgGrpc.getDeleteRecordSpecificationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteRecordSpecificationMethod = MsgGrpc.getDeleteRecordSpecificationMethod) == null) {
          MsgGrpc.getDeleteRecordSpecificationMethod = getDeleteRecordSpecificationMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest, com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRecordSpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteRecordSpecification"))
              .build();
        }
      }
    }
    return getDeleteRecordSpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> getBindOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindOSLocator",
      requestType = com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> getBindOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> getBindOSLocatorMethod;
    if ((getBindOSLocatorMethod = MsgGrpc.getBindOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindOSLocatorMethod = MsgGrpc.getBindOSLocatorMethod) == null) {
          MsgGrpc.getBindOSLocatorMethod = getBindOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindOSLocator"))
              .build();
        }
      }
    }
    return getBindOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOSLocator",
      requestType = com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> getDeleteOSLocatorMethod;
    if ((getDeleteOSLocatorMethod = MsgGrpc.getDeleteOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteOSLocatorMethod = MsgGrpc.getDeleteOSLocatorMethod) == null) {
          MsgGrpc.getDeleteOSLocatorMethod = getDeleteOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteOSLocator"))
              .build();
        }
      }
    }
    return getDeleteOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyOSLocator",
      requestType = com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest,
      com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> getModifyOSLocatorMethod;
    if ((getModifyOSLocatorMethod = MsgGrpc.getModifyOSLocatorMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getModifyOSLocatorMethod = MsgGrpc.getModifyOSLocatorMethod) == null) {
          MsgGrpc.getModifyOSLocatorMethod = getModifyOSLocatorMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest, com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModifyOSLocator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ModifyOSLocator"))
              .build();
        }
      }
    }
    return getModifyOSLocatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest,
      com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountData",
      requestType = com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest.class,
      responseType = com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest,
      com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest, com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod;
    if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
          MsgGrpc.getSetAccountDataMethod = getSetAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest, com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse.getDefaultInstance()))
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
    default void writeScope(com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    default void deleteScope(com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    default void addScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScopeDataAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    default void deleteScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeDataAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    default void addScopeOwner(com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddScopeOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    default void deleteScopeOwner(com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    default void updateValueOwners(com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateValueOwnersMethod(), responseObserver);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    default void migrateValueOwner(com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateValueOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    default void writeSession(com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    default void writeRecord(com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    default void deleteRecord(com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    default void writeScopeSpecification(com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteScopeSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    default void deleteScopeSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScopeSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    default void writeContractSpecification(com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    default void deleteContractSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteContractSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    default void addContractSpecToScopeSpec(com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContractSpecToScopeSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    default void deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteContractSpecFromScopeSpecMethod(), responseObserver);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    default void writeRecordSpecification(com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteRecordSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    default void deleteRecordSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRecordSpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    default void bindOSLocator(com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    default void deleteOSLocator(com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    default void modifyOSLocator(com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModifyOSLocatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    default void setAccountData(com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> responseObserver) {
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
    public void writeScope(com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public void deleteScope(com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public void addScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScopeDataAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public void deleteScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeDataAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public void addScopeOwner(com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddScopeOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public void deleteScopeOwner(com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public void updateValueOwners(com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateValueOwnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public void migrateValueOwner(com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateValueOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public void writeSession(com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public void writeRecord(com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public void deleteRecord(com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public void writeScopeSpecification(com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteScopeSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public void deleteScopeSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScopeSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public void writeContractSpecification(com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public void deleteContractSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteContractSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public void addContractSpecToScopeSpec(com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContractSpecToScopeSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public void deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteContractSpecFromScopeSpecMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public void writeRecordSpecification(com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteRecordSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public void deleteRecordSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRecordSpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public void bindOSLocator(com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public void deleteOSLocator(com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public void modifyOSLocator(com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModifyOSLocatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public void setAccountData(com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> responseObserver) {
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
    public com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse writeScope(com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse deleteScope(com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse addScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScopeDataAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse deleteScopeDataAccess(com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeDataAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse addScopeOwner(com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddScopeOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse deleteScopeOwner(com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse updateValueOwners(com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateValueOwnersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse migrateValueOwner(com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateValueOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse writeSession(com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse writeRecord(com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse deleteRecord(com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse writeScopeSpecification(com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteScopeSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse deleteScopeSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScopeSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse writeContractSpecification(com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse deleteContractSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteContractSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse addContractSpecToScopeSpec(com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContractSpecToScopeSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse deleteContractSpecFromScopeSpec(com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteContractSpecFromScopeSpecMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse writeRecordSpecification(com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteRecordSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse deleteRecordSpecification(com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRecordSpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse bindOSLocator(com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse deleteOSLocator(com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse modifyOSLocator(com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModifyOSLocatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse setAccountData(com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse> writeScope(
        com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScope deletes a scope and all associated Records, Sessions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse> deleteScope(
        com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddScopeDataAccess adds data access AccAddress to scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse> addScopeDataAccess(
        com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScopeDataAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeDataAccess removes data access AccAddress from scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse> deleteScopeDataAccess(
        com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeDataAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddScopeOwner adds new owner parties to a scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse> addScopeOwner(
        com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddScopeOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeOwner removes owner parties (by addresses) from a scope
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse> deleteScopeOwner(
        com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateValueOwners sets the value owner of one or more scopes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse> updateValueOwners(
        com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateValueOwnersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MigrateValueOwner updates all scopes that have one value owner to have a another value owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse> migrateValueOwner(
        com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateValueOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteSession adds or updates a session context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse> writeSession(
        com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteRecord adds or updates a record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse> writeRecord(
        com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRecord deletes a record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse> deleteRecord(
        com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteScopeSpecification adds or updates a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse> writeScopeSpecification(
        com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteScopeSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScopeSpecification deletes a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse> deleteScopeSpecification(
        com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScopeSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteContractSpecification adds or updates a contract specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse> writeContractSpecification(
        com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteContractSpecification deletes a contract specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse> deleteContractSpecification(
        com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteContractSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddContractSpecToScopeSpec adds contract specification to a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse> addContractSpecToScopeSpec(
        com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContractSpecToScopeSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteContractSpecFromScopeSpec deletes a contract specification from a scope specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse> deleteContractSpecFromScopeSpec(
        com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteContractSpecFromScopeSpecMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WriteRecordSpecification adds or updates a record specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse> writeRecordSpecification(
        com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteRecordSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRecordSpecification deletes a record specification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse> deleteRecordSpecification(
        com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRecordSpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BindOSLocator binds an owner address to a uri.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse> bindOSLocator(
        com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteOSLocator deletes an existing ObjectStoreLocator record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse> deleteOSLocator(
        com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ModifyOSLocator updates an ObjectStoreLocator record by the current owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse> modifyOSLocator(
        com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModifyOSLocatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAccountData associates some basic data with a metadata address.
     * Currently, only scope ids are supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse> setAccountData(
        com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest request) {
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
          serviceImpl.writeScope((com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE:
          serviceImpl.deleteScope((com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse>) responseObserver);
          break;
        case METHODID_ADD_SCOPE_DATA_ACCESS:
          serviceImpl.addScopeDataAccess((com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_DATA_ACCESS:
          serviceImpl.deleteScopeDataAccess((com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse>) responseObserver);
          break;
        case METHODID_ADD_SCOPE_OWNER:
          serviceImpl.addScopeOwner((com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_OWNER:
          serviceImpl.deleteScopeOwner((com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VALUE_OWNERS:
          serviceImpl.updateValueOwners((com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_VALUE_OWNER:
          serviceImpl.migrateValueOwner((com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse>) responseObserver);
          break;
        case METHODID_WRITE_SESSION:
          serviceImpl.writeSession((com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse>) responseObserver);
          break;
        case METHODID_WRITE_RECORD:
          serviceImpl.writeRecord((com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse>) responseObserver);
          break;
        case METHODID_DELETE_RECORD:
          serviceImpl.deleteRecord((com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse>) responseObserver);
          break;
        case METHODID_WRITE_SCOPE_SPECIFICATION:
          serviceImpl.writeScopeSpecification((com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCOPE_SPECIFICATION:
          serviceImpl.deleteScopeSpecification((com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse>) responseObserver);
          break;
        case METHODID_WRITE_CONTRACT_SPECIFICATION:
          serviceImpl.writeContractSpecification((com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTRACT_SPECIFICATION:
          serviceImpl.deleteContractSpecification((com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse>) responseObserver);
          break;
        case METHODID_ADD_CONTRACT_SPEC_TO_SCOPE_SPEC:
          serviceImpl.addContractSpecToScopeSpec((com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTRACT_SPEC_FROM_SCOPE_SPEC:
          serviceImpl.deleteContractSpecFromScopeSpec((com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse>) responseObserver);
          break;
        case METHODID_WRITE_RECORD_SPECIFICATION:
          serviceImpl.writeRecordSpecification((com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RECORD_SPECIFICATION:
          serviceImpl.deleteRecordSpecification((com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse>) responseObserver);
          break;
        case METHODID_BIND_OSLOCATOR:
          serviceImpl.bindOSLocator((com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse>) responseObserver);
          break;
        case METHODID_DELETE_OSLOCATOR:
          serviceImpl.deleteOSLocator((com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse>) responseObserver);
          break;
        case METHODID_MODIFY_OSLOCATOR:
          serviceImpl.modifyOSLocator((com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_DATA:
          serviceImpl.setAccountData((com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse>) responseObserver);
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
              com.provenance.metadata.v1.TxProto.MsgWriteScopeRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteScopeResponse>(
                service, METHODID_WRITE_SCOPE)))
        .addMethod(
          getDeleteScopeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeResponse>(
                service, METHODID_DELETE_SCOPE)))
        .addMethod(
          getAddScopeDataAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessRequest,
              com.provenance.metadata.v1.TxProto.MsgAddScopeDataAccessResponse>(
                service, METHODID_ADD_SCOPE_DATA_ACCESS)))
        .addMethod(
          getDeleteScopeDataAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeDataAccessResponse>(
                service, METHODID_DELETE_SCOPE_DATA_ACCESS)))
        .addMethod(
          getAddScopeOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerRequest,
              com.provenance.metadata.v1.TxProto.MsgAddScopeOwnerResponse>(
                service, METHODID_ADD_SCOPE_OWNER)))
        .addMethod(
          getDeleteScopeOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeOwnerResponse>(
                service, METHODID_DELETE_SCOPE_OWNER)))
        .addMethod(
          getUpdateValueOwnersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersRequest,
              com.provenance.metadata.v1.TxProto.MsgUpdateValueOwnersResponse>(
                service, METHODID_UPDATE_VALUE_OWNERS)))
        .addMethod(
          getMigrateValueOwnerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerRequest,
              com.provenance.metadata.v1.TxProto.MsgMigrateValueOwnerResponse>(
                service, METHODID_MIGRATE_VALUE_OWNER)))
        .addMethod(
          getWriteSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgWriteSessionRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteSessionResponse>(
                service, METHODID_WRITE_SESSION)))
        .addMethod(
          getWriteRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgWriteRecordRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteRecordResponse>(
                service, METHODID_WRITE_RECORD)))
        .addMethod(
          getDeleteRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteRecordRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteRecordResponse>(
                service, METHODID_DELETE_RECORD)))
        .addMethod(
          getWriteScopeSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteScopeSpecificationResponse>(
                service, METHODID_WRITE_SCOPE_SPECIFICATION)))
        .addMethod(
          getDeleteScopeSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteScopeSpecificationResponse>(
                service, METHODID_DELETE_SCOPE_SPECIFICATION)))
        .addMethod(
          getWriteContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteContractSpecificationResponse>(
                service, METHODID_WRITE_CONTRACT_SPECIFICATION)))
        .addMethod(
          getDeleteContractSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecificationResponse>(
                service, METHODID_DELETE_CONTRACT_SPECIFICATION)))
        .addMethod(
          getAddContractSpecToScopeSpecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecRequest,
              com.provenance.metadata.v1.TxProto.MsgAddContractSpecToScopeSpecResponse>(
                service, METHODID_ADD_CONTRACT_SPEC_TO_SCOPE_SPEC)))
        .addMethod(
          getDeleteContractSpecFromScopeSpecMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteContractSpecFromScopeSpecResponse>(
                service, METHODID_DELETE_CONTRACT_SPEC_FROM_SCOPE_SPEC)))
        .addMethod(
          getWriteRecordSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgWriteRecordSpecificationResponse>(
                service, METHODID_WRITE_RECORD_SPECIFICATION)))
        .addMethod(
          getDeleteRecordSpecificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteRecordSpecificationResponse>(
                service, METHODID_DELETE_RECORD_SPECIFICATION)))
        .addMethod(
          getBindOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgBindOSLocatorRequest,
              com.provenance.metadata.v1.TxProto.MsgBindOSLocatorResponse>(
                service, METHODID_BIND_OSLOCATOR)))
        .addMethod(
          getDeleteOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorRequest,
              com.provenance.metadata.v1.TxProto.MsgDeleteOSLocatorResponse>(
                service, METHODID_DELETE_OSLOCATOR)))
        .addMethod(
          getModifyOSLocatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorRequest,
              com.provenance.metadata.v1.TxProto.MsgModifyOSLocatorResponse>(
                service, METHODID_MODIFY_OSLOCATOR)))
        .addMethod(
          getSetAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.metadata.v1.TxProto.MsgSetAccountDataRequest,
              com.provenance.metadata.v1.TxProto.MsgSetAccountDataResponse>(
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
    private final java.lang.String methodName;

    MsgMethodDescriptorSupplier(java.lang.String methodName) {
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
