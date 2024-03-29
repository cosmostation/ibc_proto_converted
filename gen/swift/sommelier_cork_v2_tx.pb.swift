// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: sommelier/cork/v2/tx.proto
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

/// MsgScheduleCorkRequest - sdk.Msg for scheduling a cork request for on or after a specific block height
struct Cork_V2_MsgScheduleCorkRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the scheduled cork
  var cork: Cork_V2_Cork {
    get {return _cork ?? Cork_V2_Cork()}
    set {_cork = newValue}
  }
  /// Returns true if `cork` has been explicitly set.
  var hasCork: Bool {return self._cork != nil}
  /// Clears the value of `cork`. Subsequent reads from it will return its default value.
  mutating func clearCork() {self._cork = nil}

  /// the block height that must be reached
  var blockHeight: UInt64 = 0

  /// signer account address
  var signer: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _cork: Cork_V2_Cork? = nil
}

struct Cork_V2_MsgScheduleCorkResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// cork ID
  var id: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cork_V2_MsgScheduleCorkRequest: @unchecked Sendable {}
extension Cork_V2_MsgScheduleCorkResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cork.v2"

extension Cork_V2_MsgScheduleCorkRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgScheduleCorkRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "cork"),
    2: .standard(proto: "block_height"),
    3: .same(proto: "signer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._cork) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.blockHeight) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.signer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._cork {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.blockHeight != 0 {
      try visitor.visitSingularUInt64Field(value: self.blockHeight, fieldNumber: 2)
    }
    if !self.signer.isEmpty {
      try visitor.visitSingularStringField(value: self.signer, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V2_MsgScheduleCorkRequest, rhs: Cork_V2_MsgScheduleCorkRequest) -> Bool {
    if lhs._cork != rhs._cork {return false}
    if lhs.blockHeight != rhs.blockHeight {return false}
    if lhs.signer != rhs.signer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Cork_V2_MsgScheduleCorkResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgScheduleCorkResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cork_V2_MsgScheduleCorkResponse, rhs: Cork_V2_MsgScheduleCorkResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
