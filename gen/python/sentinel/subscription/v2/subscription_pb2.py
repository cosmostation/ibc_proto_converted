# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/subscription/v2/subscription.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+sentinel/subscription/v2/subscription.proto\x12\x18sentinel.subscription.v2\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1esentinel/types/v1/status.proto\"\xfd\x01\n\x10\x42\x61seSubscription\x12\x16\n\x02id\x18\x01 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x41\n\texpiry_at\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x08\x65xpiryAt\x12\x31\n\x06status\x18\x04 \x01(\x0e\x32\x19.sentinel.types.v1.StatusR\x06status\x12\x41\n\tstatus_at\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x08statusAt\"\xea\x01\n\x10NodeSubscription\x12\x44\n\x04\x62\x61se\x18\x01 \x01(\x0b\x32*.sentinel.subscription.v2.BaseSubscriptionB\x04\xd0\xde\x1f\x01R\x04\x62\x61se\x12!\n\x0cnode_address\x18\x02 \x01(\tR\x0bnodeAddress\x12\x1c\n\tgigabytes\x18\x03 \x01(\x03R\tgigabytes\x12\x14\n\x05hours\x18\x04 \x01(\x03R\x05hours\x12\x39\n\x07\x64\x65posit\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07\x64\x65posit\"\x93\x01\n\x10PlanSubscription\x12\x44\n\x04\x62\x61se\x18\x01 \x01(\x0b\x32*.sentinel.subscription.v2.BaseSubscriptionB\x04\xd0\xde\x1f\x01R\x04\x62\x61se\x12#\n\x07plan_id\x18\x02 \x01(\x04\x42\n\xe2\xde\x1f\x06PlanIDR\x06planId\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom*}\n\x10SubscriptionType\x12)\n\x10TYPE_UNSPECIFIED\x10\x00\x1a\x13\x8a\x9d \x0fTypeUnspecified\x12\x1b\n\tTYPE_NODE\x10\x01\x1a\x0c\x8a\x9d \x08TypeNode\x12\x1b\n\tTYPE_PLAN\x10\x02\x1a\x0c\x8a\x9d \x08TypePlan\x1a\x04\x88\xa3\x1e\x00\x42\xf2\x01\n\x1c\x63om.sentinel.subscription.v2B\x11SubscriptionProtoP\x01Z5github.com/sentinel-official/hub/x/subscription/types\xa2\x02\x03SSX\xaa\x02\x18Sentinel.Subscription.V2\xca\x02\x18Sentinel\\Subscription\\V2\xe2\x02$Sentinel\\Subscription\\V2\\GPBMetadata\xea\x02\x1aSentinel::Subscription::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.subscription.v2.subscription_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.sentinel.subscription.v2B\021SubscriptionProtoP\001Z5github.com/sentinel-official/hub/x/subscription/types\242\002\003SSX\252\002\030Sentinel.Subscription.V2\312\002\030Sentinel\\Subscription\\V2\342\002$Sentinel\\Subscription\\V2\\GPBMetadata\352\002\032Sentinel::Subscription::V2\310\341\036\000\250\342\036\000'
  _SUBSCRIPTIONTYPE._options = None
  _SUBSCRIPTIONTYPE._serialized_options = b'\210\243\036\000'
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_UNSPECIFIED"]._options = None
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \017TypeUnspecified'
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_NODE"]._options = None
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_NODE"]._serialized_options = b'\212\235 \010TypeNode'
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_PLAN"]._options = None
  _SUBSCRIPTIONTYPE.values_by_name["TYPE_PLAN"]._serialized_options = b'\212\235 \010TypePlan'
  _BASESUBSCRIPTION.fields_by_name['id']._options = None
  _BASESUBSCRIPTION.fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _BASESUBSCRIPTION.fields_by_name['expiry_at']._options = None
  _BASESUBSCRIPTION.fields_by_name['expiry_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _BASESUBSCRIPTION.fields_by_name['status_at']._options = None
  _BASESUBSCRIPTION.fields_by_name['status_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _NODESUBSCRIPTION.fields_by_name['base']._options = None
  _NODESUBSCRIPTION.fields_by_name['base']._serialized_options = b'\320\336\037\001'
  _NODESUBSCRIPTION.fields_by_name['deposit']._options = None
  _NODESUBSCRIPTION.fields_by_name['deposit']._serialized_options = b'\310\336\037\000'
  _PLANSUBSCRIPTION.fields_by_name['base']._options = None
  _PLANSUBSCRIPTION.fields_by_name['base']._serialized_options = b'\320\336\037\001'
  _PLANSUBSCRIPTION.fields_by_name['plan_id']._options = None
  _PLANSUBSCRIPTION.fields_by_name['plan_id']._serialized_options = b'\342\336\037\006PlanID'
  _globals['_SUBSCRIPTIONTYPE']._serialized_start=835
  _globals['_SUBSCRIPTIONTYPE']._serialized_end=960
  _globals['_BASESUBSCRIPTION']._serialized_start=193
  _globals['_BASESUBSCRIPTION']._serialized_end=446
  _globals['_NODESUBSCRIPTION']._serialized_start=449
  _globals['_NODESUBSCRIPTION']._serialized_end=683
  _globals['_PLANSUBSCRIPTION']._serialized_start=686
  _globals['_PLANSUBSCRIPTION']._serialized_end=833
# @@protoc_insertion_point(module_scope)