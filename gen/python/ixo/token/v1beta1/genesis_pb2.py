# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/token/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ixo.token.v1beta1 import token_pb2 as ixo_dot_token_dot_v1beta1_dot_token__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fixo/token/v1beta1/genesis.proto\x12\x11ixo.token.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1dixo/token/v1beta1/token.proto\"\xd4\x01\n\x0cGenesisState\x12\x37\n\x06params\x18\x01 \x01(\x0b\x32\x19.ixo.token.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x36\n\x06tokens\x18\x02 \x03(\x0b\x32\x18.ixo.token.v1beta1.TokenB\x04\xc8\xde\x1f\x00R\x06tokens\x12S\n\x10token_properties\x18\x03 \x03(\x0b\x32\".ixo.token.v1beta1.TokenPropertiesB\x04\xc8\xde\x1f\x00R\x0ftokenPropertiesB\xc2\x01\n\x15\x63om.ixo.token.v1beta1B\x0cGenesisProtoP\x01Z5github.com/ixofoundation/ixo-blockchain/x/token/types\xa2\x02\x03ITX\xaa\x02\x11Ixo.Token.V1beta1\xca\x02\x11Ixo\\Token\\V1beta1\xe2\x02\x1dIxo\\Token\\V1beta1\\GPBMetadata\xea\x02\x13Ixo::Token::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.token.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.ixo.token.v1beta1B\014GenesisProtoP\001Z5github.com/ixofoundation/ixo-blockchain/x/token/types\242\002\003ITX\252\002\021Ixo.Token.V1beta1\312\002\021Ixo\\Token\\V1beta1\342\002\035Ixo\\Token\\V1beta1\\GPBMetadata\352\002\023Ixo::Token::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['tokens']._options = None
  _GENESISSTATE.fields_by_name['tokens']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['token_properties']._options = None
  _GENESISSTATE.fields_by_name['token_properties']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=108
  _globals['_GENESISSTATE']._serialized_end=320
# @@protoc_insertion_point(module_scope)