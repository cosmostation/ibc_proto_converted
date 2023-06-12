// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var noble_fiattokenfactory_tx_pb = require('../../noble/fiattokenfactory/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_noble_fiattokenfactory_MsgAcceptOwner(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgAcceptOwner)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgAcceptOwner');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgAcceptOwner(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgAcceptOwner.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgAcceptOwnerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgAcceptOwnerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgAcceptOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgAcceptOwnerResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgAcceptOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgBlacklist(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgBlacklist)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgBlacklist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgBlacklist(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgBlacklist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgBlacklistResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgBlacklistResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgBlacklistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgBlacklistResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgBlacklistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgBurn(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgBurn)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgBurn');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgBurn(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgBurn.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgBurnResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgBurnResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgBurnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgBurnResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgBurnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgConfigureMinter(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgConfigureMinter)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgConfigureMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgConfigureMinter(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgConfigureMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgConfigureMinterController(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgConfigureMinterController)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgConfigureMinterController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgConfigureMinterController(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgConfigureMinterController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgConfigureMinterControllerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgConfigureMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgConfigureMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgConfigureMinterControllerResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgConfigureMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgConfigureMinterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgConfigureMinterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgConfigureMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgConfigureMinterResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgConfigureMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgMint(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgMint)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgMint');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgMint(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgMint.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgMintResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgMintResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgMintResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgPause(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgPause)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgPause');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgPause(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgPause.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgPauseResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgPauseResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgPauseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgPauseResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgPauseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgRemoveMinter(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgRemoveMinter)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgRemoveMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgRemoveMinter(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgRemoveMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgRemoveMinterController(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgRemoveMinterController)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgRemoveMinterController');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgRemoveMinterController(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgRemoveMinterController.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgRemoveMinterControllerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgRemoveMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgRemoveMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgRemoveMinterControllerResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgRemoveMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgRemoveMinterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgRemoveMinterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgRemoveMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgRemoveMinterResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgRemoveMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUnblacklist(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUnblacklist)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUnblacklist');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUnblacklist(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUnblacklist.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUnblacklistResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUnblacklistResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUnblacklistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUnblacklistResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUnblacklistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUnpause(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUnpause)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUnpause');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUnpause(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUnpause.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUnpauseResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUnpauseResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUnpauseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUnpauseResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUnpauseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateBlacklister(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateBlacklister)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateBlacklister');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateBlacklister(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateBlacklister.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateBlacklisterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateBlacklisterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateBlacklisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateBlacklisterResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateBlacklisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateMasterMinter(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinter)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateMasterMinter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateMasterMinter(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateMasterMinterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateMasterMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateMasterMinterResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateOwner(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateOwner)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateOwner');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateOwner(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateOwner.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdateOwnerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdateOwnerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdateOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdateOwnerResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdateOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdatePauser(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdatePauser)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdatePauser');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdatePauser(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdatePauser.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_MsgUpdatePauserResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_tx_pb.MsgUpdatePauserResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.MsgUpdatePauserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_MsgUpdatePauserResponse(buffer_arg) {
  return noble_fiattokenfactory_tx_pb.MsgUpdatePauserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  updateMasterMinter: {
    path: '/noble.fiattokenfactory.Msg/UpdateMasterMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinter,
    responseType: noble_fiattokenfactory_tx_pb.MsgUpdateMasterMinterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUpdateMasterMinter,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateMasterMinter,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUpdateMasterMinterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateMasterMinterResponse,
  },
  updatePauser: {
    path: '/noble.fiattokenfactory.Msg/UpdatePauser',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUpdatePauser,
    responseType: noble_fiattokenfactory_tx_pb.MsgUpdatePauserResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUpdatePauser,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUpdatePauser,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUpdatePauserResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUpdatePauserResponse,
  },
  updateBlacklister: {
    path: '/noble.fiattokenfactory.Msg/UpdateBlacklister',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUpdateBlacklister,
    responseType: noble_fiattokenfactory_tx_pb.MsgUpdateBlacklisterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUpdateBlacklister,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateBlacklister,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUpdateBlacklisterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateBlacklisterResponse,
  },
  updateOwner: {
    path: '/noble.fiattokenfactory.Msg/UpdateOwner',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUpdateOwner,
    responseType: noble_fiattokenfactory_tx_pb.MsgUpdateOwnerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUpdateOwner,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateOwner,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUpdateOwnerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUpdateOwnerResponse,
  },
  acceptOwner: {
    path: '/noble.fiattokenfactory.Msg/AcceptOwner',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgAcceptOwner,
    responseType: noble_fiattokenfactory_tx_pb.MsgAcceptOwnerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgAcceptOwner,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgAcceptOwner,
    responseSerialize: serialize_noble_fiattokenfactory_MsgAcceptOwnerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgAcceptOwnerResponse,
  },
  configureMinter: {
    path: '/noble.fiattokenfactory.Msg/ConfigureMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgConfigureMinter,
    responseType: noble_fiattokenfactory_tx_pb.MsgConfigureMinterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgConfigureMinter,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgConfigureMinter,
    responseSerialize: serialize_noble_fiattokenfactory_MsgConfigureMinterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgConfigureMinterResponse,
  },
  removeMinter: {
    path: '/noble.fiattokenfactory.Msg/RemoveMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgRemoveMinter,
    responseType: noble_fiattokenfactory_tx_pb.MsgRemoveMinterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgRemoveMinter,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgRemoveMinter,
    responseSerialize: serialize_noble_fiattokenfactory_MsgRemoveMinterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgRemoveMinterResponse,
  },
  mint: {
    path: '/noble.fiattokenfactory.Msg/Mint',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgMint,
    responseType: noble_fiattokenfactory_tx_pb.MsgMintResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgMint,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgMint,
    responseSerialize: serialize_noble_fiattokenfactory_MsgMintResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgMintResponse,
  },
  burn: {
    path: '/noble.fiattokenfactory.Msg/Burn',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgBurn,
    responseType: noble_fiattokenfactory_tx_pb.MsgBurnResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgBurn,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgBurn,
    responseSerialize: serialize_noble_fiattokenfactory_MsgBurnResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgBurnResponse,
  },
  blacklist: {
    path: '/noble.fiattokenfactory.Msg/Blacklist',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgBlacklist,
    responseType: noble_fiattokenfactory_tx_pb.MsgBlacklistResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgBlacklist,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgBlacklist,
    responseSerialize: serialize_noble_fiattokenfactory_MsgBlacklistResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgBlacklistResponse,
  },
  unblacklist: {
    path: '/noble.fiattokenfactory.Msg/Unblacklist',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUnblacklist,
    responseType: noble_fiattokenfactory_tx_pb.MsgUnblacklistResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUnblacklist,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUnblacklist,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUnblacklistResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUnblacklistResponse,
  },
  pause: {
    path: '/noble.fiattokenfactory.Msg/Pause',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgPause,
    responseType: noble_fiattokenfactory_tx_pb.MsgPauseResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgPause,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgPause,
    responseSerialize: serialize_noble_fiattokenfactory_MsgPauseResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgPauseResponse,
  },
  unpause: {
    path: '/noble.fiattokenfactory.Msg/Unpause',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgUnpause,
    responseType: noble_fiattokenfactory_tx_pb.MsgUnpauseResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgUnpause,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgUnpause,
    responseSerialize: serialize_noble_fiattokenfactory_MsgUnpauseResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgUnpauseResponse,
  },
  configureMinterController: {
    path: '/noble.fiattokenfactory.Msg/ConfigureMinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgConfigureMinterController,
    responseType: noble_fiattokenfactory_tx_pb.MsgConfigureMinterControllerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgConfigureMinterController,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgConfigureMinterController,
    responseSerialize: serialize_noble_fiattokenfactory_MsgConfigureMinterControllerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgConfigureMinterControllerResponse,
  },
  removeMinterController: {
    path: '/noble.fiattokenfactory.Msg/RemoveMinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_tx_pb.MsgRemoveMinterController,
    responseType: noble_fiattokenfactory_tx_pb.MsgRemoveMinterControllerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_MsgRemoveMinterController,
    requestDeserialize: deserialize_noble_fiattokenfactory_MsgRemoveMinterController,
    responseSerialize: serialize_noble_fiattokenfactory_MsgRemoveMinterControllerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_MsgRemoveMinterControllerResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
