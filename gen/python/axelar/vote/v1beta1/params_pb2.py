# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/vote/v1beta1/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.utils.v1beta1 import threshold_pb2 as axelar_dot_utils_dot_v1beta1_dot_threshold__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n axelar/vote/v1beta1/params.proto\x12\x13\x61xelar.vote.v1beta1\x1a\x14gogoproto/gogo.proto\x1a$axelar/utils/v1beta1/threshold.proto\"\x95\x01\n\x06Params\x12_\n\x18\x64\x65\x66\x61ult_voting_threshold\x18\x01 \x01(\x0b\x32\x1f.axelar.utils.v1beta1.ThresholdB\x04\xc8\xde\x1f\x00R\x16\x64\x65\x66\x61ultVotingThreshold\x12*\n\x11\x65nd_blocker_limit\x18\x02 \x01(\x03R\x0f\x65ndBlockerLimitB\xc9\x01\n\x17\x63om.axelar.vote.v1beta1B\x0bParamsProtoZ1github.com/axelarnetwork/axelar-core/x/vote/types\xa2\x02\x03\x41VX\xaa\x02\x13\x41xelar.Vote.V1beta1\xca\x02\x13\x41xelar\\Vote\\V1beta1\xe2\x02\x1f\x41xelar\\Vote\\V1beta1\\GPBMetadata\xea\x02\x15\x41xelar::Vote::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.vote.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.axelar.vote.v1beta1B\013ParamsProtoZ1github.com/axelarnetwork/axelar-core/x/vote/types\242\002\003AVX\252\002\023Axelar.Vote.V1beta1\312\002\023Axelar\\Vote\\V1beta1\342\002\037Axelar\\Vote\\V1beta1\\GPBMetadata\352\002\025Axelar::Vote::V1beta1\310\341\036\000'
  _globals['_PARAMS'].fields_by_name['default_voting_threshold']._options = None
  _globals['_PARAMS'].fields_by_name['default_voting_threshold']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS']._serialized_start=118
  _globals['_PARAMS']._serialized_end=267
# @@protoc_insertion_point(module_scope)
