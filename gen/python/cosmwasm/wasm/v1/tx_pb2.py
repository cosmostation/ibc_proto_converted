# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmwasm/wasm/v1/tx.proto
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
from cosmwasm.wasm.v1 import types_pb2 as cosmwasm_dot_wasm_dot_v1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x63osmwasm/wasm/v1/tx.proto\x12\x10\x63osmwasm.wasm.v1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1c\x63osmwasm/wasm/v1/types.proto\"\xc1\x01\n\x0cMsgStoreCode\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x36\n\x0ewasm_byte_code\x18\x02 \x01(\x0c\x42\x10\xe2\xde\x1f\x0cWASMByteCodeR\x0cwasmByteCode\x12U\n\x16instantiate_permission\x18\x05 \x01(\x0b\x32\x1e.cosmwasm.wasm.v1.AccessConfigR\x15instantiatePermissionJ\x04\x08\x03\x10\x04J\x04\x08\x04\x10\x05\"W\n\x14MsgStoreCodeResponse\x12#\n\x07\x63ode_id\x18\x01 \x01(\x04\x42\n\xe2\xde\x1f\x06\x43odeIDR\x06\x63odeId\x12\x1a\n\x08\x63hecksum\x18\x02 \x01(\x0cR\x08\x63hecksum\"\x8e\x02\n\x16MsgInstantiateContract\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x14\n\x05\x61\x64min\x18\x02 \x01(\tR\x05\x61\x64min\x12#\n\x07\x63ode_id\x18\x03 \x01(\x04\x42\n\xe2\xde\x1f\x06\x43odeIDR\x06\x63odeId\x12\x14\n\x05label\x18\x04 \x01(\tR\x05label\x12(\n\x03msg\x18\x05 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\x03msg\x12\x61\n\x05\x66unds\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x66unds\"\xbc\x02\n\x17MsgInstantiateContract2\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x14\n\x05\x61\x64min\x18\x02 \x01(\tR\x05\x61\x64min\x12#\n\x07\x63ode_id\x18\x03 \x01(\x04\x42\n\xe2\xde\x1f\x06\x43odeIDR\x06\x63odeId\x12\x14\n\x05label\x18\x04 \x01(\tR\x05label\x12(\n\x03msg\x18\x05 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\x03msg\x12\x61\n\x05\x66unds\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x66unds\x12\x12\n\x04salt\x18\x07 \x01(\x0cR\x04salt\x12\x17\n\x07\x66ix_msg\x18\x08 \x01(\x08R\x06\x66ixMsg\"N\n\x1eMsgInstantiateContractResponse\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x12\n\x04\x64\x61ta\x18\x02 \x01(\x0cR\x04\x64\x61ta\"O\n\x1fMsgInstantiateContract2Response\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x12\n\x04\x64\x61ta\x18\x02 \x01(\x0cR\x04\x64\x61ta\"\xd5\x01\n\x12MsgExecuteContract\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1a\n\x08\x63ontract\x18\x02 \x01(\tR\x08\x63ontract\x12(\n\x03msg\x18\x03 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\x03msg\x12\x61\n\x05\x66unds\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x66unds\"0\n\x1aMsgExecuteContractResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"\x97\x01\n\x12MsgMigrateContract\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1a\n\x08\x63ontract\x18\x02 \x01(\tR\x08\x63ontract\x12#\n\x07\x63ode_id\x18\x03 \x01(\x04\x42\n\xe2\xde\x1f\x06\x43odeIDR\x06\x63odeId\x12(\n\x03msg\x18\x04 \x01(\x0c\x42\x16\xfa\xde\x1f\x12RawContractMessageR\x03msg\"0\n\x1aMsgMigrateContractResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"a\n\x0eMsgUpdateAdmin\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1b\n\tnew_admin\x18\x02 \x01(\tR\x08newAdmin\x12\x1a\n\x08\x63ontract\x18\x03 \x01(\tR\x08\x63ontract\"\x18\n\x16MsgUpdateAdminResponse\"C\n\rMsgClearAdmin\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1a\n\x08\x63ontract\x18\x03 \x01(\tR\x08\x63ontract\"\x17\n\x15MsgClearAdminResponse2\xc4\x05\n\x03Msg\x12S\n\tStoreCode\x12\x1e.cosmwasm.wasm.v1.MsgStoreCode\x1a&.cosmwasm.wasm.v1.MsgStoreCodeResponse\x12q\n\x13InstantiateContract\x12(.cosmwasm.wasm.v1.MsgInstantiateContract\x1a\x30.cosmwasm.wasm.v1.MsgInstantiateContractResponse\x12t\n\x14InstantiateContract2\x12).cosmwasm.wasm.v1.MsgInstantiateContract2\x1a\x31.cosmwasm.wasm.v1.MsgInstantiateContract2Response\x12\x65\n\x0f\x45xecuteContract\x12$.cosmwasm.wasm.v1.MsgExecuteContract\x1a,.cosmwasm.wasm.v1.MsgExecuteContractResponse\x12\x65\n\x0fMigrateContract\x12$.cosmwasm.wasm.v1.MsgMigrateContract\x1a,.cosmwasm.wasm.v1.MsgMigrateContractResponse\x12Y\n\x0bUpdateAdmin\x12 .cosmwasm.wasm.v1.MsgUpdateAdmin\x1a(.cosmwasm.wasm.v1.MsgUpdateAdminResponse\x12V\n\nClearAdmin\x12\x1f.cosmwasm.wasm.v1.MsgClearAdmin\x1a\'.cosmwasm.wasm.v1.MsgClearAdminResponseB\xab\x01\n\x14\x63om.cosmwasm.wasm.v1B\x07TxProtoZ&github.com/CosmWasm/wasmd/x/wasm/types\xa2\x02\x03\x43WX\xaa\x02\x10\x43osmwasm.Wasm.V1\xca\x02\x10\x43osmwasm\\Wasm\\V1\xe2\x02\x1c\x43osmwasm\\Wasm\\V1\\GPBMetadata\xea\x02\x12\x43osmwasm::Wasm::V1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmwasm.wasm.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.cosmwasm.wasm.v1B\007TxProtoZ&github.com/CosmWasm/wasmd/x/wasm/types\242\002\003CWX\252\002\020Cosmwasm.Wasm.V1\312\002\020Cosmwasm\\Wasm\\V1\342\002\034Cosmwasm\\Wasm\\V1\\GPBMetadata\352\002\022Cosmwasm::Wasm::V1\310\341\036\000'
  _globals['_MSGSTORECODE'].fields_by_name['wasm_byte_code']._options = None
  _globals['_MSGSTORECODE'].fields_by_name['wasm_byte_code']._serialized_options = b'\342\336\037\014WASMByteCode'
  _globals['_MSGSTORECODERESPONSE'].fields_by_name['code_id']._options = None
  _globals['_MSGSTORECODERESPONSE'].fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID'
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['code_id']._options = None
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID'
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['msg']._options = None
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['msg']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['funds']._options = None
  _globals['_MSGINSTANTIATECONTRACT'].fields_by_name['funds']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['code_id']._options = None
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID'
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['msg']._options = None
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['msg']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['funds']._options = None
  _globals['_MSGINSTANTIATECONTRACT2'].fields_by_name['funds']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGEXECUTECONTRACT'].fields_by_name['msg']._options = None
  _globals['_MSGEXECUTECONTRACT'].fields_by_name['msg']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_MSGEXECUTECONTRACT'].fields_by_name['funds']._options = None
  _globals['_MSGEXECUTECONTRACT'].fields_by_name['funds']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGMIGRATECONTRACT'].fields_by_name['code_id']._options = None
  _globals['_MSGMIGRATECONTRACT'].fields_by_name['code_id']._serialized_options = b'\342\336\037\006CodeID'
  _globals['_MSGMIGRATECONTRACT'].fields_by_name['msg']._options = None
  _globals['_MSGMIGRATECONTRACT'].fields_by_name['msg']._serialized_options = b'\372\336\037\022RawContractMessage'
  _globals['_MSGSTORECODE']._serialized_start=132
  _globals['_MSGSTORECODE']._serialized_end=325
  _globals['_MSGSTORECODERESPONSE']._serialized_start=327
  _globals['_MSGSTORECODERESPONSE']._serialized_end=414
  _globals['_MSGINSTANTIATECONTRACT']._serialized_start=417
  _globals['_MSGINSTANTIATECONTRACT']._serialized_end=687
  _globals['_MSGINSTANTIATECONTRACT2']._serialized_start=690
  _globals['_MSGINSTANTIATECONTRACT2']._serialized_end=1006
  _globals['_MSGINSTANTIATECONTRACTRESPONSE']._serialized_start=1008
  _globals['_MSGINSTANTIATECONTRACTRESPONSE']._serialized_end=1086
  _globals['_MSGINSTANTIATECONTRACT2RESPONSE']._serialized_start=1088
  _globals['_MSGINSTANTIATECONTRACT2RESPONSE']._serialized_end=1167
  _globals['_MSGEXECUTECONTRACT']._serialized_start=1170
  _globals['_MSGEXECUTECONTRACT']._serialized_end=1383
  _globals['_MSGEXECUTECONTRACTRESPONSE']._serialized_start=1385
  _globals['_MSGEXECUTECONTRACTRESPONSE']._serialized_end=1433
  _globals['_MSGMIGRATECONTRACT']._serialized_start=1436
  _globals['_MSGMIGRATECONTRACT']._serialized_end=1587
  _globals['_MSGMIGRATECONTRACTRESPONSE']._serialized_start=1589
  _globals['_MSGMIGRATECONTRACTRESPONSE']._serialized_end=1637
  _globals['_MSGUPDATEADMIN']._serialized_start=1639
  _globals['_MSGUPDATEADMIN']._serialized_end=1736
  _globals['_MSGUPDATEADMINRESPONSE']._serialized_start=1738
  _globals['_MSGUPDATEADMINRESPONSE']._serialized_end=1762
  _globals['_MSGCLEARADMIN']._serialized_start=1764
  _globals['_MSGCLEARADMIN']._serialized_end=1831
  _globals['_MSGCLEARADMINRESPONSE']._serialized_start=1833
  _globals['_MSGCLEARADMINRESPONSE']._serialized_end=1856
  _globals['_MSG']._serialized_start=1859
  _globals['_MSG']._serialized_end=2567
# @@protoc_insertion_point(module_scope)
