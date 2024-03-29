# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/millions/callbacks.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$lum-network/millions/callbacks.proto\x12\x14lum.network.millions\x1a\x14gogoproto/gogo.proto\"\x86\x01\n\x0fSplitDelegation\x12+\n\x11validator_address\x18\x01 \x01(\tR\x10validatorAddress\x12\x46\n\x06\x61mount\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\"\x9e\x01\n\x10\x44\x65legateCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x1d\n\ndeposit_id\x18\x02 \x01(\x04R\tdepositId\x12R\n\x11split_delegations\x18\x03 \x03(\x0b\x32%.lum.network.millions.SplitDelegationR\x10splitDelegations\"\xa6\x01\n\x12UndelegateCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12#\n\rwithdrawal_id\x18\x02 \x01(\x04R\x0cwithdrawalId\x12R\n\x11split_delegations\x18\x03 \x03(\x0b\x32%.lum.network.millions.SplitDelegationR\x10splitDelegations\"\x7f\n\x12RedelegateCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12P\n\x10split_delegation\x18\x02 \x01(\x0b\x32%.lum.network.millions.SplitDelegationR\x0fsplitDelegation\"H\n\x14\x43laimRewardsCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x17\n\x07\x64raw_id\x18\x02 \x01(\x04R\x06\x64rawId\"R\n\x18TransferToNativeCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x1d\n\ndeposit_id\x18\x02 \x01(\x04R\tdepositId\"\xab\x01\n\x1aTransferFromNativeCallback\x12\x36\n\x04type\x18\x01 \x01(\x0e\x32\".lum.network.millions.TransferTypeR\x04type\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x17\n\x07\x64raw_id\x18\x03 \x01(\x04R\x06\x64rawId\x12#\n\rwithdrawal_id\x18\x04 \x01(\x04R\x0cwithdrawalId\"5\n\x1aSetWithdrawAddressCallback\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId*\x92\x01\n\x0cTransferType\x12.\n\x19TRANSFER_TYPE_UNSPECIFIED\x10\x00\x1a\x0f\x8a\x9d \x0bUnspecified\x12\"\n\x13TRANSFER_TYPE_CLAIM\x10\x01\x1a\t\x8a\x9d \x05\x43laim\x12(\n\x16TRANSFER_TYPE_WITHDRAW\x10\x02\x1a\x0c\x8a\x9d \x08Withdraw\x1a\x04\x88\xa3\x1e\x01\x42\xc9\x01\n\x18\x63om.lum.network.millionsB\x0e\x43\x61llbacksProtoZ-github.com/lum-network/chain/x/millions/types\xa2\x02\x03LNM\xaa\x02\x14Lum.Network.Millions\xca\x02\x14Lum\\Network\\Millions\xe2\x02 Lum\\Network\\Millions\\GPBMetadata\xea\x02\x16Lum::Network::Millionsb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.millions.callbacks_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.lum.network.millionsB\016CallbacksProtoZ-github.com/lum-network/chain/x/millions/types\242\002\003LNM\252\002\024Lum.Network.Millions\312\002\024Lum\\Network\\Millions\342\002 Lum\\Network\\Millions\\GPBMetadata\352\002\026Lum::Network::Millions'
  _globals['_TRANSFERTYPE']._options = None
  _globals['_TRANSFERTYPE']._serialized_options = b'\210\243\036\001'
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_UNSPECIFIED"]._options = None
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \013Unspecified'
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_CLAIM"]._options = None
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_CLAIM"]._serialized_options = b'\212\235 \005Claim'
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_WITHDRAW"]._options = None
  _globals['_TRANSFERTYPE'].values_by_name["TRANSFER_TYPE_WITHDRAW"]._serialized_options = b'\212\235 \010Withdraw'
  _globals['_SPLITDELEGATION'].fields_by_name['amount']._options = None
  _globals['_SPLITDELEGATION'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_TRANSFERTYPE']._serialized_start=1068
  _globals['_TRANSFERTYPE']._serialized_end=1214
  _globals['_SPLITDELEGATION']._serialized_start=85
  _globals['_SPLITDELEGATION']._serialized_end=219
  _globals['_DELEGATECALLBACK']._serialized_start=222
  _globals['_DELEGATECALLBACK']._serialized_end=380
  _globals['_UNDELEGATECALLBACK']._serialized_start=383
  _globals['_UNDELEGATECALLBACK']._serialized_end=549
  _globals['_REDELEGATECALLBACK']._serialized_start=551
  _globals['_REDELEGATECALLBACK']._serialized_end=678
  _globals['_CLAIMREWARDSCALLBACK']._serialized_start=680
  _globals['_CLAIMREWARDSCALLBACK']._serialized_end=752
  _globals['_TRANSFERTONATIVECALLBACK']._serialized_start=754
  _globals['_TRANSFERTONATIVECALLBACK']._serialized_end=836
  _globals['_TRANSFERFROMNATIVECALLBACK']._serialized_start=839
  _globals['_TRANSFERFROMNATIVECALLBACK']._serialized_end=1010
  _globals['_SETWITHDRAWADDRESSCALLBACK']._serialized_start=1012
  _globals['_SETWITHDRAWADDRESSCALLBACK']._serialized_end=1065
# @@protoc_insertion_point(module_scope)
