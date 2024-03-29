# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/asset/nft/v1/event.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from coreum.asset.nft.v1 import nft_pb2 as coreum_dot_asset_dot_nft_dot_v1_dot_nft__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63oreum/asset/nft/v1/event.proto\x12\x13\x63oreum.asset.nft.v1\x1a\x14gogoproto/gogo.proto\x1a\x1d\x63oreum/asset/nft/v1/nft.proto\"\xe5\x02\n\x10\x45ventClassIssued\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\x12\x16\n\x06issuer\x18\x02 \x01(\tR\x06issuer\x12\x16\n\x06symbol\x18\x03 \x01(\tR\x06symbol\x12\x12\n\x04name\x18\x04 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x05 \x01(\tR\x0b\x64\x65scription\x12\x19\n\x03uri\x18\x06 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12&\n\x08uri_hash\x18\x07 \x01(\tB\x0b\xe2\xde\x1f\x07URIHashR\x07uriHash\x12=\n\x08\x66\x65\x61tures\x18\x08 \x03(\x0e\x32!.coreum.asset.nft.v1.ClassFeatureR\x08\x66\x65\x61tures\x12Q\n\x0croyalty_rate\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0broyaltyRate\"N\n\x0b\x45ventFrozen\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\"P\n\rEventUnfrozen\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\"\\\n\x15\x45ventAddedToWhitelist\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x18\n\x07\x61\x63\x63ount\x18\x03 \x01(\tR\x07\x61\x63\x63ount\"`\n\x19\x45ventRemovedFromWhitelist\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x18\n\x07\x61\x63\x63ount\x18\x03 \x01(\tR\x07\x61\x63\x63ountB\xc8\x01\n\x17\x63om.coreum.asset.nft.v1B\nEventProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\xa2\x02\x03\x43\x41N\xaa\x02\x13\x43oreum.Asset.Nft.V1\xca\x02\x13\x43oreum\\Asset\\Nft\\V1\xe2\x02\x1f\x43oreum\\Asset\\Nft\\V1\\GPBMetadata\xea\x02\x16\x43oreum::Asset::Nft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.asset.nft.v1.event_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.coreum.asset.nft.v1B\nEventProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\242\002\003CAN\252\002\023Coreum.Asset.Nft.V1\312\002\023Coreum\\Asset\\Nft\\V1\342\002\037Coreum\\Asset\\Nft\\V1\\GPBMetadata\352\002\026Coreum::Asset::Nft::V1'
  _globals['_EVENTCLASSISSUED'].fields_by_name['id']._options = None
  _globals['_EVENTCLASSISSUED'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_EVENTCLASSISSUED'].fields_by_name['uri']._options = None
  _globals['_EVENTCLASSISSUED'].fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _globals['_EVENTCLASSISSUED'].fields_by_name['uri_hash']._options = None
  _globals['_EVENTCLASSISSUED'].fields_by_name['uri_hash']._serialized_options = b'\342\336\037\007URIHash'
  _globals['_EVENTCLASSISSUED'].fields_by_name['royalty_rate']._options = None
  _globals['_EVENTCLASSISSUED'].fields_by_name['royalty_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_EVENTCLASSISSUED']._serialized_start=110
  _globals['_EVENTCLASSISSUED']._serialized_end=467
  _globals['_EVENTFROZEN']._serialized_start=469
  _globals['_EVENTFROZEN']._serialized_end=547
  _globals['_EVENTUNFROZEN']._serialized_start=549
  _globals['_EVENTUNFROZEN']._serialized_end=629
  _globals['_EVENTADDEDTOWHITELIST']._serialized_start=631
  _globals['_EVENTADDEDTOWHITELIST']._serialized_end=723
  _globals['_EVENTREMOVEDFROMWHITELIST']._serialized_start=725
  _globals['_EVENTREMOVEDFROMWHITELIST']._serialized_end=821
# @@protoc_insertion_point(module_scope)
