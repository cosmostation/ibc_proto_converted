# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/records/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from stride.records import genesis_pb2 as stride_dot_records_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1astride/records/query.proto\x12\x0estride.records\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1cstride/records/genesis.proto\"\x14\n\x12QueryParamsRequest\"K\n\x13QueryParamsResponse\x12\x34\n\x06params\x18\x01 \x01(\x0b\x32\x16.stride.records.ParamsB\x04\xc8\xde\x1f\x00R\x06params\".\n\x1cQueryGetDepositRecordRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"k\n\x1dQueryGetDepositRecordResponse\x12J\n\x0e\x64\x65posit_record\x18\x01 \x01(\x0b\x32\x1d.stride.records.DepositRecordB\x04\xc8\xde\x1f\x00R\rdepositRecord\"f\n\x1cQueryAllDepositRecordRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xb4\x01\n\x1dQueryAllDepositRecordResponse\x12J\n\x0e\x64\x65posit_record\x18\x01 \x03(\x0b\x32\x1d.stride.records.DepositRecordB\x04\xc8\xde\x1f\x00R\rdepositRecord\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"C\n\x1fQueryDepositRecordByHostRequest\x12 \n\x0chost_zone_id\x18\x01 \x01(\tR\nhostZoneId\"n\n QueryDepositRecordByHostResponse\x12J\n\x0e\x64\x65posit_record\x18\x01 \x03(\x0b\x32\x1d.stride.records.DepositRecordB\x04\xc8\xde\x1f\x00R\rdepositRecord\"5\n#QueryGetUserRedemptionRecordRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\"\x88\x01\n$QueryGetUserRedemptionRecordResponse\x12`\n\x16user_redemption_record\x18\x01 \x01(\x0b\x32$.stride.records.UserRedemptionRecordB\x04\xc8\xde\x1f\x00R\x14userRedemptionRecord\"m\n#QueryAllUserRedemptionRecordRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xd1\x01\n$QueryAllUserRedemptionRecordResponse\x12`\n\x16user_redemption_record\x18\x01 \x03(\x0b\x32$.stride.records.UserRedemptionRecordB\x04\xc8\xde\x1f\x00R\x14userRedemptionRecord\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xd1\x01\n*QueryAllUserRedemptionRecordForUserRequest\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12\x10\n\x03\x64\x61y\x18\x02 \x01(\x04R\x03\x64\x61y\x12\x18\n\x07\x61\x64\x64ress\x18\x03 \x01(\tR\x07\x61\x64\x64ress\x12\x14\n\x05limit\x18\x04 \x01(\x04R\x05limit\x12\x46\n\npagination\x18\x05 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xd8\x01\n+QueryAllUserRedemptionRecordForUserResponse\x12`\n\x16user_redemption_record\x18\x01 \x03(\x0b\x32$.stride.records.UserRedemptionRecordB\x04\xc8\xde\x1f\x00R\x14userRedemptionRecord\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"H\n#QueryGetEpochUnbondingRecordRequest\x12!\n\x0c\x65poch_number\x18\x01 \x01(\x04R\x0b\x65pochNumber\"\x88\x01\n$QueryGetEpochUnbondingRecordResponse\x12`\n\x16\x65poch_unbonding_record\x18\x01 \x01(\x0b\x32$.stride.records.EpochUnbondingRecordB\x04\xc8\xde\x1f\x00R\x14\x65pochUnbondingRecord\"m\n#QueryAllEpochUnbondingRecordRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xd1\x01\n$QueryAllEpochUnbondingRecordResponse\x12`\n\x16\x65poch_unbonding_record\x18\x01 \x03(\x0b\x32$.stride.records.EpochUnbondingRecordB\x04\xc8\xde\x1f\x00R\x14\x65pochUnbondingRecord\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xb9\r\n\x05Query\x12|\n\x06Params\x12\".stride.records.QueryParamsRequest\x1a#.stride.records.QueryParamsResponse\")\x82\xd3\xe4\x93\x02#\x12!/StrideLabs/stride/records/params\x12\xc2\x01\n\x14UserRedemptionRecord\x12\x33.stride.records.QueryGetUserRedemptionRecordRequest\x1a\x34.stride.records.QueryGetUserRedemptionRecordResponse\"?\x82\xd3\xe4\x93\x02\x39\x12\x37/Stride-Labs/stride/records/user_redemption_record/{id}\x12\xc0\x01\n\x17UserRedemptionRecordAll\x12\x33.stride.records.QueryAllUserRedemptionRecordRequest\x1a\x34.stride.records.QueryAllUserRedemptionRecordResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/Stride-Labs/stride/records/user_redemption_record\x12\xfe\x01\n\x1bUserRedemptionRecordForUser\x12:.stride.records.QueryAllUserRedemptionRecordForUserRequest\x1a;.stride.records.QueryAllUserRedemptionRecordForUserResponse\"f\x82\xd3\xe4\x93\x02`\x12^/Stride-Labs/stride/records/user_redemption_record_for_user/{chain_id}/{day}/{address}/{limit}\x12\xcc\x01\n\x14\x45pochUnbondingRecord\x12\x33.stride.records.QueryGetEpochUnbondingRecordRequest\x1a\x34.stride.records.QueryGetEpochUnbondingRecordResponse\"I\x82\xd3\xe4\x93\x02\x43\x12\x41/Stride-Labs/stride/records/epoch_unbonding_record/{epoch_number}\x12\xc0\x01\n\x17\x45pochUnbondingRecordAll\x12\x33.stride.records.QueryAllEpochUnbondingRecordRequest\x1a\x34.stride.records.QueryAllEpochUnbondingRecordResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/Stride-Labs/stride/records/epoch_unbonding_record\x12\xa5\x01\n\rDepositRecord\x12,.stride.records.QueryGetDepositRecordRequest\x1a-.stride.records.QueryGetDepositRecordResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//Stride-Labs/stride/records/deposit_record/{id}\x12\xa3\x01\n\x10\x44\x65positRecordAll\x12,.stride.records.QueryAllDepositRecordRequest\x1a-.stride.records.QueryAllDepositRecordResponse\"2\x82\xd3\xe4\x93\x02,\x12*/Stride-Labs/stride/records/deposit_record\x12\xc8\x01\n\x13\x44\x65positRecordByHost\x12/.stride.records.QueryDepositRecordByHostRequest\x1a\x30.stride.records.QueryDepositRecordByHostResponse\"N\x82\xd3\xe4\x93\x02H\x12\x46/Stride-Labs/stride/records/deposit_record_by_host_zone/{host_zone_id}B\xa9\x01\n\x12\x63om.stride.recordsB\nQueryProtoZ0github.com/Stride-Labs/stride/v9/x/records/types\xa2\x02\x03SRX\xaa\x02\x0eStride.Records\xca\x02\x0eStride\\Records\xe2\x02\x1aStride\\Records\\GPBMetadata\xea\x02\x0fStride::Recordsb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.records.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022com.stride.recordsB\nQueryProtoZ0github.com/Stride-Labs/stride/v9/x/records/types\242\002\003SRX\252\002\016Stride.Records\312\002\016Stride\\Records\342\002\032Stride\\Records\\GPBMetadata\352\002\017Stride::Records'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYGETDEPOSITRECORDRESPONSE'].fields_by_name['deposit_record']._options = None
  _globals['_QUERYGETDEPOSITRECORDRESPONSE'].fields_by_name['deposit_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYALLDEPOSITRECORDRESPONSE'].fields_by_name['deposit_record']._options = None
  _globals['_QUERYALLDEPOSITRECORDRESPONSE'].fields_by_name['deposit_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYDEPOSITRECORDBYHOSTRESPONSE'].fields_by_name['deposit_record']._options = None
  _globals['_QUERYDEPOSITRECORDBYHOSTRESPONSE'].fields_by_name['deposit_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYGETUSERREDEMPTIONRECORDRESPONSE'].fields_by_name['user_redemption_record']._options = None
  _globals['_QUERYGETUSERREDEMPTIONRECORDRESPONSE'].fields_by_name['user_redemption_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYALLUSERREDEMPTIONRECORDRESPONSE'].fields_by_name['user_redemption_record']._options = None
  _globals['_QUERYALLUSERREDEMPTIONRECORDRESPONSE'].fields_by_name['user_redemption_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERRESPONSE'].fields_by_name['user_redemption_record']._options = None
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERRESPONSE'].fields_by_name['user_redemption_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYGETEPOCHUNBONDINGRECORDRESPONSE'].fields_by_name['epoch_unbonding_record']._options = None
  _globals['_QUERYGETEPOCHUNBONDINGRECORDRESPONSE'].fields_by_name['epoch_unbonding_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYALLEPOCHUNBONDINGRECORDRESPONSE'].fields_by_name['epoch_unbonding_record']._options = None
  _globals['_QUERYALLEPOCHUNBONDINGRECORDRESPONSE'].fields_by_name['epoch_unbonding_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002#\022!/StrideLabs/stride/records/params'
  _globals['_QUERY'].methods_by_name['UserRedemptionRecord']._options = None
  _globals['_QUERY'].methods_by_name['UserRedemptionRecord']._serialized_options = b'\202\323\344\223\0029\0227/Stride-Labs/stride/records/user_redemption_record/{id}'
  _globals['_QUERY'].methods_by_name['UserRedemptionRecordAll']._options = None
  _globals['_QUERY'].methods_by_name['UserRedemptionRecordAll']._serialized_options = b'\202\323\344\223\0024\0222/Stride-Labs/stride/records/user_redemption_record'
  _globals['_QUERY'].methods_by_name['UserRedemptionRecordForUser']._options = None
  _globals['_QUERY'].methods_by_name['UserRedemptionRecordForUser']._serialized_options = b'\202\323\344\223\002`\022^/Stride-Labs/stride/records/user_redemption_record_for_user/{chain_id}/{day}/{address}/{limit}'
  _globals['_QUERY'].methods_by_name['EpochUnbondingRecord']._options = None
  _globals['_QUERY'].methods_by_name['EpochUnbondingRecord']._serialized_options = b'\202\323\344\223\002C\022A/Stride-Labs/stride/records/epoch_unbonding_record/{epoch_number}'
  _globals['_QUERY'].methods_by_name['EpochUnbondingRecordAll']._options = None
  _globals['_QUERY'].methods_by_name['EpochUnbondingRecordAll']._serialized_options = b'\202\323\344\223\0024\0222/Stride-Labs/stride/records/epoch_unbonding_record'
  _globals['_QUERY'].methods_by_name['DepositRecord']._options = None
  _globals['_QUERY'].methods_by_name['DepositRecord']._serialized_options = b'\202\323\344\223\0021\022//Stride-Labs/stride/records/deposit_record/{id}'
  _globals['_QUERY'].methods_by_name['DepositRecordAll']._options = None
  _globals['_QUERY'].methods_by_name['DepositRecordAll']._serialized_options = b'\202\323\344\223\002,\022*/Stride-Labs/stride/records/deposit_record'
  _globals['_QUERY'].methods_by_name['DepositRecordByHost']._options = None
  _globals['_QUERY'].methods_by_name['DepositRecordByHost']._serialized_options = b'\202\323\344\223\002H\022F/Stride-Labs/stride/records/deposit_record_by_host_zone/{host_zone_id}'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=172
  _globals['_QUERYPARAMSREQUEST']._serialized_end=192
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=194
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=269
  _globals['_QUERYGETDEPOSITRECORDREQUEST']._serialized_start=271
  _globals['_QUERYGETDEPOSITRECORDREQUEST']._serialized_end=317
  _globals['_QUERYGETDEPOSITRECORDRESPONSE']._serialized_start=319
  _globals['_QUERYGETDEPOSITRECORDRESPONSE']._serialized_end=426
  _globals['_QUERYALLDEPOSITRECORDREQUEST']._serialized_start=428
  _globals['_QUERYALLDEPOSITRECORDREQUEST']._serialized_end=530
  _globals['_QUERYALLDEPOSITRECORDRESPONSE']._serialized_start=533
  _globals['_QUERYALLDEPOSITRECORDRESPONSE']._serialized_end=713
  _globals['_QUERYDEPOSITRECORDBYHOSTREQUEST']._serialized_start=715
  _globals['_QUERYDEPOSITRECORDBYHOSTREQUEST']._serialized_end=782
  _globals['_QUERYDEPOSITRECORDBYHOSTRESPONSE']._serialized_start=784
  _globals['_QUERYDEPOSITRECORDBYHOSTRESPONSE']._serialized_end=894
  _globals['_QUERYGETUSERREDEMPTIONRECORDREQUEST']._serialized_start=896
  _globals['_QUERYGETUSERREDEMPTIONRECORDREQUEST']._serialized_end=949
  _globals['_QUERYGETUSERREDEMPTIONRECORDRESPONSE']._serialized_start=952
  _globals['_QUERYGETUSERREDEMPTIONRECORDRESPONSE']._serialized_end=1088
  _globals['_QUERYALLUSERREDEMPTIONRECORDREQUEST']._serialized_start=1090
  _globals['_QUERYALLUSERREDEMPTIONRECORDREQUEST']._serialized_end=1199
  _globals['_QUERYALLUSERREDEMPTIONRECORDRESPONSE']._serialized_start=1202
  _globals['_QUERYALLUSERREDEMPTIONRECORDRESPONSE']._serialized_end=1411
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERREQUEST']._serialized_start=1414
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERREQUEST']._serialized_end=1623
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERRESPONSE']._serialized_start=1626
  _globals['_QUERYALLUSERREDEMPTIONRECORDFORUSERRESPONSE']._serialized_end=1842
  _globals['_QUERYGETEPOCHUNBONDINGRECORDREQUEST']._serialized_start=1844
  _globals['_QUERYGETEPOCHUNBONDINGRECORDREQUEST']._serialized_end=1916
  _globals['_QUERYGETEPOCHUNBONDINGRECORDRESPONSE']._serialized_start=1919
  _globals['_QUERYGETEPOCHUNBONDINGRECORDRESPONSE']._serialized_end=2055
  _globals['_QUERYALLEPOCHUNBONDINGRECORDREQUEST']._serialized_start=2057
  _globals['_QUERYALLEPOCHUNBONDINGRECORDREQUEST']._serialized_end=2166
  _globals['_QUERYALLEPOCHUNBONDINGRECORDRESPONSE']._serialized_start=2169
  _globals['_QUERYALLEPOCHUNBONDINGRECORDRESPONSE']._serialized_end=2378
  _globals['_QUERY']._serialized_start=2381
  _globals['_QUERY']._serialized_end=4102
# @@protoc_insertion_point(module_scope)
