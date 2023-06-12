// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var band_oracle_v1_tx_pb = require('../../../band/oracle/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var band_oracle_v1_oracle_pb = require('../../../band/oracle/v1/oracle_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_oracle_v1_MsgActivate(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgActivate)) {
    throw new Error('Expected argument of type oracle.v1.MsgActivate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgActivate(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgActivate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgActivateResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgActivateResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgActivateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgActivateResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgActivateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgCreateDataSource(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgCreateDataSource)) {
    throw new Error('Expected argument of type oracle.v1.MsgCreateDataSource');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgCreateDataSource(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgCreateDataSource.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgCreateDataSourceResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgCreateDataSourceResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgCreateDataSourceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgCreateDataSourceResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgCreateDataSourceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgCreateOracleScript(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgCreateOracleScript)) {
    throw new Error('Expected argument of type oracle.v1.MsgCreateOracleScript');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgCreateOracleScript(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgCreateOracleScript.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgCreateOracleScriptResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgCreateOracleScriptResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgCreateOracleScriptResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgCreateOracleScriptResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgCreateOracleScriptResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgEditDataSource(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgEditDataSource)) {
    throw new Error('Expected argument of type oracle.v1.MsgEditDataSource');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgEditDataSource(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgEditDataSource.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgEditDataSourceResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgEditDataSourceResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgEditDataSourceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgEditDataSourceResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgEditDataSourceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgEditOracleScript(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgEditOracleScript)) {
    throw new Error('Expected argument of type oracle.v1.MsgEditOracleScript');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgEditOracleScript(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgEditOracleScript.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgEditOracleScriptResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgEditOracleScriptResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgEditOracleScriptResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgEditOracleScriptResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgEditOracleScriptResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgReportData(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgReportData)) {
    throw new Error('Expected argument of type oracle.v1.MsgReportData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgReportData(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgReportData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgReportDataResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgReportDataResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgReportDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgReportDataResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgReportDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgRequestData(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgRequestData)) {
    throw new Error('Expected argument of type oracle.v1.MsgRequestData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgRequestData(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgRequestData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_oracle_v1_MsgRequestDataResponse(arg) {
  if (!(arg instanceof band_oracle_v1_tx_pb.MsgRequestDataResponse)) {
    throw new Error('Expected argument of type oracle.v1.MsgRequestDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_oracle_v1_MsgRequestDataResponse(buffer_arg) {
  return band_oracle_v1_tx_pb.MsgRequestDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service.
var MsgService = exports.MsgService = {
  // RequestData defines a method for submitting a new request.
requestData: {
    path: '/oracle.v1.Msg/RequestData',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgRequestData,
    responseType: band_oracle_v1_tx_pb.MsgRequestDataResponse,
    requestSerialize: serialize_oracle_v1_MsgRequestData,
    requestDeserialize: deserialize_oracle_v1_MsgRequestData,
    responseSerialize: serialize_oracle_v1_MsgRequestDataResponse,
    responseDeserialize: deserialize_oracle_v1_MsgRequestDataResponse,
  },
  // ReportData defines a method for reporting a data to resolve the request.
reportData: {
    path: '/oracle.v1.Msg/ReportData',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgReportData,
    responseType: band_oracle_v1_tx_pb.MsgReportDataResponse,
    requestSerialize: serialize_oracle_v1_MsgReportData,
    requestDeserialize: deserialize_oracle_v1_MsgReportData,
    responseSerialize: serialize_oracle_v1_MsgReportDataResponse,
    responseDeserialize: deserialize_oracle_v1_MsgReportDataResponse,
  },
  // CreateDataSource defines a method for creating a new data source.
createDataSource: {
    path: '/oracle.v1.Msg/CreateDataSource',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgCreateDataSource,
    responseType: band_oracle_v1_tx_pb.MsgCreateDataSourceResponse,
    requestSerialize: serialize_oracle_v1_MsgCreateDataSource,
    requestDeserialize: deserialize_oracle_v1_MsgCreateDataSource,
    responseSerialize: serialize_oracle_v1_MsgCreateDataSourceResponse,
    responseDeserialize: deserialize_oracle_v1_MsgCreateDataSourceResponse,
  },
  // EditDataSource defines a method for editing an existing data source.
editDataSource: {
    path: '/oracle.v1.Msg/EditDataSource',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgEditDataSource,
    responseType: band_oracle_v1_tx_pb.MsgEditDataSourceResponse,
    requestSerialize: serialize_oracle_v1_MsgEditDataSource,
    requestDeserialize: deserialize_oracle_v1_MsgEditDataSource,
    responseSerialize: serialize_oracle_v1_MsgEditDataSourceResponse,
    responseDeserialize: deserialize_oracle_v1_MsgEditDataSourceResponse,
  },
  // CreateOracleScript defines a method for creating a new oracle script.
createOracleScript: {
    path: '/oracle.v1.Msg/CreateOracleScript',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgCreateOracleScript,
    responseType: band_oracle_v1_tx_pb.MsgCreateOracleScriptResponse,
    requestSerialize: serialize_oracle_v1_MsgCreateOracleScript,
    requestDeserialize: deserialize_oracle_v1_MsgCreateOracleScript,
    responseSerialize: serialize_oracle_v1_MsgCreateOracleScriptResponse,
    responseDeserialize: deserialize_oracle_v1_MsgCreateOracleScriptResponse,
  },
  // EditOracleScript defines a method for editing an existing oracle script.
editOracleScript: {
    path: '/oracle.v1.Msg/EditOracleScript',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgEditOracleScript,
    responseType: band_oracle_v1_tx_pb.MsgEditOracleScriptResponse,
    requestSerialize: serialize_oracle_v1_MsgEditOracleScript,
    requestDeserialize: deserialize_oracle_v1_MsgEditOracleScript,
    responseSerialize: serialize_oracle_v1_MsgEditOracleScriptResponse,
    responseDeserialize: deserialize_oracle_v1_MsgEditOracleScriptResponse,
  },
  // Activate defines a method for applying to be an oracle validator.
activate: {
    path: '/oracle.v1.Msg/Activate',
    requestStream: false,
    responseStream: false,
    requestType: band_oracle_v1_tx_pb.MsgActivate,
    responseType: band_oracle_v1_tx_pb.MsgActivateResponse,
    requestSerialize: serialize_oracle_v1_MsgActivate,
    requestDeserialize: deserialize_oracle_v1_MsgActivate,
    responseSerialize: serialize_oracle_v1_MsgActivateResponse,
    responseDeserialize: deserialize_oracle_v1_MsgActivateResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
