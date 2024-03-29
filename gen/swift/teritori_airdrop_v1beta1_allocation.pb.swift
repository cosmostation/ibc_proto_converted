// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: teritori/airdrop/v1beta1/allocation.proto
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

/// AirdropAllocation defines the user's airdrop allocation.
struct Teritori_Airdrop_V1beta1_AirdropAllocation {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var chain: String = String()

  var address: String = String()

  var amount: String = String()

  var claimedAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Teritori_Airdrop_V1beta1_AirdropAllocation: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "teritori.airdrop.v1beta1"

extension Teritori_Airdrop_V1beta1_AirdropAllocation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AirdropAllocation"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "chain"),
    2: .same(proto: "address"),
    3: .same(proto: "amount"),
    4: .standard(proto: "claimed_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.chain) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.claimedAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.chain.isEmpty {
      try visitor.visitSingularStringField(value: self.chain, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if !self.claimedAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.claimedAmount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Teritori_Airdrop_V1beta1_AirdropAllocation, rhs: Teritori_Airdrop_V1beta1_AirdropAllocation) -> Bool {
    if lhs.chain != rhs.chain {return false}
    if lhs.address != rhs.address {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.claimedAmount != rhs.claimedAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
