# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/claim/v1beta1/genesis.proto
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
from crescent.claim.v1beta1 import claim_pb2 as crescent_dot_claim_dot_v1beta1_dot_claim__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$crescent/claim/v1beta1/genesis.proto\x12\x16\x63rescent.claim.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\"crescent/claim/v1beta1/claim.proto\"\xa1\x01\n\x0cGenesisState\x12\x41\n\x08\x61irdrops\x18\x01 \x03(\x0b\x32\x1f.crescent.claim.v1beta1.AirdropB\x04\xc8\xde\x1f\x00R\x08\x61irdrops\x12N\n\rclaim_records\x18\x02 \x03(\x0b\x32#.crescent.claim.v1beta1.ClaimRecordB\x04\xc8\xde\x1f\x00R\x0c\x63laimRecordsB\xd9\x01\n\x1a\x63om.crescent.claim.v1beta1B\x0cGenesisProtoZ5github.com/crescent-network/crescent/v5/x/claim/types\xa2\x02\x03\x43\x43X\xaa\x02\x16\x43rescent.Claim.V1beta1\xca\x02\x16\x43rescent\\Claim\\V1beta1\xe2\x02\"Crescent\\Claim\\V1beta1\\GPBMetadata\xea\x02\x18\x43rescent::Claim::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.claim.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.crescent.claim.v1beta1B\014GenesisProtoZ5github.com/crescent-network/crescent/v5/x/claim/types\242\002\003CCX\252\002\026Crescent.Claim.V1beta1\312\002\026Crescent\\Claim\\V1beta1\342\002\"Crescent\\Claim\\V1beta1\\GPBMetadata\352\002\030Crescent::Claim::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['airdrops']._options = None
  _globals['_GENESISSTATE'].fields_by_name['airdrops']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['claim_records']._options = None
  _globals['_GENESISSTATE'].fields_by_name['claim_records']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=155
  _globals['_GENESISSTATE']._serialized_end=316
# @@protoc_insertion_point(module_scope)
