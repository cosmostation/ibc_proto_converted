# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/orders/transactions/cancel/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from assetmantle.orders.transactions.cancel import message_pb2 as assetmantle_dot_orders_dot_transactions_dot_cancel_dot_message__pb2
from assetmantle.orders.transactions.cancel import transaction_response_pb2 as assetmantle_dot_orders_dot_transactions_dot_cancel_dot_transaction__response__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4assetmantle/orders/transactions/cancel/service.proto\x12.assetmantle.modules.orders.transactions.cancel\x1a\x1cgoogle/api/annotations.proto\x1a\x34\x61ssetmantle/orders/transactions/cancel/message.proto\x1a\x41\x61ssetmantle/orders/transactions/cancel/transaction_response.proto2\xb1\x01\n\x07Service\x12\xa5\x01\n\x06Handle\x12\x37.assetmantle.modules.orders.transactions.cancel.Message\x1a\x43.assetmantle.modules.orders.transactions.cancel.TransactionResponse\"\x1d\x82\xd3\xe4\x93\x02\x17\"\x15/mantle/orders/cancelB\xa0\x02\n2com.assetmantle.modules.orders.transactions.cancelB\x0cServiceProtoP\x01\xa2\x02\x05\x41MOTC\xaa\x02.Assetmantle.Modules.Orders.Transactions.Cancel\xca\x02.Assetmantle\\Modules\\Orders\\Transactions\\Cancel\xe2\x02:Assetmantle\\Modules\\Orders\\Transactions\\Cancel\\GPBMetadata\xea\x02\x32\x41ssetmantle::Modules::Orders::Transactions::Cancelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.orders.transactions.cancel.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n2com.assetmantle.modules.orders.transactions.cancelB\014ServiceProtoP\001\242\002\005AMOTC\252\002.Assetmantle.Modules.Orders.Transactions.Cancel\312\002.Assetmantle\\Modules\\Orders\\Transactions\\Cancel\342\002:Assetmantle\\Modules\\Orders\\Transactions\\Cancel\\GPBMetadata\352\0022Assetmantle::Modules::Orders::Transactions::Cancel'
  _SERVICE.methods_by_name['Handle']._options = None
  _SERVICE.methods_by_name['Handle']._serialized_options = b'\202\323\344\223\002\027\"\025/mantle/orders/cancel'
  _globals['_SERVICE']._serialized_start=256
  _globals['_SERVICE']._serialized_end=433
# @@protoc_insertion_point(module_scope)