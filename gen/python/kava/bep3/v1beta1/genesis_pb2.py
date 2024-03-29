# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/bep3/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from kava.bep3.v1beta1 import bep3_pb2 as kava_dot_bep3_dot_v1beta1_dot_bep3__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fkava/bep3/v1beta1/genesis.proto\x12\x11kava.bep3.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1ckava/bep3/v1beta1/bep3.proto\"\xc7\x02\n\x0cGenesisState\x12\x37\n\x06params\x18\x01 \x01(\x0b\x32\x19.kava.bep3.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12U\n\x0c\x61tomic_swaps\x18\x02 \x03(\x0b\x32\x1d.kava.bep3.v1beta1.AtomicSwapB\x13\xc8\xde\x1f\x00\xaa\xdf\x1f\x0b\x41tomicSwapsR\x0b\x61tomicSwaps\x12Q\n\x08supplies\x18\x03 \x03(\x0b\x32\x1e.kava.bep3.v1beta1.AssetSupplyB\x15\xc8\xde\x1f\x00\xaa\xdf\x1f\rAssetSuppliesR\x08supplies\x12T\n\x13previous_block_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x11previousBlockTimeB\xb1\x01\n\x15\x63om.kava.bep3.v1beta1B\x0cGenesisProtoZ&github.com/kava-labs/kava/x/bep3/types\xa2\x02\x03KBX\xaa\x02\x11Kava.Bep3.V1beta1\xca\x02\x11Kava\\Bep3\\V1beta1\xe2\x02\x1dKava\\Bep3\\V1beta1\\GPBMetadata\xea\x02\x13Kava::Bep3::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.bep3.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.kava.bep3.v1beta1B\014GenesisProtoZ&github.com/kava-labs/kava/x/bep3/types\242\002\003KBX\252\002\021Kava.Bep3.V1beta1\312\002\021Kava\\Bep3\\V1beta1\342\002\035Kava\\Bep3\\V1beta1\\GPBMetadata\352\002\023Kava::Bep3::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['atomic_swaps']._options = None
  _globals['_GENESISSTATE'].fields_by_name['atomic_swaps']._serialized_options = b'\310\336\037\000\252\337\037\013AtomicSwaps'
  _globals['_GENESISSTATE'].fields_by_name['supplies']._options = None
  _globals['_GENESISSTATE'].fields_by_name['supplies']._serialized_options = b'\310\336\037\000\252\337\037\rAssetSupplies'
  _globals['_GENESISSTATE'].fields_by_name['previous_block_time']._options = None
  _globals['_GENESISSTATE'].fields_by_name['previous_block_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_GENESISSTATE']._serialized_start=140
  _globals['_GENESISSTATE']._serialized_end=467
# @@protoc_insertion_point(module_scope)
