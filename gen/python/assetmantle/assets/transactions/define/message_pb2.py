# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/assets/transactions/define/message.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2
from assetmantle.lists.base import property_list_pb2 as assetmantle_dot_lists_dot_base_dot_property__list__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4assetmantle/assets/transactions/define/message.proto\x12.assetmantle.modules.assets.transactions.define\x1a&assetmantle/ids/base/identity_id.proto\x1a*assetmantle/lists/base/property_list.proto\"\xea\x03\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12g\n\x19immutable_meta_properties\x18\x03 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x17immutableMetaProperties\x12^\n\x14immutable_properties\x18\x04 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x13immutableProperties\x12\x63\n\x17mutable_meta_properties\x18\x05 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x15mutableMetaProperties\x12Z\n\x12mutable_properties\x18\x06 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x11mutablePropertiesB\x9e\x02\n2com.assetmantle.modules.assets.transactions.defineB\x0cMessageProto\xa2\x02\x05\x41MATD\xaa\x02.Assetmantle.Modules.Assets.Transactions.Define\xca\x02.Assetmantle\\Modules\\Assets\\Transactions\\Define\xe2\x02:Assetmantle\\Modules\\Assets\\Transactions\\Define\\GPBMetadata\xea\x02\x32\x41ssetmantle::Modules::Assets::Transactions::Defineb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.assets.transactions.define.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n2com.assetmantle.modules.assets.transactions.defineB\014MessageProto\242\002\005AMATD\252\002.Assetmantle.Modules.Assets.Transactions.Define\312\002.Assetmantle\\Modules\\Assets\\Transactions\\Define\342\002:Assetmantle\\Modules\\Assets\\Transactions\\Define\\GPBMetadata\352\0022Assetmantle::Modules::Assets::Transactions::Define'
  _globals['_MESSAGE']._serialized_start=189
  _globals['_MESSAGE']._serialized_end=679
# @@protoc_insertion_point(module_scope)
