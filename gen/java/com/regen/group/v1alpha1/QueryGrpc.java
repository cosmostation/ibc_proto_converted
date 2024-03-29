package com.regen.group.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query is the regen.group.v1alpha1 Query service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: regen/group/v1alpha1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "regen.group.v1alpha1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> getGroupInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupInfo",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> getGroupInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> getGroupInfoMethod;
    if ((getGroupInfoMethod = QueryGrpc.getGroupInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupInfoMethod = QueryGrpc.getGroupInfoMethod) == null) {
          QueryGrpc.getGroupInfoMethod = getGroupInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupInfo"))
              .build();
        }
      }
    }
    return getGroupInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> getGroupAccountInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupAccountInfo",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> getGroupAccountInfoMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> getGroupAccountInfoMethod;
    if ((getGroupAccountInfoMethod = QueryGrpc.getGroupAccountInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupAccountInfoMethod = QueryGrpc.getGroupAccountInfoMethod) == null) {
          QueryGrpc.getGroupAccountInfoMethod = getGroupAccountInfoMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupAccountInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupAccountInfo"))
              .build();
        }
      }
    }
    return getGroupAccountInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> getGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupMembers",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> getGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> getGroupMembersMethod;
    if ((getGroupMembersMethod = QueryGrpc.getGroupMembersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupMembersMethod = QueryGrpc.getGroupMembersMethod) == null) {
          QueryGrpc.getGroupMembersMethod = getGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupMembers"))
              .build();
        }
      }
    }
    return getGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> getGroupsByAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupsByAdmin",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> getGroupsByAdminMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> getGroupsByAdminMethod;
    if ((getGroupsByAdminMethod = QueryGrpc.getGroupsByAdminMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupsByAdminMethod = QueryGrpc.getGroupsByAdminMethod) == null) {
          QueryGrpc.getGroupsByAdminMethod = getGroupsByAdminMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupsByAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupsByAdmin"))
              .build();
        }
      }
    }
    return getGroupsByAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> getGroupAccountsByGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupAccountsByGroup",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> getGroupAccountsByGroupMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> getGroupAccountsByGroupMethod;
    if ((getGroupAccountsByGroupMethod = QueryGrpc.getGroupAccountsByGroupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupAccountsByGroupMethod = QueryGrpc.getGroupAccountsByGroupMethod) == null) {
          QueryGrpc.getGroupAccountsByGroupMethod = getGroupAccountsByGroupMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupAccountsByGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupAccountsByGroup"))
              .build();
        }
      }
    }
    return getGroupAccountsByGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> getGroupAccountsByAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupAccountsByAdmin",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest,
      com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> getGroupAccountsByAdminMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> getGroupAccountsByAdminMethod;
    if ((getGroupAccountsByAdminMethod = QueryGrpc.getGroupAccountsByAdminMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupAccountsByAdminMethod = QueryGrpc.getGroupAccountsByAdminMethod) == null) {
          QueryGrpc.getGroupAccountsByAdminMethod = getGroupAccountsByAdminMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest, com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupAccountsByAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupAccountsByAdmin"))
              .build();
        }
      }
    }
    return getGroupAccountsByAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalRequest,
      com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> getProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposal",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryProposalRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalRequest,
      com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> getProposalMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalRequest, com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> getProposalMethod;
    if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
          QueryGrpc.getProposalMethod = getProposalMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryProposalRequest, com.regen.group.v1alpha1.QueryProto.QueryProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposal"))
              .build();
        }
      }
    }
    return getProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest,
      com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> getProposalsByGroupAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalsByGroupAccount",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest,
      com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> getProposalsByGroupAccountMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest, com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> getProposalsByGroupAccountMethod;
    if ((getProposalsByGroupAccountMethod = QueryGrpc.getProposalsByGroupAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalsByGroupAccountMethod = QueryGrpc.getProposalsByGroupAccountMethod) == null) {
          QueryGrpc.getProposalsByGroupAccountMethod = getProposalsByGroupAccountMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest, com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalsByGroupAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProposalsByGroupAccount"))
              .build();
        }
      }
    }
    return getProposalsByGroupAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteByProposalVoter",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest, com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod;
    if ((getVoteByProposalVoterMethod = QueryGrpc.getVoteByProposalVoterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteByProposalVoterMethod = QueryGrpc.getVoteByProposalVoterMethod) == null) {
          QueryGrpc.getVoteByProposalVoterMethod = getVoteByProposalVoterMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest, com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteByProposalVoter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VoteByProposalVoter"))
              .build();
        }
      }
    }
    return getVoteByProposalVoterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> getVotesByProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotesByProposal",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> getVotesByProposalMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest, com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> getVotesByProposalMethod;
    if ((getVotesByProposalMethod = QueryGrpc.getVotesByProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesByProposalMethod = QueryGrpc.getVotesByProposalMethod) == null) {
          QueryGrpc.getVotesByProposalMethod = getVotesByProposalMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest, com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotesByProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotesByProposal"))
              .build();
        }
      }
    }
    return getVotesByProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> getVotesByVoterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotesByVoter",
      requestType = com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest.class,
      responseType = com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest,
      com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> getVotesByVoterMethod() {
    io.grpc.MethodDescriptor<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest, com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> getVotesByVoterMethod;
    if ((getVotesByVoterMethod = QueryGrpc.getVotesByVoterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesByVoterMethod = QueryGrpc.getVotesByVoterMethod) == null) {
          QueryGrpc.getVotesByVoterMethod = getVotesByVoterMethod =
              io.grpc.MethodDescriptor.<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest, com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotesByVoter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotesByVoter"))
              .build();
        }
      }
    }
    return getVotesByVoterMethod;
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
   * Query is the regen.group.v1alpha1 Query service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GroupInfo queries group info based on group id.
     * </pre>
     */
    default void groupInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupAccountInfo queries group account info based on group account address.
     * </pre>
     */
    default void groupAccountInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupAccountInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group
     * </pre>
     */
    default void groupMembers(com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    default void groupsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupsByAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupAccountsByGroup queries group accounts by group id.
     * </pre>
     */
    default void groupAccountsByGroup(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupAccountsByGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries group accounts by admin address.
     * </pre>
     */
    default void groupAccountsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupAccountsByAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    default void proposal(com.regen.group.v1alpha1.QueryProto.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProposalsByGroupAccount queries proposals based on group account address.
     * </pre>
     */
    default void proposalsByGroupAccount(com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalsByGroupAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    default void voteByProposalVoter(com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteByProposalVoterMethod(), responseObserver);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal.
     * </pre>
     */
    default void votesByProposal(com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesByProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    default void votesByVoter(com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesByVoterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query is the regen.group.v1alpha1 Query service.
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
   * Query is the regen.group.v1alpha1 Query service.
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
     * GroupInfo queries group info based on group id.
     * </pre>
     */
    public void groupInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupAccountInfo queries group account info based on group account address.
     * </pre>
     */
    public void groupAccountInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupAccountInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group
     * </pre>
     */
    public void groupMembers(com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public void groupsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupsByAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupAccountsByGroup queries group accounts by group id.
     * </pre>
     */
    public void groupAccountsByGroup(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupAccountsByGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries group accounts by admin address.
     * </pre>
     */
    public void groupAccountsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupAccountsByAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public void proposal(com.regen.group.v1alpha1.QueryProto.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProposalsByGroupAccount queries proposals based on group account address.
     * </pre>
     */
    public void proposalsByGroupAccount(com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalsByGroupAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public void voteByProposalVoter(com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteByProposalVoterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal.
     * </pre>
     */
    public void votesByProposal(com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesByProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public void votesByVoter(com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest request,
        io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesByVoterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query is the regen.group.v1alpha1 Query service.
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
     * GroupInfo queries group info based on group id.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse groupInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupAccountInfo queries group account info based on group account address.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse groupAccountInfo(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupAccountInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse groupMembers(com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse groupsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupsByAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupAccountsByGroup queries group accounts by group id.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse groupAccountsByGroup(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupAccountsByGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries group accounts by admin address.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse groupAccountsByAdmin(com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupAccountsByAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryProposalResponse proposal(com.regen.group.v1alpha1.QueryProto.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProposalsByGroupAccount queries proposals based on group account address.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse proposalsByGroupAccount(com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalsByGroupAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse voteByProposalVoter(com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteByProposalVoterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse votesByProposal(com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesByProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse votesByVoter(com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesByVoterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query is the regen.group.v1alpha1 Query service.
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
     * GroupInfo queries group info based on group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse> groupInfo(
        com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupAccountInfo queries group account info based on group account address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse> groupAccountInfo(
        com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupAccountInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse> groupMembers(
        com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse> groupsByAdmin(
        com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupsByAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupAccountsByGroup queries group accounts by group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse> groupAccountsByGroup(
        com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupAccountsByGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries group accounts by admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse> groupAccountsByAdmin(
        com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupAccountsByAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryProposalResponse> proposal(
        com.regen.group.v1alpha1.QueryProto.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProposalsByGroupAccount queries proposals based on group account address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse> proposalsByGroupAccount(
        com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalsByGroupAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse> voteByProposalVoter(
        com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteByProposalVoterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse> votesByProposal(
        com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesByProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse> votesByVoter(
        com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesByVoterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GROUP_INFO = 0;
  private static final int METHODID_GROUP_ACCOUNT_INFO = 1;
  private static final int METHODID_GROUP_MEMBERS = 2;
  private static final int METHODID_GROUPS_BY_ADMIN = 3;
  private static final int METHODID_GROUP_ACCOUNTS_BY_GROUP = 4;
  private static final int METHODID_GROUP_ACCOUNTS_BY_ADMIN = 5;
  private static final int METHODID_PROPOSAL = 6;
  private static final int METHODID_PROPOSALS_BY_GROUP_ACCOUNT = 7;
  private static final int METHODID_VOTE_BY_PROPOSAL_VOTER = 8;
  private static final int METHODID_VOTES_BY_PROPOSAL = 9;
  private static final int METHODID_VOTES_BY_VOTER = 10;

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
        case METHODID_GROUP_INFO:
          serviceImpl.groupInfo((com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse>) responseObserver);
          break;
        case METHODID_GROUP_ACCOUNT_INFO:
          serviceImpl.groupAccountInfo((com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse>) responseObserver);
          break;
        case METHODID_GROUP_MEMBERS:
          serviceImpl.groupMembers((com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse>) responseObserver);
          break;
        case METHODID_GROUPS_BY_ADMIN:
          serviceImpl.groupsByAdmin((com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse>) responseObserver);
          break;
        case METHODID_GROUP_ACCOUNTS_BY_GROUP:
          serviceImpl.groupAccountsByGroup((com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse>) responseObserver);
          break;
        case METHODID_GROUP_ACCOUNTS_BY_ADMIN:
          serviceImpl.groupAccountsByAdmin((com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL:
          serviceImpl.proposal((com.regen.group.v1alpha1.QueryProto.QueryProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS_BY_GROUP_ACCOUNT:
          serviceImpl.proposalsByGroupAccount((com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse>) responseObserver);
          break;
        case METHODID_VOTE_BY_PROPOSAL_VOTER:
          serviceImpl.voteByProposalVoter((com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse>) responseObserver);
          break;
        case METHODID_VOTES_BY_PROPOSAL:
          serviceImpl.votesByProposal((com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse>) responseObserver);
          break;
        case METHODID_VOTES_BY_VOTER:
          serviceImpl.votesByVoter((com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest) request,
              (io.grpc.stub.StreamObserver<com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse>) responseObserver);
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
          getGroupInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupInfoRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupInfoResponse>(
                service, METHODID_GROUP_INFO)))
        .addMethod(
          getGroupAccountInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountInfoResponse>(
                service, METHODID_GROUP_ACCOUNT_INFO)))
        .addMethod(
          getGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupMembersRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupMembersResponse>(
                service, METHODID_GROUP_MEMBERS)))
        .addMethod(
          getGroupsByAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupsByAdminResponse>(
                service, METHODID_GROUPS_BY_ADMIN)))
        .addMethod(
          getGroupAccountsByGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByGroupResponse>(
                service, METHODID_GROUP_ACCOUNTS_BY_GROUP)))
        .addMethod(
          getGroupAccountsByAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminRequest,
              com.regen.group.v1alpha1.QueryProto.QueryGroupAccountsByAdminResponse>(
                service, METHODID_GROUP_ACCOUNTS_BY_ADMIN)))
        .addMethod(
          getProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryProposalRequest,
              com.regen.group.v1alpha1.QueryProto.QueryProposalResponse>(
                service, METHODID_PROPOSAL)))
        .addMethod(
          getProposalsByGroupAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountRequest,
              com.regen.group.v1alpha1.QueryProto.QueryProposalsByGroupAccountResponse>(
                service, METHODID_PROPOSALS_BY_GROUP_ACCOUNT)))
        .addMethod(
          getVoteByProposalVoterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterRequest,
              com.regen.group.v1alpha1.QueryProto.QueryVoteByProposalVoterResponse>(
                service, METHODID_VOTE_BY_PROPOSAL_VOTER)))
        .addMethod(
          getVotesByProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalRequest,
              com.regen.group.v1alpha1.QueryProto.QueryVotesByProposalResponse>(
                service, METHODID_VOTES_BY_PROPOSAL)))
        .addMethod(
          getVotesByVoterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterRequest,
              com.regen.group.v1alpha1.QueryProto.QueryVotesByVoterResponse>(
                service, METHODID_VOTES_BY_VOTER)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.regen.group.v1alpha1.QueryProto.getDescriptor();
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
              .addMethod(getGroupInfoMethod())
              .addMethod(getGroupAccountInfoMethod())
              .addMethod(getGroupMembersMethod())
              .addMethod(getGroupsByAdminMethod())
              .addMethod(getGroupAccountsByGroupMethod())
              .addMethod(getGroupAccountsByAdminMethod())
              .addMethod(getProposalMethod())
              .addMethod(getProposalsByGroupAccountMethod())
              .addMethod(getVoteByProposalVoterMethod())
              .addMethod(getVotesByProposalMethod())
              .addMethod(getVotesByVoterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
