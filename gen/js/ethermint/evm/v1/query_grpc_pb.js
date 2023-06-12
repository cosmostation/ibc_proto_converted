// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ethermint_evm_v1_query_pb = require('../../../ethermint/evm/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var ethermint_evm_v1_evm_pb = require('../../../ethermint/evm/v1/evm_pb.js');
var ethermint_evm_v1_tx_pb = require('../../../ethermint/evm/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_ethermint_evm_v1_EstimateGasResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.EstimateGasResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.EstimateGasResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_EstimateGasResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.EstimateGasResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_EthCallRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.EthCallRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.EthCallRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_EthCallRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.EthCallRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_MsgEthereumTxResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_tx_pb.MsgEthereumTxResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.MsgEthereumTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_MsgEthereumTxResponse(buffer_arg) {
  return ethermint_evm_v1_tx_pb.MsgEthereumTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryAccountRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryAccountRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryAccountRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryAccountResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryAccountResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryAccountResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryBalanceRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryBalanceRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryBalanceResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryBalanceResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryBaseFeeRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryBaseFeeRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryBaseFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryBaseFeeRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryBaseFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryBaseFeeResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryBaseFeeResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryBaseFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryBaseFeeResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryBaseFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryCodeRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryCodeRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryCodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryCodeRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryCodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryCodeResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryCodeResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryCodeResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryCosmosAccountRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryCosmosAccountRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryCosmosAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryCosmosAccountRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryCosmosAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryCosmosAccountResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryCosmosAccountResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryCosmosAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryCosmosAccountResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryCosmosAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryParamsRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryParamsResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryStorageRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryStorageRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryStorageRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryStorageRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryStorageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryStorageResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryStorageResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryStorageResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryStorageResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryStorageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryTraceBlockRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryTraceBlockRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryTraceBlockRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryTraceBlockRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryTraceBlockRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryTraceBlockResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryTraceBlockResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryTraceBlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryTraceBlockResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryTraceBlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryTraceTxRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryTraceTxRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryTraceTxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryTraceTxRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryTraceTxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryTraceTxResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryTraceTxResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryTraceTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryTraceTxResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryTraceTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryValidatorAccountRequest(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryValidatorAccountRequest)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryValidatorAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryValidatorAccountRequest(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryValidatorAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_QueryValidatorAccountResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_query_pb.QueryValidatorAccountResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.QueryValidatorAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_QueryValidatorAccountResponse(buffer_arg) {
  return ethermint_evm_v1_query_pb.QueryValidatorAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Account queries an Ethereum account.
account: {
    path: '/ethermint.evm.v1.Query/Account',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryAccountRequest,
    responseType: ethermint_evm_v1_query_pb.QueryAccountResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryAccountRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryAccountRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryAccountResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryAccountResponse,
  },
  // CosmosAccount queries an Ethereum account's Cosmos Address.
cosmosAccount: {
    path: '/ethermint.evm.v1.Query/CosmosAccount',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryCosmosAccountRequest,
    responseType: ethermint_evm_v1_query_pb.QueryCosmosAccountResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryCosmosAccountRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryCosmosAccountRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryCosmosAccountResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryCosmosAccountResponse,
  },
  // ValidatorAccount queries an Ethereum account's from a validator consensus
// Address.
validatorAccount: {
    path: '/ethermint.evm.v1.Query/ValidatorAccount',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryValidatorAccountRequest,
    responseType: ethermint_evm_v1_query_pb.QueryValidatorAccountResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryValidatorAccountRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryValidatorAccountRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryValidatorAccountResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryValidatorAccountResponse,
  },
  // Balance queries the balance of a the EVM denomination for a single
// EthAccount.
balance: {
    path: '/ethermint.evm.v1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryBalanceRequest,
    responseType: ethermint_evm_v1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryBalanceRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryBalanceRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryBalanceResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryBalanceResponse,
  },
  // Storage queries the balance of all coins for a single account.
storage: {
    path: '/ethermint.evm.v1.Query/Storage',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryStorageRequest,
    responseType: ethermint_evm_v1_query_pb.QueryStorageResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryStorageRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryStorageRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryStorageResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryStorageResponse,
  },
  // Code queries the balance of all coins for a single account.
code: {
    path: '/ethermint.evm.v1.Query/Code',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryCodeRequest,
    responseType: ethermint_evm_v1_query_pb.QueryCodeResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryCodeRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryCodeRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryCodeResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryCodeResponse,
  },
  // Params queries the parameters of x/evm module.
params: {
    path: '/ethermint.evm.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryParamsRequest,
    responseType: ethermint_evm_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryParamsRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryParamsRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryParamsResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryParamsResponse,
  },
  // EthCall implements the `eth_call` rpc api
ethCall: {
    path: '/ethermint.evm.v1.Query/EthCall',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.EthCallRequest,
    responseType: ethermint_evm_v1_tx_pb.MsgEthereumTxResponse,
    requestSerialize: serialize_ethermint_evm_v1_EthCallRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_EthCallRequest,
    responseSerialize: serialize_ethermint_evm_v1_MsgEthereumTxResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_MsgEthereumTxResponse,
  },
  // EstimateGas implements the `eth_estimateGas` rpc api
estimateGas: {
    path: '/ethermint.evm.v1.Query/EstimateGas',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.EthCallRequest,
    responseType: ethermint_evm_v1_query_pb.EstimateGasResponse,
    requestSerialize: serialize_ethermint_evm_v1_EthCallRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_EthCallRequest,
    responseSerialize: serialize_ethermint_evm_v1_EstimateGasResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_EstimateGasResponse,
  },
  // TraceTx implements the `debug_traceTransaction` rpc api
traceTx: {
    path: '/ethermint.evm.v1.Query/TraceTx',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryTraceTxRequest,
    responseType: ethermint_evm_v1_query_pb.QueryTraceTxResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryTraceTxRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryTraceTxRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryTraceTxResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryTraceTxResponse,
  },
  // TraceBlock implements the `debug_traceBlockByNumber` and `debug_traceBlockByHash` rpc api
traceBlock: {
    path: '/ethermint.evm.v1.Query/TraceBlock',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryTraceBlockRequest,
    responseType: ethermint_evm_v1_query_pb.QueryTraceBlockResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryTraceBlockRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryTraceBlockRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryTraceBlockResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryTraceBlockResponse,
  },
  // BaseFee queries the base fee of the parent block of the current block,
// it's similar to feemarket module's method, but also checks london hardfork status.
baseFee: {
    path: '/ethermint.evm.v1.Query/BaseFee',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_query_pb.QueryBaseFeeRequest,
    responseType: ethermint_evm_v1_query_pb.QueryBaseFeeResponse,
    requestSerialize: serialize_ethermint_evm_v1_QueryBaseFeeRequest,
    requestDeserialize: deserialize_ethermint_evm_v1_QueryBaseFeeRequest,
    responseSerialize: serialize_ethermint_evm_v1_QueryBaseFeeResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_QueryBaseFeeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
