// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/base/v1beta2/resource.proto
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

/// CPU stores resource units and cpu config attributes
struct Akash_Base_V1beta2_CPU {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var units: Akash_Base_V1beta2_ResourceValue {
    get {return _units ?? Akash_Base_V1beta2_ResourceValue()}
    set {_units = newValue}
  }
  /// Returns true if `units` has been explicitly set.
  var hasUnits: Bool {return self._units != nil}
  /// Clears the value of `units`. Subsequent reads from it will return its default value.
  mutating func clearUnits() {self._units = nil}

  var attributes: [Akash_Base_V1beta2_Attribute] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _units: Akash_Base_V1beta2_ResourceValue? = nil
}

/// Memory stores resource quantity and memory attributes
struct Akash_Base_V1beta2_Memory {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var quantity: Akash_Base_V1beta2_ResourceValue {
    get {return _quantity ?? Akash_Base_V1beta2_ResourceValue()}
    set {_quantity = newValue}
  }
  /// Returns true if `quantity` has been explicitly set.
  var hasQuantity: Bool {return self._quantity != nil}
  /// Clears the value of `quantity`. Subsequent reads from it will return its default value.
  mutating func clearQuantity() {self._quantity = nil}

  var attributes: [Akash_Base_V1beta2_Attribute] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _quantity: Akash_Base_V1beta2_ResourceValue? = nil
}

/// Storage stores resource quantity and storage attributes
struct Akash_Base_V1beta2_Storage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var quantity: Akash_Base_V1beta2_ResourceValue {
    get {return _quantity ?? Akash_Base_V1beta2_ResourceValue()}
    set {_quantity = newValue}
  }
  /// Returns true if `quantity` has been explicitly set.
  var hasQuantity: Bool {return self._quantity != nil}
  /// Clears the value of `quantity`. Subsequent reads from it will return its default value.
  mutating func clearQuantity() {self._quantity = nil}

  var attributes: [Akash_Base_V1beta2_Attribute] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _quantity: Akash_Base_V1beta2_ResourceValue? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Base_V1beta2_CPU: @unchecked Sendable {}
extension Akash_Base_V1beta2_Memory: @unchecked Sendable {}
extension Akash_Base_V1beta2_Storage: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.base.v1beta2"

extension Akash_Base_V1beta2_CPU: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CPU"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "units"),
    2: .same(proto: "attributes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._units) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.attributes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._units {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.attributes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.attributes, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Base_V1beta2_CPU, rhs: Akash_Base_V1beta2_CPU) -> Bool {
    if lhs._units != rhs._units {return false}
    if lhs.attributes != rhs.attributes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Base_V1beta2_Memory: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Memory"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "quantity"),
    2: .same(proto: "attributes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._quantity) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.attributes) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._quantity {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.attributes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.attributes, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Base_V1beta2_Memory, rhs: Akash_Base_V1beta2_Memory) -> Bool {
    if lhs._quantity != rhs._quantity {return false}
    if lhs.attributes != rhs.attributes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Akash_Base_V1beta2_Storage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Storage"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "quantity"),
    3: .same(proto: "attributes"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._quantity) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.attributes) }()
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
    try { if let v = self._quantity {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.attributes.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.attributes, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Base_V1beta2_Storage, rhs: Akash_Base_V1beta2_Storage) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs._quantity != rhs._quantity {return false}
    if lhs.attributes != rhs.attributes {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}