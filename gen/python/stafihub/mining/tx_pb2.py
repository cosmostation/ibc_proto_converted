# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/mining/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18stafihub/mining/tx.proto\x12\x18stafihub.stafihub.mining\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x92\x02\n\x0fMsgAddStakePool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12(\n\x0fstakeTokenDenom\x18\x02 \x01(\tR\x0fstakeTokenDenom\x12^\n\x12rewardPoolInfoList\x18\x03 \x03(\x0b\x32..stafihub.stafihub.mining.CreateRewardPoolInfoR\x12rewardPoolInfoList\x12[\n\x11stakeItemInfoList\x18\x04 \x03(\x0b\x32-.stafihub.stafihub.mining.CreateStakeItemInfoR\x11stakeItemInfoList\"\xb6\x02\n\x14\x43reateRewardPoolInfo\x12*\n\x10rewardTokenDenom\x18\x01 \x01(\tR\x10rewardTokenDenom\x12\\\n\x11totalRewardAmount\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11totalRewardAmount\x12X\n\x0frewardPerSecond\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0frewardPerSecond\x12:\n\x0estartTimestamp\x18\x04 \x01(\x04\x42\x12\xea\xde\x1f\x0estartTimestampR\x0estartTimestamp\"\x9f\x01\n\x13\x43reateStakeItemInfo\x12.\n\nlockSecond\x18\x01 \x01(\x04\x42\x0e\xea\xde\x1f\nlockSecondR\nlockSecond\x12X\n\x0fpowerRewardRate\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x0fpowerRewardRate\"\x19\n\x17MsgAddStakePoolResponse\"\x89\x02\n\x0fMsgAddStakeItem\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12.\n\nlockSecond\x18\x03 \x01(\x04\x42\x0e\xea\xde\x1f\nlockSecondR\nlockSecond\x12X\n\x0fpowerRewardRate\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x0fpowerRewardRate\x12\x16\n\x06\x65nable\x18\x05 \x01(\x08R\x06\x65nable\"\x19\n\x17MsgAddStakeItemResponse\"\x88\x03\n\x10MsgAddRewardPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12*\n\x10rewardTokenDenom\x18\x03 \x01(\tR\x10rewardTokenDenom\x12\\\n\x11totalRewardAmount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11totalRewardAmount\x12X\n\x0frewardPerSecond\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0frewardPerSecond\x12:\n\x0estartTimestamp\x18\x06 \x01(\x04\x42\x12\xea\xde\x1f\x0estartTimestampR\x0estartTimestamp\"\x1a\n\x18MsgAddRewardPoolResponse\"\xee\x01\n\x08MsgStake\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12P\n\x0bstakeAmount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0bstakeAmount\x12:\n\x0estakeItemIndex\x18\x04 \x01(\rB\x12\xea\xde\x1f\x0estakeItemIndexR\x0estakeItemIndex\"\x12\n\x10MsgStakeResponse\"\xa8\x01\n\x0eMsgClaimReward\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12@\n\x10stakeRecordIndex\x18\x03 \x01(\rB\x14\xea\xde\x1f\x10stakeRecordIndexR\x10stakeRecordIndex\"\x18\n\x16MsgClaimRewardResponse\"\xfd\x01\n\x0bMsgWithdraw\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12@\n\x10stakeRecordIndex\x18\x03 \x01(\rB\x14\xea\xde\x1f\x10stakeRecordIndexR\x10stakeRecordIndex\x12V\n\x0ewithdrawAmount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0ewithdrawAmount\"\x15\n\x13MsgWithdrawResponse\"\xad\x02\n\x12MsgUpdateStakeItem\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1f\n\x05index\x18\x02 \x01(\rB\t\xea\xde\x1f\x05indexR\x05index\x12:\n\x0estakePoolIndex\x18\x03 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12.\n\nlockSecond\x18\x04 \x01(\x04\x42\x0e\xea\xde\x1f\nlockSecondR\nlockSecond\x12X\n\x0fpowerRewardRate\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x0fpowerRewardRate\x12\x16\n\x06\x65nable\x18\x06 \x01(\x08R\x06\x65nable\"\x1c\n\x1aMsgUpdateStakeItemResponse\"R\n\x14MsgAddMiningProvider\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12 \n\x0buserAddress\x18\x02 \x01(\tR\x0buserAddress\"\x1e\n\x1cMsgAddMiningProviderResponse\"Q\n\x13MsgRmMiningProvider\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12 \n\x0buserAddress\x18\x02 \x01(\tR\x0buserAddress\"\x1d\n\x1bMsgRmMiningProviderResponse\"\x87\x02\n\x11MsgAddRewardToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12\x62\n\x14minTotalRewardAmount\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x14minTotalRewardAmount\x12^\n\x12minRewardPerSecond\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x12minRewardPerSecond\"\x1b\n\x19MsgAddRewardTokenResponse\"Y\n\x19MsgSetMaxRewardPoolNumber\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\"\n\x06number\x18\x02 \x01(\rB\n\xea\xde\x1f\x06numberR\x06number\"#\n!MsgSetMaxRewardPoolNumberResponse\"\x84\x02\n\x13MsgUpdateRewardPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12=\n\x0frewardPoolIndex\x18\x03 \x01(\rB\x13\xea\xde\x1f\x0frewardPoolIndexR\x0frewardPoolIndex\x12X\n\x0frewardPerSecond\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0frewardPerSecond\"\x1d\n\x1bMsgUpdateRewardPoolResponse\"3\n\x17MsgToggleProviderSwitch\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\"!\n\x1fMsgToggleProviderSwitchResponse\"X\n\x18MsgSetMaxStakeItemNumber\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\"\n\x06number\x18\x02 \x01(\rB\n\xea\xde\x1f\x06numberR\x06number\"\"\n MsgSetMaxStakeItemNumberResponse\"\x87\x03\n\x0cMsgAddReward\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12=\n\x0frewardPoolIndex\x18\x03 \x01(\rB\x13\xea\xde\x1f\x0frewardPoolIndexR\x0frewardPoolIndex\x12L\n\taddAmount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\taddAmount\x12:\n\x0estartTimestamp\x18\x05 \x01(\x04\x42\x12\xea\xde\x1f\x0estartTimestampR\x0estartTimestamp\x12X\n\x0frewardPerSecond\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0frewardPerSecond\"\x16\n\x14MsgAddRewardResponse\"p\n\x18MsgToggleEmergencySwitch\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\"\"\n MsgToggleEmergencySwitchResponse\"\xae\x01\n\x14MsgEmergencyWithdraw\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12@\n\x10stakeRecordIndex\x18\x03 \x01(\rB\x14\xea\xde\x1f\x10stakeRecordIndexR\x10stakeRecordIndex\"\x1e\n\x1cMsgEmergencyWithdrawResponse\"B\n\x10MsgAddStakeToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"\x1a\n\x18MsgAddStakeTokenResponse\"B\n\x10MsgRmRewardToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"\x1a\n\x18MsgRmRewardTokenResponse\"A\n\x0fMsgRmStakeToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\"\x19\n\x17MsgRmStakeTokenResponse\"\xc9\x01\n\x14MsgSetStakeItemLimit\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x37\n\rmaxLockSecond\x18\x02 \x01(\x04\x42\x11\xea\xde\x1f\rmaxLockSecondR\rmaxLockSecond\x12^\n\x12maxPowerRewardRate\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/stafihub/stafihub/utils.DecR\x12maxPowerRewardRate\"\x1e\n\x1cMsgSetStakeItemLimitResponse\"\x85\x02\n\x16MsgWithdrawRewardToken\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12:\n\x0estakePoolIndex\x18\x02 \x01(\rB\x12\xea\xde\x1f\x0estakePoolIndexR\x0estakePoolIndex\x12=\n\x0frewardPoolIndex\x18\x03 \x01(\rB\x13\xea\xde\x1f\x0frewardPoolIndexR\x0frewardPoolIndex\x12V\n\x0ewithdrawAmount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0ewithdrawAmount\" \n\x1eMsgWithdrawRewardTokenResponse2\xaf\x14\n\x03Msg\x12l\n\x0c\x41\x64\x64StakePool\x12).stafihub.stafihub.mining.MsgAddStakePool\x1a\x31.stafihub.stafihub.mining.MsgAddStakePoolResponse\x12l\n\x0c\x41\x64\x64StakeItem\x12).stafihub.stafihub.mining.MsgAddStakeItem\x1a\x31.stafihub.stafihub.mining.MsgAddStakeItemResponse\x12o\n\rAddRewardPool\x12*.stafihub.stafihub.mining.MsgAddRewardPool\x1a\x32.stafihub.stafihub.mining.MsgAddRewardPoolResponse\x12W\n\x05Stake\x12\".stafihub.stafihub.mining.MsgStake\x1a*.stafihub.stafihub.mining.MsgStakeResponse\x12i\n\x0b\x43laimReward\x12(.stafihub.stafihub.mining.MsgClaimReward\x1a\x30.stafihub.stafihub.mining.MsgClaimRewardResponse\x12`\n\x08Withdraw\x12%.stafihub.stafihub.mining.MsgWithdraw\x1a-.stafihub.stafihub.mining.MsgWithdrawResponse\x12u\n\x0fUpdateStakeItem\x12,.stafihub.stafihub.mining.MsgUpdateStakeItem\x1a\x34.stafihub.stafihub.mining.MsgUpdateStakeItemResponse\x12{\n\x11\x41\x64\x64MiningProvider\x12..stafihub.stafihub.mining.MsgAddMiningProvider\x1a\x36.stafihub.stafihub.mining.MsgAddMiningProviderResponse\x12x\n\x10RmMiningProvider\x12-.stafihub.stafihub.mining.MsgRmMiningProvider\x1a\x35.stafihub.stafihub.mining.MsgRmMiningProviderResponse\x12r\n\x0e\x41\x64\x64RewardToken\x12+.stafihub.stafihub.mining.MsgAddRewardToken\x1a\x33.stafihub.stafihub.mining.MsgAddRewardTokenResponse\x12\x8a\x01\n\x16SetMaxRewardPoolNumber\x12\x33.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumber\x1a;.stafihub.stafihub.mining.MsgSetMaxRewardPoolNumberResponse\x12x\n\x10UpdateRewardPool\x12-.stafihub.stafihub.mining.MsgUpdateRewardPool\x1a\x35.stafihub.stafihub.mining.MsgUpdateRewardPoolResponse\x12\x84\x01\n\x14ToggleProviderSwitch\x12\x31.stafihub.stafihub.mining.MsgToggleProviderSwitch\x1a\x39.stafihub.stafihub.mining.MsgToggleProviderSwitchResponse\x12\x87\x01\n\x15SetMaxStakeItemNumber\x12\x32.stafihub.stafihub.mining.MsgSetMaxStakeItemNumber\x1a:.stafihub.stafihub.mining.MsgSetMaxStakeItemNumberResponse\x12\x63\n\tAddReward\x12&.stafihub.stafihub.mining.MsgAddReward\x1a..stafihub.stafihub.mining.MsgAddRewardResponse\x12\x87\x01\n\x15ToggleEmergencySwitch\x12\x32.stafihub.stafihub.mining.MsgToggleEmergencySwitch\x1a:.stafihub.stafihub.mining.MsgToggleEmergencySwitchResponse\x12{\n\x11\x45mergencyWithdraw\x12..stafihub.stafihub.mining.MsgEmergencyWithdraw\x1a\x36.stafihub.stafihub.mining.MsgEmergencyWithdrawResponse\x12o\n\rAddStakeToken\x12*.stafihub.stafihub.mining.MsgAddStakeToken\x1a\x32.stafihub.stafihub.mining.MsgAddStakeTokenResponse\x12o\n\rRmRewardToken\x12*.stafihub.stafihub.mining.MsgRmRewardToken\x1a\x32.stafihub.stafihub.mining.MsgRmRewardTokenResponse\x12l\n\x0cRmStakeToken\x12).stafihub.stafihub.mining.MsgRmStakeToken\x1a\x31.stafihub.stafihub.mining.MsgRmStakeTokenResponse\x12{\n\x11SetStakeItemLimit\x12..stafihub.stafihub.mining.MsgSetStakeItemLimit\x1a\x36.stafihub.stafihub.mining.MsgSetStakeItemLimitResponse\x12\x81\x01\n\x13WithdrawRewardToken\x12\x30.stafihub.stafihub.mining.MsgWithdrawRewardToken\x1a\x38.stafihub.stafihub.mining.MsgWithdrawRewardTokenResponseB\xd4\x01\n\x1c\x63om.stafihub.stafihub.miningB\x07TxProtoZ+github.com/stafihub/stafihub/x/mining/types\xa2\x02\x03SSM\xaa\x02\x18Stafihub.Stafihub.Mining\xca\x02\x18Stafihub\\Stafihub\\Mining\xe2\x02$Stafihub\\Stafihub\\Mining\\GPBMetadata\xea\x02\x1aStafihub::Stafihub::Miningb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.mining.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.stafihub.stafihub.miningB\007TxProtoZ+github.com/stafihub/stafihub/x/mining/types\242\002\003SSM\252\002\030Stafihub.Stafihub.Mining\312\002\030Stafihub\\Stafihub\\Mining\342\002$Stafihub\\Stafihub\\Mining\\GPBMetadata\352\002\032Stafihub::Stafihub::Mining'
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['totalRewardAmount']._options = None
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['totalRewardAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['rewardPerSecond']._options = None
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['rewardPerSecond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['startTimestamp']._options = None
  _globals['_CREATEREWARDPOOLINFO'].fields_by_name['startTimestamp']._serialized_options = b'\352\336\037\016startTimestamp'
  _globals['_CREATESTAKEITEMINFO'].fields_by_name['lockSecond']._options = None
  _globals['_CREATESTAKEITEMINFO'].fields_by_name['lockSecond']._serialized_options = b'\352\336\037\nlockSecond'
  _globals['_CREATESTAKEITEMINFO'].fields_by_name['powerRewardRate']._options = None
  _globals['_CREATESTAKEITEMINFO'].fields_by_name['powerRewardRate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _globals['_MSGADDSTAKEITEM'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGADDSTAKEITEM'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGADDSTAKEITEM'].fields_by_name['lockSecond']._options = None
  _globals['_MSGADDSTAKEITEM'].fields_by_name['lockSecond']._serialized_options = b'\352\336\037\nlockSecond'
  _globals['_MSGADDSTAKEITEM'].fields_by_name['powerRewardRate']._options = None
  _globals['_MSGADDSTAKEITEM'].fields_by_name['powerRewardRate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _globals['_MSGADDREWARDPOOL'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGADDREWARDPOOL'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGADDREWARDPOOL'].fields_by_name['totalRewardAmount']._options = None
  _globals['_MSGADDREWARDPOOL'].fields_by_name['totalRewardAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGADDREWARDPOOL'].fields_by_name['rewardPerSecond']._options = None
  _globals['_MSGADDREWARDPOOL'].fields_by_name['rewardPerSecond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGADDREWARDPOOL'].fields_by_name['startTimestamp']._options = None
  _globals['_MSGADDREWARDPOOL'].fields_by_name['startTimestamp']._serialized_options = b'\352\336\037\016startTimestamp'
  _globals['_MSGSTAKE'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGSTAKE'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGSTAKE'].fields_by_name['stakeAmount']._options = None
  _globals['_MSGSTAKE'].fields_by_name['stakeAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGSTAKE'].fields_by_name['stakeItemIndex']._options = None
  _globals['_MSGSTAKE'].fields_by_name['stakeItemIndex']._serialized_options = b'\352\336\037\016stakeItemIndex'
  _globals['_MSGCLAIMREWARD'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGCLAIMREWARD'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGCLAIMREWARD'].fields_by_name['stakeRecordIndex']._options = None
  _globals['_MSGCLAIMREWARD'].fields_by_name['stakeRecordIndex']._serialized_options = b'\352\336\037\020stakeRecordIndex'
  _globals['_MSGWITHDRAW'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGWITHDRAW'].fields_by_name['stakeRecordIndex']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['stakeRecordIndex']._serialized_options = b'\352\336\037\020stakeRecordIndex'
  _globals['_MSGWITHDRAW'].fields_by_name['withdrawAmount']._options = None
  _globals['_MSGWITHDRAW'].fields_by_name['withdrawAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['index']._options = None
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['index']._serialized_options = b'\352\336\037\005index'
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['lockSecond']._options = None
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['lockSecond']._serialized_options = b'\352\336\037\nlockSecond'
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['powerRewardRate']._options = None
  _globals['_MSGUPDATESTAKEITEM'].fields_by_name['powerRewardRate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _globals['_MSGADDREWARDTOKEN'].fields_by_name['minTotalRewardAmount']._options = None
  _globals['_MSGADDREWARDTOKEN'].fields_by_name['minTotalRewardAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGADDREWARDTOKEN'].fields_by_name['minRewardPerSecond']._options = None
  _globals['_MSGADDREWARDTOKEN'].fields_by_name['minRewardPerSecond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGSETMAXREWARDPOOLNUMBER'].fields_by_name['number']._options = None
  _globals['_MSGSETMAXREWARDPOOLNUMBER'].fields_by_name['number']._serialized_options = b'\352\336\037\006number'
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['rewardPoolIndex']._options = None
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['rewardPoolIndex']._serialized_options = b'\352\336\037\017rewardPoolIndex'
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['rewardPerSecond']._options = None
  _globals['_MSGUPDATEREWARDPOOL'].fields_by_name['rewardPerSecond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGSETMAXSTAKEITEMNUMBER'].fields_by_name['number']._options = None
  _globals['_MSGSETMAXSTAKEITEMNUMBER'].fields_by_name['number']._serialized_options = b'\352\336\037\006number'
  _globals['_MSGADDREWARD'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGADDREWARD'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGADDREWARD'].fields_by_name['rewardPoolIndex']._options = None
  _globals['_MSGADDREWARD'].fields_by_name['rewardPoolIndex']._serialized_options = b'\352\336\037\017rewardPoolIndex'
  _globals['_MSGADDREWARD'].fields_by_name['addAmount']._options = None
  _globals['_MSGADDREWARD'].fields_by_name['addAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGADDREWARD'].fields_by_name['startTimestamp']._options = None
  _globals['_MSGADDREWARD'].fields_by_name['startTimestamp']._serialized_options = b'\352\336\037\016startTimestamp'
  _globals['_MSGADDREWARD'].fields_by_name['rewardPerSecond']._options = None
  _globals['_MSGADDREWARD'].fields_by_name['rewardPerSecond']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGTOGGLEEMERGENCYSWITCH'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGTOGGLEEMERGENCYSWITCH'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGEMERGENCYWITHDRAW'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGEMERGENCYWITHDRAW'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGEMERGENCYWITHDRAW'].fields_by_name['stakeRecordIndex']._options = None
  _globals['_MSGEMERGENCYWITHDRAW'].fields_by_name['stakeRecordIndex']._serialized_options = b'\352\336\037\020stakeRecordIndex'
  _globals['_MSGSETSTAKEITEMLIMIT'].fields_by_name['maxLockSecond']._options = None
  _globals['_MSGSETSTAKEITEMLIMIT'].fields_by_name['maxLockSecond']._serialized_options = b'\352\336\037\rmaxLockSecond'
  _globals['_MSGSETSTAKEITEMLIMIT'].fields_by_name['maxPowerRewardRate']._options = None
  _globals['_MSGSETSTAKEITEMLIMIT'].fields_by_name['maxPowerRewardRate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/stafihub/stafihub/utils.Dec'
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['stakePoolIndex']._options = None
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['stakePoolIndex']._serialized_options = b'\352\336\037\016stakePoolIndex'
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['rewardPoolIndex']._options = None
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['rewardPoolIndex']._serialized_options = b'\352\336\037\017rewardPoolIndex'
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['withdrawAmount']._options = None
  _globals['_MSGWITHDRAWREWARDTOKEN'].fields_by_name['withdrawAmount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_MSGADDSTAKEPOOL']._serialized_start=109
  _globals['_MSGADDSTAKEPOOL']._serialized_end=383
  _globals['_CREATEREWARDPOOLINFO']._serialized_start=386
  _globals['_CREATEREWARDPOOLINFO']._serialized_end=696
  _globals['_CREATESTAKEITEMINFO']._serialized_start=699
  _globals['_CREATESTAKEITEMINFO']._serialized_end=858
  _globals['_MSGADDSTAKEPOOLRESPONSE']._serialized_start=860
  _globals['_MSGADDSTAKEPOOLRESPONSE']._serialized_end=885
  _globals['_MSGADDSTAKEITEM']._serialized_start=888
  _globals['_MSGADDSTAKEITEM']._serialized_end=1153
  _globals['_MSGADDSTAKEITEMRESPONSE']._serialized_start=1155
  _globals['_MSGADDSTAKEITEMRESPONSE']._serialized_end=1180
  _globals['_MSGADDREWARDPOOL']._serialized_start=1183
  _globals['_MSGADDREWARDPOOL']._serialized_end=1575
  _globals['_MSGADDREWARDPOOLRESPONSE']._serialized_start=1577
  _globals['_MSGADDREWARDPOOLRESPONSE']._serialized_end=1603
  _globals['_MSGSTAKE']._serialized_start=1606
  _globals['_MSGSTAKE']._serialized_end=1844
  _globals['_MSGSTAKERESPONSE']._serialized_start=1846
  _globals['_MSGSTAKERESPONSE']._serialized_end=1864
  _globals['_MSGCLAIMREWARD']._serialized_start=1867
  _globals['_MSGCLAIMREWARD']._serialized_end=2035
  _globals['_MSGCLAIMREWARDRESPONSE']._serialized_start=2037
  _globals['_MSGCLAIMREWARDRESPONSE']._serialized_end=2061
  _globals['_MSGWITHDRAW']._serialized_start=2064
  _globals['_MSGWITHDRAW']._serialized_end=2317
  _globals['_MSGWITHDRAWRESPONSE']._serialized_start=2319
  _globals['_MSGWITHDRAWRESPONSE']._serialized_end=2340
  _globals['_MSGUPDATESTAKEITEM']._serialized_start=2343
  _globals['_MSGUPDATESTAKEITEM']._serialized_end=2644
  _globals['_MSGUPDATESTAKEITEMRESPONSE']._serialized_start=2646
  _globals['_MSGUPDATESTAKEITEMRESPONSE']._serialized_end=2674
  _globals['_MSGADDMININGPROVIDER']._serialized_start=2676
  _globals['_MSGADDMININGPROVIDER']._serialized_end=2758
  _globals['_MSGADDMININGPROVIDERRESPONSE']._serialized_start=2760
  _globals['_MSGADDMININGPROVIDERRESPONSE']._serialized_end=2790
  _globals['_MSGRMMININGPROVIDER']._serialized_start=2792
  _globals['_MSGRMMININGPROVIDER']._serialized_end=2873
  _globals['_MSGRMMININGPROVIDERRESPONSE']._serialized_start=2875
  _globals['_MSGRMMININGPROVIDERRESPONSE']._serialized_end=2904
  _globals['_MSGADDREWARDTOKEN']._serialized_start=2907
  _globals['_MSGADDREWARDTOKEN']._serialized_end=3170
  _globals['_MSGADDREWARDTOKENRESPONSE']._serialized_start=3172
  _globals['_MSGADDREWARDTOKENRESPONSE']._serialized_end=3199
  _globals['_MSGSETMAXREWARDPOOLNUMBER']._serialized_start=3201
  _globals['_MSGSETMAXREWARDPOOLNUMBER']._serialized_end=3290
  _globals['_MSGSETMAXREWARDPOOLNUMBERRESPONSE']._serialized_start=3292
  _globals['_MSGSETMAXREWARDPOOLNUMBERRESPONSE']._serialized_end=3327
  _globals['_MSGUPDATEREWARDPOOL']._serialized_start=3330
  _globals['_MSGUPDATEREWARDPOOL']._serialized_end=3590
  _globals['_MSGUPDATEREWARDPOOLRESPONSE']._serialized_start=3592
  _globals['_MSGUPDATEREWARDPOOLRESPONSE']._serialized_end=3621
  _globals['_MSGTOGGLEPROVIDERSWITCH']._serialized_start=3623
  _globals['_MSGTOGGLEPROVIDERSWITCH']._serialized_end=3674
  _globals['_MSGTOGGLEPROVIDERSWITCHRESPONSE']._serialized_start=3676
  _globals['_MSGTOGGLEPROVIDERSWITCHRESPONSE']._serialized_end=3709
  _globals['_MSGSETMAXSTAKEITEMNUMBER']._serialized_start=3711
  _globals['_MSGSETMAXSTAKEITEMNUMBER']._serialized_end=3799
  _globals['_MSGSETMAXSTAKEITEMNUMBERRESPONSE']._serialized_start=3801
  _globals['_MSGSETMAXSTAKEITEMNUMBERRESPONSE']._serialized_end=3835
  _globals['_MSGADDREWARD']._serialized_start=3838
  _globals['_MSGADDREWARD']._serialized_end=4229
  _globals['_MSGADDREWARDRESPONSE']._serialized_start=4231
  _globals['_MSGADDREWARDRESPONSE']._serialized_end=4253
  _globals['_MSGTOGGLEEMERGENCYSWITCH']._serialized_start=4255
  _globals['_MSGTOGGLEEMERGENCYSWITCH']._serialized_end=4367
  _globals['_MSGTOGGLEEMERGENCYSWITCHRESPONSE']._serialized_start=4369
  _globals['_MSGTOGGLEEMERGENCYSWITCHRESPONSE']._serialized_end=4403
  _globals['_MSGEMERGENCYWITHDRAW']._serialized_start=4406
  _globals['_MSGEMERGENCYWITHDRAW']._serialized_end=4580
  _globals['_MSGEMERGENCYWITHDRAWRESPONSE']._serialized_start=4582
  _globals['_MSGEMERGENCYWITHDRAWRESPONSE']._serialized_end=4612
  _globals['_MSGADDSTAKETOKEN']._serialized_start=4614
  _globals['_MSGADDSTAKETOKEN']._serialized_end=4680
  _globals['_MSGADDSTAKETOKENRESPONSE']._serialized_start=4682
  _globals['_MSGADDSTAKETOKENRESPONSE']._serialized_end=4708
  _globals['_MSGRMREWARDTOKEN']._serialized_start=4710
  _globals['_MSGRMREWARDTOKEN']._serialized_end=4776
  _globals['_MSGRMREWARDTOKENRESPONSE']._serialized_start=4778
  _globals['_MSGRMREWARDTOKENRESPONSE']._serialized_end=4804
  _globals['_MSGRMSTAKETOKEN']._serialized_start=4806
  _globals['_MSGRMSTAKETOKEN']._serialized_end=4871
  _globals['_MSGRMSTAKETOKENRESPONSE']._serialized_start=4873
  _globals['_MSGRMSTAKETOKENRESPONSE']._serialized_end=4898
  _globals['_MSGSETSTAKEITEMLIMIT']._serialized_start=4901
  _globals['_MSGSETSTAKEITEMLIMIT']._serialized_end=5102
  _globals['_MSGSETSTAKEITEMLIMITRESPONSE']._serialized_start=5104
  _globals['_MSGSETSTAKEITEMLIMITRESPONSE']._serialized_end=5134
  _globals['_MSGWITHDRAWREWARDTOKEN']._serialized_start=5137
  _globals['_MSGWITHDRAWREWARDTOKEN']._serialized_end=5398
  _globals['_MSGWITHDRAWREWARDTOKENRESPONSE']._serialized_start=5400
  _globals['_MSGWITHDRAWREWARDTOKENRESPONSE']._serialized_end=5432
  _globals['_MSG']._serialized_start=5435
  _globals['_MSG']._serialized_end=8042
# @@protoc_insertion_point(module_scope)
