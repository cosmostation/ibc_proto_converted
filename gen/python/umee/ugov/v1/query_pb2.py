# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: umee/ugov/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18umee/ugov/v1/query.proto\x12\x0cumee.ugov.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x12\n\x10QueryMinGasPrice\"b\n\x18QueryMinGasPriceResponse\x12\x46\n\rmin_gas_price\x18\x01 \x01(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB\x04\xc8\xde\x1f\x00R\x0bminGasPrice2\x83\x01\n\x05Query\x12z\n\x0bMinGasPrice\x12\x1e.umee.ugov.v1.QueryMinGasPrice\x1a&.umee.ugov.v1.QueryMinGasPriceResponse\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/umee/ugov/v1/min-gas-priceB\x9a\x01\n\x10\x63om.umee.ugov.v1B\nQueryProtoZ&github.com/umee-network/umee/v5/x/ugov\xa2\x02\x03UUX\xaa\x02\x0cUmee.Ugov.V1\xca\x02\x0cUmee\\Ugov\\V1\xe2\x02\x18Umee\\Ugov\\V1\\GPBMetadata\xea\x02\x0eUmee::Ugov::V1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'umee.ugov.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.umee.ugov.v1B\nQueryProtoZ&github.com/umee-network/umee/v5/x/ugov\242\002\003UUX\252\002\014Umee.Ugov.V1\312\002\014Umee\\Ugov\\V1\342\002\030Umee\\Ugov\\V1\\GPBMetadata\352\002\016Umee::Ugov::V1\310\341\036\000'
  _globals['_QUERYMINGASPRICERESPONSE'].fields_by_name['min_gas_price']._options = None
  _globals['_QUERYMINGASPRICERESPONSE'].fields_by_name['min_gas_price']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['MinGasPrice']._options = None
  _globals['_QUERY'].methods_by_name['MinGasPrice']._serialized_options = b'\202\323\344\223\002\035\022\033/umee/ugov/v1/min-gas-price'
  _globals['_QUERYMINGASPRICE']._serialized_start=126
  _globals['_QUERYMINGASPRICE']._serialized_end=144
  _globals['_QUERYMINGASPRICERESPONSE']._serialized_start=146
  _globals['_QUERYMINGASPRICERESPONSE']._serialized_end=244
  _globals['_QUERY']._serialized_start=247
  _globals['_QUERY']._serialized_end=378
# @@protoc_insertion_point(module_scope)
