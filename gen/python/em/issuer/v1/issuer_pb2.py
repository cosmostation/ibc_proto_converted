# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/issuer/v1/issuer.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x65m/issuer/v1/issuer.proto\x12\x0c\x65m.issuer.v1\x1a\x14gogoproto/gogo.proto\"a\n\x06Issuer\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12)\n\x06\x64\x65noms\x18\x02 \x03(\tB\x11\xf2\xde\x1f\ryaml:\"denoms\"R\x06\x64\x65noms\"W\n\x07Issuers\x12\x46\n\x07issuers\x18\x01 \x03(\x0b\x32\x14.em.issuer.v1.IssuerB\x16\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"issuers\"R\x07issuers:\x04\x98\xa0\x1f\x00\x42\x9c\x01\n\x10\x63om.em.issuer.v1B\x0bIssuerProtoZ+github.com/e-money/em-ledger/x/issuer/types\xa2\x02\x03\x45IX\xaa\x02\x0c\x45m.Issuer.V1\xca\x02\x0c\x45m\\Issuer\\V1\xe2\x02\x18\x45m\\Issuer\\V1\\GPBMetadata\xea\x02\x0e\x45m::Issuer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.issuer.v1.issuer_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.em.issuer.v1B\013IssuerProtoZ+github.com/e-money/em-ledger/x/issuer/types\242\002\003EIX\252\002\014Em.Issuer.V1\312\002\014Em\\Issuer\\V1\342\002\030Em\\Issuer\\V1\\GPBMetadata\352\002\016Em::Issuer::V1'
  _globals['_ISSUER'].fields_by_name['address']._options = None
  _globals['_ISSUER'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_ISSUER'].fields_by_name['denoms']._options = None
  _globals['_ISSUER'].fields_by_name['denoms']._serialized_options = b'\362\336\037\ryaml:\"denoms\"'
  _globals['_ISSUERS'].fields_by_name['issuers']._options = None
  _globals['_ISSUERS'].fields_by_name['issuers']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"issuers\"'
  _globals['_ISSUERS']._options = None
  _globals['_ISSUERS']._serialized_options = b'\230\240\037\000'
  _globals['_ISSUER']._serialized_start=65
  _globals['_ISSUER']._serialized_end=162
  _globals['_ISSUERS']._serialized_start=164
  _globals['_ISSUERS']._serialized_end=251
# @@protoc_insertion_point(module_scope)
