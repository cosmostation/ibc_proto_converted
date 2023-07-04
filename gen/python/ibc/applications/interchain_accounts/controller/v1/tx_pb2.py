# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ibc/applications/interchain_accounts/controller/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ibc.applications.interchain_accounts.v1 import packet_pb2 as ibc_dot_applications_dot_interchain__accounts_dot_v1_dot_packet__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;ibc/applications/interchain_accounts/controller/v1/tx.proto\x12\x32ibc.applications.interchain_accounts.controller.v1\x1a\x14gogoproto/gogo.proto\x1a\x34ibc/applications/interchain_accounts/v1/packet.proto\x1a\x17\x63osmos/msg/v1/msg.proto\"\x87\x01\n\x1cMsgRegisterInterchainAccount\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12\x18\n\x07version\x18\x03 \x01(\tR\x07version:\x12\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x05owner\"^\n$MsgRegisterInterchainAccountResponse\x12\x1d\n\nchannel_id\x18\x01 \x01(\tR\tchannelId\x12\x17\n\x07port_id\x18\x02 \x01(\tR\x06portId\"\xf2\x01\n\tMsgSendTx\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12k\n\x0bpacket_data\x18\x03 \x01(\x0b\x32\x44.ibc.applications.interchain_accounts.v1.InterchainAccountPacketDataB\x04\xc8\xde\x1f\x00R\npacketData\x12)\n\x10relative_timeout\x18\x04 \x01(\x04R\x0frelativeTimeout:\x12\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x05owner\"/\n\x11MsgSendTxResponse\x12\x1a\n\x08sequence\x18\x01 \x01(\x04R\x08sequence2\xe0\x02\n\x03Msg\x12\xc7\x01\n\x19RegisterInterchainAccount\x12P.ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccount\x1aX.ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponse\x12\x8e\x01\n\x06SendTx\x12=.ibc.applications.interchain_accounts.controller.v1.MsgSendTx\x1a\x45.ibc.applications.interchain_accounts.controller.v1.MsgSendTxResponseB\xfc\x02\n6com.ibc.applications.interchain_accounts.controller.v1B\x07TxProtoP\x01ZPgithub.com/cosmos/ibc-go/v7/modules/apps/27-interchain-accounts/controller/types\xa2\x02\x04IAIC\xaa\x02\x31Ibc.Applications.InterchainAccounts.Controller.V1\xca\x02\x31Ibc\\Applications\\InterchainAccounts\\Controller\\V1\xe2\x02=Ibc\\Applications\\InterchainAccounts\\Controller\\V1\\GPBMetadata\xea\x02\x35Ibc::Applications::InterchainAccounts::Controller::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ibc.applications.interchain_accounts.controller.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n6com.ibc.applications.interchain_accounts.controller.v1B\007TxProtoP\001ZPgithub.com/cosmos/ibc-go/v7/modules/apps/27-interchain-accounts/controller/types\242\002\004IAIC\252\0021Ibc.Applications.InterchainAccounts.Controller.V1\312\0021Ibc\\Applications\\InterchainAccounts\\Controller\\V1\342\002=Ibc\\Applications\\InterchainAccounts\\Controller\\V1\\GPBMetadata\352\0025Ibc::Applications::InterchainAccounts::Controller::V1'
  _MSGREGISTERINTERCHAINACCOUNT._options = None
  _MSGREGISTERINTERCHAINACCOUNT._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\005owner'
  _MSGSENDTX.fields_by_name['packet_data']._options = None
  _MSGSENDTX.fields_by_name['packet_data']._serialized_options = b'\310\336\037\000'
  _MSGSENDTX._options = None
  _MSGSENDTX._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\005owner'
  _globals['_MSGREGISTERINTERCHAINACCOUNT']._serialized_start=217
  _globals['_MSGREGISTERINTERCHAINACCOUNT']._serialized_end=352
  _globals['_MSGREGISTERINTERCHAINACCOUNTRESPONSE']._serialized_start=354
  _globals['_MSGREGISTERINTERCHAINACCOUNTRESPONSE']._serialized_end=448
  _globals['_MSGSENDTX']._serialized_start=451
  _globals['_MSGSENDTX']._serialized_end=693
  _globals['_MSGSENDTXRESPONSE']._serialized_start=695
  _globals['_MSGSENDTXRESPONSE']._serialized_end=742
  _globals['_MSG']._serialized_start=745
  _globals['_MSG']._serialized_end=1097
# @@protoc_insertion_point(module_scope)