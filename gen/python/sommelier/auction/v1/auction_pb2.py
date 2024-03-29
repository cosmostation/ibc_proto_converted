# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/auction/v1/auction.proto
# Protobuf Python Version: 4.25.2
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"sommelier/auction/v1/auction.proto\x12\nauction.v1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xf8\x06\n\x07\x41uction\x12\x0e\n\x02id\x18\x01 \x01(\rR\x02id\x12X\n\x18starting_tokens_for_sale\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x15startingTokensForSale\x12\x1f\n\x0bstart_block\x18\x03 \x01(\x04R\nstartBlock\x12\x1b\n\tend_block\x18\x04 \x01(\x04R\x08\x65ndBlock\x12m\n\x1binitial_price_decrease_rate\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x18initialPriceDecreaseRate\x12m\n\x1b\x63urrent_price_decrease_rate\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x18\x63urrentPriceDecreaseRate\x12\x41\n\x1dprice_decrease_block_interval\x18\x07 \x01(\x04R\x1apriceDecreaseBlockInterval\x12l\n\x1binitial_unit_price_in_usomm\x18\x08 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x17initialUnitPriceInUsomm\x12l\n\x1b\x63urrent_unit_price_in_usomm\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x17\x63urrentUnitPriceInUsomm\x12Z\n\x19remaining_tokens_for_sale\x18\n \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x16remainingTokensForSale\x12\x34\n\x16\x66unding_module_account\x18\x0b \x01(\tR\x14\x66undingModuleAccount\x12\x36\n\x17proceeds_module_account\x18\x0c \x01(\tR\x15proceedsModuleAccount\"\xb3\x04\n\x03\x42id\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x1d\n\nauction_id\x18\x02 \x01(\rR\tauctionId\x12\x16\n\x06\x62idder\x18\x03 \x01(\tR\x06\x62idder\x12H\n\x10max_bid_in_usomm\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\rmaxBidInUsomm\x12Z\n\x19sale_token_minimum_amount\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x16saleTokenMinimumAmount\x12^\n\x1btotal_fulfilled_sale_tokens\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x18totalFulfilledSaleTokens\x12q\n\x1esale_token_unit_price_in_usomm\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x19saleTokenUnitPriceInUsomm\x12I\n\x10total_usomm_paid\x18\x08 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0etotalUsommPaid\x12!\n\x0c\x62lock_height\x18\t \x01(\x04R\x0b\x62lockHeight\"\x9d\x01\n\nTokenPrice\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12K\n\tusd_price\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08usdPrice\x12,\n\x12last_updated_block\x18\x03 \x01(\x04R\x10lastUpdatedBlock\"w\n\x12ProposedTokenPrice\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12K\n\tusd_price\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08usdPriceB\x96\x01\n\x0e\x63om.auction.v1B\x0c\x41uctionProtoZ/github.com/peggyjv/sommelier/v4/x/auction/types\xa2\x02\x03\x41XX\xaa\x02\nAuction.V1\xca\x02\nAuction\\V1\xe2\x02\x16\x41uction\\V1\\GPBMetadata\xea\x02\x0b\x41uction::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.auction.v1.auction_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\016com.auction.v1B\014AuctionProtoZ/github.com/peggyjv/sommelier/v4/x/auction/types\242\002\003AXX\252\002\nAuction.V1\312\002\nAuction\\V1\342\002\026Auction\\V1\\GPBMetadata\352\002\013Auction::V1'
  _globals['_AUCTION'].fields_by_name['starting_tokens_for_sale']._options = None
  _globals['_AUCTION'].fields_by_name['starting_tokens_for_sale']._serialized_options = b'\310\336\037\000'
  _globals['_AUCTION'].fields_by_name['initial_price_decrease_rate']._options = None
  _globals['_AUCTION'].fields_by_name['initial_price_decrease_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AUCTION'].fields_by_name['current_price_decrease_rate']._options = None
  _globals['_AUCTION'].fields_by_name['current_price_decrease_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AUCTION'].fields_by_name['initial_unit_price_in_usomm']._options = None
  _globals['_AUCTION'].fields_by_name['initial_unit_price_in_usomm']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AUCTION'].fields_by_name['current_unit_price_in_usomm']._options = None
  _globals['_AUCTION'].fields_by_name['current_unit_price_in_usomm']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AUCTION'].fields_by_name['remaining_tokens_for_sale']._options = None
  _globals['_AUCTION'].fields_by_name['remaining_tokens_for_sale']._serialized_options = b'\310\336\037\000'
  _globals['_BID'].fields_by_name['max_bid_in_usomm']._options = None
  _globals['_BID'].fields_by_name['max_bid_in_usomm']._serialized_options = b'\310\336\037\000'
  _globals['_BID'].fields_by_name['sale_token_minimum_amount']._options = None
  _globals['_BID'].fields_by_name['sale_token_minimum_amount']._serialized_options = b'\310\336\037\000'
  _globals['_BID'].fields_by_name['total_fulfilled_sale_tokens']._options = None
  _globals['_BID'].fields_by_name['total_fulfilled_sale_tokens']._serialized_options = b'\310\336\037\000'
  _globals['_BID'].fields_by_name['sale_token_unit_price_in_usomm']._options = None
  _globals['_BID'].fields_by_name['sale_token_unit_price_in_usomm']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_BID'].fields_by_name['total_usomm_paid']._options = None
  _globals['_BID'].fields_by_name['total_usomm_paid']._serialized_options = b'\310\336\037\000'
  _globals['_TOKENPRICE'].fields_by_name['usd_price']._options = None
  _globals['_TOKENPRICE'].fields_by_name['usd_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PROPOSEDTOKENPRICE'].fields_by_name['usd_price']._options = None
  _globals['_PROPOSEDTOKENPRICE'].fields_by_name['usd_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AUCTION']._serialized_start=132
  _globals['_AUCTION']._serialized_end=1020
  _globals['_BID']._serialized_start=1023
  _globals['_BID']._serialized_end=1586
  _globals['_TOKENPRICE']._serialized_start=1589
  _globals['_TOKENPRICE']._serialized_end=1746
  _globals['_PROPOSEDTOKENPRICE']._serialized_start=1748
  _globals['_PROPOSEDTOKENPRICE']._serialized_end=1867
# @@protoc_insertion_point(module_scope)
