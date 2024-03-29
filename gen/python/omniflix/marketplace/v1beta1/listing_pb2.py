# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: OmniFlix/marketplace/v1beta1/listing.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*OmniFlix/marketplace/v1beta1/listing.proto\x12\x1cOmniFlix.marketplace.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"\xec\x02\n\x07Listing\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12(\n\x06nft_id\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"nft_id\"R\x05nftId\x12.\n\x08\x64\x65nom_id\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12`\n\x05price\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x05price\x12&\n\x05owner\x18\x05 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12m\n\x0csplit_shares\x18\x06 \x03(\x0b\x32-.OmniFlix.marketplace.v1beta1.WeightedAddressB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"split_shares\"R\x0bsplitShares\"\x9e\x01\n\x0fWeightedAddress\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12W\n\x06weight\x18\x02 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\ryaml:\"weight\"R\x06weight:\x04\xe8\xa0\x1f\x01\x42\xfc\x01\n com.OmniFlix.marketplace.v1beta1B\x0cListingProtoZ6github.com/OmniFlix/omniflixhub/v3/x/marketplace/types\xa2\x02\x03OMX\xaa\x02\x1cOmniFlix.Marketplace.V1beta1\xca\x02\x1cOmniFlix\\Marketplace\\V1beta1\xe2\x02(OmniFlix\\Marketplace\\V1beta1\\GPBMetadata\xea\x02\x1eOmniFlix::Marketplace::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'OmniFlix.marketplace.v1beta1.listing_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n com.OmniFlix.marketplace.v1beta1B\014ListingProtoZ6github.com/OmniFlix/omniflixhub/v3/x/marketplace/types\242\002\003OMX\252\002\034OmniFlix.Marketplace.V1beta1\312\002\034OmniFlix\\Marketplace\\V1beta1\342\002(OmniFlix\\Marketplace\\V1beta1\\GPBMetadata\352\002\036OmniFlix::Marketplace::V1beta1\310\341\036\000'
  _globals['_LISTING'].fields_by_name['nft_id']._loaded_options = None
  _globals['_LISTING'].fields_by_name['nft_id']._serialized_options = b'\362\336\037\ryaml:\"nft_id\"'
  _globals['_LISTING'].fields_by_name['denom_id']._loaded_options = None
  _globals['_LISTING'].fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _globals['_LISTING'].fields_by_name['price']._loaded_options = None
  _globals['_LISTING'].fields_by_name['price']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_LISTING'].fields_by_name['owner']._loaded_options = None
  _globals['_LISTING'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_LISTING'].fields_by_name['split_shares']._loaded_options = None
  _globals['_LISTING'].fields_by_name['split_shares']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"split_shares\"'
  _globals['_WEIGHTEDADDRESS'].fields_by_name['address']._loaded_options = None
  _globals['_WEIGHTEDADDRESS'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_WEIGHTEDADDRESS'].fields_by_name['weight']._loaded_options = None
  _globals['_WEIGHTEDADDRESS'].fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\ryaml:\"weight\"'
  _globals['_WEIGHTEDADDRESS']._loaded_options = None
  _globals['_WEIGHTEDADDRESS']._serialized_options = b'\350\240\037\001'
  _globals['_LISTING']._serialized_start=131
  _globals['_LISTING']._serialized_end=495
  _globals['_WEIGHTEDADDRESS']._serialized_start=498
  _globals['_WEIGHTEDADDRESS']._serialized_end=656
# @@protoc_insertion_point(module_scope)
