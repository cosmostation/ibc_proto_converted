# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/auction/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63omdex/auction/v1beta1/tx.proto\x12\x16\x63omdex.auction.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xd0\x01\n\x19MsgPlaceSurplusBidRequest\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId\x12\x16\n\x06\x62idder\x18\x02 \x01(\tR\x06\x62idder\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\x12,\n\x12\x61uction_mapping_id\x18\x05 \x01(\x04R\x10\x61uctionMappingId\"\x1c\n\x1aMsgPlaceSurplusBidResponse\"\x96\x02\n\x16MsgPlaceDebtBidRequest\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId\x12\x16\n\x06\x62idder\x18\x02 \x01(\tR\x06\x62idder\x12\x31\n\x03\x62id\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x03\x62id\x12M\n\x11\x65xpectedUserToken\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x11\x65xpectedUserToken\x12\x15\n\x06\x61pp_id\x18\x05 \x01(\x04R\x05\x61ppId\x12,\n\x12\x61uction_mapping_id\x18\x06 \x01(\x04R\x10\x61uctionMappingId\"\x19\n\x17MsgPlaceDebtBidResponse\"\xce\x01\n\x17MsgPlaceDutchBidRequest\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId\x12\x16\n\x06\x62idder\x18\x02 \x01(\tR\x06\x62idder\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\x12,\n\x12\x61uction_mapping_id\x18\x05 \x01(\x04R\x10\x61uctionMappingId\"\x1a\n\x18MsgPlaceDutchBidResponse\"\xd2\x01\n\x1bMsgPlaceDutchLendBidRequest\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId\x12\x16\n\x06\x62idder\x18\x02 \x01(\tR\x06\x62idder\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\x12,\n\x12\x61uction_mapping_id\x18\x05 \x01(\x04R\x10\x61uctionMappingId\"\x1e\n\x1cMsgPlaceDutchLendBidResponse2\xf1\x03\n\x03Msg\x12{\n\x12MsgPlaceSurplusBid\x12\x31.comdex.auction.v1beta1.MsgPlaceSurplusBidRequest\x1a\x32.comdex.auction.v1beta1.MsgPlaceSurplusBidResponse\x12r\n\x0fMsgPlaceDebtBid\x12..comdex.auction.v1beta1.MsgPlaceDebtBidRequest\x1a/.comdex.auction.v1beta1.MsgPlaceDebtBidResponse\x12u\n\x10MsgPlaceDutchBid\x12/.comdex.auction.v1beta1.MsgPlaceDutchBidRequest\x1a\x30.comdex.auction.v1beta1.MsgPlaceDutchBidResponse\x12\x81\x01\n\x14MsgPlaceDutchLendBid\x12\x33.comdex.auction.v1beta1.MsgPlaceDutchLendBidRequest\x1a\x34.comdex.auction.v1beta1.MsgPlaceDutchLendBidResponseB\xda\x01\n\x1a\x63om.comdex.auction.v1beta1B\x07TxProtoP\x01Z1github.com/comdex-official/comdex/x/auction/types\xa2\x02\x03\x43\x41X\xaa\x02\x16\x43omdex.Auction.V1beta1\xca\x02\x16\x43omdex\\Auction\\V1beta1\xe2\x02\"Comdex\\Auction\\V1beta1\\GPBMetadata\xea\x02\x18\x43omdex::Auction::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.auction.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.comdex.auction.v1beta1B\007TxProtoP\001Z1github.com/comdex-official/comdex/x/auction/types\242\002\003CAX\252\002\026Comdex.Auction.V1beta1\312\002\026Comdex\\Auction\\V1beta1\342\002\"Comdex\\Auction\\V1beta1\\GPBMetadata\352\002\030Comdex::Auction::V1beta1\310\341\036\000\250\342\036\000'
  _MSGPLACESURPLUSBIDREQUEST.fields_by_name['amount']._options = None
  _MSGPLACESURPLUSBIDREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGPLACEDEBTBIDREQUEST.fields_by_name['bid']._options = None
  _MSGPLACEDEBTBIDREQUEST.fields_by_name['bid']._serialized_options = b'\310\336\037\000'
  _MSGPLACEDEBTBIDREQUEST.fields_by_name['expectedUserToken']._options = None
  _MSGPLACEDEBTBIDREQUEST.fields_by_name['expectedUserToken']._serialized_options = b'\310\336\037\000'
  _MSGPLACEDUTCHBIDREQUEST.fields_by_name['amount']._options = None
  _MSGPLACEDUTCHBIDREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGPLACEDUTCHLENDBIDREQUEST.fields_by_name['amount']._options = None
  _MSGPLACEDUTCHLENDBIDREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGPLACESURPLUSBIDREQUEST']._serialized_start=114
  _globals['_MSGPLACESURPLUSBIDREQUEST']._serialized_end=322
  _globals['_MSGPLACESURPLUSBIDRESPONSE']._serialized_start=324
  _globals['_MSGPLACESURPLUSBIDRESPONSE']._serialized_end=352
  _globals['_MSGPLACEDEBTBIDREQUEST']._serialized_start=355
  _globals['_MSGPLACEDEBTBIDREQUEST']._serialized_end=633
  _globals['_MSGPLACEDEBTBIDRESPONSE']._serialized_start=635
  _globals['_MSGPLACEDEBTBIDRESPONSE']._serialized_end=660
  _globals['_MSGPLACEDUTCHBIDREQUEST']._serialized_start=663
  _globals['_MSGPLACEDUTCHBIDREQUEST']._serialized_end=869
  _globals['_MSGPLACEDUTCHBIDRESPONSE']._serialized_start=871
  _globals['_MSGPLACEDUTCHBIDRESPONSE']._serialized_end=897
  _globals['_MSGPLACEDUTCHLENDBIDREQUEST']._serialized_start=900
  _globals['_MSGPLACEDUTCHLENDBIDREQUEST']._serialized_end=1110
  _globals['_MSGPLACEDUTCHLENDBIDRESPONSE']._serialized_start=1112
  _globals['_MSGPLACEDUTCHLENDBIDRESPONSE']._serialized_end=1142
  _globals['_MSG']._serialized_start=1145
  _globals['_MSG']._serialized_end=1642
# @@protoc_insertion_point(module_scope)