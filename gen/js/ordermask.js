// source: injective/exchange/v1beta1/exchange.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.injective.exchange.v1beta1.OrderMask');

/**
 * @enum {number}
 */
proto.injective.exchange.v1beta1.OrderMask = {
  UNUSED: 0,
  ANY: 1,
  REGULAR: 2,
  CONDITIONAL: 4,
  DIRECTION_BUY_OR_HIGHER: 8,
  DIRECTION_SELL_OR_LOWER: 16,
  TYPE_MARKET: 32,
  TYPE_LIMIT: 64
};

