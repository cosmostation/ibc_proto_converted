# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/provider/v2/querier.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2
from sentinel.provider.v2 import params_pb2 as sentinel_dot_provider_dot_v2_dot_params__pb2
from sentinel.provider.v2 import provider_pb2 as sentinel_dot_provider_dot_v2_dot_provider__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"sentinel/provider/v2/querier.proto\x12\x14sentinel.provider.v2\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1esentinel/types/v1/status.proto\x1a!sentinel/provider/v2/params.proto\x1a#sentinel/provider/v2/provider.proto\"\x92\x01\n\x15QueryProvidersRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x31\n\x06status\x18\x02 \x01(\x0e\x32\x19.sentinel.types.v1.StatusR\x06status\"0\n\x14QueryProviderRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"\x14\n\x12QueryParamsRequest\"\xa5\x01\n\x16QueryProvidersResponse\x12\x42\n\tproviders\x18\x01 \x03(\x0b\x32\x1e.sentinel.provider.v2.ProviderB\x04\xc8\xde\x1f\x00R\tproviders\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"Y\n\x15QueryProviderResponse\x12@\n\x08provider\x18\x01 \x01(\x0b\x32\x1e.sentinel.provider.v2.ProviderB\x04\xc8\xde\x1f\x00R\x08provider\"Q\n\x13QueryParamsResponse\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.sentinel.provider.v2.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\xb3\x03\n\x0cQueryService\x12\x88\x01\n\x0eQueryProviders\x12+.sentinel.provider.v2.QueryProvidersRequest\x1a,.sentinel.provider.v2.QueryProvidersResponse\"\x1b\x82\xd3\xe4\x93\x02\x15\x12\x13/sentinel/providers\x12\x8f\x01\n\rQueryProvider\x12*.sentinel.provider.v2.QueryProviderRequest\x1a+.sentinel.provider.v2.QueryProviderResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/sentinel/providers/{address}\x12\x85\x01\n\x0bQueryParams\x12(.sentinel.provider.v2.QueryParamsRequest\x1a).sentinel.provider.v2.QueryParamsResponse\"!\x82\xd3\xe4\x93\x02\x1b\x12\x19/sentinel/params/providerB\xd3\x01\n\x18\x63om.sentinel.provider.v2B\x0cQuerierProtoZ1github.com/sentinel-official/hub/x/provider/types\xa2\x02\x03SPX\xaa\x02\x14Sentinel.Provider.V2\xca\x02\x14Sentinel\\Provider\\V2\xe2\x02 Sentinel\\Provider\\V2\\GPBMetadata\xea\x02\x16Sentinel::Provider::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.provider.v2.querier_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.sentinel.provider.v2B\014QuerierProtoZ1github.com/sentinel-official/hub/x/provider/types\242\002\003SPX\252\002\024Sentinel.Provider.V2\312\002\024Sentinel\\Provider\\V2\342\002 Sentinel\\Provider\\V2\\GPBMetadata\352\002\026Sentinel::Provider::V2\310\341\036\000\250\342\036\000'
  _globals['_QUERYPROVIDERSRESPONSE'].fields_by_name['providers']._options = None
  _globals['_QUERYPROVIDERSRESPONSE'].fields_by_name['providers']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPROVIDERRESPONSE'].fields_by_name['provider']._options = None
  _globals['_QUERYPROVIDERRESPONSE'].fields_by_name['provider']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYSERVICE'].methods_by_name['QueryProviders']._options = None
  _globals['_QUERYSERVICE'].methods_by_name['QueryProviders']._serialized_options = b'\202\323\344\223\002\025\022\023/sentinel/providers'
  _globals['_QUERYSERVICE'].methods_by_name['QueryProvider']._options = None
  _globals['_QUERYSERVICE'].methods_by_name['QueryProvider']._serialized_options = b'\202\323\344\223\002\037\022\035/sentinel/providers/{address}'
  _globals['_QUERYSERVICE'].methods_by_name['QueryParams']._options = None
  _globals['_QUERYSERVICE'].methods_by_name['QueryParams']._serialized_options = b'\202\323\344\223\002\033\022\031/sentinel/params/provider'
  _globals['_QUERYPROVIDERSREQUEST']._serialized_start=261
  _globals['_QUERYPROVIDERSREQUEST']._serialized_end=407
  _globals['_QUERYPROVIDERREQUEST']._serialized_start=409
  _globals['_QUERYPROVIDERREQUEST']._serialized_end=457
  _globals['_QUERYPARAMSREQUEST']._serialized_start=459
  _globals['_QUERYPARAMSREQUEST']._serialized_end=479
  _globals['_QUERYPROVIDERSRESPONSE']._serialized_start=482
  _globals['_QUERYPROVIDERSRESPONSE']._serialized_end=647
  _globals['_QUERYPROVIDERRESPONSE']._serialized_start=649
  _globals['_QUERYPROVIDERRESPONSE']._serialized_end=738
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=740
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=821
  _globals['_QUERYSERVICE']._serialized_start=824
  _globals['_QUERYSERVICE']._serialized_end=1259
# @@protoc_insertion_point(module_scope)
