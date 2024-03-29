// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: evmos/revenue/v1/tx.proto
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

/// MsgRegisterRevenue defines a message that registers a Revenue
struct Evmos_Revenue_V1_MsgRegisterRevenue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in hex format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
  /// sending the transaction which deploys the contract
  var deployerAddress: String = String()

  /// withdrawer_address is the bech32 address of account receiving the transaction fees
  var withdrawerAddress: String = String()

  /// nonces is an array of nonces from the address path, where the last nonce is the nonce
  /// that determines the contract's address - it can be an EOA nonce or a
  /// factory contract nonce
  var nonces: [UInt64] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgRegisterRevenueResponse defines the MsgRegisterRevenue response type
struct Evmos_Revenue_V1_MsgRegisterRevenueResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateRevenue defines a message that updates the withdrawer address for a
/// registered Revenue
struct Evmos_Revenue_V1_MsgUpdateRevenue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in hex format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
  /// sending the transaction which deploys the contract
  var deployerAddress: String = String()

  /// withdrawer_address is the bech32 address of account receiving the transaction fees
  var withdrawerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateRevenueResponse defines the MsgUpdateRevenue response type
struct Evmos_Revenue_V1_MsgUpdateRevenueResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCancelRevenue defines a message that cancels a registered Revenue
struct Evmos_Revenue_V1_MsgCancelRevenue {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address in hex format
  var contractAddress: String = String()

  /// deployer_address is the bech32 address of message sender. It must be the same as the origin EOA
  /// sending the transaction which deploys the contract
  var deployerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgCancelRevenueResponse defines the MsgCancelRevenue response type
struct Evmos_Revenue_V1_MsgCancelRevenueResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgUpdateParams defines a Msg for updating the x/revenue module parameters.
struct Evmos_Revenue_V1_MsgUpdateParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority is the address of the governance account.
  var authority: String = String()

  /// params defines the x/revenue parameters to update.
  /// NOTE: All parameters must be supplied.
  var params: Evmos_Revenue_V1_Params {
    get {return _params ?? Evmos_Revenue_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Evmos_Revenue_V1_Params? = nil
}

/// MsgUpdateParamsResponse defines the response structure for executing a
/// MsgUpdateParams message.
struct Evmos_Revenue_V1_MsgUpdateParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Evmos_Revenue_V1_MsgRegisterRevenue: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgRegisterRevenueResponse: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgUpdateRevenue: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgUpdateRevenueResponse: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgCancelRevenue: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgCancelRevenueResponse: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgUpdateParams: @unchecked Sendable {}
extension Evmos_Revenue_V1_MsgUpdateParamsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "evmos.revenue.v1"

extension Evmos_Revenue_V1_MsgRegisterRevenue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterRevenue"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "deployer_address"),
    3: .standard(proto: "withdrawer_address"),
    4: .same(proto: "nonces"),
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
      case 4: try { try decoder.decodeRepeatedUInt64Field(value: &self.nonces) }()
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
    if !self.nonces.isEmpty {
      try visitor.visitPackedUInt64Field(value: self.nonces, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgRegisterRevenue, rhs: Evmos_Revenue_V1_MsgRegisterRevenue) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.withdrawerAddress != rhs.withdrawerAddress {return false}
    if lhs.nonces != rhs.nonces {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgRegisterRevenueResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgRegisterRevenueResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgRegisterRevenueResponse, rhs: Evmos_Revenue_V1_MsgRegisterRevenueResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgUpdateRevenue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateRevenue"
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

  static func ==(lhs: Evmos_Revenue_V1_MsgUpdateRevenue, rhs: Evmos_Revenue_V1_MsgUpdateRevenue) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.withdrawerAddress != rhs.withdrawerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgUpdateRevenueResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateRevenueResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgUpdateRevenueResponse, rhs: Evmos_Revenue_V1_MsgUpdateRevenueResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgCancelRevenue: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelRevenue"
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

  static func ==(lhs: Evmos_Revenue_V1_MsgCancelRevenue, rhs: Evmos_Revenue_V1_MsgCancelRevenue) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.deployerAddress != rhs.deployerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgCancelRevenueResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgCancelRevenueResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgCancelRevenueResponse, rhs: Evmos_Revenue_V1_MsgCancelRevenueResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgUpdateParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParams"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "params"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    try { if let v = self._params {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgUpdateParams, rhs: Evmos_Revenue_V1_MsgUpdateParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Evmos_Revenue_V1_MsgUpdateParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgUpdateParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Evmos_Revenue_V1_MsgUpdateParamsResponse, rhs: Evmos_Revenue_V1_MsgUpdateParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
