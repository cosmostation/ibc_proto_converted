// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_leverage_v1_tx_pb = require('../../../umee/leverage/v1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var umee_leverage_v1_leverage_pb = require('../../../umee/leverage/v1/leverage_pb.js');

function serialize_umee_leverage_v1_MsgBorrow(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgBorrow)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgBorrow(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgBorrowResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgBorrowResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgBorrowResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgCollateralize(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgCollateralize)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgCollateralize');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgCollateralize(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgCollateralize.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgCollateralizeResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgCollateralizeResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgCollateralizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgCollateralizeResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgCollateralizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgDecollateralize(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgDecollateralize)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgDecollateralize');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgDecollateralize(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgDecollateralize.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgDecollateralizeResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgDecollateralizeResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgDecollateralizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgDecollateralizeResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgDecollateralizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgGovUpdateRegistry(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgGovUpdateRegistry)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgGovUpdateRegistry');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgGovUpdateRegistry(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgGovUpdateRegistry.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgGovUpdateRegistryResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgGovUpdateRegistryResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgGovUpdateRegistryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgGovUpdateRegistryResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgGovUpdateRegistryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgLiquidate(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgLiquidate)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgLiquidate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgLiquidate(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgLiquidate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgLiquidateResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgLiquidateResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgLiquidateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgLiquidateResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgLiquidateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgMaxBorrow(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgMaxBorrow)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgMaxBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgMaxBorrow(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgMaxBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgMaxBorrowResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgMaxBorrowResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgMaxBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgMaxBorrowResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgMaxBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgMaxWithdraw(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgMaxWithdraw)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgMaxWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgMaxWithdraw(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgMaxWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgMaxWithdrawResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgMaxWithdrawResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgMaxWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgMaxWithdrawResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgMaxWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgRepay(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgRepay)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgRepay');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgRepay(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgRepay.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgRepayResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgRepayResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgRepayResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgRepayResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgRepayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgSupply(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgSupply)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgSupply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgSupply(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgSupply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgSupplyCollateral(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgSupplyCollateral)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgSupplyCollateral');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgSupplyCollateral(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgSupplyCollateral.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgSupplyCollateralResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgSupplyCollateralResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgSupplyCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgSupplyCollateralResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgSupplyCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgSupplyResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgSupplyResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgSupplyResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgWithdraw(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgWithdraw(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_leverage_v1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof umee_leverage_v1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type umee.leverage.v1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_leverage_v1_MsgWithdrawResponse(buffer_arg) {
  return umee_leverage_v1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/leverage module's Msg service.
var MsgService = exports.MsgService = {
  // Supply moves tokens from user balance to the module for lending or collateral.
// The user receives uTokens in return.
supply: {
    path: '/umee.leverage.v1.Msg/Supply',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgSupply,
    responseType: umee_leverage_v1_tx_pb.MsgSupplyResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgSupply,
    requestDeserialize: deserialize_umee_leverage_v1_MsgSupply,
    responseSerialize: serialize_umee_leverage_v1_MsgSupplyResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgSupplyResponse,
  },
  // Withdraw moves previously supplied tokens from the module back to the user balance in
// exchange for burning uTokens.
withdraw: {
    path: '/umee.leverage.v1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgWithdraw,
    responseType: umee_leverage_v1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgWithdraw,
    requestDeserialize: deserialize_umee_leverage_v1_MsgWithdraw,
    responseSerialize: serialize_umee_leverage_v1_MsgWithdrawResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgWithdrawResponse,
  },
  // MaxWithdraw moves previously supplied tokens from the module back to the user balance in
// exchange for burning uTokens. It automatically calculates the maximum valid amount to withdraw.
// Zero is returned if no more tokens can be withdrawn.
maxWithdraw: {
    path: '/umee.leverage.v1.Msg/MaxWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgMaxWithdraw,
    responseType: umee_leverage_v1_tx_pb.MsgMaxWithdrawResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgMaxWithdraw,
    requestDeserialize: deserialize_umee_leverage_v1_MsgMaxWithdraw,
    responseSerialize: serialize_umee_leverage_v1_MsgMaxWithdrawResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgMaxWithdrawResponse,
  },
  // Collateralize enables selected uTokens as collateral, which moves them to the module.
collateralize: {
    path: '/umee.leverage.v1.Msg/Collateralize',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgCollateralize,
    responseType: umee_leverage_v1_tx_pb.MsgCollateralizeResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgCollateralize,
    requestDeserialize: deserialize_umee_leverage_v1_MsgCollateralize,
    responseSerialize: serialize_umee_leverage_v1_MsgCollateralizeResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgCollateralizeResponse,
  },
  // Decollateralize disables selected uTokens as collateral. They are returned to the user's
// balance from the module.
decollateralize: {
    path: '/umee.leverage.v1.Msg/Decollateralize',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgDecollateralize,
    responseType: umee_leverage_v1_tx_pb.MsgDecollateralizeResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgDecollateralize,
    requestDeserialize: deserialize_umee_leverage_v1_MsgDecollateralize,
    responseSerialize: serialize_umee_leverage_v1_MsgDecollateralizeResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgDecollateralizeResponse,
  },
  // Borrow allows a user to borrow tokens from the module if they have sufficient collateral.
borrow: {
    path: '/umee.leverage.v1.Msg/Borrow',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgBorrow,
    responseType: umee_leverage_v1_tx_pb.MsgBorrowResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgBorrow,
    requestDeserialize: deserialize_umee_leverage_v1_MsgBorrow,
    responseSerialize: serialize_umee_leverage_v1_MsgBorrowResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgBorrowResponse,
  },
  // MaxBorrow allows a user to borrow the maximum amount of tokens their collateral will allow.
// Zero is returned if no more can be borrowed.
maxBorrow: {
    path: '/umee.leverage.v1.Msg/MaxBorrow',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgMaxBorrow,
    responseType: umee_leverage_v1_tx_pb.MsgMaxBorrowResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgMaxBorrow,
    requestDeserialize: deserialize_umee_leverage_v1_MsgMaxBorrow,
    responseSerialize: serialize_umee_leverage_v1_MsgMaxBorrowResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgMaxBorrowResponse,
  },
  // Repay allows a user to repay previously borrowed tokens and interest.
repay: {
    path: '/umee.leverage.v1.Msg/Repay',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgRepay,
    responseType: umee_leverage_v1_tx_pb.MsgRepayResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgRepay,
    requestDeserialize: deserialize_umee_leverage_v1_MsgRepay,
    responseSerialize: serialize_umee_leverage_v1_MsgRepayResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgRepayResponse,
  },
  // Liquidate allows a user to repay a different user's borrowed coins in exchange for some
// of the target's collateral.
liquidate: {
    path: '/umee.leverage.v1.Msg/Liquidate',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgLiquidate,
    responseType: umee_leverage_v1_tx_pb.MsgLiquidateResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgLiquidate,
    requestDeserialize: deserialize_umee_leverage_v1_MsgLiquidate,
    responseSerialize: serialize_umee_leverage_v1_MsgLiquidateResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgLiquidateResponse,
  },
  // SupplyCollateral combines the Supply and Collateralize actions.
supplyCollateral: {
    path: '/umee.leverage.v1.Msg/SupplyCollateral',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgSupplyCollateral,
    responseType: umee_leverage_v1_tx_pb.MsgSupplyCollateralResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgSupplyCollateral,
    requestDeserialize: deserialize_umee_leverage_v1_MsgSupplyCollateral,
    responseSerialize: serialize_umee_leverage_v1_MsgSupplyCollateralResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgSupplyCollateralResponse,
  },
  // GovUpdateRegistry adds new tokens to the token registry or
// updates existing tokens with new settings.
govUpdateRegistry: {
    path: '/umee.leverage.v1.Msg/GovUpdateRegistry',
    requestStream: false,
    responseStream: false,
    requestType: umee_leverage_v1_tx_pb.MsgGovUpdateRegistry,
    responseType: umee_leverage_v1_tx_pb.MsgGovUpdateRegistryResponse,
    requestSerialize: serialize_umee_leverage_v1_MsgGovUpdateRegistry,
    requestDeserialize: deserialize_umee_leverage_v1_MsgGovUpdateRegistry,
    responseSerialize: serialize_umee_leverage_v1_MsgGovUpdateRegistryResponse,
    responseDeserialize: deserialize_umee_leverage_v1_MsgGovUpdateRegistryResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
