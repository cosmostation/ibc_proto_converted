// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/base/node/v1beta1/query.proto
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

/// ConfigRequest defines the request structure for the Config gRPC query.
struct Cosmos_Base_Node_V1beta1_ConfigRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// ConfigResponse defines the response structure for the Config gRPC query.
struct Cosmos_Base_Node_V1beta1_ConfigResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var minimumGasPrice: String = String()

  var pruningKeepRecent: String = String()

  var pruningInterval: String = String()

  var haltHeight: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// StateRequest defines the request structure for the status of a node.
struct Cosmos_Base_Node_V1beta1_StatusRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// StateResponse defines the response structure for the status of a node.
struct Cosmos_Base_Node_V1beta1_StatusResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// earliest block height available in the store
  var earliestStoreHeight: UInt64 = 0

  /// current block height
  var height: UInt64 = 0

  /// block height timestamp
  var timestamp: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _timestamp ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_timestamp = newValue}
  }
  /// Returns true if `timestamp` has been explicitly set.
  var hasTimestamp: Bool {return self._timestamp != nil}
  /// Clears the value of `timestamp`. Subsequent reads from it will return its default value.
  mutating func clearTimestamp() {self._timestamp = nil}

  /// app hash of the current block
  var appHash: Data = Data()

  /// validator hash provided by the consensus header
  var validatorHash: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timestamp: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Base_Node_V1beta1_ConfigRequest: @unchecked Sendable {}
extension Cosmos_Base_Node_V1beta1_ConfigResponse: @unchecked Sendable {}
extension Cosmos_Base_Node_V1beta1_StatusRequest: @unchecked Sendable {}
extension Cosmos_Base_Node_V1beta1_StatusResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.base.node.v1beta1"

extension Cosmos_Base_Node_V1beta1_ConfigRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConfigRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Node_V1beta1_ConfigRequest, rhs: Cosmos_Base_Node_V1beta1_ConfigRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Node_V1beta1_ConfigResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ConfigResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "minimum_gas_price"),
    2: .standard(proto: "pruning_keep_recent"),
    3: .standard(proto: "pruning_interval"),
    4: .standard(proto: "halt_height"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.minimumGasPrice) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.pruningKeepRecent) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.pruningInterval) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.haltHeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.minimumGasPrice.isEmpty {
      try visitor.visitSingularStringField(value: self.minimumGasPrice, fieldNumber: 1)
    }
    if !self.pruningKeepRecent.isEmpty {
      try visitor.visitSingularStringField(value: self.pruningKeepRecent, fieldNumber: 2)
    }
    if !self.pruningInterval.isEmpty {
      try visitor.visitSingularStringField(value: self.pruningInterval, fieldNumber: 3)
    }
    if self.haltHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.haltHeight, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Node_V1beta1_ConfigResponse, rhs: Cosmos_Base_Node_V1beta1_ConfigResponse) -> Bool {
    if lhs.minimumGasPrice != rhs.minimumGasPrice {return false}
    if lhs.pruningKeepRecent != rhs.pruningKeepRecent {return false}
    if lhs.pruningInterval != rhs.pruningInterval {return false}
    if lhs.haltHeight != rhs.haltHeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Node_V1beta1_StatusRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StatusRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Node_V1beta1_StatusRequest, rhs: Cosmos_Base_Node_V1beta1_StatusRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cosmos_Base_Node_V1beta1_StatusResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".StatusResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "earliest_store_height"),
    2: .same(proto: "height"),
    3: .same(proto: "timestamp"),
    4: .standard(proto: "app_hash"),
    5: .standard(proto: "validator_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.earliestStoreHeight) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.height) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._timestamp) }()
      case 4: try { try decoder.decodeSingularBytesField(value: &self.appHash) }()
      case 5: try { try decoder.decodeSingularBytesField(value: &self.validatorHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.earliestStoreHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.earliestStoreHeight, fieldNumber: 1)
    }
    if self.height != 0 {
      try visitor.visitSingularUInt64Field(value: self.height, fieldNumber: 2)
    }
    try { if let v = self._timestamp {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.appHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.appHash, fieldNumber: 4)
    }
    if !self.validatorHash.isEmpty {
      try visitor.visitSingularBytesField(value: self.validatorHash, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Base_Node_V1beta1_StatusResponse, rhs: Cosmos_Base_Node_V1beta1_StatusResponse) -> Bool {
    if lhs.earliestStoreHeight != rhs.earliestStoreHeight {return false}
    if lhs.height != rhs.height {return false}
    if lhs._timestamp != rhs._timestamp {return false}
    if lhs.appHash != rhs.appHash {return false}
    if lhs.validatorHash != rhs.validatorHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
