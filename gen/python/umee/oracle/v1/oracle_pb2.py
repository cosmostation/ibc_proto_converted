# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: umee/oracle/v1/oracle.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bumee/oracle/v1/oracle.proto\x12\x0eumee.oracle.v1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xde\x07\n\x06Params\x12\x37\n\x0bvote_period\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"vote_period\"R\nvotePeriod\x12n\n\x0evote_threshold\x18\x02 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x15yaml:\"vote_threshold\"R\rvoteThreshold\x12\x65\n\x0breward_band\x18\x03 \x01(\tBD\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x12yaml:\"reward_band\"R\nrewardBand\x12\x63\n\x1areward_distribution_window\x18\x04 \x01(\x04\x42%\xf2\xde\x1f!yaml:\"reward_distribution_window\"R\x18rewardDistributionWindow\x12_\n\x0b\x61\x63\x63\x65pt_list\x18\x05 \x03(\x0b\x32\x15.umee.oracle.v1.DenomB\'\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"accept_list\"\xaa\xdf\x1f\tDenomListR\nacceptList\x12n\n\x0eslash_fraction\x18\x06 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x15yaml:\"slash_fraction\"R\rslashFraction\x12:\n\x0cslash_window\x18\x07 \x01(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"slash_window\"R\x0bslashWindow\x12~\n\x14min_valid_per_window\x18\x08 \x01(\tBM\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1byaml:\"min_valid_per_window\"R\x11minValidPerWindow\x12\x32\n\x15historic_stamp_period\x18\t \x01(\x04R\x13historicStampPeriod\x12.\n\x13median_stamp_period\x18\n \x01(\x04R\x11medianStampPeriod\x12\x30\n\x14maximum_price_stamps\x18\x0b \x01(\x04R\x12maximumPriceStamps\x12\x32\n\x15maximum_median_stamps\x18\x0c \x01(\x04R\x13maximumMedianStamps:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xb8\x01\n\x05\x44\x65nom\x12\x34\n\nbase_denom\x18\x01 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"base_denom\"R\tbaseDenom\x12:\n\x0csymbol_denom\x18\x02 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"symbol_denom\"R\x0bsymbolDenom\x12/\n\x08\x65xponent\x18\x03 \x01(\rB\x13\xf2\xde\x1f\x0fyaml:\"exponent\"R\x08\x65xponent:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xb5\x01\n\x1c\x41ggregateExchangeRatePrevote\x12#\n\x04hash\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"hash\"R\x04hash\x12&\n\x05voter\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"voter\"R\x05voter\x12:\n\x0csubmit_block\x18\x03 \x01(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"submit_block\"R\x0bsubmitBlock:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xe2\x01\n\x19\x41ggregateExchangeRateVote\x12\x8e\x01\n\x14\x65xchange_rate_tuples\x18\x01 \x03(\x0b\x32!.umee.oracle.v1.ExchangeRateTupleB9\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"exchange_rate_tuples\"\xaa\xdf\x1f\x12\x45xchangeRateTuplesR\x12\x65xchangeRateTuples\x12&\n\x05voter\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"voter\"R\x05voter:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xb6\x01\n\x11\x45xchangeRateTuple\x12&\n\x05\x64\x65nom\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\x12k\n\rexchange_rate\x18\x02 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"exchange_rate\"R\x0c\x65xchangeRate:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xa6\x01\n\nAvgCounter\x12@\n\x03sum\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x03sum\x12\x10\n\x03num\x18\x02 \x01(\rR\x03num\x12:\n\x05start\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x05start:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xad\x01\n\x12\x63om.umee.oracle.v1B\x0bOracleProtoZ.github.com/umee-network/umee/v5/x/oracle/types\xa2\x02\x03UOX\xaa\x02\x0eUmee.Oracle.V1\xca\x02\x0eUmee\\Oracle\\V1\xe2\x02\x1aUmee\\Oracle\\V1\\GPBMetadata\xea\x02\x10Umee::Oracle::V1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'umee.oracle.v1.oracle_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\022com.umee.oracle.v1B\013OracleProtoZ.github.com/umee-network/umee/v5/x/oracle/types\242\002\003UOX\252\002\016Umee.Oracle.V1\312\002\016Umee\\Oracle\\V1\342\002\032Umee\\Oracle\\V1\\GPBMetadata\352\002\020Umee::Oracle::V1\310\341\036\000'
  _globals['_PARAMS'].fields_by_name['vote_period']._options = None
  _globals['_PARAMS'].fields_by_name['vote_period']._serialized_options = b'\362\336\037\022yaml:\"vote_period\"'
  _globals['_PARAMS'].fields_by_name['vote_threshold']._options = None
  _globals['_PARAMS'].fields_by_name['vote_threshold']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\025yaml:\"vote_threshold\"'
  _globals['_PARAMS'].fields_by_name['reward_band']._options = None
  _globals['_PARAMS'].fields_by_name['reward_band']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\022yaml:\"reward_band\"'
  _globals['_PARAMS'].fields_by_name['reward_distribution_window']._options = None
  _globals['_PARAMS'].fields_by_name['reward_distribution_window']._serialized_options = b'\362\336\037!yaml:\"reward_distribution_window\"'
  _globals['_PARAMS'].fields_by_name['accept_list']._options = None
  _globals['_PARAMS'].fields_by_name['accept_list']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"accept_list\"\252\337\037\tDenomList'
  _globals['_PARAMS'].fields_by_name['slash_fraction']._options = None
  _globals['_PARAMS'].fields_by_name['slash_fraction']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\025yaml:\"slash_fraction\"'
  _globals['_PARAMS'].fields_by_name['slash_window']._options = None
  _globals['_PARAMS'].fields_by_name['slash_window']._serialized_options = b'\362\336\037\023yaml:\"slash_window\"'
  _globals['_PARAMS'].fields_by_name['min_valid_per_window']._options = None
  _globals['_PARAMS'].fields_by_name['min_valid_per_window']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\033yaml:\"min_valid_per_window\"'
  _globals['_PARAMS']._options = None
  _globals['_PARAMS']._serialized_options = b'\230\240\037\000\350\240\037\001'
  _globals['_DENOM'].fields_by_name['base_denom']._options = None
  _globals['_DENOM'].fields_by_name['base_denom']._serialized_options = b'\362\336\037\021yaml:\"base_denom\"'
  _globals['_DENOM'].fields_by_name['symbol_denom']._options = None
  _globals['_DENOM'].fields_by_name['symbol_denom']._serialized_options = b'\362\336\037\023yaml:\"symbol_denom\"'
  _globals['_DENOM'].fields_by_name['exponent']._options = None
  _globals['_DENOM'].fields_by_name['exponent']._serialized_options = b'\362\336\037\017yaml:\"exponent\"'
  _globals['_DENOM']._options = None
  _globals['_DENOM']._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\000'
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['hash']._options = None
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['hash']._serialized_options = b'\362\336\037\013yaml:\"hash\"'
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['voter']._options = None
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['voter']._serialized_options = b'\362\336\037\014yaml:\"voter\"'
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['submit_block']._options = None
  _globals['_AGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['submit_block']._serialized_options = b'\362\336\037\023yaml:\"submit_block\"'
  _globals['_AGGREGATEEXCHANGERATEPREVOTE']._options = None
  _globals['_AGGREGATEEXCHANGERATEPREVOTE']._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\000'
  _globals['_AGGREGATEEXCHANGERATEVOTE'].fields_by_name['exchange_rate_tuples']._options = None
  _globals['_AGGREGATEEXCHANGERATEVOTE'].fields_by_name['exchange_rate_tuples']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"exchange_rate_tuples\"\252\337\037\022ExchangeRateTuples'
  _globals['_AGGREGATEEXCHANGERATEVOTE'].fields_by_name['voter']._options = None
  _globals['_AGGREGATEEXCHANGERATEVOTE'].fields_by_name['voter']._serialized_options = b'\362\336\037\014yaml:\"voter\"'
  _globals['_AGGREGATEEXCHANGERATEVOTE']._options = None
  _globals['_AGGREGATEEXCHANGERATEVOTE']._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\000'
  _globals['_EXCHANGERATETUPLE'].fields_by_name['denom']._options = None
  _globals['_EXCHANGERATETUPLE'].fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _globals['_EXCHANGERATETUPLE'].fields_by_name['exchange_rate']._options = None
  _globals['_EXCHANGERATETUPLE'].fields_by_name['exchange_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"exchange_rate\"'
  _globals['_EXCHANGERATETUPLE']._options = None
  _globals['_EXCHANGERATETUPLE']._serialized_options = b'\210\240\037\000\230\240\037\000\350\240\037\000'
  _globals['_AVGCOUNTER'].fields_by_name['sum']._options = None
  _globals['_AVGCOUNTER'].fields_by_name['sum']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_AVGCOUNTER'].fields_by_name['start']._options = None
  _globals['_AVGCOUNTER'].fields_by_name['start']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_AVGCOUNTER']._options = None
  _globals['_AVGCOUNTER']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_PARAMS']._serialized_start=103
  _globals['_PARAMS']._serialized_end=1093
  _globals['_DENOM']._serialized_start=1096
  _globals['_DENOM']._serialized_end=1280
  _globals['_AGGREGATEEXCHANGERATEPREVOTE']._serialized_start=1283
  _globals['_AGGREGATEEXCHANGERATEPREVOTE']._serialized_end=1464
  _globals['_AGGREGATEEXCHANGERATEVOTE']._serialized_start=1467
  _globals['_AGGREGATEEXCHANGERATEVOTE']._serialized_end=1693
  _globals['_EXCHANGERATETUPLE']._serialized_start=1696
  _globals['_EXCHANGERATETUPLE']._serialized_end=1878
  _globals['_AVGCOUNTER']._serialized_start=1881
  _globals['_AVGCOUNTER']._serialized_end=2047
# @@protoc_insertion_point(module_scope)
