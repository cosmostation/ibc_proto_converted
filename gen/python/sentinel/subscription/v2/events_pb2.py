# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/subscription/v2/events.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%sentinel/subscription/v2/events.proto\x12\x18sentinel.subscription.v2\x1a\x14gogoproto/gogo.proto\x1a\x1esentinel/types/v1/status.proto\"~\n\x11\x45ventUpdateStatus\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x44\n\x06status\x18\x02 \x01(\x0e\x32\x19.sentinel.types.v1.StatusB\x11\xf2\xde\x1f\ryaml:\"status\"R\x06status\"\xa8\x01\n\rEventAllocate\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12\x44\n\x05\x62ytes\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05\x62ytes\"\x9c\x01\n\x0b\x45ventPayout\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12:\n\x0cnode_address\x18\x03 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"node_address\"R\x0bnodeAddressB\xea\x01\n\x1c\x63om.sentinel.subscription.v2B\x0b\x45ventsProtoZ5github.com/sentinel-official/hub/x/subscription/types\xa2\x02\x03SSX\xaa\x02\x18Sentinel.Subscription.V2\xca\x02\x18Sentinel\\Subscription\\V2\xe2\x02$Sentinel\\Subscription\\V2\\GPBMetadata\xea\x02\x1aSentinel::Subscription::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.subscription.v2.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.sentinel.subscription.v2B\013EventsProtoZ5github.com/sentinel-official/hub/x/subscription/types\242\002\003SSX\252\002\030Sentinel.Subscription.V2\312\002\030Sentinel\\Subscription\\V2\342\002$Sentinel\\Subscription\\V2\\GPBMetadata\352\002\032Sentinel::Subscription::V2\310\341\036\000\250\342\036\000'
  _globals['_EVENTUPDATESTATUS'].fields_by_name['id']._options = None
  _globals['_EVENTUPDATESTATUS'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTUPDATESTATUS'].fields_by_name['status']._options = None
  _globals['_EVENTUPDATESTATUS'].fields_by_name['status']._serialized_options = b'\362\336\037\ryaml:\"status\"'
  _globals['_EVENTALLOCATE'].fields_by_name['id']._options = None
  _globals['_EVENTALLOCATE'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTALLOCATE'].fields_by_name['address']._options = None
  _globals['_EVENTALLOCATE'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTALLOCATE'].fields_by_name['bytes']._options = None
  _globals['_EVENTALLOCATE'].fields_by_name['bytes']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_EVENTPAYOUT'].fields_by_name['id']._options = None
  _globals['_EVENTPAYOUT'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_EVENTPAYOUT'].fields_by_name['address']._options = None
  _globals['_EVENTPAYOUT'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_EVENTPAYOUT'].fields_by_name['node_address']._options = None
  _globals['_EVENTPAYOUT'].fields_by_name['node_address']._serialized_options = b'\362\336\037\023yaml:\"node_address\"'
  _globals['_EVENTUPDATESTATUS']._serialized_start=121
  _globals['_EVENTUPDATESTATUS']._serialized_end=247
  _globals['_EVENTALLOCATE']._serialized_start=250
  _globals['_EVENTALLOCATE']._serialized_end=418
  _globals['_EVENTPAYOUT']._serialized_start=421
  _globals['_EVENTPAYOUT']._serialized_end=577
# @@protoc_insertion_point(module_scope)
