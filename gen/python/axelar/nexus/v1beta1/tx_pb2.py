# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/nexus/v1beta1/tx.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from axelar.nexus.exported.v1beta1 import types_pb2 as axelar_dot_nexus_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.permission.exported.v1beta1 import types_pb2 as axelar_dot_permission_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1d\x61xelar/nexus/v1beta1/tx.proto\x12\x14\x61xelar.nexus.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a)axelar/nexus/exported/v1beta1/types.proto\x1a.axelar/permission/exported/v1beta1/types.proto\"\xce\x01\n\x1eRegisterChainMaintainerRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12[\n\x06\x63hains\x18\x02 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains:\x04\x80\xb5\x18\x01\"!\n\x1fRegisterChainMaintainerResponse\"\xd0\x01\n DeregisterChainMaintainerRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12[\n\x06\x63hains\x18\x02 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains:\x04\x80\xb5\x18\x01\"#\n!DeregisterChainMaintainerResponse\"\xc4\x01\n\x14\x41\x63tivateChainRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12[\n\x06\x63hains\x18\x02 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains:\x04\x80\xb5\x18\x03\"\x17\n\x15\x41\x63tivateChainResponse\"\xc6\x01\n\x16\x44\x65\x61\x63tivateChainRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12[\n\x06\x63hains\x18\x02 \x03(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x06\x63hains:\x04\x80\xb5\x18\x03\"\x19\n\x17\x44\x65\x61\x63tivateChainResponse\"\xb3\x01\n\x17RegisterAssetFeeRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12G\n\x08\x66\x65\x65_info\x18\x02 \x01(\x0b\x32&.axelar.nexus.exported.v1beta1.FeeInfoB\x04\xc8\xde\x1f\x00R\x07\x66\x65\x65Info:\x04\x80\xb5\x18\x02\"\x1a\n\x18RegisterAssetFeeResponse\"\xbd\x02\n\x1bSetTransferRateLimitRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x35\n\x05limit\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x05limit\x12;\n\x06window\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x06window:\x04\x80\xb5\x18\x03\"\x1e\n\x1cSetTransferRateLimitResponseB\xcb\x01\n\x18\x63om.axelar.nexus.v1beta1B\x07TxProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\xa2\x02\x03\x41NX\xaa\x02\x14\x41xelar.Nexus.V1beta1\xca\x02\x14\x41xelar\\Nexus\\V1beta1\xe2\x02 Axelar\\Nexus\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Nexus::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.nexus.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.axelar.nexus.v1beta1B\007TxProtoZ2github.com/axelarnetwork/axelar-core/x/nexus/types\242\002\003ANX\252\002\024Axelar.Nexus.V1beta1\312\002\024Axelar\\Nexus\\V1beta1\342\002 Axelar\\Nexus\\V1beta1\\GPBMetadata\352\002\026Axelar::Nexus::V1beta1\310\341\036\000'
  _globals['_REGISTERCHAINMAINTAINERREQUEST'].fields_by_name['sender']._options = None
  _globals['_REGISTERCHAINMAINTAINERREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_REGISTERCHAINMAINTAINERREQUEST'].fields_by_name['chains']._options = None
  _globals['_REGISTERCHAINMAINTAINERREQUEST'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_REGISTERCHAINMAINTAINERREQUEST']._options = None
  _globals['_REGISTERCHAINMAINTAINERREQUEST']._serialized_options = b'\200\265\030\001'
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST'].fields_by_name['sender']._options = None
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST'].fields_by_name['chains']._options = None
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST']._options = None
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST']._serialized_options = b'\200\265\030\001'
  _globals['_ACTIVATECHAINREQUEST'].fields_by_name['sender']._options = None
  _globals['_ACTIVATECHAINREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_ACTIVATECHAINREQUEST'].fields_by_name['chains']._options = None
  _globals['_ACTIVATECHAINREQUEST'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_ACTIVATECHAINREQUEST']._options = None
  _globals['_ACTIVATECHAINREQUEST']._serialized_options = b'\200\265\030\003'
  _globals['_DEACTIVATECHAINREQUEST'].fields_by_name['sender']._options = None
  _globals['_DEACTIVATECHAINREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_DEACTIVATECHAINREQUEST'].fields_by_name['chains']._options = None
  _globals['_DEACTIVATECHAINREQUEST'].fields_by_name['chains']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_DEACTIVATECHAINREQUEST']._options = None
  _globals['_DEACTIVATECHAINREQUEST']._serialized_options = b'\200\265\030\003'
  _globals['_REGISTERASSETFEEREQUEST'].fields_by_name['sender']._options = None
  _globals['_REGISTERASSETFEEREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_REGISTERASSETFEEREQUEST'].fields_by_name['fee_info']._options = None
  _globals['_REGISTERASSETFEEREQUEST'].fields_by_name['fee_info']._serialized_options = b'\310\336\037\000'
  _globals['_REGISTERASSETFEEREQUEST']._options = None
  _globals['_REGISTERASSETFEEREQUEST']._serialized_options = b'\200\265\030\002'
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['sender']._options = None
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['chain']._options = None
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['limit']._options = None
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['limit']._serialized_options = b'\310\336\037\000'
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['window']._options = None
  _globals['_SETTRANSFERRATELIMITREQUEST'].fields_by_name['window']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_SETTRANSFERRATELIMITREQUEST']._options = None
  _globals['_SETTRANSFERRATELIMITREQUEST']._serialized_options = b'\200\265\030\003'
  _globals['_REGISTERCHAINMAINTAINERREQUEST']._serialized_start=263
  _globals['_REGISTERCHAINMAINTAINERREQUEST']._serialized_end=469
  _globals['_REGISTERCHAINMAINTAINERRESPONSE']._serialized_start=471
  _globals['_REGISTERCHAINMAINTAINERRESPONSE']._serialized_end=504
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST']._serialized_start=507
  _globals['_DEREGISTERCHAINMAINTAINERREQUEST']._serialized_end=715
  _globals['_DEREGISTERCHAINMAINTAINERRESPONSE']._serialized_start=717
  _globals['_DEREGISTERCHAINMAINTAINERRESPONSE']._serialized_end=752
  _globals['_ACTIVATECHAINREQUEST']._serialized_start=755
  _globals['_ACTIVATECHAINREQUEST']._serialized_end=951
  _globals['_ACTIVATECHAINRESPONSE']._serialized_start=953
  _globals['_ACTIVATECHAINRESPONSE']._serialized_end=976
  _globals['_DEACTIVATECHAINREQUEST']._serialized_start=979
  _globals['_DEACTIVATECHAINREQUEST']._serialized_end=1177
  _globals['_DEACTIVATECHAINRESPONSE']._serialized_start=1179
  _globals['_DEACTIVATECHAINRESPONSE']._serialized_end=1204
  _globals['_REGISTERASSETFEEREQUEST']._serialized_start=1207
  _globals['_REGISTERASSETFEEREQUEST']._serialized_end=1386
  _globals['_REGISTERASSETFEERESPONSE']._serialized_start=1388
  _globals['_REGISTERASSETFEERESPONSE']._serialized_end=1414
  _globals['_SETTRANSFERRATELIMITREQUEST']._serialized_start=1417
  _globals['_SETTRANSFERRATELIMITREQUEST']._serialized_end=1734
  _globals['_SETTRANSFERRATELIMITRESPONSE']._serialized_start=1736
  _globals['_SETTRANSFERRATELIMITRESPONSE']._serialized_end=1766
# @@protoc_insertion_point(module_scope)
