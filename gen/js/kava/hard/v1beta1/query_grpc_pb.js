// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_hard_v1beta1_query_pb = require('../../../kava/hard/v1beta1/query_pb.js');
var cosmos_auth_v1beta1_auth_pb = require('../../../cosmos/auth/v1beta1/auth_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_hard_v1beta1_hard_pb = require('../../../kava/hard/v1beta1/hard_pb.js');

function serialize_kava_hard_v1beta1_QueryAccountsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryAccountsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryAccountsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryAccountsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryAccountsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryBorrowsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryBorrowsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryBorrowsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryBorrowsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryBorrowsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryBorrowsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryBorrowsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryBorrowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryBorrowsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryBorrowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryDepositsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryDepositsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryInterestFactorsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryInterestFactorsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryInterestFactorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryInterestFactorsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryInterestFactorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryInterestFactorsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryInterestFactorsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryInterestFactorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryInterestFactorsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryInterestFactorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryInterestRateRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryInterestRateRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryInterestRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryInterestRateRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryInterestRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryInterestRateResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryInterestRateResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryInterestRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryInterestRateResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryInterestRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryReservesRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryReservesRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryReservesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryReservesRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryReservesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryReservesResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryReservesResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryReservesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryReservesResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryReservesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryTotalBorrowedRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryTotalBorrowedRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryTotalBorrowedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryTotalBorrowedRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryTotalBorrowedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryTotalBorrowedResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryTotalBorrowedResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryTotalBorrowedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryTotalBorrowedResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryTotalBorrowedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryTotalDepositedRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryTotalDepositedRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryTotalDepositedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryTotalDepositedRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryTotalDepositedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryTotalDepositedResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryTotalDepositedResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryTotalDepositedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryTotalDepositedResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryTotalDepositedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryUnsyncedBorrowsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryUnsyncedBorrowsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryUnsyncedBorrowsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryUnsyncedBorrowsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryUnsyncedDepositsRequest(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsRequest)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryUnsyncedDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryUnsyncedDepositsRequest(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_hard_v1beta1_QueryUnsyncedDepositsResponse(arg) {
  if (!(arg instanceof kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsResponse)) {
    throw new Error('Expected argument of type kava.hard.v1beta1.QueryUnsyncedDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_hard_v1beta1_QueryUnsyncedDepositsResponse(buffer_arg) {
  return kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for bep3 module.
var QueryService = exports.QueryService = {
  // Params queries module params.
params: {
    path: '/kava.hard.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryParamsResponse,
  },
  // Accounts queries module accounts.
accounts: {
    path: '/kava.hard.v1beta1.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryAccountsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryAccountsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryAccountsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryAccountsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryAccountsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryAccountsResponse,
  },
  // Deposits queries hard deposits.
deposits: {
    path: '/kava.hard.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryDepositsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryDepositsResponse,
  },
  // UnsyncedDeposits queries unsynced deposits.
unsyncedDeposits: {
    path: '/kava.hard.v1beta1.Query/UnsyncedDeposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryUnsyncedDepositsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryUnsyncedDepositsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryUnsyncedDepositsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryUnsyncedDepositsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryUnsyncedDepositsResponse,
  },
  // TotalDeposited queries total coins deposited to hard liquidity pools.
totalDeposited: {
    path: '/kava.hard.v1beta1.Query/TotalDeposited',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryTotalDepositedRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryTotalDepositedResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryTotalDepositedRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryTotalDepositedRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryTotalDepositedResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryTotalDepositedResponse,
  },
  // Borrows queries hard borrows.
borrows: {
    path: '/kava.hard.v1beta1.Query/Borrows',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryBorrowsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryBorrowsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryBorrowsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryBorrowsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryBorrowsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryBorrowsResponse,
  },
  // UnsyncedBorrows queries unsynced borrows.
unsyncedBorrows: {
    path: '/kava.hard.v1beta1.Query/UnsyncedBorrows',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryUnsyncedBorrowsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryUnsyncedBorrowsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryUnsyncedBorrowsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryUnsyncedBorrowsResponse,
  },
  // TotalBorrowed queries total coins borrowed from hard liquidity pools.
totalBorrowed: {
    path: '/kava.hard.v1beta1.Query/TotalBorrowed',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryTotalBorrowedRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryTotalBorrowedResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryTotalBorrowedRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryTotalBorrowedRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryTotalBorrowedResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryTotalBorrowedResponse,
  },
  // InterestRate queries the hard module interest rates.
interestRate: {
    path: '/kava.hard.v1beta1.Query/InterestRate',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryInterestRateRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryInterestRateResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryInterestRateRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryInterestRateRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryInterestRateResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryInterestRateResponse,
  },
  // Reserves queries total hard reserve coins.
reserves: {
    path: '/kava.hard.v1beta1.Query/Reserves',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryReservesRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryReservesResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryReservesRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryReservesRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryReservesResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryReservesResponse,
  },
  // InterestFactors queries hard module interest factors.
interestFactors: {
    path: '/kava.hard.v1beta1.Query/InterestFactors',
    requestStream: false,
    responseStream: false,
    requestType: kava_hard_v1beta1_query_pb.QueryInterestFactorsRequest,
    responseType: kava_hard_v1beta1_query_pb.QueryInterestFactorsResponse,
    requestSerialize: serialize_kava_hard_v1beta1_QueryInterestFactorsRequest,
    requestDeserialize: deserialize_kava_hard_v1beta1_QueryInterestFactorsRequest,
    responseSerialize: serialize_kava_hard_v1beta1_QueryInterestFactorsResponse,
    responseDeserialize: deserialize_kava_hard_v1beta1_QueryInterestFactorsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
