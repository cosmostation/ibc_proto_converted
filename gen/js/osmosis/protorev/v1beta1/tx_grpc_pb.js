// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_protorev_v1beta1_tx_pb = require('../../../osmosis/protorev/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var osmosis_protorev_v1beta1_protorev_pb = require('../../../osmosis/protorev/v1beta1/protorev_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_osmosis_protorev_v1beta1_MsgSetBaseDenoms(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenoms)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetBaseDenoms');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetBaseDenoms(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenoms.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetBaseDenomsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenomsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetBaseDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetBaseDenomsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccount(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccount)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetDeveloperAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccount(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccountResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccountResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetDeveloperAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccountResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetHotRoutes(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutes)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetHotRoutes');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetHotRoutes(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutes.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetHotRoutesResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutesResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetHotRoutesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetHotRoutesResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlock(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlock)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlock(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlockResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlockResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlockResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTx(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTx)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTx(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTxResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTxResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTxResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetPoolWeights(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeights)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetPoolWeights');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetPoolWeights(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeights.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_MsgSetPoolWeightsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeightsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.MsgSetPoolWeightsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_MsgSetPoolWeightsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  // SetHotRoutes sets the hot routes that will be explored when creating
// cyclic arbitrage routes. Can only be called by the admin account.
setHotRoutes: {
    path: '/osmosis.protorev.v1beta1.Msg/SetHotRoutes',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutes,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetHotRoutesResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetHotRoutes,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetHotRoutes,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetHotRoutesResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetHotRoutesResponse,
  },
  // SetDeveloperAccount sets the account that can withdraw a portion of the
// profits from the protorev module. This will be Skip's address.
setDeveloperAccount: {
    path: '/osmosis.protorev.v1beta1.Msg/SetDeveloperAccount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccount,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetDeveloperAccountResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccount,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccount,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccountResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetDeveloperAccountResponse,
  },
  // SetMaxPoolPointsPerTx sets the maximum number of pool points that can be
// consumed per transaction. Can only be called by the admin account.
setMaxPoolPointsPerTx: {
    path: '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerTx',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTx,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerTxResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTx,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTx,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTxResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerTxResponse,
  },
  // SetMaxPoolPointsPerBlock sets the maximum number of pool points that can be
// consumed per block. Can only be called by the admin account.
setMaxPoolPointsPerBlock: {
    path: '/osmosis.protorev.v1beta1.Msg/SetMaxPoolPointsPerBlock',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlock,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetMaxPoolPointsPerBlockResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlock,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlock,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlockResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetMaxPoolPointsPerBlockResponse,
  },
  // SetPoolWeights sets the weights of each pool type in the store. Can only be
// called by the admin account.
setPoolWeights: {
    path: '/osmosis.protorev.v1beta1.Msg/SetPoolWeights',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeights,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetPoolWeightsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetPoolWeights,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetPoolWeights,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetPoolWeightsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetPoolWeightsResponse,
  },
  // SetBaseDenoms sets the base denoms that will be used to create cyclic
// arbitrage routes. Can only be called by the admin account.
setBaseDenoms: {
    path: '/osmosis.protorev.v1beta1.Msg/SetBaseDenoms',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenoms,
    responseType: osmosis_protorev_v1beta1_tx_pb.MsgSetBaseDenomsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_MsgSetBaseDenoms,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetBaseDenoms,
    responseSerialize: serialize_osmosis_protorev_v1beta1_MsgSetBaseDenomsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_MsgSetBaseDenomsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
