# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/assets/transactions/revoke/message.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from assetmantle.ids.base import classification_id_pb2 as assetmantle_dot_ids_dot_base_dot_classification__id__pb2
from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4assetmantle/assets/transactions/revoke/message.proto\x12.assetmantle.modules.assets.transactions.revoke\x1a,assetmantle/ids/base/classification_id.proto\x1a&assetmantle/ids/base/identity_id.proto\"\xfc\x01\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12=\n\x06to_i_d\x18\x03 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x04toID\x12[\n\x12\x63lassification_i_d\x18\x04 \x01(\x0b\x32-.assetmantle.schema.ids.base.ClassificationIDR\x10\x63lassificationIDB\x9e\x02\n2com.assetmantle.modules.assets.transactions.revokeB\x0cMessageProto\xa2\x02\x05\x41MATR\xaa\x02.Assetmantle.Modules.Assets.Transactions.Revoke\xca\x02.Assetmantle\\Modules\\Assets\\Transactions\\Revoke\xe2\x02:Assetmantle\\Modules\\Assets\\Transactions\\Revoke\\GPBMetadata\xea\x02\x32\x41ssetmantle::Modules::Assets::Transactions::Revokeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.assets.transactions.revoke.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n2com.assetmantle.modules.assets.transactions.revokeB\014MessageProto\242\002\005AMATR\252\002.Assetmantle.Modules.Assets.Transactions.Revoke\312\002.Assetmantle\\Modules\\Assets\\Transactions\\Revoke\342\002:Assetmantle\\Modules\\Assets\\Transactions\\Revoke\\GPBMetadata\352\0022Assetmantle::Modules::Assets::Transactions::Revoke'
  _globals['_MESSAGE']._serialized_start=191
  _globals['_MESSAGE']._serialized_end=443
# @@protoc_insertion_point(module_scope)
