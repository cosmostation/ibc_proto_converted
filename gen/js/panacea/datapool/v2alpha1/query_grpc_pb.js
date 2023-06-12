// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datapool_v2alpha1_query_pb = require('../../../panacea/datapool/v2alpha1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var panacea_datapool_v2alpha1_pool_pb = require('../../../panacea/datapool/v2alpha1/pool_pb.js');
var panacea_datapool_v2alpha1_genesis_pb = require('../../../panacea/datapool/v2alpha1/genesis_pb.js');

function serialize_panacea_datapool_v2alpha1_QueryDataCertsRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataCertsRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataCertsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataCertsRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataCertsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataCertsResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataCertsResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataCertsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataCertsResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataCertsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemHistoryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemReceiptRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemReceiptResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemReceiptsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPassRedeemReceiptsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPoolModuleAddrRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPoolModuleAddrResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPoolParamsRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPoolParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPoolParamsRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryDataPoolParamsResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryDataPoolParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryDataPoolParamsResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryPoolRequest(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryPoolRequest(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datapool_v2alpha1_QueryPoolResponse(arg) {
  if (!(arg instanceof panacea_datapool_v2alpha1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type panacea.datapool.v2alpha1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datapool_v2alpha1_QueryPoolResponse(buffer_arg) {
  return panacea_datapool_v2alpha1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Pool returns a Pool.
pool: {
    path: '/panacea.datapool.v2alpha1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryPoolRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryPoolRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryPoolRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryPoolResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryPoolResponse,
  },
  // DataPoolParams returns params of x/datapool module.
dataPoolParams: {
    path: '/panacea.datapool.v2alpha1.Query/DataPoolParams',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataPoolParamsResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPoolParamsRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPoolParamsRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPoolParamsResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPoolParamsResponse,
  },
  // DataPoolModuleAddr returns x/datapool module address.
dataPoolModuleAddr: {
    path: '/panacea.datapool.v2alpha1.Query/DataPoolModuleAddr',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataPoolModuleAddrResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPoolModuleAddrResponse,
  },
  // DataCert returns DataCerts
dataCerts: {
    path: '/panacea.datapool.v2alpha1.Query/DataCerts',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataCertsRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataCertsResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataCertsRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataCertsRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataCertsResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataCertsResponse,
  },
  // DataPassRedeemReceipt returns DataPassRedeemReceipt
dataPassRedeemReceipt: {
    path: '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipt',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptResponse,
  },
  // DataPassRedeemReceipts returns DataPassRedeemReceipts
dataPassRedeemReceipts: {
    path: '/panacea.datapool.v2alpha1.Query/DataPassRedeemReceipts',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemReceiptsResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemReceiptsResponse,
  },
  // DataPassRedeemHistory returns a list of DataPassRedeemHistories
dataPassRedeemHistory: {
    path: '/panacea.datapool.v2alpha1.Query/DataPassRedeemHistory',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryRequest,
    responseType: panacea_datapool_v2alpha1_query_pb.QueryDataPassRedeemHistoryResponse,
    requestSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryRequest,
    requestDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryRequest,
    responseSerialize: serialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse,
    responseDeserialize: deserialize_panacea_datapool_v2alpha1_QueryDataPassRedeemHistoryResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
