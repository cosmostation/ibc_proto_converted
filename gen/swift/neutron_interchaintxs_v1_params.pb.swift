// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: neutron/interchaintxs/v1/params.proto
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

/// Params defines the parameters for the module.
struct Neutron_Interchaintxs_V1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Defines maximum amount of messages to be passed in MsgSubmitTx
  var msgSubmitTxMaxMessages: UInt64 = 0

  /// Defines a minimum fee required to register interchain account
  var registerFee: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Neutron_Interchaintxs_V1_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "neutron.interchaintxs.v1"

extension Neutron_Interchaintxs_V1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "msg_submit_tx_max_messages"),
    2: .standard(proto: "register_fee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.msgSubmitTxMaxMessages) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.registerFee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.msgSubmitTxMaxMessages != 0 {
      try visitor.visitSingularUInt64Field(value: self.msgSubmitTxMaxMessages, fieldNumber: 1)
    }
    if !self.registerFee.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.registerFee, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Neutron_Interchaintxs_V1_Params, rhs: Neutron_Interchaintxs_V1_Params) -> Bool {
    if lhs.msgSubmitTxMaxMessages != rhs.msgSubmitTxMaxMessages {return false}
    if lhs.registerFee != rhs.registerFee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
