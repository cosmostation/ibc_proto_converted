# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/delegation/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$kyve/delegation/v1beta1/params.proto\x12\x17kyve.delegation.v1beta1\x1a\x14gogoproto/gogo.proto\"\xa8\x03\n\x06Params\x12:\n\x19unbonding_delegation_time\x18\x01 \x01(\x04R\x17unbondingDelegationTime\x12\x33\n\x15redelegation_cooldown\x18\x02 \x01(\x04R\x14redelegationCooldown\x12\x36\n\x17redelegation_max_amount\x18\x03 \x01(\x04R\x15redelegationMaxAmount\x12M\n\nvote_slash\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tvoteSlash\x12Q\n\x0cupload_slash\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0buploadSlash\x12S\n\rtimeout_slash\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0ctimeoutSlashB\xd9\x01\n\x1b\x63om.kyve.delegation.v1beta1B\x0bParamsProtoP\x01Z/github.com/KYVENetwork/chain/x/delegation/types\xa2\x02\x03KDX\xaa\x02\x17Kyve.Delegation.V1beta1\xca\x02\x17Kyve\\Delegation\\V1beta1\xe2\x02#Kyve\\Delegation\\V1beta1\\GPBMetadata\xea\x02\x19Kyve::Delegation::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.delegation.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.kyve.delegation.v1beta1B\013ParamsProtoP\001Z/github.com/KYVENetwork/chain/x/delegation/types\242\002\003KDX\252\002\027Kyve.Delegation.V1beta1\312\002\027Kyve\\Delegation\\V1beta1\342\002#Kyve\\Delegation\\V1beta1\\GPBMetadata\352\002\031Kyve::Delegation::V1beta1'
  _PARAMS.fields_by_name['vote_slash']._options = None
  _PARAMS.fields_by_name['vote_slash']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['upload_slash']._options = None
  _PARAMS.fields_by_name['upload_slash']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['timeout_slash']._options = None
  _PARAMS.fields_by_name['timeout_slash']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._serialized_start=88
  _globals['_PARAMS']._serialized_end=512
# @@protoc_insertion_point(module_scope)