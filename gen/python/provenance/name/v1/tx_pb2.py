# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/name/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from provenance.name.v1 import name_pb2 as provenance_dot_name_dot_v1_dot_name__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bprovenance/name/v1/tx.proto\x12\x12provenance.name.v1\x1a\x14gogoproto/gogo.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1dprovenance/name/v1/name.proto\"\x9a\x01\n\x12MsgBindNameRequest\x12<\n\x06parent\x18\x01 \x01(\x0b\x32\x1e.provenance.name.v1.NameRecordB\x04\xc8\xde\x1f\x00R\x06parent\x12<\n\x06record\x18\x02 \x01(\x0b\x32\x1e.provenance.name.v1.NameRecordB\x04\xc8\xde\x1f\x00R\x06record:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x15\n\x13MsgBindNameResponse\"^\n\x14MsgDeleteNameRequest\x12<\n\x06record\x18\x01 \x01(\x0b\x32\x1e.provenance.name.v1.NameRecordB\x04\xc8\xde\x1f\x00R\x06record:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x17\n\x15MsgDeleteNameResponse\"\x9a\x01\n\x18MsgCreateRootNameRequest\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x36\n\x06record\x18\x02 \x01(\x0b\x32\x1e.provenance.name.v1.NameRecordR\x06record:\x0e\x82\xe7\xb0*\tauthority\"\x1b\n\x19MsgCreateRootNameResponse\"\x9c\x01\n\x14MsgModifyNameRequest\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12<\n\x06record\x18\x02 \x01(\x0b\x32\x1e.provenance.name.v1.NameRecordB\x04\xc8\xde\x1f\x00R\x06record:\x0e\x82\xe7\xb0*\tauthority\"\x17\n\x15MsgModifyNameResponse2\x97\x03\n\x03Msg\x12[\n\x08\x42indName\x12&.provenance.name.v1.MsgBindNameRequest\x1a\'.provenance.name.v1.MsgBindNameResponse\x12\x61\n\nDeleteName\x12(.provenance.name.v1.MsgDeleteNameRequest\x1a).provenance.name.v1.MsgDeleteNameResponse\x12\x61\n\nModifyName\x12(.provenance.name.v1.MsgModifyNameRequest\x1a).provenance.name.v1.MsgModifyNameResponse\x12m\n\x0e\x43reateRootName\x12,.provenance.name.v1.MsgCreateRootNameRequest\x1a-.provenance.name.v1.MsgCreateRootNameResponseB\xbd\x01\n\x16\x63om.provenance.name.v1B\x07TxProtoP\x01Z0github.com/provenance-io/provenance/x/name/types\xa2\x02\x03PNX\xaa\x02\x12Provenance.Name.V1\xca\x02\x12Provenance\\Name\\V1\xe2\x02\x1eProvenance\\Name\\V1\\GPBMetadata\xea\x02\x14Provenance::Name::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.name.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.provenance.name.v1B\007TxProtoP\001Z0github.com/provenance-io/provenance/x/name/types\242\002\003PNX\252\002\022Provenance.Name.V1\312\002\022Provenance\\Name\\V1\342\002\036Provenance\\Name\\V1\\GPBMetadata\352\002\024Provenance::Name::V1'
  _MSGBINDNAMEREQUEST.fields_by_name['parent']._options = None
  _MSGBINDNAMEREQUEST.fields_by_name['parent']._serialized_options = b'\310\336\037\000'
  _MSGBINDNAMEREQUEST.fields_by_name['record']._options = None
  _MSGBINDNAMEREQUEST.fields_by_name['record']._serialized_options = b'\310\336\037\000'
  _MSGBINDNAMEREQUEST._options = None
  _MSGBINDNAMEREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGDELETENAMEREQUEST.fields_by_name['record']._options = None
  _MSGDELETENAMEREQUEST.fields_by_name['record']._serialized_options = b'\310\336\037\000'
  _MSGDELETENAMEREQUEST._options = None
  _MSGDELETENAMEREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSGCREATEROOTNAMEREQUEST.fields_by_name['authority']._options = None
  _MSGCREATEROOTNAMEREQUEST.fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGCREATEROOTNAMEREQUEST._options = None
  _MSGCREATEROOTNAMEREQUEST._serialized_options = b'\202\347\260*\tauthority'
  _MSGMODIFYNAMEREQUEST.fields_by_name['authority']._options = None
  _MSGMODIFYNAMEREQUEST.fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGMODIFYNAMEREQUEST.fields_by_name['record']._options = None
  _MSGMODIFYNAMEREQUEST.fields_by_name['record']._serialized_options = b'\310\336\037\000'
  _MSGMODIFYNAMEREQUEST._options = None
  _MSGMODIFYNAMEREQUEST._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSGBINDNAMEREQUEST']._serialized_start=157
  _globals['_MSGBINDNAMEREQUEST']._serialized_end=311
  _globals['_MSGBINDNAMERESPONSE']._serialized_start=313
  _globals['_MSGBINDNAMERESPONSE']._serialized_end=334
  _globals['_MSGDELETENAMEREQUEST']._serialized_start=336
  _globals['_MSGDELETENAMEREQUEST']._serialized_end=430
  _globals['_MSGDELETENAMERESPONSE']._serialized_start=432
  _globals['_MSGDELETENAMERESPONSE']._serialized_end=455
  _globals['_MSGCREATEROOTNAMEREQUEST']._serialized_start=458
  _globals['_MSGCREATEROOTNAMEREQUEST']._serialized_end=612
  _globals['_MSGCREATEROOTNAMERESPONSE']._serialized_start=614
  _globals['_MSGCREATEROOTNAMERESPONSE']._serialized_end=641
  _globals['_MSGMODIFYNAMEREQUEST']._serialized_start=644
  _globals['_MSGMODIFYNAMEREQUEST']._serialized_end=800
  _globals['_MSGMODIFYNAMERESPONSE']._serialized_start=802
  _globals['_MSGMODIFYNAMERESPONSE']._serialized_end=825
  _globals['_MSG']._serialized_start=828
  _globals['_MSG']._serialized_end=1235
# @@protoc_insertion_point(module_scope)