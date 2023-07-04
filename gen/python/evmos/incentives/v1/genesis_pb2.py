# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/incentives/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from evmos.incentives.v1 import incentives_pb2 as evmos_dot_incentives_dot_v1_dot_incentives__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!evmos/incentives/v1/genesis.proto\x12\x13\x65vmos.incentives.v1\x1a$evmos/incentives/v1/incentives.proto\x1a\x14gogoproto/gogo.proto\"\xd3\x01\n\x0cGenesisState\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.evmos.incentives.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x44\n\nincentives\x18\x02 \x03(\x0b\x32\x1e.evmos.incentives.v1.IncentiveB\x04\xc8\xde\x1f\x00R\nincentives\x12\x42\n\ngas_meters\x18\x03 \x03(\x0b\x32\x1d.evmos.incentives.v1.GasMeterB\x04\xc8\xde\x1f\x00R\tgasMeters\"\xa5\x02\n\x06Params\x12+\n\x11\x65nable_incentives\x18\x01 \x01(\x08R\x10\x65nableIncentives\x12Y\n\x10\x61llocation_limit\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0f\x61llocationLimit\x12>\n\x1bincentives_epoch_identifier\x18\x03 \x01(\tR\x19incentivesEpochIdentifier\x12S\n\rreward_scaler\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0crewardScalerB\xc4\x01\n\x17\x63om.evmos.incentives.v1B\x0cGenesisProtoP\x01Z-github.com/evmos/evmos/v13/x/incentives/types\xa2\x02\x03\x45IX\xaa\x02\x13\x45vmos.Incentives.V1\xca\x02\x13\x45vmos\\Incentives\\V1\xe2\x02\x1f\x45vmos\\Incentives\\V1\\GPBMetadata\xea\x02\x15\x45vmos::Incentives::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.incentives.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.evmos.incentives.v1B\014GenesisProtoP\001Z-github.com/evmos/evmos/v13/x/incentives/types\242\002\003EIX\252\002\023Evmos.Incentives.V1\312\002\023Evmos\\Incentives\\V1\342\002\037Evmos\\Incentives\\V1\\GPBMetadata\352\002\025Evmos::Incentives::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['incentives']._options = None
  _GENESISSTATE.fields_by_name['incentives']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['gas_meters']._options = None
  _GENESISSTATE.fields_by_name['gas_meters']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['allocation_limit']._options = None
  _PARAMS.fields_by_name['allocation_limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['reward_scaler']._options = None
  _PARAMS.fields_by_name['reward_scaler']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_GENESISSTATE']._serialized_start=119
  _globals['_GENESISSTATE']._serialized_end=330
  _globals['_PARAMS']._serialized_start=333
  _globals['_PARAMS']._serialized_end=626
# @@protoc_insertion_point(module_scope)