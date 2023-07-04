# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/stakeibc/host_zone.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from stride.stakeibc import validator_pb2 as stride_dot_stakeibc_dot_validator__pb2
from stride.stakeibc import ica_account_pb2 as stride_dot_stakeibc_dot_ica__account__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fstride/stakeibc/host_zone.proto\x12\x0fstride.stakeibc\x1a\x1fstride/stakeibc/validator.proto\x1a!stride/stakeibc/ica_account.proto\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\x8a\n\n\x08HostZone\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12\"\n\x0c\x62\x65\x63h32prefix\x18\x11 \x01(\tR\x0c\x62\x65\x63h32prefix\x12.\n\x13transfer_channel_id\x18\x0c \x01(\tR\x11transferChannelId\x12:\n\nvalidators\x18\x03 \x03(\x0b\x32\x1a.stride.stakeibc.ValidatorR\nvalidators\x12Q\n\x16\x62lacklisted_validators\x18\x04 \x03(\x0b\x32\x1a.stride.stakeibc.ValidatorR\x15\x62lacklistedValidators\x12J\n\x12withdrawal_account\x18\x05 \x01(\x0b\x32\x1b.stride.stakeibc.ICAAccountR\x11withdrawalAccount\x12<\n\x0b\x66\x65\x65_account\x18\x06 \x01(\x0b\x32\x1b.stride.stakeibc.ICAAccountR\nfeeAccount\x12J\n\x12\x64\x65legation_account\x18\x07 \x01(\x0b\x32\x1b.stride.stakeibc.ICAAccountR\x11\x64\x65legationAccount\x12J\n\x12redemption_account\x18\x10 \x01(\x0b\x32\x1b.stride.stakeibc.ICAAccountR\x11redemptionAccount\x12\x1b\n\tibc_denom\x18\x08 \x01(\tR\x08ibcDenom\x12\x1d\n\nhost_denom\x18\t \x01(\tR\thostDenom\x12n\n\x14last_redemption_rate\x18\n \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x12lastRedemptionRate\x12\x65\n\x0fredemption_rate\x18\x0b \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0eredemptionRate\x12/\n\x13unbonding_frequency\x18\x0e \x01(\x04R\x12unbondingFrequency\x12M\n\nstaked_bal\x18\r \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\tstakedBal\x12,\n\x07\x61\x64\x64ress\x18\x12 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12\x16\n\x06halted\x18\x13 \x01(\x08R\x06halted\x12l\n\x13min_redemption_rate\x18\x14 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x11minRedemptionRate\x12l\n\x13max_redemption_rate\x18\x15 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x11maxRedemptionRateJ\x04\x08\x0f\x10\x10\x42\xb4\x01\n\x13\x63om.stride.stakeibcB\rHostZoneProtoP\x01Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\xa2\x02\x03SSX\xaa\x02\x0fStride.Stakeibc\xca\x02\x0fStride\\Stakeibc\xe2\x02\x1bStride\\Stakeibc\\GPBMetadata\xea\x02\x10Stride::Stakeibcb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.stakeibc.host_zone_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.stride.stakeibcB\rHostZoneProtoP\001Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\242\002\003SSX\252\002\017Stride.Stakeibc\312\002\017Stride\\Stakeibc\342\002\033Stride\\Stakeibc\\GPBMetadata\352\002\020Stride::Stakeibc'
  _HOSTZONE.fields_by_name['last_redemption_rate']._options = None
  _HOSTZONE.fields_by_name['last_redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTZONE.fields_by_name['redemption_rate']._options = None
  _HOSTZONE.fields_by_name['redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTZONE.fields_by_name['staked_bal']._options = None
  _HOSTZONE.fields_by_name['staked_bal']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _HOSTZONE.fields_by_name['address']._options = None
  _HOSTZONE.fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _HOSTZONE.fields_by_name['min_redemption_rate']._options = None
  _HOSTZONE.fields_by_name['min_redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTZONE.fields_by_name['max_redemption_rate']._options = None
  _HOSTZONE.fields_by_name['max_redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _globals['_HOSTZONE']._serialized_start=170
  _globals['_HOSTZONE']._serialized_end=1460
# @@protoc_insertion_point(module_scope)