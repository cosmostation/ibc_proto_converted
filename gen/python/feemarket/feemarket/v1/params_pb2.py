# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: feemarket/feemarket/v1/params.proto
# Protobuf Python Version: 5.27.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    0,
    '',
    'feemarket/feemarket/v1/params.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#feemarket/feemarket/v1/params.proto\x12\x16\x66\x65\x65market.feemarket.v1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xa3\x06\n\x06Params\x12G\n\x05\x61lpha\x18\x01 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x05\x61lpha\x12\x45\n\x04\x62\x65ta\x18\x02 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x04\x62\x65ta\x12G\n\x05theta\x18\x03 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x05theta\x12G\n\x05\x64\x65lta\x18\x04 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x05\x64\x65lta\x12S\n\x0cmin_base_fee\x18\x05 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\nminBaseFee\x12]\n\x11min_learning_rate\x18\x06 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x0fminLearningRate\x12]\n\x11max_learning_rate\x18\x07 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x0fmaxLearningRate\x12\x38\n\x18target_block_utilization\x18\x08 \x01(\x04R\x16targetBlockUtilization\x12\x32\n\x15max_block_utilization\x18\t \x01(\x04R\x13maxBlockUtilization\x12\x16\n\x06window\x18\n \x01(\x04R\x06window\x12\x1b\n\tfee_denom\x18\x0b \x01(\tR\x08\x66\x65\x65\x44\x65nom\x12\x18\n\x07\x65nabled\x18\x0c \x01(\x08R\x07\x65nabled\x12\'\n\x0f\x64istribute_fees\x18\r \x01(\x08R\x0e\x64istributeFeesB\xd2\x01\n\x1a\x63om.feemarket.feemarket.v1B\x0bParamsProtoZ/github.com/skip-mev/feemarket/x/feemarket/types\xa2\x02\x03\x46\x46X\xaa\x02\x16\x46\x65\x65market.Feemarket.V1\xca\x02\x16\x46\x65\x65market\\Feemarket\\V1\xe2\x02\"Feemarket\\Feemarket\\V1\\GPBMetadata\xea\x02\x18\x46\x65\x65market::Feemarket::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'feemarket.feemarket.v1.params_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.feemarket.feemarket.v1B\013ParamsProtoZ/github.com/skip-mev/feemarket/x/feemarket/types\242\002\003FFX\252\002\026Feemarket.Feemarket.V1\312\002\026Feemarket\\Feemarket\\V1\342\002\"Feemarket\\Feemarket\\V1\\GPBMetadata\352\002\030Feemarket::Feemarket::V1'
  _globals['_PARAMS'].fields_by_name['alpha']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['alpha']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['beta']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['beta']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['theta']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['theta']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['delta']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['delta']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['min_base_fee']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['min_base_fee']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['min_learning_rate']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['min_learning_rate']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS'].fields_by_name['max_learning_rate']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['max_learning_rate']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_PARAMS']._serialized_start=113
  _globals['_PARAMS']._serialized_end=916
# @@protoc_insertion_point(module_scope)