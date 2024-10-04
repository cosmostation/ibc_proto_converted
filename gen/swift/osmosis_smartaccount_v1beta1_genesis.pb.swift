// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: osmosis/smartaccount/v1beta1/genesis.proto
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

/// AuthenticatorData represents a genesis exported account with Authenticators.
/// The address is used as the key, and the account authenticators are stored in
/// the authenticators field.
struct Osmosis_Smartaccount_V1beta1_AuthenticatorData {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// address is an account address, one address can have many authenticators
  var address: String = String()

  /// authenticators are the account's authenticators, these can be multiple
  /// types including SignatureVerification, AllOfs, CosmWasmAuthenticators, etc
  var authenticators: [Osmosis_Smartaccount_V1beta1_AccountAuthenticator] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// GenesisState defines the authenticator module's genesis state.
struct Osmosis_Smartaccount_V1beta1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// params define the parameters for the authenticator module.
  var params: Osmosis_Smartaccount_V1beta1_Params {
    get {return _params ?? Osmosis_Smartaccount_V1beta1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  /// next_authenticator_id is the next available authenticator ID.
  var nextAuthenticatorID: UInt64 = 0

  /// authenticator_data contains the data for multiple accounts, each with their
  /// authenticators.
  var authenticatorData: [Osmosis_Smartaccount_V1beta1_AuthenticatorData] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Osmosis_Smartaccount_V1beta1_Params? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Osmosis_Smartaccount_V1beta1_AuthenticatorData: @unchecked Sendable {}
extension Osmosis_Smartaccount_V1beta1_GenesisState: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "osmosis.smartaccount.v1beta1"

extension Osmosis_Smartaccount_V1beta1_AuthenticatorData: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AuthenticatorData"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "authenticators"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.authenticators) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.authenticators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.authenticators, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Smartaccount_V1beta1_AuthenticatorData, rhs: Osmosis_Smartaccount_V1beta1_AuthenticatorData) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.authenticators != rhs.authenticators {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Osmosis_Smartaccount_V1beta1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "next_authenticator_id"),
    3: .standard(proto: "authenticator_data"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.nextAuthenticatorID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.authenticatorData) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.nextAuthenticatorID != 0 {
      try visitor.visitSingularUInt64Field(value: self.nextAuthenticatorID, fieldNumber: 2)
    }
    if !self.authenticatorData.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.authenticatorData, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Osmosis_Smartaccount_V1beta1_GenesisState, rhs: Osmosis_Smartaccount_V1beta1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.nextAuthenticatorID != rhs.nextAuthenticatorID {return false}
    if lhs.authenticatorData != rhs.authenticatorData {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}