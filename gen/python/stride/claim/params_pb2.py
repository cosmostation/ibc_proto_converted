# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/claim/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19stride/claim/params.proto\x12\x0cstride.claim\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\";\n\x06Params\x12\x31\n\x08\x61irdrops\x18\x01 \x03(\x0b\x32\x15.stride.claim.AirdropR\x08\x61irdrops\"\xc2\x04\n\x07\x41irdrop\x12L\n\x12\x61irdrop_identifier\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"airdrop_identifier\"R\x11\x61irdropIdentifier\x12\x19\n\x08\x63hain_id\x18\x07 \x01(\tR\x07\x63hainId\x12o\n\x12\x61irdrop_start_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB%\xc8\xde\x1f\x00\xf2\xde\x1f\x19yaml:\"airdrop_start_time\"\x90\xdf\x1f\x01R\x10\x61irdropStartTime\x12\x87\x01\n\x10\x61irdrop_duration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationBA\xc8\xde\x1f\x00\xea\xde\x1f\x1a\x61irdrop_duration,omitempty\xf2\xde\x1f\x17yaml:\"airdrop_duration\"\x98\xdf\x1f\x01R\x0f\x61irdropDuration\x12\x1f\n\x0b\x63laim_denom\x18\x04 \x01(\tR\nclaimDenom\x12/\n\x13\x64istributor_address\x18\x05 \x01(\tR\x12\x64istributorAddress\x12T\n\x0e\x63laimed_so_far\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0c\x63laimedSoFar\x12+\n\x11\x61utopilot_enabled\x18\x08 \x01(\x08R\x10\x61utopilotEnabledB\x9e\x01\n\x10\x63om.stride.claimB\x0bParamsProtoZ.github.com/Stride-Labs/stride/v9/x/claim/types\xa2\x02\x03SCX\xaa\x02\x0cStride.Claim\xca\x02\x0cStride\\Claim\xe2\x02\x18Stride\\Claim\\GPBMetadata\xea\x02\rStride::Claimb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.claim.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.stride.claimB\013ParamsProtoZ.github.com/Stride-Labs/stride/v9/x/claim/types\242\002\003SCX\252\002\014Stride.Claim\312\002\014Stride\\Claim\342\002\030Stride\\Claim\\GPBMetadata\352\002\rStride::Claim'
  _globals['_AIRDROP'].fields_by_name['airdrop_identifier']._options = None
  _globals['_AIRDROP'].fields_by_name['airdrop_identifier']._serialized_options = b'\362\336\037\031yaml:\"airdrop_identifier\"'
  _globals['_AIRDROP'].fields_by_name['airdrop_start_time']._options = None
  _globals['_AIRDROP'].fields_by_name['airdrop_start_time']._serialized_options = b'\310\336\037\000\362\336\037\031yaml:\"airdrop_start_time\"\220\337\037\001'
  _globals['_AIRDROP'].fields_by_name['airdrop_duration']._options = None
  _globals['_AIRDROP'].fields_by_name['airdrop_duration']._serialized_options = b'\310\336\037\000\352\336\037\032airdrop_duration,omitempty\362\336\037\027yaml:\"airdrop_duration\"\230\337\037\001'
  _globals['_AIRDROP'].fields_by_name['claimed_so_far']._options = None
  _globals['_AIRDROP'].fields_by_name['claimed_so_far']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_PARAMS']._serialized_start=130
  _globals['_PARAMS']._serialized_end=189
  _globals['_AIRDROP']._serialized_start=192
  _globals['_AIRDROP']._serialized_end=770
# @@protoc_insertion_point(module_scope)
