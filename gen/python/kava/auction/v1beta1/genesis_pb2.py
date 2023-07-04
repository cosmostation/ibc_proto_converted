# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/auction/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"kava/auction/v1beta1/genesis.proto\x12\x14kava.auction.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1egoogle/protobuf/duration.proto\"\xb8\x01\n\x0cGenesisState\x12&\n\x0fnext_auction_id\x18\x01 \x01(\x04R\rnextAuctionId\x12:\n\x06params\x18\x02 \x01(\x0b\x32\x1c.kava.auction.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x44\n\x08\x61uctions\x18\x03 \x03(\x0b\x32\x14.google.protobuf.AnyB\x12\xca\xb4-\x0eGenesisAuctionR\x08\x61uctions\"\xb8\x04\n\x06Params\x12U\n\x14max_auction_duration\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x12maxAuctionDuration\x12U\n\x14\x66orward_bid_duration\x18\x06 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x12\x66orwardBidDuration\x12U\n\x14reverse_bid_duration\x18\x07 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x12reverseBidDuration\x12[\n\x11increment_surplus\x18\x03 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x10incrementSurplus\x12U\n\x0eincrement_debt\x18\x04 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\rincrementDebt\x12\x61\n\x14increment_collateral\x18\x05 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x13incrementCollateralJ\x04\x08\x02\x10\x03R\x0c\x62id_durationB\xc9\x01\n\x18\x63om.kava.auction.v1beta1B\x0cGenesisProtoP\x01Z)github.com/kava-labs/kava/x/auction/types\xa2\x02\x03KAX\xaa\x02\x14Kava.Auction.V1beta1\xca\x02\x14Kava\\Auction\\V1beta1\xe2\x02 Kava\\Auction\\V1beta1\\GPBMetadata\xea\x02\x16Kava::Auction::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.auction.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.kava.auction.v1beta1B\014GenesisProtoP\001Z)github.com/kava-labs/kava/x/auction/types\242\002\003KAX\252\002\024Kava.Auction.V1beta1\312\002\024Kava\\Auction\\V1beta1\342\002 Kava\\Auction\\V1beta1\\GPBMetadata\352\002\026Kava::Auction::V1beta1\310\341\036\000'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['auctions']._options = None
  _GENESISSTATE.fields_by_name['auctions']._serialized_options = b'\312\264-\016GenesisAuction'
  _PARAMS.fields_by_name['max_auction_duration']._options = None
  _PARAMS.fields_by_name['max_auction_duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['forward_bid_duration']._options = None
  _PARAMS.fields_by_name['forward_bid_duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['reverse_bid_duration']._options = None
  _PARAMS.fields_by_name['reverse_bid_duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['increment_surplus']._options = None
  _PARAMS.fields_by_name['increment_surplus']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['increment_debt']._options = None
  _PARAMS.fields_by_name['increment_debt']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['increment_collateral']._options = None
  _PARAMS.fields_by_name['increment_collateral']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_GENESISSTATE']._serialized_start=169
  _globals['_GENESISSTATE']._serialized_end=353
  _globals['_PARAMS']._serialized_start=356
  _globals['_PARAMS']._serialized_end=924
# @@protoc_insertion_point(module_scope)