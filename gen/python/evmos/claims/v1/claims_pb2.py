# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/claims/v1/claims.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x65vmos/claims/v1/claims.proto\x12\x0f\x65vmos.claims.v1\x1a\x14gogoproto/gogo.proto\"\xb1\x01\n\x05\x43laim\x12/\n\x06\x61\x63tion\x18\x01 \x01(\x0e\x32\x17.evmos.claims.v1.ActionR\x06\x61\x63tion\x12\x1c\n\tcompleted\x18\x02 \x01(\x08R\tcompleted\x12Y\n\x10\x63laimable_amount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0f\x63laimableAmount\"\xc6\x01\n\x13\x43laimsRecordAddress\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12h\n\x18initial_claimable_amount\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x16initialClaimableAmount\x12+\n\x11\x61\x63tions_completed\x18\x03 \x03(\x08R\x10\x61\x63tionsCompleted\"\xa5\x01\n\x0c\x43laimsRecord\x12h\n\x18initial_claimable_amount\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x16initialClaimableAmount\x12+\n\x11\x61\x63tions_completed\x18\x02 \x03(\x08R\x10\x61\x63tionsCompleted*\xd6\x01\n\x06\x41\x63tion\x12-\n\x12\x41\x43TION_UNSPECIFIED\x10\x00\x1a\x15\x8a\x9d \x11\x41\x63tionUnspecified\x12\x1f\n\x0b\x41\x43TION_VOTE\x10\x01\x1a\x0e\x8a\x9d \nActionVote\x12\'\n\x0f\x41\x43TION_DELEGATE\x10\x02\x1a\x12\x8a\x9d \x0e\x41\x63tionDelegate\x12\x1d\n\nACTION_EVM\x10\x03\x1a\r\x8a\x9d \tActionEVM\x12.\n\x13\x41\x43TION_IBC_TRANSFER\x10\x04\x1a\x15\x8a\x9d \x11\x41\x63tionIBCTransfer\x1a\x04\x88\xa3\x1e\x00\x42\xa9\x01\n\x13\x63om.evmos.claims.v1B\x0b\x43laimsProtoZ)github.com/evmos/evmos/v13/x/claims/types\xa2\x02\x03\x45\x43X\xaa\x02\x0f\x45vmos.Claims.V1\xca\x02\x0f\x45vmos\\Claims\\V1\xe2\x02\x1b\x45vmos\\Claims\\V1\\GPBMetadata\xea\x02\x11\x45vmos::Claims::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.claims.v1.claims_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.evmos.claims.v1B\013ClaimsProtoZ)github.com/evmos/evmos/v13/x/claims/types\242\002\003ECX\252\002\017Evmos.Claims.V1\312\002\017Evmos\\Claims\\V1\342\002\033Evmos\\Claims\\V1\\GPBMetadata\352\002\021Evmos::Claims::V1'
  _globals['_ACTION']._options = None
  _globals['_ACTION']._serialized_options = b'\210\243\036\000'
  _globals['_ACTION'].values_by_name["ACTION_UNSPECIFIED"]._options = None
  _globals['_ACTION'].values_by_name["ACTION_UNSPECIFIED"]._serialized_options = b'\212\235 \021ActionUnspecified'
  _globals['_ACTION'].values_by_name["ACTION_VOTE"]._options = None
  _globals['_ACTION'].values_by_name["ACTION_VOTE"]._serialized_options = b'\212\235 \nActionVote'
  _globals['_ACTION'].values_by_name["ACTION_DELEGATE"]._options = None
  _globals['_ACTION'].values_by_name["ACTION_DELEGATE"]._serialized_options = b'\212\235 \016ActionDelegate'
  _globals['_ACTION'].values_by_name["ACTION_EVM"]._options = None
  _globals['_ACTION'].values_by_name["ACTION_EVM"]._serialized_options = b'\212\235 \tActionEVM'
  _globals['_ACTION'].values_by_name["ACTION_IBC_TRANSFER"]._options = None
  _globals['_ACTION'].values_by_name["ACTION_IBC_TRANSFER"]._serialized_options = b'\212\235 \021ActionIBCTransfer'
  _globals['_CLAIM'].fields_by_name['claimable_amount']._options = None
  _globals['_CLAIM'].fields_by_name['claimable_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_CLAIMSRECORDADDRESS'].fields_by_name['initial_claimable_amount']._options = None
  _globals['_CLAIMSRECORDADDRESS'].fields_by_name['initial_claimable_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_CLAIMSRECORD'].fields_by_name['initial_claimable_amount']._options = None
  _globals['_CLAIMSRECORD'].fields_by_name['initial_claimable_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_ACTION']._serialized_start=621
  _globals['_ACTION']._serialized_end=835
  _globals['_CLAIM']._serialized_start=72
  _globals['_CLAIM']._serialized_end=249
  _globals['_CLAIMSRECORDADDRESS']._serialized_start=252
  _globals['_CLAIMSRECORDADDRESS']._serialized_end=450
  _globals['_CLAIMSRECORD']._serialized_start=453
  _globals['_CLAIMSRECORD']._serialized_end=618
# @@protoc_insertion_point(module_scope)
