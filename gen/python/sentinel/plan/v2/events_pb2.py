# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/plan/v2/events.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dsentinel/plan/v2/events.proto\x12\x10sentinel.plan.v2\x1a\x14gogoproto/gogo.proto\x1a\x1esentinel/types/v1/status.proto\"2\n\x0b\x45ventCreate\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\"~\n\x11\x45ventUpdateStatus\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x44\n\x06status\x18\x03 \x01(\x0e\x32\x19.sentinel.types.v1.StatusB\x11\xf2\xde\x1f\ryaml:\"status\"R\x06status\"b\n\rEventLinkNode\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\"d\n\x0f\x45ventUnlinkNode\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\"u\n\x17\x45ventCreateSubscription\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x35\n\x07plan_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PlanID\xf2\xde\x1f\x0eyaml:\"plan_id\"R\x06planIdB\xba\x01\n\x14\x63om.sentinel.plan.v2B\x0b\x45ventsProtoZ-github.com/sentinel-official/hub/x/plan/types\xa2\x02\x03SPX\xaa\x02\x10Sentinel.Plan.V2\xca\x02\x10Sentinel\\Plan\\V2\xe2\x02\x1cSentinel\\Plan\\V2\\GPBMetadata\xea\x02\x12Sentinel::Plan::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.plan.v2.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.sentinel.plan.v2B\013EventsProtoZ-github.com/sentinel-official/hub/x/plan/types\242\002\003SPX\252\002\020Sentinel.Plan.V2\312\002\020Sentinel\\Plan\\V2\342\002\034Sentinel\\Plan\\V2\\GPBMetadata\352\002\022Sentinel::Plan::V2\310\341\036\000\250\342\036\000'
  _globals['_EVENTCREATE'].fields_by_name['id']._options = None
  _globals['_EVENTCREATE'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTUPDATESTATUS'].fields_by_name['id']._options = None
  _globals['_EVENTUPDATESTATUS'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTUPDATESTATUS'].fields_by_name['status']._options = None
  _globals['_EVENTUPDATESTATUS'].fields_by_name['status']._serialized_options = b'\362\336\037\ryaml:\"status\"'
  _globals['_EVENTLINKNODE'].fields_by_name['id']._options = None
  _globals['_EVENTLINKNODE'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTLINKNODE'].fields_by_name['address']._options = None
  _globals['_EVENTLINKNODE'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTUNLINKNODE'].fields_by_name['id']._options = None
  _globals['_EVENTUNLINKNODE'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTUNLINKNODE'].fields_by_name['address']._options = None
  _globals['_EVENTUNLINKNODE'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTCREATESUBSCRIPTION'].fields_by_name['id']._options = None
  _globals['_EVENTCREATESUBSCRIPTION'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTCREATESUBSCRIPTION'].fields_by_name['plan_id']._options = None
  _globals['_EVENTCREATESUBSCRIPTION'].fields_by_name['plan_id']._serialized_options = b'\342\336\037\006PlanID\362\336\037\016yaml:\"plan_id\"'
  _globals['_EVENTCREATE']._serialized_start=105
  _globals['_EVENTCREATE']._serialized_end=155
  _globals['_EVENTUPDATESTATUS']._serialized_start=157
  _globals['_EVENTUPDATESTATUS']._serialized_end=283
  _globals['_EVENTLINKNODE']._serialized_start=285
  _globals['_EVENTLINKNODE']._serialized_end=383
  _globals['_EVENTUNLINKNODE']._serialized_start=385
  _globals['_EVENTUNLINKNODE']._serialized_end=485
  _globals['_EVENTCREATESUBSCRIPTION']._serialized_start=487
  _globals['_EVENTCREATESUBSCRIPTION']._serialized_end=604
# @@protoc_insertion_point(module_scope)
