// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: akash/base/v1beta3/resourceunits.proto
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

/// ResourceUnits describes all available resources types for deployment/node etc
/// if field is nil resource is not present in the given data-structure
struct Akash_Base_V1beta3_ResourceUnits {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var cpu: Akash_Base_V1beta3_CPU {
    get {return _cpu ?? Akash_Base_V1beta3_CPU()}
    set {_cpu = newValue}
  }
  /// Returns true if `cpu` has been explicitly set.
  var hasCpu: Bool {return self._cpu != nil}
  /// Clears the value of `cpu`. Subsequent reads from it will return its default value.
  mutating func clearCpu() {self._cpu = nil}

  var memory: Akash_Base_V1beta3_Memory {
    get {return _memory ?? Akash_Base_V1beta3_Memory()}
    set {_memory = newValue}
  }
  /// Returns true if `memory` has been explicitly set.
  var hasMemory: Bool {return self._memory != nil}
  /// Clears the value of `memory`. Subsequent reads from it will return its default value.
  mutating func clearMemory() {self._memory = nil}

  var storage: [Akash_Base_V1beta3_Storage] = []

  var gpu: Akash_Base_V1beta3_GPU {
    get {return _gpu ?? Akash_Base_V1beta3_GPU()}
    set {_gpu = newValue}
  }
  /// Returns true if `gpu` has been explicitly set.
  var hasGpu: Bool {return self._gpu != nil}
  /// Clears the value of `gpu`. Subsequent reads from it will return its default value.
  mutating func clearGpu() {self._gpu = nil}

  var endpoints: [Akash_Base_V1beta3_Endpoint] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cpu: Akash_Base_V1beta3_CPU? = nil
  fileprivate var _memory: Akash_Base_V1beta3_Memory? = nil
  fileprivate var _gpu: Akash_Base_V1beta3_GPU? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Akash_Base_V1beta3_ResourceUnits: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "akash.base.v1beta3"

extension Akash_Base_V1beta3_ResourceUnits: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ResourceUnits"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "cpu"),
    2: .same(proto: "memory"),
    3: .same(proto: "storage"),
    4: .same(proto: "gpu"),
    5: .same(proto: "endpoints"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._cpu) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._memory) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.storage) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._gpu) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.endpoints) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._cpu {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._memory {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if !self.storage.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.storage, fieldNumber: 3)
    }
    try { if let v = self._gpu {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    if !self.endpoints.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.endpoints, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Akash_Base_V1beta3_ResourceUnits, rhs: Akash_Base_V1beta3_ResourceUnits) -> Bool {
    if lhs._cpu != rhs._cpu {return false}
    if lhs._memory != rhs._memory {return false}
    if lhs.storage != rhs.storage {return false}
    if lhs._gpu != rhs._gpu {return false}
    if lhs.endpoints != rhs.endpoints {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
