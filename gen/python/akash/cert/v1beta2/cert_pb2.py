# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/cert/v1beta2/cert.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x61kash/cert/v1beta2/cert.proto\x12\x12\x61kash.cert.v1beta2\x1a\x14gogoproto/gogo.proto\"\x7f\n\rCertificateID\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x33\n\x06serial\x18\x02 \x01(\tB\x1b\xea\xde\x1f\x06serial\xf2\xde\x1f\ryaml:\"serial\"R\x06serial:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xc6\x02\n\x0b\x43\x65rtificate\x12V\n\x05state\x18\x02 \x01(\x0e\x32%.akash.cert.v1beta2.Certificate.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12+\n\x04\x63\x65rt\x18\x03 \x01(\x0c\x42\x17\xea\xde\x1f\x04\x63\x65rt\xf2\xde\x1f\x0byaml:\"cert\"R\x04\x63\x65rt\x12\x33\n\x06pubkey\x18\x04 \x01(\x0c\x42\x1b\xea\xde\x1f\x06pubkey\xf2\xde\x1f\ryaml:\"pubkey\"R\x06pubkey\"}\n\x05State\x12(\n\x07invalid\x10\x00\x1a\x1b\x8a\x9d \x17\x43\x65rtificateStateInvalid\x12\x1f\n\x05valid\x10\x01\x1a\x14\x8a\x9d \x10\x43\x65rtificateValid\x12#\n\x07revoked\x10\x02\x1a\x16\x8a\x9d \x12\x43\x65rtificateRevoked\x1a\x04\x88\xa3\x1e\x00\"\xb0\x01\n\x11\x43\x65rtificateFilter\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x33\n\x06serial\x18\x02 \x01(\tB\x1b\xea\xde\x1f\x06serial\xf2\xde\x1f\ryaml:\"serial\"R\x06serial\x12/\n\x05state\x18\x03 \x01(\tB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state:\x04\xe8\xa0\x1f\x00\"\xaf\x01\n\x14MsgCreateCertificate\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12+\n\x04\x63\x65rt\x18\x02 \x01(\x0c\x42\x17\xea\xde\x1f\x04\x63\x65rt\xf2\xde\x1f\x0byaml:\"cert\"R\x04\x63\x65rt\x12\x33\n\x06pubkey\x18\x03 \x01(\x0c\x42\x1b\xea\xde\x1f\x06pubkey\xf2\xde\x1f\ryaml:\"pubkey\"R\x06pubkey:\x04\xe8\xa0\x1f\x00\"\x1e\n\x1cMsgCreateCertificateResponse\"n\n\x14MsgRevokeCertificate\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.cert.v1beta2.CertificateIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x1e\n\x1cMsgRevokeCertificateResponse2\xe7\x01\n\x03Msg\x12o\n\x11\x43reateCertificate\x12(.akash.cert.v1beta2.MsgCreateCertificate\x1a\x30.akash.cert.v1beta2.MsgCreateCertificateResponse\x12o\n\x11RevokeCertificate\x12(.akash.cert.v1beta2.MsgRevokeCertificate\x1a\x30.akash.cert.v1beta2.MsgRevokeCertificateResponseB\xc4\x01\n\x16\x63om.akash.cert.v1beta2B\tCertProtoZ7github.com/akash-network/akash-api/go/node/cert/v1beta2\xa2\x02\x03\x41\x43X\xaa\x02\x12\x41kash.Cert.V1beta2\xca\x02\x12\x41kash\\Cert\\V1beta2\xe2\x02\x1e\x41kash\\Cert\\V1beta2\\GPBMetadata\xea\x02\x14\x41kash::Cert::V1beta2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.cert.v1beta2.cert_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.akash.cert.v1beta2B\tCertProtoZ7github.com/akash-network/akash-api/go/node/cert/v1beta2\242\002\003ACX\252\002\022Akash.Cert.V1beta2\312\002\022Akash\\Cert\\V1beta2\342\002\036Akash\\Cert\\V1beta2\\GPBMetadata\352\002\024Akash::Cert::V1beta2'
  _globals['_CERTIFICATEID'].fields_by_name['owner']._options = None
  _globals['_CERTIFICATEID'].fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _globals['_CERTIFICATEID'].fields_by_name['serial']._options = None
  _globals['_CERTIFICATEID'].fields_by_name['serial']._serialized_options = b'\352\336\037\006serial\362\336\037\ryaml:\"serial\"'
  _globals['_CERTIFICATEID']._options = None
  _globals['_CERTIFICATEID']._serialized_options = b'\230\240\037\000\350\240\037\000'
  _globals['_CERTIFICATE_STATE']._options = None
  _globals['_CERTIFICATE_STATE']._serialized_options = b'\210\243\036\000'
  _globals['_CERTIFICATE_STATE'].values_by_name["invalid"]._options = None
  _globals['_CERTIFICATE_STATE'].values_by_name["invalid"]._serialized_options = b'\212\235 \027CertificateStateInvalid'
  _globals['_CERTIFICATE_STATE'].values_by_name["valid"]._options = None
  _globals['_CERTIFICATE_STATE'].values_by_name["valid"]._serialized_options = b'\212\235 \020CertificateValid'
  _globals['_CERTIFICATE_STATE'].values_by_name["revoked"]._options = None
  _globals['_CERTIFICATE_STATE'].values_by_name["revoked"]._serialized_options = b'\212\235 \022CertificateRevoked'
  _globals['_CERTIFICATE'].fields_by_name['state']._options = None
  _globals['_CERTIFICATE'].fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _globals['_CERTIFICATE'].fields_by_name['cert']._options = None
  _globals['_CERTIFICATE'].fields_by_name['cert']._serialized_options = b'\352\336\037\004cert\362\336\037\013yaml:\"cert\"'
  _globals['_CERTIFICATE'].fields_by_name['pubkey']._options = None
  _globals['_CERTIFICATE'].fields_by_name['pubkey']._serialized_options = b'\352\336\037\006pubkey\362\336\037\ryaml:\"pubkey\"'
  _globals['_CERTIFICATEFILTER'].fields_by_name['owner']._options = None
  _globals['_CERTIFICATEFILTER'].fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _globals['_CERTIFICATEFILTER'].fields_by_name['serial']._options = None
  _globals['_CERTIFICATEFILTER'].fields_by_name['serial']._serialized_options = b'\352\336\037\006serial\362\336\037\ryaml:\"serial\"'
  _globals['_CERTIFICATEFILTER'].fields_by_name['state']._options = None
  _globals['_CERTIFICATEFILTER'].fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _globals['_CERTIFICATEFILTER']._options = None
  _globals['_CERTIFICATEFILTER']._serialized_options = b'\350\240\037\000'
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['owner']._options = None
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['cert']._options = None
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['cert']._serialized_options = b'\352\336\037\004cert\362\336\037\013yaml:\"cert\"'
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['pubkey']._options = None
  _globals['_MSGCREATECERTIFICATE'].fields_by_name['pubkey']._serialized_options = b'\352\336\037\006pubkey\362\336\037\ryaml:\"pubkey\"'
  _globals['_MSGCREATECERTIFICATE']._options = None
  _globals['_MSGCREATECERTIFICATE']._serialized_options = b'\350\240\037\000'
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['id']._options = None
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _globals['_MSGREVOKECERTIFICATE']._options = None
  _globals['_MSGREVOKECERTIFICATE']._serialized_options = b'\350\240\037\000'
  _globals['_CERTIFICATEID']._serialized_start=75
  _globals['_CERTIFICATEID']._serialized_end=202
  _globals['_CERTIFICATE']._serialized_start=205
  _globals['_CERTIFICATE']._serialized_end=531
  _globals['_CERTIFICATE_STATE']._serialized_start=406
  _globals['_CERTIFICATE_STATE']._serialized_end=531
  _globals['_CERTIFICATEFILTER']._serialized_start=534
  _globals['_CERTIFICATEFILTER']._serialized_end=710
  _globals['_MSGCREATECERTIFICATE']._serialized_start=713
  _globals['_MSGCREATECERTIFICATE']._serialized_end=888
  _globals['_MSGCREATECERTIFICATERESPONSE']._serialized_start=890
  _globals['_MSGCREATECERTIFICATERESPONSE']._serialized_end=920
  _globals['_MSGREVOKECERTIFICATE']._serialized_start=922
  _globals['_MSGREVOKECERTIFICATE']._serialized_end=1032
  _globals['_MSGREVOKECERTIFICATERESPONSE']._serialized_start=1034
  _globals['_MSGREVOKECERTIFICATERESPONSE']._serialized_end=1064
  _globals['_MSG']._serialized_start=1067
  _globals['_MSG']._serialized_end=1298
# @@protoc_insertion_point(module_scope)
