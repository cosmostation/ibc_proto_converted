# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/random/tx.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17irismod/random/tx.proto\x12\x0eirismod.random\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x98\x02\n\x10MsgRequestRandom\x12@\n\x0e\x62lock_interval\x18\x01 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"block_interval\"R\rblockInterval\x12\x1a\n\x08\x63onsumer\x18\x02 \x01(\tR\x08\x63onsumer\x12\x16\n\x06oracle\x18\x03 \x01(\x08R\x06oracle\x12\x8d\x01\n\x0fservice_fee_cap\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBJ\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"service_fee_cap\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rserviceFeeCap\"\x1a\n\x18MsgRequestRandomResponse2b\n\x03Msg\x12[\n\rRequestRandom\x12 .irismod.random.MsgRequestRandom\x1a(.irismod.random.MsgRequestRandomResponseB\xa5\x01\n\x12\x63om.irismod.randomB\x07TxProtoZ/github.com/irisnet/irismod/modules/random/types\xa2\x02\x03IRX\xaa\x02\x0eIrismod.Random\xca\x02\x0eIrismod\\Random\xe2\x02\x1aIrismod\\Random\\GPBMetadata\xea\x02\x0fIrismod::Randomb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.random.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022com.irismod.randomB\007TxProtoZ/github.com/irisnet/irismod/modules/random/types\242\002\003IRX\252\002\016Irismod.Random\312\002\016Irismod\\Random\342\002\032Irismod\\Random\\GPBMetadata\352\002\017Irismod::Random'
  _globals['_MSGREQUESTRANDOM'].fields_by_name['block_interval']._options = None
  _globals['_MSGREQUESTRANDOM'].fields_by_name['block_interval']._serialized_options = b'\362\336\037\025yaml:\"block_interval\"'
  _globals['_MSGREQUESTRANDOM'].fields_by_name['service_fee_cap']._options = None
  _globals['_MSGREQUESTRANDOM'].fields_by_name['service_fee_cap']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"service_fee_cap\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGREQUESTRANDOM']._serialized_start=98
  _globals['_MSGREQUESTRANDOM']._serialized_end=378
  _globals['_MSGREQUESTRANDOMRESPONSE']._serialized_start=380
  _globals['_MSGREQUESTRANDOMRESPONSE']._serialized_end=406
  _globals['_MSG']._serialized_start=408
  _globals['_MSG']._serialized_end=506
# @@protoc_insertion_point(module_scope)
