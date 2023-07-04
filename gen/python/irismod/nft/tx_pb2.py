# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/nft/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x14irismod/nft/tx.proto\x12\x0birismod.nft\x1a\x14gogoproto/gogo.proto\"\xd7\x01\n\rMsgIssueDenom\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x16\n\x06schema\x18\x03 \x01(\tR\x06schema\x12\x16\n\x06sender\x18\x04 \x01(\tR\x06sender\x12\x16\n\x06symbol\x18\x05 \x01(\tR\x06symbol\x12\'\n\x0fmint_restricted\x18\x06 \x01(\x08R\x0emintRestricted\x12+\n\x11update_restricted\x18\x07 \x01(\x08R\x10updateRestricted:\x04\xe8\xa0\x1f\x01\"\x17\n\x15MsgIssueDenomResponse\"\xcf\x01\n\x0eMsgTransferNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12.\n\x08\x64\x65nom_id\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x19\n\x03uri\x18\x04 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12\x12\n\x04\x64\x61ta\x18\x05 \x01(\tR\x04\x64\x61ta\x12\x16\n\x06sender\x18\x06 \x01(\tR\x06sender\x12\x1c\n\trecipient\x18\x07 \x01(\tR\trecipient:\x04\xe8\xa0\x1f\x01\"\x18\n\x16MsgTransferNFTResponse\"\xad\x01\n\nMsgEditNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12.\n\x08\x64\x65nom_id\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x19\n\x03uri\x18\x04 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12\x12\n\x04\x64\x61ta\x18\x05 \x01(\tR\x04\x64\x61ta\x12\x16\n\x06sender\x18\x06 \x01(\tR\x06sender:\x04\xe8\xa0\x1f\x01\"\x14\n\x12MsgEditNFTResponse\"\xcb\x01\n\nMsgMintNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12.\n\x08\x64\x65nom_id\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12\x19\n\x03uri\x18\x04 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12\x12\n\x04\x64\x61ta\x18\x05 \x01(\tR\x04\x64\x61ta\x12\x16\n\x06sender\x18\x06 \x01(\tR\x06sender\x12\x1c\n\trecipient\x18\x07 \x01(\tR\trecipient:\x04\xe8\xa0\x1f\x01\"\x14\n\x12MsgMintNFTResponse\"j\n\nMsgBurnNFT\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12.\n\x08\x64\x65nom_id\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"denom_id\"R\x07\x64\x65nomId\x12\x16\n\x06sender\x18\x03 \x01(\tR\x06sender:\x04\xe8\xa0\x1f\x01\"\x14\n\x12MsgBurnNFTResponse\"^\n\x10MsgTransferDenom\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12\x1c\n\trecipient\x18\x03 \x01(\tR\trecipient:\x04\xe8\xa0\x1f\x01\"\x1a\n\x18MsgTransferDenomResponse2\xca\x03\n\x03Msg\x12L\n\nIssueDenom\x12\x1a.irismod.nft.MsgIssueDenom\x1a\".irismod.nft.MsgIssueDenomResponse\x12\x43\n\x07MintNFT\x12\x17.irismod.nft.MsgMintNFT\x1a\x1f.irismod.nft.MsgMintNFTResponse\x12\x43\n\x07\x45\x64itNFT\x12\x17.irismod.nft.MsgEditNFT\x1a\x1f.irismod.nft.MsgEditNFTResponse\x12O\n\x0bTransferNFT\x12\x1b.irismod.nft.MsgTransferNFT\x1a#.irismod.nft.MsgTransferNFTResponse\x12\x43\n\x07\x42urnNFT\x12\x17.irismod.nft.MsgBurnNFT\x1a\x1f.irismod.nft.MsgBurnNFTResponse\x12U\n\rTransferDenom\x12\x1d.irismod.nft.MsgTransferDenom\x1a%.irismod.nft.MsgTransferDenomResponseB\x99\x01\n\x0f\x63om.irismod.nftB\x07TxProtoP\x01Z,github.com/irisnet/irismod/modules/nft/types\xa2\x02\x03INX\xaa\x02\x0bIrismod.Nft\xca\x02\x0bIrismod\\Nft\xe2\x02\x17Irismod\\Nft\\GPBMetadata\xea\x02\x0cIrismod::Nft\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.nft.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\017com.irismod.nftB\007TxProtoP\001Z,github.com/irisnet/irismod/modules/nft/types\242\002\003INX\252\002\013Irismod.Nft\312\002\013Irismod\\Nft\342\002\027Irismod\\Nft\\GPBMetadata\352\002\014Irismod::Nft\310\341\036\000'
  _MSGISSUEDENOM._options = None
  _MSGISSUEDENOM._serialized_options = b'\350\240\037\001'
  _MSGTRANSFERNFT.fields_by_name['denom_id']._options = None
  _MSGTRANSFERNFT.fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _MSGTRANSFERNFT.fields_by_name['uri']._options = None
  _MSGTRANSFERNFT.fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _MSGTRANSFERNFT._options = None
  _MSGTRANSFERNFT._serialized_options = b'\350\240\037\001'
  _MSGEDITNFT.fields_by_name['denom_id']._options = None
  _MSGEDITNFT.fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _MSGEDITNFT.fields_by_name['uri']._options = None
  _MSGEDITNFT.fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _MSGEDITNFT._options = None
  _MSGEDITNFT._serialized_options = b'\350\240\037\001'
  _MSGMINTNFT.fields_by_name['denom_id']._options = None
  _MSGMINTNFT.fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _MSGMINTNFT.fields_by_name['uri']._options = None
  _MSGMINTNFT.fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _MSGMINTNFT._options = None
  _MSGMINTNFT._serialized_options = b'\350\240\037\001'
  _MSGBURNNFT.fields_by_name['denom_id']._options = None
  _MSGBURNNFT.fields_by_name['denom_id']._serialized_options = b'\362\336\037\017yaml:\"denom_id\"'
  _MSGBURNNFT._options = None
  _MSGBURNNFT._serialized_options = b'\350\240\037\001'
  _MSGTRANSFERDENOM._options = None
  _MSGTRANSFERDENOM._serialized_options = b'\350\240\037\001'
  _globals['_MSGISSUEDENOM']._serialized_start=60
  _globals['_MSGISSUEDENOM']._serialized_end=275
  _globals['_MSGISSUEDENOMRESPONSE']._serialized_start=277
  _globals['_MSGISSUEDENOMRESPONSE']._serialized_end=300
  _globals['_MSGTRANSFERNFT']._serialized_start=303
  _globals['_MSGTRANSFERNFT']._serialized_end=510
  _globals['_MSGTRANSFERNFTRESPONSE']._serialized_start=512
  _globals['_MSGTRANSFERNFTRESPONSE']._serialized_end=536
  _globals['_MSGEDITNFT']._serialized_start=539
  _globals['_MSGEDITNFT']._serialized_end=712
  _globals['_MSGEDITNFTRESPONSE']._serialized_start=714
  _globals['_MSGEDITNFTRESPONSE']._serialized_end=734
  _globals['_MSGMINTNFT']._serialized_start=737
  _globals['_MSGMINTNFT']._serialized_end=940
  _globals['_MSGMINTNFTRESPONSE']._serialized_start=942
  _globals['_MSGMINTNFTRESPONSE']._serialized_end=962
  _globals['_MSGBURNNFT']._serialized_start=964
  _globals['_MSGBURNNFT']._serialized_end=1070
  _globals['_MSGBURNNFTRESPONSE']._serialized_start=1072
  _globals['_MSGBURNNFTRESPONSE']._serialized_end=1092
  _globals['_MSGTRANSFERDENOM']._serialized_start=1094
  _globals['_MSGTRANSFERDENOM']._serialized_end=1188
  _globals['_MSGTRANSFERDENOMRESPONSE']._serialized_start=1190
  _globals['_MSGTRANSFERDENOMRESPONSE']._serialized_end=1216
  _globals['_MSG']._serialized_start=1219
  _globals['_MSG']._serialized_end=1677
# @@protoc_insertion_point(module_scope)