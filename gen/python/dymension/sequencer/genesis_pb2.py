# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dymension/sequencer/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from dymension.sequencer import params_pb2 as dymension_dot_sequencer_dot_params__pb2
from dymension.sequencer import sequencer_pb2 as dymension_dot_sequencer_dot_sequencer__pb2
from dymension.sequencer import sequencers_by_rollapp_pb2 as dymension_dot_sequencer_dot_sequencers__by__rollapp__pb2
from dymension.sequencer import scheduler_pb2 as dymension_dot_sequencer_dot_scheduler__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!dymension/sequencer/genesis.proto\x12 dymensionxyz.dymension.sequencer\x1a\x14gogoproto/gogo.proto\x1a dymension/sequencer/params.proto\x1a#dymension/sequencer/sequencer.proto\x1a/dymension/sequencer/sequencers_by_rollapp.proto\x1a#dymension/sequencer/scheduler.proto\"\xff\x02\n\x0cGenesisState\x12\x46\n\x06params\x18\x01 \x01(\x0b\x32(.dymensionxyz.dymension.sequencer.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12W\n\rsequencerList\x18\x02 \x03(\x0b\x32+.dymensionxyz.dymension.sequencer.SequencerB\x04\xc8\xde\x1f\x00R\rsequencerList\x12u\n\x17sequencersByRollappList\x18\x03 \x03(\x0b\x32\x35.dymensionxyz.dymension.sequencer.SequencersByRollappB\x04\xc8\xde\x1f\x00R\x17sequencersByRollappList\x12W\n\rschedulerList\x18\x04 \x03(\x0b\x32+.dymensionxyz.dymension.sequencer.SchedulerB\x04\xc8\xde\x1f\x00R\rschedulerListB\x8c\x02\n$com.dymensionxyz.dymension.sequencerB\x0cGenesisProtoZ6github.com/dymensionxyz/dymension/v3/x/sequencer/types\xa2\x02\x03\x44\x44S\xaa\x02 Dymensionxyz.Dymension.Sequencer\xca\x02 Dymensionxyz\\Dymension\\Sequencer\xe2\x02,Dymensionxyz\\Dymension\\Sequencer\\GPBMetadata\xea\x02\"Dymensionxyz::Dymension::Sequencerb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'dymension.sequencer.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n$com.dymensionxyz.dymension.sequencerB\014GenesisProtoZ6github.com/dymensionxyz/dymension/v3/x/sequencer/types\242\002\003DDS\252\002 Dymensionxyz.Dymension.Sequencer\312\002 Dymensionxyz\\Dymension\\Sequencer\342\002,Dymensionxyz\\Dymension\\Sequencer\\GPBMetadata\352\002\"Dymensionxyz::Dymension::Sequencer'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['sequencerList']._options = None
  _globals['_GENESISSTATE'].fields_by_name['sequencerList']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['sequencersByRollappList']._options = None
  _globals['_GENESISSTATE'].fields_by_name['sequencersByRollappList']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['schedulerList']._options = None
  _globals['_GENESISSTATE'].fields_by_name['schedulerList']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=251
  _globals['_GENESISSTATE']._serialized_end=634
# @@protoc_insertion_point(module_scope)