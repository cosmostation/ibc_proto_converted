// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_oracle_v1beta1_tx_pb = require('../../../injective/oracle/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var injective_oracle_v1beta1_oracle_pb = require('../../../injective/oracle/v1beta1/oracle_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_injective_oracle_v1beta1_MsgRelayBandRates(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayBandRates)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayBandRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayBandRates(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayBandRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayBandRatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayBandRatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayBandRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayBandRatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayBandRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessages(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessages)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayCoinbaseMessages');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessages(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessages.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessagesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayCoinbaseMessagesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessagesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayPriceFeedPrice(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPrice)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayPriceFeedPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayPriceFeedPrice(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPriceResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayPriceFeedPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayProviderPrices(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayProviderPrices)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayProviderPrices');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayProviderPrices(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayProviderPrices.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayProviderPricesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayProviderPricesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayProviderPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayProviderPricesResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayProviderPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayPythPrices(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayPythPrices)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayPythPrices');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayPythPrices(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayPythPrices.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRelayPythPricesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRelayPythPricesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRelayPythPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRelayPythPricesResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRelayPythPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRequestBandIBCRates(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRates)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRequestBandIBCRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRequestBandIBCRates(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgRequestBandIBCRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_oracle_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service.
var MsgService = exports.MsgService = {
  // RelayProviderPrice defines a method for relaying a price for a
// provider-based oracle
relayProviderPrices: {
    path: '/injective.oracle.v1beta1.Msg/RelayProviderPrices',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRelayProviderPrices,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRelayProviderPricesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRelayProviderPrices,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayProviderPrices,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRelayProviderPricesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayProviderPricesResponse,
  },
  // RelayPriceFeedPrice defines a method for relaying a price for a price
// feeder-based oracle
relayPriceFeedPrice: {
    path: '/injective.oracle.v1beta1.Msg/RelayPriceFeedPrice',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPrice,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRelayPriceFeedPriceResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRelayPriceFeedPrice,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayPriceFeedPrice,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayPriceFeedPriceResponse,
  },
  // RelayBandRates defines a method for relaying rates from Band
relayBandRates: {
    path: '/injective.oracle.v1beta1.Msg/RelayBandRates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRelayBandRates,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRelayBandRatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRelayBandRates,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayBandRates,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRelayBandRatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayBandRatesResponse,
  },
  // RequestBandIBCRates defines a method for fetching rates from Band ibc
requestBandIBCRates: {
    path: '/injective.oracle.v1beta1.Msg/RequestBandIBCRates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRates,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRequestBandIBCRatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRequestBandIBCRates,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRequestBandIBCRates,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRequestBandIBCRatesResponse,
  },
  // RelayCoinbaseMessages defines a method for relaying price messages from
// Coinbase API
relayCoinbaseMessages: {
    path: '/injective.oracle.v1beta1.Msg/RelayCoinbaseMessages',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessages,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRelayCoinbaseMessagesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessages,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessages,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayCoinbaseMessagesResponse,
  },
  // RelayPythPrices defines a method for relaying rates from the Pyth contract
relayPythPrices: {
    path: '/injective.oracle.v1beta1.Msg/RelayPythPrices',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgRelayPythPrices,
    responseType: injective_oracle_v1beta1_tx_pb.MsgRelayPythPricesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgRelayPythPrices,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayPythPrices,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgRelayPythPricesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgRelayPythPricesResponse,
  },
  //  UpdateParams enables updating oracle module's params via governance
updateParams: {
    path: '/injective.oracle.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_oracle_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_oracle_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_oracle_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
