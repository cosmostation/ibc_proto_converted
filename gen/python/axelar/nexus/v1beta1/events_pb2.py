# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/nexus/v1beta1/events.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from axelar.nexus.exported.v1beta1 import types_pb2 as axelar_dot_nexus_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!axelar/nexus/v1beta1/events.proto\x12\x14\x61xelar.nexus.v1beta1\x1a\x1egoogle/protobuf/duration.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a)axelar/nexus/exported/v1beta1/types.proto\"\x89\x03\n\x0b\x46\x65\x65\x44\x65\x64ucted\x12s\n\x0btransfer_id\x18\x01 \x01(\x04\x42R\xe2\xde\x1f\nTransferID\xfa\xde\x1f@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferIDR\ntransferId\x12l\n\x0frecipient_chain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x0erecipientChain\x12+\n\x11recipient_address\x18\x03 \x01(\tR\x10recipientAddress\x12\x37\n\x06\x61mount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x31\n\x03\x66\x65\x65\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\"\x8d\x03\n\x0fInsufficientFee\x12s\n\x0btransfer_id\x18\x01 \x01(\x04\x42R\xe2\xde\x1f\nTransferID\xfa\xde\x1f@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferIDR\ntransferId\x12l\n\x0frecipient_chain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x0erecipientChain\x12+\n\x11recipient_address\x18\x03 \x01(\tR\x10recipientAddress\x12\x37\n\x06\x61mount\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x31\n\x03\x66\x65\x65\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x03\x66\x65\x65\"\xe1\x01\n\x10RateLimitUpdated\x12Y\n\x05\x63hain\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x35\n\x05limit\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x05limit\x12;\n\x06window\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x06window\"\xf2\x01\n\x0fMessageReceived\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\x12!\n\x0cpayload_hash\x18\x02 \x01(\x0cR\x0bpayloadHash\x12N\n\x06sender\x18\x03 \x01(\x0b\x32\x30.axelar.nexus.exported.v1beta1.CrossChainAddressB\x04\xc8\xde\x1f\x00R\x06sender\x12T\n\trecipient\x18\x04 \x01(\x0b\x32\x30.axelar.nexus.exported.v1beta1.CrossChainAddressB\x04\xc8\xde\x1f\x00R\trecipient\"+\n\x11MessageProcessing\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\")\n\x0fMessageExecuted\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02id\"\'\n\rMessageFailed\x12\x16\n\x02id\x18\x01 \x01(\tB\x06\xe2\xde\x1f\x02IDR\x02idB\xcf\x01\n\x18\x63om.axelar.nexus.v1beta1B\x0b\x45ventsProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\xa2\x02\x03\x41NX\xaa\x02\x14\x41xelar.Nexus.V1beta1\xca\x02\x14\x41xelar\\Nexus\\V1beta1\xe2\x02 Axelar\\Nexus\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Nexus::V1beta1\xc8\xe3\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.nexus.v1beta1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.axelar.nexus.v1beta1B\013EventsProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\242\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Nexus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMetadata\352\002\026Axelar::Nexus::V1beta1\310\343\036\001'
  _globals['_FEEDEDUCTED'].fields_by_name['transfer_id']._options = None
  _globals['_FEEDEDUCTED'].fields_by_name['transfer_id']._serialized_options = b'\342\336\037\nTransferID\372\336\037@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID'
  _globals['_FEEDEDUCTED'].fields_by_name['recipient_chain']._options = None
  _globals['_FEEDEDUCTED'].fields_by_name['recipient_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_FEEDEDUCTED'].fields_by_name['amount']._options = None
  _globals['_FEEDEDUCTED'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_FEEDEDUCTED'].fields_by_name['fee']._options = None
  _globals['_FEEDEDUCTED'].fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _globals['_INSUFFICIENTFEE'].fields_by_name['transfer_id']._options = None
  _globals['_INSUFFICIENTFEE'].fields_by_name['transfer_id']._serialized_options = b'\342\336\037\nTransferID\372\336\037@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID'
  _globals['_INSUFFICIENTFEE'].fields_by_name['recipient_chain']._options = None
  _globals['_INSUFFICIENTFEE'].fields_by_name['recipient_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_INSUFFICIENTFEE'].fields_by_name['amount']._options = None
  _globals['_INSUFFICIENTFEE'].fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_INSUFFICIENTFEE'].fields_by_name['fee']._options = None
  _globals['_INSUFFICIENTFEE'].fields_by_name['fee']._serialized_options = b'\310\336\037\000'
  _globals['_RATELIMITUPDATED'].fields_by_name['chain']._options = None
  _globals['_RATELIMITUPDATED'].fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_RATELIMITUPDATED'].fields_by_name['limit']._options = None
  _globals['_RATELIMITUPDATED'].fields_by_name['limit']._serialized_options = b'\310\336\037\000'
  _globals['_RATELIMITUPDATED'].fields_by_name['window']._options = None
  _globals['_RATELIMITUPDATED'].fields_by_name['window']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_MESSAGERECEIVED'].fields_by_name['id']._options = None
  _globals['_MESSAGERECEIVED'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MESSAGERECEIVED'].fields_by_name['sender']._options = None
  _globals['_MESSAGERECEIVED'].fields_by_name['sender']._serialized_options = b'\310\336\037\000'
  _globals['_MESSAGERECEIVED'].fields_by_name['recipient']._options = None
  _globals['_MESSAGERECEIVED'].fields_by_name['recipient']._serialized_options = b'\310\336\037\000'
  _globals['_MESSAGEPROCESSING'].fields_by_name['id']._options = None
  _globals['_MESSAGEPROCESSING'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MESSAGEEXECUTED'].fields_by_name['id']._options = None
  _globals['_MESSAGEEXECUTED'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_MESSAGEFAILED'].fields_by_name['id']._options = None
  _globals['_MESSAGEFAILED'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _globals['_FEEDEDUCTED']._serialized_start=189
  _globals['_FEEDEDUCTED']._serialized_end=582
  _globals['_INSUFFICIENTFEE']._serialized_start=585
  _globals['_INSUFFICIENTFEE']._serialized_end=982
  _globals['_RATELIMITUPDATED']._serialized_start=985
  _globals['_RATELIMITUPDATED']._serialized_end=1210
  _globals['_MESSAGERECEIVED']._serialized_start=1213
  _globals['_MESSAGERECEIVED']._serialized_end=1455
  _globals['_MESSAGEPROCESSING']._serialized_start=1457
  _globals['_MESSAGEPROCESSING']._serialized_end=1500
  _globals['_MESSAGEEXECUTED']._serialized_start=1502
  _globals['_MESSAGEEXECUTED']._serialized_end=1543
  _globals['_MESSAGEFAILED']._serialized_start=1545
  _globals['_MESSAGEFAILED']._serialized_end=1584
# @@protoc_insertion_point(module_scope)
