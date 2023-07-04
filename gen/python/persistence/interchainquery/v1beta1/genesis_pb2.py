# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: persistence/interchainquery/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1persistence/interchainquery/v1beta1/genesis.proto\x12#persistence.interchainquery.v1beta1\x1a\x14gogoproto/gogo.proto\"\xb1\x03\n\x05Query\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12#\n\rconnection_id\x18\x02 \x01(\tR\x0c\x63onnectionId\x12\x19\n\x08\x63hain_id\x18\x03 \x01(\tR\x07\x63hainId\x12\x1d\n\nquery_type\x18\x04 \x01(\tR\tqueryType\x12\x18\n\x07request\x18\x05 \x01(\x0cR\x07request\x12\x46\n\x06period\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06period\x12O\n\x0blast_height\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\nlastHeight\x12\x1f\n\x0b\x63\x61llback_id\x18\x08 \x01(\tR\ncallbackId\x12\x10\n\x03ttl\x18\t \x01(\x04R\x03ttl\x12S\n\rlast_emission\x18\n \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0clastEmission\"\xef\x01\n\tDataPoint\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12S\n\rremote_height\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0cremoteHeight\x12Q\n\x0clocal_height\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0blocalHeight\x12*\n\x05value\x18\x04 \x01(\x0c\x42\x14\xea\xde\x1f\x10result,omitemptyR\x05value\"Z\n\x0cGenesisState\x12J\n\x07queries\x18\x01 \x03(\x0b\x32*.persistence.interchainquery.v1beta1.QueryB\x04\xc8\xde\x1f\x00R\x07queriesB\xab\x02\n\'com.persistence.interchainquery.v1beta1B\x0cGenesisProtoP\x01ZDgithub.com/persistenceOne/persistence-sdk/v2/x/interchainquery/types\xa2\x02\x03PIX\xaa\x02#Persistence.Interchainquery.V1beta1\xca\x02#Persistence\\Interchainquery\\V1beta1\xe2\x02/Persistence\\Interchainquery\\V1beta1\\GPBMetadata\xea\x02%Persistence::Interchainquery::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'persistence.interchainquery.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.persistence.interchainquery.v1beta1B\014GenesisProtoP\001ZDgithub.com/persistenceOne/persistence-sdk/v2/x/interchainquery/types\242\002\003PIX\252\002#Persistence.Interchainquery.V1beta1\312\002#Persistence\\Interchainquery\\V1beta1\342\002/Persistence\\Interchainquery\\V1beta1\\GPBMetadata\352\002%Persistence::Interchainquery::V1beta1'
  _QUERY.fields_by_name['period']._options = None
  _QUERY.fields_by_name['period']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _QUERY.fields_by_name['last_height']._options = None
  _QUERY.fields_by_name['last_height']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _QUERY.fields_by_name['last_emission']._options = None
  _QUERY.fields_by_name['last_emission']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _DATAPOINT.fields_by_name['remote_height']._options = None
  _DATAPOINT.fields_by_name['remote_height']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _DATAPOINT.fields_by_name['local_height']._options = None
  _DATAPOINT.fields_by_name['local_height']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _DATAPOINT.fields_by_name['value']._options = None
  _DATAPOINT.fields_by_name['value']._serialized_options = b'\352\336\037\020result,omitempty'
  _GENESISSTATE.fields_by_name['queries']._options = None
  _GENESISSTATE.fields_by_name['queries']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY']._serialized_start=113
  _globals['_QUERY']._serialized_end=546
  _globals['_DATAPOINT']._serialized_start=549
  _globals['_DATAPOINT']._serialized_end=788
  _globals['_GENESISSTATE']._serialized_start=790
  _globals['_GENESISSTATE']._serialized_end=880
# @@protoc_insertion_point(module_scope)