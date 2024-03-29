# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/interchainqueries/query.proto
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
from neutron.interchainqueries import params_pb2 as neutron_dot_interchainqueries_dot_params__pb2
from neutron.interchainqueries import genesis_pb2 as neutron_dot_interchainqueries_dot_genesis__pb2
from neutron.interchainqueries import tx_pb2 as neutron_dot_interchainqueries_dot_tx__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%neutron/interchainqueries/query.proto\x12\x19neutron.interchainqueries\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a&neutron/interchainqueries/params.proto\x1a\'neutron/interchainqueries/genesis.proto\x1a\"neutron/interchainqueries/tx.proto\"\x14\n\x12QueryParamsRequest\"V\n\x13QueryParamsResponse\x12?\n\x06params\x18\x01 \x01(\x0b\x32!.neutron.interchainqueries.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\xa4\x01\n\x1dQueryRegisteredQueriesRequest\x12\x16\n\x06owners\x18\x01 \x03(\tR\x06owners\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xca\x01\n\x1eQueryRegisteredQueriesResponse\x12_\n\x12registered_queries\x18\x01 \x03(\x0b\x32*.neutron.interchainqueries.RegisteredQueryB\x04\xc8\xde\x1f\x00R\x11registeredQueries\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"8\n\x1bQueryRegisteredQueryRequest\x12\x19\n\x08query_id\x18\x01 \x01(\x04R\x07queryId\"u\n\x1cQueryRegisteredQueryResponse\x12U\n\x10registered_query\x18\x01 \x01(\x0b\x32*.neutron.interchainqueries.RegisteredQueryR\x0fregisteredQuery\">\n!QueryRegisteredQueryResultRequest\x12\x19\n\x08query_id\x18\x01 \x01(\x04R\x07queryId\"d\n\"QueryRegisteredQueryResultResponse\x12>\n\x06result\x18\x01 \x01(\x0b\x32&.neutron.interchainqueries.QueryResultR\x06result\"I\n\x0bTransaction\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x16\n\x06height\x18\x02 \x01(\x04R\x06height\x12\x12\n\x04\x64\x61ta\x18\x03 \x01(\x0cR\x04\x64\x61ta\"<\n\x15QueryLastRemoteHeight\x12#\n\rconnection_id\x18\x01 \x01(\tR\x0c\x63onnectionId\"7\n\x1dQueryLastRemoteHeightResponse\x12\x16\n\x06height\x18\x01 \x01(\x04R\x06height2\x89\x07\n\x05Query\x12\x92\x01\n\x06Params\x12-.neutron.interchainqueries.QueryParamsRequest\x1a..neutron.interchainqueries.QueryParamsResponse\")\x82\xd3\xe4\x93\x02#\x12!/neutron/interchainqueries/params\x12\xbf\x01\n\x11RegisteredQueries\x12\x38.neutron.interchainqueries.QueryRegisteredQueriesRequest\x1a\x39.neutron.interchainqueries.QueryRegisteredQueriesResponse\"5\x82\xd3\xe4\x93\x02/\x12-/neutron/interchainqueries/registered_queries\x12\xb7\x01\n\x0fRegisteredQuery\x12\x36.neutron.interchainqueries.QueryRegisteredQueryRequest\x1a\x37.neutron.interchainqueries.QueryRegisteredQueryResponse\"3\x82\xd3\xe4\x93\x02-\x12+/neutron/interchainqueries/registered_query\x12\xbb\x01\n\x0bQueryResult\x12<.neutron.interchainqueries.QueryRegisteredQueryResultRequest\x1a=.neutron.interchainqueries.QueryRegisteredQueryResultResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/neutron/interchainqueries/query_result\x12\xb0\x01\n\x10LastRemoteHeight\x12\x30.neutron.interchainqueries.QueryLastRemoteHeight\x1a\x38.neutron.interchainqueries.QueryLastRemoteHeightResponse\"0\x82\xd3\xe4\x93\x02*\x12(/neutron/interchainqueries/remote_heightB\xe8\x01\n\x1d\x63om.neutron.interchainqueriesB\nQueryProtoZ8github.com/neutron-org/neutron/x/interchainqueries/types\xa2\x02\x03NIX\xaa\x02\x19Neutron.Interchainqueries\xca\x02\x19Neutron\\Interchainqueries\xe2\x02%Neutron\\Interchainqueries\\GPBMetadata\xea\x02\x1aNeutron::Interchainqueriesb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.interchainqueries.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.neutron.interchainqueriesB\nQueryProtoZ8github.com/neutron-org/neutron/x/interchainqueries/types\242\002\003NIX\252\002\031Neutron.Interchainqueries\312\002\031Neutron\\Interchainqueries\342\002%Neutron\\Interchainqueries\\GPBMetadata\352\002\032Neutron::Interchainqueries'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYREGISTEREDQUERIESRESPONSE'].fields_by_name['registered_queries']._options = None
  _globals['_QUERYREGISTEREDQUERIESRESPONSE'].fields_by_name['registered_queries']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002#\022!/neutron/interchainqueries/params'
  _globals['_QUERY'].methods_by_name['RegisteredQueries']._options = None
  _globals['_QUERY'].methods_by_name['RegisteredQueries']._serialized_options = b'\202\323\344\223\002/\022-/neutron/interchainqueries/registered_queries'
  _globals['_QUERY'].methods_by_name['RegisteredQuery']._options = None
  _globals['_QUERY'].methods_by_name['RegisteredQuery']._serialized_options = b'\202\323\344\223\002-\022+/neutron/interchainqueries/registered_query'
  _globals['_QUERY'].methods_by_name['QueryResult']._options = None
  _globals['_QUERY'].methods_by_name['QueryResult']._serialized_options = b'\202\323\344\223\002)\022\'/neutron/interchainqueries/query_result'
  _globals['_QUERY'].methods_by_name['LastRemoteHeight']._options = None
  _globals['_QUERY'].methods_by_name['LastRemoteHeight']._serialized_options = b'\202\323\344\223\002*\022(/neutron/interchainqueries/remote_height'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=281
  _globals['_QUERYPARAMSREQUEST']._serialized_end=301
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=303
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=389
  _globals['_QUERYREGISTEREDQUERIESREQUEST']._serialized_start=392
  _globals['_QUERYREGISTEREDQUERIESREQUEST']._serialized_end=556
  _globals['_QUERYREGISTEREDQUERIESRESPONSE']._serialized_start=559
  _globals['_QUERYREGISTEREDQUERIESRESPONSE']._serialized_end=761
  _globals['_QUERYREGISTEREDQUERYREQUEST']._serialized_start=763
  _globals['_QUERYREGISTEREDQUERYREQUEST']._serialized_end=819
  _globals['_QUERYREGISTEREDQUERYRESPONSE']._serialized_start=821
  _globals['_QUERYREGISTEREDQUERYRESPONSE']._serialized_end=938
  _globals['_QUERYREGISTEREDQUERYRESULTREQUEST']._serialized_start=940
  _globals['_QUERYREGISTEREDQUERYRESULTREQUEST']._serialized_end=1002
  _globals['_QUERYREGISTEREDQUERYRESULTRESPONSE']._serialized_start=1004
  _globals['_QUERYREGISTEREDQUERYRESULTRESPONSE']._serialized_end=1104
  _globals['_TRANSACTION']._serialized_start=1106
  _globals['_TRANSACTION']._serialized_end=1179
  _globals['_QUERYLASTREMOTEHEIGHT']._serialized_start=1181
  _globals['_QUERYLASTREMOTEHEIGHT']._serialized_end=1241
  _globals['_QUERYLASTREMOTEHEIGHTRESPONSE']._serialized_start=1243
  _globals['_QUERYLASTREMOTEHEIGHTRESPONSE']._serialized_end=1298
  _globals['_QUERY']._serialized_start=1301
  _globals['_QUERY']._serialized_end=2206
# @@protoc_insertion_point(module_scope)
