# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/rbank/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.bank.v1beta1 import bank_pb2 as cosmos_dot_bank_dot_v1beta1_dot_bank__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17stafihub/rbank/tx.proto\x12\x17stafihub.stafihub.rbank\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/bank/v1beta1/bank.proto\"\xc0\x01\n\x0bMsgAddDenom\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12*\n\x10\x61\x63\x63\x41\x64\x64ressPrefix\x18\x02 \x01(\tR\x10\x61\x63\x63\x41\x64\x64ressPrefix\x12*\n\x10valAddressPrefix\x18\x03 \x01(\tR\x10valAddressPrefix\x12?\n\x08Metadata\x18\x04 \x01(\x0b\x32\x1d.cosmos.bank.v1beta1.MetadataB\x04\xc8\xde\x1f\x00R\x08Metadata\"\x15\n\x13MsgAddDenomResponse2e\n\x03Msg\x12^\n\x08\x41\x64\x64\x44\x65nom\x12$.stafihub.stafihub.rbank.MsgAddDenom\x1a,.stafihub.stafihub.rbank.MsgAddDenomResponseB\xce\x01\n\x1b\x63om.stafihub.stafihub.rbankB\x07TxProtoZ*github.com/stafihub/stafihub/x/rbank/types\xa2\x02\x03SSR\xaa\x02\x17Stafihub.Stafihub.Rbank\xca\x02\x17Stafihub\\Stafihub\\Rbank\xe2\x02#Stafihub\\Stafihub\\Rbank\\GPBMetadata\xea\x02\x19Stafihub::Stafihub::Rbankb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.rbank.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.stafihub.stafihub.rbankB\007TxProtoZ*github.com/stafihub/stafihub/x/rbank/types\242\002\003SSR\252\002\027Stafihub.Stafihub.Rbank\312\002\027Stafihub\\Stafihub\\Rbank\342\002#Stafihub\\Stafihub\\Rbank\\GPBMetadata\352\002\031Stafihub::Stafihub::Rbank'
  _globals['_MSGADDDENOM'].fields_by_name['Metadata']._options = None
  _globals['_MSGADDDENOM'].fields_by_name['Metadata']._serialized_options = b'\310\336\037\000'
  _globals['_MSGADDDENOM']._serialized_start=107
  _globals['_MSGADDDENOM']._serialized_end=299
  _globals['_MSGADDDENOMRESPONSE']._serialized_start=301
  _globals['_MSGADDDENOMRESPONSE']._serialized_end=322
  _globals['_MSG']._serialized_start=324
  _globals['_MSG']._serialized_end=425
# @@protoc_insertion_point(module_scope)
