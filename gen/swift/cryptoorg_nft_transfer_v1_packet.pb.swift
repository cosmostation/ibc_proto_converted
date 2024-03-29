// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cryptoorg/nft_transfer/v1/packet.proto
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

/// NonFungibleTokenPacketData defines a struct for the packet payload
/// See NonFungibleTokenPacketData spec:
/// https://github.com/cosmos/ibc/tree/master/spec/app/ics-721-nft-transfer#data-structures
struct Chainmain_NftTransfer_V1_NonFungibleTokenPacketData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// the class_id of tokens to be transferred
  var classID: String = String()

  /// the class_uri of tokens to be transferred
  var classUri: String = String()

  /// the non fungible tokens to be transferred (count should be equal to token_uris)
  var tokenIds: [String] = []

  /// the non fungible tokens's uri to be transferred (count should be equal to token ids)
  var tokenUris: [String] = []

  /// the sender address
  var sender: String = String()

  /// the recipient address on the destination chain
  var receiver: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Chainmain_NftTransfer_V1_NonFungibleTokenPacketData: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "chainmain.nft_transfer.v1"

extension Chainmain_NftTransfer_V1_NonFungibleTokenPacketData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".NonFungibleTokenPacketData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "class_id"),
    2: .standard(proto: "class_uri"),
    3: .standard(proto: "token_ids"),
    4: .standard(proto: "token_uris"),
    5: .same(proto: "sender"),
    6: .same(proto: "receiver"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.classUri) }()
      case 3: try { try decoder.decodeRepeatedStringField(value: &self.tokenIds) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.tokenUris) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 1)
    }
    if !self.classUri.isEmpty {
      try visitor.visitSingularStringField(value: self.classUri, fieldNumber: 2)
    }
    if !self.tokenIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenIds, fieldNumber: 3)
    }
    if !self.tokenUris.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenUris, fieldNumber: 4)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 5)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Chainmain_NftTransfer_V1_NonFungibleTokenPacketData, rhs: Chainmain_NftTransfer_V1_NonFungibleTokenPacketData) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.classUri != rhs.classUri {return false}
    if lhs.tokenIds != rhs.tokenIds {return false}
    if lhs.tokenUris != rhs.tokenUris {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
