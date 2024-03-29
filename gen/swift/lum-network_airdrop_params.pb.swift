// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: lum-network/airdrop/params.proto
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

struct Lum_Network_Airdrop_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var airdropStartTime: SwiftProtobuf.Google_Protobuf_Timestamp {
    get {return _airdropStartTime ?? SwiftProtobuf.Google_Protobuf_Timestamp()}
    set {_airdropStartTime = newValue}
  }
  /// Returns true if `airdropStartTime` has been explicitly set.
  var hasAirdropStartTime: Bool {return self._airdropStartTime != nil}
  /// Clears the value of `airdropStartTime`. Subsequent reads from it will return its default value.
  mutating func clearAirdropStartTime() {self._airdropStartTime = nil}

  var durationUntilDecay: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _durationUntilDecay ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_durationUntilDecay = newValue}
  }
  /// Returns true if `durationUntilDecay` has been explicitly set.
  var hasDurationUntilDecay: Bool {return self._durationUntilDecay != nil}
  /// Clears the value of `durationUntilDecay`. Subsequent reads from it will return its default value.
  mutating func clearDurationUntilDecay() {self._durationUntilDecay = nil}

  var durationOfDecay: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _durationOfDecay ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_durationOfDecay = newValue}
  }
  /// Returns true if `durationOfDecay` has been explicitly set.
  var hasDurationOfDecay: Bool {return self._durationOfDecay != nil}
  /// Clears the value of `durationOfDecay`. Subsequent reads from it will return its default value.
  mutating func clearDurationOfDecay() {self._durationOfDecay = nil}

  var claimDenom: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _airdropStartTime: SwiftProtobuf.Google_Protobuf_Timestamp? = nil
  fileprivate var _durationUntilDecay: SwiftProtobuf.Google_Protobuf_Duration? = nil
  fileprivate var _durationOfDecay: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Lum_Network_Airdrop_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "lum.network.airdrop"

extension Lum_Network_Airdrop_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "airdrop_start_time"),
    2: .standard(proto: "duration_until_decay"),
    3: .standard(proto: "duration_of_decay"),
    4: .standard(proto: "claim_denom"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._airdropStartTime) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._durationUntilDecay) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._durationOfDecay) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.claimDenom) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._airdropStartTime {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try { if let v = self._durationUntilDecay {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._durationOfDecay {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.claimDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.claimDenom, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Lum_Network_Airdrop_Params, rhs: Lum_Network_Airdrop_Params) -> Bool {
    if lhs._airdropStartTime != rhs._airdropStartTime {return false}
    if lhs._durationUntilDecay != rhs._durationUntilDecay {return false}
    if lhs._durationOfDecay != rhs._durationOfDecay {return false}
    if lhs.claimDenom != rhs.claimDenom {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
