# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/team/v1beta1/team.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ckyve/team/v1beta1/team.proto\x12\x11kyve.team.v1beta1\"Y\n\tAuthority\x12#\n\rtotal_rewards\x18\x01 \x01(\x04R\x0ctotalRewards\x12\'\n\x0frewards_claimed\x18\x02 \x01(\x04R\x0erewardsClaimed\"\xb4\x02\n\x12TeamVestingAccount\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12)\n\x10total_allocation\x18\x02 \x01(\x04R\x0ftotalAllocation\x12\"\n\x0c\x63ommencement\x18\x03 \x01(\x04R\x0c\x63ommencement\x12\x1a\n\x08\x63lawback\x18\x04 \x01(\x04R\x08\x63lawback\x12)\n\x10unlocked_claimed\x18\x05 \x01(\x04R\x0funlockedClaimed\x12*\n\x11last_claimed_time\x18\x06 \x01(\x04R\x0flastClaimedTime\x12#\n\rtotal_rewards\x18\x07 \x01(\x04R\x0ctotalRewards\x12\'\n\x0frewards_claimed\x18\x08 \x01(\x04R\x0erewardsClaimedB\xb1\x01\n\x15\x63om.kyve.team.v1beta1B\tTeamProtoZ)github.com/KYVENetwork/chain/x/team/types\xa2\x02\x03KTX\xaa\x02\x11Kyve.Team.V1beta1\xca\x02\x11Kyve\\Team\\V1beta1\xe2\x02\x1dKyve\\Team\\V1beta1\\GPBMetadata\xea\x02\x13Kyve::Team::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.team.v1beta1.team_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.kyve.team.v1beta1B\tTeamProtoZ)github.com/KYVENetwork/chain/x/team/types\242\002\003KTX\252\002\021Kyve.Team.V1beta1\312\002\021Kyve\\Team\\V1beta1\342\002\035Kyve\\Team\\V1beta1\\GPBMetadata\352\002\023Kyve::Team::V1beta1'
  _globals['_AUTHORITY']._serialized_start=51
  _globals['_AUTHORITY']._serialized_end=140
  _globals['_TEAMVESTINGACCOUNT']._serialized_start=143
  _globals['_TEAMVESTINGACCOUNT']._serialized_end=451
# @@protoc_insertion_point(module_scope)
