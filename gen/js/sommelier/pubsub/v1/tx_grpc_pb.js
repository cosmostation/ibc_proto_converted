// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_pubsub_v1_tx_pb = require('../../../sommelier/pubsub/v1/tx_pb.js');
var sommelier_pubsub_v1_pubsub_pb = require('../../../sommelier/pubsub/v1/pubsub_pb.js');

function serialize_pubsub_v1_MsgAddPublisherIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddPublisherIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddPublisherIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgAddPublisherIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddPublisherIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddPublisherIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgAddSubscriberIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddSubscriberIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddSubscriberIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgAddSubscriberIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddSubscriberIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddSubscriberIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgAddSubscriberRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddSubscriberRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddSubscriberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddSubscriberRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddSubscriberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgAddSubscriberResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgAddSubscriberResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgAddSubscriberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgAddSubscriberResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgAddSubscriberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemovePublisherIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemovePublisherIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemovePublisherIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemovePublisherIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemovePublisherIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemovePublisherIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemovePublisherRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemovePublisherRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemovePublisherRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemovePublisherRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemovePublisherRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemovePublisherResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemovePublisherResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemovePublisherResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemovePublisherResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemovePublisherResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemoveSubscriberIntentRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemoveSubscriberIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemoveSubscriberIntentRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemoveSubscriberIntentResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemoveSubscriberIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemoveSubscriberIntentResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemoveSubscriberRequest(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberRequest)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemoveSubscriberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemoveSubscriberRequest(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pubsub_v1_MsgRemoveSubscriberResponse(arg) {
  if (!(arg instanceof sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberResponse)) {
    throw new Error('Expected argument of type pubsub.v1.MsgRemoveSubscriberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pubsub_v1_MsgRemoveSubscriberResponse(buffer_arg) {
  return sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  removePublisher: {
    path: '/pubsub.v1.Msg/RemovePublisher',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgRemovePublisherRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgRemovePublisherResponse,
    requestSerialize: serialize_pubsub_v1_MsgRemovePublisherRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgRemovePublisherRequest,
    responseSerialize: serialize_pubsub_v1_MsgRemovePublisherResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgRemovePublisherResponse,
  },
  addSubscriber: {
    path: '/pubsub.v1.Msg/AddSubscriber',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgAddSubscriberRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgAddSubscriberResponse,
    requestSerialize: serialize_pubsub_v1_MsgAddSubscriberRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgAddSubscriberRequest,
    responseSerialize: serialize_pubsub_v1_MsgAddSubscriberResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgAddSubscriberResponse,
  },
  removeSubscriber: {
    path: '/pubsub.v1.Msg/RemoveSubscriber',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberResponse,
    requestSerialize: serialize_pubsub_v1_MsgRemoveSubscriberRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgRemoveSubscriberRequest,
    responseSerialize: serialize_pubsub_v1_MsgRemoveSubscriberResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgRemoveSubscriberResponse,
  },
  addPublisherIntent: {
    path: '/pubsub.v1.Msg/AddPublisherIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgAddPublisherIntentResponse,
    requestSerialize: serialize_pubsub_v1_MsgAddPublisherIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgAddPublisherIntentRequest,
    responseSerialize: serialize_pubsub_v1_MsgAddPublisherIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgAddPublisherIntentResponse,
  },
  removePublisherIntent: {
    path: '/pubsub.v1.Msg/RemovePublisherIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgRemovePublisherIntentResponse,
    requestSerialize: serialize_pubsub_v1_MsgRemovePublisherIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgRemovePublisherIntentRequest,
    responseSerialize: serialize_pubsub_v1_MsgRemovePublisherIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgRemovePublisherIntentResponse,
  },
  addSubscriberIntent: {
    path: '/pubsub.v1.Msg/AddSubscriberIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgAddSubscriberIntentResponse,
    requestSerialize: serialize_pubsub_v1_MsgAddSubscriberIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgAddSubscriberIntentRequest,
    responseSerialize: serialize_pubsub_v1_MsgAddSubscriberIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgAddSubscriberIntentResponse,
  },
  removeSubscriberIntent: {
    path: '/pubsub.v1.Msg/RemoveSubscriberIntent',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentRequest,
    responseType: sommelier_pubsub_v1_tx_pb.MsgRemoveSubscriberIntentResponse,
    requestSerialize: serialize_pubsub_v1_MsgRemoveSubscriberIntentRequest,
    requestDeserialize: deserialize_pubsub_v1_MsgRemoveSubscriberIntentRequest,
    responseSerialize: serialize_pubsub_v1_MsgRemoveSubscriberIntentResponse,
    responseDeserialize: deserialize_pubsub_v1_MsgRemoveSubscriberIntentResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
