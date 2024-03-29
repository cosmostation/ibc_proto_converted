// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: desmos/subspaces/v3/msgs_treasury.proto
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

/// MsgGrantTreasuryAuthorization grants an authorization on behalf of the
/// treasury to a user
struct Desmos_Subspaces_V3_MsgGrantTreasuryAuthorization {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the subspace where the authorization should be granted
  var subspaceID: UInt64 = 0

  /// Address of the user granting a treasury authorization
  var granter: String = String()

  /// Address of the user who is being granted a treasury authorization
  var grantee: String = String()

  /// Grant represents the authorization to execute the provided methods
  var grant: Cosmos_Authz_V1beta1_Grant {
    get {return _grant ?? Cosmos_Authz_V1beta1_Grant()}
    set {_grant = newValue}
  }
  /// Returns true if `grant` has been explicitly set.
  var hasGrant: Bool {return self._grant != nil}
  /// Clears the value of `grant`. Subsequent reads from it will return its default value.
  mutating func clearGrant() {self._grant = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _grant: Cosmos_Authz_V1beta1_Grant? = nil
}

/// MsgGrantTreasuryAuthorizationResponse defines the
/// Msg/MsgGrantTreasuryAuthorization response type
struct Desmos_Subspaces_V3_MsgGrantTreasuryAuthorizationResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRevokeTreasuryAuthorization revokes an existing treasury authorization
/// from a user
struct Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorization {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Id of the subspace from which the authorization should be revoked
  var subspaceID: UInt64 = 0

  /// Address of the user revoking the treasury authorization
  var granter: String = String()

  /// Address of the user who is being revoked the treasury authorization
  var grantee: String = String()

  /// Type url of the authorized message which is being revoked
  var msgTypeURL: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRevokeTreasuryAuthorizationResponse defines the
/// Msg/MsgRevokeTreasuryAuthorization response type
struct Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorizationResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Desmos_Subspaces_V3_MsgGrantTreasuryAuthorization: @unchecked Sendable {}
extension Desmos_Subspaces_V3_MsgGrantTreasuryAuthorizationResponse: @unchecked Sendable {}
extension Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorization: @unchecked Sendable {}
extension Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorizationResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "desmos.subspaces.v3"

extension Desmos_Subspaces_V3_MsgGrantTreasuryAuthorization: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGrantTreasuryAuthorization"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "subspace_id"),
    2: .same(proto: "granter"),
    3: .same(proto: "grantee"),
    4: .same(proto: "grant"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.subspaceID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.granter) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.grantee) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._grant) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.subspaceID != 0 {
      try visitor.visitSingularUInt64Field(value: self.subspaceID, fieldNumber: 1)
    }
    if !self.granter.isEmpty {
      try visitor.visitSingularStringField(value: self.granter, fieldNumber: 2)
    }
    if !self.grantee.isEmpty {
      try visitor.visitSingularStringField(value: self.grantee, fieldNumber: 3)
    }
    try { if let v = self._grant {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Subspaces_V3_MsgGrantTreasuryAuthorization, rhs: Desmos_Subspaces_V3_MsgGrantTreasuryAuthorization) -> Bool {
    if lhs.subspaceID != rhs.subspaceID {return false}
    if lhs.granter != rhs.granter {return false}
    if lhs.grantee != rhs.grantee {return false}
    if lhs._grant != rhs._grant {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Subspaces_V3_MsgGrantTreasuryAuthorizationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGrantTreasuryAuthorizationResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Subspaces_V3_MsgGrantTreasuryAuthorizationResponse, rhs: Desmos_Subspaces_V3_MsgGrantTreasuryAuthorizationResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorization: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRevokeTreasuryAuthorization"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "subspace_id"),
    2: .same(proto: "granter"),
    3: .same(proto: "grantee"),
    4: .standard(proto: "msg_type_url"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt64Field(value: &self.subspaceID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.granter) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.grantee) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.msgTypeURL) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.subspaceID != 0 {
      try visitor.visitSingularUInt64Field(value: self.subspaceID, fieldNumber: 1)
    }
    if !self.granter.isEmpty {
      try visitor.visitSingularStringField(value: self.granter, fieldNumber: 2)
    }
    if !self.grantee.isEmpty {
      try visitor.visitSingularStringField(value: self.grantee, fieldNumber: 3)
    }
    if !self.msgTypeURL.isEmpty {
      try visitor.visitSingularStringField(value: self.msgTypeURL, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorization, rhs: Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorization) -> Bool {
    if lhs.subspaceID != rhs.subspaceID {return false}
    if lhs.granter != rhs.granter {return false}
    if lhs.grantee != rhs.grantee {return false}
    if lhs.msgTypeURL != rhs.msgTypeURL {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorizationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRevokeTreasuryAuthorizationResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorizationResponse, rhs: Desmos_Subspaces_V3_MsgRevokeTreasuryAuthorizationResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
