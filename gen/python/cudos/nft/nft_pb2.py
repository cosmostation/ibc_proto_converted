# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cudos/nft/nft.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13\x63udos/nft/nft.proto\x12\x17\x63udosnode.cudosnode.nft\x1a\x14gogoproto/gogo.proto\"\xd9\x01\n\x07\x42\x61seNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12 \n\x03uri\x18\x03 \x01(\tB\x0e\xe2\xde\x1f\x03URI\xea\xde\x1f\x03uriR\x03uri\x12\x1c\n\x04\x64\x61ta\x18\x04 \x01(\tB\x08\xea\xde\x1f\x04\x64\x61taR\x04\x64\x61ta\x12\x14\n\x05owner\x18\x05 \x01(\tR\x05owner\x12N\n\x11\x61pprovedAddresses\x18\x06 \x03(\tB \xea\xde\x1f\x1c\x61pproved_addresses,omitemptyR\x11\x61pprovedAddresses:\x04\xe8\xa0\x1f\x01\"\xcb\x02\n\x05\x44\x65nom\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xea\xde\x1f\x02idR\x02id\x12\x1c\n\x04name\x18\x02 \x01(\tB\x08\xea\xde\x1f\x04nameR\x04name\x12\"\n\x06schema\x18\x03 \x01(\tB\n\xea\xde\x1f\x06schemaR\x06schema\x12%\n\x07\x63reator\x18\x04 \x01(\tB\x0b\xea\xde\x1f\x07\x63reatorR\x07\x63reator\x12\"\n\x06symbol\x18\x05 \x01(\tB\n\xea\xde\x1f\x06symbolR\x06symbol\x12\"\n\x06traits\x18\x06 \x01(\tB\n\xea\xde\x1f\x06traitsR\x06traits\x12\"\n\x06minter\x18\x07 \x01(\tB\n\xea\xde\x1f\x06minterR\x06minter\x12\x31\n\x0b\x64\x65scription\x18\x08 \x01(\tB\x0f\xea\xde\x1f\x0b\x64\x65scriptionR\x0b\x64\x65scription\x12\x1c\n\x04\x64\x61ta\x18\t \x01(\tB\x08\xea\xde\x1f\x04\x64\x61taR\x04\x64\x61ta:\x04\xe8\xa0\x1f\x01\"w\n\x0cIDCollection\x12.\n\x08\x64\x65nom_id\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x31\n\ttoken_ids\x18\x02 \x03(\tB\x14\xf2\xde\x1f\x10yaml:\"token_ids\"R\x08tokenIds:\x04\xe8\xa0\x1f\x01\"\x9b\x01\n\x05Owner\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12r\n\x0eid_collections\x18\x02 \x03(\x0b\x32%.cudosnode.cudosnode.nft.IDCollectionB$\xc8\xde\x1f\x00\xe2\xde\x1f\rIDCollections\xf2\xde\x1f\x0byaml:\"idcs\"R\ridCollections:\x04\xe8\xa0\x1f\x01\"\x92\x01\n\nCollection\x12:\n\x05\x64\x65nom\x18\x01 \x01(\x0b\x32\x1e.cudosnode.cudosnode.nft.DenomB\x04\xc8\xde\x1f\x00R\x05\x64\x65nom\x12\x42\n\x04nfts\x18\x02 \x03(\x0b\x32 .cudosnode.cudosnode.nft.BaseNFTB\x0c\xc8\xde\x1f\x00\xe2\xde\x1f\x04NFTsR\x04nfts:\x04\xe8\xa0\x1f\x01\"\x80\x02\n\x11\x41pprovedAddresses\x12o\n\x11\x61pprovedAddresses\x18\x01 \x03(\x0b\x32\x41.cudosnode.cudosnode.nft.ApprovedAddresses.ApprovedAddressesEntryR\x11\x61pprovedAddresses\x1at\n\x16\x41pprovedAddressesEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x44\n\x05value\x18\x02 \x01(\x0b\x32..cudosnode.cudosnode.nft.ApprovedAddressesDataR\x05value:\x02\x38\x01:\x04\xe8\xa0\x1f\x01\"\xe8\x01\n\x15\x41pprovedAddressesData\x12\x7f\n\x15\x61pprovedAddressesData\x18\x01 \x03(\x0b\x32I.cudosnode.cudosnode.nft.ApprovedAddressesData.ApprovedAddressesDataEntryR\x15\x61pprovedAddressesData\x1aH\n\x1a\x41pprovedAddressesDataEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x08R\x05value:\x02\x38\x01:\x04\xe8\xa0\x1f\x01\x42\xd9\x01\n\x1b\x63om.cudosnode.cudosnode.nftB\x08NftProtoP\x01Z.github.com/CudoVentures/cudos-node/x/nft/types\xa2\x02\x03\x43\x43N\xaa\x02\x17\x43udosnode.Cudosnode.Nft\xca\x02\x17\x43udosnode\\Cudosnode\\Nft\xe2\x02#Cudosnode\\Cudosnode\\Nft\\GPBMetadata\xea\x02\x19\x43udosnode::Cudosnode::Nft\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cudos.nft.nft_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.cudosnode.cudosnode.nftB\010NftProtoP\001Z.github.com/CudoVentures/cudos-node/x/nft/types\242\002\003CCN\252\002\027Cudosnode.Cudosnode.Nft\312\002\027Cudosnode\\Cudosnode\\Nft\342\002#Cudosnode\\Cudosnode\\Nft\\GPBMetadata\352\002\031Cudosnode::Cudosnode::Nft\310\341\036\000'
  _BASENFT.fields_by_name['uri']._options = None
  _BASENFT.fields_by_name['uri']._serialized_options = b'\342\336\037\003URI\352\336\037\003uri'
  _BASENFT.fields_by_name['data']._options = None
  _BASENFT.fields_by_name['data']._serialized_options = b'\352\336\037\004data'
  _BASENFT.fields_by_name['approvedAddresses']._options = None
  _BASENFT.fields_by_name['approvedAddresses']._serialized_options = b'\352\336\037\034approved_addresses,omitempty'
  _BASENFT._options = None
  _BASENFT._serialized_options = b'\350\240\037\001'
  _DENOM.fields_by_name['id']._options = None
  _DENOM.fields_by_name['id']._serialized_options = b'\352\336\037\002id'
  _DENOM.fields_by_name['name']._options = None
  _DENOM.fields_by_name['name']._serialized_options = b'\352\336\037\004name'
  _DENOM.fields_by_name['schema']._options = None
  _DENOM.fields_by_name['schema']._serialized_options = b'\352\336\037\006schema'
  _DENOM.fields_by_name['creator']._options = None
  _DENOM.fields_by_name['creator']._serialized_options = b'\352\336\037\007creator'
  _DENOM.fields_by_name['symbol']._options = None
  _DENOM.fields_by_name['symbol']._serialized_options = b'\352\336\037\006symbol'
  _DENOM.fields_by_name['traits']._options = None
  _DENOM.fields_by_name['traits']._serialized_options = b'\352\336\037\006traits'
  _DENOM.fields_by_name['minter']._options = None
  _DENOM.fields_by_name['minter']._serialized_options = b'\352\336\037\006minter'
  _DENOM.fields_by_name['description']._options = None
  _DENOM.fields_by_name['description']._serialized_options = b'\352\336\037\013description'
  _DENOM.fields_by_name['data']._options = None
  _DENOM.fields_by_name['data']._serialized_options = b'\352\336\037\004data'
  _DENOM._options = None
  _DENOM._serialized_options = b'\350\240\037\001'
  _IDCOLLECTION.fields_by_name['denom_id']._options = None
  _IDCOLLECTION.fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _IDCOLLECTION.fields_by_name['token_ids']._options = None
  _IDCOLLECTION.fields_by_name['token_ids']._serialized_options = b'\362\336\037\020yaml:\"token_ids\"'
  _IDCOLLECTION._options = None
  _IDCOLLECTION._serialized_options = b'\350\240\037\001'
  _OWNER.fields_by_name['id_collections']._options = None
  _OWNER.fields_by_name['id_collections']._serialized_options = b'\310\336\037\000\342\336\037\rIDCollections\362\336\037\013yaml:\"idcs\"'
  _OWNER._options = None
  _OWNER._serialized_options = b'\350\240\037\001'
  _COLLECTION.fields_by_name['denom']._options = None
  _COLLECTION.fields_by_name['denom']._serialized_options = b'\310\336\037\000'
  _COLLECTION.fields_by_name['nfts']._options = None
  _COLLECTION.fields_by_name['nfts']._serialized_options = b'\310\336\037\000\342\336\037\004NFTs'
  _COLLECTION._options = None
  _COLLECTION._serialized_options = b'\350\240\037\001'
  _APPROVEDADDRESSES_APPROVEDADDRESSESENTRY._options = None
  _APPROVEDADDRESSES_APPROVEDADDRESSESENTRY._serialized_options = b'8\001'
  _APPROVEDADDRESSES._options = None
  _APPROVEDADDRESSES._serialized_options = b'\350\240\037\001'
  _APPROVEDADDRESSESDATA_APPROVEDADDRESSESDATAENTRY._options = None
  _APPROVEDADDRESSESDATA_APPROVEDADDRESSESDATAENTRY._serialized_options = b'8\001'
  _APPROVEDADDRESSESDATA._options = None
  _APPROVEDADDRESSESDATA._serialized_options = b'\350\240\037\001'
  _globals['_BASENFT']._serialized_start=71
  _globals['_BASENFT']._serialized_end=288
  _globals['_DENOM']._serialized_start=291
  _globals['_DENOM']._serialized_end=622
  _globals['_IDCOLLECTION']._serialized_start=624
  _globals['_IDCOLLECTION']._serialized_end=743
  _globals['_OWNER']._serialized_start=746
  _globals['_OWNER']._serialized_end=901
  _globals['_COLLECTION']._serialized_start=904
  _globals['_COLLECTION']._serialized_end=1050
  _globals['_APPROVEDADDRESSES']._serialized_start=1053
  _globals['_APPROVEDADDRESSES']._serialized_end=1309
  _globals['_APPROVEDADDRESSES_APPROVEDADDRESSESENTRY']._serialized_start=1187
  _globals['_APPROVEDADDRESSES_APPROVEDADDRESSESENTRY']._serialized_end=1303
  _globals['_APPROVEDADDRESSESDATA']._serialized_start=1312
  _globals['_APPROVEDADDRESSESDATA']._serialized_end=1544
  _globals['_APPROVEDADDRESSESDATA_APPROVEDADDRESSESDATAENTRY']._serialized_start=1466
  _globals['_APPROVEDADDRESSESDATA_APPROVEDADDRESSESDATAENTRY']._serialized_end=1538
# @@protoc_insertion_point(module_scope)