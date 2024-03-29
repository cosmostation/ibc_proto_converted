# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ethermint/feemarket/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from ethermint.feemarket.v1 import feemarket_pb2 as ethermint_dot_feemarket_dot_v1_dot_feemarket__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"ethermint/feemarket/v1/query.proto\x12\x16\x65thermint.feemarket.v1\x1a&ethermint/feemarket/v1/feemarket.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"\x14\n\x12QueryParamsRequest\"S\n\x13QueryParamsResponse\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.ethermint.feemarket.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x15\n\x13QueryBaseFeeRequest\"]\n\x14QueryBaseFeeResponse\x12\x45\n\x08\x62\x61se_fee\x18\x01 \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x07\x62\x61seFee\"\x16\n\x14QueryBlockGasRequest\")\n\x15QueryBlockGasResponse\x12\x10\n\x03gas\x18\x01 \x01(\x03R\x03gas2\xad\x03\n\x05Query\x12\x85\x01\n\x06Params\x12*.ethermint.feemarket.v1.QueryParamsRequest\x1a+.ethermint.feemarket.v1.QueryParamsResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/evmos/feemarket/v1/params\x12\x8a\x01\n\x07\x42\x61seFee\x12+.ethermint.feemarket.v1.QueryBaseFeeRequest\x1a,.ethermint.feemarket.v1.QueryBaseFeeResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/evmos/feemarket/v1/base_fee\x12\x8e\x01\n\x08\x42lockGas\x12,.ethermint.feemarket.v1.QueryBlockGasRequest\x1a-.ethermint.feemarket.v1.QueryBlockGasResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/evmos/feemarket/v1/block_gasB\xce\x01\n\x1a\x63om.ethermint.feemarket.v1B\nQueryProtoZ,github.com/evmos/evmos/v13/x/feemarket/types\xa2\x02\x03\x45\x46X\xaa\x02\x16\x45thermint.Feemarket.V1\xca\x02\x16\x45thermint\\Feemarket\\V1\xe2\x02\"Ethermint\\Feemarket\\V1\\GPBMetadata\xea\x02\x18\x45thermint::Feemarket::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ethermint.feemarket.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.ethermint.feemarket.v1B\nQueryProtoZ,github.com/evmos/evmos/v13/x/feemarket/types\242\002\003EFX\252\002\026Ethermint.Feemarket.V1\312\002\026Ethermint\\Feemarket\\V1\342\002\"Ethermint\\Feemarket\\V1\\GPBMetadata\352\002\030Ethermint::Feemarket::V1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYBASEFEERESPONSE'].fields_by_name['base_fee']._options = None
  _globals['_QUERYBASEFEERESPONSE'].fields_by_name['base_fee']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\034\022\032/evmos/feemarket/v1/params'
  _globals['_QUERY'].methods_by_name['BaseFee']._options = None
  _globals['_QUERY'].methods_by_name['BaseFee']._serialized_options = b'\202\323\344\223\002\036\022\034/evmos/feemarket/v1/base_fee'
  _globals['_QUERY'].methods_by_name['BlockGas']._options = None
  _globals['_QUERY'].methods_by_name['BlockGas']._serialized_options = b'\202\323\344\223\002\037\022\035/evmos/feemarket/v1/block_gas'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=154
  _globals['_QUERYPARAMSREQUEST']._serialized_end=174
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=176
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=259
  _globals['_QUERYBASEFEEREQUEST']._serialized_start=261
  _globals['_QUERYBASEFEEREQUEST']._serialized_end=282
  _globals['_QUERYBASEFEERESPONSE']._serialized_start=284
  _globals['_QUERYBASEFEERESPONSE']._serialized_end=377
  _globals['_QUERYBLOCKGASREQUEST']._serialized_start=379
  _globals['_QUERYBLOCKGASREQUEST']._serialized_end=401
  _globals['_QUERYBLOCKGASRESPONSE']._serialized_start=403
  _globals['_QUERYBLOCKGASRESPONSE']._serialized_end=444
  _globals['_QUERY']._serialized_start=447
  _globals['_QUERY']._serialized_end=876
# @@protoc_insertion_point(module_scope)
