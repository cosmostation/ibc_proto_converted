# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/cdp/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19kava/cdp/v1beta1/tx.proto\x12\x10kava.cdp.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\xe9\x01\n\x0cMsgCreateCDP\x12\x30\n\x06sender\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06sender\x12?\n\ncollateral\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\ncollateral\x12=\n\tprincipal\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tprincipal\x12\'\n\x0f\x63ollateral_type\x18\x04 \x01(\tR\x0e\x63ollateralType\"8\n\x14MsgCreateCDPResponse\x12 \n\x06\x63\x64p_id\x18\x01 \x01(\x04\x42\t\xe2\xde\x1f\x05\x43\x64pIDR\x05\x63\x64pId\"\xde\x01\n\nMsgDeposit\x12\x36\n\tdepositor\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdepositor\x12.\n\x05owner\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05owner\x12?\n\ncollateral\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\ncollateral\x12\'\n\x0f\x63ollateral_type\x18\x04 \x01(\tR\x0e\x63ollateralType\"\x14\n\x12MsgDepositResponse\"\xdf\x01\n\x0bMsgWithdraw\x12\x36\n\tdepositor\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdepositor\x12.\n\x05owner\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05owner\x12?\n\ncollateral\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\ncollateral\x12\'\n\x0f\x63ollateral_type\x18\x04 \x01(\tR\x0e\x63ollateralType\"\x15\n\x13MsgWithdrawResponse\"\xa7\x01\n\x0bMsgDrawDebt\x12\x30\n\x06sender\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06sender\x12\'\n\x0f\x63ollateral_type\x18\x02 \x01(\tR\x0e\x63ollateralType\x12=\n\tprincipal\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tprincipal\"\x15\n\x13MsgDrawDebtResponse\"\xa4\x01\n\x0cMsgRepayDebt\x12\x30\n\x06sender\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06sender\x12\'\n\x0f\x63ollateral_type\x18\x02 \x01(\tR\x0e\x63ollateralType\x12\x39\n\x07payment\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07payment\"\x16\n\x14MsgRepayDebtResponse\"\x9f\x01\n\x0cMsgLiquidate\x12\x30\n\x06keeper\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06keeper\x12\x34\n\x08\x62orrower\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x08\x62orrower\x12\'\n\x0f\x63ollateral_type\x18\x03 \x01(\tR\x0e\x63ollateralType\"\x16\n\x14MsgLiquidateResponse2\xf7\x03\n\x03Msg\x12S\n\tCreateCDP\x12\x1e.kava.cdp.v1beta1.MsgCreateCDP\x1a&.kava.cdp.v1beta1.MsgCreateCDPResponse\x12M\n\x07\x44\x65posit\x12\x1c.kava.cdp.v1beta1.MsgDeposit\x1a$.kava.cdp.v1beta1.MsgDepositResponse\x12P\n\x08Withdraw\x12\x1d.kava.cdp.v1beta1.MsgWithdraw\x1a%.kava.cdp.v1beta1.MsgWithdrawResponse\x12P\n\x08\x44rawDebt\x12\x1d.kava.cdp.v1beta1.MsgDrawDebt\x1a%.kava.cdp.v1beta1.MsgDrawDebtResponse\x12S\n\tRepayDebt\x12\x1e.kava.cdp.v1beta1.MsgRepayDebt\x1a&.kava.cdp.v1beta1.MsgRepayDebtResponse\x12S\n\tLiquidate\x12\x1e.kava.cdp.v1beta1.MsgLiquidate\x1a&.kava.cdp.v1beta1.MsgLiquidateResponseB\xa6\x01\n\x14\x63om.kava.cdp.v1beta1B\x07TxProtoZ%github.com/kava-labs/kava/x/cdp/types\xa2\x02\x03KCX\xaa\x02\x10Kava.Cdp.V1beta1\xca\x02\x10Kava\\Cdp\\V1beta1\xe2\x02\x1cKava\\Cdp\\V1beta1\\GPBMetadata\xea\x02\x12Kava::Cdp::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.cdp.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.kava.cdp.v1beta1B\007TxProtoZ%github.com/kava-labs/kava/x/cdp/types\242\002\003KCX\252\002\020Kava.Cdp.V1beta1\312\002\020Kava\\Cdp\\V1beta1\342\002\034Kava\\Cdp\\V1beta1\\GPBMetadata\352\002\022Kava::Cdp::V1beta1'
  _globals['_MSGCREATECDP'].fields_by_name['sender']._options = None
  _globals['_MSGCREATECDP'].fields_by_name['sender']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCREATECDP'].fields_by_name['collateral']._options = None
  _globals['_MSGCREATECDP'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000'
  _globals['_MSGCREATECDP'].fields_by_name['principal']._options = None
  _globals['_MSGCREATECDP'].fields_by_name['principal']._serialized_options = b'\310\336\037\000'
  _globals['_MSGCREATECDPRESPONSE'].fields_by_name['cdp_id']._options = None
  _globals['_MSGCREATECDPRESPONSE'].fields_by_name['cdp_id']._serialized_options = b'\342\336\037\005CdpID'
  _globals['_MSGDEPOSIT'].fields_by_name['depositor']._options = None
  _globals['_MSGDEPOSIT'].fields_by_name['depositor']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGDEPOSIT'].fields_by_name['owner']._options = None
  _globals['_MSGDEPOSIT'].fields_by_name['owner']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGDEPOSIT'].fields_by_name['collateral']._options = None
  _globals['_MSGDEPOSIT'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000'
  _globals['_MSGWITHDRAW'].fields_by_name['depositor']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['depositor']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGWITHDRAW'].fields_by_name['owner']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['owner']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGWITHDRAW'].fields_by_name['collateral']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000'
  _globals['_MSGDRAWDEBT'].fields_by_name['sender']._options = None
  _globals['_MSGDRAWDEBT'].fields_by_name['sender']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGDRAWDEBT'].fields_by_name['principal']._options = None
  _globals['_MSGDRAWDEBT'].fields_by_name['principal']._serialized_options = b'\310\336\037\000'
  _globals['_MSGREPAYDEBT'].fields_by_name['sender']._options = None
  _globals['_MSGREPAYDEBT'].fields_by_name['sender']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGREPAYDEBT'].fields_by_name['payment']._options = None
  _globals['_MSGREPAYDEBT'].fields_by_name['payment']._serialized_options = b'\310\336\037\000'
  _globals['_MSGLIQUIDATE'].fields_by_name['keeper']._options = None
  _globals['_MSGLIQUIDATE'].fields_by_name['keeper']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGLIQUIDATE'].fields_by_name['borrower']._options = None
  _globals['_MSGLIQUIDATE'].fields_by_name['borrower']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCREATECDP']._serialized_start=129
  _globals['_MSGCREATECDP']._serialized_end=362
  _globals['_MSGCREATECDPRESPONSE']._serialized_start=364
  _globals['_MSGCREATECDPRESPONSE']._serialized_end=420
  _globals['_MSGDEPOSIT']._serialized_start=423
  _globals['_MSGDEPOSIT']._serialized_end=645
  _globals['_MSGDEPOSITRESPONSE']._serialized_start=647
  _globals['_MSGDEPOSITRESPONSE']._serialized_end=667
  _globals['_MSGWITHDRAW']._serialized_start=670
  _globals['_MSGWITHDRAW']._serialized_end=893
  _globals['_MSGWITHDRAWRESPONSE']._serialized_start=895
  _globals['_MSGWITHDRAWRESPONSE']._serialized_end=916
  _globals['_MSGDRAWDEBT']._serialized_start=919
  _globals['_MSGDRAWDEBT']._serialized_end=1086
  _globals['_MSGDRAWDEBTRESPONSE']._serialized_start=1088
  _globals['_MSGDRAWDEBTRESPONSE']._serialized_end=1109
  _globals['_MSGREPAYDEBT']._serialized_start=1112
  _globals['_MSGREPAYDEBT']._serialized_end=1276
  _globals['_MSGREPAYDEBTRESPONSE']._serialized_start=1278
  _globals['_MSGREPAYDEBTRESPONSE']._serialized_end=1300
  _globals['_MSGLIQUIDATE']._serialized_start=1303
  _globals['_MSGLIQUIDATE']._serialized_end=1462
  _globals['_MSGLIQUIDATERESPONSE']._serialized_start=1464
  _globals['_MSGLIQUIDATERESPONSE']._serialized_end=1486
  _globals['_MSG']._serialized_start=1489
  _globals['_MSG']._serialized_end=1992
# @@protoc_insertion_point(module_scope)
