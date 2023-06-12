// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_reactions_v1_msgs_pb = require('../../../desmos/reactions/v1/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var desmos_reactions_v1_models_pb = require('../../../desmos/reactions/v1/models_pb.js');

function serialize_desmos_reactions_v1_MsgAddReaction(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgAddReaction)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgAddReaction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgAddReaction(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgAddReaction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgAddReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgAddReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgAddReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgAddReactionResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgAddReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgAddRegisteredReaction(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgAddRegisteredReaction)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgAddRegisteredReaction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgAddRegisteredReaction(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgAddRegisteredReaction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgAddRegisteredReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgAddRegisteredReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgAddRegisteredReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgAddRegisteredReactionResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgAddRegisteredReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgEditRegisteredReaction(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgEditRegisteredReaction)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgEditRegisteredReaction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgEditRegisteredReaction(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgEditRegisteredReaction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgEditRegisteredReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgEditRegisteredReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgEditRegisteredReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgEditRegisteredReactionResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgEditRegisteredReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgRemoveReaction(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgRemoveReaction)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgRemoveReaction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgRemoveReaction(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgRemoveReaction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgRemoveReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgRemoveReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgRemoveReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgRemoveReactionResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgRemoveReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgRemoveRegisteredReaction(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReaction)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgRemoveRegisteredReaction');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgRemoveRegisteredReaction(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReaction.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgRemoveRegisteredReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgRemoveRegisteredReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgRemoveRegisteredReactionResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgSetReactionsParams(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgSetReactionsParams)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgSetReactionsParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgSetReactionsParams(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgSetReactionsParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_MsgSetReactionsParamsResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_msgs_pb.MsgSetReactionsParamsResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.MsgSetReactionsParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_MsgSetReactionsParamsResponse(buffer_arg) {
  return desmos_reactions_v1_msgs_pb.MsgSetReactionsParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the reactions Msg service.
var MsgService = exports.MsgService = {
  // AddReaction allows to add a post reaction
addReaction: {
    path: '/desmos.reactions.v1.Msg/AddReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgAddReaction,
    responseType: desmos_reactions_v1_msgs_pb.MsgAddReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgAddReaction,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgAddReaction,
    responseSerialize: serialize_desmos_reactions_v1_MsgAddReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgAddReactionResponse,
  },
  // RemoveReaction allows to remove an existing post reaction
removeReaction: {
    path: '/desmos.reactions.v1.Msg/RemoveReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgRemoveReaction,
    responseType: desmos_reactions_v1_msgs_pb.MsgRemoveReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgRemoveReaction,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgRemoveReaction,
    responseSerialize: serialize_desmos_reactions_v1_MsgRemoveReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgRemoveReactionResponse,
  },
  // AddRegisteredReaction allows to registered a new supported reaction
addRegisteredReaction: {
    path: '/desmos.reactions.v1.Msg/AddRegisteredReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgAddRegisteredReaction,
    responseType: desmos_reactions_v1_msgs_pb.MsgAddRegisteredReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgAddRegisteredReaction,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgAddRegisteredReaction,
    responseSerialize: serialize_desmos_reactions_v1_MsgAddRegisteredReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgAddRegisteredReactionResponse,
  },
  // EditRegisteredReaction allows to edit a registered reaction
editRegisteredReaction: {
    path: '/desmos.reactions.v1.Msg/EditRegisteredReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgEditRegisteredReaction,
    responseType: desmos_reactions_v1_msgs_pb.MsgEditRegisteredReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgEditRegisteredReaction,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgEditRegisteredReaction,
    responseSerialize: serialize_desmos_reactions_v1_MsgEditRegisteredReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgEditRegisteredReactionResponse,
  },
  // RemoveRegisteredReaction allows to remove an existing supported reaction
removeRegisteredReaction: {
    path: '/desmos.reactions.v1.Msg/RemoveRegisteredReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReaction,
    responseType: desmos_reactions_v1_msgs_pb.MsgRemoveRegisteredReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgRemoveRegisteredReaction,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgRemoveRegisteredReaction,
    responseSerialize: serialize_desmos_reactions_v1_MsgRemoveRegisteredReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgRemoveRegisteredReactionResponse,
  },
  // SetReactionsParams allows to set the reactions params
setReactionsParams: {
    path: '/desmos.reactions.v1.Msg/SetReactionsParams',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_msgs_pb.MsgSetReactionsParams,
    responseType: desmos_reactions_v1_msgs_pb.MsgSetReactionsParamsResponse,
    requestSerialize: serialize_desmos_reactions_v1_MsgSetReactionsParams,
    requestDeserialize: deserialize_desmos_reactions_v1_MsgSetReactionsParams,
    responseSerialize: serialize_desmos_reactions_v1_MsgSetReactionsParamsResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_MsgSetReactionsParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
