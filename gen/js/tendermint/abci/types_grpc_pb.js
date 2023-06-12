// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var tendermint_abci_types_pb = require('../../tendermint/abci/types_pb.js');
var tendermint_crypto_proof_pb = require('../../tendermint/crypto/proof_pb.js');
var tendermint_crypto_keys_pb = require('../../tendermint/crypto/keys_pb.js');
var tendermint_types_params_pb = require('../../tendermint/types/params_pb.js');
var tendermint_types_validator_pb = require('../../tendermint/types/validator_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_tendermint_abci_RequestApplySnapshotChunk(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestApplySnapshotChunk)) {
    throw new Error('Expected argument of type tendermint.abci.RequestApplySnapshotChunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestApplySnapshotChunk(buffer_arg) {
  return tendermint_abci_types_pb.RequestApplySnapshotChunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestCheckTx(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestCheckTx)) {
    throw new Error('Expected argument of type tendermint.abci.RequestCheckTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestCheckTx(buffer_arg) {
  return tendermint_abci_types_pb.RequestCheckTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestCommit(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestCommit)) {
    throw new Error('Expected argument of type tendermint.abci.RequestCommit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestCommit(buffer_arg) {
  return tendermint_abci_types_pb.RequestCommit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestEcho(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestEcho)) {
    throw new Error('Expected argument of type tendermint.abci.RequestEcho');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestEcho(buffer_arg) {
  return tendermint_abci_types_pb.RequestEcho.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestExtendVote(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestExtendVote)) {
    throw new Error('Expected argument of type tendermint.abci.RequestExtendVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestExtendVote(buffer_arg) {
  return tendermint_abci_types_pb.RequestExtendVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestFinalizeBlock(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestFinalizeBlock)) {
    throw new Error('Expected argument of type tendermint.abci.RequestFinalizeBlock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestFinalizeBlock(buffer_arg) {
  return tendermint_abci_types_pb.RequestFinalizeBlock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestFlush(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestFlush)) {
    throw new Error('Expected argument of type tendermint.abci.RequestFlush');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestFlush(buffer_arg) {
  return tendermint_abci_types_pb.RequestFlush.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestInfo(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestInfo)) {
    throw new Error('Expected argument of type tendermint.abci.RequestInfo');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestInfo(buffer_arg) {
  return tendermint_abci_types_pb.RequestInfo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestInitChain(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestInitChain)) {
    throw new Error('Expected argument of type tendermint.abci.RequestInitChain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestInitChain(buffer_arg) {
  return tendermint_abci_types_pb.RequestInitChain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestListSnapshots(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestListSnapshots)) {
    throw new Error('Expected argument of type tendermint.abci.RequestListSnapshots');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestListSnapshots(buffer_arg) {
  return tendermint_abci_types_pb.RequestListSnapshots.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestLoadSnapshotChunk(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestLoadSnapshotChunk)) {
    throw new Error('Expected argument of type tendermint.abci.RequestLoadSnapshotChunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestLoadSnapshotChunk(buffer_arg) {
  return tendermint_abci_types_pb.RequestLoadSnapshotChunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestOfferSnapshot(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestOfferSnapshot)) {
    throw new Error('Expected argument of type tendermint.abci.RequestOfferSnapshot');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestOfferSnapshot(buffer_arg) {
  return tendermint_abci_types_pb.RequestOfferSnapshot.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestPrepareProposal(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestPrepareProposal)) {
    throw new Error('Expected argument of type tendermint.abci.RequestPrepareProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestPrepareProposal(buffer_arg) {
  return tendermint_abci_types_pb.RequestPrepareProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestProcessProposal(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestProcessProposal)) {
    throw new Error('Expected argument of type tendermint.abci.RequestProcessProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestProcessProposal(buffer_arg) {
  return tendermint_abci_types_pb.RequestProcessProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestQuery(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestQuery)) {
    throw new Error('Expected argument of type tendermint.abci.RequestQuery');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestQuery(buffer_arg) {
  return tendermint_abci_types_pb.RequestQuery.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_RequestVerifyVoteExtension(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.RequestVerifyVoteExtension)) {
    throw new Error('Expected argument of type tendermint.abci.RequestVerifyVoteExtension');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_RequestVerifyVoteExtension(buffer_arg) {
  return tendermint_abci_types_pb.RequestVerifyVoteExtension.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseApplySnapshotChunk(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseApplySnapshotChunk)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseApplySnapshotChunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseApplySnapshotChunk(buffer_arg) {
  return tendermint_abci_types_pb.ResponseApplySnapshotChunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseCheckTx(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseCheckTx)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseCheckTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseCheckTx(buffer_arg) {
  return tendermint_abci_types_pb.ResponseCheckTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseCommit(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseCommit)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseCommit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseCommit(buffer_arg) {
  return tendermint_abci_types_pb.ResponseCommit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseEcho(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseEcho)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseEcho');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseEcho(buffer_arg) {
  return tendermint_abci_types_pb.ResponseEcho.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseExtendVote(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseExtendVote)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseExtendVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseExtendVote(buffer_arg) {
  return tendermint_abci_types_pb.ResponseExtendVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseFinalizeBlock(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseFinalizeBlock)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseFinalizeBlock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseFinalizeBlock(buffer_arg) {
  return tendermint_abci_types_pb.ResponseFinalizeBlock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseFlush(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseFlush)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseFlush');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseFlush(buffer_arg) {
  return tendermint_abci_types_pb.ResponseFlush.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseInfo(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseInfo)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseInfo');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseInfo(buffer_arg) {
  return tendermint_abci_types_pb.ResponseInfo.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseInitChain(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseInitChain)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseInitChain');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseInitChain(buffer_arg) {
  return tendermint_abci_types_pb.ResponseInitChain.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseListSnapshots(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseListSnapshots)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseListSnapshots');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseListSnapshots(buffer_arg) {
  return tendermint_abci_types_pb.ResponseListSnapshots.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseLoadSnapshotChunk(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseLoadSnapshotChunk)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseLoadSnapshotChunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseLoadSnapshotChunk(buffer_arg) {
  return tendermint_abci_types_pb.ResponseLoadSnapshotChunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseOfferSnapshot(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseOfferSnapshot)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseOfferSnapshot');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseOfferSnapshot(buffer_arg) {
  return tendermint_abci_types_pb.ResponseOfferSnapshot.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponsePrepareProposal(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponsePrepareProposal)) {
    throw new Error('Expected argument of type tendermint.abci.ResponsePrepareProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponsePrepareProposal(buffer_arg) {
  return tendermint_abci_types_pb.ResponsePrepareProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseProcessProposal(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseProcessProposal)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseProcessProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseProcessProposal(buffer_arg) {
  return tendermint_abci_types_pb.ResponseProcessProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseQuery(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseQuery)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseQuery');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseQuery(buffer_arg) {
  return tendermint_abci_types_pb.ResponseQuery.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_tendermint_abci_ResponseVerifyVoteExtension(arg) {
  if (!(arg instanceof tendermint_abci_types_pb.ResponseVerifyVoteExtension)) {
    throw new Error('Expected argument of type tendermint.abci.ResponseVerifyVoteExtension');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_tendermint_abci_ResponseVerifyVoteExtension(buffer_arg) {
  return tendermint_abci_types_pb.ResponseVerifyVoteExtension.deserializeBinary(new Uint8Array(buffer_arg));
}


// NOTE: When using custom types, mind the warnings.
// https://github.com/cosmos/gogoproto/blob/master/custom_types.md#warnings-and-issues
//
var ABCIService = exports.ABCIService = {
  echo: {
    path: '/tendermint.abci.ABCI/Echo',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestEcho,
    responseType: tendermint_abci_types_pb.ResponseEcho,
    requestSerialize: serialize_tendermint_abci_RequestEcho,
    requestDeserialize: deserialize_tendermint_abci_RequestEcho,
    responseSerialize: serialize_tendermint_abci_ResponseEcho,
    responseDeserialize: deserialize_tendermint_abci_ResponseEcho,
  },
  flush: {
    path: '/tendermint.abci.ABCI/Flush',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestFlush,
    responseType: tendermint_abci_types_pb.ResponseFlush,
    requestSerialize: serialize_tendermint_abci_RequestFlush,
    requestDeserialize: deserialize_tendermint_abci_RequestFlush,
    responseSerialize: serialize_tendermint_abci_ResponseFlush,
    responseDeserialize: deserialize_tendermint_abci_ResponseFlush,
  },
  info: {
    path: '/tendermint.abci.ABCI/Info',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestInfo,
    responseType: tendermint_abci_types_pb.ResponseInfo,
    requestSerialize: serialize_tendermint_abci_RequestInfo,
    requestDeserialize: deserialize_tendermint_abci_RequestInfo,
    responseSerialize: serialize_tendermint_abci_ResponseInfo,
    responseDeserialize: deserialize_tendermint_abci_ResponseInfo,
  },
  checkTx: {
    path: '/tendermint.abci.ABCI/CheckTx',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestCheckTx,
    responseType: tendermint_abci_types_pb.ResponseCheckTx,
    requestSerialize: serialize_tendermint_abci_RequestCheckTx,
    requestDeserialize: deserialize_tendermint_abci_RequestCheckTx,
    responseSerialize: serialize_tendermint_abci_ResponseCheckTx,
    responseDeserialize: deserialize_tendermint_abci_ResponseCheckTx,
  },
  query: {
    path: '/tendermint.abci.ABCI/Query',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestQuery,
    responseType: tendermint_abci_types_pb.ResponseQuery,
    requestSerialize: serialize_tendermint_abci_RequestQuery,
    requestDeserialize: deserialize_tendermint_abci_RequestQuery,
    responseSerialize: serialize_tendermint_abci_ResponseQuery,
    responseDeserialize: deserialize_tendermint_abci_ResponseQuery,
  },
  commit: {
    path: '/tendermint.abci.ABCI/Commit',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestCommit,
    responseType: tendermint_abci_types_pb.ResponseCommit,
    requestSerialize: serialize_tendermint_abci_RequestCommit,
    requestDeserialize: deserialize_tendermint_abci_RequestCommit,
    responseSerialize: serialize_tendermint_abci_ResponseCommit,
    responseDeserialize: deserialize_tendermint_abci_ResponseCommit,
  },
  initChain: {
    path: '/tendermint.abci.ABCI/InitChain',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestInitChain,
    responseType: tendermint_abci_types_pb.ResponseInitChain,
    requestSerialize: serialize_tendermint_abci_RequestInitChain,
    requestDeserialize: deserialize_tendermint_abci_RequestInitChain,
    responseSerialize: serialize_tendermint_abci_ResponseInitChain,
    responseDeserialize: deserialize_tendermint_abci_ResponseInitChain,
  },
  listSnapshots: {
    path: '/tendermint.abci.ABCI/ListSnapshots',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestListSnapshots,
    responseType: tendermint_abci_types_pb.ResponseListSnapshots,
    requestSerialize: serialize_tendermint_abci_RequestListSnapshots,
    requestDeserialize: deserialize_tendermint_abci_RequestListSnapshots,
    responseSerialize: serialize_tendermint_abci_ResponseListSnapshots,
    responseDeserialize: deserialize_tendermint_abci_ResponseListSnapshots,
  },
  offerSnapshot: {
    path: '/tendermint.abci.ABCI/OfferSnapshot',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestOfferSnapshot,
    responseType: tendermint_abci_types_pb.ResponseOfferSnapshot,
    requestSerialize: serialize_tendermint_abci_RequestOfferSnapshot,
    requestDeserialize: deserialize_tendermint_abci_RequestOfferSnapshot,
    responseSerialize: serialize_tendermint_abci_ResponseOfferSnapshot,
    responseDeserialize: deserialize_tendermint_abci_ResponseOfferSnapshot,
  },
  loadSnapshotChunk: {
    path: '/tendermint.abci.ABCI/LoadSnapshotChunk',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestLoadSnapshotChunk,
    responseType: tendermint_abci_types_pb.ResponseLoadSnapshotChunk,
    requestSerialize: serialize_tendermint_abci_RequestLoadSnapshotChunk,
    requestDeserialize: deserialize_tendermint_abci_RequestLoadSnapshotChunk,
    responseSerialize: serialize_tendermint_abci_ResponseLoadSnapshotChunk,
    responseDeserialize: deserialize_tendermint_abci_ResponseLoadSnapshotChunk,
  },
  applySnapshotChunk: {
    path: '/tendermint.abci.ABCI/ApplySnapshotChunk',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestApplySnapshotChunk,
    responseType: tendermint_abci_types_pb.ResponseApplySnapshotChunk,
    requestSerialize: serialize_tendermint_abci_RequestApplySnapshotChunk,
    requestDeserialize: deserialize_tendermint_abci_RequestApplySnapshotChunk,
    responseSerialize: serialize_tendermint_abci_ResponseApplySnapshotChunk,
    responseDeserialize: deserialize_tendermint_abci_ResponseApplySnapshotChunk,
  },
  prepareProposal: {
    path: '/tendermint.abci.ABCI/PrepareProposal',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestPrepareProposal,
    responseType: tendermint_abci_types_pb.ResponsePrepareProposal,
    requestSerialize: serialize_tendermint_abci_RequestPrepareProposal,
    requestDeserialize: deserialize_tendermint_abci_RequestPrepareProposal,
    responseSerialize: serialize_tendermint_abci_ResponsePrepareProposal,
    responseDeserialize: deserialize_tendermint_abci_ResponsePrepareProposal,
  },
  processProposal: {
    path: '/tendermint.abci.ABCI/ProcessProposal',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestProcessProposal,
    responseType: tendermint_abci_types_pb.ResponseProcessProposal,
    requestSerialize: serialize_tendermint_abci_RequestProcessProposal,
    requestDeserialize: deserialize_tendermint_abci_RequestProcessProposal,
    responseSerialize: serialize_tendermint_abci_ResponseProcessProposal,
    responseDeserialize: deserialize_tendermint_abci_ResponseProcessProposal,
  },
  extendVote: {
    path: '/tendermint.abci.ABCI/ExtendVote',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestExtendVote,
    responseType: tendermint_abci_types_pb.ResponseExtendVote,
    requestSerialize: serialize_tendermint_abci_RequestExtendVote,
    requestDeserialize: deserialize_tendermint_abci_RequestExtendVote,
    responseSerialize: serialize_tendermint_abci_ResponseExtendVote,
    responseDeserialize: deserialize_tendermint_abci_ResponseExtendVote,
  },
  verifyVoteExtension: {
    path: '/tendermint.abci.ABCI/VerifyVoteExtension',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestVerifyVoteExtension,
    responseType: tendermint_abci_types_pb.ResponseVerifyVoteExtension,
    requestSerialize: serialize_tendermint_abci_RequestVerifyVoteExtension,
    requestDeserialize: deserialize_tendermint_abci_RequestVerifyVoteExtension,
    responseSerialize: serialize_tendermint_abci_ResponseVerifyVoteExtension,
    responseDeserialize: deserialize_tendermint_abci_ResponseVerifyVoteExtension,
  },
  finalizeBlock: {
    path: '/tendermint.abci.ABCI/FinalizeBlock',
    requestStream: false,
    responseStream: false,
    requestType: tendermint_abci_types_pb.RequestFinalizeBlock,
    responseType: tendermint_abci_types_pb.ResponseFinalizeBlock,
    requestSerialize: serialize_tendermint_abci_RequestFinalizeBlock,
    requestDeserialize: deserialize_tendermint_abci_RequestFinalizeBlock,
    responseSerialize: serialize_tendermint_abci_ResponseFinalizeBlock,
    responseDeserialize: deserialize_tendermint_abci_ResponseFinalizeBlock,
  },
};

exports.ABCIClient = grpc.makeGenericClientConstructor(ABCIService);
