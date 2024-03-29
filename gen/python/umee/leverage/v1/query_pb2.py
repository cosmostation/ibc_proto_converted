# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: umee/leverage/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from umee.leverage.v1 import genesis_pb2 as umee_dot_leverage_dot_v1_dot_genesis__pb2
from umee.leverage.v1 import leverage_pb2 as umee_dot_leverage_dot_v1_dot_leverage__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cumee/leverage/v1/query.proto\x12\x10umee.leverage.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x1eumee/leverage/v1/genesis.proto\x1a\x1fumee/leverage/v1/leverage.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\r\n\x0bQueryParams\"M\n\x13QueryParamsResponse\x12\x36\n\x06params\x18\x01 \x01(\x0b\x32\x18.umee.leverage.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"6\n\x15QueryRegisteredTokens\x12\x1d\n\nbase_denom\x18\x01 \x01(\tR\tbaseDenom\"Z\n\x1dQueryRegisteredTokensResponse\x12\x39\n\x08registry\x18\x01 \x03(\x0b\x32\x17.umee.leverage.v1.TokenB\x04\xc8\xde\x1f\x00R\x08registry\"*\n\x12QueryMarketSummary\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"\xfc\x0c\n\x1aQueryMarketSummaryResponse\x12!\n\x0csymbol_denom\x18\x01 \x01(\tR\x0bsymbolDenom\x12\x1a\n\x08\x65xponent\x18\x02 \x01(\rR\x08\x65xponent\x12Q\n\x0coracle_price\x18\x03 \x01(\tB.\xc8\xde\x1f\x01\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0boraclePrice\x12x\n\x14uToken_exchange_rate\x18\x04 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xea\xde\x1f\x14utoken_exchange_rateR\x12uTokenExchangeRate\x12[\n\nsupply_APY\x18\x05 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xea\xde\x1f\nsupply_apyR\tsupplyAPY\x12[\n\nborrow_APY\x18\x06 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xea\xde\x1f\nborrow_apyR\tborrowAPY\x12J\n\x08supplied\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08supplied\x12J\n\x08reserved\x18\x08 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08reserved\x12N\n\ncollateral\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\ncollateral\x12J\n\x08\x62orrowed\x18\n \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08\x62orrowed\x12L\n\tliquidity\x18\x0b \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\tliquidity\x12U\n\x0emaximum_borrow\x18\x0c \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rmaximumBorrow\x12]\n\x12maximum_collateral\x18\r \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11maximumCollateral\x12[\n\x11minimum_liquidity\x18\x0e \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x10minimumLiquidity\x12\x64\n\ruToken_supply\x18\x0f \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xea\xde\x1f\rutoken_supplyR\x0cuTokenSupply\x12Y\n\x10\x61vailable_borrow\x18\x10 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0f\x61vailableBorrow\x12]\n\x12\x61vailable_withdraw\x18\x11 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11\x61vailableWithdraw\x12g\n\x17\x61vailable_collateralize\x18\x12 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x16\x61vailableCollateralize\x12\x62\n\x15oracle_historic_price\x18\x13 \x01(\tB.\xc8\xde\x1f\x01\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x13oracleHistoricPrice\x12\x16\n\x06\x65rrors\x18\x14 \x01(\tR\x06\x65rrors\"0\n\x14QueryAccountBalances\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"\xdd\x02\n\x1cQueryAccountBalancesResponse\x12g\n\x08supplied\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x08supplied\x12k\n\ncollateral\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\ncollateral\x12g\n\x08\x62orrowed\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x08\x62orrowed\"/\n\x13QueryAccountSummary\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"\xde\x03\n\x1bQueryAccountSummaryResponse\x12U\n\x0esupplied_value\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\rsuppliedValue\x12Y\n\x10\x63ollateral_value\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0f\x63ollateralValue\x12U\n\x0e\x62orrowed_value\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\rborrowedValue\x12Q\n\x0c\x62orrow_limit\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0b\x62orrowLimit\x12\x63\n\x15liquidation_threshold\x18\x05 \x01(\tB.\xc8\xde\x1f\x01\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x14liquidationThreshold\"\x19\n\x17QueryLiquidationTargets\";\n\x1fQueryLiquidationTargetsResponse\x12\x18\n\x07targets\x18\x01 \x03(\tR\x07targets\"\x0f\n\rQueryBadDebts\"R\n\x15QueryBadDebtsResponse\x12\x39\n\x07targets\x18\x01 \x03(\x0b\x32\x19.umee.leverage.v1.BadDebtB\x04\xc8\xde\x1f\x00R\x07targets\"B\n\x10QueryMaxWithdraw\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"\xe6\x01\n\x18QueryMaxWithdrawResponse\x12\x65\n\x07uTokens\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07uTokens\x12\x63\n\x06tokens\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06tokens\"@\n\x0eQueryMaxBorrow\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"}\n\x16QueryMaxBorrowResponse\x12\x63\n\x06tokens\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06tokens2\xf7\t\n\x05Query\x12p\n\x06Params\x12\x1d.umee.leverage.v1.QueryParams\x1a%.umee.leverage.v1.QueryParamsResponse\" \x82\xd3\xe4\x93\x02\x1a\x12\x18/umee/leverage/v1/params\x12\x99\x01\n\x10RegisteredTokens\x12\'.umee.leverage.v1.QueryRegisteredTokens\x1a/.umee.leverage.v1.QueryRegisteredTokensResponse\"+\x82\xd3\xe4\x93\x02%\x12#/umee/leverage/v1/registered_tokens\x12\x8d\x01\n\rMarketSummary\x12$.umee.leverage.v1.QueryMarketSummary\x1a,.umee.leverage.v1.QueryMarketSummaryResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /umee/leverage/v1/market_summary\x12\x95\x01\n\x0f\x41\x63\x63ountBalances\x12&.umee.leverage.v1.QueryAccountBalances\x1a..umee.leverage.v1.QueryAccountBalancesResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/umee/leverage/v1/account_balances\x12\x91\x01\n\x0e\x41\x63\x63ountSummary\x12%.umee.leverage.v1.QueryAccountSummary\x1a-.umee.leverage.v1.QueryAccountSummaryResponse\")\x82\xd3\xe4\x93\x02#\x12!/umee/leverage/v1/account_summary\x12\xa1\x01\n\x12LiquidationTargets\x12).umee.leverage.v1.QueryLiquidationTargets\x1a\x31.umee.leverage.v1.QueryLiquidationTargetsResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/umee/leverage/v1/liquidation_targets\x12y\n\x08\x42\x61\x64\x44\x65\x62ts\x12\x1f.umee.leverage.v1.QueryBadDebts\x1a\'.umee.leverage.v1.QueryBadDebtsResponse\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/umee/leverage/v1/bad_debts\x12\x85\x01\n\x0bMaxWithdraw\x12\".umee.leverage.v1.QueryMaxWithdraw\x1a*.umee.leverage.v1.QueryMaxWithdrawResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/umee/leverage/v1/max_withdraw\x12}\n\tMaxBorrow\x12 .umee.leverage.v1.QueryMaxBorrow\x1a(.umee.leverage.v1.QueryMaxBorrowResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/umee/leverage/v1/max_borrowB\xb8\x01\n\x14\x63om.umee.leverage.v1B\nQueryProtoZ0github.com/umee-network/umee/v5/x/leverage/types\xa2\x02\x03ULX\xaa\x02\x10Umee.Leverage.V1\xca\x02\x10Umee\\Leverage\\V1\xe2\x02\x1cUmee\\Leverage\\V1\\GPBMetadata\xea\x02\x12Umee::Leverage::V1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'umee.leverage.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.umee.leverage.v1B\nQueryProtoZ0github.com/umee-network/umee/v5/x/leverage/types\242\002\003ULX\252\002\020Umee.Leverage.V1\312\002\020Umee\\Leverage\\V1\342\002\034Umee\\Leverage\\V1\\GPBMetadata\352\002\022Umee::Leverage::V1\310\341\036\000'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYREGISTEREDTOKENSRESPONSE'].fields_by_name['registry']._options = None
  _globals['_QUERYREGISTEREDTOKENSRESPONSE'].fields_by_name['registry']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['oracle_price']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['oracle_price']._serialized_options = b'\310\336\037\001\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['uToken_exchange_rate']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['uToken_exchange_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\352\336\037\024utoken_exchange_rate'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['supply_APY']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['supply_APY']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\352\336\037\nsupply_apy'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['borrow_APY']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['borrow_APY']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\352\336\037\nborrow_apy'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['supplied']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['supplied']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['reserved']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['reserved']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['collateral']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['borrowed']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['borrowed']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['liquidity']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['liquidity']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['maximum_borrow']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['maximum_borrow']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['maximum_collateral']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['maximum_collateral']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['minimum_liquidity']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['minimum_liquidity']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['uToken_supply']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['uToken_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\352\336\037\rutoken_supply'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_borrow']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_borrow']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_withdraw']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_withdraw']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_collateralize']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['available_collateralize']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['oracle_historic_price']._options = None
  _globals['_QUERYMARKETSUMMARYRESPONSE'].fields_by_name['oracle_historic_price']._serialized_options = b'\310\336\037\001\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['supplied']._options = None
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['supplied']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['collateral']._options = None
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['borrowed']._options = None
  _globals['_QUERYACCOUNTBALANCESRESPONSE'].fields_by_name['borrowed']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['supplied_value']._options = None
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['supplied_value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['collateral_value']._options = None
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['collateral_value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['borrowed_value']._options = None
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['borrowed_value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['borrow_limit']._options = None
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['borrow_limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['liquidation_threshold']._options = None
  _globals['_QUERYACCOUNTSUMMARYRESPONSE'].fields_by_name['liquidation_threshold']._serialized_options = b'\310\336\037\001\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_QUERYBADDEBTSRESPONSE'].fields_by_name['targets']._options = None
  _globals['_QUERYBADDEBTSRESPONSE'].fields_by_name['targets']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYMAXWITHDRAWRESPONSE'].fields_by_name['uTokens']._options = None
  _globals['_QUERYMAXWITHDRAWRESPONSE'].fields_by_name['uTokens']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYMAXWITHDRAWRESPONSE'].fields_by_name['tokens']._options = None
  _globals['_QUERYMAXWITHDRAWRESPONSE'].fields_by_name['tokens']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYMAXBORROWRESPONSE'].fields_by_name['tokens']._options = None
  _globals['_QUERYMAXBORROWRESPONSE'].fields_by_name['tokens']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\032\022\030/umee/leverage/v1/params'
  _globals['_QUERY'].methods_by_name['RegisteredTokens']._options = None
  _globals['_QUERY'].methods_by_name['RegisteredTokens']._serialized_options = b'\202\323\344\223\002%\022#/umee/leverage/v1/registered_tokens'
  _globals['_QUERY'].methods_by_name['MarketSummary']._options = None
  _globals['_QUERY'].methods_by_name['MarketSummary']._serialized_options = b'\202\323\344\223\002\"\022 /umee/leverage/v1/market_summary'
  _globals['_QUERY'].methods_by_name['AccountBalances']._options = None
  _globals['_QUERY'].methods_by_name['AccountBalances']._serialized_options = b'\202\323\344\223\002$\022\"/umee/leverage/v1/account_balances'
  _globals['_QUERY'].methods_by_name['AccountSummary']._options = None
  _globals['_QUERY'].methods_by_name['AccountSummary']._serialized_options = b'\202\323\344\223\002#\022!/umee/leverage/v1/account_summary'
  _globals['_QUERY'].methods_by_name['LiquidationTargets']._options = None
  _globals['_QUERY'].methods_by_name['LiquidationTargets']._serialized_options = b'\202\323\344\223\002\'\022%/umee/leverage/v1/liquidation_targets'
  _globals['_QUERY'].methods_by_name['BadDebts']._options = None
  _globals['_QUERY'].methods_by_name['BadDebts']._serialized_options = b'\202\323\344\223\002\035\022\033/umee/leverage/v1/bad_debts'
  _globals['_QUERY'].methods_by_name['MaxWithdraw']._options = None
  _globals['_QUERY'].methods_by_name['MaxWithdraw']._serialized_options = b'\202\323\344\223\002 \022\036/umee/leverage/v1/max_withdraw'
  _globals['_QUERY'].methods_by_name['MaxBorrow']._options = None
  _globals['_QUERY'].methods_by_name['MaxBorrow']._serialized_options = b'\202\323\344\223\002\036\022\034/umee/leverage/v1/max_borrow'
  _globals['_QUERYPARAMS']._serialized_start=199
  _globals['_QUERYPARAMS']._serialized_end=212
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=214
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=291
  _globals['_QUERYREGISTEREDTOKENS']._serialized_start=293
  _globals['_QUERYREGISTEREDTOKENS']._serialized_end=347
  _globals['_QUERYREGISTEREDTOKENSRESPONSE']._serialized_start=349
  _globals['_QUERYREGISTEREDTOKENSRESPONSE']._serialized_end=439
  _globals['_QUERYMARKETSUMMARY']._serialized_start=441
  _globals['_QUERYMARKETSUMMARY']._serialized_end=483
  _globals['_QUERYMARKETSUMMARYRESPONSE']._serialized_start=486
  _globals['_QUERYMARKETSUMMARYRESPONSE']._serialized_end=2146
  _globals['_QUERYACCOUNTBALANCES']._serialized_start=2148
  _globals['_QUERYACCOUNTBALANCES']._serialized_end=2196
  _globals['_QUERYACCOUNTBALANCESRESPONSE']._serialized_start=2199
  _globals['_QUERYACCOUNTBALANCESRESPONSE']._serialized_end=2548
  _globals['_QUERYACCOUNTSUMMARY']._serialized_start=2550
  _globals['_QUERYACCOUNTSUMMARY']._serialized_end=2597
  _globals['_QUERYACCOUNTSUMMARYRESPONSE']._serialized_start=2600
  _globals['_QUERYACCOUNTSUMMARYRESPONSE']._serialized_end=3078
  _globals['_QUERYLIQUIDATIONTARGETS']._serialized_start=3080
  _globals['_QUERYLIQUIDATIONTARGETS']._serialized_end=3105
  _globals['_QUERYLIQUIDATIONTARGETSRESPONSE']._serialized_start=3107
  _globals['_QUERYLIQUIDATIONTARGETSRESPONSE']._serialized_end=3166
  _globals['_QUERYBADDEBTS']._serialized_start=3168
  _globals['_QUERYBADDEBTS']._serialized_end=3183
  _globals['_QUERYBADDEBTSRESPONSE']._serialized_start=3185
  _globals['_QUERYBADDEBTSRESPONSE']._serialized_end=3267
  _globals['_QUERYMAXWITHDRAW']._serialized_start=3269
  _globals['_QUERYMAXWITHDRAW']._serialized_end=3335
  _globals['_QUERYMAXWITHDRAWRESPONSE']._serialized_start=3338
  _globals['_QUERYMAXWITHDRAWRESPONSE']._serialized_end=3568
  _globals['_QUERYMAXBORROW']._serialized_start=3570
  _globals['_QUERYMAXBORROW']._serialized_end=3634
  _globals['_QUERYMAXBORROWRESPONSE']._serialized_start=3636
  _globals['_QUERYMAXBORROWRESPONSE']._serialized_end=3761
  _globals['_QUERY']._serialized_start=3764
  _globals['_QUERY']._serialized_end=5035
# @@protoc_insertion_point(module_scope)
