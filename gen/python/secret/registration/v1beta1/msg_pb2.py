# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: secret/registration/v1beta1/msg.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%secret/registration/v1beta1/msg.proto\x12\x1bsecret.registration.v1beta1\x1a\x14gogoproto/gogo.proto\"\xde\x01\n\x0eRaAuthenticate\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12\x80\x01\n\x0b\x63\x65rtificate\x18\x02 \x01(\x0c\x42^\xea\xde\x1f\x07ra_cert\xfa\xde\x1fOgithub.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.CertificateR\x0b\x63\x65rtificate\"!\n\tMasterKey\x12\x14\n\x05\x62ytes\x18\x01 \x01(\x0cR\x05\x62ytes\" \n\x03Key\x12\x19\n\x03key\x18\x01 \x01(\x0c\x42\x07\xea\xde\x1f\x03keyR\x03keyB\x80\x02\n\x1f\x63om.secret.registration.v1beta1B\x08MsgProtoZ?github.com/scrtlabs/SecretNetwork/x/registration/internal/types\xa2\x02\x03SRX\xaa\x02\x1bSecret.Registration.V1beta1\xca\x02\x1bSecret\\Registration\\V1beta1\xe2\x02\'Secret\\Registration\\V1beta1\\GPBMetadata\xea\x02\x1dSecret::Registration::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'secret.registration.v1beta1.msg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\037com.secret.registration.v1beta1B\010MsgProtoZ?github.com/scrtlabs/SecretNetwork/x/registration/internal/types\242\002\003SRX\252\002\033Secret.Registration.V1beta1\312\002\033Secret\\Registration\\V1beta1\342\002\'Secret\\Registration\\V1beta1\\GPBMetadata\352\002\035Secret::Registration::V1beta1\310\341\036\000\250\342\036\001'
  _globals['_RAAUTHENTICATE'].fields_by_name['sender']._options = None
  _globals['_RAAUTHENTICATE'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_RAAUTHENTICATE'].fields_by_name['certificate']._options = None
  _globals['_RAAUTHENTICATE'].fields_by_name['certificate']._serialized_options = b'\352\336\037\007ra_cert\372\336\037Ogithub.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate'
  _globals['_KEY'].fields_by_name['key']._options = None
  _globals['_KEY'].fields_by_name['key']._serialized_options = b'\352\336\037\003key'
  _globals['_RAAUTHENTICATE']._serialized_start=93
  _globals['_RAAUTHENTICATE']._serialized_end=315
  _globals['_MASTERKEY']._serialized_start=317
  _globals['_MASTERKEY']._serialized_end=350
  _globals['_KEY']._serialized_start=352
  _globals['_KEY']._serialized_end=384
# @@protoc_insertion_point(module_scope)
