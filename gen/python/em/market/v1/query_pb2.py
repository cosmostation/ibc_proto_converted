# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/market/v1/query.proto
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
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from em.market.v1 import market_pb2 as em_dot_market_dot_v1_dot_market__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x65m/market/v1/query.proto\x12\x0c\x65m.market.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19\x65m/market/v1/market.proto\"E\n\x15QueryByAccountRequest\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\"b\n\x16QueryByAccountResponse\x12\x42\n\x06orders\x18\x01 \x03(\x0b\x32\x13.em.market.v1.OrderB\x15\xc8\xde\x1f\x01\xf2\xde\x1f\ryaml:\"orders\"R\x06orders:\x04\x98\xa0\x1f\x00\"\x19\n\x17QueryInstrumentsRequest\"\x9e\x04\n\x18QueryInstrumentsResponse\x12l\n\x0binstruments\x18\x01 \x03(\x0b\x32..em.market.v1.QueryInstrumentsResponse.ElementB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"instruments\"R\x0binstruments\x1a\x8d\x03\n\x07\x45lement\x12)\n\x06source\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12\x38\n\x0b\x64\x65stination\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\x12^\n\nlast_price\x18\x03 \x01(\tB?\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x11yaml:\"last_price\"R\tlastPrice\x12^\n\nbest_price\x18\x04 \x01(\tB?\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x11yaml:\"best_price\"R\tbestPrice\x12W\n\x0blast_traded\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1a\xf2\xde\x1f\x12yaml:\"last_traded\"\x90\xdf\x1f\x01R\nlastTraded:\x04\x98\xa0\x1f\x00:\x04\x98\xa0\x1f\x00\"R\n\x16QueryInstrumentRequest\x12\x16\n\x06source\x18\x01 \x01(\tR\x06source\x12 \n\x0b\x64\x65stination\x18\x02 \x01(\tR\x0b\x64\x65stination\"\xd5\x01\n\x17QueryInstrumentResponse\x12)\n\x06source\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"source\"R\x06source\x12\x38\n\x0b\x64\x65stination\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"destination\"R\x0b\x64\x65stination\x12O\n\x06orders\x18\x03 \x03(\x0b\x32 .em.market.v1.QueryOrderResponseB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"orders\"R\x06orders:\x04\x98\xa0\x1f\x00\"\x9f\x03\n\x12QueryOrderResponse\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12&\n\x05owner\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x46\n\x10source_remaining\x18\x03 \x01(\tB\x1b\xf2\xde\x1f\x17yaml:\"source_remaining\"R\x0fsourceRemaining\x12\x46\n\x0f\x63lient_order_id\x18\x04 \x01(\tB\x1e\xc8\xde\x1f\x01\xf2\xde\x1f\x16yaml:\"client_order_id\"R\rclientOrderId\x12T\n\x05price\x18\x05 \x01(\tB>\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x0cyaml:\"price\"R\x05price\x12P\n\x07\x63reated\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1a\xc8\xde\x1f\x00\xf2\xde\x1f\x0eyaml:\"created\"\x90\xdf\x1f\x01R\x07\x63reated:\x04\x98\xa0\x1f\x00\x32\xaf\x03\n\x05Query\x12\x84\x01\n\tByAccount\x12#.em.market.v1.QueryByAccountRequest\x1a$.em.market.v1.QueryByAccountResponse\",\x82\xd3\xe4\x93\x02&\x12$/e-money/market/v1/account/{address}\x12\x84\x01\n\x0bInstruments\x12%.em.market.v1.QueryInstrumentsRequest\x1a&.em.market.v1.QueryInstrumentsResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/e-money/market/v1/instruments\x12\x97\x01\n\nInstrument\x12$.em.market.v1.QueryInstrumentRequest\x1a%.em.market.v1.QueryInstrumentResponse\"<\x82\xd3\xe4\x93\x02\x36\x12\x34/e-money/market/v1/instrument/{source}/{destination}B\x9b\x01\n\x10\x63om.em.market.v1B\nQueryProtoZ+github.com/e-money/em-ledger/x/market/types\xa2\x02\x03\x45MX\xaa\x02\x0c\x45m.Market.V1\xca\x02\x0c\x45m\\Market\\V1\xe2\x02\x18\x45m\\Market\\V1\\GPBMetadata\xea\x02\x0e\x45m::Market::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.market.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\020com.em.market.v1B\nQueryProtoZ+github.com/e-money/em-ledger/x/market/types\242\002\003EMX\252\002\014Em.Market.V1\312\002\014Em\\Market\\V1\342\002\030Em\\Market\\V1\\GPBMetadata\352\002\016Em::Market::V1'
  _globals['_QUERYBYACCOUNTREQUEST'].fields_by_name['address']._options = None
  _globals['_QUERYBYACCOUNTREQUEST'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_QUERYBYACCOUNTRESPONSE'].fields_by_name['orders']._options = None
  _globals['_QUERYBYACCOUNTRESPONSE'].fields_by_name['orders']._serialized_options = b'\310\336\037\001\362\336\037\ryaml:\"orders\"'
  _globals['_QUERYBYACCOUNTRESPONSE']._options = None
  _globals['_QUERYBYACCOUNTRESPONSE']._serialized_options = b'\230\240\037\000'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['source']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['source']._serialized_options = b'\362\336\037\ryaml:\"source\"'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['destination']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['destination']._serialized_options = b'\362\336\037\022yaml:\"destination\"'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['last_price']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['last_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\021yaml:\"last_price\"'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['best_price']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['best_price']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\021yaml:\"best_price\"'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['last_traded']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT'].fields_by_name['last_traded']._serialized_options = b'\362\336\037\022yaml:\"last_traded\"\220\337\037\001'
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT']._serialized_options = b'\230\240\037\000'
  _globals['_QUERYINSTRUMENTSRESPONSE'].fields_by_name['instruments']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE'].fields_by_name['instruments']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"instruments\"'
  _globals['_QUERYINSTRUMENTSRESPONSE']._options = None
  _globals['_QUERYINSTRUMENTSRESPONSE']._serialized_options = b'\230\240\037\000'
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['source']._options = None
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['source']._serialized_options = b'\362\336\037\ryaml:\"source\"'
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['destination']._options = None
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['destination']._serialized_options = b'\362\336\037\022yaml:\"destination\"'
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['orders']._options = None
  _globals['_QUERYINSTRUMENTRESPONSE'].fields_by_name['orders']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"orders\"'
  _globals['_QUERYINSTRUMENTRESPONSE']._options = None
  _globals['_QUERYINSTRUMENTRESPONSE']._serialized_options = b'\230\240\037\000'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['id']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['owner']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['source_remaining']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['source_remaining']._serialized_options = b'\362\336\037\027yaml:\"source_remaining\"'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['client_order_id']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['client_order_id']._serialized_options = b'\310\336\037\001\362\336\037\026yaml:\"client_order_id\"'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['price']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\014yaml:\"price\"'
  _globals['_QUERYORDERRESPONSE'].fields_by_name['created']._options = None
  _globals['_QUERYORDERRESPONSE'].fields_by_name['created']._serialized_options = b'\310\336\037\000\362\336\037\016yaml:\"created\"\220\337\037\001'
  _globals['_QUERYORDERRESPONSE']._options = None
  _globals['_QUERYORDERRESPONSE']._serialized_options = b'\230\240\037\000'
  _globals['_QUERY'].methods_by_name['ByAccount']._options = None
  _globals['_QUERY'].methods_by_name['ByAccount']._serialized_options = b'\202\323\344\223\002&\022$/e-money/market/v1/account/{address}'
  _globals['_QUERY'].methods_by_name['Instruments']._options = None
  _globals['_QUERY'].methods_by_name['Instruments']._serialized_options = b'\202\323\344\223\002 \022\036/e-money/market/v1/instruments'
  _globals['_QUERY'].methods_by_name['Instrument']._options = None
  _globals['_QUERY'].methods_by_name['Instrument']._serialized_options = b'\202\323\344\223\0026\0224/e-money/market/v1/instrument/{source}/{destination}'
  _globals['_QUERYBYACCOUNTREQUEST']._serialized_start=186
  _globals['_QUERYBYACCOUNTREQUEST']._serialized_end=255
  _globals['_QUERYBYACCOUNTRESPONSE']._serialized_start=257
  _globals['_QUERYBYACCOUNTRESPONSE']._serialized_end=355
  _globals['_QUERYINSTRUMENTSREQUEST']._serialized_start=357
  _globals['_QUERYINSTRUMENTSREQUEST']._serialized_end=382
  _globals['_QUERYINSTRUMENTSRESPONSE']._serialized_start=385
  _globals['_QUERYINSTRUMENTSRESPONSE']._serialized_end=927
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT']._serialized_start=524
  _globals['_QUERYINSTRUMENTSRESPONSE_ELEMENT']._serialized_end=921
  _globals['_QUERYINSTRUMENTREQUEST']._serialized_start=929
  _globals['_QUERYINSTRUMENTREQUEST']._serialized_end=1011
  _globals['_QUERYINSTRUMENTRESPONSE']._serialized_start=1014
  _globals['_QUERYINSTRUMENTRESPONSE']._serialized_end=1227
  _globals['_QUERYORDERRESPONSE']._serialized_start=1230
  _globals['_QUERYORDERRESPONSE']._serialized_end=1645
  _globals['_QUERY']._serialized_start=1648
  _globals['_QUERY']._serialized_end=2079
# @@protoc_insertion_point(module_scope)
