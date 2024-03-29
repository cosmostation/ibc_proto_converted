// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: confio/twasm/v1beta1/contract_extension.proto
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

/// TgradeContractDetails is a custom extension to the wasmd ContractInfo
struct Confio_Twasm_V1beta1_TgradeContractDetails {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var registeredPrivileges: [Confio_Twasm_V1beta1_RegisteredPrivilege] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RegisteredPrivilege stores position and privilege name
struct Confio_Twasm_V1beta1_RegisteredPrivilege {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var position: UInt32 = 0

  var privilegeType: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Confio_Twasm_V1beta1_TgradeContractDetails: @unchecked Sendable {}
extension Confio_Twasm_V1beta1_RegisteredPrivilege: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "confio.twasm.v1beta1"

extension Confio_Twasm_V1beta1_TgradeContractDetails: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TgradeContractDetails"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "registered_privileges"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.registeredPrivileges) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.registeredPrivileges.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.registeredPrivileges, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Confio_Twasm_V1beta1_TgradeContractDetails, rhs: Confio_Twasm_V1beta1_TgradeContractDetails) -> Bool {
    if lhs.registeredPrivileges != rhs.registeredPrivileges {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Confio_Twasm_V1beta1_RegisteredPrivilege: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RegisteredPrivilege"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "position"),
    2: .standard(proto: "privilege_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.position) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.privilegeType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.position != 0 {
      try visitor.visitSingularUInt32Field(value: self.position, fieldNumber: 1)
    }
    if !self.privilegeType.isEmpty {
      try visitor.visitSingularStringField(value: self.privilegeType, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Confio_Twasm_V1beta1_RegisteredPrivilege, rhs: Confio_Twasm_V1beta1_RegisteredPrivilege) -> Bool {
    if lhs.position != rhs.position {return false}
    if lhs.privilegeType != rhs.privilegeType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
