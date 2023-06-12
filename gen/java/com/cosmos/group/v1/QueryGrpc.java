package com.cosmos.group.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query is the cosmos.group.v1 Query service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: cosmos/group/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmos.group.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupInfoRequest,
      com.cosmos.group.v1.QueryGroupInfoResponse> getGroupInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupInfo",
      requestType = com.cosmos.group.v1.QueryGroupInfoRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupInfoRequest,
      com.cosmos.group.v1.QueryGroupInfoResponse> getGroupInfoMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupInfoRequest, com.cosmos.group.v1.QueryGroupInfoResponse> getGroupInfoMethod;
    if ((getGroupInfoMethod = QueryGrpc.getGroupInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupInfoMethod = QueryGrpc.getGroupInfoMethod) == null) {
          QueryGrpc.getGroupInfoMethod = getGroupInfoMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupInfoRequest, com.cosmos.group.v1.QueryGroupInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupInfo"))
              .build();
        }
      }
    }
    return getGroupInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPolicyInfoRequest,
      com.cosmos.group.v1.QueryGroupPolicyInfoResponse> getGroupPolicyInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupPolicyInfo",
      requestType = com.cosmos.group.v1.QueryGroupPolicyInfoRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupPolicyInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPolicyInfoRequest,
      com.cosmos.group.v1.QueryGroupPolicyInfoResponse> getGroupPolicyInfoMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPolicyInfoRequest, com.cosmos.group.v1.QueryGroupPolicyInfoResponse> getGroupPolicyInfoMethod;
    if ((getGroupPolicyInfoMethod = QueryGrpc.getGroupPolicyInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupPolicyInfoMethod = QueryGrpc.getGroupPolicyInfoMethod) == null) {
          QueryGrpc.getGroupPolicyInfoMethod = getGroupPolicyInfoMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupPolicyInfoRequest, com.cosmos.group.v1.QueryGroupPolicyInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupPolicyInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPolicyInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPolicyInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupPolicyInfo"))
              .build();
        }
      }
    }
    return getGroupPolicyInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupMembersRequest,
      com.cosmos.group.v1.QueryGroupMembersResponse> getGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupMembers",
      requestType = com.cosmos.group.v1.QueryGroupMembersRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupMembersRequest,
      com.cosmos.group.v1.QueryGroupMembersResponse> getGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupMembersRequest, com.cosmos.group.v1.QueryGroupMembersResponse> getGroupMembersMethod;
    if ((getGroupMembersMethod = QueryGrpc.getGroupMembersMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupMembersMethod = QueryGrpc.getGroupMembersMethod) == null) {
          QueryGrpc.getGroupMembersMethod = getGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupMembersRequest, com.cosmos.group.v1.QueryGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupMembers"))
              .build();
        }
      }
    }
    return getGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByAdminRequest,
      com.cosmos.group.v1.QueryGroupsByAdminResponse> getGroupsByAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupsByAdmin",
      requestType = com.cosmos.group.v1.QueryGroupsByAdminRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupsByAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByAdminRequest,
      com.cosmos.group.v1.QueryGroupsByAdminResponse> getGroupsByAdminMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByAdminRequest, com.cosmos.group.v1.QueryGroupsByAdminResponse> getGroupsByAdminMethod;
    if ((getGroupsByAdminMethod = QueryGrpc.getGroupsByAdminMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupsByAdminMethod = QueryGrpc.getGroupsByAdminMethod) == null) {
          QueryGrpc.getGroupsByAdminMethod = getGroupsByAdminMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupsByAdminRequest, com.cosmos.group.v1.QueryGroupsByAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupsByAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsByAdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsByAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupsByAdmin"))
              .build();
        }
      }
    }
    return getGroupsByAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest,
      com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> getGroupPoliciesByGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupPoliciesByGroup",
      requestType = com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest,
      com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> getGroupPoliciesByGroupMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest, com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> getGroupPoliciesByGroupMethod;
    if ((getGroupPoliciesByGroupMethod = QueryGrpc.getGroupPoliciesByGroupMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupPoliciesByGroupMethod = QueryGrpc.getGroupPoliciesByGroupMethod) == null) {
          QueryGrpc.getGroupPoliciesByGroupMethod = getGroupPoliciesByGroupMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest, com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupPoliciesByGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupPoliciesByGroup"))
              .build();
        }
      }
    }
    return getGroupPoliciesByGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest,
      com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> getGroupPoliciesByAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupPoliciesByAdmin",
      requestType = com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest,
      com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> getGroupPoliciesByAdminMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest, com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> getGroupPoliciesByAdminMethod;
    if ((getGroupPoliciesByAdminMethod = QueryGrpc.getGroupPoliciesByAdminMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupPoliciesByAdminMethod = QueryGrpc.getGroupPoliciesByAdminMethod) == null) {
          QueryGrpc.getGroupPoliciesByAdminMethod = getGroupPoliciesByAdminMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest, com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupPoliciesByAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupPoliciesByAdmin"))
              .build();
        }
      }
    }
    return getGroupPoliciesByAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalRequest,
      com.cosmos.group.v1.QueryProposalResponse> getProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Proposal",
      requestType = com.cosmos.group.v1.QueryProposalRequest.class,
      responseType = com.cosmos.group.v1.QueryProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalRequest,
      com.cosmos.group.v1.QueryProposalResponse> getProposalMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalRequest, com.cosmos.group.v1.QueryProposalResponse> getProposalMethod;
    if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalMethod = QueryGrpc.getProposalMethod) == null) {
          QueryGrpc.getProposalMethod = getProposalMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryProposalRequest, com.cosmos.group.v1.QueryProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Proposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Proposal"))
              .build();
        }
      }
    }
    return getProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest,
      com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> getProposalsByGroupPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProposalsByGroupPolicy",
      requestType = com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest.class,
      responseType = com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest,
      com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> getProposalsByGroupPolicyMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest, com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> getProposalsByGroupPolicyMethod;
    if ((getProposalsByGroupPolicyMethod = QueryGrpc.getProposalsByGroupPolicyMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getProposalsByGroupPolicyMethod = QueryGrpc.getProposalsByGroupPolicyMethod) == null) {
          QueryGrpc.getProposalsByGroupPolicyMethod = getProposalsByGroupPolicyMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest, com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProposalsByGroupPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ProposalsByGroupPolicy"))
              .build();
        }
      }
    }
    return getProposalsByGroupPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVoteByProposalVoterRequest,
      com.cosmos.group.v1.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteByProposalVoter",
      requestType = com.cosmos.group.v1.QueryVoteByProposalVoterRequest.class,
      responseType = com.cosmos.group.v1.QueryVoteByProposalVoterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVoteByProposalVoterRequest,
      com.cosmos.group.v1.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVoteByProposalVoterRequest, com.cosmos.group.v1.QueryVoteByProposalVoterResponse> getVoteByProposalVoterMethod;
    if ((getVoteByProposalVoterMethod = QueryGrpc.getVoteByProposalVoterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVoteByProposalVoterMethod = QueryGrpc.getVoteByProposalVoterMethod) == null) {
          QueryGrpc.getVoteByProposalVoterMethod = getVoteByProposalVoterMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryVoteByProposalVoterRequest, com.cosmos.group.v1.QueryVoteByProposalVoterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteByProposalVoter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVoteByProposalVoterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVoteByProposalVoterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VoteByProposalVoter"))
              .build();
        }
      }
    }
    return getVoteByProposalVoterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByProposalRequest,
      com.cosmos.group.v1.QueryVotesByProposalResponse> getVotesByProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotesByProposal",
      requestType = com.cosmos.group.v1.QueryVotesByProposalRequest.class,
      responseType = com.cosmos.group.v1.QueryVotesByProposalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByProposalRequest,
      com.cosmos.group.v1.QueryVotesByProposalResponse> getVotesByProposalMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByProposalRequest, com.cosmos.group.v1.QueryVotesByProposalResponse> getVotesByProposalMethod;
    if ((getVotesByProposalMethod = QueryGrpc.getVotesByProposalMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesByProposalMethod = QueryGrpc.getVotesByProposalMethod) == null) {
          QueryGrpc.getVotesByProposalMethod = getVotesByProposalMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryVotesByProposalRequest, com.cosmos.group.v1.QueryVotesByProposalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotesByProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVotesByProposalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVotesByProposalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotesByProposal"))
              .build();
        }
      }
    }
    return getVotesByProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByVoterRequest,
      com.cosmos.group.v1.QueryVotesByVoterResponse> getVotesByVoterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VotesByVoter",
      requestType = com.cosmos.group.v1.QueryVotesByVoterRequest.class,
      responseType = com.cosmos.group.v1.QueryVotesByVoterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByVoterRequest,
      com.cosmos.group.v1.QueryVotesByVoterResponse> getVotesByVoterMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryVotesByVoterRequest, com.cosmos.group.v1.QueryVotesByVoterResponse> getVotesByVoterMethod;
    if ((getVotesByVoterMethod = QueryGrpc.getVotesByVoterMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getVotesByVoterMethod = QueryGrpc.getVotesByVoterMethod) == null) {
          QueryGrpc.getVotesByVoterMethod = getVotesByVoterMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryVotesByVoterRequest, com.cosmos.group.v1.QueryVotesByVoterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VotesByVoter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVotesByVoterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryVotesByVoterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("VotesByVoter"))
              .build();
        }
      }
    }
    return getVotesByVoterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByMemberRequest,
      com.cosmos.group.v1.QueryGroupsByMemberResponse> getGroupsByMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GroupsByMember",
      requestType = com.cosmos.group.v1.QueryGroupsByMemberRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupsByMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByMemberRequest,
      com.cosmos.group.v1.QueryGroupsByMemberResponse> getGroupsByMemberMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsByMemberRequest, com.cosmos.group.v1.QueryGroupsByMemberResponse> getGroupsByMemberMethod;
    if ((getGroupsByMemberMethod = QueryGrpc.getGroupsByMemberMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupsByMemberMethod = QueryGrpc.getGroupsByMemberMethod) == null) {
          QueryGrpc.getGroupsByMemberMethod = getGroupsByMemberMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupsByMemberRequest, com.cosmos.group.v1.QueryGroupsByMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GroupsByMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsByMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsByMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("GroupsByMember"))
              .build();
        }
      }
    }
    return getGroupsByMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryTallyResultRequest,
      com.cosmos.group.v1.QueryTallyResultResponse> getTallyResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TallyResult",
      requestType = com.cosmos.group.v1.QueryTallyResultRequest.class,
      responseType = com.cosmos.group.v1.QueryTallyResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryTallyResultRequest,
      com.cosmos.group.v1.QueryTallyResultResponse> getTallyResultMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryTallyResultRequest, com.cosmos.group.v1.QueryTallyResultResponse> getTallyResultMethod;
    if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getTallyResultMethod = QueryGrpc.getTallyResultMethod) == null) {
          QueryGrpc.getTallyResultMethod = getTallyResultMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryTallyResultRequest, com.cosmos.group.v1.QueryTallyResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TallyResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryTallyResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryTallyResultResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("TallyResult"))
              .build();
        }
      }
    }
    return getTallyResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsRequest,
      com.cosmos.group.v1.QueryGroupsResponse> getGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Groups",
      requestType = com.cosmos.group.v1.QueryGroupsRequest.class,
      responseType = com.cosmos.group.v1.QueryGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsRequest,
      com.cosmos.group.v1.QueryGroupsResponse> getGroupsMethod() {
    io.grpc.MethodDescriptor<com.cosmos.group.v1.QueryGroupsRequest, com.cosmos.group.v1.QueryGroupsResponse> getGroupsMethod;
    if ((getGroupsMethod = QueryGrpc.getGroupsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getGroupsMethod = QueryGrpc.getGroupsMethod) == null) {
          QueryGrpc.getGroupsMethod = getGroupsMethod =
              io.grpc.MethodDescriptor.<com.cosmos.group.v1.QueryGroupsRequest, com.cosmos.group.v1.QueryGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Groups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cosmos.group.v1.QueryGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Groups"))
              .build();
        }
      }
    }
    return getGroupsMethod;
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
   * Query is the cosmos.group.v1 Query service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GroupInfo queries group info based on group id.
     * </pre>
     */
    default void groupInfo(com.cosmos.group.v1.QueryGroupInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupPolicyInfo queries group policy info based on account address of group policy.
     * </pre>
     */
    default void groupPolicyInfo(com.cosmos.group.v1.QueryGroupPolicyInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPolicyInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupPolicyInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group by group id.
     * </pre>
     */
    default void groupMembers(com.cosmos.group.v1.QueryGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    default void groupsByAdmin(com.cosmos.group.v1.QueryGroupsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupsByAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupPoliciesByGroup queries group policies by group id.
     * </pre>
     */
    default void groupPoliciesByGroup(com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupPoliciesByGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupPoliciesByAdmin queries group policies by admin address.
     * </pre>
     */
    default void groupPoliciesByAdmin(com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupPoliciesByAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    default void proposal(com.cosmos.group.v1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * ProposalsByGroupPolicy queries proposals based on account address of group policy.
     * </pre>
     */
    default void proposalsByGroupPolicy(com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProposalsByGroupPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    default void voteByProposalVoter(com.cosmos.group.v1.QueryVoteByProposalVoterRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVoteByProposalVoterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteByProposalVoterMethod(), responseObserver);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal id.
     * </pre>
     */
    default void votesByProposal(com.cosmos.group.v1.QueryVotesByProposalRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByProposalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesByProposalMethod(), responseObserver);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    default void votesByVoter(com.cosmos.group.v1.QueryVotesByVoterRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByVoterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVotesByVoterMethod(), responseObserver);
    }

    /**
     * <pre>
     * GroupsByMember queries groups by member address.
     * </pre>
     */
    default void groupsByMember(com.cosmos.group.v1.QueryGroupsByMemberRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupsByMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * TallyResult returns the tally result of a proposal. If the proposal is
     * still in voting period, then this query computes the current tally state,
     * which might not be final. On the other hand, if the proposal is final,
     * then it simply returns the `final_tally_result` state stored in the
     * proposal itself.
     * </pre>
     */
    default void tallyResult(com.cosmos.group.v1.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryTallyResultResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTallyResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * Groups queries all groups in state.
     * 
     * Since: cosmos-sdk 0.47.1
     * </pre>
     */
    default void groups(com.cosmos.group.v1.QueryGroupsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query is the cosmos.group.v1 Query service.
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
   * Query is the cosmos.group.v1 Query service.
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
    public void groupInfo(com.cosmos.group.v1.QueryGroupInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupPolicyInfo queries group policy info based on account address of group policy.
     * </pre>
     */
    public void groupPolicyInfo(com.cosmos.group.v1.QueryGroupPolicyInfoRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPolicyInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupPolicyInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group by group id.
     * </pre>
     */
    public void groupMembers(com.cosmos.group.v1.QueryGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public void groupsByAdmin(com.cosmos.group.v1.QueryGroupsByAdminRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupsByAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupPoliciesByGroup queries group policies by group id.
     * </pre>
     */
    public void groupPoliciesByGroup(com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupPoliciesByGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupPoliciesByAdmin queries group policies by admin address.
     * </pre>
     */
    public void groupPoliciesByAdmin(com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupPoliciesByAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public void proposal(com.cosmos.group.v1.QueryProposalRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ProposalsByGroupPolicy queries proposals based on account address of group policy.
     * </pre>
     */
    public void proposalsByGroupPolicy(com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProposalsByGroupPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public void voteByProposalVoter(com.cosmos.group.v1.QueryVoteByProposalVoterRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVoteByProposalVoterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteByProposalVoterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal id.
     * </pre>
     */
    public void votesByProposal(com.cosmos.group.v1.QueryVotesByProposalRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByProposalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesByProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public void votesByVoter(com.cosmos.group.v1.QueryVotesByVoterRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByVoterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVotesByVoterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GroupsByMember queries groups by member address.
     * </pre>
     */
    public void groupsByMember(com.cosmos.group.v1.QueryGroupsByMemberRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupsByMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TallyResult returns the tally result of a proposal. If the proposal is
     * still in voting period, then this query computes the current tally state,
     * which might not be final. On the other hand, if the proposal is final,
     * then it simply returns the `final_tally_result` state stored in the
     * proposal itself.
     * </pre>
     */
    public void tallyResult(com.cosmos.group.v1.QueryTallyResultRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryTallyResultResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Groups queries all groups in state.
     * 
     * Since: cosmos-sdk 0.47.1
     * </pre>
     */
    public void groups(com.cosmos.group.v1.QueryGroupsRequest request,
        io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query is the cosmos.group.v1 Query service.
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
    public com.cosmos.group.v1.QueryGroupInfoResponse groupInfo(com.cosmos.group.v1.QueryGroupInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupPolicyInfo queries group policy info based on account address of group policy.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupPolicyInfoResponse groupPolicyInfo(com.cosmos.group.v1.QueryGroupPolicyInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupPolicyInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group by group id.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupMembersResponse groupMembers(com.cosmos.group.v1.QueryGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupsByAdminResponse groupsByAdmin(com.cosmos.group.v1.QueryGroupsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupsByAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupPoliciesByGroup queries group policies by group id.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse groupPoliciesByGroup(com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupPoliciesByGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupPoliciesByAdmin queries group policies by admin address.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse groupPoliciesByAdmin(com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupPoliciesByAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public com.cosmos.group.v1.QueryProposalResponse proposal(com.cosmos.group.v1.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ProposalsByGroupPolicy queries proposals based on account address of group policy.
     * </pre>
     */
    public com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse proposalsByGroupPolicy(com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProposalsByGroupPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public com.cosmos.group.v1.QueryVoteByProposalVoterResponse voteByProposalVoter(com.cosmos.group.v1.QueryVoteByProposalVoterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteByProposalVoterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal id.
     * </pre>
     */
    public com.cosmos.group.v1.QueryVotesByProposalResponse votesByProposal(com.cosmos.group.v1.QueryVotesByProposalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesByProposalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public com.cosmos.group.v1.QueryVotesByVoterResponse votesByVoter(com.cosmos.group.v1.QueryVotesByVoterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVotesByVoterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GroupsByMember queries groups by member address.
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupsByMemberResponse groupsByMember(com.cosmos.group.v1.QueryGroupsByMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupsByMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TallyResult returns the tally result of a proposal. If the proposal is
     * still in voting period, then this query computes the current tally state,
     * which might not be final. On the other hand, if the proposal is final,
     * then it simply returns the `final_tally_result` state stored in the
     * proposal itself.
     * </pre>
     */
    public com.cosmos.group.v1.QueryTallyResultResponse tallyResult(com.cosmos.group.v1.QueryTallyResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTallyResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Groups queries all groups in state.
     * 
     * Since: cosmos-sdk 0.47.1
     * </pre>
     */
    public com.cosmos.group.v1.QueryGroupsResponse groups(com.cosmos.group.v1.QueryGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query is the cosmos.group.v1 Query service.
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
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupInfoResponse> groupInfo(
        com.cosmos.group.v1.QueryGroupInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupPolicyInfo queries group policy info based on account address of group policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupPolicyInfoResponse> groupPolicyInfo(
        com.cosmos.group.v1.QueryGroupPolicyInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupPolicyInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupMembers queries members of a group by group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupMembersResponse> groupMembers(
        com.cosmos.group.v1.QueryGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupsByAdmin queries groups by admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupsByAdminResponse> groupsByAdmin(
        com.cosmos.group.v1.QueryGroupsByAdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupsByAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupPoliciesByGroup queries group policies by group id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse> groupPoliciesByGroup(
        com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupPoliciesByGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupPoliciesByAdmin queries group policies by admin address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse> groupPoliciesByAdmin(
        com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupPoliciesByAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Proposal queries a proposal based on proposal id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryProposalResponse> proposal(
        com.cosmos.group.v1.QueryProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ProposalsByGroupPolicy queries proposals based on account address of group policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse> proposalsByGroupPolicy(
        com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProposalsByGroupPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VoteByProposalVoter queries a vote by proposal id and voter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryVoteByProposalVoterResponse> voteByProposalVoter(
        com.cosmos.group.v1.QueryVoteByProposalVoterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteByProposalVoterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VotesByProposal queries a vote by proposal id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryVotesByProposalResponse> votesByProposal(
        com.cosmos.group.v1.QueryVotesByProposalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesByProposalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * VotesByVoter queries a vote by voter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryVotesByVoterResponse> votesByVoter(
        com.cosmos.group.v1.QueryVotesByVoterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVotesByVoterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GroupsByMember queries groups by member address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupsByMemberResponse> groupsByMember(
        com.cosmos.group.v1.QueryGroupsByMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupsByMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TallyResult returns the tally result of a proposal. If the proposal is
     * still in voting period, then this query computes the current tally state,
     * which might not be final. On the other hand, if the proposal is final,
     * then it simply returns the `final_tally_result` state stored in the
     * proposal itself.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryTallyResultResponse> tallyResult(
        com.cosmos.group.v1.QueryTallyResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTallyResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Groups queries all groups in state.
     * 
     * Since: cosmos-sdk 0.47.1
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cosmos.group.v1.QueryGroupsResponse> groups(
        com.cosmos.group.v1.QueryGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GROUP_INFO = 0;
  private static final int METHODID_GROUP_POLICY_INFO = 1;
  private static final int METHODID_GROUP_MEMBERS = 2;
  private static final int METHODID_GROUPS_BY_ADMIN = 3;
  private static final int METHODID_GROUP_POLICIES_BY_GROUP = 4;
  private static final int METHODID_GROUP_POLICIES_BY_ADMIN = 5;
  private static final int METHODID_PROPOSAL = 6;
  private static final int METHODID_PROPOSALS_BY_GROUP_POLICY = 7;
  private static final int METHODID_VOTE_BY_PROPOSAL_VOTER = 8;
  private static final int METHODID_VOTES_BY_PROPOSAL = 9;
  private static final int METHODID_VOTES_BY_VOTER = 10;
  private static final int METHODID_GROUPS_BY_MEMBER = 11;
  private static final int METHODID_TALLY_RESULT = 12;
  private static final int METHODID_GROUPS = 13;

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
          serviceImpl.groupInfo((com.cosmos.group.v1.QueryGroupInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupInfoResponse>) responseObserver);
          break;
        case METHODID_GROUP_POLICY_INFO:
          serviceImpl.groupPolicyInfo((com.cosmos.group.v1.QueryGroupPolicyInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPolicyInfoResponse>) responseObserver);
          break;
        case METHODID_GROUP_MEMBERS:
          serviceImpl.groupMembers((com.cosmos.group.v1.QueryGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupMembersResponse>) responseObserver);
          break;
        case METHODID_GROUPS_BY_ADMIN:
          serviceImpl.groupsByAdmin((com.cosmos.group.v1.QueryGroupsByAdminRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByAdminResponse>) responseObserver);
          break;
        case METHODID_GROUP_POLICIES_BY_GROUP:
          serviceImpl.groupPoliciesByGroup((com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse>) responseObserver);
          break;
        case METHODID_GROUP_POLICIES_BY_ADMIN:
          serviceImpl.groupPoliciesByAdmin((com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse>) responseObserver);
          break;
        case METHODID_PROPOSAL:
          serviceImpl.proposal((com.cosmos.group.v1.QueryProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalResponse>) responseObserver);
          break;
        case METHODID_PROPOSALS_BY_GROUP_POLICY:
          serviceImpl.proposalsByGroupPolicy((com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse>) responseObserver);
          break;
        case METHODID_VOTE_BY_PROPOSAL_VOTER:
          serviceImpl.voteByProposalVoter((com.cosmos.group.v1.QueryVoteByProposalVoterRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVoteByProposalVoterResponse>) responseObserver);
          break;
        case METHODID_VOTES_BY_PROPOSAL:
          serviceImpl.votesByProposal((com.cosmos.group.v1.QueryVotesByProposalRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByProposalResponse>) responseObserver);
          break;
        case METHODID_VOTES_BY_VOTER:
          serviceImpl.votesByVoter((com.cosmos.group.v1.QueryVotesByVoterRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryVotesByVoterResponse>) responseObserver);
          break;
        case METHODID_GROUPS_BY_MEMBER:
          serviceImpl.groupsByMember((com.cosmos.group.v1.QueryGroupsByMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsByMemberResponse>) responseObserver);
          break;
        case METHODID_TALLY_RESULT:
          serviceImpl.tallyResult((com.cosmos.group.v1.QueryTallyResultRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryTallyResultResponse>) responseObserver);
          break;
        case METHODID_GROUPS:
          serviceImpl.groups((com.cosmos.group.v1.QueryGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.cosmos.group.v1.QueryGroupsResponse>) responseObserver);
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
              com.cosmos.group.v1.QueryGroupInfoRequest,
              com.cosmos.group.v1.QueryGroupInfoResponse>(
                service, METHODID_GROUP_INFO)))
        .addMethod(
          getGroupPolicyInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupPolicyInfoRequest,
              com.cosmos.group.v1.QueryGroupPolicyInfoResponse>(
                service, METHODID_GROUP_POLICY_INFO)))
        .addMethod(
          getGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupMembersRequest,
              com.cosmos.group.v1.QueryGroupMembersResponse>(
                service, METHODID_GROUP_MEMBERS)))
        .addMethod(
          getGroupsByAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupsByAdminRequest,
              com.cosmos.group.v1.QueryGroupsByAdminResponse>(
                service, METHODID_GROUPS_BY_ADMIN)))
        .addMethod(
          getGroupPoliciesByGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupPoliciesByGroupRequest,
              com.cosmos.group.v1.QueryGroupPoliciesByGroupResponse>(
                service, METHODID_GROUP_POLICIES_BY_GROUP)))
        .addMethod(
          getGroupPoliciesByAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupPoliciesByAdminRequest,
              com.cosmos.group.v1.QueryGroupPoliciesByAdminResponse>(
                service, METHODID_GROUP_POLICIES_BY_ADMIN)))
        .addMethod(
          getProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryProposalRequest,
              com.cosmos.group.v1.QueryProposalResponse>(
                service, METHODID_PROPOSAL)))
        .addMethod(
          getProposalsByGroupPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryProposalsByGroupPolicyRequest,
              com.cosmos.group.v1.QueryProposalsByGroupPolicyResponse>(
                service, METHODID_PROPOSALS_BY_GROUP_POLICY)))
        .addMethod(
          getVoteByProposalVoterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryVoteByProposalVoterRequest,
              com.cosmos.group.v1.QueryVoteByProposalVoterResponse>(
                service, METHODID_VOTE_BY_PROPOSAL_VOTER)))
        .addMethod(
          getVotesByProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryVotesByProposalRequest,
              com.cosmos.group.v1.QueryVotesByProposalResponse>(
                service, METHODID_VOTES_BY_PROPOSAL)))
        .addMethod(
          getVotesByVoterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryVotesByVoterRequest,
              com.cosmos.group.v1.QueryVotesByVoterResponse>(
                service, METHODID_VOTES_BY_VOTER)))
        .addMethod(
          getGroupsByMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupsByMemberRequest,
              com.cosmos.group.v1.QueryGroupsByMemberResponse>(
                service, METHODID_GROUPS_BY_MEMBER)))
        .addMethod(
          getTallyResultMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryTallyResultRequest,
              com.cosmos.group.v1.QueryTallyResultResponse>(
                service, METHODID_TALLY_RESULT)))
        .addMethod(
          getGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cosmos.group.v1.QueryGroupsRequest,
              com.cosmos.group.v1.QueryGroupsResponse>(
                service, METHODID_GROUPS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cosmos.group.v1.QueryProto.getDescriptor();
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
              .addMethod(getGroupPolicyInfoMethod())
              .addMethod(getGroupMembersMethod())
              .addMethod(getGroupsByAdminMethod())
              .addMethod(getGroupPoliciesByGroupMethod())
              .addMethod(getGroupPoliciesByAdminMethod())
              .addMethod(getProposalMethod())
              .addMethod(getProposalsByGroupPolicyMethod())
              .addMethod(getVoteByProposalVoterMethod())
              .addMethod(getVotesByProposalMethod())
              .addMethod(getVotesByVoterMethod())
              .addMethod(getGroupsByMemberMethod())
              .addMethod(getTallyResultMethod())
              .addMethod(getGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
