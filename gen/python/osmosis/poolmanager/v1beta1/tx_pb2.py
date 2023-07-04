# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/poolmanager/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from osmosis.poolmanager.v1beta1 import swap_route_pb2 as osmosis_dot_poolmanager_dot_v1beta1_dot_swap__route__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$osmosis/poolmanager/v1beta1/tx.proto\x12\x1bosmosis.poolmanager.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a,osmosis/poolmanager/v1beta1/swap_route.proto\"\xde\x02\n\x14MsgSwapExactAmountIn\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12L\n\x06routes\x18\x02 \x03(\x0b\x32..osmosis.poolmanager.v1beta1.SwapAmountInRouteB\x04\xc8\xde\x1f\x00R\x06routes\x12M\n\x08token_in\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"token_in\"R\x07tokenIn\x12~\n\x14token_out_min_amount\x18\x04 \x01(\tBM\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1byaml:\"token_out_min_amount\"R\x11tokenOutMinAmount\"\x93\x01\n\x1cMsgSwapExactAmountInResponse\x12s\n\x10token_out_amount\x18\x01 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"token_out_amount\"R\x0etokenOutAmount\"\xdf\x02\n\x1eMsgSplitRouteSwapExactAmountIn\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12Q\n\x06routes\x18\x02 \x03(\x0b\x32\x33.osmosis.poolmanager.v1beta1.SwapAmountInSplitRouteB\x04\xc8\xde\x1f\x00R\x06routes\x12?\n\x0etoken_in_denom\x18\x03 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"token_in_denom\"R\x0ctokenInDenom\x12~\n\x14token_out_min_amount\x18\x04 \x01(\tBM\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1byaml:\"token_out_min_amount\"R\x11tokenOutMinAmount\"\x9d\x01\n&MsgSplitRouteSwapExactAmountInResponse\x12s\n\x10token_out_amount\x18\x01 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"token_out_amount\"R\x0etokenOutAmount\"\xe0\x02\n\x15MsgSwapExactAmountOut\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12M\n\x06routes\x18\x02 \x03(\x0b\x32/.osmosis.poolmanager.v1beta1.SwapAmountOutRouteB\x04\xc8\xde\x1f\x00R\x06routes\x12{\n\x13token_in_max_amount\x18\x03 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1ayaml:\"token_in_max_amount\"R\x10tokenInMaxAmount\x12P\n\ttoken_out\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"token_out\"R\x08tokenOut\"\x91\x01\n\x1dMsgSwapExactAmountOutResponse\x12p\n\x0ftoken_in_amount\x18\x01 \x01(\tBH\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x16yaml:\"token_in_amount\"R\rtokenInAmount\"\xe1\x02\n\x1fMsgSplitRouteSwapExactAmountOut\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12R\n\x06routes\x18\x02 \x03(\x0b\x32\x34.osmosis.poolmanager.v1beta1.SwapAmountOutSplitRouteB\x04\xc8\xde\x1f\x00R\x06routes\x12\x42\n\x0ftoken_out_denom\x18\x03 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"token_out_denom\"R\rtokenOutDenom\x12{\n\x13token_in_max_amount\x18\x04 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1ayaml:\"token_in_max_amount\"R\x10tokenInMaxAmount\"\x9b\x01\n\'MsgSplitRouteSwapExactAmountOutResponse\x12p\n\x0ftoken_in_amount\x18\x01 \x01(\tBH\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x16yaml:\"token_in_amount\"R\rtokenInAmount2\xd7\x04\n\x03Msg\x12\x81\x01\n\x11SwapExactAmountIn\x12\x31.osmosis.poolmanager.v1beta1.MsgSwapExactAmountIn\x1a\x39.osmosis.poolmanager.v1beta1.MsgSwapExactAmountInResponse\x12\x84\x01\n\x12SwapExactAmountOut\x12\x32.osmosis.poolmanager.v1beta1.MsgSwapExactAmountOut\x1a:.osmosis.poolmanager.v1beta1.MsgSwapExactAmountOutResponse\x12\x9f\x01\n\x1bSplitRouteSwapExactAmountIn\x12;.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountIn\x1a\x43.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountInResponse\x12\xa2\x01\n\x1cSplitRouteSwapExactAmountOut\x12<.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOut\x1a\x44.osmosis.poolmanager.v1beta1.MsgSplitRouteSwapExactAmountOutResponseB\xf1\x01\n\x1f\x63om.osmosis.poolmanager.v1beta1B\x07TxProtoP\x01Z7github.com/osmosis-labs/osmosis/v15/x/poolmanager/types\xa2\x02\x03OPX\xaa\x02\x1bOsmosis.Poolmanager.V1beta1\xca\x02\x1bOsmosis\\Poolmanager\\V1beta1\xe2\x02\'Osmosis\\Poolmanager\\V1beta1\\GPBMetadata\xea\x02\x1dOsmosis::Poolmanager::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.poolmanager.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.osmosis.poolmanager.v1beta1B\007TxProtoP\001Z7github.com/osmosis-labs/osmosis/v15/x/poolmanager/types\242\002\003OPX\252\002\033Osmosis.Poolmanager.V1beta1\312\002\033Osmosis\\Poolmanager\\V1beta1\342\002\'Osmosis\\Poolmanager\\V1beta1\\GPBMetadata\352\002\035Osmosis::Poolmanager::V1beta1'
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['sender']._options = None
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['routes']._options = None
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['routes']._serialized_options = b'\310\336\037\000'
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['token_in']._options = None
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['token_in']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"token_in\"'
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._options = None
  _MSGSWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\033yaml:\"token_out_min_amount\"'
  _MSGSWAPEXACTAMOUNTINRESPONSE.fields_by_name['token_out_amount']._options = None
  _MSGSWAPEXACTAMOUNTINRESPONSE.fields_by_name['token_out_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"token_out_amount\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['sender']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['routes']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['routes']._serialized_options = b'\310\336\037\000'
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['token_in_denom']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['token_in_denom']._serialized_options = b'\362\336\037\025yaml:\"token_in_denom\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\033yaml:\"token_out_min_amount\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTINRESPONSE.fields_by_name['token_out_amount']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTINRESPONSE.fields_by_name['token_out_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"token_out_amount\"'
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['sender']._options = None
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['routes']._options = None
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['routes']._serialized_options = b'\310\336\037\000'
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._options = None
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\032yaml:\"token_in_max_amount\"'
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['token_out']._options = None
  _MSGSWAPEXACTAMOUNTOUT.fields_by_name['token_out']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"token_out\"'
  _MSGSWAPEXACTAMOUNTOUTRESPONSE.fields_by_name['token_in_amount']._options = None
  _MSGSWAPEXACTAMOUNTOUTRESPONSE.fields_by_name['token_in_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\026yaml:\"token_in_amount\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['sender']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['routes']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['routes']._serialized_options = b'\310\336\037\000'
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['token_out_denom']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['token_out_denom']._serialized_options = b'\362\336\037\026yaml:\"token_out_denom\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\032yaml:\"token_in_max_amount\"'
  _MSGSPLITROUTESWAPEXACTAMOUNTOUTRESPONSE.fields_by_name['token_in_amount']._options = None
  _MSGSPLITROUTESWAPEXACTAMOUNTOUTRESPONSE.fields_by_name['token_in_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\026yaml:\"token_in_amount\"'
  _globals['_MSGSWAPEXACTAMOUNTIN']._serialized_start=170
  _globals['_MSGSWAPEXACTAMOUNTIN']._serialized_end=520
  _globals['_MSGSWAPEXACTAMOUNTINRESPONSE']._serialized_start=523
  _globals['_MSGSWAPEXACTAMOUNTINRESPONSE']._serialized_end=670
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTIN']._serialized_start=673
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTIN']._serialized_end=1024
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTINRESPONSE']._serialized_start=1027
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTINRESPONSE']._serialized_end=1184
  _globals['_MSGSWAPEXACTAMOUNTOUT']._serialized_start=1187
  _globals['_MSGSWAPEXACTAMOUNTOUT']._serialized_end=1539
  _globals['_MSGSWAPEXACTAMOUNTOUTRESPONSE']._serialized_start=1542
  _globals['_MSGSWAPEXACTAMOUNTOUTRESPONSE']._serialized_end=1687
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTOUT']._serialized_start=1690
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTOUT']._serialized_end=2043
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTOUTRESPONSE']._serialized_start=2046
  _globals['_MSGSPLITROUTESWAPEXACTAMOUNTOUTRESPONSE']._serialized_end=2201
  _globals['_MSG']._serialized_start=2204
  _globals['_MSG']._serialized_end=2803
# @@protoc_insertion_point(module_scope)