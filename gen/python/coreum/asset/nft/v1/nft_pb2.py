# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/asset/nft/v1/nft.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x63oreum/asset/nft/v1/nft.proto\x12\x13\x63oreum.asset.nft.v1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\"\xd3\x01\n\x0f\x43lassDefinition\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\x12\x16\n\x06issuer\x18\x02 \x01(\tR\x06issuer\x12=\n\x08\x66\x65\x61tures\x18\x03 \x03(\x0e\x32!.coreum.asset.nft.v1.ClassFeatureR\x08\x66\x65\x61tures\x12Q\n\x0croyalty_rate\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0broyaltyRate\"\xfc\x02\n\x05\x43lass\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06issuer\x18\x02 \x01(\tR\x06issuer\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x16\n\x06symbol\x18\x04 \x01(\tR\x06symbol\x12 \n\x0b\x64\x65scription\x18\x05 \x01(\tR\x0b\x64\x65scription\x12\x19\n\x03uri\x18\x06 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12&\n\x08uri_hash\x18\x07 \x01(\tB\x0b\xe2\xde\x1f\x07URIHashR\x07uriHash\x12(\n\x04\x64\x61ta\x18\x08 \x01(\x0b\x32\x14.google.protobuf.AnyR\x04\x64\x61ta\x12=\n\x08\x66\x65\x61tures\x18\t \x03(\x0e\x32!.coreum.asset.nft.v1.ClassFeatureR\x08\x66\x65\x61tures\x12Q\n\x0croyalty_rate\x18\n \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0broyaltyRate*P\n\x0c\x43lassFeature\x12\x0b\n\x07\x62urning\x10\x00\x12\x0c\n\x08\x66reezing\x10\x01\x12\x10\n\x0cwhitelisting\x10\x02\x12\x13\n\x0f\x64isable_sending\x10\x03\x42\xc6\x01\n\x17\x63om.coreum.asset.nft.v1B\x08NftProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\xa2\x02\x03\x43\x41N\xaa\x02\x13\x43oreum.Asset.Nft.V1\xca\x02\x13\x43oreum\\Asset\\Nft\\V1\xe2\x02\x1f\x43oreum\\Asset\\Nft\\V1\\GPBMetadata\xea\x02\x16\x43oreum::Asset::Nft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.asset.nft.v1.nft_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.coreum.asset.nft.v1B\010NftProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\242\002\003CAN\252\002\023Coreum.Asset.Nft.V1\312\002\023Coreum\\Asset\\Nft\\V1\342\002\037Coreum\\Asset\\Nft\\V1\\GPBMetadata\352\002\026Coreum::Asset::Nft::V1'
  _globals['_CLASSDEFINITION'].fields_by_name['id']._options = None
  _globals['_CLASSDEFINITION'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_CLASSDEFINITION'].fields_by_name['royalty_rate']._options = None
  _globals['_CLASSDEFINITION'].fields_by_name['royalty_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_CLASS'].fields_by_name['uri']._options = None
  _globals['_CLASS'].fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _globals['_CLASS'].fields_by_name['uri_hash']._options = None
  _globals['_CLASS'].fields_by_name['uri_hash']._serialized_options = b'\342\336\037\007URIHash'
  _globals['_CLASS'].fields_by_name['royalty_rate']._options = None
  _globals['_CLASS'].fields_by_name['royalty_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_CLASSFEATURE']._serialized_start=700
  _globals['_CLASSFEATURE']._serialized_end=780
  _globals['_CLASSDEFINITION']._serialized_start=104
  _globals['_CLASSDEFINITION']._serialized_end=315
  _globals['_CLASS']._serialized_start=318
  _globals['_CLASS']._serialized_end=698
# @@protoc_insertion_point(module_scope)
