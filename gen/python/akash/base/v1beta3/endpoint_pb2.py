# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/base/v1beta3/endpoint.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!akash/base/v1beta3/endpoint.proto\x12\x12\x61kash.base.v1beta3\x1a\x14gogoproto/gogo.proto\"\xea\x01\n\x08\x45ndpoint\x12\x35\n\x04kind\x18\x01 \x01(\x0e\x32!.akash.base.v1beta3.Endpoint.KindR\x04kind\x12h\n\x0fsequence_number\x18\x02 \x01(\rB?\xe2\xde\x1f\x0eSequenceNumber\xea\xde\x1f\x0fsequence_number\xf2\xde\x1f\x16yaml:\"sequence_number\"R\x0esequenceNumber\"7\n\x04Kind\x12\x0f\n\x0bSHARED_HTTP\x10\x00\x12\x0f\n\x0bRANDOM_PORT\x10\x01\x12\r\n\tLEASED_IP\x10\x02:\x04\xe8\xa0\x1f\x01\x42\xc9\x01\n\x16\x63om.akash.base.v1beta3B\rEndpointProtoZ8github.com/akash-network/akash-api/go/node/types/v1beta3\xa2\x02\x03\x41\x42X\xaa\x02\x12\x41kash.Base.V1beta3\xca\x02\x12\x41kash\\Base\\V1beta3\xe2\x02\x1e\x41kash\\Base\\V1beta3\\GPBMetadata\xea\x02\x14\x41kash::Base::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.base.v1beta3.endpoint_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.akash.base.v1beta3B\rEndpointProtoZ8github.com/akash-network/akash-api/go/node/types/v1beta3\242\002\003ABX\252\002\022Akash.Base.V1beta3\312\002\022Akash\\Base\\V1beta3\342\002\036Akash\\Base\\V1beta3\\GPBMetadata\352\002\024Akash::Base::V1beta3'
  _globals['_ENDPOINT'].fields_by_name['sequence_number']._options = None
  _globals['_ENDPOINT'].fields_by_name['sequence_number']._serialized_options = b'\342\336\037\016SequenceNumber\352\336\037\017sequence_number\362\336\037\026yaml:\"sequence_number\"'
  _globals['_ENDPOINT']._options = None
  _globals['_ENDPOINT']._serialized_options = b'\350\240\037\001'
  _globals['_ENDPOINT']._serialized_start=80
  _globals['_ENDPOINT']._serialized_end=314
  _globals['_ENDPOINT_KIND']._serialized_start=253
  _globals['_ENDPOINT_KIND']._serialized_end=308
# @@protoc_insertion_point(module_scope)
