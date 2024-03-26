// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_onft_v1beta1_query_pb = require('../../../OmniFlix/onft/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var OmniFlix_onft_v1beta1_onft_pb = require('../../../OmniFlix/onft/v1beta1/onft_pb.js');
var OmniFlix_onft_v1beta1_params_pb = require('../../../OmniFlix/onft/v1beta1/params_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_OmniFlix_onft_v1beta1_QueryCollectionRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryCollectionRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryCollectionRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryCollectionResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryCollectionResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryCollectionResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryDenomRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryDenomRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryDenomRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryDenomResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryDenomResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryDenomResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryDenomsRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryDenomsRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryDenomsRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryDenomsResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryDenomsResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryDenomsResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryIBCCollectionRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryIBCCollectionRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryIBCCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryIBCCollectionRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryIBCCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryIBCDenomONFTRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomONFTRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryIBCDenomONFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomONFTRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomONFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryIBCDenomRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryIBCDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryIBCDenomSupplyRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomSupplyRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryIBCDenomSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomSupplyRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryONFTRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryONFTRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryONFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryONFTRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryONFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryONFTResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryONFTResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryONFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryONFTResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryONFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryOwnerIBCDenomONFTsRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryOwnerIBCDenomONFTsRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryOwnerIBCDenomONFTsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryOwnerIBCDenomONFTsRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryOwnerIBCDenomONFTsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryOwnerONFTsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryOwnerONFTsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryParamsRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QueryParamsResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QuerySupplyRequest(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QuerySupplyRequest(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_onft_v1beta1_QuerySupplyResponse(arg) {
  if (!(arg instanceof OmniFlix_onft_v1beta1_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type OmniFlix.onft.v1beta1.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_onft_v1beta1_QuerySupplyResponse(buffer_arg) {
  return OmniFlix_onft_v1beta1_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  collection: {
    path: '/OmniFlix.onft.v1beta1.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryCollectionRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryCollectionRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryCollectionRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryCollectionResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryCollectionResponse,
  },
  iBCCollection: {
    path: '/OmniFlix.onft.v1beta1.Query/IBCCollection',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryIBCCollectionRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryIBCCollectionRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryIBCCollectionRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryCollectionResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryCollectionResponse,
  },
  denom: {
    path: '/OmniFlix.onft.v1beta1.Query/Denom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryDenomRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryDenomRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryDenomRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryDenomResponse,
  },
  iBCDenom: {
    path: '/OmniFlix.onft.v1beta1.Query/IBCDenom',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryDenomResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryIBCDenomRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryDenomResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryDenomResponse,
  },
  denoms: {
    path: '/OmniFlix.onft.v1beta1.Query/Denoms',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryDenomsRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryDenomsResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryDenomsRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryDenomsRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryDenomsResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryDenomsResponse,
  },
  oNFT: {
    path: '/OmniFlix.onft.v1beta1.Query/ONFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryONFTRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryONFTResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryONFTRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryONFTRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryONFTResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryONFTResponse,
  },
  iBCDenomONFT: {
    path: '/OmniFlix.onft.v1beta1.Query/IBCDenomONFT',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomONFTRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryONFTResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryIBCDenomONFTRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomONFTRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryONFTResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryONFTResponse,
  },
  ownerONFTs: {
    path: '/OmniFlix.onft.v1beta1.Query/OwnerONFTs',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse,
  },
  ownerIBCDenomONFTs: {
    path: '/OmniFlix.onft.v1beta1.Query/OwnerIBCDenomONFTs',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryOwnerIBCDenomONFTsRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryOwnerONFTsResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryOwnerIBCDenomONFTsRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryOwnerIBCDenomONFTsRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryOwnerONFTsResponse,
  },
  supply: {
    path: '/OmniFlix.onft.v1beta1.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QuerySupplyRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QuerySupplyRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QuerySupplyRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QuerySupplyResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QuerySupplyResponse,
  },
  iBCDenomSupply: {
    path: '/OmniFlix.onft.v1beta1.Query/IBCDenomSupply',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryIBCDenomSupplyRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryIBCDenomSupplyRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryIBCDenomSupplyRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QuerySupplyResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QuerySupplyResponse,
  },
  params: {
    path: '/OmniFlix.onft.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_onft_v1beta1_query_pb.QueryParamsRequest,
    responseType: OmniFlix_onft_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_OmniFlix_onft_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_OmniFlix_onft_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_OmniFlix_onft_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
