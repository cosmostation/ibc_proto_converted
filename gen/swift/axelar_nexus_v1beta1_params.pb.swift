// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: axelar/nexus/v1beta1/params.proto
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
struct Axelar_Nexus_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainActivationThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _chainActivationThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_chainActivationThreshold = newValue}
  }
  /// Returns true if `chainActivationThreshold` has been explicitly set.
  var hasChainActivationThreshold: Bool {return self._chainActivationThreshold != nil}
  /// Clears the value of `chainActivationThreshold`. Subsequent reads from it will return its default value.
  mutating func clearChainActivationThreshold() {self._chainActivationThreshold = nil}

  var chainMaintainerMissingVoteThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _chainMaintainerMissingVoteThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_chainMaintainerMissingVoteThreshold = newValue}
  }
  /// Returns true if `chainMaintainerMissingVoteThreshold` has been explicitly set.
  var hasChainMaintainerMissingVoteThreshold: Bool {return self._chainMaintainerMissingVoteThreshold != nil}
  /// Clears the value of `chainMaintainerMissingVoteThreshold`. Subsequent reads from it will return its default value.
  mutating func clearChainMaintainerMissingVoteThreshold() {self._chainMaintainerMissingVoteThreshold = nil}

  var chainMaintainerIncorrectVoteThreshold: Axelar_Utils_V1beta1_Threshold {
    get {return _chainMaintainerIncorrectVoteThreshold ?? Axelar_Utils_V1beta1_Threshold()}
    set {_chainMaintainerIncorrectVoteThreshold = newValue}
  }
  /// Returns true if `chainMaintainerIncorrectVoteThreshold` has been explicitly set.
  var hasChainMaintainerIncorrectVoteThreshold: Bool {return self._chainMaintainerIncorrectVoteThreshold != nil}
  /// Clears the value of `chainMaintainerIncorrectVoteThreshold`. Subsequent reads from it will return its default value.
  mutating func clearChainMaintainerIncorrectVoteThreshold() {self._chainMaintainerIncorrectVoteThreshold = nil}

  var chainMaintainerCheckWindow: Int32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _chainActivationThreshold: Axelar_Utils_V1beta1_Threshold? = nil
  fileprivate var _chainMaintainerMissingVoteThreshold: Axelar_Utils_V1beta1_Threshold? = nil
  fileprivate var _chainMaintainerIncorrectVoteThreshold: Axelar_Utils_V1beta1_Threshold? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Axelar_Nexus_V1beta1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "axelar.nexus.v1beta1"

extension Axelar_Nexus_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_activation_threshold"),
    2: .standard(proto: "chain_maintainer_missing_vote_threshold"),
    3: .standard(proto: "chain_maintainer_incorrect_vote_threshold"),
    4: .standard(proto: "chain_maintainer_check_window"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._chainActivationThreshold) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._chainMaintainerMissingVoteThreshold) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._chainMaintainerIncorrectVoteThreshold) }()
      case 4: try { try decoder.decodeSingularInt32Field(value: &self.chainMaintainerCheckWindow) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._chainActivationThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._chainMaintainerMissingVoteThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._chainMaintainerIncorrectVoteThreshold {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if self.chainMaintainerCheckWindow != 0 {
      try visitor.visitSingularInt32Field(value: self.chainMaintainerCheckWindow, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Axelar_Nexus_V1beta1_Params, rhs: Axelar_Nexus_V1beta1_Params) -> Bool {
    if lhs._chainActivationThreshold != rhs._chainActivationThreshold {return false}
    if lhs._chainMaintainerMissingVoteThreshold != rhs._chainMaintainerMissingVoteThreshold {return false}
    if lhs._chainMaintainerIncorrectVoteThreshold != rhs._chainMaintainerIncorrectVoteThreshold {return false}
    if lhs.chainMaintainerCheckWindow != rhs.chainMaintainerCheckWindow {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}