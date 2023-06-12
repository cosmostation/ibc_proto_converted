// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_tx_v1beta1_service_pb = require('../../../cosmos/tx/v1beta1/service_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_abci_v1beta1_abci_pb = require('../../../cosmos/base/abci/v1beta1/abci_pb.js');
var cosmos_tx_v1beta1_tx_pb = require('../../../cosmos/tx/v1beta1/tx_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var tendermint_types_block_pb = require('../../../tendermint/types/block_pb.js');
var tendermint_types_types_pb = require('../../../tendermint/types/types_pb.js');

function serialize_cosmos_tx_v1beta1_BroadcastTxRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.BroadcastTxRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.BroadcastTxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_BroadcastTxRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.BroadcastTxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_BroadcastTxResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.BroadcastTxResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.BroadcastTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_BroadcastTxResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.BroadcastTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetBlockWithTxsRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetBlockWithTxsRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetBlockWithTxsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetBlockWithTxsRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetBlockWithTxsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetBlockWithTxsResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetBlockWithTxsResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetBlockWithTxsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetBlockWithTxsResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetBlockWithTxsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetTxRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetTxRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetTxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetTxRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetTxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetTxResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetTxResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetTxResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetTxsEventRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetTxsEventRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetTxsEventRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetTxsEventRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetTxsEventRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_GetTxsEventResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.GetTxsEventResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.GetTxsEventResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_GetTxsEventResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.GetTxsEventResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_SimulateRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.SimulateRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.SimulateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_SimulateRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.SimulateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_SimulateResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.SimulateResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.SimulateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_SimulateResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.SimulateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxDecodeAminoRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxDecodeAminoRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxDecodeAminoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxDecodeAminoRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxDecodeAminoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxDecodeAminoResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxDecodeAminoResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxDecodeAminoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxDecodeAminoResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxDecodeAminoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxDecodeRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxDecodeRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxDecodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxDecodeRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxDecodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxDecodeResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxDecodeResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxDecodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxDecodeResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxDecodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxEncodeAminoRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxEncodeAminoRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxEncodeAminoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxEncodeAminoRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxEncodeAminoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxEncodeAminoResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxEncodeAminoResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxEncodeAminoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxEncodeAminoResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxEncodeAminoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxEncodeRequest(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxEncodeRequest)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxEncodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxEncodeRequest(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxEncodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_tx_v1beta1_TxEncodeResponse(arg) {
  if (!(arg instanceof cosmos_tx_v1beta1_service_pb.TxEncodeResponse)) {
    throw new Error('Expected argument of type cosmos.tx.v1beta1.TxEncodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_tx_v1beta1_TxEncodeResponse(buffer_arg) {
  return cosmos_tx_v1beta1_service_pb.TxEncodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service defines a gRPC service for interacting with transactions.
var ServiceService = exports.ServiceService = {
  // Simulate simulates executing a transaction for estimating gas usage.
simulate: {
    path: '/cosmos.tx.v1beta1.Service/Simulate',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.SimulateRequest,
    responseType: cosmos_tx_v1beta1_service_pb.SimulateResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_SimulateRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_SimulateRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_SimulateResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_SimulateResponse,
  },
  // GetTx fetches a tx by hash.
getTx: {
    path: '/cosmos.tx.v1beta1.Service/GetTx',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.GetTxRequest,
    responseType: cosmos_tx_v1beta1_service_pb.GetTxResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_GetTxRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_GetTxRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_GetTxResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_GetTxResponse,
  },
  // BroadcastTx broadcast transaction.
broadcastTx: {
    path: '/cosmos.tx.v1beta1.Service/BroadcastTx',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.BroadcastTxRequest,
    responseType: cosmos_tx_v1beta1_service_pb.BroadcastTxResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_BroadcastTxRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_BroadcastTxRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_BroadcastTxResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_BroadcastTxResponse,
  },
  // GetTxsEvent fetches txs by event.
getTxsEvent: {
    path: '/cosmos.tx.v1beta1.Service/GetTxsEvent',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.GetTxsEventRequest,
    responseType: cosmos_tx_v1beta1_service_pb.GetTxsEventResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_GetTxsEventRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_GetTxsEventRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_GetTxsEventResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_GetTxsEventResponse,
  },
  // GetBlockWithTxs fetches a block with decoded txs.
//
// Since: cosmos-sdk 0.45.2
getBlockWithTxs: {
    path: '/cosmos.tx.v1beta1.Service/GetBlockWithTxs',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.GetBlockWithTxsRequest,
    responseType: cosmos_tx_v1beta1_service_pb.GetBlockWithTxsResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_GetBlockWithTxsRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_GetBlockWithTxsRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_GetBlockWithTxsResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_GetBlockWithTxsResponse,
  },
  // TxDecode decodes the transaction.
//
// Since: cosmos-sdk 0.47
txDecode: {
    path: '/cosmos.tx.v1beta1.Service/TxDecode',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.TxDecodeRequest,
    responseType: cosmos_tx_v1beta1_service_pb.TxDecodeResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_TxDecodeRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_TxDecodeRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_TxDecodeResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_TxDecodeResponse,
  },
  // TxEncode encodes the transaction.
//
// Since: cosmos-sdk 0.47
txEncode: {
    path: '/cosmos.tx.v1beta1.Service/TxEncode',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.TxEncodeRequest,
    responseType: cosmos_tx_v1beta1_service_pb.TxEncodeResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_TxEncodeRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_TxEncodeRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_TxEncodeResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_TxEncodeResponse,
  },
  // TxEncodeAmino encodes an Amino transaction from JSON to encoded bytes.
//
// Since: cosmos-sdk 0.47
txEncodeAmino: {
    path: '/cosmos.tx.v1beta1.Service/TxEncodeAmino',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.TxEncodeAminoRequest,
    responseType: cosmos_tx_v1beta1_service_pb.TxEncodeAminoResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_TxEncodeAminoRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_TxEncodeAminoRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_TxEncodeAminoResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_TxEncodeAminoResponse,
  },
  // TxDecodeAmino decodes an Amino transaction from encoded bytes to JSON.
//
// Since: cosmos-sdk 0.47
txDecodeAmino: {
    path: '/cosmos.tx.v1beta1.Service/TxDecodeAmino',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_tx_v1beta1_service_pb.TxDecodeAminoRequest,
    responseType: cosmos_tx_v1beta1_service_pb.TxDecodeAminoResponse,
    requestSerialize: serialize_cosmos_tx_v1beta1_TxDecodeAminoRequest,
    requestDeserialize: deserialize_cosmos_tx_v1beta1_TxDecodeAminoRequest,
    responseSerialize: serialize_cosmos_tx_v1beta1_TxDecodeAminoResponse,
    responseDeserialize: deserialize_cosmos_tx_v1beta1_TxDecodeAminoResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
