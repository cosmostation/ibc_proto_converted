# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/vault/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x63omdex/vault/v1beta1/tx.proto\x12\x14\x63omdex.vault.v1beta1\x1a\x14gogoproto/gogo.proto\"\xfe\x02\n\x10MsgCreateRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12_\n\tamount_in\x18\x04 \x01(\tBB\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x10yaml:\"amount_in\"R\x08\x61mountIn\x12\x62\n\namount_out\x18\x05 \x01(\tBC\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"amount_out\"R\tamountOut\"\x13\n\x11MsgCreateResponse\"\xd1\x02\n\x11MsgDepositRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\x12W\n\x06\x61mount\x18\x05 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x14\n\x12MsgDepositResponse\"\xd2\x02\n\x12MsgWithdrawRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\x12W\n\x06\x61mount\x18\x05 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x15\n\x13MsgWithdrawResponse\"\xce\x02\n\x0eMsgDrawRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\x12W\n\x06\x61mount\x18\x05 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x11\n\x0fMsgDrawResponse\"\xcf\x02\n\x0fMsgRepayRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\x12W\n\x06\x61mount\x18\x05 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x12\n\x10MsgRepayResponse\"\xf6\x01\n\x0fMsgCloseRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\"\x12\n\x10MsgCloseResponse\"\xd8\x02\n\x18MsgDepositAndDrawRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12<\n\ruser_vault_id\x18\x04 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\x12W\n\x06\x61mount\x18\x05 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x1b\n\x19MsgDepositAndDrawResponse\"\x9c\x02\n\x1aMsgCreateStableMintRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12W\n\x06\x61mount\x18\x04 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"Amount\"R\x06\x61mount\"\x1d\n\x1bMsgCreateStableMintResponse\"\xe1\x02\n\x1bMsgDepositStableMintRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12W\n\x06\x61mount\x18\x04 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\x12\x42\n\x0fstable_vault_id\x18\x05 \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"stable_vault_id\"R\rstableVaultId\"\x1e\n\x1cMsgDepositStableMintResponse\"\xe2\x02\n\x1cMsgWithdrawStableMintRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12V\n\x16\x65xtended_pair_vault_id\x18\x03 \x01(\x04\x42!\xf2\xde\x1f\x1dyaml:\"extended_pair_vault_id\"R\x13\x65xtendedPairVaultId\x12W\n\x06\x61mount\x18\x04 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\x12\x42\n\x0fstable_vault_id\x18\x05 \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"stable_vault_id\"R\rstableVaultId\"\x1f\n\x1dMsgWithdrawStableMintResponse\"\xaa\x01\n\x1bMsgVaultInterestCalcRequest\x12#\n\x04\x66rom\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"from\"R\x04\x66rom\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12<\n\ruser_vault_id\x18\x03 \x01(\x04\x42\x18\xf2\xde\x1f\x14yaml:\"user_vault_id\"R\x0buserVaultId\"\x1e\n\x1cMsgVaultInterestCalcResponse2\xa9\t\n\x03Msg\x12\\\n\tMsgCreate\x12&.comdex.vault.v1beta1.MsgCreateRequest\x1a\'.comdex.vault.v1beta1.MsgCreateResponse\x12_\n\nMsgDeposit\x12\'.comdex.vault.v1beta1.MsgDepositRequest\x1a(.comdex.vault.v1beta1.MsgDepositResponse\x12\x62\n\x0bMsgWithdraw\x12(.comdex.vault.v1beta1.MsgWithdrawRequest\x1a).comdex.vault.v1beta1.MsgWithdrawResponse\x12V\n\x07MsgDraw\x12$.comdex.vault.v1beta1.MsgDrawRequest\x1a%.comdex.vault.v1beta1.MsgDrawResponse\x12Y\n\x08MsgRepay\x12%.comdex.vault.v1beta1.MsgRepayRequest\x1a&.comdex.vault.v1beta1.MsgRepayResponse\x12Y\n\x08MsgClose\x12%.comdex.vault.v1beta1.MsgCloseRequest\x1a&.comdex.vault.v1beta1.MsgCloseResponse\x12t\n\x11MsgDepositAndDraw\x12..comdex.vault.v1beta1.MsgDepositAndDrawRequest\x1a/.comdex.vault.v1beta1.MsgDepositAndDrawResponse\x12z\n\x13MsgCreateStableMint\x12\x30.comdex.vault.v1beta1.MsgCreateStableMintRequest\x1a\x31.comdex.vault.v1beta1.MsgCreateStableMintResponse\x12}\n\x14MsgDepositStableMint\x12\x31.comdex.vault.v1beta1.MsgDepositStableMintRequest\x1a\x32.comdex.vault.v1beta1.MsgDepositStableMintResponse\x12\x80\x01\n\x15MsgWithdrawStableMint\x12\x32.comdex.vault.v1beta1.MsgWithdrawStableMintRequest\x1a\x33.comdex.vault.v1beta1.MsgWithdrawStableMintResponse\x12}\n\x14MsgVaultInterestCalc\x12\x31.comdex.vault.v1beta1.MsgVaultInterestCalcRequest\x1a\x32.comdex.vault.v1beta1.MsgVaultInterestCalcResponseB\xcc\x01\n\x18\x63om.comdex.vault.v1beta1B\x07TxProtoZ/github.com/comdex-official/comdex/x/vault/types\xa2\x02\x03\x43VX\xaa\x02\x14\x43omdex.Vault.V1beta1\xca\x02\x14\x43omdex\\Vault\\V1beta1\xe2\x02 Comdex\\Vault\\V1beta1\\GPBMetadata\xea\x02\x16\x43omdex::Vault::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.vault.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.comdex.vault.v1beta1B\007TxProtoZ/github.com/comdex-official/comdex/x/vault/types\242\002\003CVX\252\002\024Comdex.Vault.V1beta1\312\002\024Comdex\\Vault\\V1beta1\342\002 Comdex\\Vault\\V1beta1\\GPBMetadata\352\002\026Comdex::Vault::V1beta1\310\341\036\000\250\342\036\000'
  _globals['_MSGCREATEREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGCREATEREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGCREATEREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGCREATEREQUEST'].fields_by_name['amount_in']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['amount_in']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\020yaml:\"amount_in\"'
  _globals['_MSGCREATEREQUEST'].fields_by_name['amount_out']._options = None
  _globals['_MSGCREATEREQUEST'].fields_by_name['amount_out']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"amount_out\"'
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGDEPOSITREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGWITHDRAWREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGDRAWREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGDRAWREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGDRAWREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGDRAWREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGDRAWREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGDRAWREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGDRAWREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGDRAWREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGREPAYREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGREPAYREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGREPAYREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGREPAYREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGREPAYREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGREPAYREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGREPAYREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGREPAYREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGREPAYREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGREPAYREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGCLOSEREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGCLOSEREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGCLOSEREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGCLOSEREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGCLOSEREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGCLOSEREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGCLOSEREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGCLOSEREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGDEPOSITANDDRAWREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGCREATESTABLEMINTREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"Amount\"'
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['stable_vault_id']._options = None
  _globals['_MSGDEPOSITSTABLEMINTREQUEST'].fields_by_name['stable_vault_id']._serialized_options = b'\362\336\037\026yaml:\"stable_vault_id\"'
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._options = None
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['extended_pair_vault_id']._serialized_options = b'\362\336\037\035yaml:\"extended_pair_vault_id\"'
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['amount']._options = None
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"amount\"'
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['stable_vault_id']._options = None
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST'].fields_by_name['stable_vault_id']._serialized_options = b'\362\336\037\026yaml:\"stable_vault_id\"'
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['from']._options = None
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"'
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['app_id']._options = None
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['user_vault_id']._options = None
  _globals['_MSGVAULTINTERESTCALCREQUEST'].fields_by_name['user_vault_id']._serialized_options = b'\362\336\037\024yaml:\"user_vault_id\"'
  _globals['_MSGCREATEREQUEST']._serialized_start=78
  _globals['_MSGCREATEREQUEST']._serialized_end=460
  _globals['_MSGCREATERESPONSE']._serialized_start=462
  _globals['_MSGCREATERESPONSE']._serialized_end=481
  _globals['_MSGDEPOSITREQUEST']._serialized_start=484
  _globals['_MSGDEPOSITREQUEST']._serialized_end=821
  _globals['_MSGDEPOSITRESPONSE']._serialized_start=823
  _globals['_MSGDEPOSITRESPONSE']._serialized_end=843
  _globals['_MSGWITHDRAWREQUEST']._serialized_start=846
  _globals['_MSGWITHDRAWREQUEST']._serialized_end=1184
  _globals['_MSGWITHDRAWRESPONSE']._serialized_start=1186
  _globals['_MSGWITHDRAWRESPONSE']._serialized_end=1207
  _globals['_MSGDRAWREQUEST']._serialized_start=1210
  _globals['_MSGDRAWREQUEST']._serialized_end=1544
  _globals['_MSGDRAWRESPONSE']._serialized_start=1546
  _globals['_MSGDRAWRESPONSE']._serialized_end=1563
  _globals['_MSGREPAYREQUEST']._serialized_start=1566
  _globals['_MSGREPAYREQUEST']._serialized_end=1901
  _globals['_MSGREPAYRESPONSE']._serialized_start=1903
  _globals['_MSGREPAYRESPONSE']._serialized_end=1921
  _globals['_MSGCLOSEREQUEST']._serialized_start=1924
  _globals['_MSGCLOSEREQUEST']._serialized_end=2170
  _globals['_MSGCLOSERESPONSE']._serialized_start=2172
  _globals['_MSGCLOSERESPONSE']._serialized_end=2190
  _globals['_MSGDEPOSITANDDRAWREQUEST']._serialized_start=2193
  _globals['_MSGDEPOSITANDDRAWREQUEST']._serialized_end=2537
  _globals['_MSGDEPOSITANDDRAWRESPONSE']._serialized_start=2539
  _globals['_MSGDEPOSITANDDRAWRESPONSE']._serialized_end=2566
  _globals['_MSGCREATESTABLEMINTREQUEST']._serialized_start=2569
  _globals['_MSGCREATESTABLEMINTREQUEST']._serialized_end=2853
  _globals['_MSGCREATESTABLEMINTRESPONSE']._serialized_start=2855
  _globals['_MSGCREATESTABLEMINTRESPONSE']._serialized_end=2884
  _globals['_MSGDEPOSITSTABLEMINTREQUEST']._serialized_start=2887
  _globals['_MSGDEPOSITSTABLEMINTREQUEST']._serialized_end=3240
  _globals['_MSGDEPOSITSTABLEMINTRESPONSE']._serialized_start=3242
  _globals['_MSGDEPOSITSTABLEMINTRESPONSE']._serialized_end=3272
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST']._serialized_start=3275
  _globals['_MSGWITHDRAWSTABLEMINTREQUEST']._serialized_end=3629
  _globals['_MSGWITHDRAWSTABLEMINTRESPONSE']._serialized_start=3631
  _globals['_MSGWITHDRAWSTABLEMINTRESPONSE']._serialized_end=3662
  _globals['_MSGVAULTINTERESTCALCREQUEST']._serialized_start=3665
  _globals['_MSGVAULTINTERESTCALCREQUEST']._serialized_end=3835
  _globals['_MSGVAULTINTERESTCALCRESPONSE']._serialized_start=3837
  _globals['_MSGVAULTINTERESTCALCRESPONSE']._serialized_end=3867
  _globals['_MSG']._serialized_start=3870
  _globals['_MSG']._serialized_end=5063
# @@protoc_insertion_point(module_scope)
