# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bitsong/merkledrop/v1beta1/merkledrop.proto
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
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+bitsong/merkledrop/v1beta1/merkledrop.proto\x12\x1a\x62itsong.merkledrop.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xdf\x02\n\nMerkledrop\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x37\n\x0bmerkle_root\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"merkle_root\"R\nmerkleRoot\x12!\n\x0cstart_height\x18\x03 \x01(\x03R\x0bstartHeight\x12\x1d\n\nend_height\x18\x04 \x01(\x03R\tendHeight\x12\x14\n\x05\x64\x65nom\x18\x05 \x01(\tR\x05\x64\x65nom\x12\x46\n\x06\x61mount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12H\n\x07\x63laimed\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x07\x63laimed\x12\x14\n\x05owner\x18\x08 \x01(\tR\x05owner:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\x42\xf7\x01\n\x1e\x63om.bitsong.merkledrop.v1beta1B\x0fMerkledropProtoZ8github.com/bitsongofficial/go-bitsong/x/merkledrop/types\xa2\x02\x03\x42MX\xaa\x02\x1a\x42itsong.Merkledrop.V1beta1\xca\x02\x1a\x42itsong\\Merkledrop\\V1beta1\xe2\x02&Bitsong\\Merkledrop\\V1beta1\\GPBMetadata\xea\x02\x1c\x42itsong::Merkledrop::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bitsong.merkledrop.v1beta1.merkledrop_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036com.bitsong.merkledrop.v1beta1B\017MerkledropProtoZ8github.com/bitsongofficial/go-bitsong/x/merkledrop/types\242\002\003BMX\252\002\032Bitsong.Merkledrop.V1beta1\312\002\032Bitsong\\Merkledrop\\V1beta1\342\002&Bitsong\\Merkledrop\\V1beta1\\GPBMetadata\352\002\034Bitsong::Merkledrop::V1beta1\310\341\036\000'
  _globals['_MERKLEDROP'].fields_by_name['merkle_root']._options = None
  _globals['_MERKLEDROP'].fields_by_name['merkle_root']._serialized_options = b'\362\336\037\022yaml:\"merkle_root\"'
  _globals['_MERKLEDROP'].fields_by_name['amount']._options = None
  _globals['_MERKLEDROP'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MERKLEDROP'].fields_by_name['claimed']._options = None
  _globals['_MERKLEDROP'].fields_by_name['claimed']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MERKLEDROP']._options = None
  _globals['_MERKLEDROP']._serialized_options = b'\210\240\037\000\230\240\037\000'
  _globals['_MERKLEDROP']._serialized_start=163
  _globals['_MERKLEDROP']._serialized_end=514
# @@protoc_insertion_point(module_scope)
