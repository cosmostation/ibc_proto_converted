# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ibc/applications/transfer/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from ibc.applications.transfer.v1 import transfer_pb2 as ibc_dot_applications_dot_transfer_dot_v1_dot_transfer__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(ibc/applications/transfer/v1/query.proto\x12\x1cibc.applications.transfer.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a+ibc/applications/transfer/v1/transfer.proto\x1a\x1cgoogle/api/annotations.proto\",\n\x16QueryDenomTraceRequest\x12\x12\n\x04hash\x18\x01 \x01(\tR\x04hash\"d\n\x17QueryDenomTraceResponse\x12I\n\x0b\x64\x65nom_trace\x18\x01 \x01(\x0b\x32(.ibc.applications.transfer.v1.DenomTraceR\ndenomTrace\"a\n\x17QueryDenomTracesRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xc0\x01\n\x18QueryDenomTracesResponse\x12[\n\x0c\x64\x65nom_traces\x18\x01 \x03(\x0b\x32(.ibc.applications.transfer.v1.DenomTraceB\x0e\xc8\xde\x1f\x00\xaa\xdf\x1f\x06TracesR\x0b\x64\x65nomTraces\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x14\n\x12QueryParamsRequest\"S\n\x13QueryParamsResponse\x12<\n\x06params\x18\x01 \x01(\x0b\x32$.ibc.applications.transfer.v1.ParamsR\x06params\"-\n\x15QueryDenomHashRequest\x12\x14\n\x05trace\x18\x01 \x01(\tR\x05trace\",\n\x16QueryDenomHashResponse\x12\x12\n\x04hash\x18\x01 \x01(\tR\x04hash\"S\n\x19QueryEscrowAddressRequest\x12\x17\n\x07port_id\x18\x01 \x01(\tR\x06portId\x12\x1d\n\nchannel_id\x18\x02 \x01(\tR\tchannelId\"C\n\x1aQueryEscrowAddressResponse\x12%\n\x0e\x65scrow_address\x18\x01 \x01(\tR\rescrowAddress\"7\n\x1fQueryTotalEscrowForDenomRequest\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"[\n QueryTotalEscrowForDenomResponse\x12\x37\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount2\xd8\x08\n\x05Query\x12\xaf\x01\n\nDenomTrace\x12\x34.ibc.applications.transfer.v1.QueryDenomTraceRequest\x1a\x35.ibc.applications.transfer.v1.QueryDenomTraceResponse\"4\x82\xd3\xe4\x93\x02.\x12,/ibc/apps/transfer/v1/denom_traces/{hash=**}\x12\xa8\x01\n\x0b\x44\x65nomTraces\x12\x35.ibc.applications.transfer.v1.QueryDenomTracesRequest\x1a\x36.ibc.applications.transfer.v1.QueryDenomTracesResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/ibc/apps/transfer/v1/denom_traces\x12\x93\x01\n\x06Params\x12\x30.ibc.applications.transfer.v1.QueryParamsRequest\x1a\x31.ibc.applications.transfer.v1.QueryParamsResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/ibc/apps/transfer/v1/params\x12\xad\x01\n\tDenomHash\x12\x33.ibc.applications.transfer.v1.QueryDenomHashRequest\x1a\x34.ibc.applications.transfer.v1.QueryDenomHashResponse\"5\x82\xd3\xe4\x93\x02/\x12-/ibc/apps/transfer/v1/denom_hashes/{trace=**}\x12\xd6\x01\n\rEscrowAddress\x12\x37.ibc.applications.transfer.v1.QueryEscrowAddressRequest\x1a\x38.ibc.applications.transfer.v1.QueryEscrowAddressResponse\"R\x82\xd3\xe4\x93\x02L\x12J/ibc/apps/transfer/v1/channels/{channel_id}/ports/{port_id}/escrow_address\x12\xd2\x01\n\x13TotalEscrowForDenom\x12=.ibc.applications.transfer.v1.QueryTotalEscrowForDenomRequest\x1a>.ibc.applications.transfer.v1.QueryTotalEscrowForDenomResponse\"<\x82\xd3\xe4\x93\x02\x36\x12\x34/ibc/apps/transfer/v1/denoms/{denom=**}/total_escrowB\xfa\x01\n com.ibc.applications.transfer.v1B\nQueryProtoP\x01Z7github.com/cosmos/ibc-go/v7/modules/apps/transfer/types\xa2\x02\x03IAT\xaa\x02\x1cIbc.Applications.Transfer.V1\xca\x02\x1cIbc\\Applications\\Transfer\\V1\xe2\x02(Ibc\\Applications\\Transfer\\V1\\GPBMetadata\xea\x02\x1fIbc::Applications::Transfer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ibc.applications.transfer.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.ibc.applications.transfer.v1B\nQueryProtoP\001Z7github.com/cosmos/ibc-go/v7/modules/apps/transfer/types\242\002\003IAT\252\002\034Ibc.Applications.Transfer.V1\312\002\034Ibc\\Applications\\Transfer\\V1\342\002(Ibc\\Applications\\Transfer\\V1\\GPBMetadata\352\002\037Ibc::Applications::Transfer::V1'
  _QUERYDENOMTRACESRESPONSE.fields_by_name['denom_traces']._options = None
  _QUERYDENOMTRACESRESPONSE.fields_by_name['denom_traces']._serialized_options = b'\310\336\037\000\252\337\037\006Traces'
  _QUERYTOTALESCROWFORDENOMRESPONSE.fields_by_name['amount']._options = None
  _QUERYTOTALESCROWFORDENOMRESPONSE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['DenomTrace']._options = None
  _QUERY.methods_by_name['DenomTrace']._serialized_options = b'\202\323\344\223\002.\022,/ibc/apps/transfer/v1/denom_traces/{hash=**}'
  _QUERY.methods_by_name['DenomTraces']._options = None
  _QUERY.methods_by_name['DenomTraces']._serialized_options = b'\202\323\344\223\002$\022\"/ibc/apps/transfer/v1/denom_traces'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\036\022\034/ibc/apps/transfer/v1/params'
  _QUERY.methods_by_name['DenomHash']._options = None
  _QUERY.methods_by_name['DenomHash']._serialized_options = b'\202\323\344\223\002/\022-/ibc/apps/transfer/v1/denom_hashes/{trace=**}'
  _QUERY.methods_by_name['EscrowAddress']._options = None
  _QUERY.methods_by_name['EscrowAddress']._serialized_options = b'\202\323\344\223\002L\022J/ibc/apps/transfer/v1/channels/{channel_id}/ports/{port_id}/escrow_address'
  _QUERY.methods_by_name['TotalEscrowForDenom']._options = None
  _QUERY.methods_by_name['TotalEscrowForDenom']._serialized_options = b'\202\323\344\223\0026\0224/ibc/apps/transfer/v1/denoms/{denom=**}/total_escrow'
  _globals['_QUERYDENOMTRACEREQUEST']._serialized_start=247
  _globals['_QUERYDENOMTRACEREQUEST']._serialized_end=291
  _globals['_QUERYDENOMTRACERESPONSE']._serialized_start=293
  _globals['_QUERYDENOMTRACERESPONSE']._serialized_end=393
  _globals['_QUERYDENOMTRACESREQUEST']._serialized_start=395
  _globals['_QUERYDENOMTRACESREQUEST']._serialized_end=492
  _globals['_QUERYDENOMTRACESRESPONSE']._serialized_start=495
  _globals['_QUERYDENOMTRACESRESPONSE']._serialized_end=687
  _globals['_QUERYPARAMSREQUEST']._serialized_start=689
  _globals['_QUERYPARAMSREQUEST']._serialized_end=709
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=711
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=794
  _globals['_QUERYDENOMHASHREQUEST']._serialized_start=796
  _globals['_QUERYDENOMHASHREQUEST']._serialized_end=841
  _globals['_QUERYDENOMHASHRESPONSE']._serialized_start=843
  _globals['_QUERYDENOMHASHRESPONSE']._serialized_end=887
  _globals['_QUERYESCROWADDRESSREQUEST']._serialized_start=889
  _globals['_QUERYESCROWADDRESSREQUEST']._serialized_end=972
  _globals['_QUERYESCROWADDRESSRESPONSE']._serialized_start=974
  _globals['_QUERYESCROWADDRESSRESPONSE']._serialized_end=1041
  _globals['_QUERYTOTALESCROWFORDENOMREQUEST']._serialized_start=1043
  _globals['_QUERYTOTALESCROWFORDENOMREQUEST']._serialized_end=1098
  _globals['_QUERYTOTALESCROWFORDENOMRESPONSE']._serialized_start=1100
  _globals['_QUERYTOTALESCROWFORDENOMRESPONSE']._serialized_end=1191
  _globals['_QUERY']._serialized_start=1194
  _globals['_QUERY']._serialized_end=2306
# @@protoc_insertion_point(module_scope)