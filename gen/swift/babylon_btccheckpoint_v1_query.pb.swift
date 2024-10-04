// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: babylon/btccheckpoint/v1/query.proto
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

/// QueryParamsRequest is request type for the Query/Params RPC method.
struct Babylon_Btccheckpoint_V1_QueryParamsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryParamsResponse is response type for the Query/Params RPC method.
struct Babylon_Btccheckpoint_V1_QueryParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params holds all the parameters of this module.
  var params: Babylon_Btccheckpoint_V1_Params {
    get {return _params ?? Babylon_Btccheckpoint_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Babylon_Btccheckpoint_V1_Params? = nil
}

/// QueryBtcCheckpointInfoRequest defines the query to get the best checkpoint
/// for a given epoch
struct Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Number of epoch for which the earliest checkpointing btc height is
  /// requested
  var epochNum: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryBtcCheckpointInfoResponse is response type for the
/// Query/BtcCheckpointInfo RPC method
struct Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var info: Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse {
    get {return _info ?? Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse()}
    set {_info = newValue}
  }
  /// Returns true if `info` has been explicitly set.
  var hasInfo: Bool {return self._info != nil}
  /// Clears the value of `info`. Subsequent reads from it will return its default value.
  mutating func clearInfo() {self._info = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _info: Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse? = nil
}

/// QueryBtcCheckpointsInfoRequest is request type for the
/// Query/BtcCheckpointsInfo RPC method
struct Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// pagination defines whether to have the pagination in the request
  var pagination: Cosmos_Base_Query_V1beta1_PageRequest {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageRequest()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageRequest? = nil
}

/// QueryBtcCheckpointsInfoResponse is response type for the
/// Query/BtcCheckpointsInfo RPC method
struct Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var infoList: [Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse] = []

  /// pagination defines the pagination in the response
  var pagination: Cosmos_Base_Query_V1beta1_PageResponse {
    get {return _pagination ?? Cosmos_Base_Query_V1beta1_PageResponse()}
    set {_pagination = newValue}
  }
  /// Returns true if `pagination` has been explicitly set.
  var hasPagination: Bool {return self._pagination != nil}
  /// Clears the value of `pagination`. Subsequent reads from it will return its default value.
  mutating func clearPagination() {self._pagination = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _pagination: Cosmos_Base_Query_V1beta1_PageResponse? = nil
}

/// QueryEpochSubmissionsRequest defines a request to get all submissions in
/// given epoch
struct Babylon_Btccheckpoint_V1_QueryEpochSubmissionsRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Number of epoch for which submissions are requested
  var epochNum: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryEpochSubmissionsResponse defines a response to get all submissions in
/// given epoch (QueryEpochSubmissionsRequest)
struct Babylon_Btccheckpoint_V1_QueryEpochSubmissionsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Keys All submissions transactions key saved during an epoch.
  var keys: [Babylon_Btccheckpoint_V1_SubmissionKeyResponse] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BTCCheckpointInfoResponse contains all data about best submission of checkpoint for
/// given epoch. Best submission is the submission which is deeper in btc ledger.
struct Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// EpochNumber of this checkpoint.
  var epochNumber: UInt64 = 0

  /// btc height of the best submission of the epoch
  var bestSubmissionBtcBlockHeight: UInt64 = 0

  /// hash of the btc block which determines checkpoint btc block height i.e.
  /// youngest block of best submission Hexadecimal
  var bestSubmissionBtcBlockHash: String = String()

  /// the BTC checkpoint transactions of the best submission
  var bestSubmissionTransactions: [Babylon_Btccheckpoint_V1_TransactionInfoResponse] = []

  /// list of vigilantes' addresses of the best submission
  var bestSubmissionVigilanteAddressList: [Babylon_Btccheckpoint_V1_CheckpointAddressesResponse] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// TransactionInfoResponse is the info of a tx on Bitcoin,
/// including
/// - the position of the tx on BTC blockchain
/// - the full tx content
/// - the Merkle proof that this tx is on the above position
struct Babylon_Btccheckpoint_V1_TransactionInfoResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Index Bitcoin Transaction index in block.
  var index: UInt32 = 0

  /// Hash BTC Header hash as hex.
  var hash: String = String()

  /// transaction is the full transaction data as str hex.
  var transaction: String = String()

  /// proof is the Merkle proof that this tx is included in the position in `key`
  var proof: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// CheckpointAddressesResponse contains the addresses of the submitter and reporter of a
/// given checkpoint
struct Babylon_Btccheckpoint_V1_CheckpointAddressesResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// submitter is the address of the checkpoint submitter to BTC, extracted from
  /// the checkpoint itself.
  var submitter: String = String()

  /// reporter is the address of the reporter who reported the submissions,
  /// calculated from submission message MsgInsertBTCSpvProof itself
  var reporter: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SubmissionKeyResponse Checkpoint can be composed from multiple transactions,
/// so to identify whole submission we need list of transaction keys.
/// Each submission can generally be identified by this list of (txIdx,
/// blockHash) tuples. Note: this could possibly be optimized as if transactions
/// were in one block they would have the same block hash and different indexes,
/// but each blockhash is only 33 (1  byte for prefix encoding and 32 byte hash),
/// so there should be other strong arguments for this optimization
struct Babylon_Btccheckpoint_V1_SubmissionKeyResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// FirstTxBlockHash is the BTCHeaderHashBytes in hex.
  var firstTxBlockHash: String = String()

  var firstTxIndex: UInt32 = 0

  /// SecondBlockHash is the BTCHeaderHashBytes in hex.
  var secondTxBlockHash: String = String()

  var secondTxIndex: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Babylon_Btccheckpoint_V1_QueryParamsRequest: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryParamsResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoRequest: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoRequest: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryEpochSubmissionsRequest: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_QueryEpochSubmissionsResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_TransactionInfoResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_CheckpointAddressesResponse: @unchecked Sendable {}
extension Babylon_Btccheckpoint_V1_SubmissionKeyResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "babylon.btccheckpoint.v1"

extension Babylon_Btccheckpoint_V1_QueryParamsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryParamsRequest, rhs: Babylon_Btccheckpoint_V1_QueryParamsRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryParamsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryParamsResponse, rhs: Babylon_Btccheckpoint_V1_QueryParamsResponse) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryBtcCheckpointInfoRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_num"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.epochNum) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.epochNum != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNum, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoRequest, rhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoRequest) -> Bool {
    if lhs.epochNum != rhs.epochNum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryBtcCheckpointInfoResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._info) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._info {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoResponse, rhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointInfoResponse) -> Bool {
    if lhs._info != rhs._info {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryBtcCheckpointsInfoRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoRequest, rhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoRequest) -> Bool {
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryBtcCheckpointsInfoResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "info_list"),
    2: .same(proto: "pagination"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.infoList) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._pagination) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.infoList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.infoList, fieldNumber: 1)
    }
    try { if let v = self._pagination {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoResponse, rhs: Babylon_Btccheckpoint_V1_QueryBtcCheckpointsInfoResponse) -> Bool {
    if lhs.infoList != rhs.infoList {return false}
    if lhs._pagination != rhs._pagination {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryEpochSubmissionsRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryEpochSubmissionsRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_num"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.epochNum) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.epochNum != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNum, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryEpochSubmissionsRequest, rhs: Babylon_Btccheckpoint_V1_QueryEpochSubmissionsRequest) -> Bool {
    if lhs.epochNum != rhs.epochNum {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_QueryEpochSubmissionsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryEpochSubmissionsResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "keys"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.keys) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.keys.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.keys, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_QueryEpochSubmissionsResponse, rhs: Babylon_Btccheckpoint_V1_QueryEpochSubmissionsResponse) -> Bool {
    if lhs.keys != rhs.keys {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BTCCheckpointInfoResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "epoch_number"),
    2: .standard(proto: "best_submission_btc_block_height"),
    3: .standard(proto: "best_submission_btc_block_hash"),
    4: .standard(proto: "best_submission_transactions"),
    5: .standard(proto: "best_submission_vigilante_address_list"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.epochNumber) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.bestSubmissionBtcBlockHeight) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.bestSubmissionBtcBlockHash) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.bestSubmissionTransactions) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.bestSubmissionVigilanteAddressList) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.epochNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNumber, fieldNumber: 1)
    }
    if self.bestSubmissionBtcBlockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.bestSubmissionBtcBlockHeight, fieldNumber: 2)
    }
    if !self.bestSubmissionBtcBlockHash.isEmpty {
      try visitor.visitSingularStringField(value: self.bestSubmissionBtcBlockHash, fieldNumber: 3)
    }
    if !self.bestSubmissionTransactions.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bestSubmissionTransactions, fieldNumber: 4)
    }
    if !self.bestSubmissionVigilanteAddressList.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bestSubmissionVigilanteAddressList, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse, rhs: Babylon_Btccheckpoint_V1_BTCCheckpointInfoResponse) -> Bool {
    if lhs.epochNumber != rhs.epochNumber {return false}
    if lhs.bestSubmissionBtcBlockHeight != rhs.bestSubmissionBtcBlockHeight {return false}
    if lhs.bestSubmissionBtcBlockHash != rhs.bestSubmissionBtcBlockHash {return false}
    if lhs.bestSubmissionTransactions != rhs.bestSubmissionTransactions {return false}
    if lhs.bestSubmissionVigilanteAddressList != rhs.bestSubmissionVigilanteAddressList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_TransactionInfoResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TransactionInfoResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "hash"),
    3: .same(proto: "transaction"),
    4: .same(proto: "proof"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.hash) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.transaction) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.proof) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 1)
    }
    if !self.hash.isEmpty {
      try visitor.visitSingularStringField(value: self.hash, fieldNumber: 2)
    }
    if !self.transaction.isEmpty {
      try visitor.visitSingularStringField(value: self.transaction, fieldNumber: 3)
    }
    if !self.proof.isEmpty {
      try visitor.visitSingularStringField(value: self.proof, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_TransactionInfoResponse, rhs: Babylon_Btccheckpoint_V1_TransactionInfoResponse) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.hash != rhs.hash {return false}
    if lhs.transaction != rhs.transaction {return false}
    if lhs.proof != rhs.proof {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_CheckpointAddressesResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CheckpointAddressesResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "submitter"),
    2: .same(proto: "reporter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.submitter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.reporter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.submitter.isEmpty {
      try visitor.visitSingularStringField(value: self.submitter, fieldNumber: 1)
    }
    if !self.reporter.isEmpty {
      try visitor.visitSingularStringField(value: self.reporter, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_CheckpointAddressesResponse, rhs: Babylon_Btccheckpoint_V1_CheckpointAddressesResponse) -> Bool {
    if lhs.submitter != rhs.submitter {return false}
    if lhs.reporter != rhs.reporter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Babylon_Btccheckpoint_V1_SubmissionKeyResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SubmissionKeyResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "first_tx_block_hash"),
    2: .standard(proto: "first_tx_index"),
    3: .standard(proto: "second_tx_block_hash"),
    4: .standard(proto: "second_tx_index"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.firstTxBlockHash) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.firstTxIndex) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.secondTxBlockHash) }()
      case 4: try { try decoder.decodeSingularUInt32Field(value: &self.secondTxIndex) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.firstTxBlockHash.isEmpty {
      try visitor.visitSingularStringField(value: self.firstTxBlockHash, fieldNumber: 1)
    }
    if self.firstTxIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.firstTxIndex, fieldNumber: 2)
    }
    if !self.secondTxBlockHash.isEmpty {
      try visitor.visitSingularStringField(value: self.secondTxBlockHash, fieldNumber: 3)
    }
    if self.secondTxIndex != 0 {
      try visitor.visitSingularUInt32Field(value: self.secondTxIndex, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Babylon_Btccheckpoint_V1_SubmissionKeyResponse, rhs: Babylon_Btccheckpoint_V1_SubmissionKeyResponse) -> Bool {
    if lhs.firstTxBlockHash != rhs.firstTxBlockHash {return false}
    if lhs.firstTxIndex != rhs.firstTxIndex {return false}
    if lhs.secondTxBlockHash != rhs.secondTxBlockHash {return false}
    if lhs.secondTxIndex != rhs.secondTxIndex {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}