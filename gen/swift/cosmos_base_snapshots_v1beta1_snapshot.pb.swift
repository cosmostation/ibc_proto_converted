// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/base/snapshots/v1beta1/snapshot.proto
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

/// Snapshot contains Tendermint state sync snapshot info.
struct Cosmos_Base_Snapshots_V1beta1_Snapshot {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var height: UInt64 = 0

  var format: UInt32 = 0

  var chunks: UInt32 = 0

  var hash: Data = Data()

  var metadata: Cosmos_Base_Snapshots_V1beta1_Metadata {
    get {return _metadata ?? Cosmos_Base_Snapshots_V1beta1_Metadata()}
    set {_metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return self._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {self._metadata = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _metadata: Cosmos_Base_Snapshots_V1beta1_Metadata? = nil
}

/// Metadata contains SDK-specific snapshot metadata.
struct Cosmos_Base_Snapshots_V1beta1_Metadata {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// SHA-256 chunk hashes
  var chunkHashes: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotItem is an item contained in a rootmulti.Store snapshot.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Base_Snapshots_V1beta1_SnapshotItem {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// item is the specific type of snapshot item.
  var item: Cosmos_Base_Snapshots_V1beta1_SnapshotItem.OneOf_Item? = nil

  var store: Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem {
    get {
      if case .store(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem()
    }
    set {item = .store(newValue)}
  }

  var iavl: Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem {
    get {
      if case .iavl(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem()
    }
    set {item = .iavl(newValue)}
  }

  var `extension`: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta {
    get {
      if case .extension(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta()
    }
    set {item = .extension(newValue)}
  }

  var extensionPayload: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload {
    get {
      if case .extensionPayload(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload()
    }
    set {item = .extensionPayload(newValue)}
  }

  var kv: Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem {
    get {
      if case .kv(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem()
    }
    set {item = .kv(newValue)}
  }

  var schema: Cosmos_Base_Snapshots_V1beta1_SnapshotSchema {
    get {
      if case .schema(let v)? = item {return v}
      return Cosmos_Base_Snapshots_V1beta1_SnapshotSchema()
    }
    set {item = .schema(newValue)}
  }

  var unknownFields = SwiftProtobuf.UnknownStorage()

  /// item is the specific type of snapshot item.
  enum OneOf_Item: Equatable {
    case store(Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem)
    case iavl(Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem)
    case `extension`(Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta)
    case extensionPayload(Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload)
    case kv(Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem)
    case schema(Cosmos_Base_Snapshots_V1beta1_SnapshotSchema)

  #if !swift(>=4.1)
    static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotItem.OneOf_Item, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotItem.OneOf_Item) -> Bool {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch (lhs, rhs) {
      case (.store, .store): return {
        guard case .store(let l) = lhs, case .store(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.iavl, .iavl): return {
        guard case .iavl(let l) = lhs, case .iavl(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.extension, .extension): return {
        guard case .extension(let l) = lhs, case .extension(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.extensionPayload, .extensionPayload): return {
        guard case .extensionPayload(let l) = lhs, case .extensionPayload(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.kv, .kv): return {
        guard case .kv(let l) = lhs, case .kv(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      case (.schema, .schema): return {
        guard case .schema(let l) = lhs, case .schema(let r) = rhs else { preconditionFailure() }
        return l == r
      }()
      default: return false
      }
    }
  #endif
  }

  init() {}
}

/// SnapshotStoreItem contains metadata about a snapshotted store.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotIAVLItem is an exported IAVL node.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: Data = Data()

  var value: Data = Data()

  /// version is block height
  var version: Int64 = 0

  /// height is depth of the tree.
  var height: Int32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotExtensionMeta contains metadata about an external snapshotter.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var format: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotExtensionPayload contains payloads of an external snapshotter.
///
/// Since: cosmos-sdk 0.46
struct Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var payload: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotKVItem is an exported Key/Value Pair
///
/// Since: cosmos-sdk 0.46
/// Deprecated: This message was part of store/v2alpha1 which has been deleted from v0.47.
struct Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: Data = Data()

  var value: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// SnapshotSchema is an exported schema of smt store
///
/// Since: cosmos-sdk 0.46
/// Deprecated: This message was part of store/v2alpha1 which has been deleted from v0.47.
struct Cosmos_Base_Snapshots_V1beta1_SnapshotSchema {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var keys: [Data] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Base_Snapshots_V1beta1_Snapshot: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_Metadata: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotItem: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotItem.OneOf_Item: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem: @unchecked Sendable {}
extension Cosmos_Base_Snapshots_V1beta1_SnapshotSchema: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.base.snapshots.v1beta1"

extension Cosmos_Base_Snapshots_V1beta1_Snapshot: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Snapshot"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "height"),
    2: .same(proto: "format"),
    3: .same(proto: "chunks"),
    4: .same(proto: "hash"),
    5: .same(proto: "metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.format) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.chunks) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.hash) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._metadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 1)
    }
    if self.format != 0 {
      try visitor.visitSingularUInt32Field(value: self.format, fieldNumber: 2)
    }
    if self.chunks != 0 {
      try visitor.visitSingularUInt32Field(value: self.chunks, fieldNumber: 3)
    }
    if !self.hash.isEmpty {
      try visitor.visitSingularBytesField(value: self.hash, fieldNumber: 4)
    }
    try { if let v = self._metadata {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_Snapshot, rhs: Cosmos_Base_Snapshots_V1beta1_Snapshot) -> Bool {
    if lhs.height != rhs.height {return false}
    if lhs.format != rhs.format {return false}
    if lhs.chunks != rhs.chunks {return false}
    if lhs.hash != rhs.hash {return false}
    if lhs._metadata != rhs._metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_Metadata: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Metadata"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chunk_hashes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedBytesField(value: &self.chunkHashes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.chunkHashes.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.chunkHashes, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_Metadata, rhs: Cosmos_Base_Snapshots_V1beta1_Metadata) -> Bool {
    if lhs.chunkHashes != rhs.chunkHashes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotItem: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotItem"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "store"),
    2: .same(proto: "iavl"),
    3: .same(proto: "extension"),
    4: .standard(proto: "extension_payload"),
    5: .same(proto: "kv"),
    6: .same(proto: "schema"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .store(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .store(v)
        }
      }()
      case 2: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .iavl(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .iavl(v)
        }
      }()
      case 3: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .extension(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .extension(v)
        }
      }()
      case 4: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .extensionPayload(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .extensionPayload(v)
        }
      }()
      case 5: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .kv(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .kv(v)
        }
      }()
      case 6: try {
        var v: Cosmos_Base_Snapshots_V1beta1_SnapshotSchema?
        var hadOneofValue = false
        if let current = self.item {
          hadOneofValue = true
          if case .schema(let m) = current {v = m}
        }
        try decoder.decodeSingularMessageField(value: &v)
        if let v = v {
          if hadOneofValue {try decoder.handleConflictingOneOf()}
          self.item = .schema(v)
        }
      }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    switch self.item {
    case .store?: try {
      guard case .store(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }()
    case .iavl?: try {
      guard case .iavl(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }()
    case .extension?: try {
      guard case .extension(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }()
    case .extensionPayload?: try {
      guard case .extensionPayload(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    }()
    case .kv?: try {
      guard case .kv(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    }()
    case .schema?: try {
      guard case .schema(let v)? = self.item else { preconditionFailure() }
      try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
    }()
    case nil: break
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotItem, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotItem) -> Bool {
    if lhs.item != rhs.item {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotStoreItem"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotStoreItem) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotIAVLItem"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
    3: .same(proto: "version"),
    4: .same(proto: "height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.version) }()
      case 4: try { try decoder.decodeSingularInt32Field(value: &self.height) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 2)
    }
    if self.version != 0 {
      try visitor.visitSingularInt64Field(value: self.version, fieldNumber: 3)
    }
    if self.height != 0 {
      try visitor.visitSingularInt32Field(value: self.height, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotIAVLItem) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.version != rhs.version {return false}
    if lhs.height != rhs.height {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotExtensionMeta"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "format"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.format) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if self.format != 0 {
      try visitor.visitSingularUInt32Field(value: self.format, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionMeta) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.format != rhs.format {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotExtensionPayload"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "payload"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.payload) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.payload.isEmpty {
      try visitor.visitSingularBytesField(value: self.payload, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotExtensionPayload) -> Bool {
    if lhs.payload != rhs.payload {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotKVItem"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBytesField(value: &self.key) }()
      case 2: try { try decoder.decodeSingularBytesField(value: &self.value) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotKVItem) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Snapshots_V1beta1_SnapshotSchema: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SnapshotSchema"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "keys"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedBytesField(value: &self.keys) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.keys.isEmpty {
      try visitor.visitRepeatedBytesField(value: self.keys, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Snapshots_V1beta1_SnapshotSchema, rhs: Cosmos_Base_Snapshots_V1beta1_SnapshotSchema) -> Bool {
    if lhs.keys != rhs.keys {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}