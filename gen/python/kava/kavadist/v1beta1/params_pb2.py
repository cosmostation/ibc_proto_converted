# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/kavadist/v1beta1/params.proto
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
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"kava/kavadist/v1beta1/params.proto\x12\x15kava.kavadist.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc7\x01\n\x06Params\x12\x16\n\x06\x61\x63tive\x18\x01 \x01(\x08R\x06\x61\x63tive\x12=\n\x07periods\x18\x03 \x03(\x0b\x32\x1d.kava.kavadist.v1beta1.PeriodB\x04\xc8\xde\x1f\x00R\x07periods\x12\x66\n\x15infrastructure_params\x18\x04 \x01(\x0b\x32+.kava.kavadist.v1beta1.InfrastructureParamsB\x04\xc8\xde\x1f\x00R\x14infrastructureParams\"\xc5\x02\n\x14InfrastructureParams\x12\x65\n\x16infrastructure_periods\x18\x01 \x03(\x0b\x32\x1d.kava.kavadist.v1beta1.PeriodB\x0f\xc8\xde\x1f\x00\xaa\xdf\x1f\x07PeriodsR\x15infrastructurePeriods\x12Y\n\x0c\x63ore_rewards\x18\x02 \x03(\x0b\x32!.kava.kavadist.v1beta1.CoreRewardB\x13\xc8\xde\x1f\x00\xaa\xdf\x1f\x0b\x43oreRewardsR\x0b\x63oreRewards\x12\x65\n\x0fpartner_rewards\x18\x03 \x03(\x0b\x32$.kava.kavadist.v1beta1.PartnerRewardB\x16\xc8\xde\x1f\x00\xaa\xdf\x1f\x0ePartnerRewardsR\x0epartnerRewards:\x04\x98\xa0\x1f\x01\"\xcc\x01\n\nCoreReward\x12\x62\n\x07\x61\x64\x64ress\x18\x01 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x07\x61\x64\x64ress\x12T\n\x06weight\x18\x02 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x06weight:\x04\x98\xa0\x1f\x01\"\xc8\x01\n\rPartnerReward\x12\x62\n\x07\x61\x64\x64ress\x18\x01 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x07\x61\x64\x64ress\x12M\n\x12rewards_per_second\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x10rewardsPerSecond:\x04\x98\xa0\x1f\x01\"\xd0\x01\n\x06Period\x12:\n\x05start\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x05start\x12\x36\n\x03\x65nd\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x03\x65nd\x12L\n\tinflation\x18\x03 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tinflation:\x04\xe8\xa0\x1f\x01\x42\xd0\x01\n\x19\x63om.kava.kavadist.v1beta1B\x0bParamsProtoZ*github.com/kava-labs/kava/x/kavadist/types\xa2\x02\x03KKX\xaa\x02\x15Kava.Kavadist.V1beta1\xca\x02\x15Kava\\Kavadist\\V1beta1\xe2\x02!Kava\\Kavadist\\V1beta1\\GPBMetadata\xea\x02\x17Kava::Kavadist::V1beta1\xc8\xe1\x1e\x00\xd8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.kavadist.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.kava.kavadist.v1beta1B\013ParamsProtoZ*github.com/kava-labs/kava/x/kavadist/types\242\002\003KKX\252\002\025Kava.Kavadist.V1beta1\312\002\025Kava\\Kavadist\\V1beta1\342\002!Kava\\Kavadist\\V1beta1\\GPBMetadata\352\002\027Kava::Kavadist::V1beta1\310\341\036\000\330\341\036\000'
  _globals['_PARAMS'].fields_by_name['periods']._options = None
  _globals['_PARAMS'].fields_by_name['periods']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS'].fields_by_name['infrastructure_params']._options = None
  _globals['_PARAMS'].fields_by_name['infrastructure_params']._serialized_options = b'\310\336\037\000'
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['infrastructure_periods']._options = None
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['infrastructure_periods']._serialized_options = b'\310\336\037\000\252\337\037\007Periods'
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['core_rewards']._options = None
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['core_rewards']._serialized_options = b'\310\336\037\000\252\337\037\013CoreRewards'
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['partner_rewards']._options = None
  _globals['_INFRASTRUCTUREPARAMS'].fields_by_name['partner_rewards']._serialized_options = b'\310\336\037\000\252\337\037\016PartnerRewards'
  _globals['_INFRASTRUCTUREPARAMS']._options = None
  _globals['_INFRASTRUCTUREPARAMS']._serialized_options = b'\230\240\037\001'
  _globals['_COREREWARD'].fields_by_name['address']._options = None
  _globals['_COREREWARD'].fields_by_name['address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _globals['_COREREWARD'].fields_by_name['weight']._options = None
  _globals['_COREREWARD'].fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _globals['_COREREWARD']._options = None
  _globals['_COREREWARD']._serialized_options = b'\230\240\037\001'
  _globals['_PARTNERREWARD'].fields_by_name['address']._options = None
  _globals['_PARTNERREWARD'].fields_by_name['address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _globals['_PARTNERREWARD'].fields_by_name['rewards_per_second']._options = None
  _globals['_PARTNERREWARD'].fields_by_name['rewards_per_second']._serialized_options = b'\310\336\037\000'
  _globals['_PARTNERREWARD']._options = None
  _globals['_PARTNERREWARD']._serialized_options = b'\230\240\037\001'
  _globals['_PERIOD'].fields_by_name['start']._options = None
  _globals['_PERIOD'].fields_by_name['start']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_PERIOD'].fields_by_name['end']._options = None
  _globals['_PERIOD'].fields_by_name['end']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_PERIOD'].fields_by_name['inflation']._options = None
  _globals['_PERIOD'].fields_by_name['inflation']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PERIOD']._options = None
  _globals['_PERIOD']._serialized_options = b'\350\240\037\001'
  _globals['_PARAMS']._serialized_start=176
  _globals['_PARAMS']._serialized_end=375
  _globals['_INFRASTRUCTUREPARAMS']._serialized_start=378
  _globals['_INFRASTRUCTUREPARAMS']._serialized_end=703
  _globals['_COREREWARD']._serialized_start=706
  _globals['_COREREWARD']._serialized_end=910
  _globals['_PARTNERREWARD']._serialized_start=913
  _globals['_PARTNERREWARD']._serialized_end=1113
  _globals['_PERIOD']._serialized_start=1116
  _globals['_PERIOD']._serialized_end=1324
# @@protoc_insertion_point(module_scope)
