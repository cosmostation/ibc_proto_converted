# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/tokenmint/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from comdex.tokenmint.v1beta1 import mint_pb2 as comdex_dot_tokenmint_dot_v1beta1_dot_mint__pb2
from comdex.tokenmint.v1beta1 import params_pb2 as comdex_dot_tokenmint_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&comdex/tokenmint/v1beta1/genesis.proto\x12\x18\x63omdex.tokenmint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a#comdex/tokenmint/v1beta1/mint.proto\x1a%comdex/tokenmint/v1beta1/params.proto\"\xab\x01\n\x0cGenesisState\x12[\n\ttokenMint\x18\x01 \x03(\x0b\x32#.comdex.tokenmint.v1beta1.TokenMintB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"tokenMint\"R\ttokenMint\x12>\n\x06params\x18\x02 \x01(\x0b\x32 .comdex.tokenmint.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xe1\x01\n\x1c\x63om.comdex.tokenmint.v1beta1B\x0cGenesisProtoZ3github.com/comdex-official/comdex/x/tokenmint/types\xa2\x02\x03\x43TX\xaa\x02\x18\x43omdex.Tokenmint.V1beta1\xca\x02\x18\x43omdex\\Tokenmint\\V1beta1\xe2\x02$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Tokenmint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.tokenmint.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.comdex.tokenmint.v1beta1B\014GenesisProtoZ3github.com/comdex-official/comdex/x/tokenmint/types\242\002\003CTX\252\002\030Comdex.Tokenmint.V1beta1\312\002\030Comdex\\Tokenmint\\V1beta1\342\002$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\352\002\032Comdex::Tokenmint::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['tokenMint']._options = None
  _globals['_GENESISSTATE'].fields_by_name['tokenMint']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"tokenMint\"'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=167
  _globals['_GENESISSTATE']._serialized_end=338
# @@protoc_insertion_point(module_scope)
