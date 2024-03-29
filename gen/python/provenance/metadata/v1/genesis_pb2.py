# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/metadata/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from provenance.metadata.v1 import metadata_pb2 as provenance_dot_metadata_dot_v1_dot_metadata__pb2
from provenance.metadata.v1 import scope_pb2 as provenance_dot_metadata_dot_v1_dot_scope__pb2
from provenance.metadata.v1 import specification_pb2 as provenance_dot_metadata_dot_v1_dot_specification__pb2
from provenance.metadata.v1 import objectstore_pb2 as provenance_dot_metadata_dot_v1_dot_objectstore__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$provenance/metadata/v1/genesis.proto\x12\x16provenance.metadata.v1\x1a\x14gogoproto/gogo.proto\x1a%provenance/metadata/v1/metadata.proto\x1a\"provenance/metadata/v1/scope.proto\x1a*provenance/metadata/v1/specification.proto\x1a(provenance/metadata/v1/objectstore.proto\"\x93\x06\n\x0cGenesisState\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.provenance.metadata.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12;\n\x06scopes\x18\x02 \x03(\x0b\x32\x1d.provenance.metadata.v1.ScopeB\x04\xc8\xde\x1f\x00R\x06scopes\x12\x41\n\x08sessions\x18\x03 \x03(\x0b\x32\x1f.provenance.metadata.v1.SessionB\x04\xc8\xde\x1f\x00R\x08sessions\x12>\n\x07records\x18\x04 \x03(\x0b\x32\x1e.provenance.metadata.v1.RecordB\x04\xc8\xde\x1f\x00R\x07records\x12\x63\n\x14scope_specifications\x18\x05 \x03(\x0b\x32*.provenance.metadata.v1.ScopeSpecificationB\x04\xc8\xde\x1f\x00R\x13scopeSpecifications\x12l\n\x17\x63ontract_specifications\x18\x06 \x03(\x0b\x32-.provenance.metadata.v1.ContractSpecificationB\x04\xc8\xde\x1f\x00R\x16\x63ontractSpecifications\x12\x66\n\x15record_specifications\x18\x07 \x03(\x0b\x32+.provenance.metadata.v1.RecordSpecificationB\x04\xc8\xde\x1f\x00R\x14recordSpecifications\x12Z\n\x12o_s_locator_params\x18\x08 \x01(\x0b\x32\'.provenance.metadata.v1.OSLocatorParamsB\x04\xc8\xde\x1f\x00R\x0foSLocatorParams\x12\x64\n\x15object_store_locators\x18\t \x03(\x0b\x32*.provenance.metadata.v1.ObjectStoreLocatorB\x04\xc8\xde\x1f\x00R\x13objectStoreLocators:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xda\x01\n\x1a\x63om.provenance.metadata.v1B\x0cGenesisProtoP\x00Z4github.com/provenance-io/provenance/x/metadata/types\xa2\x02\x03PMX\xaa\x02\x16Provenance.Metadata.V1\xca\x02\x16Provenance\\Metadata\\V1\xe2\x02\"Provenance\\Metadata\\V1\\GPBMetadata\xea\x02\x18Provenance::Metadata::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.metadata.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.provenance.metadata.v1B\014GenesisProtoP\000Z4github.com/provenance-io/provenance/x/metadata/types\242\002\003PMX\252\002\026Provenance.Metadata.V1\312\002\026Provenance\\Metadata\\V1\342\002\"Provenance\\Metadata\\V1\\GPBMetadata\352\002\030Provenance::Metadata::V1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['scopes']._options = None
  _globals['_GENESISSTATE'].fields_by_name['scopes']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['sessions']._options = None
  _globals['_GENESISSTATE'].fields_by_name['sessions']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['records']._options = None
  _globals['_GENESISSTATE'].fields_by_name['records']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['scope_specifications']._options = None
  _globals['_GENESISSTATE'].fields_by_name['scope_specifications']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['contract_specifications']._options = None
  _globals['_GENESISSTATE'].fields_by_name['contract_specifications']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['record_specifications']._options = None
  _globals['_GENESISSTATE'].fields_by_name['record_specifications']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['o_s_locator_params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['o_s_locator_params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['object_store_locators']._options = None
  _globals['_GENESISSTATE'].fields_by_name['object_store_locators']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._options = None
  _globals['_GENESISSTATE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=248
  _globals['_GENESISSTATE']._serialized_end=1035
# @@protoc_insertion_point(module_scope)
