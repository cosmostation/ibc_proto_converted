// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var axelar_multisig_v1beta1_tx_pb = require('../../../axelar/multisig/v1beta1/tx_pb.js');
var axelar_multisig_v1beta1_query_pb = require('../../../axelar/multisig/v1beta1/query_pb.js');

function serialize_axelar_multisig_v1beta1_KeyIDRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeyIDRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeyIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeyIDRequest(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeyIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeyIDResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeyIDResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeyIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeyIDResponse(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeyIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeyRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeyRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeyRequest(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeyResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeyResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeyResponse(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenOptInRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.KeygenOptInRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenOptInRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenOptInRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.KeygenOptInRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenOptInResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.KeygenOptInResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenOptInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenOptInResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.KeygenOptInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenOptOutRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.KeygenOptOutRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenOptOutRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenOptOutRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.KeygenOptOutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenOptOutResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.KeygenOptOutResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenOptOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenOptOutResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.KeygenOptOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenSessionRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeygenSessionRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenSessionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenSessionRequest(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeygenSessionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_KeygenSessionResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.KeygenSessionResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.KeygenSessionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_KeygenSessionResponse(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.KeygenSessionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_NextKeyIDRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.NextKeyIDRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.NextKeyIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_NextKeyIDRequest(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.NextKeyIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_NextKeyIDResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_query_pb.NextKeyIDResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.NextKeyIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_NextKeyIDResponse(buffer_arg) {
  return axelar_multisig_v1beta1_query_pb.NextKeyIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_RotateKeyRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.RotateKeyRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.RotateKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_RotateKeyRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.RotateKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_RotateKeyResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.RotateKeyResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.RotateKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_RotateKeyResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.RotateKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_StartKeygenRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.StartKeygenRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.StartKeygenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_StartKeygenRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.StartKeygenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_StartKeygenResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.StartKeygenResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.StartKeygenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_StartKeygenResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.StartKeygenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_SubmitPubKeyRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.SubmitPubKeyRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.SubmitPubKeyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_SubmitPubKeyRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.SubmitPubKeyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_SubmitPubKeyResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.SubmitPubKeyResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.SubmitPubKeyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_SubmitPubKeyResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.SubmitPubKeyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_SubmitSignatureRequest(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.SubmitSignatureRequest)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.SubmitSignatureRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_SubmitSignatureRequest(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.SubmitSignatureRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_axelar_multisig_v1beta1_SubmitSignatureResponse(arg) {
  if (!(arg instanceof axelar_multisig_v1beta1_tx_pb.SubmitSignatureResponse)) {
    throw new Error('Expected argument of type axelar.multisig.v1beta1.SubmitSignatureResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_axelar_multisig_v1beta1_SubmitSignatureResponse(buffer_arg) {
  return axelar_multisig_v1beta1_tx_pb.SubmitSignatureResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the multisig Msg service.
var MsgServiceService = exports.MsgServiceService = {
  startKeygen: {
    path: '/axelar.multisig.v1beta1.MsgService/StartKeygen',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.StartKeygenRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.StartKeygenResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_StartKeygenRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_StartKeygenRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_StartKeygenResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_StartKeygenResponse,
  },
  submitPubKey: {
    path: '/axelar.multisig.v1beta1.MsgService/SubmitPubKey',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.SubmitPubKeyRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.SubmitPubKeyResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_SubmitPubKeyRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_SubmitPubKeyRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_SubmitPubKeyResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_SubmitPubKeyResponse,
  },
  submitSignature: {
    path: '/axelar.multisig.v1beta1.MsgService/SubmitSignature',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.SubmitSignatureRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.SubmitSignatureResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_SubmitSignatureRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_SubmitSignatureRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_SubmitSignatureResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_SubmitSignatureResponse,
  },
  rotateKey: {
    path: '/axelar.multisig.v1beta1.MsgService/RotateKey',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.RotateKeyRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.RotateKeyResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_RotateKeyRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_RotateKeyRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_RotateKeyResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_RotateKeyResponse,
  },
  keygenOptOut: {
    path: '/axelar.multisig.v1beta1.MsgService/KeygenOptOut',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.KeygenOptOutRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.KeygenOptOutResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_KeygenOptOutRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_KeygenOptOutRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_KeygenOptOutResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_KeygenOptOutResponse,
  },
  keygenOptIn: {
    path: '/axelar.multisig.v1beta1.MsgService/KeygenOptIn',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_tx_pb.KeygenOptInRequest,
    responseType: axelar_multisig_v1beta1_tx_pb.KeygenOptInResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_KeygenOptInRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_KeygenOptInRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_KeygenOptInResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_KeygenOptInResponse,
  },
};

exports.MsgServiceClient = grpc.makeGenericClientConstructor(MsgServiceService);
// Query defines the gRPC querier service.
var QueryServiceService = exports.QueryServiceService = {
  // KeyID returns the key ID of a key assigned to a given chain.
// If no key is assigned, it returns the grpc NOT_FOUND error.
keyID: {
    path: '/axelar.multisig.v1beta1.QueryService/KeyID',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_query_pb.KeyIDRequest,
    responseType: axelar_multisig_v1beta1_query_pb.KeyIDResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_KeyIDRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_KeyIDRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_KeyIDResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_KeyIDResponse,
  },
  // NextKeyID returns the key ID assigned for the next rotation on a given
// chain. If no key rotation is in progress, it returns the grpc NOT_FOUND
// error.
nextKeyID: {
    path: '/axelar.multisig.v1beta1.QueryService/NextKeyID',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_query_pb.NextKeyIDRequest,
    responseType: axelar_multisig_v1beta1_query_pb.NextKeyIDResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_NextKeyIDRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_NextKeyIDRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_NextKeyIDResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_NextKeyIDResponse,
  },
  // Key returns the key corresponding to a given key ID.
// If no key is found, it returns the grpc NOT_FOUND error.
key: {
    path: '/axelar.multisig.v1beta1.QueryService/Key',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_query_pb.KeyRequest,
    responseType: axelar_multisig_v1beta1_query_pb.KeyResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_KeyRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_KeyRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_KeyResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_KeyResponse,
  },
  // KeygenSession returns the keygen session info for a given key ID.
// If no key is found, it returns the grpc NOT_FOUND error.
keygenSession: {
    path: '/axelar.multisig.v1beta1.QueryService/KeygenSession',
    requestStream: false,
    responseStream: false,
    requestType: axelar_multisig_v1beta1_query_pb.KeygenSessionRequest,
    responseType: axelar_multisig_v1beta1_query_pb.KeygenSessionResponse,
    requestSerialize: serialize_axelar_multisig_v1beta1_KeygenSessionRequest,
    requestDeserialize: deserialize_axelar_multisig_v1beta1_KeygenSessionRequest,
    responseSerialize: serialize_axelar_multisig_v1beta1_KeygenSessionResponse,
    responseDeserialize: deserialize_axelar_multisig_v1beta1_KeygenSessionResponse,
  },
};

exports.QueryServiceClient = grpc.makeGenericClientConstructor(QueryServiceService);
