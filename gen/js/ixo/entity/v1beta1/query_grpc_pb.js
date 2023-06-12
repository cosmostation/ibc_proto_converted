// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_entity_v1beta1_query_pb = require('../../../ixo/entity/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var ixo_entity_v1beta1_entity_pb = require('../../../ixo/entity/v1beta1/entity_pb.js');
var ixo_iid_v1beta1_iid_pb = require('../../../ixo/iid/v1beta1/iid_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_ixo_entity_v1beta1_QueryEntityIidDocumentRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityIidDocumentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityIidDocumentRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityIidDocumentResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityIidDocumentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityIidDocumentResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityListRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityListRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityListRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityListResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityListResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityListResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityMetadataRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityMetadataRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityMetadataRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityMetadataResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityMetadataResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityMetadataResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityVerifiedRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityVerifiedRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityVerifiedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityVerifiedRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityVerifiedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryEntityVerifiedResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryEntityVerifiedResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryEntityVerifiedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryEntityVerifiedResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryEntityVerifiedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryParamsRequest(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_entity_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof ixo_entity_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ixo.entity.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_entity_v1beta1_QueryParamsResponse(buffer_arg) {
  return ixo_entity_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/ixo.entity.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryParamsRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryParamsResponse,
  },
  entity: {
    path: '/ixo.entity.v1beta1.Query/Entity',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryEntityRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryEntityResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryEntityRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryEntityResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityResponse,
  },
  entityMetaData: {
    path: '/ixo.entity.v1beta1.Query/EntityMetaData',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryEntityMetadataRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryEntityMetadataResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryEntityMetadataRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityMetadataRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryEntityMetadataResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityMetadataResponse,
  },
  entityIidDocument: {
    path: '/ixo.entity.v1beta1.Query/EntityIidDocument',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryEntityIidDocumentResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryEntityIidDocumentRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityIidDocumentRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryEntityIidDocumentResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityIidDocumentResponse,
  },
  entityVerified: {
    path: '/ixo.entity.v1beta1.Query/EntityVerified',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryEntityVerifiedRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryEntityVerifiedResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryEntityVerifiedRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityVerifiedRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryEntityVerifiedResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityVerifiedResponse,
  },
  entityList: {
    path: '/ixo.entity.v1beta1.Query/EntityList',
    requestStream: false,
    responseStream: false,
    requestType: ixo_entity_v1beta1_query_pb.QueryEntityListRequest,
    responseType: ixo_entity_v1beta1_query_pb.QueryEntityListResponse,
    requestSerialize: serialize_ixo_entity_v1beta1_QueryEntityListRequest,
    requestDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityListRequest,
    responseSerialize: serialize_ixo_entity_v1beta1_QueryEntityListResponse,
    responseDeserialize: deserialize_ixo_entity_v1beta1_QueryEntityListResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
