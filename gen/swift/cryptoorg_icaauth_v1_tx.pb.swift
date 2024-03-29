// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: cryptoorg/icaauth/v1/tx.proto
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

/// MsgRegisterAccount defines the request message for MsgRegisterAccount
struct Chainmain_Icaauth_V1_MsgRegisterAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// owner represents the owner of the interchain account
  var owner: String = String()

  /// connectionId represents the IBC `connectionId` of the host chain
  var connectionID: String = String()

  /// version represents the version of the ICA channel
  var version: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRegisterAccountResponse defines the response message for MsgRegisterAccount
struct Chainmain_Icaauth_V1_MsgRegisterAccountResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSubmitTx defines the request message for MsgSubmitTx
struct Chainmain_Icaauth_V1_MsgSubmitTx {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// owner represents the owner of the interchain account
  var owner: String = String()

  /// connectionId represents the IBC `connectionId` of the host chain
  var connectionID: String = String()

  /// msgs represents the transactions to be submitted to the host chain
  var msgs: [SwiftProtobuf.Google_Protobuf_Any] = []

  /// timeoutDuration represents the timeout duration for the IBC packet from last block
  var timeoutDuration: SwiftProtobuf.Google_Protobuf_Duration {
    get {return _timeoutDuration ?? SwiftProtobuf.Google_Protobuf_Duration()}
    set {_timeoutDuration = newValue}
  }
  /// Returns true if `timeoutDuration` has been explicitly set.
  var hasTimeoutDuration: Bool {return self._timeoutDuration != nil}
  /// Clears the value of `timeoutDuration`. Subsequent reads from it will return its default value.
  mutating func clearTimeoutDuration() {self._timeoutDuration = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _timeoutDuration: SwiftProtobuf.Google_Protobuf_Duration? = nil
}

/// MsgSubmitTxResponse defines the response message for MsgSubmitTx
struct Chainmain_Icaauth_V1_MsgSubmitTxResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Chainmain_Icaauth_V1_MsgRegisterAccount: @unchecked Sendable {}
extension Chainmain_Icaauth_V1_MsgRegisterAccountResponse: @unchecked Sendable {}
extension Chainmain_Icaauth_V1_MsgSubmitTx: @unchecked Sendable {}
extension Chainmain_Icaauth_V1_MsgSubmitTxResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "chainmain.icaauth.v1"

extension Chainmain_Icaauth_V1_MsgRegisterAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "connectionId"),
    3: .same(proto: "version"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.connectionID) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.version) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.connectionID.isEmpty {
      try visitor.visitSingularStringField(value: self.connectionID, fieldNumber: 2)
    }
    if !self.version.isEmpty {
      try visitor.visitSingularStringField(value: self.version, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Chainmain_Icaauth_V1_MsgRegisterAccount, rhs: Chainmain_Icaauth_V1_MsgRegisterAccount) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.connectionID != rhs.connectionID {return false}
    if lhs.version != rhs.version {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Chainmain_Icaauth_V1_MsgRegisterAccountResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterAccountResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Chainmain_Icaauth_V1_MsgRegisterAccountResponse, rhs: Chainmain_Icaauth_V1_MsgRegisterAccountResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Chainmain_Icaauth_V1_MsgSubmitTx: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitTx"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "owner"),
    2: .same(proto: "connectionId"),
    3: .same(proto: "msgs"),
    4: .same(proto: "timeoutDuration"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.owner) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.connectionID) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.msgs) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._timeoutDuration) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.owner.isEmpty {
      try visitor.visitSingularStringField(value: self.owner, fieldNumber: 1)
    }
    if !self.connectionID.isEmpty {
      try visitor.visitSingularStringField(value: self.connectionID, fieldNumber: 2)
    }
    if !self.msgs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.msgs, fieldNumber: 3)
    }
    try { if let v = self._timeoutDuration {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Chainmain_Icaauth_V1_MsgSubmitTx, rhs: Chainmain_Icaauth_V1_MsgSubmitTx) -> Bool {
    if lhs.owner != rhs.owner {return false}
    if lhs.connectionID != rhs.connectionID {return false}
    if lhs.msgs != rhs.msgs {return false}
    if lhs._timeoutDuration != rhs._timeoutDuration {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Chainmain_Icaauth_V1_MsgSubmitTxResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSubmitTxResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Chainmain_Icaauth_V1_MsgSubmitTxResponse, rhs: Chainmain_Icaauth_V1_MsgSubmitTxResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
