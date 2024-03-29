# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/rstaking/query.proto
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
from stafihub.rstaking import params_pb2 as stafihub_dot_rstaking_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dstafihub/rstaking/query.proto\x12\x1astafihub.stafihub.rstaking\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1estafihub/rstaking/params.proto\"\x14\n\x12QueryParamsRequest\"W\n\x13QueryParamsResponse\x12@\n\x06params\x18\x01 \x01(\x0b\x32\".stafihub.stafihub.rstaking.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x1b\n\x19QueryInflationBaseRequest\"r\n\x1aQueryInflationBaseResponse\x12T\n\rinflationBase\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rinflationBase\" \n\x1eQueryValidatorWhitelistRequest\"A\n\x1fQueryValidatorWhitelistResponse\x12\x1e\n\nvalAddress\x18\x01 \x03(\tR\nvalAddress\"&\n$QueryValidatorWhitelistSwitchRequest\"?\n%QueryValidatorWhitelistSwitchResponse\x12\x16\n\x06isOpen\x18\x01 \x01(\x08R\x06isOpen\" \n\x1eQueryDelegatorWhitelistRequest\"M\n\x1fQueryDelegatorWhitelistResponse\x12*\n\x10\x64\x65legatorAddress\x18\x01 \x03(\tR\x10\x64\x65legatorAddress\"&\n$QueryDelegatorWhitelistSwitchRequest\"?\n%QueryDelegatorWhitelistSwitchResponse\x12\x16\n\x06isOpen\x18\x01 \x01(\x08R\x06isOpen2\xaa\t\n\x05Query\x12\x95\x01\n\x06Params\x12..stafihub.stafihub.rstaking.QueryParamsRequest\x1a/.stafihub.stafihub.rstaking.QueryParamsResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/stafihub/stafihub/rstaking/params\x12\xb2\x01\n\rInflationBase\x12\x35.stafihub.stafihub.rstaking.QueryInflationBaseRequest\x1a\x36.stafihub.stafihub.rstaking.QueryInflationBaseResponse\"2\x82\xd3\xe4\x93\x02,\x12*/stafihub/stafihub/rstaking/inflation_base\x12\xc6\x01\n\x12ValidatorWhitelist\x12:.stafihub.stafihub.rstaking.QueryValidatorWhitelistRequest\x1a;.stafihub.stafihub.rstaking.QueryValidatorWhitelistResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/rstaking/validator_whitelist\x12\xdf\x01\n\x18ValidatorWhitelistSwitch\x12@.stafihub.stafihub.rstaking.QueryValidatorWhitelistSwitchRequest\x1a\x41.stafihub.stafihub.rstaking.QueryValidatorWhitelistSwitchResponse\">\x82\xd3\xe4\x93\x02\x38\x12\x36/stafihub/stafihub/rstaking/validator_whitelist_switch\x12\xc6\x01\n\x12\x44\x65legatorWhitelist\x12:.stafihub.stafihub.rstaking.QueryDelegatorWhitelistRequest\x1a;.stafihub.stafihub.rstaking.QueryDelegatorWhitelistResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//stafihub/stafihub/rstaking/delegator_whitelist\x12\xdf\x01\n\x18\x44\x65legatorWhitelistSwitch\x12@.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchRequest\x1a\x41.stafihub.stafihub.rstaking.QueryDelegatorWhitelistSwitchResponse\">\x82\xd3\xe4\x93\x02\x38\x12\x36/stafihub/stafihub/rstaking/delegator_whitelist_switchB\xe3\x01\n\x1e\x63om.stafihub.stafihub.rstakingB\nQueryProtoZ-github.com/stafihub/stafihub/x/rstaking/types\xa2\x02\x03SSR\xaa\x02\x1aStafihub.Stafihub.Rstaking\xca\x02\x1aStafihub\\Stafihub\\Rstaking\xe2\x02&Stafihub\\Stafihub\\Rstaking\\GPBMetadata\xea\x02\x1cStafihub::Stafihub::Rstakingb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.rstaking.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036com.stafihub.stafihub.rstakingB\nQueryProtoZ-github.com/stafihub/stafihub/x/rstaking/types\242\002\003SSR\252\002\032Stafihub.Stafihub.Rstaking\312\002\032Stafihub\\Stafihub\\Rstaking\342\002&Stafihub\\Stafihub\\Rstaking\\GPBMetadata\352\002\034Stafihub::Stafihub::Rstaking'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYINFLATIONBASERESPONSE'].fields_by_name['inflationBase']._options = None
  _globals['_QUERYINFLATIONBASERESPONSE'].fields_by_name['inflationBase']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002$\022\"/stafihub/stafihub/rstaking/params'
  _globals['_QUERY'].methods_by_name['InflationBase']._options = None
  _globals['_QUERY'].methods_by_name['InflationBase']._serialized_options = b'\202\323\344\223\002,\022*/stafihub/stafihub/rstaking/inflation_base'
  _globals['_QUERY'].methods_by_name['ValidatorWhitelist']._options = None
  _globals['_QUERY'].methods_by_name['ValidatorWhitelist']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/rstaking/validator_whitelist'
  _globals['_QUERY'].methods_by_name['ValidatorWhitelistSwitch']._options = None
  _globals['_QUERY'].methods_by_name['ValidatorWhitelistSwitch']._serialized_options = b'\202\323\344\223\0028\0226/stafihub/stafihub/rstaking/validator_whitelist_switch'
  _globals['_QUERY'].methods_by_name['DelegatorWhitelist']._options = None
  _globals['_QUERY'].methods_by_name['DelegatorWhitelist']._serialized_options = b'\202\323\344\223\0021\022//stafihub/stafihub/rstaking/delegator_whitelist'
  _globals['_QUERY'].methods_by_name['DelegatorWhitelistSwitch']._options = None
  _globals['_QUERY'].methods_by_name['DelegatorWhitelistSwitch']._serialized_options = b'\202\323\344\223\0028\0226/stafihub/stafihub/rstaking/delegator_whitelist_switch'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=145
  _globals['_QUERYPARAMSREQUEST']._serialized_end=165
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=167
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=254
  _globals['_QUERYINFLATIONBASEREQUEST']._serialized_start=256
  _globals['_QUERYINFLATIONBASEREQUEST']._serialized_end=283
  _globals['_QUERYINFLATIONBASERESPONSE']._serialized_start=285
  _globals['_QUERYINFLATIONBASERESPONSE']._serialized_end=399
  _globals['_QUERYVALIDATORWHITELISTREQUEST']._serialized_start=401
  _globals['_QUERYVALIDATORWHITELISTREQUEST']._serialized_end=433
  _globals['_QUERYVALIDATORWHITELISTRESPONSE']._serialized_start=435
  _globals['_QUERYVALIDATORWHITELISTRESPONSE']._serialized_end=500
  _globals['_QUERYVALIDATORWHITELISTSWITCHREQUEST']._serialized_start=502
  _globals['_QUERYVALIDATORWHITELISTSWITCHREQUEST']._serialized_end=540
  _globals['_QUERYVALIDATORWHITELISTSWITCHRESPONSE']._serialized_start=542
  _globals['_QUERYVALIDATORWHITELISTSWITCHRESPONSE']._serialized_end=605
  _globals['_QUERYDELEGATORWHITELISTREQUEST']._serialized_start=607
  _globals['_QUERYDELEGATORWHITELISTREQUEST']._serialized_end=639
  _globals['_QUERYDELEGATORWHITELISTRESPONSE']._serialized_start=641
  _globals['_QUERYDELEGATORWHITELISTRESPONSE']._serialized_end=718
  _globals['_QUERYDELEGATORWHITELISTSWITCHREQUEST']._serialized_start=720
  _globals['_QUERYDELEGATORWHITELISTSWITCHREQUEST']._serialized_end=758
  _globals['_QUERYDELEGATORWHITELISTSWITCHRESPONSE']._serialized_start=760
  _globals['_QUERYDELEGATORWHITELISTSWITCHRESPONSE']._serialized_end=823
  _globals['_QUERY']._serialized_start=826
  _globals['_QUERY']._serialized_end=2020
# @@protoc_insertion_point(module_scope)
