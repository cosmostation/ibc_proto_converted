// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_incentive_v1_tx_pb = require('../../../umee/incentive/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var umee_incentive_v1_incentive_pb = require('../../../umee/incentive/v1/incentive_pb.js');

function serialize_umee_incentive_v1_MsgBeginUnbonding(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgBeginUnbonding)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgBeginUnbonding');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgBeginUnbonding(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgBeginUnbonding.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgBeginUnbondingResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgBeginUnbondingResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgBeginUnbondingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgBeginUnbondingResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgBeginUnbondingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgBond(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgBond)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgBond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgBond(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgBond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgBondResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgBondResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgBondResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgClaim(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgClaim)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgClaim');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgClaim(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgClaim.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgClaimResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgClaimResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgClaimResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgEmergencyUnbond(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgEmergencyUnbond)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgEmergencyUnbond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgEmergencyUnbond(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgEmergencyUnbond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgEmergencyUnbondResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgEmergencyUnbondResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgEmergencyUnbondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgEmergencyUnbondResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgEmergencyUnbondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgGovCreatePrograms(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgGovCreatePrograms)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgGovCreatePrograms');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgGovCreatePrograms(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgGovCreatePrograms.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgGovCreateProgramsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgGovCreateProgramsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgGovCreateProgramsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgGovCreateProgramsResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgGovCreateProgramsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgGovSetParams(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgGovSetParams)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgGovSetParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgGovSetParams(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgGovSetParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgGovSetParamsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgGovSetParamsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgGovSetParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgGovSetParamsResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgGovSetParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgSponsor(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgSponsor)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgSponsor');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgSponsor(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgSponsor.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_MsgSponsorResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_tx_pb.MsgSponsorResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.MsgSponsorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_MsgSponsorResponse(buffer_arg) {
  return umee_incentive_v1_tx_pb.MsgSponsorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/incentive module's Msg service.
var MsgService = exports.MsgService = {
  // Claim defines a method for claiming any pending incentive rewards.
claim: {
    path: '/umee.incentive.v1.Msg/Claim',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgClaim,
    responseType: umee_incentive_v1_tx_pb.MsgClaimResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgClaim,
    requestDeserialize: deserialize_umee_incentive_v1_MsgClaim,
    responseSerialize: serialize_umee_incentive_v1_MsgClaimResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgClaimResponse,
  },
  // Bond defines a method for bonding uToken collateral.
bond: {
    path: '/umee.incentive.v1.Msg/Bond',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgBond,
    responseType: umee_incentive_v1_tx_pb.MsgBondResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgBond,
    requestDeserialize: deserialize_umee_incentive_v1_MsgBond,
    responseSerialize: serialize_umee_incentive_v1_MsgBondResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgBondResponse,
  },
  // BeginUnbonding defines a method for starting to unbond uToken collateral.
// Only max_unbondings unbondings can be active at per user, per denom, at once.
beginUnbonding: {
    path: '/umee.incentive.v1.Msg/BeginUnbonding',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgBeginUnbonding,
    responseType: umee_incentive_v1_tx_pb.MsgBeginUnbondingResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgBeginUnbonding,
    requestDeserialize: deserialize_umee_incentive_v1_MsgBeginUnbonding,
    responseSerialize: serialize_umee_incentive_v1_MsgBeginUnbondingResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgBeginUnbondingResponse,
  },
  // EmergencyUnbond defines a method for instantly unbonding uToken collateral in exchange for a fee.
// This can finish existing unbondings or unbond bonded tokens, and is not restricted by max_unbondings.
emergencyUnbond: {
    path: '/umee.incentive.v1.Msg/EmergencyUnbond',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgEmergencyUnbond,
    responseType: umee_incentive_v1_tx_pb.MsgEmergencyUnbondResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgEmergencyUnbond,
    requestDeserialize: deserialize_umee_incentive_v1_MsgEmergencyUnbond,
    responseSerialize: serialize_umee_incentive_v1_MsgEmergencyUnbondResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgEmergencyUnbondResponse,
  },
  // Sponsor defines a permissionless method for sponsoring an upcoming, not yet funded incentive program.
// The sponsor must be a single account and the MsgSponsor must fully cover the expected program rewards.
sponsor: {
    path: '/umee.incentive.v1.Msg/Sponsor',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgSponsor,
    responseType: umee_incentive_v1_tx_pb.MsgSponsorResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgSponsor,
    requestDeserialize: deserialize_umee_incentive_v1_MsgSponsor,
    responseSerialize: serialize_umee_incentive_v1_MsgSponsorResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgSponsorResponse,
  },
  // GovSetParams is used by governance proposals to update parameters.
govSetParams: {
    path: '/umee.incentive.v1.Msg/GovSetParams',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgGovSetParams,
    responseType: umee_incentive_v1_tx_pb.MsgGovSetParamsResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgGovSetParams,
    requestDeserialize: deserialize_umee_incentive_v1_MsgGovSetParams,
    responseSerialize: serialize_umee_incentive_v1_MsgGovSetParamsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgGovSetParamsResponse,
  },
  // GovCreatePrograms is used by governance proposals to create and optionally fund incentive programs.
govCreatePrograms: {
    path: '/umee.incentive.v1.Msg/GovCreatePrograms',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_tx_pb.MsgGovCreatePrograms,
    responseType: umee_incentive_v1_tx_pb.MsgGovCreateProgramsResponse,
    requestSerialize: serialize_umee_incentive_v1_MsgGovCreatePrograms,
    requestDeserialize: deserialize_umee_incentive_v1_MsgGovCreatePrograms,
    responseSerialize: serialize_umee_incentive_v1_MsgGovCreateProgramsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_MsgGovCreateProgramsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
