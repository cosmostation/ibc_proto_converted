// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_exchange_v1beta1_tx_pb = require('../../../injective/exchange/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_distribution_v1beta1_distribution_pb = require('../../../cosmos/distribution/v1beta1/distribution_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var injective_exchange_v1beta1_exchange_pb = require('../../../injective/exchange/v1beta1/exchange_pb.js');
var injective_oracle_v1beta1_oracle_pb = require('../../../injective/oracle/v1beta1/oracle_pb.js');

function serialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarket(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarket)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarket(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarket.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarketResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarketResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarketResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelBinaryOptionsOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelBinaryOptionsOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelDerivativeOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelDerivativeOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelSpotOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCancelSpotOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCreateDerivativeLimitOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCreateSpotLimitOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchCreateSpotLimitOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchUpdateOrders(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrders)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchUpdateOrders');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchUpdateOrders(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrders.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgBatchUpdateOrdersResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrdersResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgBatchUpdateOrdersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgBatchUpdateOrdersResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrdersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelBinaryOptionsOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelBinaryOptionsOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelDerivativeOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelDerivativeOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelDerivativeOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelDerivativeOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelDerivativeOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelDerivativeOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelSpotOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelSpotOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelSpotOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCancelSpotOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCancelSpotOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCancelSpotOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateBinaryOptionsLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateBinaryOptionsLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateBinaryOptionsMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateBinaryOptionsMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateDerivativeLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateDerivativeLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateDerivativeMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateDerivativeMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateSpotLimitOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateSpotLimitOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrder(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrder)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateSpotMarketOrder');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrder(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrder.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrderResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrderResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgCreateSpotMarketOrderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrderResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgDeposit(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgDeposit(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgDepositResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgExternalTransfer(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgExternalTransfer)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgExternalTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgExternalTransfer(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgExternalTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgExternalTransferResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgExternalTransferResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgExternalTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgExternalTransferResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgExternalTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgIncreasePositionMargin(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMargin)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgIncreasePositionMargin');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgIncreasePositionMargin(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMargin.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgIncreasePositionMarginResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMarginResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgIncreasePositionMarginResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgIncreasePositionMarginResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMarginResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunch(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunch)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantBinaryOptionsMarketLaunch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunch(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunchResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunchResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantBinaryOptionsMarketLaunchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunchResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunch(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunch)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantExpiryFuturesMarketLaunch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunch(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunchResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunchResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantExpiryFuturesMarketLaunchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunchResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunch(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunch)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantPerpetualMarketLaunch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunch(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunchResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunchResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantPerpetualMarketLaunchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunchResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunch(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunch)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantSpotMarketLaunch');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunch(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunch.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunchResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunchResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgInstantSpotMarketLaunchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunchResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgLiquidatePosition(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgLiquidatePosition)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgLiquidatePosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgLiquidatePosition(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgLiquidatePosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgLiquidatePositionResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgLiquidatePositionResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgLiquidatePositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgLiquidatePositionResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgLiquidatePositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContract(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContract)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgPrivilegedExecuteContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContract(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContractResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContractResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgPrivilegedExecuteContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContractResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgReclaimLockedFunds(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFunds)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgReclaimLockedFunds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgReclaimLockedFunds(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFunds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgReclaimLockedFundsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFundsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgReclaimLockedFundsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgReclaimLockedFundsResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFundsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgRewardsOptOut(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgRewardsOptOut)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgRewardsOptOut');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgRewardsOptOut(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgRewardsOptOut.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgRewardsOptOutResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgRewardsOptOutResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgRewardsOptOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgRewardsOptOutResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgRewardsOptOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgSubaccountTransfer(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgSubaccountTransfer)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgSubaccountTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgSubaccountTransfer(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgSubaccountTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgSubaccountTransferResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgSubaccountTransferResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgSubaccountTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgSubaccountTransferResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgSubaccountTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgWithdraw(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgWithdraw)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgWithdraw');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgWithdraw(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgWithdraw.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_exchange_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof injective_exchange_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type injective.exchange.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_exchange_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return injective_exchange_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the exchange Msg service.
var MsgService = exports.MsgService = {
  // Deposit defines a method for transferring coins from the sender's bank
// balance into the subaccount's exchange deposits
deposit: {
    path: '/injective.exchange.v1beta1.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgDeposit,
    responseType: injective_exchange_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgDeposit,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgDeposit,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgDepositResponse,
  },
  // Withdraw defines a method for withdrawing coins from a subaccount's
// deposits to the user's bank balance
withdraw: {
    path: '/injective.exchange.v1beta1.Msg/Withdraw',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgWithdraw,
    responseType: injective_exchange_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgWithdraw,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgWithdraw,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgWithdrawResponse,
  },
  // InstantSpotMarketLaunch defines method for creating a spot market by paying
// listing fee without governance
instantSpotMarketLaunch: {
    path: '/injective.exchange.v1beta1.Msg/InstantSpotMarketLaunch',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunch,
    responseType: injective_exchange_v1beta1_tx_pb.MsgInstantSpotMarketLaunchResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunch,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunch,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunchResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantSpotMarketLaunchResponse,
  },
  // InstantPerpetualMarketLaunch defines a method for creating a new perpetual
// futures market by paying listing fee without governance
instantPerpetualMarketLaunch: {
    path: '/injective.exchange.v1beta1.Msg/InstantPerpetualMarketLaunch',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunch,
    responseType: injective_exchange_v1beta1_tx_pb.MsgInstantPerpetualMarketLaunchResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunch,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunch,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunchResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantPerpetualMarketLaunchResponse,
  },
  // InstantExpiryFuturesMarketLaunch defines a method for creating a new expiry
// futures market by paying listing fee without governance
instantExpiryFuturesMarketLaunch: {
    path: '/injective.exchange.v1beta1.Msg/InstantExpiryFuturesMarketLaunch',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunch,
    responseType: injective_exchange_v1beta1_tx_pb.MsgInstantExpiryFuturesMarketLaunchResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunch,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunch,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunchResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantExpiryFuturesMarketLaunchResponse,
  },
  // CreateSpotLimitOrder defines a method for creating a new spot limit order.
createSpotLimitOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateSpotLimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateSpotLimitOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateSpotLimitOrderResponse,
  },
  // BatchCreateSpotLimitOrder defines a method for creating a new batch of spot
// limit orders.
batchCreateSpotLimitOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchCreateSpotLimitOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchCreateSpotLimitOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCreateSpotLimitOrdersResponse,
  },
  // CreateSpotMarketOrder defines a method for creating a new spot market
// order.
createSpotMarketOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateSpotMarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateSpotMarketOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateSpotMarketOrderResponse,
  },
  // MsgCancelSpotOrder defines a method for cancelling a spot order.
cancelSpotOrder: {
    path: '/injective.exchange.v1beta1.Msg/CancelSpotOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCancelSpotOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCancelSpotOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelSpotOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCancelSpotOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelSpotOrderResponse,
  },
  // BatchCancelSpotOrders defines a method for cancelling a batch of spot
// orders in a given market.
batchCancelSpotOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchCancelSpotOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelSpotOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelSpotOrdersResponse,
  },
  // BatchUpdateOrders defines a method for updating a batch of orders.
batchUpdateOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchUpdateOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchUpdateOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchUpdateOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchUpdateOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchUpdateOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchUpdateOrdersResponse,
  },
  // PrivilegedExecuteContract defines a method for executing a Cosmwasm
// contract from the exchange module with privileged capabilities.
privilegedExecuteContract: {
    path: '/injective.exchange.v1beta1.Msg/PrivilegedExecuteContract',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContract,
    responseType: injective_exchange_v1beta1_tx_pb.MsgPrivilegedExecuteContractResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContract,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContract,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContractResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgPrivilegedExecuteContractResponse,
  },
  // CreateDerivativeLimitOrder defines a method for creating a new derivative
// limit order.
createDerivativeLimitOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateDerivativeLimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeLimitOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateDerivativeLimitOrderResponse,
  },
  // BatchCreateDerivativeLimitOrders defines a method for creating a new batch
// of derivative limit orders.
batchCreateDerivativeLimitOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchCreateDerivativeLimitOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchCreateDerivativeLimitOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCreateDerivativeLimitOrdersResponse,
  },
  // MsgCreateDerivativeLimitOrder defines a method for creating a new
// derivative market order.
createDerivativeMarketOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateDerivativeMarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateDerivativeMarketOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateDerivativeMarketOrderResponse,
  },
  // MsgCancelDerivativeOrder defines a method for cancelling a derivative
