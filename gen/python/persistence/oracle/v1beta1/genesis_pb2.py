# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: persistence/oracle/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from persistence.oracle.v1beta1 import oracle_pb2 as persistence_dot_oracle_dot_v1beta1_dot_oracle__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(persistence/oracle/v1beta1/genesis.proto\x12\x1apersistence.oracle.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\'persistence/oracle/v1beta1/oracle.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\x83\x05\n\x0cGenesisState\x12@\n\x06params\x18\x01 \x01(\x0b\x32\".persistence.oracle.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x61\n\x12\x66\x65\x65\x64\x65r_delegations\x18\x02 \x03(\x0b\x32,.persistence.oracle.v1beta1.FeederDelegationB\x04\xc8\xde\x1f\x00R\x11\x66\x65\x65\x64\x65rDelegations\x12p\n\x0e\x65xchange_rates\x18\x03 \x03(\x0b\x32-.persistence.oracle.v1beta1.ExchangeRateTupleB\x1a\xc8\xde\x1f\x00\xaa\xdf\x1f\x12\x45xchangeRateTuplesR\rexchangeRates\x12R\n\rmiss_counters\x18\x04 \x03(\x0b\x32\'.persistence.oracle.v1beta1.MissCounterB\x04\xc8\xde\x1f\x00R\x0cmissCounters\x12\x87\x01\n aggregate_exchange_rate_prevotes\x18\x05 \x03(\x0b\x32\x38.persistence.oracle.v1beta1.AggregateExchangeRatePrevoteB\x04\xc8\xde\x1f\x00R\x1d\x61ggregateExchangeRatePrevotes\x12~\n\x1d\x61ggregate_exchange_rate_votes\x18\x06 \x03(\x0b\x32\x35.persistence.oracle.v1beta1.AggregateExchangeRateVoteB\x04\xc8\xde\x1f\x00R\x1a\x61ggregateExchangeRateVotes\"\x9a\x01\n\x10\x46\x65\x65\x64\x65rDelegation\x12?\n\x0e\x66\x65\x65\x64\x65r_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\rfeederAddress\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\"w\n\x0bMissCounter\x12\x45\n\x11validator_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12!\n\x0cmiss_counter\x18\x02 \x01(\x04R\x0bmissCounterB\xf3\x01\n\x1e\x63om.persistence.oracle.v1beta1B\x0cGenesisProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/oracle/types\xa2\x02\x03POX\xaa\x02\x1aPersistence.Oracle.V1beta1\xca\x02\x1aPersistence\\Oracle\\V1beta1\xe2\x02&Persistence\\Oracle\\V1beta1\\GPBMetadata\xea\x02\x1cPersistence::Oracle::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'persistence.oracle.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036com.persistence.oracle.v1beta1B\014GenesisProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/oracle/types\242\002\003POX\252\002\032Persistence.Oracle.V1beta1\312\002\032Persistence\\Oracle\\V1beta1\342\002&Persistence\\Oracle\\V1beta1\\GPBMetadata\352\002\034Persistence::Oracle::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['feeder_delegations']._options = None
  _globals['_GENESISSTATE'].fields_by_name['feeder_delegations']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['exchange_rates']._options = None
  _globals['_GENESISSTATE'].fields_by_name['exchange_rates']._serialized_options = b'\310\336\037\000\252\337\037\022ExchangeRateTuples'
  _globals['_GENESISSTATE'].fields_by_name['miss_counters']._options = None
  _globals['_GENESISSTATE'].fields_by_name['miss_counters']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['aggregate_exchange_rate_prevotes']._options = None
  _globals['_GENESISSTATE'].fields_by_name['aggregate_exchange_rate_prevotes']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['aggregate_exchange_rate_votes']._options = None
  _globals['_GENESISSTATE'].fields_by_name['aggregate_exchange_rate_votes']._serialized_options = b'\310\336\037\000'
  _globals['_FEEDERDELEGATION'].fields_by_name['feeder_address']._options = None
  _globals['_FEEDERDELEGATION'].fields_by_name['feeder_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_FEEDERDELEGATION'].fields_by_name['validator_address']._options = None
  _globals['_FEEDERDELEGATION'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MISSCOUNTER'].fields_by_name['validator_address']._options = None
  _globals['_MISSCOUNTER'].fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_GENESISSTATE']._serialized_start=163
  _globals['_GENESISSTATE']._serialized_end=806
  _globals['_FEEDERDELEGATION']._serialized_start=809
  _globals['_FEEDERDELEGATION']._serialized_end=963
  _globals['_MISSCOUNTER']._serialized_start=965
  _globals['_MISSCOUNTER']._serialized_end=1084
# @@protoc_insertion_point(module_scope)
