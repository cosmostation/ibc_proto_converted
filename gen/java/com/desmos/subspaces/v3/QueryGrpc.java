package com.desmos.subspaces.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: desmos/subspaces/v3/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "desmos.subspaces.v3.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspacesRequest,
      com.desmos.subspaces.v3.QuerySubspacesResponse> getSubspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspaces",
      requestType = com.desmos.subspaces.v3.QuerySubspacesRequest.class,
      responseType = com.desmos.subspaces.v3.QuerySubspacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspacesRequest,
      com.desmos.subspaces.v3.QuerySubspacesResponse> getSubspacesMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspacesRequest, com.desmos.subspaces.v3.QuerySubspacesResponse> getSubspacesMethod;
    if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspacesMethod = QueryGrpc.getSubspacesMethod) == null) {
          QueryGrpc.getSubspacesMethod = getSubspacesMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QuerySubspacesRequest, com.desmos.subspaces.v3.QuerySubspacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySubspacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySubspacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspaces"))
              .build();
        }
      }
    }
    return getSubspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspaceRequest,
      com.desmos.subspaces.v3.QuerySubspaceResponse> getSubspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subspace",
      requestType = com.desmos.subspaces.v3.QuerySubspaceRequest.class,
      responseType = com.desmos.subspaces.v3.QuerySubspaceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspaceRequest,
      com.desmos.subspaces.v3.QuerySubspaceResponse> getSubspaceMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySubspaceRequest, com.desmos.subspaces.v3.QuerySubspaceResponse> getSubspaceMethod;
    if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSubspaceMethod = QueryGrpc.getSubspaceMethod) == null) {
          QueryGrpc.getSubspaceMethod = getSubspaceMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QuerySubspaceRequest, com.desmos.subspaces.v3.QuerySubspaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySubspaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySubspaceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Subspace"))
              .build();
        }
      }
    }
    return getSubspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionsRequest,
      com.desmos.subspaces.v3.QuerySectionsResponse> getSectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sections",
      requestType = com.desmos.subspaces.v3.QuerySectionsRequest.class,
      responseType = com.desmos.subspaces.v3.QuerySectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionsRequest,
      com.desmos.subspaces.v3.QuerySectionsResponse> getSectionsMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionsRequest, com.desmos.subspaces.v3.QuerySectionsResponse> getSectionsMethod;
    if ((getSectionsMethod = QueryGrpc.getSectionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSectionsMethod = QueryGrpc.getSectionsMethod) == null) {
          QueryGrpc.getSectionsMethod = getSectionsMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QuerySectionsRequest, com.desmos.subspaces.v3.QuerySectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Sections"))
              .build();
        }
      }
    }
    return getSectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionRequest,
      com.desmos.subspaces.v3.QuerySectionResponse> getSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Section",
      requestType = com.desmos.subspaces.v3.QuerySectionRequest.class,
      responseType = com.desmos.subspaces.v3.QuerySectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionRequest,
      com.desmos.subspaces.v3.QuerySectionResponse> getSectionMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QuerySectionRequest, com.desmos.subspaces.v3.QuerySectionResponse> getSectionMethod;
    if ((getSectionMethod = QueryGrpc.getSectionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSectionMethod = QueryGrpc.getSectionMethod) == null) {
          QueryGrpc.getSectionMethod = getSectionMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QuerySectionRequest, com.desmos.subspaces.v3.QuerySectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Section"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QuerySectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Section"))
              .build();
        }
      }
    }
    return getSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupsRequest,
      com.desmos.subspaces.v3.QueryUserGroupsResponse> getUserGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroups",
      requestType = com.desmos.subspaces.v3.QueryUserGroupsRequest.class,
      responseType = com.desmos.subspaces.v3.QueryUserGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupsRequest,
      com.desmos.subspaces.v3.QueryUserGroupsResponse> getUserGroupsMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupsRequest, com.desmos.subspaces.v3.QueryUserGroupsResponse> getUserGroupsMethod;
    if ((getUserGroupsMethod = QueryGrpc.getUserGroupsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupsMethod = QueryGrpc.getUserGroupsMethod) == null) {
          QueryGrpc.getUserGroupsMethod = getUserGroupsMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryUserGroupsRequest, com.desmos.subspaces.v3.QueryUserGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroups"))
              .build();
        }
      }
    }
    return getUserGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupRequest,
      com.desmos.subspaces.v3.QueryUserGroupResponse> getUserGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroup",
      requestType = com.desmos.subspaces.v3.QueryUserGroupRequest.class,
      responseType = com.desmos.subspaces.v3.QueryUserGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupRequest,
      com.desmos.subspaces.v3.QueryUserGroupResponse> getUserGroupMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupRequest, com.desmos.subspaces.v3.QueryUserGroupResponse> getUserGroupMethod;
    if ((getUserGroupMethod = QueryGrpc.getUserGroupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupMethod = QueryGrpc.getUserGroupMethod) == null) {
          QueryGrpc.getUserGroupMethod = getUserGroupMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryUserGroupRequest, com.desmos.subspaces.v3.QueryUserGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroup"))
              .build();
        }
      }
    }
    return getUserGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupMembersRequest,
      com.desmos.subspaces.v3.QueryUserGroupMembersResponse> getUserGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserGroupMembers",
      requestType = com.desmos.subspaces.v3.QueryUserGroupMembersRequest.class,
      responseType = com.desmos.subspaces.v3.QueryUserGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupMembersRequest,
      com.desmos.subspaces.v3.QueryUserGroupMembersResponse> getUserGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserGroupMembersRequest, com.desmos.subspaces.v3.QueryUserGroupMembersResponse> getUserGroupMembersMethod;
    if ((getUserGroupMembersMethod = QueryGrpc.getUserGroupMembersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserGroupMembersMethod = QueryGrpc.getUserGroupMembersMethod) == null) {
          QueryGrpc.getUserGroupMembersMethod = getUserGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryUserGroupMembersRequest, com.desmos.subspaces.v3.QueryUserGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserGroupMembers"))
              .build();
        }
      }
    }
    return getUserGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserPermissionsRequest,
      com.desmos.subspaces.v3.QueryUserPermissionsResponse> getUserPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserPermissions",
      requestType = com.desmos.subspaces.v3.QueryUserPermissionsRequest.class,
      responseType = com.desmos.subspaces.v3.QueryUserPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserPermissionsRequest,
      com.desmos.subspaces.v3.QueryUserPermissionsResponse> getUserPermissionsMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserPermissionsRequest, com.desmos.subspaces.v3.QueryUserPermissionsResponse> getUserPermissionsMethod;
    if ((getUserPermissionsMethod = QueryGrpc.getUserPermissionsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserPermissionsMethod = QueryGrpc.getUserPermissionsMethod) == null) {
          QueryGrpc.getUserPermissionsMethod = getUserPermissionsMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryUserPermissionsRequest, com.desmos.subspaces.v3.QueryUserPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserPermissions"))
              .build();
        }
      }
    }
    return getUserPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserAllowancesRequest,
      com.desmos.subspaces.v3.QueryUserAllowancesResponse> getUserAllowancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UserAllowances",
      requestType = com.desmos.subspaces.v3.QueryUserAllowancesRequest.class,
      responseType = com.desmos.subspaces.v3.QueryUserAllowancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserAllowancesRequest,
      com.desmos.subspaces.v3.QueryUserAllowancesResponse> getUserAllowancesMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryUserAllowancesRequest, com.desmos.subspaces.v3.QueryUserAllowancesResponse> getUserAllowancesMethod;
    if ((getUserAllowancesMethod = QueryGrpc.getUserAllowancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUserAllowancesMethod = QueryGrpc.getUserAllowancesMethod) == null) {
          QueryGrpc.getUserAllowancesMethod = getUserAllowancesMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryUserAllowancesRequest, com.desmos.subspaces.v3.QueryUserAllowancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UserAllowances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserAllowancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryUserAllowancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UserAllowances"))
              .build();
        }
      }
    }
    return getUserAllowancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryGroupAllowancesRequest,
      com.desmos.subspaces.v3.QueryGroupAllowancesResponse> getGroupAllowancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupAllowances",
      requestType = com.desmos.subspaces.v3.QueryGroupAllowancesRequest.class,
      responseType = com.desmos.subspaces.v3.QueryGroupAllowancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryGroupAllowancesRequest,
      com.desmos.subspaces.v3.QueryGroupAllowancesResponse> getGroupAllowancesMethod() {
    io.grpc.MethodDescriptor<com.desmos.subspaces.v3.QueryGroupAllowancesRequest, com.desmos.subspaces.v3.QueryGroupAllowancesResponse> getGroupAllowancesMethod;
    if ((getGroupAllowancesMethod = QueryGrpc.getGroupAllowancesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupAllowancesMethod = QueryGrpc.getGroupAllowancesMethod) == null) {
          QueryGrpc.getGroupAllowancesMethod = getGroupAllowancesMethod =
              io.grpc.MethodDescriptor.<com.desmos.subspaces.v3.QueryGroupAllowancesRequest, com.desmos.subspaces.v3.QueryGroupAllowancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupAllowances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryGroupAllowancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.subspaces.v3.QueryGroupAllowancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupAllowances"))
              .build();
        }
      }
    }
    return getGroupAllowancesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @java.lang.Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @java.lang.Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @java.lang.Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    default void subspaces(com.desmos.subspaces.v3.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    default void subspace(com.desmos.subspaces.v3.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspaceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    default void sections(com.desmos.subspaces.v3.QuerySectionsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    default void section(com.desmos.subspaces.v3.QuerySectionRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    default void userGroups(com.desmos.subspaces.v3.QueryUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    default void userGroup(com.desmos.subspaces.v3.QueryUserGroupRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    default void userGroupMembers(com.desmos.subspaces.v3.QueryUserGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    default void userPermissions(com.desmos.subspaces.v3.QueryUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UserAllowances returns all the grants for users.
     * </pre>
     */
    default void userAllowances(com.desmos.subspaces.v3.QueryUserAllowancesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserAllowancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserAllowancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupAllowances returns all the grants for groups.
     * </pre>
     */
    default void groupAllowances(com.desmos.subspaces.v3.QueryGroupAllowancesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryGroupAllowancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupAllowancesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub
      extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public void subspaces(com.desmos.subspaces.v3.QuerySubspacesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public void subspace(com.desmos.subspaces.v3.QuerySubspaceRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspaceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public void sections(com.desmos.subspaces.v3.QuerySectionsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public void section(com.desmos.subspaces.v3.QuerySectionRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public void userGroups(com.desmos.subspaces.v3.QueryUserGroupsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public void userGroup(com.desmos.subspaces.v3.QueryUserGroupRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public void userGroupMembers(com.desmos.subspaces.v3.QueryUserGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public void userPermissions(com.desmos.subspaces.v3.QueryUserPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UserAllowances returns all the grants for users.
     * </pre>
     */
    public void userAllowances(com.desmos.subspaces.v3.QueryUserAllowancesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserAllowancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserAllowancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupAllowances returns all the grants for groups.
     * </pre>
     */
    public void groupAllowances(com.desmos.subspaces.v3.QueryGroupAllowancesRequest request,
        io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryGroupAllowancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupAllowancesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public com.desmos.subspaces.v3.QuerySubspacesResponse subspaces(com.desmos.subspaces.v3.QuerySubspacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public com.desmos.subspaces.v3.QuerySubspaceResponse subspace(com.desmos.subspaces.v3.QuerySubspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public com.desmos.subspaces.v3.QuerySectionsResponse sections(com.desmos.subspaces.v3.QuerySectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public com.desmos.subspaces.v3.QuerySectionResponse section(com.desmos.subspaces.v3.QuerySectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryUserGroupsResponse userGroups(com.desmos.subspaces.v3.QueryUserGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryUserGroupResponse userGroup(com.desmos.subspaces.v3.QueryUserGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryUserGroupMembersResponse userGroupMembers(com.desmos.subspaces.v3.QueryUserGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryUserPermissionsResponse userPermissions(com.desmos.subspaces.v3.QueryUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UserAllowances returns all the grants for users.
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryUserAllowancesResponse userAllowances(com.desmos.subspaces.v3.QueryUserAllowancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserAllowancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupAllowances returns all the grants for groups.
     * </pre>
     */
    public com.desmos.subspaces.v3.QueryGroupAllowancesResponse groupAllowances(com.desmos.subspaces.v3.QueryGroupAllowancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupAllowancesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subspaces queries all the subspaces inside Desmos
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QuerySubspacesResponse> subspaces(
        com.desmos.subspaces.v3.QuerySubspacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subspace queries all the information about the subspace with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QuerySubspaceResponse> subspace(
        com.desmos.subspaces.v3.QuerySubspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sections allows to query for the sections of a specific subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QuerySectionsResponse> sections(
        com.desmos.subspaces.v3.QuerySectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Section queries all the information about the section with the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QuerySectionResponse> section(
        com.desmos.subspaces.v3.QuerySectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroups queries all the groups that are present inside the subspace with
     * the given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryUserGroupsResponse> userGroups(
        com.desmos.subspaces.v3.QueryUserGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroup queries the user group having the given id inside the specific
     * subspace
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryUserGroupResponse> userGroup(
        com.desmos.subspaces.v3.QueryUserGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserGroupMembers queries all the members of a given user group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryUserGroupMembersResponse> userGroupMembers(
        com.desmos.subspaces.v3.QueryUserGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserPermissions queries the permissions for the given user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryUserPermissionsResponse> userPermissions(
        com.desmos.subspaces.v3.QueryUserPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UserAllowances returns all the grants for users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryUserAllowancesResponse> userAllowances(
        com.desmos.subspaces.v3.QueryUserAllowancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserAllowancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupAllowances returns all the grants for groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.subspaces.v3.QueryGroupAllowancesResponse> groupAllowances(
        com.desmos.subspaces.v3.QueryGroupAllowancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupAllowancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSPACES = 0;
  private static final int METHODID_SUBSPACE = 1;
  private static final int METHODID_SECTIONS = 2;
  private static final int METHODID_SECTION = 3;
  private static final int METHODID_USER_GROUPS = 4;
  private static final int METHODID_USER_GROUP = 5;
  private static final int METHODID_USER_GROUP_MEMBERS = 6;
  private static final int METHODID_USER_PERMISSIONS = 7;
  private static final int METHODID_USER_ALLOWANCES = 8;
  private static final int METHODID_GROUP_ALLOWANCES = 9;

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
        case METHODID_SUBSPACES:
          serviceImpl.subspaces((com.desmos.subspaces.v3.QuerySubspacesRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspacesResponse>) responseObserver);
          break;
        case METHODID_SUBSPACE:
          serviceImpl.subspace((com.desmos.subspaces.v3.QuerySubspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySubspaceResponse>) responseObserver);
          break;
        case METHODID_SECTIONS:
          serviceImpl.sections((com.desmos.subspaces.v3.QuerySectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionsResponse>) responseObserver);
          break;
        case METHODID_SECTION:
          serviceImpl.section((com.desmos.subspaces.v3.QuerySectionRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QuerySectionResponse>) responseObserver);
          break;
        case METHODID_USER_GROUPS:
          serviceImpl.userGroups((com.desmos.subspaces.v3.QueryUserGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupsResponse>) responseObserver);
          break;
        case METHODID_USER_GROUP:
          serviceImpl.userGroup((com.desmos.subspaces.v3.QueryUserGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupResponse>) responseObserver);
          break;
        case METHODID_USER_GROUP_MEMBERS:
          serviceImpl.userGroupMembers((com.desmos.subspaces.v3.QueryUserGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserGroupMembersResponse>) responseObserver);
          break;
        case METHODID_USER_PERMISSIONS:
          serviceImpl.userPermissions((com.desmos.subspaces.v3.QueryUserPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserPermissionsResponse>) responseObserver);
          break;
        case METHODID_USER_ALLOWANCES:
          serviceImpl.userAllowances((com.desmos.subspaces.v3.QueryUserAllowancesRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryUserAllowancesResponse>) responseObserver);
          break;
        case METHODID_GROUP_ALLOWANCES:
          serviceImpl.groupAllowances((com.desmos.subspaces.v3.QueryGroupAllowancesRequest) request,
              (io.grpc.stub.StreamObserver<com.desmos.subspaces.v3.QueryGroupAllowancesResponse>) responseObserver);
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
          getSubspacesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QuerySubspacesRequest,
              com.desmos.subspaces.v3.QuerySubspacesResponse>(
                service, METHODID_SUBSPACES)))
        .addMethod(
          getSubspaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QuerySubspaceRequest,
              com.desmos.subspaces.v3.QuerySubspaceResponse>(
                service, METHODID_SUBSPACE)))
        .addMethod(
          getSectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QuerySectionsRequest,
              com.desmos.subspaces.v3.QuerySectionsResponse>(
                service, METHODID_SECTIONS)))
        .addMethod(
          getSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QuerySectionRequest,
              com.desmos.subspaces.v3.QuerySectionResponse>(
                service, METHODID_SECTION)))
        .addMethod(
          getUserGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryUserGroupsRequest,
              com.desmos.subspaces.v3.QueryUserGroupsResponse>(
                service, METHODID_USER_GROUPS)))
        .addMethod(
          getUserGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryUserGroupRequest,
              com.desmos.subspaces.v3.QueryUserGroupResponse>(
                service, METHODID_USER_GROUP)))
        .addMethod(
          getUserGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryUserGroupMembersRequest,
              com.desmos.subspaces.v3.QueryUserGroupMembersResponse>(
                service, METHODID_USER_GROUP_MEMBERS)))
        .addMethod(
          getUserPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryUserPermissionsRequest,
              com.desmos.subspaces.v3.QueryUserPermissionsResponse>(
                service, METHODID_USER_PERMISSIONS)))
        .addMethod(
          getUserAllowancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryUserAllowancesRequest,
              com.desmos.subspaces.v3.QueryUserAllowancesResponse>(
                service, METHODID_USER_ALLOWANCES)))
        .addMethod(
          getGroupAllowancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.subspaces.v3.QueryGroupAllowancesRequest,
              com.desmos.subspaces.v3.QueryGroupAllowancesResponse>(
                service, METHODID_GROUP_ALLOWANCES)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.desmos.subspaces.v3.QueryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getSubspacesMethod())
              .addMethod(getSubspaceMethod())
              .addMethod(getSectionsMethod())
              .addMethod(getSectionMethod())
              .addMethod(getUserGroupsMethod())
              .addMethod(getUserGroupMethod())
              .addMethod(getUserGroupMembersMethod())
              .addMethod(getUserPermissionsMethod())
              .addMethod(getUserAllowancesMethod())
              .addMethod(getGroupAllowancesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
