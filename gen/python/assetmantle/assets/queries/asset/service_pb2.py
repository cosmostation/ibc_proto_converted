# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/assets/queries/asset/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from assetmantle.assets.queries.asset import query_request_pb2 as assetmantle_dot_assets_dot_queries_dot_asset_dot_query__request__pb2
from assetmantle.assets.queries.asset import query_response_pb2 as assetmantle_dot_assets_dot_queries_dot_asset_dot_query__response__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.assetmantle/assets/queries/asset/service.proto\x12(assetmantle.modules.assets.queries.asset\x1a\x1cgoogle/api/annotations.proto\x1a\x34\x61ssetmantle/assets/queries/asset/query_request.proto\x1a\x35\x61ssetmantle/assets/queries/asset/query_response.proto2\xab\x01\n\x07Service\x12\x9f\x01\n\x06Handle\x12\x36.assetmantle.modules.assets.queries.asset.QueryRequest\x1a\x37.assetmantle.modules.assets.queries.asset.QueryResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/mantle/assets/v1beta1/assetB\x82\x02\n,com.assetmantle.modules.assets.queries.assetB\x0cServiceProtoP\x01\xa2\x02\x05\x41MAQA\xaa\x02(Assetmantle.Modules.Assets.Queries.Asset\xca\x02(Assetmantle\\Modules\\Assets\\Queries\\Asset\xe2\x02\x34\x41ssetmantle\\Modules\\Assets\\Queries\\Asset\\GPBMetadata\xea\x02,Assetmantle::Modules::Assets::Queries::Assetb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.assets.queries.asset.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n,com.assetmantle.modules.assets.queries.assetB\014ServiceProtoP\001\242\002\005AMAQA\252\002(Assetmantle.Modules.Assets.Queries.Asset\312\002(Assetmantle\\Modules\\Assets\\Queries\\Asset\342\0024Assetmantle\\Modules\\Assets\\Queries\\Asset\\GPBMetadata\352\002,Assetmantle::Modules::Assets::Queries::Asset'
  _SERVICE.methods_by_name['Handle']._options = None
  _SERVICE.methods_by_name['Handle']._serialized_options = b'\202\323\344\223\002\036\022\034/mantle/assets/v1beta1/asset'
  _globals['_SERVICE']._serialized_start=232
  _globals['_SERVICE']._serialized_end=403
# @@protoc_insertion_point(module_scope)