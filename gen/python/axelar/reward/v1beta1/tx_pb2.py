# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/reward/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from axelar.permission.exported.v1beta1 import types_pb2 as axelar_dot_permission_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x61xelar/reward/v1beta1/tx.proto\x12\x15\x61xelar.reward.v1beta1\x1a\x19google/protobuf/any.proto\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a.axelar/permission/exported/v1beta1/types.proto\"\xae\x01\n\x10RefundMsgRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12I\n\rinner_message\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyB\x0e\xca\xb4-\nRefundableR\x0cinnerMessage:\x04\x80\xb5\x18\x01\"9\n\x11RefundMsgResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\x12\x10\n\x03log\x18\x02 \x01(\tR\x03logB\xd1\x01\n\x19\x63om.axelar.reward.v1beta1B\x07TxProtoZ3github.com/axelarnetwork/axelar-core/x/reward/types\xa2\x02\x03\x41RX\xaa\x02\x15\x41xelar.Reward.V1beta1\xca\x02\x15\x41xelar\\Reward\\V1beta1\xe2\x02!Axelar\\Reward\\V1beta1\\GPBMetadata\xea\x02\x17\x41xelar::Reward::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.reward.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.axelar.reward.v1beta1B\007TxProtoZ3github.com/axelarnetwork/axelar-core/x/reward/types\242\002\003ARX\252\002\025Axelar.Reward.V1beta1\312\002\025Axelar\\Reward\\V1beta1\342\002!Axelar\\Reward\\V1beta1\\GPBMetadata\352\002\027Axelar::Reward::V1beta1\310\341\036\000'
  _globals['_REFUNDMSGREQUEST'].fields_by_name['sender']._options = None
  _globals['_REFUNDMSGREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_REFUNDMSGREQUEST'].fields_by_name['inner_message']._options = None
  _globals['_REFUNDMSGREQUEST'].fields_by_name['inner_message']._serialized_options = b'\312\264-\nRefundable'
  _globals['_REFUNDMSGREQUEST']._options = None
  _globals['_REFUNDMSGREQUEST']._serialized_options = b'\200\265\030\001'
  _globals['_REFUNDMSGREQUEST']._serialized_start=182
  _globals['_REFUNDMSGREQUEST']._serialized_end=356
  _globals['_REFUNDMSGRESPONSE']._serialized_start=358
  _globals['_REFUNDMSGRESPONSE']._serialized_end=415
# @@protoc_insertion_point(module_scope)
