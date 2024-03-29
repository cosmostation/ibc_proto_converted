# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/pool/v1beta1/events.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ekyve/pool/v1beta1/events.proto\x12\x11kyve.pool.v1beta1\"\xc4\x03\n\x0f\x45ventCreatePool\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x18\n\x07runtime\x18\x03 \x01(\tR\x07runtime\x12\x12\n\x04logo\x18\x04 \x01(\tR\x04logo\x12\x16\n\x06\x63onfig\x18\x05 \x01(\tR\x06\x63onfig\x12\x1b\n\tstart_key\x18\x06 \x01(\tR\x08startKey\x12\'\n\x0fupload_interval\x18\x07 \x01(\x04R\x0euploadInterval\x12%\n\x0eoperating_cost\x18\x08 \x01(\x04R\roperatingCost\x12%\n\x0emin_delegation\x18\t \x01(\x04R\rminDelegation\x12&\n\x0fmax_bundle_size\x18\n \x01(\x04R\rmaxBundleSize\x12\x18\n\x07version\x18\x0b \x01(\tR\x07version\x12\x1a\n\x08\x62inaries\x18\x0c \x01(\tR\x08\x62inaries\x12.\n\x13storage_provider_id\x18\r \x01(\rR\x11storageProviderId\x12%\n\x0e\x63ompression_id\x18\x0e \x01(\rR\rcompressionId\"\"\n\x10\x45ventPoolEnabled\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"#\n\x11\x45ventPoolDisabled\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"\xd4\x01\n\x1c\x45ventRuntimeUpgradeScheduled\x12\x18\n\x07runtime\x18\x01 \x01(\tR\x07runtime\x12\x18\n\x07version\x18\x02 \x01(\tR\x07version\x12!\n\x0cscheduled_at\x18\x03 \x01(\x04R\x0bscheduledAt\x12\x1a\n\x08\x64uration\x18\x04 \x01(\x04R\x08\x64uration\x12\x1a\n\x08\x62inaries\x18\x05 \x01(\tR\x08\x62inaries\x12%\n\x0e\x61\x66\x66\x65\x63ted_pools\x18\x06 \x03(\x04R\raffectedPools\"_\n\x1c\x45ventRuntimeUpgradeCancelled\x12\x18\n\x07runtime\x18\x01 \x01(\tR\x07runtime\x12%\n\x0e\x61\x66\x66\x65\x63ted_pools\x18\x02 \x03(\x04R\raffectedPools\"\x9e\x03\n\x10\x45ventPoolUpdated\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12*\n\x11raw_update_string\x18\x02 \x01(\tR\x0frawUpdateString\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x18\n\x07runtime\x18\x04 \x01(\tR\x07runtime\x12\x12\n\x04logo\x18\x05 \x01(\tR\x04logo\x12\x16\n\x06\x63onfig\x18\x06 \x01(\tR\x06\x63onfig\x12\'\n\x0fupload_interval\x18\x07 \x01(\x04R\x0euploadInterval\x12%\n\x0eoperating_cost\x18\x08 \x01(\x04R\roperatingCost\x12%\n\x0emin_delegation\x18\t \x01(\x04R\rminDelegation\x12&\n\x0fmax_bundle_size\x18\n \x01(\x04R\rmaxBundleSize\x12.\n\x13storage_provider_id\x18\x0b \x01(\rR\x11storageProviderId\x12%\n\x0e\x63ompression_id\x18\x0c \x01(\rR\rcompressionId\"Z\n\rEventFundPool\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06\x61mount\x18\x03 \x01(\x04R\x06\x61mount\"\\\n\x0f\x45ventDefundPool\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06\x61mount\x18\x03 \x01(\x04R\x06\x61mount\"b\n\x15\x45ventPoolFundsSlashed\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x16\n\x06\x61mount\x18\x03 \x01(\x04R\x06\x61mount\".\n\x13\x45ventPoolOutOfFunds\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolIdB\xb3\x01\n\x15\x63om.kyve.pool.v1beta1B\x0b\x45ventsProtoZ)github.com/KYVENetwork/chain/x/pool/types\xa2\x02\x03KPX\xaa\x02\x11Kyve.Pool.V1beta1\xca\x02\x11Kyve\\Pool\\V1beta1\xe2\x02\x1dKyve\\Pool\\V1beta1\\GPBMetadata\xea\x02\x13Kyve::Pool::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.pool.v1beta1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.kyve.pool.v1beta1B\013EventsProtoZ)github.com/KYVENetwork/chain/x/pool/types\242\002\003KPX\252\002\021Kyve.Pool.V1beta1\312\002\021Kyve\\Pool\\V1beta1\342\002\035Kyve\\Pool\\V1beta1\\GPBMetadata\352\002\023Kyve::Pool::V1beta1'
  _globals['_EVENTCREATEPOOL']._serialized_start=54
  _globals['_EVENTCREATEPOOL']._serialized_end=506
  _globals['_EVENTPOOLENABLED']._serialized_start=508
  _globals['_EVENTPOOLENABLED']._serialized_end=542
  _globals['_EVENTPOOLDISABLED']._serialized_start=544
  _globals['_EVENTPOOLDISABLED']._serialized_end=579
  _globals['_EVENTRUNTIMEUPGRADESCHEDULED']._serialized_start=582
  _globals['_EVENTRUNTIMEUPGRADESCHEDULED']._serialized_end=794
  _globals['_EVENTRUNTIMEUPGRADECANCELLED']._serialized_start=796
  _globals['_EVENTRUNTIMEUPGRADECANCELLED']._serialized_end=891
  _globals['_EVENTPOOLUPDATED']._serialized_start=894
  _globals['_EVENTPOOLUPDATED']._serialized_end=1308
  _globals['_EVENTFUNDPOOL']._serialized_start=1310
  _globals['_EVENTFUNDPOOL']._serialized_end=1400
  _globals['_EVENTDEFUNDPOOL']._serialized_start=1402
  _globals['_EVENTDEFUNDPOOL']._serialized_end=1494
  _globals['_EVENTPOOLFUNDSSLASHED']._serialized_start=1496
  _globals['_EVENTPOOLFUNDSSLASHED']._serialized_end=1594
  _globals['_EVENTPOOLOUTOFFUNDS']._serialized_start=1596
  _globals['_EVENTPOOLOUTOFFUNDS']._serialized_end=1642
# @@protoc_insertion_point(module_scope)
