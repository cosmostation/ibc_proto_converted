// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: crescent/liquidstaking/v1beta1/liquidstaking.proto
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

/// ValidatorStatus enumerates the status of a liquid validator.
enum Crescent_Liquidstaking_V1beta1_ValidatorStatus: SwiftProtobuf.Enum {
  typealias RawValue = Int

  /// VALIDATOR_STATUS_UNSPECIFIED defines the unspecified invalid status.
  case unspecified // = 0

  /// VALIDATOR_STATUS_ACTIVE defines the active, valid status
  case active // = 1

  /// VALIDATOR_STATUS_INACTIVE defines the inactive, invalid status
  case inactive // = 2
  case UNRECOGNIZED(Int)

  init() {
    self = .unspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .unspecified
    case 1: self = .active
    case 2: self = .inactive
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .unspecified: return 0
    case .active: return 1
    case .inactive: return 2
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Crescent_Liquidstaking_V1beta1_ValidatorStatus: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Crescent_Liquidstaking_V1beta1_ValidatorStatus] = [
    .unspecified,
    .active,
    .inactive,
  ]
}

#endif  // swift(>=4.2)

/// Params defines the set of params for the liquidstaking module.
struct Crescent_Liquidstaking_V1beta1_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// LiquidBondDenom specifies the denomination of the token receiving after LiquidStaking, The value is calculated
  /// through NetAmount.
  var liquidBondDenom: String = String()

  /// WhitelistedValidators specifies the validators elected to become Active Liquid Validators.
  var whitelistedValidators: [Crescent_Liquidstaking_V1beta1_WhitelistedValidator] = []

  /// UnstakeFeeRate specifies the fee rate when liquid unstake is requested, unbonded by subtracting it from
  /// unbondingAmount
  var unstakeFeeRate: String = String()

  /// MinLiquidStakingAmount specifies the minimum number of coins to be staked to the active liquid validators on liquid
  /// staking to minimize decimal loss and consider gas efficiency.
  var minLiquidStakingAmount: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// WhitelistedValidator consists of the validator operator address and the target weight, which is a value for
/// calculating the real weight to be derived according to the active status. In the case of inactive, it is calculated
/// as zero.
struct Crescent_Liquidstaking_V1beta1_WhitelistedValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// validator_address defines the bech32-encoded address that whitelisted validator
  var validatorAddress: String = String()

  /// target_weight specifies the target weight for liquid staking, unstaking amount, which is a value for calculating
  /// the real weight to be derived according to the active status
  var targetWeight: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// LiquidValidator defines a Validator that can be the target of LiquidStaking and LiquidUnstaking, Active, Weight, etc.
/// fields are derived as functions to deal with by maintaining consistency with the state of the staking module.
struct Crescent_Liquidstaking_V1beta1_LiquidValidator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// operator_address defines the address of the validator's operator; bech encoded in JSON.
  var operatorAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// LiquidValidatorState is type LiquidValidator with state added to return to query results.
struct Crescent_Liquidstaking_V1beta1_LiquidValidatorState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// operator_address defines the address of the validator's operator; bech encoded in JSON.
  var operatorAddress: String = String()

  /// weight specifies the weight for liquid staking, unstaking amount
  var weight: String = String()

  /// status is the liquid validator status
  var status: Crescent_Liquidstaking_V1beta1_ValidatorStatus = .unspecified

  /// del_shares define the delegation shares of the validator
  var delShares: String = String()

  /// liquid_tokens define the token amount worth of delegation shares of the validator (slashing applied amount)
  var liquidTokens: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// NetAmountState is type for net amount raw data and mint rate, This is a value that depends on the several module
/// state every time, so it is used only for calculation and query and is not stored in kv.
struct Crescent_Liquidstaking_V1beta1_NetAmountState {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// mint_rate is bTokenTotalSupply / NetAmount
  var mintRate: String = String()

  /// btoken_total_supply returns the total supply of btoken(liquid_bond_denom)
  var btokenTotalSupply: String = String()

  /// net_amount is proxy account's native token balance + total liquid tokens + total remaining rewards + total
  /// unbonding balance
  var netAmount: String = String()

  /// total_del_shares define the delegation shares of all liquid validators
  var totalDelShares: String = String()

  /// total_liquid_tokens define the token amount worth of delegation shares of all liquid validator (slashing applied
  /// amount)
  var totalLiquidTokens: String = String()

  /// total_remaining_rewards define the sum of remaining rewards of proxy account by all liquid validators
  var totalRemainingRewards: String = String()

  /// total_unbonding_balance define the unbonding balance of proxy account by all liquid validator (slashing applied
  /// amount)
  var totalUnbondingBalance: String = String()

