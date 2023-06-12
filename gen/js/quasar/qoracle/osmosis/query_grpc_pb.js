// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quasar_qoracle_osmosis_query_pb = require('../../../quasar/qoracle/osmosis/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var quasar_qoracle_osmosis_params_pb = require('../../../quasar/qoracle/osmosis/params_pb.js');
var quasar_qoracle_osmosis_osmosis_pb = require('../../../quasar/qoracle/osmosis/osmosis_pb.js');
var osmosis_epochs_genesis_pb = require('../../../osmosis/epochs/genesis_pb.js');
var osmosis_mint_v1beta1_mint_pb = require('../../../osmosis/mint/v1beta1/mint_pb.js');
var osmosis_pool$incentives_v1beta1_incentives_pb = require('../../../osmosis/pool-incentives/v1beta1/incentives_pb.js');
var osmosis_pool$incentives_v1beta1_query_pb = require('../../../osmosis/pool-incentives/v1beta1/query_pb.js');
var osmosis_gamm_pool$models_balancer_balancerPool_pb = require('../../../osmosis/gamm/pool-models/balancer/balancerPool_pb.js');

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryChainParamsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsRequest(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryChainParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryChainParamsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryChainParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsResponse(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryChainParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsRequest(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryIncentivizedPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsResponse(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsRequest(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsResponse(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsRequest(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsRequest(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsResponse(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsResponse(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateRequest(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryStateRequest)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateRequest(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateResponse(arg) {
  if (!(arg instanceof quasar_qoracle_osmosis_query_pb.QueryStateResponse)) {
    throw new Error('Expected argument of type quasarlabs.quasarnode.qoracle.osmosis.QueryStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateResponse(buffer_arg) {
  return quasar_qoracle_osmosis_query_pb.QueryStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/quasarlabs.quasarnode.qoracle.osmosis.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_osmosis_query_pb.QueryParamsRequest,
    responseType: quasar_qoracle_osmosis_query_pb.QueryParamsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryParamsResponse,
  },
  // Queries the state of oracle requests.
state: {
    path: '/quasarlabs.quasarnode.qoracle.osmosis.Query/State',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_osmosis_query_pb.QueryStateRequest,
    responseType: quasar_qoracle_osmosis_query_pb.QueryStateResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryStateResponse,
  },
  // Queries latest fetched params from osmosis chain.
chainParams: {
    path: '/quasarlabs.quasarnode.qoracle.osmosis.Query/ChainParams',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_osmosis_query_pb.QueryChainParamsRequest,
    responseType: quasar_qoracle_osmosis_query_pb.QueryChainParamsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryChainParamsResponse,
  },
  // Queries latest fetched list of incentivized pools from osmosis.
incentivizedPools: {
    path: '/quasarlabs.quasarnode.qoracle.osmosis.Query/IncentivizedPools',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsRequest,
    responseType: quasar_qoracle_osmosis_query_pb.QueryIncentivizedPoolsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryIncentivizedPoolsResponse,
  },
  // Queries latest fetched list of pool details from osmosis.
pools: {
    path: '/quasarlabs.quasarnode.qoracle.osmosis.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: quasar_qoracle_osmosis_query_pb.QueryPoolsRequest,
    responseType: quasar_qoracle_osmosis_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsRequest,
    requestDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsRequest,
    responseSerialize: serialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsResponse,
    responseDeserialize: deserialize_quasarlabs_quasarnode_qoracle_osmosis_QueryPoolsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
