# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/asset/v1beta1/extendedPairVault.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,comdex/asset/v1beta1/extendedPairVault.proto\x12\x14\x63omdex.asset.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa2\x0b\n\x11\x45xtendedPairVault\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12(\n\x06\x61pp_id\x18\x02 \x01(\x04\x42\x11\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12+\n\x07pair_id\x18\x03 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pair_id\"R\x06pairId\x12k\n\rstability_fee\x18\x04 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"stability_fee\"R\x0cstabilityFee\x12\x65\n\x0b\x63losing_fee\x18\x05 \x01(\tBD\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x12yaml:\"closing_fee\"R\nclosingFee\x12}\n\x13liquidation_penalty\x18\x06 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1ayaml:\"liquidation_penalty\"R\x12liquidationPenalty\x12j\n\rdraw_down_fee\x18\x07 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"draw_down_fee\"R\x0b\x64rawDownFee\x12>\n\x0fis_vault_active\x18\x08 \x01(\x08\x42\x16\xf2\xde\x1f\x12yaml:\"active_flag\"R\risVaultActive\x12h\n\x0c\x64\x65\x62t_ceiling\x18\t \x01(\tBE\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x13yaml:\"debt_ceiling\"R\x0b\x64\x65\x62tCeiling\x12\x62\n\ndebt_floor\x18\n \x01(\tBC\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"debt_floor\"R\tdebtFloor\x12P\n\x14is_stable_mint_vault\x18\x0b \x01(\x08\x42\x1f\xf2\xde\x1f\x1byaml:\"is_stable_mint_vault\"R\x11isStableMintVault\x12V\n\x06min_cr\x18\x0c \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\ryaml:\"min_cr\"R\x05minCr\x12\x31\n\tpair_name\x18\r \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"pair_name\"R\x08pairName\x12V\n\x16\x61sset_out_oracle_price\x18\x0e \x01(\x08\x42!\xf2\xde\x1f\x1dyaml:\"asset_out_oracle_price\"R\x13\x61ssetOutOraclePrice\x12\x42\n\x0f\x61sset_out_price\x18\x0f \x01(\x04\x42\x1a\xf2\xde\x1f\x16yaml:\"asset_out_price\"R\rassetOutPrice\x12J\n\x12min_usd_value_left\x18\x10 \x01(\x04\x42\x1d\xf2\xde\x1f\x19yaml:\"min_usd_value_left\"R\x0fminUsdValueLeft\x12:\n\x0c\x62lock_height\x18\x11 \x01(\x03\x42\x17\xf2\xde\x1f\x13yaml:\"block_height\"R\x0b\x62lockHeight\x12X\n\nblock_time\x18\x12 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"block_time\"\x90\xdf\x1f\x01R\tblockTimeB\xdb\x01\n\x18\x63om.comdex.asset.v1beta1B\x16\x45xtendedPairVaultProtoZ/github.com/comdex-official/comdex/x/asset/types\xa2\x02\x03\x43\x41X\xaa\x02\x14\x43omdex.Asset.V1beta1\xca\x02\x14\x43omdex\\Asset\\V1beta1\xe2\x02 Comdex\\Asset\\V1beta1\\GPBMetadata\xea\x02\x16\x43omdex::Asset::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.asset.v1beta1.extendedPairVault_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.comdex.asset.v1beta1B\026ExtendedPairVaultProtoZ/github.com/comdex-official/comdex/x/asset/types\242\002\003CAX\252\002\024Comdex.Asset.V1beta1\312\002\024Comdex\\Asset\\V1beta1\342\002 Comdex\\Asset\\V1beta1\\GPBMetadata\352\002\026Comdex::Asset::V1beta1\310\341\036\000\250\342\036\000'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['app_id']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['app_id']._serialized_options = b'\362\336\037\ryaml:\"app_id\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['pair_id']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['pair_id']._serialized_options = b'\362\336\037\016yaml:\"pair_id\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['stability_fee']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['stability_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"stability_fee\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['closing_fee']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['closing_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\022yaml:\"closing_fee\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['liquidation_penalty']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['liquidation_penalty']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\032yaml:\"liquidation_penalty\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['draw_down_fee']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['draw_down_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"draw_down_fee\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['is_vault_active']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['is_vault_active']._serialized_options = b'\362\336\037\022yaml:\"active_flag\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['debt_ceiling']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['debt_ceiling']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\023yaml:\"debt_ceiling\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['debt_floor']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['debt_floor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"debt_floor\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['is_stable_mint_vault']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['is_stable_mint_vault']._serialized_options = b'\362\336\037\033yaml:\"is_stable_mint_vault\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['min_cr']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['min_cr']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\ryaml:\"min_cr\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['pair_name']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['pair_name']._serialized_options = b'\362\336\037\020yaml:\"pair_name\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['asset_out_oracle_price']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['asset_out_oracle_price']._serialized_options = b'\362\336\037\035yaml:\"asset_out_oracle_price\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['asset_out_price']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['asset_out_price']._serialized_options = b'\362\336\037\026yaml:\"asset_out_price\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['min_usd_value_left']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['min_usd_value_left']._serialized_options = b'\362\336\037\031yaml:\"min_usd_value_left\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['block_height']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['block_height']._serialized_options = b'\362\336\037\023yaml:\"block_height\"'
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['block_time']._options = None
  _globals['_EXTENDEDPAIRVAULT'].fields_by_name['block_time']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"block_time\"\220\337\037\001'
  _globals['_EXTENDEDPAIRVAULT']._serialized_start=126
  _globals['_EXTENDEDPAIRVAULT']._serialized_end=1568
# @@protoc_insertion_point(module_scope)
