// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_pubsub_v1_query_pb = require('../../../sommelier/pubsub/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var sommelier_pubsub_v1_params_pb = require('../../../sommelier/pubsub/v1/params_pb.js');
var sommelier_pubsub_v1_pubsub_pb = require('../../../sommelier/pubsub/v1/pubsub_pb.js');

function serialize_pubsub_v1_QueryDefaultSubscriptionRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryDefaultSubscriptionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryDefaultSubscriptionRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryDefaultSubscriptionResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryDefaultSubscriptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryDefaultSubscriptionResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryDefaultSubscriptionsRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryDefaultSubscriptionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryDefaultSubscriptionsRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryDefaultSubscriptionsResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryDefaultSubscriptionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryDefaultSubscriptionsResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryParamsRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryParamsResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsByPublisherDomainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsByPublisherDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsBySubscriptionIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherIntentsResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherIntentsResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherIntentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherIntentsResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherIntentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublisherResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublisherResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublisherResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublisherResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublisherResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublishersRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublishersRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublishersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublishersRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublishersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QueryPublishersResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QueryPublishersResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QueryPublishersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QueryPublishersResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QueryPublishersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsByPublisherDomainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsByPublisherDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsBySubscriberAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsBySubscriberAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsBySubscriptionIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsBySubscriptionIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberIntentsResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberIntentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberIntentsResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscriberResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscriberResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscriberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscriberResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscriberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscribersRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscribersRequest)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscribersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscribersRequest(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscribersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_QuerySubscribersResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_query_pb.QuerySubscribersResponse)) {
    throw new Error('Expected argument of type pubsub.v1.QuerySubscribersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_QuerySubscribersResponse(buffer_arg) {
  return sommelier_pubsub_v1_query_pb.QuerySubscribersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/pubsub.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryParamsRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_pubsub_v1_QueryParamsRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryParamsRequest,
    responseSerialize: serialize_pubsub_v1_QueryParamsResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryParamsResponse,
  },
  queryPublisher: {
    path: '/pubsub.v1.Query/QueryPublisher',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublisherRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublisherResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublisherRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublisherRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublisherResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublisherResponse,
  },
  queryPublishers: {
    path: '/pubsub.v1.Query/QueryPublishers',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublishersRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublishersResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublishersRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublishersRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublishersResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublishersResponse,
  },
  querySubscriber: {
    path: '/pubsub.v1.Query/QuerySubscriber',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberResponse,
  },
  querySubscribers: {
    path: '/pubsub.v1.Query/QuerySubscribers',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscribersRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscribersResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscribersRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscribersRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscribersResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscribersResponse,
  },
  queryPublisherIntent: {
    path: '/pubsub.v1.Query/QueryPublisherIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublisherIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublisherIntentRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublisherIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublisherIntentResponse,
  },
  queryPublisherIntents: {
    path: '/pubsub.v1.Query/QueryPublisherIntents',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublisherIntentsRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublisherIntentsResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsResponse,
  },
  queryPublisherIntentsByPublisherDomain: {
    path: '/pubsub.v1.Query/QueryPublisherIntentsByPublisherDomain',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsByPublisherDomainResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsByPublisherDomainResponse,
  },
  queryPublisherIntentsBySubscriptionID: {
    path: '/pubsub.v1.Query/QueryPublisherIntentsBySubscriptionID',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryPublisherIntentsBySubscriptionIDResponse,
    requestSerialize: serialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDRequest,
    responseSerialize: serialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryPublisherIntentsBySubscriptionIDResponse,
  },
  querySubscriberIntent: {
    path: '/pubsub.v1.Query/QuerySubscriberIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentResponse,
  },
  querySubscriberIntents: {
    path: '/pubsub.v1.Query/QuerySubscriberIntents',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberIntentsRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberIntentsResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsResponse,
  },
  querySubscriberIntentsBySubscriberAddress: {
    path: '/pubsub.v1.Query/QuerySubscriberIntentsBySubscriberAddress',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriberAddressResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriberAddressResponse,
  },
  querySubscriberIntentsBySubscriptionID: {
    path: '/pubsub.v1.Query/QuerySubscriberIntentsBySubscriptionID',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsBySubscriptionIDResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsBySubscriptionIDResponse,
  },
  querySubscriberIntentsByPublisherDomain: {
    path: '/pubsub.v1.Query/QuerySubscriberIntentsByPublisherDomain',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainRequest,
    responseType: sommelier_pubsub_v1_query_pb.QuerySubscriberIntentsByPublisherDomainResponse,
    requestSerialize: serialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainRequest,
    requestDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainRequest,
    responseSerialize: serialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainResponse,
    responseDeserialize: deserialize_pubsub_v1_QuerySubscriberIntentsByPublisherDomainResponse,
  },
  queryDefaultSubscription: {
    path: '/pubsub.v1.Query/QueryDefaultSubscription',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionResponse,
    requestSerialize: serialize_pubsub_v1_QueryDefaultSubscriptionRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryDefaultSubscriptionRequest,
    responseSerialize: serialize_pubsub_v1_QueryDefaultSubscriptionResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryDefaultSubscriptionResponse,
  },
  queryDefaultSubscriptions: {
    path: '/pubsub.v1.Query/QueryDefaultSubscriptions',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsRequest,
    responseType: sommelier_pubsub_v1_query_pb.QueryDefaultSubscriptionsResponse,
    requestSerialize: serialize_pubsub_v1_QueryDefaultSubscriptionsRequest,
    requestDeserialize: deserialize_pubsub_v1_QueryDefaultSubscriptionsRequest,
    responseSerialize: serialize_pubsub_v1_QueryDefaultSubscriptionsResponse,
    responseDeserialize: deserialize_pubsub_v1_QueryDefaultSubscriptionsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
