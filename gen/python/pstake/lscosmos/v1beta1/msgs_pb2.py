# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: pstake/lscosmos/v1beta1/msgs.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from pstake.lscosmos.v1beta1 import lscosmos_pb2 as pstake_dot_lscosmos_dot_v1beta1_dot_lscosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"pstake/lscosmos/v1beta1/msgs.proto\x12\x17pstake.lscosmos.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a&pstake/lscosmos/v1beta1/lscosmos.proto\"\xa8\x01\n\x0eMsgLiquidStake\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:\x16\x82\xe7\xb0*\x11\x64\x65legator_address\"\x18\n\x16MsgLiquidStakeResponse\"\xaa\x01\n\x10MsgLiquidUnstake\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:\x16\x82\xe7\xb0*\x11\x64\x65legator_address\"\x1a\n\x18MsgLiquidUnstakeResponse\"\xa3\x01\n\tMsgRedeem\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:\x16\x82\xe7\xb0*\x11\x64\x65legator_address\"\x13\n\x11MsgRedeemResponse\"i\n\x08MsgClaim\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress:\x16\x82\xe7\xb0*\x11\x64\x65legator_address\"\x12\n\x10MsgClaimResponse\"`\n\x0eMsgRecreateICA\x12;\n\x0c\x66rom_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0b\x66romAddress:\x11\x82\xe7\xb0*\x0c\x66rom_address\"\x18\n\x16MsgRecreateICAResponse\"\x97\x05\n\x0cMsgJumpStart\x12?\n\x0epstake_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\rpstakeAddress\x12\x1a\n\tchain_i_d\x18\x02 \x01(\tR\x07\x63hainID\x12$\n\x0e\x63onnection_i_d\x18\x03 \x01(\tR\x0c\x63onnectionID\x12)\n\x10transfer_channel\x18\x04 \x01(\tR\x0ftransferChannel\x12#\n\rtransfer_port\x18\x05 \x01(\tR\x0ctransferPort\x12\x1d\n\nbase_denom\x18\x06 \x01(\tR\tbaseDenom\x12\x1d\n\nmint_denom\x18\x07 \x01(\tR\tmintDenom\x12O\n\x0bmin_deposit\x18\x08 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\nminDeposit\x12l\n\x17\x61llow_listed_validators\x18\t \x01(\x0b\x32..pstake.lscosmos.v1beta1.AllowListedValidatorsB\x04\xc8\xde\x1f\x00R\x15\x61llowListedValidators\x12P\n\rpstake_params\x18\n \x01(\x0b\x32%.pstake.lscosmos.v1beta1.PstakeParamsB\x04\xc8\xde\x1f\x00R\x0cpstakeParams\x12P\n\rhost_accounts\x18\x0b \x01(\x0b\x32%.pstake.lscosmos.v1beta1.HostAccountsB\x04\xc8\xde\x1f\x00R\x0chostAccounts:\x13\x82\xe7\xb0*\x0epstake_address\"\x16\n\x14MsgJumpStartResponse\"\x8f\x01\n\x14MsgChangeModuleState\x12?\n\x0epstake_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\rpstakeAddress\x12!\n\x0cmodule_state\x18\x02 \x01(\x08R\x0bmoduleState:\x13\x82\xe7\xb0*\x0epstake_address\"\x1e\n\x1cMsgChangeModuleStateResponse\"\x96\x01\n\x11MsgReportSlashing\x12?\n\x0epstake_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\rpstakeAddress\x12+\n\x11validator_address\x18\x02 \x01(\tR\x10validatorAddress:\x13\x82\xe7\xb0*\x0epstake_address\"\x1b\n\x19MsgReportSlashingResponse2\xbc\t\n\x03Msg\x12\x95\x01\n\x0bLiquidStake\x12\'.pstake.lscosmos.v1beta1.MsgLiquidStake\x1a/.pstake.lscosmos.v1beta1.MsgLiquidStakeResponse\",\x82\xd3\xe4\x93\x02&\"$/pstake/lscosmos/v1beta1/LiquidStake\x12\x9d\x01\n\rLiquidUnstake\x12).pstake.lscosmos.v1beta1.MsgLiquidUnstake\x1a\x31.pstake.lscosmos.v1beta1.MsgLiquidUnstakeResponse\".\x82\xd3\xe4\x93\x02(\"&/pstake/lscosmos/v1beta1/LiquidUnstake\x12\x81\x01\n\x06Redeem\x12\".pstake.lscosmos.v1beta1.MsgRedeem\x1a*.pstake.lscosmos.v1beta1.MsgRedeemResponse\"\'\x82\xd3\xe4\x93\x02!\"\x1f/pstake/lscosmos/v1beta1/Redeem\x12}\n\x05\x43laim\x12!.pstake.lscosmos.v1beta1.MsgClaim\x1a).pstake.lscosmos.v1beta1.MsgClaimResponse\"&\x82\xd3\xe4\x93\x02 \"\x1e/pstake/lscosmos/v1beta1/Claim\x12\x95\x01\n\x0bRecreateICA\x12\'.pstake.lscosmos.v1beta1.MsgRecreateICA\x1a/.pstake.lscosmos.v1beta1.MsgRecreateICAResponse\",\x82\xd3\xe4\x93\x02&\"$/pstake/lscosmos/v1beta1/RecreateICA\x12\x8d\x01\n\tJumpStart\x12%.pstake.lscosmos.v1beta1.MsgJumpStart\x1a-.pstake.lscosmos.v1beta1.MsgJumpStartResponse\"*\x82\xd3\xe4\x93\x02$\"\"/pstake/lscosmos/v1beta1/JumpStart\x12\xad\x01\n\x11\x43hangeModuleState\x12-.pstake.lscosmos.v1beta1.MsgChangeModuleState\x1a\x35.pstake.lscosmos.v1beta1.MsgChangeModuleStateResponse\"2\x82\xd3\xe4\x93\x02,\"*/pstake/lscosmos/v1beta1/ChangeModuleState\x12\xa1\x01\n\x0eReportSlashing\x12*.pstake.lscosmos.v1beta1.MsgReportSlashing\x1a\x32.pstake.lscosmos.v1beta1.MsgReportSlashingResponse\"/\x82\xd3\xe4\x93\x02)\"\'/pstake/lscosmos/v1beta1/ReportSlashingB\xe3\x01\n\x1b\x63om.pstake.lscosmos.v1beta1B\tMsgsProtoP\x01Z;github.com/persistenceOne/pstake-native/v2/x/lscosmos/types\xa2\x02\x03PLX\xaa\x02\x17Pstake.Lscosmos.V1beta1\xca\x02\x17Pstake\\Lscosmos\\V1beta1\xe2\x02#Pstake\\Lscosmos\\V1beta1\\GPBMetadata\xea\x02\x19Pstake::Lscosmos::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'pstake.lscosmos.v1beta1.msgs_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.pstake.lscosmos.v1beta1B\tMsgsProtoP\001Z;github.com/persistenceOne/pstake-native/v2/x/lscosmos/types\242\002\003PLX\252\002\027Pstake.Lscosmos.V1beta1\312\002\027Pstake\\Lscosmos\\V1beta1\342\002#Pstake\\Lscosmos\\V1beta1\\GPBMetadata\352\002\031Pstake::Lscosmos::V1beta1'
  _MSGLIQUIDSTAKE.fields_by_name['delegator_address']._options = None
  _MSGLIQUIDSTAKE.fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGLIQUIDSTAKE.fields_by_name['amount']._options = None
  _MSGLIQUIDSTAKE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGLIQUIDSTAKE._options = None
  _MSGLIQUIDSTAKE._serialized_options = b'\202\347\260*\021delegator_address'
  _MSGLIQUIDUNSTAKE.fields_by_name['delegator_address']._options = None
  _MSGLIQUIDUNSTAKE.fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGLIQUIDUNSTAKE.fields_by_name['amount']._options = None
  _MSGLIQUIDUNSTAKE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGLIQUIDUNSTAKE._options = None
  _MSGLIQUIDUNSTAKE._serialized_options = b'\202\347\260*\021delegator_address'
  _MSGREDEEM.fields_by_name['delegator_address']._options = None
  _MSGREDEEM.fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGREDEEM.fields_by_name['amount']._options = None
  _MSGREDEEM.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGREDEEM._options = None
  _MSGREDEEM._serialized_options = b'\202\347\260*\021delegator_address'
  _MSGCLAIM.fields_by_name['delegator_address']._options = None
  _MSGCLAIM.fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGCLAIM._options = None
  _MSGCLAIM._serialized_options = b'\202\347\260*\021delegator_address'
  _MSGRECREATEICA.fields_by_name['from_address']._options = None
  _MSGRECREATEICA.fields_by_name['from_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGRECREATEICA._options = None
  _MSGRECREATEICA._serialized_options = b'\202\347\260*\014from_address'
  _MSGJUMPSTART.fields_by_name['pstake_address']._options = None
  _MSGJUMPSTART.fields_by_name['pstake_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGJUMPSTART.fields_by_name['min_deposit']._options = None
  _MSGJUMPSTART.fields_by_name['min_deposit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGJUMPSTART.fields_by_name['allow_listed_validators']._options = None
  _MSGJUMPSTART.fields_by_name['allow_listed_validators']._serialized_options = b'\310\336\037\000'
  _MSGJUMPSTART.fields_by_name['pstake_params']._options = None
  _MSGJUMPSTART.fields_by_name['pstake_params']._serialized_options = b'\310\336\037\000'
  _MSGJUMPSTART.fields_by_name['host_accounts']._options = None
  _MSGJUMPSTART.fields_by_name['host_accounts']._serialized_options = b'\310\336\037\000'
  _MSGJUMPSTART._options = None
  _MSGJUMPSTART._serialized_options = b'\202\347\260*\016pstake_address'
  _MSGCHANGEMODULESTATE.fields_by_name['pstake_address']._options = None
  _MSGCHANGEMODULESTATE.fields_by_name['pstake_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGCHANGEMODULESTATE._options = None
  _MSGCHANGEMODULESTATE._serialized_options = b'\202\347\260*\016pstake_address'
  _MSGREPORTSLASHING.fields_by_name['pstake_address']._options = None
  _MSGREPORTSLASHING.fields_by_name['pstake_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGREPORTSLASHING._options = None
  _MSGREPORTSLASHING._serialized_options = b'\202\347\260*\016pstake_address'
  _MSG.methods_by_name['LiquidStake']._options = None
  _MSG.methods_by_name['LiquidStake']._serialized_options = b'\202\323\344\223\002&\"$/pstake/lscosmos/v1beta1/LiquidStake'
  _MSG.methods_by_name['LiquidUnstake']._options = None
  _MSG.methods_by_name['LiquidUnstake']._serialized_options = b'\202\323\344\223\002(\"&/pstake/lscosmos/v1beta1/LiquidUnstake'
  _MSG.methods_by_name['Redeem']._options = None
  _MSG.methods_by_name['Redeem']._serialized_options = b'\202\323\344\223\002!\"\037/pstake/lscosmos/v1beta1/Redeem'
  _MSG.methods_by_name['Claim']._options = None
  _MSG.methods_by_name['Claim']._serialized_options = b'\202\323\344\223\002 \"\036/pstake/lscosmos/v1beta1/Claim'
  _MSG.methods_by_name['RecreateICA']._options = None
  _MSG.methods_by_name['RecreateICA']._serialized_options = b'\202\323\344\223\002&\"$/pstake/lscosmos/v1beta1/RecreateICA'
  _MSG.methods_by_name['JumpStart']._options = None
  _MSG.methods_by_name['JumpStart']._serialized_options = b'\202\323\344\223\002$\"\"/pstake/lscosmos/v1beta1/JumpStart'
  _MSG.methods_by_name['ChangeModuleState']._options = None
  _MSG.methods_by_name['ChangeModuleState']._serialized_options = b'\202\323\344\223\002,\"*/pstake/lscosmos/v1beta1/ChangeModuleState'
  _MSG.methods_by_name['ReportSlashing']._options = None
  _MSG.methods_by_name['ReportSlashing']._serialized_options = b'\202\323\344\223\002)\"\'/pstake/lscosmos/v1beta1/ReportSlashing'
  _globals['_MSGLIQUIDSTAKE']._serialized_start=267
  _globals['_MSGLIQUIDSTAKE']._serialized_end=435
  _globals['_MSGLIQUIDSTAKERESPONSE']._serialized_start=437
  _globals['_MSGLIQUIDSTAKERESPONSE']._serialized_end=461
  _globals['_MSGLIQUIDUNSTAKE']._serialized_start=464
  _globals['_MSGLIQUIDUNSTAKE']._serialized_end=634
  _globals['_MSGLIQUIDUNSTAKERESPONSE']._serialized_start=636
  _globals['_MSGLIQUIDUNSTAKERESPONSE']._serialized_end=662
  _globals['_MSGREDEEM']._serialized_start=665
  _globals['_MSGREDEEM']._serialized_end=828
  _globals['_MSGREDEEMRESPONSE']._serialized_start=830
  _globals['_MSGREDEEMRESPONSE']._serialized_end=849
  _globals['_MSGCLAIM']._serialized_start=851
  _globals['_MSGCLAIM']._serialized_end=956
  _globals['_MSGCLAIMRESPONSE']._serialized_start=958
  _globals['_MSGCLAIMRESPONSE']._serialized_end=976
  _globals['_MSGRECREATEICA']._serialized_start=978
  _globals['_MSGRECREATEICA']._serialized_end=1074
  _globals['_MSGRECREATEICARESPONSE']._serialized_start=1076
  _globals['_MSGRECREATEICARESPONSE']._serialized_end=1100
  _globals['_MSGJUMPSTART']._serialized_start=1103
  _globals['_MSGJUMPSTART']._serialized_end=1766
  _globals['_MSGJUMPSTARTRESPONSE']._serialized_start=1768
  _globals['_MSGJUMPSTARTRESPONSE']._serialized_end=1790
  _globals['_MSGCHANGEMODULESTATE']._serialized_start=1793
  _globals['_MSGCHANGEMODULESTATE']._serialized_end=1936
  _globals['_MSGCHANGEMODULESTATERESPONSE']._serialized_start=1938
  _globals['_MSGCHANGEMODULESTATERESPONSE']._serialized_end=1968
  _globals['_MSGREPORTSLASHING']._serialized_start=1971
  _globals['_MSGREPORTSLASHING']._serialized_end=2121
  _globals['_MSGREPORTSLASHINGRESPONSE']._serialized_start=2123
  _globals['_MSGREPORTSLASHINGRESPONSE']._serialized_end=2150
  _globals['_MSG']._serialized_start=2153
  _globals['_MSG']._serialized_end=3365
# @@protoc_insertion_point(module_scope)