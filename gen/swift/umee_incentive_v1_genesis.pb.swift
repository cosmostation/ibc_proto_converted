// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: umee/incentive/v1/genesis.proto
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

/// GenesisState defines the x/incentive module's genesis state.
struct Umee_Incentive_V1_GenesisState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var params: Umee_Incentive_V1_Params {
    get {return _params ?? Umee_Incentive_V1_Params()}
    set {_params = newValue}
  }
  /// Returns true if `params` has been explicitly set.
  var hasParams: Bool {return self._params != nil}
  /// Clears the value of `params`. Subsequent reads from it will return its default value.
  mutating func clearParams() {self._params = nil}

  var nextProgramID: UInt32 = 0

  var lastRewardsTime: Int64 = 0

  var rewardTrackers: [Umee_Incentive_V1_RewardTracker] = []

  var rewardAccumulators: [Umee_Incentive_V1_RewardAccumulator] = []

  var upcomingPrograms: [Umee_Incentive_V1_IncentiveProgram] = []

  var ongoingPrograms: [Umee_Incentive_V1_IncentiveProgram] = []

  var completedPrograms: [Umee_Incentive_V1_IncentiveProgram] = []

  var bonds: [Umee_Incentive_V1_Bond] = []

  var accountUnbondings: [Umee_Incentive_V1_AccountUnbondings] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _params: Umee_Incentive_V1_Params? = nil
}

/// Bond tracks the amount of coins of one uToken denomination bonded
/// by a single account.
struct Umee_Incentive_V1_Bond {
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

/// RewardTracker tracks the value of a given lock denom's RewardAccumulator at the
/// last time a specific account calculated pending rewards for it. When calculating
/// available rewards, this value is used to determine the difference between the current
/// RewardAccumulator for a uToken and the last value at which the user updated bonds or claimed
/// tokens. Their pending rewards increase by only the rewards accrued in that time period.
struct Umee_Incentive_V1_RewardTracker {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var uToken: String = String()

