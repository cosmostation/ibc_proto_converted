# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/provider/v2/msg.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1esentinel/provider/v2/msg.proto\x12\x14sentinel.provider.v2\x1a\x14gogoproto/gogo.proto\x1a\x1esentinel/types/v1/status.proto\"\x94\x01\n\x12MsgRegisterRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x1a\n\x08identity\x18\x03 \x01(\tR\x08identity\x12\x18\n\x07website\x18\x04 \x01(\tR\x07website\x12 \n\x0b\x64\x65scription\x18\x05 \x01(\tR\x0b\x64\x65scription\"\xc5\x01\n\x10MsgUpdateRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x1a\n\x08identity\x18\x03 \x01(\tR\x08identity\x12\x18\n\x07website\x18\x04 \x01(\tR\x07website\x12 \n\x0b\x64\x65scription\x18\x05 \x01(\tR\x0b\x64\x65scription\x12\x31\n\x06status\x18\x06 \x01(\x0e\x32\x19.sentinel.types.v1.StatusR\x06status\"\x15\n\x13MsgRegisterResponse\"\x13\n\x11MsgUpdateResponse2\xce\x01\n\nMsgService\x12\x62\n\x0bMsgRegister\x12(.sentinel.provider.v2.MsgRegisterRequest\x1a).sentinel.provider.v2.MsgRegisterResponse\x12\\\n\tMsgUpdate\x12&.sentinel.provider.v2.MsgUpdateRequest\x1a\'.sentinel.provider.v2.MsgUpdateResponseB\xcf\x01\n\x18\x63om.sentinel.provider.v2B\x08MsgProtoZ1github.com/sentinel-official/hub/x/provider/types\xa2\x02\x03SPX\xaa\x02\x14Sentinel.Provider.V2\xca\x02\x14Sentinel\\Provider\\V2\xe2\x02 Sentinel\\Provider\\V2\\GPBMetadata\xea\x02\x16Sentinel::Provider::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.provider.v2.msg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.sentinel.provider.v2B\010MsgProtoZ1github.com/sentinel-official/hub/x/provider/types\242\002\003SPX\252\002\024Sentinel.Provider.V2\312\002\024Sentinel\\Provider\\V2\342\002 Sentinel\\Provider\\V2\\GPBMetadata\352\002\026Sentinel::Provider::V2\310\341\036\000\250\342\036\000'
  _globals['_MSGREGISTERREQUEST']._serialized_start=111
  _globals['_MSGREGISTERREQUEST']._serialized_end=259
  _globals['_MSGUPDATEREQUEST']._serialized_start=262
  _globals['_MSGUPDATEREQUEST']._serialized_end=459
  _globals['_MSGREGISTERRESPONSE']._serialized_start=461
  _globals['_MSGREGISTERRESPONSE']._serialized_end=482
  _globals['_MSGUPDATERESPONSE']._serialized_start=484
  _globals['_MSGUPDATERESPONSE']._serialized_end=503
  _globals['_MSGSERVICE']._serialized_start=506
  _globals['_MSGSERVICE']._serialized_end=712
# @@protoc_insertion_point(module_scope)
