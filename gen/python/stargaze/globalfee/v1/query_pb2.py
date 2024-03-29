# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stargaze/globalfee/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from stargaze.globalfee.v1 import globalfee_pb2 as stargaze_dot_globalfee_dot_v1_dot_globalfee__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!stargaze/globalfee/v1/query.proto\x12#publicawesome.stargaze.globalfee.v1\x1a\x1cgoogle/api/annotations.proto\x1a%stargaze/globalfee/v1/globalfee.proto\"8\n\x1dQueryCodeAuthorizationRequest\x12\x17\n\x07\x63ode_id\x18\x01 \x01(\x04R\x06\x63odeId\":\n\x1eQueryCodeAuthorizationResponse\x12\x18\n\x07methods\x18\x01 \x03(\tR\x07methods\"N\n!QueryContractAuthorizationRequest\x12)\n\x10\x63ontract_address\x18\x01 \x01(\tR\x0f\x63ontractAddress\">\n\"QueryContractAuthorizationResponse\x12\x18\n\x07methods\x18\x01 \x03(\tR\x07methods\"\x14\n\x12QueryParamsRequest\"Z\n\x13QueryParamsResponse\x12\x43\n\x06params\x18\x01 \x01(\x0b\x32+.publicawesome.stargaze.globalfee.v1.ParamsR\x06params\"\x1c\n\x1aQueryAuthorizationsRequest\"\xfb\x01\n\x1bQueryAuthorizationsResponse\x12g\n\x13\x63ode_authorizations\x18\x01 \x03(\x0b\x32\x36.publicawesome.stargaze.globalfee.v1.CodeAuthorizationR\x12\x63odeAuthorizations\x12s\n\x17\x63ontract_authorizations\x18\x02 \x03(\x0b\x32:.publicawesome.stargaze.globalfee.v1.ContractAuthorizationR\x16\x63ontractAuthorizations2\xc2\x06\n\x05Query\x12\xd9\x01\n\x11\x43odeAuthorization\x12\x42.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationRequest\x1a\x43.publicawesome.stargaze.globalfee.v1.QueryCodeAuthorizationResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/stargaze/globalfee/v1/code_authorization/{code_id}\x12\xf2\x01\n\x15\x43ontractAuthorization\x12\x46.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationRequest\x1aG.publicawesome.stargaze.globalfee.v1.QueryContractAuthorizationResponse\"H\x82\xd3\xe4\x93\x02\x42\x12@/stargaze/globalfee/v1/contract_authorization/{contract_address}\x12\xa2\x01\n\x06Params\x12\x37.publicawesome.stargaze.globalfee.v1.QueryParamsRequest\x1a\x38.publicawesome.stargaze.globalfee.v1.QueryParamsResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/stargaze/globalfee/v1/params\x12\xc2\x01\n\x0e\x41uthorizations\x12?.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsRequest\x1a@.publicawesome.stargaze.globalfee.v1.QueryAuthorizationsResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/stargaze/globalfee/v1/authorizationsB\x9c\x02\n\'com.publicawesome.stargaze.globalfee.v1B\nQueryProtoZ8github.com/public-awesome/stargaze/v11/x/globalfee/types\xa2\x02\x03PSG\xaa\x02#Publicawesome.Stargaze.Globalfee.V1\xca\x02#Publicawesome\\Stargaze\\Globalfee\\V1\xe2\x02/Publicawesome\\Stargaze\\Globalfee\\V1\\GPBMetadata\xea\x02&Publicawesome::Stargaze::Globalfee::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stargaze.globalfee.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\'com.publicawesome.stargaze.globalfee.v1B\nQueryProtoZ8github.com/public-awesome/stargaze/v11/x/globalfee/types\242\002\003PSG\252\002#Publicawesome.Stargaze.Globalfee.V1\312\002#Publicawesome\\Stargaze\\Globalfee\\V1\342\002/Publicawesome\\Stargaze\\Globalfee\\V1\\GPBMetadata\352\002&Publicawesome::Stargaze::Globalfee::V1'
  _globals['_QUERY'].methods_by_name['CodeAuthorization']._options = None
  _globals['_QUERY'].methods_by_name['CodeAuthorization']._serialized_options = b'\202\323\344\223\0025\0223/stargaze/globalfee/v1/code_authorization/{code_id}'
  _globals['_QUERY'].methods_by_name['ContractAuthorization']._options = None
  _globals['_QUERY'].methods_by_name['ContractAuthorization']._serialized_options = b'\202\323\344\223\002B\022@/stargaze/globalfee/v1/contract_authorization/{contract_address}'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\037\022\035/stargaze/globalfee/v1/params'
  _globals['_QUERY'].methods_by_name['Authorizations']._options = None
  _globals['_QUERY'].methods_by_name['Authorizations']._serialized_options = b'\202\323\344\223\002\'\022%/stargaze/globalfee/v1/authorizations'
  _globals['_QUERYCODEAUTHORIZATIONREQUEST']._serialized_start=143
  _globals['_QUERYCODEAUTHORIZATIONREQUEST']._serialized_end=199
  _globals['_QUERYCODEAUTHORIZATIONRESPONSE']._serialized_start=201
  _globals['_QUERYCODEAUTHORIZATIONRESPONSE']._serialized_end=259
  _globals['_QUERYCONTRACTAUTHORIZATIONREQUEST']._serialized_start=261
  _globals['_QUERYCONTRACTAUTHORIZATIONREQUEST']._serialized_end=339
  _globals['_QUERYCONTRACTAUTHORIZATIONRESPONSE']._serialized_start=341
  _globals['_QUERYCONTRACTAUTHORIZATIONRESPONSE']._serialized_end=403
  _globals['_QUERYPARAMSREQUEST']._serialized_start=405
  _globals['_QUERYPARAMSREQUEST']._serialized_end=425
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=427
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=517
  _globals['_QUERYAUTHORIZATIONSREQUEST']._serialized_start=519
  _globals['_QUERYAUTHORIZATIONSREQUEST']._serialized_end=547
  _globals['_QUERYAUTHORIZATIONSRESPONSE']._serialized_start=550
  _globals['_QUERYAUTHORIZATIONSRESPONSE']._serialized_end=801
  _globals['_QUERY']._serialized_start=804
  _globals['_QUERY']._serialized_end=1638
# @@protoc_insertion_point(module_scope)
