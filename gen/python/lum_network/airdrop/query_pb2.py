# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/airdrop/query.proto
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
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from lum_network.airdrop import claim_pb2 as lum__network_dot_airdrop_dot_claim__pb2
from lum_network.airdrop import params_pb2 as lum__network_dot_airdrop_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1flum-network/airdrop/query.proto\x12\x13lum.network.airdrop\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1flum-network/airdrop/claim.proto\x1a lum-network/airdrop/params.proto\"\"\n QueryModuleAccountBalanceRequest\"\xb5\x01\n!QueryModuleAccountBalanceResponse\x12\x8f\x01\n\x14moduleAccountBalance\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB@\xc8\xde\x1f\x00\xf2\xde\x1f\x0cyaml:\"coins\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x14moduleAccountBalance\"\x14\n\x12QueryParamsRequest\"P\n\x13QueryParamsResponse\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.lum.network.airdrop.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"F\n\x17QueryClaimRecordRequest\x12+\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x07\x61\x64\x64ress\"|\n\x18QueryClaimRecordResponse\x12`\n\x0c\x63laim_record\x18\x01 \x01(\x0b\x32 .lum.network.airdrop.ClaimRecordB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"claim_record\"R\x0b\x63laimRecord\"\x96\x01\n\x1eQueryClaimableForActionRequest\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12\x46\n\x06\x61\x63tion\x18\x02 \x01(\x0e\x32\x1b.lum.network.airdrop.ActionB\x11\xf2\xde\x1f\ryaml:\"action\"R\x06\x61\x63tion\"\x94\x01\n\x1fQueryClaimableForActionResponse\x12q\n\x05\x63oins\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB@\xc8\xde\x1f\x00\xf2\xde\x1f\x0cyaml:\"coins\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins\"J\n\x1aQueryTotalClaimableRequest\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\"\x90\x01\n\x1bQueryTotalClaimableResponse\x12q\n\x05\x63oins\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB@\xc8\xde\x1f\x00\xf2\xde\x1f\x0cyaml:\"coins\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins2\xe9\x06\n\x05Query\x12\xbc\x01\n\x14ModuleAccountBalance\x12\x35.lum.network.airdrop.QueryModuleAccountBalanceRequest\x1a\x36.lum.network.airdrop.QueryModuleAccountBalanceResponse\"5\x82\xd3\xe4\x93\x02/\x12-/osmosis/claim/v1beta1/module_account_balance\x12\x82\x01\n\x06Params\x12\'.lum.network.airdrop.QueryParamsRequest\x1a(.lum.network.airdrop.QueryParamsResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/osmosis/claim/v1beta1/params\x12\xa1\x01\n\x0b\x43laimRecord\x12,.lum.network.airdrop.QueryClaimRecordRequest\x1a-.lum.network.airdrop.QueryClaimRecordResponse\"5\x82\xd3\xe4\x93\x02/\x12-/osmosis/claim/v1beta1/claim_record/{address}\x12\xc7\x01\n\x12\x43laimableForAction\x12\x33.lum.network.airdrop.QueryClaimableForActionRequest\x1a\x34.lum.network.airdrop.QueryClaimableForActionResponse\"F\x82\xd3\xe4\x93\x02@\x12>/osmosis/claim/v1beta1/claimable_for_action/{address}/{action}\x12\xad\x01\n\x0eTotalClaimable\x12/.lum.network.airdrop.QueryTotalClaimableRequest\x1a\x30.lum.network.airdrop.QueryTotalClaimableResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/osmosis/claim/v1beta1/total_claimable/{address}B\xbf\x01\n\x17\x63om.lum.network.airdropB\nQueryProtoZ,github.com/lum-network/chain/x/airdrop/types\xa2\x02\x03LNA\xaa\x02\x13Lum.Network.Airdrop\xca\x02\x13Lum\\Network\\Airdrop\xe2\x02\x1fLum\\Network\\Airdrop\\GPBMetadata\xea\x02\x15Lum::Network::Airdropb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.airdrop.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.lum.network.airdropB\nQueryProtoZ,github.com/lum-network/chain/x/airdrop/types\242\002\003LNA\252\002\023Lum.Network.Airdrop\312\002\023Lum\\Network\\Airdrop\342\002\037Lum\\Network\\Airdrop\\GPBMetadata\352\002\025Lum::Network::Airdrop'
  _globals['_QUERYMODULEACCOUNTBALANCERESPONSE'].fields_by_name['moduleAccountBalance']._options = None
  _globals['_QUERYMODULEACCOUNTBALANCERESPONSE'].fields_by_name['moduleAccountBalance']._serialized_options = b'\310\336\037\000\362\336\037\014yaml:\"coins\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYCLAIMRECORDREQUEST'].fields_by_name['address']._options = None
  _globals['_QUERYCLAIMRECORDREQUEST'].fields_by_name['address']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _globals['_QUERYCLAIMRECORDRESPONSE'].fields_by_name['claim_record']._options = None
  _globals['_QUERYCLAIMRECORDRESPONSE'].fields_by_name['claim_record']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"claim_record\"'
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST'].fields_by_name['address']._options = None
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST'].fields_by_name['action']._options = None
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST'].fields_by_name['action']._serialized_options = b'\362\336\037\ryaml:\"action\"'
  _globals['_QUERYCLAIMABLEFORACTIONRESPONSE'].fields_by_name['coins']._options = None
  _globals['_QUERYCLAIMABLEFORACTIONRESPONSE'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\362\336\037\014yaml:\"coins\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYTOTALCLAIMABLEREQUEST'].fields_by_name['address']._options = None
  _globals['_QUERYTOTALCLAIMABLEREQUEST'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_QUERYTOTALCLAIMABLERESPONSE'].fields_by_name['coins']._options = None
  _globals['_QUERYTOTALCLAIMABLERESPONSE'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\362\336\037\014yaml:\"coins\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERY'].methods_by_name['ModuleAccountBalance']._options = None
  _globals['_QUERY'].methods_by_name['ModuleAccountBalance']._serialized_options = b'\202\323\344\223\002/\022-/osmosis/claim/v1beta1/module_account_balance'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\037\022\035/osmosis/claim/v1beta1/params'
  _globals['_QUERY'].methods_by_name['ClaimRecord']._options = None
  _globals['_QUERY'].methods_by_name['ClaimRecord']._serialized_options = b'\202\323\344\223\002/\022-/osmosis/claim/v1beta1/claim_record/{address}'
  _globals['_QUERY'].methods_by_name['ClaimableForAction']._options = None
  _globals['_QUERY'].methods_by_name['ClaimableForAction']._serialized_options = b'\202\323\344\223\002@\022>/osmosis/claim/v1beta1/claimable_for_action/{address}/{action}'
  _globals['_QUERY'].methods_by_name['TotalClaimable']._options = None
  _globals['_QUERY'].methods_by_name['TotalClaimable']._serialized_options = b'\202\323\344\223\0022\0220/osmosis/claim/v1beta1/total_claimable/{address}'
  _globals['_QUERYMODULEACCOUNTBALANCEREQUEST']._serialized_start=251
  _globals['_QUERYMODULEACCOUNTBALANCEREQUEST']._serialized_end=285
  _globals['_QUERYMODULEACCOUNTBALANCERESPONSE']._serialized_start=288
  _globals['_QUERYMODULEACCOUNTBALANCERESPONSE']._serialized_end=469
  _globals['_QUERYPARAMSREQUEST']._serialized_start=471
  _globals['_QUERYPARAMSREQUEST']._serialized_end=491
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=493
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=573
  _globals['_QUERYCLAIMRECORDREQUEST']._serialized_start=575
  _globals['_QUERYCLAIMRECORDREQUEST']._serialized_end=645
  _globals['_QUERYCLAIMRECORDRESPONSE']._serialized_start=647
  _globals['_QUERYCLAIMRECORDRESPONSE']._serialized_end=771
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST']._serialized_start=774
  _globals['_QUERYCLAIMABLEFORACTIONREQUEST']._serialized_end=924
  _globals['_QUERYCLAIMABLEFORACTIONRESPONSE']._serialized_start=927
  _globals['_QUERYCLAIMABLEFORACTIONRESPONSE']._serialized_end=1075
  _globals['_QUERYTOTALCLAIMABLEREQUEST']._serialized_start=1077
  _globals['_QUERYTOTALCLAIMABLEREQUEST']._serialized_end=1151
  _globals['_QUERYTOTALCLAIMABLERESPONSE']._serialized_start=1154
  _globals['_QUERYTOTALCLAIMABLERESPONSE']._serialized_end=1298
  _globals['_QUERY']._serialized_start=1301
  _globals['_QUERY']._serialized_end=2174
# @@protoc_insertion_point(module_scope)
