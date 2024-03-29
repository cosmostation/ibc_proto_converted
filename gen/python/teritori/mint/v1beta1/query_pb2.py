# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: teritori/mint/v1beta1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from teritori.mint.v1beta1 import mint_pb2 as teritori_dot_mint_dot_v1beta1_dot_mint__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!teritori/mint/v1beta1/query.proto\x12\x15teritori.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a teritori/mint/v1beta1/mint.proto\"\x14\n\x12QueryParamsRequest\"R\n\x13QueryParamsResponse\x12;\n\x06params\x18\x01 \x01(\x0b\x32\x1d.teritori.mint.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x1d\n\x1bQueryBlockProvisionsRequest\"y\n\x1cQueryBlockProvisionsResponse\x12Y\n\x10\x62lock_provisions\x18\x01 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0f\x62lockProvisions2\xbe\x02\n\x05Query\x12\x86\x01\n\x06Params\x12).teritori.mint.v1beta1.QueryParamsRequest\x1a*.teritori.mint.v1beta1.QueryParamsResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/teritori/mint/v1beta1/params\x12\xab\x01\n\x0f\x42lockProvisions\x12\x32.teritori.mint.v1beta1.QueryBlockProvisionsRequest\x1a\x33.teritori.mint.v1beta1.QueryBlockProvisionsResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/teritori/mint/v1beta1/block_provisionsB\xcc\x01\n\x19\x63om.teritori.mint.v1beta1B\nQueryProtoZ/github.com/TERITORI/teritori-chain/x/mint/types\xa2\x02\x03TMX\xaa\x02\x15Teritori.Mint.V1beta1\xca\x02\x15Teritori\\Mint\\V1beta1\xe2\x02!Teritori\\Mint\\V1beta1\\GPBMetadata\xea\x02\x17Teritori::Mint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'teritori.mint.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.teritori.mint.v1beta1B\nQueryProtoZ/github.com/TERITORI/teritori-chain/x/mint/types\242\002\003TMX\252\002\025Teritori.Mint.V1beta1\312\002\025Teritori\\Mint\\V1beta1\342\002!Teritori\\Mint\\V1beta1\\GPBMetadata\352\002\027Teritori::Mint::V1beta1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYBLOCKPROVISIONSRESPONSE'].fields_by_name['block_provisions']._options = None
  _globals['_QUERYBLOCKPROVISIONSRESPONSE'].fields_by_name['block_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\037\022\035/teritori/mint/v1beta1/params'
  _globals['_QUERY'].methods_by_name['BlockProvisions']._options = None
  _globals['_QUERY'].methods_by_name['BlockProvisions']._serialized_options = b'\202\323\344\223\002)\022\'/teritori/mint/v1beta1/block_provisions'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=146
  _globals['_QUERYPARAMSREQUEST']._serialized_end=166
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=168
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=250
  _globals['_QUERYBLOCKPROVISIONSREQUEST']._serialized_start=252
  _globals['_QUERYBLOCKPROVISIONSREQUEST']._serialized_end=281
  _globals['_QUERYBLOCKPROVISIONSRESPONSE']._serialized_start=283
  _globals['_QUERYBLOCKPROVISIONSRESPONSE']._serialized_end=404
  _globals['_QUERY']._serialized_start=407
  _globals['_QUERY']._serialized_end=725
# @@protoc_insertion_point(module_scope)
