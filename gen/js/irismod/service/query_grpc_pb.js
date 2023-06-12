// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_service_query_pb = require('../../irismod/service/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var irismod_service_service_pb = require('../../irismod/service/service_pb.js');

function serialize_irismod_service_QueryBindingRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryBindingRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryBindingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryBindingRequest(buffer_arg) {
  return irismod_service_query_pb.QueryBindingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryBindingResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryBindingResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryBindingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryBindingResponse(buffer_arg) {
  return irismod_service_query_pb.QueryBindingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryBindingsRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryBindingsRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryBindingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryBindingsRequest(buffer_arg) {
  return irismod_service_query_pb.QueryBindingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryBindingsResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryBindingsResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryBindingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryBindingsResponse(buffer_arg) {
  return irismod_service_query_pb.QueryBindingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryDefinitionRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryDefinitionRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryDefinitionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryDefinitionRequest(buffer_arg) {
  return irismod_service_query_pb.QueryDefinitionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryDefinitionResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryDefinitionResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryDefinitionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryDefinitionResponse(buffer_arg) {
  return irismod_service_query_pb.QueryDefinitionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryEarnedFeesRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryEarnedFeesRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryEarnedFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryEarnedFeesRequest(buffer_arg) {
  return irismod_service_query_pb.QueryEarnedFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryEarnedFeesResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryEarnedFeesResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryEarnedFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryEarnedFeesResponse(buffer_arg) {
  return irismod_service_query_pb.QueryEarnedFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryParamsRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryParamsRequest(buffer_arg) {
  return irismod_service_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryParamsResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryParamsResponse(buffer_arg) {
  return irismod_service_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestContextRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestContextRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestContextRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestContextRequest(buffer_arg) {
  return irismod_service_query_pb.QueryRequestContextRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestContextResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestContextResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestContextResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestContextResponse(buffer_arg) {
  return irismod_service_query_pb.QueryRequestContextResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestRequest(buffer_arg) {
  return irismod_service_query_pb.QueryRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestResponse(buffer_arg) {
  return irismod_service_query_pb.QueryRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestsByReqCtxRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestsByReqCtxRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestsByReqCtxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestsByReqCtxRequest(buffer_arg) {
  return irismod_service_query_pb.QueryRequestsByReqCtxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestsByReqCtxResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestsByReqCtxResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestsByReqCtxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestsByReqCtxResponse(buffer_arg) {
  return irismod_service_query_pb.QueryRequestsByReqCtxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestsRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestsRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestsRequest(buffer_arg) {
  return irismod_service_query_pb.QueryRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryRequestsResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryRequestsResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryRequestsResponse(buffer_arg) {
  return irismod_service_query_pb.QueryRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryResponseRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryResponseRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryResponseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryResponseRequest(buffer_arg) {
  return irismod_service_query_pb.QueryResponseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryResponseResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryResponseResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryResponseResponse(buffer_arg) {
  return irismod_service_query_pb.QueryResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryResponsesRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryResponsesRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryResponsesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryResponsesRequest(buffer_arg) {
  return irismod_service_query_pb.QueryResponsesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryResponsesResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryResponsesResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryResponsesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryResponsesResponse(buffer_arg) {
  return irismod_service_query_pb.QueryResponsesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QuerySchemaRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QuerySchemaRequest)) {
    throw new Error('Expected argument of type irismod.service.QuerySchemaRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QuerySchemaRequest(buffer_arg) {
  return irismod_service_query_pb.QuerySchemaRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QuerySchemaResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QuerySchemaResponse)) {
    throw new Error('Expected argument of type irismod.service.QuerySchemaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QuerySchemaResponse(buffer_arg) {
  return irismod_service_query_pb.QuerySchemaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryWithdrawAddressRequest(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryWithdrawAddressRequest)) {
    throw new Error('Expected argument of type irismod.service.QueryWithdrawAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryWithdrawAddressRequest(buffer_arg) {
  return irismod_service_query_pb.QueryWithdrawAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_service_QueryWithdrawAddressResponse(arg) {
  if (!(arg instanceof irismod_service_query_pb.QueryWithdrawAddressResponse)) {
    throw new Error('Expected argument of type irismod.service.QueryWithdrawAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_service_QueryWithdrawAddressResponse(buffer_arg) {
  return irismod_service_query_pb.QueryWithdrawAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with iservice as rpc
var QueryService = exports.QueryService = {
  // Definition returns service definition
definition: {
    path: '/irismod.service.Query/Definition',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryDefinitionRequest,
    responseType: irismod_service_query_pb.QueryDefinitionResponse,
    requestSerialize: serialize_irismod_service_QueryDefinitionRequest,
    requestDeserialize: deserialize_irismod_service_QueryDefinitionRequest,
    responseSerialize: serialize_irismod_service_QueryDefinitionResponse,
    responseDeserialize: deserialize_irismod_service_QueryDefinitionResponse,
  },
  // Binding returns service Binding with service name and provider
binding: {
    path: '/irismod.service.Query/Binding',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryBindingRequest,
    responseType: irismod_service_query_pb.QueryBindingResponse,
    requestSerialize: serialize_irismod_service_QueryBindingRequest,
    requestDeserialize: deserialize_irismod_service_QueryBindingRequest,
    responseSerialize: serialize_irismod_service_QueryBindingResponse,
    responseDeserialize: deserialize_irismod_service_QueryBindingResponse,
  },
  // Bindings returns all service Bindings with service name and owner
bindings: {
    path: '/irismod.service.Query/Bindings',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryBindingsRequest,
    responseType: irismod_service_query_pb.QueryBindingsResponse,
    requestSerialize: serialize_irismod_service_QueryBindingsRequest,
    requestDeserialize: deserialize_irismod_service_QueryBindingsRequest,
    responseSerialize: serialize_irismod_service_QueryBindingsResponse,
    responseDeserialize: deserialize_irismod_service_QueryBindingsResponse,
  },
  // WithdrawAddress returns the withdraw address of the binding owner
withdrawAddress: {
    path: '/irismod.service.Query/WithdrawAddress',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryWithdrawAddressRequest,
    responseType: irismod_service_query_pb.QueryWithdrawAddressResponse,
    requestSerialize: serialize_irismod_service_QueryWithdrawAddressRequest,
    requestDeserialize: deserialize_irismod_service_QueryWithdrawAddressRequest,
    responseSerialize: serialize_irismod_service_QueryWithdrawAddressResponse,
    responseDeserialize: deserialize_irismod_service_QueryWithdrawAddressResponse,
  },
  // RequestContext returns the request context
requestContext: {
    path: '/irismod.service.Query/RequestContext',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryRequestContextRequest,
    responseType: irismod_service_query_pb.QueryRequestContextResponse,
    requestSerialize: serialize_irismod_service_QueryRequestContextRequest,
    requestDeserialize: deserialize_irismod_service_QueryRequestContextRequest,
    responseSerialize: serialize_irismod_service_QueryRequestContextResponse,
    responseDeserialize: deserialize_irismod_service_QueryRequestContextResponse,
  },
  // Request returns the request
request: {
    path: '/irismod.service.Query/Request',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryRequestRequest,
    responseType: irismod_service_query_pb.QueryRequestResponse,
    requestSerialize: serialize_irismod_service_QueryRequestRequest,
    requestDeserialize: deserialize_irismod_service_QueryRequestRequest,
    responseSerialize: serialize_irismod_service_QueryRequestResponse,
    responseDeserialize: deserialize_irismod_service_QueryRequestResponse,
  },
  // Request returns all requests of one service with provider
requests: {
    path: '/irismod.service.Query/Requests',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryRequestsRequest,
    responseType: irismod_service_query_pb.QueryRequestsResponse,
    requestSerialize: serialize_irismod_service_QueryRequestsRequest,
    requestDeserialize: deserialize_irismod_service_QueryRequestsRequest,
    responseSerialize: serialize_irismod_service_QueryRequestsResponse,
    responseDeserialize: deserialize_irismod_service_QueryRequestsResponse,
  },
  // RequestsByReqCtx returns all requests of one service call batch
requestsByReqCtx: {
    path: '/irismod.service.Query/RequestsByReqCtx',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryRequestsByReqCtxRequest,
    responseType: irismod_service_query_pb.QueryRequestsByReqCtxResponse,
    requestSerialize: serialize_irismod_service_QueryRequestsByReqCtxRequest,
    requestDeserialize: deserialize_irismod_service_QueryRequestsByReqCtxRequest,
    responseSerialize: serialize_irismod_service_QueryRequestsByReqCtxResponse,
    responseDeserialize: deserialize_irismod_service_QueryRequestsByReqCtxResponse,
  },
  // Response returns the response of request
response: {
    path: '/irismod.service.Query/Response',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryResponseRequest,
    responseType: irismod_service_query_pb.QueryResponseResponse,
    requestSerialize: serialize_irismod_service_QueryResponseRequest,
    requestDeserialize: deserialize_irismod_service_QueryResponseRequest,
    responseSerialize: serialize_irismod_service_QueryResponseResponse,
    responseDeserialize: deserialize_irismod_service_QueryResponseResponse,
  },
  // Responses returns all responses of one service call batch
responses: {
    path: '/irismod.service.Query/Responses',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryResponsesRequest,
    responseType: irismod_service_query_pb.QueryResponsesResponse,
    requestSerialize: serialize_irismod_service_QueryResponsesRequest,
    requestDeserialize: deserialize_irismod_service_QueryResponsesRequest,
    responseSerialize: serialize_irismod_service_QueryResponsesResponse,
    responseDeserialize: deserialize_irismod_service_QueryResponsesResponse,
  },
  // EarnedFees returns the earned service fee of one provider
earnedFees: {
    path: '/irismod.service.Query/EarnedFees',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryEarnedFeesRequest,
    responseType: irismod_service_query_pb.QueryEarnedFeesResponse,
    requestSerialize: serialize_irismod_service_QueryEarnedFeesRequest,
    requestDeserialize: deserialize_irismod_service_QueryEarnedFeesRequest,
    responseSerialize: serialize_irismod_service_QueryEarnedFeesResponse,
    responseDeserialize: deserialize_irismod_service_QueryEarnedFeesResponse,
  },
  // Schema returns the schema
schema: {
    path: '/irismod.service.Query/Schema',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QuerySchemaRequest,
    responseType: irismod_service_query_pb.QuerySchemaResponse,
    requestSerialize: serialize_irismod_service_QuerySchemaRequest,
    requestDeserialize: deserialize_irismod_service_QuerySchemaRequest,
    responseSerialize: serialize_irismod_service_QuerySchemaResponse,
    responseDeserialize: deserialize_irismod_service_QuerySchemaResponse,
  },
  // Params queries the service parameters
params: {
    path: '/irismod.service.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: irismod_service_query_pb.QueryParamsRequest,
    responseType: irismod_service_query_pb.QueryParamsResponse,
    requestSerialize: serialize_irismod_service_QueryParamsRequest,
    requestDeserialize: deserialize_irismod_service_QueryParamsRequest,
    responseSerialize: serialize_irismod_service_QueryParamsResponse,
    responseDeserialize: deserialize_irismod_service_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
