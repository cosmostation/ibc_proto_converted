# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/protorev/v1beta1/protorev.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'osmosis/protorev/v1beta1/protorev.proto\x12\x18osmosis.protorev.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xd8\x01\n\x12TokenPairArbRoutes\x12Y\n\narb_routes\x18\x01 \x03(\x0b\x32\x1f.osmosis.protorev.v1beta1.RouteB\x19\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"arb_routes\"R\tarbRoutes\x12.\n\x08token_in\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"token_in\"R\x07tokenIn\x12\x31\n\ttoken_out\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"token_out\"R\x08tokenOut:\x04\xe8\xa0\x1f\x01\"\xbe\x01\n\x05Route\x12N\n\x06trades\x18\x01 \x03(\x0b\x32\x1f.osmosis.protorev.v1beta1.TradeB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"trades\"R\x06trades\x12_\n\tstep_size\x18\x02 \x01(\tBB\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x10yaml:\"step_size\"R\x08stepSize:\x04\xe8\xa0\x1f\x01\"\x95\x01\n\x05Trade\x12#\n\x04pool\x18\x01 \x01(\x04\x42\x0f\xf2\xde\x1f\x0byaml:\"pool\"R\x04pool\x12.\n\x08token_in\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"token_in\"R\x07tokenIn\x12\x31\n\ttoken_out\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"token_out\"R\x08tokenOut:\x04\xe8\xa0\x1f\x01\"\xfb\x01\n\x0fRouteStatistics\x12K\n\x07profits\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x16\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"profits\"R\x07profits\x12s\n\x10number_of_trades\x18\x02 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"number_of_trades\"R\x0enumberOfTrades\x12&\n\x05route\x18\x03 \x03(\x04\x42\x10\xf2\xde\x1f\x0cyaml:\"route\"R\x05route\"\xe2\x01\n\x0bPoolWeights\x12=\n\rstable_weight\x18\x01 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"stable_weight\"R\x0cstableWeight\x12\x43\n\x0f\x62\x61lancer_weight\x18\x02 \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"balancer_weight\"R\x0e\x62\x61lancerWeight\x12O\n\x13\x63oncentrated_weight\x18\x03 \x01(\x04\x42\x1e\xf2\xde\x1f\x1ayaml:\"concentrated_weight\"R\x12\x63oncentratedWeight\"\x94\x01\n\tBaseDenom\x12&\n\x05\x64\x65nom\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\x12_\n\tstep_size\x18\x02 \x01(\tBB\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x10yaml:\"step_size\"R\x08stepSizeB\xe3\x01\n\x1c\x63om.osmosis.protorev.v1beta1B\rProtorevProtoZ4github.com/osmosis-labs/osmosis/v15/x/protorev/types\xa2\x02\x03OPX\xaa\x02\x18Osmosis.Protorev.V1beta1\xca\x02\x18Osmosis\\Protorev\\V1beta1\xe2\x02$Osmosis\\Protorev\\V1beta1\\GPBMetadata\xea\x02\x1aOsmosis::Protorev::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.protorev.v1beta1.protorev_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.osmosis.protorev.v1beta1B\rProtorevProtoZ4github.com/osmosis-labs/osmosis/v15/x/protorev/types\242\002\003OPX\252\002\030Osmosis.Protorev.V1beta1\312\002\030Osmosis\\Protorev\\V1beta1\342\002$Osmosis\\Protorev\\V1beta1\\GPBMetadata\352\002\032Osmosis::Protorev::V1beta1'
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['arb_routes']._options = None
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['arb_routes']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"arb_routes\"'
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['token_in']._options = None
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['token_in']._serialized_options = b'\362\336\037\017yaml:\"token_in\"'
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['token_out']._options = None
  _globals['_TOKENPAIRARBROUTES'].fields_by_name['token_out']._serialized_options = b'\362\336\037\020yaml:\"token_out\"'
  _globals['_TOKENPAIRARBROUTES']._options = None
  _globals['_TOKENPAIRARBROUTES']._serialized_options = b'\350\240\037\001'
  _globals['_ROUTE'].fields_by_name['trades']._options = None
  _globals['_ROUTE'].fields_by_name['trades']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"trades\"'
  _globals['_ROUTE'].fields_by_name['step_size']._options = None
  _globals['_ROUTE'].fields_by_name['step_size']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\020yaml:\"step_size\"'
  _globals['_ROUTE']._options = None
  _globals['_ROUTE']._serialized_options = b'\350\240\037\001'
  _globals['_TRADE'].fields_by_name['pool']._options = None
  _globals['_TRADE'].fields_by_name['pool']._serialized_options = b'\362\336\037\013yaml:\"pool\"'
  _globals['_TRADE'].fields_by_name['token_in']._options = None
  _globals['_TRADE'].fields_by_name['token_in']._serialized_options = b'\362\336\037\017yaml:\"token_in\"'
  _globals['_TRADE'].fields_by_name['token_out']._options = None
  _globals['_TRADE'].fields_by_name['token_out']._serialized_options = b'\362\336\037\020yaml:\"token_out\"'
  _globals['_TRADE']._options = None
  _globals['_TRADE']._serialized_options = b'\350\240\037\001'
  _globals['_ROUTESTATISTICS'].fields_by_name['profits']._options = None
  _globals['_ROUTESTATISTICS'].fields_by_name['profits']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"profits\"'
  _globals['_ROUTESTATISTICS'].fields_by_name['number_of_trades']._options = None
  _globals['_ROUTESTATISTICS'].fields_by_name['number_of_trades']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"number_of_trades\"'
  _globals['_ROUTESTATISTICS'].fields_by_name['route']._options = None
  _globals['_ROUTESTATISTICS'].fields_by_name['route']._serialized_options = b'\362\336\037\014yaml:\"route\"'
  _globals['_POOLWEIGHTS'].fields_by_name['stable_weight']._options = None
  _globals['_POOLWEIGHTS'].fields_by_name['stable_weight']._serialized_options = b'\362\336\037\024yaml:\"stable_weight\"'
  _globals['_POOLWEIGHTS'].fields_by_name['balancer_weight']._options = None
  _globals['_POOLWEIGHTS'].fields_by_name['balancer_weight']._serialized_options = b'\362\336\037\026yaml:\"balancer_weight\"'
  _globals['_POOLWEIGHTS'].fields_by_name['concentrated_weight']._options = None
  _globals['_POOLWEIGHTS'].fields_by_name['concentrated_weight']._serialized_options = b'\362\336\037\032yaml:\"concentrated_weight\"'
  _globals['_BASEDENOM'].fields_by_name['denom']._options = None
  _globals['_BASEDENOM'].fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _globals['_BASEDENOM'].fields_by_name['step_size']._options = None
  _globals['_BASEDENOM'].fields_by_name['step_size']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\020yaml:\"step_size\"'
  _globals['_TOKENPAIRARBROUTES']._serialized_start=151
  _globals['_TOKENPAIRARBROUTES']._serialized_end=367
  _globals['_ROUTE']._serialized_start=370
  _globals['_ROUTE']._serialized_end=560
  _globals['_TRADE']._serialized_start=563
  _globals['_TRADE']._serialized_end=712
  _globals['_ROUTESTATISTICS']._serialized_start=715
  _globals['_ROUTESTATISTICS']._serialized_end=966
  _globals['_POOLWEIGHTS']._serialized_start=969
  _globals['_POOLWEIGHTS']._serialized_end=1195
  _globals['_BASEDENOM']._serialized_start=1198
  _globals['_BASEDENOM']._serialized_end=1346
# @@protoc_insertion_point(module_scope)
