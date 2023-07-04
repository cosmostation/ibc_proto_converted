# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: canto/fees/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x16\x63\x61nto/fees/v1/tx.proto\x12\rcanto.fees.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x14gogoproto/gogo.proto\"\xaf\x01\n\x0eMsgRegisterFee\x12)\n\x10\x63ontract_address\x18\x01 \x01(\tR\x0f\x63ontractAddress\x12)\n\x10\x64\x65ployer_address\x18\x02 \x01(\tR\x0f\x64\x65ployerAddress\x12)\n\x10withdraw_address\x18\x03 \x01(\tR\x0fwithdrawAddress\x12\x16\n\x06nonces\x18\x04 \x03(\x04R\x06nonces:\x04\xe8\xa0\x1f\x00\"\x18\n\x16MsgRegisterFeeResponse\"j\n\x0cMsgCancelFee\x12)\n\x10\x63ontract_address\x18\x01 \x01(\tR\x0f\x63ontractAddress\x12)\n\x10\x64\x65ployer_address\x18\x02 \x01(\tR\x0f\x64\x65ployerAddress:\x04\xe8\xa0\x1f\x00\"\x16\n\x14MsgCancelFeeResponse\"\x95\x01\n\x0cMsgUpdateFee\x12)\n\x10\x63ontract_address\x18\x01 \x01(\tR\x0f\x63ontractAddress\x12)\n\x10\x64\x65ployer_address\x18\x02 \x01(\tR\x0f\x64\x65ployerAddress\x12)\n\x10withdraw_address\x18\x03 \x01(\tR\x0fwithdrawAddress:\x04\xe8\xa0\x1f\x00\"\x16\n\x14MsgUpdateFeeResponse2\xec\x02\n\x03Msg\x12{\n\x0bRegisterFee\x12\x1d.canto.fees.v1.MsgRegisterFee\x1a%.canto.fees.v1.MsgRegisterFeeResponse\"&\x82\xd3\xe4\x93\x02 \"\x1e/canto/fees/v1/tx/register_fee\x12s\n\tCancelFee\x12\x1b.canto.fees.v1.MsgCancelFee\x1a#.canto.fees.v1.MsgCancelFeeResponse\"$\x82\xd3\xe4\x93\x02\x1e\"\x1c/canto/fees/v1/tx/cancel_fee\x12s\n\tUpdateFee\x12\x1b.canto.fees.v1.MsgUpdateFee\x1a#.canto.fees.v1.MsgUpdateFeeResponse\"$\x82\xd3\xe4\x93\x02\x1e\"\x1c/canto/fees/v1/tx/update_feeB\xa2\x01\n\x11\x63om.canto.fees.v1B\x07TxProtoP\x01Z.github.com/Canto-Network/Canto/v6/x/fees/types\xa2\x02\x03\x43\x46X\xaa\x02\rCanto.Fees.V1\xca\x02\rCanto\\Fees\\V1\xe2\x02\x19\x43\x61nto\\Fees\\V1\\GPBMetadata\xea\x02\x0f\x43\x61nto::Fees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'canto.fees.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\021com.canto.fees.v1B\007TxProtoP\001Z.github.com/Canto-Network/Canto/v6/x/fees/types\242\002\003CFX\252\002\rCanto.Fees.V1\312\002\rCanto\\Fees\\V1\342\002\031Canto\\Fees\\V1\\GPBMetadata\352\002\017Canto::Fees::V1'
  _MSGREGISTERFEE._options = None
  _MSGREGISTERFEE._serialized_options = b'\350\240\037\000'
  _MSGCANCELFEE._options = None
  _MSGCANCELFEE._serialized_options = b'\350\240\037\000'
  _MSGUPDATEFEE._options = None
  _MSGUPDATEFEE._serialized_options = b'\350\240\037\000'
  _MSG.methods_by_name['RegisterFee']._options = None
  _MSG.methods_by_name['RegisterFee']._serialized_options = b'\202\323\344\223\002 \"\036/canto/fees/v1/tx/register_fee'
  _MSG.methods_by_name['CancelFee']._options = None
  _MSG.methods_by_name['CancelFee']._serialized_options = b'\202\323\344\223\002\036\"\034/canto/fees/v1/tx/cancel_fee'
  _MSG.methods_by_name['UpdateFee']._options = None
  _MSG.methods_by_name['UpdateFee']._serialized_options = b'\202\323\344\223\002\036\"\034/canto/fees/v1/tx/update_fee'
  _globals['_MSGREGISTERFEE']._serialized_start=94
  _globals['_MSGREGISTERFEE']._serialized_end=269
  _globals['_MSGREGISTERFEERESPONSE']._serialized_start=271
  _globals['_MSGREGISTERFEERESPONSE']._serialized_end=295
  _globals['_MSGCANCELFEE']._serialized_start=297
  _globals['_MSGCANCELFEE']._serialized_end=403
  _globals['_MSGCANCELFEERESPONSE']._serialized_start=405
  _globals['_MSGCANCELFEERESPONSE']._serialized_end=427
  _globals['_MSGUPDATEFEE']._serialized_start=430
  _globals['_MSGUPDATEFEE']._serialized_end=579
  _globals['_MSGUPDATEFEERESPONSE']._serialized_start=581
  _globals['_MSGUPDATEFEERESPONSE']._serialized_end=603
  _globals['_MSG']._serialized_start=606
  _globals['_MSG']._serialized_end=970
# @@protoc_insertion_point(module_scope)