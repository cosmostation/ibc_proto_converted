// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_relationships_v1_msgs_pb = require('../../../desmos/relationships/v1/msgs_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_desmos_relationships_v1_MsgBlockUser(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgBlockUser)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgBlockUser');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgBlockUser(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgBlockUser.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgBlockUserResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgBlockUserResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgBlockUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgBlockUserResponse(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgBlockUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgCreateRelationship(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgCreateRelationship)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgCreateRelationship');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgCreateRelationship(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgCreateRelationship.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgCreateRelationshipResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgCreateRelationshipResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgCreateRelationshipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgCreateRelationshipResponse(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgCreateRelationshipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgDeleteRelationship(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgDeleteRelationship)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgDeleteRelationship');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgDeleteRelationship(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgDeleteRelationship.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgDeleteRelationshipResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgDeleteRelationshipResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgDeleteRelationshipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgDeleteRelationshipResponse(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgDeleteRelationshipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgUnblockUser(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgUnblockUser)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgUnblockUser');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgUnblockUser(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgUnblockUser.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_relationships_v1_MsgUnblockUserResponse(arg) {
  if (!(arg instanceof desmos_relationships_v1_msgs_pb.MsgUnblockUserResponse)) {
    throw new Error('Expected argument of type desmos.relationships.v1.MsgUnblockUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_relationships_v1_MsgUnblockUserResponse(buffer_arg) {
  return desmos_relationships_v1_msgs_pb.MsgUnblockUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the relationships Msg service.
var MsgService = exports.MsgService = {
  // CreateRelationship defines a method for creating a new relationship
createRelationship: {
    path: '/desmos.relationships.v1.Msg/CreateRelationship',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_msgs_pb.MsgCreateRelationship,
    responseType: desmos_relationships_v1_msgs_pb.MsgCreateRelationshipResponse,
    requestSerialize: serialize_desmos_relationships_v1_MsgCreateRelationship,
    requestDeserialize: deserialize_desmos_relationships_v1_MsgCreateRelationship,
    responseSerialize: serialize_desmos_relationships_v1_MsgCreateRelationshipResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_MsgCreateRelationshipResponse,
  },
  // DeleteRelationship defines a method for deleting a relationship
deleteRelationship: {
    path: '/desmos.relationships.v1.Msg/DeleteRelationship',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_msgs_pb.MsgDeleteRelationship,
    responseType: desmos_relationships_v1_msgs_pb.MsgDeleteRelationshipResponse,
    requestSerialize: serialize_desmos_relationships_v1_MsgDeleteRelationship,
    requestDeserialize: deserialize_desmos_relationships_v1_MsgDeleteRelationship,
    responseSerialize: serialize_desmos_relationships_v1_MsgDeleteRelationshipResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_MsgDeleteRelationshipResponse,
  },
  // BlockUser defines a method for blocking a user
blockUser: {
    path: '/desmos.relationships.v1.Msg/BlockUser',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_msgs_pb.MsgBlockUser,
    responseType: desmos_relationships_v1_msgs_pb.MsgBlockUserResponse,
    requestSerialize: serialize_desmos_relationships_v1_MsgBlockUser,
    requestDeserialize: deserialize_desmos_relationships_v1_MsgBlockUser,
    responseSerialize: serialize_desmos_relationships_v1_MsgBlockUserResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_MsgBlockUserResponse,
  },
  // UnblockUser defines a method for unblocking a user
unblockUser: {
    path: '/desmos.relationships.v1.Msg/UnblockUser',
    requestStream: false,
    responseStream: false,
    requestType: desmos_relationships_v1_msgs_pb.MsgUnblockUser,
    responseType: desmos_relationships_v1_msgs_pb.MsgUnblockUserResponse,
    requestSerialize: serialize_desmos_relationships_v1_MsgUnblockUser,
    requestDeserialize: deserialize_desmos_relationships_v1_MsgUnblockUser,
    responseSerialize: serialize_desmos_relationships_v1_MsgUnblockUserResponse,
    responseDeserialize: deserialize_desmos_relationships_v1_MsgUnblockUserResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
