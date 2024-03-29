# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/audit/v1beta3/query.proto
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
from akash.audit.v1beta3 import audit_pb2 as akash_dot_audit_dot_v1beta3_dot_audit__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x61kash/audit/v1beta3/query.proto\x12\x13\x61kash.audit.v1beta3\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1f\x61kash/audit/v1beta3/audit.proto\"\xb1\x01\n\x16QueryProvidersResponse\x12N\n\tproviders\x18\x01 \x03(\x0b\x32\x1d.akash.audit.v1beta3.ProviderB\x11\xc8\xde\x1f\x00\xaa\xdf\x1f\tProvidersR\tproviders\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"F\n\x14QueryProviderRequest\x12\x18\n\x07\x61uditor\x18\x01 \x01(\tR\x07\x61uditor\x12\x14\n\x05owner\x18\x02 \x01(\tR\x05owner\"l\n\"QueryAllProvidersAttributesRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"~\n\x1eQueryProviderAttributesRequest\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"M\n\x1bQueryProviderAuditorRequest\x12\x18\n\x07\x61uditor\x18\x01 \x01(\tR\x07\x61uditor\x12\x14\n\x05owner\x18\x02 \x01(\tR\x05owner\"\x81\x01\n\x1dQueryAuditorAttributesRequest\x12\x18\n\x07\x61uditor\x18\x01 \x01(\tR\x07\x61uditor\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination2\xde\x05\n\x05Query\x12\xb2\x01\n\x16\x41llProvidersAttributes\x12\x37.akash.audit.v1beta3.QueryAllProvidersAttributesRequest\x1a+.akash.audit.v1beta3.QueryProvidersResponse\"2\x82\xd3\xe4\x93\x02,\x12*/akash/audit/v1beta3/audit/attributes/list\x12\xb2\x01\n\x12ProviderAttributes\x12\x33.akash.audit.v1beta3.QueryProviderAttributesRequest\x1a+.akash.audit.v1beta3.QueryProvidersResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/akash/audit/v1beta3/audit/attributes/{owner}/list\x12\xbb\x01\n\x19ProviderAuditorAttributes\x12\x30.akash.audit.v1beta3.QueryProviderAuditorRequest\x1a+.akash.audit.v1beta3.QueryProvidersResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/akash/audit/v1beta3/audit/attributes/{auditor}/{owner}\x12\xac\x01\n\x11\x41uditorAttributes\x12\x32.akash.audit.v1beta3.QueryAuditorAttributesRequest\x1a+.akash.audit.v1beta3.QueryProvidersResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./akash/provider/v1beta3/auditor/{auditor}/listB\xcb\x01\n\x17\x63om.akash.audit.v1beta3B\nQueryProtoZ8github.com/akash-network/akash-api/go/node/audit/v1beta3\xa2\x02\x03\x41\x41X\xaa\x02\x13\x41kash.Audit.V1beta3\xca\x02\x13\x41kash\\Audit\\V1beta3\xe2\x02\x1f\x41kash\\Audit\\V1beta3\\GPBMetadata\xea\x02\x15\x41kash::Audit::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.audit.v1beta3.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.akash.audit.v1beta3B\nQueryProtoZ8github.com/akash-network/akash-api/go/node/audit/v1beta3\242\002\003AAX\252\002\023Akash.Audit.V1beta3\312\002\023Akash\\Audit\\V1beta3\342\002\037Akash\\Audit\\V1beta3\\GPBMetadata\352\002\025Akash::Audit::V1beta3'
  _globals['_QUERYPROVIDERSRESPONSE'].fields_by_name['providers']._options = None
  _globals['_QUERYPROVIDERSRESPONSE'].fields_by_name['providers']._serialized_options = b'\310\336\037\000\252\337\037\tProviders'
  _globals['_QUERY'].methods_by_name['AllProvidersAttributes']._options = None
  _globals['_QUERY'].methods_by_name['AllProvidersAttributes']._serialized_options = b'\202\323\344\223\002,\022*/akash/audit/v1beta3/audit/attributes/list'
  _globals['_QUERY'].methods_by_name['ProviderAttributes']._options = None
  _globals['_QUERY'].methods_by_name['ProviderAttributes']._serialized_options = b'\202\323\344\223\0024\0222/akash/audit/v1beta3/audit/attributes/{owner}/list'
  _globals['_QUERY'].methods_by_name['ProviderAuditorAttributes']._options = None
  _globals['_QUERY'].methods_by_name['ProviderAuditorAttributes']._serialized_options = b'\202\323\344\223\0029\0227/akash/audit/v1beta3/audit/attributes/{auditor}/{owner}'
  _globals['_QUERY'].methods_by_name['AuditorAttributes']._options = None
  _globals['_QUERY'].methods_by_name['AuditorAttributes']._serialized_options = b'\202\323\344\223\0020\022./akash/provider/v1beta3/auditor/{auditor}/list'
  _globals['_QUERYPROVIDERSRESPONSE']._serialized_start=186
  _globals['_QUERYPROVIDERSRESPONSE']._serialized_end=363
  _globals['_QUERYPROVIDERREQUEST']._serialized_start=365
  _globals['_QUERYPROVIDERREQUEST']._serialized_end=435
  _globals['_QUERYALLPROVIDERSATTRIBUTESREQUEST']._serialized_start=437
  _globals['_QUERYALLPROVIDERSATTRIBUTESREQUEST']._serialized_end=545
  _globals['_QUERYPROVIDERATTRIBUTESREQUEST']._serialized_start=547
  _globals['_QUERYPROVIDERATTRIBUTESREQUEST']._serialized_end=673
  _globals['_QUERYPROVIDERAUDITORREQUEST']._serialized_start=675
  _globals['_QUERYPROVIDERAUDITORREQUEST']._serialized_end=752
  _globals['_QUERYAUDITORATTRIBUTESREQUEST']._serialized_start=755
  _globals['_QUERYAUDITORATTRIBUTESREQUEST']._serialized_end=884
  _globals['_QUERY']._serialized_start=887
  _globals['_QUERY']._serialized_end=1621
# @@protoc_insertion_point(module_scope)
