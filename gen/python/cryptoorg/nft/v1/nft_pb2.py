# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cryptoorg/nft/v1/nft.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x63ryptoorg/nft/v1/nft.proto\x12\x10\x63hainmain.nft.v1\x1a\x14gogoproto/gogo.proto\"x\n\x07\x42\x61seNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x19\n\x03uri\x18\x03 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12\x12\n\x04\x64\x61ta\x18\x04 \x01(\tR\x04\x64\x61ta\x12\x14\n\x05owner\x18\x05 \x01(\tR\x05owner:\x04\xe8\xa0\x1f\x01\"u\n\x05\x44\x65nom\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x16\n\x06schema\x18\x03 \x01(\tR\x06schema\x12\x18\n\x07\x63reator\x18\x04 \x01(\tR\x07\x63reator\x12\x10\n\x03uri\x18\x05 \x01(\tR\x03uri:\x04\xe8\xa0\x1f\x01\"w\n\x0cIDCollection\x12.\n\x08\x64\x65nom_id\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x31\n\ttoken_ids\x18\x02 \x03(\tB\x14\xf2\xde\x1f\x10yaml:\"token_ids\"R\x08tokenIds:\x04\xe8\xa0\x1f\x01\"\x94\x01\n\x05Owner\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12k\n\x0eid_collections\x18\x02 \x03(\x0b\x32\x1e.chainmain.nft.v1.IDCollectionB$\xc8\xde\x1f\x00\xe2\xde\x1f\rIDCollections\xf2\xde\x1f\x0byaml:\"idcs\"R\ridCollections:\x04\xe8\xa0\x1f\x01\"\x84\x01\n\nCollection\x12\x33\n\x05\x64\x65nom\x18\x01 \x01(\x0b\x32\x17.chainmain.nft.v1.DenomB\x04\xc8\xde\x1f\x00R\x05\x64\x65nom\x12;\n\x04nfts\x18\x02 \x03(\x0b\x32\x19.chainmain.nft.v1.BaseNFTB\x0c\xc8\xde\x1f\x00\xe2\xde\x1f\x04NFTsR\x04nfts:\x04\xe8\xa0\x1f\x01\x42\xb8\x01\n\x14\x63om.chainmain.nft.v1B\x08NftProtoZ2github.com/crypto-org-chain/chain-main/x/nft/types\xa2\x02\x03\x43NX\xaa\x02\x10\x43hainmain.Nft.V1\xca\x02\x10\x43hainmain\\Nft\\V1\xe2\x02\x1c\x43hainmain\\Nft\\V1\\GPBMetadata\xea\x02\x12\x43hainmain::Nft::V1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cryptoorg.nft.v1.nft_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.chainmain.nft.v1B\010NftProtoZ2github.com/crypto-org-chain/chain-main/x/nft/types\242\002\003CNX\252\002\020Chainmain.Nft.V1\312\002\020Chainmain\\Nft\\V1\342\002\034Chainmain\\Nft\\V1\\GPBMetadata\352\002\022Chainmain::Nft::V1\310\341\036\000'
  _globals['_BASENFT'].fields_by_name['uri']._options = None
  _globals['_BASENFT'].fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _globals['_BASENFT']._options = None
  _globals['_BASENFT']._serialized_options = b'\350\240\037\001'
  _globals['_DENOM']._options = None
  _globals['_DENOM']._serialized_options = b'\350\240\037\001'
  _globals['_IDCOLLECTION'].fields_by_name['denom_id']._options = None
  _globals['_IDCOLLECTION'].fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _globals['_IDCOLLECTION'].fields_by_name['token_ids']._options = None
  _globals['_IDCOLLECTION'].fields_by_name['token_ids']._serialized_options = b'\362\336\037\020yaml:\"token_ids\"'
  _globals['_IDCOLLECTION']._options = None
  _globals['_IDCOLLECTION']._serialized_options = b'\350\240\037\001'
  _globals['_OWNER'].fields_by_name['id_collections']._options = None
  _globals['_OWNER'].fields_by_name['id_collections']._serialized_options = b'\310\336\037\000\342\336\037\rIDCollections\362\336\037\013yaml:\"idcs\"'
  _globals['_OWNER']._options = None
  _globals['_OWNER']._serialized_options = b'\350\240\037\001'
  _globals['_COLLECTION'].fields_by_name['denom']._options = None
  _globals['_COLLECTION'].fields_by_name['denom']._serialized_options = b'\310\336\037\000'
  _globals['_COLLECTION'].fields_by_name['nfts']._options = None
  _globals['_COLLECTION'].fields_by_name['nfts']._serialized_options = b'\310\336\037\000\342\336\037\004NFTs'
  _globals['_COLLECTION']._options = None
  _globals['_COLLECTION']._serialized_options = b'\350\240\037\001'
  _globals['_BASENFT']._serialized_start=70
  _globals['_BASENFT']._serialized_end=190
  _globals['_DENOM']._serialized_start=192
  _globals['_DENOM']._serialized_end=309
  _globals['_IDCOLLECTION']._serialized_start=311
  _globals['_IDCOLLECTION']._serialized_end=430
  _globals['_OWNER']._serialized_start=433
  _globals['_OWNER']._serialized_end=581
  _globals['_COLLECTION']._serialized_start=584
  _globals['_COLLECTION']._serialized_end=716
# @@protoc_insertion_point(module_scope)
