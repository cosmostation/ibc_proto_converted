# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: persistence/epochs/v1beta1/query.proto
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
from persistence.epochs.v1beta1 import genesis_pb2 as persistence_dot_epochs_dot_v1beta1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&persistence/epochs/v1beta1/query.proto\x12\x1apersistence.epochs.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a(persistence/epochs/v1beta1/genesis.proto\"\x18\n\x16QueryEpochsInfoRequest\"^\n\x17QueryEpochsInfoResponse\x12\x43\n\x06\x65pochs\x18\x01 \x03(\x0b\x32%.persistence.epochs.v1beta1.EpochInfoB\x04\xc8\xde\x1f\x00R\x06\x65pochs\":\n\x18QueryCurrentEpochRequest\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\"@\n\x19QueryCurrentEpochResponse\x12#\n\rcurrent_epoch\x18\x01 \x01(\x03R\x0c\x63urrentEpoch2\xe4\x02\n\x05Query\x12\xa5\x01\n\nEpochInfos\x12\x32.persistence.epochs.v1beta1.QueryEpochsInfoRequest\x1a\x33.persistence.epochs.v1beta1.QueryEpochsInfoResponse\".\x82\xd3\xe4\x93\x02(\x12&/persistence-sdk/epochs/v1beta1/epochs\x12\xb2\x01\n\x0c\x43urrentEpoch\x12\x34.persistence.epochs.v1beta1.QueryCurrentEpochRequest\x1a\x35.persistence.epochs.v1beta1.QueryCurrentEpochResponse\"5\x82\xd3\xe4\x93\x02/\x12-/persistence-sdk/epochs/v1beta1/current_epochB\xf1\x01\n\x1e\x63om.persistence.epochs.v1beta1B\nQueryProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/epochs/types\xa2\x02\x03PEX\xaa\x02\x1aPersistence.Epochs.V1beta1\xca\x02\x1aPersistence\\Epochs\\V1beta1\xe2\x02&Persistence\\Epochs\\V1beta1\\GPBMetadata\xea\x02\x1cPersistence::Epochs::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'persistence.epochs.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036com.persistence.epochs.v1beta1B\nQueryProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/epochs/types\242\002\003PEX\252\002\032Persistence.Epochs.V1beta1\312\002\032Persistence\\Epochs\\V1beta1\342\002&Persistence\\Epochs\\V1beta1\\GPBMetadata\352\002\034Persistence::Epochs::V1beta1'
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._options = None
  _globals['_QUERYEPOCHSINFORESPONSE'].fields_by_name['epochs']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['EpochInfos']._options = None
  _globals['_QUERY'].methods_by_name['EpochInfos']._serialized_options = b'\202\323\344\223\002(\022&/persistence-sdk/epochs/v1beta1/epochs'
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._options = None
  _globals['_QUERY'].methods_by_name['CurrentEpoch']._serialized_options = b'\202\323\344\223\002/\022-/persistence-sdk/epochs/v1beta1/current_epoch'
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_start=164
  _globals['_QUERYEPOCHSINFOREQUEST']._serialized_end=188
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_start=190
  _globals['_QUERYEPOCHSINFORESPONSE']._serialized_end=284
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_start=286
  _globals['_QUERYCURRENTEPOCHREQUEST']._serialized_end=344
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_start=346
  _globals['_QUERYCURRENTEPOCHRESPONSE']._serialized_end=410
  _globals['_QUERY']._serialized_start=413
  _globals['_QUERY']._serialized_end=769
# @@protoc_insertion_point(module_scope)
