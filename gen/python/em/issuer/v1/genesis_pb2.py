# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/issuer/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from em.issuer.v1 import issuer_pb2 as em_dot_issuer_dot_v1_dot_issuer__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x65m/issuer/v1/genesis.proto\x12\x0c\x65m.issuer.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x65m/issuer/v1/issuer.proto\"V\n\x0cGenesisState\x12\x46\n\x07issuers\x18\x01 \x03(\x0b\x32\x14.em.issuer.v1.IssuerB\x16\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"issuers\"R\x07issuersB\x9f\x01\n\x10\x63om.em.issuer.v1B\x0cGenesisProtoP\x01Z+github.com/e-money/em-ledger/x/issuer/types\xa2\x02\x03\x45IX\xaa\x02\x0c\x45m.Issuer.V1\xca\x02\x0c\x45m\\Issuer\\V1\xe2\x02\x18\x45m\\Issuer\\V1\\GPBMetadata\xea\x02\x0e\x45m::Issuer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.issuer.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.em.issuer.v1B\014GenesisProtoP\001Z+github.com/e-money/em-ledger/x/issuer/types\242\002\003EIX\252\002\014Em.Issuer.V1\312\002\014Em\\Issuer\\V1\342\002\030Em\\Issuer\\V1\\GPBMetadata\352\002\016Em::Issuer::V1'
  _GENESISSTATE.fields_by_name['issuers']._options = None
  _GENESISSTATE.fields_by_name['issuers']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"issuers\"'
  _globals['_GENESISSTATE']._serialized_start=93
  _globals['_GENESISSTATE']._serialized_end=179
# @@protoc_insertion_point(module_scope)