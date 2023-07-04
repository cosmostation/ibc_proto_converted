# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/concentrated-liquidity/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'osmosis/concentrated-liquidity/tx.proto\x12%osmosis.concentratedliquidity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xbd\x04\n\x11MsgCreatePosition\x12+\n\x07pool_id\x18\x01 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolId\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12\x34\n\nlower_tick\x18\x03 \x01(\x03\x42\x15\xf2\xde\x1f\x11yaml:\"lower_tick\"R\tlowerTick\x12\x34\n\nupper_tick\x18\x04 \x01(\x03\x42\x15\xf2\xde\x1f\x11yaml:\"upper_tick\"R\tupperTick\x12t\n\x0ftokens_provided\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0etokensProvided\x12v\n\x11token_min_amount0\x18\x06 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x18yaml:\"token_min_amount0\"R\x0ftokenMinAmount0\x12v\n\x11token_min_amount1\x18\x07 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x18yaml:\"token_min_amount1\"R\x0ftokenMinAmount1\"\xc8\x04\n\x19MsgCreatePositionResponse\x12\x37\n\x0bposition_id\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"position_id\"R\npositionId\x12Z\n\x07\x61mount0\x18\x02 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount0\"R\x07\x61mount0\x12Z\n\x07\x61mount1\x18\x03 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount1\"R\x07\x61mount1\x12U\n\tjoin_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"join_time\"\x90\xdf\x1f\x01R\x08joinTime\x12w\n\x11liquidity_created\x18\x05 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x18yaml:\"liquidity_created\"R\x10liquidityCreated\x12\x34\n\nlower_tick\x18\x06 \x01(\x03\x42\x15\xf2\xde\x1f\x11yaml:\"lower_tick\"R\tlowerTick\x12\x34\n\nupper_tick\x18\x07 \x01(\x03\x42\x15\xf2\xde\x1f\x11yaml:\"upper_tick\"R\tupperTick\"\x9f\x04\n\x10MsgAddToPosition\x12\x37\n\x0bposition_id\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"position_id\"R\npositionId\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12[\n\x07\x61mount0\x18\x03 \x01(\tBA\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0fyaml:\"amount_0\"R\x07\x61mount0\x12Z\n\x07\x61mount1\x18\x04 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount1\"R\x07\x61mount1\x12v\n\x11token_min_amount0\x18\x05 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x18yaml:\"token_min_amount0\"R\x0ftokenMinAmount0\x12v\n\x11token_min_amount1\x18\x06 \x01(\tBJ\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x18yaml:\"token_min_amount1\"R\x0ftokenMinAmount1\"\x8b\x02\n\x18MsgAddToPositionResponse\x12\x37\n\x0bposition_id\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"position_id\"R\npositionId\x12Z\n\x07\x61mount0\x18\x02 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount0\"R\x07\x61mount0\x12Z\n\x07\x61mount1\x18\x03 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount1\"R\x07\x61mount1\"\xef\x01\n\x13MsgWithdrawPosition\x12\x37\n\x0bposition_id\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"position_id\"R\npositionId\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12t\n\x10liquidity_amount\x18\x03 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x17yaml:\"liquidity_amount\"R\x0fliquidityAmount\"\xd5\x01\n\x1bMsgWithdrawPositionResponse\x12Z\n\x07\x61mount0\x18\x01 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount0\"R\x07\x61mount0\x12Z\n\x07\x61mount1\x18\x02 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"amount1\"R\x07\x61mount1\"\x80\x01\n\x17MsgCollectSpreadRewards\x12:\n\x0cposition_ids\x18\x01 \x03(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"position_ids\"R\x0bpositionIds\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\"\x9f\x01\n\x1fMsgCollectSpreadRewardsResponse\x12|\n\x18\x63ollected_spread_rewards\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\'\xc8\xde\x1f\x00\xf2\xde\x1f\x1fyaml:\"collected_spread_rewards\"R\x16\x63ollectedSpreadRewards\"}\n\x14MsgCollectIncentives\x12:\n\x0cposition_ids\x18\x01 \x03(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"position_ids\"R\x0bpositionIds\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\"\x84\x02\n\x1cMsgCollectIncentivesResponse\x12q\n\x14\x63ollected_incentives\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB#\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"collected_incentives\"R\x13\x63ollectedIncentives\x12q\n\x14\x66orfeited_incentives\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB#\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"forfeited_incentives\"R\x13\x66orfeitedIncentives\"\x83\x01\n\x1aMsgFungifyChargedPositions\x12:\n\x0cposition_ids\x18\x01 \x03(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"position_ids\"R\x0bpositionIds\x12)\n\x06sender\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\"h\n\"MsgFungifyChargedPositionsResponse\x12\x42\n\x0fnew_position_id\x18\x01 \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"new_position_id\"R\rnewPositionId2\x98\x07\n\x03Msg\x12\x8c\x01\n\x0e\x43reatePosition\x12\x38.osmosis.concentratedliquidity.v1beta1.MsgCreatePosition\x1a@.osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse\x12\x92\x01\n\x10WithdrawPosition\x12:.osmosis.concentratedliquidity.v1beta1.MsgWithdrawPosition\x1a\x42.osmosis.concentratedliquidity.v1beta1.MsgWithdrawPositionResponse\x12\x89\x01\n\rAddToPosition\x12\x37.osmosis.concentratedliquidity.v1beta1.MsgAddToPosition\x1a?.osmosis.concentratedliquidity.v1beta1.MsgAddToPositionResponse\x12\x9e\x01\n\x14\x43ollectSpreadRewards\x12>.osmosis.concentratedliquidity.v1beta1.MsgCollectSpreadRewards\x1a\x46.osmosis.concentratedliquidity.v1beta1.MsgCollectSpreadRewardsResponse\x12\x95\x01\n\x11\x43ollectIncentives\x12;.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives\x1a\x43.osmosis.concentratedliquidity.v1beta1.MsgCollectIncentivesResponse\x12\xa7\x01\n\x17\x46ungifyChargedPositions\x12\x41.osmosis.concentratedliquidity.v1beta1.MsgFungifyChargedPositions\x1aI.osmosis.concentratedliquidity.v1beta1.MsgFungifyChargedPositionsResponseB\xae\x02\n)com.osmosis.concentratedliquidity.v1beta1B\x07TxProtoP\x01ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/types\xa2\x02\x03OCX\xaa\x02%Osmosis.Concentratedliquidity.V1beta1\xca\x02%Osmosis\\Concentratedliquidity\\V1beta1\xe2\x02\x31Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\xea\x02\'Osmosis::Concentratedliquidity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.concentrated_liquidity.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.osmosis.concentratedliquidity.v1beta1B\007TxProtoP\001ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/types\242\002\003OCX\252\002%Osmosis.Concentratedliquidity.V1beta1\312\002%Osmosis\\Concentratedliquidity\\V1beta1\342\0021Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\352\002\'Osmosis::Concentratedliquidity::V1beta1'
  _MSGCREATEPOSITION.fields_by_name['pool_id']._options = None
  _MSGCREATEPOSITION.fields_by_name['pool_id']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _MSGCREATEPOSITION.fields_by_name['sender']._options = None
  _MSGCREATEPOSITION.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCREATEPOSITION.fields_by_name['lower_tick']._options = None
  _MSGCREATEPOSITION.fields_by_name['lower_tick']._serialized_options = b'\362\336\037\021yaml:\"lower_tick\"'
  _MSGCREATEPOSITION.fields_by_name['upper_tick']._options = None
  _MSGCREATEPOSITION.fields_by_name['upper_tick']._serialized_options = b'\362\336\037\021yaml:\"upper_tick\"'
  _MSGCREATEPOSITION.fields_by_name['tokens_provided']._options = None
  _MSGCREATEPOSITION.fields_by_name['tokens_provided']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGCREATEPOSITION.fields_by_name['token_min_amount0']._options = None
  _MSGCREATEPOSITION.fields_by_name['token_min_amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\030yaml:\"token_min_amount0\"'
  _MSGCREATEPOSITION.fields_by_name['token_min_amount1']._options = None
  _MSGCREATEPOSITION.fields_by_name['token_min_amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\030yaml:\"token_min_amount1\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['position_id']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['position_id']._serialized_options = b'\362\336\037\022yaml:\"position_id\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['amount0']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount0\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['amount1']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount1\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['join_time']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['join_time']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"join_time\"\220\337\037\001'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['liquidity_created']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['liquidity_created']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\030yaml:\"liquidity_created\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['lower_tick']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['lower_tick']._serialized_options = b'\362\336\037\021yaml:\"lower_tick\"'
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['upper_tick']._options = None
  _MSGCREATEPOSITIONRESPONSE.fields_by_name['upper_tick']._serialized_options = b'\362\336\037\021yaml:\"upper_tick\"'
  _MSGADDTOPOSITION.fields_by_name['position_id']._options = None
  _MSGADDTOPOSITION.fields_by_name['position_id']._serialized_options = b'\362\336\037\022yaml:\"position_id\"'
  _MSGADDTOPOSITION.fields_by_name['sender']._options = None
  _MSGADDTOPOSITION.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGADDTOPOSITION.fields_by_name['amount0']._options = None
  _MSGADDTOPOSITION.fields_by_name['amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\017yaml:\"amount_0\"'
  _MSGADDTOPOSITION.fields_by_name['amount1']._options = None
  _MSGADDTOPOSITION.fields_by_name['amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount1\"'
  _MSGADDTOPOSITION.fields_by_name['token_min_amount0']._options = None
  _MSGADDTOPOSITION.fields_by_name['token_min_amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\030yaml:\"token_min_amount0\"'
  _MSGADDTOPOSITION.fields_by_name['token_min_amount1']._options = None
  _MSGADDTOPOSITION.fields_by_name['token_min_amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\030yaml:\"token_min_amount1\"'
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['position_id']._options = None
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['position_id']._serialized_options = b'\362\336\037\022yaml:\"position_id\"'
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['amount0']._options = None
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount0\"'
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['amount1']._options = None
  _MSGADDTOPOSITIONRESPONSE.fields_by_name['amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount1\"'
  _MSGWITHDRAWPOSITION.fields_by_name['position_id']._options = None
  _MSGWITHDRAWPOSITION.fields_by_name['position_id']._serialized_options = b'\362\336\037\022yaml:\"position_id\"'
  _MSGWITHDRAWPOSITION.fields_by_name['sender']._options = None
  _MSGWITHDRAWPOSITION.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGWITHDRAWPOSITION.fields_by_name['liquidity_amount']._options = None
  _MSGWITHDRAWPOSITION.fields_by_name['liquidity_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\027yaml:\"liquidity_amount\"'
  _MSGWITHDRAWPOSITIONRESPONSE.fields_by_name['amount0']._options = None
  _MSGWITHDRAWPOSITIONRESPONSE.fields_by_name['amount0']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount0\"'
  _MSGWITHDRAWPOSITIONRESPONSE.fields_by_name['amount1']._options = None
  _MSGWITHDRAWPOSITIONRESPONSE.fields_by_name['amount1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"amount1\"'
  _MSGCOLLECTSPREADREWARDS.fields_by_name['position_ids']._options = None
  _MSGCOLLECTSPREADREWARDS.fields_by_name['position_ids']._serialized_options = b'\362\336\037\023yaml:\"position_ids\"'
  _MSGCOLLECTSPREADREWARDS.fields_by_name['sender']._options = None
  _MSGCOLLECTSPREADREWARDS.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCOLLECTSPREADREWARDSRESPONSE.fields_by_name['collected_spread_rewards']._options = None
  _MSGCOLLECTSPREADREWARDSRESPONSE.fields_by_name['collected_spread_rewards']._serialized_options = b'\310\336\037\000\362\336\037\037yaml:\"collected_spread_rewards\"'
  _MSGCOLLECTINCENTIVES.fields_by_name['position_ids']._options = None
  _MSGCOLLECTINCENTIVES.fields_by_name['position_ids']._serialized_options = b'\362\336\037\023yaml:\"position_ids\"'
  _MSGCOLLECTINCENTIVES.fields_by_name['sender']._options = None
  _MSGCOLLECTINCENTIVES.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCOLLECTINCENTIVESRESPONSE.fields_by_name['collected_incentives']._options = None
  _MSGCOLLECTINCENTIVESRESPONSE.fields_by_name['collected_incentives']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"collected_incentives\"'
  _MSGCOLLECTINCENTIVESRESPONSE.fields_by_name['forfeited_incentives']._options = None
  _MSGCOLLECTINCENTIVESRESPONSE.fields_by_name['forfeited_incentives']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"forfeited_incentives\"'
  _MSGFUNGIFYCHARGEDPOSITIONS.fields_by_name['position_ids']._options = None
  _MSGFUNGIFYCHARGEDPOSITIONS.fields_by_name['position_ids']._serialized_options = b'\362\336\037\023yaml:\"position_ids\"'
  _MSGFUNGIFYCHARGEDPOSITIONS.fields_by_name['sender']._options = None
  _MSGFUNGIFYCHARGEDPOSITIONS.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGFUNGIFYCHARGEDPOSITIONSRESPONSE.fields_by_name['new_position_id']._options = None
  _MSGFUNGIFYCHARGEDPOSITIONSRESPONSE.fields_by_name['new_position_id']._serialized_options = b'\362\336\037\026yaml:\"new_position_id\"'
  _globals['_MSGCREATEPOSITION']._serialized_start=202
  _globals['_MSGCREATEPOSITION']._serialized_end=775
  _globals['_MSGCREATEPOSITIONRESPONSE']._serialized_start=778
  _globals['_MSGCREATEPOSITIONRESPONSE']._serialized_end=1362
  _globals['_MSGADDTOPOSITION']._serialized_start=1365
  _globals['_MSGADDTOPOSITION']._serialized_end=1908
  _globals['_MSGADDTOPOSITIONRESPONSE']._serialized_start=1911
  _globals['_MSGADDTOPOSITIONRESPONSE']._serialized_end=2178
  _globals['_MSGWITHDRAWPOSITION']._serialized_start=2181
  _globals['_MSGWITHDRAWPOSITION']._serialized_end=2420
  _globals['_MSGWITHDRAWPOSITIONRESPONSE']._serialized_start=2423
  _globals['_MSGWITHDRAWPOSITIONRESPONSE']._serialized_end=2636
  _globals['_MSGCOLLECTSPREADREWARDS']._serialized_start=2639
  _globals['_MSGCOLLECTSPREADREWARDS']._serialized_end=2767
  _globals['_MSGCOLLECTSPREADREWARDSRESPONSE']._serialized_start=2770
  _globals['_MSGCOLLECTSPREADREWARDSRESPONSE']._serialized_end=2929
  _globals['_MSGCOLLECTINCENTIVES']._serialized_start=2931
  _globals['_MSGCOLLECTINCENTIVES']._serialized_end=3056
  _globals['_MSGCOLLECTINCENTIVESRESPONSE']._serialized_start=3059
  _globals['_MSGCOLLECTINCENTIVESRESPONSE']._serialized_end=3319
  _globals['_MSGFUNGIFYCHARGEDPOSITIONS']._serialized_start=3322
  _globals['_MSGFUNGIFYCHARGEDPOSITIONS']._serialized_end=3453
  _globals['_MSGFUNGIFYCHARGEDPOSITIONSRESPONSE']._serialized_start=3455
  _globals['_MSGFUNGIFYCHARGEDPOSITIONSRESPONSE']._serialized_end=3559
  _globals['_MSG']._serialized_start=3562
  _globals['_MSG']._serialized_end=4482
# @@protoc_insertion_point(module_scope)