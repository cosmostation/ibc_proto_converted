// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/evidence/v1beta1/evidence.proto
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

/// Equivocation implements the Evidence interface and defines evidence of double
/// signing misbehavior.
struct Cosmos_Evidence_V1beta1_Equivocation {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// height is the equivocation height.
  var height: Int64 = 0

  /// time is the equivocation time.
  var time: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _time ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_time = newValue}
  }
  /// Returns true if `time` has been explicitly set.
  var hasTime: Bool {return self._time != nil}
  /// Clears the value of `time`. Subsequent reads from it will return its default value.
  mutating func clearTime() {self._time = nil}

  /// power is the equivocation validator power.
  var power: Int64 = 0

  /// consensus_address is the equivocation validator consensus address.
  var consensusAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _time: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Evidence_V1beta1_Equivocation: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.evidence.v1beta1"

extension Cosmos_Evidence_V1beta1_Equivocation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Equivocation"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "height"),
    2: .same(proto: "time"),
    3: .same(proto: "power"),
    4: .standard(proto: "consensus_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.height) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._time) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.power) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.consensusAddress) }()
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
      try visitor.visitSingularInt64Field(value: self.height, fieldNumber: 1)
    }
    try { if let v = self._time {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.power != 0 {
      try visitor.visitSingularInt64Field(value: self.power, fieldNumber: 3)
    }
    if !self.consensusAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.consensusAddress, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Evidence_V1beta1_Equivocation, rhs: Cosmos_Evidence_V1beta1_Equivocation) -> Bool {
    if lhs.height != rhs.height {return false}
    if lhs._time != rhs._time {return false}
    if lhs.power != rhs.power {return false}
    if lhs.consensusAddress != rhs.consensusAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
