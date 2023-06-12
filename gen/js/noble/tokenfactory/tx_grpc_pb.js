// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var noble_tokenfactory_tx_pb = require('../../noble/tokenfactory/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_noble_tokenfactory_MsgAcceptOwner(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgAcceptOwner)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgAcceptOwner');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgAcceptOwner(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgAcceptOwner.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgAcceptOwnerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgAcceptOwnerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgAcceptOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgAcceptOwnerResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgAcceptOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgBlacklist(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgBlacklist)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgBlacklist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgBlacklist(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgBlacklist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgBlacklistResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgBlacklistResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgBlacklistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgBlacklistResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgBlacklistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgBurn(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgBurn(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgBurnResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgBurnResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgConfigureMinter(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgConfigureMinter)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgConfigureMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgConfigureMinter(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgConfigureMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgConfigureMinterController(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgConfigureMinterController)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgConfigureMinterController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgConfigureMinterController(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgConfigureMinterController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgConfigureMinterControllerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgConfigureMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgConfigureMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgConfigureMinterControllerResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgConfigureMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgConfigureMinterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgConfigureMinterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgConfigureMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgConfigureMinterResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgConfigureMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgMint(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgMint(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgMintResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgMintResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgPause(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgPause)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgPause');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgPause(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgPause.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgPauseResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgPauseResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgPauseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgPauseResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgPauseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgRemoveMinter(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgRemoveMinter)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgRemoveMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgRemoveMinter(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgRemoveMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgRemoveMinterController(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgRemoveMinterController)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgRemoveMinterController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgRemoveMinterController(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgRemoveMinterController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgRemoveMinterControllerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgRemoveMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgRemoveMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgRemoveMinterControllerResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgRemoveMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgRemoveMinterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgRemoveMinterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgRemoveMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgRemoveMinterResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgRemoveMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUnblacklist(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUnblacklist)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUnblacklist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUnblacklist(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUnblacklist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUnblacklistResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUnblacklistResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUnblacklistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUnblacklistResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUnblacklistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUnpause(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUnpause)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUnpause');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUnpause(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUnpause.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUnpauseResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUnpauseResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUnpauseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUnpauseResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUnpauseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateBlacklister(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateBlacklister)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateBlacklister');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateBlacklister(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateBlacklister.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateBlacklisterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateBlacklisterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateBlacklisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateBlacklisterResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateBlacklisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateMasterMinter(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateMasterMinter)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateMasterMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateMasterMinter(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateMasterMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateMasterMinterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateMasterMinterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateMasterMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateMasterMinterResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateMasterMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateOwner(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateOwner)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateOwner');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateOwner(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateOwner.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdateOwnerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdateOwnerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdateOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdateOwnerResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdateOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdatePauser(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdatePauser)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdatePauser');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdatePauser(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdatePauser.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_MsgUpdatePauserResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_tx_pb.MsgUpdatePauserResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.MsgUpdatePauserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_MsgUpdatePauserResponse(buffer_arg) {
  return noble_tokenfactory_tx_pb.MsgUpdatePauserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  updateMasterMinter: {
    path: '/noble.tokenfactory.Msg/UpdateMasterMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUpdateMasterMinter,
    responseType: noble_tokenfactory_tx_pb.MsgUpdateMasterMinterResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUpdateMasterMinter,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUpdateMasterMinter,
    responseSerialize: serialize_noble_tokenfactory_MsgUpdateMasterMinterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUpdateMasterMinterResponse,
  },
  updatePauser: {
    path: '/noble.tokenfactory.Msg/UpdatePauser',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUpdatePauser,
    responseType: noble_tokenfactory_tx_pb.MsgUpdatePauserResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUpdatePauser,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUpdatePauser,
    responseSerialize: serialize_noble_tokenfactory_MsgUpdatePauserResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUpdatePauserResponse,
  },
  updateBlacklister: {
    path: '/noble.tokenfactory.Msg/UpdateBlacklister',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUpdateBlacklister,
    responseType: noble_tokenfactory_tx_pb.MsgUpdateBlacklisterResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUpdateBlacklister,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUpdateBlacklister,
    responseSerialize: serialize_noble_tokenfactory_MsgUpdateBlacklisterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUpdateBlacklisterResponse,
  },
  updateOwner: {
    path: '/noble.tokenfactory.Msg/UpdateOwner',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUpdateOwner,
    responseType: noble_tokenfactory_tx_pb.MsgUpdateOwnerResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUpdateOwner,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUpdateOwner,
    responseSerialize: serialize_noble_tokenfactory_MsgUpdateOwnerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUpdateOwnerResponse,
  },
  acceptOwner: {
    path: '/noble.tokenfactory.Msg/AcceptOwner',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgAcceptOwner,
    responseType: noble_tokenfactory_tx_pb.MsgAcceptOwnerResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgAcceptOwner,
    requestDeserialize: deserialize_noble_tokenfactory_MsgAcceptOwner,
    responseSerialize: serialize_noble_tokenfactory_MsgAcceptOwnerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgAcceptOwnerResponse,
  },
  configureMinter: {
    path: '/noble.tokenfactory.Msg/ConfigureMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgConfigureMinter,
    responseType: noble_tokenfactory_tx_pb.MsgConfigureMinterResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgConfigureMinter,
    requestDeserialize: deserialize_noble_tokenfactory_MsgConfigureMinter,
    responseSerialize: serialize_noble_tokenfactory_MsgConfigureMinterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgConfigureMinterResponse,
  },
  removeMinter: {
    path: '/noble.tokenfactory.Msg/RemoveMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgRemoveMinter,
    responseType: noble_tokenfactory_tx_pb.MsgRemoveMinterResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgRemoveMinter,
    requestDeserialize: deserialize_noble_tokenfactory_MsgRemoveMinter,
    responseSerialize: serialize_noble_tokenfactory_MsgRemoveMinterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgRemoveMinterResponse,
  },
  mint: {
    path: '/noble.tokenfactory.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgMint,
    responseType: noble_tokenfactory_tx_pb.MsgMintResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgMint,
    requestDeserialize: deserialize_noble_tokenfactory_MsgMint,
    responseSerialize: serialize_noble_tokenfactory_MsgMintResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgMintResponse,
  },
  burn: {
    path: '/noble.tokenfactory.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgBurn,
    responseType: noble_tokenfactory_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgBurn,
    requestDeserialize: deserialize_noble_tokenfactory_MsgBurn,
    responseSerialize: serialize_noble_tokenfactory_MsgBurnResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgBurnResponse,
  },
  blacklist: {
    path: '/noble.tokenfactory.Msg/Blacklist',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgBlacklist,
    responseType: noble_tokenfactory_tx_pb.MsgBlacklistResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgBlacklist,
    requestDeserialize: deserialize_noble_tokenfactory_MsgBlacklist,
    responseSerialize: serialize_noble_tokenfactory_MsgBlacklistResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgBlacklistResponse,
  },
  unblacklist: {
    path: '/noble.tokenfactory.Msg/Unblacklist',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUnblacklist,
    responseType: noble_tokenfactory_tx_pb.MsgUnblacklistResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUnblacklist,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUnblacklist,
    responseSerialize: serialize_noble_tokenfactory_MsgUnblacklistResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUnblacklistResponse,
  },
  pause: {
    path: '/noble.tokenfactory.Msg/Pause',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgPause,
    responseType: noble_tokenfactory_tx_pb.MsgPauseResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgPause,
    requestDeserialize: deserialize_noble_tokenfactory_MsgPause,
    responseSerialize: serialize_noble_tokenfactory_MsgPauseResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgPauseResponse,
  },
  unpause: {
    path: '/noble.tokenfactory.Msg/Unpause',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgUnpause,
    responseType: noble_tokenfactory_tx_pb.MsgUnpauseResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgUnpause,
    requestDeserialize: deserialize_noble_tokenfactory_MsgUnpause,
    responseSerialize: serialize_noble_tokenfactory_MsgUnpauseResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgUnpauseResponse,
  },
  configureMinterController: {
    path: '/noble.tokenfactory.Msg/ConfigureMinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgConfigureMinterController,
    responseType: noble_tokenfactory_tx_pb.MsgConfigureMinterControllerResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgConfigureMinterController,
    requestDeserialize: deserialize_noble_tokenfactory_MsgConfigureMinterController,
    responseSerialize: serialize_noble_tokenfactory_MsgConfigureMinterControllerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgConfigureMinterControllerResponse,
  },
  removeMinterController: {
    path: '/noble.tokenfactory.Msg/RemoveMinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_tx_pb.MsgRemoveMinterController,
    responseType: noble_tokenfactory_tx_pb.MsgRemoveMinterControllerResponse,
    requestSerialize: serialize_noble_tokenfactory_MsgRemoveMinterController,
    requestDeserialize: deserialize_noble_tokenfactory_MsgRemoveMinterController,
    responseSerialize: serialize_noble_tokenfactory_MsgRemoveMinterControllerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_MsgRemoveMinterControllerResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
