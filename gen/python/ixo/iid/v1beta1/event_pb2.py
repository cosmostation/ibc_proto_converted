# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/iid/v1beta1/event.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ixo.iid.v1beta1 import types_pb2 as ixo_dot_iid_dot_v1beta1_dot_types__pb2
from ixo.iid.v1beta1 import iid_pb2 as ixo_dot_iid_dot_v1beta1_dot_iid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bixo/iid/v1beta1/event.proto\x12\x0fixo.iid.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1bixo/iid/v1beta1/types.proto\x1a\x19ixo/iid/v1beta1/iid.proto\"c\n\x17IidDocumentCreatedEvent\x12>\n\x0biidDocument\x18\x01 \x01(\x0b\x32\x1c.ixo.iid.v1beta1.IidDocumentR\x0biidDocument:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\"c\n\x17IidDocumentUpdatedEvent\x12>\n\x0biidDocument\x18\x01 \x01(\x0b\x32\x1c.ixo.iid.v1beta1.IidDocumentR\x0biidDocument:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\x42\xb2\x01\n\x13\x63om.ixo.iid.v1beta1B\nEventProtoZ3github.com/ixofoundation/ixo-blockchain/x/iid/types\xa2\x02\x03IIX\xaa\x02\x0fIxo.Iid.V1beta1\xca\x02\x0fIxo\\Iid\\V1beta1\xe2\x02\x1bIxo\\Iid\\V1beta1\\GPBMetadata\xea\x02\x11Ixo::Iid::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.iid.v1beta1.event_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.ixo.iid.v1beta1B\nEventProtoZ3github.com/ixofoundation/ixo-blockchain/x/iid/types\242\002\003IIX\252\002\017Ixo.Iid.V1beta1\312\002\017Ixo\\Iid\\V1beta1\342\002\033Ixo\\Iid\\V1beta1\\GPBMetadata\352\002\021Ixo::Iid::V1beta1'
  _globals['_IIDDOCUMENTCREATEDEVENT']._options = None
  _globals['_IIDDOCUMENTCREATEDEVENT']._serialized_options = b'\210\240\037\000\350\240\037\001'
  _globals['_IIDDOCUMENTUPDATEDEVENT']._options = None
  _globals['_IIDDOCUMENTUPDATEDEVENT']._serialized_options = b'\210\240\037\000\350\240\037\001'
  _globals['_IIDDOCUMENTCREATEDEVENT']._serialized_start=126
  _globals['_IIDDOCUMENTCREATEDEVENT']._serialized_end=225
  _globals['_IIDDOCUMENTUPDATEDEVENT']._serialized_start=227
  _globals['_IIDDOCUMENTUPDATEDEVENT']._serialized_end=326
# @@protoc_insertion_point(module_scope)
