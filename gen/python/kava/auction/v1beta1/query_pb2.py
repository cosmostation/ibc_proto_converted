# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/auction/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from kava.auction.v1beta1 import genesis_pb2 as kava_dot_auction_dot_v1beta1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n kava/auction/v1beta1/query.proto\x12\x14kava.auction.v1beta1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a\"kava/auction/v1beta1/genesis.proto\"\x14\n\x12QueryParamsRequest\"Q\n\x13QueryParamsResponse\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.kava.auction.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\">\n\x13QueryAuctionRequest\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"F\n\x14QueryAuctionResponse\x12.\n\x07\x61uction\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyR\x07\x61uction\"\xbe\x01\n\x14QueryAuctionsRequest\x12\x12\n\x04type\x18\x01 \x01(\tR\x04type\x12\x14\n\x05owner\x18\x02 \x01(\tR\x05owner\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x14\n\x05phase\x18\x04 \x01(\tR\x05phase\x12\x46\n\npagination\x18\x05 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x92\x01\n\x15QueryAuctionsResponse\x12\x30\n\x08\x61uctions\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\x08\x61uctions\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x1b\n\x19QueryNextAuctionIDRequest\",\n\x1aQueryNextAuctionIDResponse\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id2\xd7\x04\n\x05Query\x12\x83\x01\n\x06Params\x12(.kava.auction.v1beta1.QueryParamsRequest\x1a).kava.auction.v1beta1.QueryParamsResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/kava/auction/v1beta1/params\x12\x95\x01\n\x07\x41uction\x12).kava.auction.v1beta1.QueryAuctionRequest\x1a*.kava.auction.v1beta1.QueryAuctionResponse\"3\x82\xd3\xe4\x93\x02-\x12+/kava/auction/v1beta1/auctions/{auction_id}\x12\x8b\x01\n\x08\x41uctions\x12*.kava.auction.v1beta1.QueryAuctionsRequest\x1a+.kava.auction.v1beta1.QueryAuctionsResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/kava/auction/v1beta1/auctions\x12\xa1\x01\n\rNextAuctionID\x12/.kava.auction.v1beta1.QueryNextAuctionIDRequest\x1a\x30.kava.auction.v1beta1.QueryNextAuctionIDResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/kava/auction/v1beta1/next-auction-idB\xc3\x01\n\x18\x63om.kava.auction.v1beta1B\nQueryProtoP\x01Z)github.com/kava-labs/kava/x/auction/types\xa2\x02\x03KAX\xaa\x02\x14Kava.Auction.V1beta1\xca\x02\x14Kava\\Auction\\V1beta1\xe2\x02 Kava\\Auction\\V1beta1\\GPBMetadata\xea\x02\x16Kava::Auction::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.auction.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.kava.auction.v1beta1B\nQueryProtoP\001Z)github.com/kava-labs/kava/x/auction/types\242\002\003KAX\252\002\024Kava.Auction.V1beta1\312\002\024Kava\\Auction\\V1beta1\342\002 Kava\\Auction\\V1beta1\\GPBMetadata\352\002\026Kava::Auction::V1beta1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYAUCTIONREQUEST._options = None
  _QUERYAUCTIONREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _QUERYAUCTIONSREQUEST._options = None
  _QUERYAUCTIONSREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\036\022\034/kava/auction/v1beta1/params'
  _QUERY.methods_by_name['Auction']._options = None
  _QUERY.methods_by_name['Auction']._serialized_options = b'\202\323\344\223\002-\022+/kava/auction/v1beta1/auctions/{auction_id}'
  _QUERY.methods_by_name['Auctions']._options = None
  _QUERY.methods_by_name['Auctions']._serialized_options = b'\202\323\344\223\002 \022\036/kava/auction/v1beta1/auctions'
  _QUERY.methods_by_name['NextAuctionID']._options = None
  _QUERY.methods_by_name['NextAuctionID']._serialized_options = b'\202\323\344\223\002\'\022%/kava/auction/v1beta1/next-auction-id'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=217
  _globals['_QUERYPARAMSREQUEST']._serialized_end=237
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=239
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=320
  _globals['_QUERYAUCTIONREQUEST']._serialized_start=322
  _globals['_QUERYAUCTIONREQUEST']._serialized_end=384
  _globals['_QUERYAUCTIONRESPONSE']._serialized_start=386
  _globals['_QUERYAUCTIONRESPONSE']._serialized_end=456
  _globals['_QUERYAUCTIONSREQUEST']._serialized_start=459
  _globals['_QUERYAUCTIONSREQUEST']._serialized_end=649
  _globals['_QUERYAUCTIONSRESPONSE']._serialized_start=652
  _globals['_QUERYAUCTIONSRESPONSE']._serialized_end=798
  _globals['_QUERYNEXTAUCTIONIDREQUEST']._serialized_start=800
  _globals['_QUERYNEXTAUCTIONIDREQUEST']._serialized_end=827
  _globals['_QUERYNEXTAUCTIONIDRESPONSE']._serialized_start=829
  _globals['_QUERYNEXTAUCTIONIDRESPONSE']._serialized_end=873
  _globals['_QUERY']._serialized_start=876
  _globals['_QUERY']._serialized_end=1475
# @@protoc_insertion_point(module_scope)