# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/lpfarm/v1beta1/events.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$crescent/lpfarm/v1beta1/events.proto\x12\x17\x63rescent.lpfarm.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"}\n\x16\x45ventCreatePrivatePlan\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x17\n\x07plan_id\x18\x02 \x01(\x04R\x06planId\x12\x30\n\x14\x66\x61rming_pool_address\x18\x03 \x01(\tR\x12\x66\x61rmingPoolAddress\"\xd2\x01\n\tEventFarm\x12\x16\n\x06\x66\x61rmer\x18\x01 \x01(\tR\x06\x66\x61rmer\x12\x33\n\x04\x63oin\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x04\x63oin\x12x\n\x11withdrawn_rewards\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x10withdrawnRewards\"\xd4\x01\n\x0b\x45ventUnfarm\x12\x16\n\x06\x66\x61rmer\x18\x01 \x01(\tR\x06\x66\x61rmer\x12\x33\n\x04\x63oin\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x04\x63oin\x12x\n\x11withdrawn_rewards\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x10withdrawnRewards\"\xb6\x01\n\x0c\x45ventHarvest\x12\x16\n\x06\x66\x61rmer\x18\x01 \x01(\tR\x06\x66\x61rmer\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12x\n\x11withdrawn_rewards\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x10withdrawnRewards\"-\n\x12\x45ventTerminatePlan\x12\x17\n\x07plan_id\x18\x01 \x01(\x04R\x06planIdB\xe2\x01\n\x1b\x63om.crescent.lpfarm.v1beta1B\x0b\x45ventsProtoZ6github.com/crescent-network/crescent/v5/x/lpfarm/types\xa2\x02\x03\x43LX\xaa\x02\x17\x43rescent.Lpfarm.V1beta1\xca\x02\x17\x43rescent\\Lpfarm\\V1beta1\xe2\x02#Crescent\\Lpfarm\\V1beta1\\GPBMetadata\xea\x02\x19\x43rescent::Lpfarm::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.lpfarm.v1beta1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.crescent.lpfarm.v1beta1B\013EventsProtoZ6github.com/crescent-network/crescent/v5/x/lpfarm/types\242\002\003CLX\252\002\027Crescent.Lpfarm.V1beta1\312\002\027Crescent\\Lpfarm\\V1beta1\342\002#Crescent\\Lpfarm\\V1beta1\\GPBMetadata\352\002\031Crescent::Lpfarm::V1beta1\310\341\036\000'
  _globals['_EVENTFARM'].fields_by_name['coin']._options = None
  _globals['_EVENTFARM'].fields_by_name['coin']._serialized_options = b'\310\336\037\000'
  _globals['_EVENTFARM'].fields_by_name['withdrawn_rewards']._options = None
  _globals['_EVENTFARM'].fields_by_name['withdrawn_rewards']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_EVENTUNFARM'].fields_by_name['coin']._options = None
  _globals['_EVENTUNFARM'].fields_by_name['coin']._serialized_options = b'\310\336\037\000'
  _globals['_EVENTUNFARM'].fields_by_name['withdrawn_rewards']._options = None
  _globals['_EVENTUNFARM'].fields_by_name['withdrawn_rewards']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_EVENTHARVEST'].fields_by_name['withdrawn_rewards']._options = None
  _globals['_EVENTHARVEST'].fields_by_name['withdrawn_rewards']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_EVENTCREATEPRIVATEPLAN']._serialized_start=119
  _globals['_EVENTCREATEPRIVATEPLAN']._serialized_end=244
  _globals['_EVENTFARM']._serialized_start=247
  _globals['_EVENTFARM']._serialized_end=457
  _globals['_EVENTUNFARM']._serialized_start=460
  _globals['_EVENTUNFARM']._serialized_end=672
  _globals['_EVENTHARVEST']._serialized_start=675
  _globals['_EVENTHARVEST']._serialized_end=857
  _globals['_EVENTTERMINATEPLAN']._serialized_start=859
  _globals['_EVENTTERMINATEPLAN']._serialized_end=904
# @@protoc_insertion_point(module_scope)
