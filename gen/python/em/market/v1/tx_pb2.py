# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/market/v1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from em.market.v1 import market_pb2 as em_dot_market_dot_v1_dot_market__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x15\x65m/market/v1/tx.proto\x12\x0c\x65m.market.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x65m/market/v1/market.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfa\x02\n\x10MsgAddLimitOrder\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x42\n\x0f\x63lient_order_id\x18\x02 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"client_order_id\"R\rclientOrderId\x12W\n\rtime_in_force\x18\x03 \x01(\x0e\x32\x19.em.market.v1.TimeInForceB\x18\xf2\xde\x1f\x14yaml:\"time_in_force\"R\x0btimeInForce\x12H\n\x06source\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12W\n\x0b\x64\x65stination\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\"\x1a\n\x18MsgAddLimitOrderResponse\"\xe2\x03\n\x11MsgAddMarketOrder\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x42\n\x0f\x63lient_order_id\x18\x02 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"client_order_id\"R\rclientOrderId\x12W\n\rtime_in_force\x18\x03 \x01(\x0e\x32\x19.em.market.v1.TimeInForceB\x18\xf2\xde\x1f\x14yaml:\"time_in_force\"R\x0btimeInForce\x12)\n\x06source\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12W\n\x0b\x64\x65stination\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\x12\x83\x01\n\x10maximum_slippage\x18\x06 \x01(\tBX\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xe2\xde\x1f\x0bMaxSlippage\xf2\xde\x1f\x17yaml:\"maximum_slippage\"R\x0fmaximumSlippage\"\x1b\n\x19MsgAddMarketOrderResponse\"|\n\x0eMsgCancelOrder\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x42\n\x0f\x63lient_order_id\x18\x02 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"client_order_id\"R\rclientOrderId\"\x18\n\x16MsgCancelOrderResponse\"\x96\x04\n\x1aMsgCancelReplaceLimitOrder\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12q\n\x18original_client_order_id\x18\x02 \x01(\tB8\xe2\xde\x1f\x11OrigClientOrderId\xf2\xde\x1f\x1fyaml:\"original_client_order_id\"R\x15originalClientOrderId\x12\x61\n\x13new_client_order_id\x18\x03 \x01(\tB2\xe2\xde\x1f\x10NewClientOrderId\xf2\xde\x1f\x1ayaml:\"new_client_order_id\"R\x10newClientOrderId\x12W\n\rtime_in_force\x18\x04 \x01(\x0e\x32\x19.em.market.v1.TimeInForceB\x18\xf2\xde\x1f\x14yaml:\"time_in_force\"R\x0btimeInForce\x12H\n\x06source\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12W\n\x0b\x64\x65stination\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\"$\n\"MsgCancelReplaceLimitOrderResponse\"\xfe\x04\n\x1bMsgCancelReplaceMarketOrder\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12q\n\x18original_client_order_id\x18\x02 \x01(\tB8\xe2\xde\x1f\x11OrigClientOrderId\xf2\xde\x1f\x1fyaml:\"original_client_order_id\"R\x15originalClientOrderId\x12\x61\n\x13new_client_order_id\x18\x03 \x01(\tB2\xe2\xde\x1f\x10NewClientOrderId\xf2\xde\x1f\x1ayaml:\"new_client_order_id\"R\x10newClientOrderId\x12W\n\rtime_in_force\x18\x04 \x01(\x0e\x32\x19.em.market.v1.TimeInForceB\x18\xf2\xde\x1f\x14yaml:\"time_in_force\"R\x0btimeInForce\x12)\n\x06source\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12W\n\x0b\x64\x65stination\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\x12\x83\x01\n\x10maximum_slippage\x18\x07 \x01(\tBX\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xe2\xde\x1f\x0bMaxSlippage\xf2\xde\x1f\x17yaml:\"maximum_slippage\"R\x0fmaximumSlippage\"%\n#MsgCancelReplaceMarketOrderResponse2\xfe\x03\n\x03Msg\x12W\n\rAddLimitOrder\x12\x1e.em.market.v1.MsgAddLimitOrder\x1a&.em.market.v1.MsgAddLimitOrderResponse\x12Z\n\x0e\x41\x64\x64MarketOrder\x12\x1f.em.market.v1.MsgAddMarketOrder\x1a\'.em.market.v1.MsgAddMarketOrderResponse\x12Q\n\x0b\x43\x61ncelOrder\x12\x1c.em.market.v1.MsgCancelOrder\x1a$.em.market.v1.MsgCancelOrderResponse\x12u\n\x17\x43\x61ncelReplaceLimitOrder\x12(.em.market.v1.MsgCancelReplaceLimitOrder\x1a\x30.em.market.v1.MsgCancelReplaceLimitOrderResponse\x12x\n\x18\x43\x61ncelReplaceMarketOrder\x12).em.market.v1.MsgCancelReplaceMarketOrder\x1a\x31.em.market.v1.MsgCancelReplaceMarketOrderResponseB\x98\x01\n\x10\x63om.em.market.v1B\x07TxProtoZ+github.com/e-money/em-ledger/x/market/types\xa2\x02\x03\x45MX\xaa\x02\x0c\x45m.Market.V1\xca\x02\x0c\x45m\\Market\\V1\xe2\x02\x18\x45m\\Market\\V1\\GPBMetadata\xea\x02\x0e\x45m::Market::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.market.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.em.market.v1B\007TxProtoZ+github.com/e-money/em-ledger/x/market/types\242\002\003EMX\252\002\014Em.Market.V1\312\002\014Em\\Market\\V1\342\002\030Em\\Market\\V1\\GPBMetadata\352\002\016Em::Market::V1'
  _globals['_MSGADDLIMITORDER'].fields_by_name['owner']._options = None
  _globals['_MSGADDLIMITORDER'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGADDLIMITORDER'].fields_by_name['client_order_id']._options = None
  _globals['_MSGADDLIMITORDER'].fields_by_name['client_order_id']._serialized_options = b'\362\336\037\026yaml:\"client_order_id\"'
  _globals['_MSGADDLIMITORDER'].fields_by_name['time_in_force']._options = None
  _globals['_MSGADDLIMITORDER'].fields_by_name['time_in_force']._serialized_options = b'\362\336\037\024yaml:\"time_in_force\"'
  _globals['_MSGADDLIMITORDER'].fields_by_name['source']._options = None
  _globals['_MSGADDLIMITORDER'].fields_by_name['source']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"source\"'
  _globals['_MSGADDLIMITORDER'].fields_by_name['destination']._options = None
  _globals['_MSGADDLIMITORDER'].fields_by_name['destination']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"destination\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['owner']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['client_order_id']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['client_order_id']._serialized_options = b'\362\336\037\026yaml:\"client_order_id\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['time_in_force']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['time_in_force']._serialized_options = b'\362\336\037\024yaml:\"time_in_force\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['source']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['source']._serialized_options = b'\362\336\037\ryaml:\"source\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['destination']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['destination']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"destination\"'
  _globals['_MSGADDMARKETORDER'].fields_by_name['maximum_slippage']._options = None
  _globals['_MSGADDMARKETORDER'].fields_by_name['maximum_slippage']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\342\336\037\013MaxSlippage\362\336\037\027yaml:\"maximum_slippage\"'
  _globals['_MSGCANCELORDER'].fields_by_name['owner']._options = None
  _globals['_MSGCANCELORDER'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGCANCELORDER'].fields_by_name['client_order_id']._options = None
  _globals['_MSGCANCELORDER'].fields_by_name['client_order_id']._serialized_options = b'\362\336\037\026yaml:\"client_order_id\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['owner']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['original_client_order_id']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['original_client_order_id']._serialized_options = b'\342\336\037\021OrigClientOrderId\362\336\037\037yaml:\"original_client_order_id\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['new_client_order_id']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['new_client_order_id']._serialized_options = b'\342\336\037\020NewClientOrderId\362\336\037\032yaml:\"new_client_order_id\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['time_in_force']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['time_in_force']._serialized_options = b'\362\336\037\024yaml:\"time_in_force\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['source']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['source']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"source\"'
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['destination']._options = None
  _globals['_MSGCANCELREPLACELIMITORDER'].fields_by_name['destination']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"destination\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['owner']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['original_client_order_id']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['original_client_order_id']._serialized_options = b'\342\336\037\021OrigClientOrderId\362\336\037\037yaml:\"original_client_order_id\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['new_client_order_id']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['new_client_order_id']._serialized_options = b'\342\336\037\020NewClientOrderId\362\336\037\032yaml:\"new_client_order_id\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['time_in_force']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['time_in_force']._serialized_options = b'\362\336\037\024yaml:\"time_in_force\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['source']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['source']._serialized_options = b'\362\336\037\ryaml:\"source\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['destination']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['destination']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"destination\"'
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['maximum_slippage']._options = None
  _globals['_MSGCANCELREPLACEMARKETORDER'].fields_by_name['maximum_slippage']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\342\336\037\013MaxSlippage\362\336\037\027yaml:\"maximum_slippage\"'
  _globals['_MSGADDLIMITORDER']._serialized_start=154
  _globals['_MSGADDLIMITORDER']._serialized_end=532
  _globals['_MSGADDLIMITORDERRESPONSE']._serialized_start=534
  _globals['_MSGADDLIMITORDERRESPONSE']._serialized_end=560
  _globals['_MSGADDMARKETORDER']._serialized_start=563
  _globals['_MSGADDMARKETORDER']._serialized_end=1045
  _globals['_MSGADDMARKETORDERRESPONSE']._serialized_start=1047
  _globals['_MSGADDMARKETORDERRESPONSE']._serialized_end=1074
  _globals['_MSGCANCELORDER']._serialized_start=1076
  _globals['_MSGCANCELORDER']._serialized_end=1200
  _globals['_MSGCANCELORDERRESPONSE']._serialized_start=1202
  _globals['_MSGCANCELORDERRESPONSE']._serialized_end=1226
  _globals['_MSGCANCELREPLACELIMITORDER']._serialized_start=1229
  _globals['_MSGCANCELREPLACELIMITORDER']._serialized_end=1763
  _globals['_MSGCANCELREPLACELIMITORDERRESPONSE']._serialized_start=1765
  _globals['_MSGCANCELREPLACELIMITORDERRESPONSE']._serialized_end=1801
  _globals['_MSGCANCELREPLACEMARKETORDER']._serialized_start=1804
  _globals['_MSGCANCELREPLACEMARKETORDER']._serialized_end=2442
  _globals['_MSGCANCELREPLACEMARKETORDERRESPONSE']._serialized_start=2444
  _globals['_MSGCANCELREPLACEMARKETORDERRESPONSE']._serialized_end=2481
  _globals['_MSG']._serialized_start=2484
  _globals['_MSG']._serialized_end=2994
# @@protoc_insertion_point(module_scope)
