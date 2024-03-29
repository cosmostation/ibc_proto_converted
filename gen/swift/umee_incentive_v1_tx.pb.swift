// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: umee/incentive/v1/tx.proto
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

/// MsgClaim represents a account's request to claim pending rewards.
struct Umee_Incentive_V1_MsgClaim {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgClaimResponse defines the Msg/Claim response type.
struct Umee_Incentive_V1_MsgClaimResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var amount: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBond represents a account's request to bond uToken collateral.
struct Umee_Incentive_V1_MsgBond {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var uToken: Cosmos_Base_V1beta1_Coin {
    get {return _uToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_uToken = newValue}
  }
  /// Returns true if `uToken` has been explicitly set.
  var hasUToken: Bool {return self._uToken != nil}
  /// Clears the value of `uToken`. Subsequent reads from it will return its default value.
  mutating func clearUToken() {self._uToken = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uToken: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgBondResponse defines the Msg/Lock response type.
struct Umee_Incentive_V1_MsgBondResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgBeginUnbonding represents a account's request to begin unbonding uToken collateral.
struct Umee_Incentive_V1_MsgBeginUnbonding {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var uToken: Cosmos_Base_V1beta1_Coin {
    get {return _uToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_uToken = newValue}
  }
  /// Returns true if `uToken` has been explicitly set.
  var hasUToken: Bool {return self._uToken != nil}
  /// Clears the value of `uToken`. Subsequent reads from it will return its default value.
  mutating func clearUToken() {self._uToken = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uToken: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgBeginUnbondingResponse defines the Msg/BeginUnbonding response type.
struct Umee_Incentive_V1_MsgBeginUnbondingResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgEmergencyUnbond represents a account's request to instantly unbond uToken collateral for a fee.
struct Umee_Incentive_V1_MsgEmergencyUnbond {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var uToken: Cosmos_Base_V1beta1_Coin {
    get {return _uToken ?? Cosmos_Base_V1beta1_Coin()}
    set {_uToken = newValue}
  }
  /// Returns true if `uToken` has been explicitly set.
  var hasUToken: Bool {return self._uToken != nil}
  /// Clears the value of `uToken`. Subsequent reads from it will return its default value.
  mutating func clearUToken() {self._uToken = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _uToken: Cosmos_Base_V1beta1_Coin? = nil
}

/// MsgEmergencyUnbondResponse defines the Msg/EmergencyUnbond response type.
struct Umee_Incentive_V1_MsgEmergencyUnbondResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSponsor represents a sponsor's request to fund rewards for an incentive program.
/// The program must have been passed by governance, not yet started, and not yet funded.
/// Funded assets must be the full amount required by the program.
struct Umee_Incentive_V1_MsgSponsor {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// Sponsor bech32 account address
  var sponsor: String = String()

  var program: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgSponsorResponse defines the Msg/Sponsor response type.
struct Umee_Incentive_V1_MsgSponsorResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgGovSetParams is used by governance to update module parameters.
struct Umee_Incentive_V1_MsgGovSetParams {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority must be the address of the governance account.
  var authority: String = String()

  var params: Umee_Incentive_V1_Params {
    get {return _params ?? Umee_Incentive_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Umee_Incentive_V1_Params? = nil
}

/// MsgGovSetParamsResponse defines the Msg/SetParams response type.
struct Umee_Incentive_V1_MsgGovSetParamsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgGovCreatePrograms is used by governance to create one or more incentive programs.
/// There are two funding scenarios, depending on from_community_fund.
/// If it is true,the programs' total rewards will be automatically withdrawn from
/// the (parameter) community_fund_address to the incentive module account when this
/// message is passed. (Insufficient funds cause the parameter to be treated as false.)
/// If it is false, a MsgSponsor funding each program's full amount must be submitted
/// after this message passes, but before the program's start_time, or the program
/// will be cancelled when it would otherwise start.
struct Umee_Incentive_V1_MsgGovCreatePrograms {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority must be the address of the governance account.
  var authority: String = String()

  var programs: [Umee_Incentive_V1_IncentiveProgram] = []

  /// from_community_fund defines the source of funds for proposed incentive programs.
  var fromCommunityFund: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MsgGovCreateProgramsResponse defines the Msg/CreatePrograms response type.
struct Umee_Incentive_V1_MsgGovCreateProgramsResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Umee_Incentive_V1_MsgClaim: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgClaimResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgBond: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgBondResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgBeginUnbonding: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgBeginUnbondingResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgEmergencyUnbond: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgEmergencyUnbondResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgSponsor: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgSponsorResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgGovSetParams: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgGovSetParamsResponse: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgGovCreatePrograms: @unchecked Sendable {}
extension Umee_Incentive_V1_MsgGovCreateProgramsResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "umee.incentive.v1"

extension Umee_Incentive_V1_MsgClaim: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaim"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgClaim, rhs: Umee_Incentive_V1_MsgClaim) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgClaimResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgClaimResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeRepeatedMessageField(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.amount.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.amount, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgClaimResponse, rhs: Umee_Incentive_V1_MsgClaimResponse) -> Bool {
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgBond: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBond"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "uToken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uToken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    try { if let v = self._uToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgBond, rhs: Umee_Incentive_V1_MsgBond) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs._uToken != rhs._uToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgBondResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBondResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgBondResponse, rhs: Umee_Incentive_V1_MsgBondResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgBeginUnbonding: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBeginUnbonding"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "uToken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uToken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    try { if let v = self._uToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgBeginUnbonding, rhs: Umee_Incentive_V1_MsgBeginUnbonding) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs._uToken != rhs._uToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgBeginUnbondingResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgBeginUnbondingResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgBeginUnbondingResponse, rhs: Umee_Incentive_V1_MsgBeginUnbondingResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgEmergencyUnbond: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgEmergencyUnbond"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "uToken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._uToken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    try { if let v = self._uToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgEmergencyUnbond, rhs: Umee_Incentive_V1_MsgEmergencyUnbond) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs._uToken != rhs._uToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgEmergencyUnbondResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgEmergencyUnbondResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgEmergencyUnbondResponse, rhs: Umee_Incentive_V1_MsgEmergencyUnbondResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgSponsor: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSponsor"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sponsor"),
    2: .same(proto: "program"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sponsor) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.program) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sponsor.isEmpty {
      try visitor.visitSingularStringField(value: self.sponsor, fieldNumber: 1)
    }
    if self.program != 0 {
      try visitor.visitSingularUInt32Field(value: self.program, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgSponsor, rhs: Umee_Incentive_V1_MsgSponsor) -> Bool {
    if lhs.sponsor != rhs.sponsor {return false}
    if lhs.program != rhs.program {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgSponsorResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgSponsorResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgSponsorResponse, rhs: Umee_Incentive_V1_MsgSponsorResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgGovSetParams: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGovSetParams"
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

  static func ==(lhs: Umee_Incentive_V1_MsgGovSetParams, rhs: Umee_Incentive_V1_MsgGovSetParams) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs._params != rhs._params {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgGovSetParamsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGovSetParamsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgGovSetParamsResponse, rhs: Umee_Incentive_V1_MsgGovSetParamsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgGovCreatePrograms: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGovCreatePrograms"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "programs"),
    3: .standard(proto: "from_community_fund"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.programs) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self.fromCommunityFund) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if !self.programs.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.programs, fieldNumber: 2)
    }
    if self.fromCommunityFund != false {
      try visitor.visitSingularBoolField(value: self.fromCommunityFund, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgGovCreatePrograms, rhs: Umee_Incentive_V1_MsgGovCreatePrograms) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.programs != rhs.programs {return false}
    if lhs.fromCommunityFund != rhs.fromCommunityFund {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_MsgGovCreateProgramsResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MsgGovCreateProgramsResponse"
  static let _protobuf_nameMap = SwiftProtobuf._NameMap()

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let _ = try decoder.nextFieldNumber() {
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_MsgGovCreateProgramsResponse, rhs: Umee_Incentive_V1_MsgGovCreateProgramsResponse) -> Bool {
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
