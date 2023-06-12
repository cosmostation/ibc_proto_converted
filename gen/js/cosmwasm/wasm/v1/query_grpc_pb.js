// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmwasm_wasm_v1_query_pb = require('../../../cosmwasm/wasm/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmwasm_wasm_v1_types_pb = require('../../../cosmwasm/wasm/v1/types_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_cosmwasm_wasm_v1_QueryAllContractStateRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryAllContractStateRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryAllContractStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryAllContractStateRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryAllContractStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryAllContractStateResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryAllContractStateResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryAllContractStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryAllContractStateResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryAllContractStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryCodeRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryCodeRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryCodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryCodeRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryCodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryCodeResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryCodeResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryCodeResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryCodesRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryCodesRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryCodesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryCodesRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryCodesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryCodesResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryCodesResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryCodesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryCodesResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryCodesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractHistoryRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractHistoryRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractHistoryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractHistoryRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractHistoryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractHistoryResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractHistoryResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractHistoryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractHistoryResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractHistoryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractInfoRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractInfoRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractInfoRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractInfoResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractInfoResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractInfoResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractsByCodeRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractsByCodeRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractsByCodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractsByCodeRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractsByCodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryContractsByCodeResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryContractsByCodeResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryContractsByCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryContractsByCodeResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryContractsByCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryParamsRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryParamsResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryPinnedCodesRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryPinnedCodesRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryPinnedCodesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryPinnedCodesRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryPinnedCodesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryPinnedCodesResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryPinnedCodesResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryPinnedCodesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryPinnedCodesResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryPinnedCodesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryRawContractStateRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryRawContractStateRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryRawContractStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryRawContractStateRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryRawContractStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QueryRawContractStateResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QueryRawContractStateResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QueryRawContractStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QueryRawContractStateResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QueryRawContractStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QuerySmartContractStateRequest(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QuerySmartContractStateRequest)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QuerySmartContractStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QuerySmartContractStateRequest(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QuerySmartContractStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmwasm_wasm_v1_QuerySmartContractStateResponse(arg) {
  if (!(arg instanceof cosmwasm_wasm_v1_query_pb.QuerySmartContractStateResponse)) {
    throw new Error('Expected argument of type cosmwasm.wasm.v1.QuerySmartContractStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmwasm_wasm_v1_QuerySmartContractStateResponse(buffer_arg) {
  return cosmwasm_wasm_v1_query_pb.QuerySmartContractStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service
var QueryService = exports.QueryService = {
  // ContractInfo gets the contract meta data
contractInfo: {
    path: '/cosmwasm.wasm.v1.Query/ContractInfo',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryContractInfoRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryContractInfoResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryContractInfoRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractInfoRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryContractInfoResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractInfoResponse,
  },
  // ContractHistory gets the contract code history
contractHistory: {
    path: '/cosmwasm.wasm.v1.Query/ContractHistory',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryContractHistoryRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryContractHistoryResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryContractHistoryRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractHistoryRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryContractHistoryResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractHistoryResponse,
  },
  // ContractsByCode lists all smart contracts for a code id
contractsByCode: {
    path: '/cosmwasm.wasm.v1.Query/ContractsByCode',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryContractsByCodeRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryContractsByCodeResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryContractsByCodeRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractsByCodeRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryContractsByCodeResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryContractsByCodeResponse,
  },
  // AllContractState gets all raw store data for a single contract
allContractState: {
    path: '/cosmwasm.wasm.v1.Query/AllContractState',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryAllContractStateRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryAllContractStateResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryAllContractStateRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryAllContractStateRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryAllContractStateResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryAllContractStateResponse,
  },
  // RawContractState gets single key from the raw store data of a contract
rawContractState: {
    path: '/cosmwasm.wasm.v1.Query/RawContractState',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryRawContractStateRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryRawContractStateResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryRawContractStateRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryRawContractStateRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryRawContractStateResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryRawContractStateResponse,
  },
  // SmartContractState get smart query result from the contract
smartContractState: {
    path: '/cosmwasm.wasm.v1.Query/SmartContractState',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QuerySmartContractStateRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QuerySmartContractStateResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QuerySmartContractStateRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QuerySmartContractStateRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QuerySmartContractStateResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QuerySmartContractStateResponse,
  },
  // Code gets the binary code and metadata for a singe wasm code
code: {
    path: '/cosmwasm.wasm.v1.Query/Code',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryCodeRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryCodeResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryCodeRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryCodeRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryCodeResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryCodeResponse,
  },
  // Codes gets the metadata for all stored wasm codes
codes: {
    path: '/cosmwasm.wasm.v1.Query/Codes',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryCodesRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryCodesResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryCodesRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryCodesRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryCodesResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryCodesResponse,
  },
  // PinnedCodes gets the pinned code ids
pinnedCodes: {
    path: '/cosmwasm.wasm.v1.Query/PinnedCodes',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryPinnedCodesRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryPinnedCodesResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryPinnedCodesRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryPinnedCodesRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryPinnedCodesResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryPinnedCodesResponse,
  },
  // Params gets the module params
params: {
    path: '/cosmwasm.wasm.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cosmwasm_wasm_v1_query_pb.QueryParamsRequest,
    responseType: cosmwasm_wasm_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cosmwasm_wasm_v1_QueryParamsRequest,
    requestDeserialize: deserialize_cosmwasm_wasm_v1_QueryParamsRequest,
    responseSerialize: serialize_cosmwasm_wasm_v1_QueryParamsResponse,
    responseDeserialize: deserialize_cosmwasm_wasm_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
