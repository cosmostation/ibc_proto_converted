// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: injective/peggy/v1/genesis.proto
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

/// GenesisState struct
struct Injective_Peggy_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Injective_Peggy_V1_Params {
    get {return _storage._params ?? Injective_Peggy_V1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var lastObservedNonce: UInt64 {
    get {return _storage._lastObservedNonce}
    set {_uniqueStorage()._lastObservedNonce = newValue}
  }

  var valsets: [Injective_Peggy_V1_Valset] {
    get {return _storage._valsets}
    set {_uniqueStorage()._valsets = newValue}
  }

  var valsetConfirms: [Injective_Peggy_V1_MsgValsetConfirm] {
    get {return _storage._valsetConfirms}
    set {_uniqueStorage()._valsetConfirms = newValue}
  }

  var batches: [Injective_Peggy_V1_OutgoingTxBatch] {
    get {return _storage._batches}
    set {_uniqueStorage()._batches = newValue}
  }

  var batchConfirms: [Injective_Peggy_V1_MsgConfirmBatch] {
    get {return _storage._batchConfirms}
    set {_uniqueStorage()._batchConfirms = newValue}
  }

  var attestations: [Injective_Peggy_V1_Attestation] {
    get {return _storage._attestations}
    set {_uniqueStorage()._attestations = newValue}
  }

  var orchestratorAddresses: [Injective_Peggy_V1_MsgSetOrchestratorAddresses] {
    get {return _storage._orchestratorAddresses}
    set {_uniqueStorage()._orchestratorAddresses = newValue}
  }

  var erc20ToDenoms: [Injective_Peggy_V1_ERC20ToDenom] {
    get {return _storage._erc20ToDenoms}
    set {_uniqueStorage()._erc20ToDenoms = newValue}
  }

  var unbatchedTransfers: [Injective_Peggy_V1_OutgoingTransferTx] {
    get {return _storage._unbatchedTransfers}
    set {_uniqueStorage()._unbatchedTransfers = newValue}
  }

  var lastObservedEthereumHeight: UInt64 {
    get {return _storage._lastObservedEthereumHeight}
    set {_uniqueStorage()._lastObservedEthereumHeight = newValue}
  }

  var lastOutgoingBatchID: UInt64 {
    get {return _storage._lastOutgoingBatchID}
    set {_uniqueStorage()._lastOutgoingBatchID = newValue}
  }

  var lastOutgoingPoolID: UInt64 {
    get {return _storage._lastOutgoingPoolID}
    set {_uniqueStorage()._lastOutgoingPoolID = newValue}
  }

  var lastObservedValset: Injective_Peggy_V1_Valset {
    get {return _storage._lastObservedValset ?? Injective_Peggy_V1_Valset()}
    set {_uniqueStorage()._lastObservedValset = newValue}
  }
  /// Returns true if `lastObservedValset` has been explicitly set.
  var hasLastObservedValset: Bool {return _storage._lastObservedValset != nil}
  /// Clears the value of `lastObservedValset`. Subsequent reads from it will return its default value.
  mutating func clearLastObservedValset() {_uniqueStorage()._lastObservedValset = nil}

  var ethereumBlacklist: [String] {
    get {return _storage._ethereumBlacklist}
    set {_uniqueStorage()._ethereumBlacklist = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Injective_Peggy_V1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "injective.peggy.v1"

extension Injective_Peggy_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "last_observed_nonce"),
    3: .same(proto: "valsets"),
    4: .standard(proto: "valset_confirms"),
    5: .same(proto: "batches"),
    6: .standard(proto: "batch_confirms"),
    7: .same(proto: "attestations"),
    8: .standard(proto: "orchestrator_addresses"),
    9: .standard(proto: "erc20_to_denoms"),
    10: .standard(proto: "unbatched_transfers"),
    11: .standard(proto: "last_observed_ethereum_height"),
    12: .standard(proto: "last_outgoing_batch_id"),
    13: .standard(proto: "last_outgoing_pool_id"),
    14: .standard(proto: "last_observed_valset"),
    15: .standard(proto: "ethereum_blacklist"),
  ]

  fileprivate class _StorageClass {
    var _params: Injective_Peggy_V1_Params? = nil
    var _lastObservedNonce: UInt64 = 0
    var _valsets: [Injective_Peggy_V1_Valset] = []
    var _valsetConfirms: [Injective_Peggy_V1_MsgValsetConfirm] = []
    var _batches: [Injective_Peggy_V1_OutgoingTxBatch] = []
    var _batchConfirms: [Injective_Peggy_V1_MsgConfirmBatch] = []
    var _attestations: [Injective_Peggy_V1_Attestation] = []
    var _orchestratorAddresses: [Injective_Peggy_V1_MsgSetOrchestratorAddresses] = []
    var _erc20ToDenoms: [Injective_Peggy_V1_ERC20ToDenom] = []
    var _unbatchedTransfers: [Injective_Peggy_V1_OutgoingTransferTx] = []
    var _lastObservedEthereumHeight: UInt64 = 0
    var _lastOutgoingBatchID: UInt64 = 0
    var _lastOutgoingPoolID: UInt64 = 0
    var _lastObservedValset: Injective_Peggy_V1_Valset? = nil
    var _ethereumBlacklist: [String] = []

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _lastObservedNonce = source._lastObservedNonce
      _valsets = source._valsets
      _valsetConfirms = source._valsetConfirms
      _batches = source._batches
      _batchConfirms = source._batchConfirms
      _attestations = source._attestations
      _orchestratorAddresses = source._orchestratorAddresses
      _erc20ToDenoms = source._erc20ToDenoms
      _unbatchedTransfers = source._unbatchedTransfers
      _lastObservedEthereumHeight = source._lastObservedEthereumHeight
      _lastOutgoingBatchID = source._lastOutgoingBatchID
      _lastOutgoingPoolID = source._lastOutgoingPoolID
      _lastObservedValset = source._lastObservedValset
      _ethereumBlacklist = source._ethereumBlacklist
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._params) }()
        case 2: try { try decoder.decodeSingularUInt64Field(value: &_storage._lastObservedNonce) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._valsets) }()
        case 4: try { try decoder.decodeRepeatedMessageField(value: &_storage._valsetConfirms) }()
        case 5: try { try decoder.decodeRepeatedMessageField(value: &_storage._batches) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._batchConfirms) }()
        case 7: try { try decoder.decodeRepeatedMessageField(value: &_storage._attestations) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._orchestratorAddresses) }()
        case 9: try { try decoder.decodeRepeatedMessageField(value: &_storage._erc20ToDenoms) }()
        case 10: try { try decoder.decodeRepeatedMessageField(value: &_storage._unbatchedTransfers) }()
        case 11: try { try decoder.decodeSingularUInt64Field(value: &_storage._lastObservedEthereumHeight) }()
        case 12: try { try decoder.decodeSingularUInt64Field(value: &_storage._lastOutgoingBatchID) }()
        case 13: try { try decoder.decodeSingularUInt64Field(value: &_storage._lastOutgoingPoolID) }()
        case 14: try { try decoder.decodeSingularMessageField(value: &_storage._lastObservedValset) }()
        case 15: try { try decoder.decodeRepeatedStringField(value: &_storage._ethereumBlacklist) }()
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
      try { if let v = _storage._params {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      if _storage._lastObservedNonce != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._lastObservedNonce, fieldNumber: 2)
      }
      if !_storage._valsets.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._valsets, fieldNumber: 3)
      }
      if !_storage._valsetConfirms.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._valsetConfirms, fieldNumber: 4)
      }
      if !_storage._batches.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._batches, fieldNumber: 5)
      }
      if !_storage._batchConfirms.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._batchConfirms, fieldNumber: 6)
      }
      if !_storage._attestations.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._attestations, fieldNumber: 7)
      }
      if !_storage._orchestratorAddresses.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._orchestratorAddresses, fieldNumber: 8)
      }
      if !_storage._erc20ToDenoms.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._erc20ToDenoms, fieldNumber: 9)
      }
      if !_storage._unbatchedTransfers.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._unbatchedTransfers, fieldNumber: 10)
      }
      if _storage._lastObservedEthereumHeight != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._lastObservedEthereumHeight, fieldNumber: 11)
      }
      if _storage._lastOutgoingBatchID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._lastOutgoingBatchID, fieldNumber: 12)
      }
      if _storage._lastOutgoingPoolID != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._lastOutgoingPoolID, fieldNumber: 13)
      }
      try { if let v = _storage._lastObservedValset {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 14)
      } }()
      if !_storage._ethereumBlacklist.isEmpty {
        try visitor.visitRepeatedStringField(value: _storage._ethereumBlacklist, fieldNumber: 15)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Injective_Peggy_V1_GenesisState, rhs: Injective_Peggy_V1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._lastObservedNonce != rhs_storage._lastObservedNonce {return false}
        if _storage._valsets != rhs_storage._valsets {return false}
        if _storage._valsetConfirms != rhs_storage._valsetConfirms {return false}
        if _storage._batches != rhs_storage._batches {return false}
        if _storage._batchConfirms != rhs_storage._batchConfirms {return false}
        if _storage._attestations != rhs_storage._attestations {return false}
        if _storage._orchestratorAddresses != rhs_storage._orchestratorAddresses {return false}
        if _storage._erc20ToDenoms != rhs_storage._erc20ToDenoms {return false}
        if _storage._unbatchedTransfers != rhs_storage._unbatchedTransfers {return false}
        if _storage._lastObservedEthereumHeight != rhs_storage._lastObservedEthereumHeight {return false}
        if _storage._lastOutgoingBatchID != rhs_storage._lastOutgoingBatchID {return false}
        if _storage._lastOutgoingPoolID != rhs_storage._lastOutgoingPoolID {return false}
        if _storage._lastObservedValset != rhs_storage._lastObservedValset {return false}
        if _storage._ethereumBlacklist != rhs_storage._ethereumBlacklist {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
