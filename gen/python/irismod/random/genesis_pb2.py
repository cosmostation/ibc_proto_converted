# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/random/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from irismod.random import random_pb2 as irismod_dot_random_dot_random__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cirismod/random/genesis.proto\x12\x0eirismod.random\x1a\x1birismod/random/random.proto\x1a\x14gogoproto/gogo.proto\"\xe9\x01\n\x0cGenesisState\x12u\n\x17pending_random_requests\x18\x01 \x03(\x0b\x32\x37.irismod.random.GenesisState.PendingRandomRequestsEntryB\x04\xc8\xde\x1f\x00R\x15pendingRandomRequests\x1a\x62\n\x1aPendingRandomRequestsEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12.\n\x05value\x18\x02 \x01(\x0b\x32\x18.irismod.random.RequestsR\x05value:\x02\x38\x01\"E\n\x08Requests\x12\x39\n\x08requests\x18\x01 \x03(\x0b\x32\x17.irismod.random.RequestB\x04\xc8\xde\x1f\x00R\x08requestsB\xaa\x01\n\x12\x63om.irismod.randomB\x0cGenesisProtoZ/github.com/irisnet/irismod/modules/random/types\xa2\x02\x03IRX\xaa\x02\x0eIrismod.Random\xca\x02\x0eIrismod\\Random\xe2\x02\x1aIrismod\\Random\\GPBMetadata\xea\x02\x0fIrismod::Randomb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.random.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022com.irismod.randomB\014GenesisProtoZ/github.com/irisnet/irismod/modules/random/types\242\002\003IRX\252\002\016Irismod.Random\312\002\016Irismod\\Random\342\002\032Irismod\\Random\\GPBMetadata\352\002\017Irismod::Random'
  _globals['_GENESISSTATE_PENDINGRANDOMREQUESTSENTRY']._options = None
  _globals['_GENESISSTATE_PENDINGRANDOMREQUESTSENTRY']._serialized_options = b'8\001'
  _globals['_GENESISSTATE'].fields_by_name['pending_random_requests']._options = None
  _globals['_GENESISSTATE'].fields_by_name['pending_random_requests']._serialized_options = b'\310\336\037\000'
  _globals['_REQUESTS'].fields_by_name['requests']._options = None
  _globals['_REQUESTS'].fields_by_name['requests']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=100
  _globals['_GENESISSTATE']._serialized_end=333
  _globals['_GENESISSTATE_PENDINGRANDOMREQUESTSENTRY']._serialized_start=235
  _globals['_GENESISSTATE_PENDINGRANDOMREQUESTSENTRY']._serialized_end=333
  _globals['_REQUESTS']._serialized_start=335
  _globals['_REQUESTS']._serialized_end=404
# @@protoc_insertion_point(module_scope)
