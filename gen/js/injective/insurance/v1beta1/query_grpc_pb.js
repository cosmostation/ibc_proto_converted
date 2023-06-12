// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_insurance_v1beta1_query_pb = require('../../../injective/insurance/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_insurance_v1beta1_insurance_pb = require('../../../injective/insurance/v1beta1/insurance_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var injective_insurance_v1beta1_genesis_pb = require('../../../injective/insurance/v1beta1/genesis_pb.js');

function serialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryEstimatedRedemptionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryEstimatedRedemptionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceFundRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceFundRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceFundRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceFundRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceFundRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceFundResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceFundResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceFundResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceFundResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceFundResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceFundsRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceFundsRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceFundsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceFundsRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceFundsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceFundsResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceFundsResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceFundsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceFundsResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceFundsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceParamsRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceParamsRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceParamsRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryInsuranceParamsResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryInsuranceParamsResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryInsuranceParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryInsuranceParamsResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryInsuranceParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryPendingRedemptionsRequest(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsRequest)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryPendingRedemptionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryPendingRedemptionsRequest(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_insurance_v1beta1_QueryPendingRedemptionsResponse(arg) {
  if (!(arg instanceof injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsResponse)) {
    throw new Error('Expected argument of type injective.insurance.v1beta1.QueryPendingRedemptionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_insurance_v1beta1_QueryPendingRedemptionsResponse(buffer_arg) {
  return injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Retrieves insurance params
insuranceParams: {
    path: '/injective.insurance.v1beta1.Query/InsuranceParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryInsuranceParamsRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryInsuranceParamsResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceParamsRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceParamsRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceParamsResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceParamsResponse,
  },
  // Retrieves individual insurance fund information from market id
insuranceFund: {
    path: '/injective.insurance.v1beta1.Query/InsuranceFund',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryInsuranceFundRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryInsuranceFundResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceFundRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceFundRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceFundResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceFundResponse,
  },
  // Retrieves all insurance funds
insuranceFunds: {
    path: '/injective.insurance.v1beta1.Query/InsuranceFunds',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryInsuranceFundsRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryInsuranceFundsResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceFundsRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceFundsRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryInsuranceFundsResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryInsuranceFundsResponse,
  },
  // Retrives the value of insurance fund share token at current price (not
// pending redemption)
estimatedRedemptions: {
    path: '/injective.insurance.v1beta1.Query/EstimatedRedemptions',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryEstimatedRedemptionsResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryEstimatedRedemptionsResponse,
  },
  // Retrieves pending redemptions' share token at current price
pendingRedemptions: {
    path: '/injective.insurance.v1beta1.Query/PendingRedemptions',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryPendingRedemptionsResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryPendingRedemptionsRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryPendingRedemptionsRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryPendingRedemptionsResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryPendingRedemptionsResponse,
  },
  // Retrieves the entire insurance module's state
insuranceModuleState: {
    path: '/injective.insurance.v1beta1.Query/InsuranceModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_insurance_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_insurance_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_insurance_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_insurance_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_insurance_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_insurance_v1beta1_QueryModuleStateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
