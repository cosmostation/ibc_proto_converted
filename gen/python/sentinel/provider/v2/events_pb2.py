# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/provider/v2/events.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!sentinel/provider/v2/events.proto\x12\x14sentinel.provider.v2\x1a\x14gogoproto/gogo.proto\"=\n\rEventRegister\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\";\n\x0b\x45ventUpdate\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ressB\xd2\x01\n\x18\x63om.sentinel.provider.v2B\x0b\x45ventsProtoZ1github.com/sentinel-official/hub/x/provider/types\xa2\x02\x03SPX\xaa\x02\x14Sentinel.Provider.V2\xca\x02\x14Sentinel\\Provider\\V2\xe2\x02 Sentinel\\Provider\\V2\\GPBMetadata\xea\x02\x16Sentinel::Provider::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.provider.v2.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.sentinel.provider.v2B\013EventsProtoZ1github.com/sentinel-official/hub/x/provider/types\242\002\003SPX\252\002\024Sentinel.Provider.V2\312\002\024Sentinel\\Provider\\V2\342\002 Sentinel\\Provider\\V2\\GPBMetadata\352\002\026Sentinel::Provider::V2\310\341\036\000\250\342\036\000'
  _globals['_EVENTREGISTER'].fields_by_name['address']._options = None
  _globals['_EVENTREGISTER'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTUPDATE'].fields_by_name['address']._options = None
  _globals['_EVENTUPDATE'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTREGISTER']._serialized_start=81
  _globals['_EVENTREGISTER']._serialized_end=142
  _globals['_EVENTUPDATE']._serialized_start=144
  _globals['_EVENTUPDATE']._serialized_end=203
# @@protoc_insertion_point(module_scope)
