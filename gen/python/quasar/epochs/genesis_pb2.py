# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quasar/epochs/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bquasar/epochs/genesis.proto\x12\x1cquasarlabs.quasarnode.epochs\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x90\x04\n\tEpochInfo\x12\x1e\n\nidentifier\x18\x01 \x01(\tR\nidentifier\x12X\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"start_time\"\x90\xdf\x1f\x01R\tstartTime\x12h\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB1\xc8\xde\x1f\x00\xea\xde\x1f\x12\x64uration,omitempty\xf2\xde\x1f\x0fyaml:\"duration\"\x98\xdf\x1f\x01R\x08\x64uration\x12#\n\rcurrent_epoch\x18\x04 \x01(\x03R\x0c\x63urrentEpoch\x12\x80\x01\n\x18\x63urrent_epoch_start_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB+\xc8\xde\x1f\x00\xf2\xde\x1f\x1fyaml:\"current_epoch_start_time\"\x90\xdf\x1f\x01R\x15\x63urrentEpochStartTime\x12\x34\n\x16\x65poch_counting_started\x18\x06 \x01(\x08R\x14\x65pochCountingStarted\x12;\n\x1a\x63urrent_epoch_start_height\x18\x08 \x01(\x03R\x17\x63urrentEpochStartHeightJ\x04\x08\x07\x10\x08\"U\n\x0cGenesisState\x12\x45\n\x06\x65pochs\x18\x01 \x03(\x0b\x32\'.quasarlabs.quasarnode.epochs.EpochInfoB\x04\xc8\xde\x1f\x00R\x06\x65pochsB\xf1\x01\n com.quasarlabs.quasarnode.epochsB\x0cGenesisProtoZ/github.com/quasarlabs/quasarnode/x/epochs/types\xa2\x02\x03QQE\xaa\x02\x1cQuasarlabs.Quasarnode.Epochs\xca\x02\x1cQuasarlabs\\Quasarnode\\Epochs\xe2\x02(Quasarlabs\\Quasarnode\\Epochs\\GPBMetadata\xea\x02\x1eQuasarlabs::Quasarnode::Epochsb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quasar.epochs.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n com.quasarlabs.quasarnode.epochsB\014GenesisProtoZ/github.com/quasarlabs/quasarnode/x/epochs/types\242\002\003QQE\252\002\034Quasarlabs.Quasarnode.Epochs\312\002\034Quasarlabs\\Quasarnode\\Epochs\342\002(Quasarlabs\\Quasarnode\\Epochs\\GPBMetadata\352\002\036Quasarlabs::Quasarnode::Epochs'
  _globals['_EPOCHINFO'].fields_by_name['start_time']._options = None
  _globals['_EPOCHINFO'].fields_by_name['start_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"start_time\"\220\337\037\001'
  _globals['_EPOCHINFO'].fields_by_name['duration']._options = None
  _globals['_EPOCHINFO'].fields_by_name['duration']._serialized_options = b'\310\336\037\000\352\336\037\022duration,omitempty\362\336\037\017yaml:\"duration\"\230\337\037\001'
  _globals['_EPOCHINFO'].fields_by_name['current_epoch_start_time']._options = None
  _globals['_EPOCHINFO'].fields_by_name['current_epoch_start_time']._serialized_options = b'\310\336\037\000\362\336\037\037yaml:\"current_epoch_start_time\"\220\337\037\001'
  _globals['_GENESISSTATE'].fields_by_name['epochs']._options = None
  _globals['_GENESISSTATE'].fields_by_name['epochs']._serialized_options = b'\310\336\037\000'
  _globals['_EPOCHINFO']._serialized_start=149
  _globals['_EPOCHINFO']._serialized_end=677
  _globals['_GENESISSTATE']._serialized_start=679
  _globals['_GENESISSTATE']._serialized_end=764
# @@protoc_insertion_point(module_scope)
