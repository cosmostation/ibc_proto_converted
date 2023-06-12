// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var band_oracle_v1_query_pb = require('../../../band/oracle/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var band_oracle_v1_oracle_pb = require('../../../band/oracle/v1/oracle_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_oracle_v1_QueryActiveValidatorsRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryActiveValidatorsRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryActiveValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryActiveValidatorsRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryActiveValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryActiveValidatorsResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryActiveValidatorsResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryActiveValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryActiveValidatorsResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryActiveValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryCountsRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryCountsRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryCountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryCountsRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryCountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryCountsResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryCountsResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryCountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryCountsResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryCountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryDataRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryDataRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryDataRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryDataResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryDataResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryDataResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryDataSourceRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryDataSourceRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryDataSourceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryDataSourceRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryDataSourceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryDataSourceResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryDataSourceResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryDataSourceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryDataSourceResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryDataSourceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryIsReporterRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryIsReporterRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryIsReporterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryIsReporterRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryIsReporterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryIsReporterResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryIsReporterResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryIsReporterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryIsReporterResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryIsReporterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryOracleScriptRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryOracleScriptRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryOracleScriptRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryOracleScriptRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryOracleScriptRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryOracleScriptResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryOracleScriptResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryOracleScriptResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryOracleScriptResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryOracleScriptResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryParamsRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryParamsResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryPendingRequestsRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryPendingRequestsRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryPendingRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryPendingRequestsRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryPendingRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryPendingRequestsResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryPendingRequestsResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryPendingRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryPendingRequestsResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryPendingRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryReportersRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryReportersRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryReportersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryReportersRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryReportersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryReportersResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryReportersResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryReportersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryReportersResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryReportersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestPriceRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestPriceRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestPriceRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestPriceResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestPriceResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestPriceResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestSearchRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestSearchRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestSearchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestSearchRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestSearchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestSearchResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestSearchResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestSearchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestSearchResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestSearchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestVerificationRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestVerificationRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestVerificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestVerificationRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestVerificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryRequestVerificationResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryRequestVerificationResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryRequestVerificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryRequestVerificationResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryRequestVerificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryValidatorRequest(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryValidatorRequest)) {
    throw new Error('Expected argument of type oracle.v1.QueryValidatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryValidatorRequest(buffer_arg) {
  return band_oracle_v1_query_pb.QueryValidatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_QueryValidatorResponse(arg) {
  if (!(arg instanceof band_oracle_v1_query_pb.QueryValidatorResponse)) {
    throw new Error('Expected argument of type oracle.v1.QueryValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_QueryValidatorResponse(buffer_arg) {
  return band_oracle_v1_query_pb.QueryValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Counts queries the number of existing data sources, oracle scripts, and
// requests.
counts: {
    path: '/oracle.v1.Query/Counts',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryCountsRequest,
    responseType: band_oracle_v1_query_pb.QueryCountsResponse,
    requestSerialize: serialize_oracle_v1_QueryCountsRequest,
    requestDeserialize: deserialize_oracle_v1_QueryCountsRequest,
    responseSerialize: serialize_oracle_v1_QueryCountsResponse,
    responseDeserialize: deserialize_oracle_v1_QueryCountsResponse,
  },
  // Data queries content of the data source or oracle script for given SHA256
// file hash.
data: {
    path: '/oracle.v1.Query/Data',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryDataRequest,
    responseType: band_oracle_v1_query_pb.QueryDataResponse,
    requestSerialize: serialize_oracle_v1_QueryDataRequest,
    requestDeserialize: deserialize_oracle_v1_QueryDataRequest,
    responseSerialize: serialize_oracle_v1_QueryDataResponse,
    responseDeserialize: deserialize_oracle_v1_QueryDataResponse,
  },
  // DataSource queries data source summary info for given data source id.
dataSource: {
    path: '/oracle.v1.Query/DataSource',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryDataSourceRequest,
    responseType: band_oracle_v1_query_pb.QueryDataSourceResponse,
    requestSerialize: serialize_oracle_v1_QueryDataSourceRequest,
    requestDeserialize: deserialize_oracle_v1_QueryDataSourceRequest,
    responseSerialize: serialize_oracle_v1_QueryDataSourceResponse,
    responseDeserialize: deserialize_oracle_v1_QueryDataSourceResponse,
  },
  // OracleScript queries oracle script summary info for given oracle script id.
oracleScript: {
    path: '/oracle.v1.Query/OracleScript',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryOracleScriptRequest,
    responseType: band_oracle_v1_query_pb.QueryOracleScriptResponse,
    requestSerialize: serialize_oracle_v1_QueryOracleScriptRequest,
    requestDeserialize: deserialize_oracle_v1_QueryOracleScriptRequest,
    responseSerialize: serialize_oracle_v1_QueryOracleScriptResponse,
    responseDeserialize: deserialize_oracle_v1_QueryOracleScriptResponse,
  },
  // Request queries request info for given request id.
request: {
    path: '/oracle.v1.Query/Request',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryRequestRequest,
    responseType: band_oracle_v1_query_pb.QueryRequestResponse,
    requestSerialize: serialize_oracle_v1_QueryRequestRequest,
    requestDeserialize: deserialize_oracle_v1_QueryRequestRequest,
    responseSerialize: serialize_oracle_v1_QueryRequestResponse,
    responseDeserialize: deserialize_oracle_v1_QueryRequestResponse,
  },
  // PendingRequests queries list of pending request IDs assigned to given
// validator.
pendingRequests: {
    path: '/oracle.v1.Query/PendingRequests',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryPendingRequestsRequest,
    responseType: band_oracle_v1_query_pb.QueryPendingRequestsResponse,
    requestSerialize: serialize_oracle_v1_QueryPendingRequestsRequest,
    requestDeserialize: deserialize_oracle_v1_QueryPendingRequestsRequest,
    responseSerialize: serialize_oracle_v1_QueryPendingRequestsResponse,
    responseDeserialize: deserialize_oracle_v1_QueryPendingRequestsResponse,
  },
  // Validator queries properties of given validator address.
validator: {
    path: '/oracle.v1.Query/Validator',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryValidatorRequest,
    responseType: band_oracle_v1_query_pb.QueryValidatorResponse,
    requestSerialize: serialize_oracle_v1_QueryValidatorRequest,
    requestDeserialize: deserialize_oracle_v1_QueryValidatorRequest,
    responseSerialize: serialize_oracle_v1_QueryValidatorResponse,
    responseDeserialize: deserialize_oracle_v1_QueryValidatorResponse,
  },
  // IsReporter queries grant of account on this validator.
isReporter: {
    path: '/oracle.v1.Query/IsReporter',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryIsReporterRequest,
    responseType: band_oracle_v1_query_pb.QueryIsReporterResponse,
    requestSerialize: serialize_oracle_v1_QueryIsReporterRequest,
    requestDeserialize: deserialize_oracle_v1_QueryIsReporterRequest,
    responseSerialize: serialize_oracle_v1_QueryIsReporterResponse,
    responseDeserialize: deserialize_oracle_v1_QueryIsReporterResponse,
  },
  // Reporters queries all reporters associated with given validator address.
reporters: {
    path: '/oracle.v1.Query/Reporters',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryReportersRequest,
    responseType: band_oracle_v1_query_pb.QueryReportersResponse,
    requestSerialize: serialize_oracle_v1_QueryReportersRequest,
    requestDeserialize: deserialize_oracle_v1_QueryReportersRequest,
    responseSerialize: serialize_oracle_v1_QueryReportersResponse,
    responseDeserialize: deserialize_oracle_v1_QueryReportersResponse,
  },
  // ActiveValidators queries all active oracle validators.
activeValidators: {
    path: '/oracle.v1.Query/ActiveValidators',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryActiveValidatorsRequest,
    responseType: band_oracle_v1_query_pb.QueryActiveValidatorsResponse,
    requestSerialize: serialize_oracle_v1_QueryActiveValidatorsRequest,
    requestDeserialize: deserialize_oracle_v1_QueryActiveValidatorsRequest,
    responseSerialize: serialize_oracle_v1_QueryActiveValidatorsResponse,
    responseDeserialize: deserialize_oracle_v1_QueryActiveValidatorsResponse,
  },
  // Params queries parameters used for runnning bandchain network.
params: {
    path: '/oracle.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryParamsRequest,
    responseType: band_oracle_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_oracle_v1_QueryParamsRequest,
    requestDeserialize: deserialize_oracle_v1_QueryParamsRequest,
    responseSerialize: serialize_oracle_v1_QueryParamsResponse,
    responseDeserialize: deserialize_oracle_v1_QueryParamsResponse,
  },
  // RequestSearch queries the latest request that match search criteria.
requestSearch: {
    path: '/oracle.v1.Query/RequestSearch',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryRequestSearchRequest,
    responseType: band_oracle_v1_query_pb.QueryRequestSearchResponse,
    requestSerialize: serialize_oracle_v1_QueryRequestSearchRequest,
    requestDeserialize: deserialize_oracle_v1_QueryRequestSearchRequest,
    responseSerialize: serialize_oracle_v1_QueryRequestSearchResponse,
    responseDeserialize: deserialize_oracle_v1_QueryRequestSearchResponse,
  },
  // RequestPrice queries the latest price on standard price reference oracle
// script.
requestPrice: {
    path: '/oracle.v1.Query/RequestPrice',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryRequestPriceRequest,
    responseType: band_oracle_v1_query_pb.QueryRequestPriceResponse,
    requestSerialize: serialize_oracle_v1_QueryRequestPriceRequest,
    requestDeserialize: deserialize_oracle_v1_QueryRequestPriceRequest,
    responseSerialize: serialize_oracle_v1_QueryRequestPriceResponse,
    responseDeserialize: deserialize_oracle_v1_QueryRequestPriceResponse,
  },
  // RequestVerification verifies a request to make sure that
// all information that will be used to report the data is valid
requestVerification: {
    path: '/oracle.v1.Query/RequestVerification',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_query_pb.QueryRequestVerificationRequest,
    responseType: band_oracle_v1_query_pb.QueryRequestVerificationResponse,
    requestSerialize: serialize_oracle_v1_QueryRequestVerificationRequest,
    requestDeserialize: deserialize_oracle_v1_QueryRequestVerificationRequest,
    responseSerialize: serialize_oracle_v1_QueryRequestVerificationResponse,
    responseDeserialize: deserialize_oracle_v1_QueryRequestVerificationResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
