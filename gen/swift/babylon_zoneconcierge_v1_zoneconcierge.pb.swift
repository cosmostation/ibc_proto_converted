// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/zoneconcierge/v1/zoneconcierge.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// IndexedHeader is the metadata of a CZ header
struct Babylon_Zoneconcierge_V1_IndexedHeader {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// chain_id is the unique ID of the chain
  var chainID: String = String()

  /// hash is the hash of this header
  var hash: Data = Data()

  /// height is the height of this header on CZ ledger
  /// (hash, height) jointly provides the position of the header on CZ ledger
  var height: UInt64 = 0

  /// time is the timestamp of this header on CZ ledger
  /// it is needed for CZ to unbond all mature validators/delegations
  /// before this timestamp when this header is BTC-finalised
  var time: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _time ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_time = newValue}
  }
  /// Returns true if `time` has been explicitly set.
  var hasTime: Bool {return self._time != nil}
  /// Clears the value of `time`. Subsequent reads from it will return its default value.
  mutating func clearTime() {self._time = nil}

  /// babylon_header_hash is the hash of the babylon block that includes this CZ
  /// header
  var babylonHeaderHash: Data = Data()

  /// babylon_header_height is the height of the babylon block that includes this CZ
  /// header
  var babylonHeaderHeight: UInt64 = 0

  /// epoch is the epoch number of this header on Babylon ledger
  var babylonEpoch: UInt64 = 0

  /// babylon_tx_hash is the hash of the tx that includes this header
  /// (babylon_block_height, babylon_tx_hash) jointly provides the position of
  /// the header on Babylon ledger
  var babylonTxHash: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _time: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

/// Forks is a list of non-canonical `IndexedHeader`s at the same height.
/// For example, assuming the following blockchain
/// ```
/// A <- B <- C <- D <- E
///            \ -- D1
///            \ -- D2
/// ```
/// Then the fork will be {[D1, D2]} where each item is in struct `IndexedBlock`.
///
/// Note that each `IndexedHeader` in the fork should have a valid quorum
/// certificate. Such forks exist since Babylon considers CZs might have
/// dishonest majority. Also note that the IBC-Go implementation will only
/// consider the first header in a fork valid, since the subsequent headers
/// cannot be verified without knowing the validator set in the previous header.
struct Babylon_Zoneconcierge_V1_Forks {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// blocks is the list of non-canonical indexed headers at the same height
  var headers: [Babylon_Zoneconcierge_V1_IndexedHeader] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ChainInfo is the information of a CZ
struct Babylon_Zoneconcierge_V1_ChainInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// chain_id is the ID of the chain
  var chainID: String = String()

  /// latest_header is the latest header in CZ's canonical chain
  var latestHeader: Babylon_Zoneconcierge_V1_IndexedHeader {
    get {return _latestHeader ?? Babylon_Zoneconcierge_V1_IndexedHeader()}
    set {_latestHeader = newValue}
  }
  /// Returns true if `latestHeader` has been explicitly set.
  var hasLatestHeader: Bool {return self._latestHeader != nil}
  /// Clears the value of `latestHeader`. Subsequent reads from it will return its default value.
  mutating func clearLatestHeader() {self._latestHeader = nil}

  /// latest_forks is the latest forks, formed as a series of IndexedHeader (from
  /// low to high)
  var latestForks: Babylon_Zoneconcierge_V1_Forks {
    get {return _latestForks ?? Babylon_Zoneconcierge_V1_Forks()}
    set {_latestForks = newValue}
  }
  /// Returns true if `latestForks` has been explicitly set.
  var hasLatestForks: Bool {return self._latestForks != nil}
  /// Clears the value of `latestForks`. Subsequent reads from it will return its default value.
  mutating func clearLatestForks() {self._latestForks = nil}

  /// timestamped_headers_count is the number of timestamped headers in CZ's
  /// canonical chain
  var timestampedHeadersCount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _latestHeader: Babylon_Zoneconcierge_V1_IndexedHeader? = nil
  fileprivate var _latestForks: Babylon_Zoneconcierge_V1_Forks? = nil
}

