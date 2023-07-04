# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: passage3d/claim/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from passage3d.claim.v1beta1 import params_pb2 as passage3d_dot_claim_dot_v1beta1_dot_params__pb2
from passage3d.claim.v1beta1 import claim_record_pb2 as passage3d_dot_claim_dot_v1beta1_dot_claim__record__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%passage3d/claim/v1beta1/genesis.proto\x12\x17passage3d.claim.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a$passage3d/claim/v1beta1/params.proto\x1a*passage3d/claim/v1beta1/claim_record.proto\"\xbf\x02\n\x0cGenesisState\x12v\n\x16module_account_balance\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB%\xc8\xde\x1f\x00\xf2\xde\x1f\x1dyaml:\"module_account_balance\"R\x14moduleAccountBalance\x12N\n\x06params\x18\x02 \x01(\x0b\x32\x1f.passage3d.claim.v1beta1.ParamsB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"params\"R\x06params\x12g\n\rclaim_records\x18\x03 \x03(\x0b\x32$.passage3d.claim.v1beta1.ClaimRecordB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"claim_records\"R\x0c\x63laimRecordsB\xd5\x01\n\x1b\x63om.passage3d.claim.v1beta1B\x0cGenesisProtoP\x01Z*github.com/envadiv/passage3d/x/claim/types\xa2\x02\x03PCX\xaa\x02\x17Passage3d.Claim.V1beta1\xca\x02\x17Passage3d\\Claim\\V1beta1\xe2\x02#Passage3d\\Claim\\V1beta1\\GPBMetadata\xea\x02\x19Passage3d::Claim::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'passage3d.claim.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.passage3d.claim.v1beta1B\014GenesisProtoP\001Z*github.com/envadiv/passage3d/x/claim/types\242\002\003PCX\252\002\027Passage3d.Claim.V1beta1\312\002\027Passage3d\\Claim\\V1beta1\342\002#Passage3d\\Claim\\V1beta1\\GPBMetadata\352\002\031Passage3d::Claim::V1beta1'
  _GENESISSTATE.fields_by_name['module_account_balance']._options = None
  _GENESISSTATE.fields_by_name['module_account_balance']._serialized_options = b'\310\336\037\000\362\336\037\035yaml:\"module_account_balance\"'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"params\"'
  _GENESISSTATE.fields_by_name['claim_records']._options = None
  _GENESISSTATE.fields_by_name['claim_records']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"claim_records\"'
  _globals['_GENESISSTATE']._serialized_start=203
  _globals['_GENESISSTATE']._serialized_end=522
# @@protoc_insertion_point(module_scope)