# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/lpfarm/v1beta1/lpfarm.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$crescent/lpfarm/v1beta1/lpfarm.proto\x12\x17\x63rescent.lpfarm.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/duration.proto\"\xbc\x02\n\x06Params\x12\x86\x01\n\x19private_plan_creation_fee\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x16privatePlanCreationFee\x12#\n\rfee_collector\x18\x02 \x01(\tR\x0c\x66\x65\x65\x43ollector\x12\x31\n\x15max_num_private_plans\x18\x03 \x01(\rR\x12maxNumPrivatePlans\x12Q\n\x12max_block_duration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x10maxBlockDuration\"\xc5\x03\n\x04Plan\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x30\n\x14\x66\x61rming_pool_address\x18\x03 \x01(\tR\x12\x66\x61rmingPoolAddress\x12/\n\x13termination_address\x18\x04 \x01(\tR\x12terminationAddress\x12^\n\x12reward_allocations\x18\x05 \x03(\x0b\x32).crescent.lpfarm.v1beta1.RewardAllocationB\x04\xc8\xde\x1f\x00R\x11rewardAllocations\x12\x43\n\nstart_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tstartTime\x12?\n\x08\x65nd_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x07\x65ndTime\x12\x1d\n\nis_private\x18\x08 \x01(\x08R\tisPrivate\x12#\n\ris_terminated\x18\t \x01(\x08R\x0cisTerminated\"\xb6\x01\n\x10RewardAllocation\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12s\n\x0frewards_per_day\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rrewardsPerDay\"\xd4\x03\n\x04\x46\x61rm\x12`\n\x14total_farming_amount\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x12totalFarmingAmount\x12z\n\x0f\x63urrent_rewards\x18\x02 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x0e\x63urrentRewards\x12\x82\x01\n\x13outstanding_rewards\x18\x03 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x12outstandingRewards\x12\x16\n\x06period\x18\x04 \x01(\x04R\x06period\x12Q\n\x0eprevious_share\x18\x05 \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\rpreviousShare\"\xec\x01\n\x08Position\x12\x16\n\x06\x66\x61rmer\x18\x01 \x01(\tR\x06\x66\x61rmer\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12U\n\x0e\x66\x61rming_amount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rfarmingAmount\x12\'\n\x0fprevious_period\x18\x04 \x01(\x04R\x0epreviousPeriod\x12\x32\n\x15starting_block_height\x18\x05 \x01(\x03R\x13startingBlockHeight\"\xc8\x01\n\x11HistoricalRewards\x12\x89\x01\n\x17\x63umulative_unit_rewards\x18\x01 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x15\x63umulativeUnitRewards\x12\'\n\x0freference_count\x18\x02 \x01(\rR\x0ereferenceCountB\xe4\x01\n\x1b\x63om.crescent.lpfarm.v1beta1B\x0bLpfarmProtoP\x01Z6github.com/crescent-network/crescent/v5/x/lpfarm/types\xa2\x02\x03\x43LX\xaa\x02\x17\x43rescent.Lpfarm.V1beta1\xca\x02\x17\x43rescent\\Lpfarm\\V1beta1\xe2\x02#Crescent\\Lpfarm\\V1beta1\\GPBMetadata\xea\x02\x19\x43rescent::Lpfarm::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.lpfarm.v1beta1.lpfarm_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.crescent.lpfarm.v1beta1B\013LpfarmProtoP\001Z6github.com/crescent-network/crescent/v5/x/lpfarm/types\242\002\003CLX\252\002\027Crescent.Lpfarm.V1beta1\312\002\027Crescent\\Lpfarm\\V1beta1\342\002#Crescent\\Lpfarm\\V1beta1\\GPBMetadata\352\002\031Crescent::Lpfarm::V1beta1\310\341\036\000'
  _PARAMS.fields_by_name['private_plan_creation_fee']._options = None
  _PARAMS.fields_by_name['private_plan_creation_fee']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _PARAMS.fields_by_name['max_block_duration']._options = None
  _PARAMS.fields_by_name['max_block_duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PLAN.fields_by_name['reward_allocations']._options = None
  _PLAN.fields_by_name['reward_allocations']._serialized_options = b'\310\336\037\000'
  _PLAN.fields_by_name['start_time']._options = None
  _PLAN.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _PLAN.fields_by_name['end_time']._options = None
  _PLAN.fields_by_name['end_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _REWARDALLOCATION.fields_by_name['rewards_per_day']._options = None
  _REWARDALLOCATION.fields_by_name['rewards_per_day']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _FARM.fields_by_name['total_farming_amount']._options = None
  _FARM.fields_by_name['total_farming_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _FARM.fields_by_name['current_rewards']._options = None
  _FARM.fields_by_name['current_rewards']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _FARM.fields_by_name['outstanding_rewards']._options = None
  _FARM.fields_by_name['outstanding_rewards']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _FARM.fields_by_name['previous_share']._options = None
  _FARM.fields_by_name['previous_share']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _POSITION.fields_by_name['farming_amount']._options = None
  _POSITION.fields_by_name['farming_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _HISTORICALREWARDS.fields_by_name['cumulative_unit_rewards']._options = None
  _HISTORICALREWARDS.fields_by_name['cumulative_unit_rewards']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _globals['_PARAMS']._serialized_start=185
  _globals['_PARAMS']._serialized_end=501
  _globals['_PLAN']._serialized_start=504
  _globals['_PLAN']._serialized_end=957
  _globals['_REWARDALLOCATION']._serialized_start=960
  _globals['_REWARDALLOCATION']._serialized_end=1142
  _globals['_FARM']._serialized_start=1145
  _globals['_FARM']._serialized_end=1613
  _globals['_POSITION']._serialized_start=1616
  _globals['_POSITION']._serialized_end=1852
  _globals['_HISTORICALREWARDS']._serialized_start=1855
  _globals['_HISTORICALREWARDS']._serialized_end=2055
# @@protoc_insertion_point(module_scope)