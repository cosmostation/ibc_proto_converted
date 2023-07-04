# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/feegrant/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n cosmos/feegrant/v1beta1/tx.proto\x12\x17\x63osmos.feegrant.v1beta1\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x11\x61mino/amino.proto\"\x89\x02\n\x11MsgGrantAllowance\x12\x32\n\x07granter\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07granter\x12\x32\n\x07grantee\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07grantee\x12]\n\tallowance\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyB)\xca\xb4-%cosmos.feegrant.v1beta1.FeeAllowanceIR\tallowance:-\x82\xe7\xb0*\x07granter\x8a\xe7\xb0*\x1c\x63osmos-sdk/MsgGrantAllowance\"\x1b\n\x19MsgGrantAllowanceResponse\"\xac\x01\n\x12MsgRevokeAllowance\x12\x32\n\x07granter\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07granter\x12\x32\n\x07grantee\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07grantee:.\x82\xe7\xb0*\x07granter\x8a\xe7\xb0*\x1d\x63osmos-sdk/MsgRevokeAllowance\"\x1c\n\x1aMsgRevokeAllowanceResponse2\xf3\x01\n\x03Msg\x12p\n\x0eGrantAllowance\x12*.cosmos.feegrant.v1beta1.MsgGrantAllowance\x1a\x32.cosmos.feegrant.v1beta1.MsgGrantAllowanceResponse\x12s\n\x0fRevokeAllowance\x12+.cosmos.feegrant.v1beta1.MsgRevokeAllowance\x1a\x33.cosmos.feegrant.v1beta1.MsgRevokeAllowanceResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xbd\x01\n\x1b\x63om.cosmos.feegrant.v1beta1B\x07TxProtoP\x01Z\x17\x63osmossdk.io/x/feegrant\xa2\x02\x03\x43\x46X\xaa\x02\x17\x43osmos.Feegrant.V1beta1\xca\x02\x17\x43osmos\\Feegrant\\V1beta1\xe2\x02#Cosmos\\Feegrant\\V1beta1\\GPBMetadata\xea\x02\x19\x43osmos::Feegrant::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.feegrant.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.cosmos.feegrant.v1beta1B\007TxProtoP\001Z\027cosmossdk.io/x/feegrant\242\002\003CFX\252\002\027Cosmos.Feegrant.V1beta1\312\002\027Cosmos\\Feegrant\\V1beta1\342\002#Cosmos\\Feegrant\\V1beta1\\GPBMetadata\352\002\031Cosmos::Feegrant::V1beta1'
  _MSGGRANTALLOWANCE.fields_by_name['granter']._options = None
  _MSGGRANTALLOWANCE.fields_by_name['granter']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGGRANTALLOWANCE.fields_by_name['grantee']._options = None
  _MSGGRANTALLOWANCE.fields_by_name['grantee']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGGRANTALLOWANCE.fields_by_name['allowance']._options = None
  _MSGGRANTALLOWANCE.fields_by_name['allowance']._serialized_options = b'\312\264-%cosmos.feegrant.v1beta1.FeeAllowanceI'
  _MSGGRANTALLOWANCE._options = None
  _MSGGRANTALLOWANCE._serialized_options = b'\202\347\260*\007granter\212\347\260*\034cosmos-sdk/MsgGrantAllowance'
  _MSGREVOKEALLOWANCE.fields_by_name['granter']._options = None
  _MSGREVOKEALLOWANCE.fields_by_name['granter']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGREVOKEALLOWANCE.fields_by_name['grantee']._options = None
  _MSGREVOKEALLOWANCE.fields_by_name['grantee']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGREVOKEALLOWANCE._options = None
  _MSGREVOKEALLOWANCE._serialized_options = b'\202\347\260*\007granter\212\347\260*\035cosmos-sdk/MsgRevokeAllowance'
  _MSG._options = None
  _MSG._serialized_options = b'\200\347\260*\001'
  _globals['_MSGGRANTALLOWANCE']._serialized_start=160
  _globals['_MSGGRANTALLOWANCE']._serialized_end=425
  _globals['_MSGGRANTALLOWANCERESPONSE']._serialized_start=427
  _globals['_MSGGRANTALLOWANCERESPONSE']._serialized_end=454
  _globals['_MSGREVOKEALLOWANCE']._serialized_start=457
  _globals['_MSGREVOKEALLOWANCE']._serialized_end=629
  _globals['_MSGREVOKEALLOWANCERESPONSE']._serialized_start=631
  _globals['_MSGREVOKEALLOWANCERESPONSE']._serialized_end=659
  _globals['_MSG']._serialized_start=662
  _globals['_MSG']._serialized_end=905
# @@protoc_insertion_point(module_scope)