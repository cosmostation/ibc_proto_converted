# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: canto/vesting/v1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.vesting.v1beta1 import vesting_pb2 as cosmos_dot_vesting_dot_v1beta1_dot_vesting__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x63\x61nto/vesting/v1/tx.proto\x12\x10\x63\x61nto.vesting.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a$cosmos/vesting/v1beta1/vesting.proto\"\xdc\x03\n\x1fMsgCreateClawbackVestingAccount\x12!\n\x0c\x66rom_address\x18\x01 \x01(\tR\x0b\x66romAddress\x12\x1d\n\nto_address\x18\x02 \x01(\tR\ttoAddress\x12\x43\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tstartTime\x12\x88\x01\n\x0elockup_periods\x18\x04 \x03(\x0b\x32\x1e.cosmos.vesting.v1beta1.PeriodBA\xc8\xde\x1f\x00\xaa\xdf\x1f\x39github.com/cosmos/cosmos-sdk/x/auth/vesting/types.PeriodsR\rlockupPeriods\x12\x8a\x01\n\x0fvesting_periods\x18\x05 \x03(\x0b\x32\x1e.cosmos.vesting.v1beta1.PeriodBA\xc8\xde\x1f\x00\xaa\xdf\x1f\x39github.com/cosmos/cosmos-sdk/x/auth/vesting/types.PeriodsR\x0evestingPeriods\x12\x14\n\x05merge\x18\x06 \x01(\x08R\x05merge:\x04\xe8\xa0\x1f\x00\")\n\'MsgCreateClawbackVestingAccountResponse\"\x80\x01\n\x0bMsgClawback\x12%\n\x0e\x66under_address\x18\x01 \x01(\tR\rfunderAddress\x12\'\n\x0f\x61\x63\x63ount_address\x18\x02 \x01(\tR\x0e\x61\x63\x63ountAddress\x12!\n\x0c\x64\x65st_address\x18\x03 \x01(\tR\x0b\x64\x65stAddress\"\x15\n\x13MsgClawbackResponse2\xcb\x02\n\x03Msg\x12\xca\x01\n\x1c\x43reateClawbackVestingAccount\x12\x31.canto.vesting.v1.MsgCreateClawbackVestingAccount\x1a\x39.canto.vesting.v1.MsgCreateClawbackVestingAccountResponse\"<\x82\xd3\xe4\x93\x02\x36\x12\x34/canto/vesting/v1/tx/create_clawback_vesting_account\x12w\n\x08\x43lawback\x12\x1d.canto.vesting.v1.MsgClawback\x1a%.canto.vesting.v1.MsgClawbackResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/canto/vesting/v1/tx/clawbackB\xb2\x01\n\x14\x63om.canto.vesting.v1B\x07TxProtoZ1github.com/Canto-Network/Canto/v6/x/vesting/types\xa2\x02\x03\x43VX\xaa\x02\x10\x43\x61nto.Vesting.V1\xca\x02\x10\x43\x61nto\\Vesting\\V1\xe2\x02\x1c\x43\x61nto\\Vesting\\V1\\GPBMetadata\xea\x02\x12\x43\x61nto::Vesting::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'canto.vesting.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.canto.vesting.v1B\007TxProtoZ1github.com/Canto-Network/Canto/v6/x/vesting/types\242\002\003CVX\252\002\020Canto.Vesting.V1\312\002\020Canto\\Vesting\\V1\342\002\034Canto\\Vesting\\V1\\GPBMetadata\352\002\022Canto::Vesting::V1'
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['start_time']._options = None
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['lockup_periods']._options = None
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['lockup_periods']._serialized_options = b'\310\336\037\000\252\337\0379github.com/cosmos/cosmos-sdk/x/auth/vesting/types.Periods'
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['vesting_periods']._options = None
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT'].fields_by_name['vesting_periods']._serialized_options = b'\310\336\037\000\252\337\0379github.com/cosmos/cosmos-sdk/x/auth/vesting/types.Periods'
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT']._options = None
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT']._serialized_options = b'\350\240\037\000'
  _globals['_MSG'].methods_by_name['CreateClawbackVestingAccount']._options = None
  _globals['_MSG'].methods_by_name['CreateClawbackVestingAccount']._serialized_options = b'\202\323\344\223\0026\0224/canto/vesting/v1/tx/create_clawback_vesting_account'
  _globals['_MSG'].methods_by_name['Clawback']._options = None
  _globals['_MSG'].methods_by_name['Clawback']._serialized_options = b'\202\323\344\223\002\037\022\035/canto/vesting/v1/tx/clawback'
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT']._serialized_start=171
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNT']._serialized_end=647
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNTRESPONSE']._serialized_start=649
  _globals['_MSGCREATECLAWBACKVESTINGACCOUNTRESPONSE']._serialized_end=690
  _globals['_MSGCLAWBACK']._serialized_start=693
  _globals['_MSGCLAWBACK']._serialized_end=821
  _globals['_MSGCLAWBACKRESPONSE']._serialized_start=823
  _globals['_MSGCLAWBACKRESPONSE']._serialized_end=844
  _globals['_MSG']._serialized_start=847
  _globals['_MSG']._serialized_end=1178
# @@protoc_insertion_point(module_scope)
