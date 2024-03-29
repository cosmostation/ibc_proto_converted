# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/epochs/query.proto
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
from stride.epochs import genesis_pb2 as stride_dot_epochs_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19stride/epochs/query.proto\x12\rstride.epochs\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1bstride/epochs/genesis.proto\"`\n\x16QueryEpochsInfoRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9a\x01\n\x17QueryEpochsInfoResponse\x12\x36\n\x06\x65pochs\x18\x01 \x03(\x0b\x32\x18.stride.epochs.EpochInfoB\x04\xc8\xde\x1f\x00R\x06\x65pochs\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\":\n\x18QueryCurrentEpochRequest\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\"@\n\x19QueryCurrentEpochResponse\x12#\n\rcurrent_epoch\x18\x01 \x01(\x03R\x0c\x63urrentEpoch\"7\n\x15QueryEpochInfoRequest\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\"N\n\x16QueryEpochInfoResponse\x12\x34\n\x05\x65poch\x18\x01 \x01(\x0b\x32\x18.stride.epochs.EpochInfoB\x04\xc8\xde\x1f\x00R\x05\x65poch2\xa5\x03\n\x05Query\x12~\n\nEpochInfos\x12%.stride.epochs.QueryEpochsInfoRequest\x1a&.stride.epochs.QueryEpochsInfoResponse\"!\x82\xd3\xe4\x93\x02\x1b\x12\x19/Stridelabs/stride/epochs\x12\x92\x01\n\x0c\x43urrentEpoch\x12\'.stride.epochs.QueryCurrentEpochRequest\x1a(.stride.epochs.QueryCurrentEpochResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/Stridelabs/stride/epochs/current_epoch\x12\x86\x01\n\tEpochInfo\x12$.stride.epochs.QueryEpochInfoRequest\x1a%.stride.epochs.QueryEpochInfoResponse\",\x82\xd3\xe4\x93\x02&\x12$/Stridelabs/stride/epochs/epoch_infoB\xa3\x01\n\x11\x63om.stride.epochsB\nQueryProtoZ/github.com/Stride-Labs/stride/v9/x/epochs/types\xa2\x02\x03SEX\xaa\x02\rStride.Epochs\xca\x02\rStride\\Epochs\xe2\x02\x19Stride\\Epochs\\GPBMetadata\xea\x02\x0eStride::Epochsb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.epochs.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\021com.stride.epochsB\nQueryProtoZ/github.com/Stride-Labs/stride/v9/x/epochs/types\242\002\003SEX\252\002\rStride.Epochs\312\002\rStride\\Epochs\342\002\031Stride\\Epochs\\GPBMetadata\352\002\016Stride::Epochs'
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._options = None
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYEPOCHINFORESPONSE'].fields_by_name['epoch']._options = None
  _globals['_QUERYEPOCHINFORESPONSE'].fields_by_name['epoch']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['EpochInfos']._options = None
  _globals['_QUERY'].methods_by_name['EpochInfos']._serialized_options = b'\202\323\344\223\002\033\022\031/Stridelabs/stride/epochs'
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._options = None
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._serialized_options = b'\202\323\344\223\002)\022\'/Stridelabs/stride/epochs/current_epoch'
  _globals['_QUERY'].methods_by_name['EpochInfo']._options = None
  _globals['_QUERY'].methods_by_name['EpochInfo']._serialized_options = b'\202\323\344\223\002&\022$/Stridelabs/stride/epochs/epoch_info'
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_start=169
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_end=265
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_start=268
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_end=422
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_start=424
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_end=482
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_start=484
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_end=548
  _globals['_QUERYEPOCHINFOREQUEST']._serialized_start=550
  _globals['_QUERYEPOCHINFOREQUEST']._serialized_end=605
  _globals['_QUERYEPOCHINFORESPONSE']._serialized_start=607
  _globals['_QUERYEPOCHINFORESPONSE']._serialized_end=685
  _globals['_QUERY']._serialized_start=688
  _globals['_QUERY']._serialized_end=1109
# @@protoc_insertion_point(module_scope)
