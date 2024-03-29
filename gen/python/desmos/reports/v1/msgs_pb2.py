# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/reports/v1/msgs.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from desmos.reports.v1 import models_pb2 as desmos_dot_reports_dot_v1_dot_models__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x64\x65smos/reports/v1/msgs.proto\x12\x11\x64\x65smos.reports.v1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x1e\x64\x65smos/reports/v1/models.proto\"\xe1\x02\n\x0fMsgCreateReport\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x45\n\x0breasons_ids\x18\x02 \x03(\rB$\xe2\xde\x1f\nReasonsIDs\xf2\xde\x1f\x12yaml:\"reasons_ids\"R\nreasonsIds\x12,\n\x07message\x18\x03 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"message\"R\x07message\x12/\n\x08reporter\x18\x04 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"reporter\"R\x08reporter\x12\x61\n\x06target\x18\x05 \x01(\x0b\x32\x14.google.protobuf.AnyB3\xf2\xde\x1f\ryaml:\"target\"\xca\xb4-\x1e\x64\x65smos.reports.v1.ReportTargetR\x06target\"\xbb\x01\n\x17MsgCreateReportResponse\x12=\n\treport_id\x18\x01 \x01(\x04\x42 \xe2\xde\x1f\x08ReportID\xf2\xde\x1f\x10yaml:\"report_id\"R\x08reportId\x12\x61\n\rcreation_date\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"creation_date\"\x90\xdf\x1f\x01R\x0c\x63reationDate\"\xc2\x01\n\x0fMsgDeleteReport\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12=\n\treport_id\x18\x02 \x01(\x04\x42 \xe2\xde\x1f\x08ReportID\xf2\xde\x1f\x10yaml:\"report_id\"R\x08reportId\x12)\n\x06signer\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x19\n\x17MsgDeleteReportResponse\"\xed\x01\n\x18MsgSupportStandardReason\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12_\n\x12standard_reason_id\x18\x02 \x01(\rB1\xe2\xde\x1f\x10StandardReasonID\xf2\xde\x1f\x19yaml:\"standard_reason_id\"R\x10standardReasonId\x12)\n\x06signer\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"h\n MsgSupportStandardReasonResponse\x12\x44\n\x0breasons_ids\x18\x01 \x01(\rB#\xe2\xde\x1f\tReasonsID\xf2\xde\x1f\x12yaml:\"reasons_ids\"R\nreasonsIds\"\xe2\x01\n\x0cMsgAddReason\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12&\n\x05title\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"title\"R\x05title\x12\x38\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"U\n\x14MsgAddReasonResponse\x12=\n\treason_id\x18\x01 \x01(\rB \xe2\xde\x1f\x08ReasonID\xf2\xde\x1f\x10yaml:\"reason_id\"R\x08reasonId\"\xc2\x01\n\x0fMsgRemoveReason\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12=\n\treason_id\x18\x02 \x01(\rB \xe2\xde\x1f\x08ReasonID\xf2\xde\x1f\x10yaml:\"reason_id\"R\x08reasonId\x12)\n\x06signer\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x19\n\x17MsgRemoveReasonResponse\"\x92\x01\n\x0fMsgUpdateParams\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x37\n\x06params\x18\x02 \x01(\x0b\x32\x19.desmos.reports.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params:\x0e\x82\xe7\xb0*\tauthority\"\x19\n\x17MsgUpdateParamsResponse2\xde\x04\n\x03Msg\x12^\n\x0c\x43reateReport\x12\".desmos.reports.v1.MsgCreateReport\x1a*.desmos.reports.v1.MsgCreateReportResponse\x12^\n\x0c\x44\x65leteReport\x12\".desmos.reports.v1.MsgDeleteReport\x1a*.desmos.reports.v1.MsgDeleteReportResponse\x12y\n\x15SupportStandardReason\x12+.desmos.reports.v1.MsgSupportStandardReason\x1a\x33.desmos.reports.v1.MsgSupportStandardReasonResponse\x12U\n\tAddReason\x12\x1f.desmos.reports.v1.MsgAddReason\x1a\'.desmos.reports.v1.MsgAddReasonResponse\x12^\n\x0cRemoveReason\x12\".desmos.reports.v1.MsgRemoveReason\x1a*.desmos.reports.v1.MsgRemoveReasonResponse\x12^\n\x0cUpdateParams\x12\".desmos.reports.v1.MsgUpdateParams\x1a*.desmos.reports.v1.MsgUpdateParamsResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xb8\x01\n\x15\x63om.desmos.reports.v1B\tMsgsProtoZ0github.com/desmos-labs/desmos/v5/x/reports/types\xa2\x02\x03\x44RX\xaa\x02\x11\x44\x65smos.Reports.V1\xca\x02\x11\x44\x65smos\\Reports\\V1\xe2\x02\x1d\x44\x65smos\\Reports\\V1\\GPBMetadata\xea\x02\x13\x44\x65smos::Reports::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.reports.v1.msgs_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.desmos.reports.v1B\tMsgsProtoZ0github.com/desmos-labs/desmos/v5/x/reports/types\242\002\003DRX\252\002\021Desmos.Reports.V1\312\002\021Desmos\\Reports\\V1\342\002\035Desmos\\Reports\\V1\\GPBMetadata\352\002\023Desmos::Reports::V1'
  _globals['_MSGCREATEREPORT'].fields_by_name['subspace_id']._options = None
  _globals['_MSGCREATEREPORT'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _globals['_MSGCREATEREPORT'].fields_by_name['reasons_ids']._options = None
  _globals['_MSGCREATEREPORT'].fields_by_name['reasons_ids']._serialized_options = b'\342\336\037\nReasonsIDs\362\336\037\022yaml:\"reasons_ids\"'
  _globals['_MSGCREATEREPORT'].fields_by_name['message']._options = None
  _globals['_MSGCREATEREPORT'].fields_by_name['message']._serialized_options = b'\362\336\037\016yaml:\"message\"'
  _globals['_MSGCREATEREPORT'].fields_by_name['reporter']._options = None
  _globals['_MSGCREATEREPORT'].fields_by_name['reporter']._serialized_options = b'\362\336\037\017yaml:\"reporter\"'
  _globals['_MSGCREATEREPORT'].fields_by_name['target']._options = None
  _globals['_MSGCREATEREPORT'].fields_by_name['target']._serialized_options = b'\362\336\037\ryaml:\"target\"\312\264-\036desmos.reports.v1.ReportTarget'
  _globals['_MSGCREATEREPORTRESPONSE'].fields_by_name['report_id']._options = None
  _globals['_MSGCREATEREPORTRESPONSE'].fields_by_name['report_id']._serialized_options = b'\342\336\037\010ReportID\362\336\037\020yaml:\"report_id\"'
  _globals['_MSGCREATEREPORTRESPONSE'].fields_by_name['creation_date']._options = None
  _globals['_MSGCREATEREPORTRESPONSE'].fields_by_name['creation_date']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"creation_date\"\220\337\037\001'
  _globals['_MSGDELETEREPORT'].fields_by_name['subspace_id']._options = None
  _globals['_MSGDELETEREPORT'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _globals['_MSGDELETEREPORT'].fields_by_name['report_id']._options = None
  _globals['_MSGDELETEREPORT'].fields_by_name['report_id']._serialized_options = b'\342\336\037\010ReportID\362\336\037\020yaml:\"report_id\"'
  _globals['_MSGDELETEREPORT'].fields_by_name['signer']._options = None
  _globals['_MSGDELETEREPORT'].fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['subspace_id']._options = None
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['standard_reason_id']._options = None
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['standard_reason_id']._serialized_options = b'\342\336\037\020StandardReasonID\362\336\037\031yaml:\"standard_reason_id\"'
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['signer']._options = None
  _globals['_MSGSUPPORTSTANDARDREASON'].fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _globals['_MSGSUPPORTSTANDARDREASONRESPONSE'].fields_by_name['reasons_ids']._options = None
  _globals['_MSGSUPPORTSTANDARDREASONRESPONSE'].fields_by_name['reasons_ids']._serialized_options = b'\342\336\037\tReasonsID\362\336\037\022yaml:\"reasons_ids\"'
  _globals['_MSGADDREASON'].fields_by_name['subspace_id']._options = None
  _globals['_MSGADDREASON'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _globals['_MSGADDREASON'].fields_by_name['title']._options = None
  _globals['_MSGADDREASON'].fields_by_name['title']._serialized_options = b'\362\336\037\014yaml:\"title\"'
  _globals['_MSGADDREASON'].fields_by_name['description']._options = None
  _globals['_MSGADDREASON'].fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _globals['_MSGADDREASON'].fields_by_name['signer']._options = None
  _globals['_MSGADDREASON'].fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _globals['_MSGADDREASONRESPONSE'].fields_by_name['reason_id']._options = None
  _globals['_MSGADDREASONRESPONSE'].fields_by_name['reason_id']._serialized_options = b'\342\336\037\010ReasonID\362\336\037\020yaml:\"reason_id\"'
  _globals['_MSGREMOVEREASON'].fields_by_name['subspace_id']._options = None
  _globals['_MSGREMOVEREASON'].fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _globals['_MSGREMOVEREASON'].fields_by_name['reason_id']._options = None
  _globals['_MSGREMOVEREASON'].fields_by_name['reason_id']._serialized_options = b'\342\336\037\010ReasonID\362\336\037\020yaml:\"reason_id\"'
  _globals['_MSGREMOVEREASON'].fields_by_name['signer']._options = None
  _globals['_MSGREMOVEREASON'].fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._options = None
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGUPDATEPARAMS'].fields_by_name['params']._options = None
  _globals['_MSGUPDATEPARAMS'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_MSGUPDATEPARAMS']._options = None
  _globals['_MSGUPDATEPARAMS']._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSG']._options = None
  _globals['_MSG']._serialized_options = b'\200\347\260*\001'
  _globals['_MSGCREATEREPORT']._serialized_start=218
  _globals['_MSGCREATEREPORT']._serialized_end=571
  _globals['_MSGCREATEREPORTRESPONSE']._serialized_start=574
  _globals['_MSGCREATEREPORTRESPONSE']._serialized_end=761
  _globals['_MSGDELETEREPORT']._serialized_start=764
  _globals['_MSGDELETEREPORT']._serialized_end=958
  _globals['_MSGDELETEREPORTRESPONSE']._serialized_start=960
  _globals['_MSGDELETEREPORTRESPONSE']._serialized_end=985
  _globals['_MSGSUPPORTSTANDARDREASON']._serialized_start=988
  _globals['_MSGSUPPORTSTANDARDREASON']._serialized_end=1225
  _globals['_MSGSUPPORTSTANDARDREASONRESPONSE']._serialized_start=1227
  _globals['_MSGSUPPORTSTANDARDREASONRESPONSE']._serialized_end=1331
  _globals['_MSGADDREASON']._serialized_start=1334
  _globals['_MSGADDREASON']._serialized_end=1560
  _globals['_MSGADDREASONRESPONSE']._serialized_start=1562
  _globals['_MSGADDREASONRESPONSE']._serialized_end=1647
  _globals['_MSGREMOVEREASON']._serialized_start=1650
  _globals['_MSGREMOVEREASON']._serialized_end=1844
  _globals['_MSGREMOVEREASONRESPONSE']._serialized_start=1846
  _globals['_MSGREMOVEREASONRESPONSE']._serialized_end=1871
  _globals['_MSGUPDATEPARAMS']._serialized_start=1874
  _globals['_MSGUPDATEPARAMS']._serialized_end=2020
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=2022
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=2047
  _globals['_MSG']._serialized_start=2050
  _globals['_MSG']._serialized_end=2656
# @@protoc_insertion_point(module_scope)
