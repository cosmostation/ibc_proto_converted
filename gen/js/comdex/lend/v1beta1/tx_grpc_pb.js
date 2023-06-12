// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_lend_v1beta1_tx_pb = require('../../../comdex/lend/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_comdex_lend_v1beta1_MsgBorrow(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgBorrow)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgBorrow(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgBorrowAlternate(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgBorrowAlternate)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgBorrowAlternate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgBorrowAlternate(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgBorrowAlternate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgBorrowAlternateResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgBorrowAlternateResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgBorrowAlternateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgBorrowAlternateResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgBorrowAlternateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgBorrowResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgBorrowResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgBorrowResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewards(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewards)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCalculateInterestAndRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewards(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewardsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewardsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCalculateInterestAndRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewardsResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCloseBorrow(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCloseBorrow)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCloseBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCloseBorrow(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCloseBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCloseBorrowResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCloseBorrowResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCloseBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCloseBorrowResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCloseBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCloseLend(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCloseLend)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCloseLend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCloseLend(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCloseLend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgCloseLendResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgCloseLendResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgCloseLendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgCloseLendResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgCloseLendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDeposit(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDepositBorrow(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDepositBorrow)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDepositBorrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDepositBorrow(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDepositBorrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDepositBorrowResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDepositBorrowResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDepositBorrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDepositBorrowResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDepositBorrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDepositResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDraw(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDraw)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDraw(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgDrawResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgDrawResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgDrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgDrawResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgDrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgFundModuleAccounts(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgFundModuleAccounts)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgFundModuleAccounts');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgFundModuleAccounts(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgFundModuleAccounts.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgFundModuleAccountsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgFundModuleAccountsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgFundModuleAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgFundModuleAccountsResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgFundModuleAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgFundReserveAccounts(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgFundReserveAccounts)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgFundReserveAccounts');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgFundReserveAccounts(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgFundReserveAccounts.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgFundReserveAccountsResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgFundReserveAccountsResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgFundReserveAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgFundReserveAccountsResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgFundReserveAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgLend(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgLend)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgLend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgLend(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgLend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgLendResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgLendResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgLendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgLendResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgLendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgRepay(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgRepay)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgRepay');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgRepay(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgRepay.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgRepayResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgRepayResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgRepayResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgRepayResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgRepayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgWithdraw(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_lend_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof comdex_lend_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type comdex.lend.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_lend_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return comdex_lend_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  // LendAsset defines a method for lending coins to the ModuleAccount.
lend: {
    path: '/comdex.lend.v1beta1.Msg/Lend',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgLend,
    responseType: comdex_lend_v1beta1_tx_pb.MsgLendResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgLend,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgLend,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgLendResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgLendResponse,
  },
  // WithdrawAsset defines a method for withdrawing previously loaned coins from
// the ModuleAccount.
withdraw: {
    path: '/comdex.lend.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgWithdraw,
    responseType: comdex_lend_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgWithdraw,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgWithdrawResponse,
  },
  deposit: {
    path: '/comdex.lend.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgDeposit,
    responseType: comdex_lend_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgDeposit,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgDepositResponse,
  },
  closeLend: {
    path: '/comdex.lend.v1beta1.Msg/CloseLend',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgCloseLend,
    responseType: comdex_lend_v1beta1_tx_pb.MsgCloseLendResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgCloseLend,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgCloseLend,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgCloseLendResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgCloseLendResponse,
  },
  // BorrowAsset defines a method for borrowing coins from the ModuleAccount.
borrow: {
    path: '/comdex.lend.v1beta1.Msg/Borrow',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgBorrow,
    responseType: comdex_lend_v1beta1_tx_pb.MsgBorrowResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgBorrow,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgBorrow,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgBorrowResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgBorrowResponse,
  },
  // RepayAsset defines a method for repaying borrowed coins to the ModuleAccount.
repay: {
    path: '/comdex.lend.v1beta1.Msg/Repay',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgRepay,
    responseType: comdex_lend_v1beta1_tx_pb.MsgRepayResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgRepay,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgRepay,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgRepayResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgRepayResponse,
  },
  depositBorrow: {
    path: '/comdex.lend.v1beta1.Msg/DepositBorrow',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgDepositBorrow,
    responseType: comdex_lend_v1beta1_tx_pb.MsgDepositBorrowResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgDepositBorrow,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgDepositBorrow,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgDepositBorrowResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgDepositBorrowResponse,
  },
  draw: {
    path: '/comdex.lend.v1beta1.Msg/Draw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgDraw,
    responseType: comdex_lend_v1beta1_tx_pb.MsgDrawResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgDraw,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgDraw,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgDrawResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgDrawResponse,
  },
  closeBorrow: {
    path: '/comdex.lend.v1beta1.Msg/CloseBorrow',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgCloseBorrow,
    responseType: comdex_lend_v1beta1_tx_pb.MsgCloseBorrowResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgCloseBorrow,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgCloseBorrow,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgCloseBorrowResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgCloseBorrowResponse,
  },
  borrowAlternate: {
    path: '/comdex.lend.v1beta1.Msg/BorrowAlternate',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgBorrowAlternate,
    responseType: comdex_lend_v1beta1_tx_pb.MsgBorrowAlternateResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgBorrowAlternate,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgBorrowAlternate,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgBorrowAlternateResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgBorrowAlternateResponse,
  },
  // FundModuleAccounts funds an existing module account
fundModuleAccounts: {
    path: '/comdex.lend.v1beta1.Msg/FundModuleAccounts',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgFundModuleAccounts,
    responseType: comdex_lend_v1beta1_tx_pb.MsgFundModuleAccountsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgFundModuleAccounts,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgFundModuleAccounts,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgFundModuleAccountsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgFundModuleAccountsResponse,
  },
  calculateInterestAndRewards: {
    path: '/comdex.lend.v1beta1.Msg/CalculateInterestAndRewards',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewards,
    responseType: comdex_lend_v1beta1_tx_pb.MsgCalculateInterestAndRewardsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewards,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewards,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewardsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgCalculateInterestAndRewardsResponse,
  },
  fundReserveAccounts: {
    path: '/comdex.lend.v1beta1.Msg/FundReserveAccounts',
    requestStream: false,
    responseStream: false,
    requestType: comdex_lend_v1beta1_tx_pb.MsgFundReserveAccounts,
    responseType: comdex_lend_v1beta1_tx_pb.MsgFundReserveAccountsResponse,
    requestSerialize: serialize_comdex_lend_v1beta1_MsgFundReserveAccounts,
    requestDeserialize: deserialize_comdex_lend_v1beta1_MsgFundReserveAccounts,
    responseSerialize: serialize_comdex_lend_v1beta1_MsgFundReserveAccountsResponse,
    responseDeserialize: deserialize_comdex_lend_v1beta1_MsgFundReserveAccountsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
