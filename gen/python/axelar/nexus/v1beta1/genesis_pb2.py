# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/nexus/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.nexus.v1beta1 import params_pb2 as axelar_dot_nexus_dot_v1beta1_dot_params__pb2
from axelar.nexus.exported.v1beta1 import types_pb2 as axelar_dot_nexus_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.nexus.v1beta1 import types_pb2 as axelar_dot_nexus_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"axelar/nexus/v1beta1/genesis.proto\x12\x14\x61xelar.nexus.v1beta1\x1a\x14gogoproto/gogo.proto\x1a!axelar/nexus/v1beta1/params.proto\x1a)axelar/nexus/exported/v1beta1/types.proto\x1a axelar/nexus/v1beta1/types.proto\"\xbf\x06\n\x0cGenesisState\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.axelar.nexus.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x14\n\x05nonce\x18\x02 \x01(\x04R\x05nonce\x12\x42\n\x06\x63hains\x18\x03 \x03(\x0b\x32$.axelar.nexus.exported.v1beta1.ChainB\x04\xc8\xde\x1f\x00R\x06\x63hains\x12I\n\x0c\x63hain_states\x18\x04 \x03(\x0b\x32 .axelar.nexus.v1beta1.ChainStateB\x04\xc8\xde\x1f\x00R\x0b\x63hainStates\x12V\n\x10linked_addresses\x18\x05 \x03(\x0b\x32%.axelar.nexus.v1beta1.LinkedAddressesB\x04\xc8\xde\x1f\x00R\x0flinkedAddresses\x12U\n\ttransfers\x18\x06 \x03(\x0b\x32\x31.axelar.nexus.exported.v1beta1.CrossChainTransferB\x04\xc8\xde\x1f\x00R\ttransfers\x12\x42\n\x03\x66\x65\x65\x18\x07 \x01(\x0b\x32*.axelar.nexus.exported.v1beta1.TransferFeeB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\x12I\n\tfee_infos\x18\x08 \x03(\x0b\x32&.axelar.nexus.exported.v1beta1.FeeInfoB\x04\xc8\xde\x1f\x00R\x08\x66\x65\x65Infos\x12\x46\n\x0brate_limits\x18\t \x03(\x0b\x32\x1f.axelar.nexus.v1beta1.RateLimitB\x04\xc8\xde\x1f\x00R\nrateLimits\x12R\n\x0ftransfer_epochs\x18\n \x03(\x0b\x32#.axelar.nexus.v1beta1.TransferEpochB\x04\xc8\xde\x1f\x00R\x0etransferEpochs\x12O\n\x08messages\x18\x0b \x03(\x0b\x32-.axelar.nexus.exported.v1beta1.GeneralMessageB\x04\xc8\xde\x1f\x00R\x08messages\x12#\n\rmessage_nonce\x18\x0c \x01(\x04R\x0cmessageNonceB\xd2\x01\n\x18\x63om.axelar.nexus.v1beta1B\x0cGenesisProtoP\x01Z2github.com/axelarnetwork/axelar-core/x/nexus/types\xa2\x02\x03\x41NX\xaa\x02\x14\x41xelar.Nexus.V1beta1\xca\x02\x14\x41xelar\\Nexus\\V1beta1\xe2\x02 Axelar\\Nexus\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Nexus::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.nexus.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.axelar.nexus.v1beta1B\014GenesisProtoP\001Z2github.com/axelarnetwork/axelar-core/x/nexus/types\242\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Nexus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMetadata\352\002\026Axelar::Nexus::V1beta1\310\341\036\000'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['chains']._options = None
  _GENESISSTATE.fields_by_name['chains']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['chain_states']._options = None
  _GENESISSTATE.fields_by_name['chain_states']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['linked_addresses']._options = None
  _GENESISSTATE.fields_by_name['linked_addresses']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['transfers']._options = None
  _GENESISSTATE.fields_by_name['transfers']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['fee']._options = None
  _GENESISSTATE.fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['fee_infos']._options = None
  _GENESISSTATE.fields_by_name['fee_infos']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['rate_limits']._options = None
  _GENESISSTATE.fields_by_name['rate_limits']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['transfer_epochs']._options = None
  _GENESISSTATE.fields_by_name['transfer_epochs']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['messages']._options = None
  _GENESISSTATE.fields_by_name['messages']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=195
  _globals['_GENESISSTATE']._serialized_end=1026
# @@protoc_insertion_point(module_scope)