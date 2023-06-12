package com.akash.market.v1beta3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the market Msg service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: akash/market/v1beta3/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "akash.market.v1beta3.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateBid,
      com.akash.market.v1beta3.MsgCreateBidResponse> getCreateBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBid",
      requestType = com.akash.market.v1beta3.MsgCreateBid.class,
      responseType = com.akash.market.v1beta3.MsgCreateBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateBid,
      com.akash.market.v1beta3.MsgCreateBidResponse> getCreateBidMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateBid, com.akash.market.v1beta3.MsgCreateBidResponse> getCreateBidMethod;
    if ((getCreateBidMethod = MsgGrpc.getCreateBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateBidMethod = MsgGrpc.getCreateBidMethod) == null) {
          MsgGrpc.getCreateBidMethod = getCreateBidMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.MsgCreateBid, com.akash.market.v1beta3.MsgCreateBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCreateBid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCreateBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateBid"))
              .build();
        }
      }
    }
    return getCreateBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseBid,
      com.akash.market.v1beta3.MsgCloseBidResponse> getCloseBidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseBid",
      requestType = com.akash.market.v1beta3.MsgCloseBid.class,
      responseType = com.akash.market.v1beta3.MsgCloseBidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseBid,
      com.akash.market.v1beta3.MsgCloseBidResponse> getCloseBidMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseBid, com.akash.market.v1beta3.MsgCloseBidResponse> getCloseBidMethod;
    if ((getCloseBidMethod = MsgGrpc.getCloseBidMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseBidMethod = MsgGrpc.getCloseBidMethod) == null) {
          MsgGrpc.getCloseBidMethod = getCloseBidMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.MsgCloseBid, com.akash.market.v1beta3.MsgCloseBidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseBid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCloseBid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCloseBidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseBid"))
              .build();
        }
      }
    }
    return getCloseBidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgWithdrawLease,
      com.akash.market.v1beta3.MsgWithdrawLeaseResponse> getWithdrawLeaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawLease",
      requestType = com.akash.market.v1beta3.MsgWithdrawLease.class,
      responseType = com.akash.market.v1beta3.MsgWithdrawLeaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgWithdrawLease,
      com.akash.market.v1beta3.MsgWithdrawLeaseResponse> getWithdrawLeaseMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgWithdrawLease, com.akash.market.v1beta3.MsgWithdrawLeaseResponse> getWithdrawLeaseMethod;
    if ((getWithdrawLeaseMethod = MsgGrpc.getWithdrawLeaseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawLeaseMethod = MsgGrpc.getWithdrawLeaseMethod) == null) {
          MsgGrpc.getWithdrawLeaseMethod = getWithdrawLeaseMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.MsgWithdrawLease, com.akash.market.v1beta3.MsgWithdrawLeaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawLease"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgWithdrawLease.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgWithdrawLeaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawLease"))
              .build();
        }
      }
    }
    return getWithdrawLeaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateLease,
      com.akash.market.v1beta3.MsgCreateLeaseResponse> getCreateLeaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLease",
      requestType = com.akash.market.v1beta3.MsgCreateLease.class,
      responseType = com.akash.market.v1beta3.MsgCreateLeaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateLease,
      com.akash.market.v1beta3.MsgCreateLeaseResponse> getCreateLeaseMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCreateLease, com.akash.market.v1beta3.MsgCreateLeaseResponse> getCreateLeaseMethod;
    if ((getCreateLeaseMethod = MsgGrpc.getCreateLeaseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreateLeaseMethod = MsgGrpc.getCreateLeaseMethod) == null) {
          MsgGrpc.getCreateLeaseMethod = getCreateLeaseMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.MsgCreateLease, com.akash.market.v1beta3.MsgCreateLeaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLease"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCreateLease.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCreateLeaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreateLease"))
              .build();
        }
      }
    }
    return getCreateLeaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseLease,
      com.akash.market.v1beta3.MsgCloseLeaseResponse> getCloseLeaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseLease",
      requestType = com.akash.market.v1beta3.MsgCloseLease.class,
      responseType = com.akash.market.v1beta3.MsgCloseLeaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseLease,
      com.akash.market.v1beta3.MsgCloseLeaseResponse> getCloseLeaseMethod() {
    io.grpc.MethodDescriptor<com.akash.market.v1beta3.MsgCloseLease, com.akash.market.v1beta3.MsgCloseLeaseResponse> getCloseLeaseMethod;
    if ((getCloseLeaseMethod = MsgGrpc.getCloseLeaseMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCloseLeaseMethod = MsgGrpc.getCloseLeaseMethod) == null) {
          MsgGrpc.getCloseLeaseMethod = getCloseLeaseMethod =
              io.grpc.MethodDescriptor.<com.akash.market.v1beta3.MsgCloseLease, com.akash.market.v1beta3.MsgCloseLeaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseLease"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCloseLease.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.akash.market.v1beta3.MsgCloseLeaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CloseLease"))
              .build();
        }
      }
    }
    return getCloseLeaseMethod;
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
   * Msg defines the market Msg service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateBid defines a method to create a bid given proper inputs.
     * </pre>
     */
    default void createBid(com.akash.market.v1beta3.MsgCreateBid request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseBid defines a method to close a bid given proper inputs.
     * </pre>
     */
    default void closeBid(com.akash.market.v1beta3.MsgCloseBid request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseBidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseBidMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawLease withdraws accrued funds from the lease payment
     * </pre>
     */
    default void withdrawLease(com.akash.market.v1beta3.MsgWithdrawLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgWithdrawLeaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawLeaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateLease creates a new lease
     * </pre>
     */
    default void createLease(com.akash.market.v1beta3.MsgCreateLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateLeaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLeaseMethod(), responseObserver);
    }

    /**
     * <pre>
     * CloseLease defines a method to close an order given proper inputs.
     * </pre>
     */
    default void closeLease(com.akash.market.v1beta3.MsgCloseLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseLeaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseLeaseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the market Msg service
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
   * Msg defines the market Msg service
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
     * CreateBid defines a method to create a bid given proper inputs.
     * </pre>
     */
    public void createBid(com.akash.market.v1beta3.MsgCreateBid request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseBid defines a method to close a bid given proper inputs.
     * </pre>
     */
    public void closeBid(com.akash.market.v1beta3.MsgCloseBid request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseBidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseBidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawLease withdraws accrued funds from the lease payment
     * </pre>
     */
    public void withdrawLease(com.akash.market.v1beta3.MsgWithdrawLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgWithdrawLeaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawLeaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateLease creates a new lease
     * </pre>
     */
    public void createLease(com.akash.market.v1beta3.MsgCreateLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateLeaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLeaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CloseLease defines a method to close an order given proper inputs.
     * </pre>
     */
    public void closeLease(com.akash.market.v1beta3.MsgCloseLease request,
        io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseLeaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseLeaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the market Msg service
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
     * CreateBid defines a method to create a bid given proper inputs.
     * </pre>
     */
    public com.akash.market.v1beta3.MsgCreateBidResponse createBid(com.akash.market.v1beta3.MsgCreateBid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseBid defines a method to close a bid given proper inputs.
     * </pre>
     */
    public com.akash.market.v1beta3.MsgCloseBidResponse closeBid(com.akash.market.v1beta3.MsgCloseBid request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseBidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawLease withdraws accrued funds from the lease payment
     * </pre>
     */
    public com.akash.market.v1beta3.MsgWithdrawLeaseResponse withdrawLease(com.akash.market.v1beta3.MsgWithdrawLease request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawLeaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateLease creates a new lease
     * </pre>
     */
    public com.akash.market.v1beta3.MsgCreateLeaseResponse createLease(com.akash.market.v1beta3.MsgCreateLease request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLeaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CloseLease defines a method to close an order given proper inputs.
     * </pre>
     */
    public com.akash.market.v1beta3.MsgCloseLeaseResponse closeLease(com.akash.market.v1beta3.MsgCloseLease request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseLeaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the market Msg service
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
     * CreateBid defines a method to create a bid given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.MsgCreateBidResponse> createBid(
        com.akash.market.v1beta3.MsgCreateBid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseBid defines a method to close a bid given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.MsgCloseBidResponse> closeBid(
        com.akash.market.v1beta3.MsgCloseBid request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseBidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawLease withdraws accrued funds from the lease payment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.MsgWithdrawLeaseResponse> withdrawLease(
        com.akash.market.v1beta3.MsgWithdrawLease request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawLeaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateLease creates a new lease
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.MsgCreateLeaseResponse> createLease(
        com.akash.market.v1beta3.MsgCreateLease request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLeaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CloseLease defines a method to close an order given proper inputs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.akash.market.v1beta3.MsgCloseLeaseResponse> closeLease(
        com.akash.market.v1beta3.MsgCloseLease request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseLeaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BID = 0;
  private static final int METHODID_CLOSE_BID = 1;
  private static final int METHODID_WITHDRAW_LEASE = 2;
  private static final int METHODID_CREATE_LEASE = 3;
  private static final int METHODID_CLOSE_LEASE = 4;

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
        case METHODID_CREATE_BID:
          serviceImpl.createBid((com.akash.market.v1beta3.MsgCreateBid) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateBidResponse>) responseObserver);
          break;
        case METHODID_CLOSE_BID:
          serviceImpl.closeBid((com.akash.market.v1beta3.MsgCloseBid) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseBidResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_LEASE:
          serviceImpl.withdrawLease((com.akash.market.v1beta3.MsgWithdrawLease) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgWithdrawLeaseResponse>) responseObserver);
          break;
        case METHODID_CREATE_LEASE:
          serviceImpl.createLease((com.akash.market.v1beta3.MsgCreateLease) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCreateLeaseResponse>) responseObserver);
          break;
        case METHODID_CLOSE_LEASE:
          serviceImpl.closeLease((com.akash.market.v1beta3.MsgCloseLease) request,
              (io.grpc.stub.StreamObserver<com.akash.market.v1beta3.MsgCloseLeaseResponse>) responseObserver);
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
          getCreateBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.MsgCreateBid,
              com.akash.market.v1beta3.MsgCreateBidResponse>(
                service, METHODID_CREATE_BID)))
        .addMethod(
          getCloseBidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.MsgCloseBid,
              com.akash.market.v1beta3.MsgCloseBidResponse>(
                service, METHODID_CLOSE_BID)))
        .addMethod(
          getWithdrawLeaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.MsgWithdrawLease,
              com.akash.market.v1beta3.MsgWithdrawLeaseResponse>(
                service, METHODID_WITHDRAW_LEASE)))
        .addMethod(
          getCreateLeaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.MsgCreateLease,
              com.akash.market.v1beta3.MsgCreateLeaseResponse>(
                service, METHODID_CREATE_LEASE)))
        .addMethod(
          getCloseLeaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.akash.market.v1beta3.MsgCloseLease,
              com.akash.market.v1beta3.MsgCloseLeaseResponse>(
                service, METHODID_CLOSE_LEASE)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.akash.market.v1beta3.ServiceProto.getDescriptor();
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
              .addMethod(getCreateBidMethod())
              .addMethod(getCloseBidMethod())
              .addMethod(getWithdrawLeaseMethod())
              .addMethod(getCreateLeaseMethod())
              .addMethod(getCloseLeaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
