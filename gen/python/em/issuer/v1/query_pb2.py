# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/issuer/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from em.issuer.v1 import issuer_pb2 as em_dot_issuer_dot_v1_dot_issuer__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x65m/issuer/v1/query.proto\x12\x0c\x65m.issuer.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19\x65m/issuer/v1/issuer.proto\"\x15\n\x13QueryIssuersRequest\"^\n\x14QueryIssuersResponse\x12\x46\n\x07issuers\x18\x01 \x03(\x0b\x32\x14.em.issuer.v1.IssuerB\x16\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"issuers\"R\x07issuers2}\n\x05Query\x12t\n\x07Issuers\x12!.em.issuer.v1.QueryIssuersRequest\x1a\".em.issuer.v1.QueryIssuersResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/e-money/issuer/v1/issuersB\x9d\x01\n\x10\x63om.em.issuer.v1B\nQueryProtoP\x01Z+github.com/e-money/em-ledger/x/issuer/types\xa2\x02\x03\x45IX\xaa\x02\x0c\x45m.Issuer.V1\xca\x02\x0c\x45m\\Issuer\\V1\xe2\x02\x18\x45m\\Issuer\\V1\\GPBMetadata\xea\x02\x0e\x45m::Issuer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.issuer.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.em.issuer.v1B\nQueryProtoP\001Z+github.com/e-money/em-ledger/x/issuer/types\242\002\003EIX\252\002\014Em.Issuer.V1\312\002\014Em\\Issuer\\V1\342\002\030Em\\Issuer\\V1\\GPBMetadata\352\002\016Em::Issuer::V1'
  _QUERYISSUERSRESPONSE.fields_by_name['issuers']._options = None
  _QUERYISSUERSRESPONSE.fields_by_name['issuers']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"issuers\"'
  _QUERY.methods_by_name['Issuers']._options = None
  _QUERY.methods_by_name['Issuers']._serialized_options = b'\202\323\344\223\002\034\022\032/e-money/issuer/v1/issuers'
  _globals['_QUERYISSUERSREQUEST']._serialized_start=153
  _globals['_QUERYISSUERSREQUEST']._serialized_end=174
  _globals['_QUERYISSUERSRESPONSE']._serialized_start=176
  _globals['_QUERYISSUERSRESPONSE']._serialized_end=270
  _globals['_QUERY']._serialized_start=272
  _globals['_QUERY']._serialized_end=397
# @@protoc_insertion_point(module_scope)