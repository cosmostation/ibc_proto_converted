// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/msg_tss_keysign_fail.proto
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

struct Types_MsgTssKeysignFail {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: String = String()

  var height: Int64 = 0

  var blame: Types_Blame {
    get {return _blame ?? Types_Blame()}
    set {_blame = newValue}
  }
  /// Returns true if `blame` has been explicitly set.
  var hasBlame: Bool {return self._blame != nil}
  /// Clears the value of `blame`. Subsequent reads from it will return its default value.
  mutating func clearBlame() {self._blame = nil}

  var memo: String = String()

  var coins: [Common_Coin] = []

  var pubKey: String = String()

  var signer: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _blame: Types_Blame? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_MsgTssKeysignFail: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_MsgTssKeysignFail: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgTssKeysignFail"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "height"),
    3: .same(proto: "blame"),
    4: .same(proto: "memo"),
    5: .same(proto: "coins"),
    6: .standard(proto: "pub_key"),
    7: .same(proto: "signer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.height) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._blame) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.memo) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.coins) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.pubKey) }()
      case 7: try { try decoder.decodeSingularBytesField(value: &self.signer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if self.height != 0 {
      try visitor.visitSingularInt64Field(value: self.height, fieldNumber: 2)
    }
    try { if let v = self._blame {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.memo.isEmpty {
      try visitor.visitSingularStringField(value: self.memo, fieldNumber: 4)
    }
    if !self.coins.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.coins, fieldNumber: 5)
    }
    if !self.pubKey.isEmpty {
      try visitor.visitSingularStringField(value: self.pubKey, fieldNumber: 6)
    }
    if !self.signer.isEmpty {
      try visitor.visitSingularBytesField(value: self.signer, fieldNumber: 7)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_MsgTssKeysignFail, rhs: Types_MsgTssKeysignFail) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.height != rhs.height {return false}
    if lhs._blame != rhs._blame {return false}
    if lhs.memo != rhs.memo {return false}
    if lhs.coins != rhs.coins {return false}
    if lhs.pubKey != rhs.pubKey {return false}
    if lhs.signer != rhs.signer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
