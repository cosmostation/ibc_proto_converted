// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stratos/sds/v1/event.proto
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

/// EventPrePay is emitted on Msg/MsgPrepay
struct Stratos_Sds_V1_EventPrePay {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var beneficiary: String = String()

  var amount: String = String()

  var purchasedNoz: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EventFileUpload is emitted on Msg/MsgFileUpload
struct Stratos_Sds_V1_EventFileUpload {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sender: String = String()

  var reporter: String = String()

  var uploader: String = String()

  var fileHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Stratos_Sds_V1_EventPrePay: @unchecked Sendable {}
extension Stratos_Sds_V1_EventFileUpload: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "stratos.sds.v1"

extension Stratos_Sds_V1_EventPrePay: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventPrePay"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "beneficiary"),
    3: .same(proto: "amount"),
    4: .standard(proto: "purchased_noz"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.beneficiary) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.purchasedNoz) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.beneficiary.isEmpty {
      try visitor.visitSingularStringField(value: self.beneficiary, fieldNumber: 2)
    }
    if !self.amount.isEmpty {
      try visitor.visitSingularStringField(value: self.amount, fieldNumber: 3)
    }
    if !self.purchasedNoz.isEmpty {
      try visitor.visitSingularStringField(value: self.purchasedNoz, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Sds_V1_EventPrePay, rhs: Stratos_Sds_V1_EventPrePay) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.beneficiary != rhs.beneficiary {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.purchasedNoz != rhs.purchasedNoz {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Stratos_Sds_V1_EventFileUpload: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventFileUpload"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sender"),
    2: .same(proto: "reporter"),
    3: .same(proto: "uploader"),
    4: .standard(proto: "file_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sender) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.reporter) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.uploader) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.fileHash) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sender.isEmpty {
      try visitor.visitSingularStringField(value: self.sender, fieldNumber: 1)
    }
    if !self.reporter.isEmpty {
      try visitor.visitSingularStringField(value: self.reporter, fieldNumber: 2)
    }
    if !self.uploader.isEmpty {
      try visitor.visitSingularStringField(value: self.uploader, fieldNumber: 3)
    }
    if !self.fileHash.isEmpty {
      try visitor.visitSingularStringField(value: self.fileHash, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Stratos_Sds_V1_EventFileUpload, rhs: Stratos_Sds_V1_EventFileUpload) -> Bool {
    if lhs.sender != rhs.sender {return false}
    if lhs.reporter != rhs.reporter {return false}
    if lhs.uploader != rhs.uploader {return false}
    if lhs.fileHash != rhs.fileHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
