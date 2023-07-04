// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: archway/rewards/v1/events.proto
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

/// ContractMetadataSetEvent is emitted when the contract metadata is created or
/// updated.
struct Archway_Rewards_V1_ContractMetadataSetEvent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address defines the contract address.
  var contractAddress: String = String()

  /// metadata defines the new contract metadata state.
  var metadata: Archway_Rewards_V1_ContractMetadata {
    get {return _metadata ?? Archway_Rewards_V1_ContractMetadata()}
    set {_metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return self._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {self._metadata = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _metadata: Archway_Rewards_V1_ContractMetadata? = nil
}

/// ContractRewardCalculationEvent is emitted when the contract reward is
/// calculated.
struct Archway_Rewards_V1_ContractRewardCalculationEvent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address defines the contract address.
  var contractAddress: String = String()

  /// gas_consumed defines the total gas consumption by all WASM operations
  /// within one transaction.
  var gasConsumed: UInt64 = 0

  /// inflation_rewards defines the inflation rewards portions of the rewards.
  var inflationRewards: Cosmos_Base_V1beta1_Coin {
    get {return _inflationRewards ?? Cosmos_Base_V1beta1_Coin()}
    set {_inflationRewards = newValue}
  }
  /// Returns true if `inflationRewards` has been explicitly set.
  var hasInflationRewards: Bool {return self._inflationRewards != nil}
  /// Clears the value of `inflationRewards`. Subsequent reads from it will return its default value.
  mutating func clearInflationRewards() {self._inflationRewards = nil}

  /// fee_rebate_rewards defines the fee rebate rewards portions of the rewards.
  var feeRebateRewards: [Cosmos_Base_V1beta1_Coin] = []

  /// metadata defines the contract metadata (if set).
  var metadata: Archway_Rewards_V1_ContractMetadata {
    get {return _metadata ?? Archway_Rewards_V1_ContractMetadata()}
    set {_metadata = newValue}
  }
  /// Returns true if `metadata` has been explicitly set.
  var hasMetadata: Bool {return self._metadata != nil}
  /// Clears the value of `metadata`. Subsequent reads from it will return its default value.
  mutating func clearMetadata() {self._metadata = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _inflationRewards: Cosmos_Base_V1beta1_Coin? = nil
  fileprivate var _metadata: Archway_Rewards_V1_ContractMetadata? = nil
}

/// RewardsWithdrawEvent is emitted when credited rewards for a specific
/// rewards_address are distributed. Event could be triggered by a transaction
/// (via CLI for example) or by a contract via WASM bindings.
struct Archway_Rewards_V1_RewardsWithdrawEvent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// rewards_address defines the rewards address rewards are distributed to.
  var rewardAddress: String = String()

  /// rewards defines the total rewards being distributed.
  var rewards: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// MinConsensusFeeSetEvent is emitted when the minimum consensus fee is updated.
struct Archway_Rewards_V1_MinConsensusFeeSetEvent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// fee defines the updated minimum gas unit price.
  var fee: Cosmos_Base_V1beta1_DecCoin {
    get {return _fee ?? Cosmos_Base_V1beta1_DecCoin()}
    set {_fee = newValue}
  }
  /// Returns true if `fee` has been explicitly set.
  var hasFee: Bool {return self._fee != nil}
  /// Clears the value of `fee`. Subsequent reads from it will return its default value.
  mutating func clearFee() {self._fee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _fee: Cosmos_Base_V1beta1_DecCoin? = nil
}

/// ContractFlatFeeSetEvent is emitted when the contract flat fee is updated
struct Archway_Rewards_V1_ContractFlatFeeSetEvent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// contract_address defines the bech32 address of the contract for which the
  /// flat fee is set
  var contractAddress: String = String()

  /// flat_fee defines the amount that has been set as the minimum fee for the
  /// contract
  var flatFee: Cosmos_Base_V1beta1_Coin {
    get {return _flatFee ?? Cosmos_Base_V1beta1_Coin()}
    set {_flatFee = newValue}
  }
  /// Returns true if `flatFee` has been explicitly set.
  var hasFlatFee: Bool {return self._flatFee != nil}
  /// Clears the value of `flatFee`. Subsequent reads from it will return its default value.
  mutating func clearFlatFee() {self._flatFee = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _flatFee: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Archway_Rewards_V1_ContractMetadataSetEvent: @unchecked Sendable {}
extension Archway_Rewards_V1_ContractRewardCalculationEvent: @unchecked Sendable {}
extension Archway_Rewards_V1_RewardsWithdrawEvent: @unchecked Sendable {}
extension Archway_Rewards_V1_MinConsensusFeeSetEvent: @unchecked Sendable {}
extension Archway_Rewards_V1_ContractFlatFeeSetEvent: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "archway.rewards.v1"

extension Archway_Rewards_V1_ContractMetadataSetEvent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractMetadataSetEvent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .same(proto: "metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._metadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    try { if let v = self._metadata {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_ContractMetadataSetEvent, rhs: Archway_Rewards_V1_ContractMetadataSetEvent) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs._metadata != rhs._metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Rewards_V1_ContractRewardCalculationEvent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractRewardCalculationEvent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "gas_consumed"),
    3: .standard(proto: "inflation_rewards"),
    4: .standard(proto: "fee_rebate_rewards"),
    5: .same(proto: "metadata"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularUInt64Field(value: &self.gasConsumed) }()
      case 3: try { try decoder.decodeSingularMessageField(value: &self._inflationRewards) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.feeRebateRewards) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._metadata) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    if self.gasConsumed != 0 {
      try visitor.visitSingularUInt64Field(value: self.gasConsumed, fieldNumber: 2)
    }
    try { if let v = self._inflationRewards {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    } }()
    if !self.feeRebateRewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.feeRebateRewards, fieldNumber: 4)
    }
    try { if let v = self._metadata {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_ContractRewardCalculationEvent, rhs: Archway_Rewards_V1_ContractRewardCalculationEvent) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs.gasConsumed != rhs.gasConsumed {return false}
    if lhs._inflationRewards != rhs._inflationRewards {return false}
    if lhs.feeRebateRewards != rhs.feeRebateRewards {return false}
    if lhs._metadata != rhs._metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Rewards_V1_RewardsWithdrawEvent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardsWithdrawEvent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "reward_address"),
    2: .same(proto: "rewards"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.rewardAddress) }()
      case 2: try { try decoder.decodeRepeatedMessageField(value: &self.rewards) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.rewardAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardAddress, fieldNumber: 1)
    }
    if !self.rewards.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewards, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_RewardsWithdrawEvent, rhs: Archway_Rewards_V1_RewardsWithdrawEvent) -> Bool {
    if lhs.rewardAddress != rhs.rewardAddress {return false}
    if lhs.rewards != rhs.rewards {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Rewards_V1_MinConsensusFeeSetEvent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".MinConsensusFeeSetEvent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "fee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._fee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._fee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_MinConsensusFeeSetEvent, rhs: Archway_Rewards_V1_MinConsensusFeeSetEvent) -> Bool {
    if lhs._fee != rhs._fee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Archway_Rewards_V1_ContractFlatFeeSetEvent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ContractFlatFeeSetEvent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "contract_address"),
    2: .standard(proto: "flat_fee"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.contractAddress) }()
      case 2: try { try decoder.decodeSingularMessageField(value: &self._flatFee) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.contractAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.contractAddress, fieldNumber: 1)
    }
    try { if let v = self._flatFee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Archway_Rewards_V1_ContractFlatFeeSetEvent, rhs: Archway_Rewards_V1_ContractFlatFeeSetEvent) -> Bool {
    if lhs.contractAddress != rhs.contractAddress {return false}
    if lhs._flatFee != rhs._flatFee {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}