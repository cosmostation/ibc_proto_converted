// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: quicksilver/airdrop/v1/messages.proto
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

struct Quicksilver_Airdrop_V1_MsgClaim {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chainID: String = String()

  var action: Int64 = 0

  var address: String = String()

  var proofs: [Quicksilver_Claimsmanager_V1_Proof] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Quicksilver_Airdrop_V1_MsgClaimResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Quicksilver_Airdrop_V1_MsgClaim: @unchecked Sendable {}
extension Quicksilver_Airdrop_V1_MsgClaimResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "quicksilver.airdrop.v1"

extension Quicksilver_Airdrop_V1_MsgClaim: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaim"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "chain_id"),
    2: .same(proto: "action"),
    3: .same(proto: "address"),
    4: .same(proto: "proofs"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chainID) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.action) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.proofs) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.chainID.isEmpty {
      try visitor.visitSingularStringField(value: self.chainID, fieldNumber: 1)
    }
    if self.action != 0 {
      try visitor.visitSingularInt64Field(value: self.action, fieldNumber: 2)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 3)
    }
    if !self.proofs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.proofs, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Airdrop_V1_MsgClaim, rhs: Quicksilver_Airdrop_V1_MsgClaim) -> Bool {
    if lhs.chainID != rhs.chainID {return false}
    if lhs.action != rhs.action {return false}
    if lhs.address != rhs.address {return false}
    if lhs.proofs != rhs.proofs {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Quicksilver_Airdrop_V1_MsgClaimResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaimResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Quicksilver_Airdrop_V1_MsgClaimResponse, rhs: Quicksilver_Airdrop_V1_MsgClaimResponse) -> Bool {
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
