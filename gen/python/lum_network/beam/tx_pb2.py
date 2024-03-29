# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/beam/tx.proto
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
from lum_network.beam import beam_pb2 as lum__network_dot_beam_dot_beam__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19lum-network/beam/tx.proto\x12\x10lum.network.beam\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1blum-network/beam/beam.proto\"\xe7\x02\n\x0bMsgOpenBeam\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\'\n\x0f\x63reator_address\x18\x02 \x01(\tR\x0e\x63reatorAddress\x12\x16\n\x06secret\x18\x03 \x01(\tR\x06secret\x12\x37\n\x06\x61mount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x01R\x06\x61mount\x12\x16\n\x06schema\x18\x05 \x01(\tR\x06schema\x12\x34\n\x04\x64\x61ta\x18\x06 \x01(\x0b\x32\x1a.lum.network.beam.BeamDataB\x04\xc8\xde\x1f\x01R\x04\x64\x61ta\x12#\n\rclaim_address\x18\x07 \x01(\tR\x0c\x63laimAddress\x12\x33\n\x16\x63laim_expires_at_block\x18\x08 \x01(\x05R\x13\x63laimExpiresAtBlock\x12&\n\x0f\x63loses_at_block\x18\t \x01(\x05R\rclosesAtBlock\"\xb6\x03\n\rMsgUpdateBeam\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\'\n\x0fupdater_address\x18\x02 \x01(\tR\x0eupdaterAddress\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x01R\x06\x61mount\x12\x33\n\x06status\x18\x04 \x01(\x0e\x32\x1b.lum.network.beam.BeamStateR\x06status\x12#\n\rcancel_reason\x18\x05 \x01(\tR\x0c\x63\x61ncelReason\x12!\n\x0chide_content\x18\x06 \x01(\x08R\x0bhideContent\x12\x34\n\x04\x64\x61ta\x18\x07 \x01(\x0b\x32\x1a.lum.network.beam.BeamDataB\x04\xc8\xde\x1f\x01R\x04\x64\x61ta\x12#\n\rclaim_address\x18\x08 \x01(\tR\x0c\x63laimAddress\x12\x33\n\x16\x63laim_expires_at_block\x18\t \x01(\x05R\x13\x63laimExpiresAtBlock\x12&\n\x0f\x63loses_at_block\x18\n \x01(\x05R\rclosesAtBlock\"_\n\x0cMsgClaimBeam\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\'\n\x0f\x63laimer_address\x18\x02 \x01(\tR\x0e\x63laimerAddress\x12\x16\n\x06secret\x18\x03 \x01(\tR\x06secretB\xaa\x01\n\x14\x63om.lum.network.beamB\x07TxProtoZ)github.com/lum-network/chain/x/beam/types\xa2\x02\x03LNB\xaa\x02\x10Lum.Network.Beam\xca\x02\x10Lum\\Network\\Beam\xe2\x02\x1cLum\\Network\\Beam\\GPBMetadata\xea\x02\x12Lum::Network::Beamb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.beam.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.lum.network.beamB\007TxProtoZ)github.com/lum-network/chain/x/beam/types\242\002\003LNB\252\002\020Lum.Network.Beam\312\002\020Lum\\Network\\Beam\342\002\034Lum\\Network\\Beam\\GPBMetadata\352\002\022Lum::Network::Beam'
  _globals['_MSGOPENBEAM'].fields_by_name['amount']._options = None
  _globals['_MSGOPENBEAM'].fields_by_name['amount']._serialized_options = b'\310\336\037\001'
  _globals['_MSGOPENBEAM'].fields_by_name['data']._options = None
  _globals['_MSGOPENBEAM'].fields_by_name['data']._serialized_options = b'\310\336\037\001'
  _globals['_MSGUPDATEBEAM'].fields_by_name['amount']._options = None
  _globals['_MSGUPDATEBEAM'].fields_by_name['amount']._serialized_options = b'\310\336\037\001'
  _globals['_MSGUPDATEBEAM'].fields_by_name['data']._options = None
  _globals['_MSGUPDATEBEAM'].fields_by_name['data']._serialized_options = b'\310\336\037\001'
  _globals['_MSGOPENBEAM']._serialized_start=131
  _globals['_MSGOPENBEAM']._serialized_end=490
  _globals['_MSGUPDATEBEAM']._serialized_start=493
  _globals['_MSGUPDATEBEAM']._serialized_end=931
  _globals['_MSGCLAIMBEAM']._serialized_start=933
  _globals['_MSGCLAIMBEAM']._serialized_end=1028
# @@protoc_insertion_point(module_scope)
