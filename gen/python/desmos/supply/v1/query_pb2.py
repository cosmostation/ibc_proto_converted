# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/supply/v1/query.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x64\x65smos/supply/v1/query.proto\x12\x10\x64\x65smos.supply.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"^\n\x11QueryTotalRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12)\n\x10\x64ivider_exponent\x18\x02 \x01(\x04R\x0f\x64ividerExponent:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"q\n\x12QueryTotalResponse\x12Q\n\x0ctotal_supply\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0btotalSupply:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"d\n\x17QueryCirculatingRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12)\n\x10\x64ivider_exponent\x18\x02 \x01(\x04R\x0f\x64ividerExponent:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x83\x01\n\x18QueryCirculatingResponse\x12]\n\x12\x63irculating_supply\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11\x63irculatingSupply:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x32\x9a\x02\n\x05Query\x12{\n\x05Total\x12#.desmos.supply.v1.QueryTotalRequest\x1a$.desmos.supply.v1.QueryTotalResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/desmos/supply/v1/total/{denom}\x12\x93\x01\n\x0b\x43irculating\x12).desmos.supply.v1.QueryCirculatingRequest\x1a*.desmos.supply.v1.QueryCirculatingResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/desmos/supply/v1/circulating/{denom}B\xb3\x01\n\x14\x63om.desmos.supply.v1B\nQueryProtoZ/github.com/desmos-labs/desmos/v5/x/supply/types\xa2\x02\x03\x44SX\xaa\x02\x10\x44\x65smos.Supply.V1\xca\x02\x10\x44\x65smos\\Supply\\V1\xe2\x02\x1c\x44\x65smos\\Supply\\V1\\GPBMetadata\xea\x02\x12\x44\x65smos::Supply::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.supply.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.desmos.supply.v1B\nQueryProtoZ/github.com/desmos-labs/desmos/v5/x/supply/types\242\002\003DSX\252\002\020Desmos.Supply.V1\312\002\020Desmos\\Supply\\V1\342\002\034Desmos\\Supply\\V1\\GPBMetadata\352\002\022Desmos::Supply::V1'
  _globals['_QUERYTOTALREQUEST']._options = None
  _globals['_QUERYTOTALREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYTOTALRESPONSE'].fields_by_name['total_supply']._options = None
  _globals['_QUERYTOTALRESPONSE'].fields_by_name['total_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYTOTALRESPONSE']._options = None
  _globals['_QUERYTOTALRESPONSE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYCIRCULATINGREQUEST']._options = None
  _globals['_QUERYCIRCULATINGREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYCIRCULATINGRESPONSE'].fields_by_name['circulating_supply']._options = None
  _globals['_QUERYCIRCULATINGRESPONSE'].fields_by_name['circulating_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYCIRCULATINGRESPONSE']._options = None
  _globals['_QUERYCIRCULATINGRESPONSE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERY'].methods_by_name['Total']._options = None
  _globals['_QUERY'].methods_by_name['Total']._serialized_options = b'\202\323\344\223\002!\022\037/desmos/supply/v1/total/{denom}'
  _globals['_QUERY'].methods_by_name['Circulating']._options = None
  _globals['_QUERY'].methods_by_name['Circulating']._serialized_options = b'\202\323\344\223\002\'\022%/desmos/supply/v1/circulating/{denom}'
  _globals['_QUERYTOTALREQUEST']._serialized_start=102
  _globals['_QUERYTOTALREQUEST']._serialized_end=196
  _globals['_QUERYTOTALRESPONSE']._serialized_start=198
  _globals['_QUERYTOTALRESPONSE']._serialized_end=311
  _globals['_QUERYCIRCULATINGREQUEST']._serialized_start=313
  _globals['_QUERYCIRCULATINGREQUEST']._serialized_end=413
  _globals['_QUERYCIRCULATINGRESPONSE']._serialized_start=416
  _globals['_QUERYCIRCULATINGRESPONSE']._serialized_end=547
  _globals['_QUERY']._serialized_start=550
  _globals['_QUERY']._serialized_end=832
# @@protoc_insertion_point(module_scope)
