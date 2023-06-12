// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_bundles_v1beta1_tx_pb = require('../../../kyve/bundles/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kyve_bundles_v1beta1_MsgClaimUploaderRole(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRole)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgClaimUploaderRole');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgClaimUploaderRole(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRole.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgClaimUploaderRoleResponse(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRoleResponse)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgClaimUploaderRoleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgClaimUploaderRoleResponse(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRoleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgSkipUploaderRole(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRole)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgSkipUploaderRole');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgSkipUploaderRole(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRole.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgSkipUploaderRoleResponse(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRoleResponse)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgSkipUploaderRoleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgSkipUploaderRoleResponse(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRoleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgSubmitBundleProposal(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposal)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgSubmitBundleProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgSubmitBundleProposal(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgSubmitBundleProposalResponse(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposalResponse)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgSubmitBundleProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgSubmitBundleProposalResponse(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgUpdateParams(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgVoteBundleProposal(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposal)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgVoteBundleProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgVoteBundleProposal(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_bundles_v1beta1_MsgVoteBundleProposalResponse(arg) {
  if (!(arg instanceof kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposalResponse)) {
    throw new Error('Expected argument of type kyve.bundles.v1beta1.MsgVoteBundleProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_bundles_v1beta1_MsgVoteBundleProposalResponse(buffer_arg) {
  return kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // SubmitBundleProposal ...
submitBundleProposal: {
    path: '/kyve.bundles.v1beta1.Msg/SubmitBundleProposal',
    requestStream: false,
    responseStream: false,
    requestType: kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposal,
    responseType: kyve_bundles_v1beta1_tx_pb.MsgSubmitBundleProposalResponse,
    requestSerialize: serialize_kyve_bundles_v1beta1_MsgSubmitBundleProposal,
    requestDeserialize: deserialize_kyve_bundles_v1beta1_MsgSubmitBundleProposal,
    responseSerialize: serialize_kyve_bundles_v1beta1_MsgSubmitBundleProposalResponse,
    responseDeserialize: deserialize_kyve_bundles_v1beta1_MsgSubmitBundleProposalResponse,
  },
  // VoteBundleProposal ...
voteBundleProposal: {
    path: '/kyve.bundles.v1beta1.Msg/VoteBundleProposal',
    requestStream: false,
    responseStream: false,
    requestType: kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposal,
    responseType: kyve_bundles_v1beta1_tx_pb.MsgVoteBundleProposalResponse,
    requestSerialize: serialize_kyve_bundles_v1beta1_MsgVoteBundleProposal,
    requestDeserialize: deserialize_kyve_bundles_v1beta1_MsgVoteBundleProposal,
    responseSerialize: serialize_kyve_bundles_v1beta1_MsgVoteBundleProposalResponse,
    responseDeserialize: deserialize_kyve_bundles_v1beta1_MsgVoteBundleProposalResponse,
  },
  // ClaimUploaderRole ...
claimUploaderRole: {
    path: '/kyve.bundles.v1beta1.Msg/ClaimUploaderRole',
    requestStream: false,
    responseStream: false,
    requestType: kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRole,
    responseType: kyve_bundles_v1beta1_tx_pb.MsgClaimUploaderRoleResponse,
    requestSerialize: serialize_kyve_bundles_v1beta1_MsgClaimUploaderRole,
    requestDeserialize: deserialize_kyve_bundles_v1beta1_MsgClaimUploaderRole,
    responseSerialize: serialize_kyve_bundles_v1beta1_MsgClaimUploaderRoleResponse,
    responseDeserialize: deserialize_kyve_bundles_v1beta1_MsgClaimUploaderRoleResponse,
  },
  // SkipUploaderRole ...
skipUploaderRole: {
    path: '/kyve.bundles.v1beta1.Msg/SkipUploaderRole',
    requestStream: false,
    responseStream: false,
    requestType: kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRole,
    responseType: kyve_bundles_v1beta1_tx_pb.MsgSkipUploaderRoleResponse,
    requestSerialize: serialize_kyve_bundles_v1beta1_MsgSkipUploaderRole,
    requestDeserialize: deserialize_kyve_bundles_v1beta1_MsgSkipUploaderRole,
    responseSerialize: serialize_kyve_bundles_v1beta1_MsgSkipUploaderRoleResponse,
    responseDeserialize: deserialize_kyve_bundles_v1beta1_MsgSkipUploaderRoleResponse,
  },
  // UpdateParams defines a governance operation for updating the x/bundles module
// parameters. The authority is hard-coded to the x/gov module account.
updateParams: {
    path: '/kyve.bundles.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: kyve_bundles_v1beta1_tx_pb.MsgUpdateParams,
    responseType: kyve_bundles_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_kyve_bundles_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_kyve_bundles_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_kyve_bundles_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_kyve_bundles_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
