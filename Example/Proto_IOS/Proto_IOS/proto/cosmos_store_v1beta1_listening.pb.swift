// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/store/v1beta1/listening.proto
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

/// StoreKVPair is a KVStore KVPair used for listening to state changes (Sets and Deletes)
/// It optionally includes the StoreKey for the originating KVStore and a Boolean flag to distinguish between Sets and
/// Deletes
///
/// Since: cosmos-sdk 0.43
struct Cosmos_Store_V1beta1_StoreKVPair {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the store key for the KVStore this pair originates from
  var storeKey: String = String()

  /// true indicates a delete operation, false indicates a set operation
  var delete: Bool = false

  var key: Data = Data()

  var value: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// BlockMetadata contains all the abci event data of a block
/// the file streamer dump them into files together with the state changes.
struct Cosmos_Store_V1beta1_BlockMetadata {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var responseCommit: Tendermint_Abci_ResponseCommit {
    get {return _storage._responseCommit ?? Tendermint_Abci_ResponseCommit()}
    set {_uniqueStorage()._responseCommit = newValue}
  }
  /// Returns true if `responseCommit` has been explicitly set.
  var hasResponseCommit: Bool {return _storage._responseCommit != nil}
  /// Clears the value of `responseCommit`. Subsequent reads from it will return its default value.
  mutating func clearResponseCommit() {_uniqueStorage()._responseCommit = nil}

  var requestFinalizeBlock: Tendermint_Abci_RequestFinalizeBlock {
    get {return _storage._requestFinalizeBlock ?? Tendermint_Abci_RequestFinalizeBlock()}
    set {_uniqueStorage()._requestFinalizeBlock = newValue}
  }
  /// Returns true if `requestFinalizeBlock` has been explicitly set.
  var hasRequestFinalizeBlock: Bool {return _storage._requestFinalizeBlock != nil}
  /// Clears the value of `requestFinalizeBlock`. Subsequent reads from it will return its default value.
  mutating func clearRequestFinalizeBlock() {_uniqueStorage()._requestFinalizeBlock = nil}

  /// TODO: should we renumber this?
  var responseFinalizeBlock: Tendermint_Abci_ResponseFinalizeBlock {
    get {return _storage._responseFinalizeBlock ?? Tendermint_Abci_ResponseFinalizeBlock()}
    set {_uniqueStorage()._responseFinalizeBlock = newValue}
  }
  /// Returns true if `responseFinalizeBlock` has been explicitly set.
  var hasResponseFinalizeBlock: Bool {return _storage._responseFinalizeBlock != nil}
  /// Clears the value of `responseFinalizeBlock`. Subsequent reads from it will return its default value.
  mutating func clearResponseFinalizeBlock() {_uniqueStorage()._responseFinalizeBlock = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Store_V1beta1_StoreKVPair: @unchecked Sendable {}
extension Cosmos_Store_V1beta1_BlockMetadata: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.store.v1beta1"

extension Cosmos_Store_V1beta1_StoreKVPair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StoreKVPair"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "store_key"),
    2: .same(proto: "delete"),
    3: .same(proto: "key"),
    4: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.storeKey) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.delete) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.storeKey.isEmpty {
      try visitor.visitSingularStringField(value: self.storeKey, fieldNumber: 1)
    }
    if self.delete != false {
      try visitor.visitSingularBoolField(value: self.delete, fieldNumber: 2)
    }
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 3)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_V1beta1_StoreKVPair, rhs: Cosmos_Store_V1beta1_StoreKVPair) -> Bool {
    if lhs.storeKey != rhs.storeKey {return false}
    if lhs.delete != rhs.delete {return false}
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Store_V1beta1_BlockMetadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BlockMetadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    6: .standard(proto: "response_commit"),
    7: .standard(proto: "request_finalize_block"),
    8: .standard(proto: "response_finalize_block"),
  ]

  fileprivate class _StorageClass {
    var _responseCommit: Tendermint_Abci_ResponseCommit? = nil
    var _requestFinalizeBlock: Tendermint_Abci_RequestFinalizeBlock? = nil
    var _responseFinalizeBlock: Tendermint_Abci_ResponseFinalizeBlock? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _responseCommit = source._responseCommit
      _requestFinalizeBlock = source._requestFinalizeBlock
      _responseFinalizeBlock = source._responseFinalizeBlock
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
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._responseCommit) }()
        case 7: try { try decoder.decodeSingularMessageField(value: &_storage._requestFinalizeBlock) }()
        case 8: try { try decoder.decodeSingularMessageField(value: &_storage._responseFinalizeBlock) }()
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
      try { if let v = _storage._responseCommit {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      try { if let v = _storage._requestFinalizeBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      } }()
      try { if let v = _storage._responseFinalizeBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Store_V1beta1_BlockMetadata, rhs: Cosmos_Store_V1beta1_BlockMetadata) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._responseCommit != rhs_storage._responseCommit {return false}
        if _storage._requestFinalizeBlock != rhs_storage._requestFinalizeBlock {return false}
        if _storage._responseFinalizeBlock != rhs_storage._responseFinalizeBlock {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
