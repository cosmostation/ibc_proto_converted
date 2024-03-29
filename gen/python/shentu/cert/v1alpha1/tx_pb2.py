# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/cert/v1alpha1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from shentu.cert.v1alpha1 import cert_pb2 as shentu_dot_cert_dot_v1alpha1_dot_cert__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dshentu/cert/v1alpha1/tx.proto\x12\x14shentu.cert.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1fshentu/cert/v1alpha1/cert.proto\"\xe6\x01\n\x13MsgProposeCertifier\x12/\n\x08proposer\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"proposer\"R\x08proposer\x12&\n\x05\x61lias\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"alias\"R\x05\x61lias\x12\x32\n\tcertifier\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"certifier\"R\tcertifier\x12\x38\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1d\n\x1bMsgProposeCertifierResponse\"\xb9\x02\n\x13MsgIssueCertificate\x12;\n\x07\x63ontent\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyB\x0b\xca\xb4-\x07\x43ontentR\x07\x63ontent\x12/\n\x08\x63ompiler\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"compiler\"R\x08\x63ompiler\x12<\n\rbytecode_hash\x18\x03 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"bytecodehash\"R\x0c\x62ytecodeHash\x12\x38\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12\x32\n\tcertifier\x18\x05 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"certifier\"R\tcertifier:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1d\n\x1bMsgIssueCertificateResponse\"\xa7\x01\n\x14MsgRevokeCertificate\x12,\n\x07revoker\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"revoker\"R\x07revoker\x12\x1d\n\x02id\x18\x02 \x01(\x04\x42\r\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x38\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1e\n\x1cMsgRevokeCertificateResponse\"\xde\x01\n\x12MsgCertifyPlatform\x12\x32\n\tcertifier\x18\x01 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"certifier\"R\tcertifier\x12Y\n\x10validator_pubkey\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyB\x18\xca\xb4-\x14\x63osmos.crypto.PubKeyR\x0fvalidatorPubkey\x12/\n\x08platform\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"platform\"R\x08platform:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1c\n\x1aMsgCertifyPlatformResponse2\xcd\x03\n\x03Msg\x12p\n\x10ProposeCertifier\x12).shentu.cert.v1alpha1.MsgProposeCertifier\x1a\x31.shentu.cert.v1alpha1.MsgProposeCertifierResponse\x12p\n\x10IssueCertificate\x12).shentu.cert.v1alpha1.MsgIssueCertificate\x1a\x31.shentu.cert.v1alpha1.MsgIssueCertificateResponse\x12s\n\x11RevokeCertificate\x12*.shentu.cert.v1alpha1.MsgRevokeCertificate\x1a\x32.shentu.cert.v1alpha1.MsgRevokeCertificateResponse\x12m\n\x0f\x43\x65rtifyPlatform\x12(.shentu.cert.v1alpha1.MsgCertifyPlatform\x1a\x30.shentu.cert.v1alpha1.MsgCertifyPlatformResponseB\xc4\x01\n\x18\x63om.shentu.cert.v1alpha1B\x07TxProtoZ/github.com/shentufoundation/shentu/x/cert/types\xa2\x02\x03SCX\xaa\x02\x14Shentu.Cert.V1alpha1\xca\x02\x14Shentu\\Cert\\V1alpha1\xe2\x02 Shentu\\Cert\\V1alpha1\\GPBMetadata\xea\x02\x16Shentu::Cert::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.cert.v1alpha1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.shentu.cert.v1alpha1B\007TxProtoZ/github.com/shentufoundation/shentu/x/cert/types\242\002\003SCX\252\002\024Shentu.Cert.V1alpha1\312\002\024Shentu\\Cert\\V1alpha1\342\002 Shentu\\Cert\\V1alpha1\\GPBMetadata\352\002\026Shentu::Cert::V1alpha1'
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['proposer']._options = None
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['proposer']._serialized_options = b'\362\336\037\017yaml:\"proposer\"'
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['alias']._options = None
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['alias']._serialized_options = b'\362\336\037\014yaml:\"alias\"'
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['certifier']._options = None
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['certifier']._serialized_options = b'\362\336\037\020yaml:\"certifier\"'
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['description']._options = None
  _globals['_MSGPROPOSECERTIFIER'].fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _globals['_MSGPROPOSECERTIFIER']._options = None
  _globals['_MSGPROPOSECERTIFIER']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['content']._options = None
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['content']._serialized_options = b'\312\264-\007Content'
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['compiler']._options = None
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['compiler']._serialized_options = b'\362\336\037\017yaml:\"compiler\"'
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['bytecode_hash']._options = None
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['bytecode_hash']._serialized_options = b'\362\336\037\023yaml:\"bytecodehash\"'
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['description']._options = None
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['certifier']._options = None
  _globals['_MSGISSUECERTIFICATE'].fields_by_name['certifier']._serialized_options = b'\362\336\037\020yaml:\"certifier\"'
  _globals['_MSGISSUECERTIFICATE']._options = None
  _globals['_MSGISSUECERTIFICATE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['revoker']._options = None
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['revoker']._serialized_options = b'\362\336\037\016yaml:\"revoker\"'
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['id']._options = None
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['id']._serialized_options = b'\362\336\037\tyaml:\"id\"'
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['description']._options = None
  _globals['_MSGREVOKECERTIFICATE'].fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _globals['_MSGREVOKECERTIFICATE']._options = None
  _globals['_MSGREVOKECERTIFICATE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['certifier']._options = None
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['certifier']._serialized_options = b'\362\336\037\020yaml:\"certifier\"'
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['validator_pubkey']._options = None
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['validator_pubkey']._serialized_options = b'\312\264-\024cosmos.crypto.PubKey'
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['platform']._options = None
  _globals['_MSGCERTIFYPLATFORM'].fields_by_name['platform']._serialized_options = b'\362\336\037\017yaml:\"platform\"'
  _globals['_MSGCERTIFYPLATFORM']._options = None
  _globals['_MSGCERTIFYPLATFORM']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGPROPOSECERTIFIER']._serialized_start=165
  _globals['_MSGPROPOSECERTIFIER']._serialized_end=395
  _globals['_MSGPROPOSECERTIFIERRESPONSE']._serialized_start=397
  _globals['_MSGPROPOSECERTIFIERRESPONSE']._serialized_end=426
  _globals['_MSGISSUECERTIFICATE']._serialized_start=429
  _globals['_MSGISSUECERTIFICATE']._serialized_end=742
  _globals['_MSGISSUECERTIFICATERESPONSE']._serialized_start=744
  _globals['_MSGISSUECERTIFICATERESPONSE']._serialized_end=773
  _globals['_MSGREVOKECERTIFICATE']._serialized_start=776
  _globals['_MSGREVOKECERTIFICATE']._serialized_end=943
  _globals['_MSGREVOKECERTIFICATERESPONSE']._serialized_start=945
  _globals['_MSGREVOKECERTIFICATERESPONSE']._serialized_end=975
  _globals['_MSGCERTIFYPLATFORM']._serialized_start=978
  _globals['_MSGCERTIFYPLATFORM']._serialized_end=1200
  _globals['_MSGCERTIFYPLATFORMRESPONSE']._serialized_start=1202
  _globals['_MSGCERTIFYPLATFORMRESPONSE']._serialized_end=1230
  _globals['_MSG']._serialized_start=1233
  _globals['_MSG']._serialized_end=1694
# @@protoc_insertion_point(module_scope)
