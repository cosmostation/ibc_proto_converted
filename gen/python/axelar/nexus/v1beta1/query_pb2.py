# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/nexus/v1beta1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.nexus.exported.v1beta1 import types_pb2 as axelar_dot_nexus_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.nexus.v1beta1 import types_pb2 as axelar_dot_nexus_dot_v1beta1_dot_types__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n axelar/nexus/v1beta1/query.proto\x12\x14\x61xelar.nexus.v1beta1\x1a\x1egoogle/protobuf/duration.proto\x1a\x14gogoproto/gogo.proto\x1a)axelar/nexus/exported/v1beta1/types.proto\x1a axelar/nexus/v1beta1/types.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"/\n\x17\x43hainMaintainersRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\"o\n\x18\x43hainMaintainersResponse\x12S\n\x0bmaintainers\x18\x01 \x03(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x0bmaintainers\"\x92\x01\n\x1bLatestDepositAddressRequest\x12%\n\x0erecipient_addr\x18\x01 \x01(\tR\rrecipientAddr\x12\'\n\x0frecipient_chain\x18\x02 \x01(\tR\x0erecipientChain\x12#\n\rdeposit_chain\x18\x03 \x01(\tR\x0c\x64\x65positChain\"A\n\x1cLatestDepositAddressResponse\x12!\n\x0c\x64\x65posit_addr\x18\x01 \x01(\tR\x0b\x64\x65positAddr\"\xbc\x01\n\x18TransfersForChainRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\x12\x42\n\x05state\x18\x02 \x01(\x0e\x32,.axelar.nexus.exported.v1beta1.TransferStateR\x05state\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xbb\x01\n\x19TransfersForChainResponse\x12U\n\ttransfers\x18\x01 \x03(\x0b\x32\x31.axelar.nexus.exported.v1beta1.CrossChainTransferB\x04\xc8\xde\x1f\x00R\ttransfers\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"<\n\x0e\x46\x65\x65InfoRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\x12\x14\n\x05\x61sset\x18\x02 \x01(\tR\x05\x61sset\"T\n\x0f\x46\x65\x65InfoResponse\x12\x41\n\x08\x66\x65\x65_info\x18\x01 \x01(\x0b\x32&.axelar.nexus.exported.v1beta1.FeeInfoR\x07\x66\x65\x65Info\"|\n\x12TransferFeeRequest\x12!\n\x0csource_chain\x18\x01 \x01(\tR\x0bsourceChain\x12+\n\x11\x64\x65stination_chain\x18\x02 \x01(\tR\x10\x64\x65stinationChain\x12\x16\n\x06\x61mount\x18\x03 \x01(\tR\x06\x61mount\"H\n\x13TransferFeeResponse\x12\x31\n\x03\x66\x65\x65\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\"J\n\rChainsRequest\x12\x39\n\x06status\x18\x01 \x01(\x0e\x32!.axelar.nexus.v1beta1.ChainStatusR\x06status\"m\n\x0e\x43hainsResponse\x12[\n\x06\x63hains\x18\x01 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains\"%\n\rAssetsRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\"(\n\x0e\x41ssetsResponse\x12\x16\n\x06\x61ssets\x18\x01 \x03(\tR\x06\x61ssets\")\n\x11\x43hainStateRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\"R\n\x12\x43hainStateResponse\x12<\n\x05state\x18\x01 \x01(\x0b\x32 .axelar.nexus.v1beta1.ChainStateB\x04\xc8\xde\x1f\x00R\x05state\",\n\x14\x43hainsByAssetRequest\x12\x14\n\x05\x61sset\x18\x01 \x01(\tR\x05\x61sset\"t\n\x15\x43hainsByAssetResponse\x12[\n\x06\x63hains\x18\x01 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains\"a\n\x17RecipientAddressRequest\x12!\n\x0c\x64\x65posit_addr\x18\x01 \x01(\tR\x0b\x64\x65positAddr\x12#\n\rdeposit_chain\x18\x02 \x01(\tR\x0c\x64\x65positChain\"j\n\x18RecipientAddressResponse\x12%\n\x0erecipient_addr\x18\x01 \x01(\tR\rrecipientAddr\x12\'\n\x0frecipient_chain\x18\x02 \x01(\tR\x0erecipientChain\"F\n\x18TransferRateLimitRequest\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\x12\x14\n\x05\x61sset\x18\x02 \x01(\tR\x05\x61sset\"t\n\x19TransferRateLimitResponse\x12W\n\x13transfer_rate_limit\x18\x01 \x01(\x0b\x32\'.axelar.nexus.v1beta1.TransferRateLimitR\x11transferRateLimit\"\xf0\x02\n\x11TransferRateLimit\x12\x44\n\x05limit\x18\x01 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05limit\x12;\n\x06window\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x06window\x12J\n\x08incoming\x18\x03 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08incoming\x12J\n\x08outgoing\x18\x04 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08outgoing\x12@\n\ttime_left\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x08timeLeft\"(\n\x0eMessageRequest\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\"`\n\x0fMessageResponse\x12M\n\x07message\x18\x01 \x01(\x0b\x32-.axelar.nexus.exported.v1beta1.GeneralMessageB\x04\xc8\xde\x1f\x00R\x07message*\x9c\x01\n\x0b\x43hainStatus\x12-\n\x18\x43HAIN_STATUS_UNSPECIFIED\x10\x00\x1a\x0f\x8a\x9d \x0bUnspecified\x12)\n\x16\x43HAIN_STATUS_ACTIVATED\x10\x01\x1a\r\x8a\x9d \tActivated\x12-\n\x18\x43HAIN_STATUS_DEACTIVATED\x10\x02\x1a\x0f\x8a\x9d \x0b\x44\x65\x61\x63tivated\x1a\x04\x88\xa3\x1e\x00\x42\xce\x01\n\x18\x63om.axelar.nexus.v1beta1B\nQueryProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\xa2\x02\x03\x41NX\xaa\x02\x14\x41xelar.Nexus.V1beta1\xca\x02\x14\x41xelar\\Nexus\\V1beta1\xe2\x02 Axelar\\Nexus\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Nexus::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.nexus.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.axelar.nexus.v1beta1B\nQueryProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\242\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Nexus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMetadata\352\002\026Axelar::Nexus::V1beta1\310\341\036\000'
  _globals['_CHAINSTATUS']._options = None
  _globals['_CHAINSTATUS']._serialized_options = b'\210\243\036\000'
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_UNSPECIFIED"]._options = None
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \013Unspecified'
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_ACTIVATED"]._options = None
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_ACTIVATED"]._serialized_options = b'\212\235 \tActivated'
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_DEACTIVATED"]._options = None
  _globals['_CHAINSTATUS'].values_by_name["CHAIN_STATUS_DEACTIVATED"]._serialized_options = b'\212\235 \013Deactivated'
  _globals['_CHAINMAINTAINERSRESPONSE'].fields_by_name['maintainers']._options = None
  _globals['_CHAINMAINTAINERSRESPONSE'].fields_by_name['maintainers']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _globals['_TRANSFERSFORCHAINRESPONSE'].fields_by_name['transfers']._options = None
  _globals['_TRANSFERSFORCHAINRESPONSE'].fields_by_name['transfers']._serialized_options = b'\310\336\037\000'
  _globals['_TRANSFERFEERESPONSE'].fields_by_name['fee']._options = None
  _globals['_TRANSFERFEERESPONSE'].fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _globals['_CHAINSRESPONSE'].fields_by_name['chains']._options = None
  _globals['_CHAINSRESPONSE'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_CHAINSTATERESPONSE'].fields_by_name['state']._options = None
  _globals['_CHAINSTATERESPONSE'].fields_by_name['state']._serialized_options = b'\310\336\037\000'
  _globals['_CHAINSBYASSETRESPONSE'].fields_by_name['chains']._options = None
  _globals['_CHAINSBYASSETRESPONSE'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_TRANSFERRATELIMIT'].fields_by_name['limit']._options = None
  _globals['_TRANSFERRATELIMIT'].fields_by_name['limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_TRANSFERRATELIMIT'].fields_by_name['window']._options = None
  _globals['_TRANSFERRATELIMIT'].fields_by_name['window']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_TRANSFERRATELIMIT'].fields_by_name['incoming']._options = None
  _globals['_TRANSFERRATELIMIT'].fields_by_name['incoming']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_TRANSFERRATELIMIT'].fields_by_name['outgoing']._options = None
  _globals['_TRANSFERRATELIMIT'].fields_by_name['outgoing']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_TRANSFERRATELIMIT'].fields_by_name['time_left']._options = None
  _globals['_TRANSFERRATELIMIT'].fields_by_name['time_left']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_MESSAGEREQUEST'].fields_by_name['id']._options = None
  _globals['_MESSAGEREQUEST'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MESSAGERESPONSE'].fields_by_name['message']._options = None
  _globals['_MESSAGERESPONSE'].fields_by_name['message']._serialized_options = b'\310\336\037\000'
  _globals['_CHAINSTATUS']._serialized_start=2840
  _globals['_CHAINSTATUS']._serialized_end=2996
  _globals['_CHAINMAINTAINERSREQUEST']._serialized_start=265
  _globals['_CHAINMAINTAINERSREQUEST']._serialized_end=312
  _globals['_CHAINMAINTAINERSRESPONSE']._serialized_start=314
  _globals['_CHAINMAINTAINERSRESPONSE']._serialized_end=425
  _globals['_LATESTDEPOSITADDRESSREQUEST']._serialized_start=428
  _globals['_LATESTDEPOSITADDRESSREQUEST']._serialized_end=574
  _globals['_LATESTDEPOSITADDRESSRESPONSE']._serialized_start=576
  _globals['_LATESTDEPOSITADDRESSRESPONSE']._serialized_end=641
  _globals['_TRANSFERSFORCHAINREQUEST']._serialized_start=644
  _globals['_TRANSFERSFORCHAINREQUEST']._serialized_end=832
  _globals['_TRANSFERSFORCHAINRESPONSE']._serialized_start=835
  _globals['_TRANSFERSFORCHAINRESPONSE']._serialized_end=1022
  _globals['_FEEINFOREQUEST']._serialized_start=1024
  _globals['_FEEINFOREQUEST']._serialized_end=1084
  _globals['_FEEINFORESPONSE']._serialized_start=1086
  _globals['_FEEINFORESPONSE']._serialized_end=1170
  _globals['_TRANSFERFEEREQUEST']._serialized_start=1172
  _globals['_TRANSFERFEEREQUEST']._serialized_end=1296
  _globals['_TRANSFERFEERESPONSE']._serialized_start=1298
  _globals['_TRANSFERFEERESPONSE']._serialized_end=1370
  _globals['_CHAINSREQUEST']._serialized_start=1372
  _globals['_CHAINSREQUEST']._serialized_end=1446
  _globals['_CHAINSRESPONSE']._serialized_start=1448
  _globals['_CHAINSRESPONSE']._serialized_end=1557
  _globals['_ASSETSREQUEST']._serialized_start=1559
  _globals['_ASSETSREQUEST']._serialized_end=1596
  _globals['_ASSETSRESPONSE']._serialized_start=1598
  _globals['_ASSETSRESPONSE']._serialized_end=1638
  _globals['_CHAINSTATEREQUEST']._serialized_start=1640
  _globals['_CHAINSTATEREQUEST']._serialized_end=1681
  _globals['_CHAINSTATERESPONSE']._serialized_start=1683
  _globals['_CHAINSTATERESPONSE']._serialized_end=1765
  _globals['_CHAINSBYASSETREQUEST']._serialized_start=1767
  _globals['_CHAINSBYASSETREQUEST']._serialized_end=1811
  _globals['_CHAINSBYASSETRESPONSE']._serialized_start=1813
  _globals['_CHAINSBYASSETRESPONSE']._serialized_end=1929
  _globals['_RECIPIENTADDRESSREQUEST']._serialized_start=1931
  _globals['_RECIPIENTADDRESSREQUEST']._serialized_end=2028
  _globals['_RECIPIENTADDRESSRESPONSE']._serialized_start=2030
  _globals['_RECIPIENTADDRESSRESPONSE']._serialized_end=2136
  _globals['_TRANSFERRATELIMITREQUEST']._serialized_start=2138
  _globals['_TRANSFERRATELIMITREQUEST']._serialized_end=2208
  _globals['_TRANSFERRATELIMITRESPONSE']._serialized_start=2210
  _globals['_TRANSFERRATELIMITRESPONSE']._serialized_end=2326
  _globals['_TRANSFERRATELIMIT']._serialized_start=2329
  _globals['_TRANSFERRATELIMIT']._serialized_end=2697
  _globals['_MESSAGEREQUEST']._serialized_start=2699
  _globals['_MESSAGEREQUEST']._serialized_end=2739
  _globals['_MESSAGERESPONSE']._serialized_start=2741
  _globals['_MESSAGERESPONSE']._serialized_end=2837
# @@protoc_insertion_point(module_scope)
