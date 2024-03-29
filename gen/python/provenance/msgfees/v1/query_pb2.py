# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/msgfees/v1/query.proto
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
from provenance.msgfees.v1 import msgfees_pb2 as provenance_dot_msgfees_dot_v1_dot_msgfees__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!provenance/msgfees/v1/query.proto\x12\x15provenance.msgfees.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a#provenance/msgfees/v1/msgfees.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\"\x14\n\x12QueryParamsRequest\"R\n\x13QueryParamsResponse\x12;\n\x06params\x18\x01 \x01(\x0b\x32\x1d.provenance.msgfees.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"`\n\x16QueryAllMsgFeesRequest\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9c\x01\n\x17QueryAllMsgFeesResponse\x12\x38\n\x08msg_fees\x18\x01 \x03(\x0b\x32\x1d.provenance.msgfees.v1.MsgFeeR\x07msgFees\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x88\x01\n\x16\x43\x61lculateTxFeesRequest\x12\x19\n\x08tx_bytes\x18\x01 \x01(\x0cR\x07txBytes\x12,\n\x12\x64\x65\x66\x61ult_base_denom\x18\x02 \x01(\tR\x10\x64\x65\x66\x61ultBaseDenom\x12%\n\x0egas_adjustment\x18\x03 \x01(\x02R\rgasAdjustment\"\xa0\x02\n\x17\x43\x61lculateTxFeesResponse\x12t\n\x0f\x61\x64\x64itional_fees\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0e\x61\x64\x64itionalFees\x12j\n\ntotal_fees\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\ttotalFees\x12#\n\restimated_gas\x18\x03 \x01(\x04R\x0c\x65stimatedGas2\xd0\x03\n\x05Query\x12\x86\x01\n\x06Params\x12).provenance.msgfees.v1.QueryParamsRequest\x1a*.provenance.msgfees.v1.QueryParamsResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/provenance/msgfees/v1/params\x12\x94\x01\n\x0fQueryAllMsgFees\x12-.provenance.msgfees.v1.QueryAllMsgFeesRequest\x1a..provenance.msgfees.v1.QueryAllMsgFeesResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/provenance/msgfees/v1/all\x12\xa6\x01\n\x0f\x43\x61lculateTxFees\x12-.provenance.msgfees.v1.CalculateTxFeesRequest\x1a..provenance.msgfees.v1.CalculateTxFeesResponse\"4\x82\xd3\xe4\x93\x02.\")/provenance/tx/v1/calculate_msg_based_fee:\x01*B\xd2\x01\n\x19\x63om.provenance.msgfees.v1B\nQueryProtoP\x00Z3github.com/provenance-io/provenance/x/msgfees/types\xa2\x02\x03PMX\xaa\x02\x15Provenance.Msgfees.V1\xca\x02\x15Provenance\\Msgfees\\V1\xe2\x02!Provenance\\Msgfees\\V1\\GPBMetadata\xea\x02\x17Provenance::Msgfees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.msgfees.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.provenance.msgfees.v1B\nQueryProtoP\000Z3github.com/provenance-io/provenance/x/msgfees/types\242\002\003PMX\252\002\025Provenance.Msgfees.V1\312\002\025Provenance\\Msgfees\\V1\342\002!Provenance\\Msgfees\\V1\\GPBMetadata\352\002\027Provenance::Msgfees::V1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_CALCULATETXFEESRESPONSE'].fields_by_name['additional_fees']._options = None
  _globals['_CALCULATETXFEESRESPONSE'].fields_by_name['additional_fees']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_CALCULATETXFEESRESPONSE'].fields_by_name['total_fees']._options = None
  _globals['_CALCULATETXFEESRESPONSE'].fields_by_name['total_fees']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\037\022\035/provenance/msgfees/v1/params'
  _globals['_QUERY'].methods_by_name['QueryAllMsgFees']._options = None
  _globals['_QUERY'].methods_by_name['QueryAllMsgFees']._serialized_options = b'\202\323\344\223\002\034\022\032/provenance/msgfees/v1/all'
  _globals['_QUERY'].methods_by_name['CalculateTxFees']._options = None
  _globals['_QUERY'].methods_by_name['CalculateTxFees']._serialized_options = b'\202\323\344\223\002.\")/provenance/tx/v1/calculate_msg_based_fee:\001*'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=225
  _globals['_QUERYPARAMSREQUEST']._serialized_end=245
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=247
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=329
  _globals['_QUERYALLMSGFEESREQUEST']._serialized_start=331
  _globals['_QUERYALLMSGFEESREQUEST']._serialized_end=427
  _globals['_QUERYALLMSGFEESRESPONSE']._serialized_start=430
  _globals['_QUERYALLMSGFEESRESPONSE']._serialized_end=586
  _globals['_CALCULATETXFEESREQUEST']._serialized_start=589
  _globals['_CALCULATETXFEESREQUEST']._serialized_end=725
  _globals['_CALCULATETXFEESRESPONSE']._serialized_start=728
  _globals['_CALCULATETXFEESRESPONSE']._serialized_end=1016
  _globals['_QUERY']._serialized_start=1019
  _globals['_QUERY']._serialized_end=1483
# @@protoc_insertion_point(module_scope)
