# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/name/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from provenance.name.v1 import name_pb2 as provenance_dot_name_dot_v1_dot_name__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n provenance/name/v1/genesis.proto\x12\x12provenance.name.v1\x1a\x14gogoproto/gogo.proto\x1a\x1dprovenance/name/v1/name.proto\"\x94\x01\n\x0cGenesisState\x12\x38\n\x06params\x18\x01 \x01(\x0b\x32\x1a.provenance.name.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12@\n\x08\x62indings\x18\x02 \x03(\x0b\x32\x1e.provenance.name.v1.NameRecordB\x04\xc8\xde\x1f\x00R\x08\x62indings:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xc2\x01\n\x16\x63om.provenance.name.v1B\x0cGenesisProtoP\x01Z0github.com/provenance-io/provenance/x/name/types\xa2\x02\x03PNX\xaa\x02\x12Provenance.Name.V1\xca\x02\x12Provenance\\Name\\V1\xe2\x02\x1eProvenance\\Name\\V1\\GPBMetadata\xea\x02\x14Provenance::Name::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.name.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.provenance.name.v1B\014GenesisProtoP\001Z0github.com/provenance-io/provenance/x/name/types\242\002\003PNX\252\002\022Provenance.Name.V1\312\002\022Provenance\\Name\\V1\342\002\036Provenance\\Name\\V1\\GPBMetadata\352\002\024Provenance::Name::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['bindings']._options = None
  _GENESISSTATE.fields_by_name['bindings']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE._options = None
  _GENESISSTATE._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=110
  _globals['_GENESISSTATE']._serialized_end=258
# @@protoc_insertion_point(module_scope)