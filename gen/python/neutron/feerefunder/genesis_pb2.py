# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/feerefunder/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from neutron.feerefunder import params_pb2 as neutron_dot_feerefunder_dot_params__pb2
from neutron.feerefunder import fee_pb2 as neutron_dot_feerefunder_dot_fee__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!neutron/feerefunder/genesis.proto\x12\x13neutron.feerefunder\x1a\x14gogoproto/gogo.proto\x1a neutron/feerefunder/params.proto\x1a\x1dneutron/feerefunder/fee.proto\"\x8a\x01\n\x0cGenesisState\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.neutron.feerefunder.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12?\n\tfee_infos\x18\x02 \x03(\x0b\x32\x1c.neutron.feerefunder.FeeInfoB\x04\xc8\xde\x1f\x00R\x08\x66\x65\x65Infos\"\x93\x01\n\x07\x46\x65\x65Info\x12\x14\n\x05payer\x18\x01 \x01(\tR\x05payer\x12@\n\tpacket_id\x18\x02 \x01(\x0b\x32\x1d.neutron.feerefunder.PacketIDB\x04\xc8\xde\x1f\x00R\x08packetId\x12\x30\n\x03\x66\x65\x65\x18\x03 \x01(\x0b\x32\x18.neutron.feerefunder.FeeB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\x42\xc6\x01\n\x17\x63om.neutron.feerefunderB\x0cGenesisProtoZ2github.com/neutron-org/neutron/x/feerefunder/types\xa2\x02\x03NFX\xaa\x02\x13Neutron.Feerefunder\xca\x02\x13Neutron\\Feerefunder\xe2\x02\x1fNeutron\\Feerefunder\\GPBMetadata\xea\x02\x14Neutron::Feerefunderb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.feerefunder.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.neutron.feerefunderB\014GenesisProtoZ2github.com/neutron-org/neutron/x/feerefunder/types\242\002\003NFX\252\002\023Neutron.Feerefunder\312\002\023Neutron\\Feerefunder\342\002\037Neutron\\Feerefunder\\GPBMetadata\352\002\024Neutron::Feerefunder'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['fee_infos']._options = None
  _globals['_GENESISSTATE'].fields_by_name['fee_infos']._serialized_options = b'\310\336\037\000'
  _globals['_FEEINFO'].fields_by_name['packet_id']._options = None
  _globals['_FEEINFO'].fields_by_name['packet_id']._serialized_options = b'\310\336\037\000'
  _globals['_FEEINFO'].fields_by_name['fee']._options = None
  _globals['_FEEINFO'].fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=146
  _globals['_GENESISSTATE']._serialized_end=284
  _globals['_FEEINFO']._serialized_start=287
  _globals['_FEEINFO']._serialized_end=434
# @@protoc_insertion_point(module_scope)
