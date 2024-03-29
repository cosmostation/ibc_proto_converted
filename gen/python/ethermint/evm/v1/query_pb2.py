# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ethermint/evm/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from ethermint.evm.v1 import evm_pb2 as ethermint_dot_evm_dot_v1_dot_evm__pb2
from ethermint.evm.v1 import tx_pb2 as ethermint_dot_evm_dot_v1_dot_tx__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x65thermint/evm/v1/query.proto\x12\x10\x65thermint.evm.v1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1a\x65thermint/evm/v1/evm.proto\x1a\x19\x65thermint/evm/v1/tx.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"9\n\x13QueryAccountRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"c\n\x14QueryAccountResponse\x12\x18\n\x07\x62\x61lance\x18\x01 \x01(\tR\x07\x62\x61lance\x12\x1b\n\tcode_hash\x18\x02 \x01(\tR\x08\x63odeHash\x12\x14\n\x05nonce\x18\x03 \x01(\x04R\x05nonce\"?\n\x19QueryCosmosAccountRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x86\x01\n\x1aQueryCosmosAccountResponse\x12%\n\x0e\x63osmos_address\x18\x01 \x01(\tR\rcosmosAddress\x12\x1a\n\x08sequence\x18\x02 \x01(\x04R\x08sequence\x12%\n\x0e\x61\x63\x63ount_number\x18\x03 \x01(\x04R\raccountNumber\"K\n\x1cQueryValidatorAccountRequest\x12!\n\x0c\x63ons_address\x18\x01 \x01(\tR\x0b\x63onsAddress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x8b\x01\n\x1dQueryValidatorAccountResponse\x12\'\n\x0f\x61\x63\x63ount_address\x18\x01 \x01(\tR\x0e\x61\x63\x63ountAddress\x12\x1a\n\x08sequence\x18\x02 \x01(\x04R\x08sequence\x12%\n\x0e\x61\x63\x63ount_number\x18\x03 \x01(\x04R\raccountNumber\"9\n\x13QueryBalanceRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"0\n\x14QueryBalanceResponse\x12\x18\n\x07\x62\x61lance\x18\x01 \x01(\tR\x07\x62\x61lance\"K\n\x13QueryStorageRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x10\n\x03key\x18\x02 \x01(\tR\x03key:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\",\n\x14QueryStorageResponse\x12\x14\n\x05value\x18\x01 \x01(\tR\x05value\"6\n\x10QueryCodeRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\'\n\x11QueryCodeResponse\x12\x12\n\x04\x63ode\x18\x01 \x01(\x0cR\x04\x63ode\"z\n\x12QueryTxLogsRequest\x12\x12\n\x04hash\x18\x01 \x01(\tR\x04hash\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x89\x01\n\x13QueryTxLogsResponse\x12)\n\x04logs\x18\x01 \x03(\x0b\x32\x15.ethermint.evm.v1.LogR\x04logs\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x14\n\x12QueryParamsRequest\"M\n\x13QueryParamsResponse\x12\x36\n\x06params\x18\x01 \x01(\x0b\x32\x18.ethermint.evm.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\xb7\x01\n\x0e\x45thCallRequest\x12\x12\n\x04\x61rgs\x18\x01 \x01(\x0cR\x04\x61rgs\x12\x17\n\x07gas_cap\x18\x02 \x01(\x04R\x06gasCap\x12]\n\x10proposer_address\x18\x03 \x01(\x0c\x42\x32\xfa\xde\x1f.github.com/cosmos/cosmos-sdk/types.ConsAddressR\x0fproposerAddress\x12\x19\n\x08\x63hain_id\x18\x04 \x01(\x03R\x07\x63hainId\"\'\n\x13\x45stimateGasResponse\x12\x10\n\x03gas\x18\x01 \x01(\x04R\x03gas\"\xe0\x03\n\x13QueryTraceTxRequest\x12\x31\n\x03msg\x18\x01 \x01(\x0b\x32\x1f.ethermint.evm.v1.MsgEthereumTxR\x03msg\x12@\n\x0ctrace_config\x18\x03 \x01(\x0b\x32\x1d.ethermint.evm.v1.TraceConfigR\x0btraceConfig\x12\x43\n\x0cpredecessors\x18\x04 \x03(\x0b\x32\x1f.ethermint.evm.v1.MsgEthereumTxR\x0cpredecessors\x12!\n\x0c\x62lock_number\x18\x05 \x01(\x03R\x0b\x62lockNumber\x12\x1d\n\nblock_hash\x18\x06 \x01(\tR\tblockHash\x12\x43\n\nblock_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tblockTime\x12]\n\x10proposer_address\x18\x08 \x01(\x0c\x42\x32\xfa\xde\x1f.github.com/cosmos/cosmos-sdk/types.ConsAddressR\x0fproposerAddress\x12\x19\n\x08\x63hain_id\x18\t \x01(\x03R\x07\x63hainIdJ\x04\x08\x02\x10\x03R\x08tx_index\"*\n\x14QueryTraceTxResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"\x8e\x03\n\x16QueryTraceBlockRequest\x12\x31\n\x03txs\x18\x01 \x03(\x0b\x32\x1f.ethermint.evm.v1.MsgEthereumTxR\x03txs\x12@\n\x0ctrace_config\x18\x03 \x01(\x0b\x32\x1d.ethermint.evm.v1.TraceConfigR\x0btraceConfig\x12!\n\x0c\x62lock_number\x18\x05 \x01(\x03R\x0b\x62lockNumber\x12\x1d\n\nblock_hash\x18\x06 \x01(\tR\tblockHash\x12\x43\n\nblock_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tblockTime\x12]\n\x10proposer_address\x18\x08 \x01(\x0c\x42\x32\xfa\xde\x1f.github.com/cosmos/cosmos-sdk/types.ConsAddressR\x0fproposerAddress\x12\x19\n\x08\x63hain_id\x18\t \x01(\x03R\x07\x63hainId\"-\n\x17QueryTraceBlockResponse\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\x0cR\x04\x64\x61ta\"\x15\n\x13QueryBaseFeeRequest\"]\n\x14QueryBaseFeeResponse\x12\x45\n\x08\x62\x61se_fee\x18\x01 \x01(\tB*\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x07\x62\x61seFee2\xbf\x0c\n\x05Query\x12\x81\x01\n\x07\x41\x63\x63ount\x12%.ethermint.evm.v1.QueryAccountRequest\x1a&.ethermint.evm.v1.QueryAccountResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/evmos/evm/v1/account/{address}\x12\x9a\x01\n\rCosmosAccount\x12+.ethermint.evm.v1.QueryCosmosAccountRequest\x1a,.ethermint.evm.v1.QueryCosmosAccountResponse\".\x82\xd3\xe4\x93\x02(\x12&/evmos/evm/v1/cosmos_account/{address}\x12\xab\x01\n\x10ValidatorAccount\x12..ethermint.evm.v1.QueryValidatorAccountRequest\x1a/.ethermint.evm.v1.QueryValidatorAccountResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./evmos/evm/v1/validator_account/{cons_address}\x12\x82\x01\n\x07\x42\x61lance\x12%.ethermint.evm.v1.QueryBalanceRequest\x1a&.ethermint.evm.v1.QueryBalanceResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /evmos/evm/v1/balances/{address}\x12\x87\x01\n\x07Storage\x12%.ethermint.evm.v1.QueryStorageRequest\x1a&.ethermint.evm.v1.QueryStorageResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/evmos/evm/v1/storage/{address}/{key}\x12v\n\x04\x43ode\x12\".ethermint.evm.v1.QueryCodeRequest\x1a#.ethermint.evm.v1.QueryCodeResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/evmos/evm/v1/codes/{address}\x12s\n\x06Params\x12$.ethermint.evm.v1.QueryParamsRequest\x1a%.ethermint.evm.v1.QueryParamsResponse\"\x1c\x82\xd3\xe4\x93\x02\x16\x12\x14/evmos/evm/v1/params\x12t\n\x07\x45thCall\x12 .ethermint.evm.v1.EthCallRequest\x1a\'.ethermint.evm.v1.MsgEthereumTxResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/evmos/evm/v1/eth_call\x12z\n\x0b\x45stimateGas\x12 .ethermint.evm.v1.EthCallRequest\x1a%.ethermint.evm.v1.EstimateGasResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/evmos/evm/v1/estimate_gas\x12x\n\x07TraceTx\x12%.ethermint.evm.v1.QueryTraceTxRequest\x1a&.ethermint.evm.v1.QueryTraceTxResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/evmos/evm/v1/trace_tx\x12\x84\x01\n\nTraceBlock\x12(.ethermint.evm.v1.QueryTraceBlockRequest\x1a).ethermint.evm.v1.QueryTraceBlockResponse\"!\x82\xd3\xe4\x93\x02\x1b\x12\x19/evmos/evm/v1/trace_block\x12x\n\x07\x42\x61seFee\x12%.ethermint.evm.v1.QueryBaseFeeRequest\x1a&.ethermint.evm.v1.QueryBaseFeeResponse\"\x1e\x82\xd3\xe4\x93\x02\x18\x12\x16/evmos/evm/v1/base_feeB\xaa\x01\n\x14\x63om.ethermint.evm.v1B\nQueryProtoZ&github.com/evmos/evmos/v13/x/evm/types\xa2\x02\x03\x45\x45X\xaa\x02\x10\x45thermint.Evm.V1\xca\x02\x10\x45thermint\\Evm\\V1\xe2\x02\x1c\x45thermint\\Evm\\V1\\GPBMetadata\xea\x02\x12\x45thermint::Evm::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ethermint.evm.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.ethermint.evm.v1B\nQueryProtoZ&github.com/evmos/evmos/v13/x/evm/types\242\002\003EEX\252\002\020Ethermint.Evm.V1\312\002\020Ethermint\\Evm\\V1\342\002\034Ethermint\\Evm\\V1\\GPBMetadata\352\002\022Ethermint::Evm::V1'
  _globals['_QUERYACCOUNTREQUEST']._options = None
  _globals['_QUERYACCOUNTREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYCOSMOSACCOUNTREQUEST']._options = None
  _globals['_QUERYCOSMOSACCOUNTREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYVALIDATORACCOUNTREQUEST']._options = None
  _globals['_QUERYVALIDATORACCOUNTREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYBALANCEREQUEST']._options = None
  _globals['_QUERYBALANCEREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYSTORAGEREQUEST']._options = None
  _globals['_QUERYSTORAGEREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYCODEREQUEST']._options = None
  _globals['_QUERYCODEREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYTXLOGSREQUEST']._options = None
  _globals['_QUERYTXLOGSREQUEST']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_ETHCALLREQUEST'].fields_by_name['proposer_address']._options = None
  _globals['_ETHCALLREQUEST'].fields_by_name['proposer_address']._serialized_options = b'\372\336\037.github.com/cosmos/cosmos-sdk/types.ConsAddress'
  _globals['_QUERYTRACETXREQUEST'].fields_by_name['block_time']._options = None
  _globals['_QUERYTRACETXREQUEST'].fields_by_name['block_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_QUERYTRACETXREQUEST'].fields_by_name['proposer_address']._options = None
  _globals['_QUERYTRACETXREQUEST'].fields_by_name['proposer_address']._serialized_options = b'\372\336\037.github.com/cosmos/cosmos-sdk/types.ConsAddress'
  _globals['_QUERYTRACEBLOCKREQUEST'].fields_by_name['block_time']._options = None
  _globals['_QUERYTRACEBLOCKREQUEST'].fields_by_name['block_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_QUERYTRACEBLOCKREQUEST'].fields_by_name['proposer_address']._options = None
  _globals['_QUERYTRACEBLOCKREQUEST'].fields_by_name['proposer_address']._serialized_options = b'\372\336\037.github.com/cosmos/cosmos-sdk/types.ConsAddress'
  _globals['_QUERYBASEFEERESPONSE'].fields_by_name['base_fee']._options = None
  _globals['_QUERYBASEFEERESPONSE'].fields_by_name['base_fee']._serialized_options = b'\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_QUERY'].methods_by_name['Account']._options = None
  _globals['_QUERY'].methods_by_name['Account']._serialized_options = b'\202\323\344\223\002!\022\037/evmos/evm/v1/account/{address}'
  _globals['_QUERY'].methods_by_name['CosmosAccount']._options = None
  _globals['_QUERY'].methods_by_name['CosmosAccount']._serialized_options = b'\202\323\344\223\002(\022&/evmos/evm/v1/cosmos_account/{address}'
  _globals['_QUERY'].methods_by_name['ValidatorAccount']._options = None
  _globals['_QUERY'].methods_by_name['ValidatorAccount']._serialized_options = b'\202\323\344\223\0020\022./evmos/evm/v1/validator_account/{cons_address}'
  _globals['_QUERY'].methods_by_name['Balance']._options = None
  _globals['_QUERY'].methods_by_name['Balance']._serialized_options = b'\202\323\344\223\002\"\022 /evmos/evm/v1/balances/{address}'
  _globals['_QUERY'].methods_by_name['Storage']._options = None
  _globals['_QUERY'].methods_by_name['Storage']._serialized_options = b'\202\323\344\223\002\'\022%/evmos/evm/v1/storage/{address}/{key}'
  _globals['_QUERY'].methods_by_name['Code']._options = None
  _globals['_QUERY'].methods_by_name['Code']._serialized_options = b'\202\323\344\223\002\037\022\035/evmos/evm/v1/codes/{address}'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\026\022\024/evmos/evm/v1/params'
  _globals['_QUERY'].methods_by_name['EthCall']._options = None
  _globals['_QUERY'].methods_by_name['EthCall']._serialized_options = b'\202\323\344\223\002\030\022\026/evmos/evm/v1/eth_call'
  _globals['_QUERY'].methods_by_name['EstimateGas']._options = None
  _globals['_QUERY'].methods_by_name['EstimateGas']._serialized_options = b'\202\323\344\223\002\034\022\032/evmos/evm/v1/estimate_gas'
  _globals['_QUERY'].methods_by_name['TraceTx']._options = None
  _globals['_QUERY'].methods_by_name['TraceTx']._serialized_options = b'\202\323\344\223\002\030\022\026/evmos/evm/v1/trace_tx'
  _globals['_QUERY'].methods_by_name['TraceBlock']._options = None
  _globals['_QUERY'].methods_by_name['TraceBlock']._serialized_options = b'\202\323\344\223\002\033\022\031/evmos/evm/v1/trace_block'
  _globals['_QUERY'].methods_by_name['BaseFee']._options = None
  _globals['_QUERY'].methods_by_name['BaseFee']._serialized_options = b'\202\323\344\223\002\030\022\026/evmos/evm/v1/base_fee'
  _globals['_QUERYACCOUNTREQUEST']._serialized_start=234
  _globals['_QUERYACCOUNTREQUEST']._serialized_end=291
  _globals['_QUERYACCOUNTRESPONSE']._serialized_start=293
  _globals['_QUERYACCOUNTRESPONSE']._serialized_end=392
  _globals['_QUERYCOSMOSACCOUNTREQUEST']._serialized_start=394
  _globals['_QUERYCOSMOSACCOUNTREQUEST']._serialized_end=457
  _globals['_QUERYCOSMOSACCOUNTRESPONSE']._serialized_start=460
  _globals['_QUERYCOSMOSACCOUNTRESPONSE']._serialized_end=594
  _globals['_QUERYVALIDATORACCOUNTREQUEST']._serialized_start=596
  _globals['_QUERYVALIDATORACCOUNTREQUEST']._serialized_end=671
  _globals['_QUERYVALIDATORACCOUNTRESPONSE']._serialized_start=674
  _globals['_QUERYVALIDATORACCOUNTRESPONSE']._serialized_end=813
  _globals['_QUERYBALANCEREQUEST']._serialized_start=815
  _globals['_QUERYBALANCEREQUEST']._serialized_end=872
  _globals['_QUERYBALANCERESPONSE']._serialized_start=874
  _globals['_QUERYBALANCERESPONSE']._serialized_end=922
  _globals['_QUERYSTORAGEREQUEST']._serialized_start=924
  _globals['_QUERYSTORAGEREQUEST']._serialized_end=999
  _globals['_QUERYSTORAGERESPONSE']._serialized_start=1001
  _globals['_QUERYSTORAGERESPONSE']._serialized_end=1045
  _globals['_QUERYCODEREQUEST']._serialized_start=1047
  _globals['_QUERYCODEREQUEST']._serialized_end=1101
  _globals['_QUERYCODERESPONSE']._serialized_start=1103
  _globals['_QUERYCODERESPONSE']._serialized_end=1142
  _globals['_QUERYTXLOGSREQUEST']._serialized_start=1144
  _globals['_QUERYTXLOGSREQUEST']._serialized_end=1266
  _globals['_QUERYTXLOGSRESPONSE']._serialized_start=1269
  _globals['_QUERYTXLOGSRESPONSE']._serialized_end=1406
  _globals['_QUERYPARAMSREQUEST']._serialized_start=1408
  _globals['_QUERYPARAMSREQUEST']._serialized_end=1428
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=1430
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=1507
  _globals['_ETHCALLREQUEST']._serialized_start=1510
  _globals['_ETHCALLREQUEST']._serialized_end=1693
  _globals['_ESTIMATEGASRESPONSE']._serialized_start=1695
  _globals['_ESTIMATEGASRESPONSE']._serialized_end=1734
  _globals['_QUERYTRACETXREQUEST']._serialized_start=1737
  _globals['_QUERYTRACETXREQUEST']._serialized_end=2217
  _globals['_QUERYTRACETXRESPONSE']._serialized_start=2219
  _globals['_QUERYTRACETXRESPONSE']._serialized_end=2261
  _globals['_QUERYTRACEBLOCKREQUEST']._serialized_start=2264
  _globals['_QUERYTRACEBLOCKREQUEST']._serialized_end=2662
  _globals['_QUERYTRACEBLOCKRESPONSE']._serialized_start=2664
  _globals['_QUERYTRACEBLOCKRESPONSE']._serialized_end=2709
  _globals['_QUERYBASEFEEREQUEST']._serialized_start=2711
  _globals['_QUERYBASEFEEREQUEST']._serialized_end=2732
  _globals['_QUERYBASEFEERESPONSE']._serialized_start=2734
  _globals['_QUERYBASEFEERESPONSE']._serialized_end=2827
  _globals['_QUERY']._serialized_start=2830
  _globals['_QUERY']._serialized_end=4429
# @@protoc_insertion_point(module_scope)
