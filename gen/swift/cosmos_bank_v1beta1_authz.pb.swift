// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cosmos/bank/v1beta1/authz.proto
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

/// SendAuthorization allows the grantee to spend up to spend_limit coins from
/// the granter's account.
///
/// Since: cosmos-sdk 0.43
struct Cosmos_Bank_V1beta1_SendAuthorization {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var spendLimit: [Cosmos_Base_V1beta1_Coin] = []

  /// allow_list specifies an optional list of addresses to whom the grantee can send tokens on behalf of the
  /// granter. If omitted, any recipient is allowed.
  ///
  /// Since: cosmos-sdk 0.47
  var allowList: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Cosmos_Bank_V1beta1_SendAuthorization: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "cosmos.bank.v1beta1"

extension Cosmos_Bank_V1beta1_SendAuthorization: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SendAuthorization"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "spend_limit"),
    2: .standard(proto: "allow_list"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.spendLimit) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.allowList) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.spendLimit.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.spendLimit, fieldNumber: 1)
    }
    if !self.allowList.isEmpty {
      try visitor.visitRepeatedStringField(value: self.allowList, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Cosmos_Bank_V1beta1_SendAuthorization, rhs: Cosmos_Bank_V1beta1_SendAuthorization) -> Bool {
    if lhs.spendLimit != rhs.spendLimit {return false}
    if lhs.allowList != rhs.allowList {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
