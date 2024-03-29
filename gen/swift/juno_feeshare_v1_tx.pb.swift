// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: juno/feeshare/v1/tx.proto
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

/// MsgRegisterFeeShare defines a message that registers a FeeShare
struct Juno_Feeshare_V1_MsgRegisterFeeShare {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in bech32 format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the
  /// same the contract's admin address
  var deployerAddress: String = String()

  /// withdrawer_address is the bech32 address of account receiving the
  /// transaction fees
  var withdrawerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRegisterFeeShareResponse defines the MsgRegisterFeeShare response type
struct Juno_Feeshare_V1_MsgRegisterFeeShareResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateFeeShare defines a message that updates the withdrawer address for a
/// registered FeeShare
struct Juno_Feeshare_V1_MsgUpdateFeeShare {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in bech32 format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the
  /// same the contract's admin address
  var deployerAddress: String = String()

  /// withdrawer_address is the bech32 address of account receiving the
  /// transaction fees
  var withdrawerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateFeeShareResponse defines the MsgUpdateFeeShare response type
struct Juno_Feeshare_V1_MsgUpdateFeeShareResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCancelFeeShare defines a message that cancels a registered FeeShare
struct Juno_Feeshare_V1_MsgCancelFeeShare {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in bech32 format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the
  /// same the contract's admin address
  var deployerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCancelFeeShareResponse defines the MsgCancelFeeShare response type
struct Juno_Feeshare_V1_MsgCancelFeeShareResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Juno_Feeshare_V1_MsgRegisterFeeShare: @unchecked Sendable {}
extension Juno_Feeshare_V1_MsgRegisterFeeShareResponse: @unchecked Sendable {}
extension Juno_Feeshare_V1_MsgUpdateFeeShare: @unchecked Sendable {}
extension Juno_Feeshare_V1_MsgUpdateFeeShareResponse: @unchecked Sendable {}
extension Juno_Feeshare_V1_MsgCancelFeeShare: @unchecked Sendable {}
extension Juno_Feeshare_V1_MsgCancelFeeShareResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "juno.feeshare.v1"

extension Juno_Feeshare_V1_MsgRegisterFeeShare: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterFeeShare"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "deployer_address"),
    3: .standard(proto: "withdrawer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.deployerAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.withdrawerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    if !self.deployerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.deployerAddress, fieldNumber: 2)
    }
    if !self.withdrawerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.withdrawerAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgRegisterFeeShare, rhs: Juno_Feeshare_V1_MsgRegisterFeeShare) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.withdrawerAddress != rhs.withdrawerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Juno_Feeshare_V1_MsgRegisterFeeShareResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterFeeShareResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgRegisterFeeShareResponse, rhs: Juno_Feeshare_V1_MsgRegisterFeeShareResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Juno_Feeshare_V1_MsgUpdateFeeShare: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateFeeShare"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "deployer_address"),
    3: .standard(proto: "withdrawer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.deployerAddress) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.withdrawerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    if !self.deployerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.deployerAddress, fieldNumber: 2)
    }
    if !self.withdrawerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.withdrawerAddress, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgUpdateFeeShare, rhs: Juno_Feeshare_V1_MsgUpdateFeeShare) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.withdrawerAddress != rhs.withdrawerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Juno_Feeshare_V1_MsgUpdateFeeShareResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateFeeShareResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgUpdateFeeShareResponse, rhs: Juno_Feeshare_V1_MsgUpdateFeeShareResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Juno_Feeshare_V1_MsgCancelFeeShare: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelFeeShare"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "deployer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.deployerAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    if !self.deployerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.deployerAddress, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgCancelFeeShare, rhs: Juno_Feeshare_V1_MsgCancelFeeShare) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Juno_Feeshare_V1_MsgCancelFeeShareResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelFeeShareResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Juno_Feeshare_V1_MsgCancelFeeShareResponse, rhs: Juno_Feeshare_V1_MsgCancelFeeShareResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
