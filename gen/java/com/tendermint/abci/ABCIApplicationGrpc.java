package com.tendermint.abci;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: tendermint/abci/types.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ABCIApplicationGrpc {

  private ABCIApplicationGrpc() {}

  public static final String SERVICE_NAME = "tendermint.abci.ABCIApplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEcho,
      com.tendermint.abci.TypesProto.ResponseEcho> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = com.tendermint.abci.TypesProto.RequestEcho.class,
      responseType = com.tendermint.abci.TypesProto.ResponseEcho.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEcho,
      com.tendermint.abci.TypesProto.ResponseEcho> getEchoMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEcho, com.tendermint.abci.TypesProto.ResponseEcho> getEchoMethod;
    if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
          ABCIApplicationGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestEcho, com.tendermint.abci.TypesProto.ResponseEcho>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestEcho.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseEcho.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestFlush,
      com.tendermint.abci.TypesProto.ResponseFlush> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = com.tendermint.abci.TypesProto.RequestFlush.class,
      responseType = com.tendermint.abci.TypesProto.ResponseFlush.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestFlush,
      com.tendermint.abci.TypesProto.ResponseFlush> getFlushMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestFlush, com.tendermint.abci.TypesProto.ResponseFlush> getFlushMethod;
    if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
          ABCIApplicationGrpc.getFlushMethod = getFlushMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestFlush, com.tendermint.abci.TypesProto.ResponseFlush>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestFlush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseFlush.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Flush"))
              .build();
        }
      }
    }
    return getFlushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInfo,
      com.tendermint.abci.TypesProto.ResponseInfo> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = com.tendermint.abci.TypesProto.RequestInfo.class,
      responseType = com.tendermint.abci.TypesProto.ResponseInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInfo,
      com.tendermint.abci.TypesProto.ResponseInfo> getInfoMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInfo, com.tendermint.abci.TypesProto.ResponseInfo> getInfoMethod;
    if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
          ABCIApplicationGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestInfo, com.tendermint.abci.TypesProto.ResponseInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestDeliverTx,
      com.tendermint.abci.TypesProto.ResponseDeliverTx> getDeliverTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeliverTx",
      requestType = com.tendermint.abci.TypesProto.RequestDeliverTx.class,
      responseType = com.tendermint.abci.TypesProto.ResponseDeliverTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestDeliverTx,
      com.tendermint.abci.TypesProto.ResponseDeliverTx> getDeliverTxMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestDeliverTx, com.tendermint.abci.TypesProto.ResponseDeliverTx> getDeliverTxMethod;
    if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
          ABCIApplicationGrpc.getDeliverTxMethod = getDeliverTxMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestDeliverTx, com.tendermint.abci.TypesProto.ResponseDeliverTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeliverTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestDeliverTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseDeliverTx.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("DeliverTx"))
              .build();
        }
      }
    }
    return getDeliverTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCheckTx,
      com.tendermint.abci.TypesProto.ResponseCheckTx> getCheckTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTx",
      requestType = com.tendermint.abci.TypesProto.RequestCheckTx.class,
      responseType = com.tendermint.abci.TypesProto.ResponseCheckTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCheckTx,
      com.tendermint.abci.TypesProto.ResponseCheckTx> getCheckTxMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCheckTx, com.tendermint.abci.TypesProto.ResponseCheckTx> getCheckTxMethod;
    if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
          ABCIApplicationGrpc.getCheckTxMethod = getCheckTxMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestCheckTx, com.tendermint.abci.TypesProto.ResponseCheckTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestCheckTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseCheckTx.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("CheckTx"))
              .build();
        }
      }
    }
    return getCheckTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestQuery,
      com.tendermint.abci.TypesProto.ResponseQuery> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = com.tendermint.abci.TypesProto.RequestQuery.class,
      responseType = com.tendermint.abci.TypesProto.ResponseQuery.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestQuery,
      com.tendermint.abci.TypesProto.ResponseQuery> getQueryMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestQuery, com.tendermint.abci.TypesProto.ResponseQuery> getQueryMethod;
    if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
          ABCIApplicationGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestQuery, com.tendermint.abci.TypesProto.ResponseQuery>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseQuery.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCommit,
      com.tendermint.abci.TypesProto.ResponseCommit> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Commit",
      requestType = com.tendermint.abci.TypesProto.RequestCommit.class,
      responseType = com.tendermint.abci.TypesProto.ResponseCommit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCommit,
      com.tendermint.abci.TypesProto.ResponseCommit> getCommitMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestCommit, com.tendermint.abci.TypesProto.ResponseCommit> getCommitMethod;
    if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
          ABCIApplicationGrpc.getCommitMethod = getCommitMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestCommit, com.tendermint.abci.TypesProto.ResponseCommit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestCommit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseCommit.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Commit"))
              .build();
        }
      }
    }
    return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInitChain,
      com.tendermint.abci.TypesProto.ResponseInitChain> getInitChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitChain",
      requestType = com.tendermint.abci.TypesProto.RequestInitChain.class,
      responseType = com.tendermint.abci.TypesProto.ResponseInitChain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInitChain,
      com.tendermint.abci.TypesProto.ResponseInitChain> getInitChainMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestInitChain, com.tendermint.abci.TypesProto.ResponseInitChain> getInitChainMethod;
    if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
          ABCIApplicationGrpc.getInitChainMethod = getInitChainMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestInitChain, com.tendermint.abci.TypesProto.ResponseInitChain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestInitChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseInitChain.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("InitChain"))
              .build();
        }
      }
    }
    return getInitChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestBeginBlock,
      com.tendermint.abci.TypesProto.ResponseBeginBlock> getBeginBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginBlock",
      requestType = com.tendermint.abci.TypesProto.RequestBeginBlock.class,
      responseType = com.tendermint.abci.TypesProto.ResponseBeginBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestBeginBlock,
      com.tendermint.abci.TypesProto.ResponseBeginBlock> getBeginBlockMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestBeginBlock, com.tendermint.abci.TypesProto.ResponseBeginBlock> getBeginBlockMethod;
    if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
          ABCIApplicationGrpc.getBeginBlockMethod = getBeginBlockMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestBeginBlock, com.tendermint.abci.TypesProto.ResponseBeginBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestBeginBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseBeginBlock.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("BeginBlock"))
              .build();
        }
      }
    }
    return getBeginBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEndBlock,
      com.tendermint.abci.TypesProto.ResponseEndBlock> getEndBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndBlock",
      requestType = com.tendermint.abci.TypesProto.RequestEndBlock.class,
      responseType = com.tendermint.abci.TypesProto.ResponseEndBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEndBlock,
      com.tendermint.abci.TypesProto.ResponseEndBlock> getEndBlockMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestEndBlock, com.tendermint.abci.TypesProto.ResponseEndBlock> getEndBlockMethod;
    if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
          ABCIApplicationGrpc.getEndBlockMethod = getEndBlockMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestEndBlock, com.tendermint.abci.TypesProto.ResponseEndBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestEndBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseEndBlock.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("EndBlock"))
              .build();
        }
      }
    }
    return getEndBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestListSnapshots,
      com.tendermint.abci.TypesProto.ResponseListSnapshots> getListSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshots",
      requestType = com.tendermint.abci.TypesProto.RequestListSnapshots.class,
      responseType = com.tendermint.abci.TypesProto.ResponseListSnapshots.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestListSnapshots,
      com.tendermint.abci.TypesProto.ResponseListSnapshots> getListSnapshotsMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestListSnapshots, com.tendermint.abci.TypesProto.ResponseListSnapshots> getListSnapshotsMethod;
    if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
          ABCIApplicationGrpc.getListSnapshotsMethod = getListSnapshotsMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestListSnapshots, com.tendermint.abci.TypesProto.ResponseListSnapshots>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestListSnapshots.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseListSnapshots.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ListSnapshots"))
              .build();
        }
      }
    }
    return getListSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestOfferSnapshot,
      com.tendermint.abci.TypesProto.ResponseOfferSnapshot> getOfferSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferSnapshot",
      requestType = com.tendermint.abci.TypesProto.RequestOfferSnapshot.class,
      responseType = com.tendermint.abci.TypesProto.ResponseOfferSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestOfferSnapshot,
      com.tendermint.abci.TypesProto.ResponseOfferSnapshot> getOfferSnapshotMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestOfferSnapshot, com.tendermint.abci.TypesProto.ResponseOfferSnapshot> getOfferSnapshotMethod;
    if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
          ABCIApplicationGrpc.getOfferSnapshotMethod = getOfferSnapshotMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestOfferSnapshot, com.tendermint.abci.TypesProto.ResponseOfferSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfferSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestOfferSnapshot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseOfferSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("OfferSnapshot"))
              .build();
        }
      }
    }
    return getOfferSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk,
      com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadSnapshotChunk",
      requestType = com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk.class,
      responseType = com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk,
      com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk, com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;
    if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getLoadSnapshotChunkMethod = getLoadSnapshotChunkMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk, com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadSnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("LoadSnapshotChunk"))
              .build();
        }
      }
    }
    return getLoadSnapshotChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestApplySnapshotChunk,
      com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySnapshotChunk",
      requestType = com.tendermint.abci.TypesProto.RequestApplySnapshotChunk.class,
      responseType = com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestApplySnapshotChunk,
      com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestApplySnapshotChunk, com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;
    if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getApplySnapshotChunkMethod = getApplySnapshotChunkMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestApplySnapshotChunk, com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplySnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestApplySnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ApplySnapshotChunk"))
              .build();
        }
      }
    }
    return getApplySnapshotChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestPrepareProposal,
      com.tendermint.abci.TypesProto.ResponsePrepareProposal> getPrepareProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrepareProposal",
      requestType = com.tendermint.abci.TypesProto.RequestPrepareProposal.class,
      responseType = com.tendermint.abci.TypesProto.ResponsePrepareProposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestPrepareProposal,
      com.tendermint.abci.TypesProto.ResponsePrepareProposal> getPrepareProposalMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestPrepareProposal, com.tendermint.abci.TypesProto.ResponsePrepareProposal> getPrepareProposalMethod;
    if ((getPrepareProposalMethod = ABCIApplicationGrpc.getPrepareProposalMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getPrepareProposalMethod = ABCIApplicationGrpc.getPrepareProposalMethod) == null) {
          ABCIApplicationGrpc.getPrepareProposalMethod = getPrepareProposalMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestPrepareProposal, com.tendermint.abci.TypesProto.ResponsePrepareProposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrepareProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestPrepareProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponsePrepareProposal.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("PrepareProposal"))
              .build();
        }
      }
    }
    return getPrepareProposalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestProcessProposal,
      com.tendermint.abci.TypesProto.ResponseProcessProposal> getProcessProposalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessProposal",
      requestType = com.tendermint.abci.TypesProto.RequestProcessProposal.class,
      responseType = com.tendermint.abci.TypesProto.ResponseProcessProposal.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestProcessProposal,
      com.tendermint.abci.TypesProto.ResponseProcessProposal> getProcessProposalMethod() {
    io.grpc.MethodDescriptor<com.tendermint.abci.TypesProto.RequestProcessProposal, com.tendermint.abci.TypesProto.ResponseProcessProposal> getProcessProposalMethod;
    if ((getProcessProposalMethod = ABCIApplicationGrpc.getProcessProposalMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getProcessProposalMethod = ABCIApplicationGrpc.getProcessProposalMethod) == null) {
          ABCIApplicationGrpc.getProcessProposalMethod = getProcessProposalMethod =
              io.grpc.MethodDescriptor.<com.tendermint.abci.TypesProto.RequestProcessProposal, com.tendermint.abci.TypesProto.ResponseProcessProposal>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessProposal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.RequestProcessProposal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tendermint.abci.TypesProto.ResponseProcessProposal.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ProcessProposal"))
              .build();
        }
      }
    }
    return getProcessProposalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABCIApplicationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationStub>() {
        @java.lang.Override
        public ABCIApplicationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationStub(channel, callOptions);
        }
      };
    return ABCIApplicationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABCIApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationBlockingStub>() {
        @java.lang.Override
        public ABCIApplicationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationBlockingStub(channel, callOptions);
        }
      };
    return ABCIApplicationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABCIApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationFutureStub>() {
        @java.lang.Override
        public ABCIApplicationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationFutureStub(channel, callOptions);
        }
      };
    return ABCIApplicationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void echo(com.tendermint.abci.TypesProto.RequestEcho request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEcho> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    default void flush(com.tendermint.abci.TypesProto.RequestFlush request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseFlush> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }

    /**
     */
    default void info(com.tendermint.abci.TypesProto.RequestInfo request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     */
    default void deliverTx(com.tendermint.abci.TypesProto.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseDeliverTx> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeliverTxMethod(), responseObserver);
    }

    /**
     */
    default void checkTx(com.tendermint.abci.TypesProto.RequestCheckTx request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCheckTx> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckTxMethod(), responseObserver);
    }

    /**
     */
    default void query(com.tendermint.abci.TypesProto.RequestQuery request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseQuery> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    default void commit(com.tendermint.abci.TypesProto.RequestCommit request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCommit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    default void initChain(com.tendermint.abci.TypesProto.RequestInitChain request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInitChain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitChainMethod(), responseObserver);
    }

    /**
     */
    default void beginBlock(com.tendermint.abci.TypesProto.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseBeginBlock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginBlockMethod(), responseObserver);
    }

    /**
     */
    default void endBlock(com.tendermint.abci.TypesProto.RequestEndBlock request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEndBlock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndBlockMethod(), responseObserver);
    }

    /**
     */
    default void listSnapshots(com.tendermint.abci.TypesProto.RequestListSnapshots request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseListSnapshots> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSnapshotsMethod(), responseObserver);
    }

    /**
     */
    default void offerSnapshot(com.tendermint.abci.TypesProto.RequestOfferSnapshot request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseOfferSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfferSnapshotMethod(), responseObserver);
    }

    /**
     */
    default void loadSnapshotChunk(com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadSnapshotChunkMethod(), responseObserver);
    }

    /**
     */
    default void applySnapshotChunk(com.tendermint.abci.TypesProto.RequestApplySnapshotChunk request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplySnapshotChunkMethod(), responseObserver);
    }

    /**
     */
    default void prepareProposal(com.tendermint.abci.TypesProto.RequestPrepareProposal request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponsePrepareProposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareProposalMethod(), responseObserver);
    }

    /**
     */
    default void processProposal(com.tendermint.abci.TypesProto.RequestProcessProposal request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseProcessProposal> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessProposalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ABCIApplication.
   */
  public static abstract class ABCIApplicationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ABCIApplicationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ABCIApplication.
   */
  public static final class ABCIApplicationStub
      extends io.grpc.stub.AbstractAsyncStub<ABCIApplicationStub> {
    private ABCIApplicationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationStub(channel, callOptions);
    }

    /**
     */
    public void echo(com.tendermint.abci.TypesProto.RequestEcho request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEcho> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flush(com.tendermint.abci.TypesProto.RequestFlush request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseFlush> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(com.tendermint.abci.TypesProto.RequestInfo request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverTx(com.tendermint.abci.TypesProto.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseDeliverTx> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTx(com.tendermint.abci.TypesProto.RequestCheckTx request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCheckTx> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(com.tendermint.abci.TypesProto.RequestQuery request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseQuery> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(com.tendermint.abci.TypesProto.RequestCommit request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCommit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initChain(com.tendermint.abci.TypesProto.RequestInitChain request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInitChain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginBlock(com.tendermint.abci.TypesProto.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseBeginBlock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endBlock(com.tendermint.abci.TypesProto.RequestEndBlock request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEndBlock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSnapshots(com.tendermint.abci.TypesProto.RequestListSnapshots request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseListSnapshots> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void offerSnapshot(com.tendermint.abci.TypesProto.RequestOfferSnapshot request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseOfferSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadSnapshotChunk(com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applySnapshotChunk(com.tendermint.abci.TypesProto.RequestApplySnapshotChunk request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void prepareProposal(com.tendermint.abci.TypesProto.RequestPrepareProposal request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponsePrepareProposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareProposalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processProposal(com.tendermint.abci.TypesProto.RequestProcessProposal request,
        io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseProcessProposal> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessProposalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ABCIApplication.
   */
  public static final class ABCIApplicationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ABCIApplicationBlockingStub> {
    private ABCIApplicationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseEcho echo(com.tendermint.abci.TypesProto.RequestEcho request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseFlush flush(com.tendermint.abci.TypesProto.RequestFlush request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseInfo info(com.tendermint.abci.TypesProto.RequestInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseDeliverTx deliverTx(com.tendermint.abci.TypesProto.RequestDeliverTx request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeliverTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseCheckTx checkTx(com.tendermint.abci.TypesProto.RequestCheckTx request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseQuery query(com.tendermint.abci.TypesProto.RequestQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseCommit commit(com.tendermint.abci.TypesProto.RequestCommit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseInitChain initChain(com.tendermint.abci.TypesProto.RequestInitChain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseBeginBlock beginBlock(com.tendermint.abci.TypesProto.RequestBeginBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseEndBlock endBlock(com.tendermint.abci.TypesProto.RequestEndBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseListSnapshots listSnapshots(com.tendermint.abci.TypesProto.RequestListSnapshots request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseOfferSnapshot offerSnapshot(com.tendermint.abci.TypesProto.RequestOfferSnapshot request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfferSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk loadSnapshotChunk(com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadSnapshotChunkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk applySnapshotChunk(com.tendermint.abci.TypesProto.RequestApplySnapshotChunk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplySnapshotChunkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponsePrepareProposal prepareProposal(com.tendermint.abci.TypesProto.RequestPrepareProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareProposalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tendermint.abci.TypesProto.ResponseProcessProposal processProposal(com.tendermint.abci.TypesProto.RequestProcessProposal request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessProposalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ABCIApplication.
   */
  public static final class ABCIApplicationFutureStub
      extends io.grpc.stub.AbstractFutureStub<ABCIApplicationFutureStub> {
    private ABCIApplicationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseEcho> echo(
        com.tendermint.abci.TypesProto.RequestEcho request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseFlush> flush(
        com.tendermint.abci.TypesProto.RequestFlush request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseInfo> info(
        com.tendermint.abci.TypesProto.RequestInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseDeliverTx> deliverTx(
        com.tendermint.abci.TypesProto.RequestDeliverTx request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseCheckTx> checkTx(
        com.tendermint.abci.TypesProto.RequestCheckTx request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseQuery> query(
        com.tendermint.abci.TypesProto.RequestQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseCommit> commit(
        com.tendermint.abci.TypesProto.RequestCommit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseInitChain> initChain(
        com.tendermint.abci.TypesProto.RequestInitChain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseBeginBlock> beginBlock(
        com.tendermint.abci.TypesProto.RequestBeginBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseEndBlock> endBlock(
        com.tendermint.abci.TypesProto.RequestEndBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseListSnapshots> listSnapshots(
        com.tendermint.abci.TypesProto.RequestListSnapshots request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseOfferSnapshot> offerSnapshot(
        com.tendermint.abci.TypesProto.RequestOfferSnapshot request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk> loadSnapshotChunk(
        com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk> applySnapshotChunk(
        com.tendermint.abci.TypesProto.RequestApplySnapshotChunk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponsePrepareProposal> prepareProposal(
        com.tendermint.abci.TypesProto.RequestPrepareProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareProposalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tendermint.abci.TypesProto.ResponseProcessProposal> processProposal(
        com.tendermint.abci.TypesProto.RequestProcessProposal request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessProposalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_FLUSH = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_DELIVER_TX = 3;
  private static final int METHODID_CHECK_TX = 4;
  private static final int METHODID_QUERY = 5;
  private static final int METHODID_COMMIT = 6;
  private static final int METHODID_INIT_CHAIN = 7;
  private static final int METHODID_BEGIN_BLOCK = 8;
  private static final int METHODID_END_BLOCK = 9;
  private static final int METHODID_LIST_SNAPSHOTS = 10;
  private static final int METHODID_OFFER_SNAPSHOT = 11;
  private static final int METHODID_LOAD_SNAPSHOT_CHUNK = 12;
  private static final int METHODID_APPLY_SNAPSHOT_CHUNK = 13;
  private static final int METHODID_PREPARE_PROPOSAL = 14;
  private static final int METHODID_PROCESS_PROPOSAL = 15;

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
        case METHODID_ECHO:
          serviceImpl.echo((com.tendermint.abci.TypesProto.RequestEcho) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEcho>) responseObserver);
          break;
        case METHODID_FLUSH:
          serviceImpl.flush((com.tendermint.abci.TypesProto.RequestFlush) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseFlush>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((com.tendermint.abci.TypesProto.RequestInfo) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInfo>) responseObserver);
          break;
        case METHODID_DELIVER_TX:
          serviceImpl.deliverTx((com.tendermint.abci.TypesProto.RequestDeliverTx) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseDeliverTx>) responseObserver);
          break;
        case METHODID_CHECK_TX:
          serviceImpl.checkTx((com.tendermint.abci.TypesProto.RequestCheckTx) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCheckTx>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.tendermint.abci.TypesProto.RequestQuery) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseQuery>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((com.tendermint.abci.TypesProto.RequestCommit) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseCommit>) responseObserver);
          break;
        case METHODID_INIT_CHAIN:
          serviceImpl.initChain((com.tendermint.abci.TypesProto.RequestInitChain) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseInitChain>) responseObserver);
          break;
        case METHODID_BEGIN_BLOCK:
          serviceImpl.beginBlock((com.tendermint.abci.TypesProto.RequestBeginBlock) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseBeginBlock>) responseObserver);
          break;
        case METHODID_END_BLOCK:
          serviceImpl.endBlock((com.tendermint.abci.TypesProto.RequestEndBlock) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseEndBlock>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((com.tendermint.abci.TypesProto.RequestListSnapshots) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseListSnapshots>) responseObserver);
          break;
        case METHODID_OFFER_SNAPSHOT:
          serviceImpl.offerSnapshot((com.tendermint.abci.TypesProto.RequestOfferSnapshot) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseOfferSnapshot>) responseObserver);
          break;
        case METHODID_LOAD_SNAPSHOT_CHUNK:
          serviceImpl.loadSnapshotChunk((com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk>) responseObserver);
          break;
        case METHODID_APPLY_SNAPSHOT_CHUNK:
          serviceImpl.applySnapshotChunk((com.tendermint.abci.TypesProto.RequestApplySnapshotChunk) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk>) responseObserver);
          break;
        case METHODID_PREPARE_PROPOSAL:
          serviceImpl.prepareProposal((com.tendermint.abci.TypesProto.RequestPrepareProposal) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponsePrepareProposal>) responseObserver);
          break;
        case METHODID_PROCESS_PROPOSAL:
          serviceImpl.processProposal((com.tendermint.abci.TypesProto.RequestProcessProposal) request,
              (io.grpc.stub.StreamObserver<com.tendermint.abci.TypesProto.ResponseProcessProposal>) responseObserver);
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
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestEcho,
              com.tendermint.abci.TypesProto.ResponseEcho>(
                service, METHODID_ECHO)))
        .addMethod(
          getFlushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestFlush,
              com.tendermint.abci.TypesProto.ResponseFlush>(
                service, METHODID_FLUSH)))
        .addMethod(
          getInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestInfo,
              com.tendermint.abci.TypesProto.ResponseInfo>(
                service, METHODID_INFO)))
        .addMethod(
          getDeliverTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestDeliverTx,
              com.tendermint.abci.TypesProto.ResponseDeliverTx>(
                service, METHODID_DELIVER_TX)))
        .addMethod(
          getCheckTxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestCheckTx,
              com.tendermint.abci.TypesProto.ResponseCheckTx>(
                service, METHODID_CHECK_TX)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestQuery,
              com.tendermint.abci.TypesProto.ResponseQuery>(
                service, METHODID_QUERY)))
        .addMethod(
          getCommitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestCommit,
              com.tendermint.abci.TypesProto.ResponseCommit>(
                service, METHODID_COMMIT)))
        .addMethod(
          getInitChainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestInitChain,
              com.tendermint.abci.TypesProto.ResponseInitChain>(
                service, METHODID_INIT_CHAIN)))
        .addMethod(
          getBeginBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestBeginBlock,
              com.tendermint.abci.TypesProto.ResponseBeginBlock>(
                service, METHODID_BEGIN_BLOCK)))
        .addMethod(
          getEndBlockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestEndBlock,
              com.tendermint.abci.TypesProto.ResponseEndBlock>(
                service, METHODID_END_BLOCK)))
        .addMethod(
          getListSnapshotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestListSnapshots,
              com.tendermint.abci.TypesProto.ResponseListSnapshots>(
                service, METHODID_LIST_SNAPSHOTS)))
        .addMethod(
          getOfferSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestOfferSnapshot,
              com.tendermint.abci.TypesProto.ResponseOfferSnapshot>(
                service, METHODID_OFFER_SNAPSHOT)))
        .addMethod(
          getLoadSnapshotChunkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestLoadSnapshotChunk,
              com.tendermint.abci.TypesProto.ResponseLoadSnapshotChunk>(
                service, METHODID_LOAD_SNAPSHOT_CHUNK)))
        .addMethod(
          getApplySnapshotChunkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestApplySnapshotChunk,
              com.tendermint.abci.TypesProto.ResponseApplySnapshotChunk>(
                service, METHODID_APPLY_SNAPSHOT_CHUNK)))
        .addMethod(
          getPrepareProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestPrepareProposal,
              com.tendermint.abci.TypesProto.ResponsePrepareProposal>(
                service, METHODID_PREPARE_PROPOSAL)))
        .addMethod(
          getProcessProposalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tendermint.abci.TypesProto.RequestProcessProposal,
              com.tendermint.abci.TypesProto.ResponseProcessProposal>(
                service, METHODID_PROCESS_PROPOSAL)))
        .build();
  }

  private static abstract class ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABCIApplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tendermint.abci.TypesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABCIApplication");
    }
  }

  private static final class ABCIApplicationFileDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier {
    ABCIApplicationFileDescriptorSupplier() {}
  }

  private static final class ABCIApplicationMethodDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABCIApplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ABCIApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABCIApplicationFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getFlushMethod())
              .addMethod(getInfoMethod())
              .addMethod(getDeliverTxMethod())
              .addMethod(getCheckTxMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCommitMethod())
              .addMethod(getInitChainMethod())
              .addMethod(getBeginBlockMethod())
              .addMethod(getEndBlockMethod())
              .addMethod(getListSnapshotsMethod())
              .addMethod(getOfferSnapshotMethod())
              .addMethod(getLoadSnapshotChunkMethod())
              .addMethod(getApplySnapshotChunkMethod())
              .addMethod(getPrepareProposalMethod())
              .addMethod(getProcessProposalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
