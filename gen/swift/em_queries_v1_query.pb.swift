// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: em/queries/v1/query.proto
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

struct Em_Queries_V1_QueryCirculatingRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Queries_V1_QueryCirculatingResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var total: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Queries_V1_QuerySpendableRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Queries_V1_QuerySpendableResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var balance: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Queries_V1_QueryMissedBlocksRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// cons_address is the address to query the missed blocks signing info
  var consAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Em_Queries_V1_QueryMissedBlocksResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// val_signing_info is the signing info of requested val cons address
  var missedBlocksInfo: Em_Queries_V1_MissedBlocksInfo {
    get {return _missedBlocksInfo ?? Em_Queries_V1_MissedBlocksInfo()}
    set {_missedBlocksInfo = newValue}
  }
  /// Returns true if `missedBlocksInfo` has been explicitly set.
  var hasMissedBlocksInfo: Bool {return self._missedBlocksInfo != nil}
  /// Clears the value of `missedBlocksInfo`. Subsequent reads from it will return its default value.
  mutating func clearMissedBlocksInfo() {self._missedBlocksInfo = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _missedBlocksInfo: Em_Queries_V1_MissedBlocksInfo? = nil
}

/// ValidatorSigningInfo defines a validator's missed blocks info.
struct Em_Queries_V1_MissedBlocksInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var consAddress: String = String()

  /// missed blocks counter (to avoid scanning the array every time)
  var missedBlocksCounter: Int64 = 0

  var totalBlocksCounter: Int64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Em_Queries_V1_QueryCirculatingRequest: @unchecked Sendable {}
extension Em_Queries_V1_QueryCirculatingResponse: @unchecked Sendable {}
extension Em_Queries_V1_QuerySpendableRequest: @unchecked Sendable {}
extension Em_Queries_V1_QuerySpendableResponse: @unchecked Sendable {}
extension Em_Queries_V1_QueryMissedBlocksRequest: @unchecked Sendable {}
extension Em_Queries_V1_QueryMissedBlocksResponse: @unchecked Sendable {}
extension Em_Queries_V1_MissedBlocksInfo: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "em.queries.v1"

extension Em_Queries_V1_QueryCirculatingRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryCirculatingRequest"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QueryCirculatingRequest, rhs: Em_Queries_V1_QueryCirculatingRequest) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_QueryCirculatingResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryCirculatingResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "total"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.total) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.total.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.total, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QueryCirculatingResponse, rhs: Em_Queries_V1_QueryCirculatingResponse) -> Bool {
    if lhs.total != rhs.total {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_QuerySpendableRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySpendableRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QuerySpendableRequest, rhs: Em_Queries_V1_QuerySpendableRequest) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_QuerySpendableResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QuerySpendableResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "balance"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.balance) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.balance.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.balance, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QuerySpendableResponse, rhs: Em_Queries_V1_QuerySpendableResponse) -> Bool {
    if lhs.balance != rhs.balance {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_QueryMissedBlocksRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryMissedBlocksRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "cons_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.consAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.consAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.consAddress, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QueryMissedBlocksRequest, rhs: Em_Queries_V1_QueryMissedBlocksRequest) -> Bool {
    if lhs.consAddress != rhs.consAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_QueryMissedBlocksResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryMissedBlocksResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "missed_blocks_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._missedBlocksInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._missedBlocksInfo {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_QueryMissedBlocksResponse, rhs: Em_Queries_V1_QueryMissedBlocksResponse) -> Bool {
    if lhs._missedBlocksInfo != rhs._missedBlocksInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Em_Queries_V1_MissedBlocksInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MissedBlocksInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "cons_address"),
    2: .standard(proto: "missed_blocks_counter"),
    3: .standard(proto: "total_blocks_counter"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.consAddress) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.missedBlocksCounter) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.totalBlocksCounter) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.consAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.consAddress, fieldNumber: 1)
    }
    if self.missedBlocksCounter != 0 {
      try visitor.visitSingularInt64Field(value: self.missedBlocksCounter, fieldNumber: 2)
    }
    if self.totalBlocksCounter != 0 {
      try visitor.visitSingularInt64Field(value: self.totalBlocksCounter, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Em_Queries_V1_MissedBlocksInfo, rhs: Em_Queries_V1_MissedBlocksInfo) -> Bool {
    if lhs.consAddress != rhs.consAddress {return false}
    if lhs.missedBlocksCounter != rhs.missedBlocksCounter {return false}
    if lhs.totalBlocksCounter != rhs.totalBlocksCounter {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
