# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irishub/guardian/guardian.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1firishub/guardian/guardian.proto\x12\x10irishub.guardian\x1a\x14gogoproto/gogo.proto\"\xb9\x01\n\x05Super\x12 \n\x0b\x64\x65scription\x18\x01 \x01(\tR\x0b\x64\x65scription\x12Y\n\x0c\x61\x63\x63ount_type\x18\x02 \x01(\x0e\x32\x1d.irishub.guardian.AccountTypeB\x17\xf2\xde\x1f\x13yaml:\"account_type\"R\x0b\x61\x63\x63ountType\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\x12\x19\n\x08\x61\x64\x64\x65\x64_by\x18\x04 \x01(\tR\x07\x61\x64\x64\x65\x64\x42y*I\n\x0b\x41\x63\x63ountType\x12\x18\n\x07GENESIS\x10\x00\x1a\x0b\x8a\x9d \x07Genesis\x12\x1a\n\x08ORDINARY\x10\x01\x1a\x0c\x8a\x9d \x08Ordinary\x1a\x04\x88\xa3\x1e\x00\x42\xb9\x01\n\x14\x63om.irishub.guardianB\rGuardianProtoP\x01Z1github.com/irisnet/irishub/modules/guardian/types\xa2\x02\x03IGX\xaa\x02\x10Irishub.Guardian\xca\x02\x10Irishub\\Guardian\xe2\x02\x1cIrishub\\Guardian\\GPBMetadata\xea\x02\x11Irishub::Guardianb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irishub.guardian.guardian_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.irishub.guardianB\rGuardianProtoP\001Z1github.com/irisnet/irishub/modules/guardian/types\242\002\003IGX\252\002\020Irishub.Guardian\312\002\020Irishub\\Guardian\342\002\034Irishub\\Guardian\\GPBMetadata\352\002\021Irishub::Guardian'
  _ACCOUNTTYPE._options = None
  _ACCOUNTTYPE._serialized_options = b'\210\243\036\000'
  _ACCOUNTTYPE.values_by_name["GENESIS"]._options = None
  _ACCOUNTTYPE.values_by_name["GENESIS"]._serialized_options = b'\212\235 \007Genesis'
  _ACCOUNTTYPE.values_by_name["ORDINARY"]._options = None
  _ACCOUNTTYPE.values_by_name["ORDINARY"]._serialized_options = b'\212\235 \010Ordinary'
  _SUPER.fields_by_name['account_type']._options = None
  _SUPER.fields_by_name['account_type']._serialized_options = b'\362\336\037\023yaml:\"account_type\"'
  _globals['_ACCOUNTTYPE']._serialized_start=263
  _globals['_ACCOUNTTYPE']._serialized_end=336
  _globals['_SUPER']._serialized_start=76
  _globals['_SUPER']._serialized_end=261
# @@protoc_insertion_point(module_scope)