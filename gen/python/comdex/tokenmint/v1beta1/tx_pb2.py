# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/tokenmint/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!comdex/tokenmint/v1beta1/tx.proto\x12\x18\x63omdex.tokenmint.v1beta1\x1a\x14gogoproto/gogo.proto\"\xa1\x01\n\x17MsgMintNewTokensRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12\x31\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x1a\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12.\n\x08\x61sset_id\x18\x03 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\"\x1a\n\x18MsgMintNewTokensResponse2\x80\x01\n\x03Msg\x12y\n\x10MsgMintNewTokens\x12\x31.comdex.tokenmint.v1beta1.MsgMintNewTokensRequest\x1a\x32.comdex.tokenmint.v1beta1.MsgMintNewTokensResponseB\xe4\x01\n\x1c\x63om.comdex.tokenmint.v1beta1B\x07TxProtoZ3github.com/comdex-official/comdex/x/tokenmint/types\xa2\x02\x03\x43TX\xaa\x02\x18\x43omdex.Tokenmint.V1beta1\xca\x02\x18\x43omdex\\Tokenmint\\V1beta1\xe2\x02$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Tokenmint::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.tokenmint.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.comdex.tokenmint.v1beta1B\007TxProtoZ3github.com/comdex-official/comdex/x/tokenmint/types\242\002\003CTX\252\002\030Comdex.Tokenmint.V1beta1\312\002\030Comdex\\Tokenmint\\V1beta1\342\002$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\352\002\032Comdex::Tokenmint::V1beta1\310\341\036\000\250\342\036\000'
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['asset_id']._options = None
  _globals['_MSGMINTNEWTOKENSREQUEST'].fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _globals['_MSGMINTNEWTOKENSREQUEST']._serialized_start=86
  _globals['_MSGMINTNEWTOKENSREQUEST']._serialized_end=247
  _globals['_MSGMINTNEWTOKENSRESPONSE']._serialized_start=249
  _globals['_MSGMINTNEWTOKENSRESPONSE']._serialized_end=275
  _globals['_MSG']._serialized_start=278
  _globals['_MSG']._serialized_end=406
# @@protoc_insertion_point(module_scope)
