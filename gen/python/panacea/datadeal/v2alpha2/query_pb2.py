# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/datadeal/v2alpha2/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from panacea.datadeal.v2alpha2 import deal_pb2 as panacea_dot_datadeal_dot_v2alpha2_dot_deal__pb2
from panacea.datadeal.v2alpha2 import datasale_pb2 as panacea_dot_datadeal_dot_v2alpha2_dot_datasale__pb2
from panacea.datadeal.v2alpha2 import tx_pb2 as panacea_dot_datadeal_dot_v2alpha2_dot_tx__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%panacea/datadeal/v2alpha2/query.proto\x12\x19panacea.datadeal.v2alpha2\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a$panacea/datadeal/v2alpha2/deal.proto\x1a(panacea/datadeal/v2alpha2/datasale.proto\x1a\"panacea/datadeal/v2alpha2/tx.proto\"+\n\x10QueryDealRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\"H\n\x11QueryDealResponse\x12\x33\n\x04\x64\x65\x61l\x18\x01 \x01(\x0b\x32\x1f.panacea.datadeal.v2alpha2.DealR\x04\x64\x65\x61l\"[\n\x11QueryDealsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x92\x01\n\x12QueryDealsResponse\x12\x33\n\x04\x64\x65\x61l\x18\x01 \x03(\x0b\x32\x1f.panacea.datadeal.v2alpha2.DealR\x04\x64\x65\x61l\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"L\n\x14QueryDataSaleRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x1b\n\tdata_hash\x18\x02 \x01(\tR\x08\x64\x61taHash\"Y\n\x15QueryDataSaleResponse\x12@\n\tdata_sale\x18\x01 \x01(\x0b\x32#.panacea.datadeal.v2alpha2.DataSaleR\x08\x64\x61taSale\"x\n\x15QueryDataSalesRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa3\x01\n\x16QueryDataSalesResponse\x12@\n\tdata_sale\x18\x01 \x03(\x0b\x32#.panacea.datadeal.v2alpha2.DataSaleR\x08\x64\x61taSale\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"}\n QueryDataVerificationVoteRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x1b\n\tdata_hash\x18\x02 \x01(\tR\x08\x64\x61taHash\x12#\n\rvoter_address\x18\x03 \x01(\tR\x0cvoterAddress\"\x8a\x01\n!QueryDataVerificationVoteResponse\x12\x65\n\x16\x64\x61ta_verification_vote\x18\x01 \x01(\x0b\x32/.panacea.datadeal.v2alpha2.DataVerificationVoteR\x14\x64\x61taVerificationVote\"y\n\x1cQueryDataDeliveryVoteRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x1b\n\tdata_hash\x18\x02 \x01(\tR\x08\x64\x61taHash\x12#\n\rvoter_address\x18\x03 \x01(\tR\x0cvoterAddress\"z\n\x1dQueryDataDeliveryVoteResponse\x12Y\n\x12\x64\x61ta_delivery_vote\x18\x01 \x01(\x0b\x32+.panacea.datadeal.v2alpha2.DataDeliveryVoteR\x10\x64\x61taDeliveryVote2\xeb\x08\n\x05Query\x12\x95\x01\n\x04\x44\x65\x61l\x12+.panacea.datadeal.v2alpha2.QueryDealRequest\x1a,.panacea.datadeal.v2alpha2.QueryDealResponse\"2\x82\xd3\xe4\x93\x02,\x12*/panacea/datadeal/v2alpha2/deals/{deal_id}\x12\x8e\x01\n\x05\x44\x65\x61ls\x12,.panacea.datadeal.v2alpha2.QueryDealsRequest\x1a-.panacea.datadeal.v2alpha2.QueryDealsResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /panacea/datadeal/v2alpha2/deals\x12\xb1\x01\n\x08\x44\x61taSale\x12/.panacea.datadeal.v2alpha2.QueryDataSaleRequest\x1a\x30.panacea.datadeal.v2alpha2.QueryDataSaleResponse\"B\x82\xd3\xe4\x93\x02<\x12:/panacea/datadeal/v2alpha2/datasales/{deal_id}/{data_hash}\x12\xa8\x01\n\tDataSales\x12\x30.panacea.datadeal.v2alpha2.QueryDataSalesRequest\x1a\x31.panacea.datadeal.v2alpha2.QueryDataSalesResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./panacea/datadeal/v2alpha2/datasales/{deal_id}\x12\xf3\x01\n\x14\x44\x61taVerificationVote\x12;.panacea.datadeal.v2alpha2.QueryDataVerificationVoteRequest\x1a<.panacea.datadeal.v2alpha2.QueryDataVerificationVoteResponse\"`\x82\xd3\xe4\x93\x02Z\x12X/panacea/datadeal/v2alpha2/data_verification_votes/{deal_id}/{data_hash}/{voter_address}\x12\xe3\x01\n\x10\x44\x61taDeliveryVote\x12\x37.panacea.datadeal.v2alpha2.QueryDataDeliveryVoteRequest\x1a\x38.panacea.datadeal.v2alpha2.QueryDataDeliveryVoteResponse\"\\\x82\xd3\xe4\x93\x02V\x12T/panacea/datadeal/v2alpha2/data_delivery_votes/{deal_id}/{data_hash}/{voter_address}B\xe5\x01\n\x1d\x63om.panacea.datadeal.v2alpha2B\nQueryProtoZ4github.com/medibloc/panacea-core/v2/x/datadeal/types\xa2\x02\x03PDX\xaa\x02\x19Panacea.Datadeal.V2alpha2\xca\x02\x19Panacea\\Datadeal\\V2alpha2\xe2\x02%Panacea\\Datadeal\\V2alpha2\\GPBMetadata\xea\x02\x1bPanacea::Datadeal::V2alpha2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.datadeal.v2alpha2.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.panacea.datadeal.v2alpha2B\nQueryProtoZ4github.com/medibloc/panacea-core/v2/x/datadeal/types\242\002\003PDX\252\002\031Panacea.Datadeal.V2alpha2\312\002\031Panacea\\Datadeal\\V2alpha2\342\002%Panacea\\Datadeal\\V2alpha2\\GPBMetadata\352\002\033Panacea::Datadeal::V2alpha2'
  _globals['_QUERY'].methods_by_name['Deal']._options = None
  _globals['_QUERY'].methods_by_name['Deal']._serialized_options = b'\202\323\344\223\002,\022*/panacea/datadeal/v2alpha2/deals/{deal_id}'
  _globals['_QUERY'].methods_by_name['Deals']._options = None
  _globals['_QUERY'].methods_by_name['Deals']._serialized_options = b'\202\323\344\223\002\"\022 /panacea/datadeal/v2alpha2/deals'
  _globals['_QUERY'].methods_by_name['DataSale']._options = None
  _globals['_QUERY'].methods_by_name['DataSale']._serialized_options = b'\202\323\344\223\002<\022:/panacea/datadeal/v2alpha2/datasales/{deal_id}/{data_hash}'
  _globals['_QUERY'].methods_by_name['DataSales']._options = None
  _globals['_QUERY'].methods_by_name['DataSales']._serialized_options = b'\202\323\344\223\0020\022./panacea/datadeal/v2alpha2/datasales/{deal_id}'
  _globals['_QUERY'].methods_by_name['DataVerificationVote']._options = None
  _globals['_QUERY'].methods_by_name['DataVerificationVote']._serialized_options = b'\202\323\344\223\002Z\022X/panacea/datadeal/v2alpha2/data_verification_votes/{deal_id}/{data_hash}/{voter_address}'
  _globals['_QUERY'].methods_by_name['DataDeliveryVote']._options = None
  _globals['_QUERY'].methods_by_name['DataDeliveryVote']._serialized_options = b'\202\323\344\223\002V\022T/panacea/datadeal/v2alpha2/data_delivery_votes/{deal_id}/{data_hash}/{voter_address}'
  _globals['_QUERYDEALREQUEST']._serialized_start=258
  _globals['_QUERYDEALREQUEST']._serialized_end=301
  _globals['_QUERYDEALRESPONSE']._serialized_start=303
  _globals['_QUERYDEALRESPONSE']._serialized_end=375
  _globals['_QUERYDEALSREQUEST']._serialized_start=377
  _globals['_QUERYDEALSREQUEST']._serialized_end=468
  _globals['_QUERYDEALSRESPONSE']._serialized_start=471
  _globals['_QUERYDEALSRESPONSE']._serialized_end=617
  _globals['_QUERYDATASALEREQUEST']._serialized_start=619
  _globals['_QUERYDATASALEREQUEST']._serialized_end=695
  _globals['_QUERYDATASALERESPONSE']._serialized_start=697
  _globals['_QUERYDATASALERESPONSE']._serialized_end=786
  _globals['_QUERYDATASALESREQUEST']._serialized_start=788
  _globals['_QUERYDATASALESREQUEST']._serialized_end=908
  _globals['_QUERYDATASALESRESPONSE']._serialized_start=911
  _globals['_QUERYDATASALESRESPONSE']._serialized_end=1074
  _globals['_QUERYDATAVERIFICATIONVOTEREQUEST']._serialized_start=1076
  _globals['_QUERYDATAVERIFICATIONVOTEREQUEST']._serialized_end=1201
  _globals['_QUERYDATAVERIFICATIONVOTERESPONSE']._serialized_start=1204
  _globals['_QUERYDATAVERIFICATIONVOTERESPONSE']._serialized_end=1342
  _globals['_QUERYDATADELIVERYVOTEREQUEST']._serialized_start=1344
  _globals['_QUERYDATADELIVERYVOTEREQUEST']._serialized_end=1465
  _globals['_QUERYDATADELIVERYVOTERESPONSE']._serialized_start=1467
  _globals['_QUERYDATADELIVERYVOTERESPONSE']._serialized_end=1589
  _globals['_QUERY']._serialized_start=1592
  _globals['_QUERY']._serialized_end=2723
# @@protoc_insertion_point(module_scope)
