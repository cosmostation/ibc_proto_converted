package com.provenance.attribute.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the attribute module Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: provenance/attribute/v1/tx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "provenance.attribute.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> getAddAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAttribute",
      requestType = com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> getAddAttributeMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest, com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> getAddAttributeMethod;
    if ((getAddAttributeMethod = MsgGrpc.getAddAttributeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddAttributeMethod = MsgGrpc.getAddAttributeMethod) == null) {
          MsgGrpc.getAddAttributeMethod = getAddAttributeMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest, com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddAttribute"))
              .build();
        }
      }
    }
    return getAddAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> getUpdateAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAttribute",
      requestType = com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> getUpdateAttributeMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest, com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> getUpdateAttributeMethod;
    if ((getUpdateAttributeMethod = MsgGrpc.getUpdateAttributeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateAttributeMethod = MsgGrpc.getUpdateAttributeMethod) == null) {
          MsgGrpc.getUpdateAttributeMethod = getUpdateAttributeMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest, com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateAttribute"))
              .build();
        }
      }
    }
    return getUpdateAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest,
      com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> getUpdateAttributeExpirationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAttributeExpiration",
      requestType = com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest,
      com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> getUpdateAttributeExpirationMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest, com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> getUpdateAttributeExpirationMethod;
    if ((getUpdateAttributeExpirationMethod = MsgGrpc.getUpdateAttributeExpirationMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateAttributeExpirationMethod = MsgGrpc.getUpdateAttributeExpirationMethod) == null) {
          MsgGrpc.getUpdateAttributeExpirationMethod = getUpdateAttributeExpirationMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest, com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAttributeExpiration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateAttributeExpiration"))
              .build();
        }
      }
    }
    return getUpdateAttributeExpirationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> getDeleteAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAttribute",
      requestType = com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> getDeleteAttributeMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest, com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> getDeleteAttributeMethod;
    if ((getDeleteAttributeMethod = MsgGrpc.getDeleteAttributeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteAttributeMethod = MsgGrpc.getDeleteAttributeMethod) == null) {
          MsgGrpc.getDeleteAttributeMethod = getDeleteAttributeMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest, com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteAttribute"))
              .build();
        }
      }
    }
    return getDeleteAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> getDeleteDistinctAttributeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDistinctAttribute",
      requestType = com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest,
      com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> getDeleteDistinctAttributeMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest, com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> getDeleteDistinctAttributeMethod;
    if ((getDeleteDistinctAttributeMethod = MsgGrpc.getDeleteDistinctAttributeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeleteDistinctAttributeMethod = MsgGrpc.getDeleteDistinctAttributeMethod) == null) {
          MsgGrpc.getDeleteDistinctAttributeMethod = getDeleteDistinctAttributeMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest, com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDistinctAttribute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeleteDistinctAttribute"))
              .build();
        }
      }
    }
    return getDeleteDistinctAttributeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest,
      com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccountData",
      requestType = com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest.class,
      responseType = com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest,
      com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod() {
    io.grpc.MethodDescriptor<com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest, com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> getSetAccountDataMethod;
    if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetAccountDataMethod = MsgGrpc.getSetAccountDataMethod) == null) {
          MsgGrpc.getSetAccountDataMethod = getSetAccountDataMethod =
              io.grpc.MethodDescriptor.<com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest, com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccountData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetAccountData"))
              .build();
        }
      }
    }
    return getSetAccountDataMethod;
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
   * Msg defines the attribute module Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * AddAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    default void addAttribute(com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAttributeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    default void updateAttribute(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAttributeMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAttributeExpiration defines a method to verify a particular invariance.
     * </pre>
     */
    default void updateAttributeExpiration(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAttributeExpirationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    default void deleteAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAttributeMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDistinctAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    default void deleteDistinctAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDistinctAttributeMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAccountData defines a method for setting/updating an account's accountdata attribute.
     * </pre>
     */
    default void setAccountData(com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccountDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the attribute module Msg service.
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
   * Msg defines the attribute module Msg service.
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
     * AddAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public void addAttribute(com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public void updateAttribute(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAttributeExpiration defines a method to verify a particular invariance.
     * </pre>
     */
    public void updateAttributeExpiration(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAttributeExpirationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public void deleteAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDistinctAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public void deleteDistinctAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDistinctAttributeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAccountData defines a method for setting/updating an account's accountdata attribute.
     * </pre>
     */
    public void setAccountData(com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest request,
        io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the attribute module Msg service.
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
     * AddAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse addAttribute(com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAttributeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse updateAttribute(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAttributeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAttributeExpiration defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse updateAttributeExpiration(com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAttributeExpirationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse deleteAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAttributeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDistinctAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse deleteDistinctAttribute(com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDistinctAttributeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAccountData defines a method for setting/updating an account's accountdata attribute.
     * </pre>
     */
    public com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse setAccountData(com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccountDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the attribute module Msg service.
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
     * AddAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse> addAttribute(
        com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAttributeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse> updateAttribute(
        com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAttributeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAttributeExpiration defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse> updateAttributeExpiration(
        com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAttributeExpirationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse> deleteAttribute(
        com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAttributeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDistinctAttribute defines a method to verify a particular invariance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse> deleteDistinctAttribute(
        com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDistinctAttributeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAccountData defines a method for setting/updating an account's accountdata attribute.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse> setAccountData(
        com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccountDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ATTRIBUTE = 0;
  private static final int METHODID_UPDATE_ATTRIBUTE = 1;
  private static final int METHODID_UPDATE_ATTRIBUTE_EXPIRATION = 2;
  private static final int METHODID_DELETE_ATTRIBUTE = 3;
  private static final int METHODID_DELETE_DISTINCT_ATTRIBUTE = 4;
  private static final int METHODID_SET_ACCOUNT_DATA = 5;

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
        case METHODID_ADD_ATTRIBUTE:
          serviceImpl.addAttribute((com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ATTRIBUTE:
          serviceImpl.updateAttribute((com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ATTRIBUTE_EXPIRATION:
          serviceImpl.updateAttributeExpiration((com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse>) responseObserver);
          break;
        case METHODID_DELETE_ATTRIBUTE:
          serviceImpl.deleteAttribute((com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse>) responseObserver);
          break;
        case METHODID_DELETE_DISTINCT_ATTRIBUTE:
          serviceImpl.deleteDistinctAttribute((com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse>) responseObserver);
          break;
        case METHODID_SET_ACCOUNT_DATA:
          serviceImpl.setAccountData((com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest) request,
              (io.grpc.stub.StreamObserver<com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse>) responseObserver);
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
          getAddAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgAddAttributeRequest,
              com.provenance.attribute.v1.TxProto.MsgAddAttributeResponse>(
                service, METHODID_ADD_ATTRIBUTE)))
        .addMethod(
          getUpdateAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgUpdateAttributeRequest,
              com.provenance.attribute.v1.TxProto.MsgUpdateAttributeResponse>(
                service, METHODID_UPDATE_ATTRIBUTE)))
        .addMethod(
          getUpdateAttributeExpirationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationRequest,
              com.provenance.attribute.v1.TxProto.MsgUpdateAttributeExpirationResponse>(
                service, METHODID_UPDATE_ATTRIBUTE_EXPIRATION)))
        .addMethod(
          getDeleteAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgDeleteAttributeRequest,
              com.provenance.attribute.v1.TxProto.MsgDeleteAttributeResponse>(
                service, METHODID_DELETE_ATTRIBUTE)))
        .addMethod(
          getDeleteDistinctAttributeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeRequest,
              com.provenance.attribute.v1.TxProto.MsgDeleteDistinctAttributeResponse>(
                service, METHODID_DELETE_DISTINCT_ATTRIBUTE)))
        .addMethod(
          getSetAccountDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.provenance.attribute.v1.TxProto.MsgSetAccountDataRequest,
              com.provenance.attribute.v1.TxProto.MsgSetAccountDataResponse>(
                service, METHODID_SET_ACCOUNT_DATA)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.provenance.attribute.v1.TxProto.getDescriptor();
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
              .addMethod(getAddAttributeMethod())
              .addMethod(getUpdateAttributeMethod())
              .addMethod(getUpdateAttributeExpirationMethod())
              .addMethod(getDeleteAttributeMethod())
              .addMethod(getDeleteDistinctAttributeMethod())
              .addMethod(getSetAccountDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
