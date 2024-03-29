# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/claim/v1beta1/claim.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"crescent/claim/v1beta1/claim.proto\x12\x16\x63rescent.claim.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x8d\x02\n\x07\x41irdrop\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12%\n\x0esource_address\x18\x02 \x01(\tR\rsourceAddress\x12\x45\n\nconditions\x18\x03 \x03(\x0e\x32%.crescent.claim.v1beta1.ConditionTypeR\nconditions\x12\x43\n\nstart_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tstartTime\x12?\n\x08\x65nd_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x07\x65ndTime\"\x9c\x03\n\x0b\x43laimRecord\x12\x1d\n\nairdrop_id\x18\x01 \x01(\x04R\tairdropId\x12\x1c\n\trecipient\x18\x02 \x01(\tR\trecipient\x12\x83\x01\n\x17initial_claimable_coins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x15initialClaimableCoins\x12t\n\x0f\x63laimable_coins\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0e\x63laimableCoins\x12T\n\x12\x63laimed_conditions\x18\x05 \x03(\x0e\x32%.crescent.claim.v1beta1.ConditionTypeR\x11\x63laimedConditions*\xa7\x02\n\rConditionType\x12<\n\x1a\x43ONDITION_TYPE_UNSPECIFIED\x10\x00\x1a\x1c\x8a\x9d \x18\x43onditionTypeUnspecified\x12\x34\n\x16\x43ONDITION_TYPE_DEPOSIT\x10\x01\x1a\x18\x8a\x9d \x14\x43onditionTypeDeposit\x12.\n\x13\x43ONDITION_TYPE_SWAP\x10\x02\x1a\x15\x8a\x9d \x11\x43onditionTypeSwap\x12<\n\x1a\x43ONDITION_TYPE_LIQUIDSTAKE\x10\x03\x1a\x1c\x8a\x9d \x18\x43onditionTypeLiquidStake\x12.\n\x13\x43ONDITION_TYPE_VOTE\x10\x04\x1a\x15\x8a\x9d \x11\x43onditionTypeVote\x1a\x04\x88\xa3\x1e\x00\x42\xdb\x01\n\x1a\x63om.crescent.claim.v1beta1B\nClaimProtoZ5github.com/crescent-network/crescent/v5/x/claim/types\xa2\x02\x03\x43\x43X\xaa\x02\x16\x43rescent.Claim.V1beta1\xca\x02\x16\x43rescent\\Claim\\V1beta1\xe2\x02\"Crescent\\Claim\\V1beta1\\GPBMetadata\xea\x02\x18\x43rescent::Claim::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.claim.v1beta1.claim_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.crescent.claim.v1beta1B\nClaimProtoZ5github.com/crescent-network/crescent/v5/x/claim/types\242\002\003CCX\252\002\026Crescent.Claim.V1beta1\312\002\026Crescent\\Claim\\V1beta1\342\002\"Crescent\\Claim\\V1beta1\\GPBMetadata\352\002\030Crescent::Claim::V1beta1\310\341\036\000'
  _globals['_CONDITIONTYPE']._options = None
  _globals['_CONDITIONTYPE']._serialized_options = b'\210\243\036\000'
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_UNSPECIFIED"]._options = None
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \030ConditionTypeUnspecified'
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_DEPOSIT"]._options = None
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_DEPOSIT"]._serialized_options = b'\212\235 \024ConditionTypeDeposit'
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_SWAP"]._options = None
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_SWAP"]._serialized_options = b'\212\235 \021ConditionTypeSwap'
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_LIQUIDSTAKE"]._options = None
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_LIQUIDSTAKE"]._serialized_options = b'\212\235 \030ConditionTypeLiquidStake'
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_VOTE"]._options = None
  _globals['_CONDITIONTYPE'].values_by_name["CONDITION_TYPE_VOTE"]._serialized_options = b'\212\235 \021ConditionTypeVote'
  _globals['_AIRDROP'].fields_by_name['start_time']._options = None
  _globals['_AIRDROP'].fields_by_name['start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_AIRDROP'].fields_by_name['end_time']._options = None
  _globals['_AIRDROP'].fields_by_name['end_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_CLAIMRECORD'].fields_by_name['initial_claimable_coins']._options = None
  _globals['_CLAIMRECORD'].fields_by_name['initial_claimable_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_CLAIMRECORD'].fields_by_name['claimable_coins']._options = None
  _globals['_CLAIMRECORD'].fields_by_name['claimable_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_CONDITIONTYPE']._serialized_start=837
  _globals['_CONDITIONTYPE']._serialized_end=1132
  _globals['_AIRDROP']._serialized_start=150
  _globals['_AIRDROP']._serialized_end=419
  _globals['_CLAIMRECORD']._serialized_start=422
  _globals['_CLAIMRECORD']._serialized_end=834
# @@protoc_insertion_point(module_scope)
