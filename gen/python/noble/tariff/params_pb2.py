# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: noble/tariff/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19noble/tariff/params.proto\x12\x0cnoble.tariff\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x98\x04\n\x06Params\x12T\n\x05share\x18\x01 \x01(\tB>\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x0cyaml:\"share\"R\x05share\x12{\n\x15\x64istribution_entities\x18\x02 \x03(\x0b\x32 .noble.tariff.DistributionEntityB$\xc8\xde\x1f\x00\xf2\xde\x1f\x1cyaml:\"distribution_entities\"R\x14\x64istributionEntities\x12s\n\x10transfer_fee_bps\x18\x03 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"transfer_fee_bps\"R\x0etransferFeeBps\x12s\n\x10transfer_fee_max\x18\x04 \x01(\tBI\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x17yaml:\"transfer_fee_max\"R\x0etransferFeeMax\x12K\n\x12transfer_fee_denom\x18\x05 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"transfer_fee_denom\"R\x10transferFeeDenom:\x04\x98\xa0\x1f\x00\"\x84\x01\n\x12\x44istributionEntity\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12T\n\x05share\x18\x02 \x01(\tB>\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x0cyaml:\"share\"R\x05shareB\xa8\x01\n\x10\x63om.noble.tariffB\x0bParamsProtoZ4github.com/strangelove-ventures/noble/x/tariff/types\xa2\x02\x03NTX\xaa\x02\x0cNoble.Tariff\xca\x02\x0cNoble\\Tariff\xe2\x02\x18Noble\\Tariff\\GPBMetadata\xea\x02\rNoble::Tariff\xa8\xe2\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'noble.tariff.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.noble.tariffB\013ParamsProtoZ4github.com/strangelove-ventures/noble/x/tariff/types\242\002\003NTX\252\002\014Noble.Tariff\312\002\014Noble\\Tariff\342\002\030Noble\\Tariff\\GPBMetadata\352\002\rNoble::Tariff\250\342\036\001'
  _globals['_PARAMS'].fields_by_name['share']._options = None
  _globals['_PARAMS'].fields_by_name['share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\014yaml:\"share\"'
  _globals['_PARAMS'].fields_by_name['distribution_entities']._options = None
  _globals['_PARAMS'].fields_by_name['distribution_entities']._serialized_options = b'\310\336\037\000\362\336\037\034yaml:\"distribution_entities\"'
  _globals['_PARAMS'].fields_by_name['transfer_fee_bps']._options = None
  _globals['_PARAMS'].fields_by_name['transfer_fee_bps']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"transfer_fee_bps\"'
  _globals['_PARAMS'].fields_by_name['transfer_fee_max']._options = None
  _globals['_PARAMS'].fields_by_name['transfer_fee_max']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"transfer_fee_max\"'
  _globals['_PARAMS'].fields_by_name['transfer_fee_denom']._options = None
  _globals['_PARAMS'].fields_by_name['transfer_fee_denom']._serialized_options = b'\362\336\037\031yaml:\"transfer_fee_denom\"'
  _globals['_PARAMS']._options = None
  _globals['_PARAMS']._serialized_options = b'\230\240\037\000'
  _globals['_DISTRIBUTIONENTITY'].fields_by_name['share']._options = None
  _globals['_DISTRIBUTIONENTITY'].fields_by_name['share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\014yaml:\"share\"'
  _globals['_PARAMS']._serialized_start=98
  _globals['_PARAMS']._serialized_end=634
  _globals['_DISTRIBUTIONENTITY']._serialized_start=637
  _globals['_DISTRIBUTIONENTITY']._serialized_end=769
# @@protoc_insertion_point(module_scope)
