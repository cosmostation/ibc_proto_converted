# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: likechain/likenft/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos.nft.v1beta1 import nft_pb2 as cosmos_dot_nft_dot_v1beta1_dot_nft__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from likechain.iscn import query_pb2 as likechain_dot_iscn_dot_query__pb2
from likechain.likenft.v1 import blind_box_content_pb2 as likechain_dot_likenft_dot_v1_dot_blind__box__content__pb2
from likechain.likenft.v1 import classes_by_account_pb2 as likechain_dot_likenft_dot_v1_dot_classes__by__account__pb2
from likechain.likenft.v1 import classes_by_iscn_pb2 as likechain_dot_likenft_dot_v1_dot_classes__by__iscn__pb2
from likechain.likenft.v1 import listing_pb2 as likechain_dot_likenft_dot_v1_dot_listing__pb2
from likechain.likenft.v1 import offer_pb2 as likechain_dot_likenft_dot_v1_dot_offer__pb2
from likechain.likenft.v1 import params_pb2 as likechain_dot_likenft_dot_v1_dot_params__pb2
from likechain.likenft.v1 import royalty_config_pb2 as likechain_dot_likenft_dot_v1_dot_royalty__config__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n likechain/likenft/v1/query.proto\x12\x14likechain.likenft.v1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1c\x63osmos/nft/v1beta1/nft.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1alikechain/iscn/query.proto\x1a,likechain/likenft/v1/blind_box_content.proto\x1a-likechain/likenft/v1/classes_by_account.proto\x1a*likechain/likenft/v1/classes_by_iscn.proto\x1a\"likechain/likenft/v1/listing.proto\x1a likechain/likenft/v1/offer.proto\x1a!likechain/likenft/v1/params.proto\x1a)likechain/likenft/v1/royalty_config.proto\"\x14\n\x12QueryParamsRequest\"Q\n\x13QueryParamsResponse\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.likechain.likenft.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x89\x01\n\x19QueryClassesByISCNRequest\x12$\n\x0eiscn_id_prefix\x18\x01 \x01(\tR\x0ciscnIdPrefix\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xc6\x01\n\x1aQueryClassesByISCNResponse\x12$\n\x0eiscn_id_prefix\x18\x01 \x01(\tR\x0ciscnIdPrefix\x12\x39\n\x07\x63lasses\x18\x02 \x03(\x0b\x32\x19.cosmos.nft.v1beta1.ClassB\x04\xc8\xde\x1f\x00R\x07\x63lasses\x12G\n\npagination\x18\x03 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"h\n\x1eQueryClassesByISCNIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xbf\x01\n\x1fQueryClassesByISCNIndexResponse\x12S\n\x10\x63lasses_by_iscns\x18\x01 \x03(\x0b\x32#.likechain.likenft.v1.ClassesByISCNB\x04\xc8\xde\x1f\x00R\x0e\x63lassesByIscns\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"4\n\x17QueryISCNByClassRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\"\xcd\x01\n\x18QueryISCNByClassResponse\x12$\n\x0eiscn_id_prefix\x18\x01 \x01(\tR\x0ciscnIdPrefix\x12\x14\n\x05owner\x18\x02 \x01(\tR\x05owner\x12%\n\x0elatest_version\x18\x03 \x01(\x04R\rlatestVersion\x12N\n\rlatest_record\x18\x04 \x01(\x0b\x32#.likechain.iscn.QueryResponseRecordB\x04\xc8\xde\x1f\x00R\x0clatestRecord\"\x80\x01\n\x1cQueryClassesByAccountRequest\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xbd\x01\n\x1dQueryClassesByAccountResponse\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12\x39\n\x07\x63lasses\x18\x02 \x03(\x0b\x32\x19.cosmos.nft.v1beta1.ClassB\x04\xc8\xde\x1f\x00R\x07\x63lasses\x12G\n\npagination\x18\x03 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"k\n!QueryClassesByAccountIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xcb\x01\n\"QueryClassesByAccountIndexResponse\x12\\\n\x13\x63lasses_by_accounts\x18\x01 \x03(\x0b\x32&.likechain.likenft.v1.ClassesByAccountB\x04\xc8\xde\x1f\x00R\x11\x63lassesByAccounts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"7\n\x1aQueryAccountByClassRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\"7\n\x1bQueryAccountByClassResponse\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"H\n\x1bQueryBlindBoxContentRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\"w\n\x1cQueryBlindBoxContentResponse\x12W\n\x11\x62lind_box_content\x18\x01 \x01(\x0b\x32%.likechain.likenft.v1.BlindBoxContentB\x04\xc8\xde\x1f\x00R\x0f\x62lindBoxContent\"j\n QueryBlindBoxContentIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xc7\x01\n!QueryBlindBoxContentIndexResponse\x12Y\n\x12\x62lind_box_contents\x18\x01 \x03(\x0b\x32%.likechain.likenft.v1.BlindBoxContentB\x04\xc8\xde\x1f\x00R\x10\x62lindBoxContents\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x81\x01\n\x1cQueryBlindBoxContentsRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xc3\x01\n\x1dQueryBlindBoxContentsResponse\x12Y\n\x12\x62lind_box_contents\x18\x01 \x03(\x0b\x32%.likechain.likenft.v1.BlindBoxContentB\x04\xc8\xde\x1f\x00R\x10\x62lindBoxContents\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"[\n\x11QueryOfferRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12\x14\n\x05\x62uyer\x18\x03 \x01(\tR\x05\x62uyer\"M\n\x12QueryOfferResponse\x12\x37\n\x05offer\x18\x01 \x01(\x0b\x32\x1b.likechain.likenft.v1.OfferB\x04\xc8\xde\x1f\x00R\x05offer\"`\n\x16QueryOfferIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9d\x01\n\x17QueryOfferIndexResponse\x12\x39\n\x06offers\x18\x01 \x03(\x0b\x32\x1b.likechain.likenft.v1.OfferB\x04\xc8\xde\x1f\x00R\x06offers\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"~\n\x19QueryOffersByClassRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa0\x01\n\x1aQueryOffersByClassResponse\x12\x39\n\x06offers\x18\x01 \x03(\x0b\x32\x1b.likechain.likenft.v1.OfferB\x04\xc8\xde\x1f\x00R\x06offers\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x93\x01\n\x17QueryOffersByNFTRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9e\x01\n\x18QueryOffersByNFTResponse\x12\x39\n\x06offers\x18\x01 \x03(\x0b\x32\x1b.likechain.likenft.v1.OfferB\x04\xc8\xde\x1f\x00R\x06offers\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"_\n\x13QueryListingRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12\x16\n\x06seller\x18\x03 \x01(\tR\x06seller\"U\n\x14QueryListingResponse\x12=\n\x07listing\x18\x01 \x01(\x0b\x32\x1d.likechain.likenft.v1.ListingB\x04\xc8\xde\x1f\x00R\x07listing\"b\n\x18QueryListingIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa5\x01\n\x19QueryListingIndexResponse\x12?\n\x08listings\x18\x01 \x03(\x0b\x32\x1d.likechain.likenft.v1.ListingB\x04\xc8\xde\x1f\x00R\x08listings\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x80\x01\n\x1bQueryListingsByClassRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa8\x01\n\x1cQueryListingsByClassResponse\x12?\n\x08listings\x18\x01 \x03(\x0b\x32\x1d.likechain.likenft.v1.ListingB\x04\xc8\xde\x1f\x00R\x08listings\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x95\x01\n\x19QueryListingsByNFTRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa6\x01\n\x1aQueryListingsByNFTResponse\x12?\n\x08listings\x18\x01 \x03(\x0b\x32\x1d.likechain.likenft.v1.ListingB\x04\xc8\xde\x1f\x00R\x08listings\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"6\n\x19QueryRoyaltyConfigRequest\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\"n\n\x1aQueryRoyaltyConfigResponse\x12P\n\x0eroyalty_config\x18\x01 \x01(\x0b\x32#.likechain.likenft.v1.RoyaltyConfigB\x04\xc8\xde\x1f\x00R\rroyaltyConfig\"h\n\x1eQueryRoyaltyConfigIndexRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xd3\x01\n\x1fQueryRoyaltyConfigIndexResponse\x12g\n\x17royalty_config_by_class\x18\x01 \x03(\x0b\x32*.likechain.likenft.v1.RoyaltyConfigByClassB\x04\xc8\xde\x1f\x00R\x14royaltyConfigByClass\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xf1\x1a\n\x05Query\x12\x83\x01\n\x06Params\x12(.likechain.likenft.v1.QueryParamsRequest\x1a).likechain.likenft.v1.QueryParamsResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/likechain/likenft/v1/params\x12\xaf\x01\n\rClassesByISCN\x12/.likechain.likenft.v1.QueryClassesByISCNRequest\x1a\x30.likechain.likenft.v1.QueryClassesByISCNResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/likechain/likenft/v1/iscn_classes/{iscn_id_prefix}\x12\xad\x01\n\x12\x43lassesByISCNIndex\x12\x34.likechain.likenft.v1.QueryClassesByISCNIndexRequest\x1a\x35.likechain.likenft.v1.QueryClassesByISCNIndexResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/likechain/likenft/v1/iscn_classes\x12\xa3\x01\n\x0bISCNByClass\x12-.likechain.likenft.v1.QueryISCNByClassRequest\x1a..likechain.likenft.v1.QueryISCNByClassResponse\"5\x82\xd3\xe4\x93\x02/\x12-/likechain/likenft/v1/classes/{class_id}/iscn\x12\xb4\x01\n\x10\x43lassesByAccount\x12\x32.likechain.likenft.v1.QueryClassesByAccountRequest\x1a\x33.likechain.likenft.v1.QueryClassesByAccountResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//likechain/likenft/v1/account_classes/{account}\x12\xb9\x01\n\x15\x43lassesByAccountIndex\x12\x37.likechain.likenft.v1.QueryClassesByAccountIndexRequest\x1a\x38.likechain.likenft.v1.QueryClassesByAccountIndexResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/likechain/likenft/v1/account_classes\x12\xaf\x01\n\x0e\x41\x63\x63ountByClass\x12\x30.likechain.likenft.v1.QueryAccountByClassRequest\x1a\x31.likechain.likenft.v1.QueryAccountByClassResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/likechain/likenft/v1/classes/{class_id}/account\x12\xba\x01\n\x0f\x42lindBoxContent\x12\x31.likechain.likenft.v1.QueryBlindBoxContentRequest\x1a\x32.likechain.likenft.v1.QueryBlindBoxContentResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/likechain/likenft/v1/blind_box_contents/{class_id}/{id}\x12\xb9\x01\n\x14\x42lindBoxContentIndex\x12\x36.likechain.likenft.v1.QueryBlindBoxContentIndexRequest\x1a\x37.likechain.likenft.v1.QueryBlindBoxContentIndexResponse\"0\x82\xd3\xe4\x93\x02*\x12(/likechain/likenft/v1/blind_box_contents\x12\xb8\x01\n\x10\x42lindBoxContents\x12\x32.likechain.likenft.v1.QueryBlindBoxContentsRequest\x1a\x33.likechain.likenft.v1.QueryBlindBoxContentsResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/likechain/likenft/v1/blind_box_contents/{class_id}\x12\x9c\x01\n\x05Offer\x12\'.likechain.likenft.v1.QueryOfferRequest\x1a(.likechain.likenft.v1.QueryOfferResponse\"@\x82\xd3\xe4\x93\x02:\x12\x38/likechain/likenft/v1/offers/{class_id}/{nft_id}/{buyer}\x12\x8f\x01\n\nOfferIndex\x12,.likechain.likenft.v1.QueryOfferIndexRequest\x1a-.likechain.likenft.v1.QueryOfferIndexResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/likechain/likenft/v1/offers\x12\xa3\x01\n\rOffersByClass\x12/.likechain.likenft.v1.QueryOffersByClassRequest\x1a\x30.likechain.likenft.v1.QueryOffersByClassResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/likechain/likenft/v1/offers/{class_id}\x12\xa6\x01\n\x0bOffersByNFT\x12-.likechain.likenft.v1.QueryOffersByNFTRequest\x1a..likechain.likenft.v1.QueryOffersByNFTResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/likechain/likenft/v1/offers/{class_id}/{nft_id}\x12\xa5\x01\n\x07Listing\x12).likechain.likenft.v1.QueryListingRequest\x1a*.likechain.likenft.v1.QueryListingResponse\"C\x82\xd3\xe4\x93\x02=\x12;/likechain/likenft/v1/listings/{class_id}/{nft_id}/{seller}\x12\x97\x01\n\x0cListingIndex\x12..likechain.likenft.v1.QueryListingIndexRequest\x1a/.likechain.likenft.v1.QueryListingIndexResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/likechain/likenft/v1/listings\x12\xab\x01\n\x0fListingsByClass\x12\x31.likechain.likenft.v1.QueryListingsByClassRequest\x1a\x32.likechain.likenft.v1.QueryListingsByClassResponse\"1\x82\xd3\xe4\x93\x02+\x12)/likechain/likenft/v1/listings/{class_id}\x12\xae\x01\n\rListingsByNFT\x12/.likechain.likenft.v1.QueryListingsByNFTRequest\x1a\x30.likechain.likenft.v1.QueryListingsByNFTResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/likechain/likenft/v1/listings/{class_id}/{nft_id}\x12\xac\x01\n\rRoyaltyConfig\x12/.likechain.likenft.v1.QueryRoyaltyConfigRequest\x1a\x30.likechain.likenft.v1.QueryRoyaltyConfigResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/likechain/likenft/v1/royalty_configs/{class_id}\x12\xb0\x01\n\x12RoyaltyConfigIndex\x12\x34.likechain.likenft.v1.QueryRoyaltyConfigIndexRequest\x1a\x35.likechain.likenft.v1.QueryRoyaltyConfigIndexResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/likechain/likenft/v1/royalty_configsB\xcd\x01\n\x18\x63om.likechain.likenft.v1B\nQueryProtoZ5github.com/likecoin/likecoin-chain/v4/x/likenft/types\xa2\x02\x03LLX\xaa\x02\x14Likechain.Likenft.V1\xca\x02\x14Likechain\\Likenft\\V1\xe2\x02 Likechain\\Likenft\\V1\\GPBMetadata\xea\x02\x16Likechain::Likenft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'likechain.likenft.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.likechain.likenft.v1B\nQueryProtoZ5github.com/likecoin/likecoin-chain/v4/x/likenft/types\242\002\003LLX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\Likenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMetadata\352\002\026Likechain::Likenft::V1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYCLASSESBYISCNRESPONSE'].fields_by_name['classes']._options = None
  _globals['_QUERYCLASSESBYISCNRESPONSE'].fields_by_name['classes']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYCLASSESBYISCNINDEXRESPONSE'].fields_by_name['classes_by_iscns']._options = None
  _globals['_QUERYCLASSESBYISCNINDEXRESPONSE'].fields_by_name['classes_by_iscns']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYISCNBYCLASSRESPONSE'].fields_by_name['latest_record']._options = None
  _globals['_QUERYISCNBYCLASSRESPONSE'].fields_by_name['latest_record']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYCLASSESBYACCOUNTRESPONSE'].fields_by_name['classes']._options = None
  _globals['_QUERYCLASSESBYACCOUNTRESPONSE'].fields_by_name['classes']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYCLASSESBYACCOUNTINDEXRESPONSE'].fields_by_name['classes_by_accounts']._options = None
  _globals['_QUERYCLASSESBYACCOUNTINDEXRESPONSE'].fields_by_name['classes_by_accounts']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYBLINDBOXCONTENTRESPONSE'].fields_by_name['blind_box_content']._options = None
  _globals['_QUERYBLINDBOXCONTENTRESPONSE'].fields_by_name['blind_box_content']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYBLINDBOXCONTENTINDEXRESPONSE'].fields_by_name['blind_box_contents']._options = None
  _globals['_QUERYBLINDBOXCONTENTINDEXRESPONSE'].fields_by_name['blind_box_contents']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYBLINDBOXCONTENTSRESPONSE'].fields_by_name['blind_box_contents']._options = None
  _globals['_QUERYBLINDBOXCONTENTSRESPONSE'].fields_by_name['blind_box_contents']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYOFFERRESPONSE'].fields_by_name['offer']._options = None
  _globals['_QUERYOFFERRESPONSE'].fields_by_name['offer']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYOFFERINDEXRESPONSE'].fields_by_name['offers']._options = None
  _globals['_QUERYOFFERINDEXRESPONSE'].fields_by_name['offers']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYOFFERSBYCLASSRESPONSE'].fields_by_name['offers']._options = None
  _globals['_QUERYOFFERSBYCLASSRESPONSE'].fields_by_name['offers']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYOFFERSBYNFTRESPONSE'].fields_by_name['offers']._options = None
  _globals['_QUERYOFFERSBYNFTRESPONSE'].fields_by_name['offers']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYLISTINGRESPONSE'].fields_by_name['listing']._options = None
  _globals['_QUERYLISTINGRESPONSE'].fields_by_name['listing']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYLISTINGINDEXRESPONSE'].fields_by_name['listings']._options = None
  _globals['_QUERYLISTINGINDEXRESPONSE'].fields_by_name['listings']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYLISTINGSBYCLASSRESPONSE'].fields_by_name['listings']._options = None
  _globals['_QUERYLISTINGSBYCLASSRESPONSE'].fields_by_name['listings']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYLISTINGSBYNFTRESPONSE'].fields_by_name['listings']._options = None
  _globals['_QUERYLISTINGSBYNFTRESPONSE'].fields_by_name['listings']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYROYALTYCONFIGRESPONSE'].fields_by_name['royalty_config']._options = None
  _globals['_QUERYROYALTYCONFIGRESPONSE'].fields_by_name['royalty_config']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYROYALTYCONFIGINDEXRESPONSE'].fields_by_name['royalty_config_by_class']._options = None
  _globals['_QUERYROYALTYCONFIGINDEXRESPONSE'].fields_by_name['royalty_config_by_class']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\036\022\034/likechain/likenft/v1/params'
  _globals['_QUERY'].methods_by_name['ClassesByISCN']._options = None
  _globals['_QUERY'].methods_by_name['ClassesByISCN']._serialized_options = b'\202\323\344\223\0025\0223/likechain/likenft/v1/iscn_classes/{iscn_id_prefix}'
  _globals['_QUERY'].methods_by_name['ClassesByISCNIndex']._options = None
  _globals['_QUERY'].methods_by_name['ClassesByISCNIndex']._serialized_options = b'\202\323\344\223\002$\022\"/likechain/likenft/v1/iscn_classes'
  _globals['_QUERY'].methods_by_name['ISCNByClass']._options = None
  _globals['_QUERY'].methods_by_name['ISCNByClass']._serialized_options = b'\202\323\344\223\002/\022-/likechain/likenft/v1/classes/{class_id}/iscn'
  _globals['_QUERY'].methods_by_name['ClassesByAccount']._options = None
  _globals['_QUERY'].methods_by_name['ClassesByAccount']._serialized_options = b'\202\323\344\223\0021\022//likechain/likenft/v1/account_classes/{account}'
  _globals['_QUERY'].methods_by_name['ClassesByAccountIndex']._options = None
  _globals['_QUERY'].methods_by_name['ClassesByAccountIndex']._serialized_options = b'\202\323\344\223\002\'\022%/likechain/likenft/v1/account_classes'
  _globals['_QUERY'].methods_by_name['AccountByClass']._options = None
  _globals['_QUERY'].methods_by_name['AccountByClass']._serialized_options = b'\202\323\344\223\0022\0220/likechain/likenft/v1/classes/{class_id}/account'
  _globals['_QUERY'].methods_by_name['BlindBoxContent']._options = None
  _globals['_QUERY'].methods_by_name['BlindBoxContent']._serialized_options = b'\202\323\344\223\002:\0228/likechain/likenft/v1/blind_box_contents/{class_id}/{id}'
  _globals['_QUERY'].methods_by_name['BlindBoxContentIndex']._options = None
  _globals['_QUERY'].methods_by_name['BlindBoxContentIndex']._serialized_options = b'\202\323\344\223\002*\022(/likechain/likenft/v1/blind_box_contents'
  _globals['_QUERY'].methods_by_name['BlindBoxContents']._options = None
  _globals['_QUERY'].methods_by_name['BlindBoxContents']._serialized_options = b'\202\323\344\223\0025\0223/likechain/likenft/v1/blind_box_contents/{class_id}'
  _globals['_QUERY'].methods_by_name['Offer']._options = None
  _globals['_QUERY'].methods_by_name['Offer']._serialized_options = b'\202\323\344\223\002:\0228/likechain/likenft/v1/offers/{class_id}/{nft_id}/{buyer}'
  _globals['_QUERY'].methods_by_name['OfferIndex']._options = None
  _globals['_QUERY'].methods_by_name['OfferIndex']._serialized_options = b'\202\323\344\223\002\036\022\034/likechain/likenft/v1/offers'
  _globals['_QUERY'].methods_by_name['OffersByClass']._options = None
  _globals['_QUERY'].methods_by_name['OffersByClass']._serialized_options = b'\202\323\344\223\002)\022\'/likechain/likenft/v1/offers/{class_id}'
  _globals['_QUERY'].methods_by_name['OffersByNFT']._options = None
  _globals['_QUERY'].methods_by_name['OffersByNFT']._serialized_options = b'\202\323\344\223\0022\0220/likechain/likenft/v1/offers/{class_id}/{nft_id}'
  _globals['_QUERY'].methods_by_name['Listing']._options = None
  _globals['_QUERY'].methods_by_name['Listing']._serialized_options = b'\202\323\344\223\002=\022;/likechain/likenft/v1/listings/{class_id}/{nft_id}/{seller}'
  _globals['_QUERY'].methods_by_name['ListingIndex']._options = None
  _globals['_QUERY'].methods_by_name['ListingIndex']._serialized_options = b'\202\323\344\223\002 \022\036/likechain/likenft/v1/listings'
  _globals['_QUERY'].methods_by_name['ListingsByClass']._options = None
  _globals['_QUERY'].methods_by_name['ListingsByClass']._serialized_options = b'\202\323\344\223\002+\022)/likechain/likenft/v1/listings/{class_id}'
  _globals['_QUERY'].methods_by_name['ListingsByNFT']._options = None
  _globals['_QUERY'].methods_by_name['ListingsByNFT']._serialized_options = b'\202\323\344\223\0024\0222/likechain/likenft/v1/listings/{class_id}/{nft_id}'
  _globals['_QUERY'].methods_by_name['RoyaltyConfig']._options = None
  _globals['_QUERY'].methods_by_name['RoyaltyConfig']._serialized_options = b'\202\323\344\223\0022\0220/likechain/likenft/v1/royalty_configs/{class_id}'
  _globals['_QUERY'].methods_by_name['RoyaltyConfigIndex']._options = None
  _globals['_QUERY'].methods_by_name['RoyaltyConfigIndex']._serialized_options = b'\202\323\344\223\002\'\022%/likechain/likenft/v1/royalty_configs'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=497
  _globals['_QUERYPARAMSREQUEST']._serialized_end=517
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=519
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=600
  _globals['_QUERYCLASSESBYISCNREQUEST']._serialized_start=603
  _globals['_QUERYCLASSESBYISCNREQUEST']._serialized_end=740
  _globals['_QUERYCLASSESBYISCNRESPONSE']._serialized_start=743
  _globals['_QUERYCLASSESBYISCNRESPONSE']._serialized_end=941
  _globals['_QUERYCLASSESBYISCNINDEXREQUEST']._serialized_start=943
  _globals['_QUERYCLASSESBYISCNINDEXREQUEST']._serialized_end=1047
  _globals['_QUERYCLASSESBYISCNINDEXRESPONSE']._serialized_start=1050
  _globals['_QUERYCLASSESBYISCNINDEXRESPONSE']._serialized_end=1241
  _globals['_QUERYISCNBYCLASSREQUEST']._serialized_start=1243
  _globals['_QUERYISCNBYCLASSREQUEST']._serialized_end=1295
  _globals['_QUERYISCNBYCLASSRESPONSE']._serialized_start=1298
  _globals['_QUERYISCNBYCLASSRESPONSE']._serialized_end=1503
  _globals['_QUERYCLASSESBYACCOUNTREQUEST']._serialized_start=1506
  _globals['_QUERYCLASSESBYACCOUNTREQUEST']._serialized_end=1634
  _globals['_QUERYCLASSESBYACCOUNTRESPONSE']._serialized_start=1637
  _globals['_QUERYCLASSESBYACCOUNTRESPONSE']._serialized_end=1826
  _globals['_QUERYCLASSESBYACCOUNTINDEXREQUEST']._serialized_start=1828
  _globals['_QUERYCLASSESBYACCOUNTINDEXREQUEST']._serialized_end=1935
  _globals['_QUERYCLASSESBYACCOUNTINDEXRESPONSE']._serialized_start=1938
  _globals['_QUERYCLASSESBYACCOUNTINDEXRESPONSE']._serialized_end=2141
  _globals['_QUERYACCOUNTBYCLASSREQUEST']._serialized_start=2143
  _globals['_QUERYACCOUNTBYCLASSREQUEST']._serialized_end=2198
  _globals['_QUERYACCOUNTBYCLASSRESPONSE']._serialized_start=2200
  _globals['_QUERYACCOUNTBYCLASSRESPONSE']._serialized_end=2255
  _globals['_QUERYBLINDBOXCONTENTREQUEST']._serialized_start=2257
  _globals['_QUERYBLINDBOXCONTENTREQUEST']._serialized_end=2329
  _globals['_QUERYBLINDBOXCONTENTRESPONSE']._serialized_start=2331
  _globals['_QUERYBLINDBOXCONTENTRESPONSE']._serialized_end=2450
  _globals['_QUERYBLINDBOXCONTENTINDEXREQUEST']._serialized_start=2452
  _globals['_QUERYBLINDBOXCONTENTINDEXREQUEST']._serialized_end=2558
  _globals['_QUERYBLINDBOXCONTENTINDEXRESPONSE']._serialized_start=2561
  _globals['_QUERYBLINDBOXCONTENTINDEXRESPONSE']._serialized_end=2760
  _globals['_QUERYBLINDBOXCONTENTSREQUEST']._serialized_start=2763
  _globals['_QUERYBLINDBOXCONTENTSREQUEST']._serialized_end=2892
  _globals['_QUERYBLINDBOXCONTENTSRESPONSE']._serialized_start=2895
  _globals['_QUERYBLINDBOXCONTENTSRESPONSE']._serialized_end=3090
  _globals['_QUERYOFFERREQUEST']._serialized_start=3092
  _globals['_QUERYOFFERREQUEST']._serialized_end=3183
  _globals['_QUERYOFFERRESPONSE']._serialized_start=3185
  _globals['_QUERYOFFERRESPONSE']._serialized_end=3262
  _globals['_QUERYOFFERINDEXREQUEST']._serialized_start=3264
  _globals['_QUERYOFFERINDEXREQUEST']._serialized_end=3360
  _globals['_QUERYOFFERINDEXRESPONSE']._serialized_start=3363
  _globals['_QUERYOFFERINDEXRESPONSE']._serialized_end=3520
  _globals['_QUERYOFFERSBYCLASSREQUEST']._serialized_start=3522
  _globals['_QUERYOFFERSBYCLASSREQUEST']._serialized_end=3648
  _globals['_QUERYOFFERSBYCLASSRESPONSE']._serialized_start=3651
  _globals['_QUERYOFFERSBYCLASSRESPONSE']._serialized_end=3811
  _globals['_QUERYOFFERSBYNFTREQUEST']._serialized_start=3814
  _globals['_QUERYOFFERSBYNFTREQUEST']._serialized_end=3961
  _globals['_QUERYOFFERSBYNFTRESPONSE']._serialized_start=3964
  _globals['_QUERYOFFERSBYNFTRESPONSE']._serialized_end=4122
  _globals['_QUERYLISTINGREQUEST']._serialized_start=4124
  _globals['_QUERYLISTINGREQUEST']._serialized_end=4219
  _globals['_QUERYLISTINGRESPONSE']._serialized_start=4221
  _globals['_QUERYLISTINGRESPONSE']._serialized_end=4306
  _globals['_QUERYLISTINGINDEXREQUEST']._serialized_start=4308
  _globals['_QUERYLISTINGINDEXREQUEST']._serialized_end=4406
  _globals['_QUERYLISTINGINDEXRESPONSE']._serialized_start=4409
  _globals['_QUERYLISTINGINDEXRESPONSE']._serialized_end=4574
  _globals['_QUERYLISTINGSBYCLASSREQUEST']._serialized_start=4577
  _globals['_QUERYLISTINGSBYCLASSREQUEST']._serialized_end=4705
  _globals['_QUERYLISTINGSBYCLASSRESPONSE']._serialized_start=4708
  _globals['_QUERYLISTINGSBYCLASSRESPONSE']._serialized_end=4876
  _globals['_QUERYLISTINGSBYNFTREQUEST']._serialized_start=4879
  _globals['_QUERYLISTINGSBYNFTREQUEST']._serialized_end=5028
  _globals['_QUERYLISTINGSBYNFTRESPONSE']._serialized_start=5031
  _globals['_QUERYLISTINGSBYNFTRESPONSE']._serialized_end=5197
  _globals['_QUERYROYALTYCONFIGREQUEST']._serialized_start=5199
  _globals['_QUERYROYALTYCONFIGREQUEST']._serialized_end=5253
  _globals['_QUERYROYALTYCONFIGRESPONSE']._serialized_start=5255
  _globals['_QUERYROYALTYCONFIGRESPONSE']._serialized_end=5365
  _globals['_QUERYROYALTYCONFIGINDEXREQUEST']._serialized_start=5367
  _globals['_QUERYROYALTYCONFIGINDEXREQUEST']._serialized_end=5471
  _globals['_QUERYROYALTYCONFIGINDEXRESPONSE']._serialized_start=5474
  _globals['_QUERYROYALTYCONFIGINDEXRESPONSE']._serialized_end=5685
  _globals['_QUERY']._serialized_start=5688
  _globals['_QUERY']._serialized_end=9129
# @@protoc_insertion_point(module_scope)
