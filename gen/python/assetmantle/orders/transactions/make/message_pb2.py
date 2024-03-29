# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/orders/transactions/make/message.proto
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
from assetmantle.ids.base import any_ownable_id_pb2 as assetmantle_dot_ids_dot_base_dot_any__ownable__id__pb2
from assetmantle.lists.base import property_list_pb2 as assetmantle_dot_lists_dot_base_dot_property__list__pb2
from assetmantle.types.base import height_pb2 as assetmantle_dot_types_dot_base_dot_height__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2assetmantle/orders/transactions/make/message.proto\x12,assetmantle.modules.orders.transactions.make\x1a,assetmantle/ids/base/classification_id.proto\x1a&assetmantle/ids/base/identity_id.proto\x1a)assetmantle/ids/base/any_ownable_id.proto\x1a*assetmantle/lists/base/property_list.proto\x1a#assetmantle/types/base/height.proto\"\xde\x07\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12[\n\x12\x63lassification_i_d\x18\x03 \x01(\x0b\x32-.assetmantle.schema.ids.base.ClassificationIDR\x10\x63lassificationID\x12\x43\n\ttaker_i_d\x18\x04 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x07takerID\x12T\n\x11maker_ownable_i_d\x18\x05 \x01(\x0b\x32).assetmantle.schema.ids.base.AnyOwnableIDR\x0emakerOwnableID\x12T\n\x11taker_ownable_i_d\x18\x06 \x01(\x0b\x32).assetmantle.schema.ids.base.AnyOwnableIDR\x0etakerOwnableID\x12\x44\n\nexpires_in\x18\x07 \x01(\x0b\x32%.assetmantle.schema.types.base.HeightR\texpiresIn\x12.\n\x13maker_ownable_split\x18\x08 \x01(\tR\x11makerOwnableSplit\x12.\n\x13taker_ownable_split\x18\t \x01(\tR\x11takerOwnableSplit\x12g\n\x19immutable_meta_properties\x18\n \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x17immutableMetaProperties\x12^\n\x14immutable_properties\x18\x0b \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x13immutableProperties\x12\x63\n\x17mutable_meta_properties\x18\x0c \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x15mutableMetaProperties\x12Z\n\x12mutable_properties\x18\r \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x11mutablePropertiesB\x94\x02\n0com.assetmantle.modules.orders.transactions.makeB\x0cMessageProto\xa2\x02\x05\x41MOTM\xaa\x02,Assetmantle.Modules.Orders.Transactions.Make\xca\x02,Assetmantle\\Modules\\Orders\\Transactions\\Make\xe2\x02\x38\x41ssetmantle\\Modules\\Orders\\Transactions\\Make\\GPBMetadata\xea\x02\x30\x41ssetmantle::Modules::Orders::Transactions::Makeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.orders.transactions.make.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n0com.assetmantle.modules.orders.transactions.makeB\014MessageProto\242\002\005AMOTM\252\002,Assetmantle.Modules.Orders.Transactions.Make\312\002,Assetmantle\\Modules\\Orders\\Transactions\\Make\342\0028Assetmantle\\Modules\\Orders\\Transactions\\Make\\GPBMetadata\352\0020Assetmantle::Modules::Orders::Transactions::Make'
  _globals['_MESSAGE']._serialized_start=311
  _globals['_MESSAGE']._serialized_end=1301
# @@protoc_insertion_point(module_scope)
