# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/pool-incentives/v1beta1/gov.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from amino import amino_pb2 as amino_dot_amino__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.pool_incentives.v1beta1 import incentives_pb2 as osmosis_dot_pool__incentives_dot_v1beta1_dot_incentives__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)osmosis/pool-incentives/v1beta1/gov.proto\x12\x1eosmosis.poolincentives.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x11\x61mino/amino.proto\x1a\x14gogoproto/gogo.proto\x1a\x30osmosis/pool-incentives/v1beta1/incentives.proto\"\xfa\x01\n\x1dReplacePoolIncentivesProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12K\n\x07records\x18\x03 \x03(\x0b\x32+.osmosis.poolincentives.v1beta1.DistrRecordB\x04\xc8\xde\x1f\x00R\x07records:T\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\xca\xb4-\x1a\x63osmos.gov.v1beta1.Content\x8a\xe7\xb0*%osmosis/ReplacePoolIncentivesProposal\"\xf8\x01\n\x1cUpdatePoolIncentivesProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12K\n\x07records\x18\x03 \x03(\x0b\x32+.osmosis.poolincentives.v1beta1.DistrRecordB\x04\xc8\xde\x1f\x00R\x07records:S\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\xca\xb4-\x1a\x63osmos.gov.v1beta1.Content\x8a\xe7\xb0*$osmosis/UpdatePoolIncentivesProposalB\x85\x02\n\"com.osmosis.poolincentives.v1beta1B\x08GovProtoP\x01Z;github.com/osmosis-labs/osmosis/v15/x/pool-incentives/types\xa2\x02\x03OPX\xaa\x02\x1eOsmosis.Poolincentives.V1beta1\xca\x02\x1eOsmosis\\Poolincentives\\V1beta1\xe2\x02*Osmosis\\Poolincentives\\V1beta1\\GPBMetadata\xea\x02 Osmosis::Poolincentives::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.pool_incentives.v1beta1.gov_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.osmosis.poolincentives.v1beta1B\010GovProtoP\001Z;github.com/osmosis-labs/osmosis/v15/x/pool-incentives/types\242\002\003OPX\252\002\036Osmosis.Poolincentives.V1beta1\312\002\036Osmosis\\Poolincentives\\V1beta1\342\002*Osmosis\\Poolincentives\\V1beta1\\GPBMetadata\352\002 Osmosis::Poolincentives::V1beta1'
  _REPLACEPOOLINCENTIVESPROPOSAL.fields_by_name['records']._options = None
  _REPLACEPOOLINCENTIVESPROPOSAL.fields_by_name['records']._serialized_options = b'\310\336\037\000'
  _REPLACEPOOLINCENTIVESPROPOSAL._options = None
  _REPLACEPOOLINCENTIVESPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos.gov.v1beta1.Content\212\347\260*%osmosis/ReplacePoolIncentivesProposal'
  _UPDATEPOOLINCENTIVESPROPOSAL.fields_by_name['records']._options = None
  _UPDATEPOOLINCENTIVESPROPOSAL.fields_by_name['records']._serialized_options = b'\310\336\037\000'
  _UPDATEPOOLINCENTIVESPROPOSAL._options = None
  _UPDATEPOOLINCENTIVESPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos.gov.v1beta1.Content\212\347\260*$osmosis/UpdatePoolIncentivesProposal'
  _globals['_REPLACEPOOLINCENTIVESPROPOSAL']._serialized_start=196
  _globals['_REPLACEPOOLINCENTIVESPROPOSAL']._serialized_end=446
  _globals['_UPDATEPOOLINCENTIVESPROPOSAL']._serialized_start=449
  _globals['_UPDATEPOOLINCENTIVESPROPOSAL']._serialized_end=697
# @@protoc_insertion_point(module_scope)