package com.comdex.auction.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: comdex/auction/v1beta1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "comdex.auction.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> getMsgPlaceSurplusBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgPlaceSurplusBid",
      requestType = com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest.class,
      responseType = com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> getMsgPlaceSurplusBidMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest, com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> getMsgPlaceSurplusBidMethod;
    if ((getMsgPlaceSurplusBidMethod = MsgGrpc.getMsgPlaceSurplusBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgPlaceSurplusBidMethod = MsgGrpc.getMsgPlaceSurplusBidMethod) == null) {
          MsgGrpc.getMsgPlaceSurplusBidMethod = getMsgPlaceSurplusBidMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest, com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgPlaceSurplusBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgPlaceSurplusBid"))
              .build();
        }
      }
    }
    return getMsgPlaceSurplusBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> getMsgPlaceDebtBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgPlaceDebtBid",
      requestType = com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest.class,
      responseType = com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> getMsgPlaceDebtBidMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest, com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> getMsgPlaceDebtBidMethod;
    if ((getMsgPlaceDebtBidMethod = MsgGrpc.getMsgPlaceDebtBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgPlaceDebtBidMethod = MsgGrpc.getMsgPlaceDebtBidMethod) == null) {
          MsgGrpc.getMsgPlaceDebtBidMethod = getMsgPlaceDebtBidMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest, com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgPlaceDebtBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgPlaceDebtBid"))
              .build();
        }
      }
    }
    return getMsgPlaceDebtBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> getMsgPlaceDutchBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgPlaceDutchBid",
      requestType = com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest.class,
      responseType = com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> getMsgPlaceDutchBidMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest, com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> getMsgPlaceDutchBidMethod;
    if ((getMsgPlaceDutchBidMethod = MsgGrpc.getMsgPlaceDutchBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgPlaceDutchBidMethod = MsgGrpc.getMsgPlaceDutchBidMethod) == null) {
          MsgGrpc.getMsgPlaceDutchBidMethod = getMsgPlaceDutchBidMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest, com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgPlaceDutchBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgPlaceDutchBid"))
              .build();
        }
      }
    }
    return getMsgPlaceDutchBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> getMsgPlaceDutchLendBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MsgPlaceDutchLendBid",
      requestType = com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.class,
      responseType = com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest,
      com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> getMsgPlaceDutchLendBidMethod() {
    io.grpc.MethodDescriptor<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest, com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> getMsgPlaceDutchLendBidMethod;
    if ((getMsgPlaceDutchLendBidMethod = MsgGrpc.getMsgPlaceDutchLendBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMsgPlaceDutchLendBidMethod = MsgGrpc.getMsgPlaceDutchLendBidMethod) == null) {
          MsgGrpc.getMsgPlaceDutchLendBidMethod = getMsgPlaceDutchLendBidMethod =
              io.grpc.MethodDescriptor.<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest, com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MsgPlaceDutchLendBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MsgPlaceDutchLendBid"))
              .build();
        }
      }
    }
    return getMsgPlaceDutchLendBidMethod;
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
   */
  public interface AsyncService {

    /**
     */
    default void msgPlaceSurplusBid(com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgPlaceSurplusBidMethod(), responseObserver);
    }

    /**
     */
    default void msgPlaceDebtBid(com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgPlaceDebtBidMethod(), responseObserver);
    }

    /**
     */
    default void msgPlaceDutchBid(com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgPlaceDutchBidMethod(), responseObserver);
    }

    /**
     */
    default void msgPlaceDutchLendBid(com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMsgPlaceDutchLendBidMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   */
  public static abstract class MsgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MsgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Msg.
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
     */
    public void msgPlaceSurplusBid(com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgPlaceSurplusBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgPlaceDebtBid(com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgPlaceDebtBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgPlaceDutchBid(com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgPlaceDutchBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void msgPlaceDutchLendBid(com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest request,
        io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMsgPlaceDutchLendBidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
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
     */
    public com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse msgPlaceSurplusBid(com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgPlaceSurplusBidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse msgPlaceDebtBid(com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgPlaceDebtBidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse msgPlaceDutchBid(com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgPlaceDutchBidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse msgPlaceDutchLendBid(com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMsgPlaceDutchLendBidMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse> msgPlaceSurplusBid(
        com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgPlaceSurplusBidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse> msgPlaceDebtBid(
        com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgPlaceDebtBidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse> msgPlaceDutchBid(
        com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgPlaceDutchBidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse> msgPlaceDutchLendBid(
        com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMsgPlaceDutchLendBidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MSG_PLACE_SURPLUS_BID = 0;
  private static final int METHODID_MSG_PLACE_DEBT_BID = 1;
  private static final int METHODID_MSG_PLACE_DUTCH_BID = 2;
  private static final int METHODID_MSG_PLACE_DUTCH_LEND_BID = 3;

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
        case METHODID_MSG_PLACE_SURPLUS_BID:
          serviceImpl.msgPlaceSurplusBid((com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse>) responseObserver);
          break;
        case METHODID_MSG_PLACE_DEBT_BID:
          serviceImpl.msgPlaceDebtBid((com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse>) responseObserver);
          break;
        case METHODID_MSG_PLACE_DUTCH_BID:
          serviceImpl.msgPlaceDutchBid((com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse>) responseObserver);
          break;
        case METHODID_MSG_PLACE_DUTCH_LEND_BID:
          serviceImpl.msgPlaceDutchLendBid((com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest) request,
              (io.grpc.stub.StreamObserver<com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse>) responseObserver);
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
          getMsgPlaceSurplusBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest,
              com.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse>(
                service, METHODID_MSG_PLACE_SURPLUS_BID)))
        .addMethod(
          getMsgPlaceDebtBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.MsgPlaceDebtBidRequest,
              com.comdex.auction.v1beta1.MsgPlaceDebtBidResponse>(
                service, METHODID_MSG_PLACE_DEBT_BID)))
        .addMethod(
          getMsgPlaceDutchBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.MsgPlaceDutchBidRequest,
              com.comdex.auction.v1beta1.MsgPlaceDutchBidResponse>(
                service, METHODID_MSG_PLACE_DUTCH_BID)))
        .addMethod(
          getMsgPlaceDutchLendBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest,
              com.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponse>(
                service, METHODID_MSG_PLACE_DUTCH_LEND_BID)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.comdex.auction.v1beta1.TxProto.getDescriptor();
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
              .addMethod(getMsgPlaceSurplusBidMethod())
              .addMethod(getMsgPlaceDebtBidMethod())
              .addMethod(getMsgPlaceDutchBidMethod())
              .addMethod(getMsgPlaceDutchLendBidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
