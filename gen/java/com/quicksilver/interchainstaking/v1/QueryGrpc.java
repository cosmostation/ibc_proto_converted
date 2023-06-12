package com.quicksilver.interchainstaking.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: quicksilver/interchainstaking/v1/query.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "quicksilver.interchainstaking.v1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZonesRequest,
      com.quicksilver.interchainstaking.v1.QueryZonesResponse> getZonesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Zones",
      requestType = com.quicksilver.interchainstaking.v1.QueryZonesRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryZonesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZonesRequest,
      com.quicksilver.interchainstaking.v1.QueryZonesResponse> getZonesMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZonesRequest, com.quicksilver.interchainstaking.v1.QueryZonesResponse> getZonesMethod;
    if ((getZonesMethod = QueryGrpc.getZonesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZonesMethod = QueryGrpc.getZonesMethod) == null) {
          QueryGrpc.getZonesMethod = getZonesMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryZonesRequest, com.quicksilver.interchainstaking.v1.QueryZonesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Zones"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZonesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZonesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Zones"))
              .build();
        }
      }
    }
    return getZonesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneRequest,
      com.quicksilver.interchainstaking.v1.QueryZoneResponse> getZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Zone",
      requestType = com.quicksilver.interchainstaking.v1.QueryZoneRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryZoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneRequest,
      com.quicksilver.interchainstaking.v1.QueryZoneResponse> getZoneMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneRequest, com.quicksilver.interchainstaking.v1.QueryZoneResponse> getZoneMethod;
    if ((getZoneMethod = QueryGrpc.getZoneMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneMethod = QueryGrpc.getZoneMethod) == null) {
          QueryGrpc.getZoneMethod = getZoneMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryZoneRequest, com.quicksilver.interchainstaking.v1.QueryZoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Zone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Zone"))
              .build();
        }
      }
    }
    return getZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest,
      com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> getZoneValidatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneValidators",
      requestType = com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest,
      com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> getZoneValidatorsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest, com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> getZoneValidatorsMethod;
    if ((getZoneValidatorsMethod = QueryGrpc.getZoneValidatorsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneValidatorsMethod = QueryGrpc.getZoneValidatorsMethod) == null) {
          QueryGrpc.getZoneValidatorsMethod = getZoneValidatorsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest, com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneValidators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneValidators"))
              .build();
        }
      }
    }
    return getZoneValidatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest,
      com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> getDepositAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositAccount",
      requestType = com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest,
      com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> getDepositAccountMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest, com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> getDepositAccountMethod;
    if ((getDepositAccountMethod = QueryGrpc.getDepositAccountMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDepositAccountMethod = QueryGrpc.getDepositAccountMethod) == null) {
          QueryGrpc.getDepositAccountMethod = getDepositAccountMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest, com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DepositAccount"))
              .build();
        }
      }
    }
    return getDepositAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest,
      com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> getDelegatorIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DelegatorIntent",
      requestType = com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest,
      com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> getDelegatorIntentMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest, com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> getDelegatorIntentMethod;
    if ((getDelegatorIntentMethod = QueryGrpc.getDelegatorIntentMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegatorIntentMethod = QueryGrpc.getDelegatorIntentMethod) == null) {
          QueryGrpc.getDelegatorIntentMethod = getDelegatorIntentMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest, com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DelegatorIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("DelegatorIntent"))
              .build();
        }
      }
    }
    return getDelegatorIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegationsRequest,
      com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> getDelegationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delegations",
      requestType = com.quicksilver.interchainstaking.v1.QueryDelegationsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryDelegationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegationsRequest,
      com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> getDelegationsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryDelegationsRequest, com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> getDelegationsMethod;
    if ((getDelegationsMethod = QueryGrpc.getDelegationsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDelegationsMethod = QueryGrpc.getDelegationsMethod) == null) {
          QueryGrpc.getDelegationsMethod = getDelegationsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryDelegationsRequest, com.quicksilver.interchainstaking.v1.QueryDelegationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delegations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDelegationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryDelegationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Delegations"))
              .build();
        }
      }
    }
    return getDelegationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryReceiptsRequest,
      com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> getReceiptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Receipts",
      requestType = com.quicksilver.interchainstaking.v1.QueryReceiptsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryReceiptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryReceiptsRequest,
      com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> getReceiptsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryReceiptsRequest, com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> getReceiptsMethod;
    if ((getReceiptsMethod = QueryGrpc.getReceiptsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getReceiptsMethod = QueryGrpc.getReceiptsMethod) == null) {
          QueryGrpc.getReceiptsMethod = getReceiptsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryReceiptsRequest, com.quicksilver.interchainstaking.v1.QueryReceiptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Receipts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryReceiptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryReceiptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Receipts"))
              .build();
        }
      }
    }
    return getReceiptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoneWithdrawalRecords",
      requestType = com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getZoneWithdrawalRecordsMethod;
    if ((getZoneWithdrawalRecordsMethod = QueryGrpc.getZoneWithdrawalRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getZoneWithdrawalRecordsMethod = QueryGrpc.getZoneWithdrawalRecordsMethod) == null) {
          QueryGrpc.getZoneWithdrawalRecordsMethod = getZoneWithdrawalRecordsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoneWithdrawalRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ZoneWithdrawalRecords"))
              .build();
        }
      }
    }
    return getZoneWithdrawalRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawalRecords",
      requestType = com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> getWithdrawalRecordsMethod;
    if ((getWithdrawalRecordsMethod = QueryGrpc.getWithdrawalRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawalRecordsMethod = QueryGrpc.getWithdrawalRecordsMethod) == null) {
          QueryGrpc.getWithdrawalRecordsMethod = getWithdrawalRecordsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest, com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawalRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawalRecords"))
              .build();
        }
      }
    }
    return getWithdrawalRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbondingRecords",
      requestType = com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest, com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> getUnbondingRecordsMethod;
    if ((getUnbondingRecordsMethod = QueryGrpc.getUnbondingRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getUnbondingRecordsMethod = QueryGrpc.getUnbondingRecordsMethod) == null) {
          QueryGrpc.getUnbondingRecordsMethod = getUnbondingRecordsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest, com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbondingRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("UnbondingRecords"))
              .build();
        }
      }
    }
    return getUnbondingRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RedelegationRecords",
      requestType = com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest,
      com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest, com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> getRedelegationRecordsMethod;
    if ((getRedelegationRecordsMethod = QueryGrpc.getRedelegationRecordsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRedelegationRecordsMethod = QueryGrpc.getRedelegationRecordsMethod) == null) {
          QueryGrpc.getRedelegationRecordsMethod = getRedelegationRecordsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest, com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RedelegationRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RedelegationRecords"))
              .build();
        }
      }
    }
    return getRedelegationRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest,
      com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> getMappedAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MappedAccounts",
      requestType = com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest.class,
      responseType = com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest,
      com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> getMappedAccountsMethod() {
    io.grpc.MethodDescriptor<com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest, com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> getMappedAccountsMethod;
    if ((getMappedAccountsMethod = QueryGrpc.getMappedAccountsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getMappedAccountsMethod = QueryGrpc.getMappedAccountsMethod) == null) {
          QueryGrpc.getMappedAccountsMethod = getMappedAccountsMethod =
              io.grpc.MethodDescriptor.<com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest, com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MappedAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("MappedAccounts"))
              .build();
        }
      }
    }
    return getMappedAccountsMethod;
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
   * Query defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Zones provides meta data on connected zones.
     * </pre>
     */
    default void zones(com.quicksilver.interchainstaking.v1.QueryZonesRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZonesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZonesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Zone provides meta data on a specific zone.
     * </pre>
     */
    default void zone(com.quicksilver.interchainstaking.v1.QueryZoneRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoneMethod(), responseObserver);
    }

    /**
     */
    default void zoneValidators(com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoneValidatorsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    default void depositAccount(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    default void delegatorIntent(com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegatorIntentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    default void delegations(com.quicksilver.interchainstaking.v1.QueryDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelegationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    default void receipts(com.quicksilver.interchainstaking.v1.QueryReceiptsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    default void zoneWithdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoneWithdrawalRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    default void withdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawalRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    default void unbondingRecords(com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbondingRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    default void redelegationRecords(com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRedelegationRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     * MappedAccounts provides data on the mapped accounts for a given user over different host chains.
     * </pre>
     */
    default void mappedAccounts(com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMappedAccountsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
   * Query defines the gRPC querier service.
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
     * Zones provides meta data on connected zones.
     * </pre>
     */
    public void zones(com.quicksilver.interchainstaking.v1.QueryZonesRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZonesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZonesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Zone provides meta data on a specific zone.
     * </pre>
     */
    public void zone(com.quicksilver.interchainstaking.v1.QueryZoneRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void zoneValidators(com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoneValidatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public void depositAccount(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public void delegatorIntent(com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegatorIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void delegations(com.quicksilver.interchainstaking.v1.QueryDelegationsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelegationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public void receipts(com.quicksilver.interchainstaking.v1.QueryReceiptsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void zoneWithdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoneWithdrawalRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public void withdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawalRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public void unbondingRecords(com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbondingRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public void redelegationRecords(com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRedelegationRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MappedAccounts provides data on the mapped accounts for a given user over different host chains.
     * </pre>
     */
    public void mappedAccounts(com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest request,
        io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMappedAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Zones provides meta data on connected zones.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryZonesResponse zones(com.quicksilver.interchainstaking.v1.QueryZonesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZonesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Zone provides meta data on a specific zone.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryZoneResponse zone(com.quicksilver.interchainstaking.v1.QueryZoneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse zoneValidators(com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoneValidatorsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse depositAccount(com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse delegatorIntent(com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegatorIntentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryDelegationsResponse delegations(com.quicksilver.interchainstaking.v1.QueryDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelegationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryReceiptsResponse receipts(com.quicksilver.interchainstaking.v1.QueryReceiptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse zoneWithdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoneWithdrawalRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse withdrawalRecords(com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawalRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse unbondingRecords(com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbondingRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse redelegationRecords(com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRedelegationRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MappedAccounts provides data on the mapped accounts for a given user over different host chains.
     * </pre>
     */
    public com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse mappedAccounts(com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMappedAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Query.
   * <pre>
   * Query defines the gRPC querier service.
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
     * Zones provides meta data on connected zones.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryZonesResponse> zones(
        com.quicksilver.interchainstaking.v1.QueryZonesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZonesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Zone provides meta data on a specific zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryZoneResponse> zone(
        com.quicksilver.interchainstaking.v1.QueryZoneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse> zoneValidators(
        com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoneValidatorsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositAccount provides data on the deposit address for a connected zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse> depositAccount(
        com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DelegatorIntent provides data on the intent of the delegator for the given
     * zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse> delegatorIntent(
        com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegatorIntentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryDelegationsResponse> delegations(
        com.quicksilver.interchainstaking.v1.QueryDelegationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelegationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delegations provides data on the delegations for the given zone.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryReceiptsResponse> receipts(
        com.quicksilver.interchainstaking.v1.QueryReceiptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> zoneWithdrawalRecords(
        com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoneWithdrawalRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawalRecords provides data on the active withdrawals.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse> withdrawalRecords(
        com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawalRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnbondingRecords provides data on the active unbondings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse> unbondingRecords(
        com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbondingRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RedelegationRecords provides data on the active unbondings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse> redelegationRecords(
        com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRedelegationRecordsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MappedAccounts provides data on the mapped accounts for a given user over different host chains.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse> mappedAccounts(
        com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMappedAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ZONES = 0;
  private static final int METHODID_ZONE = 1;
  private static final int METHODID_ZONE_VALIDATORS = 2;
  private static final int METHODID_DEPOSIT_ACCOUNT = 3;
  private static final int METHODID_DELEGATOR_INTENT = 4;
  private static final int METHODID_DELEGATIONS = 5;
  private static final int METHODID_RECEIPTS = 6;
  private static final int METHODID_ZONE_WITHDRAWAL_RECORDS = 7;
  private static final int METHODID_WITHDRAWAL_RECORDS = 8;
  private static final int METHODID_UNBONDING_RECORDS = 9;
  private static final int METHODID_REDELEGATION_RECORDS = 10;
  private static final int METHODID_MAPPED_ACCOUNTS = 11;

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
        case METHODID_ZONES:
          serviceImpl.zones((com.quicksilver.interchainstaking.v1.QueryZonesRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZonesResponse>) responseObserver);
          break;
        case METHODID_ZONE:
          serviceImpl.zone((com.quicksilver.interchainstaking.v1.QueryZoneRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneResponse>) responseObserver);
          break;
        case METHODID_ZONE_VALIDATORS:
          serviceImpl.zoneValidators((com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_ACCOUNT:
          serviceImpl.depositAccount((com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse>) responseObserver);
          break;
        case METHODID_DELEGATOR_INTENT:
          serviceImpl.delegatorIntent((com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse>) responseObserver);
          break;
        case METHODID_DELEGATIONS:
          serviceImpl.delegations((com.quicksilver.interchainstaking.v1.QueryDelegationsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryDelegationsResponse>) responseObserver);
          break;
        case METHODID_RECEIPTS:
          serviceImpl.receipts((com.quicksilver.interchainstaking.v1.QueryReceiptsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryReceiptsResponse>) responseObserver);
          break;
        case METHODID_ZONE_WITHDRAWAL_RECORDS:
          serviceImpl.zoneWithdrawalRecords((com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAWAL_RECORDS:
          serviceImpl.withdrawalRecords((com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>) responseObserver);
          break;
        case METHODID_UNBONDING_RECORDS:
          serviceImpl.unbondingRecords((com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse>) responseObserver);
          break;
        case METHODID_REDELEGATION_RECORDS:
          serviceImpl.redelegationRecords((com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse>) responseObserver);
          break;
        case METHODID_MAPPED_ACCOUNTS:
          serviceImpl.mappedAccounts((com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse>) responseObserver);
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
          getZonesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryZonesRequest,
              com.quicksilver.interchainstaking.v1.QueryZonesResponse>(
                service, METHODID_ZONES)))
        .addMethod(
          getZoneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryZoneRequest,
              com.quicksilver.interchainstaking.v1.QueryZoneResponse>(
                service, METHODID_ZONE)))
        .addMethod(
          getZoneValidatorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest,
              com.quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse>(
                service, METHODID_ZONE_VALIDATORS)))
        .addMethod(
          getDepositAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest,
              com.quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse>(
                service, METHODID_DEPOSIT_ACCOUNT)))
        .addMethod(
          getDelegatorIntentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest,
              com.quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse>(
                service, METHODID_DELEGATOR_INTENT)))
        .addMethod(
          getDelegationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryDelegationsRequest,
              com.quicksilver.interchainstaking.v1.QueryDelegationsResponse>(
                service, METHODID_DELEGATIONS)))
        .addMethod(
          getReceiptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryReceiptsRequest,
              com.quicksilver.interchainstaking.v1.QueryReceiptsResponse>(
                service, METHODID_RECEIPTS)))
        .addMethod(
          getZoneWithdrawalRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
              com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>(
                service, METHODID_ZONE_WITHDRAWAL_RECORDS)))
        .addMethod(
          getWithdrawalRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest,
              com.quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse>(
                service, METHODID_WITHDRAWAL_RECORDS)))
        .addMethod(
          getUnbondingRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest,
              com.quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse>(
                service, METHODID_UNBONDING_RECORDS)))
        .addMethod(
          getRedelegationRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest,
              com.quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse>(
                service, METHODID_REDELEGATION_RECORDS)))
        .addMethod(
          getMappedAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.quicksilver.interchainstaking.v1.QueryMappedAccountsRequest,
              com.quicksilver.interchainstaking.v1.QueryMappedAccountsResponse>(
                service, METHODID_MAPPED_ACCOUNTS)))
        .build();
  }

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.quicksilver.interchainstaking.v1.QueryProto.getDescriptor();
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
              .addMethod(getZonesMethod())
              .addMethod(getZoneMethod())
              .addMethod(getZoneValidatorsMethod())
              .addMethod(getDepositAccountMethod())
              .addMethod(getDelegatorIntentMethod())
              .addMethod(getDelegationsMethod())
              .addMethod(getReceiptsMethod())
              .addMethod(getZoneWithdrawalRecordsMethod())
              .addMethod(getWithdrawalRecordsMethod())
              .addMethod(getUnbondingRecordsMethod())
              .addMethod(getRedelegationRecordsMethod())
              .addMethod(getMappedAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
