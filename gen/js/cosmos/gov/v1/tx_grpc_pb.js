// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.46
'use strict';
var grpc = require('grpc');
var cosmos_gov_v1_tx_pb = require('../../../cosmos/gov/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_gov_v1_gov_pb = require('../../../cosmos/gov/v1/gov_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_cosmos_gov_v1_MsgCancelProposal(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgCancelProposal)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgCancelProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgCancelProposal(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgCancelProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgCancelProposalResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgCancelProposalResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgCancelProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgCancelProposalResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgCancelProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgDeposit(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgDeposit(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgDepositResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgDepositResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgExecLegacyContent(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgExecLegacyContent)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgExecLegacyContent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgExecLegacyContent(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgExecLegacyContent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgExecLegacyContentResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgExecLegacyContentResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgExecLegacyContentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgExecLegacyContentResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgExecLegacyContentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgSubmitProposal(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgSubmitProposal)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgSubmitProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgSubmitProposal(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgSubmitProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgSubmitProposalResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgSubmitProposalResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgSubmitProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgSubmitProposalResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgSubmitProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgUpdateParams(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgVote(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgVote)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgVote(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgVoteResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgVoteResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgVoteResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgVoteWeighted(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgVoteWeighted)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgVoteWeighted');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgVoteWeighted(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgVoteWeighted.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_gov_v1_MsgVoteWeightedResponse(arg) {
  if (!(arg instanceof cosmos_gov_v1_tx_pb.MsgVoteWeightedResponse)) {
    throw new Error('Expected argument of type cosmos.gov.v1.MsgVoteWeightedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_gov_v1_MsgVoteWeightedResponse(buffer_arg) {
  return cosmos_gov_v1_tx_pb.MsgVoteWeightedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the gov Msg service.
var MsgService = exports.MsgService = {
  // SubmitProposal defines a method to create new proposal given the messages.
submitProposal: {
    path: '/cosmos.gov.v1.Msg/SubmitProposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgSubmitProposal,
    responseType: cosmos_gov_v1_tx_pb.MsgSubmitProposalResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgSubmitProposal,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgSubmitProposal,
    responseSerialize: serialize_cosmos_gov_v1_MsgSubmitProposalResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgSubmitProposalResponse,
  },
  // ExecLegacyContent defines a Msg to be in included in a MsgSubmitProposal
// to execute a legacy content-based proposal.
execLegacyContent: {
    path: '/cosmos.gov.v1.Msg/ExecLegacyContent',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgExecLegacyContent,
    responseType: cosmos_gov_v1_tx_pb.MsgExecLegacyContentResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgExecLegacyContent,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgExecLegacyContent,
    responseSerialize: serialize_cosmos_gov_v1_MsgExecLegacyContentResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgExecLegacyContentResponse,
  },
  // Vote defines a method to add a vote on a specific proposal.
vote: {
    path: '/cosmos.gov.v1.Msg/Vote',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgVote,
    responseType: cosmos_gov_v1_tx_pb.MsgVoteResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgVote,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgVote,
    responseSerialize: serialize_cosmos_gov_v1_MsgVoteResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgVoteResponse,
  },
  // VoteWeighted defines a method to add a weighted vote on a specific proposal.
voteWeighted: {
    path: '/cosmos.gov.v1.Msg/VoteWeighted',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgVoteWeighted,
    responseType: cosmos_gov_v1_tx_pb.MsgVoteWeightedResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgVoteWeighted,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgVoteWeighted,
    responseSerialize: serialize_cosmos_gov_v1_MsgVoteWeightedResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgVoteWeightedResponse,
  },
  // Deposit defines a method to add deposit on a specific proposal.
deposit: {
    path: '/cosmos.gov.v1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgDeposit,
    responseType: cosmos_gov_v1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgDeposit,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgDeposit,
    responseSerialize: serialize_cosmos_gov_v1_MsgDepositResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgDepositResponse,
  },
  // UpdateParams defines a governance operation for updating the x/gov module
// parameters. The authority is defined in the keeper.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.gov.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgUpdateParams,
    responseType: cosmos_gov_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_gov_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgUpdateParamsResponse,
  },
  // CancelProposal defines a method to cancel governance proposal
//
// Since: cosmos-sdk 0.50
cancelProposal: {
    path: '/cosmos.gov.v1.Msg/CancelProposal',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_gov_v1_tx_pb.MsgCancelProposal,
    responseType: cosmos_gov_v1_tx_pb.MsgCancelProposalResponse,
    requestSerialize: serialize_cosmos_gov_v1_MsgCancelProposal,
    requestDeserialize: deserialize_cosmos_gov_v1_MsgCancelProposal,
    responseSerialize: serialize_cosmos_gov_v1_MsgCancelProposalResponse,
    responseDeserialize: deserialize_cosmos_gov_v1_MsgCancelProposalResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
