# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta3/groupmsg.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.deployment.v1beta3 import groupid_pb2 as akash_dot_deployment_dot_v1beta3_dot_groupid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'akash/deployment/v1beta3/groupmsg.proto\x12\x18\x61kash.deployment.v1beta3\x1a\x14gogoproto/gogo.proto\x1a&akash/deployment/v1beta3/groupid.proto\"g\n\rMsgCloseGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta3.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgCloseGroupResponse\"g\n\rMsgPauseGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta3.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgPauseGroupResponse\"g\n\rMsgStartGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta3.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgStartGroupResponseB\xec\x01\n\x1c\x63om.akash.deployment.v1beta3B\rGroupmsgProtoZ=github.com/akash-network/akash-api/go/node/deployment/v1beta3\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta3\xca\x02\x18\x41kash\\Deployment\\V1beta3\xe2\x02$Akash\\Deployment\\V1beta3\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta3.groupmsg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.akash.deployment.v1beta3B\rGroupmsgProtoZ=github.com/akash-network/akash-api/go/node/deployment/v1beta3\242\002\003ADX\252\002\030Akash.Deployment.V1beta3\312\002\030Akash\\Deployment\\V1beta3\342\002$Akash\\Deployment\\V1beta3\\GPBMetadata\352\002\032Akash::Deployment::V1beta3'
  _globals['_MSGCLOSEGROUP'].fields_by_name['id']._options = None
  _globals['_MSGCLOSEGROUP'].fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _globals['_MSGCLOSEGROUP']._options = None
  _globals['_MSGCLOSEGROUP']._serialized_options = b'\350\240\037\000'
  _globals['_MSGPAUSEGROUP'].fields_by_name['id']._options = None
  _globals['_MSGPAUSEGROUP'].fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _globals['_MSGPAUSEGROUP']._options = None
  _globals['_MSGPAUSEGROUP']._serialized_options = b'\350\240\037\000'
  _globals['_MSGSTARTGROUP'].fields_by_name['id']._options = None
  _globals['_MSGSTARTGROUP'].fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _globals['_MSGSTARTGROUP']._options = None
  _globals['_MSGSTARTGROUP']._serialized_options = b'\350\240\037\000'
  _globals['_MSGCLOSEGROUP']._serialized_start=131
  _globals['_MSGCLOSEGROUP']._serialized_end=234
  _globals['_MSGCLOSEGROUPRESPONSE']._serialized_start=236
  _globals['_MSGCLOSEGROUPRESPONSE']._serialized_end=259
  _globals['_MSGPAUSEGROUP']._serialized_start=261
  _globals['_MSGPAUSEGROUP']._serialized_end=364
  _globals['_MSGPAUSEGROUPRESPONSE']._serialized_start=366
  _globals['_MSGPAUSEGROUPRESPONSE']._serialized_end=389
  _globals['_MSGSTARTGROUP']._serialized_start=391
  _globals['_MSGSTARTGROUP']._serialized_end=494
  _globals['_MSGSTARTGROUPRESPONSE']._serialized_start=496
  _globals['_MSGSTARTGROUPRESPONSE']._serialized_end=519
# @@protoc_insertion_point(module_scope)
