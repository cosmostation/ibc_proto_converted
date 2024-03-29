// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: irismod/farm/farm.proto
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

struct Irismod_Farm_FarmPool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var name: String = String()

  var creator: String = String()

  var description_p: String = String()

  var startHeight: Int64 = 0

  var endHeight: Int64 = 0

  var lastHeightDistrRewards: Int64 = 0

  var editable: Bool = false

  var totalLptLocked: Cosmos_Base_V1beta1_Coin {
    get {return _totalLptLocked ?? Cosmos_Base_V1beta1_Coin()}
    set {_totalLptLocked = newValue}
  }
  /// Returns true if `totalLptLocked` has been explicitly set.
  var hasTotalLptLocked: Bool {return self._totalLptLocked != nil}
  /// Clears the value of `totalLptLocked`. Subsequent reads from it will return its default value.
  mutating func clearTotalLptLocked() {self._totalLptLocked = nil}

  var rules: [Irismod_Farm_RewardRule] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _totalLptLocked: Cosmos_Base_V1beta1_Coin? = nil
}

struct Irismod_Farm_RewardRule {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var reward: String = String()

  var totalReward: String = String()

  var remainingReward: String = String()

  var rewardPerBlock: String = String()

  var rewardPerShare: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Irismod_Farm_FarmInfo {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var poolName: String = String()

  var address: String = String()

  var locked: String = String()

  var rewardDebt: [Cosmos_Base_V1beta1_Coin] = []

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Irismod_Farm_Params {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var createPoolFee: Cosmos_Base_V1beta1_Coin {
    get {return _createPoolFee ?? Cosmos_Base_V1beta1_Coin()}
    set {_createPoolFee = newValue}
  }
  /// Returns true if `createPoolFee` has been explicitly set.
  var hasCreatePoolFee: Bool {return self._createPoolFee != nil}
  /// Clears the value of `createPoolFee`. Subsequent reads from it will return its default value.
  mutating func clearCreatePoolFee() {self._createPoolFee = nil}

  var maxRewardCategories: UInt32 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _createPoolFee: Cosmos_Base_V1beta1_Coin? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Irismod_Farm_FarmPool: @unchecked Sendable {}
extension Irismod_Farm_RewardRule: @unchecked Sendable {}
extension Irismod_Farm_FarmInfo: @unchecked Sendable {}
extension Irismod_Farm_Params: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.farm"

extension Irismod_Farm_FarmPool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FarmPool"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "creator"),
    3: .same(proto: "description"),
    4: .standard(proto: "start_height"),
    5: .standard(proto: "end_height"),
    6: .standard(proto: "last_height_distr_rewards"),
    7: .same(proto: "editable"),
    8: .standard(proto: "total_lpt_locked"),
    9: .same(proto: "rules"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.creator) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 4: try { try decoder.decodeSingularInt64Field(value: &self.startHeight) }()
      case 5: try { try decoder.decodeSingularInt64Field(value: &self.endHeight) }()
      case 6: try { try decoder.decodeSingularInt64Field(value: &self.lastHeightDistrRewards) }()
      case 7: try { try decoder.decodeSingularBoolField(value: &self.editable) }()
      case 8: try { try decoder.decodeSingularMessageField(value: &self._totalLptLocked) }()
      case 9: try { try decoder.decodeRepeatedMessageField(value: &self.rules) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.creator.isEmpty {
      try visitor.visitSingularStringField(value: self.creator, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    if self.startHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.startHeight, fieldNumber: 4)
    }
    if self.endHeight != 0 {
      try visitor.visitSingularInt64Field(value: self.endHeight, fieldNumber: 5)
    }
    if self.lastHeightDistrRewards != 0 {
      try visitor.visitSingularInt64Field(value: self.lastHeightDistrRewards, fieldNumber: 6)
    }
    if self.editable != false {
      try visitor.visitSingularBoolField(value: self.editable, fieldNumber: 7)
    }
    try { if let v = self._totalLptLocked {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 8)
    } }()
    if !self.rules.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rules, fieldNumber: 9)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Farm_FarmPool, rhs: Irismod_Farm_FarmPool) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.creator != rhs.creator {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.startHeight != rhs.startHeight {return false}
    if lhs.endHeight != rhs.endHeight {return false}
    if lhs.lastHeightDistrRewards != rhs.lastHeightDistrRewards {return false}
    if lhs.editable != rhs.editable {return false}
    if lhs._totalLptLocked != rhs._totalLptLocked {return false}
    if lhs.rules != rhs.rules {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Farm_RewardRule: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".RewardRule"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "reward"),
    2: .standard(proto: "total_reward"),
    3: .standard(proto: "remaining_reward"),
    4: .standard(proto: "reward_per_block"),
    5: .standard(proto: "reward_per_share"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.reward) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.totalReward) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.remainingReward) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.rewardPerBlock) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.rewardPerShare) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.reward.isEmpty {
      try visitor.visitSingularStringField(value: self.reward, fieldNumber: 1)
    }
    if !self.totalReward.isEmpty {
      try visitor.visitSingularStringField(value: self.totalReward, fieldNumber: 2)
    }
    if !self.remainingReward.isEmpty {
      try visitor.visitSingularStringField(value: self.remainingReward, fieldNumber: 3)
    }
    if !self.rewardPerBlock.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardPerBlock, fieldNumber: 4)
    }
    if !self.rewardPerShare.isEmpty {
      try visitor.visitSingularStringField(value: self.rewardPerShare, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Farm_RewardRule, rhs: Irismod_Farm_RewardRule) -> Bool {
    if lhs.reward != rhs.reward {return false}
    if lhs.totalReward != rhs.totalReward {return false}
    if lhs.remainingReward != rhs.remainingReward {return false}
    if lhs.rewardPerBlock != rhs.rewardPerBlock {return false}
    if lhs.rewardPerShare != rhs.rewardPerShare {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Farm_FarmInfo: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".FarmInfo"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "pool_name"),
    2: .same(proto: "address"),
    3: .same(proto: "locked"),
    4: .standard(proto: "reward_debt"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.poolName) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.address) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.locked) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.rewardDebt) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.poolName.isEmpty {
      try visitor.visitSingularStringField(value: self.poolName, fieldNumber: 1)
    }
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 2)
    }
    if !self.locked.isEmpty {
      try visitor.visitSingularStringField(value: self.locked, fieldNumber: 3)
    }
    if !self.rewardDebt.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.rewardDebt, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Farm_FarmInfo, rhs: Irismod_Farm_FarmInfo) -> Bool {
    if lhs.poolName != rhs.poolName {return false}
    if lhs.address != rhs.address {return false}
    if lhs.locked != rhs.locked {return false}
    if lhs.rewardDebt != rhs.rewardDebt {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Farm_Params: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Params"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "create_pool_fee"),
    2: .standard(proto: "max_reward_categories"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._createPoolFee) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.maxRewardCategories) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._createPoolFee {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if self.maxRewardCategories != 0 {
      try visitor.visitSingularUInt32Field(value: self.maxRewardCategories, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Farm_Params, rhs: Irismod_Farm_Params) -> Bool {
    if lhs._createPoolFee != rhs._createPoolFee {return false}
    if lhs.maxRewardCategories != rhs.maxRewardCategories {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
