# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/txfees/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.txfees.v1beta1 import feetoken_pb2 as osmosis_dot_txfees_dot_v1beta1_dot_feetoken__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$osmosis/txfees/v1beta1/genesis.proto\x12\x16osmosis.txfees.v1beta1\x1a\x14gogoproto/gogo.proto\x1a%osmosis/txfees/v1beta1/feetoken.proto\"r\n\x0cGenesisState\x12\x1c\n\tbasedenom\x18\x01 \x01(\tR\tbasedenom\x12\x44\n\tfeetokens\x18\x02 \x03(\x0b\x32 .osmosis.txfees.v1beta1.FeeTokenB\x04\xc8\xde\x1f\x00R\tfeetokensB\xd6\x01\n\x1a\x63om.osmosis.txfees.v1beta1B\x0cGenesisProtoZ2github.com/osmosis-labs/osmosis/v15/x/txfees/types\xa2\x02\x03OTX\xaa\x02\x16Osmosis.Txfees.V1beta1\xca\x02\x16Osmosis\\Txfees\\V1beta1\xe2\x02\"Osmosis\\Txfees\\V1beta1\\GPBMetadata\xea\x02\x18Osmosis::Txfees::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.txfees.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.osmosis.txfees.v1beta1B\014GenesisProtoZ2github.com/osmosis-labs/osmosis/v15/x/txfees/types\242\002\003OTX\252\002\026Osmosis.Txfees.V1beta1\312\002\026Osmosis\\Txfees\\V1beta1\342\002\"Osmosis\\Txfees\\V1beta1\\GPBMetadata\352\002\030Osmosis::Txfees::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['feetokens']._options = None
  _globals['_GENESISSTATE'].fields_by_name['feetokens']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=125
  _globals['_GENESISSTATE']._serialized_end=239
# @@protoc_insertion_point(module_scope)
