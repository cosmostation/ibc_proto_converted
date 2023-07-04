# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/axelarnet/v1beta1/types.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$axelar/axelarnet/v1beta1/types.proto\x12\x18\x61xelar.axelarnet.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x83\x05\n\x0bIBCTransfer\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12\x1a\n\x08receiver\x18\x02 \x01(\tR\x08receiver\x12\x35\n\x05token\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x05token\x12#\n\x07port_id\x18\x04 \x01(\tB\n\xe2\xde\x1f\x06PortIDR\x06portId\x12,\n\nchannel_id\x18\x05 \x01(\tB\r\xe2\xde\x1f\tChannelIDR\tchannelId\x12\x1e\n\x08sequence\x18\x06 \x01(\x04\x42\x02\x18\x01R\x08sequence\x12Z\n\x02id\x18\x07 \x01(\x04\x42J\xe2\xde\x1f\x02ID\xfa\xde\x1f@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferIDR\x02id\x12\x44\n\x06status\x18\x08 \x01(\x0e\x32,.axelar.axelarnet.v1beta1.IBCTransfer.StatusR\x06status\"\xc0\x01\n\x06Status\x12/\n\x12STATUS_UNSPECIFIED\x10\x00\x1a\x17\x8a\x9d \x13TransferNonExistent\x12\'\n\x0eSTATUS_PENDING\x10\x01\x1a\x13\x8a\x9d \x0fTransferPending\x12+\n\x10STATUS_COMPLETED\x10\x02\x1a\x15\x8a\x9d \x11TransferCompleted\x12%\n\rSTATUS_FAILED\x10\x03\x1a\x12\x8a\x9d \x0eTransferFailed\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x01\"\xf0\x01\n\x0b\x43osmosChain\x12W\n\x04name\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x04name\x12&\n\x08ibc_path\x18\x02 \x01(\tB\x0b\xe2\xde\x1f\x07IBCPathR\x07ibcPath\x12?\n\x06\x61ssets\x18\x03 \x03(\x0b\x32\x1f.axelar.axelarnet.v1beta1.AssetB\x06\x18\x01\xc8\xde\x1f\x00R\x06\x61ssets\x12\x1f\n\x0b\x61\x64\x64r_prefix\x18\x04 \x01(\tR\naddrPrefix\"p\n\x05\x41sset\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12M\n\nmin_amount\x18\x02 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\tminAmount:\x02\x18\x01\"\x8f\x01\n\x03\x46\x65\x65\x12\x37\n\x06\x61mount\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12O\n\trecipient\x18\x02 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\trecipientB\xe8\x01\n\x1c\x63om.axelar.axelarnet.v1beta1B\nTypesProtoP\x01Z6github.com/axelarnetwork/axelar-core/x/axelarnet/types\xa2\x02\x03\x41\x41X\xaa\x02\x18\x41xelar.Axelarnet.V1beta1\xca\x02\x18\x41xelar\\Axelarnet\\V1beta1\xe2\x02$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\xea\x02\x1a\x41xelar::Axelarnet::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.axelarnet.v1beta1.types_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.axelar.axelarnet.v1beta1B\nTypesProtoP\001Z6github.com/axelarnetwork/axelar-core/x/axelarnet/types\242\002\003AAX\252\002\030Axelar.Axelarnet.V1beta1\312\002\030Axelar\\Axelarnet\\V1beta1\342\002$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\352\002\032Axelar::Axelarnet::V1beta1\310\341\036\000'
  _IBCTRANSFER_STATUS._options = None
  _IBCTRANSFER_STATUS._serialized_options = b'\210\243\036\000\250\244\036\001'
  _IBCTRANSFER_STATUS.values_by_name["STATUS_UNSPECIFIED"]._options = None
  _IBCTRANSFER_STATUS.values_by_name["STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \023TransferNonExistent'
  _IBCTRANSFER_STATUS.values_by_name["STATUS_PENDING"]._options = None
  _IBCTRANSFER_STATUS.values_by_name["STATUS_PENDING"]._serialized_options = b'\212\235 \017TransferPending'
  _IBCTRANSFER_STATUS.values_by_name["STATUS_COMPLETED"]._options = None
  _IBCTRANSFER_STATUS.values_by_name["STATUS_COMPLETED"]._serialized_options = b'\212\235 \021TransferCompleted'
  _IBCTRANSFER_STATUS.values_by_name["STATUS_FAILED"]._options = None
  _IBCTRANSFER_STATUS.values_by_name["STATUS_FAILED"]._serialized_options = b'\212\235 \016TransferFailed'
  _IBCTRANSFER.fields_by_name['sender']._options = None
  _IBCTRANSFER.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _IBCTRANSFER.fields_by_name['token']._options = None
  _IBCTRANSFER.fields_by_name['token']._serialized_options = b'\310\336\037\000'
  _IBCTRANSFER.fields_by_name['port_id']._options = None
  _IBCTRANSFER.fields_by_name['port_id']._serialized_options = b'\342\336\037\006PortID'
  _IBCTRANSFER.fields_by_name['channel_id']._options = None
  _IBCTRANSFER.fields_by_name['channel_id']._serialized_options = b'\342\336\037\tChannelID'
  _IBCTRANSFER.fields_by_name['sequence']._options = None
  _IBCTRANSFER.fields_by_name['sequence']._serialized_options = b'\030\001'
  _IBCTRANSFER.fields_by_name['id']._options = None
  _IBCTRANSFER.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\372\336\037@github.com/axelarnetwork/axelar-core/x/nexus/exported.TransferID'
  _COSMOSCHAIN.fields_by_name['name']._options = None
  _COSMOSCHAIN.fields_by_name['name']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _COSMOSCHAIN.fields_by_name['ibc_path']._options = None
  _COSMOSCHAIN.fields_by_name['ibc_path']._serialized_options = b'\342\336\037\007IBCPath'
  _COSMOSCHAIN.fields_by_name['assets']._options = None
  _COSMOSCHAIN.fields_by_name['assets']._serialized_options = b'\030\001\310\336\037\000'
  _ASSET.fields_by_name['min_amount']._options = None
  _ASSET.fields_by_name['min_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ASSET._options = None
  _ASSET._serialized_options = b'\030\001'
  _FEE.fields_by_name['amount']._options = None
  _FEE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _FEE.fields_by_name['recipient']._options = None
  _FEE.fields_by_name['recipient']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_IBCTRANSFER']._serialized_start=121
  _globals['_IBCTRANSFER']._serialized_end=764
  _globals['_IBCTRANSFER_STATUS']._serialized_start=572
  _globals['_IBCTRANSFER_STATUS']._serialized_end=764
  _globals['_COSMOSCHAIN']._serialized_start=767
  _globals['_COSMOSCHAIN']._serialized_end=1007
  _globals['_ASSET']._serialized_start=1009
  _globals['_ASSET']._serialized_end=1121
  _globals['_FEE']._serialized_start=1124
  _globals['_FEE']._serialized_end=1267
# @@protoc_insertion_point(module_scope)