  /// proxy_acc_balance define the balance of proxy account for the native token
  var proxyAccBalance: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// VotingPower is type for current voting power of the voter including staking module's voting power and liquid staking
/// module's voting power, It depends on the amount of delegation of staking module, the bonded state of the delegated
/// validator, the value of btoken(liquid_bond_denom), and the pool coin and farming position containing btoken..
struct Crescent_Liquidstaking_V1beta1_VotingPower {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// voter defines the address of the voter; bech encoded in JSON.
  var voter: String = String()

  /// staking_voting_power return the voting power of staking that can be exercised.
  var stakingVotingPower: String = String()

  /// liquid_staking_voting_power return the voting power of liquid staking that can be exercised.
  var liquidStakingVotingPower: String = String()

  /// validator_voting_power return the voting power of the validator if the voter is the validator operator that can be
  /// exercised.
  var validatorVotingPower: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Crescent_Liquidstaking_V1beta1_ValidatorStatus: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_Params: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_WhitelistedValidator: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_LiquidValidator: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_LiquidValidatorState: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_NetAmountState: @unchecked Sendable {}
extension Crescent_Liquidstaking_V1beta1_VotingPower: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "crescent.liquidstaking.v1beta1"

extension Crescent_Liquidstaking_V1beta1_ValidatorStatus: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "VALIDATOR_STATUS_UNSPECIFIED"),
    1: .same(proto: "VALIDATOR_STATUS_ACTIVE"),
    2: .same(proto: "VALIDATOR_STATUS_INACTIVE"),
  ]
}

