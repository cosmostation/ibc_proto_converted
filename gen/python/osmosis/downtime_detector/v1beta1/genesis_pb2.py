# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/downtime-detector/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from osmosis.downtime_detector.v1beta1 import downtime_duration_pb2 as osmosis_dot_downtime__detector_dot_v1beta1_dot_downtime__duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/osmosis/downtime-detector/v1beta1/genesis.proto\x12 osmosis.downtimedetector.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x39osmosis/downtime-detector/v1beta1/downtime_duration.proto\"\xd6\x01\n\x14GenesisDowntimeEntry\x12[\n\x08\x64uration\x18\x01 \x01(\x0e\x32*.osmosis.downtimedetector.v1beta1.DowntimeB\x13\xf2\xde\x1f\x0fyaml:\"duration\"R\x08\x64uration\x12\x61\n\rlast_downtime\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"last_downtime\"\x90\xdf\x1f\x01R\x0clastDowntime\"\xd2\x01\n\x0cGenesisState\x12Z\n\tdowntimes\x18\x01 \x03(\x0b\x32\x36.osmosis.downtimedetector.v1beta1.GenesisDowntimeEntryB\x04\xc8\xde\x1f\x00R\tdowntimes\x12\x66\n\x0flast_block_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\"\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"last_block_time\"\x90\xdf\x1f\x01R\rlastBlockTimeB\x95\x02\n$com.osmosis.downtimedetector.v1beta1B\x0cGenesisProtoP\x01Z=github.com/osmosis-labs/osmosis/v15/x/downtime-detector/types\xa2\x02\x03ODX\xaa\x02 Osmosis.Downtimedetector.V1beta1\xca\x02 Osmosis\\Downtimedetector\\V1beta1\xe2\x02,Osmosis\\Downtimedetector\\V1beta1\\GPBMetadata\xea\x02\"Osmosis::Downtimedetector::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.downtime_detector.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.osmosis.downtimedetector.v1beta1B\014GenesisProtoP\001Z=github.com/osmosis-labs/osmosis/v15/x/downtime-detector/types\242\002\003ODX\252\002 Osmosis.Downtimedetector.V1beta1\312\002 Osmosis\\Downtimedetector\\V1beta1\342\002,Osmosis\\Downtimedetector\\V1beta1\\GPBMetadata\352\002\"Osmosis::Downtimedetector::V1beta1'
  _GENESISDOWNTIMEENTRY.fields_by_name['duration']._options = None
  _GENESISDOWNTIMEENTRY.fields_by_name['duration']._serialized_options = b'\362\336\037\017yaml:\"duration\"'
  _GENESISDOWNTIMEENTRY.fields_by_name['last_downtime']._options = None
  _GENESISDOWNTIMEENTRY.fields_by_name['last_downtime']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"last_downtime\"\220\337\037\001'
  _GENESISSTATE.fields_by_name['downtimes']._options = None
  _GENESISSTATE.fields_by_name['downtimes']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['last_block_time']._options = None
  _GENESISSTATE.fields_by_name['last_block_time']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"last_block_time\"\220\337\037\001'
  _globals['_GENESISDOWNTIMEENTRY']._serialized_start=286
  _globals['_GENESISDOWNTIMEENTRY']._serialized_end=500
  _globals['_GENESISSTATE']._serialized_start=503
  _globals['_GENESISSTATE']._serialized_end=713
# @@protoc_insertion_point(module_scope)