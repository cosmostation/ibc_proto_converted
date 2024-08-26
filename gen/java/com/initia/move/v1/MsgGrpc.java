package com.initia.move.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the move Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: initia/move/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "initia.move.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgPublish,
      com.initia.move.v1.TxProto.MsgPublishResponse> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = com.initia.move.v1.TxProto.MsgPublish.class,
      responseType = com.initia.move.v1.TxProto.MsgPublishResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgPublish,
      com.initia.move.v1.TxProto.MsgPublishResponse> getPublishMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgPublish, com.initia.move.v1.TxProto.MsgPublishResponse> getPublishMethod;
    if ((getPublishMethod = MsgGrpc.getPublishMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPublishMethod = MsgGrpc.getPublishMethod) == null) {
          MsgGrpc.getPublishMethod = getPublishMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgPublish, com.initia.move.v1.TxProto.MsgPublishResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgPublish.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgPublishResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Publish"))
              .build();
        }
      }
    }
    return getPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecute,
      com.initia.move.v1.TxProto.MsgExecuteResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = com.initia.move.v1.TxProto.MsgExecute.class,
      responseType = com.initia.move.v1.TxProto.MsgExecuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecute,
      com.initia.move.v1.TxProto.MsgExecuteResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecute, com.initia.move.v1.TxProto.MsgExecuteResponse> getExecuteMethod;
    if ((getExecuteMethod = MsgGrpc.getExecuteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteMethod = MsgGrpc.getExecuteMethod) == null) {
          MsgGrpc.getExecuteMethod = getExecuteMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgExecute, com.initia.move.v1.TxProto.MsgExecuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgExecute.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgExecuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Execute"))
              .build();
        }
      }
    }
    return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecuteJSON,
      com.initia.move.v1.TxProto.MsgExecuteJSONResponse> getExecuteJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteJSON",
      requestType = com.initia.move.v1.TxProto.MsgExecuteJSON.class,
      responseType = com.initia.move.v1.TxProto.MsgExecuteJSONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecuteJSON,
      com.initia.move.v1.TxProto.MsgExecuteJSONResponse> getExecuteJSONMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgExecuteJSON, com.initia.move.v1.TxProto.MsgExecuteJSONResponse> getExecuteJSONMethod;
    if ((getExecuteJSONMethod = MsgGrpc.getExecuteJSONMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteJSONMethod = MsgGrpc.getExecuteJSONMethod) == null) {
          MsgGrpc.getExecuteJSONMethod = getExecuteJSONMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgExecuteJSON, com.initia.move.v1.TxProto.MsgExecuteJSONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgExecuteJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgExecuteJSONResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteJSON"))
              .build();
        }
      }
    }
    return getExecuteJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScript,
      com.initia.move.v1.TxProto.MsgScriptResponse> getScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Script",
      requestType = com.initia.move.v1.TxProto.MsgScript.class,
      responseType = com.initia.move.v1.TxProto.MsgScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScript,
      com.initia.move.v1.TxProto.MsgScriptResponse> getScriptMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScript, com.initia.move.v1.TxProto.MsgScriptResponse> getScriptMethod;
    if ((getScriptMethod = MsgGrpc.getScriptMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScriptMethod = MsgGrpc.getScriptMethod) == null) {
          MsgGrpc.getScriptMethod = getScriptMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgScript, com.initia.move.v1.TxProto.MsgScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Script"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgScript.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Script"))
              .build();
        }
      }
    }
    return getScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScriptJSON,
      com.initia.move.v1.TxProto.MsgScriptJSONResponse> getScriptJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScriptJSON",
      requestType = com.initia.move.v1.TxProto.MsgScriptJSON.class,
      responseType = com.initia.move.v1.TxProto.MsgScriptJSONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScriptJSON,
      com.initia.move.v1.TxProto.MsgScriptJSONResponse> getScriptJSONMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgScriptJSON, com.initia.move.v1.TxProto.MsgScriptJSONResponse> getScriptJSONMethod;
    if ((getScriptJSONMethod = MsgGrpc.getScriptJSONMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getScriptJSONMethod = MsgGrpc.getScriptJSONMethod) == null) {
          MsgGrpc.getScriptJSONMethod = getScriptJSONMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgScriptJSON, com.initia.move.v1.TxProto.MsgScriptJSONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScriptJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgScriptJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgScriptJSONResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ScriptJSON"))
              .build();
        }
      }
    }
    return getScriptJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovPublish,
      com.initia.move.v1.TxProto.MsgGovPublishResponse> getGovPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovPublish",
      requestType = com.initia.move.v1.TxProto.MsgGovPublish.class,
      responseType = com.initia.move.v1.TxProto.MsgGovPublishResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovPublish,
      com.initia.move.v1.TxProto.MsgGovPublishResponse> getGovPublishMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovPublish, com.initia.move.v1.TxProto.MsgGovPublishResponse> getGovPublishMethod;
    if ((getGovPublishMethod = MsgGrpc.getGovPublishMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovPublishMethod = MsgGrpc.getGovPublishMethod) == null) {
          MsgGrpc.getGovPublishMethod = getGovPublishMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgGovPublish, com.initia.move.v1.TxProto.MsgGovPublishResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovPublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovPublish.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovPublishResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovPublish"))
              .build();
        }
      }
    }
    return getGovPublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecute,
      com.initia.move.v1.TxProto.MsgGovExecuteResponse> getGovExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovExecute",
      requestType = com.initia.move.v1.TxProto.MsgGovExecute.class,
      responseType = com.initia.move.v1.TxProto.MsgGovExecuteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecute,
      com.initia.move.v1.TxProto.MsgGovExecuteResponse> getGovExecuteMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecute, com.initia.move.v1.TxProto.MsgGovExecuteResponse> getGovExecuteMethod;
    if ((getGovExecuteMethod = MsgGrpc.getGovExecuteMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovExecuteMethod = MsgGrpc.getGovExecuteMethod) == null) {
          MsgGrpc.getGovExecuteMethod = getGovExecuteMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgGovExecute, com.initia.move.v1.TxProto.MsgGovExecuteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovExecute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovExecute.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovExecuteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovExecute"))
              .build();
        }
      }
    }
    return getGovExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecuteJSON,
      com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> getGovExecuteJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovExecuteJSON",
      requestType = com.initia.move.v1.TxProto.MsgGovExecuteJSON.class,
      responseType = com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecuteJSON,
      com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> getGovExecuteJSONMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovExecuteJSON, com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> getGovExecuteJSONMethod;
    if ((getGovExecuteJSONMethod = MsgGrpc.getGovExecuteJSONMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovExecuteJSONMethod = MsgGrpc.getGovExecuteJSONMethod) == null) {
          MsgGrpc.getGovExecuteJSONMethod = getGovExecuteJSONMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgGovExecuteJSON, com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovExecuteJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovExecuteJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovExecuteJSON"))
              .build();
        }
      }
    }
    return getGovExecuteJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScript,
      com.initia.move.v1.TxProto.MsgGovScriptResponse> getGovScriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovScript",
      requestType = com.initia.move.v1.TxProto.MsgGovScript.class,
      responseType = com.initia.move.v1.TxProto.MsgGovScriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScript,
      com.initia.move.v1.TxProto.MsgGovScriptResponse> getGovScriptMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScript, com.initia.move.v1.TxProto.MsgGovScriptResponse> getGovScriptMethod;
    if ((getGovScriptMethod = MsgGrpc.getGovScriptMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovScriptMethod = MsgGrpc.getGovScriptMethod) == null) {
          MsgGrpc.getGovScriptMethod = getGovScriptMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgGovScript, com.initia.move.v1.TxProto.MsgGovScriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovScript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovScript.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovScriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovScript"))
              .build();
        }
      }
    }
    return getGovScriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScriptJSON,
      com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> getGovScriptJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GovScriptJSON",
      requestType = com.initia.move.v1.TxProto.MsgGovScriptJSON.class,
      responseType = com.initia.move.v1.TxProto.MsgGovScriptJSONResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScriptJSON,
      com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> getGovScriptJSONMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgGovScriptJSON, com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> getGovScriptJSONMethod;
    if ((getGovScriptJSONMethod = MsgGrpc.getGovScriptJSONMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getGovScriptJSONMethod = MsgGrpc.getGovScriptJSONMethod) == null) {
          MsgGrpc.getGovScriptJSONMethod = getGovScriptJSONMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgGovScriptJSON, com.initia.move.v1.TxProto.MsgGovScriptJSONResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GovScriptJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovScriptJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgGovScriptJSONResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("GovScriptJSON"))
              .build();
        }
      }
    }
    return getGovScriptJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgWhitelist,
      com.initia.move.v1.TxProto.MsgWhitelistResponse> getWhitelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Whitelist",
      requestType = com.initia.move.v1.TxProto.MsgWhitelist.class,
      responseType = com.initia.move.v1.TxProto.MsgWhitelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgWhitelist,
      com.initia.move.v1.TxProto.MsgWhitelistResponse> getWhitelistMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgWhitelist, com.initia.move.v1.TxProto.MsgWhitelistResponse> getWhitelistMethod;
    if ((getWhitelistMethod = MsgGrpc.getWhitelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWhitelistMethod = MsgGrpc.getWhitelistMethod) == null) {
          MsgGrpc.getWhitelistMethod = getWhitelistMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgWhitelist, com.initia.move.v1.TxProto.MsgWhitelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Whitelist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgWhitelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgWhitelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Whitelist"))
              .build();
        }
      }
    }
    return getWhitelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgDelist,
      com.initia.move.v1.TxProto.MsgDelistResponse> getDelistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delist",
      requestType = com.initia.move.v1.TxProto.MsgDelist.class,
      responseType = com.initia.move.v1.TxProto.MsgDelistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgDelist,
      com.initia.move.v1.TxProto.MsgDelistResponse> getDelistMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgDelist, com.initia.move.v1.TxProto.MsgDelistResponse> getDelistMethod;
    if ((getDelistMethod = MsgGrpc.getDelistMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDelistMethod = MsgGrpc.getDelistMethod) == null) {
          MsgGrpc.getDelistMethod = getDelistMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgDelist, com.initia.move.v1.TxProto.MsgDelistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgDelist.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgDelistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Delist"))
              .build();
        }
      }
    }
    return getDelistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgUpdateParams,
      com.initia.move.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.initia.move.v1.TxProto.MsgUpdateParams.class,
      responseType = com.initia.move.v1.TxProto.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgUpdateParams,
      com.initia.move.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.initia.move.v1.TxProto.MsgUpdateParams, com.initia.move.v1.TxProto.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.initia.move.v1.TxProto.MsgUpdateParams, com.initia.move.v1.TxProto.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.initia.move.v1.TxProto.MsgUpdateParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateParams"))
              .build();
        }
      }
    }
    return getUpdateParamsMethod;
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
   * Msg defines the move Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Publish stores compiled Move module
     * </pre>
     */
    default void publish(com.initia.move.v1.TxProto.MsgPublish request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgPublishResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ExecuteJSON instead
     * Execute runs a entry function with the given message
     * </pre>
     */
    default void execute(com.initia.move.v1.TxProto.MsgExecute request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteJSON runs a entry function with the given message
     * </pre>
     */
    default void executeJSON(com.initia.move.v1.TxProto.MsgExecuteJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteJSONResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteJSONMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ScriptJSON instead
     * Script runs a scripts with the given message
     * </pre>
     */
    default void script(com.initia.move.v1.TxProto.MsgScript request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * ScriptJSON runs a scripts with the given message
     * </pre>
     */
    default void scriptJSON(com.initia.move.v1.TxProto.MsgScriptJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptJSONResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScriptJSONMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovPublish stores compiled Move module via gov proposal
     * </pre>
     */
    default void govPublish(com.initia.move.v1.TxProto.MsgGovPublish request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovPublishResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovPublishMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GovExecuteJSON instead
     * GovExecute runs a entry function with the given message via gov proposal
     * </pre>
     */
    default void govExecute(com.initia.move.v1.TxProto.MsgGovExecute request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovExecuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovExecuteJSON runs a entry function with the given message via gov proposal
     * </pre>
     */
    default void govExecuteJSON(com.initia.move.v1.TxProto.MsgGovExecuteJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovExecuteJSONMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GovScriptJSON instead
     * GovScript runs a scripts with the given message via gov proposal
     * </pre>
     */
    default void govScript(com.initia.move.v1.TxProto.MsgGovScript request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovScriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * GovScriptJSON runs a scripts with the given message via gov proposal
     * </pre>
     */
    default void govScriptJSON(com.initia.move.v1.TxProto.MsgGovScriptJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGovScriptJSONMethod(), responseObserver);
    }

    /**
     * <pre>
     * Whitelist registers a dex pair to whitelist of various features.
     * - whitelist from coin register operation
     * - allow counter party denom can be used as gas fee
     * - register lp denom as staking denom
     * </pre>
     */
    default void whitelist(com.initia.move.v1.TxProto.MsgWhitelist request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgWhitelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWhitelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delist unregisters a dex pair from the whitelist.
     * </pre>
     */
    default void delist(com.initia.move.v1.TxProto.MsgDelist request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgDelistResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDelistMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/move module
     * parameters.
     * </pre>
     */
    default void updateParams(com.initia.move.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the move Msg service.
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
   * Msg defines the move Msg service.
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
     * Publish stores compiled Move module
     * </pre>
     */
    public void publish(com.initia.move.v1.TxProto.MsgPublish request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgPublishResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ExecuteJSON instead
     * Execute runs a entry function with the given message
     * </pre>
     */
    public void execute(com.initia.move.v1.TxProto.MsgExecute request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteJSON runs a entry function with the given message
     * </pre>
     */
    public void executeJSON(com.initia.move.v1.TxProto.MsgExecuteJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteJSONResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use ScriptJSON instead
     * Script runs a scripts with the given message
     * </pre>
     */
    public void script(com.initia.move.v1.TxProto.MsgScript request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ScriptJSON runs a scripts with the given message
     * </pre>
     */
    public void scriptJSON(com.initia.move.v1.TxProto.MsgScriptJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptJSONResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScriptJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovPublish stores compiled Move module via gov proposal
     * </pre>
     */
    public void govPublish(com.initia.move.v1.TxProto.MsgGovPublish request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovPublishResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovPublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GovExecuteJSON instead
     * GovExecute runs a entry function with the given message via gov proposal
     * </pre>
     */
    public void govExecute(com.initia.move.v1.TxProto.MsgGovExecute request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovExecuteJSON runs a entry function with the given message via gov proposal
     * </pre>
     */
    public void govExecuteJSON(com.initia.move.v1.TxProto.MsgGovExecuteJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovExecuteJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: Use GovScriptJSON instead
     * GovScript runs a scripts with the given message via gov proposal
     * </pre>
     */
    public void govScript(com.initia.move.v1.TxProto.MsgGovScript request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovScriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GovScriptJSON runs a scripts with the given message via gov proposal
     * </pre>
     */
    public void govScriptJSON(com.initia.move.v1.TxProto.MsgGovScriptJSON request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGovScriptJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Whitelist registers a dex pair to whitelist of various features.
     * - whitelist from coin register operation
     * - allow counter party denom can be used as gas fee
     * - register lp denom as staking denom
     * </pre>
     */
    public void whitelist(com.initia.move.v1.TxProto.MsgWhitelist request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgWhitelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWhitelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delist unregisters a dex pair from the whitelist.
     * </pre>
     */
    public void delist(com.initia.move.v1.TxProto.MsgDelist request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgDelistResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDelistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/move module
     * parameters.
     * </pre>
     */
    public void updateParams(com.initia.move.v1.TxProto.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the move Msg service.
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
     * Publish stores compiled Move module
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgPublishResponse publish(com.initia.move.v1.TxProto.MsgPublish request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use ExecuteJSON instead
     * Execute runs a entry function with the given message
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgExecuteResponse execute(com.initia.move.v1.TxProto.MsgExecute request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteJSON runs a entry function with the given message
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgExecuteJSONResponse executeJSON(com.initia.move.v1.TxProto.MsgExecuteJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteJSONMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use ScriptJSON instead
     * Script runs a scripts with the given message
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgScriptResponse script(com.initia.move.v1.TxProto.MsgScript request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ScriptJSON runs a scripts with the given message
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgScriptJSONResponse scriptJSON(com.initia.move.v1.TxProto.MsgScriptJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScriptJSONMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovPublish stores compiled Move module via gov proposal
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgGovPublishResponse govPublish(com.initia.move.v1.TxProto.MsgGovPublish request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovPublishMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use GovExecuteJSON instead
     * GovExecute runs a entry function with the given message via gov proposal
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgGovExecuteResponse govExecute(com.initia.move.v1.TxProto.MsgGovExecute request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovExecuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovExecuteJSON runs a entry function with the given message via gov proposal
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse govExecuteJSON(com.initia.move.v1.TxProto.MsgGovExecuteJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovExecuteJSONMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: Use GovScriptJSON instead
     * GovScript runs a scripts with the given message via gov proposal
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgGovScriptResponse govScript(com.initia.move.v1.TxProto.MsgGovScript request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovScriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GovScriptJSON runs a scripts with the given message via gov proposal
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgGovScriptJSONResponse govScriptJSON(com.initia.move.v1.TxProto.MsgGovScriptJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGovScriptJSONMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Whitelist registers a dex pair to whitelist of various features.
     * - whitelist from coin register operation
     * - allow counter party denom can be used as gas fee
     * - register lp denom as staking denom
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgWhitelistResponse whitelist(com.initia.move.v1.TxProto.MsgWhitelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWhitelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delist unregisters a dex pair from the whitelist.
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgDelistResponse delist(com.initia.move.v1.TxProto.MsgDelist request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDelistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/move module
     * parameters.
     * </pre>
     */
    public com.initia.move.v1.TxProto.MsgUpdateParamsResponse updateParams(com.initia.move.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the move Msg service.
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
     * Publish stores compiled Move module
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgPublishResponse> publish(
        com.initia.move.v1.TxProto.MsgPublish request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use ExecuteJSON instead
     * Execute runs a entry function with the given message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgExecuteResponse> execute(
        com.initia.move.v1.TxProto.MsgExecute request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteJSON runs a entry function with the given message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgExecuteJSONResponse> executeJSON(
        com.initia.move.v1.TxProto.MsgExecuteJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteJSONMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use ScriptJSON instead
     * Script runs a scripts with the given message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgScriptResponse> script(
        com.initia.move.v1.TxProto.MsgScript request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ScriptJSON runs a scripts with the given message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgScriptJSONResponse> scriptJSON(
        com.initia.move.v1.TxProto.MsgScriptJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScriptJSONMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovPublish stores compiled Move module via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgGovPublishResponse> govPublish(
        com.initia.move.v1.TxProto.MsgGovPublish request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovPublishMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use GovExecuteJSON instead
     * GovExecute runs a entry function with the given message via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgGovExecuteResponse> govExecute(
        com.initia.move.v1.TxProto.MsgGovExecute request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovExecuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovExecuteJSON runs a entry function with the given message via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse> govExecuteJSON(
        com.initia.move.v1.TxProto.MsgGovExecuteJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovExecuteJSONMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: Use GovScriptJSON instead
     * GovScript runs a scripts with the given message via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgGovScriptResponse> govScript(
        com.initia.move.v1.TxProto.MsgGovScript request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovScriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GovScriptJSON runs a scripts with the given message via gov proposal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgGovScriptJSONResponse> govScriptJSON(
        com.initia.move.v1.TxProto.MsgGovScriptJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGovScriptJSONMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Whitelist registers a dex pair to whitelist of various features.
     * - whitelist from coin register operation
     * - allow counter party denom can be used as gas fee
     * - register lp denom as staking denom
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgWhitelistResponse> whitelist(
        com.initia.move.v1.TxProto.MsgWhitelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWhitelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delist unregisters a dex pair from the whitelist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgDelistResponse> delist(
        com.initia.move.v1.TxProto.MsgDelist request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDelistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines an operation for updating the x/move module
     * parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.initia.move.v1.TxProto.MsgUpdateParamsResponse> updateParams(
        com.initia.move.v1.TxProto.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH = 0;
  private static final int METHODID_EXECUTE = 1;
  private static final int METHODID_EXECUTE_JSON = 2;
  private static final int METHODID_SCRIPT = 3;
  private static final int METHODID_SCRIPT_JSON = 4;
  private static final int METHODID_GOV_PUBLISH = 5;
  private static final int METHODID_GOV_EXECUTE = 6;
  private static final int METHODID_GOV_EXECUTE_JSON = 7;
  private static final int METHODID_GOV_SCRIPT = 8;
  private static final int METHODID_GOV_SCRIPT_JSON = 9;
  private static final int METHODID_WHITELIST = 10;
  private static final int METHODID_DELIST = 11;
  private static final int METHODID_UPDATE_PARAMS = 12;

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
        case METHODID_PUBLISH:
          serviceImpl.publish((com.initia.move.v1.TxProto.MsgPublish) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgPublishResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((com.initia.move.v1.TxProto.MsgExecute) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_JSON:
          serviceImpl.executeJSON((com.initia.move.v1.TxProto.MsgExecuteJSON) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgExecuteJSONResponse>) responseObserver);
          break;
        case METHODID_SCRIPT:
          serviceImpl.script((com.initia.move.v1.TxProto.MsgScript) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptResponse>) responseObserver);
          break;
        case METHODID_SCRIPT_JSON:
          serviceImpl.scriptJSON((com.initia.move.v1.TxProto.MsgScriptJSON) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgScriptJSONResponse>) responseObserver);
          break;
        case METHODID_GOV_PUBLISH:
          serviceImpl.govPublish((com.initia.move.v1.TxProto.MsgGovPublish) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovPublishResponse>) responseObserver);
          break;
        case METHODID_GOV_EXECUTE:
          serviceImpl.govExecute((com.initia.move.v1.TxProto.MsgGovExecute) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteResponse>) responseObserver);
          break;
        case METHODID_GOV_EXECUTE_JSON:
          serviceImpl.govExecuteJSON((com.initia.move.v1.TxProto.MsgGovExecuteJSON) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse>) responseObserver);
          break;
        case METHODID_GOV_SCRIPT:
          serviceImpl.govScript((com.initia.move.v1.TxProto.MsgGovScript) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptResponse>) responseObserver);
          break;
        case METHODID_GOV_SCRIPT_JSON:
          serviceImpl.govScriptJSON((com.initia.move.v1.TxProto.MsgGovScriptJSON) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgGovScriptJSONResponse>) responseObserver);
          break;
        case METHODID_WHITELIST:
          serviceImpl.whitelist((com.initia.move.v1.TxProto.MsgWhitelist) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgWhitelistResponse>) responseObserver);
          break;
        case METHODID_DELIST:
          serviceImpl.delist((com.initia.move.v1.TxProto.MsgDelist) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgDelistResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.initia.move.v1.TxProto.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.initia.move.v1.TxProto.MsgUpdateParamsResponse>) responseObserver);
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
          getPublishMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgPublish,
              com.initia.move.v1.TxProto.MsgPublishResponse>(
                service, METHODID_PUBLISH)))
        .addMethod(
          getExecuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgExecute,
              com.initia.move.v1.TxProto.MsgExecuteResponse>(
                service, METHODID_EXECUTE)))
        .addMethod(
          getExecuteJSONMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgExecuteJSON,
              com.initia.move.v1.TxProto.MsgExecuteJSONResponse>(
                service, METHODID_EXECUTE_JSON)))
        .addMethod(
          getScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgScript,
              com.initia.move.v1.TxProto.MsgScriptResponse>(
                service, METHODID_SCRIPT)))
        .addMethod(
          getScriptJSONMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgScriptJSON,
              com.initia.move.v1.TxProto.MsgScriptJSONResponse>(
                service, METHODID_SCRIPT_JSON)))
        .addMethod(
          getGovPublishMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgGovPublish,
              com.initia.move.v1.TxProto.MsgGovPublishResponse>(
                service, METHODID_GOV_PUBLISH)))
        .addMethod(
          getGovExecuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgGovExecute,
              com.initia.move.v1.TxProto.MsgGovExecuteResponse>(
                service, METHODID_GOV_EXECUTE)))
        .addMethod(
          getGovExecuteJSONMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgGovExecuteJSON,
              com.initia.move.v1.TxProto.MsgGovExecuteJSONResponse>(
                service, METHODID_GOV_EXECUTE_JSON)))
        .addMethod(
          getGovScriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgGovScript,
              com.initia.move.v1.TxProto.MsgGovScriptResponse>(
                service, METHODID_GOV_SCRIPT)))
        .addMethod(
          getGovScriptJSONMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgGovScriptJSON,
              com.initia.move.v1.TxProto.MsgGovScriptJSONResponse>(
                service, METHODID_GOV_SCRIPT_JSON)))
        .addMethod(
          getWhitelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgWhitelist,
              com.initia.move.v1.TxProto.MsgWhitelistResponse>(
                service, METHODID_WHITELIST)))
        .addMethod(
          getDelistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgDelist,
              com.initia.move.v1.TxProto.MsgDelistResponse>(
                service, METHODID_DELIST)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.initia.move.v1.TxProto.MsgUpdateParams,
              com.initia.move.v1.TxProto.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.initia.move.v1.TxProto.getDescriptor();
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
              .addMethod(getPublishMethod())
              .addMethod(getExecuteMethod())
              .addMethod(getExecuteJSONMethod())
              .addMethod(getScriptMethod())
              .addMethod(getScriptJSONMethod())
              .addMethod(getGovPublishMethod())
              .addMethod(getGovExecuteMethod())
              .addMethod(getGovExecuteJSONMethod())
              .addMethod(getGovScriptMethod())
              .addMethod(getGovScriptJSONMethod())
              .addMethod(getWhitelistMethod())
              .addMethod(getDelistMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
