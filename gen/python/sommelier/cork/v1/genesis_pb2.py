# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/cork/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from sommelier.cork.v1 import tx_pb2 as sommelier_dot_cork_dot_v1_dot_tx__pb2
from sommelier.cork.v1 import cork_pb2 as sommelier_dot_cork_dot_v1_dot_cork__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fsommelier/cork/v1/genesis.proto\x12\x07\x63ork.v1\x1a\x1asommelier/cork/v1/tx.proto\x1a\x1csommelier/cork/v1/cork.proto\x1a\x14gogoproto/gogo.proto\"\x96\x02\n\x0cGenesisState\x12-\n\x06params\x18\x01 \x01(\x0b\x32\x0f.cork.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x39\n\ncellar_ids\x18\x02 \x01(\x0b\x32\x14.cork.v1.CellarIDSetB\x04\xc8\xde\x1f\x00R\tcellarIds\x12-\n\x12invalidation_nonce\x18\x03 \x01(\x04R\x11invalidationNonce\x12,\n\x05\x63orks\x18\x04 \x03(\x0b\x32\x16.cork.v1.ValidatorCorkR\x05\x63orks\x12?\n\x0fscheduled_corks\x18\x05 \x03(\x0b\x32\x16.cork.v1.ScheduledCorkR\x0escheduledCorks\"\xb1\x01\n\x06Params\x12\x37\n\x0bvote_period\x18\x01 \x01(\x03\x42\x16\xf2\xde\x1f\x12yaml:\"vote_period\"R\nvotePeriod\x12n\n\x0evote_threshold\x18\x02 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x15yaml:\"vote_threshold\"R\rvoteThresholdB\x86\x01\n\x0b\x63om.cork.v1B\x0cGenesisProtoP\x01Z,github.com/peggyjv/sommelier/v4/x/cork/types\xa2\x02\x03\x43XX\xaa\x02\x07\x43ork.V1\xca\x02\x07\x43ork\\V1\xe2\x02\x13\x43ork\\V1\\GPBMetadata\xea\x02\x08\x43ork::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.cork.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\013com.cork.v1B\014GenesisProtoP\001Z,github.com/peggyjv/sommelier/v4/x/cork/types\242\002\003CXX\252\002\007Cork.V1\312\002\007Cork\\V1\342\002\023Cork\\V1\\GPBMetadata\352\002\010Cork::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['cellar_ids']._options = None
  _GENESISSTATE.fields_by_name['cellar_ids']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['vote_period']._options = None
  _PARAMS.fields_by_name['vote_period']._serialized_options = b'\362\336\037\022yaml:\"vote_period\"'
  _PARAMS.fields_by_name['vote_threshold']._options = None
  _PARAMS.fields_by_name['vote_threshold']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\025yaml:\"vote_threshold\"'
  _globals['_GENESISSTATE']._serialized_start=125
  _globals['_GENESISSTATE']._serialized_end=403
  _globals['_PARAMS']._serialized_start=406
  _globals['_PARAMS']._serialized_end=583
# @@protoc_insertion_point(module_scope)