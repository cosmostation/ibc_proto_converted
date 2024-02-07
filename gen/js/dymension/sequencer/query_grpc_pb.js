// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var dymension_sequencer_query_pb = require('../../dymension/sequencer/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var dymension_sequencer_params_pb = require('../../dymension/sequencer/params_pb.js');
var dymension_sequencer_sequencer_pb = require('../../dymension/sequencer/sequencer_pb.js');
var dymension_sequencer_scheduler_pb = require('../../dymension/sequencer/scheduler_pb.js');
var dymension_sequencer_operating_status_pb = require('../../dymension/sequencer/operating_status_pb.js');

function serialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSchedulerRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSchedulerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSchedulerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSchedulerResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSchedulerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSchedulerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryAllSequencerRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSequencerRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSequencerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencerRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSequencerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryAllSequencerResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSequencerResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSequencerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencerResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSequencerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSequencersByRollappRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSequencersByRollappRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSequencersByRollappRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryAllSequencersByRollappResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryAllSequencersByRollappResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryAllSequencersByRollappResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSchedulerRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSchedulerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSchedulerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSchedulerResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSchedulerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSchedulerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSequencerRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSequencerRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSequencerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencerRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSequencerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSequencerResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSequencerResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSequencerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencerResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSequencerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSequencersByRollappRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSequencersByRollappRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryGetSequencersByRollappResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryGetSequencersByRollappResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryGetSequencersByRollappResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryParamsRequest(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryParamsRequest(buffer_arg) {
  return dymension_sequencer_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_sequencer_QueryParamsResponse(arg) {
  if (!(arg instanceof dymension_sequencer_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.sequencer.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_sequencer_QueryParamsResponse(buffer_arg) {
  return dymension_sequencer_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/dymensionxyz.dymension.sequencer.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryParamsRequest,
    responseType: dymension_sequencer_query_pb.QueryParamsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryParamsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryParamsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryParamsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryParamsResponse,
  },
  // Queries a Sequencer by index.
sequencer: {
    path: '/dymensionxyz.dymension.sequencer.Query/Sequencer',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryGetSequencerRequest,
    responseType: dymension_sequencer_query_pb.QueryGetSequencerResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSequencerRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencerRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSequencerResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencerResponse,
  },
  // Queries a list of Sequencer items.
sequencerAll: {
    path: '/dymensionxyz.dymension.sequencer.Query/SequencerAll',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryAllSequencerRequest,
    responseType: dymension_sequencer_query_pb.QueryAllSequencerResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSequencerRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencerRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSequencerResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencerResponse,
  },
  // Queries a SequencersByRollapp by index.
sequencersByRollapp: {
    path: '/dymensionxyz.dymension.sequencer.Query/SequencersByRollapp',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryGetSequencersByRollappRequest,
    responseType: dymension_sequencer_query_pb.QueryGetSequencersByRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSequencersByRollappResponse,
  },
  // Queries a list of SequencersByRollapp items.
sequencersByRollappAll: {
    path: '/dymensionxyz.dymension.sequencer.Query/SequencersByRollappAll',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryAllSequencersByRollappRequest,
    responseType: dymension_sequencer_query_pb.QueryAllSequencersByRollappResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSequencersByRollappResponse,
  },
  // Queries a Scheduler by index.
scheduler: {
    path: '/dymensionxyz.dymension.sequencer.Query/Scheduler',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryGetSchedulerRequest,
    responseType: dymension_sequencer_query_pb.QueryGetSchedulerResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryGetSchedulerResponse,
  },
  // Queries a list of Scheduler items.
schedulerAll: {
    path: '/dymensionxyz.dymension.sequencer.Query/SchedulerAll',
    requestStream: false,
    responseStream: false,
    requestType: dymension_sequencer_query_pb.QueryAllSchedulerRequest,
    responseType: dymension_sequencer_query_pb.QueryAllSchedulerResponse,
    requestSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerRequest,
    responseSerialize: serialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_sequencer_QueryAllSchedulerResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
