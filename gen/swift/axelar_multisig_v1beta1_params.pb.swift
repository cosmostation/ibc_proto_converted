// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/multisig/v1beta1/params.proto
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

/// Params represent the genesis parameters for the module
struct Axelar_Multisig_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var keygenThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _keygenThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_keygenThreshold = newValue}
  }
  /// Returns true if `keygenThreshold` has been explicitly set.
  var hasKeygenThreshold: Bool {return self._keygenThreshold != nil}
  /// Clears the value of `keygenThreshold`. Subsequent reads from it will return its default value.
  mutating func clearKeygenThreshold() {self._keygenThreshold = nil}

  var signingThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _signingThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_signingThreshold = newValue}
  }
  /// Returns true if `signingThreshold` has been explicitly set.
  var hasSigningThreshold: Bool {return self._signingThreshold != nil}
  /// Clears the value of `signingThreshold`. Subsequent reads from it will return its default value.
  mutating func clearSigningThreshold() {self._signingThreshold = nil}

  var keygenTimeout: Int64 = 0

  var keygenGracePeriod: Int64 = 0

  var signingTimeout: Int64 = 0

  var signingGracePeriod: Int64 = 0

  var activeEpochCount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _keygenThreshold: Axelar_Utils_V1beta1_Threshold? = nil
  fileprivate var _signingThreshold: Axelar_Utils_V1beta1_Threshold? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Multisig_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.multisig.v1beta1"

extension Axelar_Multisig_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "keygen_threshold"),
    2: .standard(proto: "signing_threshold"),
    3: .standard(proto: "keygen_timeout"),
    4: .standard(proto: "keygen_grace_period"),
    5: .standard(proto: "signing_timeout"),
    6: .standard(proto: "signing_grace_period"),
    7: .standard(proto: "active_epoch_count"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._keygenThreshold) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._signingThreshold) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.keygenTimeout) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.keygenGracePeriod) }()
      case 5: try { try decoder.decodeSingularInt64Field(value: &self.signingTimeout) }()
      case 6: try { try decoder.decodeSingularInt64Field(value: &self.signingGracePeriod) }()
      case 7: try { try decoder.decodeSingularUInt64Field(value: &self.activeEpochCount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._keygenThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._signingThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    if self.keygenTimeout != 0 {
      try visitor.visitSingularInt64Field(value: self.keygenTimeout, fieldNumber: 3)
    }
    if self.keygenGracePeriod != 0 {
      try visitor.visitSingularInt64Field(value: self.keygenGracePeriod, fieldNumber: 4)
    }
    if self.signingTimeout != 0 {
      try visitor.visitSingularInt64Field(value: self.signingTimeout, fieldNumber: 5)
    }
    if self.signingGracePeriod != 0 {
      try visitor.visitSingularInt64Field(value: self.signingGracePeriod, fieldNumber: 6)
    }
    if self.activeEpochCount != 0 {
      try visitor.visitSingularUInt64Field(value: self.activeEpochCount, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Multisig_V1beta1_Params, rhs: Axelar_Multisig_V1beta1_Params) -> Bool {
    if lhs._keygenThreshold != rhs._keygenThreshold {return false}
    if lhs._signingThreshold != rhs._signingThreshold {return false}
    if lhs.keygenTimeout != rhs.keygenTimeout {return false}
    if lhs.keygenGracePeriod != rhs.keygenGracePeriod {return false}
    if lhs.signingTimeout != rhs.signingTimeout {return false}
    if lhs.signingGracePeriod != rhs.signingGracePeriod {return false}
    if lhs.activeEpochCount != rhs.activeEpochCount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
