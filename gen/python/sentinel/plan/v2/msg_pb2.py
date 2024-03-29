# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/plan/v2/msg.proto
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
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1asentinel/plan/v2/msg.proto\x12\x10sentinel.plan.v2\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1esentinel/types/v1/status.proto\"\x92\x02\n\x10MsgCreateRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x44\n\x05\x62ytes\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05\x62ytes\x12?\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x08\x64uration\x12\x63\n\x06prices\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06prices\"w\n\x16MsgUpdateStatusRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x16\n\x02id\x18\x02 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12\x31\n\x06status\x18\x03 \x01(\x0e\x32\x19.sentinel.types.v1.StatusR\x06status\"Z\n\x12MsgLinkNodeRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x16\n\x02id\x18\x02 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\"\\\n\x14MsgUnlinkNodeRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x16\n\x02id\x18\x02 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\"W\n\x13MsgSubscribeRequest\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x16\n\x02id\x18\x02 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\"\x13\n\x11MsgCreateResponse\"\x19\n\x17MsgUpdateStatusResponse\"\x15\n\x13MsgLinkNodeResponse\"\x17\n\x15MsgUnlinkNodeResponse\"\x16\n\x14MsgSubscribeResponse2\xe7\x03\n\nMsgService\x12T\n\tMsgCreate\x12\".sentinel.plan.v2.MsgCreateRequest\x1a#.sentinel.plan.v2.MsgCreateResponse\x12\x66\n\x0fMsgUpdateStatus\x12(.sentinel.plan.v2.MsgUpdateStatusRequest\x1a).sentinel.plan.v2.MsgUpdateStatusResponse\x12Z\n\x0bMsgLinkNode\x12$.sentinel.plan.v2.MsgLinkNodeRequest\x1a%.sentinel.plan.v2.MsgLinkNodeResponse\x12`\n\rMsgUnlinkNode\x12&.sentinel.plan.v2.MsgUnlinkNodeRequest\x1a\'.sentinel.plan.v2.MsgUnlinkNodeResponse\x12]\n\x0cMsgSubscribe\x12%.sentinel.plan.v2.MsgSubscribeRequest\x1a&.sentinel.plan.v2.MsgSubscribeResponseB\xb7\x01\n\x14\x63om.sentinel.plan.v2B\x08MsgProtoZ-github.com/sentinel-official/hub/x/plan/types\xa2\x02\x03SPX\xaa\x02\x10Sentinel.Plan.V2\xca\x02\x10Sentinel\\Plan\\V2\xe2\x02\x1cSentinel\\Plan\\V2\\GPBMetadata\xea\x02\x12Sentinel::Plan::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.plan.v2.msg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.sentinel.plan.v2B\010MsgProtoZ-github.com/sentinel-official/hub/x/plan/types\242\002\003SPX\252\002\020Sentinel.Plan.V2\312\002\020Sentinel\\Plan\\V2\342\002\034Sentinel\\Plan\\V2\\GPBMetadata\352\002\022Sentinel::Plan::V2\310\341\036\000\250\342\036\000'
  _globals['_MSGCREATEREQUEST'].fields_by_name['bytes']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['bytes']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGCREATEREQUEST'].fields_by_name['duration']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_MSGCREATEREQUEST'].fields_by_name['prices']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['prices']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGUPDATESTATUSREQUEST'].fields_by_name['id']._options = None
  _globals['_MSGUPDATESTATUSREQUEST'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MSGLINKNODEREQUEST'].fields_by_name['id']._options = None
  _globals['_MSGLINKNODEREQUEST'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MSGUNLINKNODEREQUEST'].fields_by_name['id']._options = None
  _globals['_MSGUNLINKNODEREQUEST'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MSGSUBSCRIBEREQUEST'].fields_by_name['id']._options = None
  _globals['_MSGSUBSCRIBEREQUEST'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MSGCREATEREQUEST']._serialized_start=167
  _globals['_MSGCREATEREQUEST']._serialized_end=441
  _globals['_MSGUPDATESTATUSREQUEST']._serialized_start=443
  _globals['_MSGUPDATESTATUSREQUEST']._serialized_end=562
  _globals['_MSGLINKNODEREQUEST']._serialized_start=564
  _globals['_MSGLINKNODEREQUEST']._serialized_end=654
  _globals['_MSGUNLINKNODEREQUEST']._serialized_start=656
  _globals['_MSGUNLINKNODEREQUEST']._serialized_end=748
  _globals['_MSGSUBSCRIBEREQUEST']._serialized_start=750
  _globals['_MSGSUBSCRIBEREQUEST']._serialized_end=837
  _globals['_MSGCREATERESPONSE']._serialized_start=839
  _globals['_MSGCREATERESPONSE']._serialized_end=858
  _globals['_MSGUPDATESTATUSRESPONSE']._serialized_start=860
  _globals['_MSGUPDATESTATUSRESPONSE']._serialized_end=885
  _globals['_MSGLINKNODERESPONSE']._serialized_start=887
  _globals['_MSGLINKNODERESPONSE']._serialized_end=908
  _globals['_MSGUNLINKNODERESPONSE']._serialized_start=910
  _globals['_MSGUNLINKNODERESPONSE']._serialized_end=933
  _globals['_MSGSUBSCRIBERESPONSE']._serialized_start=935
  _globals['_MSGSUBSCRIBERESPONSE']._serialized_end=957
  _globals['_MSGSERVICE']._serialized_start=960
  _globals['_MSGSERVICE']._serialized_end=1447
# @@protoc_insertion_point(module_scope)