// order.
cancelDerivativeOrder: {
    path: '/injective.exchange.v1beta1.Msg/CancelDerivativeOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCancelDerivativeOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCancelDerivativeOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelDerivativeOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCancelDerivativeOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelDerivativeOrderResponse,
  },
  // MsgBatchCancelDerivativeOrders defines a method for cancelling a batch of
// derivative limit orders.
batchCancelDerivativeOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchCancelDerivativeOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelDerivativeOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelDerivativeOrdersResponse,
  },
  // InstantBinaryOptionsMarketLaunch defines method for creating a binary
// options market by paying listing fee without governance
instantBinaryOptionsMarketLaunch: {
    path: '/injective.exchange.v1beta1.Msg/InstantBinaryOptionsMarketLaunch',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunch,
    responseType: injective_exchange_v1beta1_tx_pb.MsgInstantBinaryOptionsMarketLaunchResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunch,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunch,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunchResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgInstantBinaryOptionsMarketLaunchResponse,
  },
  // CreateBinaryOptionsLimitOrder defines a method for creating a new binary
// options limit order.
createBinaryOptionsLimitOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateBinaryOptionsLimitOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsLimitOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsLimitOrderResponse,
  },
  // CreateBinaryOptionsMarketOrder defines a method for creating a new binary
