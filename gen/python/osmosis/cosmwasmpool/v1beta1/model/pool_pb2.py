# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/cosmwasmpool/v1beta1/model/pool.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-osmosis/cosmwasmpool/v1beta1/model/pool.proto\x12\x1cosmosis.cosmwasmpool.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x9c\x02\n\x0c\x43osmWasmPool\x12:\n\x0cpool_address\x18\x01 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"pool_address\"R\x0bpoolAddress\x12\x46\n\x10\x63ontract_address\x18\x02 \x01(\tB\x1b\xf2\xde\x1f\x17yaml:\"contract_address\"R\x0f\x63ontractAddress\x12\x17\n\x07pool_id\x18\x03 \x01(\x04R\x06poolId\x12\x17\n\x07\x63ode_id\x18\x04 \x01(\x04R\x06\x63odeId\x12\x43\n\x0finstantiate_msg\x18\x05 \x01(\x0c\x42\x1a\xf2\xde\x1f\x16yaml:\"instantiate_msg\"R\x0einstantiateMsg:\x11\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xca\xb4-\x05PoolIB\xf7\x01\n com.osmosis.cosmwasmpool.v1beta1B\tPoolProtoZ8github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/model\xa2\x02\x03OCX\xaa\x02\x1cOsmosis.Cosmwasmpool.V1beta1\xca\x02\x1cOsmosis\\Cosmwasmpool\\V1beta1\xe2\x02(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\xea\x02\x1eOsmosis::Cosmwasmpool::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.cosmwasmpool.v1beta1.model.pool_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n com.osmosis.cosmwasmpool.v1beta1B\tPoolProtoZ8github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/model\242\002\003OCX\252\002\034Osmosis.Cosmwasmpool.V1beta1\312\002\034Osmosis\\Cosmwasmpool\\V1beta1\342\002(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\352\002\036Osmosis::Cosmwasmpool::V1beta1'
  _globals['_COSMWASMPOOL'].fields_by_name['pool_address']._options = None
  _globals['_COSMWASMPOOL'].fields_by_name['pool_address']._serialized_options = b'\362\336\037\023yaml:\"pool_address\"'
  _globals['_COSMWASMPOOL'].fields_by_name['contract_address']._options = None
  _globals['_COSMWASMPOOL'].fields_by_name['contract_address']._serialized_options = b'\362\336\037\027yaml:\"contract_address\"'
  _globals['_COSMWASMPOOL'].fields_by_name['instantiate_msg']._options = None
  _globals['_COSMWASMPOOL'].fields_by_name['instantiate_msg']._serialized_options = b'\362\336\037\026yaml:\"instantiate_msg\"'
  _globals['_COSMWASMPOOL']._options = None
  _globals['_COSMWASMPOOL']._serialized_options = b'\210\240\037\000\230\240\037\000\312\264-\005PoolI'
  _globals['_COSMWASMPOOL']._serialized_start=162
  _globals['_COSMWASMPOOL']._serialized_end=446
# @@protoc_insertion_point(module_scope)
