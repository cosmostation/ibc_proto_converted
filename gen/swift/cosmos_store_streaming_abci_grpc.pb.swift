// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/store/streaming/abci/grpc.proto
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

/// ListenEndBlockRequest is the request type for the ListenEndBlock RPC method
///
/// Deprecated: Store v1 is deprecated as of v0.50.x, please use Store v2 types
/// instead.
struct Cosmos_Store_Streaming_Abci_ListenFinalizeBlockRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var req: Tendermint_Abci_RequestFinalizeBlock {
    get {return _storage._req ?? Tendermint_Abci_RequestFinalizeBlock()}
    set {_uniqueStorage()._req = newValue}
  }
  /// Returns true if `req` has been explicitly set.
  var hasReq: Bool {return _storage._req != nil}
  /// Clears the value of `req`. Subsequent reads from it will return its default value.
  mutating func clearReq() {_uniqueStorage()._req = nil}

  var res: Tendermint_Abci_ResponseFinalizeBlock {
    get {return _storage._res ?? Tendermint_Abci_ResponseFinalizeBlock()}
    set {_uniqueStorage()._res = newValue}
  }
  /// Returns true if `res` has been explicitly set.
  var hasRes: Bool {return _storage._res != nil}
  /// Clears the value of `res`. Subsequent reads from it will return its default value.
  mutating func clearRes() {_uniqueStorage()._res = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

/// ListenEndBlockResponse is the response type for the ListenEndBlock RPC method
///
/// Deprecated: Store v1 is deprecated as of v0.50.x, please use Store v2 types
/// instead.
struct Cosmos_Store_Streaming_Abci_ListenFinalizeBlockResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ListenCommitRequest is the request type for the ListenCommit RPC method
///
/// Deprecated: Store v1 is deprecated as of v0.50.x, please use Store v2 types
/// instead.
struct Cosmos_Store_Streaming_Abci_ListenCommitRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// explicitly pass in block height as ResponseCommit does not contain this
  /// info
  var blockHeight: Int64 = 0

  var res: Tendermint_Abci_ResponseCommit {
    get {return _res ?? Tendermint_Abci_ResponseCommit()}
    set {_res = newValue}
  }
  /// Returns true if `res` has been explicitly set.
  var hasRes: Bool {return self._res != nil}
  /// Clears the value of `res`. Subsequent reads from it will return its default value.
  mutating func clearRes() {self._res = nil}

  var changeSet: [Cosmos_Store_V1beta1_StoreKVPair] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _res: Tendermint_Abci_ResponseCommit? = nil
}

/// ListenCommitResponse is the response type for the ListenCommit RPC method
///
/// Deprecated: Store v1 is deprecated as of v0.50.x, please use Store v2 types
/// instead.
struct Cosmos_Store_Streaming_Abci_ListenCommitResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Store_Streaming_Abci_ListenFinalizeBlockRequest: @unchecked Sendable {}
extension Cosmos_Store_Streaming_Abci_ListenFinalizeBlockResponse: @unchecked Sendable {}
extension Cosmos_Store_Streaming_Abci_ListenCommitRequest: @unchecked Sendable {}
extension Cosmos_Store_Streaming_Abci_ListenCommitResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.store.streaming.abci"

extension Cosmos_Store_Streaming_Abci_ListenFinalizeBlockRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListenFinalizeBlockRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "req"),
    2: .same(proto: "res"),
  ]

  fileprivate class _StorageClass {
    var _req: Tendermint_Abci_RequestFinalizeBlock? = nil
    var _res: Tendermint_Abci_ResponseFinalizeBlock? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _req = source._req
      _res = source._res
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._req) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._res) }()
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
      try { if let v = _storage._req {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._res {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_Streaming_Abci_ListenFinalizeBlockRequest, rhs: Cosmos_Store_Streaming_Abci_ListenFinalizeBlockRequest) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._req != rhs_storage._req {return false}
        if _storage._res != rhs_storage._res {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Store_Streaming_Abci_ListenFinalizeBlockResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListenFinalizeBlockResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_Streaming_Abci_ListenFinalizeBlockResponse, rhs: Cosmos_Store_Streaming_Abci_ListenFinalizeBlockResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Store_Streaming_Abci_ListenCommitRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListenCommitRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "block_height"),
    2: .same(proto: "res"),
    3: .standard(proto: "change_set"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.blockHeight) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._res) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.changeSet) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.blockHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.blockHeight, fieldNumber: 1)
    }
    try { if let v = self._res {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.changeSet.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.changeSet, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_Streaming_Abci_ListenCommitRequest, rhs: Cosmos_Store_Streaming_Abci_ListenCommitRequest) -> Bool {
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs._res != rhs._res {return false}
    if lhs.changeSet != rhs.changeSet {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Store_Streaming_Abci_ListenCommitResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ListenCommitResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_Streaming_Abci_ListenCommitResponse, rhs: Cosmos_Store_Streaming_Abci_ListenCommitResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
