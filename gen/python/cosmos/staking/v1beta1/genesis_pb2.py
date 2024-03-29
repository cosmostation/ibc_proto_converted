# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/staking/v1beta1/genesis.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.staking.v1beta1 import staking_pb2 as cosmos_dot_staking_dot_v1beta1_dot_staking__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from amino import amino_pb2 as amino_dot_amino__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$cosmos/staking/v1beta1/genesis.proto\x12\x16\x63osmos.staking.v1beta1\x1a\x14gogoproto/gogo.proto\x1a$cosmos/staking/v1beta1/staking.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x11\x61mino/amino.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xbb\x08\n\x0cGenesisState\x12\x41\n\x06params\x18\x01 \x01(\x0b\x32\x1e.cosmos.staking.v1beta1.ParamsB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06params\x12]\n\x10last_total_power\x18\x02 \x01(\x0c\x42\x33\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xa8\xe7\xb0*\x01R\x0elastTotalPower\x12i\n\x15last_validator_powers\x18\x03 \x03(\x0b\x32*.cosmos.staking.v1beta1.LastValidatorPowerB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x13lastValidatorPowers\x12L\n\nvalidators\x18\x04 \x03(\x0b\x32!.cosmos.staking.v1beta1.ValidatorB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\nvalidators\x12O\n\x0b\x64\x65legations\x18\x05 \x03(\x0b\x32\".cosmos.staking.v1beta1.DelegationB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x0b\x64\x65legations\x12k\n\x15unbonding_delegations\x18\x06 \x03(\x0b\x32+.cosmos.staking.v1beta1.UnbondingDelegationB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x14unbondingDelegations\x12U\n\rredelegations\x18\x07 \x03(\x0b\x32$.cosmos.staking.v1beta1.RedelegationB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\rredelegations\x12\x1a\n\x08\x65xported\x18\x08 \x01(\x08R\x08\x65xported\x12g\n\x16tokenize_share_records\x18\t \x03(\x0b\x32+.cosmos.staking.v1beta1.TokenizeShareRecordB\x04\xc8\xde\x1f\x00R\x14tokenizeShareRecords\x12@\n\x1dlast_tokenize_share_record_id\x18\n \x01(\x04R\x19lastTokenizeShareRecordId\x12\x90\x01\n\x1atotal_liquid_staked_tokens\x18\x0b \x01(\x0c\x42S\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f!yaml:\"total_liquid_staked_tokens\"R\x17totalLiquidStakedTokens\x12\x61\n\x14tokenize_share_locks\x18\x0c \x03(\x0b\x32).cosmos.staking.v1beta1.TokenizeShareLockB\x04\xc8\xde\x1f\x00R\x12tokenizeShareLocks\"\xae\x01\n\x11TokenizeShareLock\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06status\x18\x02 \x01(\tR\x06status\x12g\n\x0f\x63ompletion_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\"\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"completion_time\"\x90\xdf\x1f\x01R\x0e\x63ompletionTime\"h\n\x12LastValidatorPower\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x14\n\x05power\x18\x02 \x01(\x03R\x05power:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xd0\x01\n\x1a\x63om.cosmos.staking.v1beta1B\x0cGenesisProtoZ,github.com/cosmos/cosmos-sdk/x/staking/types\xa2\x02\x03\x43SX\xaa\x02\x16\x43osmos.Staking.V1beta1\xca\x02\x16\x43osmos\\Staking\\V1beta1\xe2\x02\"Cosmos\\Staking\\V1beta1\\GPBMetadata\xea\x02\x18\x43osmos::Staking::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.staking.v1beta1.genesis_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.cosmos.staking.v1beta1B\014GenesisProtoZ,github.com/cosmos/cosmos-sdk/x/staking/types\242\002\003CSX\252\002\026Cosmos.Staking.V1beta1\312\002\026Cosmos\\Staking\\V1beta1\342\002\"Cosmos\\Staking\\V1beta1\\GPBMetadata\352\002\030Cosmos::Staking::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['last_total_power']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['last_total_power']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['last_validator_powers']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['last_validator_powers']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['validators']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['validators']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['delegations']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['delegations']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['unbonding_delegations']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['unbonding_delegations']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['redelegations']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['redelegations']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['tokenize_share_records']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['tokenize_share_records']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['total_liquid_staked_tokens']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['total_liquid_staked_tokens']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037!yaml:\"total_liquid_staked_tokens\"'
  _globals['_GENESISSTATE'].fields_by_name['tokenize_share_locks']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['tokenize_share_locks']._serialized_options = b'\310\336\037\000'
  _globals['_TOKENIZESHARELOCK'].fields_by_name['completion_time']._loaded_options = None
  _globals['_TOKENIZESHARELOCK'].fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"completion_time\"\220\337\037\001'
  _globals['_LASTVALIDATORPOWER'].fields_by_name['address']._loaded_options = None
  _globals['_LASTVALIDATORPOWER'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_LASTVALIDATORPOWER']._loaded_options = None
  _globals['_LASTVALIDATORPOWER']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=204
  _globals['_GENESISSTATE']._serialized_end=1287
  _globals['_TOKENIZESHARELOCK']._serialized_start=1290
  _globals['_TOKENIZESHARELOCK']._serialized_end=1464
  _globals['_LASTVALIDATORPOWER']._serialized_start=1466
  _globals['_LASTVALIDATORPOWER']._serialized_end=1570
# @@protoc_insertion_point(module_scope)
