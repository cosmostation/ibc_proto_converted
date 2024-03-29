// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ibc/applications/interchain_accounts/host/v1/host.proto
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

/// Params defines the set of on-chain interchain accounts parameters.
/// The following parameters may be used to disable the host submodule.
struct Ibc_Applications_InterchainAccounts_Host_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// host_enabled enables or disables the host submodule.
  var hostEnabled: Bool = false

  /// allow_messages defines a list of sdk message typeURLs allowed to be executed on a host chain.
  var allowMessages: [String] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Ibc_Applications_InterchainAccounts_Host_V1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "ibc.applications.interchain_accounts.host.v1"

extension Ibc_Applications_InterchainAccounts_Host_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "host_enabled"),
    2: .standard(proto: "allow_messages"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.hostEnabled) }()
      case 2: try { try decoder.decodeRepeatedStringField(value: &self.allowMessages) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.hostEnabled != false {
      try visitor.visitSingularBoolField(value: self.hostEnabled, fieldNumber: 1)
    }
    if !self.allowMessages.isEmpty {
      try visitor.visitRepeatedStringField(value: self.allowMessages, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Ibc_Applications_InterchainAccounts_Host_V1_Params, rhs: Ibc_Applications_InterchainAccounts_Host_V1_Params) -> Bool {
    if lhs.hostEnabled != rhs.hostEnabled {return false}
    if lhs.allowMessages != rhs.allowMessages {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
