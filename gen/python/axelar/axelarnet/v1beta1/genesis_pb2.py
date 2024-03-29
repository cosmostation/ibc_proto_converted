# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/axelarnet/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.axelarnet.v1beta1 import params_pb2 as axelar_dot_axelarnet_dot_v1beta1_dot_params__pb2
from axelar.axelarnet.v1beta1 import types_pb2 as axelar_dot_axelarnet_dot_v1beta1_dot_types__pb2
from axelar.utils.v1beta1 import queuer_pb2 as axelar_dot_utils_dot_v1beta1_dot_queuer__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&axelar/axelarnet/v1beta1/genesis.proto\x12\x18\x61xelar.axelarnet.v1beta1\x1a\x14gogoproto/gogo.proto\x1a%axelar/axelarnet/v1beta1/params.proto\x1a$axelar/axelarnet/v1beta1/types.proto\x1a!axelar/utils/v1beta1/queuer.proto\"\xed\x04\n\x0cGenesisState\x12>\n\x06params\x18\x01 \x01(\x0b\x32 .axelar.axelarnet.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12^\n\x11\x63ollector_address\x18\x02 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x10\x63ollectorAddress\x12\x43\n\x06\x63hains\x18\x03 \x03(\x0b\x32%.axelar.axelarnet.v1beta1.CosmosChainB\x04\xc8\xde\x1f\x00R\x06\x63hains\x12M\n\x0etransfer_queue\x18\x05 \x01(\x0b\x32 .axelar.utils.v1beta1.QueueStateB\x04\xc8\xde\x1f\x00R\rtransferQueue\x12`\n\ribc_transfers\x18\x07 \x03(\x0b\x32%.axelar.axelarnet.v1beta1.IBCTransferB\x14\xc8\xde\x1f\x00\xe2\xde\x1f\x0cIBCTransfersR\x0cibcTransfers\x12t\n\x0eseq_id_mapping\x18\x08 \x03(\x0b\x32\x38.axelar.axelarnet.v1beta1.GenesisState.SeqIdMappingEntryB\x14\xc8\xde\x1f\x00\xe2\xde\x1f\x0cSeqIDMappingR\x0cseqIdMapping\x1a?\n\x11SeqIdMappingEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x04R\x05value:\x02\x38\x01:\x04\x98\xa1\x1f\x01J\x04\x08\x04\x10\x05J\x04\x08\x06\x10\x07\x42\xe8\x01\n\x1c\x63om.axelar.axelarnet.v1beta1B\x0cGenesisProtoZ6github.com/axelarnetwork/axelar-core/x/axelarnet/types\xa2\x02\x03\x41\x41X\xaa\x02\x18\x41xelar.Axelarnet.V1beta1\xca\x02\x18\x41xelar\\Axelarnet\\V1beta1\xe2\x02$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\xea\x02\x1a\x41xelar::Axelarnet::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.axelarnet.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.axelar.axelarnet.v1beta1B\014GenesisProtoZ6github.com/axelarnetwork/axelar-core/x/axelarnet/types\242\002\003AAX\252\002\030Axelar.Axelarnet.V1beta1\312\002\030Axelar\\Axelarnet\\V1beta1\342\002$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\352\002\032Axelar::Axelarnet::V1beta1\310\341\036\000'
  _globals['_GENESISSTATE_SEQIDMAPPINGENTRY']._options = None
  _globals['_GENESISSTATE_SEQIDMAPPINGENTRY']._serialized_options = b'8\001'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['collector_address']._options = None
  _globals['_GENESISSTATE'].fields_by_name['collector_address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_GENESISSTATE'].fields_by_name['chains']._options = None
  _globals['_GENESISSTATE'].fields_by_name['chains']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['transfer_queue']._options = None
  _globals['_GENESISSTATE'].fields_by_name['transfer_queue']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['ibc_transfers']._options = None
  _globals['_GENESISSTATE'].fields_by_name['ibc_transfers']._serialized_options = b'\310\336\037\000\342\336\037\014IBCTransfers'
  _globals['_GENESISSTATE'].fields_by_name['seq_id_mapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['seq_id_mapping']._serialized_options = b'\310\336\037\000\342\336\037\014SeqIDMapping'
  _globals['_GENESISSTATE']._options = None
  _globals['_GENESISSTATE']._serialized_options = b'\230\241\037\001'
  _globals['_GENESISSTATE']._serialized_start=203
  _globals['_GENESISSTATE']._serialized_end=824
  _globals['_GENESISSTATE_SEQIDMAPPINGENTRY']._serialized_start=743
  _globals['_GENESISSTATE_SEQIDMAPPINGENTRY']._serialized_end=806
# @@protoc_insertion_point(module_scope)
