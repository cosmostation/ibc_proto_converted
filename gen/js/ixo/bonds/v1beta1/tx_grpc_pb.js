// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_bonds_v1beta1_tx_pb = require('../../../ixo/bonds/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var ixo_bonds_v1beta1_bonds_pb = require('../../../ixo/bonds/v1beta1/bonds_pb.js');

function serialize_ixo_bonds_v1beta1_MsgBuy(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgBuy)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgBuy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgBuy(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgBuy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgBuyResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgBuyResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgBuyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgBuyResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgBuyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgCreateBond(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgCreateBond)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgCreateBond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgCreateBond(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgCreateBond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgCreateBondResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgCreateBondResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgCreateBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgCreateBondResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgCreateBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgEditBond(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgEditBond)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgEditBond');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgEditBond(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgEditBond.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgEditBondResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgEditBondResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgEditBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgEditBondResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgEditBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgMakeOutcomePayment(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePayment)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgMakeOutcomePayment');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgMakeOutcomePayment(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePayment.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgMakeOutcomePaymentResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePaymentResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgMakeOutcomePaymentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgMakeOutcomePaymentResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePaymentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSell(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSell)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSell');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSell(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSell.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSellResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSellResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSellResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSellResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSellResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSetNextAlpha(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSetNextAlpha)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSetNextAlpha');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSetNextAlpha(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSetNextAlpha.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSetNextAlphaResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSetNextAlphaResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSetNextAlphaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSetNextAlphaResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSetNextAlphaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSwap(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSwap)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSwap');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSwap(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSwap.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgSwapResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgSwapResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgSwapResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgUpdateBondState(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgUpdateBondState)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgUpdateBondState');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgUpdateBondState(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgUpdateBondState.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgUpdateBondStateResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgUpdateBondStateResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgUpdateBondStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgUpdateBondStateResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgUpdateBondStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgWithdrawReserve(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserve)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgWithdrawReserve');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgWithdrawReserve(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserve.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgWithdrawReserveResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserveResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgWithdrawReserveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgWithdrawReserveResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgWithdrawShare(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgWithdrawShare)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgWithdrawShare');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgWithdrawShare(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgWithdrawShare.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_MsgWithdrawShareResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_tx_pb.MsgWithdrawShareResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.MsgWithdrawShareResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_MsgWithdrawShareResponse(buffer_arg) {
  return ixo_bonds_v1beta1_tx_pb.MsgWithdrawShareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bonds Msg service.
var MsgService = exports.MsgService = {
  // CreateBond defines a method for creating a bond.
createBond: {
    path: '/ixo.bonds.v1beta1.Msg/CreateBond',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgCreateBond,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgCreateBondResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgCreateBond,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgCreateBond,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgCreateBondResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgCreateBondResponse,
  },
  // EditBond defines a method for editing a bond.
editBond: {
    path: '/ixo.bonds.v1beta1.Msg/EditBond',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgEditBond,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgEditBondResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgEditBond,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgEditBond,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgEditBondResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgEditBondResponse,
  },
  // SetNextAlpha defines a method for editing a bond's alpha parameter.
setNextAlpha: {
    path: '/ixo.bonds.v1beta1.Msg/SetNextAlpha',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgSetNextAlpha,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgSetNextAlphaResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgSetNextAlpha,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgSetNextAlpha,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgSetNextAlphaResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgSetNextAlphaResponse,
  },
  // UpdateBondState defines a method for updating a bond's current state.
updateBondState: {
    path: '/ixo.bonds.v1beta1.Msg/UpdateBondState',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgUpdateBondState,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgUpdateBondStateResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgUpdateBondState,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgUpdateBondState,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgUpdateBondStateResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgUpdateBondStateResponse,
  },
  // Buy defines a method for buying from a bond.
buy: {
    path: '/ixo.bonds.v1beta1.Msg/Buy',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgBuy,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgBuyResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgBuy,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgBuy,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgBuyResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgBuyResponse,
  },
  // Sell defines a method for selling from a bond.
sell: {
    path: '/ixo.bonds.v1beta1.Msg/Sell',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgSell,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgSellResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgSell,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgSell,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgSellResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgSellResponse,
  },
  // Swap defines a method for swapping from one reserve bond token to another.
swap: {
    path: '/ixo.bonds.v1beta1.Msg/Swap',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgSwap,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgSwapResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgSwap,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgSwap,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgSwapResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgSwapResponse,
  },
  // MakeOutcomePayment defines a method for making an outcome payment to a
// bond.
makeOutcomePayment: {
    path: '/ixo.bonds.v1beta1.Msg/MakeOutcomePayment',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePayment,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgMakeOutcomePaymentResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgMakeOutcomePayment,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgMakeOutcomePayment,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgMakeOutcomePaymentResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgMakeOutcomePaymentResponse,
  },
  // WithdrawShare defines a method for withdrawing a share from a bond that is
// in the SETTLE stage.
withdrawShare: {
    path: '/ixo.bonds.v1beta1.Msg/WithdrawShare',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgWithdrawShare,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgWithdrawShareResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgWithdrawShare,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgWithdrawShare,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgWithdrawShareResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgWithdrawShareResponse,
  },
  // WithdrawReserve defines a method for withdrawing reserve from a bond.
withdrawReserve: {
    path: '/ixo.bonds.v1beta1.Msg/WithdrawReserve',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserve,
    responseType: ixo_bonds_v1beta1_tx_pb.MsgWithdrawReserveResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_MsgWithdrawReserve,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_MsgWithdrawReserve,
    responseSerialize: serialize_ixo_bonds_v1beta1_MsgWithdrawReserveResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_MsgWithdrawReserveResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