/// ChainInfoWithProof is the chain info with a proof that the latest header in
/// the chain info is included in the epoch
struct Babylon_Zoneconcierge_V1_ChainInfoWithProof {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainInfo: Babylon_Zoneconcierge_V1_ChainInfo {
    get {return _chainInfo ?? Babylon_Zoneconcierge_V1_ChainInfo()}
    set {_chainInfo = newValue}
  }
  /// Returns true if `chainInfo` has been explicitly set.
  var hasChainInfo: Bool {return self._chainInfo != nil}
  /// Clears the value of `chainInfo`. Subsequent reads from it will return its default value.
  mutating func clearChainInfo() {self._chainInfo = nil}

  /// proof_header_in_epoch is an inclusion proof that the latest_header in chain_info
  /// is committed  to `app_hash` of the sealer header of latest_header.babylon_epoch
  /// this field is optional
  var proofHeaderInEpoch: Tendermint_Crypto_ProofOps {
    get {return _proofHeaderInEpoch ?? Tendermint_Crypto_ProofOps()}
    set {_proofHeaderInEpoch = newValue}
  }
  /// Returns true if `proofHeaderInEpoch` has been explicitly set.
  var hasProofHeaderInEpoch: Bool {return self._proofHeaderInEpoch != nil}
  /// Clears the value of `proofHeaderInEpoch`. Subsequent reads from it will return its default value.
  mutating func clearProofHeaderInEpoch() {self._proofHeaderInEpoch = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _chainInfo: Babylon_Zoneconcierge_V1_ChainInfo? = nil
  fileprivate var _proofHeaderInEpoch: Tendermint_Crypto_ProofOps? = nil
}

/// FinalizedChainInfo is the information of a CZ that is BTC-finalised
struct Babylon_Zoneconcierge_V1_FinalizedChainInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// chain_id is the ID of the chain
  var chainID: String {
    get {return _storage._chainID}
    set {_uniqueStorage()._chainID = newValue}
  }

  /// finalized_chain_info is the info of the CZ
  var finalizedChainInfo: Babylon_Zoneconcierge_V1_ChainInfo {
    get {return _storage._finalizedChainInfo ?? Babylon_Zoneconcierge_V1_ChainInfo()}
    set {_uniqueStorage()._finalizedChainInfo = newValue}
  }
  /// Returns true if `finalizedChainInfo` has been explicitly set.
  var hasFinalizedChainInfo: Bool {return _storage._finalizedChainInfo != nil}
  /// Clears the value of `finalizedChainInfo`. Subsequent reads from it will return its default value.
  mutating func clearFinalizedChainInfo() {_uniqueStorage()._finalizedChainInfo = nil}

  /// epoch_info is the metadata of the last BTC-finalised epoch
  var epochInfo: Babylon_Epoching_V1_Epoch {
    get {return _storage._epochInfo ?? Babylon_Epoching_V1_Epoch()}
    set {_uniqueStorage()._epochInfo = newValue}
  }
  /// Returns true if `epochInfo` has been explicitly set.
  var hasEpochInfo: Bool {return _storage._epochInfo != nil}
  /// Clears the value of `epochInfo`. Subsequent reads from it will return its default value.
  mutating func clearEpochInfo() {_uniqueStorage()._epochInfo = nil}

  /// raw_checkpoint is the raw checkpoint of this epoch
  var rawCheckpoint: Babylon_Checkpointing_V1_RawCheckpoint {
    get {return _storage._rawCheckpoint ?? Babylon_Checkpointing_V1_RawCheckpoint()}
    set {_uniqueStorage()._rawCheckpoint = newValue}
  }
  /// Returns true if `rawCheckpoint` has been explicitly set.
  var hasRawCheckpoint: Bool {return _storage._rawCheckpoint != nil}
  /// Clears the value of `rawCheckpoint`. Subsequent reads from it will return its default value.
  mutating func clearRawCheckpoint() {_uniqueStorage()._rawCheckpoint = nil}

  /// btc_submission_key is position of two BTC txs that include the raw
  /// checkpoint of this epoch
  var btcSubmissionKey: Babylon_Btccheckpoint_V1_SubmissionKey {
    get {return _storage._btcSubmissionKey ?? Babylon_Btccheckpoint_V1_SubmissionKey()}
    set {_uniqueStorage()._btcSubmissionKey = newValue}
  }
  /// Returns true if `btcSubmissionKey` has been explicitly set.
  var hasBtcSubmissionKey: Bool {return _storage._btcSubmissionKey != nil}
  /// Clears the value of `btcSubmissionKey`. Subsequent reads from it will return its default value.
  mutating func clearBtcSubmissionKey() {_uniqueStorage()._btcSubmissionKey = nil}

