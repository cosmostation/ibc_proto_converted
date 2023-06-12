package com.desmos.posts.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the posts Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: desmos/posts/v3/msgs.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "desmos.posts.v3.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgCreatePost,
      com.desmos.posts.v3.MsgCreatePostResponse> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = com.desmos.posts.v3.MsgCreatePost.class,
      responseType = com.desmos.posts.v3.MsgCreatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgCreatePost,
      com.desmos.posts.v3.MsgCreatePostResponse> getCreatePostMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgCreatePost, com.desmos.posts.v3.MsgCreatePostResponse> getCreatePostMethod;
    if ((getCreatePostMethod = MsgGrpc.getCreatePostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCreatePostMethod = MsgGrpc.getCreatePostMethod) == null) {
          MsgGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgCreatePost, com.desmos.posts.v3.MsgCreatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgCreatePost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgCreatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgEditPost,
      com.desmos.posts.v3.MsgEditPostResponse> getEditPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditPost",
      requestType = com.desmos.posts.v3.MsgEditPost.class,
      responseType = com.desmos.posts.v3.MsgEditPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgEditPost,
      com.desmos.posts.v3.MsgEditPostResponse> getEditPostMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgEditPost, com.desmos.posts.v3.MsgEditPostResponse> getEditPostMethod;
    if ((getEditPostMethod = MsgGrpc.getEditPostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditPostMethod = MsgGrpc.getEditPostMethod) == null) {
          MsgGrpc.getEditPostMethod = getEditPostMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgEditPost, com.desmos.posts.v3.MsgEditPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgEditPost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgEditPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditPost"))
              .build();
        }
      }
    }
    return getEditPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgDeletePost,
      com.desmos.posts.v3.MsgDeletePostResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.desmos.posts.v3.MsgDeletePost.class,
      responseType = com.desmos.posts.v3.MsgDeletePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgDeletePost,
      com.desmos.posts.v3.MsgDeletePostResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgDeletePost, com.desmos.posts.v3.MsgDeletePostResponse> getDeletePostMethod;
    if ((getDeletePostMethod = MsgGrpc.getDeletePostMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDeletePostMethod = MsgGrpc.getDeletePostMethod) == null) {
          MsgGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgDeletePost, com.desmos.posts.v3.MsgDeletePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgDeletePost.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgDeletePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAddPostAttachment,
      com.desmos.posts.v3.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPostAttachment",
      requestType = com.desmos.posts.v3.MsgAddPostAttachment.class,
      responseType = com.desmos.posts.v3.MsgAddPostAttachmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAddPostAttachment,
      com.desmos.posts.v3.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAddPostAttachment, com.desmos.posts.v3.MsgAddPostAttachmentResponse> getAddPostAttachmentMethod;
    if ((getAddPostAttachmentMethod = MsgGrpc.getAddPostAttachmentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAddPostAttachmentMethod = MsgGrpc.getAddPostAttachmentMethod) == null) {
          MsgGrpc.getAddPostAttachmentMethod = getAddPostAttachmentMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgAddPostAttachment, com.desmos.posts.v3.MsgAddPostAttachmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPostAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgAddPostAttachment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgAddPostAttachmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AddPostAttachment"))
              .build();
        }
      }
    }
    return getAddPostAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgRemovePostAttachment,
      com.desmos.posts.v3.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePostAttachment",
      requestType = com.desmos.posts.v3.MsgRemovePostAttachment.class,
      responseType = com.desmos.posts.v3.MsgRemovePostAttachmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgRemovePostAttachment,
      com.desmos.posts.v3.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgRemovePostAttachment, com.desmos.posts.v3.MsgRemovePostAttachmentResponse> getRemovePostAttachmentMethod;
    if ((getRemovePostAttachmentMethod = MsgGrpc.getRemovePostAttachmentMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRemovePostAttachmentMethod = MsgGrpc.getRemovePostAttachmentMethod) == null) {
          MsgGrpc.getRemovePostAttachmentMethod = getRemovePostAttachmentMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgRemovePostAttachment, com.desmos.posts.v3.MsgRemovePostAttachmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePostAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgRemovePostAttachment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgRemovePostAttachmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RemovePostAttachment"))
              .build();
        }
      }
    }
    return getRemovePostAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAnswerPoll,
      com.desmos.posts.v3.MsgAnswerPollResponse> getAnswerPollMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnswerPoll",
      requestType = com.desmos.posts.v3.MsgAnswerPoll.class,
      responseType = com.desmos.posts.v3.MsgAnswerPollResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAnswerPoll,
      com.desmos.posts.v3.MsgAnswerPollResponse> getAnswerPollMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgAnswerPoll, com.desmos.posts.v3.MsgAnswerPollResponse> getAnswerPollMethod;
    if ((getAnswerPollMethod = MsgGrpc.getAnswerPollMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getAnswerPollMethod = MsgGrpc.getAnswerPollMethod) == null) {
          MsgGrpc.getAnswerPollMethod = getAnswerPollMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgAnswerPoll, com.desmos.posts.v3.MsgAnswerPollResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnswerPoll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgAnswerPoll.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgAnswerPollResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("AnswerPoll"))
              .build();
        }
      }
    }
    return getAnswerPollMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgUpdateParams,
      com.desmos.posts.v3.MsgUpdateParamsResponse> getUpdateParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateParams",
      requestType = com.desmos.posts.v3.MsgUpdateParams.class,
      responseType = com.desmos.posts.v3.MsgUpdateParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgUpdateParams,
      com.desmos.posts.v3.MsgUpdateParamsResponse> getUpdateParamsMethod() {
    io.grpc.MethodDescriptor<com.desmos.posts.v3.MsgUpdateParams, com.desmos.posts.v3.MsgUpdateParamsResponse> getUpdateParamsMethod;
    if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateParamsMethod = MsgGrpc.getUpdateParamsMethod) == null) {
          MsgGrpc.getUpdateParamsMethod = getUpdateParamsMethod =
              io.grpc.MethodDescriptor.<com.desmos.posts.v3.MsgUpdateParams, com.desmos.posts.v3.MsgUpdateParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgUpdateParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.desmos.posts.v3.MsgUpdateParamsResponse.getDefaultInstance()))
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
   * Msg defines the posts Msg service.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreatePost allows to create a new post
     * </pre>
     */
    default void createPost(com.desmos.posts.v3.MsgCreatePost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgCreatePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    default void editPost(com.desmos.posts.v3.MsgEditPost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgEditPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditPostMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    default void deletePost(com.desmos.posts.v3.MsgDeletePost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgDeletePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    default void addPostAttachment(com.desmos.posts.v3.MsgAddPostAttachment request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAddPostAttachmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPostAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    default void removePostAttachment(com.desmos.posts.v3.MsgRemovePostAttachment request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgRemovePostAttachmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemovePostAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    default void answerPoll(com.desmos.posts.v3.MsgAnswerPoll request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAnswerPollResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnswerPollMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a (governance) operation for updating the module
     * parameters.
     * The authority defaults to the x/gov module account.
     * Since: Desmos 5.0.0
     * </pre>
     */
    default void updateParams(com.desmos.posts.v3.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateParamsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Msg.
   * <pre>
   * Msg defines the posts Msg service.
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
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public void createPost(com.desmos.posts.v3.MsgCreatePost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgCreatePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public void editPost(com.desmos.posts.v3.MsgEditPost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgEditPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public void deletePost(com.desmos.posts.v3.MsgDeletePost request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgDeletePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public void addPostAttachment(com.desmos.posts.v3.MsgAddPostAttachment request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAddPostAttachmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPostAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public void removePostAttachment(com.desmos.posts.v3.MsgRemovePostAttachment request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgRemovePostAttachmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemovePostAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public void answerPoll(com.desmos.posts.v3.MsgAnswerPoll request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAnswerPollResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnswerPollMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateParams defines a (governance) operation for updating the module
     * parameters.
     * The authority defaults to the x/gov module account.
     * Since: Desmos 5.0.0
     * </pre>
     */
    public void updateParams(com.desmos.posts.v3.MsgUpdateParams request,
        io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgUpdateParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Msg.
   * <pre>
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public com.desmos.posts.v3.MsgCreatePostResponse createPost(com.desmos.posts.v3.MsgCreatePost request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public com.desmos.posts.v3.MsgEditPostResponse editPost(com.desmos.posts.v3.MsgEditPost request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditPostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public com.desmos.posts.v3.MsgDeletePostResponse deletePost(com.desmos.posts.v3.MsgDeletePost request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public com.desmos.posts.v3.MsgAddPostAttachmentResponse addPostAttachment(com.desmos.posts.v3.MsgAddPostAttachment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPostAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public com.desmos.posts.v3.MsgRemovePostAttachmentResponse removePostAttachment(com.desmos.posts.v3.MsgRemovePostAttachment request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemovePostAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public com.desmos.posts.v3.MsgAnswerPollResponse answerPoll(com.desmos.posts.v3.MsgAnswerPoll request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnswerPollMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateParams defines a (governance) operation for updating the module
     * parameters.
     * The authority defaults to the x/gov module account.
     * Since: Desmos 5.0.0
     * </pre>
     */
    public com.desmos.posts.v3.MsgUpdateParamsResponse updateParams(com.desmos.posts.v3.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Msg.
   * <pre>
   * Msg defines the posts Msg service.
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
     * CreatePost allows to create a new post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgCreatePostResponse> createPost(
        com.desmos.posts.v3.MsgCreatePost request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EditPost allows to edit an existing post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgEditPostResponse> editPost(
        com.desmos.posts.v3.MsgEditPost request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditPostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeletePost allows to delete an existing post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgDeletePostResponse> deletePost(
        com.desmos.posts.v3.MsgDeletePost request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddPostAttachment allows to add a new attachment to a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgAddPostAttachmentResponse> addPostAttachment(
        com.desmos.posts.v3.MsgAddPostAttachment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPostAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemovePostAttachment allows to remove an attachment from a post
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgRemovePostAttachmentResponse> removePostAttachment(
        com.desmos.posts.v3.MsgRemovePostAttachment request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemovePostAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AnswerPoll allows to answer a post poll
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgAnswerPollResponse> answerPoll(
        com.desmos.posts.v3.MsgAnswerPoll request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnswerPollMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateParams defines a (governance) operation for updating the module
     * parameters.
     * The authority defaults to the x/gov module account.
     * Since: Desmos 5.0.0
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.desmos.posts.v3.MsgUpdateParamsResponse> updateParams(
        com.desmos.posts.v3.MsgUpdateParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_EDIT_POST = 1;
  private static final int METHODID_DELETE_POST = 2;
  private static final int METHODID_ADD_POST_ATTACHMENT = 3;
  private static final int METHODID_REMOVE_POST_ATTACHMENT = 4;
  private static final int METHODID_ANSWER_POLL = 5;
  private static final int METHODID_UPDATE_PARAMS = 6;

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
        case METHODID_CREATE_POST:
          serviceImpl.createPost((com.desmos.posts.v3.MsgCreatePost) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgCreatePostResponse>) responseObserver);
          break;
        case METHODID_EDIT_POST:
          serviceImpl.editPost((com.desmos.posts.v3.MsgEditPost) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgEditPostResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.desmos.posts.v3.MsgDeletePost) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgDeletePostResponse>) responseObserver);
          break;
        case METHODID_ADD_POST_ATTACHMENT:
          serviceImpl.addPostAttachment((com.desmos.posts.v3.MsgAddPostAttachment) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAddPostAttachmentResponse>) responseObserver);
          break;
        case METHODID_REMOVE_POST_ATTACHMENT:
          serviceImpl.removePostAttachment((com.desmos.posts.v3.MsgRemovePostAttachment) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgRemovePostAttachmentResponse>) responseObserver);
          break;
        case METHODID_ANSWER_POLL:
          serviceImpl.answerPoll((com.desmos.posts.v3.MsgAnswerPoll) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgAnswerPollResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PARAMS:
          serviceImpl.updateParams((com.desmos.posts.v3.MsgUpdateParams) request,
              (io.grpc.stub.StreamObserver<com.desmos.posts.v3.MsgUpdateParamsResponse>) responseObserver);
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
          getCreatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgCreatePost,
              com.desmos.posts.v3.MsgCreatePostResponse>(
                service, METHODID_CREATE_POST)))
        .addMethod(
          getEditPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgEditPost,
              com.desmos.posts.v3.MsgEditPostResponse>(
                service, METHODID_EDIT_POST)))
        .addMethod(
          getDeletePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgDeletePost,
              com.desmos.posts.v3.MsgDeletePostResponse>(
                service, METHODID_DELETE_POST)))
        .addMethod(
          getAddPostAttachmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgAddPostAttachment,
              com.desmos.posts.v3.MsgAddPostAttachmentResponse>(
                service, METHODID_ADD_POST_ATTACHMENT)))
        .addMethod(
          getRemovePostAttachmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgRemovePostAttachment,
              com.desmos.posts.v3.MsgRemovePostAttachmentResponse>(
                service, METHODID_REMOVE_POST_ATTACHMENT)))
        .addMethod(
          getAnswerPollMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgAnswerPoll,
              com.desmos.posts.v3.MsgAnswerPollResponse>(
                service, METHODID_ANSWER_POLL)))
        .addMethod(
          getUpdateParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.desmos.posts.v3.MsgUpdateParams,
              com.desmos.posts.v3.MsgUpdateParamsResponse>(
                service, METHODID_UPDATE_PARAMS)))
        .build();
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.desmos.posts.v3.MsgsProto.getDescriptor();
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
              .addMethod(getCreatePostMethod())
              .addMethod(getEditPostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getAddPostAttachmentMethod())
              .addMethod(getRemovePostAttachmentMethod())
              .addMethod(getAnswerPollMethod())
              .addMethod(getUpdateParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
