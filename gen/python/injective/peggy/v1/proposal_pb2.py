# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: injective/peggy/v1/proposal.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!injective/peggy/v1/proposal.proto\x12\x12injective.peggy.v1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xb5\x01\n\"BlacklistEthereumAddressesProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12/\n\x13\x62lacklist_addresses\x18\x03 \x03(\tR\x12\x62lacklistAddresses:&\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\xca\xb4-\x1a\x63osmos.gov.v1beta1.Content\"\xb2\x01\n\x1fRevokeEthereumBlacklistProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12/\n\x13\x62lacklist_addresses\x18\x03 \x03(\tR\x12\x62lacklistAddresses:&\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\xca\xb4-\x1a\x63osmos.gov.v1beta1.ContentB\xdc\x01\n\x16\x63om.injective.peggy.v1B\rProposalProtoZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\xa2\x02\x03IPX\xaa\x02\x12Injective.Peggy.V1\xca\x02\x12Injective\\Peggy\\V1\xe2\x02\x1eInjective\\Peggy\\V1\\GPBMetadata\xea\x02\x14Injective::Peggy::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'injective.peggy.v1.proposal_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.injective.peggy.v1B\rProposalProtoZKgithub.com/InjectiveLabs/injective-core/injective-chain/modules/peggy/types\242\002\003IPX\252\002\022Injective.Peggy.V1\312\002\022Injective\\Peggy\\V1\342\002\036Injective\\Peggy\\V1\\GPBMetadata\352\002\024Injective::Peggy::V1'
  _globals['_BLACKLISTETHEREUMADDRESSESPROPOSAL']._options = None
  _globals['_BLACKLISTETHEREUMADDRESSESPROPOSAL']._serialized_options = b'\210\240\037\000\350\240\037\000\312\264-\032cosmos.gov.v1beta1.Content'
  _globals['_REVOKEETHEREUMBLACKLISTPROPOSAL']._options = None
  _globals['_REVOKEETHEREUMBLACKLISTPROPOSAL']._serialized_options = b'\210\240\037\000\350\240\037\000\312\264-\032cosmos.gov.v1beta1.Content'
  _globals['_BLACKLISTETHEREUMADDRESSESPROPOSAL']._serialized_start=107
  _globals['_BLACKLISTETHEREUMADDRESSESPROPOSAL']._serialized_end=288
  _globals['_REVOKEETHEREUMBLACKLISTPROPOSAL']._serialized_start=291
  _globals['_REVOKEETHEREUMBLACKLISTPROPOSAL']._serialized_end=469
# @@protoc_insertion_point(module_scope)
