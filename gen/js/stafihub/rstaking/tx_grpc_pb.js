// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rstaking_tx_pb = require('../../stafihub/rstaking/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelist(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelist)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelist(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelistResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelistResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgAddDelegatorToWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelistResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgAddValToWhitelist(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgAddValToWhitelist)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgAddValToWhitelist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgAddValToWhitelist(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgAddValToWhitelist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgAddValToWhitelistResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgAddValToWhitelistResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgAddValToWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgAddValToWhitelistResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgAddValToWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgProvideToken(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgProvideToken)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgProvideToken');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgProvideToken(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgProvideToken.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgProvideTokenResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgProvideTokenResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgProvideTokenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgProvideTokenResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgProvideTokenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelist(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelist)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelist(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelistResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelistResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgRmDelegatorFromWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelistResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgSetInflationBase(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgSetInflationBase)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgSetInflationBase');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgSetInflationBase(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgSetInflationBase.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgSetInflationBaseResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgSetInflationBaseResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgSetInflationBaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgSetInflationBaseResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgSetInflationBaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitch(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitch(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgToggleDelegatorWhitelistSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitchResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitch(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitch)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitch(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgToggleValidatorWhitelistSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitchResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgWithdraw(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgWithdraw(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rstaking_MsgWithdrawResponse(arg) {
  if (!(arg instanceof stafihub_rstaking_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rstaking.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rstaking_MsgWithdrawResponse(buffer_arg) {
  return stafihub_rstaking_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setInflationBase: {
    path: '/stafihub.stafihub.rstaking.Msg/SetInflationBase',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgSetInflationBase,
    responseType: stafihub_rstaking_tx_pb.MsgSetInflationBaseResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgSetInflationBase,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgSetInflationBase,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgSetInflationBaseResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgSetInflationBaseResponse,
  },
  addValToWhitelist: {
    path: '/stafihub.stafihub.rstaking.Msg/AddValToWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgAddValToWhitelist,
    responseType: stafihub_rstaking_tx_pb.MsgAddValToWhitelistResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgAddValToWhitelist,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgAddValToWhitelist,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgAddValToWhitelistResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgAddValToWhitelistResponse,
  },
  toggleValidatorWhitelistSwitch: {
    path: '/stafihub.stafihub.rstaking.Msg/ToggleValidatorWhitelistSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitch,
    responseType: stafihub_rstaking_tx_pb.MsgToggleValidatorWhitelistSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitch,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgToggleValidatorWhitelistSwitchResponse,
  },
  withdraw: {
    path: '/stafihub.stafihub.rstaking.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgWithdraw,
    responseType: stafihub_rstaking_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgWithdraw,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgWithdraw,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgWithdrawResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgWithdrawResponse,
  },
  addDelegatorToWhitelist: {
    path: '/stafihub.stafihub.rstaking.Msg/AddDelegatorToWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelist,
    responseType: stafihub_rstaking_tx_pb.MsgAddDelegatorToWhitelistResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelist,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelist,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelistResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgAddDelegatorToWhitelistResponse,
  },
  toggleDelegatorWhitelistSwitch: {
    path: '/stafihub.stafihub.rstaking.Msg/ToggleDelegatorWhitelistSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitch,
    responseType: stafihub_rstaking_tx_pb.MsgToggleDelegatorWhitelistSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitch,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitch,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgToggleDelegatorWhitelistSwitchResponse,
  },
  provideToken: {
    path: '/stafihub.stafihub.rstaking.Msg/ProvideToken',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgProvideToken,
    responseType: stafihub_rstaking_tx_pb.MsgProvideTokenResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgProvideToken,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgProvideToken,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgProvideTokenResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgProvideTokenResponse,
  },
  rmDelegatorFromWhitelist: {
    path: '/stafihub.stafihub.rstaking.Msg/RmDelegatorFromWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelist,
    responseType: stafihub_rstaking_tx_pb.MsgRmDelegatorFromWhitelistResponse,
    requestSerialize: serialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelist,
    requestDeserialize: deserialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelist,
    responseSerialize: serialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelistResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rstaking_MsgRmDelegatorFromWhitelistResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
