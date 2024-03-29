# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/query/v1beta1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from kyve.pool.v1beta1 import pool_pb2 as kyve_dot_pool_dot_v1beta1_dot_pool__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ekyve/query/v1beta1/query.proto\x12\x12kyve.query.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1ckyve/pool/v1beta1/pool.proto\"\xb0\x02\n\tBasicPool\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x18\n\x07runtime\x18\x03 \x01(\tR\x07runtime\x12\x12\n\x04logo\x18\x04 \x01(\tR\x04logo\x12%\n\x0eoperating_cost\x18\x05 \x01(\x04R\roperatingCost\x12\'\n\x0fupload_interval\x18\x06 \x01(\x04R\x0euploadInterval\x12\x1f\n\x0btotal_funds\x18\x07 \x01(\x04R\ntotalFunds\x12)\n\x10total_delegation\x18\x08 \x01(\x04R\x0ftotalDelegation\x12\x35\n\x06status\x18\t \x01(\x0e\x32\x1d.kyve.pool.v1beta1.PoolStatusR\x06status\"\xd9\x02\n\nFullStaker\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12>\n\x08metadata\x18\x02 \x01(\x0b\x32\".kyve.query.v1beta1.StakerMetadataR\x08metadata\x12\'\n\x0fself_delegation\x18\x03 \x01(\x04R\x0eselfDelegation\x12:\n\x19self_delegation_unbonding\x18\x04 \x01(\x04R\x17selfDelegationUnbonding\x12)\n\x10total_delegation\x18\x05 \x01(\x04R\x0ftotalDelegation\x12\'\n\x0f\x64\x65legator_count\x18\x06 \x01(\x04R\x0e\x64\x65legatorCount\x12\x38\n\x05pools\x18\x07 \x03(\x0b\x32\".kyve.query.v1beta1.PoolMembershipR\x05pools\"\xdc\x02\n\x0eStakerMetadata\x12N\n\ncommission\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\ncommission\x12\x18\n\x07moniker\x18\x02 \x01(\tR\x07moniker\x12\x18\n\x07website\x18\x03 \x01(\tR\x07website\x12\x1a\n\x08identity\x18\x04 \x01(\tR\x08identity\x12)\n\x10security_contact\x18\x05 \x01(\tR\x0fsecurityContact\x12\x18\n\x07\x64\x65tails\x18\x06 \x01(\tR\x07\x64\x65tails\x12\x65\n\x19pending_commission_change\x18\x07 \x01(\x0b\x32).kyve.query.v1beta1.CommissionChangeEntryR\x17pendingCommissionChange\"\x8c\x01\n\x15\x43ommissionChangeEntry\x12N\n\ncommission\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\ncommission\x12#\n\rcreation_date\x18\x02 \x01(\x03R\x0c\x63reationDate\"\xb4\x01\n\x0ePoolMembership\x12\x31\n\x04pool\x18\x01 \x01(\x0b\x32\x1d.kyve.query.v1beta1.BasicPoolR\x04pool\x12\x16\n\x06points\x18\x02 \x01(\x04R\x06points\x12\x1d\n\nis_leaving\x18\x03 \x01(\x08R\tisLeaving\x12\x1e\n\nvaladdress\x18\x04 \x01(\tR\nvaladdress\x12\x18\n\x07\x62\x61lance\x18\x05 \x01(\x04R\x07\x62\x61lanceB\xb8\x01\n\x16\x63om.kyve.query.v1beta1B\nQueryProtoZ*github.com/KYVENetwork/chain/x/query/types\xa2\x02\x03KQX\xaa\x02\x12Kyve.Query.V1beta1\xca\x02\x12Kyve\\Query\\V1beta1\xe2\x02\x1eKyve\\Query\\V1beta1\\GPBMetadata\xea\x02\x14Kyve::Query::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.query.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.kyve.query.v1beta1B\nQueryProtoZ*github.com/KYVENetwork/chain/x/query/types\242\002\003KQX\252\002\022Kyve.Query.V1beta1\312\002\022Kyve\\Query\\V1beta1\342\002\036Kyve\\Query\\V1beta1\\GPBMetadata\352\002\024Kyve::Query::V1beta1'
  _globals['_STAKERMETADATA'].fields_by_name['commission']._options = None
  _globals['_STAKERMETADATA'].fields_by_name['commission']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_COMMISSIONCHANGEENTRY'].fields_by_name['commission']._options = None
  _globals['_COMMISSIONCHANGEENTRY'].fields_by_name['commission']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_BASICPOOL']._serialized_start=107
  _globals['_BASICPOOL']._serialized_end=411
  _globals['_FULLSTAKER']._serialized_start=414
  _globals['_FULLSTAKER']._serialized_end=759
  _globals['_STAKERMETADATA']._serialized_start=762
  _globals['_STAKERMETADATA']._serialized_end=1110
  _globals['_COMMISSIONCHANGEENTRY']._serialized_start=1113
  _globals['_COMMISSIONCHANGEENTRY']._serialized_end=1253
  _globals['_POOLMEMBERSHIP']._serialized_start=1256
  _globals['_POOLMEMBERSHIP']._serialized_end=1436
# @@protoc_insertion_point(module_scope)
