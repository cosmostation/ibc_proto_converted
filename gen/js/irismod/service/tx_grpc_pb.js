// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_service_tx_pb = require('../../irismod/service/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_service_MsgBindService(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgBindService)) {
    throw new Error('Expected argument of type irismod.service.MsgBindService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgBindService(buffer_arg) {
  return irismod_service_tx_pb.MsgBindService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgBindServiceResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgBindServiceResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgBindServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgBindServiceResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgBindServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgCallService(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgCallService)) {
    throw new Error('Expected argument of type irismod.service.MsgCallService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgCallService(buffer_arg) {
  return irismod_service_tx_pb.MsgCallService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgCallServiceResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgCallServiceResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgCallServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgCallServiceResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgCallServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgDefineService(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgDefineService)) {
    throw new Error('Expected argument of type irismod.service.MsgDefineService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgDefineService(buffer_arg) {
  return irismod_service_tx_pb.MsgDefineService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgDefineServiceResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgDefineServiceResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgDefineServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgDefineServiceResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgDefineServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgDisableServiceBinding(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgDisableServiceBinding)) {
    throw new Error('Expected argument of type irismod.service.MsgDisableServiceBinding');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgDisableServiceBinding(buffer_arg) {
  return irismod_service_tx_pb.MsgDisableServiceBinding.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgDisableServiceBindingResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgDisableServiceBindingResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgDisableServiceBindingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgDisableServiceBindingResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgDisableServiceBindingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgEnableServiceBinding(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgEnableServiceBinding)) {
    throw new Error('Expected argument of type irismod.service.MsgEnableServiceBinding');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgEnableServiceBinding(buffer_arg) {
  return irismod_service_tx_pb.MsgEnableServiceBinding.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgEnableServiceBindingResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgEnableServiceBindingResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgEnableServiceBindingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgEnableServiceBindingResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgEnableServiceBindingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgKillRequestContext(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgKillRequestContext)) {
    throw new Error('Expected argument of type irismod.service.MsgKillRequestContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgKillRequestContext(buffer_arg) {
  return irismod_service_tx_pb.MsgKillRequestContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgKillRequestContextResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgKillRequestContextResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgKillRequestContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgKillRequestContextResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgKillRequestContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgPauseRequestContext(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgPauseRequestContext)) {
    throw new Error('Expected argument of type irismod.service.MsgPauseRequestContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgPauseRequestContext(buffer_arg) {
  return irismod_service_tx_pb.MsgPauseRequestContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgPauseRequestContextResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgPauseRequestContextResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgPauseRequestContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgPauseRequestContextResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgPauseRequestContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgRefundServiceDeposit(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgRefundServiceDeposit)) {
    throw new Error('Expected argument of type irismod.service.MsgRefundServiceDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgRefundServiceDeposit(buffer_arg) {
  return irismod_service_tx_pb.MsgRefundServiceDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgRefundServiceDepositResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgRefundServiceDepositResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgRefundServiceDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgRefundServiceDepositResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgRefundServiceDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgRespondService(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgRespondService)) {
    throw new Error('Expected argument of type irismod.service.MsgRespondService');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgRespondService(buffer_arg) {
  return irismod_service_tx_pb.MsgRespondService.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgRespondServiceResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgRespondServiceResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgRespondServiceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgRespondServiceResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgRespondServiceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgSetWithdrawAddress(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgSetWithdrawAddress)) {
    throw new Error('Expected argument of type irismod.service.MsgSetWithdrawAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgSetWithdrawAddress(buffer_arg) {
  return irismod_service_tx_pb.MsgSetWithdrawAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgSetWithdrawAddressResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgSetWithdrawAddressResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgSetWithdrawAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgSetWithdrawAddressResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgSetWithdrawAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgStartRequestContext(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgStartRequestContext)) {
    throw new Error('Expected argument of type irismod.service.MsgStartRequestContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgStartRequestContext(buffer_arg) {
  return irismod_service_tx_pb.MsgStartRequestContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgStartRequestContextResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgStartRequestContextResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgStartRequestContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgStartRequestContextResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgStartRequestContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgUpdateRequestContext(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgUpdateRequestContext)) {
    throw new Error('Expected argument of type irismod.service.MsgUpdateRequestContext');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgUpdateRequestContext(buffer_arg) {
  return irismod_service_tx_pb.MsgUpdateRequestContext.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgUpdateRequestContextResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgUpdateRequestContextResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgUpdateRequestContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgUpdateRequestContextResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgUpdateRequestContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgUpdateServiceBinding(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgUpdateServiceBinding)) {
    throw new Error('Expected argument of type irismod.service.MsgUpdateServiceBinding');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgUpdateServiceBinding(buffer_arg) {
  return irismod_service_tx_pb.MsgUpdateServiceBinding.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgUpdateServiceBindingResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgUpdateServiceBindingResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgUpdateServiceBindingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgUpdateServiceBindingResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgUpdateServiceBindingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgWithdrawEarnedFees(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgWithdrawEarnedFees)) {
    throw new Error('Expected argument of type irismod.service.MsgWithdrawEarnedFees');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgWithdrawEarnedFees(buffer_arg) {
  return irismod_service_tx_pb.MsgWithdrawEarnedFees.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_MsgWithdrawEarnedFeesResponse(arg) {
  if (!(arg instanceof irismod_service_tx_pb.MsgWithdrawEarnedFeesResponse)) {
    throw new Error('Expected argument of type irismod.service.MsgWithdrawEarnedFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_MsgWithdrawEarnedFeesResponse(buffer_arg) {
  return irismod_service_tx_pb.MsgWithdrawEarnedFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // DefineService defines a method for define a new service
defineService: {
    path: '/irismod.service.Msg/DefineService',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgDefineService,
    responseType: irismod_service_tx_pb.MsgDefineServiceResponse,
    requestSerialize: serialize_irismod_service_MsgDefineService,
    requestDeserialize: deserialize_irismod_service_MsgDefineService,
    responseSerialize: serialize_irismod_service_MsgDefineServiceResponse,
    responseDeserialize: deserialize_irismod_service_MsgDefineServiceResponse,
  },
  // BindService defines a method for bind a server
bindService: {
    path: '/irismod.service.Msg/BindService',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgBindService,
    responseType: irismod_service_tx_pb.MsgBindServiceResponse,
    requestSerialize: serialize_irismod_service_MsgBindService,
    requestDeserialize: deserialize_irismod_service_MsgBindService,
    responseSerialize: serialize_irismod_service_MsgBindServiceResponse,
    responseDeserialize: deserialize_irismod_service_MsgBindServiceResponse,
  },
  // UpdateServiceBinding defines a method for update a service binding
updateServiceBinding: {
    path: '/irismod.service.Msg/UpdateServiceBinding',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgUpdateServiceBinding,
    responseType: irismod_service_tx_pb.MsgUpdateServiceBindingResponse,
    requestSerialize: serialize_irismod_service_MsgUpdateServiceBinding,
    requestDeserialize: deserialize_irismod_service_MsgUpdateServiceBinding,
    responseSerialize: serialize_irismod_service_MsgUpdateServiceBindingResponse,
    responseDeserialize: deserialize_irismod_service_MsgUpdateServiceBindingResponse,
  },
  // SetWithdrawAddress defines a method for setting a withdraw address
setWithdrawAddress: {
    path: '/irismod.service.Msg/SetWithdrawAddress',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgSetWithdrawAddress,
    responseType: irismod_service_tx_pb.MsgSetWithdrawAddressResponse,
    requestSerialize: serialize_irismod_service_MsgSetWithdrawAddress,
    requestDeserialize: deserialize_irismod_service_MsgSetWithdrawAddress,
    responseSerialize: serialize_irismod_service_MsgSetWithdrawAddressResponse,
    responseDeserialize: deserialize_irismod_service_MsgSetWithdrawAddressResponse,
  },
  // EnableServiceBinding defines a method for enabling a service binding
enableServiceBinding: {
    path: '/irismod.service.Msg/EnableServiceBinding',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgEnableServiceBinding,
    responseType: irismod_service_tx_pb.MsgEnableServiceBindingResponse,
    requestSerialize: serialize_irismod_service_MsgEnableServiceBinding,
    requestDeserialize: deserialize_irismod_service_MsgEnableServiceBinding,
    responseSerialize: serialize_irismod_service_MsgEnableServiceBindingResponse,
    responseDeserialize: deserialize_irismod_service_MsgEnableServiceBindingResponse,
  },
  // DisableServiceBinding defines a method for disabling a service binding
disableServiceBinding: {
    path: '/irismod.service.Msg/DisableServiceBinding',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgDisableServiceBinding,
    responseType: irismod_service_tx_pb.MsgDisableServiceBindingResponse,
    requestSerialize: serialize_irismod_service_MsgDisableServiceBinding,
    requestDeserialize: deserialize_irismod_service_MsgDisableServiceBinding,
    responseSerialize: serialize_irismod_service_MsgDisableServiceBindingResponse,
    responseDeserialize: deserialize_irismod_service_MsgDisableServiceBindingResponse,
  },
  // RefundServiceDeposit defines a method for refunding a fee
refundServiceDeposit: {
    path: '/irismod.service.Msg/RefundServiceDeposit',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgRefundServiceDeposit,
    responseType: irismod_service_tx_pb.MsgRefundServiceDepositResponse,
    requestSerialize: serialize_irismod_service_MsgRefundServiceDeposit,
    requestDeserialize: deserialize_irismod_service_MsgRefundServiceDeposit,
    responseSerialize: serialize_irismod_service_MsgRefundServiceDepositResponse,
    responseDeserialize: deserialize_irismod_service_MsgRefundServiceDepositResponse,
  },
  // CallService defines a method for calling a service
callService: {
    path: '/irismod.service.Msg/CallService',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgCallService,
    responseType: irismod_service_tx_pb.MsgCallServiceResponse,
    requestSerialize: serialize_irismod_service_MsgCallService,
    requestDeserialize: deserialize_irismod_service_MsgCallService,
    responseSerialize: serialize_irismod_service_MsgCallServiceResponse,
    responseDeserialize: deserialize_irismod_service_MsgCallServiceResponse,
  },
  // RespondService defines a method for responding a service
respondService: {
    path: '/irismod.service.Msg/RespondService',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgRespondService,
    responseType: irismod_service_tx_pb.MsgRespondServiceResponse,
    requestSerialize: serialize_irismod_service_MsgRespondService,
    requestDeserialize: deserialize_irismod_service_MsgRespondService,
    responseSerialize: serialize_irismod_service_MsgRespondServiceResponse,
    responseDeserialize: deserialize_irismod_service_MsgRespondServiceResponse,
  },
  // PauseRequestContext defines a method for pausing a service call
pauseRequestContext: {
    path: '/irismod.service.Msg/PauseRequestContext',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgPauseRequestContext,
    responseType: irismod_service_tx_pb.MsgPauseRequestContextResponse,
    requestSerialize: serialize_irismod_service_MsgPauseRequestContext,
    requestDeserialize: deserialize_irismod_service_MsgPauseRequestContext,
    responseSerialize: serialize_irismod_service_MsgPauseRequestContextResponse,
    responseDeserialize: deserialize_irismod_service_MsgPauseRequestContextResponse,
  },
  // StartRequestContext defines a method for starting a service call
startRequestContext: {
    path: '/irismod.service.Msg/StartRequestContext',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgStartRequestContext,
    responseType: irismod_service_tx_pb.MsgStartRequestContextResponse,
    requestSerialize: serialize_irismod_service_MsgStartRequestContext,
    requestDeserialize: deserialize_irismod_service_MsgStartRequestContext,
    responseSerialize: serialize_irismod_service_MsgStartRequestContextResponse,
    responseDeserialize: deserialize_irismod_service_MsgStartRequestContextResponse,
  },
  // KillRequestContext defines a method for killing a service call
killRequestContext: {
    path: '/irismod.service.Msg/KillRequestContext',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgKillRequestContext,
    responseType: irismod_service_tx_pb.MsgKillRequestContextResponse,
    requestSerialize: serialize_irismod_service_MsgKillRequestContext,
    requestDeserialize: deserialize_irismod_service_MsgKillRequestContext,
    responseSerialize: serialize_irismod_service_MsgKillRequestContextResponse,
    responseDeserialize: deserialize_irismod_service_MsgKillRequestContextResponse,
  },
  // UpdateRequestContext defines a method for updating a service call
updateRequestContext: {
    path: '/irismod.service.Msg/UpdateRequestContext',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgUpdateRequestContext,
    responseType: irismod_service_tx_pb.MsgUpdateRequestContextResponse,
    requestSerialize: serialize_irismod_service_MsgUpdateRequestContext,
    requestDeserialize: deserialize_irismod_service_MsgUpdateRequestContext,
    responseSerialize: serialize_irismod_service_MsgUpdateRequestContextResponse,
    responseDeserialize: deserialize_irismod_service_MsgUpdateRequestContextResponse,
  },
  // WithdrawEarnedFees defines a method for Withdrawing a earned fees
withdrawEarnedFees: {
    path: '/irismod.service.Msg/WithdrawEarnedFees',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_tx_pb.MsgWithdrawEarnedFees,
    responseType: irismod_service_tx_pb.MsgWithdrawEarnedFeesResponse,
    requestSerialize: serialize_irismod_service_MsgWithdrawEarnedFees,
    requestDeserialize: deserialize_irismod_service_MsgWithdrawEarnedFees,
    responseSerialize: serialize_irismod_service_MsgWithdrawEarnedFeesResponse,
    responseDeserialize: deserialize_irismod_service_MsgWithdrawEarnedFeesResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
