# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: noble/fiattokenfactory/tx.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fnoble/fiattokenfactory/tx.proto\x12\x16noble.fiattokenfactory\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"E\n\x15MsgUpdateMasterMinter\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x1f\n\x1dMsgUpdateMasterMinterResponse\"?\n\x0fMsgUpdatePauser\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x19\n\x17MsgUpdatePauserResponse\"D\n\x14MsgUpdateBlacklister\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x1e\n\x1cMsgUpdateBlacklisterResponse\">\n\x0eMsgUpdateOwner\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x18\n\x16MsgUpdateOwnerResponse\"$\n\x0eMsgAcceptOwner\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\"\x18\n\x16MsgAcceptOwnerResponse\"\x81\x01\n\x12MsgConfigureMinter\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12=\n\tallowance\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tallowance\"\x1c\n\x1aMsgConfigureMinterResponse\"?\n\x0fMsgRemoveMinter\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x19\n\x17MsgRemoveMinterResponse\"p\n\x07MsgMint\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x11\n\x0fMsgMintResponse\"V\n\x07MsgBurn\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x11\n\x0fMsgBurnResponse\"<\n\x0cMsgBlacklist\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x16\n\x14MsgBlacklistResponse\">\n\x0eMsgUnblacklist\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x18\n\x16MsgUnblacklistResponse\"\x1e\n\x08MsgPause\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\"\x12\n\x10MsgPauseResponse\" \n\nMsgUnpause\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\"\x14\n\x12MsgUnpauseResponse\"j\n\x1cMsgConfigureMinterController\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x1e\n\ncontroller\x18\x02 \x01(\tR\ncontroller\x12\x16\n\x06minter\x18\x03 \x01(\tR\x06minter\"&\n$MsgConfigureMinterControllerResponse\"O\n\x19MsgRemoveMinterController\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x1e\n\ncontroller\x18\x02 \x01(\tR\ncontroller\"#\n!MsgRemoveMinterControllerResponse2\xc6\x0c\n\x03Msg\x12z\n\x12UpdateMasterMinter\x12-.noble.fiattokenfactory.MsgUpdateMasterMinter\x1a\x35.noble.fiattokenfactory.MsgUpdateMasterMinterResponse\x12h\n\x0cUpdatePauser\x12\'.noble.fiattokenfactory.MsgUpdatePauser\x1a/.noble.fiattokenfactory.MsgUpdatePauserResponse\x12w\n\x11UpdateBlacklister\x12,.noble.fiattokenfactory.MsgUpdateBlacklister\x1a\x34.noble.fiattokenfactory.MsgUpdateBlacklisterResponse\x12\x65\n\x0bUpdateOwner\x12&.noble.fiattokenfactory.MsgUpdateOwner\x1a..noble.fiattokenfactory.MsgUpdateOwnerResponse\x12\x65\n\x0b\x41\x63\x63\x65ptOwner\x12&.noble.fiattokenfactory.MsgAcceptOwner\x1a..noble.fiattokenfactory.MsgAcceptOwnerResponse\x12q\n\x0f\x43onfigureMinter\x12*.noble.fiattokenfactory.MsgConfigureMinter\x1a\x32.noble.fiattokenfactory.MsgConfigureMinterResponse\x12h\n\x0cRemoveMinter\x12\'.noble.fiattokenfactory.MsgRemoveMinter\x1a/.noble.fiattokenfactory.MsgRemoveMinterResponse\x12P\n\x04Mint\x12\x1f.noble.fiattokenfactory.MsgMint\x1a\'.noble.fiattokenfactory.MsgMintResponse\x12P\n\x04\x42urn\x12\x1f.noble.fiattokenfactory.MsgBurn\x1a\'.noble.fiattokenfactory.MsgBurnResponse\x12_\n\tBlacklist\x12$.noble.fiattokenfactory.MsgBlacklist\x1a,.noble.fiattokenfactory.MsgBlacklistResponse\x12\x65\n\x0bUnblacklist\x12&.noble.fiattokenfactory.MsgUnblacklist\x1a..noble.fiattokenfactory.MsgUnblacklistResponse\x12S\n\x05Pause\x12 .noble.fiattokenfactory.MsgPause\x1a(.noble.fiattokenfactory.MsgPauseResponse\x12Y\n\x07Unpause\x12\".noble.fiattokenfactory.MsgUnpause\x1a*.noble.fiattokenfactory.MsgUnpauseResponse\x12\x8f\x01\n\x19\x43onfigureMinterController\x12\x34.noble.fiattokenfactory.MsgConfigureMinterController\x1a<.noble.fiattokenfactory.MsgConfigureMinterControllerResponse\x12\x86\x01\n\x16RemoveMinterController\x12\x31.noble.fiattokenfactory.MsgRemoveMinterController\x1a\x39.noble.fiattokenfactory.MsgRemoveMinterControllerResponseB\xdc\x01\n\x1a\x63om.noble.fiattokenfactoryB\x07TxProtoZ>github.com/strangelove-ventures/noble/x/fiattokenfactory/types\xa2\x02\x03NFX\xaa\x02\x16Noble.Fiattokenfactory\xca\x02\x16Noble\\Fiattokenfactory\xe2\x02\"Noble\\Fiattokenfactory\\GPBMetadata\xea\x02\x17Noble::Fiattokenfactoryb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'noble.fiattokenfactory.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.noble.fiattokenfactoryB\007TxProtoZ>github.com/strangelove-ventures/noble/x/fiattokenfactory/types\242\002\003NFX\252\002\026Noble.Fiattokenfactory\312\002\026Noble\\Fiattokenfactory\342\002\"Noble\\Fiattokenfactory\\GPBMetadata\352\002\027Noble::Fiattokenfactory'
  _globals['_MSGCONFIGUREMINTER'].fields_by_name['allowance']._options = None
  _globals['_MSGCONFIGUREMINTER'].fields_by_name['allowance']._serialized_options = b'\310\336\037\000'
  _globals['_MSGMINT'].fields_by_name['amount']._options = None
  _globals['_MSGMINT'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGBURN'].fields_by_name['amount']._options = None
  _globals['_MSGBURN'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGUPDATEMASTERMINTER']._serialized_start=113
  _globals['_MSGUPDATEMASTERMINTER']._serialized_end=182
  _globals['_MSGUPDATEMASTERMINTERRESPONSE']._serialized_start=184
  _globals['_MSGUPDATEMASTERMINTERRESPONSE']._serialized_end=215
  _globals['_MSGUPDATEPAUSER']._serialized_start=217
  _globals['_MSGUPDATEPAUSER']._serialized_end=280
  _globals['_MSGUPDATEPAUSERRESPONSE']._serialized_start=282
  _globals['_MSGUPDATEPAUSERRESPONSE']._serialized_end=307
  _globals['_MSGUPDATEBLACKLISTER']._serialized_start=309
  _globals['_MSGUPDATEBLACKLISTER']._serialized_end=377
  _globals['_MSGUPDATEBLACKLISTERRESPONSE']._serialized_start=379
  _globals['_MSGUPDATEBLACKLISTERRESPONSE']._serialized_end=409
  _globals['_MSGUPDATEOWNER']._serialized_start=411
  _globals['_MSGUPDATEOWNER']._serialized_end=473
  _globals['_MSGUPDATEOWNERRESPONSE']._serialized_start=475
  _globals['_MSGUPDATEOWNERRESPONSE']._serialized_end=499
  _globals['_MSGACCEPTOWNER']._serialized_start=501
  _globals['_MSGACCEPTOWNER']._serialized_end=537
  _globals['_MSGACCEPTOWNERRESPONSE']._serialized_start=539
  _globals['_MSGACCEPTOWNERRESPONSE']._serialized_end=563
  _globals['_MSGCONFIGUREMINTER']._serialized_start=566
  _globals['_MSGCONFIGUREMINTER']._serialized_end=695
  _globals['_MSGCONFIGUREMINTERRESPONSE']._serialized_start=697
  _globals['_MSGCONFIGUREMINTERRESPONSE']._serialized_end=725
  _globals['_MSGREMOVEMINTER']._serialized_start=727
  _globals['_MSGREMOVEMINTER']._serialized_end=790
  _globals['_MSGREMOVEMINTERRESPONSE']._serialized_start=792
  _globals['_MSGREMOVEMINTERRESPONSE']._serialized_end=817
  _globals['_MSGMINT']._serialized_start=819
  _globals['_MSGMINT']._serialized_end=931
  _globals['_MSGMINTRESPONSE']._serialized_start=933
  _globals['_MSGMINTRESPONSE']._serialized_end=950
  _globals['_MSGBURN']._serialized_start=952
  _globals['_MSGBURN']._serialized_end=1038
  _globals['_MSGBURNRESPONSE']._serialized_start=1040
  _globals['_MSGBURNRESPONSE']._serialized_end=1057
  _globals['_MSGBLACKLIST']._serialized_start=1059
  _globals['_MSGBLACKLIST']._serialized_end=1119
  _globals['_MSGBLACKLISTRESPONSE']._serialized_start=1121
  _globals['_MSGBLACKLISTRESPONSE']._serialized_end=1143
  _globals['_MSGUNBLACKLIST']._serialized_start=1145
  _globals['_MSGUNBLACKLIST']._serialized_end=1207
  _globals['_MSGUNBLACKLISTRESPONSE']._serialized_start=1209
  _globals['_MSGUNBLACKLISTRESPONSE']._serialized_end=1233
  _globals['_MSGPAUSE']._serialized_start=1235
  _globals['_MSGPAUSE']._serialized_end=1265
  _globals['_MSGPAUSERESPONSE']._serialized_start=1267
  _globals['_MSGPAUSERESPONSE']._serialized_end=1285
  _globals['_MSGUNPAUSE']._serialized_start=1287
  _globals['_MSGUNPAUSE']._serialized_end=1319
  _globals['_MSGUNPAUSERESPONSE']._serialized_start=1321
  _globals['_MSGUNPAUSERESPONSE']._serialized_end=1341
  _globals['_MSGCONFIGUREMINTERCONTROLLER']._serialized_start=1343
  _globals['_MSGCONFIGUREMINTERCONTROLLER']._serialized_end=1449
  _globals['_MSGCONFIGUREMINTERCONTROLLERRESPONSE']._serialized_start=1451
  _globals['_MSGCONFIGUREMINTERCONTROLLERRESPONSE']._serialized_end=1489
  _globals['_MSGREMOVEMINTERCONTROLLER']._serialized_start=1491
  _globals['_MSGREMOVEMINTERCONTROLLER']._serialized_end=1570
  _globals['_MSGREMOVEMINTERCONTROLLERRESPONSE']._serialized_start=1572
  _globals['_MSGREMOVEMINTERCONTROLLERRESPONSE']._serialized_end=1607
  _globals['_MSG']._serialized_start=1610
  _globals['_MSG']._serialized_end=3216
# @@protoc_insertion_point(module_scope)
