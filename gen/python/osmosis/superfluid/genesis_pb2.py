# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/superfluid/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.superfluid import superfluid_pb2 as osmosis_dot_superfluid_dot_superfluid__pb2
from osmosis.superfluid import params_pb2 as osmosis_dot_superfluid_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n osmosis/superfluid/genesis.proto\x12\x12osmosis.superfluid\x1a\x14gogoproto/gogo.proto\x1a#osmosis/superfluid/superfluid.proto\x1a\x1fosmosis/superfluid/params.proto\"\x90\x04\n\x0cGenesisState\x12\x38\n\x06params\x18\x01 \x01(\x0b\x32\x1a.osmosis.superfluid.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12V\n\x11superfluid_assets\x18\x02 \x03(\x0b\x32#.osmosis.superfluid.SuperfluidAssetB\x04\xc8\xde\x1f\x00R\x10superfluidAssets\x12x\n\x1bosmo_equivalent_multipliers\x18\x03 \x03(\x0b\x32\x32.osmosis.superfluid.OsmoEquivalentMultiplierRecordB\x04\xc8\xde\x1f\x00R\x19osmoEquivalentMultipliers\x12l\n\x15intermediary_accounts\x18\x04 \x03(\x0b\x32\x31.osmosis.superfluid.SuperfluidIntermediaryAccountB\x04\xc8\xde\x1f\x00R\x14intermediaryAccounts\x12\x85\x01\n\x1fintemediary_account_connections\x18\x05 \x03(\x0b\x32\x37.osmosis.superfluid.LockIdIntermediaryAccountConnectionB\x04\xc8\xde\x1f\x00R\x1dintemediaryAccountConnectionsB\xc5\x01\n\x16\x63om.osmosis.superfluidB\x0cGenesisProtoZ6github.com/osmosis-labs/osmosis/v15/x/superfluid/types\xa2\x02\x03OSX\xaa\x02\x12Osmosis.Superfluid\xca\x02\x12Osmosis\\Superfluid\xe2\x02\x1eOsmosis\\Superfluid\\GPBMetadata\xea\x02\x13Osmosis::Superfluidb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.superfluid.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.osmosis.superfluidB\014GenesisProtoZ6github.com/osmosis-labs/osmosis/v15/x/superfluid/types\242\002\003OSX\252\002\022Osmosis.Superfluid\312\002\022Osmosis\\Superfluid\342\002\036Osmosis\\Superfluid\\GPBMetadata\352\002\023Osmosis::Superfluid'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['superfluid_assets']._options = None
  _globals['_GENESISSTATE'].fields_by_name['superfluid_assets']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['osmo_equivalent_multipliers']._options = None
  _globals['_GENESISSTATE'].fields_by_name['osmo_equivalent_multipliers']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['intermediary_accounts']._options = None
  _globals['_GENESISSTATE'].fields_by_name['intermediary_accounts']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['intemediary_account_connections']._options = None
  _globals['_GENESISSTATE'].fields_by_name['intemediary_account_connections']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=149
  _globals['_GENESISSTATE']._serialized_end=677
# @@protoc_insertion_point(module_scope)
