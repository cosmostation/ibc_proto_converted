# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/liquidity/v1beta1/query.proto
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
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from comdex.liquidity.v1beta1 import liquidity_pb2 as comdex_dot_liquidity_dot_v1beta1_dot_liquidity__pb2
from comdex.liquidity.v1beta1 import params_pb2 as comdex_dot_liquidity_dot_v1beta1_dot_params__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$comdex/liquidity/v1beta1/query.proto\x12\x18\x63omdex.liquidity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a(comdex/liquidity/v1beta1/liquidity.proto\x1a%comdex/liquidity/v1beta1/params.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/duration.proto\"\x14\n\x12QueryParamsRequest\"U\n\x13QueryParamsResponse\x12>\n\x06params\x18\x01 \x01(\x0b\x32 .comdex.liquidity.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"2\n\x19QueryGenericParamsRequest\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\"c\n\x1aQueryGenericParamsResponse\x12\x45\n\x06params\x18\x01 \x01(\x0b\x32\'.comdex.liquidity.v1beta1.GenericParamsB\x04\xc8\xde\x1f\x00R\x06params\"\xa7\x01\n\x11QueryPoolsRequest\x12\x17\n\x07pair_id\x18\x01 \x01(\x04R\x06pairId\x12\x1a\n\x08\x64isabled\x18\x02 \x01(\tR\x08\x64isabled\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\xa1\x01\n\x12QueryPoolsResponse\x12\x42\n\x05pools\x18\x01 \x03(\x0b\x32&.comdex.liquidity.v1beta1.PoolResponseB\x04\xc8\xde\x1f\x00R\x05pools\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"B\n\x10QueryPoolRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\"U\n\x11QueryPoolResponse\x12@\n\x04pool\x18\x01 \x01(\x0b\x32&.comdex.liquidity.v1beta1.PoolResponseB\x04\xc8\xde\x1f\x00R\x04pool\"b\n QueryPoolByReserveAddressRequest\x12\'\n\x0freserve_address\x18\x01 \x01(\tR\x0ereserveAddress\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\"`\n\x1fQueryPoolByPoolCoinDenomRequest\x12&\n\x0fpool_coin_denom\x18\x01 \x01(\tR\rpoolCoinDenom\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\"\x8a\x01\n\x11QueryPairsRequest\x12\x16\n\x06\x64\x65noms\x18\x01 \x03(\tR\x06\x64\x65noms\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"\x99\x01\n\x12QueryPairsResponse\x12:\n\x05pairs\x18\x01 \x03(\x0b\x32\x1e.comdex.liquidity.v1beta1.PairB\x04\xc8\xde\x1f\x00R\x05pairs\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"B\n\x10QueryPairRequest\x12\x17\n\x07pair_id\x18\x01 \x01(\x04R\x06pairId\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\"M\n\x11QueryPairResponse\x12\x38\n\x04pair\x18\x01 \x01(\x0b\x32\x1e.comdex.liquidity.v1beta1.PairB\x04\xc8\xde\x1f\x00R\x04pair\"\x95\x01\n\x1bQueryDepositRequestsRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xc2\x01\n\x1cQueryDepositRequestsResponse\x12Y\n\x10\x64\x65posit_requests\x18\x01 \x03(\x0b\x32(.comdex.liquidity.v1beta1.DepositRequestB\x04\xc8\xde\x1f\x00R\x0f\x64\x65positRequests\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\\\n\x1aQueryDepositRequestRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"v\n\x1bQueryDepositRequestResponse\x12W\n\x0f\x64\x65posit_request\x18\x01 \x01(\x0b\x32(.comdex.liquidity.v1beta1.DepositRequestB\x04\xc8\xde\x1f\x00R\x0e\x64\x65positRequest\"\x96\x01\n\x1cQueryWithdrawRequestsRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"\xc6\x01\n\x1dQueryWithdrawRequestsResponse\x12\\\n\x11withdraw_requests\x18\x01 \x03(\x0b\x32).comdex.liquidity.v1beta1.WithdrawRequestB\x04\xc8\xde\x1f\x00R\x10withdrawRequests\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"]\n\x1bQueryWithdrawRequestRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"z\n\x1cQueryWithdrawRequestResponse\x12Z\n\x10withdraw_request\x18\x01 \x01(\x0b\x32).comdex.liquidity.v1beta1.WithdrawRequestB\x04\xc8\xde\x1f\x00R\x0fwithdrawRequest\"\x8c\x01\n\x12QueryOrdersRequest\x12\x17\n\x07pair_id\x18\x01 \x01(\x04R\x06pairId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"\x9d\x01\n\x13QueryOrdersResponse\x12=\n\x06orders\x18\x01 \x03(\x0b\x32\x1f.comdex.liquidity.v1beta1.OrderB\x04\xc8\xde\x1f\x00R\x06orders\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"S\n\x11QueryOrderRequest\x12\x17\n\x07pair_id\x18\x01 \x01(\x04R\x06pairId\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"Q\n\x12QueryOrderResponse\x12;\n\x05order\x18\x01 \x01(\x0b\x32\x1f.comdex.liquidity.v1beta1.OrderB\x04\xc8\xde\x1f\x00R\x05order\"\xaf\x01\n\x1bQueryOrdersByOrdererRequest\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\xf5\x05\n\x0cPoolResponse\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\'\n\x0freserve_address\x18\x03 \x01(\tR\x0ereserveAddress\x12&\n\x0fpool_coin_denom\x18\x04 \x01(\tR\rpoolCoinDenom\x12H\n\x08\x62\x61lances\x18\x05 \x01(\x0b\x32&.comdex.liquidity.v1beta1.PoolBalancesB\x04\xc8\xde\x1f\x00R\x08\x62\x61lances\x12\x35\n\x17last_deposit_request_id\x18\x06 \x01(\x04R\x14lastDepositRequestId\x12\x37\n\x18last_withdraw_request_id\x18\x07 \x01(\x04R\x15lastWithdrawRequestId\x12\x15\n\x06\x61pp_id\x18\x08 \x01(\x04R\x05\x61ppId\x12\x36\n\x04type\x18\t \x01(\x0e\x32\".comdex.liquidity.v1beta1.PoolTypeR\x04type\x12\x18\n\x07\x63reator\x18\n \x01(\tR\x07\x63reator\x12X\n\x10pool_coin_supply\x18\x0b \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0epoolCoinSupply\x12G\n\tmin_price\x18\x0c \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08minPrice\x12G\n\tmax_price\x18\r \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08maxPrice\x12@\n\x05price\x18\x0e \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05price\x12\x1a\n\x08\x64isabled\x18\x0f \x01(\x08R\x08\x64isabled\"\x8c\x01\n\x0cPoolBalances\x12<\n\tbase_coin\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08\x62\x61seCoin\x12>\n\nquote_coin\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tquoteCoin\"\\\n\x12QueryFarmerRequest\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\"\xcd\x01\n\x0eQueuedPoolCoin\x12g\n\tpool_coin\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x08poolCoin\x12R\n\x08\x64\x65que_at\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"deque_at\"\x90\xdf\x1f\x01R\x07\x64\x65queAt\"\xe5\x01\n\x13QueryFarmerResponse\x12t\n\x10\x61\x63tive_pool_coin\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0e\x61\x63tivePoolCoin\x12X\n\x10queued_pool_coin\x18\x02 \x03(\x0b\x32(.comdex.liquidity.v1beta1.QueuedPoolCoinB\x04\xc8\xde\x1f\x00R\x0equeuedPoolCoin\"{\n\x1fQueryDeserializePoolCoinRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12(\n\x10pool_coin_amount\x18\x02 \x01(\x04R\x0epoolCoinAmount\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"\x85\x01\n QueryDeserializePoolCoinResponse\x12\x61\n\x05\x63oins\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins\"4\n\x1bQueryPoolsIncentivesRequest\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\"\xcc\x05\n\rPoolIncentive\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x1f\n\x0bmaster_pool\x18\x02 \x01(\x08R\nmasterPool\x12$\n\x0e\x63hild_pool_ids\x18\x03 \x03(\x04R\x0c\x63hildPoolIds\x12o\n\rtotal_rewards\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0ctotalRewards\x12{\n\x13\x64istributed_rewards\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x12\x64istributedRewards\x12!\n\x0ctotal_epochs\x18\x06 \x01(\x04R\x0btotalEpochs\x12#\n\rfilled_epochs\x18\x07 \x01(\x04R\x0c\x66illedEpochs\x12\x7f\n\x0e\x65poch_duration\x18\x08 \x01(\x0b\x32\x19.google.protobuf.DurationB=\xc8\xde\x1f\x00\xea\xde\x1f\x18\x65poch_duration,omitempty\xf2\xde\x1f\x15yaml:\"epoch_duration\"\x98\xdf\x1f\x01R\repochDuration\x12m\n\x11next_distribution\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB$\xc8\xde\x1f\x00\xf2\xde\x1f\x18yaml:\"next_distribution\"\x90\xdf\x1f\x01R\x10nextDistribution\x12\x1e\n\x0bis_swap_fee\x18\n \x01(\x08R\tisSwapFee\x12\x15\n\x06\x61pp_id\x18\x0b \x01(\x04R\x05\x61ppId\"o\n\x1bQueryPoolIncentivesResponse\x12P\n\x0fpool_incentives\x18\x01 \x03(\x0b\x32\'.comdex.liquidity.v1beta1.PoolIncentiveR\x0epoolIncentives\"L\n\x1aQueryFarmedPoolCoinRequest\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\"}\n\x1bQueryFarmedPoolCoinResponse\x12^\n\x04\x63oin\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x04\x63oin\"\x93\x01\n\x16QueryOrderBooksRequest\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x19\n\x08pair_ids\x18\x02 \x03(\x04R\x07pairIds\x12*\n\x11price_unit_powers\x18\x03 \x03(\rR\x0fpriceUnitPowers\x12\x1b\n\tnum_ticks\x18\x04 \x01(\rR\x08numTicks\"f\n\x17QueryOrderBooksResponse\x12K\n\x05pairs\x18\x02 \x03(\x0b\x32/.comdex.liquidity.v1beta1.OrderBookPairResponseB\x04\xc8\xde\x1f\x00R\x05pairs\"\xd3\x01\n\x15OrderBookPairResponse\x12\x17\n\x07pair_id\x18\x01 \x01(\x04R\x06pairId\x12M\n\nbase_price\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tbasePrice\x12R\n\x0border_books\x18\x03 \x03(\x0b\x32+.comdex.liquidity.v1beta1.OrderBookResponseB\x04\xc8\xde\x1f\x00R\norderBooks\"\xfa\x01\n\x11OrderBookResponse\x12M\n\nprice_unit\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tpriceUnit\x12K\n\x05sells\x18\x02 \x03(\x0b\x32/.comdex.liquidity.v1beta1.OrderBookTickResponseB\x04\xc8\xde\x1f\x00R\x05sells\x12I\n\x04\x62uys\x18\x03 \x03(\x0b\x32/.comdex.liquidity.v1beta1.OrderBookTickResponseB\x04\xc8\xde\x1f\x00R\x04\x62uys\"\x95\x02\n\x15OrderBookTickResponse\x12\x44\n\x05price\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05price\x12Z\n\x11user_order_amount\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0fuserOrderAmount\x12Z\n\x11pool_order_amount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0fpoolOrderAmount\"\xba\x02\n\x1dTotalActiveAndQueuedPoolCoins\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x7f\n\x16total_active_pool_coin\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x13totalActivePoolCoin\x12\x7f\n\x16total_queued_pool_coin\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x13totalQueuedPoolCoin\"7\n\x1eQueryAllFarmedPoolCoinsRequest\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\"\xb3\x01\n\x1fQueryAllFarmedPoolCoinsResponse\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12y\n\x1dtotal_active_and_queued_coins\x18\x02 \x03(\x0b\x32\x37.comdex.liquidity.v1beta1.TotalActiveAndQueuedPoolCoinsR\x19totalActiveAndQueuedCoins2\xc3\x1e\n\x05Query\x12\x8f\x01\n\x06Params\x12,.comdex.liquidity.v1beta1.QueryParamsRequest\x1a-.comdex.liquidity.v1beta1.QueryParamsResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /comdex/liquidity/v1beta1/params\x12\xb5\x01\n\rGenericParams\x12\x33.comdex.liquidity.v1beta1.QueryGenericParamsRequest\x1a\x34.comdex.liquidity.v1beta1.QueryGenericParamsResponse\"9\x82\xd3\xe4\x93\x02\x33\x12\x31/comdex/liquidity/v1beta1/generic_params/{app_id}\x12\x94\x01\n\x05Pools\x12+.comdex.liquidity.v1beta1.QueryPoolsRequest\x1a,.comdex.liquidity.v1beta1.QueryPoolsResponse\"0\x82\xd3\xe4\x93\x02*\x12(/comdex/liquidity/v1beta1/pools/{app_id}\x12\x9b\x01\n\x04Pool\x12*.comdex.liquidity.v1beta1.QueryPoolRequest\x1a+.comdex.liquidity.v1beta1.QueryPoolResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}\x12\xd3\x01\n\x14PoolByReserveAddress\x12:.comdex.liquidity.v1beta1.QueryPoolByReserveAddressRequest\x1a+.comdex.liquidity.v1beta1.QueryPoolResponse\"R\x82\xd3\xe4\x93\x02L\x12J/comdex/liquidity/v1beta1/pools/{app_id}/reserve_address/{reserve_address}\x12\xd1\x01\n\x13PoolByPoolCoinDenom\x12\x39.comdex.liquidity.v1beta1.QueryPoolByPoolCoinDenomRequest\x1a+.comdex.liquidity.v1beta1.QueryPoolResponse\"R\x82\xd3\xe4\x93\x02L\x12J/comdex/liquidity/v1beta1/pools/{app_id}/pool_coin_denom/{pool_coin_denom}\x12\x94\x01\n\x05Pairs\x12+.comdex.liquidity.v1beta1.QueryPairsRequest\x1a,.comdex.liquidity.v1beta1.QueryPairsResponse\"0\x82\xd3\xe4\x93\x02*\x12(/comdex/liquidity/v1beta1/pairs/{app_id}\x12\x9b\x01\n\x04Pair\x12*.comdex.liquidity.v1beta1.QueryPairRequest\x1a+.comdex.liquidity.v1beta1.QueryPairResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/comdex/liquidity/v1beta1/pairs/{app_id}/{pair_id}\x12\xcd\x01\n\x0f\x44\x65positRequests\x12\x35.comdex.liquidity.v1beta1.QueryDepositRequestsRequest\x1a\x36.comdex.liquidity.v1beta1.QueryDepositRequestsResponse\"K\x82\xd3\xe4\x93\x02\x45\x12\x43/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/deposit_requests\x12\xcf\x01\n\x0e\x44\x65positRequest\x12\x34.comdex.liquidity.v1beta1.QueryDepositRequestRequest\x1a\x35.comdex.liquidity.v1beta1.QueryDepositRequestResponse\"P\x82\xd3\xe4\x93\x02J\x12H/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/deposit_requests/{id}\x12\xd1\x01\n\x10WithdrawRequests\x12\x36.comdex.liquidity.v1beta1.QueryWithdrawRequestsRequest\x1a\x37.comdex.liquidity.v1beta1.QueryWithdrawRequestsResponse\"L\x82\xd3\xe4\x93\x02\x46\x12\x44/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/withdraw_requests\x12\xd3\x01\n\x0fWithdrawRequest\x12\x35.comdex.liquidity.v1beta1.QueryWithdrawRequestRequest\x1a\x36.comdex.liquidity.v1beta1.QueryWithdrawRequestResponse\"Q\x82\xd3\xe4\x93\x02K\x12I/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/withdraw_requests/{id}\x12\xa2\x01\n\x06Orders\x12,.comdex.liquidity.v1beta1.QueryOrdersRequest\x1a-.comdex.liquidity.v1beta1.QueryOrdersResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/comdex/liquidity/v1beta1/orders/{app_id}/{pair_id}\x12\xa4\x01\n\x05Order\x12+.comdex.liquidity.v1beta1.QueryOrderRequest\x1a,.comdex.liquidity.v1beta1.QueryOrderResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/comdex/liquidity/v1beta1/orders/{app_id}/{pair_id}/{id}\x12\xb4\x01\n\x0fOrdersByOrderer\x12\x35.comdex.liquidity.v1beta1.QueryOrdersByOrdererRequest\x1a-.comdex.liquidity.v1beta1.QueryOrdersResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/comdex/liquidity/v1beta1/orders/{app_id}/{orderer}\x12\xab\x01\n\x06\x46\x61rmer\x12,.comdex.liquidity.v1beta1.QueryFarmerRequest\x1a-.comdex.liquidity.v1beta1.QueryFarmerResponse\"D\x82\xd3\xe4\x93\x02>\x12</comdex/liquidity/v1beta1/farmer/{app_id}/{pool_id}/{farmer}\x12\xe1\x01\n\x13\x44\x65serializePoolCoin\x12\x39.comdex.liquidity.v1beta1.QueryDeserializePoolCoinRequest\x1a:.comdex.liquidity.v1beta1.QueryDeserializePoolCoinResponse\"S\x82\xd3\xe4\x93\x02M\x12K/comdex/liquidity/v1beta1/deserialize/{app_id}/{pool_id}/{pool_coin_amount}\x12\xba\x01\n\x0ePoolIncentives\x12\x35.comdex.liquidity.v1beta1.QueryPoolsIncentivesRequest\x1a\x35.comdex.liquidity.v1beta1.QueryPoolIncentivesResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/comdex/liquidity/v1beta1/pool_incentives/{app_id}\x12\xbf\x01\n\x0e\x46\x61rmedPoolCoin\x12\x34.comdex.liquidity.v1beta1.QueryFarmedPoolCoinRequest\x1a\x35.comdex.liquidity.v1beta1.QueryFarmedPoolCoinResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/comdex/liquidity/v1beta1/farmed_coin/{app_id}/{pool_id}\x12\xcf\x01\n\x1cTotalActiveAndQueuedPoolCoin\x12\x38.comdex.liquidity.v1beta1.QueryAllFarmedPoolCoinsRequest\x1a\x39.comdex.liquidity.v1beta1.QueryAllFarmedPoolCoinsResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/comdex/liquidity/v1beta1/all_farmed_coin/{app_id}\x12\xa9\x01\n\nOrderBooks\x12\x30.comdex.liquidity.v1beta1.QueryOrderBooksRequest\x1a\x31.comdex.liquidity.v1beta1.QueryOrderBooksResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./comdex/liquidity/v1beta1/order_books/{app_id}B\xdf\x01\n\x1c\x63om.comdex.liquidity.v1beta1B\nQueryProtoZ3github.com/comdex-official/comdex/x/liquidity/types\xa2\x02\x03\x43LX\xaa\x02\x18\x43omdex.Liquidity.V1beta1\xca\x02\x18\x43omdex\\Liquidity\\V1beta1\xe2\x02$Comdex\\Liquidity\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Liquidity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.liquidity.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.comdex.liquidity.v1beta1B\nQueryProtoZ3github.com/comdex-official/comdex/x/liquidity/types\242\002\003CLX\252\002\030Comdex.Liquidity.V1beta1\312\002\030Comdex\\Liquidity\\V1beta1\342\002$Comdex\\Liquidity\\V1beta1\\GPBMetadata\352\002\032Comdex::Liquidity::V1beta1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYGENERICPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYGENERICPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPOOLSRESPONSE'].fields_by_name['pools']._options = None
  _globals['_QUERYPOOLSRESPONSE'].fields_by_name['pools']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPOOLRESPONSE'].fields_by_name['pool']._options = None
  _globals['_QUERYPOOLRESPONSE'].fields_by_name['pool']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPAIRSRESPONSE'].fields_by_name['pairs']._options = None
  _globals['_QUERYPAIRSRESPONSE'].fields_by_name['pairs']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPAIRRESPONSE'].fields_by_name['pair']._options = None
  _globals['_QUERYPAIRRESPONSE'].fields_by_name['pair']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYDEPOSITREQUESTSRESPONSE'].fields_by_name['deposit_requests']._options = None
  _globals['_QUERYDEPOSITREQUESTSRESPONSE'].fields_by_name['deposit_requests']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYDEPOSITREQUESTRESPONSE'].fields_by_name['deposit_request']._options = None
  _globals['_QUERYDEPOSITREQUESTRESPONSE'].fields_by_name['deposit_request']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYWITHDRAWREQUESTSRESPONSE'].fields_by_name['withdraw_requests']._options = None
  _globals['_QUERYWITHDRAWREQUESTSRESPONSE'].fields_by_name['withdraw_requests']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYWITHDRAWREQUESTRESPONSE'].fields_by_name['withdraw_request']._options = None
  _globals['_QUERYWITHDRAWREQUESTRESPONSE'].fields_by_name['withdraw_request']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYORDERSRESPONSE'].fields_by_name['orders']._options = None
  _globals['_QUERYORDERSRESPONSE'].fields_by_name['orders']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['order']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['order']._serialized_options = b'\310\336\037\000'
  _globals['_POOLRESPONSE'].fields_by_name['balances']._options = None
  _globals['_POOLRESPONSE'].fields_by_name['balances']._serialized_options = b'\310\336\037\000'
  _globals['_POOLRESPONSE'].fields_by_name['pool_coin_supply']._options = None
  _globals['_POOLRESPONSE'].fields_by_name['pool_coin_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_POOLRESPONSE'].fields_by_name['min_price']._options = None
  _globals['_POOLRESPONSE'].fields_by_name['min_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_POOLRESPONSE'].fields_by_name['max_price']._options = None
  _globals['_POOLRESPONSE'].fields_by_name['max_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_POOLRESPONSE'].fields_by_name['price']._options = None
  _globals['_POOLRESPONSE'].fields_by_name['price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_POOLBALANCES'].fields_by_name['base_coin']._options = None
  _globals['_POOLBALANCES'].fields_by_name['base_coin']._serialized_options = b'\310\336\037\000'
  _globals['_POOLBALANCES'].fields_by_name['quote_coin']._options = None
  _globals['_POOLBALANCES'].fields_by_name['quote_coin']._serialized_options = b'\310\336\037\000'
  _globals['_QUEUEDPOOLCOIN'].fields_by_name['pool_coin']._options = None
  _globals['_QUEUEDPOOLCOIN'].fields_by_name['pool_coin']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUEUEDPOOLCOIN'].fields_by_name['deque_at']._options = None
  _globals['_QUEUEDPOOLCOIN'].fields_by_name['deque_at']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"deque_at\"\220\337\037\001'
  _globals['_QUERYFARMERRESPONSE'].fields_by_name['active_pool_coin']._options = None
  _globals['_QUERYFARMERRESPONSE'].fields_by_name['active_pool_coin']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUERYFARMERRESPONSE'].fields_by_name['queued_pool_coin']._options = None
  _globals['_QUERYFARMERRESPONSE'].fields_by_name['queued_pool_coin']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYDESERIALIZEPOOLCOINRESPONSE'].fields_by_name['coins']._options = None
  _globals['_QUERYDESERIALIZEPOOLCOINRESPONSE'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_POOLINCENTIVE'].fields_by_name['total_rewards']._options = None
  _globals['_POOLINCENTIVE'].fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_POOLINCENTIVE'].fields_by_name['distributed_rewards']._options = None
  _globals['_POOLINCENTIVE'].fields_by_name['distributed_rewards']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_POOLINCENTIVE'].fields_by_name['epoch_duration']._options = None
  _globals['_POOLINCENTIVE'].fields_by_name['epoch_duration']._serialized_options = b'\310\336\037\000\352\336\037\030epoch_duration,omitempty\362\336\037\025yaml:\"epoch_duration\"\230\337\037\001'
  _globals['_POOLINCENTIVE'].fields_by_name['next_distribution']._options = None
  _globals['_POOLINCENTIVE'].fields_by_name['next_distribution']._serialized_options = b'\310\336\037\000\362\336\037\030yaml:\"next_distribution\"\220\337\037\001'
  _globals['_QUERYFARMEDPOOLCOINRESPONSE'].fields_by_name['coin']._options = None
  _globals['_QUERYFARMEDPOOLCOINRESPONSE'].fields_by_name['coin']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUERYORDERBOOKSRESPONSE'].fields_by_name['pairs']._options = None
  _globals['_QUERYORDERBOOKSRESPONSE'].fields_by_name['pairs']._serialized_options = b'\310\336\037\000'
  _globals['_ORDERBOOKPAIRRESPONSE'].fields_by_name['base_price']._options = None
  _globals['_ORDERBOOKPAIRRESPONSE'].fields_by_name['base_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_ORDERBOOKPAIRRESPONSE'].fields_by_name['order_books']._options = None
  _globals['_ORDERBOOKPAIRRESPONSE'].fields_by_name['order_books']._serialized_options = b'\310\336\037\000'
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['price_unit']._options = None
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['price_unit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['sells']._options = None
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['sells']._serialized_options = b'\310\336\037\000'
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['buys']._options = None
  _globals['_ORDERBOOKRESPONSE'].fields_by_name['buys']._serialized_options = b'\310\336\037\000'
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['price']._options = None
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['user_order_amount']._options = None
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['user_order_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['pool_order_amount']._options = None
  _globals['_ORDERBOOKTICKRESPONSE'].fields_by_name['pool_order_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS'].fields_by_name['total_active_pool_coin']._options = None
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS'].fields_by_name['total_active_pool_coin']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS'].fields_by_name['total_queued_pool_coin']._options = None
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS'].fields_by_name['total_queued_pool_coin']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\"\022 /comdex/liquidity/v1beta1/params'
  _globals['_QUERY'].methods_by_name['GenericParams']._options = None
  _globals['_QUERY'].methods_by_name['GenericParams']._serialized_options = b'\202\323\344\223\0023\0221/comdex/liquidity/v1beta1/generic_params/{app_id}'
  _globals['_QUERY'].methods_by_name['Pools']._options = None
  _globals['_QUERY'].methods_by_name['Pools']._serialized_options = b'\202\323\344\223\002*\022(/comdex/liquidity/v1beta1/pools/{app_id}'
  _globals['_QUERY'].methods_by_name['Pool']._options = None
  _globals['_QUERY'].methods_by_name['Pool']._serialized_options = b'\202\323\344\223\0024\0222/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}'
  _globals['_QUERY'].methods_by_name['PoolByReserveAddress']._options = None
  _globals['_QUERY'].methods_by_name['PoolByReserveAddress']._serialized_options = b'\202\323\344\223\002L\022J/comdex/liquidity/v1beta1/pools/{app_id}/reserve_address/{reserve_address}'
  _globals['_QUERY'].methods_by_name['PoolByPoolCoinDenom']._options = None
  _globals['_QUERY'].methods_by_name['PoolByPoolCoinDenom']._serialized_options = b'\202\323\344\223\002L\022J/comdex/liquidity/v1beta1/pools/{app_id}/pool_coin_denom/{pool_coin_denom}'
  _globals['_QUERY'].methods_by_name['Pairs']._options = None
  _globals['_QUERY'].methods_by_name['Pairs']._serialized_options = b'\202\323\344\223\002*\022(/comdex/liquidity/v1beta1/pairs/{app_id}'
  _globals['_QUERY'].methods_by_name['Pair']._options = None
  _globals['_QUERY'].methods_by_name['Pair']._serialized_options = b'\202\323\344\223\0024\0222/comdex/liquidity/v1beta1/pairs/{app_id}/{pair_id}'
  _globals['_QUERY'].methods_by_name['DepositRequests']._options = None
  _globals['_QUERY'].methods_by_name['DepositRequests']._serialized_options = b'\202\323\344\223\002E\022C/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/deposit_requests'
  _globals['_QUERY'].methods_by_name['DepositRequest']._options = None
  _globals['_QUERY'].methods_by_name['DepositRequest']._serialized_options = b'\202\323\344\223\002J\022H/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/deposit_requests/{id}'
  _globals['_QUERY'].methods_by_name['WithdrawRequests']._options = None
  _globals['_QUERY'].methods_by_name['WithdrawRequests']._serialized_options = b'\202\323\344\223\002F\022D/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/withdraw_requests'
  _globals['_QUERY'].methods_by_name['WithdrawRequest']._options = None
  _globals['_QUERY'].methods_by_name['WithdrawRequest']._serialized_options = b'\202\323\344\223\002K\022I/comdex/liquidity/v1beta1/pools/{app_id}/{pool_id}/withdraw_requests/{id}'
  _globals['_QUERY'].methods_by_name['Orders']._options = None
  _globals['_QUERY'].methods_by_name['Orders']._serialized_options = b'\202\323\344\223\0025\0223/comdex/liquidity/v1beta1/orders/{app_id}/{pair_id}'
  _globals['_QUERY'].methods_by_name['Order']._options = None
  _globals['_QUERY'].methods_by_name['Order']._serialized_options = b'\202\323\344\223\002:\0228/comdex/liquidity/v1beta1/orders/{app_id}/{pair_id}/{id}'
  _globals['_QUERY'].methods_by_name['OrdersByOrderer']._options = None
  _globals['_QUERY'].methods_by_name['OrdersByOrderer']._serialized_options = b'\202\323\344\223\0025\0223/comdex/liquidity/v1beta1/orders/{app_id}/{orderer}'
  _globals['_QUERY'].methods_by_name['Farmer']._options = None
  _globals['_QUERY'].methods_by_name['Farmer']._serialized_options = b'\202\323\344\223\002>\022</comdex/liquidity/v1beta1/farmer/{app_id}/{pool_id}/{farmer}'
  _globals['_QUERY'].methods_by_name['DeserializePoolCoin']._options = None
  _globals['_QUERY'].methods_by_name['DeserializePoolCoin']._serialized_options = b'\202\323\344\223\002M\022K/comdex/liquidity/v1beta1/deserialize/{app_id}/{pool_id}/{pool_coin_amount}'
  _globals['_QUERY'].methods_by_name['PoolIncentives']._options = None
  _globals['_QUERY'].methods_by_name['PoolIncentives']._serialized_options = b'\202\323\344\223\0024\0222/comdex/liquidity/v1beta1/pool_incentives/{app_id}'
  _globals['_QUERY'].methods_by_name['FarmedPoolCoin']._options = None
  _globals['_QUERY'].methods_by_name['FarmedPoolCoin']._serialized_options = b'\202\323\344\223\002:\0228/comdex/liquidity/v1beta1/farmed_coin/{app_id}/{pool_id}'
  _globals['_QUERY'].methods_by_name['TotalActiveAndQueuedPoolCoin']._options = None
  _globals['_QUERY'].methods_by_name['TotalActiveAndQueuedPoolCoin']._serialized_options = b'\202\323\344\223\0024\0222/comdex/liquidity/v1beta1/all_farmed_coin/{app_id}'
  _globals['_QUERY'].methods_by_name['OrderBooks']._options = None
  _globals['_QUERY'].methods_by_name['OrderBooks']._serialized_options = b'\202\323\344\223\0020\022./comdex/liquidity/v1beta1/order_books/{app_id}'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=340
  _globals['_QUERYPARAMSREQUEST']._serialized_end=360
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=362
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=447
  _globals['_QUERYGENERICPARAMSREQUEST']._serialized_start=449
  _globals['_QUERYGENERICPARAMSREQUEST']._serialized_end=499
  _globals['_QUERYGENERICPARAMSRESPONSE']._serialized_start=501
  _globals['_QUERYGENERICPARAMSRESPONSE']._serialized_end=600
  _globals['_QUERYPOOLSREQUEST']._serialized_start=603
  _globals['_QUERYPOOLSREQUEST']._serialized_end=770
  _globals['_QUERYPOOLSRESPONSE']._serialized_start=773
  _globals['_QUERYPOOLSRESPONSE']._serialized_end=934
  _globals['_QUERYPOOLREQUEST']._serialized_start=936
  _globals['_QUERYPOOLREQUEST']._serialized_end=1002
  _globals['_QUERYPOOLRESPONSE']._serialized_start=1004
  _globals['_QUERYPOOLRESPONSE']._serialized_end=1089
  _globals['_QUERYPOOLBYRESERVEADDRESSREQUEST']._serialized_start=1091
  _globals['_QUERYPOOLBYRESERVEADDRESSREQUEST']._serialized_end=1189
  _globals['_QUERYPOOLBYPOOLCOINDENOMREQUEST']._serialized_start=1191
  _globals['_QUERYPOOLBYPOOLCOINDENOMREQUEST']._serialized_end=1287
  _globals['_QUERYPAIRSREQUEST']._serialized_start=1290
  _globals['_QUERYPAIRSREQUEST']._serialized_end=1428
  _globals['_QUERYPAIRSRESPONSE']._serialized_start=1431
  _globals['_QUERYPAIRSRESPONSE']._serialized_end=1584
  _globals['_QUERYPAIRREQUEST']._serialized_start=1586
  _globals['_QUERYPAIRREQUEST']._serialized_end=1652
  _globals['_QUERYPAIRRESPONSE']._serialized_start=1654
  _globals['_QUERYPAIRRESPONSE']._serialized_end=1731
  _globals['_QUERYDEPOSITREQUESTSREQUEST']._serialized_start=1734
  _globals['_QUERYDEPOSITREQUESTSREQUEST']._serialized_end=1883
  _globals['_QUERYDEPOSITREQUESTSRESPONSE']._serialized_start=1886
  _globals['_QUERYDEPOSITREQUESTSRESPONSE']._serialized_end=2080
  _globals['_QUERYDEPOSITREQUESTREQUEST']._serialized_start=2082
  _globals['_QUERYDEPOSITREQUESTREQUEST']._serialized_end=2174
  _globals['_QUERYDEPOSITREQUESTRESPONSE']._serialized_start=2176
  _globals['_QUERYDEPOSITREQUESTRESPONSE']._serialized_end=2294
  _globals['_QUERYWITHDRAWREQUESTSREQUEST']._serialized_start=2297
  _globals['_QUERYWITHDRAWREQUESTSREQUEST']._serialized_end=2447
  _globals['_QUERYWITHDRAWREQUESTSRESPONSE']._serialized_start=2450
  _globals['_QUERYWITHDRAWREQUESTSRESPONSE']._serialized_end=2648
  _globals['_QUERYWITHDRAWREQUESTREQUEST']._serialized_start=2650
  _globals['_QUERYWITHDRAWREQUESTREQUEST']._serialized_end=2743
  _globals['_QUERYWITHDRAWREQUESTRESPONSE']._serialized_start=2745
  _globals['_QUERYWITHDRAWREQUESTRESPONSE']._serialized_end=2867
  _globals['_QUERYORDERSREQUEST']._serialized_start=2870
  _globals['_QUERYORDERSREQUEST']._serialized_end=3010
  _globals['_QUERYORDERSRESPONSE']._serialized_start=3013
  _globals['_QUERYORDERSRESPONSE']._serialized_end=3170
  _globals['_QUERYORDERREQUEST']._serialized_start=3172
  _globals['_QUERYORDERREQUEST']._serialized_end=3255
  _globals['_QUERYORDERRESPONSE']._serialized_start=3257
  _globals['_QUERYORDERRESPONSE']._serialized_end=3338
  _globals['_QUERYORDERSBYORDERERREQUEST']._serialized_start=3341
  _globals['_QUERYORDERSBYORDERERREQUEST']._serialized_end=3516
  _globals['_POOLRESPONSE']._serialized_start=3519
  _globals['_POOLRESPONSE']._serialized_end=4276
  _globals['_POOLBALANCES']._serialized_start=4279
  _globals['_POOLBALANCES']._serialized_end=4419
  _globals['_QUERYFARMERREQUEST']._serialized_start=4421
  _globals['_QUERYFARMERREQUEST']._serialized_end=4513
  _globals['_QUEUEDPOOLCOIN']._serialized_start=4516
  _globals['_QUEUEDPOOLCOIN']._serialized_end=4721
  _globals['_QUERYFARMERRESPONSE']._serialized_start=4724
  _globals['_QUERYFARMERRESPONSE']._serialized_end=4953
  _globals['_QUERYDESERIALIZEPOOLCOINREQUEST']._serialized_start=4955
  _globals['_QUERYDESERIALIZEPOOLCOINREQUEST']._serialized_end=5078
  _globals['_QUERYDESERIALIZEPOOLCOINRESPONSE']._serialized_start=5081
  _globals['_QUERYDESERIALIZEPOOLCOINRESPONSE']._serialized_end=5214
  _globals['_QUERYPOOLSINCENTIVESREQUEST']._serialized_start=5216
  _globals['_QUERYPOOLSINCENTIVESREQUEST']._serialized_end=5268
  _globals['_POOLINCENTIVE']._serialized_start=5271
  _globals['_POOLINCENTIVE']._serialized_end=5987
  _globals['_QUERYPOOLINCENTIVESRESPONSE']._serialized_start=5989
  _globals['_QUERYPOOLINCENTIVESRESPONSE']._serialized_end=6100
  _globals['_QUERYFARMEDPOOLCOINREQUEST']._serialized_start=6102
  _globals['_QUERYFARMEDPOOLCOINREQUEST']._serialized_end=6178
  _globals['_QUERYFARMEDPOOLCOINRESPONSE']._serialized_start=6180
  _globals['_QUERYFARMEDPOOLCOINRESPONSE']._serialized_end=6305
  _globals['_QUERYORDERBOOKSREQUEST']._serialized_start=6308
  _globals['_QUERYORDERBOOKSREQUEST']._serialized_end=6455
  _globals['_QUERYORDERBOOKSRESPONSE']._serialized_start=6457
  _globals['_QUERYORDERBOOKSRESPONSE']._serialized_end=6559
  _globals['_ORDERBOOKPAIRRESPONSE']._serialized_start=6562
  _globals['_ORDERBOOKPAIRRESPONSE']._serialized_end=6773
  _globals['_ORDERBOOKRESPONSE']._serialized_start=6776
  _globals['_ORDERBOOKRESPONSE']._serialized_end=7026
  _globals['_ORDERBOOKTICKRESPONSE']._serialized_start=7029
  _globals['_ORDERBOOKTICKRESPONSE']._serialized_end=7306
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS']._serialized_start=7309
  _globals['_TOTALACTIVEANDQUEUEDPOOLCOINS']._serialized_end=7623
  _globals['_QUERYALLFARMEDPOOLCOINSREQUEST']._serialized_start=7625
  _globals['_QUERYALLFARMEDPOOLCOINSREQUEST']._serialized_end=7680
  _globals['_QUERYALLFARMEDPOOLCOINSRESPONSE']._serialized_start=7683
  _globals['_QUERYALLFARMEDPOOLCOINSRESPONSE']._serialized_end=7862
  _globals['_QUERY']._serialized_start=7865
  _globals['_QUERY']._serialized_end=11772
# @@protoc_insertion_point(module_scope)
