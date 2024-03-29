# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/delegation/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from kyve.delegation.v1beta1 import delegation_pb2 as kyve_dot_delegation_dot_v1beta1_dot_delegation__pb2
from kyve.delegation.v1beta1 import params_pb2 as kyve_dot_delegation_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%kyve/delegation/v1beta1/genesis.proto\x12\x17kyve.delegation.v1beta1\x1a\x14gogoproto/gogo.proto\x1a(kyve/delegation/v1beta1/delegation.proto\x1a$kyve/delegation/v1beta1/params.proto\"\x99\x06\n\x0cGenesisState\x12=\n\x06params\x18\x01 \x01(\x0b\x32\x1f.kyve.delegation.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12O\n\x0e\x64\x65legator_list\x18\x02 \x03(\x0b\x32\".kyve.delegation.v1beta1.DelegatorB\x04\xc8\xde\x1f\x00R\rdelegatorList\x12\x62\n\x15\x64\x65legation_entry_list\x18\x03 \x03(\x0b\x32(.kyve.delegation.v1beta1.DelegationEntryB\x04\xc8\xde\x1f\x00R\x13\x64\x65legationEntryList\x12_\n\x14\x64\x65legation_data_list\x18\x04 \x03(\x0b\x32\'.kyve.delegation.v1beta1.DelegationDataB\x04\xc8\xde\x1f\x00R\x12\x64\x65legationDataList\x12\x62\n\x15\x64\x65legation_slash_list\x18\x05 \x03(\x0b\x32(.kyve.delegation.v1beta1.DelegationSlashB\x04\xc8\xde\x1f\x00R\x13\x64\x65legationSlashList\x12x\n\x1dundelegation_queue_entry_list\x18\x06 \x03(\x0b\x32/.kyve.delegation.v1beta1.UndelegationQueueEntryB\x04\xc8\xde\x1f\x00R\x1aundelegationQueueEntryList\x12\x63\n\x18queue_state_undelegation\x18\x07 \x01(\x0b\x32#.kyve.delegation.v1beta1.QueueStateB\x04\xc8\xde\x1f\x00R\x16queueStateUndelegation\x12q\n\x1aredelegation_cooldown_list\x18\x08 \x03(\x0b\x32-.kyve.delegation.v1beta1.RedelegationCooldownB\x04\xc8\xde\x1f\x00R\x18redelegationCooldownListB\xd8\x01\n\x1b\x63om.kyve.delegation.v1beta1B\x0cGenesisProtoZ/github.com/KYVENetwork/chain/x/delegation/types\xa2\x02\x03KDX\xaa\x02\x17Kyve.Delegation.V1beta1\xca\x02\x17Kyve\\Delegation\\V1beta1\xe2\x02#Kyve\\Delegation\\V1beta1\\GPBMetadata\xea\x02\x19Kyve::Delegation::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.delegation.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.kyve.delegation.v1beta1B\014GenesisProtoZ/github.com/KYVENetwork/chain/x/delegation/types\242\002\003KDX\252\002\027Kyve.Delegation.V1beta1\312\002\027Kyve\\Delegation\\V1beta1\342\002#Kyve\\Delegation\\V1beta1\\GPBMetadata\352\002\031Kyve::Delegation::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['delegator_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['delegator_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['delegation_entry_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['delegation_entry_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['delegation_data_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['delegation_data_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['delegation_slash_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['delegation_slash_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['undelegation_queue_entry_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['undelegation_queue_entry_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['queue_state_undelegation']._options = None
  _globals['_GENESISSTATE'].fields_by_name['queue_state_undelegation']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['redelegation_cooldown_list']._options = None
  _globals['_GENESISSTATE'].fields_by_name['redelegation_cooldown_list']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=169
  _globals['_GENESISSTATE']._serialized_end=962
# @@protoc_insertion_point(module_scope)
