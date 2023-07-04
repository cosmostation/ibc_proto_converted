# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/bridge/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from stafihub.bridge import genesis_pb2 as stafihub_dot_bridge_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18stafihub/bridge/tx.proto\x12\x18stafihub.stafihub.bridge\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1dstafihub/bridge/genesis.proto\"\xac\x01\n\x17MsgSetResourceidToDenom\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x1e\n\nresourceId\x18\x02 \x01(\tR\nresourceId\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x41\n\tdenomType\x18\x04 \x01(\x0e\x32#.stafihub.stafihub.bridge.DenomTypeR\tdenomType\"!\n\x1fMsgSetResourceidToDenomResponse\"\xd3\x01\n\nMsgDeposit\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x31\n\x0b\x64\x65stChainId\x18\x02 \x01(\rB\x0f\xea\xde\x1f\x0b\x64\x65stChainIdR\x0b\x64\x65stChainId\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x46\n\x06\x61mount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12\x1a\n\x08receiver\x18\x05 \x01(\tR\x08receiver\"\x14\n\x12MsgDepositResponse\"P\n\rMsgAddChainId\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\"\x17\n\x15MsgAddChainIdResponse\"\x8c\x02\n\x0fMsgVoteProposal\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\x12\x34\n\x0c\x64\x65positNonce\x18\x03 \x01(\x04\x42\x10\xea\xde\x1f\x0c\x64\x65positNonceR\x0c\x64\x65positNonce\x12\x1e\n\nresourceId\x18\x04 \x01(\tR\nresourceId\x12\x46\n\x06\x61mount\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12\x1a\n\x08receiver\x18\x06 \x01(\tR\x08receiver\"\x19\n\x17MsgVoteProposalResponse\"O\n\x0cMsgRmChainId\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\"\x16\n\x14MsgRmChainIdResponse\"L\n\x16MsgSetRelayFeeReceiver\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\" \n\x1eMsgSetRelayFeeReceiverResponse\"\xb3\x01\n\x0eMsgSetRelayFee\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\x12`\n\x05value\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05value\"\x18\n\x16MsgSetRelayFeeResponse\"j\n\x11MsgAddBannedDenom\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\"\x1b\n\x19MsgAddBannedDenomResponse\"i\n\x10MsgRmBannedDenom\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12%\n\x07\x63hainId\x18\x02 \x01(\rB\x0b\xea\xde\x1f\x07\x63hainIdR\x07\x63hainId\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\"\x1a\n\x18MsgRmBannedDenomResponse2\xfa\x07\n\x03Msg\x12\x84\x01\n\x14SetResourceidToDenom\x12\x31.stafihub.stafihub.bridge.MsgSetResourceidToDenom\x1a\x39.stafihub.stafihub.bridge.MsgSetResourceidToDenomResponse\x12]\n\x07\x44\x65posit\x12$.stafihub.stafihub.bridge.MsgDeposit\x1a,.stafihub.stafihub.bridge.MsgDepositResponse\x12\x66\n\nAddChainId\x12\'.stafihub.stafihub.bridge.MsgAddChainId\x1a/.stafihub.stafihub.bridge.MsgAddChainIdResponse\x12l\n\x0cVoteProposal\x12).stafihub.stafihub.bridge.MsgVoteProposal\x1a\x31.stafihub.stafihub.bridge.MsgVoteProposalResponse\x12\x63\n\tRmChainId\x12&.stafihub.stafihub.bridge.MsgRmChainId\x1a..stafihub.stafihub.bridge.MsgRmChainIdResponse\x12\x81\x01\n\x13SetRelayFeeReceiver\x12\x30.stafihub.stafihub.bridge.MsgSetRelayFeeReceiver\x1a\x38.stafihub.stafihub.bridge.MsgSetRelayFeeReceiverResponse\x12i\n\x0bSetRelayFee\x12(.stafihub.stafihub.bridge.MsgSetRelayFee\x1a\x30.stafihub.stafihub.bridge.MsgSetRelayFeeResponse\x12r\n\x0e\x41\x64\x64\x42\x61nnedDenom\x12+.stafihub.stafihub.bridge.MsgAddBannedDenom\x1a\x33.stafihub.stafihub.bridge.MsgAddBannedDenomResponse\x12o\n\rRmBannedDenom\x12*.stafihub.stafihub.bridge.MsgRmBannedDenom\x1a\x32.stafihub.stafihub.bridge.MsgRmBannedDenomResponseB\xd6\x01\n\x1c\x63om.stafihub.stafihub.bridgeB\x07TxProtoP\x01Z+github.com/stafihub/stafihub/x/bridge/types\xa2\x02\x03SSB\xaa\x02\x18Stafihub.Stafihub.Bridge\xca\x02\x18Stafihub\\Stafihub\\Bridge\xe2\x02$Stafihub\\Stafihub\\Bridge\\GPBMetadata\xea\x02\x1aStafihub::Stafihub::Bridgeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.bridge.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.stafihub.stafihub.bridgeB\007TxProtoP\001Z+github.com/stafihub/stafihub/x/bridge/types\242\002\003SSB\252\002\030Stafihub.Stafihub.Bridge\312\002\030Stafihub\\Stafihub\\Bridge\342\002$Stafihub\\Stafihub\\Bridge\\GPBMetadata\352\002\032Stafihub::Stafihub::Bridge'
  _MSGDEPOSIT.fields_by_name['destChainId']._options = None
  _MSGDEPOSIT.fields_by_name['destChainId']._serialized_options = b'\352\336\037\013destChainId'
  _MSGDEPOSIT.fields_by_name['amount']._options = None
  _MSGDEPOSIT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGADDCHAINID.fields_by_name['chainId']._options = None
  _MSGADDCHAINID.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _MSGVOTEPROPOSAL.fields_by_name['chainId']._options = None
  _MSGVOTEPROPOSAL.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _MSGVOTEPROPOSAL.fields_by_name['depositNonce']._options = None
  _MSGVOTEPROPOSAL.fields_by_name['depositNonce']._serialized_options = b'\352\336\037\014depositNonce'
  _MSGVOTEPROPOSAL.fields_by_name['amount']._options = None
  _MSGVOTEPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGRMCHAINID.fields_by_name['chainId']._options = None
  _MSGRMCHAINID.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _MSGSETRELAYFEE.fields_by_name['chainId']._options = None
  _MSGSETRELAYFEE.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _MSGSETRELAYFEE.fields_by_name['value']._options = None
  _MSGSETRELAYFEE.fields_by_name['value']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGADDBANNEDDENOM.fields_by_name['chainId']._options = None
  _MSGADDBANNEDDENOM.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _MSGRMBANNEDDENOM.fields_by_name['chainId']._options = None
  _MSGRMBANNEDDENOM.fields_by_name['chainId']._serialized_options = b'\352\336\037\007chainId'
  _globals['_MSGSETRESOURCEIDTODENOM']._serialized_start=140
  _globals['_MSGSETRESOURCEIDTODENOM']._serialized_end=312
  _globals['_MSGSETRESOURCEIDTODENOMRESPONSE']._serialized_start=314
  _globals['_MSGSETRESOURCEIDTODENOMRESPONSE']._serialized_end=347
  _globals['_MSGDEPOSIT']._serialized_start=350
  _globals['_MSGDEPOSIT']._serialized_end=561
  _globals['_MSGDEPOSITRESPONSE']._serialized_start=563
  _globals['_MSGDEPOSITRESPONSE']._serialized_end=583
  _globals['_MSGADDCHAINID']._serialized_start=585
  _globals['_MSGADDCHAINID']._serialized_end=665
  _globals['_MSGADDCHAINIDRESPONSE']._serialized_start=667
  _globals['_MSGADDCHAINIDRESPONSE']._serialized_end=690
  _globals['_MSGVOTEPROPOSAL']._serialized_start=693
  _globals['_MSGVOTEPROPOSAL']._serialized_end=961
  _globals['_MSGVOTEPROPOSALRESPONSE']._serialized_start=963
  _globals['_MSGVOTEPROPOSALRESPONSE']._serialized_end=988
  _globals['_MSGRMCHAINID']._serialized_start=990
  _globals['_MSGRMCHAINID']._serialized_end=1069
  _globals['_MSGRMCHAINIDRESPONSE']._serialized_start=1071
  _globals['_MSGRMCHAINIDRESPONSE']._serialized_end=1093
  _globals['_MSGSETRELAYFEERECEIVER']._serialized_start=1095
  _globals['_MSGSETRELAYFEERECEIVER']._serialized_end=1171
  _globals['_MSGSETRELAYFEERECEIVERRESPONSE']._serialized_start=1173
  _globals['_MSGSETRELAYFEERECEIVERRESPONSE']._serialized_end=1205
  _globals['_MSGSETRELAYFEE']._serialized_start=1208
  _globals['_MSGSETRELAYFEE']._serialized_end=1387
  _globals['_MSGSETRELAYFEERESPONSE']._serialized_start=1389
  _globals['_MSGSETRELAYFEERESPONSE']._serialized_end=1413
  _globals['_MSGADDBANNEDDENOM']._serialized_start=1415
  _globals['_MSGADDBANNEDDENOM']._serialized_end=1521
  _globals['_MSGADDBANNEDDENOMRESPONSE']._serialized_start=1523
  _globals['_MSGADDBANNEDDENOMRESPONSE']._serialized_end=1550
  _globals['_MSGRMBANNEDDENOM']._serialized_start=1552
  _globals['_MSGRMBANNEDDENOM']._serialized_end=1657
  _globals['_MSGRMBANNEDDENOMRESPONSE']._serialized_start=1659
  _globals['_MSGRMBANNEDDENOMRESPONSE']._serialized_end=1685
  _globals['_MSG']._serialized_start=1688
  _globals['_MSG']._serialized_end=2706
# @@protoc_insertion_point(module_scope)