  var rewards: [Cosmos_Base_V1beta1_DecCoin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// RewardAccumulator is a global reward tracking struct that indicates the amount
/// of rewards that a reference amount of a bonded uToken denom would have accumulated
/// if it was bonded since genesis. To prevent rounding issues, the reference amount is
/// 10^exponent of the uToken's smallest possible amount, generally matching the exponent
/// of the associated base token registered with the leverage module.
struct Umee_Incentive_V1_RewardAccumulator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var uToken: String = String()

  var rewards: [Cosmos_Base_V1beta1_DecCoin] = []

  var exponent: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Unbonding is a structure that tracks an in-progress token unbonding.
/// It tracks both its start time and end time, so that if the module's
/// unbonding time changes, the unbonding can complete at the earlier of
/// its original end time or its new one based on the new parameter.
struct Umee_Incentive_V1_Unbonding {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var start: Int64 = 0

  var end: Int64 = 0

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

/// AccountUnbondings is a structure that is used to store all of an account's unbondings
/// for a single bonded uToken denom in both KVStore and genesis state.
struct Umee_Incentive_V1_AccountUnbondings {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var account: String = String()

  var uToken: String = String()

  var unbondings: [Umee_Incentive_V1_Unbonding] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Umee_Incentive_V1_GenesisState: @unchecked Sendable {}
extension Umee_Incentive_V1_Bond: @unchecked Sendable {}
extension Umee_Incentive_V1_RewardTracker: @unchecked Sendable {}
extension Umee_Incentive_V1_RewardAccumulator: @unchecked Sendable {}
extension Umee_Incentive_V1_Unbonding: @unchecked Sendable {}
extension Umee_Incentive_V1_AccountUnbondings: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "umee.incentive.v1"

extension Umee_Incentive_V1_GenesisState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".GenesisState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "params"),
    2: .standard(proto: "next_program_id"),
    3: .standard(proto: "last_rewards_time"),
    4: .standard(proto: "reward_trackers"),
    5: .standard(proto: "reward_accumulators"),
    6: .standard(proto: "upcoming_programs"),
    7: .standard(proto: "ongoing_programs"),
    8: .standard(proto: "completed_programs"),
    9: .same(proto: "bonds"),
    10: .standard(proto: "account_unbondings"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._params) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.nextProgramID) }()
      case 3: try { try decoder.decodeSingularInt64Field(value: &self.lastRewardsTime) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.rewardTrackers) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.rewardAccumulators) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.upcomingPrograms) }()
      case 7: try { try decoder.decodeRepeatedMessageField(value: &self.ongoingPrograms) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.completedPrograms) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.bonds) }()
      case 10: try { try decoder.decodeRepeatedMessageField(value: &self.accountUnbondings) }()
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
    if self.nextProgramID != 0 {
      try visitor.visitSingularUInt32Field(value: self.nextProgramID, fieldNumber: 2)
    }
    if self.lastRewardsTime != 0 {
      try visitor.visitSingularInt64Field(value: self.lastRewardsTime, fieldNumber: 3)
    }
    if !self.rewardTrackers.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardTrackers, fieldNumber: 4)
    }
    if !self.rewardAccumulators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardAccumulators, fieldNumber: 5)
    }
    if !self.upcomingPrograms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.upcomingPrograms, fieldNumber: 6)
    }
    if !self.ongoingPrograms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.ongoingPrograms, fieldNumber: 7)
    }
    if !self.completedPrograms.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.completedPrograms, fieldNumber: 8)
    }
    if !self.bonds.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.bonds, fieldNumber: 9)
    }
    if !self.accountUnbondings.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.accountUnbondings, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_GenesisState, rhs: Umee_Incentive_V1_GenesisState) -> Bool {
    if lhs._params != rhs._params {return false}
    if lhs.nextProgramID != rhs.nextProgramID {return false}
    if lhs.lastRewardsTime != rhs.lastRewardsTime {return false}
    if lhs.rewardTrackers != rhs.rewardTrackers {return false}
    if lhs.rewardAccumulators != rhs.rewardAccumulators {return false}
    if lhs.upcomingPrograms != rhs.upcomingPrograms {return false}
    if lhs.ongoingPrograms != rhs.ongoingPrograms {return false}
    if lhs.completedPrograms != rhs.completedPrograms {return false}
    if lhs.bonds != rhs.bonds {return false}
    if lhs.accountUnbondings != rhs.accountUnbondings {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_Bond: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Bond"
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

  static func ==(lhs: Umee_Incentive_V1_Bond, rhs: Umee_Incentive_V1_Bond) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs._uToken != rhs._uToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_RewardTracker: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardTracker"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "uToken"),
    3: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.uToken) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    if !self.uToken.isEmpty {
      try visitor.visitSingularStringField(value: self.uToken, fieldNumber: 2)
    }
    if !self.rewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewards, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_RewardTracker, rhs: Umee_Incentive_V1_RewardTracker) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs.uToken != rhs.uToken {return false}
    if lhs.rewards != rhs.rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_RewardAccumulator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardAccumulator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "uToken"),
    2: .same(proto: "rewards"),
    3: .same(proto: "exponent"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.uToken) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.rewards) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.exponent) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.uToken.isEmpty {
      try visitor.visitSingularStringField(value: self.uToken, fieldNumber: 1)
    }
    if !self.rewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewards, fieldNumber: 2)
    }
    if self.exponent != 0 {
      try visitor.visitSingularUInt32Field(value: self.exponent, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_RewardAccumulator, rhs: Umee_Incentive_V1_RewardAccumulator) -> Bool {
    if lhs.uToken != rhs.uToken {return false}
    if lhs.rewards != rhs.rewards {return false}
    if lhs.exponent != rhs.exponent {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_Unbonding: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Unbonding"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "start"),
    2: .same(proto: "end"),
    3: .same(proto: "uToken"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt64Field(value: &self.start) }()
      case 2: try { try decoder.decodeSingularInt64Field(value: &self.end) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._uToken) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.start != 0 {
      try visitor.visitSingularInt64Field(value: self.start, fieldNumber: 1)
    }
    if self.end != 0 {
      try visitor.visitSingularInt64Field(value: self.end, fieldNumber: 2)
    }
    try { if let v = self._uToken {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_Unbonding, rhs: Umee_Incentive_V1_Unbonding) -> Bool {
    if lhs.start != rhs.start {return false}
    if lhs.end != rhs.end {return false}
    if lhs._uToken != rhs._uToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Umee_Incentive_V1_AccountUnbondings: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".AccountUnbondings"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "account"),
    2: .same(proto: "uToken"),
    3: .same(proto: "unbondings"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.account) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.uToken) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.unbondings) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.account.isEmpty {
      try visitor.visitSingularStringField(value: self.account, fieldNumber: 1)
    }
    if !self.uToken.isEmpty {
      try visitor.visitSingularStringField(value: self.uToken, fieldNumber: 2)
    }
    if !self.unbondings.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.unbondings, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Umee_Incentive_V1_AccountUnbondings, rhs: Umee_Incentive_V1_AccountUnbondings) -> Bool {
    if lhs.account != rhs.account {return false}
    if lhs.uToken != rhs.uToken {return false}
    if lhs.unbondings != rhs.unbondings {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
