# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/reward/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from provenance.reward.v1 import reward_pb2 as provenance_dot_reward_dot_v1_dot_reward__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"provenance/reward/v1/genesis.proto\x12\x14provenance.reward.v1\x1a\x14gogoproto/gogo.proto\x1a!provenance/reward/v1/reward.proto\"\x83\x03\n\x0cGenesisState\x12*\n\x11reward_program_id\x18\x01 \x01(\x04R\x0frewardProgramId\x12R\n\x0freward_programs\x18\x02 \x03(\x0b\x32#.provenance.reward.v1.RewardProgramB\x04\xc8\xde\x1f\x00R\x0erewardPrograms\x12\x84\x01\n!claim_period_reward_distributions\x18\x03 \x03(\x0b\x32\x33.provenance.reward.v1.ClaimPeriodRewardDistributionB\x04\xc8\xde\x1f\x00R\x1e\x63laimPeriodRewardDistributions\x12\x62\n\x15reward_account_states\x18\x04 \x03(\x0b\x32(.provenance.reward.v1.RewardAccountStateB\x04\xc8\xde\x1f\x00R\x13rewardAccountStates:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xce\x01\n\x18\x63om.provenance.reward.v1B\x0cGenesisProtoP\x00Z2github.com/provenance-io/provenance/x/reward/types\xa2\x02\x03PRX\xaa\x02\x14Provenance.Reward.V1\xca\x02\x14Provenance\\Reward\\V1\xe2\x02 Provenance\\Reward\\V1\\GPBMetadata\xea\x02\x16Provenance::Reward::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.reward.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.provenance.reward.v1B\014GenesisProtoP\000Z2github.com/provenance-io/provenance/x/reward/types\242\002\003PRX\252\002\024Provenance.Reward.V1\312\002\024Provenance\\Reward\\V1\342\002 Provenance\\Reward\\V1\\GPBMetadata\352\002\026Provenance::Reward::V1'
  _globals['_GENESISSTATE'].fields_by_name['reward_programs']._options = None
  _globals['_GENESISSTATE'].fields_by_name['reward_programs']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['claim_period_reward_distributions']._options = None
  _globals['_GENESISSTATE'].fields_by_name['claim_period_reward_distributions']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['reward_account_states']._options = None
  _globals['_GENESISSTATE'].fields_by_name['reward_account_states']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._options = None
  _globals['_GENESISSTATE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=118
  _globals['_GENESISSTATE']._serialized_end=505
# @@protoc_insertion_point(module_scope)
