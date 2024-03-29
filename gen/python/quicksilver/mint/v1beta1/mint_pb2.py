# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/mint/v1beta1/mint.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#quicksilver/mint/v1beta1/mint.proto\x12\x18quicksilver.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19google/protobuf/any.proto\x1a\x1egoogle/protobuf/duration.proto\"~\n\x06Minter\x12t\n\x10\x65poch_provisions\x18\x01 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x17yaml:\"epoch_provisions\"R\x0f\x65pochProvisions\"\xde\x03\n\x17\x44istributionProportions\x12Z\n\x07staking\x18\x01 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x0eyaml:\"staking\"R\x07staking\x12q\n\x0fpool_incentives\x18\x02 \x01(\tBH\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x16yaml:\"pool_incentives\"R\x0epoolIncentives\x12\x83\x01\n\x15participation_rewards\x18\x03 \x01(\tBN\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1cyaml:\"participation_rewards\"R\x14participationRewards\x12n\n\x0e\x63ommunity_pool\x18\x04 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x15yaml:\"community_pool\"R\rcommunityPool\"\xdf\x05\n\x06Params\x12\x1d\n\nmint_denom\x18\x01 \x01(\tR\tmintDenom\x12\x8b\x01\n\x18genesis_epoch_provisions\x18\x02 \x01(\tBQ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1fyaml:\"genesis_epoch_provisions\"R\x16genesisEpochProvisions\x12\x46\n\x10\x65poch_identifier\x18\x03 \x01(\tB\x1b\xf2\xde\x1f\x17yaml:\"epoch_identifier\"R\x0f\x65pochIdentifier\x12\x62\n\x1areduction_period_in_epochs\x18\x04 \x01(\x03\x42%\xf2\xde\x1f!yaml:\"reduction_period_in_epochs\"R\x17reductionPeriodInEpochs\x12t\n\x10reduction_factor\x18\x05 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x17yaml:\"reduction_factor\"R\x0freductionFactor\x12r\n\x18\x64istribution_proportions\x18\x06 \x01(\x0b\x32\x31.quicksilver.mint.v1beta1.DistributionProportionsB\x04\xc8\xde\x1f\x00R\x17\x64istributionProportions\x12\x8b\x01\n(minting_rewards_distribution_start_epoch\x18\x07 \x01(\x03\x42\x33\xf2\xde\x1f/yaml:\"minting_rewards_distribution_start_epoch\"R$mintingRewardsDistributionStartEpoch:\x04\x98\xa0\x1f\x00\x42\xde\x01\n\x1c\x63om.quicksilver.mint.v1beta1B\tMintProtoZ3github.com/ingenuity-build/quicksilver/x/mint/types\xa2\x02\x03QMX\xaa\x02\x18Quicksilver.Mint.V1beta1\xca\x02\x18Quicksilver\\Mint\\V1beta1\xe2\x02$Quicksilver\\Mint\\V1beta1\\GPBMetadata\xea\x02\x1aQuicksilver::Mint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.mint.v1beta1.mint_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.quicksilver.mint.v1beta1B\tMintProtoZ3github.com/ingenuity-build/quicksilver/x/mint/types\242\002\003QMX\252\002\030Quicksilver.Mint.V1beta1\312\002\030Quicksilver\\Mint\\V1beta1\342\002$Quicksilver\\Mint\\V1beta1\\GPBMetadata\352\002\032Quicksilver::Mint::V1beta1'
  _globals['_MINTER'].fields_by_name['epoch_provisions']._options = None
  _globals['_MINTER'].fields_by_name['epoch_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\027yaml:\"epoch_provisions\"'
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['staking']._options = None
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['staking']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\016yaml:\"staking\"'
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['pool_incentives']._options = None
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['pool_incentives']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\026yaml:\"pool_incentives\"'
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['participation_rewards']._options = None
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['participation_rewards']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\034yaml:\"participation_rewards\"'
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['community_pool']._options = None
  _globals['_DISTRIBUTIONPROPORTIONS'].fields_by_name['community_pool']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\025yaml:\"community_pool\"'
  _globals['_PARAMS'].fields_by_name['genesis_epoch_provisions']._options = None
  _globals['_PARAMS'].fields_by_name['genesis_epoch_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\037yaml:\"genesis_epoch_provisions\"'
  _globals['_PARAMS'].fields_by_name['epoch_identifier']._options = None
  _globals['_PARAMS'].fields_by_name['epoch_identifier']._serialized_options = b'\362\336\037\027yaml:\"epoch_identifier\"'
  _globals['_PARAMS'].fields_by_name['reduction_period_in_epochs']._options = None
  _globals['_PARAMS'].fields_by_name['reduction_period_in_epochs']._serialized_options = b'\362\336\037!yaml:\"reduction_period_in_epochs\"'
  _globals['_PARAMS'].fields_by_name['reduction_factor']._options = None
  _globals['_PARAMS'].fields_by_name['reduction_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\027yaml:\"reduction_factor\"'
  _globals['_PARAMS'].fields_by_name['distribution_proportions']._options = None
  _globals['_PARAMS'].fields_by_name['distribution_proportions']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS'].fields_by_name['minting_rewards_distribution_start_epoch']._options = None
  _globals['_PARAMS'].fields_by_name['minting_rewards_distribution_start_epoch']._serialized_options = b'\362\336\037/yaml:\"minting_rewards_distribution_start_epoch\"'
  _globals['_PARAMS']._options = None
  _globals['_PARAMS']._serialized_options = b'\230\240\037\000'
  _globals['_MINTER']._serialized_start=179
  _globals['_MINTER']._serialized_end=305
  _globals['_DISTRIBUTIONPROPORTIONS']._serialized_start=308
  _globals['_DISTRIBUTIONPROPORTIONS']._serialized_end=786
  _globals['_PARAMS']._serialized_start=789
  _globals['_PARAMS']._serialized_end=1524
# @@protoc_insertion_point(module_scope)
