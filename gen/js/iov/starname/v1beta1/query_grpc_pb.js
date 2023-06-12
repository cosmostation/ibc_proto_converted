// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var iov_starname_v1beta1_query_pb = require('../../../iov/starname/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var iov_starname_v1beta1_types_pb = require('../../../iov/starname/v1beta1/types_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryBrokerAccountsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryBrokerAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryBrokerAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryBrokerAccountsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryBrokerAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryBrokerAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryBrokerDomainsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryBrokerDomainsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryBrokerDomainsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryBrokerDomainsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryBrokerDomainsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryBrokerDomainsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryDomainAccountsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryDomainAccountsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryDomainAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryDomainAccountsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryDomainAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryDomainAccountsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryDomainAccountsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryDomainAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryDomainAccountsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryDomainAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryDomainRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryDomainRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryDomainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryDomainRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryDomainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryDomainResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryDomainResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryDomainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryDomainResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryDomainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryOwnerAccountsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryOwnerAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryOwnerAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryOwnerAccountsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryOwnerAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryOwnerAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryOwnerDomainsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryOwnerDomainsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryOwnerDomainsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryOwnerDomainsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryOwnerDomainsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryOwnerDomainsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryResourceAccountsRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryResourceAccountsRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryResourceAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryResourceAccountsRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryResourceAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryResourceAccountsResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryResourceAccountsResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryResourceAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryResourceAccountsResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryResourceAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryStarnameRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryStarnameRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryStarnameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryStarnameRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryStarnameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryStarnameResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryStarnameResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryStarnameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryStarnameResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryStarnameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryYieldRequest(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryYieldRequest)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryYieldRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryYieldRequest(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryYieldRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_starname_v1beta1_QueryYieldResponse(arg) {
  if (!(arg instanceof iov_starname_v1beta1_query_pb.QueryYieldResponse)) {
    throw new Error('Expected argument of type starnamed.x.starname.v1beta1.QueryYieldResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_starname_v1beta1_QueryYieldResponse(buffer_arg) {
  return iov_starname_v1beta1_query_pb.QueryYieldResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Domain gets a starname's domain info.
domain: {
    path: '/starnamed.x.starname.v1beta1.Query/Domain',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryDomainRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryDomainResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryDomainRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryDomainRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryDomainResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryDomainResponse,
  },
  // DomainAccounts gets accounts associated with a given domain.
domainAccounts: {
    path: '/starnamed.x.starname.v1beta1.Query/DomainAccounts',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryDomainAccountsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryDomainAccountsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryDomainAccountsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryDomainAccountsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryDomainAccountsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryDomainAccountsResponse,
  },
  // Starname gets all the information associated with a starname.
starname: {
    path: '/starnamed.x.starname.v1beta1.Query/Starname',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryStarnameRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryStarnameResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryStarnameRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryStarnameRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryStarnameResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryStarnameResponse,
  },
  // OwnerAccounts gets accounts associated with a given owner.
ownerAccounts: {
    path: '/starnamed.x.starname.v1beta1.Query/OwnerAccounts',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryOwnerAccountsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryOwnerAccountsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryOwnerAccountsResponse,
  },
  // OwnerDomains gets domains associated with a given owner.
ownerDomains: {
    path: '/starnamed.x.starname.v1beta1.Query/OwnerDomains',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryOwnerDomainsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryOwnerDomainsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryOwnerDomainsResponse,
  },
  // ResourceAccounts gets accounts associated with a given resource.
resourceAccounts: {
    path: '/starnamed.x.starname.v1beta1.Query/ResourceAccounts',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryResourceAccountsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryResourceAccountsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryResourceAccountsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryResourceAccountsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryResourceAccountsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryResourceAccountsResponse,
  },
  // BrokerAccounts gets accounts associated with a given broker.
brokerAccounts: {
    path: '/starnamed.x.starname.v1beta1.Query/BrokerAccounts',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryBrokerAccountsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryBrokerAccountsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryBrokerAccountsResponse,
  },
  // BrokerDomains gets domains associated with a given broker.
brokerDomains: {
    path: '/starnamed.x.starname.v1beta1.Query/BrokerDomains',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryBrokerDomainsRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryBrokerDomainsResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryBrokerDomainsResponse,
  },
  // Yield estimates and retrieves the annualized yield for delegators
yield: {
    path: '/starnamed.x.starname.v1beta1.Query/Yield',
    requestStream: false,
    responseStream: false,
    requestType: iov_starname_v1beta1_query_pb.QueryYieldRequest,
    responseType: iov_starname_v1beta1_query_pb.QueryYieldResponse,
    requestSerialize: serialize_starnamed_x_starname_v1beta1_QueryYieldRequest,
    requestDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryYieldRequest,
    responseSerialize: serialize_starnamed_x_starname_v1beta1_QueryYieldResponse,
    responseDeserialize: deserialize_starnamed_x_starname_v1beta1_QueryYieldResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
