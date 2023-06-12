// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sentinel_subscription_v2_querier_pb = require('../../../sentinel/subscription/v2/querier_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var sentinel_subscription_v2_allocation_pb = require('../../../sentinel/subscription/v2/allocation_pb.js');
var sentinel_subscription_v2_params_pb = require('../../../sentinel/subscription/v2/params_pb.js');
var sentinel_subscription_v2_payout_pb = require('../../../sentinel/subscription/v2/payout_pb.js');

function serialize_sentinel_subscription_v2_QueryAllocationRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryAllocationRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryAllocationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryAllocationRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryAllocationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryAllocationResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryAllocationResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryAllocationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryAllocationResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryAllocationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryAllocationsRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryAllocationsRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryAllocationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryAllocationsRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryAllocationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryAllocationsResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryAllocationsResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryAllocationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryAllocationsResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryAllocationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryParamsRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryParamsRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryParamsResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryParamsResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsForAccountRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsForAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsForAccountRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsForAccountResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsForAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsForAccountResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsForNodeRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsForNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsForNodeRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsForNodeResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsForNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsForNodeResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QueryPayoutsResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QueryPayoutsResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QueryPayoutsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QueryPayoutsResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QueryPayoutsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForAccountRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForAccountRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForAccountResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForAccountResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForNodeRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForNodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForNodeRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForNodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForPlanRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForPlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForPlanRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsForPlanResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsForPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsForPlanResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsRequest(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsRequest)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsRequest(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_sentinel_subscription_v2_QuerySubscriptionsResponse(arg) {
  if (!(arg instanceof sentinel_subscription_v2_querier_pb.QuerySubscriptionsResponse)) {
    throw new Error('Expected argument of type sentinel.subscription.v2.QuerySubscriptionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_sentinel_subscription_v2_QuerySubscriptionsResponse(buffer_arg) {
  return sentinel_subscription_v2_querier_pb.QuerySubscriptionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryServiceService = exports.QueryServiceService = {
  querySubscriptions: {
    path: '/sentinel.subscription.v2.QueryService/QuerySubscriptions',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsRequest,
    responseType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsResponse,
  },
  querySubscriptionsForAccount: {
    path: '/sentinel.subscription.v2.QueryService/QuerySubscriptionsForAccount',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountRequest,
    responseType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForAccountResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForAccountRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForAccountRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForAccountResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForAccountResponse,
  },
  querySubscriptionsForNode: {
    path: '/sentinel.subscription.v2.QueryService/QuerySubscriptionsForNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeRequest,
    responseType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForNodeResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForNodeRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForNodeRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForNodeResponse,
  },
  querySubscriptionsForPlan: {
    path: '/sentinel.subscription.v2.QueryService/QuerySubscriptionsForPlan',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanRequest,
    responseType: sentinel_subscription_v2_querier_pb.QuerySubscriptionsForPlanResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForPlanRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForPlanRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionsForPlanResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionsForPlanResponse,
  },
  querySubscription: {
    path: '/sentinel.subscription.v2.QueryService/QuerySubscription',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QuerySubscriptionRequest,
    responseType: sentinel_subscription_v2_querier_pb.QuerySubscriptionResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QuerySubscriptionResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QuerySubscriptionResponse,
  },
  queryAllocations: {
    path: '/sentinel.subscription.v2.QueryService/QueryAllocations',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryAllocationsRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryAllocationsResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryAllocationsRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryAllocationsRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryAllocationsResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryAllocationsResponse,
  },
  queryAllocation: {
    path: '/sentinel.subscription.v2.QueryService/QueryAllocation',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryAllocationRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryAllocationResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryAllocationRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryAllocationRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryAllocationResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryAllocationResponse,
  },
  queryPayouts: {
    path: '/sentinel.subscription.v2.QueryService/QueryPayouts',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryPayoutsRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryPayoutsResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryPayoutsRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryPayoutsResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsResponse,
  },
  queryPayoutsForAccount: {
    path: '/sentinel.subscription.v2.QueryService/QueryPayoutsForAccount',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryPayoutsForAccountResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryPayoutsForAccountRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsForAccountRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryPayoutsForAccountResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsForAccountResponse,
  },
  queryPayoutsForNode: {
    path: '/sentinel.subscription.v2.QueryService/QueryPayoutsForNode',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryPayoutsForNodeResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryPayoutsForNodeRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsForNodeRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryPayoutsForNodeResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutsForNodeResponse,
  },
  queryPayout: {
    path: '/sentinel.subscription.v2.QueryService/QueryPayout',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryPayoutRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryPayoutResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryPayoutRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryPayoutResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryPayoutResponse,
  },
  queryParams: {
    path: '/sentinel.subscription.v2.QueryService/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sentinel_subscription_v2_querier_pb.QueryParamsRequest,
    responseType: sentinel_subscription_v2_querier_pb.QueryParamsResponse,
    requestSerialize: serialize_sentinel_subscription_v2_QueryParamsRequest,
    requestDeserialize: deserialize_sentinel_subscription_v2_QueryParamsRequest,
    responseSerialize: serialize_sentinel_subscription_v2_QueryParamsResponse,
    responseDeserialize: deserialize_sentinel_subscription_v2_QueryParamsResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
