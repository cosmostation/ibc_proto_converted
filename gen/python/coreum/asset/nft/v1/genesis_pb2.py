# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/asset/nft/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from coreum.asset.nft.v1 import params_pb2 as coreum_dot_asset_dot_nft_dot_v1_dot_params__pb2
from coreum.asset.nft.v1 import nft_pb2 as coreum_dot_asset_dot_nft_dot_v1_dot_nft__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!coreum/asset/nft/v1/genesis.proto\x12\x13\x63oreum.asset.nft.v1\x1a\x14gogoproto/gogo.proto\x1a coreum/asset/nft/v1/params.proto\x1a\x1d\x63oreum/asset/nft/v1/nft.proto\"\xd0\x03\n\x0cGenesisState\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.coreum.asset.nft.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12W\n\x11\x63lass_definitions\x18\x02 \x03(\x0b\x32$.coreum.asset.nft.v1.ClassDefinitionB\x04\xc8\xde\x1f\x00R\x10\x63lassDefinitions\x12S\n\x0b\x66rozen_nfts\x18\x03 \x03(\x0b\x32\x1e.coreum.asset.nft.v1.FrozenNFTB\x12\xc8\xde\x1f\x00\xe2\xde\x1f\nFrozenNFTsR\nfrozenNfts\x12\x85\x01\n\x18whitelisted_nft_accounts\x18\x04 \x03(\x0b\x32+.coreum.asset.nft.v1.WhitelistedNFTAccountsB\x1e\xc8\xde\x1f\x00\xe2\xde\x1f\x16WhitelistedNFTAccountsR\x16whitelistedNftAccounts\x12O\n\nburnt_nfts\x18\x05 \x03(\x0b\x32\x1d.coreum.asset.nft.v1.BurntNFTB\x11\xc8\xde\x1f\x00\xe2\xde\x1f\tBurntNFTsR\tburntNfts\"=\n\tFrozenNFT\x12\x18\n\x07\x63lassID\x18\x01 \x01(\tR\x07\x63lassID\x12\x16\n\x06nftIDs\x18\x02 \x03(\tR\x06nftIDs\"d\n\x16WhitelistedNFTAccounts\x12\x18\n\x07\x63lassID\x18\x01 \x01(\tR\x07\x63lassID\x12\x14\n\x05nftID\x18\x02 \x01(\tR\x05nftID\x12\x1a\n\x08\x61\x63\x63ounts\x18\x04 \x03(\tR\x08\x61\x63\x63ounts\"<\n\x08\x42urntNFT\x12\x18\n\x07\x63lassID\x18\x01 \x01(\tR\x07\x63lassID\x12\x16\n\x06nftIDs\x18\x02 \x03(\tR\x06nftIDsB\xca\x01\n\x17\x63om.coreum.asset.nft.v1B\x0cGenesisProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\xa2\x02\x03\x43\x41N\xaa\x02\x13\x43oreum.Asset.Nft.V1\xca\x02\x13\x43oreum\\Asset\\Nft\\V1\xe2\x02\x1f\x43oreum\\Asset\\Nft\\V1\\GPBMetadata\xea\x02\x16\x43oreum::Asset::Nft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.asset.nft.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.coreum.asset.nft.v1B\014GenesisProtoZ4github.com/CoreumFoundation/coreum/x/asset/nft/types\242\002\003CAN\252\002\023Coreum.Asset.Nft.V1\312\002\023Coreum\\Asset\\Nft\\V1\342\002\037Coreum\\Asset\\Nft\\V1\\GPBMetadata\352\002\026Coreum::Asset::Nft::V1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['class_definitions']._options = None
  _globals['_GENESISSTATE'].fields_by_name['class_definitions']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['frozen_nfts']._options = None
  _globals['_GENESISSTATE'].fields_by_name['frozen_nfts']._serialized_options = b'\310\336\037\000\342\336\037\nFrozenNFTs'
  _globals['_GENESISSTATE'].fields_by_name['whitelisted_nft_accounts']._options = None
  _globals['_GENESISSTATE'].fields_by_name['whitelisted_nft_accounts']._serialized_options = b'\310\336\037\000\342\336\037\026WhitelistedNFTAccounts'
  _globals['_GENESISSTATE'].fields_by_name['burnt_nfts']._options = None
  _globals['_GENESISSTATE'].fields_by_name['burnt_nfts']._serialized_options = b'\310\336\037\000\342\336\037\tBurntNFTs'
  _globals['_GENESISSTATE']._serialized_start=146
  _globals['_GENESISSTATE']._serialized_end=610
  _globals['_FROZENNFT']._serialized_start=612
  _globals['_FROZENNFT']._serialized_end=673
  _globals['_WHITELISTEDNFTACCOUNTS']._serialized_start=675
  _globals['_WHITELISTEDNFTACCOUNTS']._serialized_end=775
  _globals['_BURNTNFT']._serialized_start=777
  _globals['_BURNTNFT']._serialized_end=837
# @@protoc_insertion_point(module_scope)
