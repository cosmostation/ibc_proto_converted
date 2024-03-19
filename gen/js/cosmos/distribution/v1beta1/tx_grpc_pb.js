// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_distribution_v1beta1_tx_pb = require('../../../cosmos/distribution/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_distribution_v1beta1_distribution_pb = require('../../../cosmos/distribution/v1beta1/distribution_pb.js');

function serialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpend(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpend)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgCommunityPoolSpend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpend(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpendResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgCommunityPoolSpendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgFundCommunityPool(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPool)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgFundCommunityPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgFundCommunityPool(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPoolResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgFundCommunityPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddress(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddress)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgSetWithdrawAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddress(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddressResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgSetWithdrawAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgUpdateParams(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordReward(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordReward)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawAllTokenizeShareRecordReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordReward(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordRewardResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordRewardResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawAllTokenizeShareRecordRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordRewardResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorReward)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawDelegatorReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorRewardResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawDelegatorRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordReward(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordReward)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawTokenizeShareRecordReward');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordReward(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordReward.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordRewardResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordRewardResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawTokenizeShareRecordRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordRewardResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommission)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawValidatorCommission');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommission.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse(arg) {
  if (!(arg instanceof cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommissionResponse)) {
    throw new Error('Expected argument of type cosmos.distribution.v1beta1.MsgWithdrawValidatorCommissionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse(buffer_arg) {
  return cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommissionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the distribution Msg service.
var MsgService = exports.MsgService = {
  // SetWithdrawAddress defines a method to change the withdraw address
// for a delegator (or validator self-delegation).
setWithdrawAddress: {
    path: '/cosmos.distribution.v1beta1.Msg/SetWithdrawAddress',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddress,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgSetWithdrawAddressResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddress,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddress,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgSetWithdrawAddressResponse,
  },
  // WithdrawDelegatorReward defines a method to withdraw rewards of delegator
// from a single validator.
withdrawDelegatorReward: {
    path: '/cosmos.distribution.v1beta1.Msg/WithdrawDelegatorReward',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorReward,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawDelegatorRewardResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorReward,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawDelegatorRewardResponse,
  },
  // WithdrawValidatorCommission defines a method to withdraw the
// full commission to the validator address.
withdrawValidatorCommission: {
    path: '/cosmos.distribution.v1beta1.Msg/WithdrawValidatorCommission',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommission,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawValidatorCommissionResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommission,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawValidatorCommissionResponse,
  },
  // FundCommunityPool defines a method to allow an account to directly
// fund the community pool.
fundCommunityPool: {
    path: '/cosmos.distribution.v1beta1.Msg/FundCommunityPool',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPool,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgFundCommunityPoolResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgFundCommunityPool,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgFundCommunityPool,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgFundCommunityPoolResponse,
  },
  // UpdateParams defines a governance operation for updating the x/distribution
// module parameters. The authority is defined in the keeper.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.distribution.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgUpdateParams,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgUpdateParamsResponse,
  },
  // CommunityPoolSpend defines a governance operation for sending tokens from
// the community pool in the x/distribution module to another account, which
// could be the governance module itself. The authority is defined in the
// keeper.
//
// Since: cosmos-sdk 0.47
communityPoolSpend: {
    path: '/cosmos.distribution.v1beta1.Msg/CommunityPoolSpend',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpend,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgCommunityPoolSpendResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpend,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpend,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgCommunityPoolSpendResponse,
  },
  // WithdrawTokenizeShareRecordReward defines a method to withdraw reward for an owning TokenizeShareRecord
withdrawTokenizeShareRecordReward: {
    path: '/cosmos.distribution.v1beta1.Msg/WithdrawTokenizeShareRecordReward',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordReward,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawTokenizeShareRecordRewardResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordReward,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordReward,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordRewardResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawTokenizeShareRecordRewardResponse,
  },
  // WithdrawAllTokenizeShareRecordReward defines a method to withdraw reward for all owning TokenizeShareRecord
withdrawAllTokenizeShareRecordReward: {
    path: '/cosmos.distribution.v1beta1.Msg/WithdrawAllTokenizeShareRecordReward',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordReward,
    responseType: cosmos_distribution_v1beta1_tx_pb.MsgWithdrawAllTokenizeShareRecordRewardResponse,
    requestSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordReward,
    requestDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordReward,
    responseSerialize: serialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordRewardResponse,
    responseDeserialize: deserialize_cosmos_distribution_v1beta1_MsgWithdrawAllTokenizeShareRecordRewardResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
