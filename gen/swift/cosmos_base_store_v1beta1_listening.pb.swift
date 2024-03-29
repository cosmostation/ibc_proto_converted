// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/base/store/v1beta1/listening.proto
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
struct Cosmos_Base_Store_V1beta1_StoreKVPair {
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
struct Cosmos_Base_Store_V1beta1_BlockMetadata {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var requestBeginBlock: Tendermint_Abci_RequestBeginBlock {
    get {return _storage._requestBeginBlock ?? Tendermint_Abci_RequestBeginBlock()}
    set {_uniqueStorage()._requestBeginBlock = newValue}
  }
  /// Returns true if `requestBeginBlock` has been explicitly set.
  var hasRequestBeginBlock: Bool {return _storage._requestBeginBlock != nil}
  /// Clears the value of `requestBeginBlock`. Subsequent reads from it will return its default value.
  mutating func clearRequestBeginBlock() {_uniqueStorage()._requestBeginBlock = nil}

  var responseBeginBlock: Tendermint_Abci_ResponseBeginBlock {
    get {return _storage._responseBeginBlock ?? Tendermint_Abci_ResponseBeginBlock()}
    set {_uniqueStorage()._responseBeginBlock = newValue}
  }
  /// Returns true if `responseBeginBlock` has been explicitly set.
  var hasResponseBeginBlock: Bool {return _storage._responseBeginBlock != nil}
  /// Clears the value of `responseBeginBlock`. Subsequent reads from it will return its default value.
  mutating func clearResponseBeginBlock() {_uniqueStorage()._responseBeginBlock = nil}

  var deliverTxs: [Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx] {
    get {return _storage._deliverTxs}
    set {_uniqueStorage()._deliverTxs = newValue}
  }

  var requestEndBlock: Tendermint_Abci_RequestEndBlock {
    get {return _storage._requestEndBlock ?? Tendermint_Abci_RequestEndBlock()}
    set {_uniqueStorage()._requestEndBlock = newValue}
  }
  /// Returns true if `requestEndBlock` has been explicitly set.
  var hasRequestEndBlock: Bool {return _storage._requestEndBlock != nil}
  /// Clears the value of `requestEndBlock`. Subsequent reads from it will return its default value.
  mutating func clearRequestEndBlock() {_uniqueStorage()._requestEndBlock = nil}

  var responseEndBlock: Tendermint_Abci_ResponseEndBlock {
    get {return _storage._responseEndBlock ?? Tendermint_Abci_ResponseEndBlock()}
    set {_uniqueStorage()._responseEndBlock = newValue}
  }
  /// Returns true if `responseEndBlock` has been explicitly set.
  var hasResponseEndBlock: Bool {return _storage._responseEndBlock != nil}
  /// Clears the value of `responseEndBlock`. Subsequent reads from it will return its default value.
  mutating func clearResponseEndBlock() {_uniqueStorage()._responseEndBlock = nil}

