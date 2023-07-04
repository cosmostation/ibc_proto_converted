# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/incentive/v1beta1/claims.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#kava/incentive/v1beta1/claims.proto\x12\x16kava.incentive.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xaf\x01\n\tBaseClaim\x12^\n\x05owner\x18\x01 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x05owner\x12\x37\n\x06reward\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06reward:\t\xca\xb4-\x05\x43laim\"\xe0\x01\n\x0e\x42\x61seMultiClaim\x12^\n\x05owner\x18\x01 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x05owner\x12\x63\n\x06reward\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06reward:\t\xca\xb4-\x05\x43laim\"\x8b\x01\n\x0bRewardIndex\x12\'\n\x0f\x63ollateral_type\x18\x01 \x01(\tR\x0e\x63ollateralType\x12S\n\rreward_factor\x18\x02 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0crewardFactor\"w\n\x12RewardIndexesProto\x12\x61\n\x0ereward_indexes\x18\x01 \x03(\x0b\x32#.kava.incentive.v1beta1.RewardIndexB\x15\xc8\xde\x1f\x00\xaa\xdf\x1f\rRewardIndexesR\rrewardIndexes\"\x9e\x01\n\x10MultiRewardIndex\x12\'\n\x0f\x63ollateral_type\x18\x01 \x01(\tR\x0e\x63ollateralType\x12\x61\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32#.kava.incentive.v1beta1.RewardIndexB\x15\xc8\xde\x1f\x00\xaa\xdf\x1f\rRewardIndexesR\rrewardIndexes\"\x91\x01\n\x17MultiRewardIndexesProto\x12v\n\x14multi_reward_indexes\x18\x01 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\x12multiRewardIndexes\"\xcc\x01\n\x10USDXMintingClaim\x12J\n\nbase_claim\x18\x01 \x01(\x0b\x32!.kava.incentive.v1beta1.BaseClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12\x61\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32#.kava.incentive.v1beta1.RewardIndexB\x15\xc8\xde\x1f\x00\xaa\xdf\x1f\rRewardIndexesR\rrewardIndexes:\t\xca\xb4-\x05\x43laim\"\xec\x02\n\x1aHardLiquidityProviderClaim\x12O\n\nbase_claim\x18\x01 \x01(\x0b\x32&.kava.incentive.v1beta1.BaseMultiClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12x\n\x15supply_reward_indexes\x18\x02 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\x13supplyRewardIndexes\x12x\n\x15\x62orrow_reward_indexes\x18\x03 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\x13\x62orrowRewardIndexes:\t\xca\xb4-\x05\x43laim\"\xd9\x01\n\x0e\x44\x65legatorClaim\x12O\n\nbase_claim\x18\x01 \x01(\x0b\x32&.kava.incentive.v1beta1.BaseMultiClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12k\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\rrewardIndexes:\t\xca\xb4-\x05\x43laim\"\xd4\x01\n\tSwapClaim\x12O\n\nbase_claim\x18\x01 \x01(\x0b\x32&.kava.incentive.v1beta1.BaseMultiClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12k\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\rrewardIndexes:\t\xca\xb4-\x05\x43laim\"\xd7\x01\n\x0cSavingsClaim\x12O\n\nbase_claim\x18\x01 \x01(\x0b\x32&.kava.incentive.v1beta1.BaseMultiClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12k\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\rrewardIndexes:\t\xca\xb4-\x05\x43laim\"\xd4\x01\n\tEarnClaim\x12O\n\nbase_claim\x18\x01 \x01(\x0b\x32&.kava.incentive.v1beta1.BaseMultiClaimB\x08\xc8\xde\x1f\x00\xd0\xde\x1f\x01R\tbaseClaim\x12k\n\x0ereward_indexes\x18\x02 \x03(\x0b\x32(.kava.incentive.v1beta1.MultiRewardIndexB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12MultiRewardIndexesR\rrewardIndexes:\t\xca\xb4-\x05\x43laimB\xd4\x01\n\x1a\x63om.kava.incentive.v1beta1B\x0b\x43laimsProtoP\x01Z+github.com/kava-labs/kava/x/incentive/types\xa2\x02\x03KIX\xaa\x02\x16Kava.Incentive.V1beta1\xca\x02\x16Kava\\Incentive\\V1beta1\xe2\x02\"Kava\\Incentive\\V1beta1\\GPBMetadata\xea\x02\x18Kava::Incentive::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.incentive.v1beta1.claims_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.kava.incentive.v1beta1B\013ClaimsProtoP\001Z+github.com/kava-labs/kava/x/incentive/types\242\002\003KIX\252\002\026Kava.Incentive.V1beta1\312\002\026Kava\\Incentive\\V1beta1\342\002\"Kava\\Incentive\\V1beta1\\GPBMetadata\352\002\030Kava::Incentive::V1beta1\310\341\036\000'
  _BASECLAIM.fields_by_name['owner']._options = None
  _BASECLAIM.fields_by_name['owner']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _BASECLAIM.fields_by_name['reward']._options = None
  _BASECLAIM.fields_by_name['reward']._serialized_options = b'\310\336\037\000'
  _BASECLAIM._options = None
  _BASECLAIM._serialized_options = b'\312\264-\005Claim'
  _BASEMULTICLAIM.fields_by_name['owner']._options = None
  _BASEMULTICLAIM.fields_by_name['owner']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _BASEMULTICLAIM.fields_by_name['reward']._options = None
  _BASEMULTICLAIM.fields_by_name['reward']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _BASEMULTICLAIM._options = None
  _BASEMULTICLAIM._serialized_options = b'\312\264-\005Claim'
  _REWARDINDEX.fields_by_name['reward_factor']._options = None
  _REWARDINDEX.fields_by_name['reward_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _REWARDINDEXESPROTO.fields_by_name['reward_indexes']._options = None
  _REWARDINDEXESPROTO.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\rRewardIndexes'
  _MULTIREWARDINDEX.fields_by_name['reward_indexes']._options = None
  _MULTIREWARDINDEX.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\rRewardIndexes'
  _MULTIREWARDINDEXESPROTO.fields_by_name['multi_reward_indexes']._options = None
  _MULTIREWARDINDEXESPROTO.fields_by_name['multi_reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _USDXMINTINGCLAIM.fields_by_name['base_claim']._options = None
  _USDXMINTINGCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _USDXMINTINGCLAIM.fields_by_name['reward_indexes']._options = None
  _USDXMINTINGCLAIM.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\rRewardIndexes'
  _USDXMINTINGCLAIM._options = None
  _USDXMINTINGCLAIM._serialized_options = b'\312\264-\005Claim'
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['base_claim']._options = None
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['supply_reward_indexes']._options = None
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['supply_reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['borrow_reward_indexes']._options = None
  _HARDLIQUIDITYPROVIDERCLAIM.fields_by_name['borrow_reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _HARDLIQUIDITYPROVIDERCLAIM._options = None
  _HARDLIQUIDITYPROVIDERCLAIM._serialized_options = b'\312\264-\005Claim'
  _DELEGATORCLAIM.fields_by_name['base_claim']._options = None
  _DELEGATORCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _DELEGATORCLAIM.fields_by_name['reward_indexes']._options = None
  _DELEGATORCLAIM.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _DELEGATORCLAIM._options = None
  _DELEGATORCLAIM._serialized_options = b'\312\264-\005Claim'
  _SWAPCLAIM.fields_by_name['base_claim']._options = None
  _SWAPCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _SWAPCLAIM.fields_by_name['reward_indexes']._options = None
  _SWAPCLAIM.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _SWAPCLAIM._options = None
  _SWAPCLAIM._serialized_options = b'\312\264-\005Claim'
  _SAVINGSCLAIM.fields_by_name['base_claim']._options = None
  _SAVINGSCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _SAVINGSCLAIM.fields_by_name['reward_indexes']._options = None
  _SAVINGSCLAIM.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _SAVINGSCLAIM._options = None
  _SAVINGSCLAIM._serialized_options = b'\312\264-\005Claim'
  _EARNCLAIM.fields_by_name['base_claim']._options = None
  _EARNCLAIM.fields_by_name['base_claim']._serialized_options = b'\310\336\037\000\320\336\037\001'
  _EARNCLAIM.fields_by_name['reward_indexes']._options = None
  _EARNCLAIM.fields_by_name['reward_indexes']._serialized_options = b'\310\336\037\000\252\337\037\022MultiRewardIndexes'
  _EARNCLAIM._options = None
  _EARNCLAIM._serialized_options = b'\312\264-\005Claim'
  _globals['_BASECLAIM']._serialized_start=145
  _globals['_BASECLAIM']._serialized_end=320
  _globals['_BASEMULTICLAIM']._serialized_start=323
  _globals['_BASEMULTICLAIM']._serialized_end=547
  _globals['_REWARDINDEX']._serialized_start=550
  _globals['_REWARDINDEX']._serialized_end=689
  _globals['_REWARDINDEXESPROTO']._serialized_start=691
  _globals['_REWARDINDEXESPROTO']._serialized_end=810
  _globals['_MULTIREWARDINDEX']._serialized_start=813
  _globals['_MULTIREWARDINDEX']._serialized_end=971
  _globals['_MULTIREWARDINDEXESPROTO']._serialized_start=974
  _globals['_MULTIREWARDINDEXESPROTO']._serialized_end=1119
  _globals['_USDXMINTINGCLAIM']._serialized_start=1122
  _globals['_USDXMINTINGCLAIM']._serialized_end=1326
  _globals['_HARDLIQUIDITYPROVIDERCLAIM']._serialized_start=1329
  _globals['_HARDLIQUIDITYPROVIDERCLAIM']._serialized_end=1693
  _globals['_DELEGATORCLAIM']._serialized_start=1696
  _globals['_DELEGATORCLAIM']._serialized_end=1913
  _globals['_SWAPCLAIM']._serialized_start=1916
  _globals['_SWAPCLAIM']._serialized_end=2128
  _globals['_SAVINGSCLAIM']._serialized_start=2131
  _globals['_SAVINGSCLAIM']._serialized_end=2346
  _globals['_EARNCLAIM']._serialized_start=2349
  _globals['_EARNCLAIM']._serialized_end=2561
# @@protoc_insertion_point(module_scope)