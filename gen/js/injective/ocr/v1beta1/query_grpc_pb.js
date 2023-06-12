// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_ocr_v1beta1_query_pb = require('../../../injective/ocr/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_ocr_v1beta1_ocr_pb = require('../../../injective/ocr/v1beta1/ocr_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var injective_ocr_v1beta1_genesis_pb = require('../../../injective/ocr/v1beta1/genesis_pb.js');

function serialize_injective_ocr_v1beta1_QueryFeedConfigInfoRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryFeedConfigInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryFeedConfigInfoRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryFeedConfigInfoResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryFeedConfigInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryFeedConfigInfoResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryFeedConfigRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryFeedConfigRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryFeedConfigRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryFeedConfigRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryFeedConfigRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryFeedConfigResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryFeedConfigResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryFeedConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryFeedConfigResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryFeedConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryLatestRoundRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryLatestRoundRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryLatestRoundRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryLatestRoundRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryLatestRoundRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryLatestRoundResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryLatestRoundResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryLatestRoundResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryLatestRoundResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryLatestRoundResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryLatestTransmissionDetailsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryLatestTransmissionDetailsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryOwedAmountRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryOwedAmountRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryOwedAmountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryOwedAmountRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryOwedAmountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryOwedAmountResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryOwedAmountResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryOwedAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryOwedAmountResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryOwedAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryParamsRequest(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_QueryParamsResponse(buffer_arg) {
  return injective_ocr_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for OCR module.
var QueryService = exports.QueryService = {
  params: {
    path: '/injective.ocr.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryParamsRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryParamsResponse,
  },
  // Retrieves the OCR FeedConfig for a given FeedId
feedConfig: {
    path: '/injective.ocr.v1beta1.Query/FeedConfig',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryFeedConfigRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryFeedConfigResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryFeedConfigRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryFeedConfigRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryFeedConfigResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryFeedConfigResponse,
  },
  // Retrieves the OCR FeedConfigInfo for a given FeedId
feedConfigInfo: {
    path: '/injective.ocr.v1beta1.Query/FeedConfigInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryFeedConfigInfoResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryFeedConfigInfoRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryFeedConfigInfoRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryFeedConfigInfoResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryFeedConfigInfoResponse,
  },
  // Retrieves latest round ID and data, including median answer for that round
latestRound: {
    path: '/injective.ocr.v1beta1.Query/LatestRound',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryLatestRoundRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryLatestRoundResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryLatestRoundRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryLatestRoundRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryLatestRoundResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryLatestRoundResponse,
  },
  // LatestTransmissionDetails returns details about the latest trasmission
// recorded on chain for the given feed ID.
latestTransmissionDetails: {
    path: '/injective.ocr.v1beta1.Query/LatestTransmissionDetails',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryLatestTransmissionDetailsResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryLatestTransmissionDetailsResponse,
  },
  // Retrieves transmitter's owed amount
owedAmount: {
    path: '/injective.ocr.v1beta1.Query/OwedAmount',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryOwedAmountRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryOwedAmountResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryOwedAmountRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryOwedAmountRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryOwedAmountResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryOwedAmountResponse,
  },
  // Retrieves the entire OCR module's state
ocrModuleState: {
    path: '/injective.ocr.v1beta1.Query/OcrModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_ocr_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_ocr_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_ocr_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_QueryModuleStateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
