# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/locker/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from comdex.locker.v1beta1 import locker_pb2 as comdex_dot_locker_dot_v1beta1_dot_locker__pb2
from comdex.locker.v1beta1 import params_pb2 as comdex_dot_locker_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#comdex/locker/v1beta1/genesis.proto\x12\x15\x63omdex.locker.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\"comdex/locker/v1beta1/locker.proto\x1a\"comdex/locker/v1beta1/params.proto\"\x89\x06\n\x0cGenesisState\x12Z\n\x07lockers\x18\x01 \x03(\x0b\x32\x1d.comdex.locker.v1beta1.LockerB!\xc8\xde\x1f\x00\xe2\xde\x1f\x07Lockers\xf2\xde\x1f\x0eyaml:\"lockers\"R\x07lockers\x12\x98\x01\n\x19lockerProductAssetMapping\x18\x02 \x03(\x0b\x32\x30.comdex.locker.v1beta1.LockerProductAssetMappingB(\xc8\xde\x1f\x00\xf2\xde\x1f yaml:\"lockerProductAssetMapping\"R\x19lockerProductAssetMapping\x12\xb4\x01\n lockerTotalRewardsByAssetAppWise\x18\x03 \x03(\x0b\x32\x37.comdex.locker.v1beta1.LockerTotalRewardsByAssetAppWiseB/\xc8\xde\x1f\x00\xf2\xde\x1f\'yaml:\"lockerTotalRewardsByAssetAppWise\"R lockerTotalRewardsByAssetAppWise\x12|\n\x11lockerLookupTable\x18\x04 \x03(\x0b\x32,.comdex.locker.v1beta1.LockerLookupTableDataB \xc8\xde\x1f\x00\xf2\xde\x1f\x18yaml:\"lockerLookupTable\"R\x11lockerLookupTable\x12\x8f\x01\n\x16userLockerAssetMapping\x18\x05 \x03(\x0b\x32\x30.comdex.locker.v1beta1.UserAppAssetLockerMappingB%\xc8\xde\x1f\x00\xf2\xde\x1f\x1dyaml:\"userLockerAssetMapping\"R\x16userLockerAssetMapping\x12;\n\x06params\x18\x06 \x01(\x0b\x32\x1d.comdex.locker.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xd7\x01\n\x19\x63om.comdex.locker.v1beta1B\x0cGenesisProtoZ0github.com/comdex-official/comdex/x/locker/types\xa2\x02\x03\x43LX\xaa\x02\x15\x43omdex.Locker.V1beta1\xca\x02\x15\x43omdex\\Locker\\V1beta1\xe2\x02!Comdex\\Locker\\V1beta1\\GPBMetadata\xea\x02\x17\x43omdex::Locker::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.locker.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.comdex.locker.v1beta1B\014GenesisProtoZ0github.com/comdex-official/comdex/x/locker/types\242\002\003CLX\252\002\025Comdex.Locker.V1beta1\312\002\025Comdex\\Locker\\V1beta1\342\002!Comdex\\Locker\\V1beta1\\GPBMetadata\352\002\027Comdex::Locker::V1beta1\310\341\036\000\250\342\036\000'
  _globals['_GENESISSTATE'].fields_by_name['lockers']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lockers']._serialized_options = b'\310\336\037\000\342\336\037\007Lockers\362\336\037\016yaml:\"lockers\"'
  _globals['_GENESISSTATE'].fields_by_name['lockerProductAssetMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lockerProductAssetMapping']._serialized_options = b'\310\336\037\000\362\336\037 yaml:\"lockerProductAssetMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['lockerTotalRewardsByAssetAppWise']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lockerTotalRewardsByAssetAppWise']._serialized_options = b'\310\336\037\000\362\336\037\'yaml:\"lockerTotalRewardsByAssetAppWise\"'
  _globals['_GENESISSTATE'].fields_by_name['lockerLookupTable']._options = None
  _globals['_GENESISSTATE'].fields_by_name['lockerLookupTable']._serialized_options = b'\310\336\037\000\362\336\037\030yaml:\"lockerLookupTable\"'
  _globals['_GENESISSTATE'].fields_by_name['userLockerAssetMapping']._options = None
  _globals['_GENESISSTATE'].fields_by_name['userLockerAssetMapping']._serialized_options = b'\310\336\037\000\362\336\037\035yaml:\"userLockerAssetMapping\"'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=157
  _globals['_GENESISSTATE']._serialized_end=934
# @@protoc_insertion_point(module_scope)
