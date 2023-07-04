# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irishub/mint/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from irishub.mint import mint_pb2 as irishub_dot_mint_dot_mint__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18irishub/mint/query.proto\x12\x0cirishub.mint\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x17irishub/mint/mint.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"\x14\n\x12QueryParamsRequest\"\x84\x01\n\x13QueryParamsResponse\x12\x32\n\x06params\x18\x01 \x01(\x0b\x32\x14.irishub.mint.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x39\n\x03res\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\x03res2t\n\x05Query\x12k\n\x06Params\x12 .irishub.mint.QueryParamsRequest\x1a!.irishub.mint.QueryParamsResponse\"\x1c\x82\xd3\xe4\x93\x02\x16\x12\x14/irishub/mint/paramsB\x9e\x01\n\x10\x63om.irishub.mintB\nQueryProtoP\x01Z-github.com/irisnet/irishub/modules/mint/types\xa2\x02\x03IMX\xaa\x02\x0cIrishub.Mint\xca\x02\x0cIrishub\\Mint\xe2\x02\x18Irishub\\Mint\\GPBMetadata\xea\x02\rIrishub::Mintb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irishub.mint.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.irishub.mintB\nQueryProtoP\001Z-github.com/irisnet/irishub/modules/mint/types\242\002\003IMX\252\002\014Irishub.Mint\312\002\014Irishub\\Mint\342\002\030Irishub\\Mint\\GPBMetadata\352\002\rIrishub::Mint'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\026\022\024/irishub/mint/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=163
  _globals['_QUERYPARAMSREQUEST']._serialized_end=183
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=186
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=318
  _globals['_QUERY']._serialized_start=320
  _globals['_QUERY']._serialized_end=436
# @@protoc_insertion_point(module_scope)