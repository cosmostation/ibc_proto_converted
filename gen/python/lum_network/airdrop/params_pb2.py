# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/airdrop/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n lum-network/airdrop/params.proto\x12\x13lum.network.airdrop\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc0\x03\n\x06Params\x12o\n\x12\x61irdrop_start_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB%\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"airdrop_start_time\"\x90\xdf\x1f\x01R\x10\x61irdropStartTime\x12\x96\x01\n\x14\x64uration_until_decay\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationBI\xc8\xde\x1f\x00\xea\xde\x1f\x1e\x64uration_until_decay,omitempty\xf2\xde\x1f\x1byaml:\"duration_until_decay\"\x98\xdf\x1f\x01R\x12\x64urationUntilDecay\x12\x8a\x01\n\x11\x64uration_of_decay\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationBC\xc8\xde\x1f\x00\xea\xde\x1f\x1b\x64uration_of_decay,omitempty\xf2\xde\x1f\x18yaml:\"duration_of_decay\"\x98\xdf\x1f\x01R\x0f\x64urationOfDecay\x12\x1f\n\x0b\x63laim_denom\x18\x04 \x01(\tR\nclaimDenomB\xc0\x01\n\x17\x63om.lum.network.airdropB\x0bParamsProtoZ,github.com/lum-network/chain/x/airdrop/types\xa2\x02\x03LNA\xaa\x02\x13Lum.Network.Airdrop\xca\x02\x13Lum\\Network\\Airdrop\xe2\x02\x1fLum\\Network\\Airdrop\\GPBMetadata\xea\x02\x15Lum::Network::Airdropb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.airdrop.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.lum.network.airdropB\013ParamsProtoZ,github.com/lum-network/chain/x/airdrop/types\242\002\003LNA\252\002\023Lum.Network.Airdrop\312\002\023Lum\\Network\\Airdrop\342\002\037Lum\\Network\\Airdrop\\GPBMetadata\352\002\025Lum::Network::Airdrop'
  _globals['_PARAMS'].fields_by_name['airdrop_start_time']._options = None
  _globals['_PARAMS'].fields_by_name['airdrop_start_time']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"airdrop_start_time\"\220\337\037\001'
  _globals['_PARAMS'].fields_by_name['duration_until_decay']._options = None
  _globals['_PARAMS'].fields_by_name['duration_until_decay']._serialized_options = b'\310\336\037\000\352\336\037\036duration_until_decay,omitempty\362\336\037\033yaml:\"duration_until_decay\"\230\337\037\001'
  _globals['_PARAMS'].fields_by_name['duration_of_decay']._options = None
  _globals['_PARAMS'].fields_by_name['duration_of_decay']._serialized_options = b'\310\336\037\000\352\336\037\033duration_of_decay,omitempty\362\336\037\030yaml:\"duration_of_decay\"\230\337\037\001'
  _globals['_PARAMS']._serialized_start=145
  _globals['_PARAMS']._serialized_end=593
# @@protoc_insertion_point(module_scope)
