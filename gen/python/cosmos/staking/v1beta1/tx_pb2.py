# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/staking/v1beta1/tx.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.staking.v1beta1 import staking_pb2 as cosmos_dot_staking_dot_v1beta1_dot_staking__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63osmos/staking/v1beta1/tx.proto\x12\x16\x63osmos.staking.v1beta1\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a$cosmos/staking/v1beta1/staking.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x11\x61mino/amino.proto\"\x94\x05\n\x12MsgCreateValidator\x12P\n\x0b\x64\x65scription\x18\x01 \x01(\x0b\x32#.cosmos.staking.v1beta1.DescriptionB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x0b\x64\x65scription\x12R\n\ncommission\x18\x02 \x01(\x0b\x32\'.cosmos.staking.v1beta1.CommissionRatesB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\ncommission\x12n\n\x13min_self_delegation\x18\x03 \x01(\tB>\x18\x01\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x11minSelfDelegation\x12\x45\n\x11\x64\x65legator_address\x18\x04 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x45\n\x11validator_address\x18\x05 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12\x46\n\x06pubkey\x18\x06 \x01(\x0b\x32\x14.google.protobuf.AnyB\x18\xca\xb4-\x14\x63osmos.crypto.PubKeyR\x06pubkey\x12:\n\x05value\x18\x07 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x05value:V\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x82\xe7\xb0*\x11validator_address\x8a\xe7\xb0*\x1d\x63osmos-sdk/MsgCreateValidator\"\x1c\n\x1aMsgCreateValidatorResponse\"\xbe\x03\n\x10MsgEditValidator\x12P\n\x0b\x64\x65scription\x18\x01 \x01(\x0b\x32#.cosmos.staking.v1beta1.DescriptionB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x0b\x64\x65scription\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12\x61\n\x0f\x63ommission_rate\x18\x03 \x01(\tB8\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0e\x63ommissionRate\x12n\n\x13min_self_delegation\x18\x04 \x01(\tB>\x18\x01\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x11minSelfDelegation:>\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11validator_address\x8a\xe7\xb0*\x1b\x63osmos-sdk/MsgEditValidator\"\x1a\n\x18MsgEditValidatorResponse\"\x94\x02\n\x0bMsgDelegate\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12<\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06\x61mount:9\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\x16\x63osmos-sdk/MsgDelegate\"\x15\n\x13MsgDelegateResponse\"\xf7\x02\n\x12MsgBeginRedelegate\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12L\n\x15validator_src_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x13validatorSrcAddress\x12L\n\x15validator_dst_address\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x13validatorDstAddress\x12<\n\x06\x61mount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06\x61mount:@\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\x1d\x63osmos-sdk/MsgBeginRedelegate\"p\n\x1aMsgBeginRedelegateResponse\x12R\n\x0f\x63ompletion_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\r\xc8\xde\x1f\x00\x90\xdf\x1f\x01\xa8\xe7\xb0*\x01R\x0e\x63ompletionTime\"\x98\x02\n\rMsgUndelegate\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12<\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06\x61mount:;\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\x18\x63osmos-sdk/MsgUndelegate\"k\n\x15MsgUndelegateResponse\x12R\n\x0f\x63ompletion_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\r\xc8\xde\x1f\x00\x90\xdf\x1f\x01\xa8\xe7\xb0*\x01R\x0e\x63ompletionTime\"\xdf\x02\n\x1cMsgCancelUnbondingDelegation\x12\x45\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10\x64\x65legatorAddress\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12<\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06\x61mount\x12\'\n\x0f\x63reation_height\x18\x04 \x01(\x03R\x0e\x63reationHeight:J\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\'cosmos-sdk/MsgCancelUnbondingDelegation\"&\n$MsgCancelUnbondingDelegationResponse\"\xc5\x01\n\x0fMsgUpdateParams\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x41\n\x06params\x18\x02 \x01(\x0b\x32\x1e.cosmos.staking.v1beta1.ParamsB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06params:7\x82\xe7\xb0*\tauthority\x8a\xe7\xb0*$cosmos-sdk/x/staking/MsgUpdateParams\"\x19\n\x17MsgUpdateParamsResponse\"\x8f\x01\n\x12MsgUnbondValidator\x12?\n\x11validator_address\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x10validatorAddress:8\x82\xe7\xb0*\x11validator_address\x8a\xe7\xb0*\x1d\x63osmos-sdk/MsgUnbondValidator\"\x1c\n\x1aMsgUnbondValidatorResponse\"\xd7\x02\n\x11MsgTokenizeShares\x12I\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"delegator_address\"R\x10\x64\x65legatorAddress\x12I\n\x11validator_address\x18\x02 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"validator_address\"R\x10validatorAddress\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x32\n\x15tokenized_share_owner\x18\x04 \x01(\tR\x13tokenizedShareOwner:?\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\x1c\x63osmos-sdk/MsgTokenizeShares\"T\n\x19MsgTokenizeSharesResponse\x12\x37\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\xe6\x01\n\x18MsgRedeemTokensForShares\x12I\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"delegator_address\"R\x10\x64\x65legatorAddress\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount:F\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*#cosmos-sdk/MsgRedeemTokensForShares\"[\n MsgRedeemTokensForSharesResponse\x12\x37\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\xd1\x01\n\x1eMsgTransferTokenizeShareRecord\x12\x37\n\x18tokenize_share_record_id\x18\x01 \x01(\x04R\x15tokenizeShareRecordId\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12\x1b\n\tnew_owner\x18\x03 \x01(\tR\x08newOwner:A\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06sender\x8a\xe7\xb0*)cosmos-sdk/MsgTransferTokenizeShareRecord\"(\n&MsgTransferTokenizeShareRecordResponse\"\xad\x01\n\x18MsgDisableTokenizeShares\x12I\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"delegator_address\"R\x10\x64\x65legatorAddress:F\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*#cosmos-sdk/MsgDisableTokenizeShares\"\"\n MsgDisableTokenizeSharesResponse\"\xab\x01\n\x17MsgEnableTokenizeShares\x12I\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"delegator_address\"R\x10\x64\x65legatorAddress:E\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\"cosmos-sdk/MsgEnableTokenizeShares\"p\n\x1fMsgEnableTokenizeSharesResponse\x12M\n\x0f\x63ompletion_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x0e\x63ompletionTime\"\xe8\x01\n\x10MsgValidatorBond\x12I\n\x11\x64\x65legator_address\x18\x01 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"delegator_address\"R\x10\x64\x65legatorAddress\x12I\n\x11validator_address\x18\x02 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"validator_address\"R\x10validatorAddress:>\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x11\x64\x65legator_address\x8a\xe7\xb0*\x1b\x63osmos-sdk/MsgValidatorBond\"\x1a\n\x18MsgValidatorBondResponse2\x94\r\n\x03Msg\x12q\n\x0f\x43reateValidator\x12*.cosmos.staking.v1beta1.MsgCreateValidator\x1a\x32.cosmos.staking.v1beta1.MsgCreateValidatorResponse\x12k\n\rEditValidator\x12(.cosmos.staking.v1beta1.MsgEditValidator\x1a\x30.cosmos.staking.v1beta1.MsgEditValidatorResponse\x12\\\n\x08\x44\x65legate\x12#.cosmos.staking.v1beta1.MsgDelegate\x1a+.cosmos.staking.v1beta1.MsgDelegateResponse\x12q\n\x0f\x42\x65ginRedelegate\x12*.cosmos.staking.v1beta1.MsgBeginRedelegate\x1a\x32.cosmos.staking.v1beta1.MsgBeginRedelegateResponse\x12\x62\n\nUndelegate\x12%.cosmos.staking.v1beta1.MsgUndelegate\x1a-.cosmos.staking.v1beta1.MsgUndelegateResponse\x12\x8f\x01\n\x19\x43\x61ncelUnbondingDelegation\x12\x34.cosmos.staking.v1beta1.MsgCancelUnbondingDelegation\x1a<.cosmos.staking.v1beta1.MsgCancelUnbondingDelegationResponse\x12h\n\x0cUpdateParams\x12\'.cosmos.staking.v1beta1.MsgUpdateParams\x1a/.cosmos.staking.v1beta1.MsgUpdateParamsResponse\x12q\n\x0fUnbondValidator\x12*.cosmos.staking.v1beta1.MsgUnbondValidator\x1a\x32.cosmos.staking.v1beta1.MsgUnbondValidatorResponse\x12n\n\x0eTokenizeShares\x12).cosmos.staking.v1beta1.MsgTokenizeShares\x1a\x31.cosmos.staking.v1beta1.MsgTokenizeSharesResponse\x12\x83\x01\n\x15RedeemTokensForShares\x12\x30.cosmos.staking.v1beta1.MsgRedeemTokensForShares\x1a\x38.cosmos.staking.v1beta1.MsgRedeemTokensForSharesResponse\x12\x95\x01\n\x1bTransferTokenizeShareRecord\x12\x36.cosmos.staking.v1beta1.MsgTransferTokenizeShareRecord\x1a>.cosmos.staking.v1beta1.MsgTransferTokenizeShareRecordResponse\x12\x83\x01\n\x15\x44isableTokenizeShares\x12\x30.cosmos.staking.v1beta1.MsgDisableTokenizeShares\x1a\x38.cosmos.staking.v1beta1.MsgDisableTokenizeSharesResponse\x12\x80\x01\n\x14\x45nableTokenizeShares\x12/.cosmos.staking.v1beta1.MsgEnableTokenizeShares\x1a\x37.cosmos.staking.v1beta1.MsgEnableTokenizeSharesResponse\x12k\n\rValidatorBond\x12(.cosmos.staking.v1beta1.MsgValidatorBond\x1a\x30.cosmos.staking.v1beta1.MsgValidatorBondResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xcb\x01\n\x1a\x63om.cosmos.staking.v1beta1B\x07TxProtoZ,github.com/cosmos/cosmos-sdk/x/staking/types\xa2\x02\x03\x43SX\xaa\x02\x16\x43osmos.Staking.V1beta1\xca\x02\x16\x43osmos\\Staking\\V1beta1\xe2\x02\"Cosmos\\Staking\\V1beta1\\GPBMetadata\xea\x02\x18\x43osmos::Staking::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.staking.v1beta1.tx_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.cosmos.staking.v1beta1B\007TxProtoZ,github.com/cosmos/cosmos-sdk/x/staking/types\242\002\003CSX\252\002\026Cosmos.Staking.V1beta1\312\002\026Cosmos\\Staking\\V1beta1\342\002\"Cosmos\\Staking\\V1beta1\\GPBMetadata\352\002\030Cosmos::Staking::V1beta1'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['description']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['description']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['commission']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['commission']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['min_self_delegation']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['min_self_delegation']._serialized_options = b'\030\001\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['pubkey']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['pubkey']._serialized_options = b'\312\264-\024cosmos.crypto.PubKey'
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['value']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR'].fields_by_name['value']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGCREATEVALIDATOR']._loaded_options = None
  _globals['_MSGCREATEVALIDATOR']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\202\347\260*\021validator_address\212\347\260*\035cosmos-sdk/MsgCreateValidator'
  _globals['_MSGEDITVALIDATOR'].fields_by_name['description']._loaded_options = None
  _globals['_MSGEDITVALIDATOR'].fields_by_name['description']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGEDITVALIDATOR'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGEDITVALIDATOR'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGEDITVALIDATOR'].fields_by_name['commission_rate']._loaded_options = None
  _globals['_MSGEDITVALIDATOR'].fields_by_name['commission_rate']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _globals['_MSGEDITVALIDATOR'].fields_by_name['min_self_delegation']._loaded_options = None
  _globals['_MSGEDITVALIDATOR'].fields_by_name['min_self_delegation']._serialized_options = b'\030\001\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _globals['_MSGEDITVALIDATOR']._loaded_options = None
  _globals['_MSGEDITVALIDATOR']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021validator_address\212\347\260*\033cosmos-sdk/MsgEditValidator'
  _globals['_MSGDELEGATE'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGDELEGATE'].fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGDELEGATE'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGDELEGATE'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGDELEGATE'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGDELEGATE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGDELEGATE']._loaded_options = None
  _globals['_MSGDELEGATE']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\026cosmos-sdk/MsgDelegate'
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['validator_src_address']._loaded_options = None
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['validator_src_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['validator_dst_address']._loaded_options = None
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['validator_dst_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGBEGINREDELEGATE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGBEGINREDELEGATE']._loaded_options = None
  _globals['_MSGBEGINREDELEGATE']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\035cosmos-sdk/MsgBeginRedelegate'
  _globals['_MSGBEGINREDELEGATERESPONSE'].fields_by_name['completion_time']._loaded_options = None
  _globals['_MSGBEGINREDELEGATERESPONSE'].fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\220\337\037\001\250\347\260*\001'
  _globals['_MSGUNDELEGATE'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGUNDELEGATE'].fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGUNDELEGATE'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGUNDELEGATE'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGUNDELEGATE'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGUNDELEGATE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGUNDELEGATE']._loaded_options = None
  _globals['_MSGUNDELEGATE']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\030cosmos-sdk/MsgUndelegate'
  _globals['_MSGUNDELEGATERESPONSE'].fields_by_name['completion_time']._loaded_options = None
  _globals['_MSGUNDELEGATERESPONSE'].fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\220\337\037\001\250\347\260*\001'
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['delegator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGCANCELUNBONDINGDELEGATION'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGCANCELUNBONDINGDELEGATION']._loaded_options = None
  _globals['_MSGCANCELUNBONDINGDELEGATION']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\'cosmos-sdk/MsgCancelUnbondingDelegation'
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._loaded_options = None
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGUPDATEPARAMS'].fields_by_name['params']._loaded_options = None
  _globals['_MSGUPDATEPARAMS'].fields_by_name['params']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_MSGUPDATEPARAMS']._loaded_options = None
  _globals['_MSGUPDATEPARAMS']._serialized_options = b'\202\347\260*\tauthority\212\347\260*$cosmos-sdk/x/staking/MsgUpdateParams'
  _globals['_MSGUNBONDVALIDATOR'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGUNBONDVALIDATOR'].fields_by_name['validator_address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_MSGUNBONDVALIDATOR']._loaded_options = None
  _globals['_MSGUNBONDVALIDATOR']._serialized_options = b'\202\347\260*\021validator_address\212\347\260*\035cosmos-sdk/MsgUnbondValidator'
  _globals['_MSGTOKENIZESHARES'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGTOKENIZESHARES'].fields_by_name['delegator_address']._serialized_options = b'\362\336\037\030yaml:\"delegator_address\"'
  _globals['_MSGTOKENIZESHARES'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGTOKENIZESHARES'].fields_by_name['validator_address']._serialized_options = b'\362\336\037\030yaml:\"validator_address\"'
  _globals['_MSGTOKENIZESHARES'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGTOKENIZESHARES'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGTOKENIZESHARES']._loaded_options = None
  _globals['_MSGTOKENIZESHARES']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\034cosmos-sdk/MsgTokenizeShares'
  _globals['_MSGTOKENIZESHARESRESPONSE'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGTOKENIZESHARESRESPONSE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGREDEEMTOKENSFORSHARES'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGREDEEMTOKENSFORSHARES'].fields_by_name['delegator_address']._serialized_options = b'\362\336\037\030yaml:\"delegator_address\"'
  _globals['_MSGREDEEMTOKENSFORSHARES'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGREDEEMTOKENSFORSHARES'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGREDEEMTOKENSFORSHARES']._loaded_options = None
  _globals['_MSGREDEEMTOKENSFORSHARES']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*#cosmos-sdk/MsgRedeemTokensForShares'
  _globals['_MSGREDEEMTOKENSFORSHARESRESPONSE'].fields_by_name['amount']._loaded_options = None
  _globals['_MSGREDEEMTOKENSFORSHARESRESPONSE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGTRANSFERTOKENIZESHARERECORD']._loaded_options = None
  _globals['_MSGTRANSFERTOKENIZESHARERECORD']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006sender\212\347\260*)cosmos-sdk/MsgTransferTokenizeShareRecord'
  _globals['_MSGDISABLETOKENIZESHARES'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGDISABLETOKENIZESHARES'].fields_by_name['delegator_address']._serialized_options = b'\362\336\037\030yaml:\"delegator_address\"'
  _globals['_MSGDISABLETOKENIZESHARES']._loaded_options = None
  _globals['_MSGDISABLETOKENIZESHARES']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*#cosmos-sdk/MsgDisableTokenizeShares'
  _globals['_MSGENABLETOKENIZESHARES'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGENABLETOKENIZESHARES'].fields_by_name['delegator_address']._serialized_options = b'\362\336\037\030yaml:\"delegator_address\"'
  _globals['_MSGENABLETOKENIZESHARES']._loaded_options = None
  _globals['_MSGENABLETOKENIZESHARES']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\"cosmos-sdk/MsgEnableTokenizeShares'
  _globals['_MSGENABLETOKENIZESHARESRESPONSE'].fields_by_name['completion_time']._loaded_options = None
  _globals['_MSGENABLETOKENIZESHARESRESPONSE'].fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_MSGVALIDATORBOND'].fields_by_name['delegator_address']._loaded_options = None
  _globals['_MSGVALIDATORBOND'].fields_by_name['delegator_address']._serialized_options = b'\362\336\037\030yaml:\"delegator_address\"'
  _globals['_MSGVALIDATORBOND'].fields_by_name['validator_address']._loaded_options = None
  _globals['_MSGVALIDATORBOND'].fields_by_name['validator_address']._serialized_options = b'\362\336\037\030yaml:\"validator_address\"'
  _globals['_MSGVALIDATORBOND']._loaded_options = None
  _globals['_MSGVALIDATORBOND']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\021delegator_address\212\347\260*\033cosmos-sdk/MsgValidatorBond'
  _globals['_MSG']._loaded_options = None
  _globals['_MSG']._serialized_options = b'\200\347\260*\001'
  _globals['_MSGCREATEVALIDATOR']._serialized_start=283
  _globals['_MSGCREATEVALIDATOR']._serialized_end=943
  _globals['_MSGCREATEVALIDATORRESPONSE']._serialized_start=945
  _globals['_MSGCREATEVALIDATORRESPONSE']._serialized_end=973
  _globals['_MSGEDITVALIDATOR']._serialized_start=976
  _globals['_MSGEDITVALIDATOR']._serialized_end=1422
  _globals['_MSGEDITVALIDATORRESPONSE']._serialized_start=1424
  _globals['_MSGEDITVALIDATORRESPONSE']._serialized_end=1450
  _globals['_MSGDELEGATE']._serialized_start=1453
  _globals['_MSGDELEGATE']._serialized_end=1729
  _globals['_MSGDELEGATERESPONSE']._serialized_start=1731
  _globals['_MSGDELEGATERESPONSE']._serialized_end=1752
  _globals['_MSGBEGINREDELEGATE']._serialized_start=1755
  _globals['_MSGBEGINREDELEGATE']._serialized_end=2130
  _globals['_MSGBEGINREDELEGATERESPONSE']._serialized_start=2132
  _globals['_MSGBEGINREDELEGATERESPONSE']._serialized_end=2244
  _globals['_MSGUNDELEGATE']._serialized_start=2247
  _globals['_MSGUNDELEGATE']._serialized_end=2527
  _globals['_MSGUNDELEGATERESPONSE']._serialized_start=2529
  _globals['_MSGUNDELEGATERESPONSE']._serialized_end=2636
  _globals['_MSGCANCELUNBONDINGDELEGATION']._serialized_start=2639
  _globals['_MSGCANCELUNBONDINGDELEGATION']._serialized_end=2990
  _globals['_MSGCANCELUNBONDINGDELEGATIONRESPONSE']._serialized_start=2992
  _globals['_MSGCANCELUNBONDINGDELEGATIONRESPONSE']._serialized_end=3030
  _globals['_MSGUPDATEPARAMS']._serialized_start=3033
  _globals['_MSGUPDATEPARAMS']._serialized_end=3230
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=3232
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=3257
  _globals['_MSGUNBONDVALIDATOR']._serialized_start=3260
  _globals['_MSGUNBONDVALIDATOR']._serialized_end=3403
  _globals['_MSGUNBONDVALIDATORRESPONSE']._serialized_start=3405
  _globals['_MSGUNBONDVALIDATORRESPONSE']._serialized_end=3433
  _globals['_MSGTOKENIZESHARES']._serialized_start=3436
  _globals['_MSGTOKENIZESHARES']._serialized_end=3779
  _globals['_MSGTOKENIZESHARESRESPONSE']._serialized_start=3781
  _globals['_MSGTOKENIZESHARESRESPONSE']._serialized_end=3865
  _globals['_MSGREDEEMTOKENSFORSHARES']._serialized_start=3868
  _globals['_MSGREDEEMTOKENSFORSHARES']._serialized_end=4098
  _globals['_MSGREDEEMTOKENSFORSHARESRESPONSE']._serialized_start=4100
  _globals['_MSGREDEEMTOKENSFORSHARESRESPONSE']._serialized_end=4191
  _globals['_MSGTRANSFERTOKENIZESHARERECORD']._serialized_start=4194
  _globals['_MSGTRANSFERTOKENIZESHARERECORD']._serialized_end=4403
  _globals['_MSGTRANSFERTOKENIZESHARERECORDRESPONSE']._serialized_start=4405
  _globals['_MSGTRANSFERTOKENIZESHARERECORDRESPONSE']._serialized_end=4445
  _globals['_MSGDISABLETOKENIZESHARES']._serialized_start=4448
  _globals['_MSGDISABLETOKENIZESHARES']._serialized_end=4621
  _globals['_MSGDISABLETOKENIZESHARESRESPONSE']._serialized_start=4623
  _globals['_MSGDISABLETOKENIZESHARESRESPONSE']._serialized_end=4657
  _globals['_MSGENABLETOKENIZESHARES']._serialized_start=4660
  _globals['_MSGENABLETOKENIZESHARES']._serialized_end=4831
  _globals['_MSGENABLETOKENIZESHARESRESPONSE']._serialized_start=4833
  _globals['_MSGENABLETOKENIZESHARESRESPONSE']._serialized_end=4945
  _globals['_MSGVALIDATORBOND']._serialized_start=4948
  _globals['_MSGVALIDATORBOND']._serialized_end=5180
  _globals['_MSGVALIDATORBONDRESPONSE']._serialized_start=5182
  _globals['_MSGVALIDATORBONDRESPONSE']._serialized_end=5208
  _globals['_MSG']._serialized_start=5211
  _globals['_MSG']._serialized_end=6895
# @@protoc_insertion_point(module_scope)
