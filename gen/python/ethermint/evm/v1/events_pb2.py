# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ethermint/evm/v1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x65thermint/evm/v1/events.proto\x12\x10\x65thermint.evm.v1\"\xcb\x01\n\x0f\x45ventEthereumTx\x12\x16\n\x06\x61mount\x18\x01 \x01(\tR\x06\x61mount\x12\x19\n\x08\x65th_hash\x18\x02 \x01(\tR\x07\x65thHash\x12\x14\n\x05index\x18\x03 \x01(\tR\x05index\x12\x19\n\x08gas_used\x18\x04 \x01(\tR\x07gasUsed\x12\x12\n\x04hash\x18\x05 \x01(\tR\x04hash\x12\x1c\n\trecipient\x18\x06 \x01(\tR\trecipient\x12\"\n\reth_tx_failed\x18\x07 \x01(\tR\x0b\x65thTxFailed\"%\n\nEventTxLog\x12\x17\n\x07tx_logs\x18\x01 \x03(\tR\x06txLogs\"W\n\x0c\x45ventMessage\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12\x17\n\x07tx_type\x18\x03 \x01(\tR\x06txType\"\'\n\x0f\x45ventBlockBloom\x12\x14\n\x05\x62loom\x18\x01 \x01(\tR\x05\x62loomB\xad\x01\n\x14\x63om.ethermint.evm.v1B\x0b\x45ventsProtoP\x01Z&github.com/evmos/evmos/v13/x/evm/types\xa2\x02\x03\x45\x45X\xaa\x02\x10\x45thermint.Evm.V1\xca\x02\x10\x45thermint\\Evm\\V1\xe2\x02\x1c\x45thermint\\Evm\\V1\\GPBMetadata\xea\x02\x12\x45thermint::Evm::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ethermint.evm.v1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.ethermint.evm.v1B\013EventsProtoP\001Z&github.com/evmos/evmos/v13/x/evm/types\242\002\003EEX\252\002\020Ethermint.Evm.V1\312\002\020Ethermint\\Evm\\V1\342\002\034Ethermint\\Evm\\V1\\GPBMetadata\352\002\022Ethermint::Evm::V1'
  _globals['_EVENTETHEREUMTX']._serialized_start=52
  _globals['_EVENTETHEREUMTX']._serialized_end=255
  _globals['_EVENTTXLOG']._serialized_start=257
  _globals['_EVENTTXLOG']._serialized_end=294
  _globals['_EVENTMESSAGE']._serialized_start=296
  _globals['_EVENTMESSAGE']._serialized_end=383
  _globals['_EVENTBLOCKBLOOM']._serialized_start=385
  _globals['_EVENTBLOCKBLOOM']._serialized_end=424
# @@protoc_insertion_point(module_scope)