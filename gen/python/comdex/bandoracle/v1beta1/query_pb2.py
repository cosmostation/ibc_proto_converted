# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/bandoracle/v1beta1/query.proto
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
from comdex.bandoracle.v1beta1 import fetch_price_pb2 as comdex_dot_bandoracle_dot_v1beta1_dot_fetch__price__pb2
from comdex.bandoracle.v1beta1 import params_pb2 as comdex_dot_bandoracle_dot_v1beta1_dot_params__pb2
from comdex.bandoracle.v1beta1 import tx_pb2 as comdex_dot_bandoracle_dot_v1beta1_dot_tx__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%comdex/bandoracle/v1beta1/query.proto\x12\x19\x63omdex.bandoracle.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a+comdex/bandoracle/v1beta1/fetch_price.proto\x1a&comdex/bandoracle/v1beta1/params.proto\x1a\"comdex/bandoracle/v1beta1/tx.proto\"\x14\n\x12QueryParamsRequest\"g\n\x13QueryParamsResponse\x12P\n\x06params\x18\x01 \x01(\x0b\x32!.comdex.bandoracle.v1beta1.ParamsB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"params\"R\x06params\"7\n\x16QueryFetchPriceRequest\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\"^\n\x17QueryFetchPriceResponse\x12\x43\n\x06result\x18\x01 \x01(\x0b\x32+.comdex.bandoracle.v1beta1.FetchPriceResultR\x06result\"\x1e\n\x1cQueryLastFetchPriceIdRequest\">\n\x1dQueryLastFetchPriceIdResponse\x12\x1d\n\nrequest_id\x18\x01 \x01(\x03R\trequestId\"\x1c\n\x1aQueryFetchPriceDataRequest\"\x9b\x01\n\x1bQueryFetchPriceDataResponse\x12|\n\x11msgFetchPriceData\x18\x01 \x01(\x0b\x32,.comdex.bandoracle.v1beta1.MsgFetchPriceDataB \xc8\xde\x1f\x00\xf2\xde\x1f\x18yaml:\"msgFetchPriceData\"R\x11msgFetchPriceData\"\x19\n\x17QueryDiscardDataRequest\"\x80\x01\n\x18QueryDiscardDataResponse\x12\x64\n\x0b\x64iscardData\x18\x01 \x01(\x0b\x32&.comdex.bandoracle.v1beta1.DiscardDataB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"discardData\"R\x0b\x64iscardData2\xfd\x06\n\x05Query\x12\x92\x01\n\x06Params\x12-.comdex.bandoracle.v1beta1.QueryParamsRequest\x1a..comdex.bandoracle.v1beta1.QueryParamsResponse\")\x82\xd3\xe4\x93\x02#\x12!/comdex/bandoracle/v1beta1/params\x12\xbd\x01\n\x10\x46\x65tchPriceResult\x12\x31.comdex.bandoracle.v1beta1.QueryFetchPriceRequest\x1a\x32.comdex.bandoracle.v1beta1.QueryFetchPriceResponse\"B\x82\xd3\xe4\x93\x02<\x12:/comdex/bandoracle/v1beta1/fetch_price_result/{request_id}\x12\xbd\x01\n\x10LastFetchPriceID\x12\x37.comdex.bandoracle.v1beta1.QueryLastFetchPriceIdRequest\x1a\x38.comdex.bandoracle.v1beta1.QueryLastFetchPriceIdResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./comdex/bandoracle/v1beta1/last_fetch_price_id\x12\xb4\x01\n\x0e\x46\x65tchPriceData\x12\x35.comdex.bandoracle.v1beta1.QueryFetchPriceDataRequest\x1a\x36.comdex.bandoracle.v1beta1.QueryFetchPriceDataResponse\"3\x82\xd3\xe4\x93\x02-\x12+/comdex/bandoracle/v1beta1/fetch_price_data\x12\xa7\x01\n\x0b\x44iscardData\x12\x32.comdex.bandoracle.v1beta1.QueryDiscardDataRequest\x1a\x33.comdex.bandoracle.v1beta1.QueryDiscardDataResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/comdex/bandoracle/v1beta1/discard_dataB\xe5\x01\n\x1d\x63om.comdex.bandoracle.v1beta1B\nQueryProtoZ4github.com/comdex-official/comdex/x/bandoracle/types\xa2\x02\x03\x43\x42X\xaa\x02\x19\x43omdex.Bandoracle.V1beta1\xca\x02\x19\x43omdex\\Bandoracle\\V1beta1\xe2\x02%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\xea\x02\x1b\x43omdex::Bandoracle::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.bandoracle.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.comdex.bandoracle.v1beta1B\nQueryProtoZ4github.com/comdex-official/comdex/x/bandoracle/types\242\002\003CBX\252\002\031Comdex.Bandoracle.V1beta1\312\002\031Comdex\\Bandoracle\\V1beta1\342\002%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\352\002\033Comdex::Bandoracle::V1beta1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"params\"'
  _globals['_QUERYFETCHPRICEDATARESPONSE'].fields_by_name['msgFetchPriceData']._options = None
  _globals['_QUERYFETCHPRICEDATARESPONSE'].fields_by_name['msgFetchPriceData']._serialized_options = b'\310\336\037\000\362\336\037\030yaml:\"msgFetchPriceData\"'
  _globals['_QUERYDISCARDDATARESPONSE'].fields_by_name['discardData']._options = None
  _globals['_QUERYDISCARDDATARESPONSE'].fields_by_name['discardData']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"discardData\"'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002#\022!/comdex/bandoracle/v1beta1/params'
  _globals['_QUERY'].methods_by_name['FetchPriceResult']._options = None
  _globals['_QUERY'].methods_by_name['FetchPriceResult']._serialized_options = b'\202\323\344\223\002<\022:/comdex/bandoracle/v1beta1/fetch_price_result/{request_id}'
  _globals['_QUERY'].methods_by_name['LastFetchPriceID']._options = None
  _globals['_QUERY'].methods_by_name['LastFetchPriceID']._serialized_options = b'\202\323\344\223\0020\022./comdex/bandoracle/v1beta1/last_fetch_price_id'
  _globals['_QUERY'].methods_by_name['FetchPriceData']._options = None
  _globals['_QUERY'].methods_by_name['FetchPriceData']._serialized_options = b'\202\323\344\223\002-\022+/comdex/bandoracle/v1beta1/fetch_price_data'
  _globals['_QUERY'].methods_by_name['DiscardData']._options = None
  _globals['_QUERY'].methods_by_name['DiscardData']._serialized_options = b'\202\323\344\223\002)\022\'/comdex/bandoracle/v1beta1/discard_data'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=241
  _globals['_QUERYPARAMSREQUEST']._serialized_end=261
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=263
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=366
  _globals['_QUERYFETCHPRICEREQUEST']._serialized_start=368
  _globals['_QUERYFETCHPRICEREQUEST']._serialized_end=423
  _globals['_QUERYFETCHPRICERESPONSE']._serialized_start=425
  _globals['_QUERYFETCHPRICERESPONSE']._serialized_end=519
  _globals['_QUERYLASTFETCHPRICEIDREQUEST']._serialized_start=521
  _globals['_QUERYLASTFETCHPRICEIDREQUEST']._serialized_end=551
  _globals['_QUERYLASTFETCHPRICEIDRESPONSE']._serialized_start=553
  _globals['_QUERYLASTFETCHPRICEIDRESPONSE']._serialized_end=615
  _globals['_QUERYFETCHPRICEDATAREQUEST']._serialized_start=617
  _globals['_QUERYFETCHPRICEDATAREQUEST']._serialized_end=645
  _globals['_QUERYFETCHPRICEDATARESPONSE']._serialized_start=648
  _globals['_QUERYFETCHPRICEDATARESPONSE']._serialized_end=803
  _globals['_QUERYDISCARDDATAREQUEST']._serialized_start=805
  _globals['_QUERYDISCARDDATAREQUEST']._serialized_end=830
  _globals['_QUERYDISCARDDATARESPONSE']._serialized_start=833
  _globals['_QUERYDISCARDDATARESPONSE']._serialized_end=961
  _globals['_QUERY']._serialized_start=964
  _globals['_QUERY']._serialized_end=1857
# @@protoc_insertion_point(module_scope)
