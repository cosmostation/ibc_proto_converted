# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/epochs/query.proto
# Protobuf Python Version: 4.25.2
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
from osmosis.epochs import genesis_pb2 as osmosis_dot_epochs_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1aosmosis/epochs/query.proto\x12\x16osmosis.epochs.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1cosmosis/epochs/genesis.proto\"\x18\n\x16QueryEpochsInfoRequest\"Z\n\x17QueryEpochsInfoResponse\x12?\n\x06\x65pochs\x18\x01 \x03(\x0b\x32!.osmosis.epochs.v1beta1.EpochInfoB\x04\xc8\xde\x1f\x00R\x06\x65pochs\":\n\x18QueryCurrentEpochRequest\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\"@\n\x19QueryCurrentEpochResponse\x12#\n\rcurrent_epoch\x18\x01 \x01(\x03R\x0c\x63urrentEpoch2\xc4\x02\n\x05Query\x12\x95\x01\n\nEpochInfos\x12..osmosis.epochs.v1beta1.QueryEpochsInfoRequest\x1a/.osmosis.epochs.v1beta1.QueryEpochsInfoResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/osmosis/epochs/v1beta1/epochs\x12\xa2\x01\n\x0c\x43urrentEpoch\x12\x30.osmosis.epochs.v1beta1.QueryCurrentEpochRequest\x1a\x31.osmosis.epochs.v1beta1.QueryCurrentEpochResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/osmosis/epochs/v1beta1/current_epochB\xd0\x01\n\x1a\x63om.osmosis.epochs.v1beta1B\nQueryProtoZ.github.com/osmosis-labs/osmosis/x/epochs/types\xa2\x02\x03OEX\xaa\x02\x16Osmosis.Epochs.V1beta1\xca\x02\x16Osmosis\\Epochs\\V1beta1\xe2\x02\"Osmosis\\Epochs\\V1beta1\\GPBMetadata\xea\x02\x18Osmosis::Epochs::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.epochs.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.osmosis.epochs.v1beta1B\nQueryProtoZ.github.com/osmosis-labs/osmosis/x/epochs/types\242\002\003OEX\252\002\026Osmosis.Epochs.V1beta1\312\002\026Osmosis\\Epochs\\V1beta1\342\002\"Osmosis\\Epochs\\V1beta1\\GPBMetadata\352\002\030Osmosis::Epochs::V1beta1'
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._options = None
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['EpochInfos']._options = None
  _globals['_QUERY'].methods_by_name['EpochInfos']._serialized_options = b'\202\323\344\223\002 \022\036/osmosis/epochs/v1beta1/epochs'
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._options = None
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._serialized_options = b'\202\323\344\223\002\'\022%/osmosis/epochs/v1beta1/current_epoch'
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_start=180
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_end=204
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_start=206
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_end=296
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_start=298
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_end=356
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_start=358
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_end=422
  _globals['_QUERY']._serialized_start=425
  _globals['_QUERY']._serialized_end=749
# @@protoc_insertion_point(module_scope)
