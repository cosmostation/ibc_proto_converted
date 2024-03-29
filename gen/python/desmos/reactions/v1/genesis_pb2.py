# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/reactions/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from desmos.reactions.v1 import models_pb2 as desmos_dot_reactions_dot_v1_dot_models__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!desmos/reactions/v1/genesis.proto\x12\x13\x64\x65smos.reactions.v1\x1a\x14gogoproto/gogo.proto\x1a desmos/reactions/v1/models.proto\"\xba\x03\n\x0cGenesisState\x12S\n\x0esubspaces_data\x18\x01 \x03(\x0b\x32&.desmos.reactions.v1.SubspaceDataEntryB\x04\xc8\xde\x1f\x00R\rsubspacesData\x12`\n\x14registered_reactions\x18\x02 \x03(\x0b\x32\'.desmos.reactions.v1.RegisteredReactionB\x04\xc8\xde\x1f\x00R\x13registeredReactions\x12G\n\nposts_data\x18\x03 \x03(\x0b\x32\".desmos.reactions.v1.PostDataEntryB\x04\xc8\xde\x1f\x00R\tpostsData\x12\x41\n\treactions\x18\x04 \x03(\x0b\x32\x1d.desmos.reactions.v1.ReactionB\x04\xc8\xde\x1f\x00R\treactions\x12]\n\x10subspaces_params\x18\x05 \x03(\x0b\x32,.desmos.reactions.v1.SubspaceReactionsParamsB\x04\xc8\xde\x1f\x00R\x0fsubspacesParams:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x9e\x01\n\x11SubspaceDataEntry\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12N\n\x16registered_reaction_id\x18\x02 \x01(\rB\x18\xe2\xde\x1f\x14RegisteredReactionIDR\x14registeredReactionId:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xa0\x01\n\rPostDataEntry\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12#\n\x07post_id\x18\x02 \x01(\x04\x42\n\xe2\xde\x1f\x06PostIDR\x06postId\x12/\n\x0breaction_id\x18\x03 \x01(\rB\x0e\xe2\xde\x1f\nReactionIDR\nreactionId:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xc7\x01\n\x17\x63om.desmos.reactions.v1B\x0cGenesisProtoZ2github.com/desmos-labs/desmos/v5/x/reactions/types\xa2\x02\x03\x44RX\xaa\x02\x13\x44\x65smos.Reactions.V1\xca\x02\x13\x44\x65smos\\Reactions\\V1\xe2\x02\x1f\x44\x65smos\\Reactions\\V1\\GPBMetadata\xea\x02\x15\x44\x65smos::Reactions::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.reactions.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.desmos.reactions.v1B\014GenesisProtoZ2github.com/desmos-labs/desmos/v5/x/reactions/types\242\002\003DRX\252\002\023Desmos.Reactions.V1\312\002\023Desmos\\Reactions\\V1\342\002\037Desmos\\Reactions\\V1\\GPBMetadata\352\002\025Desmos::Reactions::V1'
  _globals['_GENESISSTATE'].fields_by_name['subspaces_data']._options = None
  _globals['_GENESISSTATE'].fields_by_name['subspaces_data']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['registered_reactions']._options = None
  _globals['_GENESISSTATE'].fields_by_name['registered_reactions']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['posts_data']._options = None
  _globals['_GENESISSTATE'].fields_by_name['posts_data']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['reactions']._options = None
  _globals['_GENESISSTATE'].fields_by_name['reactions']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['subspaces_params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['subspaces_params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._options = None
  _globals['_GENESISSTATE']._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_SUBSPACEDATAENTRY'].fields_by_name['subspace_id']._options = None
  _globals['_SUBSPACEDATAENTRY'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _globals['_SUBSPACEDATAENTRY'].fields_by_name['registered_reaction_id']._options = None
  _globals['_SUBSPACEDATAENTRY'].fields_by_name['registered_reaction_id']._serialized_options = b'\342\336\037\024RegisteredReactionID'
  _globals['_SUBSPACEDATAENTRY']._options = None
  _globals['_SUBSPACEDATAENTRY']._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_POSTDATAENTRY'].fields_by_name['subspace_id']._options = None
  _globals['_POSTDATAENTRY'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _globals['_POSTDATAENTRY'].fields_by_name['post_id']._options = None
  _globals['_POSTDATAENTRY'].fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID'
  _globals['_POSTDATAENTRY'].fields_by_name['reaction_id']._options = None
  _globals['_POSTDATAENTRY'].fields_by_name['reaction_id']._serialized_options = b'\342\336\037\nReactionID'
  _globals['_POSTDATAENTRY']._options = None
  _globals['_POSTDATAENTRY']._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_GENESISSTATE']._serialized_start=115
  _globals['_GENESISSTATE']._serialized_end=557
  _globals['_SUBSPACEDATAENTRY']._serialized_start=560
  _globals['_SUBSPACEDATAENTRY']._serialized_end=718
  _globals['_POSTDATAENTRY']._serialized_start=721
  _globals['_POSTDATAENTRY']._serialized_end=881
# @@protoc_insertion_point(module_scope)
