# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/epochs/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from quicksilver.epochs.v1 import genesis_pb2 as quicksilver_dot_epochs_dot_v1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!quicksilver/epochs/v1/query.proto\x12\x15quicksilver.epochs.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a#quicksilver/epochs/v1/genesis.proto\"`\n\x16QueryEpochsInfoRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa2\x01\n\x17QueryEpochsInfoResponse\x12>\n\x06\x65pochs\x18\x01 \x03(\x0b\x32 .quicksilver.epochs.v1.EpochInfoB\x04\xc8\xde\x1f\x00R\x06\x65pochs\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\":\n\x18QueryCurrentEpochRequest\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\"@\n\x19QueryCurrentEpochResponse\x12#\n\rcurrent_epoch\x18\x01 \x01(\x03R\x0c\x63urrentEpoch2\xbe\x02\n\x05Query\x12\x92\x01\n\nEpochInfos\x12-.quicksilver.epochs.v1.QueryEpochsInfoRequest\x1a..quicksilver.epochs.v1.QueryEpochsInfoResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/quicksilver/epochs/v1/epochs\x12\x9f\x01\n\x0c\x43urrentEpoch\x12/.quicksilver.epochs.v1.QueryCurrentEpochRequest\x1a\x30.quicksilver.epochs.v1.QueryCurrentEpochResponse\",\x82\xd3\xe4\x93\x02&\x12$/quicksilver/epochs/v1/current_epochB\xd4\x01\n\x19\x63om.quicksilver.epochs.v1B\nQueryProtoP\x01Z5github.com/ingenuity-build/quicksilver/x/epochs/types\xa2\x02\x03QEX\xaa\x02\x15Quicksilver.Epochs.V1\xca\x02\x15Quicksilver\\Epochs\\V1\xe2\x02!Quicksilver\\Epochs\\V1\\GPBMetadata\xea\x02\x17Quicksilver::Epochs::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.epochs.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.quicksilver.epochs.v1B\nQueryProtoP\001Z5github.com/ingenuity-build/quicksilver/x/epochs/types\242\002\003QEX\252\002\025Quicksilver.Epochs.V1\312\002\025Quicksilver\\Epochs\\V1\342\002!Quicksilver\\Epochs\\V1\\GPBMetadata\352\002\027Quicksilver::Epochs::V1'
  _QUERYEPOCHSINFORESPONSE.fields_by_name['epochs']._options = None
  _QUERYEPOCHSINFORESPONSE.fields_by_name['epochs']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['EpochInfos']._options = None
  _QUERY.methods_by_name['EpochInfos']._serialized_options = b'\202\323\344\223\002\037\022\035/quicksilver/epochs/v1/epochs'
  _QUERY.methods_by_name['CurrentEpoch']._options = None
  _QUERY.methods_by_name['CurrentEpoch']._serialized_options = b'\202\323\344\223\002&\022$/quicksilver/epochs/v1/current_epoch'
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_start=193
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_end=289
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_start=292
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_end=454
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_start=456
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_end=514
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_start=516
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_end=580
  _globals['_QUERY']._serialized_start=583
  _globals['_QUERY']._serialized_end=901
# @@protoc_insertion_point(module_scope)