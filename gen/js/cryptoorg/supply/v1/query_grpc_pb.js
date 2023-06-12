// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cryptoorg_supply_v1_query_pb = require('../../../cryptoorg/supply/v1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_chainmain_supply_v1_SupplyRequest(arg) {
  if (!(arg instanceof cryptoorg_supply_v1_query_pb.SupplyRequest)) {
    throw new Error('Expected argument of type chainmain.supply.v1.SupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_supply_v1_SupplyRequest(buffer_arg) {
  return cryptoorg_supply_v1_query_pb.SupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_supply_v1_SupplyResponse(arg) {
  if (!(arg instanceof cryptoorg_supply_v1_query_pb.SupplyResponse)) {
    throw new Error('Expected argument of type chainmain.supply.v1.SupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_supply_v1_SupplyResponse(buffer_arg) {
  return cryptoorg_supply_v1_query_pb.SupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // TotalSupply queries the total supply of all coins.
totalSupply: {
    path: '/chainmain.supply.v1.Query/TotalSupply',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_supply_v1_query_pb.SupplyRequest,
    responseType: cryptoorg_supply_v1_query_pb.SupplyResponse,
    requestSerialize: serialize_chainmain_supply_v1_SupplyRequest,
    requestDeserialize: deserialize_chainmain_supply_v1_SupplyRequest,
    responseSerialize: serialize_chainmain_supply_v1_SupplyResponse,
    responseDeserialize: deserialize_chainmain_supply_v1_SupplyResponse,
  },
  // LiquidSupply queries the liquid supply of all coins.
liquidSupply: {
    path: '/chainmain.supply.v1.Query/LiquidSupply',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_supply_v1_query_pb.SupplyRequest,
    responseType: cryptoorg_supply_v1_query_pb.SupplyResponse,
    requestSerialize: serialize_chainmain_supply_v1_SupplyRequest,
    requestDeserialize: deserialize_chainmain_supply_v1_SupplyRequest,
    responseSerialize: serialize_chainmain_supply_v1_SupplyResponse,
    responseDeserialize: deserialize_chainmain_supply_v1_SupplyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
