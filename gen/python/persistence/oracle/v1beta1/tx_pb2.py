# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: persistence/oracle/v1beta1/tx.proto
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
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#persistence/oracle/v1beta1/tx.proto\x12\x1apersistence.oracle.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xc7\x01\n\x1fMsgAggregateExchangeRatePrevote\x12#\n\x04hash\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"hash\"R\x04hash\x12\x41\n\x06\x66\x65\x65\x64\x65r\x18\x02 \x01(\tB)\xf2\xde\x1f\ryaml:\"feeder\"\xd2\xb4-\x14\x63osmos.AddressStringR\x06\x66\x65\x65\x64\x65r\x12\x32\n\tvalidator\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"validator\"R\tvalidator:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\")\n\'MsgAggregateExchangeRatePrevoteResponse\"\x9e\x02\n\x1cMsgAggregateExchangeRateVote\x12#\n\x04salt\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"salt\"R\x04salt\x12@\n\x0e\x65xchange_rates\x18\x02 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"exchange_rates\"R\rexchangeRates\x12\x41\n\x06\x66\x65\x65\x64\x65r\x18\x03 \x01(\tB)\xf2\xde\x1f\ryaml:\"feeder\"\xd2\xb4-\x14\x63osmos.AddressStringR\x06\x66\x65\x65\x64\x65r\x12J\n\tvalidator\x18\x04 \x01(\tB,\xf2\xde\x1f\x10yaml:\"validator\"\xd2\xb4-\x14\x63osmos.AddressStringR\tvalidator:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"&\n$MsgAggregateExchangeRateVoteResponse\"\xb4\x01\n\x16MsgDelegateFeedConsent\x12G\n\x08operator\x18\x01 \x01(\tB+\xf2\xde\x1f\x0fyaml:\"operator\"\xd2\xb4-\x14\x63osmos.AddressStringR\x08operator\x12G\n\x08\x64\x65legate\x18\x02 \x01(\tB+\xf2\xde\x1f\x0fyaml:\"delegate\"\xd2\xb4-\x14\x63osmos.AddressStringR\x08\x64\x65legate:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\" \n\x1eMsgDelegateFeedConsentResponse\"\xc3\x01\n\x17MsgAddFundsToRewardPool\x12;\n\x04\x66rom\x18\x01 \x01(\tB\'\xf2\xde\x1f\x0byaml:\"from\"\xd2\xb4-\x14\x63osmos.AddressStringR\x04\x66rom\x12\x61\n\x05\x66unds\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05\x66unds:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"!\n\x1fMsgAddFundsToRewardPoolResponse2\xd5\x04\n\x03Msg\x12\xa0\x01\n\x1c\x41ggregateExchangeRatePrevote\x12;.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote\x1a\x43.persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse\x12\x97\x01\n\x19\x41ggregateExchangeRateVote\x12\x38.persistence.oracle.v1beta1.MsgAggregateExchangeRateVote\x1a@.persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse\x12\x85\x01\n\x13\x44\x65legateFeedConsent\x12\x32.persistence.oracle.v1beta1.MsgDelegateFeedConsent\x1a:.persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse\x12\x88\x01\n\x14\x41\x64\x64\x46undsToRewardPool\x12\x33.persistence.oracle.v1beta1.MsgAddFundsToRewardPool\x1a;.persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponseB\xee\x01\n\x1e\x63om.persistence.oracle.v1beta1B\x07TxProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/oracle/types\xa2\x02\x03POX\xaa\x02\x1aPersistence.Oracle.V1beta1\xca\x02\x1aPersistence\\Oracle\\V1beta1\xe2\x02&Persistence\\Oracle\\V1beta1\\GPBMetadata\xea\x02\x1cPersistence::Oracle::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'persistence.oracle.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036com.persistence.oracle.v1beta1B\007TxProtoZ;github.com/persistenceOne/persistence-sdk/v2/x/oracle/types\242\002\003POX\252\002\032Persistence.Oracle.V1beta1\312\002\032Persistence\\Oracle\\V1beta1\342\002&Persistence\\Oracle\\V1beta1\\GPBMetadata\352\002\034Persistence::Oracle::V1beta1'
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['hash']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['hash']._serialized_options = b'\362\336\037\013yaml:\"hash\"'
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['feeder']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['feeder']._serialized_options = b'\362\336\037\ryaml:\"feeder\"\322\264-\024cosmos.AddressString'
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['validator']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE'].fields_by_name['validator']._serialized_options = b'\362\336\037\020yaml:\"validator\"'
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['salt']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['salt']._serialized_options = b'\362\336\037\013yaml:\"salt\"'
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['exchange_rates']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['exchange_rates']._serialized_options = b'\362\336\037\025yaml:\"exchange_rates\"'
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['feeder']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['feeder']._serialized_options = b'\362\336\037\ryaml:\"feeder\"\322\264-\024cosmos.AddressString'
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['validator']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE'].fields_by_name['validator']._serialized_options = b'\362\336\037\020yaml:\"validator\"\322\264-\024cosmos.AddressString'
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE']._options = None
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGDELEGATEFEEDCONSENT'].fields_by_name['operator']._options = None
  _globals['_MSGDELEGATEFEEDCONSENT'].fields_by_name['operator']._serialized_options = b'\362\336\037\017yaml:\"operator\"\322\264-\024cosmos.AddressString'
  _globals['_MSGDELEGATEFEEDCONSENT'].fields_by_name['delegate']._options = None
  _globals['_MSGDELEGATEFEEDCONSENT'].fields_by_name['delegate']._serialized_options = b'\362\336\037\017yaml:\"delegate\"\322\264-\024cosmos.AddressString'
  _globals['_MSGDELEGATEFEEDCONSENT']._options = None
  _globals['_MSGDELEGATEFEEDCONSENT']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGADDFUNDSTOREWARDPOOL'].fields_by_name['from']._options = None
  _globals['_MSGADDFUNDSTOREWARDPOOL'].fields_by_name['from']._serialized_options = b'\362\336\037\013yaml:\"from\"\322\264-\024cosmos.AddressString'
  _globals['_MSGADDFUNDSTOREWARDPOOL'].fields_by_name['funds']._options = None
  _globals['_MSGADDFUNDSTOREWARDPOOL'].fields_by_name['funds']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGADDFUNDSTOREWARDPOOL']._options = None
  _globals['_MSGADDFUNDSTOREWARDPOOL']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE']._serialized_start=149
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTE']._serialized_end=348
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTERESPONSE']._serialized_start=350
  _globals['_MSGAGGREGATEEXCHANGERATEPREVOTERESPONSE']._serialized_end=391
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE']._serialized_start=394
  _globals['_MSGAGGREGATEEXCHANGERATEVOTE']._serialized_end=680
  _globals['_MSGAGGREGATEEXCHANGERATEVOTERESPONSE']._serialized_start=682
  _globals['_MSGAGGREGATEEXCHANGERATEVOTERESPONSE']._serialized_end=720
  _globals['_MSGDELEGATEFEEDCONSENT']._serialized_start=723
  _globals['_MSGDELEGATEFEEDCONSENT']._serialized_end=903
  _globals['_MSGDELEGATEFEEDCONSENTRESPONSE']._serialized_start=905
  _globals['_MSGDELEGATEFEEDCONSENTRESPONSE']._serialized_end=937
  _globals['_MSGADDFUNDSTOREWARDPOOL']._serialized_start=940
  _globals['_MSGADDFUNDSTOREWARDPOOL']._serialized_end=1135
  _globals['_MSGADDFUNDSTOREWARDPOOLRESPONSE']._serialized_start=1137
  _globals['_MSGADDFUNDSTOREWARDPOOLRESPONSE']._serialized_end=1170
  _globals['_MSG']._serialized_start=1173
  _globals['_MSG']._serialized_end=1770
# @@protoc_insertion_point(module_scope)
