# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/types/v1/bandwidth.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!sentinel/types/v1/bandwidth.proto\x12\x11sentinel.types.v1\x1a\x14gogoproto/gogo.proto\"\x9f\x01\n\tBandwidth\x12\x46\n\x06upload\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06upload\x12J\n\x08\x64ownload\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08\x64ownloadB\xbb\x01\n\x15\x63om.sentinel.types.v1B\x0e\x42\x61ndwidthProtoZ&github.com/sentinel-official/hub/types\xa2\x02\x03STX\xaa\x02\x11Sentinel.Types.V1\xca\x02\x11Sentinel\\Types\\V1\xe2\x02\x1dSentinel\\Types\\V1\\GPBMetadata\xea\x02\x13Sentinel::Types::V1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.types.v1.bandwidth_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.sentinel.types.v1B\016BandwidthProtoZ&github.com/sentinel-official/hub/types\242\002\003STX\252\002\021Sentinel.Types.V1\312\002\021Sentinel\\Types\\V1\342\002\035Sentinel\\Types\\V1\\GPBMetadata\352\002\023Sentinel::Types::V1\310\341\036\000\250\342\036\000'
  _globals['_BANDWIDTH'].fields_by_name['upload']._options = None
  _globals['_BANDWIDTH'].fields_by_name['upload']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_BANDWIDTH'].fields_by_name['download']._options = None
  _globals['_BANDWIDTH'].fields_by_name['download']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_BANDWIDTH']._serialized_start=79
  _globals['_BANDWIDTH']._serialized_end=238
# @@protoc_insertion_point(module_scope)