// options market order.
createBinaryOptionsMarketOrder: {
    path: '/injective.exchange.v1beta1.Msg/CreateBinaryOptionsMarketOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCreateBinaryOptionsMarketOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCreateBinaryOptionsMarketOrderResponse,
  },
  // MsgCancelBinaryOptionsOrder defines a method for cancelling a binary
// options order.
cancelBinaryOptionsOrder: {
    path: '/injective.exchange.v1beta1.Msg/CancelBinaryOptionsOrder',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrder,
    responseType: injective_exchange_v1beta1_tx_pb.MsgCancelBinaryOptionsOrderResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrder,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrder,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrderResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgCancelBinaryOptionsOrderResponse,
  },
  // BatchCancelBinaryOptionsOrders defines a method for cancelling a batch of
// binary options limit orders.
batchCancelBinaryOptionsOrders: {
    path: '/injective.exchange.v1beta1.Msg/BatchCancelBinaryOptionsOrders',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrders,
    responseType: injective_exchange_v1beta1_tx_pb.MsgBatchCancelBinaryOptionsOrdersResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrders,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrders,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrdersResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgBatchCancelBinaryOptionsOrdersResponse,
  },
  // SubaccountTransfer defines a method for transfer between subaccounts
subaccountTransfer: {
    path: '/injective.exchange.v1beta1.Msg/SubaccountTransfer',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgSubaccountTransfer,
    responseType: injective_exchange_v1beta1_tx_pb.MsgSubaccountTransferResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgSubaccountTransfer,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgSubaccountTransfer,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgSubaccountTransferResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgSubaccountTransferResponse,
  },
  // ExternalTransfer defines a method for transfer between external accounts
externalTransfer: {
    path: '/injective.exchange.v1beta1.Msg/ExternalTransfer',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgExternalTransfer,
    responseType: injective_exchange_v1beta1_tx_pb.MsgExternalTransferResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgExternalTransfer,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgExternalTransfer,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgExternalTransferResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgExternalTransferResponse,
  },
  // LiquidatePosition defines a method for liquidating a position
liquidatePosition: {
    path: '/injective.exchange.v1beta1.Msg/LiquidatePosition',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgLiquidatePosition,
    responseType: injective_exchange_v1beta1_tx_pb.MsgLiquidatePositionResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgLiquidatePosition,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgLiquidatePosition,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgLiquidatePositionResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgLiquidatePositionResponse,
  },
  // IncreasePositionMargin defines a method for increasing margin of a position
increasePositionMargin: {
    path: '/injective.exchange.v1beta1.Msg/IncreasePositionMargin',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMargin,
    responseType: injective_exchange_v1beta1_tx_pb.MsgIncreasePositionMarginResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgIncreasePositionMargin,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgIncreasePositionMargin,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgIncreasePositionMarginResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgIncreasePositionMarginResponse,
  },
  // RewardsOptOut defines a method for opting out of rewards
rewardsOptOut: {
    path: '/injective.exchange.v1beta1.Msg/RewardsOptOut',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgRewardsOptOut,
    responseType: injective_exchange_v1beta1_tx_pb.MsgRewardsOptOutResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgRewardsOptOut,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgRewardsOptOut,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgRewardsOptOutResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgRewardsOptOutResponse,
  },
  // AdminUpdateBinaryOptionsMarket defines method for updating a binary options
// market by admin
adminUpdateBinaryOptionsMarket: {
    path: '/injective.exchange.v1beta1.Msg/AdminUpdateBinaryOptionsMarket',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarket,
    responseType: injective_exchange_v1beta1_tx_pb.MsgAdminUpdateBinaryOptionsMarketResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarket,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarket,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarketResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgAdminUpdateBinaryOptionsMarketResponse,
  },
  //
reclaimLockedFunds: {
    path: '/injective.exchange.v1beta1.Msg/ReclaimLockedFunds',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFunds,
    responseType: injective_exchange_v1beta1_tx_pb.MsgReclaimLockedFundsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgReclaimLockedFunds,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgReclaimLockedFunds,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgReclaimLockedFundsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgReclaimLockedFundsResponse,
  },
  updateParams: {
    path: '/injective.exchange.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_exchange_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_exchange_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_exchange_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_exchange_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_exchange_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_exchange_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
