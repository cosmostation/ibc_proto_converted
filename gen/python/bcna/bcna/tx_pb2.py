# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bcna/bcna/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from bcna.bcna import bitcannaid_pb2 as bcna_dot_bcna_dot_bitcannaid__pb2
from bcna.bcna import supplychain_pb2 as bcna_dot_bcna_dot_supplychain__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x62\x63na/bcna/tx.proto\x12\x18\x62itcannaglobal.bcna.bcna\x1a\x1a\x62\x63na/bcna/bitcannaid.proto\x1a\x1b\x62\x63na/bcna/supplychain.proto\"a\n\x13MsgCreateBitcannaid\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x16\n\x06\x62\x63naid\x18\x02 \x01(\tR\x06\x62\x63naid\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\"-\n\x1bMsgCreateBitcannaidResponse\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"q\n\x13MsgUpdateBitcannaid\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x16\n\x06\x62\x63naid\x18\x03 \x01(\tR\x06\x62\x63naid\x12\x18\n\x07\x61\x64\x64ress\x18\x04 \x01(\tR\x07\x61\x64\x64ress\"\x1d\n\x1bMsgUpdateBitcannaidResponse\"?\n\x13MsgDeleteBitcannaid\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x1d\n\x1bMsgDeleteBitcannaidResponse\"\xa0\x01\n\x14MsgCreateSupplychain\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07product\x18\x02 \x01(\tR\x07product\x12\x12\n\x04info\x18\x03 \x01(\tR\x04info\x12\x1e\n\nsupplyinfo\x18\x04 \x01(\tR\nsupplyinfo\x12 \n\x0bsupplyextra\x18\x05 \x01(\tR\x0bsupplyextra\".\n\x1cMsgCreateSupplychainResponse\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"\xb0\x01\n\x14MsgUpdateSupplychain\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x18\n\x07product\x18\x03 \x01(\tR\x07product\x12\x12\n\x04info\x18\x04 \x01(\tR\x04info\x12\x1e\n\nsupplyinfo\x18\x05 \x01(\tR\nsupplyinfo\x12 \n\x0bsupplyextra\x18\x06 \x01(\tR\x0bsupplyextra\"\x1e\n\x1cMsgUpdateSupplychainResponse\"@\n\x14MsgDeleteSupplychain\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x1e\n\x1cMsgDeleteSupplychainResponse2\xea\x05\n\x03Msg\x12x\n\x10\x43reateBitcannaid\x12-.bitcannaglobal.bcna.bcna.MsgCreateBitcannaid\x1a\x35.bitcannaglobal.bcna.bcna.MsgCreateBitcannaidResponse\x12x\n\x10UpdateBitcannaid\x12-.bitcannaglobal.bcna.bcna.MsgUpdateBitcannaid\x1a\x35.bitcannaglobal.bcna.bcna.MsgUpdateBitcannaidResponse\x12x\n\x10\x44\x65leteBitcannaid\x12-.bitcannaglobal.bcna.bcna.MsgDeleteBitcannaid\x1a\x35.bitcannaglobal.bcna.bcna.MsgDeleteBitcannaidResponse\x12{\n\x11\x43reateSupplychain\x12..bitcannaglobal.bcna.bcna.MsgCreateSupplychain\x1a\x36.bitcannaglobal.bcna.bcna.MsgCreateSupplychainResponse\x12{\n\x11UpdateSupplychain\x12..bitcannaglobal.bcna.bcna.MsgUpdateSupplychain\x1a\x36.bitcannaglobal.bcna.bcna.MsgUpdateSupplychainResponse\x12{\n\x11\x44\x65leteSupplychain\x12..bitcannaglobal.bcna.bcna.MsgDeleteSupplychain\x1a\x36.bitcannaglobal.bcna.bcna.MsgDeleteSupplychainResponseB\xd4\x01\n\x1c\x63om.bitcannaglobal.bcna.bcnaB\x07TxProtoZ+github.com/BitCannaGlobal/bcna/x/bcna/types\xa2\x02\x03\x42\x42\x42\xaa\x02\x18\x42itcannaglobal.Bcna.Bcna\xca\x02\x18\x42itcannaglobal\\Bcna\\Bcna\xe2\x02$Bitcannaglobal\\Bcna\\Bcna\\GPBMetadata\xea\x02\x1a\x42itcannaglobal::Bcna::Bcnab\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bcna.bcna.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.bitcannaglobal.bcna.bcnaB\007TxProtoZ+github.com/BitCannaGlobal/bcna/x/bcna/types\242\002\003BBB\252\002\030Bitcannaglobal.Bcna.Bcna\312\002\030Bitcannaglobal\\Bcna\\Bcna\342\002$Bitcannaglobal\\Bcna\\Bcna\\GPBMetadata\352\002\032Bitcannaglobal::Bcna::Bcna'
  _globals['_MSGCREATEBITCANNAID']._serialized_start=105
  _globals['_MSGCREATEBITCANNAID']._serialized_end=202
  _globals['_MSGCREATEBITCANNAIDRESPONSE']._serialized_start=204
  _globals['_MSGCREATEBITCANNAIDRESPONSE']._serialized_end=249
  _globals['_MSGUPDATEBITCANNAID']._serialized_start=251
  _globals['_MSGUPDATEBITCANNAID']._serialized_end=364
  _globals['_MSGUPDATEBITCANNAIDRESPONSE']._serialized_start=366
  _globals['_MSGUPDATEBITCANNAIDRESPONSE']._serialized_end=395
  _globals['_MSGDELETEBITCANNAID']._serialized_start=397
  _globals['_MSGDELETEBITCANNAID']._serialized_end=460
  _globals['_MSGDELETEBITCANNAIDRESPONSE']._serialized_start=462
  _globals['_MSGDELETEBITCANNAIDRESPONSE']._serialized_end=491
  _globals['_MSGCREATESUPPLYCHAIN']._serialized_start=494
  _globals['_MSGCREATESUPPLYCHAIN']._serialized_end=654
  _globals['_MSGCREATESUPPLYCHAINRESPONSE']._serialized_start=656
  _globals['_MSGCREATESUPPLYCHAINRESPONSE']._serialized_end=702
  _globals['_MSGUPDATESUPPLYCHAIN']._serialized_start=705
  _globals['_MSGUPDATESUPPLYCHAIN']._serialized_end=881
  _globals['_MSGUPDATESUPPLYCHAINRESPONSE']._serialized_start=883
  _globals['_MSGUPDATESUPPLYCHAINRESPONSE']._serialized_end=913
  _globals['_MSGDELETESUPPLYCHAIN']._serialized_start=915
  _globals['_MSGDELETESUPPLYCHAIN']._serialized_end=979
  _globals['_MSGDELETESUPPLYCHAINRESPONSE']._serialized_start=981
  _globals['_MSGDELETESUPPLYCHAINRESPONSE']._serialized_end=1011
  _globals['_MSG']._serialized_start=1014
  _globals['_MSG']._serialized_end=1760
# @@protoc_insertion_point(module_scope)
