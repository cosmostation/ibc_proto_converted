package com.axelar.evm.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * QueryService defines the gRPC querier service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: axelar/evm/v1beta1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueryServiceGrpc {

  private QueryServiceGrpc() {}

  public static final String SERVICE_NAME = "axelar.evm.v1beta1.QueryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BatchedCommandsRequest,
      com.axelar.evm.v1beta1.BatchedCommandsResponse> getBatchedCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchedCommands",
      requestType = com.axelar.evm.v1beta1.BatchedCommandsRequest.class,
      responseType = com.axelar.evm.v1beta1.BatchedCommandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BatchedCommandsRequest,
      com.axelar.evm.v1beta1.BatchedCommandsResponse> getBatchedCommandsMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BatchedCommandsRequest, com.axelar.evm.v1beta1.BatchedCommandsResponse> getBatchedCommandsMethod;
    if ((getBatchedCommandsMethod = QueryServiceGrpc.getBatchedCommandsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getBatchedCommandsMethod = QueryServiceGrpc.getBatchedCommandsMethod) == null) {
          QueryServiceGrpc.getBatchedCommandsMethod = getBatchedCommandsMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.BatchedCommandsRequest, com.axelar.evm.v1beta1.BatchedCommandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchedCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BatchedCommandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BatchedCommandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("BatchedCommands"))
              .build();
        }
      }
    }
    return getBatchedCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BurnerInfoRequest,
      com.axelar.evm.v1beta1.BurnerInfoResponse> getBurnerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnerInfo",
      requestType = com.axelar.evm.v1beta1.BurnerInfoRequest.class,
      responseType = com.axelar.evm.v1beta1.BurnerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BurnerInfoRequest,
      com.axelar.evm.v1beta1.BurnerInfoResponse> getBurnerInfoMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BurnerInfoRequest, com.axelar.evm.v1beta1.BurnerInfoResponse> getBurnerInfoMethod;
    if ((getBurnerInfoMethod = QueryServiceGrpc.getBurnerInfoMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getBurnerInfoMethod = QueryServiceGrpc.getBurnerInfoMethod) == null) {
          QueryServiceGrpc.getBurnerInfoMethod = getBurnerInfoMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.BurnerInfoRequest, com.axelar.evm.v1beta1.BurnerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BurnerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BurnerInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("BurnerInfo"))
              .build();
        }
      }
    }
    return getBurnerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ConfirmationHeightRequest,
      com.axelar.evm.v1beta1.ConfirmationHeightResponse> getConfirmationHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmationHeight",
      requestType = com.axelar.evm.v1beta1.ConfirmationHeightRequest.class,
      responseType = com.axelar.evm.v1beta1.ConfirmationHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ConfirmationHeightRequest,
      com.axelar.evm.v1beta1.ConfirmationHeightResponse> getConfirmationHeightMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ConfirmationHeightRequest, com.axelar.evm.v1beta1.ConfirmationHeightResponse> getConfirmationHeightMethod;
    if ((getConfirmationHeightMethod = QueryServiceGrpc.getConfirmationHeightMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getConfirmationHeightMethod = QueryServiceGrpc.getConfirmationHeightMethod) == null) {
          QueryServiceGrpc.getConfirmationHeightMethod = getConfirmationHeightMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.ConfirmationHeightRequest, com.axelar.evm.v1beta1.ConfirmationHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmationHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ConfirmationHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ConfirmationHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("ConfirmationHeight"))
              .build();
        }
      }
    }
    return getConfirmationHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.DepositStateRequest,
      com.axelar.evm.v1beta1.DepositStateResponse> getDepositStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DepositState",
      requestType = com.axelar.evm.v1beta1.DepositStateRequest.class,
      responseType = com.axelar.evm.v1beta1.DepositStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.DepositStateRequest,
      com.axelar.evm.v1beta1.DepositStateResponse> getDepositStateMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.DepositStateRequest, com.axelar.evm.v1beta1.DepositStateResponse> getDepositStateMethod;
    if ((getDepositStateMethod = QueryServiceGrpc.getDepositStateMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getDepositStateMethod = QueryServiceGrpc.getDepositStateMethod) == null) {
          QueryServiceGrpc.getDepositStateMethod = getDepositStateMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.DepositStateRequest, com.axelar.evm.v1beta1.DepositStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DepositState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.DepositStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.DepositStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("DepositState"))
              .build();
        }
      }
    }
    return getDepositStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.PendingCommandsRequest,
      com.axelar.evm.v1beta1.PendingCommandsResponse> getPendingCommandsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PendingCommands",
      requestType = com.axelar.evm.v1beta1.PendingCommandsRequest.class,
      responseType = com.axelar.evm.v1beta1.PendingCommandsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.PendingCommandsRequest,
      com.axelar.evm.v1beta1.PendingCommandsResponse> getPendingCommandsMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.PendingCommandsRequest, com.axelar.evm.v1beta1.PendingCommandsResponse> getPendingCommandsMethod;
    if ((getPendingCommandsMethod = QueryServiceGrpc.getPendingCommandsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getPendingCommandsMethod = QueryServiceGrpc.getPendingCommandsMethod) == null) {
          QueryServiceGrpc.getPendingCommandsMethod = getPendingCommandsMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.PendingCommandsRequest, com.axelar.evm.v1beta1.PendingCommandsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PendingCommands"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.PendingCommandsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.PendingCommandsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("PendingCommands"))
              .build();
        }
      }
    }
    return getPendingCommandsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ChainsRequest,
      com.axelar.evm.v1beta1.ChainsResponse> getChainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chains",
      requestType = com.axelar.evm.v1beta1.ChainsRequest.class,
      responseType = com.axelar.evm.v1beta1.ChainsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ChainsRequest,
      com.axelar.evm.v1beta1.ChainsResponse> getChainsMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ChainsRequest, com.axelar.evm.v1beta1.ChainsResponse> getChainsMethod;
    if ((getChainsMethod = QueryServiceGrpc.getChainsMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getChainsMethod = QueryServiceGrpc.getChainsMethod) == null) {
          QueryServiceGrpc.getChainsMethod = getChainsMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.ChainsRequest, com.axelar.evm.v1beta1.ChainsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Chains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ChainsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ChainsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Chains"))
              .build();
        }
      }
    }
    return getChainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.CommandRequest,
      com.axelar.evm.v1beta1.CommandResponse> getCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Command",
      requestType = com.axelar.evm.v1beta1.CommandRequest.class,
      responseType = com.axelar.evm.v1beta1.CommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.CommandRequest,
      com.axelar.evm.v1beta1.CommandResponse> getCommandMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.CommandRequest, com.axelar.evm.v1beta1.CommandResponse> getCommandMethod;
    if ((getCommandMethod = QueryServiceGrpc.getCommandMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getCommandMethod = QueryServiceGrpc.getCommandMethod) == null) {
          QueryServiceGrpc.getCommandMethod = getCommandMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.CommandRequest, com.axelar.evm.v1beta1.CommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Command"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.CommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Command"))
              .build();
        }
      }
    }
    return getCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.KeyAddressRequest,
      com.axelar.evm.v1beta1.KeyAddressResponse> getKeyAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KeyAddress",
      requestType = com.axelar.evm.v1beta1.KeyAddressRequest.class,
      responseType = com.axelar.evm.v1beta1.KeyAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.KeyAddressRequest,
      com.axelar.evm.v1beta1.KeyAddressResponse> getKeyAddressMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.KeyAddressRequest, com.axelar.evm.v1beta1.KeyAddressResponse> getKeyAddressMethod;
    if ((getKeyAddressMethod = QueryServiceGrpc.getKeyAddressMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getKeyAddressMethod = QueryServiceGrpc.getKeyAddressMethod) == null) {
          QueryServiceGrpc.getKeyAddressMethod = getKeyAddressMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.KeyAddressRequest, com.axelar.evm.v1beta1.KeyAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KeyAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.KeyAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.KeyAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("KeyAddress"))
              .build();
        }
      }
    }
    return getKeyAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.GatewayAddressRequest,
      com.axelar.evm.v1beta1.GatewayAddressResponse> getGatewayAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GatewayAddress",
      requestType = com.axelar.evm.v1beta1.GatewayAddressRequest.class,
      responseType = com.axelar.evm.v1beta1.GatewayAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.GatewayAddressRequest,
      com.axelar.evm.v1beta1.GatewayAddressResponse> getGatewayAddressMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.GatewayAddressRequest, com.axelar.evm.v1beta1.GatewayAddressResponse> getGatewayAddressMethod;
    if ((getGatewayAddressMethod = QueryServiceGrpc.getGatewayAddressMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getGatewayAddressMethod = QueryServiceGrpc.getGatewayAddressMethod) == null) {
          QueryServiceGrpc.getGatewayAddressMethod = getGatewayAddressMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.GatewayAddressRequest, com.axelar.evm.v1beta1.GatewayAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GatewayAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.GatewayAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.GatewayAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("GatewayAddress"))
              .build();
        }
      }
    }
    return getGatewayAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BytecodeRequest,
      com.axelar.evm.v1beta1.BytecodeResponse> getBytecodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bytecode",
      requestType = com.axelar.evm.v1beta1.BytecodeRequest.class,
      responseType = com.axelar.evm.v1beta1.BytecodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BytecodeRequest,
      com.axelar.evm.v1beta1.BytecodeResponse> getBytecodeMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.BytecodeRequest, com.axelar.evm.v1beta1.BytecodeResponse> getBytecodeMethod;
    if ((getBytecodeMethod = QueryServiceGrpc.getBytecodeMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getBytecodeMethod = QueryServiceGrpc.getBytecodeMethod) == null) {
          QueryServiceGrpc.getBytecodeMethod = getBytecodeMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.BytecodeRequest, com.axelar.evm.v1beta1.BytecodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bytecode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BytecodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.BytecodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Bytecode"))
              .build();
        }
      }
    }
    return getBytecodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.EventRequest,
      com.axelar.evm.v1beta1.EventResponse> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = com.axelar.evm.v1beta1.EventRequest.class,
      responseType = com.axelar.evm.v1beta1.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.EventRequest,
      com.axelar.evm.v1beta1.EventResponse> getEventMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.EventRequest, com.axelar.evm.v1beta1.EventResponse> getEventMethod;
    if ((getEventMethod = QueryServiceGrpc.getEventMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getEventMethod = QueryServiceGrpc.getEventMethod) == null) {
          QueryServiceGrpc.getEventMethod = getEventMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.EventRequest, com.axelar.evm.v1beta1.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("Event"))
              .build();
        }
      }
    }
    return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ERC20TokensRequest,
      com.axelar.evm.v1beta1.ERC20TokensResponse> getERC20TokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ERC20Tokens",
      requestType = com.axelar.evm.v1beta1.ERC20TokensRequest.class,
      responseType = com.axelar.evm.v1beta1.ERC20TokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ERC20TokensRequest,
      com.axelar.evm.v1beta1.ERC20TokensResponse> getERC20TokensMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.ERC20TokensRequest, com.axelar.evm.v1beta1.ERC20TokensResponse> getERC20TokensMethod;
    if ((getERC20TokensMethod = QueryServiceGrpc.getERC20TokensMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getERC20TokensMethod = QueryServiceGrpc.getERC20TokensMethod) == null) {
          QueryServiceGrpc.getERC20TokensMethod = getERC20TokensMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.ERC20TokensRequest, com.axelar.evm.v1beta1.ERC20TokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ERC20Tokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ERC20TokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.ERC20TokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("ERC20Tokens"))
              .build();
        }
      }
    }
    return getERC20TokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TokenInfoRequest,
      com.axelar.evm.v1beta1.TokenInfoResponse> getTokenInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TokenInfo",
      requestType = com.axelar.evm.v1beta1.TokenInfoRequest.class,
      responseType = com.axelar.evm.v1beta1.TokenInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TokenInfoRequest,
      com.axelar.evm.v1beta1.TokenInfoResponse> getTokenInfoMethod() {
    io.grpc.MethodDescriptor<com.axelar.evm.v1beta1.TokenInfoRequest, com.axelar.evm.v1beta1.TokenInfoResponse> getTokenInfoMethod;
    if ((getTokenInfoMethod = QueryServiceGrpc.getTokenInfoMethod) == null) {
      synchronized (QueryServiceGrpc.class) {
        if ((getTokenInfoMethod = QueryServiceGrpc.getTokenInfoMethod) == null) {
          QueryServiceGrpc.getTokenInfoMethod = getTokenInfoMethod =
              io.grpc.MethodDescriptor.<com.axelar.evm.v1beta1.TokenInfoRequest, com.axelar.evm.v1beta1.TokenInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TokenInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TokenInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axelar.evm.v1beta1.TokenInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryServiceMethodDescriptorSupplier("TokenInfo"))
              .build();
        }
      }
    }
    return getTokenInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceStub>() {
        @java.lang.Override
        public QueryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceStub(channel, callOptions);
        }
      };
    return QueryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceBlockingStub>() {
        @java.lang.Override
        public QueryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceBlockingStub(channel, callOptions);
        }
      };
    return QueryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryServiceFutureStub>() {
        @java.lang.Override
        public QueryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryServiceFutureStub(channel, callOptions);
        }
      };
    return QueryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * BatchedCommands queries the batched commands for a specified chain and
     * BatchedCommandsID if no BatchedCommandsID is specified, then it returns the
     * latest batched commands
     * </pre>
     */
    default void batchedCommands(com.axelar.evm.v1beta1.BatchedCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BatchedCommandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchedCommandsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BurnerInfo queries the burner info for the specified address
     * </pre>
     */
    default void burnerInfo(com.axelar.evm.v1beta1.BurnerInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BurnerInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ConfirmationHeight queries the confirmation height for the specified chain
     * </pre>
     */
    default void confirmationHeight(com.axelar.evm.v1beta1.ConfirmationHeightRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ConfirmationHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmationHeightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DepositState queries the state of the specified deposit
     * </pre>
     */
    @java.lang.Deprecated
    default void depositState(com.axelar.evm.v1beta1.DepositStateRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.DepositStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * PendingCommands queries the pending commands for the specified chain
     * </pre>
     */
    default void pendingCommands(com.axelar.evm.v1beta1.PendingCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.PendingCommandsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPendingCommandsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Chains queries the available evm chains
     * </pre>
     */
    default void chains(com.axelar.evm.v1beta1.ChainsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ChainsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Command queries the command of a chain provided the command id
     * </pre>
     */
    default void command(com.axelar.evm.v1beta1.CommandRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.CommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * KeyAddress queries the address of key of a chain
     * </pre>
     */
    default void keyAddress(com.axelar.evm.v1beta1.KeyAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.KeyAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKeyAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * GatewayAddress queries the address of axelar gateway at the specified
     * chain
     * </pre>
     */
    default void gatewayAddress(com.axelar.evm.v1beta1.GatewayAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.GatewayAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGatewayAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bytecode queries the bytecode of a specified gateway at the specified
     * chain
     * </pre>
     */
    default void bytecode(com.axelar.evm.v1beta1.BytecodeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BytecodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBytecodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Event queries an event at the specified chain
     * </pre>
     */
    default void event(com.axelar.evm.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.EventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * ERC20Tokens queries the ERC20 tokens registered for a chain
     * </pre>
     */
    default void eRC20Tokens(com.axelar.evm.v1beta1.ERC20TokensRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ERC20TokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getERC20TokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * TokenInfo queries the token info for a registered ERC20 Token
     * </pre>
     */
    default void tokenInfo(com.axelar.evm.v1beta1.TokenInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TokenInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTokenInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static abstract class QueryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueryServiceStub> {
    private QueryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * BatchedCommands queries the batched commands for a specified chain and
     * BatchedCommandsID if no BatchedCommandsID is specified, then it returns the
     * latest batched commands
     * </pre>
     */
    public void batchedCommands(com.axelar.evm.v1beta1.BatchedCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BatchedCommandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchedCommandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BurnerInfo queries the burner info for the specified address
     * </pre>
     */
    public void burnerInfo(com.axelar.evm.v1beta1.BurnerInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BurnerInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ConfirmationHeight queries the confirmation height for the specified chain
     * </pre>
     */
    public void confirmationHeight(com.axelar.evm.v1beta1.ConfirmationHeightRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ConfirmationHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmationHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DepositState queries the state of the specified deposit
     * </pre>
     */
    @java.lang.Deprecated
    public void depositState(com.axelar.evm.v1beta1.DepositStateRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.DepositStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PendingCommands queries the pending commands for the specified chain
     * </pre>
     */
    public void pendingCommands(com.axelar.evm.v1beta1.PendingCommandsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.PendingCommandsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPendingCommandsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Chains queries the available evm chains
     * </pre>
     */
    public void chains(com.axelar.evm.v1beta1.ChainsRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ChainsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Command queries the command of a chain provided the command id
     * </pre>
     */
    public void command(com.axelar.evm.v1beta1.CommandRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.CommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KeyAddress queries the address of key of a chain
     * </pre>
     */
    public void keyAddress(com.axelar.evm.v1beta1.KeyAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.KeyAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKeyAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GatewayAddress queries the address of axelar gateway at the specified
     * chain
     * </pre>
     */
    public void gatewayAddress(com.axelar.evm.v1beta1.GatewayAddressRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.GatewayAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGatewayAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bytecode queries the bytecode of a specified gateway at the specified
     * chain
     * </pre>
     */
    public void bytecode(com.axelar.evm.v1beta1.BytecodeRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BytecodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBytecodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Event queries an event at the specified chain
     * </pre>
     */
    public void event(com.axelar.evm.v1beta1.EventRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.EventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ERC20Tokens queries the ERC20 tokens registered for a chain
     * </pre>
     */
    public void eRC20Tokens(com.axelar.evm.v1beta1.ERC20TokensRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ERC20TokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getERC20TokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TokenInfo queries the token info for a registered ERC20 Token
     * </pre>
     */
    public void tokenInfo(com.axelar.evm.v1beta1.TokenInfoRequest request,
        io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TokenInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTokenInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueryServiceBlockingStub> {
    private QueryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * BatchedCommands queries the batched commands for a specified chain and
     * BatchedCommandsID if no BatchedCommandsID is specified, then it returns the
     * latest batched commands
     * </pre>
     */
    public com.axelar.evm.v1beta1.BatchedCommandsResponse batchedCommands(com.axelar.evm.v1beta1.BatchedCommandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchedCommandsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BurnerInfo queries the burner info for the specified address
     * </pre>
     */
    public com.axelar.evm.v1beta1.BurnerInfoResponse burnerInfo(com.axelar.evm.v1beta1.BurnerInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ConfirmationHeight queries the confirmation height for the specified chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.ConfirmationHeightResponse confirmationHeight(com.axelar.evm.v1beta1.ConfirmationHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmationHeightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DepositState queries the state of the specified deposit
     * </pre>
     */
    @java.lang.Deprecated
    public com.axelar.evm.v1beta1.DepositStateResponse depositState(com.axelar.evm.v1beta1.DepositStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PendingCommands queries the pending commands for the specified chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.PendingCommandsResponse pendingCommands(com.axelar.evm.v1beta1.PendingCommandsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPendingCommandsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Chains queries the available evm chains
     * </pre>
     */
    public com.axelar.evm.v1beta1.ChainsResponse chains(com.axelar.evm.v1beta1.ChainsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Command queries the command of a chain provided the command id
     * </pre>
     */
    public com.axelar.evm.v1beta1.CommandResponse command(com.axelar.evm.v1beta1.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KeyAddress queries the address of key of a chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.KeyAddressResponse keyAddress(com.axelar.evm.v1beta1.KeyAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKeyAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GatewayAddress queries the address of axelar gateway at the specified
     * chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.GatewayAddressResponse gatewayAddress(com.axelar.evm.v1beta1.GatewayAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGatewayAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bytecode queries the bytecode of a specified gateway at the specified
     * chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.BytecodeResponse bytecode(com.axelar.evm.v1beta1.BytecodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBytecodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Event queries an event at the specified chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.EventResponse event(com.axelar.evm.v1beta1.EventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ERC20Tokens queries the ERC20 tokens registered for a chain
     * </pre>
     */
    public com.axelar.evm.v1beta1.ERC20TokensResponse eRC20Tokens(com.axelar.evm.v1beta1.ERC20TokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getERC20TokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TokenInfo queries the token info for a registered ERC20 Token
     * </pre>
     */
    public com.axelar.evm.v1beta1.TokenInfoResponse tokenInfo(com.axelar.evm.v1beta1.TokenInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTokenInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueryService.
   * <pre>
   * QueryService defines the gRPC querier service.
   * </pre>
   */
  public static final class QueryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueryServiceFutureStub> {
    private QueryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * BatchedCommands queries the batched commands for a specified chain and
     * BatchedCommandsID if no BatchedCommandsID is specified, then it returns the
     * latest batched commands
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.BatchedCommandsResponse> batchedCommands(
        com.axelar.evm.v1beta1.BatchedCommandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchedCommandsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BurnerInfo queries the burner info for the specified address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.BurnerInfoResponse> burnerInfo(
        com.axelar.evm.v1beta1.BurnerInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ConfirmationHeight queries the confirmation height for the specified chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.ConfirmationHeightResponse> confirmationHeight(
        com.axelar.evm.v1beta1.ConfirmationHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmationHeightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DepositState queries the state of the specified deposit
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.DepositStateResponse> depositState(
        com.axelar.evm.v1beta1.DepositStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PendingCommands queries the pending commands for the specified chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.PendingCommandsResponse> pendingCommands(
        com.axelar.evm.v1beta1.PendingCommandsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPendingCommandsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Chains queries the available evm chains
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.ChainsResponse> chains(
        com.axelar.evm.v1beta1.ChainsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Command queries the command of a chain provided the command id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.CommandResponse> command(
        com.axelar.evm.v1beta1.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KeyAddress queries the address of key of a chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.KeyAddressResponse> keyAddress(
        com.axelar.evm.v1beta1.KeyAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKeyAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GatewayAddress queries the address of axelar gateway at the specified
     * chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.GatewayAddressResponse> gatewayAddress(
        com.axelar.evm.v1beta1.GatewayAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGatewayAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bytecode queries the bytecode of a specified gateway at the specified
     * chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.BytecodeResponse> bytecode(
        com.axelar.evm.v1beta1.BytecodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBytecodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Event queries an event at the specified chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.EventResponse> event(
        com.axelar.evm.v1beta1.EventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ERC20Tokens queries the ERC20 tokens registered for a chain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.ERC20TokensResponse> eRC20Tokens(
        com.axelar.evm.v1beta1.ERC20TokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getERC20TokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TokenInfo queries the token info for a registered ERC20 Token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axelar.evm.v1beta1.TokenInfoResponse> tokenInfo(
        com.axelar.evm.v1beta1.TokenInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTokenInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCHED_COMMANDS = 0;
  private static final int METHODID_BURNER_INFO = 1;
  private static final int METHODID_CONFIRMATION_HEIGHT = 2;
  private static final int METHODID_DEPOSIT_STATE = 3;
  private static final int METHODID_PENDING_COMMANDS = 4;
  private static final int METHODID_CHAINS = 5;
  private static final int METHODID_COMMAND = 6;
  private static final int METHODID_KEY_ADDRESS = 7;
  private static final int METHODID_GATEWAY_ADDRESS = 8;
  private static final int METHODID_BYTECODE = 9;
  private static final int METHODID_EVENT = 10;
  private static final int METHODID_ERC20TOKENS = 11;
  private static final int METHODID_TOKEN_INFO = 12;

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
        case METHODID_BATCHED_COMMANDS:
          serviceImpl.batchedCommands((com.axelar.evm.v1beta1.BatchedCommandsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BatchedCommandsResponse>) responseObserver);
          break;
        case METHODID_BURNER_INFO:
          serviceImpl.burnerInfo((com.axelar.evm.v1beta1.BurnerInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BurnerInfoResponse>) responseObserver);
          break;
        case METHODID_CONFIRMATION_HEIGHT:
          serviceImpl.confirmationHeight((com.axelar.evm.v1beta1.ConfirmationHeightRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ConfirmationHeightResponse>) responseObserver);
          break;
        case METHODID_DEPOSIT_STATE:
          serviceImpl.depositState((com.axelar.evm.v1beta1.DepositStateRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.DepositStateResponse>) responseObserver);
          break;
        case METHODID_PENDING_COMMANDS:
          serviceImpl.pendingCommands((com.axelar.evm.v1beta1.PendingCommandsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.PendingCommandsResponse>) responseObserver);
          break;
        case METHODID_CHAINS:
          serviceImpl.chains((com.axelar.evm.v1beta1.ChainsRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ChainsResponse>) responseObserver);
          break;
        case METHODID_COMMAND:
          serviceImpl.command((com.axelar.evm.v1beta1.CommandRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.CommandResponse>) responseObserver);
          break;
        case METHODID_KEY_ADDRESS:
          serviceImpl.keyAddress((com.axelar.evm.v1beta1.KeyAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.KeyAddressResponse>) responseObserver);
          break;
        case METHODID_GATEWAY_ADDRESS:
          serviceImpl.gatewayAddress((com.axelar.evm.v1beta1.GatewayAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.GatewayAddressResponse>) responseObserver);
          break;
        case METHODID_BYTECODE:
          serviceImpl.bytecode((com.axelar.evm.v1beta1.BytecodeRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.BytecodeResponse>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((com.axelar.evm.v1beta1.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.EventResponse>) responseObserver);
          break;
        case METHODID_ERC20TOKENS:
          serviceImpl.eRC20Tokens((com.axelar.evm.v1beta1.ERC20TokensRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.ERC20TokensResponse>) responseObserver);
          break;
        case METHODID_TOKEN_INFO:
          serviceImpl.tokenInfo((com.axelar.evm.v1beta1.TokenInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.axelar.evm.v1beta1.TokenInfoResponse>) responseObserver);
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
          getBatchedCommandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.BatchedCommandsRequest,
              com.axelar.evm.v1beta1.BatchedCommandsResponse>(
                service, METHODID_BATCHED_COMMANDS)))
        .addMethod(
          getBurnerInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.BurnerInfoRequest,
              com.axelar.evm.v1beta1.BurnerInfoResponse>(
                service, METHODID_BURNER_INFO)))
        .addMethod(
          getConfirmationHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.ConfirmationHeightRequest,
              com.axelar.evm.v1beta1.ConfirmationHeightResponse>(
                service, METHODID_CONFIRMATION_HEIGHT)))
        .addMethod(
          getDepositStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.DepositStateRequest,
              com.axelar.evm.v1beta1.DepositStateResponse>(
                service, METHODID_DEPOSIT_STATE)))
        .addMethod(
          getPendingCommandsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.PendingCommandsRequest,
              com.axelar.evm.v1beta1.PendingCommandsResponse>(
                service, METHODID_PENDING_COMMANDS)))
        .addMethod(
          getChainsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.ChainsRequest,
              com.axelar.evm.v1beta1.ChainsResponse>(
                service, METHODID_CHAINS)))
        .addMethod(
          getCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.CommandRequest,
              com.axelar.evm.v1beta1.CommandResponse>(
                service, METHODID_COMMAND)))
        .addMethod(
          getKeyAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.KeyAddressRequest,
              com.axelar.evm.v1beta1.KeyAddressResponse>(
                service, METHODID_KEY_ADDRESS)))
        .addMethod(
          getGatewayAddressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.GatewayAddressRequest,
              com.axelar.evm.v1beta1.GatewayAddressResponse>(
                service, METHODID_GATEWAY_ADDRESS)))
        .addMethod(
          getBytecodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.BytecodeRequest,
              com.axelar.evm.v1beta1.BytecodeResponse>(
                service, METHODID_BYTECODE)))
        .addMethod(
          getEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.EventRequest,
              com.axelar.evm.v1beta1.EventResponse>(
                service, METHODID_EVENT)))
        .addMethod(
          getERC20TokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.ERC20TokensRequest,
              com.axelar.evm.v1beta1.ERC20TokensResponse>(
                service, METHODID_ERC20TOKENS)))
        .addMethod(
          getTokenInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.axelar.evm.v1beta1.TokenInfoRequest,
              com.axelar.evm.v1beta1.TokenInfoResponse>(
                service, METHODID_TOKEN_INFO)))
        .build();
  }

  private static abstract class QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axelar.evm.v1beta1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService");
    }
  }

  private static final class QueryServiceFileDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier {
    QueryServiceFileDescriptorSupplier() {}
  }

  private static final class QueryServiceMethodDescriptorSupplier
      extends QueryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryServiceFileDescriptorSupplier())
              .addMethod(getBatchedCommandsMethod())
              .addMethod(getBurnerInfoMethod())
              .addMethod(getConfirmationHeightMethod())
              .addMethod(getDepositStateMethod())
              .addMethod(getPendingCommandsMethod())
              .addMethod(getChainsMethod())
              .addMethod(getCommandMethod())
              .addMethod(getKeyAddressMethod())
              .addMethod(getGatewayAddressMethod())
              .addMethod(getBytecodeMethod())
              .addMethod(getEventMethod())
              .addMethod(getERC20TokensMethod())
              .addMethod(getTokenInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
