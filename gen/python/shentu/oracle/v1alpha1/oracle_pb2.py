# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/oracle/v1alpha1/oracle.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#shentu/oracle/v1alpha1/oracle.proto\x12\x16shentu.oracle.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/duration.proto\"\xeb\x01\n\x08Withdraw\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12t\n\x06\x61mount\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12\x31\n\tdue_block\x18\x03 \x01(\x03\x42\x14\xf2\xde\x1f\x10yaml:\"due_block\"R\x08\x64ueBlock:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xf4\x06\n\x04Task\x12/\n\x08\x63ontract\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"contract\"R\x08\x63ontract\x12/\n\x08\x66unction\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"function\"R\x08\x66unction\x12\x37\n\x0b\x62\x65gin_block\x18\x03 \x01(\x03\x42\x16\xf2\xde\x1f\x12yaml:\"begin_block\"R\nbeginBlock\x12t\n\x06\x62ounty\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"bounty\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x62ounty\x12\x38\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12Y\n\nexpiration\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"expiration\"\x90\xdf\x1f\x01R\nexpiration\x12,\n\x07\x63reator\x18\x07 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\x12\x65\n\tresponses\x18\x08 \x03(\x0b\x32 .shentu.oracle.v1alpha1.ResponseB%\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"responses\"\xaa\xdf\x1f\tResponsesR\tresponses\x12W\n\x06result\x18\t \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"result\"R\x06result\x12=\n\rexpire_height\x18\n \x01(\x03\x42\x18\xf2\xde\x1f\x14yaml:\"expire_height\"R\x0c\x65xpireHeight\x12@\n\x0ewaiting_blocks\x18\x0b \x01(\x03\x42\x19\xf2\xde\x1f\x15yaml:\"waiting_blocks\"R\rwaitingBlocks\x12M\n\x06status\x18\x0c \x01(\x0e\x32\".shentu.oracle.v1alpha1.TaskStatusB\x11\xf2\xde\x1f\ryaml:\"status\"R\x06status:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xea\x02\n\x08Response\x12/\n\x08operator\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"operator\"R\x08operator\x12T\n\x05score\x18\x02 \x01(\tB>\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0cyaml:\"score\"R\x05score\x12W\n\x06weight\x18\x03 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\ryaml:\"weight\"R\x06weight\x12t\n\x06reward\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"reward\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06reward:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xb8\x03\n\x08Operator\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12/\n\x08proposer\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"proposer\"R\x08proposer\x12\x80\x01\n\ncollateral\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBE\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"collateral\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\ncollateral\x12\x9a\x01\n\x13\x61\x63\x63umulated_rewards\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBN\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"accumulated_rewards\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x12\x61\x63\x63umulatedRewards\x12#\n\x04name\x18\x05 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x98\x06\n\nTaskParams\x12r\n\x13\x65xpiration_duration\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB&\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"expiration_duration\"\x98\xdf\x1f\x01R\x12\x65xpirationDuration\x12l\n\x12\x61ggregation_window\x18\x02 \x01(\x03\x42=\xea\xde\x1f\x1c\x61ggregation_window,omitempty\xf2\xde\x1f\x19yaml:\"aggregation_window\"R\x11\x61ggregationWindow\x12z\n\x12\x61ggregation_result\x18\x03 \x01(\tBK\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x19yaml:\"aggregation_result\"R\x11\x61ggregationResult\x12q\n\x0fthreshold_score\x18\x04 \x01(\tBH\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x16yaml:\"threshold_score\"R\x0ethresholdScore\x12]\n\x08\x65psilon1\x18\x05 \x01(\tBA\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0fyaml:\"epsilon1\"R\x08\x65psilon1\x12]\n\x08\x65psilon2\x18\x06 \x01(\tBA\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x0fyaml:\"epsilon2\"R\x08\x65psilon2\x12q\n\x0fshortcut_quorum\x18\x07 \x01(\x0c\x42H\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x16yaml:\"shortcut_quorum\"R\x0eshortcutQuorum:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xef\x01\n\x10LockedPoolParams\x12\x63\n\x10locked_in_blocks\x18\x01 \x01(\x03\x42\x39\xea\xde\x1f\x1alocked_in_blocks,omitempty\xf2\xde\x1f\x17yaml:\"locked_in_blocks\"R\x0elockedInBlocks\x12l\n\x12minimum_collateral\x18\x02 \x01(\x03\x42=\xea\xde\x1f\x1cminimum_collateral,omitempty\xf2\xde\x1f\x19yaml:\"minimum_collateral\"R\x11minimumCollateral:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"4\n\x06TaskID\x12 \n\x03tid\x18\x01 \x01(\x0c\x42\x0e\xf2\xde\x1f\nyaml:\"tid\"R\x03tid:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"J\n\x07TaskIDs\x12?\n\x08task_ids\x18\x01 \x03(\x0b\x32\x1e.shentu.oracle.v1alpha1.TaskIDB\x04\xc8\xde\x1f\x00R\x07taskIds\"\x80\x01\n\nCoinsProto\x12r\n\x05\x63oins\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x63oins\"\x82\x05\n\x06TxTask\x12.\n\x08\x61tx_hash\x18\x01 \x01(\x0c\x42\x13\xf2\xde\x1f\x0fyaml:\"atx_hash\"R\x07\x61txHash\x12,\n\x07\x63reator\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\x12t\n\x06\x62ounty\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"bounty\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x62ounty\x12X\n\nvalid_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"valid_time\"\x90\xdf\x1f\x01R\tvalidTime\x12Y\n\nexpiration\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"expiration\"\x90\xdf\x1f\x01R\nexpiration\x12\x65\n\tresponses\x18\x06 \x03(\x0b\x32 .shentu.oracle.v1alpha1.ResponseB%\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"responses\"\xaa\xdf\x1f\tResponsesR\tresponses\x12&\n\x05score\x18\x07 \x01(\x03\x42\x10\xf2\xde\x1f\x0cyaml:\"score\"R\x05score\x12M\n\x06status\x18\x08 \x01(\x0e\x32\".shentu.oracle.v1alpha1.TaskStatusB\x11\xf2\xde\x1f\ryaml:\"status\"R\x06status:\x11\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\xca\xb4-\x05TaskI*\xd4\x01\n\nTaskStatus\x12.\n\x17TASK_STATUS_UNSPECIFIED\x10\x00\x1a\x11\x8a\x9d \rTaskStatusNil\x12.\n\x13TASK_STATUS_PENDING\x10\x01\x1a\x15\x8a\x9d \x11TaskStatusPending\x12\x32\n\x15TASK_STATUS_SUCCEEDED\x10\x02\x1a\x17\x8a\x9d \x13TaskStatusSucceeded\x12,\n\x12TASK_STATUS_FAILED\x10\x03\x1a\x14\x8a\x9d \x10TaskStatusFailed\x1a\x04\x88\xa3\x1e\x00\x42\xd4\x01\n\x1a\x63om.shentu.oracle.v1alpha1B\x0bOracleProtoZ1github.com/shentufoundation/shentu/x/oracle/types\xa2\x02\x03SOX\xaa\x02\x16Shentu.Oracle.V1alpha1\xca\x02\x16Shentu\\Oracle\\V1alpha1\xe2\x02\"Shentu\\Oracle\\V1alpha1\\GPBMetadata\xea\x02\x18Shentu::Oracle::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.oracle.v1alpha1.oracle_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.shentu.oracle.v1alpha1B\013OracleProtoZ1github.com/shentufoundation/shentu/x/oracle/types\242\002\003SOX\252\002\026Shentu.Oracle.V1alpha1\312\002\026Shentu\\Oracle\\V1alpha1\342\002\"Shentu\\Oracle\\V1alpha1\\GPBMetadata\352\002\030Shentu::Oracle::V1alpha1'
  _globals['_TASKSTATUS']._options = None
  _globals['_TASKSTATUS']._serialized_options = b'\210\243\036\000'
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_UNSPECIFIED"]._options = None
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \rTaskStatusNil'
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_PENDING"]._options = None
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_PENDING"]._serialized_options = b'\212\235 \021TaskStatusPending'
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_SUCCEEDED"]._options = None
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_SUCCEEDED"]._serialized_options = b'\212\235 \023TaskStatusSucceeded'
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_FAILED"]._options = None
  _globals['_TASKSTATUS'].values_by_name["TASK_STATUS_FAILED"]._serialized_options = b'\212\235 \020TaskStatusFailed'
  _globals['_WITHDRAW'].fields_by_name['address']._options = None
  _globals['_WITHDRAW'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_WITHDRAW'].fields_by_name['amount']._options = None
  _globals['_WITHDRAW'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_WITHDRAW'].fields_by_name['due_block']._options = None
  _globals['_WITHDRAW'].fields_by_name['due_block']._serialized_options = b'\362\336\037\020yaml:\"due_block\"'
  _globals['_WITHDRAW']._options = None
  _globals['_WITHDRAW']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_TASK'].fields_by_name['contract']._options = None
  _globals['_TASK'].fields_by_name['contract']._serialized_options = b'\362\336\037\017yaml:\"contract\"'
  _globals['_TASK'].fields_by_name['function']._options = None
  _globals['_TASK'].fields_by_name['function']._serialized_options = b'\362\336\037\017yaml:\"function\"'
  _globals['_TASK'].fields_by_name['begin_block']._options = None
  _globals['_TASK'].fields_by_name['begin_block']._serialized_options = b'\362\336\037\022yaml:\"begin_block\"'
  _globals['_TASK'].fields_by_name['bounty']._options = None
  _globals['_TASK'].fields_by_name['bounty']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"bounty\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_TASK'].fields_by_name['description']._options = None
  _globals['_TASK'].fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _globals['_TASK'].fields_by_name['expiration']._options = None
  _globals['_TASK'].fields_by_name['expiration']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"expiration\"\220\337\037\001'
  _globals['_TASK'].fields_by_name['creator']._options = None
  _globals['_TASK'].fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _globals['_TASK'].fields_by_name['responses']._options = None
  _globals['_TASK'].fields_by_name['responses']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"responses\"\252\337\037\tResponses'
  _globals['_TASK'].fields_by_name['result']._options = None
  _globals['_TASK'].fields_by_name['result']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"result\"'
  _globals['_TASK'].fields_by_name['expire_height']._options = None
  _globals['_TASK'].fields_by_name['expire_height']._serialized_options = b'\362\336\037\024yaml:\"expire_height\"'
  _globals['_TASK'].fields_by_name['waiting_blocks']._options = None
  _globals['_TASK'].fields_by_name['waiting_blocks']._serialized_options = b'\362\336\037\025yaml:\"waiting_blocks\"'
  _globals['_TASK'].fields_by_name['status']._options = None
  _globals['_TASK'].fields_by_name['status']._serialized_options = b'\362\336\037\ryaml:\"status\"'
  _globals['_TASK']._options = None
  _globals['_TASK']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_RESPONSE'].fields_by_name['operator']._options = None
  _globals['_RESPONSE'].fields_by_name['operator']._serialized_options = b'\362\336\037\017yaml:\"operator\"'
  _globals['_RESPONSE'].fields_by_name['score']._options = None
  _globals['_RESPONSE'].fields_by_name['score']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\014yaml:\"score\"'
  _globals['_RESPONSE'].fields_by_name['weight']._options = None
  _globals['_RESPONSE'].fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\ryaml:\"weight\"'
  _globals['_RESPONSE'].fields_by_name['reward']._options = None
  _globals['_RESPONSE'].fields_by_name['reward']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"reward\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_RESPONSE']._options = None
  _globals['_RESPONSE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_OPERATOR'].fields_by_name['address']._options = None
  _globals['_OPERATOR'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_OPERATOR'].fields_by_name['proposer']._options = None
  _globals['_OPERATOR'].fields_by_name['proposer']._serialized_options = b'\362\336\037\017yaml:\"proposer\"'
  _globals['_OPERATOR'].fields_by_name['collateral']._options = None
  _globals['_OPERATOR'].fields_by_name['collateral']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"collateral\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_OPERATOR'].fields_by_name['accumulated_rewards']._options = None
  _globals['_OPERATOR'].fields_by_name['accumulated_rewards']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"accumulated_rewards\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_OPERATOR'].fields_by_name['name']._options = None
  _globals['_OPERATOR'].fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _globals['_OPERATOR']._options = None
  _globals['_OPERATOR']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_TASKPARAMS'].fields_by_name['expiration_duration']._options = None
  _globals['_TASKPARAMS'].fields_by_name['expiration_duration']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"expiration_duration\"\230\337\037\001'
  _globals['_TASKPARAMS'].fields_by_name['aggregation_window']._options = None
  _globals['_TASKPARAMS'].fields_by_name['aggregation_window']._serialized_options = b'\352\336\037\034aggregation_window,omitempty\362\336\037\031yaml:\"aggregation_window\"'
  _globals['_TASKPARAMS'].fields_by_name['aggregation_result']._options = None
  _globals['_TASKPARAMS'].fields_by_name['aggregation_result']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\031yaml:\"aggregation_result\"'
  _globals['_TASKPARAMS'].fields_by_name['threshold_score']._options = None
  _globals['_TASKPARAMS'].fields_by_name['threshold_score']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\026yaml:\"threshold_score\"'
  _globals['_TASKPARAMS'].fields_by_name['epsilon1']._options = None
  _globals['_TASKPARAMS'].fields_by_name['epsilon1']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\017yaml:\"epsilon1\"'
  _globals['_TASKPARAMS'].fields_by_name['epsilon2']._options = None
  _globals['_TASKPARAMS'].fields_by_name['epsilon2']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\017yaml:\"epsilon2\"'
  _globals['_TASKPARAMS'].fields_by_name['shortcut_quorum']._options = None
  _globals['_TASKPARAMS'].fields_by_name['shortcut_quorum']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\026yaml:\"shortcut_quorum\"'
  _globals['_TASKPARAMS']._options = None
  _globals['_TASKPARAMS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_LOCKEDPOOLPARAMS'].fields_by_name['locked_in_blocks']._options = None
  _globals['_LOCKEDPOOLPARAMS'].fields_by_name['locked_in_blocks']._serialized_options = b'\352\336\037\032locked_in_blocks,omitempty\362\336\037\027yaml:\"locked_in_blocks\"'
  _globals['_LOCKEDPOOLPARAMS'].fields_by_name['minimum_collateral']._options = None
  _globals['_LOCKEDPOOLPARAMS'].fields_by_name['minimum_collateral']._serialized_options = b'\352\336\037\034minimum_collateral,omitempty\362\336\037\031yaml:\"minimum_collateral\"'
  _globals['_LOCKEDPOOLPARAMS']._options = None
  _globals['_LOCKEDPOOLPARAMS']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_TASKID'].fields_by_name['tid']._options = None
  _globals['_TASKID'].fields_by_name['tid']._serialized_options = b'\362\336\037\nyaml:\"tid\"'
  _globals['_TASKID']._options = None
  _globals['_TASKID']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_TASKIDS'].fields_by_name['task_ids']._options = None
  _globals['_TASKIDS'].fields_by_name['task_ids']._serialized_options = b'\310\336\037\000'
  _globals['_COINSPROTO'].fields_by_name['coins']._options = None
  _globals['_COINSPROTO'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_TXTASK'].fields_by_name['atx_hash']._options = None
  _globals['_TXTASK'].fields_by_name['atx_hash']._serialized_options = b'\362\336\037\017yaml:\"atx_hash\"'
  _globals['_TXTASK'].fields_by_name['creator']._options = None
  _globals['_TXTASK'].fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _globals['_TXTASK'].fields_by_name['bounty']._options = None
  _globals['_TXTASK'].fields_by_name['bounty']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"bounty\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_TXTASK'].fields_by_name['valid_time']._options = None
  _globals['_TXTASK'].fields_by_name['valid_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"valid_time\"\220\337\037\001'
  _globals['_TXTASK'].fields_by_name['expiration']._options = None
  _globals['_TXTASK'].fields_by_name['expiration']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"expiration\"\220\337\037\001'
  _globals['_TXTASK'].fields_by_name['responses']._options = None
  _globals['_TXTASK'].fields_by_name['responses']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"responses\"\252\337\037\tResponses'
  _globals['_TXTASK'].fields_by_name['score']._options = None
  _globals['_TXTASK'].fields_by_name['score']._serialized_options = b'\362\336\037\014yaml:\"score\"'
  _globals['_TXTASK'].fields_by_name['status']._options = None
  _globals['_TXTASK'].fields_by_name['status']._serialized_options = b'\362\336\037\ryaml:\"status\"'
  _globals['_TXTASK']._options = None
  _globals['_TXTASK']._serialized_options = b'\210\240\037\000\350\240\037\000\312\264-\005TaskI'
  _globals['_TASKSTATUS']._serialized_start=4086
  _globals['_TASKSTATUS']._serialized_end=4298
  _globals['_WITHDRAW']._serialized_start=210
  _globals['_WITHDRAW']._serialized_end=445
  _globals['_TASK']._serialized_start=448
  _globals['_TASK']._serialized_end=1332
  _globals['_RESPONSE']._serialized_start=1335
  _globals['_RESPONSE']._serialized_end=1697
  _globals['_OPERATOR']._serialized_start=1700
  _globals['_OPERATOR']._serialized_end=2140
  _globals['_TASKPARAMS']._serialized_start=2143
  _globals['_TASKPARAMS']._serialized_end=2935
  _globals['_LOCKEDPOOLPARAMS']._serialized_start=2938
  _globals['_LOCKEDPOOLPARAMS']._serialized_end=3177
  _globals['_TASKID']._serialized_start=3179
  _globals['_TASKID']._serialized_end=3231
  _globals['_TASKIDS']._serialized_start=3233
  _globals['_TASKIDS']._serialized_end=3307
  _globals['_COINSPROTO']._serialized_start=3310
  _globals['_COINSPROTO']._serialized_end=3438
  _globals['_TXTASK']._serialized_start=3441
  _globals['_TXTASK']._serialized_end=4083
# @@protoc_insertion_point(module_scope)
