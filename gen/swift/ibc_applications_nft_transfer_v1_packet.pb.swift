// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/applications/nft_transfer/v1/packet.proto
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
/// https://github.com/cosmos/ibc/tree/main/spec/app/ics-721-nft-transfer
struct Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// collection id == extension struct tag
  var classID: String = String()

  /// collection url
  var classUri: String = String()

  /// collection data
  var classData: String = String()

  /// nft token ids
  var tokenIds: [String] = []

  /// nft token uris
  var tokenUris: [String] = []

  /// nft token data array
  var tokenData: [String] = []

  /// sender of nft
  var sender: String = String()

  /// receiver of nft
  var receiver: String = String()

  /// optional memo field for future use
  var memo: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// NonFungibleTokenPacketDataWasm to support wams nft transfer.
struct Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketDataWasm {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// collection id == extension struct tag
  var classID: String = String()

  /// collection url
  var classUri: String = String()

  /// collection data
  var classData: String = String()

  /// nft token ids
  var tokenIds: [String] = []

  /// nft token uris
  var tokenUris: [String] = []

  /// nft token data array
  var tokenData: [String] = []

  /// sender of nft
  var sender: String = String()

  /// receiver of nft
  var receiver: String = String()

  /// optional memo field for future use
  var memo: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketData: @unchecked Sendable {}
extension Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketDataWasm: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.applications.nft_transfer.v1"

extension Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".NonFungibleTokenPacketData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "class_id"),
    2: .standard(proto: "class_uri"),
    3: .standard(proto: "class_data"),
    4: .standard(proto: "token_ids"),
    5: .standard(proto: "token_uris"),
    6: .standard(proto: "token_data"),
    7: .same(proto: "sender"),
    8: .same(proto: "receiver"),
    9: .same(proto: "memo"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.classUri) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.classData) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.tokenIds) }()
      case 5: try { try decoder.decodeRepeatedStringField(value: &self.tokenUris) }()
      case 6: try { try decoder.decodeRepeatedStringField(value: &self.tokenData) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.memo) }()
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
    if !self.classData.isEmpty {
      try visitor.visitSingularStringField(value: self.classData, fieldNumber: 3)
    }
    if !self.tokenIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenIds, fieldNumber: 4)
    }
    if !self.tokenUris.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenUris, fieldNumber: 5)
    }
    if !self.tokenData.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenData, fieldNumber: 6)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 7)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 8)
    }
    if !self.memo.isEmpty {
      try visitor.visitSingularStringField(value: self.memo, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketData, rhs: Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketData) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.classUri != rhs.classUri {return false}
    if lhs.classData != rhs.classData {return false}
    if lhs.tokenIds != rhs.tokenIds {return false}
    if lhs.tokenUris != rhs.tokenUris {return false}
    if lhs.tokenData != rhs.tokenData {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.memo != rhs.memo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketDataWasm: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".NonFungibleTokenPacketDataWasm"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "class_id"),
    2: .standard(proto: "class_uri"),
    3: .standard(proto: "class_data"),
    4: .standard(proto: "token_ids"),
    5: .standard(proto: "token_uris"),
    6: .standard(proto: "token_data"),
    7: .same(proto: "sender"),
    8: .same(proto: "receiver"),
    9: .same(proto: "memo"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.classUri) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.classData) }()
      case 4: try { try decoder.decodeRepeatedStringField(value: &self.tokenIds) }()
      case 5: try { try decoder.decodeRepeatedStringField(value: &self.tokenUris) }()
      case 6: try { try decoder.decodeRepeatedStringField(value: &self.tokenData) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      case 9: try { try decoder.decodeSingularStringField(value: &self.memo) }()
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
    if !self.classData.isEmpty {
      try visitor.visitSingularStringField(value: self.classData, fieldNumber: 3)
    }
    if !self.tokenIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenIds, fieldNumber: 4)
    }
    if !self.tokenUris.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenUris, fieldNumber: 5)
    }
    if !self.tokenData.isEmpty {
      try visitor.visitRepeatedStringField(value: self.tokenData, fieldNumber: 6)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 7)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 8)
    }
    if !self.memo.isEmpty {
      try visitor.visitSingularStringField(value: self.memo, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketDataWasm, rhs: Ibc_Applications_NftTransfer_V1_NonFungibleTokenPacketDataWasm) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.classUri != rhs.classUri {return false}
    if lhs.classData != rhs.classData {return false}
    if lhs.tokenIds != rhs.tokenIds {return false}
    if lhs.tokenUris != rhs.tokenUris {return false}
    if lhs.tokenData != rhs.tokenData {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.memo != rhs.memo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
