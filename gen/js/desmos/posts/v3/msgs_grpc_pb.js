// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_posts_v3_msgs_pb = require('../../../desmos/posts/v3/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var desmos_posts_v3_models_pb = require('../../../desmos/posts/v3/models_pb.js');

function serialize_desmos_posts_v3_MsgAddPostAttachment(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgAddPostAttachment)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgAddPostAttachment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgAddPostAttachment(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgAddPostAttachment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgAddPostAttachmentResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgAddPostAttachmentResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgAddPostAttachmentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgAddPostAttachmentResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgAddPostAttachmentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgAnswerPoll(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgAnswerPoll)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgAnswerPoll');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgAnswerPoll(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgAnswerPoll.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgAnswerPollResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgAnswerPollResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgAnswerPollResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgAnswerPollResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgAnswerPollResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgCreatePost(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgCreatePost)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgCreatePost');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgCreatePost(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgCreatePost.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgCreatePostResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgCreatePostResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgCreatePostResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgCreatePostResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgCreatePostResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgDeletePost(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgDeletePost)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgDeletePost');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgDeletePost(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgDeletePost.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgDeletePostResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgDeletePostResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgDeletePostResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgDeletePostResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgDeletePostResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgEditPost(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgEditPost)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgEditPost');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgEditPost(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgEditPost.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgEditPostResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgEditPostResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgEditPostResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgEditPostResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgEditPostResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgRemovePostAttachment(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgRemovePostAttachment)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgRemovePostAttachment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgRemovePostAttachment(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgRemovePostAttachment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgRemovePostAttachmentResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgRemovePostAttachmentResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgRemovePostAttachmentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgRemovePostAttachmentResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgRemovePostAttachmentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgUpdateParams(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgUpdateParams(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_msgs_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_MsgUpdateParamsResponse(buffer_arg) {
  return desmos_posts_v3_msgs_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the posts Msg service.
var MsgService = exports.MsgService = {
  // CreatePost allows to create a new post
createPost: {
    path: '/desmos.posts.v3.Msg/CreatePost',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgCreatePost,
    responseType: desmos_posts_v3_msgs_pb.MsgCreatePostResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgCreatePost,
    requestDeserialize: deserialize_desmos_posts_v3_MsgCreatePost,
    responseSerialize: serialize_desmos_posts_v3_MsgCreatePostResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgCreatePostResponse,
  },
  // EditPost allows to edit an existing post
editPost: {
    path: '/desmos.posts.v3.Msg/EditPost',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgEditPost,
    responseType: desmos_posts_v3_msgs_pb.MsgEditPostResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgEditPost,
    requestDeserialize: deserialize_desmos_posts_v3_MsgEditPost,
    responseSerialize: serialize_desmos_posts_v3_MsgEditPostResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgEditPostResponse,
  },
  // DeletePost allows to delete an existing post
deletePost: {
    path: '/desmos.posts.v3.Msg/DeletePost',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgDeletePost,
    responseType: desmos_posts_v3_msgs_pb.MsgDeletePostResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgDeletePost,
    requestDeserialize: deserialize_desmos_posts_v3_MsgDeletePost,
    responseSerialize: serialize_desmos_posts_v3_MsgDeletePostResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgDeletePostResponse,
  },
  // AddPostAttachment allows to add a new attachment to a post
addPostAttachment: {
    path: '/desmos.posts.v3.Msg/AddPostAttachment',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgAddPostAttachment,
    responseType: desmos_posts_v3_msgs_pb.MsgAddPostAttachmentResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgAddPostAttachment,
    requestDeserialize: deserialize_desmos_posts_v3_MsgAddPostAttachment,
    responseSerialize: serialize_desmos_posts_v3_MsgAddPostAttachmentResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgAddPostAttachmentResponse,
  },
  // RemovePostAttachment allows to remove an attachment from a post
removePostAttachment: {
    path: '/desmos.posts.v3.Msg/RemovePostAttachment',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgRemovePostAttachment,
    responseType: desmos_posts_v3_msgs_pb.MsgRemovePostAttachmentResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgRemovePostAttachment,
    requestDeserialize: deserialize_desmos_posts_v3_MsgRemovePostAttachment,
    responseSerialize: serialize_desmos_posts_v3_MsgRemovePostAttachmentResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgRemovePostAttachmentResponse,
  },
  // AnswerPoll allows to answer a post poll
answerPoll: {
    path: '/desmos.posts.v3.Msg/AnswerPoll',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgAnswerPoll,
    responseType: desmos_posts_v3_msgs_pb.MsgAnswerPollResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgAnswerPoll,
    requestDeserialize: deserialize_desmos_posts_v3_MsgAnswerPoll,
    responseSerialize: serialize_desmos_posts_v3_MsgAnswerPollResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgAnswerPollResponse,
  },
  // UpdateParams defines a (governance) operation for updating the module
// parameters.
// The authority defaults to the x/gov module account.
//
// Since: Desmos 5.0.0
updateParams: {
    path: '/desmos.posts.v3.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_msgs_pb.MsgUpdateParams,
    responseType: desmos_posts_v3_msgs_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_desmos_posts_v3_MsgUpdateParams,
    requestDeserialize: deserialize_desmos_posts_v3_MsgUpdateParams,
    responseSerialize: serialize_desmos_posts_v3_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_desmos_posts_v3_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
