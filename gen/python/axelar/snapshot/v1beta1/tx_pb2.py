# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/snapshot/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from axelar.permission.exported.v1beta1 import types_pb2 as axelar_dot_permission_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n axelar/snapshot/v1beta1/tx.proto\x12\x17\x61xelar.snapshot.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a.axelar/permission/exported/v1beta1/types.proto\"\xb9\x01\n\x14RegisterProxyRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x06sender\x12P\n\nproxy_addr\x18\x02 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\tproxyAddr:\x04\x80\xb5\x18\x01\"\x17\n\x15RegisterProxyResponse\"i\n\x16\x44\x65\x61\x63tivateProxyRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x06sender:\x04\x80\xb5\x18\x01\"\x19\n\x17\x44\x65\x61\x63tivateProxyResponseB\xdd\x01\n\x1b\x63om.axelar.snapshot.v1beta1B\x07TxProtoZ5github.com/axelarnetwork/axelar-core/x/snapshot/types\xa2\x02\x03\x41SX\xaa\x02\x17\x41xelar.Snapshot.V1beta1\xca\x02\x17\x41xelar\\Snapshot\\V1beta1\xe2\x02#Axelar\\Snapshot\\V1beta1\\GPBMetadata\xea\x02\x19\x41xelar::Snapshot::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.snapshot.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.axelar.snapshot.v1beta1B\007TxProtoZ5github.com/axelarnetwork/axelar-core/x/snapshot/types\242\002\003ASX\252\002\027Axelar.Snapshot.V1beta1\312\002\027Axelar\\Snapshot\\V1beta1\342\002#Axelar\\Snapshot\\V1beta1\\GPBMetadata\352\002\031Axelar::Snapshot::V1beta1\310\341\036\000'
  _globals['_REGISTERPROXYREQUEST'].fields_by_name['sender']._options = None
  _globals['_REGISTERPROXYREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _globals['_REGISTERPROXYREQUEST'].fields_by_name['proxy_addr']._options = None
  _globals['_REGISTERPROXYREQUEST'].fields_by_name['proxy_addr']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_REGISTERPROXYREQUEST']._options = None
  _globals['_REGISTERPROXYREQUEST']._serialized_options = b'\200\265\030\001'
  _globals['_DEACTIVATEPROXYREQUEST'].fields_by_name['sender']._options = None
  _globals['_DEACTIVATEPROXYREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _globals['_DEACTIVATEPROXYREQUEST']._options = None
  _globals['_DEACTIVATEPROXYREQUEST']._serialized_options = b'\200\265\030\001'
  _globals['_REGISTERPROXYREQUEST']._serialized_start=162
  _globals['_REGISTERPROXYREQUEST']._serialized_end=347
  _globals['_REGISTERPROXYRESPONSE']._serialized_start=349
  _globals['_REGISTERPROXYRESPONSE']._serialized_end=372
  _globals['_DEACTIVATEPROXYREQUEST']._serialized_start=374
  _globals['_DEACTIVATEPROXYREQUEST']._serialized_end=479
  _globals['_DEACTIVATEPROXYRESPONSE']._serialized_start=481
  _globals['_DEACTIVATEPROXYRESPONSE']._serialized_end=506
# @@protoc_insertion_point(module_scope)
