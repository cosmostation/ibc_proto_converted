# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/entity/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ixo.entity.v1beta1 import entity_pb2 as ixo_dot_entity_dot_v1beta1_dot_entity__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n ixo/entity/v1beta1/genesis.proto\x12\x12ixo.entity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fixo/entity/v1beta1/entity.proto\"\x86\x01\n\x0cGenesisState\x12<\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x1a.ixo.entity.v1beta1.EntityB\x04\xc8\xde\x1f\x00R\x08\x65ntities\x12\x38\n\x06params\x18\x02 \x01(\x0b\x32\x1a.ixo.entity.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xc8\x01\n\x16\x63om.ixo.entity.v1beta1B\x0cGenesisProtoP\x01Z6github.com/ixofoundation/ixo-blockchain/x/entity/types\xa2\x02\x03IEX\xaa\x02\x12Ixo.Entity.V1beta1\xca\x02\x12Ixo\\Entity\\V1beta1\xe2\x02\x1eIxo\\Entity\\V1beta1\\GPBMetadata\xea\x02\x14Ixo::Entity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.entity.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.ixo.entity.v1beta1B\014GenesisProtoP\001Z6github.com/ixofoundation/ixo-blockchain/x/entity/types\242\002\003IEX\252\002\022Ixo.Entity.V1beta1\312\002\022Ixo\\Entity\\V1beta1\342\002\036Ixo\\Entity\\V1beta1\\GPBMetadata\352\002\024Ixo::Entity::V1beta1'
  _GENESISSTATE.fields_by_name['entities']._options = None
  _GENESISSTATE.fields_by_name['entities']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=112
  _globals['_GENESISSTATE']._serialized_end=246
# @@protoc_insertion_point(module_scope)