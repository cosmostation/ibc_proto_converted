// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: stargaze/globalfee/v1/proposal.proto
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

struct Publicawesome_Stargaze_Globalfee_V1_SetCodeAuthorizationProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var codeAuthorization: Publicawesome_Stargaze_Globalfee_V1_CodeAuthorization {
    get {return _codeAuthorization ?? Publicawesome_Stargaze_Globalfee_V1_CodeAuthorization()}
    set {_codeAuthorization = newValue}
  }
  /// Returns true if `codeAuthorization` has been explicitly set.
  var hasCodeAuthorization: Bool {return self._codeAuthorization != nil}
  /// Clears the value of `codeAuthorization`. Subsequent reads from it will return its default value.
  mutating func clearCodeAuthorization() {self._codeAuthorization = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _codeAuthorization: Publicawesome_Stargaze_Globalfee_V1_CodeAuthorization? = nil
}

struct Publicawesome_Stargaze_Globalfee_V1_RemoveCodeAuthorizationProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var codeID: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Publicawesome_Stargaze_Globalfee_V1_SetContractAuthorizationProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var contractAuthorization: Publicawesome_Stargaze_Globalfee_V1_ContractAuthorization {
    get {return _contractAuthorization ?? Publicawesome_Stargaze_Globalfee_V1_ContractAuthorization()}
    set {_contractAuthorization = newValue}
  }
  /// Returns true if `contractAuthorization` has been explicitly set.
  var hasContractAuthorization: Bool {return self._contractAuthorization != nil}
  /// Clears the value of `contractAuthorization`. Subsequent reads from it will return its default value.
  mutating func clearContractAuthorization() {self._contractAuthorization = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _contractAuthorization: Publicawesome_Stargaze_Globalfee_V1_ContractAuthorization? = nil
}

struct Publicawesome_Stargaze_Globalfee_V1_RemoveContractAuthorizationProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var description_p: String = String()

  var contractAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Publicawesome_Stargaze_Globalfee_V1_SetCodeAuthorizationProposal: @unchecked Sendable {}
extension Publicawesome_Stargaze_Globalfee_V1_RemoveCodeAuthorizationProposal: @unchecked Sendable {}
extension Publicawesome_Stargaze_Globalfee_V1_SetContractAuthorizationProposal: @unchecked Sendable {}
extension Publicawesome_Stargaze_Globalfee_V1_RemoveContractAuthorizationProposal: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "publicawesome.stargaze.globalfee.v1"

extension Publicawesome_Stargaze_Globalfee_V1_SetCodeAuthorizationProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SetCodeAuthorizationProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "code_authorization"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._codeAuthorization) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try { if let v = self._codeAuthorization {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Publicawesome_Stargaze_Globalfee_V1_SetCodeAuthorizationProposal, rhs: Publicawesome_Stargaze_Globalfee_V1_SetCodeAuthorizationProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._codeAuthorization != rhs._codeAuthorization {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Publicawesome_Stargaze_Globalfee_V1_RemoveCodeAuthorizationProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RemoveCodeAuthorizationProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "code_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.codeID) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if self.codeID != 0 {
      try visitor.visitSingularUInt64Field(value: self.codeID, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Publicawesome_Stargaze_Globalfee_V1_RemoveCodeAuthorizationProposal, rhs: Publicawesome_Stargaze_Globalfee_V1_RemoveCodeAuthorizationProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.codeID != rhs.codeID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Publicawesome_Stargaze_Globalfee_V1_SetContractAuthorizationProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SetContractAuthorizationProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "contract_authorization"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._contractAuthorization) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try { if let v = self._contractAuthorization {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Publicawesome_Stargaze_Globalfee_V1_SetContractAuthorizationProposal, rhs: Publicawesome_Stargaze_Globalfee_V1_SetContractAuthorizationProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs._contractAuthorization != rhs._contractAuthorization {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Publicawesome_Stargaze_Globalfee_V1_RemoveContractAuthorizationProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RemoveContractAuthorizationProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "description"),
    3: .standard(proto: "contract_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.title) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Publicawesome_Stargaze_Globalfee_V1_RemoveContractAuthorizationProposal, rhs: Publicawesome_Stargaze_Globalfee_V1_RemoveContractAuthorizationProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
