# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/collector/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from comdex.collector.v1beta1 import params_pb2 as comdex_dot_collector_dot_v1beta1_dot_params__pb2
from comdex.collector.v1beta1 import collector_pb2 as comdex_dot_collector_dot_v1beta1_dot_collector__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&comdex/collector/v1beta1/genesis.proto\x12\x18\x63omdex.collector.v1beta1\x1a\x14gogoproto/gogo.proto\x1a%comdex/collector/v1beta1/params.proto\x1a(comdex/collector/v1beta1/collector.proto\"\xb5\x06\n\x0cGenesisState\x12\x8c\x01\n\x13netFeeCollectedData\x18\x01 \x03(\x0b\x32\x36.comdex.collector.v1beta1.AppAssetIdToFeeCollectedDataB\"\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"netFeeCollectedData\"R\x13netFeeCollectedData\x12\xa7\x01\n\x1c\x61ppIdToAssetCollectorMapping\x18\x02 \x03(\x0b\x32\x36.comdex.collector.v1beta1.AppToAssetIdCollectorMappingB+\xc8\xde\x1f\x00\xf2\xde\x1f#yaml:\"appIdToAssetCollectorMapping\"R\x1c\x61ppIdToAssetCollectorMapping\x12\x81\x01\n\x0f\x63ollectorLookup\x18\x03 \x03(\x0b\x32\x32.comdex.collector.v1beta1.CollectorLookupTableDataB#\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"collectorLookupTable\"R\x0f\x63ollectorLookup\x12\xa6\x01\n\x1b\x63ollectorAuctionLookupTable\x18\x04 \x03(\x0b\x32\x38.comdex.collector.v1beta1.AppAssetIdToAuctionLookupTableB*\xc8\xde\x1f\x00\xf2\xde\x1f\"yaml:\"collectorAuctionLookupTable\"R\x1b\x63ollectorAuctionLookupTable\x12\x7f\n\x12\x61ppToDenomsMapping\x18\x05 \x03(\x0b\x32,.comdex.collector.v1beta1.AppToDenomsMappingB!\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"appToDenomsMapping\"R\x12\x61ppToDenomsMapping\x12>\n\x06params\x18\x06 \x01(\x0b\x32 .comdex.collector.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xe1\x01\n\x1c\x63om.comdex.collector.v1beta1B\x0cGenesisProtoZ3github.com/comdex-official/comdex/x/collector/types\xa2\x02\x03\x43\x43X\xaa\x02\x18\x43omdex.Collector.V1beta1\xca\x02\x18\x43omdex\\Collector\\V1beta1\xe2\x02$Comdex\\Collector\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Collector::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.collector.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.comdex.collector.v1beta1B\014GenesisProtoZ3github.com/comdex-official/comdex/x/collector/types\242\002\003CCX\252\002\030Comdex.Collector.V1beta1\312\002\030Comdex\\Collector\\V1beta1\342\002$Comdex\\Collector\\V1beta1\\GPBMetadata\352\002\032Comdex::Collector::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['netFeeCollectedData']._options = None
  _globals['_GENESISSTATE'].fields_by_name['netFeeCollectedData']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"netFeeCollectedData\"'
  _globals['_GENESISSTATE'].fields_by_name['appIdToAssetCollectorMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['appIdToAssetCollectorMapping']._serialized_options = b'\310\336\037\000\362\336\037#yaml:\"appIdToAssetCollectorMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['collectorLookup']._options = None
  _globals['_GENESISSTATE'].fields_by_name['collectorLookup']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"collectorLookupTable\"'
  _globals['_GENESISSTATE'].fields_by_name['collectorAuctionLookupTable']._options = None
  _globals['_GENESISSTATE'].fields_by_name['collectorAuctionLookupTable']._serialized_options = b'\310\336\037\000\362\336\037\"yaml:\"collectorAuctionLookupTable\"'
  _globals['_GENESISSTATE'].fields_by_name['appToDenomsMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['appToDenomsMapping']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"appToDenomsMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=172
  _globals['_GENESISSTATE']._serialized_end=993
# @@protoc_insertion_point(module_scope)
