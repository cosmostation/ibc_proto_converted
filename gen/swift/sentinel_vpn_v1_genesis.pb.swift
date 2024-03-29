// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sentinel/vpn/v1/genesis.proto
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

struct Sentinel_Vpn_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var deposits: [Sentinel_Deposit_V1_Deposit] {
    get {return _storage._deposits}
    set {_uniqueStorage()._deposits = newValue}
  }

  var nodes: Sentinel_Node_V2_GenesisState {
    get {return _storage._nodes ?? Sentinel_Node_V2_GenesisState()}
    set {_uniqueStorage()._nodes = newValue}
  }
  /// Returns true if `nodes` has been explicitly set.
  var hasNodes: Bool {return _storage._nodes != nil}
  /// Clears the value of `nodes`. Subsequent reads from it will return its default value.
  mutating func clearNodes() {_uniqueStorage()._nodes = nil}

  var plans: [Sentinel_Plan_V2_GenesisPlan] {
    get {return _storage._plans}
    set {_uniqueStorage()._plans = newValue}
  }

  var providers: Sentinel_Provider_V2_GenesisState {
    get {return _storage._providers ?? Sentinel_Provider_V2_GenesisState()}
    set {_uniqueStorage()._providers = newValue}
  }
  /// Returns true if `providers` has been explicitly set.
  var hasProviders: Bool {return _storage._providers != nil}
  /// Clears the value of `providers`. Subsequent reads from it will return its default value.
  mutating func clearProviders() {_uniqueStorage()._providers = nil}

  var sessions: Sentinel_Session_V2_GenesisState {
    get {return _storage._sessions ?? Sentinel_Session_V2_GenesisState()}
    set {_uniqueStorage()._sessions = newValue}
  }
  /// Returns true if `sessions` has been explicitly set.
  var hasSessions: Bool {return _storage._sessions != nil}
  /// Clears the value of `sessions`. Subsequent reads from it will return its default value.
  mutating func clearSessions() {_uniqueStorage()._sessions = nil}

  var subscriptions: Sentinel_Subscription_V2_GenesisState {
    get {return _storage._subscriptions ?? Sentinel_Subscription_V2_GenesisState()}
    set {_uniqueStorage()._subscriptions = newValue}
  }
  /// Returns true if `subscriptions` has been explicitly set.
  var hasSubscriptions: Bool {return _storage._subscriptions != nil}
  /// Clears the value of `subscriptions`. Subsequent reads from it will return its default value.
  mutating func clearSubscriptions() {_uniqueStorage()._subscriptions = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Sentinel_Vpn_V1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "sentinel.vpn.v1"

extension Sentinel_Vpn_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "deposits"),
    2: .same(proto: "nodes"),
    3: .same(proto: "plans"),
    4: .same(proto: "providers"),
    5: .same(proto: "sessions"),
    6: .same(proto: "subscriptions"),
  ]

  fileprivate class _StorageClass {
    var _deposits: [Sentinel_Deposit_V1_Deposit] = []
    var _nodes: Sentinel_Node_V2_GenesisState? = nil
    var _plans: [Sentinel_Plan_V2_GenesisPlan] = []
    var _providers: Sentinel_Provider_V2_GenesisState? = nil
    var _sessions: Sentinel_Session_V2_GenesisState? = nil
    var _subscriptions: Sentinel_Subscription_V2_GenesisState? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _deposits = source._deposits
      _nodes = source._nodes
      _plans = source._plans
      _providers = source._providers
      _sessions = source._sessions
      _subscriptions = source._subscriptions
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
        case 1: try { try decoder.decodeRepeatedMessageField(value: &_storage._deposits) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._nodes) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._plans) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._providers) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._sessions) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._subscriptions) }()
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
      if !_storage._deposits.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._deposits, fieldNumber: 1)
      }
      try { if let v = _storage._nodes {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      if !_storage._plans.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._plans, fieldNumber: 3)
      }
      try { if let v = _storage._providers {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._sessions {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._subscriptions {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Sentinel_Vpn_V1_GenesisState, rhs: Sentinel_Vpn_V1_GenesisState) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._deposits != rhs_storage._deposits {return false}
        if _storage._nodes != rhs_storage._nodes {return false}
        if _storage._plans != rhs_storage._plans {return false}
        if _storage._providers != rhs_storage._providers {return false}
        if _storage._sessions != rhs_storage._sessions {return false}
        if _storage._subscriptions != rhs_storage._subscriptions {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
