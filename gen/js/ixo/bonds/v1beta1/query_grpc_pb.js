// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_bonds_v1beta1_query_pb = require('../../../ixo/bonds/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var ixo_bonds_v1beta1_bonds_pb = require('../../../ixo/bonds/v1beta1/bonds_pb.js');

function serialize_ixo_bonds_v1beta1_QueryAlphaMaximumsRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryAlphaMaximumsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryAlphaMaximumsRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryAlphaMaximumsResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryAlphaMaximumsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryAlphaMaximumsResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryAvailableReserveRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryAvailableReserveRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryAvailableReserveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryAvailableReserveRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryAvailableReserveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryAvailableReserveResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryAvailableReserveResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryAvailableReserveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryAvailableReserveResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryAvailableReserveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBatchRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBatchRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBatchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBatchRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBatchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBatchResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBatchResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBatchResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondsDetailedRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondsDetailedRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondsDetailedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondsDetailedRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondsDetailedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondsDetailedResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondsDetailedResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondsDetailedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondsDetailedResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondsDetailedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondsRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondsRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondsRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBondsResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBondsResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBondsResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBuyPriceRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBuyPriceRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBuyPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBuyPriceRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBuyPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryBuyPriceResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryBuyPriceResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryBuyPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryBuyPriceResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryBuyPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCurrentPriceRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCurrentPriceRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCurrentPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCurrentPriceRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCurrentPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCurrentPriceResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCurrentPriceResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCurrentPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCurrentPriceResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCurrentPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCurrentReserveRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCurrentReserveRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCurrentReserveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCurrentReserveRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCurrentReserveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCurrentReserveResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCurrentReserveResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCurrentReserveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCurrentReserveResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCurrentReserveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCustomPriceRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCustomPriceRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCustomPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCustomPriceRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCustomPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryCustomPriceResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryCustomPriceResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryCustomPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryCustomPriceResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryCustomPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryLastBatchRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryLastBatchRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryLastBatchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryLastBatchRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryLastBatchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryLastBatchResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryLastBatchResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryLastBatchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryLastBatchResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryLastBatchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryParamsRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QueryParamsResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QuerySellReturnRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QuerySellReturnRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QuerySellReturnRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QuerySellReturnRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QuerySellReturnRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QuerySellReturnResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QuerySellReturnResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QuerySellReturnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QuerySellReturnResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QuerySellReturnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QuerySwapReturnRequest(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QuerySwapReturnRequest)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QuerySwapReturnRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QuerySwapReturnRequest(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QuerySwapReturnRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_bonds_v1beta1_QuerySwapReturnResponse(arg) {
  if (!(arg instanceof ixo_bonds_v1beta1_query_pb.QuerySwapReturnResponse)) {
    throw new Error('Expected argument of type ixo.bonds.v1beta1.QuerySwapReturnResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_bonds_v1beta1_QuerySwapReturnResponse(buffer_arg) {
  return ixo_bonds_v1beta1_query_pb.QuerySwapReturnResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Bonds returns all existing bonds.
bonds: {
    path: '/ixo.bonds.v1beta1.Query/Bonds',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryBondsRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryBondsResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryBondsRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondsRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryBondsResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondsResponse,
  },
  // BondsDetailed returns a list of all existing bonds with some details about
// their current state.
bondsDetailed: {
    path: '/ixo.bonds.v1beta1.Query/BondsDetailed',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryBondsDetailedRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryBondsDetailedResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryBondsDetailedRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondsDetailedRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryBondsDetailedResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondsDetailedResponse,
  },
  // Params queries the paramaters of x/bonds module.
params: {
    path: '/ixo.bonds.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryParamsRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryParamsResponse,
  },
  // Bond queries info of a specific bond.
bond: {
    path: '/ixo.bonds.v1beta1.Query/Bond',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryBondRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryBondResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryBondRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryBondResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryBondResponse,
  },
  // Batch queries info of a specific bond's current batch.
batch: {
    path: '/ixo.bonds.v1beta1.Query/Batch',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryBatchRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryBatchResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryBatchRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryBatchRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryBatchResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryBatchResponse,
  },
  // LastBatch queries info of a specific bond's last batch.
lastBatch: {
    path: '/ixo.bonds.v1beta1.Query/LastBatch',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryLastBatchRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryLastBatchResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryLastBatchRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryLastBatchRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryLastBatchResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryLastBatchResponse,
  },
  // CurrentPrice queries the current price/s of a specific bond.
currentPrice: {
    path: '/ixo.bonds.v1beta1.Query/CurrentPrice',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryCurrentPriceRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryCurrentPriceResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryCurrentPriceRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryCurrentPriceRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryCurrentPriceResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryCurrentPriceResponse,
  },
  // CurrentReserve queries the current balance/s of the reserve pool for a
// specific bond.
currentReserve: {
    path: '/ixo.bonds.v1beta1.Query/CurrentReserve',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryCurrentReserveRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryCurrentReserveResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryCurrentReserveRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryCurrentReserveRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryCurrentReserveResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryCurrentReserveResponse,
  },
  // AvailableReserve queries current available balance/s of the reserve pool
// for a specific bond.
availableReserve: {
    path: '/ixo.bonds.v1beta1.Query/AvailableReserve',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryAvailableReserveRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryAvailableReserveResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryAvailableReserveRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryAvailableReserveRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryAvailableReserveResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryAvailableReserveResponse,
  },
  // CustomPrice queries price/s of a specific bond at a specific supply.
customPrice: {
    path: '/ixo.bonds.v1beta1.Query/CustomPrice',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryCustomPriceRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryCustomPriceResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryCustomPriceRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryCustomPriceRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryCustomPriceResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryCustomPriceResponse,
  },
  // BuyPrice queries price/s of buying an amount of tokens from a specific
// bond.
buyPrice: {
    path: '/ixo.bonds.v1beta1.Query/BuyPrice',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryBuyPriceRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryBuyPriceResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryBuyPriceRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryBuyPriceRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryBuyPriceResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryBuyPriceResponse,
  },
  // SellReturn queries return/s on selling an amount of tokens of a specific
// bond.
sellReturn: {
    path: '/ixo.bonds.v1beta1.Query/SellReturn',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QuerySellReturnRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QuerySellReturnResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QuerySellReturnRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QuerySellReturnRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QuerySellReturnResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QuerySellReturnResponse,
  },
  // SwapReturn queries return/s on swapping an amount of tokens to another
// token of a specific bond.
swapReturn: {
    path: '/ixo.bonds.v1beta1.Query/SwapReturn',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QuerySwapReturnRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QuerySwapReturnResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QuerySwapReturnRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QuerySwapReturnRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QuerySwapReturnResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QuerySwapReturnResponse,
  },
  // AlphaMaximums queries alpha maximums for a specific augmented bonding
// curve.
alphaMaximums: {
    path: '/ixo.bonds.v1beta1.Query/AlphaMaximums',
    requestStream: false,
    responseStream: false,
    requestType: ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsRequest,
    responseType: ixo_bonds_v1beta1_query_pb.QueryAlphaMaximumsResponse,
    requestSerialize: serialize_ixo_bonds_v1beta1_QueryAlphaMaximumsRequest,
    requestDeserialize: deserialize_ixo_bonds_v1beta1_QueryAlphaMaximumsRequest,
    responseSerialize: serialize_ixo_bonds_v1beta1_QueryAlphaMaximumsResponse,
    responseDeserialize: deserialize_ixo_bonds_v1beta1_QueryAlphaMaximumsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
