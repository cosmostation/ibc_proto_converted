# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/wasmx/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from injective.wasmx.v1 import wasmx_pb2 as injective_dot_wasmx_dot_v1_dot_wasmx__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n injective/wasmx/v1/genesis.proto\x12\x12injective.wasmx.v1\x1a\x1einjective/wasmx/v1/wasmx.proto\x1a\x14gogoproto/gogo.proto\"\x92\x01\n\x1dRegisteredContractWithAddress\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12W\n\x13registered_contract\x18\x02 \x01(\x0b\x32&.injective.wasmx.v1.RegisteredContractR\x12registeredContract\"\xb4\x01\n\x0cGenesisState\x12\x38\n\x06params\x18\x01 \x01(\x0b\x32\x1a.injective.wasmx.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12j\n\x14registered_contracts\x18\x02 \x03(\x0b\x32\x31.injective.wasmx.v1.RegisteredContractWithAddressB\x04\xc8\xde\x1f\x00R\x13registeredContractsB\xdd\x01\n\x16\x63om.injective.wasmx.v1B\x0cGenesisProtoP\x01ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/wasmx/types\xa2\x02\x03IWX\xaa\x02\x12Injective.Wasmx.V1\xca\x02\x12Injective\\Wasmx\\V1\xe2\x02\x1eInjective\\Wasmx\\V1\\GPBMetadata\xea\x02\x14Injective::Wasmx::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.wasmx.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.injective.wasmx.v1B\014GenesisProtoP\001ZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/wasmx/types\242\002\003IWX\252\002\022Injective.Wasmx.V1\312\002\022Injective\\Wasmx\\V1\342\002\036Injective\\Wasmx\\V1\\GPBMetadata\352\002\024Injective::Wasmx::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['registered_contracts']._options = None
  _GENESISSTATE.fields_by_name['registered_contracts']._serialized_options = b'\310\336\037\000'
  _globals['_REGISTEREDCONTRACTWITHADDRESS']._serialized_start=111
  _globals['_REGISTEREDCONTRACTWITHADDRESS']._serialized_end=257
  _globals['_GENESISSTATE']._serialized_start=260
  _globals['_GENESISSTATE']._serialized_end=440
# @@protoc_insertion_point(module_scope)