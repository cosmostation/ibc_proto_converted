// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_gamm_v2_query_pb = require('../../../osmosis/gamm/v2/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_gamm_v1beta1_tx_pb = require('../../../osmosis/gamm/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_osmosis_gamm_v2_QuerySpotPriceRequest(arg) {
  if (!(arg instanceof osmosis_gamm_v2_query_pb.QuerySpotPriceRequest)) {
    throw new Error('Expected argument of type osmosis.gamm.v2.QuerySpotPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v2_QuerySpotPriceRequest(buffer_arg) {
  return osmosis_gamm_v2_query_pb.QuerySpotPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_gamm_v2_QuerySpotPriceResponse(arg) {
  if (!(arg instanceof osmosis_gamm_v2_query_pb.QuerySpotPriceResponse)) {
    throw new Error('Expected argument of type osmosis.gamm.v2.QuerySpotPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_gamm_v2_QuerySpotPriceResponse(buffer_arg) {
  return osmosis_gamm_v2_query_pb.QuerySpotPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // Deprecated: please use alternate in x/poolmanager
spotPrice: {
    path: '/osmosis.gamm.v2.Query/SpotPrice',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_gamm_v2_query_pb.QuerySpotPriceRequest,
    responseType: osmosis_gamm_v2_query_pb.QuerySpotPriceResponse,
    requestSerialize: serialize_osmosis_gamm_v2_QuerySpotPriceRequest,
    requestDeserialize: deserialize_osmosis_gamm_v2_QuerySpotPriceRequest,
    responseSerialize: serialize_osmosis_gamm_v2_QuerySpotPriceResponse,
    responseDeserialize: deserialize_osmosis_gamm_v2_QuerySpotPriceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
