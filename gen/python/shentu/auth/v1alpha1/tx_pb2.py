# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/auth/v1alpha1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dshentu/auth/v1alpha1/tx.proto\x12\x14shentu.auth.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xe8\x01\n\tMsgUnlock\x12)\n\x06issuer\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"issuer\"R\x06issuer\x12\x34\n\x07\x61\x63\x63ount\x18\x02 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"account_address\"R\x07\x61\x63\x63ount\x12p\n\runlock_amount\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0cunlockAmount:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x13\n\x11MsgUnlockResponse2Y\n\x03Msg\x12R\n\x06Unlock\x12\x1f.shentu.auth.v1alpha1.MsgUnlock\x1a\'.shentu.auth.v1alpha1.MsgUnlockResponseB\xc4\x01\n\x18\x63om.shentu.auth.v1alpha1B\x07TxProtoZ/github.com/shentufoundation/shentu/x/auth/types\xa2\x02\x03SAX\xaa\x02\x14Shentu.Auth.V1alpha1\xca\x02\x14Shentu\\Auth\\V1alpha1\xe2\x02 Shentu\\Auth\\V1alpha1\\GPBMetadata\xea\x02\x16Shentu::Auth::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.auth.v1alpha1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.shentu.auth.v1alpha1B\007TxProtoZ/github.com/shentufoundation/shentu/x/auth/types\242\002\003SAX\252\002\024Shentu.Auth.V1alpha1\312\002\024Shentu\\Auth\\V1alpha1\342\002 Shentu\\Auth\\V1alpha1\\GPBMetadata\352\002\026Shentu::Auth::V1alpha1'
  _globals['_MSGUNLOCK'].fields_by_name['issuer']._options = None
  _globals['_MSGUNLOCK'].fields_by_name['issuer']._serialized_options = b'\362\336\037\ryaml:\"issuer\"'
  _globals['_MSGUNLOCK'].fields_by_name['account']._options = None
  _globals['_MSGUNLOCK'].fields_by_name['account']._serialized_options = b'\362\336\037\026yaml:\"account_address\"'
  _globals['_MSGUNLOCK'].fields_by_name['unlock_amount']._options = None
  _globals['_MSGUNLOCK'].fields_by_name['unlock_amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGUNLOCK']._options = None
  _globals['_MSGUNLOCK']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGUNLOCK']._serialized_start=110
  _globals['_MSGUNLOCK']._serialized_end=342
  _globals['_MSGUNLOCKRESPONSE']._serialized_start=344
  _globals['_MSGUNLOCKRESPONSE']._serialized_end=363
  _globals['_MSG']._serialized_start=365
  _globals['_MSG']._serialized_end=454
# @@protoc_insertion_point(module_scope)
