# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/delegation/v1beta1/query.proto
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
from kyve.delegation.v1beta1 import params_pb2 as kyve_dot_delegation_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#kyve/delegation/v1beta1/query.proto\x12\x17kyve.delegation.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a$kyve/delegation/v1beta1/params.proto\"\x14\n\x12QueryParamsRequest\"T\n\x13QueryParamsResponse\x12=\n\x06params\x18\x01 \x01(\x0b\x32\x1f.kyve.delegation.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x96\x01\n\x05Query\x12\x8c\x01\n\x06Params\x12+.kyve.delegation.v1beta1.QueryParamsRequest\x1a,.kyve.delegation.v1beta1.QueryParamsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/kyve/delegation/v1beta1/paramsB\xd6\x01\n\x1b\x63om.kyve.delegation.v1beta1B\nQueryProtoZ/github.com/KYVENetwork/chain/x/delegation/types\xa2\x02\x03KDX\xaa\x02\x17Kyve.Delegation.V1beta1\xca\x02\x17Kyve\\Delegation\\V1beta1\xe2\x02#Kyve\\Delegation\\V1beta1\\GPBMetadata\xea\x02\x19Kyve::Delegation::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.delegation.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.kyve.delegation.v1beta1B\nQueryProtoZ/github.com/KYVENetwork/chain/x/delegation/types\242\002\003KDX\252\002\027Kyve.Delegation.V1beta1\312\002\027Kyve\\Delegation\\V1beta1\342\002#Kyve\\Delegation\\V1beta1\\GPBMetadata\352\002\031Kyve::Delegation::V1beta1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002!\022\037/kyve/delegation/v1beta1/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=154
  _globals['_QUERYPARAMSREQUEST']._serialized_end=174
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=176
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=260
  _globals['_QUERY']._serialized_start=263
  _globals['_QUERY']._serialized_end=413
# @@protoc_insertion_point(module_scope)