  /// proof is the proof that the chain info is finalized
  var proof: Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo {
    get {return _storage._proof ?? Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo()}
    set {_uniqueStorage()._proof = newValue}
  }
  /// Returns true if `proof` has been explicitly set.
  var hasProof: Bool {return _storage._proof != nil}
  /// Clears the value of `proof`. Subsequent reads from it will return its default value.
  mutating func clearProof() {_uniqueStorage()._proof = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// ProofEpochSealed is the proof that an epoch is sealed by the sealer header,
/// i.e., the 2nd header of the next epoch With the access of metadata
/// - Metadata of this epoch, which includes the sealer header
/// - Raw checkpoint of this epoch
/// The verifier can perform the following verification rules:
/// - The raw checkpoint's `app_hash` is same as in the sealer header
/// - More than 2/3 (in voting power) validators in the validator set of this
/// epoch have signed `app_hash` of the sealer header
/// - The epoch metadata is committed to the `app_hash` of the sealer header
/// - The validator set is committed to the `app_hash` of the sealer header
struct Babylon_Zoneconcierge_V1_ProofEpochSealed {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_set is the validator set of the sealed epoch
  /// This validator set has generated a BLS multisig on `app_hash` of
  /// the sealer header
  var validatorSet: [Babylon_Checkpointing_V1_ValidatorWithBlsKey] = []

  /// proof_epoch_info is the Merkle proof that the epoch's metadata is committed
  /// to `app_hash` of the sealer header
  var proofEpochInfo: Tendermint_Crypto_ProofOps {
    get {return _proofEpochInfo ?? Tendermint_Crypto_ProofOps()}
    set {_proofEpochInfo = newValue}
  }
  /// Returns true if `proofEpochInfo` has been explicitly set.
  var hasProofEpochInfo: Bool {return self._proofEpochInfo != nil}
  /// Clears the value of `proofEpochInfo`. Subsequent reads from it will return its default value.
  mutating func clearProofEpochInfo() {self._proofEpochInfo = nil}

  /// proof_epoch_info is the Merkle proof that the epoch's validator set is
  /// committed to `app_hash` of the sealer header
  var proofEpochValSet: Tendermint_Crypto_ProofOps {
    get {return _proofEpochValSet ?? Tendermint_Crypto_ProofOps()}
    set {_proofEpochValSet = newValue}
  }
  /// Returns true if `proofEpochValSet` has been explicitly set.
  var hasProofEpochValSet: Bool {return self._proofEpochValSet != nil}
  /// Clears the value of `proofEpochValSet`. Subsequent reads from it will return its default value.
  mutating func clearProofEpochValSet() {self._proofEpochValSet = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _proofEpochInfo: Tendermint_Crypto_ProofOps? = nil
  fileprivate var _proofEpochValSet: Tendermint_Crypto_ProofOps? = nil
}

/// ProofFinalizedChainInfo is a set of proofs that attest a chain info is
/// BTC-finalised
struct Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// proof_cz_header_in_epoch is the proof that the CZ header is timestamped
  /// within a certain epoch
  var proofCzHeaderInEpoch: Tendermint_Crypto_ProofOps {
    get {return _proofCzHeaderInEpoch ?? Tendermint_Crypto_ProofOps()}
    set {_proofCzHeaderInEpoch = newValue}
  }
  /// Returns true if `proofCzHeaderInEpoch` has been explicitly set.
  var hasProofCzHeaderInEpoch: Bool {return self._proofCzHeaderInEpoch != nil}
  /// Clears the value of `proofCzHeaderInEpoch`. Subsequent reads from it will return its default value.
  mutating func clearProofCzHeaderInEpoch() {self._proofCzHeaderInEpoch = nil}

  /// proof_epoch_sealed is the proof that the epoch is sealed
  var proofEpochSealed: Babylon_Zoneconcierge_V1_ProofEpochSealed {
    get {return _proofEpochSealed ?? Babylon_Zoneconcierge_V1_ProofEpochSealed()}
    set {_proofEpochSealed = newValue}
  }
  /// Returns true if `proofEpochSealed` has been explicitly set.
  var hasProofEpochSealed: Bool {return self._proofEpochSealed != nil}
  /// Clears the value of `proofEpochSealed`. Subsequent reads from it will return its default value.
  mutating func clearProofEpochSealed() {self._proofEpochSealed = nil}

  /// proof_epoch_submitted is the proof that the epoch's checkpoint is included
  /// in BTC ledger It is the two TransactionInfo in the best (i.e., earliest)
  /// checkpoint submission
  var proofEpochSubmitted: [Babylon_Btccheckpoint_V1_TransactionInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _proofCzHeaderInEpoch: Tendermint_Crypto_ProofOps? = nil
  fileprivate var _proofEpochSealed: Babylon_Zoneconcierge_V1_ProofEpochSealed? = nil
}

/// Btc light client chain segment grown during last finalized epoch
struct Babylon_Zoneconcierge_V1_BTCChainSegment {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var btcHeaders: [Babylon_Btclightclient_V1_BTCHeaderInfo] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Zoneconcierge_V1_IndexedHeader: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_Forks: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_ChainInfo: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_ChainInfoWithProof: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_FinalizedChainInfo: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_ProofEpochSealed: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo: @unchecked Sendable {}
extension Babylon_Zoneconcierge_V1_BTCChainSegment: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.zoneconcierge.v1"

extension Babylon_Zoneconcierge_V1_IndexedHeader: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".IndexedHeader"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .same(proto: "hash"),
    3: .same(proto: "height"),
    4: .same(proto: "time"),
    5: .standard(proto: "babylon_header_hash"),
    6: .standard(proto: "babylon_header_height"),
    7: .standard(proto: "babylon_epoch"),
    8: .standard(proto: "babylon_tx_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._time) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.babylonHeaderHash) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.babylonHeaderHeight) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.babylonEpoch) }()
      case 8: try { try decoder.decodeSingularBytesField(value: &self.babylonTxHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 1)
    }
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 2)
    }
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 3)
    }
    try { if let v = self._time {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.babylonHeaderHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.babylonHeaderHash, fieldNumber: 5)
    }
    if self.babylonHeaderHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.babylonHeaderHeight, fieldNumber: 6)
    }
    if self.babylonEpoch != 0 {
      try visitor.visitSingularUInt64Field(value: self.babylonEpoch, fieldNumber: 7)
    }
    if !self.babylonTxHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.babylonTxHash, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_IndexedHeader, rhs: Babylon_Zoneconcierge_V1_IndexedHeader) -> Bool {
    if lhs.chainID != rhs.chainID {return false}
    if lhs.hash != rhs.hash {return false}
    if lhs.height != rhs.height {return false}
    if lhs._time != rhs._time {return false}
    if lhs.babylonHeaderHash != rhs.babylonHeaderHash {return false}
    if lhs.babylonHeaderHeight != rhs.babylonHeaderHeight {return false}
    if lhs.babylonEpoch != rhs.babylonEpoch {return false}
    if lhs.babylonTxHash != rhs.babylonTxHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_Forks: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Forks"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    3: .same(proto: "headers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.headers) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.headers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.headers, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_Forks, rhs: Babylon_Zoneconcierge_V1_Forks) -> Bool {
    if lhs.headers != rhs.headers {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_ChainInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ChainInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .standard(proto: "latest_header"),
    3: .standard(proto: "latest_forks"),
    4: .standard(proto: "timestamped_headers_count"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._latestHeader) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._latestForks) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.timestampedHeadersCount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 1)
    }
    try { if let v = self._latestHeader {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._latestForks {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.timestampedHeadersCount != 0 {
      try visitor.visitSingularUInt64Field(value: self.timestampedHeadersCount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_ChainInfo, rhs: Babylon_Zoneconcierge_V1_ChainInfo) -> Bool {
    if lhs.chainID != rhs.chainID {return false}
    if lhs._latestHeader != rhs._latestHeader {return false}
    if lhs._latestForks != rhs._latestForks {return false}
    if lhs.timestampedHeadersCount != rhs.timestampedHeadersCount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_ChainInfoWithProof: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ChainInfoWithProof"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_info"),
    2: .standard(proto: "proof_header_in_epoch"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._chainInfo) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._proofHeaderInEpoch) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._chainInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._proofHeaderInEpoch {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_ChainInfoWithProof, rhs: Babylon_Zoneconcierge_V1_ChainInfoWithProof) -> Bool {
    if lhs._chainInfo != rhs._chainInfo {return false}
    if lhs._proofHeaderInEpoch != rhs._proofHeaderInEpoch {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_FinalizedChainInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FinalizedChainInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .standard(proto: "finalized_chain_info"),
    3: .standard(proto: "epoch_info"),
    4: .standard(proto: "raw_checkpoint"),
    5: .standard(proto: "btc_submission_key"),
    6: .same(proto: "proof"),
  ]

  fileprivate class _StorageClass {
    var _chainID: String = String()
    var _finalizedChainInfo: Babylon_Zoneconcierge_V1_ChainInfo? = nil
    var _epochInfo: Babylon_Epoching_V1_Epoch? = nil
    var _rawCheckpoint: Babylon_Checkpointing_V1_RawCheckpoint? = nil
    var _btcSubmissionKey: Babylon_Btccheckpoint_V1_SubmissionKey? = nil
    var _proof: Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _chainID = source._chainID
      _finalizedChainInfo = source._finalizedChainInfo
      _epochInfo = source._epochInfo
      _rawCheckpoint = source._rawCheckpoint
      _btcSubmissionKey = source._btcSubmissionKey
      _proof = source._proof
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._chainID) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._finalizedChainInfo) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._epochInfo) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._rawCheckpoint) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._btcSubmissionKey) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._proof) }()
        default: break
        }
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      if !_storage._chainID.isEmpty {
        try visitor.visitSingularStringField(value: _storage._chainID, fieldNumber: 1)
      }
      try { if let v = _storage._finalizedChainInfo {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._epochInfo {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._rawCheckpoint {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._btcSubmissionKey {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._proof {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_FinalizedChainInfo, rhs: Babylon_Zoneconcierge_V1_FinalizedChainInfo) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._chainID != rhs_storage._chainID {return false}
        if _storage._finalizedChainInfo != rhs_storage._finalizedChainInfo {return false}
        if _storage._epochInfo != rhs_storage._epochInfo {return false}
        if _storage._rawCheckpoint != rhs_storage._rawCheckpoint {return false}
        if _storage._btcSubmissionKey != rhs_storage._btcSubmissionKey {return false}
        if _storage._proof != rhs_storage._proof {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_ProofEpochSealed: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ProofEpochSealed"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_set"),
    2: .standard(proto: "proof_epoch_info"),
    3: .standard(proto: "proof_epoch_val_set"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.validatorSet) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._proofEpochInfo) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._proofEpochValSet) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.validatorSet.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.validatorSet, fieldNumber: 1)
    }
    try { if let v = self._proofEpochInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._proofEpochValSet {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_ProofEpochSealed, rhs: Babylon_Zoneconcierge_V1_ProofEpochSealed) -> Bool {
    if lhs.validatorSet != rhs.validatorSet {return false}
    if lhs._proofEpochInfo != rhs._proofEpochInfo {return false}
    if lhs._proofEpochValSet != rhs._proofEpochValSet {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ProofFinalizedChainInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "proof_cz_header_in_epoch"),
    2: .standard(proto: "proof_epoch_sealed"),
    3: .standard(proto: "proof_epoch_submitted"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._proofCzHeaderInEpoch) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._proofEpochSealed) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.proofEpochSubmitted) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._proofCzHeaderInEpoch {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._proofEpochSealed {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.proofEpochSubmitted.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.proofEpochSubmitted, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo, rhs: Babylon_Zoneconcierge_V1_ProofFinalizedChainInfo) -> Bool {
    if lhs._proofCzHeaderInEpoch != rhs._proofCzHeaderInEpoch {return false}
    if lhs._proofEpochSealed != rhs._proofEpochSealed {return false}
    if lhs.proofEpochSubmitted != rhs.proofEpochSubmitted {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Zoneconcierge_V1_BTCChainSegment: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BTCChainSegment"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "btc_headers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.btcHeaders) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.btcHeaders.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.btcHeaders, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Zoneconcierge_V1_BTCChainSegment, rhs: Babylon_Zoneconcierge_V1_BTCChainSegment) -> Bool {
    if lhs.btcHeaders != rhs.btcHeaders {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}