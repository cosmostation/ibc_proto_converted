# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: pstake/liquidstakeibc/v1beta1/liquidstakeibc.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2pstake/liquidstakeibc/v1beta1/liquidstakeibc.proto\x12\x1dpstake.liquidstakeibc.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x95\x06\n\tHostChain\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12H\n\x06params\x18\x03 \x01(\x0b\x32\x30.pstake.liquidstakeibc.v1beta1.HostChainLSParamsR\x06params\x12\x1d\n\nhost_denom\x18\x04 \x01(\tR\thostDenom\x12\x1d\n\nchannel_id\x18\x05 \x01(\tR\tchannelId\x12\x17\n\x07port_id\x18\x06 \x01(\tR\x06portId\x12X\n\x12\x64\x65legation_account\x18\x07 \x01(\x0b\x32).pstake.liquidstakeibc.v1beta1.ICAAccountR\x11\x64\x65legationAccount\x12R\n\x0frewards_account\x18\x08 \x01(\x0b\x32).pstake.liquidstakeibc.v1beta1.ICAAccountR\x0erewardsAccount\x12H\n\nvalidators\x18\t \x03(\x0b\x32(.pstake.liquidstakeibc.v1beta1.ValidatorR\nvalidators\x12\x65\n\x0fminimum_deposit\x18\x0b \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0eminimumDeposit\x12U\n\x07\x63_value\x18\x0c \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x06\x63Value\x12(\n\x10next_valset_hash\x18\r \x01(\x0cR\x0enextValsetHash\x12)\n\x10unbonding_factor\x18\x0e \x01(\x03R\x0funbondingFactor\x12\x16\n\x06\x61\x63tive\x18\x0f \x01(\x08R\x06\x61\x63tive:\x04\x98\xa0\x1f\x01\"\x95\x03\n\x11HostChainLSParams\x12]\n\x0b\x64\x65posit_fee\x18\x01 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\ndepositFee\x12]\n\x0brestake_fee\x18\x02 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\nrestakeFee\x12]\n\x0bunstake_fee\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\nunstakeFee\x12\x63\n\x0eredemption_fee\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\rredemptionFee\"\xdc\x02\n\nICAAccount\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x64\n\x07\x62\x61lance\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x07\x62\x61lance\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\x12[\n\rchannel_state\x18\x04 \x01(\x0e\x32\x36.pstake.liquidstakeibc.v1beta1.ICAAccount.ChannelStateR\x0c\x63hannelState\"A\n\x0c\x43hannelState\x12\x18\n\x14ICA_CHANNEL_CREATING\x10\x00\x12\x17\n\x13ICA_CHANNEL_CREATED\x10\x01\"\xb1\x03\n\tValidator\x12\x43\n\x10operator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0foperatorAddress\x12\x16\n\x06status\x18\x02 \x01(\tR\x06status\x12T\n\x06weight\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x06weight\x12g\n\x10\x64\x65legated_amount\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0f\x64\x65legatedAmount\x12_\n\x0ctotal_amount\x18\x05 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0btotalAmount\x12\'\n\x0funbonding_epoch\x18\x06 \x01(\x03R\x0eunbondingEpoch\"\x89\x03\n\x07\x44\x65posit\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12R\n\x05\x65poch\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x05\x65poch\x12I\n\x05state\x18\x04 \x01(\x0e\x32\x33.pstake.liquidstakeibc.v1beta1.Deposit.DepositStateR\x05state\x12&\n\x0fibc_sequence_id\x18\x05 \x01(\tR\ribcSequenceId\"c\n\x0c\x44\x65positState\x12\x13\n\x0f\x44\x45POSIT_PENDING\x10\x00\x12\x10\n\x0c\x44\x45POSIT_SENT\x10\x01\x12\x14\n\x10\x44\x45POSIT_RECEIVED\x10\x02\x12\x16\n\x12\x44\x45POSIT_DELEGATING\x10\x03\"\xb0\x04\n\tUnbonding\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12!\n\x0c\x65poch_number\x18\x02 \x01(\x03R\x0b\x65pochNumber\x12\x45\n\x0bmature_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nmatureTime\x12@\n\x0b\x62urn_amount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\nburnAmount\x12\x44\n\runbond_amount\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0cunbondAmount\x12&\n\x0fibc_sequence_id\x18\x06 \x01(\tR\ribcSequenceId\x12M\n\x05state\x18\x07 \x01(\x0e\x32\x37.pstake.liquidstakeibc.v1beta1.Unbonding.UnbondingStateR\x05state\"\x9e\x01\n\x0eUnbondingState\x12\x15\n\x11UNBONDING_PENDING\x10\x00\x12\x17\n\x13UNBONDING_INITIATED\x10\x01\x12\x16\n\x12UNBONDING_MATURING\x10\x02\x12\x15\n\x11UNBONDING_MATURED\x10\x03\x12\x17\n\x13UNBONDING_CLAIMABLE\x10\x04\x12\x14\n\x10UNBONDING_FAILED\x10\x05\"\x87\x02\n\rUserUnbonding\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12!\n\x0c\x65poch_number\x18\x02 \x01(\x03R\x0b\x65pochNumber\x12\x32\n\x07\x61\x64\x64ress\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12>\n\nstk_amount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tstkAmount\x12\x44\n\runbond_amount\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0cunbondAmount\"\xc1\x02\n\x12ValidatorUnbonding\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12!\n\x0c\x65poch_number\x18\x02 \x01(\x03R\x0b\x65pochNumber\x12\x45\n\x0bmature_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nmatureTime\x12\x45\n\x11validator_address\x18\x04 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12\x37\n\x06\x61mount\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12&\n\x0fibc_sequence_id\x18\x06 \x01(\tR\ribcSequenceId\"2\n\x08KVUpdate\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05valueB\x91\x02\n!com.pstake.liquidstakeibc.v1beta1B\x13LiquidstakeibcProtoP\x01ZAgithub.com/persistenceOne/pstake-native/v2/x/liquidstakeibc/types\xa2\x02\x03PLX\xaa\x02\x1dPstake.Liquidstakeibc.V1beta1\xca\x02\x1dPstake\\Liquidstakeibc\\V1beta1\xe2\x02)Pstake\\Liquidstakeibc\\V1beta1\\GPBMetadata\xea\x02\x1fPstake::Liquidstakeibc::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'pstake.liquidstakeibc.v1beta1.liquidstakeibc_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.pstake.liquidstakeibc.v1beta1B\023LiquidstakeibcProtoP\001ZAgithub.com/persistenceOne/pstake-native/v2/x/liquidstakeibc/types\242\002\003PLX\252\002\035Pstake.Liquidstakeibc.V1beta1\312\002\035Pstake\\Liquidstakeibc\\V1beta1\342\002)Pstake\\Liquidstakeibc\\V1beta1\\GPBMetadata\352\002\037Pstake::Liquidstakeibc::V1beta1'
  _HOSTCHAIN.fields_by_name['minimum_deposit']._options = None
  _HOSTCHAIN.fields_by_name['minimum_deposit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _HOSTCHAIN.fields_by_name['c_value']._options = None
  _HOSTCHAIN.fields_by_name['c_value']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTCHAIN._options = None
  _HOSTCHAIN._serialized_options = b'\230\240\037\001'
  _HOSTCHAINLSPARAMS.fields_by_name['deposit_fee']._options = None
  _HOSTCHAINLSPARAMS.fields_by_name['deposit_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTCHAINLSPARAMS.fields_by_name['restake_fee']._options = None
  _HOSTCHAINLSPARAMS.fields_by_name['restake_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTCHAINLSPARAMS.fields_by_name['unstake_fee']._options = None
  _HOSTCHAINLSPARAMS.fields_by_name['unstake_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _HOSTCHAINLSPARAMS.fields_by_name['redemption_fee']._options = None
  _HOSTCHAINLSPARAMS.fields_by_name['redemption_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _ICAACCOUNT.fields_by_name['address']._options = None
  _ICAACCOUNT.fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _ICAACCOUNT.fields_by_name['balance']._options = None
  _ICAACCOUNT.fields_by_name['balance']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _VALIDATOR.fields_by_name['operator_address']._options = None
  _VALIDATOR.fields_by_name['operator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _VALIDATOR.fields_by_name['weight']._options = None
  _VALIDATOR.fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _VALIDATOR.fields_by_name['delegated_amount']._options = None
  _VALIDATOR.fields_by_name['delegated_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _VALIDATOR.fields_by_name['total_amount']._options = None
  _VALIDATOR.fields_by_name['total_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _DEPOSIT.fields_by_name['amount']._options = None
  _DEPOSIT.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _DEPOSIT.fields_by_name['epoch']._options = None
  _DEPOSIT.fields_by_name['epoch']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _UNBONDING.fields_by_name['mature_time']._options = None
  _UNBONDING.fields_by_name['mature_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _UNBONDING.fields_by_name['burn_amount']._options = None
  _UNBONDING.fields_by_name['burn_amount']._serialized_options = b'\310\336\037\000'
  _UNBONDING.fields_by_name['unbond_amount']._options = None
  _UNBONDING.fields_by_name['unbond_amount']._serialized_options = b'\310\336\037\000'
  _USERUNBONDING.fields_by_name['address']._options = None
  _USERUNBONDING.fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _USERUNBONDING.fields_by_name['stk_amount']._options = None
  _USERUNBONDING.fields_by_name['stk_amount']._serialized_options = b'\310\336\037\000'
  _USERUNBONDING.fields_by_name['unbond_amount']._options = None
  _USERUNBONDING.fields_by_name['unbond_amount']._serialized_options = b'\310\336\037\000'
  _VALIDATORUNBONDING.fields_by_name['mature_time']._options = None
  _VALIDATORUNBONDING.fields_by_name['mature_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _VALIDATORUNBONDING.fields_by_name['validator_address']._options = None
  _VALIDATORUNBONDING.fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _VALIDATORUNBONDING.fields_by_name['amount']._options = None
  _VALIDATORUNBONDING.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_HOSTCHAIN']._serialized_start=200
  _globals['_HOSTCHAIN']._serialized_end=989
  _globals['_HOSTCHAINLSPARAMS']._serialized_start=992
  _globals['_HOSTCHAINLSPARAMS']._serialized_end=1397
  _globals['_ICAACCOUNT']._serialized_start=1400
  _globals['_ICAACCOUNT']._serialized_end=1748
  _globals['_ICAACCOUNT_CHANNELSTATE']._serialized_start=1683
  _globals['_ICAACCOUNT_CHANNELSTATE']._serialized_end=1748
  _globals['_VALIDATOR']._serialized_start=1751
  _globals['_VALIDATOR']._serialized_end=2184
  _globals['_DEPOSIT']._serialized_start=2187
  _globals['_DEPOSIT']._serialized_end=2580
  _globals['_DEPOSIT_DEPOSITSTATE']._serialized_start=2481
  _globals['_DEPOSIT_DEPOSITSTATE']._serialized_end=2580
  _globals['_UNBONDING']._serialized_start=2583
  _globals['_UNBONDING']._serialized_end=3143
  _globals['_UNBONDING_UNBONDINGSTATE']._serialized_start=2985
  _globals['_UNBONDING_UNBONDINGSTATE']._serialized_end=3143
  _globals['_USERUNBONDING']._serialized_start=3146
  _globals['_USERUNBONDING']._serialized_end=3409
  _globals['_VALIDATORUNBONDING']._serialized_start=3412
  _globals['_VALIDATORUNBONDING']._serialized_end=3733
  _globals['_KVUPDATE']._serialized_start=3735
  _globals['_KVUPDATE']._serialized_end=3785
# @@protoc_insertion_point(module_scope)