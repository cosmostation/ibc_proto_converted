# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/permission/v1beta1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.crypto.multisig import keys_pb2 as cosmos_dot_crypto_dot_multisig_dot_keys__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%axelar/permission/v1beta1/query.proto\x12\x19\x61xelar.permission.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a!cosmos/crypto/multisig/keys.proto\"\x1b\n\x19QueryGovernanceKeyRequest\"t\n\x1aQueryGovernanceKeyResponse\x12V\n\x0egovernance_key\x18\x01 \x01(\x0b\x32).cosmos.crypto.multisig.LegacyAminoPubKeyB\x04\xc8\xde\x1f\x00R\rgovernanceKeyB\xec\x01\n\x1d\x63om.axelar.permission.v1beta1B\nQueryProtoZ7github.com/axelarnetwork/axelar-core/x/permission/types\xa2\x02\x03\x41PX\xaa\x02\x19\x41xelar.Permission.V1beta1\xca\x02\x19\x41xelar\\Permission\\V1beta1\xe2\x02%Axelar\\Permission\\V1beta1\\GPBMetadata\xea\x02\x1b\x41xelar::Permission::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.permission.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.axelar.permission.v1beta1B\nQueryProtoZ7github.com/axelarnetwork/axelar-core/x/permission/types\242\002\003APX\252\002\031Axelar.Permission.V1beta1\312\002\031Axelar\\Permission\\V1beta1\342\002%Axelar\\Permission\\V1beta1\\GPBMetadata\352\002\033Axelar::Permission::V1beta1\310\341\036\000'
  _globals['_QUERYGOVERNANCEKEYRESPONSE'].fields_by_name['governance_key']._options = None
  _globals['_QUERYGOVERNANCEKEYRESPONSE'].fields_by_name['governance_key']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYGOVERNANCEKEYREQUEST']._serialized_start=158
  _globals['_QUERYGOVERNANCEKEYREQUEST']._serialized_end=185
  _globals['_QUERYGOVERNANCEKEYRESPONSE']._serialized_start=187
  _globals['_QUERYGOVERNANCEKEYRESPONSE']._serialized_end=303
# @@protoc_insertion_point(module_scope)