  var responseCommit: Tendermint_Abci_ResponseCommit {
    get {return _storage._responseCommit ?? Tendermint_Abci_ResponseCommit()}
    set {_uniqueStorage()._responseCommit = newValue}
  }
  /// Returns true if `responseCommit` has been explicitly set.
  var hasResponseCommit: Bool {return _storage._responseCommit != nil}
  /// Clears the value of `responseCommit`. Subsequent reads from it will return its default value.
  mutating func clearResponseCommit() {_uniqueStorage()._responseCommit = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// DeliverTx encapulate deliver tx request and response.
  struct DeliverTx {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    var request: Tendermint_Abci_RequestDeliverTx {
      get {return _request ?? Tendermint_Abci_RequestDeliverTx()}
      set {_request = newValue}
    }
    /// Returns true if `request` has been explicitly set.
    var hasRequest: Bool {return self._request != nil}
    /// Clears the value of `request`. Subsequent reads from it will return its default value.
    mutating func clearRequest() {self._request = nil}

    var response: Tendermint_Abci_ResponseDeliverTx {
      get {return _response ?? Tendermint_Abci_ResponseDeliverTx()}
      set {_response = newValue}
    }
    /// Returns true if `response` has been explicitly set.
    var hasResponse: Bool {return self._response != nil}
    /// Clears the value of `response`. Subsequent reads from it will return its default value.
    mutating func clearResponse() {self._response = nil}

    var unknownFields = SwiftProtobuf.UnknownStorage()

    init() {}

    fileprivate var _request: Tendermint_Abci_RequestDeliverTx? = nil
    fileprivate var _response: Tendermint_Abci_ResponseDeliverTx? = nil
  }

  init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Base_Store_V1beta1_StoreKVPair: @unchecked Sendable {}
extension Cosmos_Base_Store_V1beta1_BlockMetadata: @unchecked Sendable {}
extension Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.base.store.v1beta1"

extension Cosmos_Base_Store_V1beta1_StoreKVPair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
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

  static func ==(lhs: Cosmos_Base_Store_V1beta1_StoreKVPair, rhs: Cosmos_Base_Store_V1beta1_StoreKVPair) -> Bool {
    if lhs.storeKey != rhs.storeKey {return false}
    if lhs.delete != rhs.delete {return false}
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Store_V1beta1_BlockMetadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".BlockMetadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "request_begin_block"),
    2: .standard(proto: "response_begin_block"),
    3: .standard(proto: "deliver_txs"),
    4: .standard(proto: "request_end_block"),
    5: .standard(proto: "response_end_block"),
    6: .standard(proto: "response_commit"),
  ]

  fileprivate class _StorageClass {
    var _requestBeginBlock: Tendermint_Abci_RequestBeginBlock? = nil
    var _responseBeginBlock: Tendermint_Abci_ResponseBeginBlock? = nil
    var _deliverTxs: [Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx] = []
    var _requestEndBlock: Tendermint_Abci_RequestEndBlock? = nil
    var _responseEndBlock: Tendermint_Abci_ResponseEndBlock? = nil
    var _responseCommit: Tendermint_Abci_ResponseCommit? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _requestBeginBlock = source._requestBeginBlock
      _responseBeginBlock = source._responseBeginBlock
      _deliverTxs = source._deliverTxs
      _requestEndBlock = source._requestEndBlock
      _responseEndBlock = source._responseEndBlock
      _responseCommit = source._responseCommit
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._requestBeginBlock) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._responseBeginBlock) }()
        case 3: try { try decoder.decodeRepeatedMessageField(value: &_storage._deliverTxs) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._requestEndBlock) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._responseEndBlock) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._responseCommit) }()
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
      try { if let v = _storage._requestBeginBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._responseBeginBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      if !_storage._deliverTxs.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._deliverTxs, fieldNumber: 3)
      }
      try { if let v = _storage._requestEndBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._responseEndBlock {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._responseCommit {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Store_V1beta1_BlockMetadata, rhs: Cosmos_Base_Store_V1beta1_BlockMetadata) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._requestBeginBlock != rhs_storage._requestBeginBlock {return false}
        if _storage._responseBeginBlock != rhs_storage._responseBeginBlock {return false}
        if _storage._deliverTxs != rhs_storage._deliverTxs {return false}
        if _storage._requestEndBlock != rhs_storage._requestEndBlock {return false}
        if _storage._responseEndBlock != rhs_storage._responseEndBlock {return false}
        if _storage._responseCommit != rhs_storage._responseCommit {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = Cosmos_Base_Store_V1beta1_BlockMetadata.protoMessageName + ".DeliverTx"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "request"),
    2: .same(proto: "response"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._request) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._response) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._request {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._response {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx, rhs: Cosmos_Base_Store_V1beta1_BlockMetadata.DeliverTx) -> Bool {
    if lhs._request != rhs._request {return false}
    if lhs._response != rhs._response {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
