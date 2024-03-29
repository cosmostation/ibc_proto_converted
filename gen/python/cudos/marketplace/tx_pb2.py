# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cudos/marketplace/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cudos.marketplace import royalty_pb2 as cudos_dot_marketplace_dot_royalty__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x63udos/marketplace/tx.proto\x12\"cudoventures.cudosnode.marketplace\x1a\x1f\x63udos/marketplace/royalty.proto\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x80\x02\n\x14MsgPublishCollection\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07\x64\x65nomId\x18\x02 \x01(\tR\x07\x64\x65nomId\x12W\n\rmintRoyalties\x18\x03 \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\rmintRoyalties\x12[\n\x0fresaleRoyalties\x18\x04 \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\x0fresaleRoyalties\"\x1e\n\x1cMsgPublishCollectionResponse\"\xc0\x01\n\rMsgPublishNft\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07tokenId\x18\x02 \x01(\tR\x07tokenId\x12\x18\n\x07\x64\x65nomId\x18\x03 \x01(\tR\x07\x64\x65nomId\x12\x61\n\x05price\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05price\"\x17\n\x15MsgPublishNftResponse\"5\n\tMsgBuyNft\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x13\n\x11MsgBuyNftResponse\"\x8d\x02\n\nMsgMintNft\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07\x64\x65nomId\x18\x02 \x01(\tR\x07\x64\x65nomId\x12\x1c\n\trecipient\x18\x03 \x01(\tR\trecipient\x12\x61\n\x05price\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05price\x12\x12\n\x04name\x18\x05 \x01(\tR\x04name\x12\x10\n\x03uri\x18\x06 \x01(\tR\x03uri\x12\x12\n\x04\x64\x61ta\x18\x07 \x01(\tR\x04\x64\x61ta\x12\x10\n\x03uid\x18\x08 \x01(\tR\x03uid\"\x14\n\x12MsgMintNftResponse\"8\n\x0cMsgRemoveNft\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x16\n\x14MsgRemoveNftResponse\"?\n\x13MsgVerifyCollection\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x1d\n\x1bMsgVerifyCollectionResponse\"A\n\x15MsgUnverifyCollection\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\"\x1f\n\x1dMsgUnverifyCollectionResponse\"\xbb\x03\n\x13MsgCreateCollection\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x16\n\x06schema\x18\x04 \x01(\tR\x06schema\x12\x16\n\x06symbol\x18\x05 \x01(\tR\x06symbol\x12\x16\n\x06traits\x18\x06 \x01(\tR\x06traits\x12 \n\x0b\x64\x65scription\x18\x07 \x01(\tR\x0b\x64\x65scription\x12\x16\n\x06minter\x18\x08 \x01(\tR\x06minter\x12\x12\n\x04\x64\x61ta\x18\t \x01(\tR\x04\x64\x61ta\x12W\n\rmintRoyalties\x18\n \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\rmintRoyalties\x12[\n\x0fresaleRoyalties\x18\x0b \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\x0fresaleRoyalties\x12\x1a\n\x08verified\x18\x0c \x01(\x08R\x08verified\"\x1d\n\x1bMsgCreateCollectionResponse\"\xf4\x01\n\x12MsgUpdateRoyalties\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12W\n\rmintRoyalties\x18\x03 \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\rmintRoyalties\x12[\n\x0fresaleRoyalties\x18\x04 \x03(\x0b\x32+.cudoventures.cudosnode.marketplace.RoyaltyB\x04\xc8\xde\x1f\x00R\x0fresaleRoyalties\"\x1c\n\x1aMsgUpdateRoyaltiesResponse\"\x9d\x01\n\x0eMsgUpdatePrice\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x0e\n\x02id\x18\x02 \x01(\x04R\x02id\x12\x61\n\x05price\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05price\"\x18\n\x16MsgUpdatePriceResponse\"A\n\x0bMsgAddAdmin\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x15\n\x13MsgAddAdminResponse\"D\n\x0eMsgRemoveAdmin\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\"\x18\n\x16MsgRemoveAdminResponse2\xa2\x0c\n\x03Msg\x12\x8f\x01\n\x11PublishCollection\x12\x38.cudoventures.cudosnode.marketplace.MsgPublishCollection\x1a@.cudoventures.cudosnode.marketplace.MsgPublishCollectionResponse\x12z\n\nPublishNft\x12\x31.cudoventures.cudosnode.marketplace.MsgPublishNft\x1a\x39.cudoventures.cudosnode.marketplace.MsgPublishNftResponse\x12n\n\x06\x42uyNft\x12-.cudoventures.cudosnode.marketplace.MsgBuyNft\x1a\x35.cudoventures.cudosnode.marketplace.MsgBuyNftResponse\x12q\n\x07MintNft\x12..cudoventures.cudosnode.marketplace.MsgMintNft\x1a\x36.cudoventures.cudosnode.marketplace.MsgMintNftResponse\x12w\n\tRemoveNft\x12\x30.cudoventures.cudosnode.marketplace.MsgRemoveNft\x1a\x38.cudoventures.cudosnode.marketplace.MsgRemoveNftResponse\x12\x8c\x01\n\x10VerifyCollection\x12\x37.cudoventures.cudosnode.marketplace.MsgVerifyCollection\x1a?.cudoventures.cudosnode.marketplace.MsgVerifyCollectionResponse\x12\x92\x01\n\x12UnverifyCollection\x12\x39.cudoventures.cudosnode.marketplace.MsgUnverifyCollection\x1a\x41.cudoventures.cudosnode.marketplace.MsgUnverifyCollectionResponse\x12\x8c\x01\n\x10\x43reateCollection\x12\x37.cudoventures.cudosnode.marketplace.MsgCreateCollection\x1a?.cudoventures.cudosnode.marketplace.MsgCreateCollectionResponse\x12\x89\x01\n\x0fUpdateRoyalties\x12\x36.cudoventures.cudosnode.marketplace.MsgUpdateRoyalties\x1a>.cudoventures.cudosnode.marketplace.MsgUpdateRoyaltiesResponse\x12}\n\x0bUpdatePrice\x12\x32.cudoventures.cudosnode.marketplace.MsgUpdatePrice\x1a:.cudoventures.cudosnode.marketplace.MsgUpdatePriceResponse\x12t\n\x08\x41\x64\x64\x41\x64min\x12/.cudoventures.cudosnode.marketplace.MsgAddAdmin\x1a\x37.cudoventures.cudosnode.marketplace.MsgAddAdminResponse\x12}\n\x0bRemoveAdmin\x12\x32.cudoventures.cudosnode.marketplace.MsgRemoveAdmin\x1a:.cudoventures.cudosnode.marketplace.MsgRemoveAdminResponseB\x91\x02\n&com.cudoventures.cudosnode.marketplaceB\x07TxProtoZ6github.com/CudoVentures/cudos-node/x/marketplace/types\xa2\x02\x03\x43\x43M\xaa\x02\"Cudoventures.Cudosnode.Marketplace\xca\x02\"Cudoventures\\Cudosnode\\Marketplace\xe2\x02.Cudoventures\\Cudosnode\\Marketplace\\GPBMetadata\xea\x02$Cudoventures::Cudosnode::Marketplaceb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cudos.marketplace.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n&com.cudoventures.cudosnode.marketplaceB\007TxProtoZ6github.com/CudoVentures/cudos-node/x/marketplace/types\242\002\003CCM\252\002\"Cudoventures.Cudosnode.Marketplace\312\002\"Cudoventures\\Cudosnode\\Marketplace\342\002.Cudoventures\\Cudosnode\\Marketplace\\GPBMetadata\352\002$Cudoventures::Cudosnode::Marketplace'
  _globals['_MSGPUBLISHCOLLECTION'].fields_by_name['mintRoyalties']._options = None
  _globals['_MSGPUBLISHCOLLECTION'].fields_by_name['mintRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGPUBLISHCOLLECTION'].fields_by_name['resaleRoyalties']._options = None
  _globals['_MSGPUBLISHCOLLECTION'].fields_by_name['resaleRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGPUBLISHNFT'].fields_by_name['price']._options = None
  _globals['_MSGPUBLISHNFT'].fields_by_name['price']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGMINTNFT'].fields_by_name['price']._options = None
  _globals['_MSGMINTNFT'].fields_by_name['price']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGCREATECOLLECTION'].fields_by_name['mintRoyalties']._options = None
  _globals['_MSGCREATECOLLECTION'].fields_by_name['mintRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGCREATECOLLECTION'].fields_by_name['resaleRoyalties']._options = None
  _globals['_MSGCREATECOLLECTION'].fields_by_name['resaleRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGUPDATEROYALTIES'].fields_by_name['mintRoyalties']._options = None
  _globals['_MSGUPDATEROYALTIES'].fields_by_name['mintRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGUPDATEROYALTIES'].fields_by_name['resaleRoyalties']._options = None
  _globals['_MSGUPDATEROYALTIES'].fields_by_name['resaleRoyalties']._serialized_options = b'\310\336\037\000'
  _globals['_MSGUPDATEPRICE'].fields_by_name['price']._options = None
  _globals['_MSGUPDATEPRICE'].fields_by_name['price']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGPUBLISHCOLLECTION']._serialized_start=181
  _globals['_MSGPUBLISHCOLLECTION']._serialized_end=437
  _globals['_MSGPUBLISHCOLLECTIONRESPONSE']._serialized_start=439
  _globals['_MSGPUBLISHCOLLECTIONRESPONSE']._serialized_end=469
  _globals['_MSGPUBLISHNFT']._serialized_start=472
  _globals['_MSGPUBLISHNFT']._serialized_end=664
  _globals['_MSGPUBLISHNFTRESPONSE']._serialized_start=666
  _globals['_MSGPUBLISHNFTRESPONSE']._serialized_end=689
  _globals['_MSGBUYNFT']._serialized_start=691
  _globals['_MSGBUYNFT']._serialized_end=744
  _globals['_MSGBUYNFTRESPONSE']._serialized_start=746
  _globals['_MSGBUYNFTRESPONSE']._serialized_end=765
  _globals['_MSGMINTNFT']._serialized_start=768
  _globals['_MSGMINTNFT']._serialized_end=1037
  _globals['_MSGMINTNFTRESPONSE']._serialized_start=1039
  _globals['_MSGMINTNFTRESPONSE']._serialized_end=1059
  _globals['_MSGREMOVENFT']._serialized_start=1061
  _globals['_MSGREMOVENFT']._serialized_end=1117
  _globals['_MSGREMOVENFTRESPONSE']._serialized_start=1119
  _globals['_MSGREMOVENFTRESPONSE']._serialized_end=1141
  _globals['_MSGVERIFYCOLLECTION']._serialized_start=1143
  _globals['_MSGVERIFYCOLLECTION']._serialized_end=1206
  _globals['_MSGVERIFYCOLLECTIONRESPONSE']._serialized_start=1208
  _globals['_MSGVERIFYCOLLECTIONRESPONSE']._serialized_end=1237
  _globals['_MSGUNVERIFYCOLLECTION']._serialized_start=1239
  _globals['_MSGUNVERIFYCOLLECTION']._serialized_end=1304
  _globals['_MSGUNVERIFYCOLLECTIONRESPONSE']._serialized_start=1306
  _globals['_MSGUNVERIFYCOLLECTIONRESPONSE']._serialized_end=1337
  _globals['_MSGCREATECOLLECTION']._serialized_start=1340
  _globals['_MSGCREATECOLLECTION']._serialized_end=1783
  _globals['_MSGCREATECOLLECTIONRESPONSE']._serialized_start=1785
  _globals['_MSGCREATECOLLECTIONRESPONSE']._serialized_end=1814
  _globals['_MSGUPDATEROYALTIES']._serialized_start=1817
  _globals['_MSGUPDATEROYALTIES']._serialized_end=2061
  _globals['_MSGUPDATEROYALTIESRESPONSE']._serialized_start=2063
  _globals['_MSGUPDATEROYALTIESRESPONSE']._serialized_end=2091
  _globals['_MSGUPDATEPRICE']._serialized_start=2094
  _globals['_MSGUPDATEPRICE']._serialized_end=2251
  _globals['_MSGUPDATEPRICERESPONSE']._serialized_start=2253
  _globals['_MSGUPDATEPRICERESPONSE']._serialized_end=2277
  _globals['_MSGADDADMIN']._serialized_start=2279
  _globals['_MSGADDADMIN']._serialized_end=2344
  _globals['_MSGADDADMINRESPONSE']._serialized_start=2346
  _globals['_MSGADDADMINRESPONSE']._serialized_end=2367
  _globals['_MSGREMOVEADMIN']._serialized_start=2369
  _globals['_MSGREMOVEADMIN']._serialized_end=2437
  _globals['_MSGREMOVEADMINRESPONSE']._serialized_start=2439
  _globals['_MSGREMOVEADMINRESPONSE']._serialized_end=2463
  _globals['_MSG']._serialized_start=2466
  _globals['_MSG']._serialized_end=4036
# @@protoc_insertion_point(module_scope)
