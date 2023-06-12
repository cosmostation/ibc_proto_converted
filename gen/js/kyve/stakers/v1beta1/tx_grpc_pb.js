// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_stakers_v1beta1_tx_pb = require('../../../kyve/stakers/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kyve_stakers_v1beta1_MsgClaimCommissionRewards(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewards)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgClaimCommissionRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgClaimCommissionRewards(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgClaimCommissionRewardsResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewardsResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgClaimCommissionRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgClaimCommissionRewardsResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgCreateStaker(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgCreateStaker)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgCreateStaker');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgCreateStaker(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgCreateStaker.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgCreateStakerResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgCreateStakerResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgCreateStakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgCreateStakerResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgCreateStakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgJoinPool(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgJoinPool)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgJoinPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgJoinPool(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgJoinPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgJoinPoolResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgJoinPoolResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgJoinPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgJoinPoolResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgJoinPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgLeavePool(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgLeavePool)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgLeavePool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgLeavePool(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgLeavePool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgLeavePoolResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgLeavePoolResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgLeavePoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgLeavePoolResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgLeavePoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateCommission(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateCommission)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateCommission');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateCommission(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateCommission.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateCommissionResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateCommissionResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateCommissionResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateMetadata(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadata)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateMetadata');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateMetadata(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadata.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateMetadataResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadataResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateMetadataResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateParams(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_stakers_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof kyve_stakers_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type kyve.stakers.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_stakers_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return kyve_stakers_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreateStaker ...
createStaker: {
    path: '/kyve.stakers.v1beta1.Msg/CreateStaker',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgCreateStaker,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgCreateStakerResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgCreateStaker,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgCreateStaker,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgCreateStakerResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgCreateStakerResponse,
  },
  // UpdateMetadata ...
updateMetadata: {
    path: '/kyve.stakers.v1beta1.Msg/UpdateMetadata',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadata,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgUpdateMetadataResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateMetadata,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateMetadata,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateMetadataResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateMetadataResponse,
  },
  // UpdateCommission ...
updateCommission: {
    path: '/kyve.stakers.v1beta1.Msg/UpdateCommission',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgUpdateCommission,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgUpdateCommissionResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateCommission,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateCommission,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateCommissionResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateCommissionResponse,
  },
  // ClaimCommissionRewards ...
claimCommissionRewards: {
    path: '/kyve.stakers.v1beta1.Msg/ClaimCommissionRewards',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewards,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgClaimCommissionRewardsResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgClaimCommissionRewards,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgClaimCommissionRewards,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgClaimCommissionRewardsResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgClaimCommissionRewardsResponse,
  },
  // JoinPool ...
joinPool: {
    path: '/kyve.stakers.v1beta1.Msg/JoinPool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgJoinPool,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgJoinPoolResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgJoinPool,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgJoinPool,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgJoinPoolResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgJoinPoolResponse,
  },
  // LeavePool ...
leavePool: {
    path: '/kyve.stakers.v1beta1.Msg/LeavePool',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgLeavePool,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgLeavePoolResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgLeavePool,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgLeavePool,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgLeavePoolResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgLeavePoolResponse,
  },
  // UpdateParams defines a governance operation for updating the x/stakers module
// parameters. The authority is hard-coded to the x/gov module account.
updateParams: {
    path: '/kyve.stakers.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: kyve_stakers_v1beta1_tx_pb.MsgUpdateParams,
    responseType: kyve_stakers_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_kyve_stakers_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_kyve_stakers_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
