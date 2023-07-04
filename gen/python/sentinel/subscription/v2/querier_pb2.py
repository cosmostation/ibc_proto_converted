# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/subscription/v2/querier.proto
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
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from sentinel.subscription.v2 import allocation_pb2 as sentinel_dot_subscription_dot_v2_dot_allocation__pb2
from sentinel.subscription.v2 import params_pb2 as sentinel_dot_subscription_dot_v2_dot_params__pb2
from sentinel.subscription.v2 import payout_pb2 as sentinel_dot_subscription_dot_v2_dot_payout__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&sentinel/subscription/v2/querier.proto\x12\x18sentinel.subscription.v2\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a)sentinel/subscription/v2/allocation.proto\x1a%sentinel/subscription/v2/params.proto\x1a%sentinel/subscription/v2/payout.proto\"c\n\x19QuerySubscriptionsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x87\x01\n#QuerySubscriptionsForAccountRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x84\x01\n QuerySubscriptionsForNodeRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"z\n QuerySubscriptionsForPlanRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"*\n\x18QuerySubscriptionRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"B\n\x16QueryAllocationRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"q\n\x17QueryAllocationsRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"]\n\x13QueryPayoutsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x81\x01\n\x1dQueryPayoutsForAccountRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"~\n\x1aQueryPayoutsForNodeRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"$\n\x12QueryPayoutRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"\x14\n\x12QueryParamsRequest\"\xa1\x01\n\x1aQuerySubscriptionsResponse\x12:\n\rsubscriptions\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\rsubscriptions\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xab\x01\n$QuerySubscriptionsForAccountResponse\x12:\n\rsubscriptions\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\rsubscriptions\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xa8\x01\n!QuerySubscriptionsForNodeResponse\x12:\n\rsubscriptions\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\rsubscriptions\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xa8\x01\n!QuerySubscriptionsForPlanResponse\x12:\n\rsubscriptions\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\rsubscriptions\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"U\n\x19QuerySubscriptionResponse\x12\x38\n\x0csubscription\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyR\x0csubscription\"e\n\x17QueryAllocationResponse\x12J\n\nallocation\x18\x01 \x01(\x0b\x32$.sentinel.subscription.v2.AllocationB\x04\xc8\xde\x1f\x00R\nallocation\"\xb1\x01\n\x18QueryAllocationsResponse\x12L\n\x0b\x61llocations\x18\x01 \x03(\x0b\x32$.sentinel.subscription.v2.AllocationB\x04\xc8\xde\x1f\x00R\x0b\x61llocations\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xa1\x01\n\x14QueryPayoutsResponse\x12@\n\x07payouts\x18\x01 \x03(\x0b\x32 .sentinel.subscription.v2.PayoutB\x04\xc8\xde\x1f\x00R\x07payouts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xab\x01\n\x1eQueryPayoutsForAccountResponse\x12@\n\x07payouts\x18\x01 \x03(\x0b\x32 .sentinel.subscription.v2.PayoutB\x04\xc8\xde\x1f\x00R\x07payouts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xa8\x01\n\x1bQueryPayoutsForNodeResponse\x12@\n\x07payouts\x18\x01 \x03(\x0b\x32 .sentinel.subscription.v2.PayoutB\x04\xc8\xde\x1f\x00R\x07payouts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"U\n\x13QueryPayoutResponse\x12>\n\x06payout\x18\x01 \x01(\x0b\x32 .sentinel.subscription.v2.PayoutB\x04\xc8\xde\x1f\x00R\x06payout\"U\n\x13QueryParamsResponse\x12>\n\x06params\x18\x01 \x01(\x0b\x32 .sentinel.subscription.v2.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\xb8\x10\n\x0cQueryService\x12\xa0\x01\n\x12QuerySubscriptions\x12\x33.sentinel.subscription.v2.QuerySubscriptionsRequest\x1a\x34.sentinel.subscription.v2.QuerySubscriptionsResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\x12\x17/sentinel/subscriptions\x12\xd1\x01\n\x1cQuerySubscriptionsForAccount\x12=.sentinel.subscription.v2.QuerySubscriptionsForAccountRequest\x1a>.sentinel.subscription.v2.QuerySubscriptionsForAccountResponse\"2\x82\xd3\xe4\x93\x02,\x12*/sentinel/accounts/{address}/subscriptions\x12\xc5\x01\n\x19QuerySubscriptionsForNode\x12:.sentinel.subscription.v2.QuerySubscriptionsForNodeRequest\x1a;.sentinel.subscription.v2.QuerySubscriptionsForNodeResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/sentinel/nodes/{address}/subscriptions\x12\xc0\x01\n\x19QuerySubscriptionsForPlan\x12:.sentinel.subscription.v2.QuerySubscriptionsForPlanRequest\x1a;.sentinel.subscription.v2.QuerySubscriptionsForPlanResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/sentinel/plans/{id}/subscriptions\x12\xa2\x01\n\x11QuerySubscription\x12\x32.sentinel.subscription.v2.QuerySubscriptionRequest\x1a\x33.sentinel.subscription.v2.QuerySubscriptionResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/sentinel/subscriptions/{id}\x12\xab\x01\n\x10QueryAllocations\x12\x31.sentinel.subscription.v2.QueryAllocationsRequest\x1a\x32.sentinel.subscription.v2.QueryAllocationsResponse\"0\x82\xd3\xe4\x93\x02*\x12(/sentinel/subscriptions/{id}/allocations\x12\xb2\x01\n\x0fQueryAllocation\x12\x30.sentinel.subscription.v2.QueryAllocationRequest\x1a\x31.sentinel.subscription.v2.QueryAllocationResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/sentinel/subscriptions/{id}/allocations/{address}\x12\x88\x01\n\x0cQueryPayouts\x12-.sentinel.subscription.v2.QueryPayoutsRequest\x1a..sentinel.subscription.v2.QueryPayoutsResponse\"\x19\x82\xd3\xe4\x93\x02\x13\x12\x11/sentinel/payouts\x12\xb9\x01\n\x16QueryPayoutsForAccount\x12\x37.sentinel.subscription.v2.QueryPayoutsForAccountRequest\x1a\x38.sentinel.subscription.v2.QueryPayoutsForAccountResponse\",\x82\xd3\xe4\x93\x02&\x12$/sentinel/accounts/{address}/payouts\x12\xad\x01\n\x13QueryPayoutsForNode\x12\x34.sentinel.subscription.v2.QueryPayoutsForNodeRequest\x1a\x35.sentinel.subscription.v2.QueryPayoutsForNodeResponse\")\x82\xd3\xe4\x93\x02#\x12!/sentinel/nodes/{address}/payouts\x12\x8a\x01\n\x0bQueryPayout\x12,.sentinel.subscription.v2.QueryPayoutRequest\x1a-.sentinel.subscription.v2.QueryPayoutResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/sentinel/payouts/{id}\x12\x99\x01\n\x0bQueryParams\x12,.sentinel.subscription.v2.QueryParamsRequest\x1a-.sentinel.subscription.v2.QueryParamsResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/sentinel/modules/subscription/paramsB\xed\x01\n\x1c\x63om.sentinel.subscription.v2B\x0cQuerierProtoP\x01Z5github.com/sentinel-official/hub/x/subscription/types\xa2\x02\x03SSX\xaa\x02\x18Sentinel.Subscription.V2\xca\x02\x18Sentinel\\Subscription\\V2\xe2\x02$Sentinel\\Subscription\\V2\\GPBMetadata\xea\x02\x1aSentinel::Subscription::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.subscription.v2.querier_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.sentinel.subscription.v2B\014QuerierProtoP\001Z5github.com/sentinel-official/hub/x/subscription/types\242\002\003SSX\252\002\030Sentinel.Subscription.V2\312\002\030Sentinel\\Subscription\\V2\342\002$Sentinel\\Subscription\\V2\\GPBMetadata\352\002\032Sentinel::Subscription::V2\310\341\036\000\250\342\036\000'
  _QUERYALLOCATIONRESPONSE.fields_by_name['allocation']._options = None
  _QUERYALLOCATIONRESPONSE.fields_by_name['allocation']._serialized_options = b'\310\336\037\000'
  _QUERYALLOCATIONSRESPONSE.fields_by_name['allocations']._options = None
  _QUERYALLOCATIONSRESPONSE.fields_by_name['allocations']._serialized_options = b'\310\336\037\000'
  _QUERYPAYOUTSRESPONSE.fields_by_name['payouts']._options = None
  _QUERYPAYOUTSRESPONSE.fields_by_name['payouts']._serialized_options = b'\310\336\037\000'
  _QUERYPAYOUTSFORACCOUNTRESPONSE.fields_by_name['payouts']._options = None
  _QUERYPAYOUTSFORACCOUNTRESPONSE.fields_by_name['payouts']._serialized_options = b'\310\336\037\000'
  _QUERYPAYOUTSFORNODERESPONSE.fields_by_name['payouts']._options = None
  _QUERYPAYOUTSFORNODERESPONSE.fields_by_name['payouts']._serialized_options = b'\310\336\037\000'
  _QUERYPAYOUTRESPONSE.fields_by_name['payout']._options = None
  _QUERYPAYOUTRESPONSE.fields_by_name['payout']._serialized_options = b'\310\336\037\000'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYSERVICE.methods_by_name['QuerySubscriptions']._options = None
  _QUERYSERVICE.methods_by_name['QuerySubscriptions']._serialized_options = b'\202\323\344\223\002\031\022\027/sentinel/subscriptions'
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForAccount']._options = None
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForAccount']._serialized_options = b'\202\323\344\223\002,\022*/sentinel/accounts/{address}/subscriptions'
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForNode']._options = None
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForNode']._serialized_options = b'\202\323\344\223\002)\022\'/sentinel/nodes/{address}/subscriptions'
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForPlan']._options = None
  _QUERYSERVICE.methods_by_name['QuerySubscriptionsForPlan']._serialized_options = b'\202\323\344\223\002$\022\"/sentinel/plans/{id}/subscriptions'
  _QUERYSERVICE.methods_by_name['QuerySubscription']._options = None
  _QUERYSERVICE.methods_by_name['QuerySubscription']._serialized_options = b'\202\323\344\223\002\036\022\034/sentinel/subscriptions/{id}'
  _QUERYSERVICE.methods_by_name['QueryAllocations']._options = None
  _QUERYSERVICE.methods_by_name['QueryAllocations']._serialized_options = b'\202\323\344\223\002*\022(/sentinel/subscriptions/{id}/allocations'
  _QUERYSERVICE.methods_by_name['QueryAllocation']._options = None
  _QUERYSERVICE.methods_by_name['QueryAllocation']._serialized_options = b'\202\323\344\223\0024\0222/sentinel/subscriptions/{id}/allocations/{address}'
  _QUERYSERVICE.methods_by_name['QueryPayouts']._options = None
  _QUERYSERVICE.methods_by_name['QueryPayouts']._serialized_options = b'\202\323\344\223\002\023\022\021/sentinel/payouts'
  _QUERYSERVICE.methods_by_name['QueryPayoutsForAccount']._options = None
  _QUERYSERVICE.methods_by_name['QueryPayoutsForAccount']._serialized_options = b'\202\323\344\223\002&\022$/sentinel/accounts/{address}/payouts'
  _QUERYSERVICE.methods_by_name['QueryPayoutsForNode']._options = None
  _QUERYSERVICE.methods_by_name['QueryPayoutsForNode']._serialized_options = b'\202\323\344\223\002#\022!/sentinel/nodes/{address}/payouts'
  _QUERYSERVICE.methods_by_name['QueryPayout']._options = None
  _QUERYSERVICE.methods_by_name['QueryPayout']._serialized_options = b'\202\323\344\223\002\030\022\026/sentinel/payouts/{id}'
  _QUERYSERVICE.methods_by_name['QueryParams']._options = None
  _QUERYSERVICE.methods_by_name['QueryParams']._serialized_options = b'\202\323\344\223\002\'\022%/sentinel/modules/subscription/params'
  _globals['_QUERYSUBSCRIPTIONSREQUEST']._serialized_start=312
  _globals['_QUERYSUBSCRIPTIONSREQUEST']._serialized_end=411
  _globals['_QUERYSUBSCRIPTIONSFORACCOUNTREQUEST']._serialized_start=414
  _globals['_QUERYSUBSCRIPTIONSFORACCOUNTREQUEST']._serialized_end=549
  _globals['_QUERYSUBSCRIPTIONSFORNODEREQUEST']._serialized_start=552
  _globals['_QUERYSUBSCRIPTIONSFORNODEREQUEST']._serialized_end=684
  _globals['_QUERYSUBSCRIPTIONSFORPLANREQUEST']._serialized_start=686
  _globals['_QUERYSUBSCRIPTIONSFORPLANREQUEST']._serialized_end=808
  _globals['_QUERYSUBSCRIPTIONREQUEST']._serialized_start=810
  _globals['_QUERYSUBSCRIPTIONREQUEST']._serialized_end=852
  _globals['_QUERYALLOCATIONREQUEST']._serialized_start=854
  _globals['_QUERYALLOCATIONREQUEST']._serialized_end=920
  _globals['_QUERYALLOCATIONSREQUEST']._serialized_start=922
  _globals['_QUERYALLOCATIONSREQUEST']._serialized_end=1035
  _globals['_QUERYPAYOUTSREQUEST']._serialized_start=1037
  _globals['_QUERYPAYOUTSREQUEST']._serialized_end=1130
  _globals['_QUERYPAYOUTSFORACCOUNTREQUEST']._serialized_start=1133
  _globals['_QUERYPAYOUTSFORACCOUNTREQUEST']._serialized_end=1262
  _globals['_QUERYPAYOUTSFORNODEREQUEST']._serialized_start=1264
  _globals['_QUERYPAYOUTSFORNODEREQUEST']._serialized_end=1390
  _globals['_QUERYPAYOUTREQUEST']._serialized_start=1392
  _globals['_QUERYPAYOUTREQUEST']._serialized_end=1428
  _globals['_QUERYPARAMSREQUEST']._serialized_start=1430
  _globals['_QUERYPARAMSREQUEST']._serialized_end=1450
  _globals['_QUERYSUBSCRIPTIONSRESPONSE']._serialized_start=1453
  _globals['_QUERYSUBSCRIPTIONSRESPONSE']._serialized_end=1614
  _globals['_QUERYSUBSCRIPTIONSFORACCOUNTRESPONSE']._serialized_start=1617
  _globals['_QUERYSUBSCRIPTIONSFORACCOUNTRESPONSE']._serialized_end=1788
  _globals['_QUERYSUBSCRIPTIONSFORNODERESPONSE']._serialized_start=1791
  _globals['_QUERYSUBSCRIPTIONSFORNODERESPONSE']._serialized_end=1959
  _globals['_QUERYSUBSCRIPTIONSFORPLANRESPONSE']._serialized_start=1962
  _globals['_QUERYSUBSCRIPTIONSFORPLANRESPONSE']._serialized_end=2130
  _globals['_QUERYSUBSCRIPTIONRESPONSE']._serialized_start=2132
  _globals['_QUERYSUBSCRIPTIONRESPONSE']._serialized_end=2217
  _globals['_QUERYALLOCATIONRESPONSE']._serialized_start=2219
  _globals['_QUERYALLOCATIONRESPONSE']._serialized_end=2320
  _globals['_QUERYALLOCATIONSRESPONSE']._serialized_start=2323
  _globals['_QUERYALLOCATIONSRESPONSE']._serialized_end=2500
  _globals['_QUERYPAYOUTSRESPONSE']._serialized_start=2503
  _globals['_QUERYPAYOUTSRESPONSE']._serialized_end=2664
  _globals['_QUERYPAYOUTSFORACCOUNTRESPONSE']._serialized_start=2667
  _globals['_QUERYPAYOUTSFORACCOUNTRESPONSE']._serialized_end=2838
  _globals['_QUERYPAYOUTSFORNODERESPONSE']._serialized_start=2841
  _globals['_QUERYPAYOUTSFORNODERESPONSE']._serialized_end=3009
  _globals['_QUERYPAYOUTRESPONSE']._serialized_start=3011
  _globals['_QUERYPAYOUTRESPONSE']._serialized_end=3096
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=3098
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=3183
  _globals['_QUERYSERVICE']._serialized_start=3186
  _globals['_QUERYSERVICE']._serialized_end=5290
# @@protoc_insertion_point(module_scope)