# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/tokenfactory/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.tokenfactory.v1beta1 import authorityMetadata_pb2 as osmosis_dot_tokenfactory_dot_v1beta1_dot_authorityMetadata__pb2
from osmosis.tokenfactory.v1beta1 import params_pb2 as osmosis_dot_tokenfactory_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*osmosis/tokenfactory/v1beta1/genesis.proto\x12\x1cosmosis.tokenfactory.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x34osmosis/tokenfactory/v1beta1/authorityMetadata.proto\x1a)osmosis/tokenfactory/v1beta1/params.proto\"\xc4\x01\n\x0cGenesisState\x12\x42\n\x06params\x18\x01 \x01(\x0b\x32$.osmosis.tokenfactory.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12p\n\x0e\x66\x61\x63tory_denoms\x18\x02 \x03(\x0b\x32*.osmosis.tokenfactory.v1beta1.GenesisDenomB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"factory_denoms\"R\rfactoryDenoms\"\xc5\x01\n\x0cGenesisDenom\x12&\n\x05\x64\x65nom\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\x12\x86\x01\n\x12\x61uthority_metadata\x18\x02 \x01(\x0b\x32\x34.osmosis.tokenfactory.v1beta1.DenomAuthorityMetadataB!\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"authority_metadata\"R\x11\x61uthorityMetadata:\x04\xe8\xa0\x1f\x01\x42\xfc\x01\n com.osmosis.tokenfactory.v1beta1B\x0cGenesisProtoP\x01Z8github.com/osmosis-labs/osmosis/v15/x/tokenfactory/types\xa2\x02\x03OTX\xaa\x02\x1cOsmosis.Tokenfactory.V1beta1\xca\x02\x1cOsmosis\\Tokenfactory\\V1beta1\xe2\x02(Osmosis\\Tokenfactory\\V1beta1\\GPBMetadata\xea\x02\x1eOsmosis::Tokenfactory::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.tokenfactory.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.osmosis.tokenfactory.v1beta1B\014GenesisProtoP\001Z8github.com/osmosis-labs/osmosis/v15/x/tokenfactory/types\242\002\003OTX\252\002\034Osmosis.Tokenfactory.V1beta1\312\002\034Osmosis\\Tokenfactory\\V1beta1\342\002(Osmosis\\Tokenfactory\\V1beta1\\GPBMetadata\352\002\036Osmosis::Tokenfactory::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['factory_denoms']._options = None
  _GENESISSTATE.fields_by_name['factory_denoms']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"factory_denoms\"'
  _GENESISDENOM.fields_by_name['denom']._options = None
  _GENESISDENOM.fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _GENESISDENOM.fields_by_name['authority_metadata']._options = None
  _GENESISDENOM.fields_by_name['authority_metadata']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"authority_metadata\"'
  _GENESISDENOM._options = None
  _GENESISDENOM._serialized_options = b'\350\240\037\001'
  _globals['_GENESISSTATE']._serialized_start=196
  _globals['_GENESISSTATE']._serialized_end=392
  _globals['_GENESISDENOM']._serialized_start=395
  _globals['_GENESISDENOM']._serialized_end=592
# @@protoc_insertion_point(module_scope)