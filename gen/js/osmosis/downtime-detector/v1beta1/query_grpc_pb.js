// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_downtime$detector_v1beta1_query_pb = require('../../../osmosis/downtime-detector/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_downtime$detector_v1beta1_genesis_pb = require('../../../osmosis/downtime-detector/v1beta1/genesis_pb.js');
var osmosis_downtime$detector_v1beta1_downtime_duration_pb = require('../../../osmosis/downtime-detector/v1beta1/downtime_duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthRequest(arg) {
  if (!(arg instanceof osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthRequest)) {
    throw new Error('Expected argument of type osmosis.downtimedetector.v1beta1.RecoveredSinceDowntimeOfLengthRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthRequest(buffer_arg) {
  return osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthResponse(arg) {
  if (!(arg instanceof osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthResponse)) {
    throw new Error('Expected argument of type osmosis.downtimedetector.v1beta1.RecoveredSinceDowntimeOfLengthResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthResponse(buffer_arg) {
  return osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  recoveredSinceDowntimeOfLength: {
    path: '/osmosis.downtimedetector.v1beta1.Query/RecoveredSinceDowntimeOfLength',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthRequest,
    responseType: osmosis_downtime$detector_v1beta1_query_pb.RecoveredSinceDowntimeOfLengthResponse,
    requestSerialize: serialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthRequest,
    requestDeserialize: deserialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthRequest,
    responseSerialize: serialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthResponse,
    responseDeserialize: deserialize_osmosis_downtimedetector_v1beta1_RecoveredSinceDowntimeOfLengthResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
