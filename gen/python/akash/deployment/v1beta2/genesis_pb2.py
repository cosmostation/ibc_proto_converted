# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta2/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.deployment.v1beta2 import deployment_pb2 as akash_dot_deployment_dot_v1beta2_dot_deployment__pb2
from akash.deployment.v1beta2 import group_pb2 as akash_dot_deployment_dot_v1beta2_dot_group__pb2
from akash.deployment.v1beta2 import params_pb2 as akash_dot_deployment_dot_v1beta2_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&akash/deployment/v1beta2/genesis.proto\x12\x18\x61kash.deployment.v1beta2\x1a\x14gogoproto/gogo.proto\x1a)akash/deployment/v1beta2/deployment.proto\x1a$akash/deployment/v1beta2/group.proto\x1a%akash/deployment/v1beta2/params.proto\"\xdc\x01\n\x11GenesisDeployment\x12m\n\ndeployment\x18\x01 \x01(\x0b\x32$.akash.deployment.v1beta2.DeploymentB\'\xc8\xde\x1f\x00\xea\xde\x1f\ndeployment\xf2\xde\x1f\x11yaml:\"deployment\"R\ndeployment\x12X\n\x06groups\x18\x02 \x03(\x0b\x32\x1f.akash.deployment.v1beta2.GroupB\x1f\xc8\xde\x1f\x00\xea\xde\x1f\x06groups\xf2\xde\x1f\ryaml:\"groups\"R\x06groups\"\xe3\x01\n\x0cGenesisState\x12x\n\x0b\x64\x65ployments\x18\x01 \x03(\x0b\x32+.akash.deployment.v1beta2.GenesisDeploymentB)\xc8\xde\x1f\x00\xea\xde\x1f\x0b\x64\x65ployments\xf2\xde\x1f\x12yaml:\"deployments\"R\x0b\x64\x65ployments\x12Y\n\x06params\x18\x02 \x01(\x0b\x32 .akash.deployment.v1beta2.ParamsB\x1f\xc8\xde\x1f\x00\xea\xde\x1f\x06params\xf2\xde\x1f\ryaml:\"params\"R\x06paramsB\xeb\x01\n\x1c\x63om.akash.deployment.v1beta2B\x0cGenesisProtoZ=github.com/akash-network/akash-api/go/node/deployment/v1beta2\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta2\xca\x02\x18\x41kash\\Deployment\\V1beta2\xe2\x02$Akash\\Deployment\\V1beta2\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta2.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.akash.deployment.v1beta2B\014GenesisProtoZ=github.com/akash-network/akash-api/go/node/deployment/v1beta2\242\002\003ADX\252\002\030Akash.Deployment.V1beta2\312\002\030Akash\\Deployment\\V1beta2\342\002$Akash\\Deployment\\V1beta2\\GPBMetadata\352\002\032Akash::Deployment::V1beta2'
  _globals['_GENESISDEPLOYMENT'].fields_by_name['deployment']._options = None
  _globals['_GENESISDEPLOYMENT'].fields_by_name['deployment']._serialized_options = b'\310\336\037\000\352\336\037\ndeployment\362\336\037\021yaml:\"deployment\"'
  _globals['_GENESISDEPLOYMENT'].fields_by_name['groups']._options = None
  _globals['_GENESISDEPLOYMENT'].fields_by_name['groups']._serialized_options = b'\310\336\037\000\352\336\037\006groups\362\336\037\ryaml:\"groups\"'
  _globals['_GENESISSTATE'].fields_by_name['deployments']._options = None
  _globals['_GENESISSTATE'].fields_by_name['deployments']._serialized_options = b'\310\336\037\000\352\336\037\013deployments\362\336\037\022yaml:\"deployments\"'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000\352\336\037\006params\362\336\037\ryaml:\"params\"'
  _globals['_GENESISDEPLOYMENT']._serialized_start=211
  _globals['_GENESISDEPLOYMENT']._serialized_end=431
  _globals['_GENESISSTATE']._serialized_start=434
  _globals['_GENESISSTATE']._serialized_end=661
# @@protoc_insertion_point(module_scope)
