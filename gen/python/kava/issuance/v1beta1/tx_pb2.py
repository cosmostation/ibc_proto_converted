# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/issuance/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ekava/issuance/v1beta1/tx.proto\x12\x15kava.issuance.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"\x87\x01\n\x0eMsgIssueTokens\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x37\n\x06tokens\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06tokens\x12\x1a\n\x08receiver\x18\x03 \x01(\tR\x08receiver:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x18\n\x16MsgIssueTokensResponse\"l\n\x0fMsgRedeemTokens\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x37\n\x06tokens\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06tokens:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x19\n\x17MsgRedeemTokensResponse\"r\n\x0fMsgBlockAddress\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\'\n\x0f\x62locked_address\x18\x03 \x01(\tR\x0e\x62lockedAddress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x19\n\x17MsgBlockAddressResponse\"t\n\x11MsgUnblockAddress\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\'\n\x0f\x62locked_address\x18\x03 \x01(\tR\x0e\x62lockedAddress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1b\n\x19MsgUnblockAddressResponse\"c\n\x11MsgSetPauseStatus\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x16\n\x06status\x18\x03 \x01(\x08R\x06status:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x1b\n\x19MsgSetPauseStatusResponse2\x96\x04\n\x03Msg\x12\x63\n\x0bIssueTokens\x12%.kava.issuance.v1beta1.MsgIssueTokens\x1a-.kava.issuance.v1beta1.MsgIssueTokensResponse\x12\x66\n\x0cRedeemTokens\x12&.kava.issuance.v1beta1.MsgRedeemTokens\x1a..kava.issuance.v1beta1.MsgRedeemTokensResponse\x12\x66\n\x0c\x42lockAddress\x12&.kava.issuance.v1beta1.MsgBlockAddress\x1a..kava.issuance.v1beta1.MsgBlockAddressResponse\x12l\n\x0eUnblockAddress\x12(.kava.issuance.v1beta1.MsgUnblockAddress\x1a\x30.kava.issuance.v1beta1.MsgUnblockAddressResponse\x12l\n\x0eSetPauseStatus\x12(.kava.issuance.v1beta1.MsgSetPauseStatus\x1a\x30.kava.issuance.v1beta1.MsgSetPauseStatusResponseB\xc4\x01\n\x19\x63om.kava.issuance.v1beta1B\x07TxProtoZ*github.com/kava-labs/kava/x/issuance/types\xa2\x02\x03KIX\xaa\x02\x15Kava.Issuance.V1beta1\xca\x02\x15Kava\\Issuance\\V1beta1\xe2\x02!Kava\\Issuance\\V1beta1\\GPBMetadata\xea\x02\x17Kava::Issuance::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.issuance.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.kava.issuance.v1beta1B\007TxProtoZ*github.com/kava-labs/kava/x/issuance/types\242\002\003KIX\252\002\025Kava.Issuance.V1beta1\312\002\025Kava\\Issuance\\V1beta1\342\002!Kava\\Issuance\\V1beta1\\GPBMetadata\352\002\027Kava::Issuance::V1beta1'
  _globals['_MSGISSUETOKENS'].fields_by_name['tokens']._options = None
  _globals['_MSGISSUETOKENS'].fields_by_name['tokens']._serialized_options = b'\310\336\037\000'
  _globals['_MSGISSUETOKENS']._options = None
  _globals['_MSGISSUETOKENS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGREDEEMTOKENS'].fields_by_name['tokens']._options = None
  _globals['_MSGREDEEMTOKENS'].fields_by_name['tokens']._serialized_options = b'\310\336\037\000'
  _globals['_MSGREDEEMTOKENS']._options = None
  _globals['_MSGREDEEMTOKENS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGBLOCKADDRESS']._options = None
  _globals['_MSGBLOCKADDRESS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGUNBLOCKADDRESS']._options = None
  _globals['_MSGUNBLOCKADDRESS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGSETPAUSESTATUS']._options = None
  _globals['_MSGSETPAUSESTATUS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGISSUETOKENS']._serialized_start=112
  _globals['_MSGISSUETOKENS']._serialized_end=247
  _globals['_MSGISSUETOKENSRESPONSE']._serialized_start=249
  _globals['_MSGISSUETOKENSRESPONSE']._serialized_end=273
  _globals['_MSGREDEEMTOKENS']._serialized_start=275
  _globals['_MSGREDEEMTOKENS']._serialized_end=383
  _globals['_MSGREDEEMTOKENSRESPONSE']._serialized_start=385
  _globals['_MSGREDEEMTOKENSRESPONSE']._serialized_end=410
  _globals['_MSGBLOCKADDRESS']._serialized_start=412
  _globals['_MSGBLOCKADDRESS']._serialized_end=526
  _globals['_MSGBLOCKADDRESSRESPONSE']._serialized_start=528
  _globals['_MSGBLOCKADDRESSRESPONSE']._serialized_end=553
  _globals['_MSGUNBLOCKADDRESS']._serialized_start=555
  _globals['_MSGUNBLOCKADDRESS']._serialized_end=671
  _globals['_MSGUNBLOCKADDRESSRESPONSE']._serialized_start=673
  _globals['_MSGUNBLOCKADDRESSRESPONSE']._serialized_end=700
  _globals['_MSGSETPAUSESTATUS']._serialized_start=702
  _globals['_MSGSETPAUSESTATUS']._serialized_end=801
  _globals['_MSGSETPAUSESTATUSRESPONSE']._serialized_start=803
  _globals['_MSGSETPAUSESTATUSRESPONSE']._serialized_end=830
  _globals['_MSG']._serialized_start=833
  _globals['_MSG']._serialized_end=1367
# @@protoc_insertion_point(module_scope)
