# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/lend/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from comdex.lend.v1beta1 import lend_pb2 as comdex_dot_lend_dot_v1beta1_dot_lend__pb2
from comdex.lend.v1beta1 import params_pb2 as comdex_dot_lend_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!comdex/lend/v1beta1/genesis.proto\x12\x13\x63omdex.lend.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63omdex/lend/v1beta1/lend.proto\x1a comdex/lend/v1beta1/params.proto\"\x94\r\n\x0cGenesisState\x12^\n\x0b\x62orrowAsset\x18\x01 \x03(\x0b\x32 .comdex.lend.v1beta1.BorrowAssetB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"borrowAsset\"R\x0b\x62orrowAsset\x12\x88\x01\n\x15\x62orrowInterestTracker\x18\x02 \x03(\x0b\x32,.comdex.lend.v1beta1.Borrow_interest_trackerB$\xc8\xde\x1f\x00\xf2\xde\x1f\x1cyaml:\"borrowInterestTracker\"R\x15\x62orrowInterestTracker\x12V\n\tlendAsset\x18\x03 \x03(\x0b\x32\x1e.comdex.lend.v1beta1.LendAssetB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"lendAsset\"R\tlendAsset\x12\x42\n\x04pool\x18\x04 \x03(\x0b\x32\x19.comdex.lend.v1beta1.PoolB\x13\xc8\xde\x1f\x00\xf2\xde\x1f\x0byaml:\"pool\"R\x04pool\x12z\n\x12\x61ssetToPairMapping\x18\x05 \x03(\x0b\x32\'.comdex.lend.v1beta1.AssetToPairMappingB!\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"assetToPairMapping\"R\x12\x61ssetToPairMapping\x12z\n\x12poolAssetLBMapping\x18\x06 \x03(\x0b\x32\'.comdex.lend.v1beta1.PoolAssetLBMappingB!\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"poolAssetLBMapping\"R\x12poolAssetLBMapping\x12|\n\x12lendRewardsTracker\x18\x07 \x03(\x0b\x32).comdex.lend.v1beta1.Lend_rewards_trackerB!\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"lendRewardsTracker\"R\x12lendRewardsTracker\x12\x9a\x01\n\x1auserAssetLendBorrowMapping\x18\x08 \x03(\x0b\x32/.comdex.lend.v1beta1.UserAssetLendBorrowMappingB)\xc8\xde\x1f\x00\xf2\xde\x1f!yaml:\"userAssetLendBorrowMapping\"R\x1auserAssetLendBorrowMapping\x12\x8e\x01\n\x17reserveBuybackAssetData\x18\t \x03(\x0b\x32,.comdex.lend.v1beta1.ReserveBuybackAssetDataB&\xc8\xde\x1f\x00\xf2\xde\x1f\x1eyaml:\"reserveBuybackAssetData\"R\x17reserveBuybackAssetData\x12\x65\n\rextended_Pair\x18\n \x03(\x0b\x32\".comdex.lend.v1beta1.Extended_PairB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"extended_Pair\"R\x0c\x65xtendedPair\x12\x66\n\rauctionParams\x18\x0b \x03(\x0b\x32\".comdex.lend.v1beta1.AuctionParamsB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"auctionParams\"R\rauctionParams\x12r\n\x10\x61ssetRatesParams\x18\x0c \x03(\x0b\x32%.comdex.lend.v1beta1.AssetRatesParamsB\x1f\xc8\xde\x1f\x00\xf2\xde\x1f\x17yaml:\"assetRatesParams\"R\x10\x61ssetRatesParams\x12J\n\x06modBal\x18\r \x01(\x0b\x32\x1b.comdex.lend.v1beta1.ModBalB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"modBal\"R\x06modBal\x12Z\n\nreserveBal\x18\x0e \x01(\x0b\x32\x1f.comdex.lend.v1beta1.ReserveBalB\x19\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"reserveBal\"R\nreserveBal\x12n\n\x0f\x61llReserveStats\x18\x0f \x03(\x0b\x32$.comdex.lend.v1beta1.AllReserveStatsB\x1e\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"allReserveStats\"R\x0f\x61llReserveStatsB\xc3\x01\n\x17\x63om.comdex.lend.v1beta1B\x0cGenesisProtoZ.github.com/comdex-official/comdex/x/lend/types\xa2\x02\x03\x43LX\xaa\x02\x13\x43omdex.Lend.V1beta1\xca\x02\x13\x43omdex\\Lend\\V1beta1\xe2\x02\x1f\x43omdex\\Lend\\V1beta1\\GPBMetadata\xea\x02\x15\x43omdex::Lend::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.lend.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.comdex.lend.v1beta1B\014GenesisProtoZ.github.com/comdex-official/comdex/x/lend/types\242\002\003CLX\252\002\023Comdex.Lend.V1beta1\312\002\023Comdex\\Lend\\V1beta1\342\002\037Comdex\\Lend\\V1beta1\\GPBMetadata\352\002\025Comdex::Lend::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['borrowAsset']._options = None
  _globals['_GENESISSTATE'].fields_by_name['borrowAsset']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"borrowAsset\"'
  _globals['_GENESISSTATE'].fields_by_name['borrowInterestTracker']._options = None
  _globals['_GENESISSTATE'].fields_by_name['borrowInterestTracker']._serialized_options = b'\310\336\037\000\362\336\037\034yaml:\"borrowInterestTracker\"'
  _globals['_GENESISSTATE'].fields_by_name['lendAsset']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lendAsset']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"lendAsset\"'
  _globals['_GENESISSTATE'].fields_by_name['pool']._options = None
  _globals['_GENESISSTATE'].fields_by_name['pool']._serialized_options = b'\310\336\037\000\362\336\037\013yaml:\"pool\"'
  _globals['_GENESISSTATE'].fields_by_name['assetToPairMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['assetToPairMapping']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"assetToPairMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['poolAssetLBMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['poolAssetLBMapping']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"poolAssetLBMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['lendRewardsTracker']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lendRewardsTracker']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"lendRewardsTracker\"'
  _globals['_GENESISSTATE'].fields_by_name['userAssetLendBorrowMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['userAssetLendBorrowMapping']._serialized_options = b'\310\336\037\000\362\336\037!yaml:\"userAssetLendBorrowMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['reserveBuybackAssetData']._options = None
  _globals['_GENESISSTATE'].fields_by_name['reserveBuybackAssetData']._serialized_options = b'\310\336\037\000\362\336\037\036yaml:\"reserveBuybackAssetData\"'
  _globals['_GENESISSTATE'].fields_by_name['extended_Pair']._options = None
  _globals['_GENESISSTATE'].fields_by_name['extended_Pair']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"extended_Pair\"'
  _globals['_GENESISSTATE'].fields_by_name['auctionParams']._options = None
  _globals['_GENESISSTATE'].fields_by_name['auctionParams']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"auctionParams\"'
  _globals['_GENESISSTATE'].fields_by_name['assetRatesParams']._options = None
  _globals['_GENESISSTATE'].fields_by_name['assetRatesParams']._serialized_options = b'\310\336\037\000\362\336\037\027yaml:\"assetRatesParams\"'
  _globals['_GENESISSTATE'].fields_by_name['modBal']._options = None
  _globals['_GENESISSTATE'].fields_by_name['modBal']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"modBal\"'
  _globals['_GENESISSTATE'].fields_by_name['reserveBal']._options = None
  _globals['_GENESISSTATE'].fields_by_name['reserveBal']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"reserveBal\"'
  _globals['_GENESISSTATE'].fields_by_name['allReserveStats']._options = None
  _globals['_GENESISSTATE'].fields_by_name['allReserveStats']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"allReserveStats\"'
  _globals['_GENESISSTATE']._serialized_start=147
  _globals['_GENESISSTATE']._serialized_end=1831
# @@protoc_insertion_point(module_scope)
