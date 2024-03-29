// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: coreum/nft/v1beta1/tx.proto
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

/// MsgSend represents a message to send a nft from one account to another account.
struct Coreum_Nft_V1beta1_MsgSend {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// class_id defines the unique identifier of the nft classification, similar to the contract address of ERC721
  var classID: String = String()

  /// id defines the unique identification of nft
  var id: String = String()

  /// sender is the address of the owner of nft
  var sender: String = String()

  /// receiver is the receiver address of nft
  var receiver: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSendResponse defines the Msg/Send response type.
struct Coreum_Nft_V1beta1_MsgSendResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Coreum_Nft_V1beta1_MsgSend: @unchecked Sendable {}
extension Coreum_Nft_V1beta1_MsgSendResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "coreum.nft.v1beta1"

extension Coreum_Nft_V1beta1_MsgSend: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSend"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "class_id"),
    2: .same(proto: "id"),
    3: .same(proto: "sender"),
    4: .same(proto: "receiver"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.classID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.receiver) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.classID.isEmpty {
      try visitor.visitSingularStringField(value: self.classID, fieldNumber: 1)
    }
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 2)
    }
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 3)
    }
    if !self.receiver.isEmpty {
      try visitor.visitSingularStringField(value: self.receiver, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Nft_V1beta1_MsgSend, rhs: Coreum_Nft_V1beta1_MsgSend) -> Bool {
    if lhs.classID != rhs.classID {return false}
    if lhs.id != rhs.id {return false}
    if lhs.sender != rhs.sender {return false}
    if lhs.receiver != rhs.receiver {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Coreum_Nft_V1beta1_MsgSendResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSendResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Coreum_Nft_V1beta1_MsgSendResponse, rhs: Coreum_Nft_V1beta1_MsgSendResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
