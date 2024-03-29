# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/lockup/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from amino import amino_pb2 as amino_dot_amino__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from osmosis.lockup import lock_pb2 as osmosis_dot_lockup_dot_lock__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17osmosis/lockup/tx.proto\x12\x0eosmosis.lockup\x1a\x14gogoproto/gogo.proto\x1a\x11\x61mino/amino.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19osmosis/lockup/lock.proto\"\xa5\x02\n\rMsgLockTokens\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12h\n\x08\x64uration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB1\xc8\xde\x1f\x00\xea\xde\x1f\x12\x64uration,omitempty\xf2\xde\x1f\x0fyaml:\"duration\"\x98\xdf\x1f\x01R\x08\x64uration\x12\x61\n\x05\x63oins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins:\x1f\x8a\xe7\xb0*\x1aosmosis/lockup/lock-tokens\"\'\n\x15MsgLockTokensResponse\x12\x0e\n\x02ID\x18\x01 \x01(\x04R\x02ID\"g\n\x14MsgBeginUnlockingAll\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner:\'\x8a\xe7\xb0*\"osmosis/lockup/begin-unlock-tokens\"T\n\x1cMsgBeginUnlockingAllResponse\x12\x34\n\x07unlocks\x18\x01 \x03(\x0b\x32\x1a.osmosis.lockup.PeriodLockR\x07unlocks\"\xdc\x01\n\x11MsgBeginUnlocking\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x0e\n\x02ID\x18\x02 \x01(\x04R\x02ID\x12\x61\n\x05\x63oins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins:,\x8a\xe7\xb0*\'osmosis/lockup/begin-unlock-period-lock\"_\n\x19MsgBeginUnlockingResponse\x12\x18\n\x07success\x18\x01 \x01(\x08R\x07success\x12(\n\x0funlockingLockID\x18\x02 \x01(\x04R\x0funlockingLockID\"\xb3\x01\n\x0fMsgExtendLockup\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x0e\n\x02ID\x18\x02 \x01(\x04R\x02ID\x12h\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB1\xc8\xde\x1f\x00\xea\xde\x1f\x12\x64uration,omitempty\xf2\xde\x1f\x0fyaml:\"duration\"\x98\xdf\x1f\x01R\x08\x64uration\"3\n\x17MsgExtendLockupResponse\x12\x18\n\x07success\x18\x01 \x01(\x08R\x07success\"\xab\x01\n\x0eMsgForceUnlock\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x0e\n\x02ID\x18\x02 \x01(\x04R\x02ID\x12\x61\n\x05\x63oins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins\"2\n\x16MsgForceUnlockResponse\x12\x18\n\x07success\x18\x01 \x01(\x08R\x07success\"\xa2\x01\n\x1bMsgSetRewardReceiverAddress\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x16\n\x06lockID\x18\x02 \x01(\x04R\x06lockID\x12\x43\n\x0freward_receiver\x18\x03 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"reward_receiver\"R\x0erewardReceiver\"?\n#MsgSetRewardReceiverAddressResponse\x12\x18\n\x07success\x18\x01 \x01(\x08R\x07success2\xd1\x04\n\x03Msg\x12R\n\nLockTokens\x12\x1d.osmosis.lockup.MsgLockTokens\x1a%.osmosis.lockup.MsgLockTokensResponse\x12g\n\x11\x42\x65ginUnlockingAll\x12$.osmosis.lockup.MsgBeginUnlockingAll\x1a,.osmosis.lockup.MsgBeginUnlockingAllResponse\x12^\n\x0e\x42\x65ginUnlocking\x12!.osmosis.lockup.MsgBeginUnlocking\x1a).osmosis.lockup.MsgBeginUnlockingResponse\x12X\n\x0c\x45xtendLockup\x12\x1f.osmosis.lockup.MsgExtendLockup\x1a\'.osmosis.lockup.MsgExtendLockupResponse\x12U\n\x0b\x46orceUnlock\x12\x1e.osmosis.lockup.MsgForceUnlock\x1a&.osmosis.lockup.MsgForceUnlockResponse\x12|\n\x18SetRewardReceiverAddress\x12+.osmosis.lockup.MsgSetRewardReceiverAddress\x1a\x33.osmosis.lockup.MsgSetRewardReceiverAddressResponseB\xa8\x01\n\x12\x63om.osmosis.lockupB\x07TxProtoZ2github.com/osmosis-labs/osmosis/v15/x/lockup/types\xa2\x02\x03OLX\xaa\x02\x0eOsmosis.Lockup\xca\x02\x0eOsmosis\\Lockup\xe2\x02\x1aOsmosis\\Lockup\\GPBMetadata\xea\x02\x0fOsmosis::Lockupb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.lockup.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022com.osmosis.lockupB\007TxProtoZ2github.com/osmosis-labs/osmosis/v15/x/lockup/types\242\002\003OLX\252\002\016Osmosis.Lockup\312\002\016Osmosis\\Lockup\342\002\032Osmosis\\Lockup\\GPBMetadata\352\002\017Osmosis::Lockup'
  _globals['_MSGLOCKTOKENS'].fields_by_name['owner']._options = None
  _globals['_MSGLOCKTOKENS'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGLOCKTOKENS'].fields_by_name['duration']._options = None
  _globals['_MSGLOCKTOKENS'].fields_by_name['duration']._serialized_options = b'\310\336\037\000\352\336\037\022duration,omitempty\362\336\037\017yaml:\"duration\"\230\337\037\001'
  _globals['_MSGLOCKTOKENS'].fields_by_name['coins']._options = None
  _globals['_MSGLOCKTOKENS'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGLOCKTOKENS']._options = None
  _globals['_MSGLOCKTOKENS']._serialized_options = b'\212\347\260*\032osmosis/lockup/lock-tokens'
  _globals['_MSGBEGINUNLOCKINGALL'].fields_by_name['owner']._options = None
  _globals['_MSGBEGINUNLOCKINGALL'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGBEGINUNLOCKINGALL']._options = None
  _globals['_MSGBEGINUNLOCKINGALL']._serialized_options = b'\212\347\260*\"osmosis/lockup/begin-unlock-tokens'
  _globals['_MSGBEGINUNLOCKING'].fields_by_name['owner']._options = None
  _globals['_MSGBEGINUNLOCKING'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGBEGINUNLOCKING'].fields_by_name['coins']._options = None
  _globals['_MSGBEGINUNLOCKING'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGBEGINUNLOCKING']._options = None
  _globals['_MSGBEGINUNLOCKING']._serialized_options = b'\212\347\260*\'osmosis/lockup/begin-unlock-period-lock'
  _globals['_MSGEXTENDLOCKUP'].fields_by_name['owner']._options = None
  _globals['_MSGEXTENDLOCKUP'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGEXTENDLOCKUP'].fields_by_name['duration']._options = None
  _globals['_MSGEXTENDLOCKUP'].fields_by_name['duration']._serialized_options = b'\310\336\037\000\352\336\037\022duration,omitempty\362\336\037\017yaml:\"duration\"\230\337\037\001'
  _globals['_MSGFORCEUNLOCK'].fields_by_name['owner']._options = None
  _globals['_MSGFORCEUNLOCK'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGFORCEUNLOCK'].fields_by_name['coins']._options = None
  _globals['_MSGFORCEUNLOCK'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGSETREWARDRECEIVERADDRESS'].fields_by_name['owner']._options = None
  _globals['_MSGSETREWARDRECEIVERADDRESS'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_MSGSETREWARDRECEIVERADDRESS'].fields_by_name['reward_receiver']._options = None
  _globals['_MSGSETREWARDRECEIVERADDRESS'].fields_by_name['reward_receiver']._serialized_options = b'\362\336\037\026yaml:\"reward_receiver\"'
  _globals['_MSGLOCKTOKENS']._serialized_start=176
  _globals['_MSGLOCKTOKENS']._serialized_end=469
  _globals['_MSGLOCKTOKENSRESPONSE']._serialized_start=471
  _globals['_MSGLOCKTOKENSRESPONSE']._serialized_end=510
  _globals['_MSGBEGINUNLOCKINGALL']._serialized_start=512
  _globals['_MSGBEGINUNLOCKINGALL']._serialized_end=615
  _globals['_MSGBEGINUNLOCKINGALLRESPONSE']._serialized_start=617
  _globals['_MSGBEGINUNLOCKINGALLRESPONSE']._serialized_end=701
  _globals['_MSGBEGINUNLOCKING']._serialized_start=704
  _globals['_MSGBEGINUNLOCKING']._serialized_end=924
  _globals['_MSGBEGINUNLOCKINGRESPONSE']._serialized_start=926
  _globals['_MSGBEGINUNLOCKINGRESPONSE']._serialized_end=1021
  _globals['_MSGEXTENDLOCKUP']._serialized_start=1024
  _globals['_MSGEXTENDLOCKUP']._serialized_end=1203
  _globals['_MSGEXTENDLOCKUPRESPONSE']._serialized_start=1205
  _globals['_MSGEXTENDLOCKUPRESPONSE']._serialized_end=1256
  _globals['_MSGFORCEUNLOCK']._serialized_start=1259
  _globals['_MSGFORCEUNLOCK']._serialized_end=1430
  _globals['_MSGFORCEUNLOCKRESPONSE']._serialized_start=1432
  _globals['_MSGFORCEUNLOCKRESPONSE']._serialized_end=1482
  _globals['_MSGSETREWARDRECEIVERADDRESS']._serialized_start=1485
  _globals['_MSGSETREWARDRECEIVERADDRESS']._serialized_end=1647
  _globals['_MSGSETREWARDRECEIVERADDRESSRESPONSE']._serialized_start=1649
  _globals['_MSGSETREWARDRECEIVERADDRESSRESPONSE']._serialized_end=1712
  _globals['_MSG']._serialized_start=1715
  _globals['_MSG']._serialized_end=2308
# @@protoc_insertion_point(module_scope)