extension Crescent_Liquidstaking_V1beta1_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "liquid_bond_denom"),
    2: .standard(proto: "whitelisted_validators"),
    3: .standard(proto: "unstake_fee_rate"),
    5: .standard(proto: "min_liquid_staking_amount"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.liquidBondDenom) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.whitelistedValidators) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.unstakeFeeRate) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.minLiquidStakingAmount) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.liquidBondDenom.isEmpty {
      try visitor.visitSingularStringField(value: self.liquidBondDenom, fieldNumber: 1)
    }
    if !self.whitelistedValidators.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.whitelistedValidators, fieldNumber: 2)
    }
    if !self.unstakeFeeRate.isEmpty {
      try visitor.visitSingularStringField(value: self.unstakeFeeRate, fieldNumber: 3)
    }
    if !self.minLiquidStakingAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.minLiquidStakingAmount, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_Params, rhs: Crescent_Liquidstaking_V1beta1_Params) -> Bool {
    if lhs.liquidBondDenom != rhs.liquidBondDenom {return false}
    if lhs.whitelistedValidators != rhs.whitelistedValidators {return false}
    if lhs.unstakeFeeRate != rhs.unstakeFeeRate {return false}
    if lhs.minLiquidStakingAmount != rhs.minLiquidStakingAmount {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidstaking_V1beta1_WhitelistedValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".WhitelistedValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_address"),
    2: .standard(proto: "target_weight"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.validatorAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.targetWeight) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.validatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorAddress, fieldNumber: 1)
    }
    if !self.targetWeight.isEmpty {
      try visitor.visitSingularStringField(value: self.targetWeight, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_WhitelistedValidator, rhs: Crescent_Liquidstaking_V1beta1_WhitelistedValidator) -> Bool {
    if lhs.validatorAddress != rhs.validatorAddress {return false}
    if lhs.targetWeight != rhs.targetWeight {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidstaking_V1beta1_LiquidValidator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LiquidValidator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "operator_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.operatorAddress) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.operatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.operatorAddress, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_LiquidValidator, rhs: Crescent_Liquidstaking_V1beta1_LiquidValidator) -> Bool {
    if lhs.operatorAddress != rhs.operatorAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidstaking_V1beta1_LiquidValidatorState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".LiquidValidatorState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "operator_address"),
    2: .same(proto: "weight"),
    3: .same(proto: "status"),
    4: .standard(proto: "del_shares"),
    5: .standard(proto: "liquid_tokens"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.operatorAddress) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.weight) }()
      case 3: try { try decoder.decodeSingularEnumField(value: &self.status) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.delShares) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.liquidTokens) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.operatorAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.operatorAddress, fieldNumber: 1)
    }
    if !self.weight.isEmpty {
      try visitor.visitSingularStringField(value: self.weight, fieldNumber: 2)
    }
    if self.status != .unspecified {
      try visitor.visitSingularEnumField(value: self.status, fieldNumber: 3)
    }
    if !self.delShares.isEmpty {
      try visitor.visitSingularStringField(value: self.delShares, fieldNumber: 4)
    }
    if !self.liquidTokens.isEmpty {
      try visitor.visitSingularStringField(value: self.liquidTokens, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_LiquidValidatorState, rhs: Crescent_Liquidstaking_V1beta1_LiquidValidatorState) -> Bool {
    if lhs.operatorAddress != rhs.operatorAddress {return false}
    if lhs.weight != rhs.weight {return false}
    if lhs.status != rhs.status {return false}
    if lhs.delShares != rhs.delShares {return false}
    if lhs.liquidTokens != rhs.liquidTokens {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidstaking_V1beta1_NetAmountState: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".NetAmountState"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "mint_rate"),
    2: .standard(proto: "btoken_total_supply"),
    3: .standard(proto: "net_amount"),
    4: .standard(proto: "total_del_shares"),
    5: .standard(proto: "total_liquid_tokens"),
    6: .standard(proto: "total_remaining_rewards"),
    7: .standard(proto: "total_unbonding_balance"),
    8: .standard(proto: "proxy_acc_balance"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.mintRate) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.btokenTotalSupply) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.netAmount) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.totalDelShares) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.totalLiquidTokens) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.totalRemainingRewards) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.totalUnbondingBalance) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self.proxyAccBalance) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.mintRate.isEmpty {
      try visitor.visitSingularStringField(value: self.mintRate, fieldNumber: 1)
    }
    if !self.btokenTotalSupply.isEmpty {
      try visitor.visitSingularStringField(value: self.btokenTotalSupply, fieldNumber: 2)
    }
    if !self.netAmount.isEmpty {
      try visitor.visitSingularStringField(value: self.netAmount, fieldNumber: 3)
    }
    if !self.totalDelShares.isEmpty {
      try visitor.visitSingularStringField(value: self.totalDelShares, fieldNumber: 4)
    }
    if !self.totalLiquidTokens.isEmpty {
      try visitor.visitSingularStringField(value: self.totalLiquidTokens, fieldNumber: 5)
    }
    if !self.totalRemainingRewards.isEmpty {
      try visitor.visitSingularStringField(value: self.totalRemainingRewards, fieldNumber: 6)
    }
    if !self.totalUnbondingBalance.isEmpty {
      try visitor.visitSingularStringField(value: self.totalUnbondingBalance, fieldNumber: 7)
    }
    if !self.proxyAccBalance.isEmpty {
      try visitor.visitSingularStringField(value: self.proxyAccBalance, fieldNumber: 8)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_NetAmountState, rhs: Crescent_Liquidstaking_V1beta1_NetAmountState) -> Bool {
    if lhs.mintRate != rhs.mintRate {return false}
    if lhs.btokenTotalSupply != rhs.btokenTotalSupply {return false}
    if lhs.netAmount != rhs.netAmount {return false}
    if lhs.totalDelShares != rhs.totalDelShares {return false}
    if lhs.totalLiquidTokens != rhs.totalLiquidTokens {return false}
    if lhs.totalRemainingRewards != rhs.totalRemainingRewards {return false}
    if lhs.totalUnbondingBalance != rhs.totalUnbondingBalance {return false}
    if lhs.proxyAccBalance != rhs.proxyAccBalance {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Crescent_Liquidstaking_V1beta1_VotingPower: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".VotingPower"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "voter"),
    2: .standard(proto: "staking_voting_power"),
    3: .standard(proto: "liquid_staking_voting_power"),
    4: .standard(proto: "validator_voting_power"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.voter) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.stakingVotingPower) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.liquidStakingVotingPower) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.validatorVotingPower) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.voter.isEmpty {
      try visitor.visitSingularStringField(value: self.voter, fieldNumber: 1)
    }
    if !self.stakingVotingPower.isEmpty {
      try visitor.visitSingularStringField(value: self.stakingVotingPower, fieldNumber: 2)
    }
    if !self.liquidStakingVotingPower.isEmpty {
      try visitor.visitSingularStringField(value: self.liquidStakingVotingPower, fieldNumber: 3)
    }
    if !self.validatorVotingPower.isEmpty {
      try visitor.visitSingularStringField(value: self.validatorVotingPower, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Crescent_Liquidstaking_V1beta1_VotingPower, rhs: Crescent_Liquidstaking_V1beta1_VotingPower) -> Bool {
    if lhs.voter != rhs.voter {return false}
    if lhs.stakingVotingPower != rhs.stakingVotingPower {return false}
    if lhs.liquidStakingVotingPower != rhs.liquidStakingVotingPower {return false}
    if lhs.validatorVotingPower != rhs.validatorVotingPower {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
