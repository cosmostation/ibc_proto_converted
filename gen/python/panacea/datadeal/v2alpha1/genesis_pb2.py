# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/datadeal/v2alpha1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from panacea.datadeal.v2alpha1 import deal_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_deal__pb2
from panacea.datadeal.v2alpha1 import tx_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'panacea/datadeal/v2alpha1/genesis.proto\x12\x19panacea.datadeal.v2alpha1\x1a\x14gogoproto/gogo.proto\x1a$panacea/datadeal/v2alpha1/deal.proto\x1a\"panacea/datadeal/v2alpha1/tx.proto\"\xa3\x03\n\x0cGenesisState\x12N\n\x05\x64\x65\x61ls\x18\x01 \x03(\x0b\x32\x32.panacea.datadeal.v2alpha1.GenesisState.DealsEntryB\x04\xc8\xde\x1f\x00R\x05\x64\x65\x61ls\x12[\n\ndata_certs\x18\x02 \x03(\x0b\x32\x36.panacea.datadeal.v2alpha1.GenesisState.DataCertsEntryB\x04\xc8\xde\x1f\x00R\tdataCerts\x12(\n\x10next_deal_number\x18\x03 \x01(\x04R\x0enextDealNumber\x1aY\n\nDealsEntry\x12\x10\n\x03key\x18\x01 \x01(\x04R\x03key\x12\x35\n\x05value\x18\x02 \x01(\x0b\x32\x1f.panacea.datadeal.v2alpha1.DealR\x05value:\x02\x38\x01\x1a\x61\n\x0e\x44\x61taCertsEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x39\n\x05value\x18\x02 \x01(\x0b\x32#.panacea.datadeal.v2alpha1.DataCertR\x05value:\x02\x38\x01\x42\xe7\x01\n\x1d\x63om.panacea.datadeal.v2alpha1B\x0cGenesisProtoZ4github.com/medibloc/panacea-core/v2/x/datadeal/types\xa2\x02\x03PDX\xaa\x02\x19Panacea.Datadeal.V2alpha1\xca\x02\x19Panacea\\Datadeal\\V2alpha1\xe2\x02%Panacea\\Datadeal\\V2alpha1\\GPBMetadata\xea\x02\x1bPanacea::Datadeal::V2alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.datadeal.v2alpha1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.panacea.datadeal.v2alpha1B\014GenesisProtoZ4github.com/medibloc/panacea-core/v2/x/datadeal/types\242\002\003PDX\252\002\031Panacea.Datadeal.V2alpha1\312\002\031Panacea\\Datadeal\\V2alpha1\342\002%Panacea\\Datadeal\\V2alpha1\\GPBMetadata\352\002\033Panacea::Datadeal::V2alpha1'
  _globals['_GENESISSTATE_DEALSENTRY']._options = None
  _globals['_GENESISSTATE_DEALSENTRY']._serialized_options = b'8\001'
  _globals['_GENESISSTATE_DATACERTSENTRY']._options = None
  _globals['_GENESISSTATE_DATACERTSENTRY']._serialized_options = b'8\001'
  _globals['_GENESISSTATE'].fields_by_name['deals']._options = None
  _globals['_GENESISSTATE'].fields_by_name['deals']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['data_certs']._options = None
  _globals['_GENESISSTATE'].fields_by_name['data_certs']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=167
  _globals['_GENESISSTATE']._serialized_end=586
  _globals['_GENESISSTATE_DEALSENTRY']._serialized_start=398
  _globals['_GENESISSTATE_DEALSENTRY']._serialized_end=487
  _globals['_GENESISSTATE_DATACERTSENTRY']._serialized_start=489
  _globals['_GENESISSTATE_DATACERTSENTRY']._serialized_end=586
# @@protoc_insertion_point(module_scope)
