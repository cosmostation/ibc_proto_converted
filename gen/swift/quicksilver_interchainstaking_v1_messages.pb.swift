// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: quicksilver/interchainstaking/v1/messages.proto
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

/// MsgRequestRedemption represents a message type to request a burn of qAssets
/// for native assets.
struct Quicksilver_Interchainstaking_V1_MsgRequestRedemption {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var value: Cosmos_Base_V1beta1_Coin {
    get {return _value ?? Cosmos_Base_V1beta1_Coin()}
    set {_value = newValue}
  }
  /// Returns true if `value` has been explicitly set.
  var hasValue: Bool {return self._value != nil}
  /// Clears the value of `value`. Subsequent reads from it will return its default value.
  mutating func clearValue() {self._value = nil}

  var destinationAddress: String = String()

  var fromAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _value: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgSignalIntent represents a message type for signalling voting intent for
/// one or more validators.
struct Quicksilver_Interchainstaking_V1_MsgSignalIntent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainID: String = String()

  var intents: String = String()

  var fromAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRequestRedemptionResponse defines the MsgRequestRedemption response type.
struct Quicksilver_Interchainstaking_V1_MsgRequestRedemptionResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSignalIntentResponse defines the MsgSignalIntent response type.
struct Quicksilver_Interchainstaking_V1_MsgSignalIntentResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Quicksilver_Interchainstaking_V1_MsgRequestRedemption: @unchecked Sendable {}
extension Quicksilver_Interchainstaking_V1_MsgSignalIntent: @unchecked Sendable {}
extension Quicksilver_Interchainstaking_V1_MsgRequestRedemptionResponse: @unchecked Sendable {}
extension Quicksilver_Interchainstaking_V1_MsgSignalIntentResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "quicksilver.interchainstaking.v1"

extension Quicksilver_Interchainstaking_V1_MsgRequestRedemption: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRequestRedemption"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "value"),
    2: .standard(proto: "destination_address"),
    3: .standard(proto: "from_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._value) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.destinationAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.fromAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._value {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.destinationAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.destinationAddress, fieldNumber: 2)
    }
    if !self.fromAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.fromAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Interchainstaking_V1_MsgRequestRedemption, rhs: Quicksilver_Interchainstaking_V1_MsgRequestRedemption) -> Bool {
    if lhs._value != rhs._value {return false}
    if lhs.destinationAddress != rhs.destinationAddress {return false}
    if lhs.fromAddress != rhs.fromAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quicksilver_Interchainstaking_V1_MsgSignalIntent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSignalIntent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .same(proto: "intents"),
    3: .standard(proto: "from_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.intents) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.fromAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 1)
    }
    if !self.intents.isEmpty {
      try visitor.visitSingularStringField(value: self.intents, fieldNumber: 2)
    }
    if !self.fromAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.fromAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Interchainstaking_V1_MsgSignalIntent, rhs: Quicksilver_Interchainstaking_V1_MsgSignalIntent) -> Bool {
    if lhs.chainID != rhs.chainID {return false}
    if lhs.intents != rhs.intents {return false}
    if lhs.fromAddress != rhs.fromAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quicksilver_Interchainstaking_V1_MsgRequestRedemptionResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRequestRedemptionResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Interchainstaking_V1_MsgRequestRedemptionResponse, rhs: Quicksilver_Interchainstaking_V1_MsgRequestRedemptionResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quicksilver_Interchainstaking_V1_MsgSignalIntentResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSignalIntentResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Interchainstaking_V1_MsgSignalIntentResponse, rhs: Quicksilver_Interchainstaking_V1_MsgSignalIntentResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}