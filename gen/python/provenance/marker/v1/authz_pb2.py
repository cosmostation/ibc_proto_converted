# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/marker/v1/authz.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n provenance/marker/v1/authz.proto\x12\x14provenance.marker.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xc3\x01\n\x1bMarkerTransferAuthorization\x12r\n\x0etransfer_limit\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rtransferLimit\x12\x1d\n\nallow_list\x18\x02 \x03(\tR\tallowList:\x11\xca\xb4-\rAuthorizationB\xcc\x01\n\x18\x63om.provenance.marker.v1B\nAuthzProtoP\x00Z2github.com/provenance-io/provenance/x/marker/types\xa2\x02\x03PMX\xaa\x02\x14Provenance.Marker.V1\xca\x02\x14Provenance\\Marker\\V1\xe2\x02 Provenance\\Marker\\V1\\GPBMetadata\xea\x02\x16Provenance::Marker::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.marker.v1.authz_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.provenance.marker.v1B\nAuthzProtoP\000Z2github.com/provenance-io/provenance/x/marker/types\242\002\003PMX\252\002\024Provenance.Marker.V1\312\002\024Provenance\\Marker\\V1\342\002 Provenance\\Marker\\V1\\GPBMetadata\352\002\026Provenance::Marker::V1'
  _globals['_MARKERTRANSFERAUTHORIZATION'].fields_by_name['transfer_limit']._options = None
  _globals['_MARKERTRANSFERAUTHORIZATION'].fields_by_name['transfer_limit']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MARKERTRANSFERAUTHORIZATION']._options = None
  _globals['_MARKERTRANSFERAUTHORIZATION']._serialized_options = b'\312\264-\rAuthorization'
  _globals['_MARKERTRANSFERAUTHORIZATION']._serialized_start=140
  _globals['_MARKERTRANSFERAUTHORIZATION']._serialized_end=335
# @@protoc_insertion_point(module_scope)
