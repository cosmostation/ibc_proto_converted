// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: kyve/team/v1beta1/events.proto
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

/// MsgCreateTeamVestingAccount is an event emitted when a new team vesting account gets created.
/// emitted_by: MsgCreateTeamVestingAccount
struct Kyve_Team_V1beta1_EventCreateTeamVestingAccount {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority which initiated this action
  var authority: String = String()

  /// id is a unique identify for each vesting account, tied to a single team member.
  var id: UInt64 = 0

  /// total_allocation is the number of tokens reserved for this team member.
  var totalAllocation: UInt64 = 0

  /// commencement is the unix timestamp of the member's official start date.
  var commencement: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EventClawback is an event emitted when the authority claws back tokens from a team vesting account.
/// emitted_by: MsgClawback
struct Kyve_Team_V1beta1_EventClawback {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority which initiated this action
  var authority: String = String()

  /// id is a unique identify for each vesting account, tied to a single team member.
  var id: UInt64 = 0

  /// clawback is a unix timestamp of a clawback. If timestamp is zero
  /// it means that the account has not received a clawback
  var clawback: UInt64 = 0

  /// amount which got clawed back.
  var amount: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EventClaimedUnlocked is an event emitted when the authority claims unlocked $KYVE for a recipient.
/// emitted_by: MsgClaimUnlocked
struct Kyve_Team_V1beta1_EventClaimedUnlocked {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority which initiated this action
  var authority: String = String()

  /// id is a unique identify for each vesting account, tied to a single team member.
  var id: UInt64 = 0

  /// amount is the number of tokens claimed from the unlocked amount.
  var amount: UInt64 = 0

  /// recipient is the receiver address of the claim.
  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EventClaimInflationRewards is an event emitted when the authority claims inflation rewards for a recipient.
/// emitted_by: MsgClaimInflationRewards
struct Kyve_Team_V1beta1_EventClaimInflationRewards {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority which initiated this action
  var authority: String = String()

  /// id is a unique identify for each vesting account, tied to a single team member.
  var id: UInt64 = 0

  /// amount is the amount of inflation rewards the authority should claim for the account holder
  var amount: UInt64 = 0

  /// recipient is the receiver address of the claim.
  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// EventClaimAuthorityRewards is an event emitted when the authority claims its inflation rewards for a recipient.
/// emitted_by: MsgClaimAuthorityRewards
struct Kyve_Team_V1beta1_EventClaimAuthorityRewards {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// authority which initiated this action
  var authority: String = String()

  /// amount is the amount of inflation rewards the authority should claim for the account holder
  var amount: UInt64 = 0

  /// recipient is the receiver address of the claim.
  var recipient: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Kyve_Team_V1beta1_EventCreateTeamVestingAccount: @unchecked Sendable {}
extension Kyve_Team_V1beta1_EventClawback: @unchecked Sendable {}
extension Kyve_Team_V1beta1_EventClaimedUnlocked: @unchecked Sendable {}
extension Kyve_Team_V1beta1_EventClaimInflationRewards: @unchecked Sendable {}
extension Kyve_Team_V1beta1_EventClaimAuthorityRewards: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "kyve.team.v1beta1"

extension Kyve_Team_V1beta1_EventCreateTeamVestingAccount: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventCreateTeamVestingAccount"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "id"),
    3: .standard(proto: "total_allocation"),
    4: .same(proto: "commencement"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.totalAllocation) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.commencement) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if self.totalAllocation != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalAllocation, fieldNumber: 3)
    }
    if self.commencement != 0 {
      try visitor.visitSingularUInt64Field(value: self.commencement, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Team_V1beta1_EventCreateTeamVestingAccount, rhs: Kyve_Team_V1beta1_EventCreateTeamVestingAccount) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.id != rhs.id {return false}
    if lhs.totalAllocation != rhs.totalAllocation {return false}
    if lhs.commencement != rhs.commencement {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Team_V1beta1_EventClawback: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventClawback"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "id"),
    3: .same(proto: "clawback"),
    4: .same(proto: "amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.clawback) }()
      case 4: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if self.clawback != 0 {
      try visitor.visitSingularUInt64Field(value: self.clawback, fieldNumber: 3)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Team_V1beta1_EventClawback, rhs: Kyve_Team_V1beta1_EventClawback) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.id != rhs.id {return false}
    if lhs.clawback != rhs.clawback {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Team_V1beta1_EventClaimedUnlocked: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventClaimedUnlocked"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "id"),
    3: .same(proto: "amount"),
    4: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 3)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Team_V1beta1_EventClaimedUnlocked, rhs: Kyve_Team_V1beta1_EventClaimedUnlocked) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.id != rhs.id {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Team_V1beta1_EventClaimInflationRewards: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventClaimInflationRewards"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "id"),
    3: .same(proto: "amount"),
    4: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.id) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if self.id != 0 {
      try visitor.visitSingularUInt64Field(value: self.id, fieldNumber: 2)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 3)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Team_V1beta1_EventClaimInflationRewards, rhs: Kyve_Team_V1beta1_EventClaimInflationRewards) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.id != rhs.id {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Kyve_Team_V1beta1_EventClaimAuthorityRewards: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".EventClaimAuthorityRewards"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "authority"),
    2: .same(proto: "amount"),
    3: .same(proto: "recipient"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.authority) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.amount) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.recipient) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.authority.isEmpty {
      try visitor.visitSingularStringField(value: self.authority, fieldNumber: 1)
    }
    if self.amount != 0 {
      try visitor.visitSingularUInt64Field(value: self.amount, fieldNumber: 2)
    }
    if !self.recipient.isEmpty {
      try visitor.visitSingularStringField(value: self.recipient, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Kyve_Team_V1beta1_EventClaimAuthorityRewards, rhs: Kyve_Team_V1beta1_EventClaimAuthorityRewards) -> Bool {
    if lhs.authority != rhs.authority {return false}
    if lhs.amount != rhs.amount {return false}
    if lhs.recipient != rhs.recipient {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
