# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/swap/v1/events.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dsentinel/swap/v1/events.proto\x12\x10sentinel.swap.v1\x1a\x14gogoproto/gogo.proto\"i\n\tEventSwap\x12+\n\x07tx_hash\x18\x01 \x01(\x0c\x42\x12\xf2\xde\x1f\x0eyaml:\"tx_hash\"R\x06txHash\x12/\n\x08receiver\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"receiver\"R\x08receiverB\xba\x01\n\x14\x63om.sentinel.swap.v1B\x0b\x45ventsProtoZ-github.com/sentinel-official/hub/x/swap/types\xa2\x02\x03SSX\xaa\x02\x10Sentinel.Swap.V1\xca\x02\x10Sentinel\\Swap\\V1\xe2\x02\x1cSentinel\\Swap\\V1\\GPBMetadata\xea\x02\x12Sentinel::Swap::V1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.swap.v1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.sentinel.swap.v1B\013EventsProtoZ-github.com/sentinel-official/hub/x/swap/types\242\002\003SSX\252\002\020Sentinel.Swap.V1\312\002\020Sentinel\\Swap\\V1\342\002\034Sentinel\\Swap\\V1\\GPBMetadata\352\002\022Sentinel::Swap::V1\310\341\036\000\250\342\036\000'
  _globals['_EVENTSWAP'].fields_by_name['tx_hash']._options = None
  _globals['_EVENTSWAP'].fields_by_name['tx_hash']._serialized_options = b'\362\336\037\016yaml:\"tx_hash\"'
  _globals['_EVENTSWAP'].fields_by_name['receiver']._options = None
  _globals['_EVENTSWAP'].fields_by_name['receiver']._serialized_options = b'\362\336\037\017yaml:\"receiver\"'
  _globals['_EVENTSWAP']._serialized_start=73
  _globals['_EVENTSWAP']._serialized_end=178
# @@protoc_insertion_point(module_scope)
