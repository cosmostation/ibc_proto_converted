// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stride/stakeibc/validator.proto
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

struct Stride_Stakeibc_ValidatorExchangeRate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var internalTokensToSharesRate: String = String()

  var epochNumber: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Stride_Stakeibc_Validator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var address: String = String()

  var delegationAmt: String = String()

  var weight: UInt64 = 0

  var internalExchangeRate: Stride_Stakeibc_ValidatorExchangeRate {
    get {return _internalExchangeRate ?? Stride_Stakeibc_ValidatorExchangeRate()}
    set {_internalExchangeRate = newValue}
  }
  /// Returns true if `internalExchangeRate` has been explicitly set.
  var hasInternalExchangeRate: Bool {return self._internalExchangeRate != nil}
  /// Clears the value of `internalExchangeRate`. Subsequent reads from it will return its default value.
  mutating func clearInternalExchangeRate() {self._internalExchangeRate = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _internalExchangeRate: Stride_Stakeibc_ValidatorExchangeRate? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stride_Stakeibc_ValidatorExchangeRate: @unchecked Sendable {}
extension Stride_Stakeibc_Validator: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stride.stakeibc"

extension Stride_Stakeibc_ValidatorExchangeRate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ValidatorExchangeRate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "internal_tokens_to_shares_rate"),
    2: .standard(proto: "epoch_number"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.internalTokensToSharesRate) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.epochNumber) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.internalTokensToSharesRate.isEmpty {
      try visitor.visitSingularStringField(value: self.internalTokensToSharesRate, fieldNumber: 1)
    }
    if self.epochNumber != 0 {
      try visitor.visitSingularUInt64Field(value: self.epochNumber, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stride_Stakeibc_ValidatorExchangeRate, rhs: Stride_Stakeibc_ValidatorExchangeRate) -> Bool {
    if lhs.internalTokensToSharesRate != rhs.internalTokensToSharesRate {return false}
    if lhs.epochNumber != rhs.epochNumber {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stride_Stakeibc_Validator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Validator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "address"),
    5: .standard(proto: "delegation_amt"),
    6: .same(proto: "weight"),
    7: .standard(proto: "internal_exchange_rate"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.delegationAmt) }()
      case 6: try { try decoder.decodeSingularUInt64Field(value: &self.weight) }()
      case 7: try { try decoder.decodeSingularMessageField(value: &self._internalExchangeRate) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    if !self.delegationAmt.isEmpty {
      try visitor.visitSingularStringField(value: self.delegationAmt, fieldNumber: 5)
    }
    if self.weight != 0 {
      try visitor.visitSingularUInt64Field(value: self.weight, fieldNumber: 6)
    }
    try { if let v = self._internalExchangeRate {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stride_Stakeibc_Validator, rhs: Stride_Stakeibc_Validator) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.address != rhs.address {return false}
    if lhs.delegationAmt != rhs.delegationAmt {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs._internalExchangeRate != rhs._internalExchangeRate {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
