# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: mars/safety/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cmars/safety/v1beta1/tx.proto\x12\x13mars.safety.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xdf\x01\n\x12MsgSafetyFundSpend\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x1c\n\trecipient\x18\x02 \x01(\tR\trecipient\x12\x63\n\x06\x61mount\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount:\x0e\x82\xe7\xb0*\tauthority\"\x1c\n\x1aMsgSafetyFundSpendResponse2y\n\x03Msg\x12k\n\x0fSafetyFundSpend\x12\'.mars.safety.v1beta1.MsgSafetyFundSpend\x1a/.mars.safety.v1beta1.MsgSafetyFundSpendResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xbb\x01\n\x17\x63om.mars.safety.v1beta1B\x07TxProtoZ+github.com/mars-protocol/hub/x/safety/types\xa2\x02\x03MSX\xaa\x02\x13Mars.Safety.V1beta1\xca\x02\x13Mars\\Safety\\V1beta1\xe2\x02\x1fMars\\Safety\\V1beta1\\GPBMetadata\xea\x02\x15Mars::Safety::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'mars.safety.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.mars.safety.v1beta1B\007TxProtoZ+github.com/mars-protocol/hub/x/safety/types\242\002\003MSX\252\002\023Mars.Safety.V1beta1\312\002\023Mars\\Safety\\V1beta1\342\002\037Mars\\Safety\\V1beta1\\GPBMetadata\352\002\025Mars::Safety::V1beta1'
  _globals['_MSGSAFETYFUNDSPEND'].fields_by_name['authority']._options = None
  _globals['_MSGSAFETYFUNDSPEND'].fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGSAFETYFUNDSPEND'].fields_by_name['amount']._options = None
  _globals['_MSGSAFETYFUNDSPEND'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGSAFETYFUNDSPEND']._options = None
  _globals['_MSGSAFETYFUNDSPEND']._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSG']._options = None
  _globals['_MSG']._serialized_options = b'\200\347\260*\001'
  _globals['_MSGSAFETYFUNDSPEND']._serialized_start=160
  _globals['_MSGSAFETYFUNDSPEND']._serialized_end=383
  _globals['_MSGSAFETYFUNDSPENDRESPONSE']._serialized_start=385
  _globals['_MSGSAFETYFUNDSPENDRESPONSE']._serialized_end=413
  _globals['_MSG']._serialized_start=415
  _globals['_MSG']._serialized_end=536
# @@protoc_insertion_point(module_scope)
