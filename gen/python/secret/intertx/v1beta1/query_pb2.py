# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: secret/intertx/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"secret/intertx/v1beta1/query.proto\x12\x16secret.intertx.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"\x7f\n(QueryInterchainAccountFromAddressRequest\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12=\n\rconnection_id\x18\x02 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"connection_id\"R\x0c\x63onnectionId\"\x90\x01\n)QueryInterchainAccountFromAddressResponse\x12\x63\n\x1ainterchain_account_address\x18\x01 \x01(\tB%\xf2\xde\x1f!yaml:\"interchain_account_address\"R\x18interchainAccountAddress2\xf9\x01\n\x05Query\x12\xef\x01\n\x1cInterchainAccountFromAddress\x12@.secret.intertx.v1beta1.QueryInterchainAccountFromAddressRequest\x1a\x41.secret.intertx.v1beta1.QueryInterchainAccountFromAddressResponse\"J\x82\xd3\xe4\x93\x02\x44\x12\x42/mauth/interchain_account/owner/{owner}/connection/{connection_id}B\xdb\x01\n\x1a\x63om.secret.intertx.v1beta1B\nQueryProtoP\x01Z/github.com/scrtlabs/SecretNetwork/x/mauth/types\xa2\x02\x03SIX\xaa\x02\x16Secret.Intertx.V1beta1\xca\x02\x16Secret\\Intertx\\V1beta1\xe2\x02\"Secret\\Intertx\\V1beta1\\GPBMetadata\xea\x02\x18Secret::Intertx::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'secret.intertx.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.secret.intertx.v1beta1B\nQueryProtoP\001Z/github.com/scrtlabs/SecretNetwork/x/mauth/types\242\002\003SIX\252\002\026Secret.Intertx.V1beta1\312\002\026Secret\\Intertx\\V1beta1\342\002\"Secret\\Intertx\\V1beta1\\GPBMetadata\352\002\030Secret::Intertx::V1beta1\310\341\036\000\250\342\036\001'
  _QUERYINTERCHAINACCOUNTFROMADDRESSREQUEST.fields_by_name['connection_id']._options = None
  _QUERYINTERCHAINACCOUNTFROMADDRESSREQUEST.fields_by_name['connection_id']._serialized_options = b'\362\336\037\024yaml:\"connection_id\"'
  _QUERYINTERCHAINACCOUNTFROMADDRESSRESPONSE.fields_by_name['interchain_account_address']._options = None
  _QUERYINTERCHAINACCOUNTFROMADDRESSRESPONSE.fields_by_name['interchain_account_address']._serialized_options = b'\362\336\037!yaml:\"interchain_account_address\"'
  _QUERY.methods_by_name['InterchainAccountFromAddress']._options = None
  _QUERY.methods_by_name['InterchainAccountFromAddress']._serialized_options = b'\202\323\344\223\002D\022B/mauth/interchain_account/owner/{owner}/connection/{connection_id}'
  _globals['_QUERYINTERCHAINACCOUNTFROMADDRESSREQUEST']._serialized_start=114
  _globals['_QUERYINTERCHAINACCOUNTFROMADDRESSREQUEST']._serialized_end=241
  _globals['_QUERYINTERCHAINACCOUNTFROMADDRESSRESPONSE']._serialized_start=244
  _globals['_QUERYINTERCHAINACCOUNTFROMADDRESSRESPONSE']._serialized_end=388
  _globals['_QUERY']._serialized_start=391
  _globals['_QUERY']._serialized_end=640
# @@protoc_insertion_point(module_scope)