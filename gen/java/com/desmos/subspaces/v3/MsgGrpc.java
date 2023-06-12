package com.desmos.subspaces.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines subspaces Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: desmos/subspaces/v3/msgs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.subspaces.v3.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSubspace,
      com.desmos.subspaces.v3.MsgCreateSubspaceResponse> getCreateSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubspace",
      requestType = com.desmos.subspaces.v3.MsgCreateSubspace.class,
      responseType = com.desmos.subspaces.v3.MsgCreateSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSubspace,
      com.desmos.subspaces.v3.MsgCreateSubspaceResponse> getCreateSubspaceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSubspace, com.desmos.subspaces.v3.MsgCreateSubspaceResponse> getCreateSubspaceMethod;
    if ((getCreateSubspaceMethod = MsgGrpc.getCreateSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSubspaceMethod = MsgGrpc.getCreateSubspaceMethod) == null) {
          MsgGrpc.getCreateSubspaceMethod = getCreateSubspaceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgCreateSubspace, com.desmos.subspaces.v3.MsgCreateSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSubspace"))
              .build();
        }
      }
    }
    return getCreateSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSubspace,
      com.desmos.subspaces.v3.MsgEditSubspaceResponse> getEditSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditSubspace",
      requestType = com.desmos.subspaces.v3.MsgEditSubspace.class,
      responseType = com.desmos.subspaces.v3.MsgEditSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSubspace,
      com.desmos.subspaces.v3.MsgEditSubspaceResponse> getEditSubspaceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSubspace, com.desmos.subspaces.v3.MsgEditSubspaceResponse> getEditSubspaceMethod;
    if ((getEditSubspaceMethod = MsgGrpc.getEditSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditSubspaceMethod = MsgGrpc.getEditSubspaceMethod) == null) {
          MsgGrpc.getEditSubspaceMethod = getEditSubspaceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgEditSubspace, com.desmos.subspaces.v3.MsgEditSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditSubspace"))
              .build();
        }
      }
    }
    return getEditSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSubspace,
      com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubspace",
      requestType = com.desmos.subspaces.v3.MsgDeleteSubspace.class,
      responseType = com.desmos.subspaces.v3.MsgDeleteSubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSubspace,
      com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSubspace, com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> getDeleteSubspaceMethod;
    if ((getDeleteSubspaceMethod = MsgGrpc.getDeleteSubspaceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteSubspaceMethod = MsgGrpc.getDeleteSubspaceMethod) == null) {
          MsgGrpc.getDeleteSubspaceMethod = getDeleteSubspaceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgDeleteSubspace, com.desmos.subspaces.v3.MsgDeleteSubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSubspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteSubspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteSubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteSubspace"))
              .build();
        }
      }
    }
    return getDeleteSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSection,
      com.desmos.subspaces.v3.MsgCreateSectionResponse> getCreateSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSection",
      requestType = com.desmos.subspaces.v3.MsgCreateSection.class,
      responseType = com.desmos.subspaces.v3.MsgCreateSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSection,
      com.desmos.subspaces.v3.MsgCreateSectionResponse> getCreateSectionMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateSection, com.desmos.subspaces.v3.MsgCreateSectionResponse> getCreateSectionMethod;
    if ((getCreateSectionMethod = MsgGrpc.getCreateSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateSectionMethod = MsgGrpc.getCreateSectionMethod) == null) {
          MsgGrpc.getCreateSectionMethod = getCreateSectionMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgCreateSection, com.desmos.subspaces.v3.MsgCreateSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateSection"))
              .build();
        }
      }
    }
    return getCreateSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSection,
      com.desmos.subspaces.v3.MsgEditSectionResponse> getEditSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditSection",
      requestType = com.desmos.subspaces.v3.MsgEditSection.class,
      responseType = com.desmos.subspaces.v3.MsgEditSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSection,
      com.desmos.subspaces.v3.MsgEditSectionResponse> getEditSectionMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditSection, com.desmos.subspaces.v3.MsgEditSectionResponse> getEditSectionMethod;
    if ((getEditSectionMethod = MsgGrpc.getEditSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditSectionMethod = MsgGrpc.getEditSectionMethod) == null) {
          MsgGrpc.getEditSectionMethod = getEditSectionMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgEditSection, com.desmos.subspaces.v3.MsgEditSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditSection"))
              .build();
        }
      }
    }
    return getEditSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveSection,
      com.desmos.subspaces.v3.MsgMoveSectionResponse> getMoveSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveSection",
      requestType = com.desmos.subspaces.v3.MsgMoveSection.class,
      responseType = com.desmos.subspaces.v3.MsgMoveSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveSection,
      com.desmos.subspaces.v3.MsgMoveSectionResponse> getMoveSectionMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveSection, com.desmos.subspaces.v3.MsgMoveSectionResponse> getMoveSectionMethod;
    if ((getMoveSectionMethod = MsgGrpc.getMoveSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMoveSectionMethod = MsgGrpc.getMoveSectionMethod) == null) {
          MsgGrpc.getMoveSectionMethod = getMoveSectionMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgMoveSection, com.desmos.subspaces.v3.MsgMoveSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgMoveSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgMoveSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MoveSection"))
              .build();
        }
      }
    }
    return getMoveSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSection,
      com.desmos.subspaces.v3.MsgDeleteSectionResponse> getDeleteSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSection",
      requestType = com.desmos.subspaces.v3.MsgDeleteSection.class,
      responseType = com.desmos.subspaces.v3.MsgDeleteSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSection,
      com.desmos.subspaces.v3.MsgDeleteSectionResponse> getDeleteSectionMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteSection, com.desmos.subspaces.v3.MsgDeleteSectionResponse> getDeleteSectionMethod;
    if ((getDeleteSectionMethod = MsgGrpc.getDeleteSectionMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteSectionMethod = MsgGrpc.getDeleteSectionMethod) == null) {
          MsgGrpc.getDeleteSectionMethod = getDeleteSectionMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgDeleteSection, com.desmos.subspaces.v3.MsgDeleteSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteSection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteSection"))
              .build();
        }
      }
    }
    return getDeleteSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateUserGroup,
      com.desmos.subspaces.v3.MsgCreateUserGroupResponse> getCreateUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserGroup",
      requestType = com.desmos.subspaces.v3.MsgCreateUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgCreateUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateUserGroup,
      com.desmos.subspaces.v3.MsgCreateUserGroupResponse> getCreateUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgCreateUserGroup, com.desmos.subspaces.v3.MsgCreateUserGroupResponse> getCreateUserGroupMethod;
    if ((getCreateUserGroupMethod = MsgGrpc.getCreateUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateUserGroupMethod = MsgGrpc.getCreateUserGroupMethod) == null) {
          MsgGrpc.getCreateUserGroupMethod = getCreateUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgCreateUserGroup, com.desmos.subspaces.v3.MsgCreateUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgCreateUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateUserGroup"))
              .build();
        }
      }
    }
    return getCreateUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditUserGroup,
      com.desmos.subspaces.v3.MsgEditUserGroupResponse> getEditUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditUserGroup",
      requestType = com.desmos.subspaces.v3.MsgEditUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgEditUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditUserGroup,
      com.desmos.subspaces.v3.MsgEditUserGroupResponse> getEditUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgEditUserGroup, com.desmos.subspaces.v3.MsgEditUserGroupResponse> getEditUserGroupMethod;
    if ((getEditUserGroupMethod = MsgGrpc.getEditUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditUserGroupMethod = MsgGrpc.getEditUserGroupMethod) == null) {
          MsgGrpc.getEditUserGroupMethod = getEditUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgEditUserGroup, com.desmos.subspaces.v3.MsgEditUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgEditUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditUserGroup"))
              .build();
        }
      }
    }
    return getEditUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveUserGroup,
      com.desmos.subspaces.v3.MsgMoveUserGroupResponse> getMoveUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveUserGroup",
      requestType = com.desmos.subspaces.v3.MsgMoveUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgMoveUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveUserGroup,
      com.desmos.subspaces.v3.MsgMoveUserGroupResponse> getMoveUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgMoveUserGroup, com.desmos.subspaces.v3.MsgMoveUserGroupResponse> getMoveUserGroupMethod;
    if ((getMoveUserGroupMethod = MsgGrpc.getMoveUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMoveUserGroupMethod = MsgGrpc.getMoveUserGroupMethod) == null) {
          MsgGrpc.getMoveUserGroupMethod = getMoveUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgMoveUserGroup, com.desmos.subspaces.v3.MsgMoveUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgMoveUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgMoveUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MoveUserGroup"))
              .build();
        }
      }
    }
    return getMoveUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserGroupPermissions,
      com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserGroupPermissions",
      requestType = com.desmos.subspaces.v3.MsgSetUserGroupPermissions.class,
      responseType = com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserGroupPermissions,
      com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserGroupPermissions, com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> getSetUserGroupPermissionsMethod;
    if ((getSetUserGroupPermissionsMethod = MsgGrpc.getSetUserGroupPermissionsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUserGroupPermissionsMethod = MsgGrpc.getSetUserGroupPermissionsMethod) == null) {
          MsgGrpc.getSetUserGroupPermissionsMethod = getSetUserGroupPermissionsMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgSetUserGroupPermissions, com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserGroupPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgSetUserGroupPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUserGroupPermissions"))
              .build();
        }
      }
    }
    return getSetUserGroupPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteUserGroup,
      com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUserGroup",
      requestType = com.desmos.subspaces.v3.MsgDeleteUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgDeleteUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteUserGroup,
      com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgDeleteUserGroup, com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> getDeleteUserGroupMethod;
    if ((getDeleteUserGroupMethod = MsgGrpc.getDeleteUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteUserGroupMethod = MsgGrpc.getDeleteUserGroupMethod) == null) {
          MsgGrpc.getDeleteUserGroupMethod = getDeleteUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgDeleteUserGroup, com.desmos.subspaces.v3.MsgDeleteUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgDeleteUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteUserGroup"))
              .build();
        }
      }
    }
    return getDeleteUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgAddUserToUserGroup,
      com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserToUserGroup",
      requestType = com.desmos.subspaces.v3.MsgAddUserToUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgAddUserToUserGroup,
      com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgAddUserToUserGroup, com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> getAddUserToUserGroupMethod;
    if ((getAddUserToUserGroupMethod = MsgGrpc.getAddUserToUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddUserToUserGroupMethod = MsgGrpc.getAddUserToUserGroupMethod) == null) {
          MsgGrpc.getAddUserToUserGroupMethod = getAddUserToUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgAddUserToUserGroup, com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserToUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgAddUserToUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddUserToUserGroup"))
              .build();
        }
      }
    }
    return getAddUserToUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup,
      com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserFromUserGroup",
      requestType = com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup.class,
      responseType = com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup,
      com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup, com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> getRemoveUserFromUserGroupMethod;
    if ((getRemoveUserFromUserGroupMethod = MsgGrpc.getRemoveUserFromUserGroupMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemoveUserFromUserGroupMethod = MsgGrpc.getRemoveUserFromUserGroupMethod) == null) {
          MsgGrpc.getRemoveUserFromUserGroupMethod = getRemoveUserFromUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup, com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserFromUserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemoveUserFromUserGroup"))
              .build();
        }
      }
    }
    return getRemoveUserFromUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserPermissions,
      com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserPermissions",
      requestType = com.desmos.subspaces.v3.MsgSetUserPermissions.class,
      responseType = com.desmos.subspaces.v3.MsgSetUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserPermissions,
      com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgSetUserPermissions, com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> getSetUserPermissionsMethod;
    if ((getSetUserPermissionsMethod = MsgGrpc.getSetUserPermissionsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetUserPermissionsMethod = MsgGrpc.getSetUserPermissionsMethod) == null) {
          MsgGrpc.getSetUserPermissionsMethod = getSetUserPermissionsMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgSetUserPermissions, com.desmos.subspaces.v3.MsgSetUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetUserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgSetUserPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgSetUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetUserPermissions"))
              .build();
        }
      }
    }
    return getSetUserPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization,
      com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> getGrantTreasuryAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantTreasuryAuthorization",
      requestType = com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization.class,
      responseType = com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization,
      com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> getGrantTreasuryAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization, com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> getGrantTreasuryAuthorizationMethod;
    if ((getGrantTreasuryAuthorizationMethod = MsgGrpc.getGrantTreasuryAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGrantTreasuryAuthorizationMethod = MsgGrpc.getGrantTreasuryAuthorizationMethod) == null) {
          MsgGrpc.getGrantTreasuryAuthorizationMethod = getGrantTreasuryAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization, com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantTreasuryAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GrantTreasuryAuthorization"))
              .build();
        }
      }
    }
    return getGrantTreasuryAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization,
      com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> getRevokeTreasuryAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeTreasuryAuthorization",
      requestType = com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization.class,
      responseType = com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization,
      com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> getRevokeTreasuryAuthorizationMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization, com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> getRevokeTreasuryAuthorizationMethod;
    if ((getRevokeTreasuryAuthorizationMethod = MsgGrpc.getRevokeTreasuryAuthorizationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeTreasuryAuthorizationMethod = MsgGrpc.getRevokeTreasuryAuthorizationMethod) == null) {
          MsgGrpc.getRevokeTreasuryAuthorizationMethod = getRevokeTreasuryAuthorizationMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization, com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeTreasuryAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeTreasuryAuthorization"))
              .build();
        }
      }
    }
    return getRevokeTreasuryAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantAllowance,
      com.desmos.subspaces.v3.MsgGrantAllowanceResponse> getGrantAllowanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GrantAllowance",
      requestType = com.desmos.subspaces.v3.MsgGrantAllowance.class,
      responseType = com.desmos.subspaces.v3.MsgGrantAllowanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantAllowance,
      com.desmos.subspaces.v3.MsgGrantAllowanceResponse> getGrantAllowanceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgGrantAllowance, com.desmos.subspaces.v3.MsgGrantAllowanceResponse> getGrantAllowanceMethod;
    if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGrantAllowanceMethod = MsgGrpc.getGrantAllowanceMethod) == null) {
          MsgGrpc.getGrantAllowanceMethod = getGrantAllowanceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgGrantAllowance, com.desmos.subspaces.v3.MsgGrantAllowanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GrantAllowance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgGrantAllowance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgGrantAllowanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GrantAllowance"))
              .build();
        }
      }
    }
    return getGrantAllowanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeAllowance,
      com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeAllowance",
      requestType = com.desmos.subspaces.v3.MsgRevokeAllowance.class,
      responseType = com.desmos.subspaces.v3.MsgRevokeAllowanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeAllowance,
      com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.MsgRevokeAllowance, com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> getRevokeAllowanceMethod;
    if ((getRevokeAllowanceMethod = MsgGrpc.getRevokeAllowanceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRevokeAllowanceMethod = MsgGrpc.getRevokeAllowanceMethod) == null) {
          MsgGrpc.getRevokeAllowanceMethod = getRevokeAllowanceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.MsgRevokeAllowance, com.desmos.subspaces.v3.MsgRevokeAllowanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeAllowance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRevokeAllowance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.MsgRevokeAllowanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RevokeAllowance"))
              .build();
        }
      }
    }
    return getRevokeAllowanceMethod;
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
   * Msg defines subspaces Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    default void createSubspace(com.desmos.subspaces.v3.MsgCreateSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSubspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    default void editSubspace(com.desmos.subspaces.v3.MsgEditSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSubspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    default void deleteSubspace(com.desmos.subspaces.v3.MsgDeleteSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    default void createSection(com.desmos.subspaces.v3.MsgCreateSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    default void editSection(com.desmos.subspaces.v3.MsgEditSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    default void moveSection(com.desmos.subspaces.v3.MsgMoveSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    default void deleteSection(com.desmos.subspaces.v3.MsgDeleteSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    default void createUserGroup(com.desmos.subspaces.v3.MsgCreateUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    default void editUserGroup(com.desmos.subspaces.v3.MsgEditUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    default void moveUserGroup(com.desmos.subspaces.v3.MsgMoveUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    default void setUserGroupPermissions(com.desmos.subspaces.v3.MsgSetUserGroupPermissions request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserGroupPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    default void deleteUserGroup(com.desmos.subspaces.v3.MsgDeleteUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    default void addUserToUserGroup(com.desmos.subspaces.v3.MsgAddUserToUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserToUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    default void removeUserFromUserGroup(com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserFromUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    default void setUserPermissions(com.desmos.subspaces.v3.MsgSetUserPermissions request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetUserPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GrantTreasuryAuthorization allows managers who have the permission to grant
     * a treasury authorization to a user
     * </pre>
     */
    default void grantTreasuryAuthorization(com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantTreasuryAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeTreasuryAuthorization allows managers who have the permission to
     * revoke an existing treasury authorization
     * </pre>
     */
    default void revokeTreasuryAuthorization(com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeTreasuryAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GrantAllowance allows the granter to grant a fee allowance to the
     * grantee
     * </pre>
     */
    default void grantAllowance(com.desmos.subspaces.v3.MsgGrantAllowance request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrantAllowanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeAllowance allows a granter to revoke any existing treasury allowance
     * that has been granted to the grantee
     * </pre>
     */
    default void revokeAllowance(com.desmos.subspaces.v3.MsgRevokeAllowance request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeAllowanceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines subspaces Msg service.
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
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public void createSubspace(com.desmos.subspaces.v3.MsgCreateSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSubspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public void editSubspace(com.desmos.subspaces.v3.MsgEditSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSubspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public void deleteSubspace(com.desmos.subspaces.v3.MsgDeleteSubspace request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public void createSection(com.desmos.subspaces.v3.MsgCreateSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public void editSection(com.desmos.subspaces.v3.MsgEditSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public void moveSection(com.desmos.subspaces.v3.MsgMoveSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public void deleteSection(com.desmos.subspaces.v3.MsgDeleteSection request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public void createUserGroup(com.desmos.subspaces.v3.MsgCreateUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public void editUserGroup(com.desmos.subspaces.v3.MsgEditUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public void moveUserGroup(com.desmos.subspaces.v3.MsgMoveUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public void setUserGroupPermissions(com.desmos.subspaces.v3.MsgSetUserGroupPermissions request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserGroupPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public void deleteUserGroup(com.desmos.subspaces.v3.MsgDeleteUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public void addUserToUserGroup(com.desmos.subspaces.v3.MsgAddUserToUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserToUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public void removeUserFromUserGroup(com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserFromUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public void setUserPermissions(com.desmos.subspaces.v3.MsgSetUserPermissions request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GrantTreasuryAuthorization allows managers who have the permission to grant
     * a treasury authorization to a user
     * </pre>
     */
    public void grantTreasuryAuthorization(com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantTreasuryAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeTreasuryAuthorization allows managers who have the permission to
     * revoke an existing treasury authorization
     * </pre>
     */
    public void revokeTreasuryAuthorization(com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeTreasuryAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GrantAllowance allows the granter to grant a fee allowance to the
     * grantee
     * </pre>
     */
    public void grantAllowance(com.desmos.subspaces.v3.MsgGrantAllowance request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantAllowanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeAllowance allows a granter to revoke any existing treasury allowance
     * that has been granted to the grantee
     * </pre>
     */
    public void revokeAllowance(com.desmos.subspaces.v3.MsgRevokeAllowance request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeAllowanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgCreateSubspaceResponse createSubspace(com.desmos.subspaces.v3.MsgCreateSubspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgEditSubspaceResponse editSubspace(com.desmos.subspaces.v3.MsgEditSubspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgDeleteSubspaceResponse deleteSubspace(com.desmos.subspaces.v3.MsgDeleteSubspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgCreateSectionResponse createSection(com.desmos.subspaces.v3.MsgCreateSection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgEditSectionResponse editSection(com.desmos.subspaces.v3.MsgEditSection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgMoveSectionResponse moveSection(com.desmos.subspaces.v3.MsgMoveSection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgDeleteSectionResponse deleteSection(com.desmos.subspaces.v3.MsgDeleteSection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgCreateUserGroupResponse createUserGroup(com.desmos.subspaces.v3.MsgCreateUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgEditUserGroupResponse editUserGroup(com.desmos.subspaces.v3.MsgEditUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgMoveUserGroupResponse moveUserGroup(com.desmos.subspaces.v3.MsgMoveUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse setUserGroupPermissions(com.desmos.subspaces.v3.MsgSetUserGroupPermissions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserGroupPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgDeleteUserGroupResponse deleteUserGroup(com.desmos.subspaces.v3.MsgDeleteUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse addUserToUserGroup(com.desmos.subspaces.v3.MsgAddUserToUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserToUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse removeUserFromUserGroup(com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserFromUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgSetUserPermissionsResponse setUserPermissions(com.desmos.subspaces.v3.MsgSetUserPermissions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetUserPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GrantTreasuryAuthorization allows managers who have the permission to grant
     * a treasury authorization to a user
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse grantTreasuryAuthorization(com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantTreasuryAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeTreasuryAuthorization allows managers who have the permission to
     * revoke an existing treasury authorization
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse revokeTreasuryAuthorization(com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeTreasuryAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GrantAllowance allows the granter to grant a fee allowance to the
     * grantee
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgGrantAllowanceResponse grantAllowance(com.desmos.subspaces.v3.MsgGrantAllowance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrantAllowanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeAllowance allows a granter to revoke any existing treasury allowance
     * that has been granted to the grantee
     * </pre>
     */
    public com.desmos.subspaces.v3.MsgRevokeAllowanceResponse revokeAllowance(com.desmos.subspaces.v3.MsgRevokeAllowance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeAllowanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines subspaces Msg service.
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
     * CreateSubspace allows to create a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgCreateSubspaceResponse> createSubspace(
        com.desmos.subspaces.v3.MsgCreateSubspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditSubspace allows to edit a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgEditSubspaceResponse> editSubspace(
        com.desmos.subspaces.v3.MsgEditSubspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSubspace allows to delete a subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgDeleteSubspaceResponse> deleteSubspace(
        com.desmos.subspaces.v3.MsgDeleteSubspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSection allows to create a new subspace section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgCreateSectionResponse> createSection(
        com.desmos.subspaces.v3.MsgCreateSection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditSection allows to edit an existing section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgEditSectionResponse> editSection(
        com.desmos.subspaces.v3.MsgEditSection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveSection allows to move an existing section to another parent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgMoveSectionResponse> moveSection(
        com.desmos.subspaces.v3.MsgMoveSection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSection allows to delete an existing section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgDeleteSectionResponse> deleteSection(
        com.desmos.subspaces.v3.MsgDeleteSection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUserGroup allows to create a user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgCreateUserGroupResponse> createUserGroup(
        com.desmos.subspaces.v3.MsgCreateUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditUserGroup allows to edit a user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgEditUserGroupResponse> editUserGroup(
        com.desmos.subspaces.v3.MsgEditUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MoveUserGroup allows to move a user group from a section to another
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgMoveUserGroupResponse> moveUserGroup(
        com.desmos.subspaces.v3.MsgMoveUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetUserGroupPermissions allows to set the permissions for a specific group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse> setUserGroupPermissions(
        com.desmos.subspaces.v3.MsgSetUserGroupPermissions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserGroupPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteUserGroup allows to delete an existing user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgDeleteUserGroupResponse> deleteUserGroup(
        com.desmos.subspaces.v3.MsgDeleteUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddUserToUserGroup allows to add a specific user to a specific user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse> addUserToUserGroup(
        com.desmos.subspaces.v3.MsgAddUserToUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserToUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveUserFromUserGroup allows to remove a specific user from a specific
     * user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse> removeUserFromUserGroup(
        com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserFromUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetUserPermissions allows to set the permissions for a specific user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgSetUserPermissionsResponse> setUserPermissions(
        com.desmos.subspaces.v3.MsgSetUserPermissions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetUserPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GrantTreasuryAuthorization allows managers who have the permission to grant
     * a treasury authorization to a user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse> grantTreasuryAuthorization(
        com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantTreasuryAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeTreasuryAuthorization allows managers who have the permission to
     * revoke an existing treasury authorization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse> revokeTreasuryAuthorization(
        com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeTreasuryAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GrantAllowance allows the granter to grant a fee allowance to the
     * grantee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgGrantAllowanceResponse> grantAllowance(
        com.desmos.subspaces.v3.MsgGrantAllowance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrantAllowanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeAllowance allows a granter to revoke any existing treasury allowance
     * that has been granted to the grantee
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.MsgRevokeAllowanceResponse> revokeAllowance(
        com.desmos.subspaces.v3.MsgRevokeAllowance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeAllowanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SUBSPACE = 0;
  private static final int METHODID_EDIT_SUBSPACE = 1;
  private static final int METHODID_DELETE_SUBSPACE = 2;
  private static final int METHODID_CREATE_SECTION = 3;
  private static final int METHODID_EDIT_SECTION = 4;
  private static final int METHODID_MOVE_SECTION = 5;
  private static final int METHODID_DELETE_SECTION = 6;
  private static final int METHODID_CREATE_USER_GROUP = 7;
  private static final int METHODID_EDIT_USER_GROUP = 8;
  private static final int METHODID_MOVE_USER_GROUP = 9;
  private static final int METHODID_SET_USER_GROUP_PERMISSIONS = 10;
  private static final int METHODID_DELETE_USER_GROUP = 11;
  private static final int METHODID_ADD_USER_TO_USER_GROUP = 12;
  private static final int METHODID_REMOVE_USER_FROM_USER_GROUP = 13;
  private static final int METHODID_SET_USER_PERMISSIONS = 14;
  private static final int METHODID_GRANT_TREASURY_AUTHORIZATION = 15;
  private static final int METHODID_REVOKE_TREASURY_AUTHORIZATION = 16;
  private static final int METHODID_GRANT_ALLOWANCE = 17;
  private static final int METHODID_REVOKE_ALLOWANCE = 18;

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
        case METHODID_CREATE_SUBSPACE:
          serviceImpl.createSubspace((com.desmos.subspaces.v3.MsgCreateSubspace) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSubspaceResponse>) responseObserver);
          break;
        case METHODID_EDIT_SUBSPACE:
          serviceImpl.editSubspace((com.desmos.subspaces.v3.MsgEditSubspace) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSubspaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_SUBSPACE:
          serviceImpl.deleteSubspace((com.desmos.subspaces.v3.MsgDeleteSubspace) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSubspaceResponse>) responseObserver);
          break;
        case METHODID_CREATE_SECTION:
          serviceImpl.createSection((com.desmos.subspaces.v3.MsgCreateSection) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateSectionResponse>) responseObserver);
          break;
        case METHODID_EDIT_SECTION:
          serviceImpl.editSection((com.desmos.subspaces.v3.MsgEditSection) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditSectionResponse>) responseObserver);
          break;
        case METHODID_MOVE_SECTION:
          serviceImpl.moveSection((com.desmos.subspaces.v3.MsgMoveSection) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveSectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SECTION:
          serviceImpl.deleteSection((com.desmos.subspaces.v3.MsgDeleteSection) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteSectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_GROUP:
          serviceImpl.createUserGroup((com.desmos.subspaces.v3.MsgCreateUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgCreateUserGroupResponse>) responseObserver);
          break;
        case METHODID_EDIT_USER_GROUP:
          serviceImpl.editUserGroup((com.desmos.subspaces.v3.MsgEditUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgEditUserGroupResponse>) responseObserver);
          break;
        case METHODID_MOVE_USER_GROUP:
          serviceImpl.moveUserGroup((com.desmos.subspaces.v3.MsgMoveUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgMoveUserGroupResponse>) responseObserver);
          break;
        case METHODID_SET_USER_GROUP_PERMISSIONS:
          serviceImpl.setUserGroupPermissions((com.desmos.subspaces.v3.MsgSetUserGroupPermissions) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_GROUP:
          serviceImpl.deleteUserGroup((com.desmos.subspaces.v3.MsgDeleteUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgDeleteUserGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_TO_USER_GROUP:
          serviceImpl.addUserToUserGroup((com.desmos.subspaces.v3.MsgAddUserToUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_FROM_USER_GROUP:
          serviceImpl.removeUserFromUserGroup((com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse>) responseObserver);
          break;
        case METHODID_SET_USER_PERMISSIONS:
          serviceImpl.setUserPermissions((com.desmos.subspaces.v3.MsgSetUserPermissions) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgSetUserPermissionsResponse>) responseObserver);
          break;
        case METHODID_GRANT_TREASURY_AUTHORIZATION:
          serviceImpl.grantTreasuryAuthorization((com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse>) responseObserver);
          break;
        case METHODID_REVOKE_TREASURY_AUTHORIZATION:
          serviceImpl.revokeTreasuryAuthorization((com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse>) responseObserver);
          break;
        case METHODID_GRANT_ALLOWANCE:
          serviceImpl.grantAllowance((com.desmos.subspaces.v3.MsgGrantAllowance) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgGrantAllowanceResponse>) responseObserver);
          break;
        case METHODID_REVOKE_ALLOWANCE:
          serviceImpl.revokeAllowance((com.desmos.subspaces.v3.MsgRevokeAllowance) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.MsgRevokeAllowanceResponse>) responseObserver);
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
          getCreateSubspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgCreateSubspace,
              com.desmos.subspaces.v3.MsgCreateSubspaceResponse>(
                service, METHODID_CREATE_SUBSPACE)))
        .addMethod(
          getEditSubspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgEditSubspace,
              com.desmos.subspaces.v3.MsgEditSubspaceResponse>(
                service, METHODID_EDIT_SUBSPACE)))
        .addMethod(
          getDeleteSubspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgDeleteSubspace,
              com.desmos.subspaces.v3.MsgDeleteSubspaceResponse>(
                service, METHODID_DELETE_SUBSPACE)))
        .addMethod(
          getCreateSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgCreateSection,
              com.desmos.subspaces.v3.MsgCreateSectionResponse>(
                service, METHODID_CREATE_SECTION)))
        .addMethod(
          getEditSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgEditSection,
              com.desmos.subspaces.v3.MsgEditSectionResponse>(
                service, METHODID_EDIT_SECTION)))
        .addMethod(
          getMoveSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgMoveSection,
              com.desmos.subspaces.v3.MsgMoveSectionResponse>(
                service, METHODID_MOVE_SECTION)))
        .addMethod(
          getDeleteSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgDeleteSection,
              com.desmos.subspaces.v3.MsgDeleteSectionResponse>(
                service, METHODID_DELETE_SECTION)))
        .addMethod(
          getCreateUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgCreateUserGroup,
              com.desmos.subspaces.v3.MsgCreateUserGroupResponse>(
                service, METHODID_CREATE_USER_GROUP)))
        .addMethod(
          getEditUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgEditUserGroup,
              com.desmos.subspaces.v3.MsgEditUserGroupResponse>(
                service, METHODID_EDIT_USER_GROUP)))
        .addMethod(
          getMoveUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgMoveUserGroup,
              com.desmos.subspaces.v3.MsgMoveUserGroupResponse>(
                service, METHODID_MOVE_USER_GROUP)))
        .addMethod(
          getSetUserGroupPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgSetUserGroupPermissions,
              com.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse>(
                service, METHODID_SET_USER_GROUP_PERMISSIONS)))
        .addMethod(
          getDeleteUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgDeleteUserGroup,
              com.desmos.subspaces.v3.MsgDeleteUserGroupResponse>(
                service, METHODID_DELETE_USER_GROUP)))
        .addMethod(
          getAddUserToUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgAddUserToUserGroup,
              com.desmos.subspaces.v3.MsgAddUserToUserGroupResponse>(
                service, METHODID_ADD_USER_TO_USER_GROUP)))
        .addMethod(
          getRemoveUserFromUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgRemoveUserFromUserGroup,
              com.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse>(
                service, METHODID_REMOVE_USER_FROM_USER_GROUP)))
        .addMethod(
          getSetUserPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgSetUserPermissions,
              com.desmos.subspaces.v3.MsgSetUserPermissionsResponse>(
                service, METHODID_SET_USER_PERMISSIONS)))
        .addMethod(
          getGrantTreasuryAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgGrantTreasuryAuthorization,
              com.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse>(
                service, METHODID_GRANT_TREASURY_AUTHORIZATION)))
        .addMethod(
          getRevokeTreasuryAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization,
              com.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse>(
                service, METHODID_REVOKE_TREASURY_AUTHORIZATION)))
        .addMethod(
          getGrantAllowanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgGrantAllowance,
              com.desmos.subspaces.v3.MsgGrantAllowanceResponse>(
                service, METHODID_GRANT_ALLOWANCE)))
        .addMethod(
          getRevokeAllowanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.MsgRevokeAllowance,
              com.desmos.subspaces.v3.MsgRevokeAllowanceResponse>(
                service, METHODID_REVOKE_ALLOWANCE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.desmos.subspaces.v3.MsgsProto.getDescriptor();
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
              .addMethod(getCreateSubspaceMethod())
              .addMethod(getEditSubspaceMethod())
              .addMethod(getDeleteSubspaceMethod())
              .addMethod(getCreateSectionMethod())
              .addMethod(getEditSectionMethod())
              .addMethod(getMoveSectionMethod())
              .addMethod(getDeleteSectionMethod())
              .addMethod(getCreateUserGroupMethod())
              .addMethod(getEditUserGroupMethod())
              .addMethod(getMoveUserGroupMethod())
              .addMethod(getSetUserGroupPermissionsMethod())
              .addMethod(getDeleteUserGroupMethod())
              .addMethod(getAddUserToUserGroupMethod())
              .addMethod(getRemoveUserFromUserGroupMethod())
              .addMethod(getSetUserPermissionsMethod())
              .addMethod(getGrantTreasuryAuthorizationMethod())
              .addMethod(getRevokeTreasuryAuthorizationMethod())
              .addMethod(getGrantAllowanceMethod())
              .addMethod(getRevokeAllowanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
