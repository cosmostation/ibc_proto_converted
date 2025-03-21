// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: thorchain/v1/x/thorchain/types/msg_errata.proto
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

struct Types_MsgErrataTx {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var txID: String = String()

  var chain: String = String()

  var signer: Data = Data()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Types_MsgErrataTx: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "types"

extension Types_MsgErrataTx: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgErrataTx"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "tx_id"),
    2: .same(proto: "chain"),
    3: .same(proto: "signer"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.txID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.chain) }()
      case 3: try { try decoder.decodeSingularBytesField(value: &self.signer) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.txID.isEmpty {
      try visitor.visitSingularStringField(value: self.txID, fieldNumber: 1)
    }
    if !self.chain.isEmpty {
      try visitor.visitSingularStringField(value: self.chain, fieldNumber: 2)
    }
    if !self.signer.isEmpty {
      try visitor.visitSingularBytesField(value: self.signer, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Types_MsgErrataTx, rhs: Types_MsgErrataTx) -> Bool {
    if lhs.txID != rhs.txID {return false}
    if lhs.chain != rhs.chain {return false}
    if lhs.signer != rhs.signer {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
