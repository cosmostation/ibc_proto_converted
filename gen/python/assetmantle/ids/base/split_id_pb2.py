# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/ids/base/split_id.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2
from assetmantle.ids.base import any_ownable_id_pb2 as assetmantle_dot_ids_dot_base_dot_any__ownable__id__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#assetmantle/ids/base/split_id.proto\x12\x1b\x61ssetmantle.schema.ids.base\x1a&assetmantle/ids/base/identity_id.proto\x1a)assetmantle/ids/base/any_ownable_id.proto\x1a\x14gogoproto/gogo.proto\"\x9f\x01\n\x07SplitID\x12\x43\n\towner_i_d\x18\x01 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x07ownerID\x12I\n\x0bownable_i_d\x18\x02 \x01(\x0b\x32).assetmantle.schema.ids.base.AnyOwnableIDR\townableID:\x04\x88\xa0\x1f\x00\x42\xbd\x01\n\x1f\x63om.assetmantle.schema.ids.baseB\x0cSplitIdProto\xa2\x02\x04\x41SIB\xaa\x02\x1b\x41ssetmantle.Schema.Ids.Base\xca\x02\x1b\x41ssetmantle\\Schema\\Ids\\Base\xe2\x02\'Assetmantle\\Schema\\Ids\\Base\\GPBMetadata\xea\x02\x1e\x41ssetmantle::Schema::Ids::Baseb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.ids.base.split_id_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\037com.assetmantle.schema.ids.baseB\014SplitIdProto\242\002\004ASIB\252\002\033Assetmantle.Schema.Ids.Base\312\002\033Assetmantle\\Schema\\Ids\\Base\342\002\'Assetmantle\\Schema\\Ids\\Base\\GPBMetadata\352\002\036Assetmantle::Schema::Ids::Base'
  _globals['_SPLITID']._options = None
  _globals['_SPLITID']._serialized_options = b'\210\240\037\000'
  _globals['_SPLITID']._serialized_start=174
  _globals['_SPLITID']._serialized_end=333
# @@protoc_insertion_point(module_scope)
