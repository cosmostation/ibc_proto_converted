// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/nexus/v1beta1/genesis.proto
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

/// GenesisState represents the genesis state
struct Axelar_Nexus_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Axelar_Nexus_V1beta1_Params {
    get {return _storage._params ?? Axelar_Nexus_V1beta1_Params()}
    set {_uniqueStorage()._params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return _storage._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {_uniqueStorage()._params = nil}

  var nonce: UInt64 {
    get {return _storage._nonce}
    set {_uniqueStorage()._nonce = newValue}
  }

  var chains: [Axelar_Nexus_Exported_V1beta1_Chain] {
    get {return _storage._chains}
    set {_uniqueStorage()._chains = newValue}
  }

  var chainStates: [Axelar_Nexus_V1beta1_ChainState] {
    get {return _storage._chainStates}
    set {_uniqueStorage()._chainStates = newValue}
  }

  var linkedAddresses: [Axelar_Nexus_V1beta1_LinkedAddresses] {
    get {return _storage._linkedAddresses}
    set {_uniqueStorage()._linkedAddresses = newValue}
  }

  var transfers: [Axelar_Nexus_Exported_V1beta1_CrossChainTransfer] {
    get {return _storage._transfers}
    set {_uniqueStorage()._transfers = newValue}
  }

  var fee: Axelar_Nexus_Exported_V1beta1_TransferFee {
    get {return _storage._fee ?? Axelar_Nexus_Exported_V1beta1_TransferFee()}
    set {_uniqueStorage()._fee = newValue}
  }
  /// Returns true if `fee` has been explicitly set.
  var hasFee: Bool {return _storage._fee != nil}
  /// Clears the value of `fee`. Subsequent reads from it will return its default value.
  mutating func clearFee() {_uniqueStorage()._fee = nil}

  var feeInfos: [Axelar_Nexus_Exported_V1beta1_FeeInfo] {
    get {return _storage._feeInfos}
    set {_uniqueStorage()._feeInfos = newValue}
  }

  var rateLimits: [Axelar_Nexus_V1beta1_RateLimit] {
    get {return _storage._rateLimits}
    set {_uniqueStorage()._rateLimits = newValue}
  }

  var transferEpochs: [Axelar_Nexus_V1beta1_TransferEpoch] {
    get {return _storage._transferEpochs}
    set {_uniqueStorage()._transferEpochs = newValue}
  }

  var messages: [Axelar_Nexus_Exported_V1beta1_GeneralMessage] {
    get {return _storage._messages}
    set {_uniqueStorage()._messages = newValue}
  }

  var messageNonce: UInt64 {
    get {return _storage._messageNonce}
    set {_uniqueStorage()._messageNonce = newValue}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Nexus_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.nexus.v1beta1"

extension Axelar_Nexus_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "nonce"),
    3: .same(proto: "chains"),
    4: .standard(proto: "chain_states"),
    5: .standard(proto: "linked_addresses"),
    6: .same(proto: "transfers"),
    7: .same(proto: "fee"),
    8: .standard(proto: "fee_infos"),
    9: .standard(proto: "rate_limits"),
    10: .standard(proto: "transfer_epochs"),
    11: .same(proto: "messages"),
    12: .standard(proto: "message_nonce"),
  ]

  fileprivate class _StorageClass {
    var _params: Axelar_Nexus_V1beta1_Params? = nil
    var _nonce: UInt64 = 0
    var _chains: [Axelar_Nexus_Exported_V1beta1_Chain] = []
    var _chainStates: [Axelar_Nexus_V1beta1_ChainState] = []
    var _linkedAddresses: [Axelar_Nexus_V1beta1_LinkedAddresses] = []
    var _transfers: [Axelar_Nexus_Exported_V1beta1_CrossChainTransfer] = []
    var _fee: Axelar_Nexus_Exported_V1beta1_TransferFee? = nil
    var _feeInfos: [Axelar_Nexus_Exported_V1beta1_FeeInfo] = []
    var _rateLimits: [Axelar_Nexus_V1beta1_RateLimit] = []
    var _transferEpochs: [Axelar_Nexus_V1beta1_TransferEpoch] = []
    var _messages: [Axelar_Nexus_Exported_V1beta1_GeneralMessage] = []
    var _messageNonce: UInt64 = 0

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _params = source._params
      _nonce = source._nonce
      _chains = source._chains
      _chainStates = source._chainStates
      _linkedAddresses = source._linkedAddresses
      _transfers = source._transfers
      _fee = source._fee
      _feeInfos = source._feeInfos
      _rateLimits = source._rateLimits
      _transferEpochs = source._transferEpochs
      _messages = source._messages
      _messageNonce = source._messageNonce
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
        case 2: try { try decoder.decodeSingularUInt64Field(value: &_storage._nonce) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._chains) }()
        case 4: try { try decoder.decodeRepeatedMessageField(value: &_storage._chainStates) }()
        case 5: try { try decoder.decodeRepeatedMessageField(value: &_storage._linkedAddresses) }()
        case 6: try { try decoder.decodeRepeatedMessageField(value: &_storage._transfers) }()
        case 7: try { try decoder.decodeSingularMessageField(value: &_storage._fee) }()
        case 8: try { try decoder.decodeRepeatedMessageField(value: &_storage._feeInfos) }()
        case 9: try { try decoder.decodeRepeatedMessageField(value: &_storage._rateLimits) }()
        case 10: try { try decoder.decodeRepeatedMessageField(value: &_storage._transferEpochs) }()
        case 11: try { try decoder.decodeRepeatedMessageField(value: &_storage._messages) }()
        case 12: try { try decoder.decodeSingularUInt64Field(value: &_storage._messageNonce) }()
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
      if _storage._nonce != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._nonce, fieldNumber: 2)
      }
      if !_storage._chains.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._chains, fieldNumber: 3)
      }
      if !_storage._chainStates.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._chainStates, fieldNumber: 4)
      }
      if !_storage._linkedAddresses.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._linkedAddresses, fieldNumber: 5)
      }
      if !_storage._transfers.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._transfers, fieldNumber: 6)
      }
      try { if let v = _storage._fee {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      } }()
      if !_storage._feeInfos.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._feeInfos, fieldNumber: 8)
      }
      if !_storage._rateLimits.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._rateLimits, fieldNumber: 9)
      }
      if !_storage._transferEpochs.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._transferEpochs, fieldNumber: 10)
      }
      if !_storage._messages.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._messages, fieldNumber: 11)
      }
      if _storage._messageNonce != 0 {
        try visitor.visitSingularUInt64Field(value: _storage._messageNonce, fieldNumber: 12)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_GenesisState, rhs: Axelar_Nexus_V1beta1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._params != rhs_storage._params {return false}
        if _storage._nonce != rhs_storage._nonce {return false}
        if _storage._chains != rhs_storage._chains {return false}
        if _storage._chainStates != rhs_storage._chainStates {return false}
        if _storage._linkedAddresses != rhs_storage._linkedAddresses {return false}
        if _storage._transfers != rhs_storage._transfers {return false}
        if _storage._fee != rhs_storage._fee {return false}
        if _storage._feeInfos != rhs_storage._feeInfos {return false}
        if _storage._rateLimits != rhs_storage._rateLimits {return false}
        if _storage._transferEpochs != rhs_storage._transferEpochs {return false}
        if _storage._messages != rhs_storage._messages {return false}
        if _storage._messageNonce != rhs_storage._messageNonce {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
