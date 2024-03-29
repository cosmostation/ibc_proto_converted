# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/token/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ixo.iid.v1beta1 import iid_pb2 as ixo_dot_iid_dot_v1beta1_dot_iid__pb2
from ixo.token.v1beta1 import token_pb2 as ixo_dot_token_dot_v1beta1_dot_token__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1aixo/token/v1beta1/tx.proto\x12\x11ixo.token.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19ixo/iid/v1beta1/iid.proto\x1a\x1dixo/token/v1beta1/token.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb1\x02\n\x0eMsgCreateToken\x12\x16\n\x06minter\x18\x01 \x01(\tR\x06minter\x12Y\n\x05\x63lass\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragmentR\x05\x63lass\x12\x12\n\x04name\x18\x03 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x04 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05image\x18\x05 \x01(\tR\x05image\x12\x1d\n\ntoken_type\x18\x06 \x01(\tR\ttokenType\x12\x41\n\x03\x63\x61p\x18\x07 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x03\x63\x61p\"\x18\n\x16MsgCreateTokenResponse\"\xa4\x01\n\x0cMsgMintToken\x12\x16\n\x06minter\x18\x01 \x01(\tR\x06minter\x12)\n\x10\x63ontract_address\x18\x02 \x01(\tR\x0f\x63ontractAddress\x12\x14\n\x05owner\x18\x03 \x01(\tR\x05owner\x12;\n\nmint_batch\x18\x04 \x03(\x0b\x32\x1c.ixo.token.v1beta1.MintBatchR\tmintBatch\"\xe1\x01\n\tMintBatch\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x14\n\x05index\x18\x02 \x01(\tR\x05index\x12G\n\x06\x61mount\x18\x03 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\x12\x1e\n\ncollection\x18\x04 \x01(\tR\ncollection\x12;\n\ntoken_data\x18\x05 \x03(\x0b\x32\x1c.ixo.token.v1beta1.TokenDataR\ttokenData:\x04\xe8\xa0\x1f\x01\"\x16\n\x14MsgMintTokenResponse\"}\n\x10MsgTransferToken\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x1c\n\trecipient\x18\x02 \x01(\tR\trecipient\x12\x35\n\x06tokens\x18\x03 \x03(\x0b\x32\x1d.ixo.token.v1beta1.TokenBatchR\x06tokens\"\x1a\n\x18MsgTransferTokenResponse\"k\n\nTokenBatch\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12G\n\x06\x61mount\x18\x02 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount:\x04\xe8\xa0\x1f\x01\"\x99\x01\n\x0eMsgRetireToken\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x35\n\x06tokens\x18\x02 \x03(\x0b\x32\x1d.ixo.token.v1beta1.TokenBatchR\x06tokens\x12\"\n\x0cjurisdiction\x18\x03 \x01(\tR\x0cjurisdiction\x12\x16\n\x06reason\x18\x04 \x01(\tR\x06reason\"\x18\n\x16MsgRetireTokenResponse\"u\n\x0eMsgCancelToken\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x35\n\x06tokens\x18\x02 \x03(\x0b\x32\x1d.ixo.token.v1beta1.TokenBatchR\x06tokens\x12\x16\n\x06reason\x18\x03 \x01(\tR\x06reason\"\x18\n\x16MsgCancelTokenResponse\"j\n\rMsgPauseToken\x12\x16\n\x06minter\x18\x01 \x01(\tR\x06minter\x12)\n\x10\x63ontract_address\x18\x02 \x01(\tR\x0f\x63ontractAddress\x12\x16\n\x06paused\x18\x03 \x01(\x08R\x06paused\"\x17\n\x15MsgPauseTokenResponse\"Q\n\x0cMsgStopToken\x12\x16\n\x06minter\x18\x01 \x01(\tR\x06minter\x12)\n\x10\x63ontract_address\x18\x02 \x01(\tR\x0f\x63ontractAddress\"\x16\n\x14MsgStopTokenResponse2\x87\x05\n\x03Msg\x12[\n\x0b\x43reateToken\x12!.ixo.token.v1beta1.MsgCreateToken\x1a).ixo.token.v1beta1.MsgCreateTokenResponse\x12U\n\tMintToken\x12\x1f.ixo.token.v1beta1.MsgMintToken\x1a\'.ixo.token.v1beta1.MsgMintTokenResponse\x12\x61\n\rTransferToken\x12#.ixo.token.v1beta1.MsgTransferToken\x1a+.ixo.token.v1beta1.MsgTransferTokenResponse\x12[\n\x0bRetireToken\x12!.ixo.token.v1beta1.MsgRetireToken\x1a).ixo.token.v1beta1.MsgRetireTokenResponse\x12[\n\x0b\x43\x61ncelToken\x12!.ixo.token.v1beta1.MsgCancelToken\x1a).ixo.token.v1beta1.MsgCancelTokenResponse\x12X\n\nPauseToken\x12 .ixo.token.v1beta1.MsgPauseToken\x1a(.ixo.token.v1beta1.MsgPauseTokenResponse\x12U\n\tStopToken\x12\x1f.ixo.token.v1beta1.MsgStopToken\x1a\'.ixo.token.v1beta1.MsgStopTokenResponseB\xbb\x01\n\x15\x63om.ixo.token.v1beta1B\x07TxProtoZ5github.com/ixofoundation/ixo-blockchain/x/token/types\xa2\x02\x03ITX\xaa\x02\x11Ixo.Token.V1beta1\xca\x02\x11Ixo\\Token\\V1beta1\xe2\x02\x1dIxo\\Token\\V1beta1\\GPBMetadata\xea\x02\x13Ixo::Token::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.token.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.ixo.token.v1beta1B\007TxProtoZ5github.com/ixofoundation/ixo-blockchain/x/token/types\242\002\003ITX\252\002\021Ixo.Token.V1beta1\312\002\021Ixo\\Token\\V1beta1\342\002\035Ixo\\Token\\V1beta1\\GPBMetadata\352\002\023Ixo::Token::V1beta1'
  _globals['_MSGCREATETOKEN'].fields_by_name['class']._options = None
  _globals['_MSGCREATETOKEN'].fields_by_name['class']._serialized_options = b'\372\336\037?github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment'
  _globals['_MSGCREATETOKEN'].fields_by_name['cap']._options = None
  _globals['_MSGCREATETOKEN'].fields_by_name['cap']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _globals['_MINTBATCH'].fields_by_name['amount']._options = None
  _globals['_MINTBATCH'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _globals['_MINTBATCH']._options = None
  _globals['_MINTBATCH']._serialized_options = b'\350\240\037\001'
  _globals['_TOKENBATCH'].fields_by_name['amount']._options = None
  _globals['_TOKENBATCH'].fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _globals['_TOKENBATCH']._options = None
  _globals['_TOKENBATCH']._serialized_options = b'\350\240\037\001'
  _globals['_MSGCREATETOKEN']._serialized_start=163
  _globals['_MSGCREATETOKEN']._serialized_end=468
  _globals['_MSGCREATETOKENRESPONSE']._serialized_start=470
  _globals['_MSGCREATETOKENRESPONSE']._serialized_end=494
  _globals['_MSGMINTTOKEN']._serialized_start=497
  _globals['_MSGMINTTOKEN']._serialized_end=661
  _globals['_MINTBATCH']._serialized_start=664
  _globals['_MINTBATCH']._serialized_end=889
  _globals['_MSGMINTTOKENRESPONSE']._serialized_start=891
  _globals['_MSGMINTTOKENRESPONSE']._serialized_end=913
  _globals['_MSGTRANSFERTOKEN']._serialized_start=915
  _globals['_MSGTRANSFERTOKEN']._serialized_end=1040
  _globals['_MSGTRANSFERTOKENRESPONSE']._serialized_start=1042
  _globals['_MSGTRANSFERTOKENRESPONSE']._serialized_end=1068
  _globals['_TOKENBATCH']._serialized_start=1070
  _globals['_TOKENBATCH']._serialized_end=1177
  _globals['_MSGRETIRETOKEN']._serialized_start=1180
  _globals['_MSGRETIRETOKEN']._serialized_end=1333
  _globals['_MSGRETIRETOKENRESPONSE']._serialized_start=1335
  _globals['_MSGRETIRETOKENRESPONSE']._serialized_end=1359
  _globals['_MSGCANCELTOKEN']._serialized_start=1361
  _globals['_MSGCANCELTOKEN']._serialized_end=1478
  _globals['_MSGCANCELTOKENRESPONSE']._serialized_start=1480
  _globals['_MSGCANCELTOKENRESPONSE']._serialized_end=1504
  _globals['_MSGPAUSETOKEN']._serialized_start=1506
  _globals['_MSGPAUSETOKEN']._serialized_end=1612
  _globals['_MSGPAUSETOKENRESPONSE']._serialized_start=1614
  _globals['_MSGPAUSETOKENRESPONSE']._serialized_end=1637
  _globals['_MSGSTOPTOKEN']._serialized_start=1639
  _globals['_MSGSTOPTOKEN']._serialized_end=1720
  _globals['_MSGSTOPTOKENRESPONSE']._serialized_start=1722
  _globals['_MSGSTOPTOKENRESPONSE']._serialized_end=1744
  _globals['_MSG']._serialized_start=1747
  _globals['_MSG']._serialized_end=2394
# @@protoc_insertion_point(module_scope)
