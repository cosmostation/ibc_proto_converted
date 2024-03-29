# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/liquidity/v1beta1/liquidity.proto
# Protobuf Python Version: 4.25.2
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(comdex/liquidity/v1beta1/liquidity.proto\x12\x18\x63omdex.liquidity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfc\x02\n\x04Pair\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12&\n\x0f\x62\x61se_coin_denom\x18\x02 \x01(\tR\rbaseCoinDenom\x12(\n\x10quote_coin_denom\x18\x03 \x01(\tR\x0equoteCoinDenom\x12%\n\x0e\x65scrow_address\x18\x04 \x01(\tR\rescrowAddress\x12\"\n\rlast_order_id\x18\x05 \x01(\x04R\x0blastOrderId\x12I\n\nlast_price\x18\x06 \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tlastPrice\x12(\n\x10\x63urrent_batch_id\x18\x07 \x01(\x04R\x0e\x63urrentBatchId\x12;\n\x1aswap_fee_collector_address\x18\x08 \x01(\tR\x17swapFeeCollectorAddress\x12\x15\n\x06\x61pp_id\x18\t \x01(\x04R\x05\x61ppId\"\x87\x04\n\x04Pool\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\'\n\x0freserve_address\x18\x03 \x01(\tR\x0ereserveAddress\x12&\n\x0fpool_coin_denom\x18\x04 \x01(\tR\rpoolCoinDenom\x12\x35\n\x17last_deposit_request_id\x18\x05 \x01(\x04R\x14lastDepositRequestId\x12\x37\n\x18last_withdraw_request_id\x18\x06 \x01(\x04R\x15lastWithdrawRequestId\x12\x1a\n\x08\x64isabled\x18\x07 \x01(\x08R\x08\x64isabled\x12\x15\n\x06\x61pp_id\x18\x08 \x01(\x04R\x05\x61ppId\x12\x36\n\x04type\x18\t \x01(\x0e\x32\".comdex.liquidity.v1beta1.PoolTypeR\x04type\x12\x18\n\x07\x63reator\x18\n \x01(\tR\x07\x63reator\x12G\n\tmin_price\x18\x0b \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08minPrice\x12G\n\tmax_price\x18\x0c \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08maxPrice\"\xff\x03\n\x0e\x44\x65positRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x1d\n\nmsg_height\x18\x03 \x01(\x03R\tmsgHeight\x12\x1c\n\tdepositor\x18\x04 \x01(\tR\tdepositor\x12p\n\rdeposit_coins\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0c\x64\x65positCoins\x12r\n\x0e\x61\x63\x63\x65pted_coins\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\racceptedCoins\x12I\n\x10minted_pool_coin\x18\x07 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0emintedPoolCoin\x12?\n\x06status\x18\x08 \x01(\x0e\x32\'.comdex.liquidity.v1beta1.RequestStatusR\x06status\x12\x15\n\x06\x61pp_id\x18\t \x01(\x04R\x05\x61ppId\"\x85\x03\n\x0fWithdrawRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x1d\n\nmsg_height\x18\x03 \x01(\x03R\tmsgHeight\x12\x1e\n\nwithdrawer\x18\x04 \x01(\tR\nwithdrawer\x12<\n\tpool_coin\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08poolCoin\x12t\n\x0fwithdrawn_coins\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0ewithdrawnCoins\x12?\n\x06status\x18\x07 \x01(\x0e\x32\'.comdex.liquidity.v1beta1.RequestStatusR\x06status\x12\x15\n\x06\x61pp_id\x18\x08 \x01(\x04R\x05\x61ppId\"\xd6\x06\n\x05Order\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x1d\n\nmsg_height\x18\x03 \x01(\x03R\tmsgHeight\x12\x18\n\x07orderer\x18\x04 \x01(\tR\x07orderer\x12\x46\n\tdirection\x18\x05 \x01(\x0e\x32(.comdex.liquidity.v1beta1.OrderDirectionR\tdirection\x12>\n\noffer_coin\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tofferCoin\x12Q\n\x14remaining_offer_coin\x18\x07 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x12remainingOfferCoin\x12\x44\n\rreceived_coin\x18\x08 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0creceivedCoin\x12\x44\n\x05price\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05price\x12\x46\n\x06\x61mount\x18\n \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12O\n\x0bopen_amount\x18\x0b \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\nopenAmount\x12\x19\n\x08\x62\x61tch_id\x18\x0c \x01(\x04R\x07\x62\x61tchId\x12\x41\n\texpire_at\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x08\x65xpireAt\x12=\n\x06status\x18\x0e \x01(\x0e\x32%.comdex.liquidity.v1beta1.OrderStatusR\x06status\x12\x15\n\x06\x61pp_id\x18\x0f \x01(\x04R\x05\x61ppId\x12\x37\n\x04type\x18\x10 \x01(\x0e\x32#.comdex.liquidity.v1beta1.OrderTypeR\x04type\"u\n\x0cMMOrderIndex\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pair_id\x18\x03 \x01(\x04R\x06pairId\x12\x1b\n\torder_ids\x18\x04 \x03(\x04R\x08orderIds\"\xcc\x01\n\x0c\x41\x63tiveFarmer\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\x12t\n\x10\x66\x61rmed_pool_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0e\x66\x61rmedPoolCoin\"\xdc\x01\n\nQueuedCoin\x12t\n\x10\x66\x61rmed_pool_coin\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0e\x66\x61rmedPoolCoin\x12X\n\ncreated_at\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"created_at\"\x90\xdf\x1f\x01R\tcreatedAt\"\x9d\x01\n\x0cQueuedFarmer\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\x12\x45\n\x0bqueud_coins\x18\x04 \x03(\x0b\x32$.comdex.liquidity.v1beta1.QueuedCoinR\nqueudCoins*\x96\x01\n\x08PoolType\x12\x32\n\x15POOL_TYPE_UNSPECIFIED\x10\x00\x1a\x17\x8a\x9d \x13PoolTypeUnspecified\x12&\n\x0fPOOL_TYPE_BASIC\x10\x01\x1a\x11\x8a\x9d \rPoolTypeBasic\x12(\n\x10POOL_TYPE_RANGED\x10\x02\x1a\x12\x8a\x9d \x0ePoolTypeRanged\x1a\x04\x88\xa3\x1e\x00*\xc1\x01\n\tOrderType\x12\x34\n\x16ORDER_TYPE_UNSPECIFIED\x10\x00\x1a\x18\x8a\x9d \x14OrderTypeUnspecified\x12(\n\x10ORDER_TYPE_LIMIT\x10\x01\x1a\x12\x8a\x9d \x0eOrderTypeLimit\x12*\n\x11ORDER_TYPE_MARKET\x10\x02\x1a\x13\x8a\x9d \x0fOrderTypeMarket\x12\"\n\rORDER_TYPE_MM\x10\x03\x1a\x0f\x8a\x9d \x0bOrderTypeMM\x1a\x04\x88\xa3\x1e\x00*\xb8\x01\n\x0eOrderDirection\x12>\n\x1bORDER_DIRECTION_UNSPECIFIED\x10\x00\x1a\x1d\x8a\x9d \x19OrderDirectionUnspecified\x12.\n\x13ORDER_DIRECTION_BUY\x10\x01\x1a\x15\x8a\x9d \x11OrderDirectionBuy\x12\x30\n\x14ORDER_DIRECTION_SELL\x10\x02\x1a\x16\x8a\x9d \x12OrderDirectionSell\x1a\x04\x88\xa3\x1e\x00*\x80\x02\n\rRequestStatus\x12<\n\x1aREQUEST_STATUS_UNSPECIFIED\x10\x00\x1a\x1c\x8a\x9d \x18RequestStatusUnspecified\x12=\n\x1bREQUEST_STATUS_NOT_EXECUTED\x10\x01\x1a\x1c\x8a\x9d \x18RequestStatusNotExecuted\x12\x38\n\x18REQUEST_STATUS_SUCCEEDED\x10\x02\x1a\x1a\x8a\x9d \x16RequestStatusSucceeded\x12\x32\n\x15REQUEST_STATUS_FAILED\x10\x03\x1a\x17\x8a\x9d \x13RequestStatusFailed\x1a\x04\x88\xa3\x1e\x00*\xa2\x03\n\x0bOrderStatus\x12\x38\n\x18ORDER_STATUS_UNSPECIFIED\x10\x00\x1a\x1a\x8a\x9d \x16OrderStatusUnspecified\x12\x39\n\x19ORDER_STATUS_NOT_EXECUTED\x10\x01\x1a\x1a\x8a\x9d \x16OrderStatusNotExecuted\x12\x37\n\x18ORDER_STATUS_NOT_MATCHED\x10\x02\x1a\x19\x8a\x9d \x15OrderStatusNotMatched\x12\x43\n\x1eORDER_STATUS_PARTIALLY_MATCHED\x10\x03\x1a\x1f\x8a\x9d \x1bOrderStatusPartiallyMatched\x12\x34\n\x16ORDER_STATUS_COMPLETED\x10\x04\x1a\x18\x8a\x9d \x14OrderStatusCompleted\x12\x32\n\x15ORDER_STATUS_CANCELED\x10\x05\x1a\x17\x8a\x9d \x13OrderStatusCanceled\x12\x30\n\x14ORDER_STATUS_EXPIRED\x10\x06\x1a\x16\x8a\x9d \x12OrderStatusExpired\x1a\x04\x88\xa3\x1e\x00*y\n\x0b\x41\x64\x64ressType\x12\x31\n\x15\x41\x44\x44RESS_TYPE_32_BYTES\x10\x00\x1a\x16\x8a\x9d \x12\x41\x64\x64ressType32Bytes\x12\x31\n\x15\x41\x44\x44RESS_TYPE_20_BYTES\x10\x01\x1a\x16\x8a\x9d \x12\x41\x64\x64ressType20Bytes\x1a\x04\x88\xa3\x1e\x00\x42\xe7\x01\n\x1c\x63om.comdex.liquidity.v1beta1B\x0eLiquidityProtoZ3github.com/comdex-official/comdex/x/liquidity/types\xa2\x02\x03\x43LX\xaa\x02\x18\x43omdex.Liquidity.V1beta1\xca\x02\x18\x43omdex\\Liquidity\\V1beta1\xe2\x02$Comdex\\Liquidity\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Liquidity::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.liquidity.v1beta1.liquidity_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.comdex.liquidity.v1beta1B\016LiquidityProtoZ3github.com/comdex-official/comdex/x/liquidity/types\242\002\003CLX\252\002\030Comdex.Liquidity.V1beta1\312\002\030Comdex\\Liquidity\\V1beta1\342\002$Comdex\\Liquidity\\V1beta1\\GPBMetadata\352\002\032Comdex::Liquidity::V1beta1\310\341\036\000'
  _globals['_POOLTYPE']._options = None
  _globals['_POOLTYPE']._serialized_options = b'\210\243\036\000'
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_UNSPECIFIED"]._options = None
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \023PoolTypeUnspecified'
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_BASIC"]._options = None
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_BASIC"]._serialized_options = b'\212\235 \rPoolTypeBasic'
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_RANGED"]._options = None
  _globals['_POOLTYPE'].values_by_name["POOL_TYPE_RANGED"]._serialized_options = b'\212\235 \016PoolTypeRanged'
  _globals['_ORDERTYPE']._options = None
  _globals['_ORDERTYPE']._serialized_options = b'\210\243\036\000'
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_UNSPECIFIED"]._options = None
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \024OrderTypeUnspecified'
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_LIMIT"]._options = None
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_LIMIT"]._serialized_options = b'\212\235 \016OrderTypeLimit'
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_MARKET"]._options = None
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_MARKET"]._serialized_options = b'\212\235 \017OrderTypeMarket'
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_MM"]._options = None
  _globals['_ORDERTYPE'].values_by_name["ORDER_TYPE_MM"]._serialized_options = b'\212\235 \013OrderTypeMM'
  _globals['_ORDERDIRECTION']._options = None
  _globals['_ORDERDIRECTION']._serialized_options = b'\210\243\036\000'
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_UNSPECIFIED"]._options = None
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_UNSPECIFIED"]._serialized_options = b'\212\235 \031OrderDirectionUnspecified'
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_BUY"]._options = None
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_BUY"]._serialized_options = b'\212\235 \021OrderDirectionBuy'
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_SELL"]._options = None
  _globals['_ORDERDIRECTION'].values_by_name["ORDER_DIRECTION_SELL"]._serialized_options = b'\212\235 \022OrderDirectionSell'
  _globals['_REQUESTSTATUS']._options = None
  _globals['_REQUESTSTATUS']._serialized_options = b'\210\243\036\000'
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_UNSPECIFIED"]._options = None
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \030RequestStatusUnspecified'
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_NOT_EXECUTED"]._options = None
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_NOT_EXECUTED"]._serialized_options = b'\212\235 \030RequestStatusNotExecuted'
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_SUCCEEDED"]._options = None
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_SUCCEEDED"]._serialized_options = b'\212\235 \026RequestStatusSucceeded'
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_FAILED"]._options = None
  _globals['_REQUESTSTATUS'].values_by_name["REQUEST_STATUS_FAILED"]._serialized_options = b'\212\235 \023RequestStatusFailed'
  _globals['_ORDERSTATUS']._options = None
  _globals['_ORDERSTATUS']._serialized_options = b'\210\243\036\000'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_UNSPECIFIED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \026OrderStatusUnspecified'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_NOT_EXECUTED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_NOT_EXECUTED"]._serialized_options = b'\212\235 \026OrderStatusNotExecuted'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_NOT_MATCHED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_NOT_MATCHED"]._serialized_options = b'\212\235 \025OrderStatusNotMatched'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_PARTIALLY_MATCHED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_PARTIALLY_MATCHED"]._serialized_options = b'\212\235 \033OrderStatusPartiallyMatched'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_COMPLETED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_COMPLETED"]._serialized_options = b'\212\235 \024OrderStatusCompleted'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_CANCELED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_CANCELED"]._serialized_options = b'\212\235 \023OrderStatusCanceled'
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_EXPIRED"]._options = None
  _globals['_ORDERSTATUS'].values_by_name["ORDER_STATUS_EXPIRED"]._serialized_options = b'\212\235 \022OrderStatusExpired'
  _globals['_ADDRESSTYPE']._options = None
  _globals['_ADDRESSTYPE']._serialized_options = b'\210\243\036\000'
  _globals['_ADDRESSTYPE'].values_by_name["ADDRESS_TYPE_32_BYTES"]._options = None
  _globals['_ADDRESSTYPE'].values_by_name["ADDRESS_TYPE_32_BYTES"]._serialized_options = b'\212\235 \022AddressType32Bytes'
  _globals['_ADDRESSTYPE'].values_by_name["ADDRESS_TYPE_20_BYTES"]._options = None
  _globals['_ADDRESSTYPE'].values_by_name["ADDRESS_TYPE_20_BYTES"]._serialized_options = b'\212\235 \022AddressType20Bytes'
  _globals['_PAIR'].fields_by_name['last_price']._options = None
  _globals['_PAIR'].fields_by_name['last_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_POOL'].fields_by_name['min_price']._options = None
  _globals['_POOL'].fields_by_name['min_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_POOL'].fields_by_name['max_price']._options = None
  _globals['_POOL'].fields_by_name['max_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_DEPOSITREQUEST'].fields_by_name['deposit_coins']._options = None
  _globals['_DEPOSITREQUEST'].fields_by_name['deposit_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_DEPOSITREQUEST'].fields_by_name['accepted_coins']._options = None
  _globals['_DEPOSITREQUEST'].fields_by_name['accepted_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_DEPOSITREQUEST'].fields_by_name['minted_pool_coin']._options = None
  _globals['_DEPOSITREQUEST'].fields_by_name['minted_pool_coin']._serialized_options = b'\310\336\037\000'
  _globals['_WITHDRAWREQUEST'].fields_by_name['pool_coin']._options = None
  _globals['_WITHDRAWREQUEST'].fields_by_name['pool_coin']._serialized_options = b'\310\336\037\000'
  _globals['_WITHDRAWREQUEST'].fields_by_name['withdrawn_coins']._options = None
  _globals['_WITHDRAWREQUEST'].fields_by_name['withdrawn_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_ORDER'].fields_by_name['offer_coin']._options = None
  _globals['_ORDER'].fields_by_name['offer_coin']._serialized_options = b'\310\336\037\000'
  _globals['_ORDER'].fields_by_name['remaining_offer_coin']._options = None
  _globals['_ORDER'].fields_by_name['remaining_offer_coin']._serialized_options = b'\310\336\037\000'
  _globals['_ORDER'].fields_by_name['received_coin']._options = None
  _globals['_ORDER'].fields_by_name['received_coin']._serialized_options = b'\310\336\037\000'
  _globals['_ORDER'].fields_by_name['price']._options = None
  _globals['_ORDER'].fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_ORDER'].fields_by_name['amount']._options = None
  _globals['_ORDER'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_ORDER'].fields_by_name['open_amount']._options = None
  _globals['_ORDER'].fields_by_name['open_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_ORDER'].fields_by_name['expire_at']._options = None
  _globals['_ORDER'].fields_by_name['expire_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_ACTIVEFARMER'].fields_by_name['farmed_pool_coin']._options = None
  _globals['_ACTIVEFARMER'].fields_by_name['farmed_pool_coin']._serialized_options = b'\310\336\037\000\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUEUEDCOIN'].fields_by_name['farmed_pool_coin']._options = None
  _globals['_QUEUEDCOIN'].fields_by_name['farmed_pool_coin']._serialized_options = b'\310\336\037\000\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_QUEUEDCOIN'].fields_by_name['created_at']._options = None
  _globals['_QUEUEDCOIN'].fields_by_name['created_at']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"created_at\"\220\337\037\001'
  _globals['_POOLTYPE']._serialized_start=3535
  _globals['_POOLTYPE']._serialized_end=3685
  _globals['_ORDERTYPE']._serialized_start=3688
  _globals['_ORDERTYPE']._serialized_end=3881
  _globals['_ORDERDIRECTION']._serialized_start=3884
  _globals['_ORDERDIRECTION']._serialized_end=4068
  _globals['_REQUESTSTATUS']._serialized_start=4071
  _globals['_REQUESTSTATUS']._serialized_end=4327
  _globals['_ORDERSTATUS']._serialized_start=4330
  _globals['_ORDERSTATUS']._serialized_end=4748
  _globals['_ADDRESSTYPE']._serialized_start=4750
  _globals['_ADDRESSTYPE']._serialized_end=4871
  _globals['_PAIR']._serialized_start=158
  _globals['_PAIR']._serialized_end=538
  _globals['_POOL']._serialized_start=541
  _globals['_POOL']._serialized_end=1060
  _globals['_DEPOSITREQUEST']._serialized_start=1063
  _globals['_DEPOSITREQUEST']._serialized_end=1574
  _globals['_WITHDRAWREQUEST']._serialized_start=1577
  _globals['_WITHDRAWREQUEST']._serialized_end=1966
  _globals['_ORDER']._serialized_start=1969
  _globals['_ORDER']._serialized_end=2823
  _globals['_MMORDERINDEX']._serialized_start=2825
  _globals['_MMORDERINDEX']._serialized_end=2942
  _globals['_ACTIVEFARMER']._serialized_start=2945
  _globals['_ACTIVEFARMER']._serialized_end=3149
  _globals['_QUEUEDCOIN']._serialized_start=3152
  _globals['_QUEUEDCOIN']._serialized_end=3372
  _globals['_QUEUEDFARMER']._serialized_start=3375
  _globals['_QUEUEDFARMER']._serialized_end=3532
# @@protoc_insertion_point(module_scope)
