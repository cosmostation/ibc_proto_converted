# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmwasm/wasm/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmwasm.wasm.v1 import types_pb2 as cosmwasm_dot_wasm_dot_v1_dot_types__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x63osmwasm/wasm/v1/query.proto\x12\x10\x63osmwasm.wasm.v1\x1a\x14gogoproto/gogo.proto\x1a\x1c\x63osmwasm/wasm/v1/types.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\"4\n\x18QueryContractInfoRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"\x8e\x01\n\x19QueryContractInfoResponse\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12Q\n\rcontract_info\x18\x02 \x01(\x0b\x32\x1e.cosmwasm.wasm.v1.ContractInfoB\x0c\xc8\xde\x1f\x00\xd0\xde\x1f\x01\xea\xde\x1f\x00R\x0c\x63ontractInfo:\x04\xe8\xa0\x1f\x01\"\x7f\n\x1bQueryContractHistoryRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xb3\x01\n\x1cQueryContractHistoryResponse\x12J\n\x07\x65ntries\x18\x01 \x03(\x0b\x32*.cosmwasm.wasm.v1.ContractCodeHistoryEntryB\x04\xc8\xde\x1f\x00R\x07\x65ntries\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"~\n\x1bQueryContractsByCodeRequest\x12\x17\n\x07\x63ode_id\x18\x01 \x01(\x04R\x06\x63odeId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x85\x01\n\x1cQueryContractsByCodeResponse\x12\x1c\n\tcontracts\x18\x01 \x03(\tR\tcontracts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x80\x01\n\x1cQueryAllContractStateRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9f\x01\n\x1dQueryAllContractStateResponse\x12\x35\n\x06models\x18\x01 \x03(\x0b\x32\x17.cosmwasm.wasm.v1.ModelB\x04\xc8\xde\x1f\x00R\x06models\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"W\n\x1cQueryRawContractStateRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x1d\n\nquery_data\x18\x02 \x01(\x0cR\tqueryData\"3\n\x1dQueryRawContractStateResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"q\n\x1eQuerySmartContractStateRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x35\n\nquery_data\x18\x02 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\tqueryData\"M\n\x1fQuerySmartContractStateResponse\x12*\n\x04\x64\x61ta\x18\x01 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\x04\x64\x61ta\"+\n\x10QueryCodeRequest\x12\x17\n\x07\x63ode_id\x18\x01 \x01(\x04R\x06\x63odeId\"\x9d\x02\n\x10\x43odeInfoResponse\x12)\n\x07\x63ode_id\x18\x01 \x01(\x04\x42\x10\xe2\xde\x1f\x06\x43odeID\xea\xde\x1f\x02idR\x06\x63odeId\x12\x18\n\x07\x63reator\x18\x02 \x01(\tR\x07\x63reator\x12U\n\tdata_hash\x18\x03 \x01(\x0c\x42\x38\xfa\xde\x1f\x34github.com/tendermint/tendermint/libs/bytes.HexBytesR\x08\x64\x61taHash\x12[\n\x16instantiate_permission\x18\x06 \x01(\x0b\x32\x1e.cosmwasm.wasm.v1.AccessConfigB\x04\xc8\xde\x1f\x00R\x15instantiatePermission:\x04\xe8\xa0\x1f\x01J\x04\x08\x04\x10\x05J\x04\x08\x05\x10\x06\"\x82\x01\n\x11QueryCodeResponse\x12I\n\tcode_info\x18\x01 \x01(\x0b\x32\".cosmwasm.wasm.v1.CodeInfoResponseB\x08\xd0\xde\x1f\x01\xea\xde\x1f\x00R\x08\x63odeInfo\x12\x1c\n\x04\x64\x61ta\x18\x02 \x01(\x0c\x42\x08\xea\xde\x1f\x04\x64\x61taR\x04\x64\x61ta:\x04\xe8\xa0\x1f\x01\"[\n\x11QueryCodesRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa6\x01\n\x12QueryCodesResponse\x12G\n\ncode_infos\x18\x01 \x03(\x0b\x32\".cosmwasm.wasm.v1.CodeInfoResponseB\x04\xc8\xde\x1f\x00R\tcodeInfos\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"a\n\x17QueryPinnedCodesRequest\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x8f\x01\n\x18QueryPinnedCodesResponse\x12*\n\x08\x63ode_ids\x18\x01 \x03(\x04\x42\x0f\xc8\xde\x1f\x00\xe2\xde\x1f\x07\x43odeIDsR\x07\x63odeIds\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x14\n\x12QueryParamsRequest\"M\n\x13QueryParamsResponse\x12\x36\n\x06params\x18\x01 \x01(\x0b\x32\x18.cosmwasm.wasm.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x88\x0c\n\x05Query\x12\x95\x01\n\x0c\x43ontractInfo\x12*.cosmwasm.wasm.v1.QueryContractInfoRequest\x1a+.cosmwasm.wasm.v1.QueryContractInfoResponse\",\x82\xd3\xe4\x93\x02&\x12$/cosmwasm/wasm/v1/contract/{address}\x12\xa6\x01\n\x0f\x43ontractHistory\x12-.cosmwasm.wasm.v1.QueryContractHistoryRequest\x1a..cosmwasm.wasm.v1.QueryContractHistoryResponse\"4\x82\xd3\xe4\x93\x02.\x12,/cosmwasm/wasm/v1/contract/{address}/history\x12\xa4\x01\n\x0f\x43ontractsByCode\x12-.cosmwasm.wasm.v1.QueryContractsByCodeRequest\x1a..cosmwasm.wasm.v1.QueryContractsByCodeResponse\"2\x82\xd3\xe4\x93\x02,\x12*/cosmwasm/wasm/v1/code/{code_id}/contracts\x12\xa7\x01\n\x10\x41llContractState\x12..cosmwasm.wasm.v1.QueryAllContractStateRequest\x1a/.cosmwasm.wasm.v1.QueryAllContractStateResponse\"2\x82\xd3\xe4\x93\x02,\x12*/cosmwasm/wasm/v1/contract/{address}/state\x12\xb2\x01\n\x10RawContractState\x12..cosmwasm.wasm.v1.QueryRawContractStateRequest\x1a/.cosmwasm.wasm.v1.QueryRawContractStateResponse\"=\x82\xd3\xe4\x93\x02\x37\x12\x35/cosmwasm/wasm/v1/contract/{address}/raw/{query_data}\x12\xba\x01\n\x12SmartContractState\x12\x30.cosmwasm.wasm.v1.QuerySmartContractStateRequest\x1a\x31.cosmwasm.wasm.v1.QuerySmartContractStateResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/cosmwasm/wasm/v1/contract/{address}/smart/{query_data}\x12y\n\x04\x43ode\x12\".cosmwasm.wasm.v1.QueryCodeRequest\x1a#.cosmwasm.wasm.v1.QueryCodeResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /cosmwasm/wasm/v1/code/{code_id}\x12r\n\x05\x43odes\x12#.cosmwasm.wasm.v1.QueryCodesRequest\x1a$.cosmwasm.wasm.v1.QueryCodesResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/cosmwasm/wasm/v1/code\x12\x8c\x01\n\x0bPinnedCodes\x12).cosmwasm.wasm.v1.QueryPinnedCodesRequest\x1a*.cosmwasm.wasm.v1.QueryPinnedCodesResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/cosmwasm/wasm/v1/codes/pinned\x12}\n\x06Params\x12$.cosmwasm.wasm.v1.QueryParamsRequest\x1a%.cosmwasm.wasm.v1.QueryParamsResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/cosmwasm/wasm/v1/codes/paramsB\xb2\x01\n\x14\x63om.cosmwasm.wasm.v1B\nQueryProtoZ&github.com/CosmWasm/wasmd/x/wasm/types\xa2\x02\x03\x43WX\xaa\x02\x10\x43osmwasm.Wasm.V1\xca\x02\x10\x43osmwasm\\Wasm\\V1\xe2\x02\x1c\x43osmwasm\\Wasm\\V1\\GPBMetadata\xea\x02\x12\x43osmwasm::Wasm::V1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmwasm.wasm.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.cosmwasm.wasm.v1B\nQueryProtoZ&github.com/CosmWasm/wasmd/x/wasm/types\242\002\003CWX\252\002\020Cosmwasm.Wasm.V1\312\002\020Cosmwasm\\Wasm\\V1\342\002\034Cosmwasm\\Wasm\\V1\\GPBMetadata\352\002\022Cosmwasm::Wasm::V1\310\341\036\000\250\342\036\000'
  _globals['_QUERYCONTRACTINFORESPONSE'].fields_by_name['contract_info']._options = None
  _globals['_QUERYCONTRACTINFORESPONSE'].fields_by_name['contract_info']._serialized_options = b'\310\336\037\000\320\336\037\001\352\336\037\000'
  _globals['_QUERYCONTRACTINFORESPONSE']._options = None
  _globals['_QUERYCONTRACTINFORESPONSE']._serialized_options = b'\350\240\037\001'
  _globals['_QUERYCONTRACTHISTORYRESPONSE'].fields_by_name['entries']._options = None
  _globals['_QUERYCONTRACTHISTORYRESPONSE'].fields_by_name['entries']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYALLCONTRACTSTATERESPONSE'].fields_by_name['models']._options = None
  _globals['_QUERYALLCONTRACTSTATERESPONSE'].fields_by_name['models']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYSMARTCONTRACTSTATEREQUEST'].fields_by_name['query_data']._options = None
  _globals['_QUERYSMARTCONTRACTSTATEREQUEST'].fields_by_name['query_data']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_QUERYSMARTCONTRACTSTATERESPONSE'].fields_by_name['data']._options = None
  _globals['_QUERYSMARTCONTRACTSTATERESPONSE'].fields_by_name['data']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_CODEINFORESPONSE'].fields_by_name['code_id']._options = None
  _globals['_CODEINFORESPONSE'].fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID\352\336\037\002id'
  _globals['_CODEINFORESPONSE'].fields_by_name['data_hash']._options = None
  _globals['_CODEINFORESPONSE'].fields_by_name['data_hash']._serialized_options = b'\372\336\0374github.com/tendermint/tendermint/libs/bytes.HexBytes'
  _globals['_CODEINFORESPONSE'].fields_by_name['instantiate_permission']._options = None
  _globals['_CODEINFORESPONSE'].fields_by_name['instantiate_permission']._serialized_options = b'\310\336\037\000'
  _globals['_CODEINFORESPONSE']._options = None
  _globals['_CODEINFORESPONSE']._serialized_options = b'\350\240\037\001'
  _globals['_QUERYCODERESPONSE'].fields_by_name['code_info']._options = None
  _globals['_QUERYCODERESPONSE'].fields_by_name['code_info']._serialized_options = b'\320\336\037\001\352\336\037\000'
  _globals['_QUERYCODERESPONSE'].fields_by_name['data']._options = None
  _globals['_QUERYCODERESPONSE'].fields_by_name['data']._serialized_options = b'\352\336\037\004data'
  _globals['_QUERYCODERESPONSE']._options = None
  _globals['_QUERYCODERESPONSE']._serialized_options = b'\350\240\037\001'
  _globals['_QUERYCODESRESPONSE'].fields_by_name['code_infos']._options = None
  _globals['_QUERYCODESRESPONSE'].fields_by_name['code_infos']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPINNEDCODESRESPONSE'].fields_by_name['code_ids']._options = None
  _globals['_QUERYPINNEDCODESRESPONSE'].fields_by_name['code_ids']._serialized_options = b'\310\336\037\000\342\336\037\007CodeIDs'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['ContractInfo']._options = None
  _globals['_QUERY'].methods_by_name['ContractInfo']._serialized_options = b'\202\323\344\223\002&\022$/cosmwasm/wasm/v1/contract/{address}'
  _globals['_QUERY'].methods_by_name['ContractHistory']._options = None
  _globals['_QUERY'].methods_by_name['ContractHistory']._serialized_options = b'\202\323\344\223\002.\022,/cosmwasm/wasm/v1/contract/{address}/history'
  _globals['_QUERY'].methods_by_name['ContractsByCode']._options = None
  _globals['_QUERY'].methods_by_name['ContractsByCode']._serialized_options = b'\202\323\344\223\002,\022*/cosmwasm/wasm/v1/code/{code_id}/contracts'
  _globals['_QUERY'].methods_by_name['AllContractState']._options = None
  _globals['_QUERY'].methods_by_name['AllContractState']._serialized_options = b'\202\323\344\223\002,\022*/cosmwasm/wasm/v1/contract/{address}/state'
  _globals['_QUERY'].methods_by_name['RawContractState']._options = None
  _globals['_QUERY'].methods_by_name['RawContractState']._serialized_options = b'\202\323\344\223\0027\0225/cosmwasm/wasm/v1/contract/{address}/raw/{query_data}'
  _globals['_QUERY'].methods_by_name['SmartContractState']._options = None
  _globals['_QUERY'].methods_by_name['SmartContractState']._serialized_options = b'\202\323\344\223\0029\0227/cosmwasm/wasm/v1/contract/{address}/smart/{query_data}'
  _globals['_QUERY'].methods_by_name['Code']._options = None
  _globals['_QUERY'].methods_by_name['Code']._serialized_options = b'\202\323\344\223\002\"\022 /cosmwasm/wasm/v1/code/{code_id}'
  _globals['_QUERY'].methods_by_name['Codes']._options = None
  _globals['_QUERY'].methods_by_name['Codes']._serialized_options = b'\202\323\344\223\002\030\022\026/cosmwasm/wasm/v1/code'
  _globals['_QUERY'].methods_by_name['PinnedCodes']._options = None
  _globals['_QUERY'].methods_by_name['PinnedCodes']._serialized_options = b'\202\323\344\223\002 \022\036/cosmwasm/wasm/v1/codes/pinned'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002 \022\036/cosmwasm/wasm/v1/codes/params'
  _globals['_QUERYCONTRACTINFOREQUEST']._serialized_start=176
  _globals['_QUERYCONTRACTINFOREQUEST']._serialized_end=228
  _globals['_QUERYCONTRACTINFORESPONSE']._serialized_start=231
  _globals['_QUERYCONTRACTINFORESPONSE']._serialized_end=373
  _globals['_QUERYCONTRACTHISTORYREQUEST']._serialized_start=375
  _globals['_QUERYCONTRACTHISTORYREQUEST']._serialized_end=502
  _globals['_QUERYCONTRACTHISTORYRESPONSE']._serialized_start=505
  _globals['_QUERYCONTRACTHISTORYRESPONSE']._serialized_end=684
  _globals['_QUERYCONTRACTSBYCODEREQUEST']._serialized_start=686
  _globals['_QUERYCONTRACTSBYCODEREQUEST']._serialized_end=812
  _globals['_QUERYCONTRACTSBYCODERESPONSE']._serialized_start=815
  _globals['_QUERYCONTRACTSBYCODERESPONSE']._serialized_end=948
  _globals['_QUERYALLCONTRACTSTATEREQUEST']._serialized_start=951
  _globals['_QUERYALLCONTRACTSTATEREQUEST']._serialized_end=1079
  _globals['_QUERYALLCONTRACTSTATERESPONSE']._serialized_start=1082
  _globals['_QUERYALLCONTRACTSTATERESPONSE']._serialized_end=1241
  _globals['_QUERYRAWCONTRACTSTATEREQUEST']._serialized_start=1243
  _globals['_QUERYRAWCONTRACTSTATEREQUEST']._serialized_end=1330
  _globals['_QUERYRAWCONTRACTSTATERESPONSE']._serialized_start=1332
  _globals['_QUERYRAWCONTRACTSTATERESPONSE']._serialized_end=1383
  _globals['_QUERYSMARTCONTRACTSTATEREQUEST']._serialized_start=1385
  _globals['_QUERYSMARTCONTRACTSTATEREQUEST']._serialized_end=1498
  _globals['_QUERYSMARTCONTRACTSTATERESPONSE']._serialized_start=1500
  _globals['_QUERYSMARTCONTRACTSTATERESPONSE']._serialized_end=1577
  _globals['_QUERYCODEREQUEST']._serialized_start=1579
  _globals['_QUERYCODEREQUEST']._serialized_end=1622
  _globals['_CODEINFORESPONSE']._serialized_start=1625
  _globals['_CODEINFORESPONSE']._serialized_end=1910
  _globals['_QUERYCODERESPONSE']._serialized_start=1913
  _globals['_QUERYCODERESPONSE']._serialized_end=2043
  _globals['_QUERYCODESREQUEST']._serialized_start=2045
  _globals['_QUERYCODESREQUEST']._serialized_end=2136
  _globals['_QUERYCODESRESPONSE']._serialized_start=2139
  _globals['_QUERYCODESRESPONSE']._serialized_end=2305
  _globals['_QUERYPINNEDCODESREQUEST']._serialized_start=2307
  _globals['_QUERYPINNEDCODESREQUEST']._serialized_end=2404
  _globals['_QUERYPINNEDCODESRESPONSE']._serialized_start=2407
  _globals['_QUERYPINNEDCODESRESPONSE']._serialized_end=2550
  _globals['_QUERYPARAMSREQUEST']._serialized_start=2552
  _globals['_QUERYPARAMSREQUEST']._serialized_end=2572
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=2574
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=2651
  _globals['_QUERY']._serialized_start=2654
  _globals['_QUERY']._serialized_end=4198
# @@protoc_insertion_point(module_scope)
