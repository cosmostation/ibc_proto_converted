# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/claims/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from evmos.claims.v1 import claims_pb2 as evmos_dot_claims_dot_v1_dot_claims__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x65vmos/claims/v1/genesis.proto\x12\x0f\x65vmos.claims.v1\x1a\x1c\x65vmos/claims/v1/claims.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x98\x01\n\x0cGenesisState\x12\x35\n\x06params\x18\x01 \x01(\x0b\x32\x17.evmos.claims.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12Q\n\x0e\x63laims_records\x18\x02 \x03(\x0b\x32$.evmos.claims.v1.ClaimsRecordAddressB\x04\xc8\xde\x1f\x00R\rclaimsRecords\"\xb1\x03\n\x06Params\x12#\n\renable_claims\x18\x01 \x01(\x08R\x0c\x65nableClaims\x12R\n\x12\x61irdrop_start_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x10\x61irdropStartTime\x12U\n\x14\x64uration_until_decay\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x12\x64urationUntilDecay\x12O\n\x11\x64uration_of_decay\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x0f\x64urationOfDecay\x12!\n\x0c\x63laims_denom\x18\x05 \x01(\tR\x0b\x63laimsDenom\x12/\n\x13\x61uthorized_channels\x18\x06 \x03(\tR\x12\x61uthorizedChannels\x12\x32\n\x0c\x65vm_channels\x18\x07 \x03(\tB\x0f\xe2\xde\x1f\x0b\x45VMChannelsR\x0b\x65vmChannelsB\xaa\x01\n\x13\x63om.evmos.claims.v1B\x0cGenesisProtoZ)github.com/evmos/evmos/v13/x/claims/types\xa2\x02\x03\x45\x43X\xaa\x02\x0f\x45vmos.Claims.V1\xca\x02\x0f\x45vmos\\Claims\\V1\xe2\x02\x1b\x45vmos\\Claims\\V1\\GPBMetadata\xea\x02\x11\x45vmos::Claims::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.claims.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.evmos.claims.v1B\014GenesisProtoZ)github.com/evmos/evmos/v13/x/claims/types\242\002\003ECX\252\002\017Evmos.Claims.V1\312\002\017Evmos\\Claims\\V1\342\002\033Evmos\\Claims\\V1\\GPBMetadata\352\002\021Evmos::Claims::V1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['claims_records']._options = None
  _globals['_GENESISSTATE'].fields_by_name['claims_records']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS'].fields_by_name['airdrop_start_time']._options = None
  _globals['_PARAMS'].fields_by_name['airdrop_start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_PARAMS'].fields_by_name['duration_until_decay']._options = None
  _globals['_PARAMS'].fields_by_name['duration_until_decay']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_PARAMS'].fields_by_name['duration_of_decay']._options = None
  _globals['_PARAMS'].fields_by_name['duration_of_decay']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_PARAMS'].fields_by_name['evm_channels']._options = None
  _globals['_PARAMS'].fields_by_name['evm_channels']._serialized_options = b'\342\336\037\013EVMChannels'
  _globals['_GENESISSTATE']._serialized_start=168
  _globals['_GENESISSTATE']._serialized_end=320
  _globals['_PARAMS']._serialized_start=323
  _globals['_PARAMS']._serialized_end=756
# @@protoc_insertion_point(module_scope)
