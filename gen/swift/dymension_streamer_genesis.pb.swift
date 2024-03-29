// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: dymension/streamer/genesis.proto
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

/// GenesisState defines the streamer module's various parameters when first
/// initialized
struct Dymensionxyz_Dymension_Streamer_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params are all the parameters of the module
  var params: Dymensionxyz_Dymension_Streamer_Params {
    get {return _params ?? Dymensionxyz_Dymension_Streamer_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// streams are all streams that should exist at genesis
  var streams: [Dymensionxyz_Dymension_Streamer_Stream] = []

  /// last_stream_id is what the stream number will increment from when creating
  /// the next stream after genesis
  var lastStreamID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Dymensionxyz_Dymension_Streamer_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Dymensionxyz_Dymension_Streamer_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "dymensionxyz.dymension.streamer"

extension Dymensionxyz_Dymension_Streamer_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .same(proto: "streams"),
    3: .standard(proto: "last_stream_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.streams) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.lastStreamID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.streams.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.streams, fieldNumber: 2)
    }
    if self.lastStreamID != 0 {
      try visitor.visitSingularUInt64Field(value: self.lastStreamID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Dymensionxyz_Dymension_Streamer_GenesisState, rhs: Dymensionxyz_Dymension_Streamer_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.streams != rhs.streams {return false}
    if lhs.lastStreamID != rhs.lastStreamID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
