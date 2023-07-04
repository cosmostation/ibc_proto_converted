# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/locker/v1beta1/locker.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"comdex/locker/v1beta1/locker.proto\x12\x15\x63omdex.locker.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xe9\x05\n\x06Locker\x12\x31\n\tlocker_id\x18\x01 \x01(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"locker_id\"R\x08lockerId\x12\x32\n\tdepositor\x18\x02 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"depositor\"R\tdepositor\x12}\n\x13returns_accumulated\x18\x03 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1ayaml:\"returns_accumulated\"R\x12returnsAccumulated\x12\x65\n\x0bnet_balance\x18\x04 \x01(\tBD\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x12yaml:\"net_balance\"R\nnetBalance\x12X\n\ncreated_at\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"created_at\"\x90\xdf\x1f\x01R\tcreatedAt\x12\x45\n\x10\x61sset_deposit_id\x18\x06 \x01(\x04\x42\x1b\xf2\xde\x1f\x17yaml:\"asset_deposit_id\"R\x0e\x61ssetDepositId\x12\x31\n\tis_locked\x18\x07 \x01(\x08\x42\x14\xf2\xde\x1f\x10yaml:\"is_locked\"R\x08isLocked\x12(\n\x06\x61pp_id\x18\x08 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12:\n\x0c\x62lock_height\x18\t \x01(\x03\x42\x17\xf2\xde\x1f\x13yaml:\"block_height\"R\x0b\x62lockHeight\x12X\n\nblock_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"block_time\"\x90\xdf\x1f\x01R\tblockTime\"\xfe\x01\n\x19UserAppAssetLockerMapping\x12&\n\x05owner\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x19\n\x08\x61sset_id\x18\x03 \x01(\x04R\x07\x61ssetId\x12\x31\n\tlocker_id\x18\x04 \x01(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"locker_id\"R\x08lockerId\x12T\n\tuser_data\x18\x05 \x03(\x0b\x32!.comdex.locker.v1beta1.UserTxDataB\x14\xf2\xde\x1f\x10yaml:\"user_data\"R\x08userData\"\xbf\x02\n\nUserTxData\x12+\n\x07tx_type\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"tx_type\"R\x06txType\x12W\n\x06\x61mount\x18\x02 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\x12Z\n\x07\x62\x61lance\x18\x03 \x01(\tB@\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0eyaml:\"balance\"R\x07\x62\x61lance\x12O\n\x07tx_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"tx_time\"\x90\xdf\x1f\x01R\x06txTime\"\x87\x02\n\x15LockerLookupTableData\x12(\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12\x19\n\x08\x61sset_id\x18\x02 \x01(\x04R\x07\x61ssetId\x12\x33\n\nlocker_ids\x18\x03 \x03(\x04\x42\x14\xf2\xde\x1f\x10yaml:\"addresses\"R\tlockerIds\x12t\n\x10\x64\x65posited_amount\x18\x04 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"deposited_amount\"R\x0f\x64\x65positedAmount\"u\n\x19LockerProductAssetMapping\x12(\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12.\n\x08\x61sset_id\x18\x02 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\"\xc4\x01\n\x1cLockedDepositedAmountDataMap\x12.\n\x08\x61sset_id\x18\x01 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12t\n\x10\x64\x65posited_amount\x18\x02 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"deposited_amount\"R\x0f\x64\x65positedAmount\"\xe9\x01\n LockerTotalRewardsByAssetAppWise\x12(\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12.\n\x08\x61sset_id\x18\x02 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12k\n\rtotal_rewards\x18\x03 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x14yaml:\"total_rewards\"R\x0ctotalRewardsB\xd8\x01\n\x19\x63om.comdex.locker.v1beta1B\x0bLockerProtoP\x01Z0github.com/comdex-official/comdex/x/locker/types\xa2\x02\x03\x43LX\xaa\x02\x15\x43omdex.Locker.V1beta1\xca\x02\x15\x43omdex\\Locker\\V1beta1\xe2\x02!Comdex\\Locker\\V1beta1\\GPBMetadata\xea\x02\x17\x43omdex::Locker::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.locker.v1beta1.locker_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.comdex.locker.v1beta1B\013LockerProtoP\001Z0github.com/comdex-official/comdex/x/locker/types\242\002\003CLX\252\002\025Comdex.Locker.V1beta1\312\002\025Comdex\\Locker\\V1beta1\342\002!Comdex\\Locker\\V1beta1\\GPBMetadata\352\002\027Comdex::Locker::V1beta1\310\341\036\000\250\342\036\000'
  _LOCKER.fields_by_name['locker_id']._options = None
  _LOCKER.fields_by_name['locker_id']._serialized_options = b'\362\336\037\020yaml:\"locker_id\"'
  _LOCKER.fields_by_name['depositor']._options = None
  _LOCKER.fields_by_name['depositor']._serialized_options = b'\362\336\037\020yaml:\"depositor\"'
  _LOCKER.fields_by_name['returns_accumulated']._options = None
  _LOCKER.fields_by_name['returns_accumulated']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\032yaml:\"returns_accumulated\"'
  _LOCKER.fields_by_name['net_balance']._options = None
  _LOCKER.fields_by_name['net_balance']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\022yaml:\"net_balance\"'
  _LOCKER.fields_by_name['created_at']._options = None
  _LOCKER.fields_by_name['created_at']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"created_at\"\220\337\037\001'
  _LOCKER.fields_by_name['asset_deposit_id']._options = None
  _LOCKER.fields_by_name['asset_deposit_id']._serialized_options = b'\362\336\037\027yaml:\"asset_deposit_id\"'
  _LOCKER.fields_by_name['is_locked']._options = None
  _LOCKER.fields_by_name['is_locked']._serialized_options = b'\362\336\037\020yaml:\"is_locked\"'
  _LOCKER.fields_by_name['app_id']._options = None
  _LOCKER.fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _LOCKER.fields_by_name['block_height']._options = None
  _LOCKER.fields_by_name['block_height']._serialized_options = b'\362\336\037\023yaml:\"block_height\"'
  _LOCKER.fields_by_name['block_time']._options = None
  _LOCKER.fields_by_name['block_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"block_time\"\220\337\037\001'
  _USERAPPASSETLOCKERMAPPING.fields_by_name['owner']._options = None
  _USERAPPASSETLOCKERMAPPING.fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _USERAPPASSETLOCKERMAPPING.fields_by_name['locker_id']._options = None
  _USERAPPASSETLOCKERMAPPING.fields_by_name['locker_id']._serialized_options = b'\362\336\037\020yaml:\"locker_id\"'
  _USERAPPASSETLOCKERMAPPING.fields_by_name['user_data']._options = None
  _USERAPPASSETLOCKERMAPPING.fields_by_name['user_data']._serialized_options = b'\362\336\037\020yaml:\"user_data\"'
  _USERTXDATA.fields_by_name['tx_type']._options = None
  _USERTXDATA.fields_by_name['tx_type']._serialized_options = b'\362\336\037\016yaml:\"tx_type\"'
  _USERTXDATA.fields_by_name['amount']._options = None
  _USERTXDATA.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _USERTXDATA.fields_by_name['balance']._options = None
  _USERTXDATA.fields_by_name['balance']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\016yaml:\"balance\"'
  _USERTXDATA.fields_by_name['tx_time']._options = None
  _USERTXDATA.fields_by_name['tx_time']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"tx_time\"\220\337\037\001'
  _LOCKERLOOKUPTABLEDATA.fields_by_name['app_id']._options = None
  _LOCKERLOOKUPTABLEDATA.fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _LOCKERLOOKUPTABLEDATA.fields_by_name['locker_ids']._options = None
  _LOCKERLOOKUPTABLEDATA.fields_by_name['locker_ids']._serialized_options = b'\362\336\037\020yaml:\"addresses\"'
  _LOCKERLOOKUPTABLEDATA.fields_by_name['deposited_amount']._options = None
  _LOCKERLOOKUPTABLEDATA.fields_by_name['deposited_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"deposited_amount\"'
  _LOCKERPRODUCTASSETMAPPING.fields_by_name['app_id']._options = None
  _LOCKERPRODUCTASSETMAPPING.fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _LOCKERPRODUCTASSETMAPPING.fields_by_name['asset_id']._options = None
  _LOCKERPRODUCTASSETMAPPING.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _LOCKEDDEPOSITEDAMOUNTDATAMAP.fields_by_name['asset_id']._options = None
  _LOCKEDDEPOSITEDAMOUNTDATAMAP.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _LOCKEDDEPOSITEDAMOUNTDATAMAP.fields_by_name['deposited_amount']._options = None
  _LOCKEDDEPOSITEDAMOUNTDATAMAP.fields_by_name['deposited_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"deposited_amount\"'
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['app_id']._options = None
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['asset_id']._options = None
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['total_rewards']._options = None
  _LOCKERTOTALREWARDSBYASSETAPPWISE.fields_by_name['total_rewards']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\024yaml:\"total_rewards\"'
  _globals['_LOCKER']._serialized_start=149
  _globals['_LOCKER']._serialized_end=894
  _globals['_USERAPPASSETLOCKERMAPPING']._serialized_start=897
  _globals['_USERAPPASSETLOCKERMAPPING']._serialized_end=1151
  _globals['_USERTXDATA']._serialized_start=1154
  _globals['_USERTXDATA']._serialized_end=1473
  _globals['_LOCKERLOOKUPTABLEDATA']._serialized_start=1476
  _globals['_LOCKERLOOKUPTABLEDATA']._serialized_end=1739
  _globals['_LOCKERPRODUCTASSETMAPPING']._serialized_start=1741
  _globals['_LOCKERPRODUCTASSETMAPPING']._serialized_end=1858
  _globals['_LOCKEDDEPOSITEDAMOUNTDATAMAP']._serialized_start=1861
  _globals['_LOCKEDDEPOSITEDAMOUNTDATAMAP']._serialized_end=2057
  _globals['_LOCKERTOTALREWARDSBYASSETAPPWISE']._serialized_start=2060
  _globals['_LOCKERTOTALREWARDSBYASSETAPPWISE']._serialized_end=2293
# @@protoc_insertion_point(module_scope)