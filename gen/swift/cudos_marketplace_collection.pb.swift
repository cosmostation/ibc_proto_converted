// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cudos/marketplace/collection.proto
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

/// Collection listed for sale in the marketplace
struct Cudoventures_Cudosnode_Marketplace_Collection {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var id: UInt64 = 0

  var denomID: String = String()

  var mintRoyalties: [Cudoventures_Cudosnode_Marketplace_Royalty] = []

  var resaleRoyalties: [Cudoventures_Cudosnode_Marketplace_Royalty] = []

  var verified: Bool = false

  var owner: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cudoventures_Cudosnode_Marketplace_Collection: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cudoventures.cudosnode.marketplace"

extension Cudoventures_Cudosnode_Marketplace_Collection: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Collection"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "denomId"),
    3: .same(proto: "mintRoyalties"),
    4: .same(proto: "resaleRoyalties"),
    5: .same(proto: "verified"),
    6: .same(proto: "owner"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.denomID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.mintRoyalties) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.resaleRoyalties) }()
      case 5: try { try decoder.decodeSingularBoolField(value: &self.verified) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 1)
    }
    if !self.denomID.isEmpty {
      try visitor.visitSingularStringField(value: self.denomID, fieldNumber: 2)
    }
    if !self.mintRoyalties.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.mintRoyalties, fieldNumber: 3)
    }
    if !self.resaleRoyalties.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.resaleRoyalties, fieldNumber: 4)
    }
    if self.verified != false {
      try visitor.visitSingularBoolField(value: self.verified, fieldNumber: 5)
    }
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cudoventures_Cudosnode_Marketplace_Collection, rhs: Cudoventures_Cudosnode_Marketplace_Collection) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.denomID != rhs.denomID {return false}
    if lhs.mintRoyalties != rhs.mintRoyalties {return false}
    if lhs.resaleRoyalties != rhs.resaleRoyalties {return false}
    if lhs.verified != rhs.verified {return false}
    if lhs.owner != rhs.owner {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}