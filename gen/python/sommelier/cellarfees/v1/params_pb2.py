# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/cellarfees/v1/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$sommelier/cellarfees/v1/params.proto\x12\rcellarfees.v1\x1a\x14gogoproto/gogo.proto\"\xb9\x02\n\x06Params\x12\x41\n\x1d\x66\x65\x65_accrual_auction_threshold\x18\x01 \x01(\x04R\x1a\x66\x65\x65\x41\x63\x63rualAuctionThreshold\x12\x34\n\x16reward_emission_period\x18\x02 \x01(\x04R\x14rewardEmissionPeriod\x12m\n\x1binitial_price_decrease_rate\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x18initialPriceDecreaseRate\x12\x41\n\x1dprice_decrease_block_interval\x18\x04 \x01(\x04R\x1apriceDecreaseBlockInterval:\x04\x98\xa0\x1f\x00\x42\xa7\x01\n\x11\x63om.cellarfees.v1B\x0bParamsProtoZ2github.com/peggyjv/sommelier/v4/x/cellarfees/types\xa2\x02\x03\x43XX\xaa\x02\rCellarfees.V1\xca\x02\rCellarfees\\V1\xe2\x02\x19\x43\x65llarfees\\V1\\GPBMetadata\xea\x02\x0e\x43\x65llarfees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.cellarfees.v1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\021com.cellarfees.v1B\013ParamsProtoZ2github.com/peggyjv/sommelier/v4/x/cellarfees/types\242\002\003CXX\252\002\rCellarfees.V1\312\002\rCellarfees\\V1\342\002\031Cellarfees\\V1\\GPBMetadata\352\002\016Cellarfees::V1'
  _globals['_PARAMS'].fields_by_name['initial_price_decrease_rate']._options = None
  _globals['_PARAMS'].fields_by_name['initial_price_decrease_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._options = None
  _globals['_PARAMS']._serialized_options = b'\230\240\037\000'
  _globals['_PARAMS']._serialized_start=78
  _globals['_PARAMS']._serialized_end=391
# @@protoc_insertion_point(module_scope)
